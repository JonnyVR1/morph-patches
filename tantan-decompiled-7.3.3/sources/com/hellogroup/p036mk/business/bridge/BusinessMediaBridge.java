package com.hellogroup.p036mk.business.bridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hellogroup.common.file.FileUtil;
import com.hellogroup.common.thread.C3486c;
import com.hellogroup.common.thread.MMDispatchers;
import com.hellogroup.p036mk.business.MKConfigSetter;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt__JobKt;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C0799b;
import p000.C0800c;
import p153l.alw;
import p153l.ckw;
import p153l.fkw;
import p153l.gkw;
import p153l.glw;
import p153l.hkw;
import p153l.hul;
import p153l.i8g0;
import p153l.ivl;
import p153l.jjw;
import p153l.jxl;
import p153l.jzv;
import p153l.l4k;
import p153l.ljw;
import p153l.o33;
import p153l.ojw;
import p153l.p7f;
import p153l.po5;
import p153l.qpl;
import p153l.t1j0;
import p153l.up9;
import p153l.vim;
import p153l.wkw;
import p153l.x310;
import p153l.xh3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 ]2\u00020\u0001:\u0001^B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001f\u0010\u0015J#\u0010\"\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b$\u0010\u0015J9\u0010(\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060&j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006`'2\b\u0010%\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b.\u0010\u0015J\u0019\u00100\u001a\u00020\u00112\b\u0010/\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b0\u0010\u0015J'\u00102\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00107\u001a\u0002062\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b7\u00108J'\u0010;\u001a\u0002062\u0006\u00105\u001a\u0002042\u0006\u00109\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\u0018H\u0002¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u0004\u0018\u0001062\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b=\u00108J\u001f\u0010?\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u00062\u0006\u0010>\u001a\u000206H\u0002¢\u0006\u0004\b?\u0010@J\u0019\u0010A\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bA\u0010\u0015J\u0019\u0010B\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bB\u0010\u0015J'\u0010F\u001a\u00020\u00112\u0006\u0010C\u001a\u00020\t2\u0006\u0010D\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u000bH\u0002¢\u0006\u0004\bF\u0010GJ\u0019\u0010H\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bH\u0010\u0015J\u0019\u0010I\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bI\u0010\u0015J\u0019\u0010J\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bJ\u0010\u0015R\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\bR\u0010PR\u0014\u0010T\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010PR\u0014\u0010V\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\bU\u0010.R\u0018\u0010X\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010WR\u0014\u0010\\\u001a\u00020Y8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[¨\u0006_"}, m88121d2 = {"Lcom/hellogroup/mk/business/bridge/BusinessMediaBridge;", "Ll/up9;", "Lcom/hellogroup/mk/business/base/ui/MKWebView;", "mkWebview", "<init>", "(Lcom/hellogroup/mk/business/base/ui/MKWebView;)V", "", "namespace", FirebaseAnalytics.Param.METHOD, "Lorg/json/JSONObject;", CommandMessage.PARAMS, "", "p", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Z", "mkCallback", NotificationCompat.CATEGORY_STATUS, "msg", "", "M", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "R", "(Lorg/json/JSONObject;)V", "L", "()Ljava/lang/String;", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "f", "(IILandroid/content/Intent;)Z", "P", "Ll/jjw;", "response", BloodType.f39576O, "(Lorg/json/JSONObject;Ll/jjw;)V", "Y", "uploadParams", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "J", "(Lorg/json/JSONObject;)Ljava/util/HashMap;", "suffix", "N", "(Ljava/lang/String;)Z", "imgDataJson", "I", "jsonObject", "U", "path", "F", "(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Landroid/view/View;", ResourceDirection.f39656v, "Landroid/graphics/Bitmap;", "D", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "w", "h", "E", "(Landroid/view/View;II)Landroid/graphics/Bitmap;", "H", "bitmap", p7f.LATITUDE_SOUTH, "(Ljava/lang/String;Landroid/graphics/Bitmap;)Z", p7f.GPS_DIRECTION_TRUE, "W", "json", "k", "b", "Q", "(Lorg/json/JSONObject;Ljava/lang/String;Z)V", "X", "K", p7f.GPS_MEASUREMENT_INTERRUPTED, "Ll/po5;", "c", "Ll/po5;", "job", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "IMG_REP_TYPE_BASE64", "e", "IMG_REP_TYPE_PATH", "IMG_REP_TYPE_MKFILE", "g", "REQUEST_CODE_ALBUM", "Lorg/json/JSONObject;", "imgReadRequestParams", "Lkotlin/coroutines/CoroutineContext;", "G", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Companion", "a", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class BusinessMediaBridge extends up9 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final po5 job;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String IMG_REP_TYPE_BASE64;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String IMG_REP_TYPE_PATH;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String IMG_REP_TYPE_MKFILE;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int REQUEST_CODE_ALBUM;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private JSONObject imgReadRequestParams;

    /* JADX INFO: renamed from: com.hellogroup.mk.business.bridge.BusinessMediaBridge$b */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"com/hellogroup/mk/business/bridge/BusinessMediaBridge$b", "Ll/vim;", "", "imageUrl", "Landroid/graphics/Bitmap;", "bmp", "", "a", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "onFailed", "(Ljava/lang/String;)V", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C3523b implements vim {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f12138b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f12139c;

        public C3523b(String str, String str2) {
            this.f12138b = str;
            this.f12139c = str2;
        }

        @Override // p153l.vim
        /* JADX INFO: renamed from: a */
        public void mo18019a(@NotNull String imageUrl, @NotNull Bitmap bmp) throws JSONException {
            imageUrl.getClass();
            bmp.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bmp.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cid", this.f12138b);
            jSONObject.put("data", strEncodeToString);
            BusinessMediaBridge.this.m177463g(this.f12139c, jSONObject.toString());
        }

        @Override // p153l.vim
        public void onFailed(@NotNull String imageUrl) throws JSONException {
            imageUrl.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cid", this.f12138b);
            jSONObject.put("data", "");
            BusinessMediaBridge.this.m177463g(this.f12139c, jSONObject.toString());
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.bridge.BusinessMediaBridge$c */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC3524c implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ JSONObject f12141b;

        public RunnableC3524c(JSONObject jSONObject) {
            this.f12141b = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                BusinessMediaBridge.this.m17990I(this.f12141b);
            } catch (JSONException e) {
                jzv.m147730c("MediaExtraBridge", "", e);
            }
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.bridge.BusinessMediaBridge$d */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC3525d implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ JSONObject f12143b;

        public RunnableC3525d(JSONObject jSONObject) {
            this.f12143b = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BusinessMediaBridge.this.m17999U(this.f12143b);
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.bridge.BusinessMediaBridge$e */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC3526e implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ JSONObject f12145b;

        public RunnableC3526e(JSONObject jSONObject) {
            this.f12145b = jSONObject;
        }

        /* JADX WARN: Code duplicated, block: B:50:0x00c5 A[Catch: Exception -> 0x00c3, TryCatch #0 {Exception -> 0x00c3, blocks: (B:45:0x00b2, B:51:0x00c9, B:53:0x00d0, B:54:0x00d4, B:56:0x00dc, B:58:0x00e6, B:55:0x00d7, B:50:0x00c5), top: B:63:0x00b2 }] */
        /* JADX WARN: Code duplicated, block: B:53:0x00d0 A[Catch: Exception -> 0x00c3, TryCatch #0 {Exception -> 0x00c3, blocks: (B:45:0x00b2, B:51:0x00c9, B:53:0x00d0, B:54:0x00d4, B:56:0x00dc, B:58:0x00e6, B:55:0x00d7, B:50:0x00c5), top: B:63:0x00b2 }] */
        /* JADX WARN: Code duplicated, block: B:55:0x00d7 A[Catch: Exception -> 0x00c3, TryCatch #0 {Exception -> 0x00c3, blocks: (B:45:0x00b2, B:51:0x00c9, B:53:0x00d0, B:54:0x00d4, B:56:0x00dc, B:58:0x00e6, B:55:0x00d7, B:50:0x00c5), top: B:63:0x00b2 }] */
        /* JADX WARN: Code duplicated, block: B:58:0x00e6 A[Catch: Exception -> 0x00c3, TRY_LEAVE, TryCatch #0 {Exception -> 0x00c3, blocks: (B:45:0x00b2, B:51:0x00c9, B:53:0x00d0, B:54:0x00d4, B:56:0x00dc, B:58:0x00e6, B:55:0x00d7, B:50:0x00c5), top: B:63:0x00b2 }] */
        @Override // java.lang.Runnable
        public final void run() {
            List listSplit$default;
            Object obj;
            File cacheDir;
            JSONObject jSONObject = this.f12145b;
            String strOptString = jSONObject != null ? jSONObject.optString("callback") : null;
            JSONObject jSONObject2 = this.f12145b;
            String strOptString2 = jSONObject2 != null ? jSONObject2.optString("data") : null;
            JSONObject jSONObject3 = this.f12145b;
            String strOptString3 = jSONObject3 != null ? jSONObject3.optString("suffix") : null;
            boolean zIsEmpty = TextUtils.isEmpty(strOptString2);
            BusinessMediaBridge businessMediaBridge = BusinessMediaBridge.this;
            if (zIsEmpty) {
                businessMediaBridge.m177464h(strOptString, "", "文件数据为空", "1");
                return;
            }
            Context contextM177460c = businessMediaBridge.m177460c();
            String absolutePath = (contextM177460c == null || (cacheDir = contextM177460c.getCacheDir()) == null) ? null : cacheDir.getAbsolutePath();
            BusinessMediaBridge businessMediaBridge2 = BusinessMediaBridge.this;
            if (absolutePath == null) {
                businessMediaBridge2.m177464h(strOptString, "", "保存文件失败", "1");
                return;
            }
            if (businessMediaBridge2.m17993N(strOptString3 != null ? strOptString3 : "")) {
                strOptString3 = Intrinsics.m88385l(strOptString3, "_");
            }
            if (!TextUtils.isEmpty(strOptString3) && strOptString3 != null && !C15493d.m94374J(strOptString3, ".", false, 2, null)) {
                strOptString3 = ".".concat(strOptString3);
            }
            String str = String.valueOf(System.currentTimeMillis()) + strOptString3;
            File file = new File(absolutePath.concat("/mkimg"));
            if (!file.exists()) {
                file.mkdir();
            }
            File file2 = new File(absolutePath.concat("/mkimg"), str);
            if (strOptString2 != null) {
                try {
                    listSplit$default = StringsKt.split$default(strOptString2, new String[]{Constants.SEPARATOR_COMMA}, false, 0, 6, null);
                    if (listSplit$default == null) {
                        listSplit$default = CollectionsKt.emptyList();
                    }
                    if (listSplit$default.size() > 1) {
                        obj = listSplit$default.get(1);
                    } else {
                        obj = listSplit$default.get(0);
                    }
                    if (FileUtil.m17541y(Base64.decode((String) obj, 0), file2)) {
                        String string = glw.m130705b(new String[]{"path"}, new String[]{file2.getAbsolutePath()}).toString();
                        string.getClass();
                        BusinessMediaBridge.this.m177464h(strOptString, string, "成功", "0");
                        return;
                    }
                } catch (Exception e) {
                    jzv.m147730c(qpl.f158878b, "", e);
                }
            } else {
                listSplit$default = CollectionsKt.emptyList();
                if (listSplit$default.size() > 1) {
                    obj = listSplit$default.get(1);
                } else {
                    obj = listSplit$default.get(0);
                }
                if (FileUtil.m17541y(Base64.decode((String) obj, 0), file2)) {
                    String string2 = glw.m130705b(new String[]{"path"}, new String[]{file2.getAbsolutePath()}).toString();
                    string2.getClass();
                    BusinessMediaBridge.this.m177464h(strOptString, string2, "成功", "0");
                    return;
                }
            }
            BusinessMediaBridge.this.m177464h(strOptString, "", "保存文件失败", "1");
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.bridge.BusinessMediaBridge$f */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC3527f implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ JSONObject f12147b;

        public RunnableC3527f(JSONObject jSONObject) {
            this.f12147b = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            JSONObject jSONObjectOptJSONObject;
            Context contextM177460c = BusinessMediaBridge.this.m177460c();
            if (contextM177460c != null) {
                JSONObject jSONObject = this.f12147b;
                String strOptString = jSONObject != null ? jSONObject.optString("callback") : null;
                JSONObject jSONObject2 = this.f12147b;
                if (jSONObject2 == null || (jSONObjectOptJSONObject = jSONObject2.optJSONObject("data")) == null) {
                    return;
                }
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                JSONObject jSONObject3 = new JSONObject();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString2 = jSONObjectOptJSONObject.optString(next);
                    if (TextUtils.isEmpty(strOptString2)) {
                        BusinessMediaBridge businessMediaBridge = BusinessMediaBridge.this;
                        next.getClass();
                        businessMediaBridge.m17996Q(jSONObject3, next, false);
                    } else {
                        if (wkw.m206875k(strOptString2 != null ? strOptString2 : "")) {
                            strOptString2 = wkw.m206866b(strOptString2);
                        }
                        File file = new File(strOptString2 != null ? strOptString2 : "");
                        if (!file.exists() || file.length() <= 0) {
                            BusinessMediaBridge businessMediaBridge2 = BusinessMediaBridge.this;
                            next.getClass();
                            businessMediaBridge2.m17996Q(jSONObject3, next, false);
                        } else {
                            FileUtil.m17526j(contextM177460c, file, file.getName());
                            BusinessMediaBridge businessMediaBridge3 = BusinessMediaBridge.this;
                            next.getClass();
                            businessMediaBridge3.m17996Q(jSONObject3, next, true);
                        }
                    }
                }
                BusinessMediaBridge.this.m177463g(strOptString, jSONObject3.toString());
            }
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.bridge.BusinessMediaBridge$g */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC3528g implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ JSONObject f12149b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Bitmap f12150c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Context f12151d;

        public RunnableC3528g(JSONObject jSONObject, Bitmap bitmap, Context context) {
            this.f12149b = jSONObject;
            this.f12150c = bitmap;
            this.f12151d = context;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            JSONObject jSONObject = this.f12149b;
            boolean z = jSONObject != null && jSONObject.optInt("isLocal") == 1;
            JSONObject jSONObject2 = this.f12149b;
            String strOptString = jSONObject2 != null ? jSONObject2.optString("callback") : null;
            Bitmap bitmap = this.f12150c;
            if (bitmap == null || bitmap.isRecycled()) {
                BusinessMediaBridge businessMediaBridge = BusinessMediaBridge.this;
                businessMediaBridge.m177463g(strOptString, businessMediaBridge.m17987F(1, "截图失败", ""));
                return;
            }
            File fileM110401j = ckw.m110401j();
            if (fileM110401j == null) {
                BusinessMediaBridge businessMediaBridge2 = BusinessMediaBridge.this;
                businessMediaBridge2.m177463g(strOptString, businessMediaBridge2.m17987F(1, "存储截图失败", ""));
                return;
            }
            String str = String.valueOf(System.currentTimeMillis()) + ".jpg_";
            File file = new File(fileM110401j, str);
            String absolutePath = file.getAbsolutePath();
            BusinessMediaBridge businessMediaBridge3 = BusinessMediaBridge.this;
            absolutePath.getClass();
            if (businessMediaBridge3.m17997S(absolutePath, this.f12150c)) {
                if (z) {
                    FileUtil.m17526j(this.f12151d, file, str.substring(0, str.length() - 1));
                }
                BusinessMediaBridge businessMediaBridge4 = BusinessMediaBridge.this;
                String strM206869e = wkw.m206869e(absolutePath);
                businessMediaBridge4.m177463g(strOptString, businessMediaBridge4.m17987F(0, "成功", strM206869e != null ? strM206869e : ""));
            } else {
                BusinessMediaBridge businessMediaBridge5 = BusinessMediaBridge.this;
                businessMediaBridge5.m177463g(strOptString, businessMediaBridge5.m17987F(1, "存储截图失败", ""));
            }
            if (this.f12150c.isRecycled()) {
                return;
            }
            this.f12150c.recycle();
            ((qpl) BusinessMediaBridge.this).f158879a.setWebDrawingCacheEnabled(false);
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.bridge.BusinessMediaBridge$h */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC3529h implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ JSONObject f12153b;

        public RunnableC3529h(JSONObject jSONObject) {
            this.f12153b = jSONObject;
        }

        /* JADX WARN: Code duplicated, block: B:80:0x0144  */
        @Override // java.lang.Runnable
        public final void run() {
            String strOptString;
            String strOptString2;
            String str;
            if (((qpl) BusinessMediaBridge.this).f158879a == null || BusinessMediaBridge.this.m177460c() == null) {
                return;
            }
            JSONObject jSONObject = this.f12153b;
            String strOptString3 = jSONObject != null ? jSONObject.optString("url") : null;
            JSONObject jSONObject2 = this.f12153b;
            if (jSONObject2 == null || (strOptString = jSONObject2.optString("callback")) == null) {
                strOptString = "";
            }
            JSONObject jSONObject3 = this.f12153b;
            JSONArray jSONArrayOptJSONArray = jSONObject3 != null ? jSONObject3.optJSONArray("files") : null;
            JSONObject jSONObject4 = this.f12153b;
            JSONObject jSONObjectOptJSONObject = jSONObject4 != null ? jSONObject4.optJSONObject("param") : null;
            JSONObject jSONObject5 = this.f12153b;
            if (jSONObject5 == null || (strOptString2 = jSONObject5.optString("fileName")) == null) {
                strOptString2 = "";
            }
            if (TextUtils.isEmpty(strOptString3) || jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                BusinessMediaBridge.this.m177464h(strOptString, null, "参数错误", "1");
                return;
            }
            String strM154581a = ljw.INSTANCE.m154581a(strOptString3);
            int length = jSONArrayOptJSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                String strOptString4 = jSONArrayOptJSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString4)) {
                    strOptString4.getClass();
                    if (wkw.m206875k(strOptString4)) {
                        strOptString4 = wkw.m206866b(strOptString4);
                    }
                    File file = new File(strOptString4);
                    if (file.exists() && file.length() > 0) {
                        arrayList.add(file);
                    }
                }
            }
            int size = arrayList.size();
            Object[] array = arrayList.toArray(new File[size]);
            array.getClass();
            File[] fileArr = (File[]) array;
            String[] strArr = new String[size];
            if (size == 1) {
                strArr[0] = strOptString2;
            } else {
                for (int i2 = 0; i2 < size; i2++) {
                    strArr[i2] = strOptString2 + i2;
                }
            }
            HashMap map = new HashMap();
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObjectOptJSONObject.opt(next);
                    if (objOpt != null) {
                        next.getClass();
                        map.put(next, objOpt.toString());
                    }
                }
            }
            if (map.get("uuid") != null) {
                String string = UUID.randomUUID().toString();
                string.getClass();
                map.put("uuid", string);
            }
            ivl ivlVarM130602a = gkw.m130601b().m130602a();
            try {
                ojw ojwVarM17763b = MKConfigSetter.INSTANCE.m17763b();
                if (ojwVarM17763b == null) {
                    str = strM154581a;
                } else {
                    hul hulVar = ((qpl) BusinessMediaBridge.this).f158879a;
                    String strMo167945d = ojwVarM17763b.mo167945d(strM154581a, hulVar != null ? hulVar.getOriginURL() : null);
                    if (strMo167945d != null) {
                        str = strMo167945d;
                    } else {
                        str = strM154581a;
                    }
                }
                BusinessMediaBridge.this.m177464h(strOptString, ivlVarM130602a.mo115346b(str, map, fileArr, strArr, null), "成功", "0");
            } catch (Exception e) {
                jzv.m147730c("MediaExtraBridge", "", e);
                BusinessMediaBridge businessMediaBridge = BusinessMediaBridge.this;
                String message = e.getMessage();
                businessMediaBridge.m177464h(strOptString, null, message != null ? message : "", "1");
            }
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.bridge.BusinessMediaBridge$i */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC3530i implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ JSONObject f12155b;

        public RunnableC3530i(JSONObject jSONObject) {
            this.f12155b = jSONObject;
        }

        /* JADX WARN: Code duplicated, block: B:61:0x0108  */
        @Override // java.lang.Runnable
        public final void run() {
            String strOptString;
            String str;
            if (((qpl) BusinessMediaBridge.this).f158879a == null || BusinessMediaBridge.this.m177460c() == null) {
                return;
            }
            JSONObject jSONObject = this.f12155b;
            String strOptString2 = jSONObject != null ? jSONObject.optString("url") : null;
            JSONObject jSONObject2 = this.f12155b;
            if (jSONObject2 == null || (strOptString = jSONObject2.optString("callback")) == null) {
                strOptString = "";
            }
            JSONObject jSONObject3 = this.f12155b;
            JSONObject jSONObjectOptJSONObject = jSONObject3 != null ? jSONObject3.optJSONObject("files") : null;
            if (TextUtils.isEmpty(strOptString2) || jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() <= 0) {
                BusinessMediaBridge.this.m177464h(strOptString, null, "参数错误", "1");
                return;
            }
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            File[] fileArr = new File[jSONObjectOptJSONObject.length()];
            String[] strArr = new String[jSONObjectOptJSONObject.length()];
            int i = 0;
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString3 = jSONObjectOptJSONObject.optString(next, "");
                strOptString3.getClass();
                if (wkw.m206875k(strOptString3)) {
                    strOptString3 = wkw.m206866b(strOptString3);
                }
                File file = new File(strOptString3);
                if (!file.exists()) {
                    BusinessMediaBridge.this.m177464h(strOptString, null, "文件不存在", "1");
                    return;
                } else {
                    strArr[i] = next;
                    fileArr[i] = file;
                    i++;
                }
            }
            JSONObject jSONObjectOptJSONObject2 = this.f12155b.optJSONObject(CommandMessage.PARAMS);
            HashMap map = new HashMap();
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    String strOptString4 = jSONObjectOptJSONObject2.optString(next2);
                    next2.getClass();
                    strOptString4.getClass();
                    map.put(next2, strOptString4);
                }
            }
            if (map.get("uuid") != null) {
                String string = UUID.randomUUID().toString();
                string.getClass();
                map.put("uuid", string);
            }
            ivl ivlVarM130602a = gkw.m130601b().m130602a();
            try {
                ojw ojwVarM17763b = MKConfigSetter.INSTANCE.m17763b();
                if (ojwVarM17763b == null) {
                    str = strOptString2;
                } else {
                    hul hulVar = ((qpl) BusinessMediaBridge.this).f158879a;
                    String strMo167945d = ojwVarM17763b.mo167945d(strOptString2, hulVar != null ? hulVar.getOriginURL() : null);
                    if (strMo167945d != null) {
                        str = strMo167945d;
                    } else {
                        str = strOptString2;
                    }
                }
                BusinessMediaBridge.this.m177466j(strOptString, new JSONObject(ivlVarM130602a.mo115346b(str, map, fileArr, strArr, null)), "成功", 0);
            } catch (Exception e) {
                jzv.m147730c("MediaExtraBridge", "", e);
                BusinessMediaBridge.this.m177466j(strOptString, null, "失败", 1);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessMediaBridge(@NotNull MKWebView mKWebView) {
        super(mKWebView);
        mKWebView.getClass();
        this.job = JobKt__JobKt.m94507b(null, 1, null);
        this.IMG_REP_TYPE_BASE64 = "base64";
        this.IMG_REP_TYPE_PATH = "file";
        this.IMG_REP_TYPE_MKFILE = "mkfile";
        this.REQUEST_CODE_ALBUM = 1001;
    }

    /* JADX INFO: renamed from: D */
    private final Bitmap m17985D(View v2) {
        return m17986E(v2, v2.getWidth(), v2.getHeight());
    }

    /* JADX INFO: renamed from: E */
    private final Bitmap m17986E(View v2, int w, int h) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        v2.draw(canvas);
        canvas.setBitmap(null);
        bitmapCreateBitmap.getClass();
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final String m17987F(int status, String msg, String path) {
        String string = qpl.m177459a(new String[]{NotificationCompat.CATEGORY_STATUS, "message", "image"}, new String[]{String.valueOf(status), msg, path}).toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: G */
    private final CoroutineContext m17988G() {
        return MMDispatchers.INSTANCE.m17548b().plus(this.job);
    }

    /* JADX INFO: renamed from: H */
    private final Bitmap m17989H(View v2) {
        v2.setDrawingCacheEnabled(true);
        return v2.getDrawingCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final void m17990I(JSONObject imgDataJson) {
        String strOptString;
        String strOptString2 = imgDataJson != null ? imgDataJson.optString("cid") : null;
        String strOptString3 = imgDataJson != null ? imgDataJson.optString("url") : null;
        if (imgDataJson == null || (strOptString = imgDataJson.optString("path")) == null) {
            strOptString = "";
        }
        int iOptInt = imgDataJson != null ? imgDataJson.optInt("compressWidth") : 0;
        int iOptInt2 = imgDataJson != null ? imgDataJson.optInt("compressHeight") : 0;
        String strOptString4 = imgDataJson != null ? imgDataJson.optString("callback") : null;
        if (!i8g0.m139001c(strOptString3) || i8g0.m139001c(strOptString) || iOptInt <= 0 || iOptInt2 <= 0) {
            hkw.m135646a().m135649d(strOptString3, new C3523b(strOptString2, strOptString4));
            return;
        }
        try {
            if (wkw.m206875k(strOptString)) {
                String strM206866b = wkw.m206866b(strOptString);
                strOptString = strM206866b != null ? strM206866b : "";
            }
            Bitmap bitmapM165841a = o33.INSTANCE.m165841a(strOptString, iOptInt, iOptInt2);
            if (bitmapM165841a == null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cid", strOptString2);
                jSONObject.put("data", "");
                m177463g(strOptString4, jSONObject.toString());
                return;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapM165841a.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("cid", strOptString2);
            jSONObject2.put("data", strEncodeToString);
            m177463g(strOptString4, jSONObject2.toString());
        } catch (Exception e) {
            jzv.m147730c("MediaExtraBridge", "", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public final HashMap<String, String> m17991J(JSONObject uploadParams) {
        HashMap<String, String> map = new HashMap<>();
        if (uploadParams != null) {
            try {
                Iterator<String> itKeys = uploadParams.keys();
                itKeys.getClass();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = uploadParams.opt(next);
                    if (objOpt != null) {
                        map.put(next, objOpt.toString());
                    }
                }
            } catch (Throwable th) {
                jzv.m147730c("MediaExtraBridge", "", th);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: K */
    private final void m17992K(JSONObject params) {
        String strOptString;
        JSONArray jSONArrayOptJSONArray;
        if (params == null || (strOptString = params.optString("callback")) == null) {
            strOptString = "";
        }
        if (params != null) {
            try {
                jSONArrayOptJSONArray = params.optJSONArray("urls");
            } catch (Throwable th) {
                jzv.m147730c("MediaExtraBridge", "", th);
                JSONArray jSONArray = new JSONArray();
                String message = th.getMessage();
                m177465i(strOptString, jSONArray, message != null ? message : "", -1);
                return;
            }
        } else {
            jSONArrayOptJSONArray = null;
        }
        JSONArray jSONArray2 = new JSONArray();
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                String strOptString2 = jSONArrayOptJSONArray.optString(i);
                if (i8g0.m139002d(strOptString2)) {
                    String strM126059e = fkw.m126059e(strOptString2);
                    if (i8g0.m139002d(strM126059e)) {
                        jSONArray2.put(strM126059e);
                    }
                }
            }
        }
        m177465i(strOptString, jSONArray2, "", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public final boolean m17993N(String suffix) {
        return C15493d.m94381x("png", suffix, true) || C15493d.m94381x("jpg", suffix, true) || C15493d.m94381x("jpeg", suffix, true) || C15493d.m94381x("bmp", suffix, true);
    }

    /* JADX INFO: renamed from: O */
    private final void m17994O(JSONObject params, jjw response) {
        xh3.m210980d(l4k.INSTANCE, m17988G(), null, new BusinessMediaBridge$onSelectSuccess$1(this, params, response, null), 2, null);
    }

    /* JADX INFO: renamed from: P */
    private final void m17995P(JSONObject params) {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        Context contextM177460c = m177460c();
        if (!(contextM177460c instanceof Activity)) {
            contextM177460c = null;
        }
        Activity activity = (Activity) contextM177460c;
        if (activity != null) {
            activity.startActivityForResult(intent, this.REQUEST_CODE_ALBUM);
        }
        this.imgReadRequestParams = params;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public final void m17996Q(JSONObject json, String k, boolean b) {
        try {
            json.putOpt(k, Integer.valueOf(!b ? 1 : 0));
        } catch (JSONException e) {
            jzv.m147730c("MediaExtraBridge", "", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public final boolean m17997S(String path, Bitmap bitmap) throws Throwable {
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
                        jzv.m147730c("MediaExtraBridge", "", e);
                        return true;
                    }
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    jzv.m147730c("MediaExtraBridge", "", e);
                    if (fileOutputStream == null) {
                        return false;
                    }
                    try {
                        fileOutputStream.close();
                        return false;
                    } catch (IOException e3) {
                        jzv.m147730c("MediaExtraBridge", "", e3);
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            jzv.m147730c("MediaExtraBridge", "", e4);
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

    /* JADX INFO: renamed from: T */
    private final void m17998T(JSONObject params) {
        if (m177460c() != null) {
            C3486c.m17566d(2, new RunnableC3527f(params));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public final void m17999U(JSONObject jsonObject) {
        Bitmap bitmapM17989H;
        Context contextM177460c = m177460c();
        if (contextM177460c != null) {
            Integer numValueOf = jsonObject != null ? Integer.valueOf(jsonObject.optInt("type", 1)) : null;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                hul hulVar = this.f158879a;
                hulVar.getClass();
                ViewParent webViewParent = hulVar.getWebViewParent();
                webViewParent.getClass();
                Object parent = webViewParent.getParent();
                if (parent == null) {
                    C0799b.m4641a("null cannot be cast to non-null type android.view.View");
                    return;
                }
                bitmapM17989H = m17985D((View) parent);
            } else {
                WebView view = this.f158879a.getView();
                view.getClass();
                bitmapM17989H = m17989H(view);
            }
            C3486c.m17566d(2, new RunnableC3528g(jsonObject, bitmapM17989H, contextM177460c));
        }
    }

    /* JADX INFO: renamed from: V */
    private final void m18000V(JSONObject params) {
        String strOptString;
        if (params == null || (strOptString = params.optString("track")) == null) {
            strOptString = "";
        }
        if (params != null) {
            params.optInt("seek_to");
        }
        if (i8g0.m139001c(strOptString) || m177460c() == null) {
            return;
        }
        try {
            if (wkw.m206875k(strOptString)) {
                String strM206866b = wkw.m206866b(strOptString);
                strOptString = strM206866b != null ? strM206866b : "";
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(strOptString));
                intent.setType(DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4);
                m177460c().startActivity(intent);
            } catch (Exception unused) {
                t1j0.m188917m("你的手机未安装播放器");
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: W */
    private final void m18001W(JSONObject params) {
        C3486c.m17566d(2, new RunnableC3529h(params));
    }

    /* JADX INFO: renamed from: X */
    private final void m18002X(JSONObject params) {
        C3486c.m17566d(2, new RunnableC3530i(params));
    }

    /* JADX INFO: renamed from: Y */
    private final void m18003Y(JSONObject params) {
        xh3.m210980d(l4k.INSTANCE, m17988G(), null, new BusinessMediaBridge$uploadImages$1(this, params, null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public String m18014L() {
        String strM17764c = MKConfigSetter.INSTANCE.m17764c();
        return strM17764c != null ? strM17764c : "";
    }

    /* JADX INFO: renamed from: M */
    public final void m18015M(@Nullable String mkCallback, @Nullable String status, @Nullable String msg) {
        String[] strArr = {NotificationCompat.CATEGORY_STATUS, "message"};
        if (status == null) {
            status = "";
        }
        if (msg == null) {
            msg = "";
        }
        String string = glw.m130705b(strArr, new String[]{status, msg}).toString();
        string.getClass();
        m177463g(mkCallback, string);
    }

    /* JADX INFO: renamed from: R */
    public void m18016R(@Nullable JSONObject params) {
        C3486c.m17566d(2, new RunnableC3526e(params));
    }

    @Override // p153l.qpl
    /* JADX INFO: renamed from: f */
    public boolean mo18017f(int requestCode, int resultCode, @Nullable Intent data) throws JSONException {
        Uri data2;
        Object objM225066constructorimpl;
        JSONObject jSONObject;
        if (resultCode == -1 && requestCode == this.REQUEST_CODE_ALBUM && data != null && (data2 = data.getData()) != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                String strM4648b = C0800c.INSTANCE.m4648b(m177460c(), data2);
                if (strM4648b != null) {
                    jzv.m147732e("MediaExtraBridge", strM4648b);
                }
                JSONObject jSONObject2 = this.imgReadRequestParams;
                Unit unit = null;
                if (jSONObject2 != null) {
                    jjw jjwVar = new jjw(null, 1, null);
                    jjwVar.getResponse().put("mediaPaths", new JSONArray().put(strM4648b));
                    m17994O(jSONObject2, jjwVar);
                    unit = Unit.INSTANCE;
                }
                objM225066constructorimpl = Result.m225066constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
            }
            if (Result.m225069exceptionOrNullimpl(objM225066constructorimpl) != null && (jSONObject = this.imgReadRequestParams) != null) {
                String strOptString = jSONObject.optString("callback");
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(NotificationCompat.CATEGORY_STATUS, -1);
                jSONObject3.put("message", "please check local file permission");
                jSONObject3.put("images", new JSONArray());
                m177463g(strOptString, jSONObject3.toString());
            }
        }
        return super.mo18017f(requestCode, resultCode, data);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p153l.qpl
    /* JADX INFO: renamed from: p */
    public boolean mo18018p(@Nullable String namespace, @Nullable String method, @Nullable JSONObject params) {
        if (Intrinsics.m88377d("media", namespace)) {
            jxl jxlVarM98733b = alw.m98733b(namespace, method);
            if (method != null) {
                switch (method.hashCode()) {
                    case -2142325601:
                        if (method.equals("saveImagesToAlbum")) {
                            m17998T(params);
                        }
                        break;
                    case -1997859423:
                        if (method.equals("shotVideo") && jxlVarM98733b != null) {
                            xh3.m210980d(l4k.INSTANCE, MMDispatchers.INSTANCE.m17547a(), null, new BusinessMediaBridge$runCommand$3(this, jxlVarM98733b, params, null), 2, null);
                            return true;
                        }
                        break;
                    case -1981335591:
                        if (method.equals("uploadImages")) {
                            m18003Y(params);
                            return true;
                        }
                        break;
                    case -1581789895:
                        if (method.equals("startVideo")) {
                            m18000V(params);
                            return true;
                        }
                        break;
                    case -1077213121:
                        if (method.equals("getMKFileUrl")) {
                            m17992K(params);
                            return true;
                        }
                        break;
                    case -888252177:
                        if (method.equals("getImageData")) {
                            x310.m209186d(new RunnableC3524c(params));
                            return true;
                        }
                        break;
                    case -793460818:
                        if (method.equals("readImages")) {
                            if (jxlVarM98733b != null) {
                                xh3.m210980d(l4k.INSTANCE, MMDispatchers.INSTANCE.m17547a(), null, new BusinessMediaBridge$runCommand$2(this, jxlVarM98733b, params, null), 2, null);
                                return true;
                            }
                            m17995P(params);
                            return true;
                        }
                        break;
                    case -417400442:
                        if (method.equals("screenShot")) {
                            hul hulVar = this.f158879a;
                            if (hulVar == null) {
                                return true;
                            }
                            hulVar.setWebViewPost(new RunnableC3525d(params));
                            return true;
                        }
                        break;
                    case -243495139:
                        if (method.equals("uploadFile")) {
                            m18001W(params);
                            return true;
                        }
                        break;
                    case 344836898:
                        if (method.equals("customRecord")) {
                            if (jxlVarM98733b != null) {
                                xh3.m210980d(l4k.INSTANCE, MMDispatchers.INSTANCE.m17547a(), null, new BusinessMediaBridge$runCommand$1(this, jxlVarM98733b, params, null), 2, null);
                            }
                            return true;
                        }
                        break;
                    case 828468424:
                        if (method.equals("saveBase64File")) {
                            m18016R(params);
                            return true;
                        }
                        break;
                    case 1041585398:
                        if (method.equals("uploadFiles")) {
                            m18002X(params);
                            return true;
                        }
                        break;
                }
            }
        }
        return false;
    }
}
