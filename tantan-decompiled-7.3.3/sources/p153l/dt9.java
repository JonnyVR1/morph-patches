package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.LikeFilterSortType;
import com.p051p1.mobile.putong.core.data.MemberZoneFilter;
import com.p051p1.mobile.putong.core.data.SeeInfos;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.SuperlikeReason;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\r0\u001bj\b\u0012\u0004\u0012\u00020\r`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010%\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020&8\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010(¨\u0006,"}, m88121d2 = {"Ll/dt9;", "Ll/dy6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "Lrx/c;", "Ll/vg60;", "Lcom/p1/mobile/putong/data/User;", "i3", "()Lrx/c;", "Lcom/p1/mobile/putong/core/data/MemberZoneFilter;", "memberZoneFilter", "", "next", "lastReadTime", "Ll/uxj0;", "j3", "(Lcom/p1/mobile/putong/core/data/MemberZoneFilter;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "h3", "(Lcom/p1/mobile/putong/core/data/MemberZoneFilter;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "g3", "(Lcom/p1/mobile/putong/core/data/MemberZoneFilter;Ljava/lang/String;)Ljava/lang/String;", "Lrx/subjects/a;", "R", "Lrx/subjects/a;", "memberZoneUsersBs", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", p7f.LATITUDE_SOUTH, "Ljava/util/HashSet;", "seeUpgradeUser", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/core/data/Conversation;", "Lkotlin/collections/ArrayList;", p7f.GPS_DIRECTION_TRUE, "Ljava/util/ArrayList;", "conversationsForUsers", "", "U", "I", "MaxRadius", p7f.GPS_MEASUREMENT_INTERRUPTED, "MaxAge", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class dt9 extends dy6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public final C22507a<vg60<User>> memberZoneUsersBs;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public final HashSet<String> seeUpgradeUser;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<Conversation> conversationsForUsers;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public final int MaxRadius;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public final int MaxAge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt9(@NotNull C4883c c4883c) {
        super(c4883c);
        c4883c.getClass();
        C22507a<vg60<User>> c22507aM222759c = C22507a.m222759c(vg60.m201220b());
        c22507aM222759c.getClass();
        this.memberZoneUsersBs = c22507aM222759c;
        this.seeUpgradeUser = new HashSet<>();
        this.conversationsForUsers = new ArrayList<>();
        this.MaxRadius = 100;
        this.MaxAge = 50;
    }

    /* JADX INFO: renamed from: a3 */
    public static C22421c m117823a3(final dt9 dt9Var, final MemberZoneFilter memberZoneFilter, final String str, final String str2) {
        ti20 ti20Var = new ti20(new pcj() { // from class: l.ys9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dt9.m117829k3(this.f201377a, memberZoneFilter, str, str2);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.zs9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dt9.m117830l3(this.f205853a, (Envelope) obj);
            }
        };
        C22421c c22421cCompose = ti20Var.map(new qcj() { // from class: l.at9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return dt9.m117831m3(function1, obj);
            }
        }).compose(psd0.m173592C());
        final Function1 function2 = new Function1() { // from class: l.bt9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dt9.m117832n3(str, dt9Var, (Envelope) obj);
            }
        };
        return c22421cCompose.map(new qcj() { // from class: l.ct9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return dt9.m117833o3(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public static final x1d0 m117829k3(dt9 dt9Var, MemberZoneFilter memberZoneFilter, String str, String str2) {
        return C4879a.f20236P.auth().m209043q(dt9Var.m117835h3(memberZoneFilter, str, str2)).m209028b();
    }

    /* JADX INFO: renamed from: l3 */
    public static final Envelope m117830l3(dt9 dt9Var, Envelope envelope) {
        dt9Var.f91137Q.m32495w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: m3 */
    public static final Envelope m117831m3(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n3 */
    public static final uxj0 m117832n3(String str, dt9 dt9Var, Envelope envelope) {
        DbLinks dbLinks = new DbLinks();
        Pagination pagination = envelope.pagination;
        dbLinks.total = pagination.total;
        dbLinks.links = pagination.links;
        ArrayList arrayList = new ArrayList();
        if (str != null && str.length() > 0 && NullChecker.m82486a(dt9Var.memberZoneUsersBs.m222762f())) {
            arrayList.addAll(dt9Var.memberZoneUsersBs.m222761e().f184001a);
        }
        if (str != null && str.length() == 0) {
            dt9Var.seeUpgradeUser.clear();
            dt9Var.conversationsForUsers.clear();
        }
        List<SeeInfos> list = ((CoreData) envelope.getModuleData(CoreData.class)).seeInfos;
        list.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            dt9Var.seeUpgradeUser.add(((SeeInfos) it.next()).userId);
        }
        ArrayList<Conversation> arrayList2 = dt9Var.conversationsForUsers;
        arrayList2.addAll(((CoreData) envelope.getModuleData(CoreData.class)).conversations);
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (hashSet.add(((Conversation) obj).f56859id)) {
                arrayList3.add(obj);
            }
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        arrayList.addAll(((CommonData) envelope.getModuleData(CommonData.class)).users);
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet2.add(((User) obj2).f56859id)) {
                arrayList4.add(obj2);
            }
        }
        arrayList.clear();
        arrayList.addAll(arrayList4);
        dt9Var.memberZoneUsersBs.m137019l(new vg60<>(arrayList, dbLinks));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: o3 */
    public static final uxj0 m117833o3(Function1 function1, Object obj) {
        return (uxj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g3 */
    public final String m117834g3(MemberZoneFilter memberZoneFilter, String next) {
        StringBuilder sb = new StringBuilder("min_age=" + memberZoneFilter.min_age);
        ArrayList arrayList = new ArrayList();
        if (memberZoneFilter.realFace) {
            arrayList.add(LikeFilterSortType.realFace);
        }
        if (memberZoneFilter.online) {
            arrayList.add("online");
        }
        if (memberZoneFilter.popular) {
            arrayList.add(SuperlikeReason.popular);
        }
        if (memberZoneFilter.certification) {
            arrayList.add("certification");
        }
        if (memberZoneFilter.richMedia) {
            arrayList.add("richMedia");
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.toList(arrayList), Constants.SEPARATOR_COMMA, null, null, 0, null, null, 62, null);
        if (strJoinToString$default.length() > 0) {
            sb.append("&filter_type=" + strJoinToString$default);
        }
        int i = memberZoneFilter.radius;
        if (i != this.MaxRadius) {
            sb.append("&radius=" + (i * 1000));
        }
        int i2 = memberZoneFilter.max_age;
        if (i2 != this.MaxAge) {
            sb.append("&max_age=" + i2);
        }
        sb.append("&limit=20");
        if (next != null && next.length() > 0) {
            sb.append("&" + next);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h3 */
    public final String m117835h3(MemberZoneFilter memberZoneFilter, String next, String lastReadTime) {
        if (memberZoneFilter.matched) {
            String strM32369w2 = C4879a.m32369w2("?search=match&" + m117834g3(memberZoneFilter, next) + "&verified=true&last_read_time=" + lastReadTime);
            strM32369w2.getClass();
            return strM32369w2;
        }
        String strM32180A0 = C4879a.m32180A0(m117834g3(memberZoneFilter, next) + "&verified=true&last_read_time=" + lastReadTime);
        strM32180A0.getClass();
        return strM32180A0;
    }

    @NotNull
    /* JADX INFO: renamed from: i3 */
    public final C22421c<vg60<User>> m117836i3() {
        C22421c<vg60<User>> c22421cAsObservable = this.memberZoneUsersBs.asObservable();
        c22421cAsObservable.getClass();
        return c22421cAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: j3 */
    public final C22421c<uxj0> m117837j3(@NotNull final MemberZoneFilter memberZoneFilter, @Nullable final String next, @NotNull final String lastReadTime) {
        memberZoneFilter.getClass();
        lastReadTime.getClass();
        C22421c<uxj0> c22421cScheduled = this.f91137Q.scheduled("member_zone_users_" + CoreModule.m30929H().userId(), 0, new pcj() { // from class: l.xs9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dt9.m117823a3(this.f196069a, memberZoneFilter, next, lastReadTime);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }
}
