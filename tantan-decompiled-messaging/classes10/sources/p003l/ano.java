package p003l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.data.Greeting;
import com.p000p1.mobile.putong.core.message.R$string;
import com.p000p1.mobile.putong.core.p001ui.intl.greet.message.IntlDynamicGreetListAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.DbLinks;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l.cno;
import l.e30;
import l.fxq;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.q860;
import l.umo;
import l.vmo;
import l.vwb;
import l.w9j;
import l.wmo;
import l.xmo;
import l.ymo;
import l.zmo;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ano extends j2n<cno> {

    /* JADX INFO: renamed from: b */
    public int f2811b;

    /* JADX INFO: renamed from: c */
    public String[] f2812c;

    /* JADX INFO: renamed from: d */
    public final boolean[] f2813d;

    /* JADX INFO: renamed from: e */
    public final boolean[] f2814e;

    /* JADX INFO: renamed from: f */
    public final String[] f2815f;

    /* JADX INFO: renamed from: g */
    public final DbLinks[] f2816g;

    /* JADX INFO: renamed from: h */
    public DbLinks f2817h;

    /* JADX INFO: renamed from: i */
    public final boolean[] f2818i;

    public ano(mcr mcrVar) {
        super(mcrVar);
        this.f2811b = 0;
        this.f2812c = null;
        this.f2813d = new boolean[]{false, true};
        this.f2814e = new boolean[]{true, false};
        this.f2815f = new String[]{"&filter=recv", "&filter=sent"};
        this.f2816g = new DbLinks[]{null, null};
        this.f2817h = null;
        this.f2818i = new boolean[]{false, false};
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m5448L0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ List m5451V0(j760 j760Var) {
        return m7326l0((List) j760Var.a, (List) j760Var.b);
    }

    /* JADX INFO: renamed from: P0 */
    public void m5456P0(final IntlDynamicGreetListAct intlDynamicGreetListAct, List<fxq> list) {
        if (vwb.J(list)) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        for (fxq fxqVar : list) {
            if (NullChecker.a(fxqVar) && NullChecker.a(fxqVar.b()) && fxqVar.o() > 0) {
                arrayList.add(fxqVar.p());
                arrayList2.add(fxqVar.b().messages.latestId);
            }
        }
        if (vwb.J(arrayList)) {
            return;
        }
        ndm.m8327b(intlDynamicGreetListAct, new Runnable() { // from class: l.nmo
            @Override // java.lang.Runnable
            public final void run() {
                this.f6530a.m5457Q0(intlDynamicGreetListAct, arrayList, arrayList2);
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ List m5458R0(j760 j760Var) {
        Object obj = j760Var.a;
        this.f2817h = ((q860) obj).b;
        return m7327m0((q860) obj, (List) j760Var.b);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m5459S0(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fxq fxqVar = (fxq) it.next();
            if (NullChecker.a(fxqVar.b()) && TextUtils.equals(fxqVar.b().actorUserId, ((DbObject) CoreModule.c.e0.p9()).id)) {
                arrayList2.add(fxqVar);
            } else {
                arrayList.add(fxqVar);
            }
        }
        if (!vwb.J(arrayList)) {
            ((jq2) this).viewModel.n(0, arrayList);
        }
        if (vwb.J(arrayList2)) {
            return;
        }
        ((jq2) this).viewModel.n(1, list);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m5460U0(Throwable th) {
        ((jq2) this).viewModel.m7486d();
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ List m5461W0(int i, List list, j760 j760Var) {
        DbLinks[] dbLinksArr = this.f2816g;
        Object obj = j760Var.a;
        dbLinksArr[i] = ((q860) obj).b;
        List<fxq> listM7327m0 = m7327m0((q860) obj, (List) j760Var.b);
        listM7327m0.addAll(vwb.n(list, new w9j() { // from class: l.mmo
            public final Object call(Object obj2) {
                fxq fxqVar = (fxq) obj2;
                return Boolean.valueOf(NullChecker.a(fxqVar.b()) && !TextUtils.equals(fxqVar.b().actorUserId, ((DbObject) CoreModule.c.e0.p9()).id));
            }
        }));
        return listM7327m0;
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ c m5462X0(DbLinks dbLinks, final int i, final List list) {
        return CoreModule.c.r0.r5(this.f5237a, dbLinks, this.f2815f[i]).map(new w9j() { // from class: l.lmo
            public final Object call(Object obj) {
                return this.f6168a.m5461W0(i, list, (j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m5463Y0(int i, List list) {
        this.f2818i[i] = false;
        ((jq2) this).viewModel.n(i, list);
    }

    @Override // p003l.j2n
    /* JADX INFO: renamed from: a0 */
    public void mo5464a0() {
        this.f2812c = new String[]{act().string(R$string.f628f4), act().string(R$string.f637g4)};
        super.mo5464a0();
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m5465a1(int i, Throwable th) {
        ((jq2) this).viewModel.m7486d();
        this.f2818i[i] = false;
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ List m5466b1(int i, j760 j760Var) {
        DbLinks[] dbLinksArr = this.f2816g;
        Object obj = j760Var.a;
        dbLinksArr[i] = ((q860) obj).b;
        return m7327m0((q860) obj, (List) j760Var.b);
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m5467c1(int i, List list) {
        this.f2818i[i] = false;
        ((jq2) this).viewModel.n(i, list);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m5468d1(int i, Throwable th) {
        ((jq2) this).viewModel.m7486d();
        this.f2818i[i] = false;
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m5469e1(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((Greeting) it.next()).otherUser);
        }
        ((jq2) this).viewModel.p(hashSet);
    }

    /* JADX INFO: renamed from: f1 */
    public final void m5470f1(int i) {
        DbLinks dbLinks = this.f2816g[i];
        if (!NullChecker.a(dbLinks) || NullChecker.a(dbLinks.links.next)) {
            if (i == 0) {
                duringCreated(CoreModule.c.r0.u5(this.f5237a).map(new w9j() { // from class: l.tmo
                    public final Object call(Object obj) {
                        return this.f7588a.m5451V0((j760) obj);
                    }
                })).flatMap(new umo(this, dbLinks, i)).subscribe(mkd0.H(new vmo(this, i), new wmo(this, i)));
            } else if (i == 1) {
                duringCreated(CoreModule.c.r0.r5(this.f5237a, dbLinks, this.f2815f[i]).map(new xmo(this, i))).subscribe(mkd0.H(new ymo(this, i), new zmo(this, i)));
            }
        }
    }

    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public final void m5457Q0(Act act, List<String> list, List<String> list2) {
        duringCreated(CoreModule.c.r0.g5(list, list2)).filter(new w9j() { // from class: l.omo
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.pmo
            public final void call(Object obj) {
                this.f6873a.m5469e1((List) obj);
            }
        }, new e30() { // from class: l.qmo
            public final void call(Object obj) {
                ano.m5448L0((Throwable) obj);
            }
        }));
    }

    @Override // p003l.j2n
    /* JADX INFO: renamed from: k0 */
    public void mo5472k0() {
        super.mo5472k0();
        this.f2817h = null;
    }

    @Override // p003l.j2n
    /* JADX INFO: renamed from: r0 */
    public void mo5473r0() {
        duringCreated(CoreModule.c.r0.t5(this.f5237a, this.f2817h, "").map(new w9j() { // from class: l.kmo
            public final Object call(Object obj) {
                return this.f5674a.m5458R0((j760) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.rmo
            public final void call(Object obj) {
                this.f7194a.m5459S0((List) obj);
            }
        }, new e30() { // from class: l.smo
            public final void call(Object obj) {
                this.f7388a.m5460U0((Throwable) obj);
            }
        }));
    }

    @Override // p003l.j2n
    /* JADX INFO: renamed from: s0 */
    public void mo5474s0(boolean z) {
        if (!z) {
            m5470f1(this.f2811b);
            return;
        }
        for (int i = 0; i < this.f2812c.length; i++) {
            m5470f1(i);
        }
    }

    @Override // p003l.j2n
    /* JADX INFO: renamed from: t0 */
    public void mo5475t0() {
        DbLinks dbLinks;
        boolean[] zArr = this.f2818i;
        int i = this.f2811b;
        if (zArr[i] || (dbLinks = this.f2816g[i]) == null || !NullChecker.a(dbLinks.links.next)) {
            return;
        }
        this.f2818i[this.f2811b] = true;
        mo5474s0(false);
    }

    @Override // p003l.j2n
    public void destroy() {
    }
}
