package com.p051p1.mobile.putong.core.newui.poi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.putong.app.PutongAct;
import p153l.adc0;
import p153l.kec0;

/* JADX INFO: loaded from: classes11.dex */
public class FeedPoiTraceAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public View f27099c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f27100d;

    /* JADX INFO: renamed from: e */
    public String f27101e = "FeedPoiTraceAct";

    /* JADX INFO: renamed from: f */
    public FeedPoiTraceFrag f27102f;

    /* JADX INFO: renamed from: g */
    public String f27103g;

    /* JADX INFO: renamed from: h */
    public String f27104h;

    /* JADX INFO: renamed from: X1 */
    private void m44128X1() {
        this.f27103g = getIntent().getStringExtra("key_from");
        this.f27104h = getIntent().getStringExtra("key_target_moment");
    }

    /* JADX INFO: renamed from: Y1 */
    private void m44129Y1() {
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        FeedPoiTraceFrag feedPoiTraceFrag = (FeedPoiTraceFrag) supportFragmentManager.m2558i0(this.f27101e);
        this.f27102f = feedPoiTraceFrag;
        if (feedPoiTraceFrag == null) {
            this.f27102f = new FeedPoiTraceFrag();
            Bundle bundle = new Bundle();
            bundle.putString("key_from", this.f27103g);
            bundle.putString("key_target_moment", this.f27104h);
            this.f27102f.setArguments(bundle);
        }
        AbstractC0428k abstractC0428kM2568m = supportFragmentManager.m2568m();
        abstractC0428kM2568m.m2813t(adc0.f69809A4, this.f27102f, this.f27101e);
        abstractC0428kM2568m.mo2709j();
        supportFragmentManager.m2546e0();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125537N8, viewGroup, false);
        this.f27099c = viewInflate;
        this.f27100d = (FrameLayout) viewInflate.findViewById(adc0.f69809A4);
        m44129Y1();
        return this.f27099c;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        m44128X1();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_poi_nearby_card";
    }
}
