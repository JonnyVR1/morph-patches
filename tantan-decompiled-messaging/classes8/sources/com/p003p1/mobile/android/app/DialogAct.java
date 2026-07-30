package com.p003p1.mobile.android.app;

import androidx.annotation.NonNull;
import l.c4g0;
import l.e30;
import l.roj0;
import p007l.mkd0;
import p007l.nx0;
import p007l.tkd;
import p007l.vzd;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class DialogAct extends Act {

    /* JADX INFO: renamed from: d */
    public static final b<roj0> f1217d = b.b();

    /* JADX INFO: renamed from: c */
    public c4g0 f1218c = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E1 */
    public /* synthetic */ void m843E1(roj0 roj0Var) {
        m844F1();
    }

    /* JADX INFO: renamed from: F1 */
    public void m844F1() {
        super.lambda$debugItems$19();
        vzd.m11301i().m11309l(null, true);
        mkd0.m9911z(this.f1218c);
    }

    @Override // com.p003p1.mobile.android.app.Act
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        f1217d.onNext(roj0.a);
    }

    @Override // com.p003p1.mobile.android.app.Act
    @NonNull
    public nx0 getAppTheme() {
        return new tkd(this);
    }

    @Override // com.p003p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f1218c = f1217d.first().subscribe(new e30() { // from class: l.jzd
            public final void call(Object obj) {
                this.f3031a.m843E1((roj0) obj);
            }
        });
    }
}
