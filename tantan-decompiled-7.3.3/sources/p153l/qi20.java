package p153l;

import com.p051p1.mobile.putong.data.Envelope;
import com.tantanapp.common.data.JsonAdapter;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class qi20 {
    /* JADX INFO: renamed from: a */
    public static C22421c<Envelope> m176654a(pcj<x1d0> pcjVar) {
        return new ti20(pcjVar).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: b */
    public static C22421c<Envelope> m176655b(pcj<x1d0> pcjVar, int i) {
        return new ti20(pcjVar, i).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: c */
    public static <T> C22421c<T> m176656c(pcj<x1d0> pcjVar, JsonAdapter<T> jsonAdapter) {
        return (C22421c<T>) new si20(pcjVar, jsonAdapter).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: d */
    public static C22421c<Envelope> m176657d(pcj<x1d0> pcjVar, boolean z) {
        return new ti20(pcjVar, z).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: e */
    public static C22421c<Envelope> m176658e(pcj<x1d0> pcjVar) {
        return new ti20(pcjVar).compose(psd0.m173606Q());
    }

    /* JADX INFO: renamed from: f */
    public static <T> C22421c<T> m176659f(pcj<x1d0> pcjVar, JsonAdapter<T> jsonAdapter) {
        return (C22421c<T>) new si20(pcjVar, jsonAdapter).compose(psd0.m173606Q());
    }

    /* JADX INFO: renamed from: g */
    public static C22421c<Envelope> m176660g(pcj<x1d0> pcjVar, boolean z) {
        return new ti20(pcjVar, z).compose(psd0.m173606Q());
    }
}
