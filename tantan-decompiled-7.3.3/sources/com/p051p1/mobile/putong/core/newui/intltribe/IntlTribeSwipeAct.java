package com.p051p1.mobile.putong.core.newui.intltribe;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.putong.core.p058ui.AutoReleaseVideoAct;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import p153l.adc0;
import p153l.jyb;
import p153l.kec0;

/* JADX INFO: loaded from: classes11.dex */
public class IntlTribeSwipeAct extends AutoReleaseVideoAct {

    /* JADX INFO: renamed from: c */
    public View f25081c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f25082d;

    /* JADX INFO: renamed from: e */
    public String f25083e = "IntlTribeSwipeAct";

    /* JADX INFO: renamed from: f */
    public IntlTribeSlideFrag f25084f;

    /* JADX INFO: renamed from: g */
    public String f25085g;

    /* JADX INFO: renamed from: h */
    public String f25086h;

    /* JADX INFO: renamed from: i */
    public String f25087i;

    /* JADX INFO: renamed from: j */
    public String f25088j;

    /* JADX INFO: renamed from: k */
    public String f25089k;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m40528Y1(Context context, String str, String str2, String str3, String str4, String str5) {
        Intent intent = new Intent(context, (Class<?>) IntlTribeSwipeAct.class);
        intent.putExtra("groupCategory", str);
        intent.putExtra("subType", str2);
        intent.putExtra("title", str3);
        intent.putExtra("icon", str4);
        intent.putExtra("bigCoverUrl", str5);
        intent.setFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    private void m40529Z1() {
        if (NullChecker.m82486a(getIntent())) {
            this.f25085g = getIntent().getStringExtra("groupCategory");
            this.f25086h = getIntent().getStringExtra("subType");
            this.f25087i = getIntent().getStringExtra("title");
            this.f25088j = getIntent().getStringExtra("icon");
            this.f25089k = getIntent().getStringExtra("bigCoverUrl");
        }
    }

    /* JADX INFO: renamed from: a2 */
    private void m40530a2() {
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        IntlTribeSlideFrag intlTribeSlideFrag = (IntlTribeSlideFrag) supportFragmentManager.m2558i0(this.f25083e);
        this.f25084f = intlTribeSlideFrag;
        if (intlTribeSlideFrag == null) {
            this.f25084f = new IntlTribeSlideFrag();
            Bundle bundle = new Bundle();
            bundle.putString("groupCategory", this.f25085g);
            bundle.putString("subType", this.f25086h);
            bundle.putString("title", this.f25087i);
            bundle.putString("icon", this.f25088j);
            bundle.putString("bigCoverUrl", this.f25089k);
            this.f25084f.setArguments(bundle);
        }
        AbstractC0428k abstractC0428kM2568m = supportFragmentManager.m2568m();
        abstractC0428kM2568m.m2813t(adc0.f69809A4, this.f25084f, this.f25083e);
        abstractC0428kM2568m.mo2709j();
        supportFragmentManager.m2546e0();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125678W5, viewGroup, false);
        this.f25081c = viewInflate;
        this.f25082d = (FrameLayout) viewInflate.findViewById(adc0.f69809A4);
        m40530a2();
        return this.f25081c;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        m40529Z1();
        this.pageHelper.m152781p(jyb.m147494Y("intl_tribe_source_name", this.f25086h));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_intl_tribe_swipe_view";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        super.setTransparentStatusBar();
        setLightStatusBar(1024);
    }
}
