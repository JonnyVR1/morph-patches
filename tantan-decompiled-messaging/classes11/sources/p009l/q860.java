package p009l;

import com.p1.mobile.putong.data.DbLinks;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class q860<T> {

    /* JADX INFO: renamed from: a */
    public final List<T> f19068a;

    /* JADX INFO: renamed from: b */
    public final DbLinks f19069b;

    public q860(List<T> list, DbLinks dbLinks) {
        this.f19068a = list;
        this.f19069b = dbLinks;
    }

    /* JADX INFO: renamed from: a */
    public static <T> q860<T> m20832a() {
        return new q860<>(new ArrayList(0), null);
    }

    /* JADX INFO: renamed from: b */
    public static <T> q860<T> m20833b() {
        return new q860<>(new ArrayList(0), DbLinks.new_());
    }

    /* JADX INFO: renamed from: c */
    public boolean m20834c() {
        DbLinks dbLinks = this.f19069b;
        return dbLinks == null || dbLinks.links.next != null;
    }

    /* JADX INFO: renamed from: d */
    public int m20835d() {
        DbLinks dbLinks = this.f19069b;
        if (dbLinks == null) {
            return 0;
        }
        return dbLinks.total;
    }
}
