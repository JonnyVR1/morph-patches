package com.p000p1.mobile.putong.account.p002ui.camera.view;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.p002ui.camera.adapter.AccountMakeupPageAdapter;
import com.tantanapp.common.utils.NullChecker;
import l.xdl0;
import p006l.C1539zr;
import p006l.qib0;
import p006l.v2c0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountMakeupDownloadItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public AccountMakeupDownloadItemView f840a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f841b;

    /* JADX INFO: renamed from: c */
    public ImageView f842c;

    /* JADX INFO: renamed from: d */
    public ImageView f843d;

    /* JADX INFO: renamed from: e */
    public VText f844e;

    /* JADX INFO: renamed from: f */
    public VText f845f;

    /* JADX INFO: renamed from: g */
    public AnimationDrawable f846g;

    public AccountMakeupDownloadItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m960a(View view) {
        C1539zr.m28792a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m961b(AccountMakeupPageAdapter.MakeupItem makeupItem, boolean z) {
        xdl0.M(this.f841b, true);
        xdl0.M(this.f845f, false);
        xdl0.M(this.f843d, false);
        xdl0.M(this.f844e, true);
        xdl0.M(this.f842c, false);
        this.f841b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        VDraweeView vDraweeView = this.f841b;
        if (z) {
            vDraweeView.setActualImageResource(makeupItem.selectedImgId);
        } else {
            vDraweeView.setActualImageResource(makeupItem.normalImgId);
        }
        this.f844e.setText(makeupItem.name);
    }

    /* JADX INFO: renamed from: c */
    public void m962c(AccountMakeupPageAdapter.MakeupItem makeupItem, boolean z, boolean z2) {
        xdl0.M(this.f841b, true);
        xdl0.M(this.f845f, z2);
        xdl0.M(this.f843d, z);
        xdl0.M(this.f844e, true);
        if (makeupItem.hasModelFile || makeupItem.state != 1) {
            int i = makeupItem.state;
            if (i == 2) {
                xdl0.M(this.f842c, true);
                this.f842c.setImageResource(v2c0.f23968J);
                AnimationDrawable animationDrawable = (AnimationDrawable) this.f842c.getDrawable();
                this.f846g = animationDrawable;
                animationDrawable.start();
            } else if (i == 4) {
                if (NullChecker.a(this.f846g)) {
                    this.f846g.stop();
                }
                xdl0.M(this.f842c, true);
                this.f842c.setImageResource(v2c0.f23965I);
            } else {
                this.f842c.setVisibility(8);
                if (NullChecker.a(this.f846g)) {
                    this.f846g.stop();
                }
            }
        } else {
            xdl0.M(this.f842c, true);
            this.f842c.setImageResource(v2c0.f23965I);
        }
        if (TextUtils.isEmpty(makeupItem.icon)) {
            this.f841b.setActualImageResource(makeupItem.normalImgId);
        } else {
            qib0.f19782G.m12744L0(this.f841b, makeupItem.icon);
        }
        this.f841b.setBackgroundResource(v2c0.f23956F);
        this.f844e.setText(makeupItem.name);
        this.f845f.setText(String.valueOf((int) (makeupItem.all * 100.0f)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m960a(this);
    }

    public AccountMakeupDownloadItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountMakeupDownloadItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
