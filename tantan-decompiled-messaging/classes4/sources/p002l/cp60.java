package p002l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLabel;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import l.eqh0;
import l.hpd0;
import l.hvc0;
import l.i0g0;
import l.idr;
import l.j760;
import l.mqi0;
import l.qib0;
import l.qqi0;
import l.t100;
import l.uqd0;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.x2c0;
import l.xaj0;
import l.xck0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ'\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\rJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\rJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\rJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J)\u0010'\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100%2\u0006\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0010H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0010H\u0002¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010*J\u000f\u0010-\u001a\u00020\u0010H\u0002¢\u0006\u0004\b-\u0010*J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\b2\u0006\u00101\u001a\u00020\u0010H\u0002¢\u0006\u0004\b2\u00103J\r\u00105\u001a\u000204¢\u0006\u0004\b5\u00106J\u001d\u0010:\u001a\u00020\b2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u0010¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b<\u0010=J\u0015\u0010>\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b>\u0010=J\u0015\u0010?\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b?\u0010@J\u0015\u0010A\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\bA\u0010=J\r\u0010B\u001a\u00020\u0006¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u0006¢\u0006\u0004\bD\u0010CJ\u0015\u0010E\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bE\u0010FJ\u0015\u0010G\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bG\u0010FJ\u0015\u0010H\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bH\u0010FJ\u0015\u0010I\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bI\u0010FJ-\u0010L\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u00102\u0006\u0010K\u001a\u00020\u0010¢\u0006\u0004\bL\u0010MJ\u0015\u0010N\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0013¢\u0006\u0004\bN\u0010OJ\u0015\u0010Q\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020P¢\u0006\u0004\bQ\u0010RJ\u0015\u0010S\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020P¢\u0006\u0004\bS\u0010RJ\u0015\u0010U\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020T¢\u0006\u0004\bU\u0010VJ!\u0010W\u001a\u00020\b2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\"\u00020\u0013¢\u0006\u0004\bW\u0010XJ!\u0010Y\u001a\u00020\b2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\"\u00020\u0013¢\u0006\u0004\bY\u0010XJ\u0015\u0010Z\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0013¢\u0006\u0004\bZ\u0010OJ\u0015\u0010[\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020T¢\u0006\u0004\b[\u0010VJ\u001d\u0010\\\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u00108\u001a\u000207¢\u0006\u0004\b\\\u0010]J\u0015\u0010^\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0013¢\u0006\u0004\b^\u0010OJ\u0015\u0010_\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0013¢\u0006\u0004\b_\u0010OJ\u0015\u0010`\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0013¢\u0006\u0004\b`\u0010OJ!\u0010a\u001a\u00020\b2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\"\u00020\u0013¢\u0006\u0004\ba\u0010XJ!\u0010b\u001a\u00020\b2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\"\u00020\u0013¢\u0006\u0004\bb\u0010XJ!\u0010c\u001a\u00020\b2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\"\u00020\u0013¢\u0006\u0004\bc\u0010XJ%\u0010g\u001a\u00020\b2\u0006\u0010d\u001a\u00020\u00132\u0006\u0010f\u001a\u00020e2\u0006\u00108\u001a\u000207¢\u0006\u0004\bg\u0010hJ\r\u0010j\u001a\u00020i¢\u0006\u0004\bj\u0010kJ\u001b\u0010n\u001a\u00020\u000b2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020i0l¢\u0006\u0004\bn\u0010oJ'\u0010r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010p\u001a\u00020\u000b2\b\b\u0002\u0010q\u001a\u00020\u000b¢\u0006\u0004\br\u0010sJ\u001d\u0010t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010p\u001a\u00020\u000b¢\u0006\u0004\bt\u0010uJ\r\u0010v\u001a\u00020\u000b¢\u0006\u0004\bv\u0010\rJ\r\u0010w\u001a\u00020\b¢\u0006\u0004\bw\u0010\u0003J\r\u0010x\u001a\u00020\b¢\u0006\u0004\bx\u0010\u0003J\r\u0010y\u001a\u00020\b¢\u0006\u0004\by\u0010\u0003J\r\u0010z\u001a\u00020\b¢\u0006\u0004\bz\u0010\u0003J\r\u0010{\u001a\u00020\b¢\u0006\u0004\b{\u0010\u0003R\u001b\u0010\u007f\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010*R\u0018\u0010\u0081\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u0018R\u0018\u0010\u0083\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b2\u0010\u0082\u0001¨\u0006\u0084\u0001"}, d2 = {"Ll/cp60;", "", "<init>", "()V", "Lv/VDraweeView;", "view", "", "img", "", "L", "(Lv/VDraweeView;Ljava/lang/String;)V", "", "t", "()Z", "u", "v", "", "color", "", "Landroid/widget/TextView;", "views", "a0", "(I[Landroid/widget/TextView;)V", "text", "Z", "(Ljava/lang/String;[Landroid/widget/TextView;)V", "s", "r", "w", "Lcom/p1/mobile/putong/data/User;", "user", "f", "(Lcom/p1/mobile/putong/data/User;)I", "Ll/uqd0;", "z", "()Ll/uqd0;", "str", "Ll/xaj0;", "", "y", "(Ljava/lang/String;)Ll/xaj0;", "i", "()I", "j", "l", "g", "config", "B", "(Ljava/lang/String;)I", "from", "c", "(I)V", "Ll/hpd0;", "x", "()Ll/hpd0;", "Lcom/p1/mobile/android/app/Act;", "act", "source", "e0", "(Lcom/p1/mobile/android/app/Act;I)V", "m", "(Lcom/p1/mobile/putong/data/User;)Z", "q", "n", "(Lcom/p1/mobile/putong/data/User;)V", "p", "d", "()Ljava/lang/String;", "e", "M", "(Lv/VDraweeView;)V", "O", "N", "D", "width", "height", "H", "(Lv/VDraweeView;Ljava/lang/String;II)V", "b0", "(Landroid/widget/TextView;)V", "Landroid/widget/ImageView;", "F", "(Landroid/widget/ImageView;)V", "P", "Landroid/view/View;", "C", "(Landroid/view/View;)V", "G", "([Landroid/widget/TextView;)V", "c0", "Y", "T", "X", "(Landroid/widget/TextView;Lcom/p1/mobile/android/app/Act;)V", "S", "Q", "R", "U", "W", "V", "desc", "Landroid/widget/Button;", "upload", "E", "(Landroid/widget/TextView;Landroid/widget/Button;Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/data/MediaLabel;", "h", "()Lcom/p1/mobile/putong/data/MediaLabel;", "", "labels", "o", "(Ljava/util/List;)Z", "isFemale", "isSmall", "J", "(Lv/VDraweeView;ZZ)V", "I", "(Lv/VDraweeView;Z)V", "d0", "f0", "h0", "g0", "i0", "A", "a", "Lkotlin/Lazy;", "k", "swipeCount", "b", "twActivity", "Ljava/lang/String;", "showType", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class cp60 {

    @NotNull
    public static final cp60 INSTANCE = new cp60();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy swipeCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean twActivity;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static String showType;

    static {
        qib0.G.r0("https://auto.tancdn.com/v1/raw/d37ac8e1-2154-4466-b0a3-4623fa6dbda113.webp");
        qib0.G.r0("https://auto.tancdn.com/v1/raw/c3b30867-9826-477f-945d-d1012ff2745413.webp");
        qib0.G.r0("https://auto.tancdn.com/v1/raw/427e91f6-ff46-4b09-94d7-9f2a9e04d84113.webp");
        qib0.G.r0("https://auto.tancdn.com/v1/raw/81e40dd4-2472-457f-8aa8-4a53865868d513.webp");
        qib0.G.r0("https://auto.tancdn.com/v1/raw/967dac02-d97c-40ea-ad9c-34e00968548b13.webp");
        qib0.G.r0("https://auto.tancdn.com/v1/raw/3cf4962c-eb67-4157-92e8-ab52b7947d2b13.webp");
        qib0.G.r0("https://auto.tancdn.com/v1/raw/3e78db8c-32a7-4c63-bb2c-1fe47fa1477e13.webp");
        qib0.G.r0("https://auto.tancdn.com/v1/raw/a2bd0491-4018-4a60-991d-656babc06e8713.webp");
        swipeCount = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.ap60
            public final Object invoke() {
                return Integer.valueOf(cp60.m11210a());
            }
        });
        showType = "pet";
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m11209K(cp60 cp60Var, VDraweeView vDraweeView, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = true;
        }
        cp60Var.m11221J(vDraweeView, z, z2);
    }

    /* JADX INFO: renamed from: a */
    public static int m11210a() {
        return INSTANCE.m11247g();
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m11211b(int i) {
        return Boolean.valueOf(qib0.f0 == i);
    }

    /* JADX INFO: renamed from: A */
    public final void m11212A() {
        zvf0.x("e_petactivities_usershow", "p_activities_pets_page");
    }

    /* JADX INFO: renamed from: B */
    public final int m11213B(String config) {
        try {
            String strF = RemoteConfig.x().F(config);
            strF.getClass();
            JSONObject jSONObject = new JSONObject(strF);
            if (jSONObject.getBoolean("enable")) {
                JSONArray jSONArray = jSONObject.getJSONArray("area");
                int length = jSONArray.length();
                boolean z = false;
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof JSONObject) {
                        if (vwb.m(JSON.parseArray(((JSONObject) obj).getString("reverse_mcc"), Integer.TYPE), new w9j() { // from class: l.bp60
                            public final Object call(Object obj2) {
                                return cp60.m11211b(((Integer) obj2).intValue());
                            }
                        })) {
                            return -1;
                        }
                        if (Intrinsics.d(IntlCountryCodeController.d(qib0.f0), "TAIWAN") && ((JSONObject) obj).getBoolean("taiwan_active")) {
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
    public final void m11214C(@NotNull View view) {
        view.getClass();
        if (m11262s()) {
            view.setBackgroundResource(x2c0.Zb);
        } else if (m11266w()) {
            view.setBackgroundResource(x2c0.Gc);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m11215D(@NotNull VDraweeView view) {
        view.getClass();
        if (m11266w()) {
            int iD = t100.d(200.0f);
            m11219H(view, "https://auto.tancdn.com/v1/images/eyJpZCI6IjI3TlZRSzRNVTdBVEIzSERKS1E2SU42WjY2Nzc3UDEzIiwidyI6NDAwLCJoIjo0MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjkyOTUzOTQyOTUzMzAwNTV9.png", iD, iD);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m11216E(@NotNull TextView desc, @NotNull Button upload, @NotNull Act act) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        desc.getClass();
        upload.getClass();
        act.getClass();
        if (!twActivity) {
            if (m11262s()) {
                string = act.getString(R.string.M8);
            } else {
                string = m11266w() ? act.getString(R.string.W8) : act.getString(R.string.P8);
            }
            string.getClass();
        } else if (m11262s()) {
            string = "「運動熱照」";
        } else {
            string = m11266w() ? "「旅行美照」" : "寵物貼紙";
        }
        if (!twActivity) {
            string2 = act.getString(R.string.Ij);
            string2.getClass();
        } else if (m11262s()) {
            string2 = "「探探運動日」";
        } else {
            string2 = m11266w() ? "「探探旅行團」" : "「單身狗派對」";
        }
        if (m11262s()) {
            desc.setTextColor(hvc0.a(w0c0.A0));
            upload.setBackgroundResource(x2c0.ac);
        } else if (m11266w()) {
            desc.setTextColor(hvc0.a(w0c0.m0));
            upload.setBackgroundResource(x2c0.Hc);
        }
        if (((Boolean) m11267x().get()).booleanValue()) {
            if (twActivity) {
                desc.setGravity(1);
            }
            desc.setText(act.getString(R.string.R8));
            upload.setText(act.getString(R.string.Q8));
            return;
        }
        if (twActivity) {
            desc.setGravity(8388611);
        }
        if (m11262s()) {
            if (twActivity) {
                string5 = "上傳你的「運動熱照」，即可領取運動徽章，更有機會參加線下「探探運動日」，遇見志同道合的朋友，運動從此不再孤單！";
            } else {
                string5 = act.getString(R.string.L8, string);
                string5.getClass();
            }
            desc.setText(i0g0.b0(string5, twActivity ? vwb.f0(new String[]{string, string2}) : vwb.f0(new String[]{string}), hvc0.a(w0c0.F0), eqh0.c(2)));
            return;
        }
        if (m11266w()) {
            if (twActivity) {
                string4 = "上傳你的「旅行美照」，即可領取旅行貼紙，更有機會參加線下「探探旅行團」，找到結伴的團友，一起出發去旅遊吧！";
            } else {
                string4 = act.getString(R.string.V8, string);
                string4.getClass();
            }
            desc.setText(i0g0.b0(string4, twActivity ? vwb.f0(new String[]{string, string2}) : vwb.f0(new String[]{string}), hvc0.a(w0c0.G0), eqh0.c(2)));
            return;
        }
        if (twActivity) {
            string3 = "現在上傳你與萌寵的照片，擁有專屬寵物貼紙，並有機會參加線下「單身狗派對」，期待你攜汪星人一起遇見新朋友！";
        } else {
            string3 = act.getString(R.string.O8, string, string2);
            string3.getClass();
        }
        desc.setText(i0g0.b0(string3, vwb.f0(new String[]{string, string2}), hvc0.a(w0c0.C0), eqh0.c(2)));
    }

    /* JADX INFO: renamed from: F */
    public final void m11217F(@NotNull ImageView view) {
        view.getClass();
        if (m11262s()) {
            view.setBackgroundResource(x2c0.bc);
        } else if (m11266w()) {
            view.setBackgroundResource(x2c0.Ic);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m11218G(@NotNull TextView... views) {
        int iA;
        views.getClass();
        if (m11262s()) {
            iA = hvc0.a(w0c0.A0);
        } else {
            iA = m11266w() ? hvc0.a(w0c0.m0) : -1;
        }
        m11237a0(iA, views);
    }

    /* JADX INFO: renamed from: H */
    public final void m11219H(@NotNull VDraweeView view, @NotNull String img, int width, int height) {
        view.getClass();
        img.getClass();
        qib0.G.I0(view, img, width, height);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX INFO: renamed from: I */
    public final void m11220I(@NotNull VDraweeView view, boolean isFemale) {
        view.getClass();
        String str = "https://auto.tancdn.com/v1/raw/427e91f6-ff46-4b09-94d7-9f2a9e04d84113.webp";
        if (!m11263t()) {
            if (Intrinsics.d(IntlCountryCodeController.d(qib0.f0), "SEA") || Intrinsics.d(IntlCountryCodeController.d(qib0.f0), "SA")) {
                if (isFemale) {
                    if (m11261r()) {
                        str = "https://auto.tancdn.com/v1/raw/81e40dd4-2472-457f-8aa8-4a53865868d513.webp";
                    } else if (m11262s()) {
                        str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkgyUENQQVBZTFc0VVVPVlNNSVlSNk9JTkFGSEM1STEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTI4ODg1MDA4MDMxOTE0NTk1fQ.png";
                    } else {
                        str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ilk2VUg1SU5WVkVMRUtVVzI2V0M0RkRPTUo1M0hGUTEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTI2OTkyOTAxNTE3OTg3NTczNH0.png";
                    }
                } else if (m11261r()) {
                    str = "https://auto.tancdn.com/v1/raw/967dac02-d97c-40ea-ad9c-34e00968548b13.webp";
                } else if (m11262s()) {
                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlVOSzNMNE9RV0IzMkFTWkxEWVEzTEZJQVpLWExZWTEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3Mjk4NzMwOTg1ODQ5MTg0Njg4fQ.png";
                } else {
                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IjJDR1dHMkxZTlVTSDRKVVFHWUxXTk5ZSEFRNVM2QzEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNjI0Mzc3Njc2ODg0NDMxMzA0fQ.png";
                }
            } else if (IntlCountryCodeController.v()) {
                if (isFemale) {
                    if (m11261r()) {
                        str = "https://auto.tancdn.com/v1/raw/c3b30867-9826-477f-945d-d1012ff2745413.webp";
                    } else if (m11262s()) {
                        str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9ZVjRHU1c1NEZHSkxTV1hSVVBZVUJFSUY0WTZXQzEzIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNzQxNjc4MTgzMzA3MDM4NDc3OH0.png";
                    } else {
                        str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9TWlNXVENNSUg0Q1BGT1NTVU1FTUFONFFQRFFJUjEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1MzU5OTY1NjE5MTgwMDkxMTAwfQ.png";
                    }
                } else if (m11261r()) {
                    str = "https://auto.tancdn.com/v1/raw/967dac02-d97c-40ea-ad9c-34e00968548b13.webp";
                } else if (m11262s()) {
                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ik5PTTZIUUE2M1BQVjJWUE5RNkJVN05RM1RXNUY3VjEzIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNjc3NDg1MTY2MTMzOTQ3NDE4fQ.png";
                } else {
                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IjJDR1dHMkxZTlVTSDRKVVFHWUxXTk5ZSEFRNVM2QzEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNjI0Mzc3Njc2ODg0NDMxMzA0fQ.png";
                }
            } else if (466 == qib0.f0) {
                if (isFemale) {
                    if (!m11261r()) {
                        if (m11262s()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IjY2SFJDMklKQjRUTTdHU0tEQkNESUxXRDM2MlVQNTEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTk5MTY1OTU2NDM3MTc4NjM1OH0.png";
                        } else {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ilk2VUg1SU5WVkVMRUtVVzI2V0M0RkRPTUo1M0hGUTEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTI2OTkyOTAxNTE3OTg3NTczNH0.png";
                        }
                    }
                } else if (m11261r()) {
                    str = "https://auto.tancdn.com/v1/raw/967dac02-d97c-40ea-ad9c-34e00968548b13.webp";
                } else if (m11262s()) {
                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkhURUJFTlNLWFhEN1RRUlFCVFU2UFdKU0U0SFdaVTEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1Mzg4OTk0MDM3NTkwNDgwMDUyfQ.png";
                } else {
                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IjJDR1dHMkxZTlVTSDRKVVFHWUxXTk5ZSEFRNVM2QzEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNjI0Mzc3Njc2ODg0NDMxMzA0fQ.png";
                }
            } else if (isFemale) {
                if (m11261r()) {
                    str = "https://auto.tancdn.com/v1/raw/d37ac8e1-2154-4466-b0a3-4623fa6dbda113.webp";
                } else if (m11262s()) {
                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9ZVjRHU1c1NEZHSkxTV1hSVVBZVUJFSUY0WTZXQzEzIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNzQxNjc4MTgzMzA3MDM4NDc3OH0.png";
                } else {
                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ilk2VUg1SU5WVkVMRUtVVzI2V0M0RkRPTUo1M0hGUTEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTI2OTkyOTAxNTE3OTg3NTczNH0.png";
                }
            } else if (m11261r()) {
                str = "https://auto.tancdn.com/v1/raw/967dac02-d97c-40ea-ad9c-34e00968548b13.webp";
            } else if (m11262s()) {
                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkhURUJFTlNLWFhEN1RRUlFCVFU2UFdKU0U0SFdaVTEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1Mzg4OTk0MDM3NTkwNDgwMDUyfQ.png";
            } else {
                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IjJDR1dHMkxZTlVTSDRKVVFHWUxXTk5ZSEFRNVM2QzEyIiwidyI6Mjk2LCJoIjo0NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNjI0Mzc3Njc2ODg0NDMxMzA0fQ.png";
            }
        }
        m11219H(view, str, t100.d(148.0f), t100.d(222.0f));
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
    public final void m11221J(@NotNull VDraweeView view, boolean isFemale, boolean isSmall) {
        String str;
        view.getClass();
        if (m11263t()) {
            str = "https://auto.tancdn.com/v1/raw/f09226ee-ed24-4121-a232-c9241b3c2b6013.webp";
        } else if (!m11264u()) {
            if (!m11265v()) {
                String strE = idr.INSTANCE.e();
                switch (strE.hashCode()) {
                    case 99994381:
                        if (!strE.equals("id-ID")) {
                            if (m11266w()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlpTWkwyRUdCSUlQV1hHS1BNVE9TQUZDVUtCSFhDWjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjE1ODgzNDUzNTMzNjcwNzN9.png";
                            } else if (isFemale) {
                                if (m11261r()) {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IklFR1BYS0dSQk1LRzM1Tk5RQjJSQjZUT0lWTlhZUDEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzE2OTExOTg2OTcyMzc1ODE0fQ.png";
                                } else {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlNWVEFTWTZSQjRSWlBENUlMNko0UTNPNEFYS1hFMzEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTU3Mzk2MzMxNDUzODEzNTI2fQ.png";
                                }
                            } else if (m11261r()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkNZVkNKTlNWWTZFSVZQTkRXRVFUQk1DSDZPTlpQQzEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzI4MTMzNTg1OTM1NjA4NTgyfQ.png";
                            } else {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ1WkNaVDQ2RkVWWjI3QVRXWDdCRksySEpFNFdXQTEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjUwNDUyNzY2OTMyMTU0ODk5fQ.png";
                            }
                        } else if (m11266w()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkpZUFlJQUNPVVAyNko1TEhNS0hNTDI1VEMzVFpWUjEzIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjExMzA5NDg1MTYyMTIyNTd9.png";
                        } else if (!isFemale) {
                            str = !m11261r() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkJXRlQ3TEpSTUtGUFQyQ1lRWDZPT0gyRTczN01TTjEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNDc4ODM5NTc4NDM3NDM0MTE4fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ilo2TlJGT01USk1aSDZFWkM1TUlaTTRUMko2VlQ2RjEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTc1NDE2MjE4OTY1MDU0MjMwfQ.png";
                        } else if (!m11261r()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IjZWTDNDRFpXUVdOTU5GRURNQjQyUVVFT0xHNUFISDEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNDgxMTA4OTcwOTA3MTgzODc4fQ.png";
                        } else {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlJUWUVZTklHTEhSQVFMTFAyM1RLSVM3NzVYU01ZSjEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjUxMDIwMTE0OTMxOTU2MjQzfQ.png";
                        }
                        break;
                    case 100828572:
                        if (!strE.equals("ja-JP")) {
                            if (m11266w()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlpTWkwyRUdCSUlQV1hHS1BNVE9TQUZDVUtCSFhDWjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjE1ODgzNDUzNTMzNjcwNzN9.png";
                            } else if (isFemale) {
                                if (m11261r()) {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IklFR1BYS0dSQk1LRzM1Tk5RQjJSQjZUT0lWTlhZUDEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzE2OTExOTg2OTcyMzc1ODE0fQ.png";
                                } else {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlNWVEFTWTZSQjRSWlBENUlMNko0UTNPNEFYS1hFMzEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTU3Mzk2MzMxNDUzODEzNTI2fQ.png";
                                }
                            } else if (m11261r()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkNZVkNKTlNWWTZFSVZQTkRXRVFUQk1DSDZPTlpQQzEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzI4MTMzNTg1OTM1NjA4NTgyfQ.png";
                            } else {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ1WkNaVDQ2RkVWWjI3QVRXWDdCRksySEpFNFdXQTEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjUwNDUyNzY2OTMyMTU0ODk5fQ.png";
                            }
                        } else if (m11266w()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkNRSkRQWUpEUzNIT0lSSTVTV0hXMkY1S1lYRExaMjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDg4MTA0MDQwMzAwMTcwNTl9.png";
                        } else if (!isFemale) {
                            str = !m11261r() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkZVQkpLUjIyQkQyWUJFQlBYVTVVNUU1NVdXMzVSWjEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDQyMTE0MTY4MTA4OTEwMDU1MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IktJR0o2WkhVQ09ESTZCNTJPT1JRWURHWE5IQTQ2TTEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTczMTYwMDIxMTA0ODU3ODc4fQ.png";
                        } else if (!m11261r()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IjUzNTdDSDNYWkFJRUNMU0tLTkZMV0o1RDVDN1JLWjEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTAzNTk1MDg3NTAxNzk4MTUwfQ.png";
                        } else {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk0TEdYVUkzSjZVSEFBSlc3UEc3RzZQNVRJQlBJWTEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjUxMDE1NzE2ODg1NDQ1MTM5fQ.png";
                        }
                        break;
                    case 102169200:
                        if (!strE.equals("ko-KR")) {
                            if (m11266w()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlpTWkwyRUdCSUlQV1hHS1BNVE9TQUZDVUtCSFhDWjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjE1ODgzNDUzNTMzNjcwNzN9.png";
                            } else if (isFemale) {
                                if (m11261r()) {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IklFR1BYS0dSQk1LRzM1Tk5RQjJSQjZUT0lWTlhZUDEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzE2OTExOTg2OTcyMzc1ODE0fQ.png";
                                } else {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlNWVEFTWTZSQjRSWlBENUlMNko0UTNPNEFYS1hFMzEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTU3Mzk2MzMxNDUzODEzNTI2fQ.png";
                                }
                            } else if (m11261r()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkNZVkNKTlNWWTZFSVZQTkRXRVFUQk1DSDZPTlpQQzEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzI4MTMzNTg1OTM1NjA4NTgyfQ.png";
                            } else {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ1WkNaVDQ2RkVWWjI3QVRXWDdCRksySEpFNFdXQTEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjUwNDUyNzY2OTMyMTU0ODk5fQ.png";
                            }
                        } else if (m11266w()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkFCSUVFSUtYTjdXRjNGQ1g1MjJWWE9URVlIUVBJUjEzIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMDYxNTIxMjI1MDM5NDE0N30.png";
                        } else if (!isFemale) {
                            str = !m11261r() ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik1RM0hDSE5PN0k1MlYyNDRSNVJLUFI0NVoyT1JRUTEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDQxODg4OTkxNTYzNTE1MzY3MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkdJTUZPTktLS0JRUDZXUDVDUUsyR1I0NkkzMzNJUDEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTQ3MjUwMDM4MTUyNjk2NTk4fQ.png";
                        } else if (!m11261r()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkdLUzY0SjJXWkYzUEtZSU40MzVTVEJXSlJXWk8yQjEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTAzNjEyNjc5Njg3ODQyNTY2fQ.png";
                        } else {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkJKNEtWM1VFSzJDT1M0UDVFV1EzUkFNNUozVTVEMzEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2MjE4NDczNjY3OTgwNjM4NzM5fQ.png";
                        }
                        break;
                    case 110272621:
                        if (!strE.equals("th-TH")) {
                            if (m11266w()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlpTWkwyRUdCSUlQV1hHS1BNVE9TQUZDVUtCSFhDWjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjE1ODgzNDUzNTMzNjcwNzN9.png";
                            } else if (isFemale) {
                                if (m11261r()) {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IklFR1BYS0dSQk1LRzM1Tk5RQjJSQjZUT0lWTlhZUDEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzE2OTExOTg2OTcyMzc1ODE0fQ.png";
                                } else {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlNWVEFTWTZSQjRSWlBENUlMNko0UTNPNEFYS1hFMzEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTU3Mzk2MzMxNDUzODEzNTI2fQ.png";
                                }
                            } else if (m11261r()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkNZVkNKTlNWWTZFSVZQTkRXRVFUQk1DSDZPTlpQQzEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzI4MTMzNTg1OTM1NjA4NTgyfQ.png";
                            } else {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ1WkNaVDQ2RkVWWjI3QVRXWDdCRksySEpFNFdXQTEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjUwNDUyNzY2OTMyMTU0ODk5fQ.png";
                            }
                        } else if (m11266w()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IldWVFRETFZGQ0JJRzZONVRLTUpaVzVWRFdLTktTQjEzIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDg4Mjc5OTYyMTYwNjE0NzV9.png";
                        } else if (!isFemale) {
                            str = !m11261r() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkhQSlM1U1BQTk5RWFlURUFGNURVSlVYNzVTWEdCWjEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjcyNDczMjkyNDg0ODg0NzYyMn0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlFFQkRUNUpCNTYzR09MVFBZU1JBUURZTVZJTUtHQTEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTU5NjUyNTI5MzE0MDA5ODc4fQ.png";
                        } else if (!m11261r()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlFKUVJRUUYyQUNCVVhRQUVWWEFPVEJDQlBPUzVESzEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTAzNjEyNjc5Njg3ODQyNTY2fQ.png";
                        } else {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IjZQWVZIRTVDSEJSQlRVSDNLSkxaMzNHUlNOTzY2VDEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2MjI3NDgwODY3MjM1Mzc5NzMxfQ.png";
                        }
                        break;
                    case 112149522:
                        if (!strE.equals("vi-VN")) {
                            if (m11266w()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlpTWkwyRUdCSUlQV1hHS1BNVE9TQUZDVUtCSFhDWjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjE1ODgzNDUzNTMzNjcwNzN9.png";
                            } else if (isFemale) {
                                if (m11261r()) {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IklFR1BYS0dSQk1LRzM1Tk5RQjJSQjZUT0lWTlhZUDEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzE2OTExOTg2OTcyMzc1ODE0fQ.png";
                                } else {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlNWVEFTWTZSQjRSWlBENUlMNko0UTNPNEFYS1hFMzEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTU3Mzk2MzMxNDUzODEzNTI2fQ.png";
                                }
                            } else if (m11261r()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkNZVkNKTlNWWTZFSVZQTkRXRVFUQk1DSDZPTlpQQzEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzI4MTMzNTg1OTM1NjA4NTgyfQ.png";
                            } else {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ1WkNaVDQ2RkVWWjI3QVRXWDdCRksySEpFNFdXQTEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjUwNDUyNzY2OTMyMTU0ODk5fQ.png";
                            }
                        } else if (m11266w()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IjNBU0RYSlQ1V0w1WFA1VU1KSzJWTVJLTDVQUzZWUjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjExMzA5NDg1MTYyMTIyNTd9.png";
                        } else if (!isFemale) {
                            str = !m11261r() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjZEVEZHWU1WRlpVVUJCUVdUNlVVUlBMSjI0REVRRTEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzI1OTE5MTczMzQyMjE0OTE4fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ilk2TTdDS1QzMzdRTDVOVEhIR04ySFAyRUFMNkhFRzEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTQ2MTMyOTM0MzM4ODc2MTgyfQ.png";
                        } else if (!m11261r()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkZPQkZCRlQyVkJTRU1MMzRSSzQyWVNYREpHQVczTjEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzI4MTE3MDk3NTU2MTU5MjM4fQ.png";
                        } else {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkZZSEdLMkFLVzQyT0hZTktGTTZYUExMQ0RLN0FDMzEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2MjE4NDczNjY3OTgwNjM4NzM5fQ.png";
                        }
                        break;
                    case 115813226:
                        if (!strE.equals("zh-CN")) {
                            if (m11266w()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlpTWkwyRUdCSUlQV1hHS1BNVE9TQUZDVUtCSFhDWjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjE1ODgzNDUzNTMzNjcwNzN9.png";
                            } else if (isFemale) {
                                if (m11261r()) {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IklFR1BYS0dSQk1LRzM1Tk5RQjJSQjZUT0lWTlhZUDEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzE2OTExOTg2OTcyMzc1ODE0fQ.png";
                                } else {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlNWVEFTWTZSQjRSWlBENUlMNko0UTNPNEFYS1hFMzEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTU3Mzk2MzMxNDUzODEzNTI2fQ.png";
                                }
                            } else if (m11261r()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkNZVkNKTlNWWTZFSVZQTkRXRVFUQk1DSDZPTlpQQzEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzI4MTMzNTg1OTM1NjA4NTgyfQ.png";
                            } else {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ1WkNaVDQ2RkVWWjI3QVRXWDdCRksySEpFNFdXQTEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjUwNDUyNzY2OTMyMTU0ODk5fQ.png";
                            }
                        } else if (m11266w()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ik4zUkxTV0dLRzRJQk00WUxJUzZYN0JXVkRIN1AzNjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDg4MTA0MDQwMzAwMTcwNTl9.png";
                        } else if (!isFemale) {
                            str = !m11261r() ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik5GRVVINFZTUlU2N0hFUlk0Rkk1QUpYU01CSEtXTjEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDQxODg4OTkxNTYzNTE1MzY3MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IktZV1pNRkU1VjRGMlhLS0JWRVZEM1lIWUI2QU5LVjEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTQ4Mzg0NzM0MTUyNTYxNDMwfQ.png";
                        } else if (!m11261r()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9RUDJFM0hDNVZEM1RNM1hPQTIzWEc3S0ZSR0xaRDEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTAzNTk1MDg3NTAxNzk4MTUwfQ.png";
                        } else {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkxIN0hSVkZINldONlRaQlk2V0gySlBZQUZQVVNTNjEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjQyMDEyOTE1Njc3MjE1MjUxfQ.png";
                        }
                        break;
                    case 115813762:
                        if (!strE.equals("zh-TW")) {
                            if (m11266w()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlpTWkwyRUdCSUlQV1hHS1BNVE9TQUZDVUtCSFhDWjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjE1ODgzNDUzNTMzNjcwNzN9.png";
                            } else if (isFemale) {
                                if (m11261r()) {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IklFR1BYS0dSQk1LRzM1Tk5RQjJSQjZUT0lWTlhZUDEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzE2OTExOTg2OTcyMzc1ODE0fQ.png";
                                } else {
                                    str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlNWVEFTWTZSQjRSWlBENUlMNko0UTNPNEFYS1hFMzEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTU3Mzk2MzMxNDUzODEzNTI2fQ.png";
                                }
                            } else if (m11261r()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkNZVkNKTlNWWTZFSVZQTkRXRVFUQk1DSDZPTlpQQzEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzI4MTMzNTg1OTM1NjA4NTgyfQ.png";
                            } else {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ1WkNaVDQ2RkVWWjI3QVRXWDdCRksySEpFNFdXQTEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjUwNDUyNzY2OTMyMTU0ODk5fQ.png";
                            }
                        } else if (m11266w()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkNRSkRQWUpEUzNIT0lSSTVTV0hXMkY1S1lYRExaMjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDg4MTA0MDQwMzAwMTcwNTl9.png";
                        } else if (!isFemale) {
                            if (!m11261r()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IjZONTRXVElIRVRNSkxNSlJXRkxKWEQzN1dRSjRWRzEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDQyMTE0MTcxNTQ0ODgzODkxOH0.png";
                            } else {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkdFWEZZUklRUVI2N01OR1RIT1BONVFPNEUzWjNERzEyIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTQ4Mzg0NzM0MTUyNTYxNDMwfQ.png";
                            }
                        } else if (!m11261r()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ik41SkhGUUVSQzRZVUFMUEhUQ1hFWDJNUklDWlVOSDEzIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTAzNTk1MDg3NTAxNzk4MTUwfQ.png";
                        } else {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlBMS1JOUDZYNzc0TjVPV0JWWU5ZTjJJWUVUNDIyTzEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjQyMDEyOTE1Njc3MjE1MjUxfQ.png";
                        }
                        break;
                    default:
                        if (m11266w()) {
                            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlpTWkwyRUdCSUlQV1hHS1BNVE9TQUZDVUtCSFhDWjEyIiwidyI6MjY0LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjE1ODgzNDUzNTMzNjcwNzN9.png";
                        } else if (isFemale) {
                            if (m11261r()) {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IklFR1BYS0dSQk1LRzM1Tk5RQjJSQjZUT0lWTlhZUDEyIiwidyI6MzIwLCJoIjozMjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMzE2OTExOTg2OTcyMzc1ODE0fQ.png";
                            } else {
                                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlNWVEFTWTZSQjRSWlBENUlMNko0UTNPNEFYS1hFMzEzIiwidyI6NDgwLCJoIjo0NTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTU3Mzk2MzMxNDUzODEzNTI2fQ.png";
                            }
                        } else if (m11261r()) {
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
        int iD = t100.d(isSmall ? 60.0f : 132.0f);
        qib0.G.I0(view, str, iD, iD);
    }

    /* JADX INFO: renamed from: L */
    public final void m11222L(VDraweeView view, String img) {
        int iD = t100.d(100.0f);
        m11219H(view, img, iD, iD);
    }

    /* JADX INFO: renamed from: M */
    public final void m11223M(@NotNull VDraweeView view) {
        String str;
        view.getClass();
        if (m11262s()) {
            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IklPRVhPSFFTUEtSVk1KVVRaTkIyVEY1NFc0NzVDVzEyIiwidyI6MjAwLCJoIjoyMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2MDA1MTcwMDIxNjE4NDk5NzEzfQ.png";
        } else {
            str = m11266w() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjNJN1FBS0MyVjVQNEhNQVJEUlgzRFk2MkVIMkhIMjEyIiwidyI6MjAwLCJoIjoyMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjgxNDAzNTE1MTE0MjA3NTU5fQ.png" : "https://auto.tancdn.com/v1/raw/3cf4962c-eb67-4157-92e8-ab52b7947d2b13.webp";
        }
        m11222L(view, str);
    }

    /* JADX INFO: renamed from: N */
    public final void m11224N(@NotNull VDraweeView view) {
        String str;
        view.getClass();
        if (m11262s()) {
            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IjdQM1FFR0tBT0RMRUtFWUlWSTZYUEhXQ0ZDQkdGMzEyIiwidyI6MjAwLCJoIjoyMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjg2ODM4MDE4Njk4MTQ3NjUwMn0.png";
        } else {
            str = m11266w() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkY2WEw2N1NFVlZKTVNMTkFVWVVKRllUTlhBSkdBVDEzIiwidyI6MjAwLCJoIjoyMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1MjA5ODcwNjAwNjQ4ODYyMDQxfQ.png" : "https://auto.tancdn.com/v1/raw/a2bd0491-4018-4a60-991d-656babc06e8713.webp";
        }
        m11222L(view, str);
    }

    /* JADX INFO: renamed from: O */
    public final void m11225O(@NotNull VDraweeView view) {
        String str;
        view.getClass();
        if (m11262s()) {
            str = "https://auto.tancdn.com/v1/images/eyJpZCI6Ik03M1JGWlVFR0VJUlQ1TDI0V09TRjZUUEc0RFpQSzEyIiwidyI6MjAwLCJoIjoyMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMzQ5NTgzMTk2MjY0NDM2Mjg1M30.png";
        } else {
            str = m11266w() ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik1JWVZMNklHNzVFWFJWR0JHN0xQQzVHNk5QTDNYUjEyIiwidyI6MjAwLCJoIjoyMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjM5OTU3MjkyMDU5ODc5NDQwMX0.png" : "https://auto.tancdn.com/v1/raw/3e78db8c-32a7-4c63-bb2c-1fe47fa1477e13.webp";
        }
        m11222L(view, str);
    }

    /* JADX INFO: renamed from: P */
    public final void m11226P(@NotNull ImageView view) {
        view.getClass();
        if (m11262s()) {
            view.setBackgroundResource(x2c0.ec);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m11227Q(@NotNull TextView view) {
        view.getClass();
        if (m11262s()) {
            view.setText("1.在活動期間 2/14 00:00 – 2/24 23:59 ，上傳並替換運動中的照片，即可參與活動。");
        } else if (m11266w()) {
            view.setText("1.在活動期間 3/1 00:00 –  3/10 23:59，上傳並替換旅行中的照片，即可參與活動。");
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m11228R(@NotNull TextView view) {
        view.getClass();
        if (m11262s()) {
            view.setText("3.獲獎者將於活動截止後的2日內收到官方郵件，確認出席線下「探探運動日」，及獲得運動禮包。");
        } else if (m11266w()) {
            view.setText("3.獲獎者將於活動截止後的2日內收到官方郵件，選擇是否出席3/11的線下活動「探探旅行團」。先報先得，參與者可以在現場獲得獎勵大禮包喔!!");
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m11229S(@NotNull TextView view) {
        view.getClass();
        if (m11262s()) {
            view.setText("2/14 00:00 - 2/24 23:59");
        } else if (m11266w()) {
            view.setText("3/1 00:00 - 3/10 23:59");
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m11230T(@NotNull View view) {
        view.getClass();
        if (m11262s()) {
            view.setBackgroundResource(x2c0.Yb);
        } else if (m11266w()) {
            view.setBackgroundResource(x2c0.Fc);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m11231U(@NotNull TextView... views) {
        views.getClass();
        if (m11262s()) {
            m11236Z("線下運動日", views);
        } else if (m11266w()) {
            m11236Z("線下旅行日", views);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m11232V(@NotNull TextView... views) {
        views.getClass();
        if (m11262s()) {
            m11236Z("運動健身卡", views);
        } else if (m11266w()) {
            m11236Z("小點心", views);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m11233W(@NotNull TextView... views) {
        views.getClass();
        if (m11262s()) {
            m11236Z("運動用品\n（瑜珈墊+筋膜槍）", views);
        } else if (m11266w()) {
            m11236Z("野餐墊", views);
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m11234X(@NotNull TextView view, @NotNull Act act) {
        int iA;
        Drawable drawable;
        view.getClass();
        act.getClass();
        if (m11262s()) {
            iA = hvc0.a(w0c0.s0);
            drawable = act.getResources().getDrawable(x2c0.cc);
        } else if (m11266w()) {
            iA = hvc0.a(w0c0.c0);
            drawable = act.getResources().getDrawable(x2c0.Jc);
        } else {
            iA = -1;
            drawable = null;
        }
        if (drawable != null) {
            view.setTextColor(iA);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            view.setCompoundDrawables(drawable, null, drawable, null);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m11235Y(@NotNull TextView view) {
        view.getClass();
        if (m11262s()) {
            view.setBackgroundResource(x2c0.dc);
        } else if (m11266w()) {
            view.setTextColor(hvc0.a(w0c0.c0));
            view.setBackgroundResource(x2c0.Kc);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m11236Z(String text, TextView[] views) {
        if (text != null) {
            for (TextView textView : views) {
                textView.setText(text);
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m11237a0(int color, TextView[] views) {
        if (color != -1) {
            for (TextView textView : views) {
                textView.setTextColor(color);
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m11238b0(@NotNull TextView view) {
        view.getClass();
        if (m11262s()) {
            view.setTextColor(hvc0.a(w0c0.s0));
            if (twActivity) {
                view.setText("運動熱照");
                return;
            } else {
                view.setText(R.string.N8);
                return;
            }
        }
        if (m11266w()) {
            view.setTextColor(hvc0.a(w0c0.c0));
            if (twActivity) {
                view.setText("旅行美照");
            } else {
                view.setText(R.string.X8);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11239c(int from) {
        zvf0.A("e_petsactivities_show", "p_activities_pets_page", new j760[]{vwb.Y("show_source", String.valueOf(from))});
    }

    /* JADX INFO: renamed from: c0 */
    public final void m11240c0(@NotNull TextView... views) {
        int iA;
        views.getClass();
        if (m11262s()) {
            iA = hvc0.a(w0c0.s0);
        } else {
            iA = m11266w() ? hvc0.a(w0c0.c0) : -1;
        }
        m11237a0(iA, views);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m11241d() {
        if (m11266w()) {
            return "https://auto.tancdn.com/v1/images/eyJpZCI6IkFOS080QUJLTVFONFVPVzZLVTZGNVBCVkk0NlZXMzEyIiwidyI6NjYwLCJoIjo3NjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTU2MTAzMjE4OTU3ODc1fQ.png";
        }
        return m11262s() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkJKQUhFVFRDTVpKM0ZESVVSRldHUEcyMkZFSU0zSjEyIiwidyI6NjYwLCJoIjo3NjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTU2MTA3NTEzOTI1MTcxfQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkNTSU5CQjVHNkRJV1hNSjRCSlNFWk1RTDNBU0RLRzEzIiwidyI6OTYwLCJoIjoxMTExLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6Mzk1NjEwNzUxMzkyNTE3MX0.png";
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m11242d0() {
        Object obj = m11269z().get();
        obj.getClass();
        xaj0<Long, Integer, Integer> xaj0VarM11268y = m11268y((String) obj);
        Object obj2 = xaj0VarM11268y.b;
        obj2.getClass();
        int iD = xck0.d(((Number) obj2).intValue(), Integer.MAX_VALUE);
        long jO = mqi0.o();
        Object obj3 = xaj0VarM11268y.a;
        obj3.getClass();
        if (qqi0.h(jO, ((Number) obj3).longValue(), iD)) {
            return true;
        }
        Object obj4 = xaj0VarM11268y.a;
        obj4.getClass();
        return mqi0.D(((Number) obj4).longValue()) && ((Number) xaj0VarM11268y.c).intValue() < 1;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m11243e() {
        if (m11262s()) {
            return "core_intl_sport_photo_entrance_anim.svga";
        }
        return m11266w() ? "core_intl_trip_photo_entrance_anim.svga" : "core_intl_pet_photo_entrance_anim.svga";
    }

    /* JADX INFO: renamed from: e0 */
    public final void m11244e0(@NotNull Act act, int source) {
        act.getClass();
        if (NullChecker.a(CoreModule.c.e0.p9())) {
            (twActivity ? new jp60(act) : new yo60(act)).mo16142h();
            m11239c(source);
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m11245f(User user) {
        int iIndexOf = -1;
        for (Media media : user.pictures) {
            List list = media.labels;
            MediaLabel mediaLabelM11249h = m11249h();
            if (list != null && list.contains(mediaLabelM11249h)) {
                iIndexOf = user.pictures.indexOf(media);
            }
            if (iIndexOf != -1) {
                break;
            }
        }
        return iIndexOf;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m11246f0() {
        String str;
        Object obj = m11269z().get();
        obj.getClass();
        xaj0<Long, Integer, Integer> xaj0VarM11268y = m11268y((String) obj);
        Object obj2 = xaj0VarM11268y.a;
        obj2.getClass();
        if (mqi0.D(((Number) obj2).longValue())) {
            Object obj3 = xaj0VarM11268y.a;
            Object obj4 = xaj0VarM11268y.b;
            Integer numValueOf = Integer.valueOf(((Number) xaj0VarM11268y.c).intValue() + 1);
            xaj0VarM11268y.c = numValueOf;
            str = obj3 + "_" + obj4 + "_" + numValueOf;
        } else {
            long jO = mqi0.o();
            Integer numValueOf2 = Integer.valueOf(((Number) xaj0VarM11268y.b).intValue() + 1);
            xaj0VarM11268y.b = numValueOf2;
            str = jO + "_" + numValueOf2 + "_1";
        }
        m11269z().put(str);
    }

    /* JADX INFO: renamed from: g */
    public final int m11247g() {
        int iM11255l = m11255l();
        if (iM11255l < 0) {
            iM11255l = m11253j();
            if (iM11255l < 0) {
                return m11251i();
            }
            showType = "sport";
        }
        showType = "trip";
        return iM11255l;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m11248g0() {
        zvf0.x("e_petactivities_full", "p_activities_pets_page");
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final MediaLabel m11249h() {
        if (m11262s()) {
            MediaLabel mediaLabel = MediaLabel.get("WITH_SPORTS");
            mediaLabel.getClass();
            return mediaLabel;
        }
        if (m11266w()) {
            MediaLabel mediaLabel2 = MediaLabel.get("WITH_TRIP");
            mediaLabel2.getClass();
            return mediaLabel2;
        }
        MediaLabel mediaLabel3 = MediaLabel.get("WITH_PETS");
        mediaLabel3.getClass();
        return mediaLabel3;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m11250h0() {
        zvf0.r("e_petactivities_click", "p_activities_pets_page");
    }

    /* JADX INFO: renamed from: i */
    public final int m11251i() {
        return m11213B("intl_petactivities_card_config");
    }

    /* JADX INFO: renamed from: i0 */
    public final void m11252i0() {
        zvf0.x("e_petactivities_success", "p_activities_pets_page");
    }

    /* JADX INFO: renamed from: j */
    public final int m11253j() {
        return m11213B("intl_sportsman_card_config");
    }

    /* JADX INFO: renamed from: k */
    public final int m11254k() {
        return ((Number) swipeCount.getValue()).intValue();
    }

    /* JADX INFO: renamed from: l */
    public final int m11255l() {
        return m11213B("intl_trip_card_config");
    }

    /* JADX INFO: renamed from: m */
    public final boolean m11256m(@NotNull User user) {
        user.getClass();
        return NullChecker.a(user) && m11245f(user) != -1;
    }

    /* JADX INFO: renamed from: n */
    public final void m11257n(@NotNull User user) {
        int iM11245f;
        user.getClass();
        if (!m11260q(user) || (iM11245f = m11245f(user)) == -1 || iM11245f == 0) {
            return;
        }
        Collections.swap(user.pictures, 0, iM11245f);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m11258o(@NotNull List<MediaLabel> labels) {
        labels.getClass();
        if (m11261r() && labels.contains(MediaLabel.get("WITH_PETS"))) {
            return true;
        }
        if (m11262s() && labels.contains(MediaLabel.get("WITH_SPORTS"))) {
            return true;
        }
        return m11266w() && labels.contains(MediaLabel.get("WITH_TRIP"));
    }

    /* JADX INFO: renamed from: p */
    public final boolean m11259p(@NotNull User user) {
        user.getClass();
        return (user.status.contains(UserStatus.get("hidden")) || user.veryUgly() || user.isJailed()) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m11260q(@NotNull User user) {
        user.getClass();
        if (!NullChecker.a(user) || m11254k() < 0) {
            return false;
        }
        return m11256m(user);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m11261r() {
        return Intrinsics.d("pet", showType);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m11262s() {
        return Intrinsics.d("sport", showType);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m11263t() {
        return twActivity && Intrinsics.d("pet", showType);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m11264u() {
        return twActivity && Intrinsics.d("sport", showType);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m11265v() {
        return twActivity && Intrinsics.d("trip", showType);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m11266w() {
        return Intrinsics.d("trip", showType);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final hpd0 m11267x() {
        if (m11262s()) {
            return new hpd0("sport_phoot_is_upload_" + CoreModule.H().userId(), Boolean.FALSE);
        }
        if (m11266w()) {
            return new hpd0("trip_photo_is_upload_" + CoreModule.H().userId(), Boolean.FALSE);
        }
        return new hpd0("pet_phoot_is_upload_" + CoreModule.H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: y */
    public final xaj0<Long, Integer, Integer> m11268y(String str) {
        String[] strArr = (String[]) StringsKt.split$default(str, new String[]{"_"}, false, 0, 6, (Object) null).toArray(new String[0]);
        xaj0<Long, Integer, Integer> xaj0VarA = xaj0.a(Long.valueOf(strArr[0]), Integer.valueOf(strArr[1]), Integer.valueOf(strArr[2]));
        xaj0VarA.getClass();
        return xaj0VarA;
    }

    /* JADX INFO: renamed from: z */
    public final uqd0 m11269z() {
        if (m11262s()) {
            return new uqd0("sport_photo_reminder_num_" + CoreModule.H().userId(), "0_0_0");
        }
        if (m11266w()) {
            return new uqd0("trip_photo_reminder_num_" + CoreModule.H().userId(), "0_0_0");
        }
        return new uqd0("pet_photo_reminder_num_" + CoreModule.H().userId(), "0_0_0");
    }
}
