package p149l;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.IntlThirdQuickLoginData;
import com.p046p1.mobile.putong.core.data.IntlThirdQuickLoginEnvelope;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class rxd0 extends kxd0 {
    /* JADX INFO: renamed from: g */
    public static Activity m181547g() {
        WeakReference<Activity> weakReference;
        HashMap<Integer, ArrayList<Act.C4299r>> mapGlobalLifeCycle_ = Act.globalLifeCycle_();
        if (mapGlobalLifeCycle_ != null && !mapGlobalLifeCycle_.isEmpty()) {
            for (ArrayList<Act.C4299r> arrayList : mapGlobalLifeCycle_.values()) {
                if (arrayList != null) {
                    Iterator<Act.C4299r> it = arrayList.iterator();
                    while (it.hasNext()) {
                        Act.C4299r next = it.next();
                        Activity activity = (next == null || (weakReference = next.f15343a) == null) ? null : weakReference.get();
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
    private boolean m181548h(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    private String m181549m(String str, w2e0 w2e0Var) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : w2e0Var.m201098f().keySet()) {
            if (!"url".equals(str2)) {
                builderBuildUpon.appendQueryParameter(str2, w2e0Var.m201098f().get(str2));
            }
        }
        return builderBuildUpon.build().toString();
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        super.mo94421a(w2e0Var, f30Var);
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        Map<String, String> mapM201098f = w2e0Var.m201098f();
        String str = mapM201098f.get("url");
        final boolean zEquals = TextUtils.equals(mapM201098f.get("openExternalURL"), "true");
        final String str2 = mapM201098f.get("tracker");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        final String strM181549m = m181549m(str, w2e0Var);
        if (TextUtils.isEmpty(strM181549m)) {
            return null;
        }
        Activity activityM181547g = strM181549m.contains("subscribe.tantanapp.com") ? m181547g() : xdl0.m208326D(w2e0Var.m201094b());
        if (!(activityM181547g instanceof Act) || !m181548h(activityM181547g)) {
            return null;
        }
        final Act act = (Act) activityM181547g;
        act.duringCreated((C22306c) CoreModule.f17545c.f19556C1.m202273c3(), false).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.pxd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151661a.m181550i(act, str2, strM181549m, zEquals, (IntlThirdQuickLoginEnvelope) obj);
            }
        }, new e30() { // from class: l.qxd0
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151578h(R$string.f18663k9);
            }
        }));
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m181550i(Act act, String str, String str2, boolean z, IntlThirdQuickLoginEnvelope intlThirdQuickLoginEnvelope) {
        HashMap<String, String> map = new HashMap<>();
        map.put("step", "4");
        map.put("available", m181548h(act) + "");
        map.put("code", intlThirdQuickLoginEnvelope.meta.code + "");
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        map.put("tracker", str);
        m181553l(str2, map);
        if (!m181548h(act) || intlThirdQuickLoginEnvelope.meta.code != 200000) {
            lsi0.m151578h(R$string.f18663k9);
            return;
        }
        IntlThirdQuickLoginData intlThirdQuickLoginData = intlThirdQuickLoginEnvelope.data;
        if (z) {
            m181551j(act, str2, intlThirdQuickLoginData.code);
        } else {
            m181552k(act, str2, intlThirdQuickLoginData.code);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m181551j(Act act, String str, String str2) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        act.startActivity(new Intent("android.intent.action.VIEW").setData(builderBuildUpon.appendQueryParameter("serverCode", str2).build()));
    }

    /* JADX INFO: renamed from: k */
    public final void m181552k(Act act, String str, String str2) {
        act.startActivity(lva.m151840A(act, "", Uri.parse(str).buildUpon().appendQueryParameter("serverCode", str2).build().toString(), true, false, false));
    }

    /* JADX INFO: renamed from: l */
    public final void m181553l(String str, HashMap<String, String> map) {
        zvf0.m220371D("e_intl_inner_web_jump", "p_suggest_users_home_view", vwb.m200311Y("url", str), vwb.m200311Y(CommandMessage.PARAMS, map));
    }
}
