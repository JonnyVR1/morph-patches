package p009l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.greet.DynamicGreetListAct;
import com.p000p1.mobile.putong.core.newui.greet.DynamicGreetListItemView;
import com.p000p1.mobile.putong.core.newui.greet.NewDynamicGreetListItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.greet.d;
import com.p1.mobile.putong.data.Audio;
import com.p1.mobile.putong.data.Channel;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l.c3c0;
import l.c40;
import l.d30;
import l.e30;
import l.e51;
import l.j760;
import l.l6c0;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.roj0;
import l.szb0;
import l.vwb;
import l.w9j;
import l.x19;
import l.y4c0;
import l.zvf0;
import v.VListCell;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class xge extends vak<fxq> {

    /* JADX INFO: renamed from: c */
    public final DynamicGreetListAct f22598c;

    /* JADX INFO: renamed from: e */
    public final HashMap<String, fxq> f22600e = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public Set<String> f22601f = new HashSet();

    /* JADX INFO: renamed from: g */
    public boolean f22602g = false;

    /* JADX INFO: renamed from: d */
    public final List<fxq> f22599d = new ArrayList();

    public xge(DynamicGreetListAct dynamicGreetListAct) {
        this.f22598c = dynamicGreetListAct;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m24851H(Throwable th) {
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m24856M(Throwable th) {
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m24857N(vak vakVar, fxq fxqVar, roj0 roj0Var) {
        CoreModule.c.r0.J6();
        vakVar.mo23341F(fxqVar.m14621p());
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m24858O(vak vakVar, fxq fxqVar, roj0 roj0Var) {
        CoreModule.c.r0.J6();
        vakVar.mo23341F(fxqVar.m14621p());
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m24859P(fxq fxqVar, Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 40042 || i == 40044 || i == 40045) {
                lsi0.y("对方账号异常");
                return;
            } else {
                if (i == 40046) {
                    CoreModule.c.f0.ap(fxqVar.m14612b().otherUser);
                    return;
                }
                return;
            }
        }
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (x19.e(tantanForbidden)) {
                lsi0.y("对方同意配对后可发送消息，请耐心等待");
            } else if (x19.d(tantanForbidden)) {
                lsi0.y(tantanForbidden.message);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m24860Q(DynamicGreetListAct dynamicGreetListAct, vak vakVar, fxq fxqVar, c40[] c40VarArr, VListCell vListCell, VListCell.a aVar, int i) {
        if (dynamicGreetListAct.m386Z1()) {
            m24865X(dynamicGreetListAct, vakVar, fxqVar);
        } else {
            m24866Y(dynamicGreetListAct, vakVar, fxqVar);
        }
        c40VarArr[0].b();
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m24861R(Message message, fxq fxqVar, vak vakVar, Message message2) {
        if ("coin".equals(message.consumeType)) {
            CoreModule.c.H0.k5();
        } else if ("privilege".equals(message.consumeType)) {
            CoreModule.c.C0.u4();
        }
        if (CoreModule.N().so()) {
            CoreModule.N().Gm().add(fxqVar.m14612b().id);
        }
        CoreModule.c.r0.J6();
        vakVar.mo23341F(fxqVar.m14621p());
    }

    /* JADX INFO: renamed from: X */
    public static void m24865X(Act act, final vak<fxq> vakVar, final fxq fxqVar) {
        act.duringCreated(CoreModule.c.r0.B6(fxqVar.m14621p(), fxqVar.m14612b().messages.latestId)).take(1).subscribe(mkd0.H(new e30() { // from class: l.mge
            public final void call(Object obj) {
                xge.m24857N(vakVar, fxqVar, (roj0) obj);
            }
        }, new e30() { // from class: l.nge
            public final void call(Object obj) {
                xge.m24851H((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y */
    public static void m24866Y(Act act, final vak<fxq> vakVar, final fxq fxqVar) {
        act.duringCreated(CoreModule.c.r0.j5(fxqVar.m14621p(), fxqVar.m14612b().messages.latestId)).take(1).subscribe(mkd0.H(new e30() { // from class: l.kge
            public final void call(Object obj) {
                xge.m24858O(vakVar, fxqVar, (roj0) obj);
            }
        }, new e30() { // from class: l.lge
            public final void call(Object obj) {
                xge.m24856M((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public static void m24867h0(DynamicGreetListAct dynamicGreetListAct, fxq fxqVar, int i, int i2) {
        d.i(dynamicGreetListAct, fxqVar.m14612b(), dynamicGreetListAct.m385Y1() ? "meet" : "undefined");
        dynamicGreetListAct.overridePendingTransition(szb0.e, szb0.d);
        zvf0.u("e_kankan_stranger_message_item", dynamicGreetListAct.pageId(), new j760[]{new j760("user_id", fxqVar.m14621p()), new j760("is_red_dot", Integer.valueOf(fxqVar.m14620o() > 0 ? 1 : 0)), new j760("identify", dynamicGreetListAct.m386Z1() ? "fake" : "good"), new j760("greeting_type", i2 == 20 ? "receive" : "call")});
        fxqVar.m14606M(0);
        dynamicGreetListAct.m389c2().mo16549d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public static boolean m24868i0(final DynamicGreetListAct dynamicGreetListAct, final fxq fxqVar, final vak<fxq> vakVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(dynamicGreetListAct.getString(R.string.d));
        c40.b bVar = new c40.b(dynamicGreetListAct);
        bVar.I(dynamicGreetListAct.getResources().getString(R.string.a)).U(new View.OnClickListener() { // from class: l.sge
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c40VarArr[0].b();
            }
        }).Q(arrayList).V(new c40.d() { // from class: l.tge
            /* JADX INFO: renamed from: a */
            public final void m22510a(VListCell vListCell, VListCell.a aVar, int i) {
                xge.m24860Q(dynamicGreetListAct, vakVar, fxqVar, c40VarArr, vListCell, aVar, i);
            }
        });
        c40 c40VarF = bVar.F();
        final c40[] c40VarArr = {c40VarF};
        c40VarF.f();
        return true;
    }

    /* JADX INFO: renamed from: j0 */
    public static void m24869j0(DynamicGreetListAct dynamicGreetListAct, fxq fxqVar, vak<fxq> vakVar) {
        zvf0.u("e_greeting_new_reply", dynamicGreetListAct.pageId(), new j760[]{vwb.Y("to_uid", fxqVar.m14621p())});
        if (!ConnectivityReceiver.g()) {
            lsi0.y("网络异常");
            return;
        }
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("two_sides_different_tip");
        m24870k0(dynamicGreetListAct, fxqVar, messageNew_, vakVar);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m24870k0(Act act, final fxq fxqVar, final Message message, final vak<fxq> vakVar) {
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9)) {
            if (userP9.isJailed()) {
                CoreModule.K().startJailedDialogLikeAct();
                return;
            } else if (userP9.isNameFake()) {
                CoreModule.P().i().A(act);
                return;
            }
        }
        CoreModule.c.r0.u6(fxqVar.m14612b().id, Channel.get("greeting"), message, "", (d30) null).take(1).subscribe(mkd0.H(new e30() { // from class: l.qge
            public final void call(Object obj) {
                xge.m24861R(message, fxqVar, vakVar, (Message) obj);
            }
        }, new e30() { // from class: l.rge
            public final void call(Object obj) {
                xge.m24859P(fxqVar, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public int m24871C() {
        if (this.f22598c.m387a2() && vwb.J(this.f22599d)) {
            return 1;
        }
        return this.f22599d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m24872D(ViewGroup viewGroup, int i) {
        View viewInflate;
        if (i == 10) {
            viewInflate = this.f22598c.inflater().inflate(l6c0.Y3, viewGroup, false);
        } else {
            boolean zM24877b0 = m24877b0(i);
            DynamicGreetListAct dynamicGreetListAct = this.f22598c;
            viewInflate = zM24877b0 ? dynamicGreetListAct.inflater().inflate(l6c0.Z3, viewGroup, false) : dynamicGreetListAct.inflater().inflate(l6c0.x, viewGroup, false);
        }
        if (viewInflate instanceof DynamicGreetListItemView) {
            ((DynamicGreetListItemView) viewInflate).m394e(i);
        }
        return viewInflate;
    }

    @Override // p009l.vak
    /* JADX INFO: renamed from: F */
    public void mo23341F(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e51.H(this.f22598c, new Runnable() { // from class: l.uge
            @Override // java.lang.Runnable
            public final void run() {
                this.f21137a.m24882f0(str);
            }
        }, 100L);
    }

    @Override // p009l.vak
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo23340E(View view, final fxq fxqVar, List<Object> list, int i, final int i2) {
        xge xgeVar;
        String strConcat;
        if (i == 10) {
            VText vTextFindViewById = view.findViewById(y4c0.X4);
            String str = this.f22602g ? "你还没有发出任何" : "你还没有收到任何";
            if (this.f22598c.m386Z1()) {
                strConcat = str.concat("消息");
            } else {
                strConcat = (CoreModule.o.d().I5() || CoreModule.P().a().jj()) ? str.concat("告白") : str.concat("招呼");
            }
            vTextFindViewById.setText(strConcat);
            qib0.G.Y0(view.findViewById(y4c0.y1), c3c0.o1);
            xgeVar = this;
        } else if (m24877b0(i)) {
            final int itemViewType = getItemViewType(i2);
            if (!this.f22601f.contains(fxqVar.m14621p())) {
                this.f22601f.add(fxqVar.m14621p());
                zvf0.A("e_kankan_stranger_message_item", this.f22598c.pageId(), new j760[]{new j760("user_id", fxqVar.m14621p()), new j760("is_red_dot", Integer.valueOf(fxqVar.m14620o() > 0 ? 1 : 0)), new j760("identify", this.f22598c.m386Z1() ? "fake" : "good"), new j760("greeting_type", itemViewType == 20 ? "receive" : "call")});
            }
            xgeVar = this;
            ((NewDynamicGreetListItemView) view).m423j(this.f22598c, xgeVar, fxqVar, itemViewType, new View.OnClickListener() { // from class: l.gge
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f13531a.m24878c0(fxqVar, i2, itemViewType, view2);
                }
            }, new View.OnLongClickListener() { // from class: l.oge
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return this.f18025a.m24879d0(fxqVar, view2);
                }
            }, new View.OnClickListener() { // from class: l.pge
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f18537a.m24881e0(fxqVar, view2);
                }
            });
        } else {
            xgeVar = this;
            ((DynamicGreetListItemView) view).m399j(xgeVar.f22598c, fxqVar, xgeVar.getItemViewType(i2), i2);
        }
        if (i2 < xgeVar.f22599d.size() - 3 || xgeVar.f22599d.size() <= 10) {
            return;
        }
        xgeVar.f22598c.m388b2().mo15705C0();
    }

    /* JADX INFO: renamed from: W */
    public final List<fxq> m24874W(List<fxq> list) {
        for (fxq fxqVar : list) {
            boolean zEquals = "default".equals(fxqVar.m14618m());
            HashMap<String, fxq> map = this.f22600e;
            if (zEquals) {
                map.put(fxqVar.m14613f(), fxqVar);
            } else {
                map.remove(fxqVar.m14613f());
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f22600e.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(this.f22600e.get(it.next()));
        }
        if (this.f22602g) {
            Collections.sort(arrayList);
            return arrayList;
        }
        ArrayList arrayListN = vwb.n(arrayList, new w9j() { // from class: l.hge
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((fxq) obj).m14612b().channel, Channel.get("instant_chat")));
            }
        });
        vwb.I(arrayListN, new Comparator() { // from class: l.ige
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((fxq) obj).compareTo((fxq) obj2);
            }
        });
        ArrayList arrayListN2 = vwb.n(arrayList, new w9j() { // from class: l.jge
            public final Object call(Object obj) {
                return Boolean.valueOf(!TEnum.equals(((fxq) obj).m14612b().channel, Channel.get("instant_chat")));
            }
        });
        vwb.I(arrayListN2, new Comparator() { // from class: l.ige
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((fxq) obj).compareTo((fxq) obj2);
            }
        });
        arrayList.clear();
        arrayList.addAll(arrayListN);
        arrayList.addAll(arrayListN2);
        return arrayList;
    }

    /* JADX INFO: renamed from: Z */
    public List<fxq> m24875Z() {
        return this.f22599d;
    }

    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public fxq getItem(int i) {
        return !vwb.J(this.f22599d) ? this.f22599d.get(i) : new fxq();
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m24877b0(int i) {
        return i == 20 || i == 30;
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m24878c0(fxq fxqVar, int i, int i2, View view) {
        m24867h0(this.f22598c, fxqVar, i, i2);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ boolean m24879d0(fxq fxqVar, View view) {
        return m24868i0(this.f22598c, fxqVar, this);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m24881e0(fxq fxqVar, View view) {
        m24869j0(this.f22598c, fxqVar, this);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m24882f0(final String str) {
        int iG = vwb.G(this.f22599d, new w9j() { // from class: l.wge
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((fxq) obj).m14621p(), str));
            }
        });
        if (iG >= 0) {
            fxq fxqVarRemove = this.f22599d.remove(iG);
            if (NullChecker.a(fxqVarRemove)) {
                this.f22600e.remove(fxqVarRemove.m14613f());
            }
            notifyItemRemoved(iG);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m24883g0() {
        notifyDataSetChanged();
    }

    public long getItemId(int i) {
        return i;
    }

    public int getItemViewType(int i) {
        boolean zM387a2 = this.f22598c.m387a2();
        List<fxq> list = this.f22599d;
        if (zM387a2) {
            if (vwb.J(list)) {
                return 10;
            }
            return this.f22602g ? 30 : 20;
        }
        fxq fxqVar = list.get(i);
        if (fxqVar == null || fxqVar.m14615h() == null) {
            return 0;
        }
        if (fxqVar.m14615h().size() > 0 && (fxqVar.m14615h().get(0) instanceof Video)) {
            return 5;
        }
        if (fxqVar.m14615h().size() <= 0 || !(fxqVar.m14615h().get(0) instanceof Audio)) {
            return Math.min(fxqVar.m14615h().size(), 4);
        }
        return 6;
    }

    /* JADX INFO: renamed from: l0 */
    public void m24884l0(List<fxq> list) {
        List<fxq> listH = vwb.h(list, new w9j() { // from class: l.vge
            public final Object call(Object obj) {
                return ((fxq) obj).m14613f();
            }
        });
        this.f22599d.clear();
        this.f22599d.addAll(m24874W(listH));
        if (this.f22598c.m385Y1() && vwb.J(this.f22599d)) {
            this.f22598c.m389c2().mo16550e();
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: e */
    public void m24880e(int i) {
    }
}
