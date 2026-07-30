package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.NotificationStatus;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.intl.greet.message.IntlDynamicGreetListAct;
import com.p051p1.mobile.putong.core.p058ui.intl.greet.message.IntlGreetListItemView;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p151v.VListCell;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class qbn extends mdk<fzq> {

    /* JADX INFO: renamed from: c */
    public final IntlDynamicGreetListAct f156489c;

    /* JADX INFO: renamed from: d */
    public final List<fzq> f156490d;

    /* JADX INFO: renamed from: e */
    public final HashMap<String, fzq> f156491e;

    /* JADX INFO: renamed from: f */
    public Set<String> f156492f;

    /* JADX INFO: renamed from: g */
    public boolean f156493g;

    public qbn(IntlDynamicGreetListAct intlDynamicGreetListAct) {
        this.f156491e = new HashMap<>();
        this.f156492f = new HashSet();
        this.f156493g = false;
        this.f156489c = intlDynamicGreetListAct;
        this.f156490d = new ArrayList();
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m176039K(Throwable th) {
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m176041M(mdk mdkVar, fzq fzqVar, uxj0 uxj0Var) {
        CoreModule.f18264c.f20420r0.m35095J6();
        mdkVar.mo104450F(fzqVar.m128224p());
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m176044P(IntlDynamicGreetListAct intlDynamicGreetListAct, mdk mdkVar, fzq fzqVar, w30[] w30VarArr, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        m176046S(intlDynamicGreetListAct, mdkVar, fzqVar);
        w30VarArr[0].m204614b();
    }

    /* JADX INFO: renamed from: R */
    private List<fzq> m176045R(List<fzq> list) {
        for (fzq fzqVar : list) {
            boolean zEquals = "default".equals(fzqVar.m128221m());
            HashMap<String, fzq> map = this.f156491e;
            if (zEquals) {
                map.put(fzqVar.m128216f(), fzqVar);
            } else {
                map.remove(fzqVar.m128216f());
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f156491e.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(this.f156491e.get(it.next()));
        }
        if (this.f156493g) {
            Collections.sort(arrayList);
            return arrayList;
        }
        ArrayList arrayListM147522n = jyb.m147522n(arrayList, new qcj() { // from class: l.lbn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((fzq) obj).m128215b().channel, Channel.get("instant_chat")));
            }
        });
        jyb.m147478I(arrayListM147522n, new mhe());
        ArrayList arrayListM147522n2 = jyb.m147522n(arrayList, new qcj() { // from class: l.mbn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!TEnum.equals(((fzq) obj).m128215b().channel, Channel.get("instant_chat")));
            }
        });
        jyb.m147478I(arrayListM147522n2, new mhe());
        arrayList.clear();
        arrayList.addAll(arrayListM147522n);
        arrayList.addAll(arrayListM147522n2);
        return arrayList;
    }

    /* JADX INFO: renamed from: S */
    private static void m176046S(Act act, final mdk<fzq> mdkVar, final fzq fzqVar) {
        act.duringCreated(CoreModule.f18264c.f20420r0.m35129j5(fzqVar.m128224p(), fzqVar.m128215b().messages.latestId)).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.obn
            @Override // p153l.y20
            public final void call(Object obj) {
                qbn.m176041M(mdkVar, fzqVar, (uxj0) obj);
            }
        }, new y20() { // from class: l.pbn
            @Override // p153l.y20
            public final void call(Object obj) {
                qbn.m176039K((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m176047V(fzq fzqVar, int i, int i2, View view) {
        m176049Z(this.f156489c, fzqVar, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ boolean m176048W(fzq fzqVar, View view) {
        return m176050a0(this.f156489c, fzqVar, this);
    }

    /* JADX INFO: renamed from: Z */
    public static void m176049Z(IntlDynamicGreetListAct intlDynamicGreetListAct, fzq fzqVar, int i, int i2) {
        non.m164148l(intlDynamicGreetListAct, fzqVar.m128215b(), NotificationStatus.undefined);
        intlDynamicGreetListAct.overridePendingTransition(y7c0.f197767e, y7c0.f197766d);
        fzqVar.m128209M(0);
        intlDynamicGreetListAct.m47347a2().mo111817e();
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m176050a0(final IntlDynamicGreetListAct intlDynamicGreetListAct, final fzq fzqVar, final mdk<fzq> mdkVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(intlDynamicGreetListAct.getString(R$string.f21685d));
        w30.C21001b c21001b = new w30.C21001b(intlDynamicGreetListAct);
        c21001b.m204657I(intlDynamicGreetListAct.getResources().getString(R$string.f21658a)).m204669U(new View.OnClickListener() { // from class: l.ibn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w30VarArr[0].m204614b();
            }
        }).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.jbn
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                qbn.m176044P(intlDynamicGreetListAct, mdkVar, fzqVar, w30VarArr, vListCell, c22660a, i);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        final w30[] w30VarArr = {w30VarM204654F};
        w30VarM204654F.m204618f();
        return true;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (jyb.m147479J(this.f156490d)) {
            return 1;
        }
        return this.f156490d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        IntlDynamicGreetListAct intlDynamicGreetListAct = this.f156489c;
        return i == 10 ? intlDynamicGreetListAct.inflater().inflate(qec0.f156979Y3, viewGroup, false) : intlDynamicGreetListAct.inflater().inflate(qec0.f156903N0, viewGroup, false);
    }

    @Override // p153l.mdk
    /* JADX INFO: renamed from: F */
    public void mo104450F(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        l51.m152888H(this.f156489c, new Runnable() { // from class: l.kbn
            @Override // java.lang.Runnable
            public final void run() {
                this.f124965a.m176054X(str);
            }
        }, 100L);
    }

    @Override // p153l.mdk
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo104449E(View view, final fzq fzqVar, List<Object> list, int i, final int i2) {
        qbn qbnVar;
        if (i == 10) {
            VText vText = (VText) view.findViewById(edc0.f93309X4);
            boolean z = this.f156493g;
            IntlDynamicGreetListAct intlDynamicGreetListAct = this.f156489c;
            vText.setText(z ? intlDynamicGreetListAct.getString(R$string.f21663a4) : intlDynamicGreetListAct.getString(R$string.f21672b4));
            qbnVar = this;
        } else {
            final int itemViewType = getItemViewType(i2);
            if (!this.f156492f.contains(fzqVar.m128224p())) {
                this.f156492f.add(fzqVar.m128224p());
            }
            qbnVar = this;
            ((IntlGreetListItemView) view).m47355h(this.f156489c, qbnVar, fzqVar, itemViewType, new View.OnClickListener() { // from class: l.gbn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f103477a.m176047V(fzqVar, i2, itemViewType, view2);
                }
            }, new View.OnLongClickListener() { // from class: l.hbn
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return this.f108605a.m176048W(fzqVar, view2);
                }
            });
        }
        if (i2 < qbnVar.f156490d.size() - 3 || qbnVar.f156490d.size() <= 10) {
            return;
        }
        qbnVar.f156489c.m47346Z1().mo99365t0();
    }

    /* JADX INFO: renamed from: T */
    public List<fzq> m176052T() {
        return this.f156490d;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public fzq getItem(int i) {
        return !jyb.m147479J(this.f156490d) ? this.f156490d.get(i) : new fzq();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m176054X(final String str) {
        int iM147476G = jyb.m147476G(this.f156490d, new qcj() { // from class: l.nbn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((fzq) obj).m128224p(), str));
            }
        });
        if (iM147476G >= 0) {
            fzq fzqVarRemove = this.f156490d.remove(iM147476G);
            if (NullChecker.m82486a(fzqVarRemove)) {
                this.f156491e.remove(fzqVarRemove.m128216f());
            }
            notifyItemRemoved(iM147476G);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m176055Y() {
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: b0 */
    public void m176056b0(List<fzq> list) {
        List<fzq> listM147510h = jyb.m147510h(list, new zhe());
        this.f156490d.clear();
        this.f156490d.addAll(m176045R(listM147510h));
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (jyb.m147479J(this.f156490d)) {
            return 10;
        }
        return this.f156493g ? 30 : 20;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
    }

    public qbn(IntlDynamicGreetListAct intlDynamicGreetListAct, boolean z) {
        this(intlDynamicGreetListAct);
        this.f156493g = z;
    }
}
