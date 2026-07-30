package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaign;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m88121d2 = {"Ll/af4;", "", "Landroid/view/View;", OMSTemplateModeType.view, "<init>", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveCampaign;", "campaign", "", "liveRoomType", "", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/live/base/data/BLiveCampaign;Ljava/lang/String;)V", "", "f", "(Lcom/p1/mobile/putong/live/base/data/BLiveCampaign;Ljava/lang/String;)Z", "isLive", "e", "(Lcom/p1/mobile/putong/live/base/data/BLiveCampaign;Z)Z", "c", "(Lcom/p1/mobile/putong/live/base/data/BLiveCampaign;)Z", "g", "(Ljava/lang/String;)V", "", "widthInDp", "heightInDp", "h", "(II)V", "b", "(Z)I", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class af4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final View view;

    public af4(@NotNull View view) {
        view.getClass();
        this.view = view;
    }

    /* JADX INFO: renamed from: a */
    public final int m97278a(boolean isLive) {
        if (wft.m206159b(2)) {
            return isLive ? 144 : 96;
        }
        return isLive ? 126 : 107;
    }

    /* JADX INFO: renamed from: b */
    public final int m97279b(boolean isLive) {
        if (wft.m206159b(2)) {
            return isLive ? 110 : 73;
        }
        return isLive ? 95 : 81;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m97280c(BLiveCampaign campaign) {
        return !jyb.m147479J(campaign.entranceSize) && campaign.entranceSize.size() >= 2;
    }

    /* JADX INFO: renamed from: d */
    public final void m97281d(@NotNull BLiveCampaign campaign, @NotNull String liveRoomType) {
        campaign.getClass();
        liveRoomType.getClass();
        if (!m97280c(campaign)) {
            m97284g(liveRoomType);
            return;
        }
        List<Integer> list = campaign.entranceSize;
        list.getClass();
        if (!m97283f(campaign, liveRoomType)) {
            m97284g(liveRoomType);
            return;
        }
        Integer num = list.get(0);
        num.getClass();
        int iIntValue = num.intValue();
        Integer num2 = list.get(1);
        num2.getClass();
        m97285h(iIntValue, num2.intValue());
    }

    /* JADX INFO: renamed from: e */
    public final boolean m97282e(BLiveCampaign campaign, boolean isLive) {
        return !jyb.m147479J(campaign.entranceSize) && campaign.entranceSize.size() >= 2 && campaign.entranceSize.get(0).intValue() <= m97279b(isLive) && campaign.entranceSize.get(1).intValue() <= m97278a(isLive);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m97283f(BLiveCampaign campaign, String liveRoomType) {
        return m97282e(campaign, Intrinsics.m88377d(liveRoomType, "live"));
    }

    /* JADX INFO: renamed from: g */
    public final void m97284g(String liveRoomType) {
        boolean zM88377d = Intrinsics.m88377d(liveRoomType, "live");
        m97285h(m97279b(zM88377d), m97278a(zM88377d));
    }

    /* JADX INFO: renamed from: h */
    public final void m97285h(int widthInDp, int heightInDp) {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        layoutParams.getClass();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            layoutParams.width = qa00.m175859d(widthInDp);
            layoutParams.height = qa00.m175859d(heightInDp);
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
            this.view.setLayoutParams(layoutParams);
        }
    }
}
