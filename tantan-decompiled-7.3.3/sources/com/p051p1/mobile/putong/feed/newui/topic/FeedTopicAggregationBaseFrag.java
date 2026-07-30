package com.p051p1.mobile.putong.feed.newui.topic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.NullChecker;
import p153l.l4g0;
import p153l.n8i;
import p153l.x8i;

/* JADX INFO: loaded from: classes13.dex */
public class FeedTopicAggregationBaseFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public n8i f43895A;

    /* JADX INFO: renamed from: z */
    public x8i f43896z;

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: J4 */
    public l4g0 mo30636J4() {
        return NullChecker.m82486a(m67089N4().m209718S()) ? m67089N4().m209718S() : super.mo30636J4();
    }

    /* JADX INFO: renamed from: M4 */
    public void mo67088M4() {
        this.f43896z = new x8i(this);
        n8i n8iVar = new n8i(this);
        this.f43895A = n8iVar;
        n8iVar.mo52715C(this.f43896z);
    }

    /* JADX INFO: renamed from: N4 */
    public x8i m67089N4() {
        if (this.f43896z == null) {
            mo67088M4();
        }
        return this.f43896z;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        if (this.f43895A == null) {
            mo67088M4();
        }
        this.f43895A.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f43896z.mo127413E(bundle);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = this.f43896z.inflateView(layoutInflater, viewGroup);
        this.f43896z.m209715P();
        return viewInflateView;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        this.f43895A.m161936n0();
        super.mo21593n4(bundle);
    }

    /* JADX INFO: renamed from: o */
    public void mo67090o() {
        act().lambda$debugItems$19();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f43896z.m209716Q();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f43896z.m209721Y(true);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_topic_recommend";
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo21604y4() {
    }
}
