package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.NotificationStatus;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.intl.greet.message.IntlDynamicGreetListAct;
import com.p046p1.mobile.putong.core.p053ui.intl.greet.message.IntlGreetListItemView;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p147v.VListCell;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class q9n extends vak<fxq> {

    /* JADX INFO: renamed from: c */
    public final IntlDynamicGreetListAct f153449c;

    /* JADX INFO: renamed from: d */
    public final List<fxq> f153450d;

    /* JADX INFO: renamed from: e */
    public final HashMap<String, fxq> f153451e;

    /* JADX INFO: renamed from: f */
    public Set<String> f153452f;

    /* JADX INFO: renamed from: g */
    public boolean f153453g;

    public q9n(IntlDynamicGreetListAct intlDynamicGreetListAct) {
        this.f153451e = new HashMap<>();
        this.f153452f = new HashSet();
        this.f153453g = false;
        this.f153449c = intlDynamicGreetListAct;
        this.f153450d = new ArrayList();
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m173630K(Throwable th) {
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m173632M(vak vakVar, fxq fxqVar, roj0 roj0Var) {
        CoreModule.f17545c.f19678r0.m34092J6();
        vakVar.mo173643F(fxqVar.m123668p());
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m173635P(IntlDynamicGreetListAct intlDynamicGreetListAct, vak vakVar, fxq fxqVar, c40[] c40VarArr, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        m173637S(intlDynamicGreetListAct, vakVar, fxqVar);
        c40VarArr[0].m105113b();
    }

    /* JADX INFO: renamed from: R */
    private List<fxq> m173636R(List<fxq> list) {
        for (fxq fxqVar : list) {
            boolean zEquals = "default".equals(fxqVar.m123665m());
            HashMap<String, fxq> map = this.f153451e;
            if (zEquals) {
                map.put(fxqVar.m123660f(), fxqVar);
            } else {
                map.remove(fxqVar.m123660f());
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f153451e.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(this.f153451e.get(it.next()));
        }
        if (this.f153453g) {
            Collections.sort(arrayList);
            return arrayList;
        }
        ArrayList arrayListM200339n = vwb.m200339n(arrayList, new w9j() { // from class: l.l9n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((fxq) obj).m123659b().channel, Channel.get("instant_chat")));
            }
        });
        vwb.m200295I(arrayListM200339n, new ige());
        ArrayList arrayListM200339n2 = vwb.m200339n(arrayList, new w9j() { // from class: l.m9n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!TEnum.equals(((fxq) obj).m123659b().channel, Channel.get("instant_chat")));
            }
        });
        vwb.m200295I(arrayListM200339n2, new ige());
        arrayList.clear();
        arrayList.addAll(arrayListM200339n);
        arrayList.addAll(arrayListM200339n2);
        return arrayList;
    }

    /* JADX INFO: renamed from: S */
    private static void m173637S(Act act, final vak<fxq> vakVar, final fxq fxqVar) {
        act.duringCreated(CoreModule.f17545c.f19678r0.m34126j5(fxqVar.m123668p(), fxqVar.m123659b().messages.latestId)).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.o9n
            @Override // p149l.e30
            public final void call(Object obj) {
                q9n.m173632M(vakVar, fxqVar, (roj0) obj);
            }
        }, new e30() { // from class: l.p9n
            @Override // p149l.e30
            public final void call(Object obj) {
                q9n.m173630K((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m173638V(fxq fxqVar, int i, int i2, View view) {
        m173640Z(this.f153449c, fxqVar, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ boolean m173639W(fxq fxqVar, View view) {
        return m173641a0(this.f153449c, fxqVar, this);
    }

    /* JADX INFO: renamed from: Z */
    public static void m173640Z(IntlDynamicGreetListAct intlDynamicGreetListAct, fxq fxqVar, int i, int i2) {
        nmn.m160126l(intlDynamicGreetListAct, fxqVar.m123659b(), NotificationStatus.undefined);
        intlDynamicGreetListAct.overridePendingTransition(szb0.f167030e, szb0.f167029d);
        fxqVar.m123653M(0);
        intlDynamicGreetListAct.m46164Z1().mo107811e();
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m173641a0(final IntlDynamicGreetListAct intlDynamicGreetListAct, final fxq fxqVar, final vak<fxq> vakVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(intlDynamicGreetListAct.getString(R$string.f20943d));
        c40.C16057b c16057b = new c40.C16057b(intlDynamicGreetListAct);
        c16057b.m105156I(intlDynamicGreetListAct.getResources().getString(R$string.f20916a)).m105168U(new View.OnClickListener() { // from class: l.i9n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c40VarArr[0].m105113b();
            }
        }).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.j9n
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                q9n.m173635P(intlDynamicGreetListAct, vakVar, fxqVar, c40VarArr, vListCell, c22545a, i);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        final c40[] c40VarArr = {c40VarM105153F};
        c40VarM105153F.m105117f();
        return true;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (vwb.m200296J(this.f153450d)) {
            return 1;
        }
        return this.f153450d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        IntlDynamicGreetListAct intlDynamicGreetListAct = this.f153449c;
        return i == 10 ? intlDynamicGreetListAct.inflater().inflate(l6c0.f126423Y3, viewGroup, false) : intlDynamicGreetListAct.inflater().inflate(l6c0.f126347N0, viewGroup, false);
    }

    @Override // p149l.vak
    /* JADX INFO: renamed from: F */
    public void mo173643F(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e51.m114743H(this.f153449c, new Runnable() { // from class: l.k9n
            @Override // java.lang.Runnable
            public final void run() {
                this.f122051a.m173647X(str);
            }
        }, 100L);
    }

    @Override // p149l.vak
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo173642E(View view, final fxq fxqVar, List<Object> list, int i, final int i2) {
        q9n q9nVar;
        if (i == 10) {
            VText vText = (VText) view.findViewById(y4c0.f196074X4);
            boolean z = this.f153453g;
            IntlDynamicGreetListAct intlDynamicGreetListAct = this.f153449c;
            vText.setText(z ? intlDynamicGreetListAct.getString(R$string.f20921a4) : intlDynamicGreetListAct.getString(R$string.f20930b4));
            q9nVar = this;
        } else {
            final int itemViewType = getItemViewType(i2);
            if (!this.f153452f.contains(fxqVar.m123668p())) {
                this.f153452f.add(fxqVar.m123668p());
            }
            q9nVar = this;
            ((IntlGreetListItemView) view).m46172h(this.f153449c, q9nVar, fxqVar, itemViewType, new View.OnClickListener() { // from class: l.g9n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f101578a.m173638V(fxqVar, i2, itemViewType, view2);
                }
            }, new View.OnLongClickListener() { // from class: l.h9n
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return this.f106617a.m173639W(fxqVar, view2);
                }
            });
        }
        if (i2 < q9nVar.f153450d.size() - 3 || q9nVar.f153450d.size() <= 10) {
            return;
        }
        q9nVar.f153449c.m46163Y1().mo97801t0();
    }

    /* JADX INFO: renamed from: T */
    public List<fxq> m173645T() {
        return this.f153450d;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public fxq getItem(int i) {
        return !vwb.m200296J(this.f153450d) ? this.f153450d.get(i) : new fxq();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m173647X(final String str) {
        int iM200293G = vwb.m200293G(this.f153450d, new w9j() { // from class: l.n9n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((fxq) obj).m123668p(), str));
            }
        });
        if (iM200293G >= 0) {
            fxq fxqVarRemove = this.f153450d.remove(iM200293G);
            if (NullChecker.m81303a(fxqVarRemove)) {
                this.f153451e.remove(fxqVarRemove.m123660f());
            }
            notifyItemRemoved(iM200293G);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m173648Y() {
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: b0 */
    public void m173649b0(List<fxq> list) {
        List<fxq> listM200327h = vwb.m200327h(list, new vge());
        this.f153450d.clear();
        this.f153450d.addAll(m173636R(listM200327h));
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (vwb.m200296J(this.f153450d)) {
            return 10;
        }
        return this.f153453g ? 30 : 20;
    }

    public q9n(IntlDynamicGreetListAct intlDynamicGreetListAct, boolean z) {
        this(intlDynamicGreetListAct);
        this.f153453g = z;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
    }
}
