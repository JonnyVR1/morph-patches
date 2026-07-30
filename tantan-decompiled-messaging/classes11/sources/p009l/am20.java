package p009l;

import com.p000p1.mobile.putong.core.newui.cropiwa.NewCropperAct;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class am20 extends jq2<bm20> {

    /* JADX INFO: renamed from: a */
    public cwf0 f9572a;

    /* JADX INFO: renamed from: l.am20$a */
    public class C0766a extends er2 {
        public C0766a() {
        }

        public String pageId() {
            return "p_picture_editing_page";
        }
    }

    public am20(mcr mcrVar) {
        super(mcrVar);
        this.f9572a = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m11516j0(c cVar) {
        if (NullChecker.a(this.f9572a)) {
            if (cVar == c.f) {
                this.f9572a.c();
                return;
            }
            if (cVar == c.i) {
                this.f9572a.r();
            } else if (cVar == c.j) {
                this.f9572a.g();
            } else if (cVar == c.m) {
                this.f9572a.e();
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m11517f0() {
        if (CoreModule.H().signedIn_()) {
            CoreModule.c.e0.u0.put(Boolean.TRUE);
        } else {
            zvf0.u("e_imagepage_signup_edit_done_button", "p_picture_editing_page", new j760[]{vwb.Y("signup_source", CoreModule.H().getSignUpType())});
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m11518g0(boolean z) {
        ((bm20) ((jq2) this).viewModel).m12106b(z);
    }

    /* JADX INFO: renamed from: h0 */
    public void m11519h0() {
        this.f9572a = new cwf0(new C0766a(), NewCropperAct.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("signup_source", CoreModule.H().getSignUpType());
            this.f9572a.o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m11520i0() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.zl20
            public final void call(Object obj) {
                this.f23728a.m11516j0((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public void m11521k0() {
        if (CoreModule.H().signedIn_()) {
            return;
        }
        zvf0.u("e_imagepage_signup_edit_back_button", "p_picture_editing_page", new j760[]{vwb.Y("signup_source", CoreModule.H().getSignUpType())});
    }

    public void destroy() {
    }
}
