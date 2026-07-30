package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallDetailInfoItem;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallProgress;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallTab;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallUser;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\fJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001e\u0010\u001bJ\u001d\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b#\u0010$J7\u0010(\u001a\u00020\n2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u00103\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u0010\fR\"\u00106\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010/\u001a\u0004\b4\u00101\"\u0004\b5\u0010\fR\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010]\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010i\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010I\u001a\u0004\bg\u0010K\"\u0004\bh\u0010MR\"\u0010m\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010I\u001a\u0004\bk\u0010K\"\u0004\bl\u0010MR\"\u0010q\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010I\u001a\u0004\bo\u0010K\"\u0004\bp\u0010MR\"\u0010u\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010`\u001a\u0004\bs\u0010b\"\u0004\bt\u0010dR\"\u0010x\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010X\u001a\u0004\bv\u0010Z\"\u0004\bw\u0010\\R\"\u0010|\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010Q\u001a\u0004\bz\u0010S\"\u0004\b{\u0010UR&\u0010\u0083\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R(\u0010\u0087\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0084\u0001\u0010~\u001a\u0006\b\u0085\u0001\u0010\u0080\u0001\"\u0006\b\u0086\u0001\u0010\u0082\u0001R(\u0010\u008b\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0088\u0001\u0010~\u001a\u0006\b\u0089\u0001\u0010\u0080\u0001\"\u0006\b\u008a\u0001\u0010\u0082\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R,\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R,\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0091\u0001\u001a\u0006\b\u0098\u0001\u0010\u0093\u0001\"\u0006\b\u0099\u0001\u0010\u0095\u0001R,\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u0091\u0001\u001a\u0006\b\u009c\u0001\u0010\u0093\u0001\"\u0006\b\u009d\u0001\u0010\u0095\u0001¨\u0006\u009f\u0001"}, m87232d2 = {"Ll/aos;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/ios;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/ios;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", BloodType.f38728O, "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;", "giftWallV2", "", "type", "", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGiftDetail;", "j0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;Ljava/lang/String;)Ljava/util/List;", "", FirebaseAnalytics.Param.INDEX, "g0", "(I)V", "h0", "P", "()V", "m", "r", BaseSei.f13930X, "Lv/VRecyclerView;", "recycler", "e0", "(Lv/VRecyclerView;Ll/ios;)V", "f0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;)V", "allData", "lightData", "darkData", "i0", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "k", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", BLiveStormDanmakuGiftResourceType.f44444l, "Landroid/view/View;", "Y", "()Landroid/view/View;", "set_shadow", "_shadow", j6f.LATITUDE_SOUTH, "set_bg", "_bg", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "n", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", j6f.GPS_DIRECTION_TRUE, "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_bg_svg", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_bg_svg", "Landroid/widget/FrameLayout;", "o", "Landroid/widget/FrameLayout;", "get_title_bg", "()Landroid/widget/FrameLayout;", "set_title_bg", "(Landroid/widget/FrameLayout;)V", "_title_bg", "Landroid/widget/TextView;", "p", "Landroid/widget/TextView;", "d0", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Lv/VText;", "q", "Lv/VText;", "Z", "()Lv/VText;", "set_sub_title", "(Lv/VText;)V", "_sub_title", "Lv/VImage;", "Lv/VImage;", "R", "()Lv/VImage;", "set_back", "(Lv/VImage;)V", "_back", "Lv/VLinear;", BLiveStormDanmakuGiftResourceType.f44446s, "Lv/VLinear;", "get_mini_tabs", "()Lv/VLinear;", "set_mini_tabs", "(Lv/VLinear;)V", "_mini_tabs", Constants.KEY_T, "a0", "set_tab_all", "_tab_all", "u", "c0", "set_tab_light", "_tab_light", ResourceDirection.f38808v, "b0", "set_tab_dark", "_tab_dark", "w", j6f.GPS_MEASUREMENT_INTERRUPTED, "set_empty", "_empty", "get_empty_icon", "set_empty_icon", "_empty_icon", BaseSei.f13931Y, "W", "set_empty_text", "_empty_text", BaseSei.f13932Z, "Lv/VRecyclerView;", "Q", "()Lv/VRecyclerView;", "set_allRecyclerView", "(Lv/VRecyclerView;)V", "_allRecyclerView", "A", "X", "set_lightRecyclerView", "_lightRecyclerView", "B", "U", "set_darkRecyclerView", "_darkRecyclerView", b2s.C_ZONE, "I", "currentIndex", "Ll/qns;", "D", "Ll/qns;", "getAllAdapter", "()Ll/qns;", "setAllAdapter", "(Ll/qns;)V", "allAdapter", "E", "getLightAdapter", "setLightAdapter", "lightAdapter", "F", "getDarkAdapter", "setDarkAdapter", "darkAdapter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    @Metadata(m87231d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"l/aos$a", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C15681a extends RecyclerView.AbstractC0576n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C0588z state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            outRect.top = t100.m186890d(8.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aos(@NotNull Act act, @NotNull ios iosVar) {
        super(t6c0.f168129O1, act, iosVar);
        act.getClass();
        iosVar.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: F */
    public static void m97951F(aos aosVar, View view) {
        aosVar.m97961g0(1);
    }

    /* JADX INFO: renamed from: G */
    public static void m97952G(aos aosVar, View view) {
        aosVar.mo71838p();
    }

    /* JADX INFO: renamed from: H */
    public static Boolean m97953H(String str, BLiveNewGiftWallTab bLiveNewGiftWallTab) {
        return Boolean.valueOf(Intrinsics.m87488d(bLiveNewGiftWallTab.type, str));
    }

    /* JADX INFO: renamed from: I */
    public static void m97954I(aos aosVar, View view) {
        aosVar.m97961g0(2);
    }

    /* JADX INFO: renamed from: J */
    public static Boolean m97955J(BLiveNewGiftWallProgress bLiveNewGiftWallProgress) {
        return Boolean.valueOf(Intrinsics.m87488d(bLiveNewGiftWallProgress.type, "normal"));
    }

    /* JADX INFO: renamed from: K */
    public static void m97956K(aos aosVar, View view) {
        aosVar.m97961g0(0);
    }

    /* JADX INFO: renamed from: N */
    public static void m97959N(aos aosVar, View view) {
        aosVar.mo71838p();
    }

    /* JADX INFO: renamed from: P */
    private final void m97960P() {
        if (m97977a0().isSelected()) {
            VLinear vLinearM97972V = m97972V();
            qns qnsVar = this.allAdapter;
            xdl0.m208344M(vLinearM97972V, qnsVar != null && qnsVar.mo28824C() == 0);
            m97973W().setText("暂无数据");
            return;
        }
        if (m97979c0().isSelected()) {
            VLinear vLinearM97972V2 = m97972V();
            qns qnsVar2 = this.lightAdapter;
            xdl0.m208344M(vLinearM97972V2, qnsVar2 != null && qnsVar2.mo28824C() == 0);
            m97973W().setText("尚未收到礼物，快去收集吧");
            return;
        }
        if (m97978b0().isSelected()) {
            VLinear vLinearM97972V3 = m97972V();
            qns qnsVar3 = this.darkAdapter;
            xdl0.m208344M(vLinearM97972V3, qnsVar3 != null && qnsVar3.mo28824C() == 0);
            m97973W().setText("礼物已全部点亮");
        }
    }

    /* JADX INFO: renamed from: g0 */
    private final void m97961g0(int index) {
        this.currentIndex = index;
        m97962h0(index);
        m97977a0().setSelected(index == 0);
        m97979c0().setSelected(index == 1);
        m97978b0().setSelected(index == 2);
        xdl0.m208344M(m97967Q(), index == 0);
        xdl0.m208344M(m97974X(), index == 1);
        xdl0.m208344M(m97971U(), index == 2);
        m97960P();
    }

    /* JADX INFO: renamed from: h0 */
    private final void m97962h0(int index) {
        if (index == 0) {
            m97977a0().setTypeface(Typeface.defaultFromStyle(1));
            m97979c0().setTypeface(Typeface.defaultFromStyle(0));
            m97978b0().setTypeface(Typeface.defaultFromStyle(0));
        } else if (index == 1) {
            m97977a0().setTypeface(Typeface.defaultFromStyle(0));
            m97979c0().setTypeface(Typeface.defaultFromStyle(1));
            m97978b0().setTypeface(Typeface.defaultFromStyle(0));
        } else {
            if (index != 2) {
                return;
            }
            m97977a0().setTypeface(Typeface.defaultFromStyle(0));
            m97979c0().setTypeface(Typeface.defaultFromStyle(0));
            m97978b0().setTypeface(Typeface.defaultFromStyle(1));
        }
    }

    /* JADX INFO: renamed from: j0 */
    private final List<BLiveNewGiftWallGiftDetail> m97963j0(BLiveNewGiftWallDetailInfoItem giftWallV2, final String type) {
        BLiveNewGiftWallTab bLiveNewGiftWallTab = (BLiveNewGiftWallTab) vwb.m200346r(giftWallV2.tabs, new w9j() { // from class: l.xns
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return aos.m97953H(type, (BLiveNewGiftWallTab) obj);
            }
        });
        List<BLiveNewGiftWallGiftDetail> arrayList = new ArrayList<>();
        List<String> list = bLiveNewGiftWallTab.giftIds;
        list.getClass();
        for (final String str : list) {
            final BLiveNewGiftWallGift bLiveNewGiftWallGift = (BLiveNewGiftWallGift) vwb.m200346r(giftWallV2.gifts, new w9j() { // from class: l.yns
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return aos.m97964k0(str, (BLiveNewGiftWallGift) obj);
                }
            });
            BLiveNewGiftWallUser bLiveNewGiftWallUser = (BLiveNewGiftWallUser) vwb.m200346r(giftWallV2.users, new w9j() { // from class: l.zns
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return aos.m97965l0(bLiveNewGiftWallGift, (BLiveNewGiftWallUser) obj);
                }
            });
            BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetailNew_ = BLiveNewGiftWallGiftDetail.new_();
            bLiveNewGiftWallGiftDetailNew_.gift = bLiveNewGiftWallGift;
            bLiveNewGiftWallGiftDetailNew_.user = bLiveNewGiftWallUser;
            arrayList = vwb.m200317c(arrayList, bLiveNewGiftWallGiftDetailNew_);
            arrayList.getClass();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k0 */
    public static final Boolean m97964k0(String str, BLiveNewGiftWallGift bLiveNewGiftWallGift) {
        return Boolean.valueOf(Intrinsics.m87488d(bLiveNewGiftWallGift.f44411id, str));
    }

    /* JADX INFO: renamed from: l0 */
    public static final Boolean m97965l0(BLiveNewGiftWallGift bLiveNewGiftWallGift, BLiveNewGiftWallUser bLiveNewGiftWallUser) {
        return Boolean.valueOf(Intrinsics.m87488d(bLiveNewGiftWallUser.f44416id, bLiveNewGiftWallGift.namedUserId));
    }

    /* JADX INFO: renamed from: O */
    public final void m97966O(View view) {
        bos.m102982a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VRecyclerView m97967Q() {
        VRecyclerView vRecyclerView = this._allRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m87502r("_allRecyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VImage m97968R() {
        VImage vImage = this._back;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_back");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final View m97969S() {
        View view = this._bg;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final AnimEffectPlayer m97970T() {
        AnimEffectPlayer animEffectPlayer = this._bg_svg;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.m87502r("_bg_svg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final VRecyclerView m97971U() {
        VRecyclerView vRecyclerView = this._darkRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m87502r("_darkRecyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VLinear m97972V() {
        VLinear vLinear = this._empty;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VText m97973W() {
        VText vText = this._empty_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_empty_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final VRecyclerView m97974X() {
        VRecyclerView vRecyclerView = this._lightRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m87502r("_lightRecyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final View m97975Y() {
        View view = this._shadow;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_shadow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VText m97976Z() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_sub_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final TextView m97977a0() {
        TextView textView = this._tab_all;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_tab_all");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final TextView m97978b0() {
        TextView textView = this._tab_dark;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_tab_dark");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final TextView m97979c0() {
        TextView textView = this._tab_light;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_tab_light");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final TextView m97980d0() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m97981e0(@NotNull VRecyclerView recycler, @NotNull ios presenter) {
        recycler.getClass();
        presenter.getClass();
        recycler.setLayoutManager(new GridLayoutManager(presenter.act(), 3));
        recycler.setNestedScrollingEnabled(false);
        recycler.setHasFixedSize(true);
        recycler.addItemDecoration(new C15681a());
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: f0 */
    public final void m97982f0(@NotNull BLiveNewGiftWallDetailInfoItem giftWallV2) {
        giftWallV2.getClass();
        m97980d0().setText(giftWallV2.title);
        BLiveNewGiftWallProgress bLiveNewGiftWallProgress = (BLiveNewGiftWallProgress) vwb.m200346r(giftWallV2.progresses, new w9j() { // from class: l.wns
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return aos.m97955J((BLiveNewGiftWallProgress) obj);
            }
        });
        m97976Z().setText(bLiveNewGiftWallProgress.current + "/" + bLiveNewGiftWallProgress.total);
        m97970T().m68504n();
        m97970T().m68500j(giftWallV2.bgSvgaUrl, -1);
        if (giftWallV2.tabs.size() > 2) {
            m97977a0().setText(giftWallV2.tabs.get(0).name);
            m97979c0().setText(giftWallV2.tabs.get(1).name);
            m97978b0().setText(giftWallV2.tabs.get(2).name);
        }
        m97983i0(m97963j0(giftWallV2, "all"), m97963j0(giftWallV2, "unlocked"), m97963j0(giftWallV2, "locked"));
    }

    /* JADX INFO: renamed from: i0 */
    public final void m97983i0(@NotNull List<? extends BLiveNewGiftWallGiftDetail> allData, @NotNull List<? extends BLiveNewGiftWallGiftDetail> lightData, @NotNull List<? extends BLiveNewGiftWallGiftDetail> darkData) {
        allData.getClass();
        lightData.getClass();
        darkData.getClass();
        qns qnsVar = this.allAdapter;
        if (qnsVar != null) {
            qnsVar.m175691G(allData);
        }
        qns qnsVar2 = this.lightAdapter;
        if (qnsVar2 != null) {
            qnsVar2.m175691G(lightData);
        }
        qns qnsVar3 = this.darkAdapter;
        if (qnsVar3 != null) {
            qnsVar3.m175691G(darkData);
        }
        m97960P();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(@NotNull View view) {
        view.getClass();
        super.mo71836m(view);
        m97966O(view);
        m97984r();
    }

    /* JADX INFO: renamed from: r */
    public final void m97984r() {
        View viewM97969S = m97969S();
        int i = t100.f167268q;
        mep0.m154301c1(viewM97969S, 0, 0, 0, -i, i);
        mep0.m154301c1(m97970T(), 0, 0, 0, -i, i);
        this.allAdapter = new qns((ios) this.f47757b);
        this.lightAdapter = new qns((ios) this.f47757b);
        this.darkAdapter = new qns((ios) this.f47757b);
        m97967Q().setAdapter(this.allAdapter);
        m97974X().setAdapter(this.lightAdapter);
        m97971U().setAdapter(this.darkAdapter);
        VRecyclerView vRecyclerViewM97967Q = m97967Q();
        T t = this.f47757b;
        t.getClass();
        m97981e0(vRecyclerViewM97967Q, (ios) t);
        VRecyclerView vRecyclerViewM97974X = m97974X();
        T t2 = this.f47757b;
        t2.getClass();
        m97981e0(vRecyclerViewM97974X, (ios) t2);
        VRecyclerView vRecyclerViewM97971U = m97971U();
        T t3 = this.f47757b;
        t3.getClass();
        m97981e0(vRecyclerViewM97971U, (ios) t3);
        xdl0.m208329E0(m97977a0(), new View.OnClickListener() { // from class: l.rns
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aos.m97956K(this.f160313a, view);
            }
        });
        xdl0.m208329E0(m97979c0(), new View.OnClickListener() { // from class: l.sns
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aos.m97951F(this.f165500a, view);
            }
        });
        xdl0.m208329E0(m97978b0(), new View.OnClickListener() { // from class: l.tns
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aos.m97954I(this.f171278a, view);
            }
        });
        xdl0.m208329E0(m97968R(), new View.OnClickListener() { // from class: l.uns
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aos.m97952G(this.f177431a, view);
            }
        });
        xdl0.m208329E0(m97975Y(), new View.OnClickListener() { // from class: l.vns
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aos.m97959N(this.f182274a, view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: x */
    public void mo71842x() {
        super.mo71842x();
        m97961g0(0);
    }
}
