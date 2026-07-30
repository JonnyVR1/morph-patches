package com.hellogroup.p036mk.fdt;

import android.app.Activity;
import android.view.Window;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.hellogroup.p036mk.fdt.globalevent.FDTEventManager;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p153l.auf;
import p153l.buf;
import p153l.cuf;
import p153l.en5;
import p153l.etl;
import p153l.euf;
import p153l.jzv;
import p153l.r0w;
import p153l.s35;
import p153l.wic0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0003J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0003J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u0003J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010&\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010(\u001a\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0016\u00107\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00106R\u0016\u00108\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00106R\"\u0010<\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010!\u001a\u0004\b:\u0010#\"\u0004\b;\u0010%R\"\u0010>\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010!\u001a\u0004\b4\u0010#\"\u0004\b=\u0010%R(\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001b\u0010G\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b9\u0010F¨\u0006H"}, m88121d2 = {"Lcom/hellogroup/mk/fdt/FDTManager;", "", "<init>", "()V", "", "token", "", Constants.KEY_ACTIONS, "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/util/List;)V", "encryptToken", "j", "(Ljava/lang/String;)Ljava/lang/String;", "Lorg/json/JSONObject;", CommandMessage.PARAMS, "Lcom/hellogroup/mk/fdt/FDTManager$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "m", "(Lorg/json/JSONObject;Lcom/hellogroup/mk/fdt/FDTManager$a;)V", "a", "n", "b", "c", "(Lcom/hellogroup/mk/fdt/FDTManager$a;)V", "e", "g", "()Ljava/lang/String;", "Landroid/app/Activity;", "activity", BLiveStormDanmakuGiftResourceType.f45292l, "(Landroid/app/Activity;)V", "", "Z", "getTrustLocalHostUrl", "()Z", "setTrustLocalHostUrl", "(Z)V", "trustLocalHostUrl", "Ll/etl;", "Lkotlin/Lazy;", "h", "()Ll/etl;", "mIFDTRepository", "Ll/r0w;", "Ll/r0w;", "mLoginFDTUseCase", "Ll/s35;", "Ll/s35;", "mCheckFDTTokenUseCase", "Lcom/hellogroup/mk/fdt/FDTManager$a;", "mLoginListener", "f", "mActionListener", "Ljava/lang/String;", "mFDTIp", "mFDTMacAddress", RXScreenCaptureService.KEY_INDEX, "k", "setWebViewDebug", "webViewDebug", "setAuthDevice", "authDevice", "Ljava/util/List;", "getMInjectWebViewIdList", "()Ljava/util/List;", "setMInjectWebViewIdList", "(Ljava/util/List;)V", "mInjectWebViewIdList", "Ll/buf;", "()Ll/buf;", "mPageStore", "MKFDT_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class FDTManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static boolean trustLocalHostUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static r0w mLoginFDTUseCase;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static s35 mCheckFDTTokenUseCase;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static InterfaceC3607a mLoginListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static InterfaceC3607a mActionListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static boolean webViewDebug;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static boolean authDevice;
    public static final FDTManager INSTANCE = new FDTManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final Lazy mIFDTRepository = LazyKt__LazyJVMKt.m88118b(new Function0<cuf>() { // from class: com.hellogroup.mk.fdt.FDTManager$mIFDTRepository$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final cuf invoke() {
            return new cuf();
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static String mFDTIp = "";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static String mFDTMacAddress = "";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private static List<String> mInjectWebViewIdList = new ArrayList();

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final Lazy mPageStore = LazyKt__LazyJVMKt.m88118b(new Function0<buf>() { // from class: com.hellogroup.mk.fdt.FDTManager$mPageStore$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final buf invoke() {
            return new buf();
        }
    });

    /* JADX INFO: renamed from: com.hellogroup.mk.fdt.FDTManager$a */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/hellogroup/mk/fdt/FDTManager$a;", "", "", "ec", "", "em", "", "a", "(ILjava/lang/String;)V", "MKFDT_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public interface InterfaceC3607a {
        /* JADX INFO: renamed from: a */
        void mo18523a(int ec, @NotNull String em);
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.fdt.FDTManager$b */
    @Metadata(m88120d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m88121d2 = {"com/hellogroup/mk/fdt/FDTManager$b", "Ll/en5;", "", "MKFDT_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C3608b extends en5<String> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f12552a;

        public C3608b(List list) {
            this.f12552a = list;
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.fdt.FDTManager$c */
    @Metadata(m88120d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m88121d2 = {"com/hellogroup/mk/fdt/FDTManager$c", "Ll/en5;", "", "MKFDT_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C3609c extends en5<String> {
    }

    private FDTManager() {
    }

    /* JADX INFO: renamed from: d */
    private final void m18509d(String token, List<String> actions) {
        jzv.m147732e("FDTManager", "FDTManager checkToken token:" + token);
        s35 s35Var = mCheckFDTTokenUseCase;
        if (s35Var != null) {
            s35Var.m102766c();
        }
        s35 s35Var2 = new s35(m18510h());
        mCheckFDTTokenUseCase = s35Var2;
        s35Var2.m102767d(new C3608b(actions), token);
    }

    /* JADX INFO: renamed from: h */
    private final etl m18510h() {
        return (etl) mIFDTRepository.getValue();
    }

    /* JADX INFO: renamed from: i */
    private final buf m18511i() {
        return (buf) mPageStore.getValue();
    }

    /* JADX INFO: renamed from: j */
    private final String m18512j(String encryptToken) {
        try {
            return wic0.INSTANCE.m206583b("MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAJt7+MOonQ4fsTsXWrNwLm1j9iSec4AXc0MGO2dSvWxzcsL4EXbQuJEUfxTmhfkBWZ4Fgjxv9PTH7Bw+RotXBRcCAwEAAQ==", encryptToken);
        } catch (Exception e) {
            jzv.m147732e("FDTManager", "解密 token 失败:" + e.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18513a(@Nullable JSONObject params, @NotNull InterfaceC3607a listener) {
        String strOptString;
        String strOptString2;
        String strOptString3;
        listener.getClass();
        jzv.m147732e("FDTManager", "FDTManager bridgeAction params:" + params);
        String str = "";
        if (params == null || (strOptString = params.optString("codef")) == null) {
            strOptString = "";
        }
        if (params == null || (strOptString2 = params.optString("codee")) == null) {
            strOptString2 = "";
        }
        JSONArray jSONArrayOptJSONArray = params != null ? params.optJSONArray("action") : null;
        if (params != null && (strOptString3 = params.optString("fdtIp")) != null) {
            str = strOptString3;
        }
        if (str.length() > 0) {
            mFDTIp = str;
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            JSONArray jSONArray = jSONArrayOptJSONArray.length() > 0 ? jSONArrayOptJSONArray : null;
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(jSONArray.getString(i));
                }
            }
        }
        jzv.m147732e("FDTManager", "FDTManager executeAction actions:" + arrayList + ", encryptToken:" + strOptString);
        mActionListener = listener;
        String strM18512j = m18512j(strOptString);
        jzv.m147732e("FDTManager", "FDTManager executeAction token:" + strM18512j);
        if (strM18512j.length() != 0 && !arrayList.isEmpty()) {
            m18509d(strM18512j + strOptString2, arrayList);
            return;
        }
        jzv.m147732e("FDTManager", "FDTManager executeAction 参数错误 params:" + params);
        InterfaceC3607a interfaceC3607a = mLoginListener;
        if (interfaceC3607a != null) {
            interfaceC3607a.mo18523a(3, "参数错误");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m18514b() {
        mLoginListener = null;
        mActionListener = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m18515c(@NotNull InterfaceC3607a listener) {
        listener.getClass();
        if (trustLocalHostUrl) {
            listener.mo18523a(1, "已连接");
        } else {
            listener.mo18523a(0, "未连接");
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m18516e() {
        m18522n();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m18517f() {
        return authDevice;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m18518g() {
        return mFDTIp;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m18519k() {
        return webViewDebug;
    }

    /* JADX INFO: renamed from: l */
    public final void m18520l(@Nullable Activity activity) {
        Window window;
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.addFlags(128);
    }

    /* JADX INFO: renamed from: m */
    public final void m18521m(@Nullable JSONObject params, @NotNull InterfaceC3607a listener) {
        String strOptString;
        String strOptString2;
        listener.getClass();
        jzv.m147732e("FDTManager", "FDTManager login params:" + params);
        String str = "";
        if (params == null || (strOptString = params.optString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, "")) == null) {
            strOptString = "";
        }
        mFDTIp = strOptString;
        if (params != null && (strOptString2 = params.optString("mac_address", "")) != null) {
            str = strOptString2;
        }
        mFDTMacAddress = str;
        jzv.m147732e("FDTManager", "FDTManager login ip:" + mFDTIp + ", mac:" + mFDTMacAddress);
        mLoginListener = listener;
        if (mFDTIp.length() != 0 && mFDTMacAddress.length() != 0) {
            r0w r0wVar = mLoginFDTUseCase;
            if (r0wVar != null) {
                r0wVar.m102766c();
            }
            r0w r0wVar2 = new r0w(m18510h());
            mLoginFDTUseCase = r0wVar2;
            r0wVar2.m102767d(new C3609c(), mFDTMacAddress);
            return;
        }
        jzv.m147732e("FDTManager", "FDTManager login 参数错误 params:" + params);
        InterfaceC3607a interfaceC3607a = mLoginListener;
        if (interfaceC3607a != null) {
            interfaceC3607a.mo18523a(3, "参数错误");
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m18522n() {
        authDevice = false;
        jzv.m147732e("FDTManager", "reset");
        auf aufVar = auf.INSTANCE;
        aufVar.m100386k(null);
        mFDTIp = "";
        webViewDebug = false;
        r0w r0wVar = mLoginFDTUseCase;
        if (r0wVar != null) {
            r0wVar.m102766c();
        }
        s35 s35Var = mCheckFDTTokenUseCase;
        if (s35Var != null) {
            s35Var.m102766c();
        }
        trustLocalHostUrl = false;
        aufVar.m100387l(false);
        euf.INSTANCE.m122562a();
        m18511i().m106518a();
        mInjectWebViewIdList.clear();
        FDTEventManager.m18525b().m18527d(new FDTEventManager.Event("fdt_disconnect").m18533c("native"));
    }
}
