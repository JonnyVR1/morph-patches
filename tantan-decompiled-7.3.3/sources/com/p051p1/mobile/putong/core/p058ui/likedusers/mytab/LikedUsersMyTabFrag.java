package com.p051p1.mobile.putong.core.p058ui.likedusers.mytab;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.data.LikedUser;
import p153l.cir;
import p153l.fir;
import p153l.gwl;
import p153l.ohr;
import p153l.pcj;

/* JADX INFO: loaded from: classes3.dex */
public class LikedUsersMyTabFrag extends PutongFrag implements pcj<String>, gwl {

    /* JADX INFO: renamed from: A */
    public fir f30860A;

    /* JADX INFO: renamed from: B */
    public ohr f30861B;

    /* JADX INFO: renamed from: z */
    public cir f30862z;

    @Override // p153l.gwl
    /* JADX INFO: renamed from: G2 */
    public String mo47962G2(boolean z) {
        return "p_navigation,ilike_module";
    }

    @Override // p153l.pcj, java.util.concurrent.Callable
    /* JADX INFO: renamed from: M4, reason: merged with bridge method [inline-methods] */
    public String call() {
        return "我喜欢";
    }

    /* JADX INFO: renamed from: N4 */
    public void m47999N4() {
        this.f30862z = new cir(this);
        fir firVar = new fir(this);
        this.f30860A = firVar;
        this.f30862z.mo52715C(firVar);
    }

    /* JADX INFO: renamed from: O4 */
    public ohr m48000O4() {
        if (this.f30861B == null) {
            this.f30861B = new ohr(m48002Q4());
        }
        return this.f30861B;
    }

    /* JADX INFO: renamed from: P4 */
    public final fir m48001P4() {
        if (this.f30860A == null) {
            m47999N4();
        }
        return this.f30860A;
    }

    /* JADX INFO: renamed from: Q4 */
    public cir m48002Q4() {
        if (this.f30862z == null) {
            m47999N4();
        }
        return this.f30862z;
    }

    @Override // p153l.gwl
    /* JADX INFO: renamed from: Z0 */
    public void mo47969Z0() {
        cir cirVar = this.f30862z;
        cirVar.f81975b = null;
        cirVar.f81976c = null;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        m48002Q4().mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m48002Q4().mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m48001P4().inflateView(layoutInflater, viewGroup);
    }

    @Override // p153l.gwl
    public void notifyDataSetChanged() {
        m48000O4().notifyDataSetChanged();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (m48002Q4().m109931H0(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m48002Q4().destroy();
        m48001P4().destroy();
    }

    @Override // p153l.gwl
    /* JADX INFO: renamed from: w0 */
    public void mo47971w0(boolean z, String str, LikedUser likedUser) {
        if (!(z && TextUtils.isEmpty(str)) && TextUtils.isEmpty(str)) {
            this.f30862z.m109933J0(likedUser);
        }
    }
}
