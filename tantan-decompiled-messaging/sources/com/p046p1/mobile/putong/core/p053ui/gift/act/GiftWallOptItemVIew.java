package com.p046p1.mobile.putong.core.p053ui.gift.act;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.NewGiftWall;
import p147v.VDraweeView;
import p147v.VText;
import p149l.qib0;
import p149l.syj;
import p149l.t100;
import p149l.wyj;
import p149l.xdl0;

/* JADX INFO: loaded from: classes10.dex */
public class GiftWallOptItemVIew extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f29189a;

    /* JADX INFO: renamed from: b */
    public TextView f29190b;

    /* JADX INFO: renamed from: c */
    public VText f29191c;

    public GiftWallOptItemVIew(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m45424a(View view) {
        wyj.m206110a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m45425b(NewGiftWall newGiftWall) {
        int i = newGiftWall.count;
        VText vText = this.f29191c;
        if (i > 0) {
            vText.setText(String.format("%d", Integer.valueOf(i)));
            xdl0.m208344M(this.f29191c, true);
        } else {
            xdl0.m208344M(vText, false);
        }
        qib0.f154691G.m102325I0(this.f29189a, newGiftWall.giftInfo.url, t100.m186890d(62.0f), t100.m186890d(62.0f));
        this.f29190b.setText(newGiftWall.giftInfo.name);
        syj.m186674c(newGiftWall.giftInfo);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45424a(this);
    }

    public GiftWallOptItemVIew(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftWallOptItemVIew(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
