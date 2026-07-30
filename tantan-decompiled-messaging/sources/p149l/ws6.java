package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsTabFrag;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.util.DebugUtil;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes11.dex */
public class ws6 extends jq2<ConversationsTabFrag> {

    /* JADX INFO: renamed from: a */
    public ConversationsTabFrag f187867a;

    /* JADX INFO: renamed from: b */
    public C22393b<Boolean> f187868b;

    public ws6(mcr mcrVar) {
        super(mcrVar);
        this.f187868b = C22393b.m221521b();
        this.f187867a = (ConversationsTabFrag) mcrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m205359E0() {
        DebugUtil.m58667Xj(act(), true);
        DebugUtil.m58667Xj(act(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public /* synthetic */ void m205360F0() {
        DebugUtil.m58667Xj(act(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m205361G0() {
        DebugUtil.m58667Xj(act(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public /* synthetic */ void m205362Q0() {
        this.f187867a.m41633b6();
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m205372n0() {
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ LoveLetterEntryInfo m205374p0(LoveLetterEntryInfo loveLetterEntryInfo, roj0 roj0Var) {
        return loveLetterEntryInfo;
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ Boolean m205381y0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: C0 */
    public ArrayList<j760<String, d30>> m205383C0(Collection<? extends j760<String, d30>> collection) {
        ArrayList<j760<String, d30>> arrayList = new ArrayList<>(collection);
        arrayList.add(new j760<>("配对&消息列表LiveStateDebugState", new d30() { // from class: l.qs6
            @Override // p149l.d30
            public final void call() {
                this.f156103a.m205359E0();
            }
        }));
        arrayList.add(new j760<>("配对列表LiveStateDebugState", new d30() { // from class: l.rs6
            @Override // p149l.d30
            public final void call() {
                this.f160811a.m205360F0();
            }
        }));
        arrayList.add(new j760<>("消息列表LiveStateDebugState", new d30() { // from class: l.ss6
            @Override // p149l.d30
            public final void call() {
                this.f166163a.m205361G0();
            }
        }));
        arrayList.addAll(af6.m96207t(act(), this));
        arrayList.add(vwb.m200311Y("情书入口气泡", new d30() { // from class: l.ts6
            @Override // p149l.d30
            public final void call() {
                this.f171908a.m205385H0();
            }
        }));
        arrayList.add(vwb.m200311Y("情书接受动画", new d30() { // from class: l.us6
            @Override // p149l.d30
            public final void call() {
                this.f177942a.m205387J0();
            }
        }));
        arrayList.add(vwb.m200311Y("情书引导", new d30() { // from class: l.vs6
            @Override // p149l.d30
            public final void call() {
                this.f182801a.m205389N0();
            }
        }));
        arrayList.add(vwb.m200311Y("情书清除数据", new d30() { // from class: l.cs6
            @Override // p149l.d30
            public final void call() {
                hbw.m130339e().m130342c();
            }
        }));
        return arrayList;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m205384D0() {
        duringCreated(v930.m197537k().distinctUntilChanged()).takeWhile(new w9j() { // from class: l.is6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!hbw.m130339e().m130345h().booleanValue());
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.js6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119476a.m205390O0((TabName) obj);
            }
        }));
        duringCreated(C22306c.combineLatest(CoreModule.f17545c.f19639e0.f149279U1.distinctUntilChanged(), this.f187867a.f25219Z, new x9j() { // from class: l.ks6
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return ws6.m205374p0((LoveLetterEntryInfo) obj, (roj0) obj2);
            }
        }).filter(new w9j() { // from class: l.ls6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(v930.m197534h() == TabName.Msg);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.ns6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140241a.m205391P0((LoveLetterEntryInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m205385H0() {
        this.f187867a.m41643k6();
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m205386I0() {
        act().startActivityWithCustomTransition(MessagesAct.m48943i2(act(), User.ID_TEAM_ACCOUNT, false, false), new s000());
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m205387J0() {
        haw hawVar = new haw(act(), CoreModule.f17545c.f19639e0.m169527p9());
        hawVar.m130240R(new d30() { // from class: l.ds6
            @Override // p149l.d30
            public final void call() {
                this.f87722a.m205386I0();
            }
        });
        hawVar.show();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m205388L0() {
        this.f187867a.m41608A5();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m205389N0() {
        new ebw(act(), new d30() { // from class: l.gs6
            @Override // p149l.d30
            public final void call() {
                this.f104148a.m205388L0();
            }
        }, new d30() { // from class: l.hs6
            @Override // p149l.d30
            public final void call() {
                ws6.m205372n0();
            }
        }).show();
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m205390O0(TabName tabName) {
        if (tabName == TabName.Msg) {
            CoreModule.f17545c.f19639e0.m169481da();
        } else {
            this.f187867a.m41610E5();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m205391P0(LoveLetterEntryInfo loveLetterEntryInfo) {
        if (!loveLetterEntryInfo.display) {
            this.f187868b.m132487l(Boolean.FALSE);
            return;
        }
        if (NullChecker.m81303a(this.f187867a.f25217X)) {
            ((ConversationsTabFrag) this.viewModel).m41641i6(loveLetterEntryInfo);
        }
        ((ConversationsTabFrag) this.viewModel).m41640h6(hbw.m130339e().m130348l(loveLetterEntryInfo));
        if (!hbw.m130339e().f106972e.get().booleanValue()) {
            this.f187868b.m132487l(Boolean.TRUE);
            return;
        }
        if (hbw.m130339e().m130349m(loveLetterEntryInfo)) {
            ((ConversationsTabFrag) this.viewModel).m41642j6(loveLetterEntryInfo);
            hbw.m130339e().f106968a.put(Long.valueOf(mqi0.m155944o()));
            this.f187868b.m132487l(Boolean.TRUE);
        } else {
            if (!hbw.m130339e().m130350n(loveLetterEntryInfo)) {
                this.f187868b.m132487l(Boolean.FALSE);
                return;
            }
            ((ConversationsTabFrag) this.viewModel).m41643k6();
            hpd0 hpd0Var = hbw.m130339e().f106969b;
            Boolean bool = Boolean.TRUE;
            hpd0Var.put(bool);
            hbw.m130339e().f106971d.put(bool);
            ((ConversationsTabFrag) this.viewModel).m41640h6(hbw.m130339e().m130348l(loveLetterEntryInfo));
            this.f187868b.m132487l(bool);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m205392R0(roj0 roj0Var) {
        e51.m114744I(this.f187867a, new Runnable() { // from class: l.es6
            @Override // java.lang.Runnable
            public final void run() {
                this.f92993a.m205362Q0();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: S0 */
    public void m205393S0(boolean z) {
        if (CoreModule.f17545c.f19687u0.m30489x5()) {
            if (z) {
                yzc0.m216634b().f200860b = true;
            }
            yzc0.m216634b().f200859a.m132487l(Boolean.valueOf(!z));
        }
        if (!upa.m194819t1() && upa.f177582a.get().booleanValue()) {
            CoreModule.f17545c.f19642f0.m32591Bh(Boolean.TRUE);
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.fs6
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19642f0.m32575Ae();
                }
            }, 100L);
            upa.f177582a.put(Boolean.FALSE);
        }
        if (z) {
            return;
        }
        CoreModule.f17545c.f19642f0.m32650Fo();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        if (y19.m212154N()) {
            CoreModule.f17545c.f19639e0.m169481da();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        if (y19.m212154N()) {
            m205384D0();
        }
        if (upa.m194632F0()) {
            duringCreated(mkd0.m154984r(CoreModule.f17545c.f19642f0.m33066og().filter(new w9j() { // from class: l.bs6
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ws6.m205381y0((Boolean) obj);
                }
            }), this.f187868b.filter(new w9j() { // from class: l.ms6
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((Boolean) obj).booleanValue());
                }
            }), new x9j() { // from class: l.os6
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return roj0.f160388a;
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.ps6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f150974a.m205392R0((roj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m205394U0() {
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
