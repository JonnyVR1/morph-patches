package com.p051p1.mobile.putong.core.newui.explore;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import p153l.adc0;
import p153l.jyb;
import p153l.kec0;
import p153l.xra;

/* JADX INFO: loaded from: classes11.dex */
public class HomeExploreAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public View f22128c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f22129d;

    /* JADX INFO: renamed from: e */
    public String f22130e = "HomeExploreAct";

    /* JADX INFO: renamed from: f */
    public HomeExploreFrag f22131f;

    /* JADX INFO: renamed from: g */
    public String f22132g;

    /* JADX INFO: renamed from: X1 */
    public static Intent m37352X1(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) HomeExploreAct.class);
        intent.putExtra("key_from", str);
        intent.putExtra("key_explore_type", str2);
        intent.setFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    private void m37353Y1() {
        if (NullChecker.m82486a(getIntent())) {
            this.f22132g = getIntent().getStringExtra("key_explore_type");
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m37354Z1() {
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        HomeExploreFrag homeExploreFrag = (HomeExploreFrag) supportFragmentManager.m2558i0(this.f22130e);
        this.f22131f = homeExploreFrag;
        if (homeExploreFrag == null) {
            this.f22131f = new HomeExploreFrag();
            Bundle bundle = new Bundle();
            bundle.putString("key_explore_type", this.f22132g);
            this.f22131f.setArguments(bundle);
        }
        AbstractC0428k abstractC0428kM2568m = supportFragmentManager.m2568m();
        abstractC0428kM2568m.m2813t(adc0.f69809A4, this.f22131f, this.f22130e);
        abstractC0428kM2568m.mo2709j();
        supportFragmentManager.m2546e0();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125707Y2, viewGroup, false);
        this.f22128c = viewInflate;
        this.f22129d = (FrameLayout) viewInflate.findViewById(adc0.f69809A4);
        m37354Z1();
        return this.f22128c;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        m37353Y1();
        this.pageHelper.m152781p(jyb.m147494Y("tantanx_scene_name", this.f22132g), jyb.m147494Y("is_test_field", xra.m212804w() ? "is_test_field_y" : "is_test_field_n"));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_tantanx_card";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
    }
}
