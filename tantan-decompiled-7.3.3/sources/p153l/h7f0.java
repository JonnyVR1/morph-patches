package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/h7f0;", "", "<init>", "()V", "Companion", "a", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class h7f0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m133793a(@NotNull Act act, @NotNull PurchaseType purchaseType, @NotNull C8928d c8928d, @NotNull x20 x20Var, @NotNull x20 x20Var2) {
        INSTANCE.m133797d(act, purchaseType, c8928d, x20Var, x20Var2);
    }

    /* JADX INFO: renamed from: l.h7f0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/h7f0$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "purchaseSection", "Ll/x20;", BLiveVoiceSingTogehterState.confirm, StateEvent.ActionValue.STAGE_PASS, "", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/ui/purchase/d;Ll/x20;Ll/x20;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m133794a(x20 x20Var, DialogInterface dialogInterface) {
            x20Var.call();
        }

        /* JADX INFO: renamed from: b */
        public static void m133795b(x20 x20Var, View view) {
            x20Var.call();
        }

        /* JADX INFO: renamed from: c */
        public static void m133796c(x20 x20Var, View view) {
            x20Var.call();
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final void m133797d(@NotNull Act act, @NotNull PurchaseType type, @NotNull C8928d purchaseSection, @NotNull final x20 confirm, @NotNull final x20 pass) {
            String strM54780o;
            String string;
            act.getClass();
            type.getClass();
            purchaseSection.getClass();
            confirm.getClass();
            pass.getClass();
            if (NullChecker.m82486a(purchaseSection) && NullChecker.m82486a(purchaseSection.m54703b())) {
                strM54780o = purchaseSection.m54703b().m54780o();
                if (TextUtils.isEmpty(strM54780o)) {
                    strM54780o = purchaseSection.m54703b().m54782q();
                }
            } else {
                strM54780o = "";
            }
            ArrayList arrayList = new ArrayList();
            String strString = act.string(R$string.f28046J8);
            if (wib0.m206575s(type) || wib0.m206573q(type) || wib0.m206569m(type) || wib0.m206565i(type) || wib0.m206571o(type)) {
                string = act.getString(R$string.f28024H8, strM54780o);
                string.getClass();
                arrayList.add(act.getString(R$string.f28282e9, strM54780o));
            } else {
                string = act.getString(R$string.f28035I8, strM54780o);
                string.getClass();
                arrayList.add(act.getString(R$string.f28270d9, strM54780o));
            }
            new th0.C20312a(act).m191151j(q8g0.m175796b0(string, arrayList, act.color(h9c0.f108379l), lyh0.m156283c(3))).m191159r(strString).m191156o(new View.OnClickListener() { // from class: l.e7f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h7f0.Companion.m133795b(confirm, view);
                }
            }).m191146e(R$string.f28057K8).m191144c(new View.OnClickListener() { // from class: l.f7f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h7f0.Companion.m133796c(pass, view);
                }
            }).m191153l(new DialogInterface.OnCancelListener() { // from class: l.g7f0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    h7f0.Companion.m133794a(confirm, dialogInterface);
                }
            }).m191142a().m191141g();
        }

        public Companion() {
        }
    }
}
