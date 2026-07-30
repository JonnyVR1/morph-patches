package com.p051p1.mobile.putong.core.p058ui.gift.act;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.NewGiftWall;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.i1k;
import p153l.m1k;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class GiftWallOptItemVIew extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f30037a;

    /* JADX INFO: renamed from: b */
    public TextView f30038b;

    /* JADX INFO: renamed from: c */
    public VText f30039c;

    public GiftWallOptItemVIew(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m46607a(View view) {
        m1k.m156697a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m46608b(NewGiftWall newGiftWall) {
        int i = newGiftWall.count;
        VText vText = this.f30039c;
        if (i > 0) {
            vText.setText(String.format("%d", Integer.valueOf(i)));
            bnl0.m105524M(this.f30039c, true);
        } else {
            bnl0.m105524M(vText, false);
        }
        uqb0.f180374G.m127109I0(this.f30037a, newGiftWall.giftInfo.url, qa00.m175859d(62.0f), qa00.m175859d(62.0f));
        this.f30038b.setText(newGiftWall.giftInfo.name);
        i1k.m138106c(newGiftWall.giftInfo);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46607a(this);
    }

    public GiftWallOptItemVIew(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftWallOptItemVIew(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
