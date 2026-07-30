package com.hellogroup.p036mk.business.bridge;

import android.graphics.Bitmap;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.bumptech.glide.ComponentCallbacks2C1057a;
import com.p051p1.mobile.putong.data.User;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p153l.d4e;
import p153l.drb;
import p153l.jjw;
import p153l.jzv;
import p153l.qpl;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.hellogroup.mk.business.bridge.BusinessMediaBridge$onSelectSuccess$1", m88263f = "BusinessMediaBridge.kt", m88264l = {}, m88265m = "invokeSuspend")
public final class BusinessMediaBridge$onSelectSuccess$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ JSONObject $params;
    final /* synthetic */ jjw $response;
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f12156p$;
    final /* synthetic */ BusinessMediaBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessMediaBridge$onSelectSuccess$1(BusinessMediaBridge businessMediaBridge, JSONObject jSONObject, jjw jjwVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = businessMediaBridge;
        this.$params = jSONObject;
        this.$response = jjwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        BusinessMediaBridge$onSelectSuccess$1 businessMediaBridge$onSelectSuccess$1 = new BusinessMediaBridge$onSelectSuccess$1(this.this$0, this.$params, this.$response, continuation);
        businessMediaBridge$onSelectSuccess$1.f12156p$ = (drb) obj;
        return businessMediaBridge$onSelectSuccess$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((BusinessMediaBridge$onSelectSuccess$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        String str;
        ByteArrayOutputStream byteArrayOutputStream;
        String str2;
        Bitmap bitmap;
        JSONObject response;
        JSONArray jSONArrayOptJSONArray;
        uyp.m198688e();
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        JSONObject jSONObject = this.$params;
        String strOptString = jSONObject != null ? jSONObject.optString("callback") : null;
        JSONObject jSONObject2 = this.$params;
        String strOptString2 = jSONObject2 != null ? jSONObject2.optString("type", this.this$0.IMG_REP_TYPE_BASE64) : null;
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(NotificationCompat.CATEGORY_STATUS, 0);
            JSONArray jSONArray = new JSONArray();
            ArrayList<File> arrayList2 = new ArrayList();
            jjw jjwVar = this.$response;
            if (jjwVar != null && (response = jjwVar.getResponse()) != null && (jSONArrayOptJSONArray = response.optJSONArray("mediaPaths")) != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String strOptString3 = jSONArrayOptJSONArray.optString(i);
                    strOptString3.getClass();
                    arrayList.add(strOptString3);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File file = new File((String) it.next());
                arrayList2.add(file);
                jzv.m147732e("MediaExtraBridge", "      path=" + file.getAbsolutePath() + "      size=" + file.length());
            }
            jzv.m147729b("OnActivityResult ", arrayList.toString());
            for (File file2 : arrayList2) {
                StringBuilder sb = new StringBuilder();
                sb.append("      path=");
                sb.append(file2.getAbsolutePath());
                sb.append("      size=");
                str = strOptString;
                try {
                    sb.append(file2.length());
                    jzv.m147732e("MediaExtraBridge", sb.toString());
                    String absolutePath = file2.getAbsolutePath();
                    if (Intrinsics.m88377d(strOptString2, this.this$0.IMG_REP_TYPE_PATH)) {
                        jSONArray.put(new JSONObject().put("data", absolutePath).put("path", absolutePath));
                        str2 = strOptString2;
                    } else if (Intrinsics.m88377d(strOptString2, this.this$0.IMG_REP_TYPE_MKFILE)) {
                        if (((qpl) this.this$0).f158879a != null) {
                            jSONArray.put(new JSONObject().put("data", ((qpl) this.this$0).f158879a.mo17916c(absolutePath)).put("path", absolutePath));
                        }
                        str2 = strOptString2;
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            bitmap = (Bitmap) ComponentCallbacks2C1057a.m5325t(this.this$0.m177460c()).m156812f().m95642D0(absolutePath).m155550e(d4e.f85034b).m95643G0().get();
                            try {
                                str2 = strOptString2;
                                try {
                                    bitmap.compress(Bitmap.CompressFormat.PNG, 70, byteArrayOutputStream2);
                                    int width = bitmap.getWidth();
                                    int height = bitmap.getHeight();
                                    byteArrayOutputStream = byteArrayOutputStream2;
                                    try {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        byteArray.getClass();
                                        bitmap.recycle();
                                        try {
                                            jSONArray.put(new JSONObject().put("data", Base64.encodeToString(byteArray, 0)).put("size", byteArrayOutputStream.size()).put("width", width).put("height", height).put("path", absolutePath));
                                            try {
                                                byteArrayOutputStream.close();
                                                if (!bitmap.isRecycled()) {
                                                    bitmap.recycle();
                                                }
                                            } catch (Throwable th) {
                                                jzv.m147730c("MediaExtraBridge", "", th);
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            bitmap = bitmap;
                                            try {
                                                jzv.m147730c("MediaExtraBridge", "", th);
                                                byteArrayOutputStream.close();
                                                if (bitmap == null && !bitmap.isRecycled()) {
                                                    bitmap.recycle();
                                                }
                                            } catch (Throwable th3) {
                                                try {
                                                    byteArrayOutputStream.close();
                                                    if (bitmap == null || bitmap.isRecycled()) {
                                                        throw th3;
                                                    }
                                                    bitmap.recycle();
                                                    throw th3;
                                                } catch (Throwable th4) {
                                                    jzv.m147730c("MediaExtraBridge", "", th4);
                                                    throw th3;
                                                }
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        jzv.m147730c("MediaExtraBridge", "", th);
                                        byteArrayOutputStream.close();
                                        if (bitmap == null) {
                                        }
                                        strOptString = str;
                                        strOptString2 = str2;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    byteArrayOutputStream = byteArrayOutputStream2;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                str2 = strOptString2;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            str2 = strOptString2;
                            bitmap = null;
                        }
                    }
                    strOptString = str;
                    strOptString2 = str2;
                } catch (Exception e) {
                    e = e;
                    jzv.m147730c(qpl.f158878b, "", e);
                    this.this$0.m177464h(str, User.ID_TEAM_ACCOUNT, "", e.toString());
                    return Unit.INSTANCE;
                }
            }
            jSONObject3.put("images", jSONArray);
            this.this$0.m177463g(strOptString, jSONObject3.toString());
        } catch (Exception e2) {
            e = e2;
            str = strOptString;
        }
        return Unit.INSTANCE;
    }
}
