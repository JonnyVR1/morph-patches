package com.p000p1.mobile.putong.live.livingroom.increment.knight.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import l.hxs;
import l.t100;
import l.x8u;
import p002l.ers;
import p002l.mpw;
import p002l.psk;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGuardInfoView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f6466d;

    /* JADX INFO: renamed from: e */
    public VText f6467e;

    /* JADX INFO: renamed from: f */
    public VText f6468f;

    /* JADX INFO: renamed from: g */
    public View f6469g;

    /* JADX INFO: renamed from: h */
    public VText f6470h;

    /* JADX INFO: renamed from: i */
    public VText f6471i;

    /* JADX INFO: renamed from: j */
    public View f6472j;

    /* JADX INFO: renamed from: k */
    public VText f6473k;

    /* JADX INFO: renamed from: l */
    public VText f6474l;

    public LiveGuardInfoView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m8239h0(View view) {
        ers.m12683a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m8240i0(mpw mpwVar) {
        hxs.u("context_livingAct", this.f6466d, mpwVar.f15520b, t100.d(54.0f), t100.d(54.0f));
        this.f6467e.setText(psk.m20667n(mpwVar.f15521c));
        this.f6470h.setText(x8u.c(mpwVar.f15522d));
        this.f6473k.setText(x8u.c(mpwVar.f15523e));
        long j = mpwVar.f15521c;
        if (j > 100) {
            this.f6474l.setText(R$string.f2948Q2);
            return;
        }
        VText vText = this.f6474l;
        if (j == 1) {
            vText.setText(R$string.f2714F5);
        } else {
            vText.setText(R$string.f2969R2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8239h0(this);
    }

    public LiveGuardInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
