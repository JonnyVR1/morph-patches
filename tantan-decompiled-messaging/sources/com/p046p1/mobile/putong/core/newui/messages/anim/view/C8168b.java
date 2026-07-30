package com.p046p1.mobile.putong.core.newui.messages.anim.view;

import android.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4756v;
import com.p046p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8611c;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchMatchUser;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchPushUser;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p149l.aie0;
import p149l.c4g0;
import p149l.d30;
import p149l.dtb0;
import p149l.e30;
import p149l.e51;
import p149l.f0m;
import p149l.f30;
import p149l.f6c0;
import p149l.jo0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.o7r;
import p149l.ogl0;
import p149l.t100;
import p149l.u4c0;
import p149l.uc80;
import p149l.v7c0;
import p149l.v930;
import p149l.v9j;
import p149l.w5j0;
import p149l.wc80;
import p149l.xdl0;
import p149l.yij0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.b */
/* JADX INFO: loaded from: classes11.dex */
public class C8168b extends aie0 {

    /* JADX INFO: renamed from: i */
    public Act f25645i;

    /* JADX INFO: renamed from: j */
    public QuickChatAudioBaseHeaderUserView f25646j;

    /* JADX INFO: renamed from: l */
    public String f25648l;

    /* JADX INFO: renamed from: m */
    public OnlineMatchMatchUser f25649m;

    /* JADX INFO: renamed from: n */
    public OnlineMatchPushUser f25650n;

    /* JADX INFO: renamed from: p */
    public QuickChatAudioHeaderView.HeaderState f25652p;

    /* JADX INFO: renamed from: q */
    public PopupWindow f25653q;

    /* JADX INFO: renamed from: o */
    public c4g0 f25651o = null;

    /* JADX INFO: renamed from: r */
    public TabName f25654r = TabName.Msg;

    /* JADX INFO: renamed from: k */
    public w5j0 f25647k = new w5j0();

    public C8168b(Act act) {
        this.f25645i = act;
    }

    /* JADX INFO: renamed from: K */
    private String m42186K(OnlineMatchPushUser onlineMatchPushUser) {
        return NullChecker.m81303a(onlineMatchPushUser) ? dtb0.INSTANCE.m113539b(onlineMatchPushUser.fitReason) : "default";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m42187P(Long l2) {
        if (C8611c.m50292f().m50297h()) {
            yij0.m214943U(this.f25651o);
            m42200X();
            m42193L();
            boolean currentIsMatch = C8611c.m50292f().getCurrentIsMatch();
            w5j0 w5j0Var = this.f25647k;
            if (currentIsMatch) {
                w5j0Var.m201640f();
                return;
            }
            w5j0Var.m201645m();
            this.f25646j.setBroadcastTextTimerValue(-1L);
            C8611c.m50292f().m50298i(0L);
            CoreModule.f17545c.f19558D0.m34836L4(C8611c.m50292f().getPushUser());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m42188Q() {
        m42200X();
        m42193L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m42189R(OnlineMatchMatchUser onlineMatchMatchUser, OnlineMatchPushUser onlineMatchPushUser, Boolean bool, String str) {
        if (!bool.booleanValue()) {
            this.f25647k.m201636a(!TextUtils.isEmpty(str), NullChecker.m81303a(onlineMatchPushUser) ? onlineMatchPushUser.isMaleQuickChatRing : false, m42186K(onlineMatchPushUser), "message");
            if (NullChecker.m81303a(onlineMatchPushUser)) {
                OnlineMatchManager.m50143z().m50186r0(this.f25645i, onlineMatchPushUser, new d30() { // from class: l.ctb0
                    @Override // p149l.d30
                    public final void call() {
                        this.f82465a.m42188Q();
                    }
                }, str);
                return;
            }
            return;
        }
        m42200X();
        m42193L();
        this.f25647k.m201639e(!TextUtils.isEmpty(str));
        if (NullChecker.m81303a(onlineMatchMatchUser)) {
            Act act = this.f25645i;
            act.startActivity(MessagesAct.m48949p2(act, onlineMatchMatchUser.userId, false, false, false, false, null, 7, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m42190S(OnlineMatchPushUser onlineMatchPushUser, Boolean bool) {
        m42200X();
        m42193L();
        boolean zBooleanValue = bool.booleanValue();
        w5j0 w5j0Var = this.f25647k;
        if (zBooleanValue) {
            w5j0Var.m201640f();
            return;
        }
        w5j0Var.m201642h(NullChecker.m81303a(onlineMatchPushUser) ? onlineMatchPushUser.isMaleQuickChatRing : false, m42186K(onlineMatchPushUser), "message");
        CoreModule.f17545c.f19558D0.m34836L4(onlineMatchPushUser);
        this.f25646j.setBroadcastTextTimerValue(-1L);
        this.f25647k.m201645m();
    }

    /* JADX INFO: renamed from: T */
    private void m42191T() {
        View viewFindViewById = this.f25645i.findViewById(R.id.content);
        if (this.f25645i.isFinishing() || this.f25645i.isDestroyed() || this.f25653q.isShowing() || !NullChecker.m81303a(viewFindViewById.getWindowToken())) {
            return;
        }
        this.f25653q.showAtLocation(viewFindViewById, 49, 0, -t100.f167268q);
    }

    /* JADX INFO: renamed from: d0 */
    private void m42192d0(final OnlineMatchPushUser onlineMatchPushUser, boolean z, final OnlineMatchMatchUser onlineMatchMatchUser) {
        xdl0.m208344M(this.f25646j, true);
        this.f25646j.init();
        this.f25646j.mo41998j0(this.f25645i, onlineMatchPushUser, z, onlineMatchMatchUser, new f30() { // from class: l.atb0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f71595a.m42189R(onlineMatchMatchUser, onlineMatchPushUser, (Boolean) obj, (String) obj2);
            }
        }, new e30() { // from class: l.btb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77197a.m42190S(onlineMatchPushUser, (Boolean) obj);
            }
        });
    }

    @Override // p149l.aie0
    /* JADX INFO: renamed from: A */
    public int mo21134A() {
        Act act;
        v9j<Boolean> v9jVar = this.f69975d;
        if ((v9jVar != null && !v9jVar.call().booleanValue()) || (act = this.f25645i) == null || act.isFinishing()) {
            if (NullChecker.m81303a(this.f97025b)) {
                this.f97025b.call();
            }
            return 0;
        }
        if (m42195N()) {
            return 0;
        }
        View viewInflate = o7r.m163037a(this.f25645i).inflate(f6c0.f95846jb, (ViewGroup) null);
        this.f25646j = (QuickChatAudioBaseHeaderUserView) viewInflate.findViewById(u4c0.f173942N4);
        if ("match_success".equals(this.f25648l)) {
            this.f25647k.m201641g(this.f25649m);
            C8611c.m50292f().m50299j();
            m42203a0();
            m42192d0(null, true, this.f25649m);
        } else if ("tickets_broadcast".equals(this.f25648l)) {
            this.f25647k.m201643j(this.f25650n);
            C8611c.m50292f().m50301l(this.f25650n, true);
            m42203a0();
            m42192d0(this.f25650n, false, null);
            this.f25646j.setReceiverUserIsFemale(this.f25650n.isFemale());
            this.f25646j.setBroadcastTextTimerValue(mqi0.m155944o());
            this.f25646j.mo42012h0();
        }
        PopupWindow popupWindow = new PopupWindow(viewInflate, -1, -2);
        this.f25653q = popupWindow;
        popupWindow.setOutsideTouchable(false);
        this.f25653q.setAnimationStyle(v7c0.f180349D);
        m42191T();
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: L */
    public void m42193L() {
        if (NullChecker.m81303a(this.f25653q)) {
            this.f25653q.dismiss();
            this.f25653q = null;
            if (NullChecker.m81303a(this.f97025b)) {
                this.f97025b.call();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public void m42194M(final Act act) {
        if (C4371a.m21100p().m21108I()) {
            return;
        }
        act.duringCreated(v930.m197537k().distinctUntilChanged().skip(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.xsb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194219a.m42196O(act, (TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public boolean m42195N() {
        if (NullChecker.m81303a(this.f25653q)) {
            return this.f25653q.isShowing();
        }
        return false;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m42196O(Act act, TabName tabName) {
        this.f25654r = tabName;
        TabName tabName2 = TabName.Msg;
        m42202Z(tabName == tabName2);
        if (tabName == tabName2) {
            uc80 uc80VarM202638f = wc80.m202636e().m202638f();
            if (NullChecker.m81303a(uc80VarM202638f) && (uc80VarM202638f.m192998g() instanceof C8168b)) {
                e51.m114743H(act, new Runnable() { // from class: l.ysb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        wc80.m202636e().m202651s();
                    }
                }, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public C8168b m42197U(QuickChatAudioHeaderView.HeaderState headerState) {
        this.f25652p = headerState;
        return this;
    }

    /* JADX INFO: renamed from: V */
    public C8168b m42198V(String str) {
        this.f25648l = str;
        return this;
    }

    /* JADX INFO: renamed from: W */
    public C8168b m42199W(OnlineMatchMatchUser onlineMatchMatchUser) {
        this.f25649m = onlineMatchMatchUser;
        return this;
    }

    /* JADX INFO: renamed from: X */
    public void m42200X() {
        if (ogl0.m164239R()) {
            return;
        }
        yij0.m214943U(this.f25651o);
        C8611c.m50292f().m50298i(0L);
        if (NullChecker.m81303a(this.f25646j)) {
            this.f25646j.mo42013i0();
            this.f25646j.setBroadcastTextTimerValue(-1L);
        }
    }

    /* JADX INFO: renamed from: Y */
    public C8168b m42201Y(OnlineMatchPushUser onlineMatchPushUser) {
        this.f25650n = onlineMatchPushUser;
        return this;
    }

    /* JADX INFO: renamed from: Z */
    public void m42202Z(boolean z) {
        if (NullChecker.m81303a(this.f25653q)) {
            if (z) {
                m42191T();
            } else {
                this.f25653q.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m42203a0() {
        if (C8611c.m50292f().getCurrentTime() == 0) {
            return;
        }
        yij0.m214943U(this.f25651o);
        this.f25651o = C22306c.interval(0L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.zsb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204583a.m42187P((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b0 */
    public void m42204b0() {
        m42203a0();
        if (!NullChecker.m81303a(this.f25646j) || this.f25646j.getBroadcastTextTimerValue() <= 0) {
            return;
        }
        this.f25646j.mo42012h0();
    }

    /* JADX INFO: renamed from: c0 */
    public void m42205c0() {
        yij0.m214943U(this.f25651o);
        if (NullChecker.m81303a(this.f25646j)) {
            this.f25646j.mo42013i0();
        }
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: f */
    public void mo20865f(boolean z) {
        PopupWindow popupWindow = this.f25653q;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        PopupWindow popupWindow2 = this.f25653q;
        if (z) {
            popupWindow2.getContentView().setTranslationY(0.0f);
            this.f25653q.getContentView().setAlpha(1.0f);
        } else {
            popupWindow2.getContentView().setTranslationY(-4000.0f);
            this.f25653q.getContentView().setAlpha(0.0f);
        }
    }

    @Override // p149l.l0m
    public boolean isValid() {
        if (this.f25654r != TabName.Msg) {
            return false;
        }
        if (TextUtils.equals("match_success", this.f25648l)) {
            if (C8611c.m50292f().m50297h()) {
                OnlineMatchManager.m50143z().f32594I.m132487l(C4756v.f20124b0);
                C8611c.m50292f().m50298i(0L);
                m42200X();
                return false;
            }
            if (this.f25652p != QuickChatAudioHeaderView.HeaderState.GetUserState) {
                return true;
            }
            OnlineMatchManager.m50143z().f32594I.m132487l(C4756v.f20124b0);
            return false;
        }
        if (!TextUtils.equals("tickets_broadcast", this.f25648l)) {
            return true;
        }
        if (this.f25652p == QuickChatAudioHeaderView.HeaderState.GetUserState) {
            OnlineMatchManager.m50143z().f32594I.m132487l(C4756v.f20124b0);
            return false;
        }
        if (!C8611c.m50292f().m50297h()) {
            return true;
        }
        OnlineMatchManager.m50143z().f32594I.m132487l(C4756v.f20124b0);
        C8611c.m50292f().m50298i(0L);
        m42200X();
        CoreModule.f17545c.f19558D0.m34836L4(null);
        return false;
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: j */
    public int mo21138j() {
        return this.f25645i.hashCode();
    }

    @Override // p149l.l0m
    /* JADX INFO: renamed from: m */
    public Act getAct() {
        return this.f25645i;
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: n */
    public void mo20872n(boolean z) {
        PopupWindow popupWindow = this.f25653q;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f25653q.dismiss();
            return;
        }
        f0m f0mVar = this.f69977f;
        if (f0mVar != null) {
            f0mVar.mo21109a(this);
        }
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: o */
    public String mo21140o() {
        return MagicBubble.QUICK_CHAT_BUBBLE.getGroup();
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: p */
    public String getBubbleId() {
        return MagicBubble.QUICK_CHAT_BUBBLE.getId();
    }
}
