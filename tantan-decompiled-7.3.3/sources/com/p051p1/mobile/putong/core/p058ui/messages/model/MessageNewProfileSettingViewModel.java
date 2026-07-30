package com.p051p1.mobile.putong.core.p058ui.messages.model;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageChatFireSettingAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageNicknameSettingAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageProfileSettingAct;
import com.p051p1.mobile.putong.core.p058ui.messages.model.MessageNewProfileSettingViewModel;
import com.p051p1.mobile.putong.core.p058ui.messages.model.view.MessageNewProfileSettingFunItem;
import com.p051p1.mobile.putong.core.p058ui.messages.model.view.MessageNewProfileSettingHead;
import com.p051p1.mobile.putong.core.p058ui.settings.SetTickleAct;
import com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VListCell;
import p151v.VRecyclerView;
import p153l.bnl0;
import p153l.br5;
import p153l.f400;
import p153l.gta;
import p153l.h39;
import p153l.i4g0;
import p153l.ibc0;
import p153l.iq2;
import p153l.jic0;
import p153l.jyb;
import p153l.qa00;
import p153l.qcj;
import p153l.qec0;
import p153l.w30;
import p153l.x20;
import p153l.xtj0;
import p153l.y20;
import p153l.zwk;

/* JADX INFO: loaded from: classes4.dex */
public class MessageNewProfileSettingViewModel extends iq2 {

    /* JADX INFO: renamed from: c */
    public C8708b f32730c;

    /* JADX INFO: renamed from: d */
    public MessageNewProfileSettingHead f32731d;

    /* JADX INFO: renamed from: e */
    public Type f32732e;

    /* JADX INFO: renamed from: f */
    public boolean f32733f;

    /* JADX INFO: renamed from: g */
    public w30 f32734g;

    public enum Type {
        head(0, "", new y20() { // from class: l.l200
            @Override // p153l.y20
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m50450a((Pair) obj);
            }
        }),
        nick_name(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114145t6 : ibc0.f114136s6, "设置备注名", new y20() { // from class: l.q200
            @Override // p153l.y20
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m50453g((Pair) obj);
            }
        }),
        top_chat(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113758B6 : ibc0.f113749A6, "置顶聊天", new y20() { // from class: l.z100
            @Override // p153l.y20
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m50451b((Pair) obj);
            }
        }),
        chat_fire(ibc0.f113968a0, "聊天火花", new y20() { // from class: l.a200
            @Override // p153l.y20
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m50455i((Pair) obj);
            }
        }),
        search_chat_history(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114181x6 : ibc0.f114172w6, "搜索聊天记录", new y20() { // from class: l.b200
            @Override // p153l.y20
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m50465u((Pair) obj);
            }
        }),
        clear_chat_history(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114127r6 : ibc0.f114118q6, "清空聊天记录", new y20() { // from class: l.c200
            @Override // p153l.y20
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m50459o((Pair) obj);
            }
        }),
        share(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114080m4 : ibc0.f114071l4, "让朋友帮你参谋一下", new y20() { // from class: l.d200
            @Override // p153l.y20
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m50468x((Pair) obj);
            }
        }),
        chat_background(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114109p6 : ibc0.f114100o6, "设置聊天背景", new y20() { // from class: l.e200
            @Override // p153l.y20
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m50461q((Pair) obj);
            }
        }),
        set_clap(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114199z6 : ibc0.f114190y6, "设置拍一拍", new y20() { // from class: l.f200
            @Override // p153l.y20
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m50456j((Pair) obj);
            }
        }),
        mini_widget_clap(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113940W4 : ibc0.f113932V4, "小组件设置", new y20() { // from class: l.g200
            @Override // p153l.y20
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m50454h((Pair) obj);
            }
        }),
        un_match(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113776D6 : ibc0.f113767C6, App.f16088e.getString(R$string.f21856w5), new y20() { // from class: l.m200
            @Override // p153l.y20
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m50452f((Pair) obj);
            }
        }),
        add_black_list(ibc0.f113744A1, App.f16088e.getString(R$string.f21509H2), new y20() { // from class: l.n200
            @Override // p153l.y20
            public final void call(Object obj) {
                Pair pair = (Pair) obj;
                ((MessageNewProfileSettingViewModel) pair.first).f116327b.m123850t0((User) pair.second);
            }
        }),
        report(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114163v6 : ibc0.f114154u6, "举报", new y20() { // from class: l.o200
            @Override // p153l.y20
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m50463s((Pair) obj);
            }
        }),
        line(0, "", new y20() { // from class: l.p200
            @Override // p153l.y20
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m50462r((Pair) obj);
            }
        });

        public y20<Pair<MessageNewProfileSettingViewModel, User>> click;
        public String des;
        public int iconId;

        Type(int i, String str, y20 y20Var) {
            this.iconId = i;
            this.des = str;
            this.click = y20Var;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m50450a(Pair pair) {
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m50451b(Pair pair) {
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m50452f(Pair pair) {
            MessageNewProfileSettingViewModel messageNewProfileSettingViewModel = (MessageNewProfileSettingViewModel) pair.first;
            xtj0.m213099b(messageNewProfileSettingViewModel.f116326a, messageNewProfileSettingViewModel.f116327b.m123852x0(), OMSDialogPositon.p_chat_view);
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m50453g(Pair pair) {
            i4g0.m138520r("e_edit_nickname", ((MessageNewProfileSettingViewModel) pair.first).f116326a.pageId());
            MessageNewProfileSettingViewModel messageNewProfileSettingViewModel = (MessageNewProfileSettingViewModel) pair.first;
            MessageProfileSettingAct messageProfileSettingAct = messageNewProfileSettingViewModel.f116326a;
            messageProfileSettingAct.startActivity(MessageNicknameSettingAct.m50085a2(messageProfileSettingAct, messageNewProfileSettingViewModel.f116327b.m123852x0()));
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m50454h(Pair pair) {
            ((MessageNewProfileSettingViewModel) pair.first).getAct().startActivity(WebViewAct.m81347a2(((MessageNewProfileSettingViewModel) pair.first).getAct(), "小组件设置", zwk.m221905e() ? "https://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/subassembly/index.html?from=chat_settings" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/subassembly/index.html?from=chat_settings"));
            i4g0.m138520r("e_chat_setting_widget", "p_chat_setting");
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ void m50455i(Pair pair) {
            i4g0.m138520r("e_spark_setting", ((MessageNewProfileSettingViewModel) pair.first).f116326a.pageId());
            MessageProfileSettingAct messageProfileSettingAct = ((MessageNewProfileSettingViewModel) pair.first).f116326a;
            messageProfileSettingAct.startActivity(MessageChatFireSettingAct.m50025a2(messageProfileSettingAct, ((User) pair.second).f56859id));
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ void m50456j(Pair pair) {
            MessageNewProfileSettingViewModel messageNewProfileSettingViewModel = (MessageNewProfileSettingViewModel) pair.first;
            MessageProfileSettingAct messageProfileSettingAct = messageNewProfileSettingViewModel.f116326a;
            messageProfileSettingAct.startActivity(SetTickleAct.m56214b2(messageProfileSettingAct, messageNewProfileSettingViewModel.f116327b.m123852x0(), true));
        }

        /* JADX INFO: renamed from: m */
        public static /* synthetic */ void m50457m(Pair pair) {
            if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116597oa(((MessageNewProfileSettingViewModel) pair.first).f116327b.m123852x0())) && NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116597oa(((MessageNewProfileSettingViewModel) pair.first).f116327b.m123852x0()).m61308fp().profileSmall())) {
                CoreModule.f18264c.f20384f0.m33667Gp(((MessageNewProfileSettingViewModel) pair.first).getAct(), true, ((MessageNewProfileSettingViewModel) pair.first).f116327b.m123852x0(), CoreModule.f18264c.f20381e0.m116597oa(((MessageNewProfileSettingViewModel) pair.first).f116327b.m123852x0()).m61308fp().profileSmall());
            }
        }

        /* JADX INFO: renamed from: n */
        public static /* synthetic */ void m50458n(Act act, Pair pair, VListCell vListCell, VListCell.C22660a c22660a, int i) {
            String string = c22660a.f210081a.toString();
            if (act.getResources().getString(R$string.f21532K1).equals(string)) {
                i4g0.m138520r("e_choose_background_picture", act.pageId());
                ((MessageNewProfileSettingViewModel) pair.first).m141558n();
                ((MessageNewProfileSettingViewModel) pair.first).f32734g.m204614b();
            } else if (act.getResources().getString(R$string.f21842v).equals(string)) {
                i4g0.m138520r("e_cancel_background", act.pageId());
                ((MessageNewProfileSettingViewModel) pair.first).f116327b.m123848N0(null);
                act.m68056e2();
            }
            ((MessageNewProfileSettingViewModel) pair.first).f32734g.m204614b();
        }

        /* JADX INFO: renamed from: o */
        public static /* synthetic */ void m50459o(final Pair pair) {
            CoreBusinessService coreBusinessServiceM143405a = CoreModule.m30933P().m143405a();
            MessageNewProfileSettingViewModel messageNewProfileSettingViewModel = (MessageNewProfileSettingViewModel) pair.first;
            coreBusinessServiceM143405a.mo34498eo(messageNewProfileSettingViewModel.f116326a, messageNewProfileSettingViewModel.f116327b.m123852x0(), new x20() { // from class: l.h200
                @Override // p153l.x20
                public final void call() {
                    MessageNewProfileSettingViewModel.Type.m50464t(pair);
                }
            }, null);
        }

        /* JADX INFO: renamed from: q */
        public static /* synthetic */ void m50461q(final Pair pair) {
            final MessageProfileSettingAct messageProfileSettingAct = ((MessageNewProfileSettingViewModel) pair.first).f116326a;
            i4g0.m138520r("e_edit_background", messageProfileSettingAct.pageId());
            Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(((User) pair.second).f56859id);
            if (conversationM33859Xe == null) {
                return;
            }
            if (jyb.m147479J(conversationM33859Xe.localChatBg)) {
                ((MessageNewProfileSettingViewModel) pair.first).m141558n();
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(messageProfileSettingAct.getResources().getString(R$string.f21532K1));
            arrayList.add(messageProfileSettingAct.getResources().getString(R$string.f21842v));
            w30.C21001b c21001b = new w30.C21001b(messageProfileSettingAct);
            c21001b.m204657I(messageProfileSettingAct.getResources().getString(R$string.f21658a)).m204669U(new View.OnClickListener() { // from class: l.j200
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((MessageNewProfileSettingViewModel) pair.first).f32734g.m204614b();
                }
            }).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.k200
                @Override // p153l.w30.InterfaceC21003d
                /* JADX INFO: renamed from: a */
                public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                    MessageNewProfileSettingViewModel.Type.m50458n(messageProfileSettingAct, pair, vListCell, c22660a, i);
                }
            });
            ((MessageNewProfileSettingViewModel) pair.first).f32734g = c21001b.m204654F();
            ((MessageNewProfileSettingViewModel) pair.first).f32734g.m204618f();
        }

        /* JADX INFO: renamed from: r */
        public static /* synthetic */ void m50462r(Pair pair) {
        }

        /* JADX INFO: renamed from: s */
        public static /* synthetic */ void m50463s(final Pair pair) {
            MessageProfileSettingAct messageProfileSettingAct = ((MessageNewProfileSettingViewModel) pair.first).f116326a;
            CoreService coreServiceM30930K = CoreModule.m30930K();
            MessageNewProfileSettingViewModel messageNewProfileSettingViewModel = (MessageNewProfileSettingViewModel) pair.first;
            messageProfileSettingAct.startActivity(coreServiceM30930K.toReportAct(messageNewProfileSettingViewModel.f116326a, messageNewProfileSettingViewModel.f116327b.m123852x0(), true, new ResultReceiver(null) { // from class: com.p1.mobile.putong.core.ui.messages.model.MessageNewProfileSettingViewModel.Type.1
                @Override // android.os.ResultReceiver
                public void onReceiveResult(int i, Bundle bundle) {
                    if (h39.m133419H() && i == -1) {
                        ((MessageNewProfileSettingViewModel) pair.first).f116326a.m68056e2();
                    }
                }
            }));
        }

        /* JADX INFO: renamed from: t */
        public static /* synthetic */ void m50464t(Pair pair) {
            ((MessageNewProfileSettingViewModel) pair.first).f116327b.m123849O0();
            ((MessageNewProfileSettingViewModel) pair.first).f116326a.m68056e2();
        }

        /* JADX INFO: renamed from: u */
        public static /* synthetic */ void m50465u(Pair pair) {
            i4g0.m138520r("e_search_chat_history", ((MessageNewProfileSettingViewModel) pair.first).f116326a.pageId());
            MessageProfileSettingAct messageProfileSettingAct = ((MessageNewProfileSettingViewModel) pair.first).f116326a;
            CoreBusinessService coreBusinessServiceM143405a = CoreModule.m30933P().m143405a();
            MessageNewProfileSettingViewModel messageNewProfileSettingViewModel = (MessageNewProfileSettingViewModel) pair.first;
            messageProfileSettingAct.startActivity(coreBusinessServiceM143405a.mo34582rj(messageNewProfileSettingViewModel.f116326a, messageNewProfileSettingViewModel.f116327b.m123852x0()));
        }

        /* JADX INFO: renamed from: v */
        public static /* synthetic */ void m50466v(Pair pair) {
            if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116597oa(((MessageNewProfileSettingViewModel) pair.first).f116327b.m123852x0())) && NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116597oa(((MessageNewProfileSettingViewModel) pair.first).f116327b.m123852x0()).m61308fp().profileSmall())) {
                CoreModule.f18264c.f20384f0.m33667Gp(((MessageNewProfileSettingViewModel) pair.first).getAct(), false, ((MessageNewProfileSettingViewModel) pair.first).f116327b.m123852x0(), CoreModule.f18264c.f20381e0.m116597oa(((MessageNewProfileSettingViewModel) pair.first).f116327b.m123852x0()).m61308fp().profileSmall());
            }
        }

        /* JADX INFO: renamed from: x */
        public static /* synthetic */ void m50468x(final Pair pair) {
            i4g0.m138520r("e_chat_setting_share", "p_chat_setting");
            CoreModule.m30933P().m143405a().mo34474bd(((MessageNewProfileSettingViewModel) pair.first).getAct(), "chat_setting", new x20() { // from class: l.y100
                @Override // p153l.x20
                public final void call() {
                    MessageNewProfileSettingViewModel.Type.m50466v(pair);
                }
            }, new x20() { // from class: l.i200
                @Override // p153l.x20
                public final void call() {
                    MessageNewProfileSettingViewModel.Type.m50457m(pair);
                }
            });
        }

        public void setDes(String str) {
            this.des = str;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.MessageNewProfileSettingViewModel$a */
    public class C8707a extends RecyclerView.AbstractC0578n {
        public C8707a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            super.getItemOffsets(rect, view, recyclerView, c0561a0);
            rect.bottom = qa00.f156330q;
            int i = qa00.f156338y;
            rect.left = i;
            rect.right = i;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.MessageNewProfileSettingViewModel$b */
    public class C8708b extends jic0<Type> {

        /* JADX INFO: renamed from: c */
        public User f32736c;

        /* JADX INFO: renamed from: d */
        public int f32737d;

        /* JADX INFO: renamed from: e */
        public final int f32738e = 1;

        /* JADX INFO: renamed from: f */
        public final int f32739f = 2;

        /* JADX INFO: renamed from: g */
        public final int f32740g = 3;

        /* JADX INFO: renamed from: h */
        public List<Type> f32741h = new ArrayList();

        public C8708b() {
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f32741h.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return MessageNewProfileSettingViewModel.this.f32731d;
            }
            if (i != 3) {
                return MessageNewProfileSettingViewModel.this.f116326a.inflater().inflate(qec0.f157165z2, viewGroup, false);
            }
            View view = new View(MessageNewProfileSettingViewModel.this.f116326a);
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, qa00.f156317d));
            int i2 = qa00.f156338y;
            bnl0.m105538V(view, i2);
            bnl0.m105539W(view, i2);
            return view;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, Type type, int i, int i2) {
            if (i == 1) {
                MessageNewProfileSettingViewModel.this.f32731d.m50700B(MessageNewProfileSettingViewModel.this, this.f32736c, this.f32737d);
            } else if (i == 3) {
                view.setBackgroundColor(Color.parseColor("#F9F9F9"));
            } else {
                ((MessageNewProfileSettingFunItem) view).m50697O(MessageNewProfileSettingViewModel.this, this.f32736c, type);
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public Type getItem(int i) {
            return this.f32741h.get(i);
        }

        /* JADX INFO: renamed from: G */
        public List<Type> m50471G() {
            return this.f32741h;
        }

        /* JADX INFO: renamed from: H */
        public void m50472H(User user, int i, List<Type> list) {
            this.f32736c = user;
            this.f32737d = i;
            this.f32741h = list;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
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
        this.f32732e = null;
        this.f32733f = false;
    }

    @Override // p153l.iq2, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f116326a;
    }

    @Override // p153l.iq2, p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(f400 f400Var) {
        super.mo22064i1(f400Var);
    }

    @Override // p153l.iq2
    /* JADX INFO: renamed from: d */
    public void mo50442d(User user, int i) {
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(user.f56859id);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Type.head);
        Type type = Type.line;
        arrayList.add(type);
        if (gta.m132210e().m132214d().mo34878l() && !user.isTeamAccount() && !this.f116327b.m123841C0()) {
            arrayList.add(Type.nick_name);
        }
        if (gta.m132210e().m132214d().mo34776W8() && NullChecker.m82486a(conversationM33859Xe) && conversationM33859Xe.doubleDefault() && !user.isTeamAccount()) {
            arrayList.add(Type.chat_fire);
            i4g0.m138526x("e_spark_setting", this.f116326a.pageId());
        }
        arrayList.add(type);
        if (h39.m133432U()) {
            arrayList.add(Type.search_chat_history);
            i4g0.m138526x("e_search_chat_history", this.f116326a.pageId());
        }
        if (!m141555c(user, conversationM33859Xe) && !m141557f(user) && !br5.m106044o(conversationM33859Xe, user)) {
            arrayList.add(Type.clear_chat_history);
        }
        boolean z = (user.f56859id.equals(CoreModule.m30929H().userId()) || user.isTeamAccount()) ? false : true;
        arrayList.add(type);
        if (gta.m132210e().m132214d().mo34878l() && !user.isTeamAccount() && !this.f116327b.m123841C0()) {
            arrayList.add(Type.chat_background);
        }
        if (CoreModule.f18276o.m132214d().mo34673D() && !user.isTeamAccount() && !this.f116327b.m123841C0()) {
            arrayList.add(Type.set_clap);
        }
        arrayList.add(type);
        CoreModule.m30932N().isMatchedByRelationship(user);
        user.unilateralBlock();
        if (NullChecker.m82486a(CoreModule.f18264c)) {
            CoreModule.f18264c.f20384f0.m33859Xe(this.f116327b.m123852x0());
        }
        if (!m141555c(user, conversationM33859Xe) && z) {
            arrayList.add(Type.un_match);
        }
        if (z) {
            arrayList.add(Type.report);
        }
        if (NullChecker.m82486a(conversationM33859Xe) && conversationM33859Xe.isSeeUpgradedConv()) {
            jyb.m147503d0(arrayList, new qcj() { // from class: l.w100
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f186754a.m50449x((MessageNewProfileSettingViewModel.Type) obj);
                }
            });
        }
        m50447v(user, arrayList);
        this.f32730c.m50472H(user, i, arrayList);
    }

    @Override // p153l.iq2, p153l.iam
    public void destroy() {
    }

    @Override // p153l.iq2, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        VRecyclerView vRecyclerView = new VRecyclerView(layoutInflater.getContext());
        vRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        vRecyclerView.addItemDecoration(new C8707a());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f116326a);
        linearLayoutManager.setOrientation(1);
        vRecyclerView.setLayoutManager(linearLayoutManager);
        this.f32731d = (MessageNewProfileSettingHead) this.f116326a.inflater().inflate(qec0.f156814A2, viewGroup, false);
        C8708b c8708b = new C8708b();
        this.f32730c = c8708b;
        vRecyclerView.setAdapter(c8708b);
        return vRecyclerView;
    }

    @Override // p153l.iq2
    /* JADX INFO: renamed from: j */
    public void mo50443j() {
        C8708b c8708b = this.f32730c;
        if (c8708b == null) {
            return;
        }
        c8708b.notifyDataSetChanged();
    }

    @Override // p153l.iq2
    /* JADX INFO: renamed from: k */
    public void mo50444k(User user) {
        if (NullChecker.m82486a(this.f32731d)) {
            this.f32731d.m50703z(user);
        }
    }

    @Override // p153l.iq2
    /* JADX INFO: renamed from: l */
    public void mo50445l(boolean z) {
        C8708b c8708b = this.f32730c;
        if (c8708b == null) {
            return;
        }
        List<Type> listM50471G = c8708b.m50471G();
        if (jyb.m147479J(listM50471G)) {
            return;
        }
        Type.un_match.setDes((!z || h39.m133427P()) ? getAct().getString(R$string.f21856w5) : "熄灭信号");
        if (z) {
            listM50471G.remove(Type.clear_chat_history);
            listM50471G.remove(Type.set_clap);
            this.f32730c.notifyDataSetChanged();
        }
    }

    @Override // p153l.iq2
    /* JADX INFO: renamed from: p */
    public void mo50446p(boolean z) {
        Type type;
        int iIndexOf;
        C8708b c8708b = this.f32730c;
        if (c8708b == null) {
            return;
        }
        List<Type> listM50471G = c8708b.m50471G();
        if (jyb.m147479J(listM50471G) || (iIndexOf = listM50471G.indexOf((type = Type.add_black_list))) < 0) {
            return;
        }
        type.setDes(z ? App.f16088e.getString(R$string.f21751k2) : App.f16088e.getString(R$string.f21509H2));
        this.f32730c.notifyItemChanged(iIndexOf);
    }

    /* JADX INFO: renamed from: v */
    public final void m50447v(final User user, List<Type> list) {
        this.f32733f = false;
        jyb.m147503d0(list, new qcj() { // from class: l.x100
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f191952a.m50448w(user, (MessageNewProfileSettingViewModel.Type) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Boolean m50448w(User user, Type type) {
        if (this.f32733f && user.isTeamAccount() && type == Type.line) {
            return Boolean.TRUE;
        }
        Type type2 = this.f32732e;
        Type type3 = Type.line;
        if (type2 == type3 && type == type3) {
            return Boolean.TRUE;
        }
        if (type == type3) {
            this.f32733f = true;
        }
        this.f32732e = type;
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Boolean m50449x(Type type) {
        boolean z = (type == Type.head || type == Type.line || type == Type.nick_name || type == Type.chat_background || type == Type.mini_widget_clap || type == Type.report) ? false : true;
        if (!z) {
            this.f32732e = type;
        }
        return Boolean.valueOf(z);
    }
}
