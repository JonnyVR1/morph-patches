package com.p051p1.mobile.putong.core.p058ui.settings.filter;

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
import p151v.VSwitch;
import p153l.bnl0;
import p153l.qa00;
import p153l.rhc0;
import p153l.wve0;
import p153l.yra;

/* JADX INFO: loaded from: classes12.dex */
public class SettingsFilterItemWithInfo extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TextView f36899d;

    /* JADX INFO: renamed from: e */
    public TextView f36900e;

    /* JADX INFO: renamed from: f */
    public View f36901f;

    /* JADX INFO: renamed from: g */
    public VSwitch f36902g;

    /* JADX INFO: renamed from: h */
    public String f36903h;

    /* JADX INFO: renamed from: i */
    public int f36904i;

    /* JADX INFO: renamed from: j */
    public String f36905j;

    /* JADX INFO: renamed from: k */
    public int f36906k;

    /* JADX INFO: renamed from: l */
    @DrawableRes
    public int f36907l;

    public SettingsFilterItemWithInfo(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, rhc0.f163098E, i, 0);
        this.f36903h = typedArrayObtainStyledAttributes.getString(rhc0.f163101H);
        this.f36904i = typedArrayObtainStyledAttributes.getResourceId(rhc0.f163101H, -1);
        this.f36907l = typedArrayObtainStyledAttributes.getResourceId(rhc0.f163099F, 0);
        this.f36905j = typedArrayObtainStyledAttributes.getString(rhc0.f163100G);
        this.f36906k = typedArrayObtainStyledAttributes.getResourceId(rhc0.f163100G, -1);
        typedArrayObtainStyledAttributes.recycle();
        init();
    }

    private void init() {
        int i = qa00.f156326m;
        setPadding(i, i, i, i);
        m56543h0(LayoutInflater.from(getContext()), this);
        this.f36899d.setText(this.f36903h);
        this.f36900e.setText(this.f36905j);
        int i2 = this.f36904i;
        if (i2 != -1) {
            this.f36899d.setText(i2);
        }
        int i3 = this.f36906k;
        TextView textView = this.f36900e;
        if (i3 != -1) {
            textView.setText(i3);
            this.f36900e.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        if (this.f36907l != 0) {
            yra.m217164a(this.f36899d, getContext().getResources().getDrawable(this.f36907l));
        }
    }

    /* JADX INFO: renamed from: h0 */
    public View m56543h0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wve0.m208067b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i0 */
    public void m56544i0() {
        this.f36900e.setVisibility(8);
    }

    /* JADX INFO: renamed from: j0 */
    public void m56545j0(boolean z) {
        if (NullChecker.m82486a(this.f36901f)) {
            bnl0.m105524M(this.f36901f, z);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setSubTitleText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.f36900e;
        if (zIsEmpty) {
            textView.setText("");
            this.f36900e.setVisibility(8);
        } else {
            textView.setText(charSequence);
            this.f36900e.setVisibility(0);
        }
    }

    public void setSubtitleTextColor(@ColorInt int i) {
        this.f36900e.setTextColor(i);
    }

    public void setTitleIconRes(int i) {
        if (i != 0) {
            this.f36907l = i;
            yra.m217164a(this.f36899d, getContext().getResources().getDrawable(i));
        }
    }

    public void setTitleTextColor(@ColorInt int i) {
        this.f36899d.setTextColor(i);
    }

    public SettingsFilterItemWithInfo(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SettingsFilterItemWithInfo(Context context) {
        this(context, null, 0);
    }
}
