package p006l;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.IntlThirdQuickLoginData;
import com.p1.mobile.putong.core.data.IntlThirdQuickLoginEnvelope;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import l.e30;
import l.f30;
import l.j760;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.vwb;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class rxd0 extends kxd0 {
    /* JADX INFO: renamed from: g */
    public static Activity m23396g() {
        WeakReference weakReference;
        HashMap mapGlobalLifeCycle_ = Act.globalLifeCycle_();
        if (mapGlobalLifeCycle_ != null && !mapGlobalLifeCycle_.isEmpty()) {
            for (ArrayList<Act.r> arrayList : mapGlobalLifeCycle_.values()) {
                if (arrayList != null) {
                    for (Act.r rVar : arrayList) {
                        Activity activity = (rVar == null || (weakReference = rVar.a) == null) ? null : (Activity) weakReference.get();
                        if ((activity instanceof NewMainAct) && !activity.isDestroyed() && !activity.isFinishing()) {
                            return activity;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    private boolean m23397h(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    private String m23398m(String str, w2e0 w2e0Var) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : w2e0Var.m26160f().keySet()) {
            if (!"url".equals(str2)) {
                builderBuildUpon.appendQueryParameter(str2, w2e0Var.m26160f().get(str2));
            }
        }
        return builderBuildUpon.build().toString();
    }

    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        super.mo11681a(w2e0Var, f30Var);
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        Map<String, String> mapM26160f = w2e0Var.m26160f();
        String str = mapM26160f.get("url");
        final boolean zEquals = TextUtils.equals(mapM26160f.get("openExternalURL"), "true");
        final String str2 = mapM26160f.get("tracker");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        final String strM23398m = m23398m(str, w2e0Var);
        if (TextUtils.isEmpty(strM23398m)) {
            return null;
        }
        Activity activityM23396g = strM23398m.contains("subscribe.tantanapp.com") ? m23396g() : xdl0.D(w2e0Var.m26156b());
        if (!(activityM23396g instanceof Act) || !m23397h(activityM23396g)) {
            return null;
        }
        final Act act = (Act) activityM23396g;
        act.duringCreated(CoreModule.f1534c.f3545C1.m26264c3(), false).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.pxd0
            public final void call(Object obj) {
                this.f19410a.m23399i(act, str2, strM23398m, zEquals, (IntlThirdQuickLoginEnvelope) obj);
            }
        }, new e30() { // from class: l.qxd0
            public final void call(Object obj) {
                lsi0.h(R$string.f2652k9);
            }
        }));
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m23399i(Act act, String str, String str2, boolean z, IntlThirdQuickLoginEnvelope intlThirdQuickLoginEnvelope) {
        HashMap<String, String> map = new HashMap<>();
        map.put("step", "4");
        map.put("available", m23397h(act) + "");
        map.put("code", intlThirdQuickLoginEnvelope.meta.code + "");
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        map.put("tracker", str);
        m23402l(str2, map);
        if (!m23397h(act) || intlThirdQuickLoginEnvelope.meta.code != 200000) {
            lsi0.h(R$string.f2652k9);
            return;
        }
        IntlThirdQuickLoginData intlThirdQuickLoginData = intlThirdQuickLoginEnvelope.data;
        if (z) {
            m23400j(act, str2, intlThirdQuickLoginData.code);
        } else {
            m23401k(act, str2, intlThirdQuickLoginData.code);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m23400j(Act act, String str, String str2) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        act.startActivity(new Intent("android.intent.action.VIEW").setData(builderBuildUpon.appendQueryParameter("serverCode", str2).build()));
    }

    /* JADX INFO: renamed from: k */
    public final void m23401k(Act act, String str, String str2) {
        act.startActivity(lva.m19017A(act, "", Uri.parse(str).buildUpon().appendQueryParameter("serverCode", str2).build().toString(), true, false, false));
    }

    /* JADX INFO: renamed from: l */
    public final void m23402l(String str, HashMap<String, String> map) {
        zvf0.D("e_intl_inner_web_jump", "p_suggest_users_home_view", new j760[]{vwb.Y("url", str), vwb.Y("params", map)});
    }
}
