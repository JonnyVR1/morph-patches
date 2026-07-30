package com.p051p1.mobile.putong.core.p058ui.vip.greet;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.vip.widget.LetterRemainingSwitcherView;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear;
import p153l.a5i0;
import p153l.bdr;
import p153l.bnl0;
import p153l.ela;
import p153l.gul0;
import p153l.h0b0;
import p153l.i4g0;
import p153l.joa;
import p153l.pcj;
import p153l.pf60;
import p153l.qa00;
import p153l.v3m;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class ProfileSendLetterView extends VLinear implements v3m {

    /* JADX INFO: renamed from: c */
    public TextView f37937c;

    /* JADX INFO: renamed from: d */
    public TextView f37938d;

    /* JADX INFO: renamed from: e */
    public LetterRemainingSwitcherView f37939e;

    /* JADX INFO: renamed from: f */
    public boolean f37940f;

    /* JADX INFO: renamed from: g */
    public Act f37941g;

    /* JADX INFO: renamed from: h */
    public String f37942h;

    public ProfileSendLetterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37940f = false;
    }

    /* JADX INFO: renamed from: R */
    private boolean m57494R() {
        return TextUtils.equals(this.f37942h, "from_picks") || TextUtils.equals(this.f37942h, "from_meet_picks_feed") || TextUtils.equals(this.f37942h, "from_new_meet_picks_feed");
    }

    @Override // p153l.v3m
    /* JADX INFO: renamed from: H */
    public void mo57467H(final User user, boolean z, final y20<String> y20Var, final pcj<String> pcjVar, final String str) {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.g0b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101624a.m57496S(str, user, y20Var, pcjVar, view);
            }
        });
    }

    @Override // p153l.v3m
    /* JADX INFO: renamed from: I */
    public void mo57475I(boolean z) {
        if (z) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f37939e.getLayoutParams();
        layoutParams.rightMargin = qa00.m175859d(10.0f);
        this.f37939e.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: Q */
    public final void m57495Q(View view) {
        h0b0.m133147a(this, view);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m57496S(String str, User user, y20 y20Var, pcj pcjVar, View view) {
        if (!m57494R() || joa.m146358H3() || ela.m121122r3() > 0) {
            if (!joa.m146361M3()) {
                boolean zEquals = "liked_users".equals(str);
                Act act = this.f37941g;
                if (zEquals) {
                    C8927c.m54659n1(act, "p_navigation_ilike,card_button_pull", Privilege.liked_user);
                } else {
                    C8927c.m54659n1(act, "p_profile,letter", Privilege.letter);
                }
            } else if (a5i0.m96096G()) {
                bdr.m103630h(this.f37941g, user, y20Var, "liked_users".equals(str));
            } else {
                a5i0.m96169s1(this.f37941g, "liked_users".equals(str) ? "p_navigation_ilike,card_button_pull" : "p_profile,letter");
            }
        } else {
            CoreModule.m30933P().m143405a().mo34369Mc(this.f37941g, str);
        }
        i4g0.m138523u("liked_users".equals(str) ? "e_iliked_letter" : "e_letter_bar", (String) pcjVar.call(), pf60.m172085a("is_privileged", gul0.m132340e(joa.m146361M3() && (joa.m146355E3() || a5i0.m96096G()))));
    }

    @Override // p153l.v3m
    public TextView getEnvelopSayHai() {
        return this.f37937c;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57495Q(this);
    }

    @Override // p153l.v3m
    /* JADX INFO: renamed from: q */
    public void mo57470q(Act act, String str, User user, pcj<String> pcjVar, String str2) {
        this.f37941g = act;
        this.f37942h = str;
        if (TextUtils.equals(str, "impress_signal")) {
            bnl0.m105524M(this, false);
            return;
        }
        this.f37938d.setText(R$string.f18959W2);
        if (NullChecker.m82486a(user)) {
            TextView textView = this.f37937c;
            Typeface typeface = Typeface.DEFAULT_BOLD;
            textView.setTypeface(typeface);
            this.f37938d.setTypeface(typeface);
            this.f37937c.setText(TEnum.equals(user.gender, "female") ? R$string.f18809R2 : R$string.f18839S2);
        }
    }

    public ProfileSendLetterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProfileSendLetterView(Context context) {
        this(context, null);
    }
}
