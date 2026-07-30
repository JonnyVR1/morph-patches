package com.p000p1.mobile.putong.core.p002ui.intloperation.quiz;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p000p1.mobile.putong.core.p002ui.intloperation.quiz.C0430a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.IntlMarketConfigData;
import com.p1.mobile.putong.core.data.IntlMarketQuestionData;
import com.p1.mobile.putong.core.data.IntlMarketResponseOptionData;
import com.p1.mobile.putong.core.data.IntlMarketSummaryData;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundButton;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundConstraintLayout;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import com.tantanapp.common.utils.CrashHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.b8p;
import l.k7p;
import l.l5j0;
import l.nvc0;
import l.qib0;
import l.xdl0;
import l.ym2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.i0e;
import p009l.tvl;
import v.VDraweeView;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intloperation.quiz.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0014\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010&\u001a\u0004\b5\u0010(\"\u0004\b6\u0010*R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010.\u001a\u0004\bA\u00100\"\u0004\bB\u00102R\"\u0010J\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0016\u0010M\u001a\u00020K8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u0010L¨\u0006N"}, d2 = {"Lcom/p1/mobile/putong/core/ui/intloperation/quiz/a;", "Ll/tvl;", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "i", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "Lcom/p1/mobile/putong/core/data/IntlMarketResponseOptionData;", "quizOption", "", "source", "", "r", "(Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;Lcom/p1/mobile/putong/core/data/IntlMarketResponseOptionData;I)V", "Lcom/p1/mobile/putong/core/data/IntlMarketQuestionData;", "quizQuestion", "Lcom/p1/mobile/putong/core/data/IntlMarketSummaryData;", "summary", "q", "(Lcom/p1/mobile/putong/core/data/IntlMarketQuestionData;Lcom/p1/mobile/putong/core/data/IntlMarketSummaryData;Lcom/p1/mobile/putong/core/data/IntlMarketResponseOptionData;)V", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "c", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "o", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "set_root_layout", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;)V", "_root_layout", "Lv/VDraweeView;", "d", "Lv/VDraweeView;", "k", "()Lv/VDraweeView;", "set_bg_img", "(Lv/VDraweeView;)V", "_bg_img", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "p", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "f", "j", "set_activity_icon", "_activity_icon", "Landroid/widget/ImageView;", "g", "Landroid/widget/ImageView;", "m", "()Landroid/widget/ImageView;", "set_bt_close", "(Landroid/widget/ImageView;)V", "_bt_close", "h", "n", "set_desc", "_desc", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "l", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "set_bt", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;)V", "_bt", "Ll/l5j0;", "Ll/l5j0;", "dialog", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C0430a extends tvl {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public RoundConstraintLayout _root_layout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _bg_img;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VDraweeView _activity_icon;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public ImageView _bt_close;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public TextView _desc;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public RoundButton _bt;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public l5j0 dialog;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intloperation.quiz.a$a */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/p1/mobile/putong/core/ui/intloperation/quiz/a$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "(Landroid/view/View;I)V", "", "onSlide", "(Landroid/view/View;F)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior<FrameLayout> f6841a;

        public a(BottomSheetBehavior<FrameLayout> bottomSheetBehavior) {
            this.f6841a = bottomSheetBehavior;
        }

        public void onSlide(View p0, float p1) {
            p0.getClass();
        }

        public void onStateChanged(View p0, int p1) {
            p0.getClass();
            if (p1 == 1) {
                this.f6841a.setState(3);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0430a(@NotNull Act act) {
        super(act);
        act.getClass();
    }

    /* JADX INFO: renamed from: e */
    public static void m8409e(C0430a c0430a, IntlMarketQuestionData intlMarketQuestionData, View view) {
        b8p.INSTANCE.g();
        c0430a.getAct().startActivityWithCustomTransition(IntlQuizAct.INSTANCE.m8408a(c0430a.getAct(), intlMarketQuestionData), new MatchAct.b());
        l5j0 l5j0Var = c0430a.dialog;
        if (l5j0Var == null) {
            Intrinsics.r("dialog");
            l5j0Var = null;
        }
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: h */
    public static void m8412h(C0430a c0430a, View view) {
        l5j0 l5j0Var = c0430a.dialog;
        if (l5j0Var == null) {
            Intrinsics.r("dialog");
            l5j0Var = null;
        }
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: s */
    public static final void m8413s(C0430a c0430a, DialogInterface dialogInterface) {
        i0e.m16064e(c0430a.m22677d());
    }

    /* JADX INFO: renamed from: t */
    public static final void m8414t(C0430a c0430a) {
        c0430a.m8417k().getLayoutParams().height = c0430a.m8421o().getHeight();
        c0430a.m8417k().setLayoutParams(c0430a.m8417k().getLayoutParams());
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final View m8415i(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = k7p.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VDraweeView m8416j() {
        VDraweeView vDraweeView = this._activity_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_activity_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VDraweeView m8417k() {
        VDraweeView vDraweeView = this._bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final RoundButton m8418l() {
        RoundButton roundButton = this._bt;
        if (roundButton != null) {
            return roundButton;
        }
        Intrinsics.r("_bt");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final ImageView m8419m() {
        ImageView imageView = this._bt_close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_bt_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final TextView m8420n() {
        TextView textView = this._desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final RoundConstraintLayout m8421o() {
        RoundConstraintLayout roundConstraintLayout = this._root_layout;
        if (roundConstraintLayout != null) {
            return roundConstraintLayout;
        }
        Intrinsics.r("_root_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final TextView m8422p() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_title");
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m8423q(final IntlMarketQuestionData quizQuestion, IntlMarketSummaryData summary, IntlMarketResponseOptionData quizOption) {
        if (!TextUtils.isEmpty(summary.bg_color)) {
            m8421o().setBackgroundColor(Color.parseColor(summary.bg_color));
        }
        qib0.G.O0(m8417k(), summary.bg_url, true, false, (nvc0) null, (ym2) null);
        m8418l().setText(summary.confirm_btn_desc);
        m8420n().setText(summary.sub_title);
        m8422p().setText(summary.main_title);
        if (quizOption != null) {
            if (!TextUtils.isEmpty(quizOption.desc_in_popup)) {
                m8420n().setText(quizOption.desc_in_popup);
            }
            String str = !TextUtils.isEmpty(quizOption.option_image_url) ? quizOption.option_image_url : summary.logo_url;
            str.getClass();
            qib0.G.O0(m8416j(), str, true, false, (nvc0) null, (ym2) null);
        }
        xdl0.E0(m8419m(), new View.OnClickListener() { // from class: l.i7p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0430a.m8412h(this.f14434a, view);
            }
        });
        xdl0.E0(m8418l(), new View.OnClickListener() { // from class: l.j7p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0430a.m8409e(this.f14978a, quizQuestion, view);
            }
        });
        try {
            if (!TextUtils.isEmpty(summary.confirm_btn_color)) {
                m8418l().setBackgroundColor(Color.parseColor(summary.confirm_btn_color));
            }
            if (!TextUtils.isEmpty(summary.confirm_btn_font_color)) {
                m8418l().setTextColor(Color.parseColor(summary.confirm_btn_font_color));
            }
            if (!TextUtils.isEmpty(summary.main_title_font_color)) {
                m8422p().setTextColor(Color.parseColor(summary.main_title_font_color));
            }
            if (TextUtils.isEmpty(summary.sub_title_font_color)) {
                return;
            }
            m8420n().setTextColor(Color.parseColor(summary.sub_title_font_color));
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m8424r(@Nullable IntlMarketConfigData data, @Nullable IntlMarketResponseOptionData quizOption, int source) {
        if (data != null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getAct());
            layoutInflaterFrom.getClass();
            Dialog dialog = null;
            BottomSheetDialog bottomSheetDialogM22676c = m22676c(getAct(), m8415i(layoutInflaterFrom, null));
            this.dialog = bottomSheetDialogM22676c;
            if (bottomSheetDialogM22676c == null) {
                Intrinsics.r("dialog");
                bottomSheetDialogM22676c = null;
            }
            bottomSheetDialogM22676c.setCancelable(false);
            BottomSheetDialog bottomSheetDialog = this.dialog;
            if (bottomSheetDialog == null) {
                Intrinsics.r("dialog");
                bottomSheetDialog = null;
            }
            BottomSheetBehavior behavior = bottomSheetDialog.getBehavior();
            behavior.getClass();
            behavior.addBottomSheetCallback(new a(behavior));
            behavior.setHideable(false);
            IntlMarketQuestionData intlMarketQuestionData = data.quiz_question;
            intlMarketQuestionData.getClass();
            IntlMarketSummaryData intlMarketSummaryData = data.quiz_summary;
            intlMarketSummaryData.getClass();
            m8423q(intlMarketQuestionData, intlMarketSummaryData, quizOption);
            Dialog dialog2 = this.dialog;
            if (dialog2 == null) {
                Intrinsics.r("dialog");
                dialog2 = null;
            }
            dialog2.show();
            i0e.m16065f(m22677d());
            Dialog dialog3 = this.dialog;
            if (dialog3 == null) {
                Intrinsics.r("dialog");
            } else {
                dialog = dialog3;
            }
            dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.g7p
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C0430a.m8413s(this.f13363a, dialogInterface);
                }
            });
            m8421o().post(new Runnable() { // from class: l.h7p
                @Override // java.lang.Runnable
                public final void run() {
                    C0430a.m8414t(this.f13895a);
                }
            });
        }
    }
}
