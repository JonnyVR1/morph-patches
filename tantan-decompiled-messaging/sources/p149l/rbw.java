package p149l;

import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p046p1.mobile.putong.core.data.LoveLetterMessageInfo;
import com.p046p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p046p1.mobile.putong.core.newui.loveletter.LoveLetterAct;
import com.p046p1.mobile.putong.core.newui.loveletter.LoveLetterEditAct;
import com.p046p1.mobile.putong.core.newui.loveletter.search.LoveLetterSearchAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
public class rbw extends jq2<wcw> implements hcw {

    /* JADX INFO: renamed from: a */
    public hpd0 f158686a;

    /* JADX INFO: renamed from: b */
    public final LoveLetterAct f158687b;

    /* JADX INFO: renamed from: c */
    public String f158688c;

    /* JADX INFO: renamed from: d */
    public LoveLetterEntryInfo f158689d;

    /* JADX INFO: renamed from: e */
    public cwf0 f158690e;

    public rbw(LoveLetterAct loveLetterAct) {
        super(loveLetterAct);
        this.f158686a = new hpd0("love_letter_func_dialog_" + CoreModule.m29931H().userId(), Boolean.FALSE);
        this.f158687b = loveLetterAct;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m178703e0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m178708j0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m178710l0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m178712o0(roj0 roj0Var) {
        m178715n0(CoreModule.f17545c.f19639e0.f149279U1.m221515e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m178713p0(Throwable th) {
        this.f158687b.lambda$debugItems$19();
        lsi0.m151578h(R$string.f18813p4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m178714q0(C4319c c4319c) {
        cwf0 cwf0Var;
        if (c4319c == C4319c.f15548i) {
            cwf0 cwf0Var2 = this.f158690e;
            if (cwf0Var2 != null) {
                i0e.m133797f(cwf0Var2);
                return;
            }
            return;
        }
        if (c4319c != C4319c.f15549j || (cwf0Var = this.f158690e) == null) {
            return;
        }
        i0e.m133796e(cwf0Var);
    }

    @Override // p149l.hcw
    /* JADX INFO: renamed from: F */
    public void mo130520F() {
        zvf0.m220396r("e_search_entrance", "p_love_letter");
        LoveLetterAct loveLetterAct = this.f158687b;
        loveLetterAct.startActivity(LoveLetterSearchAct.m39619Y1(loveLetterAct));
    }

    @Override // p149l.hcw
    /* JADX INFO: renamed from: R */
    public void mo130521R(String str) {
        if (CoreModule.f17545c.f19639e0.m169430Pa(str) == null) {
            return;
        }
        LoveLetterAct loveLetterAct = this.f158687b;
        loveLetterAct.startActivity(LoveLetterEditAct.m39563g2(loveLetterAct, str));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        duringCreated(CoreModule.f17545c.f19639e0.m169481da()).subscribe(mkd0.m154956H(new e30() { // from class: l.ibw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112389a.m178712o0((roj0) obj);
            }
        }, new e30() { // from class: l.jbw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117221a.m178713p0((Throwable) obj);
            }
        }));
        this.f158687b.lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.kbw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122270a.m178714q0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public final void m178715n0(LoveLetterEntryInfo loveLetterEntryInfo) {
        if (loveLetterEntryInfo == null) {
            this.f158687b.lambda$debugItems$19();
            return;
        }
        if (!loveLetterEntryInfo.display) {
            this.f158687b.lambda$debugItems$19();
            return;
        }
        this.f158689d = loveLetterEntryInfo;
        Intent intent = this.f158687b.getIntent();
        String stringExtra = intent.getStringExtra("extra_msg_id");
        String stringExtra2 = intent.getStringExtra("extra_user_id");
        if (stringExtra2 != null && stringExtra != null) {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(stringExtra2);
            if (userM169430Pa == null) {
                this.f158687b.lambda$debugItems$19();
                return;
            }
            LoveLetterMessageInfo loveLetterMessageInfoNew_ = LoveLetterMessageInfo.new_();
            loveLetterMessageInfoNew_.f20437id = stringExtra;
            loveLetterMessageInfoNew_.otherUser = stringExtra2;
            m178720x0(loveLetterMessageInfoNew_, userM169430Pa);
            return;
        }
        LoveLetterMessageInfo loveLetterMessageInfo = loveLetterEntryInfo.message;
        if (loveLetterMessageInfo == null || TextUtils.isEmpty(loveLetterMessageInfo.otherUser)) {
            m178721y0();
            return;
        }
        User userM169430Pa2 = CoreModule.f17545c.f19639e0.m169430Pa(loveLetterEntryInfo.message.otherUser);
        if (userM169430Pa2 == null) {
            this.f158687b.lambda$debugItems$19();
        } else {
            m178720x0(loveLetterEntryInfo.message, userM169430Pa2);
        }
    }

    @Override // p149l.hcw
    public String pageId() {
        return "p_love_letter";
    }

    @Override // p149l.hcw
    /* JADX INFO: renamed from: r */
    public void mo130522r() {
        final String str = this.f158688c;
        if (str != null) {
            CoreModule.f17545c.f19642f0.m32900an(str).subscribe(mkd0.m154956H(new e30() { // from class: l.obw
                @Override // p149l.e30
                public final void call(Object obj) {
                    rbw.m178703e0((roj0) obj);
                }
            }, new e30() { // from class: l.pbw
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f148119a.m178716r0(str, (Throwable) obj);
                }
            }));
            this.f158688c = null;
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m178716r0(String str, Throwable th) {
        this.f158688c = str;
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m178717s0(User user, String str, Conversation conversation) {
        if (conversation == null) {
            lsi0.m151595y("当前会话已移除，有新消息时会再次展示");
        } else {
            this.f158687b.startActivity(MessagesAct.m48932M2(this.f158687b, user.f56011id, false, false, -1, str, false));
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m178718t0(q860 q860Var) {
        this.f158688c = q860Var.f153136b.links.next;
        ((wcw) this.viewModel).m202691n(q860Var.f153135a, this.f158689d);
        if (this.f158686a.get().booleanValue()) {
            return;
        }
        this.f158686a.put(Boolean.TRUE);
        ((wcw) this.viewModel).m202693q();
    }

    /* JADX INFO: renamed from: u0 */
    public void m178719u0(final String str, final User user) {
        zvf0.m220396r("e_view_letter", "p_letter_sent");
        duringCreated(CoreModule.f17545c.f19642f0.m32725Me().uiGet(user.f56011id)).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.qbw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153709a.m178717s0(user, str, (Conversation) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public final void m178720x0(LoveLetterMessageInfo loveLetterMessageInfo, User user) {
        ((wcw) this.viewModel).m202690m(loveLetterMessageInfo.f20437id, user, loveLetterMessageInfo.state);
        cwf0 cwf0VarM133794c = i0e.m133794c("p_letter_sent", getClass().getName());
        this.f158690e = cwf0VarM133794c;
        cwf0VarM133794c.m109040p(new j760("is_reply", TEnum.equals(loveLetterMessageInfo.state, LoveLetterMessageState.replied) ? "1" : "0"));
        i0e.m133797f(this.f158690e);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m178721y0() {
        CoreModule.f17545c.f19642f0.f19912X1 = C22392a.m221512b();
        duringCreated(CoreModule.f17545c.f19642f0.f19912X1).subscribe(mkd0.m154955G(new e30() { // from class: l.lbw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127348a.m178718t0((q860) obj);
            }
        }));
        CoreModule.f17545c.f19642f0.m32900an("").subscribe(mkd0.m154956H(new e30() { // from class: l.mbw
            @Override // p149l.e30
            public final void call(Object obj) {
                rbw.m178708j0((roj0) obj);
            }
        }, new e30() { // from class: l.nbw
            @Override // p149l.e30
            public final void call(Object obj) {
                rbw.m178710l0((Throwable) obj);
            }
        }));
        cwf0 cwf0VarM133794c = i0e.m133794c("p_love_letter", getClass().getName());
        this.f158690e = cwf0VarM133794c;
        i0e.m133797f(cwf0VarM133794c);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
