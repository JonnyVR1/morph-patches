package p153l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.C0223a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchors;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.page.swipecard.SpecialAvatarLayout;
import com.tencent.open.SocialConstants;
import java.util.HashMap;
import java.util.Random;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010'¨\u0006)"}, m88121d2 = {"Ll/bbu;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/jbt;", OMSTemplateType.dialog, "Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;", "anchors", "", "c", "(Lcom/p1/mobile/android/app/Act;Ll/jbt;Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;)V", "", "canBottom", "", "position", "e", "(ZI)V", Constants.INAPP_DATA_TAG, "()V", "", "", "a", "[Ljava/lang/String;", "arrType", "Lcom/p1/mobile/putong/live/external/page/swipecard/SpecialAvatarLayout;", "b", "Lcom/p1/mobile/putong/live/external/page/swipecard/SpecialAvatarLayout;", "specialAvatarLayout", "Lv/VDraweeView;", "Lv/VDraweeView;", "avatarView", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "svgaView", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "svgaContainer", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class bbu extends RecyclerView.AbstractC0569e0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String[] arrType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public SpecialAvatarLayout specialAvatarLayout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public VDraweeView avatarView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public AnimEffectPlayer svgaView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public FrameLayout svgaContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbu(@NotNull View view) {
        super(view);
        view.getClass();
        this.arrType = new String[]{"B", c4s.C_ZONE, "B", "B", c4s.C_ZONE, "B"};
        View viewFindViewById = view.findViewById(ldc0.f131593r);
        viewFindViewById.getClass();
        this.specialAvatarLayout = (SpecialAvatarLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(ldc0.f131597s);
        viewFindViewById2.getClass();
        this.avatarView = (VDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(ldc0.f131444C1);
        viewFindViewById3.getClass();
        this.svgaView = (AnimEffectPlayer) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(ldc0.f131448D1);
        viewFindViewById4.getClass();
        this.svgaContainer = (FrameLayout) viewFindViewById4;
    }

    /* JADX INFO: renamed from: a */
    public static void m103311a(HashMap map, Act act, BLiveAnchors bLiveAnchors, jbt jbtVar, View view) {
        bfu.m104073e("p_live_no_action_guide_popup", map);
        act.startActivity(tbs.f172993f.m143704f(act, AudienceStartData.getBuilder().m68777E(bLiveAnchors.onGoingLiveId).m68787O("square-card").m68794u()));
        jbtVar.dismiss();
    }

    /* JADX INFO: renamed from: b */
    public static void m103312b(bbu bbuVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(bbuVar.specialAvatarLayout, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(bbuVar.svgaContainer, "alpha", 0.0f, 1.0f);
        SpecialAvatarLayout specialAvatarLayout = bbuVar.specialAvatarLayout;
        specialAvatarLayout.setPivotX(specialAvatarLayout.getWidth() / 2);
        SpecialAvatarLayout specialAvatarLayout2 = bbuVar.specialAvatarLayout;
        specialAvatarLayout2.setPivotY(specialAvatarLayout2.getHeight() / 2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(bbuVar.specialAvatarLayout, "scaleX", 0.4f, 1.1f, 0.9f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(bbuVar.specialAvatarLayout, "scaleY", 0.4f, 1.1f, 0.9f, 1.0f);
        objectAnimatorOfFloat3.setDuration(600L);
        objectAnimatorOfFloat4.setDuration(600L);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat.setDuration(300L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: c */
    public final void m103313c(@NotNull final Act act, @NotNull final jbt dialog, @NotNull final BLiveAnchors anchors) {
        act.getClass();
        dialog.getClass();
        anchors.getClass();
        final HashMap map = new HashMap();
        map.put("liveId", anchors.onGoingLiveId);
        map.put("anchorId", anchors.userId);
        map.put(FirebaseAnalytics.Param.INDEX, "NA");
        map.put("module", "no_action_guide_popup");
        map.put("liveRecommendCategory", "NA");
        bfu.m104074f("p_live_no_action_guide_popup", map);
        this.svgaView.mo69685l("https://auto.tancdn.com/v1/raw/26a533dc-060e-4d88-a659-333ba98f126112.pdf", -1, null);
        izs.m142869t("context_square", this.avatarView, anchors.avatar.url, qa00.f156294G);
        bnl0.m105509E0(this.itemView, new View.OnClickListener() { // from class: l.abu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bbu.m103311a(map, act, anchors, dialog, view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m103314d() {
        this.specialAvatarLayout.postDelayed(new Runnable() { // from class: l.zau
            @Override // java.lang.Runnable
            public final void run() {
                bbu.m103312b(this.f203593a);
            }
        }, new Random().nextInt(400));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: e */
    public final void m103315e(boolean canBottom, int position) {
        C0223a c0223a = new C0223a();
        View view = this.itemView;
        view.getClass();
        c0223a.m1149c((ConstraintLayout) view);
        c0223a.m1152f(ldc0.f131593r, 4, 0, 4, canBottom ? qa00.f156322i : 0);
        if (position < 12) {
            String str = this.arrType[position];
            switch (str.hashCode()) {
                case 65:
                    if (str.equals("A")) {
                        int i = ldc0.f131593r;
                        int i2 = qa00.f156290C;
                        c0223a.m1156j(i, i2);
                        c0223a.m1153g(ldc0.f131593r, i2);
                        this.specialAvatarLayout.setShowType("A");
                    }
                    break;
                case 66:
                    if (str.equals("B")) {
                        int i3 = ldc0.f131593r;
                        int i4 = qa00.f156294G;
                        c0223a.m1156j(i3, i4);
                        c0223a.m1153g(ldc0.f131593r, i4);
                        this.specialAvatarLayout.setShowType("B");
                    }
                    break;
                case 67:
                    if (str.equals(c4s.C_ZONE)) {
                        int i5 = ldc0.f131593r;
                        int i6 = qa00.f156297J;
                        c0223a.m1156j(i5, i6);
                        c0223a.m1153g(ldc0.f131593r, i6);
                        this.specialAvatarLayout.setShowType(c4s.C_ZONE);
                    }
                    break;
            }
        }
        View view2 = this.itemView;
        view2.getClass();
        c0223a.m1147a((ConstraintLayout) view2);
    }
}
