package p149l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.meet.MeetAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.seepage.likers.FakeLikersAct;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class g0e0 extends kxd0 {

    /* JADX INFO: renamed from: a */
    public static String f100037a = "svip_pay_success";

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m123956e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m123957f(String str, final Act act, final String str2, final Activity activity, roj0 roj0Var) {
        User userM169524oa = CoreModule.f17545c.f19639e0.m169524oa(str);
        if (NullChecker.m81303a(userM169524oa)) {
            qer.m174243n(act, userM169524oa, true, false, false, str2, null, new e30() { // from class: l.e0e0
                @Override // p149l.e30
                public final void call(Object obj) {
                    g0e0.m123959h(act, activity, str2, (Relationship) obj);
                }
            }, new e30() { // from class: l.f0e0
                @Override // p149l.e30
                public final void call(Object obj) {
                    g0e0.m123958g((Throwable) obj);
                }
            }, str2, null, null, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m123958g(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m123959h(Act act, Activity activity, String str, Relationship relationship) {
        if (!NullChecker.m81303a(relationship) || TEnum.equals(relationship.state, "matched")) {
            return;
        }
        act.startActivity(MeetAct.m40494Y1(activity, str, "see"));
    }

    /* JADX INFO: renamed from: i */
    public static Activity m123960i() {
        if (Act.globalLifeCycle_().isEmpty() || Act.globalLifeCycle_().values().isEmpty()) {
            return null;
        }
        ArrayList<Act.C4299r> next = Act.globalLifeCycle_().values().iterator().next();
        if (vwb.m200296J(next)) {
            return null;
        }
        return next.get(next.size() - 1).f15343a.get();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m123961j() {
        Iterator<ArrayList<Act.C4299r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator<Act.C4299r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().f15343a.get();
                if (activity != null && (activity instanceof NewMainAct)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (!m123961j()) {
            super.mo94421a(w2e0Var, f30Var);
            return;
        }
        final Activity activityM123960i = m123960i();
        if (!(activityM123960i instanceof Act)) {
            super.mo94421a(w2e0Var, f30Var);
            return;
        }
        if (g6a.m124559h()) {
            if ("match".equals(TextUtils.isEmpty(w2e0Var.m201099g()) ? "" : w2e0Var.m201099g().replaceFirst("/", ""))) {
                final String str = w2e0Var.m201098f().get("from");
                if (TextUtils.isEmpty(str)) {
                    str = f100037a;
                }
                final String str2 = w2e0Var.m201098f().get(Oauth2AccessToken.KEY_UID);
                if (TextUtils.isEmpty(str2)) {
                    activityM123960i.startActivity(MeetAct.m40494Y1(activityM123960i, str, "see"));
                    return;
                } else if (CoreModule.m29932K().mo30819sg(str2)) {
                    activityM123960i.startActivity(MessagesAct.m48943i2(activityM123960i, str2, false, false));
                    return;
                } else {
                    final Act act = (Act) activityM123960i;
                    act.duringCreated(CoreModule.f17545c.f19639e0.m169454W9(str2)).subscribe(mkd0.m154956H(new e30() { // from class: l.c0e0
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            g0e0.m123957f(str2, act, str, activityM123960i, (roj0) obj);
                        }
                    }, new e30() { // from class: l.d0e0
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            g0e0.m123956e((Throwable) obj);
                        }
                    }));
                    return;
                }
            }
        }
        TextUtils.isEmpty(w2e0Var.m201098f().get("from"));
        if (!n3b0.m157742q()) {
            w2e0Var.m201094b().startActivity(LikersAct.m56544X1(activityM123960i, "p_special_card,deeplink_intl,click"));
            return;
        }
        if (!TextUtils.equals(w2e0Var.m201098f().get("preferredShowDetail"), "true")) {
            CoreModule.m29935P().m94651a().mo33534l1((Act) activityM123960i, "p_special_card,deeplink_intl,click");
            return;
        }
        boolean zEquals = TextUtils.equals(w2e0Var.m201098f().get("preferredShowPurchase"), "true");
        Intent intentM54955V1 = FakeLikersAct.m54955V1(activityM123960i, "p_special_card,deeplink_intl,click");
        intentM54955V1.putExtra("preferred_show_purchase", zEquals);
        w2e0Var.m201094b().startActivity(intentM54955V1);
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (vdj.m198001c()) {
            return lva.m151855k(w2e0Var.m201094b(), NavigationIntent.get("seeLikes"));
        }
        return null;
    }
}
