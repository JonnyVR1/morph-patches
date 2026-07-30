package p149l;

import android.content.Context;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.floatview.view.FxManagerView;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000f\u0010\tJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\u0016\u0010\tJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\u001a\u0010\tJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001b\u0010\tJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001d\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010+\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b*\u0010(¨\u0006,"}, m87232d2 = {"Ll/abj;", "Ll/xrl;", "", "Ll/bbj;", "helper", "<init>", "(Ll/bbj;)V", "", "cancel", "()V", "Lcom/p1/mobile/putong/floatview/view/FxManagerView;", "a", "()Lcom/p1/mobile/putong/floatview/view/FxManagerView;", Constants.INAPP_DATA_TAG, BLiveStormDanmakuGiftResourceType.f44444l, "k", "Landroid/view/ViewGroup;", RXScreenCaptureService.KEY_INDEX, "()Landroid/view/ViewGroup;", "container", "g", "(Landroid/view/ViewGroup;)V", "f", "Landroid/content/Context;", "e", "()Landroid/content/Context;", "c", "m", "viewGroup", "n", "Ll/bbj;", "b", "Lcom/p1/mobile/putong/floatview/view/FxManagerView;", "managerView", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "mContainer", "Ljava/lang/Runnable;", "Lkotlin/Lazy;", "h", "()Ljava/lang/Runnable;", "cancelAnimationRunnable", "j", "hideAnimationRunnable", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class RunnableC15575a implements Runnable {
        public RunnableC15575a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            abj.this.mo95665m();
        }
    }

    /* JADX INFO: renamed from: l.abj$b */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class RunnableC15576b implements Runnable {
        public RunnableC15576b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            abj.this.m95658f();
        }
    }

    /* JADX INFO: renamed from: l.abj$c */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C15577c implements Function0<Runnable> {
        public C15577c() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Runnable invoke() {
            return abj.this.new RunnableC15575a();
        }
    }

    /* JADX INFO: renamed from: l.abj$d */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C15578d implements Function0<Runnable> {
        public C15578d() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Runnable invoke() {
            return abj.this.new RunnableC15576b();
        }
    }

    public abj(@NotNull bbj bbjVar) {
        bbjVar.getClass();
        this.helper = bbjVar;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.cancelAnimationRunnable = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new C15577c());
        this.hideAnimationRunnable = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new C15578d());
    }

    /* JADX INFO: renamed from: b */
    public static void m95653b(abj abjVar) {
        FxManagerView fxManagerView = abjVar.managerView;
        if (fxManagerView != null) {
            fxManagerView.removeCallbacks(abjVar.m95662j());
        }
        FxManagerView fxManagerView2 = abjVar.managerView;
        if (fxManagerView2 != null) {
            fxManagerView2.removeCallbacks(abjVar.m95660h());
        }
        WeakReference<ViewGroup> weakReference = abjVar.mContainer;
        abjVar.mo95659g(weakReference != null ? weakReference.get() : null);
        abjVar.managerView = null;
        abjVar.helper.m100958a();
        abjVar.m95655c();
    }

    @Override // p149l.xrl
    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public FxManagerView getManagerView() {
        return this.managerView;
    }

    /* JADX INFO: renamed from: c */
    public final void m95655c() {
        WeakReference<ViewGroup> weakReference = this.mContainer;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.mContainer = null;
    }

    @Override // p149l.xrl
    public void cancel() {
        if (this.managerView == null) {
            return;
        }
        mo95665m();
    }

    /* JADX INFO: renamed from: d */
    public void m95656d() {
        wrl wrlVar = this.helper.iFxConfigStorage;
        if (wrlVar != null) {
            wrlVar.clear();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public Context mo95657e() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        WeakReference<ViewGroup> weakReference = this.mContainer;
        Context context = null;
        if (((weakReference == null || (viewGroup2 = weakReference.get()) == null) ? null : viewGroup2.getContext()) == null) {
            jfd0.m141176a("context cannot be null");
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
    public final void m95658f() {
        ViewGroup viewGroupM95661i = m95661i();
        if (viewGroupM95661i == null) {
            return;
        }
        mo95659g(viewGroupM95661i);
    }

    /* JADX INFO: renamed from: g */
    public void mo95659g(@Nullable ViewGroup container) {
        if (this.managerView == null || container == null) {
            return;
        }
        zrl zrlVar = this.helper.iFxViewLifecycle;
        if (zrlVar != null) {
            zrlVar.mo145302a();
        }
        try {
            container.removeView(this.managerView);
        } catch (Exception e) {
            CrashHelper.m81297d(e, 100);
        }
    }

    /* JADX INFO: renamed from: h */
    public final Runnable m95660h() {
        return (Runnable) this.cancelAnimationRunnable.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final ViewGroup m95661i() {
        WeakReference<ViewGroup> weakReference = this.mContainer;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final Runnable m95662j() {
        return (Runnable) this.hideAnimationRunnable.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public void mo95663k() {
        this.managerView = new FxManagerView(mo95657e(), null, 2, 0 == true ? 1 : 0).m67113l(this.helper);
    }

    /* JADX INFO: renamed from: l */
    public final void m95664l() {
        bbj bbjVar = this.helper;
        if (bbjVar.layoutId == 0 && bbjVar.layoutView == null) {
            upk0.m194883a("The layout id cannot be 0 ,and layoutView==null");
            return;
        }
        ViewGroup viewGroupM95661i = m95661i();
        if (viewGroupM95661i != null) {
            viewGroupM95661i.removeView(this.managerView);
        }
        mo95663k();
    }

    /* JADX INFO: renamed from: m */
    public /* synthetic */ void mo95665m() {
        FxManagerView fxManagerView = this.managerView;
        if (fxManagerView != null) {
            fxManagerView.post(new Runnable() { // from class: l.zaj
                @Override // java.lang.Runnable
                public final void run() {
                    abj.m95653b(this.f202367a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m95666n(@NotNull ViewGroup viewGroup) {
        viewGroup.getClass();
        this.mContainer = new WeakReference<>(viewGroup);
    }
}
