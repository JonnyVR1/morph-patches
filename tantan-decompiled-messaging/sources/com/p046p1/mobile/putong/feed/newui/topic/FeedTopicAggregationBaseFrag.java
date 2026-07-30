package com.p046p1.mobile.putong.feed.newui.topic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.NullChecker;
import p149l.cwf0;
import p149l.i7i;
import p149l.y6i;

/* JADX INFO: loaded from: classes12.dex */
public class FeedTopicAggregationBaseFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public y6i f43047A;

    /* JADX INFO: renamed from: z */
    public i7i f43048z;

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: J4 */
    public cwf0 mo29638J4() {
        return NullChecker.m81303a(m65906N4().m134885S()) ? m65906N4().m134885S() : super.mo29638J4();
    }

    /* JADX INFO: renamed from: M4 */
    public void mo65905M4() {
        this.f43048z = new i7i(this);
        y6i y6iVar = new y6i(this);
        this.f43047A = y6iVar;
        y6iVar.mo51532C(this.f43048z);
    }

    /* JADX INFO: renamed from: N4 */
    public i7i m65906N4() {
        if (this.f43048z == null) {
            mo65905M4();
        }
        return this.f43048z;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        if (this.f43047A == null) {
            mo65905M4();
        }
        this.f43047A.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f43048z.mo134875E(bundle);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = this.f43048z.inflateView(layoutInflater, viewGroup);
        this.f43048z.m134882P();
        return viewInflateView;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        this.f43047A.m213139n0();
        super.mo20594n4(bundle);
    }

    /* JADX INFO: renamed from: o */
    public void mo65907o() {
        act().lambda$debugItems$19();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f43048z.m134883Q();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f43048z.m134891Y(true);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_topic_recommend";
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo20605y4() {
    }
}
