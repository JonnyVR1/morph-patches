package com.p051p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.SvipPrivacySettings;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VLinear_FillerMeasure;
import p151v.VText;
import p153l.bnl0;
import p153l.ji80;
import p153l.jyb;
import p153l.pph;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class FeedPoiCardItemUserHeadView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public FeedPoiCardItemUserHeadView f27145a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f27146b;

    /* JADX INFO: renamed from: c */
    public VLinear_FillerMeasure f27147c;

    /* JADX INFO: renamed from: d */
    public VText f27148d;

    /* JADX INFO: renamed from: e */
    public VText f27149e;

    /* JADX INFO: renamed from: f */
    public VText f27150f;

    public FeedPoiCardItemUserHeadView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m44176a(View view) {
        pph.m173200a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final long m44177b(User user) {
        SvipPrivacySettings svipPrivacySettings;
        if (!NullChecker.m82486a(user.settings) || jyb.m147479J(user.settings.settingGroups)) {
            return 0L;
        }
        SettingGroups settingGroup = user.settings.getSettingGroup();
        if (!NullChecker.m82486a(settingGroup) || (svipPrivacySettings = settingGroup.svipPrivacy) == null) {
            return 0L;
        }
        long j = user.localLatestReceivedMessageTime;
        long j2 = svipPrivacySettings.frozenTime;
        return j > j2 ? j : j2;
    }

    /* JADX INFO: renamed from: c */
    public final String m44178c(User user) {
        if (user.location == null) {
            return "";
        }
        String strM44179d = m44179d(user, false);
        String strM44181f = m44181f(user);
        if (TextUtils.isEmpty(strM44181f)) {
            return strM44179d;
        }
        if (TextUtils.isEmpty(strM44179d)) {
            return String.valueOf(strM44181f);
        }
        return ((CharSequence) strM44181f) + " · " + strM44179d;
    }

    /* JADX INFO: renamed from: d */
    public String m44179d(User user, boolean z) {
        return m44180e(user, z, false);
    }

    /* JADX INFO: renamed from: e */
    public final String m44180e(User user, boolean z, boolean z2) {
        return CoreModule.f18264c.f20303E0.m141088w3(user) ? pzi0.m174448M(m44177b(user), z, z2) : pzi0.m174448M(user.location.updatedTime, z, z2);
    }

    /* JADX INFO: renamed from: f */
    public final String m44181f(User user) {
        if (user == null) {
            return "";
        }
        return (CoreModule.f18264c.f20303E0.m141060B3(user) ? "" : q8g0.m175791W(user.location)).toString();
    }

    /* JADX INFO: renamed from: g */
    public void m44182g(ji80 ji80Var) {
        m44183h(ji80Var.f121050b);
        m44185j(ji80Var.f121050b);
        m44184i(ji80Var.f121050b);
    }

    /* JADX INFO: renamed from: h */
    public final void m44183h(User user) {
        uqb0.f180374G.m127115L0(this.f27146b, user.m61308fp().profileBig().formatted());
    }

    /* JADX INFO: renamed from: i */
    public final void m44184i(User user) {
        String strM44178c = m44178c(user);
        this.f27150f.setText(strM44178c);
        bnl0.m105524M(this.f27150f, !TextUtils.isEmpty(strM44178c));
    }

    /* JADX INFO: renamed from: j */
    public final void m44185j(User user) {
        this.f27148d.setText(user.name);
        this.f27148d.setTypeface(Typeface.DEFAULT_BOLD);
        this.f27149e.setText(String.valueOf(user.age));
        bnl0.m105524M(this.f27149e, !user.isHideAgeFromSVipWithOutMe());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44176a(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int iM105592y0 = bnl0.m105592y0();
        int i = qa00.f156328o;
        int i2 = (iM105592y0 - i) - i;
        layoutParams.height = i2;
        layoutParams.width = i2;
    }

    public FeedPoiCardItemUserHeadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiCardItemUserHeadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
