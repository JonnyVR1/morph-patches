package p006l;

import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.MemberZoneFilter;
import com.p1.mobile.putong.core.data.SeeInfos;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Pagination;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import l.mkd0;
import l.q860;
import l.roj0;
import l.stc0;
import l.v9j;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\r0\u001bj\b\u0012\u0004\u0012\u00020\r`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010%\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020&8\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010(¨\u0006,"}, d2 = {"Ll/sr9;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "Lrx/c;", "Ll/q860;", "Lcom/p1/mobile/putong/data/User;", "i3", "()Lrx/c;", "Lcom/p1/mobile/putong/core/data/MemberZoneFilter;", "memberZoneFilter", "", "next", "lastReadTime", "Ll/roj0;", "j3", "(Lcom/p1/mobile/putong/core/data/MemberZoneFilter;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "h3", "(Lcom/p1/mobile/putong/core/data/MemberZoneFilter;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "g3", "(Lcom/p1/mobile/putong/core/data/MemberZoneFilter;Ljava/lang/String;)Ljava/lang/String;", "Lrx/subjects/a;", "R", "Lrx/subjects/a;", "memberZoneUsersBs", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "S", "Ljava/util/HashSet;", "seeUpgradeUser", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/core/data/Conversation;", "Lkotlin/collections/ArrayList;", "T", "Ljava/util/ArrayList;", "conversationsForUsers", "", "U", "I", "MaxRadius", "V", "MaxAge", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class sr9 extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public final a<q860<User>> memberZoneUsersBs;

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
    public sr9(@NotNull C0158c c0158c) {
        super(c0158c);
        c0158c.getClass();
        a<q860<User>> aVarC = a.c(q860.b());
        aVarC.getClass();
        this.memberZoneUsersBs = aVarC;
        this.seeUpgradeUser = new HashSet<>();
        this.conversationsForUsers = new ArrayList<>();
        this.MaxRadius = 100;
        this.MaxAge = 50;
    }

    /* JADX INFO: renamed from: a3 */
    public static c m24130a3(final sr9 sr9Var, final MemberZoneFilter memberZoneFilter, final String str, final String str2) {
        la20 la20Var = new la20(new v9j() { // from class: l.nr9
            public final Object call() {
                return sr9.m24136k3(this.f17819a, memberZoneFilter, str, str2);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.or9
            public final Object invoke(Object obj) {
                return sr9.m24137l3(this.f18348a, (Envelope) obj);
            }
        };
        c cVarCompose = la20Var.map(new w9j() { // from class: l.pr9
            public final Object call(Object obj) {
                return sr9.m24138m3(function1, obj);
            }
        }).compose(mkd0.C());
        final Function1 function2 = new Function1() { // from class: l.qr9
            public final Object invoke(Object obj) {
                return sr9.m24139n3(str, sr9Var, (Envelope) obj);
            }
        };
        return cVarCompose.map(new w9j() { // from class: l.rr9
            public final Object call(Object obj) {
                return sr9.m24140o3(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public static final stc0 m24136k3(sr9 sr9Var, MemberZoneFilter memberZoneFilter, String str, String str2) {
        return C0154a.f3483P.auth().q(sr9Var.m24142h3(memberZoneFilter, str, str2)).b();
    }

    /* JADX INFO: renamed from: l3 */
    public static final Envelope m24137l3(sr9 sr9Var, Envelope envelope) {
        sr9Var.f8580Q.m3422w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: m3 */
    public static final Envelope m24138m3(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n3 */
    public static final roj0 m24139n3(String str, sr9 sr9Var, Envelope envelope) {
        DbLinks dbLinks = new DbLinks();
        Pagination pagination = envelope.pagination;
        dbLinks.total = pagination.total;
        dbLinks.links = pagination.links;
        ArrayList arrayList = new ArrayList();
        if (str != null && str.length() > 0 && NullChecker.a(sr9Var.memberZoneUsersBs.f())) {
            arrayList.addAll(((q860) sr9Var.memberZoneUsersBs.e()).a);
        }
        if (str != null && str.length() == 0) {
            sr9Var.seeUpgradeUser.clear();
            sr9Var.conversationsForUsers.clear();
        }
        List list = envelope.getModuleData(CoreData.class).seeInfos;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sr9Var.seeUpgradeUser.add(((SeeInfos) it.next()).userId);
        }
        ArrayList<Conversation> arrayList2 = sr9Var.conversationsForUsers;
        arrayList2.addAll(envelope.getModuleData(CoreData.class).conversations);
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (hashSet.add(((DbObject) ((Conversation) obj)).id)) {
                arrayList3.add(obj);
            }
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        arrayList.addAll(envelope.getModuleData(CommonData.class).users);
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet2.add(((DbObject) ((User) obj2)).id)) {
                arrayList4.add(obj2);
            }
        }
        arrayList.clear();
        arrayList.addAll(arrayList4);
        sr9Var.memberZoneUsersBs.onNext(new q860(arrayList, dbLinks));
        return roj0.a;
    }

    /* JADX INFO: renamed from: o3 */
    public static final roj0 m24140o3(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g3 */
    public final String m24141g3(MemberZoneFilter memberZoneFilter, String next) {
        StringBuilder sb = new StringBuilder("min_age=" + memberZoneFilter.min_age);
        ArrayList arrayList = new ArrayList();
        if (memberZoneFilter.realFace) {
            arrayList.add("realFace");
        }
        if (memberZoneFilter.online) {
            arrayList.add("online");
        }
        if (memberZoneFilter.popular) {
            arrayList.add("popular");
        }
        if (memberZoneFilter.certification) {
            arrayList.add("certification");
        }
        if (memberZoneFilter.richMedia) {
            arrayList.add("richMedia");
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.toList(arrayList), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        if (strJoinToString$default.length() > 0) {
            sb.append("&filter_type=" + strJoinToString$default);
        }
        int i = memberZoneFilter.radius;
        if (i != this.MaxRadius) {
            sb.append("&radius=" + (i * AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO));
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
    public final String m24142h3(MemberZoneFilter memberZoneFilter, String next, String lastReadTime) {
        if (memberZoneFilter.matched) {
            String strM3296w2 = C0154a.m3296w2("?search=match&" + m24141g3(memberZoneFilter, next) + "&verified=true&last_read_time=" + lastReadTime);
            strM3296w2.getClass();
            return strM3296w2;
        }
        String strM3107A0 = C0154a.m3107A0(m24141g3(memberZoneFilter, next) + "&verified=true&last_read_time=" + lastReadTime);
        strM3107A0.getClass();
        return strM3107A0;
    }

    @NotNull
    /* JADX INFO: renamed from: i3 */
    public final c<q860<User>> m24143i3() {
        c<q860<User>> cVarAsObservable = this.memberZoneUsersBs.asObservable();
        cVarAsObservable.getClass();
        return cVarAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: j3 */
    public final c<roj0> m24144j3(@NotNull final MemberZoneFilter memberZoneFilter, @Nullable final String next, @NotNull final String lastReadTime) {
        memberZoneFilter.getClass();
        lastReadTime.getClass();
        c<roj0> cVarScheduled = this.f8580Q.scheduled("member_zone_users_" + CoreModule.m1850H().userId(), 0, new v9j() { // from class: l.mr9
            public final Object call() {
                return sr9.m24130a3(this.f17206a, memberZoneFilter, next, lastReadTime);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }
}
