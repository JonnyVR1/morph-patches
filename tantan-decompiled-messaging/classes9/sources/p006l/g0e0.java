package p006l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.seepage.likers.FakeLikersAct;
import com.p000p1.mobile.putong.core.p004ui.vip.likers.LikersAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.newui.meet.MeetAct;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.NavigationIntent;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.e30;
import l.f30;
import l.mkd0;
import l.n3b0;
import l.qer;
import l.roj0;
import l.vwb;
import l.x9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class g0e0 extends kxd0 {

    /* JADX INFO: renamed from: a */
    public static String f13015a = "svip_pay_success";

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m15553e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m15554f(String str, final Act act, final String str2, final Activity activity, roj0 roj0Var) {
        User userM21487oa = CoreModule.f1534c.f3628e0.m21487oa(str);
        if (NullChecker.a(userM21487oa)) {
            qer.n(act, userM21487oa, true, false, false, str2, (x9j) null, new e30() { // from class: l.e0e0
                public final void call(Object obj) {
                    g0e0.m15556h(act, activity, str2, (Relationship) obj);
                }
            }, new e30() { // from class: l.f0e0
                public final void call(Object obj) {
                    g0e0.m15555g((Throwable) obj);
                }
            }, str2, (LikeExtraData) null, (String) null, (String) null);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m15555g(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m15556h(Act act, Activity activity, String str, Relationship relationship) {
        if (!NullChecker.a(relationship) || TEnum.equals(relationship.state, "matched")) {
            return;
        }
        act.startActivity(MeetAct.Y1(activity, str, "see"));
    }

    /* JADX INFO: renamed from: i */
    public static Activity m15557i() {
        if (Act.globalLifeCycle_().isEmpty() || Act.globalLifeCycle_().values().isEmpty()) {
            return null;
        }
        List list = (List) Act.globalLifeCycle_().values().iterator().next();
        if (vwb.J(list)) {
            return null;
        }
        return (Activity) ((Act.r) list.get(list.size() - 1)).a.get();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m15558j() {
        Iterator it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) it.next()).iterator();
            while (it2.hasNext()) {
                Activity activity = (Activity) ((Act.r) it2.next()).a.get();
                if (activity != null && (activity instanceof NewMainAct)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (!m15558j()) {
            super.mo11681a(w2e0Var, f30Var);
            return;
        }
        final Act actM15557i = m15557i();
        if (!(actM15557i instanceof Act)) {
            super.mo11681a(w2e0Var, f30Var);
            return;
        }
        if (g6a.m15585h()) {
            if ("match".equals(TextUtils.isEmpty(w2e0Var.m26161g()) ? "" : w2e0Var.m26161g().replaceFirst("/", ""))) {
                final String str = w2e0Var.m26160f().get("from");
                if (TextUtils.isEmpty(str)) {
                    str = f13015a;
                }
                final String str2 = w2e0Var.m26160f().get("uid");
                if (TextUtils.isEmpty(str2)) {
                    actM15557i.startActivity(MeetAct.Y1(actM15557i, str, "see"));
                    return;
                } else if (CoreModule.m1851K().sg(str2)) {
                    actM15557i.startActivity(MessagesAct.i2(actM15557i, str2, false, false));
                    return;
                } else {
                    final Act act = actM15557i;
                    act.duringCreated(CoreModule.f1534c.f3628e0.m21417W9(str2)).subscribe(mkd0.H(new e30() { // from class: l.c0e0
                        public final void call(Object obj) {
                            g0e0.m15554f(str2, act, str, actM15557i, (roj0) obj);
                        }
                    }, new e30() { // from class: l.d0e0
                        public final void call(Object obj) {
                            g0e0.m15553e((Throwable) obj);
                        }
                    }));
                    return;
                }
            }
        }
        TextUtils.isEmpty(w2e0Var.m26160f().get("from"));
        if (!n3b0.q()) {
            w2e0Var.m26156b().startActivity(LikersAct.m9986X1(actM15557i, "p_special_card,deeplink_intl,click"));
            return;
        }
        if (!TextUtils.equals(w2e0Var.m26160f().get("preferredShowDetail"), "true")) {
            CoreModule.m1854P().m11706a().m5471l1(actM15557i, "p_special_card,deeplink_intl,click");
            return;
        }
        boolean zEquals = TextUtils.equals(w2e0Var.m26160f().get("preferredShowPurchase"), "true");
        Intent intentM8319V1 = FakeLikersAct.m8319V1(actM15557i, "p_special_card,deeplink_intl,click");
        intentM8319V1.putExtra("preferred_show_purchase", zEquals);
        w2e0Var.m26156b().startActivity(intentM8319V1);
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (vdj.m25806c()) {
            return lva.m19032k(w2e0Var.m26156b(), NavigationIntent.get("seeLikes"));
        }
        return null;
    }
}
