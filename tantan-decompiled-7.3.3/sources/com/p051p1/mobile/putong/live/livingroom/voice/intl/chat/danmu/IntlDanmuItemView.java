package com.p051p1.mobile.putong.live.livingroom.voice.intl.chat.danmu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.bnl0;
import p153l.fc2;
import p153l.izs;
import p153l.mdc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
public class IntlDanmuItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53938a;

    /* JADX INFO: renamed from: b */
    public View f53939b;

    public IntlDanmuItemView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53938a = (VDraweeView) findViewById(mdc0.f135886A2);
        this.f53939b = findViewById(mdc0.f135968J3);
    }

    /* JADX INFO: renamed from: p */
    public void m79274p(BLiveDanmakuListItem bLiveDanmakuListItem, boolean z) {
        izs.m142874y(this.f53938a, bLiveDanmakuListItem.iconUrl);
        bnl0.m105524M(this.f53939b, TEnum.equals(bLiveDanmakuListItem.status, "locked"));
        setBackground(z ? fc2.m124971a(889192447, qa00.f156322i, false) : null);
    }

    public IntlDanmuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlDanmuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
