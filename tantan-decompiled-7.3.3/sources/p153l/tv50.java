package p153l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchPushUser;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/tv50;", "", "<init>", "()V", "Companion", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class tv50 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m192774a(@NotNull User user) {
        return INSTANCE.m192776a(user);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m192775b(@NotNull OnlineMatchPushUser onlineMatchPushUser) {
        return INSTANCE.m192777b(onlineMatchPushUser);
    }

    /* JADX INFO: renamed from: l.tv50$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\f¨\u0006\u0010"}, m88121d2 = {"Ll/tv50$a;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;", "onlineMatchPushUser", "", "b", "(Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;)Ljava/lang/String;", "Lcom/p1/mobile/putong/data/User;", "user", "c", "(Lcom/p1/mobile/putong/data/User;)Ljava/lang/String;", Constants.INAPP_DATA_TAG, "otherUser", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0101  */
        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m192776a(@NotNull User otherUser) {
            String str;
            otherUser.getClass();
            if (!TextUtils.isEmpty(otherUser.description)) {
                String str2 = otherUser.description;
                str2.getClass();
                return "“" + C15493d.m94370F(str2, SignParameters.NEW_LINE, "", false, 4, null) + "”";
            }
            boolean zM147479J = jyb.m147479J(otherUser.profile.tags);
            Profile profile = otherUser.profile;
            if (zM147479J) {
                if (TextUtils.isEmpty(profile.work.industry)) {
                    return (otherUser.isFemale() ? "她" : "他").concat("正在等你聊天");
                }
                return (otherUser.isFemale() ? "她" : "他") + "从事" + otherUser.profile.work.industry;
            }
            List<Tag> list = profile.tags;
            list.getClass();
            List<Tag> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Tag) it.next()).value);
            }
            User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
            if (!NullChecker.m82486a(userM116593na) || jyb.m147479J(userM116593na.profile.tags)) {
                str = "";
            } else {
                List<Tag> list3 = userM116593na.profile.tags;
                list3.getClass();
                List<Tag> list4 = list3;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                Iterator<T> it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Tag) it2.next()).value);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (arrayList.contains((String) obj)) {
                        arrayList3.add(obj);
                    }
                }
                List listTake = CollectionsKt.take(arrayList3, Math.min(3, arrayList3.size()));
                if (jyb.m147479J(arrayList3)) {
                    str = "";
                } else {
                    str = "你们都爱 " + CollectionsKt.joinToString$default(listTake, "、", null, null, 0, null, null, 62, null);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            List listTake2 = CollectionsKt.take(arrayList, Math.min(3, arrayList.size()));
            return (otherUser.isFemale() ? "她" : "他") + "爱 " + CollectionsKt.joinToString$default(listTake2, "、", null, null, 0, null, null, 62, null);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final String m192777b(@NotNull OnlineMatchPushUser onlineMatchPushUser) {
            String strM192778c;
            String strM51401B;
            onlineMatchPushUser.getClass();
            int i = onlineMatchPushUser.distance;
            User user = onlineMatchPushUser.user;
            if (i >= 20000) {
                strM192778c = m192779d(user);
                if (!NullChecker.m82486a(strM192778c) || !TextUtils.equals(strM192778c, m192779d(CoreModule.f18264c.f20381e0.m116600p9()))) {
                    strM192778c = null;
                }
            } else {
                strM192778c = m192778c(user);
            }
            long j = onlineMatchPushUser.birthday;
            if (j == 0) {
                strM51401B = NullChecker.m82486a(onlineMatchPushUser.user.profile) ? q8g0.m175804j0(onlineMatchPushUser.user.profile.zodiac) : "";
            } else {
                strM51401B = C8772a.m51401B(j);
            }
            String str = onlineMatchPushUser.age;
            str.getClass();
            Integer intOrNull = StringsKt.toIntOrNull(str);
            String strM51406G = C8772a.m51406G(intOrNull != null ? intOrNull.intValue() : 0);
            if (strM192778c == null) {
                return strM51406G + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + strM51401B;
            }
            return strM51406G + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + strM51401B + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + strM192778c;
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: c */
        public final String m192778c(@Nullable User user) {
            if (user == null) {
                return null;
            }
            Location location = user.location;
            if (location.distance >= 20000 && !TextUtils.isEmpty(location.region.city)) {
                return user.location.region.city;
            }
            int i = user.location.distance;
            if (i < 1000) {
                return i + "m";
            }
            return new DecimalFormat("#.##").format(user.location.distance / 1000.0f) + "km";
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: d */
        public final String m192779d(@Nullable User user) {
            if (user != null && NullChecker.m82486a(user.location) && NullChecker.m82486a(user.location.region) && !TextUtils.isEmpty(user.location.region.city)) {
                return user.location.region.city;
            }
            return null;
        }

        public Companion() {
        }
    }
}
