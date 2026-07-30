package p002l;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallDetailInfoItem;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftDetail;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallProgress;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallTab;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallUser;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.mep0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VImage;
import v.VLinear;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\fJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001e\u0010\u001bJ\u001d\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b#\u0010$J7\u0010(\u001a\u00020\n2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u00103\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u0010\fR\"\u00106\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010/\u001a\u0004\b4\u00101\"\u0004\b5\u0010\fR\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010]\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010i\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010I\u001a\u0004\bg\u0010K\"\u0004\bh\u0010MR\"\u0010m\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010I\u001a\u0004\bk\u0010K\"\u0004\bl\u0010MR\"\u0010q\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010I\u001a\u0004\bo\u0010K\"\u0004\bp\u0010MR\"\u0010u\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010`\u001a\u0004\bs\u0010b\"\u0004\bt\u0010dR\"\u0010x\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010X\u001a\u0004\bv\u0010Z\"\u0004\bw\u0010\\R\"\u0010|\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010Q\u001a\u0004\bz\u0010S\"\u0004\b{\u0010UR&\u0010\u0083\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R(\u0010\u0087\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0084\u0001\u0010~\u001a\u0006\b\u0085\u0001\u0010\u0080\u0001\"\u0006\b\u0086\u0001\u0010\u0082\u0001R(\u0010\u008b\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0088\u0001\u0010~\u001a\u0006\b\u0089\u0001\u0010\u0080\u0001\"\u0006\b\u008a\u0001\u0010\u0082\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R,\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R,\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0091\u0001\u001a\u0006\b\u0098\u0001\u0010\u0093\u0001\"\u0006\b\u0099\u0001\u0010\u0095\u0001R,\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u0091\u0001\u001a\u0006\b\u009c\u0001\u0010\u0093\u0001\"\u0006\b\u009d\u0001\u0010\u0095\u0001¨\u0006\u009f\u0001"}, d2 = {"Ll/aos;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/ios;", "Lcom/p1/mobile/android/app/Act;", "act", "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/ios;)V", "Landroid/view/View;", "view", "", "O", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;", "giftWallV2", "", "type", "", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGiftDetail;", "j0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;Ljava/lang/String;)Ljava/util/List;", "", "index", "g0", "(I)V", "h0", "P", "()V", "m", "r", "x", "Lv/VRecyclerView;", "recycler", "e0", "(Lv/VRecyclerView;Ll/ios;)V", "f0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;)V", "allData", "lightData", "darkData", "i0", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "k", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "l", "Landroid/view/View;", "Y", "()Landroid/view/View;", "set_shadow", "_shadow", "S", "set_bg", "_bg", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "n", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "T", "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_bg_svg", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_bg_svg", "Landroid/widget/FrameLayout;", "o", "Landroid/widget/FrameLayout;", "get_title_bg", "()Landroid/widget/FrameLayout;", "set_title_bg", "(Landroid/widget/FrameLayout;)V", "_title_bg", "Landroid/widget/TextView;", "p", "Landroid/widget/TextView;", "d0", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Lv/VText;", "q", "Lv/VText;", "Z", "()Lv/VText;", "set_sub_title", "(Lv/VText;)V", "_sub_title", "Lv/VImage;", "Lv/VImage;", "R", "()Lv/VImage;", "set_back", "(Lv/VImage;)V", "_back", "Lv/VLinear;", "s", "Lv/VLinear;", "get_mini_tabs", "()Lv/VLinear;", "set_mini_tabs", "(Lv/VLinear;)V", "_mini_tabs", "t", "a0", "set_tab_all", "_tab_all", "u", "c0", "set_tab_light", "_tab_light", "v", "b0", "set_tab_dark", "_tab_dark", "w", "V", "set_empty", "_empty", "get_empty_icon", "set_empty_icon", "_empty_icon", "y", "W", "set_empty_text", "_empty_text", "z", "Lv/VRecyclerView;", "Q", "()Lv/VRecyclerView;", "set_allRecyclerView", "(Lv/VRecyclerView;)V", "_allRecyclerView", "A", "X", "set_lightRecyclerView", "_lightRecyclerView", "B", "U", "set_darkRecyclerView", "_darkRecyclerView", "C", "I", "currentIndex", "Ll/qns;", "D", "Ll/qns;", "getAllAdapter", "()Ll/qns;", "setAllAdapter", "(Ll/qns;)V", "allAdapter", "E", "getLightAdapter", "setLightAdapter", "lightAdapter", "F", "getDarkAdapter", "setDarkAdapter", "darkAdapter", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class aos extends LiveMenuDialogHolder<ios> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VRecyclerView _lightRecyclerView;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VRecyclerView _darkRecyclerView;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public int currentIndex;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public qns allAdapter;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public qns lightAdapter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public qns darkAdapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public View _shadow;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public View _bg;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public AnimEffectPlayer _bg_svg;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public FrameLayout _title_bg;

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
    public VLinear _empty;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public VImage _empty_icon;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public VText _empty_text;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public VRecyclerView _allRecyclerView;

    /* JADX INFO: renamed from: l.aos$a */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"l/aos$a", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0493a extends RecyclerView.n {
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.z state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            outRect.top = t100.d(8.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aos(@NotNull Act act, @NotNull ios iosVar) {
        super(t6c0.f19625O1, act, iosVar);
        act.getClass();
        iosVar.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: F */
    public static void m9958F(aos aosVar, View view) {
        aosVar.m9968g0(1);
    }

    /* JADX INFO: renamed from: G */
    public static void m9959G(aos aosVar, View view) {
        aosVar.mo5216p();
    }

    /* JADX INFO: renamed from: H */
    public static Boolean m9960H(String str, BLiveNewGiftWallTab bLiveNewGiftWallTab) {
        return Boolean.valueOf(Intrinsics.d(bLiveNewGiftWallTab.type, str));
    }

    /* JADX INFO: renamed from: I */
    public static void m9961I(aos aosVar, View view) {
        aosVar.m9968g0(2);
    }

    /* JADX INFO: renamed from: J */
    public static Boolean m9962J(BLiveNewGiftWallProgress bLiveNewGiftWallProgress) {
        return Boolean.valueOf(Intrinsics.d(bLiveNewGiftWallProgress.type, "normal"));
    }

    /* JADX INFO: renamed from: K */
    public static void m9963K(aos aosVar, View view) {
        aosVar.m9968g0(0);
    }

    /* JADX INFO: renamed from: N */
    public static void m9966N(aos aosVar, View view) {
        aosVar.mo5216p();
    }

    /* JADX INFO: renamed from: P */
    private final void m9967P() {
        if (m9984a0().isSelected()) {
            VLinear vLinearM9979V = m9979V();
            qns qnsVar = this.allAdapter;
            xdl0.M(vLinearM9979V, qnsVar != null && qnsVar.m21487C() == 0);
            m9980W().setText("暂无数据");
            return;
        }
        if (m9986c0().isSelected()) {
            VLinear vLinearM9979V2 = m9979V();
            qns qnsVar2 = this.lightAdapter;
            xdl0.M(vLinearM9979V2, qnsVar2 != null && qnsVar2.m21487C() == 0);
            m9980W().setText("尚未收到礼物，快去收集吧");
            return;
        }
        if (m9985b0().isSelected()) {
            VLinear vLinearM9979V3 = m9979V();
            qns qnsVar3 = this.darkAdapter;
            xdl0.M(vLinearM9979V3, qnsVar3 != null && qnsVar3.m21487C() == 0);
            m9980W().setText("礼物已全部点亮");
        }
    }

    /* JADX INFO: renamed from: g0 */
    private final void m9968g0(int index) {
        this.currentIndex = index;
        m9969h0(index);
        m9984a0().setSelected(index == 0);
        m9986c0().setSelected(index == 1);
        m9985b0().setSelected(index == 2);
        xdl0.M(m9974Q(), index == 0);
        xdl0.M(m9981X(), index == 1);
        xdl0.M(m9978U(), index == 2);
        m9967P();
    }

    /* JADX INFO: renamed from: h0 */
    private final void m9969h0(int index) {
        if (index == 0) {
            m9984a0().setTypeface(Typeface.defaultFromStyle(1));
            m9986c0().setTypeface(Typeface.defaultFromStyle(0));
            m9985b0().setTypeface(Typeface.defaultFromStyle(0));
        } else if (index == 1) {
            m9984a0().setTypeface(Typeface.defaultFromStyle(0));
            m9986c0().setTypeface(Typeface.defaultFromStyle(1));
            m9985b0().setTypeface(Typeface.defaultFromStyle(0));
        } else {
            if (index != 2) {
                return;
            }
            m9984a0().setTypeface(Typeface.defaultFromStyle(0));
            m9986c0().setTypeface(Typeface.defaultFromStyle(0));
            m9985b0().setTypeface(Typeface.defaultFromStyle(1));
        }
    }

    /* JADX INFO: renamed from: j0 */
    private final List<BLiveNewGiftWallGiftDetail> m9970j0(BLiveNewGiftWallDetailInfoItem giftWallV2, final String type) {
        BLiveNewGiftWallTab bLiveNewGiftWallTab = (BLiveNewGiftWallTab) vwb.r(giftWallV2.tabs, new w9j() { // from class: l.xns
            public final Object call(Object obj) {
                return aos.m9960H(type, (BLiveNewGiftWallTab) obj);
            }
        });
        List<BLiveNewGiftWallGiftDetail> arrayList = new ArrayList<>();
        List<String> list = bLiveNewGiftWallTab.giftIds;
        list.getClass();
        for (final String str : list) {
            final BLiveNewGiftWallGift bLiveNewGiftWallGift = (BLiveNewGiftWallGift) vwb.r(giftWallV2.gifts, new w9j() { // from class: l.yns
                public final Object call(Object obj) {
                    return aos.m9971k0(str, (BLiveNewGiftWallGift) obj);
                }
            });
            BLiveNewGiftWallUser bLiveNewGiftWallUser = (BLiveNewGiftWallUser) vwb.r(giftWallV2.users, new w9j() { // from class: l.zns
                public final Object call(Object obj) {
                    return aos.m9972l0(bLiveNewGiftWallGift, (BLiveNewGiftWallUser) obj);
                }
            });
            BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetailNew_ = BLiveNewGiftWallGiftDetail.new_();
            bLiveNewGiftWallGiftDetailNew_.gift = bLiveNewGiftWallGift;
            bLiveNewGiftWallGiftDetailNew_.user = bLiveNewGiftWallUser;
            arrayList = vwb.c(arrayList, bLiveNewGiftWallGiftDetailNew_);
            arrayList.getClass();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k0 */
    public static final Boolean m9971k0(String str, BLiveNewGiftWallGift bLiveNewGiftWallGift) {
        return Boolean.valueOf(Intrinsics.d(bLiveNewGiftWallGift.id, str));
    }

    /* JADX INFO: renamed from: l0 */
    public static final Boolean m9972l0(BLiveNewGiftWallGift bLiveNewGiftWallGift, BLiveNewGiftWallUser bLiveNewGiftWallUser) {
        return Boolean.valueOf(Intrinsics.d(bLiveNewGiftWallUser.id, bLiveNewGiftWallGift.namedUserId));
    }

    /* JADX INFO: renamed from: O */
    public final void m9973O(View view) {
        bos.m10538a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VRecyclerView m9974Q() {
        VRecyclerView vRecyclerView = this._allRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.r("_allRecyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VImage m9975R() {
        VImage vImage = this._back;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_back");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final View m9976S() {
        View view = this._bg;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final AnimEffectPlayer m9977T() {
        AnimEffectPlayer animEffectPlayer = this._bg_svg;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.r("_bg_svg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final VRecyclerView m9978U() {
        VRecyclerView vRecyclerView = this._darkRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.r("_darkRecyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VLinear m9979V() {
        VLinear vLinear = this._empty;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m9980W() {
        VText vText = this._empty_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_empty_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final VRecyclerView m9981X() {
        VRecyclerView vRecyclerView = this._lightRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.r("_lightRecyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final View m9982Y() {
        View view = this._shadow;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_shadow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VText m9983Z() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_sub_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final TextView m9984a0() {
        TextView textView = this._tab_all;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_tab_all");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final TextView m9985b0() {
        TextView textView = this._tab_dark;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_tab_dark");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final TextView m9986c0() {
        TextView textView = this._tab_light;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_tab_light");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final TextView m9987d0() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_title");
        return null;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m9988e0(@NotNull VRecyclerView recycler, @NotNull ios presenter) {
        recycler.getClass();
        presenter.getClass();
        recycler.setLayoutManager(new GridLayoutManager(presenter.act(), 3));
        recycler.setNestedScrollingEnabled(false);
        recycler.setHasFixedSize(true);
        recycler.addItemDecoration(new C0493a());
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: f0 */
    public final void m9989f0(@NotNull BLiveNewGiftWallDetailInfoItem giftWallV2) {
        giftWallV2.getClass();
        m9987d0().setText(giftWallV2.title);
        BLiveNewGiftWallProgress bLiveNewGiftWallProgress = (BLiveNewGiftWallProgress) vwb.r(giftWallV2.progresses, new w9j() { // from class: l.wns
            public final Object call(Object obj) {
                return aos.m9962J((BLiveNewGiftWallProgress) obj);
            }
        });
        m9983Z().setText(bLiveNewGiftWallProgress.current + "/" + bLiveNewGiftWallProgress.total);
        m9977T().n();
        m9977T().j(giftWallV2.bgSvgaUrl, -1);
        if (giftWallV2.tabs.size() > 2) {
            m9984a0().setText(((BLiveNewGiftWallTab) giftWallV2.tabs.get(0)).name);
            m9986c0().setText(((BLiveNewGiftWallTab) giftWallV2.tabs.get(1)).name);
            m9985b0().setText(((BLiveNewGiftWallTab) giftWallV2.tabs.get(2)).name);
        }
        m9990i0(m9970j0(giftWallV2, "all"), m9970j0(giftWallV2, "unlocked"), m9970j0(giftWallV2, "locked"));
    }

    /* JADX INFO: renamed from: i0 */
    public final void m9990i0(@NotNull List<? extends BLiveNewGiftWallGiftDetail> allData, @NotNull List<? extends BLiveNewGiftWallGiftDetail> lightData, @NotNull List<? extends BLiveNewGiftWallGiftDetail> darkData) {
        allData.getClass();
        lightData.getClass();
        darkData.getClass();
        qns qnsVar = this.allAdapter;
        if (qnsVar != null) {
            qnsVar.m21491G(allData);
        }
        qns qnsVar2 = this.lightAdapter;
        if (qnsVar2 != null) {
            qnsVar2.m21491G(lightData);
        }
        qns qnsVar3 = this.darkAdapter;
        if (qnsVar3 != null) {
            qnsVar3.m21491G(darkData);
        }
        m9967P();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(@NotNull View view) {
        view.getClass();
        super.mo5214m(view);
        m9973O(view);
        m9991r();
    }

    /* JADX INFO: renamed from: r */
    public final void m9991r() {
        View viewM9976S = m9976S();
        int i = t100.q;
        mep0.c1(viewM9976S, 0, 0, 0, -i, i);
        mep0.c1(m9977T(), 0, 0, 0, -i, i);
        this.allAdapter = new qns((ios) this.f3799b);
        this.lightAdapter = new qns((ios) this.f3799b);
        this.darkAdapter = new qns((ios) this.f3799b);
        m9974Q().setAdapter(this.allAdapter);
        m9981X().setAdapter(this.lightAdapter);
        m9978U().setAdapter(this.darkAdapter);
        VRecyclerView vRecyclerViewM9974Q = m9974Q();
        T t = this.f3799b;
        t.getClass();
        m9988e0(vRecyclerViewM9974Q, (ios) t);
        VRecyclerView vRecyclerViewM9981X = m9981X();
        T t2 = this.f3799b;
        t2.getClass();
        m9988e0(vRecyclerViewM9981X, (ios) t2);
        VRecyclerView vRecyclerViewM9978U = m9978U();
        T t3 = this.f3799b;
        t3.getClass();
        m9988e0(vRecyclerViewM9978U, (ios) t3);
        xdl0.E0(m9984a0(), new View.OnClickListener() { // from class: l.rns
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aos.m9963K(this.f18620a, view);
            }
        });
        xdl0.E0(m9986c0(), new View.OnClickListener() { // from class: l.sns
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aos.m9958F(this.f19138a, view);
            }
        });
        xdl0.E0(m9985b0(), new View.OnClickListener() { // from class: l.tns
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aos.m9961I(this.f20314a, view);
            }
        });
        xdl0.E0(m9975R(), new View.OnClickListener() { // from class: l.uns
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aos.m9959G(this.f20737a, view);
            }
        });
        xdl0.E0(m9982Y(), new View.OnClickListener() { // from class: l.vns
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aos.m9966N(this.f21246a, view);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: x */
    public void mo5220x() {
        super.mo5220x();
        m9968g0(0);
    }
}
