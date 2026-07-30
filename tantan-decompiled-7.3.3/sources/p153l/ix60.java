package p153l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLabel;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.ScenarioCategory;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.Collections;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ'\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\rJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\rJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\rJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J)\u0010'\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100%2\u0006\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0010H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0010H\u0002¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010*J\u000f\u0010-\u001a\u00020\u0010H\u0002¢\u0006\u0004\b-\u0010*J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\b2\u0006\u00101\u001a\u00020\u0010H\u0002¢\u0006\u0004\b2\u00103J\r\u00105\u001a\u000204¢\u0006\u0004\b5\u00106J\u001d\u0010:\u001a\u00020\b2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u0010¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b<\u0010=J\u0015\u0010>\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b>\u0010=J\u0015\u0010?\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b?\u0010@J\u0015\u0010A\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\bA\u0010=J\r\u0010B\u001a\u00020\u0006¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u0006¢\u0006\u0004\bD\u0010CJ\u0015\u0010E\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bE\u0010FJ\u0015\u0010G\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bG\u0010FJ\u0015\u0010H\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bH\u0010FJ\u0015\u0010I\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bI\u0010FJ-\u0010L\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u00102\u0006\u0010K\u001a\u00020\u0010¢\u0006\u0004\bL\u0010MJ\u0015\u0010N\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0013¢\u0006\u0004\bN\u0010OJ\u0015\u0010Q\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020P¢\u0006\u0004\bQ\u0010RJ\u0015\u0010S\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020P¢\u0006\u0004\bS\u0010RJ\u0015\u0010U\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020T¢\u0006\u0004\bU\u0010VJ!\u0010W\u001a\u00020\b2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\"\u00020\u0013¢\u0006\u0004\bW\u0010XJ!\u0010Y\u001a\u00020\b2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\"\u00020\u0013¢\u0006\u0004\bY\u0010XJ\u0015\u0010Z\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0013¢\u0006\u0004\bZ\u0010OJ\u0015\u0010[\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020T¢\u0006\u0004\b[\u0010VJ\u001d\u0010\\\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u00108\u001a\u000207¢\u0006\u0004\b\\\u0010]J\u0015\u0010^\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0013¢\u0006\u0004\b^\u0010OJ\u0015\u0010_\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0013¢\u0006\u0004\b_\u0010OJ\u0015\u0010`\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0013¢\u0006\u0004\b`\u0010OJ!\u0010a\u001a\u00020\b2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\"\u00020\u0013¢\u0006\u0004\ba\u0010XJ!\u0010b\u001a\u00020\b2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\"\u00020\u0013¢\u0006\u0004\bb\u0010XJ!\u0010c\u001a\u00020\b2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\"\u00020\u0013¢\u0006\u0004\bc\u0010XJ%\u0010g\u001a\u00020\b2\u0006\u0010d\u001a\u00020\u00132\u0006\u0010f\u001a\u00020e2\u0006\u00108\u001a\u000207¢\u0006\u0004\bg\u0010hJ\r\u0010j\u001a\u00020i¢\u0006\u0004\bj\u0010kJ\u001b\u0010n\u001a\u00020\u000b2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020i0l¢\u0006\u0004\bn\u0010oJ'\u0010r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010p\u001a\u00020\u000b2\b\b\u0002\u0010q\u001a\u00020\u000b¢\u0006\u0004\br\u0010sJ\u001d\u0010t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010p\u001a\u00020\u000b¢\u0006\u0004\bt\u0010uJ\r\u0010v\u001a\u00020\u000b¢\u0006\u0004\bv\u0010\rJ\r\u0010w\u001a\u00020\b¢\u0006\u0004\bw\u0010\u0003J\r\u0010x\u001a\u00020\b¢\u0006\u0004\bx\u0010\u0003J\r\u0010y\u001a\u00020\b¢\u0006\u0004\by\u0010\u0003J\r\u0010z\u001a\u00020\b¢\u0006\u0004\bz\u0010\u0003J\r\u0010{\u001a\u00020\b¢\u0006\u0004\b{\u0010\u0003R\u001b\u0010\u007f\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010*R\u0018\u0010\u0081\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u0018R\u0018\u0010\u0083\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b2\u0010\u0082\u0001¨\u0006\u0084\u0001"}, m88121d2 = {"Ll/ix60;", "", "<init>", "()V", "Lv/VDraweeView;", OMSTemplateModeType.view, "", "img", "", "L", "(Lv/VDraweeView;Ljava/lang/String;)V", "", Constants.KEY_T, "()Z", "u", ResourceDirection.f39656v, "", "color", "", "Landroid/widget/TextView;", "views", "a0", "(I[Landroid/widget/TextView;)V", "text", "Z", "(Ljava/lang/String;[Landroid/widget/TextView;)V", BLiveStormDanmakuGiftResourceType.f45294s, "r", "w", "Lcom/p1/mobile/putong/data/User;", "user", "f", "(Lcom/p1/mobile/putong/data/User;)I", "Ll/wyd0;", BaseSei.f14626Z, "()Ll/wyd0;", "str", "Ll/bkj0;", "", BaseSei.f14625Y, "(Ljava/lang/String;)Ll/bkj0;", RXScreenCaptureService.KEY_INDEX, "()I", "j", BLiveStormDanmakuGiftResourceType.f45292l, "g", Constants.KEY_CONFIG, "B", "(Ljava/lang/String;)I", "from", "c", "(I)V", "Ll/jxd0;", BaseSei.f14624X, "()Ll/jxd0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "source", "e0", "(Lcom/p1/mobile/android/app/Act;I)V", "m", "(Lcom/p1/mobile/putong/data/User;)Z", "q", "n", "(Lcom/p1/mobile/putong/data/User;)V", "p", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "e", "M", "(Lv/VDraweeView;)V", BloodType.f39576O, "N", "D", "width", "height", "H", "(Lv/VDraweeView;Ljava/lang/String;II)V", "b0", "(Landroid/widget/TextView;)V", "Landroid/widget/ImageView;", "F", "(Landroid/widget/ImageView;)V", "P", "Landroid/view/View;", c4s.C_ZONE, "(Landroid/view/View;)V", "G", "([Landroid/widget/TextView;)V", "c0", "Y", p7f.GPS_DIRECTION_TRUE, "X", "(Landroid/widget/TextView;Lcom/p1/mobile/android/app/Act;)V", p7f.LATITUDE_SOUTH, "Q", "R", "U", "W", p7f.GPS_MEASUREMENT_INTERRUPTED, SocialConstants.PARAM_APP_DESC, "Landroid/widget/Button;", "upload", "E", "(Landroid/widget/TextView;Landroid/widget/Button;Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/data/MediaLabel;", "h", "()Lcom/p1/mobile/putong/data/MediaLabel;", "", "labels", "o", "(Ljava/util/List;)Z", "isFemale", "isSmall", "J", "(Lv/VDraweeView;ZZ)V", "I", "(Lv/VDraweeView;Z)V", "d0", "f0", "h0", "g0", "i0", "A", "a", "Lkotlin/Lazy;", "k", "swipeCount", "b", "twActivity", "Ljava/lang/String;", "showType", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ix60 {

    @NotNull
    public static final ix60 INSTANCE = new ix60();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy swipeCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean twActivity;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static String showType;

    static {
        uqb0.f180374G.m127154r0("https://auto.tancdn.com/v1/raw/d37ac8e1-2154-4466-b0a3-4623fa6dbda113.webp");
        uqb0.f180374G.m127154r0("https://auto.tancdn.com/v1/raw/c3b30867-9826-477f-945d-d1012ff2745413.webp");
        uqb0.f180374G.m127154r0("https://auto.tancdn.com/v1/raw/427e91f6-ff46-4b09-94d7-9f2a9e04d84113.webp");
        uqb0.f180374G.m127154r0("https://auto.tancdn.com/v1/raw/81e40dd4-2472-457f-8aa8-4a53865868d513.webp");
        uqb0.f180374G.m127154r0("https://auto.tancdn.com/v1/raw/967dac02-d97c-40ea-ad9c-34e00968548b13.webp");
        uqb0.f180374G.m127154r0("https://auto.tancdn.com/v1/raw/3cf4962c-eb67-4157-92e8-ab52b7947d2b13.webp");
        uqb0.f180374G.m127154r0("https://auto.tancdn.com/v1/raw/3e78db8c-32a7-4c63-bb2c-1fe47fa1477e13.webp");
        uqb0.f180374G.m127154r0("https://auto.tancdn.com/v1/raw/a2bd0491-4018-4a60-991d-656babc06e8713.webp");
        swipeCount = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.gx60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(ix60.m142436a());
            }
        });
        showType = "pet";
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m142435K(ix60 ix60Var, VDraweeView vDraweeView, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = true;
        }
        ix60Var.m142447J(vDraweeView, z, z2);
    }

    /* JADX INFO: renamed from: a */
    public static int m142436a() {
        return INSTANCE.m142473g();
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m142437b(int i) {
        return Boolean.valueOf(uqb0.f180400f0 == i);
    }

    /* JADX INFO: renamed from: A */
    public final void m142438A() {
        i4g0.m138526x("e_petactivities_usershow", "p_activities_pets_page");
    }

    /* JADX INFO: renamed from: B */
    public final int m142439B(String config) {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F(config);
            strM80485F.getClass();
            JSONObject jSONObject = new JSONObject(strM80485F);
            if (jSONObject.getBoolean("enable")) {
                JSONArray jSONArray = jSONObject.getJSONArray("area");
                int length = jSONArray.length();
                boolean z = false;
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof JSONObject) {
                        if (jyb.m147520m(JSON.parseArray(((JSONObject) obj).getString("reverse_mcc"), Integer.TYPE), new qcj() { // from class: l.hx60
                            @Override // p153l.qcj
                            public final Object call(Object obj2) {
                                return ix60.m142437b(((Integer) obj2).intValue());
                            }
                        })) {
                            return -1;
                        }
                        if (Intrinsics.m88377d(IntlCountryCodeController.m29107d(uqb0.f180400f0), "TAIWAN") && ((JSONObject) obj).getBoolean("taiwan_active")) {
                            z = true;
                        }
                        twActivity = z;
                        return ((JSONObject) obj).getInt("swipe_count");
                    }
                }
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    /* JADX INFO: renamed from: C */
    public final void m142440C(@NotNull View view) {
        view.getClass();
        if (m142488s()) {
            view.setBackgroundResource(dbc0.f86821ac);
        } else if (m142492w()) {
            view.setBackgroundResource(dbc0.f86213Hc);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m142441D(@NotNull VDraweeView view) {
        view.getClass();
        if (m142492w()) {
            int iM175859d = qa00.m175859d(200.0f);
            m142445H(view, "https://auto.tancdn.com/v1/images/eyJpZCI6IjI3TlZRSzRNVTdBVEIzSERKS1E2SU42WjY2Nzc3UDEzIiwidyI6NDAwLCJoIjo0MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjkyOTUzOTQyOTUzMzAwNTV9.png", iM175859d, iM175859d);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m142442E(@NotNull TextView desc, @NotNull Button upload, @NotNull Act act) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        desc.getClass();
        upload.getClass();
        act.getClass();
        if (!twActivity) {
            if (m142488s()) {
                string = act.getString(R$string.f18725O8);
            } else {
                string = m142492w() ? act.getString(R$string.f19025Y8) : act.getString(R$string.f18815R8);
            }
            string.getClass();
        } else if (m142488s()) {
            string = "「運動熱照」";
        } else {
            string = m142492w() ? "「旅行美照」" : "寵物貼紙";
        }
        if (!twActivity) {
            string2 = act.getString(R$string.f19220ek);
            string2.getClass();
        } else if (m142488s()) {
            string2 = "「探探運動日」";
        } else {
            string2 = m142492w() ? "「探探旅行團」" : "「單身狗派對」";
        }
        if (m142488s()) {
            desc.setTextColor(k3d0.m148005a(c9c0.f80322B0));
            upload.setBackgroundResource(dbc0.f86854bc);
        } else if (m142492w()) {
            desc.setTextColor(k3d0.m148005a(c9c0.f80440n0));
            upload.setBackgroundResource(dbc0.f86245Ic);
        }
        if (m142493x().get().booleanValue()) {
            if (twActivity) {
                desc.setGravity(1);
            }
            desc.setText(act.getString(R$string.f18875T8));
            upload.setText(act.getString(R$string.f18845S8));
            return;
        }
        if (twActivity) {
            desc.setGravity(8388611);
        }
        if (m142488s()) {
            if (twActivity) {
                string5 = "上傳你的「運動熱照」，即可領取運動徽章，更有機會參加線下「探探運動日」，遇見志同道合的朋友，運動從此不再孤單！";
            } else {
                string5 = act.getString(R$string.f18695N8, string);
                string5.getClass();
            }
            desc.setText(q8g0.m175796b0(string5, twActivity ? jyb.m147507f0(string, string2) : jyb.m147507f0(string), k3d0.m148005a(c9c0.f80337G0), lyh0.m156283c(2)));
            return;
        }
        if (m142492w()) {
            if (twActivity) {
                string4 = "上傳你的「旅行美照」，即可領取旅行貼紙，更有機會參加線下「探探旅行團」，找到結伴的團友，一起出發去旅遊吧！";
            } else {
                string4 = act.getString(R$string.f18995X8, string);
                string4.getClass();
            }
            desc.setText(q8g0.m175796b0(string4, twActivity ? jyb.m147507f0(string, string2) : jyb.m147507f0(string), k3d0.m148005a(c9c0.f80340H0), lyh0.m156283c(2)));
            return;
        }
        if (twActivity) {
            string3 = "現在上傳你與萌寵的照片，擁有專屬寵物貼紙，並有機會參加線下「單身狗派對」，期待你攜汪星人一起遇見新朋友！";
        } else {
            string3 = act.getString(R$string.f18785Q8, string, string2);
            string3.getClass();
        }
        desc.setText(q8g0.m175796b0(string3, jyb.m147507f0(string, string2), k3d0.m148005a(c9c0.f80328D0), lyh0.m156283c(2)));
    }

    /* JADX INFO: renamed from: F */
    public final void m142443F(@NotNull ImageView view) {
        view.getClass();
        if (m142488s()) {
            view.setBackgroundResource(dbc0.f86887cc);
        } else if (m142492w()) {
            view.setBackgroundResource(dbc0.f86277Jc);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m142444G(@NotNull TextView... views) {
        int iM148005a;
        views.getClass();
        if (m142488s()) {
            iM148005a = k3d0.m148005a(c9c0.f80322B0);
        } else {
            iM148005a = m142492w() ? k3d0.m148005a(c9c0.f80440n0) : -1;
        }
        m142463a0(iM148005a, views);
    }

    /* JADX INFO: renamed from: H */
    public final void m142445H(@NotNull VDraweeView view, @NotNull String img, int width, int height) {
        view.getClass();
        img.getClass();
        uqb0.f180374G.m127109I0(view, img, width, height);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX INFO: renamed from: I */
    public final void m142446I(@NotNull VDraweeView view, boolean isFemale) {
        view.getClass();
        String str = "https://auto.tancdn.com/v1/raw/427e91f6-ff46-4b09-94d7-9f2a9e04d84113.webp";
        if (!m142489t()) {
            if (Intrinsics.m88377d(IntlCountryCodeController.m29107d(uqb0.f180400f0), "SEA") || Intrinsics.m88377d(IntlCountryCodeController.m29107d(uqb0.f180400f0), "SA")) {
                if (isFemale) {
                    if (m142487r()) {
                        str = "https://auto.tancdn.com/v1/raw/81e40dd4-2472-457f-8aa8-4a53865868d513.webp";
                    } else if (m142488s()) {
                        str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkgyUENQQVBZTFc0VVVPVlNNSVlSNk9JTkFGSEM1STEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTI4ODg1MDA4MDMxOTE0NTk1fQ.png";
                    } else {
                        str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ilk2VUg1SU5WVkVMRUtVVzI2V0M0RkRPTUo1M0hGUTEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTI2OTkyOTAxNTE3OTg3NTczNH0.png";
                    }
                } else if (m142487r()) {
                    str = "https://auto.tancdn.com/v1/raw/967dac02-d97c-40ea-ad9c-34e00968548b13.webp";
                } else if (m142488s()) {
                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlVOSzNMNE9RV0IzMkFTWkxEWVEzTEZJQVpLWExZWTEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3Mjk4NzMwOTg1ODQ5MTg0Njg4fQ.png";
                } else {
                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IjJDR1dHMkxZTlVTSDRKVVFHWUxXTk5ZSEFRNVM2QzEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNjI0Mzc3Njc2ODg0NDMxMzA0fQ.png";
                }
            } else if (IntlCountryCodeController.m29125v()) {
                if (isFemale) {
                    if (m142487r()) {
                        str = "https://auto.tancdn.com/v1/raw/c3b30867-9826-477f-945d-d1012ff2745413.webp";
                    } else if (m142488s()) {
                        str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9ZVjRHU1c1NEZHSkxTV1hSVVBZVUJFSUY0WTZXQzEzIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNzQxNjc4MTgzMzA3MDM4NDc3OH0.png";
                    } else {
                        str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9TWlNXVENNSUg0Q1BGT1NTVU1FTUFONFFQRFFJUjEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1MzU5OTY1NjE5MTgwMDkxMTAwfQ.png";
                    }
                } else if (m142487r()) {
                    str = "https://auto.tancdn.com/v1/raw/967dac02-d97c-40ea-ad9c-34e00968548b13.webp";
                } else if (m142488s()) {
                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ik5PTTZIUUE2M1BQVjJWUE5RNkJVN05RM1RXNUY3VjEzIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNjc3NDg1MTY2MTMzOTQ3NDE4fQ.png";
                } else {
                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IjJDR1dHMkxZTlVTSDRKVVFHWUxXTk5ZSEFRNVM2QzEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNjI0Mzc3Njc2ODg0NDMxMzA0fQ.png";
                }
            } else if (466 == uqb0.f180400f0) {
                if (isFemale) {
                    if (!m142487r()) {
                        if (m142488s()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IjY2SFJDMklKQjRUTTdHU0tEQkNESUxXRDM2MlVQNTEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTk5MTY1OTU2NDM3MTc4NjM1OH0.png";
                        } else {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ilk2VUg1SU5WVkVMRUtVVzI2V0M0RkRPTUo1M0hGUTEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTI2OTkyOTAxNTE3OTg3NTczNH0.png";
                        }
                    }
                } else if (m142487r()) {
                    str = "https://auto.tancdn.com/v1/raw/967dac02-d97c-40ea-ad9c-34e00968548b13.webp";
                } else if (m142488s()) {
                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkhURUJFTlNLWFhEN1RRUlFCVFU2UFdKU0U0SFdaVTEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1Mzg4OTk0MDM3NTkwNDgwMDUyfQ.png";
                } else {
                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IjJDR1dHMkxZTlVTSDRKVVFHWUxXTk5ZSEFRNVM2QzEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNjI0Mzc3Njc2ODg0NDMxMzA0fQ.png";
                }
            } else if (isFemale) {
                if (m142487r()) {
                    str = "https://auto.tancdn.com/v1/raw/d37ac8e1-2154-4466-b0a3-4623fa6dbda113.webp";
                } else if (m142488s()) {
                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9ZVjRHU1c1NEZHSkxTV1hSVVBZVUJFSUY0WTZXQzEzIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNzQxNjc4MTgzMzA3MDM4NDc3OH0.png";
                } else {
                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ilk2VUg1SU5WVkVMRUtVVzI2V0M0RkRPTUo1M0hGUTEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTI2OTkyOTAxNTE3OTg3NTczNH0.png";
                }
            } else if (m142487r()) {
                str = "https://auto.tancdn.com/v1/raw/967dac02-d97c-40ea-ad9c-34e00968548b13.webp";
            } else if (m142488s()) {
                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkhURUJFTlNLWFhEN1RRUlFCVFU2UFdKU0U0SFdaVTEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1Mzg4OTk0MDM3NTkwNDgwMDUyfQ.png";
            } else {
                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IjJDR1dHMkxZTlVTSDRKVVFHWUxXTk5ZSEFRNVM2QzEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNjI0Mzc3Njc2ODg0NDMxMzA0fQ.png";
            }
        }
        m142445H(view, str, qa00.m175859d(148.0f), qa00.m175859d(222.0f));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:106:0x015b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0161  */
    /* JADX WARN: Code duplicated, block: B:109:0x0164 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0166  */
    /* JADX WARN: Code duplicated, block: B:112:0x016c  */
    /* JADX WARN: Code duplicated, block: B:113:0x016f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0172  */
    /* JADX WARN: Code duplicated, block: B:116:0x0178  */
    /* JADX WARN: Code duplicated, block: B:117:0x017b  */
    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: J */
    public final void m142447J(@NotNull VDraweeView view, boolean isFemale, boolean isSmall) {
        String str;
        view.getClass();
        if (m142489t()) {
            str = "https://auto.tancdn.com/v1/raw/f09226ee-ed24-4121-a232-c9241b3c2b6013.webp";
        } else if (!m142490u()) {
            if (!m142491v()) {
                String strM144707e = jfr.INSTANCE.m144707e();
                switch (strM144707e.hashCode()) {
                    case 99994381:
                        if (!strM144707e.equals("id-ID")) {
                            if (m142492w()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlpTWkwyRUdCSUlQV1hHS1BNVE9TQUZDVUtCSFhDWjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjE1ODgzNDUzNTMzNjcwNzN9.png";
                            } else if (isFemale) {
                                if (m142487r()) {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IklFR1BYS0dSQk1LRzM1Tk5RQjJSQjZUT0lWTlhZUDEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzE2OTExOTg2OTcyMzc1ODE0fQ.png";
                                } else {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlNWVEFTWTZSQjRSWlBENUlMNko0UTNPNEFYS1hFMzEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTU3Mzk2MzMxNDUzODEzNTI2fQ.png";
                                }
                            } else if (m142487r()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkNZVkNKTlNWWTZFSVZQTkRXRVFUQk1DSDZPTlpQQzEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzI4MTMzNTg1OTM1NjA4NTgyfQ.png";
                            } else {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ1WkNaVDQ2RkVWWjI3QVRXWDdCRksySEpFNFdXQTEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjUwNDUyNzY2OTMyMTU0ODk5fQ.png";
                            }
                        } else if (m142492w()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkpZUFlJQUNPVVAyNko1TEhNS0hNTDI1VEMzVFpWUjEzIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjExMzA5NDg1MTYyMTIyNTd9.png";
                        } else if (!isFemale) {
                            str = !m142487r() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkJXRlQ3TEpSTUtGUFQyQ1lRWDZPT0gyRTczN01TTjEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNDc4ODM5NTc4NDM3NDM0MTE4fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ilo2TlJGT01USk1aSDZFWkM1TUlaTTRUMko2VlQ2RjEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTc1NDE2MjE4OTY1MDU0MjMwfQ.png";
                        } else if (!m142487r()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IjZWTDNDRFpXUVdOTU5GRURNQjQyUVVFT0xHNUFISDEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNDgxMTA4OTcwOTA3MTgzODc4fQ.png";
                        } else {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlJUWUVZTklHTEhSQVFMTFAyM1RLSVM3NzVYU01ZSjEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjUxMDIwMTE0OTMxOTU2MjQzfQ.png";
                        }
                        break;
                    case 100828572:
                        if (!strM144707e.equals("ja-JP")) {
                            if (m142492w()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlpTWkwyRUdCSUlQV1hHS1BNVE9TQUZDVUtCSFhDWjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjE1ODgzNDUzNTMzNjcwNzN9.png";
                            } else if (isFemale) {
                                if (m142487r()) {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IklFR1BYS0dSQk1LRzM1Tk5RQjJSQjZUT0lWTlhZUDEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzE2OTExOTg2OTcyMzc1ODE0fQ.png";
                                } else {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlNWVEFTWTZSQjRSWlBENUlMNko0UTNPNEFYS1hFMzEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTU3Mzk2MzMxNDUzODEzNTI2fQ.png";
                                }
                            } else if (m142487r()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkNZVkNKTlNWWTZFSVZQTkRXRVFUQk1DSDZPTlpQQzEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzI4MTMzNTg1OTM1NjA4NTgyfQ.png";
                            } else {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ1WkNaVDQ2RkVWWjI3QVRXWDdCRksySEpFNFdXQTEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjUwNDUyNzY2OTMyMTU0ODk5fQ.png";
                            }
                        } else if (m142492w()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkNRSkRQWUpEUzNIT0lSSTVTV0hXMkY1S1lYRExaMjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDg4MTA0MDQwMzAwMTcwNTl9.png";
                        } else if (!isFemale) {
                            str = !m142487r() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkZVQkpLUjIyQkQyWUJFQlBYVTVVNUU1NVdXMzVSWjEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDQyMTE0MTY4MTA4OTEwMDU1MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IktJR0o2WkhVQ09ESTZCNTJPT1JRWURHWE5IQTQ2TTEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTczMTYwMDIxMTA0ODU3ODc4fQ.png";
                        } else if (!m142487r()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IjUzNTdDSDNYWkFJRUNMU0tLTkZMV0o1RDVDN1JLWjEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTAzNTk1MDg3NTAxNzk4MTUwfQ.png";
                        } else {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk0TEdYVUkzSjZVSEFBSlc3UEc3RzZQNVRJQlBJWTEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjUxMDE1NzE2ODg1NDQ1MTM5fQ.png";
                        }
                        break;
                    case 102169200:
                        if (!strM144707e.equals("ko-KR")) {
                            if (m142492w()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlpTWkwyRUdCSUlQV1hHS1BNVE9TQUZDVUtCSFhDWjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjE1ODgzNDUzNTMzNjcwNzN9.png";
                            } else if (isFemale) {
                                if (m142487r()) {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IklFR1BYS0dSQk1LRzM1Tk5RQjJSQjZUT0lWTlhZUDEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzE2OTExOTg2OTcyMzc1ODE0fQ.png";
                                } else {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlNWVEFTWTZSQjRSWlBENUlMNko0UTNPNEFYS1hFMzEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTU3Mzk2MzMxNDUzODEzNTI2fQ.png";
                                }
                            } else if (m142487r()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkNZVkNKTlNWWTZFSVZQTkRXRVFUQk1DSDZPTlpQQzEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzI4MTMzNTg1OTM1NjA4NTgyfQ.png";
                            } else {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ1WkNaVDQ2RkVWWjI3QVRXWDdCRksySEpFNFdXQTEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjUwNDUyNzY2OTMyMTU0ODk5fQ.png";
                            }
                        } else if (m142492w()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkFCSUVFSUtYTjdXRjNGQ1g1MjJWWE9URVlIUVBJUjEzIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMDYxNTIxMjI1MDM5NDE0N30.png";
                        } else if (!isFemale) {
                            str = !m142487r() ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik1RM0hDSE5PN0k1MlYyNDRSNVJLUFI0NVoyT1JRUTEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDQxODg4OTkxNTYzNTE1MzY3MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkdJTUZPTktLS0JRUDZXUDVDUUsyR1I0NkkzMzNJUDEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTQ3MjUwMDM4MTUyNjk2NTk4fQ.png";
                        } else if (!m142487r()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkdLUzY0SjJXWkYzUEtZSU40MzVTVEJXSlJXWk8yQjEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTAzNjEyNjc5Njg3ODQyNTY2fQ.png";
                        } else {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkJKNEtWM1VFSzJDT1M0UDVFV1EzUkFNNUozVTVEMzEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2MjE4NDczNjY3OTgwNjM4NzM5fQ.png";
                        }
                        break;
                    case 110272621:
                        if (!strM144707e.equals("th-TH")) {
                            if (m142492w()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlpTWkwyRUdCSUlQV1hHS1BNVE9TQUZDVUtCSFhDWjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjE1ODgzNDUzNTMzNjcwNzN9.png";
                            } else if (isFemale) {
                                if (m142487r()) {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IklFR1BYS0dSQk1LRzM1Tk5RQjJSQjZUT0lWTlhZUDEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzE2OTExOTg2OTcyMzc1ODE0fQ.png";
                                } else {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlNWVEFTWTZSQjRSWlBENUlMNko0UTNPNEFYS1hFMzEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTU3Mzk2MzMxNDUzODEzNTI2fQ.png";
                                }
                            } else if (m142487r()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkNZVkNKTlNWWTZFSVZQTkRXRVFUQk1DSDZPTlpQQzEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzI4MTMzNTg1OTM1NjA4NTgyfQ.png";
                            } else {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ1WkNaVDQ2RkVWWjI3QVRXWDdCRksySEpFNFdXQTEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjUwNDUyNzY2OTMyMTU0ODk5fQ.png";
                            }
                        } else if (m142492w()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IldWVFRETFZGQ0JJRzZONVRLTUpaVzVWRFdLTktTQjEzIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDg4Mjc5OTYyMTYwNjE0NzV9.png";
                        } else if (!isFemale) {
                            str = !m142487r() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkhQSlM1U1BQTk5RWFlURUFGNURVSlVYNzVTWEdCWjEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjcyNDczMjkyNDg0ODg0NzYyMn0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlFFQkRUNUpCNTYzR09MVFBZU1JBUURZTVZJTUtHQTEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTU5NjUyNTI5MzE0MDA5ODc4fQ.png";
                        } else if (!m142487r()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlFKUVJRUUYyQUNCVVhRQUVWWEFPVEJDQlBPUzVESzEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTAzNjEyNjc5Njg3ODQyNTY2fQ.png";
                        } else {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IjZQWVZIRTVDSEJSQlRVSDNLSkxaMzNHUlNOTzY2VDEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2MjI3NDgwODY3MjM1Mzc5NzMxfQ.png";
                        }
                        break;
                    case 112149522:
                        if (!strM144707e.equals("vi-VN")) {
                            if (m142492w()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlpTWkwyRUdCSUlQV1hHS1BNVE9TQUZDVUtCSFhDWjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjE1ODgzNDUzNTMzNjcwNzN9.png";
                            } else if (isFemale) {
                                if (m142487r()) {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IklFR1BYS0dSQk1LRzM1Tk5RQjJSQjZUT0lWTlhZUDEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzE2OTExOTg2OTcyMzc1ODE0fQ.png";
                                } else {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlNWVEFTWTZSQjRSWlBENUlMNko0UTNPNEFYS1hFMzEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTU3Mzk2MzMxNDUzODEzNTI2fQ.png";
                                }
                            } else if (m142487r()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkNZVkNKTlNWWTZFSVZQTkRXRVFUQk1DSDZPTlpQQzEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzI4MTMzNTg1OTM1NjA4NTgyfQ.png";
                            } else {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ1WkNaVDQ2RkVWWjI3QVRXWDdCRksySEpFNFdXQTEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjUwNDUyNzY2OTMyMTU0ODk5fQ.png";
                            }
                        } else if (m142492w()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IjNBU0RYSlQ1V0w1WFA1VU1KSzJWTVJLTDVQUzZWUjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjExMzA5NDg1MTYyMTIyNTd9.png";
                        } else if (!isFemale) {
                            str = !m142487r() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjZEVEZHWU1WRlpVVUJCUVdUNlVVUlBMSjI0REVRRTEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzI1OTE5MTczMzQyMjE0OTE4fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ilk2TTdDS1QzMzdRTDVOVEhIR04ySFAyRUFMNkhFRzEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTQ2MTMyOTM0MzM4ODc2MTgyfQ.png";
                        } else if (!m142487r()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkZPQkZCRlQyVkJTRU1MMzRSSzQyWVNYREpHQVczTjEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzI4MTE3MDk3NTU2MTU5MjM4fQ.png";
                        } else {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkZZSEdLMkFLVzQyT0hZTktGTTZYUExMQ0RLN0FDMzEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2MjE4NDczNjY3OTgwNjM4NzM5fQ.png";
                        }
                        break;
                    case 115813226:
                        if (!strM144707e.equals("zh-CN")) {
                            if (m142492w()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlpTWkwyRUdCSUlQV1hHS1BNVE9TQUZDVUtCSFhDWjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjE1ODgzNDUzNTMzNjcwNzN9.png";
                            } else if (isFemale) {
                                if (m142487r()) {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IklFR1BYS0dSQk1LRzM1Tk5RQjJSQjZUT0lWTlhZUDEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzE2OTExOTg2OTcyMzc1ODE0fQ.png";
                                } else {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlNWVEFTWTZSQjRSWlBENUlMNko0UTNPNEFYS1hFMzEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTU3Mzk2MzMxNDUzODEzNTI2fQ.png";
                                }
                            } else if (m142487r()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkNZVkNKTlNWWTZFSVZQTkRXRVFUQk1DSDZPTlpQQzEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzI4MTMzNTg1OTM1NjA4NTgyfQ.png";
                            } else {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ1WkNaVDQ2RkVWWjI3QVRXWDdCRksySEpFNFdXQTEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjUwNDUyNzY2OTMyMTU0ODk5fQ.png";
                            }
                        } else if (m142492w()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ik4zUkxTV0dLRzRJQk00WUxJUzZYN0JXVkRIN1AzNjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDg4MTA0MDQwMzAwMTcwNTl9.png";
                        } else if (!isFemale) {
                            str = !m142487r() ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik5GRVVINFZTUlU2N0hFUlk0Rkk1QUpYU01CSEtXTjEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDQxODg4OTkxNTYzNTE1MzY3MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IktZV1pNRkU1VjRGMlhLS0JWRVZEM1lIWUI2QU5LVjEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTQ4Mzg0NzM0MTUyNTYxNDMwfQ.png";
                        } else if (!m142487r()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9RUDJFM0hDNVZEM1RNM1hPQTIzWEc3S0ZSR0xaRDEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTAzNTk1MDg3NTAxNzk4MTUwfQ.png";
                        } else {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkxIN0hSVkZINldONlRaQlk2V0gySlBZQUZQVVNTNjEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjQyMDEyOTE1Njc3MjE1MjUxfQ.png";
                        }
                        break;
                    case 115813762:
                        if (!strM144707e.equals("zh-TW")) {
                            if (m142492w()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlpTWkwyRUdCSUlQV1hHS1BNVE9TQUZDVUtCSFhDWjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjE1ODgzNDUzNTMzNjcwNzN9.png";
                            } else if (isFemale) {
                                if (m142487r()) {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IklFR1BYS0dSQk1LRzM1Tk5RQjJSQjZUT0lWTlhZUDEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzE2OTExOTg2OTcyMzc1ODE0fQ.png";
                                } else {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlNWVEFTWTZSQjRSWlBENUlMNko0UTNPNEFYS1hFMzEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTU3Mzk2MzMxNDUzODEzNTI2fQ.png";
                                }
                            } else if (m142487r()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkNZVkNKTlNWWTZFSVZQTkRXRVFUQk1DSDZPTlpQQzEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzI4MTMzNTg1OTM1NjA4NTgyfQ.png";
                            } else {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ1WkNaVDQ2RkVWWjI3QVRXWDdCRksySEpFNFdXQTEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjUwNDUyNzY2OTMyMTU0ODk5fQ.png";
                            }
                        } else if (m142492w()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkNRSkRQWUpEUzNIT0lSSTVTV0hXMkY1S1lYRExaMjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDg4MTA0MDQwMzAwMTcwNTl9.png";
                        } else if (!isFemale) {
                            if (!m142487r()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IjZONTRXVElIRVRNSkxNSlJXRkxKWEQzN1dRSjRWRzEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDQyMTE0MTcxNTQ0ODgzODkxOH0.png";
                            } else {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkdFWEZZUklRUVI2N01OR1RIT1BONVFPNEUzWjNERzEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTQ4Mzg0NzM0MTUyNTYxNDMwfQ.png";
                            }
                        } else if (!m142487r()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ik41SkhGUUVSQzRZVUFMUEhUQ1hFWDJNUklDWlVOSDEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTAzNTk1MDg3NTAxNzk4MTUwfQ.png";
                        } else {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlBMS1JOUDZYNzc0TjVPV0JWWU5ZTjJJWUVUNDIyTzEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjQyMDEyOTE1Njc3MjE1MjUxfQ.png";
                        }
                        break;
                    default:
                        if (m142492w()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlpTWkwyRUdCSUlQV1hHS1BNVE9TQUZDVUtCSFhDWjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjE1ODgzNDUzNTMzNjcwNzN9.png";
                        } else if (isFemale) {
                            if (m142487r()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IklFR1BYS0dSQk1LRzM1Tk5RQjJSQjZUT0lWTlhZUDEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzE2OTExOTg2OTcyMzc1ODE0fQ.png";
                            } else {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlNWVEFTWTZSQjRSWlBENUlMNko0UTNPNEFYS1hFMzEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTU3Mzk2MzMxNDUzODEzNTI2fQ.png";
                            }
                        } else if (m142487r()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkNZVkNKTlNWWTZFSVZQTkRXRVFUQk1DSDZPTlpQQzEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzI4MTMzNTg1OTM1NjA4NTgyfQ.png";
                        } else {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ1WkNaVDQ2RkVWWjI3QVRXWDdCRksySEpFNFdXQTEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjUwNDUyNzY2OTMyMTU0ODk5fQ.png";
                        }
                        break;
                }
            } else {
                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkNRSkRQWUpEUzNIT0lSSTVTV0hXMkY1S1lYRExaMjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDg4MTA0MDQwMzAwMTcwNTl9.png";
            }
        } else if (isFemale) {
            str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ik41SkhGUUVSQzRZVUFMUEhUQ1hFWDJNUklDWlVOSDEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTAzNTk1MDg3NTAxNzk4MTUwfQ.png";
        } else {
            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IjZONTRXVElIRVRNSkxNSlJXRkxKWEQzN1dRSjRWRzEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDQyMTE0MTcxNTQ0ODgzODkxOH0.png";
        }
        int iM175859d = qa00.m175859d(isSmall ? 60.0f : 132.0f);
        uqb0.f180374G.m127109I0(view, str, iM175859d, iM175859d);
    }

    /* JADX INFO: renamed from: L */
    public final void m142448L(VDraweeView view, String img) {
        int iM175859d = qa00.m175859d(100.0f);
        m142445H(view, img, iM175859d, iM175859d);
    }

    /* JADX INFO: renamed from: M */
    public final void m142449M(@NotNull VDraweeView view) {
        String str;
        view.getClass();
        if (m142488s()) {
            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IklPRVhPSFFTUEtSVk1KVVRaTkIyVEY1NFc0NzVDVzEyIiwidyI6MjAwLCJoIjoyMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2MDA1MTcwMDIxNjE4NDk5NzEzfQ.png";
        } else {
            str = m142492w() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjNJN1FBS0MyVjVQNEhNQVJEUlgzRFk2MkVIMkhIMjEyIiwidyI6MjAwLCJoIjoyMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjgxNDAzNTE1MTE0MjA3NTU5fQ.png" : "https://auto.tancdn.com/v1/raw/3cf4962c-eb67-4157-92e8-ab52b7947d2b13.webp";
        }
        m142448L(view, str);
    }

    /* JADX INFO: renamed from: N */
    public final void m142450N(@NotNull VDraweeView view) {
        String str;
        view.getClass();
        if (m142488s()) {
            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IjdQM1FFR0tBT0RMRUtFWUlWSTZYUEhXQ0ZDQkdGMzEyIiwidyI6MjAwLCJoIjoyMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjg2ODM4MDE4Njk4MTQ3NjUwMn0.png";
        } else {
            str = m142492w() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkY2WEw2N1NFVlZKTVNMTkFVWVVKRllUTlhBSkdBVDEzIiwidyI6MjAwLCJoIjoyMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1MjA5ODcwNjAwNjQ4ODYyMDQxfQ.png" : "https://auto.tancdn.com/v1/raw/a2bd0491-4018-4a60-991d-656babc06e8713.webp";
        }
        m142448L(view, str);
    }

    /* JADX INFO: renamed from: O */
    public final void m142451O(@NotNull VDraweeView view) {
        String str;
        view.getClass();
        if (m142488s()) {
            str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ik03M1JGWlVFR0VJUlQ1TDI0V09TRjZUUEc0RFpQSzEyIiwidyI6MjAwLCJoIjoyMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMzQ5NTgzMTk2MjY0NDM2Mjg1M30.png";
        } else {
            str = m142492w() ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik1JWVZMNklHNzVFWFJWR0JHN0xQQzVHNk5QTDNYUjEyIiwidyI6MjAwLCJoIjoyMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjM5OTU3MjkyMDU5ODc5NDQwMX0.png" : "https://auto.tancdn.com/v1/raw/3e78db8c-32a7-4c63-bb2c-1fe47fa1477e13.webp";
        }
        m142448L(view, str);
    }

    /* JADX INFO: renamed from: P */
    public final void m142452P(@NotNull ImageView view) {
        view.getClass();
        if (m142488s()) {
            view.setBackgroundResource(dbc0.f86985fc);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m142453Q(@NotNull TextView view) {
        view.getClass();
        if (m142488s()) {
            view.setText("1.在活動期間 2/14 00:00 – 2/24 23:59 ，上傳並替換運動中的照片，即可參與活動。");
        } else if (m142492w()) {
            view.setText("1.在活動期間 3/1 00:00 –  3/10 23:59，上傳並替換旅行中的照片，即可參與活動。");
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m142454R(@NotNull TextView view) {
        view.getClass();
        if (m142488s()) {
            view.setText("3.獲獎者將於活動截止後的2日內收到官方郵件，確認出席線下「探探運動日」，及獲得運動禮包。");
        } else if (m142492w()) {
            view.setText("3.獲獎者將於活動截止後的2日內收到官方郵件，選擇是否出席3/11的線下活動「探探旅行團」。先報先得，參與者可以在現場獲得獎勵大禮包喔!!");
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m142455S(@NotNull TextView view) {
        view.getClass();
        if (m142488s()) {
            view.setText("2/14 00:00 - 2/24 23:59");
        } else if (m142492w()) {
            view.setText("3/1 00:00 - 3/10 23:59");
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m142456T(@NotNull View view) {
        view.getClass();
        if (m142488s()) {
            view.setBackgroundResource(dbc0.f86788Zb);
        } else if (m142492w()) {
            view.setBackgroundResource(dbc0.f86181Gc);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m142457U(@NotNull TextView... views) {
        views.getClass();
        if (m142488s()) {
            m142462Z("線下運動日", views);
        } else if (m142492w()) {
            m142462Z("線下旅行日", views);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m142458V(@NotNull TextView... views) {
        views.getClass();
        if (m142488s()) {
            m142462Z("運動健身卡", views);
        } else if (m142492w()) {
            m142462Z("小點心", views);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m142459W(@NotNull TextView... views) {
        views.getClass();
        if (m142488s()) {
            m142462Z("運動用品\n（瑜珈墊+筋膜槍）", views);
        } else if (m142492w()) {
            m142462Z("野餐墊", views);
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m142460X(@NotNull TextView view, @NotNull Act act) {
        int iM148005a;
        Drawable drawable;
        view.getClass();
        act.getClass();
        if (m142488s()) {
            iM148005a = k3d0.m148005a(c9c0.f80458t0);
            drawable = act.getResources().getDrawable(dbc0.f86920dc);
        } else if (m142492w()) {
            iM148005a = k3d0.m148005a(c9c0.f80409d0);
            drawable = act.getResources().getDrawable(dbc0.f86309Kc);
        } else {
            iM148005a = -1;
            drawable = null;
        }
        if (drawable != null) {
            view.setTextColor(iM148005a);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            view.setCompoundDrawables(drawable, null, drawable, null);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m142461Y(@NotNull TextView view) {
        view.getClass();
        if (m142488s()) {
            view.setBackgroundResource(dbc0.f86952ec);
        } else if (m142492w()) {
            view.setTextColor(k3d0.m148005a(c9c0.f80409d0));
            view.setBackgroundResource(dbc0.f86341Lc);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m142462Z(String text, TextView[] views) {
        if (text != null) {
            for (TextView textView : views) {
                textView.setText(text);
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m142463a0(int color, TextView[] views) {
        if (color != -1) {
            for (TextView textView : views) {
                textView.setTextColor(color);
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m142464b0(@NotNull TextView view) {
        view.getClass();
        if (m142488s()) {
            view.setTextColor(k3d0.m148005a(c9c0.f80458t0));
            if (twActivity) {
                view.setText("運動熱照");
                return;
            } else {
                view.setText(R$string.f18755P8);
                return;
            }
        }
        if (m142492w()) {
            view.setTextColor(k3d0.m148005a(c9c0.f80409d0));
            if (twActivity) {
                view.setText("旅行美照");
            } else {
                view.setText(R$string.f19055Z8);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m142465c(int from) {
        i4g0.m138492A("e_petsactivities_show", "p_activities_pets_page", jyb.m147494Y("show_source", String.valueOf(from)));
    }

    /* JADX INFO: renamed from: c0 */
    public final void m142466c0(@NotNull TextView... views) {
        int iM148005a;
        views.getClass();
        if (m142488s()) {
            iM148005a = k3d0.m148005a(c9c0.f80458t0);
        } else {
            iM148005a = m142492w() ? k3d0.m148005a(c9c0.f80409d0) : -1;
        }
        m142463a0(iM148005a, views);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m142467d() {
        if (m142492w()) {
            return "https://auto.tancdn.com/v1/images/eyJpZCI6IkFOS080QUJLTVFONFVPVzZLVTZGNVBCVkk0NlZXMzEyIiwidyI6NjYwLCJoIjo3NjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTU2MTAzMjE4OTU3ODc1fQ.png";
        }
        return m142488s() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkJKQUhFVFRDTVpKM0ZESVVSRldHUEcyMkZFSU0zSjEyIiwidyI6NjYwLCJoIjo3NjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTU2MTA3NTEzOTI1MTcxfQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkNTSU5CQjVHNkRJV1hNSjRCSlNFWk1RTDNBU0RLRzEzIiwidyI6OTYwLCJoIjoxMTExLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6Mzk1NjEwNzUxMzkyNTE3MX0.png";
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m142468d0() {
        String str = m142495z().get();
        str.getClass();
        bkj0<Long, Integer, Integer> bkj0VarM142494y = m142494y(str);
        Integer num = bkj0VarM142494y.f77082b;
        num.getClass();
        int iM116965d = dmk0.m116965d(num.intValue(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
        long jM174454o = pzi0.m174454o();
        Long l2 = bkj0VarM142494y.f77081a;
        l2.getClass();
        if (tzi0.m193670h(jM174454o, l2.longValue(), iM116965d)) {
            return true;
        }
        Long l3 = bkj0VarM142494y.f77081a;
        l3.getClass();
        return pzi0.m174439D(l3.longValue()) && bkj0VarM142494y.f77083c.intValue() < 1;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m142469e() {
        if (m142488s()) {
            return "core_intl_sport_photo_entrance_anim.svga";
        }
        return m142492w() ? "core_intl_trip_photo_entrance_anim.svga" : "core_intl_pet_photo_entrance_anim.svga";
    }

    /* JADX INFO: renamed from: e0 */
    public final void m142470e0(@NotNull Act act, int source) {
        act.getClass();
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9())) {
            (twActivity ? new px60(act) : new ex60(act)).mo123016h();
            m142465c(source);
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m142471f(User user) {
        int iIndexOf = -1;
        for (Media media : user.pictures) {
            List<MediaLabel> list = media.labels;
            MediaLabel mediaLabelM142475h = m142475h();
            if (list != null && list.contains(mediaLabelM142475h)) {
                iIndexOf = user.pictures.indexOf(media);
            }
            if (iIndexOf != -1) {
                break;
            }
        }
        return iIndexOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [B, java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [C, java.lang.Integer, java.lang.Object] */
    /* JADX INFO: renamed from: f0 */
    public final void m142472f0() {
        String str;
        String str2 = m142495z().get();
        str2.getClass();
        bkj0<Long, Integer, Integer> bkj0VarM142494y = m142494y(str2);
        Long l2 = bkj0VarM142494y.f77081a;
        l2.getClass();
        if (pzi0.m174439D(l2.longValue())) {
            Long l3 = bkj0VarM142494y.f77081a;
            Integer num = bkj0VarM142494y.f77082b;
            ?? ValueOf = Integer.valueOf(bkj0VarM142494y.f77083c.intValue() + 1);
            bkj0VarM142494y.f77083c = ValueOf;
            str = l3 + "_" + num + "_" + ((Object) ValueOf);
        } else {
            long jM174454o = pzi0.m174454o();
            ?? ValueOf2 = Integer.valueOf(bkj0VarM142494y.f77082b.intValue() + 1);
            bkj0VarM142494y.f77082b = ValueOf2;
            str = jM174454o + "_" + ((Object) ValueOf2) + "_1";
        }
        m142495z().put(str);
    }

    /* JADX INFO: renamed from: g */
    public final int m142473g() {
        int iM142481l = m142481l();
        if (iM142481l < 0) {
            iM142481l = m142479j();
            if (iM142481l < 0) {
                return m142477i();
            }
            showType = ScenarioCategory.sport;
        }
        showType = "trip";
        return iM142481l;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m142474g0() {
        i4g0.m138526x("e_petactivities_full", "p_activities_pets_page");
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final MediaLabel m142475h() {
        if (m142488s()) {
            MediaLabel mediaLabel = MediaLabel.get(MediaLabel.WITH_SPORTS);
            mediaLabel.getClass();
            return mediaLabel;
        }
        if (m142492w()) {
            MediaLabel mediaLabel2 = MediaLabel.get(MediaLabel.WITH_TRIP);
            mediaLabel2.getClass();
            return mediaLabel2;
        }
        MediaLabel mediaLabel3 = MediaLabel.get(MediaLabel.WITH_PETS);
        mediaLabel3.getClass();
        return mediaLabel3;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m142476h0() {
        i4g0.m138520r("e_petactivities_click", "p_activities_pets_page");
    }

    /* JADX INFO: renamed from: i */
    public final int m142477i() {
        return m142439B("intl_petactivities_card_config");
    }

    /* JADX INFO: renamed from: i0 */
    public final void m142478i0() {
        i4g0.m138526x("e_petactivities_success", "p_activities_pets_page");
    }

    /* JADX INFO: renamed from: j */
    public final int m142479j() {
        return m142439B("intl_sportsman_card_config");
    }

    /* JADX INFO: renamed from: k */
    public final int m142480k() {
        return ((Number) swipeCount.getValue()).intValue();
    }

    /* JADX INFO: renamed from: l */
    public final int m142481l() {
        return m142439B("intl_trip_card_config");
    }

    /* JADX INFO: renamed from: m */
    public final boolean m142482m(@NotNull User user) {
        user.getClass();
        return NullChecker.m82486a(user) && m142471f(user) != -1;
    }

    /* JADX INFO: renamed from: n */
    public final void m142483n(@NotNull User user) {
        int iM142471f;
        user.getClass();
        if (!m142486q(user) || (iM142471f = m142471f(user)) == -1 || iM142471f == 0) {
            return;
        }
        Collections.swap(user.pictures, 0, iM142471f);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m142484o(@NotNull List<MediaLabel> labels) {
        labels.getClass();
        if (m142487r() && labels.contains(MediaLabel.get(MediaLabel.WITH_PETS))) {
            return true;
        }
        if (m142488s() && labels.contains(MediaLabel.get(MediaLabel.WITH_SPORTS))) {
            return true;
        }
        return m142492w() && labels.contains(MediaLabel.get(MediaLabel.WITH_TRIP));
    }

    /* JADX INFO: renamed from: p */
    public final boolean m142485p(@NotNull User user) {
        user.getClass();
        return (user.status.contains(UserStatus.get("hidden")) || user.veryUgly() || user.isJailed()) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m142486q(@NotNull User user) {
        user.getClass();
        if (!NullChecker.m82486a(user) || m142480k() < 0) {
            return false;
        }
        return m142482m(user);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m142487r() {
        return Intrinsics.m88377d("pet", showType);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m142488s() {
        return Intrinsics.m88377d(ScenarioCategory.sport, showType);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m142489t() {
        return twActivity && Intrinsics.m88377d("pet", showType);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m142490u() {
        return twActivity && Intrinsics.m88377d(ScenarioCategory.sport, showType);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m142491v() {
        return twActivity && Intrinsics.m88377d("trip", showType);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m142492w() {
        return Intrinsics.m88377d("trip", showType);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final jxd0 m142493x() {
        if (m142488s()) {
            return new jxd0("sport_phoot_is_upload_" + CoreModule.m30929H().userId(), Boolean.FALSE);
        }
        if (m142492w()) {
            return new jxd0("trip_photo_is_upload_" + CoreModule.m30929H().userId(), Boolean.FALSE);
        }
        return new jxd0("pet_phoot_is_upload_" + CoreModule.m30929H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: y */
    public final bkj0<Long, Integer, Integer> m142494y(String str) {
        String[] strArr = (String[]) StringsKt.split$default(str, new String[]{"_"}, false, 0, 6, null).toArray(new String[0]);
        bkj0<Long, Integer, Integer> bkj0VarM104818a = bkj0.m104818a(Long.valueOf(strArr[0]), Integer.valueOf(strArr[1]), Integer.valueOf(strArr[2]));
        bkj0VarM104818a.getClass();
        return bkj0VarM104818a;
    }

    /* JADX INFO: renamed from: z */
    public final wyd0 m142495z() {
        if (m142488s()) {
            return new wyd0("sport_photo_reminder_num_" + CoreModule.m30929H().userId(), "0_0_0");
        }
        if (m142492w()) {
            return new wyd0("trip_photo_reminder_num_" + CoreModule.m30929H().userId(), "0_0_0");
        }
        return new wyd0("pet_photo_reminder_num_" + CoreModule.m30929H().userId(), "0_0_0");
    }
}
