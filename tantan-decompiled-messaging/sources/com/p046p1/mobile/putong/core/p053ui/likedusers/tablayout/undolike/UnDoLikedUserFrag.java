package com.p046p1.mobile.putong.core.p053ui.likedusers.tablayout.undolike;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import p149l.bkj0;
import p149l.e30;
import p149l.ijj0;
import p149l.mkd0;
import p149l.xu10;
import p149l.zjj0;

/* JADX INFO: loaded from: classes12.dex */
public class UnDoLikedUserFrag extends PutongFrag implements xu10 {

    /* JADX INFO: renamed from: A */
    public bkj0 f30016A;

    /* JADX INFO: renamed from: B */
    public ijj0 f30017B;

    /* JADX INFO: renamed from: z */
    public zjj0 f30018z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R4 */
    public /* synthetic */ void m46827R4(Boolean bool) {
        if (bool.booleanValue()) {
            mo29638J4().m109036l();
        } else {
            mo29638J4().m109035k();
        }
    }

    /* JADX INFO: renamed from: N4 */
    public void m46828N4() {
        this.f30018z = new zjj0(this);
        bkj0 bkj0Var = new bkj0(this);
        this.f30016A = bkj0Var;
        this.f30018z.mo51532C(bkj0Var);
    }

    /* JADX INFO: renamed from: O4 */
    public ijj0 m46829O4() {
        if (this.f30017B == null) {
            this.f30017B = new ijj0(m46831Q4());
        }
        return this.f30017B;
    }

    /* JADX INFO: renamed from: P4 */
    public final bkj0 m46830P4() {
        if (this.f30016A == null) {
            m46828N4();
        }
        return this.f30016A;
    }

    /* JADX INFO: renamed from: Q4 */
    public zjj0 m46831Q4() {
        if (this.f30018z == null) {
            m46828N4();
        }
        return this.f30018z;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        m46831Q4().mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m46831Q4().mo39470a0();
        m29640L4().subscribe(mkd0.m154955G(new e30() { // from class: l.jjj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118298a.m46827R4((Boolean) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
    }

    @Override // p149l.xu10
    /* JADX INFO: renamed from: i */
    public boolean mo46787i(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m46830P4().inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CoreModule.f17545c.f19663m0.m31047S5();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m46831Q4().destroy();
        m46830P4().destroy();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f30018z.m219113C0(false);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_who_i_disliked";
    }
}
