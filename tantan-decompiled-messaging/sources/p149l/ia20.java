package p149l;

import com.p046p1.mobile.putong.data.Envelope;
import com.tantanapp.common.data.JsonAdapter;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class ia20 {
    /* JADX INFO: renamed from: a */
    public static C22306c<Envelope> m135117a(v9j<stc0> v9jVar) {
        return new la20(v9jVar).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: b */
    public static C22306c<Envelope> m135118b(v9j<stc0> v9jVar, int i) {
        return new la20(v9jVar, i).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: c */
    public static <T> C22306c<T> m135119c(v9j<stc0> v9jVar, JsonAdapter<T> jsonAdapter) {
        return (C22306c<T>) new ka20(v9jVar, jsonAdapter).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: d */
    public static C22306c<Envelope> m135120d(v9j<stc0> v9jVar, boolean z) {
        return new la20(v9jVar, z).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: e */
    public static C22306c<Envelope> m135121e(v9j<stc0> v9jVar) {
        return new la20(v9jVar).compose(mkd0.m154965Q());
    }

    /* JADX INFO: renamed from: f */
    public static <T> C22306c<T> m135122f(v9j<stc0> v9jVar, JsonAdapter<T> jsonAdapter) {
        return (C22306c<T>) new ka20(v9jVar, jsonAdapter).compose(mkd0.m154965Q());
    }

    /* JADX INFO: renamed from: g */
    public static C22306c<Envelope> m135123g(v9j<stc0> v9jVar, boolean z) {
        return new la20(v9jVar, z).compose(mkd0.m154965Q());
    }
}
