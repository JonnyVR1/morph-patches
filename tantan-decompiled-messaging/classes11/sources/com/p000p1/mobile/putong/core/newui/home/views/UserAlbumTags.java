package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import l.f6c0;
import l.u4c0;
import l.xdl0;
import p009l.o7r;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class UserAlbumTags extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f2838a;

    /* JADX INFO: renamed from: b */
    public View f2839b;

    /* JADX INFO: renamed from: c */
    public VText f2840c;

    /* JADX INFO: renamed from: d */
    public View f2841d;

    /* JADX INFO: renamed from: e */
    public VText f2842e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f2843f;

    /* JADX INFO: renamed from: g */
    public int f2844g;

    public UserAlbumTags(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        o7r.m19649a(getContext()).inflate(f6c0.Wa, (ViewGroup) this, true);
        this.f2843f = (LinearLayout) findViewById(u4c0.Se);
        this.f2838a = findViewById(u4c0.q9);
        this.f2840c = findViewById(u4c0.p9);
        this.f2839b = findViewById(u4c0.r8);
        this.f2841d = findViewById(u4c0.Ua);
        this.f2842e = findViewById(u4c0.Ta);
        setLayerType(1, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (size <= 0 || this.f2844g < size || this.f2838a.getVisibility() != 0) {
            return;
        }
        this.f2838a.setVisibility(8);
        xdl0.k0(this.f2843f);
    }

    public UserAlbumTags(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UserAlbumTags(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
