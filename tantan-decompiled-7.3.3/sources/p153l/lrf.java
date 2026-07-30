package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.p051p1.mobile.putong.live.base.data.BLiveVerificationCenter;
import com.p051p1.mobile.putong.live.external.intl.feedback.IntlFeedbackActivity;
import com.p051p1.mobile.putong.live.external.intl.feedback.upload.IntlFeedbackCategoryAct;
import com.p051p1.mobile.putong.live.external.module.api.LiveAssertApi;
import com.p051p1.mobile.putong.live.external.module.api.LiveVerificationApi;
import com.p051p1.mobile.putong.live.external.page.rights.list.LiveUserRightListAct;
import com.p051p1.mobile.putong.live.external.page.rights.manage.LiveRightAct;
import com.p051p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class lrf implements krf {
    @Override // p153l.krf
    /* JADX INFO: renamed from: A */
    public String mo151042A(String str) {
        return qon.INSTANCE.m177307a(str);
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: B */
    public void mo151043B(@Nullable y20<Boolean> y20Var) {
        LiveVerificationApi.requestLiveVerification(y20Var);
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: C */
    public boolean mo151044C() {
        return mqr.m159596p() || TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia);
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: M2 */
    public void mo151045M2(Act act, User user, String str) {
        mbs.m157853g().mo31709M2(act, user, str);
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: a */
    public boolean mo151046a() {
        return LiveAssertApi.getCanUseMaskMode();
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: b */
    public boolean mo151047b() {
        return mqr.m159592l();
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: c */
    public nam mo151048c() {
        return mbs.m157821G().mo68436Zo();
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: d */
    public void mo151049d(Act act, String str) {
        Intent intent = new Intent(act, (Class<?>) IntlFeedbackCategoryAct.class);
        intent.putExtra("liveType", str);
        act.startActivity(intent);
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: e */
    public SettingGroups mo151050e() {
        return mbs.m157880w();
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: f */
    public void mo151051f(Act act) {
        h3g0.m133482a(act, null);
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: g */
    public String mo151052g(int i, boolean z) {
        return hyn0.m137762d(i, z);
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: h */
    public void mo151053h(Context context) {
        context.startActivity(LiveIndependentSettingAct.m71881Y1(context, "intl_music_playlist_page_frag"));
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: i */
    public boolean mo151054i() {
        return (TEnum.equals(uqb0.f180402h0, LiveRegionTag.taiwan) || TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia)) && !wft.m206159b(2);
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: i5 */
    public C22421c<Boolean> mo151055i5(Act act, @Nullable String str) {
        return mbs.m157848d0(act, str);
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: j */
    public C22421c<Boolean> mo151056j(Act act) {
        return n4u.m161602n(act);
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: k */
    public boolean mo151057k() {
        return ((bk3) tbs.m190077m(itd0.f116822d)).f77041d.get().booleanValue();
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: k2 */
    public C22421c<BLiveVerificationCenter> mo151058k2() {
        return mbs.m157877t();
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: l */
    public String mo151059l(int i, String str, boolean z) {
        return hyn0.m137761c(i, str, z);
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: m */
    public vwt mo151060m() {
        return tbs.f172989b;
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: n */
    public void mo151061n(Act act, LiveGoAction liveGoAction) {
        yrs.m217233a(act, liveGoAction);
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: o */
    public void mo151062o(int i) {
        ppi0.m173207l().m173225u(i);
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: p */
    public Intent mo151063p(Context context) {
        return mbs.m157821G().mo68403Gr(context, null);
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: q */
    public void mo151064q(boolean z) {
        t4u.m189322k(z);
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: r */
    public boolean mo151065r(Activity activity) {
        return mbs.m157826L(activity);
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: s */
    public boolean mo151066s() {
        return LiveVerificationApi.noVerificationInfo();
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: t */
    public void mo151067t(Act act, String str, String str2, String str3, String str4, String str5, String str6) {
        LiveRightAct.m71836Z1(act, str, str2, str3, str4, str5, str6);
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: u */
    public void mo151068u(Context context) {
        context.startActivity(new Intent(context, (Class<?>) IntlFeedbackActivity.class));
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: v */
    public void mo151069v(Context context) {
        mbs.m157837W(context);
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: w */
    public boolean mo151070w() {
        return ppi0.m173207l().m173228x();
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: x */
    public boolean mo151071x(Context context) {
        itd0<bk3> itd0Var = itd0.f116822d;
        return ((bk3) tbs.m190077m(itd0Var)).f77041d.get().booleanValue() ? ((bk3) tbs.m190077m(itd0Var)).f77040c.get().booleanValue() : nti.m164730d().m164732b(context);
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: y */
    public void mo151072y(Act act, Bundle bundle) {
        LiveUserRightListAct.m71743Y1(act, bundle);
    }

    @Override // p153l.krf
    /* JADX INFO: renamed from: z */
    public boolean mo151073z() {
        return ((bk3) tbs.m190077m(itd0.f116822d)).m104788b();
    }
}
