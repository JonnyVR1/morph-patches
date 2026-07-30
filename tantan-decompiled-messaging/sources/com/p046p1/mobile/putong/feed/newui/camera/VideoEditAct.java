package com.p046p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0427k;
import com.p046p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.tantanapp.common.utils.NullChecker;
import p149l.b5c0;
import p149l.e30;
import p149l.o6c0;
import p149l.rhi;

/* JADX INFO: loaded from: classes12.dex */
public class VideoEditAct extends ReloadSoAct {
    /* JADX INFO: renamed from: X1 */
    public static Intent m61232X1(Context context, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) VideoEditAct.class);
        intent.putExtra("extra_bundle", bundle);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m61233Y1(Context context, String str, long j, long j2, boolean z, String str2) {
        Video video = new Video();
        video.path = rhi.m179382z(str);
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

    /* JADX INFO: renamed from: Z1 */
    public static Intent m61234Z1(Context context, String str, boolean z, String str2) {
        return m61233Y1(context, str, 0L, 0L, z, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public void m61235a2(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
        if (NullChecker.m81303a(fragmentManager().m2554h0(b5c0.f73465A1)) || getIntent() == null || getIntent().getBundleExtra("extra_bundle") == null) {
            return;
        }
        Intent intent = getIntent();
        VideoEditFrag videoEditFrag = new VideoEditFrag();
        videoEditFrag.setArguments(intent.getBundleExtra("extra_bundle"));
        AbstractC0427k abstractC0427kM2567m = getSupportFragmentManager().m2567m();
        abstractC0427kM2567m.m2804c(b5c0.f73465A1, videoEditFrag, "videoEdit");
        abstractC0427kM2567m.mo2708j();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(o6c0.f142194g, (ViewGroup) null);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.mIfInNewUi1ShouldUseThemNewUI2 = true;
        creates(new e30() { // from class: l.x3l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f190907a.m61235a2((Bundle) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_camera_video_preview";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
    }
}
