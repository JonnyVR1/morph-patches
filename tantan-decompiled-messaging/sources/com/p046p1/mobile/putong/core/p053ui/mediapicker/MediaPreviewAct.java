package com.p046p1.mobile.putong.core.p053ui.mediapicker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.AutoReleaseVideoAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p149l.eux;
import p149l.h7c0;
import p149l.ztx;

/* JADX INFO: loaded from: classes3.dex */
public class MediaPreviewAct extends AutoReleaseVideoAct {

    /* JADX INFO: renamed from: c */
    public int f30641c = -1;

    /* JADX INFO: renamed from: d */
    public ArrayList<Media> f30642d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public ztx f30643e;

    /* JADX INFO: renamed from: f */
    public eux f30644f;

    /* JADX INFO: renamed from: X1 */
    public static Intent m47802X1(Context context, ArrayList<Media> arrayList, ArrayList<Media> arrayList2, int i, int i2) {
        Intent intent = new Intent(context, (Class<?>) MediaPreviewAct.class);
        ztx.f204776c = arrayList;
        intent.putExtra("selectedImages", arrayList2);
        intent.putExtra("startIndex", i);
        intent.putExtra("imageCount", i2);
        return intent;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f30644f.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f30643e = new ztx(this);
        eux euxVar = new eux(this);
        this.f30644f = euxVar;
        this.f30643e.mo51532C(euxVar);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f30643e.mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f30643e.m220158i0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(h7c0.f106223e, menu);
        this.f30644f.m118218l(menu, this.f30643e.m220157g0());
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        int size = this.f30642d.size();
        int i = this.f30641c;
        if (size <= i || i < 0) {
            return super.pageId();
        }
        return this.f30642d.get(i) instanceof Video ? "p_video_moment_preview_view" : "p_picture_moment_preview_view";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f30641c = getIntent().getIntExtra("startIndex", -2);
        this.f30642d = new ArrayList<>();
        if (NullChecker.m81303a(ztx.f204776c)) {
            this.f30642d.addAll(ztx.f204776c);
        }
        this.f30643e.m220159j0((ArrayList) getIntent().getSerializableExtra("selectedImages"), getIntent().getIntExtra("imageCount", 1));
        super.preCreateView(bundle);
        this.pageHelper.m109041q(pageId());
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldRemarginContent() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToGradientColoredStatusBar() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return !NullChecker.m81303a(CoreModule.f17545c);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldWrapContentViewWithTransparentHeader() {
        if (NullChecker.m81303a(CoreModule.f17545c)) {
            return false;
        }
        return Act.SWIPE_BACK_SUPPORTED;
    }
}
