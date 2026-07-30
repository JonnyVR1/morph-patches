package p149l;

import android.content.Context;
import android.view.View;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.presenter.MultiCallApplyDlgPresenter;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010!\u001a\n \u001c*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m87232d2 = {"Ll/o110;", "Ll/i5t;", "Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/presenter/MultiCallApplyDlgPresenter;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "init", "()V", "", "k", "()I", "", "vis", b2s.C_ZONE, "(Z)V", "", "userPic", "A", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "call", "B", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "kotlin.jvm.PlatformType", BLiveStormDanmakuGiftResourceType.f44444l, "Lkotlin/Lazy;", BaseSei.f13932Z, "()Ljava/lang/String;", "joinText", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class o110 extends i5t<MultiCallApplyDlgPresenter> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Lazy joinText;

    public o110(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.joinText = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.k110
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o110.m162225y();
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public static void m162222v(o110 o110Var, View view) {
        MultiCallApplyDlgPresenter multiCallApplyDlgPresenter = (MultiCallApplyDlgPresenter) o110Var.f47706b;
        String str = s410.f162243i;
        str.getClass();
        multiCallApplyDlgPresenter.m75680Z3(str);
    }

    /* JADX INFO: renamed from: w */
    public static void m162223w(o110 o110Var, View view) {
        boolean zM87488d = Intrinsics.m87488d(o110Var.m162229z(), o110Var.f111639j.getText());
        P p = o110Var.f47706b;
        if (!zM87488d) {
            ((MultiCallApplyDlgPresenter) p).m75682d4();
            return;
        }
        String str = s410.f162243i;
        str.getClass();
        ((MultiCallApplyDlgPresenter) p).m75680Z3(str);
    }

    /* JADX INFO: renamed from: x */
    public static void m162224x(o110 o110Var, View view) {
        MultiCallApplyDlgPresenter multiCallApplyDlgPresenter = (MultiCallApplyDlgPresenter) o110Var.f47706b;
        String str = s410.f162244j;
        str.getClass();
        multiCallApplyDlgPresenter.m75680Z3(str);
    }

    /* JADX INFO: renamed from: y */
    public static String m162225y() {
        return w8u.m202217t(R$string.f47341k8);
    }

    /* JADX INFO: renamed from: A */
    public void m162226A(@NotNull String userPic) {
        userPic.getClass();
        this.f111635f.m75712i0(userPic, true);
    }

    /* JADX INFO: renamed from: B */
    public final void m162227B(@Nullable BLiveMultiCall call) {
        boolean zM198310b = vg10.m198310b(call);
        VText vText = this.f111636g;
        if (zM198310b) {
            vText.setText(w8u.m202217t(R$string.f46827M7));
            m162228C(true);
            VText vText2 = this.f111639j;
            vText2.setText(w8u.m202217t(R$string.f47320j9));
            vText2.setTextColor(-1);
            vText2.setBackgroundResource(i3c0.f110963c1);
            return;
        }
        vText.setText(w8u.m202217t(R$string.f46848N7));
        m162228C(!r610.m177980O());
        VText vText3 = this.f111639j;
        vText3.setText(w8u.m202217t(R$string.f47341k8));
        vText3.setTextColor(-1);
        vText3.setBackgroundResource(i3c0.f110662C0);
    }

    /* JADX INFO: renamed from: C */
    public final void m162228C(boolean vis) {
        xdl0.m208344M(this.f111639j, vis);
        xdl0.m208344M(this.f111637h, !vis);
        xdl0.m208344M(this.f111638i, !vis);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p149l.vpl
    public void init() {
        super.init();
        xdl0.m208329E0(this.f111639j, new View.OnClickListener() { // from class: l.l110
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o110.m162223w(this.f125611a, view);
            }
        });
        xdl0.m208329E0(this.f111638i, new View.OnClickListener() { // from class: l.m110
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o110.m162222v(this.f130792a, view);
            }
        });
        xdl0.m208329E0(this.f111637h, new View.OnClickListener() { // from class: l.n110
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o110.m162224x(this.f136610a, view);
            }
        });
        if (r610.m177980O()) {
            m162228C(false);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo71728k() {
        return 0;
    }

    /* JADX INFO: renamed from: z */
    public final String m162229z() {
        return (String) this.joinText.getValue();
    }
}
