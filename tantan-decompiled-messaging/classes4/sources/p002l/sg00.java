package p002l;

import android.os.Bundle;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageReference;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.MomentAction;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.hm7;
import l.jq2;
import l.ksa0;
import l.mcr;
import l.mkd0;
import l.osi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class sg00 extends jq2<gh00> {

    /* JADX INFO: renamed from: a */
    public String f19004a;

    /* JADX INFO: renamed from: b */
    public String f19005b;

    /* JADX INFO: renamed from: c */
    public ywz f19006c;

    /* JADX INFO: renamed from: d */
    public boolean f19007d;

    /* JADX INFO: renamed from: e */
    public boolean f19008e;

    public sg00(mcr mcrVar) {
        super(mcrVar);
        this.f19007d = true;
        this.f19008e = false;
    }

    /* JADX INFO: renamed from: m0 */
    private void m22434m0() {
        if (hm7.b()) {
            lifecycle().subscribe(mkd0.G(new e30() { // from class: l.pg00
                public final void call(Object obj) {
                    this.f17259a.m22443o0((c) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m22435p0(Bundle bundle) {
        ((gh00) ((jq2) this).viewModel).m13797A(this.f19004a, this.f19005b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m22436q0(c cVar) {
        if (cVar == c.i) {
            if (!this.f19007d) {
                ((gh00) ((jq2) this).viewModel).m13813z();
            }
            this.f19007d = false;
        } else if (cVar == c.k) {
            if (!this.f19008e) {
                CoreModule.c.e0.P6.put(this.f19004a, ((gh00) ((jq2) this).viewModel).m13811x());
            }
            act().finish();
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m22437Z() {
        super.Z();
    }

    /* JADX INFO: renamed from: a0 */
    public void m22438a0() {
        super.a0();
        creates(new e30() { // from class: l.ng00
            public final void call(Object obj) {
                this.f16014a.m22435p0((Bundle) obj);
            }
        });
        m22434m0();
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.og00
            public final void call(Object obj) {
                this.f16560a.m22436q0((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public ywz m22439j0() {
        return this.f19006c;
    }

    /* JADX INFO: renamed from: k0 */
    public String m22440k0() {
        return this.f19005b;
    }

    /* JADX INFO: renamed from: l0 */
    public void m22441l0(String str, String str2, String str3) {
        this.f19004a = str;
        this.f19005b = str2;
        if ("from_state".equals(str3)) {
            this.f19006c = new bxz(str);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m22442n0(String str) {
        Conversation conversationXe = CoreModule.c.f0.Xe(str);
        return NullChecker.a(conversationXe) && TEnum.equals(conversationXe.status, "default");
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m22443o0(c cVar) {
        if (cVar == c.m) {
            ((gh00) ((jq2) this).viewModel).m13810w();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m22444r0(Message message) {
        if (m22439j0() == null || !m22439j0().mo10652i(this, message)) {
            m22448x0(message);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m22445s0(Throwable th) {
        if (m22439j0() == null || !m22439j0().mo10649f(this)) {
            m22447u0(th);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m22446t0() {
        User userById = CoreModule.K().getUserById(this.f19005b);
        if (NullChecker.a(userById)) {
            if (m22439j0() != null) {
                ksa0.i(m22439j0().mo10644a(), userById);
            } else {
                ksa0.i("私信发送失败", userById);
            }
        }
        act().hideInput();
        act().finish();
    }

    /* JADX INFO: renamed from: u0 */
    public void m22447u0(Throwable th) {
        act().hideInput();
        act().finish();
        if (TantanException.Client.TantanForbidden.isIllegalContent(th)) {
            osi0.f(R.string.J7);
        } else {
            m22449y0(1);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m22448x0(Message message) {
        this.f19008e = true;
        CoreModule.c.e0.P6.put(this.f19004a, "");
        m22449y0(0);
        act().hideInput();
        act().finish();
    }

    /* JADX INFO: renamed from: y0 */
    public void m22449y0(int i) {
        ywz ywzVar = this.f19006c;
        if (ywzVar != null) {
            ywzVar.mo10648e(i, this.f19005b, act());
        } else {
            CoreModule.c.e0.d7.onNext(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m22450z0(String str) {
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9)) {
            if (userP9.isJailed()) {
                act().hideInput();
                act().finish();
                m22449y0(2);
                return;
            } else if (userP9.isNameFake()) {
                act().hideInput();
                act().finish();
                m22449y0(3);
                return;
            }
        }
        Message messageNew_ = Message.new_();
        messageNew_.value = str;
        ywz ywzVar = this.f19006c;
        if (ywzVar != null) {
            ywzVar.mo10647d(messageNew_);
        } else {
            messageNew_.messageType = MessageType.get("moment_comment");
            messageNew_.moment = this.f19004a;
            MessageReference messageReferenceNew_ = MessageReference.new_();
            messageReferenceNew_.action = MomentAction.get("comment");
            messageReferenceNew_.id = this.f19004a;
            messageReferenceNew_.type = "moment";
            messageNew_.api_only_reference = messageReferenceNew_;
        }
        if (m22439j0() != null) {
            m22439j0().mo10645b();
        }
        if (!m22442n0(this.f19005b)) {
            m22446t0();
            return;
        }
        duringCreated(CoreModule.c.f0.Dn(this.f19005b, messageNew_, (Sticker) null)).subscribe(mkd0.H(new e30() { // from class: l.qg00
            public final void call(Object obj) {
                this.f17974a.m22444r0((Message) obj);
            }
        }, new e30() { // from class: l.rg00
            public final void call(Object obj) {
                this.f18501a.m22445s0((Throwable) obj);
            }
        }));
        if (ConnectivityReceiver.g()) {
            return;
        }
        act().hideInput();
        act().finish();
        m22449y0(1);
    }

    public void destroy() {
    }
}
