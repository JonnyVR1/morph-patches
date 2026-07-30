package p149l;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Environment;
import com.alibaba.fastjson.JSON;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.TarotCardData;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
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
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u001e¨\u0006#"}, m87232d2 = {"Ll/adi0;", "", "<init>", "()V", "Landroid/content/Context;", SocialConstants.PARAM_ACT, "Landroid/graphics/Typeface;", RXScreenCaptureService.KEY_INDEX, "(Landroid/content/Context;)Landroid/graphics/Typeface;", "Landroid/graphics/Bitmap;", "bitmap", "Lrx/c;", "", "j", "(Landroid/graphics/Bitmap;)Lrx/c;", "k", "(Landroid/graphics/Bitmap;)Z", "", "id", "Lcom/p1/mobile/putong/core/data/TarotCardData;", "g", "(Landroid/content/Context;I)Lcom/p1/mobile/putong/core/data/TarotCardData;", "", Constants.INAPP_DATA_TAG, "()J", BLiveGiftBubblePopupTitlePosition.left, "", "f", "(J)Ljava/lang/String;", "h", "()I", "a", "Lkotlin/Lazy;", "e", "swipeCount", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class adi0 {

    @NotNull
    public static final adi0 INSTANCE = new adi0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy swipeCount = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.xci0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(adi0.m95892a());
        }
    });

    /* JADX INFO: renamed from: a */
    public static int m95892a() {
        return INSTANCE.m95902h();
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m95893b(int i) {
        return Boolean.valueOf(qib0.f154717f0 == i);
    }

    /* JADX INFO: renamed from: c */
    public static void m95894c(Bitmap bitmap, z3g0 z3g0Var) {
        if (rhi.m179370n()) {
            z3g0Var.onNext(Boolean.valueOf(m95898k(bitmap)));
        } else {
            z3g0Var.onNext(Boolean.FALSE);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final TarotCardData m95895g(@NotNull Context act, int id) {
        act.getClass();
        TarotCardData tarotCardData = new TarotCardData();
        switch (id) {
            case 1:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f190327lc;
                tarotCardData.name = act.getString(R$string.f18060Qd);
                tarotCardData.keywords = act.getString(R$string.f18299Yc);
                tarotCardData.meaning = act.getString(R$string.f18730me);
                break;
            case 2:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f190327lc;
                tarotCardData.name = act.getString(R$string.f18060Qd);
                tarotCardData.keywords = act.getString(R$string.f18636jd);
                tarotCardData.meaning = act.getString(R$string.f19063xe);
                break;
            case 3:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f190487qc;
                tarotCardData.name = act.getString(R$string.f18392be);
                tarotCardData.keywords = act.getString(R$string.f18972ud);
                tarotCardData.meaning = act.getString(R$string.f17821Ie);
                break;
            case 4:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f190487qc;
                tarotCardData.name = act.getString(R$string.f18392be);
                tarotCardData.keywords = act.getString(R$string.f17730Fd);
                tarotCardData.meaning = act.getString(R$string.f18151Te);
                break;
            case 5:
                tarotCardData.image = x2c0.f190583tc;
                tarotCardData.reversed = false;
                tarotCardData.name = act.getString(R$string.f18515fe);
                tarotCardData.keywords = act.getString(R$string.f17910Ld);
                tarotCardData.meaning = act.getString(R$string.f18331Ze);
                break;
            case 6:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f190583tc;
                tarotCardData.name = act.getString(R$string.f18515fe);
                tarotCardData.keywords = act.getString(R$string.f17940Md);
                tarotCardData.meaning = act.getString(R$string.f18362af);
                break;
            case 7:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f190615uc;
                tarotCardData.name = act.getString(R$string.f18546ge);
                tarotCardData.keywords = act.getString(R$string.f17970Nd);
                tarotCardData.meaning = act.getString(R$string.f18393bf);
                break;
            case 8:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f190615uc;
                tarotCardData.name = act.getString(R$string.f18546ge);
                tarotCardData.keywords = act.getString(R$string.f18000Od);
                tarotCardData.meaning = act.getString(R$string.f18424cf);
                break;
            case 9:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f190263jc;
                tarotCardData.name = act.getString(R$string.f18577he);
                tarotCardData.keywords = act.getString(R$string.f18030Pd);
                tarotCardData.meaning = act.getString(R$string.f18455df);
                break;
            case 10:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f190263jc;
                tarotCardData.name = act.getString(R$string.f18577he);
                tarotCardData.keywords = act.getString(R$string.f18329Zc);
                tarotCardData.meaning = act.getString(R$string.f18761ne);
                break;
            case 11:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f190551sc;
                tarotCardData.name = act.getString(R$string.f18608ie);
                tarotCardData.keywords = act.getString(R$string.f18360ad);
                tarotCardData.meaning = act.getString(R$string.f18792oe);
                break;
            case 12:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f190551sc;
                tarotCardData.name = act.getString(R$string.f18608ie);
                tarotCardData.keywords = act.getString(R$string.f18391bd);
                tarotCardData.meaning = act.getString(R$string.f18823pe);
                break;
            case 13:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f190455pc;
                tarotCardData.name = act.getString(R$string.f18637je);
                tarotCardData.keywords = act.getString(R$string.f18422cd);
                tarotCardData.meaning = act.getString(R$string.f18853qe);
                break;
            case 14:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f190455pc;
                tarotCardData.name = act.getString(R$string.f18637je);
                tarotCardData.keywords = act.getString(R$string.f18453dd);
                tarotCardData.meaning = act.getString(R$string.f18883re);
                break;
            case 15:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f190169gc;
                tarotCardData.name = act.getString(R$string.f18668ke);
                tarotCardData.keywords = act.getString(R$string.f18483ed);
                tarotCardData.meaning = act.getString(R$string.f18913se);
                break;
            case 16:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f190169gc;
                tarotCardData.name = act.getString(R$string.f18668ke);
                tarotCardData.keywords = act.getString(R$string.f18514fd);
                tarotCardData.meaning = act.getString(R$string.f18943te);
                break;
            case 17:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f190679wc;
                tarotCardData.name = act.getString(R$string.f18699le);
                tarotCardData.keywords = act.getString(R$string.f18545gd);
                tarotCardData.meaning = act.getString(R$string.f18973ue);
                break;
            case 18:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f190679wc;
                tarotCardData.name = act.getString(R$string.f18699le);
                tarotCardData.keywords = act.getString(R$string.f18576hd);
                tarotCardData.meaning = act.getString(R$string.f19003ve);
                break;
            case 19:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f190295kc;
                tarotCardData.name = act.getString(R$string.f18090Rd);
                tarotCardData.keywords = act.getString(R$string.f18607id);
                tarotCardData.meaning = act.getString(R$string.f19033we);
                break;
            case 20:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f190295kc;
                tarotCardData.name = act.getString(R$string.f18090Rd);
                tarotCardData.keywords = act.getString(R$string.f18667kd);
                tarotCardData.meaning = act.getString(R$string.f19093ye);
                break;
            case 21:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f189166Ac;
                tarotCardData.name = act.getString(R$string.f18120Sd);
                tarotCardData.keywords = act.getString(R$string.f18698ld);
                tarotCardData.meaning = act.getString(R$string.f19123ze);
                break;
            case 22:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f189166Ac;
                tarotCardData.name = act.getString(R$string.f18120Sd);
                tarotCardData.keywords = act.getString(R$string.f18729md);
                tarotCardData.meaning = act.getString(R$string.f17581Ae);
                break;
            case 23:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f190423oc;
                tarotCardData.name = act.getString(R$string.f18150Td);
                tarotCardData.keywords = act.getString(R$string.f18760nd);
                tarotCardData.meaning = act.getString(R$string.f17611Be);
                break;
            case 24:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f190423oc;
                tarotCardData.name = act.getString(R$string.f18150Td);
                tarotCardData.keywords = act.getString(R$string.f18791od);
                tarotCardData.meaning = act.getString(R$string.f17641Ce);
                break;
            case 25:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f190391nc;
                tarotCardData.name = act.getString(R$string.f18180Ud);
                tarotCardData.keywords = act.getString(R$string.f18822pd);
                tarotCardData.meaning = act.getString(R$string.f17671De);
                break;
            case 26:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f190391nc;
                tarotCardData.name = act.getString(R$string.f18180Ud);
                tarotCardData.keywords = act.getString(R$string.f18852qd);
                tarotCardData.meaning = act.getString(R$string.f17701Ee);
                break;
            case 27:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f190359mc;
                tarotCardData.name = act.getString(R$string.f18210Vd);
                tarotCardData.keywords = act.getString(R$string.f18882rd);
                tarotCardData.meaning = act.getString(R$string.f17731Fe);
                break;
            case 28:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f190359mc;
                tarotCardData.name = act.getString(R$string.f18210Vd);
                tarotCardData.keywords = act.getString(R$string.f18912sd);
                tarotCardData.meaning = act.getString(R$string.f17761Ge);
                break;
            case 29:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f190201hc;
                tarotCardData.name = act.getString(R$string.f18240Wd);
                tarotCardData.keywords = act.getString(R$string.f18942td);
                tarotCardData.meaning = act.getString(R$string.f17791He);
                break;
            case 30:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f190201hc;
                tarotCardData.name = act.getString(R$string.f18240Wd);
                tarotCardData.keywords = act.getString(R$string.f19002vd);
                tarotCardData.meaning = act.getString(R$string.f17851Je);
                break;
            case 31:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f190233ic;
                tarotCardData.name = act.getString(R$string.f18270Xd);
                tarotCardData.keywords = act.getString(R$string.f19032wd);
                tarotCardData.meaning = act.getString(R$string.f17881Ke);
                break;
            case 32:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f190233ic;
                tarotCardData.name = act.getString(R$string.f18270Xd);
                tarotCardData.keywords = act.getString(R$string.f19062xd);
                tarotCardData.meaning = act.getString(R$string.f17911Le);
                break;
            case 33:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f190743yc;
                tarotCardData.name = act.getString(R$string.f18300Yd);
                tarotCardData.keywords = act.getString(R$string.f19092yd);
                tarotCardData.meaning = act.getString(R$string.f17941Me);
                break;
            case 34:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f190743yc;
                tarotCardData.name = act.getString(R$string.f18300Yd);
                tarotCardData.keywords = act.getString(R$string.f19122zd);
                tarotCardData.meaning = act.getString(R$string.f17971Ne);
                break;
            case 35:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f190647vc;
                tarotCardData.name = act.getString(R$string.f18330Zd);
                tarotCardData.keywords = act.getString(R$string.f17580Ad);
                tarotCardData.meaning = act.getString(R$string.f18001Oe);
                break;
            case 36:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f190647vc;
                tarotCardData.name = act.getString(R$string.f18330Zd);
                tarotCardData.keywords = act.getString(R$string.f17610Bd);
                tarotCardData.meaning = act.getString(R$string.f18031Pe);
                break;
            case 37:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f190519rc;
                tarotCardData.name = act.getString(R$string.f18361ae);
                tarotCardData.keywords = act.getString(R$string.f17640Cd);
                tarotCardData.meaning = act.getString(R$string.f18061Qe);
                break;
            case 38:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f190519rc;
                tarotCardData.name = act.getString(R$string.f18361ae);
                tarotCardData.keywords = act.getString(R$string.f17670Dd);
                tarotCardData.meaning = act.getString(R$string.f18091Re);
                break;
            case 39:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f190711xc;
                tarotCardData.name = act.getString(R$string.f18423ce);
                tarotCardData.keywords = act.getString(R$string.f17700Ed);
                tarotCardData.meaning = act.getString(R$string.f18121Se);
                break;
            case 40:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f190711xc;
                tarotCardData.name = act.getString(R$string.f18423ce);
                tarotCardData.keywords = act.getString(R$string.f17760Gd);
                tarotCardData.meaning = act.getString(R$string.f18181Ue);
                break;
            case 41:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f190775zc;
                tarotCardData.name = act.getString(R$string.f18454de);
                tarotCardData.keywords = act.getString(R$string.f17790Hd);
                tarotCardData.meaning = act.getString(R$string.f18211Ve);
                break;
            case 42:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f190775zc;
                tarotCardData.name = act.getString(R$string.f18454de);
                tarotCardData.keywords = act.getString(R$string.f17820Id);
                tarotCardData.meaning = act.getString(R$string.f18241We);
                break;
            case 43:
                tarotCardData.reversed = false;
                tarotCardData.image = x2c0.f189198Bc;
                tarotCardData.name = act.getString(R$string.f18484ee);
                tarotCardData.keywords = act.getString(R$string.f17850Jd);
                tarotCardData.meaning = act.getString(R$string.f18271Xe);
                break;
            case 44:
                tarotCardData.reversed = true;
                tarotCardData.image = x2c0.f189198Bc;
                tarotCardData.name = act.getString(R$string.f18484ee);
                tarotCardData.keywords = act.getString(R$string.f17880Kd);
                tarotCardData.meaning = act.getString(R$string.f18301Ye);
                break;
        }
        return tarotCardData;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final Typeface m95896i(@NotNull Context act) {
        act.getClass();
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(act.getResources().getAssets(), "Medium_SourceHanSerifTW.ttf");
        typefaceCreateFromAsset.getClass();
        return typefaceCreateFromAsset;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final C22306c<Boolean> m95897j(@NotNull final Bitmap bitmap) {
        bitmap.getClass();
        C22306c<Boolean> c22306cCreate = C22306c.create(new C22306c.a() { // from class: l.zci0
            @Override // p149l.e30
            public final void call(Object obj) {
                adi0.m95894c(bitmap, (z3g0) obj);
            }
        });
        c22306cCreate.getClass();
        return c22306cCreate;
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final boolean m95898k(Bitmap bitmap) throws Throwable {
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
                    App.f15369e.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://".concat(str4))));
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
    public final long m95899d() {
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
    public final int m95900e() {
        return ((Number) swipeCount.getValue()).intValue();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m95901f(long left) {
        long j = left / 3600000;
        TimeUnit timeUnit = TimeUnit.HOURS;
        long millis = (left - timeUnit.toMillis(j)) / Constants.ONE_MIN_IN_MILLIS;
        long millis2 = ((left - timeUnit.toMillis(j)) - TimeUnit.MINUTES.toMillis(millis)) / 1000;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(millis), Long.valueOf(millis2)}, 3));
    }

    /* JADX INFO: renamed from: h */
    public final int m95902h() {
        if (c4p.INSTANCE.m105237d()) {
            return -1;
        }
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("intl_tarot_card_config");
            strM79302F.getClass();
            JSONObject jSONObject = new JSONObject(strM79302F);
            if (jSONObject.getBoolean("enable")) {
                JSONArray jSONArray = jSONObject.getJSONArray("area");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    if ((obj instanceof JSONObject) && vwb.m200337m(JSON.parseArray(((JSONObject) obj).getString("mcc"), Integer.TYPE), new w9j() { // from class: l.yci0
                        @Override // p149l.w9j
                        public final Object call(Object obj2) {
                            return adi0.m95893b(((Integer) obj2).intValue());
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
