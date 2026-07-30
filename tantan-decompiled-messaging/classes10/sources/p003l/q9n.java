package p003l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.data.Conversation;
import com.p000p1.mobile.putong.core.data.NotificationStatus;
import com.p000p1.mobile.putong.core.message.R$string;
import com.p000p1.mobile.putong.core.p001ui.intl.greet.message.IntlDynamicGreetListAct;
import com.p000p1.mobile.putong.core.p001ui.intl.greet.message.IntlGreetListItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Channel;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l.c40;
import l.e30;
import l.e51;
import l.fxq;
import l.ige;
import l.mkd0;
import l.roj0;
import l.vak;
import l.vge;
import l.vwb;
import l.w9j;
import v.VListCell;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class q9n extends vak<fxq> {

    /* JADX INFO: renamed from: c */
    public final IntlDynamicGreetListAct f6992c;

    /* JADX INFO: renamed from: d */
    public final List<fxq> f6993d;

    /* JADX INFO: renamed from: e */
    public final HashMap<String, fxq> f6994e;

    /* JADX INFO: renamed from: f */
    public Set<String> f6995f;

    /* JADX INFO: renamed from: g */
    public boolean f6996g;

    public q9n(IntlDynamicGreetListAct intlDynamicGreetListAct) {
        this.f6994e = new HashMap<>();
        this.f6995f = new HashSet();
        this.f6996g = false;
        this.f6992c = intlDynamicGreetListAct;
        this.f6993d = new ArrayList();
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m8926K(Throwable th) {
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m8928M(vak vakVar, fxq fxqVar, roj0 roj0Var) {
        CoreModule.c.r0.J6();
        vakVar.F(fxqVar.p());
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m8931P(IntlDynamicGreetListAct intlDynamicGreetListAct, vak vakVar, fxq fxqVar, c40[] c40VarArr, VListCell vListCell, VListCell.a aVar, int i) {
        m8933S(intlDynamicGreetListAct, vakVar, fxqVar);
        c40VarArr[0].b();
    }

    /* JADX INFO: renamed from: R */
    private List<fxq> m8932R(List<fxq> list) {
        for (fxq fxqVar : list) {
            boolean zEquals = "default".equals(fxqVar.m());
            HashMap<String, fxq> map = this.f6994e;
            if (zEquals) {
                map.put(fxqVar.f(), fxqVar);
            } else {
                map.remove(fxqVar.f());
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f6994e.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(this.f6994e.get(it.next()));
        }
        if (this.f6996g) {
            Collections.sort(arrayList);
            return arrayList;
        }
        ArrayList arrayListN = vwb.n(arrayList, new w9j() { // from class: l.l9n
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((fxq) obj).b().channel, Channel.get(Conversation.INSTANT_CHAT)));
            }
        });
        vwb.I(arrayListN, new ige());
        ArrayList arrayListN2 = vwb.n(arrayList, new w9j() { // from class: l.m9n
            public final Object call(Object obj) {
                return Boolean.valueOf(!TEnum.equals(((fxq) obj).b().channel, Channel.get(Conversation.INSTANT_CHAT)));
            }
        });
        vwb.I(arrayListN2, new ige());
        arrayList.clear();
        arrayList.addAll(arrayListN);
        arrayList.addAll(arrayListN2);
        return arrayList;
    }

    /* JADX INFO: renamed from: S */
    private static void m8933S(Act act, final vak<fxq> vakVar, final fxq fxqVar) {
        act.duringCreated(CoreModule.c.r0.j5(fxqVar.p(), fxqVar.b().messages.latestId)).take(1).subscribe(mkd0.H(new e30() { // from class: l.o9n
            public final void call(Object obj) {
                q9n.m8928M(vakVar, fxqVar, (roj0) obj);
            }
        }, new e30() { // from class: l.p9n
            public final void call(Object obj) {
                q9n.m8926K((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m8934V(fxq fxqVar, int i, int i2, View view) {
        m8936Z(this.f6992c, fxqVar, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ boolean m8935W(fxq fxqVar, View view) {
        return m8937a0(this.f6992c, fxqVar, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z */
    public static void m8936Z(IntlDynamicGreetListAct intlDynamicGreetListAct, fxq fxqVar, int i, int i2) {
        nmn.m8355l(intlDynamicGreetListAct, fxqVar.b(), NotificationStatus.undefined);
        intlDynamicGreetListAct.overridePendingTransition(szb0.f7494e, szb0.f7493d);
        fxqVar.M(0);
        intlDynamicGreetListAct.m3532Z1().m7487e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    public static boolean m8937a0(final IntlDynamicGreetListAct intlDynamicGreetListAct, final fxq fxqVar, final vak<fxq> vakVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(intlDynamicGreetListAct.getString(R$string.f605d));
        c40.b bVar = new c40.b(intlDynamicGreetListAct);
        bVar.I(intlDynamicGreetListAct.getResources().getString(R$string.f578a)).U(new View.OnClickListener() { // from class: l.i9n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c40VarArr[0].b();
            }
        }).Q(arrayList).V(new c40.d() { // from class: l.j9n
            /* JADX INFO: renamed from: a */
            public final void m7380a(VListCell vListCell, VListCell.a aVar, int i) {
                q9n.m8931P(intlDynamicGreetListAct, vakVar, fxqVar, c40VarArr, vListCell, aVar, i);
            }
        });
        c40 c40VarF = bVar.F();
        final c40[] c40VarArr = {c40VarF};
        c40VarF.f();
        return true;
    }

    /* JADX INFO: renamed from: C */
    public int m8938C() {
        if (vwb.J(this.f6993d)) {
            return 1;
        }
        return this.f6993d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m8939D(ViewGroup viewGroup, int i) {
        IntlDynamicGreetListAct intlDynamicGreetListAct = this.f6992c;
        return i == 10 ? intlDynamicGreetListAct.inflater().inflate(l6c0.f5932Y3, viewGroup, false) : intlDynamicGreetListAct.inflater().inflate(l6c0.f5856N0, viewGroup, false);
    }

    /* JADX INFO: renamed from: F */
    public void m8941F(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e51.H(this.f6992c, new Runnable() { // from class: l.k9n
            @Override // java.lang.Runnable
            public final void run() {
                this.f5628a.m8945X(str);
            }
        }, 100L);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void m8940E(View view, final fxq fxqVar, List<Object> list, int i, final int i2) {
        q9n q9nVar;
        if (i == 10) {
            VText vTextFindViewById = view.findViewById(y4c0.f8791X4);
            boolean z = this.f6996g;
            PutongAct putongAct = this.f6992c;
            vTextFindViewById.setText(z ? putongAct.getString(R$string.f583a4) : putongAct.getString(R$string.f592b4));
            q9nVar = this;
        } else {
            final int itemViewType = getItemViewType(i2);
            if (!this.f6995f.contains(fxqVar.p())) {
                this.f6995f.add(fxqVar.p());
            }
            q9nVar = this;
            ((IntlGreetListItemView) view).m3540h(this.f6992c, q9nVar, fxqVar, itemViewType, new View.OnClickListener() { // from class: l.g9n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f4597a.m8934V(fxqVar, i2, itemViewType, view2);
                }
            }, new View.OnLongClickListener() { // from class: l.h9n
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return this.f4850a.m8935W(fxqVar, view2);
                }
            });
        }
        if (i2 < q9nVar.f6993d.size() - 3 || q9nVar.f6993d.size() <= 10) {
            return;
        }
        q9nVar.f6992c.m3531Y1().mo5475t0();
    }

    /* JADX INFO: renamed from: T */
    public List<fxq> m8943T() {
        return this.f6993d;
    }

    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public fxq getItem(int i) {
        return !vwb.J(this.f6993d) ? this.f6993d.get(i) : new fxq();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m8945X(final String str) {
        int iG = vwb.G(this.f6993d, new w9j() { // from class: l.n9n
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((fxq) obj).p(), str));
            }
        });
        if (iG >= 0) {
            fxq fxqVarRemove = this.f6993d.remove(iG);
            if (NullChecker.a(fxqVarRemove)) {
                this.f6994e.remove(fxqVarRemove.f());
            }
            notifyItemRemoved(iG);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m8946Y() {
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: b0 */
    public void m8947b0(List<fxq> list) {
        List<fxq> listH = vwb.h(list, new vge());
        this.f6993d.clear();
        this.f6993d.addAll(m8932R(listH));
        notifyDataSetChanged();
    }

    public long getItemId(int i) {
        return i;
    }

    public int getItemViewType(int i) {
        if (vwb.J(this.f6993d)) {
            return 10;
        }
        return this.f6996g ? 30 : 20;
    }

    public q9n(IntlDynamicGreetListAct intlDynamicGreetListAct, boolean z) {
        this(intlDynamicGreetListAct);
        this.f6996g = z;
    }

    /* JADX INFO: renamed from: e */
    public void m8948e(int i) {
    }
}
