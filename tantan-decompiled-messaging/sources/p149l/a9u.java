package p149l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.C0222a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchors;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.page.swipecard.SpecialAvatarLayout;
import com.tencent.open.SocialConstants;
import java.util.HashMap;
import java.util.Random;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010'¨\u0006)"}, m87232d2 = {"Ll/a9u;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/i9t;", OMSTemplateType.dialog, "Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;", "anchors", "", "c", "(Lcom/p1/mobile/android/app/Act;Ll/i9t;Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;)V", "", "canBottom", "", "position", "e", "(ZI)V", Constants.INAPP_DATA_TAG, "()V", "", "", "a", "[Ljava/lang/String;", "arrType", "Lcom/p1/mobile/putong/live/external/page/swipecard/SpecialAvatarLayout;", "b", "Lcom/p1/mobile/putong/live/external/page/swipecard/SpecialAvatarLayout;", "specialAvatarLayout", "Lv/VDraweeView;", "Lv/VDraweeView;", "avatarView", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "svgaView", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "svgaContainer", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class a9u extends RecyclerView.AbstractC0566d0 {

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
    public a9u(@NotNull View view) {
        super(view);
        view.getClass();
        this.arrType = new String[]{"B", b2s.C_ZONE, "B", "B", b2s.C_ZONE, "B"};
        View viewFindViewById = view.findViewById(f5c0.f95136r);
        viewFindViewById.getClass();
        this.specialAvatarLayout = (SpecialAvatarLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(f5c0.f95140s);
        viewFindViewById2.getClass();
        this.avatarView = (VDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(f5c0.f94987C1);
        viewFindViewById3.getClass();
        this.svgaView = (AnimEffectPlayer) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(f5c0.f94991D1);
        viewFindViewById4.getClass();
        this.svgaContainer = (FrameLayout) viewFindViewById4;
    }

    /* JADX INFO: renamed from: a */
    public static void m95454a(HashMap map, Act act, BLiveAnchors bLiveAnchors, i9t i9tVar, View view) {
        adu.m96009e("p_live_no_action_guide_popup", map);
        act.startActivity(s9s.f163232f.m134373f(act, AudienceStartData.getBuilder().m67594E(bLiveAnchors.onGoingLiveId).m67604O("square-card").m67611u()));
        i9tVar.dismiss();
    }

    /* JADX INFO: renamed from: b */
    public static void m95455b(a9u a9uVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(a9uVar.specialAvatarLayout, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(a9uVar.svgaContainer, "alpha", 0.0f, 1.0f);
        SpecialAvatarLayout specialAvatarLayout = a9uVar.specialAvatarLayout;
        specialAvatarLayout.setPivotX(specialAvatarLayout.getWidth() / 2);
        SpecialAvatarLayout specialAvatarLayout2 = a9uVar.specialAvatarLayout;
        specialAvatarLayout2.setPivotY(specialAvatarLayout2.getHeight() / 2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(a9uVar.specialAvatarLayout, "scaleX", 0.4f, 1.1f, 0.9f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(a9uVar.specialAvatarLayout, "scaleY", 0.4f, 1.1f, 0.9f, 1.0f);
        objectAnimatorOfFloat3.setDuration(600L);
        objectAnimatorOfFloat4.setDuration(600L);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat.setDuration(300L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: c */
    public final void m95456c(@NotNull final Act act, @NotNull final i9t dialog, @NotNull final BLiveAnchors anchors) {
        act.getClass();
        dialog.getClass();
        anchors.getClass();
        final HashMap map = new HashMap();
        map.put("liveId", anchors.onGoingLiveId);
        map.put("anchorId", anchors.userId);
        map.put(FirebaseAnalytics.Param.INDEX, "NA");
        map.put("module", "no_action_guide_popup");
        map.put("liveRecommendCategory", "NA");
        adu.m96010f("p_live_no_action_guide_popup", map);
        this.svgaView.mo68502l("https://auto.tancdn.com/v1/raw/26a533dc-060e-4d88-a659-333ba98f126112.pdf", -1, null);
        hxs.m133407t("context_square", this.avatarView, anchors.avatar.url, t100.f167232G);
        xdl0.m208329E0(this.itemView, new View.OnClickListener() { // from class: l.z8u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a9u.m95454a(map, act, anchors, dialog, view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m95457d() {
        this.specialAvatarLayout.postDelayed(new Runnable() { // from class: l.y8u
            @Override // java.lang.Runnable
            public final void run() {
                a9u.m95455b(this.f196881a);
            }
        }, new Random().nextInt(400));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: e */
    public final void m95458e(boolean canBottom, int position) {
        C0222a c0222a = new C0222a();
        View view = this.itemView;
        view.getClass();
        c0222a.m1148c((ConstraintLayout) view);
        c0222a.m1151f(f5c0.f95136r, 4, 0, 4, canBottom ? t100.f167260i : 0);
        if (position < 12) {
            String str = this.arrType[position];
            switch (str.hashCode()) {
                case 65:
                    if (str.equals("A")) {
                        int i = f5c0.f95136r;
                        int i2 = t100.f167228C;
                        c0222a.m1155j(i, i2);
                        c0222a.m1152g(f5c0.f95136r, i2);
                        this.specialAvatarLayout.setShowType("A");
                    }
                    break;
                case 66:
                    if (str.equals("B")) {
                        int i3 = f5c0.f95136r;
                        int i4 = t100.f167232G;
                        c0222a.m1155j(i3, i4);
                        c0222a.m1152g(f5c0.f95136r, i4);
                        this.specialAvatarLayout.setShowType("B");
                    }
                    break;
                case 67:
                    if (str.equals(b2s.C_ZONE)) {
                        int i5 = f5c0.f95136r;
                        int i6 = t100.f167235J;
                        c0222a.m1155j(i5, i6);
                        c0222a.m1152g(f5c0.f95136r, i6);
                        this.specialAvatarLayout.setShowType(b2s.C_ZONE);
                    }
                    break;
            }
        }
        View view2 = this.itemView;
        view2.getClass();
        c0222a.m1146a((ConstraintLayout) view2);
    }
}
