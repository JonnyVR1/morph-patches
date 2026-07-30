package com.p051p1.mobile.putong.core.p058ui.likedusers.tablayout.undolike;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import p153l.ctj0;
import p153l.etj0;
import p153l.f320;
import p153l.lsj0;
import p153l.psd0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class UnDoLikedUserFrag extends PutongFrag implements f320 {

    /* JADX INFO: renamed from: A */
    public etj0 f30864A;

    /* JADX INFO: renamed from: B */
    public lsj0 f30865B;

    /* JADX INFO: renamed from: z */
    public ctj0 f30866z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R4 */
    public /* synthetic */ void m48010R4(Boolean bool) {
        if (bool.booleanValue()) {
            mo30636J4().m152777l();
        } else {
            mo30636J4().m152776k();
        }
    }

    /* JADX INFO: renamed from: N4 */
    public void m48011N4() {
        this.f30866z = new ctj0(this);
        etj0 etj0Var = new etj0(this);
        this.f30864A = etj0Var;
        this.f30866z.mo52715C(etj0Var);
    }

    /* JADX INFO: renamed from: O4 */
    public lsj0 m48012O4() {
        if (this.f30865B == null) {
            this.f30865B = new lsj0(m48014Q4());
        }
        return this.f30865B;
    }

    /* JADX INFO: renamed from: P4 */
    public final etj0 m48013P4() {
        if (this.f30864A == null) {
            m48011N4();
        }
        return this.f30864A;
    }

    /* JADX INFO: renamed from: Q4 */
    public ctj0 m48014Q4() {
        if (this.f30866z == null) {
            m48011N4();
        }
        return this.f30866z;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        m48014Q4().mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m48014Q4().mo40473a0();
        m30638L4().subscribe(psd0.m173596G(new y20() { // from class: l.msj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138494a.m48010R4((Boolean) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
    }

    @Override // p153l.f320
    /* JADX INFO: renamed from: i */
    public boolean mo47970i(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m48013P4().inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CoreModule.f18264c.f20405m0.m32050S5();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m48014Q4().destroy();
        m48013P4().destroy();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f30866z.m112507C0(false);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_who_i_disliked";
    }
}
