package com.p046p1.mobile.putong.live.livingroom.increment.knight.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p147v.VText;
import p149l.ers;
import p149l.hxs;
import p149l.mpw;
import p149l.psk;
import p149l.t100;
import p149l.x8u;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardInfoView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f50424d;

    /* JADX INFO: renamed from: e */
    public VText f50425e;

    /* JADX INFO: renamed from: f */
    public VText f50426f;

    /* JADX INFO: renamed from: g */
    public View f50427g;

    /* JADX INFO: renamed from: h */
    public VText f50428h;

    /* JADX INFO: renamed from: i */
    public VText f50429i;

    /* JADX INFO: renamed from: j */
    public View f50430j;

    /* JADX INFO: renamed from: k */
    public VText f50431k;

    /* JADX INFO: renamed from: l */
    public VText f50432l;

    public LiveGuardInfoView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m74646h0(View view) {
        ers.m117874a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m74647i0(mpw mpwVar) {
        hxs.m133408u("context_livingAct", this.f50424d, mpwVar.f135092b, t100.m186890d(54.0f), t100.m186890d(54.0f));
        this.f50425e.setText(psk.m171171n(mpwVar.f135093c));
        this.f50428h.setText(x8u.m207433c(mpwVar.f135094d));
        this.f50431k.setText(x8u.m207433c(mpwVar.f135095e));
        long j = mpwVar.f135093c;
        if (j > 100) {
            this.f50432l.setText(R$string.f46906Q2);
            return;
        }
        VText vText = this.f50432l;
        if (j == 1) {
            vText.setText(R$string.f46672F5);
        } else {
            vText.setText(R$string.f46927R2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74646h0(this);
    }

    public LiveGuardInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
