package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallCategory;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallDetailInfoItem;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallProgress;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallTab;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallUser;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\fJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001e\u0010\u001bJ\u001d\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u0015¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b(\u0010)J7\u0010-\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u00108\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u0010\fR\"\u0010;\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u00104\u001a\u0004\b9\u00106\"\u0004\b:\u0010\fR\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010[\u001a\u00020T8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010b\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010j\u001a\u00020c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010n\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010N\u001a\u0004\bl\u0010P\"\u0004\bm\u0010RR\"\u0010r\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010N\u001a\u0004\bp\u0010P\"\u0004\bq\u0010RR\"\u0010v\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010N\u001a\u0004\bt\u0010P\"\u0004\bu\u0010RR\"\u0010~\u001a\u00020w8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R$\u0010\u0081\u0001\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b\u001e\u0010]\u001a\u0004\b\u007f\u0010_\"\u0005\b\u0080\u0001\u0010aR&\u0010\u0085\u0001\u001a\u00020T8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010V\u001a\u0005\b\u0083\u0001\u0010X\"\u0005\b\u0084\u0001\u0010ZR)\u0010\u008c\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R)\u0010\u0090\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u0087\u0001\u001a\u0006\b\u008e\u0001\u0010\u0089\u0001\"\u0006\b\u008f\u0001\u0010\u008b\u0001R)\u0010\u0094\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0087\u0001\u001a\u0006\b\u0092\u0001\u0010\u0089\u0001\"\u0006\b\u0093\u0001\u0010\u008b\u0001R\u0019\u0010\u0097\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R,\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R,\u0010£\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b \u0001\u0010\u009a\u0001\u001a\u0006\b¡\u0001\u0010\u009c\u0001\"\u0006\b¢\u0001\u0010\u009e\u0001R,\u0010§\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¤\u0001\u0010\u009a\u0001\u001a\u0006\b¥\u0001\u0010\u009c\u0001\"\u0006\b¦\u0001\u0010\u009e\u0001¨\u0006¨\u0001"}, m88121d2 = {"Ll/tgs;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/wns;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/wns;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "P", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;", "giftWallV2", "", "type", "", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallGiftDetail;", "k0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;Ljava/lang/String;)Ljava/util/List;", "", FirebaseAnalytics.Param.INDEX, "h0", "(I)V", "i0", "Q", "()V", "m", "r", BaseSei.f14624X, "Lv/VRecyclerView;", "recycler", "e0", "(Lv/VRecyclerView;Ll/wns;)V", "dataSize", "position", "", "f0", "(II)Z", "g0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;)V", "allData", "lightData", "darkData", "j0", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "k", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", BLiveStormDanmakuGiftResourceType.f45292l, "Landroid/view/View;", "Y", "()Landroid/view/View;", "set_shadow", "_shadow", p7f.GPS_DIRECTION_TRUE, "set_bg", "_bg", "Lv/VDraweeView;", "n", "Lv/VDraweeView;", "U", "()Lv/VDraweeView;", "set_bg_img", "(Lv/VDraweeView;)V", "_bg_img", "Landroidx/constraintlayout/widget/ConstraintLayout;", "o", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_title_bg", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_title_bg", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_title_bg", "Landroid/widget/TextView;", "p", "Landroid/widget/TextView;", "d0", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Lv/VText;", "q", "Lv/VText;", "Z", "()Lv/VText;", "set_sub_title", "(Lv/VText;)V", "_sub_title", "Lv/VImage;", "Lv/VImage;", p7f.LATITUDE_SOUTH, "()Lv/VImage;", "set_back", "(Lv/VImage;)V", "_back", "Lv/VLinear;", BLiveStormDanmakuGiftResourceType.f45294s, "Lv/VLinear;", "get_mini_tabs", "()Lv/VLinear;", "set_mini_tabs", "(Lv/VLinear;)V", "_mini_tabs", Constants.KEY_T, "a0", "set_tab_all", "_tab_all", "u", "c0", "set_tab_light", "_tab_light", ResourceDirection.f39656v, "b0", "set_tab_dark", "_tab_dark", "Landroid/widget/LinearLayout;", "w", "Landroid/widget/LinearLayout;", "W", "()Landroid/widget/LinearLayout;", "set_empty", "(Landroid/widget/LinearLayout;)V", "_empty", "get_empty_icon", "set_empty_icon", "_empty_icon", BaseSei.f14625Y, "get_empty_text", "set_empty_text", "_empty_text", BaseSei.f14626Z, "Lv/VRecyclerView;", "R", "()Lv/VRecyclerView;", "set_allRecyclerView", "(Lv/VRecyclerView;)V", "_allRecyclerView", "A", "X", "set_lightRecyclerView", "_lightRecyclerView", "B", p7f.GPS_MEASUREMENT_INTERRUPTED, "set_darkRecyclerView", "_darkRecyclerView", c4s.C_ZONE, "I", "currentIndex", "Ll/pns;", "D", "Ll/pns;", "getAllAdapter", "()Ll/pns;", "setAllAdapter", "(Ll/pns;)V", "allAdapter", "E", "getLightAdapter", "setLightAdapter", "lightAdapter", "F", "getDarkAdapter", "setDarkAdapter", "darkAdapter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class tgs extends LiveMenuDialogHolder<wns> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VRecyclerView _lightRecyclerView;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VRecyclerView _darkRecyclerView;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public int currentIndex;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public pns allAdapter;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public pns lightAdapter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public pns darkAdapter;

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

    /* JADX INFO: renamed from: l.tgs$a */
    @Metadata(m88120d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"l/tgs$a", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$a0;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20308a extends RecyclerView.AbstractC0578n {
        public C20308a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C0561a0 state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            if (parent.getChildAdapterPosition(view) <= 2) {
                outRect.top = qa00.m175859d(10.0f);
            } else {
                outRect.top = qa00.m175859d(0.0f);
            }
            tgs tgsVar = tgs.this;
            RecyclerView.Adapter adapter = parent.getAdapter();
            adapter.getClass();
            if (tgsVar.m191100f0(adapter.getItemCount(), parent.getChildAdapterPosition(view))) {
                outRect.bottom = qa00.m175859d(50.0f);
            } else {
                outRect.bottom = qa00.m175859d(0.0f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgs(@NotNull Act act, @NotNull wns wnsVar) {
        super(yec0.f198789I1, act, wnsVar);
        act.getClass();
        wnsVar.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: F */
    public static void m191071F(tgs tgsVar, View view) {
        tgsVar.mo73021p();
    }

    /* JADX INFO: renamed from: G */
    public static void m191072G(tgs tgsVar, View view) {
        tgsVar.m191102h0(0);
    }

    /* JADX INFO: renamed from: H */
    public static void m191073H(tgs tgsVar, View view) {
        tgsVar.m191102h0(1);
    }

    /* JADX INFO: renamed from: I */
    public static Boolean m191074I(BLiveNewGiftWallProgress bLiveNewGiftWallProgress) {
        return Boolean.valueOf(Intrinsics.m88377d(bLiveNewGiftWallProgress.type, "normal"));
    }

    /* JADX INFO: renamed from: J */
    public static void m191075J(tgs tgsVar, View view) {
        tgsVar.m191102h0(2);
    }

    /* JADX INFO: renamed from: K */
    public static void m191076K(tgs tgsVar, View view) {
        tgsVar.mo73021p();
    }

    /* JADX INFO: renamed from: M */
    public static Boolean m191078M(String str, BLiveNewGiftWallTab bLiveNewGiftWallTab) {
        return Boolean.valueOf(Intrinsics.m88377d(bLiveNewGiftWallTab.type, str));
    }

    /* JADX INFO: renamed from: l0 */
    public static final Boolean m191081l0(String str, BLiveNewGiftWallGift bLiveNewGiftWallGift) {
        return Boolean.valueOf(Intrinsics.m88377d(bLiveNewGiftWallGift.f45259id, str));
    }

    /* JADX INFO: renamed from: m0 */
    public static final Boolean m191082m0(BLiveNewGiftWallGift bLiveNewGiftWallGift, BLiveNewGiftWallUser bLiveNewGiftWallUser) {
        return Boolean.valueOf(Intrinsics.m88377d(bLiveNewGiftWallUser.f45264id, bLiveNewGiftWallGift.namedUserId));
    }

    /* JADX INFO: renamed from: n0 */
    public static final Boolean m191083n0(BLiveNewGiftWallGift bLiveNewGiftWallGift, BLiveNewGiftWallCategory bLiveNewGiftWallCategory) {
        return Boolean.valueOf(Intrinsics.m88377d(bLiveNewGiftWallCategory.f45258id, bLiveNewGiftWallGift.categoryId));
    }

    /* JADX INFO: renamed from: P */
    public final void m191084P(View view) {
        ugs.m195939a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public final void m191085Q() {
        if (m191095a0().isSelected()) {
            LinearLayout linearLayoutM191091W = m191091W();
            pns pnsVar = this.allAdapter;
            bnl0.m105524M(linearLayoutM191091W, pnsVar != null && pnsVar.getPageCount() == 0);
        } else if (m191097c0().isSelected()) {
            LinearLayout linearLayoutM191091W2 = m191091W();
            pns pnsVar2 = this.lightAdapter;
            bnl0.m105524M(linearLayoutM191091W2, pnsVar2 != null && pnsVar2.getPageCount() == 0);
        } else if (m191096b0().isSelected()) {
            LinearLayout linearLayoutM191091W3 = m191091W();
            pns pnsVar3 = this.darkAdapter;
            bnl0.m105524M(linearLayoutM191091W3, pnsVar3 != null && pnsVar3.getPageCount() == 0);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VRecyclerView m191086R() {
        VRecyclerView vRecyclerView = this._allRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_allRecyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VImage m191087S() {
        VImage vImage = this._back;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_back");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final View m191088T() {
        View view = this._bg;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final VDraweeView m191089U() {
        VDraweeView vDraweeView = this._bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VRecyclerView m191090V() {
        VRecyclerView vRecyclerView = this._darkRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_darkRecyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final LinearLayout m191091W() {
        LinearLayout linearLayout = this._empty;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final VRecyclerView m191092X() {
        VRecyclerView vRecyclerView = this._lightRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_lightRecyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final View m191093Y() {
        View view = this._shadow;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_shadow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VText m191094Z() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_sub_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final TextView m191095a0() {
        TextView textView = this._tab_all;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_tab_all");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final TextView m191096b0() {
        TextView textView = this._tab_dark;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_tab_dark");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final TextView m191097c0() {
        TextView textView = this._tab_light;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_tab_light");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final TextView m191098d0() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m191099e0(@NotNull VRecyclerView recycler, @NotNull wns presenter) {
        recycler.getClass();
        presenter.getClass();
        recycler.setLayoutManager(new GridLayoutManager(presenter.act(), 3));
        recycler.setNestedScrollingEnabled(false);
        recycler.setHasFixedSize(true);
        recycler.addItemDecoration(new C20308a());
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m191100f0(int dataSize, int position) {
        int i = dataSize % 3;
        if (i == 0) {
            return dataSize - position <= 3;
        }
        return dataSize - position <= i;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: g0 */
    public final void m191101g0(@NotNull BLiveNewGiftWallDetailInfoItem giftWallV2) {
        giftWallV2.getClass();
        m191098d0().setText(giftWallV2.title);
        BLiveNewGiftWallProgress bLiveNewGiftWallProgress = (BLiveNewGiftWallProgress) jyb.m147529r(giftWallV2.progresses, new qcj() { // from class: l.ogs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return tgs.m191074I((BLiveNewGiftWallProgress) obj);
            }
        });
        m191094Z().setText(bLiveNewGiftWallProgress.current + "/" + bLiveNewGiftWallProgress.total);
        izs.m142869t("context_livingAct", m191089U(), giftWallV2.bgUrl, 480);
        if (giftWallV2.tabs.size() > 2) {
            m191095a0().setText(giftWallV2.tabs.get(0).name);
            m191097c0().setText(giftWallV2.tabs.get(1).name);
            m191096b0().setText(giftWallV2.tabs.get(2).name);
        }
        m191104j0(m191105k0(giftWallV2, "all"), m191105k0(giftWallV2, "unlocked"), m191105k0(giftWallV2, "locked"));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m191102h0(int index) {
        this.currentIndex = index;
        m191103i0(index);
        m191095a0().setSelected(index == 0);
        m191097c0().setSelected(index == 1);
        m191096b0().setSelected(index == 2);
        bnl0.m105524M(m191086R(), index == 0);
        bnl0.m105524M(m191092X(), index == 1);
        bnl0.m105524M(m191090V(), index == 2);
        m191085Q();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m191103i0(int index) {
        if (index == 0) {
            m191095a0().setTypeface(Typeface.defaultFromStyle(1));
            m191097c0().setTypeface(Typeface.defaultFromStyle(0));
            m191096b0().setTypeface(Typeface.defaultFromStyle(0));
        } else if (index == 1) {
            m191095a0().setTypeface(Typeface.defaultFromStyle(0));
            m191097c0().setTypeface(Typeface.defaultFromStyle(1));
            m191096b0().setTypeface(Typeface.defaultFromStyle(0));
        } else {
            if (index != 2) {
                return;
            }
            m191095a0().setTypeface(Typeface.defaultFromStyle(0));
            m191097c0().setTypeface(Typeface.defaultFromStyle(0));
            m191096b0().setTypeface(Typeface.defaultFromStyle(1));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m191104j0(@NotNull List<? extends BLiveNewGiftWallGiftDetail> allData, @NotNull List<? extends BLiveNewGiftWallGiftDetail> lightData, @NotNull List<? extends BLiveNewGiftWallGiftDetail> darkData) {
        allData.getClass();
        lightData.getClass();
        darkData.getClass();
        pns pnsVar = this.allAdapter;
        if (pnsVar != null) {
            pnsVar.m173081G(allData);
        }
        pns pnsVar2 = this.lightAdapter;
        if (pnsVar2 != null) {
            pnsVar2.m173081G(lightData);
        }
        pns pnsVar3 = this.darkAdapter;
        if (pnsVar3 != null) {
            pnsVar3.m173081G(darkData);
        }
        m191085Q();
    }

    /* JADX INFO: renamed from: k0 */
    public final List<BLiveNewGiftWallGiftDetail> m191105k0(BLiveNewGiftWallDetailInfoItem giftWallV2, final String type) {
        BLiveNewGiftWallTab bLiveNewGiftWallTab = (BLiveNewGiftWallTab) jyb.m147529r(giftWallV2.tabs, new qcj() { // from class: l.pgs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return tgs.m191078M(type, (BLiveNewGiftWallTab) obj);
            }
        });
        List<BLiveNewGiftWallGiftDetail> arrayList = new ArrayList<>();
        if (bLiveNewGiftWallTab != null) {
            List<String> list = bLiveNewGiftWallTab.giftIds;
            list.getClass();
            for (final String str : list) {
                final BLiveNewGiftWallGift bLiveNewGiftWallGift = (BLiveNewGiftWallGift) jyb.m147529r(giftWallV2.gifts, new qcj() { // from class: l.qgs
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return tgs.m191081l0(str, (BLiveNewGiftWallGift) obj);
                    }
                });
                BLiveNewGiftWallUser bLiveNewGiftWallUser = (BLiveNewGiftWallUser) jyb.m147529r(giftWallV2.users, new qcj() { // from class: l.rgs
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return tgs.m191082m0(bLiveNewGiftWallGift, (BLiveNewGiftWallUser) obj);
                    }
                });
                BLiveNewGiftWallCategory bLiveNewGiftWallCategory = (BLiveNewGiftWallCategory) jyb.m147529r(giftWallV2.categories, new qcj() { // from class: l.sgs
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return tgs.m191083n0(bLiveNewGiftWallGift, (BLiveNewGiftWallCategory) obj);
                    }
                });
                BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetailNew_ = BLiveNewGiftWallGiftDetail.new_();
                bLiveNewGiftWallGiftDetailNew_.gift = bLiveNewGiftWallGift;
                bLiveNewGiftWallGiftDetailNew_.user = bLiveNewGiftWallUser;
                bLiveNewGiftWallGiftDetailNew_.category = bLiveNewGiftWallCategory;
                arrayList = jyb.m147500c(arrayList, bLiveNewGiftWallGiftDetailNew_);
                arrayList.getClass();
            }
        }
        return arrayList;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(@NotNull View view) {
        view.getClass();
        super.mo73019m(view);
        m191084P(view);
        m191106r();
    }

    /* JADX INFO: renamed from: r */
    public final void m191106r() {
        View viewM191088T = m191088T();
        int i = qa00.f156330q;
        qnp0.m177260c1(viewM191088T, 0, 0, 0, -i, i);
        qnp0.m177260c1(m191089U(), 0, 0, 0, -i, i);
        T t = this.f48605b;
        t.getClass();
        this.allAdapter = new pns((wns) t);
        T t2 = this.f48605b;
        t2.getClass();
        this.lightAdapter = new pns((wns) t2);
        T t3 = this.f48605b;
        t3.getClass();
        this.darkAdapter = new pns((wns) t3);
        m191086R().setAdapter(this.allAdapter);
        m191092X().setAdapter(this.lightAdapter);
        m191090V().setAdapter(this.darkAdapter);
        VRecyclerView vRecyclerViewM191086R = m191086R();
        T t4 = this.f48605b;
        t4.getClass();
        m191099e0(vRecyclerViewM191086R, (wns) t4);
        VRecyclerView vRecyclerViewM191092X = m191092X();
        T t5 = this.f48605b;
        t5.getClass();
        m191099e0(vRecyclerViewM191092X, (wns) t5);
        VRecyclerView vRecyclerViewM191090V = m191090V();
        T t6 = this.f48605b;
        t6.getClass();
        m191099e0(vRecyclerViewM191090V, (wns) t6);
        m191102h0(0);
        bnl0.m105509E0(m191095a0(), new View.OnClickListener() { // from class: l.jgs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tgs.m191072G(this.f120759a, view);
            }
        });
        bnl0.m105509E0(m191097c0(), new View.OnClickListener() { // from class: l.kgs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tgs.m191073H(this.f126645a, view);
            }
        });
        bnl0.m105509E0(m191096b0(), new View.OnClickListener() { // from class: l.lgs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tgs.m191075J(this.f132003a, view);
            }
        });
        bnl0.m105509E0(m191087S(), new View.OnClickListener() { // from class: l.mgs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tgs.m191076K(this.f136779a, view);
            }
        });
        bnl0.m105509E0(m191093Y(), new View.OnClickListener() { // from class: l.ngs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tgs.m191071F(this.f141856a, view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: x */
    public void mo73025x() {
        super.mo73025x();
        m191102h0(0);
    }
}
