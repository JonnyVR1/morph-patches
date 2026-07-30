package com.p046p1.mobile.putong.core.api;

import android.os.SystemClock;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4757w;
import java.util.LinkedList;
import java.util.Queue;
import p133rx.C22306c;
import p149l.ax6;
import p149l.e30;
import p149l.la20;
import p149l.roj0;
import p149l.v9j;
import p149l.w9j;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.w */
/* JADX INFO: loaded from: classes9.dex */
public class C4757w extends ax6 {

    /* JADX INFO: renamed from: R */
    public static Queue<Long> f20135R = new LinkedList();

    public C4757w(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: d3 */
    public C22306c<roj0> m34867d3(final String str) {
        return this.f72126Q.now(new la20(new v9j() { // from class: l.d6a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/pokes/" + str)).m185894m(utc0.create(Network.JSON, "{\"state\":\"poked\"}")).m185883b();
            }
        }).map(new w9j() { // from class: l.e6a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).compose(C4728a.m31252T2())).doOnNext(new e30() { // from class: l.f6a
            @Override // p149l.e30
            public final void call(Object obj) {
                C4757w.f20135R.add(Long.valueOf(SystemClock.elapsedRealtime()));
            }
        });
    }
}
