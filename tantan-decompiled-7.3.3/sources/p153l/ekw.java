package p153l;

import java.util.TreeSet;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u0003R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0011"}, m88121d2 = {"Ll/ekw;", "", "<init>", "()V", "", "path", "a", "(Ljava/lang/String;)Ljava/lang/String;", "url", "", "c", "(Ljava/lang/String;)Z", "", "b", "Ljava/util/TreeSet;", "Ljava/util/TreeSet;", "containerWhite", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class ekw {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private TreeSet<String> containerWhite = new TreeSet<>();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m121084a(@Nullable String path) {
        if (path == null || path.length() == 0) {
            return "";
        }
        String strM126058d = fkw.m126058d(path);
        this.containerWhite.add(strM126058d);
        return strM126058d;
    }

    /* JADX INFO: renamed from: b */
    public final void m121085b() {
        this.containerWhite.clear();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m121086c(@Nullable String url) {
        if (url == null || url.length() == 0) {
            return false;
        }
        return this.containerWhite.contains(url) || fkw.INSTANCE.m126060c(url);
    }
}
