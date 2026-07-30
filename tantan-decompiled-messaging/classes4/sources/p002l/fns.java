package p002l;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallDetailInfoItem;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftDetail;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallProgress;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallSetDetail;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallSubTab;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallTab;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallUser;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.hxs;
import l.mep0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\fJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001e\u0010\u001bJ\u001d\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b#\u0010$J7\u0010(\u001a\u00020\n2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u00103\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u0010\fR\"\u00106\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010/\u001a\u0004\b4\u00101\"\u0004\b5\u0010\fR\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010]\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010i\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010I\u001a\u0004\bg\u0010K\"\u0004\bh\u0010MR\"\u0010m\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010I\u001a\u0004\bk\u0010K\"\u0004\bl\u0010MR\"\u0010q\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010I\u001a\u0004\bo\u0010K\"\u0004\bp\u0010MR\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\"\u0010|\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010X\u001a\u0004\bz\u0010Z\"\u0004\b{\u0010\\R#\u0010\u0080\u0001\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b}\u0010Q\u001a\u0004\b~\u0010S\"\u0004\b\u007f\u0010UR)\u0010\u0087\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R)\u0010\u008b\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0082\u0001\u001a\u0006\b\u0089\u0001\u0010\u0084\u0001\"\u0006\b\u008a\u0001\u0010\u0086\u0001R)\u0010\u008f\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u0082\u0001\u001a\u0006\b\u008d\u0001\u0010\u0084\u0001\"\u0006\b\u008e\u0001\u0010\u0086\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001c\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0095\u0001R\u001c\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0095\u0001¨\u0006\u009b\u0001"}, d2 = {"Ll/fns;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/lns;", "Lcom/p1/mobile/android/app/Act;", "act", "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/lns;)V", "Landroid/view/View;", "view", "", "O", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;", "giftWallV2", "", "type", "", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallSetDetail;", "i0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;Ljava/lang/String;)Ljava/util/List;", "", "index", "f0", "(I)V", "g0", "P", "()V", "m", "r", "x", "Lv/VRecyclerView;", "recycler", "d0", "(Lv/VRecyclerView;Ll/lns;)V", "e0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;)V", "allData", "lightData", "darkData", "h0", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "k", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "l", "Landroid/view/View;", "X", "()Landroid/view/View;", "set_shadow", "_shadow", "S", "set_bg", "_bg", "Lv/VDraweeView;", "n", "Lv/VDraweeView;", "T", "()Lv/VDraweeView;", "set_bg_img", "(Lv/VDraweeView;)V", "_bg_img", "Landroidx/constraintlayout/widget/ConstraintLayout;", "o", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_title_bg", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_title_bg", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_title_bg", "Landroid/widget/TextView;", "p", "Landroid/widget/TextView;", "c0", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Lv/VText;", "q", "Lv/VText;", "Y", "()Lv/VText;", "set_sub_title", "(Lv/VText;)V", "_sub_title", "Lv/VImage;", "Lv/VImage;", "R", "()Lv/VImage;", "set_back", "(Lv/VImage;)V", "_back", "Lv/VLinear;", "s", "Lv/VLinear;", "get_mini_tabs", "()Lv/VLinear;", "set_mini_tabs", "(Lv/VLinear;)V", "_mini_tabs", "t", "Z", "set_tab_all", "_tab_all", "u", "b0", "set_tab_light", "_tab_light", "v", "a0", "set_tab_dark", "_tab_dark", "Landroid/widget/LinearLayout;", "w", "Landroid/widget/LinearLayout;", "V", "()Landroid/widget/LinearLayout;", "set_empty", "(Landroid/widget/LinearLayout;)V", "_empty", "get_empty_icon", "set_empty_icon", "_empty_icon", "y", "get_empty_text", "set_empty_text", "_empty_text", "z", "Lv/VRecyclerView;", "Q", "()Lv/VRecyclerView;", "set_allRecyclerView", "(Lv/VRecyclerView;)V", "_allRecyclerView", "A", "W", "set_lightRecyclerView", "_lightRecyclerView", "B", "U", "set_darkRecyclerView", "_darkRecyclerView", "C", "I", "currentIndex", "Ll/vms;", "D", "Ll/vms;", "allAdapter", "E", "lightAdapter", "F", "darkAdapter", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class fns extends LiveMenuDialogHolder<lns> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VRecyclerView _lightRecyclerView;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VRecyclerView _darkRecyclerView;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public int currentIndex;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public vms allAdapter;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public vms lightAdapter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public vms darkAdapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public View _shadow;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public View _bg;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VDraweeView _bg_img;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public ConstraintLayout _title_bg;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VText _sub_title;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VImage _back;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public VLinear _mini_tabs;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public TextView _tab_all;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public TextView _tab_light;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public TextView _tab_dark;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public LinearLayout _empty;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public VImage _empty_icon;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public VText _empty_text;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public VRecyclerView _allRecyclerView;

    /* JADX INFO: renamed from: l.fns$a */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"l/fns$a", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0575a extends RecyclerView.n {
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.z state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            if (parent.getChildAdapterPosition(view) <= 0) {
                outRect.top = t100.d(16.0f);
            } else {
                outRect.top = t100.d(24.0f);
            }
            RecyclerView.Adapter adapter = parent.getAdapter();
            adapter.getClass();
            if (adapter.getItemCount() - 1 == parent.getChildAdapterPosition(view)) {
                outRect.bottom = t100.d(50.0f);
            } else {
                outRect.bottom = t100.d(0.0f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fns(@NotNull Act act, @NotNull lns lnsVar) {
        super(t6c0.f19589L1, act, lnsVar);
        act.getClass();
        lnsVar.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: F */
    public static Boolean m13403F(String str, BLiveNewGiftWallTab bLiveNewGiftWallTab) {
        return Boolean.valueOf(Intrinsics.d(bLiveNewGiftWallTab.type, str));
    }

    /* JADX INFO: renamed from: G */
    public static Boolean m13404G(BLiveNewGiftWallProgress bLiveNewGiftWallProgress) {
        return Boolean.valueOf(Intrinsics.d(bLiveNewGiftWallProgress.type, "normal"));
    }

    /* JADX INFO: renamed from: I */
    public static void m13406I(fns fnsVar, View view) {
        fnsVar.m13413f0(1);
    }

    /* JADX INFO: renamed from: J */
    public static void m13407J(fns fnsVar, View view) {
        fnsVar.mo5216p();
    }

    /* JADX INFO: renamed from: K */
    public static void m13408K(fns fnsVar, View view) {
        fnsVar.m13413f0(0);
    }

    /* JADX INFO: renamed from: L */
    public static void m13409L(fns fnsVar, View view) {
        fnsVar.mo5216p();
    }

    /* JADX INFO: renamed from: N */
    public static void m13411N(fns fnsVar, View view) {
        fnsVar.m13413f0(2);
    }

    /* JADX INFO: renamed from: P */
    private final void m13412P() {
        if (m13428Z().isSelected()) {
            LinearLayout linearLayoutM13424V = m13424V();
            vms vmsVar = this.allAdapter;
            xdl0.M(linearLayoutM13424V, vmsVar != null && vmsVar.m24068C() == 0);
        } else if (m13430b0().isSelected()) {
            LinearLayout linearLayoutM13424V2 = m13424V();
            vms vmsVar2 = this.lightAdapter;
            xdl0.M(linearLayoutM13424V2, vmsVar2 != null && vmsVar2.m24068C() == 0);
        } else if (m13429a0().isSelected()) {
            LinearLayout linearLayoutM13424V3 = m13424V();
            vms vmsVar3 = this.darkAdapter;
            xdl0.M(linearLayoutM13424V3, vmsVar3 != null && vmsVar3.m24068C() == 0);
        }
    }

    /* JADX INFO: renamed from: f0 */
    private final void m13413f0(int index) {
        this.currentIndex = index;
        m13414g0(index);
        m13428Z().setSelected(index == 0);
        m13430b0().setSelected(index == 1);
        m13429a0().setSelected(index == 2);
        xdl0.M(m13419Q(), index == 0);
        xdl0.M(m13425W(), index == 1);
        xdl0.M(m13423U(), index == 2);
        m13412P();
    }

    /* JADX INFO: renamed from: g0 */
    private final void m13414g0(int index) {
        if (index == 0) {
            m13428Z().setTypeface(Typeface.defaultFromStyle(1));
            m13430b0().setTypeface(Typeface.defaultFromStyle(0));
            m13429a0().setTypeface(Typeface.defaultFromStyle(0));
        } else if (index == 1) {
            m13428Z().setTypeface(Typeface.defaultFromStyle(0));
            m13430b0().setTypeface(Typeface.defaultFromStyle(1));
            m13429a0().setTypeface(Typeface.defaultFromStyle(0));
        } else {
            if (index != 2) {
                return;
            }
            m13428Z().setTypeface(Typeface.defaultFromStyle(0));
            m13430b0().setTypeface(Typeface.defaultFromStyle(0));
            m13429a0().setTypeface(Typeface.defaultFromStyle(1));
        }
    }

    /* JADX INFO: renamed from: i0 */
    private final List<BLiveNewGiftWallSetDetail> m13415i0(BLiveNewGiftWallDetailInfoItem giftWallV2, final String type) {
        BLiveNewGiftWallTab bLiveNewGiftWallTab = (BLiveNewGiftWallTab) vwb.r(giftWallV2.tabs, new w9j() { // from class: l.cns
            public final Object call(Object obj) {
                return fns.m13403F(type, (BLiveNewGiftWallTab) obj);
            }
        });
        List<BLiveNewGiftWallSetDetail> arrayList = new ArrayList<>();
        if (bLiveNewGiftWallTab != null) {
            List<BLiveNewGiftWallSubTab> list = bLiveNewGiftWallTab.subTabs;
            list.getClass();
            for (BLiveNewGiftWallSubTab bLiveNewGiftWallSubTab : list) {
                BLiveNewGiftWallSetDetail bLiveNewGiftWallSetDetailNew_ = BLiveNewGiftWallSetDetail.new_();
                bLiveNewGiftWallSetDetailNew_.subTab = bLiveNewGiftWallSubTab;
                List arrayList2 = new ArrayList();
                List<String> list2 = bLiveNewGiftWallSubTab.giftIds;
                list2.getClass();
                for (final String str : list2) {
                    BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetailNew_ = BLiveNewGiftWallGiftDetail.new_();
                    final BLiveNewGiftWallGift bLiveNewGiftWallGift = (BLiveNewGiftWallGift) vwb.r(giftWallV2.gifts, new w9j() { // from class: l.dns
                        public final Object call(Object obj) {
                            return fns.m13416j0(str, (BLiveNewGiftWallGift) obj);
                        }
                    });
                    BLiveNewGiftWallUser bLiveNewGiftWallUser = (BLiveNewGiftWallUser) vwb.r(giftWallV2.users, new w9j() { // from class: l.ens
                        public final Object call(Object obj) {
                            return fns.m13417k0(bLiveNewGiftWallGift, (BLiveNewGiftWallUser) obj);
                        }
                    });
                    bLiveNewGiftWallGiftDetailNew_.gift = bLiveNewGiftWallGift;
                    bLiveNewGiftWallGiftDetailNew_.user = bLiveNewGiftWallUser;
                    arrayList2 = vwb.c(arrayList2, bLiveNewGiftWallGiftDetailNew_);
                    arrayList2.getClass();
                }
                bLiveNewGiftWallSetDetailNew_.gifts = arrayList2;
                arrayList = vwb.c(arrayList, bLiveNewGiftWallSetDetailNew_);
                arrayList.getClass();
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j0 */
    public static final Boolean m13416j0(String str, BLiveNewGiftWallGift bLiveNewGiftWallGift) {
        return Boolean.valueOf(Intrinsics.d(bLiveNewGiftWallGift.id, str));
    }

    /* JADX INFO: renamed from: k0 */
    public static final Boolean m13417k0(BLiveNewGiftWallGift bLiveNewGiftWallGift, BLiveNewGiftWallUser bLiveNewGiftWallUser) {
        return Boolean.valueOf(Intrinsics.d(bLiveNewGiftWallUser.id, bLiveNewGiftWallGift.namedUserId));
    }

    /* JADX INFO: renamed from: O */
    public final void m13418O(View view) {
        gns.m13976a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VRecyclerView m13419Q() {
        VRecyclerView vRecyclerView = this._allRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.r("_allRecyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VImage m13420R() {
        VImage vImage = this._back;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_back");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final View m13421S() {
        View view = this._bg;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final VDraweeView m13422T() {
        VDraweeView vDraweeView = this._bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final VRecyclerView m13423U() {
        VRecyclerView vRecyclerView = this._darkRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.r("_darkRecyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final LinearLayout m13424V() {
        LinearLayout linearLayout = this._empty;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VRecyclerView m13425W() {
        VRecyclerView vRecyclerView = this._lightRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.r("_lightRecyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final View m13426X() {
        View view = this._shadow;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_shadow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final VText m13427Y() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_sub_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final TextView m13428Z() {
        TextView textView = this._tab_all;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_tab_all");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final TextView m13429a0() {
        TextView textView = this._tab_dark;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_tab_dark");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final TextView m13430b0() {
        TextView textView = this._tab_light;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_tab_light");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final TextView m13431c0() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_title");
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m13432d0(@NotNull VRecyclerView recycler, @NotNull lns presenter) {
        recycler.getClass();
        presenter.getClass();
        recycler.setLayoutManager(new LinearLayoutManager(presenter.act()));
        recycler.setNestedScrollingEnabled(false);
        recycler.setHasFixedSize(true);
        recycler.addItemDecoration(new C0575a());
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: e0 */
    public final void m13433e0(@NotNull BLiveNewGiftWallDetailInfoItem giftWallV2) {
        giftWallV2.getClass();
        m13431c0().setText(giftWallV2.title);
        BLiveNewGiftWallProgress bLiveNewGiftWallProgress = (BLiveNewGiftWallProgress) vwb.r(giftWallV2.progresses, new w9j() { // from class: l.bns
            public final Object call(Object obj) {
                return fns.m13404G((BLiveNewGiftWallProgress) obj);
            }
        });
        m13427Y().setText(bLiveNewGiftWallProgress.current + "/" + bLiveNewGiftWallProgress.total);
        if (giftWallV2.tabs.size() > 2) {
            m13428Z().setText(((BLiveNewGiftWallTab) giftWallV2.tabs.get(0)).name);
            m13430b0().setText(((BLiveNewGiftWallTab) giftWallV2.tabs.get(1)).name);
            m13429a0().setText(((BLiveNewGiftWallTab) giftWallV2.tabs.get(2)).name);
        }
        hxs.t("context_livingAct", m13422T(), giftWallV2.bgUrl, 480);
        m13434h0(m13415i0(giftWallV2, "all"), m13415i0(giftWallV2, "unlocked"), m13415i0(giftWallV2, "locked"));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m13434h0(@NotNull List<? extends BLiveNewGiftWallSetDetail> allData, @NotNull List<? extends BLiveNewGiftWallSetDetail> lightData, @NotNull List<? extends BLiveNewGiftWallSetDetail> darkData) {
        allData.getClass();
        lightData.getClass();
        darkData.getClass();
        vms vmsVar = this.allAdapter;
        if (vmsVar != null) {
            vmsVar.m24072G(allData);
        }
        vms vmsVar2 = this.lightAdapter;
        if (vmsVar2 != null) {
            vmsVar2.m24072G(lightData);
        }
        vms vmsVar3 = this.darkAdapter;
        if (vmsVar3 != null) {
            vmsVar3.m24072G(darkData);
        }
        m13412P();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(@NotNull View view) {
        view.getClass();
        super.mo5214m(view);
        m13418O(view);
        m13435r();
    }

    /* JADX INFO: renamed from: r */
    public final void m13435r() {
        View viewM13421S = m13421S();
        int i = t100.q;
        mep0.c1(viewM13421S, 0, 0, 0, -i, i);
        mep0.c1(m13422T(), 0, 0, 0, -i, i);
        T t = this.f3799b;
        t.getClass();
        this.allAdapter = new vms((lns) t);
        T t2 = this.f3799b;
        t2.getClass();
        this.lightAdapter = new vms((lns) t2);
        T t3 = this.f3799b;
        t3.getClass();
        this.darkAdapter = new vms((lns) t3);
        m13419Q().setAdapter(this.allAdapter);
        m13425W().setAdapter(this.lightAdapter);
        m13423U().setAdapter(this.darkAdapter);
        VRecyclerView vRecyclerViewM13419Q = m13419Q();
        T t4 = this.f3799b;
        t4.getClass();
        m13432d0(vRecyclerViewM13419Q, (lns) t4);
        VRecyclerView vRecyclerViewM13425W = m13425W();
        T t5 = this.f3799b;
        t5.getClass();
        m13432d0(vRecyclerViewM13425W, (lns) t5);
        VRecyclerView vRecyclerViewM13423U = m13423U();
        T t6 = this.f3799b;
        t6.getClass();
        m13432d0(vRecyclerViewM13423U, (lns) t6);
        m13413f0(0);
        xdl0.E0(m13428Z(), new View.OnClickListener() { // from class: l.wms
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fns.m13408K(this.f21837a, view);
            }
        });
        xdl0.E0(m13430b0(), new View.OnClickListener() { // from class: l.xms
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fns.m13406I(this.f22360a, view);
            }
        });
        xdl0.E0(m13429a0(), new View.OnClickListener() { // from class: l.yms
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fns.m13411N(this.f22980a, view);
            }
        });
        xdl0.E0(m13420R(), new View.OnClickListener() { // from class: l.zms
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fns.m13407J(this.f23512a, view);
            }
        });
        xdl0.E0(m13426X(), new View.OnClickListener() { // from class: l.ans
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fns.m13409L(this.f7770a, view);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: x */
    public void mo5220x() {
        super.mo5220x();
        m13413f0(0);
    }
}
