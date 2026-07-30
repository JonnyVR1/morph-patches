package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Ll/aze0;", "", "<init>", "()V", "Companion", "a", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class aze0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m99658a(@NotNull Act act, @NotNull PurchaseType purchaseType, @NotNull C8765d c8765d, @NotNull d30 d30Var, @NotNull d30 d30Var2) {
        INSTANCE.m99662d(act, purchaseType, c8765d, d30Var, d30Var2);
    }

    /* JADX INFO: renamed from: l.aze0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Ll/aze0$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "purchaseSection", "Ll/d30;", BLiveVoiceSingTogehterState.confirm, StateEvent.ActionValue.STAGE_PASS, "", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/ui/purchase/d;Ll/d30;Ll/d30;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m99659a(d30 d30Var, DialogInterface dialogInterface) {
            d30Var.call();
        }

        /* JADX INFO: renamed from: b */
        public static void m99660b(d30 d30Var, View view) {
            d30Var.call();
        }

        /* JADX INFO: renamed from: c */
        public static void m99661c(d30 d30Var, View view) {
            d30Var.call();
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final void m99662d(@NotNull Act act, @NotNull PurchaseType type, @NotNull C8765d purchaseSection, @NotNull final d30 confirm, @NotNull final d30 pass) {
            String strM53597o;
            String string;
            act.getClass();
            type.getClass();
            purchaseSection.getClass();
            confirm.getClass();
            pass.getClass();
            if (NullChecker.m81303a(purchaseSection) && NullChecker.m81303a(purchaseSection.m53520b())) {
                strM53597o = purchaseSection.m53520b().m53597o();
                if (TextUtils.isEmpty(strM53597o)) {
                    strM53597o = purchaseSection.m53520b().m53599q();
                }
            } else {
                strM53597o = "";
            }
            ArrayList arrayList = new ArrayList();
            String strString = act.string(R$string.f27198J8);
            if (sab0.m182901s(type) || sab0.m182899q(type) || sab0.m182895m(type) || sab0.m182891i(type) || sab0.m182897o(type)) {
                string = act.getString(R$string.f27176H8, strM53597o);
                string.getClass();
                arrayList.add(act.getString(R$string.f27434e9, strM53597o));
            } else {
                string = act.getString(R$string.f27187I8, strM53597o);
                string.getClass();
                arrayList.add(act.getString(R$string.f27422d9, strM53597o));
            }
            new xh0.C21150a(act).m208731j(i0g0.m133861b0(string, arrayList, act.color(b1c0.f72559l), eqh0.m117752c(3))).m208739r(strString).m208736o(new View.OnClickListener() { // from class: l.xye0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    aze0.Companion.m99660b(confirm, view);
                }
            }).m208726e(R$string.f27209K8).m208724c(new View.OnClickListener() { // from class: l.yye0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    aze0.Companion.m99661c(pass, view);
                }
            }).m208733l(new DialogInterface.OnCancelListener() { // from class: l.zye0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    aze0.Companion.m99659a(confirm, dialogInterface);
                }
            }).m208722a().m208721g();
        }

        public Companion() {
        }
    }
}
