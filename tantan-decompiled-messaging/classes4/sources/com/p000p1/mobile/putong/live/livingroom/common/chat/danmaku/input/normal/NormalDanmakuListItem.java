package com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuListItem;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import l.e30;
import l.hxs;
import l.t100;
import l.xdl0;
import l.yb2;
import p002l.wm40;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class NormalDanmakuListItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f4879a;

    /* JADX INFO: renamed from: b */
    public VImage f4880b;

    /* JADX INFO: renamed from: c */
    public BLiveDanmakuListItem f4881c;

    /* JADX INFO: renamed from: d */
    public boolean f4882d;

    public NormalDanmakuListItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4881c = null;
        this.f4882d = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m6069b(View view) {
        wm40.m24691a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m6070c(BLiveDanmakuListItem bLiveDanmakuListItem, boolean z, final e30<NormalDanmakuListItem> e30Var) {
        this.f4881c = bLiveDanmakuListItem;
        hxs.u("context_livingAct", this.f4879a, bLiveDanmakuListItem.iconUrl, t100.d(34.0f), t100.d(34.0f));
        xdl0.M(this.f4880b, TEnum.equals(bLiveDanmakuListItem.status, "locked"));
        m6071d(z);
        setOnClickListener(new View.OnClickListener() { // from class: l.vm40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call((NormalDanmakuListItem) view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public void m6071d(boolean z) {
        this.f4882d = z;
        setBackground(z ? yb2.a(889192447, t100.i, false) : null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6069b(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(xdl0.w(34.0f), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(xdl0.w(34.0f), 1073741824);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            measureChildWithMargins(getChildAt(i3), iMakeMeasureSpec, 0, iMakeMeasureSpec2, 0);
        }
        setMeasuredDimension(iMakeMeasureSpec, iMakeMeasureSpec2);
    }
}
