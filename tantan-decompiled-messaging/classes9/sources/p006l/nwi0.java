package p006l;

import com.alibaba.fastjson.JSON;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import l.idr;
import l.vwb;
import l.w9j;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0003J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0003J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0014\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, d2 = {"Ll/nwi0;", "", "<init>", "()V", "", "e", "d", "c", "i", "h", "Lv/VDraweeView;", "view", "j", "(Lv/VDraweeView;)V", "", "g", "()Z", "a", "Lkotlin/Lazy;", "f", "picksEnable", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class nwi0 {

    @NotNull
    public static final nwi0 INSTANCE = new nwi0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy picksEnable = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.lwi0
        public final Object invoke() {
            return Boolean.valueOf(nwi0.m20247b());
        }
    });

    /* JADX INFO: renamed from: a */
    public static Boolean m20246a(int i) {
        return Boolean.valueOf(qib0.f19808f0 == i);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m20247b() {
        return INSTANCE.m20252g();
    }

    /* JADX INFO: renamed from: c */
    public final void m20248c() {
        zvf0.r("e_intl_picks_user_card", "p_intl_picks_main_page");
    }

    /* JADX INFO: renamed from: d */
    public final void m20249d() {
        zvf0.r("e_intl_picks_entrance", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: e */
    public final void m20250e() {
        zvf0.x("e_intl_picks_entrance", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: f */
    public final boolean m20251f() {
        return ((Boolean) picksEnable.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m20252g() {
        if (IntlCountryCodeController.m10k()) {
            return false;
        }
        try {
            String strF = RemoteConfig.x().F("intl_premium_picks_switch");
            strF.getClass();
            JSONObject jSONObject = new JSONObject(strF);
            return jSONObject.getBoolean("enable") && vwb.m(JSON.parseArray(jSONObject.getString("mcc"), Integer.TYPE), new w9j() { // from class: l.mwi0
                public final Object call(Object obj) {
                    return nwi0.m20246a(((Integer) obj).intValue());
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m20253h() {
        zvf0.r("e_intl_picks_purchase_button", "p_intl_picks_main_page");
    }

    /* JADX INFO: renamed from: i */
    public final void m20254i() {
        zvf0.x("e_intl_picks_purchase_button", "p_intl_picks_main_page");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX INFO: renamed from: j */
    public final void m20255j(@NotNull VDraweeView view) {
        String str;
        view.getClass();
        switch (idr.INSTANCE.e()) {
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
        qib0.f19782G.m12744L0(view, str);
    }
}
