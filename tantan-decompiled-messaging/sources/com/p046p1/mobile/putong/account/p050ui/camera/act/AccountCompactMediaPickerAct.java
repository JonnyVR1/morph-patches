package com.p046p1.mobile.putong.account.p050ui.camera.act;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0427k;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.p050ui.camera.AccountVideoRecordFrag;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.C16178ck;
import p149l.C20443uj;
import p149l.e30;
import p149l.e51;
import p149l.j760;
import p149l.pzb0;
import p149l.q4c0;
import p149l.w2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountCompactMediaPickerAct extends MediaPickerBaseAct {

    /* JADX INFO: renamed from: l */
    public FrameLayout f16676l;

    /* JADX INFO: renamed from: m */
    public View f16677m;

    /* JADX INFO: renamed from: n */
    public boolean f16678n;

    /* JADX INFO: renamed from: o */
    public AccountVideoRecordFrag f16679o;

    public AccountCompactMediaPickerAct() {
        this.mIfInNewUi1ShouldUseThemNewUI2 = true;
        creates(new e30() { // from class: l.bk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75957a.m28793d2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m28791b2(Context context, int i, MusicContent musicContent, boolean z, boolean z2, String str) {
        Intent intent = new Intent(context, (Class<?>) AccountCompactMediaPickerAct.class);
        intent.putExtra("extra_image_count", i);
        intent.putExtra("extra_has_video", z);
        intent.putExtra("extra_is_add_image", z2);
        intent.putExtra("extra_music_content", (Serializable) musicContent);
        intent.putExtra("extra_from", str);
        if (NullChecker.m81303a(musicContent)) {
            intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        }
        return intent;
    }

    /* JADX INFO: renamed from: c2 */
    private void m28792c2() {
        if (e51.m114773x() || e51.m114772w()) {
            xdl0.m208376g0(this.f16677m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public void m28793d2(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
        if (NullChecker.m81303a(fragmentManager().m2554h0(q4c0.f152603k))) {
            return;
        }
        this.f16679o = new AccountVideoRecordFrag();
        m28796g2();
        m28792c2();
        C20443uj.m193970c().m193982m(null);
    }

    /* JADX INFO: renamed from: e2 */
    private void m28794e2(PutongFrag putongFrag) {
        AbstractC0427k abstractC0427kM2567m = getSupportFragmentManager().m2567m();
        abstractC0427kM2567m.m2812t(q4c0.f152603k, putongFrag, putongFrag.getClass().getSimpleName());
        abstractC0427kM2567m.mo2708j();
    }

    /* JADX INFO: renamed from: a2 */
    public View m28795a2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C16178ck.m107353b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        if (this.f16678n) {
            overridePendingTransition(pzb0.f151937b, pzb0.f151939d);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final void m28796g2() {
        boolean booleanExtra = act().getIntent().getBooleanExtra("extra_has_video", true);
        boolean booleanExtra2 = act().getIntent().getBooleanExtra("extra_is_add_image", false);
        String stringExtra = act().getIntent().getStringExtra("extra_from");
        boolean booleanExtra3 = act().getIntent().getBooleanExtra("extra_show_only_photo", false);
        int intExtra = act().getIntent().getIntExtra("extra_image_count", 1);
        ArrayList arrayList = (ArrayList) act().getIntent().getSerializableExtra("extra_selected_images");
        MusicContent musicContent = (MusicContent) act().getIntent().getSerializableExtra("extra_music_content");
        String stringExtra2 = act().getIntent().getStringExtra("extra_selected_folder_path");
        this.f16678n = act().getIntent().getBooleanExtra("extra_need_animate", false);
        AccountVideoRecordFrag.m28788M4(this.f16679o, musicContent, booleanExtra, booleanExtra2, intExtra, stringExtra, booleanExtra3, arrayList, stringExtra2);
        m28794e2(this.f16679o);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        getWindow().addFlags(128);
        View viewM28795a2 = m28795a2(layoutInflater, viewGroup);
        this.f16677m = viewM28795a2;
        return viewM28795a2;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (NullChecker.m81303a(this.f16679o)) {
            this.f16679o.m28789o();
        } else {
            lambda$debugItems$19();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_signup_camera";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        if (NullChecker.m81303a(this.pageHelper)) {
            this.pageHelper.m109040p(new j760("camerapage_gender", TEnum.equals(AccountModule.f16037c.m28325c1().gender, "male") ? "male" : "female"));
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void setTheme() {
        if (getAppTheme().mo105497m()) {
            setCustomAppTheme();
            return;
        }
        if (shouldSwitchToGradientColoredStatusBar()) {
            setUI1Theme();
        }
        if (NullChecker.m81303a(getSupportActionBar()) && "Lenovo".equals(Build.BRAND) && "Lenovo K10e70".equals(Build.MODEL)) {
            getSupportActionBar().mo134112B(w2c0.f184162a);
        }
    }
}
