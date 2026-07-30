package com.p046p1.mobile.putong.core.newui.intltribe;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.putong.core.p053ui.AutoReleaseVideoAct;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import p149l.f6c0;
import p149l.u4c0;
import p149l.vwb;

/* JADX INFO: loaded from: classes11.dex */
public class IntlTribeSwipeAct extends AutoReleaseVideoAct {

    /* JADX INFO: renamed from: c */
    public View f24339c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f24340d;

    /* JADX INFO: renamed from: e */
    public String f24341e = "IntlTribeSwipeAct";

    /* JADX INFO: renamed from: f */
    public IntlTribeSlideFrag f24342f;

    /* JADX INFO: renamed from: g */
    public String f24343g;

    /* JADX INFO: renamed from: h */
    public String f24344h;

    /* JADX INFO: renamed from: i */
    public String f24345i;

    /* JADX INFO: renamed from: j */
    public String f24346j;

    /* JADX INFO: renamed from: k */
    public String f24347k;

    /* JADX INFO: renamed from: X1 */
    public static Intent m39525X1(Context context, String str, String str2, String str3, String str4, String str5) {
        Intent intent = new Intent(context, (Class<?>) IntlTribeSwipeAct.class);
        intent.putExtra("groupCategory", str);
        intent.putExtra("subType", str2);
        intent.putExtra("title", str3);
        intent.putExtra("icon", str4);
        intent.putExtra("bigCoverUrl", str5);
        intent.setFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    private void m39526Y1() {
        if (NullChecker.m81303a(getIntent())) {
            this.f24343g = getIntent().getStringExtra("groupCategory");
            this.f24344h = getIntent().getStringExtra("subType");
            this.f24345i = getIntent().getStringExtra("title");
            this.f24346j = getIntent().getStringExtra("icon");
            this.f24347k = getIntent().getStringExtra("bigCoverUrl");
        }
    }

    /* JADX INFO: renamed from: Z1 */
    private void m39527Z1() {
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        IntlTribeSlideFrag intlTribeSlideFrag = (IntlTribeSlideFrag) supportFragmentManager.m2557i0(this.f24341e);
        this.f24342f = intlTribeSlideFrag;
        if (intlTribeSlideFrag == null) {
            this.f24342f = new IntlTribeSlideFrag();
            Bundle bundle = new Bundle();
            bundle.putString("groupCategory", this.f24343g);
            bundle.putString("subType", this.f24344h);
            bundle.putString("title", this.f24345i);
            bundle.putString("icon", this.f24346j);
            bundle.putString("bigCoverUrl", this.f24347k);
            this.f24342f.setArguments(bundle);
        }
        AbstractC0427k abstractC0427kM2567m = supportFragmentManager.m2567m();
        abstractC0427kM2567m.m2812t(u4c0.f174563y4, this.f24342f, this.f24341e);
        abstractC0427kM2567m.mo2708j();
        supportFragmentManager.m2545e0();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95608V5, viewGroup, false);
        this.f24339c = viewInflate;
        this.f24340d = (FrameLayout) viewInflate.findViewById(u4c0.f174563y4);
        m39527Z1();
        return this.f24339c;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        m39526Y1();
        this.pageHelper.m109040p(vwb.m200311Y("intl_tribe_source_name", this.f24344h));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_intl_tribe_swipe_view";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        super.setTransparentStatusBar();
        setLightStatusBar(1024);
    }
}
