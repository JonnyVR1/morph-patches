package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageReference;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.MomentAction;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class bp00 extends ar2<pp00> {

    /* JADX INFO: renamed from: a */
    public String f77716a;

    /* JADX INFO: renamed from: b */
    public String f77717b;

    /* JADX INFO: renamed from: c */
    public v500 f77718c;

    /* JADX INFO: renamed from: d */
    public boolean f77719d;

    /* JADX INFO: renamed from: e */
    public boolean f77720e;

    public bp00(ner nerVar) {
        super(nerVar);
        this.f77719d = true;
        this.f77720e = false;
    }

    /* JADX INFO: renamed from: m0 */
    private void m105772m0() {
        if (ln7.m154967b()) {
            lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.yo00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f200942a.m105779o0((C4470c) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m105773p0(Bundle bundle) {
        ((pp00) this.viewModel).m173159A(this.f77716a, this.f77717b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m105774q0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            if (!this.f77719d) {
                ((pp00) this.viewModel).m173173z();
            }
            this.f77719d = false;
        } else if (c4470c == C4470c.f16269k) {
            if (!this.f77720e) {
                CoreModule.f18264c.f20381e0.f89101P6.put(this.f77716a, ((pp00) this.viewModel).m173171x());
            }
            act().lambda$debugItems$19();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.wo00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189991a.m105773p0((Bundle) obj);
            }
        });
        m105772m0();
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.xo00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195548a.m105774q0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public v500 m105775j0() {
        return this.f77718c;
    }

    /* JADX INFO: renamed from: k0 */
    public String m105776k0() {
        return this.f77717b;
    }

    /* JADX INFO: renamed from: l0 */
    public void m105777l0(String str, String str2, String str3) {
        this.f77716a = str;
        this.f77717b = str2;
        if ("from_state".equals(str3)) {
            this.f77718c = new y500(str);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m105778n0(String str) {
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(str);
        return NullChecker.m82486a(conversationM33859Xe) && TEnum.equals(conversationM33859Xe.status, "default");
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m105779o0(C4470c c4470c) {
        if (c4470c == C4470c.f16271m) {
            ((pp00) this.viewModel).m173170w();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m105780r0(Message message) {
        if (m105775j0() == null || !m105775j0().mo199772i(this, message)) {
            m105784x0(message);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m105781s0(Throwable th) {
        if (m105775j0() == null || !m105775j0().mo199769f(this)) {
            m105783u0(th);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m105782t0() {
        User userById = CoreModule.m30930K().getUserById(this.f77717b);
        if (NullChecker.m82486a(userById)) {
            if (m105775j0() != null) {
                o0b0.m165433i(m105775j0().mo199764a(), userById);
            } else {
                o0b0.m165433i("私信发送失败", userById);
            }
        }
        act().hideInput();
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: u0 */
    public void m105783u0(Throwable th) {
        act().hideInput();
        act().lambda$debugItems$19();
        if (TantanException.Client.TantanForbidden.isIllegalContent(th)) {
            r1j0.m179419f(R$string.f18634L7);
        } else {
            m105785y0(1);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m105784x0(Message message) {
        this.f77720e = true;
        CoreModule.f18264c.f20381e0.f89101P6.put(this.f77716a, "");
        m105785y0(0);
        act().hideInput();
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: y0 */
    public void m105785y0(int i) {
        v500 v500Var = this.f77718c;
        if (v500Var != null) {
            v500Var.mo199768e(i, this.f77717b, act());
        } else {
            CoreModule.f18264c.f20381e0.f89213d7.onNext(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m105786z0(String str) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            if (userM116600p9.isJailed()) {
                act().hideInput();
                act().lambda$debugItems$19();
                m105785y0(2);
                return;
            } else if (userM116600p9.isNameFake()) {
                act().hideInput();
                act().lambda$debugItems$19();
                m105785y0(3);
                return;
            }
        }
        Message messageNew_ = Message.new_();
        messageNew_.value = str;
        v500 v500Var = this.f77718c;
        if (v500Var != null) {
            v500Var.mo199767d(messageNew_);
        } else {
            messageNew_.messageType = MessageType.get("moment_comment");
            messageNew_.moment = this.f77716a;
            MessageReference messageReferenceNew_ = MessageReference.new_();
            messageReferenceNew_.action = MomentAction.get("comment");
            messageReferenceNew_.f21189id = this.f77716a;
            messageReferenceNew_.type = "moment";
            messageNew_.api_only_reference = messageReferenceNew_;
        }
        if (m105775j0() != null) {
            m105775j0().mo199765b();
        }
        if (!m105778n0(this.f77717b)) {
            m105782t0();
            return;
        }
        duringCreated(CoreModule.f18264c.f20384f0.m33626Dn(this.f77717b, messageNew_, null)).subscribe(psd0.m173597H(new y20() { // from class: l.zo00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205266a.m105780r0((Message) obj);
            }
        }, new y20() { // from class: l.ap00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72681a.m105781s0((Throwable) obj);
            }
        }));
        if (ConnectivityReceiver.m82467g()) {
            return;
        }
        act().hideInput();
        act().lambda$debugItems$19();
        m105785y0(1);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
