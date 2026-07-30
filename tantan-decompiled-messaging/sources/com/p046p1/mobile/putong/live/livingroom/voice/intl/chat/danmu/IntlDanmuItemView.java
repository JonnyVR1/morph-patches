package com.p046p1.mobile.putong.live.livingroom.voice.intl.chat.danmu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.g5c0;
import p149l.hxs;
import p149l.t100;
import p149l.xdl0;
import p149l.yb2;

/* JADX INFO: loaded from: classes5.dex */
public class IntlDanmuItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53090a;

    /* JADX INFO: renamed from: b */
    public View f53091b;

    public IntlDanmuItemView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53090a = (VDraweeView) findViewById(g5c0.f100641A2);
        this.f53091b = findViewById(g5c0.f100723J3);
    }

    /* JADX INFO: renamed from: p */
    public void m78091p(BLiveDanmakuListItem bLiveDanmakuListItem, boolean z) {
        hxs.m133412y(this.f53090a, bLiveDanmakuListItem.iconUrl);
        xdl0.m208344M(this.f53091b, TEnum.equals(bLiveDanmakuListItem.status, "locked"));
        setBackground(z ? yb2.m213876a(889192447, t100.f167260i, false) : null);
    }

    public IntlDanmuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlDanmuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
