package p153l;

import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.newui.home.C8145d;
import com.p051p1.mobile.putong.core.newui.poi.FeedPoiTraceFrag;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterLikeLimit;
import com.p051p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UssTags;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class dsh extends ar2<fsh> {

    /* JADX INFO: renamed from: a */
    public gsh f90479a;

    /* JADX INFO: renamed from: b */
    public FeedPoiTraceFrag f90480b;

    /* JADX INFO: renamed from: c */
    public boolean f90481c;

    /* JADX INFO: renamed from: d */
    public HashSet<String> f90482d;

    /* JADX INFO: renamed from: e */
    public Runnable f90483e;

    public dsh(FeedPoiTraceFrag feedPoiTraceFrag) {
        super(feedPoiTraceFrag);
        this.f90481c = true;
        this.f90482d = new HashSet<>();
        this.f90483e = new Runnable() { // from class: l.trh
            @Override // java.lang.Runnable
            public final void run() {
                this.f175879a.m117729E0();
            }
        };
        this.f90480b = feedPoiTraceFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m117729E0() {
        this.f90481c = false;
        HashMap map = new HashMap();
        map.put("sourcepage", tel.f173844J);
        map.put("actiontype", tel.f173845K);
        final User user = this.f90479a.f106278a.f121050b;
        CoreModule.f18264c.f20405m0.m32074Y5(user, map).subscribe(psd0.m173597H(new y20() { // from class: l.ash
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73116a.m117745C0(user, (Relationship) obj);
            }
        }, new y20() { // from class: l.bsh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78158a.m117746D0(user, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I0 */
    private void m117730I0(final ArrayList<Media> arrayList, final String str) {
        if (jyb.m147479J(arrayList)) {
            return;
        }
        this.f90480b.m21594o4(R$string.f18632L5);
        yb5.m214980I(arrayList, "profile").compose(psd0.m173592C()).flatMap(new qcj() { // from class: l.urh
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return dsh.m117738k0((List) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.vrh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185466a.m117747F0(arrayList, str, (uxj0) obj);
            }
        }, new y20() { // from class: l.wrh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190522a.m117748G0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J0 */
    private boolean m117731J0() {
        return NullChecker.m82486a(this.f90479a);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m117736i0() {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ C22421c m117738k0(List list) {
        User user = new User();
        ArrayList arrayList = new ArrayList(CoreModule.f18264c.f20381e0.m116600p9().pictures);
        arrayList.remove(0);
        arrayList.add(0, (Media) list.get(0));
        user.pictures = arrayList;
        return CoreModule.f18264c.f20381e0.m116620u9(user);
    }

    /* JADX INFO: renamed from: t0 */
    private void m117742t0() {
        qyf.m178643f().m178645e(duringCreated(CoreModule.f18264c.f20381e0.m116596o9()), act(), this.f90480b, 115);
    }

    /* JADX INFO: renamed from: u0 */
    private void m117743u0() {
        duringCreated(CoreModule.f18264c.f20420r0.f20770i0).subscribe(psd0.m173596G(new y20() { // from class: l.zrh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205760a.m117744A0((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m117744A0(String str) {
        this.f90482d.add(str);
        if (spl0.m187369U() && lifecycle_() == C4470c.f16267i && NullChecker.m82486a(this.viewModel)) {
            ((fsh) this.viewModel).m127182c();
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m117745C0(User user, Relationship relationship) {
        m117752q0();
        m117750o0();
        C8145d c8145dM106137b = brh.m106137b("p_poi_nearby_card", user.f56859id);
        UssTags ussTags = user.ussTags;
        c8145dM106137b.m39490v(ussTags == null ? "" : ussTags.eventInfo);
        this.f90480b.mo44141k2(c8145dM106137b, "success");
        this.f90481c = true;
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m117746D0(User user, Throwable th) {
        this.f90480b.mo44139a2(brh.m106137b("p_poi_nearby_card", user.f56859id), th);
        this.f90481c = true;
        o1j0.m165626H(act().getResources().getString(R$string.f18591Jq), act().getResources().getDrawable(dbc0.f87134jv), act().getResources().getDrawable(dbc0.f87131js));
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m117747F0(ArrayList arrayList, String str, uxj0 uxj0Var) {
        this.f90480b.m21598s4();
        CoreModule.f18264c.f20381e0.m116625va(App.f16092i.get().intValue());
        qtk.m178003V0(act(), false, (Media) arrayList.get(0), act().string(R$string.f18307Al), new Runnable() { // from class: l.csh
            @Override // java.lang.Runnable
            public final void run() {
                dsh.m117736i0();
            }
        });
        if (TextUtils.equals(str, "fake_to_good_dlg")) {
            fph0.m126636G();
        } else if (TextUtils.equals(str, "fakeView")) {
            fph0.m126691v();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m117748G0(Throwable th) {
        this.f90480b.m21598s4();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: H0 */
    public void m117749H0(int i, int i2, Intent intent) {
        if (i == 115 && i2 == -1) {
            m117730I0((ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h), intent.getStringExtra("from"));
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        m117753r0();
        m117742t0();
        m117743u0();
    }

    /* JADX INFO: renamed from: o0 */
    public void m117750o0() {
        this.f90479a = null;
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m117751p0() {
        boolean z;
        int size;
        if (!m117731J0()) {
            axj0.m100773a(act());
            return false;
        }
        User user = this.f90479a.f106278a.f121050b;
        C8145d c8145dM106137b = brh.m106137b("p_poi_nearby_card", user.f56859id);
        UssTags ussTags = user.ussTags;
        String str = "";
        c8145dM106137b.m39490v(ussTags == null ? "" : ussTags.eventInfo);
        if (CoreModule.f18264c.f20381e0.m116600p9().isJailed()) {
            CoreModule.m30930K().startJailedDialogLikeAct();
            this.f90480b.mo44141k2(c8145dM106137b, "failJailedUser");
            return false;
        }
        if (!this.f90481c) {
            return false;
        }
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        CounterLikeLimit counterLikeLimit = counterM32487o3.likeLimit;
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM32487o3.undoLimit;
        if ((((long) (counterSuperlikeAndUndoLimit.reset * 1000)) + counterLikeLimit.serverTime) - uqb0.f180376H.guessedCurrentServerTime() <= 0 || counterSuperlikeAndUndoLimit.remainToday() != 0) {
            this.f90483e.run();
            z = true;
        } else {
            C8927c.m54595M1(act(), "p_home,undo", Privilege.vip_undo, null, null, false, user);
            z = false;
        }
        boolean z2 = z;
        if (!z) {
            if (NullChecker.m82486a(user) && NullChecker.m82486a(user.pictures) && user.pictures.size() > 0) {
                str = user.pictures.get(0).url;
                size = user.pictures.size();
            } else {
                size = 0;
            }
            c8145dM106137b.m39464B(str);
            c8145dM106137b.m39494z(0);
            c8145dM106137b.m39463A(size);
            this.f90480b.mo44141k2(c8145dM106137b, "failUndoLocal");
        }
        return z2;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m117752q0() {
        if (((fsh) this.viewModel).m127185f() == null) {
            return;
        }
        gsh gshVar = this.f90479a;
        gshVar.f106278a.m144973a(gshVar.f106279b);
        ((fsh) this.viewModel).m127185f().m135110n(this.f90479a.f106278a);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m117753r0() {
        duringCreated(CoreModule.m30932N().mo61520Z6(this.f90480b.f27107C)).subscribe(psd0.m173597H(new y20() { // from class: l.xrh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195909a.m117756y0((Envelope) obj);
            }
        }, new y20() { // from class: l.yrh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201319a.m117757z0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m117754s0() {
        return this.f90482d.size() > 0;
    }

    /* JADX INFO: renamed from: x0 */
    public boolean m117755x0(String str) {
        return this.f90482d.contains(str);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m117756y0(Envelope envelope) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(envelope) && NullChecker.m82486a(envelope.data)) {
            CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
            List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
            List<CoreMomentInfo> list2 = coreData.moments;
            List<BubbleInfo> list3 = coreData.states;
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            if (!jyb.m147479J(list2)) {
                for (CoreMomentInfo coreMomentInfo : list2) {
                    map.put(coreMomentInfo.owner, coreMomentInfo);
                }
            }
            if (!jyb.m147479J(list3)) {
                for (BubbleInfo bubbleInfo : list3) {
                    map2.put(bubbleInfo.owner.f39651id, bubbleInfo);
                }
            }
            if (!jyb.m147479J(list)) {
                for (User user : list) {
                    CoreMomentInfo coreMomentInfo2 = (CoreMomentInfo) map.get(user.f56859id);
                    BubbleInfo bubbleInfo2 = (BubbleInfo) map2.get(user.f56859id);
                    if (NullChecker.m82486a(coreMomentInfo2)) {
                        arrayList.add(new ji80(user, coreMomentInfo2, bubbleInfo2, null));
                    }
                }
            }
        }
        if (jyb.m147479J(arrayList)) {
            this.f90480b.m44136Q4();
        } else {
            ((fsh) this.viewModel).m127191q(arrayList);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m117757z0(Throwable th) {
        this.f90480b.m44136Q4();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
