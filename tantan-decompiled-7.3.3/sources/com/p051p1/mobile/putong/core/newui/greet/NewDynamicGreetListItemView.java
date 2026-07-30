package com.p051p1.mobile.putong.core.newui.greet;

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
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.ProfileZodiac;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.SvipPrivacySettings;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bie;
import p153l.bnl0;
import p153l.fo0;
import p153l.fzq;
import p153l.ibc0;
import p153l.jyb;
import p153l.lyh0;
import p153l.nrb0;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qcj;
import p153l.qu20;
import p153l.uqb0;
import p153l.wu20;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class NewDynamicGreetListItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public HeaderFrameWrapper f22251a;

    /* JADX INFO: renamed from: b */
    public View f22252b;

    /* JADX INFO: renamed from: c */
    public VText f22253c;

    /* JADX INFO: renamed from: d */
    public VText f22254d;

    /* JADX INFO: renamed from: e */
    public VText f22255e;

    /* JADX INFO: renamed from: f */
    public VFrame f22256f;

    /* JADX INFO: renamed from: g */
    public VText f22257g;

    /* JADX INFO: renamed from: h */
    public VImage f22258h;

    /* JADX INFO: renamed from: i */
    public ODiamondTagLabel f22259i;

    /* JADX INFO: renamed from: j */
    public VText f22260j;

    /* JADX INFO: renamed from: k */
    public VLinear f22261k;

    /* JADX INFO: renamed from: l */
    public VText f22262l;

    /* JADX INFO: renamed from: m */
    public VText f22263m;

    /* JADX INFO: renamed from: n */
    public VText f22264n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f22265o;

    public NewDynamicGreetListItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public final void m37493f(View view) {
        wu20.m207917a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final String m37494g(User user) {
        String str = "";
        StringBuilder sb = new StringBuilder("");
        Profile profile = user.profile;
        if (profile.studies.active) {
            str = "学生";
        } else if (!TextUtils.isEmpty(profile.work.industry) && !TextUtils.equals(user.profile.work.industry, "其他") && !TextUtils.equals(user.profile.work.industry, "其它") && !TextUtils.equals(user.profile.work.industry, "学生")) {
            str = user.profile.work.industry;
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(user.profile.work.industry);
        }
        if (!TextUtils.isEmpty(user.profile.studies.school) && !TextUtils.equals(user.profile.studies.school, "其他") && !TextUtils.equals(user.profile.studies.school, "其它")) {
            if (!TextUtils.isEmpty(sb)) {
                sb.append("·");
            }
            sb.append(user.profile.studies.school);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public final CharSequence m37495h(DynamicGreetListAct dynamicGreetListAct, User user) {
        StringBuilder sb = new StringBuilder("");
        if (user == null) {
            return sb.toString();
        }
        if (dynamicGreetListAct.m37460a2()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayListM147522n = jyb.m147522n(user.profile.tags, new qcj() { // from class: l.su20
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("personality", ((Tag) obj).category));
                }
            });
            if (!jyb.m147479J(arrayListM147522n)) {
                arrayList.addAll(arrayListM147522n);
            }
            if (arrayList.size() < 3) {
                arrayList.addAll(jyb.m147522n(user.profile.tags, new qcj() { // from class: l.tu20
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!TextUtils.equals("personality", ((Tag) obj).category));
                    }
                }));
            }
            if (jyb.m147479J(arrayList)) {
                return sb.toString();
            }
            for (int i = 0; i < Math.min(arrayList.size(), 3); i++) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(" · ");
                }
                sb.append(((Tag) arrayList.get(i)).value);
            }
            return sb.toString();
        }
        if (!user.isHideAgeFromSVipWithOutMe()) {
            sb.append(user.age);
            sb.append("岁");
        }
        if (!user.isHideLocationFromSVip()) {
            String str = user.location.distance < 1000 ? q8g0.f156109b.format(user.location.distance) + CoreModule.f18263b.getString(R$string.f21615U4) : q8g0.f156109b.format(user.location.distance / 1000.0f) + CoreModule.f18263b.getString(R$string.f21735i4);
            if (TextUtils.isEmpty(sb.toString())) {
                sb.append(str);
            } else {
                sb.append("(");
                sb.append(str);
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
            ArrayList arrayListM147522n2 = jyb.m147522n(user.profile.tags, new qcj() { // from class: l.uu20
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("personality", ((Tag) obj).category));
                }
            });
            if (!jyb.m147479J(arrayListM147522n2)) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(" · ");
                }
                sb.append(((Tag) arrayListM147522n2.get(0)).value);
                return sb.toString();
            }
            String strM37494g = m37494g(user);
            if (!TextUtils.isEmpty(strM37494g)) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(" · ");
                }
                sb.append(strM37494g);
                return sb.toString();
            }
            ArrayList arrayListM147522n3 = jyb.m147522n(user.profile.tags, new qcj() { // from class: l.vu20
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!TextUtils.equals("personality", ((Tag) obj).category));
                }
            });
            if (!jyb.m147479J(arrayListM147522n3)) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(" · ");
                }
                sb.append(((Tag) arrayListM147522n3.get(0)).value);
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

    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m37496i(bie bieVar, fzq fzqVar, DynamicGreetListAct dynamicGreetListAct, int i, pf60 pf60Var) {
        double d;
        String str;
        SvipPrivacySettings svipPrivacySettings;
        if (NullChecker.m82486a(pf60Var.f152157b) && ((Conversation) pf60Var.f152157b).f21116mm > 0) {
            bieVar.mo104450F(fzqVar.m128224p());
            return;
        }
        User user = (User) pf60Var.f152156a;
        if (dynamicGreetListAct.m37460a2()) {
            uqb0.f180374G.m127115L0(this.f22265o, user.getAnonymousUrl());
            this.f22251a.m80878G0(false);
        } else if (!TextUtils.isEmpty(fzqVar.m128220j())) {
            uqb0.f180374G.m127115L0(this.f22265o, fzqVar.m128220j());
            this.f22251a.m80885n0(user);
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
        if (TextUtils.equals(dynamicGreetListAct.getString(R$string.f21841u6), strM174442G) || pzi0.m174454o() - d < 300000.0d) {
            bnl0.m105524M(this.f22252b, true);
            str = "当前在线";
        } else {
            str = String.format("%s活跃", strM174442G);
            bnl0.m105524M(this.f22252b, false);
        }
        if (i != 20) {
            this.f22254d.setText(pzi0.m174442G(fzqVar.m128222n()));
            return;
        }
        boolean zM37460a2 = dynamicGreetListAct.m37460a2();
        VText vText = this.f22254d;
        if (zM37460a2) {
            vText.setText("来自聊天室 · ".concat(str));
        } else {
            vText.setText(str);
        }
        CharSequence charSequenceM37495h = m37495h(dynamicGreetListAct, user);
        if (TextUtils.isEmpty(charSequenceM37495h)) {
            StringBuilder sb = new StringBuilder("和");
            sb.append(user.isFemale() ? "她" : "他");
            sb.append("聊聊吧");
            charSequenceM37495h = sb.toString();
        }
        this.f22260j.setText(charSequenceM37495h);
    }

    /* JADX INFO: renamed from: j */
    public void m37497j(final DynamicGreetListAct dynamicGreetListAct, final bie bieVar, final fzq fzqVar, final int i, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, View.OnClickListener onClickListener2) {
        String str;
        if (i == 20) {
            bnl0.m105524M(this.f22260j, true);
            bnl0.m105524M(this.f22264n, false);
            String strM128219i = fzqVar.m128219i();
            this.f22262l.setText(strM128219i);
            bnl0.m105524M(this.f22261k, !TextUtils.isEmpty(strM128219i));
            bnl0.m105524M(this.f22263m, CoreModule.f18273l.m143412i().mo180324G0());
            this.f22263m.setTypeface(lyh0.m156283c(3), 1);
            bnl0.m105509E0(this.f22263m, onClickListener2);
        } else if (i == 30) {
            bnl0.m105524M(this.f22260j, false);
            bnl0.m105524M(this.f22261k, false);
            bnl0.m105524M(this.f22264n, true);
            this.f22264n.setText(fzqVar.m128219i());
        }
        this.f22257g.setText(fzqVar.m128225q());
        this.f22257g.getPaint().setFakeBoldText(true);
        int iM128223o = fzqVar.m128223o();
        VText vText = this.f22253c;
        if (iM128223o > 0) {
            vText.setVisibility(0);
            VText vText2 = this.f22253c;
            if (iM128223o > 99) {
                str = "99+";
            } else {
                str = iM128223o + "";
            }
            vText2.setText(str);
        } else {
            vText.setVisibility(8);
        }
        if (nrb0.m164466b()) {
            this.f22257g.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            uqb0.f180396b0.f170325b.showUserVerificationLogo(getContext(), CoreModule.f18264c.f20381e0.m116503Pa(fzqVar.m128224p()), this.f22258h);
        } else if (fzqVar.m128226r()) {
            Drawable drawable = dynamicGreetListAct.getResources().getDrawable(CoreModule.m30933P().m143412i().mo180488j2());
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f22257g.setCompoundDrawables(null, null, drawable, null);
        } else if (fzqVar.m128228t()) {
            Drawable drawable2 = dynamicGreetListAct.getResources().getDrawable(ibc0.f113838K5);
            drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
            this.f22257g.setCompoundDrawables(null, null, drawable2, null);
        } else {
            this.f22257g.setCompoundDrawables(null, null, null, null);
        }
        if (CoreModule.m30933P().m143410g().mo36059e() && fzqVar.m128230v()) {
            bnl0.m105524M(this.f22259i, true);
            this.f22259i.m80349n0();
        } else if (fzqVar.m128227s()) {
            bnl0.m105524M(this.f22259i, true);
            this.f22259i.m80351p0();
        } else if (CoreModule.m30933P().m143410g().mo36051b8() && fzqVar.m128229u()) {
            bnl0.m105524M(this.f22259i, true);
            this.f22259i.m80348m0();
        } else {
            bnl0.m105524M(this.f22259i, false);
        }
        bnl0.m105524M(this.f22255e, NullChecker.m82486a(fzqVar.m128215b()) && TEnum.equals(fzqVar.m128215b().channel, Channel.get(Channel.city_c)) && i == 20);
        if (CoreModule.m30933P().m143410g().mo36059e()) {
            this.f22255e.setText("来自城市置顶");
        }
        bnl0.m105509E0(this, onClickListener);
        setOnLongClickListener(onLongClickListener);
        bieVar.mo68557c(dynamicGreetListAct, psd0.m173625r(CoreModule.f18264c.f20381e0.m116483Ka(fzqVar.m128224p()), CoreModule.f18264c.f20384f0.m33823Ue(fzqVar.m128224p()), new qu20())).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.ru20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164892a.m37496i(bieVar, fzqVar, dynamicGreetListAct, i, (pf60) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37493f(this);
        this.f22265o = this.f22251a.get_pic();
    }

    public NewDynamicGreetListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewDynamicGreetListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
