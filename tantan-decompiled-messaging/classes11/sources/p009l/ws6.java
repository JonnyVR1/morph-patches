package p009l;

import com.p000p1.mobile.putong.core.newui.messages.ConversationsTabFrag;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.util.DebugUtil;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import l.d30;
import l.e30;
import l.e51;
import l.hpd0;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.upa;
import l.v930;
import l.vwb;
import l.w9j;
import l.x9j;
import l.y19;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ws6 extends jq2<ConversationsTabFrag> {

    /* JADX INFO: renamed from: a */
    public ConversationsTabFrag f22299a;

    /* JADX INFO: renamed from: b */
    public b<Boolean> f22300b;

    public ws6(mcr mcrVar) {
        super(mcrVar);
        this.f22300b = b.b();
        this.f22299a = (ConversationsTabFrag) mcrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m24491E0() {
        DebugUtil.Xj(act(), true);
        DebugUtil.Xj(act(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public /* synthetic */ void m24492F0() {
        DebugUtil.Xj(act(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m24493G0() {
        DebugUtil.Xj(act(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public /* synthetic */ void m24494Q0() {
        this.f22299a.m5747b6();
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m24504n0() {
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ LoveLetterEntryInfo m24506p0(LoveLetterEntryInfo loveLetterEntryInfo, roj0 roj0Var) {
        return loveLetterEntryInfo;
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ Boolean m24513y0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: C0 */
    public ArrayList<j760<String, d30>> m24515C0(Collection<? extends j760<String, d30>> collection) {
        ArrayList<j760<String, d30>> arrayList = new ArrayList<>(collection);
        arrayList.add(new j760<>("配对&消息列表LiveStateDebugState", new d30() { // from class: l.qs6
            public final void call() {
                this.f19483a.m24491E0();
            }
        }));
        arrayList.add(new j760<>("配对列表LiveStateDebugState", new d30() { // from class: l.rs6
            public final void call() {
                this.f19959a.m24492F0();
            }
        }));
        arrayList.add(new j760<>("消息列表LiveStateDebugState", new d30() { // from class: l.ss6
            public final void call() {
                this.f20444a.m24493G0();
            }
        }));
        arrayList.addAll(af6.m11385t(act(), this));
        arrayList.add(vwb.Y("情书入口气泡", new d30() { // from class: l.ts6
            public final void call() {
                this.f20848a.m24517H0();
            }
        }));
        arrayList.add(vwb.Y("情书接受动画", new d30() { // from class: l.us6
            public final void call() {
                this.f21321a.m24519J0();
            }
        }));
        arrayList.add(vwb.Y("情书引导", new d30() { // from class: l.vs6
            public final void call() {
                this.f21760a.m24521N0();
            }
        }));
        arrayList.add(vwb.Y("情书清除数据", new d30() { // from class: l.cs6
            public final void call() {
                hbw.m15503e().m15506c();
            }
        }));
        return arrayList;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m24516D0() {
        duringCreated(v930.k().distinctUntilChanged()).takeWhile(new w9j() { // from class: l.is6
            public final Object call(Object obj) {
                return Boolean.valueOf(!hbw.m15503e().m15509h().booleanValue());
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.js6
            public final void call(Object obj) {
                this.f15270a.m24522O0((TabName) obj);
            }
        }));
        duringCreated(c.combineLatest(CoreModule.c.e0.U1.distinctUntilChanged(), this.f22299a.f3997Z, new x9j() { // from class: l.ks6
            public final Object call(Object obj, Object obj2) {
                return ws6.m24506p0((LoveLetterEntryInfo) obj, (roj0) obj2);
            }
        }).filter(new w9j() { // from class: l.ls6
            public final Object call(Object obj) {
                return Boolean.valueOf(v930.h() == TabName.Msg);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.ns6
            public final void call(Object obj) {
                this.f17628a.m24523P0((LoveLetterEntryInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m24517H0() {
        this.f22299a.m5761k6();
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m24518I0() {
        act().startActivityWithCustomTransition(MessagesAct.i2(act(), "-1", false, false), new s000());
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m24519J0() {
        haw hawVar = new haw(act(), CoreModule.c.e0.p9());
        hawVar.m15470R(new d30() { // from class: l.ds6
            public final void call() {
                this.f11975a.m24518I0();
            }
        });
        hawVar.show();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m24520L0() {
        this.f22299a.m5717A5();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m24521N0() {
        new ebw(act(), new d30() { // from class: l.gs6
            public final void call() {
                this.f13708a.m24520L0();
            }
        }, new d30() { // from class: l.hs6
            public final void call() {
                ws6.m24504n0();
            }
        }).show();
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m24522O0(TabName tabName) {
        if (tabName == TabName.Msg) {
            CoreModule.c.e0.da();
        } else {
            this.f22299a.m5722E5();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m24523P0(LoveLetterEntryInfo loveLetterEntryInfo) {
        if (!loveLetterEntryInfo.display) {
            this.f22300b.onNext(Boolean.FALSE);
            return;
        }
        if (NullChecker.a(this.f22299a.f3995X)) {
            ((ConversationsTabFrag) ((jq2) this).viewModel).m5759i6(loveLetterEntryInfo);
        }
        ((ConversationsTabFrag) ((jq2) this).viewModel).m5757h6(hbw.m15503e().m15512l(loveLetterEntryInfo));
        if (!((Boolean) hbw.m15503e().f13952e.get()).booleanValue()) {
            this.f22300b.onNext(Boolean.TRUE);
            return;
        }
        if (hbw.m15503e().m15513m(loveLetterEntryInfo)) {
            ((ConversationsTabFrag) ((jq2) this).viewModel).m5760j6(loveLetterEntryInfo);
            hbw.m15503e().f13948a.put(Long.valueOf(mqi0.m18550o()));
            this.f22300b.onNext(Boolean.TRUE);
        } else {
            if (!hbw.m15503e().m15514n(loveLetterEntryInfo)) {
                this.f22300b.onNext(Boolean.FALSE);
                return;
            }
            ((ConversationsTabFrag) ((jq2) this).viewModel).m5761k6();
            hpd0 hpd0Var = hbw.m15503e().f13949b;
            Boolean bool = Boolean.TRUE;
            hpd0Var.put(bool);
            hbw.m15503e().f13951d.put(bool);
            ((ConversationsTabFrag) ((jq2) this).viewModel).m5757h6(hbw.m15503e().m15512l(loveLetterEntryInfo));
            this.f22300b.onNext(bool);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m24524R0(roj0 roj0Var) {
        e51.I(this.f22299a, new Runnable() { // from class: l.es6
            @Override // java.lang.Runnable
            public final void run() {
                this.f12677a.m24494Q0();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: S0 */
    public void m24525S0(boolean z) {
        if (CoreModule.c.u0.x5()) {
            if (z) {
                yzc0.m25566b().f23300b = true;
            }
            yzc0.m25566b().f23299a.onNext(Boolean.valueOf(!z));
        }
        if (!upa.t1() && ((Boolean) upa.a.get()).booleanValue()) {
            CoreModule.c.f0.Bh(Boolean.TRUE);
            e51.H(CoreModule.b, new Runnable() { // from class: l.fs6
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.f0.Ae();
                }
            }, 100L);
            upa.a.put(Boolean.FALSE);
        }
        if (z) {
            return;
        }
        CoreModule.c.f0.Fo();
    }

    /* JADX INFO: renamed from: Z */
    public void m24527Z() {
        super.Z();
        if (y19.N()) {
            CoreModule.c.e0.da();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m24528a0() {
        super.a0();
        if (y19.N()) {
            m24516D0();
        }
        if (upa.F0()) {
            duringCreated(mkd0.r(CoreModule.c.f0.og().filter(new w9j() { // from class: l.bs6
                public final Object call(Object obj) {
                    return ws6.m24513y0((Boolean) obj);
                }
            }), this.f22300b.filter(new w9j() { // from class: l.ms6
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((Boolean) obj).booleanValue());
                }
            }), new x9j() { // from class: l.os6
                public final Object call(Object obj, Object obj2) {
                    return roj0.a;
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.ps6
                public final void call(Object obj) {
                    this.f18877a.m24524R0((roj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m24526U0() {
    }

    public void destroy() {
    }
}
