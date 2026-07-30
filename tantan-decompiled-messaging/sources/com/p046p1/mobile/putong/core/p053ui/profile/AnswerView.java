package com.p046p1.mobile.putong.core.p053ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Question;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.data.Answer;
import p147v.VImage;
import p147v.VText;
import p149l.at0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class AnswerView extends LinearLayout implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public VText f32901a;

    /* JADX INFO: renamed from: b */
    public VText f32902b;

    /* JADX INFO: renamed from: c */
    public VText f32903c;

    /* JADX INFO: renamed from: d */
    public VImage f32904d;

    public AnswerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m50498a(View view) {
        at0.m98648a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m50499b(Answer answer) {
        this.f32903c.setText(answer.value);
        Question questionM215900o3 = CoreModule.f17545c.f19636d0.m215900o3(answer.question);
        this.f32901a.setText(questionM215900o3 == null ? "" : questionM215900o3.text);
    }

    /* JADX INFO: renamed from: c */
    public void m50500c(boolean z, boolean z2, boolean z3) {
        if (z) {
            xdl0.m208370d0(this, t100.f167266o);
            if (z3) {
                xdl0.m208374f0(this, t100.m186890d(16.0f));
            } else {
                xdl0.m208374f0(this, t100.m186890d(24.0f));
            }
            if (z2) {
                xdl0.m208368c0(this, t100.m186890d(12.0f));
            } else {
                xdl0.m208368c0(this, t100.m186890d(8.0f));
            }
            xdl0.m208344M(this.f32904d, true);
            xdl0.m208372e0(this, 0);
            return;
        }
        int i = t100.f167266o;
        xdl0.m208370d0(this, i);
        if (z3) {
            xdl0.m208374f0(this, t100.f167264m);
        } else {
            xdl0.m208374f0(this, i);
        }
        if (z2) {
            xdl0.m208368c0(this, i);
        } else {
            xdl0.m208368c0(this, t100.f167261j);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50498a(this);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        CoreDlg.m45048b((Act) getContext(), this.f32903c.getText().toString());
        return true;
    }

    public AnswerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnswerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
