package p153l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.meet.MeetAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.FakeLikersAct;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class k8e0 extends o5e0 {

    /* JADX INFO: renamed from: a */
    public static String f124376a = "svip_pay_success";

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m148688e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m148689f(String str, final Act act, final String str2, final Activity activity, uxj0 uxj0Var) {
        User userM116597oa = CoreModule.f18264c.f20381e0.m116597oa(str);
        if (NullChecker.m82486a(userM116597oa)) {
            rgr.m181477n(act, userM116597oa, true, false, false, str2, null, new y20() { // from class: l.i8e0
                @Override // p153l.y20
                public final void call(Object obj) {
                    k8e0.m148691h(act, activity, str2, (Relationship) obj);
                }
            }, new y20() { // from class: l.j8e0
                @Override // p153l.y20
                public final void call(Object obj) {
                    k8e0.m148690g((Throwable) obj);
                }
            }, str2, null, null, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m148690g(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m148691h(Act act, Activity activity, String str, Relationship relationship) {
        if (!NullChecker.m82486a(relationship) || TEnum.equals(relationship.state, "matched")) {
            return;
        }
        act.startActivity(MeetAct.m41505Z1(activity, str, "see"));
    }

    /* JADX INFO: renamed from: i */
    public static Activity m148692i() {
        if (Act.globalLifeCycle_().isEmpty() || Act.globalLifeCycle_().values().isEmpty()) {
            return null;
        }
        ArrayList<Act.C4450r> next = Act.globalLifeCycle_().values().iterator().next();
        if (jyb.m147479J(next)) {
            return null;
        }
        return next.get(next.size() - 1).f16062a.get();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m148693j() {
        Iterator<ArrayList<Act.C4450r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator<Act.C4450r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().f16062a.get();
                if (activity != null && (activity instanceof NewMainAct)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        if (!m148693j()) {
            super.mo95798a(abe0Var, z20Var);
            return;
        }
        final Activity activityM148692i = m148692i();
        if (!(activityM148692i instanceof Act)) {
            super.mo95798a(abe0Var, z20Var);
            return;
        }
        if (s7a.m184979h()) {
            if ("match".equals(TextUtils.isEmpty(abe0Var.m96744g()) ? "" : abe0Var.m96744g().replaceFirst("/", ""))) {
                final String str = abe0Var.m96743f().get("from");
                if (TextUtils.isEmpty(str)) {
                    str = f124376a;
                }
                final String str2 = abe0Var.m96743f().get(Oauth2AccessToken.KEY_UID);
                if (TextUtils.isEmpty(str2)) {
                    activityM148692i.startActivity(MeetAct.m41505Z1(activityM148692i, str, "see"));
                    return;
                } else if (CoreModule.m30930K().mo31822sg(str2)) {
                    activityM148692i.startActivity(MessagesAct.m50126k2(activityM148692i, str2, false, false));
                    return;
                } else {
                    final Act act = (Act) activityM148692i;
                    act.duringCreated(CoreModule.f18264c.f20381e0.m116527W9(str2)).subscribe(psd0.m173597H(new y20() { // from class: l.g8e0
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            k8e0.m148689f(str2, act, str, activityM148692i, (uxj0) obj);
                        }
                    }, new y20() { // from class: l.h8e0
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            k8e0.m148688e((Throwable) obj);
                        }
                    }));
                    return;
                }
            }
        }
        TextUtils.isEmpty(abe0Var.m96743f().get("from"));
        if (!rbb0.m180744q()) {
            abe0Var.m96739b().startActivity(LikersAct.m57727Y1(activityM148692i, "p_special_card,deeplink_intl,click"));
            return;
        }
        if (!TextUtils.equals(abe0Var.m96743f().get("preferredShowDetail"), "true")) {
            CoreModule.m30933P().m143405a().mo34537l1((Act) activityM148692i, "p_special_card,deeplink_intl,click");
            return;
        }
        boolean zEquals = TextUtils.equals(abe0Var.m96743f().get("preferredShowPurchase"), "true");
        Intent intentM56138X1 = FakeLikersAct.m56138X1(activityM148692i, "p_special_card,deeplink_intl,click");
        intentM56138X1.putExtra("preferred_show_purchase", zEquals);
        abe0Var.m96739b().startActivity(intentM56138X1);
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        if (pgj.m172246c()) {
            return xwa.m213316k(abe0Var.m96739b(), NavigationIntent.get("seeLikes"));
        }
        return null;
    }
}
