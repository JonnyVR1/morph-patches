package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.DialogInterfaceC0075a;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.hellogroup.common.file.FileUtil;
import com.hellogroup.common.thread.C3486c;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.hellogroup.p036mk.business.p038ui.BaseMKProxyActivity;
import com.hellogroup.p036mk.business.p038ui.MKCommonWebPanelActivity;
import com.hellogroup.p036mk.business.p038ui.MKWebCommonActivity;
import com.hellogroup.p036mk.business.p038ui.NormalWebViewActivity;
import com.hellogroup.p036mk.business.util.MKWebCaptureHelper;
import com.heytap.mcssdk.mode.CommandMessage;
import com.heytap.mcssdk.mode.Message;
import com.p051p1.mobile.putong.core.data.Target;
import com.p051p1.mobile.putong.data.Careers;
import com.p051p1.mobile.putong.data.OMSResourceType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15493d;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;
import p000.C0799b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0016\u0018\u0000 82\u00020\u0001:\u00019B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0019\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u001f\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b'\u0010\fJ\u0019\u0010(\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b(\u0010\fJ-\u0010+\u001a\u00020\u001e2\b\u0010)\u001a\u0004\u0018\u00010\u00112\b\u0010*\u001a\u0004\u0018\u00010\u00112\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\nH\u0016¢\u0006\u0004\b-\u0010&J\u0017\u0010/\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u0006:"}, m88121d2 = {"Ll/hm3;", "Ll/ecb;", "Lcom/hellogroup/mk/business/base/ui/MKWebView;", "webView", "Ll/flw;", "uiCallback", "<init>", "(Lcom/hellogroup/mk/business/base/ui/MKWebView;Ll/flw;)V", "Lorg/json/JSONObject;", CommandMessage.PARAMS, "", "q", "(Lorg/json/JSONObject;)V", "json", "K", "jsonObject", "I", "", "url", "", Message.RULE, "D", "(Ljava/lang/String;I)Ljava/lang/String;", NotificationCompat.CATEGORY_STATUS, "msg", c4s.C_ZONE, "(ILjava/lang/String;)Ljava/lang/String;", "path", "Landroid/graphics/Bitmap;", "bitmap", "", "H", "(Ljava/lang/String;Landroid/graphics/Bitmap;)Z", "Landroid/view/View;", ResourceDirection.f39656v, "B", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "A", "()V", "G", "J", "namespace", FirebaseAnalytics.Param.METHOD, "p", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Z", BLiveStormDanmakuGiftResourceType.f45292l, "dataJson", "E", "(Lorg/json/JSONObject;)Ljava/lang/String;", "c", "Ljava/lang/String;", "taskTag", Constants.INAPP_DATA_TAG, "Ll/flw;", "F", "()Ll/flw;", "Companion", "a", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class hm3 extends ecb {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String taskTag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final flw uiCallback;

    /* JADX INFO: renamed from: l.hm3$b */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC17497b implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ JSONObject f110575b;

        public RunnableC17497b(JSONObject jSONObject) {
            this.f110575b = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            hm3.this.m135807I(this.f110575b);
        }
    }

    /* JADX INFO: renamed from: l.hm3$c */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC17498c implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ JSONObject f110577b;

        public RunnableC17498c(JSONObject jSONObject) {
            this.f110577b = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CopyOnWriteArrayList<mlw> copyOnWriteArrayListM163782b;
            String strOptString;
            String strOptString2;
            if (hm3.this.f158879a != null) {
                try {
                    nlw mkWebRebuildData = hm3.this.f158879a.getMkWebRebuildData();
                    if (mkWebRebuildData != null && (copyOnWriteArrayListM163782b = mkWebRebuildData.m163782b()) != null && !copyOnWriteArrayListM163782b.isEmpty()) {
                        String json = new Gson().toJson(copyOnWriteArrayListM163782b);
                        copyOnWriteArrayListM163782b.clear();
                        jzv.m147732e("getRebuildCacheCallbacks", json);
                        hm3 hm3Var = hm3.this;
                        JSONObject jSONObject = this.f110577b;
                        if (jSONObject == null || (strOptString = jSONObject.optString("callback")) == null) {
                            strOptString = "";
                        }
                        json.getClass();
                        Charset charset = Charsets.UTF_8;
                        if (json == null) {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                        byte[] bytes = json.getBytes(charset);
                        bytes.getClass();
                        hm3Var.m177464h(strOptString, Base64.encodeToString(bytes, 2), "成功", "0");
                        return;
                    }
                } catch (Throwable th) {
                    jzv.m147730c(qpl.f158878b, "", th);
                }
            }
            hm3 hm3Var2 = hm3.this;
            JSONObject jSONObject2 = this.f110577b;
            if (jSONObject2 == null || (strOptString2 = jSONObject2.optString("callback")) == null) {
                strOptString2 = "";
            }
            hm3Var2.m177464h(strOptString2, "", "无数据", "0");
        }
    }

    /* JADX INFO: renamed from: l.hm3$d */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m88121d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class ViewOnClickListenerC17499d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ViewGroup f110578a;

        public ViewOnClickListenerC17499d(ViewGroup viewGroup) {
            this.f110578a = viewGroup;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Context context = this.f110578a.getContext();
            if (context instanceof Activity) {
                ((Activity) context).finish();
            }
        }
    }

    /* JADX INFO: renamed from: l.hm3$e */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC17500e implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ JSONObject f110580b;

        public RunnableC17500e(JSONObject jSONObject) {
            this.f110580b = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            hul hulVar = hm3.this.f158879a;
            if ((hulVar != null ? hulVar.getWebContext() : null) instanceof BaseMKProxyActivity) {
                hul hulVar2 = hm3.this.f158879a;
                hulVar2.getClass();
                Context webContext = hulVar2.getWebContext();
                if (webContext == null) {
                    C0799b.m4641a("null cannot be cast to non-null type com.hellogroup.mk.business.ui.BaseMKProxyActivity");
                    return;
                }
                BaseMKProxyActivity baseMKProxyActivity = (BaseMKProxyActivity) webContext;
                JSONObject jSONObject = this.f110580b;
                boolean z = false;
                if (jSONObject != null && jSONObject.optInt("isShow", 0) == 1) {
                    z = true;
                }
                baseMKProxyActivity.m18093D2(z, true, "JSBridge");
                JSONObject jSONObject2 = this.f110580b;
                if (jSONObject2 != null) {
                    hm3.this.m177463g(glw.m130707d(jSONObject2), "1");
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.hm3$f */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC17501f implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ JSONObject f110582b;

        public RunnableC17501f(JSONObject jSONObject) {
            this.f110582b = jSONObject;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0051  */
        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            String strOptString;
            hul hulVar = hm3.this.f158879a;
            if ((hulVar != null ? hulVar.getWebContext() : null) instanceof BaseMKProxyActivity) {
                JSONObject jSONObject = this.f110582b;
                String str = (jSONObject == null || (strOptString = jSONObject.optString("txt", "Oops! 出错了")) == null) ? "Oops! 出错了" : strOptString;
                JSONObject jSONObject2 = this.f110582b;
                String strOptString2 = jSONObject2 != null ? jSONObject2.optString("msg", "") : null;
                hul hulVar2 = hm3.this.f158879a;
                hulVar2.getClass();
                Context webContext = hulVar2.getWebContext();
                if (webContext == null) {
                    C0799b.m4641a("null cannot be cast to non-null type com.hellogroup.mk.business.ui.BaseMKProxyActivity");
                    return;
                }
                BaseMKProxyActivity baseMKProxyActivity = (BaseMKProxyActivity) webContext;
                JSONObject jSONObject3 = this.f110582b;
                if (jSONObject3 != null) {
                    z = jSONObject3.optInt("isShow", 0) == 1;
                }
                baseMKProxyActivity.m18098H2(z, true, "JSBridge_" + strOptString2, str, true);
                JSONObject jSONObject4 = this.f110582b;
                if (jSONObject4 != null) {
                    hm3.this.m177463g(glw.m130707d(jSONObject4), "1");
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.hm3$g */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC17502g implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ JSONObject f110584b;

        public RunnableC17502g(JSONObject jSONObject) {
            this.f110584b = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String strOptString;
            String strOptString2;
            String strOptString3;
            JSONObject jSONObject = this.f110584b;
            if (jSONObject == null || (strOptString = jSONObject.optString("callback")) == null) {
                strOptString = "";
            }
            try {
                JSONObject jSONObject2 = this.f110584b;
                if (jSONObject2 == null || (strOptString2 = jSONObject2.optString("url", "")) == null) {
                    strOptString2 = "";
                }
                JSONObject jSONObject3 = this.f110584b;
                int iOptInt = jSONObject3 != null ? jSONObject3.optInt("type", 0) : 0;
                jzv.m147732e("MKWebCaptureHelper", "saveCanvasCapture = " + strOptString2 + "   type=" + iOptInt);
                if (i8g0.m139000b(strOptString2)) {
                    hm3.this.m177464h(strOptString, "", "url不能为空", "1");
                    return;
                }
                JSONObject jSONObject4 = this.f110584b;
                String str = (jSONObject4 == null || (strOptString3 = jSONObject4.optString("data")) == null) ? "" : strOptString3;
                if (TextUtils.isEmpty(str)) {
                    hm3.this.m177464h(strOptString, "", "文件数据为空", "1");
                    return;
                }
                File fileM110399h = ckw.m110399h();
                hm3 hm3Var = hm3.this;
                if (fileM110399h == null) {
                    hm3Var.m177464h(strOptString, "", "保存文件失败", "1");
                    return;
                }
                String strM135804D = hm3Var.m135804D(strOptString2, iOptInt);
                if (i8g0.m139000b(strM135804D)) {
                    hm3.this.m177464h(strOptString, "", "保存文件失败,不支持type类型", "1");
                    return;
                }
                File file = new File(fileM110399h, strM135804D);
                if (file.exists()) {
                    file.delete();
                }
                try {
                    if (FileUtil.m17541y(Base64.decode((String) StringsKt.split$default(C15493d.m94370F(str, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, Marker.ANY_NON_NULL_MARKER, false, 4, null), new String[]{Constants.SEPARATOR_COMMA}, false, 0, 6, null).get(1), 0), file)) {
                        hm3.this.m177464h(strOptString, "", "成功", "0");
                        hm3.this.m135801A();
                        return;
                    }
                } catch (Exception e) {
                    jzv.m147730c(qpl.f158878b, "", e);
                }
                hm3.this.m177464h(strOptString, "", "保存文件失败", "1");
                hm3.this.m135801A();
            } catch (Throwable th) {
                hm3 hm3Var2 = hm3.this;
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                hm3Var2.m177464h(strOptString, "", message, "1");
                jzv.m147730c(qpl.f158878b, "", th);
            }
        }
    }

    /* JADX INFO: renamed from: l.hm3$h */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC17503h implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ JSONObject f110586b;

        public RunnableC17503h(JSONObject jSONObject) {
            this.f110586b = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String strOptString;
            String strOptString2;
            WebView view;
            JSONObject jSONObject = this.f110586b;
            if (jSONObject == null || (strOptString = jSONObject.optString("callback")) == null) {
                strOptString = "";
            }
            Bitmap bitmapM135802B = null;
            try {
                try {
                    JSONObject jSONObject2 = this.f110586b;
                    if (jSONObject2 == null || (strOptString2 = jSONObject2.optString("url", "")) == null) {
                        strOptString2 = "";
                    }
                    JSONObject jSONObject3 = this.f110586b;
                    int iOptInt = jSONObject3 != null ? jSONObject3.optInt("type", 0) : 0;
                    boolean zM139000b = i8g0.m139000b(strOptString2);
                    hm3 hm3Var = hm3.this;
                    if (zM139000b) {
                        hm3Var.m177463g(strOptString, hm3Var.m135803C(1, "url不能为空"));
                        return;
                    }
                    hul hulVar = hm3Var.f158879a;
                    if (hulVar != null && (view = hulVar.getView()) != null) {
                        bitmapM135802B = hm3.this.m135802B(view);
                    }
                    jzv.m147732e("MKWebCaptureHelper", "saveCanvasCapture = " + strOptString2 + "   type=" + iOptInt);
                    if (bitmapM135802B == null) {
                        hm3 hm3Var2 = hm3.this;
                        hm3Var2.m177463g(strOptString, hm3Var2.m135803C(1, "截图失败"));
                        return;
                    }
                    if (bitmapM135802B.isRecycled()) {
                        hm3 hm3Var3 = hm3.this;
                        hm3Var3.m177463g(strOptString, hm3Var3.m135803C(1, "截图失败"));
                        try {
                            if (bitmapM135802B.isRecycled()) {
                                return;
                            }
                            bitmapM135802B.recycle();
                            return;
                        } catch (Throwable th) {
                            jzv.m147730c("MKWebCaptureHelper", "", th);
                            return;
                        }
                    }
                    File fileM110399h = ckw.m110399h();
                    hm3 hm3Var4 = hm3.this;
                    if (fileM110399h == null) {
                        hm3Var4.m177463g(strOptString, hm3Var4.m135803C(1, "存储截图失败"));
                        try {
                            if (bitmapM135802B.isRecycled()) {
                                return;
                            }
                            bitmapM135802B.recycle();
                            return;
                        } catch (Throwable th2) {
                            jzv.m147730c("MKWebCaptureHelper", "", th2);
                            return;
                        }
                    }
                    File file = new File(fileM110399h, hm3Var4.m135804D(strOptString2, iOptInt));
                    if (file.exists()) {
                        file.delete();
                    }
                    String absolutePath = file.getAbsolutePath();
                    hm3 hm3Var5 = hm3.this;
                    absolutePath.getClass();
                    boolean zM135806H = hm3Var5.m135806H(absolutePath, bitmapM135802B);
                    hm3 hm3Var6 = hm3.this;
                    if (zM135806H) {
                        hm3Var6.m177463g(strOptString, hm3Var6.m135803C(0, "成功"));
                    } else {
                        hm3Var6.m177463g(strOptString, hm3Var6.m135803C(1, "存储截图失败"));
                    }
                    hm3.this.m135801A();
                    if (bitmapM135802B.isRecycled()) {
                        return;
                    }
                    bitmapM135802B.recycle();
                } catch (Throwable th3) {
                    try {
                        hm3 hm3Var7 = hm3.this;
                        String message = th3.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        hm3Var7.m177463g(strOptString, hm3Var7.m135803C(1, message));
                        jzv.m147730c("MKWebCaptureHelper", "", th3);
                        if (0 == 0 || bitmapM135802B.isRecycled()) {
                        }
                    } catch (Throwable th4) {
                        if (0 != 0) {
                            try {
                                if (!bitmapM135802B.isRecycled()) {
                                    bitmapM135802B.recycle();
                                }
                            } catch (Throwable th5) {
                                jzv.m147730c("MKWebCaptureHelper", "", th5);
                            }
                        }
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                jzv.m147730c("MKWebCaptureHelper", "", th6);
            }
        }
    }

    /* JADX INFO: renamed from: l.hm3$i */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m88121d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class DialogInterfaceOnClickListenerC17504i implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f110588b;

        public DialogInterfaceOnClickListenerC17504i(String str) {
            this.f110588b = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("button", 1);
            } catch (Exception e) {
                jzv.m147730c(qpl.f158878b, "", e);
            }
            hm3.this.m177463g(this.f110588b, jSONObject.toString());
        }
    }

    /* JADX INFO: renamed from: l.hm3$j */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m88121d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class DialogInterfaceOnClickListenerC17505j implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f110590b;

        public DialogInterfaceOnClickListenerC17505j(String str) {
            this.f110590b = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            jzv.m147728a(qpl.f158878b, "tang----onClick 2");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("button", 2);
            } catch (Exception e) {
                jzv.m147730c(qpl.f158878b, "", e);
            }
            hm3.this.m177463g(this.f110590b, jSONObject.toString());
        }
    }

    /* JADX INFO: renamed from: l.hm3$k */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m88121d2 = {"<anonymous>", "", Careers.f39580it, "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onCancel"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class DialogInterfaceOnCancelListenerC17506k implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f110592b;

        public DialogInterfaceOnCancelListenerC17506k(String str) {
            this.f110592b = str;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            jzv.m147728a(qpl.f158878b, "tang----onCancel");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("button", 0);
            } catch (Exception e) {
                jzv.m147730c(qpl.f158878b, "", e);
            }
            hm3.this.m177463g(this.f110592b, jSONObject.toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm3(@NotNull MKWebView mKWebView, @Nullable flw flwVar) {
        super(mKWebView);
        mKWebView.getClass();
        this.uiCallback = flwVar;
        this.taskTag = "MKKitBridgeUI" + hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final void m135801A() {
        MKWebCaptureHelper.INSTANCE.m18218b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final Bitmap m135802B(View v2) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(v2.getWidth(), v2.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            v2.draw(canvas);
            canvas.setBitmap(null);
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            jzv.m147730c("MKWebCaptureHelper", "", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final String m135803C(int status, String msg) {
        String string = qpl.m177459a(new String[]{NotificationCompat.CATEGORY_STATUS, "message"}, new String[]{String.valueOf(status), msg}).toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    /* JADX INFO: renamed from: D */
    public final String m135804D(String url, int rule) {
        if (rule != 1) {
            if (rule != 0) {
                return "";
            }
            return oiw.m167803f(url) + ".png_";
        }
        String strM18224i = MKWebCaptureHelper.INSTANCE.m18224i(url);
        if (!i8g0.m139002d(strM18224i)) {
            return "";
        }
        return oiw.m167803f(strM18224i) + ".png_";
    }

    /* JADX INFO: renamed from: G */
    private final void m135805G(JSONObject params) {
        C3486c.m17566d(2, new RunnableC17502g(params));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public final boolean m135806H(String path, Bitmap bitmap) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(path);
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream2);
                    try {
                        fileOutputStream2.close();
                        return true;
                    } catch (IOException e) {
                        jzv.m147730c("MKWebCaptureHelper", "", e);
                        return true;
                    }
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    jzv.m147730c("MKWebCaptureHelper", "", e);
                    if (fileOutputStream == null) {
                        return false;
                    }
                    try {
                        fileOutputStream.close();
                        return false;
                    } catch (IOException e3) {
                        jzv.m147730c("MKWebCaptureHelper", "", e3);
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            jzv.m147730c("MKWebCaptureHelper", "", e4);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final void m135807I(JSONObject jsonObject) {
        C3486c.m17566d(2, new RunnableC17503h(jsonObject));
    }

    /* JADX INFO: renamed from: J */
    private final void m135808J(JSONObject params) {
        g4k g4kVarM186316e = sjw.m186316e();
        if (g4kVarM186316e != null) {
            g4kVarM186316e.mo128895d(String.valueOf(params));
        }
    }

    /* JADX INFO: renamed from: K */
    private final void m135809K(JSONObject json) {
        Context contextM177460c = m177460c();
        if (contextM177460c != null) {
            String strOptString = json.optString("title");
            String strOptString2 = json.optString("content");
            String strOptString3 = json.optString("btn1");
            String strOptString4 = json.optString("btn2");
            String strOptString5 = json.optString("callback");
            if (TextUtils.isEmpty(strOptString3) && TextUtils.isEmpty(strOptString4)) {
                jzv.m147729b(qpl.f158878b, "showConfrim btn1, btn2 is NULL");
                return;
            }
            DialogInterfaceC0075a.a aVar = new DialogInterfaceC0075a.a(contextM177460c);
            if (strOptString == null) {
                strOptString = "";
            }
            DialogInterfaceC0075a.a title = aVar.setTitle(strOptString);
            if (strOptString2 == null) {
                strOptString2 = "";
            }
            title.setMessage(strOptString2).setPositiveButton(strOptString3, new DialogInterfaceOnClickListenerC17504i(strOptString5)).setNegativeButton(strOptString4, new DialogInterfaceOnClickListenerC17505j(strOptString5)).setOnCancelListener(new DialogInterfaceOnCancelListenerC17506k(strOptString5)).show();
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m135810q(JSONObject params) {
        g4k g4kVarM186316e = sjw.m186316e();
        if (g4kVarM186316e != null) {
            g4kVarM186316e.mo128894c(params.optString(AuthenticationTokenClaims.JSON_KEY_NAME), params.optString("dst"), params.optJSONObject("data"));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final String m135819E(@Nullable JSONObject dataJson) {
        String strOptString;
        return (dataJson == null || (strOptString = dataJson.optString("callback")) == null) ? "" : strOptString;
    }

    @Nullable
    /* JADX INFO: renamed from: F, reason: from getter */
    public flw getUiCallback() {
        return this.uiCallback;
    }

    @Override // p153l.qpl
    /* JADX INFO: renamed from: l */
    public void mo121328l() {
        super.mo121328l();
        jzv.m147732e(qpl.f158878b, "onDestroy");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:48:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:81:0x0171 A[Catch: all -> 0x0169, TRY_LEAVE, TryCatch #2 {all -> 0x0169, blocks: (B:76:0x0164, B:79:0x016b, B:81:0x0171), top: B:399:0x0164 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p153l.ecb, p153l.qpl
    /* JADX INFO: renamed from: p */
    public boolean mo18018p(@Nullable String namespace, @Nullable String method, @Nullable JSONObject params) {
        String strOptString;
        ViewGroup containerScaleView;
        String strOptString2;
        String strOptString3;
        String strOptString4;
        flw uiCallback;
        i = 0;
        int i = 0;
        z = false;
        boolean z = false;
        if (Intrinsics.m88377d("ui", namespace)) {
            if (method != null) {
                String str = "0";
                String str2 = "";
                String strOptString5 = null;
                switch (method.hashCode()) {
                    case -2135932853:
                        if (method.equals("setDialogBackBtn")) {
                            hul hulVar = this.f158879a;
                            if (hulVar != null) {
                                hulVar.mo17923g(m135819E(params));
                                Unit unit = Unit.INSTANCE;
                            }
                            return true;
                        }
                        break;
                    case -2097930575:
                        if (method.equals("getRebuildCacheCallbacks")) {
                            C3486c.m17566d(2, new RunnableC17498c(params));
                            return true;
                        }
                        break;
                    case -2075550316:
                        if (method.equals("closePopup")) {
                            flw uiCallback2 = getUiCallback();
                            if (uiCallback2 != null) {
                                uiCallback2.mo17966j();
                                Unit unit2 = Unit.INSTANCE;
                            }
                            return true;
                        }
                        break;
                    case -1668543181:
                        if (method.equals("setBackBtn")) {
                            hul hulVar2 = this.f158879a;
                            if (hulVar2 != null) {
                                hulVar2.mo17924h(m135819E(params));
                                Unit unit3 = Unit.INSTANCE;
                            }
                            return true;
                        }
                        break;
                    case -1263203643:
                        if (method.equals("openUrl")) {
                            if (params != null) {
                                Companion companion = INSTANCE;
                                Context contextM177460c = m177460c();
                                hul hulVar3 = this.f158879a;
                                hulVar3.getClass();
                                WebView view = hulVar3.getView();
                                view.getClass();
                                companion.m135823a(contextM177460c, view, getUiCallback(), params);
                                Unit unit4 = Unit.INSTANCE;
                            }
                            return true;
                        }
                        break;
                    case -1241591313:
                        if (method.equals(SchemeKey.goBack)) {
                            flw uiCallback3 = getUiCallback();
                            if (uiCallback3 != null) {
                                uiCallback3.mo18042p();
                                Unit unit5 = Unit.INSTANCE;
                            }
                            return true;
                        }
                        break;
                    case -1076310028:
                        if (method.equals("openLinkInExternalBrowser")) {
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(params != null ? params.optString("url") : null));
                            Context contextM177460c2 = m177460c();
                            if (contextM177460c2 != null) {
                                contextM177460c2.startActivity(intent);
                                Unit unit6 = Unit.INSTANCE;
                            }
                            return true;
                        }
                        break;
                    case -934641255:
                        if (method.equals("reload")) {
                            hul hulVar4 = this.f158879a;
                            if (hulVar4 != null) {
                                hulVar4.mo17912a();
                                Unit unit7 = Unit.INSTANCE;
                            }
                            return true;
                        }
                        break;
                    case -768716668:
                        if (method.equals("setCapture")) {
                            if (MKWebCaptureHelper.INSTANCE.m18227l()) {
                                m135805G(params);
                            } else {
                                if (params != null && (strOptString = params.optString("callback")) != null) {
                                    str2 = strOptString;
                                }
                                m177463g(str2, m135803C(1, "存储截图失败，截图开关未开启"));
                            }
                            return true;
                        }
                        break;
                    case -751701073:
                        if (method.equals("showVerticalScrollIndicator")) {
                            m177467k(namespace, method, params);
                            return true;
                        }
                        break;
                    case -725891351:
                        if (method.equals("setPulldown")) {
                            flw uiCallback4 = getUiCallback();
                            if (uiCallback4 != null) {
                                uiCallback4.mo18179w(0, (params != null ? params.optInt("type") : 0) == 1, null);
                                Unit unit8 = Unit.INSTANCE;
                            }
                            return true;
                        }
                        break;
                    case -552439141:
                        if (method.equals("clearPageCover")) {
                            m177467k(namespace, method, params);
                            return true;
                        }
                        break;
                    case -517576186:
                        if (method.equals("enableInputMenu")) {
                            m177467k(namespace, method, params);
                            return true;
                        }
                        break;
                    case -512828772:
                        if (method.equals("clickPanelOutsideFinish")) {
                            boolean zOptBoolean = params != null ? params.optBoolean("switch") : false;
                            hul hulVar5 = this.f158879a;
                            if (hulVar5 != null && (containerScaleView = hulVar5.getContainerScaleView()) != null) {
                                if (zOptBoolean) {
                                    containerScaleView.setOnClickListener(new ViewOnClickListenerC17499d(containerScaleView));
                                } else {
                                    containerScaleView.setOnClickListener(null);
                                }
                            }
                            return true;
                        }
                        break;
                    case -505026867:
                        if (method.equals("openGoto")) {
                            return true;
                        }
                        break;
                    case -465542620:
                        if (method.equals("postGlobalMessage")) {
                            m135808J(params);
                            return true;
                        }
                        break;
                    case -348232188:
                        if (method.equals("showKeyboard")) {
                            if (params != null ? params.optBoolean("focus") : false) {
                                Context contextM177460c3 = m177460c();
                                if (contextM177460c3 instanceof Activity) {
                                    Activity activity = (Activity) contextM177460c3;
                                    hul hulVar6 = this.f158879a;
                                    jkw.m145931d(activity, hulVar6 != null ? hulVar6.getView() : null);
                                }
                            } else {
                                Context contextM177460c4 = m177460c();
                                Object systemService = contextM177460c4 != null ? contextM177460c4.getSystemService("input_method") : null;
                                InputMethodManager inputMethodManager = (InputMethodManager) (systemService instanceof InputMethodManager ? systemService : null);
                                if (inputMethodManager != null) {
                                    inputMethodManager.toggleSoftInput(0, 2);
                                    Unit unit9 = Unit.INSTANCE;
                                }
                            }
                            return true;
                        }
                        break;
                    case -321860608:
                        if (method.equals("refreshEnd")) {
                            flw uiCallback5 = getUiCallback();
                            if (uiCallback5 != null) {
                                uiCallback5.mo18179w(2, true, null);
                                Unit unit10 = Unit.INSTANCE;
                            }
                            return true;
                        }
                        break;
                    case -231828991:
                        if (method.equals("loadingView")) {
                            x310.m209185c(this.taskTag, new RunnableC17500e(params));
                            return true;
                        }
                        break;
                    case -209608134:
                        if (method.equals("whiteScreenView")) {
                            x310.m209185c(this.taskTag, new RunnableC17501f(params));
                            return true;
                        }
                        break;
                    case 94756344:
                        if (method.equals("close")) {
                            flw uiCallback6 = getUiCallback();
                            if (uiCallback6 != null) {
                                uiCallback6.mo17970q(params);
                                Unit unit11 = Unit.INSTANCE;
                            }
                            return true;
                        }
                        break;
                    case 109327990:
                        if (method.equals("setUI")) {
                            ave0 ave0Var = new ave0();
                            JSONObject jSONObjectOptJSONObject = params != null ? params.optJSONObject("nav") : null;
                            ave0Var.m100458g(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optInt("mode", -1) : -1);
                            ave0Var.m100460i(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("color") : null);
                            ave0Var.m100459h(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString(OMSResourceType.background) : null);
                            JSONObject jSONObjectOptJSONObject2 = params != null ? params.optJSONObject("uiBtn") : null;
                            ave0Var.m100461j(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("color") : null);
                            JSONObject jSONObjectOptJSONObject3 = params != null ? params.optJSONObject("backBtn") : null;
                            ave0Var.m100457f(jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optString("color") : null);
                            flw uiCallback7 = getUiCallback();
                            if (uiCallback7 != null) {
                                uiCallback7.mo18041k(ave0Var);
                                Unit unit12 = Unit.INSTANCE;
                            }
                            return true;
                        }
                        break;
                    case 190444498:
                        if (method.equals("hideNavBar")) {
                            flw uiCallback8 = getUiCallback();
                            if (uiCallback8 != null) {
                                uiCallback8.mo18038e(false);
                                Unit unit13 = Unit.INSTANCE;
                            }
                            return true;
                        }
                        break;
                    case 219567526:
                        if (method.equals("setDOMCapture")) {
                            if (MKWebCaptureHelper.INSTANCE.m18227l()) {
                                hul hulVar7 = this.f158879a;
                                if (hulVar7 == null) {
                                    return true;
                                }
                                hulVar7.setWebViewPost(new RunnableC17497b(params));
                            } else {
                                if (params != null && (strOptString2 = params.optString("callback")) != null) {
                                    str2 = strOptString2;
                                }
                                m177463g(str2, m135803C(1, "存储截图失败，截图开关未开启"));
                            }
                            return true;
                        }
                        break;
                    case 347812635:
                        if (method.equals("deleteCapture")) {
                            MKWebCaptureHelper.Companion companion2 = MKWebCaptureHelper.INSTANCE;
                            if (params == null || (strOptString3 = params.optString("url", "")) == null) {
                                strOptString3 = "";
                            }
                            companion2.m18221f(strOptString3, params != null ? params.optInt("type", 0) : 0);
                            if (params == null || (strOptString4 = params.optString("callback")) == null) {
                                strOptString4 = "";
                            }
                            m177464h(strOptString4, "", "成功", "0");
                            return true;
                        }
                        break;
                    case 482202261:
                        if (method.equals("isMKResume")) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                hul hulVar8 = this.f158879a;
                                jSONObject.put("isResume", (hulVar8 == null || !hulVar8.isVisible()) ? "0" : "1");
                                if (!bjw.INSTANCE.m104782b()) {
                                    str = "1";
                                }
                                jSONObject.put("isForeground", str);
                                m177463g(m135819E(params), jSONObject.toString());
                                return true;
                            } catch (JSONException e) {
                                iig0.m140070a(e);
                                return false;
                            }
                        }
                        break;
                    case 605852917:
                        if (method.equals("setUIMenu")) {
                            if (params == null) {
                                Intrinsics.m88386m();
                            }
                            JSONArray jSONArrayOptJSONArray = params.optJSONArray(Constants.KEY_BUTTONS);
                            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                                zue0 zue0Var = new zue0();
                                zue0Var.m221640g(params.optString("title", "..."), "");
                                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                    zue0Var.m221634a(rkw.m181883a(jSONArrayOptJSONArray.getJSONObject(i2)));
                                }
                                flw uiCallback9 = getUiCallback();
                                if (uiCallback9 != null) {
                                    uiCallback9.mo18043r(zue0Var);
                                    Unit unit14 = Unit.INSTANCE;
                                }
                            }
                            return true;
                        }
                        break;
                    case 618498330:
                        if (method.equals("freeScrollbar")) {
                            m177467k(namespace, method, params);
                            return true;
                        }
                        break;
                    case 622491981:
                        if (method.equals("showNavBar")) {
                            flw uiCallback10 = getUiCallback();
                            if (uiCallback10 != null) {
                                uiCallback10.mo18038e(true);
                                Unit unit15 = Unit.INSTANCE;
                            }
                            return true;
                        }
                        break;
                    case 742313126:
                        if (method.equals("checkMK")) {
                            if (params != null) {
                                try {
                                    String strM130707d = glw.m130707d(params);
                                    if (i8g0.m139007i(strM130707d)) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("type", 1);
                                        m177463g(strM130707d, jSONObject2.toString());
                                    }
                                } catch (Exception e2) {
                                    jzv.m147730c("LogTag.MK.Bridge", "", e2);
                                }
                                break;
                            }
                            return true;
                        }
                        break;
                    case 881941347:
                        if (method.equals("clearNavigationBottomLineColor")) {
                            m177467k(namespace, method, params);
                            return true;
                        }
                        break;
                    case 1069382882:
                        if (method.equals("openLinkInNewWebView")) {
                            m177467k(namespace, method, params);
                            return true;
                        }
                        break;
                    case 1085444827:
                        if (method.equals(BLiveOperationActionAfterCountdown.refresh)) {
                            flw uiCallback11 = getUiCallback();
                            if (uiCallback11 != null) {
                                uiCallback11.mo18179w(1, true, MKWebView.m17814B0(params));
                                Unit unit16 = Unit.INSTANCE;
                            }
                            return true;
                        }
                        break;
                    case 1107833014:
                        if (method.equals("forbidLeftSlide")) {
                            hul hulVar9 = this.f158879a;
                            hulVar9.getClass();
                            Context webContext = hulVar9.getWebContext();
                            MKCommonWebPanelActivity mKCommonWebPanelActivity = (MKCommonWebPanelActivity) (webContext instanceof MKCommonWebPanelActivity ? webContext : null);
                            if (mKCommonWebPanelActivity != null) {
                                if (params != null && params.optInt("type") == 0) {
                                    z = true;
                                }
                                mKCommonWebPanelActivity.m18141j1(z);
                                Unit unit17 = Unit.INSTANCE;
                            }
                            return true;
                        }
                        break;
                    case 1339276547:
                        if (method.equals("showConfirm")) {
                            if (params != null) {
                                m135809K(params);
                                Unit unit18 = Unit.INSTANCE;
                            }
                            return true;
                        }
                        break;
                    case 1343084106:
                        if (method.equals("showMessage")) {
                            if (params != null) {
                                try {
                                    strOptString5 = params.optString("message");
                                    if (!TextUtils.isEmpty(strOptString5)) {
                                        t1j0.m188920p(strOptString5);
                                    }
                                } catch (Throwable th) {
                                    jzv.m147730c("mk bridge>", "", th);
                                }
                            } else if (!TextUtils.isEmpty(strOptString5)) {
                                t1j0.m188920p(strOptString5);
                            }
                        }
                        break;
                    case 1405006854:
                        if (method.equals("setUIBtn")) {
                            zue0 zue0Var2 = new zue0();
                            String strM17814B0 = MKWebView.m17814B0(params);
                            if (params == null || !params.has("title") || TextUtils.isEmpty(strM17814B0)) {
                                zue0Var2.m221639f(true);
                            } else {
                                zue0Var2.m221640g(params.getString("title"), strM17814B0);
                            }
                            flw uiCallback12 = getUiCallback();
                            if (uiCallback12 != null) {
                                uiCallback12.mo18043r(zue0Var2);
                                Unit unit19 = Unit.INSTANCE;
                            }
                            return true;
                        }
                        break;
                    case 1405084438:
                        if (method.equals("setTitle")) {
                            flw uiCallback13 = getUiCallback();
                            if (uiCallback13 != null) {
                                if (params == null) {
                                    Intrinsics.m88386m();
                                }
                                uiCallback13.mo18040g(params.getString("title"));
                                Unit unit20 = Unit.INSTANCE;
                            }
                            return true;
                        }
                        break;
                    case 1490029383:
                        if (method.equals("postMessage")) {
                            if (params != null) {
                                if (!TextUtils.isEmpty(params.optString("dst", null))) {
                                    m135810q(params);
                                    return true;
                                }
                                Intent intent2 = new Intent();
                                String strOptString6 = params.optString(AuthenticationTokenClaims.JSON_KEY_NAME);
                                intent2.putExtra("type", "bridgeMessage");
                                intent2.putExtra(Target.TYPE, params.optString(Target.TYPE));
                                intent2.putExtra(AuthenticationTokenClaims.JSON_KEY_NAME, strOptString6);
                                JSONObject jSONObjectOptJSONObject4 = params.optJSONObject("data");
                                if (jSONObjectOptJSONObject4 != null) {
                                    intent2.putExtra("data", jSONObjectOptJSONObject4.toString());
                                }
                                hul hulVar10 = this.f158879a;
                                hulVar10.getClass();
                                intent2.putExtra("origin", hulVar10.getWebViewUrl());
                                if (TextUtils.isEmpty(strOptString6)) {
                                    intent2.setAction("com.immomo.momo.mk.post_message");
                                } else {
                                    strOptString6.getClass();
                                    if (StringsKt.m94327c0(strOptString6, "bn:", 0, false, 6, null) >= 0) {
                                        intent2.setAction(strOptString6);
                                    } else {
                                        intent2.setAction("com.immomo.momo.mk.post_message");
                                    }
                                }
                                rf3.m181165c(m177460c(), intent2);
                            }
                            return true;
                        }
                        break;
                    case 1596418473:
                        if (method.equals("setUIGroup")) {
                            if (params != null && (uiCallback = getUiCallback()) != null) {
                                uiCallback.m126169o(params);
                                Unit unit21 = Unit.INSTANCE;
                            }
                            return true;
                        }
                        break;
                    case 1643584264:
                        if (method.equals("getVisibility")) {
                            hul hulVar11 = this.f158879a;
                            if (hulVar11 != null && hulVar11.isVisible()) {
                                i = 1;
                            }
                            m177463g(m135819E(params), qpl.m177459a(new String[]{NotificationCompat.CATEGORY_STATUS, "message"}, new String[]{String.valueOf(i), i == 1 ? "前台" : "后台"}).toString());
                            return true;
                        }
                        break;
                    case 1799873871:
                        if (method.equals("freezeScrollbar")) {
                            m177467k(namespace, method, params);
                            return true;
                        }
                        break;
                }
            }
            return super.mo18018p(namespace, method, params);
        }
        return false;
    }

    /* JADX INFO: renamed from: l.hm3$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0011\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012JG\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, m88121d2 = {"Ll/hm3$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "url", "Lorg/json/JSONObject;", "json", "Ll/flw;", "uiCallback", "", "b", "(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;Ll/flw;)V", "Landroid/webkit/WebView;", "mkWebview", "a", "(Landroid/content/Context;Landroid/webkit/WebView;Ll/flw;Lorg/json/JSONObject;)V", "", Target.TYPE, "c", "(Landroid/content/Context;Landroid/webkit/WebView;ILjava/lang/String;Lorg/json/JSONObject;Ll/flw;)V", "COLOR_WHITE", "Ljava/lang/String;", "DEFAULT_IMAGE_QUALITY", "I", "FAILED", "SUCCESS", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        private final void m135821b(Context context, String url, JSONObject json, flw uiCallback) {
            if (uiCallback == null || !uiCallback.mo17968m(url, json)) {
                MKWebCommonActivity.INSTANCE.m18152a(context, url);
            }
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m135822d(Companion companion, Context context, WebView webView, int i, String str, JSONObject jSONObject, flw flwVar, int i2, Object obj) {
            if ((i2 & 16) != 0) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObject2 = jSONObject;
            if ((i2 & 32) != 0) {
                flwVar = null;
            }
            companion.m135824c(context, webView, i, str, jSONObject2, flwVar);
        }

        /* JADX INFO: renamed from: a */
        public final void m135823a(@Nullable Context context, @NotNull WebView mkWebview, @Nullable flw uiCallback, @Nullable JSONObject json) {
            mkWebview.getClass();
            if (context == null || json == null) {
                return;
            }
            int iOptInt = json.optInt(Target.TYPE);
            String strOptString = json.optString("url");
            json.optString("ab");
            json.opt("param");
            m135824c(context, mkWebview, iOptInt, strOptString, json, uiCallback);
        }

        @JvmOverloads
        /* JADX INFO: renamed from: c */
        public final void m135824c(@NotNull Context context, @NotNull WebView mkWebview, int target, @Nullable String url, @NotNull JSONObject json, @Nullable flw uiCallback) {
            context.getClass();
            mkWebview.getClass();
            json.getClass();
            if (target == 0) {
                mkWebview.loadUrl(url);
                return;
            }
            if (target == 1) {
                m135821b(context, url, json, uiCallback);
                return;
            }
            if (target == 4) {
                Uri.Builder builderBuildUpon = Uri.parse(url).buildUpon();
                builderBuildUpon.appendQueryParameter("_ui_web_panel", "1");
                m135821b(context, builderBuildUpon.toString(), json, uiCallback);
            } else if (target != 5) {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
            } else {
                NormalWebViewActivity.Companion.m18197b(NormalWebViewActivity.INSTANCE, context, url, null, 4, null);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
