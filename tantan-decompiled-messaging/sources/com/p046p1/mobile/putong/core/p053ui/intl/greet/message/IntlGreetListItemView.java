package com.p046p1.mobile.putong.core.p053ui.intl.greet.message;

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
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.ProfileZodiac;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.SvipPrivacySettings;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;
import p149l.c3c0;
import p149l.cmn;
import p149l.e30;
import p149l.fxq;
import p149l.gm20;
import p149l.i0g0;
import p149l.j760;
import p149l.jo0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.q9n;
import p149l.qib0;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes10.dex */
public class IntlGreetListItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public HeaderFrameWrapper f29783a;

    /* JADX INFO: renamed from: b */
    public View f29784b;

    /* JADX INFO: renamed from: c */
    public VText f29785c;

    /* JADX INFO: renamed from: d */
    public VText f29786d;

    /* JADX INFO: renamed from: e */
    public VFrame f29787e;

    /* JADX INFO: renamed from: f */
    public VText f29788f;

    /* JADX INFO: renamed from: g */
    public VText f29789g;

    /* JADX INFO: renamed from: h */
    public VText f29790h;

    /* JADX INFO: renamed from: i */
    public VText f29791i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f29792j;

    public IntlGreetListItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m46168d(View view) {
        cmn.m107672a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final String m46169e(IntlDynamicGreetListAct intlDynamicGreetListAct, User user) {
        String string = "";
        StringBuilder sb = new StringBuilder("");
        Profile profile = user.profile;
        if (profile.studies.active) {
            string = intlDynamicGreetListAct.getString(R$string.f20786J5);
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
    public final CharSequence m46170f(IntlDynamicGreetListAct intlDynamicGreetListAct, User user) {
        StringBuilder sb = new StringBuilder("");
        if (user == null) {
            return sb.toString();
        }
        if (!user.isHideAgeFromSVipWithOutMe()) {
            sb.append(user.age);
            sb.append(intlDynamicGreetListAct.getString(R$string.f20842Q5));
        }
        if (!user.isHideLocationFromSVip()) {
            String strM133877q = i0g0.m133877q(user.location, true);
            if (TextUtils.isEmpty(sb.toString())) {
                sb.append(strM133877q);
            } else {
                sb.append("(");
                sb.append(strM133877q);
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
            ArrayList arrayListM200339n = vwb.m200339n(user.profile.tags, new w9j() { // from class: l.amn
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("personality", ((Tag) obj).category));
                }
            });
            if (!vwb.m200296J(arrayListM200339n)) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(" · ");
                }
                sb.append(((Tag) arrayListM200339n.get(0)).value);
                return sb.toString();
            }
            String strM46169e = m46169e(intlDynamicGreetListAct, user);
            if (!TextUtils.isEmpty(strM46169e)) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(" · ");
                }
                sb.append(strM46169e);
                return sb.toString();
            }
            ArrayList arrayListM200339n2 = vwb.m200339n(user.profile.tags, new w9j() { // from class: l.bmn
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!TextUtils.equals("personality", ((Tag) obj).category));
                }
            });
            if (!vwb.m200296J(arrayListM200339n2)) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append(" · ");
                }
                sb.append(((Tag) arrayListM200339n2.get(0)).value);
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
    public final /* synthetic */ void m46171g(q9n q9nVar, fxq fxqVar, IntlDynamicGreetListAct intlDynamicGreetListAct, int i, j760 j760Var) {
        double d;
        SvipPrivacySettings svipPrivacySettings;
        if (NullChecker.m81303a(j760Var.f116565b) && ((Conversation) j760Var.f116565b).f20374mm > 0) {
            q9nVar.mo173643F(fxqVar.m123668p());
            return;
        }
        User user = (User) j760Var.f116564a;
        if (!TextUtils.isEmpty(fxqVar.m123664j())) {
            qib0.f154691G.m102331L0(this.f29792j, fxqVar.m123664j());
            this.f29783a.m79702n0(user);
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
        if (TextUtils.equals(intlDynamicGreetListAct.getString(R$string.f21099u6), strM155932G) || mqi0.m155944o() - d < 300000.0d) {
            xdl0.m208344M(this.f29784b, true);
        } else {
            strM155932G = String.format(intlDynamicGreetListAct.getString(R$string.f20770H5), strM155932G);
            xdl0.m208344M(this.f29784b, false);
        }
        VText vText = this.f29786d;
        if (i != 20) {
            vText.setText(mqi0.m155932G(fxqVar.m123666n()));
            return;
        }
        vText.setText(strM155932G);
        CharSequence charSequenceM46170f = m46170f(intlDynamicGreetListAct, user);
        if (TextUtils.isEmpty(charSequenceM46170f)) {
            charSequenceM46170f = "";
        }
        this.f29789g.setText(charSequenceM46170f);
    }

    /* JADX INFO: renamed from: h */
    public void m46172h(final IntlDynamicGreetListAct intlDynamicGreetListAct, final q9n q9nVar, final fxq fxqVar, final int i, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        String str;
        if (i == 20) {
            xdl0.m208344M(this.f29789g, true);
            xdl0.m208344M(this.f29790h, true);
            xdl0.m208344M(this.f29791i, false);
            String strM123663i = fxqVar.m123663i();
            this.f29790h.setText(strM123663i);
            xdl0.m208344M(this.f29790h, !TextUtils.isEmpty(strM123663i));
        } else if (i == 30) {
            xdl0.m208344M(this.f29789g, false);
            xdl0.m208344M(this.f29790h, false);
            xdl0.m208344M(this.f29791i, true);
            this.f29791i.setText(fxqVar.m123663i());
        }
        this.f29788f.setText(fxqVar.m123669q());
        this.f29788f.getPaint().setFakeBoldText(true);
        int iM123667o = fxqVar.m123667o();
        VText vText = this.f29785c;
        if (iM123667o > 0) {
            vText.setVisibility(0);
            VText vText2 = this.f29785c;
            if (iM123667o > 99) {
                str = "99+";
            } else {
                str = iM123667o + "";
            }
            vText2.setText(str);
        } else {
            vText.setVisibility(8);
        }
        if (fxqVar.m123670r()) {
            Drawable drawable = intlDynamicGreetListAct.getResources().getDrawable(CoreModule.m29935P().m94658i().mo158396j2());
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f29788f.setCompoundDrawables(null, null, drawable, null);
        } else if (fxqVar.m123672t()) {
            Drawable drawable2 = intlDynamicGreetListAct.getResources().getDrawable(c3c0.f78563K5);
            drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
            this.f29788f.setCompoundDrawables(null, null, drawable2, null);
        } else {
            this.f29788f.setCompoundDrawables(null, null, null, null);
        }
        xdl0.m208329E0(this, onClickListener);
        setOnLongClickListener(onLongClickListener);
        q9nVar.mo67374c(intlDynamicGreetListAct, mkd0.m154984r(CoreModule.f17545c.f19639e0.m169410Ka(fxqVar.m123668p()), CoreModule.f17545c.f19642f0.m32820Ue(fxqVar.m123668p()), new gm20())).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.zln
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203643a.m46171g(q9nVar, fxqVar, intlDynamicGreetListAct, i, (j760) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46168d(this);
        this.f29792j = this.f29783a.get_pic();
    }

    public IntlGreetListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlGreetListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
