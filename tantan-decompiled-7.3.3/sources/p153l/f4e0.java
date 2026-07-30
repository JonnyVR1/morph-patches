package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.PaymentData;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class f4e0 extends o5e0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m123980e(abe0 abe0Var, Boolean bool) {
        if (bool.booleanValue()) {
            String strM123982g = m123982g(abe0Var);
            if (NullChecker.m82486a(strM123982g)) {
                Intent intentM81333a2 = AccessTokenWebViewAct.m81333a2(abe0Var.m96739b(), abe0Var.m96739b().getString(R$string.f19661st), strM123982g);
                intentM81333a2.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                abe0Var.m96739b().startActivity(intentM81333a2);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private static String m123982g(abe0 abe0Var) {
        Map<String, String> mapM96743f = abe0Var.m96743f();
        String str = mapM96743f.get("url");
        if (!NullChecker.m82486a(str)) {
            return null;
        }
        if (str.contains("#")) {
            return str.replaceFirst("&", "?");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("?");
        for (Map.Entry<String, String> entry : mapM96743f.entrySet()) {
            if (!TextUtils.equals(entry.getKey(), "url")) {
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                sb.append("&");
            }
        }
        return sb.toString();
    }

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(final abe0 abe0Var, z20<String, String> z20Var) {
        CoreModule.f18264c.f20346S0.m35190w3().map(new qcj() { // from class: l.d4e0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                PaymentData paymentData = (PaymentData) obj;
                return Boolean.valueOf(paymentData.isCanUse(PaymentData.FROM_RESULT, paymentData.getCodaName()) || paymentData.isCanUse(PaymentData.FROM_RESULT, paymentData.getCOutName()));
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.e4e0
            @Override // p153l.y20
            public final void call(Object obj) {
                f4e0.m123980e(abe0Var, (Boolean) obj);
            }
        }));
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}
