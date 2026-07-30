package p153l;

import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.tab.VoiceFunctionsTabView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\"\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u0015\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u000fR\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010!\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#¨\u0006%"}, m88121d2 = {"Ll/ngn0;", "Ll/d0v;", "Ll/wgn0;", "<init>", "()V", "", "H", "I", "", "k", "()I", "f", "", "withShadow", "F0", "(Z)V", "K", "init", "j", FirebaseAnalytics.Param.INDEX, "E", "(I)V", "show", "L", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", "G", "()Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "layoutListener", "Ll/xgn0;", "F", "()Ll/xgn0;", "adapter", "l/ngn0$a", "Ll/ngn0$a;", "onPageChangeListener", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ngn0 extends d0v<wgn0<?>> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy layoutListener = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.hgn0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ngn0.m162990B(this.f109419a);
        }
    });

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.ign0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ngn0.m162996x(this.f114804a);
        }
    });

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final C18875a onPageChangeListener = new C18875a();

    /* JADX INFO: renamed from: l.ngn0$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/ngn0$a", "Ll/ef60;", "", "position", "", "onPageSelected", "(I)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18875a extends ef60 {
        public C18875a() {
        }

        @Override // p153l.ef60, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int position) {
            ngn0.this.f84615g.m78526f(position);
            ngn0.this.m163000F().m210931t(position);
        }
    }

    /* JADX INFO: renamed from: B */
    public static ViewTreeObserver.OnGlobalLayoutListener m162990B(final ngn0 ngn0Var) {
        return new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.lgn0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ngn0.m162994J(this.f131990a);
            }
        };
    }

    /* JADX INFO: renamed from: H */
    private final void m162992H() {
        Act act;
        if (m113471v() == null || (act = act()) == null) {
            return;
        }
        act.hideInput(m113471v());
    }

    /* JADX INFO: renamed from: I */
    private final void m162993I() {
        this.f84614f.m69897e("一起做点什么吧", true);
        this.f84614f.setBackListener(new View.OnClickListener() { // from class: l.mgn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ngn0.m162997y(this.f136761a, view);
            }
        });
        this.f84614f.setLeftView(4);
        this.f84614f.getTitleView().setTextColor(Color.parseColor("#CCFFFFFF"));
    }

    /* JADX INFO: renamed from: J */
    public static final void m162994J(ngn0 ngn0Var) {
        Rect rect = new Rect();
        ngn0Var.m113471v().getWindowVisibleDisplayFrame(rect);
        ((wgn0) ngn0Var.f48554b).m206225b4(bnl0.m105588w0() - rect.bottom);
    }

    /* JADX INFO: renamed from: w */
    public static void m162995w(ngn0 ngn0Var, boolean z) {
        View viewM72912l = ngn0Var.m72912l();
        if (viewM72912l != null) {
            viewM72912l.setTranslationY(z ? -qa00.m175859d(16.0f) : 0.0f);
        }
        ngn0Var.m163000F().m210933v(z);
    }

    /* JADX INFO: renamed from: x */
    public static xgn0 m162996x(ngn0 ngn0Var) {
        P p = ngn0Var.f48554b;
        p.getClass();
        List<fgn0> listM161243b = n2m0.m161243b();
        listM161243b.getClass();
        return new xgn0((wgn0) p, listM161243b, ngn0Var);
    }

    /* JADX INFO: renamed from: y */
    public static void m162997y(ngn0 ngn0Var, View view) {
        ngn0Var.mo72910j();
    }

    /* JADX INFO: renamed from: z */
    public static void m162998z(List list, ngn0 ngn0Var, Integer num) {
        if (num.intValue() < list.size()) {
            P p = ngn0Var.f48554b;
            p.getClass();
            ahn0.m97861c(p, ((fgn0) list.get(num.intValue())).getType());
        }
        ngn0Var.m162999E(num.intValue());
        ngn0Var.m162992H();
    }

    /* JADX INFO: renamed from: E */
    public final void m162999E(int index) {
        m163000F().m210928q(index);
        this.f84616h.m4178T(index, false);
    }

    /* JADX INFO: renamed from: F */
    public final xgn0 m163000F() {
        return (xgn0) this.adapter.getValue();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p153l.isl
    /* JADX INFO: renamed from: F0 */
    public void mo72905F0(boolean withShadow) {
        m163002K();
        super.mo72905F0(withShadow);
        m113471v().getViewTreeObserver().addOnGlobalLayoutListener(m163001G());
    }

    /* JADX INFO: renamed from: G */
    public final ViewTreeObserver.OnGlobalLayoutListener m163001G() {
        return (ViewTreeObserver.OnGlobalLayoutListener) this.layoutListener.getValue();
    }

    /* JADX INFO: renamed from: K */
    public final void m163002K() {
        m113471v().getViewTreeObserver().removeOnGlobalLayoutListener(m163001G());
    }

    /* JADX INFO: renamed from: L */
    public final void m163003L(final boolean show) {
        View viewM72912l = m72912l();
        if (viewM72912l != null) {
            viewM72912l.postDelayed(new Runnable() { // from class: l.kgn0
                @Override // java.lang.Runnable
                public final void run() {
                    ngn0.m162995w(this.f126634a, show);
                }
            }, 20L);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: f */
    public void mo72908f() {
        super.mo72908f();
        m163000F().m210930s();
        m163002K();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p153l.isl
    public void init() {
        super.init();
        m162993I();
        this.f84616h.m4177P(this.onPageChangeListener);
        this.f84616h.m4187d(this.onPageChangeListener);
        final List<fgn0> listM161243b = n2m0.m161243b();
        VoiceFunctionsTabView voiceFunctionsTabView = this.f84615g;
        listM161243b.getClass();
        voiceFunctionsTabView.m78527g(listM161243b, new y20() { // from class: l.jgn0
            @Override // p153l.y20
            public final void call(Object obj) {
                ngn0.m162998z(listM161243b, this, (Integer) obj);
            }
        });
        this.f84616h.setOffscreenPageLimit(listM161243b.size());
        this.f84616h.setAdapter(m163000F());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: j */
    public void mo72910j() {
        m162992H();
        this.f84615g.m78528h();
        super.mo72910j();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo72911k() {
        return obc0.f146505u;
    }
}
