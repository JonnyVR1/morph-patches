package p009l;

import android.R;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.p000p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioBaseHeaderUserView;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.poplevel.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchMatchUser;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchPushUser;
import com.p1.mobile.putong.core.ui.onlinematch.c;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import l.aie0;
import l.c4g0;
import l.d30;
import l.e30;
import l.e51;
import l.f30;
import l.f6c0;
import l.fdb0;
import l.jo0;
import l.mkd0;
import l.ogl0;
import l.t100;
import l.u4c0;
import l.uc80;
import l.v7c0;
import l.v930;
import l.v9j;
import l.wc80;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class j940 extends aie0 {

    /* JADX INFO: renamed from: i */
    public final Act f14994i;

    /* JADX INFO: renamed from: j */
    public QuickChatAudioBaseHeaderUserView f14995j;

    /* JADX INFO: renamed from: l */
    public String f14997l;

    /* JADX INFO: renamed from: m */
    public OnlineMatchMatchUser f14998m;

    /* JADX INFO: renamed from: n */
    public OnlineMatchPushUser f14999n;

    /* JADX INFO: renamed from: p */
    public PopupWindow f15001p;

    /* JADX INFO: renamed from: o */
    public c4g0 f15000o = null;

    /* JADX INFO: renamed from: q */
    public TabName f15002q = TabName.Msg;

    /* JADX INFO: renamed from: r */
    public c4g0 f15003r = null;

    /* JADX INFO: renamed from: k */
    public final w5j0 f14996k = new w5j0();

    public j940(Act act) {
        this.f14994i = act;
    }

    /* JADX INFO: renamed from: T */
    private void m16891T() {
        View viewFindViewById = this.f14994i.findViewById(R.id.content);
        if (this.f14994i.isFinishing() || this.f14994i.isDestroyed() || this.f15001p.isShowing() || !NullChecker.a(viewFindViewById.getWindowToken())) {
            return;
        }
        this.f15001p.showAtLocation(viewFindViewById, 49, 0, -t100.q);
    }

    /* JADX INFO: renamed from: A */
    public int m16892A() {
        Act act;
        v9j v9jVar = ((aie0) this).d;
        if ((v9jVar != null && !((Boolean) v9jVar.call()).booleanValue()) || (act = this.f14994i) == null || act.isFinishing()) {
            if (NullChecker.a(((fdb0) this).b)) {
                ((fdb0) this).b.call();
            }
            return 0;
        }
        if (m16896N()) {
            return 0;
        }
        yij0.m25399U(this.f15003r);
        m16895M();
        View viewInflate = (ogl0.R() && "tickets_broadcast".equals(this.f14997l)) ? o7r.m19649a(this.f14994i).inflate(f6c0.yb, (ViewGroup) null) : o7r.m19649a(this.f14994i).inflate(f6c0.wb, (ViewGroup) null);
        this.f14995j = (QuickChatAudioBaseHeaderUserView) viewInflate.findViewById(u4c0.Ve);
        if ("match_success".equals(this.f14997l)) {
            this.f14996k.m23909g(this.f14998m);
            c.f().j();
            m16906Y();
            m16908a0(null, true, this.f14998m);
        } else if ("tickets_broadcast".equals(this.f14997l)) {
            this.f14996k.m23911j(this.f14999n);
            c.f().l(this.f14999n, true);
            m16906Y();
            m16908a0(this.f14999n, false, null);
            this.f14995j.setReceiverUserIsFemale(this.f14999n.isFemale());
            this.f14995j.setBroadcastTextTimerValue(mqi0.m18550o());
        }
        PopupWindow popupWindow = new PopupWindow(viewInflate, -1, -2);
        this.f15001p = popupWindow;
        popupWindow.setOutsideTouchable(false);
        this.f15001p.setAnimationStyle(v7c0.D);
        m16891T();
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: K */
    public final String m16893K(OnlineMatchPushUser onlineMatchPushUser) {
        return NullChecker.a(onlineMatchPushUser) ? dtb0.INSTANCE.m13474b(onlineMatchPushUser.fitReason) : "default";
    }

    /* JADX INFO: renamed from: L */
    public void m16894L() {
        if (NullChecker.a(this.f15001p)) {
            this.f15001p.dismiss();
            this.f15001p = null;
            if (NullChecker.a(((fdb0) this).b)) {
                ((fdb0) this).b.call();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public void m16895M() {
        if (a.p().I()) {
            return;
        }
        this.f15003r = this.f14994i.duringCreated(v930.k().distinctUntilChanged().skip(1)).subscribe(mkd0.G(new e30() { // from class: l.d940
            public final void call(Object obj) {
                this.f11676a.m16897O((TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public boolean m16896N() {
        if (NullChecker.a(this.f15001p)) {
            return this.f15001p.isShowing();
        }
        return false;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m16897O(TabName tabName) {
        this.f15002q = tabName;
        TabName tabName2 = TabName.Msg;
        m16905X(tabName == tabName2);
        if (tabName == tabName2) {
            uc80 uc80VarF = wc80.e().f();
            if (NullChecker.a(uc80VarF) && (uc80VarF.g() instanceof j940)) {
                e51.H(this.f14994i, new Runnable() { // from class: l.h940
                    @Override // java.lang.Runnable
                    public final void run() {
                        wc80.e().s();
                    }
                }, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m16898P(Long l2) {
        if (c.f().h()) {
            yij0.m25399U(this.f15000o);
            m16894L();
            boolean zD = c.f().d();
            w5j0 w5j0Var = this.f14996k;
            if (zD) {
                w5j0Var.m23908f();
                return;
            }
            w5j0Var.m23913m();
            this.f14995j.setBroadcastTextTimerValue(-1L);
            c.f().i(0L);
            CoreModule.c.D0.L4(c.f().g());
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m16899Q() {
        m16907Z();
        m16894L();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m16900R(OnlineMatchMatchUser onlineMatchMatchUser, OnlineMatchPushUser onlineMatchPushUser, Boolean bool, String str) {
        if (!bool.booleanValue()) {
            this.f14996k.m23904a(!TextUtils.isEmpty(str), NullChecker.a(onlineMatchPushUser) ? onlineMatchPushUser.isMaleQuickChatRing : false, m16893K(onlineMatchPushUser), "message");
            if (NullChecker.a(onlineMatchPushUser)) {
                OnlineMatchManager.z().r0(this.f14994i, onlineMatchPushUser, new d30() { // from class: l.i940
                    public final void call() {
                        this.f14443a.m16899Q();
                    }
                }, str);
                return;
            }
            return;
        }
        m16907Z();
        m16894L();
        this.f14996k.m23907e(!TextUtils.isEmpty(str));
        if (NullChecker.a(onlineMatchMatchUser)) {
            Act act = this.f14994i;
            act.startActivity(MessagesAct.p2(act, onlineMatchMatchUser.userId, false, false, false, false, (Intent) null, 7, str));
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m16901S(OnlineMatchPushUser onlineMatchPushUser, Boolean bool) {
        m16907Z();
        m16894L();
        boolean zBooleanValue = bool.booleanValue();
        w5j0 w5j0Var = this.f14996k;
        if (zBooleanValue) {
            w5j0Var.m23908f();
            return;
        }
        w5j0Var.m23910h(NullChecker.a(onlineMatchPushUser) ? onlineMatchPushUser.isMaleQuickChatRing : false, m16893K(onlineMatchPushUser), "message");
        CoreModule.c.D0.L4(onlineMatchPushUser);
        this.f14995j.setBroadcastTextTimerValue(-1L);
        this.f14996k.m23913m();
    }

    /* JADX INFO: renamed from: U */
    public j940 m16902U(String str) {
        this.f14997l = str;
        return this;
    }

    /* JADX INFO: renamed from: V */
    public j940 m16903V(OnlineMatchMatchUser onlineMatchMatchUser) {
        this.f14998m = onlineMatchMatchUser;
        return this;
    }

    /* JADX INFO: renamed from: W */
    public j940 m16904W(OnlineMatchPushUser onlineMatchPushUser) {
        this.f14999n = onlineMatchPushUser;
        return this;
    }

    /* JADX INFO: renamed from: X */
    public void m16905X(boolean z) {
        if (NullChecker.a(this.f15001p)) {
            if (z) {
                m16906Y();
                m16891T();
            } else {
                this.f15001p.dismiss();
                yij0.m25399U(this.f15000o);
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m16906Y() {
        if (c.f().e() == 0) {
            return;
        }
        yij0.m25399U(this.f15000o);
        this.f15000o = this.f14994i.duringCreated(rx.c.interval(0L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a())).subscribe(mkd0.G(new e30() { // from class: l.g940
            public final void call(Object obj) {
                this.f13379a.m16898P((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public void m16907Z() {
        yij0.m25399U(this.f15000o);
        yij0.m25399U(this.f15003r);
        c.f().i(0L);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m16908a0(final OnlineMatchPushUser onlineMatchPushUser, boolean z, final OnlineMatchMatchUser onlineMatchMatchUser) {
        this.f14995j.mo6140j0(this.f14994i, onlineMatchPushUser, z, onlineMatchMatchUser, new f30() { // from class: l.e940
            public final void call(Object obj, Object obj2) {
                this.f12453a.m16900R(onlineMatchMatchUser, onlineMatchPushUser, (Boolean) obj, (String) obj2);
            }
        }, new e30() { // from class: l.f940
            public final void call(Object obj) {
                this.f12876a.m16901S(onlineMatchPushUser, (Boolean) obj);
            }
        });
    }

    public boolean isValid() {
        return this.f15002q == TabName.Msg;
    }

    /* JADX INFO: renamed from: j */
    public int m16910j() {
        return this.f14994i.hashCode();
    }

    /* JADX INFO: renamed from: m */
    public Act m16911m() {
        return this.f14994i;
    }

    /* JADX INFO: renamed from: n */
    public void m16912n(boolean z) {
        if (NullChecker.a(this.f15001p) && this.f15001p.isShowing()) {
            this.f15001p.dismiss();
        } else if (NullChecker.a(((aie0) this).f)) {
            ((aie0) this).f.a(this);
        }
    }

    /* JADX INFO: renamed from: o */
    public String m16913o() {
        return MagicBubble.QUICK_CHAT_BUBBLE.getGroup();
    }

    /* JADX INFO: renamed from: p */
    public String m16914p() {
        return MagicBubble.QUICK_CHAT_BUBBLE.getId();
    }

    /* JADX INFO: renamed from: f */
    public void m16909f(boolean z) {
    }
}
