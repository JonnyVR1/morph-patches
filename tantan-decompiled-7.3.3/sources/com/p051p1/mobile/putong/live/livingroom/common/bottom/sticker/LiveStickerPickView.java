package com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.a8u;
import p153l.bnl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveStickerPickView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f49549a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f49550b;

    /* JADX INFO: renamed from: c */
    public VText f49551c;

    /* JADX INFO: renamed from: d */
    public View f49552d;

    /* JADX INFO: renamed from: e */
    public View f49553e;

    /* JADX INFO: renamed from: f */
    public VImage f49554f;

    /* JADX INFO: renamed from: g */
    public TextView f49555g;

    /* JADX INFO: renamed from: h */
    public TextView f49556h;

    /* JADX INFO: renamed from: i */
    public ImageView f49557i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f49558j;

    public LiveStickerPickView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m73510a(View view) {
        a8u.m96498a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m73511b(boolean z) {
        bnl0.m105524M(this.f49553e, z);
        bnl0.m105524M(this.f49554f, z);
        bnl0.m105524M(this.f49555g, z);
        bnl0.m105524M(this.f49556h, z);
        bnl0.m105524M(this.f49557i, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73510a(this);
    }

    public LiveStickerPickView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveStickerPickView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
