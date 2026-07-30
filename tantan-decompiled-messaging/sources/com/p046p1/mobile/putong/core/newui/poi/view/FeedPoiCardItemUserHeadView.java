package com.p046p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.SvipPrivacySettings;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VLinear_FillerMeasure;
import p147v.VText;
import p149l.aoh;
import p149l.da80;
import p149l.i0g0;
import p149l.mqi0;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class FeedPoiCardItemUserHeadView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public FeedPoiCardItemUserHeadView f26403a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f26404b;

    /* JADX INFO: renamed from: c */
    public VLinear_FillerMeasure f26405c;

    /* JADX INFO: renamed from: d */
    public VText f26406d;

    /* JADX INFO: renamed from: e */
    public VText f26407e;

    /* JADX INFO: renamed from: f */
    public VText f26408f;

    public FeedPoiCardItemUserHeadView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m43165a(View view) {
        aoh.m97897a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final long m43166b(User user) {
        SvipPrivacySettings svipPrivacySettings;
        if (!NullChecker.m81303a(user.settings) || vwb.m200296J(user.settings.settingGroups)) {
            return 0L;
        }
        SettingGroups settingGroup = user.settings.getSettingGroup();
        if (!NullChecker.m81303a(settingGroup) || (svipPrivacySettings = settingGroup.svipPrivacy) == null) {
            return 0L;
        }
        long j = user.localLatestReceivedMessageTime;
        long j2 = svipPrivacySettings.frozenTime;
        return j > j2 ? j : j2;
    }

    /* JADX INFO: renamed from: c */
    public final String m43167c(User user) {
        if (user.location == null) {
            return "";
        }
        String strM43168d = m43168d(user, false);
        String strM43170f = m43170f(user);
        if (TextUtils.isEmpty(strM43170f)) {
            return strM43168d;
        }
        if (TextUtils.isEmpty(strM43168d)) {
            return String.valueOf(strM43170f);
        }
        return ((CharSequence) strM43170f) + " · " + strM43168d;
    }

    /* JADX INFO: renamed from: d */
    public String m43168d(User user, boolean z) {
        return m43169e(user, z, false);
    }

    /* JADX INFO: renamed from: e */
    public final String m43169e(User user, boolean z, boolean z2) {
        return CoreModule.f17545c.f19561E0.m203800w3(user) ? mqi0.m155938M(m43166b(user), z, z2) : mqi0.m155938M(user.location.updatedTime, z, z2);
    }

    /* JADX INFO: renamed from: f */
    public final String m43170f(User user) {
        if (user == null) {
            return "";
        }
        return (CoreModule.f17545c.f19561E0.m203772B3(user) ? "" : i0g0.m133856W(user.location)).toString();
    }

    /* JADX INFO: renamed from: g */
    public void m43171g(da80 da80Var) {
        m43172h(da80Var.f85198b);
        m43174j(da80Var.f85198b);
        m43173i(da80Var.f85198b);
    }

    /* JADX INFO: renamed from: h */
    public final void m43172h(User user) {
        qib0.f154691G.m102331L0(this.f26404b, user.m60124fp().profileBig().formatted());
    }

    /* JADX INFO: renamed from: i */
    public final void m43173i(User user) {
        String strM43167c = m43167c(user);
        this.f26408f.setText(strM43167c);
        xdl0.m208344M(this.f26408f, !TextUtils.isEmpty(strM43167c));
    }

    /* JADX INFO: renamed from: j */
    public final void m43174j(User user) {
        this.f26406d.setText(user.name);
        this.f26406d.setTypeface(Typeface.DEFAULT_BOLD);
        this.f26407e.setText(String.valueOf(user.age));
        xdl0.m208344M(this.f26407e, !user.isHideAgeFromSVipWithOutMe());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43165a(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int iM208412y0 = xdl0.m208412y0();
        int i = t100.f167266o;
        int i2 = (iM208412y0 - i) - i;
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
