package p149l;

import com.clevertap.android.sdk.Constants;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m87232d2 = {"Ll/a83;", "Ll/o4;", "<init>", "()V", "Ll/z5l$a;", CommandMessage.PARAMS, "", "e", "(Ll/z5l$a;)Z", Constants.INAPP_DATA_TAG, "(Ll/z5l$a;)Ljava/lang/Boolean;", "a", "Z", "first", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class a83 extends AbstractC18834o4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean first = true;

    /* JADX INFO: renamed from: c */
    public static void m95329c(z5l.C21640a c21640a) {
        if (swh0.m186217W() > 0) {
            x93.Companion.m207473e(x93.INSTANCE, c21640a.m217363a(), true, null, false, null, 28, null);
        } else {
            new fd5.C16808e(c21640a.m217363a()).m120958j(PurchaseType.TYPE_INTL_TTT_COIN).m120952d("p_wallet,vas").m120951c(1).m120960l();
        }
    }

    @Override // p149l.p3m
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo37497a(@Nullable final z5l.C21640a params) {
        if (params != null) {
            f73.m119757y(params.m217363a(), new d30() { // from class: l.z73
                @Override // p149l.d30
                public final void call() {
                    a83.m95329c(params);
                }
            });
        }
        return Boolean.TRUE;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(@Nullable z5l.C21640a params) {
        if (this.first) {
            C4732c c4732c = CoreModule.f17545c;
            if (c4732c.f19576J0.f115763o0 && !c4732c.f19639e0.m169520na().isUltraPremium()) {
                this.first = false;
                if (CoreModule.f17545c.f19570H0.m210364m4() != 0 && !CoreModule.f17545c.f19576J0.m139254F3() && (mah0.m153729s0().m153758S0() != 0 || IntlCountryCodeController.m28126v())) {
                    return true;
                }
            }
        }
        return false;
    }
}
