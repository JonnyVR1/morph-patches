package com.p046p1.mobile.putong.core.p053ui.visitor;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.visitor.C9049e;
import com.p046p1.mobile.putong.data.AllVisitors;
import com.p046p1.mobile.putong.data.UnPrivilegedVisitor;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Visitor;
import com.p046p1.mobile.putong.data.VisitorInfo;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;
import p133rx.C22306c;
import p149l.i0g0;
import p149l.j760;
import p149l.mqi0;
import p149l.vwb;
import p149l.w5m0;
import p149l.w9j;
import p149l.xma;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/e;", "", "<init>", "()V", "Companion", "a", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C9049e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.e$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0019\u0010\u0012J7\u0010\u001f\u001a\"\u0012\u001e\u0012\u001c\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u001e\u0018\u00010\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\"R\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\"¨\u0006("}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/e$a;", "", "<init>", "()V", "", "number", "", "g", "(I)Ljava/lang/String;", "currentDistance", "f", "minAge", "maxAge", "e", "(II)Ljava/lang/String;", "Lcom/p1/mobile/putong/data/User;", "user", "j", "(Lcom/p1/mobile/putong/data/User;)Ljava/lang/String;", "", "currentTime", "", "deadLineTime", RXScreenCaptureService.KEY_INDEX, "(JD)Ljava/lang/String;", "k", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lrx/c;", "", "Ll/j760;", "h", "(Lcom/p1/mobile/android/app/Act;)Lrx/c;", "ONE_MINUTE", "I", "ONE_HOUR", "ONE_DAY", "ONE_WEAK", "ONE_MONTH", "ONE_YEAR", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public static List m57968a(j760 j760Var) {
            AllVisitors allVisitors;
            List<Visitor> list;
            VisitorInfo visitorInfo = (VisitorInfo) j760Var.f116565b;
            ArrayList arrayList = null;
            if (visitorInfo != null && (allVisitors = visitorInfo.allVisitors) != null && (list = allVisitors.visitors) != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    List<Visitor> list2 = list;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (Visitor visitor : list2) {
                        arrayList.add(vwb.m200311Y(CoreModule.f17545c.f19668n2.m175432I3(visitor.userId), Integer.valueOf(visitor.visitCount)));
                    }
                }
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static List m57969b(j760 j760Var) {
            List<UnPrivilegedVisitor> list;
            VisitorInfo visitorInfo = (VisitorInfo) j760Var.f116565b;
            ArrayList arrayList = null;
            if (visitorInfo != null && (list = visitorInfo.unprivilegedVisitors) != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    List<UnPrivilegedVisitor> list2 = list;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (UnPrivilegedVisitor unPrivilegedVisitor : list2) {
                        arrayList.add(vwb.m200311Y(CoreModule.f17545c.f19668n2.m175432I3(unPrivilegedVisitor.userId), Integer.valueOf(unPrivilegedVisitor.visitCount)));
                    }
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: c */
        public static List m57970c(Function1 function1, Object obj) {
            return (List) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: d */
        public static List m57971d(Function1 function1, Object obj) {
            return (List) function1.invoke(obj);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: e */
        public final String m57972e(int minAge, int maxAge) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format("%1$d - %2$d%3$s", Arrays.copyOf(new Object[]{Integer.valueOf(minAge), Integer.valueOf(maxAge), maxAge == w5m0.INSTANCE.m201656e() ? Marker.ANY_NON_NULL_MARKER : ""}, 3));
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: f */
        public final String m57973f(int currentDistance) {
            int i = currentDistance / 1000;
            w5m0.Companion c20806a = w5m0.INSTANCE;
            if (i >= c20806a.m201654c() / 1000) {
                return (c20806a.m201654c() / 1000) + "km+";
            }
            if (i > c20806a.m201655d() / 1000) {
                return i + "km";
            }
            return "<" + (c20806a.m201655d() / 1000) + "km";
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: g */
        public final String m57974g(int number) {
            if (number <= 9999) {
                StringBuilder sb = new StringBuilder();
                sb.append(number);
                return sb.toString();
            }
            return new DecimalFormat("#.##").format(number / 10000.0f) + "万";
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: h */
        public final C22306c<List<j760<User, Integer>>> m57975h(@NotNull Act act) {
            act.getClass();
            if (!CoreModule.m29935P().m94651a().mo158371f() || xma.m210043F3()) {
                C22306c c22306cDuringCreated = act.duringCreated(CoreModule.f17545c.f19668n2.m175450a4(CoreModule.m29931H().userId(), "list", "", false));
                final Function1 function1 = new Function1() { // from class: l.s7m0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C9049e.Companion.m57968a((j760) obj);
                    }
                };
                C22306c<List<j760<User, Integer>>> map = c22306cDuringCreated.map(new w9j() { // from class: l.t7m0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C9049e.Companion.m57970c(function1, obj);
                    }
                });
                map.getClass();
                return map;
            }
            C22306c c22306cDuringCreated2 = act.duringCreated(CoreModule.f17545c.f19668n2.m175466q4(false));
            final Function1 function2 = new Function1() { // from class: l.q7m0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C9049e.Companion.m57969b((j760) obj);
                }
            };
            C22306c<List<j760<User, Integer>>> map2 = c22306cDuringCreated2.map(new w9j() { // from class: l.r7m0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return C9049e.Companion.m57971d(function2, obj);
                }
            });
            map2.getClass();
            return map2;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: i */
        public final String m57976i(long currentTime, double deadLineTime) {
            App.f15369e.getClass();
            Calendar calendar = Calendar.getInstance();
            long j = (long) deadLineTime;
            calendar.setTimeInMillis(j);
            if (calendar.get(1) <= 1970) {
                return "刚刚访问";
            }
            long j2 = (currentTime - j) / 1000;
            if (j2 < 60) {
                return "1分钟前访问";
            }
            if (j2 < 3600) {
                StringBuilder sb = new StringBuilder();
                sb.append((int) (j2 / 60));
                sb.append("分钟前访问");
                return sb.toString();
            }
            if (j2 < 86400) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append((int) (j2 / 3600));
                sb2.append("小时前访问");
                return sb2.toString();
            }
            if (j2 < 604800) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append((int) (j2 / 86400));
                sb3.append("天前访问");
                return sb3.toString();
            }
            if (j2 < 2592000) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append((int) (j2 / 604800));
                sb4.append("周前访问");
                return sb4.toString();
            }
            if (j2 < 31536000) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append((int) (j2 / 2592000));
                sb5.append("月前访问");
                return sb5.toString();
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append((int) (j2 / 31536000));
            sb6.append("年前访问");
            return sb6.toString();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: j */
        public final String m57977j(@NotNull User user) {
            user.getClass();
            if (!CoreModule.m29932K().hideActiveTime(user)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                return String.format("%s活跃", Arrays.copyOf(new Object[]{mqi0.m155932G(user.location.updatedTime)}, 1));
            }
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str = String.format("%s活跃", Arrays.copyOf(new Object[]{mqi0.m155932G(CoreModule.m29932K().mo30830vn(user))}, 1));
            return user.isMe() ? str.concat("（已冻结）") : str;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: k */
        public final String m57978k(@Nullable User user) {
            if (user == null) {
                return "";
            }
            Object objM133856W = CoreModule.m29932K().hideLocation(user) ? "" : i0g0.m133856W(user.location);
            objM133856W.getClass();
            return objM133856W.toString();
        }

        public Companion() {
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m57961a(int i, int i2) {
        return INSTANCE.m57972e(i, i2);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m57962b(int i) {
        return INSTANCE.m57973f(i);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m57963c(int i) {
        return INSTANCE.m57974g(i);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final C22306c<List<j760<User, Integer>>> m57964d(@NotNull Act act) {
        return INSTANCE.m57975h(act);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m57965e(long j, double d) {
        return INSTANCE.m57976i(j, d);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m57966f(@NotNull User user) {
        return INSTANCE.m57977j(user);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m57967g(@Nullable User user) {
        return INSTANCE.m57978k(user);
    }
}
