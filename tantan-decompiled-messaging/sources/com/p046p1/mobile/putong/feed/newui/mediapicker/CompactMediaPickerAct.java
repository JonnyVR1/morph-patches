package com.p046p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0427k;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.feed.newui.camera.videorecord.VideoRecordFrag;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.b5c0;
import p149l.e30;
import p149l.e51;
import p149l.tm5;
import p149l.uzb0;
import p149l.xdl0;
import p149l.yb4;

/* JADX INFO: loaded from: classes12.dex */
public class CompactMediaPickerAct extends MediaPickerBaseAct {

    /* JADX INFO: renamed from: l */
    public FrameLayout f40257l;

    /* JADX INFO: renamed from: m */
    public View f40258m;

    /* JADX INFO: renamed from: n */
    public boolean f40259n;

    /* JADX INFO: renamed from: o */
    public VideoRecordFrag f40260o;

    public CompactMediaPickerAct() {
        this.mIfInNewUi1ShouldUseThemNewUI2 = true;
        creates(new e30() { // from class: l.sm5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f165326a.m62192g2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m62188b2(Context context, int i, MusicContent musicContent, boolean z, boolean z2) {
        return m62189c2(context, i, musicContent, z, z2, "");
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m62189c2(Context context, int i, MusicContent musicContent, boolean z, boolean z2, String str) {
        Intent intent = new Intent(context, (Class<?>) CompactMediaPickerAct.class);
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

    /* JADX INFO: renamed from: d2 */
    public static Intent m62190d2(Context context, int i, MusicContent musicContent, boolean z, boolean z2, boolean z3, ArrayList<Media> arrayList, String str, boolean z4, boolean z5) {
        Intent intentM62189c2 = m62189c2(context, i, musicContent, z, z2, "");
        intentM62189c2.putExtra("extra_show_only_photo", z3);
        intentM62189c2.putExtra("extra_selected_images", arrayList);
        intentM62189c2.putExtra("extra_selected_folder_path", str);
        intentM62189c2.putExtra("extra_need_animate", z4);
        intentM62189c2.putExtra("extra_is_from_my_state", z5);
        return intentM62189c2;
    }

    /* JADX INFO: renamed from: e2 */
    private void m62191e2() {
        if (e51.m114773x() || e51.m114772w()) {
            xdl0.m208376g0(this.f40258m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public void m62192g2(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
        if (NullChecker.m81303a(fragmentManager().m2554h0(b5c0.f73463A))) {
            return;
        }
        this.f40260o = new VideoRecordFrag();
        m62194i2();
        m62191e2();
        yb4.m213936c().m213948m(null);
    }

    /* JADX INFO: renamed from: h2 */
    private void m62193h2(PutongFrag putongFrag) {
        AbstractC0427k abstractC0427kM2567m = getSupportFragmentManager().m2567m();
        abstractC0427kM2567m.m2812t(b5c0.f73463A, putongFrag, putongFrag.getClass().getSimpleName());
        abstractC0427kM2567m.mo2708j();
    }

    /* JADX INFO: renamed from: i2 */
    private void m62194i2() {
        boolean booleanExtra = act().getIntent().getBooleanExtra("extra_has_video", true);
        boolean booleanExtra2 = act().getIntent().getBooleanExtra("extra_is_add_image", false);
        String stringExtra = act().getIntent().getStringExtra("extra_from");
        if (act().getIntent().getBooleanExtra("extra_is_from_my_state", false)) {
            stringExtra = "my_states";
        }
        boolean booleanExtra3 = act().getIntent().getBooleanExtra("extra_show_only_photo", false);
        int intExtra = act().getIntent().getIntExtra("extra_image_count", 9);
        ArrayList arrayList = (ArrayList) act().getIntent().getSerializableExtra("extra_selected_images");
        MusicContent musicContent = (MusicContent) act().getIntent().getSerializableExtra("extra_music_content");
        String stringExtra2 = act().getIntent().getStringExtra("extra_selected_folder_path");
        this.f40259n = act().getIntent().getBooleanExtra("extra_need_animate", false);
        VideoRecordFrag.m61408M4(this.f40260o, musicContent, booleanExtra, booleanExtra2, intExtra, stringExtra, booleanExtra3, arrayList, stringExtra2);
        m62193h2(this.f40260o);
    }

    /* JADX INFO: renamed from: a2 */
    public View m62195a2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tm5.m189640b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        if (this.f40259n) {
            overridePendingTransition(uzb0.f178981f, uzb0.f178985j);
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        getWindow().addFlags(128);
        View viewM62195a2 = m62195a2(layoutInflater, viewGroup);
        this.f40258m = viewM62195a2;
        return viewM62195a2;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (NullChecker.m81303a(this.f40260o)) {
            this.f40260o.m61409o();
        } else {
            lambda$debugItems$19();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_camera";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
    }
}
