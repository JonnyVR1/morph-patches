package com.p051p1.mobile.putong.account.p055ui.camera.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.account.p055ui.camera.adapter.AccountMakeupPageAdapter;
import p151v.VDraweeView;
import p151v.VText;
import p153l.C20908vr;
import p153l.bnl0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountMakeupItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public AccountMakeupItemView f17577a;

    /* JADX INFO: renamed from: b */
    public ImageView f17578b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f17579c;

    /* JADX INFO: renamed from: d */
    public ImageView f17580d;

    /* JADX INFO: renamed from: e */
    public VText f17581e;

    /* JADX INFO: renamed from: f */
    public TextView f17582f;

    public AccountMakeupItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m30056a(View view) {
        C20908vr.m202463a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m30057b(AccountMakeUpMenuView.MakeupCategory makeupCategory, boolean z) {
        bnl0.m105525M0(this.f17578b, true);
        bnl0.m105525M0(this.f17579c, false);
        bnl0.m105525M0(this.f17582f, !makeupCategory.isNone());
        bnl0.m105525M0(this.f17581e, true);
        bnl0.m105525M0(this.f17580d, false);
        ImageView imageView = this.f17578b;
        if (z) {
            imageView.setImageResource(makeupCategory.selectedImgId);
        } else {
            imageView.setImageResource(makeupCategory.normalImgId);
        }
        this.f17578b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f17581e.setText(makeupCategory.name);
        this.f17582f.setText(String.valueOf((int) (makeupCategory.all * 100.0f)));
    }

    /* JADX INFO: renamed from: c */
    public void m30058c(AccountMakeupPageAdapter.MakeupItem makeupItem, boolean z) {
        bnl0.m105525M0(this.f17578b, true);
        bnl0.m105525M0(this.f17579c, false);
        bnl0.m105525M0(this.f17582f, false);
        bnl0.m105525M0(this.f17580d, false);
        bnl0.m105525M0(this.f17581e, true);
        this.f17578b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ImageView imageView = this.f17578b;
        if (z) {
            imageView.setImageResource(makeupItem.selectedImgId);
        } else {
            imageView.setImageResource(makeupItem.normalImgId);
        }
        this.f17581e.setText(makeupItem.name);
    }

    /* JADX INFO: renamed from: d */
    public void m30059d(AccountMakeupPageAdapter.MakeupItem makeupItem, boolean z, boolean z2) {
        bnl0.m105525M0(this.f17579c, true);
        bnl0.m105525M0(this.f17578b, true);
        bnl0.m105525M0(this.f17582f, z2);
        bnl0.m105525M0(this.f17580d, z);
        bnl0.m105525M0(this.f17581e, true);
        if (makeupItem.isLocal()) {
            bnl0.m105525M0(this.f17578b, false);
            bnl0.m105525M0(this.f17579c, true);
            this.f17579c.setActualImageResource(makeupItem.normalImgId);
        } else if (TextUtils.isEmpty(makeupItem.icon)) {
            bnl0.m105525M0(this.f17579c, false);
            this.f17578b.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f17578b.setImageResource(makeupItem.normalImgId);
        } else {
            bnl0.m105525M0(this.f17578b, false);
            uqb0.f180374G.m127115L0(this.f17579c, makeupItem.icon);
        }
        this.f17581e.setText(makeupItem.name);
        this.f17582f.setText(String.valueOf((int) (makeupItem.all * 100.0f)));
    }

    /* JADX INFO: renamed from: e */
    public void m30060e(AccountMakeupPageAdapter.MakeupItem makeupItem, boolean z, boolean z2) {
        bnl0.m105525M0(this.f17582f, z2);
        bnl0.m105525M0(this.f17580d, false);
        bnl0.m105525M0(this.f17581e, true);
        bnl0.m105525M0(this.f17578b, true);
        bnl0.m105525M0(this.f17579c, false);
        ImageView imageView = this.f17578b;
        if (z) {
            imageView.setImageResource(makeupItem.selectedImgId);
        } else {
            imageView.setImageResource(makeupItem.normalImgId);
        }
        this.f17578b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f17581e.setText(makeupItem.name);
        this.f17582f.setText(String.valueOf((int) (makeupItem.all * 100.0f)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m30056a(this);
    }

    public void setValue(int i) {
        bnl0.m105525M0(this.f17582f, true);
        this.f17582f.setText(String.valueOf(i));
    }

    public AccountMakeupItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountMakeupItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
