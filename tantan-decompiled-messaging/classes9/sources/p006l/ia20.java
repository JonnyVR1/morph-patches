package p006l;

import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.data.JsonAdapter;
import l.mkd0;
import l.stc0;
import l.v9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ia20 {
    /* JADX INFO: renamed from: a */
    public static c<Envelope> m16567a(v9j<stc0> v9jVar) {
        return new la20(v9jVar).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: b */
    public static c<Envelope> m16568b(v9j<stc0> v9jVar, int i) {
        return new la20(v9jVar, i).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: c */
    public static <T> c<T> m16569c(v9j<stc0> v9jVar, JsonAdapter<T> jsonAdapter) {
        return new ka20(v9jVar, jsonAdapter).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: d */
    public static c<Envelope> m16570d(v9j<stc0> v9jVar, boolean z) {
        return new la20(v9jVar, z).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: e */
    public static c<Envelope> m16571e(v9j<stc0> v9jVar) {
        return new la20(v9jVar).compose(mkd0.Q());
    }

    /* JADX INFO: renamed from: f */
    public static <T> c<T> m16572f(v9j<stc0> v9jVar, JsonAdapter<T> jsonAdapter) {
        return new ka20(v9jVar, jsonAdapter).compose(mkd0.Q());
    }

    /* JADX INFO: renamed from: g */
    public static c<Envelope> m16573g(v9j<stc0> v9jVar, boolean z) {
        return new la20(v9jVar, z).compose(mkd0.Q());
    }
}
