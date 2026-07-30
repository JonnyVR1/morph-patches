package p149l;

import android.content.Context;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m87232d2 = {"Ll/da10;", "Ll/m5t;", "Ll/la10;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "init", "()V", "", "tab", BaseSei.f13930X, "(I)V", "k", "()I", "h", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ll/ea10;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", BaseSei.f13931Y, "()Ll/ea10;", "contentAdapter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class da10 extends m5t<la10> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy contentAdapter;

    public da10(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.contentAdapter = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.ba10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return da10.m110531w(this.f74646a);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public static Unit m110530v(da10 da10Var, View view) {
        view.getClass();
        da10Var.mo71727j();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static ea10 m110531w(da10 da10Var) {
        Act act = da10Var.getAct();
        act.getClass();
        P p = da10Var.f47706b;
        p.getClass();
        return new ea10(act, (la10) p);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p149l.vpl
    public void init() {
        super.init();
        ViewPager2 viewPager2 = this.f131418g;
        viewPager2.setAdapter(m110533y());
        viewPager2.setUserInputEnabled(false);
        View view = this.f131417f;
        view.getClass();
        cxq.m109105c(view, new Function1() { // from class: l.ca10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return da10.m110530v(this.f79996a, (View) obj);
            }
        });
        m110532x(0);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo71728k() {
        return i3c0.f110769L;
    }

    /* JADX INFO: renamed from: x */
    public final void m110532x(int tab) {
        this.f131418g.m4250j(tab, false);
    }

    /* JADX INFO: renamed from: y */
    public final ea10 m110533y() {
        return (ea10) this.contentAdapter.getValue();
    }
}
