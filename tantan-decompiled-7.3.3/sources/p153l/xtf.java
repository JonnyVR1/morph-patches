package p153l;

import com.google.gson.Gson;
import com.hellogroup.p036mk.fdt.FDTException;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import io.reactivex.Flowable;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, m88121d2 = {"Ll/xtf;", "", "<init>", "()V", "", "mac", "Lio/reactivex/Flowable;", "b", "(Ljava/lang/String;)Lio/reactivex/Flowable;", "token", "a", "MKFDT_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class xtf {
    public static final xtf INSTANCE = new xtf();

    /* JADX INFO: renamed from: l.xtf$a */
    @Metadata(m88120d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m88121d2 = {"", "a", "()Ljava/lang/String;"}, m88122k = 3, m88123mv = {1, 4, 0})
    public static final class CallableC21445a implements Callable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f196205a;

        public CallableC21445a(String str) {
            this.f196205a = str;
        }

        @Override // java.util.concurrent.Callable
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String call() throws FDTException {
            String string;
            String macAddress;
            akw.INSTANCE.m98627a();
            new HashMap().put("token", this.f196205a);
            jzv.m147728a("FDTManager", "sendCheckFDTTokenRequest token:" + this.f196205a);
            JSONObject jSONObject = new JSONObject("");
            jzv.m147728a("FDTManager", "sendCheckFDTTokenRequest resultStr:".concat(""));
            Gson gson = new Gson();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null || (string = jSONObjectOptJSONObject.toString()) == null) {
                string = WeJson.EMPTY_MAP;
            }
            ytf ytfVar = (ytf) gson.fromJson(string, ytf.class);
            if (ytfVar == null || (macAddress = ytfVar.getMacAddress()) == null || StringsKt.m94329e0(macAddress)) {
                throw new FDTException("校验token凭证不通过");
            }
            return ytfVar.getMacAddress();
        }
    }

    /* JADX INFO: renamed from: l.xtf$b */
    @Metadata(m88120d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m88121d2 = {"", "a", "()Ljava/lang/String;"}, m88122k = 3, m88123mv = {1, 4, 0})
    public static final class CallableC21446b implements Callable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f196206a;

        public CallableC21446b(String str) {
            this.f196206a = str;
        }

        @Override // java.util.concurrent.Callable
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String call() throws FDTException {
            String string;
            String token;
            akw.INSTANCE.m98627a();
            new HashMap().put("mac_address", this.f196206a);
            jzv.m147728a("FDTManager", "sendFDTLoginRequest mac:" + this.f196206a);
            JSONObject jSONObject = new JSONObject("");
            jzv.m147728a("FDTManager", "sendFDTLoginRequest resultStr:".concat(""));
            Gson gson = new Gson();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null || (string = jSONObjectOptJSONObject.toString()) == null) {
                string = WeJson.EMPTY_MAP;
            }
            ztf ztfVar = (ztf) gson.fromJson(string, ztf.class);
            if (ztfVar == null || (token = ztfVar.getToken()) == null || StringsKt.m94329e0(token)) {
                throw new FDTException("获取token凭证失败");
            }
            return ztfVar.getToken();
        }
    }

    private xtf() {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Flowable<String> m213069a(@NotNull String token) {
        token.getClass();
        Flowable<String> flowableFromCallable = Flowable.fromCallable(new CallableC21445a(token));
        flowableFromCallable.getClass();
        return flowableFromCallable;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Flowable<String> m213070b(@NotNull String mac) {
        mac.getClass();
        Flowable<String> flowableFromCallable = Flowable.fromCallable(new CallableC21446b(mac));
        flowableFromCallable.getClass();
        return flowableFromCallable;
    }
}
