package com.p000p1.mobile.putong.account.p002ui.camera.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.p002ui.camera.adapter.AccountMakeupPageAdapter;
import l.xdl0;
import p006l.C0574bs;
import p006l.qib0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountMakeupItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public AccountMakeupItemView f847a;

    /* JADX INFO: renamed from: b */
    public ImageView f848b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f849c;

    /* JADX INFO: renamed from: d */
    public ImageView f850d;

    /* JADX INFO: renamed from: e */
    public VText f851e;

    /* JADX INFO: renamed from: f */
    public TextView f852f;

    public AccountMakeupItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m963a(View view) {
        C0574bs.m12896a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m964b(AccountMakeUpMenuView.MakeupCategory makeupCategory, boolean z) {
        xdl0.M0(this.f848b, true);
        xdl0.M0(this.f849c, false);
        xdl0.M0(this.f852f, !makeupCategory.isNone());
        xdl0.M0(this.f851e, true);
        xdl0.M0(this.f850d, false);
        ImageView imageView = this.f848b;
        if (z) {
            imageView.setImageResource(makeupCategory.selectedImgId);
        } else {
            imageView.setImageResource(makeupCategory.normalImgId);
        }
        this.f848b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f851e.setText(makeupCategory.name);
        this.f852f.setText(String.valueOf((int) (makeupCategory.all * 100.0f)));
    }

    /* JADX INFO: renamed from: c */
    public void m965c(AccountMakeupPageAdapter.MakeupItem makeupItem, boolean z) {
        xdl0.M0(this.f848b, true);
        xdl0.M0(this.f849c, false);
        xdl0.M0(this.f852f, false);
        xdl0.M0(this.f850d, false);
        xdl0.M0(this.f851e, true);
        this.f848b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ImageView imageView = this.f848b;
        if (z) {
            imageView.setImageResource(makeupItem.selectedImgId);
        } else {
            imageView.setImageResource(makeupItem.normalImgId);
        }
        this.f851e.setText(makeupItem.name);
    }

    /* JADX INFO: renamed from: d */
    public void m966d(AccountMakeupPageAdapter.MakeupItem makeupItem, boolean z, boolean z2) {
        xdl0.M0(this.f849c, true);
        xdl0.M0(this.f848b, true);
        xdl0.M0(this.f852f, z2);
        xdl0.M0(this.f850d, z);
        xdl0.M0(this.f851e, true);
        if (makeupItem.isLocal()) {
            xdl0.M0(this.f848b, false);
            xdl0.M0(this.f849c, true);
            this.f849c.setActualImageResource(makeupItem.normalImgId);
        } else if (TextUtils.isEmpty(makeupItem.icon)) {
            xdl0.M0(this.f849c, false);
            this.f848b.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f848b.setImageResource(makeupItem.normalImgId);
        } else {
            xdl0.M0(this.f848b, false);
            qib0.f19782G.m12744L0(this.f849c, makeupItem.icon);
        }
        this.f851e.setText(makeupItem.name);
        this.f852f.setText(String.valueOf((int) (makeupItem.all * 100.0f)));
    }

    /* JADX INFO: renamed from: e */
    public void m967e(AccountMakeupPageAdapter.MakeupItem makeupItem, boolean z, boolean z2) {
        xdl0.M0(this.f852f, z2);
        xdl0.M0(this.f850d, false);
        xdl0.M0(this.f851e, true);
        xdl0.M0(this.f848b, true);
        xdl0.M0(this.f849c, false);
        ImageView imageView = this.f848b;
        if (z) {
            imageView.setImageResource(makeupItem.selectedImgId);
        } else {
            imageView.setImageResource(makeupItem.normalImgId);
        }
        this.f848b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f851e.setText(makeupItem.name);
        this.f852f.setText(String.valueOf((int) (makeupItem.all * 100.0f)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m963a(this);
    }

    public void setValue(int i) {
        xdl0.M0(this.f852f, true);
        this.f852f.setText(String.valueOf(i));
    }

    public AccountMakeupItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountMakeupItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
