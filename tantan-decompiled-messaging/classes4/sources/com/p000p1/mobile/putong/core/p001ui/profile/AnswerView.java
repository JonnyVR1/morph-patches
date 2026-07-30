package com.p000p1.mobile.putong.core.p001ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Question;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.data.Answer;
import l.at0;
import l.t100;
import l.xdl0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class AnswerView extends LinearLayout implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public VText f723a;

    /* JADX INFO: renamed from: b */
    public VText f724b;

    /* JADX INFO: renamed from: c */
    public VText f725c;

    /* JADX INFO: renamed from: d */
    public VImage f726d;

    public AnswerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m933a(View view) {
        at0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m934b(Answer answer) {
        this.f725c.setText(answer.value);
        Question questionO3 = CoreModule.c.d0.o3(answer.question);
        this.f723a.setText(questionO3 == null ? "" : questionO3.text);
    }

    /* JADX INFO: renamed from: c */
    public void m935c(boolean z, boolean z2, boolean z3) {
        if (z) {
            xdl0.d0(this, t100.o);
            if (z3) {
                xdl0.f0(this, t100.d(16.0f));
            } else {
                xdl0.f0(this, t100.d(24.0f));
            }
            if (z2) {
                xdl0.c0(this, t100.d(12.0f));
            } else {
                xdl0.c0(this, t100.d(8.0f));
            }
            xdl0.M(this.f726d, true);
            xdl0.e0(this, 0);
            return;
        }
        int i = t100.o;
        xdl0.d0(this, i);
        if (z3) {
            xdl0.f0(this, t100.m);
        } else {
            xdl0.f0(this, i);
        }
        if (z2) {
            xdl0.c0(this, i);
        } else {
            xdl0.c0(this, t100.j);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m933a(this);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        CoreDlg.b(getContext(), this.f725c.getText().toString());
        return true;
    }

    public AnswerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnswerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
