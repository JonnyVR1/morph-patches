package p153l;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallDetailInfoItem;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallProgress;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallTab;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallUser;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\fJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001e\u0010\u001bJ\u001d\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b#\u0010$J7\u0010(\u001a\u00020\n2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u00103\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u0010\fR\"\u00106\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010/\u001a\u0004\b4\u00101\"\u0004\b5\u0010\fR\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010]\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010i\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010I\u001a\u0004\bg\u0010K\"\u0004\bh\u0010MR\"\u0010m\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010I\u001a\u0004\bk\u0010K\"\u0004\bl\u0010MR\"\u0010q\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010I\u001a\u0004\bo\u0010K\"\u0004\bp\u0010MR\"\u0010u\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010`\u001a\u0004\bs\u0010b\"\u0004\bt\u0010dR\"\u0010x\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010X\u001a\u0004\bv\u0010Z\"\u0004\bw\u0010\\R\"\u0010|\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010Q\u001a\u0004\bz\u0010S\"\u0004\b{\u0010UR&\u0010\u0083\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R(\u0010\u0087\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0084\u0001\u0010~\u001a\u0006\b\u0085\u0001\u0010\u0080\u0001\"\u0006\b\u0086\u0001\u0010\u0082\u0001R(\u0010\u008b\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0088\u0001\u0010~\u001a\u0006\b\u0089\u0001\u0010\u0080\u0001\"\u0006\b\u008a\u0001\u0010\u0082\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R,\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R,\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0091\u0001\u001a\u0006\b\u0098\u0001\u0010\u0093\u0001\"\u0006\b\u0099\u0001\u0010\u0095\u0001R,\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u0091\u0001\u001a\u0006\b\u009c\u0001\u0010\u0093\u0001\"\u0006\b\u009d\u0001\u0010\u0095\u0001¨\u0006\u009f\u0001"}, m88121d2 = {"Ll/bqs;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/jqs;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/jqs;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", BloodType.f39576O, "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;", "giftWallV2", "", "type", "", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGiftDetail;", "j0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;Ljava/lang/String;)Ljava/util/List;", "", FirebaseAnalytics.Param.INDEX, "g0", "(I)V", "h0", "P", "()V", "m", "r", BaseSei.f14624X, "Lv/VRecyclerView;", "recycler", "e0", "(Lv/VRecyclerView;Ll/jqs;)V", "f0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;)V", "allData", "lightData", "darkData", "i0", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "k", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", BLiveStormDanmakuGiftResourceType.f45292l, "Landroid/view/View;", "Y", "()Landroid/view/View;", "set_shadow", "_shadow", p7f.LATITUDE_SOUTH, "set_bg", "_bg", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "n", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", p7f.GPS_DIRECTION_TRUE, "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_bg_svg", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_bg_svg", "Landroid/widget/FrameLayout;", "o", "Landroid/widget/FrameLayout;", "get_title_bg", "()Landroid/widget/FrameLayout;", "set_title_bg", "(Landroid/widget/FrameLayout;)V", "_title_bg", "Landroid/widget/TextView;", "p", "Landroid/widget/TextView;", "d0", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Lv/VText;", "q", "Lv/VText;", "Z", "()Lv/VText;", "set_sub_title", "(Lv/VText;)V", "_sub_title", "Lv/VImage;", "Lv/VImage;", "R", "()Lv/VImage;", "set_back", "(Lv/VImage;)V", "_back", "Lv/VLinear;", BLiveStormDanmakuGiftResourceType.f45294s, "Lv/VLinear;", "get_mini_tabs", "()Lv/VLinear;", "set_mini_tabs", "(Lv/VLinear;)V", "_mini_tabs", Constants.KEY_T, "a0", "set_tab_all", "_tab_all", "u", "c0", "set_tab_light", "_tab_light", ResourceDirection.f39656v, "b0", "set_tab_dark", "_tab_dark", "w", p7f.GPS_MEASUREMENT_INTERRUPTED, "set_empty", "_empty", "get_empty_icon", "set_empty_icon", "_empty_icon", BaseSei.f14625Y, "W", "set_empty_text", "_empty_text", BaseSei.f14626Z, "Lv/VRecyclerView;", "Q", "()Lv/VRecyclerView;", "set_allRecyclerView", "(Lv/VRecyclerView;)V", "_allRecyclerView", "A", "X", "set_lightRecyclerView", "_lightRecyclerView", "B", "U", "set_darkRecyclerView", "_darkRecyclerView", c4s.C_ZONE, "I", "currentIndex", "Ll/rps;", "D", "Ll/rps;", "getAllAdapter", "()Ll/rps;", "setAllAdapter", "(Ll/rps;)V", "allAdapter", "E", "getLightAdapter", "setLightAdapter", "lightAdapter", "F", "getDarkAdapter", "setDarkAdapter", "darkAdapter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class bqs extends LiveMenuDialogHolder<jqs> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VRecyclerView _lightRecyclerView;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VRecyclerView _darkRecyclerView;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public int currentIndex;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public rps allAdapter;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public rps lightAdapter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public rps darkAdapter;

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

    /* JADX INFO: renamed from: l.bqs$a */
    @Metadata(m88120d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"l/bqs$a", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$a0;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16086a extends RecyclerView.AbstractC0578n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C0561a0 state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            outRect.top = qa00.m175859d(8.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqs(@NotNull Act act, @NotNull jqs jqsVar) {
        super(yec0.f198861O1, act, jqsVar);
        act.getClass();
        jqsVar.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: F */
    public static void m105974F(bqs bqsVar, View view) {
        bqsVar.m105984g0(1);
    }

    /* JADX INFO: renamed from: G */
    public static void m105975G(bqs bqsVar, View view) {
        bqsVar.mo73021p();
    }

    /* JADX INFO: renamed from: H */
    public static Boolean m105976H(String str, BLiveNewGiftWallTab bLiveNewGiftWallTab) {
        return Boolean.valueOf(Intrinsics.m88377d(bLiveNewGiftWallTab.type, str));
    }

    /* JADX INFO: renamed from: I */
    public static void m105977I(bqs bqsVar, View view) {
        bqsVar.m105984g0(2);
    }

    /* JADX INFO: renamed from: J */
    public static Boolean m105978J(BLiveNewGiftWallProgress bLiveNewGiftWallProgress) {
        return Boolean.valueOf(Intrinsics.m88377d(bLiveNewGiftWallProgress.type, "normal"));
    }

    /* JADX INFO: renamed from: K */
    public static void m105979K(bqs bqsVar, View view) {
        bqsVar.m105984g0(0);
    }

    /* JADX INFO: renamed from: N */
    public static void m105982N(bqs bqsVar, View view) {
        bqsVar.mo73021p();
    }

    /* JADX INFO: renamed from: P */
    private final void m105983P() {
        if (m106000a0().isSelected()) {
            VLinear vLinearM105995V = m105995V();
            rps rpsVar = this.allAdapter;
            bnl0.m105524M(vLinearM105995V, rpsVar != null && rpsVar.mo29823C() == 0);
            m105996W().setText("暂无数据");
            return;
        }
        if (m106002c0().isSelected()) {
            VLinear vLinearM105995V2 = m105995V();
            rps rpsVar2 = this.lightAdapter;
            bnl0.m105524M(vLinearM105995V2, rpsVar2 != null && rpsVar2.mo29823C() == 0);
            m105996W().setText("尚未收到礼物，快去收集吧");
            return;
        }
        if (m106001b0().isSelected()) {
            VLinear vLinearM105995V3 = m105995V();
            rps rpsVar3 = this.darkAdapter;
            bnl0.m105524M(vLinearM105995V3, rpsVar3 != null && rpsVar3.mo29823C() == 0);
            m105996W().setText("礼物已全部点亮");
        }
    }

    /* JADX INFO: renamed from: g0 */
    private final void m105984g0(int index) {
        this.currentIndex = index;
        m105985h0(index);
        m106000a0().setSelected(index == 0);
        m106002c0().setSelected(index == 1);
        m106001b0().setSelected(index == 2);
        bnl0.m105524M(m105990Q(), index == 0);
        bnl0.m105524M(m105997X(), index == 1);
        bnl0.m105524M(m105994U(), index == 2);
        m105983P();
    }

    /* JADX INFO: renamed from: h0 */
    private final void m105985h0(int index) {
        if (index == 0) {
            m106000a0().setTypeface(Typeface.defaultFromStyle(1));
            m106002c0().setTypeface(Typeface.defaultFromStyle(0));
            m106001b0().setTypeface(Typeface.defaultFromStyle(0));
        } else if (index == 1) {
            m106000a0().setTypeface(Typeface.defaultFromStyle(0));
            m106002c0().setTypeface(Typeface.defaultFromStyle(1));
            m106001b0().setTypeface(Typeface.defaultFromStyle(0));
        } else {
            if (index != 2) {
                return;
            }
            m106000a0().setTypeface(Typeface.defaultFromStyle(0));
            m106002c0().setTypeface(Typeface.defaultFromStyle(0));
            m106001b0().setTypeface(Typeface.defaultFromStyle(1));
        }
    }

    /* JADX INFO: renamed from: j0 */
    private final List<BLiveNewGiftWallGiftDetail> m105986j0(BLiveNewGiftWallDetailInfoItem giftWallV2, final String type) {
        BLiveNewGiftWallTab bLiveNewGiftWallTab = (BLiveNewGiftWallTab) jyb.m147529r(giftWallV2.tabs, new qcj() { // from class: l.yps
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return bqs.m105976H(type, (BLiveNewGiftWallTab) obj);
            }
        });
        List<BLiveNewGiftWallGiftDetail> arrayList = new ArrayList<>();
        List<String> list = bLiveNewGiftWallTab.giftIds;
        list.getClass();
        for (final String str : list) {
            final BLiveNewGiftWallGift bLiveNewGiftWallGift = (BLiveNewGiftWallGift) jyb.m147529r(giftWallV2.gifts, new qcj() { // from class: l.zps
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return bqs.m105987k0(str, (BLiveNewGiftWallGift) obj);
                }
            });
            BLiveNewGiftWallUser bLiveNewGiftWallUser = (BLiveNewGiftWallUser) jyb.m147529r(giftWallV2.users, new qcj() { // from class: l.aqs
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return bqs.m105988l0(bLiveNewGiftWallGift, (BLiveNewGiftWallUser) obj);
                }
            });
            BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetailNew_ = BLiveNewGiftWallGiftDetail.new_();
            bLiveNewGiftWallGiftDetailNew_.gift = bLiveNewGiftWallGift;
            bLiveNewGiftWallGiftDetailNew_.user = bLiveNewGiftWallUser;
            arrayList = jyb.m147500c(arrayList, bLiveNewGiftWallGiftDetailNew_);
            arrayList.getClass();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k0 */
    public static final Boolean m105987k0(String str, BLiveNewGiftWallGift bLiveNewGiftWallGift) {
        return Boolean.valueOf(Intrinsics.m88377d(bLiveNewGiftWallGift.f45259id, str));
    }

    /* JADX INFO: renamed from: l0 */
    public static final Boolean m105988l0(BLiveNewGiftWallGift bLiveNewGiftWallGift, BLiveNewGiftWallUser bLiveNewGiftWallUser) {
        return Boolean.valueOf(Intrinsics.m88377d(bLiveNewGiftWallUser.f45264id, bLiveNewGiftWallGift.namedUserId));
    }

    /* JADX INFO: renamed from: O */
    public final void m105989O(View view) {
        cqs.m111979a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VRecyclerView m105990Q() {
        VRecyclerView vRecyclerView = this._allRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_allRecyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VImage m105991R() {
        VImage vImage = this._back;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_back");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final View m105992S() {
        View view = this._bg;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final AnimEffectPlayer m105993T() {
        AnimEffectPlayer animEffectPlayer = this._bg_svg;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.m88391r("_bg_svg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final VRecyclerView m105994U() {
        VRecyclerView vRecyclerView = this._darkRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_darkRecyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VLinear m105995V() {
        VLinear vLinear = this._empty;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m105996W() {
        VText vText = this._empty_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_empty_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final VRecyclerView m105997X() {
        VRecyclerView vRecyclerView = this._lightRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_lightRecyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final View m105998Y() {
        View view = this._shadow;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_shadow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VText m105999Z() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_sub_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final TextView m106000a0() {
        TextView textView = this._tab_all;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_tab_all");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final TextView m106001b0() {
        TextView textView = this._tab_dark;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_tab_dark");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final TextView m106002c0() {
        TextView textView = this._tab_light;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_tab_light");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final TextView m106003d0() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m106004e0(@NotNull VRecyclerView recycler, @NotNull jqs presenter) {
        recycler.getClass();
        presenter.getClass();
        recycler.setLayoutManager(new GridLayoutManager(presenter.act(), 3));
        recycler.setNestedScrollingEnabled(false);
        recycler.setHasFixedSize(true);
        recycler.addItemDecoration(new C16086a());
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: f0 */
    public final void m106005f0(@NotNull BLiveNewGiftWallDetailInfoItem giftWallV2) {
        giftWallV2.getClass();
        m106003d0().setText(giftWallV2.title);
        BLiveNewGiftWallProgress bLiveNewGiftWallProgress = (BLiveNewGiftWallProgress) jyb.m147529r(giftWallV2.progresses, new qcj() { // from class: l.xps
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return bqs.m105978J((BLiveNewGiftWallProgress) obj);
            }
        });
        m105999Z().setText(bLiveNewGiftWallProgress.current + "/" + bLiveNewGiftWallProgress.total);
        m105993T().m69687n();
        m105993T().m69683j(giftWallV2.bgSvgaUrl, -1);
        if (giftWallV2.tabs.size() > 2) {
            m106000a0().setText(giftWallV2.tabs.get(0).name);
            m106002c0().setText(giftWallV2.tabs.get(1).name);
            m106001b0().setText(giftWallV2.tabs.get(2).name);
        }
        m106006i0(m105986j0(giftWallV2, "all"), m105986j0(giftWallV2, "unlocked"), m105986j0(giftWallV2, "locked"));
    }

    /* JADX INFO: renamed from: i0 */
    public final void m106006i0(@NotNull List<? extends BLiveNewGiftWallGiftDetail> allData, @NotNull List<? extends BLiveNewGiftWallGiftDetail> lightData, @NotNull List<? extends BLiveNewGiftWallGiftDetail> darkData) {
        allData.getClass();
        lightData.getClass();
        darkData.getClass();
        rps rpsVar = this.allAdapter;
        if (rpsVar != null) {
            rpsVar.m182546G(allData);
        }
        rps rpsVar2 = this.lightAdapter;
        if (rpsVar2 != null) {
            rpsVar2.m182546G(lightData);
        }
        rps rpsVar3 = this.darkAdapter;
        if (rpsVar3 != null) {
            rpsVar3.m182546G(darkData);
        }
        m105983P();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(@NotNull View view) {
        view.getClass();
        super.mo73019m(view);
        m105989O(view);
        m106007r();
    }

    /* JADX INFO: renamed from: r */
    public final void m106007r() {
        View viewM105992S = m105992S();
        int i = qa00.f156330q;
        qnp0.m177260c1(viewM105992S, 0, 0, 0, -i, i);
        qnp0.m177260c1(m105993T(), 0, 0, 0, -i, i);
        this.allAdapter = new rps((jqs) this.f48605b);
        this.lightAdapter = new rps((jqs) this.f48605b);
        this.darkAdapter = new rps((jqs) this.f48605b);
        m105990Q().setAdapter(this.allAdapter);
        m105997X().setAdapter(this.lightAdapter);
        m105994U().setAdapter(this.darkAdapter);
        VRecyclerView vRecyclerViewM105990Q = m105990Q();
        T t = this.f48605b;
        t.getClass();
        m106004e0(vRecyclerViewM105990Q, (jqs) t);
        VRecyclerView vRecyclerViewM105997X = m105997X();
        T t2 = this.f48605b;
        t2.getClass();
        m106004e0(vRecyclerViewM105997X, (jqs) t2);
        VRecyclerView vRecyclerViewM105994U = m105994U();
        T t3 = this.f48605b;
        t3.getClass();
        m106004e0(vRecyclerViewM105994U, (jqs) t3);
        bnl0.m105509E0(m106000a0(), new View.OnClickListener() { // from class: l.sps
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bqs.m105979K(this.f170094a, view);
            }
        });
        bnl0.m105509E0(m106002c0(), new View.OnClickListener() { // from class: l.tps
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bqs.m105974F(this.f175647a, view);
            }
        });
        bnl0.m105509E0(m106001b0(), new View.OnClickListener() { // from class: l.ups
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bqs.m105977I(this.f180325a, view);
            }
        });
        bnl0.m105509E0(m105991R(), new View.OnClickListener() { // from class: l.vps
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bqs.m105975G(this.f185301a, view);
            }
        });
        bnl0.m105509E0(m105998Y(), new View.OnClickListener() { // from class: l.wps
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bqs.m105982N(this.f190344a, view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: x */
    public void mo73025x() {
        super.mo73025x();
        m105984g0(0);
    }
}
