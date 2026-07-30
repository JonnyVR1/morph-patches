package com.p000p1.mobile.putong.core.newui.messages.anim.view;

import android.R;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.p000p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.poplevel.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.v;
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
import l.f0m;
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
import l.xdl0;
import p009l.dtb0;
import p009l.mqi0;
import p009l.o7r;
import p009l.w5j0;
import p009l.yij0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0332b extends aie0 {

    /* JADX INFO: renamed from: i */
    public Act f4423i;

    /* JADX INFO: renamed from: j */
    public QuickChatAudioBaseHeaderUserView f4424j;

    /* JADX INFO: renamed from: l */
    public String f4426l;

    /* JADX INFO: renamed from: m */
    public OnlineMatchMatchUser f4427m;

    /* JADX INFO: renamed from: n */
    public OnlineMatchPushUser f4428n;

    /* JADX INFO: renamed from: p */
    public QuickChatAudioHeaderView.HeaderState f4430p;

    /* JADX INFO: renamed from: q */
    public PopupWindow f4431q;

    /* JADX INFO: renamed from: o */
    public c4g0 f4429o = null;

    /* JADX INFO: renamed from: r */
    public TabName f4432r = TabName.Msg;

    /* JADX INFO: renamed from: k */
    public w5j0 f4425k = new w5j0();

    public C0332b(Act act) {
        this.f4423i = act;
    }

    /* JADX INFO: renamed from: K */
    private String m6328K(OnlineMatchPushUser onlineMatchPushUser) {
        return NullChecker.a(onlineMatchPushUser) ? dtb0.INSTANCE.m13474b(onlineMatchPushUser.fitReason) : "default";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m6329P(Long l2) {
        if (c.f().h()) {
            yij0.m25399U(this.f4429o);
            m6343X();
            m6336L();
            boolean zD = c.f().d();
            w5j0 w5j0Var = this.f4425k;
            if (zD) {
                w5j0Var.m23908f();
                return;
            }
            w5j0Var.m23913m();
            this.f4424j.setBroadcastTextTimerValue(-1L);
            c.f().i(0L);
            CoreModule.c.D0.L4(c.f().g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m6330Q() {
        m6343X();
        m6336L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m6331R(OnlineMatchMatchUser onlineMatchMatchUser, OnlineMatchPushUser onlineMatchPushUser, Boolean bool, String str) {
        if (!bool.booleanValue()) {
            this.f4425k.m23904a(!TextUtils.isEmpty(str), NullChecker.a(onlineMatchPushUser) ? onlineMatchPushUser.isMaleQuickChatRing : false, m6328K(onlineMatchPushUser), "message");
            if (NullChecker.a(onlineMatchPushUser)) {
                OnlineMatchManager.z().r0(this.f4423i, onlineMatchPushUser, new d30() { // from class: l.ctb0
                    public final void call() {
                        this.f10761a.m6330Q();
                    }
                }, str);
                return;
            }
            return;
        }
        m6343X();
        m6336L();
        this.f4425k.m23907e(!TextUtils.isEmpty(str));
        if (NullChecker.a(onlineMatchMatchUser)) {
            Act act = this.f4423i;
            act.startActivity(MessagesAct.p2(act, onlineMatchMatchUser.userId, false, false, false, false, (Intent) null, 7, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m6332S(OnlineMatchPushUser onlineMatchPushUser, Boolean bool) {
        m6343X();
        m6336L();
        boolean zBooleanValue = bool.booleanValue();
        w5j0 w5j0Var = this.f4425k;
        if (zBooleanValue) {
            w5j0Var.m23908f();
            return;
        }
        w5j0Var.m23910h(NullChecker.a(onlineMatchPushUser) ? onlineMatchPushUser.isMaleQuickChatRing : false, m6328K(onlineMatchPushUser), "message");
        CoreModule.c.D0.L4(onlineMatchPushUser);
        this.f4424j.setBroadcastTextTimerValue(-1L);
        this.f4425k.m23913m();
    }

    /* JADX INFO: renamed from: T */
    private void m6333T() {
        View viewFindViewById = this.f4423i.findViewById(R.id.content);
        if (this.f4423i.isFinishing() || this.f4423i.isDestroyed() || this.f4431q.isShowing() || !NullChecker.a(viewFindViewById.getWindowToken())) {
            return;
        }
        this.f4431q.showAtLocation(viewFindViewById, 49, 0, -t100.q);
    }

    /* JADX INFO: renamed from: d0 */
    private void m6334d0(final OnlineMatchPushUser onlineMatchPushUser, boolean z, final OnlineMatchMatchUser onlineMatchMatchUser) {
        xdl0.M(this.f4424j, true);
        this.f4424j.init();
        this.f4424j.mo6140j0(this.f4423i, onlineMatchPushUser, z, onlineMatchMatchUser, new f30() { // from class: l.atb0
            public final void call(Object obj, Object obj2) {
                this.f9669a.m6331R(onlineMatchMatchUser, onlineMatchPushUser, (Boolean) obj, (String) obj2);
            }
        }, new e30() { // from class: l.btb0
            public final void call(Object obj) {
                this.f10297a.m6332S(onlineMatchPushUser, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public int m6335A() {
        Act act;
        v9j v9jVar = ((aie0) this).d;
        if ((v9jVar != null && !((Boolean) v9jVar.call()).booleanValue()) || (act = this.f4423i) == null || act.isFinishing()) {
            if (NullChecker.a(((fdb0) this).b)) {
                ((fdb0) this).b.call();
            }
            return 0;
        }
        if (m6338N()) {
            return 0;
        }
        View viewInflate = o7r.m19649a(this.f4423i).inflate(f6c0.jb, (ViewGroup) null);
        this.f4424j = (QuickChatAudioBaseHeaderUserView) viewInflate.findViewById(u4c0.N4);
        if ("match_success".equals(this.f4426l)) {
            this.f4425k.m23909g(this.f4427m);
            c.f().j();
            m6346a0();
            m6334d0(null, true, this.f4427m);
        } else if ("tickets_broadcast".equals(this.f4426l)) {
            this.f4425k.m23911j(this.f4428n);
            c.f().l(this.f4428n, true);
            m6346a0();
            m6334d0(this.f4428n, false, null);
            this.f4424j.setReceiverUserIsFemale(this.f4428n.isFemale());
            this.f4424j.setBroadcastTextTimerValue(mqi0.m18550o());
            this.f4424j.mo6154h0();
        }
        PopupWindow popupWindow = new PopupWindow(viewInflate, -1, -2);
        this.f4431q = popupWindow;
        popupWindow.setOutsideTouchable(false);
        this.f4431q.setAnimationStyle(v7c0.D);
        m6333T();
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: L */
    public void m6336L() {
        if (NullChecker.a(this.f4431q)) {
            this.f4431q.dismiss();
            this.f4431q = null;
            if (NullChecker.a(((fdb0) this).b)) {
                ((fdb0) this).b.call();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public void m6337M(final Act act) {
        if (a.p().I()) {
            return;
        }
        act.duringCreated(v930.k().distinctUntilChanged().skip(1)).subscribe(mkd0.G(new e30() { // from class: l.xsb0
            public final void call(Object obj) {
                this.f22704a.m6339O(act, (TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public boolean m6338N() {
        if (NullChecker.a(this.f4431q)) {
            return this.f4431q.isShowing();
        }
        return false;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m6339O(Act act, TabName tabName) {
        this.f4432r = tabName;
        TabName tabName2 = TabName.Msg;
        m6345Z(tabName == tabName2);
        if (tabName == tabName2) {
            uc80 uc80VarF = wc80.e().f();
            if (NullChecker.a(uc80VarF) && (uc80VarF.g() instanceof C0332b)) {
                e51.H(act, new Runnable() { // from class: l.ysb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        wc80.e().s();
                    }
                }, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public C0332b m6340U(QuickChatAudioHeaderView.HeaderState headerState) {
        this.f4430p = headerState;
        return this;
    }

    /* JADX INFO: renamed from: V */
    public C0332b m6341V(String str) {
        this.f4426l = str;
        return this;
    }

    /* JADX INFO: renamed from: W */
    public C0332b m6342W(OnlineMatchMatchUser onlineMatchMatchUser) {
        this.f4427m = onlineMatchMatchUser;
        return this;
    }

    /* JADX INFO: renamed from: X */
    public void m6343X() {
        if (ogl0.R()) {
            return;
        }
        yij0.m25399U(this.f4429o);
        c.f().i(0L);
        if (NullChecker.a(this.f4424j)) {
            this.f4424j.mo6155i0();
            this.f4424j.setBroadcastTextTimerValue(-1L);
        }
    }

    /* JADX INFO: renamed from: Y */
    public C0332b m6344Y(OnlineMatchPushUser onlineMatchPushUser) {
        this.f4428n = onlineMatchPushUser;
        return this;
    }

    /* JADX INFO: renamed from: Z */
    public void m6345Z(boolean z) {
        if (NullChecker.a(this.f4431q)) {
            if (z) {
                m6333T();
            } else {
                this.f4431q.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m6346a0() {
        if (c.f().e() == 0) {
            return;
        }
        yij0.m25399U(this.f4429o);
        this.f4429o = rx.c.interval(0L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.zsb0
            public final void call(Object obj) {
                this.f23857a.m6329P((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b0 */
    public void m6347b0() {
        m6346a0();
        if (!NullChecker.a(this.f4424j) || this.f4424j.getBroadcastTextTimerValue() <= 0) {
            return;
        }
        this.f4424j.mo6154h0();
    }

    /* JADX INFO: renamed from: c0 */
    public void m6348c0() {
        yij0.m25399U(this.f4429o);
        if (NullChecker.a(this.f4424j)) {
            this.f4424j.mo6155i0();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m6349f(boolean z) {
        PopupWindow popupWindow = this.f4431q;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        PopupWindow popupWindow2 = this.f4431q;
        if (z) {
            popupWindow2.getContentView().setTranslationY(0.0f);
            this.f4431q.getContentView().setAlpha(1.0f);
        } else {
            popupWindow2.getContentView().setTranslationY(-4000.0f);
            this.f4431q.getContentView().setAlpha(0.0f);
        }
    }

    public boolean isValid() {
        if (this.f4432r != TabName.Msg) {
            return false;
        }
        if (TextUtils.equals("match_success", this.f4426l)) {
            if (c.f().h()) {
                OnlineMatchManager.z().I.onNext(v.b0);
                c.f().i(0L);
                m6343X();
                return false;
            }
            if (this.f4430p != QuickChatAudioHeaderView.HeaderState.GetUserState) {
                return true;
            }
            OnlineMatchManager.z().I.onNext(v.b0);
            return false;
        }
        if (!TextUtils.equals("tickets_broadcast", this.f4426l)) {
            return true;
        }
        if (this.f4430p == QuickChatAudioHeaderView.HeaderState.GetUserState) {
            OnlineMatchManager.z().I.onNext(v.b0);
            return false;
        }
        if (!c.f().h()) {
            return true;
        }
        OnlineMatchManager.z().I.onNext(v.b0);
        c.f().i(0L);
        m6343X();
        CoreModule.c.D0.L4((OnlineMatchPushUser) null);
        return false;
    }

    /* JADX INFO: renamed from: j */
    public int m6350j() {
        return this.f4423i.hashCode();
    }

    /* JADX INFO: renamed from: m */
    public Act m6351m() {
        return this.f4423i;
    }

    /* JADX INFO: renamed from: n */
    public void m6352n(boolean z) {
        PopupWindow popupWindow = this.f4431q;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f4431q.dismiss();
            return;
        }
        f0m f0mVar = ((aie0) this).f;
        if (f0mVar != null) {
            f0mVar.a(this);
        }
    }

    /* JADX INFO: renamed from: o */
    public String m6353o() {
        return MagicBubble.QUICK_CHAT_BUBBLE.getGroup();
    }

    /* JADX INFO: renamed from: p */
    public String m6354p() {
        return MagicBubble.QUICK_CHAT_BUBBLE.getId();
    }
}
