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
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import p151v.VSwitch;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.khc0;
import p153l.o520;
import p153l.p9r;
import p153l.q8g0;

/* JADX INFO: loaded from: classes12.dex */
public class MyTabAbSettingsItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public View f36672a;

    /* JADX INFO: renamed from: b */
    public ImageView f36673b;

    /* JADX INFO: renamed from: c */
    public VText f36674c;

    /* JADX INFO: renamed from: d */
    public VText f36675d;

    /* JADX INFO: renamed from: e */
    public VSwitch f36676e;

    /* JADX INFO: renamed from: f */
    public View f36677f;

    /* JADX INFO: renamed from: g */
    public ImageView f36678g;

    /* JADX INFO: renamed from: h */
    public View f36679h;

    /* JADX INFO: renamed from: i */
    public String f36680i;

    /* JADX INFO: renamed from: j */
    public String f36681j;

    /* JADX INFO: renamed from: k */
    @StringRes
    public int f36682k;

    /* JADX INFO: renamed from: l */
    @StringRes
    public int f36683l;

    /* JADX INFO: renamed from: m */
    @DrawableRes
    public int f36684m;

    /* JADX INFO: renamed from: n */
    public boolean f36685n;

    /* JADX INFO: renamed from: o */
    public boolean f36686o;

    public MyTabAbSettingsItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, khc0.f126735I1, i, 0);
        this.f36680i = typedArrayObtainStyledAttributes.getString(khc0.f126753O1);
        this.f36681j = typedArrayObtainStyledAttributes.getString(khc0.f126744L1);
        this.f36682k = typedArrayObtainStyledAttributes.getResourceId(khc0.f126756P1, 0);
        this.f36683l = typedArrayObtainStyledAttributes.getResourceId(khc0.f126747M1, 0);
        this.f36684m = typedArrayObtainStyledAttributes.getResourceId(khc0.f126741K1, 0);
        this.f36685n = typedArrayObtainStyledAttributes.getBoolean(khc0.f126738J1, false);
        this.f36686o = typedArrayObtainStyledAttributes.getBoolean(khc0.f126750N1, false);
        typedArrayObtainStyledAttributes.recycle();
        m56193b();
    }

    /* JADX INFO: renamed from: a */
    public View m56192a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return o520.m166086b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m56193b() {
        setBackgroundResource(dbc0.f86775Yu);
        m56192a(p9r.m171370a(getContext()), this);
        if (this.f36684m != 0) {
            bnl0.m105524M(this.f36673b, true);
            this.f36673b.setImageResource(this.f36684m);
        }
        int i = this.f36682k;
        VText vText = this.f36674c;
        if (i != 0) {
            vText.setText(i);
        } else {
            vText.setText(this.f36680i);
        }
        int i2 = this.f36683l;
        if (i2 != 0) {
            this.f36675d.setText(i2);
            this.f36675d.setVisibility(0);
        } else {
            boolean zIsEmpty = TextUtils.isEmpty(this.f36681j);
            VText vText2 = this.f36675d;
            if (zIsEmpty) {
                vText2.setVisibility(8);
            } else {
                vText2.setText(this.f36681j);
                this.f36675d.setVisibility(0);
            }
        }
        bnl0.m105524M(this.f36678g, this.f36685n);
        bnl0.m105524M(this.f36676e, this.f36686o);
    }

    public void setSubTitleText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        VText vText = this.f36675d;
        if (zIsEmpty) {
            vText.setText("");
            this.f36675d.setVisibility(8);
        } else {
            vText.setText(charSequence);
            this.f36675d.setVisibility(0);
        }
    }

    public void setSubtitleTextColor(@ColorInt int i) {
        this.f36675d.setTextColor(i);
    }

    public void setTitleIconRes(@DrawableRes int i) {
        q8g0.m175809n(this.f36674c, getContext().getResources().getDrawable(i));
    }

    public void setTitleTextColor(@ColorInt int i) {
        this.f36674c.setTextColor(i);
    }

    public MyTabAbSettingsItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MyTabAbSettingsItem(Context context) {
        this(context, null, 0);
    }
}
