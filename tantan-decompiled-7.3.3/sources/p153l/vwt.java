package p153l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.Mobile;
import com.p051p1.mobile.putong.data.UserWealthGradeConfig;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.data.BLiveCallSetting;
import com.p051p1.mobile.putong.live.base.data.BLiveCallVideoCancelSetting;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveDefaultOpenParas;
import com.p051p1.mobile.putong.live.base.data.BLiveEntrance;
import com.p051p1.mobile.putong.live.base.data.BLiveEntranceList;
import com.p051p1.mobile.putong.live.base.data.BLiveFollowRateBubbleV2;
import com.p051p1.mobile.putong.live.base.data.BLiveFollowRateChatV2;
import com.p051p1.mobile.putong.live.base.data.BLiveFollowRateConfigV2;
import com.p051p1.mobile.putong.live.base.data.BLiveFollowRatePopupV2;
import com.p051p1.mobile.putong.live.base.data.BLiveInRoomSideBarEntrance;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlFlyMicEffectConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlLiveTemplatesCdnData;
import com.p051p1.mobile.putong.live.base.data.BLivePreDefineMessages;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveSkinConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveSmallWindow;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareSubTab;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p051p1.mobile.putong.live.base.data.BLiveStartBtnConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveTeenMode;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplate;
import com.p051p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFeedStyle;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceLiveConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSparkReportConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveWealthLogoConfig;
import com.p051p1.mobile.putong.live.base.data.BQuitLiveStayConfig;
import com.p051p1.mobile.putong.live.base.data.BSuggestedTabAnimationItem;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class vwt extends mof0<BLiveSettings> {

    /* JADX INFO: renamed from: h */
    public Context f186168h;

    /* JADX INFO: renamed from: i */
    public String[] f186169i;

    /* JADX INFO: renamed from: j */
    public BLiveSettings f186170j;

    public vwt(Context context, final y20<BLiveSettings> y20Var) {
        super("live_settings", new pkq(new vod("live_settings_json", "_v2", vxr.m203884l()), -1, BLiveSettings.JSON_ADAPTER, new pcj() { // from class: l.kwt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return vwt.m203313j2();
            }
        }), new pcj() { // from class: l.lwt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new si20(new pcj() { // from class: l.rst
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return uqb0.f180376H.auth().m209043q(xi5.m211107i("/live-settings")).m209032f().m209028b();
                    }
                }, BLiveSettings.JSON_ADAPTER).doOnNext(new y20() { // from class: l.sst
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        vwt.m203281b2(y20Var, (BLiveSettings) obj);
                    }
                });
            }
        });
        this.f186169i = null;
        this.f186170j = null;
        this.f186168h = context;
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ Boolean m203212K0(BLiveSettings bLiveSettings) {
        BLiveVoiceLiveConfig bLiveVoiceLiveConfig = bLiveSettings.voiceLiveConfig;
        return bLiveVoiceLiveConfig == null ? Boolean.FALSE : Boolean.valueOf(bLiveVoiceLiveConfig.voiceActivityShowNumber);
    }

    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ void m203281b2(y20 y20Var, BLiveSettings bLiveSettings) {
        if (y20Var != null) {
            y20Var.call(bLiveSettings);
        }
    }

    /* JADX INFO: renamed from: j2 */
    public static /* synthetic */ BLiveSettings m203313j2() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x3 */
    public static <T> T m203363x3(pcj<T> pcjVar, T t) {
        try {
            T tCall = pcjVar.call();
            return ((tCall instanceof String) && TextUtils.isEmpty((String) tCall)) ? t : tCall;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: A3 */
    public BLiveSettings m203370A3() {
        return m203782z3();
    }

    /* JADX INFO: renamed from: A4 */
    public String m203371A4() {
        return (String) m203363x3(new pcj() { // from class: l.qtt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f159484a.m203771x8();
            }
        }, "");
    }

    /* JADX INFO: renamed from: A5 */
    public int m203372A5() {
        return ((Integer) m203363x3(new pcj() { // from class: l.bqt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f77951a.m203671l9();
            }
        }, 20)).intValue();
    }

    /* JADX INFO: renamed from: A6 */
    public boolean m203373A6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.nut
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f143741a.m203616ea();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: A7 */
    public final /* synthetic */ String m203374A7() {
        return m203370A3().liveConfig.recallFansLimitToast;
    }

    /* JADX INFO: renamed from: A8 */
    public final /* synthetic */ BLiveCommonViewConfig m203375A8() {
        return m203370A3().liveConfig.anchorsSearch;
    }

    /* JADX INFO: renamed from: A9 */
    public final /* synthetic */ List m203376A9() {
        return m203370A3().voiceLiveTemplates.virtualAvatar;
    }

    /* JADX INFO: renamed from: Aa */
    public final /* synthetic */ Boolean m203377Aa() {
        return Boolean.valueOf(m203370A3().liveConfig.stealthPrivilege.hiddenAnchorHierarchy.f45198on);
    }

    /* JADX INFO: renamed from: B3 */
    public final BLiveCommonViewConfig m203378B3() {
        BLiveCommonViewConfig bLiveCommonViewConfigNew_ = BLiveCommonViewConfig.new_();
        bLiveCommonViewConfigNew_.icon = "https://auto.tancdn.com/v1/raw/2c753031-2776-4b1b-baac-5ed87aacb98610.png";
        bLiveCommonViewConfigNew_.text = "退出房间";
        bLiveCommonViewConfigNew_.type = "exit";
        return bLiveCommonViewConfigNew_;
    }

    /* JADX INFO: renamed from: B4 */
    public String m203379B4() {
        return (String) m203363x3(new pcj() { // from class: l.yut
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f201663a.m203779y8();
            }
        }, "");
    }

    /* JADX INFO: renamed from: B5 */
    public boolean m203380B5() {
        if (m203370A3() != null && m203370A3().intlLiveConfig != null) {
            return false;
        }
        String[] strArrM203643i5 = m203643i5();
        if (strArrM203643i5.length == 0) {
            return false;
        }
        LiveRegionTag liveRegionTag = uqb0.f180402h0;
        String string = liveRegionTag != null ? liveRegionTag.toString() : null;
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        for (String str : strArrM203643i5) {
            if (TextUtils.equals(string, str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: B6 */
    public boolean m203381B6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.lrt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f133364a.m203624fa();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: B7 */
    public final /* synthetic */ Boolean m203382B7() {
        return Boolean.valueOf(m203370A3().tttLiveConfig.canSwitchAccount);
    }

    /* JADX INFO: renamed from: B8 */
    public final /* synthetic */ BLiveSkinConfig m203383B8() {
        return m203370A3().liveSkinConfig;
    }

    /* JADX INFO: renamed from: B9 */
    public final /* synthetic */ Boolean m203384B9() {
        return Boolean.valueOf(m203370A3().voiceLiveConfig.virtualAvatarSwitch);
    }

    /* JADX INFO: renamed from: Ba */
    public final /* synthetic */ Boolean m203385Ba() {
        return Boolean.valueOf(m203370A3().liveConfig.stealthPrivilege.hideLocation.f45198on);
    }

    /* JADX INFO: renamed from: C3 */
    public boolean m203386C3() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.zut
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f206156a.m203406E7();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: C4 */
    public int m203387C4() {
        return ((Integer) m203363x3(new pcj() { // from class: l.rvt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f165054a.m203787z8();
            }
        }, 0)).intValue();
    }

    /* JADX INFO: renamed from: C5 */
    public BLiveTeenMode m203388C5() {
        return (BLiveTeenMode) m203363x3(new pcj() { // from class: l.jst
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f122528a.m203679m9();
            }
        }, null);
    }

    /* JADX INFO: renamed from: C6 */
    public boolean m203389C6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.bvt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f78632a.m203632ga();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: C7 */
    public final /* synthetic */ String m203390C7() {
        return m203370A3().liveConfig.cardOnLiveText;
    }

    /* JADX INFO: renamed from: C8 */
    public final /* synthetic */ String m203391C8() {
        return m203370A3().liveConfig.entertainmentTabText;
    }

    /* JADX INFO: renamed from: C9 */
    public final /* synthetic */ Boolean m203392C9() {
        return Boolean.valueOf(m203370A3().voiceLiveConfig.voiceActivityShowNumber);
    }

    /* JADX INFO: renamed from: Ca */
    public final /* synthetic */ Boolean m203393Ca() {
        return Boolean.valueOf(m203370A3().liveConfig.leaderboardCollection.f45198on);
    }

    /* JADX INFO: renamed from: D3 */
    public boolean m203394D3() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.aut
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f73545a.m203414F7();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    @Nullable
    /* JADX INFO: renamed from: D4 */
    public final BLiveCommonViewConfig m203395D4() {
        return (BLiveCommonViewConfig) m203363x3(new pcj() { // from class: l.utt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f180995a.m203375A8();
            }
        }, null);
    }

    /* JADX INFO: renamed from: D5 */
    public long m203396D5() {
        return ((Integer) m203363x3(new pcj() { // from class: l.zpt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f205530a.m203687n9();
            }
        }, 5120)).intValue();
    }

    /* JADX INFO: renamed from: D6 */
    public boolean m203397D6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.vst
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f185665a.m203640ha();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: D7 */
    public final /* synthetic */ Integer m203398D7() {
        return Integer.valueOf(m203370A3().liveConfig.discover.counterRefreshInterval);
    }

    /* JADX INFO: renamed from: D8 */
    public final /* synthetic */ Integer m203399D8() {
        return Integer.valueOf(m203370A3().liveConfig.followSetting.frequency);
    }

    /* JADX INFO: renamed from: D9 */
    public final /* synthetic */ Boolean m203400D9() {
        return Boolean.valueOf(m203370A3().voiceLiveConfig.smallWindow.anchor.openWhenSlideRight);
    }

    /* JADX INFO: renamed from: Da */
    public final /* synthetic */ Boolean m203401Da() {
        return Boolean.valueOf(m203370A3().resourceConfig.loadingExpDisable);
    }

    /* JADX INFO: renamed from: E3 */
    public boolean m203402E3() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.fwt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f101204a.m203422G7();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    @Nullable
    /* JADX INFO: renamed from: E4 */
    public BLiveEntrance m203403E4(@Nullable String str) {
        BLiveConfig bLiveConfig;
        BLiveInRoomSideBarEntrance bLiveInRoomSideBarEntrance;
        BLiveEntranceList bLiveEntranceList;
        BLiveSettings bLiveSettingsM203370A3 = m203370A3();
        if (TextUtils.isEmpty(str) || bLiveSettingsM203370A3 == null || (bLiveConfig = bLiveSettingsM203370A3.liveConfig) == null || (bLiveInRoomSideBarEntrance = bLiveConfig.inRoomSideBarEntrance) == null || (bLiveEntranceList = bLiveInRoomSideBarEntrance.entrances) == null || bLiveEntranceList.keyList.isEmpty()) {
            return null;
        }
        BLiveEntrance liveEntrance = bLiveEntranceList.getLiveEntrance(str);
        return liveEntrance != null ? liveEntrance : bLiveEntranceList.getLiveEntrance("default");
    }

    /* JADX INFO: renamed from: E5 */
    public long m203404E5() {
        return ((Integer) m203363x3(new pcj() { // from class: l.art
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f72983a.m203695o9();
            }
        }, 21600000)).intValue();
    }

    /* JADX INFO: renamed from: E6 */
    public boolean m203405E6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.tst
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f176039a.m203648ia();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: E7 */
    public final /* synthetic */ Boolean m203406E7() {
        return Boolean.valueOf(m203370A3().liveConfig.enableFriendsLiveStartEntrance);
    }

    /* JADX INFO: renamed from: E8 */
    public final /* synthetic */ List m203407E8() {
        return m203370A3().liveConfig.managerRights;
    }

    /* JADX INFO: renamed from: E9 */
    public final /* synthetic */ Boolean m203408E9() {
        return Boolean.valueOf(m203370A3().voiceLiveConfig.smallWindow.audience.openWhenSlideRight);
    }

    /* JADX INFO: renamed from: Ea */
    public final /* synthetic */ Boolean m203409Ea() {
        return Boolean.valueOf(m203370A3().liveConfig.isMagicGestureOpened);
    }

    /* JADX INFO: renamed from: F3 */
    public boolean m203410F3() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.upt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f180327a.m203430H7();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    @Nullable
    /* JADX INFO: renamed from: F4 */
    public BLiveSkinConfig m203411F4() {
        return (BLiveSkinConfig) m203363x3(new pcj() { // from class: l.srt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f170370a.m203383B8();
            }
        }, null);
    }

    /* JADX INFO: renamed from: F5 */
    public long m203412F5() {
        BLiveDefaultOpenParas bLiveDefaultOpenParas;
        BLiveInRoomSideBarEntrance bLiveInRoomSideBarEntranceM203691o5 = m203691o5();
        if (bLiveInRoomSideBarEntranceM203691o5 == null || (bLiveDefaultOpenParas = bLiveInRoomSideBarEntranceM203691o5.defaultOpenParas) == null) {
            return 10L;
        }
        long j = bLiveDefaultOpenParas.effectiveWatchMinSeconds;
        if (j <= 0) {
            return 10L;
        }
        return j;
    }

    /* JADX INFO: renamed from: F6 */
    public boolean m203413F6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.hwt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f111921a.m203656ja();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: F7 */
    public final /* synthetic */ Boolean m203414F7() {
        return Boolean.valueOf(m203370A3().liveConfig.multiCallConfig.multiCallVoiceEnable);
    }

    /* JADX INFO: renamed from: F8 */
    public final /* synthetic */ Integer m203415F8() {
        return Integer.valueOf(m203370A3().liveConfig.roomSlide.maxShowTimes);
    }

    /* JADX INFO: renamed from: F9 */
    public final /* synthetic */ List m203416F9() {
        return m203370A3().voiceLiveConfig.audienceOperateMenu;
    }

    /* JADX INFO: renamed from: Fa */
    public final /* synthetic */ Boolean m203417Fa() {
        return Boolean.valueOf(m203370A3().liveConfig.showDebugInfo);
    }

    /* JADX INFO: renamed from: G3 */
    public boolean m203418G3() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.ott
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f149006a.m203438I7();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: G4 */
    public String m203419G4() {
        return (String) m203363x3(new pcj() { // from class: l.jut
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f122740a.m203391C8();
            }
        }, wft.m206160c() ? "" : xau.m209910t(R$string.f44943B));
    }

    /* JADX INFO: renamed from: G5 */
    public String m203420G5() {
        return (String) m203363x3(new pcj() { // from class: l.zvt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f206286a.m203703p9();
            }
        }, "");
    }

    /* JADX INFO: renamed from: G6 */
    public boolean m203421G6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.kst
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f128602a.m203664ka();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: G7 */
    public final /* synthetic */ Boolean m203422G7() {
        return Boolean.valueOf(m203370A3().liveConfig.teenMode.f45302on);
    }

    /* JADX INFO: renamed from: G8 */
    public final /* synthetic */ Integer m203423G8() {
        return Integer.valueOf(m203370A3().liveConfig.memberListMax);
    }

    /* JADX INFO: renamed from: G9 */
    public final /* synthetic */ Boolean m203424G9() {
        return Boolean.valueOf(m203370A3().voiceLiveConfig.smallWindow.caller.openWhenSlideRight);
    }

    /* JADX INFO: renamed from: Ga */
    public final /* synthetic */ Boolean m203425Ga() {
        return Boolean.valueOf(m203370A3().liveConfig.nobleConfig.isOpen);
    }

    /* JADX INFO: renamed from: H3 */
    public boolean m203426H3() {
        if (wft.m206159b(2)) {
            return false;
        }
        return ((Boolean) m203363x3(new pcj() { // from class: l.gst
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f106327a.m203446J7();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: H4 */
    public int m203427H4() {
        return ((Integer) m203363x3(new pcj() { // from class: l.pst
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f153967a.m203399D8();
            }
        }, 3)).intValue();
    }

    /* JADX INFO: renamed from: H5 */
    public boolean m203428H5() {
        BLiveConfig bLiveConfig;
        BLiveSettings bLiveSettingsM203370A3 = m203370A3();
        if (bLiveSettingsM203370A3 == null || (bLiveConfig = bLiveSettingsM203370A3.liveConfig) == null) {
            return true;
        }
        return TextUtils.equals("user", bLiveConfig.verificationConfig.createAnchorInterfaceType);
    }

    /* JADX INFO: renamed from: H6 */
    public boolean m203429H6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.vtt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f185746a.m203672la();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: H7 */
    public final /* synthetic */ Boolean m203430H7() {
        return Boolean.valueOf(m203370A3().voiceLiveConfig.quickGiftConfig.longPressOn);
    }

    /* JADX INFO: renamed from: H8 */
    public final /* synthetic */ List m203431H8() {
        return m203370A3().templates;
    }

    /* JADX INFO: renamed from: H9 */
    public final /* synthetic */ String m203432H9() {
        return m203370A3().voiceLiveConfig.voiceGiftWallConfig.h5HelpUrl;
    }

    /* JADX INFO: renamed from: Ha */
    public final /* synthetic */ Boolean m203433Ha() {
        return Boolean.valueOf(m203370A3().liveConfig.bulletCommentConfig.f45198on);
    }

    /* JADX INFO: renamed from: I3 */
    public long m203434I3() {
        int iIntValue = ((Integer) m203363x3(new pcj() { // from class: l.ist
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f116701a.m203454K7();
            }
        }, 5)).intValue();
        if (iIntValue <= 0) {
            return 5L;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: I4 */
    public List<Integer> m203435I4() {
        return (List) m203363x3(new pcj() { // from class: l.fqt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f100337a.m203407E8();
            }
        }, null);
    }

    /* JADX INFO: renamed from: I5 */
    public int m203436I5() {
        return ((Integer) m203363x3(new pcj() { // from class: l.mwt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f139158a.m203712q9();
            }
        }, 1)).intValue();
    }

    /* JADX INFO: renamed from: I6 */
    public boolean m203437I6() {
        BLiveSettings bLiveSettingsM203370A3 = m203370A3();
        return (bLiveSettingsM203370A3 == null || bLiveSettingsM203370A3.voiceLiveConfig == null || jyb.m147479J(bLiveSettingsM203370A3.liveSquareTabs) || bLiveSettingsM203370A3.liveSquareTabs.size() != 1 || !bLiveSettingsM203370A3.liveSquareTabs.get(0).showNearby) ? false : true;
    }

    /* JADX INFO: renamed from: I7 */
    public final /* synthetic */ Boolean m203438I7() {
        return Boolean.valueOf(m203370A3().voiceLiveConfig.ownerCreateRoomNotify.showEveryTimes);
    }

    /* JADX INFO: renamed from: I8 */
    public final /* synthetic */ Integer m203439I8() {
        return Integer.valueOf(m203370A3().liveConfig.liveStreamEventConfig.minReportBufferingTimeDuration);
    }

    /* JADX INFO: renamed from: I9 */
    public final /* synthetic */ Integer m203440I9() {
        return Integer.valueOf(m203370A3().voiceLiveConfig.roomPopRefresh.leaderboardRefreshInterval);
    }

    /* JADX INFO: renamed from: Ia */
    public final /* synthetic */ Boolean m203441Ia() {
        return Boolean.valueOf(m203370A3().voiceLiveConfig.isOverseaChineseMigrated);
    }

    /* JADX INFO: renamed from: J3 */
    public BLiveFollowRateBubbleV2 m203442J3() {
        return (BLiveFollowRateBubbleV2) m203363x3(new pcj() { // from class: l.xst
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f196139a.m203462L7();
            }
        }, BLiveFollowRateConfigV2.new_().bubble);
    }

    /* JADX INFO: renamed from: J4 */
    public int m203443J4() {
        return ((Integer) m203363x3(new pcj() { // from class: l.oqt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f148645a.m203415F8();
            }
        }, 3)).intValue();
    }

    /* JADX INFO: renamed from: J5 */
    public int m203444J5() {
        return ((Integer) m203363x3(new pcj() { // from class: l.awt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f73794a.m203721r9();
            }
        }, 1)).intValue();
    }

    /* JADX INFO: renamed from: J6 */
    public boolean m203445J6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.qqt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f159040a.m203680ma();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: J7 */
    public final /* synthetic */ Boolean m203446J7() {
        return Boolean.valueOf(m203370A3().liveConfig.fanbase.hiddenRedPacket);
    }

    /* JADX INFO: renamed from: J8 */
    public final /* synthetic */ Long m203447J8() {
        return Long.valueOf(m203370A3().liveConfig.chat.limitation.minSendIntervalMillSeconds);
    }

    /* JADX INFO: renamed from: J9 */
    public final /* synthetic */ BLiveVoiceFeedStyle m203448J9() {
        return m203370A3().voiceLiveConfig.feedStyle;
    }

    /* JADX INFO: renamed from: Ja */
    public final /* synthetic */ Boolean m203449Ja() {
        return Boolean.valueOf(m203370A3().voiceLiveConfig.reflectAudioProcessSwitch);
    }

    /* JADX INFO: renamed from: K3 */
    public BLiveFollowRateChatV2 m203450K3() {
        return (BLiveFollowRateChatV2) m203363x3(new pcj() { // from class: l.ctt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f83762a.m203470M7();
            }
        }, BLiveFollowRateConfigV2.new_().chat);
    }

    /* JADX INFO: renamed from: K4 */
    public int m203451K4() {
        return ((Integer) m203363x3(new pcj() { // from class: l.jrt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f122408a.m203423G8();
            }
        }, 100)).intValue();
    }

    /* JADX INFO: renamed from: K5 */
    public int m203452K5() {
        return ((Integer) m203363x3(new pcj() { // from class: l.yrt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f201354a.m203730s9();
            }
        }, 3)).intValue();
    }

    /* JADX INFO: renamed from: K6 */
    public boolean m203453K6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.btt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f78398a.m203688na();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: K7 */
    public final /* synthetic */ Integer m203454K7() {
        return Integer.valueOf(m203370A3().liveConfig.followRateConfigV2.afterGiveGift);
    }

    /* JADX INFO: renamed from: K8 */
    public final /* synthetic */ String m203455K8() {
        return m203370A3().liveConfig.license.appId;
    }

    /* JADX INFO: renamed from: K9 */
    public final /* synthetic */ Integer m203456K9() {
        return Integer.valueOf(m203370A3().voiceLiveConfig.memberListRefreshInterval);
    }

    /* JADX INFO: renamed from: Ka */
    public final /* synthetic */ Boolean m203457Ka() {
        return Boolean.valueOf(m203370A3().liveConfig.bulletCommentConfig.postConfirmingTextOn);
    }

    /* JADX INFO: renamed from: L3 */
    public int m203458L3() {
        return ((Integer) m203363x3(new pcj() { // from class: l.pwt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f154438a.m203478N7();
            }
        }, 5)).intValue();
    }

    /* JADX INFO: renamed from: L4 */
    public List<BLiveTemplate> m203459L4() {
        return (List) m203363x3(new pcj() { // from class: l.mut
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f138839a.m203431H8();
            }
        }, null);
    }

    /* JADX INFO: renamed from: L5 */
    public int m203460L5() {
        return ((Integer) m203363x3(new pcj() { // from class: l.krt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f128502a.m203739t9();
            }
        }, 3)).intValue();
    }

    /* JADX INFO: renamed from: L6 */
    public boolean m203461L6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.pvt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f154328a.m203696oa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: L7 */
    public final /* synthetic */ BLiveFollowRateBubbleV2 m203462L7() {
        return m203370A3().liveConfig.followRateConfigV2.bubble;
    }

    /* JADX INFO: renamed from: L8 */
    public final /* synthetic */ BLiveCommonConfig m203463L8() {
        return m203370A3().liveConfig.multiCallConfig.upgradeStartModePopUp;
    }

    /* JADX INFO: renamed from: L9 */
    public final /* synthetic */ Boolean m203464L9() {
        return Boolean.valueOf(m203370A3().voiceLiveConfig.showAnnouncementEntrance);
    }

    /* JADX INFO: renamed from: La */
    public final /* synthetic */ String m203465La() {
        return m203370A3().voiceLiveConfig.auctionTrickBubble;
    }

    /* JADX INFO: renamed from: M3 */
    public BLiveFollowRateConfigV2 m203466M3() {
        return (BLiveFollowRateConfigV2) m203363x3(new pcj() { // from class: l.wst
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f190691a.m203486O7();
            }
        }, BLiveFollowRateConfigV2.new_());
    }

    /* JADX INFO: renamed from: M4 */
    public int m203467M4() {
        int iIntValue = ((Integer) m203363x3(new pcj() { // from class: l.wqt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f190429a.m203439I8();
            }
        }, 100)).intValue();
        if (iIntValue <= 0) {
            return 100;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: M5 */
    public int m203468M5() {
        return ((Integer) m203363x3(new pcj() { // from class: l.but
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f78541a.m203748u9();
            }
        }, 3)).intValue();
    }

    /* JADX INFO: renamed from: M6 */
    public boolean m203469M6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.ztt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f206039a.m203704pa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: M7 */
    public final /* synthetic */ BLiveFollowRateChatV2 m203470M7() {
        return m203370A3().liveConfig.followRateConfigV2.chat;
    }

    /* JADX INFO: renamed from: M8 */
    public final /* synthetic */ String m203471M8() {
        return m203370A3().liveConfig.profileConfig.settingButton.text;
    }

    /* JADX INFO: renamed from: M9 */
    public final /* synthetic */ List m203472M9() {
        return m203370A3().voiceLiveConfig.operateMenu;
    }

    /* JADX INFO: renamed from: Ma */
    public final /* synthetic */ Boolean m203473Ma() {
        return Boolean.valueOf(m203370A3().voiceLiveConfig.voiceRecordConfig.isShowHeartbeatReward);
    }

    /* JADX INFO: renamed from: N3 */
    public boolean m203474N3() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.ktt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f128733a.m203494P7();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: N4 */
    public long m203475N4() {
        return ((Long) m203363x3(new pcj() { // from class: l.vut
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f185848a.m203447J8();
            }
        }, 500L)).longValue();
    }

    /* JADX INFO: renamed from: N5 */
    public int m203476N5() {
        return ((Integer) m203363x3(new pcj() { // from class: l.est
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f95654a.m203757v9();
            }
        }, 15)).intValue();
    }

    /* JADX INFO: renamed from: N6 */
    public boolean m203477N6() {
        if (wft.m206159b(2)) {
            return ((Boolean) m203363x3(new pcj() { // from class: l.ntt
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f143633a.m203713qa();
                }
            }, Boolean.FALSE)).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: N7 */
    public final /* synthetic */ Integer m203478N7() {
        return Integer.valueOf(m203370A3().liveConfig.followRateConfigV2.chat.minEventInterval);
    }

    /* JADX INFO: renamed from: N8 */
    public final /* synthetic */ String m203479N8() {
        return m203370A3().liveConfig.profileConfig.userRoomText;
    }

    /* JADX INFO: renamed from: N9 */
    public final /* synthetic */ Integer m203480N9() {
        return Integer.valueOf(m203370A3().voiceLiveConfig.roomPopRefresh.roomAmountRefreshInterval);
    }

    /* JADX INFO: renamed from: Na */
    public final /* synthetic */ Boolean m203481Na() {
        return Boolean.valueOf(m203370A3().voiceLiveConfig.showPledgeAuctionNewTag);
    }

    /* JADX INFO: renamed from: O3 */
    public BLiveFollowRatePopupV2 m203482O3() {
        return (BLiveFollowRatePopupV2) m203363x3(new pcj() { // from class: l.att
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f73412a.m203502Q7();
            }
        }, BLiveFollowRateConfigV2.new_().popup);
    }

    /* JADX INFO: renamed from: O4 */
    public String m203483O4() {
        return (String) m203363x3(new pcj() { // from class: l.xtt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f196242a.m203455K8();
            }
        }, "tantan");
    }

    /* JADX INFO: renamed from: O5 */
    public int m203484O5() {
        return ((Integer) m203363x3(new pcj() { // from class: l.frt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f100475a.m203765w9();
            }
        }, 15)).intValue();
    }

    /* JADX INFO: renamed from: O6 */
    public boolean m203485O6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.vvt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f185986a.m203722ra();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: O7 */
    public final /* synthetic */ BLiveFollowRateConfigV2 m203486O7() {
        return m203370A3().liveConfig.followRateConfigV2;
    }

    /* JADX INFO: renamed from: O8 */
    public final /* synthetic */ Boolean m203487O8() {
        return Boolean.valueOf(m203370A3().liveConfig.f45200pk.firstGiftOn);
    }

    /* JADX INFO: renamed from: O9 */
    public final /* synthetic */ Boolean m203488O9() {
        return Boolean.valueOf(m203370A3().voiceLiveConfig.bindChatGroupPermission);
    }

    /* JADX INFO: renamed from: Oa */
    public final /* synthetic */ Boolean m203489Oa() {
        return Boolean.valueOf(m203370A3().voiceLiveConfig.showRoomRegion);
    }

    /* JADX INFO: renamed from: P3 */
    public int m203490P3() {
        return ((Integer) m203363x3(new pcj() { // from class: l.lut
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f133655a.m203510R7();
            }
        }, 2)).intValue();
    }

    @Nullable
    /* JADX INFO: renamed from: P4 */
    public BLiveCommonConfig m203491P4() {
        return (BLiveCommonConfig) m203363x3(new pcj() { // from class: l.hpt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f111049a.m203463L8();
            }
        }, null);
    }

    /* JADX INFO: renamed from: P5 */
    public int m203492P5() {
        return ((Integer) m203363x3(new pcj() { // from class: l.nvt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f143857a.m203772x9();
            }
        }, 15)).intValue();
    }

    /* JADX INFO: renamed from: P6 */
    public boolean m203493P6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.ert
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f95540a.m203731sa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: P7 */
    public final /* synthetic */ Boolean m203494P7() {
        return Boolean.valueOf(m203370A3().liveConfig.followRateConfigV2.f45218on);
    }

    /* JADX INFO: renamed from: P8 */
    public final /* synthetic */ String m203495P8() {
        return m203370A3().liveConfig.f45200pk.firstGiftToast;
    }

    /* JADX INFO: renamed from: P9 */
    public final /* synthetic */ BLiveVoiceSparkReportConfig m203496P9() {
        return m203370A3().voiceLiveConfig.voiceLiveSparkletReportConfig;
    }

    /* JADX INFO: renamed from: Pa */
    public final /* synthetic */ Boolean m203497Pa() {
        return Boolean.valueOf(m203370A3().voiceLiveConfig.voiceLeaderboard.hourLeaderboardOpen);
    }

    /* JADX INFO: renamed from: Q3 */
    public long m203498Q3() {
        long jLongValue = ((Long) m203363x3(new pcj() { // from class: l.lst
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f133462a.m203518S7();
            }
        }, 60L)).longValue();
        if (jLongValue <= 0) {
            return 60L;
        }
        return jLongValue;
    }

    /* JADX INFO: renamed from: Q4 */
    public String m203499Q4() {
        return (String) m203363x3(new pcj() { // from class: l.hst
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f111474a.m203471M8();
            }
        }, this.f186168h.getString(R$string.f45031l0));
    }

    /* JADX INFO: renamed from: Q5 */
    public BLiveVideoQuality m203500Q5() {
        return (BLiveVideoQuality) m203363x3(new pcj() { // from class: l.eqt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f95392a.m203780y9();
            }
        }, null);
    }

    /* JADX INFO: renamed from: Q6 */
    public boolean m203501Q6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.sut
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f170760a.m203740ta();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: Q7 */
    public final /* synthetic */ BLiveFollowRatePopupV2 m203502Q7() {
        return m203370A3().liveConfig.followRateConfigV2.popup;
    }

    /* JADX INFO: renamed from: Q8 */
    public final /* synthetic */ Integer m203503Q8() {
        return Integer.valueOf(m203370A3().liveConfig.f45200pk.winTimesTag.showTagBeforeEnd);
    }

    /* JADX INFO: renamed from: Q9 */
    public final /* synthetic */ BLiveVoiceCpConfig m203504Q9() {
        return m203370A3().voiceLiveConfig.intlVoiceCpConfig;
    }

    /* JADX INFO: renamed from: Qa */
    public final /* synthetic */ Boolean m203505Qa() {
        return Boolean.valueOf(m203370A3().liveConfig.userStatusInfo.isSidebarNewUser);
    }

    /* JADX INFO: renamed from: R3 */
    public String m203506R3() {
        return (String) m203363x3(new pcj() { // from class: l.npt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f143134a.m203526T7();
            }
        }, xau.m209910t(R$string.f45045q));
    }

    /* JADX INFO: renamed from: R4 */
    public String m203507R4() {
        return (String) m203363x3(new pcj() { // from class: l.rpt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f164395a.m203479N8();
            }
        }, this.f186168h.getString(R$string.f45028k0));
    }

    /* JADX INFO: renamed from: R5 */
    public long m203508R5() {
        return ((Long) m203363x3(new pcj() { // from class: l.jwt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f122969a.m203788z9();
            }
        }, 24L)).longValue();
    }

    /* JADX INFO: renamed from: R6 */
    public boolean m203509R6() {
        if (wft.m206159b(2)) {
            return ((Boolean) m203363x3(new pcj() { // from class: l.gvt
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f106680a.m203749ua();
                }
            }, Boolean.FALSE)).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: R7 */
    public final /* synthetic */ Integer m203510R7() {
        return Integer.valueOf(m203370A3().liveConfig.roomSlide.animationInterval);
    }

    /* JADX INFO: renamed from: R8 */
    public final /* synthetic */ Boolean m203511R8() {
        return Boolean.valueOf(m203370A3().liveConfig.f45200pk.winTimesTag.f45198on);
    }

    /* JADX INFO: renamed from: R9 */
    public final /* synthetic */ String m203512R9() {
        return m203370A3().voiceLiveConfig.verificationLevel;
    }

    /* JADX INFO: renamed from: Ra */
    public final /* synthetic */ Boolean m203513Ra() {
        return Boolean.valueOf(m203370A3().liveConfig.signInConfig.f45198on);
    }

    /* JADX INFO: renamed from: S3 */
    public int m203514S3() {
        return ((Integer) m203363x3(new pcj() { // from class: l.lpt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f133118a.m203534U7();
            }
        }, 15)).intValue();
    }

    /* JADX INFO: renamed from: S4 */
    public boolean m203515S4() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.fst
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f100686a.m203487O8();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: S5 */
    public List<BLiveTemplate> m203516S5() {
        return (List) m203363x3(new pcj() { // from class: l.spt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f170095a.m203376A9();
            }
        }, null);
    }

    /* JADX INFO: renamed from: S6 */
    public boolean m203517S6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.xrt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f195963a.m203758va();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: S7 */
    public final /* synthetic */ Long m203518S7() {
        return Long.valueOf(m203370A3().liveConfig.liveBreakingLeaderboardConfig.duration);
    }

    /* JADX INFO: renamed from: S8 */
    public final /* synthetic */ Integer m203519S8() {
        return Integer.valueOf(m203370A3().liveConfig.pullStreamConfig.retryCountDown);
    }

    /* JADX INFO: renamed from: S9 */
    public final /* synthetic */ Boolean m203520S9() {
        return Boolean.valueOf(m203370A3().liveConfig.followGuide.alsoFollow.show);
    }

    /* JADX INFO: renamed from: Sa */
    public final /* synthetic */ Boolean m203521Sa() {
        return Boolean.valueOf(m203370A3().liveConfig.liveHierarchy.isOpen);
    }

    /* JADX INFO: renamed from: T3 */
    public BLiveCallSetting m203522T3() {
        BLiveConfig bLiveConfig;
        BLiveCallSetting bLiveCallSetting;
        BLiveSettings bLiveSettingsM203370A3 = m203370A3();
        if (bLiveSettingsM203370A3 != null && (bLiveConfig = bLiveSettingsM203370A3.liveConfig) != null && (bLiveCallSetting = bLiveConfig.call) != null) {
            return bLiveCallSetting;
        }
        BLiveCallSetting bLiveCallSettingNew_ = BLiveCallSetting.new_();
        bLiveCallSettingNew_.callGiftButtonDisplay = true;
        bLiveCallSettingNew_.callSettingButtonText = this.f186168h.getString(R$string.f45048r);
        bLiveCallSettingNew_.callAnnouncementUrl = efv.f93839R;
        BLiveCallVideoCancelSetting bLiveCallVideoCancelSettingNew_ = BLiveCallVideoCancelSetting.new_();
        bLiveCallVideoCancelSettingNew_.title = this.f186168h.getString(R$string.f45054t);
        bLiveCallVideoCancelSettingNew_.interval = 60;
        bLiveCallSettingNew_.videoCancel = bLiveCallVideoCancelSettingNew_;
        return bLiveCallSettingNew_;
    }

    /* JADX INFO: renamed from: T4 */
    public String m203523T4() {
        return (String) m203363x3(new pcj() { // from class: l.wtt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f190808a.m203495P8();
            }
        }, xau.m209910t(R$string.f45013f0));
    }

    /* JADX INFO: renamed from: T5 */
    public boolean m203524T5() {
        if (wft.m206159b(3)) {
            return ((Boolean) m203363x3(new pcj() { // from class: l.uqt
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f180505a.m203384B9();
                }
            }, Boolean.TRUE)).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: T6 */
    public boolean m203525T6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.ovt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f149309a.m203766wa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: T7 */
    public final /* synthetic */ String m203526T7() {
        return m203370A3().liveConfig.nobleConfig.shoutingChatConfig.title;
    }

    /* JADX INFO: renamed from: T8 */
    public final /* synthetic */ Integer m203527T8() {
        return Integer.valueOf(m203370A3().liveConfig.pullStreamConfig.pullFailedLimit);
    }

    /* JADX INFO: renamed from: T9 */
    public final /* synthetic */ Boolean m203528T9() {
        return Boolean.valueOf(m203370A3().chatTips.f45198on);
    }

    /* JADX INFO: renamed from: Ta */
    public final /* synthetic */ Boolean m203529Ta() {
        return Boolean.valueOf(m203370A3().voiceLiveConfig.intlEnterRoomOptimize && !wft.m206159b(3));
    }

    /* JADX INFO: renamed from: U3 */
    public int m203530U3() {
        int iIntValue = ((Integer) m203363x3(new pcj() { // from class: l.hvt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f111808a.m203542V7();
            }
        }, 4)).intValue();
        if (iIntValue <= 0) {
            return 4;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: U4 */
    public long m203531U4() {
        return ((Integer) m203363x3(new pcj() { // from class: l.wpt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f190345a.m203503Q8();
            }
        }, 30)).intValue();
    }

    /* JADX INFO: renamed from: U5 */
    public int m203532U5() {
        BLiveVoiceLiveConfig bLiveVoiceLiveConfig;
        BLiveSettings bLiveSettingsM203370A3 = m203370A3();
        if (bLiveSettingsM203370A3 == null || (bLiveVoiceLiveConfig = bLiveSettingsM203370A3.voiceLiveConfig) == null) {
            return 1;
        }
        return Math.max(bLiveVoiceLiveConfig.fixRoomManagerLimit, 1);
    }

    /* JADX INFO: renamed from: U6 */
    public boolean m203533U6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.iqt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f116465a.m203773xa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: U7 */
    public final /* synthetic */ Integer m203534U7() {
        return Integer.valueOf(m203370A3().liveConfig.nobleConfig.shoutingChatConfig.textLimit);
    }

    /* JADX INFO: renamed from: U8 */
    public final /* synthetic */ List m203535U8() {
        List<String> list = m203370A3().liveConfig.inAppPushHideConfig;
        if (jyb.m147479J(list)) {
            return null;
        }
        return list;
    }

    /* JADX INFO: renamed from: U9 */
    public final /* synthetic */ Boolean m203536U9() {
        return Boolean.valueOf(m203370A3().voiceLiveConfig.ownerCreateRoomNotify.show);
    }

    /* JADX INFO: renamed from: Ua */
    public final /* synthetic */ BLiveUnreadTypeEnum m203537Ua() {
        return m203370A3().liveConfig.unreadType.liveTab;
    }

    /* JADX INFO: renamed from: V3 */
    public String m203538V3() {
        return (String) m203363x3(new pcj() { // from class: l.tqt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f175775a.m203550W7();
            }
        }, this.f186168h.getString(R$string.f44946C));
    }

    /* JADX INFO: renamed from: V4 */
    public boolean m203539V4() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.tpt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f175648a.m203511R8();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: V5 */
    public boolean m203540V5() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.eut
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f95960a.m203392C9();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: V6 */
    public boolean m203541V6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.avt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f73659a.m203781ya();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: V7 */
    public final /* synthetic */ Integer m203542V7() {
        return Integer.valueOf(m203370A3().voiceLiveConfig.undercoverMinPlayerCount);
    }

    /* JADX INFO: renamed from: V8 */
    public final /* synthetic */ Integer m203543V8() {
        return Integer.valueOf(m203370A3().liveConfig.pushStreamConfig.manualRetryCountDown);
    }

    /* JADX INFO: renamed from: V9 */
    public final /* synthetic */ Boolean m203544V9() {
        return Boolean.valueOf(m203370A3().voiceLiveConfig.chatEntryExp);
    }

    /* JADX INFO: renamed from: Va */
    public final /* synthetic */ Integer m203545Va() {
        return Integer.valueOf(m203370A3().liveConfig.roomManagerCountMax);
    }

    /* JADX INFO: renamed from: W3 */
    public String m203546W3() {
        return (String) m203363x3(new pcj() { // from class: l.urt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f180701a.m203558X7();
            }
        }, this.f186168h.getString(R$string.f45004c0));
    }

    /* JADX INFO: renamed from: W4 */
    public int m203547W4() {
        int iIntValue = ((Integer) m203363x3(new pcj() { // from class: l.gut
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f106575a.m203519S8();
            }
        }, 30)).intValue();
        if (iIntValue <= 0) {
            return 30;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: W5 */
    public boolean m203548W5() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.ttt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f176103a.m203400D9();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: W6 */
    public boolean m203549W6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.drt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f90424a.m203789za();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: W7 */
    public final /* synthetic */ String m203550W7() {
        return m203370A3().liveConfig.f45200pk.punishmentMessage;
    }

    /* JADX INFO: renamed from: W8 */
    public final /* synthetic */ Integer m203551W8() {
        return Integer.valueOf(m203370A3().liveConfig.pushStreamConfig.pusherFailedManualLimit);
    }

    /* JADX INFO: renamed from: W9 */
    public final /* synthetic */ Boolean m203552W9() {
        return Boolean.valueOf(m203370A3().liveConfig.obsLive.f45198on);
    }

    /* JADX INFO: renamed from: Wa */
    public final /* synthetic */ Boolean m203553Wa() {
        return Boolean.valueOf(m203370A3().voiceLiveConfig.intlVoiceBannerConfig.bannerOpen);
    }

    /* JADX INFO: renamed from: X3 */
    public boolean m203554X3() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.rut
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f164938a.m203566Y7();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: X4 */
    public int m203555X4() {
        int iIntValue = ((Integer) m203363x3(new pcj() { // from class: l.aqt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f72878a.m203527T8();
            }
        }, 2)).intValue();
        if (iIntValue <= 0) {
            return 2;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: X5 */
    public boolean m203556X5() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.opt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f148498a.m203408E9();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: X6 */
    public boolean m203557X6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.put
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f154225a.m203377Aa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: X7 */
    public final /* synthetic */ String m203558X7() {
        return m203370A3().liveConfig.pushStreamConfig.hostLoadingText;
    }

    /* JADX INFO: renamed from: X8 */
    public final /* synthetic */ Integer m203559X8() {
        return Integer.valueOf(m203370A3().liveConfig.pushStreamConfig.pusherFailedLimit);
    }

    /* JADX INFO: renamed from: X9 */
    public final /* synthetic */ Boolean m203560X9() {
        return Boolean.valueOf(m203370A3().tttLiveConfig.gameEntranceHide);
    }

    /* JADX INFO: renamed from: Xa */
    public final /* synthetic */ Boolean m203561Xa() {
        return Boolean.valueOf(m203370A3().liveConfig.liveTab.recordOperateHistoryOn);
    }

    /* JADX INFO: renamed from: Y3 */
    public String m203562Y3() {
        return (String) m203363x3(new pcj() { // from class: l.gqt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f105727a.m203574Z7();
            }
        }, this.f186168h.getString(R$string.f45061v0));
    }

    /* JADX INFO: renamed from: Y4 */
    public List<Integer> m203563Y4(boolean z, boolean z2) {
        BLiveSettings bLiveSettingsM203370A3 = m203370A3();
        if (bLiveSettingsM203370A3 == null) {
            return new ArrayList();
        }
        if (z2) {
            BLivePreDefineMessages bLivePreDefineMessages = bLiveSettingsM203370A3.predefineMessages;
            return z ? bLivePreDefineMessages.anchor : bLivePreDefineMessages.audience;
        }
        BLivePreDefineMessages bLivePreDefineMessages2 = bLiveSettingsM203370A3.predefineMessages;
        return z ? bLivePreDefineMessages2.voiceAnchor : bLivePreDefineMessages2.voiceAudience;
    }

    /* JADX INFO: renamed from: Y5 */
    public List<BLiveCommonViewConfig> m203564Y5() {
        return (List) m203363x3(new pcj() { // from class: l.brt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f78052a.m203416F9();
            }
        }, jyb.m147507f0(m203378B3()));
    }

    /* JADX INFO: renamed from: Y6 */
    public boolean m203565Y6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.iut
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f116981a.m203385Ba();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: Y7 */
    public final /* synthetic */ Boolean m203566Y7() {
        return Boolean.valueOf(m203370A3().voiceLiveConfig.updateChatV3);
    }

    /* JADX INFO: renamed from: Y8 */
    public final /* synthetic */ String m203567Y8() {
        return m203370A3().liveConfig.license.secretKey;
    }

    /* JADX INFO: renamed from: Y9 */
    public final /* synthetic */ Boolean m203568Y9() {
        return Boolean.valueOf(m203370A3().tttLiveConfig.liveEntranceHide.messageChat);
    }

    /* JADX INFO: renamed from: Ya */
    public final /* synthetic */ Boolean m203569Ya() {
        return Boolean.valueOf(m203370A3().liveConfig.notifyFollowers.showNotifyButton);
    }

    /* JADX INFO: renamed from: Z3 */
    public int m203570Z3() {
        return ((Integer) m203363x3(new pcj() { // from class: l.mrt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f138411a.m203582a8();
            }
        }, -1)).intValue();
    }

    /* JADX INFO: renamed from: Z4 */
    public List<String> m203571Z4() {
        return (List) m203363x3(new pcj() { // from class: l.ewt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f96194a.m203535U8();
            }
        }, null);
    }

    /* JADX INFO: renamed from: Z5 */
    public boolean m203572Z5() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.ltt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f133564a.m203424G9();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: Z6 */
    public final boolean m203573Z6() {
        return TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia) && TextUtils.equals("only_room_feed_exp", ABManager.m30350j0("LiveAudio_29"));
    }

    /* JADX INFO: renamed from: Z7 */
    public final /* synthetic */ String m203574Z7() {
        return m203370A3().liveConfig.chat.limitation.limitTips;
    }

    /* JADX INFO: renamed from: Z8 */
    public final /* synthetic */ BQuitLiveStayConfig m203575Z8() {
        return m203370A3().liveConfig.quitLiveStayConfig;
    }

    /* JADX INFO: renamed from: Z9 */
    public final /* synthetic */ Boolean m203576Z9() {
        return Boolean.valueOf(m203370A3().tttLiveConfig.liveEntranceHide.messageFriendHead);
    }

    /* JADX INFO: renamed from: Za */
    public final /* synthetic */ Boolean m203577Za() {
        return Boolean.valueOf(m203370A3().liveConfig.guardConfig.showGuardScoreIncrement);
    }

    /* JADX INFO: renamed from: a4 */
    public String m203578a4() {
        return (String) m203363x3(new pcj() { // from class: l.tut
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f176211a.m203590b8();
            }
        }, "");
    }

    /* JADX INFO: renamed from: a5 */
    public long m203579a5() {
        int iIntValue = ((Integer) m203363x3(new pcj() { // from class: l.tvt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f176295a.m203543V8();
            }
        }, 60)).intValue();
        if (iIntValue <= 0) {
            return 60L;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: a6 */
    public String m203580a6() {
        return (String) m203363x3(new pcj() { // from class: l.lvt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f133731a.m203432H9();
            }
        }, "");
    }

    /* JADX INFO: renamed from: a7 */
    public boolean m203581a7() {
        Map<String, String> map;
        BLiveSettings bLiveSettingsM203370A3 = m203370A3();
        return (bLiveSettingsM203370A3 == null || (map = bLiveSettingsM203370A3.expConfig) == null || !map.containsKey("indonesiaChatroomExp") || TextUtils.isEmpty(bLiveSettingsM203370A3.expConfig.get("indonesiaChatroomExp")) || !"live_indonesia_chatroom:_test01".equals(bLiveSettingsM203370A3.expConfig.get("indonesiaChatroomExp"))) ? false : true;
    }

    /* JADX INFO: renamed from: a8 */
    public final /* synthetic */ Integer m203582a8() {
        return Integer.valueOf(m203370A3().liveConfig.followGuide.chatMsgWatchTime);
    }

    /* JADX INFO: renamed from: a9 */
    public final /* synthetic */ List m203583a9() {
        return m203370A3().voiceLiveConfig.shareConfig.momentTitles;
    }

    /* JADX INFO: renamed from: aa */
    public final /* synthetic */ Boolean m203584aa() {
        return Boolean.valueOf(m203370A3().tttLiveConfig.liveEntranceHide.slideCard);
    }

    /* JADX INFO: renamed from: ab */
    public final /* synthetic */ Boolean m203585ab() {
        return Boolean.valueOf(m203370A3().liveConfig.showMomentLikesAndComments);
    }

    @Nullable
    /* JADX INFO: renamed from: b4 */
    public BLiveConfig m203586b4() {
        BLiveSettings bLiveSettingsM203370A3 = m203370A3();
        if (bLiveSettingsM203370A3 == null) {
            return null;
        }
        return bLiveSettingsM203370A3.liveConfig;
    }

    /* JADX INFO: renamed from: b5 */
    public int m203587b5() {
        BLiveConfig bLiveConfig;
        BLiveSettings bLiveSettingsM203370A3 = m203370A3();
        if (bLiveSettingsM203370A3 == null || (bLiveConfig = bLiveSettingsM203370A3.liveConfig) == null) {
            return 5;
        }
        return bLiveConfig.pushMaxTimes;
    }

    /* JADX INFO: renamed from: b6 */
    public int m203588b6() {
        int iIntValue = ((Integer) m203363x3(new pcj() { // from class: l.kut
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f128919a.m203440I9();
            }
        }, 10)).intValue();
        if (iIntValue <= 0) {
            return 10;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: b7 */
    public boolean m203589b7() {
        if (wft.m206159b(2)) {
            return ((Boolean) m203363x3(new pcj() { // from class: l.hqt
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f111179a.m203393Ca();
                }
            }, Boolean.FALSE)).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: b8 */
    public final /* synthetic */ String m203590b8() {
        return m203370A3().voiceLiveConfig.ownerCreateRoomNotify.notifyContent;
    }

    /* JADX INFO: renamed from: b9 */
    public final /* synthetic */ String m203591b9() {
        return m203370A3().liveConfig.reportFeedback;
    }

    /* JADX INFO: renamed from: ba */
    public final /* synthetic */ Boolean m203592ba() {
        return Boolean.valueOf(m203370A3().tttLiveConfig.liveEntranceHide.bottomLiveTab);
    }

    /* JADX INFO: renamed from: bb */
    public final /* synthetic */ Boolean m203593bb() {
        return Boolean.valueOf(m203370A3().videoChatConfig.showMoreEntrance);
    }

    /* JADX INFO: renamed from: c4 */
    public String m203594c4() {
        return m203370A3().liveConfig.blackListConfig.tipsFormat;
    }

    /* JADX INFO: renamed from: c5 */
    public int m203595c5() {
        int iIntValue = ((Integer) m203363x3(new pcj() { // from class: l.crt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f83360a.m203551W8();
            }
        }, 3)).intValue();
        if (iIntValue <= 0) {
            return 3;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: c6 */
    public BLiveVoiceFeedStyle m203596c6() {
        return (BLiveVoiceFeedStyle) m203363x3(new pcj() { // from class: l.gwt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f106869a.m203448J9();
            }
        }, null);
    }

    /* JADX INFO: renamed from: c7 */
    public boolean m203597c7() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.rqt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f164518a.m203401Da();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: c8 */
    public final /* synthetic */ String m203598c8() {
        return m203370A3().voiceLiveConfig.defaultTabTopicId;
    }

    /* JADX INFO: renamed from: c9 */
    public final /* synthetic */ BLiveCommonConfig m203599c9() {
        return m203370A3().liveConfig.roomAnnouncement;
    }

    /* JADX INFO: renamed from: ca */
    public final /* synthetic */ Boolean m203600ca() {
        return Boolean.valueOf(m203370A3().tttLiveConfig.liveEntranceHide.userProfileLiveBanner);
    }

    /* JADX INFO: renamed from: cb */
    public final /* synthetic */ String m203601cb() {
        return m203370A3().voiceLiveConfig.roomAdministratorExplainH5;
    }

    /* JADX INFO: renamed from: d4 */
    public String m203602d4() {
        return (String) m203363x3(new pcj() { // from class: l.owt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f149569a.m203598c8();
            }
        }, "0");
    }

    /* JADX INFO: renamed from: d5 */
    public int m203603d5() {
        return ((Integer) m203363x3(new pcj() { // from class: l.cst
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f83488a.m203559X8();
            }
        }, 2)).intValue();
    }

    /* JADX INFO: renamed from: d6 */
    public int m203604d6() {
        BLiveVoiceLiveConfig bLiveVoiceLiveConfig;
        BLiveSettings bLiveSettingsM203370A3 = m203370A3();
        if (bLiveSettingsM203370A3 == null || (bLiveVoiceLiveConfig = bLiveSettingsM203370A3.voiceLiveConfig) == null) {
            return 1;
        }
        return Math.max(bLiveVoiceLiveConfig.voiceManagerLimit, 1);
    }

    /* JADX INFO: renamed from: d7 */
    public boolean m203605d7() {
        return m203411F4() != null;
    }

    /* JADX INFO: renamed from: d8 */
    public final /* synthetic */ Integer m203606d8() {
        return Integer.valueOf(m203370A3().voiceLiveConfig.directLeaveRoomMaxStaySeconds);
    }

    /* JADX INFO: renamed from: d9 */
    public final /* synthetic */ Integer m203607d9() {
        return Integer.valueOf(m203370A3().liveConfig.msgSameLocationLimit);
    }

    /* JADX INFO: renamed from: da */
    public final /* synthetic */ Boolean m203608da() {
        return Boolean.valueOf(m203370A3().tttLiveConfig.liveEntranceHide.userProfilePhotoWall);
    }

    /* JADX INFO: renamed from: db */
    public final /* synthetic */ String m203609db() {
        return m203370A3().voiceLiveConfig.roomCardTemplateType;
    }

    /* JADX INFO: renamed from: e4 */
    public int m203610e4() {
        int iIntValue = ((Integer) m203363x3(new pcj() { // from class: l.lqt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f133250a.m203606d8();
            }
        }, 0)).intValue();
        if (iIntValue < 0) {
            return 0;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: e5 */
    public String m203611e5() {
        return (String) m203363x3(new pcj() { // from class: l.pqt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f153709a.m203567Y8();
            }
        }, "");
    }

    /* JADX INFO: renamed from: e6 */
    public int m203612e6() {
        int iIntValue = ((Integer) m203363x3(new pcj() { // from class: l.jtt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f122622a.m203456K9();
            }
        }, 10)).intValue();
        if (iIntValue <= 0) {
            return 10;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: e7 */
    public boolean m203613e7() {
        if (m203370A3() == null || m203370A3().voiceLiveConfig == null) {
            return false;
        }
        int i = m203370A3().voiceLiveConfig.voiceBottomTabMode;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: e8 */
    public final /* synthetic */ Integer m203614e8() {
        return Integer.valueOf(m203370A3().liveConfig.giftConfig.drawGiftConfig.numLimitMax);
    }

    /* JADX INFO: renamed from: e9 */
    public final /* synthetic */ Integer m203615e9() {
        return Integer.valueOf(m203370A3().liveConfig.inRoomSideBarEntrance.defaultOpenParas.sidebarLiveLimitCount);
    }

    /* JADX INFO: renamed from: ea */
    public final /* synthetic */ Boolean m203616ea() {
        return Boolean.valueOf(m203370A3().tttLiveConfig.settingLiveEntranceHide);
    }

    /* JADX INFO: renamed from: eb */
    public final /* synthetic */ String m203617eb() {
        return m203370A3().voiceLiveConfig.voiceCpConfig.inviteGiftId;
    }

    /* JADX INFO: renamed from: f4 */
    public int m203618f4() {
        int iIntValue = ((Integer) m203363x3(new pcj() { // from class: l.dwt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f91043a.m203614e8();
            }
        }, 140)).intValue();
        if (iIntValue <= 0) {
            return 140;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: f5 */
    public BQuitLiveStayConfig m203619f5() {
        return (BQuitLiveStayConfig) m203363x3(new pcj() { // from class: l.qrt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f159204a.m203575Z8();
            }
        }, null);
    }

    /* JADX INFO: renamed from: f6 */
    public boolean m203620f6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.vqt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f185397a.m203464L9();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: f7 */
    public boolean m203621f7() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.ett
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f95814a.m203409Ea();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: f8 */
    public final /* synthetic */ Integer m203622f8() {
        return Integer.valueOf(m203370A3().liveConfig.giftConfig.drawGiftConfig.numLimitMin);
    }

    /* JADX INFO: renamed from: f9 */
    public final /* synthetic */ BLiveStartBtnConfig m203623f9() {
        return m203370A3().liveConfig.toStartLiveConfig;
    }

    /* JADX INFO: renamed from: fa */
    public final /* synthetic */ Boolean m203624fa() {
        return Boolean.valueOf(m203370A3().tttLiveConfig.settingNoticeEntranceHide);
    }

    /* JADX INFO: renamed from: fb */
    public final /* synthetic */ String m203625fb() {
        return m203370A3().voiceLiveConfig.voiceCpConfig.inviteGiftPrice;
    }

    /* JADX INFO: renamed from: g4 */
    public int m203626g4() {
        int iIntValue = ((Integer) m203363x3(new pcj() { // from class: l.itt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f116872a.m203622f8();
            }
        }, 10)).intValue();
        if (iIntValue <= 0) {
            return 10;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: g5 */
    public String m203627g5(int i, boolean z) {
        BLiveConfig bLiveConfig;
        BLiveSettings bLiveSettingsM203370A3 = m203370A3();
        if (bLiveSettingsM203370A3 == null || (bLiveConfig = bLiveSettingsM203370A3.liveConfig) == null) {
            return this.f186168h.getString(R$string.f45010e0);
        }
        if (i == 1) {
            return z ? bLiveConfig.f45200pk.quitPkMessages.random.playingStage : bLiveConfig.f45200pk.quitPkMessages.random.punishingStage;
        }
        if (i == 3) {
            return z ? bLiveConfig.f45200pk.quitPkMessages.bounty.playingStage : bLiveConfig.f45200pk.quitPkMessages.bounty.punishingStage;
        }
        return z ? bLiveConfig.f45200pk.quitPkMessages.specified.playingStage : bLiveConfig.f45200pk.quitPkMessages.specified.punishingStage;
    }

    /* JADX INFO: renamed from: g6 */
    public List<BLiveCommonViewConfig> m203628g6() {
        return (List) m203363x3(new pcj() { // from class: l.zqt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f205658a.m203472M9();
            }
        }, jyb.m147507f0(m203378B3()));
    }

    /* JADX INFO: renamed from: g7 */
    public boolean m203629g7() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.nrt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f143430a.m203417Fa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: g8 */
    public final /* synthetic */ Integer m203630g8() {
        return Integer.valueOf(m203370A3().liveConfig.giftConfig.drawGiftConfig.playDisplayLongDelay);
    }

    /* JADX INFO: renamed from: g9 */
    public final /* synthetic */ Integer m203631g9() {
        return Integer.valueOf(m203370A3().liveConfig.liveStreamEventConfig.bufferStopReportDuration);
    }

    /* JADX INFO: renamed from: ga */
    public final /* synthetic */ Boolean m203632ga() {
        return Boolean.valueOf(m203370A3().tttLiveConfig.voiceLiveEntranceHide.messageFriendHead);
    }

    /* JADX INFO: renamed from: gb */
    public BLiveUnreadTypeEnum m203633gb() {
        return (BLiveUnreadTypeEnum) m203363x3(new pcj() { // from class: l.kvt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f128995a.m203537Ua();
            }
        }, null);
    }

    /* JADX INFO: renamed from: h4 */
    public int m203634h4() {
        int iIntValue = ((Integer) m203363x3(new pcj() { // from class: l.ipt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f116304a.m203630g8();
            }
        }, 40)).intValue();
        if (iIntValue <= 0) {
            return 40;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: h5 */
    public String m203635h5() {
        List list = (List) m203363x3(new pcj() { // from class: l.dtt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f90626a.m203583a9();
            }
        }, null);
        return (list == null || list.isEmpty()) ? "" : (String) list.get(new Random().nextInt(list.size()));
    }

    /* JADX INFO: renamed from: h6 */
    public int m203636h6() {
        int iIntValue = ((Integer) m203363x3(new pcj() { // from class: l.uwt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f181319a.m203480N9();
            }
        }, 10)).intValue();
        if (iIntValue <= 0) {
            return 10;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: h7 */
    public boolean m203637h7() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.hut
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f111698a.m203425Ga();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: h8 */
    public final /* synthetic */ Integer m203638h8() {
        return Integer.valueOf(m203370A3().liveConfig.giftConfig.drawGiftConfig.playDisplayLongDelay);
    }

    /* JADX INFO: renamed from: h9 */
    public final /* synthetic */ BSuggestedTabAnimationItem m203639h9() {
        return m203370A3().liveConfig.suggestedTabAnimation.card;
    }

    /* JADX INFO: renamed from: ha */
    public final /* synthetic */ Boolean m203640ha() {
        return Boolean.valueOf(m203370A3().tttLiveConfig.voiceLiveEntranceHide.slideCard);
    }

    /* JADX INFO: renamed from: hb */
    public int m203641hb() {
        return ((Integer) m203363x3(new pcj() { // from class: l.htt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f111595a.m203545Va();
            }
        }, 0)).intValue();
    }

    /* JADX INFO: renamed from: i4 */
    public int m203642i4() {
        int iIntValue = ((Integer) m203363x3(new pcj() { // from class: l.vrt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f185521a.m203638h8();
            }
        }, 20)).intValue();
        if (iIntValue <= 0) {
            return 20;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: i5 */
    public String[] m203643i5() {
        String strM80485F = RemoteConfig.m80481x().m80485F("ttt_av_func_regions");
        if (TextUtils.isEmpty(strM80485F)) {
            String[] strArr = new String[0];
            this.f186169i = strArr;
            return strArr;
        }
        try {
            JSONArray jSONArray = new JSONArray(strM80485F);
            this.f186169i = new String[jSONArray.length()];
            int i = 0;
            while (true) {
                int length = jSONArray.length();
                String[] strArr2 = this.f186169i;
                if (i >= length) {
                    return strArr2;
                }
                strArr2[i] = jSONArray.getString(i);
                i++;
            }
        } catch (JSONException unused) {
            String[] strArr3 = new String[0];
            this.f186169i = strArr3;
            return strArr3;
        }
    }

    /* JADX INFO: renamed from: i6 */
    public boolean m203644i6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.nqt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f143258a.m203488O9();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: i7 */
    public boolean m203645i7() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.jvt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f122837a.m203433Ha();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: i8 */
    public final /* synthetic */ Integer m203646i8() {
        return Integer.valueOf(m203370A3().liveConfig.giftConfig.drawGiftConfig.playSplitNum);
    }

    /* JADX INFO: renamed from: i9 */
    public final /* synthetic */ BSuggestedTabAnimationItem m203647i9() {
        return m203370A3().liveConfig.suggestedTabAnimation.follow;
    }

    /* JADX INFO: renamed from: ia */
    public final /* synthetic */ Boolean m203648ia() {
        return Boolean.valueOf(m203370A3().tttLiveConfig.voiceLiveEntranceHide.messageListChatDynamic);
    }

    /* JADX INFO: renamed from: ib */
    public int m203649ib() {
        BLiveVoiceLiveConfig bLiveVoiceLiveConfig;
        int i;
        BLiveSettings bLiveSettingsM203370A3 = m203370A3();
        if (bLiveSettingsM203370A3 == null || (bLiveVoiceLiveConfig = bLiveSettingsM203370A3.voiceLiveConfig) == null || (i = bLiveVoiceLiveConfig.chatEntryRefreshInterval) == 0) {
            return 60;
        }
        return i;
    }

    /* JADX INFO: renamed from: j4 */
    public int m203650j4() {
        int iIntValue = ((Integer) m203363x3(new pcj() { // from class: l.wrt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f190560a.m203646i8();
            }
        }, 50)).intValue();
        if (iIntValue <= 0) {
            return 50;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: j5 */
    public String m203651j5() {
        return (String) m203363x3(new pcj() { // from class: l.ivt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f117119a.m203591b9();
            }
        }, this.f186168h.getString(R$string.f45034m0));
    }

    /* JADX INFO: renamed from: j6 */
    public C22421c<Boolean> m203652j6() {
        return m159274k().map(new qcj() { // from class: l.uvt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vwt.m203212K0((BLiveSettings) obj);
            }
        }).distinctUntilChanged();
    }

    /* JADX INFO: renamed from: j7 */
    public boolean m203653j7() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.iwt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f117297a.m203441Ia();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: j8 */
    public final /* synthetic */ Integer m203654j8() {
        return Integer.valueOf(m203370A3().liveConfig.giftConfig.drawGiftConfig.templateDisplayDelay);
    }

    /* JADX INFO: renamed from: j9 */
    public final /* synthetic */ BSuggestedTabAnimationItem m203655j9() {
        return m203370A3().liveConfig.suggestedTabAnimation.guide;
    }

    /* JADX INFO: renamed from: ja */
    public final /* synthetic */ Boolean m203656ja() {
        return Boolean.valueOf(m203370A3().tttLiveConfig.voiceLiveEntranceHide.messageListRightBottom);
    }

    /* JADX INFO: renamed from: jb */
    public boolean m203657jb() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.xpt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f195741a.m203553Wa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: k4 */
    public int m203658k4() {
        int iIntValue = ((Integer) m203363x3(new pcj() { // from class: l.gpt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f105500a.m203654j8();
            }
        }, 60)).intValue();
        if (iIntValue <= 0) {
            return 60;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: k5 */
    public BLiveCommonConfig m203659k5() {
        return (BLiveCommonConfig) m203363x3(new pcj() { // from class: l.cwt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f84143a.m203599c9();
            }
        }, BLiveCommonConfig.new_());
    }

    /* JADX INFO: renamed from: k6 */
    public BLiveVoiceSparkReportConfig m203660k6() {
        return (BLiveVoiceSparkReportConfig) m203363x3(new pcj() { // from class: l.mvt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f138945a.m203496P9();
            }
        }, null);
    }

    /* JADX INFO: renamed from: k7 */
    public boolean m203661k7() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.dvt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f90946a.m203449Ja();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: k8 */
    public final /* synthetic */ Integer m203662k8() {
        return Integer.valueOf(m203370A3().liveConfig.enterRoomEffect.cleanDuration);
    }

    /* JADX INFO: renamed from: k9 */
    public final /* synthetic */ String m203663k9() {
        return m203370A3().voiceLiveConfig.voiceCpConfig.regulationPageUrl;
    }

    /* JADX INFO: renamed from: ka */
    public final /* synthetic */ Boolean m203664ka() {
        return Boolean.valueOf(m203370A3().tttLiveConfig.voiceLiveEntranceHide.bottomRecreation);
    }

    /* JADX INFO: renamed from: kb */
    public boolean m203665kb() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.qst
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f159349a.m203561Xa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: l4 */
    public int m203666l4() {
        int iIntValue = ((Integer) m203363x3(new pcj() { // from class: l.rtt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f164860a.m203662k8();
            }
        }, 60)).intValue();
        if (iIntValue <= 0) {
            return 60;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: l5 */
    public int m203667l5() {
        return ((Integer) m203363x3(new pcj() { // from class: l.rwt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f165235a.m203607d9();
            }
        }, 5)).intValue();
    }

    /* JADX INFO: renamed from: l6 */
    public BLiveVoiceCpConfig m203668l6() {
        return (BLiveVoiceCpConfig) m203363x3(new pcj() { // from class: l.cvt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f84063a.m203504Q9();
            }
        }, null);
    }

    /* JADX INFO: renamed from: l7 */
    public boolean m203669l7() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.ppt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f153583a.m203457Ka();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: l8 */
    public final /* synthetic */ String m203670l8() {
        return m203370A3().liveConfig.fakeAlert.title;
    }

    /* JADX INFO: renamed from: l9 */
    public final /* synthetic */ Integer m203671l9() {
        return Integer.valueOf(m203370A3().liveConfig.swipeCardUnlimit.minGrade);
    }

    /* JADX INFO: renamed from: la */
    public final /* synthetic */ Boolean m203672la() {
        return Boolean.valueOf(m203370A3().tttLiveConfig.walletLiveEntranceHide);
    }

    /* JADX INFO: renamed from: lb */
    public boolean m203673lb() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.ftt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f100806a.m203569Ya();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: m4 */
    public String m203674m4() {
        return (String) m203363x3(new pcj() { // from class: l.cut
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f83895a.m203670l8();
            }
        }, null);
    }

    /* JADX INFO: renamed from: m5 */
    public String m203675m5() {
        BLiveCommonViewConfig bLiveCommonViewConfigM203395D4 = m203395D4();
        return bLiveCommonViewConfigM203395D4 == null ? "" : bLiveCommonViewConfigM203395D4.text;
    }

    /* JADX INFO: renamed from: m6 */
    public String m203676m6() {
        return (String) m203363x3(new pcj() { // from class: l.kpt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f127909a.m203512R9();
            }
        }, Mobile.TYPE);
    }

    /* JADX INFO: renamed from: m7 */
    public String m203677m7() {
        return (String) m203363x3(new pcj() { // from class: l.nst
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f143540a.m203465La();
            }
        }, "");
    }

    /* JADX INFO: renamed from: m8 */
    public final /* synthetic */ String m203678m8() {
        return m203370A3().liveConfig.fanbase.fanbaseRuleUrl;
    }

    /* JADX INFO: renamed from: m9 */
    public final /* synthetic */ BLiveTeenMode m203679m9() {
        return m203370A3().liveConfig.teenMode;
    }

    /* JADX INFO: renamed from: ma */
    public final /* synthetic */ Boolean m203680ma() {
        return Boolean.valueOf(m203370A3().voiceLiveConfig.anchorGrowthEntrySwitch);
    }

    /* JADX INFO: renamed from: mb */
    public boolean m203681mb(@Nullable String str) {
        BLiveEntrance bLiveEntranceM203403E4 = m203403E4(str);
        if (bLiveEntranceM203403E4 == null) {
            return false;
        }
        return bLiveEntranceM203403E4.f45208on;
    }

    /* JADX INFO: renamed from: n4 */
    public String m203682n4() {
        return (String) m203363x3(new pcj() { // from class: l.ptt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f154108a.m203678m8();
            }
        }, "");
    }

    /* JADX INFO: renamed from: n5 */
    public int m203683n5() {
        return ((Integer) m203363x3(new pcj() { // from class: l.grt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f106144a.m203615e9();
            }
        }, 0)).intValue();
    }

    /* JADX INFO: renamed from: n6 */
    public boolean m203684n6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.sqt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f170267a.m203520S9();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: n7 */
    public boolean m203685n7() {
        if (NullChecker.m82486a(m203370A3()) && NullChecker.m82486a(m203370A3().intlLiveConfig)) {
            return (m203769x6() && m203421G6() && m203736t6()) ? false : true;
        }
        LiveRegionTag liveRegionTag = uqb0.f180402h0;
        if (TEnum.equals(liveRegionTag, "unknown_")) {
            String str = new wyd0("live_region_tag_" + vxr.m203884l(), "").get();
            if (!TextUtils.isEmpty(str)) {
                try {
                    liveRegionTag = LiveRegionTag.get(str);
                } catch (Exception unused) {
                    liveRegionTag = uqb0.f180402h0;
                }
            }
        }
        String[] strArrM203643i5 = m203643i5();
        if (strArrM203643i5.length == 0) {
            return false;
        }
        String string = liveRegionTag != null ? liveRegionTag.toString() : null;
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        for (String str2 : strArrM203643i5) {
            if (TextUtils.equals(string, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n8 */
    public final /* synthetic */ Long m203686n8() {
        return Long.valueOf(m203370A3().liveConfig.chat.limitation.floodsMinSendIntervalSeconds);
    }

    /* JADX INFO: renamed from: n9 */
    public final /* synthetic */ Integer m203687n9() {
        int i = m203370A3().liveConfig.intlFeedbackConfig.uploadImageSizeLimit;
        if (i == 0) {
            i = 5120;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: na */
    public final /* synthetic */ Boolean m203688na() {
        return Boolean.valueOf(m203370A3().liveConfig.liveBreakingLeaderboardConfig.isOpen);
    }

    /* JADX INFO: renamed from: nb */
    public boolean m203689nb() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.gtt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f106446a.m203577Za();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: o4 */
    public long m203690o4() {
        long jLongValue = ((Long) m203363x3(new pcj() { // from class: l.prt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f153845a.m203686n8();
            }
        }, 15L)).longValue();
        if (jLongValue <= 0) {
            return 15L;
        }
        return jLongValue;
    }

    @Nullable
    /* JADX INFO: renamed from: o5 */
    public BLiveInRoomSideBarEntrance m203691o5() {
        BLiveConfig bLiveConfig;
        BLiveSettings bLiveSettingsM203370A3 = m203370A3();
        if (bLiveSettingsM203370A3 == null || (bLiveConfig = bLiveSettingsM203370A3.liveConfig) == null) {
            return null;
        }
        return bLiveConfig.inRoomSideBarEntrance;
    }

    /* JADX INFO: renamed from: o6 */
    public boolean m203692o6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.jqt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f122241a.m203528T9();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: o7 */
    public boolean m203693o7() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.bwt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f78783a.m203473Ma();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: o8 */
    public final /* synthetic */ List m203694o8() {
        return m203370A3().voiceLiveConfig.intlFlyMicEffectConfig;
    }

    /* JADX INFO: renamed from: o9 */
    public final /* synthetic */ Integer m203695o9() {
        int i = m203370A3().liveConfig.intlFeedbackConfig.logUploadLimitFrequency * 1000;
        if (i == 0) {
            i = 21600000;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: oa */
    public final /* synthetic */ Boolean m203696oa() {
        return Boolean.valueOf(m203370A3().voiceLiveConfig.roomPopRefresh.isCanAmountRefresh);
    }

    /* JADX INFO: renamed from: ob */
    public boolean m203697ob() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.jpt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f122133a.m203585ab();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: p4 */
    public List<BLiveIntlFlyMicEffectConfig> m203698p4() {
        return (List) m203363x3(new pcj() { // from class: l.ast
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f73175a.m203694o8();
            }
        }, null);
    }

    /* JADX INFO: renamed from: p5 */
    public int m203699p5(int i) {
        BLiveConfig bLiveConfig;
        BLiveSmallWindow bLiveSmallWindow;
        BLiveSettings bLiveSettingsM203370A3 = m203370A3();
        float f = (bLiveSettingsM203370A3 == null || (bLiveConfig = bLiveSettingsM203370A3.liveConfig) == null || (bLiveSmallWindow = bLiveConfig.smallWindow) == null) ? 0.2f : bLiveSmallWindow.location.marginTopP;
        float f2 = i;
        int i2 = (int) ((f > 0.0f ? f : 0.2f) * f2);
        if (i2 < bnl0.m105511F0()) {
            return bnl0.m105511F0();
        }
        float fM203708q5 = f2 - ((m203708q5() * 1.7777778f) + qa00.m175859d(138.0f));
        return ((float) i2) > fM203708q5 ? (int) fM203708q5 : i2;
    }

    /* JADX INFO: renamed from: p6 */
    public boolean m203700p6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.mqt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f138171a.m203536U9();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: p7 */
    public boolean m203701p7() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.dqt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f90294a.m203481Na();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: p8 */
    public final /* synthetic */ Integer m203702p8() {
        return Integer.valueOf(m203370A3().liveConfig.guardConfig.sessionDuration);
    }

    /* JADX INFO: renamed from: p9 */
    public final /* synthetic */ String m203703p9() {
        return m203370A3().liveConfig.verificationConfig.createAnchorInterfaceType;
    }

    /* JADX INFO: renamed from: pa */
    public final /* synthetic */ Boolean m203704pa() {
        return Boolean.valueOf(m203370A3().voiceLiveConfig.roomPopRefresh.isCanLeaderboardRefresh);
    }

    /* JADX INFO: renamed from: pb */
    public boolean m203705pb() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.yvt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f201760a.m203593bb();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: q3 */
    public int m203706q3() {
        return ((Integer) m203363x3(new pcj() { // from class: l.wut
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f190885a.m203770x7();
            }
        }, 0)).intValue();
    }

    /* JADX INFO: renamed from: q4 */
    public int m203707q4() {
        return ((Integer) m203363x3(new pcj() { // from class: l.zst
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f205895a.m203702p8();
            }
        }, 2)).intValue();
    }

    /* JADX INFO: renamed from: q5 */
    public int m203708q5() {
        BLiveConfig bLiveConfig;
        BLiveSmallWindow bLiveSmallWindow;
        BLiveSettings bLiveSettingsM203370A3 = m203370A3();
        float f = (bLiveSettingsM203370A3 == null || (bLiveConfig = bLiveSettingsM203370A3.liveConfig) == null || (bLiveSmallWindow = bLiveConfig.smallWindow) == null) ? 0.3f : bLiveSmallWindow.location.widthP;
        float f2 = f > 0.0f ? f : 0.3f;
        if (f2 > 0.5d) {
            f2 = 0.5f;
        }
        return (int) (f2 * bnl0.m105592y0());
    }

    /* JADX INFO: renamed from: q6 */
    public boolean m203709q6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.xvt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f196428a.m203544V9();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: q7 */
    public boolean m203710q7() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.dst
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f90516a.m203489Oa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ List m203711q8() {
        return m203370A3().liveConfig.roomSlide.intervalDays;
    }

    /* JADX INFO: renamed from: q9 */
    public final /* synthetic */ Integer m203712q9() {
        return Integer.valueOf(m203370A3().videoChatConfig.chat.autoFakeCallResetHours);
    }

    /* JADX INFO: renamed from: qa */
    public final /* synthetic */ Boolean m203713qa() {
        return Boolean.valueOf(m203370A3().liveConfig.blackListConfig.isOpen);
    }

    /* JADX INFO: renamed from: qb */
    public String m203714qb() {
        return (String) m203363x3(new pcj() { // from class: l.mst
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f138525a.m203601cb();
            }
        }, "");
    }

    /* JADX INFO: renamed from: r3 */
    public String m203715r3() {
        return (String) m203363x3(new pcj() { // from class: l.twt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f176425a.m203778y7();
            }
        }, "");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX INFO: renamed from: r4 */
    public String m203716r4() {
        BLiveWealthLogoConfig bLiveWealthLogoConfig;
        BLiveSettings bLiveSettingsM203370A3 = m203370A3();
        if (bLiveSettingsM203370A3 == null) {
            return "";
        }
        if (NullChecker.m82486a(bLiveSettingsM203370A3.wealthLogoNewIconConfig)) {
            bLiveWealthLogoConfig = bLiveSettingsM203370A3.wealthLogoNewIconConfig;
            if (!bLiveWealthLogoConfig.openNewIcon) {
                if (NullChecker.m82486a(bLiveSettingsM203370A3.wealthLogoConfig)) {
                    bLiveWealthLogoConfig = bLiveSettingsM203370A3.wealthLogoConfig;
                } else {
                    bLiveWealthLogoConfig = null;
                }
            }
        } else if (NullChecker.m82486a(bLiveSettingsM203370A3.wealthLogoConfig)) {
            bLiveWealthLogoConfig = bLiveSettingsM203370A3.wealthLogoConfig;
        } else {
            bLiveWealthLogoConfig = null;
        }
        return NullChecker.m82486a(bLiveWealthLogoConfig) ? bLiveWealthLogoConfig.picture : "";
    }

    /* JADX INFO: renamed from: r5 */
    public UserWealthGradeConfig m203717r5(int i, boolean z) {
        BLiveWealthLogoConfig bLiveWealthLogoConfig;
        UserWealthGradeConfig userWealthGradeConfigNew_ = UserWealthGradeConfig.new_();
        BLiveSettings bLiveSettingsM203370A3 = m203370A3();
        if (bLiveSettingsM203370A3 != null) {
            if (NullChecker.m82486a(bLiveSettingsM203370A3.wealthLogoConfig)) {
                bLiveWealthLogoConfig = bLiveSettingsM203370A3.wealthLogoConfig;
                if (NullChecker.m82486a(bLiveWealthLogoConfig.tipsMap) && !bLiveWealthLogoConfig.tipsMap.isEmpty()) {
                    String str = bLiveWealthLogoConfig.tipsMap.get(String.valueOf(i));
                    if (!TextUtils.isEmpty(str)) {
                        userWealthGradeConfigNew_.wealthGradeDesc = str;
                    }
                }
            } else {
                bLiveWealthLogoConfig = null;
            }
            if (NullChecker.m82486a(bLiveSettingsM203370A3.wealthLogoNewIconConfig)) {
                BLiveWealthLogoConfig bLiveWealthLogoConfig2 = bLiveSettingsM203370A3.wealthLogoNewIconConfig;
                if (bLiveWealthLogoConfig2.openNewIcon) {
                    userWealthGradeConfigNew_.openNewIcon = true;
                    bLiveWealthLogoConfig = bLiveWealthLogoConfig2;
                }
            }
            if (NullChecker.m82486a(bLiveSettingsM203370A3.wealthLogoNewIconConfigV2)) {
                BLiveWealthLogoConfig bLiveWealthLogoConfig3 = bLiveSettingsM203370A3.wealthLogoNewIconConfigV2;
                if (bLiveWealthLogoConfig3.openNewIcon) {
                    userWealthGradeConfigNew_.openNewIcon = true;
                    bLiveWealthLogoConfig = bLiveWealthLogoConfig3;
                }
            }
            if (NullChecker.m82486a(bLiveWealthLogoConfig)) {
                if (z) {
                    if (NullChecker.m82486a(bLiveWealthLogoConfig.swipeIconMap) && !bLiveWealthLogoConfig.swipeIconMap.isEmpty()) {
                        String str2 = bLiveWealthLogoConfig.swipeIconMap.get(String.valueOf(i));
                        if (!TextUtils.isEmpty(str2)) {
                            userWealthGradeConfigNew_.wealthIconUrl = str2;
                            return userWealthGradeConfigNew_;
                        }
                    }
                } else if (NullChecker.m82486a(bLiveWealthLogoConfig.otherIconMap) && !bLiveWealthLogoConfig.otherIconMap.isEmpty()) {
                    String str3 = bLiveWealthLogoConfig.otherIconMap.get(String.valueOf(i));
                    if (!TextUtils.isEmpty(str3)) {
                        userWealthGradeConfigNew_.wealthIconUrl = str3;
                    }
                }
            }
        }
        return userWealthGradeConfigNew_;
    }

    /* JADX INFO: renamed from: r6 */
    public boolean m203718r6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.ypt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f201097a.m203552W9();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: r7 */
    public boolean m203719r7() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.qut
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f159619a.m203497Pa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ String m203720r8() {
        return m203370A3().intlGameSquareUrl;
    }

    /* JADX INFO: renamed from: r9 */
    public final /* synthetic */ Integer m203721r9() {
        return Integer.valueOf(m203370A3().videoChatConfig.chat.autoFakeCallTimesLimit);
    }

    /* JADX INFO: renamed from: ra */
    public final /* synthetic */ Boolean m203722ra() {
        return Boolean.valueOf(m203370A3().liveConfig.stormCommentConfig.f45198on);
    }

    /* JADX INFO: renamed from: rb */
    public String m203723rb() {
        return (String) m203363x3(new pcj() { // from class: l.ort
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f148759a.m203609db();
            }
        }, "");
    }

    /* JADX INFO: renamed from: s3 */
    public BLiveUnreadTypeEnum m203724s3() {
        return (BLiveUnreadTypeEnum) m203363x3(new pcj() { // from class: l.nwt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f144031a.m203786z7();
            }
        }, null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX INFO: renamed from: s4 */
    public String m203725s4() {
        BLiveWealthLogoConfig bLiveWealthLogoConfig;
        BLiveSettings bLiveSettingsM203370A3 = m203370A3();
        if (bLiveSettingsM203370A3 == null) {
            return "";
        }
        if (NullChecker.m82486a(bLiveSettingsM203370A3.wealthLogoNewIconConfig)) {
            bLiveWealthLogoConfig = bLiveSettingsM203370A3.wealthLogoNewIconConfig;
            if (!bLiveWealthLogoConfig.openNewIcon) {
                if (NullChecker.m82486a(bLiveSettingsM203370A3.wealthLogoConfig)) {
                    bLiveWealthLogoConfig = bLiveSettingsM203370A3.wealthLogoConfig;
                } else {
                    bLiveWealthLogoConfig = null;
                }
            }
        } else if (NullChecker.m82486a(bLiveSettingsM203370A3.wealthLogoConfig)) {
            bLiveWealthLogoConfig = bLiveSettingsM203370A3.wealthLogoConfig;
        } else {
            bLiveWealthLogoConfig = null;
        }
        return NullChecker.m82486a(bLiveWealthLogoConfig) ? bLiveWealthLogoConfig.description : "";
    }

    /* JADX INFO: renamed from: s5 */
    public BLiveStartBtnConfig m203726s5() {
        return (BLiveStartBtnConfig) m203363x3(new pcj() { // from class: l.qpt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f158905a.m203623f9();
            }
        }, null);
    }

    /* JADX INFO: renamed from: s6 */
    public boolean m203727s6() {
        if (super.m159277n() != null) {
            return true;
        }
        BLiveSettings bLiveSettingsM159276m = m159276m();
        this.f186170j = bLiveSettingsM159276m;
        return bLiveSettingsM159276m != null;
    }

    /* JADX INFO: renamed from: s7 */
    public boolean m203728s7() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.yqt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f201241a.m203505Qa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ String m203729s8() {
        return m203370A3().intlLiveConfig.liveRoomLeaderboardSchema;
    }

    /* JADX INFO: renamed from: s9 */
    public final /* synthetic */ Integer m203730s9() {
        int i = m203370A3().videoChatConfig.chat.call.fetchInterval;
        if (i == 0) {
            i = 3;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: sa */
    public final /* synthetic */ Boolean m203731sa() {
        return Boolean.valueOf(m203370A3().liveConfig.fanbase.f45214on);
    }

    /* JADX INFO: renamed from: sb */
    public int m203732sb() {
        BLiveConfig bLiveConfig;
        int i;
        BLiveSettings bLiveSettingsM203370A3 = m203370A3();
        if (bLiveSettingsM203370A3 == null || (bLiveConfig = bLiveSettingsM203370A3.liveConfig) == null || (i = bLiveConfig.liveSquareRefreshListInterval) == 0) {
            return 600;
        }
        return i;
    }

    /* JADX INFO: renamed from: t3 */
    public String m203733t3() {
        return (String) m203363x3(new pcj() { // from class: l.ust
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f180862a.m203374A7();
            }
        }, null);
    }

    /* JADX INFO: renamed from: t4 */
    public List<Integer> m203734t4() {
        List<Integer> list = (List) m203363x3(new pcj() { // from class: l.hrt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f111384a.m203711q8();
            }
        }, jyb.m147507f0(3, 5, 8));
        return list.size() == 0 ? jyb.m147507f0(3, 5, 8) : list;
    }

    /* JADX INFO: renamed from: t5 */
    public String m203735t5(int i, boolean z) {
        BLiveConfig bLiveConfig;
        BLiveSettings bLiveSettingsM203370A3 = m203370A3();
        if (bLiveSettingsM203370A3 == null || (bLiveConfig = bLiveSettingsM203370A3.liveConfig) == null) {
            return this.f186168h.getString(R$string.f45010e0);
        }
        if (i == 1) {
            return z ? bLiveConfig.f45200pk.stopLiveMessages.random.playingStage : bLiveConfig.f45200pk.stopLiveMessages.random.punishingStage;
        }
        if (i == 3) {
            return z ? bLiveConfig.f45200pk.stopLiveMessages.bounty.playingStage : bLiveConfig.f45200pk.stopLiveMessages.bounty.punishingStage;
        }
        return z ? bLiveConfig.f45200pk.stopLiveMessages.specified.playingStage : bLiveConfig.f45200pk.stopLiveMessages.specified.punishingStage;
    }

    /* JADX INFO: renamed from: t6 */
    public boolean m203736t6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.swt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f171004a.m203560X9();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: t7 */
    public boolean m203737t7() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.cqt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f83115a.m203513Ra();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: t8 */
    public final /* synthetic */ String m203738t8() {
        return m203370A3().intlLiveConfig.liveSquareLeaderboardSchema;
    }

    /* JADX INFO: renamed from: t9 */
    public final /* synthetic */ Integer m203739t9() {
        int i = m203370A3().videoChatConfig.chat.dial.retryCount;
        if (i == 0) {
            i = 3;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: ta */
    public final /* synthetic */ Boolean m203740ta() {
        return Boolean.valueOf(m203370A3().liveConfig.smallWindow.show);
    }

    /* JADX INFO: renamed from: tb */
    public String m203741tb() {
        return (String) m203363x3(new pcj() { // from class: l.xqt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f195827a.m203617eb();
            }
        }, "");
    }

    /* JADX INFO: renamed from: u3 */
    public boolean m203742u3() {
        Map<String, String> map;
        BLiveSettings bLiveSettingsM203370A3 = m203370A3();
        return (bLiveSettingsM203370A3 == null || (map = bLiveSettingsM203370A3.expConfig) == null || !map.containsKey("liveClearScreenExp") || TextUtils.isEmpty(bLiveSettingsM203370A3.expConfig.get("liveClearScreenExp")) || !"live_rec_cleans:_test01".equals(bLiveSettingsM203370A3.expConfig.get("liveClearScreenExp"))) ? false : true;
    }

    /* JADX INFO: renamed from: u4 */
    public String m203743u4() {
        return (String) m203363x3(new pcj() { // from class: l.fut
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f100944a.m203720r8();
            }
        }, "");
    }

    /* JADX INFO: renamed from: u5 */
    public int m203744u5() {
        int iIntValue = ((Integer) m203363x3(new pcj() { // from class: l.rrt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f164615a.m203631g9();
            }
        }, 2000)).intValue();
        if (iIntValue <= 0) {
            return 2000;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: u6 */
    public boolean m203745u6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.svt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f170871a.m203568Y9();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: u7 */
    public boolean m203746u7() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.dut
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f90851a.m203521Sa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: u8 */
    public final /* synthetic */ String m203747u8() {
        return m203370A3().intlOctopusGameUrlPrefix;
    }

    /* JADX INFO: renamed from: u9 */
    public final /* synthetic */ Integer m203748u9() {
        int i = m203370A3().videoChatConfig.chat.dial.fetchInterval;
        if (i == 0) {
            i = 3;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: ua */
    public final /* synthetic */ Boolean m203749ua() {
        return Boolean.valueOf(m203370A3().liveConfig.giftConfig.enableDynamicUrl);
    }

    /* JADX INFO: renamed from: ub */
    public String m203750ub() {
        return (String) m203363x3(new pcj() { // from class: l.stt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f170605a.m203625fb();
            }
        }, "");
    }

    /* JADX INFO: renamed from: v3 */
    public boolean m203751v3() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.mpt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f137948a.m203382B7();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: v4 */
    public String m203752v4() {
        return (String) m203363x3(new pcj() { // from class: l.irt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f116601a.m203729s8();
            }
        }, "");
    }

    /* JADX INFO: renamed from: v5 */
    public BSuggestedTabAnimationItem m203753v5() {
        return (BSuggestedTabAnimationItem) m203363x3(new pcj() { // from class: l.evt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f96027a.m203639h9();
            }
        }, null);
    }

    /* JADX INFO: renamed from: v6 */
    public boolean m203754v6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.kqt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f128293a.m203576Z9();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: v7 */
    public boolean m203755v7() {
        BLiveVoiceLiveConfig bLiveVoiceLiveConfig;
        if (m203573Z6()) {
            return true;
        }
        BLiveSettings bLiveSettingsM203370A3 = m203370A3();
        if (bLiveSettingsM203370A3 == null || (bLiveVoiceLiveConfig = bLiveSettingsM203370A3.voiceLiveConfig) == null) {
            return false;
        }
        return !TextUtils.isEmpty(bLiveVoiceLiveConfig.voiceLiveActivityMomentTest);
    }

    /* JADX INFO: renamed from: v8 */
    public final /* synthetic */ Integer m203756v8() {
        return Integer.valueOf(m203370A3().voiceLiveConfig.intlShareConfig.maxSingleShareLimit);
    }

    /* JADX INFO: renamed from: v9 */
    public final /* synthetic */ Integer m203757v9() {
        int i = m203370A3().videoChatConfig.chat.dial.timeout;
        if (i == 0) {
            i = 15;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: va */
    public final /* synthetic */ Boolean m203758va() {
        return Boolean.valueOf(m203370A3().liveConfig.stealthPrivilege.hideLiveAvatar.f45198on);
    }

    /* JADX INFO: renamed from: w3 */
    public String m203759w3() {
        return (String) m203363x3(new pcj() { // from class: l.trt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f175946a.m203390C7();
            }
        }, this.f186168h.getString(R$string.f45042p));
    }

    /* JADX INFO: renamed from: w4 */
    public String m203760w4() {
        return (String) m203363x3(new pcj() { // from class: l.fvt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f101091a.m203738t8();
            }
        }, "");
    }

    /* JADX INFO: renamed from: w5 */
    public BSuggestedTabAnimationItem m203761w5() {
        return (BSuggestedTabAnimationItem) m203363x3(new pcj() { // from class: l.qwt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f159968a.m203647i9();
            }
        }, null);
    }

    /* JADX INFO: renamed from: w6 */
    public boolean m203762w6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.ost
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f148903a.m203584aa();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: w7 */
    public boolean m203763w7() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.mtt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f138666a.m203529Ta();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: w8 */
    public final /* synthetic */ BLiveIntlLiveTemplatesCdnData m203764w8() {
        return m203370A3().intlLiveTemplatesMetadata;
    }

    /* JADX INFO: renamed from: w9 */
    public final /* synthetic */ Integer m203765w9() {
        int i = m203370A3().videoChatConfig.chat.fakeCallTimeout;
        if (i == 0) {
            i = 15;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: wa */
    public final /* synthetic */ Boolean m203766wa() {
        return Boolean.valueOf(m203370A3().liveConfig.stealthPrivilege.hideConsumeRecord.f45198on);
    }

    /* JADX INFO: renamed from: x4 */
    public String m203767x4() {
        return (String) m203363x3(new pcj() { // from class: l.out
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f149209a.m203747u8();
            }
        }, "defaultx");
    }

    /* JADX INFO: renamed from: x5 */
    public BSuggestedTabAnimationItem m203768x5() {
        return (BSuggestedTabAnimationItem) m203363x3(new pcj() { // from class: l.wvt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f190988a.m203655j9();
            }
        }, null);
    }

    /* JADX INFO: renamed from: x6 */
    public boolean m203769x6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.vpt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f185302a.m203592ba();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: x7 */
    public final /* synthetic */ Integer m203770x7() {
        return Integer.valueOf(m203370A3().liveConfig.activitySummaryRegularUnread.interval);
    }

    /* JADX INFO: renamed from: x8 */
    public final /* synthetic */ String m203771x8() {
        return m203370A3().intlLiveConfig.voiceRoomLeaderboardSchema;
    }

    /* JADX INFO: renamed from: x9 */
    public final /* synthetic */ Integer m203772x9() {
        int i = m203370A3().videoChatConfig.chat.live.fetchInterval;
        if (i == 0) {
            i = 15;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: xa */
    public final /* synthetic */ Boolean m203773xa() {
        return Boolean.valueOf(m203370A3().voiceLiveConfig.isHideCreateRoomButton);
    }

    /* JADX INFO: renamed from: y3 */
    public long m203774y3() {
        return ((Integer) m203363x3(new pcj() { // from class: l.ytt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f201547a.m203398D7();
            }
        }, 60)).intValue();
    }

    /* JADX INFO: renamed from: y4 */
    public int m203775y4() {
        int iIntValue = ((Integer) m203363x3(new pcj() { // from class: l.yst
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f201459a.m203756v8();
            }
        }, 10)).intValue();
        if (iIntValue > 0) {
            return iIntValue;
        }
        return 10;
    }

    /* JADX INFO: renamed from: y5 */
    public List<BLiveSquareSubTab> m203776y5() {
        BLiveSquareTab bLiveSquareTab;
        BLiveSettings bLiveSettingsM203370A3 = m203370A3();
        if (bLiveSettingsM203370A3 == null || jyb.m147479J(bLiveSettingsM203370A3.liveSquareTabs) || (bLiveSquareTab = (BLiveSquareTab) jyb.m147529r(bLiveSettingsM203370A3.liveSquareTabs, new qcj() { // from class: l.qvt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveSquareTab) obj).name, "square-suggested"));
            }
        })) == null) {
            return null;
        }
        return bLiveSquareTab.subTabs;
    }

    /* JADX INFO: renamed from: y6 */
    public boolean m203777y6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.bst
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f78191a.m203600ca();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: y7 */
    public final /* synthetic */ String m203778y7() {
        return m203370A3().liveConfig.activitySummaryRegularUnread.text;
    }

    /* JADX INFO: renamed from: y8 */
    public final /* synthetic */ String m203779y8() {
        return m203370A3().intlLiveConfig.voiceSquareLeaderboardSchema;
    }

    /* JADX INFO: renamed from: y9 */
    public final /* synthetic */ BLiveVideoQuality m203780y9() {
        return m203370A3().liveConfig.videoQuality;
    }

    /* JADX INFO: renamed from: ya */
    public final /* synthetic */ Boolean m203781ya() {
        return Boolean.valueOf(m203370A3().intlLiveConfig.intlGameOperationControl.isHideIntlLiveSquareActivity);
    }

    /* JADX INFO: renamed from: z3 */
    public final BLiveSettings m203782z3() {
        if (super.m159277n() != null) {
            this.f186170j = null;
            return (BLiveSettings) super.m159277n();
        }
        if (this.f186170j == null) {
            this.f186170j = m159276m();
        }
        return this.f186170j;
    }

    /* JADX INFO: renamed from: z4 */
    public BLiveIntlLiveTemplatesCdnData m203783z4() {
        return (BLiveIntlLiveTemplatesCdnData) m203363x3(new pcj() { // from class: l.zrt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f205795a.m203764w8();
            }
        }, null);
    }

    /* JADX INFO: renamed from: z5 */
    public String m203784z5() {
        return (String) m203363x3(new pcj() { // from class: l.xut
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f196320a.m203663k9();
            }
        }, "");
    }

    /* JADX INFO: renamed from: z6 */
    public boolean m203785z6() {
        return ((Boolean) m203363x3(new pcj() { // from class: l.uut
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f181091a.m203608da();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: z7 */
    public final /* synthetic */ BLiveUnreadTypeEnum m203786z7() {
        return m203370A3().liveConfig.unreadType.activitySummaries;
    }

    /* JADX INFO: renamed from: z8 */
    public final /* synthetic */ Integer m203787z8() {
        return Integer.valueOf(m203370A3().liveConfig.activityOngoingAdditionCount);
    }

    /* JADX INFO: renamed from: z9 */
    public final /* synthetic */ Long m203788z9() {
        return m203370A3().liveConfig.vipReportGrade;
    }

    /* JADX INFO: renamed from: za */
    public final /* synthetic */ Boolean m203789za() {
        return Boolean.valueOf(m203370A3().intlLiveConfig.intlGameOperationControl.isHideIntlVoiceLiveSquareActivity);
    }
}
