package com.p000p1.mobile.putong.core.p001ui.profile.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.core.ui.VText_Default_Bold;
import l.jne;
import l.n6c0;
import l.xdl0;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class EditProfileItemTextView extends VLinear {

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f1928c;

    /* JADX INFO: renamed from: d */
    public VText_Default_Bold f1929d;

    /* JADX INFO: renamed from: e */
    public VImage f1930e;

    /* JADX INFO: renamed from: f */
    public VImage f1931f;

    /* JADX INFO: renamed from: g */
    public VText f1932g;

    /* JADX INFO: renamed from: h */
    public VImage f1933h;

    /* JADX WARN: Multi-variable type inference failed */
    public EditProfileItemTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(n6c0.q, (ViewGroup) this, true);
        m3468P(getChildAt(0));
    }

    /* JADX INFO: renamed from: P */
    public final void m3468P(View view) {
        jne.a(this, view);
    }

    public void setRequired(boolean z) {
        xdl0.M(this.f1930e, z);
    }

    public void setTitle(String str) {
        this.f1929d.setText(str);
    }

    public void setValue(String str) {
        this.f1932g.setText(str);
        xdl0.M(this.f1932g, !TextUtils.isEmpty(str));
        xdl0.M(this.f1933h, !TextUtils.isEmpty(str));
        xdl0.M(this.f1931f, TextUtils.isEmpty(str));
    }

    public EditProfileItemTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EditProfileItemTextView(Context context) {
        this(context, null);
    }
}
