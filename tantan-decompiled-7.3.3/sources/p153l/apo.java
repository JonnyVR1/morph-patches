package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.intl.greet.message.IntlDynamicGreetListAct;
import com.p051p1.mobile.putong.data.DbLinks;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class apo extends j4n<cpo> {

    /* JADX INFO: renamed from: b */
    public int f72734b;

    /* JADX INFO: renamed from: c */
    public String[] f72735c;

    /* JADX INFO: renamed from: d */
    public final boolean[] f72736d;

    /* JADX INFO: renamed from: e */
    public final boolean[] f72737e;

    /* JADX INFO: renamed from: f */
    public final String[] f72738f;

    /* JADX INFO: renamed from: g */
    public final DbLinks[] f72739g;

    /* JADX INFO: renamed from: h */
    public DbLinks f72740h;

    /* JADX INFO: renamed from: i */
    public final boolean[] f72741i;

    public apo(ner nerVar) {
        super(nerVar);
        this.f72734b = 0;
        this.f72735c = null;
        this.f72736d = new boolean[]{false, true};
        this.f72737e = new boolean[]{true, false};
        this.f72738f = new String[]{"&filter=recv", "&filter=sent"};
        this.f72739g = new DbLinks[]{null, null};
        this.f72740h = null;
        this.f72741i = new boolean[]{false, false};
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m99339L0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ List m99342V0(pf60 pf60Var) {
        return m143438l0((List) pf60Var.f152156a, (List) pf60Var.f152157b);
    }

    /* JADX INFO: renamed from: P0 */
    public void m99347P0(final IntlDynamicGreetListAct intlDynamicGreetListAct, List<fzq> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        for (fzq fzqVar : list) {
            if (NullChecker.m82486a(fzqVar) && NullChecker.m82486a(fzqVar.m128215b()) && fzqVar.m128223o() > 0) {
                arrayList.add(fzqVar.m128224p());
                arrayList2.add(fzqVar.m128215b().messages.latestId);
            }
        }
        if (jyb.m147479J(arrayList)) {
            return;
        }
        dgm.m115659b(intlDynamicGreetListAct, new Runnable() { // from class: l.noo
            @Override // java.lang.Runnable
            public final void run() {
                this.f143007a.m99348Q0(intlDynamicGreetListAct, arrayList, arrayList2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ List m99349R0(pf60 pf60Var) {
        F f = pf60Var.f152156a;
        this.f72740h = ((vg60) f).f184002b;
        return m143439m0((vg60) f, (List) pf60Var.f152157b);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m99350S0(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fzq fzqVar = (fzq) it.next();
            if (NullChecker.m82486a(fzqVar.m128215b()) && TextUtils.equals(fzqVar.m128215b().actorUserId, CoreModule.f18264c.f20381e0.m116600p9().f56859id)) {
                arrayList2.add(fzqVar);
            } else {
                arrayList.add(fzqVar);
            }
        }
        if (!jyb.m147479J(arrayList)) {
            ((cpo) this.viewModel).m111822n(0, arrayList);
        }
        if (jyb.m147479J(arrayList2)) {
            return;
        }
        ((cpo) this.viewModel).m111822n(1, list);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m99351U0(Throwable th) {
        ((cpo) this.viewModel).m148270d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ List m99352W0(int i, List list, pf60 pf60Var) {
        DbLinks[] dbLinksArr = this.f72739g;
        F f = pf60Var.f152156a;
        dbLinksArr[i] = ((vg60) f).f184002b;
        List<fzq> listM143439m0 = m143439m0((vg60) f, (List) pf60Var.f152157b);
        listM143439m0.addAll(jyb.m147522n(list, new qcj() { // from class: l.moo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                fzq fzqVar = (fzq) obj;
                return Boolean.valueOf(NullChecker.m82486a(fzqVar.m128215b()) && !TextUtils.equals(fzqVar.m128215b().actorUserId, CoreModule.f18264c.f20381e0.m116600p9().f56859id));
            }
        }));
        return listM143439m0;
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ C22421c m99353X0(DbLinks dbLinks, final int i, final List list) {
        return CoreModule.f18264c.f20420r0.m35145r5(this.f118311a, dbLinks, this.f72738f[i]).map(new qcj() { // from class: l.loo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f132921a.m99352W0(i, list, (pf60) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m99354Y0(int i, List list) {
        this.f72741i[i] = false;
        ((cpo) this.viewModel).m111822n(i, list);
    }

    @Override // p153l.j4n, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        this.f72735c = new String[]{act().string(R$string.f21708f4), act().string(R$string.f21717g4)};
        super.mo40473a0();
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m99355a1(int i, Throwable th) {
        ((cpo) this.viewModel).m148270d();
        this.f72741i[i] = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ List m99356b1(int i, pf60 pf60Var) {
        DbLinks[] dbLinksArr = this.f72739g;
        F f = pf60Var.f152156a;
        dbLinksArr[i] = ((vg60) f).f184002b;
        return m143439m0((vg60) f, (List) pf60Var.f152157b);
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m99357c1(int i, List list) {
        this.f72741i[i] = false;
        ((cpo) this.viewModel).m111822n(i, list);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m99358d1(int i, Throwable th) {
        ((cpo) this.viewModel).m148270d();
        this.f72741i[i] = false;
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m99359e1(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((Greeting) it.next()).otherUser);
        }
        ((cpo) this.viewModel).m111823p(hashSet);
    }

    /* JADX INFO: renamed from: f1 */
    public final void m99360f1(final int i) {
        final DbLinks dbLinks = this.f72739g[i];
        if (!NullChecker.m82486a(dbLinks) || NullChecker.m82486a(dbLinks.links.next)) {
            if (i == 0) {
                duringCreated((C22421c) CoreModule.f18264c.f20420r0.m35151u5(this.f118311a).map(new qcj() { // from class: l.too
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f175432a.m99342V0((pf60) obj);
                    }
                })).flatMap(new qcj() { // from class: l.uoo
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f180105a.m99353X0(dbLinks, i, (List) obj);
                    }
                }).subscribe(psd0.m173597H(new y20() { // from class: l.voo
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f185066a.m99354Y0(i, (List) obj);
                    }
                }, new y20() { // from class: l.woo
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f190057a.m99355a1(i, (Throwable) obj);
                    }
                }));
            } else if (i == 1) {
                duringCreated((C22421c) CoreModule.f18264c.f20420r0.m35145r5(this.f118311a, dbLinks, this.f72738f[i]).map(new qcj() { // from class: l.xoo
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f195588a.m99356b1(i, (pf60) obj);
                    }
                })).subscribe(psd0.m173597H(new y20() { // from class: l.yoo
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f200994a.m99357c1(i, (List) obj);
                    }
                }, new y20() { // from class: l.zoo
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f205363a.m99358d1(i, (Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public final void m99348Q0(Act act, List<String> list, List<String> list2) {
        duringCreated(CoreModule.f18264c.f20420r0.m35123g5(list, list2)).filter(new qcj() { // from class: l.ooo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.poo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153419a.m99359e1((List) obj);
            }
        }, new y20() { // from class: l.qoo
            @Override // p153l.y20
            public final void call(Object obj) {
                apo.m99339L0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.j4n
    /* JADX INFO: renamed from: k0 */
    public void mo99362k0() {
        super.mo99362k0();
        this.f72740h = null;
    }

    @Override // p153l.j4n
    /* JADX INFO: renamed from: r0 */
    public void mo99363r0() {
        duringCreated((C22421c) CoreModule.f18264c.f20420r0.m35149t5(this.f118311a, this.f72740h, "").map(new qcj() { // from class: l.koo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f127769a.m99349R0((pf60) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.roo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164220a.m99350S0((List) obj);
            }
        }, new y20() { // from class: l.soo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169913a.m99351U0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.j4n
    /* JADX INFO: renamed from: s0 */
    public void mo99364s0(boolean z) {
        if (!z) {
            m99360f1(this.f72734b);
            return;
        }
        for (int i = 0; i < this.f72735c.length; i++) {
            m99360f1(i);
        }
    }

    @Override // p153l.j4n
    /* JADX INFO: renamed from: t0 */
    public void mo99365t0() {
        DbLinks dbLinks;
        boolean[] zArr = this.f72741i;
        int i = this.f72734b;
        if (zArr[i] || (dbLinks = this.f72739g[i]) == null || !NullChecker.m82486a(dbLinks.links.next)) {
            return;
        }
        this.f72741i[this.f72734b] = true;
        mo99364s0(false);
    }

    @Override // p153l.j4n, p153l.k3m
    public void destroy() {
    }
}
