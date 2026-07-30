package com.p000p1.mobile.putong.core.p001ui.mediapicker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.AutoReleaseVideoAct;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.h7c0;
import p003l.eux;
import p003l.ztx;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MediaPreviewAct extends AutoReleaseVideoAct {

    /* JADX INFO: renamed from: c */
    public int f532c = -1;

    /* JADX INFO: renamed from: d */
    public ArrayList<Media> f533d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public ztx f534e;

    /* JADX INFO: renamed from: f */
    public eux f535f;

    /* JADX INFO: renamed from: X1 */
    public static Intent m866X1(Context context, ArrayList<Media> arrayList, ArrayList<Media> arrayList2, int i, int i2) {
        Intent intent = new Intent(context, (Class<?>) MediaPreviewAct.class);
        ztx.f9424c = arrayList;
        intent.putExtra("selectedImages", arrayList2);
        intent.putExtra("startIndex", i);
        intent.putExtra("imageCount", i2);
        return intent;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f535f.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initDataOnCreate();
        this.f534e = new ztx(this);
        eux euxVar = new eux(this);
        this.f535f = euxVar;
        this.f534e.C(euxVar);
    }

    public void initSubscription() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initSubscription();
        this.f534e.m9467a0();
    }

    public void onBackPressed() {
        this.f534e.m9470i0();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(h7c0.e, menu);
        this.f535f.m3937l(menu, this.f534e.m9469g0());
        return true;
    }

    public String pageId() {
        int size = this.f533d.size();
        int i = this.f532c;
        if (size <= i || i < 0) {
            return super/*com.p1.mobile.putong.app.PutongAct*/.pageId();
        }
        return this.f533d.get(i) instanceof Video ? "p_video_moment_preview_view" : "p_picture_moment_preview_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        this.f532c = getIntent().getIntExtra("startIndex", -2);
        this.f533d = new ArrayList<>();
        if (NullChecker.a(ztx.f9424c)) {
            this.f533d.addAll(ztx.f9424c);
        }
        this.f534e.m9471j0((ArrayList) getIntent().getSerializableExtra("selectedImages"), getIntent().getIntExtra("imageCount", 1));
        super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
        ((PutongAct) this).pageHelper.q(pageId());
    }

    public boolean shouldRemarginContent() {
        return false;
    }

    public boolean shouldSwitchToGradientColoredStatusBar() {
        return false;
    }

    public boolean shouldSwitchToTransparentStatus() {
        return !NullChecker.a(CoreModule.c);
    }

    public boolean shouldWrapContentViewWithTransparentHeader() {
        if (NullChecker.a(CoreModule.c)) {
            return false;
        }
        return Act.SWIPE_BACK_SUPPORTED;
    }
}
