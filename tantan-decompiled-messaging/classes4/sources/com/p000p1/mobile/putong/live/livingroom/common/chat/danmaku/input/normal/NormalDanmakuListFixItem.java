package com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuListFixItem;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import l.e30;
import l.hxs;
import l.t100;
import l.xdl0;
import l.yb2;
import p002l.um40;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class NormalDanmakuListFixItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f4875a;

    /* JADX INFO: renamed from: b */
    public VImage f4876b;

    /* JADX INFO: renamed from: c */
    public boolean f4877c;

    /* JADX INFO: renamed from: d */
    public BLiveDanmakuListItem f4878d;

    public NormalDanmakuListFixItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4877c = false;
        this.f4878d = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m6065b(View view) {
        um40.m23536a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m6066c(BLiveDanmakuListItem bLiveDanmakuListItem, boolean z, final e30<NormalDanmakuListFixItem> e30Var) {
        this.f4878d = bLiveDanmakuListItem;
        hxs.u("context_livingAct", this.f4875a, bLiveDanmakuListItem.iconUrl, t100.d(34.0f), t100.d(34.0f));
        xdl0.M(this.f4876b, TEnum.equals(bLiveDanmakuListItem.status, "locked"));
        m6067d(z);
        setOnClickListener(new View.OnClickListener() { // from class: l.tm40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call((NormalDanmakuListFixItem) view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public void m6067d(boolean z) {
        this.f4877c = z;
        setBackground(z ? yb2.a(889192447, t100.i, false) : null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6065b(this);
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
