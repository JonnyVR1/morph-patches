package com.p046p1.mobile.putong.core.p053ui.hideandseek;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.generic.RoundingParams;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import com.p046p1.mobile.putong.core.data.GameOperate;
import com.p046p1.mobile.putong.core.data.GamePlayerState;
import com.p046p1.mobile.putong.core.data.HideAndSeekGameInfo;
import com.p046p1.mobile.putong.core.data.HideAndSeekOperateEnv;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.hideandseek.IntlHideAndSeekInfoView;
import com.p046p1.mobile.putong.core.p053ui.verification.VerificationCenterAct;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.cnn;
import p149l.cwf0;
import p149l.e30;
import p149l.ejj;
import p149l.eqh0;
import p149l.hvc0;
import p149l.i0e;
import p149l.mkd0;
import p149l.o7r;
import p149l.pii0;
import p149l.qib0;
import p149l.t100;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xh0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\f2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010&J'\u0010)\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u00102\u001a\u0002012\u0006\u0010.\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u000101H\u0014¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\f¢\u0006\u0004\b9\u0010\u000eR\"\u0010@\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010T\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010K\u001a\u0004\bR\u0010M\"\u0004\bS\u0010OR\"\u0010X\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010K\u001a\u0004\bV\u0010M\"\u0004\bW\u0010OR\"\u0010\\\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010K\u001a\u0004\bZ\u0010M\"\u0004\b[\u0010OR\"\u0010`\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010C\u001a\u0004\b^\u0010E\"\u0004\b_\u0010GR\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010l\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010c\u001a\u0004\bj\u0010e\"\u0004\bk\u0010gR\u0014\u0010o\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010r\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010u¨\u0006w"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/hideandseek/IntlHideAndSeekInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "r", "()V", "r0", "", "operate", "z0", "(Ljava/lang/String;)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/data/HideAndSeekGameInfo;", BaseSei.INFO, "", "updateData", "t0", "(Lcom/p1/mobile/putong/core/data/HideAndSeekGameInfo;Z)V", "", "gamePlayerIcons", "p0", "(Ljava/util/List;)V", "url", Constants.INAPP_POSITION, "count", "Lv/VDraweeView;", "q0", "(Ljava/lang/String;II)Lv/VDraweeView;", "Lkotlin/Function0;", "onConfirm", "w0", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;)V", "y0", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "o0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "child", "detachViewFromParent", "(Landroid/view/View;)V", "v0", "(Lcom/p1/mobile/putong/core/data/HideAndSeekGameInfo;)V", "s0", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", "get_info_icon", "()Lv/VDraweeView;", "set_info_icon", "(Lv/VDraweeView;)V", "_info_icon", "Lv/VLinear;", "e", "Lv/VLinear;", "get_game_content", "()Lv/VLinear;", "set_game_content", "(Lv/VLinear;)V", "_game_content", "Lv/VText;", "f", "Lv/VText;", "get_game_content_title", "()Lv/VText;", "set_game_content_title", "(Lv/VText;)V", "_game_content_title", "g", "get_game_content_subtitle", "set_game_content_subtitle", "_game_content_subtitle", "h", "get_game_time", "set_game_time", "_game_time", RXScreenCaptureService.KEY_INDEX, "get_game_location", "set_game_location", "_game_location", "j", "get_game_member", "set_game_member", "_game_member", "Lv/VButton;", "k", "Lv/VButton;", "get_positive", "()Lv/VButton;", "set_positive", "(Lv/VButton;)V", "_positive", BLiveStormDanmakuGiftResourceType.f44444l, "get_negative", "set_negative", "_negative", "m", "Ljava/lang/String;", "TAG", "n", "Lcom/p1/mobile/putong/core/data/HideAndSeekGameInfo;", "gameInfo", "Ll/cwf0;", "o", "Ll/cwf0;", "pageHelper", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class IntlHideAndSeekInfoView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _info_icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VLinear _game_content;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _game_content_title;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _game_content_subtitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _game_time;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _game_location;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VLinear _game_member;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VButton _positive;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VButton _negative;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public HideAndSeekGameInfo gameInfo;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public cwf0 pageHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlHideAndSeekInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.TAG = "IntlHideAndSeekInfoView";
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(getContext());
        layoutInflaterM163037a.getClass();
        m46037o0(layoutInflaterM163037a, this);
        m46034r();
        m46035r0();
    }

    private final Act act() {
        Context context = getContext();
        context.getClass();
        return (Act) context;
    }

    /* JADX INFO: renamed from: h0 */
    public static void m46027h0(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m46028i0(IntlHideAndSeekInfoView intlHideAndSeekInfoView, HideAndSeekOperateEnv hideAndSeekOperateEnv) {
        intlHideAndSeekInfoView.act().progressDismiss();
        intlHideAndSeekInfoView.m46041t0(hideAndSeekOperateEnv.data, true);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m46029j0(IntlHideAndSeekInfoView intlHideAndSeekInfoView, View view) {
        HideAndSeekGameInfo hideAndSeekGameInfo = intlHideAndSeekInfoView.gameInfo;
        if (hideAndSeekGameInfo == null || !TEnum.equals(hideAndSeekGameInfo.gameStage, "show")) {
            return;
        }
        HideAndSeekGameInfo hideAndSeekGameInfo2 = intlHideAndSeekInfoView.gameInfo;
        boolean zEquals = TEnum.equals(hideAndSeekGameInfo2 != null ? hideAndSeekGameInfo2.gameIdentity : null, GameIdentity.player);
        HideAndSeekGameInfo hideAndSeekGameInfo3 = intlHideAndSeekInfoView.gameInfo;
        if (!zEquals) {
            intlHideAndSeekInfoView.m46045z0(TEnum.equals(hideAndSeekGameInfo3 != null ? hideAndSeekGameInfo3.gamePlayerState : null, "queuing") ? GameOperate.quitQueue : "queue");
            return;
        }
        if (TEnum.equals(hideAndSeekGameInfo3 != null ? hideAndSeekGameInfo3.gamePlayerState : null, "register")) {
            return;
        }
        intlHideAndSeekInfoView.m46045z0(GameOperate.quit);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m46030k0(IntlHideAndSeekInfoView intlHideAndSeekInfoView, View view) {
        HideAndSeekGameInfo hideAndSeekGameInfo = intlHideAndSeekInfoView.gameInfo;
        if (hideAndSeekGameInfo == null || !TEnum.equals(hideAndSeekGameInfo.gameStage, "show")) {
            return;
        }
        HideAndSeekGameInfo hideAndSeekGameInfo2 = intlHideAndSeekInfoView.gameInfo;
        if (TEnum.equals(hideAndSeekGameInfo2 != null ? hideAndSeekGameInfo2.gameIdentity : null, GameIdentity.player)) {
            HideAndSeekGameInfo hideAndSeekGameInfo3 = intlHideAndSeekInfoView.gameInfo;
            if (TEnum.equals(hideAndSeekGameInfo3 != null ? hideAndSeekGameInfo3.gamePlayerState : null, GamePlayerState.registered)) {
                return;
            }
            intlHideAndSeekInfoView.m46045z0("add");
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static void m46031l0(IntlHideAndSeekInfoView intlHideAndSeekInfoView, Throwable th) {
        intlHideAndSeekInfoView.act().progressDismiss();
        th.getMessage();
    }

    /* JADX INFO: renamed from: m0 */
    public static void m46032m0(View view) {
    }

    /* JADX INFO: renamed from: n0 */
    public static Unit m46033n0(IntlHideAndSeekInfoView intlHideAndSeekInfoView) {
        intlHideAndSeekInfoView.m46044y0(intlHideAndSeekInfoView.act());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    private final void m46034r() {
        setBackgroundResource(x2c0.f189448J9);
        int i = t100.f167266o;
        setPadding(i, i, i, i);
    }

    /* JADX INFO: renamed from: r0 */
    private final void m46035r0() {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.vmn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlHideAndSeekInfoView.m46032m0(view);
            }
        });
        xdl0.m208329E0(get_positive(), new View.OnClickListener() { // from class: l.wmn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlHideAndSeekInfoView.m46030k0(this.f187079a, view);
            }
        });
        xdl0.m208329E0(get_negative(), new View.OnClickListener() { // from class: l.xmn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlHideAndSeekInfoView.m46029j0(this.f193568a, view);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m46036u0(IntlHideAndSeekInfoView intlHideAndSeekInfoView, HideAndSeekGameInfo hideAndSeekGameInfo, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        intlHideAndSeekInfoView.m46041t0(hideAndSeekGameInfo, z);
    }

    @Override // android.view.ViewGroup
    public void detachViewFromParent(@Nullable View child) {
        super.detachViewFromParent(child);
    }

    @NotNull
    public final VLinear get_game_content() {
        VLinear vLinear = this._game_content;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_game_content");
        return null;
    }

    @NotNull
    public final VText get_game_content_subtitle() {
        VText vText = this._game_content_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_game_content_subtitle");
        return null;
    }

    @NotNull
    public final VText get_game_content_title() {
        VText vText = this._game_content_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_game_content_title");
        return null;
    }

    @NotNull
    public final VText get_game_location() {
        VText vText = this._game_location;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_game_location");
        return null;
    }

    @NotNull
    public final VLinear get_game_member() {
        VLinear vLinear = this._game_member;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_game_member");
        return null;
    }

    @NotNull
    public final VText get_game_time() {
        VText vText = this._game_time;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_game_time");
        return null;
    }

    @NotNull
    public final VDraweeView get_info_icon() {
        VDraweeView vDraweeView = this._info_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_info_icon");
        return null;
    }

    @NotNull
    public final VButton get_negative() {
        VButton vButton = this._negative;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_negative");
        return null;
    }

    @NotNull
    public final VButton get_positive() {
        VButton vButton = this._positive;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_positive");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final View m46037o0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM107807b = cnn.m107807b(this, inflater, parent);
        viewM107807b.getClass();
        return viewM107807b;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m46038p0(List<String> gamePlayerIcons) {
        if (gamePlayerIcons == null || get_game_member().getChildCount() == gamePlayerIcons.size()) {
            return;
        }
        get_game_member().removeAllViews();
        Iterator<T> it = gamePlayerIcons.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            get_game_member().addView(m46039q0((String) it.next(), i, gamePlayerIcons.size() - i));
            if (i == 5) {
                return;
            } else {
                i = i2;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: q0 */
    public final VDraweeView m46039q0(String url, int pos, int count) {
        VDraweeView vDraweeView = new VDraweeView(act());
        int i = t100.f167255d;
        vDraweeView.setPadding(i, i, i, i);
        int i2 = t100.f167226A;
        ConstraintLayout.C0220a c0220a = new ConstraintLayout.C0220a(i2, i2);
        c0220a.setMarginStart(pos == 0 ? 0 : -t100.f167264m);
        vDraweeView.setLayoutParams(c0220a);
        ejj ejjVarM184722l = qib0.f154691G.m184722l();
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8268v(true);
        ejjVarM184722l.m116870K(roundingParams);
        vDraweeView.setHierarchy(ejjVarM184722l.m116872a());
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = url;
        Picture.ImageUri imageUriCalculatedWidth = pictureNew_.calculatedWidth(i2);
        if (pos < 5) {
            qib0.f154691G.m102331L0(vDraweeView, imageUriCalculatedWidth.formatted());
        } else {
            vDraweeView.setForeground(new pii0(count + Marker.ANY_NON_NULL_MARKER, t100.f167276y, t100.f167264m, eqh0.m117752c(3), hvc0.m133154a(w0c0.f183834b2), pii0.f149561i, hvc0.m133154a(w0c0.f183811U1)));
            qib0.f154691G.m102338P(vDraweeView, imageUriCalculatedWidth.formatted(), 2, 12, w0c0.f183846f0);
        }
        vDraweeView.setBackground(hvc0.m133155b(x2c0.f189667Qb));
        return vDraweeView;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m46040s0() {
        cwf0 cwf0Var = this.pageHelper;
        if (cwf0Var != null) {
            i0e.m133796e(cwf0Var);
        }
    }

    public final void set_game_content(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._game_content = vLinear;
    }

    public final void set_game_content_subtitle(@NotNull VText vText) {
        vText.getClass();
        this._game_content_subtitle = vText;
    }

    public final void set_game_content_title(@NotNull VText vText) {
        vText.getClass();
        this._game_content_title = vText;
    }

    public final void set_game_location(@NotNull VText vText) {
        vText.getClass();
        this._game_location = vText;
    }

    public final void set_game_member(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._game_member = vLinear;
    }

    public final void set_game_time(@NotNull VText vText) {
        vText.getClass();
        this._game_time = vText;
    }

    public final void set_info_icon(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._info_icon = vDraweeView;
    }

    public final void set_negative(@NotNull VButton vButton) {
        vButton.getClass();
        this._negative = vButton;
    }

    public final void set_positive(@NotNull VButton vButton) {
        vButton.getClass();
        this._positive = vButton;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m46041t0(HideAndSeekGameInfo info, boolean updateData) {
        if (info == null) {
            return;
        }
        if (updateData) {
            HideAndSeekGameInfo hideAndSeekGameInfo = this.gameInfo;
            if (hideAndSeekGameInfo != null) {
                hideAndSeekGameInfo.gameStage = info.gameStage;
            }
            if (hideAndSeekGameInfo != null) {
                hideAndSeekGameInfo.gamePlayerState = info.gamePlayerState;
            }
        }
        HideAndSeekGameInfo hideAndSeekGameInfo2 = this.gameInfo;
        if (TEnum.equals(hideAndSeekGameInfo2 != null ? hideAndSeekGameInfo2.gameStage : null, "end")) {
            xdl0.m208344M(get_positive(), false);
            get_negative().setText(hvc0.m133156c(R$string.f18451db));
            return;
        }
        HideAndSeekGameInfo hideAndSeekGameInfo3 = this.gameInfo;
        if (TEnum.equals(hideAndSeekGameInfo3 != null ? hideAndSeekGameInfo3.gameStage : null, "start")) {
            xdl0.m208344M(get_positive(), false);
            get_negative().setText(hvc0.m133156c(R$string.f18512fb));
            return;
        }
        HideAndSeekGameInfo hideAndSeekGameInfo4 = this.gameInfo;
        if (TEnum.equals(hideAndSeekGameInfo4 != null ? hideAndSeekGameInfo4.gameIdentity : null, GameIdentity.player)) {
            HideAndSeekGameInfo hideAndSeekGameInfo5 = this.gameInfo;
            boolean zEquals = TEnum.equals(hideAndSeekGameInfo5 != null ? hideAndSeekGameInfo5.gamePlayerState : null, GamePlayerState.registered);
            get_positive().setBackgroundResource(zEquals ? x2c0.f189774Tp : x2c0.f189750T1);
            get_positive().setText(hvc0.m133156c(zEquals ? R$string.f18420cb : R$string.f18389bb));
            xdl0.m208344M(get_negative(), zEquals);
            get_negative().setText(hvc0.m133156c(R$string.f18481eb));
            return;
        }
        get_positive().setBackgroundResource(x2c0.f189774Tp);
        VButton vButton = get_positive();
        HideAndSeekGameInfo hideAndSeekGameInfo6 = this.gameInfo;
        vButton.setText(TEnum.equals(hideAndSeekGameInfo6 != null ? hideAndSeekGameInfo6.gamePlayerState : null, "queuing") ? hvc0.m133156c(R$string.f18574hb) : hvc0.m133156c(R$string.f18358ab));
        VButton vButton2 = get_negative();
        HideAndSeekGameInfo hideAndSeekGameInfo7 = this.gameInfo;
        vButton2.setText(TEnum.equals(hideAndSeekGameInfo7 != null ? hideAndSeekGameInfo7.gamePlayerState : null, "queuing") ? hvc0.m133156c(R$string.f18327Za) : hvc0.m133156c(R$string.f18543gb));
    }

    /* JADX INFO: renamed from: v0 */
    public final void m46042v0(@Nullable HideAndSeekGameInfo info) {
        if (info == null) {
            return;
        }
        xdl0.m208344M(this, true);
        this.gameInfo = info;
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = info.gameIcon;
        qib0.f154691G.m102331L0(get_info_icon(), pictureNew_.calculatedWidth(t100.f167244S).formatted());
        get_game_content_title().setText(info.gameTitle);
        get_game_content_subtitle().setText(info.gameDesc);
        get_game_time().setText(info.gameTime);
        get_game_location().setText(info.gameAddress);
        m46038p0(info.gamePlayerIcons);
        m46036u0(this, info, false, 2, null);
        HideAndSeekGameInfo hideAndSeekGameInfo = this.gameInfo;
        if (TEnum.equals(hideAndSeekGameInfo != null ? hideAndSeekGameInfo.gameIdentity : null, GameIdentity.guest)) {
            HideAndSeekGameInfo hideAndSeekGameInfo2 = this.gameInfo;
            if (TEnum.equals(hideAndSeekGameInfo2 != null ? hideAndSeekGameInfo2.gamePlayerState : null, "queue") && this.pageHelper == null) {
                cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_mkt_catnmouse_full", IntlHideAndSeekRoleView.class.getName());
                this.pageHelper = cwf0VarM133794c;
                i0e.m133797f(cwf0VarM133794c);
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m46043w0(Act act, final Function0<Unit> onConfirm) {
        new xh0.C21150a(act).m208731j(hvc0.m133156c(R$string.f18789ob)).m208738q(R$string.f18820pb).m208736o(new View.OnClickListener() { // from class: l.bnn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlHideAndSeekInfoView.m46027h0(onConfirm, view);
            }
        }).m208726e(R$string.f18758nb).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m46044y0(Act act) {
        if (TEnum.equals(CoreModule.f17545c.f19552B0.m31620s4(), "pending")) {
            CoreDlg.m44987G1(act, hvc0.m133156c(R$string.f17864Jr), hvc0.m133156c(R$string.f17834Ir), x2c0.f190654vj, hvc0.m133156c(R$string.f19076xr), null, false, null, null, null, null, true, false, null, null, false);
        } else {
            act.startActivity(VerificationCenterAct.m55991X1(act, false));
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m46045z0(String operate) {
        if (TextUtils.equals(operate, "queue")) {
            zvf0.m220396r("e_intl_mkt_catnmouse_wait_btn", "p_intl_mkt_catnmouse_full");
        }
        if (TextUtils.equals("queue", operate) || TextUtils.equals("add", operate)) {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (userM169527p9 == null) {
                return;
            }
            if (!userM169527p9.isPicVerificationVerified()) {
                m46043w0(act(), new Function0() { // from class: l.ymn
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IntlHideAndSeekInfoView.m46033n0(this.f199035a);
                    }
                });
                return;
            }
        }
        act().progress(R$string.f17842J5);
        act().duringCreated(CoreModule.f17545c.f19638d2.m181934o3(operate)).subscribe(mkd0.m154956H(new e30() { // from class: l.zmn
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlHideAndSeekInfoView.m46028i0(this.f203748a, (HideAndSeekOperateEnv) obj);
            }
        }, new e30() { // from class: l.ann
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlHideAndSeekInfoView.m46031l0(this.f70746a, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntlHideAndSeekInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntlHideAndSeekInfoView(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
