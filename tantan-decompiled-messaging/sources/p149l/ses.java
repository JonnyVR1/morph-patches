package p149l;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallCategory;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallDetailInfoItem;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallProgress;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallTab;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallUser;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\fJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001e\u0010\u001bJ\u001d\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u0015¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b(\u0010)J7\u0010-\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u00108\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u0010\fR\"\u0010;\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u00104\u001a\u0004\b9\u00106\"\u0004\b:\u0010\fR\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010[\u001a\u00020T8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010b\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010j\u001a\u00020c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010n\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010N\u001a\u0004\bl\u0010P\"\u0004\bm\u0010RR\"\u0010r\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010N\u001a\u0004\bp\u0010P\"\u0004\bq\u0010RR\"\u0010v\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010N\u001a\u0004\bt\u0010P\"\u0004\bu\u0010RR\"\u0010~\u001a\u00020w8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R$\u0010\u0081\u0001\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b\u001e\u0010]\u001a\u0004\b\u007f\u0010_\"\u0005\b\u0080\u0001\u0010aR&\u0010\u0085\u0001\u001a\u00020T8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010V\u001a\u0005\b\u0083\u0001\u0010X\"\u0005\b\u0084\u0001\u0010ZR)\u0010\u008c\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R)\u0010\u0090\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u0087\u0001\u001a\u0006\b\u008e\u0001\u0010\u0089\u0001\"\u0006\b\u008f\u0001\u0010\u008b\u0001R)\u0010\u0094\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0087\u0001\u001a\u0006\b\u0092\u0001\u0010\u0089\u0001\"\u0006\b\u0093\u0001\u0010\u008b\u0001R\u0019\u0010\u0097\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R,\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R,\u0010£\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b \u0001\u0010\u009a\u0001\u001a\u0006\b¡\u0001\u0010\u009c\u0001\"\u0006\b¢\u0001\u0010\u009e\u0001R,\u0010§\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¤\u0001\u0010\u009a\u0001\u001a\u0006\b¥\u0001\u0010\u009c\u0001\"\u0006\b¦\u0001\u0010\u009e\u0001¨\u0006¨\u0001"}, m87232d2 = {"Ll/ses;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/vls;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/vls;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "P", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;", "giftWallV2", "", "type", "", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGiftDetail;", "k0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;Ljava/lang/String;)Ljava/util/List;", "", FirebaseAnalytics.Param.INDEX, "h0", "(I)V", "i0", "Q", "()V", "m", "r", BaseSei.f13930X, "Lv/VRecyclerView;", "recycler", "e0", "(Lv/VRecyclerView;Ll/vls;)V", "dataSize", "position", "", "f0", "(II)Z", "g0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;)V", "allData", "lightData", "darkData", "j0", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "k", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", BLiveStormDanmakuGiftResourceType.f44444l, "Landroid/view/View;", "Y", "()Landroid/view/View;", "set_shadow", "_shadow", j6f.GPS_DIRECTION_TRUE, "set_bg", "_bg", "Lv/VDraweeView;", "n", "Lv/VDraweeView;", "U", "()Lv/VDraweeView;", "set_bg_img", "(Lv/VDraweeView;)V", "_bg_img", "Landroidx/constraintlayout/widget/ConstraintLayout;", "o", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_title_bg", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_title_bg", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_title_bg", "Landroid/widget/TextView;", "p", "Landroid/widget/TextView;", "d0", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Lv/VText;", "q", "Lv/VText;", "Z", "()Lv/VText;", "set_sub_title", "(Lv/VText;)V", "_sub_title", "Lv/VImage;", "Lv/VImage;", j6f.LATITUDE_SOUTH, "()Lv/VImage;", "set_back", "(Lv/VImage;)V", "_back", "Lv/VLinear;", BLiveStormDanmakuGiftResourceType.f44446s, "Lv/VLinear;", "get_mini_tabs", "()Lv/VLinear;", "set_mini_tabs", "(Lv/VLinear;)V", "_mini_tabs", Constants.KEY_T, "a0", "set_tab_all", "_tab_all", "u", "c0", "set_tab_light", "_tab_light", ResourceDirection.f38808v, "b0", "set_tab_dark", "_tab_dark", "Landroid/widget/LinearLayout;", "w", "Landroid/widget/LinearLayout;", "W", "()Landroid/widget/LinearLayout;", "set_empty", "(Landroid/widget/LinearLayout;)V", "_empty", "get_empty_icon", "set_empty_icon", "_empty_icon", BaseSei.f13931Y, "get_empty_text", "set_empty_text", "_empty_text", BaseSei.f13932Z, "Lv/VRecyclerView;", "R", "()Lv/VRecyclerView;", "set_allRecyclerView", "(Lv/VRecyclerView;)V", "_allRecyclerView", "A", "X", "set_lightRecyclerView", "_lightRecyclerView", "B", j6f.GPS_MEASUREMENT_INTERRUPTED, "set_darkRecyclerView", "_darkRecyclerView", b2s.C_ZONE, "I", "currentIndex", "Ll/ols;", "D", "Ll/ols;", "getAllAdapter", "()Ll/ols;", "setAllAdapter", "(Ll/ols;)V", "allAdapter", "E", "getLightAdapter", "setLightAdapter", "lightAdapter", "F", "getDarkAdapter", "setDarkAdapter", "darkAdapter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ses extends LiveMenuDialogHolder<vls> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VRecyclerView _lightRecyclerView;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VRecyclerView _darkRecyclerView;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public int currentIndex;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public ols allAdapter;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public ols lightAdapter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public ols darkAdapter;

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

    /* JADX INFO: renamed from: l.ses$a */
    @Metadata(m87231d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"l/ses$a", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19924a extends RecyclerView.AbstractC0576n {
        public C19924a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C0588z state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            if (parent.getChildAdapterPosition(view) <= 2) {
                outRect.top = t100.m186890d(10.0f);
            } else {
                outRect.top = t100.m186890d(0.0f);
            }
            ses sesVar = ses.this;
            RecyclerView.Adapter adapter = parent.getAdapter();
            adapter.getClass();
            if (sesVar.m183709f0(adapter.getItemCount(), parent.getChildAdapterPosition(view))) {
                outRect.bottom = t100.m186890d(50.0f);
            } else {
                outRect.bottom = t100.m186890d(0.0f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ses(@NotNull Act act, @NotNull vls vlsVar) {
        super(t6c0.f168057I1, act, vlsVar);
        act.getClass();
        vlsVar.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: F */
    public static void m183680F(ses sesVar, View view) {
        sesVar.mo71838p();
    }

    /* JADX INFO: renamed from: G */
    public static void m183681G(ses sesVar, View view) {
        sesVar.m183711h0(0);
    }

    /* JADX INFO: renamed from: H */
    public static void m183682H(ses sesVar, View view) {
        sesVar.m183711h0(1);
    }

    /* JADX INFO: renamed from: I */
    public static Boolean m183683I(BLiveNewGiftWallProgress bLiveNewGiftWallProgress) {
        return Boolean.valueOf(Intrinsics.m87488d(bLiveNewGiftWallProgress.type, "normal"));
    }

    /* JADX INFO: renamed from: J */
    public static void m183684J(ses sesVar, View view) {
        sesVar.m183711h0(2);
    }

    /* JADX INFO: renamed from: K */
    public static void m183685K(ses sesVar, View view) {
        sesVar.mo71838p();
    }

    /* JADX INFO: renamed from: M */
    public static Boolean m183687M(String str, BLiveNewGiftWallTab bLiveNewGiftWallTab) {
        return Boolean.valueOf(Intrinsics.m87488d(bLiveNewGiftWallTab.type, str));
    }

    /* JADX INFO: renamed from: l0 */
    public static final Boolean m183690l0(String str, BLiveNewGiftWallGift bLiveNewGiftWallGift) {
        return Boolean.valueOf(Intrinsics.m87488d(bLiveNewGiftWallGift.f44411id, str));
    }

    /* JADX INFO: renamed from: m0 */
    public static final Boolean m183691m0(BLiveNewGiftWallGift bLiveNewGiftWallGift, BLiveNewGiftWallUser bLiveNewGiftWallUser) {
        return Boolean.valueOf(Intrinsics.m87488d(bLiveNewGiftWallUser.f44416id, bLiveNewGiftWallGift.namedUserId));
    }

    /* JADX INFO: renamed from: n0 */
    public static final Boolean m183692n0(BLiveNewGiftWallGift bLiveNewGiftWallGift, BLiveNewGiftWallCategory bLiveNewGiftWallCategory) {
        return Boolean.valueOf(Intrinsics.m87488d(bLiveNewGiftWallCategory.f44410id, bLiveNewGiftWallGift.categoryId));
    }

    /* JADX INFO: renamed from: P */
    public final void m183693P(View view) {
        tes.m188622a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public final void m183694Q() {
        if (m183704a0().isSelected()) {
            LinearLayout linearLayoutM183700W = m183700W();
            ols olsVar = this.allAdapter;
            xdl0.m208344M(linearLayoutM183700W, olsVar != null && olsVar.getPageCount() == 0);
        } else if (m183706c0().isSelected()) {
            LinearLayout linearLayoutM183700W2 = m183700W();
            ols olsVar2 = this.lightAdapter;
            xdl0.m208344M(linearLayoutM183700W2, olsVar2 != null && olsVar2.getPageCount() == 0);
        } else if (m183705b0().isSelected()) {
            LinearLayout linearLayoutM183700W3 = m183700W();
            ols olsVar3 = this.darkAdapter;
            xdl0.m208344M(linearLayoutM183700W3, olsVar3 != null && olsVar3.getPageCount() == 0);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VRecyclerView m183695R() {
        VRecyclerView vRecyclerView = this._allRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m87502r("_allRecyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VImage m183696S() {
        VImage vImage = this._back;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_back");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final View m183697T() {
        View view = this._bg;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final VDraweeView m183698U() {
        VDraweeView vDraweeView = this._bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VRecyclerView m183699V() {
        VRecyclerView vRecyclerView = this._darkRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m87502r("_darkRecyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final LinearLayout m183700W() {
        LinearLayout linearLayout = this._empty;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final VRecyclerView m183701X() {
        VRecyclerView vRecyclerView = this._lightRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m87502r("_lightRecyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final View m183702Y() {
        View view = this._shadow;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_shadow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VText m183703Z() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_sub_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final TextView m183704a0() {
        TextView textView = this._tab_all;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_tab_all");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final TextView m183705b0() {
        TextView textView = this._tab_dark;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_tab_dark");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final TextView m183706c0() {
        TextView textView = this._tab_light;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_tab_light");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final TextView m183707d0() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m183708e0(@NotNull VRecyclerView recycler, @NotNull vls presenter) {
        recycler.getClass();
        presenter.getClass();
        recycler.setLayoutManager(new GridLayoutManager(presenter.act(), 3));
        recycler.setNestedScrollingEnabled(false);
        recycler.setHasFixedSize(true);
        recycler.addItemDecoration(new C19924a());
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m183709f0(int dataSize, int position) {
        int i = dataSize % 3;
        if (i == 0) {
            return dataSize - position <= 3;
        }
        return dataSize - position <= i;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: g0 */
    public final void m183710g0(@NotNull BLiveNewGiftWallDetailInfoItem giftWallV2) {
        giftWallV2.getClass();
        m183707d0().setText(giftWallV2.title);
        BLiveNewGiftWallProgress bLiveNewGiftWallProgress = (BLiveNewGiftWallProgress) vwb.m200346r(giftWallV2.progresses, new w9j() { // from class: l.nes
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ses.m183683I((BLiveNewGiftWallProgress) obj);
            }
        });
        m183703Z().setText(bLiveNewGiftWallProgress.current + "/" + bLiveNewGiftWallProgress.total);
        hxs.m133407t("context_livingAct", m183698U(), giftWallV2.bgUrl, 480);
        if (giftWallV2.tabs.size() > 2) {
            m183704a0().setText(giftWallV2.tabs.get(0).name);
            m183706c0().setText(giftWallV2.tabs.get(1).name);
            m183705b0().setText(giftWallV2.tabs.get(2).name);
        }
        m183713j0(m183714k0(giftWallV2, "all"), m183714k0(giftWallV2, "unlocked"), m183714k0(giftWallV2, "locked"));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m183711h0(int index) {
        this.currentIndex = index;
        m183712i0(index);
        m183704a0().setSelected(index == 0);
        m183706c0().setSelected(index == 1);
        m183705b0().setSelected(index == 2);
        xdl0.m208344M(m183695R(), index == 0);
        xdl0.m208344M(m183701X(), index == 1);
        xdl0.m208344M(m183699V(), index == 2);
        m183694Q();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m183712i0(int index) {
        if (index == 0) {
            m183704a0().setTypeface(Typeface.defaultFromStyle(1));
            m183706c0().setTypeface(Typeface.defaultFromStyle(0));
            m183705b0().setTypeface(Typeface.defaultFromStyle(0));
        } else if (index == 1) {
            m183704a0().setTypeface(Typeface.defaultFromStyle(0));
            m183706c0().setTypeface(Typeface.defaultFromStyle(1));
            m183705b0().setTypeface(Typeface.defaultFromStyle(0));
        } else {
            if (index != 2) {
                return;
            }
            m183704a0().setTypeface(Typeface.defaultFromStyle(0));
            m183706c0().setTypeface(Typeface.defaultFromStyle(0));
            m183705b0().setTypeface(Typeface.defaultFromStyle(1));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m183713j0(@NotNull List<? extends BLiveNewGiftWallGiftDetail> allData, @NotNull List<? extends BLiveNewGiftWallGiftDetail> lightData, @NotNull List<? extends BLiveNewGiftWallGiftDetail> darkData) {
        allData.getClass();
        lightData.getClass();
        darkData.getClass();
        ols olsVar = this.allAdapter;
        if (olsVar != null) {
            olsVar.m164992G(allData);
        }
        ols olsVar2 = this.lightAdapter;
        if (olsVar2 != null) {
            olsVar2.m164992G(lightData);
        }
        ols olsVar3 = this.darkAdapter;
        if (olsVar3 != null) {
            olsVar3.m164992G(darkData);
        }
        m183694Q();
    }

    /* JADX INFO: renamed from: k0 */
    public final List<BLiveNewGiftWallGiftDetail> m183714k0(BLiveNewGiftWallDetailInfoItem giftWallV2, final String type) {
        BLiveNewGiftWallTab bLiveNewGiftWallTab = (BLiveNewGiftWallTab) vwb.m200346r(giftWallV2.tabs, new w9j() { // from class: l.oes
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ses.m183687M(type, (BLiveNewGiftWallTab) obj);
            }
        });
        List<BLiveNewGiftWallGiftDetail> arrayList = new ArrayList<>();
        if (bLiveNewGiftWallTab != null) {
            List<String> list = bLiveNewGiftWallTab.giftIds;
            list.getClass();
            for (final String str : list) {
                final BLiveNewGiftWallGift bLiveNewGiftWallGift = (BLiveNewGiftWallGift) vwb.m200346r(giftWallV2.gifts, new w9j() { // from class: l.pes
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ses.m183690l0(str, (BLiveNewGiftWallGift) obj);
                    }
                });
                BLiveNewGiftWallUser bLiveNewGiftWallUser = (BLiveNewGiftWallUser) vwb.m200346r(giftWallV2.users, new w9j() { // from class: l.qes
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ses.m183691m0(bLiveNewGiftWallGift, (BLiveNewGiftWallUser) obj);
                    }
                });
                BLiveNewGiftWallCategory bLiveNewGiftWallCategory = (BLiveNewGiftWallCategory) vwb.m200346r(giftWallV2.categories, new w9j() { // from class: l.res
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ses.m183692n0(bLiveNewGiftWallGift, (BLiveNewGiftWallCategory) obj);
                    }
                });
                BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetailNew_ = BLiveNewGiftWallGiftDetail.new_();
                bLiveNewGiftWallGiftDetailNew_.gift = bLiveNewGiftWallGift;
                bLiveNewGiftWallGiftDetailNew_.user = bLiveNewGiftWallUser;
                bLiveNewGiftWallGiftDetailNew_.category = bLiveNewGiftWallCategory;
                arrayList = vwb.m200317c(arrayList, bLiveNewGiftWallGiftDetailNew_);
                arrayList.getClass();
            }
        }
        return arrayList;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(@NotNull View view) {
        view.getClass();
        super.mo71836m(view);
        m183693P(view);
        m183715r();
    }

    /* JADX INFO: renamed from: r */
    public final void m183715r() {
        View viewM183697T = m183697T();
        int i = t100.f167268q;
        mep0.m154301c1(viewM183697T, 0, 0, 0, -i, i);
        mep0.m154301c1(m183698U(), 0, 0, 0, -i, i);
        T t = this.f47757b;
        t.getClass();
        this.allAdapter = new ols((vls) t);
        T t2 = this.f47757b;
        t2.getClass();
        this.lightAdapter = new ols((vls) t2);
        T t3 = this.f47757b;
        t3.getClass();
        this.darkAdapter = new ols((vls) t3);
        m183695R().setAdapter(this.allAdapter);
        m183701X().setAdapter(this.lightAdapter);
        m183699V().setAdapter(this.darkAdapter);
        VRecyclerView vRecyclerViewM183695R = m183695R();
        T t4 = this.f47757b;
        t4.getClass();
        m183708e0(vRecyclerViewM183695R, (vls) t4);
        VRecyclerView vRecyclerViewM183701X = m183701X();
        T t5 = this.f47757b;
        t5.getClass();
        m183708e0(vRecyclerViewM183701X, (vls) t5);
        VRecyclerView vRecyclerViewM183699V = m183699V();
        T t6 = this.f47757b;
        t6.getClass();
        m183708e0(vRecyclerViewM183699V, (vls) t6);
        m183711h0(0);
        xdl0.m208329E0(m183704a0(), new View.OnClickListener() { // from class: l.ies
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ses.m183681G(this.f112827a, view);
            }
        });
        xdl0.m208329E0(m183706c0(), new View.OnClickListener() { // from class: l.jes
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ses.m183682H(this.f117604a, view);
            }
        });
        xdl0.m208329E0(m183705b0(), new View.OnClickListener() { // from class: l.kes
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ses.m183684J(this.f122748a, view);
            }
        });
        xdl0.m208329E0(m183696S(), new View.OnClickListener() { // from class: l.les
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ses.m183685K(this.f127750a, view);
            }
        });
        xdl0.m208329E0(m183702Y(), new View.OnClickListener() { // from class: l.mes
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ses.m183680F(this.f133486a, view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: x */
    public void mo71842x() {
        super.mo71842x();
        m183711h0(0);
    }
}
