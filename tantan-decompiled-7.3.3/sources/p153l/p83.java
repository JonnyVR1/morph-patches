package p153l;

import com.clevertap.android.sdk.Constants;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m88121d2 = {"Ll/p83;", "Ll/n4;", "<init>", "()V", "Ll/p8l$a;", CommandMessage.PARAMS, "", "e", "(Ll/p8l$a;)Z", Constants.INAPP_DATA_TAG, "(Ll/p8l$a;)Ljava/lang/Boolean;", "a", "Z", "first", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class p83 extends AbstractC18774n4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean first = true;

    /* JADX INFO: renamed from: c */
    public static void m171178c(p8l.C19323a c19323a) {
        if (a5i0.m96122W() > 0) {
            ma3.Companion.m157626e(ma3.INSTANCE, c19323a.m171258a(), true, null, false, null, 28, null);
        } else {
            new fe5.C16962e(c19323a.m171258a()).m125281j(PurchaseType.TYPE_INTL_TTT_COIN).m125275d("p_wallet,vas").m125274c(1).m125283l();
        }
    }

    @Override // p153l.g6m
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo38500a(@Nullable final p8l.C19323a params) {
        if (params != null) {
            u73.m194834y(params.m171258a(), new x20() { // from class: l.o83
                @Override // p153l.x20
                public final void call() {
                    p83.m171178c(params);
                }
            });
        }
        return Boolean.TRUE;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(@Nullable p8l.C19323a params) {
        if (this.first) {
            C4883c c4883c = CoreModule.f18264c;
            if (c4883c.f20318J0.f134525o0 && !c4883c.f20381e0.m116593na().isUltraPremium()) {
                this.first = false;
                if (CoreModule.f18264c.f20312H0.m155452m4() != 0 && !CoreModule.f18264c.f20318J0.m156766F3() && (uih0.m196223s0().m196252S0() != 0 || IntlCountryCodeController.m29125v())) {
                    return true;
                }
            }
        }
        return false;
    }
}
