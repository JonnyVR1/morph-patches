package p006l;

import android.text.TextUtils;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public final class cj90 {

    /* JADX INFO: renamed from: a */
    public static final b<String> f9676a = b.b();

    /* JADX INFO: renamed from: a */
    public static c<String> m13459a() {
        return f9676a;
    }

    /* JADX INFO: renamed from: b */
    public static void m13460b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f9676a.onNext(str);
    }
}
