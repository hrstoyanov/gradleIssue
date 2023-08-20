
# Issue 26147 reproduction


Adding module level annotion like:
```
@JStacheConfig(
        pathing = @JStachePath(prefix = "templates/", suffix = ".tpl"),
        contentType = Html.class,
        charset = "UTF-8")
module issue{
    requires transitive io.jstach.jstachio;
}
```
appears to mess up Gradle annnotation processor. The exact problem has been identified here:
https://github.com/jstachio/jstachio/issues/223#issuecomment-1685321532

If you remove the module level annotation, Gradle is fine (see a few commits prior for the code without module leve annotation).
This seeem to be an issue with Gradle 8.3, 8.2.1 and possibly older versions!


