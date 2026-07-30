package p153l;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.heytap.mcssdk.mode.CommandMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/oj3;", "Ll/qpl;", "Landroid/content/Context;", "context", "Lcom/hellogroup/mk/business/base/ui/MKWebView;", "webView", "<init>", "(Landroid/content/Context;Lcom/hellogroup/mk/business/base/ui/MKWebView;)V", "", "namespace", FirebaseAnalytics.Param.METHOD, "Lorg/json/JSONObject;", CommandMessage.PARAMS, "", "p", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Z", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class oj3 extends qpl {

    /* JADX INFO: renamed from: l.oj3$a */
    @Metadata(m88120d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m88121d2 = {"l/oj3$a", "Ll/kxl;", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C19150a implements kxl {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj3(@NotNull Context context, @NotNull MKWebView mKWebView) {
        super(mKWebView);
        context.getClass();
        mKWebView.getClass();
    }

    @Override // p153l.qpl
    /* JADX INFO: renamed from: p */
    public boolean mo18018p(@Nullable String namespace, @Nullable String method, @Nullable JSONObject params) {
        if (!Intrinsics.m88377d("analyze", namespace) || method == null || method.hashCode() != 767986877 || !method.equals("analyzeRecord")) {
            return false;
        }
        jxl jxlVarM98733b = alw.m98733b(namespace, method);
        if (jxlVarM98733b == null) {
            return true;
        }
        jxlVarM98733b.m147366b(m177460c(), new ijw(params), new C19150a());
        return true;
    }
}
