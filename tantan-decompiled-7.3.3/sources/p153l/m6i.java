package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.PopGuide;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p137rx.subjects.C22507a;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class m6i {

    /* JADX INFO: renamed from: a */
    public static String f134999a = "bubble_feed_tab_guide";

    /* JADX INFO: renamed from: b */
    public static int f135000b = 24;

    /* JADX INFO: renamed from: c */
    public static C22507a<PopGuide> f135001c = C22507a.m222758b();

    /* JADX INFO: renamed from: d */
    public static boolean f135002d = false;

    /* JADX INFO: renamed from: e */
    public static String f135003e = "";

    /* JADX INFO: renamed from: f */
    public static int f135004f = -1;

    /* JADX INFO: renamed from: g */
    public static boolean f135005g = true;

    /* JADX INFO: renamed from: h */
    public static boolean f135006h = false;

    /* JADX INFO: renamed from: i */
    public static kcg0 f135007i;

    /* JADX INFO: renamed from: l.m6i$a */
    public class C18553a extends TypeToken<List<Long>> {
    }

    /* JADX INFO: renamed from: l.m6i$b */
    public class C18554b implements qcj<Long, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f135008a;

        public C18554b(long j) {
            this.f135008a = j;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Long l2) {
            return Boolean.valueOf(yab.m214861R(l2.longValue(), this.f135008a) > gra.m131639W());
        }
    }

    /* JADX INFO: renamed from: l.m6i$c */
    public class C18555c implements y20<Envelope> {
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Envelope envelope) {
            if (envelope.meta.code == 200) {
                CoreData coreData = (CoreData) envelope.data.getModuleData(CoreData.class);
                if (NullChecker.m82486a(coreData)) {
                    PopGuide popGuide = coreData.popGuide;
                    CoreModule.f18264c.f20381e0.f89137U2.put(Long.valueOf(popGuide.nextRequestTimestamp));
                    if (TextUtils.isEmpty(popGuide.userId) || TextUtils.isEmpty(popGuide.guide)) {
                        return;
                    }
                    m6i.f135001c.m137019l(coreData.popGuide);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.m6i$e */
    public class C18557e implements zvk.InterfaceC21906b {
        @Override // p153l.zvk.InterfaceC21906b
        /* JADX INFO: renamed from: a */
        public void mo96261a(String str) {
            if (m6i.f135006h) {
                m6i.f135006h = false;
            } else {
                m6i.m157228c();
            }
        }
    }

    /* JADX INFO: renamed from: l.m6i$f */
    public class C18558f implements zvk.InterfaceC21905a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f135009a;

        public C18558f(Act act) {
            this.f135009a = act;
        }

        @Override // p153l.zvk.InterfaceC21905a
        /* JADX INFO: renamed from: a */
        public void mo102709a(String str) {
            m6i.f135006h = true;
            Act act = this.f135009a;
            if (act instanceof NewMainAct) {
                ((NewMainAct) act).m40796R5(TabName.Moment);
            }
            m6i.m157229d();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m157226a(long j) {
        Gson gson = new Gson();
        List arrayList = new ArrayList();
        String str = CoreModule.f18264c.f20381e0.f89121S2.get();
        if (!TextUtils.isEmpty(str)) {
            arrayList = (List) gson.fromJson(str, new C18553a().getType());
        }
        arrayList.add(Long.valueOf(j));
        Collections.sort(arrayList);
        jyb.m147503d0(arrayList, new C18554b(((Long) arrayList.get(arrayList.size() - 1)).longValue()));
        if (arrayList.size() >= gra.m131643X()) {
            CoreModule.f18264c.f20381e0.f89129T2.put(Long.valueOf(j + (((long) gra.m131647Y()) * 3600000)));
        }
        CoreModule.f18264c.f20381e0.f89121S2.put(gson.toJson(arrayList));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m157227b() {
        return ((pzi0.m174454o() > CoreModule.f18264c.f20381e0.f89137U2.get().longValue() ? 1 : (pzi0.m174454o() == CoreModule.f18264c.f20381e0.f89137U2.get().longValue() ? 0 : -1)) > 0) && !pzi0.m174439D(CoreModule.f18264c.f20381e0.f89105Q2.get().longValue()) && (yab.m214860Q(CoreModule.f18264c.f20381e0.f89113R2.get().longValue()) > f135000b) && ((pzi0.m174454o() > CoreModule.f18264c.f20381e0.f89129T2.get().longValue() ? 1 : (pzi0.m174454o() == CoreModule.f18264c.f20381e0.f89129T2.get().longValue() ? 0 : -1)) > 0);
    }

    /* JADX INFO: renamed from: c */
    public static void m157228c() {
        f135002d = false;
        f135003e = "";
        f135004f = -1;
    }

    /* JADX INFO: renamed from: d */
    public static void m157229d() {
        fwk.m127777h().m127779g(f134999a);
    }

    /* JADX INFO: renamed from: e */
    public static void m157230e(Act act) {
        psd0.m173633z(f135007i);
        f135007i = act.duringCreated(CoreModule.f18264c.f20381e0.m116586m7()).take(1).subscribe(psd0.m173597H(new C18555c(), new C18556d()));
    }

    /* JADX INFO: renamed from: f */
    public static void m157231f(Act act, ViewGroup viewGroup, View view, PopGuide popGuide) {
        if (act == null || view == null || popGuide == null || !(act instanceof NewMainAct) || !((NewMainAct) act).m40822j6(TabName.Card)) {
            return;
        }
        f135003e = popGuide.userId;
        f135004f = popGuide.reason;
        View viewInflate = act.getLayoutInflater().inflate(kec0.f125943m3, (ViewGroup) null, false);
        ((TextView) viewInflate.findViewById(adc0.f70124Sd)).setText(popGuide.guide);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(adc0.f70031N5);
        if (TextUtils.isEmpty(popGuide.icon)) {
            bnl0.m105524M(vDraweeView, false);
        } else {
            bnl0.m105524M(vDraweeView, true);
            uqb0.f180374G.m127119N0(vDraweeView, popGuide.icon, false);
        }
        fwk.m127777h().m127779g(f134999a);
        zvk zvkVar = new zvk(act);
        zvkVar.m221765j(viewInflate).m221760e(-98787).m221763h(75).m221775t(13).m221770o(-qa00.m175859d(8.0f)).m221756a(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m221774s(qa00.m175859d(10.0f), qa00.m175859d(10.0f), qa00.m175859d(10.0f), qa00.m175859d(10.0f)).m221757b(new C18558f(act)).m221759d(new C18557e()).m221771p(qa00.f156322i).m221761f(qa00.m175859d(7.0f)).m221764i(zvk.f206227D | zvk.f206228E);
        f134999a = fwk.m127777h().m127789r(zvkVar, view, viewGroup);
        f135002d = true;
        CoreModule.f18264c.f20381e0.f89113R2.put(Long.valueOf(pzi0.m174454o()));
        m157226a(pzi0.m174454o());
        sfj0.m185601h("e_leadtocommunity", "p_suggest_users_home_view", sfj0.C20032a.m185615h("leadtocommunity_uid", popGuide.userId), sfj0.C20032a.m185613f("leadtocommunity_reason", popGuide.reason));
    }

    /* JADX INFO: renamed from: l.m6i$d */
    public class C18556d implements y20<Throwable> {
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }
}
