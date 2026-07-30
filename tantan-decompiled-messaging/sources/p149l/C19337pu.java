package p149l;

import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.p050ui.account.AccountNewCropperAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.pu */
/* JADX INFO: loaded from: classes9.dex */
public class C19337pu extends jq2<C19577qu> {

    /* JADX INFO: renamed from: a */
    public cwf0 f151236a;

    /* JADX INFO: renamed from: l.pu$a */
    public class a extends er2 {
        public a() {
        }

        @Override // p149l.n3m
        public String pageId() {
            return "p_picture_editing_page";
        }
    }

    public C19337pu(mcr mcrVar) {
        super(mcrVar);
        this.f151236a = null;
    }

    /* JADX INFO: renamed from: f0 */
    public void m171390f0() {
        zvf0.m220399u("e_imagepage_signup_edit_done_button", "p_picture_editing_page", vwb.m200311Y("signup_source", AccountModule.m28131F().getSignUpType()));
    }

    /* JADX INFO: renamed from: g0 */
    public void m171391g0(boolean z) {
        ((C19577qu) this.viewModel).m176492b(z);
    }

    /* JADX INFO: renamed from: h0 */
    public void m171392h0() {
        this.f151236a = new cwf0(new a(), AccountNewCropperAct.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("signup_source", AccountModule.m28131F().getSignUpType());
            this.f151236a.m109039o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m171393i0() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.ou
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145641a.m171394j0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m171394j0(C4319c c4319c) {
        if (NullChecker.m81303a(this.f151236a)) {
            if (c4319c == C4319c.f15545f) {
                this.f151236a.m109027c();
                return;
            }
            if (c4319c == C4319c.f15548i) {
                this.f151236a.m109042r();
            } else if (c4319c == C4319c.f15549j) {
                this.f151236a.m109031g();
            } else if (c4319c == C4319c.f15552m) {
                this.f151236a.m109029e();
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m171395k0() {
        if (AccountModule.m28131F().signedIn_()) {
            return;
        }
        zvf0.m220399u("e_imagepage_signup_edit_back_button", "p_picture_editing_page", vwb.m200311Y("signup_source", AccountModule.m28131F().getSignUpType()));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
