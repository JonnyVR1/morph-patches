package com.p046p1.mobile.putong.core.newui.poi;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.C7994d;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.tantanapp.common.utils.NullChecker;
import p149l.frl;
import p149l.lsi0;
import p149l.oqh;
import p149l.qqh;

/* JADX INFO: loaded from: classes11.dex */
public class FeedPoiTraceFrag extends PutongFrag implements frl {

    /* JADX INFO: renamed from: A */
    public qqh f26363A;

    /* JADX INFO: renamed from: B */
    public String f26364B;

    /* JADX INFO: renamed from: C */
    public String f26365C;

    /* JADX INFO: renamed from: z */
    public oqh f26366z;

    /* JADX INFO: renamed from: M4 */
    private void m43119M4() {
        this.f26366z = new oqh(this);
        qqh qqhVar = new qqh(this);
        this.f26363A = qqhVar;
        this.f26366z.mo51532C(qqhVar);
    }

    /* JADX INFO: renamed from: P4 */
    private void m43120P4() {
        this.f26364B = getArguments().getString("key_from");
        this.f26365C = getArguments().getString("key_target_moment");
    }

    @Override // p149l.frl
    /* JADX INFO: renamed from: A */
    public void mo43121A(SwipeDirection swipeDirection) {
        qqh qqhVar = this.f26363A;
        if (qqhVar == null || qqhVar.m175915i() == null) {
            return;
        }
        this.f26363A.m175915i().m43136A(swipeDirection);
    }

    @Override // p149l.frl
    /* JADX INFO: renamed from: M2 */
    public void mo43122M2(View view, SwipeDirection swipeDirection) {
        qqh qqhVar = this.f26363A;
        if (qqhVar == null) {
            return;
        }
        qqhVar.m175919p(view, swipeDirection);
    }

    /* JADX INFO: renamed from: N4 */
    public void m43123N4() {
        oqh oqhVar = this.f26366z;
        if (oqhVar == null) {
            return;
        }
        oqhVar.m165451p0();
    }

    /* JADX INFO: renamed from: O4 */
    public qqh m43124O4() {
        return this.f26363A;
    }

    /* JADX INFO: renamed from: Q4 */
    public void m43125Q4() {
        if ("p_poi_detail".equals(this.f26364B)) {
            lsi0.m151595y("附近人数据获取失败");
        } else {
            m43127S4(false);
        }
        this.f26363A.m175912d();
    }

    /* JADX INFO: renamed from: R4 */
    public void m43126R4() {
        if ("p_poi_detail".equals(this.f26364B)) {
            this.f26363A.m175913e();
        } else {
            m43127S4(true);
            this.f26363A.m175912d();
        }
    }

    /* JADX INFO: renamed from: S4 */
    public final void m43127S4(boolean z) {
        act().startActivity(CoreModule.m29934N().mo60312Rd(act(), "p_poi_nearby_card", this.f26365C, z));
    }

    @Override // p149l.frl
    /* JADX INFO: renamed from: a2 */
    public void mo43128a2(C7994d c7994d, Throwable th) {
        HomeStatisticsHelper.m36687A(c7994d, th);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        m43120P4();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m43119M4();
        this.f26366z.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f26363A.m175921r();
    }

    @Override // p149l.frl
    /* JADX INFO: renamed from: h0 */
    public void mo43129h0() {
        oqh oqhVar = this.f26366z;
        if (oqhVar == null) {
            return;
        }
        oqhVar.m165450o0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f26363A.inflateView(layoutInflater, viewGroup);
    }

    @Override // p149l.frl
    /* JADX INFO: renamed from: k2 */
    public void mo43130k2(C7994d c7994d, String str) {
        HomeStatisticsHelper.m36688B(c7994d, str);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f26366z.m165449H0(i, i2, intent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (NullChecker.m81303a(this.f26363A)) {
            this.f26363A.m175911c();
        }
    }

    @Override // p149l.frl
    /* JADX INFO: renamed from: y */
    public void mo43131y() {
        qqh qqhVar = this.f26363A;
        if (qqhVar == null || qqhVar.m175915i() == null) {
            return;
        }
        this.f26363A.m175915i().m38797w();
    }
}
