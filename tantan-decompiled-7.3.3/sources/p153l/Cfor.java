package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SeeTrialStatusType;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.for, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"Ll/for;", "", "<init>", "()V", "", "e", "()Ljava/lang/String;", "", "b", "()Z", "a", "id", "f", "(Ljava/lang/String;)Z", "", Constants.INAPP_DATA_TAG, "()J", "mills", "c", "(J)Ljava/lang/String;", "Ljava/lang/String;", "getClickToBuyUserId", "setClickToBuyUserId", "(Ljava/lang/String;)V", "clickToBuyUserId", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class Cfor {

    @NotNull
    public static final Cfor INSTANCE = new Cfor();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static String clickToBuyUserId = "";

    /* JADX INFO: renamed from: a */
    public final boolean m126490a() {
        String strM186425n3 = CoreModule.f18264c.f20296B2.m186425n3();
        return (CoreModule.m30933P().m143405a().mo34397Qb() && (TextUtils.equals(strM186425n3, SeeTrialStatusType.waitToBuy) || TextUtils.equals(strM186425n3, "expired") || TextUtils.equals(strM186425n3, SeeTrialStatusType.recovered))) || !CoreModule.m30933P().m143405a().mo34397Qb();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m126491b() {
        return CoreModule.m30933P().m143405a().mo34397Qb() && TextUtils.equals(CoreModule.f18264c.f20296B2.m186425n3(), SeeTrialStatusType.waitToBuy) && CoreModule.f18264c.f20296B2.getIsGoodSeeTrialUser();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m126492c(long mills) {
        long j = mills / 1000;
        if (j > 3600) {
            return ((long) Math.ceil(j / 3600.0d)) + "小时";
        }
        return ((long) Math.ceil(j / 60.0d)) + "分钟";
    }

    /* JADX INFO: renamed from: d */
    public final long m126493d() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("limited_trial_see");
            strM80485F.getClass();
            if (TextUtils.isEmpty(strM80485F)) {
                return 4L;
            }
            return new JSONObject(strM80485F).optLong("recovery_max_conversation_count", 4L);
        } catch (Exception unused) {
            return 4L;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m126494e() {
        return CoreModule.f18264c.f20296B2.m186425n3();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m126495f(@NotNull String id) {
        id.getClass();
        return CoreModule.m30933P().m143405a().mo34397Qb() && TextUtils.equals(id, clickToBuyUserId);
    }
}
