package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchors;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.random.Random;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00060\u0017R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0016R2\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b\u0015\u0010&\"\u0004\b'\u0010(R'\u0010,\u001a\u0012\u0012\u0004\u0012\u00020*0\bj\b\u0012\u0004\u0012\u00020*`\n8\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b\u001b\u0010&¨\u0006-"}, m88121d2 = {"Ll/z0h0;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/jbt;", OMSTemplateType.dialog, "Landroid/view/View;", "parentView", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;", "Lkotlin/collections/ArrayList;", "data", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/jbt;Landroid/view/View;Ljava/util/ArrayList;)V", "a", "Lcom/p1/mobile/android/app/Act;", "b", "()Lcom/p1/mobile/android/app/Act;", "Ll/jbt;", Constants.INAPP_DATA_TAG, "()Ll/jbt;", "c", "Landroid/view/View;", "Ll/z0h0$a;", "Ll/z0h0$a;", "adapter", "Lv/VText;", "e", "Lv/VText;", "bottomText", "Lv/VRecyclerView;", "f", "Lv/VRecyclerView;", "recyclerView", "g", "emptyView", "h", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "setCardList", "(Ljava/util/ArrayList;)V", "cardList", "Ll/bbu;", RXScreenCaptureService.KEY_INDEX, "videoHolderList", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SuppressLint({"SetTextI18n"})
public final class z0h0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final jbt dialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final View parentView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public C21730a adapter;

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
    public final ArrayList<bbu> videoHolderList;

    /* JADX INFO: renamed from: l.z0h0$a */
    @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/z0h0$a;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ll/bbu;", "<init>", "(Ll/z0h0;)V", "Landroid/view/ViewGroup;", "p0", "", "p1", BaseSei.f14626Z, "(Landroid/view/ViewGroup;I)Ll/bbu;", "", BaseSei.f14625Y, "(Ll/bbu;I)V", "getItemCount", "()I", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public final class C21730a extends RecyclerView.Adapter<bbu> {
        public C21730a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return C15274a.m88489e(z0h0.this.m218127c().size(), 6);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull bbu p0, int p1) {
            p0.getClass();
            boolean z = p1 % 3 == 1;
            z0h0.this.m218129e().add(p0);
            p0.m103315e(z, p1);
            Act act = z0h0.this.getAct();
            jbt dialog = z0h0.this.getDialog();
            BLiveAnchors bLiveAnchors = z0h0.this.m218127c().get(p1);
            bLiveAnchors.getClass();
            p0.m103313c(act, dialog, bLiveAnchors);
            p0.m103314d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public bbu onCreateViewHolder(@NotNull ViewGroup p0, int p1) {
            p0.getClass();
            View viewInflate = LayoutInflater.from(p0.getContext()).inflate(xec0.f193847b1, p0, false);
            viewInflate.getClass();
            return new bbu(viewInflate);
        }
    }

    public z0h0(@NotNull Act act, @NotNull jbt jbtVar, @NotNull View view, @NotNull ArrayList<BLiveAnchors> arrayList) {
        act.getClass();
        jbtVar.getClass();
        view.getClass();
        arrayList.getClass();
        this.act = act;
        this.dialog = jbtVar;
        this.parentView = view;
        ArrayList<bbu> arrayList2 = new ArrayList<>();
        this.videoHolderList = arrayList2;
        this.cardList = arrayList;
        arrayList2.clear();
        View viewFindViewById = view.findViewById(ldc0.f131567k1);
        viewFindViewById.getClass();
        this.recyclerView = (VRecyclerView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(ldc0.f131521Y1);
        viewFindViewById2.getClass();
        this.bottomText = (VText) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(ldc0.f131463H0);
        viewFindViewById3.getClass();
        View viewFindViewById4 = view.findViewById(ldc0.f131538d0);
        viewFindViewById4.getClass();
        this.emptyView = viewFindViewById4;
        gt0.m132170p(view, "alpha", 0L, 300L, new LinearInterpolator(), 0.0f, 1.0f).start();
        this.bottomText.setOnClickListener(new View.OnClickListener() { // from class: l.y0h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                z0h0.m218125a(this.f196976a, view2);
            }
        });
        C21730a c21730a = new C21730a();
        this.adapter = c21730a;
        this.recyclerView.setAdapter(c21730a);
        this.recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 3));
        gt0.m132180z(gt0.m132170p(viewFindViewById3, "translationY", 0L, 600L, new LinearInterpolator(), viewFindViewById3.getHeight(), 0.0f), gt0.m132170p(viewFindViewById3, "alpha", 0L, 500L, new LinearInterpolator(), 0.0f, 1.0f), gt0.m132170p(viewFindViewById3, "scaleY", 0L, 300L, new LinearInterpolator(), 0.0f, 1.0f)).start();
    }

    /* JADX INFO: renamed from: a */
    public static void m218125a(z0h0 z0h0Var, View view) {
        BLiveAnchors bLiveAnchors = (BLiveAnchors) CollectionsKt.random(z0h0Var.cardList, Random.INSTANCE);
        HashMap map = new HashMap();
        map.put("liveId", bLiveAnchors.onGoingLiveId);
        map.put("anchorId", bLiveAnchors.userId);
        map.put(FirebaseAnalytics.Param.INDEX, "NA");
        map.put("module", "no_action_guide_popup");
        map.put("liveRecommendCategory", "NA");
        bfu.m104073e("p_live_no_action_guide_popup", map);
        Act act = z0h0Var.act;
        act.startActivity(tbs.f172993f.m143704f(act, AudienceStartData.getBuilder().m68777E(bLiveAnchors.onGoingLiveId).m68787O("square-card").m68794u()));
        z0h0Var.dialog.dismiss();
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final ArrayList<BLiveAnchors> m218127c() {
        return this.cardList;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final jbt getDialog() {
        return this.dialog;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final ArrayList<bbu> m218129e() {
        return this.videoHolderList;
    }
}
