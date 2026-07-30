package p006l;

import android.graphics.Bitmap;
import java.util.List;
import l.xaj0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public interface a3m {
    /* JADX INFO: renamed from: a */
    default c<xaj0<Boolean, List<String>, String>> m11714a(Bitmap bitmap) {
        return c.just(xaj0.a(Boolean.FALSE, (Object) null, ""));
    }

    /* JADX INFO: renamed from: b */
    default c<xaj0<Boolean, List<String>, String>> m11715b(String str) {
        return c.just(xaj0.a(Boolean.FALSE, (Object) null, ""));
    }

    /* JADX INFO: renamed from: c */
    default boolean m11716c() {
        return false;
    }
}
