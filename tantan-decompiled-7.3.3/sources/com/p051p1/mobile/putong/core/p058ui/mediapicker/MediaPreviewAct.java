package com.p051p1.mobile.putong.core.p058ui.mediapicker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.AutoReleaseVideoAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p153l.b3y;
import p153l.lfc0;
import p153l.w2y;

/* JADX INFO: loaded from: classes3.dex */
public class MediaPreviewAct extends AutoReleaseVideoAct {

    /* JADX INFO: renamed from: c */
    public int f31489c = -1;

    /* JADX INFO: renamed from: d */
    public ArrayList<Media> f31490d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public w2y f31491e;

    /* JADX INFO: renamed from: f */
    public b3y f31492f;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m48985Y1(Context context, ArrayList<Media> arrayList, ArrayList<Media> arrayList2, int i, int i2) {
        Intent intent = new Intent(context, (Class<?>) MediaPreviewAct.class);
        w2y.f186955c = arrayList;
        intent.putExtra("selectedImages", arrayList2);
        intent.putExtra("startIndex", i);
        intent.putExtra("imageCount", i2);
        return intent;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f31492f.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f31491e = new w2y(this);
        b3y b3yVar = new b3y(this);
        this.f31492f = b3yVar;
        this.f31491e.mo52715C(b3yVar);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f31491e.mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f31491e.m204609i0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(lfc0.f131842e, menu);
        this.f31492f.m102373l(menu, this.f31491e.m204608g0());
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        int size = this.f31490d.size();
        int i = this.f31489c;
        if (size <= i || i < 0) {
            return super.pageId();
        }
        return this.f31490d.get(i) instanceof Video ? "p_video_moment_preview_view" : "p_picture_moment_preview_view";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f31489c = getIntent().getIntExtra("startIndex", -2);
        this.f31490d = new ArrayList<>();
        if (NullChecker.m82486a(w2y.f186955c)) {
            this.f31490d.addAll(w2y.f186955c);
        }
        this.f31491e.m204610j0((ArrayList) getIntent().getSerializableExtra("selectedImages"), getIntent().getIntExtra("imageCount", 1));
        super.preCreateView(bundle);
        this.pageHelper.m152782q(pageId());
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldRemarginContent() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToGradientColoredStatusBar() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return !NullChecker.m82486a(CoreModule.f18264c);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldWrapContentViewWithTransparentHeader() {
        if (NullChecker.m82486a(CoreModule.f18264c)) {
            return false;
        }
        return Act.SWIPE_BACK_SUPPORTED;
    }
}
