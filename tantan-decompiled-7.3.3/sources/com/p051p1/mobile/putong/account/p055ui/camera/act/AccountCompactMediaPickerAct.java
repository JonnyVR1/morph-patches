package com.p051p1.mobile.putong.account.p055ui.camera.act;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0428k;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.p055ui.camera.AccountVideoRecordFrag;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.C19376pj;
import p153l.C21348xj;
import p153l.bnl0;
import p153l.cbc0;
import p153l.l51;
import p153l.pf60;
import p153l.v7c0;
import p153l.wcc0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class AccountCompactMediaPickerAct extends MediaPickerBaseAct {

    /* JADX INFO: renamed from: l */
    public FrameLayout f17395l;

    /* JADX INFO: renamed from: m */
    public View f17396m;

    /* JADX INFO: renamed from: n */
    public boolean f17397n;

    /* JADX INFO: renamed from: o */
    public AccountVideoRecordFrag f17398o;

    public AccountCompactMediaPickerAct() {
        this.mIfInNewUi1ShouldUseThemNewUI2 = true;
        creates(new y20() { // from class: l.wj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189404a.m29792e2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m29790c2(Context context, int i, MusicContent musicContent, boolean z, boolean z2, String str) {
        Intent intent = new Intent(context, (Class<?>) AccountCompactMediaPickerAct.class);
        intent.putExtra("extra_image_count", i);
        intent.putExtra("extra_has_video", z);
        intent.putExtra("extra_is_add_image", z2);
        intent.putExtra("extra_music_content", (Serializable) musicContent);
        intent.putExtra("extra_from", str);
        if (NullChecker.m82486a(musicContent)) {
            intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        }
        return intent;
    }

    /* JADX INFO: renamed from: d2 */
    private void m29791d2() {
        if (l51.m152918x() || l51.m152917w()) {
            bnl0.m105556g0(this.f17396m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public void m29792e2(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
        if (NullChecker.m82486a(fragmentManager().m2555h0(wcc0.f188451k))) {
            return;
        }
        this.f17398o = new AccountVideoRecordFrag();
        m29795h2();
        m29791d2();
        C19376pj.m172465c().m172477m(null);
    }

    /* JADX INFO: renamed from: g2 */
    private void m29793g2(PutongFrag putongFrag) {
        AbstractC0428k abstractC0428kM2568m = getSupportFragmentManager().m2568m();
        abstractC0428kM2568m.m2813t(wcc0.f188451k, putongFrag, putongFrag.getClass().getSimpleName());
        abstractC0428kM2568m.mo2709j();
    }

    /* JADX INFO: renamed from: b2 */
    public View m29794b2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C21348xj.m211184b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        if (this.f17397n) {
            overridePendingTransition(v7c0.f182749b, v7c0.f182751d);
        }
    }

    /* JADX INFO: renamed from: h2 */
    public final void m29795h2() {
        boolean booleanExtra = act().getIntent().getBooleanExtra("extra_has_video", true);
        boolean booleanExtra2 = act().getIntent().getBooleanExtra("extra_is_add_image", false);
        String stringExtra = act().getIntent().getStringExtra("extra_from");
        boolean booleanExtra3 = act().getIntent().getBooleanExtra("extra_show_only_photo", false);
        int intExtra = act().getIntent().getIntExtra("extra_image_count", 1);
        ArrayList arrayList = (ArrayList) act().getIntent().getSerializableExtra("extra_selected_images");
        MusicContent musicContent = (MusicContent) act().getIntent().getSerializableExtra("extra_music_content");
        String stringExtra2 = act().getIntent().getStringExtra("extra_selected_folder_path");
        this.f17397n = act().getIntent().getBooleanExtra("extra_need_animate", false);
        AccountVideoRecordFrag.m29787M4(this.f17398o, musicContent, booleanExtra, booleanExtra2, intExtra, stringExtra, booleanExtra3, arrayList, stringExtra2);
        m29793g2(this.f17398o);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        getWindow().addFlags(128);
        View viewM29794b2 = m29794b2(layoutInflater, viewGroup);
        this.f17396m = viewM29794b2;
        return viewM29794b2;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (NullChecker.m82486a(this.f17398o)) {
            this.f17398o.m29788o();
        } else {
            lambda$debugItems$19();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_signup_camera";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        if (NullChecker.m82486a(this.pageHelper)) {
            this.pageHelper.m152781p(new pf60("camerapage_gender", TEnum.equals(AccountModule.f16756c.m29324c1().gender, "male") ? "male" : "female"));
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void setTheme() {
        if (getAppTheme().mo134833m()) {
            setCustomAppTheme();
            return;
        }
        if (shouldSwitchToGradientColoredStatusBar()) {
            setUI1Theme();
        }
        if (NullChecker.m82486a(getSupportActionBar()) && "Lenovo".equals(Build.BRAND) && "Lenovo K10e70".equals(Build.MODEL)) {
            getSupportActionBar().mo102169B(cbc0.f80758a);
        }
    }
}
