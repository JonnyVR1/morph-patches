package com.p051p1.mobile.putong.core.p058ui.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import p151v.VSwitch;
import p153l.b0f0;
import p153l.bnl0;
import p153l.dbc0;
import p153l.khc0;
import p153l.p9r;
import p153l.q8g0;
import p153l.qa00;

/* JADX INFO: loaded from: classes12.dex */
public class SettingsItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f36702a;

    /* JADX INFO: renamed from: b */
    public TextView f36703b;

    /* JADX INFO: renamed from: c */
    public TextView f36704c;

    /* JADX INFO: renamed from: d */
    public VSwitch f36705d;

    /* JADX INFO: renamed from: e */
    public View f36706e;

    /* JADX INFO: renamed from: f */
    public ImageView f36707f;

    /* JADX INFO: renamed from: g */
    public String f36708g;

    /* JADX INFO: renamed from: h */
    public String f36709h;

    /* JADX INFO: renamed from: i */
    @StringRes
    public int f36710i;

    /* JADX INFO: renamed from: j */
    @StringRes
    public int f36711j;

    /* JADX INFO: renamed from: k */
    @DrawableRes
    public int f36712k;

    /* JADX INFO: renamed from: l */
    public boolean f36713l;

    /* JADX INFO: renamed from: m */
    public boolean f36714m;

    public SettingsItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, khc0.f126735I1, i, 0);
        this.f36708g = typedArrayObtainStyledAttributes.getString(khc0.f126753O1);
        this.f36709h = typedArrayObtainStyledAttributes.getString(khc0.f126744L1);
        this.f36710i = typedArrayObtainStyledAttributes.getResourceId(khc0.f126756P1, 0);
        this.f36711j = typedArrayObtainStyledAttributes.getResourceId(khc0.f126747M1, 0);
        this.f36712k = typedArrayObtainStyledAttributes.getResourceId(khc0.f126741K1, 0);
        this.f36713l = typedArrayObtainStyledAttributes.getBoolean(khc0.f126738J1, false);
        this.f36714m = typedArrayObtainStyledAttributes.getBoolean(khc0.f126750N1, false);
        typedArrayObtainStyledAttributes.recycle();
        m56224b();
    }

    /* JADX INFO: renamed from: a */
    public View m56223a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return b0f0.m101302b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m56224b() {
        setBackgroundResource(dbc0.f86775Yu);
        int i = qa00.f156326m;
        setPadding(i, 0, i, 0);
        m56223a(p9r.m171370a(getContext()), this);
        TextView textView = this.f36703b;
        int i2 = qa00.f156328o;
        bnl0.m105552e0(textView, i2);
        bnl0.m105552e0(this.f36704c, i2);
        if (this.f36712k != 0) {
            bnl0.m105524M(this.f36702a, true);
            this.f36702a.setImageResource(this.f36712k);
        }
        int i3 = this.f36710i;
        TextView textView2 = this.f36703b;
        if (i3 != 0) {
            textView2.setText(i3);
        } else {
            textView2.setText(this.f36708g);
        }
        int i4 = this.f36711j;
        if (i4 != 0) {
            this.f36704c.setText(i4);
            this.f36704c.setVisibility(0);
        } else {
            boolean zIsEmpty = TextUtils.isEmpty(this.f36709h);
            TextView textView3 = this.f36704c;
            if (zIsEmpty) {
                textView3.setVisibility(8);
            } else {
                textView3.setText(this.f36709h);
                this.f36704c.setVisibility(0);
            }
        }
        bnl0.m105524M(this.f36707f, this.f36713l);
        bnl0.m105524M(this.f36705d, this.f36714m);
    }

    /* JADX INFO: renamed from: c */
    public void m56225c(boolean z) {
        bnl0.m105524M(this.f36706e, z);
    }

    public void setSubTitleText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.f36704c;
        if (zIsEmpty) {
            textView.setText("");
            this.f36704c.setVisibility(8);
        } else {
            textView.setText(charSequence.toString());
            this.f36704c.setVisibility(0);
        }
    }

    public void setSubtitleTextColor(@ColorInt int i) {
        this.f36704c.setTextColor(i);
    }

    public void setTitleIconRes(@DrawableRes int i) {
        q8g0.m175809n(this.f36703b, getContext().getResources().getDrawable(i));
    }

    public void setTitleText(String str) {
        this.f36703b.setText(str);
    }

    public void setTitleTextColor(@ColorInt int i) {
        this.f36703b.setTextColor(i);
    }

    public SettingsItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SettingsItem(Context context) {
        this(context, null, 0);
    }
}
