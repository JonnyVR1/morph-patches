package p009l;

import android.content.Intent;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.loveletter.LoveLetterAct;
import com.p000p1.mobile.putong.core.newui.loveletter.LoveLetterEditAct;
import com.p000p1.mobile.putong.core.newui.loveletter.search.LoveLetterSearchAct;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p1.mobile.putong.core.data.LoveLetterMessageInfo;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import l.cwf0;
import l.e30;
import l.hpd0;
import l.j760;
import l.jq2;
import l.lsi0;
import l.mkd0;
import l.roj0;
import l.zvf0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rbw extends jq2<wcw> implements hcw {

    /* JADX INFO: renamed from: a */
    public hpd0 f19722a;

    /* JADX INFO: renamed from: b */
    public final LoveLetterAct f19723b;

    /* JADX INFO: renamed from: c */
    public String f19724c;

    /* JADX INFO: renamed from: d */
    public LoveLetterEntryInfo f19725d;

    /* JADX INFO: renamed from: e */
    public cwf0 f19726e;

    public rbw(LoveLetterAct loveLetterAct) {
        super(loveLetterAct);
        this.f19722a = new hpd0("love_letter_func_dialog_" + CoreModule.H().userId(), Boolean.FALSE);
        this.f19723b = loveLetterAct;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m21472e0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m21477j0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m21479l0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m21481o0(roj0 roj0Var) {
        m21485n0((LoveLetterEntryInfo) CoreModule.c.e0.U1.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m21482p0(Throwable th) {
        this.f19723b.finish();
        lsi0.h(R.string.p4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m21483q0(c cVar) {
        cwf0 cwf0Var;
        if (cVar == c.i) {
            cwf0 cwf0Var2 = this.f19726e;
            if (cwf0Var2 != null) {
                i0e.m16065f(cwf0Var2);
                return;
            }
            return;
        }
        if (cVar != c.j || (cwf0Var = this.f19726e) == null) {
            return;
        }
        i0e.m16064e(cwf0Var);
    }

    @Override // p009l.hcw
    /* JADX INFO: renamed from: F */
    public void mo15580F() {
        zvf0.r("e_search_entrance", "p_love_letter");
        PutongMvpAct putongMvpAct = this.f19723b;
        putongMvpAct.startActivity(LoveLetterSearchAct.m3693Y1(putongMvpAct));
    }

    @Override // p009l.hcw
    /* JADX INFO: renamed from: R */
    public void mo15581R(String str) {
        if (CoreModule.c.e0.Pa(str) == null) {
            return;
        }
        PutongMvpAct putongMvpAct = this.f19723b;
        putongMvpAct.startActivity(LoveLetterEditAct.m3634g2(putongMvpAct, str));
    }

    /* JADX INFO: renamed from: a0 */
    public void m21484a0() {
        super.a0();
        duringCreated(CoreModule.c.e0.da()).subscribe(mkd0.H(new e30() { // from class: l.ibw
            public final void call(Object obj) {
                this.f14474a.m21481o0((roj0) obj);
            }
        }, new e30() { // from class: l.jbw
            public final void call(Object obj) {
                this.f15044a.m21482p0((Throwable) obj);
            }
        }));
        this.f19723b.lifecycle().subscribe(mkd0.G(new e30() { // from class: l.kbw
            public final void call(Object obj) {
                this.f15596a.m21483q0((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public final void m21485n0(LoveLetterEntryInfo loveLetterEntryInfo) {
        if (loveLetterEntryInfo == null) {
            this.f19723b.finish();
            return;
        }
        if (!loveLetterEntryInfo.display) {
            this.f19723b.finish();
            return;
        }
        this.f19725d = loveLetterEntryInfo;
        Intent intent = this.f19723b.getIntent();
        String stringExtra = intent.getStringExtra("extra_msg_id");
        String stringExtra2 = intent.getStringExtra("extra_user_id");
        if (stringExtra2 != null && stringExtra != null) {
            User userPa = CoreModule.c.e0.Pa(stringExtra2);
            if (userPa == null) {
                this.f19723b.finish();
                return;
            }
            LoveLetterMessageInfo loveLetterMessageInfoNew_ = LoveLetterMessageInfo.new_();
            loveLetterMessageInfoNew_.id = stringExtra;
            loveLetterMessageInfoNew_.otherUser = stringExtra2;
            m21490x0(loveLetterMessageInfoNew_, userPa);
            return;
        }
        LoveLetterMessageInfo loveLetterMessageInfo = loveLetterEntryInfo.message;
        if (loveLetterMessageInfo == null || TextUtils.isEmpty(loveLetterMessageInfo.otherUser)) {
            m21491y0();
            return;
        }
        User userPa2 = CoreModule.c.e0.Pa(loveLetterEntryInfo.message.otherUser);
        if (userPa2 == null) {
            this.f19723b.finish();
        } else {
            m21490x0(loveLetterEntryInfo.message, userPa2);
        }
    }

    @Override // p009l.hcw
    public String pageId() {
        return "p_love_letter";
    }

    @Override // p009l.hcw
    /* JADX INFO: renamed from: r */
    public void mo15582r() {
        final String str = this.f19724c;
        if (str != null) {
            CoreModule.c.f0.an(str).subscribe(mkd0.H(new e30() { // from class: l.obw
                public final void call(Object obj) {
                    rbw.m21472e0((roj0) obj);
                }
            }, new e30() { // from class: l.pbw
                public final void call(Object obj) {
                    this.f18462a.m21486r0(str, (Throwable) obj);
                }
            }));
            this.f19724c = null;
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m21486r0(String str, Throwable th) {
        this.f19724c = str;
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m21487s0(User user, String str, Conversation conversation) {
        if (conversation == null) {
            lsi0.y("当前会话已移除，有新消息时会再次展示");
        } else {
            this.f19723b.startActivity(MessagesAct.M2(this.f19723b, ((DbObject) user).id, false, false, -1, str, false));
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m21488t0(q860 q860Var) {
        this.f19724c = q860Var.f19069b.links.next;
        ((wcw) ((jq2) this).viewModel).m24064n(q860Var.f19068a, this.f19725d);
        if (((Boolean) this.f19722a.get()).booleanValue()) {
            return;
        }
        this.f19722a.put(Boolean.TRUE);
        ((wcw) ((jq2) this).viewModel).m24066q();
    }

    /* JADX INFO: renamed from: u0 */
    public void m21489u0(final String str, final User user) {
        zvf0.r("e_view_letter", "p_letter_sent");
        duringCreated(CoreModule.c.f0.Me().uiGet(((DbObject) user).id)).take(1).subscribe(mkd0.G(new e30() { // from class: l.qbw
            public final void call(Object obj) {
                this.f19130a.m21487s0(user, str, (Conversation) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public final void m21490x0(LoveLetterMessageInfo loveLetterMessageInfo, User user) {
        ((wcw) ((jq2) this).viewModel).m24063m(loveLetterMessageInfo.id, user, loveLetterMessageInfo.state);
        cwf0 cwf0VarM16062c = i0e.m16062c("p_letter_sent", getClass().getName());
        this.f19726e = cwf0VarM16062c;
        cwf0VarM16062c.p(new j760[]{new j760("is_reply", TEnum.equals(loveLetterMessageInfo.state, "replied") ? "1" : "0")});
        i0e.m16065f(this.f19726e);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m21491y0() {
        CoreModule.c.f0.X1 = a.b();
        duringCreated(CoreModule.c.f0.X1).subscribe(mkd0.G(new e30() { // from class: l.lbw
            public final void call(Object obj) {
                this.f16061a.m21488t0((q860) obj);
            }
        }));
        CoreModule.c.f0.an("").subscribe(mkd0.H(new e30() { // from class: l.mbw
            public final void call(Object obj) {
                rbw.m21477j0((roj0) obj);
            }
        }, new e30() { // from class: l.nbw
            public final void call(Object obj) {
                rbw.m21479l0((Throwable) obj);
            }
        }));
        cwf0 cwf0VarM16062c = i0e.m16062c("p_love_letter", getClass().getName());
        this.f19726e = cwf0VarM16062c;
        i0e.m16065f(cwf0VarM16062c);
    }

    public void destroy() {
    }
}
