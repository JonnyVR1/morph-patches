package p149l;

import android.text.TextUtils;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
public final class cj90 {

    /* JADX INFO: renamed from: a */
    public static final C22393b<String> f81157a = C22393b.m221521b();

    /* JADX INFO: renamed from: a */
    public static C22306c<String> m107129a() {
        return f81157a;
    }

    /* JADX INFO: renamed from: b */
    public static void m107130b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f81157a.onNext(str);
    }
}
