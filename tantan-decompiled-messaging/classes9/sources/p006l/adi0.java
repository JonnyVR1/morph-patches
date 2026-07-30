package p006l;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Environment;
import com.alibaba.fastjson.JSON;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.data.TarotCardData;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.StringCompanionObject;
import l.rhi;
import l.vwb;
import l.w9j;
import l.z3g0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u001e¨\u0006#"}, d2 = {"Ll/adi0;", "", "<init>", "()V", "Landroid/content/Context;", "act", "Landroid/graphics/Typeface;", "i", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "Landroid/graphics/Bitmap;", "bitmap", "Lrx/c;", "", "j", "(Landroid/graphics/Bitmap;)Lrx/c;", "k", "(Landroid/graphics/Bitmap;)Z", "", "id", "Lcom/p1/mobile/putong/core/data/TarotCardData;", "g", "(Landroid/content/Context;I)Lcom/p1/mobile/putong/core/data/TarotCardData;", "", "d", "()J", "left", "", "f", "(J)Ljava/lang/String;", "h", "()I", "a", "Lkotlin/Lazy;", "e", "swipeCount", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class adi0 {

    @NotNull
    public static final adi0 INSTANCE = new adi0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy swipeCount = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.xci0
        public final Object invoke() {
            return Integer.valueOf(adi0.m11813a());
        }
    });

    /* JADX INFO: renamed from: a */
    public static int m11813a() {
        return INSTANCE.m11823h();
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m11814b(int i) {
        return Boolean.valueOf(qib0.f19808f0 == i);
    }

    /* JADX INFO: renamed from: c */
    public static void m11815c(Bitmap bitmap, z3g0 z3g0Var) {
        if (rhi.n()) {
            z3g0Var.onNext(Boolean.valueOf(m11819k(bitmap)));
        } else {
            z3g0Var.onNext(Boolean.FALSE);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final TarotCardData m11816g(@NotNull Context act, int id) {
        act.getClass();
        TarotCardData tarotCardData = new TarotCardData();
        switch (id) {
            case 1:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f26863lc;
                tarotCardData.name = act.getString(R$string.f2049Qd);
                tarotCardData.keywords = act.getString(R$string.f2288Yc);
                tarotCardData.meaning = act.getString(R$string.f2719me);
                break;
            case 2:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f26863lc;
                tarotCardData.name = act.getString(R$string.f2049Qd);
                tarotCardData.keywords = act.getString(R$string.f2625jd);
                tarotCardData.meaning = act.getString(R$string.f3052xe);
                break;
            case CameraSticker.STATE_COMPLETE /* 3 */:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f27023qc;
                tarotCardData.name = act.getString(R$string.f2381be);
                tarotCardData.keywords = act.getString(R$string.f2961ud);
                tarotCardData.meaning = act.getString(R$string.f1810Ie);
                break;
            case CameraSticker.STATE_ERROR /* 4 */:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f27023qc;
                tarotCardData.name = act.getString(R$string.f2381be);
                tarotCardData.keywords = act.getString(R$string.f1719Fd);
                tarotCardData.meaning = act.getString(R$string.f2140Te);
                break;
            case 5:
                tarotCardData.image = x2c0.f27119tc;
                tarotCardData.reversed = false;
                tarotCardData.name = act.getString(R$string.f2504fe);
                tarotCardData.keywords = act.getString(R$string.f1899Ld);
                tarotCardData.meaning = act.getString(R$string.f2320Ze);
                break;
            case 6:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f27119tc;
                tarotCardData.name = act.getString(R$string.f2504fe);
                tarotCardData.keywords = act.getString(R$string.f1929Md);
                tarotCardData.meaning = act.getString(R$string.f2351af);
                break;
            case 7:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f27151uc;
                tarotCardData.name = act.getString(R$string.f2535ge);
                tarotCardData.keywords = act.getString(R$string.f1959Nd);
                tarotCardData.meaning = act.getString(R$string.f2382bf);
                break;
            case 8:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f27151uc;
                tarotCardData.name = act.getString(R$string.f2535ge);
                tarotCardData.keywords = act.getString(R$string.f1989Od);
                tarotCardData.meaning = act.getString(R$string.f2413cf);
                break;
            case 9:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f26799jc;
                tarotCardData.name = act.getString(R$string.f2566he);
                tarotCardData.keywords = act.getString(R$string.f2019Pd);
                tarotCardData.meaning = act.getString(R$string.f2444df);
                break;
            case 10:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f26799jc;
                tarotCardData.name = act.getString(R$string.f2566he);
                tarotCardData.keywords = act.getString(R$string.f2318Zc);
                tarotCardData.meaning = act.getString(R$string.f2750ne);
                break;
            case 11:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f27087sc;
                tarotCardData.name = act.getString(R$string.f2597ie);
                tarotCardData.keywords = act.getString(R$string.f2349ad);
                tarotCardData.meaning = act.getString(R$string.f2781oe);
                break;
            case 12:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f27087sc;
                tarotCardData.name = act.getString(R$string.f2597ie);
                tarotCardData.keywords = act.getString(R$string.f2380bd);
                tarotCardData.meaning = act.getString(R$string.f2812pe);
                break;
            case 13:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f26991pc;
                tarotCardData.name = act.getString(R$string.f2626je);
                tarotCardData.keywords = act.getString(R$string.f2411cd);
                tarotCardData.meaning = act.getString(R$string.f2842qe);
                break;
            case 14:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f26991pc;
                tarotCardData.name = act.getString(R$string.f2626je);
                tarotCardData.keywords = act.getString(R$string.f2442dd);
                tarotCardData.meaning = act.getString(R$string.f2872re);
                break;
            case 15:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f26705gc;
                tarotCardData.name = act.getString(R$string.f2657ke);
                tarotCardData.keywords = act.getString(R$string.f2472ed);
                tarotCardData.meaning = act.getString(R$string.f2902se);
                break;
            case 16:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f26705gc;
                tarotCardData.name = act.getString(R$string.f2657ke);
                tarotCardData.keywords = act.getString(R$string.f2503fd);
                tarotCardData.meaning = act.getString(R$string.f2932te);
                break;
            case 17:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f27215wc;
                tarotCardData.name = act.getString(R$string.f2688le);
                tarotCardData.keywords = act.getString(R$string.f2534gd);
                tarotCardData.meaning = act.getString(R$string.f2962ue);
                break;
            case 18:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f27215wc;
                tarotCardData.name = act.getString(R$string.f2688le);
                tarotCardData.keywords = act.getString(R$string.f2565hd);
                tarotCardData.meaning = act.getString(R$string.f2992ve);
                break;
            case 19:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f26831kc;
                tarotCardData.name = act.getString(R$string.f2079Rd);
                tarotCardData.keywords = act.getString(R$string.f2596id);
                tarotCardData.meaning = act.getString(R$string.f3022we);
                break;
            case 20:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f26831kc;
                tarotCardData.name = act.getString(R$string.f2079Rd);
                tarotCardData.keywords = act.getString(R$string.f2656kd);
                tarotCardData.meaning = act.getString(R$string.f3082ye);
                break;
            case 21:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f25702Ac;
                tarotCardData.name = act.getString(R$string.f2109Sd);
                tarotCardData.keywords = act.getString(R$string.f2687ld);
                tarotCardData.meaning = act.getString(R$string.f3112ze);
                break;
            case 22:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f25702Ac;
                tarotCardData.name = act.getString(R$string.f2109Sd);
                tarotCardData.keywords = act.getString(R$string.f2718md);
                tarotCardData.meaning = act.getString(R$string.f1570Ae);
                break;
            case 23:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f26959oc;
                tarotCardData.name = act.getString(R$string.f2139Td);
                tarotCardData.keywords = act.getString(R$string.f2749nd);
                tarotCardData.meaning = act.getString(R$string.f1600Be);
                break;
            case 24:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f26959oc;
                tarotCardData.name = act.getString(R$string.f2139Td);
                tarotCardData.keywords = act.getString(R$string.f2780od);
                tarotCardData.meaning = act.getString(R$string.f1630Ce);
                break;
            case 25:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f26927nc;
                tarotCardData.name = act.getString(R$string.f2169Ud);
                tarotCardData.keywords = act.getString(R$string.f2811pd);
                tarotCardData.meaning = act.getString(R$string.f1660De);
                break;
            case 26:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f26927nc;
                tarotCardData.name = act.getString(R$string.f2169Ud);
                tarotCardData.keywords = act.getString(R$string.f2841qd);
                tarotCardData.meaning = act.getString(R$string.f1690Ee);
                break;
            case 27:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f26895mc;
                tarotCardData.name = act.getString(R$string.f2199Vd);
                tarotCardData.keywords = act.getString(R$string.f2871rd);
                tarotCardData.meaning = act.getString(R$string.f1720Fe);
                break;
            case 28:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f26895mc;
                tarotCardData.name = act.getString(R$string.f2199Vd);
                tarotCardData.keywords = act.getString(R$string.f2901sd);
                tarotCardData.meaning = act.getString(R$string.f1750Ge);
                break;
            case 29:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f26737hc;
                tarotCardData.name = act.getString(R$string.f2229Wd);
                tarotCardData.keywords = act.getString(R$string.f2931td);
                tarotCardData.meaning = act.getString(R$string.f1780He);
                break;
            case 30:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f26737hc;
                tarotCardData.name = act.getString(R$string.f2229Wd);
                tarotCardData.keywords = act.getString(R$string.f2991vd);
                tarotCardData.meaning = act.getString(R$string.f1840Je);
                break;
            case 31:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f26769ic;
                tarotCardData.name = act.getString(R$string.f2259Xd);
                tarotCardData.keywords = act.getString(R$string.f3021wd);
                tarotCardData.meaning = act.getString(R$string.f1870Ke);
                break;
            case 32:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f26769ic;
                tarotCardData.name = act.getString(R$string.f2259Xd);
                tarotCardData.keywords = act.getString(R$string.f3051xd);
                tarotCardData.meaning = act.getString(R$string.f1900Le);
                break;
            case 33:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f27279yc;
                tarotCardData.name = act.getString(R$string.f2289Yd);
                tarotCardData.keywords = act.getString(R$string.f3081yd);
                tarotCardData.meaning = act.getString(R$string.f1930Me);
                break;
            case 34:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f27279yc;
                tarotCardData.name = act.getString(R$string.f2289Yd);
                tarotCardData.keywords = act.getString(R$string.f3111zd);
                tarotCardData.meaning = act.getString(R$string.f1960Ne);
                break;
            case 35:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f27183vc;
                tarotCardData.name = act.getString(R$string.f2319Zd);
                tarotCardData.keywords = act.getString(R$string.f1569Ad);
                tarotCardData.meaning = act.getString(R$string.f1990Oe);
                break;
            case 36:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f27183vc;
                tarotCardData.name = act.getString(R$string.f2319Zd);
                tarotCardData.keywords = act.getString(R$string.f1599Bd);
                tarotCardData.meaning = act.getString(R$string.f2020Pe);
                break;
            case 37:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f27055rc;
                tarotCardData.name = act.getString(R$string.f2350ae);
                tarotCardData.keywords = act.getString(R$string.f1629Cd);
                tarotCardData.meaning = act.getString(R$string.f2050Qe);
                break;
            case 38:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f27055rc;
                tarotCardData.name = act.getString(R$string.f2350ae);
                tarotCardData.keywords = act.getString(R$string.f1659Dd);
                tarotCardData.meaning = act.getString(R$string.f2080Re);
                break;
            case 39:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f27247xc;
                tarotCardData.name = act.getString(R$string.f2412ce);
                tarotCardData.keywords = act.getString(R$string.f1689Ed);
                tarotCardData.meaning = act.getString(R$string.f2110Se);
                break;
            case 40:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f27247xc;
                tarotCardData.name = act.getString(R$string.f2412ce);
                tarotCardData.keywords = act.getString(R$string.f1749Gd);
                tarotCardData.meaning = act.getString(R$string.f2170Ue);
                break;
            case 41:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f27311zc;
                tarotCardData.name = act.getString(R$string.f2443de);
                tarotCardData.keywords = act.getString(R$string.f1779Hd);
                tarotCardData.meaning = act.getString(R$string.f2200Ve);
                break;
            case 42:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f27311zc;
                tarotCardData.name = act.getString(R$string.f2443de);
                tarotCardData.keywords = act.getString(R$string.f1809Id);
                tarotCardData.meaning = act.getString(R$string.f2230We);
                break;
            case 43:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f25734Bc;
                tarotCardData.name = act.getString(R$string.f2473ee);
                tarotCardData.keywords = act.getString(R$string.f1839Jd);
                tarotCardData.meaning = act.getString(R$string.f2260Xe);
                break;
            case 44:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f25734Bc;
                tarotCardData.name = act.getString(R$string.f2473ee);
                tarotCardData.keywords = act.getString(R$string.f1869Kd);
                tarotCardData.meaning = act.getString(R$string.f2290Ye);
                break;
        }
        return tarotCardData;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final Typeface m11817i(@NotNull Context act) {
        act.getClass();
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(act.getResources().getAssets(), "Medium_SourceHanSerifTW.ttf");
        typefaceCreateFromAsset.getClass();
        return typefaceCreateFromAsset;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final c<Boolean> m11818j(@NotNull final Bitmap bitmap) {
        bitmap.getClass();
        c<Boolean> cVarCreate = c.create(new c.a() { // from class: l.zci0
            public final void call(Object obj) {
                adi0.m11815c(bitmap, (z3g0) obj);
            }
        });
        cVarCreate.getClass();
        return cVarCreate;
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final boolean m11819k(Bitmap bitmap) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            String absolutePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath();
            String str = File.separator;
            String str2 = absolutePath + str + "Tantan";
            File file = new File(str2);
            String str3 = System.currentTimeMillis() + ".png";
            if (file.exists() || (!file.exists() && file.mkdirs())) {
                String str4 = str2 + str + str3;
                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(file, str3));
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                    fileOutputStream2.flush();
                    App.e.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://".concat(str4))));
                    fileOutputStream = fileOutputStream2;
                } catch (IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream == null) {
                        return false;
                    }
                    try {
                        fileOutputStream.close();
                        return false;
                    } catch (IOException unused2) {
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            }
            if (fileOutputStream == null) {
                return true;
            }
            try {
                fileOutputStream.close();
                return true;
            } catch (IOException unused4) {
                return true;
            }
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final long m11820d() {
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(11);
        int i4 = calendar.get(5);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(i, i2, i4, 21, 0, 0);
        return i3 > 22 ? calendar2.getTimeInMillis() + 86400000 : calendar2.getTimeInMillis();
    }

    /* JADX INFO: renamed from: e */
    public final int m11821e() {
        return ((Number) swipeCount.getValue()).intValue();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m11822f(long left) {
        long j = left / 3600000;
        TimeUnit timeUnit = TimeUnit.HOURS;
        long millis = (left - timeUnit.toMillis(j)) / 60000;
        long millis2 = ((left - timeUnit.toMillis(j)) - TimeUnit.MINUTES.toMillis(millis)) / 1000;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(millis), Long.valueOf(millis2)}, 3));
    }

    /* JADX INFO: renamed from: h */
    public final int m11823h() {
        if (c4p.INSTANCE.m13148d()) {
            return -1;
        }
        try {
            String strF = RemoteConfig.x().F("intl_tarot_card_config");
            strF.getClass();
            JSONObject jSONObject = new JSONObject(strF);
            if (jSONObject.getBoolean("enable")) {
                JSONArray jSONArray = jSONObject.getJSONArray("area");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    if ((obj instanceof JSONObject) && vwb.m(JSON.parseArray(((JSONObject) obj).getString("mcc"), Integer.TYPE), new w9j() { // from class: l.yci0
                        public final Object call(Object obj2) {
                            return adi0.m11814b(((Integer) obj2).intValue());
                        }
                    })) {
                        return ((JSONObject) obj).getInt("swipe_count");
                    }
                }
            }
        } catch (Exception unused) {
        }
        return -1;
    }
}
