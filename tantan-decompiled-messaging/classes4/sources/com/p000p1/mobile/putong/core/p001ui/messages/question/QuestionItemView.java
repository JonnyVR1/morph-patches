package com.p000p1.mobile.putong.core.p001ui.messages.question;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import l.c3c0;
import l.nob0;
import l.t100;
import l.xdl0;
import p002l.job0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class QuestionItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f16a;

    /* JADX INFO: renamed from: b */
    public VImage f17b;

    public QuestionItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m21a(View view) {
        nob0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m22b(job0 job0Var) {
        this.f16a.setText(job0Var.m16040a().content);
        boolean zM16041b = job0Var.m16041b();
        VText vText = this.f16a;
        if (zM16041b) {
            vText.setTextColor(-1);
            xdl0.M(this.f17b, true);
            xdl0.W(this.f16a, t100.e);
            setBackgroundResource(c3c0.Q0);
            return;
        }
        vText.setTextColor(-570425344);
        xdl0.M(this.f17b, false);
        xdl0.W(this.f16a, t100.m);
        setBackgroundResource(c3c0.P0);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m21a(this);
    }

    public QuestionItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public QuestionItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
