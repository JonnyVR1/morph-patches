package com.p051p1.mobile.putong.core.p058ui.visitor;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.visitor.C9212e;
import com.p051p1.mobile.putong.data.AllVisitors;
import com.p051p1.mobile.putong.data.UnPrivilegedVisitor;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Visitor;
import com.p051p1.mobile.putong.data.VisitorInfo;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p137rx.C22421c;
import p153l.afm0;
import p153l.joa;
import p153l.jyb;
import p153l.pf60;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qcj;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.e */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/e;", "", "<init>", "()V", "Companion", "a", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class C9212e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.e$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0019\u0010\u0012J7\u0010\u001f\u001a\"\u0012\u001e\u0012\u001c\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u001e\u0018\u00010\u001d0\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\"R\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\"¨\u0006("}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/e$a;", "", "<init>", "()V", "", "number", "", "g", "(I)Ljava/lang/String;", "currentDistance", "f", "minAge", "maxAge", "e", "(II)Ljava/lang/String;", "Lcom/p1/mobile/putong/data/User;", "user", "j", "(Lcom/p1/mobile/putong/data/User;)Ljava/lang/String;", "", "currentTime", "", "deadLineTime", RXScreenCaptureService.KEY_INDEX, "(JD)Ljava/lang/String;", "k", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lrx/c;", "", "Ll/pf60;", "h", "(Lcom/p1/mobile/android/app/Act;)Lrx/c;", "ONE_MINUTE", "I", "ONE_HOUR", "ONE_DAY", "ONE_WEAK", "ONE_MONTH", "ONE_YEAR", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public static List m59151a(pf60 pf60Var) {
            AllVisitors allVisitors;
            List<Visitor> list;
            VisitorInfo visitorInfo = (VisitorInfo) pf60Var.f152157b;
            ArrayList arrayList = null;
            if (visitorInfo != null && (allVisitors = visitorInfo.allVisitors) != null && (list = allVisitors.visitors) != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    List<Visitor> list2 = list;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (Visitor visitor : list2) {
                        arrayList.add(jyb.m147494Y(CoreModule.f18264c.f20410n2.m121463I3(visitor.userId), Integer.valueOf(visitor.visitCount)));
                    }
                }
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static List m59152b(pf60 pf60Var) {
            List<UnPrivilegedVisitor> list;
            VisitorInfo visitorInfo = (VisitorInfo) pf60Var.f152157b;
            ArrayList arrayList = null;
            if (visitorInfo != null && (list = visitorInfo.unprivilegedVisitors) != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    List<UnPrivilegedVisitor> list2 = list;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (UnPrivilegedVisitor unPrivilegedVisitor : list2) {
                        arrayList.add(jyb.m147494Y(CoreModule.f18264c.f20410n2.m121463I3(unPrivilegedVisitor.userId), Integer.valueOf(unPrivilegedVisitor.visitCount)));
                    }
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: c */
        public static List m59153c(Function1 function1, Object obj) {
            return (List) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: d */
        public static List m59154d(Function1 function1, Object obj) {
            return (List) function1.invoke(obj);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: e */
        public final String m59155e(int minAge, int maxAge) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format("%1$d - %2$d%3$s", Arrays.copyOf(new Object[]{Integer.valueOf(minAge), Integer.valueOf(maxAge), maxAge == afm0.INSTANCE.m97519e() ? Marker.ANY_NON_NULL_MARKER : ""}, 3));
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: f */
        public final String m59156f(int currentDistance) {
            int i = currentDistance / 1000;
            afm0.Companion c15702a = afm0.INSTANCE;
            if (i >= c15702a.m97517c() / 1000) {
                return (c15702a.m97517c() / 1000) + "km+";
            }
            if (i > c15702a.m97518d() / 1000) {
                return i + "km";
            }
            return "<" + (c15702a.m97518d() / 1000) + "km";
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: g */
        public final String m59157g(int number) {
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
        public final C22421c<List<pf60<User, Integer>>> m59158h(@NotNull Act act) {
            act.getClass();
            if (!CoreModule.m30933P().m143405a().mo180463f() || joa.m146357G3()) {
                C22421c c22421cDuringCreated = act.duringCreated(CoreModule.f18264c.f20410n2.m121481a4(CoreModule.m30929H().userId(), "list", "", false));
                final Function1 function1 = new Function1() { // from class: l.wgm0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C9212e.Companion.m59151a((pf60) obj);
                    }
                };
                C22421c<List<pf60<User, Integer>>> map = c22421cDuringCreated.map(new qcj() { // from class: l.xgm0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C9212e.Companion.m59153c(function1, obj);
                    }
                });
                map.getClass();
                return map;
            }
            C22421c c22421cDuringCreated2 = act.duringCreated(CoreModule.f18264c.f20410n2.m121497q4(false));
            final Function1 function2 = new Function1() { // from class: l.ugm0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C9212e.Companion.m59152b((pf60) obj);
                }
            };
            C22421c<List<pf60<User, Integer>>> map2 = c22421cDuringCreated2.map(new qcj() { // from class: l.vgm0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return C9212e.Companion.m59154d(function2, obj);
                }
            });
            map2.getClass();
            return map2;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: i */
        public final String m59159i(long currentTime, double deadLineTime) {
            App.f16088e.getClass();
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
        public final String m59160j(@NotNull User user) {
            user.getClass();
            if (!CoreModule.m30930K().hideActiveTime(user)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                return String.format("%s活跃", Arrays.copyOf(new Object[]{pzi0.m174442G(user.location.updatedTime)}, 1));
            }
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str = String.format("%s活跃", Arrays.copyOf(new Object[]{pzi0.m174442G(CoreModule.m30930K().mo31833vn(user))}, 1));
            return user.isMe() ? str.concat("（已冻结）") : str;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: k */
        public final String m59161k(@Nullable User user) {
            if (user == null) {
                return "";
            }
            Object objM175791W = CoreModule.m30930K().hideLocation(user) ? "" : q8g0.m175791W(user.location);
            objM175791W.getClass();
            return objM175791W.toString();
        }

        public Companion() {
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m59144a(int i, int i2) {
        return INSTANCE.m59155e(i, i2);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m59145b(int i) {
        return INSTANCE.m59156f(i);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m59146c(int i) {
        return INSTANCE.m59157g(i);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final C22421c<List<pf60<User, Integer>>> m59147d(@NotNull Act act) {
        return INSTANCE.m59158h(act);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m59148e(long j, double d) {
        return INSTANCE.m59159i(j, d);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m59149f(@NotNull User user) {
        return INSTANCE.m59160j(user);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m59150g(@Nullable User user) {
        return INSTANCE.m59161k(user);
    }
}
