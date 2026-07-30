package com.p000p1.mobile.putong.core.api;

import android.os.SystemClock;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0183w;
import java.util.LinkedList;
import java.util.Queue;
import l.e30;
import l.roj0;
import l.utc0;
import l.v9j;
import l.w9j;
import p006l.ax6;
import p006l.la20;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.w */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0183w extends ax6 {

    /* JADX INFO: renamed from: R */
    public static Queue<Long> f4124R = new LinkedList();

    public C0183w(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: d3 */
    public c<roj0> m6804d3(final String str) {
        return this.f8580Q.now(new la20(new v9j() { // from class: l.d6a
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/pokes/" + str)).m(utc0.create(Network.JSON, "{\"state\":\"poked\"}")).b();
            }
        }).map(new w9j() { // from class: l.e6a
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).compose(C0154a.m3182T2())).doOnNext(new e30() { // from class: l.f6a
            public final void call(Object obj) {
                C0183w.f4124R.add(Long.valueOf(SystemClock.elapsedRealtime()));
            }
        });
    }
}
