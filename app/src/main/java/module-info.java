import io.jstach.jstache.JStacheConfig;
import io.jstach.jstache.JStachePath;
import io.jstach.jstachio.escapers.Html;

@JStacheConfig(
        pathing = @JStachePath(prefix = "templates/", suffix = ".tpl"),
        contentType = Html.class,
        charset = "UTF-8")
module issue{
    requires transitive io.jstach.jstachio;
//    exports com.peruncs.pcml.templates;
}
