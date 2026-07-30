package com.idv.identity.platform;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSON;
import com.idv.identity.platform.config.Chameleon;
import com.idv.identity.platform.config.IdentityFarNearConfig;
import com.idv.identity.platform.config.OSSConfig;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import com.idv.identity.platform.model.NfcConfigRes;
import com.idv.identity.platform.model.ZimInitContent;
import com.idv.identity.platform.utils.EnvCheck;
import com.idv.identity.util.IdentityUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p149l.d300;
import p149l.d720;
import p149l.fgq0;
import p149l.hc20;
import p149l.ixq0;
import p149l.kb20;
import p149l.kcm;
import p149l.ksf0;
import p149l.l4c0;
import p149l.mcm;
import p149l.ncm;
import p149l.pcm;
import p149l.rcm;
import p149l.y5c0;

/* JADX INFO: loaded from: classes7.dex */
public class SystemLoadingActivity extends IntlFaceBaseActivity {

    /* JADX INFO: renamed from: e */
    private static String[] f12717e = {"android.permission.CAMERA"};

    /* JADX INFO: renamed from: c */
    private long f12718c = System.currentTimeMillis();

    /* JADX INFO: renamed from: d */
    private Handler f12719d = new Handler(new C3707a());

    /* JADX INFO: renamed from: com.idv.identity.platform.SystemLoadingActivity$a */
    public class C3707a implements Handler.Callback {
        public C3707a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (1001 == i) {
                SystemLoadingActivity.this.m18112T0((String) message.obj);
                return true;
            }
            if (1002 != i) {
                return true;
            }
            SystemLoadingActivity.this.m18113U0();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.platform.SystemLoadingActivity$b */
    public class C3708b implements fgq0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f12721a;

        public C3708b(long j) {
            this.f12721a = j;
        }

        @Override // p149l.fgq0
        /* JADX INFO: renamed from: a */
        public void mo18119a(String str, String str2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "START_INIT_REQUEST", "action", "initDeviceCost", NotificationCompat.CATEGORY_STATUS, "fail", "errorCode", str, "errorMsg", str2, "tag", "onError", "timeCost", String.valueOf((System.currentTimeMillis() - this.f12721a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s);
            SystemLoadingActivity.this.m18114V0(str);
        }

        @Override // p149l.fgq0
        /* JADX INFO: renamed from: b */
        public void mo18120b(String str, OSSConfig oSSConfig, String str2, String str3) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "START_INIT_REQUEST", "action", "initDeviceCost", NotificationCompat.CATEGORY_STATUS, "success", "extProtocol", str3, "timeCost", String.valueOf((System.currentTimeMillis() - this.f12721a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s);
            SystemLoadingActivity.this.m18115W0(oSSConfig, str2, str3, false);
        }
    }

    /* JADX INFO: renamed from: P0 */
    private boolean m18109P0() {
        EnvCheck.EnvErrorType envErrorTypeM18127c;
        String strM145550i0 = kcm.m145452H().m145550i0();
        if (pcm.f148193f.equals(strM145550i0) || pcm.f148192e.equals(strM145550i0)) {
            EnvCheck.EnvErrorType envErrorTypeM18125a = EnvCheck.m18125a();
            if (EnvCheck.EnvErrorType.ENV_SUCCESS == envErrorTypeM18125a) {
                return false;
            }
            if (EnvCheck.EnvErrorType.ENV_ERROR_LOW_OS == envErrorTypeM18125a) {
                m18114V0(ncm.f138203m);
            } else if (EnvCheck.EnvErrorType.ENV_ERROR_NO_BACK_CAMERA == envErrorTypeM18125a) {
                m18114V0(ncm.f138198h);
            } else if (EnvCheck.EnvErrorType.ENV_ERROR_NO_FRONT_CAMERA == envErrorTypeM18125a) {
                m18114V0(ncm.f138197g);
            }
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "enviromentCheck", NotificationCompat.CATEGORY_STATUS, "error", "code", String.valueOf(envErrorTypeM18125a));
            return true;
        }
        if (pcm.f148191d.equals(strM145550i0)) {
            EnvCheck.EnvErrorType envErrorTypeM18126b = EnvCheck.m18126b();
            if (EnvCheck.EnvErrorType.ENV_SUCCESS == envErrorTypeM18126b) {
                return false;
            }
            m18114V0(ncm.f138198h);
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "enviromentCheck", NotificationCompat.CATEGORY_STATUS, "error", "code", String.valueOf(envErrorTypeM18126b));
            return true;
        }
        if ((!pcm.f148188a.equals(strM145550i0) && !pcm.f148189b.equals(strM145550i0) && !pcm.f148190c.equals(strM145550i0) && !pcm.f148196i.equals(strM145550i0) && !pcm.f148195h.equals(strM145550i0)) || EnvCheck.EnvErrorType.ENV_SUCCESS == (envErrorTypeM18127c = EnvCheck.m18127c())) {
            return false;
        }
        m18114V0(ncm.f138197g);
        RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "enviromentCheck", NotificationCompat.CATEGORY_STATUS, "error", "code", String.valueOf(envErrorTypeM18127c));
        return true;
    }

    /* JADX INFO: renamed from: Q0 */
    private List<String> m18110Q0() {
        ArrayList arrayList = new ArrayList();
        for (String str : f12717e) {
            if (checkSelfPermission(str) != 0) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: R0 */
    private String m18111R0() {
        return "LOADING";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public void m18112T0(String str) {
        if (TextUtils.isEmpty(str)) {
            str = ncm.f138191a;
        }
        String str2 = str;
        finish();
        RecordService.getInstance().recordEventPage(RecordLevel.LOG_INFO, "LOADING_EXIT", "LOADING", (System.currentTimeMillis() - this.f12718c) + "ms", str2);
        kcm.m145452H().m145537e(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:64:0x014a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0169  */
    /* JADX INFO: renamed from: U0 */
    public void m18113U0() {
        boolean zM110212b;
        String str;
        String str2;
        NfcConfigRes nfcConfigResM145488L = kcm.m145452H().m145488L();
        String strM145553j0 = kcm.m145452H().m145553j0();
        String strM145550i0 = kcm.m145452H().m145550i0();
        if (strM145550i0 == null) {
            m18114V0(ncm.f138185E);
            return;
        }
        ixq0.m138885b("Identity", "onInitSuccessproductCode " + strM145550i0);
        String strM145546h = kcm.m145452H().m145546h();
        String strM145549i = kcm.m145452H().m145549i();
        String str3 = "";
        if (strM145546h != null && strM145549i != null && !TextUtils.isEmpty(strM145546h) && !TextUtils.isEmpty(strM145549i)) {
            zM110212b = d720.m110216f(this);
        } else if (pcm.f148196i.equals(strM145550i0) || pcm.f148188a.equals(strM145550i0) || pcm.f148189b.equals(strM145550i0) || pcm.f148190c.equals(strM145550i0) || pcm.f148195h.equals(strM145550i0)) {
            zM110212b = d720.m110212b(this, true);
            if (!zM110212b) {
                str3 = ncm.f138214x;
            }
        } else if (pcm.f148191d.equals(strM145550i0)) {
            zM110212b = d720.m110215e("1".equals(strM145553j0), this);
            if (!zM110212b) {
                str3 = ncm.f138213w;
            }
        } else {
            if (pcm.f148194g.equals(strM145550i0)) {
                if (!getPackageManager().hasSystemFeature("android.hardware.nfc")) {
                    RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "START_CKYC", "docType", mcm.f133148a, "warning", ncm.f138215y);
                    str = ncm.f138215y;
                    zM110212b = false;
                } else if ("1".equals(strM145553j0)) {
                    zM110212b = d720.m110216f(this);
                    if (!zM110212b) {
                        str3 = ncm.f138213w;
                    }
                } else {
                    zM110212b = m18117Y0(nfcConfigResM145488L);
                    if (!zM110212b) {
                        str3 = ncm.f138212v;
                    }
                }
                str2 = (System.currentTimeMillis() - this.f12718c) + "ms";
                if (zM110212b) {
                    RecordService recordService = RecordService.getInstance();
                    RecordLevel recordLevel = RecordLevel.LOG_INFO;
                    recordService.recordEvent(recordLevel, "START_INIT", "action", "initSDK", NotificationCompat.CATEGORY_STATUS, "success", "productCode", strM145550i0);
                    RecordService.getInstance().recordEventPage(recordLevel, "LOADING_EXIT", "LOADING", str2, "SUCCESS");
                } else {
                    RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "START_INIT", "action", "initSDK", NotificationCompat.CATEGORY_STATUS, "error", "productCode", strM145550i0, "errMsg", ncm.f138211u);
                    m18114V0(str);
                }
                finish();
            }
            if (pcm.f148192e.equals(strM145550i0)) {
                if ("1".equals(strM145553j0)) {
                    zM110212b = d720.m110216f(this);
                    if (!zM110212b) {
                        str3 = ncm.f138213w;
                    }
                } else {
                    zM110212b = m18116X0(nfcConfigResM145488L);
                }
            } else if (pcm.f148193f.equals(strM145550i0)) {
                zM110212b = "1".equals(strM145553j0) ? d720.m110216f(this) : d720.m110215e(false, this);
            } else {
                zM110212b = true;
            }
        }
        str = str3;
        str2 = (System.currentTimeMillis() - this.f12718c) + "ms";
        if (zM110212b) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "START_INIT", "action", "initSDK", NotificationCompat.CATEGORY_STATUS, "error", "productCode", strM145550i0, "errMsg", ncm.f138211u);
            m18114V0(str);
        } else {
            RecordService recordService2 = RecordService.getInstance();
            RecordLevel recordLevel2 = RecordLevel.LOG_INFO;
            recordService2.recordEvent(recordLevel2, "START_INIT", "action", "initSDK", NotificationCompat.CATEGORY_STATUS, "success", "productCode", strM145550i0);
            RecordService.getInstance().recordEventPage(recordLevel2, "LOADING_EXIT", "LOADING", str2, "SUCCESS");
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public void m18114V0(String str) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1001;
        messageObtain.obj = str;
        this.f12719d.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public void m18115W0(OSSConfig oSSConfig, String str, String str2, boolean z) {
        NfcConfigRes nfcConfigResM145488L;
        if (m18109P0()) {
            return;
        }
        Map map = (Map) JSON.parseObject(str2, Map.class);
        if (map != null && !map.isEmpty()) {
            boolean zContainsKey = map.containsKey("docVideo");
            boolean zContainsKey2 = map.containsKey("model");
            boolean zContainsKey3 = map.containsKey("faceLivenessFarNearOpen");
            boolean zContainsKey4 = map.containsKey("faceLivenessFarNearConfig");
            boolean zContainsKey5 = map.containsKey("appQualityCheck");
            boolean zContainsKey6 = map.containsKey("clientLivenessTimeout");
            boolean zContainsKey7 = map.containsKey("docPageConfig");
            boolean zContainsKey8 = map.containsKey("docMode");
            boolean zContainsKey9 = map.containsKey("showGuidePage");
            boolean zContainsKey10 = map.containsKey("nfcConfig");
            boolean zContainsKey11 = map.containsKey("useNFC");
            boolean zContainsKey12 = map.containsKey("chameleonFrameEnable");
            boolean zContainsKey13 = map.containsKey("chameleon");
            boolean zContainsKey14 = map.containsKey("useOssSdk");
            map.containsKey("getOssSdkDegrade");
            boolean zContainsKey15 = map.containsKey("deviceCompressImageSwitch");
            boolean zContainsKey16 = map.containsKey("authUrls");
            boolean zContainsKey17 = map.containsKey("authorizationAgreementLinkId");
            boolean zContainsKey18 = map.containsKey("authorizationAgreementLinkEn");
            if (zContainsKey16) {
                try {
                    List<String> array = JSON.parseArray(JSON.toJSONString(map.get("authUrls")), String.class);
                    kb20.m145197b().m145203f(array);
                    kcm.m145452H().m145498O0((!z || array == null || array.isEmpty()) ? false : true);
                } catch (Exception e) {
                    RecordService.getInstance().recordException(e);
                }
            }
            if (zContainsKey17) {
                Object obj = map.get("authorizationAgreementLinkId");
                if (obj instanceof String) {
                    kcm.m145452H().m145475G0((String) obj);
                }
            }
            if (zContainsKey18) {
                Object obj2 = map.get("authorizationAgreementLinkEn");
                if (obj2 instanceof String) {
                    kcm.m145452H().m145472F0((String) obj2);
                }
            }
            if (zContainsKey15) {
                Object obj3 = map.get("deviceCompressImageSwitch");
                if (obj3 instanceof String) {
                    if ("N".equals(obj3)) {
                        kcm.m145452H().m145501P0(false);
                    } else if ("Y".equals(obj3)) {
                        kcm.m145452H().m145501P0(true);
                    }
                }
            }
            if (zContainsKey14) {
                Object obj4 = map.get("useOssSdk");
                if (obj4 instanceof String) {
                    if ("N".equals(obj4)) {
                        kcm.m145452H().m145487K1(false);
                    } else if ("Y".equals(obj4)) {
                        kcm.m145452H().m145487K1(true);
                    }
                }
            }
            if (zContainsKey12) {
                Object obj5 = map.get("chameleonFrameEnable");
                if (obj5 instanceof Boolean) {
                    kcm.m145452H().m145492M0(((Boolean) obj5).booleanValue());
                }
            }
            if (zContainsKey13) {
                try {
                    kcm.m145452H().m145489L0((Chameleon) d300.m109843g(JSON.toJSONString(map.get("chameleon")), Chameleon.class));
                } catch (Exception e2) {
                    RecordService.getInstance().recordException(e2);
                }
            }
            if (zContainsKey11) {
                Object obj6 = map.get("useNFC");
                if (obj6 instanceof String) {
                    kcm.m145452H().m145508R1((String) obj6);
                }
            }
            if (zContainsKey10) {
                try {
                    kcm.m145452H().m145560l1((NfcConfigRes) d300.m109843g(JSON.toJSONString(map.get("nfcConfig")), NfcConfigRes.class));
                } catch (Exception e3) {
                    RecordService.getInstance().recordException(e3);
                }
            }
            if (zContainsKey8) {
                Object obj7 = map.get("docMode");
                if (obj7 instanceof String) {
                    kcm.m145452H().m145481I1((String) obj7);
                }
            }
            if (zContainsKey9) {
                Object obj8 = map.get("showGuidePage");
                if (obj8 instanceof String) {
                    kcm.m145452H().m145502P1((String) obj8);
                }
            }
            if (zContainsKey7) {
                try {
                    kcm.m145452H().m145507R0(JSON.parseArray(JSON.toJSONString(map.get("docPageConfig")), String.class));
                } catch (Exception e4) {
                    RecordService.getInstance().recordException(e4);
                }
            }
            if (zContainsKey) {
                Object obj9 = map.get("docVideo");
                if (obj9 instanceof String) {
                    kcm.m145452H().m145516U0((String) obj9);
                }
            }
            if (zContainsKey2) {
                Object obj10 = map.get("model");
                if (obj10 instanceof String) {
                    String strM145556k0 = kcm.m145452H().m145556k0();
                    if (strM145556k0 == null || obj10.equals(strM145556k0)) {
                        kcm.m145452H().m145548h1((String) obj10);
                    } else {
                        kcm.m145452H().m145548h1(strM145556k0);
                    }
                }
            }
            if (zContainsKey3) {
                Object obj11 = map.get("faceLivenessFarNearOpen");
                if (obj11 instanceof String) {
                    kcm.m145452H().m145526Z0((String) obj11);
                }
            }
            if (zContainsKey4) {
                IdentityFarNearConfig identityFarNearConfig = (IdentityFarNearConfig) JSON.parseObject(JSON.toJSONString(map.get("faceLivenessFarNearConfig")), IdentityFarNearConfig.class);
                if (identityFarNearConfig != null) {
                    identityFarNearConfig.toString();
                }
                kcm.m145452H().m145536d1(identityFarNearConfig);
            }
            if (zContainsKey5) {
                Object obj12 = map.get("appQualityCheck");
                if (obj12 instanceof String) {
                    kcm.m145452H().m145469E0((String) obj12);
                }
            }
            if (zContainsKey6) {
                Object obj13 = map.get("clientLivenessTimeout");
                ixq0.m138885b("TAG", "clientLivenessTimeout:" + obj13);
                if (obj13 != null) {
                    try {
                        kcm.m145452H().m145495N0(Float.parseFloat(String.valueOf(obj13)));
                    } catch (Exception e5) {
                        ixq0.m138885b("TAG", "clientLivenessTimeout:" + e5.getMessage());
                        RecordService.getInstance().recordException(e5);
                    }
                }
            }
        }
        if (pcm.f148194g.equalsIgnoreCase(kcm.m145452H().m145550i0()) && ((nfcConfigResM145488L = kcm.m145452H().m145488L()) == null || nfcConfigResM145488L.getNfcMode() == null || TextUtils.isEmpty(nfcConfigResM145488L.getNfcMode()))) {
            m18114V0(ncm.f138216z);
            return;
        }
        if (oSSConfig == null || oSSConfig.FileNamePrefix == null || oSSConfig.OssEndPoint == null || oSSConfig.AccessKeyId == null || oSSConfig.AccessKeySecret == null) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "START_INIT_REQUEST", "action", "initSmartDeviceRes", NotificationCompat.CATEGORY_STATUS, "fail", "errorMsg", "parseResult notValid");
            m18114V0(ncm.f138192b);
            return;
        }
        kcm.m145452H().m145484J1(oSSConfig);
        kcm.m145452H().m145566n1(str);
        kcm.m145452H().m145518V0(str2);
        ksf0.m147071e(ksf0.C18071a.f124463a, null);
        this.f12719d.sendEmptyMessage(1002);
    }

    /* JADX INFO: renamed from: X0 */
    private boolean m18116X0(NfcConfigRes nfcConfigRes) {
        String strM145587v = kcm.m145452H().m145587v();
        RecordService recordService = RecordService.getInstance();
        RecordLevel recordLevel = RecordLevel.LOG_ERROR;
        recordService.recordEvent(recordLevel, "START_CKYC", "docType", strM145587v);
        if (!mcm.f133148a.equals(strM145587v) || nfcConfigRes == null) {
            return d720.m110215e("1".equals(kcm.m145452H().m145553j0()), this);
        }
        boolean zHasSystemFeature = getPackageManager().hasSystemFeature("android.hardware.nfc");
        RecordService.getInstance().recordEvent(recordLevel, "START_CKYC", "docType", strM145587v, "FEATURE_NFC", String.valueOf(zHasSystemFeature));
        return !zHasSystemFeature ? d720.m110215e("1".equals(kcm.m145452H().m145553j0()), this) : m18117Y0(nfcConfigRes);
    }

    /* JADX INFO: renamed from: Y0 */
    private boolean m18117Y0(NfcConfigRes nfcConfigRes) {
        if (nfcConfigRes != null && nfcConfigRes.getNfcMode() != null) {
            if ("0".equals(nfcConfigRes.getNfcMode())) {
                return d720.m110213c(this);
            }
            if ("1".equals(nfcConfigRes.getNfcMode())) {
                return d720.m110215e(false, this);
            }
            if ("2".equals(nfcConfigRes.getNfcMode())) {
                return d720.m110214d(this, nfcConfigRes.getDocumentNumber(), nfcConfigRes.getDateOfBirth(), nfcConfigRes.getDateOfExpiry());
            }
        }
        return false;
    }

    private void init() {
        String strM145564n = kcm.m145452H().m145564n();
        EnvCheck.EnvErrorType envErrorTypeM18128d = EnvCheck.m18128d();
        if (EnvCheck.EnvErrorType.ENV_SUCCESS != envErrorTypeM18128d) {
            if (EnvCheck.EnvErrorType.ENV_ERROR_LOW_OS == envErrorTypeM18128d) {
                m18114V0(ncm.f138203m);
            }
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "enviromentCheck", NotificationCompat.CATEGORY_STATUS, "error", "code", String.valueOf(envErrorTypeM18128d));
            return;
        }
        String str = rcm.f158786a;
        if (str == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(strM145564n)) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "enviromentCheck", NotificationCompat.CATEGORY_STATUS, "success");
            Intent intent = getIntent();
            hc20.m130374f(strM145564n, (intent == null || !intent.hasExtra("toyger_meta_info")) ? "" : intent.getStringExtra("toyger_meta_info"), false, new C3708b(System.currentTimeMillis()));
            return;
        }
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "init", "protocol", rcm.f158786a, "certifyId", strM145564n);
        ixq0.m138885b("SystemLoadingActivity", "protocol:" + rcm.f158786a + " certifyId:" + strM145564n);
        ZimInitContent zimInitContent = (ZimInitContent) d300.m109843g(IdentityUtils.m18164sd(rcm.f158786a.getBytes(), strM145564n), ZimInitContent.class);
        m18115W0(hc20.m130372d(zimInitContent), zimInitContent.NowDate, zimInitContent.ExtProtocol, true);
    }

    /* JADX INFO: renamed from: S0 */
    public void m18118S0() {
        List<String> listM18110Q0 = m18110Q0();
        if (listM18110Q0.size() <= 0) {
            init();
        } else {
            RecordService.getInstance().recordEventBehavior(RecordLevel.LOG_INFO, "PAGER_BEHAVIOR", "permissionAlertAppear", m18111R0());
            requestPermissions((String[]) listM18110Q0.toArray(new String[0]), 1024);
        }
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(y5c0.f196412f);
        this.f12718c = System.currentTimeMillis();
        RecordService.getInstance().recordEventPage(RecordLevel.LOG_INFO, "LOADING_ENTER", "LOADING");
        TextView textView = (TextView) findViewById(l4c0.f126007p);
        if (textView != null) {
            textView.setVisibility(8);
        }
        m18118S0();
    }

    @Override // com.idv.identity.platform.IntlFaceBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "START_INIT", "action", "destroySystemLoadingActivity", "timeCost", String.valueOf((System.currentTimeMillis() - this.f12718c) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s);
        RecordService.getInstance().flush();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        RecordService recordService = RecordService.getInstance();
        RecordLevel recordLevel = RecordLevel.LOG_INFO;
        recordService.recordEventBehavior(recordLevel, "PAGER_BEHAVIOR", "permissionAlertClose", m18111R0());
        List<String> listM18110Q0 = m18110Q0();
        if (i == 1024 && listM18110Q0.size() <= 0) {
            init();
            RecordService.getInstance().recordEventBehavior(recordLevel, "PAGER_BEHAVIOR", "permissionAgreeBtn", m18111R0());
            return;
        }
        for (String str : listM18110Q0) {
        }
        RecordService.getInstance().recordEventBehavior(RecordLevel.LOG_INFO, "PAGER_BEHAVIOR", "permissionRefuseBtn", m18111R0());
        m18114V0(ncm.f138201k);
    }
}
