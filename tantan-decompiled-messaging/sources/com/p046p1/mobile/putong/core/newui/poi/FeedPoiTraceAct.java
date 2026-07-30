package com.p046p1.mobile.putong.core.newui.poi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.putong.app.PutongAct;
import p149l.f6c0;
import p149l.u4c0;

/* JADX INFO: loaded from: classes11.dex */
public class FeedPoiTraceAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public View f26357c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f26358d;

    /* JADX INFO: renamed from: e */
    public String f26359e = "FeedPoiTraceAct";

    /* JADX INFO: renamed from: f */
    public FeedPoiTraceFrag f26360f;

    /* JADX INFO: renamed from: g */
    public String f26361g;

    /* JADX INFO: renamed from: h */
    public String f26362h;

    /* JADX INFO: renamed from: V1 */
    private void m43117V1() {
        this.f26361g = getIntent().getStringExtra("key_from");
        this.f26362h = getIntent().getStringExtra("key_target_moment");
    }

    /* JADX INFO: renamed from: X1 */
    private void m43118X1() {
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        FeedPoiTraceFrag feedPoiTraceFrag = (FeedPoiTraceFrag) supportFragmentManager.m2557i0(this.f26359e);
        this.f26360f = feedPoiTraceFrag;
        if (feedPoiTraceFrag == null) {
            this.f26360f = new FeedPoiTraceFrag();
            Bundle bundle = new Bundle();
            bundle.putString("key_from", this.f26361g);
            bundle.putString("key_target_moment", this.f26362h);
            this.f26360f.setArguments(bundle);
        }
        AbstractC0427k abstractC0427kM2567m = supportFragmentManager.m2567m();
        abstractC0427kM2567m.m2812t(u4c0.f174563y4, this.f26360f, this.f26359e);
        abstractC0427kM2567m.mo2708j();
        supportFragmentManager.m2545e0();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95371G8, viewGroup, false);
        this.f26357c = viewInflate;
        this.f26358d = (FrameLayout) viewInflate.findViewById(u4c0.f174563y4);
        m43118X1();
        return this.f26357c;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        m43117V1();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_poi_nearby_card";
    }
}
