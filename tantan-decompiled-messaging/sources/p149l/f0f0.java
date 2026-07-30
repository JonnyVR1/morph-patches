package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8766e;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m87232d2 = {"Ll/f0f0;", "Ll/d3m;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "", "handle", "()Z", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "a", "(Ljava/util/List;)Ljava/util/List;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "b", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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

    @Override // p149l.d3m
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<C8765d> mo109941a(@NotNull List<? extends C8765d> sections) {
        sections.getClass();
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(sections)) {
            List<String> listM167152u = p2b0.m167133h().m167152u(this.purchaseType);
            for (C8765d c8765d : sections) {
                if (!p2b0.m167133h().m167157z() || C8766e.m53650x(this.from)) {
                    Merchandise merchandiseM53601s = (c8765d.m53532n() ? c8765d.m53520b() : c8765d.m53522d()).m53601s();
                    if (listM167152u.contains(String.valueOf(merchandiseM53601s.quantity)) && (merchandiseM53601s.monthly() || merchandiseM53601s.quarterly() || merchandiseM53601s.semiAnnual() || merchandiseM53601s.yearly())) {
                        arrayList.add(c8765d);
                    }
                } else {
                    Merchandise merchandiseM53601s2 = (NullChecker.m81303a(c8765d.m53522d()) ? c8765d.m53522d() : c8765d.m53520b()).m53601s();
                    boolean z = CoreModule.m29935P().m94651a().mo33524j3() && CoreModule.f17545c.f19591O0.m30086u3(this.purchaseType);
                    if (!z && merchandiseM53601s2.weekly() && merchandiseM53601s2.noneRenewable() && listM167152u.contains("-1w")) {
                        arrayList.add(c8765d);
                    } else if (!z && merchandiseM53601s2.weekly() && merchandiseM53601s2.autoRenewable() && listM167152u.contains("1w")) {
                        arrayList.add(c8765d);
                    } else if (!z && merchandiseM53601s2.autoRenewable() && listM167152u.contains(String.valueOf(merchandiseM53601s2.quantity)) && (merchandiseM53601s2.monthly() || merchandiseM53601s2.quarterly() || merchandiseM53601s2.semiAnnual() || merchandiseM53601s2.yearly())) {
                        arrayList.add(c8765d);
                    } else if (merchandiseM53601s2.noneRenewable()) {
                        if (listM167152u.contains("-" + merchandiseM53601s2.quantity) && (merchandiseM53601s2.monthly() || merchandiseM53601s2.quarterly() || merchandiseM53601s2.semiAnnual() || merchandiseM53601s2.yearly())) {
                            arrayList.add(c8765d);
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C8765d c8765d2 = (C8765d) obj;
            if (!g6a.m124565n() || !sab0.m182891i(this.purchaseType) || !NullChecker.m81303a(c8765d2.m53520b()) || !c8765d2.m53520b().m53552H() || !c8765d2.m53520b().m53601s().quarterly() || !c8765d2.m53520b().m53549E()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // p149l.d3m
    public boolean handle() {
        return sab0.m182886d(this.purchaseType);
    }
}
