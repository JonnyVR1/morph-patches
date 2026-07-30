package p149l;

import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.tab.VoiceFunctionsTabView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\"\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u0015\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u000fR\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010!\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#¨\u0006%"}, m87232d2 = {"Ll/j7n0;", "Ll/cyu;", "Ll/s7n0;", "<init>", "()V", "", "H", "I", "", "k", "()I", "f", "", "withShadow", "F0", "(Z)V", "K", "init", "j", FirebaseAnalytics.Param.INDEX, "E", "(I)V", "show", "L", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", "G", "()Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "layoutListener", "Ll/t7n0;", "F", "()Ll/t7n0;", "adapter", "l/j7n0$a", "Ll/j7n0$a;", "onPageChangeListener", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class j7n0 extends cyu<s7n0<?>> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy layoutListener = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.d7n0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return j7n0.m140096B(this.f84755a);
        }
    });

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.e7n0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return j7n0.m140102x(this.f89733a);
        }
    });

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final C17711a onPageChangeListener = new C17711a();

    /* JADX INFO: renamed from: l.j7n0$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/j7n0$a", "Ll/y660;", "", "position", "", "onPageSelected", "(I)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17711a extends y660 {
        public C17711a() {
        }

        @Override // p149l.y660, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int position) {
            j7n0.this.f83035g.m77343f(position);
            j7n0.this.m140106F().m187490t(position);
        }
    }

    /* JADX INFO: renamed from: B */
    public static ViewTreeObserver.OnGlobalLayoutListener m140096B(final j7n0 j7n0Var) {
        return new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.h7n0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                j7n0.m140100J(this.f106317a);
            }
        };
    }

    /* JADX INFO: renamed from: H */
    private final void m140098H() {
        Act act;
        if (m109390v() == null || (act = act()) == null) {
            return;
        }
        act.hideInput(m109390v());
    }

    /* JADX INFO: renamed from: I */
    private final void m140099I() {
        this.f83034f.m68714e("一起做点什么吧", true);
        this.f83034f.setBackListener(new View.OnClickListener() { // from class: l.i7n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j7n0.m140103y(this.f111931a, view);
            }
        });
        this.f83034f.setLeftView(4);
        this.f83034f.getTitleView().setTextColor(Color.parseColor("#CCFFFFFF"));
    }

    /* JADX INFO: renamed from: J */
    public static final void m140100J(j7n0 j7n0Var) {
        Rect rect = new Rect();
        j7n0Var.m109390v().getWindowVisibleDisplayFrame(rect);
        ((s7n0) j7n0Var.f47706b).m182510b4(xdl0.m208408w0() - rect.bottom);
    }

    /* JADX INFO: renamed from: w */
    public static void m140101w(j7n0 j7n0Var, boolean z) {
        View viewM71729l = j7n0Var.m71729l();
        if (viewM71729l != null) {
            viewM71729l.setTranslationY(z ? -t100.m186890d(16.0f) : 0.0f);
        }
        j7n0Var.m140106F().m187492v(z);
    }

    /* JADX INFO: renamed from: x */
    public static t7n0 m140102x(j7n0 j7n0Var) {
        P p = j7n0Var.f47706b;
        p.getClass();
        List<b7n0> listM143153b = jtl0.m143153b();
        listM143153b.getClass();
        return new t7n0((s7n0) p, listM143153b, j7n0Var);
    }

    /* JADX INFO: renamed from: y */
    public static void m140103y(j7n0 j7n0Var, View view) {
        j7n0Var.mo71727j();
    }

    /* JADX INFO: renamed from: z */
    public static void m140104z(List list, j7n0 j7n0Var, Integer num) {
        if (num.intValue() < list.size()) {
            P p = j7n0Var.f47706b;
            p.getClass();
            w7n0.m202026c(p, ((b7n0) list.get(num.intValue())).getType());
        }
        j7n0Var.m140105E(num.intValue());
        j7n0Var.m140098H();
    }

    /* JADX INFO: renamed from: E */
    public final void m140105E(int index) {
        m140106F().m187487q(index);
        this.f83036h.m4176T(index, false);
    }

    /* JADX INFO: renamed from: F */
    public final t7n0 m140106F() {
        return (t7n0) this.adapter.getValue();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p149l.vpl
    /* JADX INFO: renamed from: F0 */
    public void mo71722F0(boolean withShadow) {
        m140108K();
        super.mo71722F0(withShadow);
        m109390v().getViewTreeObserver().addOnGlobalLayoutListener(m140107G());
    }

    /* JADX INFO: renamed from: G */
    public final ViewTreeObserver.OnGlobalLayoutListener m140107G() {
        return (ViewTreeObserver.OnGlobalLayoutListener) this.layoutListener.getValue();
    }

    /* JADX INFO: renamed from: K */
    public final void m140108K() {
        m109390v().getViewTreeObserver().removeOnGlobalLayoutListener(m140107G());
    }

    /* JADX INFO: renamed from: L */
    public final void m140109L(final boolean show) {
        View viewM71729l = m71729l();
        if (viewM71729l != null) {
            viewM71729l.postDelayed(new Runnable() { // from class: l.g7n0
                @Override // java.lang.Runnable
                public final void run() {
                    j7n0.m140101w(this.f101419a, show);
                }
            }, 20L);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: f */
    public void mo71725f() {
        super.mo71725f();
        m140106F().m187489s();
        m140108K();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p149l.vpl
    public void init() {
        super.init();
        m140099I();
        this.f83036h.m4175P(this.onPageChangeListener);
        this.f83036h.m4185d(this.onPageChangeListener);
        final List<b7n0> listM143153b = jtl0.m143153b();
        VoiceFunctionsTabView voiceFunctionsTabView = this.f83035g;
        listM143153b.getClass();
        voiceFunctionsTabView.m77344g(listM143153b, new e30() { // from class: l.f7n0
            @Override // p149l.e30
            public final void call(Object obj) {
                j7n0.m140104z(listM143153b, this, (Integer) obj);
            }
        });
        this.f83036h.setOffscreenPageLimit(listM143153b.size());
        this.f83036h.setAdapter(m140106F());
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: j */
    public void mo71727j() {
        m140098H();
        this.f83035g.m77345h();
        super.mo71727j();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo71728k() {
        return i3c0.f111177u;
    }
}
