package p153l;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.IntlThirdQuickLoginData;
import com.p051p1.mobile.putong.core.data.IntlThirdQuickLoginEnvelope;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class v5e0 extends o5e0 {
    /* JADX INFO: renamed from: g */
    public static Activity m199838g() {
        WeakReference<Activity> weakReference;
        HashMap<Integer, ArrayList<Act.C4450r>> mapGlobalLifeCycle_ = Act.globalLifeCycle_();
        if (mapGlobalLifeCycle_ != null && !mapGlobalLifeCycle_.isEmpty()) {
            for (ArrayList<Act.C4450r> arrayList : mapGlobalLifeCycle_.values()) {
                if (arrayList != null) {
                    Iterator<Act.C4450r> it = arrayList.iterator();
                    while (it.hasNext()) {
                        Act.C4450r next = it.next();
                        Activity activity = (next == null || (weakReference = next.f16062a) == null) ? null : weakReference.get();
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
    private boolean m199839h(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    private String m199840m(String str, abe0 abe0Var) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : abe0Var.m96743f().keySet()) {
            if (!"url".equals(str2)) {
                builderBuildUpon.appendQueryParameter(str2, abe0Var.m96743f().get(str2));
            }
        }
        return builderBuildUpon.build().toString();
    }

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        super.mo95798a(abe0Var, z20Var);
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        Map<String, String> mapM96743f = abe0Var.m96743f();
        String str = mapM96743f.get("url");
        final boolean zEquals = TextUtils.equals(mapM96743f.get("openExternalURL"), "true");
        final String str2 = mapM96743f.get("tracker");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        final String strM199840m = m199840m(str, abe0Var);
        if (TextUtils.isEmpty(strM199840m)) {
            return null;
        }
        Activity activityM199838g = (strM199840m.contains("subscribe.tantanapp.com") || strM199840m.contains(lhl.INSTANCE.m154222o("subscribe.tantanapp.com"))) ? m199838g() : bnl0.m105506D(abe0Var.m96739b());
        if (!(activityM199838g instanceof Act) || !m199839h(activityM199838g)) {
            return null;
        }
        final Act act = (Act) activityM199838g;
        act.duringCreated((C22421c) CoreModule.f18264c.f20298C1.m124888c3(), false).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.t5e0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172196a.m199841i(act, str2, strM199840m, zEquals, (IntlThirdQuickLoginEnvelope) obj);
            }
        }, new y20() { // from class: l.u5e0
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165634h(R$string.f19455m9);
            }
        }));
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m199841i(Act act, String str, String str2, boolean z, IntlThirdQuickLoginEnvelope intlThirdQuickLoginEnvelope) {
        HashMap<String, String> map = new HashMap<>();
        map.put("step", "4");
        map.put("available", m199839h(act) + "");
        map.put("code", intlThirdQuickLoginEnvelope.meta.code + "");
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        map.put("tracker", str);
        m199844l(str2, map);
        if (!m199839h(act) || intlThirdQuickLoginEnvelope.meta.code != 200000) {
            o1j0.m165634h(R$string.f19455m9);
            return;
        }
        IntlThirdQuickLoginData intlThirdQuickLoginData = intlThirdQuickLoginEnvelope.data;
        if (z) {
            m199842j(act, str2, intlThirdQuickLoginData.code);
        } else {
            m199843k(act, str2, intlThirdQuickLoginData.code);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m199842j(Act act, String str, String str2) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        act.startActivity(new Intent("android.intent.action.VIEW").setData(builderBuildUpon.appendQueryParameter("serverCode", str2).build()));
    }

    /* JADX INFO: renamed from: k */
    public final void m199843k(Act act, String str, String str2) {
        act.startActivity(xwa.m213301A(act, "", Uri.parse(str).buildUpon().appendQueryParameter("serverCode", str2).build().toString(), true, false, false));
    }

    /* JADX INFO: renamed from: l */
    public final void m199844l(String str, HashMap<String, String> map) {
        i4g0.m138495D("e_intl_inner_web_jump", "p_suggest_users_home_view", jyb.m147494Y("url", str), jyb.m147494Y(CommandMessage.PARAMS, map));
    }
}
