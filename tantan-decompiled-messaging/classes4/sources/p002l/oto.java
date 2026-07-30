package p002l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.Gender;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import l.sab0;
import l.ura;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u000e\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00162\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001f\u0010 J-\u0010!\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010#R \u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00160\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020'0\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Ll/oto;", "", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "Ll/oto$b;", "c", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)Ljava/util/List;", "allPrivileges", "Ll/oto$a;", "b", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/List;)Ljava/util/List;", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/core/data/Privilege;", "currentTypePrivileges", "", "i", "(Ljava/util/ArrayList;)V", "", "groupDefinition", "a", "([Lcom/p1/mobile/putong/core/data/Privilege;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/List;)Ljava/util/List;", "privilege", "", "isUltraPremium", "f", "(Lcom/p1/mobile/putong/core/data/Privilege;Z)Lcom/p1/mobile/putong/core/data/Privilege;", "g", "(Lcom/p1/mobile/putong/core/data/Privilege;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/ArrayList;)Z", "h", "(Lcom/p1/mobile/putong/core/data/Privilege;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/util/List;)Z", "Lcom/p1/mobile/android/app/Act;", "d", "()[[Lcom/p1/mobile/putong/core/data/Privilege;", "groupDefinitions", "", "e", "()[Ljava/lang/String;", "groupTitles", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class oto {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    public oto(@NotNull Act act) {
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public final List<b> m19747a(Privilege[] groupDefinition, PurchaseType purchaseType, List<b> allPrivileges) {
        ArrayList arrayList = new ArrayList();
        boolean zV = sab0.v(purchaseType);
        CoreProviderInterface coreProviderInterfaceD = ura.e().d();
        for (Privilege privilege : groupDefinition) {
            if (privilege != Privilege.loveBuzz || coreProviderInterfaceD.R8()) {
                Privilege privilegeM19752f = m19752f(privilege, zV);
                arrayList.add(new b(privilegeM19752f, m19754h(privilegeM19752f, purchaseType, allPrivileges)));
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<a> m19748b(@NotNull PurchaseType purchaseType, @NotNull List<b> allPrivileges) {
        purchaseType.getClass();
        allPrivileges.getClass();
        Privilege[][] privilegeArrM19750d = m19750d();
        String[] strArrM19751e = m19751e();
        ArrayList arrayList = new ArrayList();
        int length = privilegeArrM19750d.length;
        for (int i = 0; i < length; i++) {
            arrayList.add(new a(strArrM19751e[i], m19747a(privilegeArrM19750d[i], purchaseType, allPrivileges)));
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<b> m19749c(@NotNull PurchaseType purchaseType) {
        purchaseType.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList<Privilege> privilegeDataForGP = purchaseType.getPrivilegeDataForGP((Gender) null);
        if (sab0.v(purchaseType)) {
            m19755i(privilegeDataForGP);
        }
        if (privilegeDataForGP != null) {
            Iterator<Privilege> it = privilegeDataForGP.iterator();
            it.getClass();
            while (it.hasNext()) {
                Privilege next = it.next();
                next.getClass();
                arrayList.add(new b(next, m19753g(next, purchaseType, privilegeDataForGP)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final Privilege[][] m19750d() {
        return new Privilege[][]{new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.premium_compliment, Privilege.immediately_match}, new Privilege[]{Privilege.see_who_likes_me, Privilege.boost, Privilege.intl_advanced_filter, Privilege.intl_visitor, Privilege.tribe, Privilege.loveBuzz}, new Privilege[]{Privilege.vip_undo, Privilege.vip_location, Privilege.message_read_state, Privilege.intl_no_ad, Privilege.vip_membership_active_time_gp, Privilege.vip_badge, Privilege.vip_membership_search_gp}};
    }

    /* JADX INFO: renamed from: e */
    public final String[] m19751e() {
        String string = this.act.getString(R.string.T3);
        string.getClass();
        String string2 = this.act.getString(R.string.U3);
        string2.getClass();
        String string3 = this.act.getString(R.string.V3);
        string3.getClass();
        return new String[]{string, string2, string3};
    }

    /* JADX INFO: renamed from: f */
    public final Privilege m19752f(Privilege privilege, boolean isUltraPremium) {
        if (!isUltraPremium) {
            return privilege;
        }
        int i = c.a[privilege.ordinal()];
        if (i == 1) {
            return Privilege.unlimit_free_super_like;
        }
        if (i != 2) {
            return i != 3 ? privilege : Privilege.ultra_premium_badge;
        }
        return Privilege.full_boost;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m19753g(Privilege privilege, PurchaseType purchaseType, ArrayList<Privilege> currentTypePrivileges) {
        if (ura.e().d().Oi() && sab0.w(purchaseType) && privilege == Privilege.vip_super_like) {
            return false;
        }
        if (sab0.w(purchaseType) && privilege == Privilege.premium_compliment) {
            return false;
        }
        return ((currentTypePrivileges == null || !currentTypePrivileges.contains(privilege)) && sab0.s(purchaseType) && (privilege == Privilege.vip_unlimited_likes || privilege == Privilege.see_who_likes_me)) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m19754h(Privilege privilege, PurchaseType purchaseType, List<b> allPrivileges) {
        List<b> list = allPrivileges;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (b bVar : list) {
            if (bVar.a() == privilege && bVar.b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m19755i(ArrayList<Privilege> currentTypePrivileges) {
        ArrayList privilegeDataForGP = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP((Gender) null);
        if (privilegeDataForGP == null || currentTypePrivileges == null) {
            return;
        }
        Iterator it = privilegeDataForGP.iterator();
        it.getClass();
        while (it.hasNext()) {
            Privilege privilege = (Privilege) it.next();
            if (!currentTypePrivileges.contains(privilege)) {
                currentTypePrivileges.add(privilege);
            }
        }
    }
}
