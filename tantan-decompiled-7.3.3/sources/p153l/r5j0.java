package p153l;

import com.alibaba.fastjson.JSON;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0003J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0003J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0014\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, m88121d2 = {"Ll/r5j0;", "", "<init>", "()V", "", "e", Constants.INAPP_DATA_TAG, "c", RXScreenCaptureService.KEY_INDEX, "h", "Lv/VDraweeView;", OMSTemplateModeType.view, "j", "(Lv/VDraweeView;)V", "", "g", "()Z", "a", "Lkotlin/Lazy;", "f", "picksEnable", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class r5j0 {

    @NotNull
    public static final r5j0 INSTANCE = new r5j0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy picksEnable = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.p5j0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(r5j0.m179865b());
        }
    });

    /* JADX INFO: renamed from: a */
    public static Boolean m179864a(int i) {
        return Boolean.valueOf(uqb0.f180400f0 == i);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m179865b() {
        return INSTANCE.m179870g();
    }

    /* JADX INFO: renamed from: c */
    public final void m179866c() {
        i4g0.m138520r("e_intl_picks_user_card", "p_intl_picks_main_page");
    }

    /* JADX INFO: renamed from: d */
    public final void m179867d() {
        i4g0.m138520r("e_intl_picks_entrance", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: e */
    public final void m179868e() {
        i4g0.m138526x("e_intl_picks_entrance", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: f */
    public final boolean m179869f() {
        return ((Boolean) picksEnable.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m179870g() {
        if (IntlCountryCodeController.m29114k()) {
            return false;
        }
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("intl_premium_picks_switch");
            strM80485F.getClass();
            JSONObject jSONObject = new JSONObject(strM80485F);
            return jSONObject.getBoolean("enable") && jyb.m147520m(JSON.parseArray(jSONObject.getString("mcc"), Integer.TYPE), new qcj() { // from class: l.q5j0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return r5j0.m179864a(((Integer) obj).intValue());
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m179871h() {
        i4g0.m138520r("e_intl_picks_purchase_button", "p_intl_picks_main_page");
    }

    /* JADX INFO: renamed from: i */
    public final void m179872i() {
        i4g0.m138526x("e_intl_picks_purchase_button", "p_intl_picks_main_page");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX INFO: renamed from: j */
    public final void m179873j(@NotNull VDraweeView view) {
        String str;
        view.getClass();
        switch (jfr.INSTANCE.m144707e()) {
            case "id-ID":
                str = "https://static.tancdn.com/pe-webplatform/77ym6AkpknAVmNO0PMUTa8si.webp";
                break;
            case "ja-JP":
                str = "https://static.tancdn.com/pe-webplatform/MFnDyI94I8Ikpbzwa27Kg1TH.webp";
                break;
            case "ko-KR":
                str = "https://static.tancdn.com/pe-webplatform/LAx0R4TsxN2uAYUBXm1Dezxa.webp";
                break;
            case "th-TH":
                str = "https://static.tancdn.com/pe-webplatform/xs7hiHCzPhauoG1OhZoTN_Xw.webp";
                break;
            case "vi-VN":
                str = "https://static.tancdn.com/pe-webplatform/hQwxrhP26o2rSGR46ufWvw-L.webp";
                break;
            case "zh-CN":
                str = "https://static.tancdn.com/pe-webplatform/1xMR8nVosdqRs26RL9SiBvWG.webp";
                break;
            case "zh-TW":
                str = "https://static.tancdn.com/pe-webplatform/hDyXIWFDU5uDkm3ycESIncSQ.webp";
                break;
            default:
                str = "https://static.tancdn.com/pe-webplatform/cAasSUuwntP_J-bihzKTVXSR.webp";
                break;
        }
        uqb0.f180374G.m127115L0(view, str);
    }
}
