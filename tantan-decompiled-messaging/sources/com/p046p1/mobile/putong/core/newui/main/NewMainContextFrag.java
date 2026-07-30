package com.p046p1.mobile.putong.core.newui.main;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.app.AutoReleaseVideoFrag;
import com.tantanapp.common.utils.NullChecker;
import p149l.e30;

/* JADX INFO: loaded from: classes11.dex */
public class NewMainContextFrag extends AutoReleaseVideoFrag {

    /* JADX INFO: renamed from: A */
    public boolean f24449A = false;

    /* JADX INFO: renamed from: z */
    public C8096a.v f24450z;

    /* JADX INFO: renamed from: O4 */
    public C8096a.v m39932O4() {
        if (this.f24450z == null && NullChecker.m81303a(act()) && (act() instanceof NewMainAct)) {
            this.f24450z = ((NewMainAct) act()).m39792U5();
        }
        return this.f24450z;
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m39933P4(Bundle bundle) {
        onHiddenChanged(false);
    }

    /* JADX INFO: renamed from: Q4 */
    public void m39934Q4() {
        creates(new e30() { // from class: l.z030
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200930a.m39933P4((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R4 */
    public void m39935R4() {
        mo39936S4();
        this.f24449A = true;
    }

    /* JADX INFO: renamed from: S4 */
    public void mo39936S4() {
    }

    /* JADX INFO: renamed from: T4 */
    public final void m39937T4() {
        this.f24449A = false;
    }

    /* JADX INFO: renamed from: U4 */
    public void m39938U4() {
        if (this.f24449A) {
            m39937T4();
        } else {
            mo39936S4();
        }
    }
}
