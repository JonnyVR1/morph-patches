package com.p046p1.mobile.putong.core.newui.greet;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.ProfileZodiac;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.SvipPrivacySettings;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.c3c0;
import p149l.e30;
import p149l.eqh0;
import p149l.fxq;
import p149l.gm20;
import p149l.i0g0;
import p149l.j760;
import p149l.jjb0;
import p149l.jo0;
import p149l.mkd0;
import p149l.mm20;
import p149l.mqi0;
import p149l.qib0;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.xge;

/* JADX INFO: loaded from: classes11.dex */
public class NewDynamicGreetListItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public HeaderFrameWrapper f21509a;

    /* JADX INFO: renamed from: b */
    public View f21510b;

    /* JADX INFO: renamed from: c */
    public VText f21511c;

    /* JADX INFO: renamed from: d */
    public VText f21512d;

    /* JADX INFO: renamed from: e */
    public VText f21513e;

    /* JADX INFO: renamed from: f */
    public VFrame f21514f;

    /* JADX INFO: renamed from: g */
    public VText f21515g;

    /* JADX INFO: renamed from: h */
    public VImage f21516h;

    /* JADX INFO: renamed from: i */
    public ODiamondTagLabel f21517i;

    /* JADX INFO: renamed from: j */
    public VText f21518j;

    /* JADX INFO: renamed from: k */
    public VLinear f21519k;

    /* JADX INFO: renamed from: l */
    public VText f21520l;

    /* JADX INFO: renamed from: m */
    public VText f21521m;

    /* JADX INFO: renamed from: n */
    public VText f21522n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f21523o;

    public NewDynamicGreetListItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public final void m36490f(View view) {
        mm20.m155296a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final String m36491g(User user) {
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
    public final CharSequence m36492h(DynamicGreetListAct dynamicGreetListAct, User user) {
        StringBuilder sb = new StringBuilder("");
        if (user == null) {
            return sb.toString();
        }
        if (dynamicGreetListAct.m36457Z1()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayListM200339n = vwb.m200339n(user.profile.tags, new w9j() { // from class: l.im20
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("personality", ((Tag) obj).category));
                }
            });
            if (!vwb.m200296J(arrayListM200339n)) {
                arrayList.addAll(arrayListM200339n);
            }
            if (arrayList.size() < 3) {
                arrayList.addAll(vwb.m200339n(user.profile.tags, new w9j() { // from class: l.jm20
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!TextUtils.equals("personality", ((Tag) obj).category));
                    }
                }));
            }
            if (vwb.m200296J(arrayList)) {
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
            String str = user.location.distance < 1000 ? i0g0.f110325b.format(user.location.distance) + CoreModule.f17544b.getString(R$string.f20873U4) : i0g0.f110325b.format(user.location.distance / 1000.0f) + CoreModule.f17544b.getString(R$string.f20993i4);
            if (TextUtils.isEmpty(sb.toString())) {
                sb.append(str);
            } else {
                sb.append("(");
                sb.append(str);
                sb.append(")");
            }
        }
        if (TextUtils.isEmpty(user.description)) {
            String strM133869j0 = TEnum.equals(user.profile.zodiac, ProfileZodiac.get("unknown_")) ? "" : i0g0.m133869j0(user.profile.zodiac);
            if (!TextUtils.isEmpty(strM133869j0)) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(" · ");
                }
                sb.append(strM133869j0);
            }
            ArrayList arrayListM200339n2 = vwb.m200339n(user.profile.tags, new w9j() { // from class: l.km20
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("personality", ((Tag) obj).category));
                }
            });
            if (!vwb.m200296J(arrayListM200339n2)) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(" · ");
                }
                sb.append(((Tag) arrayListM200339n2.get(0)).value);
                return sb.toString();
            }
            String strM36491g = m36491g(user);
            if (!TextUtils.isEmpty(strM36491g)) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(" · ");
                }
                sb.append(strM36491g);
                return sb.toString();
            }
            ArrayList arrayListM200339n3 = vwb.m200339n(user.profile.tags, new w9j() { // from class: l.lm20
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!TextUtils.equals("personality", ((Tag) obj).category));
                }
            });
            if (!vwb.m200296J(arrayListM200339n3)) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(" · ");
                }
                sb.append(((Tag) arrayListM200339n3.get(0)).value);
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
    public final /* synthetic */ void m36493i(xge xgeVar, fxq fxqVar, DynamicGreetListAct dynamicGreetListAct, int i, j760 j760Var) {
        double d;
        String str;
        SvipPrivacySettings svipPrivacySettings;
        if (NullChecker.m81303a(j760Var.f116565b) && ((Conversation) j760Var.f116565b).f20374mm > 0) {
            xgeVar.mo173643F(fxqVar.m123668p());
            return;
        }
        User user = (User) j760Var.f116564a;
        if (dynamicGreetListAct.m36457Z1()) {
            qib0.f154691G.m102331L0(this.f21523o, user.getAnonymousUrl());
            this.f21509a.m79695G0(false);
        } else if (!TextUtils.isEmpty(fxqVar.m123664j())) {
            qib0.f154691G.m102331L0(this.f21523o, fxqVar.m123664j());
            this.f21509a.m79702n0(user);
        }
        if (!NullChecker.m81303a(user.settings) || vwb.m200296J(user.settings.settingGroups)) {
            d = 0.0d;
        } else {
            SettingGroups settingGroup = user.settings.getSettingGroup();
            if (!NullChecker.m81303a(settingGroup) || (svipPrivacySettings = settingGroup.svipPrivacy) == null) {
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
            d = ((User) j760Var.f116564a).location.updatedTime;
        }
        String strM155932G = mqi0.m155932G(d);
        if (TextUtils.equals(dynamicGreetListAct.getString(R$string.f21099u6), strM155932G) || mqi0.m155944o() - d < 300000.0d) {
            xdl0.m208344M(this.f21510b, true);
            str = "当前在线";
        } else {
            str = String.format("%s活跃", strM155932G);
            xdl0.m208344M(this.f21510b, false);
        }
        if (i != 20) {
            this.f21512d.setText(mqi0.m155932G(fxqVar.m123666n()));
            return;
        }
        boolean zM36457Z1 = dynamicGreetListAct.m36457Z1();
        VText vText = this.f21512d;
        if (zM36457Z1) {
            vText.setText("来自聊天室 · ".concat(str));
        } else {
            vText.setText(str);
        }
        CharSequence charSequenceM36492h = m36492h(dynamicGreetListAct, user);
        if (TextUtils.isEmpty(charSequenceM36492h)) {
            StringBuilder sb = new StringBuilder("和");
            sb.append(user.isFemale() ? "她" : "他");
            sb.append("聊聊吧");
            charSequenceM36492h = sb.toString();
        }
        this.f21518j.setText(charSequenceM36492h);
    }

    /* JADX INFO: renamed from: j */
    public void m36494j(final DynamicGreetListAct dynamicGreetListAct, final xge xgeVar, final fxq fxqVar, final int i, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, View.OnClickListener onClickListener2) {
        String str;
        if (i == 20) {
            xdl0.m208344M(this.f21518j, true);
            xdl0.m208344M(this.f21522n, false);
            String strM123663i = fxqVar.m123663i();
            this.f21520l.setText(strM123663i);
            xdl0.m208344M(this.f21519k, !TextUtils.isEmpty(strM123663i));
            xdl0.m208344M(this.f21521m, CoreModule.f17554l.m94658i().mo158232G0());
            this.f21521m.setTypeface(eqh0.m117752c(3), 1);
            xdl0.m208329E0(this.f21521m, onClickListener2);
        } else if (i == 30) {
            xdl0.m208344M(this.f21518j, false);
            xdl0.m208344M(this.f21519k, false);
            xdl0.m208344M(this.f21522n, true);
            this.f21522n.setText(fxqVar.m123663i());
        }
        this.f21515g.setText(fxqVar.m123669q());
        this.f21515g.getPaint().setFakeBoldText(true);
        int iM123667o = fxqVar.m123667o();
        VText vText = this.f21511c;
        if (iM123667o > 0) {
            vText.setVisibility(0);
            VText vText2 = this.f21511c;
            if (iM123667o > 99) {
                str = "99+";
            } else {
                str = iM123667o + "";
            }
            vText2.setText(str);
        } else {
            vText.setVisibility(8);
        }
        if (jjb0.m141784b()) {
            this.f21515g.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            qib0.f154713b0.f139231b.showUserVerificationLogo(getContext(), CoreModule.f17545c.f19639e0.m169430Pa(fxqVar.m123668p()), this.f21516h);
        } else if (fxqVar.m123670r()) {
            Drawable drawable = dynamicGreetListAct.getResources().getDrawable(CoreModule.m29935P().m94658i().mo158396j2());
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f21515g.setCompoundDrawables(null, null, drawable, null);
        } else if (fxqVar.m123672t()) {
            Drawable drawable2 = dynamicGreetListAct.getResources().getDrawable(c3c0.f78563K5);
            drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
            this.f21515g.setCompoundDrawables(null, null, drawable2, null);
        } else {
            this.f21515g.setCompoundDrawables(null, null, null, null);
        }
        if (CoreModule.m29935P().m94656g().mo35056e() && fxqVar.m123674v()) {
            xdl0.m208344M(this.f21517i, true);
            this.f21517i.m79166n0();
        } else if (fxqVar.m123671s()) {
            xdl0.m208344M(this.f21517i, true);
            this.f21517i.m79168p0();
        } else if (CoreModule.m29935P().m94656g().mo35048b8() && fxqVar.m123673u()) {
            xdl0.m208344M(this.f21517i, true);
            this.f21517i.m79165m0();
        } else {
            xdl0.m208344M(this.f21517i, false);
        }
        xdl0.m208344M(this.f21513e, NullChecker.m81303a(fxqVar.m123659b()) && TEnum.equals(fxqVar.m123659b().channel, Channel.get(Channel.city_c)) && i == 20);
        if (CoreModule.m29935P().m94656g().mo35056e()) {
            this.f21513e.setText("来自城市置顶");
        }
        xdl0.m208329E0(this, onClickListener);
        setOnLongClickListener(onLongClickListener);
        xgeVar.mo67374c(dynamicGreetListAct, mkd0.m154984r(CoreModule.f17545c.f19639e0.m169410Ka(fxqVar.m123668p()), CoreModule.f17545c.f19642f0.m32820Ue(fxqVar.m123668p()), new gm20())).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.hm20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108388a.m36493i(xgeVar, fxqVar, dynamicGreetListAct, i, (j760) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m36490f(this);
        this.f21523o = this.f21509a.get_pic();
    }

    public NewDynamicGreetListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewDynamicGreetListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
