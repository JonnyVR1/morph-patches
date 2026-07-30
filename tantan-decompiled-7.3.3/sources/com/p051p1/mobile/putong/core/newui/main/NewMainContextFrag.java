package com.p051p1.mobile.putong.core.newui.main;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.app.AutoReleaseVideoFrag;
import com.tantanapp.common.utils.NullChecker;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class NewMainContextFrag extends AutoReleaseVideoFrag {

    /* JADX INFO: renamed from: A */
    public boolean f25191A = false;

    /* JADX INFO: renamed from: z */
    public C8247a.v f25192z;

    /* JADX INFO: renamed from: O4 */
    public C8247a.v m40939O4() {
        if (this.f25192z == null && NullChecker.m82486a(act()) && (act() instanceof NewMainAct)) {
            this.f25192z = ((NewMainAct) act()).m40803Y5();
        }
        return this.f25192z;
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m40940P4(Bundle bundle) {
        onHiddenChanged(false);
    }

    /* JADX INFO: renamed from: Q4 */
    public void m40941Q4() {
        creates(new y20() { // from class: l.l930
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130539a.m40940P4((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R4 */
    public void m40942R4() {
        mo40943S4();
        this.f25191A = true;
    }

    /* JADX INFO: renamed from: S4 */
    public void mo40943S4() {
    }

    /* JADX INFO: renamed from: T4 */
    public final void m40944T4() {
        this.f25191A = false;
    }

    /* JADX INFO: renamed from: U4 */
    public void m40945U4() {
        if (this.f25191A) {
            m40944T4();
        } else {
            mo40943S4();
        }
    }
}
