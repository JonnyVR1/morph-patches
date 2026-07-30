package p153l;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p051p1.mobile.putong.live.external.internal.live.square.api.LiveSquareTabBean;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.common.IntlLiveSquareCommonFeedFrag;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.followTab.IntlLiveSquareFollowFrag;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.game.IntlGameTabFrag;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.mainSubTab.IntlLiveSquareMainSubFrag;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.nearbyTab.IntlLiveSquareNearbyFrag;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.suggestedTab.IntlLiveSquareSuggestedFrag;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag;
import com.p051p1.mobile.putong.live.external.voice.home.LiveSquareVoiceFragment;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ'\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u000f"}, m88121d2 = {"Ll/m5o;", "", "<init>", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;", "liveSquareTab", "", "isDefaultTab", "Lcom/tantan/live/home/eventbus/LiveHomeEventBus;", "eventBus", "Lcom/p1/mobile/putong/live/external/square/fragments/LiveVPagerBaseFrag;", "e", "(Lcom/p1/mobile/putong/live/base/data/BLiveSquareTab;ZLcom/tantan/live/home/eventbus/LiveHomeEventBus;)Lcom/p1/mobile/putong/live/external/square/fragments/LiveVPagerBaseFrag;", "c", Constants.INAPP_DATA_TAG, "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class m5o {

    @NotNull
    public static final m5o INSTANCE = new m5o();

    /* JADX INFO: renamed from: a */
    public static LiveHomeEventBus m157108a(LiveHomeEventBus liveHomeEventBus) {
        return liveHomeEventBus;
    }

    /* JADX INFO: renamed from: b */
    public static LiveHomeEventBus m157109b(LiveHomeEventBus liveHomeEventBus) {
        return liveHomeEventBus;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public final LiveVPagerBaseFrag m157110c(BLiveSquareTab liveSquareTab, boolean isDefaultTab, final LiveHomeEventBus eventBus) {
        LiveSquareBaseFrag intlLiveSquareCommonFeedFrag;
        String str = liveSquareTab.name;
        switch (str.hashCode()) {
            case -1561272153:
                if (str.equals(BLiveAbsData.VOICE_LIVE)) {
                    intlLiveSquareCommonFeedFrag = new LiveSquareVoiceFragment();
                }
                break;
            case -948705677:
                intlLiveSquareCommonFeedFrag = (!str.equals("square-suggested") || jyb.m147479J(liveSquareTab.subTabs)) ? new IntlLiveSquareCommonFeedFrag() : new IntlLiveSquareMainSubFrag();
                break;
            case -573584737:
                if (str.equals("square-intlGame")) {
                    intlLiveSquareCommonFeedFrag = new IntlGameTabFrag();
                }
                break;
            case 624728068:
                if (str.equals("square-intlFollowing")) {
                    intlLiveSquareCommonFeedFrag = new IntlLiveSquareFollowFrag();
                }
                break;
            case 920269103:
                if (str.equals("square-nearby")) {
                    intlLiveSquareCommonFeedFrag = new IntlLiveSquareCommonFeedFrag();
                }
                break;
            default:
                intlLiveSquareCommonFeedFrag = new IntlLiveSquareCommonFeedFrag();
                break;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable(LiveSquareBaseFrag.ARGS_TAB_INFO, liveSquareTab);
        bundle.putBoolean(LiveSquareBaseFrag.ARGS_IS_DEFAULT, isDefaultTab);
        LiveSquareTabBean liveSquareTabBean = new LiveSquareTabBean();
        liveSquareTabBean.setTabId(liveSquareTab.f45289id);
        liveSquareTabBean.setPageId(liveSquareTab.pageId);
        liveSquareTabBean.requestName = liveSquareTab.name;
        liveSquareTabBean.setName(liveSquareTab.title);
        Unit unit = Unit.INSTANCE;
        bundle.putSerializable("TAB_INFO_BEAN", liveSquareTabBean);
        intlLiveSquareCommonFeedFrag.setArguments(bundle);
        intlLiveSquareCommonFeedFrag.m72000i5(new pcj() { // from class: l.l5o
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return m5o.m157109b(eventBus);
            }
        });
        return intlLiveSquareCommonFeedFrag;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    public final LiveVPagerBaseFrag m157111d(BLiveSquareTab liveSquareTab, boolean isDefaultTab, final LiveHomeEventBus eventBus) {
        LiveSquareBaseFrag intlLiveSquareSuggestedFrag;
        String str = liveSquareTab.name;
        switch (str.hashCode()) {
            case -1561272153:
                if (str.equals(BLiveAbsData.VOICE_LIVE)) {
                    intlLiveSquareSuggestedFrag = new LiveSquareVoiceFragment();
                }
                break;
            case -948705677:
                intlLiveSquareSuggestedFrag = (!str.equals("square-suggested") || jyb.m147479J(liveSquareTab.subTabs)) ? new IntlLiveSquareSuggestedFrag() : new IntlLiveSquareMainSubFrag();
                break;
            case -573584737:
                if (str.equals("square-intlGame")) {
                    intlLiveSquareSuggestedFrag = new IntlGameTabFrag();
                }
                break;
            case 624728068:
                if (str.equals("square-intlFollowing")) {
                    intlLiveSquareSuggestedFrag = new IntlLiveSquareFollowFrag();
                }
                break;
            case 920269103:
                if (str.equals("square-nearby")) {
                    intlLiveSquareSuggestedFrag = new IntlLiveSquareNearbyFrag();
                }
                break;
            default:
                intlLiveSquareSuggestedFrag = new IntlLiveSquareSuggestedFrag();
                break;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable(LiveSquareBaseFrag.ARGS_TAB_INFO, liveSquareTab);
        bundle.putBoolean(LiveSquareBaseFrag.ARGS_IS_DEFAULT, isDefaultTab);
        intlLiveSquareSuggestedFrag.setArguments(bundle);
        intlLiveSquareSuggestedFrag.m72000i5(new pcj() { // from class: l.k5o
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return m5o.m157108a(eventBus);
            }
        });
        return intlLiveSquareSuggestedFrag;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final LiveVPagerBaseFrag m157112e(@NotNull BLiveSquareTab liveSquareTab, boolean isDefaultTab, @NotNull LiveHomeEventBus eventBus) {
        liveSquareTab.getClass();
        eventBus.getClass();
        return vxr.m203876d().m171024t0() ? m157110c(liveSquareTab, isDefaultTab, eventBus) : m157111d(liveSquareTab, isDefaultTab, eventBus);
    }
}
