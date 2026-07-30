package p153l;

import android.content.Intent;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Visitor;
import com.p051p1.mobile.putong.live.base.data.BLivePkCategory;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003J\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 R(\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001b\"\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010'R\u001b\u0010+\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010\u0006¨\u0006,"}, m88121d2 = {"Ll/yyh0;", "", "<init>", "()V", "", RXScreenCaptureService.KEY_INDEX, "()Z", "", "j", "Lcom/p1/mobile/putong/data/User;", "user", "", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/data/User;)I", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "f", "(Lcom/p1/mobile/putong/data/User;)Ljava/util/List;", "Lcom/p1/mobile/android/app/Frag;", "frag", "k", "(Lcom/p1/mobile/android/app/Frag;)V", "", "e", "()J", "Lcom/p1/mobile/putong/core/data/Item;", "h", "()Ljava/util/List;", "", AuthenticationTokenClaims.JSON_KEY_NAME, BLivePkCategory.rank, "b", "(Ljava/lang/String;I)Lcom/p1/mobile/putong/core/data/Item;", "a", "Ljava/util/List;", "g", "setServiceList", "(Ljava/util/List;)V", "serviceList", "Ljava/lang/Boolean;", "isTest", "c", "Lkotlin/Lazy;", "allNewUI", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class yyh0 {

    @NotNull
    public static final yyh0 INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static List<Item> serviceList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static Boolean isTest;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Lazy allNewUI;

    /* JADX INFO: renamed from: l.yyh0$a */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"l/yyh0$a", "Lcom/p1/mobile/android/app/a$a;", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "a", "(IILandroid/content/Intent;)Z", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21723a implements C4468a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Frag f202111a;

        public C21723a(Frag frag) {
            this.f202111a = frag;
        }

        @Override // com.p051p1.mobile.android.app.C4468a.a
        /* JADX INFO: renamed from: a */
        public boolean mo21400a(int requestCode, int resultCode, Intent data) {
            if (resultCode != -1) {
                return false;
            }
            Serializable serializableExtra = data != null ? data.getSerializableExtra(MediaPickerBaseAct.f55451h) : null;
            serializableExtra.getClass();
            qtk.m177983L0(this.f202111a.act(), (ArrayList) serializableExtra);
            return true;
        }
    }

    static {
        yyh0 yyh0Var = new yyh0();
        INSTANCE = yyh0Var;
        serviceList = yyh0Var.m217992h();
        allNewUI = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.xyh0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(yyh0.m217985a());
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static boolean m217985a() {
        return d79.m114700r();
    }

    /* JADX INFO: renamed from: b */
    public final Item m217986b(String name, int rank) {
        Item itemNew_ = Item.new_();
        itemNew_.name = name;
        itemNew_.rank = rank;
        return itemNew_;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m217987c() {
        return ((Boolean) allNewUI.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final int m217988d(@NotNull User user) {
        user.getClass();
        boolean zM31607Q4 = CoreModule.f18264c.f20396j0.m31607Q4();
        List<PurchaseType> listM217990f = m217990f(user);
        boolean z = listM217990f.size() == 4;
        if (zM31607Q4 || !z) {
            return -1;
        }
        return listM217990f.indexOf(CoreModule.f18264c.f20414p0.m219059d3());
    }

    /* JADX INFO: renamed from: e */
    public final long m217989e() {
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
    public final List<PurchaseType> m217990f(@NotNull User user) {
        user.getClass();
        ArrayList arrayList = new ArrayList();
        boolean z = user.isVIP() || user.isSVIP();
        boolean z2 = !rbb0.m180746s(null, 1, null) || user.isSVIP();
        if (CoreModule.f18264c.f20396j0.m31607Q4()) {
            List<PurchaseType> listM114709z = d79.m114709z();
            listM114709z.getClass();
            arrayList.addAll(listM114709z);
        } else {
            List<PurchaseType> listM114644C = d79.m114644C();
            listM114644C.getClass();
            arrayList.addAll(listM114644C);
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
        if (d79.m114657P() && (z || z2)) {
            C4883c c4883c = CoreModule.f18264c;
            if (c4883c.f20311G2.f131283R != null && c4883c.f20396j0.m31605P4()) {
                arrayList.remove(PurchaseType.TYPE_GET_VIP);
                arrayList.remove(PurchaseType.TYPE_GET_LIKERS);
            }
        }
        if ((z && z2) || !d79.m114661T()) {
            PurchaseType purchaseType3 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            if (arrayList.contains(purchaseType3) && (!t7a.m189547c() || !CoreModule.f18264c.f20311G2.m153654l3(purchaseType3) || !CoreModule.f18264c.f20396j0.m31605P4())) {
                arrayList.remove(purchaseType3);
            }
        }
        if ((!user.isUltraPremium() && d79.m114663V()) || (t7a.m189547c() && CoreModule.f18264c.f20311G2.m153654l3(PurchaseType.TYPE_ULTRA_PREMIUM) && CoreModule.f18264c.f20396j0.m31605P4())) {
            return arrayList;
        }
        arrayList.remove(PurchaseType.TYPE_ULTRA_PREMIUM);
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<Item> m217991g() {
        return serviceList.isEmpty() ? m217992h() : serviceList;
    }

    /* JADX INFO: renamed from: h */
    public final List<Item> m217992h() {
        ArrayList arrayList = new ArrayList();
        if (IntlCountryCodeController.m29123t()) {
            arrayList.add(m217986b("see", 1));
            arrayList.add(m217986b("subscription", 2));
            return arrayList;
        }
        arrayList.add(m217986b("see", 1));
        arrayList.add(m217986b(Visitor.TYPE, 2));
        arrayList.add(m217986b("likes", 3));
        arrayList.add(m217986b("subscription", 4));
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m217993i() {
        return m217987c();
    }

    /* JADX INFO: renamed from: j */
    public final void m217994j() {
        isTest = null;
        m217991g().clear();
    }

    /* JADX INFO: renamed from: k */
    public final void m217995k(@NotNull Frag frag) {
        frag.getClass();
        syx syxVar = new syx();
        syxVar.f171323a = 1;
        syxVar.f171325c = false;
        syxVar.f171324b = false;
        syxVar.f171326d = true;
        syxVar.f171328f = MediaPickerAct.f31471D;
        syxVar.f171330h = true;
        syxVar.f171331i = CoreModule.f18264c.f20381e0.m116600p9().gender;
        syxVar.f171333k = true;
        frag.m21589k0(MediaPickerAct.m48971l2(frag.act(), syxVar), new C21723a(frag));
    }
}
