package p149l;

import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
public class f7c {
    /* JADX INFO: renamed from: a */
    public static long m119784a(Date date) {
        return (date.getTime() / 1000) + 2082844800;
    }

    /* JADX INFO: renamed from: b */
    public static Date m119785b(long j) {
        return new Date((j - 2082844800) * 1000);
    }
}
