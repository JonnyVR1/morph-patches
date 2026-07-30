package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IntlCampingData;
import com.p051p1.mobile.putong.core.data.IntlCampingEnvelope;
import com.p051p1.mobile.putong.core.data.IntlCampingQuestionsData;
import com.p051p1.mobile.putong.core.data.IntlCampingRequestParams;
import com.p051p1.mobile.putong.core.data.IntlCampingSummaryData;
import com.p051p1.mobile.putong.core.p058ui.intloperation.campingactivity.C8545b;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundTextView;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p151v.VDraweeView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u000bJ\u0015\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010#\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010D\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010H\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u00100\u001a\u0004\bF\u00102\"\u0004\bG\u00104R\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010T\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010?\u001a\u0004\bR\u0010A\"\u0004\bS\u0010CR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010d\u001a\u00020]8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010l\u001a\u00020e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010mR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010nR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010oR\u0016\u0010s\u001a\u00020p8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010v\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010uR\u001c\u0010x\u001a\b\u0012\u0004\u0012\u00020t0w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010n¨\u0006y"}, m88121d2 = {"Ll/f6n;", "Ll/iam;", "Ll/x5n;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/IntlCampingEnvelope;", "data", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/IntlCampingEnvelope;)V", "", BaseSei.f14626Z, "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", BLiveStormDanmakuGiftResourceType.f45292l, "(Ll/x5n;)V", "inflateView", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "Lcom/p1/mobile/putong/core/data/IntlCampingData;", "m", "(Lcom/p1/mobile/putong/core/data/IntlCampingData;)V", "Lcom/p1/mobile/putong/core/data/IntlCampingSummaryData;", "summaryData", "", "Lcom/p1/mobile/putong/core/data/IntlCampingQuestionsData;", "questionsData", "B", "(Lcom/p1/mobile/putong/core/data/IntlCampingSummaryData;Ljava/util/List;)V", "destroy", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/IntlCampingEnvelope;", "getData", "()Lcom/p1/mobile/putong/core/data/IntlCampingEnvelope;", "Lv/VDraweeView;", "c", "Lv/VDraweeView;", "n", "()Lv/VDraweeView;", "set_bg_img", "(Lv/VDraweeView;)V", "_bg_img", "Lv/navigationbar/VNavigationBar;", Constants.INAPP_DATA_TAG, "Lv/navigationbar/VNavigationBar;", "p", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "q", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_result_layout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_result_layout", "f", "u", "set_result_layout_finding_img", "_result_layout_finding_img", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", BLiveStormDanmakuGiftResourceType.f45294s, "()Landroid/widget/TextView;", "set_result_layout_finding_content_title", "(Landroid/widget/TextView;)V", "_result_layout_finding_content_title", "h", ResourceDirection.f39656v, "set_setting_layout", "_setting_layout", "Lv/VText;", RXScreenCaptureService.KEY_INDEX, "Lv/VText;", BaseSei.f14624X, "()Lv/VText;", "set_setting_layout_index", "(Lv/VText;)V", "_setting_layout_index", "Landroidx/viewpager2/widget/ViewPager2;", "j", "Landroidx/viewpager2/widget/ViewPager2;", "w", "()Landroidx/viewpager2/widget/ViewPager2;", "set_setting_layout_banner", "(Landroidx/viewpager2/widget/ViewPager2;)V", "_setting_layout_banner", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;", "k", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;", BaseSei.f14625Y, "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;", "set_setting_layout_start_btn", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;)V", "_setting_layout_start_btn", "Lcom/p1/mobile/putong/core/data/IntlCampingSummaryData;", "Ljava/util/List;", "Ll/x5n;", "Ll/r5n;", "o", "Ll/r5n;", "adapter", "", "I", "currentPosition", "", LovePlanetStage.result, "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class f6n implements iam<x5n> {

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
    public x5n presenter;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public r5n adapter;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int currentPosition;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public List<Integer> result;

    /* JADX INFO: renamed from: l.f6n$a */
    @Metadata(m88120d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"l/f6n$a", "Ll/r5n$b;", "", "position", "oid", "", "a", "(II)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16914a implements r5n.InterfaceC19767b {
        public C16914a() {
        }

        /* JADX INFO: renamed from: b */
        public static Boolean m124312b(int i) {
            return Boolean.valueOf(-1 == i);
        }

        @Override // p153l.r5n.InterfaceC19767b
        /* JADX INFO: renamed from: a */
        public void mo124313a(int position, int oid) {
            f6n.this.result.set(position, Integer.valueOf(oid));
            int i = f6n.this.currentPosition;
            r5n r5nVar = f6n.this.adapter;
            if (r5nVar == null) {
                Intrinsics.m88391r("adapter");
                r5nVar = null;
            }
            if (i == r5nVar.getPageCount() - 1) {
                boolean zM147520m = jyb.m147520m(f6n.this.result, new qcj() { // from class: l.e6n
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return f6n.C16914a.m124312b(((Integer) obj).intValue());
                    }
                });
                f6n f6nVar = f6n.this;
                if (zM147520m) {
                    f6nVar.m124311y().setAlpha(0.3f);
                } else {
                    f6nVar.m124311y().setAlpha(1.0f);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.f6n$b */
    @Metadata(m88120d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"l/f6n$b", "Ll/r5n$a;", "", "position", "oid", "", "a", "(II)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16915b implements r5n.InterfaceC19766a {
        public C16915b() {
        }

        @Override // p153l.r5n.InterfaceC19766a
        /* JADX INFO: renamed from: a */
        public void mo124314a(int position, int oid) {
            int i = f6n.this.currentPosition;
            r5n r5nVar = f6n.this.adapter;
            if (r5nVar == null) {
                Intrinsics.m88391r("adapter");
                r5nVar = null;
            }
            if (i != r5nVar.getPageCount() - 1) {
                f6n.this.m124309w().setCurrentItem(f6n.this.currentPosition + 1);
            }
        }
    }

    /* JADX INFO: renamed from: l.f6n$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/f6n$c", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "onPageSelected", "(I)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16916c extends ViewPager2.AbstractC0742i {
        public C16916c() {
        }

        /* JADX INFO: renamed from: a */
        public static Boolean m124315a(int i) {
            return Boolean.valueOf(-1 == i);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            f6n.this.currentPosition = position;
            VText vTextM124310x = f6n.this.m124310x();
            int i = f6n.this.currentPosition + 1;
            r5n r5nVar = f6n.this.adapter;
            r5n r5nVar2 = null;
            if (r5nVar == null) {
                Intrinsics.m88391r("adapter");
                r5nVar = null;
            }
            vTextM124310x.setText(i + "/" + r5nVar.getPageCount());
            int i2 = f6n.this.currentPosition;
            r5n r5nVar3 = f6n.this.adapter;
            if (r5nVar3 == null) {
                Intrinsics.m88391r("adapter");
            } else {
                r5nVar2 = r5nVar3;
            }
            int pageCount = r5nVar2.getPageCount() - 1;
            f6n f6nVar = f6n.this;
            if (i2 != pageCount) {
                bnl0.m105525M0(f6nVar.m124311y(), false);
                return;
            }
            bnl0.m105525M0(f6nVar.m124311y(), true);
            boolean zM147520m = jyb.m147520m(f6n.this.result, new qcj() { // from class: l.g6n
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return f6n.C16916c.m124315a(((Integer) obj).intValue());
                }
            });
            f6n f6nVar2 = f6n.this;
            if (zM147520m) {
                f6nVar2.m124311y().setAlpha(0.3f);
            } else {
                f6nVar2.m124311y().setAlpha(1.0f);
            }
        }
    }

    public f6n(@NotNull Act act, @Nullable IntlCampingEnvelope intlCampingEnvelope) {
        act.getClass();
        this.act = act;
        this.data = intlCampingEnvelope;
        this.result = new ArrayList();
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m124288A(f6n f6nVar, IntlCampingEnvelope intlCampingEnvelope) {
        intlCampingEnvelope.getClass();
        if (intlCampingEnvelope.meta.code == 200) {
            C8545b c8545b = C8545b.INSTANCE;
            String str = intlCampingEnvelope.data.type;
            str.getClass();
            c8545b.m47473m(str);
            c8545b.m47469h().put(Boolean.TRUE);
            IntlCampingData intlCampingData = intlCampingEnvelope.data;
            intlCampingData.getClass();
            f6nVar.m124301m(intlCampingData);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static void m124289a(f6n f6nVar, View view) {
        f6nVar.act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: b */
    public static void m124290b(f6n f6nVar, View view) {
        f6nVar.act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: c */
    public static void m124291c(final f6n f6nVar, View view) {
        if (f6nVar.m124311y().getAlpha() != 1.0f) {
            o1j0.m165636j("您還有題目未答完。");
            return;
        }
        IntlCampingRequestParams intlCampingRequestParams = new IntlCampingRequestParams();
        intlCampingRequestParams.mcc = String.valueOf(uqb0.f180400f0);
        intlCampingRequestParams.answer = f6nVar.result;
        CoreModule.f18264c.f20445z1.m157207p3(f6nVar.act, intlCampingRequestParams, new Function1() { // from class: l.b6n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f6n.m124288A(this.f75199a, (IntlCampingEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    private final void m124297z() {
        m124303p().m224834w(dbc0.f87145k9, new View.OnClickListener() { // from class: l.c6n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f6n.m124289a(this.f79981a, view);
            }
        });
        m124303p().setBackgroundColor(Color.parseColor("#00ffffff"));
        m124303p().setLeftIconOnClick(new View.OnClickListener() { // from class: l.d6n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f6n.m124290b(this.f85386a, view);
            }
        });
        Act act = getAct();
        if (act != null) {
            act.setStatusBarColor(act.getResources().getColor(c9c0.f80383V1));
            PutongAct.setLightStatusBar(act.getWindow(), 16);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m124298B(@NotNull IntlCampingSummaryData summaryData, @NotNull List<? extends IntlCampingQuestionsData> questionsData) {
        summaryData.getClass();
        questionsData.getClass();
        this.summaryData = summaryData;
        this.questionsData = questionsData;
        int size = questionsData.size();
        for (int i = 0; i < size; i++) {
            this.result.add(i, -1);
        }
        try {
            m124310x().setTextColor(Color.parseColor(summaryData.desc_font_color));
            m124306s().setTextColor(Color.parseColor(summaryData.desc_font_color));
            m124311y().setText(summaryData.success_btn_desc);
            m124311y().setTextColor(Color.parseColor(summaryData.btn_font_color));
            m124311y().setBackgroundColor(Color.parseColor(summaryData.btn_bg_color));
        } catch (Exception unused) {
        }
        uqb0.f180374G.m127121O0(m124302n(), summaryData.question_bg_url, true, false, null, null);
        if (NullChecker.m82486a(this.data)) {
            return;
        }
        r5n r5nVar = this.adapter;
        r5n r5nVar2 = null;
        if (r5nVar == null) {
            Intrinsics.m88391r("adapter");
            r5nVar = null;
        }
        r5nVar.m179882M(questionsData, this.result);
        ViewPager2 viewPager2M124309w = m124309w();
        r5n r5nVar3 = this.adapter;
        if (r5nVar3 == null) {
            Intrinsics.m88391r("adapter");
        } else {
            r5nVar2 = r5nVar3;
        }
        viewPager2M124309w.setAdapter(r5nVar2);
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m124299e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM133711b = h6n.m133711b(this, inflater, parent);
        viewM133711b.getClass();
        return viewM133711b;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m124299e(inflater, parent);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable x5n presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: m */
    public final void m124301m(@NotNull IntlCampingData data) {
        data.getClass();
        m124308v().setVisibility(8);
        m124304q().setVisibility(0);
        m124306s().setText(data.desc);
        uqb0.f180374G.m127115L0(m124307u(), data.tag_url);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VDraweeView m124302n() {
        VDraweeView vDraweeView = this._bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VNavigationBar m124303p() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m88391r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final ConstraintLayout m124304q() {
        ConstraintLayout constraintLayout = this._result_layout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_result_layout");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m124305r() {
        IntlCampingData intlCampingData;
        m124297z();
        if (NullChecker.m82486a(this.data)) {
            IntlCampingEnvelope intlCampingEnvelope = this.data;
            if (intlCampingEnvelope == null || (intlCampingData = intlCampingEnvelope.data) == null) {
                return;
            }
            m124301m(intlCampingData);
            return;
        }
        m124308v().setVisibility(0);
        m124304q().setVisibility(8);
        r5n r5nVar = new r5n(this.act);
        this.adapter = r5nVar;
        r5nVar.m179884O(new C16914a());
        r5n r5nVar2 = this.adapter;
        if (r5nVar2 == null) {
            Intrinsics.m88391r("adapter");
            r5nVar2 = null;
        }
        r5nVar2.m179883N(new C16915b());
        m124309w().m4249g(new C16916c());
        bnl0.m105509E0(m124311y(), new View.OnClickListener() { // from class: l.a6n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f6n.m124291c(this.f68741a, view);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final TextView m124306s() {
        TextView textView = this._result_layout_finding_content_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_result_layout_finding_content_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VDraweeView m124307u() {
        VDraweeView vDraweeView = this._result_layout_finding_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_result_layout_finding_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final ConstraintLayout m124308v() {
        ConstraintLayout constraintLayout = this._setting_layout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_setting_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final ViewPager2 m124309w() {
        ViewPager2 viewPager2 = this._setting_layout_banner;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.m88391r("_setting_layout_banner");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VText m124310x() {
        VText vText = this._setting_layout_index;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_setting_layout_index");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final RoundTextView m124311y() {
        RoundTextView roundTextView = this._setting_layout_start_btn;
        if (roundTextView != null) {
            return roundTextView;
        }
        Intrinsics.m88391r("_setting_layout_start_btn");
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
