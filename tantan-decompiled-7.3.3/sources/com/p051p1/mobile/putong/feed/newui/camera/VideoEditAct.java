package com.p051p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0428k;
import com.p051p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.tantanapp.common.utils.NullChecker;
import p153l.hdc0;
import p153l.oki;
import p153l.tec0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class VideoEditAct extends ReloadSoAct {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m62416Y1(Context context, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) VideoEditAct.class);
        intent.putExtra("extra_bundle", bundle);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m62417Z1(Context context, String str, long j, long j2, boolean z, String str2) {
        Video video = new Video();
        video.path = oki.m168038z(str);
        video.isChosenFromLocal = true;
        Bundle bundle = new Bundle();
        bundle.putBoolean("extra_is_from_album", true);
        bundle.putBoolean("extra_is_from_video_cut", z);
        bundle.putParcelable("EXTRA_KEY_VIDEO_DATA", video);
        bundle.putLong("extra_start_time", j);
        bundle.putLong("extra_end_time", j2);
        bundle.putString("extra_from", str2);
        Intent intent = new Intent(context, (Class<?>) VideoEditAct.class);
        intent.putExtra("extra_bundle", bundle);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m62418a2(Context context, String str, boolean z, String str2) {
        return m62417Z1(context, str, 0L, 0L, z, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public void m62419b2(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
        if (NullChecker.m82486a(fragmentManager().m2555h0(hdc0.f108818A1)) || getIntent() == null || getIntent().getBundleExtra("extra_bundle") == null) {
            return;
        }
        Intent intent = getIntent();
        VideoEditFrag videoEditFrag = new VideoEditFrag();
        videoEditFrag.setArguments(intent.getBundleExtra("extra_bundle"));
        AbstractC0428k abstractC0428kM2568m = getSupportFragmentManager().m2568m();
        abstractC0428kM2568m.m2805c(hdc0.f108818A1, videoEditFrag, "videoEdit");
        abstractC0428kM2568m.mo2709j();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(tec0.f173663g, (ViewGroup) null);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.mIfInNewUi1ShouldUseThemNewUI2 = true;
        creates(new y20() { // from class: l.bdl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76274a.m62419b2((Bundle) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_camera_video_preview";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
    }
}
