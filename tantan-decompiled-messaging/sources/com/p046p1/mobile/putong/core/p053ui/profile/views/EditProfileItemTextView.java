package com.p046p1.mobile.putong.core.p053ui.profile.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.jne;
import p149l.n6c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class EditProfileItemTextView extends VLinear {

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f34106c;

    /* JADX INFO: renamed from: d */
    public VText_Default_Bold f34107d;

    /* JADX INFO: renamed from: e */
    public VImage f34108e;

    /* JADX INFO: renamed from: f */
    public VImage f34109f;

    /* JADX INFO: renamed from: g */
    public VText f34110g;

    /* JADX INFO: renamed from: h */
    public VImage f34111h;

    public EditProfileItemTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(n6c0.f137372q, (ViewGroup) this, true);
        m52913P(getChildAt(0));
    }

    /* JADX INFO: renamed from: P */
    public final void m52913P(View view) {
        jne.m142376a(this, view);
    }

    public void setRequired(boolean z) {
        xdl0.m208344M(this.f34108e, z);
    }

    public void setTitle(String str) {
        this.f34107d.setText(str);
    }

    public void setValue(String str) {
        this.f34110g.setText(str);
        xdl0.m208344M(this.f34110g, !TextUtils.isEmpty(str));
        xdl0.m208344M(this.f34111h, !TextUtils.isEmpty(str));
        xdl0.m208344M(this.f34109f, TextUtils.isEmpty(str));
    }

    public EditProfileItemTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EditProfileItemTextView(Context context) {
        this(context, null);
    }
}
