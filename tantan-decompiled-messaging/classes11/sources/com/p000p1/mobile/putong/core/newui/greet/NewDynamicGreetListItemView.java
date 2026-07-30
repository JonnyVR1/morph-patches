package com.p000p1.mobile.putong.core.newui.greet;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p000p1.mobile.putong.p004ui.headframe.HeaderFrameWrapper;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Channel;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.ProfileZodiac;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.SvipPrivacySettings;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.c3c0;
import l.e30;
import l.eqh0;
import l.j760;
import l.jjb0;
import l.jo0;
import l.mkd0;
import l.mm20;
import l.qib0;
import l.vwb;
import l.w9j;
import l.xdl0;
import p009l.fxq;
import p009l.gm20;
import p009l.i0g0;
import p009l.mqi0;
import p009l.xge;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NewDynamicGreetListItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public HeaderFrameWrapper f287a;

    /* JADX INFO: renamed from: b */
    public View f288b;

    /* JADX INFO: renamed from: c */
    public VText f289c;

    /* JADX INFO: renamed from: d */
    public VText f290d;

    /* JADX INFO: renamed from: e */
    public VText f291e;

    /* JADX INFO: renamed from: f */
    public VFrame f292f;

    /* JADX INFO: renamed from: g */
    public VText f293g;

    /* JADX INFO: renamed from: h */
    public VImage f294h;

    /* JADX INFO: renamed from: i */
    public ODiamondTagLabel f295i;

    /* JADX INFO: renamed from: j */
    public VText f296j;

    /* JADX INFO: renamed from: k */
    public VLinear f297k;

    /* JADX INFO: renamed from: l */
    public VText f298l;

    /* JADX INFO: renamed from: m */
    public VText f299m;

    /* JADX INFO: renamed from: n */
    public VText f300n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f301o;

    public NewDynamicGreetListItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public final void m419f(View view) {
        mm20.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final String m420g(User user) {
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
    public final CharSequence m421h(DynamicGreetListAct dynamicGreetListAct, User user) {
        StringBuilder sb = new StringBuilder("");
        if (user == null) {
            return sb.toString();
        }
        if (dynamicGreetListAct.m386Z1()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayListN = vwb.n(user.profile.tags, new w9j() { // from class: l.im20
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("personality", ((Tag) obj).category));
                }
            });
            if (!vwb.J(arrayListN)) {
                arrayList.addAll(arrayListN);
            }
            if (arrayList.size() < 3) {
                arrayList.addAll(vwb.n(user.profile.tags, new w9j() { // from class: l.jm20
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!TextUtils.equals("personality", ((Tag) obj).category));
                    }
                }));
            }
            if (vwb.J(arrayList)) {
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
            String str = user.location.distance < 1000 ? i0g0.f14350b.format(user.location.distance) + CoreModule.b.getString(R.string.U4) : i0g0.f14350b.format(user.location.distance / 1000.0f) + CoreModule.b.getString(R.string.i4);
            if (TextUtils.isEmpty(sb.toString())) {
                sb.append(str);
            } else {
                sb.append("(");
                sb.append(str);
                sb.append(")");
            }
        }
        if (TextUtils.isEmpty(user.description)) {
            String strM16137j0 = TEnum.equals(user.profile.zodiac, ProfileZodiac.get("unknown_")) ? "" : i0g0.m16137j0(user.profile.zodiac);
            if (!TextUtils.isEmpty(strM16137j0)) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(" · ");
                }
                sb.append(strM16137j0);
            }
            ArrayList arrayListN2 = vwb.n(user.profile.tags, new w9j() { // from class: l.km20
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("personality", ((Tag) obj).category));
                }
            });
            if (!vwb.J(arrayListN2)) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(" · ");
                }
                sb.append(((Tag) arrayListN2.get(0)).value);
                return sb.toString();
            }
            String strM420g = m420g(user);
            if (!TextUtils.isEmpty(strM420g)) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(" · ");
                }
                sb.append(strM420g);
                return sb.toString();
            }
            ArrayList arrayListN3 = vwb.n(user.profile.tags, new w9j() { // from class: l.lm20
                public final Object call(Object obj) {
                    return Boolean.valueOf(!TextUtils.equals("personality", ((Tag) obj).category));
                }
            });
            if (!vwb.J(arrayListN3)) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(" · ");
                }
                sb.append(((Tag) arrayListN3.get(0)).value);
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
    public final /* synthetic */ void m422i(xge xgeVar, fxq fxqVar, DynamicGreetListAct dynamicGreetListAct, int i, j760 j760Var) {
        double d;
        String str;
        SvipPrivacySettings svipPrivacySettings;
        if (NullChecker.a(j760Var.b) && ((Conversation) j760Var.b).mm > 0) {
            xgeVar.mo23341F(fxqVar.m14621p());
            return;
        }
        User user = (User) j760Var.a;
        if (dynamicGreetListAct.m386Z1()) {
            qib0.G.L0(this.f301o, user.getAnonymousUrl());
            this.f287a.m10016G0(false);
        } else if (!TextUtils.isEmpty(fxqVar.m14617j())) {
            qib0.G.L0(this.f301o, fxqVar.m14617j());
            this.f287a.m10023n0(user);
        }
        if (!NullChecker.a(user.settings) || vwb.J(user.settings.settingGroups)) {
            d = 0.0d;
        } else {
            SettingGroups settingGroup = user.settings.getSettingGroup();
            if (!NullChecker.a(settingGroup) || (svipPrivacySettings = settingGroup.svipPrivacy) == null) {
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
        if (d == 0.0d) {
            d = ((User) j760Var.a).location.updatedTime;
        }
        String strM18538G = mqi0.m18538G(d);
        if (TextUtils.equals(dynamicGreetListAct.getString(R.string.u6), strM18538G) || mqi0.m18550o() - d < 300000.0d) {
            xdl0.M(this.f288b, true);
            str = "当前在线";
        } else {
            str = String.format("%s活跃", strM18538G);
            xdl0.M(this.f288b, false);
        }
        if (i != 20) {
            this.f290d.setText(mqi0.m18538G(fxqVar.m14619n()));
            return;
        }
        boolean zM386Z1 = dynamicGreetListAct.m386Z1();
        VText vText = this.f290d;
        if (zM386Z1) {
            vText.setText("来自聊天室 · ".concat(str));
        } else {
            vText.setText(str);
        }
        CharSequence charSequenceM421h = m421h(dynamicGreetListAct, user);
        if (TextUtils.isEmpty(charSequenceM421h)) {
            StringBuilder sb = new StringBuilder("和");
            sb.append(user.isFemale() ? "她" : "他");
            sb.append("聊聊吧");
            charSequenceM421h = sb.toString();
        }
        this.f296j.setText(charSequenceM421h);
    }

    /* JADX INFO: renamed from: j */
    public void m423j(final DynamicGreetListAct dynamicGreetListAct, final xge xgeVar, final fxq fxqVar, final int i, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, View.OnClickListener onClickListener2) {
        String str;
        if (i == 20) {
            xdl0.M(this.f296j, true);
            xdl0.M(this.f300n, false);
            String strM14616i = fxqVar.m14616i();
            this.f298l.setText(strM14616i);
            xdl0.M(this.f297k, !TextUtils.isEmpty(strM14616i));
            xdl0.M(this.f299m, CoreModule.l.i().G0());
            this.f299m.setTypeface(eqh0.c(3), 1);
            xdl0.E0(this.f299m, onClickListener2);
        } else if (i == 30) {
            xdl0.M(this.f296j, false);
            xdl0.M(this.f297k, false);
            xdl0.M(this.f300n, true);
            this.f300n.setText(fxqVar.m14616i());
        }
        this.f293g.setText(fxqVar.m14622q());
        this.f293g.getPaint().setFakeBoldText(true);
        int iM14620o = fxqVar.m14620o();
        VText vText = this.f289c;
        if (iM14620o > 0) {
            vText.setVisibility(0);
            VText vText2 = this.f289c;
            if (iM14620o > 99) {
                str = "99+";
            } else {
                str = iM14620o + "";
            }
            vText2.setText(str);
        } else {
            vText.setVisibility(8);
        }
        if (jjb0.b()) {
            this.f293g.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            qib0.b0.b.showUserVerificationLogo(getContext(), CoreModule.c.e0.Pa(fxqVar.m14621p()), this.f294h);
        } else if (fxqVar.m14623r()) {
            Drawable drawable = dynamicGreetListAct.getResources().getDrawable(CoreModule.P().i().j2());
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f293g.setCompoundDrawables((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        } else if (fxqVar.m14625t()) {
            Drawable drawable2 = dynamicGreetListAct.getResources().getDrawable(c3c0.K5);
            drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
            this.f293g.setCompoundDrawables((Drawable) null, (Drawable) null, drawable2, (Drawable) null);
        } else {
            this.f293g.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (CoreModule.P().g().e() && fxqVar.m14627v()) {
            xdl0.M(this.f295i, true);
            this.f295i.m9485n0();
        } else if (fxqVar.m14624s()) {
            xdl0.M(this.f295i, true);
            this.f295i.m9487p0();
        } else if (CoreModule.P().g().b8() && fxqVar.m14626u()) {
            xdl0.M(this.f295i, true);
            this.f295i.m9484m0();
        } else {
            xdl0.M(this.f295i, false);
        }
        xdl0.M(this.f291e, NullChecker.a(fxqVar.m14612b()) && TEnum.equals(fxqVar.m14612b().channel, Channel.get("city_c")) && i == 20);
        if (CoreModule.P().g().e()) {
            this.f291e.setText("来自城市置顶");
        }
        xdl0.E0(this, onClickListener);
        setOnLongClickListener(onLongClickListener);
        xgeVar.c(dynamicGreetListAct, mkd0.r(CoreModule.c.e0.Ka(fxqVar.m14621p()), CoreModule.c.f0.Ue(fxqVar.m14621p()), new gm20())).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.hm20
            public final void call(Object obj) {
                this.f14170a.m422i(xgeVar, fxqVar, dynamicGreetListAct, i, (j760) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m419f(this);
        this.f301o = this.f287a.get_pic();
    }

    public NewDynamicGreetListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewDynamicGreetListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
