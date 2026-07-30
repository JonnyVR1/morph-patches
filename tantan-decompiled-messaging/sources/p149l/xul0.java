package p149l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomLevelDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomNextLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomLevelRight;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.heatchallenge.HeatChallengeProgressView;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\"\u0010\fJ\u001f\u0010#\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010!J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b'\u0010\u0013J\u000f\u0010(\u001a\u00020\nH\u0014¢\u0006\u0004\b(\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00109\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010\fR\"\u0010=\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u00105\u001a\u0004\b;\u00107\"\u0004\b<\u0010\fR\"\u0010A\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u00105\u001a\u0004\b?\u00107\"\u0004\b@\u0010\fR\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010T\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010D\u001a\u0004\bR\u0010F\"\u0004\bS\u0010HR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010`\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u00105\u001a\u0004\b^\u00107\"\u0004\b_\u0010\fR\"\u0010d\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010D\u001a\u0004\bb\u0010F\"\u0004\bc\u0010HR\"\u0010l\u001a\u00020e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010o\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010L\u001a\u0004\bm\u0010N\"\u0004\bn\u0010PR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010{\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bx\u0010L\u001a\u0004\by\u0010N\"\u0004\bz\u0010PR&\u0010\u0083\u0001\u001a\u00020|8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R&\u0010\u0087\u0001\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010L\u001a\u0005\b\u0085\u0001\u0010N\"\u0005\b\u0086\u0001\u0010PR*\u0010\u008f\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001c\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001¨\u0006\u0094\u0001"}, m87232d2 = {"Ll/xul0;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/cvl0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/cvl0;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "K", "(Landroid/view/View;)V", "r", "()V", "Y", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoomLevelDetail;", "data", "a0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoomLevelDetail;)V", "", "title", "content", "contentImg", "", "gravity", "Z", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "L", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "m", "inflateView", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "W", "w", "k", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroidx/constraintlayout/widget/ConstraintLayout;", BLiveStormDanmakuGiftResourceType.f44444l, "Landroidx/constraintlayout/widget/ConstraintLayout;", j6f.LATITUDE_SOUTH, "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_root", "Landroid/view/View;", "get_dialog_bg_first", "()Landroid/view/View;", "set_dialog_bg_first", "_dialog_bg_first", "n", BloodType.f38728O, "set_dialog_bg_second", "_dialog_bg_second", "o", "get_top_view", "set_top_view", "_top_view", "Landroid/widget/ImageView;", "p", "Landroid/widget/ImageView;", "N", "()Landroid/widget/ImageView;", "set_back", "(Landroid/widget/ImageView;)V", "_back", "Landroid/widget/TextView;", "q", "Landroid/widget/TextView;", "get_title", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "M", "set_answer", "_answer", "Landroid/widget/ScrollView;", BLiveStormDanmakuGiftResourceType.f44446s, "Landroid/widget/ScrollView;", "get_scroll_view", "()Landroid/widget/ScrollView;", "set_scroll_view", "(Landroid/widget/ScrollView;)V", "_scroll_view", Constants.KEY_T, "get_level_bg", "set_level_bg", "_level_bg", "u", "get_level_bg2", "set_level_bg2", "_level_bg2", "Lv/VDraweeView;", ResourceDirection.f38808v, "Lv/VDraweeView;", "P", "()Lv/VDraweeView;", "set_iv_grade", "(Lv/VDraweeView;)V", "_iv_grade", "U", "set_tv_level", "_tv_level", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/heatchallenge/HeatChallengeProgressView;", BaseSei.f13930X, "Lcom/p1/mobile/putong/live/livingroom/voice/intl/heatchallenge/HeatChallengeProgressView;", "R", "()Lcom/p1/mobile/putong/live/livingroom/voice/intl/heatchallenge/HeatChallengeProgressView;", "set_progress", "(Lcom/p1/mobile/putong/live/livingroom/voice/intl/heatchallenge/HeatChallengeProgressView;)V", "_progress", BaseSei.f13931Y, "Q", "set_next_level", "_next_level", "Lv/VText;", BaseSei.f13932Z, "Lv/VText;", j6f.GPS_MEASUREMENT_INTERRUPTED, "()Lv/VText;", "set_upgrade_btn", "(Lv/VText;)V", "_upgrade_btn", "A", "get_level_rights", "set_level_rights", "_level_rights", "Landroidx/recyclerview/widget/RecyclerView;", "B", "Landroidx/recyclerview/widget/RecyclerView;", j6f.GPS_DIRECTION_TRUE, "()Landroidx/recyclerview/widget/RecyclerView;", "set_rv_right", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_rv_right", "Lcom/p1/mobile/android/app/Dialog;", b2s.C_ZONE, "Lcom/p1/mobile/android/app/Dialog;", "tipDialog", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class xul0 extends LiveMenuDialogHolder<cvl0> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public TextView _level_rights;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public RecyclerView _rv_right;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public Dialog tipDialog;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public ConstraintLayout _root;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public View _dialog_bg_first;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public View _dialog_bg_second;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public View _top_view;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public ImageView _back;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public ImageView _answer;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public ScrollView _scroll_view;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public View _level_bg;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public ImageView _level_bg2;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public VDraweeView _iv_grade;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public TextView _tv_level;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public HeatChallengeProgressView _progress;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public TextView _next_level;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public VText _upgrade_btn;

    /* JADX INFO: renamed from: l.xul0$a */
    @Metadata(m87231d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"l/xul0$a", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C21221a extends RecyclerView.AbstractC0576n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C0588z state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            super.getItemOffsets(outRect, view, parent, state);
            int i = t100.f167256e;
            outRect.set(i, i, i, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xul0(@NotNull Act act, @NotNull cvl0 cvl0Var) {
        super(t6c0.f168170R6, act, cvl0Var, j2g0.m139456c(0.3f));
        act.getClass();
        cvl0Var.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: G */
    public static void m211119G(xul0 xul0Var, View view) {
        uep0.m193327n(xul0Var.tipDialog);
    }

    /* JADX INFO: renamed from: H */
    public static void m211120H(xul0 xul0Var, BLiveVoiceRoomLevelDetail bLiveVoiceRoomLevelDetail, View view) {
        q2f.C19397d<x1e0, C22306c<x1e0>> c19397dHandleScheme = ((cvl0) xul0Var.f47757b).m206028F2().SchemeHandleEvent.handleScheme();
        BLiveVoiceRoomNextLevel bLiveVoiceRoomNextLevel = bLiveVoiceRoomLevelDetail.nextLevelButton;
        bLiveVoiceRoomNextLevel.getClass();
        c19397dHandleScheme.mo172463j(x1e0.m206696b(7012, bLiveVoiceRoomNextLevel.schema));
    }

    /* JADX INFO: renamed from: I */
    public static void m211121I(xul0 xul0Var, View view) {
        xul0Var.mo71838p();
    }

    /* JADX INFO: renamed from: J */
    public static void m211122J(xul0 xul0Var, View view) {
        xul0Var.m211138Y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    public static final void m211123X(xul0 xul0Var, Ref.ObjectRef objectRef, View view) {
        String str = ((BLiveVoiceVirtualRoomLevelRight) objectRef.element).title;
        str.getClass();
        String str2 = ((BLiveVoiceVirtualRoomLevelRight) objectRef.element).content;
        str2.getClass();
        String str3 = ((BLiveVoiceVirtualRoomLevelRight) objectRef.element).contentImg;
        str3.getClass();
        xul0Var.m211139Z(str, str2, str3, 1);
    }

    /* JADX INFO: renamed from: r */
    private final void m211124r() {
        xdl0.m208329E0(m211127M(), new View.OnClickListener() { // from class: l.sul0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xul0.m211122J(this.f166485a, view);
            }
        });
        xdl0.m208329E0(m211128N(), new View.OnClickListener() { // from class: l.tul0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xul0.m211121I(this.f172199a, view);
            }
        });
        m211134T().setLayoutManager(new GridLayoutManager(m211134T().getContext(), 3));
        m211134T().setAdapter(new LiveBaseAdapter());
        m211134T().addItemDecoration(new C21221a());
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        Context context = m211133S().getContext();
        context.getClass();
        return context;
    }

    /* JADX INFO: renamed from: K */
    public final void m211125K(View view) {
        yul0.m216128a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final View m211126L(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM216129b = yul0.m216129b(this, inflater, parent);
        viewM216129b.getClass();
        return viewM216129b;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final ImageView m211127M() {
        ImageView imageView = this._answer;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_answer");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final ImageView m211128N() {
        ImageView imageView = this._back;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_back");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final View m211129O() {
        View view = this._dialog_bg_second;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_dialog_bg_second");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VDraweeView m211130P() {
        VDraweeView vDraweeView = this._iv_grade;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_iv_grade");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final TextView m211131Q() {
        TextView textView = this._next_level;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_next_level");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final HeatChallengeProgressView m211132R() {
        HeatChallengeProgressView heatChallengeProgressView = this._progress;
        if (heatChallengeProgressView != null) {
            return heatChallengeProgressView;
        }
        Intrinsics.m87502r("_progress");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final ConstraintLayout m211133S() {
        ConstraintLayout constraintLayout = this._root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final RecyclerView m211134T() {
        RecyclerView recyclerView = this._rv_right;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m87502r("_rv_right");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final TextView m211135U() {
        TextView textView = this._tv_level;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_tv_level");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VText m211136V() {
        VText vText = this._upgrade_btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_upgrade_btn");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, com.p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomLevelRight] */
    /* JADX INFO: renamed from: W */
    public final void m211137W(@NotNull final BLiveVoiceRoomLevelDetail data) {
        data.getClass();
        m211140a0(data);
        if (!TextUtils.isEmpty(data.levelBgStartColor) && !TextUtils.isEmpty(data.levelBgEndColor)) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            float f = t100.f167268q;
            gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
            gradientDrawable.setColors(new int[]{kvc0.m147358g(data.levelBgStartColor), kvc0.m147358g(data.levelBgEndColor)});
            m211129O().setBackground(gradientDrawable);
        }
        m211132R().setBackground(zb2.m217814b(data.progressBgColor, t100.f167256e));
        m211132R().setStartColor(kvc0.m147358g(data.progressColor));
        m211132R().setEndColor(kvc0.m147358g(data.progressColor));
        m211132R().setContentRatio(data.progress);
        m211131Q().setText(data.nextLevelDesc);
        if (data.nextLevelButton != null) {
            VText vTextM211136V = m211136V();
            BLiveVoiceRoomNextLevel bLiveVoiceRoomNextLevel = data.nextLevelButton;
            bLiveVoiceRoomNextLevel.getClass();
            vTextM211136V.setText(bLiveVoiceRoomNextLevel.name);
            m211136V().setTypeface(Typeface.DEFAULT_BOLD);
            xdl0.m208344M(m211136V(), true);
            xdl0.m208329E0(m211136V(), new View.OnClickListener() { // from class: l.vul0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xul0.m211120H(this.f183088a, data, view);
                }
            });
        } else {
            xdl0.m208344M(m211136V(), false);
        }
        m211135U().setText("当前等级 LV." + data.level);
        hxs.m133406s("context_livingAct", m211130P(), data.levelIcon);
        ArrayList arrayList = new ArrayList();
        List<BLiveVoiceVirtualRoomLevelRight> list = data.levelRights;
        list.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ?? r1 = (BLiveVoiceVirtualRoomLevelRight) it.next();
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = r1;
            yrl0 yrl0Var = new yrl0((BLiveVoiceVirtualRoomLevelRight) objectRef.element);
            yrl0Var.mo109662A(new View.OnClickListener() { // from class: l.wul0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xul0.m211123X(this.f188141a, objectRef, view);
                }
            });
            arrayList.add(yrl0Var);
        }
        RecyclerView.Adapter adapter = m211134T().getAdapter();
        adapter.getClass();
        ((LiveBaseAdapter) adapter).m67371Z(arrayList);
    }

    /* JADX INFO: renamed from: Y */
    public final void m211138Y() {
        m211139Z("如何升级", "1.随着群成员在麦上的时长累积，群等级提升\n 2.群热度越高，升级速度越快哦", "", 3);
    }

    /* JADX INFO: renamed from: Z */
    public final void m211139Z(String title, String content, String contentImg, int gravity) {
        Dialog dialog = this.tipDialog;
        if (dialog != null) {
            uep0.m193327n(dialog);
        }
        LinearLayout linearLayout = new LinearLayout(m211133S().getContext());
        linearLayout.setOrientation(1);
        int i = xdl0.f192404f;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        int i2 = t100.f167273v;
        layoutParams.topMargin = i2;
        layoutParams.gravity = 1;
        TextView textView = new TextView(m211133S().getContext());
        textView.setTextColor(Color.parseColor("#CC000000"));
        textView.setText(title);
        textView.setTextSize(18.0f);
        textView.setGravity(1);
        linearLayout.addView(textView, layoutParams);
        TextView textView2 = new TextView(m211133S().getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(xdl0.f192403e, xdl0.f192404f);
        layoutParams2.topMargin = t100.f167266o;
        layoutParams2.leftMargin = i2;
        layoutParams2.rightMargin = i2;
        textView2.setTextColor(Color.parseColor("#66000000"));
        textView2.setText(content);
        textView2.setTextSize(14.0f);
        textView2.setGravity(gravity);
        linearLayout.addView(textView2, layoutParams2);
        if (contentImg.length() > 0) {
            VDraweeView vDraweeView = new VDraweeView(m211133S().getContext());
            vDraweeView.getHierarchy().m112076w(ftd0.f99177a);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(t100.m186890d(247.0f), t100.m186890d(69.0f));
            layoutParams3.topMargin = t100.f167259h;
            layoutParams3.leftMargin = i2;
            layoutParams3.rightMargin = i2;
            layoutParams3.gravity = 1;
            hxs.m133406s("context_livingAct", vDraweeView, contentImg);
            linearLayout.addView(vDraweeView, layoutParams3);
        }
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(xdl0.f192403e, t100.f167230E);
        layoutParams4.topMargin = t100.f167268q;
        layoutParams4.bottomMargin = i2;
        layoutParams4.leftMargin = i2;
        layoutParams4.rightMargin = i2;
        TextView textView3 = new TextView(m211133S().getContext());
        textView3.setTextColor(Color.parseColor("#FFFFFF"));
        textView3.setTextSize(16.0f);
        textView3.setText("我知道了");
        textView3.setGravity(17);
        textView3.setBackgroundResource(i3c0.f111106o0);
        linearLayout.addView(textView3, layoutParams4);
        xdl0.m208329E0(textView3, new View.OnClickListener() { // from class: l.uul0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xul0.m211119G(this.f178404a, view);
            }
        });
        Dialog dialogM20567z = ((cvl0) this.f47757b).act().dialog().m20516L(d8c0.f84854i).m20520P(linearLayout, false).m20496B(true).m20567z();
        this.tipDialog = dialogM20567z;
        if (dialogM20567z != null) {
            dialogM20567z.show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    public final void m211140a0(BLiveVoiceRoomLevelDetail data) {
        zvf0.m220368A("e_audio_room_grade_info", ((nnn0) ((cvl0) this.f47757b).m206027E2()).mo97490p() ? "p_anchor_audio_room" : "p_user_audio_room", j760.m140076a("anchorId", ((nnn0) ((cvl0) this.f47757b).m206027E2()).m132140j0()), j760.m140076a("liveId", ((nnn0) ((cvl0) this.f47757b).m206027E2()).m149814k()), j760.m140076a("roomId", ((nnn0) ((cvl0) this.f47757b).m206027E2()).m149818o()), j760.m140076a(FirebaseAnalytics.Param.LEVEL, Integer.valueOf(data.level)));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        inflater.getClass();
        parent.getClass();
        return m211126L(inflater, parent);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(@NotNull View view) {
        view.getClass();
        super.mo71836m(view);
        m211125K(view);
        m211124r();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo71841w() {
        super.mo71841w();
        uep0.m193327n(this.tipDialog);
        if (m211132R() != null) {
            m211132R().setContentRatio(0.0f);
        }
    }
}
