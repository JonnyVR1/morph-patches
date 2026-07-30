package p007l;

import android.content.Context;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.floatview.view.FxManagerView;
import com.p006ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import l.jfd0;
import l.upk0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000f\u0010\tJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\u0016\u0010\tJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\u001a\u0010\tJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001b\u0010\tJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001d\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010+\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b*\u0010(¨\u0006,"}, d2 = {"Ll/abj;", "Ll/xrl;", "", "Ll/bbj;", "helper", "<init>", "(Ll/bbj;)V", "", "cancel", "()V", "Lcom/p1/mobile/putong/floatview/view/FxManagerView;", "a", "()Lcom/p1/mobile/putong/floatview/view/FxManagerView;", "d", "l", "k", "Landroid/view/ViewGroup;", RXScreenCaptureService.KEY_INDEX, "()Landroid/view/ViewGroup;", "container", "g", "(Landroid/view/ViewGroup;)V", "f", "Landroid/content/Context;", "e", "()Landroid/content/Context;", "c", "m", "viewGroup", "n", "Ll/bbj;", "b", "Lcom/p1/mobile/putong/floatview/view/FxManagerView;", "managerView", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "mContainer", "Ljava/lang/Runnable;", "Lkotlin/Lazy;", "h", "()Ljava/lang/Runnable;", "cancelAnimationRunnable", "j", "hideAnimationRunnable", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public class abj implements xrl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final bbj helper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public FxManagerView managerView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public WeakReference<ViewGroup> mContainer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Lazy cancelAnimationRunnable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Lazy hideAnimationRunnable;

    /* JADX INFO: renamed from: l.abj$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class RunnableC2323a implements Runnable {
        public RunnableC2323a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            abj.this.mo8491m();
        }
    }

    /* JADX INFO: renamed from: l.abj$b */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class RunnableC2324b implements Runnable {
        public RunnableC2324b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            abj.this.m8484f();
        }
    }

    /* JADX INFO: renamed from: l.abj$c */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class C2325c implements Function0<Runnable> {
        public C2325c() {
        }

        public final Runnable invoke() {
            return abj.this.new RunnableC2323a();
        }
    }

    /* JADX INFO: renamed from: l.abj$d */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class C2326d implements Function0<Runnable> {
        public C2326d() {
        }

        public final Runnable invoke() {
            return abj.this.new RunnableC2324b();
        }
    }

    public abj(@NotNull bbj bbjVar) {
        bbjVar.getClass();
        this.helper = bbjVar;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.cancelAnimationRunnable = LazyKt__LazyJVMKt.a(lazyThreadSafetyMode, new C2325c());
        this.hideAnimationRunnable = LazyKt__LazyJVMKt.a(lazyThreadSafetyMode, new C2326d());
    }

    /* JADX INFO: renamed from: b */
    public static void m8479b(abj abjVar) {
        FxManagerView fxManagerView = abjVar.managerView;
        if (fxManagerView != null) {
            fxManagerView.removeCallbacks(abjVar.m8488j());
        }
        FxManagerView fxManagerView2 = abjVar.managerView;
        if (fxManagerView2 != null) {
            fxManagerView2.removeCallbacks(abjVar.m8486h());
        }
        WeakReference<ViewGroup> weakReference = abjVar.mContainer;
        abjVar.mo8485g(weakReference != null ? weakReference.get() : null);
        abjVar.managerView = null;
        abjVar.helper.m8781a();
        abjVar.m8481c();
    }

    @Override // p007l.xrl
    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public FxManagerView getManagerView() {
        return this.managerView;
    }

    /* JADX INFO: renamed from: c */
    public final void m8481c() {
        WeakReference<ViewGroup> weakReference = this.mContainer;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.mContainer = null;
    }

    @Override // p007l.xrl
    public void cancel() {
        if (this.managerView == null) {
            return;
        }
        mo8491m();
    }

    /* JADX INFO: renamed from: d */
    public void m8482d() {
        wrl wrlVar = this.helper.iFxConfigStorage;
        if (wrlVar != null) {
            wrlVar.clear();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public Context mo8483e() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        WeakReference<ViewGroup> weakReference = this.mContainer;
        Context context = null;
        if (((weakReference == null || (viewGroup2 = weakReference.get()) == null) ? null : viewGroup2.getContext()) == null) {
            jfd0.a("context cannot be null");
            return null;
        }
        WeakReference<ViewGroup> weakReference2 = this.mContainer;
        if (weakReference2 != null && (viewGroup = weakReference2.get()) != null) {
            context = viewGroup.getContext();
        }
        context.getClass();
        return context;
    }

    /* JADX INFO: renamed from: f */
    public final void m8484f() {
        ViewGroup viewGroupM8487i = m8487i();
        if (viewGroupM8487i == null) {
            return;
        }
        mo8485g(viewGroupM8487i);
    }

    /* JADX INFO: renamed from: g */
    public void mo8485g(@Nullable ViewGroup container) {
        if (this.managerView == null || container == null) {
            return;
        }
        zrl zrlVar = this.helper.iFxViewLifecycle;
        if (zrlVar != null) {
            zrlVar.mo11400a();
        }
        try {
            container.removeView(this.managerView);
        } catch (Exception e) {
            CrashHelper.d(e, 100);
        }
    }

    /* JADX INFO: renamed from: h */
    public final Runnable m8486h() {
        return (Runnable) this.cancelAnimationRunnable.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final ViewGroup m8487i() {
        WeakReference<ViewGroup> weakReference = this.mContainer;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final Runnable m8488j() {
        return (Runnable) this.hideAnimationRunnable.getValue();
    }

    /* JADX INFO: renamed from: k */
    public void mo8489k() {
        this.managerView = new FxManagerView(mo8483e(), null, 2, null).m8320l(this.helper);
    }

    /* JADX INFO: renamed from: l */
    public final void m8490l() {
        bbj bbjVar = this.helper;
        if (bbjVar.layoutId == 0 && bbjVar.layoutView == null) {
            upk0.a("The layout id cannot be 0 ,and layoutView==null");
            return;
        }
        ViewGroup viewGroupM8487i = m8487i();
        if (viewGroupM8487i != null) {
            viewGroupM8487i.removeView(this.managerView);
        }
        mo8489k();
    }

    /* JADX INFO: renamed from: m */
    public /* synthetic */ void mo8491m() {
        FxManagerView fxManagerView = this.managerView;
        if (fxManagerView != null) {
            fxManagerView.post(new Runnable() { // from class: l.zaj
                @Override // java.lang.Runnable
                public final void run() {
                    abj.m8479b(this.f15681a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m8492n(@NotNull ViewGroup viewGroup) {
        viewGroup.getClass();
        this.mContainer = new WeakReference<>(viewGroup);
    }
}
