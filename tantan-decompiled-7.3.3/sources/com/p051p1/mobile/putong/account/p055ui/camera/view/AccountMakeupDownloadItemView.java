package com.p051p1.mobile.putong.account.p055ui.camera.view;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.account.p055ui.camera.adapter.AccountMakeupPageAdapter;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;
import p153l.C20379tr;
import p153l.bbc0;
import p153l.bnl0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountMakeupDownloadItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public AccountMakeupDownloadItemView f17570a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f17571b;

    /* JADX INFO: renamed from: c */
    public ImageView f17572c;

    /* JADX INFO: renamed from: d */
    public ImageView f17573d;

    /* JADX INFO: renamed from: e */
    public VText f17574e;

    /* JADX INFO: renamed from: f */
    public VText f17575f;

    /* JADX INFO: renamed from: g */
    public AnimationDrawable f17576g;

    public AccountMakeupDownloadItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m30053a(View view) {
        C20379tr.m192382a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m30054b(AccountMakeupPageAdapter.MakeupItem makeupItem, boolean z) {
        bnl0.m105524M(this.f17571b, true);
        bnl0.m105524M(this.f17575f, false);
        bnl0.m105524M(this.f17573d, false);
        bnl0.m105524M(this.f17574e, true);
        bnl0.m105524M(this.f17572c, false);
        this.f17571b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        VDraweeView vDraweeView = this.f17571b;
        if (z) {
            vDraweeView.setActualImageResource(makeupItem.selectedImgId);
        } else {
            vDraweeView.setActualImageResource(makeupItem.normalImgId);
        }
        this.f17574e.setText(makeupItem.name);
    }

    /* JADX INFO: renamed from: c */
    public void m30055c(AccountMakeupPageAdapter.MakeupItem makeupItem, boolean z, boolean z2) {
        bnl0.m105524M(this.f17571b, true);
        bnl0.m105524M(this.f17575f, z2);
        bnl0.m105524M(this.f17573d, z);
        bnl0.m105524M(this.f17574e, true);
        if (makeupItem.hasModelFile || makeupItem.state != 1) {
            int i = makeupItem.state;
            if (i == 2) {
                bnl0.m105524M(this.f17572c, true);
                this.f17572c.setImageResource(bbc0.f75810J);
                AnimationDrawable animationDrawable = (AnimationDrawable) this.f17572c.getDrawable();
                this.f17576g = animationDrawable;
                animationDrawable.start();
            } else if (i == 4) {
                if (NullChecker.m82486a(this.f17576g)) {
                    this.f17576g.stop();
                }
                bnl0.m105524M(this.f17572c, true);
                this.f17572c.setImageResource(bbc0.f75807I);
            } else {
                this.f17572c.setVisibility(8);
                if (NullChecker.m82486a(this.f17576g)) {
                    this.f17576g.stop();
                }
            }
        } else {
            bnl0.m105524M(this.f17572c, true);
            this.f17572c.setImageResource(bbc0.f75807I);
        }
        if (TextUtils.isEmpty(makeupItem.icon)) {
            this.f17571b.setActualImageResource(makeupItem.normalImgId);
        } else {
            uqb0.f180374G.m127115L0(this.f17571b, makeupItem.icon);
        }
        this.f17571b.setBackgroundResource(bbc0.f75798F);
        this.f17574e.setText(makeupItem.name);
        this.f17575f.setText(String.valueOf((int) (makeupItem.all * 100.0f)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m30053a(this);
    }

    public AccountMakeupDownloadItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountMakeupDownloadItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
