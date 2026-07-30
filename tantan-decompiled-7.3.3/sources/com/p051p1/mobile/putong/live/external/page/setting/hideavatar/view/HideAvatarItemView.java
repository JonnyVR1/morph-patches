package com.p051p1.mobile.putong.live.external.page.setting.hideavatar.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.data.BLiveRightItem;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.bpj;
import p153l.izs;
import p153l.mbc0;
import p153l.o1j0;
import p153l.o9d0;
import p153l.q2l;
import p153l.qa00;
import p153l.s2l;
import p153l.tbs;
import p153l.wft;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class HideAvatarItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f47032d;

    /* JADX INFO: renamed from: e */
    public VImage f47033e;

    /* JADX INFO: renamed from: f */
    public VImage f47034f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f47035g;

    /* JADX INFO: renamed from: h */
    public VText f47036h;

    /* JADX INFO: renamed from: i */
    public VText f47037i;

    /* JADX INFO: renamed from: j */
    public VButton f47038j;

    /* JADX INFO: renamed from: k */
    public VText f47039k;

    public HideAvatarItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m71961i0(View view) {
        s2l.m184129a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m71962j0(q2l q2lVar, y20<q2l> y20Var) {
        if (q2lVar.m175048g().todayDisable || q2lVar.m175051j()) {
            return;
        }
        if (q2lVar.m175052k()) {
            o1j0.m165649w(R$string.f44992X0);
        } else if (q2lVar.m175049h() || q2lVar.m175050i()) {
            y20Var.call(q2lVar);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m71963k0(q2l q2lVar, y20 y20Var, View view) {
        m71962j0(q2lVar, y20Var);
    }

    /* JADX INFO: renamed from: l0 */
    public void m71964l0(q2l q2lVar) {
        BLiveRightItem bLiveRightItemM175048g = q2lVar.m175048g();
        Context context = getContext();
        this.f47038j.setBackgroundResource(mbc0.f135685j);
        this.f47038j.setTextColor(-1);
        if (bLiveRightItemM175048g.isActive() && bLiveRightItemM175048g.todayDisable) {
            this.f47038j.setText(context.getString(R$string.f45016g0));
        } else if (bLiveRightItemM175048g.isGray()) {
            this.f47038j.setText(context.getString(R$string.f44986U0));
            this.f47038j.setBackgroundResource(mbc0.f135679g);
            this.f47038j.setTextColor(Color.parseColor("#bfbfbf"));
        } else if (bLiveRightItemM175048g.isActive()) {
            this.f47038j.setText(context.getString(R$string.f44980R0));
        } else {
            boolean zIsLocked = bLiveRightItemM175048g.isLocked();
            VButton vButton = this.f47038j;
            if (zIsLocked) {
                vButton.setText(context.getString(R$string.f45019h0));
            } else {
                vButton.setText(context.getString(R$string.f45047q1));
            }
        }
        bnl0.m105524M(this.f47033e, bLiveRightItemM175048g.isEquipped());
        bnl0.m105524M(this.f47034f, bLiveRightItemM175048g.isLocked());
    }

    @SuppressLint({"StringFormatMatches"})
    /* JADX INFO: renamed from: m0 */
    public void m71965m0(final q2l q2lVar, final y20<q2l> y20Var) {
        BLiveRightItem bLiveRightItemM175048g = q2lVar.m175048g();
        this.f47032d.setText(o9d0.m166707e(getContext(), bLiveRightItemM175048g));
        bnl0.m105525M0(this.f47032d, !bLiveRightItemM175048g.isGray());
        izs.m142868s("context_common", this.f47035g, bLiveRightItemM175048g.getThumbnailUrl());
        this.f47036h.setText(bpj.m105844a(bLiveRightItemM175048g.rightName));
        this.f47037i.setText(bpj.m105844a(bLiveRightItemM175048g.description));
        int i = q2lVar.m175046e().switchCount;
        this.f47039k.setText(tbs.f172988a.getString(R$string.f44973O, Integer.valueOf(i)));
        bnl0.m105525M0(this.f47039k, i > 0);
        m71964l0(q2lVar);
        bnl0.m105509E0(this.f47038j, new View.OnClickListener() { // from class: l.r2l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160947a.m71963k0(q2lVar, y20Var, view);
            }
        });
        if (wft.m206159b(2)) {
            return;
        }
        this.f47037i.setMaxLines(3);
        bnl0.m105540X(this.f47038j, qa00.m175859d(12.0f));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71961i0(this);
    }

    public HideAvatarItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HideAvatarItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
