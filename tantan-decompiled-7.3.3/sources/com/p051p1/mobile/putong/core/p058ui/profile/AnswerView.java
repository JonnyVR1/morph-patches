package com.p051p1.mobile.putong.core.p058ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Question;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.data.Answer;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.ft0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class AnswerView extends LinearLayout implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public VText f33749a;

    /* JADX INFO: renamed from: b */
    public VText f33750b;

    /* JADX INFO: renamed from: c */
    public VText f33751c;

    /* JADX INFO: renamed from: d */
    public VImage f33752d;

    public AnswerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m51681a(View view) {
        ft0.m127280a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m51682b(Answer answer) {
        this.f33751c.setText(answer.value);
        Question questionM151465o3 = CoreModule.f18264c.f20378d0.m151465o3(answer.question);
        this.f33749a.setText(questionM151465o3 == null ? "" : questionM151465o3.text);
    }

    /* JADX INFO: renamed from: c */
    public void m51683c(boolean z, boolean z2, boolean z3) {
        if (z) {
            bnl0.m105550d0(this, qa00.f156328o);
            if (z3) {
                bnl0.m105554f0(this, qa00.m175859d(16.0f));
            } else {
                bnl0.m105554f0(this, qa00.m175859d(24.0f));
            }
            if (z2) {
                bnl0.m105548c0(this, qa00.m175859d(12.0f));
            } else {
                bnl0.m105548c0(this, qa00.m175859d(8.0f));
            }
            bnl0.m105524M(this.f33752d, true);
            bnl0.m105552e0(this, 0);
            return;
        }
        int i = qa00.f156328o;
        bnl0.m105550d0(this, i);
        if (z3) {
            bnl0.m105554f0(this, qa00.f156326m);
        } else {
            bnl0.m105554f0(this, i);
        }
        if (z2) {
            bnl0.m105548c0(this, i);
        } else {
            bnl0.m105548c0(this, qa00.f156323j);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51681a(this);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        CoreDlg.m46231b((Act) getContext(), this.f33751c.getText().toString());
        return true;
    }

    public AnswerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnswerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
