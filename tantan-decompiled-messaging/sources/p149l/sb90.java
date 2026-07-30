package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Ll/sb90;", "", "<init>", "()V", "Companion", "a", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class sb90 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m183205a(@Nullable String str) {
        return INSTANCE.m183210a(str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m183206b(@NotNull User user, @NotNull CoreSuggested.UserInfo userInfo) {
        return INSTANCE.m183211b(user, userInfo);
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m183207c(@Nullable User user) {
        return INSTANCE.m183212c(user);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m183208d(@Nullable User user) {
        return INSTANCE.m183213d(user);
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m183209e(@Nullable User user) {
        return INSTANCE.m183214e(user);
    }

    /* JADX INFO: renamed from: l.sb90$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Ll/sb90$a;", "", "<init>", "()V", "Lcom/p1/mobile/putong/data/User;", "user", "", "c", "(Lcom/p1/mobile/putong/data/User;)Z", Constants.INAPP_DATA_TAG, "e", "", "callFrom", "a", "(Ljava/lang/String;)Z", "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "userInfo", "b", "(Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;)Z", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final boolean m183210a(@Nullable String callFrom) {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (userM169527p9 == null || !userM169527p9.isSupremePartnerOpenMystery()) {
                return false;
            }
            lsi0.m151595y("已关闭专属皮肤，神秘人模式自动关闭");
            return true;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final boolean m183211b(@NotNull User user, @NotNull CoreSuggested.UserInfo userInfo) {
            user.getClass();
            userInfo.getClass();
            return NullChecker.m81303a(user) && user.isMe() && m183214e(user) && NullChecker.m81303a(userInfo) && NullChecker.m81303a(userInfo.cityCData) && !TextUtils.isEmpty(userInfo.cityCData.userId);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002a  */
        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final boolean m183212c(@Nullable User user) {
            if (ura.m195053e().m195057d().mo33817e() && user != null && !user.isMe()) {
                Relationship relationship = user.localRelationship;
                if (relationship != null) {
                    relationship.getClass();
                    if (!TEnum.equals(relationship.state, "matched")) {
                        if (!user.isSupremePartnerOpenMystery() && !user.isHideIconFromSVipWithMe()) {
                            return true;
                        }
                    }
                } else if (!user.isSupremePartnerOpenMystery()) {
                }
            }
            return false;
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final boolean m183213d(@Nullable User user) {
            return (!ura.m195053e().m195057d().mo33817e() || user == null || user.isMe() || !user.isSupremePartnerOpenMystery() || user.isHideIconFromSVipWithMe()) ? false : true;
        }

        @JvmStatic
        /* JADX INFO: renamed from: e */
        public final boolean m183214e(@Nullable User user) {
            if (!ura.m195053e().m195057d().mo33817e() || user == null || m183212c(user)) {
                return false;
            }
            return user.isMe() || !user.isHideIconFromSVipWithMe();
        }

        public Companion() {
        }
    }
}
