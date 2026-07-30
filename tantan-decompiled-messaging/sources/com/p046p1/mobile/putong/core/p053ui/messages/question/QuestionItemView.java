package com.p046p1.mobile.putong.core.p053ui.messages.question;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p147v.VImage;
import p147v.VText;
import p149l.c3c0;
import p149l.job0;
import p149l.nob0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class QuestionItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f32194a;

    /* JADX INFO: renamed from: b */
    public VImage f32195b;

    public QuestionItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m49607a(View view) {
        nob0.m160407a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m49608b(job0 job0Var) {
        this.f32194a.setText(job0Var.m142423a().content);
        boolean zM142424b = job0Var.m142424b();
        VText vText = this.f32194a;
        if (zM142424b) {
            vText.setTextColor(-1);
            xdl0.m208344M(this.f32195b, true);
            xdl0.m208359W(this.f32194a, t100.f167256e);
            setBackgroundResource(c3c0.f78612Q0);
            return;
        }
        vText.setTextColor(-570425344);
        xdl0.m208344M(this.f32195b, false);
        xdl0.m208359W(this.f32194a, t100.f167264m);
        setBackgroundResource(c3c0.f78603P0);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49607a(this);
    }

    public QuestionItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public QuestionItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
