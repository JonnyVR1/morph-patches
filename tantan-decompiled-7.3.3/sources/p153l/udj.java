package p153l;

import android.content.Context;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.floatview.view.FxManagerView;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000f\u0010\tJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\u0016\u0010\tJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\u001a\u0010\tJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001b\u0010\tJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001d\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010+\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b*\u0010(¨\u0006,"}, m88121d2 = {"Ll/udj;", "Ll/lul;", "", "Ll/vdj;", "helper", "<init>", "(Ll/vdj;)V", "", "cancel", "()V", "Lcom/p1/mobile/putong/floatview/view/FxManagerView;", "a", "()Lcom/p1/mobile/putong/floatview/view/FxManagerView;", Constants.INAPP_DATA_TAG, BLiveStormDanmakuGiftResourceType.f45292l, "k", "Landroid/view/ViewGroup;", RXScreenCaptureService.KEY_INDEX, "()Landroid/view/ViewGroup;", "container", "g", "(Landroid/view/ViewGroup;)V", "f", "Landroid/content/Context;", "e", "()Landroid/content/Context;", "c", "m", "viewGroup", "n", "Ll/vdj;", "b", "Lcom/p1/mobile/putong/floatview/view/FxManagerView;", "managerView", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "mContainer", "Ljava/lang/Runnable;", "Lkotlin/Lazy;", "h", "()Ljava/lang/Runnable;", "cancelAnimationRunnable", "j", "hideAnimationRunnable", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public class udj implements lul {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final vdj helper;

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

    /* JADX INFO: renamed from: l.udj$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class RunnableC20547a implements Runnable {
        public RunnableC20547a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            udj.this.mo180853m();
        }
    }

    /* JADX INFO: renamed from: l.udj$b */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class RunnableC20548b implements Runnable {
        public RunnableC20548b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            udj.this.m195485f();
        }
    }

    /* JADX INFO: renamed from: l.udj$c */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C20549c implements Function0<Runnable> {
        public C20549c() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Runnable invoke() {
            return udj.this.new RunnableC20547a();
        }
    }

    /* JADX INFO: renamed from: l.udj$d */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C20550d implements Function0<Runnable> {
        public C20550d() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Runnable invoke() {
            return udj.this.new RunnableC20548b();
        }
    }

    public udj(@NotNull vdj vdjVar) {
        vdjVar.getClass();
        this.helper = vdjVar;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.cancelAnimationRunnable = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new C20549c());
        this.hideAnimationRunnable = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new C20550d());
    }

    /* JADX INFO: renamed from: b */
    public static void m195482b(udj udjVar) {
        FxManagerView fxManagerView = udjVar.managerView;
        if (fxManagerView != null) {
            fxManagerView.removeCallbacks(udjVar.m195488j());
        }
        FxManagerView fxManagerView2 = udjVar.managerView;
        if (fxManagerView2 != null) {
            fxManagerView2.removeCallbacks(udjVar.m195486h());
        }
        WeakReference<ViewGroup> weakReference = udjVar.mContainer;
        udjVar.mo180851g(weakReference != null ? weakReference.get() : null);
        udjVar.managerView = null;
        udjVar.helper.m200968a();
        udjVar.m195483c();
    }

    @Override // p153l.lul
    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public FxManagerView getManagerView() {
        return this.managerView;
    }

    /* JADX INFO: renamed from: c */
    public final void m195483c() {
        WeakReference<ViewGroup> weakReference = this.mContainer;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.mContainer = null;
    }

    @Override // p153l.lul
    public void cancel() {
        if (this.managerView == null) {
            return;
        }
        mo180853m();
    }

    /* JADX INFO: renamed from: d */
    public void m195484d() {
        kul kulVar = this.helper.iFxConfigStorage;
        if (kulVar != null) {
            kulVar.clear();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public Context mo180850e() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        WeakReference<ViewGroup> weakReference = this.mContainer;
        Context context = null;
        if (((weakReference == null || (viewGroup2 = weakReference.get()) == null) ? null : viewGroup2.getContext()) == null) {
            mnd0.m159157a("context cannot be null");
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
    public final void m195485f() {
        ViewGroup viewGroupM195487i = m195487i();
        if (viewGroupM195487i == null) {
            return;
        }
        mo180851g(viewGroupM195487i);
    }

    /* JADX INFO: renamed from: g */
    public void mo180851g(@Nullable ViewGroup container) {
        if (this.managerView == null || container == null) {
            return;
        }
        nul nulVar = this.helper.iFxViewLifecycle;
        if (nulVar != null) {
            nulVar.mo120543a();
        }
        try {
            container.removeView(this.managerView);
        } catch (Exception e) {
            CrashHelper.m82480d(e, 100);
        }
    }

    /* JADX INFO: renamed from: h */
    public final Runnable m195486h() {
        return (Runnable) this.cancelAnimationRunnable.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final ViewGroup m195487i() {
        WeakReference<ViewGroup> weakReference = this.mContainer;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final Runnable m195488j() {
        return (Runnable) this.hideAnimationRunnable.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public void mo180852k() {
        this.managerView = new FxManagerView(mo180850e(), null, 2, 0 == true ? 1 : 0).m68296l(this.helper);
    }

    /* JADX INFO: renamed from: l */
    public final void m195489l() {
        vdj vdjVar = this.helper;
        if (vdjVar.layoutId == 0 && vdjVar.layoutView == null) {
            azk0.m101074a("The layout id cannot be 0 ,and layoutView==null");
            return;
        }
        ViewGroup viewGroupM195487i = m195487i();
        if (viewGroupM195487i != null) {
            viewGroupM195487i.removeView(this.managerView);
        }
        mo180852k();
    }

    /* JADX INFO: renamed from: m */
    public /* synthetic */ void mo180853m() {
        FxManagerView fxManagerView = this.managerView;
        if (fxManagerView != null) {
            fxManagerView.post(new Runnable() { // from class: l.tdj
                @Override // java.lang.Runnable
                public final void run() {
                    udj.m195482b(this.f173367a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m195490n(@NotNull ViewGroup viewGroup) {
        viewGroup.getClass();
        this.mContainer = new WeakReference<>(viewGroup);
    }
}
