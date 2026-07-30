package p149l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IntlCampingData;
import com.p046p1.mobile.putong.core.data.IntlCampingEnvelope;
import com.p046p1.mobile.putong.core.data.IntlCampingQuestionsData;
import com.p046p1.mobile.putong.core.data.IntlCampingRequestParams;
import com.p046p1.mobile.putong.core.data.IntlCampingSummaryData;
import com.p046p1.mobile.putong.core.p053ui.intloperation.campingactivity.C8382b;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundTextView;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u000bJ\u0015\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010#\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010D\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010H\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u00100\u001a\u0004\bF\u00102\"\u0004\bG\u00104R\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010T\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010?\u001a\u0004\bR\u0010A\"\u0004\bS\u0010CR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010d\u001a\u00020]8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010l\u001a\u00020e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010mR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010nR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010oR\u0016\u0010s\u001a\u00020p8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010v\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010uR\u001c\u0010x\u001a\b\u0012\u0004\u0012\u00020t0w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010n¨\u0006y"}, m87232d2 = {"Ll/f4n;", "Ll/s7m;", "Ll/x3n;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/IntlCampingEnvelope;", "data", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/IntlCampingEnvelope;)V", "", BaseSei.f13932Z, "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", BLiveStormDanmakuGiftResourceType.f44444l, "(Ll/x3n;)V", "inflateView", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "Lcom/p1/mobile/putong/core/data/IntlCampingData;", "m", "(Lcom/p1/mobile/putong/core/data/IntlCampingData;)V", "Lcom/p1/mobile/putong/core/data/IntlCampingSummaryData;", "summaryData", "", "Lcom/p1/mobile/putong/core/data/IntlCampingQuestionsData;", "questionsData", "B", "(Lcom/p1/mobile/putong/core/data/IntlCampingSummaryData;Ljava/util/List;)V", "destroy", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/IntlCampingEnvelope;", "getData", "()Lcom/p1/mobile/putong/core/data/IntlCampingEnvelope;", "Lv/VDraweeView;", "c", "Lv/VDraweeView;", "n", "()Lv/VDraweeView;", "set_bg_img", "(Lv/VDraweeView;)V", "_bg_img", "Lv/navigationbar/VNavigationBar;", Constants.INAPP_DATA_TAG, "Lv/navigationbar/VNavigationBar;", "p", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "q", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_result_layout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_result_layout", "f", "u", "set_result_layout_finding_img", "_result_layout_finding_img", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", BLiveStormDanmakuGiftResourceType.f44446s, "()Landroid/widget/TextView;", "set_result_layout_finding_content_title", "(Landroid/widget/TextView;)V", "_result_layout_finding_content_title", "h", ResourceDirection.f38808v, "set_setting_layout", "_setting_layout", "Lv/VText;", RXScreenCaptureService.KEY_INDEX, "Lv/VText;", BaseSei.f13930X, "()Lv/VText;", "set_setting_layout_index", "(Lv/VText;)V", "_setting_layout_index", "Landroidx/viewpager2/widget/ViewPager2;", "j", "Landroidx/viewpager2/widget/ViewPager2;", "w", "()Landroidx/viewpager2/widget/ViewPager2;", "set_setting_layout_banner", "(Landroidx/viewpager2/widget/ViewPager2;)V", "_setting_layout_banner", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;", "k", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;", BaseSei.f13931Y, "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;", "set_setting_layout_start_btn", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;)V", "_setting_layout_start_btn", "Lcom/p1/mobile/putong/core/data/IntlCampingSummaryData;", "Ljava/util/List;", "Ll/x3n;", "Ll/r3n;", "o", "Ll/r3n;", "adapter", "", "I", "currentPosition", "", LovePlanetStage.result, "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class f4n implements s7m<x3n> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final IntlCampingEnvelope data;

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
    public VText _setting_layout_index;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public ViewPager2 _setting_layout_banner;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public RoundTextView _setting_layout_start_btn;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public IntlCampingSummaryData summaryData;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public List<? extends IntlCampingQuestionsData> questionsData;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public x3n presenter;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public r3n adapter;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int currentPosition;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public List<Integer> result;

    /* JADX INFO: renamed from: l.f4n$a */
    @Metadata(m87231d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"l/f4n$a", "Ll/r3n$b;", "", "position", "oid", "", "a", "(II)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C16754a implements r3n.InterfaceC19630b {
        public C16754a() {
        }

        /* JADX INFO: renamed from: b */
        public static Boolean m119347b(int i) {
            return Boolean.valueOf(-1 == i);
        }

        @Override // p149l.r3n.InterfaceC19630b
        /* JADX INFO: renamed from: a */
        public void mo119348a(int position, int oid) {
            f4n.this.result.set(position, Integer.valueOf(oid));
            int i = f4n.this.currentPosition;
            r3n r3nVar = f4n.this.adapter;
            if (r3nVar == null) {
                Intrinsics.m87502r("adapter");
                r3nVar = null;
            }
            if (i == r3nVar.getPageCount() - 1) {
                boolean zM200337m = vwb.m200337m(f4n.this.result, new w9j() { // from class: l.e4n
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return f4n.C16754a.m119347b(((Integer) obj).intValue());
                    }
                });
                f4n f4nVar = f4n.this;
                if (zM200337m) {
                    f4nVar.m119346y().setAlpha(0.3f);
                } else {
                    f4nVar.m119346y().setAlpha(1.0f);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.f4n$b */
    @Metadata(m87231d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"l/f4n$b", "Ll/r3n$a;", "", "position", "oid", "", "a", "(II)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C16755b implements r3n.InterfaceC19629a {
        public C16755b() {
        }

        @Override // p149l.r3n.InterfaceC19629a
        /* JADX INFO: renamed from: a */
        public void mo119349a(int position, int oid) {
            int i = f4n.this.currentPosition;
            r3n r3nVar = f4n.this.adapter;
            if (r3nVar == null) {
                Intrinsics.m87502r("adapter");
                r3nVar = null;
            }
            if (i != r3nVar.getPageCount() - 1) {
                f4n.this.m119344w().setCurrentItem(f4n.this.currentPosition + 1);
            }
        }
    }

    /* JADX INFO: renamed from: l.f4n$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/f4n$c", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "onPageSelected", "(I)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C16756c extends ViewPager2.AbstractC0740i {
        public C16756c() {
        }

        /* JADX INFO: renamed from: a */
        public static Boolean m119350a(int i) {
            return Boolean.valueOf(-1 == i);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            f4n.this.currentPosition = position;
            VText vTextM119345x = f4n.this.m119345x();
            int i = f4n.this.currentPosition + 1;
            r3n r3nVar = f4n.this.adapter;
            r3n r3nVar2 = null;
            if (r3nVar == null) {
                Intrinsics.m87502r("adapter");
                r3nVar = null;
            }
            vTextM119345x.setText(i + "/" + r3nVar.getPageCount());
            int i2 = f4n.this.currentPosition;
            r3n r3nVar3 = f4n.this.adapter;
            if (r3nVar3 == null) {
                Intrinsics.m87502r("adapter");
            } else {
                r3nVar2 = r3nVar3;
            }
            int pageCount = r3nVar2.getPageCount() - 1;
            f4n f4nVar = f4n.this;
            if (i2 != pageCount) {
                xdl0.m208345M0(f4nVar.m119346y(), false);
                return;
            }
            xdl0.m208345M0(f4nVar.m119346y(), true);
            boolean zM200337m = vwb.m200337m(f4n.this.result, new w9j() { // from class: l.g4n
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return f4n.C16756c.m119350a(((Integer) obj).intValue());
                }
            });
            f4n f4nVar2 = f4n.this;
            if (zM200337m) {
                f4nVar2.m119346y().setAlpha(0.3f);
            } else {
                f4nVar2.m119346y().setAlpha(1.0f);
            }
        }
    }

    public f4n(@NotNull Act act, @Nullable IntlCampingEnvelope intlCampingEnvelope) {
        act.getClass();
        this.act = act;
        this.data = intlCampingEnvelope;
        this.result = new ArrayList();
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m119323A(f4n f4nVar, IntlCampingEnvelope intlCampingEnvelope) {
        intlCampingEnvelope.getClass();
        if (intlCampingEnvelope.meta.code == 200) {
            C8382b c8382b = C8382b.INSTANCE;
            String str = intlCampingEnvelope.data.type;
            str.getClass();
            c8382b.m46290m(str);
            c8382b.m46286h().put(Boolean.TRUE);
            IntlCampingData intlCampingData = intlCampingEnvelope.data;
            intlCampingData.getClass();
            f4nVar.m119336m(intlCampingData);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static void m119324a(f4n f4nVar, View view) {
        f4nVar.act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: b */
    public static void m119325b(f4n f4nVar, View view) {
        f4nVar.act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: c */
    public static void m119326c(final f4n f4nVar, View view) {
        if (f4nVar.m119346y().getAlpha() != 1.0f) {
            lsi0.m151580j("您還有題目未答完。");
            return;
        }
        IntlCampingRequestParams intlCampingRequestParams = new IntlCampingRequestParams();
        intlCampingRequestParams.mcc = String.valueOf(qib0.f154717f0);
        intlCampingRequestParams.answer = f4nVar.result;
        CoreModule.f17545c.f19703z1.m110037p3(f4nVar.act, intlCampingRequestParams, new Function1() { // from class: l.b4n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f4n.m119323A(this.f73390a, (IntlCampingEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    private final void m119332z() {
        m119338p().m223588w(x2c0.f190260j9, new View.OnClickListener() { // from class: l.c4n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f4n.m119324a(this.f79286a, view);
            }
        });
        m119338p().setBackgroundColor(Color.parseColor("#00ffffff"));
        m119338p().setLeftIconOnClick(new View.OnClickListener() { // from class: l.d4n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f4n.m119325b(this.f84318a, view);
            }
        });
        Act act = getAct();
        if (act != null) {
            act.setStatusBarColor(act.getResources().getColor(w0c0.f183811U1));
            PutongAct.setLightStatusBar(act.getWindow(), 16);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m119333B(@NotNull IntlCampingSummaryData summaryData, @NotNull List<? extends IntlCampingQuestionsData> questionsData) {
        summaryData.getClass();
        questionsData.getClass();
        this.summaryData = summaryData;
        this.questionsData = questionsData;
        int size = questionsData.size();
        for (int i = 0; i < size; i++) {
            this.result.add(i, -1);
        }
        try {
            m119345x().setTextColor(Color.parseColor(summaryData.desc_font_color));
            m119341s().setTextColor(Color.parseColor(summaryData.desc_font_color));
            m119346y().setText(summaryData.success_btn_desc);
            m119346y().setTextColor(Color.parseColor(summaryData.btn_font_color));
            m119346y().setBackgroundColor(Color.parseColor(summaryData.btn_bg_color));
        } catch (Exception unused) {
        }
        qib0.f154691G.m102337O0(m119337n(), summaryData.question_bg_url, true, false, null, null);
        if (NullChecker.m81303a(this.data)) {
            return;
        }
        r3n r3nVar = this.adapter;
        r3n r3nVar2 = null;
        if (r3nVar == null) {
            Intrinsics.m87502r("adapter");
            r3nVar = null;
        }
        r3nVar.m177683M(questionsData, this.result);
        ViewPager2 viewPager2M119344w = m119344w();
        r3n r3nVar3 = this.adapter;
        if (r3nVar3 == null) {
            Intrinsics.m87502r("adapter");
        } else {
            r3nVar2 = r3nVar3;
        }
        viewPager2M119344w.setAdapter(r3nVar2);
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m119334e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM129277b = h4n.m129277b(this, inflater, parent);
        viewM129277b.getClass();
        return viewM129277b;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m119334e(inflater, parent);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable x3n presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: m */
    public final void m119336m(@NotNull IntlCampingData data) {
        data.getClass();
        m119343v().setVisibility(8);
        m119339q().setVisibility(0);
        m119341s().setText(data.desc);
        qib0.f154691G.m102331L0(m119342u(), data.tag_url);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VDraweeView m119337n() {
        VDraweeView vDraweeView = this._bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VNavigationBar m119338p() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m87502r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final ConstraintLayout m119339q() {
        ConstraintLayout constraintLayout = this._result_layout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_result_layout");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m119340r() {
        IntlCampingData intlCampingData;
        m119332z();
        if (NullChecker.m81303a(this.data)) {
            IntlCampingEnvelope intlCampingEnvelope = this.data;
            if (intlCampingEnvelope == null || (intlCampingData = intlCampingEnvelope.data) == null) {
                return;
            }
            m119336m(intlCampingData);
            return;
        }
        m119343v().setVisibility(0);
        m119339q().setVisibility(8);
        r3n r3nVar = new r3n(this.act);
        this.adapter = r3nVar;
        r3nVar.m177685O(new C16754a());
        r3n r3nVar2 = this.adapter;
        if (r3nVar2 == null) {
            Intrinsics.m87502r("adapter");
            r3nVar2 = null;
        }
        r3nVar2.m177684N(new C16755b());
        m119344w().m4247g(new C16756c());
        xdl0.m208329E0(m119346y(), new View.OnClickListener() { // from class: l.a4n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f4n.m119326c(this.f67547a, view);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final TextView m119341s() {
        TextView textView = this._result_layout_finding_content_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_result_layout_finding_content_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VDraweeView m119342u() {
        VDraweeView vDraweeView = this._result_layout_finding_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_result_layout_finding_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final ConstraintLayout m119343v() {
        ConstraintLayout constraintLayout = this._setting_layout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_setting_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final ViewPager2 m119344w() {
        ViewPager2 viewPager2 = this._setting_layout_banner;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.m87502r("_setting_layout_banner");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VText m119345x() {
        VText vText = this._setting_layout_index;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_setting_layout_index");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final RoundTextView m119346y() {
        RoundTextView roundTextView = this._setting_layout_start_btn;
        if (roundTextView != null) {
            return roundTextView;
        }
        Intrinsics.m87502r("_setting_layout_start_btn");
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
