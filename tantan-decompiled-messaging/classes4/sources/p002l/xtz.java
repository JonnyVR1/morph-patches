package p002l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.osi0;
import l.roj0;
import l.ura;
import l.y19;
import l.ztz;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xtz extends jq2<ztz> {

    /* JADX INFO: renamed from: a */
    public String f22458a;

    /* JADX INFO: renamed from: b */
    public String f22459b;

    public xtz(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m26117h0(Bundle bundle) {
        String stringExtra = act().getIntent().getStringExtra("USER_ID");
        this.f22459b = stringExtra;
        this.f22458a = CoreModule.c.e0.y7(stringExtra);
        if (ura.e().d().l()) {
            User userPa = CoreModule.c.e0.Pa(this.f22459b);
            if (y19.H() && TextUtils.isEmpty(this.f22458a) && (!NullChecker.a(userPa) || userPa.inactivated || userPa.status.contains(UserStatus.get("RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN")))) {
                this.f22458a = "ta";
            } else if (NullChecker.a(userPa) && TextUtils.isEmpty(this.f22458a)) {
                this.f22458a = userPa.name;
            }
            ((jq2) this).viewModel.A3(this.f22458a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m26118i0(roj0 roj0Var) {
        act().progressDismiss();
        act().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m26119j0(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code != 40399) {
            osi0.g(CoreModule.b.getString(R.string.Y5));
        }
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: a0 */
    public void m26120a0() {
        creates(new e30() { // from class: l.utz
            public final void call(Object obj) {
                this.f20794a.m26117h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public void m26121k0(String str) {
        act().progress(R.string.I2, true);
        duringCreated(CoreModule.c.e0.Ga(this.f22459b, str)).subscribe(mkd0.H(new e30() { // from class: l.vtz
            public final void call(Object obj) {
                this.f21320a.m26118i0((roj0) obj);
            }
        }, new e30() { // from class: l.wtz
            public final void call(Object obj) {
                this.f21976a.m26119j0((Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }
}
