package p153l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.LikeMindedData;
import com.p051p1.mobile.putong.core.data.LikeMindedEnvelope;
import com.p051p1.mobile.putong.core.data.LikeMindedRequestParams;
import com.p051p1.mobile.putong.core.data.SimilarInterestsBaseData;
import com.p051p1.mobile.putong.core.data.SimilarInterestsConfigData;
import com.p051p1.mobile.putong.core.data.SimilarInterestsItemData;
import com.p051p1.mobile.putong.core.data.SimilarInterestsItemLanguagesData;
import com.p051p1.mobile.putong.core.data.SimilarInterestsItemStatusData;
import com.p051p1.mobile.putong.core.data.SimilarInterestsMccConfigData;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundButton;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundView;
import com.p051p1.mobile.putong.core.p058ui.toppicks.OffsetGridLayoutManager;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import com.tencent.open.SocialConstants;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JK\u0010\u0011\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JK\u0010\u0013\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010%\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010I\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010P\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010T\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010K\u001a\u0004\bR\u0010M\"\u0004\bS\u0010OR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0016\u0010^\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010]R\u0016\u0010a\u001a\u00020_8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010`R\u0018\u0010d\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010g\u001a\u00020e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010fR\u001b\u0010k\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010i\u001a\u0004\bb\u0010j¨\u0006l"}, m88121d2 = {"Ll/rnf0;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "", "mccData", "Lcom/p1/mobile/putong/core/data/SimilarInterestsBaseData;", "baseData", "", "Lcom/p1/mobile/putong/core/data/SimilarInterestsItemData;", "listData", IjkMediaMeta.IJKM_KEY_LANGUAGE, "type", "", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/util/List;Lcom/p1/mobile/putong/core/data/SimilarInterestsBaseData;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "r", "Landroid/view/View;", "rootView", "Ll/pej0;", "j", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Ll/pej0;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/SimilarInterestsConfigData;", "data", "Lcom/p1/mobile/putong/core/data/LikeMindedData;", "likeMindedData", "", "source", "u", "(Lcom/p1/mobile/putong/core/data/SimilarInterestsConfigData;Lcom/p1/mobile/putong/core/data/LikeMindedData;I)V", "a", "Lcom/p1/mobile/android/app/Act;", RXScreenCaptureService.KEY_INDEX, "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "b", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "q", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;", "set_root_layout", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundConstraintLayout;)V", "_root_layout", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundView;", "c", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundView;", "get_top", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundView;", "set_top", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundView;)V", "_top", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lv/VDraweeView;", "set_bg_img", "(Lv/VDraweeView;)V", "_bg_img", "Lv/VPullUpRecyclerView;", "Lv/VPullUpRecyclerView;", "p", "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", "f", "Landroid/view/View;", "m", "()Landroid/view/View;", "set_bottom_monolayer_1", "(Landroid/view/View;)V", "_bottom_monolayer_1", "g", "n", "set_bottom_monolayer_2", "_bottom_monolayer_2", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "h", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "o", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "set_bt", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;)V", "_bt", "Ll/pej0;", OMSTemplateType.dialog, "Ll/knf0;", "Ll/knf0;", "_adapter", "k", "Ljava/lang/String;", "_currentType", "", "Z", "_isChanged", "Ll/l4g0;", "Lkotlin/Lazy;", "()Ll/l4g0;", "pageHelp", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class rnf0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public RoundConstraintLayout _root_layout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public RoundView _top;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _bg_img;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VPullUpRecyclerView _list;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public View _bottom_monolayer_1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public View _bottom_monolayer_2;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public RoundButton _bt;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public pej0 dialog;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public knf0 _adapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public String _currentType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean _isChanged;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Lazy pageHelp;

    /* JADX INFO: renamed from: l.rnf0$a */
    @Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/rnf0$a;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$a0;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19878a extends RecyclerView.AbstractC0578n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.C0561a0 state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                outRect.set(0, 0, 0, qa00.f156322i);
            } else if ((childAdapterPosition - 1) % 2 == 0) {
                outRect.set(0, 0, qa00.f156320g, qa00.f156325l);
            } else {
                outRect.set(qa00.f156320g, 0, 0, qa00.f156325l);
            }
        }
    }

    /* JADX INFO: renamed from: l.rnf0$b */
    @Metadata(m88120d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"l/rnf0$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "(Landroid/view/View;I)V", "", "onSlide", "(Landroid/view/View;F)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19879b extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pej0 f164032a;

        public C19879b(pej0 pej0Var) {
            this.f164032a = pej0Var;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View p0, float p1) {
            p0.getClass();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View p0, int p1) {
            p0.getClass();
            if (p1 == 4) {
                this.f164032a.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: l.rnf0$c */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {"l/rnf0$c", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19880c extends GridLayoutManager.AbstractC0554c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OffsetGridLayoutManager f164034b;

        public C19880c(OffsetGridLayoutManager offsetGridLayoutManager) {
            this.f164034b = offsetGridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int position) {
            knf0 knf0Var = rnf0.this._adapter;
            if (knf0Var == null) {
                Intrinsics.m88391r("_adapter");
                knf0Var = null;
            }
            if (knf0Var.getItemViewType(position) == 0) {
                return this.f164034b.m3318m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.rnf0$d */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/rnf0$d", "Ll/knf0$b;", "", "selectedType", "", "onClick", "(Ljava/lang/String;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19881d implements knf0.InterfaceC18215b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SimilarInterestsBaseData f164036b;

        public C19881d(SimilarInterestsBaseData similarInterestsBaseData) {
            this.f164036b = similarInterestsBaseData;
        }

        @Override // p153l.knf0.InterfaceC18215b
        public void onClick(String selectedType) {
            selectedType.getClass();
            rnf0.this.m182229o().setBackgroundColor(Color.parseColor(this.f164036b.bottomButtonBg));
            rnf0.this._currentType = selectedType;
            rnf0.this.m182229o().setText(rnf0.this.getAct().getString(R$string.f18604K8));
            rnf0.this._isChanged = true;
        }
    }

    /* JADX INFO: renamed from: l.rnf0$e */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"l/rnf0$e", "Ll/ur2;", "", "pageId", "()Ljava/lang/String;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19882e extends ur2 {
        @Override // p153l.e6m
        public String pageId() {
            return "p_activities_pets_page";
        }
    }

    public rnf0(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.pageHelp = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.pnf0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return rnf0.m182214a();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static l4g0 m182214a() {
        return new l4g0(new C19882e());
    }

    /* JADX INFO: renamed from: b */
    public static void m182215b(final rnf0 rnf0Var, View view) {
        if (rnf0Var._isChanged) {
            xnf0.INSTANCE.m212201s();
            final LikeMindedRequestParams likeMindedRequestParams = new LikeMindedRequestParams();
            likeMindedRequestParams.mcc = String.valueOf(uqb0.f180400f0);
            String str = rnf0Var._currentType;
            if (str == null) {
                str = "";
            }
            likeMindedRequestParams.type = str;
            CoreModule.f18264c.f20295B1.m132946e3(rnf0Var.act, likeMindedRequestParams, new Function1() { // from class: l.qnf0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return rnf0.m182221t(likeMindedRequestParams, rnf0Var, (LikeMindedEnvelope) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m182217d(rnf0 rnf0Var, List list, DialogInterface dialogInterface) {
        w1e.m204401e(rnf0Var.m182225k());
        int size = list.size();
        int i = 0;
        while (i < size) {
            knf0 knf0Var = rnf0Var._adapter;
            if (knf0Var == null) {
                Intrinsics.m88391r("_adapter");
                knf0Var = null;
            }
            i++;
            SimilarInterestsItemStatusData item = knf0Var.getItem(i);
            if (item != null) {
                item.isSelected = false;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m182221t(LikeMindedRequestParams likeMindedRequestParams, rnf0 rnf0Var, LikeMindedEnvelope likeMindedEnvelope) {
        likeMindedEnvelope.getClass();
        xnf0 xnf0Var = xnf0.INSTANCE;
        xnf0Var.m212195m().put(Boolean.TRUE);
        String str = likeMindedRequestParams.type;
        str.getClass();
        xnf0Var.m212202t(str);
        pej0 pej0Var = rnf0Var.dialog;
        if (pej0Var == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            pej0Var = null;
        }
        pej0Var.dismiss();
        o1j0.m165649w(R$string.f18718O1);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m182222e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM186915b = snf0.m186915b(this, inflater, parent);
        viewM186915b.getClass();
        return viewM186915b;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    /* JADX INFO: renamed from: j */
    public final pej0 m182224j(Act act, View rootView) {
        pej0 pej0Var = new pej0(act, agc0.f71118d);
        pej0Var.setContentView(rootView);
        pej0Var.setCancelable(true);
        pej0Var.getBehavior().setState(3);
        pej0Var.getBehavior().setPeekHeight(0);
        pej0Var.getBehavior().setSkipCollapsed(true);
        pej0Var.getBehavior().addBottomSheetCallback(new C19879b(pej0Var));
        return pej0Var;
    }

    /* JADX INFO: renamed from: k */
    public final l4g0 m182225k() {
        return (l4g0) this.pageHelp.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VDraweeView m182226l() {
        VDraweeView vDraweeView = this._bg_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final View m182227m() {
        View view = this._bottom_monolayer_1;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_bottom_monolayer_1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final View m182228n() {
        View view = this._bottom_monolayer_2;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_bottom_monolayer_2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final RoundButton m182229o() {
        RoundButton roundButton = this._bt;
        if (roundButton != null) {
            return roundButton;
        }
        Intrinsics.m88391r("_bt");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VPullUpRecyclerView m182230p() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.m88391r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final RoundConstraintLayout m182231q() {
        RoundConstraintLayout roundConstraintLayout = this._root_layout;
        if (roundConstraintLayout != null) {
            return roundConstraintLayout;
        }
        Intrinsics.m88391r("_root_layout");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m182232r(List<String> mccData, SimilarInterestsBaseData baseData, Map<String, SimilarInterestsItemData> listData, String language, String type) {
        knf0 knf0Var;
        this._adapter = new knf0(this.act);
        VPullUpRecyclerView vPullUpRecyclerViewM182230p = m182230p();
        OffsetGridLayoutManager offsetGridLayoutManager = new OffsetGridLayoutManager(this.act, 2, 1, false);
        offsetGridLayoutManager.m3327v(new C19880c(offsetGridLayoutManager));
        vPullUpRecyclerViewM182230p.setLayoutManager(offsetGridLayoutManager);
        knf0 knf0Var2 = this._adapter;
        knf0 knf0Var3 = null;
        if (knf0Var2 == null) {
            Intrinsics.m88391r("_adapter");
            knf0Var2 = null;
        }
        vPullUpRecyclerViewM182230p.setAdapter(knf0Var2);
        vPullUpRecyclerViewM182230p.addItemDecoration(new C19878a());
        knf0 knf0Var4 = this._adapter;
        if (knf0Var4 == null) {
            Intrinsics.m88391r("_adapter");
            knf0Var = null;
        } else {
            knf0Var = knf0Var4;
        }
        knf0Var.m150519M(mccData, listData, language, baseData, type);
        knf0 knf0Var5 = this._adapter;
        if (knf0Var5 == null) {
            Intrinsics.m88391r("_adapter");
        } else {
            knf0Var3 = knf0Var5;
        }
        knf0Var3.m150520N(new C19881d(baseData));
    }

    /* JADX INFO: renamed from: s */
    public final void m182233s(final List<String> mccData, SimilarInterestsBaseData baseData, Map<String, SimilarInterestsItemData> listData, String language, String type) {
        SimilarInterestsItemData similarInterestsItemData;
        Map<String, SimilarInterestsItemLanguagesData> map;
        SimilarInterestsItemLanguagesData similarInterestsItemLanguagesData;
        SimilarInterestsItemStatusData similarInterestsItemStatusData;
        Map<String, SimilarInterestsItemLanguagesData> map2;
        SimilarInterestsItemLanguagesData similarInterestsItemLanguagesData2;
        SimilarInterestsItemStatusData similarInterestsItemStatusData2;
        this._currentType = type;
        try {
            uqb0.f180374G.m127115L0(m182226l(), baseData.background.img);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            m182231q().setBackground(new GradientDrawable(orientation, new int[]{Color.parseColor(baseData.background.startColor), Color.parseColor(baseData.background.endColor)}));
            pej0 pej0Var = null;
            if (TextUtils.isEmpty(type)) {
                m182229o().setBackgroundColor(this.act.getResources().getColor(c9c0.f80355M0));
                m182229o().setText(this.act.getString(R$string.f18665M8));
            } else {
                m182229o().setBackgroundColor(Color.parseColor(baseData.bottomButtonSelectedBg));
                SimilarInterestsItemData similarInterestsItemData2 = listData.get(type);
                String str = (similarInterestsItemData2 == null || (map2 = similarInterestsItemData2.multiLanguage) == null || (similarInterestsItemLanguagesData2 = map2.get(language)) == null || (similarInterestsItemStatusData2 = similarInterestsItemLanguagesData2.status) == null) ? null : similarInterestsItemStatusData2.title;
                RoundButton roundButtonM182229o = m182229o();
                Act act = this.act;
                int i = R$string.f18635L8;
                if (str == null && ((similarInterestsItemData = listData.get(type)) == null || (map = similarInterestsItemData.multiLanguage) == null || (similarInterestsItemLanguagesData = map.get("en-US")) == null || (similarInterestsItemStatusData = similarInterestsItemLanguagesData.status) == null || (str = similarInterestsItemStatusData.title) == null)) {
                    str = "";
                }
                roundButtonM182229o.setText(act.getString(i, str));
            }
            m182229o().setTextColor(Color.parseColor(baseData.bottomButtonTextColor));
            m182227m().setBackground(new GradientDrawable(orientation, new int[]{Color.parseColor(baseData.bottomMonolayer.startColor), Color.parseColor(baseData.bottomMonolayer.endColor)}));
            m182228n().setBackgroundColor(Color.parseColor(baseData.bottomMonolayer.endColor));
            bnl0.m105509E0(m182229o(), new View.OnClickListener() { // from class: l.nnf0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    rnf0.m182215b(this.f142783a, view);
                }
            });
            m182232r(mccData, baseData, listData, language, type);
            w1e.m204402f(m182225k());
            pej0 pej0Var2 = this.dialog;
            if (pej0Var2 == null) {
                Intrinsics.m88391r(OMSTemplateType.dialog);
            } else {
                pej0Var = pej0Var2;
            }
            pej0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.onf0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    rnf0.m182217d(this.f148085a, mccData, dialogInterface);
                }
            });
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m182234u(@Nullable SimilarInterestsConfigData data, @Nullable LikeMindedData likeMindedData, int source) {
        SimilarInterestsMccConfigData similarInterestsMccConfigData;
        if (data != null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.act);
            layoutInflaterFrom.getClass();
            pej0 pej0Var = null;
            this.dialog = m182224j(this.act, m182222e(layoutInflaterFrom, null));
            if (!data.mcc.containsKey(String.valueOf(uqb0.f180400f0)) || (similarInterestsMccConfigData = data.mcc.get(String.valueOf(uqb0.f180400f0))) == null) {
                return;
            }
            List<String> list = similarInterestsMccConfigData.items;
            list.getClass();
            SimilarInterestsBaseData similarInterestsBaseData = data.baseData;
            similarInterestsBaseData.getClass();
            Map<String, SimilarInterestsItemData> map = data.listData;
            map.getClass();
            xnf0 xnf0Var = xnf0.INSTANCE;
            m182233s(list, similarInterestsBaseData, map, xnf0Var.m212189g(), likeMindedData != null ? likeMindedData.type : null);
            xnf0Var.m212186d(source);
            pej0 pej0Var2 = this.dialog;
            if (pej0Var2 == null) {
                Intrinsics.m88391r(OMSTemplateType.dialog);
            } else {
                pej0Var = pej0Var2;
            }
            pej0Var.show();
        }
    }
}
