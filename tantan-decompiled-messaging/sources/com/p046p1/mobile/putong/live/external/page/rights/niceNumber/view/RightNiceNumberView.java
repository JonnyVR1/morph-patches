package com.p046p1.mobile.putong.live.external.page.rights.niceNumber.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveNiceNumberDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveNiceNumberList;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.page.rights.niceNumber.view.RightNiceNumberView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VText;
import p149l.a4d0;
import p149l.n4d0;
import p149l.w8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\b\u0007*\u0001p\u0018\u0000 t2\u00020\u0001:\u0001uB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0019¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u001d¢\u0006\u0004\b#\u0010$R\"\u0010+\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010.\u001a\u0004\bA\u00100\"\u0004\bB\u00102R\"\u0010G\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010:\u001a\u0004\bE\u0010<\"\u0004\bF\u0010>R\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010S\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010J\u001a\u0004\bQ\u0010L\"\u0004\bR\u0010NR\"\u0010W\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010J\u001a\u0004\bU\u0010L\"\u0004\bV\u0010NR\"\u0010[\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010J\u001a\u0004\bY\u0010L\"\u0004\bZ\u0010NR\"\u0010_\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010J\u001a\u0004\b]\u0010L\"\u0004\b^\u0010NR\"\u0010c\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010J\u001a\u0004\ba\u0010L\"\u0004\bb\u0010NR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020H0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010i\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010JR\u0018\u0010l\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010o\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010r¨\u0006v"}, m87232d2 = {"Lcom/p1/mobile/putong/live/external/page/rights/niceNumber/view/RightNiceNumberView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "i0", "(Landroid/view/View;)V", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveNiceNumberDetail;", "niceNumberDetail", "Ll/a4d0;", "listenerAdapter", "q0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNiceNumberDetail;Ll/a4d0;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNiceNumberList;", "niceNumberList", "", "isFromRefresh", "r0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNiceNumberList;Z)V", "", "getSelectNumber", "()Ljava/lang/String;", "p0", "()Z", "selectNumber", "o0", "(Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/external/page/rights/niceNumber/view/RightNiceNumberView;", "get_root", "()Lcom/p1/mobile/putong/live/external/page/rights/niceNumber/view/RightNiceNumberView;", "set_root", "(Lcom/p1/mobile/putong/live/external/page/rights/niceNumber/view/RightNiceNumberView;)V", "_root", "Lv/VText;", "e", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "f", "get_current_num", "set_current_num", "_current_num", "Lv/VImage;", "g", "Lv/VImage;", "get_arrow", "()Lv/VImage;", "set_arrow", "(Lv/VImage;)V", "_arrow", "h", "get_next_num", "set_next_num", "_next_num", RXScreenCaptureService.KEY_INDEX, "get_refresh", "set_refresh", "_refresh", "Lcom/p1/mobile/putong/live/external/page/rights/niceNumber/view/RightNiceNumberItemView;", "j", "Lcom/p1/mobile/putong/live/external/page/rights/niceNumber/view/RightNiceNumberItemView;", "get_number_one", "()Lcom/p1/mobile/putong/live/external/page/rights/niceNumber/view/RightNiceNumberItemView;", "set_number_one", "(Lcom/p1/mobile/putong/live/external/page/rights/niceNumber/view/RightNiceNumberItemView;)V", "_number_one", "k", "get_number_two", "set_number_two", "_number_two", BLiveStormDanmakuGiftResourceType.f44444l, "get_number_three", "set_number_three", "_number_three", "m", "get_number_four", "set_number_four", "_number_four", "n", "get_number_five", "set_number_five", "_number_five", "o", "get_number_six", "set_number_six", "_number_six", "", "p", "Ljava/util/List;", "itemList", "q", "currentSelectNumberView", "r", "Ll/a4d0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, BLiveStormDanmakuGiftResourceType.f44446s, "I", "equipStatus", "com/p1/mobile/putong/live/external/page/rights/niceNumber/view/RightNiceNumberView$b", Constants.KEY_T, "Lcom/p1/mobile/putong/live/external/page/rights/niceNumber/view/RightNiceNumberView$b;", "actionListener", "Companion", "a", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class RightNiceNumberView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public RightNiceNumberView _root;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _current_num;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VImage _arrow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _next_num;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VImage _refresh;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public RightNiceNumberItemView _number_one;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public RightNiceNumberItemView _number_two;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public RightNiceNumberItemView _number_three;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public RightNiceNumberItemView _number_four;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public RightNiceNumberItemView _number_five;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public RightNiceNumberItemView _number_six;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final List<RightNiceNumberItemView> itemList;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public RightNiceNumberItemView currentSelectNumberView;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public a4d0 listener;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int equipStatus;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final C12579b actionListener;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.rights.niceNumber.view.RightNiceNumberView$b */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"com/p1/mobile/putong/live/external/page/rights/niceNumber/view/RightNiceNumberView$b", "Ll/a4d0;", "Lcom/p1/mobile/putong/live/external/page/rights/niceNumber/view/RightNiceNumberItemView;", "numberView", "", "b", "(Lcom/p1/mobile/putong/live/external/page/rights/niceNumber/view/RightNiceNumberItemView;)V", "", "a", "()Z", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12579b extends a4d0 {
        public C12579b() {
        }

        @Override // p149l.a4d0, p149l.z3d0
        /* JADX INFO: renamed from: a */
        public boolean mo70678a() {
            a4d0 a4d0Var = RightNiceNumberView.this.listener;
            if (a4d0Var != null) {
                return a4d0Var.mo70678a();
            }
            return false;
        }

        @Override // p149l.a4d0, p149l.z3d0
        /* JADX INFO: renamed from: b */
        public void mo70679b(RightNiceNumberItemView numberView) {
            RightNiceNumberItemView rightNiceNumberItemView;
            numberView.getClass();
            if (RightNiceNumberView.this.currentSelectNumberView != null && !Intrinsics.m87488d(RightNiceNumberView.this.currentSelectNumberView, numberView) && (rightNiceNumberItemView = RightNiceNumberView.this.currentSelectNumberView) != null) {
                rightNiceNumberItemView.m70665r();
            }
            RightNiceNumberView.this.currentSelectNumberView = numberView;
            int i = RightNiceNumberView.this.equipStatus;
            RightNiceNumberView rightNiceNumberView = RightNiceNumberView.this;
            if (i == 1) {
                rightNiceNumberView.equipStatus = 2;
                a4d0 a4d0Var = RightNiceNumberView.this.listener;
                if (a4d0Var != null) {
                    a4d0Var.mo94830c(RightNiceNumberView.this.equipStatus);
                    return;
                }
                return;
            }
            if (rightNiceNumberView.equipStatus == 2 || RightNiceNumberView.this.equipStatus == 3) {
                RightNiceNumberView.this.equipStatus = 3;
                xdl0.m208344M(RightNiceNumberView.this.get_arrow(), true);
                xdl0.m208344M(RightNiceNumberView.this.get_next_num(), true);
                RightNiceNumberView.this.get_next_num().setText(numberView.getText());
                a4d0 a4d0Var2 = RightNiceNumberView.this.listener;
                if (a4d0Var2 != null) {
                    a4d0Var2.mo94830c(RightNiceNumberView.this.equipStatus);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RightNiceNumberView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.itemList = new ArrayList();
        this.equipStatus = 1;
        this.actionListener = new C12579b();
    }

    /* JADX INFO: renamed from: h0 */
    public static void m70667h0(RightNiceNumberView rightNiceNumberView, View view) {
        a4d0 a4d0Var = rightNiceNumberView.listener;
        if (a4d0Var != null) {
            a4d0Var.mo94831d();
        }
    }

    @NotNull
    public final String getSelectNumber() {
        RightNiceNumberItemView rightNiceNumberItemView = this.currentSelectNumberView;
        return rightNiceNumberItemView != null ? rightNiceNumberItemView.getText().toString() : "";
    }

    @NotNull
    public final VImage get_arrow() {
        VImage vImage = this._arrow;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_arrow");
        return null;
    }

    @NotNull
    public final VText get_current_num() {
        VText vText = this._current_num;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_current_num");
        return null;
    }

    @NotNull
    public final VText get_next_num() {
        VText vText = this._next_num;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_next_num");
        return null;
    }

    @NotNull
    public final RightNiceNumberItemView get_number_five() {
        RightNiceNumberItemView rightNiceNumberItemView = this._number_five;
        if (rightNiceNumberItemView != null) {
            return rightNiceNumberItemView;
        }
        Intrinsics.m87502r("_number_five");
        return null;
    }

    @NotNull
    public final RightNiceNumberItemView get_number_four() {
        RightNiceNumberItemView rightNiceNumberItemView = this._number_four;
        if (rightNiceNumberItemView != null) {
            return rightNiceNumberItemView;
        }
        Intrinsics.m87502r("_number_four");
        return null;
    }

    @NotNull
    public final RightNiceNumberItemView get_number_one() {
        RightNiceNumberItemView rightNiceNumberItemView = this._number_one;
        if (rightNiceNumberItemView != null) {
            return rightNiceNumberItemView;
        }
        Intrinsics.m87502r("_number_one");
        return null;
    }

    @NotNull
    public final RightNiceNumberItemView get_number_six() {
        RightNiceNumberItemView rightNiceNumberItemView = this._number_six;
        if (rightNiceNumberItemView != null) {
            return rightNiceNumberItemView;
        }
        Intrinsics.m87502r("_number_six");
        return null;
    }

    @NotNull
    public final RightNiceNumberItemView get_number_three() {
        RightNiceNumberItemView rightNiceNumberItemView = this._number_three;
        if (rightNiceNumberItemView != null) {
            return rightNiceNumberItemView;
        }
        Intrinsics.m87502r("_number_three");
        return null;
    }

    @NotNull
    public final RightNiceNumberItemView get_number_two() {
        RightNiceNumberItemView rightNiceNumberItemView = this._number_two;
        if (rightNiceNumberItemView != null) {
            return rightNiceNumberItemView;
        }
        Intrinsics.m87502r("_number_two");
        return null;
    }

    @NotNull
    public final VImage get_refresh() {
        VImage vImage = this._refresh;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_refresh");
        return null;
    }

    @NotNull
    public final RightNiceNumberView get_root() {
        RightNiceNumberView rightNiceNumberView = this._root;
        if (rightNiceNumberView != null) {
            return rightNiceNumberView;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m70673i0(View view) {
        n4d0.m157839a(this, view);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m70674o0(@NotNull String selectNumber) {
        selectNumber.getClass();
        get_title().setText(w8u.m202217t(R$string.f44898e0));
        get_current_num().setText(selectNumber);
        xdl0.m208344M(get_current_num(), true);
        xdl0.m208344M(get_arrow(), false);
        xdl0.m208344M(get_next_num(), false);
        this.equipStatus = 2;
        RightNiceNumberItemView rightNiceNumberItemView = this.currentSelectNumberView;
        if (rightNiceNumberItemView != null) {
            rightNiceNumberItemView.m70665r();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70673i0(this);
        this.itemList.add(get_number_one());
        this.itemList.add(get_number_two());
        this.itemList.add(get_number_three());
        this.itemList.add(get_number_four());
        this.itemList.add(get_number_five());
        this.itemList.add(get_number_six());
        xdl0.m208329E0(get_refresh(), new View.OnClickListener() { // from class: l.j4d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RightNiceNumberView.m70667h0(this.f116178a, view);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m70675p0() {
        return this.equipStatus == 3;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m70676q0(@NotNull BLiveNiceNumberDetail niceNumberDetail, @NotNull a4d0 listenerAdapter) {
        niceNumberDetail.getClass();
        listenerAdapter.getClass();
        this.listener = listenerAdapter;
        String str = niceNumberDetail.number;
        str.getClass();
        if (str.length() <= 0) {
            get_title().setText(w8u.m202217t(R$string.f44910k0));
            xdl0.m208344M(get_current_num(), false);
            xdl0.m208344M(get_arrow(), false);
            xdl0.m208344M(get_next_num(), false);
            this.equipStatus = 1;
            return;
        }
        get_title().setText(w8u.m202217t(R$string.f44898e0));
        get_current_num().setText(niceNumberDetail.number);
        xdl0.m208344M(get_current_num(), true);
        xdl0.m208344M(get_arrow(), false);
        xdl0.m208344M(get_next_num(), false);
        this.equipStatus = 2;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m70677r0(@NotNull BLiveNiceNumberList niceNumberList, boolean isFromRefresh) {
        niceNumberList.getClass();
        List<String> list = niceNumberList.numbers;
        list.getClass();
        int i = 0;
        for (Object obj : this.itemList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            RightNiceNumberItemView rightNiceNumberItemView = (RightNiceNumberItemView) obj;
            if (i < list.size()) {
                String str = list.get(i);
                str.getClass();
                rightNiceNumberItemView.m70664q(str, this.actionListener);
            } else {
                rightNiceNumberItemView.m70663p();
            }
            i = i2;
        }
        if (isFromRefresh) {
            xdl0.m208344M(get_arrow(), false);
            xdl0.m208344M(get_next_num(), false);
        }
    }

    public final void set_arrow(@NotNull VImage vImage) {
        vImage.getClass();
        this._arrow = vImage;
    }

    public final void set_current_num(@NotNull VText vText) {
        vText.getClass();
        this._current_num = vText;
    }

    public final void set_next_num(@NotNull VText vText) {
        vText.getClass();
        this._next_num = vText;
    }

    public final void set_number_five(@NotNull RightNiceNumberItemView rightNiceNumberItemView) {
        rightNiceNumberItemView.getClass();
        this._number_five = rightNiceNumberItemView;
    }

    public final void set_number_four(@NotNull RightNiceNumberItemView rightNiceNumberItemView) {
        rightNiceNumberItemView.getClass();
        this._number_four = rightNiceNumberItemView;
    }

    public final void set_number_one(@NotNull RightNiceNumberItemView rightNiceNumberItemView) {
        rightNiceNumberItemView.getClass();
        this._number_one = rightNiceNumberItemView;
    }

    public final void set_number_six(@NotNull RightNiceNumberItemView rightNiceNumberItemView) {
        rightNiceNumberItemView.getClass();
        this._number_six = rightNiceNumberItemView;
    }

    public final void set_number_three(@NotNull RightNiceNumberItemView rightNiceNumberItemView) {
        rightNiceNumberItemView.getClass();
        this._number_three = rightNiceNumberItemView;
    }

    public final void set_number_two(@NotNull RightNiceNumberItemView rightNiceNumberItemView) {
        rightNiceNumberItemView.getClass();
        this._number_two = rightNiceNumberItemView;
    }

    public final void set_refresh(@NotNull VImage vImage) {
        vImage.getClass();
        this._refresh = vImage;
    }

    public final void set_root(@NotNull RightNiceNumberView rightNiceNumberView) {
        rightNiceNumberView.getClass();
        this._root = rightNiceNumberView;
    }

    public final void set_title(@NotNull VText vText) {
        vText.getClass();
        this._title = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RightNiceNumberView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RightNiceNumberView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ RightNiceNumberView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
