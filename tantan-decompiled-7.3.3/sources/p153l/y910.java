package p153l;

import android.content.Context;
import android.view.View;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.presenter.MultiCallApplyDlgPresenter;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010!\u001a\n \u001c*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m88121d2 = {"Ll/y910;", "Ll/j7t;", "Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/presenter/MultiCallApplyDlgPresenter;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "init", "()V", "", "k", "()I", "", "vis", c4s.C_ZONE, "(Z)V", "", "userPic", "A", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "call", "B", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "kotlin.jvm.PlatformType", BLiveStormDanmakuGiftResourceType.f45292l, "Lkotlin/Lazy;", BaseSei.f14626Z, "()Ljava/lang/String;", "joinText", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class y910 extends j7t<MultiCallApplyDlgPresenter> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Lazy joinText;

    public y910(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.joinText = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.u910
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y910.m214810y();
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public static void m214807v(y910 y910Var, View view) {
        MultiCallApplyDlgPresenter multiCallApplyDlgPresenter = (MultiCallApplyDlgPresenter) y910Var.f48554b;
        String str = cd10.f81081i;
        str.getClass();
        multiCallApplyDlgPresenter.m76863Z3(str);
    }

    /* JADX INFO: renamed from: w */
    public static void m214808w(y910 y910Var, View view) {
        boolean zM88377d = Intrinsics.m88377d(y910Var.m214814z(), y910Var.f118725j.getText());
        P p = y910Var.f48554b;
        if (!zM88377d) {
            ((MultiCallApplyDlgPresenter) p).m76865d4();
            return;
        }
        String str = cd10.f81081i;
        str.getClass();
        ((MultiCallApplyDlgPresenter) p).m76863Z3(str);
    }

    /* JADX INFO: renamed from: x */
    public static void m214809x(y910 y910Var, View view) {
        MultiCallApplyDlgPresenter multiCallApplyDlgPresenter = (MultiCallApplyDlgPresenter) y910Var.f48554b;
        String str = cd10.f81082j;
        str.getClass();
        multiCallApplyDlgPresenter.m76863Z3(str);
    }

    /* JADX INFO: renamed from: y */
    public static String m214810y() {
        return xau.m209910t(R$string.f48189k8);
    }

    /* JADX INFO: renamed from: A */
    public void m214811A(@NotNull String userPic) {
        userPic.getClass();
        this.f118721f.m76895i0(userPic, true);
    }

    /* JADX INFO: renamed from: B */
    public final void m214812B(@Nullable BLiveMultiCall call) {
        boolean zM126515b = fp10.m126515b(call);
        VText vText = this.f118722g;
        if (zM126515b) {
            vText.setText(xau.m209910t(R$string.f47675M7));
            m214813C(true);
            VText vText2 = this.f118725j;
            vText2.setText(xau.m209910t(R$string.f48168j9));
            vText2.setTextColor(-1);
            vText2.setBackgroundResource(obc0.f146291c1);
            return;
        }
        vText.setText(xau.m209910t(R$string.f47696N7));
        m214813C(!bf10.m103809O());
        VText vText3 = this.f118725j;
        vText3.setText(xau.m209910t(R$string.f48189k8));
        vText3.setTextColor(-1);
        vText3.setBackgroundResource(obc0.f145990C0);
    }

    /* JADX INFO: renamed from: C */
    public final void m214813C(boolean vis) {
        bnl0.m105524M(this.f118725j, vis);
        bnl0.m105524M(this.f118723h, !vis);
        bnl0.m105524M(this.f118724i, !vis);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p153l.isl
    public void init() {
        super.init();
        bnl0.m105509E0(this.f118725j, new View.OnClickListener() { // from class: l.v910
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y910.m214808w(this.f182931a, view);
            }
        });
        bnl0.m105509E0(this.f118724i, new View.OnClickListener() { // from class: l.w910
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y910.m214807v(this.f187971a, view);
            }
        });
        bnl0.m105509E0(this.f118723h, new View.OnClickListener() { // from class: l.x910
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y910.m214809x(this.f192894a, view);
            }
        });
        if (bf10.m103809O()) {
            m214813C(false);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo72911k() {
        return 0;
    }

    /* JADX INFO: renamed from: z */
    public final String m214814z() {
        return (String) this.joinText.getValue();
    }
}
