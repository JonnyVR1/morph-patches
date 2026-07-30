package p149l;

import android.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioBaseHeaderUserView;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8611c;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchMatchUser;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchPushUser;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class j940 extends aie0 {

    /* JADX INFO: renamed from: i */
    public final Act f116851i;

    /* JADX INFO: renamed from: j */
    public QuickChatAudioBaseHeaderUserView f116852j;

    /* JADX INFO: renamed from: l */
    public String f116854l;

    /* JADX INFO: renamed from: m */
    public OnlineMatchMatchUser f116855m;

    /* JADX INFO: renamed from: n */
    public OnlineMatchPushUser f116856n;

    /* JADX INFO: renamed from: p */
    public PopupWindow f116858p;

    /* JADX INFO: renamed from: o */
    public c4g0 f116857o = null;

    /* JADX INFO: renamed from: q */
    public TabName f116859q = TabName.Msg;

    /* JADX INFO: renamed from: r */
    public c4g0 f116860r = null;

    /* JADX INFO: renamed from: k */
    public final w5j0 f116853k = new w5j0();

    public j940(Act act) {
        this.f116851i = act;
    }

    /* JADX INFO: renamed from: T */
    private void m140528T() {
        View viewFindViewById = this.f116851i.findViewById(R.id.content);
        if (this.f116851i.isFinishing() || this.f116851i.isDestroyed() || this.f116858p.isShowing() || !NullChecker.m81303a(viewFindViewById.getWindowToken())) {
            return;
        }
        this.f116858p.showAtLocation(viewFindViewById, 49, 0, -t100.f167268q);
    }

    @Override // p149l.aie0
    /* JADX INFO: renamed from: A */
    public int mo21134A() {
        Act act;
        v9j<Boolean> v9jVar = this.f69975d;
        if ((v9jVar != null && !v9jVar.call().booleanValue()) || (act = this.f116851i) == null || act.isFinishing()) {
            if (NullChecker.m81303a(this.f97025b)) {
                this.f97025b.call();
            }
            return 0;
        }
        if (m140532N()) {
            return 0;
        }
        yij0.m214943U(this.f116860r);
        m140531M();
        View viewInflate = (ogl0.m164239R() && "tickets_broadcast".equals(this.f116854l)) ? o7r.m163037a(this.f116851i).inflate(f6c0.f96101yb, (ViewGroup) null) : o7r.m163037a(this.f116851i).inflate(f6c0.f96067wb, (ViewGroup) null);
        this.f116852j = (QuickChatAudioBaseHeaderUserView) viewInflate.findViewById(u4c0.f174086Ve);
        if ("match_success".equals(this.f116854l)) {
            this.f116853k.m201641g(this.f116855m);
            C8611c.m50292f().m50299j();
            m140542Y();
            m140544a0(null, true, this.f116855m);
        } else if ("tickets_broadcast".equals(this.f116854l)) {
            this.f116853k.m201643j(this.f116856n);
            C8611c.m50292f().m50301l(this.f116856n, true);
            m140542Y();
            m140544a0(this.f116856n, false, null);
            this.f116852j.setReceiverUserIsFemale(this.f116856n.isFemale());
            this.f116852j.setBroadcastTextTimerValue(mqi0.m155944o());
        }
        PopupWindow popupWindow = new PopupWindow(viewInflate, -1, -2);
        this.f116858p = popupWindow;
        popupWindow.setOutsideTouchable(false);
        this.f116858p.setAnimationStyle(v7c0.f180349D);
        m140528T();
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: K */
    public final String m140529K(OnlineMatchPushUser onlineMatchPushUser) {
        return NullChecker.m81303a(onlineMatchPushUser) ? dtb0.INSTANCE.m113539b(onlineMatchPushUser.fitReason) : "default";
    }

    /* JADX INFO: renamed from: L */
    public void m140530L() {
        if (NullChecker.m81303a(this.f116858p)) {
            this.f116858p.dismiss();
            this.f116858p = null;
            if (NullChecker.m81303a(this.f97025b)) {
                this.f97025b.call();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public void m140531M() {
        if (C4371a.m21100p().m21108I()) {
            return;
        }
        this.f116860r = this.f116851i.duringCreated(v930.m197537k().distinctUntilChanged().skip(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.d940
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84934a.m140533O((TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public boolean m140532N() {
        if (NullChecker.m81303a(this.f116858p)) {
            return this.f116858p.isShowing();
        }
        return false;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m140533O(TabName tabName) {
        this.f116859q = tabName;
        TabName tabName2 = TabName.Msg;
        m140541X(tabName == tabName2);
        if (tabName == tabName2) {
            uc80 uc80VarM202638f = wc80.m202636e().m202638f();
            if (NullChecker.m81303a(uc80VarM202638f) && (uc80VarM202638f.m192998g() instanceof j940)) {
                e51.m114743H(this.f116851i, new Runnable() { // from class: l.h940
                    @Override // java.lang.Runnable
                    public final void run() {
                        wc80.m202636e().m202651s();
                    }
                }, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m140534P(Long l2) {
        if (C8611c.m50292f().m50297h()) {
            yij0.m214943U(this.f116857o);
            m140530L();
            boolean currentIsMatch = C8611c.m50292f().getCurrentIsMatch();
            w5j0 w5j0Var = this.f116853k;
            if (currentIsMatch) {
                w5j0Var.m201640f();
                return;
            }
            w5j0Var.m201645m();
            this.f116852j.setBroadcastTextTimerValue(-1L);
            C8611c.m50292f().m50298i(0L);
            CoreModule.f17545c.f19558D0.m34836L4(C8611c.m50292f().getPushUser());
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m140535Q() {
        m140543Z();
        m140530L();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m140536R(OnlineMatchMatchUser onlineMatchMatchUser, OnlineMatchPushUser onlineMatchPushUser, Boolean bool, String str) {
        if (!bool.booleanValue()) {
            this.f116853k.m201636a(!TextUtils.isEmpty(str), NullChecker.m81303a(onlineMatchPushUser) ? onlineMatchPushUser.isMaleQuickChatRing : false, m140529K(onlineMatchPushUser), "message");
            if (NullChecker.m81303a(onlineMatchPushUser)) {
                OnlineMatchManager.m50143z().m50186r0(this.f116851i, onlineMatchPushUser, new d30() { // from class: l.i940
                    @Override // p149l.d30
                    public final void call() {
                        this.f112100a.m140535Q();
                    }
                }, str);
                return;
            }
            return;
        }
        m140543Z();
        m140530L();
        this.f116853k.m201639e(!TextUtils.isEmpty(str));
        if (NullChecker.m81303a(onlineMatchMatchUser)) {
            Act act = this.f116851i;
            act.startActivity(MessagesAct.m48949p2(act, onlineMatchMatchUser.userId, false, false, false, false, null, 7, str));
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m140537S(OnlineMatchPushUser onlineMatchPushUser, Boolean bool) {
        m140543Z();
        m140530L();
        boolean zBooleanValue = bool.booleanValue();
        w5j0 w5j0Var = this.f116853k;
        if (zBooleanValue) {
            w5j0Var.m201640f();
            return;
        }
        w5j0Var.m201642h(NullChecker.m81303a(onlineMatchPushUser) ? onlineMatchPushUser.isMaleQuickChatRing : false, m140529K(onlineMatchPushUser), "message");
        CoreModule.f17545c.f19558D0.m34836L4(onlineMatchPushUser);
        this.f116852j.setBroadcastTextTimerValue(-1L);
        this.f116853k.m201645m();
    }

    /* JADX INFO: renamed from: U */
    public j940 m140538U(String str) {
        this.f116854l = str;
        return this;
    }

    /* JADX INFO: renamed from: V */
    public j940 m140539V(OnlineMatchMatchUser onlineMatchMatchUser) {
        this.f116855m = onlineMatchMatchUser;
        return this;
    }

    /* JADX INFO: renamed from: W */
    public j940 m140540W(OnlineMatchPushUser onlineMatchPushUser) {
        this.f116856n = onlineMatchPushUser;
        return this;
    }

    /* JADX INFO: renamed from: X */
    public void m140541X(boolean z) {
        if (NullChecker.m81303a(this.f116858p)) {
            if (z) {
                m140542Y();
                m140528T();
            } else {
                this.f116858p.dismiss();
                yij0.m214943U(this.f116857o);
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m140542Y() {
        if (C8611c.m50292f().getCurrentTime() == 0) {
            return;
        }
        yij0.m214943U(this.f116857o);
        this.f116857o = this.f116851i.duringCreated(C22306c.interval(0L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a())).subscribe(mkd0.m154955G(new e30() { // from class: l.g940
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101541a.m140534P((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public void m140543Z() {
        yij0.m214943U(this.f116857o);
        yij0.m214943U(this.f116860r);
        C8611c.m50292f().m50298i(0L);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m140544a0(final OnlineMatchPushUser onlineMatchPushUser, boolean z, final OnlineMatchMatchUser onlineMatchMatchUser) {
        this.f116852j.mo41998j0(this.f116851i, onlineMatchPushUser, z, onlineMatchMatchUser, new f30() { // from class: l.e940
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f89919a.m140536R(onlineMatchMatchUser, onlineMatchPushUser, (Boolean) obj, (String) obj2);
            }
        }, new e30() { // from class: l.f940
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96453a.m140537S(onlineMatchPushUser, (Boolean) obj);
            }
        });
    }

    @Override // p149l.l0m
    public boolean isValid() {
        return this.f116859q == TabName.Msg;
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: j */
    public int mo21138j() {
        return this.f116851i.hashCode();
    }

    @Override // p149l.l0m
    /* JADX INFO: renamed from: m */
    public Act getAct() {
        return this.f116851i;
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: n */
    public void mo20872n(boolean z) {
        if (NullChecker.m81303a(this.f116858p) && this.f116858p.isShowing()) {
            this.f116858p.dismiss();
        } else if (NullChecker.m81303a(this.f69977f)) {
            this.f69977f.mo21109a(this);
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

    @Override // p149l.j0m
    /* JADX INFO: renamed from: f */
    public void mo20865f(boolean z) {
    }
}
