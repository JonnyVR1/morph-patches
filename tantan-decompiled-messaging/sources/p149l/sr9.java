package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.LikeFilterSortType;
import com.p046p1.mobile.putong.core.data.MemberZoneFilter;
import com.p046p1.mobile.putong.core.data.SeeInfos;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.SuperlikeReason;
import com.p046p1.mobile.putong.data.User;
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
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\r0\u001bj\b\u0012\u0004\u0012\u00020\r`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010%\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020&8\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010(¨\u0006,"}, m87232d2 = {"Ll/sr9;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "Lrx/c;", "Ll/q860;", "Lcom/p1/mobile/putong/data/User;", "i3", "()Lrx/c;", "Lcom/p1/mobile/putong/core/data/MemberZoneFilter;", "memberZoneFilter", "", "next", "lastReadTime", "Ll/roj0;", "j3", "(Lcom/p1/mobile/putong/core/data/MemberZoneFilter;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "h3", "(Lcom/p1/mobile/putong/core/data/MemberZoneFilter;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "g3", "(Lcom/p1/mobile/putong/core/data/MemberZoneFilter;Ljava/lang/String;)Ljava/lang/String;", "Lrx/subjects/a;", "R", "Lrx/subjects/a;", "memberZoneUsersBs", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", j6f.LATITUDE_SOUTH, "Ljava/util/HashSet;", "seeUpgradeUser", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/core/data/Conversation;", "Lkotlin/collections/ArrayList;", j6f.GPS_DIRECTION_TRUE, "Ljava/util/ArrayList;", "conversationsForUsers", "", "U", "I", "MaxRadius", j6f.GPS_MEASUREMENT_INTERRUPTED, "MaxAge", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class sr9 extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public final C22392a<q860<User>> memberZoneUsersBs;

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
    public sr9(@NotNull C4732c c4732c) {
        super(c4732c);
        c4732c.getClass();
        C22392a<q860<User>> c22392aM221513c = C22392a.m221513c(q860.m173342b());
        c22392aM221513c.getClass();
        this.memberZoneUsersBs = c22392aM221513c;
        this.seeUpgradeUser = new HashSet<>();
        this.conversationsForUsers = new ArrayList<>();
        this.MaxRadius = 100;
        this.MaxAge = 50;
    }

    /* JADX INFO: renamed from: a3 */
    public static C22306c m185624a3(final sr9 sr9Var, final MemberZoneFilter memberZoneFilter, final String str, final String str2) {
        la20 la20Var = new la20(new v9j() { // from class: l.nr9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return sr9.m185630k3(this.f140167a, memberZoneFilter, str, str2);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.or9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return sr9.m185631l3(this.f145241a, (Envelope) obj);
            }
        };
        C22306c c22306cCompose = la20Var.map(new w9j() { // from class: l.pr9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return sr9.m185632m3(function1, obj);
            }
        }).compose(mkd0.m154951C());
        final Function1 function2 = new Function1() { // from class: l.qr9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return sr9.m185633n3(str, sr9Var, (Envelope) obj);
            }
        };
        return c22306cCompose.map(new w9j() { // from class: l.rr9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return sr9.m185634o3(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public static final stc0 m185630k3(sr9 sr9Var, MemberZoneFilter memberZoneFilter, String str, String str2) {
        return C4728a.f19494P.auth().m185898q(sr9Var.m185636h3(memberZoneFilter, str, str2)).m185883b();
    }

    /* JADX INFO: renamed from: l3 */
    public static final Envelope m185631l3(sr9 sr9Var, Envelope envelope) {
        sr9Var.f72126Q.m31492w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: m3 */
    public static final Envelope m185632m3(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n3 */
    public static final roj0 m185633n3(String str, sr9 sr9Var, Envelope envelope) {
        DbLinks dbLinks = new DbLinks();
        Pagination pagination = envelope.pagination;
        dbLinks.total = pagination.total;
        dbLinks.links = pagination.links;
        ArrayList arrayList = new ArrayList();
        if (str != null && str.length() > 0 && NullChecker.m81303a(sr9Var.memberZoneUsersBs.m221516f())) {
            arrayList.addAll(sr9Var.memberZoneUsersBs.m221515e().f153135a);
        }
        if (str != null && str.length() == 0) {
            sr9Var.seeUpgradeUser.clear();
            sr9Var.conversationsForUsers.clear();
        }
        List<SeeInfos> list = ((CoreData) envelope.getModuleData(CoreData.class)).seeInfos;
        list.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            sr9Var.seeUpgradeUser.add(((SeeInfos) it.next()).userId);
        }
        ArrayList<Conversation> arrayList2 = sr9Var.conversationsForUsers;
        arrayList2.addAll(((CoreData) envelope.getModuleData(CoreData.class)).conversations);
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (hashSet.add(((Conversation) obj).f56011id)) {
                arrayList3.add(obj);
            }
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        arrayList.addAll(((CommonData) envelope.getModuleData(CommonData.class)).users);
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet2.add(((User) obj2).f56011id)) {
                arrayList4.add(obj2);
            }
        }
        arrayList.clear();
        arrayList.addAll(arrayList4);
        sr9Var.memberZoneUsersBs.m132487l(new q860<>(arrayList, dbLinks));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: o3 */
    public static final roj0 m185634o3(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g3 */
    public final String m185635g3(MemberZoneFilter memberZoneFilter, String next) {
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
    public final String m185636h3(MemberZoneFilter memberZoneFilter, String next, String lastReadTime) {
        if (memberZoneFilter.matched) {
            String strM31366w2 = C4728a.m31366w2("?search=match&" + m185635g3(memberZoneFilter, next) + "&verified=true&last_read_time=" + lastReadTime);
            strM31366w2.getClass();
            return strM31366w2;
        }
        String strM31177A0 = C4728a.m31177A0(m185635g3(memberZoneFilter, next) + "&verified=true&last_read_time=" + lastReadTime);
        strM31177A0.getClass();
        return strM31177A0;
    }

    @NotNull
    /* JADX INFO: renamed from: i3 */
    public final C22306c<q860<User>> m185637i3() {
        C22306c<q860<User>> c22306cAsObservable = this.memberZoneUsersBs.asObservable();
        c22306cAsObservable.getClass();
        return c22306cAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: j3 */
    public final C22306c<roj0> m185638j3(@NotNull final MemberZoneFilter memberZoneFilter, @Nullable final String next, @NotNull final String lastReadTime) {
        memberZoneFilter.getClass();
        lastReadTime.getClass();
        C22306c<roj0> c22306cScheduled = this.f72126Q.scheduled("member_zone_users_" + CoreModule.m29931H().userId(), 0, new v9j() { // from class: l.mr9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return sr9.m185624a3(this.f135347a, memberZoneFilter, next, lastReadTime);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }
}
