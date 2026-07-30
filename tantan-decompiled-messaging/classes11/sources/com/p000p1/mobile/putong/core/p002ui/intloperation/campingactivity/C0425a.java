package com.p000p1.mobile.putong.core.p002ui.intloperation.campingactivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.p002ui.intloperation.campingactivity.C0425a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.IntlCampingConfigData;
import com.p1.mobile.putong.core.data.IntlCampingQuestionsData;
import com.p1.mobile.putong.core.data.IntlCampingSummaryData;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundButton;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundConstraintLayout;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.cwf0;
import l.e51;
import l.er2;
import l.k3n;
import l.l5j0;
import l.qib0;
import l.v7c0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.i0e;
import v.VDraweeView;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intloperation.campingactivity.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00106\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R\"\u0010:\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u0010-\u001a\u0004\b8\u0010/\"\u0004\b9\u00101R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010I\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010P\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0016\u0010S\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR\u001b\u0010W\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010U\u001a\u0004\bQ\u0010V¨\u0006X"}, d2 = {"Lcom/p1/mobile/putong/core/ui/intloperation/campingactivity/a;", "", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "g", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/IntlCampingConfigData;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "", "source", "", "s", "(Lcom/p1/mobile/putong/core/data/IntlCampingConfigData;I)V", "Lcom/p1/mobile/putong/core/data/IntlCampingSummaryData;", "summary", "", "Lcom/p1/mobile/putong/core/data/IntlCampingQuestionsData;", "questions", "q", "(Lcom/p1/mobile/putong/core/data/IntlCampingSummaryData;Ljava/util/List;)V", "rootView", "Ll/l5j0;", "h", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Ll/l5j0;", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "b", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "o", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "set_root_layout", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;)V", "_root_layout", "Lv/VDraweeView;", "c", "Lv/VDraweeView;", "k", "()Lv/VDraweeView;", "set_bg_img", "(Lv/VDraweeView;)V", "_bg_img", "d", "p", "set_title_img", "_title_img", "e", "j", "set_activity_icon", "_activity_icon", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "m", "()Landroid/widget/ImageView;", "set_bt_close", "(Landroid/widget/ImageView;)V", "_bt_close", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "n", "()Landroid/widget/TextView;", "set_desc", "(Landroid/widget/TextView;)V", "_desc", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "l", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "set_bt", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;)V", "_bt", "i", "Ll/l5j0;", "dialog", "Ll/cwf0;", "Lkotlin/Lazy;", "()Ll/cwf0;", "pageHelp", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C0425a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public RoundConstraintLayout _root_layout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VDraweeView _bg_img;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _title_img;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VDraweeView _activity_icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public ImageView _bt_close;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public TextView _desc;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public RoundButton _bt;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public l5j0 dialog;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageHelp;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intloperation.campingactivity.a$a */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/p1/mobile/putong/core/ui/intloperation/campingactivity/a$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "(Landroid/view/View;I)V", "", "onSlide", "(Landroid/view/View;F)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l5j0 f6811a;

        public a(l5j0 l5j0Var) {
            this.f6811a = l5j0Var;
        }

        public void onSlide(View p0, float p1) {
            p0.getClass();
        }

        public void onStateChanged(View p0, int p1) {
            p0.getClass();
            if (p1 == 4) {
                this.f6811a.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intloperation.campingactivity.a$b */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/p1/mobile/putong/core/ui/intloperation/campingactivity/a$b", "Ll/er2;", "", "pageId", "()Ljava/lang/String;", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends er2 {
        public String pageId() {
            return "p_activities_pets_page";
        }
    }

    public C0425a(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.pageHelp = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.e3n
            public final Object invoke() {
                return C0425a.m8350f();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static void m8346b(final C0425a c0425a, View view) {
        C0426b.INSTANCE.m8377l();
        Act act = c0425a.act;
        act.startActivityWithCustomTransition(IntlCampingAct.Companion.m8336b(IntlCampingAct.INSTANCE, act, null, 2, null), new MatchAct.b());
        e51.H(c0425a.act, new Runnable() { // from class: l.j3n
            @Override // java.lang.Runnable
            public final void run() {
                C0425a.m8351r(this.f14929a);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: c */
    public static void m8347c(C0425a c0425a, View view) {
        l5j0 l5j0Var = c0425a.dialog;
        if (l5j0Var == null) {
            Intrinsics.r("dialog");
            l5j0Var = null;
        }
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: f */
    public static cwf0 m8350f() {
        return new cwf0(new b());
    }

    /* JADX INFO: renamed from: r */
    public static final void m8351r(C0425a c0425a) {
        Dialog dialog = c0425a.dialog;
        l5j0 l5j0Var = null;
        if (dialog == null) {
            Intrinsics.r("dialog");
            dialog = null;
        }
        if (dialog.isShowing()) {
            l5j0 l5j0Var2 = c0425a.dialog;
            if (l5j0Var2 == null) {
                Intrinsics.r("dialog");
            } else {
                l5j0Var = l5j0Var2;
            }
            l5j0Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m8352t(C0425a c0425a, DialogInterface dialogInterface) {
        i0e.m16064e(c0425a.m8356i());
    }

    /* JADX INFO: renamed from: u */
    public static final void m8353u(C0425a c0425a) {
        c0425a.m8358k().getLayoutParams().height = c0425a.m8362o().getHeight();
        c0425a.m8358k().setLayoutParams(c0425a.m8358k().getLayoutParams());
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final View m8354g(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = k3n.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: h */
    public final l5j0 m8355h(Act act, View rootView) {
        l5j0 l5j0Var = new l5j0(act, v7c0.d);
        l5j0Var.setContentView(rootView);
        l5j0Var.setCancelable(true);
        l5j0Var.getBehavior().setState(3);
        l5j0Var.getBehavior().setPeekHeight(0);
        l5j0Var.getBehavior().setSkipCollapsed(true);
        l5j0Var.getBehavior().addBottomSheetCallback(new a(l5j0Var));
        return l5j0Var;
    }

    /* JADX INFO: renamed from: i */
    public final cwf0 m8356i() {
        return (cwf0) this.pageHelp.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VDraweeView m8357j() {
        VDraweeView vDraweeView = this._activity_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_activity_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VDraweeView m8358k() {
        VDraweeView vDraweeView = this._bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final RoundButton m8359l() {
        RoundButton roundButton = this._bt;
        if (roundButton != null) {
            return roundButton;
        }
        Intrinsics.r("_bt");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final ImageView m8360m() {
        ImageView imageView = this._bt_close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_bt_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final TextView m8361n() {
        TextView textView = this._desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final RoundConstraintLayout m8362o() {
        RoundConstraintLayout roundConstraintLayout = this._root_layout;
        if (roundConstraintLayout != null) {
            return roundConstraintLayout;
        }
        Intrinsics.r("_root_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VDraweeView m8363p() {
        VDraweeView vDraweeView = this._title_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_title_img");
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m8364q(IntlCampingSummaryData summary, List<? extends IntlCampingQuestionsData> questions) {
        qib0.G.S0(m8358k(), summary.bg_url);
        qib0.G.S0(m8363p(), summary.heading_url);
        qib0.G.S0(m8357j(), summary.logo_url);
        xdl0.E0(m8360m(), new View.OnClickListener() { // from class: l.h3n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0425a.m8347c(this.f13852a, view);
            }
        });
        xdl0.E0(m8359l(), new View.OnClickListener() { // from class: l.i3n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0425a.m8346b(this.f14388a, view);
            }
        });
        try {
            m8361n().setText(summary.desc);
            m8361n().setTextColor(Color.parseColor(summary.desc_font_color));
            m8359l().setText(summary.start_btn_desc);
            m8359l().setTextColor(Color.parseColor(summary.btn_font_color));
            m8359l().setBackgroundColor(Color.parseColor(summary.btn_bg_color));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m8365s(@Nullable IntlCampingConfigData data, int source) {
        if (data != null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.act);
            layoutInflaterFrom.getClass();
            Dialog dialog = null;
            this.dialog = m8355h(this.act, m8354g(layoutInflaterFrom, null));
            IntlCampingSummaryData intlCampingSummaryData = data.summary;
            intlCampingSummaryData.getClass();
            List<? extends IntlCampingQuestionsData> list = data.questions;
            list.getClass();
            m8364q(intlCampingSummaryData, list);
            C0426b.INSTANCE.m8371e(source);
            Dialog dialog2 = this.dialog;
            if (dialog2 == null) {
                Intrinsics.r("dialog");
                dialog2 = null;
            }
            dialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.f3n
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C0425a.m8352t(this.f12763a, dialogInterface);
                }
            });
            i0e.m16065f(m8356i());
            Dialog dialog3 = this.dialog;
            if (dialog3 == null) {
                Intrinsics.r("dialog");
            } else {
                dialog = dialog3;
            }
            dialog.show();
            m8362o().post(new Runnable() { // from class: l.g3n
                @Override // java.lang.Runnable
                public final void run() {
                    C0425a.m8353u(this.f13301a);
                }
            });
        }
    }
}
