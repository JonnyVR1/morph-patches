package com.p000p1.mobile.putong.core.p001ui.intl.greet.message;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.data.Conversation;
import com.p000p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p000p1.mobile.putong.core.message.R$string;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.ProfileZodiac;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.SvipPrivacySettings;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.e30;
import l.fxq;
import l.gm20;
import l.i0g0;
import l.j760;
import l.jo0;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.vwb;
import l.w9j;
import l.xdl0;
import p003l.c3c0;
import p003l.cmn;
import p003l.q9n;
import v.VDraweeView;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class IntlGreetListItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public HeaderFrameWrapper f2177a;

    /* JADX INFO: renamed from: b */
    public View f2178b;

    /* JADX INFO: renamed from: c */
    public VText f2179c;

    /* JADX INFO: renamed from: d */
    public VText f2180d;

    /* JADX INFO: renamed from: e */
    public VFrame f2181e;

    /* JADX INFO: renamed from: f */
    public VText f2182f;

    /* JADX INFO: renamed from: g */
    public VText f2183g;

    /* JADX INFO: renamed from: h */
    public VText f2184h;

    /* JADX INFO: renamed from: i */
    public VText f2185i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f2186j;

    public IntlGreetListItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m3536d(View view) {
        cmn.m5969a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final String m3537e(IntlDynamicGreetListAct intlDynamicGreetListAct, User user) {
        String string = "";
        StringBuilder sb = new StringBuilder("");
        Profile profile = user.profile;
        if (profile.studies.active) {
            string = intlDynamicGreetListAct.getString(R$string.f448J5);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final CharSequence m3538f(IntlDynamicGreetListAct intlDynamicGreetListAct, User user) {
        StringBuilder sb = new StringBuilder("");
        if (user == null) {
            return sb.toString();
        }
        if (!user.isHideAgeFromSVipWithOutMe()) {
            sb.append(user.age);
            sb.append(intlDynamicGreetListAct.getString(R$string.f504Q5));
        }
        if (!user.isHideLocationFromSVip()) {
            String strQ = i0g0.q(user.location, true);
            if (TextUtils.isEmpty(sb.toString())) {
                sb.append(strQ);
            } else {
                sb.append("(");
                sb.append(strQ);
                sb.append(")");
            }
        }
        if (TextUtils.isEmpty(user.description)) {
            String strJ0 = TEnum.equals(user.profile.zodiac, ProfileZodiac.get("unknown_")) ? "" : i0g0.j0(user.profile.zodiac);
            if (!TextUtils.isEmpty(strJ0)) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(" · ");
                }
                sb.append(strJ0);
            }
            ArrayList arrayListN = vwb.n(user.profile.tags, new w9j() { // from class: l.amn
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(ProfileLikeCategoryType.personality, ((Tag) obj).category));
                }
            });
            if (!vwb.J(arrayListN)) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(" · ");
                }
                sb.append(((Tag) arrayListN.get(0)).value);
                return sb.toString();
            }
            String strM3537e = m3537e(intlDynamicGreetListAct, user);
            if (!TextUtils.isEmpty(strM3537e)) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(" · ");
                }
                sb.append(strM3537e);
                return sb.toString();
            }
            ArrayList arrayListN2 = vwb.n(user.profile.tags, new w9j() { // from class: l.bmn
                public final Object call(Object obj) {
                    return Boolean.valueOf(!TextUtils.equals(ProfileLikeCategoryType.personality, ((Tag) obj).category));
                }
            });
            if (!vwb.J(arrayListN2)) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(" · ");
                }
                sb.append(((Tag) arrayListN2.get(0)).value);
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
    public final /* synthetic */ void m3539g(q9n q9nVar, fxq fxqVar, IntlDynamicGreetListAct intlDynamicGreetListAct, int i, j760 j760Var) {
        double d;
        SvipPrivacySettings svipPrivacySettings;
        if (NullChecker.a(j760Var.b) && ((Conversation) j760Var.b).f36mm > 0) {
            q9nVar.m8941F(fxqVar.p());
            return;
        }
        User user = (User) j760Var.a;
        if (!TextUtils.isEmpty(fxqVar.j())) {
            qib0.G.L0(this.f2186j, fxqVar.j());
            this.f2177a.n0(user);
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
        String strG = mqi0.G(d);
        if (TextUtils.equals(intlDynamicGreetListAct.getString(R$string.f761u6), strG) || mqi0.o() - d < 300000.0d) {
            xdl0.M(this.f2178b, true);
        } else {
            strG = String.format(intlDynamicGreetListAct.getString(R$string.f432H5), strG);
            xdl0.M(this.f2178b, false);
        }
        VText vText = this.f2180d;
        if (i != 20) {
            vText.setText(mqi0.G(fxqVar.n()));
            return;
        }
        vText.setText(strG);
        CharSequence charSequenceM3538f = m3538f(intlDynamicGreetListAct, user);
        if (TextUtils.isEmpty(charSequenceM3538f)) {
            charSequenceM3538f = "";
        }
        this.f2183g.setText(charSequenceM3538f);
    }

    /* JADX INFO: renamed from: h */
    public void m3540h(final IntlDynamicGreetListAct intlDynamicGreetListAct, final q9n q9nVar, final fxq fxqVar, final int i, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        String str;
        if (i == 20) {
            xdl0.M(this.f2183g, true);
            xdl0.M(this.f2184h, true);
            xdl0.M(this.f2185i, false);
            String strI = fxqVar.i();
            this.f2184h.setText(strI);
            xdl0.M(this.f2184h, !TextUtils.isEmpty(strI));
        } else if (i == 30) {
            xdl0.M(this.f2183g, false);
            xdl0.M(this.f2184h, false);
            xdl0.M(this.f2185i, true);
            this.f2185i.setText(fxqVar.i());
        }
        this.f2182f.setText(fxqVar.q());
        this.f2182f.getPaint().setFakeBoldText(true);
        int iO = fxqVar.o();
        VText vText = this.f2179c;
        if (iO > 0) {
            vText.setVisibility(0);
            VText vText2 = this.f2179c;
            if (iO > 99) {
                str = "99+";
            } else {
                str = iO + "";
            }
            vText2.setText(str);
        } else {
            vText.setVisibility(8);
        }
        if (fxqVar.r()) {
            Drawable drawable = intlDynamicGreetListAct.getResources().getDrawable(CoreModule.P().i().j2());
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f2182f.setCompoundDrawables((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        } else if (fxqVar.t()) {
            Drawable drawable2 = intlDynamicGreetListAct.getResources().getDrawable(c3c0.f3600K5);
            drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
            this.f2182f.setCompoundDrawables((Drawable) null, (Drawable) null, drawable2, (Drawable) null);
        } else {
            this.f2182f.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        xdl0.E0(this, onClickListener);
        setOnLongClickListener(onLongClickListener);
        q9nVar.c(intlDynamicGreetListAct, mkd0.r(CoreModule.c.e0.Ka(fxqVar.p()), CoreModule.c.f0.Ue(fxqVar.p()), new gm20())).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.zln
            public final void call(Object obj) {
                this.f9273a.m3539g(q9nVar, fxqVar, intlDynamicGreetListAct, i, (j760) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3536d(this);
        this.f2186j = this.f2177a.get_pic();
    }

    public IntlGreetListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlGreetListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
