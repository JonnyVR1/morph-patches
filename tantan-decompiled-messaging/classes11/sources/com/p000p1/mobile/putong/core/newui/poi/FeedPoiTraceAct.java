package com.p000p1.mobile.putong.core.newui.poi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import l.f6c0;
import l.u4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class FeedPoiTraceAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public View f5135c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f5136d;

    /* JADX INFO: renamed from: e */
    public String f5137e = "FeedPoiTraceAct";

    /* JADX INFO: renamed from: f */
    public FeedPoiTraceFrag f5138f;

    /* JADX INFO: renamed from: g */
    public String f5139g;

    /* JADX INFO: renamed from: h */
    public String f5140h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V1 */
    private void m7329V1() {
        this.f5139g = getIntent().getStringExtra("key_from");
        this.f5140h = getIntent().getStringExtra("key_target_moment");
    }

    /* JADX INFO: renamed from: X1 */
    private void m7330X1() {
        FragmentManager supportFragmentManager = ((Act) this).act.getSupportFragmentManager();
        FeedPoiTraceFrag feedPoiTraceFragI0 = supportFragmentManager.i0(this.f5137e);
        this.f5138f = feedPoiTraceFragI0;
        if (feedPoiTraceFragI0 == null) {
            this.f5138f = new FeedPoiTraceFrag();
            Bundle bundle = new Bundle();
            bundle.putString("key_from", this.f5139g);
            bundle.putString("key_target_moment", this.f5140h);
            this.f5138f.setArguments(bundle);
        }
        k kVarM = supportFragmentManager.m();
        kVarM.t(u4c0.y4, this.f5138f, this.f5137e);
        kVarM.j();
        supportFragmentManager.e0();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.G8, viewGroup, false);
        this.f5135c = viewInflate;
        this.f5136d = (FrameLayout) viewInflate.findViewById(u4c0.y4);
        m7330X1();
        return this.f5135c;
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        m7329V1();
    }

    public void initSubscription() {
        super.initSubscription();
    }

    public String pageId() {
        return "p_poi_nearby_card";
    }
}
