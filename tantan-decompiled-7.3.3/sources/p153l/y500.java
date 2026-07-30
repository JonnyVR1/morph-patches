package p153l;

import android.graphics.Color;
import android.os.SystemClock;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageReference;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class y500 implements v500 {

    /* JADX INFO: renamed from: a */
    public String f197524a;

    /* JADX INFO: renamed from: b */
    public long f197525b;

    public y500(String str) {
        this.f197524a = str;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m214286j(pp00 pp00Var, Throwable th) {
        if (TantanException.Client.TantanForbidden.isIllegalContent(th)) {
            return;
        }
        pp00Var.f153460p.m105782t0();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m214287k(Throwable th) {
    }

    @Override // p153l.v500
    /* JADX INFO: renamed from: a */
    public String mo199764a() {
        return "对方账号异常";
    }

    @Override // p153l.v500
    /* JADX INFO: renamed from: b */
    public boolean mo199765b() {
        return false;
    }

    @Override // p153l.v500
    /* JADX INFO: renamed from: c */
    public void mo199766c(final pp00 pp00Var) {
        pp00Var.f153455k.setBackgroundResource(0);
        pp00Var.f153445a.setBackgroundColor(Color.parseColor("#1C000000"));
        pp00Var.act().setStatusBarColor(Color.parseColor("#1C000000"));
        bnl0.m105538V(pp00Var.f153455k, 0);
        bnl0.m105539W(pp00Var.f153455k, 0);
        pp00Var.f153457m.setHint("发消息");
        pp00Var.f153457m.setTextSize(14.0f);
        bnl0.m105524M(pp00Var.f153448d, false);
        bnl0.m105524M(pp00Var.f153447c, false);
        bnl0.m105524M(pp00Var.f153456l, false);
        pp00Var.f153459o.duringCreated(CoreModule.f18264c.f20384f0.f20649W).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.w500
            @Override // p153l.y20
            public final void call(Object obj) {
                y500.m214286j(pp00Var, (Throwable) obj);
            }
        }, new y20() { // from class: l.x500
            @Override // p153l.y20
            public final void call(Object obj) {
                y500.m214287k((Throwable) obj);
            }
        }));
    }

    @Override // p153l.v500
    /* JADX INFO: renamed from: d */
    public void mo199767d(Message message) {
        message.messageType = MessageType.get(MessageType.state_comment);
        MessageReference messageReferenceNew_ = MessageReference.new_();
        messageReferenceNew_.type = "state";
        messageReferenceNew_.f21189id = this.f197524a;
        message.api_only_reference = messageReferenceNew_;
    }

    @Override // p153l.v500
    /* JADX INFO: renamed from: e */
    public void mo199768e(int i, String str, Act act) {
        User userById = CoreModule.m30930K().getUserById(str);
        if (i == 0) {
            if (NullChecker.m82486a(userById)) {
                o0b0.m165432h(R$string.f19095ai, userById);
                return;
            }
            return;
        }
        if (i == 1) {
            if (NullChecker.m82486a(userById)) {
                o0b0.m165432h(R$string.f18884Th, userById);
            }
        } else {
            if (i == 2) {
                CoreModule.m30930K().startJailedDialogLikeAct();
                return;
            }
            if (i == 3) {
                qtk.m177999T0(act);
            } else if (i == 4 && NullChecker.m82486a(userById)) {
                o0b0.m165432h(R$string.f19589qj, userById);
            }
        }
    }

    @Override // p153l.v500
    /* JADX INFO: renamed from: f */
    public boolean mo199769f(bp00 bp00Var) {
        if (bp00Var.m105778n0(bp00Var.m105776k0())) {
            return false;
        }
        bp00Var.m105782t0();
        return true;
    }

    @Override // p153l.v500
    /* JADX INFO: renamed from: g */
    public void mo199770g(String str, pp00 pp00Var) {
        bnl0.m105524M(pp00Var.f153448d, false);
        bnl0.m105524M(pp00Var.f153447c, false);
        pp00Var.f153457m.setHint("发消息");
    }

    @Override // p153l.v500
    /* JADX INFO: renamed from: h */
    public void mo199771h(String str) {
        this.f197525b = SystemClock.elapsedRealtime();
    }

    @Override // p153l.v500
    /* JADX INFO: renamed from: i */
    public boolean mo199772i(bp00 bp00Var, Message message) {
        message.fromConvType = "match_state";
        m600.m157134g(message, "p_other_state", "", bp00Var.m105776k0(), 0, SystemClock.elapsedRealtime() - this.f197525b);
        return false;
    }
}
