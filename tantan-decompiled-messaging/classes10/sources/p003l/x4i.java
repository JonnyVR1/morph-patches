package p003l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.p000p1.mobile.putong.core.data.CoreData;
import com.p000p1.mobile.putong.core.data.PopGuide;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l.c4g0;
import l.e30;
import l.f6c0;
import l.jtk;
import l.l9b;
import l.mkd0;
import l.mqi0;
import l.ptk;
import l.qib0;
import l.t100;
import l.u4c0;
import l.upa;
import l.vwb;
import l.w9j;
import l.xdl0;
import rx.subjects.a;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class x4i {

    /* JADX INFO: renamed from: a */
    public static String f8358a = "bubble_feed_tab_guide";

    /* JADX INFO: renamed from: b */
    public static int f8359b = 24;

    /* JADX INFO: renamed from: c */
    public static a<PopGuide> f8360c = a.b();

    /* JADX INFO: renamed from: d */
    public static boolean f8361d = false;

    /* JADX INFO: renamed from: e */
    public static String f8362e = "";

    /* JADX INFO: renamed from: f */
    public static int f8363f = -1;

    /* JADX INFO: renamed from: g */
    public static boolean f8364g = true;

    /* JADX INFO: renamed from: h */
    public static boolean f8365h = false;

    /* JADX INFO: renamed from: i */
    public static c4g0 f8366i;

    /* JADX INFO: renamed from: l.x4i$a */
    public class C3471a extends TypeToken<List<Long>> {
    }

    /* JADX INFO: renamed from: l.x4i$b */
    public class C3472b implements w9j<Long, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f8367a;

        public C3472b(long j) {
            this.f8367a = j;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Long l2) {
            return Boolean.valueOf(l9b.R(l2.longValue(), this.f8367a) > upa.W());
        }
    }

    /* JADX INFO: renamed from: l.x4i$c */
    public class C3473c implements e30<Envelope> {
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Envelope envelope) {
            if (envelope.meta.code == 200) {
                CoreData coreData = (CoreData) envelope.data.getModuleData(CoreData.class);
                if (NullChecker.a(coreData)) {
                    PopGuide popGuide = coreData.popGuide;
                    CoreModule.c.e0.U2.put(Long.valueOf(popGuide.nextRequestTimestamp));
                    if (TextUtils.isEmpty(popGuide.userId) || TextUtils.isEmpty(popGuide.guide)) {
                        return;
                    }
                    x4i.f8360c.onNext(coreData.popGuide);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.x4i$e */
    public class C3475e implements jtk.b {
        /* JADX INFO: renamed from: a */
        public void m10643a(String str) {
            if (x4i.f8365h) {
                x4i.f8365h = false;
            } else {
                x4i.m10636c();
            }
        }
    }

    /* JADX INFO: renamed from: l.x4i$f */
    public class C3476f implements jtk.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f8368a;

        public C3476f(Act act) {
            this.f8368a = act;
        }

        /* JADX INFO: renamed from: a */
        public void m10644a(String str) {
            x4i.f8365h = true;
            NewMainAct newMainAct = this.f8368a;
            if (newMainAct instanceof NewMainAct) {
                newMainAct.N5(TabName.Moment);
            }
            x4i.m10637d();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m10634a(long j) {
        Gson gson = new Gson();
        List arrayList = new ArrayList();
        String str = (String) CoreModule.c.e0.S2.get();
        if (!TextUtils.isEmpty(str)) {
            arrayList = (List) gson.fromJson(str, new C3471a().getType());
        }
        arrayList.add(Long.valueOf(j));
        Collections.sort(arrayList);
        vwb.d0(arrayList, new C3472b(((Long) arrayList.get(arrayList.size() - 1)).longValue()));
        if (arrayList.size() >= upa.X()) {
            CoreModule.c.e0.T2.put(Long.valueOf(j + (((long) upa.Y()) * 3600000)));
        }
        CoreModule.c.e0.S2.put(gson.toJson(arrayList));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10635b() {
        return ((mqi0.o() > ((Long) CoreModule.c.e0.U2.get()).longValue() ? 1 : (mqi0.o() == ((Long) CoreModule.c.e0.U2.get()).longValue() ? 0 : -1)) > 0) && !mqi0.D(((Long) CoreModule.c.e0.Q2.get()).longValue()) && (l9b.Q(((Long) CoreModule.c.e0.R2.get()).longValue()) > f8359b) && ((mqi0.o() > ((Long) CoreModule.c.e0.T2.get()).longValue() ? 1 : (mqi0.o() == ((Long) CoreModule.c.e0.T2.get()).longValue() ? 0 : -1)) > 0);
    }

    /* JADX INFO: renamed from: c */
    public static void m10636c() {
        f8361d = false;
        f8362e = "";
        f8363f = -1;
    }

    /* JADX INFO: renamed from: d */
    public static void m10637d() {
        ptk.h().g(f8358a);
    }

    /* JADX INFO: renamed from: e */
    public static void m10638e(Act act) {
        mkd0.z(f8366i);
        f8366i = act.duringCreated(CoreModule.c.e0.m7()).take(1).subscribe(mkd0.H(new C3473c(), new C3474d()));
    }

    /* JADX INFO: renamed from: f */
    public static void m10639f(Act act, ViewGroup viewGroup, View view, PopGuide popGuide) {
        if (act == null || view == null || popGuide == null || !(act instanceof NewMainAct) || !((NewMainAct) act).f6(TabName.Card)) {
            return;
        }
        f8362e = popGuide.userId;
        f8363f = popGuide.reason;
        View viewInflate = act.getLayoutInflater().inflate(f6c0.m3, (ViewGroup) null, false);
        ((TextView) viewInflate.findViewById(u4c0.Pd)).setText(popGuide.guide);
        VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(u4c0.L5);
        if (TextUtils.isEmpty(popGuide.icon)) {
            xdl0.M(vDraweeViewFindViewById, false);
        } else {
            xdl0.M(vDraweeViewFindViewById, true);
            qib0.G.N0(vDraweeViewFindViewById, popGuide.icon, false);
        }
        ptk.h().g(f8358a);
        jtk jtkVar = new jtk(act);
        jtkVar.j(viewInflate).e(new int[]{-98787}).h(75).t(13).o(-t100.d(8.0f)).a(5000L).s(t100.d(10.0f), t100.d(10.0f), t100.d(10.0f), t100.d(10.0f)).b(new C3476f(act)).d(new C3475e()).p(t100.i).f(t100.d(7.0f)).i(jtk.D | jtk.E);
        f8358a = ptk.h().r(jtkVar, view, viewGroup);
        f8361d = true;
        CoreModule.c.e0.R2.put(Long.valueOf(mqi0.o()));
        m10634a(mqi0.o());
        o6j0.m8408h("e_leadtocommunity", "p_suggest_users_home_view", o6j0.C3390a.m8422h("leadtocommunity_uid", popGuide.userId), o6j0.C3390a.m8420f("leadtocommunity_reason", popGuide.reason));
    }

    /* JADX INFO: renamed from: l.x4i$d */
    public class C3474d implements e30<Throwable> {
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }
}
