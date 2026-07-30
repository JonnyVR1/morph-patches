package com.p046p1.mobile.putong.live.livingroom.increment.knight.view;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.p046p1.mobile.putong.live.base.data.BLiveUserKnightInfoSummary;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.e30;
import p149l.f0t;
import p149l.grs;
import p149l.hxs;
import p149l.i3c0;
import p149l.mpw;
import p149l.psk;
import p149l.sxj;
import p149l.u6n;
import p149l.w8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f50433d;

    /* JADX INFO: renamed from: e */
    public VImage f50434e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f50435f;

    /* JADX INFO: renamed from: g */
    public VImage f50436g;

    /* JADX INFO: renamed from: h */
    public VText f50437h;

    /* JADX INFO: renamed from: i */
    public VText f50438i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f50439j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f50440k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f50441l;

    /* JADX INFO: renamed from: m */
    public VText f50442m;

    /* JADX INFO: renamed from: n */
    public VText f50443n;

    /* JADX INFO: renamed from: o */
    public Group f50444o;

    /* JADX INFO: renamed from: p */
    public VText f50445p;

    public LiveGuardItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m74649i0(View view) {
        grs.m127765a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m74650j0(final f0t f0tVar, final e30<String> e30Var) {
        hxs.m133406s("context_livingAct", this.f50433d, f0tVar.f94002b.f135304a.m60124fp().url);
        this.f50438i.setText(f0tVar.f94002b.m156005h().name);
        BLiveUserKnightInfoSummary bLiveUserKnightInfoSummary = f0tVar.f94001a;
        this.f50442m.setText(bLiveUserKnightInfoSummary.sessionSendCoins + w8u.m202217t(R$string.f47457pe));
        this.f50443n.setText(w8u.m202218u(u6n.m192015a() ? R$string.f46658Ed : R$string.f46636Dd, String.valueOf(f0tVar.f94004d.knightCoins - bLiveUserKnightInfoSummary.sessionSendCoins)));
        m74651k0(f0tVar.f94003c);
        if (bLiveUserKnightInfoSummary.isKnight) {
            xdl0.m208344M(this.f50444o, false);
            xdl0.m208344M(this.f50445p, bLiveUserKnightInfoSummary.isInRoom);
            xdl0.m208344M(this.f50435f, true);
            this.f50437h.setText(psk.m171173p(bLiveUserKnightInfoSummary.expireTime) + w8u.m202217t(R$string.f47267h));
            boolean zM155839b = mpw.C18528a.m155839b(bLiveUserKnightInfoSummary.guardType);
            RelativeLayout relativeLayout = this.f50435f;
            if (zM155839b) {
                relativeLayout.setBackgroundResource(i3c0.f110974d0);
                this.f50434e.setBackgroundResource(i3c0.f111021h);
                this.f50436g.setBackgroundResource(i3c0.f110736I2);
                this.f50437h.setTextColor(Color.parseColor("#3253e1"));
            } else {
                relativeLayout.setBackgroundResource(i3c0.f110998f0);
                this.f50434e.setBackgroundResource(i3c0.f111009g);
                this.f50436g.setBackgroundResource(i3c0.f110676D2);
                this.f50437h.setTextColor(Color.parseColor("#9f00d1"));
            }
        } else {
            this.f50434e.setBackground(null);
            xdl0.m208344M(this.f50435f, false);
            xdl0.m208344M(this.f50444o, true);
            xdl0.m208344M(this.f50445p, false);
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.frs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(f0tVar.f94002b.m156005h().f56011id);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final void m74651k0(BLiveUserLevel bLiveUserLevel) {
        if (bLiveUserLevel == null || TextUtils.isEmpty(bLiveUserLevel.backendUrl)) {
            xdl0.m208344M(this.f50440k, false);
        } else {
            xdl0.m208344M(this.f50440k, true);
            sxj.m186442c(bLiveUserLevel.backendUrl, this.f50440k, bLiveUserLevel.grade >= 43 ? sxj.f166798b : sxj.f166797a);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74649i0(this);
    }

    public LiveGuardItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
