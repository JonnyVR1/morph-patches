package p149l;

import com.p046p1.mobile.putong.data.DbLinks;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class q860<T> {

    /* JADX INFO: renamed from: a */
    public final List<T> f153135a;

    /* JADX INFO: renamed from: b */
    public final DbLinks f153136b;

    public q860(List<T> list, DbLinks dbLinks) {
        this.f153135a = list;
        this.f153136b = dbLinks;
    }

    /* JADX INFO: renamed from: a */
    public static <T> q860<T> m173341a() {
        return new q860<>(new ArrayList(0), null);
    }

    /* JADX INFO: renamed from: b */
    public static <T> q860<T> m173342b() {
        return new q860<>(new ArrayList(0), DbLinks.new_());
    }

    /* JADX INFO: renamed from: c */
    public boolean m173343c() {
        DbLinks dbLinks = this.f153136b;
        return dbLinks == null || dbLinks.links.next != null;
    }

    /* JADX INFO: renamed from: d */
    public int m173344d() {
        DbLinks dbLinks = this.f153136b;
        if (dbLinks == null) {
            return 0;
        }
        return dbLinks.total;
    }
}
