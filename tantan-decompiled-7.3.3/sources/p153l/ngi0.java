package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.CreditScoreTaskType;
import com.p051p1.mobile.putong.data.Link;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.p070ui.share.ShareHelper;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ngi0 extends wc00 {
    public ngi0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m162973K(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final void m162980R(@NonNull final xc00 xc00Var, String str, String str2, String str3, String str4, final String str5) {
        Link link = new Link();
        link.href = str2;
        ShareHelper shareHelper = new ShareHelper(link);
        if (!TextUtils.isEmpty(str5)) {
            shareHelper.m81199t0(new z20() { // from class: l.mgi0
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f136741a.m162979Q(xc00Var, str5, (String) obj, (String) obj2);
                }
            });
        }
        shareHelper.m81204y0(xc00Var.mo99543c(), str4, str3, ShareHelper.m81142Z(str), true, str2);
    }

    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void m162977P(@NonNull final xc00 xc00Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("platform");
        final String strOptString2 = jSONObject.optString(CreditScoreTaskType.pic);
        final String strOptString3 = jSONObject.optString("shareTitle");
        final String strOptString4 = jSONObject.optString("dialogTitle");
        final String strOptString5 = jSONObject.optString("backMethod");
        if (wzx.m208784k()) {
            m162980R(xc00Var, strOptString, strOptString2, strOptString3, strOptString4, strOptString5);
        } else {
            PermissionHelper.m81065c().m81083r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m81078m(new x20() { // from class: l.kgi0
                @Override // p153l.x20
                public final void call() {
                    this.f126614a.m162980R(xc00Var, strOptString, strOptString2, strOptString3, strOptString4, strOptString5);
                }
            }, new y20() { // from class: l.lgi0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ngi0.m162973K((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m81074i(xc00Var.mo99543c());
        }
    }

    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void m162979Q(@NonNull xc00 xc00Var, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "adtp";
        }
        m205739G(str3, str, str2);
    }

    @Override // p153l.wc00
    /* JADX INFO: renamed from: v */
    public boolean mo47831v(@NonNull final xc00 xc00Var, String str, String str2, final JSONObject jSONObject) {
        str2.getClass();
        if (!str2.equals("shareImage")) {
            return false;
        }
        l51.m152893M(new Runnable() { // from class: l.jgi0
            @Override // java.lang.Runnable
            public final void run() {
                this.f120731a.m162977P(xc00Var, jSONObject);
            }
        });
        return true;
    }
}
