package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Ll/m8f0;", "Ll/u5m;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "", "handle", "()Z", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "a", "(Ljava/util/List;)Ljava/util/List;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "b", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class m8f0 implements u5m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String from;

    public m8f0(@NotNull PurchaseType purchaseType, @Nullable String str) {
        purchaseType.getClass();
        this.purchaseType = purchaseType;
        this.from = str;
    }

    @Override // p153l.u5m
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<C8928d> mo153222a(@NotNull List<? extends C8928d> sections) {
        sections.getClass();
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(sections)) {
            List<String> listM189830u = tab0.m189811h().m189830u(this.purchaseType);
            for (C8928d c8928d : sections) {
                if (!tab0.m189811h().m189835z() || C8929e.m54833x(this.from)) {
                    Merchandise merchandiseM54784s = (c8928d.m54715n() ? c8928d.m54703b() : c8928d.m54705d()).m54784s();
                    if (listM189830u.contains(String.valueOf(merchandiseM54784s.quantity)) && (merchandiseM54784s.monthly() || merchandiseM54784s.quarterly() || merchandiseM54784s.semiAnnual() || merchandiseM54784s.yearly())) {
                        arrayList.add(c8928d);
                    }
                } else {
                    Merchandise merchandiseM54784s2 = (NullChecker.m82486a(c8928d.m54705d()) ? c8928d.m54705d() : c8928d.m54703b()).m54784s();
                    boolean z = CoreModule.m30933P().m143405a().mo34527j3() && CoreModule.f18264c.f20333O0.m31084u3(this.purchaseType);
                    if (!z && merchandiseM54784s2.weekly() && merchandiseM54784s2.noneRenewable() && listM189830u.contains("-1w")) {
                        arrayList.add(c8928d);
                    } else if (!z && merchandiseM54784s2.weekly() && merchandiseM54784s2.autoRenewable() && listM189830u.contains("1w")) {
                        arrayList.add(c8928d);
                    } else if (!z && merchandiseM54784s2.autoRenewable() && listM189830u.contains(String.valueOf(merchandiseM54784s2.quantity)) && (merchandiseM54784s2.monthly() || merchandiseM54784s2.quarterly() || merchandiseM54784s2.semiAnnual() || merchandiseM54784s2.yearly())) {
                        arrayList.add(c8928d);
                    } else if (merchandiseM54784s2.noneRenewable()) {
                        if (listM189830u.contains("-" + merchandiseM54784s2.quantity) && (merchandiseM54784s2.monthly() || merchandiseM54784s2.quarterly() || merchandiseM54784s2.semiAnnual() || merchandiseM54784s2.yearly())) {
                            arrayList.add(c8928d);
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C8928d c8928d2 = (C8928d) obj;
            if (!s7a.m184985n() || !wib0.m206565i(this.purchaseType) || !NullChecker.m82486a(c8928d2.m54703b()) || !c8928d2.m54703b().m54735H() || !c8928d2.m54703b().m54784s().quarterly() || !c8928d2.m54703b().m54732E()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // p153l.u5m
    public boolean handle() {
        return wib0.m206560d(this.purchaseType);
    }
}
