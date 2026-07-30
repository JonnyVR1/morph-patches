package com.p046p1.mobile.putong.core.p053ui.vip.greet;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.vip.widget.LetterRemainingSwitcherView;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p147v.VLinear;
import p149l.c1m;
import p149l.cll0;
import p149l.dsa0;
import p149l.e30;
import p149l.j760;
import p149l.sja;
import p149l.swh0;
import p149l.t100;
import p149l.v9j;
import p149l.xdl0;
import p149l.xma;
import p149l.zar;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class ProfileSendLetterView extends VLinear implements c1m {

    /* JADX INFO: renamed from: c */
    public TextView f37089c;

    /* JADX INFO: renamed from: d */
    public TextView f37090d;

    /* JADX INFO: renamed from: e */
    public LetterRemainingSwitcherView f37091e;

    /* JADX INFO: renamed from: f */
    public boolean f37092f;

    /* JADX INFO: renamed from: g */
    public Act f37093g;

    /* JADX INFO: renamed from: h */
    public String f37094h;

    public ProfileSendLetterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37092f = false;
    }

    /* JADX INFO: renamed from: R */
    private boolean m56311R() {
        return TextUtils.equals(this.f37094h, "from_picks") || TextUtils.equals(this.f37094h, "from_meet_picks_feed") || TextUtils.equals(this.f37094h, "from_new_meet_picks_feed");
    }

    @Override // p149l.c1m
    /* JADX INFO: renamed from: H */
    public void mo56284H(final User user, boolean z, final e30<String> e30Var, final v9j<String> v9jVar, final String str) {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.csa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82336a.m56313S(str, user, e30Var, v9jVar, view);
            }
        });
    }

    @Override // p149l.c1m
    /* JADX INFO: renamed from: I */
    public void mo56292I(boolean z) {
        if (z) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f37091e.getLayoutParams();
        layoutParams.rightMargin = t100.m186890d(10.0f);
        this.f37091e.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: Q */
    public final void m56312Q(View view) {
        dsa0.m113454a(this, view);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m56313S(String str, User user, e30 e30Var, v9j v9jVar, View view) {
        if (!m56311R() || xma.m210044G3() || sja.m184461r3() > 0) {
            if (!xma.m210047L3()) {
                boolean zEquals = "liked_users".equals(str);
                Act act = this.f37093g;
                if (zEquals) {
                    C8764c.m53476n1(act, "p_navigation_ilike,card_button_pull", Privilege.liked_user);
                } else {
                    C8764c.m53476n1(act, "p_profile,letter", Privilege.letter);
                }
            } else if (swh0.m186191G()) {
                zar.m217749h(this.f37093g, user, e30Var, "liked_users".equals(str));
            } else {
                swh0.m186264s1(this.f37093g, "liked_users".equals(str) ? "p_navigation_ilike,card_button_pull" : "p_profile,letter");
            }
        } else {
            CoreModule.m29935P().m94651a().mo33366Mc(this.f37093g, str);
        }
        zvf0.m220399u("liked_users".equals(str) ? "e_iliked_letter" : "e_letter_bar", (String) v9jVar.call(), j760.m140076a("is_privileged", cll0.m107558e(xma.m210047L3() && (xma.m210041D3() || swh0.m186191G()))));
    }

    @Override // p149l.c1m
    public TextView getEnvelopSayHai() {
        return this.f37089c;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56312Q(this);
    }

    @Override // p149l.c1m
    /* JADX INFO: renamed from: q */
    public void mo56287q(Act act, String str, User user, v9j<String> v9jVar, String str2) {
        this.f37093g = act;
        this.f37094h = str;
        if (TextUtils.equals(str, "impress_signal")) {
            xdl0.m208344M(this, false);
            return;
        }
        this.f37090d.setText(R$string.f18169U2);
        if (NullChecker.m81303a(user)) {
            TextView textView = this.f37089c;
            Typeface typeface = Typeface.DEFAULT_BOLD;
            textView.setTypeface(typeface);
            this.f37090d.setTypeface(typeface);
            this.f37089c.setText(TEnum.equals(user.gender, "female") ? R$string.f18019P2 : R$string.f18049Q2);
        }
    }

    public ProfileSendLetterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProfileSendLetterView(Context context) {
        this(context, null);
    }
}
