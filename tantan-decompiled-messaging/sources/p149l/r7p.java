package p149l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.IntlMarketQuestionData;
import com.p046p1.mobile.putong.core.data.IntlMarketQuestionItemData;
import com.p046p1.mobile.putong.core.data.IntlMarketQuestionOptionUIData;
import com.p046p1.mobile.putong.core.data.IntlMarketQuestionUIData;
import com.p046p1.mobile.putong.core.data.IntlMarketRequestParams;
import com.p046p1.mobile.putong.core.data.IntlMarketResponseData;
import com.p046p1.mobile.putong.core.data.IntlMarketResponseEnvelope;
import com.p046p1.mobile.putong.core.data.IntlMarketResponseOptionData;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\tJ\u0017\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010?\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010K\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u00103\u001a\u0004\bI\u00105\"\u0004\bJ\u00107R\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010W\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010B\u001a\u0004\bU\u0010D\"\u0004\bV\u0010FR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010hR\u0016\u0010k\u001a\u00020i8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010jR\u0016\u0010o\u001a\u00020l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u001c\u0010r\u001a\b\u0012\u0004\u0012\u00020l0p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010q¨\u0006s"}, m87232d2 = {"Ll/r7p;", "Ll/s7m;", "Ll/l7p;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "A", "()V", "", "isShow", b2s.C_ZONE, "(Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "k", "(Ll/l7p;)V", "inflateView", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "Lcom/p1/mobile/putong/core/data/IntlMarketResponseOptionData;", "data", BLiveStormDanmakuGiftResourceType.f44444l, "(Lcom/p1/mobile/putong/core/data/IntlMarketResponseOptionData;)V", "Lcom/p1/mobile/putong/core/data/IntlMarketQuestionData;", "B", "(Lcom/p1/mobile/putong/core/data/IntlMarketQuestionData;)V", "destroy", "a", "Lcom/p1/mobile/android/app/Act;", "n", "()Lcom/p1/mobile/android/app/Act;", "Landroid/widget/FrameLayout;", "b", "Landroid/widget/FrameLayout;", "w", "()Landroid/widget/FrameLayout;", "set_root", "(Landroid/widget/FrameLayout;)V", "_root", "Lv/VDraweeView;", "c", "Lv/VDraweeView;", "p", "()Lv/VDraweeView;", "set_bg_img", "(Lv/VDraweeView;)V", "_bg_img", "Lv/navigationbar/VNavigationBar;", "Lv/navigationbar/VNavigationBar;", "q", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Landroidx/constraintlayout/widget/ConstraintLayout;", "e", "Landroidx/constraintlayout/widget/ConstraintLayout;", BLiveStormDanmakuGiftResourceType.f44446s, "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_result_layout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_result_layout", "f", ResourceDirection.f38808v, "set_result_layout_finding_img", "_result_layout_finding_img", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", "u", "()Landroid/widget/TextView;", "set_result_layout_finding_content_title", "(Landroid/widget/TextView;)V", "_result_layout_finding_content_title", "h", BaseSei.f13930X, "set_setting_layout", "_setting_layout", "Landroidx/viewpager2/widget/ViewPager2;", RXScreenCaptureService.KEY_INDEX, "Landroidx/viewpager2/widget/ViewPager2;", BaseSei.f13931Y, "()Landroidx/viewpager2/widget/ViewPager2;", "set_setting_layout_banner", "(Landroidx/viewpager2/widget/ViewPager2;)V", "_setting_layout_banner", "Lv/VText;", "j", "Lv/VText;", BaseSei.f13932Z, "()Lv/VText;", "set_setting_layout_index", "(Lv/VText;)V", "_setting_layout_index", "Ll/l7p;", "Ll/w7p;", "Ll/w7p;", "adapter", "", "m", "I", "currentPosition", "", "Ljava/util/List;", LovePlanetStage.result, "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class r7p implements s7m<l7p> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public FrameLayout _root;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VDraweeView _bg_img;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VNavigationBar _navigation_bar;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public ConstraintLayout _result_layout;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VDraweeView _result_layout_finding_img;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public TextView _result_layout_finding_content_title;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public ConstraintLayout _setting_layout;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public ViewPager2 _setting_layout_banner;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _setting_layout_index;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public l7p presenter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public w7p adapter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int currentPosition;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public List<Integer> result;

    /* JADX INFO: renamed from: l.r7p$a */
    @Metadata(m87231d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"l/r7p$a", "Ll/w7p$b;", "", "position", "oid", "", "a", "(II)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19649a implements w7p.InterfaceC20822b {
        public C19649a() {
        }

        /* JADX INFO: renamed from: b */
        public static Unit m178197b(r7p r7pVar, IntlMarketResponseEnvelope intlMarketResponseEnvelope) {
            intlMarketResponseEnvelope.getClass();
            b8p.INSTANCE.m100779c().put(Boolean.TRUE);
            lsi0.m151593w(R$string.f17988O1);
            IntlMarketResponseData intlMarketResponseData = intlMarketResponseEnvelope.data;
            r7pVar.m178185l(intlMarketResponseData != null ? intlMarketResponseData.quiz_option : null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: c */
        public static Unit m178198c(r7p r7pVar) {
            Act act = r7pVar.getAct();
            if (act != null) {
                act.m47815F2();
            }
            return Unit.INSTANCE;
        }

        @Override // p149l.w7p.InterfaceC20822b
        /* JADX INFO: renamed from: a */
        public void mo178199a(int position, int oid) {
            r7p.this.result.set(position, Integer.valueOf(oid));
            int i = r7p.this.currentPosition;
            w7p w7pVar = r7p.this.adapter;
            if (w7pVar == null) {
                Intrinsics.m87502r("adapter");
                w7pVar = null;
            }
            if (i == w7pVar.getPageCount() - 1) {
                IntlMarketRequestParams intlMarketRequestParams = new IntlMarketRequestParams();
                intlMarketRequestParams.quiz_options = r7p.this.result;
                intlMarketRequestParams.mcc = String.valueOf(qib0.f154717f0);
                if (!Network.isConnected(r7p.this.getAct())) {
                    lsi0.m151578h(com.tantan.core.base.R$string.f55775l);
                    Act act = r7p.this.getAct();
                    if (act != null) {
                        act.m47815F2();
                        return;
                    }
                    return;
                }
                s69 s69Var = CoreModule.f17545c.f19550A1;
                Act act2 = r7p.this.getAct();
                final r7p r7pVar = r7p.this;
                Function0<Unit> function0 = new Function0() { // from class: l.p7p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return r7p.C19649a.m178198c(r7pVar);
                    }
                };
                final r7p r7pVar2 = r7p.this;
                s69Var.m182439r3(act2, intlMarketRequestParams, function0, new Function1() { // from class: l.q7p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r7p.C19649a.m178197b(r7pVar2, (IntlMarketResponseEnvelope) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: l.r7p$b */
    @Metadata(m87231d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"l/r7p$b", "Ll/w7p$a;", "", "position", "oid", "", "a", "(II)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19650b implements w7p.InterfaceC20821a {
        public C19650b() {
        }

        /* JADX INFO: renamed from: b */
        public static void m178200b(r7p r7pVar) {
            r7pVar.m178195y().setCurrentItem(r7pVar.currentPosition + 1);
        }

        @Override // p149l.w7p.InterfaceC20821a
        /* JADX INFO: renamed from: a */
        public void mo178201a(int position, int oid) {
            int i = r7p.this.currentPosition;
            w7p w7pVar = r7p.this.adapter;
            if (w7pVar == null) {
                Intrinsics.m87502r("adapter");
                w7pVar = null;
            }
            if (i != w7pVar.getPageCount() - 1) {
                Act act = r7p.this.getAct();
                final r7p r7pVar = r7p.this;
                e51.m114743H(act, new Runnable() { // from class: l.s7p
                    @Override // java.lang.Runnable
                    public final void run() {
                        r7p.C19650b.m178200b(r7pVar);
                    }
                }, 40L);
            }
        }
    }

    /* JADX INFO: renamed from: l.r7p$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/r7p$c", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "onPageSelected", "(I)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19651c extends ViewPager2.AbstractC0740i {
        public C19651c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            r7p.this.currentPosition = position;
            VText vTextM178196z = r7p.this.m178196z();
            int i = r7p.this.currentPosition + 1;
            w7p w7pVar = r7p.this.adapter;
            if (w7pVar == null) {
                Intrinsics.m87502r("adapter");
                w7pVar = null;
            }
            vTextM178196z.setText(i + "/" + w7pVar.getPageCount());
        }
    }

    public r7p(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.result = new ArrayList();
    }

    /* JADX INFO: renamed from: A */
    private final void m178172A() {
        m178188q().m223588w(x2c0.f189197Bb, new View.OnClickListener() { // from class: l.m7p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r7p.m178175c(this.f131837a, view);
            }
        });
        m178188q().setBackgroundColor(Color.parseColor("#00ffffff"));
        m178188q().setLeftIconOnClick(new View.OnClickListener() { // from class: l.n7p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r7p.m178174b(this.f137541a, view);
            }
        });
        Act act = getAct();
        if (act != null) {
            act.setStatusBarColor(act.getResources().getColor(w0c0.f183811U1));
            PutongAct.setLightStatusBar(act.getWindow(), 16);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m178174b(r7p r7pVar, View view) {
        r7pVar.act.m47815F2();
    }

    /* JADX INFO: renamed from: c */
    public static void m178175c(r7p r7pVar, View view) {
        r7pVar.act.m47815F2();
    }

    /* JADX INFO: renamed from: m */
    public static final void m178180m(r7p r7pVar, Act act) {
        r7pVar.m178182C(false);
        act.m47815F2();
    }

    /* JADX INFO: renamed from: B */
    public final void m178181B(@NotNull IntlMarketQuestionData data) {
        data.getClass();
        if (NullChecker.m81303a(data)) {
            IntlMarketQuestionUIData intlMarketQuestionUIData = data.question_ui;
            intlMarketQuestionUIData.getClass();
            int size = data.questions.size();
            for (int i = 0; i < size; i++) {
                this.result.add(i, -1);
            }
            try {
                String str = intlMarketQuestionUIData.font_color;
                if (str != null) {
                    m178196z().setTextColor(Color.parseColor(str));
                    m178191u().setTextColor(Color.parseColor(str));
                }
                if (!TextUtils.isEmpty(intlMarketQuestionUIData.bg_color)) {
                    m178193w().setBackgroundColor(Color.parseColor(intlMarketQuestionUIData.bg_color));
                }
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
            bkb0 bkb0Var = qib0.f154691G;
            VDraweeView vDraweeViewM178187p = m178187p();
            String str2 = intlMarketQuestionUIData.bg_url;
            if (str2 == null) {
                str2 = "";
            }
            bkb0Var.m102337O0(vDraweeViewM178187p, str2, true, false, null, null);
            w7p w7pVar = this.adapter;
            w7p w7pVar2 = null;
            if (w7pVar == null) {
                Intrinsics.m87502r("adapter");
                w7pVar = null;
            }
            List<IntlMarketQuestionItemData> list = data.questions;
            list.getClass();
            IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData = data.option_ui;
            intlMarketQuestionOptionUIData.getClass();
            w7pVar.m202055M(intlMarketQuestionUIData, list, intlMarketQuestionOptionUIData, this.result);
            ViewPager2 viewPager2M178195y = m178195y();
            w7p w7pVar3 = this.adapter;
            if (w7pVar3 == null) {
                Intrinsics.m87502r("adapter");
            } else {
                w7pVar2 = w7pVar3;
            }
            viewPager2M178195y.setAdapter(w7pVar2);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m178182C(boolean isShow) {
        if (isShow) {
            b8p b8pVar = b8p.INSTANCE;
            b8pVar.m100782f(b8pVar.m100778b());
        } else {
            b8p b8pVar2 = b8p.INSTANCE;
            b8pVar2.m100781e(b8pVar2.m100778b());
        }
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final View m178183d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM187494b = t7p.m187494b(this, inflater, parent);
        viewM187494b.getClass();
        return viewM187494b;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m178183d(inflater, parent);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable l7p presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: l */
    public final void m178185l(@Nullable IntlMarketResponseOptionData data) {
        if (data != null) {
            m178182C(true);
            m178194x().setVisibility(8);
            m178190s().setVisibility(0);
            m178191u().setText(data.desc_in_result);
            qib0.f154691G.m102331L0(m178192v(), data.option_image_url);
        }
        final Act act = getAct();
        if (act != null) {
            e51.m114743H(act, new Runnable() { // from class: l.o7p
                @Override // java.lang.Runnable
                public final void run() {
                    r7p.m178180m(this.f142527a, act);
                }
            }, 3000L);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VDraweeView m178187p() {
        VDraweeView vDraweeView = this._bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VNavigationBar m178188q() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m87502r("_navigation_bar");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m178189r() {
        m178172A();
        m178194x().setVisibility(0);
        m178190s().setVisibility(8);
        m178195y().setUserInputEnabled(false);
        w7p w7pVar = new w7p(this.act);
        this.adapter = w7pVar;
        w7pVar.m202057O(new C19649a());
        w7p w7pVar2 = this.adapter;
        if (w7pVar2 == null) {
            Intrinsics.m87502r("adapter");
            w7pVar2 = null;
        }
        w7pVar2.m202056N(new C19650b());
        m178195y().m4247g(new C19651c());
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final ConstraintLayout m178190s() {
        ConstraintLayout constraintLayout = this._result_layout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_result_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final TextView m178191u() {
        TextView textView = this._result_layout_finding_content_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_result_layout_finding_content_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VDraweeView m178192v() {
        VDraweeView vDraweeView = this._result_layout_finding_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_result_layout_finding_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final FrameLayout m178193w() {
        FrameLayout frameLayout = this._root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final ConstraintLayout m178194x() {
        ConstraintLayout constraintLayout = this._setting_layout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_setting_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final ViewPager2 m178195y() {
        ViewPager2 viewPager2 = this._setting_layout_banner;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.m87502r("_setting_layout_banner");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VText m178196z() {
        VText vText = this._setting_layout_index;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_setting_layout_index");
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
