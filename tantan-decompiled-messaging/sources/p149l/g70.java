package p149l;

import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.wxapi.WXEntryActivity;
import com.tencent.p101mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.p101mm.opensdk.openapi.IWXAPI;
import com.tencent.p101mm.opensdk.openapi.WXAPIFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"Ll/g70;", "", "<init>", "()V", "", "userName", "path", "", "a", "(Ljava/lang/String;Ljava/lang/String;)Z", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class g70 {

    @NotNull
    public static final g70 INSTANCE = new g70();

    /* JADX INFO: renamed from: a */
    public final boolean m124682a(@NotNull String userName, @NotNull String path) {
        userName.getClass();
        path.getClass();
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(App.f15369e, WXEntryActivity.APPID);
        if (!iwxapiCreateWXAPI.isWXAppInstalled()) {
            return false;
        }
        WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
        req.userName = userName;
        req.path = path;
        req.miniprogramType = 0;
        return iwxapiCreateWXAPI.sendReq(req);
    }
}
