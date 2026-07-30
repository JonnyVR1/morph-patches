package com.p046p1.mobile.putong.core.newui.explore;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import p149l.f6c0;
import p149l.lqa;
import p149l.u4c0;
import p149l.vwb;

/* JADX INFO: loaded from: classes11.dex */
public class HomeExploreAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public View f21386c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f21387d;

    /* JADX INFO: renamed from: e */
    public String f21388e = "HomeExploreAct";

    /* JADX INFO: renamed from: f */
    public HomeExploreFrag f21389f;

    /* JADX INFO: renamed from: g */
    public String f21390g;

    /* JADX INFO: renamed from: V1 */
    public static Intent m36349V1(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) HomeExploreAct.class);
        intent.putExtra("key_from", str);
        intent.putExtra("key_explore_type", str2);
        intent.setFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        return intent;
    }

    /* JADX INFO: renamed from: X1 */
    private void m36350X1() {
        if (NullChecker.m81303a(getIntent())) {
            this.f21390g = getIntent().getStringExtra("key_explore_type");
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m36351Y1() {
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        HomeExploreFrag homeExploreFrag = (HomeExploreFrag) supportFragmentManager.m2557i0(this.f21388e);
        this.f21389f = homeExploreFrag;
        if (homeExploreFrag == null) {
            this.f21389f = new HomeExploreFrag();
            Bundle bundle = new Bundle();
            bundle.putString("key_explore_type", this.f21390g);
            this.f21389f.setArguments(bundle);
        }
        AbstractC0427k abstractC0427kM2567m = supportFragmentManager.m2567m();
        abstractC0427kM2567m.m2812t(u4c0.f174563y4, this.f21389f, this.f21388e);
        abstractC0427kM2567m.mo2708j();
        supportFragmentManager.m2545e0();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95653Y2, viewGroup, false);
        this.f21386c = viewInflate;
        this.f21387d = (FrameLayout) viewInflate.findViewById(u4c0.f174563y4);
        m36351Y1();
        return this.f21386c;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        m36350X1();
        this.pageHelper.m109040p(vwb.m200311Y("tantanx_scene_name", this.f21390g), vwb.m200311Y("is_test_field", lqa.m150985w() ? "is_test_field_y" : "is_test_field_n"));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_tantanx_card";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
    }
}
