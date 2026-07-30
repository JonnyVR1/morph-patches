package com.p000p1.mobile.putong.live.livingroom.increment.knight.view;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveUserKnightInfoSummary;
import com.p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.tantanapp.common.data.DbObject;
import l.e30;
import l.hxs;
import l.sxj;
import l.u6n;
import l.w8u;
import l.xdl0;
import p002l.f0t;
import p002l.grs;
import p002l.i3c0;
import p002l.mpw;
import p002l.psk;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGuardItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f6475d;

    /* JADX INFO: renamed from: e */
    public VImage f6476e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f6477f;

    /* JADX INFO: renamed from: g */
    public VImage f6478g;

    /* JADX INFO: renamed from: h */
    public VText f6479h;

    /* JADX INFO: renamed from: i */
    public VText f6480i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f6481j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f6482k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f6483l;

    /* JADX INFO: renamed from: m */
    public VText f6484m;

    /* JADX INFO: renamed from: n */
    public VText f6485n;

    /* JADX INFO: renamed from: o */
    public Group f6486o;

    /* JADX INFO: renamed from: p */
    public VText f6487p;

    public LiveGuardItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m8242i0(View view) {
        grs.m14035a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public void m8243j0(final f0t f0tVar, final e30<String> e30Var) {
        hxs.s("context_livingAct", this.f6475d, ((Media) ((User) f0tVar.f10081b.a).fp()).url);
        this.f6480i.setText(f0tVar.f10081b.h().name);
        BLiveUserKnightInfoSummary bLiveUserKnightInfoSummary = f0tVar.f10080a;
        this.f6484m.setText(bLiveUserKnightInfoSummary.sessionSendCoins + w8u.t(R$string.f3499pe));
        this.f6485n.setText(w8u.u(u6n.a() ? R$string.f2700Ed : R$string.f2678Dd, String.valueOf(f0tVar.f10083d.knightCoins - bLiveUserKnightInfoSummary.sessionSendCoins)));
        m8244k0(f0tVar.f10082c);
        if (bLiveUserKnightInfoSummary.isKnight) {
            xdl0.M(this.f6486o, false);
            xdl0.M(this.f6487p, bLiveUserKnightInfoSummary.isInRoom);
            xdl0.M(this.f6477f, true);
            this.f6479h.setText(psk.m20669p(bLiveUserKnightInfoSummary.expireTime) + w8u.t(R$string.f3309h));
            boolean zM18130b = mpw.C0681a.m18130b(bLiveUserKnightInfoSummary.guardType);
            RelativeLayout relativeLayout = this.f6477f;
            if (zM18130b) {
                relativeLayout.setBackgroundResource(i3c0.f12759d0);
                this.f6476e.setBackgroundResource(i3c0.f12806h);
                this.f6478g.setBackgroundResource(i3c0.f12521I2);
                this.f6479h.setTextColor(Color.parseColor("#3253e1"));
            } else {
                relativeLayout.setBackgroundResource(i3c0.f12783f0);
                this.f6476e.setBackgroundResource(i3c0.f12794g);
                this.f6478g.setBackgroundResource(i3c0.f12461D2);
                this.f6479h.setTextColor(Color.parseColor("#9f00d1"));
            }
        } else {
            this.f6476e.setBackground(null);
            xdl0.M(this.f6477f, false);
            xdl0.M(this.f6486o, true);
            xdl0.M(this.f6487p, false);
        }
        xdl0.E0(this, new View.OnClickListener() { // from class: l.frs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(((DbObject) f0tVar.f10081b.h()).id);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final void m8244k0(BLiveUserLevel bLiveUserLevel) {
        if (bLiveUserLevel == null || TextUtils.isEmpty(bLiveUserLevel.backendUrl)) {
            xdl0.M(this.f6482k, false);
        } else {
            xdl0.M(this.f6482k, true);
            sxj.c(bLiveUserLevel.backendUrl, this.f6482k, bLiveUserLevel.grade >= 43 ? sxj.b : sxj.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8242i0(this);
    }

    public LiveGuardItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
