package p153l;

import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
public class l8c {
    /* JADX INFO: renamed from: a */
    public static long m153168a(Date date) {
        return (date.getTime() / 1000) + 2082844800;
    }

    /* JADX INFO: renamed from: b */
    public static Date m153169b(long j) {
        return new Date((j - 2082844800) * 1000);
    }
}
