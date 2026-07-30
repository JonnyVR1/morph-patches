package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p147v.VText;
import p149l.f6c0;
import p149l.o7r;
import p149l.u4c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class UserAlbumTags extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f24060a;

    /* JADX INFO: renamed from: b */
    public View f24061b;

    /* JADX INFO: renamed from: c */
    public VText f24062c;

    /* JADX INFO: renamed from: d */
    public View f24063d;

    /* JADX INFO: renamed from: e */
    public VText f24064e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f24065f;

    /* JADX INFO: renamed from: g */
    public int f24066g;

    public UserAlbumTags(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        o7r.m163037a(getContext()).inflate(f6c0.f95629Wa, (ViewGroup) this, true);
        this.f24065f = (LinearLayout) findViewById(u4c0.f174037Se);
        this.f24060a = findViewById(u4c0.f174432q9);
        this.f24062c = (VText) findViewById(u4c0.f174415p9);
        this.f24061b = findViewById(u4c0.f174448r8);
        this.f24063d = findViewById(u4c0.f174066Ua);
        this.f24064e = (VText) findViewById(u4c0.f174050Ta);
        setLayerType(1, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (size <= 0 || this.f24066g < size || this.f24060a.getVisibility() != 0) {
            return;
        }
        this.f24060a.setVisibility(8);
        xdl0.m208384k0(this.f24065f);
    }

    public UserAlbumTags(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UserAlbumTags(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
