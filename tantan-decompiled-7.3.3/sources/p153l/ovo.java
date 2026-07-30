package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u000e\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00162\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001f\u0010 J-\u0010!\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010#R \u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00160\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020'0\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, m88121d2 = {"Ll/ovo;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "Ll/ovo$b;", "c", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)Ljava/util/List;", "allPrivileges", "Ll/ovo$a;", "b", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/List;)Ljava/util/List;", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/core/data/Privilege;", "currentTypePrivileges", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/util/ArrayList;)V", "", "groupDefinition", "a", "([Lcom/p1/mobile/putong/core/data/Privilege;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/List;)Ljava/util/List;", "privilege", "", "isUltraPremium", "f", "(Lcom/p1/mobile/putong/core/data/Privilege;Z)Lcom/p1/mobile/putong/core/data/Privilege;", "g", "(Lcom/p1/mobile/putong/core/data/Privilege;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/ArrayList;)Z", "h", "(Lcom/p1/mobile/putong/core/data/Privilege;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/List;)Z", "Lcom/p1/mobile/android/app/Act;", Constants.INAPP_DATA_TAG, "()[[Lcom/p1/mobile/putong/core/data/Privilege;", "groupDefinitions", "", "e", "()[Ljava/lang/String;", "groupTitles", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ovo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: l.ovo$a */
    @Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Ll/ovo$a;", "", "", "title", "", "Ll/ovo$b;", "privileges", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* data */ class C19228a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final List<C19229b> privileges;

        public C19228a(@NotNull String str, @NotNull List<C19229b> list) {
            str.getClass();
            list.getClass();
            this.title = str;
            this.privileges = list;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<C19229b> m169479a() {
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
            if (!(other instanceof C19228a)) {
                return false;
            }
            C19228a c19228a = (C19228a) other;
            return Intrinsics.m88377d(this.title, c19228a.title) && Intrinsics.m88377d(this.privileges, c19228a.privileges);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.privileges.hashCode();
        }

        @NotNull
        public String toString() {
            return "GroupInfo(title=" + this.title + ", privileges=" + this.privileges + ")";
        }
    }

    /* JADX INFO: renamed from: l.ovo$b */
    @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Ll/ovo$b;", "", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "", "isIncluded", "<init>", "(Lcom/p1/mobile/putong/core/data/Privilege;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/p1/mobile/putong/core/data/Privilege;", "()Lcom/p1/mobile/putong/core/data/Privilege;", "b", "Z", "()Z", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* data */ class C19229b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Privilege privilege;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final boolean isIncluded;

        public C19229b(@NotNull Privilege privilege, boolean z) {
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
            if (!(other instanceof C19229b)) {
                return false;
            }
            C19229b c19229b = (C19229b) other;
            return this.privilege == c19229b.privilege && this.isIncluded == c19229b.isIncluded;
        }

        public int hashCode() {
            return (this.privilege.hashCode() * 31) + Boolean.hashCode(this.isIncluded);
        }

        @NotNull
        public String toString() {
            return "PrivilegeInfo(privilege=" + this.privilege + ", isIncluded=" + this.isIncluded + ")";
        }
    }

    /* JADX INFO: renamed from: l.ovo$c */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C19230c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f149292a;

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
            f149292a = iArr;
        }
    }

    public ovo(@NotNull Act act) {
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public final List<C19229b> m169470a(Privilege[] groupDefinition, PurchaseType purchaseType, List<C19229b> allPrivileges) {
        ArrayList arrayList = new ArrayList();
        boolean zM206578v = wib0.m206578v(purchaseType);
        CoreProviderInterface coreProviderInterfaceM132214d = gta.m132210e().m132214d();
        for (Privilege privilege : groupDefinition) {
            if (privilege != Privilege.loveBuzz || coreProviderInterfaceM132214d.mo34748R8()) {
                Privilege privilegeM169475f = m169475f(privilege, zM206578v);
                arrayList.add(new C19229b(privilegeM169475f, m169477h(privilegeM169475f, purchaseType, allPrivileges)));
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<C19228a> m169471b(@NotNull PurchaseType purchaseType, @NotNull List<C19229b> allPrivileges) {
        purchaseType.getClass();
        allPrivileges.getClass();
        Privilege[][] privilegeArrM169473d = m169473d();
        String[] strArrM169474e = m169474e();
        ArrayList arrayList = new ArrayList();
        int length = privilegeArrM169473d.length;
        for (int i = 0; i < length; i++) {
            arrayList.add(new C19228a(strArrM169474e[i], m169470a(privilegeArrM169473d[i], purchaseType, allPrivileges)));
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<C19229b> m169472c(@NotNull PurchaseType purchaseType) {
        purchaseType.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList<Privilege> privilegeDataForGP = purchaseType.getPrivilegeDataForGP(null);
        if (wib0.m206578v(purchaseType)) {
            m169478i(privilegeDataForGP);
        }
        if (privilegeDataForGP != null) {
            Iterator<Privilege> it = privilegeDataForGP.iterator();
            it.getClass();
            while (it.hasNext()) {
                Privilege next = it.next();
                next.getClass();
                arrayList.add(new C19229b(next, m169476g(next, purchaseType, privilegeDataForGP)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final Privilege[][] m169473d() {
        return new Privilege[][]{new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.premium_compliment, Privilege.immediately_match}, new Privilege[]{Privilege.see_who_likes_me, Privilege.boost, Privilege.intl_advanced_filter, Privilege.intl_visitor, Privilege.tribe, Privilege.loveBuzz}, new Privilege[]{Privilege.vip_undo, Privilege.vip_location, Privilege.message_read_state, Privilege.intl_no_ad, Privilege.vip_membership_active_time_gp, Privilege.vip_badge, Privilege.vip_membership_search_gp}};
    }

    /* JADX INFO: renamed from: e */
    public final String[] m169474e() {
        String string = this.act.getString(R$string.f28151T3);
        string.getClass();
        String string2 = this.act.getString(R$string.f28162U3);
        string2.getClass();
        String string3 = this.act.getString(R$string.f28173V3);
        string3.getClass();
        return new String[]{string, string2, string3};
    }

    /* JADX INFO: renamed from: f */
    public final Privilege m169475f(Privilege privilege, boolean isUltraPremium) {
        if (!isUltraPremium) {
            return privilege;
        }
        int i = C19230c.f149292a[privilege.ordinal()];
        if (i == 1) {
            return Privilege.unlimit_free_super_like;
        }
        if (i != 2) {
            return i != 3 ? privilege : Privilege.ultra_premium_badge;
        }
        return Privilege.full_boost;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m169476g(Privilege privilege, PurchaseType purchaseType, ArrayList<Privilege> currentTypePrivileges) {
        if (gta.m132210e().m132214d().mo34737Oi() && wib0.m206579w(purchaseType) && privilege == Privilege.vip_super_like) {
            return false;
        }
        if (wib0.m206579w(purchaseType) && privilege == Privilege.premium_compliment) {
            return false;
        }
        return ((currentTypePrivileges == null || !currentTypePrivileges.contains(privilege)) && wib0.m206575s(purchaseType) && (privilege == Privilege.vip_unlimited_likes || privilege == Privilege.see_who_likes_me)) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m169477h(Privilege privilege, PurchaseType purchaseType, List<C19229b> allPrivileges) {
        List<C19229b> list = allPrivileges;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (C19229b c19229b : list) {
            if (c19229b.getPrivilege() == privilege && c19229b.getIsIncluded()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m169478i(ArrayList<Privilege> currentTypePrivileges) {
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
