package com.p051p1.mobile.putong.core.p058ui.intloperation.quiz;

import android.content.DialogInterface;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.IntlMarketConfigData;
import com.p051p1.mobile.putong.core.data.IntlMarketQuestionData;
import com.p051p1.mobile.putong.core.data.IntlMarketResponseOptionData;
import com.p051p1.mobile.putong.core.data.IntlMarketSummaryData;
import com.p051p1.mobile.putong.core.p058ui.intloperation.quiz.C8549a;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundButton;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundConstraintLayout;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p153l.bap;
import p153l.bnl0;
import p153l.k9p;
import p153l.lyl;
import p153l.pej0;
import p153l.uqb0;
import p153l.w1e;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intloperation.quiz.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0014\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010&\u001a\u0004\b5\u0010(\"\u0004\b6\u0010*R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010.\u001a\u0004\bA\u00100\"\u0004\bB\u00102R\"\u0010J\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0016\u0010M\u001a\u00020K8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u0010L¨\u0006N"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/intloperation/quiz/a;", "Ll/lyl;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", RXScreenCaptureService.KEY_INDEX, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;", "data", "Lcom/p1/mobile/putong/core/data/IntlMarketResponseOptionData;", "quizOption", "", "source", "", "r", "(Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;Lcom/p1/mobile/putong/core/data/IntlMarketResponseOptionData;I)V", "Lcom/p1/mobile/putong/core/data/IntlMarketQuestionData;", "quizQuestion", "Lcom/p1/mobile/putong/core/data/IntlMarketSummaryData;", "summary", "q", "(Lcom/p1/mobile/putong/core/data/IntlMarketQuestionData;Lcom/p1/mobile/putong/core/data/IntlMarketSummaryData;Lcom/p1/mobile/putong/core/data/IntlMarketResponseOptionData;)V", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "c", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "o", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "set_root_layout", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;)V", "_root_layout", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", "k", "()Lv/VDraweeView;", "set_bg_img", "(Lv/VDraweeView;)V", "_bg_img", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "p", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "f", "j", "set_activity_icon", "_activity_icon", "Landroid/widget/ImageView;", "g", "Landroid/widget/ImageView;", "m", "()Landroid/widget/ImageView;", "set_bt_close", "(Landroid/widget/ImageView;)V", "_bt_close", "h", "n", "set_desc", "_desc", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "set_bt", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;)V", "_bt", "Ll/pej0;", "Ll/pej0;", OMSTemplateType.dialog, "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class C8549a extends lyl {

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
    public pej0 dialog;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intloperation.quiz.a$a */
    @Metadata(m88120d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"com/p1/mobile/putong/core/ui/intloperation/quiz/a$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "(Landroid/view/View;I)V", "", "onSlide", "(Landroid/view/View;F)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior<FrameLayout> f30743a;

        public a(BottomSheetBehavior<FrameLayout> bottomSheetBehavior) {
            this.f30743a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View p0, float p1) {
            p0.getClass();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View p0, int p1) {
            p0.getClass();
            if (p1 == 1) {
                this.f30743a.setState(3);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8549a(@NotNull Act act) {
        super(act);
        act.getClass();
    }

    /* JADX INFO: renamed from: e */
    public static void m47510e(C8549a c8549a, IntlMarketQuestionData intlMarketQuestionData, View view) {
        bap.INSTANCE.m103228g();
        c8549a.getAct().startActivityWithCustomTransition(IntlQuizAct.INSTANCE.m47503a(c8549a.getAct(), intlMarketQuestionData), new MatchAct.C8617b());
        pej0 pej0Var = c8549a.dialog;
        if (pej0Var == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            pej0Var = null;
        }
        pej0Var.dismiss();
    }

    /* JADX INFO: renamed from: h */
    public static void m47513h(C8549a c8549a, View view) {
        pej0 pej0Var = c8549a.dialog;
        if (pej0Var == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            pej0Var = null;
        }
        pej0Var.dismiss();
    }

    /* JADX INFO: renamed from: s */
    public static final void m47514s(C8549a c8549a, DialogInterface dialogInterface) {
        w1e.m204401e(c8549a.m156367d());
    }

    /* JADX INFO: renamed from: t */
    public static final void m47515t(C8549a c8549a) {
        c8549a.m47518k().getLayoutParams().height = c8549a.m47522o().getHeight();
        c8549a.m47518k().setLayoutParams(c8549a.m47518k().getLayoutParams());
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final View m47516i(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM148884b = k9p.m148884b(this, inflater, parent);
        viewM148884b.getClass();
        return viewM148884b;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VDraweeView m47517j() {
        VDraweeView vDraweeView = this._activity_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_activity_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VDraweeView m47518k() {
        VDraweeView vDraweeView = this._bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final RoundButton m47519l() {
        RoundButton roundButton = this._bt;
        if (roundButton != null) {
            return roundButton;
        }
        Intrinsics.m88391r("_bt");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final ImageView m47520m() {
        ImageView imageView = this._bt_close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_bt_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final TextView m47521n() {
        TextView textView = this._desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final RoundConstraintLayout m47522o() {
        RoundConstraintLayout roundConstraintLayout = this._root_layout;
        if (roundConstraintLayout != null) {
            return roundConstraintLayout;
        }
        Intrinsics.m88391r("_root_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final TextView m47523p() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m47524q(final IntlMarketQuestionData quizQuestion, IntlMarketSummaryData summary, IntlMarketResponseOptionData quizOption) {
        if (!TextUtils.isEmpty(summary.bg_color)) {
            m47522o().setBackgroundColor(Color.parseColor(summary.bg_color));
        }
        uqb0.f180374G.m127121O0(m47518k(), summary.bg_url, true, false, null, null);
        m47519l().setText(summary.confirm_btn_desc);
        m47521n().setText(summary.sub_title);
        m47523p().setText(summary.main_title);
        if (quizOption != null) {
            if (!TextUtils.isEmpty(quizOption.desc_in_popup)) {
                m47521n().setText(quizOption.desc_in_popup);
            }
            String str = !TextUtils.isEmpty(quizOption.option_image_url) ? quizOption.option_image_url : summary.logo_url;
            str.getClass();
            uqb0.f180374G.m127121O0(m47517j(), str, true, false, null, null);
        }
        bnl0.m105509E0(m47520m(), new View.OnClickListener() { // from class: l.i9p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8549a.m47513h(this.f113494a, view);
            }
        });
        bnl0.m105509E0(m47519l(), new View.OnClickListener() { // from class: l.j9p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8549a.m47510e(this.f118894a, quizQuestion, view);
            }
        });
        try {
            if (!TextUtils.isEmpty(summary.confirm_btn_color)) {
                m47519l().setBackgroundColor(Color.parseColor(summary.confirm_btn_color));
            }
            if (!TextUtils.isEmpty(summary.confirm_btn_font_color)) {
                m47519l().setTextColor(Color.parseColor(summary.confirm_btn_font_color));
            }
            if (!TextUtils.isEmpty(summary.main_title_font_color)) {
                m47523p().setTextColor(Color.parseColor(summary.main_title_font_color));
            }
            if (TextUtils.isEmpty(summary.sub_title_font_color)) {
                return;
            }
            m47521n().setTextColor(Color.parseColor(summary.sub_title_font_color));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m47525r(@Nullable IntlMarketConfigData data, @Nullable IntlMarketResponseOptionData quizOption, int source) {
        if (data != null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getAct());
            layoutInflaterFrom.getClass();
            pej0 pej0Var = null;
            pej0 pej0VarM156366c = m156366c(getAct(), m47516i(layoutInflaterFrom, null));
            this.dialog = pej0VarM156366c;
            if (pej0VarM156366c == null) {
                Intrinsics.m88391r(OMSTemplateType.dialog);
                pej0VarM156366c = null;
            }
            pej0VarM156366c.setCancelable(false);
            pej0 pej0Var2 = this.dialog;
            if (pej0Var2 == null) {
                Intrinsics.m88391r(OMSTemplateType.dialog);
                pej0Var2 = null;
            }
            BottomSheetBehavior<FrameLayout> behavior = pej0Var2.getBehavior();
            behavior.getClass();
            behavior.addBottomSheetCallback(new a(behavior));
            behavior.setHideable(false);
            IntlMarketQuestionData intlMarketQuestionData = data.quiz_question;
            intlMarketQuestionData.getClass();
            IntlMarketSummaryData intlMarketSummaryData = data.quiz_summary;
            intlMarketSummaryData.getClass();
            m47524q(intlMarketQuestionData, intlMarketSummaryData, quizOption);
            pej0 pej0Var3 = this.dialog;
            if (pej0Var3 == null) {
                Intrinsics.m88391r(OMSTemplateType.dialog);
                pej0Var3 = null;
            }
            pej0Var3.show();
            w1e.m204402f(m156367d());
            pej0 pej0Var4 = this.dialog;
            if (pej0Var4 == null) {
                Intrinsics.m88391r(OMSTemplateType.dialog);
            } else {
                pej0Var = pej0Var4;
            }
            pej0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.g9p
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C8549a.m47514s(this.f102870a, dialogInterface);
                }
            });
            m47522o().post(new Runnable() { // from class: l.h9p
                @Override // java.lang.Runnable
                public final void run() {
                    C8549a.m47515t(this.f108422a);
                }
            });
        }
    }
}
