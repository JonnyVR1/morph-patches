package p153l;

import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.cropiwa.NewCropperAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ku20 extends ar2<lu20> {

    /* JADX INFO: renamed from: a */
    public l4g0 f128800a;

    /* JADX INFO: renamed from: l.ku20$a */
    public class C18262a extends ur2 {
        public C18262a() {
        }

        @Override // p153l.e6m
        public String pageId() {
            return "p_picture_editing_page";
        }
    }

    public ku20(ner nerVar) {
        super(nerVar);
        this.f128800a = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m151437j0(C4470c c4470c) {
        if (NullChecker.m82486a(this.f128800a)) {
            if (c4470c == C4470c.f16264f) {
                this.f128800a.m152768c();
                return;
            }
            if (c4470c == C4470c.f16267i) {
                this.f128800a.m152783r();
            } else if (c4470c == C4470c.f16268j) {
                this.f128800a.m152772g();
            } else if (c4470c == C4470c.f16271m) {
                this.f128800a.m152770e();
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m151438f0() {
        if (CoreModule.m30929H().signedIn_()) {
            CoreModule.f18264c.f20381e0.f89336u0.put(Boolean.TRUE);
        } else {
            i4g0.m138523u("e_imagepage_signup_edit_done_button", "p_picture_editing_page", jyb.m147494Y("signup_source", CoreModule.m30929H().getSignUpType()));
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m151439g0(boolean z) {
        ((lu20) this.viewModel).m155843b(z);
    }

    /* JADX INFO: renamed from: h0 */
    public void m151440h0() {
        this.f128800a = new l4g0(new C18262a(), NewCropperAct.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("signup_source", CoreModule.m30929H().getSignUpType());
            this.f128800a.m152780o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m151441i0() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.ju20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122688a.m151437j0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public void m151442k0() {
        if (CoreModule.m30929H().signedIn_()) {
            return;
        }
        i4g0.m138523u("e_imagepage_signup_edit_back_button", "p_picture_editing_page", jyb.m147494Y("signup_source", CoreModule.m30929H().getSignUpType()));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
