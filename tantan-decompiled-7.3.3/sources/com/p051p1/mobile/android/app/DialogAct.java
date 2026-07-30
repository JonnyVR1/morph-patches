package com.p051p1.mobile.android.app;

import androidx.annotation.NonNull;
import p137rx.subjects.C22508b;
import p153l.j1e;
import p153l.kcg0;
import p153l.psd0;
import p153l.ux0;
import p153l.uxj0;
import p153l.y20;
import p153l.zld;

/* JADX INFO: loaded from: classes8.dex */
public class DialogAct extends Act {

    /* JADX INFO: renamed from: d */
    public static final C22508b<uxj0> f16237d = C22508b.m222767b();

    /* JADX INFO: renamed from: c */
    public kcg0 f16238c = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public /* synthetic */ void m21571F1(uxj0 uxj0Var) {
        m21572G1();
    }

    /* JADX INFO: renamed from: G1 */
    public void m21572G1() {
        super.lambda$debugItems$19();
        j1e.m143118i().m143126l(null, true);
        psd0.m173633z(this.f16238c);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        f16237d.onNext(uxj0.f181467a);
    }

    @Override // com.p051p1.mobile.android.app.Act
    @NonNull
    public ux0 getAppTheme() {
        return new zld(this);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f16238c = f16237d.first().subscribe(new y20() { // from class: l.x0e
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191884a.m21571F1((uxj0) obj);
            }
        });
    }
}
