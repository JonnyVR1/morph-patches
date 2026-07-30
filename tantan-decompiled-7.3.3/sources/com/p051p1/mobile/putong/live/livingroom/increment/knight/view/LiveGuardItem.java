package com.p051p1.mobile.putong.live.livingroom.increment.knight.view;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.p051p1.mobile.putong.live.base.data.BLiveUserKnightInfoSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.fvk;
import p153l.g2t;
import p153l.hts;
import p153l.i0k;
import p153l.izs;
import p153l.lsw;
import p153l.obc0;
import p153l.u8n;
import p153l.xau;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f51281d;

    /* JADX INFO: renamed from: e */
    public VImage f51282e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f51283f;

    /* JADX INFO: renamed from: g */
    public VImage f51284g;

    /* JADX INFO: renamed from: h */
    public VText f51285h;

    /* JADX INFO: renamed from: i */
    public VText f51286i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f51287j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f51288k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f51289l;

    /* JADX INFO: renamed from: m */
    public VText f51290m;

    /* JADX INFO: renamed from: n */
    public VText f51291n;

    /* JADX INFO: renamed from: o */
    public Group f51292o;

    /* JADX INFO: renamed from: p */
    public VText f51293p;

    public LiveGuardItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m75832i0(View view) {
        hts.m137100a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m75833j0(final g2t g2tVar, final y20<String> y20Var) {
        izs.m142868s("context_livingAct", this.f51281d, g2tVar.f101887b.f143542a.m61308fp().url);
        this.f51286i.setText(g2tVar.f101887b.m164643h().name);
        BLiveUserKnightInfoSummary bLiveUserKnightInfoSummary = g2tVar.f101886a;
        this.f51290m.setText(bLiveUserKnightInfoSummary.sessionSendCoins + xau.m209910t(R$string.f48305pe));
        this.f51291n.setText(xau.m209911u(u8n.m195065a() ? R$string.f47506Ed : R$string.f47484Dd, String.valueOf(g2tVar.f101889d.knightCoins - bLiveUserKnightInfoSummary.sessionSendCoins)));
        m75834k0(g2tVar.f101888c);
        if (bLiveUserKnightInfoSummary.isKnight) {
            bnl0.m105524M(this.f51292o, false);
            bnl0.m105524M(this.f51293p, bLiveUserKnightInfoSummary.isInRoom);
            bnl0.m105524M(this.f51283f, true);
            this.f51285h.setText(fvk.m127665p(bLiveUserKnightInfoSummary.expireTime) + xau.m209910t(R$string.f48115h));
            boolean zM155734b = lsw.C18451a.m155734b(bLiveUserKnightInfoSummary.guardType);
            RelativeLayout relativeLayout = this.f51283f;
            if (zM155734b) {
                relativeLayout.setBackgroundResource(obc0.f146302d0);
                this.f51282e.setBackgroundResource(obc0.f146349h);
                this.f51284g.setBackgroundResource(obc0.f146064I2);
                this.f51285h.setTextColor(Color.parseColor("#3253e1"));
            } else {
                relativeLayout.setBackgroundResource(obc0.f146326f0);
                this.f51282e.setBackgroundResource(obc0.f146337g);
                this.f51284g.setBackgroundResource(obc0.f146004D2);
                this.f51285h.setTextColor(Color.parseColor("#9f00d1"));
            }
        } else {
            this.f51282e.setBackground(null);
            bnl0.m105524M(this.f51283f, false);
            bnl0.m105524M(this.f51292o, true);
            bnl0.m105524M(this.f51293p, false);
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.gts
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(g2tVar.f101887b.m164643h().f56859id);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final void m75834k0(BLiveUserLevel bLiveUserLevel) {
        if (bLiveUserLevel == null || TextUtils.isEmpty(bLiveUserLevel.backendUrl)) {
            bnl0.m105524M(this.f51288k, false);
        } else {
            bnl0.m105524M(this.f51288k, true);
            i0k.m137976c(bLiveUserLevel.backendUrl, this.f51288k, bLiveUserLevel.grade >= 43 ? i0k.f112379b : i0k.f112378a);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75832i0(this);
    }

    public LiveGuardItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
