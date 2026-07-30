package com.hellogroup.p036mk.business.bridge;

import androidx.core.app.NotificationCompat;
import com.hellogroup.p036mk.business.MKConfigSetter;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p153l.drb;
import p153l.gkw;
import p153l.glw;
import p153l.hul;
import p153l.i8g0;
import p153l.ivl;
import p153l.jzv;
import p153l.ojw;
import p153l.qpl;
import p153l.sjw;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.hellogroup.mk.business.bridge.BusinessMediaBridge$uploadAudio$1", m88263f = "BusinessMediaBridge.kt", m88264l = {}, m88265m = "invokeSuspend")
final class BusinessMediaBridge$uploadAudio$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ File $audioFile;
    final /* synthetic */ String $callback;
    final /* synthetic */ JSONObject $params;
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f12163p$;
    final /* synthetic */ BusinessMediaBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessMediaBridge$uploadAudio$1(BusinessMediaBridge businessMediaBridge, File file, JSONObject jSONObject, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = businessMediaBridge;
        this.$audioFile = file;
        this.$params = jSONObject;
        this.$callback = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        BusinessMediaBridge$uploadAudio$1 businessMediaBridge$uploadAudio$1 = new BusinessMediaBridge$uploadAudio$1(this.this$0, this.$audioFile, this.$params, this.$callback, continuation);
        businessMediaBridge$uploadAudio$1.f12163p$ = (drb) obj;
        return businessMediaBridge$uploadAudio$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((BusinessMediaBridge$uploadAudio$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        uyp.m198688e();
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        if (this.this$0.m177460c() == null) {
            return Unit.INSTANCE;
        }
        if (this.$audioFile == null) {
            return Unit.INSTANCE;
        }
        gkw gkwVarM130601b = gkw.m130601b();
        gkwVarM130601b.getClass();
        ivl ivlVarM130602a = gkwVarM130601b.m130602a();
        List listMutableListOf = CollectionsKt.mutableListOf(this.$audioFile);
        List listMutableListOf2 = CollectionsKt.mutableListOf("audio/m3a");
        try {
            String strOptString = this.$params.optString("url");
            HashMap mapM17991J = this.this$0.m17991J(this.$params.optJSONObject("headers"));
            HashMap mapM17991J2 = this.this$0.m17991J(this.$params.optJSONObject("data"));
            if (i8g0.m139000b(strOptString)) {
                strOptString = this.this$0.m18014L();
            }
            ojw ojwVarM17763b = MKConfigSetter.INSTANCE.m17763b();
            if (ojwVarM17763b != null) {
                hul hulVar = ((qpl) this.this$0).f158879a;
                hulVar.getClass();
                String strMo167945d = ojwVarM17763b.mo167945d(strOptString, hulVar.getOriginURL());
                if (strMo167945d != null) {
                    strOptString = strMo167945d;
                }
            }
            Object[] array = listMutableListOf.toArray(new File[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            File[] fileArr = (File[]) array;
            Object[] array2 = listMutableListOf2.toArray(new String[0]);
            if (array2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            mapM17991J.put("X-Putong-Cloud-Module", sjw.m186315d());
            String strMo115346b = ivlVarM130602a.mo115346b(strOptString, mapM17991J2, fileArr, (String[]) array2, mapM17991J);
            JSONObject jSONObject = new JSONObject();
            int iOptInt = jSONObject.optInt("ec");
            int i = (iOptInt == 0 || iOptInt == 200) ? 3 : 1;
            String strOptString2 = jSONObject.optString("em");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(NotificationCompat.CATEGORY_STATUS, String.valueOf(i) + "").put("message", strOptString2).put("data", new JSONObject(strMo115346b));
            this.this$0.m177463g(this.$callback, jSONObject2.toString());
            return Unit.INSTANCE;
        } catch (Exception e) {
            jzv.m147730c("MediaExtraBridge", "", e);
            String string = glw.m130705b(new String[]{NotificationCompat.CATEGORY_STATUS, "message"}, new String[]{"1", e.getMessage()}).toString();
            string.getClass();
            this.this$0.m177463g(this.$callback, string);
        }
    }
}
