package p153l;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
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
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallSetDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallSubTab;
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
@Metadata(m88120d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\fJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001e\u0010\u001bJ\u001d\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b#\u0010$J7\u0010(\u001a\u00020\n2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u00103\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u0010\fR\"\u00106\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010/\u001a\u0004\b4\u00101\"\u0004\b5\u0010\fR\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010]\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010i\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010I\u001a\u0004\bg\u0010K\"\u0004\bh\u0010MR\"\u0010m\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010I\u001a\u0004\bk\u0010K\"\u0004\bl\u0010MR\"\u0010q\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010I\u001a\u0004\bo\u0010K\"\u0004\bp\u0010MR\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\"\u0010|\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010X\u001a\u0004\bz\u0010Z\"\u0004\b{\u0010\\R#\u0010\u0080\u0001\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b}\u0010Q\u001a\u0004\b~\u0010S\"\u0004\b\u007f\u0010UR)\u0010\u0087\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R)\u0010\u008b\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0082\u0001\u001a\u0006\b\u0089\u0001\u0010\u0084\u0001\"\u0006\b\u008a\u0001\u0010\u0086\u0001R)\u0010\u008f\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u0082\u0001\u001a\u0006\b\u008d\u0001\u0010\u0084\u0001\"\u0006\b\u008e\u0001\u0010\u0086\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001c\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0095\u0001R\u001c\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0095\u0001¨\u0006\u009b\u0001"}, m88121d2 = {"Ll/gps;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/mps;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/mps;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", BloodType.f39576O, "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;", "giftWallV2", "", "type", "", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallSetDetail;", "i0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;Ljava/lang/String;)Ljava/util/List;", "", FirebaseAnalytics.Param.INDEX, "f0", "(I)V", "g0", "P", "()V", "m", "r", BaseSei.f14624X, "Lv/VRecyclerView;", "recycler", "d0", "(Lv/VRecyclerView;Ll/mps;)V", "e0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallDetailInfoItem;)V", "allData", "lightData", "darkData", "h0", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "k", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", BLiveStormDanmakuGiftResourceType.f45292l, "Landroid/view/View;", "X", "()Landroid/view/View;", "set_shadow", "_shadow", p7f.LATITUDE_SOUTH, "set_bg", "_bg", "Lv/VDraweeView;", "n", "Lv/VDraweeView;", p7f.GPS_DIRECTION_TRUE, "()Lv/VDraweeView;", "set_bg_img", "(Lv/VDraweeView;)V", "_bg_img", "Landroidx/constraintlayout/widget/ConstraintLayout;", "o", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_title_bg", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_title_bg", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_title_bg", "Landroid/widget/TextView;", "p", "Landroid/widget/TextView;", "c0", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Lv/VText;", "q", "Lv/VText;", "Y", "()Lv/VText;", "set_sub_title", "(Lv/VText;)V", "_sub_title", "Lv/VImage;", "Lv/VImage;", "R", "()Lv/VImage;", "set_back", "(Lv/VImage;)V", "_back", "Lv/VLinear;", BLiveStormDanmakuGiftResourceType.f45294s, "Lv/VLinear;", "get_mini_tabs", "()Lv/VLinear;", "set_mini_tabs", "(Lv/VLinear;)V", "_mini_tabs", Constants.KEY_T, "Z", "set_tab_all", "_tab_all", "u", "b0", "set_tab_light", "_tab_light", ResourceDirection.f39656v, "a0", "set_tab_dark", "_tab_dark", "Landroid/widget/LinearLayout;", "w", "Landroid/widget/LinearLayout;", p7f.GPS_MEASUREMENT_INTERRUPTED, "()Landroid/widget/LinearLayout;", "set_empty", "(Landroid/widget/LinearLayout;)V", "_empty", "get_empty_icon", "set_empty_icon", "_empty_icon", BaseSei.f14625Y, "get_empty_text", "set_empty_text", "_empty_text", BaseSei.f14626Z, "Lv/VRecyclerView;", "Q", "()Lv/VRecyclerView;", "set_allRecyclerView", "(Lv/VRecyclerView;)V", "_allRecyclerView", "A", "W", "set_lightRecyclerView", "_lightRecyclerView", "B", "U", "set_darkRecyclerView", "_darkRecyclerView", c4s.C_ZONE, "I", "currentIndex", "Ll/wos;", "D", "Ll/wos;", "allAdapter", "E", "lightAdapter", "F", "darkAdapter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class gps extends LiveMenuDialogHolder<mps> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VRecyclerView _lightRecyclerView;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VRecyclerView _darkRecyclerView;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public int currentIndex;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public wos allAdapter;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public wos lightAdapter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public wos darkAdapter;

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

    /* JADX INFO: renamed from: l.gps$a */
    @Metadata(m88120d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"l/gps$a", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$a0;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17273a extends RecyclerView.AbstractC0578n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C0561a0 state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            if (parent.getChildAdapterPosition(view) <= 0) {
                outRect.top = qa00.m175859d(16.0f);
            } else {
                outRect.top = qa00.m175859d(24.0f);
            }
            RecyclerView.Adapter adapter = parent.getAdapter();
            adapter.getClass();
            if (adapter.getItemCount() - 1 == parent.getChildAdapterPosition(view)) {
                outRect.bottom = qa00.m175859d(50.0f);
            } else {
                outRect.bottom = qa00.m175859d(0.0f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gps(@NotNull Act act, @NotNull mps mpsVar) {
        super(yec0.f198825L1, act, mpsVar);
        act.getClass();
        mpsVar.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: F */
    public static Boolean m131284F(String str, BLiveNewGiftWallTab bLiveNewGiftWallTab) {
        return Boolean.valueOf(Intrinsics.m88377d(bLiveNewGiftWallTab.type, str));
    }

    /* JADX INFO: renamed from: G */
    public static Boolean m131285G(BLiveNewGiftWallProgress bLiveNewGiftWallProgress) {
        return Boolean.valueOf(Intrinsics.m88377d(bLiveNewGiftWallProgress.type, "normal"));
    }

    /* JADX INFO: renamed from: I */
    public static void m131287I(gps gpsVar, View view) {
        gpsVar.m131294f0(1);
    }

    /* JADX INFO: renamed from: J */
    public static void m131288J(gps gpsVar, View view) {
        gpsVar.mo73021p();
    }

    /* JADX INFO: renamed from: K */
    public static void m131289K(gps gpsVar, View view) {
        gpsVar.m131294f0(0);
    }

    /* JADX INFO: renamed from: L */
    public static void m131290L(gps gpsVar, View view) {
        gpsVar.mo73021p();
    }

    /* JADX INFO: renamed from: N */
    public static void m131292N(gps gpsVar, View view) {
        gpsVar.m131294f0(2);
    }

    /* JADX INFO: renamed from: P */
    private final void m131293P() {
        if (m131309Z().isSelected()) {
            LinearLayout linearLayoutM131305V = m131305V();
            wos wosVar = this.allAdapter;
            bnl0.m105524M(linearLayoutM131305V, wosVar != null && wosVar.getPageCount() == 0);
        } else if (m131311b0().isSelected()) {
            LinearLayout linearLayoutM131305V2 = m131305V();
            wos wosVar2 = this.lightAdapter;
            bnl0.m105524M(linearLayoutM131305V2, wosVar2 != null && wosVar2.getPageCount() == 0);
        } else if (m131310a0().isSelected()) {
            LinearLayout linearLayoutM131305V3 = m131305V();
            wos wosVar3 = this.darkAdapter;
            bnl0.m105524M(linearLayoutM131305V3, wosVar3 != null && wosVar3.getPageCount() == 0);
        }
    }

    /* JADX INFO: renamed from: f0 */
    private final void m131294f0(int index) {
        this.currentIndex = index;
        m131295g0(index);
        m131309Z().setSelected(index == 0);
        m131311b0().setSelected(index == 1);
        m131310a0().setSelected(index == 2);
        bnl0.m105524M(m131300Q(), index == 0);
        bnl0.m105524M(m131306W(), index == 1);
        bnl0.m105524M(m131304U(), index == 2);
        m131293P();
    }

    /* JADX INFO: renamed from: g0 */
    private final void m131295g0(int index) {
        if (index == 0) {
            m131309Z().setTypeface(Typeface.defaultFromStyle(1));
            m131311b0().setTypeface(Typeface.defaultFromStyle(0));
            m131310a0().setTypeface(Typeface.defaultFromStyle(0));
        } else if (index == 1) {
            m131309Z().setTypeface(Typeface.defaultFromStyle(0));
            m131311b0().setTypeface(Typeface.defaultFromStyle(1));
            m131310a0().setTypeface(Typeface.defaultFromStyle(0));
        } else {
            if (index != 2) {
                return;
            }
            m131309Z().setTypeface(Typeface.defaultFromStyle(0));
            m131311b0().setTypeface(Typeface.defaultFromStyle(0));
            m131310a0().setTypeface(Typeface.defaultFromStyle(1));
        }
    }

    /* JADX INFO: renamed from: i0 */
    private final List<BLiveNewGiftWallSetDetail> m131296i0(BLiveNewGiftWallDetailInfoItem giftWallV2, final String type) {
        BLiveNewGiftWallTab bLiveNewGiftWallTab = (BLiveNewGiftWallTab) jyb.m147529r(giftWallV2.tabs, new qcj() { // from class: l.dps
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return gps.m131284F(type, (BLiveNewGiftWallTab) obj);
            }
        });
        List<BLiveNewGiftWallSetDetail> arrayList = new ArrayList<>();
        if (bLiveNewGiftWallTab != null) {
            List<BLiveNewGiftWallSubTab> list = bLiveNewGiftWallTab.subTabs;
            list.getClass();
            for (BLiveNewGiftWallSubTab bLiveNewGiftWallSubTab : list) {
                BLiveNewGiftWallSetDetail bLiveNewGiftWallSetDetailNew_ = BLiveNewGiftWallSetDetail.new_();
                bLiveNewGiftWallSetDetailNew_.subTab = bLiveNewGiftWallSubTab;
                List<BLiveNewGiftWallGiftDetail> arrayList2 = new ArrayList<>();
                List<String> list2 = bLiveNewGiftWallSubTab.giftIds;
                list2.getClass();
                for (final String str : list2) {
                    BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetailNew_ = BLiveNewGiftWallGiftDetail.new_();
                    final BLiveNewGiftWallGift bLiveNewGiftWallGift = (BLiveNewGiftWallGift) jyb.m147529r(giftWallV2.gifts, new qcj() { // from class: l.eps
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return gps.m131297j0(str, (BLiveNewGiftWallGift) obj);
                        }
                    });
                    BLiveNewGiftWallUser bLiveNewGiftWallUser = (BLiveNewGiftWallUser) jyb.m147529r(giftWallV2.users, new qcj() { // from class: l.fps
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return gps.m131298k0(bLiveNewGiftWallGift, (BLiveNewGiftWallUser) obj);
                        }
                    });
                    bLiveNewGiftWallGiftDetailNew_.gift = bLiveNewGiftWallGift;
                    bLiveNewGiftWallGiftDetailNew_.user = bLiveNewGiftWallUser;
                    arrayList2 = jyb.m147500c(arrayList2, bLiveNewGiftWallGiftDetailNew_);
                    arrayList2.getClass();
                }
                bLiveNewGiftWallSetDetailNew_.gifts = arrayList2;
                arrayList = jyb.m147500c(arrayList, bLiveNewGiftWallSetDetailNew_);
                arrayList.getClass();
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j0 */
    public static final Boolean m131297j0(String str, BLiveNewGiftWallGift bLiveNewGiftWallGift) {
        return Boolean.valueOf(Intrinsics.m88377d(bLiveNewGiftWallGift.f45259id, str));
    }

    /* JADX INFO: renamed from: k0 */
    public static final Boolean m131298k0(BLiveNewGiftWallGift bLiveNewGiftWallGift, BLiveNewGiftWallUser bLiveNewGiftWallUser) {
        return Boolean.valueOf(Intrinsics.m88377d(bLiveNewGiftWallUser.f45264id, bLiveNewGiftWallGift.namedUserId));
    }

    /* JADX INFO: renamed from: O */
    public final void m131299O(View view) {
        hps.m136582a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VRecyclerView m131300Q() {
        VRecyclerView vRecyclerView = this._allRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_allRecyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VImage m131301R() {
        VImage vImage = this._back;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_back");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final View m131302S() {
        View view = this._bg;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final VDraweeView m131303T() {
        VDraweeView vDraweeView = this._bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final VRecyclerView m131304U() {
        VRecyclerView vRecyclerView = this._darkRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_darkRecyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final LinearLayout m131305V() {
        LinearLayout linearLayout = this._empty;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VRecyclerView m131306W() {
        VRecyclerView vRecyclerView = this._lightRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_lightRecyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final View m131307X() {
        View view = this._shadow;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_shadow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final VText m131308Y() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_sub_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final TextView m131309Z() {
        TextView textView = this._tab_all;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_tab_all");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final TextView m131310a0() {
        TextView textView = this._tab_dark;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_tab_dark");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final TextView m131311b0() {
        TextView textView = this._tab_light;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_tab_light");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final TextView m131312c0() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m131313d0(@NotNull VRecyclerView recycler, @NotNull mps presenter) {
        recycler.getClass();
        presenter.getClass();
        recycler.setLayoutManager(new LinearLayoutManager(presenter.act()));
        recycler.setNestedScrollingEnabled(false);
        recycler.setHasFixedSize(true);
        recycler.addItemDecoration(new C17273a());
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: e0 */
    public final void m131314e0(@NotNull BLiveNewGiftWallDetailInfoItem giftWallV2) {
        giftWallV2.getClass();
        m131312c0().setText(giftWallV2.title);
        BLiveNewGiftWallProgress bLiveNewGiftWallProgress = (BLiveNewGiftWallProgress) jyb.m147529r(giftWallV2.progresses, new qcj() { // from class: l.cps
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return gps.m131285G((BLiveNewGiftWallProgress) obj);
            }
        });
        m131308Y().setText(bLiveNewGiftWallProgress.current + "/" + bLiveNewGiftWallProgress.total);
        if (giftWallV2.tabs.size() > 2) {
            m131309Z().setText(giftWallV2.tabs.get(0).name);
            m131311b0().setText(giftWallV2.tabs.get(1).name);
            m131310a0().setText(giftWallV2.tabs.get(2).name);
        }
        izs.m142869t("context_livingAct", m131303T(), giftWallV2.bgUrl, 480);
        m131315h0(m131296i0(giftWallV2, "all"), m131296i0(giftWallV2, "unlocked"), m131296i0(giftWallV2, "locked"));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m131315h0(@NotNull List<? extends BLiveNewGiftWallSetDetail> allData, @NotNull List<? extends BLiveNewGiftWallSetDetail> lightData, @NotNull List<? extends BLiveNewGiftWallSetDetail> darkData) {
        allData.getClass();
        lightData.getClass();
        darkData.getClass();
        wos wosVar = this.allAdapter;
        if (wosVar != null) {
            wosVar.m207350G(allData);
        }
        wos wosVar2 = this.lightAdapter;
        if (wosVar2 != null) {
            wosVar2.m207350G(lightData);
        }
        wos wosVar3 = this.darkAdapter;
        if (wosVar3 != null) {
            wosVar3.m207350G(darkData);
        }
        m131293P();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(@NotNull View view) {
        view.getClass();
        super.mo73019m(view);
        m131299O(view);
        m131316r();
    }

    /* JADX INFO: renamed from: r */
    public final void m131316r() {
        View viewM131302S = m131302S();
        int i = qa00.f156330q;
        qnp0.m177260c1(viewM131302S, 0, 0, 0, -i, i);
        qnp0.m177260c1(m131303T(), 0, 0, 0, -i, i);
        T t = this.f48605b;
        t.getClass();
        this.allAdapter = new wos((mps) t);
        T t2 = this.f48605b;
        t2.getClass();
        this.lightAdapter = new wos((mps) t2);
        T t3 = this.f48605b;
        t3.getClass();
        this.darkAdapter = new wos((mps) t3);
        m131300Q().setAdapter(this.allAdapter);
        m131306W().setAdapter(this.lightAdapter);
        m131304U().setAdapter(this.darkAdapter);
        VRecyclerView vRecyclerViewM131300Q = m131300Q();
        T t4 = this.f48605b;
        t4.getClass();
        m131313d0(vRecyclerViewM131300Q, (mps) t4);
        VRecyclerView vRecyclerViewM131306W = m131306W();
        T t5 = this.f48605b;
        t5.getClass();
        m131313d0(vRecyclerViewM131306W, (mps) t5);
        VRecyclerView vRecyclerViewM131304U = m131304U();
        T t6 = this.f48605b;
        t6.getClass();
        m131313d0(vRecyclerViewM131304U, (mps) t6);
        m131294f0(0);
        bnl0.m105509E0(m131309Z(), new View.OnClickListener() { // from class: l.xos
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gps.m131289K(this.f195597a, view);
            }
        });
        bnl0.m105509E0(m131311b0(), new View.OnClickListener() { // from class: l.yos
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gps.m131287I(this.f201010a, view);
            }
        });
        bnl0.m105509E0(m131310a0(), new View.OnClickListener() { // from class: l.zos
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gps.m131292N(this.f205388a, view);
            }
        });
        bnl0.m105509E0(m131301R(), new View.OnClickListener() { // from class: l.aps
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gps.m131288J(this.f72752a, view);
            }
        });
        bnl0.m105509E0(m131307X(), new View.OnClickListener() { // from class: l.bps
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gps.m131290L(this.f77807a, view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: x */
    public void mo73025x() {
        super.mo73025x();
        m131294f0(0);
    }
}
