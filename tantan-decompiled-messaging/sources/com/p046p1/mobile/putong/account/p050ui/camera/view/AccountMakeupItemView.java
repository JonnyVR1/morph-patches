package com.p046p1.mobile.putong.account.p050ui.camera.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.account.p050ui.camera.adapter.AccountMakeupPageAdapter;
import p147v.VDraweeView;
import p147v.VText;
import p149l.C15949bs;
import p149l.qib0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountMakeupItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public AccountMakeupItemView f16858a;

    /* JADX INFO: renamed from: b */
    public ImageView f16859b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f16860c;

    /* JADX INFO: renamed from: d */
    public ImageView f16861d;

    /* JADX INFO: renamed from: e */
    public VText f16862e;

    /* JADX INFO: renamed from: f */
    public TextView f16863f;

    public AccountMakeupItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m29057a(View view) {
        C15949bs.m103607a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m29058b(AccountMakeUpMenuView.MakeupCategory makeupCategory, boolean z) {
        xdl0.m208345M0(this.f16859b, true);
        xdl0.m208345M0(this.f16860c, false);
        xdl0.m208345M0(this.f16863f, !makeupCategory.isNone());
        xdl0.m208345M0(this.f16862e, true);
        xdl0.m208345M0(this.f16861d, false);
        ImageView imageView = this.f16859b;
        if (z) {
            imageView.setImageResource(makeupCategory.selectedImgId);
        } else {
            imageView.setImageResource(makeupCategory.normalImgId);
        }
        this.f16859b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f16862e.setText(makeupCategory.name);
        this.f16863f.setText(String.valueOf((int) (makeupCategory.all * 100.0f)));
    }

    /* JADX INFO: renamed from: c */
    public void m29059c(AccountMakeupPageAdapter.MakeupItem makeupItem, boolean z) {
        xdl0.m208345M0(this.f16859b, true);
        xdl0.m208345M0(this.f16860c, false);
        xdl0.m208345M0(this.f16863f, false);
        xdl0.m208345M0(this.f16861d, false);
        xdl0.m208345M0(this.f16862e, true);
        this.f16859b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ImageView imageView = this.f16859b;
        if (z) {
            imageView.setImageResource(makeupItem.selectedImgId);
        } else {
            imageView.setImageResource(makeupItem.normalImgId);
        }
        this.f16862e.setText(makeupItem.name);
    }

    /* JADX INFO: renamed from: d */
    public void m29060d(AccountMakeupPageAdapter.MakeupItem makeupItem, boolean z, boolean z2) {
        xdl0.m208345M0(this.f16860c, true);
        xdl0.m208345M0(this.f16859b, true);
        xdl0.m208345M0(this.f16863f, z2);
        xdl0.m208345M0(this.f16861d, z);
        xdl0.m208345M0(this.f16862e, true);
        if (makeupItem.isLocal()) {
            xdl0.m208345M0(this.f16859b, false);
            xdl0.m208345M0(this.f16860c, true);
            this.f16860c.setActualImageResource(makeupItem.normalImgId);
        } else if (TextUtils.isEmpty(makeupItem.icon)) {
            xdl0.m208345M0(this.f16860c, false);
            this.f16859b.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f16859b.setImageResource(makeupItem.normalImgId);
        } else {
            xdl0.m208345M0(this.f16859b, false);
            qib0.f154691G.m102331L0(this.f16860c, makeupItem.icon);
        }
        this.f16862e.setText(makeupItem.name);
        this.f16863f.setText(String.valueOf((int) (makeupItem.all * 100.0f)));
    }

    /* JADX INFO: renamed from: e */
    public void m29061e(AccountMakeupPageAdapter.MakeupItem makeupItem, boolean z, boolean z2) {
        xdl0.m208345M0(this.f16863f, z2);
        xdl0.m208345M0(this.f16861d, false);
        xdl0.m208345M0(this.f16862e, true);
        xdl0.m208345M0(this.f16859b, true);
        xdl0.m208345M0(this.f16860c, false);
        ImageView imageView = this.f16859b;
        if (z) {
            imageView.setImageResource(makeupItem.selectedImgId);
        } else {
            imageView.setImageResource(makeupItem.normalImgId);
        }
        this.f16859b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f16862e.setText(makeupItem.name);
        this.f16863f.setText(String.valueOf((int) (makeupItem.all * 100.0f)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m29057a(this);
    }

    public void setValue(int i) {
        xdl0.m208345M0(this.f16863f, true);
        this.f16863f.setText(String.valueOf(i));
    }

    public AccountMakeupItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountMakeupItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
