package com.p051p1.mobile.putong.core.p058ui.intloperation.campingactivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.IntlCampingConfigData;
import com.p051p1.mobile.putong.core.data.IntlCampingQuestionsData;
import com.p051p1.mobile.putong.core.data.IntlCampingSummaryData;
import com.p051p1.mobile.putong.core.data.Questions;
import com.p051p1.mobile.putong.core.p058ui.intloperation.campingactivity.C8544a;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundButton;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundConstraintLayout;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p153l.agc0;
import p153l.bnl0;
import p153l.k5n;
import p153l.l4g0;
import p153l.l51;
import p153l.pej0;
import p153l.uqb0;
import p153l.ur2;
import p153l.w1e;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intloperation.campingactivity.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00106\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R\"\u0010:\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u0010-\u001a\u0004\b8\u0010/\"\u0004\b9\u00101R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010I\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010P\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0016\u0010S\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR\u001b\u0010W\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010U\u001a\u0004\bQ\u0010V¨\u0006X"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/intloperation/campingactivity/a;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "g", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/IntlCampingConfigData;", "data", "", "source", "", BLiveStormDanmakuGiftResourceType.f45294s, "(Lcom/p1/mobile/putong/core/data/IntlCampingConfigData;I)V", "Lcom/p1/mobile/putong/core/data/IntlCampingSummaryData;", "summary", "", "Lcom/p1/mobile/putong/core/data/IntlCampingQuestionsData;", Questions.TYPE, "q", "(Lcom/p1/mobile/putong/core/data/IntlCampingSummaryData;Ljava/util/List;)V", "rootView", "Ll/pej0;", "h", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Ll/pej0;", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "b", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "o", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "set_root_layout", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;)V", "_root_layout", "Lv/VDraweeView;", "c", "Lv/VDraweeView;", "k", "()Lv/VDraweeView;", "set_bg_img", "(Lv/VDraweeView;)V", "_bg_img", Constants.INAPP_DATA_TAG, "p", "set_title_img", "_title_img", "e", "j", "set_activity_icon", "_activity_icon", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "m", "()Landroid/widget/ImageView;", "set_bt_close", "(Landroid/widget/ImageView;)V", "_bt_close", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "n", "()Landroid/widget/TextView;", "set_desc", "(Landroid/widget/TextView;)V", "_desc", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "set_bt", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;)V", "_bt", RXScreenCaptureService.KEY_INDEX, "Ll/pej0;", OMSTemplateType.dialog, "Ll/l4g0;", "Lkotlin/Lazy;", "()Ll/l4g0;", "pageHelp", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class C8544a {

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
    public pej0 dialog;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageHelp;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intloperation.campingactivity.a$a */
    @Metadata(m88120d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"com/p1/mobile/putong/core/ui/intloperation/campingactivity/a$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "(Landroid/view/View;I)V", "", "onSlide", "(Landroid/view/View;F)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pej0 f30708a;

        public a(pej0 pej0Var) {
            this.f30708a = pej0Var;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View p0, float p1) {
            p0.getClass();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View p0, int p1) {
            p0.getClass();
            if (p1 == 4) {
                this.f30708a.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intloperation.campingactivity.a$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"com/p1/mobile/putong/core/ui/intloperation/campingactivity/a$b", "Ll/ur2;", "", "pageId", "()Ljava/lang/String;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class b extends ur2 {
        @Override // p153l.e6m
        public String pageId() {
            return "p_activities_pets_page";
        }
    }

    public C8544a(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.pageHelp = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.e5n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8544a.m47445f();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static void m47441b(final C8544a c8544a, View view) {
        C8545b.INSTANCE.m47472l();
        Act act = c8544a.act;
        act.startActivityWithCustomTransition(IntlCampingAct.Companion.m47431b(IntlCampingAct.INSTANCE, act, null, 2, null), new MatchAct.C8617b());
        l51.m152888H(c8544a.act, new Runnable() { // from class: l.j5n
            @Override // java.lang.Runnable
            public final void run() {
                C8544a.m47446r(this.f118480a);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: c */
    public static void m47442c(C8544a c8544a, View view) {
        pej0 pej0Var = c8544a.dialog;
        if (pej0Var == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            pej0Var = null;
        }
        pej0Var.dismiss();
    }

    /* JADX INFO: renamed from: f */
    public static l4g0 m47445f() {
        return new l4g0(new b());
    }

    /* JADX INFO: renamed from: r */
    public static final void m47446r(C8544a c8544a) {
        pej0 pej0Var = c8544a.dialog;
        pej0 pej0Var2 = null;
        if (pej0Var == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            pej0Var = null;
        }
        if (pej0Var.isShowing()) {
            pej0 pej0Var3 = c8544a.dialog;
            if (pej0Var3 == null) {
                Intrinsics.m88391r(OMSTemplateType.dialog);
            } else {
                pej0Var2 = pej0Var3;
            }
            pej0Var2.dismiss();
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m47447t(C8544a c8544a, DialogInterface dialogInterface) {
        w1e.m204401e(c8544a.m47451i());
    }

    /* JADX INFO: renamed from: u */
    public static final void m47448u(C8544a c8544a) {
        c8544a.m47453k().getLayoutParams().height = c8544a.m47457o().getHeight();
        c8544a.m47453k().setLayoutParams(c8544a.m47453k().getLayoutParams());
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final View m47449g(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM148475b = k5n.m148475b(this, inflater, parent);
        viewM148475b.getClass();
        return viewM148475b;
    }

    /* JADX INFO: renamed from: h */
    public final pej0 m47450h(Act act, View rootView) {
        pej0 pej0Var = new pej0(act, agc0.f71118d);
        pej0Var.setContentView(rootView);
        pej0Var.setCancelable(true);
        pej0Var.getBehavior().setState(3);
        pej0Var.getBehavior().setPeekHeight(0);
        pej0Var.getBehavior().setSkipCollapsed(true);
        pej0Var.getBehavior().addBottomSheetCallback(new a(pej0Var));
        return pej0Var;
    }

    /* JADX INFO: renamed from: i */
    public final l4g0 m47451i() {
        return (l4g0) this.pageHelp.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VDraweeView m47452j() {
        VDraweeView vDraweeView = this._activity_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_activity_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VDraweeView m47453k() {
        VDraweeView vDraweeView = this._bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final RoundButton m47454l() {
        RoundButton roundButton = this._bt;
        if (roundButton != null) {
            return roundButton;
        }
        Intrinsics.m88391r("_bt");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final ImageView m47455m() {
        ImageView imageView = this._bt_close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_bt_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final TextView m47456n() {
        TextView textView = this._desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final RoundConstraintLayout m47457o() {
        RoundConstraintLayout roundConstraintLayout = this._root_layout;
        if (roundConstraintLayout != null) {
            return roundConstraintLayout;
        }
        Intrinsics.m88391r("_root_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VDraweeView m47458p() {
        VDraweeView vDraweeView = this._title_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_title_img");
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m47459q(IntlCampingSummaryData summary, List<? extends IntlCampingQuestionsData> questions) {
        uqb0.f180374G.m127128S0(m47453k(), summary.bg_url);
        uqb0.f180374G.m127128S0(m47458p(), summary.heading_url);
        uqb0.f180374G.m127128S0(m47452j(), summary.logo_url);
        bnl0.m105509E0(m47455m(), new View.OnClickListener() { // from class: l.h5n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8544a.m47442c(this.f107954a, view);
            }
        });
        bnl0.m105509E0(m47454l(), new View.OnClickListener() { // from class: l.i5n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8544a.m47441b(this.f113081a, view);
            }
        });
        try {
            m47456n().setText(summary.desc);
            m47456n().setTextColor(Color.parseColor(summary.desc_font_color));
            m47454l().setText(summary.start_btn_desc);
            m47454l().setTextColor(Color.parseColor(summary.btn_font_color));
            m47454l().setBackgroundColor(Color.parseColor(summary.btn_bg_color));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m47460s(@Nullable IntlCampingConfigData data, int source) {
        if (data != null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.act);
            layoutInflaterFrom.getClass();
            pej0 pej0Var = null;
            this.dialog = m47450h(this.act, m47449g(layoutInflaterFrom, null));
            IntlCampingSummaryData intlCampingSummaryData = data.summary;
            intlCampingSummaryData.getClass();
            List<IntlCampingQuestionsData> list = data.questions;
            list.getClass();
            m47459q(intlCampingSummaryData, list);
            C8545b.INSTANCE.m47466e(source);
            pej0 pej0Var2 = this.dialog;
            if (pej0Var2 == null) {
                Intrinsics.m88391r(OMSTemplateType.dialog);
                pej0Var2 = null;
            }
            pej0Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.f5n
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C8544a.m47447t(this.f97270a, dialogInterface);
                }
            });
            w1e.m204402f(m47451i());
            pej0 pej0Var3 = this.dialog;
            if (pej0Var3 == null) {
                Intrinsics.m88391r(OMSTemplateType.dialog);
            } else {
                pej0Var = pej0Var3;
            }
            pej0Var.show();
            m47457o().post(new Runnable() { // from class: l.g5n
                @Override // java.lang.Runnable
                public final void run() {
                    C8544a.m47448u(this.f102338a);
                }
            });
        }
    }
}
