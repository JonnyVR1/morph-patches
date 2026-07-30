package p009l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.p000p1.mobile.putong.core.p002ui.intloperation.campingactivity.C0426b;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.IntlCampingData;
import com.p1.mobile.putong.core.data.IntlCampingEnvelope;
import com.p1.mobile.putong.core.data.IntlCampingQuestionsData;
import com.p1.mobile.putong.core.data.IntlCampingRequestParams;
import com.p1.mobile.putong.core.data.IntlCampingSummaryData;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundTextView;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.h4n;
import l.lsi0;
import l.nvc0;
import l.qib0;
import l.s7m;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.ym2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u000bJ\u0015\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010#\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010D\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010H\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u00100\u001a\u0004\bF\u00102\"\u0004\bG\u00104R\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010T\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010?\u001a\u0004\bR\u0010A\"\u0004\bS\u0010CR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010d\u001a\u00020]8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010l\u001a\u00020e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010mR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010nR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010oR\u0016\u0010s\u001a\u00020p8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010v\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010uR\u001c\u0010x\u001a\b\u0012\u0004\u0012\u00020t0w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010n¨\u0006y"}, d2 = {"Ll/f4n;", "Ll/s7m;", "Ll/x3n;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/IntlCampingEnvelope;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/IntlCampingEnvelope;)V", "", "z", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "l", "(Ll/x3n;)V", "inflateView", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "Lcom/p1/mobile/putong/core/data/IntlCampingData;", "m", "(Lcom/p1/mobile/putong/core/data/IntlCampingData;)V", "Lcom/p1/mobile/putong/core/data/IntlCampingSummaryData;", "summaryData", "", "Lcom/p1/mobile/putong/core/data/IntlCampingQuestionsData;", "questionsData", "B", "(Lcom/p1/mobile/putong/core/data/IntlCampingSummaryData;Ljava/util/List;)V", "destroy", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/IntlCampingEnvelope;", "getData", "()Lcom/p1/mobile/putong/core/data/IntlCampingEnvelope;", "Lv/VDraweeView;", "c", "Lv/VDraweeView;", "n", "()Lv/VDraweeView;", "set_bg_img", "(Lv/VDraweeView;)V", "_bg_img", "Lv/navigationbar/VNavigationBar;", "d", "Lv/navigationbar/VNavigationBar;", "p", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "q", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_result_layout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_result_layout", "f", "u", "set_result_layout_finding_img", "_result_layout_finding_img", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", "s", "()Landroid/widget/TextView;", "set_result_layout_finding_content_title", "(Landroid/widget/TextView;)V", "_result_layout_finding_content_title", "h", "v", "set_setting_layout", "_setting_layout", "Lv/VText;", "i", "Lv/VText;", "x", "()Lv/VText;", "set_setting_layout_index", "(Lv/VText;)V", "_setting_layout_index", "Landroidx/viewpager2/widget/ViewPager2;", "j", "Landroidx/viewpager2/widget/ViewPager2;", "w", "()Landroidx/viewpager2/widget/ViewPager2;", "set_setting_layout_banner", "(Landroidx/viewpager2/widget/ViewPager2;)V", "_setting_layout_banner", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;", "k", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;", "y", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;", "set_setting_layout_start_btn", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;)V", "_setting_layout_start_btn", "Lcom/p1/mobile/putong/core/data/IntlCampingSummaryData;", "Ljava/util/List;", "Ll/x3n;", "Ll/r3n;", "o", "Ll/r3n;", "adapter", "", "I", "currentPosition", "", "result", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"l/f4n$a", "Ll/r3n$b;", "", "position", "oid", "", "a", "(II)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0885a implements r3n.InterfaceC1165b {
        public C0885a() {
        }

        /* JADX INFO: renamed from: b */
        public static Boolean m14236b(int i) {
            return Boolean.valueOf(-1 == i);
        }

        @Override // p009l.r3n.InterfaceC1165b
        /* JADX INFO: renamed from: a */
        public void mo14237a(int position, int oid) {
            f4n.this.result.set(position, Integer.valueOf(oid));
            int i = f4n.this.currentPosition;
            r3n r3nVar = f4n.this.adapter;
            if (r3nVar == null) {
                Intrinsics.r("adapter");
                r3nVar = null;
            }
            if (i == r3nVar.m21386C() - 1) {
                boolean zM = vwb.m(f4n.this.result, new w9j() { // from class: l.e4n
                    public final Object call(Object obj) {
                        return f4n.C0885a.m14236b(((Integer) obj).intValue());
                    }
                });
                f4n f4nVar = f4n.this;
                if (zM) {
                    f4nVar.m14235y().setAlpha(0.3f);
                } else {
                    f4nVar.m14235y().setAlpha(1.0f);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.f4n$b */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"l/f4n$b", "Ll/r3n$a;", "", "position", "oid", "", "a", "(II)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0886b implements r3n.InterfaceC1164a {
        public C0886b() {
        }

        @Override // p009l.r3n.InterfaceC1164a
        /* JADX INFO: renamed from: a */
        public void mo14238a(int position, int oid) {
            int i = f4n.this.currentPosition;
            r3n r3nVar = f4n.this.adapter;
            if (r3nVar == null) {
                Intrinsics.r("adapter");
                r3nVar = null;
            }
            if (i != r3nVar.m21386C() - 1) {
                f4n.this.m14233w().setCurrentItem(f4n.this.currentPosition + 1);
            }
        }
    }

    /* JADX INFO: renamed from: l.f4n$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/f4n$c", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "onPageSelected", "(I)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0887c extends ViewPager2.i {
        public C0887c() {
        }

        /* JADX INFO: renamed from: a */
        public static Boolean m14239a(int i) {
            return Boolean.valueOf(-1 == i);
        }

        public void onPageSelected(int position) {
            super.onPageSelected(position);
            f4n.this.currentPosition = position;
            VText vTextM14234x = f4n.this.m14234x();
            int i = f4n.this.currentPosition + 1;
            r3n r3nVar = f4n.this.adapter;
            r3n r3nVar2 = null;
            if (r3nVar == null) {
                Intrinsics.r("adapter");
                r3nVar = null;
            }
            vTextM14234x.setText(i + "/" + r3nVar.m21386C());
            int i2 = f4n.this.currentPosition;
            r3n r3nVar3 = f4n.this.adapter;
            if (r3nVar3 == null) {
                Intrinsics.r("adapter");
            } else {
                r3nVar2 = r3nVar3;
            }
            int iM21386C = r3nVar2.m21386C() - 1;
            f4n f4nVar = f4n.this;
            if (i2 != iM21386C) {
                xdl0.M0(f4nVar.m14235y(), false);
                return;
            }
            xdl0.M0(f4nVar.m14235y(), true);
            boolean zM = vwb.m(f4n.this.result, new w9j() { // from class: l.g4n
                public final Object call(Object obj) {
                    return f4n.C0887c.m14239a(((Integer) obj).intValue());
                }
            });
            f4n f4nVar2 = f4n.this;
            if (zM) {
                f4nVar2.m14235y().setAlpha(0.3f);
            } else {
                f4nVar2.m14235y().setAlpha(1.0f);
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
    public static final Unit m14210A(f4n f4nVar, IntlCampingEnvelope intlCampingEnvelope) {
        intlCampingEnvelope.getClass();
        if (intlCampingEnvelope.meta.code == 200) {
            C0426b c0426b = C0426b.INSTANCE;
            String str = intlCampingEnvelope.data.type;
            str.getClass();
            c0426b.m8378m(str);
            c0426b.m8374h().put(Boolean.TRUE);
            IntlCampingData intlCampingData = intlCampingEnvelope.data;
            intlCampingData.getClass();
            f4nVar.m14225m(intlCampingData);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static void m14211a(f4n f4nVar, View view) {
        f4nVar.act.finish();
    }

    /* JADX INFO: renamed from: b */
    public static void m14212b(f4n f4nVar, View view) {
        f4nVar.act.finish();
    }

    /* JADX INFO: renamed from: c */
    public static void m14213c(final f4n f4nVar, View view) {
        if (f4nVar.m14235y().getAlpha() != 1.0f) {
            lsi0.j("您還有題目未答完。");
            return;
        }
        IntlCampingRequestParams intlCampingRequestParams = new IntlCampingRequestParams();
        intlCampingRequestParams.mcc = String.valueOf(qib0.f0);
        intlCampingRequestParams.answer = f4nVar.result;
        CoreModule.c.z1.p3(f4nVar.act, intlCampingRequestParams, new Function1() { // from class: l.b4n
            public final Object invoke(Object obj) {
                return f4n.m14210A(this.f9895a, (IntlCampingEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    private final void m14219z() {
        m14227p().w(x2c0.j9, new View.OnClickListener() { // from class: l.c4n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f4n.m14211a(this.f10433a, view);
            }
        });
        m14227p().setBackgroundColor(Color.parseColor("#00ffffff"));
        m14227p().setLeftIconOnClick(new View.OnClickListener() { // from class: l.d4n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f4n.m14212b(this.f11636a, view);
            }
        });
        Act act = act();
        if (act != null) {
            act.setStatusBarColor(act.getResources().getColor(w0c0.U1));
            PutongAct.setLightStatusBar(act.getWindow(), 16);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m14220B(@NotNull IntlCampingSummaryData summaryData, @NotNull List<? extends IntlCampingQuestionsData> questionsData) {
        summaryData.getClass();
        questionsData.getClass();
        this.summaryData = summaryData;
        this.questionsData = questionsData;
        int size = questionsData.size();
        for (int i = 0; i < size; i++) {
            this.result.add(i, -1);
        }
        try {
            m14234x().setTextColor(Color.parseColor(summaryData.desc_font_color));
            m14230s().setTextColor(Color.parseColor(summaryData.desc_font_color));
            m14235y().setText(summaryData.success_btn_desc);
            m14235y().setTextColor(Color.parseColor(summaryData.btn_font_color));
            m14235y().setBackgroundColor(Color.parseColor(summaryData.btn_bg_color));
        } catch (Exception unused) {
        }
        qib0.G.O0(m14226n(), summaryData.question_bg_url, true, false, (nvc0) null, (ym2) null);
        if (NullChecker.a(this.data)) {
            return;
        }
        r3n r3nVar = this.adapter;
        RecyclerView.Adapter adapter = null;
        if (r3nVar == null) {
            Intrinsics.r("adapter");
            r3nVar = null;
        }
        r3nVar.m21394M(questionsData, this.result);
        ViewPager2 viewPager2M14233w = m14233w();
        RecyclerView.Adapter adapter2 = this.adapter;
        if (adapter2 == null) {
            Intrinsics.r("adapter");
        } else {
            adapter = adapter2;
        }
        viewPager2M14233w.setAdapter(adapter);
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m14221C0() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m14222e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = h4n.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m14222e(inflater, parent);
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m14223i1(@Nullable x3n presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: m */
    public final void m14225m(@NotNull IntlCampingData data) {
        data.getClass();
        m14232v().setVisibility(8);
        m14228q().setVisibility(0);
        m14230s().setText(data.desc);
        qib0.G.L0(m14231u(), data.tag_url);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VDraweeView m14226n() {
        VDraweeView vDraweeView = this._bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VNavigationBar m14227p() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final ConstraintLayout m14228q() {
        ConstraintLayout constraintLayout = this._result_layout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("_result_layout");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m14229r() {
        IntlCampingData intlCampingData;
        m14219z();
        if (NullChecker.a(this.data)) {
            IntlCampingEnvelope intlCampingEnvelope = this.data;
            if (intlCampingEnvelope == null || (intlCampingData = intlCampingEnvelope.data) == null) {
                return;
            }
            m14225m(intlCampingData);
            return;
        }
        m14232v().setVisibility(0);
        m14228q().setVisibility(8);
        r3n r3nVar = new r3n(this.act);
        this.adapter = r3nVar;
        r3nVar.m21396O(new C0885a());
        r3n r3nVar2 = this.adapter;
        if (r3nVar2 == null) {
            Intrinsics.r("adapter");
            r3nVar2 = null;
        }
        r3nVar2.m21395N(new C0886b());
        m14233w().g(new C0887c());
        xdl0.E0(m14235y(), new View.OnClickListener() { // from class: l.a4n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f4n.m14213c(this.f9209a, view);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final TextView m14230s() {
        TextView textView = this._result_layout_finding_content_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_result_layout_finding_content_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VDraweeView m14231u() {
        VDraweeView vDraweeView = this._result_layout_finding_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_result_layout_finding_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final ConstraintLayout m14232v() {
        ConstraintLayout constraintLayout = this._setting_layout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("_setting_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final ViewPager2 m14233w() {
        ViewPager2 viewPager2 = this._setting_layout_banner;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.r("_setting_layout_banner");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VText m14234x() {
        VText vText = this._setting_layout_index;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_setting_layout_index");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final RoundTextView m14235y() {
        RoundTextView roundTextView = this._setting_layout_start_btn;
        if (roundTextView != null) {
            return roundTextView;
        }
        Intrinsics.r("_setting_layout_start_btn");
        return null;
    }

    public void destroy() {
    }
}
