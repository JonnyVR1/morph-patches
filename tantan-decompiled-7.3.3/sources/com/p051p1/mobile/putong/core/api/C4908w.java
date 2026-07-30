package com.p051p1.mobile.putong.core.api;

import android.os.SystemClock;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4908w;
import java.util.LinkedList;
import java.util.Queue;
import p137rx.C22421c;
import p153l.dy6;
import p153l.pcj;
import p153l.qcj;
import p153l.ti20;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.w */
/* JADX INFO: loaded from: classes9.dex */
public class C4908w extends dy6 {

    /* JADX INFO: renamed from: R */
    public static Queue<Long> f20877R = new LinkedList();

    public C4908w(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: d3 */
    public C22421c<uxj0> m35870d3(final String str) {
        return this.f91137Q.now(new ti20(new pcj() { // from class: l.p7a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/pokes/" + str)).m209039m(z1d0.create(Network.JSON, "{\"state\":\"poked\"}")).m209028b();
            }
        }).map(new qcj() { // from class: l.q7a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).compose(C4879a.m32255T2())).doOnNext(new y20() { // from class: l.r7a
            @Override // p153l.y20
            public final void call(Object obj) {
                C4908w.f20877R.add(Long.valueOf(SystemClock.elapsedRealtime()));
            }
        });
    }
}
