package com.p051p1.mobile.putong.live.external.internal.live.square.activities;

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
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchors;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.internal.live.square.activities.LiveSuggestPopAct;
import com.p051p1.mobile.putong.live.external.internal.live.square.api.MultiFollowShipPlug;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseAct;
import com.p051p1.mobile.putong.live.external.square.api.ModelData;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bfu;
import p153l.bnl0;
import p153l.d3q;
import p153l.i4g0;
import p153l.jcu;
import p153l.jyb;
import p153l.nbc0;
import p153l.ncu;
import p153l.qcj;
import p153l.qfs;
import p153l.r1j0;
import p153l.tbs;
import p153l.y20;
import p153l.z35;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 N2\u00020\u0001:\u0001OB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u0019\u0010\u000fR\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010=\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010$\u001a\u0004\b;\u0010&\"\u0004\b<\u0010(R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R+\u0010I\u001a\u0012\u0012\u0004\u0012\u00020C0Bj\b\u0012\u0004\u0012\u00020C`D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006P"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/internal/live/square/activities/LiveSuggestPopAct;", "Lcom/p1/mobile/putong/live/external/module/arch/LiveBaseAct;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "k2", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "i2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "initSubscription", "s2", "Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;", "data", "q2", "(Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;)V", "", "pageId", "()Ljava/lang/String;", "inflateView", "Lv/VImage;", "c", "Lv/VImage;", "n2", "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", "Lv/VText;", Constants.INAPP_DATA_TAG, "Lv/VText;", "get_welcome", "()Lv/VText;", "set_welcome", "(Lv/VText;)V", "_welcome", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "get_content", "()Landroid/widget/TextView;", "set_content", "(Landroid/widget/TextView;)V", "_content", "Lv/VRecyclerView;", "f", "Lv/VRecyclerView;", "p2", "()Lv/VRecyclerView;", "set_recycle", "(Lv/VRecyclerView;)V", "_recycle", "g", "o2", "set_follow", "_follow", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "h", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "mAdapter", "Ljava/util/ArrayList;", "Ll/ncu;", "Lkotlin/collections/ArrayList;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", "m2", "()Ljava/util/ArrayList;", "mData", "Lcom/p1/mobile/putong/live/external/internal/live/square/api/MultiFollowShipPlug;", "j", "Lcom/p1/mobile/putong/live/external/internal/live/square/api/MultiFollowShipPlug;", "followApi", "Companion", "a", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    public final Lazy mData = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.acu
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LiveSuggestPopAct.m70160a2();
        }
    });

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final MultiFollowShipPlug followApi = new MultiFollowShipPlug(this);

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.live.square.activities.LiveSuggestPopAct$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/internal/live/square/activities/LiveSuggestPopAct$a;", "", "<init>", "()V", "Landroid/app/Activity;", SocialConstants.PARAM_ACT, "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;", "Lkotlin/collections/ArrayList;", "resultData", "Landroid/content/Intent;", "a", "(Landroid/app/Activity;Ljava/util/ArrayList;)Landroid/content/Intent;", "", "DATA_KEY", "Ljava/lang/String;", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m70179a(@NotNull Activity act, @NotNull ArrayList<BLiveAnchors> resultData) {
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
    @Metadata(m88120d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"com/p1/mobile/putong/live/external/internal/live/square/activities/LiveSuggestPopAct$b", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$a0;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;)V", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C12656b extends RecyclerView.AbstractC0578n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C0561a0 state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            outRect.set(bnl0.m105587w(15.0f), bnl0.m105587w(14.0f), bnl0.m105587w(15.0f), 0);
        }
    }

    /* JADX INFO: renamed from: X1 */
    public static Unit m70157X1(final LiveSuggestPopAct liveSuggestPopAct, ModelData modelData) {
        d3q d3qVar;
        modelData.getClass();
        if (!modelData.isLoading()) {
            liveSuggestPopAct.m70175o2().setEnabled(true);
        }
        if (modelData.isError()) {
            r1j0.m179419f(R$string.f45725O);
        }
        if (modelData.isSuccess() && !jyb.m147479J(liveSuggestPopAct.followApi.getUserIds()) && (d3qVar = (d3q) jyb.m147529r(liveSuggestPopAct.mAdapter.m68538J(), new qcj() { // from class: l.dcu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveSuggestPopAct.m70169r2(this.f87827a, (d3q) obj);
            }
        })) != null && (d3qVar instanceof ncu)) {
            liveSuggestPopAct.m70177q2(((ncu) d3qVar).getData());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y1 */
    public static void m70158Y1(final LiveSuggestPopAct liveSuggestPopAct, View view) throws JSONException {
        liveSuggestPopAct.m70175o2().setEnabled(false);
        liveSuggestPopAct.followApi.getUserIds().clear();
        jyb.m147537z(liveSuggestPopAct.mAdapter.m68538J(), new y20() { // from class: l.icu
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveSuggestPopAct.m70168l2(this.f114444a, (d3q) obj);
            }
        });
        if (jyb.m147479J(liveSuggestPopAct.followApi.getUserIds())) {
            liveSuggestPopAct.m70175o2().setEnabled(true);
        } else {
            liveSuggestPopAct.followApi.getData();
        }
    }

    /* JADX INFO: renamed from: a2 */
    public static ArrayList m70160a2() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: b2 */
    public static ncu m70161b2(final LiveSuggestPopAct liveSuggestPopAct, BLiveAnchors bLiveAnchors) {
        bLiveAnchors.getClass();
        final ncu ncuVar = new ncu(bLiveAnchors);
        ncuVar.m162600N(new Function0() { // from class: l.gcu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveSuggestPopAct.m70170u2(this.f103603a, ncuVar);
            }
        });
        return ncuVar;
    }

    /* JADX INFO: renamed from: d2 */
    public static void m70163d2(LiveSuggestPopAct liveSuggestPopAct, View view) {
        i4g0.m138520r("e_live_no_action_guide_close", liveSuggestPopAct.pageId());
        liveSuggestPopAct.m45660g2();
    }

    /* JADX INFO: renamed from: e2 */
    public static void m70164e2(LiveSuggestPopAct liveSuggestPopAct, Bundle bundle) {
        liveSuggestPopAct.m70167k2(bundle);
    }

    /* JADX INFO: renamed from: k2 */
    private final void m70167k2(Bundle savedInstanceState) {
        bnl0.m105509E0(m70174n2(), new View.OnClickListener() { // from class: l.ecu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveSuggestPopAct.m70163d2(this.f93106a, view);
            }
        });
        bnl0.m105509E0(m70175o2(), new View.OnClickListener() { // from class: l.fcu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                LiveSuggestPopAct.m70158Y1(this.f98283a, view);
            }
        });
        m70176p2().setLayoutManager(new GridLayoutManager(this, 3));
        m70176p2().addItemDecoration(new C12656b());
        m70176p2().setAdapter(this.mAdapter);
    }

    /* JADX INFO: renamed from: l2 */
    public static final void m70168l2(LiveSuggestPopAct liveSuggestPopAct, d3q d3qVar) {
        if (d3qVar instanceof ncu) {
            ncu ncuVar = (ncu) d3qVar;
            if (ncuVar.getIsCheck()) {
                liveSuggestPopAct.followApi.getUserIds().add(ncuVar.getData().userId);
                bfu.m104069a(liveSuggestPopAct.pageId(), qfs.m176401k().m176404b(ncuVar.getData().userId).m176405c("live_no_action_guide").m176408f(ncuVar.getData().userId).m176403a());
            }
        }
    }

    /* JADX INFO: renamed from: r2 */
    public static final Boolean m70169r2(LiveSuggestPopAct liveSuggestPopAct, d3q d3qVar) {
        return d3qVar instanceof ncu ? Boolean.valueOf(Intrinsics.m88377d(((ncu) d3qVar).getData().userId, liveSuggestPopAct.followApi.getUserIds().get(0))) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: u2 */
    public static final Unit m70170u2(LiveSuggestPopAct liveSuggestPopAct, ncu ncuVar) {
        if (((d3q) jyb.m147529r(liveSuggestPopAct.mAdapter.m68538J(), new qcj() { // from class: l.hcu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveSuggestPopAct.m70171v2((d3q) obj);
            }
        })) != null) {
            liveSuggestPopAct.m70175o2().setEnabled(true);
            liveSuggestPopAct.m70175o2().setBackgroundResource(nbc0.f141175l);
        } else {
            liveSuggestPopAct.m70175o2().setEnabled(false);
            liveSuggestPopAct.m70175o2().setBackgroundResource(nbc0.f141166i);
        }
        liveSuggestPopAct.mAdapter.m68544P(ncuVar, new z35(ncuVar.getIsCheck()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v2 */
    public static final Boolean m70171v2(d3q d3qVar) {
        return d3qVar instanceof ncu ? Boolean.valueOf(((ncu) d3qVar).getIsCheck()) : Boolean.FALSE;
    }

    @NotNull
    /* JADX INFO: renamed from: i2 */
    public final View m70172i2(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM144377b = jcu.m144377b(this, inflater, parent);
        viewM144377b.getClass();
        return viewM144377b;
    }

    @Override // com.p051p1.mobile.android.app.Act
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM70172i2 = m70172i2(inflater, parent);
        m70178s2();
        return viewM70172i2;
    }

    @Override // com.p051p1.mobile.putong.live.external.module.arch.LiveBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.bcu
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveSuggestPopAct.m70164e2(this.f76199a, (Bundle) obj);
            }
        });
        this.followApi.observe(new Function1() { // from class: l.ccu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveSuggestPopAct.m70157X1(this.f81036a, (ModelData) obj);
            }
        });
        HashMap map = new HashMap();
        map.put("live_enter_source", "live_no_action_guide");
        map.put("liveRecommendCategory", "no_action_guide");
        map.put(FirebaseAnalytics.Param.INDEX, "NA");
        map.put("module", "no_action_guide_popup");
        bfu.m104074f(pageId(), map);
    }

    /* JADX INFO: renamed from: m2 */
    public final ArrayList<ncu> m70173m2() {
        return (ArrayList) this.mData.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: n2 */
    public final VImage m70174n2() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o2 */
    public final VText m70175o2() {
        VText vText = this._follow;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_follow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p2 */
    public final VRecyclerView m70176p2() {
        VRecyclerView vRecyclerView = this._recycle;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_recycle");
        return null;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    @NotNull
    public String pageId() {
        return "p_live_no_action_guide";
    }

    /* JADX INFO: renamed from: q2 */
    public final void m70177q2(@NotNull BLiveAnchors data) {
        data.getClass();
        HashMap map = new HashMap();
        map.put("live_enter_source", "live_no_action_guide");
        map.put("liveRecommendCategory", "no_action_guide");
        map.put(FirebaseAnalytics.Param.INDEX, "NA");
        map.put("module", "no_action_guide_popup");
        map.put("liveId", data.onGoingLiveId);
        map.put("anchorId", data.userId);
        bfu.m104073e(pageId(), map);
        m45660g2();
        startActivity(tbs.f172993f.m143704f(act(), AudienceStartData.getBuilder().m68777E(data.onGoingLiveId).m68787O("square-follow-page").m68794u()));
    }

    /* JADX INFO: renamed from: s2 */
    public final void m70178s2() {
        Serializable serializableExtra = getIntent().getSerializableExtra("DATA_KEY");
        if (serializableExtra == null || !(serializableExtra instanceof ArrayList)) {
            return;
        }
        Collection collection = (Collection) serializableExtra;
        if (jyb.m147479J(collection) || !(((ArrayList) serializableExtra).get(0) instanceof BLiveAnchors)) {
            return;
        }
        m70173m2().clear();
        this.mAdapter.m68554Z(jyb.m147486Q(collection, new qcj() { // from class: l.zbu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveSuggestPopAct.m70161b2(this.f203704a, (BLiveAnchors) obj);
            }
        }));
        if (this.mAdapter.m68538J().isEmpty()) {
            m70175o2().setEnabled(false);
            m70175o2().setBackgroundResource(nbc0.f141166i);
        } else {
            m70175o2().setEnabled(true);
            m70175o2().setBackgroundResource(nbc0.f141175l);
        }
    }
}
