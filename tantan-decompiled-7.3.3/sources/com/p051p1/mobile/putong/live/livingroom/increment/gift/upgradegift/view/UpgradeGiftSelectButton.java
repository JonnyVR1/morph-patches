package com.p051p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

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
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p153l.a2k0;
import p153l.bnl0;
import p153l.izs;
import p153l.r2k0;

/* JADX INFO: loaded from: classes4.dex */
public class UpgradeGiftSelectButton extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f51099a;

    /* JADX INFO: renamed from: b */
    public TextView f51100b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f51101c;

    /* JADX INFO: renamed from: d */
    public TextView f51102d;

    /* JADX INFO: renamed from: e */
    public ProgressBar f51103e;

    public UpgradeGiftSelectButton(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m75539b(View view) {
        r2k0.m179542a(this, view);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: c */
    public void m75540c(final a2k0 a2k0Var) {
        BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItemM95710d = a2k0Var.m95710d();
        izs.m142868s("context_livingAct", this.f51099a, bLiveUpgradeGiftInfoItemM95710d.getTargetRedLevel().getStatusBtnUrl(bLiveUpgradeGiftInfoItemM95710d.status));
        if (bLiveUpgradeGiftInfoItemM95710d.isEquipped()) {
            bnl0.m105524M(this.f51101c, false);
            bnl0.m105524M(this.f51100b, true);
            this.f51100b.setText(R$string.f47934Ye);
            this.f51100b.setTextColor(Color.parseColor("#99ffffff"));
            setOnClickListener(null);
            return;
        }
        if (bLiveUpgradeGiftInfoItemM95710d.isUnLocked()) {
            bnl0.m105524M(this.f51101c, false);
            bnl0.m105524M(this.f51100b, true);
            this.f51100b.setText(R$string.f47913Xe);
            this.f51100b.setTextColor(Color.parseColor("#512000"));
            setOnClickListener(new View.OnClickListener() { // from class: l.q2k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a2k0 a2k0Var2 = a2k0Var;
                    a2k0Var2.f112532a.mo75493b(a2k0Var2);
                }
            });
            return;
        }
        if (bLiveUpgradeGiftInfoItemM95710d.isUnLocking() || bLiveUpgradeGiftInfoItemM95710d.isLocked()) {
            bnl0.m105524M(this.f51101c, true);
            bnl0.m105524M(this.f51100b, false);
            String string = getContext().getString(R$string.f47617Je);
            this.f51102d.setText(string + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + bLiveUpgradeGiftInfoItemM95710d.accumulatedScore + "/" + bLiveUpgradeGiftInfoItemM95710d.entranceScore);
            this.f51103e.setProgress(bLiveUpgradeGiftInfoItemM95710d.getUnlockProgress());
            setOnClickListener(null);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75539b(this);
    }

    public UpgradeGiftSelectButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UpgradeGiftSelectButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
