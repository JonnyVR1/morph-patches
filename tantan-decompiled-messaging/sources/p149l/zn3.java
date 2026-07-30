package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.buzz.R$string;
import com.p046p1.mobile.putong.core.data.LoveBuzzData;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.BuzzComboAct;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.BuzzComboEntranceView;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.BuzzRegionPassiveView;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.MemojiBuzzComboEntranceView;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 ±\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\tJ\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0010J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\tJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\tJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b'\u0010#J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0007¢\u0006\u0004\b+\u0010\tJ\r\u0010,\u001a\u00020\u0007¢\u0006\u0004\b,\u0010\tJ\r\u0010-\u001a\u00020\u0007¢\u0006\u0004\b-\u0010\tJ\r\u0010.\u001a\u00020\u0007¢\u0006\u0004\b.\u0010\tJ\u0017\u00101\u001a\u00020\u00072\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\u00072\u0006\u00103\u001a\u00020\n¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u00072\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00072\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u00020\u0007H\u0016¢\u0006\u0004\b;\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010n\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010v\u001a\u00020o8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010~\u001a\u00020w8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R%\u0010\u0082\u0001\u001a\u00020w8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u007f\u0010y\u001a\u0005\b\u0080\u0001\u0010{\"\u0005\b\u0081\u0001\u0010}R*\u0010\u008a\u0001\u001a\u00030\u0083\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R*\u0010\u0092\u0001\u001a\u00030\u008b\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R*\u0010\u009a\u0001\u001a\u00030\u0093\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010\u009b\u0001R\u001c\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001b\u0010 \u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001b\u0010\u009e\u0001R\u001b\u0010¡\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001c\u0010\u009e\u0001R\u001e\u0010¥\u0001\u001a\b0¢\u0001j\u0003`£\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b+\u0010¤\u0001R\u0018\u0010§\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0016\u0010¦\u0001R\u001a\u0010©\u0001\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¨\u0001\u0010bR\u001f\u0010\u00ad\u0001\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b%\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R\u0018\u0010®\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000b\u0010¦\u0001R\u0018\u0010°\u0001\u001a\u00030¯\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010C¨\u0006²\u0001"}, m87232d2 = {"Ll/zn3;", "Ll/s7m;", "Ll/nn3;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "K", "()V", "", ResourceDirection.f38808v, "(Lcom/p1/mobile/android/app/Act;)Z", "", "from", "W", "(Ljava/lang/String;)V", "type", "", Constants.INAPP_POSITION, "size", "newUI", BLiveStormDanmakuGiftResourceType.f44446s, "(Ljava/lang/String;IIZ)V", "U", "Q", "w", "p", "q", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "n", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "u", "(Ll/nn3;)V", "inflateView", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", BloodType.f38728O, j6f.GPS_DIRECTION_TRUE, j6f.LATITUDE_SOUTH, "Lcom/p1/mobile/putong/core/data/LoveBuzzData;", "data", j6f.GPS_MEASUREMENT_INTERRUPTED, "(Lcom/p1/mobile/putong/core/data/LoveBuzzData;)V", "hidden", "R", "(Z)V", "Ll/cwf0;", "pageHelper", "Y", "(Ll/cwf0;)V", "X", "destroy", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroid/widget/FrameLayout;", "b", "Landroid/widget/FrameLayout;", "J", "()Landroid/widget/FrameLayout;", "set_root", "(Landroid/widget/FrameLayout;)V", "_root", "Landroidx/constraintlayout/widget/ConstraintLayout;", "c", "Landroidx/constraintlayout/widget/ConstraintLayout;", BaseSei.f13930X, "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_buzz_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_buzz_root", "Landroid/view/ViewStub;", Constants.INAPP_DATA_TAG, "Landroid/view/ViewStub;", "B", "()Landroid/view/ViewStub;", "set_buzz_root_buzz_bg_anim", "(Landroid/view/ViewStub;)V", "_buzz_root_buzz_bg_anim", "Lv/VDraweeView;", "e", "Lv/VDraweeView;", "A", "()Lv/VDraweeView;", "set_buzz_root_buzz_bee_hive_bg", "(Lv/VDraweeView;)V", "_buzz_root_buzz_bee_hive_bg", "Lcom/tantan/library/svga/SVGAnimationView;", "f", "Lcom/tantan/library/svga/SVGAnimationView;", BaseSei.f13932Z, "()Lcom/tantan/library/svga/SVGAnimationView;", "set_buzz_root_bee_anim", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_buzz_root_bee_anim", "g", "Landroid/view/View;", "I", "()Landroid/view/View;", "set_buzz_root_svip_icon", "(Landroid/view/View;)V", "_buzz_root_svip_icon", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionPassiveView;", "h", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionPassiveView;", "H", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionPassiveView;", "set_buzz_root_region_passive_set", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionPassiveView;)V", "_buzz_root_region_passive_set", "Lv/VText;", RXScreenCaptureService.KEY_INDEX, "Lv/VText;", "E", "()Lv/VText;", "set_buzz_root_buzz_title", "(Lv/VText;)V", "_buzz_root_buzz_title", "j", b2s.C_ZONE, "set_buzz_root_buzz_desc", "_buzz_root_buzz_desc", "Lv/VLinear;", "k", "Lv/VLinear;", "F", "()Lv/VLinear;", "set_buzz_root_control_root", "(Lv/VLinear;)V", "_buzz_root_control_root", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MemojiBuzzComboEntranceView;", BLiveStormDanmakuGiftResourceType.f44444l, "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MemojiBuzzComboEntranceView;", "G", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MemojiBuzzComboEntranceView;", "set_buzz_root_memoji_entrance", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MemojiBuzzComboEntranceView;)V", "_buzz_root_memoji_entrance", "Lv/VText_NoTopPadding;", "m", "Lv/VText_NoTopPadding;", BaseSei.f13931Y, "()Lv/VText_NoTopPadding;", "set_buzz_root_back", "(Lv/VText_NoTopPadding;)V", "_buzz_root_back", "Ll/nn3;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzComboEntranceView;", "o", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzComboEntranceView;", "textBuzzView", "voiceBuzzView", "videoBuzzView", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "pvExtra", "Z", "lowDevice", Constants.KEY_T, "buzzBgAnim", "Lkotlin/Lazy;", "P", "()Z", "isMale", "isHidden", "", "adapterTime", "Companion", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class zn3 implements s7m<nn3> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public FrameLayout _root;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ConstraintLayout _buzz_root;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ViewStub _buzz_root_buzz_bg_anim;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VDraweeView _buzz_root_buzz_bee_hive_bg;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public SVGAnimationView _buzz_root_bee_anim;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public View _buzz_root_svip_icon;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public BuzzRegionPassiveView _buzz_root_region_passive_set;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _buzz_root_buzz_title;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _buzz_root_buzz_desc;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VLinear _buzz_root_control_root;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public MemojiBuzzComboEntranceView _buzz_root_memoji_entrance;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VText_NoTopPadding _buzz_root_back;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public nn3 presenter;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public BuzzComboEntranceView textBuzzView;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public BuzzComboEntranceView voiceBuzzView;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public BuzzComboEntranceView videoBuzzView;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public StringBuilder pvExtra;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public boolean lowDevice;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public SVGAnimationView buzzBgAnim;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final Lazy isMale;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean isHidden;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public long adapterTime;

    public zn3(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.pvExtra = new StringBuilder();
        this.isMale = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.on3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(zn3.m219410f());
            }
        });
        this.isHidden = true;
        boolean z = xdl0.m208412y0() < 1080;
        this.lowDevice = z;
        if (z) {
            return;
        }
        this.lowDevice = eew.m116012h(getContext());
    }

    /* JADX INFO: renamed from: K */
    private final void m219401K() {
        BuzzComboEntranceView buzzComboEntranceView = this.textBuzzView;
        if (buzzComboEntranceView != null) {
            xdl0.m208329E0(buzzComboEntranceView, new View.OnClickListener() { // from class: l.tn3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zn3.m219402L(this.f171205a, view);
                }
            });
        }
        BuzzComboEntranceView buzzComboEntranceView2 = this.voiceBuzzView;
        if (buzzComboEntranceView2 != null) {
            xdl0.m208329E0(buzzComboEntranceView2, new View.OnClickListener() { // from class: l.un3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zn3.m219403M(this.f177333a, view);
                }
            });
        }
        BuzzComboEntranceView buzzComboEntranceView3 = this.videoBuzzView;
        if (buzzComboEntranceView3 != null) {
            xdl0.m208329E0(buzzComboEntranceView3, new View.OnClickListener() { // from class: l.vn3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zn3.m219404N(this.f182203a, view);
                }
            });
        }
        xdl0.m208329E0(m219421G(), new View.OnClickListener() { // from class: l.wn3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zn3.m219411i(this.f187245a, view);
            }
        });
        xdl0.m208329E0(m219423I(), new View.OnClickListener() { // from class: l.xn3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zn3.m219407c(this.f193638a, view);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public static final void m219402L(zn3 zn3Var, View view) {
        if (zn3Var.m219442v(zn3Var.getAct())) {
            return;
        }
        zn3Var.m219427Q("textBuzz");
    }

    /* JADX INFO: renamed from: M */
    public static final void m219403M(zn3 zn3Var, View view) {
        if (zn3Var.m219442v(zn3Var.getAct())) {
            return;
        }
        zn3Var.m219427Q("voiceBuzz");
    }

    /* JADX INFO: renamed from: N */
    public static final void m219404N(zn3 zn3Var, View view) {
        if (zn3Var.m219442v(zn3Var.getAct())) {
            return;
        }
        zn3Var.m219427Q("videoBuzz");
    }

    /* JADX INFO: renamed from: c */
    public static void m219407c(zn3 zn3Var, View view) {
        if (xma.m210071e4()) {
            p9w.INSTANCE.m167951r();
            zn3Var.m219433W("p_buzz_sum,e_intl_buzz_premium_icon,click");
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m219408d(zn3 zn3Var, View view) {
        zn3Var.act.onBackPressed();
        zvf0.m220396r("e_intl_buzz_subpage_back", ((BuzzComboAct) zn3Var.act).pageId());
    }

    /* JADX INFO: renamed from: f */
    public static boolean m219410f() {
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        if (userM169520na != null) {
            return TEnum.equals(userM169520na.gender, "male");
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static void m219411i(zn3 zn3Var, View view) {
        if (zn3Var.m219442v(zn3Var.getAct())) {
            return;
        }
        zn3Var.m219427Q("memojiBuzz");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: j */
    public static Unit m219412j(zn3 zn3Var, String str) {
        zn3Var.m219421G().m47258t(false);
        switch (str.hashCode()) {
            case -1019560155:
                if (str.equals("voiceBuzz")) {
                    p9w.INSTANCE.m167921T(true);
                }
                break;
            case -1004163680:
                if (str.equals("textBuzz")) {
                    p9w.INSTANCE.m167919R(j8w.INSTANCE.m140473a().m140469w0());
                }
                break;
            case 1332422126:
                if (str.equals("videoBuzz")) {
                    p9w.INSTANCE.m167920S(true);
                }
                break;
            case 1740758636:
                if (str.equals("memojiBuzz")) {
                    p9w.INSTANCE.m167917P(true);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static Unit m219413k(zn3 zn3Var, String str) {
        zn3Var.m219443w(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static void m219414l(zn3 zn3Var) {
        long jM155944o = mqi0.m155944o();
        if (jM155944o - zn3Var.adapterTime < 500) {
            return;
        }
        zn3Var.adapterTime = jM155944o;
        int bottom = zn3Var.m219418C().getBottom();
        int top = zn3Var.m219420F().getTop();
        ViewGroup.LayoutParams layoutParams = zn3Var.m219446z().getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) layoutParams;
        if (bottom > top) {
            int i = (bottom - top) + t100.f167266o;
            if (((ViewGroup.MarginLayoutParams) c0220a).height == 0) {
                ((ViewGroup.MarginLayoutParams) c0220a).height = (int) (xdl0.m208412y0() / 1.3889f);
            }
            int i2 = ((ViewGroup.MarginLayoutParams) c0220a).height - i;
            ((ViewGroup.MarginLayoutParams) c0220a).height = i2;
            ((ViewGroup.MarginLayoutParams) c0220a).width = (int) (i2 * 1.5f);
            zn3Var.m219446z().setLayoutParams(c0220a);
        } else if (top - bottom > t100.f167227B) {
            float fM208412y0 = xdl0.m208412y0() / 1.3889f;
            if (((ViewGroup.MarginLayoutParams) c0220a).height < fM208412y0) {
                ((ViewGroup.MarginLayoutParams) c0220a).height = (int) fM208412y0;
                ((ViewGroup.MarginLayoutParams) c0220a).width = xdl0.m208412y0();
                zn3Var.m219446z().setLayoutParams(c0220a);
            }
        }
        zn3Var.m219425O();
    }

    /* JADX INFO: renamed from: m */
    public static Unit m219415m(zn3 zn3Var) {
        zn3Var.m219433W("p_buzz_premium_sale,e_buzz_premium_buy,click");
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final VDraweeView m219416A() {
        VDraweeView vDraweeView = this._buzz_root_buzz_bee_hive_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_buzz_root_buzz_bee_hive_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final ViewStub m219417B() {
        ViewStub viewStub = this._buzz_root_buzz_bg_anim;
        if (viewStub != null) {
            return viewStub;
        }
        Intrinsics.m87502r("_buzz_root_buzz_bg_anim");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final VText m219418C() {
        VText vText = this._buzz_root_buzz_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_buzz_root_buzz_desc");
        return null;
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final VText m219419E() {
        VText vText = this._buzz_root_buzz_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_buzz_root_buzz_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VLinear m219420F() {
        VLinear vLinear = this._buzz_root_control_root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_buzz_root_control_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final MemojiBuzzComboEntranceView m219421G() {
        MemojiBuzzComboEntranceView memojiBuzzComboEntranceView = this._buzz_root_memoji_entrance;
        if (memojiBuzzComboEntranceView != null) {
            return memojiBuzzComboEntranceView;
        }
        Intrinsics.m87502r("_buzz_root_memoji_entrance");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final BuzzRegionPassiveView m219422H() {
        BuzzRegionPassiveView buzzRegionPassiveView = this._buzz_root_region_passive_set;
        if (buzzRegionPassiveView != null) {
            return buzzRegionPassiveView;
        }
        Intrinsics.m87502r("_buzz_root_region_passive_set");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final View m219423I() {
        View view = this._buzz_root_svip_icon;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_buzz_root_svip_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final FrameLayout m219424J() {
        FrameLayout frameLayout = this._root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    /* JADX INFO: renamed from: O */
    public final void m219425O() {
        if (this.act instanceof BuzzComboAct) {
            m219445y().setVisibility(0);
            m219445y().setOnClickListener(new View.OnClickListener() { // from class: l.sn3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zn3.m219408d(this.f165408a, view);
                }
            });
            ViewGroup.LayoutParams layoutParams = m219445y().getLayoutParams();
            layoutParams.getClass();
            ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) layoutParams;
            int iM131709n1 = hmb.m131709n1(getAct());
            int i = t100.f167259h;
            ((ViewGroup.MarginLayoutParams) c0220a).topMargin = iM131709n1 + i;
            m219445y().setLayoutParams(c0220a);
            ViewGroup.LayoutParams layoutParams2 = m219422H().getLayoutParams();
            layoutParams2.getClass();
            ConstraintLayout.C0220a c0220a2 = (ConstraintLayout.C0220a) layoutParams2;
            c0220a2.f1266q = -1;
            c0220a2.setMarginEnd(t100.f167262k);
            ((ViewGroup.MarginLayoutParams) c0220a2).topMargin = hmb.m131709n1(getAct()) + i;
            m219422H().setLayoutParams(c0220a2);
            ViewGroup.LayoutParams layoutParams3 = m219423I().getLayoutParams();
            layoutParams3.getClass();
            ConstraintLayout.C0220a c0220a3 = (ConstraintLayout.C0220a) layoutParams3;
            c0220a3.f1266q = -1;
            c0220a3.f1251h = -1;
            c0220a3.f1268s = 0;
            c0220a3.f1255j = m219419E().getId();
            c0220a3.setMarginStart(0);
            ((ViewGroup.MarginLayoutParams) c0220a3).bottomMargin = i;
            c0220a3.setMarginEnd(i);
            m219423I().setLayoutParams(c0220a3);
            Object parent = m219444x().getParent();
            parent.getClass();
            int height = ((((View) parent).getHeight() - m219418C().getBottom()) - Math.max(m219421G().getHeight(), m219420F().getHeight())) + xdl0.m208336I(getAct());
            if (height > 0) {
                ViewGroup.LayoutParams layoutParams4 = m219421G().getLayoutParams();
                layoutParams4.getClass();
                ConstraintLayout.C0220a c0220a4 = (ConstraintLayout.C0220a) layoutParams4;
                int i2 = height / 2;
                ((ViewGroup.MarginLayoutParams) c0220a4).bottomMargin = i2;
                m219421G().setLayoutParams(c0220a4);
                ViewGroup.LayoutParams layoutParams5 = m219420F().getLayoutParams();
                layoutParams5.getClass();
                ConstraintLayout.C0220a c0220a5 = (ConstraintLayout.C0220a) layoutParams5;
                ((ViewGroup.MarginLayoutParams) c0220a5).bottomMargin = i2;
                m219420F().setLayoutParams(c0220a5);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final boolean m219426P() {
        return ((Boolean) this.isMale.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: Q */
    public final void m219427Q(final String type) {
        j8w.Companion companion = j8w.INSTANCE;
        j8w j8wVarM140473a = companion.m140473a();
        Act act = this.act;
        p9w p9wVar = p9w.INSTANCE;
        if (j8w.m140400m0(j8wVarM140473a, type, act, true, p9wVar.m167960w(type), null, new Function0() { // from class: l.yn3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zn3.m219413k(this.f199139a, type);
            }
        }, 16, null)) {
            m219443w(type);
        } else if (Intrinsics.m87488d(type, "textBuzz")) {
            p9wVar.m167919R(companion.m140473a().m140469w0());
        } else {
            p9wVar.m167918Q(type, false);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m219428R(boolean hidden) {
        qa2 qa2Var = qa2.INSTANCE;
        qa2Var.m173681a("BuzzComboViewModel", "onHiddenChanged hidden " + hidden);
        this.isHidden = hidden;
        m219421G().m47254o(hidden);
        if (this._buzz_root == null) {
            qa2Var.m173681a("BuzzComboViewModel", "onHiddenChanged hidden " + hidden + ",but view not init");
            return;
        }
        if (hidden) {
            return;
        }
        j8w.INSTANCE.m140473a().m140470x0(this.act);
        if (m219426P()) {
            f6w.INSTANCE.m119695d0(this.act, new Function0() { // from class: l.rn3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return zn3.m219415m(this.f160235a);
                }
            });
        }
        this.act.setStatusBarColor(hvc0.m133154a(x0c0.f188960n));
    }

    /* JADX INFO: renamed from: S */
    public final void m219429S() {
        LoveBuzzData loveBuzzDataM140468v0 = j8w.INSTANCE.m140473a().m140468v0();
        if (loveBuzzDataM140468v0 != null) {
            List<String> list = loveBuzzDataM140468v0.enabledBuzz;
            if (list.isEmpty()) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = list.get(i);
                if (str != null) {
                    sb.append((String) StringsKt.split$default(str, new String[]{"Buzz"}, false, 0, 6, null).get(0));
                    if (i != list.size() - 1) {
                        sb.append(Constants.SEPARATOR_COMMA);
                    }
                }
            }
            qa2.INSTANCE.m173681a("BuzzComboViewModel", "renderEntrance, netData is " + ((Object) sb) + "  pvExtra is " + ((Object) this.pvExtra));
            if (Intrinsics.m87488d(this.pvExtra.toString(), sb.toString())) {
                return;
            }
            m219431U();
            q0g0.m172329j(this.pvExtra);
            m219420F().removeAllViews();
            this.pvExtra = sb;
            boolean zContains = list.contains("memojiBuzz");
            m219438q();
            if (!zContains) {
                m219421G().m47258t(true);
            }
            xdl0.m208344M(m219421G(), zContains);
            int iM208412y0 = xdl0.m208412y0();
            qm3.INSTANCE.m175550u();
            if (zContains) {
                xdl0.m208327D0(iM208412y0 / 2, m219420F());
                m219421G().m47253n(this.act);
            } else {
                if (list.size() == 1) {
                    iM208412y0 -= t100.f167226A * 2;
                }
                xdl0.m208327D0(iM208412y0, m219420F());
                m219421G().m47256q();
            }
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!Intrinsics.m87488d(list.get(i2), "memojiBuzz")) {
                    String str2 = list.get(i2);
                    str2.getClass();
                    String str3 = str2;
                    int size3 = list.size();
                    if (zContains) {
                        size3--;
                    }
                    m219440s(str3, i2, size3, zContains);
                }
            }
        }
        m219401K();
    }

    /* JADX INFO: renamed from: T */
    public final void m219430T() {
        boolean zM210071e4 = xma.m210071e4();
        if (zM210071e4) {
            m219423I().setBackgroundResource(u9w.INSTANCE.m192680m());
        } else {
            m219423I().setBackgroundResource(y2c0.f195576p);
        }
        m219423I().setEnabled(zM210071e4);
        if ((t49.m187150d() || !zM210071e4) && !IntlCountryCodeController.m28115k()) {
            xdl0.m208344M(m219423I(), true);
        } else {
            xdl0.m208344M(m219423I(), false);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m219431U() {
        User userM169527p9;
        LoveBuzzData loveBuzzDataM140468v0 = j8w.INSTANCE.m140473a().m140468v0();
        if (loveBuzzDataM140468v0 != null) {
            boolean z = loveBuzzDataM140468v0.enabledBuzz.contains("textBuzz") && loveBuzzDataM140468v0.enabledBuzz.size() == 1;
            if (!z && !t49.m187150d() && (userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9()) != null) {
                z = !userM169527p9.isSVIP() || IntlCountryCodeController.m28115k();
            }
            xdl0.m208344M(m219422H(), !z);
            if (!z) {
                p9w.INSTANCE.m167948p0();
            }
            int iM208331F0 = xdl0.m208331F0();
            if (!xdl0.m208349O0(m219422H())) {
                xdl0.m208360X(m219423I(), iM208331F0 + t100.f167254c);
            } else {
                xdl0.m208360X(m219422H(), C15167a.m87596b(t100.f167260i + iM208331F0, t100.m186890d(53.0f)));
                xdl0.m208360X(m219423I(), iM208331F0 + t100.m186890d(46.0f));
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m219432V(@Nullable LoveBuzzData data) {
        if (m6w.INSTANCE.m153296a(this.act) && data != null) {
            m219437p();
            BuzzComboEntranceView buzzComboEntranceView = this.textBuzzView;
            if (buzzComboEntranceView != null) {
                BuzzComboEntranceView.m47133l0(buzzComboEntranceView, data.remainingTextBuzz, data.remainingBonus.textBuzz, 0, 4, null);
            }
            BuzzComboEntranceView buzzComboEntranceView2 = this.voiceBuzzView;
            if (buzzComboEntranceView2 != null) {
                BuzzComboEntranceView.m47133l0(buzzComboEntranceView2, data.remainingVoiceBuzz, data.remainingBonus.voiceBuzz, 0, 4, null);
            }
            BuzzComboEntranceView buzzComboEntranceView3 = this.videoBuzzView;
            if (buzzComboEntranceView3 != null) {
                buzzComboEntranceView3.mo47136k0(data.remainingVideoBuzz, data.remainingBonus.videoBuzz, R$string.f20232j0);
            }
            MemojiBuzzComboEntranceView.m47251s(m219421G(), data.remainingMemojiBuzz, data.remainingBonus.memojiBuzz, 0, 4, null);
            m219422H().m47186g();
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m219433W(String from) {
        if (m6w.INSTANCE.m153296a(this.act)) {
            CoreModule.m29935P().m94651a().mo33572qm(this.act, from, Privilege.loveBuzz, null);
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m219434X(@Nullable cwf0 pageHelper) {
        if (pageHelper != null) {
            pageHelper.m109040p(vwb.m200311Y("buzz_entrance", this.pvExtra.toString()));
            pageHelper.m109035k();
            pageHelper.m109040p(new j760[0]);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m219435Y(@Nullable cwf0 pageHelper) {
        if (pageHelper != null) {
            pageHelper.m109040p(vwb.m200311Y("buzz_entrance", this.pvExtra.toString()));
            pageHelper.m109036l();
            pageHelper.m109040p(new j760[0]);
        }
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m219436n(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final View m219436n(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM97842b = ao3.m97842b(this, inflater, parent);
        viewM97842b.getClass();
        return viewM97842b;
    }

    /* JADX INFO: renamed from: p */
    public final void m219437p() {
        m219420F().post(new Runnable() { // from class: l.qn3
            @Override // java.lang.Runnable
            public final void run() {
                zn3.m219414l(this.f155377a);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m219438q() {
        nn3 nn3Var = this.presenter;
        boolean z = nn3Var != null && nn3Var.m160187s0();
        int iM208331F0 = xdl0.m208331F0();
        if (z) {
            xdl0.m208360X(m219446z(), t100.f167244S + iM208331F0);
            xdl0.m208360X(m219419E(), t100.f167231F);
            if (xdl0.m208349O0(m219416A())) {
                xdl0.m208360X(m219416A(), t100.f167273v + iM208331F0);
            }
            u9w u9wVar = u9w.INSTANCE;
            u9w.m192671u(u9wVar, m219420F(), 0, 0, t100.f167226A, t100.f167232G, 4, null);
            VText vTextM219418C = m219418C();
            int i = t100.f167259h;
            int i2 = t100.f167264m;
            u9w.m192671u(u9wVar, vTextM219418C, i2, i, i2, 0, 16, null);
        } else {
            xdl0.m208360X(m219446z(), t100.f167231F + iM208331F0);
            xdl0.m208360X(m219419E(), t100.f167261j);
            if (xdl0.m208349O0(m219416A())) {
                xdl0.m208360X(m219416A(), iM208331F0);
            }
            u9w u9wVar2 = u9w.INSTANCE;
            u9w.m192671u(u9wVar2, m219420F(), 0, 0, 0, t100.f167266o, 4, null);
            VText vTextM219418C2 = m219418C();
            int i3 = t100.f167256e;
            int i4 = t100.f167257f;
            u9w.m192671u(u9wVar2, vTextM219418C2, i4, i3, i4, 0, 16, null);
        }
        if (z && this.buzzBgAnim == null) {
            this.buzzBgAnim = (SVGAnimationView) m219417B().inflate();
        }
        SVGAnimationView sVGAnimationView = this.buzzBgAnim;
        if (!z) {
            if (sVGAnimationView != null) {
                SVGAnimationView.stopAnimation$default(sVGAnimationView, false, 1, null);
            }
        } else if (sVGAnimationView != null) {
            xdl0.m208360X(sVGAnimationView, iM208331F0 + t100.m186890d(67.5f));
            if (sVGAnimationView.isAnimating()) {
                return;
            }
            SVGALoader.with(getContext()).from(kp3.INSTANCE.m146822l()).autoPlay(true).into(sVGAnimationView);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m219439r() {
        if (this.lowDevice) {
            m219446z().setBackgroundResource(y2c0.f195524E);
        } else if (!m219446z().isAnimating()) {
            SVGALoader.with(getContext()).from(kp3.INSTANCE.m146813c()).autoPlay(true).into(m219446z());
        }
        m219430T();
        m219429S();
        p9w.INSTANCE.m167900A();
        m219432V(j8w.INSTANCE.m140473a().m140468v0());
        m219425O();
    }

    /* JADX INFO: renamed from: s */
    public final void m219440s(String type, int pos, int size, boolean newUI) {
        LinearLayout.LayoutParams layoutParams;
        BuzzComboEntranceView buzzComboEntranceViewM47137a = BuzzComboEntranceView.INSTANCE.m47137a(type, getContext(), size, newUI);
        if (newUI) {
            layoutParams = new LinearLayout.LayoutParams(-1, size < 3 ? t100.m186890d(110.0f) : t100.f167235J);
        } else {
            layoutParams = new LinearLayout.LayoutParams(-1, size == 1 ? t100.f167239N : t100.m186890d(84.0f));
        }
        layoutParams.topMargin = pos == 0 ? 0 : t100.f167256e;
        qa2.INSTANCE.m173681a("BuzzComboViewModel", "addSingle, type is " + type + "  pos is " + pos + " pvExtra is " + ((Object) this.pvExtra));
        int iHashCode = type.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != -1004163680) {
                if (iHashCode != 1332422126 || !type.equals("videoBuzz")) {
                    return;
                } else {
                    this.videoBuzzView = buzzComboEntranceViewM47137a;
                }
            } else if (!type.equals("textBuzz")) {
                return;
            } else {
                this.textBuzzView = buzzComboEntranceViewM47137a;
            }
        } else if (!type.equals("voiceBuzz")) {
            return;
        } else {
            this.voiceBuzzView = buzzComboEntranceViewM47137a;
        }
        if (NullChecker.m81303a(buzzComboEntranceViewM47137a)) {
            m219420F().addView(buzzComboEntranceViewM47137a, layoutParams);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable nn3 presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m219442v(Act act) {
        if (!CoreModule.f17545c.f19639e0.m169527p9().isChatJailed()) {
            return false;
        }
        CoreModule.m29935P().m94658i().mo158341Z2(act, false);
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final void m219443w(final String type) {
        j8w.m140404p0(j8w.INSTANCE.m140473a(), type, this.act, new Function0() { // from class: l.pn3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zn3.m219412j(this.f150322a, type);
            }
        }, null, false, 24, null);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final ConstraintLayout m219444x() {
        ConstraintLayout constraintLayout = this._buzz_root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_buzz_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VText_NoTopPadding m219445y() {
        VText_NoTopPadding vText_NoTopPadding = this._buzz_root_back;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m87502r("_buzz_root_back");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final SVGAnimationView m219446z() {
        SVGAnimationView sVGAnimationView = this._buzz_root_bee_anim;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_buzz_root_bee_anim");
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
