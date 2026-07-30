package com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.xdl0;
import p149l.z5u;

/* JADX INFO: loaded from: classes4.dex */
public class LiveStickerPickView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f48701a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f48702b;

    /* JADX INFO: renamed from: c */
    public VText f48703c;

    /* JADX INFO: renamed from: d */
    public View f48704d;

    /* JADX INFO: renamed from: e */
    public View f48705e;

    /* JADX INFO: renamed from: f */
    public VImage f48706f;

    /* JADX INFO: renamed from: g */
    public TextView f48707g;

    /* JADX INFO: renamed from: h */
    public TextView f48708h;

    /* JADX INFO: renamed from: i */
    public ImageView f48709i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f48710j;

    public LiveStickerPickView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m72327a(View view) {
        z5u.m217376a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m72328b(boolean z) {
        xdl0.m208344M(this.f48705e, z);
        xdl0.m208344M(this.f48706f, z);
        xdl0.m208344M(this.f48707g, z);
        xdl0.m208344M(this.f48708h, z);
        xdl0.m208344M(this.f48709i, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72327a(this);
    }

    public LiveStickerPickView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveStickerPickView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
