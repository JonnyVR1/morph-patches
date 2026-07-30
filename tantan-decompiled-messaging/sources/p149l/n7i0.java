package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.CreditScoreTaskType;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.p065ui.share.ShareHelper;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class n7i0 extends e400 {
    public n7i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m158135C(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final void m158142J(@NonNull final f400 f400Var, String str, String str2, String str3, String str4, final String str5) {
        Link link = new Link();
        link.href = str2;
        ShareHelper shareHelper = new ShareHelper(link);
        if (!TextUtils.isEmpty(str5)) {
            shareHelper.m80016t0(new f30() { // from class: l.m7i0
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f131828a.m158141I(f400Var, str5, (String) obj, (String) obj2);
                }
            });
        }
        shareHelper.m80021y0(f400Var.mo102961c(), str4, str3, ShareHelper.m79959Z(str), true, str2);
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void m158139H(@NonNull final f400 f400Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("platform");
        final String strOptString2 = jSONObject.optString(CreditScoreTaskType.pic);
        final String strOptString3 = jSONObject.optString("shareTitle");
        final String strOptString4 = jSONObject.optString("dialogTitle");
        final String strOptString5 = jSONObject.optString("backMethod");
        if (zqx.m219898k()) {
            m158142J(f400Var, strOptString, strOptString2, strOptString3, strOptString4, strOptString5);
        } else {
            PermissionHelper.m79882c().m79900r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m79895m(new d30() { // from class: l.k7i0
                @Override // p149l.d30
                public final void call() {
                    this.f121587a.m158142J(f400Var, strOptString, strOptString2, strOptString3, strOptString4, strOptString5);
                }
            }, new e30() { // from class: l.l7i0
                @Override // p149l.e30
                public final void call(Object obj) {
                    n7i0.m158135C((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m79891i(f400Var.mo102961c());
        }
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void m158141I(@NonNull f400 f400Var, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "adtp";
        }
        m114660y(str3, str, str2);
    }

    @Override // p149l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo46640n(@NonNull final f400 f400Var, String str, String str2, final JSONObject jSONObject) {
        str2.getClass();
        if (!str2.equals("shareImage")) {
            return false;
        }
        e51.m114748M(new Runnable() { // from class: l.j7i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f116606a.m158139H(f400Var, jSONObject);
            }
        });
        return true;
    }
}
