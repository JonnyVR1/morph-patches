package p153l;

import android.content.Context;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m88121d2 = {"Ll/ni10;", "Ll/n7t;", "Ll/vi10;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "init", "()V", "", "tab", BaseSei.f14624X, "(I)V", "k", "()I", "h", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ll/oi10;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", BaseSei.f14625Y, "()Ll/oi10;", "contentAdapter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ni10 extends n7t<vi10> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy contentAdapter;

    public ni10(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.contentAdapter = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.li10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ni10.m163259w(this.f132171a);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public static Unit m163258v(ni10 ni10Var, View view) {
        view.getClass();
        ni10Var.mo72910j();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static oi10 m163259w(ni10 ni10Var) {
        Act act = ni10Var.getAct();
        act.getClass();
        P p = ni10Var.f48554b;
        p.getClass();
        return new oi10(act, (vi10) p);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p153l.isl
    public void init() {
        super.init();
        ViewPager2 viewPager2 = this.f140629g;
        viewPager2.setAdapter(m163261y());
        viewPager2.setUserInputEnabled(false);
        View view = this.f140628f;
        view.getClass();
        czq.m113347c(view, new Function1() { // from class: l.mi10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ni10.m163258v(this.f136911a, (View) obj);
            }
        });
        m163260x(0);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo72911k() {
        return obc0.f146097L;
    }

    /* JADX INFO: renamed from: x */
    public final void m163260x(int tab) {
        this.f140629g.m4252j(tab, false);
    }

    /* JADX INFO: renamed from: y */
    public final oi10 m163261y() {
        return (oi10) this.contentAdapter.getValue();
    }
}
