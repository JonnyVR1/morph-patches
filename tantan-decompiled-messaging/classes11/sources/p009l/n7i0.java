package p009l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p000p1.mobile.putong.p004ui.share.ShareHelper;
import com.p000p1.mobile.share_sdk.ShareEventActivity;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.Link;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import l.d30;
import l.e30;
import l.e51;
import l.f30;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class n7i0 extends e400 {
    public n7i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m18793C(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final void m18800J(@NonNull final f400 f400Var, String str, String str2, String str3, String str4, final String str5) {
        Link link = new Link();
        link.href = str2;
        ShareHelper shareHelper = new ShareHelper(link);
        if (!TextUtils.isEmpty(str5)) {
            shareHelper.m10345t0(new f30() { // from class: l.m7i0
                public final void call(Object obj, Object obj2) {
                    this.f16746a.m18799I(f400Var, str5, (String) obj, (String) obj2);
                }
            });
        }
        shareHelper.m10350y0(f400Var.mo12184c(), str4, str3, ShareHelper.m10288Z(str), true, str2);
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void m18797H(@NonNull final f400 f400Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString(ShareEventActivity.PLATFORM);
        final String strOptString2 = jSONObject.optString("pic");
        final String strOptString3 = jSONObject.optString("shareTitle");
        final String strOptString4 = jSONObject.optString("dialogTitle");
        final String strOptString5 = jSONObject.optString("backMethod");
        if (zqx.m25938k()) {
            m18800J(f400Var, strOptString, strOptString2, strOptString3, strOptString4, strOptString5);
        } else {
            PermissionHelper.m10211c().m10229r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m10224m(new d30() { // from class: l.k7i0
                public final void call() {
                    this.f15448a.m18800J(f400Var, strOptString, strOptString2, strOptString3, strOptString4, strOptString5);
                }
            }, new e30() { // from class: l.l7i0
                public final void call(Object obj) {
                    n7i0.m18793C((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m10220i(f400Var.mo12184c());
        }
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void m18799I(@NonNull f400 f400Var, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "adtp";
        }
        m13719y(str3, str, str2);
    }

    @Override // p009l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo10568n(@NonNull final f400 f400Var, String str, String str2, final JSONObject jSONObject) {
        str2.getClass();
        if (!str2.equals("shareImage")) {
            return false;
        }
        e51.M(new Runnable() { // from class: l.j7i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14974a.m18797H(f400Var, jSONObject);
            }
        });
        return true;
    }
}
