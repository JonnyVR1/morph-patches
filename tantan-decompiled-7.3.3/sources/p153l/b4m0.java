package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomLevelDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomNextLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomLevelRight;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.heatchallenge.HeatChallengeProgressView;
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
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\"\u0010\fJ\u001f\u0010#\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010!J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b'\u0010\u0013J\u000f\u0010(\u001a\u00020\nH\u0014¢\u0006\u0004\b(\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00109\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010\fR\"\u0010=\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u00105\u001a\u0004\b;\u00107\"\u0004\b<\u0010\fR\"\u0010A\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u00105\u001a\u0004\b?\u00107\"\u0004\b@\u0010\fR\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010T\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010D\u001a\u0004\bR\u0010F\"\u0004\bS\u0010HR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010`\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u00105\u001a\u0004\b^\u00107\"\u0004\b_\u0010\fR\"\u0010d\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010D\u001a\u0004\bb\u0010F\"\u0004\bc\u0010HR\"\u0010l\u001a\u00020e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010o\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010L\u001a\u0004\bm\u0010N\"\u0004\bn\u0010PR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010{\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bx\u0010L\u001a\u0004\by\u0010N\"\u0004\bz\u0010PR&\u0010\u0083\u0001\u001a\u00020|8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R&\u0010\u0087\u0001\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010L\u001a\u0005\b\u0085\u0001\u0010N\"\u0005\b\u0086\u0001\u0010PR*\u0010\u008f\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001c\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001¨\u0006\u0094\u0001"}, m88121d2 = {"Ll/b4m0;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/g4m0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/g4m0;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "K", "(Landroid/view/View;)V", "r", "()V", "Y", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoomLevelDetail;", "data", "a0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoomLevelDetail;)V", "", "title", "content", "contentImg", "", "gravity", "Z", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "L", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "m", "inflateView", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "W", "w", "k", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroidx/constraintlayout/widget/ConstraintLayout;", BLiveStormDanmakuGiftResourceType.f45292l, "Landroidx/constraintlayout/widget/ConstraintLayout;", p7f.LATITUDE_SOUTH, "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_root", "Landroid/view/View;", "get_dialog_bg_first", "()Landroid/view/View;", "set_dialog_bg_first", "_dialog_bg_first", "n", BloodType.f39576O, "set_dialog_bg_second", "_dialog_bg_second", "o", "get_top_view", "set_top_view", "_top_view", "Landroid/widget/ImageView;", "p", "Landroid/widget/ImageView;", "N", "()Landroid/widget/ImageView;", "set_back", "(Landroid/widget/ImageView;)V", "_back", "Landroid/widget/TextView;", "q", "Landroid/widget/TextView;", "get_title", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "M", "set_answer", "_answer", "Landroid/widget/ScrollView;", BLiveStormDanmakuGiftResourceType.f45294s, "Landroid/widget/ScrollView;", "get_scroll_view", "()Landroid/widget/ScrollView;", "set_scroll_view", "(Landroid/widget/ScrollView;)V", "_scroll_view", Constants.KEY_T, "get_level_bg", "set_level_bg", "_level_bg", "u", "get_level_bg2", "set_level_bg2", "_level_bg2", "Lv/VDraweeView;", ResourceDirection.f39656v, "Lv/VDraweeView;", "P", "()Lv/VDraweeView;", "set_iv_grade", "(Lv/VDraweeView;)V", "_iv_grade", "U", "set_tv_level", "_tv_level", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/heatchallenge/HeatChallengeProgressView;", BaseSei.f14624X, "Lcom/p1/mobile/putong/live/livingroom/voice/intl/heatchallenge/HeatChallengeProgressView;", "R", "()Lcom/p1/mobile/putong/live/livingroom/voice/intl/heatchallenge/HeatChallengeProgressView;", "set_progress", "(Lcom/p1/mobile/putong/live/livingroom/voice/intl/heatchallenge/HeatChallengeProgressView;)V", "_progress", BaseSei.f14625Y, "Q", "set_next_level", "_next_level", "Lv/VText;", BaseSei.f14626Z, "Lv/VText;", p7f.GPS_MEASUREMENT_INTERRUPTED, "()Lv/VText;", "set_upgrade_btn", "(Lv/VText;)V", "_upgrade_btn", "A", "get_level_rights", "set_level_rights", "_level_rights", "Landroidx/recyclerview/widget/RecyclerView;", "B", "Landroidx/recyclerview/widget/RecyclerView;", p7f.GPS_DIRECTION_TRUE, "()Landroidx/recyclerview/widget/RecyclerView;", "set_rv_right", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_rv_right", "Lcom/p1/mobile/android/app/Dialog;", c4s.C_ZONE, "Lcom/p1/mobile/android/app/Dialog;", "tipDialog", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class b4m0 extends LiveMenuDialogHolder<g4m0> {

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

    /* JADX INFO: renamed from: l.b4m0$a */
    @Metadata(m88120d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"l/b4m0$a", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$a0;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C15926a extends RecyclerView.AbstractC0578n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C0561a0 state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            super.getItemOffsets(outRect, view, parent, state);
            int i = qa00.f156318e;
            outRect.set(i, i, i, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4m0(@NotNull Act act, @NotNull g4m0 g4m0Var) {
        super(yec0.f198902R6, act, g4m0Var, qag0.m175922c(0.3f));
        act.getClass();
        g4m0Var.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: G */
    public static void m102475G(b4m0 b4m0Var, View view) {
        ynp0.m216937n(b4m0Var.tipDialog);
    }

    /* JADX INFO: renamed from: H */
    public static void m102476H(b4m0 b4m0Var, BLiveVoiceRoomLevelDetail bLiveVoiceRoomLevelDetail, View view) {
        v3f.C20736d<bae0, C22421c<bae0>> c20736dHandleScheme = ((g4m0) b4m0Var.f48605b).m213811F2().SchemeHandleEvent.handleScheme();
        BLiveVoiceRoomNextLevel bLiveVoiceRoomNextLevel = bLiveVoiceRoomLevelDetail.nextLevelButton;
        bLiveVoiceRoomNextLevel.getClass();
        c20736dHandleScheme.mo199273j(bae0.m103149b(7012, bLiveVoiceRoomNextLevel.schema));
    }

    /* JADX INFO: renamed from: I */
    public static void m102477I(b4m0 b4m0Var, View view) {
        b4m0Var.mo73021p();
    }

    /* JADX INFO: renamed from: J */
    public static void m102478J(b4m0 b4m0Var, View view) {
        b4m0Var.m102494Y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    public static final void m102479X(b4m0 b4m0Var, Ref.ObjectRef objectRef, View view) {
        String str = ((BLiveVoiceVirtualRoomLevelRight) objectRef.element).title;
        str.getClass();
        String str2 = ((BLiveVoiceVirtualRoomLevelRight) objectRef.element).content;
        str2.getClass();
        String str3 = ((BLiveVoiceVirtualRoomLevelRight) objectRef.element).contentImg;
        str3.getClass();
        b4m0Var.m102495Z(str, str2, str3, 1);
    }

    /* JADX INFO: renamed from: r */
    private final void m102480r() {
        bnl0.m105509E0(m102483M(), new View.OnClickListener() { // from class: l.w3m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b4m0.m102478J(this.f187152a, view);
            }
        });
        bnl0.m105509E0(m102484N(), new View.OnClickListener() { // from class: l.x3m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b4m0.m102477I(this.f192286a, view);
            }
        });
        m102490T().setLayoutManager(new GridLayoutManager(m102490T().getContext(), 3));
        m102490T().setAdapter(new LiveBaseAdapter());
        m102490T().addItemDecoration(new C15926a());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        Context context = m102489S().getContext();
        context.getClass();
        return context;
    }

    /* JADX INFO: renamed from: K */
    public final void m102481K(View view) {
        c4m0.m107934a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final View m102482L(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM107935b = c4m0.m107935b(this, inflater, parent);
        viewM107935b.getClass();
        return viewM107935b;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final ImageView m102483M() {
        ImageView imageView = this._answer;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_answer");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final ImageView m102484N() {
        ImageView imageView = this._back;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_back");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final View m102485O() {
        View view = this._dialog_bg_second;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_dialog_bg_second");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VDraweeView m102486P() {
        VDraweeView vDraweeView = this._iv_grade;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_iv_grade");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final TextView m102487Q() {
        TextView textView = this._next_level;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_next_level");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final HeatChallengeProgressView m102488R() {
        HeatChallengeProgressView heatChallengeProgressView = this._progress;
        if (heatChallengeProgressView != null) {
            return heatChallengeProgressView;
        }
        Intrinsics.m88391r("_progress");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final ConstraintLayout m102489S() {
        ConstraintLayout constraintLayout = this._root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final RecyclerView m102490T() {
        RecyclerView recyclerView = this._rv_right;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m88391r("_rv_right");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final TextView m102491U() {
        TextView textView = this._tv_level;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_tv_level");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VText m102492V() {
        VText vText = this._upgrade_btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_upgrade_btn");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, com.p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomLevelRight] */
    /* JADX INFO: renamed from: W */
    public final void m102493W(@NotNull final BLiveVoiceRoomLevelDetail data) {
        data.getClass();
        m102496a0(data);
        if (!TextUtils.isEmpty(data.levelBgStartColor) && !TextUtils.isEmpty(data.levelBgEndColor)) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            float f = qa00.f156330q;
            gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
            gradientDrawable.setColors(new int[]{n3d0.m161283g(data.levelBgStartColor), n3d0.m161283g(data.levelBgEndColor)});
            m102485O().setBackground(gradientDrawable);
        }
        m102488R().setBackground(gc2.m129823b(data.progressBgColor, qa00.f156318e));
        m102488R().setStartColor(n3d0.m161283g(data.progressColor));
        m102488R().setEndColor(n3d0.m161283g(data.progressColor));
        m102488R().setContentRatio(data.progress);
        m102487Q().setText(data.nextLevelDesc);
        if (data.nextLevelButton != null) {
            VText vTextM102492V = m102492V();
            BLiveVoiceRoomNextLevel bLiveVoiceRoomNextLevel = data.nextLevelButton;
            bLiveVoiceRoomNextLevel.getClass();
            vTextM102492V.setText(bLiveVoiceRoomNextLevel.name);
            m102492V().setTypeface(Typeface.DEFAULT_BOLD);
            bnl0.m105524M(m102492V(), true);
            bnl0.m105509E0(m102492V(), new View.OnClickListener() { // from class: l.z3m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b4m0.m102476H(this.f202842a, data, view);
                }
            });
        } else {
            bnl0.m105524M(m102492V(), false);
        }
        m102491U().setText("当前等级 LV." + data.level);
        izs.m142868s("context_livingAct", m102486P(), data.levelIcon);
        ArrayList arrayList = new ArrayList();
        List<BLiveVoiceVirtualRoomLevelRight> list = data.levelRights;
        list.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ?? r1 = (BLiveVoiceVirtualRoomLevelRight) it.next();
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = r1;
            c1m0 c1m0Var = new c1m0((BLiveVoiceVirtualRoomLevelRight) objectRef.element);
            c1m0Var.mo113881A(new View.OnClickListener() { // from class: l.a4m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b4m0.m102479X(this.f68429a, objectRef, view);
                }
            });
            arrayList.add(c1m0Var);
        }
        RecyclerView.Adapter adapter = m102490T().getAdapter();
        adapter.getClass();
        ((LiveBaseAdapter) adapter).m68554Z(arrayList);
    }

    /* JADX INFO: renamed from: Y */
    public final void m102494Y() {
        m102495Z("如何升级", "1.随着群成员在麦上的时长累积，群等级提升\n 2.群热度越高，升级速度越快哦", "", 3);
    }

    /* JADX INFO: renamed from: Z */
    public final void m102495Z(String title, String content, String contentImg, int gravity) {
        Dialog dialog = this.tipDialog;
        if (dialog != null) {
            ynp0.m216937n(dialog);
        }
        LinearLayout linearLayout = new LinearLayout(m102489S().getContext());
        linearLayout.setOrientation(1);
        int i = bnl0.f77545f;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        int i2 = qa00.f156335v;
        layoutParams.topMargin = i2;
        layoutParams.gravity = 1;
        TextView textView = new TextView(m102489S().getContext());
        textView.setTextColor(Color.parseColor("#CC000000"));
        textView.setText(title);
        textView.setTextSize(18.0f);
        textView.setGravity(1);
        linearLayout.addView(textView, layoutParams);
        TextView textView2 = new TextView(m102489S().getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(bnl0.f77544e, bnl0.f77545f);
        layoutParams2.topMargin = qa00.f156328o;
        layoutParams2.leftMargin = i2;
        layoutParams2.rightMargin = i2;
        textView2.setTextColor(Color.parseColor("#66000000"));
        textView2.setText(content);
        textView2.setTextSize(14.0f);
        textView2.setGravity(gravity);
        linearLayout.addView(textView2, layoutParams2);
        if (contentImg.length() > 0) {
            VDraweeView vDraweeView = new VDraweeView(m102489S().getContext());
            vDraweeView.getHierarchy().m207062w(h1e0.f107444a);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(qa00.m175859d(247.0f), qa00.m175859d(69.0f));
            layoutParams3.topMargin = qa00.f156321h;
            layoutParams3.leftMargin = i2;
            layoutParams3.rightMargin = i2;
            layoutParams3.gravity = 1;
            izs.m142868s("context_livingAct", vDraweeView, contentImg);
            linearLayout.addView(vDraweeView, layoutParams3);
        }
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(bnl0.f77544e, qa00.f156292E);
        layoutParams4.topMargin = qa00.f156330q;
        layoutParams4.bottomMargin = i2;
        layoutParams4.leftMargin = i2;
        layoutParams4.rightMargin = i2;
        TextView textView3 = new TextView(m102489S().getContext());
        textView3.setTextColor(Color.parseColor("#FFFFFF"));
        textView3.setTextSize(16.0f);
        textView3.setText("我知道了");
        textView3.setGravity(17);
        textView3.setBackgroundResource(obc0.f146434o0);
        linearLayout.addView(textView3, layoutParams4);
        bnl0.m105509E0(textView3, new View.OnClickListener() { // from class: l.y3m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b4m0.m102475G(this.f197380a, view);
            }
        });
        Dialog dialogM21566z = ((g4m0) this.f48605b).act().dialog().m21515L(jgc0.f120702i).m21519P(linearLayout, false).m21495B(true).m21566z();
        this.tipDialog = dialogM21566z;
        if (dialogM21566z != null) {
            dialogM21566z.show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    public final void m102496a0(BLiveVoiceRoomLevelDetail data) {
        i4g0.m138492A("e_audio_room_grade_info", ((rwn0) ((g4m0) this.f48605b).m213810E2()).mo118373p() ? "p_anchor_audio_room" : "p_user_audio_room", pf60.m172085a("anchorId", ((rwn0) ((g4m0) this.f48605b).m213810E2()).m168526j0()), pf60.m172085a("liveId", ((rwn0) ((g4m0) this.f48605b).m213810E2()).m202191k()), pf60.m172085a("roomId", ((rwn0) ((g4m0) this.f48605b).m213810E2()).m202194o()), pf60.m172085a(FirebaseAnalytics.Param.LEVEL, Integer.valueOf(data.level)));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        inflater.getClass();
        parent.getClass();
        return m102482L(inflater, parent);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(@NotNull View view) {
        view.getClass();
        super.mo73019m(view);
        m102481K(view);
        m102480r();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo73024w() {
        super.mo73024w();
        ynp0.m216937n(this.tipDialog);
        if (m102488R() != null) {
            m102488R().setContentRatio(0.0f);
        }
    }
}
