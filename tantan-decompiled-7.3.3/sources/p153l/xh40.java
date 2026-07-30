package p153l;

import android.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioBaseHeaderUserView;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8774c;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchMatchUser;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchPushUser;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class xh40 extends fqe0 {

    /* JADX INFO: renamed from: i */
    public final Act f194265i;

    /* JADX INFO: renamed from: j */
    public QuickChatAudioBaseHeaderUserView f194266j;

    /* JADX INFO: renamed from: l */
    public String f194268l;

    /* JADX INFO: renamed from: m */
    public OnlineMatchMatchUser f194269m;

    /* JADX INFO: renamed from: n */
    public OnlineMatchPushUser f194270n;

    /* JADX INFO: renamed from: p */
    public PopupWindow f194272p;

    /* JADX INFO: renamed from: o */
    public kcg0 f194271o = null;

    /* JADX INFO: renamed from: q */
    public TabName f194273q = TabName.Msg;

    /* JADX INFO: renamed from: r */
    public kcg0 f194274r = null;

    /* JADX INFO: renamed from: k */
    public final afj0 f194267k = new afj0();

    public xh40(Act act) {
        this.f194265i = act;
    }

    /* JADX INFO: renamed from: T */
    private void m210989T() {
        View viewFindViewById = this.f194265i.findViewById(R.id.content);
        if (this.f194265i.isFinishing() || this.f194265i.isDestroyed() || this.f194272p.isShowing() || !NullChecker.m82486a(viewFindViewById.getWindowToken())) {
            return;
        }
        this.f194272p.showAtLocation(viewFindViewById, 49, 0, -qa00.f156330q);
    }

    @Override // p153l.fqe0
    /* JADX INFO: renamed from: A */
    public int mo22133A() {
        Act act;
        pcj<Boolean> pcjVar = this.f100279d;
        if ((pcjVar != null && !pcjVar.call().booleanValue()) || (act = this.f194265i) == null || act.isFinishing()) {
            if (NullChecker.m82486a(this.f121543b)) {
                this.f121543b.call();
            }
            return 0;
        }
        if (m210993N()) {
            return 0;
        }
        bsj0.m106263U(this.f194274r);
        m210992M();
        View viewInflate = (spl0.m187366R() && "tickets_broadcast".equals(this.f194268l)) ? p9r.m171370a(this.f194265i).inflate(kec0.f125412Fb, (ViewGroup) null) : p9r.m171370a(this.f194265i).inflate(kec0.f125378Db, (ViewGroup) null);
        this.f194266j = (QuickChatAudioBaseHeaderUserView) viewInflate.findViewById(adc0.f70225Ye);
        if ("match_success".equals(this.f194268l)) {
            this.f194267k.m97349g(this.f194269m);
            C8774c.m51475f().m51482j();
            m211003Y();
            m211005a0(null, true, this.f194269m);
        } else if ("tickets_broadcast".equals(this.f194268l)) {
            this.f194267k.m97351j(this.f194270n);
            C8774c.m51475f().m51484l(this.f194270n, true);
            m211003Y();
            m211005a0(this.f194270n, false, null);
            this.f194266j.setReceiverUserIsFemale(this.f194270n.isFemale());
            this.f194266j.setBroadcastTextTimerValue(pzi0.m174454o());
        }
        PopupWindow popupWindow = new PopupWindow(viewInflate, -1, -2);
        this.f194272p = popupWindow;
        popupWindow.setOutsideTouchable(false);
        this.f194272p.setAnimationStyle(agc0.f71110D);
        m210989T();
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: K */
    public final String m210990K(OnlineMatchPushUser onlineMatchPushUser) {
        return NullChecker.m82486a(onlineMatchPushUser) ? h1c0.INSTANCE.m133321b(onlineMatchPushUser.fitReason) : "default";
    }

    /* JADX INFO: renamed from: L */
    public void m210991L() {
        if (NullChecker.m82486a(this.f194272p)) {
            this.f194272p.dismiss();
            this.f194272p = null;
            if (NullChecker.m82486a(this.f121543b)) {
                this.f121543b.call();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public void m210992M() {
        if (C4522a.m22099p().m22107I()) {
            return;
        }
        this.f194274r = this.f194265i.duringCreated(ji30.m144967k().distinctUntilChanged().skip(1)).subscribe(psd0.m173596G(new y20() { // from class: l.rh40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163075a.m210994O((TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public boolean m210993N() {
        if (NullChecker.m82486a(this.f194272p)) {
            return this.f194272p.isShowing();
        }
        return false;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m210994O(TabName tabName) {
        this.f194273q = tabName;
        TabName tabName2 = TabName.Msg;
        m211002X(tabName == tabName2);
        if (tabName == tabName2) {
            al80 al80VarM110428f = cl80.m110426e().m110428f();
            if (NullChecker.m82486a(al80VarM110428f) && (al80VarM110428f.m98644g() instanceof xh40)) {
                l51.m152888H(this.f194265i, new Runnable() { // from class: l.vh40
                    @Override // java.lang.Runnable
                    public final void run() {
                        cl80.m110426e().m110441s();
                    }
                }, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m210995P(Long l2) {
        if (C8774c.m51475f().m51480h()) {
            bsj0.m106263U(this.f194271o);
            m210991L();
            boolean currentIsMatch = C8774c.m51475f().getCurrentIsMatch();
            afj0 afj0Var = this.f194267k;
            if (currentIsMatch) {
                afj0Var.m97348f();
                return;
            }
            afj0Var.m97353m();
            this.f194266j.setBroadcastTextTimerValue(-1L);
            C8774c.m51475f().m51481i(0L);
            CoreModule.f18264c.f20300D0.m35839L4(C8774c.m51475f().getPushUser());
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m210996Q() {
        m211004Z();
        m210991L();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m210997R(OnlineMatchMatchUser onlineMatchMatchUser, OnlineMatchPushUser onlineMatchPushUser, Boolean bool, String str) {
        if (!bool.booleanValue()) {
            this.f194267k.m97344a(!TextUtils.isEmpty(str), NullChecker.m82486a(onlineMatchPushUser) ? onlineMatchPushUser.isMaleQuickChatRing : false, m210990K(onlineMatchPushUser), "message");
            if (NullChecker.m82486a(onlineMatchPushUser)) {
                OnlineMatchManager.m51326z().m51369r0(this.f194265i, onlineMatchPushUser, new x20() { // from class: l.wh40
                    @Override // p153l.x20
                    public final void call() {
                        this.f189082a.m210996Q();
                    }
                }, str);
                return;
            }
            return;
        }
        m211004Z();
        m210991L();
        this.f194267k.m97347e(!TextUtils.isEmpty(str));
        if (NullChecker.m82486a(onlineMatchMatchUser)) {
            Act act = this.f194265i;
            act.startActivity(MessagesAct.m50132q2(act, onlineMatchMatchUser.userId, false, false, false, false, null, 7, str));
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m210998S(OnlineMatchPushUser onlineMatchPushUser, Boolean bool) {
        m211004Z();
        m210991L();
        boolean zBooleanValue = bool.booleanValue();
        afj0 afj0Var = this.f194267k;
        if (zBooleanValue) {
            afj0Var.m97348f();
            return;
        }
        afj0Var.m97350h(NullChecker.m82486a(onlineMatchPushUser) ? onlineMatchPushUser.isMaleQuickChatRing : false, m210990K(onlineMatchPushUser), "message");
        CoreModule.f18264c.f20300D0.m35839L4(onlineMatchPushUser);
        this.f194266j.setBroadcastTextTimerValue(-1L);
        this.f194267k.m97353m();
    }

    /* JADX INFO: renamed from: U */
    public xh40 m210999U(String str) {
        this.f194268l = str;
        return this;
    }

    /* JADX INFO: renamed from: V */
    public xh40 m211000V(OnlineMatchMatchUser onlineMatchMatchUser) {
        this.f194269m = onlineMatchMatchUser;
        return this;
    }

    /* JADX INFO: renamed from: W */
    public xh40 m211001W(OnlineMatchPushUser onlineMatchPushUser) {
        this.f194270n = onlineMatchPushUser;
        return this;
    }

    /* JADX INFO: renamed from: X */
    public void m211002X(boolean z) {
        if (NullChecker.m82486a(this.f194272p)) {
            if (z) {
                m211003Y();
                m210989T();
            } else {
                this.f194272p.dismiss();
                bsj0.m106263U(this.f194271o);
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m211003Y() {
        if (C8774c.m51475f().getCurrentTime() == 0) {
            return;
        }
        bsj0.m106263U(this.f194271o);
        this.f194271o = this.f194265i.duringCreated(C22421c.interval(0L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a())).subscribe(psd0.m173596G(new y20() { // from class: l.uh40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178990a.m210995P((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public void m211004Z() {
        bsj0.m106263U(this.f194271o);
        bsj0.m106263U(this.f194274r);
        C8774c.m51475f().m51481i(0L);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m211005a0(final OnlineMatchPushUser onlineMatchPushUser, boolean z, final OnlineMatchMatchUser onlineMatchMatchUser) {
        this.f194266j.mo43009j0(this.f194265i, onlineMatchPushUser, z, onlineMatchMatchUser, new z20() { // from class: l.sh40
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f168593a.m210997R(onlineMatchMatchUser, onlineMatchPushUser, (Boolean) obj, (String) obj2);
            }
        }, new y20() { // from class: l.th40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174271a.m210998S(onlineMatchPushUser, (Boolean) obj);
            }
        });
    }

    @Override // p153l.f3m
    public boolean isValid() {
        return this.f194273q == TabName.Msg;
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: j */
    public int mo22137j() {
        return this.f194265i.hashCode();
    }

    @Override // p153l.f3m
    /* JADX INFO: renamed from: m */
    public Act getAct() {
        return this.f194265i;
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: n */
    public void mo21871n(boolean z) {
        if (NullChecker.m82486a(this.f194272p) && this.f194272p.isShowing()) {
            this.f194272p.dismiss();
        } else if (NullChecker.m82486a(this.f100281f)) {
            this.f100281f.mo22108a(this);
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

    @Override // p153l.d3m
    /* JADX INFO: renamed from: f */
    public void mo21864f(boolean z) {
    }
}
