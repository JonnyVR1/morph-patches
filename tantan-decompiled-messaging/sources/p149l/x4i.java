package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.PopGuide;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p133rx.subjects.C22392a;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class x4i {

    /* JADX INFO: renamed from: a */
    public static String f191025a = "bubble_feed_tab_guide";

    /* JADX INFO: renamed from: b */
    public static int f191026b = 24;

    /* JADX INFO: renamed from: c */
    public static C22392a<PopGuide> f191027c = C22392a.m221512b();

    /* JADX INFO: renamed from: d */
    public static boolean f191028d = false;

    /* JADX INFO: renamed from: e */
    public static String f191029e = "";

    /* JADX INFO: renamed from: f */
    public static int f191030f = -1;

    /* JADX INFO: renamed from: g */
    public static boolean f191031g = true;

    /* JADX INFO: renamed from: h */
    public static boolean f191032h = false;

    /* JADX INFO: renamed from: i */
    public static c4g0 f191033i;

    /* JADX INFO: renamed from: l.x4i$a */
    public class C21026a extends TypeToken<List<Long>> {
    }

    /* JADX INFO: renamed from: l.x4i$b */
    public class C21027b implements w9j<Long, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f191034a;

        public C21027b(long j) {
            this.f191034a = j;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Long l2) {
            return Boolean.valueOf(l9b.m149009R(l2.longValue(), this.f191034a) > upa.m194708W());
        }
    }

    /* JADX INFO: renamed from: l.x4i$c */
    public class C21028c implements e30<Envelope> {
        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Envelope envelope) {
            if (envelope.meta.code == 200) {
                CoreData coreData = (CoreData) envelope.data.getModuleData(CoreData.class);
                if (NullChecker.m81303a(coreData)) {
                    PopGuide popGuide = coreData.popGuide;
                    CoreModule.f17545c.f19639e0.f149280U2.put(Long.valueOf(popGuide.nextRequestTimestamp));
                    if (TextUtils.isEmpty(popGuide.userId) || TextUtils.isEmpty(popGuide.guide)) {
                        return;
                    }
                    x4i.f191027c.m132487l(coreData.popGuide);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.x4i$e */
    public class C21030e implements jtk.InterfaceC17857b {
        @Override // p149l.jtk.InterfaceC17857b
        /* JADX INFO: renamed from: a */
        public void mo135260a(String str) {
            if (x4i.f191032h) {
                x4i.f191032h = false;
            } else {
                x4i.m206976c();
            }
        }
    }

    /* JADX INFO: renamed from: l.x4i$f */
    public class C21031f implements jtk.InterfaceC17856a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f191035a;

        public C21031f(Act act) {
            this.f191035a = act;
        }

        @Override // p149l.jtk.InterfaceC17856a
        /* JADX INFO: renamed from: a */
        public void mo125326a(String str) {
            x4i.f191032h = true;
            Act act = this.f191035a;
            if (act instanceof NewMainAct) {
                ((NewMainAct) act).m39786N5(TabName.Moment);
            }
            x4i.m206977d();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m206974a(long j) {
        Gson gson = new Gson();
        List arrayList = new ArrayList();
        String str = CoreModule.f17545c.f19639e0.f149264S2.get();
        if (!TextUtils.isEmpty(str)) {
            arrayList = (List) gson.fromJson(str, new C21026a().getType());
        }
        arrayList.add(Long.valueOf(j));
        Collections.sort(arrayList);
        vwb.m200320d0(arrayList, new C21027b(((Long) arrayList.get(arrayList.size() - 1)).longValue()));
        if (arrayList.size() >= upa.m194712X()) {
            CoreModule.f17545c.f19639e0.f149272T2.put(Long.valueOf(j + (((long) upa.m194716Y()) * 3600000)));
        }
        CoreModule.f17545c.f19639e0.f149264S2.put(gson.toJson(arrayList));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m206975b() {
        return ((mqi0.m155944o() > CoreModule.f17545c.f19639e0.f149280U2.get().longValue() ? 1 : (mqi0.m155944o() == CoreModule.f17545c.f19639e0.f149280U2.get().longValue() ? 0 : -1)) > 0) && !mqi0.m155929D(CoreModule.f17545c.f19639e0.f149248Q2.get().longValue()) && (l9b.m149008Q(CoreModule.f17545c.f19639e0.f149256R2.get().longValue()) > f191026b) && ((mqi0.m155944o() > CoreModule.f17545c.f19639e0.f149272T2.get().longValue() ? 1 : (mqi0.m155944o() == CoreModule.f17545c.f19639e0.f149272T2.get().longValue() ? 0 : -1)) > 0);
    }

    /* JADX INFO: renamed from: c */
    public static void m206976c() {
        f191028d = false;
        f191029e = "";
        f191030f = -1;
    }

    /* JADX INFO: renamed from: d */
    public static void m206977d() {
        ptk.m171332h().m171334g(f191025a);
    }

    /* JADX INFO: renamed from: e */
    public static void m206978e(Act act) {
        mkd0.m154992z(f191033i);
        f191033i = act.duringCreated(CoreModule.f17545c.f19639e0.m169513m7()).take(1).subscribe(mkd0.m154956H(new C21028c(), new C21029d()));
    }

    /* JADX INFO: renamed from: f */
    public static void m206979f(Act act, ViewGroup viewGroup, View view, PopGuide popGuide) {
        if (act == null || view == null || popGuide == null || !(act instanceof NewMainAct) || !((NewMainAct) act).m39814f6(TabName.Card)) {
            return;
        }
        f191029e = popGuide.userId;
        f191030f = popGuide.reason;
        View viewInflate = act.getLayoutInflater().inflate(f6c0.f95889m3, (ViewGroup) null, false);
        ((TextView) viewInflate.findViewById(u4c0.f173985Pd)).setText(popGuide.guide);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f173909L5);
        if (TextUtils.isEmpty(popGuide.icon)) {
            xdl0.m208344M(vDraweeView, false);
        } else {
            xdl0.m208344M(vDraweeView, true);
            qib0.f154691G.m102335N0(vDraweeView, popGuide.icon, false);
        }
        ptk.m171332h().m171334g(f191025a);
        jtk jtkVar = new jtk(act);
        jtkVar.m143118j(viewInflate).m143113e(-98787).m143116h(75).m143128t(13).m143123o(-t100.m186890d(8.0f)).m143109a(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m143127s(t100.m186890d(10.0f), t100.m186890d(10.0f), t100.m186890d(10.0f), t100.m186890d(10.0f)).m143110b(new C21031f(act)).m143112d(new C21030e()).m143124p(t100.f167260i).m143114f(t100.m186890d(7.0f)).m143117i(jtk.f119617D | jtk.f119618E);
        f191025a = ptk.m171332h().m171344r(jtkVar, view, viewGroup);
        f191028d = true;
        CoreModule.f17545c.f19639e0.f149256R2.put(Long.valueOf(mqi0.m155944o()));
        m206974a(mqi0.m155944o());
        o6j0.m162864h("e_leadtocommunity", "p_suggest_users_home_view", o6j0.C18854a.m162878h("leadtocommunity_uid", popGuide.userId), o6j0.C18854a.m162876f("leadtocommunity_reason", popGuide.reason));
    }

    /* JADX INFO: renamed from: l.x4i$d */
    public class C21029d implements e30<Throwable> {
        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }
}
