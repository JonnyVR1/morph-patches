package com.p051p1.mobile.putong.core.p058ui.hideandseek;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import com.p051p1.mobile.putong.core.data.GameOperate;
import com.p051p1.mobile.putong.core.data.GamePlayerState;
import com.p051p1.mobile.putong.core.data.HideAndSeekGameInfo;
import com.p051p1.mobile.putong.core.data.HideAndSeekOperateEnv;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.hideandseek.IntlHideAndSeekInfoView;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationCenterAct;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.c9c0;
import p153l.cpn;
import p153l.dbc0;
import p153l.i4g0;
import p153l.k3d0;
import p153l.l4g0;
import p153l.lyh0;
import p153l.p9r;
import p153l.pri0;
import p153l.psd0;
import p153l.qa00;
import p153l.th0;
import p153l.uqb0;
import p153l.w1e;
import p153l.xlj;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\f2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010&J'\u0010)\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u00102\u001a\u0002012\u0006\u0010.\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u000101H\u0014¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\f¢\u0006\u0004\b9\u0010\u000eR\"\u0010@\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010T\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010K\u001a\u0004\bR\u0010M\"\u0004\bS\u0010OR\"\u0010X\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010K\u001a\u0004\bV\u0010M\"\u0004\bW\u0010OR\"\u0010\\\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010K\u001a\u0004\bZ\u0010M\"\u0004\b[\u0010OR\"\u0010`\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010C\u001a\u0004\b^\u0010E\"\u0004\b_\u0010GR\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010l\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010c\u001a\u0004\bj\u0010e\"\u0004\bk\u0010gR\u0014\u0010o\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010r\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010u¨\u0006w"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/hideandseek/IntlHideAndSeekInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "r", "()V", "r0", "", "operate", "z0", "(Ljava/lang/String;)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/data/HideAndSeekGameInfo;", BaseSei.INFO, "", "updateData", "t0", "(Lcom/p1/mobile/putong/core/data/HideAndSeekGameInfo;Z)V", "", "gamePlayerIcons", "p0", "(Ljava/util/List;)V", "url", Constants.INAPP_POSITION, "count", "Lv/VDraweeView;", "q0", "(Ljava/lang/String;II)Lv/VDraweeView;", "Lkotlin/Function0;", "onConfirm", "w0", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;)V", "y0", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "o0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "child", "detachViewFromParent", "(Landroid/view/View;)V", "v0", "(Lcom/p1/mobile/putong/core/data/HideAndSeekGameInfo;)V", "s0", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", "get_info_icon", "()Lv/VDraweeView;", "set_info_icon", "(Lv/VDraweeView;)V", "_info_icon", "Lv/VLinear;", "e", "Lv/VLinear;", "get_game_content", "()Lv/VLinear;", "set_game_content", "(Lv/VLinear;)V", "_game_content", "Lv/VText;", "f", "Lv/VText;", "get_game_content_title", "()Lv/VText;", "set_game_content_title", "(Lv/VText;)V", "_game_content_title", "g", "get_game_content_subtitle", "set_game_content_subtitle", "_game_content_subtitle", "h", "get_game_time", "set_game_time", "_game_time", RXScreenCaptureService.KEY_INDEX, "get_game_location", "set_game_location", "_game_location", "j", "get_game_member", "set_game_member", "_game_member", "Lv/VButton;", "k", "Lv/VButton;", "get_positive", "()Lv/VButton;", "set_positive", "(Lv/VButton;)V", "_positive", BLiveStormDanmakuGiftResourceType.f45292l, "get_negative", "set_negative", "_negative", "m", "Ljava/lang/String;", "TAG", "n", "Lcom/p1/mobile/putong/core/data/HideAndSeekGameInfo;", "gameInfo", "Ll/l4g0;", "o", "Ll/l4g0;", "pageHelper", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    public l4g0 pageHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlHideAndSeekInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.TAG = "IntlHideAndSeekInfoView";
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(getContext());
        layoutInflaterM171370a.getClass();
        m47220o0(layoutInflaterM171370a, this);
        m47217r();
        m47218r0();
    }

    private final Act act() {
        Context context = getContext();
        context.getClass();
        return (Act) context;
    }

    /* JADX INFO: renamed from: h0 */
    public static void m47210h0(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m47211i0(IntlHideAndSeekInfoView intlHideAndSeekInfoView, HideAndSeekOperateEnv hideAndSeekOperateEnv) {
        intlHideAndSeekInfoView.act().progressDismiss();
        intlHideAndSeekInfoView.m47224t0(hideAndSeekOperateEnv.data, true);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m47212j0(IntlHideAndSeekInfoView intlHideAndSeekInfoView, View view) {
        HideAndSeekGameInfo hideAndSeekGameInfo = intlHideAndSeekInfoView.gameInfo;
        if (hideAndSeekGameInfo == null || !TEnum.equals(hideAndSeekGameInfo.gameStage, "show")) {
            return;
        }
        HideAndSeekGameInfo hideAndSeekGameInfo2 = intlHideAndSeekInfoView.gameInfo;
        boolean zEquals = TEnum.equals(hideAndSeekGameInfo2 != null ? hideAndSeekGameInfo2.gameIdentity : null, GameIdentity.player);
        HideAndSeekGameInfo hideAndSeekGameInfo3 = intlHideAndSeekInfoView.gameInfo;
        if (!zEquals) {
            intlHideAndSeekInfoView.m47228z0(TEnum.equals(hideAndSeekGameInfo3 != null ? hideAndSeekGameInfo3.gamePlayerState : null, "queuing") ? GameOperate.quitQueue : "queue");
            return;
        }
        if (TEnum.equals(hideAndSeekGameInfo3 != null ? hideAndSeekGameInfo3.gamePlayerState : null, "register")) {
            return;
        }
        intlHideAndSeekInfoView.m47228z0(GameOperate.quit);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m47213k0(IntlHideAndSeekInfoView intlHideAndSeekInfoView, View view) {
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
            intlHideAndSeekInfoView.m47228z0("add");
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static void m47214l0(IntlHideAndSeekInfoView intlHideAndSeekInfoView, Throwable th) {
        intlHideAndSeekInfoView.act().progressDismiss();
        th.getMessage();
    }

    /* JADX INFO: renamed from: m0 */
    public static void m47215m0(View view) {
    }

    /* JADX INFO: renamed from: n0 */
    public static Unit m47216n0(IntlHideAndSeekInfoView intlHideAndSeekInfoView) {
        intlHideAndSeekInfoView.m47227y0(intlHideAndSeekInfoView.act());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    private final void m47217r() {
        setBackgroundResource(dbc0.f86306K9);
        int i = qa00.f156328o;
        setPadding(i, i, i, i);
    }

    /* JADX INFO: renamed from: r0 */
    private final void m47218r0() {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.von
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlHideAndSeekInfoView.m47215m0(view);
            }
        });
        bnl0.m105509E0(get_positive(), new View.OnClickListener() { // from class: l.won
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlHideAndSeekInfoView.m47213k0(this.f190051a, view);
            }
        });
        bnl0.m105509E0(get_negative(), new View.OnClickListener() { // from class: l.xon
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlHideAndSeekInfoView.m47212j0(this.f195586a, view);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m47219u0(IntlHideAndSeekInfoView intlHideAndSeekInfoView, HideAndSeekGameInfo hideAndSeekGameInfo, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        intlHideAndSeekInfoView.m47224t0(hideAndSeekGameInfo, z);
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
        Intrinsics.m88391r("_game_content");
        return null;
    }

    @NotNull
    public final VText get_game_content_subtitle() {
        VText vText = this._game_content_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_game_content_subtitle");
        return null;
    }

    @NotNull
    public final VText get_game_content_title() {
        VText vText = this._game_content_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_game_content_title");
        return null;
    }

    @NotNull
    public final VText get_game_location() {
        VText vText = this._game_location;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_game_location");
        return null;
    }

    @NotNull
    public final VLinear get_game_member() {
        VLinear vLinear = this._game_member;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_game_member");
        return null;
    }

    @NotNull
    public final VText get_game_time() {
        VText vText = this._game_time;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_game_time");
        return null;
    }

    @NotNull
    public final VDraweeView get_info_icon() {
        VDraweeView vDraweeView = this._info_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_info_icon");
        return null;
    }

    @NotNull
    public final VButton get_negative() {
        VButton vButton = this._negative;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_negative");
        return null;
    }

    @NotNull
    public final VButton get_positive() {
        VButton vButton = this._positive;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_positive");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final View m47220o0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM111813b = cpn.m111813b(this, inflater, parent);
        viewM111813b.getClass();
        return viewM111813b;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m47221p0(List<String> gamePlayerIcons) {
        if (gamePlayerIcons == null || get_game_member().getChildCount() == gamePlayerIcons.size()) {
            return;
        }
        get_game_member().removeAllViews();
        Iterator<T> it = gamePlayerIcons.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            get_game_member().addView(m47222q0((String) it.next(), i, gamePlayerIcons.size() - i));
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
    public final VDraweeView m47222q0(String url, int pos, int count) {
        VDraweeView vDraweeView = new VDraweeView(act());
        int i = qa00.f156317d;
        vDraweeView.setPadding(i, i, i, i);
        int i2 = qa00.f156288A;
        ConstraintLayout.C0221a c0221a = new ConstraintLayout.C0221a(i2, i2);
        c0221a.setMarginStart(pos == 0 ? 0 : -qa00.f156326m);
        vDraweeView.setLayoutParams(c0221a);
        xlj xljVarM98795l = uqb0.f180374G.m98795l();
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8322v(true);
        xljVarM98795l.m211636K(roundingParams);
        vDraweeView.setHierarchy(xljVarM98795l.m211638a());
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = url;
        Picture.ImageUri imageUriCalculatedWidth = pictureNew_.calculatedWidth(i2);
        if (pos < 5) {
            uqb0.f180374G.m127115L0(vDraweeView, imageUriCalculatedWidth.formatted());
        } else {
            vDraweeView.setForeground(new pri0(count + Marker.ANY_NON_NULL_MARKER, qa00.f156338y, qa00.f156326m, lyh0.m156283c(3), k3d0.m148005a(c9c0.f80407c2), pri0.f153790i, k3d0.m148005a(c9c0.f80383V1)));
            uqb0.f180374G.m127122P(vDraweeView, imageUriCalculatedWidth.formatted(), 2, 12, c9c0.f80419g0);
        }
        vDraweeView.setBackground(k3d0.m148006b(dbc0.f86532Rb));
        return vDraweeView;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m47223s0() {
        l4g0 l4g0Var = this.pageHelper;
        if (l4g0Var != null) {
            w1e.m204401e(l4g0Var);
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
    public final void m47224t0(HideAndSeekGameInfo info, boolean updateData) {
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
            bnl0.m105524M(get_positive(), false);
            get_negative().setText(k3d0.m148007c(R$string.f19643sb));
            return;
        }
        HideAndSeekGameInfo hideAndSeekGameInfo3 = this.gameInfo;
        if (TEnum.equals(hideAndSeekGameInfo3 != null ? hideAndSeekGameInfo3.gameStage : null, "start")) {
            bnl0.m105524M(get_positive(), false);
            get_negative().setText(k3d0.m148007c(R$string.f19705ub));
            return;
        }
        HideAndSeekGameInfo hideAndSeekGameInfo4 = this.gameInfo;
        if (TEnum.equals(hideAndSeekGameInfo4 != null ? hideAndSeekGameInfo4.gameIdentity : null, GameIdentity.player)) {
            HideAndSeekGameInfo hideAndSeekGameInfo5 = this.gameInfo;
            boolean zEquals = TEnum.equals(hideAndSeekGameInfo5 != null ? hideAndSeekGameInfo5.gamePlayerState : null, GamePlayerState.registered);
            get_positive().setBackgroundResource(zEquals ? dbc0.f86227Hq : dbc0.f86618U1);
            get_positive().setText(k3d0.m148007c(zEquals ? R$string.f19612rb : R$string.f19581qb));
            bnl0.m105524M(get_negative(), zEquals);
            get_negative().setText(k3d0.m148007c(R$string.f19674tb));
            return;
        }
        get_positive().setBackgroundResource(dbc0.f86227Hq);
        VButton vButton = get_positive();
        HideAndSeekGameInfo hideAndSeekGameInfo6 = this.gameInfo;
        vButton.setText(TEnum.equals(hideAndSeekGameInfo6 != null ? hideAndSeekGameInfo6.gamePlayerState : null, "queuing") ? k3d0.m148007c(R$string.f19767wb) : k3d0.m148007c(R$string.f19550pb));
        VButton vButton2 = get_negative();
        HideAndSeekGameInfo hideAndSeekGameInfo7 = this.gameInfo;
        vButton2.setText(TEnum.equals(hideAndSeekGameInfo7 != null ? hideAndSeekGameInfo7.gamePlayerState : null, "queuing") ? k3d0.m148007c(R$string.f19519ob) : k3d0.m148007c(R$string.f19736vb));
    }

    /* JADX INFO: renamed from: v0 */
    public final void m47225v0(@Nullable HideAndSeekGameInfo info) {
        if (info == null) {
            return;
        }
        bnl0.m105524M(this, true);
        this.gameInfo = info;
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = info.gameIcon;
        uqb0.f180374G.m127115L0(get_info_icon(), pictureNew_.calculatedWidth(qa00.f156306S).formatted());
        get_game_content_title().setText(info.gameTitle);
        get_game_content_subtitle().setText(info.gameDesc);
        get_game_time().setText(info.gameTime);
        get_game_location().setText(info.gameAddress);
        m47221p0(info.gamePlayerIcons);
        m47219u0(this, info, false, 2, null);
        HideAndSeekGameInfo hideAndSeekGameInfo = this.gameInfo;
        if (TEnum.equals(hideAndSeekGameInfo != null ? hideAndSeekGameInfo.gameIdentity : null, GameIdentity.guest)) {
            HideAndSeekGameInfo hideAndSeekGameInfo2 = this.gameInfo;
            if (TEnum.equals(hideAndSeekGameInfo2 != null ? hideAndSeekGameInfo2.gamePlayerState : null, "queue") && this.pageHelper == null) {
                l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_mkt_catnmouse_full", IntlHideAndSeekRoleView.class.getName());
                this.pageHelper = l4g0VarM204399c;
                w1e.m204402f(l4g0VarM204399c);
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m47226w0(Act act, final Function0<Unit> onConfirm) {
        new th0.C20312a(act).m191151j(k3d0.m148007c(R$string.f18390Db)).m191158q(R$string.f18421Eb).m191156o(new View.OnClickListener() { // from class: l.bpn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlHideAndSeekInfoView.m47210h0(onConfirm, view);
            }
        }).m191146e(R$string.f18359Cb).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m47227y0(Act act) {
        if (TEnum.equals(CoreModule.f18264c.f20294B0.m32623s4(), "pending")) {
            CoreDlg.m46170G1(act, k3d0.m148007c(R$string.f19259fs), k3d0.m148007c(R$string.f19228es), dbc0.f87123jk, k3d0.m148007c(R$string.f18894Tr), null, false, null, null, null, null, true, false, null, null, false);
        } else {
            act.startActivity(VerificationCenterAct.m57174Y1(act, false));
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m47228z0(String operate) {
        if (TextUtils.equals(operate, "queue")) {
            i4g0.m138520r("e_intl_mkt_catnmouse_wait_btn", "p_intl_mkt_catnmouse_full");
        }
        if (TextUtils.equals("queue", operate) || TextUtils.equals("add", operate)) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (userM116600p9 == null) {
                return;
            }
            if (!userM116600p9.isPicVerificationVerified()) {
                m47226w0(act(), new Function0() { // from class: l.yon
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IntlHideAndSeekInfoView.m47216n0(this.f200992a);
                    }
                });
                return;
            }
        }
        act().progress(R$string.f18632L5);
        act().duringCreated(CoreModule.f18264c.f20380d2.m95790o3(operate)).subscribe(psd0.m173597H(new y20() { // from class: l.zon
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlHideAndSeekInfoView.m47211i0(this.f205361a, (HideAndSeekOperateEnv) obj);
            }
        }, new y20() { // from class: l.apn
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlHideAndSeekInfoView.m47214l0(this.f72732a, (Throwable) obj);
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
