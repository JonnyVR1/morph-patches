package p153l;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Environment;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.ConstellationData;
import com.p051p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p051p1.mobile.putong.data.ProfileZodiac;
import com.tencent.open.SocialConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"Ll/vy5;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "Lrx/c;", "", "e", "(Landroid/graphics/Bitmap;)Lrx/c;", "f", "(Landroid/graphics/Bitmap;)Z", "Landroid/content/Context;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/data/ProfileZodiac;", ProfileLikeCategoryType.zodiac, "Lcom/p1/mobile/putong/core/data/ConstellationData;", "c", "(Landroid/content/Context;Lcom/p1/mobile/putong/data/ProfileZodiac;)Lcom/p1/mobile/putong/core/data/ConstellationData;", "", "a", "Lkotlin/Lazy;", Constants.INAPP_DATA_TAG, "()I", "swipeCount", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class vy5 {

    @NotNull
    public static final vy5 INSTANCE = new vy5();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy swipeCount = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.ty5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(vy5.m203950b());
        }
    });

    /* JADX INFO: renamed from: a */
    public static void m203949a(Bitmap bitmap, gcg0 gcg0Var) {
        if (oki.m168026n()) {
            gcg0Var.onNext(Boolean.valueOf(m203953f(bitmap)));
        } else {
            gcg0Var.onNext(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m203950b() {
        return d79.f85483p;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final ConstellationData m203951c(@NotNull Context act, @Nullable ProfileZodiac zodiac) {
        act.getClass();
        if (zodiac == null) {
            return null;
        }
        ConstellationData constellationData = new ConstellationData();
        String string = zodiac.toString();
        switch (string) {
            case "aquarius":
                constellationData.image = "https://auto.tancdn.com/v1/raw/1c4be06e-1bfc-445d-a93d-0950387b6c8813.webp";
                constellationData.cardBg = "https://auto.tancdn.com/v1/raw/db1e0bd7-294a-417d-9886-dd6e332bdad513.webp";
                constellationData.name = act.getString(R$string.f19026Y9);
                constellationData.nameColor = Color.parseColor("#FF6782");
                constellationData.keywords = act.getString(R$string.f19087aa);
                constellationData.meaning = act.getString(R$string.f19056Z9);
                return constellationData;
            case "capricorn":
                constellationData.image = "https://auto.tancdn.com/v1/raw/898c2f60-9906-409d-a6d6-d5db330de10f12.webp";
                constellationData.cardBg = "https://auto.tancdn.com/v1/raw/8901a14b-48da-480f-a551-f52b95e5461212.webp";
                constellationData.name = act.getString(R$string.f19303ha);
                constellationData.nameColor = Color.parseColor("#FF67E7");
                constellationData.keywords = act.getString(R$string.f19363ja);
                constellationData.meaning = act.getString(R$string.f19334ia);
                return constellationData;
            case "cancer":
                constellationData.image = "https://auto.tancdn.com/v1/raw/4321f18c-257f-43e9-91cb-4318f10aead812.webp";
                constellationData.cardBg = "https://auto.tancdn.com/v1/raw/db195102-45a9-4046-94f7-35bf3010c72b12.webp";
                constellationData.name = act.getString(R$string.f19210ea);
                constellationData.nameColor = Color.parseColor("#67FF9B");
                constellationData.keywords = act.getString(R$string.f19272ga);
                constellationData.meaning = act.getString(R$string.f19241fa);
                return constellationData;
            case "gemini":
                constellationData.image = "https://auto.tancdn.com/v1/raw/358f0bf7-5490-44ad-9560-ecc1cca94dfe13.webp";
                constellationData.cardBg = "https://auto.tancdn.com/v1/raw/f25de113-9d72-447b-a7b0-8664c93ca27513.webp";
                constellationData.name = act.getString(R$string.f19394ka);
                constellationData.nameColor = Color.parseColor("#AAFF67");
                constellationData.keywords = act.getString(R$string.f19456ma);
                constellationData.meaning = act.getString(R$string.f19425la);
                return constellationData;
            case "pisces":
                constellationData.image = "https://auto.tancdn.com/v1/raw/081b57a3-8df5-457b-86f1-72b576a3b3a613.webp";
                constellationData.cardBg = "https://auto.tancdn.com/v1/raw/1b45f909-dc4d-478a-8a02-1f9d1f29ef5e13.webp";
                constellationData.name = act.getString(R$string.f19673ta);
                constellationData.nameColor = Color.parseColor("#F64545");
                constellationData.keywords = act.getString(R$string.f19735va);
                constellationData.meaning = act.getString(R$string.f19704ua);
                return constellationData;
            case "taurus":
                constellationData.image = "https://auto.tancdn.com/v1/raw/2eec4eeb-dfde-489d-9c7a-0e042d9f425313.webp";
                constellationData.cardBg = "https://auto.tancdn.com/v1/raw/6c73f475-e88a-4121-a343-56d7aadc6eaf12.webp";
                constellationData.name = act.getString(R$string.f18389Da);
                constellationData.nameColor = Color.parseColor("#FFF067");
                constellationData.keywords = act.getString(R$string.f18451Fa);
                constellationData.meaning = act.getString(R$string.f18420Ea);
                return constellationData;
            case "leo":
                constellationData.image = "https://auto.tancdn.com/v1/raw/c6a93f5e-1985-4b4c-9b05-f59817c415e313.webp";
                constellationData.cardBg = "https://auto.tancdn.com/v1/raw/30a1e90e-9406-4518-8074-31d65ce2d20412.webp";
                constellationData.name = act.getString(R$string.f19487na);
                constellationData.nameColor = Color.parseColor("#52FFD5");
                constellationData.keywords = act.getString(R$string.f19549pa);
                constellationData.meaning = act.getString(R$string.f19518oa);
                return constellationData;
            case "aries":
                constellationData.image = "https://auto.tancdn.com/v1/raw/43d7e1ae-b4fc-4d67-9e75-43a9fe32cebe13.webp";
                constellationData.cardBg = "https://auto.tancdn.com/v1/raw/40208eee-e386-4006-a543-d2ea3be7b1e812.webp";
                constellationData.name = act.getString(R$string.f19118ba);
                constellationData.nameColor = Color.parseColor("#FF6868");
                constellationData.keywords = act.getString(R$string.f19180da);
                constellationData.meaning = act.getString(R$string.f19149ca);
                return constellationData;
            case "libra":
                constellationData.image = "https://auto.tancdn.com/v1/raw/7ebbb4f6-9427-439c-92c4-d303a5ee02d112.webp";
                constellationData.cardBg = "https://auto.tancdn.com/v1/raw/9cfb6e32-bb8f-4996-b45d-36972350ca4b12.webp";
                constellationData.name = act.getString(R$string.f19580qa);
                constellationData.nameColor = Color.parseColor("#5297FF");
                constellationData.keywords = act.getString(R$string.f19642sa);
                constellationData.meaning = act.getString(R$string.f19611ra);
                return constellationData;
            case "virgo":
                constellationData.image = "https://auto.tancdn.com/v1/raw/7b44b83a-6427-40d6-a8e2-9f72bbb6174612.webp";
                constellationData.cardBg = "https://auto.tancdn.com/v1/raw/3266a101-713e-4680-957d-85166d4dff3613.webp";
                constellationData.name = act.getString(R$string.f18482Ga);
                constellationData.nameColor = Color.parseColor("#52E0FF");
                constellationData.keywords = act.getString(R$string.f18544Ia);
                constellationData.meaning = act.getString(R$string.f18513Ha);
                return constellationData;
            case "scorpio":
                constellationData.image = "https://auto.tancdn.com/v1/raw/1e652821-d4ff-460d-95bd-478fe18d53c612.webp";
                constellationData.cardBg = "https://auto.tancdn.com/v1/raw/80b5f805-9877-4fec-b770-c3243d61cf6f13.webp";
                constellationData.name = act.getString(R$string.f18296Aa);
                constellationData.nameColor = Color.parseColor("#7552FF");
                constellationData.keywords = act.getString(R$string.f18358Ca);
                constellationData.meaning = act.getString(R$string.f18327Ba);
                return constellationData;
            case "sagittarius":
                constellationData.image = "https://auto.tancdn.com/v1/raw/5601024c-afee-4f42-92af-c2151a38bd6a12.webp";
                constellationData.cardBg = "https://auto.tancdn.com/v1/raw/da7b4006-725d-4112-b605-8d9c32b93a6412.webp";
                constellationData.name = act.getString(R$string.f19797xa);
                constellationData.nameColor = Color.parseColor("#CE67FF");
                constellationData.keywords = act.getString(R$string.f19859za);
                constellationData.meaning = act.getString(R$string.f19828ya);
                return constellationData;
            default:
                if (string.equals("aquarius")) {
                    constellationData.image = "https://auto.tancdn.com/v1/raw/1c4be06e-1bfc-445d-a93d-0950387b6c8813.webp";
                    constellationData.cardBg = "https://auto.tancdn.com/v1/raw/db1e0bd7-294a-417d-9886-dd6e332bdad513.webp";
                    constellationData.name = act.getString(R$string.f19026Y9);
                    constellationData.nameColor = Color.parseColor("#FF6782");
                    constellationData.keywords = act.getString(R$string.f19087aa);
                    constellationData.meaning = act.getString(R$string.f19056Z9);
                    return constellationData;
                }
                return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final C22421c<Boolean> m203952e(@NotNull final Bitmap bitmap) {
        bitmap.getClass();
        C22421c<Boolean> c22421cCreate = C22421c.create(new C22421c.a() { // from class: l.uy5
            @Override // p153l.y20
            public final void call(Object obj) {
                vy5.m203949a(bitmap, (gcg0) obj);
            }
        });
        c22421cCreate.getClass();
        return c22421cCreate;
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m203953f(Bitmap bitmap) throws Throwable {
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
    public final int m203954d() {
        return ((Number) swipeCount.getValue()).intValue();
    }
}
