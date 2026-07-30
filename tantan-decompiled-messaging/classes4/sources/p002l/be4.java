package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.live.base.data.BLiveCampaign;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.t100;
import l.vdt;
import l.vwb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Ll/be4;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveCampaign;", "campaign", "", "liveRoomType", "", "d", "(Lcom/p1/mobile/putong/live/base/data/BLiveCampaign;Ljava/lang/String;)V", "", "f", "(Lcom/p1/mobile/putong/live/base/data/BLiveCampaign;Ljava/lang/String;)Z", "isLive", "e", "(Lcom/p1/mobile/putong/live/base/data/BLiveCampaign;Z)Z", "c", "(Lcom/p1/mobile/putong/live/base/data/BLiveCampaign;)Z", "g", "(Ljava/lang/String;)V", "", "widthInDp", "heightInDp", "h", "(II)V", "b", "(Z)I", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class be4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final View view;

    public be4(@NotNull View view) {
        view.getClass();
        this.view = view;
    }

    /* JADX INFO: renamed from: a */
    public final int m10313a(boolean isLive) {
        if (vdt.b(2)) {
            return isLive ? 144 : 96;
        }
        return isLive ? 126 : 107;
    }

    /* JADX INFO: renamed from: b */
    public final int m10314b(boolean isLive) {
        if (vdt.b(2)) {
            return isLive ? 110 : 73;
        }
        return isLive ? 95 : 81;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10315c(BLiveCampaign campaign) {
        return !vwb.J(campaign.entranceSize) && campaign.entranceSize.size() >= 2;
    }

    /* JADX INFO: renamed from: d */
    public final void m10316d(@NotNull BLiveCampaign campaign, @NotNull String liveRoomType) {
        campaign.getClass();
        liveRoomType.getClass();
        if (!m10315c(campaign)) {
            m10319g(liveRoomType);
            return;
        }
        List list = campaign.entranceSize;
        list.getClass();
        if (!m10318f(campaign, liveRoomType)) {
            m10319g(liveRoomType);
            return;
        }
        Object obj = list.get(0);
        obj.getClass();
        int iIntValue = ((Number) obj).intValue();
        Object obj2 = list.get(1);
        obj2.getClass();
        m10320h(iIntValue, ((Number) obj2).intValue());
    }

    /* JADX INFO: renamed from: e */
    public final boolean m10317e(BLiveCampaign campaign, boolean isLive) {
        return !vwb.J(campaign.entranceSize) && campaign.entranceSize.size() >= 2 && ((Number) campaign.entranceSize.get(0)).intValue() <= m10314b(isLive) && ((Number) campaign.entranceSize.get(1)).intValue() <= m10313a(isLive);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m10318f(BLiveCampaign campaign, String liveRoomType) {
        return m10317e(campaign, Intrinsics.d(liveRoomType, "live"));
    }

    /* JADX INFO: renamed from: g */
    public final void m10319g(String liveRoomType) {
        boolean zD = Intrinsics.d(liveRoomType, "live");
        m10320h(m10314b(zD), m10313a(zD));
    }

    /* JADX INFO: renamed from: h */
    public final void m10320h(int widthInDp, int heightInDp) {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        layoutParams.getClass();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            layoutParams.width = t100.d(widthInDp);
            layoutParams.height = t100.d(heightInDp);
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
            this.view.setLayoutParams(layoutParams);
        }
    }
}
