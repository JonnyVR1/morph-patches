package com.p046p1.mobile.putong.live.base.business.fansgroup;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.fce;
import p149l.g3c0;
import p149l.mxj0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class UserAgeGenderView extends VLinear {

    /* JADX INFO: renamed from: c */
    public UserAgeGenderView f44319c;

    /* JADX INFO: renamed from: d */
    public VImage f44320d;

    /* JADX INFO: renamed from: e */
    public VText f44321e;

    public UserAgeGenderView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m67643P(View view) {
        mxj0.m156911a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m67644Q(String str, int i) {
        xdl0.m208344M(this.f44319c, true);
        this.f44320d.setBackgroundResource(TextUtils.equals(str, "male") ? g3c0.f100440r0 : g3c0.f100438q0);
        this.f44319c.setBackground(fce.m120425b(TextUtils.equals(str, "male") ? -10587906 : -509799, t100.m186890d(5.0f)));
        this.f44321e.setText(String.valueOf(i));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67643P(this);
    }

    public UserAgeGenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UserAgeGenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
