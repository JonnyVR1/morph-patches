package com.hellogroup.p036mk.business.bridge;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.hellogroup.p036mk.business.MKConfigSetter;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p153l.a6k0;
import p153l.drb;
import p153l.gkw;
import p153l.glw;
import p153l.hul;
import p153l.i8g0;
import p153l.ivl;
import p153l.jzv;
import p153l.ljw;
import p153l.ojw;
import p153l.qpl;
import p153l.sjw;
import p153l.uyp;
import p153l.wkw;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.hellogroup.mk.business.bridge.BusinessMediaBridge$uploadImages$1", m88263f = "BusinessMediaBridge.kt", m88264l = {}, m88265m = "invokeSuspend")
public final class BusinessMediaBridge$uploadImages$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ JSONObject $params;
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f12164p$;
    final /* synthetic */ BusinessMediaBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessMediaBridge$uploadImages$1(BusinessMediaBridge businessMediaBridge, JSONObject jSONObject, Continuation continuation) {
        super(2, continuation);
        this.this$0 = businessMediaBridge;
        this.$params = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        BusinessMediaBridge$uploadImages$1 businessMediaBridge$uploadImages$1 = new BusinessMediaBridge$uploadImages$1(this.this$0, this.$params, continuation);
        businessMediaBridge$uploadImages$1.f12164p$ = (drb) obj;
        return businessMediaBridge$uploadImages$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((BusinessMediaBridge$uploadImages$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00f9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        String str;
        uyp.m198688e();
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        if (this.this$0.m177460c() == null) {
            return Unit.INSTANCE;
        }
        JSONObject jSONObject = this.$params;
        String strOptString = jSONObject != null ? jSONObject.optString("callback") : null;
        JSONObject jSONObject2 = this.$params;
        String strOptString2 = jSONObject2 != null ? jSONObject2.optString("url") : null;
        if (i8g0.m139000b(strOptString2)) {
            strOptString2 = this.this$0.m18014L();
        }
        if (TextUtils.isEmpty(strOptString2)) {
            this.this$0.m18015M(strOptString, "1", "upload param url is empty");
            return Unit.INSTANCE;
        }
        String strM154581a = ljw.INSTANCE.m154581a(strOptString2);
        JSONObject jSONObject3 = this.$params;
        JSONArray jSONArrayOptJSONArray = jSONObject3 != null ? jSONObject3.optJSONArray("images") : null;
        if (jSONArrayOptJSONArray == null) {
            this.this$0.m18015M(strOptString, "1", "images is empty");
            return Unit.INSTANCE;
        }
        int length = jSONArrayOptJSONArray.length();
        BusinessMediaBridge businessMediaBridge = this.this$0;
        if (length <= 0) {
            businessMediaBridge.m18015M(strOptString, "1", "images is empty");
            return Unit.INSTANCE;
        }
        HashMap mapM17991J = businessMediaBridge.m17991J(this.$params.optJSONObject("headers"));
        HashMap mapM17991J2 = this.this$0.m17991J(this.$params.optJSONObject("data"));
        gkw gkwVarM130601b = gkw.m130601b();
        gkwVarM130601b.getClass();
        ivl ivlVarM130602a = gkwVarM130601b.m130602a();
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < length; i++) {
            String strOptString3 = jSONArrayOptJSONArray.optString(i);
            if (!TextUtils.isEmpty(strOptString3)) {
                strOptString3.getClass();
                if (a6k0.m96335i(strOptString3)) {
                    strOptString3 = wkw.m206866b(strOptString3);
                }
                File file = new File(strOptString3);
                if (file.exists()) {
                    arrayList.add(file);
                }
                arrayList2.add(DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG);
            }
        }
        try {
            ojw ojwVarM17763b = MKConfigSetter.INSTANCE.m17763b();
            if (ojwVarM17763b != null) {
                hul hulVar = ((qpl) this.this$0).f158879a;
                hulVar.getClass();
                String strMo167945d = ojwVarM17763b.mo167945d(strM154581a, hulVar.getOriginURL());
                if (strMo167945d != null) {
                    str = strMo167945d;
                } else {
                    str = strM154581a;
                }
            } else {
                str = strM154581a;
            }
            Object[] array = arrayList.toArray(new File[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            File[] fileArr = (File[]) array;
            Object[] array2 = arrayList2.toArray(new String[0]);
            if (array2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            mapM17991J.put("X-Putong-Cloud-Module", sjw.m186315d());
            mapM17991J.put("Content-Type", "multipart/form-data");
            String strMo115346b = ivlVarM130602a.mo115346b(str, mapM17991J2, fileArr, (String[]) array2, mapM17991J);
            JSONObject jSONObject4 = new JSONObject(strMo115346b);
            int iOptInt = jSONObject4.optInt("ec");
            int i2 = (iOptInt == 0 || iOptInt == 200) ? 0 : 1;
            String strOptString4 = jSONObject4.optString("em");
            this.this$0.m177463g(strOptString, glw.m130705b(new String[]{NotificationCompat.CATEGORY_STATUS, "message", "data"}, new String[]{String.valueOf(i2) + "", strOptString4, strMo115346b}).toString());
            return Unit.INSTANCE;
        } catch (Exception e) {
            jzv.m147730c("MediaExtraBridge", "", e);
            this.this$0.m18015M(strOptString, "1", e.getMessage());
        }
    }
}
