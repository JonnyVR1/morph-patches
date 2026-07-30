package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.buzz.R$string;
import com.p051p1.mobile.putong.core.data.LoveBuzzData;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.p058ui.BuzzComboAct;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzComboEntranceView;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzRegionPassiveView;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.MemojiBuzzComboEntranceView;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlin.ranges.C15274a;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 ±\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\tJ\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0010J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\tJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\tJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b'\u0010#J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0007¢\u0006\u0004\b+\u0010\tJ\r\u0010,\u001a\u00020\u0007¢\u0006\u0004\b,\u0010\tJ\r\u0010-\u001a\u00020\u0007¢\u0006\u0004\b-\u0010\tJ\r\u0010.\u001a\u00020\u0007¢\u0006\u0004\b.\u0010\tJ\u0017\u00101\u001a\u00020\u00072\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\u00072\u0006\u00103\u001a\u00020\n¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u00072\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00072\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u00020\u0007H\u0016¢\u0006\u0004\b;\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010n\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010v\u001a\u00020o8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010~\u001a\u00020w8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R%\u0010\u0082\u0001\u001a\u00020w8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u007f\u0010y\u001a\u0005\b\u0080\u0001\u0010{\"\u0005\b\u0081\u0001\u0010}R*\u0010\u008a\u0001\u001a\u00030\u0083\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R*\u0010\u0092\u0001\u001a\u00030\u008b\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R*\u0010\u009a\u0001\u001a\u00030\u0093\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010\u009b\u0001R\u001c\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001b\u0010 \u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001b\u0010\u009e\u0001R\u001b\u0010¡\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001c\u0010\u009e\u0001R\u001e\u0010¥\u0001\u001a\b0¢\u0001j\u0003`£\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b+\u0010¤\u0001R\u0018\u0010§\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0016\u0010¦\u0001R\u001a\u0010©\u0001\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¨\u0001\u0010bR\u001f\u0010\u00ad\u0001\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b%\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R\u0018\u0010®\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000b\u0010¦\u0001R\u0018\u0010°\u0001\u001a\u00030¯\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010C¨\u0006²\u0001"}, m88121d2 = {"Ll/zo3;", "Ll/iam;", "Ll/no3;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "K", "()V", "", ResourceDirection.f39656v, "(Lcom/p1/mobile/android/app/Act;)Z", "", "from", "W", "(Ljava/lang/String;)V", "type", "", Constants.INAPP_POSITION, "size", "newUI", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/lang/String;IIZ)V", "U", "Q", "w", "p", "q", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "n", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "u", "(Ll/no3;)V", "inflateView", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", BloodType.f39576O, p7f.GPS_DIRECTION_TRUE, p7f.LATITUDE_SOUTH, "Lcom/p1/mobile/putong/core/data/LoveBuzzData;", "data", p7f.GPS_MEASUREMENT_INTERRUPTED, "(Lcom/p1/mobile/putong/core/data/LoveBuzzData;)V", "hidden", "R", "(Z)V", "Ll/l4g0;", "pageHelper", "Y", "(Ll/l4g0;)V", "X", "destroy", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroid/widget/FrameLayout;", "b", "Landroid/widget/FrameLayout;", "J", "()Landroid/widget/FrameLayout;", "set_root", "(Landroid/widget/FrameLayout;)V", "_root", "Landroidx/constraintlayout/widget/ConstraintLayout;", "c", "Landroidx/constraintlayout/widget/ConstraintLayout;", BaseSei.f14624X, "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_buzz_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_buzz_root", "Landroid/view/ViewStub;", Constants.INAPP_DATA_TAG, "Landroid/view/ViewStub;", "B", "()Landroid/view/ViewStub;", "set_buzz_root_buzz_bg_anim", "(Landroid/view/ViewStub;)V", "_buzz_root_buzz_bg_anim", "Lv/VDraweeView;", "e", "Lv/VDraweeView;", "A", "()Lv/VDraweeView;", "set_buzz_root_buzz_bee_hive_bg", "(Lv/VDraweeView;)V", "_buzz_root_buzz_bee_hive_bg", "Lcom/tantan/library/svga/SVGAnimationView;", "f", "Lcom/tantan/library/svga/SVGAnimationView;", BaseSei.f14626Z, "()Lcom/tantan/library/svga/SVGAnimationView;", "set_buzz_root_bee_anim", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_buzz_root_bee_anim", "g", "Landroid/view/View;", "I", "()Landroid/view/View;", "set_buzz_root_svip_icon", "(Landroid/view/View;)V", "_buzz_root_svip_icon", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionPassiveView;", "h", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionPassiveView;", "H", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionPassiveView;", "set_buzz_root_region_passive_set", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionPassiveView;)V", "_buzz_root_region_passive_set", "Lv/VText;", RXScreenCaptureService.KEY_INDEX, "Lv/VText;", "E", "()Lv/VText;", "set_buzz_root_buzz_title", "(Lv/VText;)V", "_buzz_root_buzz_title", "j", c4s.C_ZONE, "set_buzz_root_buzz_desc", "_buzz_root_buzz_desc", "Lv/VLinear;", "k", "Lv/VLinear;", "F", "()Lv/VLinear;", "set_buzz_root_control_root", "(Lv/VLinear;)V", "_buzz_root_control_root", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MemojiBuzzComboEntranceView;", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MemojiBuzzComboEntranceView;", "G", "()Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MemojiBuzzComboEntranceView;", "set_buzz_root_memoji_entrance", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/MemojiBuzzComboEntranceView;)V", "_buzz_root_memoji_entrance", "Lv/VText_NoTopPadding;", "m", "Lv/VText_NoTopPadding;", BaseSei.f14625Y, "()Lv/VText_NoTopPadding;", "set_buzz_root_back", "(Lv/VText_NoTopPadding;)V", "_buzz_root_back", "Ll/no3;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzComboEntranceView;", "o", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzComboEntranceView;", "textBuzzView", "voiceBuzzView", "videoBuzzView", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "pvExtra", "Z", "lowDevice", Constants.KEY_T, "buzzBgAnim", "Lkotlin/Lazy;", "P", "()Z", "isMale", "isHidden", "", "adapterTime", "Companion", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class zo3 implements iam<no3> {

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
    public no3 presenter;

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

    public zo3(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.pvExtra = new StringBuilder();
        this.isMale = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.oo3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(zo3.m220696f());
            }
        });
        this.isHidden = true;
        boolean z = bnl0.m105592y0() < 1080;
        this.lowDevice = z;
        if (z) {
            return;
        }
        this.lowDevice = cgw.m109764h(getContext());
    }

    /* JADX INFO: renamed from: K */
    private final void m220687K() {
        BuzzComboEntranceView buzzComboEntranceView = this.textBuzzView;
        if (buzzComboEntranceView != null) {
            bnl0.m105509E0(buzzComboEntranceView, new View.OnClickListener() { // from class: l.to3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zo3.m220688L(this.f175355a, view);
                }
            });
        }
        BuzzComboEntranceView buzzComboEntranceView2 = this.voiceBuzzView;
        if (buzzComboEntranceView2 != null) {
            bnl0.m105509E0(buzzComboEntranceView2, new View.OnClickListener() { // from class: l.uo3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zo3.m220689M(this.f180013a, view);
                }
            });
        }
        BuzzComboEntranceView buzzComboEntranceView3 = this.videoBuzzView;
        if (buzzComboEntranceView3 != null) {
            bnl0.m105509E0(buzzComboEntranceView3, new View.OnClickListener() { // from class: l.vo3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zo3.m220690N(this.f184991a, view);
                }
            });
        }
        bnl0.m105509E0(m220707G(), new View.OnClickListener() { // from class: l.wo3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zo3.m220697i(this.f190008a, view);
            }
        });
        bnl0.m105509E0(m220709I(), new View.OnClickListener() { // from class: l.xo3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zo3.m220693c(this.f195553a, view);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public static final void m220688L(zo3 zo3Var, View view) {
        if (zo3Var.m220728v(zo3Var.getAct())) {
            return;
        }
        zo3Var.m220713Q("textBuzz");
    }

    /* JADX INFO: renamed from: M */
    public static final void m220689M(zo3 zo3Var, View view) {
        if (zo3Var.m220728v(zo3Var.getAct())) {
            return;
        }
        zo3Var.m220713Q("voiceBuzz");
    }

    /* JADX INFO: renamed from: N */
    public static final void m220690N(zo3 zo3Var, View view) {
        if (zo3Var.m220728v(zo3Var.getAct())) {
            return;
        }
        zo3Var.m220713Q("videoBuzz");
    }

    /* JADX INFO: renamed from: c */
    public static void m220693c(zo3 zo3Var, View view) {
        if (joa.m146386f4()) {
            nbw.INSTANCE.m162255r();
            zo3Var.m220719W("p_buzz_sum,e_intl_buzz_premium_icon,click");
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m220694d(zo3 zo3Var, View view) {
        zo3Var.act.onBackPressed();
        i4g0.m138520r("e_intl_buzz_subpage_back", ((BuzzComboAct) zo3Var.act).pageId());
    }

    /* JADX INFO: renamed from: f */
    public static boolean m220696f() {
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        if (userM116593na != null) {
            return TEnum.equals(userM116593na.gender, "male");
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static void m220697i(zo3 zo3Var, View view) {
        if (zo3Var.m220728v(zo3Var.getAct())) {
            return;
        }
        zo3Var.m220713Q("memojiBuzz");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: j */
    public static Unit m220698j(zo3 zo3Var, String str) {
        zo3Var.m220707G().m48441t(false);
        switch (str.hashCode()) {
            case -1019560155:
                if (str.equals("voiceBuzz")) {
                    nbw.INSTANCE.m162225T(true);
                }
                break;
            case -1004163680:
                if (str.equals("textBuzz")) {
                    nbw.INSTANCE.m162223R(haw.INSTANCE.m134320a().m134316w0());
                }
                break;
            case 1332422126:
                if (str.equals("videoBuzz")) {
                    nbw.INSTANCE.m162224S(true);
                }
                break;
            case 1740758636:
                if (str.equals("memojiBuzz")) {
                    nbw.INSTANCE.m162221P(true);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static Unit m220699k(zo3 zo3Var, String str) {
        zo3Var.m220729w(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static void m220700l(zo3 zo3Var) {
        long jM174454o = pzi0.m174454o();
        if (jM174454o - zo3Var.adapterTime < 500) {
            return;
        }
        zo3Var.adapterTime = jM174454o;
        int bottom = zo3Var.m220704C().getBottom();
        int top = zo3Var.m220706F().getTop();
        ViewGroup.LayoutParams layoutParams = zo3Var.m220732z().getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) layoutParams;
        if (bottom > top) {
            int i = (bottom - top) + qa00.f156328o;
            if (((ViewGroup.MarginLayoutParams) c0221a).height == 0) {
                ((ViewGroup.MarginLayoutParams) c0221a).height = (int) (bnl0.m105592y0() / 1.3889f);
            }
            int i2 = ((ViewGroup.MarginLayoutParams) c0221a).height - i;
            ((ViewGroup.MarginLayoutParams) c0221a).height = i2;
            ((ViewGroup.MarginLayoutParams) c0221a).width = (int) (i2 * 1.5f);
            zo3Var.m220732z().setLayoutParams(c0221a);
        } else if (top - bottom > qa00.f156289B) {
            float fM105592y0 = bnl0.m105592y0() / 1.3889f;
            if (((ViewGroup.MarginLayoutParams) c0221a).height < fM105592y0) {
                ((ViewGroup.MarginLayoutParams) c0221a).height = (int) fM105592y0;
                ((ViewGroup.MarginLayoutParams) c0221a).width = bnl0.m105592y0();
                zo3Var.m220732z().setLayoutParams(c0221a);
            }
        }
        zo3Var.m220711O();
    }

    /* JADX INFO: renamed from: m */
    public static Unit m220701m(zo3 zo3Var) {
        zo3Var.m220719W("p_buzz_premium_sale,e_buzz_premium_buy,click");
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final VDraweeView m220702A() {
        VDraweeView vDraweeView = this._buzz_root_buzz_bee_hive_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_buzz_root_buzz_bee_hive_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final ViewStub m220703B() {
        ViewStub viewStub = this._buzz_root_buzz_bg_anim;
        if (viewStub != null) {
            return viewStub;
        }
        Intrinsics.m88391r("_buzz_root_buzz_bg_anim");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final VText m220704C() {
        VText vText = this._buzz_root_buzz_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_buzz_root_buzz_desc");
        return null;
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final VText m220705E() {
        VText vText = this._buzz_root_buzz_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_buzz_root_buzz_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final VLinear m220706F() {
        VLinear vLinear = this._buzz_root_control_root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_buzz_root_control_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final MemojiBuzzComboEntranceView m220707G() {
        MemojiBuzzComboEntranceView memojiBuzzComboEntranceView = this._buzz_root_memoji_entrance;
        if (memojiBuzzComboEntranceView != null) {
            return memojiBuzzComboEntranceView;
        }
        Intrinsics.m88391r("_buzz_root_memoji_entrance");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final BuzzRegionPassiveView m220708H() {
        BuzzRegionPassiveView buzzRegionPassiveView = this._buzz_root_region_passive_set;
        if (buzzRegionPassiveView != null) {
            return buzzRegionPassiveView;
        }
        Intrinsics.m88391r("_buzz_root_region_passive_set");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final View m220709I() {
        View view = this._buzz_root_svip_icon;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_buzz_root_svip_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final FrameLayout m220710J() {
        FrameLayout frameLayout = this._root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    /* JADX INFO: renamed from: O */
    public final void m220711O() {
        if (this.act instanceof BuzzComboAct) {
            m220731y().setVisibility(0);
            m220731y().setOnClickListener(new View.OnClickListener() { // from class: l.so3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zo3.m220694d(this.f169829a, view);
                }
            });
            ViewGroup.LayoutParams layoutParams = m220731y().getLayoutParams();
            layoutParams.getClass();
            ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) layoutParams;
            int iM201954n1 = vnb.m201954n1(getAct());
            int i = qa00.f156321h;
            ((ViewGroup.MarginLayoutParams) c0221a).topMargin = iM201954n1 + i;
            m220731y().setLayoutParams(c0221a);
            ViewGroup.LayoutParams layoutParams2 = m220708H().getLayoutParams();
            layoutParams2.getClass();
            ConstraintLayout.C0221a c0221a2 = (ConstraintLayout.C0221a) layoutParams2;
            c0221a2.f1266q = -1;
            c0221a2.setMarginEnd(qa00.f156324k);
            ((ViewGroup.MarginLayoutParams) c0221a2).topMargin = vnb.m201954n1(getAct()) + i;
            m220708H().setLayoutParams(c0221a2);
            ViewGroup.LayoutParams layoutParams3 = m220709I().getLayoutParams();
            layoutParams3.getClass();
            ConstraintLayout.C0221a c0221a3 = (ConstraintLayout.C0221a) layoutParams3;
            c0221a3.f1266q = -1;
            c0221a3.f1251h = -1;
            c0221a3.f1268s = 0;
            c0221a3.f1255j = m220705E().getId();
            c0221a3.setMarginStart(0);
            ((ViewGroup.MarginLayoutParams) c0221a3).bottomMargin = i;
            c0221a3.setMarginEnd(i);
            m220709I().setLayoutParams(c0221a3);
            Object parent = m220730x().getParent();
            parent.getClass();
            int height = ((((View) parent).getHeight() - m220704C().getBottom()) - Math.max(m220707G().getHeight(), m220706F().getHeight())) + bnl0.m105516I(getAct());
            if (height > 0) {
                ViewGroup.LayoutParams layoutParams4 = m220707G().getLayoutParams();
                layoutParams4.getClass();
                ConstraintLayout.C0221a c0221a4 = (ConstraintLayout.C0221a) layoutParams4;
                int i2 = height / 2;
                ((ViewGroup.MarginLayoutParams) c0221a4).bottomMargin = i2;
                m220707G().setLayoutParams(c0221a4);
                ViewGroup.LayoutParams layoutParams5 = m220706F().getLayoutParams();
                layoutParams5.getClass();
                ConstraintLayout.C0221a c0221a5 = (ConstraintLayout.C0221a) layoutParams5;
                ((ViewGroup.MarginLayoutParams) c0221a5).bottomMargin = i2;
                m220706F().setLayoutParams(c0221a5);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final boolean m220712P() {
        return ((Boolean) this.isMale.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: Q */
    public final void m220713Q(final String type) {
        haw.Companion companion = haw.INSTANCE;
        haw hawVarM134320a = companion.m134320a();
        Act act = this.act;
        nbw nbwVar = nbw.INSTANCE;
        if (haw.m134247m0(hawVarM134320a, type, act, true, nbwVar.m162264w(type), null, new Function0() { // from class: l.yo3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zo3.m220699k(this.f200947a, type);
            }
        }, 16, null)) {
            m220729w(type);
        } else if (Intrinsics.m88377d(type, "textBuzz")) {
            nbwVar.m162223R(companion.m134320a().m134316w0());
        } else {
            nbwVar.m162222Q(type, false);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m220714R(boolean hidden) {
        xa2 xa2Var = xa2.INSTANCE;
        xa2Var.m209830a("BuzzComboViewModel", "onHiddenChanged hidden " + hidden);
        this.isHidden = hidden;
        m220707G().m48437o(hidden);
        if (this._buzz_root == null) {
            xa2Var.m209830a("BuzzComboViewModel", "onHiddenChanged hidden " + hidden + ",but view not init");
            return;
        }
        if (hidden) {
            return;
        }
        haw.INSTANCE.m134320a().m134317x0(this.act);
        if (m220712P()) {
            d8w.INSTANCE.m114980d0(this.act, new Function0() { // from class: l.ro3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return zo3.m220701m(this.f164150a);
                }
            });
        }
        this.act.setStatusBarColor(k3d0.m148005a(d9c0.f85757n));
    }

    /* JADX INFO: renamed from: S */
    public final void m220715S() {
        LoveBuzzData loveBuzzDataM134315v0 = haw.INSTANCE.m134320a().m134315v0();
        if (loveBuzzDataM134315v0 != null) {
            List<String> list = loveBuzzDataM134315v0.enabledBuzz;
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
            xa2.INSTANCE.m209830a("BuzzComboViewModel", "renderEntrance, netData is " + ((Object) sb) + "  pvExtra is " + ((Object) this.pvExtra));
            if (Intrinsics.m88377d(this.pvExtra.toString(), sb.toString())) {
                return;
            }
            m220717U();
            x8g0.m209692j(this.pvExtra);
            m220706F().removeAllViews();
            this.pvExtra = sb;
            boolean zContains = list.contains("memojiBuzz");
            m220724q();
            if (!zContains) {
                m220707G().m48441t(true);
            }
            bnl0.m105524M(m220707G(), zContains);
            int iM105592y0 = bnl0.m105592y0();
            qn3.INSTANCE.m177201u();
            if (zContains) {
                bnl0.m105507D0(iM105592y0 / 2, m220706F());
                m220707G().m48436n(this.act);
            } else {
                if (list.size() == 1) {
                    iM105592y0 -= qa00.f156288A * 2;
                }
                bnl0.m105507D0(iM105592y0, m220706F());
                m220707G().m48439q();
            }
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!Intrinsics.m88377d(list.get(i2), "memojiBuzz")) {
                    String str2 = list.get(i2);
                    str2.getClass();
                    String str3 = str2;
                    int size3 = list.size();
                    if (zContains) {
                        size3--;
                    }
                    m220726s(str3, i2, size3, zContains);
                }
            }
        }
        m220687K();
    }

    /* JADX INFO: renamed from: T */
    public final void m220716T() {
        boolean zM146386f4 = joa.m146386f4();
        if (zM146386f4) {
            m220709I().setBackgroundResource(sbw.INSTANCE.m185348m());
        } else {
            m220709I().setBackgroundResource(ebc0.f92898p);
        }
        m220709I().setEnabled(zM146386f4);
        if ((c69.m108118d() || !zM146386f4) && !IntlCountryCodeController.m29114k()) {
            bnl0.m105524M(m220709I(), true);
        } else {
            bnl0.m105524M(m220709I(), false);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m220717U() {
        User userM116600p9;
        LoveBuzzData loveBuzzDataM134315v0 = haw.INSTANCE.m134320a().m134315v0();
        if (loveBuzzDataM134315v0 != null) {
            boolean z = loveBuzzDataM134315v0.enabledBuzz.contains("textBuzz") && loveBuzzDataM134315v0.enabledBuzz.size() == 1;
            if (!z && !c69.m108118d() && (userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9()) != null) {
                z = !userM116600p9.isSVIP() || IntlCountryCodeController.m29114k();
            }
            bnl0.m105524M(m220708H(), !z);
            if (!z) {
                nbw.INSTANCE.m162252p0();
            }
            int iM105511F0 = bnl0.m105511F0();
            if (!bnl0.m105529O0(m220708H())) {
                bnl0.m105540X(m220709I(), iM105511F0 + qa00.f156316c);
            } else {
                bnl0.m105540X(m220708H(), C15274a.m88486b(qa00.f156322i + iM105511F0, qa00.m175859d(53.0f)));
                bnl0.m105540X(m220709I(), iM105511F0 + qa00.m175859d(46.0f));
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m220718V(@Nullable LoveBuzzData data) {
        if (k8w.INSTANCE.m148752a(this.act) && data != null) {
            m220723p();
            BuzzComboEntranceView buzzComboEntranceView = this.textBuzzView;
            if (buzzComboEntranceView != null) {
                BuzzComboEntranceView.m48316l0(buzzComboEntranceView, data.remainingTextBuzz, data.remainingBonus.textBuzz, 0, 4, null);
            }
            BuzzComboEntranceView buzzComboEntranceView2 = this.voiceBuzzView;
            if (buzzComboEntranceView2 != null) {
                BuzzComboEntranceView.m48316l0(buzzComboEntranceView2, data.remainingVoiceBuzz, data.remainingBonus.voiceBuzz, 0, 4, null);
            }
            BuzzComboEntranceView buzzComboEntranceView3 = this.videoBuzzView;
            if (buzzComboEntranceView3 != null) {
                buzzComboEntranceView3.mo48319k0(data.remainingVideoBuzz, data.remainingBonus.videoBuzz, R$string.f20974j0);
            }
            MemojiBuzzComboEntranceView.m48434s(m220707G(), data.remainingMemojiBuzz, data.remainingBonus.memojiBuzz, 0, 4, null);
            m220708H().m48369g();
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m220719W(String from) {
        if (k8w.INSTANCE.m148752a(this.act)) {
            CoreModule.m30933P().m143405a().mo34575qm(this.act, from, Privilege.loveBuzz, null);
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m220720X(@Nullable l4g0 pageHelper) {
        if (pageHelper != null) {
            pageHelper.m152781p(jyb.m147494Y("buzz_entrance", this.pvExtra.toString()));
            pageHelper.m152776k();
            pageHelper.m152781p(new pf60[0]);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m220721Y(@Nullable l4g0 pageHelper) {
        if (pageHelper != null) {
            pageHelper.m152781p(jyb.m147494Y("buzz_entrance", this.pvExtra.toString()));
            pageHelper.m152777l();
            pageHelper.m152781p(new pf60[0]);
        }
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m220722n(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final View m220722n(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM99266b = ap3.m99266b(this, inflater, parent);
        viewM99266b.getClass();
        return viewM99266b;
    }

    /* JADX INFO: renamed from: p */
    public final void m220723p() {
        m220706F().post(new Runnable() { // from class: l.qo3
            @Override // java.lang.Runnable
            public final void run() {
                zo3.m220700l(this.f158694a);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m220724q() {
        no3 no3Var = this.presenter;
        boolean z = no3Var != null && no3Var.m164038s0();
        int iM105511F0 = bnl0.m105511F0();
        if (z) {
            bnl0.m105540X(m220732z(), qa00.f156306S + iM105511F0);
            bnl0.m105540X(m220705E(), qa00.f156293F);
            if (bnl0.m105529O0(m220702A())) {
                bnl0.m105540X(m220702A(), qa00.f156335v + iM105511F0);
            }
            sbw sbwVar = sbw.INSTANCE;
            sbw.m185339u(sbwVar, m220706F(), 0, 0, qa00.f156288A, qa00.f156294G, 4, null);
            VText vTextM220704C = m220704C();
            int i = qa00.f156321h;
            int i2 = qa00.f156326m;
            sbw.m185339u(sbwVar, vTextM220704C, i2, i, i2, 0, 16, null);
        } else {
            bnl0.m105540X(m220732z(), qa00.f156293F + iM105511F0);
            bnl0.m105540X(m220705E(), qa00.f156323j);
            if (bnl0.m105529O0(m220702A())) {
                bnl0.m105540X(m220702A(), iM105511F0);
            }
            sbw sbwVar2 = sbw.INSTANCE;
            sbw.m185339u(sbwVar2, m220706F(), 0, 0, 0, qa00.f156328o, 4, null);
            VText vTextM220704C2 = m220704C();
            int i3 = qa00.f156318e;
            int i4 = qa00.f156319f;
            sbw.m185339u(sbwVar2, vTextM220704C2, i4, i3, i4, 0, 16, null);
        }
        if (z && this.buzzBgAnim == null) {
            this.buzzBgAnim = (SVGAnimationView) m220703B().inflate();
        }
        SVGAnimationView sVGAnimationView = this.buzzBgAnim;
        if (!z) {
            if (sVGAnimationView != null) {
                SVGAnimationView.stopAnimation$default(sVGAnimationView, false, 1, null);
            }
        } else if (sVGAnimationView != null) {
            bnl0.m105540X(sVGAnimationView, iM105511F0 + qa00.m175859d(67.5f));
            if (sVGAnimationView.isAnimating()) {
                return;
            }
            SVGALoader.with(getContext()).from(kq3.INSTANCE.m150818l()).autoPlay(true).into(sVGAnimationView);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m220725r() {
        if (this.lowDevice) {
            m220732z().setBackgroundResource(ebc0.f92846E);
        } else if (!m220732z().isAnimating()) {
            SVGALoader.with(getContext()).from(kq3.INSTANCE.m150809c()).autoPlay(true).into(m220732z());
        }
        m220716T();
        m220715S();
        nbw.INSTANCE.m162204A();
        m220718V(haw.INSTANCE.m134320a().m134315v0());
        m220711O();
    }

    /* JADX INFO: renamed from: s */
    public final void m220726s(String type, int pos, int size, boolean newUI) {
        LinearLayout.LayoutParams layoutParams;
        BuzzComboEntranceView buzzComboEntranceViewM48320a = BuzzComboEntranceView.INSTANCE.m48320a(type, getContext(), size, newUI);
        if (newUI) {
            layoutParams = new LinearLayout.LayoutParams(-1, size < 3 ? qa00.m175859d(110.0f) : qa00.f156297J);
        } else {
            layoutParams = new LinearLayout.LayoutParams(-1, size == 1 ? qa00.f156301N : qa00.m175859d(84.0f));
        }
        layoutParams.topMargin = pos == 0 ? 0 : qa00.f156318e;
        xa2.INSTANCE.m209830a("BuzzComboViewModel", "addSingle, type is " + type + "  pos is " + pos + " pvExtra is " + ((Object) this.pvExtra));
        int iHashCode = type.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != -1004163680) {
                if (iHashCode != 1332422126 || !type.equals("videoBuzz")) {
                    return;
                } else {
                    this.videoBuzzView = buzzComboEntranceViewM48320a;
                }
            } else if (!type.equals("textBuzz")) {
                return;
            } else {
                this.textBuzzView = buzzComboEntranceViewM48320a;
            }
        } else if (!type.equals("voiceBuzz")) {
            return;
        } else {
            this.voiceBuzzView = buzzComboEntranceViewM48320a;
        }
        if (NullChecker.m82486a(buzzComboEntranceViewM48320a)) {
            m220706F().addView(buzzComboEntranceViewM48320a, layoutParams);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable no3 presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m220728v(Act act) {
        if (!CoreModule.f18264c.f20381e0.m116600p9().isChatJailed()) {
            return false;
        }
        CoreModule.m30933P().m143412i().mo180433Z2(act, false);
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final void m220729w(final String type) {
        haw.m134251p0(haw.INSTANCE.m134320a(), type, this.act, new Function0() { // from class: l.po3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zo3.m220698j(this.f153360a, type);
            }
        }, null, false, 24, null);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final ConstraintLayout m220730x() {
        ConstraintLayout constraintLayout = this._buzz_root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_buzz_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VText_NoTopPadding m220731y() {
        VText_NoTopPadding vText_NoTopPadding = this._buzz_root_back;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_buzz_root_back");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final SVGAnimationView m220732z() {
        SVGAnimationView sVGAnimationView = this._buzz_root_bee_anim;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_buzz_root_bee_anim");
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
