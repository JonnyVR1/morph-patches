package com.p000p1.mobile.putong.core.p004ui.settings.filter;

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
import l.k9c0;
import l.mqa;
import l.pne0;
import l.t100;
import l.xdl0;
import v.VSwitch;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SettingsFilterItemWithInfo extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TextView f5832d;

    /* JADX INFO: renamed from: e */
    public TextView f5833e;

    /* JADX INFO: renamed from: f */
    public View f5834f;

    /* JADX INFO: renamed from: g */
    public VSwitch f5835g;

    /* JADX INFO: renamed from: h */
    public String f5836h;

    /* JADX INFO: renamed from: i */
    public int f5837i;

    /* JADX INFO: renamed from: j */
    public String f5838j;

    /* JADX INFO: renamed from: k */
    public int f5839k;

    /* JADX INFO: renamed from: l */
    @DrawableRes
    public int f5840l;

    /* JADX WARN: Multi-variable type inference failed */
    public SettingsFilterItemWithInfo(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k9c0.E, i, 0);
        this.f5836h = typedArrayObtainStyledAttributes.getString(k9c0.H);
        this.f5837i = typedArrayObtainStyledAttributes.getResourceId(k9c0.H, -1);
        this.f5840l = typedArrayObtainStyledAttributes.getResourceId(k9c0.F, 0);
        this.f5838j = typedArrayObtainStyledAttributes.getString(k9c0.G);
        this.f5839k = typedArrayObtainStyledAttributes.getResourceId(k9c0.G, -1);
        typedArrayObtainStyledAttributes.recycle();
        init();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        int i = t100.m;
        setPadding(i, i, i, i);
        m8733h0(LayoutInflater.from(getContext()), this);
        this.f5832d.setText(this.f5836h);
        this.f5833e.setText(this.f5838j);
        int i2 = this.f5837i;
        if (i2 != -1) {
            this.f5832d.setText(i2);
        }
        int i3 = this.f5839k;
        TextView textView = this.f5833e;
        if (i3 != -1) {
            textView.setText(i3);
            this.f5833e.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        if (this.f5840l != 0) {
            mqa.a(this.f5832d, getContext().getResources().getDrawable(this.f5840l));
        }
    }

    /* JADX INFO: renamed from: h0 */
    public View m8733h0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pne0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i0 */
    public void m8734i0() {
        this.f5833e.setVisibility(8);
    }

    /* JADX INFO: renamed from: j0 */
    public void m8735j0(boolean z) {
        if (NullChecker.a(this.f5834f)) {
            xdl0.M(this.f5834f, z);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setSubTitleText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.f5833e;
        if (zIsEmpty) {
            textView.setText("");
            this.f5833e.setVisibility(8);
        } else {
            textView.setText(charSequence);
            this.f5833e.setVisibility(0);
        }
    }

    public void setSubtitleTextColor(@ColorInt int i) {
        this.f5833e.setTextColor(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTitleIconRes(int i) {
        if (i != 0) {
            this.f5840l = i;
            mqa.a(this.f5832d, getContext().getResources().getDrawable(i));
        }
    }

    public void setTitleTextColor(@ColorInt int i) {
        this.f5832d.setTextColor(i);
    }

    public SettingsFilterItemWithInfo(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SettingsFilterItemWithInfo(Context context) {
        this(context, null, 0);
    }
}
