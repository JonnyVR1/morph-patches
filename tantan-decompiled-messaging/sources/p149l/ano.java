package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.intl.greet.message.IntlDynamicGreetListAct;
import com.p046p1.mobile.putong.data.DbLinks;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes10.dex */
public class ano extends j2n<cno> {

    /* JADX INFO: renamed from: b */
    public int f70749b;

    /* JADX INFO: renamed from: c */
    public String[] f70750c;

    /* JADX INFO: renamed from: d */
    public final boolean[] f70751d;

    /* JADX INFO: renamed from: e */
    public final boolean[] f70752e;

    /* JADX INFO: renamed from: f */
    public final String[] f70753f;

    /* JADX INFO: renamed from: g */
    public final DbLinks[] f70754g;

    /* JADX INFO: renamed from: h */
    public DbLinks f70755h;

    /* JADX INFO: renamed from: i */
    public final boolean[] f70756i;

    public ano(mcr mcrVar) {
        super(mcrVar);
        this.f70749b = 0;
        this.f70750c = null;
        this.f70751d = new boolean[]{false, true};
        this.f70752e = new boolean[]{true, false};
        this.f70753f = new String[]{"&filter=recv", "&filter=sent"};
        this.f70754g = new DbLinks[]{null, null};
        this.f70755h = null;
        this.f70756i = new boolean[]{false, false};
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m97775L0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ List m97778V0(j760 j760Var) {
        return m139488l0((List) j760Var.f116564a, (List) j760Var.f116565b);
    }

    /* JADX INFO: renamed from: P0 */
    public void m97783P0(final IntlDynamicGreetListAct intlDynamicGreetListAct, List<fxq> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        for (fxq fxqVar : list) {
            if (NullChecker.m81303a(fxqVar) && NullChecker.m81303a(fxqVar.m123659b()) && fxqVar.m123667o() > 0) {
                arrayList.add(fxqVar.m123668p());
                arrayList2.add(fxqVar.m123659b().messages.latestId);
            }
        }
        if (vwb.m200296J(arrayList)) {
            return;
        }
        ndm.m158996b(intlDynamicGreetListAct, new Runnable() { // from class: l.nmo
            @Override // java.lang.Runnable
            public final void run() {
                this.f139644a.m97784Q0(intlDynamicGreetListAct, arrayList, arrayList2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ List m97785R0(j760 j760Var) {
        F f = j760Var.f116564a;
        this.f70755h = ((q860) f).f153136b;
        return m139489m0((q860) f, (List) j760Var.f116565b);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m97786S0(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fxq fxqVar = (fxq) it.next();
            if (NullChecker.m81303a(fxqVar.m123659b()) && TextUtils.equals(fxqVar.m123659b().actorUserId, CoreModule.f17545c.f19639e0.m169527p9().f56011id)) {
                arrayList2.add(fxqVar);
            } else {
                arrayList.add(fxqVar);
            }
        }
        if (!vwb.m200296J(arrayList)) {
            ((cno) this.viewModel).m107816n(0, arrayList);
        }
        if (vwb.m200296J(arrayList2)) {
            return;
        }
        ((cno) this.viewModel).m107816n(1, list);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m97787U0(Throwable th) {
        ((cno) this.viewModel).m144323d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ List m97788W0(int i, List list, j760 j760Var) {
        DbLinks[] dbLinksArr = this.f70754g;
        F f = j760Var.f116564a;
        dbLinksArr[i] = ((q860) f).f153136b;
        List<fxq> listM139489m0 = m139489m0((q860) f, (List) j760Var.f116565b);
        listM139489m0.addAll(vwb.m200339n(list, new w9j() { // from class: l.mmo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                fxq fxqVar = (fxq) obj;
                return Boolean.valueOf(NullChecker.m81303a(fxqVar.m123659b()) && !TextUtils.equals(fxqVar.m123659b().actorUserId, CoreModule.f17545c.f19639e0.m169527p9().f56011id));
            }
        }));
        return listM139489m0;
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ C22306c m97789X0(DbLinks dbLinks, final int i, final List list) {
        return CoreModule.f17545c.f19678r0.m34142r5(this.f115937a, dbLinks, this.f70753f[i]).map(new w9j() { // from class: l.lmo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f128810a.m97788W0(i, list, (j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m97790Y0(int i, List list) {
        this.f70756i[i] = false;
        ((cno) this.viewModel).m107816n(i, list);
    }

    @Override // p149l.j2n, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        this.f70750c = new String[]{act().string(R$string.f20966f4), act().string(R$string.f20975g4)};
        super.mo39470a0();
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m97791a1(int i, Throwable th) {
        ((cno) this.viewModel).m144323d();
        this.f70756i[i] = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ List m97792b1(int i, j760 j760Var) {
        DbLinks[] dbLinksArr = this.f70754g;
        F f = j760Var.f116564a;
        dbLinksArr[i] = ((q860) f).f153136b;
        return m139489m0((q860) f, (List) j760Var.f116565b);
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m97793c1(int i, List list) {
        this.f70756i[i] = false;
        ((cno) this.viewModel).m107816n(i, list);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m97794d1(int i, Throwable th) {
        ((cno) this.viewModel).m144323d();
        this.f70756i[i] = false;
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m97795e1(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((Greeting) it.next()).otherUser);
        }
        ((cno) this.viewModel).m107817p(hashSet);
    }

    /* JADX INFO: renamed from: f1 */
    public final void m97796f1(final int i) {
        final DbLinks dbLinks = this.f70754g[i];
        if (!NullChecker.m81303a(dbLinks) || NullChecker.m81303a(dbLinks.links.next)) {
            if (i == 0) {
                duringCreated((C22306c) CoreModule.f17545c.f19678r0.m34148u5(this.f115937a).map(new w9j() { // from class: l.tmo
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f171161a.m97778V0((j760) obj);
                    }
                })).flatMap(new w9j() { // from class: l.umo
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f177282a.m97789X0(dbLinks, i, (List) obj);
                    }
                }).subscribe(mkd0.m154956H(new e30() { // from class: l.vmo
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f182134a.m97790Y0(i, (List) obj);
                    }
                }, new e30() { // from class: l.wmo
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f187081a.m97791a1(i, (Throwable) obj);
                    }
                }));
            } else if (i == 1) {
                duringCreated((C22306c) CoreModule.f17545c.f19678r0.m34142r5(this.f115937a, dbLinks, this.f70753f[i]).map(new w9j() { // from class: l.xmo
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f193570a.m97792b1(i, (j760) obj);
                    }
                })).subscribe(mkd0.m154956H(new e30() { // from class: l.ymo
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f199037a.m97793c1(i, (List) obj);
                    }
                }, new e30() { // from class: l.zmo
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f203750a.m97794d1(i, (Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public final void m97784Q0(Act act, List<String> list, List<String> list2) {
        duringCreated(CoreModule.f17545c.f19678r0.m34120g5(list, list2)).filter(new w9j() { // from class: l.omo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.pmo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150245a.m97795e1((List) obj);
            }
        }, new e30() { // from class: l.qmo
            @Override // p149l.e30
            public final void call(Object obj) {
                ano.m97775L0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.j2n
    /* JADX INFO: renamed from: k0 */
    public void mo97798k0() {
        super.mo97798k0();
        this.f70755h = null;
    }

    @Override // p149l.j2n
    /* JADX INFO: renamed from: r0 */
    public void mo97799r0() {
        duringCreated((C22306c) CoreModule.f17545c.f19678r0.m34146t5(this.f115937a, this.f70755h, "").map(new w9j() { // from class: l.kmo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f123817a.m97785R0((j760) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.rmo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160109a.m97786S0((List) obj);
            }
        }, new e30() { // from class: l.smo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f165363a.m97787U0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.j2n
    /* JADX INFO: renamed from: s0 */
    public void mo97800s0(boolean z) {
        if (!z) {
            m97796f1(this.f70749b);
            return;
        }
        for (int i = 0; i < this.f70750c.length; i++) {
            m97796f1(i);
        }
    }

    @Override // p149l.j2n
    /* JADX INFO: renamed from: t0 */
    public void mo97801t0() {
        DbLinks dbLinks;
        boolean[] zArr = this.f70756i;
        int i = this.f70749b;
        if (zArr[i] || (dbLinks = this.f70754g[i]) == null || !NullChecker.m81303a(dbLinks.links.next)) {
            return;
        }
        this.f70756i[this.f70749b] = true;
        mo97800s0(false);
    }

    @Override // p149l.j2n, p149l.q0m
    public void destroy() {
    }
}
