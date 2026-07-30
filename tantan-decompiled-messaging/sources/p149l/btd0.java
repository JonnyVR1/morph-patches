package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.vap.util.ScaleType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 92\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ\u0019\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010'\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b\u0006\u0010&R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010(R\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010(R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010(R\"\u00103\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00108\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00104\u001a\u0004\b5\u0010\u0015\"\u0004\b6\u00107¨\u0006:"}, m87232d2 = {"Ll/btd0;", "", "<init>", "()V", "", "w", "h", "", BLiveStormDanmakuGiftResourceType.f44444l, "(II)V", "n", "Lkotlin/Pair;", "g", "()Lkotlin/Pair;", "Landroid/view/View;", OMSTemplateModeType.view, "Landroid/widget/FrameLayout$LayoutParams;", "f", "(Landroid/view/View;)Landroid/widget/FrameLayout$LayoutParams;", "Ll/r2m;", "e", "()Ll/r2m;", "", Constants.INAPP_DATA_TAG, "()Z", "Ll/xsd0;", "a", "Lkotlin/Lazy;", "j", "()Ll/xsd0;", "scaleTypeFitXY", "Ll/wsd0;", "b", RXScreenCaptureService.KEY_INDEX, "()Ll/wsd0;", "scaleTypeFitCenter", "Ll/usd0;", "c", "()Ll/usd0;", "scaleTypeCenterCrop", "I", "layoutWidth", "layoutHeight", "videoWidth", "videoHeight", "Lcom/p1/mobile/putong/live/base/vap/util/ScaleType;", "Lcom/p1/mobile/putong/live/base/vap/util/ScaleType;", "getCurrentScaleType", "()Lcom/p1/mobile/putong/live/base/vap/util/ScaleType;", "k", "(Lcom/p1/mobile/putong/live/base/vap/util/ScaleType;)V", "currentScaleType", "Ll/r2m;", "getScaleTypeImpl", "m", "(Ll/r2m;)V", "scaleTypeImpl", "Companion", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class btd0 {

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
    public r2m scaleTypeImpl;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy scaleTypeFitXY = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.ysd0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return btd0.m103814b();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy scaleTypeFitCenter = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.zsd0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return btd0.m103815c();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Lazy scaleTypeCenterCrop = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.atd0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return btd0.m103813a();
        }
    });

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public ScaleType currentScaleType = ScaleType.FIT_XY;

    /* JADX INFO: renamed from: l.btd0$b */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C15969b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f77210a;

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
            f77210a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static usd0 m103813a() {
        return new usd0();
    }

    /* JADX INFO: renamed from: b */
    public static xsd0 m103814b() {
        return new xsd0();
    }

    /* JADX INFO: renamed from: c */
    public static wsd0 m103815c() {
        return new wsd0();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m103816d() {
        return this.layoutWidth > 0 && this.layoutHeight > 0 && this.videoWidth > 0 && this.videoHeight > 0;
    }

    /* JADX INFO: renamed from: e */
    public final r2m m103817e() {
        r2m r2mVar = this.scaleTypeImpl;
        if (r2mVar != null) {
            C21588z0.INSTANCE.m216709d("AnimPlayer.ScaleTypeUtil", "custom scaleType");
            return r2mVar;
        }
        C21588z0.INSTANCE.m216709d("AnimPlayer.ScaleTypeUtil", "scaleType=" + this.currentScaleType);
        int i = C15969b.f77210a[this.currentScaleType.ordinal()];
        if (i == 1) {
            return m103822j();
        }
        if (i == 2) {
            return m103821i();
        }
        if (i == 3) {
            return m103820h();
        }
        l9r.m149037a();
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final FrameLayout.LayoutParams m103818f(@Nullable View view) {
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        }
        FrameLayout.LayoutParams layoutParams3 = layoutParams2;
        if (m103816d()) {
            return m103817e().mo177611a(this.layoutWidth, this.layoutHeight, this.videoWidth, this.videoHeight, layoutParams3);
        }
        C21588z0.INSTANCE.m216707b("AnimPlayer.ScaleTypeUtil", "params error: layoutWidth=" + this.layoutWidth + ", layoutHeight=" + this.layoutHeight + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight);
        return layoutParams3;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Pair<Integer, Integer> m103819g() {
        Pair<Integer, Integer> realSize = m103817e().getRealSize();
        C21588z0.INSTANCE.m216709d("AnimPlayer.ScaleTypeUtil", "get real size (" + realSize.getFirst() + ", " + realSize.getSecond() + ")");
        return realSize;
    }

    /* JADX INFO: renamed from: h */
    public final usd0 m103820h() {
        return (usd0) this.scaleTypeCenterCrop.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final wsd0 m103821i() {
        return (wsd0) this.scaleTypeFitCenter.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final xsd0 m103822j() {
        return (xsd0) this.scaleTypeFitXY.getValue();
    }

    /* JADX INFO: renamed from: k */
    public final void m103823k(@NotNull ScaleType scaleType) {
        scaleType.getClass();
        this.currentScaleType = scaleType;
    }

    /* JADX INFO: renamed from: l */
    public final void m103824l(int w, int h) {
        this.layoutWidth = w;
        this.layoutHeight = h;
    }

    /* JADX INFO: renamed from: m */
    public final void m103825m(@Nullable r2m r2mVar) {
        this.scaleTypeImpl = r2mVar;
    }

    /* JADX INFO: renamed from: n */
    public final void m103826n(int w, int h) {
        this.videoWidth = w;
        this.videoHeight = h;
    }
}
