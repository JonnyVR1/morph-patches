package p149l;

import android.graphics.Color;
import android.os.SystemClock;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageReference;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class bxz implements ywz {

    /* JADX INFO: renamed from: a */
    public String f77845a;

    /* JADX INFO: renamed from: b */
    public long f77846b;

    public bxz(String str) {
        this.f77845a = str;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m104385j(gh00 gh00Var, Throwable th) {
        if (TantanException.Client.TantanForbidden.isIllegalContent(th)) {
            return;
        }
        gh00Var.f102606p.m184027t0();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m104386k(Throwable th) {
    }

    @Override // p149l.ywz
    /* JADX INFO: renamed from: a */
    public String mo104387a() {
        return "对方账号异常";
    }

    @Override // p149l.ywz
    /* JADX INFO: renamed from: b */
    public boolean mo104388b() {
        return false;
    }

    @Override // p149l.ywz
    /* JADX INFO: renamed from: c */
    public void mo104389c(final gh00 gh00Var) {
        gh00Var.f102601k.setBackgroundResource(0);
        gh00Var.f102591a.setBackgroundColor(Color.parseColor("#1C000000"));
        gh00Var.act().setStatusBarColor(Color.parseColor("#1C000000"));
        xdl0.m208358V(gh00Var.f102601k, 0);
        xdl0.m208359W(gh00Var.f102601k, 0);
        gh00Var.f102603m.setHint("发消息");
        gh00Var.f102603m.setTextSize(14.0f);
        xdl0.m208344M(gh00Var.f102594d, false);
        xdl0.m208344M(gh00Var.f102593c, false);
        xdl0.m208344M(gh00Var.f102602l, false);
        gh00Var.f102605o.duringCreated(CoreModule.f17545c.f19642f0.f19907W).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.zwz
            @Override // p149l.e30
            public final void call(Object obj) {
                bxz.m104385j(gh00Var, (Throwable) obj);
            }
        }, new e30() { // from class: l.axz
            @Override // p149l.e30
            public final void call(Object obj) {
                bxz.m104386k((Throwable) obj);
            }
        }));
    }

    @Override // p149l.ywz
    /* JADX INFO: renamed from: d */
    public void mo104390d(Message message) {
        message.messageType = MessageType.get(MessageType.state_comment);
        MessageReference messageReferenceNew_ = MessageReference.new_();
        messageReferenceNew_.type = "state";
        messageReferenceNew_.f20447id = this.f77845a;
        message.api_only_reference = messageReferenceNew_;
    }

    @Override // p149l.ywz
    /* JADX INFO: renamed from: e */
    public void mo104391e(int i, String str, Act act) {
        User userById = CoreModule.m29932K().getUserById(str);
        if (i == 0) {
            if (NullChecker.m81303a(userById)) {
                ksa0.m147044h(R$string.f17734Fh, userById);
                return;
            }
            return;
        }
        if (i == 1) {
            if (NullChecker.m81303a(userById)) {
                ksa0.m147044h(R$string.f19096yh, userById);
            }
        } else {
            if (i == 2) {
                CoreModule.m29932K().startJailedDialogLikeAct();
                return;
            }
            if (i == 3) {
                ark.m98449T0(act);
            } else if (i == 4 && NullChecker.m81303a(userById)) {
                ksa0.m147044h(R$string.f18185Ui, userById);
            }
        }
    }

    @Override // p149l.ywz
    /* JADX INFO: renamed from: f */
    public boolean mo104392f(sg00 sg00Var) {
        if (sg00Var.m184023n0(sg00Var.m184021k0())) {
            return false;
        }
        sg00Var.m184027t0();
        return true;
    }

    @Override // p149l.ywz
    /* JADX INFO: renamed from: g */
    public void mo104393g(String str, gh00 gh00Var) {
        xdl0.m208344M(gh00Var.f102594d, false);
        xdl0.m208344M(gh00Var.f102593c, false);
        gh00Var.f102603m.setHint("发消息");
    }

    @Override // p149l.ywz
    /* JADX INFO: renamed from: h */
    public void mo104394h(String str) {
        this.f77846b = SystemClock.elapsedRealtime();
    }

    @Override // p149l.ywz
    /* JADX INFO: renamed from: i */
    public boolean mo104395i(sg00 sg00Var, Message message) {
        message.fromConvType = "match_state";
        pxz.m171970g(message, "p_other_state", "", sg00Var.m184021k0(), 0, SystemClock.elapsedRealtime() - this.f77846b);
        return false;
    }
}
