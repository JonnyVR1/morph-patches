package com.p046p1.mobile.putong.core.p053ui.intloperation.campingactivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.IntlCampingConfigData;
import com.p046p1.mobile.putong.core.data.IntlCampingQuestionsData;
import com.p046p1.mobile.putong.core.data.IntlCampingSummaryData;
import com.p046p1.mobile.putong.core.data.Questions;
import com.p046p1.mobile.putong.core.p053ui.intloperation.campingactivity.C8381a;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundButton;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundConstraintLayout;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p149l.cwf0;
import p149l.e51;
import p149l.er2;
import p149l.i0e;
import p149l.k3n;
import p149l.l5j0;
import p149l.qib0;
import p149l.v7c0;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intloperation.campingactivity.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00106\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R\"\u0010:\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u0010-\u001a\u0004\b8\u0010/\"\u0004\b9\u00101R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010I\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010P\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0016\u0010S\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR\u001b\u0010W\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010U\u001a\u0004\bQ\u0010V¨\u0006X"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/intloperation/campingactivity/a;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "g", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/IntlCampingConfigData;", "data", "", "source", "", BLiveStormDanmakuGiftResourceType.f44446s, "(Lcom/p1/mobile/putong/core/data/IntlCampingConfigData;I)V", "Lcom/p1/mobile/putong/core/data/IntlCampingSummaryData;", "summary", "", "Lcom/p1/mobile/putong/core/data/IntlCampingQuestionsData;", Questions.TYPE, "q", "(Lcom/p1/mobile/putong/core/data/IntlCampingSummaryData;Ljava/util/List;)V", "rootView", "Ll/l5j0;", "h", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Ll/l5j0;", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "b", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "o", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "set_root_layout", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;)V", "_root_layout", "Lv/VDraweeView;", "c", "Lv/VDraweeView;", "k", "()Lv/VDraweeView;", "set_bg_img", "(Lv/VDraweeView;)V", "_bg_img", Constants.INAPP_DATA_TAG, "p", "set_title_img", "_title_img", "e", "j", "set_activity_icon", "_activity_icon", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "m", "()Landroid/widget/ImageView;", "set_bt_close", "(Landroid/widget/ImageView;)V", "_bt_close", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "n", "()Landroid/widget/TextView;", "set_desc", "(Landroid/widget/TextView;)V", "_desc", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "set_bt", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;)V", "_bt", RXScreenCaptureService.KEY_INDEX, "Ll/l5j0;", OMSTemplateType.dialog, "Ll/cwf0;", "Lkotlin/Lazy;", "()Ll/cwf0;", "pageHelp", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C8381a {

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
    @Metadata(m87231d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"com/p1/mobile/putong/core/ui/intloperation/campingactivity/a$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "(Landroid/view/View;I)V", "", "onSlide", "(Landroid/view/View;F)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l5j0 f29860a;

        public a(l5j0 l5j0Var) {
            this.f29860a = l5j0Var;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View p0, float p1) {
            p0.getClass();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View p0, int p1) {
            p0.getClass();
            if (p1 == 4) {
                this.f29860a.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intloperation.campingactivity.a$b */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"com/p1/mobile/putong/core/ui/intloperation/campingactivity/a$b", "Ll/er2;", "", "pageId", "()Ljava/lang/String;", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class b extends er2 {
        @Override // p149l.n3m
        public String pageId() {
            return "p_activities_pets_page";
        }
    }

    public C8381a(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.pageHelp = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.e3n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8381a.m46262f();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static void m46258b(final C8381a c8381a, View view) {
        C8382b.INSTANCE.m46289l();
        Act act = c8381a.act;
        act.startActivityWithCustomTransition(IntlCampingAct.Companion.m46248b(IntlCampingAct.INSTANCE, act, null, 2, null), new MatchAct.C8454b());
        e51.m114743H(c8381a.act, new Runnable() { // from class: l.j3n
            @Override // java.lang.Runnable
            public final void run() {
                C8381a.m46263r(this.f116096a);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: c */
    public static void m46259c(C8381a c8381a, View view) {
        l5j0 l5j0Var = c8381a.dialog;
        if (l5j0Var == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            l5j0Var = null;
        }
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: f */
    public static cwf0 m46262f() {
        return new cwf0(new b());
    }

    /* JADX INFO: renamed from: r */
    public static final void m46263r(C8381a c8381a) {
        l5j0 l5j0Var = c8381a.dialog;
        l5j0 l5j0Var2 = null;
        if (l5j0Var == null) {
            Intrinsics.m87502r(OMSTemplateType.dialog);
            l5j0Var = null;
        }
        if (l5j0Var.isShowing()) {
            l5j0 l5j0Var3 = c8381a.dialog;
            if (l5j0Var3 == null) {
                Intrinsics.m87502r(OMSTemplateType.dialog);
            } else {
                l5j0Var2 = l5j0Var3;
            }
            l5j0Var2.dismiss();
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m46264t(C8381a c8381a, DialogInterface dialogInterface) {
        i0e.m133796e(c8381a.m46268i());
    }

    /* JADX INFO: renamed from: u */
    public static final void m46265u(C8381a c8381a) {
        c8381a.m46270k().getLayoutParams().height = c8381a.m46274o().getHeight();
        c8381a.m46270k().setLayoutParams(c8381a.m46270k().getLayoutParams());
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final View m46266g(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM144414b = k3n.m144414b(this, inflater, parent);
        viewM144414b.getClass();
        return viewM144414b;
    }

    /* JADX INFO: renamed from: h */
    public final l5j0 m46267h(Act act, View rootView) {
        l5j0 l5j0Var = new l5j0(act, v7c0.f180357d);
        l5j0Var.setContentView(rootView);
        l5j0Var.setCancelable(true);
        l5j0Var.getBehavior().setState(3);
        l5j0Var.getBehavior().setPeekHeight(0);
        l5j0Var.getBehavior().setSkipCollapsed(true);
        l5j0Var.getBehavior().addBottomSheetCallback(new a(l5j0Var));
        return l5j0Var;
    }

    /* JADX INFO: renamed from: i */
    public final cwf0 m46268i() {
        return (cwf0) this.pageHelp.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VDraweeView m46269j() {
        VDraweeView vDraweeView = this._activity_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_activity_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VDraweeView m46270k() {
        VDraweeView vDraweeView = this._bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final RoundButton m46271l() {
        RoundButton roundButton = this._bt;
        if (roundButton != null) {
            return roundButton;
        }
        Intrinsics.m87502r("_bt");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final ImageView m46272m() {
        ImageView imageView = this._bt_close;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_bt_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final TextView m46273n() {
        TextView textView = this._desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final RoundConstraintLayout m46274o() {
        RoundConstraintLayout roundConstraintLayout = this._root_layout;
        if (roundConstraintLayout != null) {
            return roundConstraintLayout;
        }
        Intrinsics.m87502r("_root_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VDraweeView m46275p() {
        VDraweeView vDraweeView = this._title_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_title_img");
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m46276q(IntlCampingSummaryData summary, List<? extends IntlCampingQuestionsData> questions) {
        qib0.f154691G.m102344S0(m46270k(), summary.bg_url);
        qib0.f154691G.m102344S0(m46275p(), summary.heading_url);
        qib0.f154691G.m102344S0(m46269j(), summary.logo_url);
        xdl0.m208329E0(m46272m(), new View.OnClickListener() { // from class: l.h3n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8381a.m46259c(this.f105750a, view);
            }
        });
        xdl0.m208329E0(m46271l(), new View.OnClickListener() { // from class: l.i3n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8381a.m46258b(this.f111348a, view);
            }
        });
        try {
            m46273n().setText(summary.desc);
            m46273n().setTextColor(Color.parseColor(summary.desc_font_color));
            m46271l().setText(summary.start_btn_desc);
            m46271l().setTextColor(Color.parseColor(summary.btn_font_color));
            m46271l().setBackgroundColor(Color.parseColor(summary.btn_bg_color));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m46277s(@Nullable IntlCampingConfigData data, int source) {
        if (data != null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.act);
            layoutInflaterFrom.getClass();
            l5j0 l5j0Var = null;
            this.dialog = m46267h(this.act, m46266g(layoutInflaterFrom, null));
            IntlCampingSummaryData intlCampingSummaryData = data.summary;
            intlCampingSummaryData.getClass();
            List<IntlCampingQuestionsData> list = data.questions;
            list.getClass();
            m46276q(intlCampingSummaryData, list);
            C8382b.INSTANCE.m46283e(source);
            l5j0 l5j0Var2 = this.dialog;
            if (l5j0Var2 == null) {
                Intrinsics.m87502r(OMSTemplateType.dialog);
                l5j0Var2 = null;
            }
            l5j0Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.f3n
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C8381a.m46264t(this.f94699a, dialogInterface);
                }
            });
            i0e.m133797f(m46268i());
            l5j0 l5j0Var3 = this.dialog;
            if (l5j0Var3 == null) {
                Intrinsics.m87502r(OMSTemplateType.dialog);
            } else {
                l5j0Var = l5j0Var3;
            }
            l5j0Var.show();
            m46274o().post(new Runnable() { // from class: l.g3n
                @Override // java.lang.Runnable
                public final void run() {
                    C8381a.m46265u(this.f100484a);
                }
            });
        }
    }
}
