package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SeeTrialStatusType;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"Ll/emr;", "", "<init>", "()V", "", "e", "()Ljava/lang/String;", "", "b", "()Z", "a", "id", "f", "(Ljava/lang/String;)Z", "", Constants.INAPP_DATA_TAG, "()J", "mills", "c", "(J)Ljava/lang/String;", "Ljava/lang/String;", "getClickToBuyUserId", "setClickToBuyUserId", "(Ljava/lang/String;)V", "clickToBuyUserId", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class emr {

    @NotNull
    public static final emr INSTANCE = new emr();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static String clickToBuyUserId = "";

    /* JADX INFO: renamed from: a */
    public final boolean m117219a() {
        String strM141777n3 = CoreModule.f17545c.f19554B2.m141777n3();
        return (CoreModule.m29935P().m94651a().mo33394Qb() && (TextUtils.equals(strM141777n3, SeeTrialStatusType.waitToBuy) || TextUtils.equals(strM141777n3, "expired") || TextUtils.equals(strM141777n3, SeeTrialStatusType.recovered))) || !CoreModule.m29935P().m94651a().mo33394Qb();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m117220b() {
        return CoreModule.m29935P().m94651a().mo33394Qb() && TextUtils.equals(CoreModule.f17545c.f19554B2.m141777n3(), SeeTrialStatusType.waitToBuy) && CoreModule.f17545c.f19554B2.getIsGoodSeeTrialUser();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m117221c(long mills) {
        long j = mills / 1000;
        if (j > 3600) {
            return ((long) Math.ceil(j / 3600.0d)) + "小时";
        }
        return ((long) Math.ceil(j / 60.0d)) + "分钟";
    }

    /* JADX INFO: renamed from: d */
    public final long m117222d() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("limited_trial_see");
            strM79302F.getClass();
            if (TextUtils.isEmpty(strM79302F)) {
                return 4L;
            }
            return new JSONObject(strM79302F).optLong("recovery_max_conversation_count", 4L);
        } catch (Exception unused) {
            return 4L;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m117223e() {
        return CoreModule.f17545c.f19554B2.m141777n3();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m117224f(@NotNull String id) {
        id.getClass();
        return CoreModule.m29935P().m94651a().mo33394Qb() && TextUtils.equals(id, clickToBuyUserId);
    }
}
