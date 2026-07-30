package com.p046p1.mobile.putong.live.external.internal.live.square.activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchors;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.internal.live.square.activities.LiveSuggestPopAct;
import com.p046p1.mobile.putong.live.external.internal.live.square.api.MultiFollowShipPlug;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseAct;
import com.p046p1.mobile.putong.live.external.square.api.ModelData;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.adu;
import p149l.d1q;
import p149l.e30;
import p149l.h3c0;
import p149l.iau;
import p149l.mau;
import p149l.osi0;
import p149l.pds;
import p149l.s9s;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.y25;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 N2\u00020\u0001:\u0001OB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u0019\u0010\u000fR\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010=\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010$\u001a\u0004\b;\u0010&\"\u0004\b<\u0010(R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R+\u0010I\u001a\u0012\u0012\u0004\u0012\u00020C0Bj\b\u0012\u0004\u0012\u00020C`D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006P"}, m87232d2 = {"Lcom/p1/mobile/putong/live/external/internal/live/square/activities/LiveSuggestPopAct;", "Lcom/p1/mobile/putong/live/external/module/arch/LiveBaseAct;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "i2", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "h2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "initSubscription", "r2", "Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;", "data", "p2", "(Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;)V", "", "pageId", "()Ljava/lang/String;", "inflateView", "Lv/VImage;", "c", "Lv/VImage;", "m2", "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", "Lv/VText;", Constants.INAPP_DATA_TAG, "Lv/VText;", "get_welcome", "()Lv/VText;", "set_welcome", "(Lv/VText;)V", "_welcome", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "get_content", "()Landroid/widget/TextView;", "set_content", "(Landroid/widget/TextView;)V", "_content", "Lv/VRecyclerView;", "f", "Lv/VRecyclerView;", "o2", "()Lv/VRecyclerView;", "set_recycle", "(Lv/VRecyclerView;)V", "_recycle", "g", "n2", "set_follow", "_follow", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "h", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "mAdapter", "Ljava/util/ArrayList;", "Ll/mau;", "Lkotlin/collections/ArrayList;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", "l2", "()Ljava/util/ArrayList;", "mData", "Lcom/p1/mobile/putong/live/external/internal/live/square/api/MultiFollowShipPlug;", "j", "Lcom/p1/mobile/putong/live/external/internal/live/square/api/MultiFollowShipPlug;", "followApi", "Companion", "a", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class LiveSuggestPopAct extends LiveBaseAct {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _welcome;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _content;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VRecyclerView _recycle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _follow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final LiveBaseAdapter mAdapter = new LiveBaseAdapter();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy mData = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.z9u
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LiveSuggestPopAct.m68977Z1();
        }
    });

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final MultiFollowShipPlug followApi = new MultiFollowShipPlug(this);

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.live.square.activities.LiveSuggestPopAct$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Lcom/p1/mobile/putong/live/external/internal/live/square/activities/LiveSuggestPopAct$a;", "", "<init>", "()V", "Landroid/app/Activity;", SocialConstants.PARAM_ACT, "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;", "Lkotlin/collections/ArrayList;", "resultData", "Landroid/content/Intent;", "a", "(Landroid/app/Activity;Ljava/util/ArrayList;)Landroid/content/Intent;", "", "DATA_KEY", "Ljava/lang/String;", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m68996a(@NotNull Activity act, @NotNull ArrayList<BLiveAnchors> resultData) {
            act.getClass();
            resultData.getClass();
            Intent intent = new Intent(act, (Class<?>) LiveSuggestPopAct.class);
            intent.putExtra("DATA_KEY", resultData);
            return intent;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.live.square.activities.LiveSuggestPopAct$b */
    @Metadata(m87231d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"com/p1/mobile/putong/live/external/internal/live/square/activities/LiveSuggestPopAct$b", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12493b extends RecyclerView.AbstractC0576n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C0588z state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            outRect.set(xdl0.m208407w(15.0f), xdl0.m208407w(14.0f), xdl0.m208407w(15.0f), 0);
        }
    }

    /* JADX INFO: renamed from: V1 */
    public static Unit m68974V1(final LiveSuggestPopAct liveSuggestPopAct, ModelData modelData) {
        d1q d1qVar;
        modelData.getClass();
        if (!modelData.isLoading()) {
            liveSuggestPopAct.m68992n2().setEnabled(true);
        }
        if (modelData.isError()) {
            osi0.m165782f(R$string.f44877O);
        }
        if (modelData.isSuccess() && !vwb.m200296J(liveSuggestPopAct.followApi.getUserIds()) && (d1qVar = (d1q) vwb.m200346r(liveSuggestPopAct.mAdapter.m67355J(), new w9j() { // from class: l.cau
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveSuggestPopAct.m68986q2(this.f80064a, (d1q) obj);
            }
        })) != null && (d1qVar instanceof mau)) {
            liveSuggestPopAct.m68994p2(((mau) d1qVar).getData());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X1 */
    public static void m68975X1(final LiveSuggestPopAct liveSuggestPopAct, View view) throws JSONException {
        liveSuggestPopAct.m68992n2().setEnabled(false);
        liveSuggestPopAct.followApi.getUserIds().clear();
        vwb.m200354z(liveSuggestPopAct.mAdapter.m67355J(), new e30() { // from class: l.hau
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveSuggestPopAct.m68985k2(this.f106838a, (d1q) obj);
            }
        });
        if (vwb.m200296J(liveSuggestPopAct.followApi.getUserIds())) {
            liveSuggestPopAct.m68992n2().setEnabled(true);
        } else {
            liveSuggestPopAct.followApi.getData();
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public static ArrayList m68977Z1() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: a2 */
    public static mau m68978a2(final LiveSuggestPopAct liveSuggestPopAct, BLiveAnchors bLiveAnchors) {
        bLiveAnchors.getClass();
        final mau mauVar = new mau(bLiveAnchors);
        mauVar.m153837N(new Function0() { // from class: l.fau
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveSuggestPopAct.m68987s2(this.f96660a, mauVar);
            }
        });
        return mauVar;
    }

    /* JADX INFO: renamed from: c2 */
    public static void m68980c2(LiveSuggestPopAct liveSuggestPopAct, View view) {
        zvf0.m220396r("e_live_no_action_guide_close", liveSuggestPopAct.pageId());
        liveSuggestPopAct.m44477e2();
    }

    /* JADX INFO: renamed from: d2 */
    public static void m68981d2(LiveSuggestPopAct liveSuggestPopAct, Bundle bundle) {
        liveSuggestPopAct.m68984i2(bundle);
    }

    /* JADX INFO: renamed from: i2 */
    private final void m68984i2(Bundle savedInstanceState) {
        xdl0.m208329E0(m68991m2(), new View.OnClickListener() { // from class: l.dau
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveSuggestPopAct.m68980c2(this.f85264a, view);
            }
        });
        xdl0.m208329E0(m68992n2(), new View.OnClickListener() { // from class: l.eau
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                LiveSuggestPopAct.m68975X1(this.f90266a, view);
            }
        });
        m68993o2().setLayoutManager(new GridLayoutManager(this, 3));
        m68993o2().addItemDecoration(new C12493b());
        m68993o2().setAdapter(this.mAdapter);
    }

    /* JADX INFO: renamed from: k2 */
    public static final void m68985k2(LiveSuggestPopAct liveSuggestPopAct, d1q d1qVar) {
        if (d1qVar instanceof mau) {
            mau mauVar = (mau) d1qVar;
            if (mauVar.getIsCheck()) {
                liveSuggestPopAct.followApi.getUserIds().add(mauVar.getData().userId);
                adu.m96005a(liveSuggestPopAct.pageId(), pds.m168401k().m168404b(mauVar.getData().userId).m168405c("live_no_action_guide").m168408f(mauVar.getData().userId).m168403a());
            }
        }
    }

    /* JADX INFO: renamed from: q2 */
    public static final Boolean m68986q2(LiveSuggestPopAct liveSuggestPopAct, d1q d1qVar) {
        return d1qVar instanceof mau ? Boolean.valueOf(Intrinsics.m87488d(((mau) d1qVar).getData().userId, liveSuggestPopAct.followApi.getUserIds().get(0))) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: s2 */
    public static final Unit m68987s2(LiveSuggestPopAct liveSuggestPopAct, mau mauVar) {
        if (((d1q) vwb.m200346r(liveSuggestPopAct.mAdapter.m67355J(), new w9j() { // from class: l.gau
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveSuggestPopAct.m68988u2((d1q) obj);
            }
        })) != null) {
            liveSuggestPopAct.m68992n2().setEnabled(true);
            liveSuggestPopAct.m68992n2().setBackgroundResource(h3c0.f105684l);
        } else {
            liveSuggestPopAct.m68992n2().setEnabled(false);
            liveSuggestPopAct.m68992n2().setBackgroundResource(h3c0.f105675i);
        }
        liveSuggestPopAct.mAdapter.m67361P(mauVar, new y25(mauVar.getIsCheck()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u2 */
    public static final Boolean m68988u2(d1q d1qVar) {
        return d1qVar instanceof mau ? Boolean.valueOf(((mau) d1qVar).getIsCheck()) : Boolean.FALSE;
    }

    @NotNull
    /* JADX INFO: renamed from: h2 */
    public final View m68989h2(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM135200b = iau.m135200b(this, inflater, parent);
        viewM135200b.getClass();
        return viewM135200b;
    }

    @Override // com.p046p1.mobile.android.app.Act
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM68989h2 = m68989h2(inflater, parent);
        m68995r2();
        return viewM68989h2;
    }

    @Override // com.p046p1.mobile.putong.live.external.module.arch.LiveBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.aau
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveSuggestPopAct.m68981d2(this.f68603a, (Bundle) obj);
            }
        });
        this.followApi.observe(new Function1() { // from class: l.bau
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveSuggestPopAct.m68974V1(this.f74722a, (ModelData) obj);
            }
        });
        HashMap map = new HashMap();
        map.put("live_enter_source", "live_no_action_guide");
        map.put("liveRecommendCategory", "no_action_guide");
        map.put(FirebaseAnalytics.Param.INDEX, "NA");
        map.put("module", "no_action_guide_popup");
        adu.m96010f(pageId(), map);
    }

    /* JADX INFO: renamed from: l2 */
    public final ArrayList<mau> m68990l2() {
        return (ArrayList) this.mData.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: m2 */
    public final VImage m68991m2() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n2 */
    public final VText m68992n2() {
        VText vText = this._follow;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_follow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o2 */
    public final VRecyclerView m68993o2() {
        VRecyclerView vRecyclerView = this._recycle;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m87502r("_recycle");
        return null;
    }

    /* JADX INFO: renamed from: p2 */
    public final void m68994p2(@NotNull BLiveAnchors data) {
        data.getClass();
        HashMap map = new HashMap();
        map.put("live_enter_source", "live_no_action_guide");
        map.put("liveRecommendCategory", "no_action_guide");
        map.put(FirebaseAnalytics.Param.INDEX, "NA");
        map.put("module", "no_action_guide_popup");
        map.put("liveId", data.onGoingLiveId);
        map.put("anchorId", data.userId);
        adu.m96009e(pageId(), map);
        m44477e2();
        startActivity(s9s.f163232f.m134373f(act(), AudienceStartData.getBuilder().m67594E(data.onGoingLiveId).m67604O("square-follow-page").m67611u()));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    @NotNull
    public String pageId() {
        return "p_live_no_action_guide";
    }

    /* JADX INFO: renamed from: r2 */
    public final void m68995r2() {
        Serializable serializableExtra = getIntent().getSerializableExtra("DATA_KEY");
        if (serializableExtra == null || !(serializableExtra instanceof ArrayList)) {
            return;
        }
        Collection collection = (Collection) serializableExtra;
        if (vwb.m200296J(collection) || !(((ArrayList) serializableExtra).get(0) instanceof BLiveAnchors)) {
            return;
        }
        m68990l2().clear();
        this.mAdapter.m67371Z(vwb.m200303Q(collection, new w9j() { // from class: l.y9u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveSuggestPopAct.m68978a2(this.f196990a, (BLiveAnchors) obj);
            }
        }));
        if (this.mAdapter.m67355J().isEmpty()) {
            m68992n2().setEnabled(false);
            m68992n2().setBackgroundResource(h3c0.f105675i);
        } else {
            m68992n2().setEnabled(true);
            m68992n2().setBackgroundResource(h3c0.f105684l);
        }
    }
}
