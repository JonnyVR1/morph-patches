package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.vap.util.ScaleType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 92\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ\u0019\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010'\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b\u0006\u0010&R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010(R\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010(R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010(R\"\u00103\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00108\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00104\u001a\u0004\b5\u0010\u0015\"\u0004\b6\u00107¨\u0006:"}, m88121d2 = {"Ll/d1e0;", "", "<init>", "()V", "", "w", "h", "", BLiveStormDanmakuGiftResourceType.f45292l, "(II)V", "n", "Lkotlin/Pair;", "g", "()Lkotlin/Pair;", "Landroid/view/View;", OMSTemplateModeType.view, "Landroid/widget/FrameLayout$LayoutParams;", "f", "(Landroid/view/View;)Landroid/widget/FrameLayout$LayoutParams;", "Ll/k5m;", "e", "()Ll/k5m;", "", Constants.INAPP_DATA_TAG, "()Z", "Ll/z0e0;", "a", "Lkotlin/Lazy;", "j", "()Ll/z0e0;", "scaleTypeFitXY", "Ll/y0e0;", "b", RXScreenCaptureService.KEY_INDEX, "()Ll/y0e0;", "scaleTypeFitCenter", "Ll/w0e0;", "c", "()Ll/w0e0;", "scaleTypeCenterCrop", "I", "layoutWidth", "layoutHeight", "videoWidth", "videoHeight", "Lcom/p1/mobile/putong/live/base/vap/util/ScaleType;", "Lcom/p1/mobile/putong/live/base/vap/util/ScaleType;", "getCurrentScaleType", "()Lcom/p1/mobile/putong/live/base/vap/util/ScaleType;", "k", "(Lcom/p1/mobile/putong/live/base/vap/util/ScaleType;)V", "currentScaleType", "Ll/k5m;", "getScaleTypeImpl", "m", "(Ll/k5m;)V", "scaleTypeImpl", "Companion", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class d1e0 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int layoutWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int layoutHeight;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int videoWidth;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int videoHeight;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public k5m scaleTypeImpl;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy scaleTypeFitXY = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.a1e0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d1e0.m113559b();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy scaleTypeFitCenter = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.b1e0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d1e0.m113560c();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Lazy scaleTypeCenterCrop = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.c1e0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d1e0.m113558a();
        }
    });

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public ScaleType currentScaleType = ScaleType.FIT_XY;

    /* JADX INFO: renamed from: l.d1e0$b */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C16418b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f84677a;

        static {
            int[] iArr = new int[ScaleType.values().length];
            try {
                iArr[ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScaleType.CENTER_CROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f84677a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static w0e0 m113558a() {
        return new w0e0();
    }

    /* JADX INFO: renamed from: b */
    public static z0e0 m113559b() {
        return new z0e0();
    }

    /* JADX INFO: renamed from: c */
    public static y0e0 m113560c() {
        return new y0e0();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m113561d() {
        return this.layoutWidth > 0 && this.layoutHeight > 0 && this.videoWidth > 0 && this.videoHeight > 0;
    }

    /* JADX INFO: renamed from: e */
    public final k5m m113562e() {
        k5m k5mVar = this.scaleTypeImpl;
        if (k5mVar != null) {
            C21726z0.INSTANCE.m218095d("AnimPlayer.ScaleTypeUtil", "custom scaleType");
            return k5mVar;
        }
        C21726z0.INSTANCE.m218095d("AnimPlayer.ScaleTypeUtil", "scaleType=" + this.currentScaleType);
        int i = C16418b.f84677a[this.currentScaleType.ordinal()];
        if (i == 1) {
            return m113567j();
        }
        if (i == 2) {
            return m113566i();
        }
        if (i == 3) {
            return m113565h();
        }
        nbr.m162172a();
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final FrameLayout.LayoutParams m113563f(@Nullable View view) {
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        }
        FrameLayout.LayoutParams layoutParams3 = layoutParams2;
        if (m113561d()) {
            return m113562e().mo148411a(this.layoutWidth, this.layoutHeight, this.videoWidth, this.videoHeight, layoutParams3);
        }
        C21726z0.INSTANCE.m218093b("AnimPlayer.ScaleTypeUtil", "params error: layoutWidth=" + this.layoutWidth + ", layoutHeight=" + this.layoutHeight + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight);
        return layoutParams3;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Pair<Integer, Integer> m113564g() {
        Pair<Integer, Integer> realSize = m113562e().getRealSize();
        C21726z0.INSTANCE.m218095d("AnimPlayer.ScaleTypeUtil", "get real size (" + realSize.getFirst() + ", " + realSize.getSecond() + ")");
        return realSize;
    }

    /* JADX INFO: renamed from: h */
    public final w0e0 m113565h() {
        return (w0e0) this.scaleTypeCenterCrop.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final y0e0 m113566i() {
        return (y0e0) this.scaleTypeFitCenter.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final z0e0 m113567j() {
        return (z0e0) this.scaleTypeFitXY.getValue();
    }

    /* JADX INFO: renamed from: k */
    public final void m113568k(@NotNull ScaleType scaleType) {
        scaleType.getClass();
        this.currentScaleType = scaleType;
    }

    /* JADX INFO: renamed from: l */
    public final void m113569l(int w, int h) {
        this.layoutWidth = w;
        this.layoutHeight = h;
    }

    /* JADX INFO: renamed from: m */
    public final void m113570m(@Nullable k5m k5mVar) {
        this.scaleTypeImpl = k5mVar;
    }

    /* JADX INFO: renamed from: n */
    public final void m113571n(int w, int h) {
        this.videoWidth = w;
        this.videoHeight = h;
    }
}
