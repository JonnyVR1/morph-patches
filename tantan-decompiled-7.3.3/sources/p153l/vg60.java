package p153l;

import com.p051p1.mobile.putong.data.DbLinks;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class vg60<T> {

    /* JADX INFO: renamed from: a */
    public final List<T> f184001a;

    /* JADX INFO: renamed from: b */
    public final DbLinks f184002b;

    public vg60(List<T> list, DbLinks dbLinks) {
        this.f184001a = list;
        this.f184002b = dbLinks;
    }

    /* JADX INFO: renamed from: a */
    public static <T> vg60<T> m201219a() {
        return new vg60<>(new ArrayList(0), null);
    }

    /* JADX INFO: renamed from: b */
    public static <T> vg60<T> m201220b() {
        return new vg60<>(new ArrayList(0), DbLinks.new_());
    }

    /* JADX INFO: renamed from: c */
    public boolean m201221c() {
        DbLinks dbLinks = this.f184002b;
        return dbLinks == null || dbLinks.links.next != null;
    }

    /* JADX INFO: renamed from: d */
    public int m201222d() {
        DbLinks dbLinks = this.f184002b;
        if (dbLinks == null) {
            return 0;
        }
        return dbLinks.total;
    }
}
