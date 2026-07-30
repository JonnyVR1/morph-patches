package com.p000p1.mobile.putong.core.newui.main;

import android.os.Bundle;
import com.p1.mobile.putong.core.app.AutoReleaseVideoFrag;
import com.tantanapp.common.utils.NullChecker;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NewMainContextFrag extends AutoReleaseVideoFrag {

    /* JADX INFO: renamed from: A */
    public boolean f3227A = false;

    /* JADX INFO: renamed from: z */
    public C0260a.v f3228z;

    /* JADX INFO: renamed from: O4 */
    public C0260a.v m4009O4() {
        if (this.f3228z == null && NullChecker.a(act()) && (act() instanceof NewMainAct)) {
            this.f3228z = act().m3868U5();
        }
        return this.f3228z;
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m4010P4(Bundle bundle) {
        onHiddenChanged(false);
    }

    /* JADX INFO: renamed from: Q4 */
    public void m4011Q4() {
        creates(new e30() { // from class: l.z030
            public final void call(Object obj) {
                this.f23310a.m4010P4((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R4 */
    public void m4012R4() {
        mo4013S4();
        this.f3227A = true;
    }

    /* JADX INFO: renamed from: S4 */
    public void mo4013S4() {
    }

    /* JADX INFO: renamed from: T4 */
    public final void m4014T4() {
        this.f3227A = false;
    }

    /* JADX INFO: renamed from: U4 */
    public void m4015U4() {
        if (this.f3227A) {
            m4014T4();
        } else {
            mo4013S4();
        }
    }
}
