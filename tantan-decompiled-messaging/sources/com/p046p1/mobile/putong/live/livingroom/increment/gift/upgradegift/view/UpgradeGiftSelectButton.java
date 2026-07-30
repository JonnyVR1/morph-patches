package com.p046p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

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
import com.p046p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p149l.hxs;
import p149l.otj0;
import p149l.xdl0;
import p149l.xsj0;

/* JADX INFO: loaded from: classes4.dex */
public class UpgradeGiftSelectButton extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f50251a;

    /* JADX INFO: renamed from: b */
    public TextView f50252b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f50253c;

    /* JADX INFO: renamed from: d */
    public TextView f50254d;

    /* JADX INFO: renamed from: e */
    public ProgressBar f50255e;

    public UpgradeGiftSelectButton(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m74356b(View view) {
        otj0.m165946a(this, view);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: c */
    public void m74357c(final xsj0 xsj0Var) {
        BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItemM210777d = xsj0Var.m210777d();
        hxs.m133406s("context_livingAct", this.f50251a, bLiveUpgradeGiftInfoItemM210777d.getTargetRedLevel().getStatusBtnUrl(bLiveUpgradeGiftInfoItemM210777d.status));
        if (bLiveUpgradeGiftInfoItemM210777d.isEquipped()) {
            xdl0.m208344M(this.f50253c, false);
            xdl0.m208344M(this.f50252b, true);
            this.f50252b.setText(R$string.f47086Ye);
            this.f50252b.setTextColor(Color.parseColor("#99ffffff"));
            setOnClickListener(null);
            return;
        }
        if (bLiveUpgradeGiftInfoItemM210777d.isUnLocked()) {
            xdl0.m208344M(this.f50253c, false);
            xdl0.m208344M(this.f50252b, true);
            this.f50252b.setText(R$string.f47065Xe);
            this.f50252b.setTextColor(Color.parseColor("#512000"));
            setOnClickListener(new View.OnClickListener() { // from class: l.ntj0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xsj0 xsj0Var2 = xsj0Var;
                    xsj0Var2.f99083a.mo74310b(xsj0Var2);
                }
            });
            return;
        }
        if (bLiveUpgradeGiftInfoItemM210777d.isUnLocking() || bLiveUpgradeGiftInfoItemM210777d.isLocked()) {
            xdl0.m208344M(this.f50253c, true);
            xdl0.m208344M(this.f50252b, false);
            String string = getContext().getString(R$string.f46769Je);
            this.f50254d.setText(string + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + bLiveUpgradeGiftInfoItemM210777d.accumulatedScore + "/" + bLiveUpgradeGiftInfoItemM210777d.entranceScore);
            this.f50255e.setProgress(bLiveUpgradeGiftInfoItemM210777d.getUnlockProgress());
            setOnClickListener(null);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74356b(this);
    }

    public UpgradeGiftSelectButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UpgradeGiftSelectButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
