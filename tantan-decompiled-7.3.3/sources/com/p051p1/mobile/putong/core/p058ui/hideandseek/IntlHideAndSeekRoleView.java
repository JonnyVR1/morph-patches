package com.p051p1.mobile.putong.core.p058ui.hideandseek;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.core.data.GameRole;
import com.p051p1.mobile.putong.core.data.HideAndSeekGameRole;
import com.p051p1.mobile.putong.core.data.HideAndSeekHoldEnv;
import com.p051p1.mobile.putong.core.p058ui.hideandseek.IntlHideAndSeekRoleView;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.bqn;
import p153l.dbc0;
import p153l.gqn;
import p153l.k3d0;
import p153l.p9r;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.th0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010!H\u0014¢\u0006\u0004\b%\u0010&J%\u0010+\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H\u0007¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\r¢\u0006\u0004\b-\u0010\u000fJ\r\u0010.\u001a\u00020\r¢\u0006\u0004\b.\u0010\u000fJ9\u00105\u001a\u00020\r2\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u00101\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u0015H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\r2\u0006\u00107\u001a\u00020\nH\u0007¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\r¢\u0006\u0004\b:\u0010\u000fR\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010V\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010M\u001a\u0004\bT\u0010O\"\u0004\bU\u0010QR\"\u0010Z\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010E\u001a\u0004\bX\u0010G\"\u0004\bY\u0010IR\"\u0010^\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010M\u001a\u0004\b\\\u0010O\"\u0004\b]\u0010QR\"\u0010b\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010M\u001a\u0004\b`\u0010O\"\u0004\ba\u0010QR\"\u0010f\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010M\u001a\u0004\bd\u0010O\"\u0004\be\u0010QR\"\u0010j\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010M\u001a\u0004\bh\u0010O\"\u0004\bi\u0010QR\"\u0010n\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010M\u001a\u0004\bl\u0010O\"\u0004\bm\u0010QR\"\u0010r\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010M\u001a\u0004\bp\u0010O\"\u0004\bq\u0010QR\"\u0010z\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u0014\u0010}\u001a\u00020/8\u0002X\u0082D¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0015\u0010\u0080\u0001\u001a\u00020/8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010|R\u0019\u0010\u0083\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001¨\u0006\u0086\u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/hideandseek/IntlHideAndSeekRoleView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/p1/mobile/putong/core/api/c0$c;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "r", "()V", "s0", "q0", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "()Lcom/p1/mobile/android/app/Act;", "", "time", "y0", "(J)V", "Lkotlin/Function0;", "onConfirm", "z0", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "p0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "child", "detachViewFromParent", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/core/data/HideAndSeekGameRole;", "roleInfo", "Ll/gqn;", "viewModel", "v0", "(Lcom/p1/mobile/putong/core/data/HideAndSeekGameRole;Ll/gqn;)V", "r0", "B0", "", Constants.KEY_KEY, "currentTime", "beginTime", "endTime", "registerTime", "u", "(Ljava/lang/String;JJJJ)V", "count", "D0", "(I)V", "u0", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", "get_role_icon", "()Lv/VDraweeView;", "set_role_icon", "(Lv/VDraweeView;)V", "_role_icon", "Lv/VLinear;", "e", "Lv/VLinear;", "get_game_content", "()Lv/VLinear;", "set_game_content", "(Lv/VLinear;)V", "_game_content", "Lv/VText;", "f", "Lv/VText;", "get_game_content_role", "()Lv/VText;", "set_game_content_role", "(Lv/VText;)V", "_game_content_role", "g", "get_game_content_subtitle", "set_game_content_subtitle", "_game_content_subtitle", "h", "get_count_down", "set_count_down", "_count_down", RXScreenCaptureService.KEY_INDEX, "get_count_down_hour_one", "set_count_down_hour_one", "_count_down_hour_one", "j", "get_count_down_hour_two", "set_count_down_hour_two", "_count_down_hour_two", "k", "get_count_down_minute_one", "set_count_down_minute_one", "_count_down_minute_one", BLiveStormDanmakuGiftResourceType.f45292l, "get_count_down_minute_two", "set_count_down_minute_two", "_count_down_minute_two", "m", "get_count_down_second_one", "set_count_down_second_one", "_count_down_second_one", "n", "get_count_down_second_two", "set_count_down_second_two", "_count_down_second_two", "Lv/VButton;", "o", "Lv/VButton;", "get_caught", "()Lv/VButton;", "set_caught", "(Lv/VButton;)V", "_caught", "p", "Ljava/lang/String;", "TAG", "q", "Lcom/p1/mobile/putong/core/data/HideAndSeekGameRole;", "HIDE_AND_SEEK_ROLE_TIMER", BLiveStormDanmakuGiftResourceType.f45294s, "I", "height", Constants.KEY_T, "Ll/gqn;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class IntlHideAndSeekRoleView extends ConstraintLayout implements RunnableC4884c0.c {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _role_icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VLinear _game_content;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _game_content_role;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _game_content_subtitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VLinear _count_down;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _count_down_hour_one;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _count_down_hour_two;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _count_down_minute_one;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VText _count_down_minute_two;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VText _count_down_second_one;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VText _count_down_second_two;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VButton _caught;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public HideAndSeekGameRole roleInfo;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final String HIDE_AND_SEEK_ROLE_TIMER;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int height;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public gqn viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlHideAndSeekRoleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.TAG = "IntlHideAndSeekRoleView";
        this.HIDE_AND_SEEK_ROLE_TIMER = "hide_and_seek_role_timer";
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(getContext());
        layoutInflaterM171370a.getClass();
        m47243p0(layoutInflaterM171370a, this);
        m47237r();
        m47238s0();
    }

    private final Act act() {
        Context context = getContext();
        context.getClass();
        return (Act) context;
    }

    /* JADX INFO: renamed from: i0 */
    public static void m47230i0(View view) {
    }

    /* JADX INFO: renamed from: j0 */
    public static void m47231j0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static void m47232k0(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: l0 */
    public static void m47233l0(final IntlHideAndSeekRoleView intlHideAndSeekRoleView, View view) {
        intlHideAndSeekRoleView.m47249z0(intlHideAndSeekRoleView.act(), new Function0() { // from class: l.vpn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntlHideAndSeekRoleView.m47239t0(this.f185272a);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public static void m47234m0(IntlHideAndSeekRoleView intlHideAndSeekRoleView) {
        intlHideAndSeekRoleView.height = intlHideAndSeekRoleView.getMeasuredHeight();
    }

    /* JADX INFO: renamed from: n0 */
    public static void m47235n0(IntlHideAndSeekRoleView intlHideAndSeekRoleView, HideAndSeekHoldEnv hideAndSeekHoldEnv) {
        m47240w0(intlHideAndSeekRoleView, hideAndSeekHoldEnv.data, null, 2, null);
    }

    /* JADX INFO: renamed from: o0 */
    public static void m47236o0(IntlHideAndSeekRoleView intlHideAndSeekRoleView) {
        bnl0.m105524M(intlHideAndSeekRoleView, false);
    }

    /* JADX INFO: renamed from: r */
    private final void m47237r() {
        setBackgroundResource(dbc0.f86306K9);
        int i = qa00.f156328o;
        setPadding(i, i, i, i);
    }

    /* JADX INFO: renamed from: s0 */
    private final void m47238s0() {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.tpn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlHideAndSeekRoleView.m47230i0(view);
            }
        });
        bnl0.m105509E0(get_caught(), new View.OnClickListener() { // from class: l.upn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlHideAndSeekRoleView.m47233l0(this.f180299a, view);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public static final Unit m47239t0(IntlHideAndSeekRoleView intlHideAndSeekRoleView) {
        intlHideAndSeekRoleView.m47244q0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ void m47240w0(IntlHideAndSeekRoleView intlHideAndSeekRoleView, HideAndSeekGameRole hideAndSeekGameRole, gqn gqnVar, int i, Object obj) {
        if ((i & 2) != 0) {
            gqnVar = null;
        }
        intlHideAndSeekRoleView.m47247v0(hideAndSeekGameRole, gqnVar);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m47241B0() {
        if (this.roleInfo == null) {
            return;
        }
        bnl0.m105524M(this, true);
        animate().translationY(0.0f).alpha(1.0f).setDuration(200L).start();
        m47240w0(this, this.roleInfo, null, 2, null);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: D0 */
    public final void m47242D0(int count) {
        if (count <= 0 || !NullChecker.m82486a(this.roleInfo)) {
            return;
        }
        HideAndSeekGameRole hideAndSeekGameRole = this.roleInfo;
        if (hideAndSeekGameRole != null) {
            hideAndSeekGameRole.mouseCount = count;
        }
        if (bnl0.m105529O0(this)) {
            get_game_content_subtitle().setText(k3d0.m148007c(R$string.f18328Bb) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + count);
        }
    }

    @Override // android.view.ViewGroup
    public void detachViewFromParent(@Nullable View child) {
        super.detachViewFromParent(child);
    }

    @NotNull
    public final VButton get_caught() {
        VButton vButton = this._caught;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_caught");
        return null;
    }

    @NotNull
    public final VLinear get_count_down() {
        VLinear vLinear = this._count_down;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_count_down");
        return null;
    }

    @NotNull
    public final VText get_count_down_hour_one() {
        VText vText = this._count_down_hour_one;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_count_down_hour_one");
        return null;
    }

    @NotNull
    public final VText get_count_down_hour_two() {
        VText vText = this._count_down_hour_two;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_count_down_hour_two");
        return null;
    }

    @NotNull
    public final VText get_count_down_minute_one() {
        VText vText = this._count_down_minute_one;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_count_down_minute_one");
        return null;
    }

    @NotNull
    public final VText get_count_down_minute_two() {
        VText vText = this._count_down_minute_two;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_count_down_minute_two");
        return null;
    }

    @NotNull
    public final VText get_count_down_second_one() {
        VText vText = this._count_down_second_one;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_count_down_second_one");
        return null;
    }

    @NotNull
    public final VText get_count_down_second_two() {
        VText vText = this._count_down_second_two;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_count_down_second_two");
        return null;
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
    public final VText get_game_content_role() {
        VText vText = this._game_content_role;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_game_content_role");
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
    public final VDraweeView get_role_icon() {
        VDraweeView vDraweeView = this._role_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_role_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p0 */
    public final View m47243p0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM105951b = bqn.m105951b(this, inflater, parent);
        viewM105951b.getClass();
        return viewM105951b;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m47244q0() {
        act().duringCreated(CoreModule.f18264c.f20380d2.m95787l3(CoreModule.m30929H().userId())).subscribe(psd0.m173597H(new y20() { // from class: l.ypn
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlHideAndSeekRoleView.m47235n0(this.f201073a, (HideAndSeekHoldEnv) obj);
            }
        }, new y20() { // from class: l.zpn
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlHideAndSeekRoleView.m47231j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public final void m47245r0() {
        CoreModule.f18264c.f20427t1.m32519u(this.HIDE_AND_SEEK_ROLE_TIMER);
        animate().translationY(this.height / 2.0f).alpha(0.0f).withEndAction(new Runnable() { // from class: l.wpn
            @Override // java.lang.Runnable
            public final void run() {
                IntlHideAndSeekRoleView.m47236o0(this.f190324a);
            }
        }).setDuration(200L).start();
    }

    public final void set_caught(@NotNull VButton vButton) {
        vButton.getClass();
        this._caught = vButton;
    }

    public final void set_count_down(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._count_down = vLinear;
    }

    public final void set_count_down_hour_one(@NotNull VText vText) {
        vText.getClass();
        this._count_down_hour_one = vText;
    }

    public final void set_count_down_hour_two(@NotNull VText vText) {
        vText.getClass();
        this._count_down_hour_two = vText;
    }

    public final void set_count_down_minute_one(@NotNull VText vText) {
        vText.getClass();
        this._count_down_minute_one = vText;
    }

    public final void set_count_down_minute_two(@NotNull VText vText) {
        vText.getClass();
        this._count_down_minute_two = vText;
    }

    public final void set_count_down_second_one(@NotNull VText vText) {
        vText.getClass();
        this._count_down_second_one = vText;
    }

    public final void set_count_down_second_two(@NotNull VText vText) {
        vText.getClass();
        this._count_down_second_two = vText;
    }

    public final void set_game_content(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._game_content = vLinear;
    }

    public final void set_game_content_role(@NotNull VText vText) {
        vText.getClass();
        this._game_content_role = vText;
    }

    public final void set_game_content_subtitle(@NotNull VText vText) {
        vText.getClass();
        this._game_content_subtitle = vText;
    }

    public final void set_role_icon(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._role_icon = vDraweeView;
    }

    @Override // com.p051p1.mobile.putong.core.api.RunnableC4884c0.c
    /* JADX INFO: renamed from: u */
    public void mo32530u(@Nullable String key, long currentTime, long beginTime, long endTime, long registerTime) {
        super.mo32530u(key, currentTime, beginTime, endTime, registerTime);
        m47248y0(endTime - pzi0.m174454o());
    }

    /* JADX INFO: renamed from: u0 */
    public final void m47246u0() {
        this.viewModel = null;
        CoreModule.f18264c.f20427t1.m32519u(this.HIDE_AND_SEEK_ROLE_TIMER);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: v0 */
    public final void m47247v0(@Nullable HideAndSeekGameRole roleInfo, @Nullable gqn viewModel) {
        gqn gqnVar;
        if (roleInfo == null) {
            return;
        }
        if (viewModel != null) {
            this.viewModel = viewModel;
        }
        bnl0.m105524M(this, true);
        this.roleInfo = roleInfo;
        boolean zEquals = TEnum.equals(roleInfo.roleType, GameRole.cat);
        get_role_icon().setActualImageResource(zEquals ? dbc0.f85986A9 : dbc0.f86018B9);
        bnl0.m105524M(get_caught(), !zEquals);
        get_game_content_subtitle().setText(k3d0.m148007c(R$string.f18328Bb) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + roleInfo.mouseCount);
        get_game_content_role().setText(k3d0.m148007c(zEquals ? R$string.f19860zb : R$string.f18297Ab));
        CoreModule.f18264c.f20427t1.m32519u(this.HIDE_AND_SEEK_ROLE_TIMER);
        RunnableC4884c0.a aVar = new RunnableC4884c0.a();
        aVar.m32526g(this.HIDE_AND_SEEK_ROLE_TIMER).m32520a(true).m32525f(roleInfo.endTime).m32523d(this);
        CoreModule.f18264c.f20427t1.m32516r(aVar);
        gqn gqnVar2 = this.viewModel;
        if (gqnVar2 != null) {
            gqnVar2.m131399y(true, roleInfo.roleType);
        }
        post(new Runnable() { // from class: l.xpn
            @Override // java.lang.Runnable
            public final void run() {
                IntlHideAndSeekRoleView.m47234m0(this.f195721a);
            }
        });
        if (!TEnum.equals(roleInfo.gameStage, "end") || (gqnVar = this.viewModel) == null) {
            return;
        }
        gqnVar.m131392n();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m47248y0(long time) {
        long j = time / 1000;
        int iM88489e = C15274a.m88489e(C15274a.m88486b((int) (j / 3600), 0), 99);
        int iM88486b = C15274a.m88486b((int) ((j % 3600) / 60), 0);
        int iM88486b2 = C15274a.m88486b((int) (j % 60), 0);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.ENGLISH, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iM88489e), Integer.valueOf(iM88486b), Integer.valueOf(iM88486b2)}, 3));
        int childCount = get_count_down().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = get_count_down().getChildAt(i);
            childAt.getClass();
            ((VText) childAt).setText(String.valueOf(str.charAt(i)));
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m47249z0(Act act, final Function0<Unit> onConfirm) {
        new th0.C20312a(act).m191151j(k3d0.m148007c(R$string.f19829yb)).m191158q(R$string.f19798xb).m191156o(new View.OnClickListener() { // from class: l.aqn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlHideAndSeekRoleView.m47232k0(onConfirm, view);
            }
        }).m191146e(R$string.f18359Cb).m191142a().m191141g();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntlHideAndSeekRoleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntlHideAndSeekRoleView(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
