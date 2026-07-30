package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsTabFrag;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.util.DebugUtil;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes11.dex */
public class zt6 extends ar2<ConversationsTabFrag> {

    /* JADX INFO: renamed from: a */
    public ConversationsTabFrag f205939a;

    /* JADX INFO: renamed from: b */
    public C22508b<Boolean> f205940b;

    public zt6(ner nerVar) {
        super(nerVar);
        this.f205940b = C22508b.m222767b();
        this.f205939a = (ConversationsTabFrag) nerVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m221416E0() {
        DebugUtil.m59872Yj(act(), true);
        DebugUtil.m59872Yj(act(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public /* synthetic */ void m221417F0() {
        DebugUtil.m59872Yj(act(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m221418G0() {
        DebugUtil.m59872Yj(act(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public /* synthetic */ void m221419Q0() {
        this.f205939a.m42644b6();
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m221429n0() {
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ LoveLetterEntryInfo m221431p0(LoveLetterEntryInfo loveLetterEntryInfo, uxj0 uxj0Var) {
        return loveLetterEntryInfo;
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ Boolean m221438y0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: C0 */
    public ArrayList<pf60<String, x20>> m221440C0(Collection<? extends pf60<String, x20>> collection) {
        ArrayList<pf60<String, x20>> arrayList = new ArrayList<>(collection);
        arrayList.add(new pf60<>("配对&消息列表LiveStateDebugState", new x20() { // from class: l.tt6
            @Override // p153l.x20
            public final void call() {
                this.f176056a.m221416E0();
            }
        }));
        arrayList.add(new pf60<>("配对列表LiveStateDebugState", new x20() { // from class: l.ut6
            @Override // p153l.x20
            public final void call() {
                this.f180891a.m221417F0();
            }
        }));
        arrayList.add(new pf60<>("消息列表LiveStateDebugState", new x20() { // from class: l.vt6
            @Override // p153l.x20
            public final void call() {
                this.f185691a.m221418G0();
            }
        }));
        arrayList.addAll(dg6.m115625t(act(), this));
        arrayList.add(jyb.m147494Y("情书入口气泡", new x20() { // from class: l.wt6
            @Override // p153l.x20
            public final void call() {
                this.f190716a.m221442H0();
            }
        }));
        arrayList.add(jyb.m147494Y("情书接受动画", new x20() { // from class: l.xt6
            @Override // p153l.x20
            public final void call() {
                this.f196186a.m221444J0();
            }
        }));
        arrayList.add(jyb.m147494Y("情书引导", new x20() { // from class: l.yt6
            @Override // p153l.x20
            public final void call() {
                this.f201488a.m221446N0();
            }
        }));
        arrayList.add(jyb.m147494Y("情书清除数据", new x20() { // from class: l.ft6
            @Override // p153l.x20
            public final void call() {
                fdw.m125139e().m125142c();
            }
        }));
        return arrayList;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m221441D0() {
        duringCreated(ji30.m144967k().distinctUntilChanged()).takeWhile(new qcj() { // from class: l.lt6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!fdw.m125139e().m125145h().booleanValue());
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.mt6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138546a.m221447O0((TabName) obj);
            }
        }));
        duringCreated(C22421c.combineLatest(CoreModule.f18264c.f20381e0.f89136U1.distinctUntilChanged(), this.f205939a.f25961Z, new rcj() { // from class: l.nt6
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return zt6.m221431p0((LoveLetterEntryInfo) obj, (uxj0) obj2);
            }
        }).filter(new qcj() { // from class: l.ot6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ji30.m144964h() == TabName.Msg);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.qt6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159391a.m221448P0((LoveLetterEntryInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m221442H0() {
        this.f205939a.m42654k6();
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m221443I0() {
        act().startActivityWithCustomTransition(MessagesAct.m50126k2(act(), User.ID_TEAM_ACCOUNT, false, false), new p900());
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m221444J0() {
        fcw fcwVar = new fcw(act(), CoreModule.f18264c.f20381e0.m116600p9());
        fcwVar.m125065R(new x20() { // from class: l.gt6
            @Override // p153l.x20
            public final void call() {
                this.f106383a.m221443I0();
            }
        });
        fcwVar.show();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m221445L0() {
        this.f205939a.m42619A5();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m221446N0() {
        new cdw(act(), new x20() { // from class: l.jt6
            @Override // p153l.x20
            public final void call() {
                this.f122553a.m221445L0();
            }
        }, new x20() { // from class: l.kt6
            @Override // p153l.x20
            public final void call() {
                zt6.m221429n0();
            }
        }).show();
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m221447O0(TabName tabName) {
        if (tabName == TabName.Msg) {
            CoreModule.f18264c.f20381e0.m116554da();
        } else {
            this.f205939a.m42621E5();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m221448P0(LoveLetterEntryInfo loveLetterEntryInfo) {
        if (!loveLetterEntryInfo.display) {
            this.f205940b.m137019l(Boolean.FALSE);
            return;
        }
        if (NullChecker.m82486a(this.f205939a.f25959X)) {
            ((ConversationsTabFrag) this.viewModel).m42652i6(loveLetterEntryInfo);
        }
        ((ConversationsTabFrag) this.viewModel).m42651h6(fdw.m125139e().m125148l(loveLetterEntryInfo));
        if (!fdw.m125139e().f98516e.get().booleanValue()) {
            this.f205940b.m137019l(Boolean.TRUE);
            return;
        }
        if (fdw.m125139e().m125149m(loveLetterEntryInfo)) {
            ((ConversationsTabFrag) this.viewModel).m42653j6(loveLetterEntryInfo);
            fdw.m125139e().f98512a.put(Long.valueOf(pzi0.m174454o()));
            this.f205940b.m137019l(Boolean.TRUE);
        } else {
            if (!fdw.m125139e().m125150n(loveLetterEntryInfo)) {
                this.f205940b.m137019l(Boolean.FALSE);
                return;
            }
            ((ConversationsTabFrag) this.viewModel).m42654k6();
            jxd0 jxd0Var = fdw.m125139e().f98513b;
            Boolean bool = Boolean.TRUE;
            jxd0Var.put(bool);
            fdw.m125139e().f98515d.put(bool);
            ((ConversationsTabFrag) this.viewModel).m42651h6(fdw.m125139e().m125148l(loveLetterEntryInfo));
            this.f205940b.m137019l(bool);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m221449R0(uxj0 uxj0Var) {
        l51.m152889I(this.f205939a, new Runnable() { // from class: l.ht6
            @Override // java.lang.Runnable
            public final void run() {
                this.f111512a.m221419Q0();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: S0 */
    public void m221450S0(boolean z) {
        if (CoreModule.f18264c.f20429u0.m31378B5()) {
            if (z) {
                b8d0.m102963b().f75421b = true;
            }
            b8d0.m102963b().f75420a.m137019l(Boolean.valueOf(!z));
        }
        if (!gra.m131750t1() && gra.f106016a.get().booleanValue()) {
            CoreModule.f18264c.f20384f0.m33594Bh(Boolean.TRUE);
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.it6
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20384f0.m33578Ae();
                }
            }, 100L);
            gra.f106016a.put(Boolean.FALSE);
        }
        if (z) {
            return;
        }
        CoreModule.f18264c.f20384f0.m33653Fo();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        if (h39.m133425N()) {
            CoreModule.f18264c.f20381e0.m116554da();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        if (h39.m133425N()) {
            m221441D0();
        }
        if (gra.m131563F0()) {
            duringCreated(psd0.m173625r(CoreModule.f18264c.f20384f0.m34069og().filter(new qcj() { // from class: l.et6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return zt6.m221438y0((Boolean) obj);
                }
            }), this.f205940b.filter(new qcj() { // from class: l.pt6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((Boolean) obj).booleanValue());
                }
            }), new rcj() { // from class: l.rt6
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return uxj0.f181467a;
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.st6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f170547a.m221449R0((uxj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m221451U0() {
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
