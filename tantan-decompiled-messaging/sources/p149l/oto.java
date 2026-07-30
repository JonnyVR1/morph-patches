package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u000e\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00162\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001f\u0010 J-\u0010!\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010#R \u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00160\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020'0\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, m87232d2 = {"Ll/oto;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "Ll/oto$b;", "c", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)Ljava/util/List;", "allPrivileges", "Ll/oto$a;", "b", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/List;)Ljava/util/List;", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/core/data/Privilege;", "currentTypePrivileges", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/util/ArrayList;)V", "", "groupDefinition", "a", "([Lcom/p1/mobile/putong/core/data/Privilege;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/List;)Ljava/util/List;", "privilege", "", "isUltraPremium", "f", "(Lcom/p1/mobile/putong/core/data/Privilege;Z)Lcom/p1/mobile/putong/core/data/Privilege;", "g", "(Lcom/p1/mobile/putong/core/data/Privilege;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/ArrayList;)Z", "h", "(Lcom/p1/mobile/putong/core/data/Privilege;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/List;)Z", "Lcom/p1/mobile/android/app/Act;", Constants.INAPP_DATA_TAG, "()[[Lcom/p1/mobile/putong/core/data/Privilege;", "groupDefinitions", "", "e", "()[Ljava/lang/String;", "groupTitles", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class oto {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: l.oto$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m87232d2 = {"Ll/oto$a;", "", "", "title", "", "Ll/oto$b;", "privileges", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* data */ class C19038a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final List<C19039b> privileges;

        public C19038a(@NotNull String str, @NotNull List<C19039b> list) {
            str.getClass();
            list.getClass();
            this.title = str;
            this.privileges = list;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<C19039b> m165960a() {
            return this.privileges;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C19038a)) {
                return false;
            }
            C19038a c19038a = (C19038a) other;
            return Intrinsics.m87488d(this.title, c19038a.title) && Intrinsics.m87488d(this.privileges, c19038a.privileges);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.privileges.hashCode();
        }

        @NotNull
        public String toString() {
            return "GroupInfo(title=" + this.title + ", privileges=" + this.privileges + ")";
        }
    }

    /* JADX INFO: renamed from: l.oto$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m87232d2 = {"Ll/oto$b;", "", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "", "isIncluded", "<init>", "(Lcom/p1/mobile/putong/core/data/Privilege;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/p1/mobile/putong/core/data/Privilege;", "()Lcom/p1/mobile/putong/core/data/Privilege;", "b", "Z", "()Z", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* data */ class C19039b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Privilege privilege;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final boolean isIncluded;

        public C19039b(@NotNull Privilege privilege, boolean z) {
            privilege.getClass();
            this.privilege = privilege;
            this.isIncluded = z;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Privilege getPrivilege() {
            return this.privilege;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsIncluded() {
            return this.isIncluded;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C19039b)) {
                return false;
            }
            C19039b c19039b = (C19039b) other;
            return this.privilege == c19039b.privilege && this.isIncluded == c19039b.isIncluded;
        }

        public int hashCode() {
            return (this.privilege.hashCode() * 31) + Boolean.hashCode(this.isIncluded);
        }

        @NotNull
        public String toString() {
            return "PrivilegeInfo(privilege=" + this.privilege + ", isIncluded=" + this.isIncluded + ")";
        }
    }

    /* JADX INFO: renamed from: l.oto$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C19040c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f145608a;

        static {
            int[] iArr = new int[Privilege.values().length];
            try {
                iArr[Privilege.vip_super_like.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Privilege.boost.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Privilege.vip_badge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f145608a = iArr;
        }
    }

    public oto(@NotNull Act act) {
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public final List<C19039b> m165951a(Privilege[] groupDefinition, PurchaseType purchaseType, List<C19039b> allPrivileges) {
        ArrayList arrayList = new ArrayList();
        boolean zM182904v = sab0.m182904v(purchaseType);
        CoreProviderInterface coreProviderInterfaceM195057d = ura.m195053e().m195057d();
        for (Privilege privilege : groupDefinition) {
            if (privilege != Privilege.loveBuzz || coreProviderInterfaceM195057d.mo33745R8()) {
                Privilege privilegeM165956f = m165956f(privilege, zM182904v);
                arrayList.add(new C19039b(privilegeM165956f, m165958h(privilegeM165956f, purchaseType, allPrivileges)));
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<C19038a> m165952b(@NotNull PurchaseType purchaseType, @NotNull List<C19039b> allPrivileges) {
        purchaseType.getClass();
        allPrivileges.getClass();
        Privilege[][] privilegeArrM165954d = m165954d();
        String[] strArrM165955e = m165955e();
        ArrayList arrayList = new ArrayList();
        int length = privilegeArrM165954d.length;
        for (int i = 0; i < length; i++) {
            arrayList.add(new C19038a(strArrM165955e[i], m165951a(privilegeArrM165954d[i], purchaseType, allPrivileges)));
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<C19039b> m165953c(@NotNull PurchaseType purchaseType) {
        purchaseType.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList<Privilege> privilegeDataForGP = purchaseType.getPrivilegeDataForGP(null);
        if (sab0.m182904v(purchaseType)) {
            m165959i(privilegeDataForGP);
        }
        if (privilegeDataForGP != null) {
            Iterator<Privilege> it = privilegeDataForGP.iterator();
            it.getClass();
            while (it.hasNext()) {
                Privilege next = it.next();
                next.getClass();
                arrayList.add(new C19039b(next, m165957g(next, purchaseType, privilegeDataForGP)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final Privilege[][] m165954d() {
        return new Privilege[][]{new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.premium_compliment, Privilege.immediately_match}, new Privilege[]{Privilege.see_who_likes_me, Privilege.boost, Privilege.intl_advanced_filter, Privilege.intl_visitor, Privilege.tribe, Privilege.loveBuzz}, new Privilege[]{Privilege.vip_undo, Privilege.vip_location, Privilege.message_read_state, Privilege.intl_no_ad, Privilege.vip_membership_active_time_gp, Privilege.vip_badge, Privilege.vip_membership_search_gp}};
    }

    /* JADX INFO: renamed from: e */
    public final String[] m165955e() {
        String string = this.act.getString(R$string.f27303T3);
        string.getClass();
        String string2 = this.act.getString(R$string.f27314U3);
        string2.getClass();
        String string3 = this.act.getString(R$string.f27325V3);
        string3.getClass();
        return new String[]{string, string2, string3};
    }

    /* JADX INFO: renamed from: f */
    public final Privilege m165956f(Privilege privilege, boolean isUltraPremium) {
        if (!isUltraPremium) {
            return privilege;
        }
        int i = C19040c.f145608a[privilege.ordinal()];
        if (i == 1) {
            return Privilege.unlimit_free_super_like;
        }
        if (i != 2) {
            return i != 3 ? privilege : Privilege.ultra_premium_badge;
        }
        return Privilege.full_boost;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m165957g(Privilege privilege, PurchaseType purchaseType, ArrayList<Privilege> currentTypePrivileges) {
        if (ura.m195053e().m195057d().mo33734Oi() && sab0.m182905w(purchaseType) && privilege == Privilege.vip_super_like) {
            return false;
        }
        if (sab0.m182905w(purchaseType) && privilege == Privilege.premium_compliment) {
            return false;
        }
        return ((currentTypePrivileges == null || !currentTypePrivileges.contains(privilege)) && sab0.m182901s(purchaseType) && (privilege == Privilege.vip_unlimited_likes || privilege == Privilege.see_who_likes_me)) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m165958h(Privilege privilege, PurchaseType purchaseType, List<C19039b> allPrivileges) {
        List<C19039b> list = allPrivileges;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (C19039b c19039b : list) {
            if (c19039b.getPrivilege() == privilege && c19039b.getIsIncluded()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m165959i(ArrayList<Privilege> currentTypePrivileges) {
        ArrayList<Privilege> privilegeDataForGP = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP(null);
        if (privilegeDataForGP == null || currentTypePrivileges == null) {
            return;
        }
        Iterator<Privilege> it = privilegeDataForGP.iterator();
        it.getClass();
        while (it.hasNext()) {
            Privilege next = it.next();
            if (!currentTypePrivileges.contains(next)) {
                currentTypePrivileges.add(next);
            }
        }
    }
}
