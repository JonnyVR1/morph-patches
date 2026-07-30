package p149l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.Mobile;
import com.p046p1.mobile.putong.data.UserWealthGradeConfig;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.data.BLiveCallSetting;
import com.p046p1.mobile.putong.live.base.data.BLiveCallVideoCancelSetting;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveDefaultOpenParas;
import com.p046p1.mobile.putong.live.base.data.BLiveEntrance;
import com.p046p1.mobile.putong.live.base.data.BLiveEntranceList;
import com.p046p1.mobile.putong.live.base.data.BLiveFollowRateBubbleV2;
import com.p046p1.mobile.putong.live.base.data.BLiveFollowRateChatV2;
import com.p046p1.mobile.putong.live.base.data.BLiveFollowRateConfigV2;
import com.p046p1.mobile.putong.live.base.data.BLiveFollowRatePopupV2;
import com.p046p1.mobile.putong.live.base.data.BLiveInRoomSideBarEntrance;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlFlyMicEffectConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlLiveTemplatesCdnData;
import com.p046p1.mobile.putong.live.base.data.BLivePreDefineMessages;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveSkinConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveSmallWindow;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareSubTab;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p046p1.mobile.putong.live.base.data.BLiveStartBtnConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveTeenMode;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplate;
import com.p046p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceFeedStyle;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceLiveConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSparkReportConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveWealthLogoConfig;
import com.p046p1.mobile.putong.live.base.data.BQuitLiveStayConfig;
import com.p046p1.mobile.putong.live.base.data.BSuggestedTabAnimationItem;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class uut extends fgf0<BLiveSettings> {

    /* JADX INFO: renamed from: h */
    public Context f178418h;

    /* JADX INFO: renamed from: i */
    public String[] f178419i;

    /* JADX INFO: renamed from: j */
    public BLiveSettings f178420j;

    public uut(Context context, final e30<BLiveSettings> e30Var) {
        super("live_settings", new qiq(new qnd("live_settings_json", "_v2", uvr.m196095l()), -1, BLiveSettings.JSON_ADAPTER, new v9j() { // from class: l.jut
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return uut.m195526j2();
            }
        }), new v9j() { // from class: l.kut
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new ka20(new v9j() { // from class: l.qqt
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return qib0.f154693H.auth().m185898q(xh5.m208761i("/live-settings")).m185887f().m185883b();
                    }
                }, BLiveSettings.JSON_ADAPTER).doOnNext(new e30() { // from class: l.rqt
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        uut.m195494b2(e30Var, (BLiveSettings) obj);
                    }
                });
            }
        });
        this.f178419i = null;
        this.f178420j = null;
        this.f178418h = context;
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ Boolean m195425K0(BLiveSettings bLiveSettings) {
        BLiveVoiceLiveConfig bLiveVoiceLiveConfig = bLiveSettings.voiceLiveConfig;
        return bLiveVoiceLiveConfig == null ? Boolean.FALSE : Boolean.valueOf(bLiveVoiceLiveConfig.voiceActivityShowNumber);
    }

    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ void m195494b2(e30 e30Var, BLiveSettings bLiveSettings) {
        if (e30Var != null) {
            e30Var.call(bLiveSettings);
        }
    }

    /* JADX INFO: renamed from: j2 */
    public static /* synthetic */ BLiveSettings m195526j2() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x3 */
    public static <T> T m195576x3(v9j<T> v9jVar, T t) {
        try {
            T tCall = v9jVar.call();
            return ((tCall instanceof String) && TextUtils.isEmpty((String) tCall)) ? t : tCall;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: A3 */
    public BLiveSettings m195583A3() {
        return m195995z3();
    }

    /* JADX INFO: renamed from: A4 */
    public String m195584A4() {
        return (String) m195576x3(new v9j() { // from class: l.prt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f150946a.m195984x8();
            }
        }, "");
    }

    /* JADX INFO: renamed from: A5 */
    public int m195585A5() {
        return ((Integer) m195576x3(new v9j() { // from class: l.aot
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f70937a.m195884l9();
            }
        }, 20)).intValue();
    }

    /* JADX INFO: renamed from: A6 */
    public boolean m195586A6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.mst
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f135533a.m195829ea();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: A7 */
    public final /* synthetic */ String m195587A7() {
        return m195583A3().liveConfig.recallFansLimitToast;
    }

    /* JADX INFO: renamed from: A8 */
    public final /* synthetic */ BLiveCommonViewConfig m195588A8() {
        return m195583A3().liveConfig.anchorsSearch;
    }

    /* JADX INFO: renamed from: A9 */
    public final /* synthetic */ List m195589A9() {
        return m195583A3().voiceLiveTemplates.virtualAvatar;
    }

    /* JADX INFO: renamed from: Aa */
    public final /* synthetic */ Boolean m195590Aa() {
        return Boolean.valueOf(m195583A3().liveConfig.stealthPrivilege.hiddenAnchorHierarchy.f44350on);
    }

    /* JADX INFO: renamed from: B3 */
    public final BLiveCommonViewConfig m195591B3() {
        BLiveCommonViewConfig bLiveCommonViewConfigNew_ = BLiveCommonViewConfig.new_();
        bLiveCommonViewConfigNew_.icon = "https://auto.tancdn.com/v1/raw/2c753031-2776-4b1b-baac-5ed87aacb98610.png";
        bLiveCommonViewConfigNew_.text = "退出房间";
        bLiveCommonViewConfigNew_.type = "exit";
        return bLiveCommonViewConfigNew_;
    }

    /* JADX INFO: renamed from: B4 */
    public String m195592B4() {
        return (String) m195576x3(new v9j() { // from class: l.xst
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f194304a.m195992y8();
            }
        }, "");
    }

    /* JADX INFO: renamed from: B5 */
    public boolean m195593B5() {
        if (m195583A3() != null && m195583A3().intlLiveConfig != null) {
            return false;
        }
        String[] strArrM195856i5 = m195856i5();
        if (strArrM195856i5.length == 0) {
            return false;
        }
        LiveRegionTag liveRegionTag = qib0.f154719h0;
        String string = liveRegionTag != null ? liveRegionTag.toString() : null;
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        for (String str : strArrM195856i5) {
            if (TextUtils.equals(string, str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: B6 */
    public boolean m195594B6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.kpt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f124190a.m195837fa();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: B7 */
    public final /* synthetic */ Boolean m195595B7() {
        return Boolean.valueOf(m195583A3().tttLiveConfig.canSwitchAccount);
    }

    /* JADX INFO: renamed from: B8 */
    public final /* synthetic */ BLiveSkinConfig m195596B8() {
        return m195583A3().liveSkinConfig;
    }

    /* JADX INFO: renamed from: B9 */
    public final /* synthetic */ Boolean m195597B9() {
        return Boolean.valueOf(m195583A3().voiceLiveConfig.virtualAvatarSwitch);
    }

    /* JADX INFO: renamed from: Ba */
    public final /* synthetic */ Boolean m195598Ba() {
        return Boolean.valueOf(m195583A3().liveConfig.stealthPrivilege.hideLocation.f44350on);
    }

    /* JADX INFO: renamed from: C3 */
    public boolean m195599C3() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.yst
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f199825a.m195619E7();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: C4 */
    public int m195600C4() {
        return ((Integer) m195576x3(new v9j() { // from class: l.qtt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f156394a.m196000z8();
            }
        }, 0)).intValue();
    }

    /* JADX INFO: renamed from: C5 */
    public BLiveTeenMode m195601C5() {
        return (BLiveTeenMode) m195576x3(new v9j() { // from class: l.iqt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f114549a.m195892m9();
            }
        }, null);
    }

    /* JADX INFO: renamed from: C6 */
    public boolean m195602C6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.att
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f71674a.m195845ga();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: C7 */
    public final /* synthetic */ String m195603C7() {
        return m195583A3().liveConfig.cardOnLiveText;
    }

    /* JADX INFO: renamed from: C8 */
    public final /* synthetic */ String m195604C8() {
        return m195583A3().liveConfig.entertainmentTabText;
    }

    /* JADX INFO: renamed from: C9 */
    public final /* synthetic */ Boolean m195605C9() {
        return Boolean.valueOf(m195583A3().voiceLiveConfig.voiceActivityShowNumber);
    }

    /* JADX INFO: renamed from: Ca */
    public final /* synthetic */ Boolean m195606Ca() {
        return Boolean.valueOf(m195583A3().liveConfig.leaderboardCollection.f44350on);
    }

    /* JADX INFO: renamed from: D3 */
    public boolean m195607D3() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.zrt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f204546a.m195627F7();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    @Nullable
    /* JADX INFO: renamed from: D4 */
    public final BLiveCommonViewConfig m195608D4() {
        return (BLiveCommonViewConfig) m195576x3(new v9j() { // from class: l.trt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f171845a.m195588A8();
            }
        }, null);
    }

    /* JADX INFO: renamed from: D5 */
    public long m195609D5() {
        return ((Integer) m195576x3(new v9j() { // from class: l.ynt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f199218a.m195900n9();
            }
        }, 5120)).intValue();
    }

    /* JADX INFO: renamed from: D6 */
    public boolean m195610D6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.uqt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f177775a.m195853ha();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: D7 */
    public final /* synthetic */ Integer m195611D7() {
        return Integer.valueOf(m195583A3().liveConfig.discover.counterRefreshInterval);
    }

    /* JADX INFO: renamed from: D8 */
    public final /* synthetic */ Integer m195612D8() {
        return Integer.valueOf(m195583A3().liveConfig.followSetting.frequency);
    }

    /* JADX INFO: renamed from: D9 */
    public final /* synthetic */ Boolean m195613D9() {
        return Boolean.valueOf(m195583A3().voiceLiveConfig.smallWindow.anchor.openWhenSlideRight);
    }

    /* JADX INFO: renamed from: Da */
    public final /* synthetic */ Boolean m195614Da() {
        return Boolean.valueOf(m195583A3().resourceConfig.loadingExpDisable);
    }

    /* JADX INFO: renamed from: E3 */
    public boolean m195615E3() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.eut
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f93273a.m195635G7();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    @Nullable
    /* JADX INFO: renamed from: E4 */
    public BLiveEntrance m195616E4(@Nullable String str) {
        BLiveConfig bLiveConfig;
        BLiveInRoomSideBarEntrance bLiveInRoomSideBarEntrance;
        BLiveEntranceList bLiveEntranceList;
        BLiveSettings bLiveSettingsM195583A3 = m195583A3();
        if (TextUtils.isEmpty(str) || bLiveSettingsM195583A3 == null || (bLiveConfig = bLiveSettingsM195583A3.liveConfig) == null || (bLiveInRoomSideBarEntrance = bLiveConfig.inRoomSideBarEntrance) == null || (bLiveEntranceList = bLiveInRoomSideBarEntrance.entrances) == null || bLiveEntranceList.keyList.isEmpty()) {
            return null;
        }
        BLiveEntrance liveEntrance = bLiveEntranceList.getLiveEntrance(str);
        return liveEntrance != null ? liveEntrance : bLiveEntranceList.getLiveEntrance("default");
    }

    /* JADX INFO: renamed from: E5 */
    public long m195617E5() {
        return ((Integer) m195576x3(new v9j() { // from class: l.zot
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f204156a.m195908o9();
            }
        }, 21600000)).intValue();
    }

    /* JADX INFO: renamed from: E6 */
    public boolean m195618E6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.sqt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f166020a.m195861ia();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: E7 */
    public final /* synthetic */ Boolean m195619E7() {
        return Boolean.valueOf(m195583A3().liveConfig.enableFriendsLiveStartEntrance);
    }

    /* JADX INFO: renamed from: E8 */
    public final /* synthetic */ List m195620E8() {
        return m195583A3().liveConfig.managerRights;
    }

    /* JADX INFO: renamed from: E9 */
    public final /* synthetic */ Boolean m195621E9() {
        return Boolean.valueOf(m195583A3().voiceLiveConfig.smallWindow.audience.openWhenSlideRight);
    }

    /* JADX INFO: renamed from: Ea */
    public final /* synthetic */ Boolean m195622Ea() {
        return Boolean.valueOf(m195583A3().liveConfig.isMagicGestureOpened);
    }

    /* JADX INFO: renamed from: F3 */
    public boolean m195623F3() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.tnt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f171279a.m195643H7();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    @Nullable
    /* JADX INFO: renamed from: F4 */
    public BLiveSkinConfig m195624F4() {
        return (BLiveSkinConfig) m195576x3(new v9j() { // from class: l.rpt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f160561a.m195596B8();
            }
        }, null);
    }

    /* JADX INFO: renamed from: F5 */
    public long m195625F5() {
        BLiveDefaultOpenParas bLiveDefaultOpenParas;
        BLiveInRoomSideBarEntrance bLiveInRoomSideBarEntranceM195904o5 = m195904o5();
        if (bLiveInRoomSideBarEntranceM195904o5 == null || (bLiveDefaultOpenParas = bLiveInRoomSideBarEntranceM195904o5.defaultOpenParas) == null) {
            return 10L;
        }
        long j = bLiveDefaultOpenParas.effectiveWatchMinSeconds;
        if (j <= 0) {
            return 10L;
        }
        return j;
    }

    /* JADX INFO: renamed from: F6 */
    public boolean m195626F6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.gut
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f104464a.m195869ja();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: F7 */
    public final /* synthetic */ Boolean m195627F7() {
        return Boolean.valueOf(m195583A3().liveConfig.multiCallConfig.multiCallVoiceEnable);
    }

    /* JADX INFO: renamed from: F8 */
    public final /* synthetic */ Integer m195628F8() {
        return Integer.valueOf(m195583A3().liveConfig.roomSlide.maxShowTimes);
    }

    /* JADX INFO: renamed from: F9 */
    public final /* synthetic */ List m195629F9() {
        return m195583A3().voiceLiveConfig.audienceOperateMenu;
    }

    /* JADX INFO: renamed from: Fa */
    public final /* synthetic */ Boolean m195630Fa() {
        return Boolean.valueOf(m195583A3().liveConfig.showDebugInfo);
    }

    /* JADX INFO: renamed from: G3 */
    public boolean m195631G3() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.nrt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f140219a.m195651I7();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: G4 */
    public String m195632G4() {
        return (String) m195576x3(new v9j() { // from class: l.ist
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f114799a.m195604C8();
            }
        }, vdt.m198093c() ? "" : w8u.m202217t(R$string.f44095B));
    }

    /* JADX INFO: renamed from: G5 */
    public String m195633G5() {
        return (String) m195576x3(new v9j() { // from class: l.ytt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f200017a.m195916p9();
            }
        }, "");
    }

    /* JADX INFO: renamed from: G6 */
    public boolean m195634G6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.jqt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f119324a.m195877ka();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: G7 */
    public final /* synthetic */ Boolean m195635G7() {
        return Boolean.valueOf(m195583A3().liveConfig.teenMode.f44454on);
    }

    /* JADX INFO: renamed from: G8 */
    public final /* synthetic */ Integer m195636G8() {
        return Integer.valueOf(m195583A3().liveConfig.memberListMax);
    }

    /* JADX INFO: renamed from: G9 */
    public final /* synthetic */ Boolean m195637G9() {
        return Boolean.valueOf(m195583A3().voiceLiveConfig.smallWindow.caller.openWhenSlideRight);
    }

    /* JADX INFO: renamed from: Ga */
    public final /* synthetic */ Boolean m195638Ga() {
        return Boolean.valueOf(m195583A3().liveConfig.nobleConfig.isOpen);
    }

    /* JADX INFO: renamed from: H3 */
    public boolean m195639H3() {
        if (vdt.m198092b(2)) {
            return false;
        }
        return ((Boolean) m195576x3(new v9j() { // from class: l.fqt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f98842a.m195659J7();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: H4 */
    public int m195640H4() {
        return ((Integer) m195576x3(new v9j() { // from class: l.oqt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f145192a.m195612D8();
            }
        }, 3)).intValue();
    }

    /* JADX INFO: renamed from: H5 */
    public boolean m195641H5() {
        BLiveConfig bLiveConfig;
        BLiveSettings bLiveSettingsM195583A3 = m195583A3();
        if (bLiveSettingsM195583A3 == null || (bLiveConfig = bLiveSettingsM195583A3.liveConfig) == null) {
            return true;
        }
        return TextUtils.equals("user", bLiveConfig.verificationConfig.createAnchorInterfaceType);
    }

    /* JADX INFO: renamed from: H6 */
    public boolean m195642H6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.urt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f177878a.m195885la();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: H7 */
    public final /* synthetic */ Boolean m195643H7() {
        return Boolean.valueOf(m195583A3().voiceLiveConfig.quickGiftConfig.longPressOn);
    }

    /* JADX INFO: renamed from: H8 */
    public final /* synthetic */ List m195644H8() {
        return m195583A3().templates;
    }

    /* JADX INFO: renamed from: H9 */
    public final /* synthetic */ String m195645H9() {
        return m195583A3().voiceLiveConfig.voiceGiftWallConfig.h5HelpUrl;
    }

    /* JADX INFO: renamed from: Ha */
    public final /* synthetic */ Boolean m195646Ha() {
        return Boolean.valueOf(m195583A3().liveConfig.bulletCommentConfig.f44350on);
    }

    /* JADX INFO: renamed from: I3 */
    public long m195647I3() {
        int iIntValue = ((Integer) m195576x3(new v9j() { // from class: l.hqt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f109103a.m195667K7();
            }
        }, 5)).intValue();
        if (iIntValue <= 0) {
            return 5L;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: I4 */
    public List<Integer> m195648I4() {
        return (List) m195576x3(new v9j() { // from class: l.eot
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f92494a.m195620E8();
            }
        }, null);
    }

    /* JADX INFO: renamed from: I5 */
    public int m195649I5() {
        return ((Integer) m195576x3(new v9j() { // from class: l.lut
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f130088a.m195925q9();
            }
        }, 1)).intValue();
    }

    /* JADX INFO: renamed from: I6 */
    public boolean m195650I6() {
        BLiveSettings bLiveSettingsM195583A3 = m195583A3();
        return (bLiveSettingsM195583A3 == null || bLiveSettingsM195583A3.voiceLiveConfig == null || vwb.m200296J(bLiveSettingsM195583A3.liveSquareTabs) || bLiveSettingsM195583A3.liveSquareTabs.size() != 1 || !bLiveSettingsM195583A3.liveSquareTabs.get(0).showNearby) ? false : true;
    }

    /* JADX INFO: renamed from: I7 */
    public final /* synthetic */ Boolean m195651I7() {
        return Boolean.valueOf(m195583A3().voiceLiveConfig.ownerCreateRoomNotify.showEveryTimes);
    }

    /* JADX INFO: renamed from: I8 */
    public final /* synthetic */ Integer m195652I8() {
        return Integer.valueOf(m195583A3().liveConfig.liveStreamEventConfig.minReportBufferingTimeDuration);
    }

    /* JADX INFO: renamed from: I9 */
    public final /* synthetic */ Integer m195653I9() {
        return Integer.valueOf(m195583A3().voiceLiveConfig.roomPopRefresh.leaderboardRefreshInterval);
    }

    /* JADX INFO: renamed from: Ia */
    public final /* synthetic */ Boolean m195654Ia() {
        return Boolean.valueOf(m195583A3().voiceLiveConfig.isOverseaChineseMigrated);
    }

    /* JADX INFO: renamed from: J3 */
    public BLiveFollowRateBubbleV2 m195655J3() {
        return (BLiveFollowRateBubbleV2) m195576x3(new v9j() { // from class: l.wqt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f187729a.m195675L7();
            }
        }, BLiveFollowRateConfigV2.new_().bubble);
    }

    /* JADX INFO: renamed from: J4 */
    public int m195656J4() {
        return ((Integer) m195576x3(new v9j() { // from class: l.not
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f139874a.m195628F8();
            }
        }, 3)).intValue();
    }

    /* JADX INFO: renamed from: J5 */
    public int m195657J5() {
        return ((Integer) m195576x3(new v9j() { // from class: l.ztt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f204755a.m195934r9();
            }
        }, 1)).intValue();
    }

    /* JADX INFO: renamed from: J6 */
    public boolean m195658J6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.pot
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f150561a.m195893ma();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: J7 */
    public final /* synthetic */ Boolean m195659J7() {
        return Boolean.valueOf(m195583A3().liveConfig.fanbase.hiddenRedPacket);
    }

    /* JADX INFO: renamed from: J8 */
    public final /* synthetic */ Long m195660J8() {
        return Long.valueOf(m195583A3().liveConfig.chat.limitation.minSendIntervalMillSeconds);
    }

    /* JADX INFO: renamed from: J9 */
    public final /* synthetic */ BLiveVoiceFeedStyle m195661J9() {
        return m195583A3().voiceLiveConfig.feedStyle;
    }

    /* JADX INFO: renamed from: Ja */
    public final /* synthetic */ Boolean m195662Ja() {
        return Boolean.valueOf(m195583A3().voiceLiveConfig.reflectAudioProcessSwitch);
    }

    /* JADX INFO: renamed from: K3 */
    public BLiveFollowRateChatV2 m195663K3() {
        return (BLiveFollowRateChatV2) m195576x3(new v9j() { // from class: l.brt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f76940a.m195683M7();
            }
        }, BLiveFollowRateConfigV2.new_().chat);
    }

    /* JADX INFO: renamed from: K4 */
    public int m195664K4() {
        return ((Integer) m195576x3(new v9j() { // from class: l.ipt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f114347a.m195636G8();
            }
        }, 100)).intValue();
    }

    /* JADX INFO: renamed from: K5 */
    public int m195665K5() {
        return ((Integer) m195576x3(new v9j() { // from class: l.xpt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f193955a.m195943s9();
            }
        }, 3)).intValue();
    }

    /* JADX INFO: renamed from: K6 */
    public boolean m195666K6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.art
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f71343a.m195901na();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: K7 */
    public final /* synthetic */ Integer m195667K7() {
        return Integer.valueOf(m195583A3().liveConfig.followRateConfigV2.afterGiveGift);
    }

    /* JADX INFO: renamed from: K8 */
    public final /* synthetic */ String m195668K8() {
        return m195583A3().liveConfig.license.appId;
    }

    /* JADX INFO: renamed from: K9 */
    public final /* synthetic */ Integer m195669K9() {
        return Integer.valueOf(m195583A3().voiceLiveConfig.memberListRefreshInterval);
    }

    /* JADX INFO: renamed from: Ka */
    public final /* synthetic */ Boolean m195670Ka() {
        return Boolean.valueOf(m195583A3().liveConfig.bulletCommentConfig.postConfirmingTextOn);
    }

    /* JADX INFO: renamed from: L3 */
    public int m195671L3() {
        return ((Integer) m195576x3(new v9j() { // from class: l.out
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f145728a.m195691N7();
            }
        }, 5)).intValue();
    }

    /* JADX INFO: renamed from: L4 */
    public List<BLiveTemplate> m195672L4() {
        return (List) m195576x3(new v9j() { // from class: l.lst
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f129894a.m195644H8();
            }
        }, null);
    }

    /* JADX INFO: renamed from: L5 */
    public int m195673L5() {
        return ((Integer) m195576x3(new v9j() { // from class: l.jpt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f119224a.m195952t9();
            }
        }, 3)).intValue();
    }

    /* JADX INFO: renamed from: L6 */
    public boolean m195674L6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.ott
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f145624a.m195909oa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: L7 */
    public final /* synthetic */ BLiveFollowRateBubbleV2 m195675L7() {
        return m195583A3().liveConfig.followRateConfigV2.bubble;
    }

    /* JADX INFO: renamed from: L8 */
    public final /* synthetic */ BLiveCommonConfig m195676L8() {
        return m195583A3().liveConfig.multiCallConfig.upgradeStartModePopUp;
    }

    /* JADX INFO: renamed from: L9 */
    public final /* synthetic */ Boolean m195677L9() {
        return Boolean.valueOf(m195583A3().voiceLiveConfig.showAnnouncementEntrance);
    }

    /* JADX INFO: renamed from: La */
    public final /* synthetic */ String m195678La() {
        return m195583A3().voiceLiveConfig.auctionTrickBubble;
    }

    /* JADX INFO: renamed from: M3 */
    public BLiveFollowRateConfigV2 m195679M3() {
        return (BLiveFollowRateConfigV2) m195576x3(new v9j() { // from class: l.vqt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f182675a.m195699O7();
            }
        }, BLiveFollowRateConfigV2.new_());
    }

    /* JADX INFO: renamed from: M4 */
    public int m195680M4() {
        int iIntValue = ((Integer) m195576x3(new v9j() { // from class: l.vot
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f182423a.m195652I8();
            }
        }, 100)).intValue();
        if (iIntValue <= 0) {
            return 100;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: M5 */
    public int m195681M5() {
        return ((Integer) m195576x3(new v9j() { // from class: l.ast
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f71478a.m195961u9();
            }
        }, 3)).intValue();
    }

    /* JADX INFO: renamed from: M6 */
    public boolean m195682M6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.yrt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f199702a.m195917pa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: M7 */
    public final /* synthetic */ BLiveFollowRateChatV2 m195683M7() {
        return m195583A3().liveConfig.followRateConfigV2.chat;
    }

    /* JADX INFO: renamed from: M8 */
    public final /* synthetic */ String m195684M8() {
        return m195583A3().liveConfig.profileConfig.settingButton.text;
    }

    /* JADX INFO: renamed from: M9 */
    public final /* synthetic */ List m195685M9() {
        return m195583A3().voiceLiveConfig.operateMenu;
    }

    /* JADX INFO: renamed from: Ma */
    public final /* synthetic */ Boolean m195686Ma() {
        return Boolean.valueOf(m195583A3().voiceLiveConfig.voiceRecordConfig.isShowHeartbeatReward);
    }

    /* JADX INFO: renamed from: N3 */
    public boolean m195687N3() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.jrt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f119440a.m195707P7();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: N4 */
    public long m195688N4() {
        return ((Long) m195576x3(new v9j() { // from class: l.ust
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f178196a.m195660J8();
            }
        }, 500L)).longValue();
    }

    /* JADX INFO: renamed from: N5 */
    public int m195689N5() {
        return ((Integer) m195576x3(new v9j() { // from class: l.dqt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f87499a.m195970v9();
            }
        }, 15)).intValue();
    }

    /* JADX INFO: renamed from: N6 */
    public boolean m195690N6() {
        if (vdt.m198092b(2)) {
            return ((Boolean) m195576x3(new v9j() { // from class: l.mrt
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f135411a.m195926qa();
                }
            }, Boolean.FALSE)).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: N7 */
    public final /* synthetic */ Integer m195691N7() {
        return Integer.valueOf(m195583A3().liveConfig.followRateConfigV2.chat.minEventInterval);
    }

    /* JADX INFO: renamed from: N8 */
    public final /* synthetic */ String m195692N8() {
        return m195583A3().liveConfig.profileConfig.userRoomText;
    }

    /* JADX INFO: renamed from: N9 */
    public final /* synthetic */ Integer m195693N9() {
        return Integer.valueOf(m195583A3().voiceLiveConfig.roomPopRefresh.roomAmountRefreshInterval);
    }

    /* JADX INFO: renamed from: Na */
    public final /* synthetic */ Boolean m195694Na() {
        return Boolean.valueOf(m195583A3().voiceLiveConfig.showPledgeAuctionNewTag);
    }

    /* JADX INFO: renamed from: O3 */
    public BLiveFollowRatePopupV2 m195695O3() {
        return (BLiveFollowRatePopupV2) m195576x3(new v9j() { // from class: l.zqt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f204416a.m195715Q7();
            }
        }, BLiveFollowRateConfigV2.new_().popup);
    }

    /* JADX INFO: renamed from: O4 */
    public String m195696O4() {
        return (String) m195576x3(new v9j() { // from class: l.wrt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f187830a.m195668K8();
            }
        }, "tantan");
    }

    /* JADX INFO: renamed from: O5 */
    public int m195697O5() {
        return ((Integer) m195576x3(new v9j() { // from class: l.ept
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f92710a.m195978w9();
            }
        }, 15)).intValue();
    }

    /* JADX INFO: renamed from: O6 */
    public boolean m195698O6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.utt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f178289a.m195935ra();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: O7 */
    public final /* synthetic */ BLiveFollowRateConfigV2 m195699O7() {
        return m195583A3().liveConfig.followRateConfigV2;
    }

    /* JADX INFO: renamed from: O8 */
    public final /* synthetic */ Boolean m195700O8() {
        return Boolean.valueOf(m195583A3().liveConfig.f44352pk.firstGiftOn);
    }

    /* JADX INFO: renamed from: O9 */
    public final /* synthetic */ Boolean m195701O9() {
        return Boolean.valueOf(m195583A3().voiceLiveConfig.bindChatGroupPermission);
    }

    /* JADX INFO: renamed from: Oa */
    public final /* synthetic */ Boolean m195702Oa() {
        return Boolean.valueOf(m195583A3().voiceLiveConfig.showRoomRegion);
    }

    /* JADX INFO: renamed from: P3 */
    public int m195703P3() {
        return ((Integer) m195576x3(new v9j() { // from class: l.kst
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f124505a.m195723R7();
            }
        }, 2)).intValue();
    }

    @Nullable
    /* JADX INFO: renamed from: P4 */
    public BLiveCommonConfig m195704P4() {
        return (BLiveCommonConfig) m195576x3(new v9j() { // from class: l.fnt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f98472a.m195676L8();
            }
        }, null);
    }

    /* JADX INFO: renamed from: P5 */
    public int m195705P5() {
        return ((Integer) m195576x3(new v9j() { // from class: l.mtt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f135695a.m195985x9();
            }
        }, 15)).intValue();
    }

    /* JADX INFO: renamed from: P6 */
    public boolean m195706P6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.dpt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f87320a.m195944sa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: P7 */
    public final /* synthetic */ Boolean m195707P7() {
        return Boolean.valueOf(m195583A3().liveConfig.followRateConfigV2.f44370on);
    }

    /* JADX INFO: renamed from: P8 */
    public final /* synthetic */ String m195708P8() {
        return m195583A3().liveConfig.f44352pk.firstGiftToast;
    }

    /* JADX INFO: renamed from: P9 */
    public final /* synthetic */ BLiveVoiceSparkReportConfig m195709P9() {
        return m195583A3().voiceLiveConfig.voiceLiveSparkletReportConfig;
    }

    /* JADX INFO: renamed from: Pa */
    public final /* synthetic */ Boolean m195710Pa() {
        return Boolean.valueOf(m195583A3().voiceLiveConfig.voiceLeaderboard.hourLeaderboardOpen);
    }

    /* JADX INFO: renamed from: Q3 */
    public long m195711Q3() {
        long jLongValue = ((Long) m195576x3(new v9j() { // from class: l.kqt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f124291a.m195731S7();
            }
        }, 60L)).longValue();
        if (jLongValue <= 0) {
            return 60L;
        }
        return jLongValue;
    }

    /* JADX INFO: renamed from: Q4 */
    public String m195712Q4() {
        return (String) m195576x3(new v9j() { // from class: l.gqt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f103980a.m195684M8();
            }
        }, this.f178418h.getString(R$string.f44183l0));
    }

    /* JADX INFO: renamed from: Q5 */
    public BLiveVideoQuality m195713Q5() {
        return (BLiveVideoQuality) m195576x3(new v9j() { // from class: l.dot
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f87197a.m195993y9();
            }
        }, null);
    }

    /* JADX INFO: renamed from: Q6 */
    public boolean m195714Q6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.rst
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f160893a.m195953ta();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: Q7 */
    public final /* synthetic */ BLiveFollowRatePopupV2 m195715Q7() {
        return m195583A3().liveConfig.followRateConfigV2.popup;
    }

    /* JADX INFO: renamed from: Q8 */
    public final /* synthetic */ Integer m195716Q8() {
        return Integer.valueOf(m195583A3().liveConfig.f44352pk.winTimesTag.showTagBeforeEnd);
    }

    /* JADX INFO: renamed from: Q9 */
    public final /* synthetic */ BLiveVoiceCpConfig m195717Q9() {
        return m195583A3().voiceLiveConfig.intlVoiceCpConfig;
    }

    /* JADX INFO: renamed from: Qa */
    public final /* synthetic */ Boolean m195718Qa() {
        return Boolean.valueOf(m195583A3().liveConfig.userStatusInfo.isSidebarNewUser);
    }

    /* JADX INFO: renamed from: R3 */
    public String m195719R3() {
        return (String) m195576x3(new v9j() { // from class: l.mnt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f134791a.m195739T7();
            }
        }, w8u.m202217t(R$string.f44197q));
    }

    /* JADX INFO: renamed from: R4 */
    public String m195720R4() {
        return (String) m195576x3(new v9j() { // from class: l.qnt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f155492a.m195692N8();
            }
        }, this.f178418h.getString(R$string.f44180k0));
    }

    /* JADX INFO: renamed from: R5 */
    public long m195721R5() {
        return ((Long) m195576x3(new v9j() { // from class: l.iut
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f115051a.m196001z9();
            }
        }, 24L)).longValue();
    }

    /* JADX INFO: renamed from: R6 */
    public boolean m195722R6() {
        if (vdt.m198092b(2)) {
            return ((Boolean) m195576x3(new v9j() { // from class: l.ftt
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f99261a.m195962ua();
                }
            }, Boolean.FALSE)).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: R7 */
    public final /* synthetic */ Integer m195723R7() {
        return Integer.valueOf(m195583A3().liveConfig.roomSlide.animationInterval);
    }

    /* JADX INFO: renamed from: R8 */
    public final /* synthetic */ Boolean m195724R8() {
        return Boolean.valueOf(m195583A3().liveConfig.f44352pk.winTimesTag.f44350on);
    }

    /* JADX INFO: renamed from: R9 */
    public final /* synthetic */ String m195725R9() {
        return m195583A3().voiceLiveConfig.verificationLevel;
    }

    /* JADX INFO: renamed from: Ra */
    public final /* synthetic */ Boolean m195726Ra() {
        return Boolean.valueOf(m195583A3().liveConfig.signInConfig.f44350on);
    }

    /* JADX INFO: renamed from: S3 */
    public int m195727S3() {
        return ((Integer) m195576x3(new v9j() { // from class: l.knt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f123911a.m195747U7();
            }
        }, 15)).intValue();
    }

    /* JADX INFO: renamed from: S4 */
    public boolean m195728S4() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.eqt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f92843a.m195700O8();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: S5 */
    public List<BLiveTemplate> m195729S5() {
        return (List) m195576x3(new v9j() { // from class: l.rnt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f160314a.m195589A9();
            }
        }, null);
    }

    /* JADX INFO: renamed from: S6 */
    public boolean m195730S6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.wpt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f187577a.m195971va();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: S7 */
    public final /* synthetic */ Long m195731S7() {
        return Long.valueOf(m195583A3().liveConfig.liveBreakingLeaderboardConfig.duration);
    }

    /* JADX INFO: renamed from: S8 */
    public final /* synthetic */ Integer m195732S8() {
        return Integer.valueOf(m195583A3().liveConfig.pullStreamConfig.retryCountDown);
    }

    /* JADX INFO: renamed from: S9 */
    public final /* synthetic */ Boolean m195733S9() {
        return Boolean.valueOf(m195583A3().liveConfig.followGuide.alsoFollow.show);
    }

    /* JADX INFO: renamed from: Sa */
    public final /* synthetic */ Boolean m195734Sa() {
        return Boolean.valueOf(m195583A3().liveConfig.liveHierarchy.isOpen);
    }

    /* JADX INFO: renamed from: T3 */
    public BLiveCallSetting m195735T3() {
        BLiveConfig bLiveConfig;
        BLiveCallSetting bLiveCallSetting;
        BLiveSettings bLiveSettingsM195583A3 = m195583A3();
        if (bLiveSettingsM195583A3 != null && (bLiveConfig = bLiveSettingsM195583A3.liveConfig) != null && (bLiveCallSetting = bLiveConfig.call) != null) {
            return bLiveCallSetting;
        }
        BLiveCallSetting bLiveCallSettingNew_ = BLiveCallSetting.new_();
        bLiveCallSettingNew_.callGiftButtonDisplay = true;
        bLiveCallSettingNew_.callSettingButtonText = this.f178418h.getString(R$string.f44200r);
        bLiveCallSettingNew_.callAnnouncementUrl = ddv.f85646R;
        BLiveCallVideoCancelSetting bLiveCallVideoCancelSettingNew_ = BLiveCallVideoCancelSetting.new_();
        bLiveCallVideoCancelSettingNew_.title = this.f178418h.getString(R$string.f44206t);
        bLiveCallVideoCancelSettingNew_.interval = 60;
        bLiveCallSettingNew_.videoCancel = bLiveCallVideoCancelSettingNew_;
        return bLiveCallSettingNew_;
    }

    /* JADX INFO: renamed from: T4 */
    public String m195736T4() {
        return (String) m195576x3(new v9j() { // from class: l.vrt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f182746a.m195708P8();
            }
        }, w8u.m202217t(R$string.f44165f0));
    }

    /* JADX INFO: renamed from: T5 */
    public boolean m195737T5() {
        if (vdt.m198092b(3)) {
            return ((Boolean) m195576x3(new v9j() { // from class: l.tot
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f171408a.m195597B9();
                }
            }, Boolean.TRUE)).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: T6 */
    public boolean m195738T6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.ntt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f140531a.m195979wa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: T7 */
    public final /* synthetic */ String m195739T7() {
        return m195583A3().liveConfig.nobleConfig.shoutingChatConfig.title;
    }

    /* JADX INFO: renamed from: T8 */
    public final /* synthetic */ Integer m195740T8() {
        return Integer.valueOf(m195583A3().liveConfig.pullStreamConfig.pullFailedLimit);
    }

    /* JADX INFO: renamed from: T9 */
    public final /* synthetic */ Boolean m195741T9() {
        return Boolean.valueOf(m195583A3().chatTips.f44350on);
    }

    /* JADX INFO: renamed from: Ta */
    public final /* synthetic */ Boolean m195742Ta() {
        return Boolean.valueOf(m195583A3().voiceLiveConfig.intlEnterRoomOptimize && !vdt.m198092b(3));
    }

    /* JADX INFO: renamed from: U3 */
    public int m195743U3() {
        int iIntValue = ((Integer) m195576x3(new v9j() { // from class: l.gtt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f104350a.m195755V7();
            }
        }, 4)).intValue();
        if (iIntValue <= 0) {
            return 4;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: U4 */
    public long m195744U4() {
        return ((Integer) m195576x3(new v9j() { // from class: l.vnt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f182276a.m195716Q8();
            }
        }, 30)).intValue();
    }

    /* JADX INFO: renamed from: U5 */
    public int m195745U5() {
        BLiveVoiceLiveConfig bLiveVoiceLiveConfig;
        BLiveSettings bLiveSettingsM195583A3 = m195583A3();
        if (bLiveSettingsM195583A3 == null || (bLiveVoiceLiveConfig = bLiveSettingsM195583A3.voiceLiveConfig) == null) {
            return 1;
        }
        return Math.max(bLiveVoiceLiveConfig.fixRoomManagerLimit, 1);
    }

    /* JADX INFO: renamed from: U6 */
    public boolean m195746U6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.hot
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f108853a.m195986xa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: U7 */
    public final /* synthetic */ Integer m195747U7() {
        return Integer.valueOf(m195583A3().liveConfig.nobleConfig.shoutingChatConfig.textLimit);
    }

    /* JADX INFO: renamed from: U8 */
    public final /* synthetic */ List m195748U8() {
        List<String> list = m195583A3().liveConfig.inAppPushHideConfig;
        if (vwb.m200296J(list)) {
            return null;
        }
        return list;
    }

    /* JADX INFO: renamed from: U9 */
    public final /* synthetic */ Boolean m195749U9() {
        return Boolean.valueOf(m195583A3().voiceLiveConfig.ownerCreateRoomNotify.show);
    }

    /* JADX INFO: renamed from: Ua */
    public final /* synthetic */ BLiveUnreadTypeEnum m195750Ua() {
        return m195583A3().liveConfig.unreadType.liveTab;
    }

    /* JADX INFO: renamed from: V3 */
    public String m195751V3() {
        return (String) m195576x3(new v9j() { // from class: l.sot
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f165723a.m195763W7();
            }
        }, this.f178418h.getString(R$string.f44098C));
    }

    /* JADX INFO: renamed from: V4 */
    public boolean m195752V4() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.snt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f165501a.m195724R8();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: V5 */
    public boolean m195753V5() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.dst
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f87790a.m195605C9();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: V6 */
    public boolean m195754V6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.zst
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f204639a.m195994ya();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: V7 */
    public final /* synthetic */ Integer m195755V7() {
        return Integer.valueOf(m195583A3().voiceLiveConfig.undercoverMinPlayerCount);
    }

    /* JADX INFO: renamed from: V8 */
    public final /* synthetic */ Integer m195756V8() {
        return Integer.valueOf(m195583A3().liveConfig.pushStreamConfig.manualRetryCountDown);
    }

    /* JADX INFO: renamed from: V9 */
    public final /* synthetic */ Boolean m195757V9() {
        return Boolean.valueOf(m195583A3().voiceLiveConfig.chatEntryExp);
    }

    /* JADX INFO: renamed from: Va */
    public final /* synthetic */ Integer m195758Va() {
        return Integer.valueOf(m195583A3().liveConfig.roomManagerCountMax);
    }

    /* JADX INFO: renamed from: W3 */
    public String m195759W3() {
        return (String) m195576x3(new v9j() { // from class: l.tpt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f171506a.m195771X7();
            }
        }, this.f178418h.getString(R$string.f44156c0));
    }

    /* JADX INFO: renamed from: W4 */
    public int m195760W4() {
        int iIntValue = ((Integer) m195576x3(new v9j() { // from class: l.fst
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f99107a.m195732S8();
            }
        }, 30)).intValue();
        if (iIntValue <= 0) {
            return 30;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: W5 */
    public boolean m195761W5() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.srt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f166135a.m195613D9();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: W6 */
    public boolean m195762W6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.cpt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f81995a.m196002za();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: W7 */
    public final /* synthetic */ String m195763W7() {
        return m195583A3().liveConfig.f44352pk.punishmentMessage;
    }

    /* JADX INFO: renamed from: W8 */
    public final /* synthetic */ Integer m195764W8() {
        return Integer.valueOf(m195583A3().liveConfig.pushStreamConfig.pusherFailedManualLimit);
    }

    /* JADX INFO: renamed from: W9 */
    public final /* synthetic */ Boolean m195765W9() {
        return Boolean.valueOf(m195583A3().liveConfig.obsLive.f44350on);
    }

    /* JADX INFO: renamed from: Wa */
    public final /* synthetic */ Boolean m195766Wa() {
        return Boolean.valueOf(m195583A3().voiceLiveConfig.intlVoiceBannerConfig.bannerOpen);
    }

    /* JADX INFO: renamed from: X3 */
    public boolean m195767X3() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.qst
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f156271a.m195779Y7();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: X4 */
    public int m195768X4() {
        int iIntValue = ((Integer) m195576x3(new v9j() { // from class: l.znt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f204008a.m195740T8();
            }
        }, 2)).intValue();
        if (iIntValue <= 0) {
            return 2;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: X5 */
    public boolean m195769X5() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.nnt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f139782a.m195621E9();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: X6 */
    public boolean m195770X6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.ost
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f145510a.m195590Aa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: X7 */
    public final /* synthetic */ String m195771X7() {
        return m195583A3().liveConfig.pushStreamConfig.hostLoadingText;
    }

    /* JADX INFO: renamed from: X8 */
    public final /* synthetic */ Integer m195772X8() {
        return Integer.valueOf(m195583A3().liveConfig.pushStreamConfig.pusherFailedLimit);
    }

    /* JADX INFO: renamed from: X9 */
    public final /* synthetic */ Boolean m195773X9() {
        return Boolean.valueOf(m195583A3().tttLiveConfig.gameEntranceHide);
    }

    /* JADX INFO: renamed from: Xa */
    public final /* synthetic */ Boolean m195774Xa() {
        return Boolean.valueOf(m195583A3().liveConfig.liveTab.recordOperateHistoryOn);
    }

    /* JADX INFO: renamed from: Y3 */
    public String m195775Y3() {
        return (String) m195576x3(new v9j() { // from class: l.fot
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f98630a.m195787Z7();
            }
        }, this.f178418h.getString(R$string.f44213v0));
    }

    /* JADX INFO: renamed from: Y4 */
    public List<Integer> m195776Y4(boolean z, boolean z2) {
        BLiveSettings bLiveSettingsM195583A3 = m195583A3();
        if (bLiveSettingsM195583A3 == null) {
            return new ArrayList();
        }
        if (z2) {
            BLivePreDefineMessages bLivePreDefineMessages = bLiveSettingsM195583A3.predefineMessages;
            return z ? bLivePreDefineMessages.anchor : bLivePreDefineMessages.audience;
        }
        BLivePreDefineMessages bLivePreDefineMessages2 = bLiveSettingsM195583A3.predefineMessages;
        return z ? bLivePreDefineMessages2.voiceAnchor : bLivePreDefineMessages2.voiceAudience;
    }

    /* JADX INFO: renamed from: Y5 */
    public List<BLiveCommonViewConfig> m195777Y5() {
        return (List) m195576x3(new v9j() { // from class: l.apt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f71080a.m195629F9();
            }
        }, vwb.m200324f0(m195591B3()));
    }

    /* JADX INFO: renamed from: Y6 */
    public boolean m195778Y6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.hst
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f109347a.m195598Ba();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: Y7 */
    public final /* synthetic */ Boolean m195779Y7() {
        return Boolean.valueOf(m195583A3().voiceLiveConfig.updateChatV3);
    }

    /* JADX INFO: renamed from: Y8 */
    public final /* synthetic */ String m195780Y8() {
        return m195583A3().liveConfig.license.secretKey;
    }

    /* JADX INFO: renamed from: Y9 */
    public final /* synthetic */ Boolean m195781Y9() {
        return Boolean.valueOf(m195583A3().tttLiveConfig.liveEntranceHide.messageChat);
    }

    /* JADX INFO: renamed from: Ya */
    public final /* synthetic */ Boolean m195782Ya() {
        return Boolean.valueOf(m195583A3().liveConfig.notifyFollowers.showNotifyButton);
    }

    /* JADX INFO: renamed from: Z3 */
    public int m195783Z3() {
        return ((Integer) m195576x3(new v9j() { // from class: l.lpt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f129248a.m195795a8();
            }
        }, -1)).intValue();
    }

    /* JADX INFO: renamed from: Z4 */
    public List<String> m195784Z4() {
        return (List) m195576x3(new v9j() { // from class: l.dut
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f88013a.m195748U8();
            }
        }, null);
    }

    /* JADX INFO: renamed from: Z5 */
    public boolean m195785Z5() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.krt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f124393a.m195637G9();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: Z6 */
    public final boolean m195786Z6() {
        return TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia) && TextUtils.equals("only_room_feed_exp", ABManager.m29352j0("LiveAudio_29"));
    }

    /* JADX INFO: renamed from: Z7 */
    public final /* synthetic */ String m195787Z7() {
        return m195583A3().liveConfig.chat.limitation.limitTips;
    }

    /* JADX INFO: renamed from: Z8 */
    public final /* synthetic */ BQuitLiveStayConfig m195788Z8() {
        return m195583A3().liveConfig.quitLiveStayConfig;
    }

    /* JADX INFO: renamed from: Z9 */
    public final /* synthetic */ Boolean m195789Z9() {
        return Boolean.valueOf(m195583A3().tttLiveConfig.liveEntranceHide.messageFriendHead);
    }

    /* JADX INFO: renamed from: Za */
    public final /* synthetic */ Boolean m195790Za() {
        return Boolean.valueOf(m195583A3().liveConfig.guardConfig.showGuardScoreIncrement);
    }

    /* JADX INFO: renamed from: a4 */
    public String m195791a4() {
        return (String) m195576x3(new v9j() { // from class: l.sst
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f166245a.m195803b8();
            }
        }, "");
    }

    /* JADX INFO: renamed from: a5 */
    public long m195792a5() {
        int iIntValue = ((Integer) m195576x3(new v9j() { // from class: l.stt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f166386a.m195756V8();
            }
        }, 60)).intValue();
        if (iIntValue <= 0) {
            return 60L;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: a6 */
    public String m195793a6() {
        return (String) m195576x3(new v9j() { // from class: l.ktt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f124617a.m195645H9();
            }
        }, "");
    }

    /* JADX INFO: renamed from: a7 */
    public boolean m195794a7() {
        Map<String, String> map;
        BLiveSettings bLiveSettingsM195583A3 = m195583A3();
        return (bLiveSettingsM195583A3 == null || (map = bLiveSettingsM195583A3.expConfig) == null || !map.containsKey("indonesiaChatroomExp") || TextUtils.isEmpty(bLiveSettingsM195583A3.expConfig.get("indonesiaChatroomExp")) || !"live_indonesia_chatroom:_test01".equals(bLiveSettingsM195583A3.expConfig.get("indonesiaChatroomExp"))) ? false : true;
    }

    /* JADX INFO: renamed from: a8 */
    public final /* synthetic */ Integer m195795a8() {
        return Integer.valueOf(m195583A3().liveConfig.followGuide.chatMsgWatchTime);
    }

    /* JADX INFO: renamed from: a9 */
    public final /* synthetic */ List m195796a9() {
        return m195583A3().voiceLiveConfig.shareConfig.momentTitles;
    }

    /* JADX INFO: renamed from: aa */
    public final /* synthetic */ Boolean m195797aa() {
        return Boolean.valueOf(m195583A3().tttLiveConfig.liveEntranceHide.slideCard);
    }

    /* JADX INFO: renamed from: ab */
    public final /* synthetic */ Boolean m195798ab() {
        return Boolean.valueOf(m195583A3().liveConfig.showMomentLikesAndComments);
    }

    @Nullable
    /* JADX INFO: renamed from: b4 */
    public BLiveConfig m195799b4() {
        BLiveSettings bLiveSettingsM195583A3 = m195583A3();
        if (bLiveSettingsM195583A3 == null) {
            return null;
        }
        return bLiveSettingsM195583A3.liveConfig;
    }

    /* JADX INFO: renamed from: b5 */
    public int m195800b5() {
        BLiveConfig bLiveConfig;
        BLiveSettings bLiveSettingsM195583A3 = m195583A3();
        if (bLiveSettingsM195583A3 == null || (bLiveConfig = bLiveSettingsM195583A3.liveConfig) == null) {
            return 5;
        }
        return bLiveConfig.pushMaxTimes;
    }

    /* JADX INFO: renamed from: b6 */
    public int m195801b6() {
        int iIntValue = ((Integer) m195576x3(new v9j() { // from class: l.jst
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f119539a.m195653I9();
            }
        }, 10)).intValue();
        if (iIntValue <= 0) {
            return 10;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: b7 */
    public boolean m195802b7() {
        if (vdt.m198092b(2)) {
            return ((Boolean) m195576x3(new v9j() { // from class: l.got
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f103722a.m195606Ca();
                }
            }, Boolean.FALSE)).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: b8 */
    public final /* synthetic */ String m195803b8() {
        return m195583A3().voiceLiveConfig.ownerCreateRoomNotify.notifyContent;
    }

    /* JADX INFO: renamed from: b9 */
    public final /* synthetic */ String m195804b9() {
        return m195583A3().liveConfig.reportFeedback;
    }

    /* JADX INFO: renamed from: ba */
    public final /* synthetic */ Boolean m195805ba() {
        return Boolean.valueOf(m195583A3().tttLiveConfig.liveEntranceHide.bottomLiveTab);
    }

    /* JADX INFO: renamed from: bb */
    public final /* synthetic */ Boolean m195806bb() {
        return Boolean.valueOf(m195583A3().videoChatConfig.showMoreEntrance);
    }

    /* JADX INFO: renamed from: c4 */
    public String m195807c4() {
        return m195583A3().liveConfig.blackListConfig.tipsFormat;
    }

    /* JADX INFO: renamed from: c5 */
    public int m195808c5() {
        int iIntValue = ((Integer) m195576x3(new v9j() { // from class: l.bpt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f76672a.m195764W8();
            }
        }, 3)).intValue();
        if (iIntValue <= 0) {
            return 3;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: c6 */
    public BLiveVoiceFeedStyle m195809c6() {
        return (BLiveVoiceFeedStyle) m195576x3(new v9j() { // from class: l.fut
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f99357a.m195661J9();
            }
        }, null);
    }

    /* JADX INFO: renamed from: c7 */
    public boolean m195810c7() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.qot
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f155632a.m195614Da();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: c8 */
    public final /* synthetic */ String m195811c8() {
        return m195583A3().voiceLiveConfig.defaultTabTopicId;
    }

    /* JADX INFO: renamed from: c9 */
    public final /* synthetic */ BLiveCommonConfig m195812c9() {
        return m195583A3().liveConfig.roomAnnouncement;
    }

    /* JADX INFO: renamed from: ca */
    public final /* synthetic */ Boolean m195813ca() {
        return Boolean.valueOf(m195583A3().tttLiveConfig.liveEntranceHide.userProfileLiveBanner);
    }

    /* JADX INFO: renamed from: cb */
    public final /* synthetic */ String m195814cb() {
        return m195583A3().voiceLiveConfig.roomAdministratorExplainH5;
    }

    /* JADX INFO: renamed from: d4 */
    public String m195815d4() {
        return (String) m195576x3(new v9j() { // from class: l.nut
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f140651a.m195811c8();
            }
        }, "0");
    }

    /* JADX INFO: renamed from: d5 */
    public int m195816d5() {
        return ((Integer) m195576x3(new v9j() { // from class: l.bqt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f76814a.m195772X8();
            }
        }, 2)).intValue();
    }

    /* JADX INFO: renamed from: d6 */
    public int m195817d6() {
        BLiveVoiceLiveConfig bLiveVoiceLiveConfig;
        BLiveSettings bLiveSettingsM195583A3 = m195583A3();
        if (bLiveSettingsM195583A3 == null || (bLiveVoiceLiveConfig = bLiveSettingsM195583A3.voiceLiveConfig) == null) {
            return 1;
        }
        return Math.max(bLiveVoiceLiveConfig.voiceManagerLimit, 1);
    }

    /* JADX INFO: renamed from: d7 */
    public boolean m195818d7() {
        return m195624F4() != null;
    }

    /* JADX INFO: renamed from: d8 */
    public final /* synthetic */ Integer m195819d8() {
        return Integer.valueOf(m195583A3().voiceLiveConfig.directLeaveRoomMaxStaySeconds);
    }

    /* JADX INFO: renamed from: d9 */
    public final /* synthetic */ Integer m195820d9() {
        return Integer.valueOf(m195583A3().liveConfig.msgSameLocationLimit);
    }

    /* JADX INFO: renamed from: da */
    public final /* synthetic */ Boolean m195821da() {
        return Boolean.valueOf(m195583A3().tttLiveConfig.liveEntranceHide.userProfilePhotoWall);
    }

    /* JADX INFO: renamed from: db */
    public final /* synthetic */ String m195822db() {
        return m195583A3().voiceLiveConfig.roomCardTemplateType;
    }

    /* JADX INFO: renamed from: e4 */
    public int m195823e4() {
        int iIntValue = ((Integer) m195576x3(new v9j() { // from class: l.kot
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f124057a.m195819d8();
            }
        }, 0)).intValue();
        if (iIntValue < 0) {
            return 0;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: e5 */
    public String m195824e5() {
        return (String) m195576x3(new v9j() { // from class: l.oot
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f144909a.m195780Y8();
            }
        }, "");
    }

    /* JADX INFO: renamed from: e6 */
    public int m195825e6() {
        int iIntValue = ((Integer) m195576x3(new v9j() { // from class: l.irt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f114680a.m195669K9();
            }
        }, 10)).intValue();
        if (iIntValue <= 0) {
            return 10;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: e7 */
    public boolean m195826e7() {
        if (m195583A3() == null || m195583A3().voiceLiveConfig == null) {
            return false;
        }
        int i = m195583A3().voiceLiveConfig.voiceBottomTabMode;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: e8 */
    public final /* synthetic */ Integer m195827e8() {
        return Integer.valueOf(m195583A3().liveConfig.giftConfig.drawGiftConfig.numLimitMax);
    }

    /* JADX INFO: renamed from: e9 */
    public final /* synthetic */ Integer m195828e9() {
        return Integer.valueOf(m195583A3().liveConfig.inRoomSideBarEntrance.defaultOpenParas.sidebarLiveLimitCount);
    }

    /* JADX INFO: renamed from: ea */
    public final /* synthetic */ Boolean m195829ea() {
        return Boolean.valueOf(m195583A3().tttLiveConfig.settingLiveEntranceHide);
    }

    /* JADX INFO: renamed from: eb */
    public final /* synthetic */ String m195830eb() {
        return m195583A3().voiceLiveConfig.voiceCpConfig.inviteGiftId;
    }

    /* JADX INFO: renamed from: f4 */
    public int m195831f4() {
        int iIntValue = ((Integer) m195576x3(new v9j() { // from class: l.cut
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f82592a.m195827e8();
            }
        }, 140)).intValue();
        if (iIntValue <= 0) {
            return 140;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: f5 */
    public BQuitLiveStayConfig m195832f5() {
        return (BQuitLiveStayConfig) m195576x3(new v9j() { // from class: l.ppt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f150717a.m195788Z8();
            }
        }, null);
    }

    /* JADX INFO: renamed from: f6 */
    public boolean m195833f6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.uot
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f177534a.m195677L9();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: f7 */
    public boolean m195834f7() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.drt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f87672a.m195622Ea();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: f8 */
    public final /* synthetic */ Integer m195835f8() {
        return Integer.valueOf(m195583A3().liveConfig.giftConfig.drawGiftConfig.numLimitMin);
    }

    /* JADX INFO: renamed from: f9 */
    public final /* synthetic */ BLiveStartBtnConfig m195836f9() {
        return m195583A3().liveConfig.toStartLiveConfig;
    }

    /* JADX INFO: renamed from: fa */
    public final /* synthetic */ Boolean m195837fa() {
        return Boolean.valueOf(m195583A3().tttLiveConfig.settingNoticeEntranceHide);
    }

    /* JADX INFO: renamed from: fb */
    public final /* synthetic */ String m195838fb() {
        return m195583A3().voiceLiveConfig.voiceCpConfig.inviteGiftPrice;
    }

    /* JADX INFO: renamed from: g4 */
    public int m195839g4() {
        int iIntValue = ((Integer) m195576x3(new v9j() { // from class: l.hrt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f109261a.m195835f8();
            }
        }, 10)).intValue();
        if (iIntValue <= 0) {
            return 10;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: g5 */
    public String m195840g5(int i, boolean z) {
        BLiveConfig bLiveConfig;
        BLiveSettings bLiveSettingsM195583A3 = m195583A3();
        if (bLiveSettingsM195583A3 == null || (bLiveConfig = bLiveSettingsM195583A3.liveConfig) == null) {
            return this.f178418h.getString(R$string.f44162e0);
        }
        if (i == 1) {
            return z ? bLiveConfig.f44352pk.quitPkMessages.random.playingStage : bLiveConfig.f44352pk.quitPkMessages.random.punishingStage;
        }
        if (i == 3) {
            return z ? bLiveConfig.f44352pk.quitPkMessages.bounty.playingStage : bLiveConfig.f44352pk.quitPkMessages.bounty.punishingStage;
        }
        return z ? bLiveConfig.f44352pk.quitPkMessages.specified.playingStage : bLiveConfig.f44352pk.quitPkMessages.specified.punishingStage;
    }

    /* JADX INFO: renamed from: g6 */
    public List<BLiveCommonViewConfig> m195841g6() {
        return (List) m195576x3(new v9j() { // from class: l.yot
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f199359a.m195685M9();
            }
        }, vwb.m200324f0(m195591B3()));
    }

    /* JADX INFO: renamed from: g7 */
    public boolean m195842g7() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.mpt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f135081a.m195630Fa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: g8 */
    public final /* synthetic */ Integer m195843g8() {
        return Integer.valueOf(m195583A3().liveConfig.giftConfig.drawGiftConfig.playDisplayLongDelay);
    }

    /* JADX INFO: renamed from: g9 */
    public final /* synthetic */ Integer m195844g9() {
        return Integer.valueOf(m195583A3().liveConfig.liveStreamEventConfig.bufferStopReportDuration);
    }

    /* JADX INFO: renamed from: ga */
    public final /* synthetic */ Boolean m195845ga() {
        return Boolean.valueOf(m195583A3().tttLiveConfig.voiceLiveEntranceHide.messageFriendHead);
    }

    /* JADX INFO: renamed from: gb */
    public BLiveUnreadTypeEnum m195846gb() {
        return (BLiveUnreadTypeEnum) m195576x3(new v9j() { // from class: l.jtt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f119673a.m195750Ua();
            }
        }, null);
    }

    /* JADX INFO: renamed from: h4 */
    public int m195847h4() {
        int iIntValue = ((Integer) m195576x3(new v9j() { // from class: l.gnt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f103628a.m195843g8();
            }
        }, 40)).intValue();
        if (iIntValue <= 0) {
            return 40;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: h5 */
    public String m195848h5() {
        List list = (List) m195576x3(new v9j() { // from class: l.crt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f82306a.m195796a9();
            }
        }, null);
        return (list == null || list.isEmpty()) ? "" : (String) list.get(new Random().nextInt(list.size()));
    }

    /* JADX INFO: renamed from: h6 */
    public int m195849h6() {
        int iIntValue = ((Integer) m195576x3(new v9j() { // from class: l.tut
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f172216a.m195693N9();
            }
        }, 10)).intValue();
        if (iIntValue <= 0) {
            return 10;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: h7 */
    public boolean m195850h7() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.gst
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f104210a.m195638Ga();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: h8 */
    public final /* synthetic */ Integer m195851h8() {
        return Integer.valueOf(m195583A3().liveConfig.giftConfig.drawGiftConfig.playDisplayLongDelay);
    }

    /* JADX INFO: renamed from: h9 */
    public final /* synthetic */ BSuggestedTabAnimationItem m195852h9() {
        return m195583A3().liveConfig.suggestedTabAnimation.card;
    }

    /* JADX INFO: renamed from: ha */
    public final /* synthetic */ Boolean m195853ha() {
        return Boolean.valueOf(m195583A3().tttLiveConfig.voiceLiveEntranceHide.slideCard);
    }

    /* JADX INFO: renamed from: hb */
    public int m195854hb() {
        return ((Integer) m195576x3(new v9j() { // from class: l.grt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f104106a.m195758Va();
            }
        }, 0)).intValue();
    }

    /* JADX INFO: renamed from: i4 */
    public int m195855i4() {
        int iIntValue = ((Integer) m195576x3(new v9j() { // from class: l.upt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f177666a.m195851h8();
            }
        }, 20)).intValue();
        if (iIntValue <= 0) {
            return 20;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: i5 */
    public String[] m195856i5() {
        String strM79302F = RemoteConfig.m79298x().m79302F("ttt_av_func_regions");
        if (TextUtils.isEmpty(strM79302F)) {
            String[] strArr = new String[0];
            this.f178419i = strArr;
            return strArr;
        }
        try {
            JSONArray jSONArray = new JSONArray(strM79302F);
            this.f178419i = new String[jSONArray.length()];
            int i = 0;
            while (true) {
                int length = jSONArray.length();
                String[] strArr2 = this.f178419i;
                if (i >= length) {
                    return strArr2;
                }
                strArr2[i] = jSONArray.getString(i);
                i++;
            }
        } catch (JSONException unused) {
            String[] strArr3 = new String[0];
            this.f178419i = strArr3;
            return strArr3;
        }
    }

    /* JADX INFO: renamed from: i6 */
    public boolean m195857i6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.mot
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f134953a.m195701O9();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: i7 */
    public boolean m195858i7() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.itt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f114929a.m195646Ha();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: i8 */
    public final /* synthetic */ Integer m195859i8() {
        return Integer.valueOf(m195583A3().liveConfig.giftConfig.drawGiftConfig.playSplitNum);
    }

    /* JADX INFO: renamed from: i9 */
    public final /* synthetic */ BSuggestedTabAnimationItem m195860i9() {
        return m195583A3().liveConfig.suggestedTabAnimation.follow;
    }

    /* JADX INFO: renamed from: ia */
    public final /* synthetic */ Boolean m195861ia() {
        return Boolean.valueOf(m195583A3().tttLiveConfig.voiceLiveEntranceHide.messageListChatDynamic);
    }

    /* JADX INFO: renamed from: ib */
    public int m195862ib() {
        BLiveVoiceLiveConfig bLiveVoiceLiveConfig;
        int i;
        BLiveSettings bLiveSettingsM195583A3 = m195583A3();
        if (bLiveSettingsM195583A3 == null || (bLiveVoiceLiveConfig = bLiveSettingsM195583A3.voiceLiveConfig) == null || (i = bLiveVoiceLiveConfig.chatEntryRefreshInterval) == 0) {
            return 60;
        }
        return i;
    }

    /* JADX INFO: renamed from: j4 */
    public int m195863j4() {
        int iIntValue = ((Integer) m195576x3(new v9j() { // from class: l.vpt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f182522a.m195859i8();
            }
        }, 50)).intValue();
        if (iIntValue <= 0) {
            return 50;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: j5 */
    public String m195864j5() {
        return (String) m195576x3(new v9j() { // from class: l.htt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f109446a.m195804b9();
            }
        }, this.f178418h.getString(R$string.f44186m0));
    }

    /* JADX INFO: renamed from: j6 */
    public C22306c<Boolean> m195865j6() {
        return m121230k().map(new w9j() { // from class: l.ttt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return uut.m195425K0((BLiveSettings) obj);
            }
        }).distinctUntilChanged();
    }

    /* JADX INFO: renamed from: j7 */
    public boolean m195866j7() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.hut
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f109586a.m195654Ia();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: j8 */
    public final /* synthetic */ Integer m195867j8() {
        return Integer.valueOf(m195583A3().liveConfig.giftConfig.drawGiftConfig.templateDisplayDelay);
    }

    /* JADX INFO: renamed from: j9 */
    public final /* synthetic */ BSuggestedTabAnimationItem m195868j9() {
        return m195583A3().liveConfig.suggestedTabAnimation.guide;
    }

    /* JADX INFO: renamed from: ja */
    public final /* synthetic */ Boolean m195869ja() {
        return Boolean.valueOf(m195583A3().tttLiveConfig.voiceLiveEntranceHide.messageListRightBottom);
    }

    /* JADX INFO: renamed from: jb */
    public boolean m195870jb() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.wnt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f187345a.m195766Wa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: k4 */
    public int m195871k4() {
        int iIntValue = ((Integer) m195576x3(new v9j() { // from class: l.ent
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f92337a.m195867j8();
            }
        }, 60)).intValue();
        if (iIntValue <= 0) {
            return 60;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: k5 */
    public BLiveCommonConfig m195872k5() {
        return (BLiveCommonConfig) m195576x3(new v9j() { // from class: l.but
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f77367a.m195812c9();
            }
        }, BLiveCommonConfig.new_());
    }

    /* JADX INFO: renamed from: k6 */
    public BLiveVoiceSparkReportConfig m195873k6() {
        return (BLiveVoiceSparkReportConfig) m195576x3(new v9j() { // from class: l.ltt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f129996a.m195709P9();
            }
        }, null);
    }

    /* JADX INFO: renamed from: k7 */
    public boolean m195874k7() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.ctt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f82499a.m195662Ja();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: k8 */
    public final /* synthetic */ Integer m195875k8() {
        return Integer.valueOf(m195583A3().liveConfig.enterRoomEffect.cleanDuration);
    }

    /* JADX INFO: renamed from: k9 */
    public final /* synthetic */ String m195876k9() {
        return m195583A3().voiceLiveConfig.voiceCpConfig.regulationPageUrl;
    }

    /* JADX INFO: renamed from: ka */
    public final /* synthetic */ Boolean m195877ka() {
        return Boolean.valueOf(m195583A3().tttLiveConfig.voiceLiveEntranceHide.bottomRecreation);
    }

    /* JADX INFO: renamed from: kb */
    public boolean m195878kb() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.pqt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f150815a.m195774Xa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: l4 */
    public int m195879l4() {
        int iIntValue = ((Integer) m195576x3(new v9j() { // from class: l.qrt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f156044a.m195875k8();
            }
        }, 60)).intValue();
        if (iIntValue <= 0) {
            return 60;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: l5 */
    public int m195880l5() {
        return ((Integer) m195576x3(new v9j() { // from class: l.qut
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f156540a.m195820d9();
            }
        }, 5)).intValue();
    }

    /* JADX INFO: renamed from: l6 */
    public BLiveVoiceCpConfig m195881l6() {
        return (BLiveVoiceCpConfig) m195576x3(new v9j() { // from class: l.btt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f77264a.m195717Q9();
            }
        }, null);
    }

    /* JADX INFO: renamed from: l7 */
    public boolean m195882l7() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.ont
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f144820a.m195670Ka();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: l8 */
    public final /* synthetic */ String m195883l8() {
        return m195583A3().liveConfig.fakeAlert.title;
    }

    /* JADX INFO: renamed from: l9 */
    public final /* synthetic */ Integer m195884l9() {
        return Integer.valueOf(m195583A3().liveConfig.swipeCardUnlimit.minGrade);
    }

    /* JADX INFO: renamed from: la */
    public final /* synthetic */ Boolean m195885la() {
        return Boolean.valueOf(m195583A3().tttLiveConfig.walletLiveEntranceHide);
    }

    /* JADX INFO: renamed from: lb */
    public boolean m195886lb() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.ert
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f92967a.m195782Ya();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: m4 */
    public String m195887m4() {
        return (String) m195576x3(new v9j() { // from class: l.bst
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f77120a.m195883l8();
            }
        }, null);
    }

    /* JADX INFO: renamed from: m5 */
    public String m195888m5() {
        BLiveCommonViewConfig bLiveCommonViewConfigM195608D4 = m195608D4();
        return bLiveCommonViewConfigM195608D4 == null ? "" : bLiveCommonViewConfigM195608D4.text;
    }

    /* JADX INFO: renamed from: m6 */
    public String m195889m6() {
        return (String) m195576x3(new v9j() { // from class: l.jnt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f118886a.m195725R9();
            }
        }, Mobile.TYPE);
    }

    /* JADX INFO: renamed from: m7 */
    public String m195890m7() {
        return (String) m195576x3(new v9j() { // from class: l.mqt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f135292a.m195678La();
            }
        }, "");
    }

    /* JADX INFO: renamed from: m8 */
    public final /* synthetic */ String m195891m8() {
        return m195583A3().liveConfig.fanbase.fanbaseRuleUrl;
    }

    /* JADX INFO: renamed from: m9 */
    public final /* synthetic */ BLiveTeenMode m195892m9() {
        return m195583A3().liveConfig.teenMode;
    }

    /* JADX INFO: renamed from: ma */
    public final /* synthetic */ Boolean m195893ma() {
        return Boolean.valueOf(m195583A3().voiceLiveConfig.anchorGrowthEntrySwitch);
    }

    /* JADX INFO: renamed from: mb */
    public boolean m195894mb(@Nullable String str) {
        BLiveEntrance bLiveEntranceM195616E4 = m195616E4(str);
        if (bLiveEntranceM195616E4 == null) {
            return false;
        }
        return bLiveEntranceM195616E4.f44360on;
    }

    /* JADX INFO: renamed from: n4 */
    public String m195895n4() {
        return (String) m195576x3(new v9j() { // from class: l.ort
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f145352a.m195891m8();
            }
        }, "");
    }

    /* JADX INFO: renamed from: n5 */
    public int m195896n5() {
        return ((Integer) m195576x3(new v9j() { // from class: l.fpt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f98734a.m195828e9();
            }
        }, 0)).intValue();
    }

    /* JADX INFO: renamed from: n6 */
    public boolean m195897n6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.rot
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f160416a.m195733S9();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: n7 */
    public boolean m195898n7() {
        if (NullChecker.m81303a(m195583A3()) && NullChecker.m81303a(m195583A3().intlLiveConfig)) {
            return (m195982x6() && m195634G6() && m195949t6()) ? false : true;
        }
        LiveRegionTag liveRegionTag = qib0.f154719h0;
        if (TEnum.equals(liveRegionTag, "unknown_")) {
            String str = new uqd0("live_region_tag_" + uvr.m196095l(), "").get();
            if (!TextUtils.isEmpty(str)) {
                try {
                    liveRegionTag = LiveRegionTag.get(str);
                } catch (Exception unused) {
                    liveRegionTag = qib0.f154719h0;
                }
            }
        }
        String[] strArrM195856i5 = m195856i5();
        if (strArrM195856i5.length == 0) {
            return false;
        }
        String string = liveRegionTag != null ? liveRegionTag.toString() : null;
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        for (String str2 : strArrM195856i5) {
            if (TextUtils.equals(string, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n8 */
    public final /* synthetic */ Long m195899n8() {
        return Long.valueOf(m195583A3().liveConfig.chat.limitation.floodsMinSendIntervalSeconds);
    }

    /* JADX INFO: renamed from: n9 */
    public final /* synthetic */ Integer m195900n9() {
        int i = m195583A3().liveConfig.intlFeedbackConfig.uploadImageSizeLimit;
        if (i == 0) {
            i = 5120;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: na */
    public final /* synthetic */ Boolean m195901na() {
        return Boolean.valueOf(m195583A3().liveConfig.liveBreakingLeaderboardConfig.isOpen);
    }

    /* JADX INFO: renamed from: nb */
    public boolean m195902nb() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.frt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f98998a.m195790Za();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: o4 */
    public long m195903o4() {
        long jLongValue = ((Long) m195576x3(new v9j() { // from class: l.opt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f145048a.m195899n8();
            }
        }, 15L)).longValue();
        if (jLongValue <= 0) {
            return 15L;
        }
        return jLongValue;
    }

    @Nullable
    /* JADX INFO: renamed from: o5 */
    public BLiveInRoomSideBarEntrance m195904o5() {
        BLiveConfig bLiveConfig;
        BLiveSettings bLiveSettingsM195583A3 = m195583A3();
        if (bLiveSettingsM195583A3 == null || (bLiveConfig = bLiveSettingsM195583A3.liveConfig) == null) {
            return null;
        }
        return bLiveConfig.inRoomSideBarEntrance;
    }

    /* JADX INFO: renamed from: o6 */
    public boolean m195905o6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.iot
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f114198a.m195741T9();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: o7 */
    public boolean m195906o7() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.aut
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f71859a.m195686Ma();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: o8 */
    public final /* synthetic */ List m195907o8() {
        return m195583A3().voiceLiveConfig.intlFlyMicEffectConfig;
    }

    /* JADX INFO: renamed from: o9 */
    public final /* synthetic */ Integer m195908o9() {
        int i = m195583A3().liveConfig.intlFeedbackConfig.logUploadLimitFrequency * 1000;
        if (i == 0) {
            i = 21600000;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: oa */
    public final /* synthetic */ Boolean m195909oa() {
        return Boolean.valueOf(m195583A3().voiceLiveConfig.roomPopRefresh.isCanAmountRefresh);
    }

    /* JADX INFO: renamed from: ob */
    public boolean m195910ob() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.hnt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f108704a.m195798ab();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: p4 */
    public List<BLiveIntlFlyMicEffectConfig> m195911p4() {
        return (List) m195576x3(new v9j() { // from class: l.zpt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f204307a.m195907o8();
            }
        }, null);
    }

    /* JADX INFO: renamed from: p5 */
    public int m195912p5(int i) {
        BLiveConfig bLiveConfig;
        BLiveSmallWindow bLiveSmallWindow;
        BLiveSettings bLiveSettingsM195583A3 = m195583A3();
        float f = (bLiveSettingsM195583A3 == null || (bLiveConfig = bLiveSettingsM195583A3.liveConfig) == null || (bLiveSmallWindow = bLiveConfig.smallWindow) == null) ? 0.2f : bLiveSmallWindow.location.marginTopP;
        float f2 = i;
        int i2 = (int) ((f > 0.0f ? f : 0.2f) * f2);
        if (i2 < xdl0.m208331F0()) {
            return xdl0.m208331F0();
        }
        float fM195921q5 = f2 - ((m195921q5() * 1.7777778f) + t100.m186890d(138.0f));
        return ((float) i2) > fM195921q5 ? (int) fM195921q5 : i2;
    }

    /* JADX INFO: renamed from: p6 */
    public boolean m195913p6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.lot
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f129140a.m195749U9();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: p7 */
    public boolean m195914p7() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.cot
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f81863a.m195694Na();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: p8 */
    public final /* synthetic */ Integer m195915p8() {
        return Integer.valueOf(m195583A3().liveConfig.guardConfig.sessionDuration);
    }

    /* JADX INFO: renamed from: p9 */
    public final /* synthetic */ String m195916p9() {
        return m195583A3().liveConfig.verificationConfig.createAnchorInterfaceType;
    }

    /* JADX INFO: renamed from: pa */
    public final /* synthetic */ Boolean m195917pa() {
        return Boolean.valueOf(m195583A3().voiceLiveConfig.roomPopRefresh.isCanLeaderboardRefresh);
    }

    /* JADX INFO: renamed from: pb */
    public boolean m195918pb() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.xtt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f194434a.m195806bb();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: q3 */
    public int m195919q3() {
        return ((Integer) m195576x3(new v9j() { // from class: l.vst
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f182885a.m195983x7();
            }
        }, 0)).intValue();
    }

    /* JADX INFO: renamed from: q4 */
    public int m195920q4() {
        return ((Integer) m195576x3(new v9j() { // from class: l.yqt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f199614a.m195915p8();
            }
        }, 2)).intValue();
    }

    /* JADX INFO: renamed from: q5 */
    public int m195921q5() {
        BLiveConfig bLiveConfig;
        BLiveSmallWindow bLiveSmallWindow;
        BLiveSettings bLiveSettingsM195583A3 = m195583A3();
        float f = (bLiveSettingsM195583A3 == null || (bLiveConfig = bLiveSettingsM195583A3.liveConfig) == null || (bLiveSmallWindow = bLiveConfig.smallWindow) == null) ? 0.3f : bLiveSmallWindow.location.widthP;
        float f2 = f > 0.0f ? f : 0.3f;
        if (f2 > 0.5d) {
            f2 = 0.5f;
        }
        return (int) (f2 * xdl0.m208412y0());
    }

    /* JADX INFO: renamed from: q6 */
    public boolean m195922q6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.wtt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f188053a.m195757V9();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: q7 */
    public boolean m195923q7() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.cqt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f82114a.m195702Oa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ List m195924q8() {
        return m195583A3().liveConfig.roomSlide.intervalDays;
    }

    /* JADX INFO: renamed from: q9 */
    public final /* synthetic */ Integer m195925q9() {
        return Integer.valueOf(m195583A3().videoChatConfig.chat.autoFakeCallResetHours);
    }

    /* JADX INFO: renamed from: qa */
    public final /* synthetic */ Boolean m195926qa() {
        return Boolean.valueOf(m195583A3().liveConfig.blackListConfig.isOpen);
    }

    /* JADX INFO: renamed from: qb */
    public String m195927qb() {
        return (String) m195576x3(new v9j() { // from class: l.lqt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f129436a.m195814cb();
            }
        }, "");
    }

    /* JADX INFO: renamed from: r3 */
    public String m195928r3() {
        return (String) m195576x3(new v9j() { // from class: l.sut
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f166497a.m195991y7();
            }
        }, "");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX INFO: renamed from: r4 */
    public String m195929r4() {
        BLiveWealthLogoConfig bLiveWealthLogoConfig;
        BLiveSettings bLiveSettingsM195583A3 = m195583A3();
        if (bLiveSettingsM195583A3 == null) {
            return "";
        }
        if (NullChecker.m81303a(bLiveSettingsM195583A3.wealthLogoNewIconConfig)) {
            bLiveWealthLogoConfig = bLiveSettingsM195583A3.wealthLogoNewIconConfig;
            if (!bLiveWealthLogoConfig.openNewIcon) {
                if (NullChecker.m81303a(bLiveSettingsM195583A3.wealthLogoConfig)) {
                    bLiveWealthLogoConfig = bLiveSettingsM195583A3.wealthLogoConfig;
                } else {
                    bLiveWealthLogoConfig = null;
                }
            }
        } else if (NullChecker.m81303a(bLiveSettingsM195583A3.wealthLogoConfig)) {
            bLiveWealthLogoConfig = bLiveSettingsM195583A3.wealthLogoConfig;
        } else {
            bLiveWealthLogoConfig = null;
        }
        return NullChecker.m81303a(bLiveWealthLogoConfig) ? bLiveWealthLogoConfig.picture : "";
    }

    /* JADX INFO: renamed from: r5 */
    public UserWealthGradeConfig m195930r5(int i, boolean z) {
        BLiveWealthLogoConfig bLiveWealthLogoConfig;
        UserWealthGradeConfig userWealthGradeConfigNew_ = UserWealthGradeConfig.new_();
        BLiveSettings bLiveSettingsM195583A3 = m195583A3();
        if (bLiveSettingsM195583A3 != null) {
            if (NullChecker.m81303a(bLiveSettingsM195583A3.wealthLogoConfig)) {
                bLiveWealthLogoConfig = bLiveSettingsM195583A3.wealthLogoConfig;
                if (NullChecker.m81303a(bLiveWealthLogoConfig.tipsMap) && !bLiveWealthLogoConfig.tipsMap.isEmpty()) {
                    String str = bLiveWealthLogoConfig.tipsMap.get(String.valueOf(i));
                    if (!TextUtils.isEmpty(str)) {
                        userWealthGradeConfigNew_.wealthGradeDesc = str;
                    }
                }
            } else {
                bLiveWealthLogoConfig = null;
            }
            if (NullChecker.m81303a(bLiveSettingsM195583A3.wealthLogoNewIconConfig)) {
                BLiveWealthLogoConfig bLiveWealthLogoConfig2 = bLiveSettingsM195583A3.wealthLogoNewIconConfig;
                if (bLiveWealthLogoConfig2.openNewIcon) {
                    userWealthGradeConfigNew_.openNewIcon = true;
                    bLiveWealthLogoConfig = bLiveWealthLogoConfig2;
                }
            }
            if (NullChecker.m81303a(bLiveSettingsM195583A3.wealthLogoNewIconConfigV2)) {
                BLiveWealthLogoConfig bLiveWealthLogoConfig3 = bLiveSettingsM195583A3.wealthLogoNewIconConfigV2;
                if (bLiveWealthLogoConfig3.openNewIcon) {
                    userWealthGradeConfigNew_.openNewIcon = true;
                    bLiveWealthLogoConfig = bLiveWealthLogoConfig3;
                }
            }
            if (NullChecker.m81303a(bLiveWealthLogoConfig)) {
                if (z) {
                    if (NullChecker.m81303a(bLiveWealthLogoConfig.swipeIconMap) && !bLiveWealthLogoConfig.swipeIconMap.isEmpty()) {
                        String str2 = bLiveWealthLogoConfig.swipeIconMap.get(String.valueOf(i));
                        if (!TextUtils.isEmpty(str2)) {
                            userWealthGradeConfigNew_.wealthIconUrl = str2;
                            return userWealthGradeConfigNew_;
                        }
                    }
                } else if (NullChecker.m81303a(bLiveWealthLogoConfig.otherIconMap) && !bLiveWealthLogoConfig.otherIconMap.isEmpty()) {
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
    public boolean m195931r6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.xnt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f193730a.m195765W9();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: r7 */
    public boolean m195932r7() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.pst
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f151052a.m195710Pa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ String m195933r8() {
        return m195583A3().intlGameSquareUrl;
    }

    /* JADX INFO: renamed from: r9 */
    public final /* synthetic */ Integer m195934r9() {
        return Integer.valueOf(m195583A3().videoChatConfig.chat.autoFakeCallTimesLimit);
    }

    /* JADX INFO: renamed from: ra */
    public final /* synthetic */ Boolean m195935ra() {
        return Boolean.valueOf(m195583A3().liveConfig.stormCommentConfig.f44350on);
    }

    /* JADX INFO: renamed from: rb */
    public String m195936rb() {
        return (String) m195576x3(new v9j() { // from class: l.npt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f139999a.m195822db();
            }
        }, "");
    }

    /* JADX INFO: renamed from: s3 */
    public BLiveUnreadTypeEnum m195937s3() {
        return (BLiveUnreadTypeEnum) m195576x3(new v9j() { // from class: l.mut
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f135844a.m195999z7();
            }
        }, null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX INFO: renamed from: s4 */
    public String m195938s4() {
        BLiveWealthLogoConfig bLiveWealthLogoConfig;
        BLiveSettings bLiveSettingsM195583A3 = m195583A3();
        if (bLiveSettingsM195583A3 == null) {
            return "";
        }
        if (NullChecker.m81303a(bLiveSettingsM195583A3.wealthLogoNewIconConfig)) {
            bLiveWealthLogoConfig = bLiveSettingsM195583A3.wealthLogoNewIconConfig;
            if (!bLiveWealthLogoConfig.openNewIcon) {
                if (NullChecker.m81303a(bLiveSettingsM195583A3.wealthLogoConfig)) {
                    bLiveWealthLogoConfig = bLiveSettingsM195583A3.wealthLogoConfig;
                } else {
                    bLiveWealthLogoConfig = null;
                }
            }
        } else if (NullChecker.m81303a(bLiveSettingsM195583A3.wealthLogoConfig)) {
            bLiveWealthLogoConfig = bLiveSettingsM195583A3.wealthLogoConfig;
        } else {
            bLiveWealthLogoConfig = null;
        }
        return NullChecker.m81303a(bLiveWealthLogoConfig) ? bLiveWealthLogoConfig.description : "";
    }

    /* JADX INFO: renamed from: s5 */
    public BLiveStartBtnConfig m195939s5() {
        return (BLiveStartBtnConfig) m195576x3(new v9j() { // from class: l.pnt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f150413a.m195836f9();
            }
        }, null);
    }

    /* JADX INFO: renamed from: s6 */
    public boolean m195940s6() {
        if (super.m121233n() != null) {
            return true;
        }
        BLiveSettings bLiveSettingsM121232m = m121232m();
        this.f178420j = bLiveSettingsM121232m;
        return bLiveSettingsM121232m != null;
    }

    /* JADX INFO: renamed from: s7 */
    public boolean m195941s7() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.xot
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f193882a.m195718Qa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ String m195942s8() {
        return m195583A3().intlLiveConfig.liveRoomLeaderboardSchema;
    }

    /* JADX INFO: renamed from: s9 */
    public final /* synthetic */ Integer m195943s9() {
        int i = m195583A3().videoChatConfig.chat.call.fetchInterval;
        if (i == 0) {
            i = 3;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: sa */
    public final /* synthetic */ Boolean m195944sa() {
        return Boolean.valueOf(m195583A3().liveConfig.fanbase.f44366on);
    }

    /* JADX INFO: renamed from: sb */
    public int m195945sb() {
        BLiveConfig bLiveConfig;
        int i;
        BLiveSettings bLiveSettingsM195583A3 = m195583A3();
        if (bLiveSettingsM195583A3 == null || (bLiveConfig = bLiveSettingsM195583A3.liveConfig) == null || (i = bLiveConfig.liveSquareRefreshListInterval) == 0) {
            return 600;
        }
        return i;
    }

    /* JADX INFO: renamed from: t3 */
    public String m195946t3() {
        return (String) m195576x3(new v9j() { // from class: l.tqt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f171623a.m195587A7();
            }
        }, null);
    }

    /* JADX INFO: renamed from: t4 */
    public List<Integer> m195947t4() {
        List<Integer> list = (List) m195576x3(new v9j() { // from class: l.gpt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f103837a.m195924q8();
            }
        }, vwb.m200324f0(3, 5, 8));
        return list.size() == 0 ? vwb.m200324f0(3, 5, 8) : list;
    }

    /* JADX INFO: renamed from: t5 */
    public String m195948t5(int i, boolean z) {
        BLiveConfig bLiveConfig;
        BLiveSettings bLiveSettingsM195583A3 = m195583A3();
        if (bLiveSettingsM195583A3 == null || (bLiveConfig = bLiveSettingsM195583A3.liveConfig) == null) {
            return this.f178418h.getString(R$string.f44162e0);
        }
        if (i == 1) {
            return z ? bLiveConfig.f44352pk.stopLiveMessages.random.playingStage : bLiveConfig.f44352pk.stopLiveMessages.random.punishingStage;
        }
        if (i == 3) {
            return z ? bLiveConfig.f44352pk.stopLiveMessages.bounty.playingStage : bLiveConfig.f44352pk.stopLiveMessages.bounty.punishingStage;
        }
        return z ? bLiveConfig.f44352pk.stopLiveMessages.specified.playingStage : bLiveConfig.f44352pk.stopLiveMessages.specified.punishingStage;
    }

    /* JADX INFO: renamed from: t6 */
    public boolean m195949t6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.rut
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f161137a.m195773X9();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: t7 */
    public boolean m195950t7() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.bot
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f76554a.m195726Ra();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: t8 */
    public final /* synthetic */ String m195951t8() {
        return m195583A3().intlLiveConfig.liveSquareLeaderboardSchema;
    }

    /* JADX INFO: renamed from: t9 */
    public final /* synthetic */ Integer m195952t9() {
        int i = m195583A3().videoChatConfig.chat.dial.retryCount;
        if (i == 0) {
            i = 3;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: ta */
    public final /* synthetic */ Boolean m195953ta() {
        return Boolean.valueOf(m195583A3().liveConfig.smallWindow.show);
    }

    /* JADX INFO: renamed from: tb */
    public String m195954tb() {
        return (String) m195576x3(new v9j() { // from class: l.wot
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f187468a.m195830eb();
            }
        }, "");
    }

    /* JADX INFO: renamed from: u3 */
    public boolean m195955u3() {
        Map<String, String> map;
        BLiveSettings bLiveSettingsM195583A3 = m195583A3();
        return (bLiveSettingsM195583A3 == null || (map = bLiveSettingsM195583A3.expConfig) == null || !map.containsKey("liveClearScreenExp") || TextUtils.isEmpty(bLiveSettingsM195583A3.expConfig.get("liveClearScreenExp")) || !"live_rec_cleans:_test01".equals(bLiveSettingsM195583A3.expConfig.get("liveClearScreenExp"))) ? false : true;
    }

    /* JADX INFO: renamed from: u4 */
    public String m195956u4() {
        return (String) m195576x3(new v9j() { // from class: l.est
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f93052a.m195933r8();
            }
        }, "");
    }

    /* JADX INFO: renamed from: u5 */
    public int m195957u5() {
        int iIntValue = ((Integer) m195576x3(new v9j() { // from class: l.qpt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f155796a.m195844g9();
            }
        }, 2000)).intValue();
        if (iIntValue <= 0) {
            return 2000;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: u6 */
    public boolean m195958u6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.rtt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f160994a.m195781Y9();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: u7 */
    public boolean m195959u7() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.cst
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f82378a.m195734Sa();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: u8 */
    public final /* synthetic */ String m195960u8() {
        return m195583A3().intlOctopusGameUrlPrefix;
    }

    /* JADX INFO: renamed from: u9 */
    public final /* synthetic */ Integer m195961u9() {
        int i = m195583A3().videoChatConfig.chat.dial.fetchInterval;
        if (i == 0) {
            i = 3;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: ua */
    public final /* synthetic */ Boolean m195962ua() {
        return Boolean.valueOf(m195583A3().liveConfig.giftConfig.enableDynamicUrl);
    }

    /* JADX INFO: renamed from: ub */
    public String m195963ub() {
        return (String) m195576x3(new v9j() { // from class: l.rrt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f160777a.m195838fb();
            }
        }, "");
    }

    /* JADX INFO: renamed from: v3 */
    public boolean m195964v3() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.lnt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f129024a.m195595B7();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: v4 */
    public String m195965v4() {
        return (String) m195576x3(new v9j() { // from class: l.hpt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f108964a.m195942s8();
            }
        }, "");
    }

    /* JADX INFO: renamed from: v5 */
    public BSuggestedTabAnimationItem m195966v5() {
        return (BSuggestedTabAnimationItem) m195576x3(new v9j() { // from class: l.dtt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f87871a.m195852h9();
            }
        }, null);
    }

    /* JADX INFO: renamed from: v6 */
    public boolean m195967v6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.jot
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f119010a.m195789Z9();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: v7 */
    public boolean m195968v7() {
        BLiveVoiceLiveConfig bLiveVoiceLiveConfig;
        if (m195786Z6()) {
            return true;
        }
        BLiveSettings bLiveSettingsM195583A3 = m195583A3();
        if (bLiveSettingsM195583A3 == null || (bLiveVoiceLiveConfig = bLiveSettingsM195583A3.voiceLiveConfig) == null) {
            return false;
        }
        return !TextUtils.isEmpty(bLiveVoiceLiveConfig.voiceLiveActivityMomentTest);
    }

    /* JADX INFO: renamed from: v8 */
    public final /* synthetic */ Integer m195969v8() {
        return Integer.valueOf(m195583A3().voiceLiveConfig.intlShareConfig.maxSingleShareLimit);
    }

    /* JADX INFO: renamed from: v9 */
    public final /* synthetic */ Integer m195970v9() {
        int i = m195583A3().videoChatConfig.chat.dial.timeout;
        if (i == 0) {
            i = 15;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: va */
    public final /* synthetic */ Boolean m195971va() {
        return Boolean.valueOf(m195583A3().liveConfig.stealthPrivilege.hideLiveAvatar.f44350on);
    }

    /* JADX INFO: renamed from: w3 */
    public String m195972w3() {
        return (String) m195576x3(new v9j() { // from class: l.spt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f165879a.m195603C7();
            }
        }, this.f178418h.getString(R$string.f44194p));
    }

    /* JADX INFO: renamed from: w4 */
    public String m195973w4() {
        return (String) m195576x3(new v9j() { // from class: l.ett
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f93171a.m195951t8();
            }
        }, "");
    }

    /* JADX INFO: renamed from: w5 */
    public BSuggestedTabAnimationItem m195974w5() {
        return (BSuggestedTabAnimationItem) m195576x3(new v9j() { // from class: l.put
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f151350a.m195860i9();
            }
        }, null);
    }

    /* JADX INFO: renamed from: w6 */
    public boolean m195975w6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.nqt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f140098a.m195797aa();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: w7 */
    public boolean m195976w7() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.lrt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f129765a.m195742Ta();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: w8 */
    public final /* synthetic */ BLiveIntlLiveTemplatesCdnData m195977w8() {
        return m195583A3().intlLiveTemplatesMetadata;
    }

    /* JADX INFO: renamed from: w9 */
    public final /* synthetic */ Integer m195978w9() {
        int i = m195583A3().videoChatConfig.chat.fakeCallTimeout;
        if (i == 0) {
            i = 15;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: wa */
    public final /* synthetic */ Boolean m195979wa() {
        return Boolean.valueOf(m195583A3().liveConfig.stealthPrivilege.hideConsumeRecord.f44350on);
    }

    /* JADX INFO: renamed from: x4 */
    public String m195980x4() {
        return (String) m195576x3(new v9j() { // from class: l.nst
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f140294a.m195960u8();
            }
        }, "defaultx");
    }

    /* JADX INFO: renamed from: x5 */
    public BSuggestedTabAnimationItem m195981x5() {
        return (BSuggestedTabAnimationItem) m195576x3(new v9j() { // from class: l.vtt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f183008a.m195868j9();
            }
        }, null);
    }

    /* JADX INFO: renamed from: x6 */
    public boolean m195982x6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.unt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f177455a.m195805ba();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: x7 */
    public final /* synthetic */ Integer m195983x7() {
        return Integer.valueOf(m195583A3().liveConfig.activitySummaryRegularUnread.interval);
    }

    /* JADX INFO: renamed from: x8 */
    public final /* synthetic */ String m195984x8() {
        return m195583A3().intlLiveConfig.voiceRoomLeaderboardSchema;
    }

    /* JADX INFO: renamed from: x9 */
    public final /* synthetic */ Integer m195985x9() {
        int i = m195583A3().videoChatConfig.chat.live.fetchInterval;
        if (i == 0) {
            i = 15;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: xa */
    public final /* synthetic */ Boolean m195986xa() {
        return Boolean.valueOf(m195583A3().voiceLiveConfig.isHideCreateRoomButton);
    }

    /* JADX INFO: renamed from: y3 */
    public long m195987y3() {
        return ((Integer) m195576x3(new v9j() { // from class: l.xrt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f194171a.m195611D7();
            }
        }, 60)).intValue();
    }

    /* JADX INFO: renamed from: y4 */
    public int m195988y4() {
        int iIntValue = ((Integer) m195576x3(new v9j() { // from class: l.xqt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f194041a.m195969v8();
            }
        }, 10)).intValue();
        if (iIntValue > 0) {
            return iIntValue;
        }
        return 10;
    }

    /* JADX INFO: renamed from: y5 */
    public List<BLiveSquareSubTab> m195989y5() {
        BLiveSquareTab bLiveSquareTab;
        BLiveSettings bLiveSettingsM195583A3 = m195583A3();
        if (bLiveSettingsM195583A3 == null || vwb.m200296J(bLiveSettingsM195583A3.liveSquareTabs) || (bLiveSquareTab = (BLiveSquareTab) vwb.m200346r(bLiveSettingsM195583A3.liveSquareTabs, new w9j() { // from class: l.ptt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveSquareTab) obj).name, "square-suggested"));
            }
        })) == null) {
            return null;
        }
        return bLiveSquareTab.subTabs;
    }

    /* JADX INFO: renamed from: y6 */
    public boolean m195990y6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.aqt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f71203a.m195813ca();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: y7 */
    public final /* synthetic */ String m195991y7() {
        return m195583A3().liveConfig.activitySummaryRegularUnread.text;
    }

    /* JADX INFO: renamed from: y8 */
    public final /* synthetic */ String m195992y8() {
        return m195583A3().intlLiveConfig.voiceSquareLeaderboardSchema;
    }

    /* JADX INFO: renamed from: y9 */
    public final /* synthetic */ BLiveVideoQuality m195993y9() {
        return m195583A3().liveConfig.videoQuality;
    }

    /* JADX INFO: renamed from: ya */
    public final /* synthetic */ Boolean m195994ya() {
        return Boolean.valueOf(m195583A3().intlLiveConfig.intlGameOperationControl.isHideIntlLiveSquareActivity);
    }

    /* JADX INFO: renamed from: z3 */
    public final BLiveSettings m195995z3() {
        if (super.m121233n() != null) {
            this.f178420j = null;
            return (BLiveSettings) super.m121233n();
        }
        if (this.f178420j == null) {
            this.f178420j = m121232m();
        }
        return this.f178420j;
    }

    /* JADX INFO: renamed from: z4 */
    public BLiveIntlLiveTemplatesCdnData m195996z4() {
        return (BLiveIntlLiveTemplatesCdnData) m195576x3(new v9j() { // from class: l.ypt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f199488a.m195977w8();
            }
        }, null);
    }

    /* JADX INFO: renamed from: z5 */
    public String m195997z5() {
        return (String) m195576x3(new v9j() { // from class: l.wst
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f187973a.m195876k9();
            }
        }, "");
    }

    /* JADX INFO: renamed from: z6 */
    public boolean m195998z6() {
        return ((Boolean) m195576x3(new v9j() { // from class: l.tst
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f171962a.m195821da();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: z7 */
    public final /* synthetic */ BLiveUnreadTypeEnum m195999z7() {
        return m195583A3().liveConfig.unreadType.activitySummaries;
    }

    /* JADX INFO: renamed from: z8 */
    public final /* synthetic */ Integer m196000z8() {
        return Integer.valueOf(m195583A3().liveConfig.activityOngoingAdditionCount);
    }

    /* JADX INFO: renamed from: z9 */
    public final /* synthetic */ Long m196001z9() {
        return m195583A3().liveConfig.vipReportGrade;
    }

    /* JADX INFO: renamed from: za */
    public final /* synthetic */ Boolean m196002za() {
        return Boolean.valueOf(m195583A3().intlLiveConfig.intlGameOperationControl.isHideIntlVoiceLiveSquareActivity);
    }
}
