package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchPushUser;
import com.p1.mobile.putong.core.ui.onlinematch.a;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.d;
import l.i0g0;
import l.vwb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ll/nn50;", "", "<init>", "()V", "Companion", "a", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class nn50 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m20162a(@NotNull User user) {
        return INSTANCE.m20164a(user);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m20163b(@NotNull OnlineMatchPushUser onlineMatchPushUser) {
        return INSTANCE.m20165b(onlineMatchPushUser);
    }

    /* JADX INFO: renamed from: l.nn50$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Ll/nn50$a;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;", "onlineMatchPushUser", "", "b", "(Lcom/p1/mobile/putong/core/ui/onlinematch/OnlineMatchPushUser;)Ljava/lang/String;", "Lcom/p1/mobile/putong/data/User;", "user", "c", "(Lcom/p1/mobile/putong/data/User;)Ljava/lang/String;", "d", "otherUser", "a", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0101  */
        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m20164a(@NotNull User otherUser) {
            String str;
            otherUser.getClass();
            if (!TextUtils.isEmpty(otherUser.description)) {
                String str2 = otherUser.description;
                str2.getClass();
                return "“" + d.F(str2, "\n", "", false, 4, (Object) null) + "”";
            }
            boolean zJ = vwb.J(otherUser.profile.tags);
            Profile profile = otherUser.profile;
            if (zJ) {
                if (TextUtils.isEmpty(profile.work.industry)) {
                    return (otherUser.isFemale() ? "她" : "他").concat("正在等你聊天");
                }
                return (otherUser.isFemale() ? "她" : "他") + "从事" + otherUser.profile.work.industry;
            }
            List list = profile.tags;
            list.getClass();
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Tag) it.next()).value);
            }
            User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
            if (!NullChecker.a(userM21483na) || vwb.J(userM21483na.profile.tags)) {
                str = "";
            } else {
                List list3 = userM21483na.profile.tags;
                list3.getClass();
                List list4 = list3;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                Iterator it2 = list4.iterator();
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
                if (vwb.J(arrayList3)) {
                    str = "";
                } else {
                    str = "你们都爱 " + CollectionsKt.joinToString$default(listTake, "、", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            List listTake2 = CollectionsKt.take(arrayList, Math.min(3, arrayList.size()));
            return (otherUser.isFemale() ? "她" : "他") + "爱 " + CollectionsKt.joinToString$default(listTake2, "、", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final String m20165b(@NotNull OnlineMatchPushUser onlineMatchPushUser) {
            String strM20166c;
            String strB;
            onlineMatchPushUser.getClass();
            int i = onlineMatchPushUser.distance;
            User user = onlineMatchPushUser.user;
            if (i >= 20000) {
                strM20166c = m20167d(user);
                if (!NullChecker.a(strM20166c) || !TextUtils.equals(strM20166c, m20167d(CoreModule.f1534c.f3628e0.m21490p9()))) {
                    strM20166c = null;
                }
            } else {
                strM20166c = m20166c(user);
            }
            long j = onlineMatchPushUser.birthday;
            if (j == 0) {
                strB = NullChecker.a(onlineMatchPushUser.user.profile) ? i0g0.j0(onlineMatchPushUser.user.profile.zodiac) : "";
            } else {
                strB = a.B(j);
            }
            String str = onlineMatchPushUser.age;
            str.getClass();
            Integer intOrNull = StringsKt.toIntOrNull(str);
            String strG = a.G(intOrNull != null ? intOrNull.intValue() : 0);
            if (strM20166c == null) {
                return strG + " " + strB;
            }
            return strG + " " + strB + " " + strM20166c;
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: c */
        public final String m20166c(@Nullable User user) {
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
        public final String m20167d(@Nullable User user) {
            if (user != null && NullChecker.a(user.location) && NullChecker.a(user.location.region) && !TextUtils.isEmpty(user.location.region.city)) {
                return user.location.region.city;
            }
            return null;
        }

        public Companion() {
        }
    }
}
