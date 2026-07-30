package p009l;

import android.content.Intent;
import com.p000p1.mobile.putong.p004ui.mediapicker.MediaPickerBaseAct;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.c;
import com.p1.mobile.putong.core.data.Item;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.User;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import l.ark;
import l.h6a;
import l.n3b0;
import l.u59;
import l.vpx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003J\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 R(\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001b\"\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010'R\u001b\u0010+\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010\u0006¨\u0006,"}, d2 = {"Ll/qqh0;", "", "<init>", "()V", "", "i", "()Z", "", "j", "Lcom/p1/mobile/putong/data/User;", "user", "", "d", "(Lcom/p1/mobile/putong/data/User;)I", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "f", "(Lcom/p1/mobile/putong/data/User;)Ljava/util/List;", "Lcom/p1/mobile/android/app/Frag;", "frag", "k", "(Lcom/p1/mobile/android/app/Frag;)V", "", "e", "()J", "Lcom/p1/mobile/putong/core/data/Item;", "h", "()Ljava/util/List;", "", "name", "rank", "b", "(Ljava/lang/String;I)Lcom/p1/mobile/putong/core/data/Item;", "a", "Ljava/util/List;", "g", "setServiceList", "(Ljava/util/List;)V", "serviceList", "Ljava/lang/Boolean;", "isTest", "c", "Lkotlin/Lazy;", "allNewUI", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class qqh0 {

    @NotNull
    public static final qqh0 INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static List<Item> serviceList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static Boolean isTest;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Lazy allNewUI;

    /* JADX INFO: renamed from: l.qqh0$a */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"l/qqh0$a", "Lcom/p1/mobile/android/app/a$a;", "", "requestCode", "resultCode", "Landroid/content/Intent;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "", "a", "(IILandroid/content/Intent;)Z", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1151a implements a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Frag f19462a;

        public C1151a(Frag frag) {
            this.f19462a = frag;
        }

        /* JADX INFO: renamed from: a */
        public boolean m21185a(int requestCode, int resultCode, Intent data) {
            if (resultCode != -1) {
                return false;
            }
            Serializable serializableExtra = data != null ? data.getSerializableExtra(MediaPickerBaseAct.f8209h) : null;
            serializableExtra.getClass();
            ark.L0(this.f19462a.act(), (ArrayList) serializableExtra);
            return true;
        }
    }

    static {
        qqh0 qqh0Var = new qqh0();
        INSTANCE = qqh0Var;
        serviceList = qqh0Var.m21181h();
        allNewUI = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.pqh0
            public final Object invoke() {
                return Boolean.valueOf(qqh0.m21174a());
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static boolean m21174a() {
        return u59.r();
    }

    /* JADX INFO: renamed from: b */
    public final Item m21175b(String name, int rank) {
        Item itemNew_ = Item.new_();
        itemNew_.name = name;
        itemNew_.rank = rank;
        return itemNew_;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m21176c() {
        return ((Boolean) allNewUI.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final int m21177d(@NotNull User user) {
        user.getClass();
        boolean zQ4 = CoreModule.c.j0.Q4();
        List<PurchaseType> listM21179f = m21179f(user);
        boolean z = listM21179f.size() == 4;
        if (zQ4 || !z) {
            return -1;
        }
        return listM21179f.indexOf(CoreModule.c.p0.d3());
    }

    /* JADX INFO: renamed from: e */
    public final long m21178e() {
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(11);
        int i4 = calendar.get(5);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(i, i2, i4, 12, 0, 0);
        return i3 >= 12 ? calendar2.getTimeInMillis() + 86400000 : calendar2.getTimeInMillis();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<PurchaseType> m21179f(@NotNull User user) {
        user.getClass();
        ArrayList arrayList = new ArrayList();
        boolean z = user.isVIP() || user.isSVIP();
        boolean z2 = !n3b0.s((Counter) null, 1, (Object) null) || user.isSVIP();
        if (CoreModule.c.j0.Q4()) {
            List listZ = u59.z();
            listZ.getClass();
            arrayList.addAll(listZ);
        } else {
            List listB = u59.B();
            listB.getClass();
            arrayList.addAll(listB);
        }
        if (z) {
            PurchaseType purchaseType = PurchaseType.TYPE_GET_VIP;
            if (arrayList.contains(purchaseType)) {
                arrayList.remove(purchaseType);
            }
        }
        if (z2) {
            PurchaseType purchaseType2 = PurchaseType.TYPE_GET_LIKERS;
            if (arrayList.contains(purchaseType2)) {
                arrayList.remove(purchaseType2);
            }
        }
        if (u59.O() && (z || z2)) {
            c cVar = CoreModule.c;
            if (cVar.G2.R != null && cVar.j0.P4()) {
                arrayList.remove(PurchaseType.TYPE_GET_VIP);
                arrayList.remove(PurchaseType.TYPE_GET_LIKERS);
            }
        }
        if ((z && z2) || !u59.S()) {
            PurchaseType purchaseType3 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            if (arrayList.contains(purchaseType3) && (!h6a.c() || !CoreModule.c.G2.l3(purchaseType3) || !CoreModule.c.j0.P4())) {
                arrayList.remove(purchaseType3);
            }
        }
        if ((!user.isUltraPremium() && u59.U()) || (h6a.c() && CoreModule.c.G2.l3(PurchaseType.TYPE_ULTRA_PREMIUM) && CoreModule.c.j0.P4())) {
            return arrayList;
        }
        arrayList.remove(PurchaseType.TYPE_ULTRA_PREMIUM);
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<Item> m21180g() {
        return serviceList.isEmpty() ? m21181h() : serviceList;
    }

    /* JADX INFO: renamed from: h */
    public final List<Item> m21181h() {
        ArrayList arrayList = new ArrayList();
        if (IntlCountryCodeController.t()) {
            arrayList.add(m21175b("see", 1));
            arrayList.add(m21175b("subscription", 2));
            return arrayList;
        }
        arrayList.add(m21175b("see", 1));
        arrayList.add(m21175b("visitor", 2));
        arrayList.add(m21175b("likes", 3));
        arrayList.add(m21175b("subscription", 4));
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m21182i() {
        return m21176c();
    }

    /* JADX INFO: renamed from: j */
    public final void m21183j() {
        isTest = null;
        m21180g().clear();
    }

    /* JADX INFO: renamed from: k */
    public final void m21184k(@NotNull Frag frag) {
        frag.getClass();
        vpx vpxVar = new vpx();
        vpxVar.a = 1;
        vpxVar.c = false;
        vpxVar.b = false;
        vpxVar.d = true;
        vpxVar.f = MediaPickerAct.D;
        vpxVar.h = true;
        vpxVar.i = CoreModule.c.e0.p9().gender;
        vpxVar.k = true;
        frag.k0(MediaPickerAct.k2(frag.act(), vpxVar), new C1151a(frag));
    }
}
