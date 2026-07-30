package com.p051p1.mobile.putong.core.newui.messages.anim.view;

import android.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4907v;
import com.p051p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8774c;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchMatchUser;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchPushUser;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p153l.adc0;
import p153l.afj0;
import p153l.agc0;
import p153l.al80;
import p153l.bnl0;
import p153l.bsj0;
import p153l.cl80;
import p153l.fo0;
import p153l.fqe0;
import p153l.h1c0;
import p153l.ji30;
import p153l.kcg0;
import p153l.kec0;
import p153l.l51;
import p153l.p9r;
import p153l.pcj;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.spl0;
import p153l.x20;
import p153l.y20;
import p153l.z20;
import p153l.z2m;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.b */
/* JADX INFO: loaded from: classes11.dex */
public class C8319b extends fqe0 {

    /* JADX INFO: renamed from: i */
    public Act f26387i;

    /* JADX INFO: renamed from: j */
    public QuickChatAudioBaseHeaderUserView f26388j;

    /* JADX INFO: renamed from: l */
    public String f26390l;

    /* JADX INFO: renamed from: m */
    public OnlineMatchMatchUser f26391m;

    /* JADX INFO: renamed from: n */
    public OnlineMatchPushUser f26392n;

    /* JADX INFO: renamed from: p */
    public QuickChatAudioHeaderView.HeaderState f26394p;

    /* JADX INFO: renamed from: q */
    public PopupWindow f26395q;

    /* JADX INFO: renamed from: o */
    public kcg0 f26393o = null;

    /* JADX INFO: renamed from: r */
    public TabName f26396r = TabName.Msg;

    /* JADX INFO: renamed from: k */
    public afj0 f26389k = new afj0();

    public C8319b(Act act) {
        this.f26387i = act;
    }

    /* JADX INFO: renamed from: K */
    private String m43197K(OnlineMatchPushUser onlineMatchPushUser) {
        return NullChecker.m82486a(onlineMatchPushUser) ? h1c0.INSTANCE.m133321b(onlineMatchPushUser.fitReason) : "default";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m43198P(Long l2) {
        if (C8774c.m51475f().m51480h()) {
            bsj0.m106263U(this.f26393o);
            m43211X();
            m43204L();
            boolean currentIsMatch = C8774c.m51475f().getCurrentIsMatch();
            afj0 afj0Var = this.f26389k;
            if (currentIsMatch) {
                afj0Var.m97348f();
                return;
            }
            afj0Var.m97353m();
            this.f26388j.setBroadcastTextTimerValue(-1L);
            C8774c.m51475f().m51481i(0L);
            CoreModule.f18264c.f20300D0.m35839L4(C8774c.m51475f().getPushUser());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m43199Q() {
        m43211X();
        m43204L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m43200R(OnlineMatchMatchUser onlineMatchMatchUser, OnlineMatchPushUser onlineMatchPushUser, Boolean bool, String str) {
        if (!bool.booleanValue()) {
            this.f26389k.m97344a(!TextUtils.isEmpty(str), NullChecker.m82486a(onlineMatchPushUser) ? onlineMatchPushUser.isMaleQuickChatRing : false, m43197K(onlineMatchPushUser), "message");
            if (NullChecker.m82486a(onlineMatchPushUser)) {
                OnlineMatchManager.m51326z().m51369r0(this.f26387i, onlineMatchPushUser, new x20() { // from class: l.g1c0
                    @Override // p153l.x20
                    public final void call() {
                        this.f101737a.m43199Q();
                    }
                }, str);
                return;
            }
            return;
        }
        m43211X();
        m43204L();
        this.f26389k.m97347e(!TextUtils.isEmpty(str));
        if (NullChecker.m82486a(onlineMatchMatchUser)) {
            Act act = this.f26387i;
            act.startActivity(MessagesAct.m50132q2(act, onlineMatchMatchUser.userId, false, false, false, false, null, 7, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m43201S(OnlineMatchPushUser onlineMatchPushUser, Boolean bool) {
        m43211X();
        m43204L();
        boolean zBooleanValue = bool.booleanValue();
        afj0 afj0Var = this.f26389k;
        if (zBooleanValue) {
            afj0Var.m97348f();
            return;
        }
        afj0Var.m97350h(NullChecker.m82486a(onlineMatchPushUser) ? onlineMatchPushUser.isMaleQuickChatRing : false, m43197K(onlineMatchPushUser), "message");
        CoreModule.f18264c.f20300D0.m35839L4(onlineMatchPushUser);
        this.f26388j.setBroadcastTextTimerValue(-1L);
        this.f26389k.m97353m();
    }

    /* JADX INFO: renamed from: T */
    private void m43202T() {
        View viewFindViewById = this.f26387i.findViewById(R.id.content);
        if (this.f26387i.isFinishing() || this.f26387i.isDestroyed() || this.f26395q.isShowing() || !NullChecker.m82486a(viewFindViewById.getWindowToken())) {
            return;
        }
        this.f26395q.showAtLocation(viewFindViewById, 49, 0, -qa00.f156330q);
    }

    /* JADX INFO: renamed from: d0 */
    private void m43203d0(final OnlineMatchPushUser onlineMatchPushUser, boolean z, final OnlineMatchMatchUser onlineMatchMatchUser) {
        bnl0.m105524M(this.f26388j, true);
        this.f26388j.init();
        this.f26388j.mo43009j0(this.f26387i, onlineMatchPushUser, z, onlineMatchMatchUser, new z20() { // from class: l.e1c0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f91591a.m43200R(onlineMatchMatchUser, onlineMatchPushUser, (Boolean) obj, (String) obj2);
            }
        }, new y20() { // from class: l.f1c0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96780a.m43201S(onlineMatchPushUser, (Boolean) obj);
            }
        });
    }

    @Override // p153l.fqe0
    /* JADX INFO: renamed from: A */
    public int mo22133A() {
        Act act;
        pcj<Boolean> pcjVar = this.f100279d;
        if ((pcjVar != null && !pcjVar.call().booleanValue()) || (act = this.f26387i) == null || act.isFinishing()) {
            if (NullChecker.m82486a(this.f121543b)) {
                this.f121543b.call();
            }
            return 0;
        }
        if (m43206N()) {
            return 0;
        }
        View viewInflate = p9r.m171370a(this.f26387i).inflate(kec0.f126019qb, (ViewGroup) null);
        this.f26388j = (QuickChatAudioBaseHeaderUserView) viewInflate.findViewById(adc0.f70064P4);
        if ("match_success".equals(this.f26390l)) {
            this.f26389k.m97349g(this.f26391m);
            C8774c.m51475f().m51482j();
            m43214a0();
            m43203d0(null, true, this.f26391m);
        } else if ("tickets_broadcast".equals(this.f26390l)) {
            this.f26389k.m97351j(this.f26392n);
            C8774c.m51475f().m51484l(this.f26392n, true);
            m43214a0();
            m43203d0(this.f26392n, false, null);
            this.f26388j.setReceiverUserIsFemale(this.f26392n.isFemale());
            this.f26388j.setBroadcastTextTimerValue(pzi0.m174454o());
            this.f26388j.mo43023h0();
        }
        PopupWindow popupWindow = new PopupWindow(viewInflate, -1, -2);
        this.f26395q = popupWindow;
        popupWindow.setOutsideTouchable(false);
        this.f26395q.setAnimationStyle(agc0.f71110D);
        m43202T();
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: L */
    public void m43204L() {
        if (NullChecker.m82486a(this.f26395q)) {
            this.f26395q.dismiss();
            this.f26395q = null;
            if (NullChecker.m82486a(this.f121543b)) {
                this.f121543b.call();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public void m43205M(final Act act) {
        if (C4522a.m22099p().m22107I()) {
            return;
        }
        act.duringCreated(ji30.m144967k().distinctUntilChanged().skip(1)).subscribe(psd0.m173596G(new y20() { // from class: l.b1c0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74363a.m43207O(act, (TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public boolean m43206N() {
        if (NullChecker.m82486a(this.f26395q)) {
            return this.f26395q.isShowing();
        }
        return false;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m43207O(Act act, TabName tabName) {
        this.f26396r = tabName;
        TabName tabName2 = TabName.Msg;
        m43213Z(tabName == tabName2);
        if (tabName == tabName2) {
            al80 al80VarM110428f = cl80.m110426e().m110428f();
            if (NullChecker.m82486a(al80VarM110428f) && (al80VarM110428f.m98644g() instanceof C8319b)) {
                l51.m152888H(act, new Runnable() { // from class: l.c1c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        cl80.m110426e().m110441s();
                    }
                }, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public C8319b m43208U(QuickChatAudioHeaderView.HeaderState headerState) {
        this.f26394p = headerState;
        return this;
    }

    /* JADX INFO: renamed from: V */
    public C8319b m43209V(String str) {
        this.f26390l = str;
        return this;
    }

    /* JADX INFO: renamed from: W */
    public C8319b m43210W(OnlineMatchMatchUser onlineMatchMatchUser) {
        this.f26391m = onlineMatchMatchUser;
        return this;
    }

    /* JADX INFO: renamed from: X */
    public void m43211X() {
        if (spl0.m187366R()) {
            return;
        }
        bsj0.m106263U(this.f26393o);
        C8774c.m51475f().m51481i(0L);
        if (NullChecker.m82486a(this.f26388j)) {
            this.f26388j.mo43024i0();
            this.f26388j.setBroadcastTextTimerValue(-1L);
        }
    }

    /* JADX INFO: renamed from: Y */
    public C8319b m43212Y(OnlineMatchPushUser onlineMatchPushUser) {
        this.f26392n = onlineMatchPushUser;
        return this;
    }

    /* JADX INFO: renamed from: Z */
    public void m43213Z(boolean z) {
        if (NullChecker.m82486a(this.f26395q)) {
            if (z) {
                m43202T();
            } else {
                this.f26395q.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m43214a0() {
        if (C8774c.m51475f().getCurrentTime() == 0) {
            return;
        }
        bsj0.m106263U(this.f26393o);
        this.f26393o = C22421c.interval(0L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.d1c0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84663a.m43198P((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b0 */
    public void m43215b0() {
        m43214a0();
        if (!NullChecker.m82486a(this.f26388j) || this.f26388j.getBroadcastTextTimerValue() <= 0) {
            return;
        }
        this.f26388j.mo43023h0();
    }

    /* JADX INFO: renamed from: c0 */
    public void m43216c0() {
        bsj0.m106263U(this.f26393o);
        if (NullChecker.m82486a(this.f26388j)) {
            this.f26388j.mo43024i0();
        }
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: f */
    public void mo21864f(boolean z) {
        PopupWindow popupWindow = this.f26395q;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        PopupWindow popupWindow2 = this.f26395q;
        if (z) {
            popupWindow2.getContentView().setTranslationY(0.0f);
            this.f26395q.getContentView().setAlpha(1.0f);
        } else {
            popupWindow2.getContentView().setTranslationY(-4000.0f);
            this.f26395q.getContentView().setAlpha(0.0f);
        }
    }

    @Override // p153l.f3m
    public boolean isValid() {
        if (this.f26396r != TabName.Msg) {
            return false;
        }
        if (TextUtils.equals("match_success", this.f26390l)) {
            if (C8774c.m51475f().m51480h()) {
                OnlineMatchManager.m51326z().f33442I.m137019l(C4907v.f20866b0);
                C8774c.m51475f().m51481i(0L);
                m43211X();
                return false;
            }
            if (this.f26394p != QuickChatAudioHeaderView.HeaderState.GetUserState) {
                return true;
            }
            OnlineMatchManager.m51326z().f33442I.m137019l(C4907v.f20866b0);
            return false;
        }
        if (!TextUtils.equals("tickets_broadcast", this.f26390l)) {
            return true;
        }
        if (this.f26394p == QuickChatAudioHeaderView.HeaderState.GetUserState) {
            OnlineMatchManager.m51326z().f33442I.m137019l(C4907v.f20866b0);
            return false;
        }
        if (!C8774c.m51475f().m51480h()) {
            return true;
        }
        OnlineMatchManager.m51326z().f33442I.m137019l(C4907v.f20866b0);
        C8774c.m51475f().m51481i(0L);
        m43211X();
        CoreModule.f18264c.f20300D0.m35839L4(null);
        return false;
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: j */
    public int mo22137j() {
        return this.f26387i.hashCode();
    }

    @Override // p153l.f3m
    /* JADX INFO: renamed from: m */
    public Act getAct() {
        return this.f26387i;
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: n */
    public void mo21871n(boolean z) {
        PopupWindow popupWindow = this.f26395q;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f26395q.dismiss();
            return;
        }
        z2m z2mVar = this.f100281f;
        if (z2mVar != null) {
            z2mVar.mo22108a(this);
        }
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: o */
    public String mo22139o() {
        return MagicBubble.QUICK_CHAT_BUBBLE.getGroup();
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: p */
    public String getBubbleId() {
        return MagicBubble.QUICK_CHAT_BUBBLE.getId();
    }
}
