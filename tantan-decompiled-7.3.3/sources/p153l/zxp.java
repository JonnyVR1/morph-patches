package p153l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.webkit.WebView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.common.R$string;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0019"}, m88121d2 = {"Ll/zxp;", "", "<init>", "()V", "Landroid/webkit/WebView;", "webView", "", "url", "Landroid/content/Context;", "context", "", "b", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/content/Context;)Z", "a", "(Ljava/lang/String;)Z", "", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;Ljava/lang/String;)V", "c", "", "Ljava/util/List;", "PAY_PROTOCOLS", "Ljava/lang/String;", "HOSTNAME", "PURCHASE_PAGE_PROTOCOLS", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class zxp {

    @NotNull
    public static final zxp INSTANCE = new zxp();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final List<String> PAY_PROTOCOLS;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String HOSTNAME;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final List<String> PURCHASE_PAGE_PROTOCOLS;

    static {
        ArrayList arrayListM147507f0 = jyb.m147507f0("boostappdeeplink", "kakaotalk://kakaopay/gka/enrollment?link_force_open", "android-app://jp.naver.line.android");
        arrayListM147507f0.getClass();
        PAY_PROTOCOLS = arrayListM147507f0;
        String str = (zwk.m221905e() ? "http" : "https") + "://intlweb." + (zwk.m221905e() ? "staging2.p1staff" : "tantanapp") + ".com";
        HOSTNAME = str;
        ArrayList arrayListM147507f1 = jyb.m147507f0(str + "/purchase/redirect", str + "/purchase/subRedirect");
        arrayListM147507f1.getClass();
        PURCHASE_PAGE_PROTOCOLS = arrayListM147507f1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m222060a(String url) {
        Iterator<String> it = PAY_PROTOCOLS.iterator();
        while (it.hasNext()) {
            if (C15493d.m94374J(url, it.next(), false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m222061b(@NotNull WebView webView, @NotNull String url, @NotNull Context context) {
        webView.getClass();
        url.getClass();
        context.getClass();
        if (C15493d.m94374J(url, "sms:", false, 2, null) || C15493d.m94374J(url, "smsto:", false, 2, null) || C15493d.m94374J(url, "geo:", false, 2, null) || C15493d.m94374J(url, "market:", false, 2, null)) {
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
            } catch (Exception e) {
                CrashHelper.m82479c(new Exception("CWebViewClient shouldOverrideUrlLoading:" + e.getMessage(), e));
            }
            return true;
        }
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        if (C15493d.m94374J(url, "intent:", false, 2, null)) {
            try {
                Intent uri = Intent.parseUri(url, 1);
                uri.getClass();
                if (uri.resolveActivity(context.getPackageManager()) != null) {
                    context.startActivity(uri);
                    return true;
                }
                String stringExtra = uri.getStringExtra("browser_fallback_url");
                if (stringExtra != null && !Intrinsics.m88377d("play.google.com", Uri.parse(stringExtra).getHost())) {
                    webView.loadUrl(stringExtra);
                    return true;
                }
                Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse("market://details?id=" + uri.getPackage()));
                data.getClass();
                if (data.resolveActivity(packageManager) != null) {
                    context.startActivity(data);
                    return true;
                }
            } catch (Exception e2) {
                CrashHelper.m82479c(e2);
            }
        }
        if (m222060a(url)) {
            m222063d(context, url);
            return true;
        }
        Iterator<T> it = PURCHASE_PAGE_PROTOCOLS.iterator();
        while (it.hasNext()) {
            if (C15493d.m94374J(url, (String) it.next(), false, 2, null) && (context instanceof PutongAct)) {
                ((PutongAct) context).m68056e2();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m222062c(Context context, String url) {
        try {
            Intent uri = Intent.parseUri(url, 1);
            uri.setFlags(805306368);
            uri.addCategory("android.intent.category.BROWSABLE");
            uri.setComponent(null);
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(uri, 65536);
            listQueryIntentActivities.getClass();
            if (listQueryIntentActivities.size() > 0) {
                context.startActivity(uri);
            }
        } catch (Exception unused) {
            o1j0.m165634h(R$string.f18225u0);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m222063d(Context context, String url) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(url));
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            listQueryIntentActivities.getClass();
            if (listQueryIntentActivities.size() > 0) {
                context.startActivity(intent);
            } else {
                m222062c(context, url);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            o1j0.m165634h(R$string.f18225u0);
        }
    }
}
