package p153l;

import android.animation.Animator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Color;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LikeMindedData;
import com.p051p1.mobile.putong.core.data.LikeMindedEnvelope;
import com.p051p1.mobile.putong.core.data.LikeMindedItemData;
import com.p051p1.mobile.putong.core.data.LikeMindedItemLanguagesData;
import com.p051p1.mobile.putong.core.data.LikeMindedItemStatusData;
import com.p051p1.mobile.putong.core.data.LikeMindedRequestParams;
import com.p051p1.mobile.putong.core.p058ui.likeminded.C8574a;
import com.p051p1.mobile.putong.core.view.banner.Banner;
import com.p051p1.mobile.putong.core.view.banner.IndicatorView;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import com.tencent.open.SocialConstants;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VProgress;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\rJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b'\u0010#J\u000f\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b(\u0010\rJ\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\t¢\u0006\u0004\b,\u0010\rJ\u001f\u00101\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010-2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J7\u0010:\u001a\u00020\t2\f\u00105\u001a\b\u0012\u0004\u0012\u000204032\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000207062\u0006\u00109\u001a\u000204¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010[\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010R\u001a\u0004\bY\u0010T\"\u0004\bZ\u0010VR\"\u0010c\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010j\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010n\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010e\u001a\u0004\bl\u0010g\"\u0004\bm\u0010iR\"\u0010r\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010e\u001a\u0004\bp\u0010g\"\u0004\bq\u0010iR\"\u0010u\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010B\u001a\u0004\bs\u0010D\"\u0004\bt\u0010FR\"\u0010y\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010R\u001a\u0004\bw\u0010T\"\u0004\bx\u0010VR\"\u0010|\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010R\u001a\u0004\bz\u0010T\"\u0004\b{\u0010VR\"\u0010\u007f\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010J\u001a\u0004\b}\u0010L\"\u0004\b~\u0010NR)\u0010\u0086\u0001\u001a\u00030\u0080\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b1\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R*\u0010\u008e\u0001\u001a\u00030\u0087\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R*\u0010\u0096\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R*\u0010\u009e\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R)\u0010¡\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b,\u0010\u0099\u0001\u001a\u0006\b\u009f\u0001\u0010\u009b\u0001\"\u0006\b \u0001\u0010\u009d\u0001R\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0019\u0010¢\u0001R\u001a\u0010¦\u0001\u001a\u00030£\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0019\u0010¨\u0001\u001a\u00030§\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\n\u0010\u0092\u0001R\u001f\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001b\u0010©\u0001R%\u00108\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000207\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bC\u0010ª\u0001R\u0017\u00109\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bK\u0010«\u0001R\u001b\u0010®\u0001\u001a\u0005\u0018\u00010¬\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bf\u0010\u00ad\u0001R\u0019\u0010±\u0001\u001a\u00030¯\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bl\u0010°\u0001R+\u0010¶\u0001\u001a\u0012\u0012\u0004\u0012\u00020!\u0012\u0007\u0012\u0005\u0018\u00010§\u00010²\u00018\u0006¢\u0006\u000f\n\u0005\bp\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R+\u0010¸\u0001\u001a\u0012\u0012\u0004\u0012\u00020!\u0012\u0007\u0012\u0005\u0018\u00010§\u00010²\u00018\u0006¢\u0006\u000f\n\u0005\bz\u0010³\u0001\u001a\u0006\b·\u0001\u0010µ\u0001¨\u0006¹\u0001"}, m88121d2 = {"Ll/cgr;", "Ll/iam;", "Ll/ufr;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "isShow", "", "u", "(Z)V", "R", "()V", "", "start", "end", "Landroid/animation/PropertyValuesHolder;", BLiveStormDanmakuGiftResourceType.f45292l, "(FF)Landroid/animation/PropertyValuesHolder;", BloodType.f39576O, "()Landroid/animation/PropertyValuesHolder;", "P", "", "endTime", BLiveStormDanmakuGiftResourceType.f45294s, "(J)V", ResourceDirection.f39656v, "Q", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "j", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "m", "(Ll/ufr;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "Lcom/p1/mobile/putong/core/data/LikeMindedItemStatusData;", "data", "Lcom/p1/mobile/putong/core/data/LikeMindedData;", "response", "n", "(Lcom/p1/mobile/putong/core/data/LikeMindedItemStatusData;Lcom/p1/mobile/putong/core/data/LikeMindedData;)V", "", "", "itemData", "", "Lcom/p1/mobile/putong/core/data/LikeMindedItemData;", "same", IjkMediaMeta.IJKM_KEY_LANGUAGE, "N", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)V", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lv/VDraweeView;", "b", "Lv/VDraweeView;", "w", "()Lv/VDraweeView;", "set_bg", "(Lv/VDraweeView;)V", "_bg", "Landroidx/constraintlayout/widget/ConstraintLayout;", "c", "Landroidx/constraintlayout/widget/ConstraintLayout;", BaseSei.f14624X, "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_finding_layout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_finding_layout", "Landroid/widget/TextView;", Constants.INAPP_DATA_TAG, "Landroid/widget/TextView;", "get_finding_layout_finding_title", "()Landroid/widget/TextView;", "set_finding_layout_finding_title", "(Landroid/widget/TextView;)V", "_finding_layout_finding_title", "e", "F", "set_finding_layout_finding_time", "_finding_layout_finding_time", "Lv/VProgress;", "f", "Lv/VProgress;", "get_finding_layout_progress", "()Lv/VProgress;", "set_finding_layout_progress", "(Lv/VProgress;)V", "_finding_layout_progress", "g", "Landroid/view/View;", BaseSei.f14625Y, "()Landroid/view/View;", "set_finding_layout_finding_anim_big_circle", "(Landroid/view/View;)V", "_finding_layout_finding_anim_big_circle", "h", BaseSei.f14626Z, "set_finding_layout_finding_anim_ring", "_finding_layout_finding_anim_ring", RXScreenCaptureService.KEY_INDEX, "A", "set_finding_layout_finding_anim_small_circle", "_finding_layout_finding_anim_small_circle", "E", "set_finding_layout_finding_img", "_finding_layout_finding_img", "k", c4s.C_ZONE, "set_finding_layout_finding_content_title", "_finding_layout_finding_content_title", "B", "set_finding_layout_finding_content_desc", "_finding_layout_finding_content_desc", "G", "set_setting_layout", "_setting_layout", "Lv/VText;", "Lv/VText;", "L", "()Lv/VText;", "set_setting_layout_title", "(Lv/VText;)V", "_setting_layout_title", "Lcom/p1/mobile/putong/core/view/banner/Banner;", "o", "Lcom/p1/mobile/putong/core/view/banner/Banner;", "H", "()Lcom/p1/mobile/putong/core/view/banner/Banner;", "set_setting_layout_banner", "(Lcom/p1/mobile/putong/core/view/banner/Banner;)V", "_setting_layout_banner", "Lcom/p1/mobile/putong/core/view/banner/IndicatorView;", "p", "Lcom/p1/mobile/putong/core/view/banner/IndicatorView;", "I", "()Lcom/p1/mobile/putong/core/view/banner/IndicatorView;", "set_setting_layout_indicator", "(Lcom/p1/mobile/putong/core/view/banner/IndicatorView;)V", "_setting_layout_indicator", "Lv/VButton;", "q", "Lv/VButton;", "K", "()Lv/VButton;", "set_setting_layout_start_btn", "(Lv/VButton;)V", "_setting_layout_start_btn", "J", "set_setting_layout_later_btn", "_setting_layout_later_btn", "Ll/ufr;", "Ll/cfr;", Constants.KEY_T, "Ll/cfr;", "adapter", "", "currentPosition", "Ljava/util/List;", "Ljava/util/Map;", "Ljava/lang/String;", "Landroid/animation/Animator;", "Landroid/animation/Animator;", "anim", "Ll/kcg0;", "Ll/kcg0;", "countDown", "Landroid/util/Property;", "Landroid/util/Property;", "getVIEW_HEIGHT_PROPERTY", "()Landroid/util/Property;", "VIEW_HEIGHT_PROPERTY", "getVIEW_WIDTH_PROPERTY", "VIEW_WIDTH_PROPERTY", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class cgr implements iam<ufr> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Property<View, Integer> VIEW_HEIGHT_PROPERTY;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final Property<View, Integer> VIEW_WIDTH_PROPERTY;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VDraweeView _bg;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ConstraintLayout _finding_layout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _finding_layout_finding_title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _finding_layout_finding_time;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VProgress _finding_layout_progress;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public View _finding_layout_finding_anim_big_circle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public View _finding_layout_finding_anim_ring;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public View _finding_layout_finding_anim_small_circle;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VDraweeView _finding_layout_finding_img;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public TextView _finding_layout_finding_content_title;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public TextView _finding_layout_finding_content_desc;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public ConstraintLayout _setting_layout;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VText _setting_layout_title;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public Banner _setting_layout_banner;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public IndicatorView _setting_layout_indicator;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VButton _setting_layout_start_btn;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VButton _setting_layout_later_btn;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public ufr presenter;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public cfr adapter;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public int currentPosition;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public List<String> itemData;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public Map<String, ? extends LikeMindedItemData> same;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public String language;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public Animator anim;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public kcg0 countDown;

    /* JADX INFO: renamed from: l.cgr$a */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"l/cgr$a", "Landroid/util/Property;", "Landroid/view/View;", "", "object", "a", "(Landroid/view/View;)Ljava/lang/Integer;", "value", "", "b", "(Landroid/view/View;Ljava/lang/Integer;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16250a extends Property<View, Integer> {
        public C16250a(Class<Integer> cls) {
            super(cls, "viewHeight");
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(View object) {
            object.getClass();
            return Integer.valueOf(object.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View object, Integer value) {
            object.getClass();
            ViewGroup.LayoutParams layoutParams = object.getLayoutParams();
            value.getClass();
            layoutParams.height = value.intValue();
            object.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: l.cgr$b */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"l/cgr$b", "Landroid/util/Property;", "Landroid/view/View;", "", "object", "a", "(Landroid/view/View;)Ljava/lang/Integer;", "value", "", "b", "(Landroid/view/View;Ljava/lang/Integer;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16251b extends Property<View, Integer> {
        public C16251b(Class<Integer> cls) {
            super(cls, "viewWidth");
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(View object) {
            object.getClass();
            return Integer.valueOf(object.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View object, Integer value) {
            object.getClass();
            ViewGroup.LayoutParams layoutParams = object.getLayoutParams();
            value.getClass();
            layoutParams.width = value.intValue();
            object.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: l.cgr$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/cgr$c", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "onPageSelected", "(I)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16252c extends ViewPager2.AbstractC0742i {
        public C16252c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            cgr.this.currentPosition = position;
        }
    }

    public cgr(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.language = "en-US";
        Class cls = Integer.TYPE;
        this.VIEW_HEIGHT_PROPERTY = new C16250a(cls);
        this.VIEW_WIDTH_PROPERTY = new C16251b(cls);
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m109714M(cgr cgrVar, LikeMindedRequestParams likeMindedRequestParams, LikeMindedEnvelope likeMindedEnvelope) {
        Map<String, ? extends LikeMindedItemData> map;
        Map<String, LikeMindedItemLanguagesData> map2;
        LikeMindedItemLanguagesData likeMindedItemLanguagesData;
        Map<String, LikeMindedItemLanguagesData> map3;
        LikeMindedItemLanguagesData likeMindedItemLanguagesData2;
        likeMindedEnvelope.getClass();
        if (likeMindedEnvelope.meta.code == 200 && (map = cgrVar.same) != null) {
            LikeMindedItemData likeMindedItemData = map.get(likeMindedRequestParams.type);
            LikeMindedItemStatusData likeMindedItemStatusData = null;
            LikeMindedItemStatusData likeMindedItemStatusData2 = (likeMindedItemData == null || (map3 = likeMindedItemData.multiLanguage) == null || (likeMindedItemLanguagesData2 = map3.get(cgrVar.language)) == null) ? null : likeMindedItemLanguagesData2.status;
            if (likeMindedItemStatusData2 == null) {
                LikeMindedItemData likeMindedItemData2 = map.get(likeMindedRequestParams.type);
                if (likeMindedItemData2 != null && (map2 = likeMindedItemData2.multiLanguage) != null && (likeMindedItemLanguagesData = map2.get("en-US")) != null) {
                    likeMindedItemStatusData = likeMindedItemLanguagesData.status;
                }
                likeMindedItemStatusData2 = likeMindedItemStatusData;
            }
            LikeMindedData likeMindedData = likeMindedEnvelope.data;
            likeMindedData.getClass();
            cgrVar.m109746n(likeMindedItemStatusData2, likeMindedData);
            C8574a.INSTANCE.m48073k();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX INFO: renamed from: Q */
    private final void m109715Q() {
        int i;
        switch (jfr.INSTANCE.m144707e()) {
            case "id-ID":
                i = dbc0.f86596Tb;
                break;
            case "ja-JP":
                i = dbc0.f86628Ub;
                break;
            case "ko-KR":
                i = dbc0.f86660Vb;
                break;
            case "th-TH":
                i = dbc0.f86692Wb;
                break;
            case "zh-CN":
                i = dbc0.f86724Xb;
                break;
            case "zh-TW":
                i = dbc0.f86756Yb;
                break;
            default:
                i = dbc0.f86564Sb;
                break;
        }
        m109739L().setBackgroundResource(i);
    }

    /* JADX INFO: renamed from: R */
    private final void m109716R() {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(m109751y(), m109744l(0.0f, 0.5f), m109741O(), m109742P());
        objectAnimatorOfPropertyValuesHolder.setRepeatCount(-1);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator duration = objectAnimatorOfPropertyValuesHolder.setDuration(1160L);
        duration.getClass();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(m109729A(), m109744l(0.0f, 0.5f), m109741O(), m109742P());
        objectAnimatorOfPropertyValuesHolder2.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfPropertyValuesHolder2.setRepeatCount(-1);
        objectAnimatorOfPropertyValuesHolder2.setDuration(1160L);
        objectAnimatorOfPropertyValuesHolder2.setStartDelay(500L);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(m109752z(), m109744l(0.0f, 1.0f), m109741O(), m109742P());
        objectAnimatorOfPropertyValuesHolder3.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfPropertyValuesHolder3.setDuration(1160L);
        objectAnimatorOfPropertyValuesHolder3.setStartDelay(1000L);
        objectAnimatorOfPropertyValuesHolder3.setRepeatCount(-1);
        Animator animatorM132180z = gt0.m132180z(duration, objectAnimatorOfPropertyValuesHolder2, objectAnimatorOfPropertyValuesHolder3);
        this.anim = animatorM132180z;
        if (animatorM132180z != null) {
            animatorM132180z.start();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m109717a(cgr cgrVar, View view) {
        i4g0.m138523u("e_same_making_btn", "p_same_making_page", jyb.m147494Y("same_making_btn", "cancel"));
        cgrVar.act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: c */
    public static void m109719c(cgr cgrVar, long j, Long l2) {
        cgrVar.m109728v(j);
    }

    /* JADX INFO: renamed from: e */
    public static void m109721e(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static void m109723i(final cgr cgrVar, View view) {
        List<String> list = cgrVar.itemData;
        if (list != null) {
            i4g0.m138523u("e_same_making_btn", "p_same_making_page", jyb.m147494Y("same_making_btn", "start"));
            final LikeMindedRequestParams likeMindedRequestParams = new LikeMindedRequestParams();
            likeMindedRequestParams.f21173me = CoreModule.m30929H().userId();
            likeMindedRequestParams.mcc = String.valueOf(uqb0.f180400f0);
            likeMindedRequestParams.type = list.get(cgrVar.currentPosition);
            CoreModule.f18264c.f20442y1.m219412g3(cgrVar.act, likeMindedRequestParams, new Function1() { // from class: l.xfr
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return cgr.m109714M(this.f194087a, likeMindedRequestParams, (LikeMindedEnvelope) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m109725p(cgr cgrVar) {
        if (NullChecker.m82486a(cgrVar.act) && !cgrVar.act.isFinishing()) {
            cgrVar.m109748u(false);
            cgrVar.act.lambda$debugItems$19();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m109726q(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: s */
    private final void m109727s(final long endTime) {
        kcg0 kcg0VarSubscribe = C22421c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.agr
            @Override // p153l.y20
            public final void call(Object obj) {
                cgr.m109719c(this.f71274a, endTime, (Long) obj);
            }
        }, new y20() { // from class: l.bgr
            @Override // p153l.y20
            public final void call(Object obj) {
                cgr.m109721e((Throwable) obj);
            }
        }));
        kcg0VarSubscribe.getClass();
        this.countDown = kcg0VarSubscribe;
    }

    /* JADX INFO: renamed from: v */
    private final void m109728v(long endTime) {
        TextView textViewM109733F;
        long jM174454o = pzi0.m174454o();
        Date date = new Date();
        date.setTime(Math.max(0L, endTime - jM174454o));
        if (this._finding_layout_finding_time == null || (textViewM109733F = m109733F()) == null) {
            return;
        }
        textViewM109733F.setText(C8574a.INSTANCE.m48075m(date));
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final View m109729A() {
        View view = this._finding_layout_finding_anim_small_circle;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_finding_layout_finding_anim_small_circle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final TextView m109730B() {
        TextView textView = this._finding_layout_finding_content_desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_finding_layout_finding_content_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final TextView m109731C() {
        TextView textView = this._finding_layout_finding_content_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_finding_layout_finding_content_title");
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
    public final VDraweeView m109732E() {
        VDraweeView vDraweeView = this._finding_layout_finding_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_finding_layout_finding_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final TextView m109733F() {
        TextView textView = this._finding_layout_finding_time;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_finding_layout_finding_time");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final ConstraintLayout m109734G() {
        ConstraintLayout constraintLayout = this._setting_layout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_setting_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final Banner m109735H() {
        Banner banner = this._setting_layout_banner;
        if (banner != null) {
            return banner;
        }
        Intrinsics.m88391r("_setting_layout_banner");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final IndicatorView m109736I() {
        IndicatorView indicatorView = this._setting_layout_indicator;
        if (indicatorView != null) {
            return indicatorView;
        }
        Intrinsics.m88391r("_setting_layout_indicator");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VButton m109737J() {
        VButton vButton = this._setting_layout_later_btn;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_setting_layout_later_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final VButton m109738K() {
        VButton vButton = this._setting_layout_start_btn;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_setting_layout_start_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final VText m109739L() {
        VText vText = this._setting_layout_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_setting_layout_title");
        return null;
    }

    /* JADX INFO: renamed from: N */
    public final void m109740N(@NotNull List<String> itemData, @NotNull Map<String, ? extends LikeMindedItemData> same, @NotNull String language) {
        itemData.getClass();
        same.getClass();
        language.getClass();
        this.itemData = itemData;
        this.language = language;
        this.same = same;
        cfr cfrVar = this.adapter;
        cfr cfrVar2 = null;
        if (cfrVar == null) {
            Intrinsics.m88391r("adapter");
            cfrVar = null;
        }
        cfrVar.m109580K(itemData, same, language);
        Banner bannerM109735H = m109735H();
        cfr cfrVar3 = this.adapter;
        if (cfrVar3 == null) {
            Intrinsics.m88391r("adapter");
        } else {
            cfrVar2 = cfrVar3;
        }
        bannerM109735H.m60782o(cfrVar2, 0);
    }

    /* JADX INFO: renamed from: O */
    public final PropertyValuesHolder m109741O() {
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(this.VIEW_HEIGHT_PROPERTY, qa00.m175859d(1.0f), qa00.m175859d(375.0f));
        propertyValuesHolderOfInt.getClass();
        return propertyValuesHolderOfInt;
    }

    /* JADX INFO: renamed from: P */
    public final PropertyValuesHolder m109742P() {
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(this.VIEW_WIDTH_PROPERTY, qa00.m175859d(1.0f), qa00.m175859d(375.0f));
        propertyValuesHolderOfInt.getClass();
        return propertyValuesHolderOfInt;
    }

    @Override // p153l.iam
    public void destroy() {
        kcg0 kcg0Var = this.countDown;
        if (kcg0Var == null) {
            Intrinsics.m88391r("countDown");
            kcg0Var = null;
        }
        psd0.m173633z(kcg0Var);
        Animator animator = this.anim;
        if (animator == null || !animator.isStarted()) {
            return;
        }
        animator.pause();
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m109743j(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final View m109743j(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM115740b = dgr.m115740b(this, inflater, parent);
        viewM115740b.getClass();
        return viewM115740b;
    }

    /* JADX INFO: renamed from: l */
    public final PropertyValuesHolder m109744l(float start, float end) {
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(View.ALPHA, Keyframe.ofFloat(0.0f, start), Keyframe.ofFloat(0.517f, end), Keyframe.ofFloat(0.862f, start), Keyframe.ofFloat(1.0f, start));
        propertyValuesHolderOfKeyframe.getClass();
        return propertyValuesHolderOfKeyframe;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable ufr presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: n */
    public final void m109746n(@Nullable LikeMindedItemStatusData data, @NotNull LikeMindedData response) {
        response.getClass();
        C8574a c8574a = C8574a.INSTANCE;
        c8574a.m48069g(c8574a.m48066d());
        if (data != null) {
            m109748u(true);
            m109734G().setVisibility(8);
            m109750x().setVisibility(0);
            uqb0.f180374G.m127115L0(m109732E(), data.icon);
            m109731C().setText(data.title);
            m109730B().setText(data.subTitle);
            m109716R();
            m109727s(pzi0.m174454o() + response.remain);
            final Function0 function0 = new Function0() { // from class: l.yfr
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return cgr.m109725p(this.f199648a);
                }
            };
            this.act.postDelayed(new Runnable() { // from class: l.zfr
                @Override // java.lang.Runnable
                public final void run() {
                    cgr.m109726q(function0);
                }
            }, 2000L);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m109747r() {
        C8574a c8574a = C8574a.INSTANCE;
        c8574a.m48070h(c8574a.m48066d());
        m109734G().setVisibility(0);
        m109750x().setVisibility(8);
        uqb0.f180374G.m127115L0(m109749w(), "https://auto.tancdn.com/v1/raw/02aa8e9a-9f79-49f1-8d63-40973428fda914.webp");
        m109715Q();
        int iM105587w = bnl0.m105587w(24.0f);
        this.adapter = new cfr(this.act);
        m109735H().m60784q(m109736I().m60806m(-1).m60807n(3.0f).m60808o(3.3f).m60810q(0.0f).m60811r(IndicatorView.InterfaceC9333a.INSTANCE.m60815d()).m60809p(Color.parseColor("#FF8817")), false).m60787t(iM105587w, iM105587w, bnl0.m105587w(20.0f)).m60781n(new u0e0()).m60786s(new C16252c()).m60788u(false);
        bnl0.m105509E0(m109738K(), new View.OnClickListener() { // from class: l.vfr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cgr.m109723i(this.f183965a, view);
            }
        });
        bnl0.m105509E0(m109737J(), new View.OnClickListener() { // from class: l.wfr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cgr.m109717a(this.f188877a, view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m109748u(boolean isShow) {
        C8574a c8574a = C8574a.INSTANCE;
        c8574a.m48065c().m152781p(jyb.m147494Y("icon", String.valueOf(this.currentPosition)));
        if (isShow) {
            c8574a.m48070h(c8574a.m48065c());
        } else {
            c8574a.m48069g(c8574a.m48065c());
        }
        c8574a.m48065c().m152781p(new pf60[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VDraweeView m109749w() {
        VDraweeView vDraweeView = this._bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final ConstraintLayout m109750x() {
        ConstraintLayout constraintLayout = this._finding_layout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_finding_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final View m109751y() {
        View view = this._finding_layout_finding_anim_big_circle;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_finding_layout_finding_anim_big_circle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final View m109752z() {
        View view = this._finding_layout_finding_anim_ring;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_finding_layout_finding_anim_ring");
        return null;
    }
}
