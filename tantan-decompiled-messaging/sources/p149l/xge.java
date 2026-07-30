package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.AIMessageFeedback;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.NotificationStatus;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.newui.greet.DynamicGreetListAct;
import com.p046p1.mobile.putong.core.newui.greet.DynamicGreetListItemView;
import com.p046p1.mobile.putong.core.newui.greet.NewDynamicGreetListItemView;
import com.p046p1.mobile.putong.core.p053ui.greet.C8360d;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.ConnectivityReceiver;
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

/* JADX INFO: loaded from: classes11.dex */
public class xge extends vak<fxq> {

    /* JADX INFO: renamed from: c */
    public final DynamicGreetListAct f192761c;

    /* JADX INFO: renamed from: e */
    public final HashMap<String, fxq> f192763e = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public Set<String> f192764f = new HashSet();

    /* JADX INFO: renamed from: g */
    public boolean f192765g = false;

    /* JADX INFO: renamed from: d */
    public final List<fxq> f192762d = new ArrayList();

    public xge(DynamicGreetListAct dynamicGreetListAct) {
        this.f192761c = dynamicGreetListAct;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m208639H(Throwable th) {
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m208644M(Throwable th) {
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m208645N(vak vakVar, fxq fxqVar, roj0 roj0Var) {
        CoreModule.f17545c.f19678r0.m34092J6();
        vakVar.mo173643F(fxqVar.m123668p());
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m208646O(vak vakVar, fxq fxqVar, roj0 roj0Var) {
        CoreModule.f17545c.f19678r0.m34092J6();
        vakVar.mo173643F(fxqVar.m123668p());
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m208647P(fxq fxqVar, Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 40042 || i == 40044 || i == 40045) {
                lsi0.m151595y("对方账号异常");
                return;
            } else {
                if (i == 40046) {
                    CoreModule.f17545c.f19642f0.m32902ap(fxqVar.m123659b().otherUser);
                    return;
                }
                return;
            }
        }
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (x19.m206695e(tantanForbidden)) {
                lsi0.m151595y("对方同意配对后可发送消息，请耐心等待");
            } else if (x19.m206694d(tantanForbidden)) {
                lsi0.m151595y(tantanForbidden.message);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m208648Q(DynamicGreetListAct dynamicGreetListAct, vak vakVar, fxq fxqVar, c40[] c40VarArr, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        if (dynamicGreetListAct.m36457Z1()) {
            m208653X(dynamicGreetListAct, vakVar, fxqVar);
        } else {
            m208654Y(dynamicGreetListAct, vakVar, fxqVar);
        }
        c40VarArr[0].m105113b();
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m208649R(Message message, fxq fxqVar, vak vakVar, Message message2) {
        if ("coin".equals(message.consumeType)) {
            CoreModule.f17545c.f19570H0.m210361k5();
        } else if ("privilege".equals(message.consumeType)) {
            CoreModule.f17545c.f19555C0.m210112u4();
        }
        if (CoreModule.m29934N().mo60389so()) {
            CoreModule.m29934N().mo60278Gm().add(fxqVar.m123659b().f20401id);
        }
        CoreModule.f17545c.f19678r0.m34092J6();
        vakVar.mo173643F(fxqVar.m123668p());
    }

    /* JADX INFO: renamed from: X */
    public static void m208653X(Act act, final vak<fxq> vakVar, final fxq fxqVar) {
        act.duringCreated(CoreModule.f17545c.f19678r0.m34076B6(fxqVar.m123668p(), fxqVar.m123659b().messages.latestId)).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.mge
            @Override // p149l.e30
            public final void call(Object obj) {
                xge.m208645N(vakVar, fxqVar, (roj0) obj);
            }
        }, new e30() { // from class: l.nge
            @Override // p149l.e30
            public final void call(Object obj) {
                xge.m208639H((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y */
    public static void m208654Y(Act act, final vak<fxq> vakVar, final fxq fxqVar) {
        act.duringCreated(CoreModule.f17545c.f19678r0.m34126j5(fxqVar.m123668p(), fxqVar.m123659b().messages.latestId)).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.kge
            @Override // p149l.e30
            public final void call(Object obj) {
                xge.m208646O(vakVar, fxqVar, (roj0) obj);
            }
        }, new e30() { // from class: l.lge
            @Override // p149l.e30
            public final void call(Object obj) {
                xge.m208644M((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public static void m208655h0(DynamicGreetListAct dynamicGreetListAct, fxq fxqVar, int i, int i2) {
        C8360d.m45900i(dynamicGreetListAct, fxqVar.m123659b(), dynamicGreetListAct.m36456Y1() ? "meet" : NotificationStatus.undefined);
        dynamicGreetListAct.overridePendingTransition(szb0.f167030e, szb0.f167029d);
        zvf0.m220399u("e_kankan_stranger_message_item", dynamicGreetListAct.pageId(), new j760("user_id", fxqVar.m123668p()), new j760("is_red_dot", Integer.valueOf(fxqVar.m123667o() > 0 ? 1 : 0)), new j760("identify", dynamicGreetListAct.m36457Z1() ? Channel.fake : AIMessageFeedback.good), new j760("greeting_type", i2 == 20 ? "receive" : "call"));
        fxqVar.m123653M(0);
        dynamicGreetListAct.m36460c2().mo136192d();
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m208656i0(final DynamicGreetListAct dynamicGreetListAct, final fxq fxqVar, final vak<fxq> vakVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(dynamicGreetListAct.getString(R$string.f20943d));
        c40.C16057b c16057b = new c40.C16057b(dynamicGreetListAct);
        c16057b.m105156I(dynamicGreetListAct.getResources().getString(R$string.f20916a)).m105168U(new View.OnClickListener() { // from class: l.sge
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c40VarArr[0].m105113b();
            }
        }).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.tge
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                xge.m208648Q(dynamicGreetListAct, vakVar, fxqVar, c40VarArr, vListCell, c22545a, i);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        final c40[] c40VarArr = {c40VarM105153F};
        c40VarM105153F.m105117f();
        return true;
    }

    /* JADX INFO: renamed from: j0 */
    public static void m208657j0(DynamicGreetListAct dynamicGreetListAct, fxq fxqVar, vak<fxq> vakVar) {
        zvf0.m220399u("e_greeting_new_reply", dynamicGreetListAct.pageId(), vwb.m200311Y("to_uid", fxqVar.m123668p()));
        if (!ConnectivityReceiver.m81284g()) {
            lsi0.m151595y("网络异常");
            return;
        }
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.two_sides_different_tip);
        m208658k0(dynamicGreetListAct, fxqVar, messageNew_, vakVar);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m208658k0(Act act, final fxq fxqVar, final Message message, final vak<fxq> vakVar) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            if (userM169527p9.isJailed()) {
                CoreModule.m29932K().startJailedDialogLikeAct();
                return;
            } else if (userM169527p9.isNameFake()) {
                CoreModule.m29935P().m94658i().mo158199A(act);
                return;
            }
        }
        CoreModule.f17545c.f19678r0.m34149u6(fxqVar.m123659b().f20401id, Channel.get("greeting"), message, "", null).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.qge
            @Override // p149l.e30
            public final void call(Object obj) {
                xge.m208649R(message, fxqVar, vakVar, (Message) obj);
            }
        }, new e30() { // from class: l.rge
            @Override // p149l.e30
            public final void call(Object obj) {
                xge.m208647P(fxqVar, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.f192761c.m36458a2() && vwb.m200296J(this.f192762d)) {
            return 1;
        }
        return this.f192762d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        View viewInflate;
        if (i == 10) {
            viewInflate = this.f192761c.inflater().inflate(l6c0.f126423Y3, viewGroup, false);
        } else {
            boolean zM208663b0 = m208663b0(i);
            DynamicGreetListAct dynamicGreetListAct = this.f192761c;
            viewInflate = zM208663b0 ? dynamicGreetListAct.inflater().inflate(l6c0.f126429Z3, viewGroup, false) : dynamicGreetListAct.inflater().inflate(l6c0.f126592x, viewGroup, false);
        }
        if (viewInflate instanceof DynamicGreetListItemView) {
            ((DynamicGreetListItemView) viewInflate).m36465e(i);
        }
        return viewInflate;
    }

    @Override // p149l.vak
    /* JADX INFO: renamed from: F */
    public void mo173643F(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e51.m114743H(this.f192761c, new Runnable() { // from class: l.uge
            @Override // java.lang.Runnable
            public final void run() {
                this.f176378a.m208667f0(str);
            }
        }, 100L);
    }

    @Override // p149l.vak
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo173642E(View view, final fxq fxqVar, List<Object> list, int i, final int i2) {
        xge xgeVar;
        String strConcat;
        if (i == 10) {
            VText vText = (VText) view.findViewById(y4c0.f196074X4);
            String str = this.f192765g ? "你还没有发出任何" : "你还没有收到任何";
            if (this.f192761c.m36457Z1()) {
                strConcat = str.concat("消息");
            } else {
                strConcat = (CoreModule.f17557o.m195057d().mo33700I5() || CoreModule.m29935P().m94651a().mo33526jj()) ? str.concat("告白") : str.concat("招呼");
            }
            vText.setText(strConcat);
            qib0.f154691G.m102354Y0((SimpleDraweeView) view.findViewById(y4c0.f196257y1), c3c0.f78820o1);
            xgeVar = this;
        } else if (m208663b0(i)) {
            final int itemViewType = getItemViewType(i2);
            if (!this.f192764f.contains(fxqVar.m123668p())) {
                this.f192764f.add(fxqVar.m123668p());
                zvf0.m220368A("e_kankan_stranger_message_item", this.f192761c.pageId(), new j760("user_id", fxqVar.m123668p()), new j760("is_red_dot", Integer.valueOf(fxqVar.m123667o() > 0 ? 1 : 0)), new j760("identify", this.f192761c.m36457Z1() ? Channel.fake : AIMessageFeedback.good), new j760("greeting_type", itemViewType == 20 ? "receive" : "call"));
            }
            xgeVar = this;
            ((NewDynamicGreetListItemView) view).m36494j(this.f192761c, xgeVar, fxqVar, itemViewType, new View.OnClickListener() { // from class: l.gge
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f102491a.m208664c0(fxqVar, i2, itemViewType, view2);
                }
            }, new View.OnLongClickListener() { // from class: l.oge
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return this.f143856a.m208665d0(fxqVar, view2);
                }
            }, new View.OnClickListener() { // from class: l.pge
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f148635a.m208666e0(fxqVar, view2);
                }
            });
        } else {
            xgeVar = this;
            ((DynamicGreetListItemView) view).m36470j(xgeVar.f192761c, fxqVar, xgeVar.getItemViewType(i2), i2);
        }
        if (i2 < xgeVar.f192762d.size() - 3 || xgeVar.f192762d.size() <= 10) {
            return;
        }
        xgeVar.f192761c.m36459b2().mo130960C0();
    }

    /* JADX INFO: renamed from: W */
    public final List<fxq> m208660W(List<fxq> list) {
        for (fxq fxqVar : list) {
            boolean zEquals = "default".equals(fxqVar.m123665m());
            HashMap<String, fxq> map = this.f192763e;
            if (zEquals) {
                map.put(fxqVar.m123660f(), fxqVar);
            } else {
                map.remove(fxqVar.m123660f());
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f192763e.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(this.f192763e.get(it.next()));
        }
        if (this.f192765g) {
            Collections.sort(arrayList);
            return arrayList;
        }
        ArrayList arrayListM200339n = vwb.m200339n(arrayList, new w9j() { // from class: l.hge
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((fxq) obj).m123659b().channel, Channel.get("instant_chat")));
            }
        });
        vwb.m200295I(arrayListM200339n, new ige());
        ArrayList arrayListM200339n2 = vwb.m200339n(arrayList, new w9j() { // from class: l.jge
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

    /* JADX INFO: renamed from: Z */
    public List<fxq> m208661Z() {
        return this.f192762d;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public fxq getItem(int i) {
        return !vwb.m200296J(this.f192762d) ? this.f192762d.get(i) : new fxq();
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m208663b0(int i) {
        return i == 20 || i == 30;
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m208664c0(fxq fxqVar, int i, int i2, View view) {
        m208655h0(this.f192761c, fxqVar, i, i2);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ boolean m208665d0(fxq fxqVar, View view) {
        return m208656i0(this.f192761c, fxqVar, this);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m208666e0(fxq fxqVar, View view) {
        m208657j0(this.f192761c, fxqVar, this);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m208667f0(final String str) {
        int iM200293G = vwb.m200293G(this.f192762d, new w9j() { // from class: l.wge
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((fxq) obj).m123668p(), str));
            }
        });
        if (iM200293G >= 0) {
            fxq fxqVarRemove = this.f192762d.remove(iM200293G);
            if (NullChecker.m81303a(fxqVarRemove)) {
                this.f192763e.remove(fxqVarRemove.m123660f());
            }
            notifyItemRemoved(iM200293G);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m208668g0() {
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        boolean zM36458a2 = this.f192761c.m36458a2();
        List<fxq> list = this.f192762d;
        if (zM36458a2) {
            if (vwb.m200296J(list)) {
                return 10;
            }
            return this.f192765g ? 30 : 20;
        }
        fxq fxqVar = list.get(i);
        if (fxqVar == null || fxqVar.m123662h() == null) {
            return 0;
        }
        if (fxqVar.m123662h().size() > 0 && (fxqVar.m123662h().get(0) instanceof Video)) {
            return 5;
        }
        if (fxqVar.m123662h().size() <= 0 || !(fxqVar.m123662h().get(0) instanceof Audio)) {
            return Math.min(fxqVar.m123662h().size(), 4);
        }
        return 6;
    }

    /* JADX INFO: renamed from: l0 */
    public void m208669l0(List<fxq> list) {
        List<fxq> listM200327h = vwb.m200327h(list, new vge());
        this.f192762d.clear();
        this.f192762d.addAll(m208660W(listM200327h));
        if (this.f192761c.m36456Y1() && vwb.m200296J(this.f192762d)) {
            this.f192761c.m36460c2().mo136193e();
        }
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
    }
}
