package com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.xdl0;
import p002l.z5u;
import v.VImage;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveStickerPickView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f4743a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f4744b;

    /* JADX INFO: renamed from: c */
    public VText f4745c;

    /* JADX INFO: renamed from: d */
    public View f4746d;

    /* JADX INFO: renamed from: e */
    public View f4747e;

    /* JADX INFO: renamed from: f */
    public VImage f4748f;

    /* JADX INFO: renamed from: g */
    public TextView f4749g;

    /* JADX INFO: renamed from: h */
    public TextView f4750h;

    /* JADX INFO: renamed from: i */
    public ImageView f4751i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f4752j;

    public LiveStickerPickView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m5804a(View view) {
        z5u.m27099a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m5805b(boolean z) {
        xdl0.M(this.f4747e, z);
        xdl0.M(this.f4748f, z);
        xdl0.M(this.f4749g, z);
        xdl0.M(this.f4750h, z);
        xdl0.M(this.f4751i, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5804a(this);
    }

    public LiveStickerPickView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveStickerPickView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
