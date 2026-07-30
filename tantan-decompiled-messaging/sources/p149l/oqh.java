package p149l;

import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.newui.home.C7994d;
import com.p046p1.mobile.putong.core.newui.poi.FeedPoiTraceFrag;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.p046p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UssTags;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class oqh extends jq2<qqh> {

    /* JADX INFO: renamed from: a */
    public rqh f145151a;

    /* JADX INFO: renamed from: b */
    public FeedPoiTraceFrag f145152b;

    /* JADX INFO: renamed from: c */
    public boolean f145153c;

    /* JADX INFO: renamed from: d */
    public HashSet<String> f145154d;

    /* JADX INFO: renamed from: e */
    public Runnable f145155e;

    public oqh(FeedPoiTraceFrag feedPoiTraceFrag) {
        super(feedPoiTraceFrag);
        this.f145153c = true;
        this.f145154d = new HashSet<>();
        this.f145155e = new Runnable() { // from class: l.eqh
            @Override // java.lang.Runnable
            public final void run() {
                this.f92801a.m165429E0();
            }
        };
        this.f145152b = feedPoiTraceFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m165429E0() {
        this.f145153c = false;
        HashMap map = new HashMap();
        map.put("sourcepage", dcl.f85441J);
        map.put("actiontype", dcl.f85442K);
        final User user = this.f145151a.f160643a.f85198b;
        CoreModule.f17545c.f19663m0.m31071Y5(user, map).subscribe(mkd0.m154956H(new e30() { // from class: l.lqh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129338a.m165445C0(user, (Relationship) obj);
            }
        }, new e30() { // from class: l.mqh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135239a.m165446D0(user, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I0 */
    private void m165430I0(final ArrayList<Media> arrayList, final String str) {
        if (vwb.m200296J(arrayList)) {
            return;
        }
        this.f145152b.m20595o4(R$string.f17842J5);
        ya5.m213793I(arrayList, "profile").compose(mkd0.m154951C()).flatMap(new w9j() { // from class: l.fqh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return oqh.m165438k0((List) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.gqh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103938a.m165447F0(arrayList, str, (roj0) obj);
            }
        }, new e30() { // from class: l.hqh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109058a.m165448G0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J0 */
    private boolean m165431J0() {
        return NullChecker.m81303a(this.f145151a);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m165436i0() {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ C22306c m165438k0(List list) {
        User user = new User();
        ArrayList arrayList = new ArrayList(CoreModule.f17545c.f19639e0.m169527p9().pictures);
        arrayList.remove(0);
        arrayList.add(0, (Media) list.get(0));
        user.pictures = arrayList;
        return CoreModule.f17545c.f19639e0.m169547u9(user);
    }

    /* JADX INFO: renamed from: t0 */
    private void m165442t0() {
        cxf.m109094f().m109096e(duringCreated(CoreModule.f17545c.f19639e0.m169523o9()), act(), this.f145152b, 115);
    }

    /* JADX INFO: renamed from: u0 */
    private void m165443u0() {
        duringCreated(CoreModule.f17545c.f19678r0.f20028i0).subscribe(mkd0.m154955G(new e30() { // from class: l.kqh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124268a.m165444A0((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m165444A0(String str) {
        this.f145154d.add(str);
        if (ogl0.m164242U() && lifecycle_() == C4319c.f15548i && NullChecker.m81303a(this.viewModel)) {
            ((qqh) this.viewModel).m175911c();
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m165445C0(User user, Relationship relationship) {
        m165452q0();
        m165450o0();
        C7994d c7994dM155806b = mph.m155806b("p_poi_nearby_card", user.f56011id);
        UssTags ussTags = user.ussTags;
        c7994dM155806b.m38487v(ussTags == null ? "" : ussTags.eventInfo);
        this.f145152b.mo43130k2(c7994dM155806b, "success");
        this.f145153c = true;
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m165446D0(User user, Throwable th) {
        this.f145152b.mo43128a2(mph.m155806b("p_poi_nearby_card", user.f56011id), th);
        this.f145153c = true;
        lsi0.m151570H(act().getResources().getString(R$string.f18804oq), act().getResources().getDrawable(x2c0.f190665vu), act().getResources().getDrawable(x2c0.f190662vr));
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m165447F0(ArrayList arrayList, String str, roj0 roj0Var) {
        this.f145152b.m20599s4();
        CoreModule.f17545c.f19639e0.m169552va(App.f15373i.get().intValue());
        ark.m98453V0(act(), false, (Media) arrayList.get(0), act().string(R$string.f18491el), new Runnable() { // from class: l.nqh
            @Override // java.lang.Runnable
            public final void run() {
                oqh.m165436i0();
            }
        });
        if (TextUtils.equals(str, "fake_to_good_dlg")) {
            ygh0.m214648G();
        } else if (TextUtils.equals(str, "fakeView")) {
            ygh0.m214703v();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m165448G0(Throwable th) {
        this.f145152b.m20599s4();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: H0 */
    public void m165449H0(int i, int i2, Intent intent) {
        if (i == 115 && i2 == -1) {
            m165430I0((ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h), intent.getStringExtra("from"));
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        m165453r0();
        m165442t0();
        m165443u0();
    }

    /* JADX INFO: renamed from: o0 */
    public void m165450o0() {
        this.f145151a = null;
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m165451p0() {
        boolean z;
        int size;
        if (!m165431J0()) {
            xnj0.m210172a(act());
            return false;
        }
        User user = this.f145151a.f160643a.f85198b;
        C7994d c7994dM155806b = mph.m155806b("p_poi_nearby_card", user.f56011id);
        UssTags ussTags = user.ussTags;
        String str = "";
        c7994dM155806b.m38487v(ussTags == null ? "" : ussTags.eventInfo);
        if (CoreModule.f17545c.f19639e0.m169527p9().isJailed()) {
            CoreModule.m29932K().startJailedDialogLikeAct();
            this.f145152b.mo43130k2(c7994dM155806b, "failJailedUser");
            return false;
        }
        if (!this.f145153c) {
            return false;
        }
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        CounterLikeLimit counterLikeLimit = counterM31484o3.likeLimit;
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM31484o3.undoLimit;
        if ((((long) (counterSuperlikeAndUndoLimit.reset * 1000)) + counterLikeLimit.serverTime) - qib0.f154693H.guessedCurrentServerTime() <= 0 || counterSuperlikeAndUndoLimit.remainToday() != 0) {
            this.f145155e.run();
            z = true;
        } else {
            C8764c.m53412M1(act(), "p_home,undo", Privilege.vip_undo, null, null, false, user);
            z = false;
        }
        boolean z2 = z;
        if (!z) {
            if (NullChecker.m81303a(user) && NullChecker.m81303a(user.pictures) && user.pictures.size() > 0) {
                str = user.pictures.get(0).url;
                size = user.pictures.size();
            } else {
                size = 0;
            }
            c7994dM155806b.m38461B(str);
            c7994dM155806b.m38491z(0);
            c7994dM155806b.m38460A(size);
            this.f145152b.mo43130k2(c7994dM155806b, "failUndoLocal");
        }
        return z2;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m165452q0() {
        if (((qqh) this.viewModel).m175914f() == null) {
            return;
        }
        rqh rqhVar = this.f145151a;
        rqhVar.f160643a.m110579a(rqhVar.f160644b);
        ((qqh) this.viewModel).m175914f().m100905n(this.f145151a.f160643a);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m165453r0() {
        duringCreated(CoreModule.m29934N().mo60336Z6(this.f145152b.f26365C)).subscribe(mkd0.m154956H(new e30() { // from class: l.iqh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114506a.m165456y0((Envelope) obj);
            }
        }, new e30() { // from class: l.jqh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119280a.m165457z0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m165454s0() {
        return this.f145154d.size() > 0;
    }

    /* JADX INFO: renamed from: x0 */
    public boolean m165455x0(String str) {
        return this.f145154d.contains(str);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m165456y0(Envelope envelope) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(envelope) && NullChecker.m81303a(envelope.data)) {
            CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
            List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            List<CoreMomentInfo> list2 = coreData.moments;
            List<BubbleInfo> list3 = coreData.states;
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            if (!vwb.m200296J(list2)) {
                for (CoreMomentInfo coreMomentInfo : list2) {
                    map.put(coreMomentInfo.owner, coreMomentInfo);
                }
            }
            if (!vwb.m200296J(list3)) {
                for (BubbleInfo bubbleInfo : list3) {
                    map2.put(bubbleInfo.owner.f38803id, bubbleInfo);
                }
            }
            if (!vwb.m200296J(list)) {
                for (User user : list) {
                    CoreMomentInfo coreMomentInfo2 = (CoreMomentInfo) map.get(user.f56011id);
                    BubbleInfo bubbleInfo2 = (BubbleInfo) map2.get(user.f56011id);
                    if (NullChecker.m81303a(coreMomentInfo2)) {
                        arrayList.add(new da80(user, coreMomentInfo2, bubbleInfo2, null));
                    }
                }
            }
        }
        if (vwb.m200296J(arrayList)) {
            this.f145152b.m43125Q4();
        } else {
            ((qqh) this.viewModel).m175920q(arrayList);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m165457z0(Throwable th) {
        this.f145152b.m43125Q4();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
