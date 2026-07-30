package com.p000p1.mobile.putong.core.p001ui.messages.model;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageChatFireSettingAct;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageNicknameSettingAct;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageProfileSettingAct;
import com.p000p1.mobile.putong.core.p001ui.messages.model.MessageNewProfileSettingViewModel;
import com.p000p1.mobile.putong.core.p001ui.messages.model.view.MessageNewProfileSettingFunItem;
import com.p000p1.mobile.putong.core.p001ui.messages.model.view.MessageNewProfileSettingHead;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.settings.SetTickleAct;
import com.p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.c3c0;
import l.c40;
import l.ivz;
import l.juk;
import l.l6c0;
import l.t100;
import l.ukj0;
import l.ura;
import l.vwb;
import l.xdl0;
import l.xp5;
import l.y19;
import l.zvf0;
import p003l.d30;
import p003l.dac0;
import p003l.e30;
import p003l.rp2;
import p003l.w9j;
import p028v.VListCell;
import p028v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MessageNewProfileSettingViewModel extends rp2 {

    /* JADX INFO: renamed from: c */
    public C0128b f1773c;

    /* JADX INFO: renamed from: d */
    public MessageNewProfileSettingHead f1774d;

    /* JADX INFO: renamed from: e */
    public Type f1775e;

    /* JADX INFO: renamed from: f */
    public boolean f1776f;

    /* JADX INFO: renamed from: g */
    public c40 f1777g;

    public enum Type {
        head(0, "", new e30() { // from class: l.otz
            @Override // p003l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m2396a((Pair) obj);
            }
        }),
        nick_name(ura.e().d().I4() ? c3c0.t6 : c3c0.s6, "设置备注名", new e30() { // from class: l.ttz
            @Override // p003l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m2399g((Pair) obj);
            }
        }),
        top_chat(ura.e().d().I4() ? c3c0.B6 : c3c0.A6, "置顶聊天", new e30() { // from class: l.ctz
            @Override // p003l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m2397b((Pair) obj);
            }
        }),
        chat_fire(c3c0.a0, "聊天火花", new e30() { // from class: l.dtz
            @Override // p003l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m2401i((Pair) obj);
            }
        }),
        search_chat_history(ura.e().d().I4() ? c3c0.x6 : c3c0.w6, "搜索聊天记录", new e30() { // from class: l.etz
            @Override // p003l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m2411u((Pair) obj);
            }
        }),
        clear_chat_history(ura.e().d().I4() ? c3c0.r6 : c3c0.q6, "清空聊天记录", new e30() { // from class: l.ftz
            @Override // p003l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m2405o((Pair) obj);
            }
        }),
        share(ura.e().d().I4() ? c3c0.m4 : c3c0.l4, "让朋友帮你参谋一下", new e30() { // from class: l.gtz
            @Override // p003l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m2414x((Pair) obj);
            }
        }),
        chat_background(ura.e().d().I4() ? c3c0.p6 : c3c0.o6, "设置聊天背景", new e30() { // from class: l.htz
            @Override // p003l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m2407q((Pair) obj);
            }
        }),
        set_clap(ura.e().d().I4() ? c3c0.z6 : c3c0.y6, "设置拍一拍", new e30() { // from class: l.itz
            @Override // p003l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m2402j((Pair) obj);
            }
        }),
        mini_widget_clap(ura.e().d().I4() ? c3c0.W4 : c3c0.V4, "小组件设置", new e30() { // from class: l.jtz
            @Override // p003l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m2400h((Pair) obj);
            }
        }),
        un_match(ura.e().d().I4() ? c3c0.D6 : c3c0.C6, App.e.getString(R.string.w5), new e30() { // from class: l.ptz
            @Override // p003l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m2398f((Pair) obj);
            }
        }),
        add_black_list(c3c0.A1, App.e.getString(R.string.H2), new e30() { // from class: l.qtz
            @Override // p003l.e30
            public final void call(Object obj) {
                Pair pair = (Pair) obj;
                ((MessageNewProfileSettingViewModel) pair.first).f7032b.t0((User) pair.second);
            }
        }),
        report(ura.e().d().I4() ? c3c0.v6 : c3c0.u6, "举报", new e30() { // from class: l.rtz
            @Override // p003l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m2409s((Pair) obj);
            }
        }),
        line(0, "", new e30() { // from class: l.stz
            @Override // p003l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m2408r((Pair) obj);
            }
        });

        public e30<Pair<MessageNewProfileSettingViewModel, User>> click;
        public String des;
        public int iconId;

        Type(int i, String str, e30 e30Var) {
            this.iconId = i;
            this.des = str;
            this.click = e30Var;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m2396a(Pair pair) {
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m2397b(Pair pair) {
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m2398f(Pair pair) {
            MessageNewProfileSettingViewModel messageNewProfileSettingViewModel = (MessageNewProfileSettingViewModel) pair.first;
            ukj0.b(messageNewProfileSettingViewModel.f7031a, messageNewProfileSettingViewModel.f7032b.x0(), "p_chat_view");
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m2399g(Pair pair) {
            zvf0.r("e_edit_nickname", ((MessageNewProfileSettingViewModel) pair.first).f7031a.pageId());
            MessageNewProfileSettingViewModel messageNewProfileSettingViewModel = (MessageNewProfileSettingViewModel) pair.first;
            PutongMvpAct putongMvpAct = messageNewProfileSettingViewModel.f7031a;
            putongMvpAct.startActivity(MessageNicknameSettingAct.m1990Z1(putongMvpAct, messageNewProfileSettingViewModel.f7032b.x0()));
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m2400h(Pair pair) {
            ((MessageNewProfileSettingViewModel) pair.first).act().startActivity(WebViewAct.Z1(((MessageNewProfileSettingViewModel) pair.first).act(), "小组件设置", juk.e() ? "https://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/subassembly/index.html?from=chat_settings" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/subassembly/index.html?from=chat_settings"));
            zvf0.r("e_chat_setting_widget", "p_chat_setting");
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ void m2401i(Pair pair) {
            zvf0.r("e_spark_setting", ((MessageNewProfileSettingViewModel) pair.first).f7031a.pageId());
            PutongMvpAct putongMvpAct = ((MessageNewProfileSettingViewModel) pair.first).f7031a;
            putongMvpAct.startActivity(MessageChatFireSettingAct.m1927Z1(putongMvpAct, ((DbObject) ((User) pair.second)).id));
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ void m2402j(Pair pair) {
            MessageNewProfileSettingViewModel messageNewProfileSettingViewModel = (MessageNewProfileSettingViewModel) pair.first;
            PutongMvpAct putongMvpAct = messageNewProfileSettingViewModel.f7031a;
            putongMvpAct.startActivity(SetTickleAct.a2(putongMvpAct, messageNewProfileSettingViewModel.f7032b.x0(), true));
        }

        /* JADX INFO: renamed from: m */
        public static /* synthetic */ void m2403m(Pair pair) {
            if (NullChecker.a(CoreModule.c.e0.oa(((MessageNewProfileSettingViewModel) pair.first).f7032b.x0())) && NullChecker.a(CoreModule.c.e0.oa(((MessageNewProfileSettingViewModel) pair.first).f7032b.x0()).fp().profileSmall())) {
                CoreModule.c.f0.Gp(((MessageNewProfileSettingViewModel) pair.first).act(), true, ((MessageNewProfileSettingViewModel) pair.first).f7032b.x0(), CoreModule.c.e0.oa(((MessageNewProfileSettingViewModel) pair.first).f7032b.x0()).fp().profileSmall());
            }
        }

        /* JADX INFO: renamed from: n */
        public static /* synthetic */ void m2404n(Act act, Pair pair, VListCell vListCell, VListCell.C1338a c1338a, int i) {
            String string = c1338a.f12784a.toString();
            if (act.getResources().getString(R.string.K1).equals(string)) {
                zvf0.r("e_choose_background_picture", act.pageId());
                ((MessageNewProfileSettingViewModel) pair.first).m7365n();
                ((MessageNewProfileSettingViewModel) pair.first).f1777g.b();
            } else if (act.getResources().getString(R.string.v).equals(string)) {
                zvf0.r("e_cancel_background", act.pageId());
                ((MessageNewProfileSettingViewModel) pair.first).f7032b.N0((Picture) null);
                act.finish();
            }
            ((MessageNewProfileSettingViewModel) pair.first).f1777g.b();
        }

        /* JADX INFO: renamed from: o */
        public static /* synthetic */ void m2405o(final Pair pair) {
            CoreBusinessService coreBusinessServiceA = CoreModule.P().a();
            MessageNewProfileSettingViewModel messageNewProfileSettingViewModel = (MessageNewProfileSettingViewModel) pair.first;
            coreBusinessServiceA.eo(messageNewProfileSettingViewModel.f7031a, messageNewProfileSettingViewModel.f7032b.x0(), new d30() { // from class: l.ktz
                @Override // p003l.d30
                public final void call() {
                    MessageNewProfileSettingViewModel.Type.m2410t(pair);
                }
            }, (d30) null);
        }

        /* JADX INFO: renamed from: q */
        public static /* synthetic */ void m2407q(final Pair pair) {
            final PutongMvpAct putongMvpAct = ((MessageNewProfileSettingViewModel) pair.first).f7031a;
            zvf0.r("e_edit_background", putongMvpAct.pageId());
            Conversation conversationXe = CoreModule.c.f0.Xe(((DbObject) ((User) pair.second)).id);
            if (conversationXe == null) {
                return;
            }
            if (vwb.J(conversationXe.localChatBg)) {
                ((MessageNewProfileSettingViewModel) pair.first).m7365n();
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(putongMvpAct.getResources().getString(R.string.K1));
            arrayList.add(putongMvpAct.getResources().getString(R.string.v));
            c40.b bVar = new c40.b(putongMvpAct);
            bVar.I(putongMvpAct.getResources().getString(R.string.a)).U(new View.OnClickListener() { // from class: l.mtz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((MessageNewProfileSettingViewModel) pair.first).f1777g.b();
                }
            }).Q(arrayList).V(new c40.d() { // from class: l.ntz
                /* JADX INFO: renamed from: a */
                public final void m6568a(VListCell vListCell, VListCell.C1338a c1338a, int i) {
                    MessageNewProfileSettingViewModel.Type.m2404n(putongMvpAct, pair, vListCell, c1338a, i);
                }
            });
            ((MessageNewProfileSettingViewModel) pair.first).f1777g = bVar.F();
            ((MessageNewProfileSettingViewModel) pair.first).f1777g.f();
        }

        /* JADX INFO: renamed from: r */
        public static /* synthetic */ void m2408r(Pair pair) {
        }

        /* JADX INFO: renamed from: s */
        public static /* synthetic */ void m2409s(final Pair pair) {
            PutongMvpAct putongMvpAct = ((MessageNewProfileSettingViewModel) pair.first).f7031a;
            CoreService coreServiceK = CoreModule.K();
            MessageNewProfileSettingViewModel messageNewProfileSettingViewModel = (MessageNewProfileSettingViewModel) pair.first;
            putongMvpAct.startActivity(coreServiceK.toReportAct(messageNewProfileSettingViewModel.f7031a, messageNewProfileSettingViewModel.f7032b.x0(), true, new ResultReceiver(null) { // from class: com.p1.mobile.putong.core.ui.messages.model.MessageNewProfileSettingViewModel.Type.1
                @Override // android.os.ResultReceiver
                public void onReceiveResult(int i, Bundle bundle) {
                    if (y19.H() && i == -1) {
                        ((MessageNewProfileSettingViewModel) pair.first).f7031a.finish();
                    }
                }
            }));
        }

        /* JADX INFO: renamed from: t */
        public static /* synthetic */ void m2410t(Pair pair) {
            ((MessageNewProfileSettingViewModel) pair.first).f7032b.O0();
            ((MessageNewProfileSettingViewModel) pair.first).f7031a.finish();
        }

        /* JADX INFO: renamed from: u */
        public static /* synthetic */ void m2411u(Pair pair) {
            zvf0.r("e_search_chat_history", ((MessageNewProfileSettingViewModel) pair.first).f7031a.pageId());
            PutongMvpAct putongMvpAct = ((MessageNewProfileSettingViewModel) pair.first).f7031a;
            CoreBusinessService coreBusinessServiceA = CoreModule.P().a();
            MessageNewProfileSettingViewModel messageNewProfileSettingViewModel = (MessageNewProfileSettingViewModel) pair.first;
            putongMvpAct.startActivity(coreBusinessServiceA.rj(messageNewProfileSettingViewModel.f7031a, messageNewProfileSettingViewModel.f7032b.x0()));
        }

        /* JADX INFO: renamed from: v */
        public static /* synthetic */ void m2412v(Pair pair) {
            if (NullChecker.a(CoreModule.c.e0.oa(((MessageNewProfileSettingViewModel) pair.first).f7032b.x0())) && NullChecker.a(CoreModule.c.e0.oa(((MessageNewProfileSettingViewModel) pair.first).f7032b.x0()).fp().profileSmall())) {
                CoreModule.c.f0.Gp(((MessageNewProfileSettingViewModel) pair.first).act(), false, ((MessageNewProfileSettingViewModel) pair.first).f7032b.x0(), CoreModule.c.e0.oa(((MessageNewProfileSettingViewModel) pair.first).f7032b.x0()).fp().profileSmall());
            }
        }

        /* JADX INFO: renamed from: x */
        public static /* synthetic */ void m2414x(final Pair pair) {
            zvf0.r("e_chat_setting_share", "p_chat_setting");
            CoreModule.P().a().bd(((MessageNewProfileSettingViewModel) pair.first).act(), "chat_setting", new d30() { // from class: l.btz
                @Override // p003l.d30
                public final void call() {
                    MessageNewProfileSettingViewModel.Type.m2412v(pair);
                }
            }, new d30() { // from class: l.ltz
                @Override // p003l.d30
                public final void call() {
                    MessageNewProfileSettingViewModel.Type.m2403m(pair);
                }
            });
        }

        public void setDes(String str) {
            this.des = str;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.MessageNewProfileSettingViewModel$a */
    public class C0127a extends RecyclerView.n {
        public C0127a() {
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            rect.bottom = t100.q;
            int i = t100.y;
            rect.left = i;
            rect.right = i;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.MessageNewProfileSettingViewModel$b */
    public class C0128b extends dac0<Type> {

        /* JADX INFO: renamed from: c */
        public User f1779c;

        /* JADX INFO: renamed from: d */
        public int f1780d;

        /* JADX INFO: renamed from: e */
        public final int f1781e = 1;

        /* JADX INFO: renamed from: f */
        public final int f1782f = 2;

        /* JADX INFO: renamed from: g */
        public final int f1783g = 3;

        /* JADX INFO: renamed from: h */
        public List<Type> f1784h = new ArrayList();

        public C0128b() {
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: C */
        public int mo203C() {
            return this.f1784h.size();
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: D */
        public View mo204D(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return MessageNewProfileSettingViewModel.this.f1774d;
            }
            if (i != 3) {
                return MessageNewProfileSettingViewModel.this.f7031a.inflater().inflate(l6c0.z2, viewGroup, false);
            }
            View view = new View(MessageNewProfileSettingViewModel.this.f7031a);
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, t100.d));
            int i2 = t100.y;
            xdl0.V(view, i2);
            xdl0.W(view, i2);
            return view;
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo202A(View view, Type type, int i, int i2) {
            if (i == 1) {
                MessageNewProfileSettingViewModel.this.f1774d.m2664B(MessageNewProfileSettingViewModel.this, this.f1779c, this.f1780d);
            } else if (i == 3) {
                view.setBackgroundColor(Color.parseColor("#F9F9F9"));
            } else {
                ((MessageNewProfileSettingFunItem) view).m2661O(MessageNewProfileSettingViewModel.this, this.f1779c, type);
            }
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public Type getItem(int i) {
            return this.f1784h.get(i);
        }

        /* JADX INFO: renamed from: G */
        public List<Type> m2417G() {
            return this.f1784h;
        }

        /* JADX INFO: renamed from: H */
        public void m2418H(User user, int i, List<Type> list) {
            this.f1779c = user;
            this.f1780d = i;
            this.f1784h = list;
            notifyDataSetChanged();
        }

        public long getItemId(int i) {
            return i;
        }

        public int getItemViewType(int i) {
            Type item = getItem(i);
            if (item == Type.head) {
                return 1;
            }
            return item == Type.line ? 3 : 2;
        }
    }

    public MessageNewProfileSettingViewModel(MessageProfileSettingAct messageProfileSettingAct) {
        super(messageProfileSettingAct);
        this.f1775e = null;
        this.f1776f = false;
    }

    @Override // p003l.rp2
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo2385C0() {
        return this.f7031a;
    }

    @Override // p003l.rp2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo2388i1(ivz ivzVar) {
        super.mo2388i1(ivzVar);
    }

    @Override // p003l.rp2
    /* JADX INFO: renamed from: d */
    public void mo2387d(User user, int i) {
        Conversation conversationXe = CoreModule.c.f0.Xe(((DbObject) user).id);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Type.head);
        Type type = Type.line;
        arrayList.add(type);
        if (ura.e().d().l() && !user.isTeamAccount() && !this.f7032b.C0()) {
            arrayList.add(Type.nick_name);
        }
        if (ura.e().d().W8() && NullChecker.a(conversationXe) && conversationXe.doubleDefault() && !user.isTeamAccount()) {
            arrayList.add(Type.chat_fire);
            zvf0.x("e_spark_setting", this.f7031a.pageId());
        }
        arrayList.add(type);
        if (y19.U()) {
            arrayList.add(Type.search_chat_history);
            zvf0.x("e_search_chat_history", this.f7031a.pageId());
        }
        if (!m7362c(user, conversationXe) && !m7364f(user) && !xp5.o(conversationXe, user)) {
            arrayList.add(Type.clear_chat_history);
        }
        boolean z = (((DbObject) user).id.equals(CoreModule.H().userId()) || user.isTeamAccount()) ? false : true;
        arrayList.add(type);
        if (ura.e().d().l() && !user.isTeamAccount() && !this.f7032b.C0()) {
            arrayList.add(Type.chat_background);
        }
        if (CoreModule.o.d().D() && !user.isTeamAccount() && !this.f7032b.C0()) {
            arrayList.add(Type.set_clap);
        }
        arrayList.add(type);
        CoreModule.N().isMatchedByRelationship(user);
        user.unilateralBlock();
        if (NullChecker.a(CoreModule.c)) {
            CoreModule.c.f0.Xe(this.f7032b.x0());
        }
        if (!m7362c(user, conversationXe) && z) {
            arrayList.add(Type.un_match);
        }
        if (z) {
            arrayList.add(Type.report);
        }
        if (NullChecker.a(conversationXe) && conversationXe.isSeeUpgradedConv()) {
            vwb.d0(arrayList, new w9j() { // from class: l.zsz
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return this.f9413a.m2395x((MessageNewProfileSettingViewModel.Type) obj);
                }
            });
        }
        m2393v(user, arrayList);
        this.f1773c.m2418H(user, i, arrayList);
    }

    @Override // p003l.rp2
    public void destroy() {
    }

    @Override // p003l.rp2
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView vRecyclerView = new VRecyclerView(layoutInflater.getContext());
        vRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        vRecyclerView.addItemDecoration(new C0127a());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f7031a);
        linearLayoutManager.setOrientation(1);
        vRecyclerView.setLayoutManager(linearLayoutManager);
        this.f1774d = (MessageNewProfileSettingHead) this.f7031a.inflater().inflate(l6c0.A2, viewGroup, false);
        C0128b c0128b = new C0128b();
        this.f1773c = c0128b;
        vRecyclerView.setAdapter(c0128b);
        return vRecyclerView;
    }

    @Override // p003l.rp2
    /* JADX INFO: renamed from: j */
    public void mo2389j() {
        C0128b c0128b = this.f1773c;
        if (c0128b == null) {
            return;
        }
        c0128b.notifyDataSetChanged();
    }

    @Override // p003l.rp2
    /* JADX INFO: renamed from: k */
    public void mo2390k(User user) {
        if (NullChecker.a(this.f1774d)) {
            this.f1774d.m2667z(user);
        }
    }

    @Override // p003l.rp2
    /* JADX INFO: renamed from: l */
    public void mo2391l(boolean z) {
        C0128b c0128b = this.f1773c;
        if (c0128b == null) {
            return;
        }
        List<Type> listM2417G = c0128b.m2417G();
        if (vwb.J(listM2417G)) {
            return;
        }
        Type.un_match.setDes((!z || y19.P()) ? act().getString(R.string.w5) : "熄灭信号");
        if (z) {
            listM2417G.remove(Type.clear_chat_history);
            listM2417G.remove(Type.set_clap);
            this.f1773c.notifyDataSetChanged();
        }
    }

    @Override // p003l.rp2
    /* JADX INFO: renamed from: p */
    public void mo2392p(boolean z) {
        Type type;
        int iIndexOf;
        C0128b c0128b = this.f1773c;
        if (c0128b == null) {
            return;
        }
        List<Type> listM2417G = c0128b.m2417G();
        if (vwb.J(listM2417G) || (iIndexOf = listM2417G.indexOf((type = Type.add_black_list))) < 0) {
            return;
        }
        type.setDes(z ? App.e.getString(R.string.k2) : App.e.getString(R.string.H2));
        this.f1773c.notifyItemChanged(iIndexOf);
    }

    /* JADX INFO: renamed from: v */
    public final void m2393v(final User user, List<Type> list) {
        this.f1776f = false;
        vwb.d0(list, new w9j() { // from class: l.atz
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f2279a.m2394w(user, (MessageNewProfileSettingViewModel.Type) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Boolean m2394w(User user, Type type) {
        if (this.f1776f && user.isTeamAccount() && type == Type.line) {
            return Boolean.TRUE;
        }
        Type type2 = this.f1775e;
        Type type3 = Type.line;
        if (type2 == type3 && type == type3) {
            return Boolean.TRUE;
        }
        if (type == type3) {
            this.f1776f = true;
        }
        this.f1775e = type;
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Boolean m2395x(Type type) {
        boolean z = (type == Type.head || type == Type.line || type == Type.nick_name || type == Type.chat_background || type == Type.mini_widget_clap || type == Type.report) ? false : true;
        if (!z) {
            this.f1775e = type;
        }
        return Boolean.valueOf(z);
    }
}
