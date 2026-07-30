package com.p000p1.mobile.putong.feed.newui.topic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import p007l.i7i;
import p007l.y6i;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedTopicAggregationBaseFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public y6i f4508A;

    /* JADX INFO: renamed from: z */
    public i7i f4509z;

    /* JADX INFO: renamed from: J4 */
    public cwf0 m7052J4() {
        return NullChecker.a(m7054N4().m10805S()) ? m7054N4().m10805S() : super.J4();
    }

    /* JADX INFO: renamed from: M4 */
    public void mo7053M4() {
        this.f4509z = new i7i(this);
        y6i y6iVar = new y6i(this);
        this.f4508A = y6iVar;
        y6iVar.C(this.f4509z);
    }

    /* JADX INFO: renamed from: N4 */
    public i7i m7054N4() {
        if (this.f4509z == null) {
            mo7053M4();
        }
        return this.f4509z;
    }

    /* JADX INFO: renamed from: f4 */
    public void m7055f4() {
        super.f4();
        if (this.f4508A == null) {
            mo7053M4();
        }
        this.f4508A.mo16956a0();
    }

    /* JADX INFO: renamed from: g4 */
    public void m7056g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f4509z.mo10795E(bundle);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = this.f4509z.inflateView(layoutInflater, viewGroup);
        this.f4509z.m10802P();
        return viewInflateView;
    }

    /* JADX INFO: renamed from: n4 */
    public void m7057n4(Bundle bundle) {
        this.f4508A.m16959n0();
        super/*com.p1.mobile.android.app.Frag*/.n4(bundle);
    }

    /* JADX INFO: renamed from: o */
    public void mo7058o() {
        act().finish();
    }

    public void onDestroy() {
        super/*com.p1.mobile.android.app.Frag*/.onDestroy();
        this.f4509z.m10803Q();
    }

    public void onResume() {
        super/*com.p1.mobile.android.app.Frag*/.onResume();
        this.f4509z.m10811Y(true);
    }

    public String pageId() {
        return "p_topic_recommend";
    }

    /* JADX INFO: renamed from: y4 */
    public void mo7059y4() {
    }
}
