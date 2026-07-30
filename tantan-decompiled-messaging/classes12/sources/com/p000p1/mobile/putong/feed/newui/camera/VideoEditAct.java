package com.p000p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.rhi;
import p007l.b5c0;
import p007l.o6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class VideoEditAct extends ReloadSoAct {
    /* JADX INFO: renamed from: X1 */
    public static Intent m2168X1(Context context, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) VideoEditAct.class);
        intent.putExtra("extra_bundle", bundle);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m2169Y1(Context context, String str, long j, long j2, boolean z, String str2) {
        Video video = new Video();
        video.path = rhi.z(str);
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
    public static Intent m2170Z1(Context context, String str, boolean z, String str2) {
        return m2169Y1(context, str, 0L, 0L, z, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a2 */
    public void m2171a2(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
        if (NullChecker.a(fragmentManager().h0(b5c0.f5946A1)) || getIntent() == null || getIntent().getBundleExtra("extra_bundle") == null) {
            return;
        }
        Intent intent = getIntent();
        VideoEditFrag videoEditFrag = new VideoEditFrag();
        videoEditFrag.setArguments(intent.getBundleExtra("extra_bundle"));
        k kVarM = getSupportFragmentManager().m();
        kVarM.c(b5c0.f5946A1, videoEditFrag, "videoEdit");
        kVarM.j();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(o6c0.f11213g, (ViewGroup) null);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        ((PutongAct) this).mIfInNewUi1ShouldUseThemNewUI2 = true;
        creates(new e30() { // from class: l.x3l0
            public final void call(Object obj) {
                this.f14760a.m2171a2((Bundle) obj);
            }
        });
    }

    public String pageId() {
        return "p_camera_video_preview";
    }

    public void preCreateView(Bundle bundle) {
    }
}
