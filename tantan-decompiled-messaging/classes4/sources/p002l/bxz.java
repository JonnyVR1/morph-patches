package p002l;

import android.graphics.Color;
import android.os.SystemClock;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageReference;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.ark;
import l.e30;
import l.ksa0;
import l.mkd0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bxz implements ywz {

    /* JADX INFO: renamed from: a */
    public String f8404a;

    /* JADX INFO: renamed from: b */
    public long f8405b;

    public bxz(String str) {
        this.f8404a = str;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m10642j(gh00 gh00Var, Throwable th) {
        if (TantanException.Client.TantanForbidden.isIllegalContent(th)) {
            return;
        }
        gh00Var.f11427p.m22446t0();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m10643k(Throwable th) {
    }

    @Override // p002l.ywz
    /* JADX INFO: renamed from: a */
    public String mo10644a() {
        return "对方账号异常";
    }

    @Override // p002l.ywz
    /* JADX INFO: renamed from: b */
    public boolean mo10645b() {
        return false;
    }

    @Override // p002l.ywz
    /* JADX INFO: renamed from: c */
    public void mo10646c(final gh00 gh00Var) {
        gh00Var.f11422k.setBackgroundResource(0);
        gh00Var.f11412a.setBackgroundColor(Color.parseColor("#1C000000"));
        gh00Var.act().setStatusBarColor(Color.parseColor("#1C000000"));
        xdl0.V(gh00Var.f11422k, 0);
        xdl0.W(gh00Var.f11422k, 0);
        gh00Var.f11424m.setHint("发消息");
        gh00Var.f11424m.setTextSize(14.0f);
        xdl0.M(gh00Var.f11415d, false);
        xdl0.M(gh00Var.f11414c, false);
        xdl0.M(gh00Var.f11423l, false);
        gh00Var.f11426o.duringCreated(CoreModule.c.f0.W).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.zwz
            public final void call(Object obj) {
                bxz.m10642j(gh00Var, (Throwable) obj);
            }
        }, new e30() { // from class: l.axz
            public final void call(Object obj) {
                bxz.m10643k((Throwable) obj);
            }
        }));
    }

    @Override // p002l.ywz
    /* JADX INFO: renamed from: d */
    public void mo10647d(Message message) {
        message.messageType = MessageType.get("state_comment");
        MessageReference messageReferenceNew_ = MessageReference.new_();
        messageReferenceNew_.type = "state";
        messageReferenceNew_.id = this.f8404a;
        message.api_only_reference = messageReferenceNew_;
    }

    @Override // p002l.ywz
    /* JADX INFO: renamed from: e */
    public void mo10648e(int i, String str, Act act) {
        User userById = CoreModule.K().getUserById(str);
        if (i == 0) {
            if (NullChecker.a(userById)) {
                ksa0.h(R.string.Fh, userById);
                return;
            }
            return;
        }
        if (i == 1) {
            if (NullChecker.a(userById)) {
                ksa0.h(R.string.yh, userById);
            }
        } else {
            if (i == 2) {
                CoreModule.K().startJailedDialogLikeAct();
                return;
            }
            if (i == 3) {
                ark.T0(act);
            } else if (i == 4 && NullChecker.a(userById)) {
                ksa0.h(R.string.Ui, userById);
            }
        }
    }

    @Override // p002l.ywz
    /* JADX INFO: renamed from: f */
    public boolean mo10649f(sg00 sg00Var) {
        if (sg00Var.m22442n0(sg00Var.m22440k0())) {
            return false;
        }
        sg00Var.m22446t0();
        return true;
    }

    @Override // p002l.ywz
    /* JADX INFO: renamed from: g */
    public void mo10650g(String str, gh00 gh00Var) {
        xdl0.M(gh00Var.f11415d, false);
        xdl0.M(gh00Var.f11414c, false);
        gh00Var.f11424m.setHint("发消息");
    }

    @Override // p002l.ywz
    /* JADX INFO: renamed from: h */
    public void mo10651h(String str) {
        this.f8405b = SystemClock.elapsedRealtime();
    }

    @Override // p002l.ywz
    /* JADX INFO: renamed from: i */
    public boolean mo10652i(sg00 sg00Var, Message message) {
        message.fromConvType = "match_state";
        pxz.m20759g(message, "p_other_state", "", sg00Var.m22440k0(), 0, SystemClock.elapsedRealtime() - this.f8405b);
        return false;
    }
}
