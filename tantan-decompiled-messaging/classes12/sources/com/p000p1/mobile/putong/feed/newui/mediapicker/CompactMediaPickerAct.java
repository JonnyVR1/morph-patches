package com.p000p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.feed.newui.camera.videorecord.VideoRecordFrag;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import l.e30;
import l.e51;
import l.xdl0;
import p007l.b5c0;
import p007l.tm5;
import p007l.uzb0;
import p007l.yb4;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class CompactMediaPickerAct extends MediaPickerBaseAct {

    /* JADX INFO: renamed from: l */
    public FrameLayout f1718l;

    /* JADX INFO: renamed from: m */
    public View f1719m;

    /* JADX INFO: renamed from: n */
    public boolean f1720n;

    /* JADX INFO: renamed from: o */
    public VideoRecordFrag f1721o;

    public CompactMediaPickerAct() {
        ((PutongAct) this).mIfInNewUi1ShouldUseThemNewUI2 = true;
        creates(new e30() { // from class: l.sm5
            public final void call(Object obj) {
                this.f13006a.m3174g2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m3170b2(Context context, int i, MusicContent musicContent, boolean z, boolean z2) {
        return m3171c2(context, i, musicContent, z, z2, "");
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m3171c2(Context context, int i, MusicContent musicContent, boolean z, boolean z2, String str) {
        Intent intent = new Intent(context, (Class<?>) CompactMediaPickerAct.class);
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

    /* JADX INFO: renamed from: d2 */
    public static Intent m3172d2(Context context, int i, MusicContent musicContent, boolean z, boolean z2, boolean z3, ArrayList<Media> arrayList, String str, boolean z4, boolean z5) {
        Intent intentM3171c2 = m3171c2(context, i, musicContent, z, z2, "");
        intentM3171c2.putExtra("extra_show_only_photo", z3);
        intentM3171c2.putExtra("extra_selected_images", arrayList);
        intentM3171c2.putExtra("extra_selected_folder_path", str);
        intentM3171c2.putExtra("extra_need_animate", z4);
        intentM3171c2.putExtra("extra_is_from_my_state", z5);
        return intentM3171c2;
    }

    /* JADX INFO: renamed from: e2 */
    private void m3173e2() {
        if (e51.x() || e51.w()) {
            xdl0.g0(new View[]{this.f1719m});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public void m3174g2(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
        if (NullChecker.a(fragmentManager().h0(b5c0.f5944A))) {
            return;
        }
        this.f1721o = new VideoRecordFrag();
        m3176i2();
        m3173e2();
        yb4.m17102c().m17114m(null);
    }

    /* JADX INFO: renamed from: h2 */
    private void m3175h2(PutongFrag putongFrag) {
        k kVarM = getSupportFragmentManager().m();
        kVarM.t(b5c0.f5944A, putongFrag, putongFrag.getClass().getSimpleName());
        kVarM.j();
    }

    /* JADX INFO: renamed from: i2 */
    private void m3176i2() {
        boolean booleanExtra = act().getIntent().getBooleanExtra("extra_has_video", true);
        boolean booleanExtra2 = act().getIntent().getBooleanExtra("extra_is_add_image", false);
        String stringExtra = act().getIntent().getStringExtra("extra_from");
        if (act().getIntent().getBooleanExtra("extra_is_from_my_state", false)) {
            stringExtra = "my_states";
        }
        boolean booleanExtra3 = act().getIntent().getBooleanExtra("extra_show_only_photo", false);
        int intExtra = act().getIntent().getIntExtra("extra_image_count", 9);
        ArrayList arrayList = (ArrayList) act().getIntent().getSerializableExtra("extra_selected_images");
        MusicContent serializableExtra = act().getIntent().getSerializableExtra("extra_music_content");
        String stringExtra2 = act().getIntent().getStringExtra("extra_selected_folder_path");
        this.f1720n = act().getIntent().getBooleanExtra("extra_need_animate", false);
        VideoRecordFrag.m2357M4(this.f1721o, serializableExtra, booleanExtra, booleanExtra2, intExtra, stringExtra, booleanExtra3, arrayList, stringExtra2);
        m3175h2(this.f1721o);
    }

    /* JADX INFO: renamed from: a2 */
    public View m3177a2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tm5.m14568b(this, layoutInflater, viewGroup);
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        if (this.f1720n) {
            overridePendingTransition(uzb0.f13992f, uzb0.f13996j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        getWindow().addFlags(128);
        View viewM3177a2 = m3177a2(layoutInflater, viewGroup);
        this.f1719m = viewM3177a2;
        return viewM3177a2;
    }

    public void onBackPressed() {
        if (NullChecker.a(this.f1721o)) {
            this.f1721o.m2359o();
        } else {
            finish();
        }
    }

    public String pageId() {
        return "p_camera";
    }

    public void preCreateView(Bundle bundle) {
    }
}
