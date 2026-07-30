package com.p051p1.mobile.putong.core.p058ui.intl.greet.message;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.ProfileZodiac;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.SvipPrivacySettings;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;
import p153l.bnl0;
import p153l.con;
import p153l.fo0;
import p153l.fzq;
import p153l.ibc0;
import p153l.jyb;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qbn;
import p153l.qcj;
import p153l.qu20;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class IntlGreetListItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public HeaderFrameWrapper f30631a;

    /* JADX INFO: renamed from: b */
    public View f30632b;

    /* JADX INFO: renamed from: c */
    public VText f30633c;

    /* JADX INFO: renamed from: d */
    public VText f30634d;

    /* JADX INFO: renamed from: e */
    public VFrame f30635e;

    /* JADX INFO: renamed from: f */
    public VText f30636f;

    /* JADX INFO: renamed from: g */
    public VText f30637g;

    /* JADX INFO: renamed from: h */
    public VText f30638h;

    /* JADX INFO: renamed from: i */
    public VText f30639i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f30640j;

    public IntlGreetListItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m47351d(View view) {
        con.m111674a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final String m47352e(IntlDynamicGreetListAct intlDynamicGreetListAct, User user) {
        String string = "";
        StringBuilder sb = new StringBuilder("");
        Profile profile = user.profile;
        if (profile.studies.active) {
            string = intlDynamicGreetListAct.getString(R$string.f21528J5);
        } else if (!TextUtils.isEmpty(profile.work.industry)) {
            string = user.profile.work.industry;
        }
        if (!TextUtils.isEmpty(string)) {
            sb.append(user.profile.work.industry);
        }
        if (!TextUtils.isEmpty(user.profile.studies.school)) {
            if (!TextUtils.isEmpty(sb)) {
                sb.append("·");
            }
            sb.append(user.profile.studies.school);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public final CharSequence m47353f(IntlDynamicGreetListAct intlDynamicGreetListAct, User user) {
        StringBuilder sb = new StringBuilder("");
        if (user == null) {
            return sb.toString();
        }
        if (!user.isHideAgeFromSVipWithOutMe()) {
            sb.append(user.age);
            sb.append(intlDynamicGreetListAct.getString(R$string.f21584Q5));
        }
        if (!user.isHideLocationFromSVip()) {
            String strM175812q = q8g0.m175812q(user.location, true);
            if (TextUtils.isEmpty(sb.toString())) {
                sb.append(strM175812q);
            } else {
                sb.append("(");
                sb.append(strM175812q);
                sb.append(")");
            }
        }
        if (TextUtils.isEmpty(user.description)) {
            String strM175804j0 = TEnum.equals(user.profile.zodiac, ProfileZodiac.get("unknown_")) ? "" : q8g0.m175804j0(user.profile.zodiac);
            if (!TextUtils.isEmpty(strM175804j0)) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(" · ");
                }
                sb.append(strM175804j0);
            }
            ArrayList arrayListM147522n = jyb.m147522n(user.profile.tags, new qcj() { // from class: l.aon
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("personality", ((Tag) obj).category));
                }
            });
            if (!jyb.m147479J(arrayListM147522n)) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(" · ");
                }
                sb.append(((Tag) arrayListM147522n.get(0)).value);
                return sb.toString();
            }
            String strM47352e = m47352e(intlDynamicGreetListAct, user);
            if (!TextUtils.isEmpty(strM47352e)) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(" · ");
                }
                sb.append(strM47352e);
                return sb.toString();
            }
            ArrayList arrayListM147522n2 = jyb.m147522n(user.profile.tags, new qcj() { // from class: l.bon
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!TextUtils.equals("personality", ((Tag) obj).category));
                }
            });
            if (!jyb.m147479J(arrayListM147522n2)) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(" · ");
                }
                sb.append(((Tag) arrayListM147522n2.get(0)).value);
                return sb.toString();
            }
        } else {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append(" · ");
            }
            sb.append(user.description);
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m47354g(qbn qbnVar, fzq fzqVar, IntlDynamicGreetListAct intlDynamicGreetListAct, int i, pf60 pf60Var) {
        double d;
        SvipPrivacySettings svipPrivacySettings;
        if (NullChecker.m82486a(pf60Var.f152157b) && ((Conversation) pf60Var.f152157b).f21116mm > 0) {
            qbnVar.mo104450F(fzqVar.m128224p());
            return;
        }
        User user = (User) pf60Var.f152156a;
        if (!TextUtils.isEmpty(fzqVar.m128220j())) {
            uqb0.f180374G.m127115L0(this.f30640j, fzqVar.m128220j());
            this.f30631a.m80885n0(user);
        }
        if (!NullChecker.m82486a(user.settings) || jyb.m147479J(user.settings.settingGroups)) {
            d = 0.0d;
        } else {
            SettingGroups settingGroup = user.settings.getSettingGroup();
            if (!NullChecker.m82486a(settingGroup) || (svipPrivacySettings = settingGroup.svipPrivacy) == null) {
                d = 0.0d;
            } else {
                long j = svipPrivacySettings.frozenTime;
                if (j != 0) {
                    d = j;
                } else {
                    d = 0.0d;
                }
            }
        }
        if (d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            d = ((User) pf60Var.f152156a).location.updatedTime;
        }
        String strM174442G = pzi0.m174442G(d);
        if (TextUtils.equals(intlDynamicGreetListAct.getString(R$string.f21841u6), strM174442G) || pzi0.m174454o() - d < 300000.0d) {
            bnl0.m105524M(this.f30632b, true);
        } else {
            strM174442G = String.format(intlDynamicGreetListAct.getString(R$string.f21512H5), strM174442G);
            bnl0.m105524M(this.f30632b, false);
        }
        VText vText = this.f30634d;
        if (i != 20) {
            vText.setText(pzi0.m174442G(fzqVar.m128222n()));
            return;
        }
        vText.setText(strM174442G);
        CharSequence charSequenceM47353f = m47353f(intlDynamicGreetListAct, user);
        if (TextUtils.isEmpty(charSequenceM47353f)) {
            charSequenceM47353f = "";
        }
        this.f30637g.setText(charSequenceM47353f);
    }

    /* JADX INFO: renamed from: h */
    public void m47355h(final IntlDynamicGreetListAct intlDynamicGreetListAct, final qbn qbnVar, final fzq fzqVar, final int i, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        String str;
        if (i == 20) {
            bnl0.m105524M(this.f30637g, true);
            bnl0.m105524M(this.f30638h, true);
            bnl0.m105524M(this.f30639i, false);
            String strM128219i = fzqVar.m128219i();
            this.f30638h.setText(strM128219i);
            bnl0.m105524M(this.f30638h, !TextUtils.isEmpty(strM128219i));
        } else if (i == 30) {
            bnl0.m105524M(this.f30637g, false);
            bnl0.m105524M(this.f30638h, false);
            bnl0.m105524M(this.f30639i, true);
            this.f30639i.setText(fzqVar.m128219i());
        }
        this.f30636f.setText(fzqVar.m128225q());
        this.f30636f.getPaint().setFakeBoldText(true);
        int iM128223o = fzqVar.m128223o();
        VText vText = this.f30633c;
        if (iM128223o > 0) {
            vText.setVisibility(0);
            VText vText2 = this.f30633c;
            if (iM128223o > 99) {
                str = "99+";
            } else {
                str = iM128223o + "";
            }
            vText2.setText(str);
        } else {
            vText.setVisibility(8);
        }
        if (fzqVar.m128226r()) {
            Drawable drawable = intlDynamicGreetListAct.getResources().getDrawable(CoreModule.m30933P().m143412i().mo180488j2());
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f30636f.setCompoundDrawables(null, null, drawable, null);
        } else if (fzqVar.m128228t()) {
            Drawable drawable2 = intlDynamicGreetListAct.getResources().getDrawable(ibc0.f113838K5);
            drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
            this.f30636f.setCompoundDrawables(null, null, drawable2, null);
        } else {
            this.f30636f.setCompoundDrawables(null, null, null, null);
        }
        bnl0.m105509E0(this, onClickListener);
        setOnLongClickListener(onLongClickListener);
        qbnVar.mo68557c(intlDynamicGreetListAct, psd0.m173625r(CoreModule.f18264c.f20381e0.m116483Ka(fzqVar.m128224p()), CoreModule.f18264c.f20384f0.m33823Ue(fzqVar.m128224p()), new qu20())).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.znn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205209a.m47354g(qbnVar, fzqVar, intlDynamicGreetListAct, i, (pf60) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47351d(this);
        this.f30640j = this.f30631a.get_pic();
    }

    public IntlGreetListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlGreetListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
