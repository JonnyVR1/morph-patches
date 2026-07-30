package p153l;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Environment;
import com.alibaba.fastjson.JSON;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.TarotCardData;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u001e¨\u0006#"}, m88121d2 = {"Ll/ami0;", "", "<init>", "()V", "Landroid/content/Context;", SocialConstants.PARAM_ACT, "Landroid/graphics/Typeface;", RXScreenCaptureService.KEY_INDEX, "(Landroid/content/Context;)Landroid/graphics/Typeface;", "Landroid/graphics/Bitmap;", "bitmap", "Lrx/c;", "", "j", "(Landroid/graphics/Bitmap;)Lrx/c;", "k", "(Landroid/graphics/Bitmap;)Z", "", "id", "Lcom/p1/mobile/putong/core/data/TarotCardData;", "g", "(Landroid/content/Context;I)Lcom/p1/mobile/putong/core/data/TarotCardData;", "", Constants.INAPP_DATA_TAG, "()J", BLiveGiftBubblePopupTitlePosition.left, "", "f", "(J)Ljava/lang/String;", "h", "()I", "a", "Lkotlin/Lazy;", "e", "swipeCount", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ami0 {

    @NotNull
    public static final ami0 INSTANCE = new ami0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy swipeCount = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.xli0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(ami0.m98823a());
        }
    });

    /* JADX INFO: renamed from: a */
    public static int m98823a() {
        return INSTANCE.m98833h();
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m98824b(int i) {
        return Boolean.valueOf(uqb0.f180400f0 == i);
    }

    /* JADX INFO: renamed from: c */
    public static void m98825c(Bitmap bitmap, gcg0 gcg0Var) {
        if (oki.m168026n()) {
            gcg0Var.onNext(Boolean.valueOf(m98829k(bitmap)));
        } else {
            gcg0Var.onNext(Boolean.FALSE);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final TarotCardData m98826g(@NotNull Context act, int id) {
        act.getClass();
        TarotCardData tarotCardData = new TarotCardData();
        switch (id) {
            case 1:
                tarotCardData.reversed = false;
                tarotCardData.image = dbc0.f87214mc;
                tarotCardData.name = act.getString(R$string.f19338ie);
                tarotCardData.keywords = act.getString(R$string.f19583qd);
                tarotCardData.meaning = act.getString(R$string.f18424Ee);
                break;
            case 2:
                tarotCardData.reversed = true;
                tarotCardData.image = dbc0.f87214mc;
                tarotCardData.name = act.getString(R$string.f19338ie);
                tarotCardData.keywords = act.getString(R$string.f18330Bd);
                tarotCardData.meaning = act.getString(R$string.f18761Pe);
                break;
            case 3:
                tarotCardData.reversed = false;
                tarotCardData.image = dbc0.f87379rc;
                tarotCardData.name = act.getString(R$string.f19677te);
                tarotCardData.keywords = act.getString(R$string.f18670Md);
                tarotCardData.meaning = act.getString(R$string.f19092af);
                break;
            case 4:
                tarotCardData.reversed = true;
                tarotCardData.image = dbc0.f87379rc;
                tarotCardData.name = act.getString(R$string.f19677te);
                tarotCardData.keywords = act.getString(R$string.f19000Xd);
                tarotCardData.meaning = act.getString(R$string.f19461mf);
                break;
            case 5:
                tarotCardData.image = dbc0.f87478uc;
                tarotCardData.reversed = false;
                tarotCardData.name = act.getString(R$string.f19801xe);
                tarotCardData.keywords = act.getString(R$string.f19184de);
                tarotCardData.meaning = act.getString(R$string.f19647sf);
                break;
            case 6:
                tarotCardData.reversed = true;
                tarotCardData.image = dbc0.f87478uc;
                tarotCardData.name = act.getString(R$string.f19801xe);
                tarotCardData.keywords = act.getString(R$string.f19214ee);
                tarotCardData.meaning = act.getString(R$string.f19678tf);
                break;
            case 7:
                tarotCardData.reversed = false;
                tarotCardData.image = dbc0.f87510vc;
                tarotCardData.name = act.getString(R$string.f19832ye);
                tarotCardData.keywords = act.getString(R$string.f19245fe);
                tarotCardData.meaning = act.getString(R$string.f19709uf);
                break;
            case 8:
                tarotCardData.reversed = true;
                tarotCardData.image = dbc0.f87510vc;
                tarotCardData.name = act.getString(R$string.f19832ye);
                tarotCardData.keywords = act.getString(R$string.f19276ge);
                tarotCardData.meaning = act.getString(R$string.f19740vf);
                break;
            case 9:
                tarotCardData.reversed = false;
                tarotCardData.image = dbc0.f87148kc;
                tarotCardData.name = act.getString(R$string.f19863ze);
                tarotCardData.keywords = act.getString(R$string.f19307he);
                tarotCardData.meaning = act.getString(R$string.f19771wf);
                break;
            case 10:
                tarotCardData.reversed = true;
                tarotCardData.image = dbc0.f87148kc;
                tarotCardData.name = act.getString(R$string.f19863ze);
                tarotCardData.keywords = act.getString(R$string.f19614rd);
                tarotCardData.meaning = act.getString(R$string.f18455Fe);
                break;
            case 11:
                tarotCardData.reversed = false;
                tarotCardData.image = dbc0.f87445tc;
                tarotCardData.name = act.getString(R$string.f18300Ae);
                tarotCardData.keywords = act.getString(R$string.f19645sd);
                tarotCardData.meaning = act.getString(R$string.f18486Ge);
                break;
            case 12:
                tarotCardData.reversed = true;
                tarotCardData.image = dbc0.f87445tc;
                tarotCardData.name = act.getString(R$string.f18300Ae);
                tarotCardData.keywords = act.getString(R$string.f19676td);
                tarotCardData.meaning = act.getString(R$string.f18517He);
                break;
            case 13:
                tarotCardData.reversed = false;
                tarotCardData.image = dbc0.f87346qc;
                tarotCardData.name = act.getString(R$string.f18331Be);
                tarotCardData.keywords = act.getString(R$string.f19707ud);
                tarotCardData.meaning = act.getString(R$string.f18548Ie);
                break;
            case 14:
                tarotCardData.reversed = true;
                tarotCardData.image = dbc0.f87346qc;
                tarotCardData.name = act.getString(R$string.f18331Be);
                tarotCardData.keywords = act.getString(R$string.f19738vd);
                tarotCardData.meaning = act.getString(R$string.f18579Je);
                break;
            case 15:
                tarotCardData.reversed = false;
                tarotCardData.image = dbc0.f87051hc;
                tarotCardData.name = act.getString(R$string.f18362Ce);
                tarotCardData.keywords = act.getString(R$string.f19769wd);
                tarotCardData.meaning = act.getString(R$string.f18610Ke);
                break;
            case 16:
                tarotCardData.reversed = true;
                tarotCardData.image = dbc0.f87051hc;
                tarotCardData.name = act.getString(R$string.f18362Ce);
                tarotCardData.keywords = act.getString(R$string.f19800xd);
                tarotCardData.meaning = act.getString(R$string.f18641Le);
                break;
            case 17:
                tarotCardData.reversed = false;
                tarotCardData.image = dbc0.f87574xc;
                tarotCardData.name = act.getString(R$string.f18393De);
                tarotCardData.keywords = act.getString(R$string.f19831yd);
                tarotCardData.meaning = act.getString(R$string.f18671Me);
                break;
            case 18:
                tarotCardData.reversed = true;
                tarotCardData.image = dbc0.f87574xc;
                tarotCardData.name = act.getString(R$string.f18393De);
                tarotCardData.keywords = act.getString(R$string.f19862zd);
                tarotCardData.meaning = act.getString(R$string.f18701Ne);
                break;
            case 19:
                tarotCardData.reversed = false;
                tarotCardData.image = dbc0.f87181lc;
                tarotCardData.name = act.getString(R$string.f19367je);
                tarotCardData.keywords = act.getString(R$string.f18299Ad);
                tarotCardData.meaning = act.getString(R$string.f18731Oe);
                break;
            case 20:
                tarotCardData.reversed = true;
                tarotCardData.image = dbc0.f87181lc;
                tarotCardData.name = act.getString(R$string.f19367je);
                tarotCardData.keywords = act.getString(R$string.f18361Cd);
                tarotCardData.meaning = act.getString(R$string.f18791Qe);
                break;
            case 21:
                tarotCardData.reversed = false;
                tarotCardData.image = dbc0.f86021Bc;
                tarotCardData.name = act.getString(R$string.f19398ke);
                tarotCardData.keywords = act.getString(R$string.f18392Dd);
                tarotCardData.meaning = act.getString(R$string.f18821Re);
                break;
            case 22:
                tarotCardData.reversed = true;
                tarotCardData.image = dbc0.f86021Bc;
                tarotCardData.name = act.getString(R$string.f19398ke);
                tarotCardData.keywords = act.getString(R$string.f18423Ed);
                tarotCardData.meaning = act.getString(R$string.f18851Se);
                break;
            case 23:
                tarotCardData.reversed = false;
                tarotCardData.image = dbc0.f87313pc;
                tarotCardData.name = act.getString(R$string.f19429le);
                tarotCardData.keywords = act.getString(R$string.f18454Fd);
                tarotCardData.meaning = act.getString(R$string.f18881Te);
                break;
            case 24:
                tarotCardData.reversed = true;
                tarotCardData.image = dbc0.f87313pc;
                tarotCardData.name = act.getString(R$string.f19429le);
                tarotCardData.keywords = act.getString(R$string.f18485Gd);
                tarotCardData.meaning = act.getString(R$string.f18911Ue);
                break;
            case 25:
                tarotCardData.reversed = false;
                tarotCardData.image = dbc0.f87280oc;
                tarotCardData.name = act.getString(R$string.f19460me);
                tarotCardData.keywords = act.getString(R$string.f18516Hd);
                tarotCardData.meaning = act.getString(R$string.f18941Ve);
                break;
            case 26:
                tarotCardData.reversed = true;
                tarotCardData.image = dbc0.f87280oc;
                tarotCardData.name = act.getString(R$string.f19460me);
                tarotCardData.keywords = act.getString(R$string.f18547Id);
                tarotCardData.meaning = act.getString(R$string.f18971We);
                break;
            case 27:
                tarotCardData.reversed = false;
                tarotCardData.image = dbc0.f87247nc;
                tarotCardData.name = act.getString(R$string.f19491ne);
                tarotCardData.keywords = act.getString(R$string.f18578Jd);
                tarotCardData.meaning = act.getString(R$string.f19001Xe);
                break;
            case 28:
                tarotCardData.reversed = true;
                tarotCardData.image = dbc0.f87247nc;
                tarotCardData.name = act.getString(R$string.f19491ne);
                tarotCardData.keywords = act.getString(R$string.f18609Kd);
                tarotCardData.meaning = act.getString(R$string.f19031Ye);
                break;
            case 29:
                tarotCardData.reversed = false;
                tarotCardData.image = dbc0.f87084ic;
                tarotCardData.name = act.getString(R$string.f19522oe);
                tarotCardData.keywords = act.getString(R$string.f18640Ld);
                tarotCardData.meaning = act.getString(R$string.f19061Ze);
                break;
            case 30:
                tarotCardData.reversed = true;
                tarotCardData.image = dbc0.f87084ic;
                tarotCardData.name = act.getString(R$string.f19522oe);
                tarotCardData.keywords = act.getString(R$string.f18700Nd);
                tarotCardData.meaning = act.getString(R$string.f19123bf);
                break;
            case 31:
                tarotCardData.reversed = false;
                tarotCardData.image = dbc0.f87115jc;
                tarotCardData.name = act.getString(R$string.f19553pe);
                tarotCardData.keywords = act.getString(R$string.f18730Od);
                tarotCardData.meaning = act.getString(R$string.f19154cf);
                break;
            case 32:
                tarotCardData.reversed = true;
                tarotCardData.image = dbc0.f87115jc;
                tarotCardData.name = act.getString(R$string.f19553pe);
                tarotCardData.keywords = act.getString(R$string.f18760Pd);
                tarotCardData.meaning = act.getString(R$string.f19185df);
                break;
            case 33:
                tarotCardData.reversed = false;
                tarotCardData.image = dbc0.f87638zc;
                tarotCardData.name = act.getString(R$string.f19584qe);
                tarotCardData.keywords = act.getString(R$string.f18790Qd);
                tarotCardData.meaning = act.getString(R$string.f19215ef);
                break;
            case 34:
                tarotCardData.reversed = true;
                tarotCardData.image = dbc0.f87638zc;
                tarotCardData.name = act.getString(R$string.f19584qe);
                tarotCardData.keywords = act.getString(R$string.f18820Rd);
                tarotCardData.meaning = act.getString(R$string.f19246ff);
                break;
            case 35:
                tarotCardData.reversed = false;
                tarotCardData.image = dbc0.f87542wc;
                tarotCardData.name = act.getString(R$string.f19615re);
                tarotCardData.keywords = act.getString(R$string.f18850Sd);
                tarotCardData.meaning = act.getString(R$string.f19277gf);
                break;
            case 36:
                tarotCardData.reversed = true;
                tarotCardData.image = dbc0.f87542wc;
                tarotCardData.name = act.getString(R$string.f19615re);
                tarotCardData.keywords = act.getString(R$string.f18880Td);
                tarotCardData.meaning = act.getString(R$string.f19308hf);
                break;
            case 37:
                tarotCardData.reversed = false;
                tarotCardData.image = dbc0.f87412sc;
                tarotCardData.name = act.getString(R$string.f19646se);
                tarotCardData.keywords = act.getString(R$string.f18910Ud);
                tarotCardData.meaning = act.getString(R$string.f19368jf);
                break;
            case 38:
                tarotCardData.reversed = true;
                tarotCardData.image = dbc0.f87412sc;
                tarotCardData.name = act.getString(R$string.f19646se);
                tarotCardData.keywords = act.getString(R$string.f18940Vd);
                tarotCardData.meaning = act.getString(R$string.f19399kf);
                break;
            case 39:
                tarotCardData.reversed = false;
                tarotCardData.image = dbc0.f87606yc;
                tarotCardData.name = act.getString(R$string.f19708ue);
                tarotCardData.keywords = act.getString(R$string.f18970Wd);
                tarotCardData.meaning = act.getString(R$string.f19430lf);
                break;
            case 40:
                tarotCardData.reversed = true;
                tarotCardData.image = dbc0.f87606yc;
                tarotCardData.name = act.getString(R$string.f19708ue);
                tarotCardData.keywords = act.getString(R$string.f19030Yd);
                tarotCardData.meaning = act.getString(R$string.f19492nf);
                break;
            case 41:
                tarotCardData.reversed = false;
                tarotCardData.image = dbc0.f85989Ac;
                tarotCardData.name = act.getString(R$string.f19739ve);
                tarotCardData.keywords = act.getString(R$string.f19060Zd);
                tarotCardData.meaning = act.getString(R$string.f19523of);
                break;
            case 42:
                tarotCardData.reversed = true;
                tarotCardData.image = dbc0.f85989Ac;
                tarotCardData.name = act.getString(R$string.f19739ve);
                tarotCardData.keywords = act.getString(R$string.f19091ae);
                tarotCardData.meaning = act.getString(R$string.f19554pf);
                break;
            case 43:
                tarotCardData.reversed = false;
                tarotCardData.image = dbc0.f86053Cc;
                tarotCardData.name = act.getString(R$string.f19770we);
                tarotCardData.keywords = act.getString(R$string.f19122be);
                tarotCardData.meaning = act.getString(R$string.f19585qf);
                break;
            case 44:
                tarotCardData.reversed = true;
                tarotCardData.image = dbc0.f86053Cc;
                tarotCardData.name = act.getString(R$string.f19770we);
                tarotCardData.keywords = act.getString(R$string.f19153ce);
                tarotCardData.meaning = act.getString(R$string.f19616rf);
                break;
        }
        return tarotCardData;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final Typeface m98827i(@NotNull Context act) {
        act.getClass();
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(act.getResources().getAssets(), "Medium_SourceHanSerifTW.ttf");
        typefaceCreateFromAsset.getClass();
        return typefaceCreateFromAsset;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final C22421c<Boolean> m98828j(@NotNull final Bitmap bitmap) {
        bitmap.getClass();
        C22421c<Boolean> c22421cCreate = C22421c.create(new C22421c.a() { // from class: l.zli0
            @Override // p153l.y20
            public final void call(Object obj) {
                ami0.m98825c(bitmap, (gcg0) obj);
            }
        });
        c22421cCreate.getClass();
        return c22421cCreate;
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final boolean m98829k(Bitmap bitmap) throws Throwable {
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
                    App.f16088e.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://".concat(str4))));
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
    public final long m98830d() {
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
    public final int m98831e() {
        return ((Number) swipeCount.getValue()).intValue();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m98832f(long left) {
        long j = left / 3600000;
        TimeUnit timeUnit = TimeUnit.HOURS;
        long millis = (left - timeUnit.toMillis(j)) / Constants.ONE_MIN_IN_MILLIS;
        long millis2 = ((left - timeUnit.toMillis(j)) - TimeUnit.MINUTES.toMillis(millis)) / 1000;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(millis), Long.valueOf(millis2)}, 3));
    }

    /* JADX INFO: renamed from: h */
    public final int m98833h() {
        if (c6p.INSTANCE.m108174d()) {
            return -1;
        }
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("intl_tarot_card_config");
            strM80485F.getClass();
            JSONObject jSONObject = new JSONObject(strM80485F);
            if (jSONObject.getBoolean("enable")) {
                JSONArray jSONArray = jSONObject.getJSONArray("area");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    if ((obj instanceof JSONObject) && jyb.m147520m(JSON.parseArray(((JSONObject) obj).getString("mcc"), Integer.TYPE), new qcj() { // from class: l.yli0
                        @Override // p153l.qcj
                        public final Object call(Object obj2) {
                            return ami0.m98824b(((Integer) obj2).intValue());
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
