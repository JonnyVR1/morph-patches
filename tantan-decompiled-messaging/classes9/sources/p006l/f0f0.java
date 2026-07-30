package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.core.ui.purchase.e;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import l.p2b0;
import l.sab0;
import l.vwb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ll/f0f0;", "Ll/d3m;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "", "handle", "()Z", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "a", "(Ljava/util/List;)Ljava/util/List;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "b", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class f0f0 implements d3m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String from;

    public f0f0(@NotNull PurchaseType purchaseType, @Nullable String str) {
        purchaseType.getClass();
        this.purchaseType = purchaseType;
        this.from = str;
    }

    @Override // p006l.d3m
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<d> mo13771a(@NotNull List<? extends d> sections) {
        sections.getClass();
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(sections)) {
            List listU = p2b0.h().u(this.purchaseType);
            for (d dVar : sections) {
                if (!p2b0.h().z() || e.x(this.from)) {
                    Merchandise merchandiseS = (dVar.n() ? dVar.b() : dVar.d()).s();
                    if (listU.contains(String.valueOf(merchandiseS.quantity)) && (merchandiseS.monthly() || merchandiseS.quarterly() || merchandiseS.semiAnnual() || merchandiseS.yearly())) {
                        arrayList.add(dVar);
                    }
                } else {
                    Merchandise merchandiseS2 = (NullChecker.a(dVar.d()) ? dVar.d() : dVar.b()).s();
                    boolean z = CoreModule.m1854P().m11706a().m5461j3() && CoreModule.f1534c.f3580O0.m2014u3(this.purchaseType);
                    if (!z && merchandiseS2.weekly() && merchandiseS2.noneRenewable() && listU.contains("-1w")) {
                        arrayList.add(dVar);
                    } else if (!z && merchandiseS2.weekly() && merchandiseS2.autoRenewable() && listU.contains("1w")) {
                        arrayList.add(dVar);
                    } else if (!z && merchandiseS2.autoRenewable() && listU.contains(String.valueOf(merchandiseS2.quantity)) && (merchandiseS2.monthly() || merchandiseS2.quarterly() || merchandiseS2.semiAnnual() || merchandiseS2.yearly())) {
                        arrayList.add(dVar);
                    } else if (merchandiseS2.noneRenewable()) {
                        if (listU.contains("-" + merchandiseS2.quantity) && (merchandiseS2.monthly() || merchandiseS2.quarterly() || merchandiseS2.semiAnnual() || merchandiseS2.yearly())) {
                            arrayList.add(dVar);
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            d dVar2 = (d) obj;
            if (!g6a.m15591n() || !sab0.i(this.purchaseType) || !NullChecker.a(dVar2.b()) || !dVar2.b().H() || !dVar2.b().s().quarterly() || !dVar2.b().E()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // p006l.d3m
    public boolean handle() {
        return sab0.d(this.purchaseType);
    }
}
