package p149l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchors;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.random.Random;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00060\u0017R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0016R2\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b\u0015\u0010&\"\u0004\b'\u0010(R'\u0010,\u001a\u0012\u0012\u0004\u0012\u00020*0\bj\b\u0012\u0004\u0012\u00020*`\n8\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b\u001b\u0010&¨\u0006-"}, m87232d2 = {"Ll/rsg0;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/i9t;", OMSTemplateType.dialog, "Landroid/view/View;", "parentView", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;", "Lkotlin/collections/ArrayList;", "data", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/i9t;Landroid/view/View;Ljava/util/ArrayList;)V", "a", "Lcom/p1/mobile/android/app/Act;", "b", "()Lcom/p1/mobile/android/app/Act;", "Ll/i9t;", Constants.INAPP_DATA_TAG, "()Ll/i9t;", "c", "Landroid/view/View;", "Ll/rsg0$a;", "Ll/rsg0$a;", "adapter", "Lv/VText;", "e", "Lv/VText;", "bottomText", "Lv/VRecyclerView;", "f", "Lv/VRecyclerView;", "recyclerView", "g", "emptyView", "h", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "setCardList", "(Ljava/util/ArrayList;)V", "cardList", "Ll/a9u;", RXScreenCaptureService.KEY_INDEX, "videoHolderList", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SuppressLint({"SetTextI18n"})
public final class rsg0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final i9t dialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final View parentView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public C19773a adapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public VText bottomText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public VRecyclerView recyclerView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public View emptyView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public ArrayList<BLiveAnchors> cardList;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<a9u> videoHolderList;

    /* JADX INFO: renamed from: l.rsg0$a */
    @Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Ll/rsg0$a;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ll/a9u;", "<init>", "(Ll/rsg0;)V", "Landroid/view/ViewGroup;", "p0", "", "p1", BaseSei.f13932Z, "(Landroid/view/ViewGroup;I)Ll/a9u;", "", BaseSei.f13931Y, "(Ll/a9u;I)V", "getItemCount", "()I", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public final class C19773a extends RecyclerView.Adapter<a9u> {
        public C19773a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return C15167a.m87599e(rsg0.this.m180663c().size(), 6);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull a9u p0, int p1) {
            p0.getClass();
            boolean z = p1 % 3 == 1;
            rsg0.this.m180665e().add(p0);
            p0.m95458e(z, p1);
            Act act = rsg0.this.getAct();
            i9t dialog = rsg0.this.getDialog();
            BLiveAnchors bLiveAnchors = rsg0.this.m180663c().get(p1);
            bLiveAnchors.getClass();
            p0.m95456c(act, dialog, bLiveAnchors);
            p0.m95457d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public a9u onCreateViewHolder(@NotNull ViewGroup p0, int p1) {
            p0.getClass();
            View viewInflate = LayoutInflater.from(p0.getContext()).inflate(s6c0.f162733b1, p0, false);
            viewInflate.getClass();
            return new a9u(viewInflate);
        }
    }

    public rsg0(@NotNull Act act, @NotNull i9t i9tVar, @NotNull View view, @NotNull ArrayList<BLiveAnchors> arrayList) {
        act.getClass();
        i9tVar.getClass();
        view.getClass();
        arrayList.getClass();
        this.act = act;
        this.dialog = i9tVar;
        this.parentView = view;
        ArrayList<a9u> arrayList2 = new ArrayList<>();
        this.videoHolderList = arrayList2;
        this.cardList = arrayList;
        arrayList2.clear();
        View viewFindViewById = view.findViewById(f5c0.f95110k1);
        viewFindViewById.getClass();
        this.recyclerView = (VRecyclerView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(f5c0.f95064Y1);
        viewFindViewById2.getClass();
        this.bottomText = (VText) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(f5c0.f95006H0);
        viewFindViewById3.getClass();
        View viewFindViewById4 = view.findViewById(f5c0.f95081d0);
        viewFindViewById4.getClass();
        this.emptyView = viewFindViewById4;
        bt0.m103743p(view, "alpha", 0L, 300L, new LinearInterpolator(), 0.0f, 1.0f).start();
        this.bottomText.setOnClickListener(new View.OnClickListener() { // from class: l.qsg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                rsg0.m180661a(this.f156192a, view2);
            }
        });
        C19773a c19773a = new C19773a();
        this.adapter = c19773a;
        this.recyclerView.setAdapter(c19773a);
        this.recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 3));
        bt0.m103753z(bt0.m103743p(viewFindViewById3, "translationY", 0L, 600L, new LinearInterpolator(), viewFindViewById3.getHeight(), 0.0f), bt0.m103743p(viewFindViewById3, "alpha", 0L, 500L, new LinearInterpolator(), 0.0f, 1.0f), bt0.m103743p(viewFindViewById3, "scaleY", 0L, 300L, new LinearInterpolator(), 0.0f, 1.0f)).start();
    }

    /* JADX INFO: renamed from: a */
    public static void m180661a(rsg0 rsg0Var, View view) {
        BLiveAnchors bLiveAnchors = (BLiveAnchors) CollectionsKt.random(rsg0Var.cardList, Random.INSTANCE);
        HashMap map = new HashMap();
        map.put("liveId", bLiveAnchors.onGoingLiveId);
        map.put("anchorId", bLiveAnchors.userId);
        map.put(FirebaseAnalytics.Param.INDEX, "NA");
        map.put("module", "no_action_guide_popup");
        map.put("liveRecommendCategory", "NA");
        adu.m96009e("p_live_no_action_guide_popup", map);
        Act act = rsg0Var.act;
        act.startActivity(s9s.f163232f.m134373f(act, AudienceStartData.getBuilder().m67594E(bLiveAnchors.onGoingLiveId).m67604O("square-card").m67611u()));
        rsg0Var.dialog.dismiss();
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final ArrayList<BLiveAnchors> m180663c() {
        return this.cardList;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final i9t getDialog() {
        return this.dialog;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final ArrayList<a9u> m180665e() {
        return this.videoHolderList;
    }
}
