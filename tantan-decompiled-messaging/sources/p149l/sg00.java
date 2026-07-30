package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageReference;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.MomentAction;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class sg00 extends jq2<gh00> {

    /* JADX INFO: renamed from: a */
    public String f164356a;

    /* JADX INFO: renamed from: b */
    public String f164357b;

    /* JADX INFO: renamed from: c */
    public ywz f164358c;

    /* JADX INFO: renamed from: d */
    public boolean f164359d;

    /* JADX INFO: renamed from: e */
    public boolean f164360e;

    public sg00(mcr mcrVar) {
        super(mcrVar);
        this.f164359d = true;
        this.f164360e = false;
    }

    /* JADX INFO: renamed from: m0 */
    private void m184017m0() {
        if (hm7.m131700b()) {
            lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.pg00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f148605a.m184024o0((C4319c) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m184018p0(Bundle bundle) {
        ((gh00) this.viewModel).m126120A(this.f164356a, this.f164357b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m184019q0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            if (!this.f164359d) {
                ((gh00) this.viewModel).m126134z();
            }
            this.f164359d = false;
        } else if (c4319c == C4319c.f15550k) {
            if (!this.f164360e) {
                CoreModule.f17545c.f19639e0.f149244P6.put(this.f164356a, ((gh00) this.viewModel).m126132x());
            }
            act().lambda$debugItems$19();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.ng00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138831a.m184018p0((Bundle) obj);
            }
        });
        m184017m0();
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.og00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143796a.m184019q0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public ywz m184020j0() {
        return this.f164358c;
    }

    /* JADX INFO: renamed from: k0 */
    public String m184021k0() {
        return this.f164357b;
    }

    /* JADX INFO: renamed from: l0 */
    public void m184022l0(String str, String str2, String str3) {
        this.f164356a = str;
        this.f164357b = str2;
        if ("from_state".equals(str3)) {
            this.f164358c = new bxz(str);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m184023n0(String str) {
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(str);
        return NullChecker.m81303a(conversationM32856Xe) && TEnum.equals(conversationM32856Xe.status, "default");
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m184024o0(C4319c c4319c) {
        if (c4319c == C4319c.f15552m) {
            ((gh00) this.viewModel).m126131w();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m184025r0(Message message) {
        if (m184020j0() == null || !m184020j0().mo104395i(this, message)) {
            m184029x0(message);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m184026s0(Throwable th) {
        if (m184020j0() == null || !m184020j0().mo104392f(this)) {
            m184028u0(th);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m184027t0() {
        User userById = CoreModule.m29932K().getUserById(this.f164357b);
        if (NullChecker.m81303a(userById)) {
            if (m184020j0() != null) {
                ksa0.m147045i(m184020j0().mo104387a(), userById);
            } else {
                ksa0.m147045i("私信发送失败", userById);
            }
        }
        act().hideInput();
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: u0 */
    public void m184028u0(Throwable th) {
        act().hideInput();
        act().lambda$debugItems$19();
        if (TantanException.Client.TantanForbidden.isIllegalContent(th)) {
            osi0.m165782f(R$string.f17844J7);
        } else {
            m184030y0(1);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m184029x0(Message message) {
        this.f164360e = true;
        CoreModule.f17545c.f19639e0.f149244P6.put(this.f164356a, "");
        m184030y0(0);
        act().hideInput();
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: y0 */
    public void m184030y0(int i) {
        ywz ywzVar = this.f164358c;
        if (ywzVar != null) {
            ywzVar.mo104391e(i, this.f164357b, act());
        } else {
            CoreModule.f17545c.f19639e0.f149356d7.onNext(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m184031z0(String str) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            if (userM169527p9.isJailed()) {
                act().hideInput();
                act().lambda$debugItems$19();
                m184030y0(2);
                return;
            } else if (userM169527p9.isNameFake()) {
                act().hideInput();
                act().lambda$debugItems$19();
                m184030y0(3);
                return;
            }
        }
        Message messageNew_ = Message.new_();
        messageNew_.value = str;
        ywz ywzVar = this.f164358c;
        if (ywzVar != null) {
            ywzVar.mo104390d(messageNew_);
        } else {
            messageNew_.messageType = MessageType.get("moment_comment");
            messageNew_.moment = this.f164356a;
            MessageReference messageReferenceNew_ = MessageReference.new_();
            messageReferenceNew_.action = MomentAction.get("comment");
            messageReferenceNew_.f20447id = this.f164356a;
            messageReferenceNew_.type = "moment";
            messageNew_.api_only_reference = messageReferenceNew_;
        }
        if (m184020j0() != null) {
            m184020j0().mo104388b();
        }
        if (!m184023n0(this.f164357b)) {
            m184027t0();
            return;
        }
        duringCreated(CoreModule.f17545c.f19642f0.m32623Dn(this.f164357b, messageNew_, null)).subscribe(mkd0.m154956H(new e30() { // from class: l.qg00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154303a.m184025r0((Message) obj);
            }
        }, new e30() { // from class: l.rg00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159220a.m184026s0((Throwable) obj);
            }
        }));
        if (ConnectivityReceiver.m81284g()) {
            return;
        }
        act().hideInput();
        act().lambda$debugItems$19();
        m184030y0(1);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
