package p153l;

import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.p055ui.account.AccountNewCropperAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ju */
/* JADX INFO: loaded from: classes9.dex */
public class C18040ju extends ar2<C18259ku> {

    /* JADX INFO: renamed from: a */
    public l4g0 f122685a;

    /* JADX INFO: renamed from: l.ju$a */
    public class a extends ur2 {
        public a() {
        }

        @Override // p153l.e6m
        public String pageId() {
            return "p_picture_editing_page";
        }
    }

    public C18040ju(ner nerVar) {
        super(nerVar);
        this.f122685a = null;
    }

    /* JADX INFO: renamed from: f0 */
    public void m146965f0() {
        i4g0.m138523u("e_imagepage_signup_edit_done_button", "p_picture_editing_page", jyb.m147494Y("signup_source", AccountModule.m29130F().getSignUpType()));
    }

    /* JADX INFO: renamed from: g0 */
    public void m146966g0(boolean z) {
        ((C18259ku) this.viewModel).m151412b(z);
    }

    /* JADX INFO: renamed from: h0 */
    public void m146967h0() {
        this.f122685a = new l4g0(new a(), AccountNewCropperAct.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("signup_source", AccountModule.m29130F().getSignUpType());
            this.f122685a.m152780o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m146968i0() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.iu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116885a.m146969j0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m146969j0(C4470c c4470c) {
        if (NullChecker.m82486a(this.f122685a)) {
            if (c4470c == C4470c.f16264f) {
                this.f122685a.m152768c();
                return;
            }
            if (c4470c == C4470c.f16267i) {
                this.f122685a.m152783r();
            } else if (c4470c == C4470c.f16268j) {
                this.f122685a.m152772g();
            } else if (c4470c == C4470c.f16271m) {
                this.f122685a.m152770e();
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m146970k0() {
        if (AccountModule.m29130F().signedIn_()) {
            return;
        }
        i4g0.m138523u("e_imagepage_signup_edit_back_button", "p_picture_editing_page", jyb.m147494Y("signup_source", AccountModule.m29130F().getSignUpType()));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
