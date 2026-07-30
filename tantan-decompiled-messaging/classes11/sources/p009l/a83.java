package p009l;

import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.c;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import kotlin.Metadata;
import l.d30;
import l.f73;
import l.fd5;
import l.mah0;
import l.swh0;
import l.x93;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Ll/a83;", "Ll/o4;", "<init>", "()V", "Ll/z5l$a;", "params", "", "e", "(Ll/z5l$a;)Z", "d", "(Ll/z5l$a;)Ljava/lang/Boolean;", "a", "Z", "first", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a83 extends AbstractC1065o4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean first = true;

    /* JADX INFO: renamed from: c */
    public static void m11262c(z5l.C1346a c1346a) {
        if (swh0.W() > 0) {
            x93.a.e(x93.Companion, c1346a.m25611a(), true, (d30) null, false, (Privilege) null, 28, (Object) null);
        } else {
            new fd5.e(c1346a.m25611a()).j(PurchaseType.TYPE_INTL_TTT_COIN).d("p_wallet,vas").c(1).l();
        }
    }

    @Override // p009l.p3m
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo1468a(@Nullable final z5l.C1346a params) {
        if (params != null) {
            f73.y(params.m25611a(), new d30() { // from class: l.z73
                public final void call() {
                    a83.m11262c(params);
                }
            });
        }
        return Boolean.TRUE;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(@Nullable z5l.C1346a params) {
        if (this.first) {
            c cVar = CoreModule.c;
            if (cVar.J0.o0 && !cVar.e0.na().isUltraPremium()) {
                this.first = false;
                if (CoreModule.c.H0.m4() != 0 && !CoreModule.c.J0.F3() && (mah0.s0().S0() != 0 || IntlCountryCodeController.v())) {
                    return true;
                }
            }
        }
        return false;
    }
}
