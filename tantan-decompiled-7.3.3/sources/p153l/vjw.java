package p153l;

import android.content.Context;
import android.view.ViewGroup;
import com.hellogroup.p036mk.business.MKConfigSetter;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.hellogroup.p036mk.business.widget.enhance.MKEnhanceView;
import com.hellogroup.p036mk.business.widget.enhance.MKEnhanceViewDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012JA\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Ll/vjw;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "startUrl", "loadingCustomFlag", "Landroid/view/ViewGroup;", "viewContainer", "Lcom/hellogroup/mk/business/base/ui/MKWebView;", "mkWebView", "", "needDefaultManager", "isPanel", "Ll/d2f;", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/view/ViewGroup;Lcom/hellogroup/mk/business/base/ui/MKWebView;Ljava/lang/Boolean;Z)Ll/d2f;", "url", "customNavbar", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/view/ViewGroup;Lcom/hellogroup/mk/business/base/ui/MKWebView;)Landroid/view/ViewGroup;", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class vjw {
    public static final vjw INSTANCE = new vjw();

    private vjw() {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ d2f m201553c(vjw vjwVar, Context context, String str, String str2, ViewGroup viewGroup, MKWebView mKWebView, Boolean bool, boolean z, int i, Object obj) {
        if ((i & 32) != 0) {
            bool = Boolean.TRUE;
        }
        return vjwVar.m201555b(context, str, str2, viewGroup, mKWebView, bool, (i & 64) != 0 ? false : z);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final ViewGroup m201554a(@Nullable Context context, @Nullable String url, @Nullable String customNavbar, @Nullable ViewGroup viewContainer, @Nullable MKWebView mkWebView) {
        ojw ojwVarM17763b;
        ViewGroup viewGroupM167948g;
        if (customNavbar == null || StringsKt.m94329e0(customNavbar) || (ojwVarM17763b = MKConfigSetter.INSTANCE.m17763b()) == null || (viewGroupM167948g = ojwVarM17763b.m167948g(context, url, customNavbar, mkWebView)) == null) {
            return null;
        }
        if (viewContainer != null) {
            viewContainer.addView(viewGroupM167948g, new ViewGroup.LayoutParams(-1, -2));
        }
        return viewGroupM167948g;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final d2f m201555b(@Nullable Context context, @Nullable String startUrl, @Nullable String loadingCustomFlag, @Nullable ViewGroup viewContainer, @Nullable MKWebView mkWebView, @Nullable Boolean needDefaultManager, boolean isPanel) {
        if (context == null || startUrl == null || loadingCustomFlag == null || viewContainer == null || mkWebView == null || StringsKt.m94329e0(loadingCustomFlag)) {
            return null;
        }
        ojw ojwVarM17763b = MKConfigSetter.INSTANCE.m17763b();
        MKEnhanceView mKEnhanceViewM167959r = ojwVarM17763b != null ? ojwVarM17763b.m167959r(context, startUrl, loadingCustomFlag, mkWebView, isPanel) : null;
        if (mKEnhanceViewM167959r == null && Intrinsics.m88377d(needDefaultManager, Boolean.TRUE)) {
            mKEnhanceViewM167959r = new MKEnhanceViewDefault(context, mkWebView, isPanel);
        }
        if (mKEnhanceViewM167959r == null) {
            return null;
        }
        d2f d2fVar = new d2f(context);
        d2fVar.m113690a(viewContainer, startUrl, loadingCustomFlag, mKEnhanceViewM167959r);
        return d2fVar;
    }
}
