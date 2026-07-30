package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.core.ui.purchase.e;
import com.tantanapp.common.utils.NullChecker;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import kotlin.Metadata;
import l.n6a;
import l.p2b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l.t4 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\u00020\u001c8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Ll/t4;", "", "", "from", "<init>", "(Ljava/lang/String;)V", "Ll/ai60;", "request", "", "e", "(Ll/ai60;)Z", "Ll/bi60;", "response", "", "b", "(Ll/ai60;Ll/bi60;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)Ljava/lang/String;", "f", "()Z", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "g", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Ljava/text/NumberFormat;", "Ljava/text/NumberFormat;", "d", "()Ljava/text/NumberFormat;", "numberFormat", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AbstractC1297t4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final NumberFormat numberFormat;

    public AbstractC1297t4(@Nullable String str) {
        this.from = str;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.getClass();
        this.numberFormat = numberInstance;
        numberInstance.setMaximumFractionDigits(2);
        numberInstance.setGroupingUsed(false);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m24432a(@NotNull d section) {
        section.getClass();
        Merchandise merchandiseS = m24436g(section).s();
        String str = new DecimalFormat("0.0").format(new BigDecimal((section.j() ? merchandiseS.getFirstCouponPrice() : merchandiseS.defaultStockKeepUnit.prices.price) / ((double) n6a.t0(merchandiseS))).setScale(1, 0).doubleValue());
        str.getClass();
        return str;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo16653b(@NotNull ai60 request, @NotNull bi60 response);

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final NumberFormat getNumberFormat() {
        return this.numberFormat;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo16654e(@NotNull ai60 request);

    /* JADX INFO: renamed from: f */
    public final boolean m24435f() {
        return CoreModule.m1854P().m11706a().m5461j3();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final d.a m24436g(@NotNull d section) {
        section.getClass();
        if (!p2b0.h().z() || e.x(this.from)) {
            d.a aVarB = section.n() ? section.b() : section.d();
            aVarB.getClass();
            return aVarB;
        }
        if (NullChecker.a(section.d())) {
            d.a aVarD = section.d();
            aVarD.getClass();
            return aVarD;
        }
        d.a aVarB2 = section.b();
        aVarB2.getClass();
        return aVarB2;
    }
}
