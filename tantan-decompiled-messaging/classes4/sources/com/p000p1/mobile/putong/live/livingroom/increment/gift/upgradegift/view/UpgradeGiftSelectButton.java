package com.p000p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;
import l.hxs;
import l.xdl0;
import p002l.otj0;
import p002l.xsj0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class UpgradeGiftSelectButton extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f6293a;

    /* JADX INFO: renamed from: b */
    public TextView f6294b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f6295c;

    /* JADX INFO: renamed from: d */
    public TextView f6296d;

    /* JADX INFO: renamed from: e */
    public ProgressBar f6297e;

    public UpgradeGiftSelectButton(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m7937b(View view) {
        otj0.m19744a(this, view);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: c */
    public void m7938c(final xsj0 xsj0Var) {
        BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItemM26104d = xsj0Var.m26104d();
        hxs.s("context_livingAct", this.f6293a, bLiveUpgradeGiftInfoItemM26104d.getTargetRedLevel().getStatusBtnUrl(bLiveUpgradeGiftInfoItemM26104d.status));
        if (bLiveUpgradeGiftInfoItemM26104d.isEquipped()) {
            xdl0.M(this.f6295c, false);
            xdl0.M(this.f6294b, true);
            this.f6294b.setText(R$string.f3128Ye);
            this.f6294b.setTextColor(Color.parseColor("#99ffffff"));
            setOnClickListener(null);
            return;
        }
        if (bLiveUpgradeGiftInfoItemM26104d.isUnLocked()) {
            xdl0.M(this.f6295c, false);
            xdl0.M(this.f6294b, true);
            this.f6294b.setText(R$string.f3107Xe);
            this.f6294b.setTextColor(Color.parseColor("#512000"));
            setOnClickListener(new View.OnClickListener() { // from class: l.ntj0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xsj0 xsj0Var2 = xsj0Var;
                    xsj0Var2.f10626a.mo7891b(xsj0Var2);
                }
            });
            return;
        }
        if (bLiveUpgradeGiftInfoItemM26104d.isUnLocking() || bLiveUpgradeGiftInfoItemM26104d.isLocked()) {
            xdl0.M(this.f6295c, true);
            xdl0.M(this.f6294b, false);
            String string = getContext().getString(R$string.f2811Je);
            this.f6296d.setText(string + " " + bLiveUpgradeGiftInfoItemM26104d.accumulatedScore + "/" + bLiveUpgradeGiftInfoItemM26104d.entranceScore);
            this.f6297e.setProgress(bLiveUpgradeGiftInfoItemM26104d.getUnlockProgress());
            setOnClickListener(null);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7937b(this);
    }

    public UpgradeGiftSelectButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UpgradeGiftSelectButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
