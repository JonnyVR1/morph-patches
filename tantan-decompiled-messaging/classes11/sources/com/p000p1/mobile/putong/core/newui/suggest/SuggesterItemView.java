package com.p000p1.mobile.putong.core.newui.suggest;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CardOption;
import com.p1.mobile.putong.core.data.CardPattern;
import com.p1.mobile.putong.core.data.CardPatternBottomContent;
import com.p1.mobile.putong.core.data.CardPatternCombinedIcon;
import com.p1.mobile.putong.core.data.CardPatternOptionIcon;
import com.p1.mobile.putong.core.ui.GradientBgButton;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.vip.likers.LikersItemView;
import com.p1.mobile.putong.data.User;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.d30;
import l.j2e0;
import l.qib0;
import l.roj0;
import l.upa;
import l.vwb;
import l.w9j;
import l.wug0;
import l.x2c0;
import l.xdl0;
import p009l.iug0;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class SuggesterItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f5576a;

    /* JADX INFO: renamed from: b */
    public VText f5577b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f5578c;

    /* JADX INFO: renamed from: d */
    public VImage f5579d;

    /* JADX INFO: renamed from: e */
    public GradientBgButton f5580e;

    /* JADX INFO: renamed from: f */
    public VText f5581f;

    /* JADX INFO: renamed from: g */
    public VText f5582g;

    /* JADX INFO: renamed from: h */
    public VText f5583h;

    /* JADX INFO: renamed from: i */
    public boolean f5584i;

    /* JADX INFO: renamed from: j */
    public User f5585j;

    /* JADX INFO: renamed from: k */
    public CardOption f5586k;

    /* JADX INFO: renamed from: l */
    public CardOption f5587l;

    /* JADX INFO: renamed from: m */
    public CardPattern f5588m;

    public SuggesterItemView(@NonNull Context context) {
        super(context);
        this.f5584i = true;
        m7822f().duringCreated(LikersItemView.y).map(new w9j() { // from class: l.sug0
            public final Object call(Object obj) {
                return this.f20472a.m7829m((roj0) obj);
            }
        }).delay(1500L, TimeUnit.MILLISECONDS).map(new w9j() { // from class: l.tug0
            public final Object call(Object obj) {
                return this.f20874a.m7830n((Boolean) obj);
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: e */
    public final void m7821e(View view) {
        wug0.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public Act m7822f() {
        return getContext();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m7823g() {
        return this.f5584i && m7822f().lifecycle_() == c.i;
    }

    public CardPattern getCardPattern() {
        return this.f5588m;
    }

    public CardOption getLeftOption() {
        return this.f5586k;
    }

    public CardOption getRightOption() {
        return this.f5587l;
    }

    public User getUser() {
        return this.f5585j;
    }

    /* JADX INFO: renamed from: h */
    public final void m7824h(String str) {
        j2e0.m(m7822f(), Uri.parse(str));
    }

    /* JADX INFO: renamed from: i */
    public final void m7825i(final String str, List<CardOption> list, final CardPatternOptionIcon cardPatternOptionIcon, final d30 d30Var, final d30 d30Var2, final d30 d30Var3) {
        if (!vwb.J(list)) {
            for (final CardOption cardOption : list) {
                String str2 = cardOption.action;
                str2.getClass();
                switch (str2) {
                    case "tap":
                        xdl0.E0(this, new View.OnClickListener() { // from class: l.uug0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f21338a.m7827k(cardOption, d30Var, d30Var3, str, view);
                            }
                        });
                        continue;
                        break;
                    case "left":
                        this.f5586k = cardOption;
                        break;
                    case "right":
                        break;
                    default:
                        continue;
                        break;
                }
                this.f5587l = cardOption;
            }
        }
        xdl0.E0(this.f5580e, new View.OnClickListener() { // from class: l.vug0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21793a.m7828l(cardPatternOptionIcon, d30Var, d30Var3, d30Var2, view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m7826j(String str) {
        m7822f().startActivityForResultWithCustomTransition(ProfileAct.n2(m7822f(), str, "home_card", true), 18, upa.L3() ? null : new iug0(this.f5576a, this.f5578c));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m7827k(CardOption cardOption, d30 d30Var, d30 d30Var2, String str, View view) {
        if (TextUtils.isEmpty(cardOption.link)) {
            if (m7823g()) {
                d30Var.call();
                m7826j(str);
                return;
            }
            return;
        }
        d30Var.call();
        j2e0.m(m7822f(), Uri.parse(cardOption.link));
        if (cardOption.disappear) {
            d30Var2.call();
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m7828l(CardPatternOptionIcon cardPatternOptionIcon, d30 d30Var, d30 d30Var2, d30 d30Var3, View view) {
        if (TextUtils.isEmpty(cardPatternOptionIcon.option.link)) {
            d30Var3.call();
            return;
        }
        d30Var.call();
        m7824h(cardPatternOptionIcon.option.link);
        if (cardPatternOptionIcon.option.disappear) {
            d30Var2.call();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Boolean m7829m(roj0 roj0Var) {
        this.f5584i = false;
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Boolean m7830n(Boolean bool) {
        this.f5584i = true;
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: o */
    public void m7831o(CardPattern cardPattern, d30 d30Var, d30 d30Var2, d30 d30Var3) {
        this.f5588m = cardPattern;
        this.f5585j = CoreModule.c.e0.Pa(cardPattern.userId);
        qib0.G.N0(this.f5576a, cardPattern.cover, false);
        m7834r(cardPattern.realUser);
        m7832p(cardPattern.bottomContent);
        m7837u(cardPattern.topleftIcon);
        m7833q(cardPattern.lowerRightIcon);
        m7825i(cardPattern.userId, cardPattern.cardOptions, cardPattern.lowerRightIcon, d30Var, d30Var2, d30Var3);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7821e(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m7832p(CardPatternBottomContent cardPatternBottomContent) {
        xdl0.M(this.f5581f, !TextUtils.isEmpty(cardPatternBottomContent.topContent.context));
        xdl0.M(this.f5582g, !TextUtils.isEmpty(cardPatternBottomContent.middleContext));
        xdl0.M(this.f5583h, !TextUtils.isEmpty(cardPatternBottomContent.bottomContext));
        if (xdl0.O0(this.f5581f)) {
            this.f5581f.setText(cardPatternBottomContent.topContent.context);
            m7836t(this.f5581f, cardPatternBottomContent.topContent.iconId);
            m7835s(this.f5581f, cardPatternBottomContent.topContent.backgroundId);
        }
        if (xdl0.O0(this.f5582g)) {
            this.f5582g.setText(cardPatternBottomContent.middleContext);
        }
        if (xdl0.O0(this.f5583h)) {
            this.f5583h.setText(cardPatternBottomContent.bottomContext);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m7833q(CardPatternOptionIcon cardPatternOptionIcon) {
        this.f5580e.setVisibility(0);
        this.f5580e.setAlpha(1.0f);
        if (TextUtils.isEmpty(cardPatternOptionIcon.iconId)) {
            return;
        }
        String str = cardPatternOptionIcon.iconId;
        str.getClass();
        if (str.equals("love")) {
            this.f5580e.setIcon(getContext().getResources().getDrawable(x2c0.po));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m7834r(String str) {
        if ("realAvatar".equals(str)) {
            xdl0.M(this.f5578c, true);
            this.f5579d.setBackgroundResource(x2c0.Pt);
            return;
        }
        boolean zEquals = "verified".equals(str);
        LinearLayout linearLayout = this.f5578c;
        if (!zEquals) {
            xdl0.M(linearLayout, false);
        } else {
            xdl0.M(linearLayout, true);
            this.f5579d.setBackgroundResource(x2c0.Up);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m7835s(TextView textView, String str) {
        str.getClass();
        switch (str) {
            case "orange":
                textView.setBackgroundResource(x2c0.Xo);
                break;
            case "grey":
                textView.setBackgroundResource(x2c0.R2);
                break;
            case "pink":
                textView.setBackgroundResource(x2c0.W3);
                break;
            case "white":
                textView.setBackgroundResource(x2c0.e4);
                break;
            case "white2grey":
                textView.setBackgroundResource(x2c0.d4);
                break;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m7836t(TextView textView, String str) {
        str.getClass();
        switch (str) {
            case "active":
                textView.setCompoundDrawablesWithIntrinsicBounds(x2c0.C2, 0, 0, 0);
                break;
            case "passby":
                textView.setCompoundDrawablesWithIntrinsicBounds(x2c0.f4, 0, 0, 0);
                break;
            case "chat":
                textView.setCompoundDrawablesWithIntrinsicBounds(x2c0.w2, 0, 0, 0);
                break;
            case "love":
                textView.setCompoundDrawablesWithIntrinsicBounds(x2c0.A2, 0, 0, 0);
                break;
            case "star":
                textView.setCompoundDrawablesWithIntrinsicBounds(x2c0.Oo, 0, 0, 0);
                break;
            case "country":
                textView.setCompoundDrawablesWithIntrinsicBounds(x2c0.Jo, 0, 0, 0);
                break;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m7837u(CardPatternCombinedIcon cardPatternCombinedIcon) {
        String str = cardPatternCombinedIcon.backgroundId;
        String str2 = cardPatternCombinedIcon.iconId;
        String str3 = cardPatternCombinedIcon.context;
        boolean zIsEmpty = TextUtils.isEmpty(str3);
        VText vText = this.f5577b;
        if (zIsEmpty) {
            xdl0.M(vText, false);
            return;
        }
        m7836t(vText, str2);
        m7835s(this.f5577b, str);
        this.f5577b.setText(str3);
        xdl0.M(this.f5577b, true);
    }

    public SuggesterItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5584i = true;
        m7822f().duringCreated(LikersItemView.y).map(new w9j() { // from class: l.sug0
            public final Object call(Object obj) {
                return this.f20472a.m7829m((roj0) obj);
            }
        }).delay(1500L, TimeUnit.MILLISECONDS).map(new w9j() { // from class: l.tug0
            public final Object call(Object obj) {
                return this.f20874a.m7830n((Boolean) obj);
            }
        }).subscribe();
    }

    public SuggesterItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5584i = true;
        m7822f().duringCreated(LikersItemView.y).map(new w9j() { // from class: l.sug0
            public final Object call(Object obj) {
                return this.f20472a.m7829m((roj0) obj);
            }
        }).delay(1500L, TimeUnit.MILLISECONDS).map(new w9j() { // from class: l.tug0
            public final Object call(Object obj) {
                return this.f20874a.m7830n((Boolean) obj);
            }
        }).subscribe();
    }
}
