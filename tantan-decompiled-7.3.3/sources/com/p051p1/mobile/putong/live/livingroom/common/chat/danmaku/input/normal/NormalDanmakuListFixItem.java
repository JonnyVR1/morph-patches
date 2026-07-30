package com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuListFixItem;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.fc2;
import p153l.iv40;
import p153l.izs;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class NormalDanmakuListFixItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f49681a;

    /* JADX INFO: renamed from: b */
    public VImage f49682b;

    /* JADX INFO: renamed from: c */
    public boolean f49683c;

    /* JADX INFO: renamed from: d */
    public BLiveDanmakuListItem f49684d;

    public NormalDanmakuListFixItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49683c = false;
        this.f49684d = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m73752b(View view) {
        iv40.m142276a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m73753c(BLiveDanmakuListItem bLiveDanmakuListItem, boolean z, final y20<NormalDanmakuListFixItem> y20Var) {
        this.f49684d = bLiveDanmakuListItem;
        izs.m142870u("context_livingAct", this.f49681a, bLiveDanmakuListItem.iconUrl, qa00.m175859d(34.0f), qa00.m175859d(34.0f));
        bnl0.m105524M(this.f49682b, TEnum.equals(bLiveDanmakuListItem.status, "locked"));
        m73754d(z);
        setOnClickListener(new View.OnClickListener() { // from class: l.hv40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call((NormalDanmakuListFixItem) view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public void m73754d(boolean z) {
        this.f49683c = z;
        setBackground(z ? fc2.m124971a(889192447, qa00.f156322i, false) : null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73752b(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(bnl0.m105587w(34.0f), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(bnl0.m105587w(34.0f), 1073741824);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            measureChildWithMargins(getChildAt(i3), iMakeMeasureSpec, 0, iMakeMeasureSpec2, 0);
        }
        setMeasuredDimension(iMakeMeasureSpec, iMakeMeasureSpec2);
    }
}
