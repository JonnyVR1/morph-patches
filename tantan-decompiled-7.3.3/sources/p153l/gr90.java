package p153l;

import android.text.TextUtils;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public final class gr90 {

    /* JADX INFO: renamed from: a */
    public static final C22508b<String> f106015a = C22508b.m222767b();

    /* JADX INFO: renamed from: a */
    public static C22421c<String> m131535a() {
        return f106015a;
    }

    /* JADX INFO: renamed from: b */
    public static void m131536b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f106015a.onNext(str);
    }
}
