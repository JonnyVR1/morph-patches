package com.p051p1.mobile.putong.live.livingroom.increment.knight.view.maindialog;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VText;
import p153l.ats;
import p153l.bnl0;
import p153l.lsw;
import p153l.obc0;
import p153l.rts;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardPrivilegeCardItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveGuardPrivilegeCardItem f51338d;

    /* JADX INFO: renamed from: e */
    public View f51339e;

    /* JADX INFO: renamed from: f */
    public View f51340f;

    /* JADX INFO: renamed from: g */
    public VText f51341g;

    /* JADX INFO: renamed from: h */
    public VText f51342h;

    /* JADX INFO: renamed from: i */
    public VText f51343i;

    /* JADX INFO: renamed from: j */
    public View f51344j;

    public LiveGuardPrivilegeCardItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m75868i0(View view) {
        rts.m183165a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m75869j0(final ats atsVar, lsw.C18451a c18451a, boolean z) {
        this.f51339e.setBackgroundResource(c18451a.f133491l);
        this.f51340f.setBackgroundResource(c18451a.f133492m);
        this.f51341g.setTextColor(c18451a.f133493n);
        this.f51342h.setTextColor(c18451a.f133494o);
        View view = this.f51344j;
        if (z) {
            bnl0.m105524M(view, true);
            this.f51344j.setBackgroundResource(lsw.C18451a.m155733a(c18451a.f133480a) ? obc0.f146361i : obc0.f146373j);
            bnl0.m105509E0(this.f51344j, new View.OnClickListener() { // from class: l.qts
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    atsVar.m100257M();
                }
            });
        } else {
            bnl0.m105524M(view, false);
        }
        m75870k0(c18451a);
        this.f51341g.setText(c18451a.f133481b);
        this.f51342h.setText(c18451a.f133483d);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m75870k0(lsw.C18451a c18451a) {
        boolean zIsEmpty = TextUtils.isEmpty(c18451a.f133482c);
        VText vText = this.f51343i;
        if (zIsEmpty) {
            bnl0.m105524M(vText, false);
            return;
        }
        vText.setText(c18451a.f133482c);
        bnl0.m105524M(this.f51343i, true);
        this.f51343i.setBackground(getResources().getDrawable(c18451a.f133495p));
        this.f51343i.setTextColor(Color.parseColor(c18451a.f133496q));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75868i0(this);
    }

    public LiveGuardPrivilegeCardItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGuardPrivilegeCardItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
