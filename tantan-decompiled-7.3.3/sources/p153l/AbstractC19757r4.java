package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l.r4 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\u00020\u001c8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m88121d2 = {"Ll/r4;", "", "", "from", "<init>", "(Ljava/lang/String;)V", "Ll/fq60;", SocialConstants.TYPE_REQUEST, "", "e", "(Ll/fq60;)Z", "Ll/gq60;", "response", "", "b", "(Ll/fq60;Ll/gq60;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)Ljava/lang/String;", "f", "()Z", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "g", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Ljava/text/NumberFormat;", "Ljava/text/NumberFormat;", Constants.INAPP_DATA_TAG, "()Ljava/text/NumberFormat;", "numberFormat", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public abstract class AbstractC19757r4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final NumberFormat numberFormat;

    public AbstractC19757r4(@Nullable String str) {
        this.from = str;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.getClass();
        this.numberFormat = numberInstance;
        numberInstance.setMaximumFractionDigits(2);
        numberInstance.setGroupingUsed(false);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m179720a(@NotNull C8928d section) {
        section.getClass();
        Merchandise merchandiseM54784s = m179724g(section).m54784s();
        String str = new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format(new BigDecimal((section.m54711j() ? merchandiseM54784s.getFirstCouponPrice() : merchandiseM54784s.defaultStockKeepUnit.prices.price) / ((double) z7a.m218877t0(merchandiseM54784s))).setScale(1, 0).doubleValue());
        str.getClass();
        return str;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo99414b(@NotNull fq60 request, @NotNull gq60 response);

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
    public abstract boolean mo99415e(@NotNull fq60 request);

    /* JADX INFO: renamed from: f */
    public final boolean m179723f() {
        return CoreModule.m30933P().m143405a().mo34527j3();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final C8928d.a m179724g(@NotNull C8928d section) {
        section.getClass();
        if (!tab0.m189811h().m189835z() || C8929e.m54833x(this.from)) {
            C8928d.a aVarM54703b = section.m54715n() ? section.m54703b() : section.m54705d();
            aVarM54703b.getClass();
            return aVarM54703b;
        }
        if (NullChecker.m82486a(section.m54705d())) {
            C8928d.a aVarM54705d = section.m54705d();
            aVarM54705d.getClass();
            return aVarM54705d;
        }
        C8928d.a aVarM54703b2 = section.m54703b();
        aVarM54703b2.getClass();
        return aVarM54703b2;
    }
}
