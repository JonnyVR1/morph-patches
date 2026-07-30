package com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal.NormalDanmakuListItem;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.fc2;
import p153l.izs;
import p153l.kv40;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class NormalDanmakuListItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f49685a;

    /* JADX INFO: renamed from: b */
    public VImage f49686b;

    /* JADX INFO: renamed from: c */
    public BLiveDanmakuListItem f49687c;

    /* JADX INFO: renamed from: d */
    public boolean f49688d;

    public NormalDanmakuListItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49687c = null;
        this.f49688d = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m73756b(View view) {
        kv40.m151653a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m73757c(BLiveDanmakuListItem bLiveDanmakuListItem, boolean z, final y20<NormalDanmakuListItem> y20Var) {
        this.f49687c = bLiveDanmakuListItem;
        izs.m142870u("context_livingAct", this.f49685a, bLiveDanmakuListItem.iconUrl, qa00.m175859d(34.0f), qa00.m175859d(34.0f));
        bnl0.m105524M(this.f49686b, TEnum.equals(bLiveDanmakuListItem.status, "locked"));
        m73758d(z);
        setOnClickListener(new View.OnClickListener() { // from class: l.jv40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call((NormalDanmakuListItem) view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public void m73758d(boolean z) {
        this.f49688d = z;
        setBackground(z ? fc2.m124971a(889192447, qa00.f156322i, false) : null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73756b(this);
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
