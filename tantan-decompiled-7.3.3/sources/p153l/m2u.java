package p153l;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p051p1.mobile.putong.live.external.internal.live.square.LiveSquareCommonFeedFrag;
import com.p051p1.mobile.putong.live.external.internal.live.square.api.LiveSquareTabBean;
import com.p051p1.mobile.putong.live.external.internal.live.square.fragments.dynamic.LiveSquareDynamicFragment;
import com.p051p1.mobile.putong.live.external.internal.live.square.fragments.livevideo.LiveSquareLiveVideoFrag;
import com.p051p1.mobile.putong.live.external.internal.live.square.fragments.teenmodeTab.LiveSquareTeenModeFrag;
import com.p051p1.mobile.putong.live.external.internal.live.square.fragments.videochat.LiveVideoChatFrag;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/m2u;", "", "<init>", "()V", "Lcom/p1/mobile/putong/live/external/internal/live/square/api/LiveSquareTabBean;", "liveSquareTab", "Lcom/tantan/live/home/eventbus/LiveHomeEventBus;", "eventBus", "Lcom/p1/mobile/putong/live/external/square/fragments/LiveVPagerBaseFrag;", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/live/external/internal/live/square/api/LiveSquareTabBean;Lcom/tantan/live/home/eventbus/LiveHomeEventBus;)Lcom/p1/mobile/putong/live/external/square/fragments/LiveVPagerBaseFrag;", "c", "tab", "Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;", "b", "(Lcom/p1/mobile/putong/live/external/internal/live/square/api/LiveSquareTabBean;)Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class m2u {

    @NotNull
    public static final m2u INSTANCE = new m2u();

    /* JADX INFO: renamed from: a */
    public static LiveHomeEventBus m156904a(LiveHomeEventBus liveHomeEventBus) {
        return liveHomeEventBus;
    }

    /* JADX INFO: renamed from: b */
    public final BLiveSquareTab m156905b(LiveSquareTabBean tab) {
        BLiveSquareTab bLiveSquareTabNew_ = BLiveSquareTab.new_();
        bLiveSquareTabNew_.title = tab.getName();
        bLiveSquareTabNew_.f45289id = tab.getTabId();
        bLiveSquareTabNew_.pageId = tab.getPageId();
        bLiveSquareTabNew_.name = tab.requestName;
        return bLiveSquareTabNew_;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX INFO: renamed from: c */
    public final LiveVPagerBaseFrag m156906c(LiveSquareTabBean liveSquareTab, final LiveHomeEventBus eventBus) {
        LiveSquareBaseFrag liveSquareCommonFeedFrag;
        String str = liveSquareTab.requestName;
        if (str != null) {
            switch (str) {
                case "square-suggested":
                    liveSquareCommonFeedFrag = new LiveSquareCommonFeedFrag();
                    break;
                case "square-multi-call":
                    liveSquareCommonFeedFrag = new LiveSquareCommonFeedFrag();
                    break;
                case "square-nearby":
                    liveSquareCommonFeedFrag = new LiveSquareCommonFeedFrag();
                    break;
                case "videoChat":
                    liveSquareCommonFeedFrag = LiveVideoChatFrag.m70320m5("source_live_square");
                    liveSquareCommonFeedFrag.getClass();
                    break;
                case "square-live-circle":
                    liveSquareCommonFeedFrag = new LiveSquareDynamicFragment();
                    break;
                case "square-curated":
                    liveSquareCommonFeedFrag = new LiveSquareLiveVideoFrag();
                    break;
                case "square-teen-mode":
                    liveSquareCommonFeedFrag = new LiveSquareTeenModeFrag();
                    break;
                default:
                    liveSquareCommonFeedFrag = new LiveSquareCommonFeedFrag();
                    break;
            }
        } else {
            liveSquareCommonFeedFrag = new LiveSquareCommonFeedFrag();
        }
        Bundle arguments = liveSquareCommonFeedFrag.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        boolean z = liveSquareTab.infinitePull;
        liveSquareTab.disableFilterRepeat = z;
        liveSquareTab.disableReplaceStopped = z;
        arguments.putSerializable("TAB_INFO_BEAN", liveSquareTab);
        arguments.putSerializable(LiveSquareBaseFrag.ARGS_TAB_INFO, m156905b(liveSquareTab));
        liveSquareCommonFeedFrag.setArguments(arguments);
        liveSquareCommonFeedFrag.m72000i5(new pcj() { // from class: l.l2u
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return m2u.m156904a(eventBus);
            }
        });
        return liveSquareCommonFeedFrag;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final LiveVPagerBaseFrag m156907d(@NotNull LiveSquareTabBean liveSquareTab, @NotNull LiveHomeEventBus eventBus) {
        liveSquareTab.getClass();
        eventBus.getClass();
        return m156906c(liveSquareTab, eventBus);
    }
}
