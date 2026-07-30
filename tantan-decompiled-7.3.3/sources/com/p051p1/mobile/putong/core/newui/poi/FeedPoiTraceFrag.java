package com.p051p1.mobile.putong.core.newui.poi;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.C8145d;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.tantanapp.common.utils.NullChecker;
import p153l.dsh;
import p153l.fsh;
import p153l.o1j0;
import p153l.ttl;

/* JADX INFO: loaded from: classes11.dex */
public class FeedPoiTraceFrag extends PutongFrag implements ttl {

    /* JADX INFO: renamed from: A */
    public fsh f27105A;

    /* JADX INFO: renamed from: B */
    public String f27106B;

    /* JADX INFO: renamed from: C */
    public String f27107C;

    /* JADX INFO: renamed from: z */
    public dsh f27108z;

    /* JADX INFO: renamed from: M4 */
    private void m44130M4() {
        this.f27108z = new dsh(this);
        fsh fshVar = new fsh(this);
        this.f27105A = fshVar;
        this.f27108z.mo52715C(fshVar);
    }

    /* JADX INFO: renamed from: P4 */
    private void m44131P4() {
        this.f27106B = getArguments().getString("key_from");
        this.f27107C = getArguments().getString("key_target_moment");
    }

    @Override // p153l.ttl
    /* JADX INFO: renamed from: A */
    public void mo44132A(SwipeDirection swipeDirection) {
        fsh fshVar = this.f27105A;
        if (fshVar == null || fshVar.m127186i() == null) {
            return;
        }
        this.f27105A.m127186i().m44147A(swipeDirection);
    }

    @Override // p153l.ttl
    /* JADX INFO: renamed from: M2 */
    public void mo44133M2(View view, SwipeDirection swipeDirection) {
        fsh fshVar = this.f27105A;
        if (fshVar == null) {
            return;
        }
        fshVar.m127190p(view, swipeDirection);
    }

    /* JADX INFO: renamed from: N4 */
    public void m44134N4() {
        dsh dshVar = this.f27108z;
        if (dshVar == null) {
            return;
        }
        dshVar.m117751p0();
    }

    /* JADX INFO: renamed from: O4 */
    public fsh m44135O4() {
        return this.f27105A;
    }

    /* JADX INFO: renamed from: Q4 */
    public void m44136Q4() {
        if ("p_poi_detail".equals(this.f27106B)) {
            o1j0.m165651y("附近人数据获取失败");
        } else {
            m44138S4(false);
        }
        this.f27105A.m127183d();
    }

    /* JADX INFO: renamed from: R4 */
    public void m44137R4() {
        if ("p_poi_detail".equals(this.f27106B)) {
            this.f27105A.m127184e();
        } else {
            m44138S4(true);
            this.f27105A.m127183d();
        }
    }

    /* JADX INFO: renamed from: S4 */
    public final void m44138S4(boolean z) {
        act().startActivity(CoreModule.m30932N().mo61496Rd(act(), "p_poi_nearby_card", this.f27107C, z));
    }

    @Override // p153l.ttl
    /* JADX INFO: renamed from: a2 */
    public void mo44139a2(C8145d c8145d, Throwable th) {
        HomeStatisticsHelper.m37690A(c8145d, th);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        m44131P4();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m44130M4();
        this.f27108z.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f27105A.m127192r();
    }

    @Override // p153l.ttl
    /* JADX INFO: renamed from: h0 */
    public void mo44140h0() {
        dsh dshVar = this.f27108z;
        if (dshVar == null) {
            return;
        }
        dshVar.m117750o0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f27105A.inflateView(layoutInflater, viewGroup);
    }

    @Override // p153l.ttl
    /* JADX INFO: renamed from: k2 */
    public void mo44141k2(C8145d c8145d, String str) {
        HomeStatisticsHelper.m37691B(c8145d, str);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f27108z.m117749H0(i, i2, intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (NullChecker.m82486a(this.f27105A)) {
            this.f27105A.m127182c();
        }
    }

    @Override // p153l.ttl
    /* JADX INFO: renamed from: y */
    public void mo44142y() {
        fsh fshVar = this.f27105A;
        if (fshVar == null || fshVar.m127186i() == null) {
            return;
        }
        this.f27105A.m127186i().m39800w();
    }
}
