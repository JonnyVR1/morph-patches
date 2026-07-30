package p149l;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.floatview.assist.FxGravity;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m87231d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003R\u0016\u0010\b\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u00020\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0016\u0010$\u001a\u00020!8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020%8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010,\u001a\u00020%8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b+\u0010'R\u0016\u0010.\u001a\u00020%8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b-\u0010'R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b?\u0010\u0007R\u0016\u0010B\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bA\u0010\u0007¨\u0006C"}, m87232d2 = {"Ll/bbj;", "", "<init>", "()V", "", "a", "", "I", "layoutId", "Landroid/view/View;", "b", "Landroid/view/View;", "layoutView", "Lcom/p1/mobile/putong/floatview/assist/FxGravity;", "c", "Lcom/p1/mobile/putong/floatview/assist/FxGravity;", "gravity", "", Constants.INAPP_DATA_TAG, "J", "clickTime", "Landroid/widget/FrameLayout$LayoutParams;", "e", "Landroid/widget/FrameLayout$LayoutParams;", "layoutParams", "", "f", "F", "defaultY", "g", "defaultX", "h", "edgeOffset", "Ll/cbj;", RXScreenCaptureService.KEY_INDEX, "Ll/cbj;", "fxBorderMargin", "", "j", "Z", "enableFx", "k", "enableEdgeAdsorption", BLiveStormDanmakuGiftResourceType.f44444l, "enableTouch", "m", "enableClickListener", "Ll/yrl;", "n", "Ll/yrl;", "iFxScrollListener", "Ll/zrl;", "o", "Ll/zrl;", "iFxViewLifecycle", "Ll/wrl;", "p", "Ll/wrl;", "iFxConfigStorage", "Landroid/view/View$OnClickListener;", "q", "Landroid/view/View$OnClickListener;", "iFxClickListener", "r", "navigationBarHeight", BLiveStormDanmakuGiftResourceType.f44446s, "statsBarHeight", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class bbj {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    public int layoutId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public View layoutView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public FrameLayout.LayoutParams layoutParams;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @JvmField
    public float defaultY;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @JvmField
    public float defaultX;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @JvmField
    public float edgeOffset;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @JvmField
    public boolean enableFx;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public yrl iFxScrollListener;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public zrl iFxViewLifecycle;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public wrl iFxConfigStorage;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public View.OnClickListener iFxClickListener;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @JvmField
    public int navigationBarHeight;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @JvmField
    public int statsBarHeight;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public FxGravity gravity = FxGravity.DEFAULT;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    public long clickTime = 300;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public cbj fxBorderMargin = new cbj(0.0f, 0.0f, 0.0f, 0.0f, 15, null);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @JvmField
    public boolean enableEdgeAdsorption = true;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @JvmField
    public boolean enableTouch = true;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @JvmField
    public boolean enableClickListener = true;

    /* JADX INFO: renamed from: l.bbj$a */
    @Metadata(m87231d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0001H$¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00028\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J-\u0010%\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001e¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00028\u00002\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00028\u00002\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00028\u00002\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00028\u00002\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0002¢\u0006\u0004\b8\u0010\u0006R\u0016\u0010;\u001a\u0002098\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u0010:R\u0018\u0010=\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010<R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0016\u0010@\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010AR\u0016\u0010D\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010CR\u0016\u0010E\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010CR\u0016\u0010F\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010CR\u0016\u0010H\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010GR\u0016\u0010K\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010JR\u0016\u0010L\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010GR\u0016\u0010M\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010GR\u0016\u0010O\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010GR\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010PR\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010QR\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010RR\u0018\u0010U\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006V"}, m87232d2 = {"Ll/bbj$a;", j6f.GPS_DIRECTION_TRUE, "Ll/bbj;", "B", "", "<init>", "()V", "c", "()Ll/bbj;", "b", Constants.INAPP_DATA_TAG, "()Ljava/lang/Object;", "Landroid/view/View;", OMSTemplateModeType.view, RXScreenCaptureService.KEY_INDEX, "(Landroid/view/View;)Ljava/lang/Object;", "Landroid/widget/FrameLayout$LayoutParams;", "param", "j", "(Landroid/widget/FrameLayout$LayoutParams;)Ljava/lang/Object;", "", "isEnable", "g", "(Z)Ljava/lang/Object;", "", "time", "Landroid/view/View$OnClickListener;", "clickListener", "k", "(JLandroid/view/View$OnClickListener;)Ljava/lang/Object;", "", "edge", "f", "(F)Ljava/lang/Object;", Constants.KEY_T, BLiveStormDanmakuGiftResourceType.f44444l, "r", "e", "(FFFF)Ljava/lang/Object;", "Lcom/p1/mobile/putong/floatview/assist/FxGravity;", "gravity", "h", "(Lcom/p1/mobile/putong/floatview/assist/FxGravity;)Ljava/lang/Object;", "Ll/zrl;", "iFxViewLifecycle", "p", "(Ll/zrl;)Ljava/lang/Object;", "Ll/yrl;", "iFxScrollListener", "o", "(Ll/yrl;)Ljava/lang/Object;", "Ll/wrl;", "iFxConfigStorage", "n", "(Ll/wrl;)Ljava/lang/Object;", "", "a", "", "I", "layoutId", "Landroid/view/View;", "layoutView", "Lcom/p1/mobile/putong/floatview/assist/FxGravity;", "J", "clickTime", "Landroid/widget/FrameLayout$LayoutParams;", "layoutParams", "F", "defaultY", "defaultX", "edgeOffset", "Z", "enableFx", "Ll/cbj;", "Ll/cbj;", "fxBorderMargin", "enableEdgeAdsorption", "enableTouch", "m", "enableClickListener", "Ll/wrl;", "Ll/yrl;", "Ll/zrl;", "q", "Landroid/view/View$OnClickListener;", "ifxClickListener", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static abstract class AbstractC15831a<T, B extends bbj> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @LayoutRes
        public int layoutId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public View layoutView;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public FrameLayout.LayoutParams layoutParams;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public float defaultY;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public float defaultX;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public float edgeOffset;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public boolean enableFx;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        public boolean enableClickListener;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @Nullable
        public yrl iFxScrollListener;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        @Nullable
        public zrl iFxViewLifecycle;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        @Nullable
        public View.OnClickListener ifxClickListener;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public FxGravity gravity = FxGravity.DEFAULT;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public long clickTime = 300;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @NotNull
        public cbj fxBorderMargin = new cbj(0.0f, 0.0f, 0.0f, 0.0f, 15, null);

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        public boolean enableEdgeAdsorption = true;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        public boolean enableTouch = true;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        @NotNull
        public wrl iFxConfigStorage = new dbj();

        /* JADX INFO: renamed from: l.bbj$a$a */
        @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f74845a;

            static {
                int[] iArr = new int[FxGravity.values().length];
                try {
                    iArr[FxGravity.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FxGravity.LEFT_OR_TOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FxGravity.LEFT_OR_BOTTOM.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[FxGravity.RIGHT_OR_BOTTOM.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[FxGravity.RIGHT_OR_TOP.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[FxGravity.RIGHT_OR_CENTER.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[FxGravity.LEFT_OR_CENTER.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[FxGravity.TOP_OR_CENTER.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[FxGravity.BOTTOM_OR_CENTER.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                f74845a = iArr;
            }
        }

        /* JADX INFO: renamed from: m */
        public static /* synthetic */ Object m100959m(AbstractC15831a abstractC15831a, long j, View.OnClickListener onClickListener, int i, Object obj) {
            if (obj != null) {
                qq3.m175877a("Super calls with default arguments not supported in this target, function: setOnClickListener");
                return null;
            }
            if ((i & 1) != 0) {
                j = 500;
            }
            return abstractC15831a.m100970k(j, onClickListener);
        }

        /* JADX INFO: renamed from: a */
        public final void m100960a() {
            if (this.gravity.isDefault()) {
                float b = this.fxBorderMargin.getB();
                float f = this.fxBorderMargin.getCom.clevertap.android.sdk.Constants.KEY_T java.lang.String();
                float r = this.fxBorderMargin.getR();
                float f2 = this.fxBorderMargin.getCom.p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType.l java.lang.String();
                this.defaultX = 0.0f;
                this.defaultY = 0.0f;
                switch (a.f74845a[this.gravity.ordinal()]) {
                    case 1:
                    case 2:
                        this.defaultX = f2;
                        this.defaultY = f;
                        break;
                    case 3:
                        this.defaultY = -b;
                        this.defaultX = f2;
                        break;
                    case 4:
                        this.defaultY = -b;
                        this.defaultX = -r;
                        break;
                    case 5:
                        this.defaultX = -r;
                        this.defaultY = f;
                        break;
                    case 6:
                        this.defaultX = -r;
                        break;
                    case 7:
                        this.defaultX = f2;
                        break;
                    case 8:
                        this.defaultY = f;
                        break;
                    case 9:
                        this.defaultY = -b;
                        break;
                }
            }
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public B m100961b() {
            B b = (B) mo100962c();
            m100960a();
            b.enableFx = this.enableFx;
            b.layoutId = this.layoutId;
            b.layoutView = this.layoutView;
            b.gravity = this.gravity;
            b.clickTime = this.clickTime;
            b.layoutParams = this.layoutParams;
            b.defaultY = this.defaultY;
            b.defaultX = this.defaultX;
            b.edgeOffset = this.edgeOffset;
            b.enableEdgeAdsorption = this.enableEdgeAdsorption;
            b.fxBorderMargin = this.fxBorderMargin;
            b.enableTouch = this.enableTouch;
            b.enableClickListener = this.enableClickListener;
            b.iFxScrollListener = this.iFxScrollListener;
            b.iFxViewLifecycle = this.iFxViewLifecycle;
            b.iFxConfigStorage = this.iFxConfigStorage;
            b.iFxClickListener = this.ifxClickListener;
            return b;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public abstract B mo100962c();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: d */
        public final T m100963d() {
            this.enableFx = true;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: e */
        public final T m100964e(float t, float l2, float b, float r) {
            cbj cbjVar = this.fxBorderMargin;
            cbjVar.m106007h(t);
            cbjVar.m106005f(l2);
            cbjVar.m106004e(b);
            cbjVar.m106006g(r);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: f */
        public final T m100965f(float edge) {
            this.edgeOffset = Math.abs(edge);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: g */
        public final T m100966g(boolean isEnable) {
            this.enableTouch = isEnable;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: h */
        public final T m100967h(@NotNull FxGravity gravity) {
            gravity.getClass();
            this.gravity = gravity;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: i */
        public final T m100968i(@NotNull View view) {
            view.getClass();
            this.layoutId = 0;
            this.layoutView = view;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: j */
        public final T m100969j(@NotNull FrameLayout.LayoutParams param) {
            param.getClass();
            this.layoutParams = param;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmOverloads
        /* JADX INFO: renamed from: k */
        public final T m100970k(long time, @NotNull View.OnClickListener clickListener) {
            clickListener.getClass();
            this.enableClickListener = true;
            this.ifxClickListener = clickListener;
            this.clickTime = time;
            return this;
        }

        @JvmOverloads
        /* JADX INFO: renamed from: l */
        public final T m100971l(@NotNull View.OnClickListener onClickListener) {
            onClickListener.getClass();
            return (T) m100959m(this, 0L, onClickListener, 1, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: n */
        public final T m100972n(@NotNull wrl iFxConfigStorage) {
            iFxConfigStorage.getClass();
            this.iFxConfigStorage = iFxConfigStorage;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: o */
        public final T m100973o(@NotNull yrl iFxScrollListener) {
            iFxScrollListener.getClass();
            this.iFxScrollListener = iFxScrollListener;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: p */
        public final T m100974p(@NotNull zrl iFxViewLifecycle) {
            iFxViewLifecycle.getClass();
            this.iFxViewLifecycle = iFxViewLifecycle;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m100958a() {
        this.layoutView = null;
        this.enableFx = false;
    }
}
