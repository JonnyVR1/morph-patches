package p149l;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonCount;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftSkin;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftSkinListData;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftSkinTab;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001b\u0010\fJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u0013J\u000f\u0010\u001d\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001d\u0010\u0013J\u001d\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\r¢\u0006\u0004\b%\u0010&J7\u0010*\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\"\u00107\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u0010\fR\"\u0010:\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u00103\u001a\u0004\b8\u00105\"\u0004\b9\u0010\fR\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010a\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010e\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010\\\u001a\u0004\bc\u0010^\"\u0004\bd\u0010`R\"\u0010m\u001a\u00020f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010q\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010M\u001a\u0004\bo\u0010O\"\u0004\bp\u0010QR\"\u0010u\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010M\u001a\u0004\bs\u0010O\"\u0004\bt\u0010QR\"\u0010y\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010M\u001a\u0004\bw\u0010O\"\u0004\bx\u0010QR#\u0010\u0080\u0001\u001a\u00020z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR&\u0010\u0084\u0001\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010\\\u001a\u0005\b\u0082\u0001\u0010^\"\u0005\b\u0083\u0001\u0010`R&\u0010\u0088\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010U\u001a\u0005\b\u0086\u0001\u0010W\"\u0005\b\u0087\u0001\u0010YR)\u0010\u008f\u0001\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R)\u0010\u0093\u0001\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u008a\u0001\u001a\u0006\b\u0091\u0001\u0010\u008c\u0001\"\u0006\b\u0092\u0001\u0010\u008e\u0001R)\u0010\u0097\u0001\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u008a\u0001\u001a\u0006\b\u0095\u0001\u0010\u008c\u0001\"\u0006\b\u0096\u0001\u0010\u008e\u0001R\u0019\u0010\u009a\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R,\u0010¢\u0001\u001a\u0005\u0018\u00010\u009b\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R,\u0010¦\u0001\u001a\u0005\u0018\u00010\u009b\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b£\u0001\u0010\u009d\u0001\u001a\u0006\b¤\u0001\u0010\u009f\u0001\"\u0006\b¥\u0001\u0010¡\u0001R,\u0010ª\u0001\u001a\u0005\u0018\u00010\u009b\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b§\u0001\u0010\u009d\u0001\u001a\u0006\b¨\u0001\u0010\u009f\u0001\"\u0006\b©\u0001\u0010¡\u0001¨\u0006«\u0001"}, m87232d2 = {"Ll/ojs;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/sjs;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/sjs;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "M", "(Landroid/view/View;)V", "", FirebaseAnalytics.Param.INDEX, "h0", "(I)V", "i0", "N", "()V", "f0", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkinListData;", "data", "", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;", "k0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkinListData;I)Ljava/util/List;", "m", "r", BaseSei.f13930X, "Lv/VRecyclerView;", "recycler", "d0", "(Lv/VRecyclerView;Ll/sjs;)V", "dataSize", "position", "", "e0", "(II)Z", "allData", "lightData", "darkData", "j0", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "g0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkinListData;)V", "k", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", BLiveStormDanmakuGiftResourceType.f44444l, "Landroid/view/View;", "X", "()Landroid/view/View;", "set_shadow", "_shadow", "Q", "set_bg", "_bg", "Landroid/widget/ImageView;", "n", "Landroid/widget/ImageView;", "R", "()Landroid/widget/ImageView;", "set_bg_img", "(Landroid/widget/ImageView;)V", "_bg_img", "Landroidx/constraintlayout/widget/ConstraintLayout;", "o", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_title_bg", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_title_bg", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_title_bg", "Landroid/widget/TextView;", "p", "Landroid/widget/TextView;", "c0", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Lv/VText;", "q", "Lv/VText;", "Y", "()Lv/VText;", "set_sub_title", "(Lv/VText;)V", "_sub_title", "Lv/VImage;", "Lv/VImage;", "P", "()Lv/VImage;", "set_back", "(Lv/VImage;)V", "_back", BLiveStormDanmakuGiftResourceType.f44446s, j6f.GPS_MEASUREMENT_INTERRUPTED, "set_help", "_help", "Lv/VLinear;", Constants.KEY_T, "Lv/VLinear;", "get_mini_tabs", "()Lv/VLinear;", "set_mini_tabs", "(Lv/VLinear;)V", "_mini_tabs", "u", "Z", "set_tab_all", "_tab_all", ResourceDirection.f38808v, "b0", "set_tab_light", "_tab_light", "w", "a0", "set_tab_dark", "_tab_dark", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", j6f.GPS_DIRECTION_TRUE, "()Landroid/widget/LinearLayout;", "set_empty", "(Landroid/widget/LinearLayout;)V", "_empty", BaseSei.f13931Y, "get_empty_icon", "set_empty_icon", "_empty_icon", BaseSei.f13932Z, "U", "set_empty_text", "_empty_text", "A", "Lv/VRecyclerView;", BloodType.f38728O, "()Lv/VRecyclerView;", "set_allRecyclerView", "(Lv/VRecyclerView;)V", "_allRecyclerView", "B", "W", "set_lightRecyclerView", "_lightRecyclerView", b2s.C_ZONE, j6f.LATITUDE_SOUTH, "set_darkRecyclerView", "_darkRecyclerView", "D", "I", "currentIndex", "Ll/gjs;", "E", "Ll/gjs;", "getAllAdapter", "()Ll/gjs;", "setAllAdapter", "(Ll/gjs;)V", "allAdapter", "F", "getLightAdapter", "setLightAdapter", "lightAdapter", "G", "getDarkAdapter", "setDarkAdapter", "darkAdapter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ojs extends LiveMenuDialogHolder<sjs> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VRecyclerView _allRecyclerView;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VRecyclerView _lightRecyclerView;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public VRecyclerView _darkRecyclerView;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public int currentIndex;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public gjs allAdapter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public gjs lightAdapter;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    public gjs darkAdapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public View _shadow;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public View _bg;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public ImageView _bg_img;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public ConstraintLayout _title_bg;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VText _sub_title;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VImage _back;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public VImage _help;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public VLinear _mini_tabs;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public TextView _tab_all;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public TextView _tab_light;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public TextView _tab_dark;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public LinearLayout _empty;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public VImage _empty_icon;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public VText _empty_text;

    /* JADX INFO: renamed from: l.ojs$a */
    @Metadata(m87231d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"l/ojs$a", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C18964a extends RecyclerView.AbstractC0576n {
        public C18964a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C0588z state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            if (parent.getChildAdapterPosition(view) <= 2) {
                outRect.top = t100.m186890d(6.0f);
            } else {
                outRect.top = t100.m186890d(0.0f);
            }
            ojs ojsVar = ojs.this;
            RecyclerView.Adapter adapter = parent.getAdapter();
            adapter.getClass();
            if (ojsVar.m164782e0(adapter.getItemCount(), parent.getChildAdapterPosition(view))) {
                outRect.bottom = t100.m186890d(50.0f);
            } else {
                outRect.bottom = t100.m186890d(0.0f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojs(@NotNull Act act, @NotNull sjs sjsVar) {
        super(t6c0.f167973B1, act, sjsVar);
        act.getClass();
        sjsVar.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: G */
    public static void m164754G(ojs ojsVar, View view) {
        ojsVar.m164761f0();
    }

    /* JADX INFO: renamed from: H */
    public static void m164755H(ojs ojsVar, View view) {
        ojsVar.mo71838p();
    }

    /* JADX INFO: renamed from: I */
    public static void m164756I(ojs ojsVar, View view) {
        ojsVar.mo71838p();
    }

    /* JADX INFO: renamed from: J */
    public static void m164757J(ojs ojsVar, View view) {
        ojsVar.m164762h0(2);
    }

    /* JADX INFO: renamed from: K */
    public static void m164758K(ojs ojsVar, View view) {
        ojsVar.m164762h0(1);
    }

    /* JADX INFO: renamed from: L */
    public static void m164759L(ojs ojsVar, View view) {
        ojsVar.m164762h0(0);
    }

    /* JADX INFO: renamed from: N */
    private final void m164760N() {
        if (m164777Z().isSelected()) {
            LinearLayout linearLayoutM164771T = m164771T();
            gjs gjsVar = this.allAdapter;
            xdl0.m208344M(linearLayoutM164771T, gjsVar != null && gjsVar.mo28824C() == 0);
        } else {
            if (m164779b0().isSelected()) {
                m164772U().setText("尚未获得皮肤，快去收集吧！");
                LinearLayout linearLayoutM164771T2 = m164771T();
                gjs gjsVar2 = this.lightAdapter;
                xdl0.m208344M(linearLayoutM164771T2, gjsVar2 != null && gjsVar2.mo28824C() == 0);
                return;
            }
            if (m164778a0().isSelected()) {
                m164772U().setText("暂无可收集的皮肤");
                LinearLayout linearLayoutM164771T3 = m164771T();
                gjs gjsVar3 = this.darkAdapter;
                xdl0.m208344M(linearLayoutM164771T3, gjsVar3 != null && gjsVar3.mo28824C() == 0);
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    private final void m164761f0() {
        int height = m164768Q().getHeight() + t100.m186890d(10.0f);
        sjs sjsVar = (sjs) this.f47757b;
        String str = ddv.f85632D;
        str.getClass();
        sjsVar.m184555U3(str, height);
    }

    /* JADX INFO: renamed from: h0 */
    private final void m164762h0(int index) {
        this.currentIndex = index;
        m164763i0(index);
        m164777Z().setSelected(index == 0);
        m164779b0().setSelected(index == 1);
        m164778a0().setSelected(index == 2);
        xdl0.m208344M(m164766O(), index == 0);
        xdl0.m208344M(m164774W(), index == 1);
        xdl0.m208344M(m164770S(), index == 2);
        m164760N();
    }

    /* JADX INFO: renamed from: i0 */
    private final void m164763i0(int index) {
        if (index == 0) {
            m164777Z().setTypeface(Typeface.defaultFromStyle(1));
            m164779b0().setTypeface(Typeface.defaultFromStyle(0));
            m164778a0().setTypeface(Typeface.defaultFromStyle(0));
        } else if (index == 1) {
            m164777Z().setTypeface(Typeface.defaultFromStyle(0));
            m164779b0().setTypeface(Typeface.defaultFromStyle(1));
            m164778a0().setTypeface(Typeface.defaultFromStyle(0));
        } else {
            if (index != 2) {
                return;
            }
            m164777Z().setTypeface(Typeface.defaultFromStyle(0));
            m164779b0().setTypeface(Typeface.defaultFromStyle(0));
            m164778a0().setTypeface(Typeface.defaultFromStyle(1));
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static final Boolean m164764l0(String str, BLiveNewGiftSkin bLiveNewGiftSkin) {
        return Boolean.valueOf(Intrinsics.m87488d(bLiveNewGiftSkin.f44409id, str));
    }

    /* JADX INFO: renamed from: M */
    public final void m164765M(View view) {
        pjs.m169931a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VRecyclerView m164766O() {
        VRecyclerView vRecyclerView = this._allRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m87502r("_allRecyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VImage m164767P() {
        VImage vImage = this._back;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_back");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final View m164768Q() {
        View view = this._bg;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final ImageView m164769R() {
        ImageView imageView = this._bg_img;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VRecyclerView m164770S() {
        VRecyclerView vRecyclerView = this._darkRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m87502r("_darkRecyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final LinearLayout m164771T() {
        LinearLayout linearLayout = this._empty;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final VText m164772U() {
        VText vText = this._empty_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_empty_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VImage m164773V() {
        VImage vImage = this._help;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_help");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VRecyclerView m164774W() {
        VRecyclerView vRecyclerView = this._lightRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m87502r("_lightRecyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final View m164775X() {
        View view = this._shadow;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_shadow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final VText m164776Y() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_sub_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final TextView m164777Z() {
        TextView textView = this._tab_all;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_tab_all");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final TextView m164778a0() {
        TextView textView = this._tab_dark;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_tab_dark");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final TextView m164779b0() {
        TextView textView = this._tab_light;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_tab_light");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final TextView m164780c0() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m164781d0(@NotNull VRecyclerView recycler, @NotNull sjs presenter) {
        recycler.getClass();
        presenter.getClass();
        recycler.setLayoutManager(new GridLayoutManager(presenter.act(), 3));
        recycler.setNestedScrollingEnabled(false);
        recycler.setHasFixedSize(true);
        recycler.addItemDecoration(new C18964a());
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m164782e0(int dataSize, int position) {
        int i = dataSize % 3;
        if (i == 0) {
            return dataSize - position <= 3;
        }
        return dataSize - position <= i;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: g0 */
    public final void m164783g0(@NotNull BLiveNewGiftSkinListData data) {
        data.getClass();
        m164780c0().setText(data.name);
        VText vTextM164776Y = m164776Y();
        BLiveCommonCount bLiveCommonCount = data.process;
        vTextM164776Y.setText("已拥有：" + bLiveCommonCount.current + "/" + bLiveCommonCount.total);
        if (data.tabs.size() > 2) {
            m164777Z().setText(data.tabs.get(0).name);
            m164779b0().setText(data.tabs.get(1).name);
            m164778a0().setText(data.tabs.get(2).name);
            m164784j0(m164785k0(data, 0), m164785k0(data, 1), m164785k0(data, 2));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m164784j0(@NotNull List<? extends BLiveNewGiftSkin> allData, @NotNull List<? extends BLiveNewGiftSkin> lightData, @NotNull List<? extends BLiveNewGiftSkin> darkData) {
        allData.getClass();
        lightData.getClass();
        darkData.getClass();
        gjs gjsVar = this.allAdapter;
        if (gjsVar != null) {
            gjsVar.m126562G(allData);
        }
        gjs gjsVar2 = this.lightAdapter;
        if (gjsVar2 != null) {
            gjsVar2.m126562G(lightData);
        }
        gjs gjsVar3 = this.darkAdapter;
        if (gjsVar3 != null) {
            gjsVar3.m126562G(darkData);
        }
        m164766O().scrollToPosition(0);
        m164774W().scrollToPosition(0);
        m164770S().scrollToPosition(0);
        m164760N();
    }

    /* JADX INFO: renamed from: k0 */
    public final List<BLiveNewGiftSkin> m164785k0(BLiveNewGiftSkinListData data, int index) {
        BLiveNewGiftSkinTab bLiveNewGiftSkinTab = data.tabs.get(index);
        List<BLiveNewGiftSkin> arrayList = new ArrayList<>();
        if (bLiveNewGiftSkinTab != null) {
            List<String> list = bLiveNewGiftSkinTab.skinIds;
            list.getClass();
            for (final String str : list) {
                arrayList = vwb.m200317c(arrayList, (BLiveNewGiftSkin) vwb.m200346r(data.skins, new w9j() { // from class: l.njs
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ojs.m164764l0(str, (BLiveNewGiftSkin) obj);
                    }
                }));
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
        m164765M(view);
        m164786r();
    }

    /* JADX INFO: renamed from: r */
    public final void m164786r() {
        View viewM164768Q = m164768Q();
        int i = t100.f167268q;
        boolean z = false;
        mep0.m154301c1(viewM164768Q, 0, 0, 0, -i, i);
        mep0.m154301c1(m164769R(), 0, 0, 0, -i, i);
        T t = this.f47757b;
        t.getClass();
        int i2 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.allAdapter = new gjs((sjs) t, z, i2, defaultConstructorMarker);
        T t2 = this.f47757b;
        t2.getClass();
        this.lightAdapter = new gjs((sjs) t2, z, i2, defaultConstructorMarker);
        T t3 = this.f47757b;
        t3.getClass();
        this.darkAdapter = new gjs((sjs) t3, true);
        m164766O().setAdapter(this.allAdapter);
        m164774W().setAdapter(this.lightAdapter);
        m164770S().setAdapter(this.darkAdapter);
        VRecyclerView vRecyclerViewM164766O = m164766O();
        T t4 = this.f47757b;
        t4.getClass();
        m164781d0(vRecyclerViewM164766O, (sjs) t4);
        VRecyclerView vRecyclerViewM164774W = m164774W();
        T t5 = this.f47757b;
        t5.getClass();
        m164781d0(vRecyclerViewM164774W, (sjs) t5);
        VRecyclerView vRecyclerViewM164770S = m164770S();
        T t6 = this.f47757b;
        t6.getClass();
        m164781d0(vRecyclerViewM164770S, (sjs) t6);
        m164762h0(0);
        xdl0.m208329E0(m164777Z(), new View.OnClickListener() { // from class: l.hjs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ojs.m164759L(this.f108116a, view);
            }
        });
        xdl0.m208329E0(m164779b0(), new View.OnClickListener() { // from class: l.ijs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ojs.m164758K(this.f113603a, view);
            }
        });
        xdl0.m208329E0(m164778a0(), new View.OnClickListener() { // from class: l.jjs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ojs.m164757J(this.f118314a, view);
            }
        });
        xdl0.m208329E0(m164767P(), new View.OnClickListener() { // from class: l.kjs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ojs.m164755H(this.f123496a, view);
            }
        });
        xdl0.m208329E0(m164775X(), new View.OnClickListener() { // from class: l.ljs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ojs.m164756I(this.f128403a, view);
            }
        });
        xdl0.m208329E0(m164773V(), new View.OnClickListener() { // from class: l.mjs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ojs.m164754G(this.f134247a, view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: x */
    public void mo71842x() {
        super.mo71842x();
        m164762h0(0);
    }
}
