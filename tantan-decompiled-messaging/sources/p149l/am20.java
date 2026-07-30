package p149l;

import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.cropiwa.NewCropperAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class am20 extends jq2<bm20> {

    /* JADX INFO: renamed from: a */
    public cwf0 f70544a;

    /* JADX INFO: renamed from: l.am20$a */
    public class C15665a extends er2 {
        public C15665a() {
        }

        @Override // p149l.n3m
        public String pageId() {
            return "p_picture_editing_page";
        }
    }

    public am20(mcr mcrVar) {
        super(mcrVar);
        this.f70544a = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m97468j0(C4319c c4319c) {
        if (NullChecker.m81303a(this.f70544a)) {
            if (c4319c == C4319c.f15545f) {
                this.f70544a.m109027c();
                return;
            }
            if (c4319c == C4319c.f15548i) {
                this.f70544a.m109042r();
            } else if (c4319c == C4319c.f15549j) {
                this.f70544a.m109031g();
            } else if (c4319c == C4319c.f15552m) {
                this.f70544a.m109029e();
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m97469f0() {
        if (CoreModule.m29931H().signedIn_()) {
            CoreModule.f17545c.f19639e0.f149479u0.put(Boolean.TRUE);
        } else {
            zvf0.m220399u("e_imagepage_signup_edit_done_button", "p_picture_editing_page", vwb.m200311Y("signup_source", CoreModule.m29931H().getSignUpType()));
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m97470g0(boolean z) {
        ((bm20) this.viewModel).m102570b(z);
    }

    /* JADX INFO: renamed from: h0 */
    public void m97471h0() {
        this.f70544a = new cwf0(new C15665a(), NewCropperAct.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("signup_source", CoreModule.m29931H().getSignUpType());
            this.f70544a.m109039o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m97472i0() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.zl20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203590a.m97468j0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public void m97473k0() {
        if (CoreModule.m29931H().signedIn_()) {
            return;
        }
        zvf0.m220399u("e_imagepage_signup_edit_back_button", "p_picture_editing_page", vwb.m200311Y("signup_source", CoreModule.m29931H().getSignUpType()));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
