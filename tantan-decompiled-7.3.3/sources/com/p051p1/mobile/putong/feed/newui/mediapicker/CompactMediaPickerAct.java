package com.p051p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0428k;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.feed.newui.camera.videorecord.VideoRecordFrag;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.a8c0;
import p153l.bnl0;
import p153l.hdc0;
import p153l.l51;
import p153l.xc4;
import p153l.xn5;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class CompactMediaPickerAct extends MediaPickerBaseAct {

    /* JADX INFO: renamed from: l */
    public FrameLayout f41105l;

    /* JADX INFO: renamed from: m */
    public View f41106m;

    /* JADX INFO: renamed from: n */
    public boolean f41107n;

    /* JADX INFO: renamed from: o */
    public VideoRecordFrag f41108o;

    public CompactMediaPickerAct() {
        this.mIfInNewUi1ShouldUseThemNewUI2 = true;
        creates(new y20() { // from class: l.wn5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189852a.m63375h2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m63371c2(Context context, int i, MusicContent musicContent, boolean z, boolean z2) {
        return m63372d2(context, i, musicContent, z, z2, "");
    }

    /* JADX INFO: renamed from: d2 */
    public static Intent m63372d2(Context context, int i, MusicContent musicContent, boolean z, boolean z2, String str) {
        Intent intent = new Intent(context, (Class<?>) CompactMediaPickerAct.class);
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

    /* JADX INFO: renamed from: e2 */
    public static Intent m63373e2(Context context, int i, MusicContent musicContent, boolean z, boolean z2, boolean z3, ArrayList<Media> arrayList, String str, boolean z4, boolean z5) {
        Intent intentM63372d2 = m63372d2(context, i, musicContent, z, z2, "");
        intentM63372d2.putExtra("extra_show_only_photo", z3);
        intentM63372d2.putExtra("extra_selected_images", arrayList);
        intentM63372d2.putExtra("extra_selected_folder_path", str);
        intentM63372d2.putExtra("extra_need_animate", z4);
        intentM63372d2.putExtra("extra_is_from_my_state", z5);
        return intentM63372d2;
    }

    /* JADX INFO: renamed from: g2 */
    private void m63374g2() {
        if (l51.m152918x() || l51.m152917w()) {
            bnl0.m105556g0(this.f41106m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public void m63375h2(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
        if (NullChecker.m82486a(fragmentManager().m2555h0(hdc0.f108816A))) {
            return;
        }
        this.f41108o = new VideoRecordFrag();
        m63377k2();
        m63374g2();
        xc4.m210114c().m210126m(null);
    }

    /* JADX INFO: renamed from: i2 */
    private void m63376i2(PutongFrag putongFrag) {
        AbstractC0428k abstractC0428kM2568m = getSupportFragmentManager().m2568m();
        abstractC0428kM2568m.m2813t(hdc0.f108816A, putongFrag, putongFrag.getClass().getSimpleName());
        abstractC0428kM2568m.mo2709j();
    }

    /* JADX INFO: renamed from: k2 */
    private void m63377k2() {
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
        this.f41107n = act().getIntent().getBooleanExtra("extra_need_animate", false);
        VideoRecordFrag.m62592M4(this.f41108o, musicContent, booleanExtra, booleanExtra2, intExtra, stringExtra, booleanExtra3, arrayList, stringExtra2);
        m63376i2(this.f41108o);
    }

    /* JADX INFO: renamed from: b2 */
    public View m63378b2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xn5.m212093b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        if (this.f41107n) {
            overridePendingTransition(a8c0.f68906f, a8c0.f68910j);
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        getWindow().addFlags(128);
        View viewM63378b2 = m63378b2(layoutInflater, viewGroup);
        this.f41106m = viewM63378b2;
        return viewM63378b2;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (NullChecker.m82486a(this.f41108o)) {
            this.f41108o.m62593o();
        } else {
            lambda$debugItems$19();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_camera";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
    }
}
