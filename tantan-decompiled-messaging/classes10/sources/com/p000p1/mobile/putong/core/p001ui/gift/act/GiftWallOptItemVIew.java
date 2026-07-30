package com.p000p1.mobile.putong.core.p001ui.gift.act;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.NewGiftWall;
import l.qib0;
import l.t100;
import l.xdl0;
import p003l.syj;
import p003l.wyj;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GiftWallOptItemVIew extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f1583a;

    /* JADX INFO: renamed from: b */
    public TextView f1584b;

    /* JADX INFO: renamed from: c */
    public VText f1585c;

    public GiftWallOptItemVIew(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m2754a(View view) {
        wyj.m10607a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m2755b(NewGiftWall newGiftWall) {
        int i = newGiftWall.count;
        VText vText = this.f1585c;
        if (i > 0) {
            vText.setText(String.format("%d", Integer.valueOf(i)));
            xdl0.M(this.f1585c, true);
        } else {
            xdl0.M(vText, false);
        }
        qib0.G.I0(this.f1583a, newGiftWall.giftInfo.url, t100.d(62.0f), t100.d(62.0f));
        this.f1584b.setText(newGiftWall.giftInfo.name);
        syj.m9507c(newGiftWall.giftInfo);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2754a(this);
    }

    public GiftWallOptItemVIew(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftWallOptItemVIew(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
