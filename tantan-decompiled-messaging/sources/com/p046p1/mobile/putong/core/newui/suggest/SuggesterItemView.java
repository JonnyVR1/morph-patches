package com.p046p1.mobile.putong.core.newui.suggest;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CardOption;
import com.p046p1.mobile.putong.core.data.CardPattern;
import com.p046p1.mobile.putong.core.data.CardPatternBottomContent;
import com.p046p1.mobile.putong.core.data.CardPatternCombinedIcon;
import com.p046p1.mobile.putong.core.data.CardPatternOptionIcon;
import com.p046p1.mobile.putong.core.data.LikeFilterSortType;
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersItemView;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.d30;
import p149l.iug0;
import p149l.j2e0;
import p149l.qib0;
import p149l.roj0;
import p149l.upa;
import p149l.vwb;
import p149l.w9j;
import p149l.wug0;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class SuggesterItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f26798a;

    /* JADX INFO: renamed from: b */
    public VText f26799b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f26800c;

    /* JADX INFO: renamed from: d */
    public VImage f26801d;

    /* JADX INFO: renamed from: e */
    public GradientBgButton f26802e;

    /* JADX INFO: renamed from: f */
    public VText f26803f;

    /* JADX INFO: renamed from: g */
    public VText f26804g;

    /* JADX INFO: renamed from: h */
    public VText f26805h;

    /* JADX INFO: renamed from: i */
    public boolean f26806i;

    /* JADX INFO: renamed from: j */
    public User f26807j;

    /* JADX INFO: renamed from: k */
    public CardOption f26808k;

    /* JADX INFO: renamed from: l */
    public CardOption f26809l;

    /* JADX INFO: renamed from: m */
    public CardPattern f26810m;

    public SuggesterItemView(@NonNull Context context) {
        super(context);
        this.f26806i = true;
        m43576f().duringCreated(LikersItemView.f37292y).map(new w9j() { // from class: l.sug0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f166467a.m43583m((roj0) obj);
            }
        }).delay(1500L, TimeUnit.MILLISECONDS).map(new w9j() { // from class: l.tug0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f172170a.m43584n((Boolean) obj);
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: e */
    public final void m43575e(View view) {
        wug0.m205627a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public Act m43576f() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m43577g() {
        return this.f26806i && m43576f().lifecycle_() == C4319c.f15548i;
    }

    public CardPattern getCardPattern() {
        return this.f26810m;
    }

    public CardOption getLeftOption() {
        return this.f26808k;
    }

    public CardOption getRightOption() {
        return this.f26809l;
    }

    public User getUser() {
        return this.f26807j;
    }

    /* JADX INFO: renamed from: h */
    public final void m43578h(String str) {
        j2e0.m139446m(m43576f(), Uri.parse(str));
    }

    /* JADX INFO: renamed from: i */
    public final void m43579i(final String str, List<CardOption> list, final CardPatternOptionIcon cardPatternOptionIcon, final d30 d30Var, final d30 d30Var2, final d30 d30Var3) {
        if (!vwb.m200296J(list)) {
            for (final CardOption cardOption : list) {
                String str2 = cardOption.action;
                str2.getClass();
                switch (str2) {
                    case "tap":
                        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.uug0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f178380a.m43581k(cardOption, d30Var, d30Var3, str, view);
                            }
                        });
                        continue;
                        break;
                    case "left":
                        this.f26808k = cardOption;
                        break;
                    case "right":
                        break;
                    default:
                        continue;
                        break;
                }
                this.f26809l = cardOption;
            }
        }
        xdl0.m208329E0(this.f26802e, new View.OnClickListener() { // from class: l.vug0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183062a.m43582l(cardPatternOptionIcon, d30Var, d30Var3, d30Var2, view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m43580j(String str) {
        m43576f().startActivityForResultWithCustomTransition(ProfileAct.m50736n2(m43576f(), str, "home_card", true), 18, upa.m194665L3() ? null : new iug0(this.f26798a, this.f26800c));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m43581k(CardOption cardOption, d30 d30Var, d30 d30Var2, String str, View view) {
        if (TextUtils.isEmpty(cardOption.link)) {
            if (m43577g()) {
                d30Var.call();
                m43580j(str);
                return;
            }
            return;
        }
        d30Var.call();
        j2e0.m139446m(m43576f(), Uri.parse(cardOption.link));
        if (cardOption.disappear) {
            d30Var2.call();
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m43582l(CardPatternOptionIcon cardPatternOptionIcon, d30 d30Var, d30 d30Var2, d30 d30Var3, View view) {
        if (TextUtils.isEmpty(cardPatternOptionIcon.option.link)) {
            d30Var3.call();
            return;
        }
        d30Var.call();
        m43578h(cardPatternOptionIcon.option.link);
        if (cardPatternOptionIcon.option.disappear) {
            d30Var2.call();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Boolean m43583m(roj0 roj0Var) {
        this.f26806i = false;
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Boolean m43584n(Boolean bool) {
        this.f26806i = true;
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: o */
    public void m43585o(CardPattern cardPattern, d30 d30Var, d30 d30Var2, d30 d30Var3) {
        this.f26810m = cardPattern;
        this.f26807j = CoreModule.f17545c.f19639e0.m169430Pa(cardPattern.userId);
        qib0.f154691G.m102335N0(this.f26798a, cardPattern.cover, false);
        m43588r(cardPattern.realUser);
        m43586p(cardPattern.bottomContent);
        m43591u(cardPattern.topleftIcon);
        m43587q(cardPattern.lowerRightIcon);
        m43579i(cardPattern.userId, cardPattern.cardOptions, cardPattern.lowerRightIcon, d30Var, d30Var2, d30Var3);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43575e(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m43586p(CardPatternBottomContent cardPatternBottomContent) {
        xdl0.m208344M(this.f26803f, !TextUtils.isEmpty(cardPatternBottomContent.topContent.context));
        xdl0.m208344M(this.f26804g, !TextUtils.isEmpty(cardPatternBottomContent.middleContext));
        xdl0.m208344M(this.f26805h, !TextUtils.isEmpty(cardPatternBottomContent.bottomContext));
        if (xdl0.m208349O0(this.f26803f)) {
            this.f26803f.setText(cardPatternBottomContent.topContent.context);
            m43590t(this.f26803f, cardPatternBottomContent.topContent.iconId);
            m43589s(this.f26803f, cardPatternBottomContent.topContent.backgroundId);
        }
        if (xdl0.m208349O0(this.f26804g)) {
            this.f26804g.setText(cardPatternBottomContent.middleContext);
        }
        if (xdl0.m208349O0(this.f26805h)) {
            this.f26805h.setText(cardPatternBottomContent.bottomContext);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m43587q(CardPatternOptionIcon cardPatternOptionIcon) {
        this.f26802e.setVisibility(0);
        this.f26802e.setAlpha(1.0f);
        if (TextUtils.isEmpty(cardPatternOptionIcon.iconId)) {
            return;
        }
        String str = cardPatternOptionIcon.iconId;
        str.getClass();
        if (str.equals("love")) {
            this.f26802e.setIcon(getContext().getResources().getDrawable(x2c0.f190467po));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m43588r(String str) {
        if (LikeFilterSortType.realAvatar.equals(str)) {
            xdl0.m208344M(this.f26800c, true);
            this.f26801d.setBackgroundResource(x2c0.f189654Pt);
            return;
        }
        boolean zEquals = "verified".equals(str);
        LinearLayout linearLayout = this.f26800c;
        if (!zEquals) {
            xdl0.m208344M(linearLayout, false);
        } else {
            xdl0.m208344M(linearLayout, true);
            this.f26801d.setBackgroundResource(x2c0.f189805Up);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m43589s(TextView textView, String str) {
        str.getClass();
        switch (str) {
            case "orange":
                textView.setBackgroundResource(x2c0.f189897Xo);
                break;
            case "grey":
                textView.setBackgroundResource(x2c0.f189689R2);
                break;
            case "pink":
                textView.setBackgroundResource(x2c0.f189845W3);
                break;
            case "white":
                textView.setBackgroundResource(x2c0.f190097e4);
                break;
            case "white2grey":
                textView.setBackgroundResource(x2c0.f190066d4);
                break;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m43590t(TextView textView, String str) {
        str.getClass();
        switch (str) {
            case "active":
                textView.setCompoundDrawablesWithIntrinsicBounds(x2c0.f189220C2, 0, 0, 0);
                break;
            case "passby":
                textView.setCompoundDrawablesWithIntrinsicBounds(x2c0.f190129f4, 0, 0, 0);
                break;
            case "chat":
                textView.setCompoundDrawablesWithIntrinsicBounds(x2c0.f190669w2, 0, 0, 0);
                break;
            case "love":
                textView.setCompoundDrawablesWithIntrinsicBounds(x2c0.f189156A2, 0, 0, 0);
                break;
            case "star":
                textView.setCompoundDrawablesWithIntrinsicBounds(x2c0.f189618Oo, 0, 0, 0);
                break;
            case "country":
                textView.setCompoundDrawablesWithIntrinsicBounds(x2c0.f189463Jo, 0, 0, 0);
                break;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m43591u(CardPatternCombinedIcon cardPatternCombinedIcon) {
        String str = cardPatternCombinedIcon.backgroundId;
        String str2 = cardPatternCombinedIcon.iconId;
        String str3 = cardPatternCombinedIcon.context;
        boolean zIsEmpty = TextUtils.isEmpty(str3);
        VText vText = this.f26799b;
        if (zIsEmpty) {
            xdl0.m208344M(vText, false);
            return;
        }
        m43590t(vText, str2);
        m43589s(this.f26799b, str);
        this.f26799b.setText(str3);
        xdl0.m208344M(this.f26799b, true);
    }

    public SuggesterItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26806i = true;
        m43576f().duringCreated(LikersItemView.f37292y).map(new w9j() { // from class: l.sug0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f166467a.m43583m((roj0) obj);
            }
        }).delay(1500L, TimeUnit.MILLISECONDS).map(new w9j() { // from class: l.tug0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f172170a.m43584n((Boolean) obj);
            }
        }).subscribe();
    }

    public SuggesterItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26806i = true;
        m43576f().duringCreated(LikersItemView.f37292y).map(new w9j() { // from class: l.sug0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f166467a.m43583m((roj0) obj);
            }
        }).delay(1500L, TimeUnit.MILLISECONDS).map(new w9j() { // from class: l.tug0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f172170a.m43584n((Boolean) obj);
            }
        }).subscribe();
    }
}
