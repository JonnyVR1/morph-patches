package p153l;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class s9i0 extends wc00 {

    /* JADX INFO: renamed from: h */
    public kcg0 f166935h;

    /* JADX INFO: renamed from: i */
    public kcg0 f166936i;

    public s9i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    @Override // p153l.wc00
    /* JADX INFO: renamed from: E */
    public void mo185185E() {
        super.mo185185E();
        if (NullChecker.m82486a(this.f166935h)) {
            this.f166935h.unsubscribe();
            this.f166935h = null;
        }
        if (NullChecker.m82486a(this.f166936i)) {
            this.f166936i.unsubscribe();
            this.f166936i = null;
        }
    }

    /* JADX INFO: renamed from: O */
    public void m185186O(@NonNull xc00 xc00Var) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.addFlags(270532608);
        try {
            xc00Var.mo99543c().startActivity(intent);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m185187P(String str, Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        m205738F(str);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m185188Q(String str, Boolean bool) {
        if (bool.booleanValue()) {
            m205738F(str);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m185189R(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("subscribeType");
        final String strOptString2 = jSONObject.optString("subscribeHandler");
        String strOptString3 = jSONObject.optString("success");
        jSONObject.optString("fail");
        if (strOptString.equals("onAppEnterBackground")) {
            if (this.f166936i == null) {
                this.f166936i = Act.foreground().map(new qcj() { // from class: l.o9i0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(NullChecker.m82486a((Act.C4450r) obj));
                    }
                }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.p9i0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f151160a.m185187P(strOptString2, (Boolean) obj);
                    }
                }));
                m205738F(strOptString3);
                return;
            }
            return;
        }
        if (strOptString.equals("onAppEnterForeground") && this.f166935h == null) {
            this.f166935h = Act.foreground().map(new qcj() { // from class: l.q9i0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m82486a((Act.C4450r) obj));
                }
            }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.r9i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f161828a.m185188Q(strOptString2, (Boolean) obj);
                }
            }));
            m205738F(strOptString3);
        }
    }

    @Override // p153l.wc00
    /* JADX INFO: renamed from: v */
    public boolean mo47831v(@NonNull xc00 xc00Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        if (str2.equals("jumpToLauncher")) {
            m185186O(xc00Var);
            return true;
        }
        if (!str2.equals("subscribe")) {
            return false;
        }
        m185189R(xc00Var, jSONObject);
        return true;
    }
}
