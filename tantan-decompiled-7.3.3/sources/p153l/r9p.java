package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.IntlMarketQuestionData;
import com.p051p1.mobile.putong.core.data.IntlMarketQuestionItemData;
import com.p051p1.mobile.putong.core.data.IntlMarketQuestionOptionUIData;
import com.p051p1.mobile.putong.core.data.IntlMarketQuestionUIData;
import com.p051p1.mobile.putong.core.data.IntlMarketRequestParams;
import com.p051p1.mobile.putong.core.data.IntlMarketResponseData;
import com.p051p1.mobile.putong.core.data.IntlMarketResponseEnvelope;
import com.p051p1.mobile.putong.core.data.IntlMarketResponseOptionData;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p151v.VDraweeView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\tJ\u0017\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010?\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010K\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u00103\u001a\u0004\bI\u00105\"\u0004\bJ\u00107R\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010W\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010B\u001a\u0004\bU\u0010D\"\u0004\bV\u0010FR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010hR\u0016\u0010k\u001a\u00020i8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010jR\u0016\u0010o\u001a\u00020l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u001c\u0010r\u001a\b\u0012\u0004\u0012\u00020l0p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010q¨\u0006s"}, m88121d2 = {"Ll/r9p;", "Ll/iam;", "Ll/l9p;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "A", "()V", "", "isShow", c4s.C_ZONE, "(Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "k", "(Ll/l9p;)V", "inflateView", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "Lcom/p1/mobile/putong/core/data/IntlMarketResponseOptionData;", "data", BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/p1/mobile/putong/core/data/IntlMarketResponseOptionData;)V", "Lcom/p1/mobile/putong/core/data/IntlMarketQuestionData;", "B", "(Lcom/p1/mobile/putong/core/data/IntlMarketQuestionData;)V", "destroy", "a", "Lcom/p1/mobile/android/app/Act;", "n", "()Lcom/p1/mobile/android/app/Act;", "Landroid/widget/FrameLayout;", "b", "Landroid/widget/FrameLayout;", "w", "()Landroid/widget/FrameLayout;", "set_root", "(Landroid/widget/FrameLayout;)V", "_root", "Lv/VDraweeView;", "c", "Lv/VDraweeView;", "p", "()Lv/VDraweeView;", "set_bg_img", "(Lv/VDraweeView;)V", "_bg_img", "Lv/navigationbar/VNavigationBar;", "Lv/navigationbar/VNavigationBar;", "q", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Landroidx/constraintlayout/widget/ConstraintLayout;", "e", "Landroidx/constraintlayout/widget/ConstraintLayout;", BLiveStormDanmakuGiftResourceType.f45294s, "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_result_layout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_result_layout", "f", ResourceDirection.f39656v, "set_result_layout_finding_img", "_result_layout_finding_img", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", "u", "()Landroid/widget/TextView;", "set_result_layout_finding_content_title", "(Landroid/widget/TextView;)V", "_result_layout_finding_content_title", "h", BaseSei.f14624X, "set_setting_layout", "_setting_layout", "Landroidx/viewpager2/widget/ViewPager2;", RXScreenCaptureService.KEY_INDEX, "Landroidx/viewpager2/widget/ViewPager2;", BaseSei.f14625Y, "()Landroidx/viewpager2/widget/ViewPager2;", "set_setting_layout_banner", "(Landroidx/viewpager2/widget/ViewPager2;)V", "_setting_layout_banner", "Lv/VText;", "j", "Lv/VText;", BaseSei.f14626Z, "()Lv/VText;", "set_setting_layout_index", "(Lv/VText;)V", "_setting_layout_index", "Ll/l9p;", "Ll/w9p;", "Ll/w9p;", "adapter", "", "m", "I", "currentPosition", "", "Ljava/util/List;", LovePlanetStage.result, "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class r9p implements iam<l9p> {

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
    public l9p presenter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public w9p adapter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int currentPosition;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public List<Integer> result;

    /* JADX INFO: renamed from: l.r9p$a */
    @Metadata(m88120d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"l/r9p$a", "Ll/w9p$b;", "", "position", "oid", "", "a", "(II)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19795a implements w9p.InterfaceC21053b {
        public C19795a() {
        }

        /* JADX INFO: renamed from: b */
        public static Unit m180648b(r9p r9pVar, IntlMarketResponseEnvelope intlMarketResponseEnvelope) {
            intlMarketResponseEnvelope.getClass();
            bap.INSTANCE.m103224c().put(Boolean.TRUE);
            o1j0.m165649w(R$string.f18718O1);
            IntlMarketResponseData intlMarketResponseData = intlMarketResponseEnvelope.data;
            r9pVar.m180636l(intlMarketResponseData != null ? intlMarketResponseData.quiz_option : null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: c */
        public static Unit m180649c(r9p r9pVar) {
            Act act = r9pVar.getAct();
            if (act != null) {
                act.m48999H2();
            }
            return Unit.INSTANCE;
        }

        @Override // p153l.w9p.InterfaceC21053b
        /* JADX INFO: renamed from: a */
        public void mo180650a(int position, int oid) {
            r9p.this.result.set(position, Integer.valueOf(oid));
            int i = r9p.this.currentPosition;
            w9p w9pVar = r9p.this.adapter;
            if (w9pVar == null) {
                Intrinsics.m88391r("adapter");
                w9pVar = null;
            }
            if (i == w9pVar.getPageCount() - 1) {
                IntlMarketRequestParams intlMarketRequestParams = new IntlMarketRequestParams();
                intlMarketRequestParams.quiz_options = r9p.this.result;
                intlMarketRequestParams.mcc = String.valueOf(uqb0.f180400f0);
                if (!Network.isConnected(r9p.this.getAct())) {
                    o1j0.m165634h(com.tantan.core.base.R$string.f56623l);
                    Act act = r9p.this.getAct();
                    if (act != null) {
                        act.m48999H2();
                        return;
                    }
                    return;
                }
                b89 b89Var = CoreModule.f18264c.f20292A1;
                Act act2 = r9p.this.getAct();
                final r9p r9pVar = r9p.this;
                Function0<Unit> function0 = new Function0() { // from class: l.p9p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return r9p.C19795a.m180649c(r9pVar);
                    }
                };
                final r9p r9pVar2 = r9p.this;
                b89Var.m102935r3(act2, intlMarketRequestParams, function0, new Function1() { // from class: l.q9p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r9p.C19795a.m180648b(r9pVar2, (IntlMarketResponseEnvelope) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: l.r9p$b */
    @Metadata(m88120d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"l/r9p$b", "Ll/w9p$a;", "", "position", "oid", "", "a", "(II)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19796b implements w9p.InterfaceC21052a {
        public C19796b() {
        }

        /* JADX INFO: renamed from: b */
        public static void m180651b(r9p r9pVar) {
            r9pVar.m180646y().setCurrentItem(r9pVar.currentPosition + 1);
        }

        @Override // p153l.w9p.InterfaceC21052a
        /* JADX INFO: renamed from: a */
        public void mo180652a(int position, int oid) {
            int i = r9p.this.currentPosition;
            w9p w9pVar = r9p.this.adapter;
            if (w9pVar == null) {
                Intrinsics.m88391r("adapter");
                w9pVar = null;
            }
            if (i != w9pVar.getPageCount() - 1) {
                Act act = r9p.this.getAct();
                final r9p r9pVar = r9p.this;
                l51.m152888H(act, new Runnable() { // from class: l.s9p
                    @Override // java.lang.Runnable
                    public final void run() {
                        r9p.C19796b.m180651b(r9pVar);
                    }
                }, 40L);
            }
        }
    }

    /* JADX INFO: renamed from: l.r9p$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/r9p$c", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "onPageSelected", "(I)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19797c extends ViewPager2.AbstractC0742i {
        public C19797c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            r9p.this.currentPosition = position;
            VText vTextM180647z = r9p.this.m180647z();
            int i = r9p.this.currentPosition + 1;
            w9p w9pVar = r9p.this.adapter;
            if (w9pVar == null) {
                Intrinsics.m88391r("adapter");
                w9pVar = null;
            }
            vTextM180647z.setText(i + "/" + w9pVar.getPageCount());
        }
    }

    public r9p(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.result = new ArrayList();
    }

    /* JADX INFO: renamed from: A */
    private final void m180623A() {
        m180639q().m224834w(dbc0.f86052Cb, new View.OnClickListener() { // from class: l.m9p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r9p.m180626c(this.f135428a, view);
            }
        });
        m180639q().setBackgroundColor(Color.parseColor("#00ffffff"));
        m180639q().setLeftIconOnClick(new View.OnClickListener() { // from class: l.n9p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r9p.m180625b(this.f140931a, view);
            }
        });
        Act act = getAct();
        if (act != null) {
            act.setStatusBarColor(act.getResources().getColor(c9c0.f80383V1));
            PutongAct.setLightStatusBar(act.getWindow(), 16);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m180625b(r9p r9pVar, View view) {
        r9pVar.act.m48999H2();
    }

    /* JADX INFO: renamed from: c */
    public static void m180626c(r9p r9pVar, View view) {
        r9pVar.act.m48999H2();
    }

    /* JADX INFO: renamed from: m */
    public static final void m180631m(r9p r9pVar, Act act) {
        r9pVar.m180633C(false);
        act.m48999H2();
    }

    /* JADX INFO: renamed from: B */
    public final void m180632B(@NotNull IntlMarketQuestionData data) {
        data.getClass();
        if (NullChecker.m82486a(data)) {
            IntlMarketQuestionUIData intlMarketQuestionUIData = data.question_ui;
            intlMarketQuestionUIData.getClass();
            int size = data.questions.size();
            for (int i = 0; i < size; i++) {
                this.result.add(i, -1);
            }
            try {
                String str = intlMarketQuestionUIData.font_color;
                if (str != null) {
                    m180647z().setTextColor(Color.parseColor(str));
                    m180642u().setTextColor(Color.parseColor(str));
                }
                if (!TextUtils.isEmpty(intlMarketQuestionUIData.bg_color)) {
                    m180644w().setBackgroundColor(Color.parseColor(intlMarketQuestionUIData.bg_color));
                }
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
            fsb0 fsb0Var = uqb0.f180374G;
            VDraweeView vDraweeViewM180638p = m180638p();
            String str2 = intlMarketQuestionUIData.bg_url;
            if (str2 == null) {
                str2 = "";
            }
            fsb0Var.m127121O0(vDraweeViewM180638p, str2, true, false, null, null);
            w9p w9pVar = this.adapter;
            w9p w9pVar2 = null;
            if (w9pVar == null) {
                Intrinsics.m88391r("adapter");
                w9pVar = null;
            }
            List<IntlMarketQuestionItemData> list = data.questions;
            list.getClass();
            IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData = data.option_ui;
            intlMarketQuestionOptionUIData.getClass();
            w9pVar.m205619M(intlMarketQuestionUIData, list, intlMarketQuestionOptionUIData, this.result);
            ViewPager2 viewPager2M180646y = m180646y();
            w9p w9pVar3 = this.adapter;
            if (w9pVar3 == null) {
                Intrinsics.m88391r("adapter");
            } else {
                w9pVar2 = w9pVar3;
            }
            viewPager2M180646y.setAdapter(w9pVar2);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m180633C(boolean isShow) {
        if (isShow) {
            bap bapVar = bap.INSTANCE;
            bapVar.m103227f(bapVar.m103223b());
        } else {
            bap bapVar2 = bap.INSTANCE;
            bapVar2.m103226e(bapVar2.m103223b());
        }
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final View m180634d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM189759b = t9p.m189759b(this, inflater, parent);
        viewM189759b.getClass();
        return viewM189759b;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m180634d(inflater, parent);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable l9p presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: l */
    public final void m180636l(@Nullable IntlMarketResponseOptionData data) {
        if (data != null) {
            m180633C(true);
            m180645x().setVisibility(8);
            m180641s().setVisibility(0);
            m180642u().setText(data.desc_in_result);
            uqb0.f180374G.m127115L0(m180643v(), data.option_image_url);
        }
        final Act act = getAct();
        if (act != null) {
            l51.m152888H(act, new Runnable() { // from class: l.o9p
                @Override // java.lang.Runnable
                public final void run() {
                    r9p.m180631m(this.f145618a, act);
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
    public final VDraweeView m180638p() {
        VDraweeView vDraweeView = this._bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VNavigationBar m180639q() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m88391r("_navigation_bar");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m180640r() {
        m180623A();
        m180645x().setVisibility(0);
        m180641s().setVisibility(8);
        m180646y().setUserInputEnabled(false);
        w9p w9pVar = new w9p(this.act);
        this.adapter = w9pVar;
        w9pVar.m205621O(new C19795a());
        w9p w9pVar2 = this.adapter;
        if (w9pVar2 == null) {
            Intrinsics.m88391r("adapter");
            w9pVar2 = null;
        }
        w9pVar2.m205620N(new C19796b());
        m180646y().m4249g(new C19797c());
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final ConstraintLayout m180641s() {
        ConstraintLayout constraintLayout = this._result_layout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_result_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final TextView m180642u() {
        TextView textView = this._result_layout_finding_content_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_result_layout_finding_content_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VDraweeView m180643v() {
        VDraweeView vDraweeView = this._result_layout_finding_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_result_layout_finding_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final FrameLayout m180644w() {
        FrameLayout frameLayout = this._root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final ConstraintLayout m180645x() {
        ConstraintLayout constraintLayout = this._setting_layout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_setting_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final ViewPager2 m180646y() {
        ViewPager2 viewPager2 = this._setting_layout_banner;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.m88391r("_setting_layout_banner");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VText m180647z() {
        VText vText = this._setting_layout_index;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_setting_layout_index");
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
