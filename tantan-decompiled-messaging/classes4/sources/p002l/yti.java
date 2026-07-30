package p002l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.app.a;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveFollowRatePopupV2;
import l.hxs;
import l.s7m;
import l.uxi;
import l.xdl0;
import l.ypv;
import v.VDraweeView;
import v.VFrame;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yti implements s7m<hui> {

    /* JADX INFO: renamed from: a */
    public VLinear f23077a;

    /* JADX INFO: renamed from: b */
    public View f23078b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f23079c;

    /* JADX INFO: renamed from: d */
    public VFrame f23080d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f23081e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f23082f;

    /* JADX INFO: renamed from: g */
    public VText f23083g;

    /* JADX INFO: renamed from: h */
    public VText f23084h;

    /* JADX INFO: renamed from: i */
    public ImageView f23085i;

    /* JADX INFO: renamed from: j */
    public VText f23086j;

    /* JADX INFO: renamed from: k */
    public VRelative f23087k;

    /* JADX INFO: renamed from: l */
    public VText f23088l;

    /* JADX INFO: renamed from: m */
    public VText f23089m;

    /* JADX INFO: renamed from: n */
    public RelativeLayout f23090n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f23091o;

    /* JADX INFO: renamed from: p */
    public VText f23092p;

    /* JADX INFO: renamed from: q */
    public VText f23093q;

    /* JADX INFO: renamed from: r */
    public VText f23094r;

    /* JADX INFO: renamed from: s */
    public hui f23095s;

    /* JADX INFO: renamed from: t */
    public C0200a f23096t;

    /* JADX INFO: renamed from: u */
    public String f23097u;

    private void init() {
        byr byrVar = new byr(this.f23095s, m26925e(this.f23095s.act().inflater(), null));
        this.f23096t = byrVar;
        byrVar.m5146j0(LiveDialogEnum.FOLLOW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m26922l(View view) {
        this.f23095s.m14822R3(this.f23086j.getText().toString(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m26923m(View view) {
        this.f23095s.m14822R3(this.f23086j.getText().toString(), false);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m26924C0() {
        return null;
    }

    @Nullable
    public Act act() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public View m26925e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return iui.m15413b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m26928i1(hui huiVar) {
        this.f23095s = huiVar;
    }

    /* JADX INFO: renamed from: i */
    public void m26927i() {
        if (isShowing()) {
            this.f23096t.dismiss();
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        a aVar = this.f23096t;
        return aVar != null && aVar.isShowing();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m26929j(View view) {
        m26927i();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m26930k(View view) {
        m26927i();
    }

    /* JADX INFO: renamed from: n */
    public final void m26931n(User user, BLiveFollowRatePopupV2 bLiveFollowRatePopupV2) {
        xdl0.M(this.f23090n, true);
        xdl0.M(this.f23079c, false);
        hxs.r("context_single_room", this.f23091o, user.fp().profileSmall());
        String str = ypv.a.V().name;
        if (str.length() > 8) {
            str = String.format("%s...", str.substring(0, 8));
        }
        this.f23092p.setText(String.format("%s%s%s", bLiveFollowRatePopupV2.titlePrefix, str, bLiveFollowRatePopupV2.titleSuffix));
        this.f23093q.setText(bLiveFollowRatePopupV2.text);
        this.f23094r.setText(uxi.a(user.gender));
        this.f23094r.setBackgroundResource(i3c0.f12898o7);
        this.f23094r.setTextColor(Color.parseColor("#ffffff"));
        this.f23078b.setOnClickListener(new View.OnClickListener() { // from class: l.wti
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21974a.m26929j(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m26932p(User user, BLiveFollowRatePopupV2 bLiveFollowRatePopupV2) {
        xdl0.M(this.f23079c, true);
        xdl0.M(this.f23090n, false);
        hxs.r("context_single_room", this.f23081e, user.fp().profileSmall());
        this.f23083g.setText(user.name);
        this.f23086j.setText(bLiveFollowRatePopupV2.text);
        this.f23084h.setText(String.valueOf(user.age));
        boolean zIsFemale = user.isFemale();
        ImageView imageView = this.f23085i;
        if (zIsFemale) {
            imageView.setImageResource(i3c0.f12725a2);
            this.f23085i.setBackgroundResource(i3c0.f12934r7);
        } else {
            imageView.setImageResource(i3c0.f12737b2);
            this.f23085i.setBackgroundResource(i3c0.f12946s7);
        }
        this.f23087k.setBackgroundResource(i3c0.f12435B0);
        this.f23088l.setText(uxi.a(user.gender));
        this.f23078b.setOnClickListener(new View.OnClickListener() { // from class: l.xti
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22454a.m26930k(view);
            }
        });
        xdl0.M(this.f23089m, false);
        if (TextUtils.equals(this.f23097u, "ticker")) {
            this.f23089m.setText(ypv.e.getString(R$string.f3705z0, Integer.valueOf(bLiveFollowRatePopupV2.tickerTime)));
            xdl0.M(this.f23089m, true);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m26933q(User user, BLiveFollowRatePopupV2 bLiveFollowRatePopupV2) {
        if (user == null) {
            return;
        }
        this.f23097u = bLiveFollowRatePopupV2.type;
        if (this.f23096t == null) {
            init();
        }
        xdl0.E0(this.f23087k, new View.OnClickListener() { // from class: l.uti
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20792a.m26922l(view);
            }
        });
        xdl0.E0(this.f23094r, new View.OnClickListener() { // from class: l.vti
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21297a.m26923m(view);
            }
        });
        if (TextUtils.equals(bLiveFollowRatePopupV2.type, "float")) {
            m26931n(user, bLiveFollowRatePopupV2);
        } else {
            m26932p(user, bLiveFollowRatePopupV2);
        }
        this.f23096t.show();
    }

    /* JADX INFO: renamed from: s */
    public void m26934s(Long l2) {
        if (this.f23096t == null) {
            return;
        }
        this.f23089m.setText(ypv.e.getString(R$string.f3705z0, l2));
    }

    /* JADX INFO: renamed from: u */
    public final void m26935u() {
        this.f23094r.setBackgroundResource(i3c0.f12502G7);
        this.f23094r.setText(ypv.e.getString(R$string.f2939Pe));
        xdl0.E0(this.f23087k, (View.OnClickListener) null);
        xdl0.E0(this.f23094r, (View.OnClickListener) null);
        this.f23094r.setTextColor(Color.parseColor("#d0d0d0"));
        this.f23094r.postDelayed(new tti(this), 1000L);
    }

    /* JADX INFO: renamed from: v */
    public void m26936v() {
        if (this.f23096t == null) {
            return;
        }
        if (TextUtils.equals(this.f23097u, "float")) {
            m26935u();
        } else {
            m26937w();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m26937w() {
        xdl0.M(this.f23089m, false);
        this.f23087k.setBackgroundResource(i3c0.f12701Y0);
        this.f23088l.setText(ypv.e.getString(R$string.f2939Pe));
        xdl0.E0(this.f23087k, (View.OnClickListener) null);
        xdl0.E0(this.f23094r, (View.OnClickListener) null);
        this.f23088l.setTextColor(Color.parseColor("#40ffffff"));
        this.f23087k.postDelayed(new tti(this), 1000L);
    }

    public void destroy() {
    }
}
