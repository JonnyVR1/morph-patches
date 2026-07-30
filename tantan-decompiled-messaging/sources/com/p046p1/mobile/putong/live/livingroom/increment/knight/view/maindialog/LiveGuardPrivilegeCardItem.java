package com.p046p1.mobile.putong.live.livingroom.increment.knight.view.maindialog;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VText;
import p149l.i3c0;
import p149l.mpw;
import p149l.qrs;
import p149l.xdl0;
import p149l.zqs;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardPrivilegeCardItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveGuardPrivilegeCardItem f50490d;

    /* JADX INFO: renamed from: e */
    public View f50491e;

    /* JADX INFO: renamed from: f */
    public View f50492f;

    /* JADX INFO: renamed from: g */
    public VText f50493g;

    /* JADX INFO: renamed from: h */
    public VText f50494h;

    /* JADX INFO: renamed from: i */
    public VText f50495i;

    /* JADX INFO: renamed from: j */
    public View f50496j;

    public LiveGuardPrivilegeCardItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m74685i0(View view) {
        qrs.m176131a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m74686j0(final zqs zqsVar, mpw.C18528a c18528a, boolean z) {
        this.f50491e.setBackgroundResource(c18528a.f135115l);
        this.f50492f.setBackgroundResource(c18528a.f135116m);
        this.f50493g.setTextColor(c18528a.f135117n);
        this.f50494h.setTextColor(c18528a.f135118o);
        View view = this.f50496j;
        if (z) {
            xdl0.m208344M(view, true);
            this.f50496j.setBackgroundResource(mpw.C18528a.m155838a(c18528a.f135104a) ? i3c0.f111033i : i3c0.f111045j);
            xdl0.m208329E0(this.f50496j, new View.OnClickListener() { // from class: l.prs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    zqsVar.m219891M();
                }
            });
        } else {
            xdl0.m208344M(view, false);
        }
        m74687k0(c18528a);
        this.f50493g.setText(c18528a.f135105b);
        this.f50494h.setText(c18528a.f135107d);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m74687k0(mpw.C18528a c18528a) {
        boolean zIsEmpty = TextUtils.isEmpty(c18528a.f135106c);
        VText vText = this.f50495i;
        if (zIsEmpty) {
            xdl0.m208344M(vText, false);
            return;
        }
        vText.setText(c18528a.f135106c);
        xdl0.m208344M(this.f50495i, true);
        this.f50495i.setBackground(getResources().getDrawable(c18528a.f135119p));
        this.f50495i.setTextColor(Color.parseColor(c18528a.f135120q));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74685i0(this);
    }

    public LiveGuardPrivilegeCardItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGuardPrivilegeCardItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
