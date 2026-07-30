package com.p000p1.mobile.putong.account.p002ui.camera.act;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.p002ui.camera.AccountVideoRecordFrag;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import l.e30;
import l.e51;
import l.j760;
import l.xdl0;
import p006l.C0609ck;
import p006l.C1347uj;
import p006l.pzb0;
import p006l.q4c0;
import p006l.w2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountCompactMediaPickerAct extends MediaPickerBaseAct {

    /* JADX INFO: renamed from: l */
    public FrameLayout f665l;

    /* JADX INFO: renamed from: m */
    public View f666m;

    /* JADX INFO: renamed from: n */
    public boolean f667n;

    /* JADX INFO: renamed from: o */
    public AccountVideoRecordFrag f668o;

    /* JADX WARN: Multi-variable type inference failed */
    public AccountCompactMediaPickerAct() {
        ((PutongAct) this).mIfInNewUi1ShouldUseThemNewUI2 = true;
        creates(new e30() { // from class: l.bk
            public final void call(Object obj) {
                this.f8932a.m693d2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m691b2(Context context, int i, MusicContent musicContent, boolean z, boolean z2, String str) {
        Intent intent = new Intent(context, (Class<?>) AccountCompactMediaPickerAct.class);
        intent.putExtra("extra_image_count", i);
        intent.putExtra("extra_has_video", z);
        intent.putExtra("extra_is_add_image", z2);
        intent.putExtra("extra_music_content", (Serializable) musicContent);
        intent.putExtra("extra_from", str);
        if (NullChecker.a(musicContent)) {
            intent.addFlags(67108864);
        }
        return intent;
    }

    /* JADX INFO: renamed from: c2 */
    private void m692c2() {
        if (e51.x() || e51.w()) {
            xdl0.g0(new View[]{this.f666m});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d2 */
    public void m693d2(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
        if (NullChecker.a(fragmentManager().h0(q4c0.f19613k))) {
            return;
        }
        this.f668o = new AccountVideoRecordFrag();
        m696g2();
        m692c2();
        C1347uj.m25232c().m25244m(null);
    }

    /* JADX INFO: renamed from: e2 */
    private void m694e2(PutongFrag putongFrag) {
        k kVarM = getSupportFragmentManager().m();
        kVarM.t(q4c0.f19613k, putongFrag, putongFrag.getClass().getSimpleName());
        kVarM.j();
    }

    /* JADX INFO: renamed from: a2 */
    public View m695a2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0609ck.m13518b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        if (this.f667n) {
            overridePendingTransition(pzb0.f19462b, pzb0.f19464d);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final void m696g2() {
        boolean booleanExtra = act().getIntent().getBooleanExtra("extra_has_video", true);
        boolean booleanExtra2 = act().getIntent().getBooleanExtra("extra_is_add_image", false);
        String stringExtra = act().getIntent().getStringExtra("extra_from");
        boolean booleanExtra3 = act().getIntent().getBooleanExtra("extra_show_only_photo", false);
        int intExtra = act().getIntent().getIntExtra("extra_image_count", 1);
        ArrayList arrayList = (ArrayList) act().getIntent().getSerializableExtra("extra_selected_images");
        MusicContent serializableExtra = act().getIntent().getSerializableExtra("extra_music_content");
        String stringExtra2 = act().getIntent().getStringExtra("extra_selected_folder_path");
        this.f667n = act().getIntent().getBooleanExtra("extra_need_animate", false);
        AccountVideoRecordFrag.m687M4(this.f668o, serializableExtra, booleanExtra, booleanExtra2, intExtra, stringExtra, booleanExtra3, arrayList, stringExtra2);
        m694e2(this.f668o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        getWindow().addFlags(128);
        View viewM695a2 = m695a2(layoutInflater, viewGroup);
        this.f666m = viewM695a2;
        return viewM695a2;
    }

    public void onBackPressed() {
        if (NullChecker.a(this.f668o)) {
            this.f668o.m689o();
        } else {
            finish();
        }
    }

    public String pageId() {
        return "p_signup_camera";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        if (NullChecker.a(((PutongAct) this).pageHelper)) {
            ((PutongAct) this).pageHelper.p(new j760[]{new j760("camerapage_gender", TEnum.equals(AccountModule.f26c.m220c1().gender, "male") ? "male" : "female")});
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTheme() {
        if (getAppTheme().m()) {
            setCustomAppTheme();
            return;
        }
        if (shouldSwitchToGradientColoredStatusBar()) {
            setUI1Theme();
        }
        if (NullChecker.a(getSupportActionBar()) && "Lenovo".equals(Build.BRAND) && "Lenovo K10e70".equals(Build.MODEL)) {
            getSupportActionBar().B(w2c0.f24826a);
        }
    }
}
