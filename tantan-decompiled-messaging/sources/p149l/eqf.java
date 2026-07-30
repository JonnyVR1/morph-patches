package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.p046p1.mobile.putong.live.base.data.BLiveVerificationCenter;
import com.p046p1.mobile.putong.live.external.intl.feedback.IntlFeedbackActivity;
import com.p046p1.mobile.putong.live.external.intl.feedback.upload.IntlFeedbackCategoryAct;
import com.p046p1.mobile.putong.live.external.module.api.LiveAssertApi;
import com.p046p1.mobile.putong.live.external.module.api.LiveVerificationApi;
import com.p046p1.mobile.putong.live.external.page.rights.list.LiveUserRightListAct;
import com.p046p1.mobile.putong.live.external.page.rights.manage.LiveRightAct;
import com.p046p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class eqf implements dqf {
    @Override // p149l.dqf
    /* JADX INFO: renamed from: A */
    public String mo113021A(String str) {
        return qmn.INSTANCE.m175574a(str);
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: B */
    public void mo113022B(@Nullable e30<Boolean> e30Var) {
        LiveVerificationApi.requestLiveVerification(e30Var);
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: C */
    public boolean mo113023C() {
        return lor.m150811p() || TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia);
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: M2 */
    public void mo113024M2(Act act, User user, String str) {
        l9s.m149076g().mo30706M2(act, user, str);
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: a */
    public boolean mo113025a() {
        return LiveAssertApi.getCanUseMaskMode();
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: b */
    public boolean mo113026b() {
        return lor.m150807l();
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: c */
    public x7m mo113027c() {
        return l9s.m149044G().mo67253Zo();
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: d */
    public void mo113028d(Act act, String str) {
        Intent intent = new Intent(act, (Class<?>) IntlFeedbackCategoryAct.class);
        intent.putExtra("liveType", str);
        act.startActivity(intent);
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: e */
    public SettingGroups mo113029e() {
        return l9s.m149103w();
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: f */
    public void mo113030f(Act act) {
        yuf0.m216111a(act, null);
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: g */
    public String mo113031g(int i, boolean z) {
        return dpn0.m112921d(i, z);
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: h */
    public void mo113032h(Context context) {
        context.startActivity(LiveIndependentSettingAct.m70698X1(context, "intl_music_playlist_page_frag"));
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: i */
    public boolean mo113033i() {
        return (TEnum.equals(qib0.f154719h0, LiveRegionTag.taiwan) || TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia)) && !vdt.m198092b(2);
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: i5 */
    public C22306c<Boolean> mo113034i5(Act act, @Nullable String str) {
        return l9s.m149071d0(act, str);
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: j */
    public C22306c<Boolean> mo113035j(Act act) {
        return m2u.m152717n(act);
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: k */
    public boolean mo113036k() {
        return ((jj3) s9s.m182763m(gld0.f103314d)).f118223d.get().booleanValue();
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: k2 */
    public C22306c<BLiveVerificationCenter> mo113037k2() {
        return l9s.m149100t();
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: l */
    public String mo113038l(int i, String str, boolean z) {
        return dpn0.m112920c(i, str, z);
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: m */
    public uut mo113039m() {
        return s9s.f163228b;
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: n */
    public void mo113040n(Act act, LiveGoAction liveGoAction) {
        xps.m210534a(act, liveGoAction);
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: o */
    public void mo113041o(int i) {
        pgi0.m168730l().m168748u(i);
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: p */
    public Intent mo113042p(Context context) {
        return l9s.m149044G().mo67220Gr(context, null);
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: q */
    public void mo113043q(boolean z) {
        s2u.m182079k(z);
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: r */
    public boolean mo113044r(Activity activity) {
        return l9s.m149049L(activity);
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: s */
    public boolean mo113045s() {
        return LiveVerificationApi.noVerificationInfo();
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: t */
    public void mo113046t(Act act, String str, String str2, String str3, String str4, String str5, String str6) {
        LiveRightAct.m70653Y1(act, str, str2, str3, str4, str5, str6);
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: u */
    public void mo113047u(Context context) {
        context.startActivity(new Intent(context, (Class<?>) IntlFeedbackActivity.class));
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: v */
    public void mo113048v(Context context) {
        l9s.m149060W(context);
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: w */
    public boolean mo113049w() {
        return pgi0.m168730l().m168751x();
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: x */
    public boolean mo113050x(Context context) {
        gld0<jj3> gld0Var = gld0.f103314d;
        return ((jj3) s9s.m182763m(gld0Var)).f118223d.get().booleanValue() ? ((jj3) s9s.m182763m(gld0Var)).f118222c.get().booleanValue() : rqi.m180453d().m180455b(context);
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: y */
    public void mo113051y(Act act, Bundle bundle) {
        LiveUserRightListAct.m70560X1(act, bundle);
    }

    @Override // p149l.dqf
    /* JADX INFO: renamed from: z */
    public boolean mo113052z() {
        return ((jj3) s9s.m182763m(gld0.f103314d)).m141737b();
    }
}
