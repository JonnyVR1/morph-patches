package com.p046p1.mobile.putong.account.p050ui.camera.view;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.account.p050ui.camera.adapter.AccountMakeupPageAdapter;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;
import p149l.C21756zr;
import p149l.qib0;
import p149l.v2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountMakeupDownloadItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public AccountMakeupDownloadItemView f16851a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f16852b;

    /* JADX INFO: renamed from: c */
    public ImageView f16853c;

    /* JADX INFO: renamed from: d */
    public ImageView f16854d;

    /* JADX INFO: renamed from: e */
    public VText f16855e;

    /* JADX INFO: renamed from: f */
    public VText f16856f;

    /* JADX INFO: renamed from: g */
    public AnimationDrawable f16857g;

    public AccountMakeupDownloadItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m29054a(View view) {
        C21756zr.m219914a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m29055b(AccountMakeupPageAdapter.MakeupItem makeupItem, boolean z) {
        xdl0.m208344M(this.f16852b, true);
        xdl0.m208344M(this.f16856f, false);
        xdl0.m208344M(this.f16854d, false);
        xdl0.m208344M(this.f16855e, true);
        xdl0.m208344M(this.f16853c, false);
        this.f16852b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        VDraweeView vDraweeView = this.f16852b;
        if (z) {
            vDraweeView.setActualImageResource(makeupItem.selectedImgId);
        } else {
            vDraweeView.setActualImageResource(makeupItem.normalImgId);
        }
        this.f16855e.setText(makeupItem.name);
    }

    /* JADX INFO: renamed from: c */
    public void m29056c(AccountMakeupPageAdapter.MakeupItem makeupItem, boolean z, boolean z2) {
        xdl0.m208344M(this.f16852b, true);
        xdl0.m208344M(this.f16856f, z2);
        xdl0.m208344M(this.f16854d, z);
        xdl0.m208344M(this.f16855e, true);
        if (makeupItem.hasModelFile || makeupItem.state != 1) {
            int i = makeupItem.state;
            if (i == 2) {
                xdl0.m208344M(this.f16853c, true);
                this.f16853c.setImageResource(v2c0.f179404J);
                AnimationDrawable animationDrawable = (AnimationDrawable) this.f16853c.getDrawable();
                this.f16857g = animationDrawable;
                animationDrawable.start();
            } else if (i == 4) {
                if (NullChecker.m81303a(this.f16857g)) {
                    this.f16857g.stop();
                }
                xdl0.m208344M(this.f16853c, true);
                this.f16853c.setImageResource(v2c0.f179401I);
            } else {
                this.f16853c.setVisibility(8);
                if (NullChecker.m81303a(this.f16857g)) {
                    this.f16857g.stop();
                }
            }
        } else {
            xdl0.m208344M(this.f16853c, true);
            this.f16853c.setImageResource(v2c0.f179401I);
        }
        if (TextUtils.isEmpty(makeupItem.icon)) {
            this.f16852b.setActualImageResource(makeupItem.normalImgId);
        } else {
            qib0.f154691G.m102331L0(this.f16852b, makeupItem.icon);
        }
        this.f16852b.setBackgroundResource(v2c0.f179392F);
        this.f16855e.setText(makeupItem.name);
        this.f16856f.setText(String.valueOf((int) (makeupItem.all * 100.0f)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m29054a(this);
    }

    public AccountMakeupDownloadItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountMakeupDownloadItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
