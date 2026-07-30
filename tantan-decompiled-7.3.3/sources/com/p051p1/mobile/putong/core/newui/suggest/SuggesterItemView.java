package com.p051p1.mobile.putong.core.newui.suggest;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CardOption;
import com.p051p1.mobile.putong.core.data.CardPattern;
import com.p051p1.mobile.putong.core.data.CardPatternBottomContent;
import com.p051p1.mobile.putong.core.data.CardPatternCombinedIcon;
import com.p051p1.mobile.putong.core.data.CardPatternOptionIcon;
import com.p051p1.mobile.putong.core.data.LikeFilterSortType;
import com.p051p1.mobile.putong.core.p058ui.GradientBgButton;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersItemView;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.e3h0;
import p153l.gra;
import p153l.jyb;
import p153l.nae0;
import p153l.q2h0;
import p153l.qcj;
import p153l.uqb0;
import p153l.uxj0;
import p153l.x20;

/* JADX INFO: loaded from: classes11.dex */
public class SuggesterItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f27646a;

    /* JADX INFO: renamed from: b */
    public VText f27647b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f27648c;

    /* JADX INFO: renamed from: d */
    public VImage f27649d;

    /* JADX INFO: renamed from: e */
    public GradientBgButton f27650e;

    /* JADX INFO: renamed from: f */
    public VText f27651f;

    /* JADX INFO: renamed from: g */
    public VText f27652g;

    /* JADX INFO: renamed from: h */
    public VText f27653h;

    /* JADX INFO: renamed from: i */
    public boolean f27654i;

    /* JADX INFO: renamed from: j */
    public User f27655j;

    /* JADX INFO: renamed from: k */
    public CardOption f27656k;

    /* JADX INFO: renamed from: l */
    public CardOption f27657l;

    /* JADX INFO: renamed from: m */
    public CardPattern f27658m;

    public SuggesterItemView(@NonNull Context context) {
        super(context);
        this.f27654i = true;
        m44762f().duringCreated(LikersItemView.f38140y).map(new qcj() { // from class: l.a3h0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f68291a.m44769m((uxj0) obj);
            }
        }).delay(1500L, TimeUnit.MILLISECONDS).map(new qcj() { // from class: l.b3h0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f74772a.m44770n((Boolean) obj);
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: e */
    public final void m44761e(View view) {
        e3h0.m119287a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public Act m44762f() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m44763g() {
        return this.f27654i && m44762f().lifecycle_() == C4470c.f16267i;
    }

    public CardPattern getCardPattern() {
        return this.f27658m;
    }

    public CardOption getLeftOption() {
        return this.f27656k;
    }

    public CardOption getRightOption() {
        return this.f27657l;
    }

    public User getUser() {
        return this.f27655j;
    }

    /* JADX INFO: renamed from: h */
    public final void m44764h(String str) {
        nae0.m162083m(m44762f(), Uri.parse(str));
    }

    /* JADX INFO: renamed from: i */
    public final void m44765i(final String str, List<CardOption> list, final CardPatternOptionIcon cardPatternOptionIcon, final x20 x20Var, final x20 x20Var2, final x20 x20Var3) {
        if (!jyb.m147479J(list)) {
            for (final CardOption cardOption : list) {
                String str2 = cardOption.action;
                str2.getClass();
                switch (str2) {
                    case "tap":
                        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.c3h0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f79607a.m44767k(cardOption, x20Var, x20Var3, str, view);
                            }
                        });
                        continue;
                        break;
                    case "left":
                        this.f27656k = cardOption;
                        break;
                    case "right":
                        break;
                    default:
                        continue;
                        break;
                }
                this.f27657l = cardOption;
            }
        }
        bnl0.m105509E0(this.f27650e, new View.OnClickListener() { // from class: l.d3h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84898a.m44768l(cardPatternOptionIcon, x20Var, x20Var3, x20Var2, view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m44766j(String str) {
        m44762f().startActivityForResultWithCustomTransition(ProfileAct.m51920o2(m44762f(), str, "home_card", true), 18, gra.m131596L3() ? null : new q2h0(this.f27646a, this.f27648c));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m44767k(CardOption cardOption, x20 x20Var, x20 x20Var2, String str, View view) {
        if (TextUtils.isEmpty(cardOption.link)) {
            if (m44763g()) {
                x20Var.call();
                m44766j(str);
                return;
            }
            return;
        }
        x20Var.call();
        nae0.m162083m(m44762f(), Uri.parse(cardOption.link));
        if (cardOption.disappear) {
            x20Var2.call();
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m44768l(CardPatternOptionIcon cardPatternOptionIcon, x20 x20Var, x20 x20Var2, x20 x20Var3, View view) {
        if (TextUtils.isEmpty(cardPatternOptionIcon.option.link)) {
            x20Var3.call();
            return;
        }
        x20Var.call();
        m44764h(cardPatternOptionIcon.option.link);
        if (cardPatternOptionIcon.option.disappear) {
            x20Var2.call();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Boolean m44769m(uxj0 uxj0Var) {
        this.f27654i = false;
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Boolean m44770n(Boolean bool) {
        this.f27654i = true;
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: o */
    public void m44771o(CardPattern cardPattern, x20 x20Var, x20 x20Var2, x20 x20Var3) {
        this.f27658m = cardPattern;
        this.f27655j = CoreModule.f18264c.f20381e0.m116503Pa(cardPattern.userId);
        uqb0.f180374G.m127119N0(this.f27646a, cardPattern.cover, false);
        m44774r(cardPattern.realUser);
        m44772p(cardPattern.bottomContent);
        m44777u(cardPattern.topleftIcon);
        m44773q(cardPattern.lowerRightIcon);
        m44765i(cardPattern.userId, cardPattern.cardOptions, cardPattern.lowerRightIcon, x20Var, x20Var2, x20Var3);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44761e(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m44772p(CardPatternBottomContent cardPatternBottomContent) {
        bnl0.m105524M(this.f27651f, !TextUtils.isEmpty(cardPatternBottomContent.topContent.context));
        bnl0.m105524M(this.f27652g, !TextUtils.isEmpty(cardPatternBottomContent.middleContext));
        bnl0.m105524M(this.f27653h, !TextUtils.isEmpty(cardPatternBottomContent.bottomContext));
        if (bnl0.m105529O0(this.f27651f)) {
            this.f27651f.setText(cardPatternBottomContent.topContent.context);
            m44776t(this.f27651f, cardPatternBottomContent.topContent.iconId);
            m44775s(this.f27651f, cardPatternBottomContent.topContent.backgroundId);
        }
        if (bnl0.m105529O0(this.f27652g)) {
            this.f27652g.setText(cardPatternBottomContent.middleContext);
        }
        if (bnl0.m105529O0(this.f27653h)) {
            this.f27653h.setText(cardPatternBottomContent.bottomContext);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m44773q(CardPatternOptionIcon cardPatternOptionIcon) {
        this.f27650e.setVisibility(0);
        this.f27650e.setAlpha(1.0f);
        if (TextUtils.isEmpty(cardPatternOptionIcon.iconId)) {
            return;
        }
        String str = cardPatternOptionIcon.iconId;
        str.getClass();
        if (str.equals("love")) {
            this.f27650e.setIcon(getContext().getResources().getDrawable(dbc0.f86932dp));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m44774r(String str) {
        if (LikeFilterSortType.realAvatar.equals(str)) {
            bnl0.m105524M(this.f27648c, true);
            this.f27649d.setBackgroundResource(dbc0.f86103Du);
            return;
        }
        boolean zEquals = "verified".equals(str);
        LinearLayout linearLayout = this.f27648c;
        if (!zEquals) {
            bnl0.m105524M(linearLayout, false);
        } else {
            bnl0.m105524M(linearLayout, true);
            this.f27649d.setBackgroundResource(dbc0.f86259Iq);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m44775s(TextView textView, String str) {
        str.getClass();
        switch (str) {
            case "orange":
                textView.setBackgroundResource(dbc0.f86354Lp);
                break;
            case "grey":
                textView.setBackgroundResource(dbc0.f86555S2);
                break;
            case "pink":
                textView.setBackgroundResource(dbc0.f86716X3);
                break;
            case "white":
                textView.setBackgroundResource(dbc0.f86977f4);
                break;
            case "white2grey":
                textView.setBackgroundResource(dbc0.f86944e4);
                break;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m44776t(TextView textView, String str) {
        str.getClass();
        switch (str) {
            case "active":
                textView.setCompoundDrawablesWithIntrinsicBounds(dbc0.f86075D2, 0, 0, 0);
                break;
            case "passby":
                textView.setCompoundDrawablesWithIntrinsicBounds(dbc0.f87010g4, 0, 0, 0);
                break;
            case "chat":
                textView.setCompoundDrawablesWithIntrinsicBounds(dbc0.f87564x2, 0, 0, 0);
                break;
            case "love":
                textView.setCompoundDrawablesWithIntrinsicBounds(dbc0.f86011B2, 0, 0, 0);
                break;
            case "star":
                textView.setCompoundDrawablesWithIntrinsicBounds(dbc0.f86066Cp, 0, 0, 0);
                break;
            case "country":
                textView.setCompoundDrawablesWithIntrinsicBounds(dbc0.f87587xp, 0, 0, 0);
                break;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m44777u(CardPatternCombinedIcon cardPatternCombinedIcon) {
        String str = cardPatternCombinedIcon.backgroundId;
        String str2 = cardPatternCombinedIcon.iconId;
        String str3 = cardPatternCombinedIcon.context;
        boolean zIsEmpty = TextUtils.isEmpty(str3);
        VText vText = this.f27647b;
        if (zIsEmpty) {
            bnl0.m105524M(vText, false);
            return;
        }
        m44776t(vText, str2);
        m44775s(this.f27647b, str);
        this.f27647b.setText(str3);
        bnl0.m105524M(this.f27647b, true);
    }

    public SuggesterItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27654i = true;
        m44762f().duringCreated(LikersItemView.f38140y).map(new qcj() { // from class: l.a3h0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f68291a.m44769m((uxj0) obj);
            }
        }).delay(1500L, TimeUnit.MILLISECONDS).map(new qcj() { // from class: l.b3h0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f74772a.m44770n((Boolean) obj);
            }
        }).subscribe();
    }

    public SuggesterItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27654i = true;
        m44762f().duringCreated(LikersItemView.f38140y).map(new qcj() { // from class: l.a3h0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f68291a.m44769m((uxj0) obj);
            }
        }).delay(1500L, TimeUnit.MILLISECONDS).map(new qcj() { // from class: l.b3h0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f74772a.m44770n((Boolean) obj);
            }
        }).subscribe();
    }
}
