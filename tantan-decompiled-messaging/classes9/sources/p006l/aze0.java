package p006l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.b1c0;
import l.d30;
import l.eqh0;
import l.i0g0;
import l.sab0;
import l.xh0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ll/aze0;", "", "<init>", "()V", "Companion", "a", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class aze0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m12358a(@NotNull Act act, @NotNull PurchaseType purchaseType, @NotNull d dVar, @NotNull d30 d30Var, @NotNull d30 d30Var2) {
        INSTANCE.m12362d(act, purchaseType, dVar, d30Var, d30Var2);
    }

    /* JADX INFO: renamed from: l.aze0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ll/aze0$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "purchaseSection", "Ll/d30;", "confirm", "pass", "", "d", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/ui/purchase/d;Ll/d30;Ll/d30;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m12359a(d30 d30Var, DialogInterface dialogInterface) {
            d30Var.call();
        }

        /* JADX INFO: renamed from: b */
        public static void m12360b(d30 d30Var, View view) {
            d30Var.call();
        }

        /* JADX INFO: renamed from: c */
        public static void m12361c(d30 d30Var, View view) {
            d30Var.call();
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final void m12362d(@NotNull Act act, @NotNull PurchaseType type, @NotNull d purchaseSection, @NotNull final d30 confirm, @NotNull final d30 pass) {
            String strO;
            String string;
            act.getClass();
            type.getClass();
            purchaseSection.getClass();
            confirm.getClass();
            pass.getClass();
            if (NullChecker.a(purchaseSection) && NullChecker.a(purchaseSection.b())) {
                strO = purchaseSection.b().o();
                if (TextUtils.isEmpty(strO)) {
                    strO = purchaseSection.b().q();
                }
            } else {
                strO = "";
            }
            ArrayList arrayList = new ArrayList();
            String strString = act.string(R.string.J8);
            if (sab0.s(type) || sab0.q(type) || sab0.m(type) || sab0.i(type) || sab0.o(type)) {
                string = act.getString(R.string.H8, strO);
                string.getClass();
                arrayList.add(act.getString(R.string.e9, strO));
            } else {
                string = act.getString(R.string.I8, strO);
                string.getClass();
                arrayList.add(act.getString(R.string.d9, strO));
            }
            new xh0.a(act).j(i0g0.b0(string, arrayList, act.color(b1c0.l), eqh0.c(3))).r(strString).o(new View.OnClickListener() { // from class: l.xye0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    aze0.Companion.m12360b(confirm, view);
                }
            }).e(R.string.K8).c(new View.OnClickListener() { // from class: l.yye0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    aze0.Companion.m12361c(pass, view);
                }
            }).l(new DialogInterface.OnCancelListener() { // from class: l.zye0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    aze0.Companion.m12359a(confirm, dialogInterface);
                }
            }).a().g();
        }

        public Companion() {
        }
    }
}
