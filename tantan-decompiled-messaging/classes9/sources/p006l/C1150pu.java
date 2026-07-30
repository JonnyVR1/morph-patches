package p006l;

import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.p002ui.account.AccountNewCropperAct;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.e30;
import l.er2;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.vwb;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.pu */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1150pu extends jq2<C1190qu> {

    /* JADX INFO: renamed from: a */
    public cwf0 f19334a;

    /* JADX INFO: renamed from: l.pu$a */
    public class a extends er2 {
        public a() {
        }

        public String pageId() {
            return "p_picture_editing_page";
        }
    }

    public C1150pu(mcr mcrVar) {
        super(mcrVar);
        this.f19334a = null;
    }

    /* JADX INFO: renamed from: f0 */
    public void m21708f0() {
        zvf0.u("e_imagepage_signup_edit_done_button", "p_picture_editing_page", new j760[]{vwb.Y("signup_source", AccountModule.m26F().getSignUpType())});
    }

    /* JADX INFO: renamed from: g0 */
    public void m21709g0(boolean z) {
        ((C1190qu) ((jq2) this).viewModel).m22380b(z);
    }

    /* JADX INFO: renamed from: h0 */
    public void m21710h0() {
        this.f19334a = new cwf0(new a(), AccountNewCropperAct.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("signup_source", AccountModule.m26F().getSignUpType());
            this.f19334a.o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m21711i0() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.ou
            public final void call(Object obj) {
                this.f18374a.m21712j0((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m21712j0(c cVar) {
        if (NullChecker.a(this.f19334a)) {
            if (cVar == c.f) {
                this.f19334a.c();
                return;
            }
            if (cVar == c.i) {
                this.f19334a.r();
            } else if (cVar == c.j) {
                this.f19334a.g();
            } else if (cVar == c.m) {
                this.f19334a.e();
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m21713k0() {
        if (AccountModule.m26F().signedIn_()) {
            return;
        }
        zvf0.u("e_imagepage_signup_edit_back_button", "p_picture_editing_page", new j760[]{vwb.Y("signup_source", AccountModule.m26F().getSignUpType())});
    }

    public void destroy() {
    }
}
