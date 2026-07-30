package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/wj90;", "", "<init>", "()V", "Companion", "a", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class wj90 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m206618a(@Nullable String str) {
        return INSTANCE.m206623a(str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m206619b(@NotNull User user, @NotNull CoreSuggested.UserInfo userInfo) {
        return INSTANCE.m206624b(user, userInfo);
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m206620c(@Nullable User user) {
        return INSTANCE.m206625c(user);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m206621d(@Nullable User user) {
        return INSTANCE.m206626d(user);
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m206622e(@Nullable User user) {
        return INSTANCE.m206627e(user);
    }

    /* JADX INFO: renamed from: l.wj90$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Ll/wj90$a;", "", "<init>", "()V", "Lcom/p1/mobile/putong/data/User;", "user", "", "c", "(Lcom/p1/mobile/putong/data/User;)Z", Constants.INAPP_DATA_TAG, "e", "", "callFrom", "a", "(Ljava/lang/String;)Z", "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "userInfo", "b", "(Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;)Z", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final boolean m206623a(@Nullable String callFrom) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (userM116600p9 == null || !userM116600p9.isSupremePartnerOpenMystery()) {
                return false;
            }
            o1j0.m165651y("已关闭专属皮肤，神秘人模式自动关闭");
            return true;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final boolean m206624b(@NotNull User user, @NotNull CoreSuggested.UserInfo userInfo) {
            user.getClass();
            userInfo.getClass();
            return NullChecker.m82486a(user) && user.isMe() && m206627e(user) && NullChecker.m82486a(userInfo) && NullChecker.m82486a(userInfo.cityCData) && !TextUtils.isEmpty(userInfo.cityCData.userId);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002a  */
        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final boolean m206625c(@Nullable User user) {
            if (gta.m132210e().m132214d().mo34820e() && user != null && !user.isMe()) {
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
        public final boolean m206626d(@Nullable User user) {
            return (!gta.m132210e().m132214d().mo34820e() || user == null || user.isMe() || !user.isSupremePartnerOpenMystery() || user.isHideIconFromSVipWithMe()) ? false : true;
        }

        @JvmStatic
        /* JADX INFO: renamed from: e */
        public final boolean m206627e(@Nullable User user) {
            if (!gta.m132210e().m132214d().mo34820e() || user == null || m206625c(user)) {
                return false;
            }
            return user.isMe() || !user.isHideIconFromSVipWithMe();
        }

        public Companion() {
        }
    }
}
