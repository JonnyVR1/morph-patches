package p009l;

import android.content.Intent;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.home.C0158d;
import com.p000p1.mobile.putong.core.newui.poi.FeedPoiTraceFrag;
import com.p000p1.mobile.putong.p004ui.mediapicker.MediaPickerBaseAct;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UssTags;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import l.ark;
import l.cxf;
import l.d30;
import l.e30;
import l.jq2;
import l.lsi0;
import l.mkd0;
import l.ogl0;
import l.qib0;
import l.roj0;
import l.vwb;
import l.w9j;
import l.x2c0;
import l.xnj0;
import l.ya5;
import l.ygh0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class oqh extends jq2<qqh> {

    /* JADX INFO: renamed from: a */
    public rqh f18207a;

    /* JADX INFO: renamed from: b */
    public FeedPoiTraceFrag f18208b;

    /* JADX INFO: renamed from: c */
    public boolean f18209c;

    /* JADX INFO: renamed from: d */
    public HashSet<String> f18210d;

    /* JADX INFO: renamed from: e */
    public Runnable f18211e;

    public oqh(FeedPoiTraceFrag feedPoiTraceFrag) {
        super(feedPoiTraceFrag);
        this.f18209c = true;
        this.f18210d = new HashSet<>();
        this.f18211e = new Runnable() { // from class: l.eqh
            @Override // java.lang.Runnable
            public final void run() {
                this.f12660a.m19979E0();
            }
        };
        this.f18208b = feedPoiTraceFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m19979E0() {
        this.f18209c = false;
        HashMap map = new HashMap();
        map.put("sourcepage", dcl.f11729J);
        map.put("actiontype", dcl.f11730K);
        final User user = this.f18207a.f19947a.f11695b;
        CoreModule.c.m0.Y5(user, map).subscribe(mkd0.H(new e30() { // from class: l.lqh
            public final void call(Object obj) {
                this.f16301a.m19995C0(user, (Relationship) obj);
            }
        }, new e30() { // from class: l.mqh
            public final void call(Object obj) {
                this.f17023a.m19996D0(user, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I0 */
    private void m19980I0(final ArrayList<Media> arrayList, final String str) {
        if (vwb.J(arrayList)) {
            return;
        }
        this.f18208b.o4(R.string.J5);
        ya5.I(arrayList, "profile").compose(mkd0.C()).flatMap(new w9j() { // from class: l.fqh
            public final Object call(Object obj) {
                return oqh.m19988k0((List) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.gqh
            public final void call(Object obj) {
                this.f13690a.m19997F0(arrayList, str, (roj0) obj);
            }
        }, new e30() { // from class: l.hqh
            public final void call(Object obj) {
                this.f14219a.m19998G0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J0 */
    private boolean m19981J0() {
        return NullChecker.a(this.f18207a);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m19986i0() {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ c m19988k0(List list) {
        User user = new User();
        ArrayList arrayList = new ArrayList(CoreModule.c.e0.p9().pictures);
        arrayList.remove(0);
        arrayList.add(0, (Media) list.get(0));
        user.pictures = arrayList;
        return CoreModule.c.e0.u9(user);
    }

    /* JADX INFO: renamed from: t0 */
    private void m19992t0() {
        cxf.f().e(duringCreated(CoreModule.c.e0.o9()), act(), this.f18208b, 115);
    }

    /* JADX INFO: renamed from: u0 */
    private void m19993u0() {
        duringCreated(CoreModule.c.r0.i0).subscribe(mkd0.G(new e30() { // from class: l.kqh
            public final void call(Object obj) {
                this.f15811a.m19994A0((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m19994A0(String str) {
        this.f18210d.add(str);
        if (ogl0.U() && lifecycle_() == com.p1.mobile.android.app.c.i && NullChecker.a(((jq2) this).viewModel)) {
            ((qqh) ((jq2) this).viewModel).m21162c();
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m19995C0(User user, Relationship relationship) {
        m20003q0();
        m20001o0();
        C0158d c0158dM18530b = mph.m18530b("p_poi_nearby_card", ((DbObject) user).id);
        UssTags ussTags = user.ussTags;
        c0158dM18530b.m2465v(ussTags == null ? "" : ussTags.eventInfo);
        this.f18208b.mo7345k2(c0158dM18530b, "success");
        this.f18209c = true;
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m19996D0(User user, Throwable th) {
        this.f18208b.mo7340a2(mph.m18530b("p_poi_nearby_card", ((DbObject) user).id), th);
        this.f18209c = true;
        lsi0.H(act().getResources().getString(R.string.oq), act().getResources().getDrawable(x2c0.vu), act().getResources().getDrawable(x2c0.vr));
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m19997F0(ArrayList arrayList, String str, roj0 roj0Var) {
        this.f18208b.s4();
        CoreModule.c.e0.va(((Integer) App.i.get()).intValue());
        ark.V0(act(), false, (Media) arrayList.get(0), act().string(R.string.el), new Runnable() { // from class: l.nqh
            @Override // java.lang.Runnable
            public final void run() {
                oqh.m19986i0();
            }
        });
        if (TextUtils.equals(str, "fake_to_good_dlg")) {
            ygh0.G();
        } else if (TextUtils.equals(str, "fakeView")) {
            ygh0.v();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m19998G0(Throwable th) {
        this.f18208b.s4();
        yij0.m25382D(th);
    }

    /* JADX INFO: renamed from: H0 */
    public void m19999H0(int i, int i2, Intent intent) {
        if (i == 115 && i2 == -1) {
            m19980I0((ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f8209h), intent.getStringExtra("from"));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m20000a0() {
        super.a0();
        m20004r0();
        m19992t0();
        m19993u0();
    }

    /* JADX INFO: renamed from: o0 */
    public void m20001o0() {
        this.f18207a = null;
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m20002p0() {
        boolean z;
        int size;
        if (!m19981J0()) {
            xnj0.a(act());
            return false;
        }
        User user = this.f18207a.f19947a.f11695b;
        C0158d c0158dM18530b = mph.m18530b("p_poi_nearby_card", ((DbObject) user).id);
        UssTags ussTags = user.ussTags;
        String str = "";
        c0158dM18530b.m2465v(ussTags == null ? "" : ussTags.eventInfo);
        if (CoreModule.c.e0.p9().isJailed()) {
            CoreModule.K().startJailedDialogLikeAct();
            this.f18208b.mo7345k2(c0158dM18530b, "failJailedUser");
            return false;
        }
        if (!this.f18209c) {
            return false;
        }
        Counter counterO3 = CoreModule.c.o3();
        CounterLikeLimit counterLikeLimit = counterO3.likeLimit;
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterO3.undoLimit;
        if ((((long) (counterSuperlikeAndUndoLimit.reset * 1000)) + counterLikeLimit.serverTime) - qib0.H.guessedCurrentServerTime() <= 0 || counterSuperlikeAndUndoLimit.remainToday() != 0) {
            this.f18211e.run();
            z = true;
        } else {
            com.p1.mobile.putong.core.ui.purchase.c.M1(act(), "p_home,undo", Privilege.vip_undo, (d30) null, (d30) null, false, user);
            z = false;
        }
        boolean z2 = z;
        if (!z) {
            if (NullChecker.a(user) && NullChecker.a(user.pictures) && user.pictures.size() > 0) {
                str = ((Media) user.pictures.get(0)).url;
                size = user.pictures.size();
            } else {
                size = 0;
            }
            c0158dM18530b.m2439B(str);
            c0158dM18530b.m2469z(0);
            c0158dM18530b.m2438A(size);
            this.f18208b.mo7345k2(c0158dM18530b, "failUndoLocal");
        }
        return z2;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m20003q0() {
        if (((qqh) ((jq2) this).viewModel).m21165f() == null) {
            return;
        }
        rqh rqhVar = this.f18207a;
        rqhVar.f19947a.m13040a(rqhVar.f19948b);
        ((qqh) ((jq2) this).viewModel).m21165f().m11930n(this.f18207a.f19947a);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m20004r0() {
        duringCreated(CoreModule.N().Z6(this.f18208b.f5143C)).subscribe(mkd0.H(new e30() { // from class: l.iqh
            public final void call(Object obj) {
                this.f14768a.m20007y0((Envelope) obj);
            }
        }, new e30() { // from class: l.jqh
            public final void call(Object obj) {
                this.f15259a.m20008z0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m20005s0() {
        return this.f18210d.size() > 0;
    }

    /* JADX INFO: renamed from: x0 */
    public boolean m20006x0(String str) {
        return this.f18210d.contains(str);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m20007y0(Envelope envelope) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(envelope) && NullChecker.a(envelope.data)) {
            CoreData moduleData = envelope.getModuleData(CoreData.class);
            List<User> list = envelope.getModuleData(CommonData.class).users;
            List<CoreMomentInfo> list2 = moduleData.moments;
            List<BubbleInfo> list3 = moduleData.states;
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            if (!vwb.J(list2)) {
                for (CoreMomentInfo coreMomentInfo : list2) {
                    map.put(coreMomentInfo.owner, coreMomentInfo);
                }
            }
            if (!vwb.J(list3)) {
                for (BubbleInfo bubbleInfo : list3) {
                    map2.put(bubbleInfo.owner.id, bubbleInfo);
                }
            }
            if (!vwb.J(list)) {
                for (User user : list) {
                    CoreMomentInfo coreMomentInfo2 = (CoreMomentInfo) map.get(((DbObject) user).id);
                    BubbleInfo bubbleInfo2 = (BubbleInfo) map2.get(((DbObject) user).id);
                    if (NullChecker.a(coreMomentInfo2)) {
                        arrayList.add(new da80(user, coreMomentInfo2, bubbleInfo2, null));
                    }
                }
            }
        }
        if (vwb.J(arrayList)) {
            this.f18208b.m7337Q4();
        } else {
            ((qqh) ((jq2) this).viewModel).m21172q(arrayList);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m20008z0(Throwable th) {
        this.f18208b.m7337Q4();
    }

    public void destroy() {
    }
}
