package com.p000p1.mobile.putong.core.newui.poi;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.C0158d;
import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.utils.NullChecker;
import l.lsi0;
import p009l.frl;
import p009l.oqh;
import p009l.qqh;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class FeedPoiTraceFrag extends PutongFrag implements frl {

    /* JADX INFO: renamed from: A */
    public qqh f5141A;

    /* JADX INFO: renamed from: B */
    public String f5142B;

    /* JADX INFO: renamed from: C */
    public String f5143C;

    /* JADX INFO: renamed from: z */
    public oqh f5144z;

    /* JADX INFO: renamed from: M4 */
    private void m7331M4() {
        this.f5144z = new oqh(this);
        qqh qqhVar = new qqh(this);
        this.f5141A = qqhVar;
        this.f5144z.C(qqhVar);
    }

    /* JADX INFO: renamed from: P4 */
    private void m7332P4() {
        this.f5142B = getArguments().getString("key_from");
        this.f5143C = getArguments().getString("key_target_moment");
    }

    @Override // p009l.frl
    /* JADX INFO: renamed from: A */
    public void mo7333A(SwipeDirection swipeDirection) {
        qqh qqhVar = this.f5141A;
        if (qqhVar == null || qqhVar.m21166i() == null) {
            return;
        }
        this.f5141A.m21166i().m7351A(swipeDirection);
    }

    @Override // p009l.frl
    /* JADX INFO: renamed from: M2 */
    public void mo7334M2(View view, SwipeDirection swipeDirection) {
        qqh qqhVar = this.f5141A;
        if (qqhVar == null) {
            return;
        }
        qqhVar.m21171p(view, swipeDirection);
    }

    /* JADX INFO: renamed from: N4 */
    public void m7335N4() {
        oqh oqhVar = this.f5144z;
        if (oqhVar == null) {
            return;
        }
        oqhVar.m20002p0();
    }

    /* JADX INFO: renamed from: O4 */
    public qqh m7336O4() {
        return this.f5141A;
    }

    /* JADX INFO: renamed from: Q4 */
    public void m7337Q4() {
        if ("p_poi_detail".equals(this.f5142B)) {
            lsi0.y("附近人数据获取失败");
        } else {
            m7339S4(false);
        }
        this.f5141A.m21163d();
    }

    /* JADX INFO: renamed from: R4 */
    public void m7338R4() {
        if ("p_poi_detail".equals(this.f5142B)) {
            this.f5141A.m21164e();
        } else {
            m7339S4(true);
            this.f5141A.m21163d();
        }
    }

    /* JADX INFO: renamed from: S4 */
    public final void m7339S4(boolean z) {
        act().startActivity(CoreModule.N().Rd(act(), "p_poi_nearby_card", this.f5143C, z));
    }

    @Override // p009l.frl
    /* JADX INFO: renamed from: a2 */
    public void mo7340a2(C0158d c0158d, Throwable th) {
        HomeStatisticsHelper.m636A(c0158d, th);
    }

    /* JADX INFO: renamed from: d4 */
    public void m7341d4() {
        super.d4();
        m7332P4();
    }

    /* JADX INFO: renamed from: f4 */
    public void m7342f4() {
        super.f4();
        m7331M4();
        this.f5144z.m20000a0();
    }

    /* JADX INFO: renamed from: g4 */
    public void m7343g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f5141A.m21173r();
    }

    @Override // p009l.frl
    /* JADX INFO: renamed from: h0 */
    public void mo7344h0() {
        oqh oqhVar = this.f5144z;
        if (oqhVar == null) {
            return;
        }
        oqhVar.m20001o0();
    }

    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f5141A.inflateView(layoutInflater, viewGroup);
    }

    @Override // p009l.frl
    /* JADX INFO: renamed from: k2 */
    public void mo7345k2(C0158d c0158d, String str) {
        HomeStatisticsHelper.m637B(c0158d, str);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
        this.f5144z.m19999H0(i, i2, intent);
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    public void onResume() {
        super/*com.p1.mobile.android.app.Frag*/.onResume();
        if (NullChecker.a(this.f5141A)) {
            this.f5141A.m21162c();
        }
    }

    @Override // p009l.frl
    /* JADX INFO: renamed from: y */
    public void mo7346y() {
        qqh qqhVar = this.f5141A;
        if (qqhVar == null || qqhVar.m21166i() == null) {
            return;
        }
        this.f5141A.m21166i().m2793w();
    }
}
