package com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuListFixItem;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.e30;
import p149l.hxs;
import p149l.t100;
import p149l.um40;
import p149l.xdl0;
import p149l.yb2;

/* JADX INFO: loaded from: classes4.dex */
public class NormalDanmakuListFixItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f48833a;

    /* JADX INFO: renamed from: b */
    public VImage f48834b;

    /* JADX INFO: renamed from: c */
    public boolean f48835c;

    /* JADX INFO: renamed from: d */
    public BLiveDanmakuListItem f48836d;

    public NormalDanmakuListFixItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48835c = false;
        this.f48836d = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m72569b(View view) {
        um40.m194304a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m72570c(BLiveDanmakuListItem bLiveDanmakuListItem, boolean z, final e30<NormalDanmakuListFixItem> e30Var) {
        this.f48836d = bLiveDanmakuListItem;
        hxs.m133408u("context_livingAct", this.f48833a, bLiveDanmakuListItem.iconUrl, t100.m186890d(34.0f), t100.m186890d(34.0f));
        xdl0.m208344M(this.f48834b, TEnum.equals(bLiveDanmakuListItem.status, "locked"));
        m72571d(z);
        setOnClickListener(new View.OnClickListener() { // from class: l.tm40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call((NormalDanmakuListFixItem) view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public void m72571d(boolean z) {
        this.f48835c = z;
        setBackground(z ? yb2.m213876a(889192447, t100.f167260i, false) : null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72569b(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(xdl0.m208407w(34.0f), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(xdl0.m208407w(34.0f), 1073741824);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            measureChildWithMargins(getChildAt(i3), iMakeMeasureSpec, 0, iMakeMeasureSpec2, 0);
        }
        setMeasuredDimension(iMakeMeasureSpec, iMakeMeasureSpec2);
    }
}
