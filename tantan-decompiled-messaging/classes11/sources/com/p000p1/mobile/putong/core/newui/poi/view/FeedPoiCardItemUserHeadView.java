package com.p000p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.SvipPrivacySettings;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.aoh;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import p009l.da80;
import p009l.i0g0;
import p009l.mqi0;
import v.VDraweeView;
import v.VLinear_FillerMeasure;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class FeedPoiCardItemUserHeadView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public FeedPoiCardItemUserHeadView f5181a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f5182b;

    /* JADX INFO: renamed from: c */
    public VLinear_FillerMeasure f5183c;

    /* JADX INFO: renamed from: d */
    public VText f5184d;

    /* JADX INFO: renamed from: e */
    public VText f5185e;

    /* JADX INFO: renamed from: f */
    public VText f5186f;

    public FeedPoiCardItemUserHeadView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7380a(View view) {
        aoh.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final long m7381b(User user) {
        SvipPrivacySettings svipPrivacySettings;
        if (!NullChecker.a(user.settings) || vwb.J(user.settings.settingGroups)) {
            return 0L;
        }
        SettingGroups settingGroup = user.settings.getSettingGroup();
        if (!NullChecker.a(settingGroup) || (svipPrivacySettings = settingGroup.svipPrivacy) == null) {
            return 0L;
        }
        long j = user.localLatestReceivedMessageTime;
        long j2 = svipPrivacySettings.frozenTime;
        return j > j2 ? j : j2;
    }

    /* JADX INFO: renamed from: c */
    public final String m7382c(User user) {
        if (user.location == null) {
            return "";
        }
        String strM7383d = m7383d(user, false);
        String strM7385f = m7385f(user);
        if (TextUtils.isEmpty(strM7385f)) {
            return strM7383d;
        }
        if (TextUtils.isEmpty(strM7383d)) {
            return String.valueOf(strM7385f);
        }
        return ((CharSequence) strM7385f) + " · " + strM7383d;
    }

    /* JADX INFO: renamed from: d */
    public String m7383d(User user, boolean z) {
        return m7384e(user, z, false);
    }

    /* JADX INFO: renamed from: e */
    public final String m7384e(User user, boolean z, boolean z2) {
        return CoreModule.c.E0.w3(user) ? mqi0.m18544M(m7381b(user), z, z2) : mqi0.m18544M(user.location.updatedTime, z, z2);
    }

    /* JADX INFO: renamed from: f */
    public final String m7385f(User user) {
        if (user == null) {
            return "";
        }
        return (CoreModule.c.E0.B3(user) ? "" : i0g0.m16124W(user.location)).toString();
    }

    /* JADX INFO: renamed from: g */
    public void m7386g(da80 da80Var) {
        m7387h(da80Var.f11695b);
        m7389j(da80Var.f11695b);
        m7388i(da80Var.f11695b);
    }

    /* JADX INFO: renamed from: h */
    public final void m7387h(User user) {
        qib0.G.L0(this.f5182b, user.fp().profileBig().formatted());
    }

    /* JADX INFO: renamed from: i */
    public final void m7388i(User user) {
        String strM7382c = m7382c(user);
        this.f5186f.setText(strM7382c);
        xdl0.M(this.f5186f, !TextUtils.isEmpty(strM7382c));
    }

    /* JADX INFO: renamed from: j */
    public final void m7389j(User user) {
        this.f5184d.setText(user.name);
        this.f5184d.setTypeface(Typeface.DEFAULT_BOLD);
        this.f5185e.setText(String.valueOf(user.age));
        xdl0.M(this.f5185e, !user.isHideAgeFromSVipWithOutMe());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7380a(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int iY0 = xdl0.y0();
        int i = t100.o;
        int i2 = (iY0 - i) - i;
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
