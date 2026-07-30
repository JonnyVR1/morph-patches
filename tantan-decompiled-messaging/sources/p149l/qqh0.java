package p149l;

import android.content.Intent;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Visitor;
import com.p046p1.mobile.putong.live.base.data.BLivePkCategory;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003J\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 R(\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001b\"\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010'R\u001b\u0010+\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010\u0006¨\u0006,"}, m87232d2 = {"Ll/qqh0;", "", "<init>", "()V", "", RXScreenCaptureService.KEY_INDEX, "()Z", "", "j", "Lcom/p1/mobile/putong/data/User;", "user", "", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/data/User;)I", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "f", "(Lcom/p1/mobile/putong/data/User;)Ljava/util/List;", "Lcom/p1/mobile/android/app/Frag;", "frag", "k", "(Lcom/p1/mobile/android/app/Frag;)V", "", "e", "()J", "Lcom/p1/mobile/putong/core/data/Item;", "h", "()Ljava/util/List;", "", AuthenticationTokenClaims.JSON_KEY_NAME, BLivePkCategory.rank, "b", "(Ljava/lang/String;I)Lcom/p1/mobile/putong/core/data/Item;", "a", "Ljava/util/List;", "g", "setServiceList", "(Ljava/util/List;)V", "serviceList", "Ljava/lang/Boolean;", "isTest", "c", "Lkotlin/Lazy;", "allNewUI", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"l/qqh0$a", "Lcom/p1/mobile/android/app/a$a;", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "a", "(IILandroid/content/Intent;)Z", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19559a implements C4317a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Frag f155903a;

        public C19559a(Frag frag) {
            this.f155903a = frag;
        }

        @Override // com.p046p1.mobile.android.app.C4317a.a
        /* JADX INFO: renamed from: a */
        public boolean mo20401a(int requestCode, int resultCode, Intent data) {
            if (resultCode != -1) {
                return false;
            }
            Serializable serializableExtra = data != null ? data.getSerializableExtra(MediaPickerBaseAct.f54603h) : null;
            serializableExtra.getClass();
            ark.m98433L0(this.f155903a.act(), (ArrayList) serializableExtra);
            return true;
        }
    }

    static {
        qqh0 qqh0Var = new qqh0();
        INSTANCE = qqh0Var;
        serviceList = qqh0Var.m175929h();
        allNewUI = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.pqh0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(qqh0.m175922a());
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static boolean m175922a() {
        return u59.m191847r();
    }

    /* JADX INFO: renamed from: b */
    public final Item m175923b(String name, int rank) {
        Item itemNew_ = Item.new_();
        itemNew_.name = name;
        itemNew_.rank = rank;
        return itemNew_;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m175924c() {
        return ((Boolean) allNewUI.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final int m175925d(@NotNull User user) {
        user.getClass();
        boolean zM30604Q4 = CoreModule.f17545c.f19654j0.m30604Q4();
        List<PurchaseType> listM175927f = m175927f(user);
        boolean z = listM175927f.size() == 4;
        if (zM30604Q4 || !z) {
            return -1;
        }
        return listM175927f.indexOf(CoreModule.f17545c.f19672p0.m173356d3());
    }

    /* JADX INFO: renamed from: e */
    public final long m175926e() {
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
    public final List<PurchaseType> m175927f(@NotNull User user) {
        user.getClass();
        ArrayList arrayList = new ArrayList();
        boolean z = user.isVIP() || user.isSVIP();
        boolean z2 = !n3b0.m157744s(null, 1, null) || user.isSVIP();
        if (CoreModule.f17545c.f19654j0.m30604Q4()) {
            List<PurchaseType> listM191855z = u59.m191855z();
            listM191855z.getClass();
            arrayList.addAll(listM191855z);
        } else {
            List<PurchaseType> listM191793B = u59.m191793B();
            listM191793B.getClass();
            arrayList.addAll(listM191793B);
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
        if (u59.m191806O() && (z || z2)) {
            C4732c c4732c = CoreModule.f17545c;
            if (c4732c.f19569G2.f80117R != null && c4732c.f19654j0.m30602P4()) {
                arrayList.remove(PurchaseType.TYPE_GET_VIP);
                arrayList.remove(PurchaseType.TYPE_GET_LIKERS);
            }
        }
        if ((z && z2) || !u59.m191810S()) {
            PurchaseType purchaseType3 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            if (arrayList.contains(purchaseType3) && (!h6a.m129470c() || !CoreModule.f17545c.f19569G2.m105984l3(purchaseType3) || !CoreModule.f17545c.f19654j0.m30602P4())) {
                arrayList.remove(purchaseType3);
            }
        }
        if ((!user.isUltraPremium() && u59.m191812U()) || (h6a.m129470c() && CoreModule.f17545c.f19569G2.m105984l3(PurchaseType.TYPE_ULTRA_PREMIUM) && CoreModule.f17545c.f19654j0.m30602P4())) {
            return arrayList;
        }
        arrayList.remove(PurchaseType.TYPE_ULTRA_PREMIUM);
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<Item> m175928g() {
        return serviceList.isEmpty() ? m175929h() : serviceList;
    }

    /* JADX INFO: renamed from: h */
    public final List<Item> m175929h() {
        ArrayList arrayList = new ArrayList();
        if (IntlCountryCodeController.m28124t()) {
            arrayList.add(m175923b("see", 1));
            arrayList.add(m175923b("subscription", 2));
            return arrayList;
        }
        arrayList.add(m175923b("see", 1));
        arrayList.add(m175923b(Visitor.TYPE, 2));
        arrayList.add(m175923b("likes", 3));
        arrayList.add(m175923b("subscription", 4));
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m175930i() {
        return m175924c();
    }

    /* JADX INFO: renamed from: j */
    public final void m175931j() {
        isTest = null;
        m175928g().clear();
    }

    /* JADX INFO: renamed from: k */
    public final void m175932k(@NotNull Frag frag) {
        frag.getClass();
        vpx vpxVar = new vpx();
        vpxVar.f182531a = 1;
        vpxVar.f182533c = false;
        vpxVar.f182532b = false;
        vpxVar.f182534d = true;
        vpxVar.f182536f = MediaPickerAct.f30623D;
        vpxVar.f182538h = true;
        vpxVar.f182539i = CoreModule.f17545c.f19639e0.m169527p9().gender;
        vpxVar.f182541k = true;
        frag.m20590k0(MediaPickerAct.m47788k2(frag.act(), vpxVar), new C19559a(frag));
    }
}
