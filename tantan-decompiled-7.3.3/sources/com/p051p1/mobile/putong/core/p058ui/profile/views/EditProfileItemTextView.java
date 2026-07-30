package com.p051p1.mobile.putong.core.p058ui.profile.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.noe;
import p153l.sec0;

/* JADX INFO: loaded from: classes4.dex */
public class EditProfileItemTextView extends VLinear {

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f34954c;

    /* JADX INFO: renamed from: d */
    public VText_Default_Bold f34955d;

    /* JADX INFO: renamed from: e */
    public VImage f34956e;

    /* JADX INFO: renamed from: f */
    public VImage f34957f;

    /* JADX INFO: renamed from: g */
    public VText f34958g;

    /* JADX INFO: renamed from: h */
    public VImage f34959h;

    public EditProfileItemTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(sec0.f167586q, (ViewGroup) this, true);
        m54096P(getChildAt(0));
    }

    /* JADX INFO: renamed from: P */
    public final void m54096P(View view) {
        noe.m164115a(this, view);
    }

    public void setRequired(boolean z) {
        bnl0.m105524M(this.f34956e, z);
    }

    public void setTitle(String str) {
        this.f34955d.setText(str);
    }

    public void setValue(String str) {
        this.f34958g.setText(str);
        bnl0.m105524M(this.f34958g, !TextUtils.isEmpty(str));
        bnl0.m105524M(this.f34959h, !TextUtils.isEmpty(str));
        bnl0.m105524M(this.f34957f, TextUtils.isEmpty(str));
    }

    public EditProfileItemTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EditProfileItemTextView(Context context) {
        this(context, null);
    }
}
