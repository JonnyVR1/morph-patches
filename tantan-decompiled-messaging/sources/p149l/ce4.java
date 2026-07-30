package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveCampaign;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m87232d2 = {"Ll/ce4;", "", "Landroid/view/View;", OMSTemplateModeType.view, "<init>", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveCampaign;", "campaign", "", "b", "(Lcom/p1/mobile/putong/live/base/data/BLiveCampaign;)V", "", "c", "(Lcom/p1/mobile/putong/live/base/data/BLiveCampaign;)Z", "a", Constants.INAPP_DATA_TAG, "()V", "", "widthInDp", "heightInDp", "e", "(II)V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ce4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final View view;

    public ce4(@NotNull View view) {
        view.getClass();
        this.view = view;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m106310a(BLiveCampaign campaign) {
        return !vwb.m200296J(campaign.entranceSize) && campaign.entranceSize.size() >= 2;
    }

    /* JADX INFO: renamed from: b */
    public final void m106311b(@NotNull BLiveCampaign campaign) {
        campaign.getClass();
        if (!m106310a(campaign)) {
            m106313d();
            return;
        }
        List<Integer> list = campaign.entranceSize;
        list.getClass();
        if (!m106312c(campaign)) {
            m106313d();
            return;
        }
        Integer num = list.get(0);
        num.getClass();
        int iIntValue = num.intValue();
        Integer num2 = list.get(1);
        num2.getClass();
        m106314e(iIntValue, num2.intValue());
    }

    /* JADX INFO: renamed from: c */
    public final boolean m106312c(BLiveCampaign campaign) {
        return !vwb.m200296J(campaign.entranceSize) && campaign.entranceSize.size() >= 2 && campaign.entranceSize.get(0).intValue() <= 110 && campaign.entranceSize.get(1).intValue() <= 34;
    }

    /* JADX INFO: renamed from: d */
    public final void m106313d() {
        m106314e(110, 34);
    }

    /* JADX INFO: renamed from: e */
    public final void m106314e(int widthInDp, int heightInDp) {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        layoutParams.getClass();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            layoutParams.width = t100.m186890d(widthInDp);
            layoutParams.height = t100.m186890d(heightInDp);
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
            this.view.setLayoutParams(layoutParams);
        }
    }
}
