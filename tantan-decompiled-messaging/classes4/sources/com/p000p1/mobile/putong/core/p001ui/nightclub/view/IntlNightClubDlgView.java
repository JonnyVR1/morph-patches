package com.p000p1.mobile.putong.core.p001ui.nightclub.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.p001ui.nightclub.view.IntlNightClubDlgView;
import com.p1.mobile.android.app.Act;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.rzb0;
import l.too;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.gj40;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u000eJ+\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010&\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\"\u0010*\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R\"\u0010.\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/p1/mobile/putong/core/ui/nightclub/view/IntlNightClubDlgView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "r", "()V", "onFinishInflate", "", "uid", "clubId", "Lkotlin/Function0;", "close", "k0", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "view", "j0", "(Landroid/view/View;)V", "Lv/VText;", "d", "Lv/VText;", "get_pop_title", "()Lv/VText;", "set_pop_title", "(Lv/VText;)V", "_pop_title", "e", "get_pop_content", "set_pop_content", "_pop_content", "f", "get_pop_confirm", "set_pop_confirm", "_pop_confirm", "g", "get_pop_cancel", "set_pop_cancel", "_pop_cancel", "Lcom/tantan/library/svga/SVGAnimationView;", "h", "Lcom/tantan/library/svga/SVGAnimationView;", "get_match_anim", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_match_anim", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_match_anim", "Landroid/widget/Space;", "i", "Landroid/widget/Space;", "get_space", "()Landroid/widget/Space;", "set_space", "(Landroid/widget/Space;)V", "_space", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntlNightClubDlgView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _pop_title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _pop_content;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _pop_confirm;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _pop_cancel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public SVGAnimationView _match_anim;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public Space _space;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntlNightClubDlgView(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public static void m538h0(IntlNightClubDlgView intlNightClubDlgView, Function0 function0, String str, View view) {
        zvf0.r("e_intl_mkt_twclub_popup_btn", "p_intl_mkt_twclub_popup");
        Act context = intlNightClubDlgView.getContext();
        if (context != null) {
            context.startActivity(NightClubUserDetailAct.m545Y1(intlNightClubDlgView.getContext(), str));
            context.overridePendingTransition(rzb0.y, rzb0.q);
        }
        function0.invoke();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m539i0(String str, Function0 function0, View view) {
        gj40.INSTANCE.m13847p(str);
        function0.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private final void m540r() {
        if (get_match_anim().isAnimating()) {
            return;
        }
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/e245fa06-28a3-4552-9890-9d90a520572514.svga").repeatCount(1).autoPlay(true).into(get_match_anim());
    }

    @NotNull
    public final SVGAnimationView get_match_anim() {
        SVGAnimationView sVGAnimationView = this._match_anim;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_match_anim");
        return null;
    }

    @NotNull
    public final VText get_pop_cancel() {
        VText vText = this._pop_cancel;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_pop_cancel");
        return null;
    }

    @NotNull
    public final VText get_pop_confirm() {
        VText vText = this._pop_confirm;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_pop_confirm");
        return null;
    }

    @NotNull
    public final VText get_pop_content() {
        VText vText = this._pop_content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_pop_content");
        return null;
    }

    @NotNull
    public final VText get_pop_title() {
        VText vText = this._pop_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_pop_title");
        return null;
    }

    @NotNull
    public final Space get_space() {
        Space space = this._space;
        if (space != null) {
            return space;
        }
        Intrinsics.r("_space");
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m541j0(View view) {
        too.a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m542k0(@NotNull final String uid, @NotNull final String clubId, @NotNull final Function0<Unit> close) {
        uid.getClass();
        clubId.getClass();
        close.getClass();
        xdl0.E0(get_pop_confirm(), new View.OnClickListener() { // from class: l.roo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlNightClubDlgView.m538h0(this.f18625a, close, uid, view);
            }
        });
        xdl0.E0(get_pop_cancel(), new View.OnClickListener() { // from class: l.soo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlNightClubDlgView.m539i0(clubId, close, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m541j0(this);
        m540r();
    }

    public final void set_match_anim(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._match_anim = sVGAnimationView;
    }

    public final void set_pop_cancel(@NotNull VText vText) {
        vText.getClass();
        this._pop_cancel = vText;
    }

    public final void set_pop_confirm(@NotNull VText vText) {
        vText.getClass();
        this._pop_confirm = vText;
    }

    public final void set_pop_content(@NotNull VText vText) {
        vText.getClass();
        this._pop_content = vText;
    }

    public final void set_pop_title(@NotNull VText vText) {
        vText.getClass();
        this._pop_title = vText;
    }

    public final void set_space(@NotNull Space space) {
        space.getClass();
        this._space = space;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntlNightClubDlgView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlNightClubDlgView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
