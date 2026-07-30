package p153l;

import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p051p1.mobile.putong.core.data.LoveLetterMessageInfo;
import com.p051p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p051p1.mobile.putong.core.newui.loveletter.LoveLetterAct;
import com.p051p1.mobile.putong.core.newui.loveletter.LoveLetterEditAct;
import com.p051p1.mobile.putong.core.newui.loveletter.search.LoveLetterSearchAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
public class pdw extends ar2<uew> implements few {

    /* JADX INFO: renamed from: a */
    public jxd0 f151840a;

    /* JADX INFO: renamed from: b */
    public final LoveLetterAct f151841b;

    /* JADX INFO: renamed from: c */
    public String f151842c;

    /* JADX INFO: renamed from: d */
    public LoveLetterEntryInfo f151843d;

    /* JADX INFO: renamed from: e */
    public l4g0 f151844e;

    public pdw(LoveLetterAct loveLetterAct) {
        super(loveLetterAct);
        this.f151840a = new jxd0("love_letter_func_dialog_" + CoreModule.m30929H().userId(), Boolean.FALSE);
        this.f151841b = loveLetterAct;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m171893e0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m171898j0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m171900l0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m171902o0(uxj0 uxj0Var) {
        m171905n0(CoreModule.f18264c.f20381e0.f89136U1.m222761e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m171903p0(Throwable th) {
        this.f151841b.lambda$debugItems$19();
        o1j0.m165634h(R$string.f19605r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m171904q0(C4470c c4470c) {
        l4g0 l4g0Var;
        if (c4470c == C4470c.f16267i) {
            l4g0 l4g0Var2 = this.f151844e;
            if (l4g0Var2 != null) {
                w1e.m204402f(l4g0Var2);
                return;
            }
            return;
        }
        if (c4470c != C4470c.f16268j || (l4g0Var = this.f151844e) == null) {
            return;
        }
        w1e.m204401e(l4g0Var);
    }

    @Override // p153l.few
    /* JADX INFO: renamed from: F */
    public void mo125335F() {
        i4g0.m138520r("e_search_entrance", "p_love_letter");
        LoveLetterAct loveLetterAct = this.f151841b;
        loveLetterAct.startActivity(LoveLetterSearchAct.m40622Z1(loveLetterAct));
    }

    @Override // p153l.few
    /* JADX INFO: renamed from: R */
    public void mo125336R(String str) {
        if (CoreModule.f18264c.f20381e0.m116503Pa(str) == null) {
            return;
        }
        LoveLetterAct loveLetterAct = this.f151841b;
        loveLetterAct.startActivity(LoveLetterEditAct.m40566h2(loveLetterAct, str));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        duringCreated(CoreModule.f18264c.f20381e0.m116554da()).subscribe(psd0.m173597H(new y20() { // from class: l.gdw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103745a.m171902o0((uxj0) obj);
            }
        }, new y20() { // from class: l.hdw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109048a.m171903p0((Throwable) obj);
            }
        }));
        this.f151841b.lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.idw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114528a.m171904q0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public final void m171905n0(LoveLetterEntryInfo loveLetterEntryInfo) {
        if (loveLetterEntryInfo == null) {
            this.f151841b.lambda$debugItems$19();
            return;
        }
        if (!loveLetterEntryInfo.display) {
            this.f151841b.lambda$debugItems$19();
            return;
        }
        this.f151843d = loveLetterEntryInfo;
        Intent intent = this.f151841b.getIntent();
        String stringExtra = intent.getStringExtra("extra_msg_id");
        String stringExtra2 = intent.getStringExtra("extra_user_id");
        if (stringExtra2 != null && stringExtra != null) {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(stringExtra2);
            if (userM116503Pa == null) {
                this.f151841b.lambda$debugItems$19();
                return;
            }
            LoveLetterMessageInfo loveLetterMessageInfoNew_ = LoveLetterMessageInfo.new_();
            loveLetterMessageInfoNew_.f21179id = stringExtra;
            loveLetterMessageInfoNew_.otherUser = stringExtra2;
            m171910x0(loveLetterMessageInfoNew_, userM116503Pa);
            return;
        }
        LoveLetterMessageInfo loveLetterMessageInfo = loveLetterEntryInfo.message;
        if (loveLetterMessageInfo == null || TextUtils.isEmpty(loveLetterMessageInfo.otherUser)) {
            m171911y0();
            return;
        }
        User userM116503Pa2 = CoreModule.f18264c.f20381e0.m116503Pa(loveLetterEntryInfo.message.otherUser);
        if (userM116503Pa2 == null) {
            this.f151841b.lambda$debugItems$19();
        } else {
            m171910x0(loveLetterEntryInfo.message, userM116503Pa2);
        }
    }

    @Override // p153l.few
    public String pageId() {
        return "p_love_letter";
    }

    @Override // p153l.few
    /* JADX INFO: renamed from: r */
    public void mo125337r() {
        final String str = this.f151842c;
        if (str != null) {
            CoreModule.f18264c.f20384f0.m33903an(str).subscribe(psd0.m173597H(new y20() { // from class: l.mdw
                @Override // p153l.y20
                public final void call(Object obj) {
                    pdw.m171893e0((uxj0) obj);
                }
            }, new y20() { // from class: l.ndw
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f141550a.m171906r0(str, (Throwable) obj);
                }
            }));
            this.f151842c = null;
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m171906r0(String str, Throwable th) {
        this.f151842c = str;
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m171907s0(User user, String str, Conversation conversation) {
        if (conversation == null) {
            o1j0.m165651y("当前会话已移除，有新消息时会再次展示");
        } else {
            this.f151841b.startActivity(MessagesAct.m50115N2(this.f151841b, user.f56859id, false, false, -1, str, false));
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m171908t0(vg60 vg60Var) {
        this.f151842c = vg60Var.f184002b.links.next;
        ((uew) this.viewModel).m195806n(vg60Var.f184001a, this.f151843d);
        if (this.f151840a.get().booleanValue()) {
            return;
        }
        this.f151840a.put(Boolean.TRUE);
        ((uew) this.viewModel).m195808q();
    }

    /* JADX INFO: renamed from: u0 */
    public void m171909u0(final String str, final User user) {
        i4g0.m138520r("e_view_letter", "p_letter_sent");
        duringCreated(CoreModule.f18264c.f20384f0.m33728Me().uiGet(user.f56859id)).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.odw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f146947a.m171907s0(user, str, (Conversation) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public final void m171910x0(LoveLetterMessageInfo loveLetterMessageInfo, User user) {
        ((uew) this.viewModel).m195805m(loveLetterMessageInfo.f21179id, user, loveLetterMessageInfo.state);
        l4g0 l4g0VarM204399c = w1e.m204399c("p_letter_sent", getClass().getName());
        this.f151844e = l4g0VarM204399c;
        l4g0VarM204399c.m152781p(new pf60("is_reply", TEnum.equals(loveLetterMessageInfo.state, LoveLetterMessageState.replied) ? "1" : "0"));
        w1e.m204402f(this.f151844e);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m171911y0() {
        CoreModule.f18264c.f20384f0.f20654X1 = C22507a.m222758b();
        duringCreated(CoreModule.f18264c.f20384f0.f20654X1).subscribe(psd0.m173596G(new y20() { // from class: l.jdw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120370a.m171908t0((vg60) obj);
            }
        }));
        CoreModule.f18264c.f20384f0.m33903an("").subscribe(psd0.m173597H(new y20() { // from class: l.kdw
            @Override // p153l.y20
            public final void call(Object obj) {
                pdw.m171898j0((uxj0) obj);
            }
        }, new y20() { // from class: l.ldw
            @Override // p153l.y20
            public final void call(Object obj) {
                pdw.m171900l0((Throwable) obj);
            }
        }));
        l4g0 l4g0VarM204399c = w1e.m204399c("p_love_letter", getClass().getName());
        this.f151844e = l4g0VarM204399c;
        w1e.m204402f(l4g0VarM204399c);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
