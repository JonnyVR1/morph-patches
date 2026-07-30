package com.p051p1.mobile.putong.core.p058ui.messages.question;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.ibc0;
import p153l.nwb0;
import p153l.qa00;
import p153l.rwb0;

/* JADX INFO: loaded from: classes4.dex */
public class QuestionItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f33042a;

    /* JADX INFO: renamed from: b */
    public VImage f33043b;

    public QuestionItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m50790a(View view) {
        rwb0.m183352a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m50791b(nwb0 nwb0Var) {
        this.f33042a.setText(nwb0Var.m164981a().content);
        boolean zM164982b = nwb0Var.m164982b();
        VText vText = this.f33042a;
        if (zM164982b) {
            vText.setTextColor(-1);
            bnl0.m105524M(this.f33043b, true);
            bnl0.m105539W(this.f33042a, qa00.f156318e);
            setBackgroundResource(ibc0.f113887Q0);
            return;
        }
        vText.setTextColor(-570425344);
        bnl0.m105524M(this.f33043b, false);
        bnl0.m105539W(this.f33042a, qa00.f156326m);
        setBackgroundResource(ibc0.f113878P0);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50790a(this);
    }

    public QuestionItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public QuestionItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
