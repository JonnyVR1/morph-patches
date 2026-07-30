package com.p046p1.mobile.putong.core.p053ui.messages.model;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageChatFireSettingAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageNicknameSettingAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageProfileSettingAct;
import com.p046p1.mobile.putong.core.p053ui.messages.model.MessageNewProfileSettingViewModel;
import com.p046p1.mobile.putong.core.p053ui.messages.model.view.MessageNewProfileSettingFunItem;
import com.p046p1.mobile.putong.core.p053ui.messages.model.view.MessageNewProfileSettingHead;
import com.p046p1.mobile.putong.core.p053ui.settings.SetTickleAct;
import com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VListCell;
import p147v.VRecyclerView;
import p149l.c3c0;
import p149l.c40;
import p149l.d30;
import p149l.dac0;
import p149l.e30;
import p149l.ivz;
import p149l.juk;
import p149l.l6c0;
import p149l.rp2;
import p149l.t100;
import p149l.ukj0;
import p149l.ura;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.xp5;
import p149l.y19;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class MessageNewProfileSettingViewModel extends rp2 {

    /* JADX INFO: renamed from: c */
    public C8545b f31882c;

    /* JADX INFO: renamed from: d */
    public MessageNewProfileSettingHead f31883d;

    /* JADX INFO: renamed from: e */
    public Type f31884e;

    /* JADX INFO: renamed from: f */
    public boolean f31885f;

    /* JADX INFO: renamed from: g */
    public c40 f31886g;

    public enum Type {
        head(0, "", new e30() { // from class: l.otz
            @Override // p149l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m49267a((Pair) obj);
            }
        }),
        nick_name(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78870t6 : c3c0.f78861s6, "设置备注名", new e30() { // from class: l.ttz
            @Override // p149l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m49270g((Pair) obj);
            }
        }),
        top_chat(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78483B6 : c3c0.f78474A6, "置顶聊天", new e30() { // from class: l.ctz
            @Override // p149l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m49268b((Pair) obj);
            }
        }),
        chat_fire(c3c0.f78693a0, "聊天火花", new e30() { // from class: l.dtz
            @Override // p149l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m49272i((Pair) obj);
            }
        }),
        search_chat_history(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78906x6 : c3c0.f78897w6, "搜索聊天记录", new e30() { // from class: l.etz
            @Override // p149l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m49282u((Pair) obj);
            }
        }),
        clear_chat_history(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78852r6 : c3c0.f78843q6, "清空聊天记录", new e30() { // from class: l.ftz
            @Override // p149l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m49276o((Pair) obj);
            }
        }),
        share(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78805m4 : c3c0.f78796l4, "让朋友帮你参谋一下", new e30() { // from class: l.gtz
            @Override // p149l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m49285x((Pair) obj);
            }
        }),
        chat_background(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78834p6 : c3c0.f78825o6, "设置聊天背景", new e30() { // from class: l.htz
            @Override // p149l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m49278q((Pair) obj);
            }
        }),
        set_clap(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78924z6 : c3c0.f78915y6, "设置拍一拍", new e30() { // from class: l.itz
            @Override // p149l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m49273j((Pair) obj);
            }
        }),
        mini_widget_clap(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78665W4 : c3c0.f78657V4, "小组件设置", new e30() { // from class: l.jtz
            @Override // p149l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m49271h((Pair) obj);
            }
        }),
        un_match(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78501D6 : c3c0.f78492C6, App.f15369e.getString(R$string.f21114w5), new e30() { // from class: l.ptz
            @Override // p149l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m49269f((Pair) obj);
            }
        }),
        add_black_list(c3c0.f78469A1, App.f15369e.getString(R$string.f20767H2), new e30() { // from class: l.qtz
            @Override // p149l.e30
            public final void call(Object obj) {
                Pair pair = (Pair) obj;
                ((MessageNewProfileSettingViewModel) pair.first).f160470b.m138696t0((User) pair.second);
            }
        }),
        report(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78888v6 : c3c0.f78879u6, "举报", new e30() { // from class: l.rtz
            @Override // p149l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m49280s((Pair) obj);
            }
        }),
        line(0, "", new e30() { // from class: l.stz
            @Override // p149l.e30
            public final void call(Object obj) {
                MessageNewProfileSettingViewModel.Type.m49279r((Pair) obj);
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
        public static /* synthetic */ void m49267a(Pair pair) {
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m49268b(Pair pair) {
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m49269f(Pair pair) {
            MessageNewProfileSettingViewModel messageNewProfileSettingViewModel = (MessageNewProfileSettingViewModel) pair.first;
            ukj0.m194174b(messageNewProfileSettingViewModel.f160469a, messageNewProfileSettingViewModel.f160470b.m138698x0(), OMSDialogPositon.p_chat_view);
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m49270g(Pair pair) {
            zvf0.m220396r("e_edit_nickname", ((MessageNewProfileSettingViewModel) pair.first).f160469a.pageId());
            MessageNewProfileSettingViewModel messageNewProfileSettingViewModel = (MessageNewProfileSettingViewModel) pair.first;
            MessageProfileSettingAct messageProfileSettingAct = messageNewProfileSettingViewModel.f160469a;
            messageProfileSettingAct.startActivity(MessageNicknameSettingAct.m48902Z1(messageProfileSettingAct, messageNewProfileSettingViewModel.f160470b.m138698x0()));
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m49271h(Pair pair) {
            ((MessageNewProfileSettingViewModel) pair.first).getAct().startActivity(WebViewAct.m80164Z1(((MessageNewProfileSettingViewModel) pair.first).getAct(), "小组件设置", juk.m143323e() ? "https://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/subassembly/index.html?from=chat_settings" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/subassembly/index.html?from=chat_settings"));
            zvf0.m220396r("e_chat_setting_widget", "p_chat_setting");
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ void m49272i(Pair pair) {
            zvf0.m220396r("e_spark_setting", ((MessageNewProfileSettingViewModel) pair.first).f160469a.pageId());
            MessageProfileSettingAct messageProfileSettingAct = ((MessageNewProfileSettingViewModel) pair.first).f160469a;
            messageProfileSettingAct.startActivity(MessageChatFireSettingAct.m48842Z1(messageProfileSettingAct, ((User) pair.second).f56011id));
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ void m49273j(Pair pair) {
            MessageNewProfileSettingViewModel messageNewProfileSettingViewModel = (MessageNewProfileSettingViewModel) pair.first;
            MessageProfileSettingAct messageProfileSettingAct = messageNewProfileSettingViewModel.f160469a;
            messageProfileSettingAct.startActivity(SetTickleAct.m55031a2(messageProfileSettingAct, messageNewProfileSettingViewModel.f160470b.m138698x0(), true));
        }

        /* JADX INFO: renamed from: m */
        public static /* synthetic */ void m49274m(Pair pair) {
            if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169524oa(((MessageNewProfileSettingViewModel) pair.first).f160470b.m138698x0())) && NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169524oa(((MessageNewProfileSettingViewModel) pair.first).f160470b.m138698x0()).m60124fp().profileSmall())) {
                CoreModule.f17545c.f19642f0.m32664Gp(((MessageNewProfileSettingViewModel) pair.first).getAct(), true, ((MessageNewProfileSettingViewModel) pair.first).f160470b.m138698x0(), CoreModule.f17545c.f19639e0.m169524oa(((MessageNewProfileSettingViewModel) pair.first).f160470b.m138698x0()).m60124fp().profileSmall());
            }
        }

        /* JADX INFO: renamed from: n */
        public static /* synthetic */ void m49275n(Act act, Pair pair, VListCell vListCell, VListCell.C22545a c22545a, int i) {
            String string = c22545a.f209159a.toString();
            if (act.getResources().getString(R$string.f20790K1).equals(string)) {
                zvf0.m220396r("e_choose_background_picture", act.pageId());
                ((MessageNewProfileSettingViewModel) pair.first).m180293n();
                ((MessageNewProfileSettingViewModel) pair.first).f31886g.m105113b();
            } else if (act.getResources().getString(R$string.f21100v).equals(string)) {
                zvf0.m220396r("e_cancel_background", act.pageId());
                ((MessageNewProfileSettingViewModel) pair.first).f160470b.m138694N0(null);
                act.m66873d2();
            }
            ((MessageNewProfileSettingViewModel) pair.first).f31886g.m105113b();
        }

        /* JADX INFO: renamed from: o */
        public static /* synthetic */ void m49276o(final Pair pair) {
            CoreBusinessService coreBusinessServiceM94651a = CoreModule.m29935P().m94651a();
            MessageNewProfileSettingViewModel messageNewProfileSettingViewModel = (MessageNewProfileSettingViewModel) pair.first;
            coreBusinessServiceM94651a.mo33495eo(messageNewProfileSettingViewModel.f160469a, messageNewProfileSettingViewModel.f160470b.m138698x0(), new d30() { // from class: l.ktz
                @Override // p149l.d30
                public final void call() {
                    MessageNewProfileSettingViewModel.Type.m49281t(pair);
                }
            }, null);
        }

        /* JADX INFO: renamed from: q */
        public static /* synthetic */ void m49278q(final Pair pair) {
            final MessageProfileSettingAct messageProfileSettingAct = ((MessageNewProfileSettingViewModel) pair.first).f160469a;
            zvf0.m220396r("e_edit_background", messageProfileSettingAct.pageId());
            Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(((User) pair.second).f56011id);
            if (conversationM32856Xe == null) {
                return;
            }
            if (vwb.m200296J(conversationM32856Xe.localChatBg)) {
                ((MessageNewProfileSettingViewModel) pair.first).m180293n();
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(messageProfileSettingAct.getResources().getString(R$string.f20790K1));
            arrayList.add(messageProfileSettingAct.getResources().getString(R$string.f21100v));
            c40.C16057b c16057b = new c40.C16057b(messageProfileSettingAct);
            c16057b.m105156I(messageProfileSettingAct.getResources().getString(R$string.f20916a)).m105168U(new View.OnClickListener() { // from class: l.mtz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((MessageNewProfileSettingViewModel) pair.first).f31886g.m105113b();
                }
            }).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.ntz
                @Override // p149l.c40.InterfaceC16059d
                /* JADX INFO: renamed from: a */
                public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                    MessageNewProfileSettingViewModel.Type.m49275n(messageProfileSettingAct, pair, vListCell, c22545a, i);
                }
            });
            ((MessageNewProfileSettingViewModel) pair.first).f31886g = c16057b.m105153F();
            ((MessageNewProfileSettingViewModel) pair.first).f31886g.m105117f();
        }

        /* JADX INFO: renamed from: r */
        public static /* synthetic */ void m49279r(Pair pair) {
        }

        /* JADX INFO: renamed from: s */
        public static /* synthetic */ void m49280s(final Pair pair) {
            MessageProfileSettingAct messageProfileSettingAct = ((MessageNewProfileSettingViewModel) pair.first).f160469a;
            CoreService coreServiceM29932K = CoreModule.m29932K();
            MessageNewProfileSettingViewModel messageNewProfileSettingViewModel = (MessageNewProfileSettingViewModel) pair.first;
            messageProfileSettingAct.startActivity(coreServiceM29932K.toReportAct(messageNewProfileSettingViewModel.f160469a, messageNewProfileSettingViewModel.f160470b.m138698x0(), true, new ResultReceiver(null) { // from class: com.p1.mobile.putong.core.ui.messages.model.MessageNewProfileSettingViewModel.Type.1
                @Override // android.os.ResultReceiver
                public void onReceiveResult(int i, Bundle bundle) {
                    if (y19.m212148H() && i == -1) {
                        ((MessageNewProfileSettingViewModel) pair.first).f160469a.m66873d2();
                    }
                }
            }));
        }

        /* JADX INFO: renamed from: t */
        public static /* synthetic */ void m49281t(Pair pair) {
            ((MessageNewProfileSettingViewModel) pair.first).f160470b.m138695O0();
            ((MessageNewProfileSettingViewModel) pair.first).f160469a.m66873d2();
        }

        /* JADX INFO: renamed from: u */
        public static /* synthetic */ void m49282u(Pair pair) {
            zvf0.m220396r("e_search_chat_history", ((MessageNewProfileSettingViewModel) pair.first).f160469a.pageId());
            MessageProfileSettingAct messageProfileSettingAct = ((MessageNewProfileSettingViewModel) pair.first).f160469a;
            CoreBusinessService coreBusinessServiceM94651a = CoreModule.m29935P().m94651a();
            MessageNewProfileSettingViewModel messageNewProfileSettingViewModel = (MessageNewProfileSettingViewModel) pair.first;
            messageProfileSettingAct.startActivity(coreBusinessServiceM94651a.mo33579rj(messageNewProfileSettingViewModel.f160469a, messageNewProfileSettingViewModel.f160470b.m138698x0()));
        }

        /* JADX INFO: renamed from: v */
        public static /* synthetic */ void m49283v(Pair pair) {
            if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169524oa(((MessageNewProfileSettingViewModel) pair.first).f160470b.m138698x0())) && NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169524oa(((MessageNewProfileSettingViewModel) pair.first).f160470b.m138698x0()).m60124fp().profileSmall())) {
                CoreModule.f17545c.f19642f0.m32664Gp(((MessageNewProfileSettingViewModel) pair.first).getAct(), false, ((MessageNewProfileSettingViewModel) pair.first).f160470b.m138698x0(), CoreModule.f17545c.f19639e0.m169524oa(((MessageNewProfileSettingViewModel) pair.first).f160470b.m138698x0()).m60124fp().profileSmall());
            }
        }

        /* JADX INFO: renamed from: x */
        public static /* synthetic */ void m49285x(final Pair pair) {
            zvf0.m220396r("e_chat_setting_share", "p_chat_setting");
            CoreModule.m29935P().m94651a().mo33471bd(((MessageNewProfileSettingViewModel) pair.first).getAct(), "chat_setting", new d30() { // from class: l.btz
                @Override // p149l.d30
                public final void call() {
                    MessageNewProfileSettingViewModel.Type.m49283v(pair);
                }
            }, new d30() { // from class: l.ltz
                @Override // p149l.d30
                public final void call() {
                    MessageNewProfileSettingViewModel.Type.m49274m(pair);
                }
            });
        }

        public void setDes(String str) {
            this.des = str;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.MessageNewProfileSettingViewModel$a */
    public class C8544a extends RecyclerView.AbstractC0576n {
        public C8544a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            super.getItemOffsets(rect, view, recyclerView, c0588z);
            rect.bottom = t100.f167268q;
            int i = t100.f167276y;
            rect.left = i;
            rect.right = i;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.MessageNewProfileSettingViewModel$b */
    public class C8545b extends dac0<Type> {

        /* JADX INFO: renamed from: c */
        public User f31888c;

        /* JADX INFO: renamed from: d */
        public int f31889d;

        /* JADX INFO: renamed from: e */
        public final int f31890e = 1;

        /* JADX INFO: renamed from: f */
        public final int f31891f = 2;

        /* JADX INFO: renamed from: g */
        public final int f31892g = 3;

        /* JADX INFO: renamed from: h */
        public List<Type> f31893h = new ArrayList();

        public C8545b() {
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f31893h.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return MessageNewProfileSettingViewModel.this.f31883d;
            }
            if (i != 3) {
                return MessageNewProfileSettingViewModel.this.f160469a.inflater().inflate(l6c0.f126609z2, viewGroup, false);
            }
            View view = new View(MessageNewProfileSettingViewModel.this.f160469a);
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, t100.f167255d));
            int i2 = t100.f167276y;
            xdl0.m208358V(view, i2);
            xdl0.m208359W(view, i2);
            return view;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, Type type, int i, int i2) {
            if (i == 1) {
                MessageNewProfileSettingViewModel.this.f31883d.m49517B(MessageNewProfileSettingViewModel.this, this.f31888c, this.f31889d);
            } else if (i == 3) {
                view.setBackgroundColor(Color.parseColor("#F9F9F9"));
            } else {
                ((MessageNewProfileSettingFunItem) view).m49514O(MessageNewProfileSettingViewModel.this, this.f31888c, type);
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public Type getItem(int i) {
            return this.f31893h.get(i);
        }

        /* JADX INFO: renamed from: G */
        public List<Type> m49288G() {
            return this.f31893h;
        }

        /* JADX INFO: renamed from: H */
        public void m49289H(User user, int i, List<Type> list) {
            this.f31888c = user;
            this.f31889d = i;
            this.f31893h = list;
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
        this.f31884e = null;
        this.f31885f = false;
    }

    @Override // p149l.rp2, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f160469a;
    }

    @Override // p149l.rp2, p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ivz ivzVar) {
        super.mo21065i1(ivzVar);
    }

    @Override // p149l.rp2
    /* JADX INFO: renamed from: d */
    public void mo49259d(User user, int i) {
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(user.f56011id);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Type.head);
        Type type = Type.line;
        arrayList.add(type);
        if (ura.m195053e().m195057d().mo33875l() && !user.isTeamAccount() && !this.f160470b.m138687C0()) {
            arrayList.add(Type.nick_name);
        }
        if (ura.m195053e().m195057d().mo33773W8() && NullChecker.m81303a(conversationM32856Xe) && conversationM32856Xe.doubleDefault() && !user.isTeamAccount()) {
            arrayList.add(Type.chat_fire);
            zvf0.m220402x("e_spark_setting", this.f160469a.pageId());
        }
        arrayList.add(type);
        if (y19.m212161U()) {
            arrayList.add(Type.search_chat_history);
            zvf0.m220402x("e_search_chat_history", this.f160469a.pageId());
        }
        if (!m180290c(user, conversationM32856Xe) && !m180292f(user) && !xp5.m210475o(conversationM32856Xe, user)) {
            arrayList.add(Type.clear_chat_history);
        }
        boolean z = (user.f56011id.equals(CoreModule.m29931H().userId()) || user.isTeamAccount()) ? false : true;
        arrayList.add(type);
        if (ura.m195053e().m195057d().mo33875l() && !user.isTeamAccount() && !this.f160470b.m138687C0()) {
            arrayList.add(Type.chat_background);
        }
        if (CoreModule.f17557o.m195057d().mo33670D() && !user.isTeamAccount() && !this.f160470b.m138687C0()) {
            arrayList.add(Type.set_clap);
        }
        arrayList.add(type);
        CoreModule.m29934N().isMatchedByRelationship(user);
        user.unilateralBlock();
        if (NullChecker.m81303a(CoreModule.f17545c)) {
            CoreModule.f17545c.f19642f0.m32856Xe(this.f160470b.m138698x0());
        }
        if (!m180290c(user, conversationM32856Xe) && z) {
            arrayList.add(Type.un_match);
        }
        if (z) {
            arrayList.add(Type.report);
        }
        if (NullChecker.m81303a(conversationM32856Xe) && conversationM32856Xe.isSeeUpgradedConv()) {
            vwb.m200320d0(arrayList, new w9j() { // from class: l.zsz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f204653a.m49266x((MessageNewProfileSettingViewModel.Type) obj);
                }
            });
        }
        m49264v(user, arrayList);
        this.f31882c.m49289H(user, i, arrayList);
    }

    @Override // p149l.rp2, p149l.s7m
    public void destroy() {
    }

    @Override // p149l.rp2, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        VRecyclerView vRecyclerView = new VRecyclerView(layoutInflater.getContext());
        vRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        vRecyclerView.addItemDecoration(new C8544a());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f160469a);
        linearLayoutManager.setOrientation(1);
        vRecyclerView.setLayoutManager(linearLayoutManager);
        this.f31883d = (MessageNewProfileSettingHead) this.f160469a.inflater().inflate(l6c0.f126258A2, viewGroup, false);
        C8545b c8545b = new C8545b();
        this.f31882c = c8545b;
        vRecyclerView.setAdapter(c8545b);
        return vRecyclerView;
    }

    @Override // p149l.rp2
    /* JADX INFO: renamed from: j */
    public void mo49260j() {
        C8545b c8545b = this.f31882c;
        if (c8545b == null) {
            return;
        }
        c8545b.notifyDataSetChanged();
    }

    @Override // p149l.rp2
    /* JADX INFO: renamed from: k */
    public void mo49261k(User user) {
        if (NullChecker.m81303a(this.f31883d)) {
            this.f31883d.m49520z(user);
        }
    }

    @Override // p149l.rp2
    /* JADX INFO: renamed from: l */
    public void mo49262l(boolean z) {
        C8545b c8545b = this.f31882c;
        if (c8545b == null) {
            return;
        }
        List<Type> listM49288G = c8545b.m49288G();
        if (vwb.m200296J(listM49288G)) {
            return;
        }
        Type.un_match.setDes((!z || y19.m212156P()) ? getAct().getString(R$string.f21114w5) : "熄灭信号");
        if (z) {
            listM49288G.remove(Type.clear_chat_history);
            listM49288G.remove(Type.set_clap);
            this.f31882c.notifyDataSetChanged();
        }
    }

    @Override // p149l.rp2
    /* JADX INFO: renamed from: p */
    public void mo49263p(boolean z) {
        Type type;
        int iIndexOf;
        C8545b c8545b = this.f31882c;
        if (c8545b == null) {
            return;
        }
        List<Type> listM49288G = c8545b.m49288G();
        if (vwb.m200296J(listM49288G) || (iIndexOf = listM49288G.indexOf((type = Type.add_black_list))) < 0) {
            return;
        }
        type.setDes(z ? App.f15369e.getString(R$string.f21009k2) : App.f15369e.getString(R$string.f20767H2));
        this.f31882c.notifyItemChanged(iIndexOf);
    }

    /* JADX INFO: renamed from: v */
    public final void m49264v(final User user, List<Type> list) {
        this.f31885f = false;
        vwb.m200320d0(list, new w9j() { // from class: l.atz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f71693a.m49265w(user, (MessageNewProfileSettingViewModel.Type) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Boolean m49265w(User user, Type type) {
        if (this.f31885f && user.isTeamAccount() && type == Type.line) {
            return Boolean.TRUE;
        }
        Type type2 = this.f31884e;
        Type type3 = Type.line;
        if (type2 == type3 && type == type3) {
            return Boolean.TRUE;
        }
        if (type == type3) {
            this.f31885f = true;
        }
        this.f31884e = type;
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Boolean m49266x(Type type) {
        boolean z = (type == Type.head || type == Type.line || type == Type.nick_name || type == Type.chat_background || type == Type.mini_widget_clap || type == Type.report) ? false : true;
        if (!z) {
            this.f31884e = type;
        }
        return Boolean.valueOf(z);
    }
}
