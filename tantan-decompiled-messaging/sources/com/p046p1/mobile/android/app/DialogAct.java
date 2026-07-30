package com.p046p1.mobile.android.app;

import androidx.annotation.NonNull;
import p133rx.subjects.C22393b;
import p149l.c4g0;
import p149l.e30;
import p149l.mkd0;
import p149l.nx0;
import p149l.roj0;
import p149l.tkd;
import p149l.vzd;

/* JADX INFO: loaded from: classes8.dex */
public class DialogAct extends Act {

    /* JADX INFO: renamed from: d */
    public static final C22393b<roj0> f15518d = C22393b.m221521b();

    /* JADX INFO: renamed from: c */
    public c4g0 f15519c = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E1 */
    public /* synthetic */ void m20572E1(roj0 roj0Var) {
        m20573F1();
    }

    /* JADX INFO: renamed from: F1 */
    public void m20573F1() {
        super.lambda$debugItems$19();
        vzd.m200742i().m200750l(null, true);
        mkd0.m154992z(this.f15519c);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        f15518d.onNext(roj0.f160388a);
    }

    @Override // com.p046p1.mobile.android.app.Act
    @NonNull
    public nx0 getAppTheme() {
        return new tkd(this);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f15519c = f15518d.first().subscribe(new e30() { // from class: l.jzd
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120373a.m20572E1((roj0) obj);
            }
        });
    }
}
