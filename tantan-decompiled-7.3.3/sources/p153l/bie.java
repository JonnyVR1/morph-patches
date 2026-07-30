package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.AIMessageFeedback;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.NotificationStatus;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.newui.greet.DynamicGreetListAct;
import com.p051p1.mobile.putong.core.newui.greet.DynamicGreetListItemView;
import com.p051p1.mobile.putong.core.newui.greet.NewDynamicGreetListItemView;
import com.p051p1.mobile.putong.core.p058ui.greet.C8523d;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.ConnectivityReceiver;
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

/* JADX INFO: loaded from: classes11.dex */
public class bie extends mdk<fzq> {

    /* JADX INFO: renamed from: c */
    public final DynamicGreetListAct f76861c;

    /* JADX INFO: renamed from: e */
    public final HashMap<String, fzq> f76863e = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public Set<String> f76864f = new HashSet();

    /* JADX INFO: renamed from: g */
    public boolean f76865g = false;

    /* JADX INFO: renamed from: d */
    public final List<fzq> f76862d = new ArrayList();

    public bie(DynamicGreetListAct dynamicGreetListAct) {
        this.f76861c = dynamicGreetListAct;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m104429H(Throwable th) {
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m104434M(Throwable th) {
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m104435N(mdk mdkVar, fzq fzqVar, uxj0 uxj0Var) {
        CoreModule.f18264c.f20420r0.m35095J6();
        mdkVar.mo104450F(fzqVar.m128224p());
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m104436O(mdk mdkVar, fzq fzqVar, uxj0 uxj0Var) {
        CoreModule.f18264c.f20420r0.m35095J6();
        mdkVar.mo104450F(fzqVar.m128224p());
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m104437P(fzq fzqVar, Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 40042 || i == 40044 || i == 40045) {
                o1j0.m165651y("对方账号异常");
                return;
            } else {
                if (i == 40046) {
                    CoreModule.f18264c.f20384f0.m33905ap(fzqVar.m128215b().otherUser);
                    return;
                }
                return;
            }
        }
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (g39.m128719e(tantanForbidden)) {
                o1j0.m165651y("对方同意配对后可发送消息，请耐心等待");
            } else if (g39.m128718d(tantanForbidden)) {
                o1j0.m165651y(tantanForbidden.message);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m104438Q(DynamicGreetListAct dynamicGreetListAct, mdk mdkVar, fzq fzqVar, w30[] w30VarArr, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        if (dynamicGreetListAct.m37460a2()) {
            m104443X(dynamicGreetListAct, mdkVar, fzqVar);
        } else {
            m104444Y(dynamicGreetListAct, mdkVar, fzqVar);
        }
        w30VarArr[0].m204614b();
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m104439R(Message message, fzq fzqVar, mdk mdkVar, Message message2) {
        if ("coin".equals(message.consumeType)) {
            CoreModule.f18264c.f20312H0.m155449k5();
        } else if ("privilege".equals(message.consumeType)) {
            CoreModule.f18264c.f20297C0.m146425v4();
        }
        if (CoreModule.m30932N().mo61573so()) {
            CoreModule.m30932N().mo61462Gm().add(fzqVar.m128215b().f21143id);
        }
        CoreModule.f18264c.f20420r0.m35095J6();
        mdkVar.mo104450F(fzqVar.m128224p());
    }

    /* JADX INFO: renamed from: X */
    public static void m104443X(Act act, final mdk<fzq> mdkVar, final fzq fzqVar) {
        act.duringCreated(CoreModule.f18264c.f20420r0.m35079B6(fzqVar.m128224p(), fzqVar.m128215b().messages.latestId)).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.qhe
            @Override // p153l.y20
            public final void call(Object obj) {
                bie.m104435N(mdkVar, fzqVar, (uxj0) obj);
            }
        }, new y20() { // from class: l.rhe
            @Override // p153l.y20
            public final void call(Object obj) {
                bie.m104429H((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y */
    public static void m104444Y(Act act, final mdk<fzq> mdkVar, final fzq fzqVar) {
        act.duringCreated(CoreModule.f18264c.f20420r0.m35129j5(fzqVar.m128224p(), fzqVar.m128215b().messages.latestId)).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.ohe
            @Override // p153l.y20
            public final void call(Object obj) {
                bie.m104436O(mdkVar, fzqVar, (uxj0) obj);
            }
        }, new y20() { // from class: l.phe
            @Override // p153l.y20
            public final void call(Object obj) {
                bie.m104434M((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public static void m104445h0(DynamicGreetListAct dynamicGreetListAct, fzq fzqVar, int i, int i2) {
        C8523d.m47083i(dynamicGreetListAct, fzqVar.m128215b(), dynamicGreetListAct.m37459Z1() ? "meet" : NotificationStatus.undefined);
        dynamicGreetListAct.overridePendingTransition(y7c0.f197767e, y7c0.f197766d);
        i4g0.m138523u("e_kankan_stranger_message_item", dynamicGreetListAct.pageId(), new pf60("user_id", fzqVar.m128224p()), new pf60("is_red_dot", Integer.valueOf(fzqVar.m128223o() > 0 ? 1 : 0)), new pf60("identify", dynamicGreetListAct.m37460a2() ? Channel.fake : AIMessageFeedback.good), new pf60("greeting_type", i2 == 20 ? "receive" : "call"));
        fzqVar.m128209M(0);
        dynamicGreetListAct.m37463d2().mo158501d();
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m104446i0(final DynamicGreetListAct dynamicGreetListAct, final fzq fzqVar, final mdk<fzq> mdkVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(dynamicGreetListAct.getString(R$string.f21685d));
        w30.C21001b c21001b = new w30.C21001b(dynamicGreetListAct);
        c21001b.m204657I(dynamicGreetListAct.getResources().getString(R$string.f21658a)).m204669U(new View.OnClickListener() { // from class: l.whe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w30VarArr[0].m204614b();
            }
        }).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.xhe
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                bie.m104438Q(dynamicGreetListAct, mdkVar, fzqVar, w30VarArr, vListCell, c22660a, i);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        final w30[] w30VarArr = {w30VarM204654F};
        w30VarM204654F.m204618f();
        return true;
    }

    /* JADX INFO: renamed from: j0 */
    public static void m104447j0(DynamicGreetListAct dynamicGreetListAct, fzq fzqVar, mdk<fzq> mdkVar) {
        i4g0.m138523u("e_greeting_new_reply", dynamicGreetListAct.pageId(), jyb.m147494Y("to_uid", fzqVar.m128224p()));
        if (!ConnectivityReceiver.m82467g()) {
            o1j0.m165651y("网络异常");
            return;
        }
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.two_sides_different_tip);
        m104448k0(dynamicGreetListAct, fzqVar, messageNew_, mdkVar);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m104448k0(Act act, final fzq fzqVar, final Message message, final mdk<fzq> mdkVar) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            if (userM116600p9.isJailed()) {
                CoreModule.m30930K().startJailedDialogLikeAct();
                return;
            } else if (userM116600p9.isNameFake()) {
                CoreModule.m30933P().m143412i().mo180291A(act);
                return;
            }
        }
        CoreModule.f18264c.f20420r0.m35152u6(fzqVar.m128215b().f21143id, Channel.get("greeting"), message, "", null).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.uhe
            @Override // p153l.y20
            public final void call(Object obj) {
                bie.m104439R(message, fzqVar, mdkVar, (Message) obj);
            }
        }, new y20() { // from class: l.vhe
            @Override // p153l.y20
            public final void call(Object obj) {
                bie.m104437P(fzqVar, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.f76861c.m37461b2() && jyb.m147479J(this.f76862d)) {
            return 1;
        }
        return this.f76862d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        View viewInflate;
        if (i == 10) {
            viewInflate = this.f76861c.inflater().inflate(qec0.f156979Y3, viewGroup, false);
        } else {
            boolean zM104455b0 = m104455b0(i);
            DynamicGreetListAct dynamicGreetListAct = this.f76861c;
            viewInflate = zM104455b0 ? dynamicGreetListAct.inflater().inflate(qec0.f156985Z3, viewGroup, false) : dynamicGreetListAct.inflater().inflate(qec0.f157148x, viewGroup, false);
        }
        if (viewInflate instanceof DynamicGreetListItemView) {
            ((DynamicGreetListItemView) viewInflate).m37468e(i);
        }
        return viewInflate;
    }

    @Override // p153l.mdk
    /* JADX INFO: renamed from: F */
    public void mo104450F(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        l51.m152888H(this.f76861c, new Runnable() { // from class: l.yhe
            @Override // java.lang.Runnable
            public final void run() {
                this.f199958a.m104459f0(str);
            }
        }, 100L);
    }

    @Override // p153l.mdk
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo104449E(View view, final fzq fzqVar, List<Object> list, int i, final int i2) {
        bie bieVar;
        String strConcat;
        if (i == 10) {
            VText vText = (VText) view.findViewById(edc0.f93309X4);
            String str = this.f76865g ? "你还没有发出任何" : "你还没有收到任何";
            if (this.f76861c.m37460a2()) {
                strConcat = str.concat("消息");
            } else {
                strConcat = (CoreModule.f18276o.m132214d().mo34703I5() || CoreModule.m30933P().m143405a().mo34529jj()) ? str.concat("告白") : str.concat("招呼");
            }
            vText.setText(strConcat);
            uqb0.f180374G.m127138Y0((SimpleDraweeView) view.findViewById(edc0.f93492y1), ibc0.f114095o1);
            bieVar = this;
        } else if (m104455b0(i)) {
            final int itemViewType = getItemViewType(i2);
            if (!this.f76864f.contains(fzqVar.m128224p())) {
                this.f76864f.add(fzqVar.m128224p());
                i4g0.m138492A("e_kankan_stranger_message_item", this.f76861c.pageId(), new pf60("user_id", fzqVar.m128224p()), new pf60("is_red_dot", Integer.valueOf(fzqVar.m128223o() > 0 ? 1 : 0)), new pf60("identify", this.f76861c.m37460a2() ? Channel.fake : AIMessageFeedback.good), new pf60("greeting_type", itemViewType == 20 ? "receive" : "call"));
            }
            bieVar = this;
            ((NewDynamicGreetListItemView) view).m37497j(this.f76861c, bieVar, fzqVar, itemViewType, new View.OnClickListener() { // from class: l.khe
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f126862a.m104456c0(fzqVar, i2, itemViewType, view2);
                }
            }, new View.OnLongClickListener() { // from class: l.she
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return this.f168698a.m104457d0(fzqVar, view2);
                }
            }, new View.OnClickListener() { // from class: l.the
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f174357a.m104458e0(fzqVar, view2);
                }
            });
        } else {
            bieVar = this;
            ((DynamicGreetListItemView) view).m37473j(bieVar.f76861c, fzqVar, bieVar.getItemViewType(i2), i2);
        }
        if (i2 < bieVar.f76862d.size() - 3 || bieVar.f76862d.size() <= 10) {
            return;
        }
        bieVar.f76861c.m37462c2().mo154363C0();
    }

    /* JADX INFO: renamed from: W */
    public final List<fzq> m104452W(List<fzq> list) {
        for (fzq fzqVar : list) {
            boolean zEquals = "default".equals(fzqVar.m128221m());
            HashMap<String, fzq> map = this.f76863e;
            if (zEquals) {
                map.put(fzqVar.m128216f(), fzqVar);
            } else {
                map.remove(fzqVar.m128216f());
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f76863e.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(this.f76863e.get(it.next()));
        }
        if (this.f76865g) {
            Collections.sort(arrayList);
            return arrayList;
        }
        ArrayList arrayListM147522n = jyb.m147522n(arrayList, new qcj() { // from class: l.lhe
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((fzq) obj).m128215b().channel, Channel.get("instant_chat")));
            }
        });
        jyb.m147478I(arrayListM147522n, new mhe());
        ArrayList arrayListM147522n2 = jyb.m147522n(arrayList, new qcj() { // from class: l.nhe
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

    /* JADX INFO: renamed from: Z */
    public List<fzq> m104453Z() {
        return this.f76862d;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public fzq getItem(int i) {
        return !jyb.m147479J(this.f76862d) ? this.f76862d.get(i) : new fzq();
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m104455b0(int i) {
        return i == 20 || i == 30;
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m104456c0(fzq fzqVar, int i, int i2, View view) {
        m104445h0(this.f76861c, fzqVar, i, i2);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ boolean m104457d0(fzq fzqVar, View view) {
        return m104446i0(this.f76861c, fzqVar, this);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m104458e0(fzq fzqVar, View view) {
        m104447j0(this.f76861c, fzqVar, this);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m104459f0(final String str) {
        int iM147476G = jyb.m147476G(this.f76862d, new qcj() { // from class: l.aie
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((fzq) obj).m128224p(), str));
            }
        });
        if (iM147476G >= 0) {
            fzq fzqVarRemove = this.f76862d.remove(iM147476G);
            if (NullChecker.m82486a(fzqVarRemove)) {
                this.f76863e.remove(fzqVarRemove.m128216f());
            }
            notifyItemRemoved(iM147476G);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m104460g0() {
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        boolean zM37461b2 = this.f76861c.m37461b2();
        List<fzq> list = this.f76862d;
        if (zM37461b2) {
            if (jyb.m147479J(list)) {
                return 10;
            }
            return this.f76865g ? 30 : 20;
        }
        fzq fzqVar = list.get(i);
        if (fzqVar == null || fzqVar.m128218h() == null) {
            return 0;
        }
        if (fzqVar.m128218h().size() > 0 && (fzqVar.m128218h().get(0) instanceof Video)) {
            return 5;
        }
        if (fzqVar.m128218h().size() <= 0 || !(fzqVar.m128218h().get(0) instanceof Audio)) {
            return Math.min(fzqVar.m128218h().size(), 4);
        }
        return 6;
    }

    /* JADX INFO: renamed from: l0 */
    public void m104461l0(List<fzq> list) {
        List<fzq> listM147510h = jyb.m147510h(list, new zhe());
        this.f76862d.clear();
        this.f76862d.addAll(m104452W(listM147510h));
        if (this.f76861c.m37459Z1() && jyb.m147479J(this.f76862d)) {
            this.f76861c.m37463d2().mo158502e();
        }
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
    }
}
