package com.p000p1.mobile.putong.core.p004ui.vip.greet;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.widget.LetterRemainingSwitcherView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.dsa0;
import l.e30;
import l.j760;
import l.t100;
import l.v9j;
import l.xdl0;
import l.zvf0;
import p006l.c1m;
import p006l.cll0;
import p006l.sja;
import p006l.swh0;
import p006l.xma;
import p006l.zar;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ProfileSendLetterView extends VLinear implements c1m {

    /* JADX INFO: renamed from: c */
    public TextView f6870c;

    /* JADX INFO: renamed from: d */
    public TextView f6871d;

    /* JADX INFO: renamed from: e */
    public LetterRemainingSwitcherView f6872e;

    /* JADX INFO: renamed from: f */
    public boolean f6873f;

    /* JADX INFO: renamed from: g */
    public Act f6874g;

    /* JADX INFO: renamed from: h */
    public String f6875h;

    public ProfileSendLetterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6873f = false;
    }

    /* JADX INFO: renamed from: R */
    private boolean m9745R() {
        return TextUtils.equals(this.f6875h, "from_picks") || TextUtils.equals(this.f6875h, "from_meet_picks_feed") || TextUtils.equals(this.f6875h, "from_new_meet_picks_feed");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p006l.c1m
    /* JADX INFO: renamed from: H */
    public void mo9718H(final User user, boolean z, final e30<String> e30Var, final v9j<String> v9jVar, final String str) {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.csa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9812a.m9747S(str, user, e30Var, v9jVar, view);
            }
        });
    }

    @Override // p006l.c1m
    /* JADX INFO: renamed from: I */
    public void mo9726I(boolean z) {
        if (z) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f6872e.getLayoutParams();
        layoutParams.rightMargin = t100.d(10.0f);
        this.f6872e.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: Q */
    public final void m9746Q(View view) {
        dsa0.a(this, view);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m9747S(String str, User user, e30 e30Var, v9j v9jVar, View view) {
        if (!m9745R() || xma.m27352G3() || sja.m23841r3() > 0) {
            if (!xma.m27355L3()) {
                boolean zEquals = "liked_users".equals(str);
                Act act = this.f6874g;
                if (zEquals) {
                    c.n1(act, "p_navigation_ilike,card_button_pull", Privilege.liked_user);
                } else {
                    c.n1(act, "p_profile,letter", Privilege.letter);
                }
            } else if (swh0.m24242G()) {
                zar.m28630h(this.f6874g, user, e30Var, "liked_users".equals(str));
            } else {
                swh0.m24315s1(this.f6874g, "liked_users".equals(str) ? "p_navigation_ilike,card_button_pull" : "p_profile,letter");
            }
        } else {
            CoreModule.m1854P().m11706a().m5303Mc(this.f6874g, str);
        }
        zvf0.u("liked_users".equals(str) ? "e_iliked_letter" : "e_letter_bar", (String) v9jVar.call(), new j760[]{j760.a("is_privileged", cll0.m13523e(xma.m27355L3() && (xma.m27349D3() || swh0.m24242G())))});
    }

    @Override // p006l.c1m
    public TextView getEnvelopSayHai() {
        return this.f6870c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m9746Q(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p006l.c1m
    /* JADX INFO: renamed from: q */
    public void mo9721q(Act act, String str, User user, v9j<String> v9jVar, String str2) {
        this.f6874g = act;
        this.f6875h = str;
        if (TextUtils.equals(str, "impress_signal")) {
            xdl0.M(this, false);
            return;
        }
        this.f6871d.setText(R$string.f2158U2);
        if (NullChecker.a(user)) {
            TextView textView = this.f6870c;
            Typeface typeface = Typeface.DEFAULT_BOLD;
            textView.setTypeface(typeface);
            this.f6871d.setTypeface(typeface);
            this.f6870c.setText(TEnum.equals(user.gender, "female") ? R$string.f2008P2 : R$string.f2038Q2);
        }
    }

    public ProfileSendLetterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProfileSendLetterView(Context context) {
        this(context, null);
    }
}
