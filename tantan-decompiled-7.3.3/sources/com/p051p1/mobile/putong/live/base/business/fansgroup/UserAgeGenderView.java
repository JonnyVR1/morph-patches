package com.p051p1.mobile.putong.live.base.business.fansgroup;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.jde;
import p153l.mbc0;
import p153l.qa00;
import p153l.s6k0;

/* JADX INFO: loaded from: classes13.dex */
public class UserAgeGenderView extends VLinear {

    /* JADX INFO: renamed from: c */
    public UserAgeGenderView f45167c;

    /* JADX INFO: renamed from: d */
    public VImage f45168d;

    /* JADX INFO: renamed from: e */
    public VText f45169e;

    public UserAgeGenderView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m68826P(View view) {
        s6k0.m184917a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m68827Q(String str, int i) {
        bnl0.m105524M(this.f45167c, true);
        this.f45168d.setBackgroundResource(TextUtils.equals(str, "male") ? mbc0.f135702r0 : mbc0.f135700q0);
        this.f45167c.setBackground(jde.m144406b(TextUtils.equals(str, "male") ? -10587906 : -509799, qa00.m175859d(5.0f)));
        this.f45169e.setText(String.valueOf(i));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m68826P(this);
    }

    public UserAgeGenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UserAgeGenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
