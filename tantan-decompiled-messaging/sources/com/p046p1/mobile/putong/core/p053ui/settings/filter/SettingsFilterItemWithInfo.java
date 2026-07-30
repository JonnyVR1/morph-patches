package com.p046p1.mobile.putong.core.p053ui.settings.filter;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tantanapp.common.utils.NullChecker;
import p147v.VSwitch;
import p149l.k9c0;
import p149l.mqa;
import p149l.pne0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class SettingsFilterItemWithInfo extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TextView f36051d;

    /* JADX INFO: renamed from: e */
    public TextView f36052e;

    /* JADX INFO: renamed from: f */
    public View f36053f;

    /* JADX INFO: renamed from: g */
    public VSwitch f36054g;

    /* JADX INFO: renamed from: h */
    public String f36055h;

    /* JADX INFO: renamed from: i */
    public int f36056i;

    /* JADX INFO: renamed from: j */
    public String f36057j;

    /* JADX INFO: renamed from: k */
    public int f36058k;

    /* JADX INFO: renamed from: l */
    @DrawableRes
    public int f36059l;

    public SettingsFilterItemWithInfo(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k9c0.f121937E, i, 0);
        this.f36055h = typedArrayObtainStyledAttributes.getString(k9c0.f121940H);
        this.f36056i = typedArrayObtainStyledAttributes.getResourceId(k9c0.f121940H, -1);
        this.f36059l = typedArrayObtainStyledAttributes.getResourceId(k9c0.f121938F, 0);
        this.f36057j = typedArrayObtainStyledAttributes.getString(k9c0.f121939G);
        this.f36058k = typedArrayObtainStyledAttributes.getResourceId(k9c0.f121939G, -1);
        typedArrayObtainStyledAttributes.recycle();
        init();
    }

    private void init() {
        int i = t100.f167264m;
        setPadding(i, i, i, i);
        m55360h0(LayoutInflater.from(getContext()), this);
        this.f36051d.setText(this.f36055h);
        this.f36052e.setText(this.f36057j);
        int i2 = this.f36056i;
        if (i2 != -1) {
            this.f36051d.setText(i2);
        }
        int i3 = this.f36058k;
        TextView textView = this.f36052e;
        if (i3 != -1) {
            textView.setText(i3);
            this.f36052e.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        if (this.f36059l != 0) {
            mqa.m155878a(this.f36051d, getContext().getResources().getDrawable(this.f36059l));
        }
    }

    /* JADX INFO: renamed from: h0 */
    public View m55360h0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pne0.m170406b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i0 */
    public void m55361i0() {
        this.f36052e.setVisibility(8);
    }

    /* JADX INFO: renamed from: j0 */
    public void m55362j0(boolean z) {
        if (NullChecker.m81303a(this.f36053f)) {
            xdl0.m208344M(this.f36053f, z);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setSubTitleText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.f36052e;
        if (zIsEmpty) {
            textView.setText("");
            this.f36052e.setVisibility(8);
        } else {
            textView.setText(charSequence);
            this.f36052e.setVisibility(0);
        }
    }

    public void setSubtitleTextColor(@ColorInt int i) {
        this.f36052e.setTextColor(i);
    }

    public void setTitleIconRes(int i) {
        if (i != 0) {
            this.f36059l = i;
            mqa.m155878a(this.f36051d, getContext().getResources().getDrawable(i));
        }
    }

    public void setTitleTextColor(@ColorInt int i) {
        this.f36051d.setTextColor(i);
    }

    public SettingsFilterItemWithInfo(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SettingsFilterItemWithInfo(Context context) {
        this(context, null, 0);
    }
}
