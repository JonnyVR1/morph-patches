package com.p000p1.mobile.putong.core.p001ui.hideandseek;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.data.GameRole;
import com.p000p1.mobile.putong.core.data.GameStage;
import com.p000p1.mobile.putong.core.data.HideAndSeekGameRole;
import com.p000p1.mobile.putong.core.data.HideAndSeekHoldEnv;
import com.p000p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.p001ui.hideandseek.IntlHideAndSeekRoleView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.c0;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.a;
import l.e30;
import l.hvc0;
import l.mkd0;
import l.mqi0;
import l.o7r;
import l.t100;
import l.x2c0;
import l.xdl0;
import l.xh0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003l.bon;
import p003l.gon;
import v.VButton;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010!H\u0014¢\u0006\u0004\b%\u0010&J%\u0010+\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H\u0007¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\r¢\u0006\u0004\b-\u0010\u000fJ\r\u0010.\u001a\u00020\r¢\u0006\u0004\b.\u0010\u000fJ9\u00105\u001a\u00020\r2\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u00101\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u0015H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\r2\u0006\u00107\u001a\u00020\nH\u0007¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\r¢\u0006\u0004\b:\u0010\u000fR\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010V\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010M\u001a\u0004\bT\u0010O\"\u0004\bU\u0010QR\"\u0010Z\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010E\u001a\u0004\bX\u0010G\"\u0004\bY\u0010IR\"\u0010^\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010M\u001a\u0004\b\\\u0010O\"\u0004\b]\u0010QR\"\u0010b\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010M\u001a\u0004\b`\u0010O\"\u0004\ba\u0010QR\"\u0010f\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010M\u001a\u0004\bd\u0010O\"\u0004\be\u0010QR\"\u0010j\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010M\u001a\u0004\bh\u0010O\"\u0004\bi\u0010QR\"\u0010n\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010M\u001a\u0004\bl\u0010O\"\u0004\bm\u0010QR\"\u0010r\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010M\u001a\u0004\bp\u0010O\"\u0004\bq\u0010QR\"\u0010z\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u0014\u0010}\u001a\u00020/8\u0002X\u0082D¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0015\u0010\u0080\u0001\u001a\u00020/8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010|R\u0019\u0010\u0083\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001¨\u0006\u0086\u0001"}, d2 = {"Lcom/p1/mobile/putong/core/ui/hideandseek/IntlHideAndSeekRoleView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/p1/mobile/putong/core/api/c0$c;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "r", "()V", "s0", "q0", "Lcom/p1/mobile/android/app/Act;", "act", "()Lcom/p1/mobile/android/app/Act;", "", "time", "y0", "(J)V", "Lkotlin/Function0;", "onConfirm", "z0", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "p0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "child", "detachViewFromParent", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/core/data/HideAndSeekGameRole;", "roleInfo", "Ll/gon;", "viewModel", "v0", "(Lcom/p1/mobile/putong/core/data/HideAndSeekGameRole;Ll/gon;)V", "r0", "B0", "", "key", "currentTime", "beginTime", "endTime", "registerTime", "u", "(Ljava/lang/String;JJJJ)V", "count", "D0", "(I)V", "u0", "Lv/VDraweeView;", "d", "Lv/VDraweeView;", "get_role_icon", "()Lv/VDraweeView;", "set_role_icon", "(Lv/VDraweeView;)V", "_role_icon", "Lv/VLinear;", "e", "Lv/VLinear;", "get_game_content", "()Lv/VLinear;", "set_game_content", "(Lv/VLinear;)V", "_game_content", "Lv/VText;", "f", "Lv/VText;", "get_game_content_role", "()Lv/VText;", "set_game_content_role", "(Lv/VText;)V", "_game_content_role", "g", "get_game_content_subtitle", "set_game_content_subtitle", "_game_content_subtitle", "h", "get_count_down", "set_count_down", "_count_down", "i", "get_count_down_hour_one", "set_count_down_hour_one", "_count_down_hour_one", "j", "get_count_down_hour_two", "set_count_down_hour_two", "_count_down_hour_two", "k", "get_count_down_minute_one", "set_count_down_minute_one", "_count_down_minute_one", "l", "get_count_down_minute_two", "set_count_down_minute_two", "_count_down_minute_two", "m", "get_count_down_second_one", "set_count_down_second_one", "_count_down_second_one", "n", "get_count_down_second_two", "set_count_down_second_two", "_count_down_second_two", "Lv/VButton;", "o", "Lv/VButton;", "get_caught", "()Lv/VButton;", "set_caught", "(Lv/VButton;)V", "_caught", "p", "Ljava/lang/String;", "TAG", "q", "Lcom/p1/mobile/putong/core/data/HideAndSeekGameRole;", "HIDE_AND_SEEK_ROLE_TIMER", "s", "I", ProfileLikeCategoryType.height, "t", "Ll/gon;", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
@SourceDebugExtension
public final class IntlHideAndSeekRoleView extends ConstraintLayout implements c0.c {

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
    public gon viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IntlHideAndSeekRoleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.TAG = "IntlHideAndSeekRoleView";
        this.HIDE_AND_SEEK_ROLE_TIMER = "hide_and_seek_role_timer";
        LayoutInflater layoutInflaterA = o7r.a(getContext());
        layoutInflaterA.getClass();
        m3420p0(layoutInflaterA, this);
        m3414r();
        m3415s0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Act act() {
        Act context = getContext();
        context.getClass();
        return context;
    }

    /* JADX INFO: renamed from: i0 */
    public static void m3407i0(View view) {
    }

    /* JADX INFO: renamed from: j0 */
    public static void m3408j0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static void m3409k0(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: l0 */
    public static void m3410l0(final IntlHideAndSeekRoleView intlHideAndSeekRoleView, View view) {
        intlHideAndSeekRoleView.m3427z0(intlHideAndSeekRoleView.act(), new Function0() { // from class: l.vnn
            public final Object invoke() {
                return IntlHideAndSeekRoleView.m3416t0(this.f8008a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public static void m3411m0(IntlHideAndSeekRoleView intlHideAndSeekRoleView) {
        intlHideAndSeekRoleView.height = intlHideAndSeekRoleView.getMeasuredHeight();
    }

    /* JADX INFO: renamed from: n0 */
    public static void m3412n0(IntlHideAndSeekRoleView intlHideAndSeekRoleView, HideAndSeekHoldEnv hideAndSeekHoldEnv) {
        m3417w0(intlHideAndSeekRoleView, hideAndSeekHoldEnv.data, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public static void m3413o0(IntlHideAndSeekRoleView intlHideAndSeekRoleView) {
        xdl0.M(intlHideAndSeekRoleView, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private final void m3414r() {
        setBackgroundResource(x2c0.J9);
        int i = t100.o;
        setPadding(i, i, i, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0 */
    private final void m3415s0() {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.tnn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlHideAndSeekRoleView.m3407i0(view);
            }
        });
        xdl0.E0(get_caught(), new View.OnClickListener() { // from class: l.unn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlHideAndSeekRoleView.m3410l0(this.f7780a, view);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public static final Unit m3416t0(IntlHideAndSeekRoleView intlHideAndSeekRoleView) {
        intlHideAndSeekRoleView.m3421q0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ void m3417w0(IntlHideAndSeekRoleView intlHideAndSeekRoleView, HideAndSeekGameRole hideAndSeekGameRole, gon gonVar, int i, Object obj) {
        if ((i & 2) != 0) {
            gonVar = null;
        }
        intlHideAndSeekRoleView.m3425v0(hideAndSeekGameRole, gonVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B0 */
    public final void m3418B0() {
        if (this.roleInfo == null) {
            return;
        }
        xdl0.M(this, true);
        animate().translationY(0.0f).alpha(1.0f).setDuration(200L).start();
        m3417w0(this, this.roleInfo, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: D0 */
    public final void m3419D0(int count) {
        if (count <= 0 || !NullChecker.a(this.roleInfo)) {
            return;
        }
        HideAndSeekGameRole hideAndSeekGameRole = this.roleInfo;
        if (hideAndSeekGameRole != null) {
            hideAndSeekGameRole.mouseCount = count;
        }
        if (xdl0.O0(this)) {
            get_game_content_subtitle().setText(hvc0.c(R.string.mb) + " " + count);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void detachViewFromParent(@Nullable View child) {
        super/*android.view.ViewGroup*/.detachViewFromParent(child);
    }

    @NotNull
    public final VButton get_caught() {
        VButton vButton = this._caught;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_caught");
        return null;
    }

    @NotNull
    public final VLinear get_count_down() {
        VLinear vLinear = this._count_down;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_count_down");
        return null;
    }

    @NotNull
    public final VText get_count_down_hour_one() {
        VText vText = this._count_down_hour_one;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_count_down_hour_one");
        return null;
    }

    @NotNull
    public final VText get_count_down_hour_two() {
        VText vText = this._count_down_hour_two;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_count_down_hour_two");
        return null;
    }

    @NotNull
    public final VText get_count_down_minute_one() {
        VText vText = this._count_down_minute_one;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_count_down_minute_one");
        return null;
    }

    @NotNull
    public final VText get_count_down_minute_two() {
        VText vText = this._count_down_minute_two;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_count_down_minute_two");
        return null;
    }

    @NotNull
    public final VText get_count_down_second_one() {
        VText vText = this._count_down_second_one;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_count_down_second_one");
        return null;
    }

    @NotNull
    public final VText get_count_down_second_two() {
        VText vText = this._count_down_second_two;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_count_down_second_two");
        return null;
    }

    @NotNull
    public final VLinear get_game_content() {
        VLinear vLinear = this._game_content;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_game_content");
        return null;
    }

    @NotNull
    public final VText get_game_content_role() {
        VText vText = this._game_content_role;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_game_content_role");
        return null;
    }

    @NotNull
    public final VText get_game_content_subtitle() {
        VText vText = this._game_content_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_game_content_subtitle");
        return null;
    }

    @NotNull
    public final VDraweeView get_role_icon() {
        VDraweeView vDraweeView = this._role_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_role_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p0 */
    public final View m3420p0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM5776b = bon.m5776b(this, inflater, parent);
        viewM5776b.getClass();
        return viewM5776b;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m3421q0() {
        act().duringCreated(CoreModule.c.d2.l3(CoreModule.H().userId())).subscribe(mkd0.H(new e30() { // from class: l.ynn
            public final void call(Object obj) {
                IntlHideAndSeekRoleView.m3412n0(this.f9090a, (HideAndSeekHoldEnv) obj);
            }
        }, new e30() { // from class: l.znn
            public final void call(Object obj) {
                IntlHideAndSeekRoleView.m3408j0((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public final void m3422r0() {
        CoreModule.c.t1.u(this.HIDE_AND_SEEK_ROLE_TIMER);
        animate().translationY(this.height / 2.0f).alpha(0.0f).withEndAction(new Runnable() { // from class: l.wnn
            @Override // java.lang.Runnable
            public final void run() {
                IntlHideAndSeekRoleView.m3413o0(this.f8209a);
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

    /* JADX INFO: renamed from: u */
    public void m3423u(@Nullable String key, long currentTime, long beginTime, long endTime, long registerTime) {
        super.u(key, currentTime, beginTime, endTime, registerTime);
        m3426y0(endTime - mqi0.o());
    }

    /* JADX INFO: renamed from: u0 */
    public final void m3424u0() {
        this.viewModel = null;
        CoreModule.c.t1.u(this.HIDE_AND_SEEK_ROLE_TIMER);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: v0 */
    public final void m3425v0(@Nullable HideAndSeekGameRole roleInfo, @Nullable gon viewModel) {
        gon gonVar;
        if (roleInfo == null) {
            return;
        }
        if (viewModel != null) {
            this.viewModel = viewModel;
        }
        xdl0.M(this, true);
        this.roleInfo = roleInfo;
        boolean zEquals = TEnum.equals(roleInfo.roleType, GameRole.cat);
        get_role_icon().setActualImageResource(zEquals ? x2c0.z9 : x2c0.A9);
        xdl0.M(get_caught(), !zEquals);
        get_game_content_subtitle().setText(hvc0.c(R.string.mb) + " " + roleInfo.mouseCount);
        get_game_content_role().setText(hvc0.c(zEquals ? R.string.kb : R.string.lb));
        CoreModule.c.t1.u(this.HIDE_AND_SEEK_ROLE_TIMER);
        c0.a aVar = new c0.a();
        aVar.g(this.HIDE_AND_SEEK_ROLE_TIMER).a(true).f(roleInfo.endTime).d(this);
        CoreModule.c.t1.r(aVar);
        gon gonVar2 = this.viewModel;
        if (gonVar2 != null) {
            gonVar2.m6803y(true, roleInfo.roleType);
        }
        post(new Runnable() { // from class: l.xnn
            @Override // java.lang.Runnable
            public final void run() {
                IntlHideAndSeekRoleView.m3411m0(this.f8553a);
            }
        });
        if (!TEnum.equals(roleInfo.gameStage, GameStage.end) || (gonVar = this.viewModel) == null) {
            return;
        }
        gonVar.m6796n();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m3426y0(long time) {
        long j = time / 1000;
        int iE = a.e(a.b((int) (j / 3600), 0), 99);
        int iB = a.b((int) ((j % 3600) / 60), 0);
        int iB2 = a.b((int) (j % 60), 0);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.ENGLISH, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iE), Integer.valueOf(iB), Integer.valueOf(iB2)}, 3));
        int childCount = get_count_down().getChildCount();
        for (int i = 0; i < childCount; i++) {
            VText childAt = get_count_down().getChildAt(i);
            childAt.getClass();
            childAt.setText(String.valueOf(str.charAt(i)));
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m3427z0(Act act, final Function0<Unit> onConfirm) {
        new xh0.a(act).j(hvc0.c(R.string.jb)).q(R.string.ib).o(new View.OnClickListener() { // from class: l.aon
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlHideAndSeekRoleView.m3409k0(onConfirm, view);
            }
        }).e(R.string.nb).a().g();
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
