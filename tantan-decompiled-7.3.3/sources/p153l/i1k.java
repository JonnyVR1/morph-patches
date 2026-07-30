package p153l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Outline;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.GiftWallRankInfo;
import com.p051p1.mobile.putong.core.data.RankLevel;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.wxapi.WXEntryActivity;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p106mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p106mm.opensdk.modelmsg.WXImageObject;
import com.tencent.p106mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p106mm.opensdk.openapi.IWXAPI;
import com.tencent.p106mm.opensdk.openapi.WXAPIFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class i1k {

    /* JADX INFO: renamed from: l.i1k$a */
    public class C17618a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f112531a;

        public C17618a(int i) {
            this.f112531a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f112531a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m138104a(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m138105b(x20 x20Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m138106c(CoreGiftInfo coreGiftInfo) {
        if (!coreGiftInfo.dynamicGift || TextUtils.isEmpty(coreGiftInfo.dynamicURL)) {
            return true;
        }
        CoreGiftInfo coreGiftInfoM196155a = uie.m196154b().m196155a(coreGiftInfo.f56859id);
        if (coreGiftInfoM196155a != null) {
            return ahe.m97794b("video").mo115525c(coreGiftInfoM196155a.f56859id, true, new g4d0());
        }
        uie.m196154b().m196159f(coreGiftInfo);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static void m138107d(Act act, final x20 x20Var) {
        if (wzx.m208784k()) {
            x20Var.call();
        } else {
            PermissionHelper.m81065c().m81083r("android.permission.WRITE_EXTERNAL_STORAGE").m81088w(false).m81086u(true).m81078m(new x20() { // from class: l.g1k
                @Override // p153l.x20
                public final void call() {
                    i1k.m138105b(x20Var);
                }
            }, new y20() { // from class: l.h1k
                @Override // p153l.y20
                public final void call(Object obj) {
                    i1k.m138104a((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m81074i(act);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m138108e(View view, int i) {
        view.setOutlineProvider(new C17618a(i));
        view.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: f */
    public static Bitmap m138109f(View view) {
        view.setDrawingCacheEnabled(true);
        view.setDrawingCacheQuality(1048576);
        return view.getDrawingCache(true);
    }

    /* JADX INFO: renamed from: g */
    public static String m138110g(int i) {
        return String.valueOf(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: h */
    public static bkj0<String, String, String> m138111h(GiftWallRankInfo giftWallRankInfo) {
        String str;
        RankLevel rankLevel = giftWallRankInfo.rankLevel;
        String str2 = RankLevel.outOfRank;
        if (TEnum.equals(rankLevel, RankLevel.outOfRank)) {
            str = "排名100+";
        } else {
            try {
                int i = Integer.parseInt(giftWallRankInfo.rank);
                str = i > 20 ? "前100名" : String.format("第%s名", Integer.valueOf(i));
            } catch (NumberFormatException e) {
                CrashHelper.m82479c(e);
                str = "排名100+";
            }
        }
        String string = giftWallRankInfo.rankLevel.toString();
        switch (string.hashCode()) {
            case -987485392:
                if (string.equals(RankLevel.province)) {
                    return bkj0.m104818a(giftWallRankInfo.province, "", str);
                }
                return bkj0.m104818a(giftWallRankInfo.city, giftWallRankInfo.district, str);
            case -240132779:
                str2 = "unknown_";
                string.equals(str2);
                return bkj0.m104818a(giftWallRankInfo.city, giftWallRankInfo.district, str);
            case 3053931:
                if (string.equals(RankLevel.city)) {
                    return bkj0.m104818a(giftWallRankInfo.city, "", str);
                }
                return bkj0.m104818a(giftWallRankInfo.city, giftWallRankInfo.district, str);
            case 288961422:
                str2 = RankLevel.district;
                string.equals(str2);
                return bkj0.m104818a(giftWallRankInfo.city, giftWallRankInfo.district, str);
            case 957831062:
                if (string.equals("country")) {
                    return bkj0.m104818a(giftWallRankInfo.country, "", str);
                }
                return bkj0.m104818a(giftWallRankInfo.city, giftWallRankInfo.district, str);
            case 1216050065:
                string.equals(str2);
                return bkj0.m104818a(giftWallRankInfo.city, giftWallRankInfo.district, str);
            default:
                return bkj0.m104818a(giftWallRankInfo.city, giftWallRankInfo.district, str);
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m138112i(Act act, String str, Bitmap bitmap) {
        if (NullChecker.m82486a(act)) {
            return !TextUtils.isEmpty(MediaStore.Images.Media.insertImage(act.getContentResolver(), bitmap, str, ""));
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m138113j(Bitmap bitmap, boolean z) {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(CoreModule.f18263b, null);
        iwxapiCreateWXAPI.registerApp(WXEntryActivity.APPID);
        if (!iwxapiCreateWXAPI.isWXAppInstalled()) {
            o1j0.m165651y(CoreModule.f18263b.getString(R$string.f21481D6));
            return false;
        }
        WXImageObject wXImageObject = new WXImageObject(bitmap);
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXImageObject;
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.message = wXMediaMessage;
        if (z) {
            req.scene = 1;
        } else {
            req.scene = 0;
        }
        iwxapiCreateWXAPI.sendReq(req);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m138114k(Bitmap bitmap, boolean z) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Bitmap bitmap2;
        ByteArrayInputStream byteArrayInputStream = null;
        Bitmap bitmapDecodeStream = null;
        byteArrayInputStream = null;
        byteArrayInputStream = null;
        byteArrayInputStream = null;
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(CoreModule.f18263b, null);
        iwxapiCreateWXAPI.registerApp(WXEntryActivity.APPID);
        if (!iwxapiCreateWXAPI.isWXAppInstalled()) {
            o1j0.m165651y("未检测到可分享平台");
            return false;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
                    ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(byteArrayInputStream2, null, null);
                        byteArrayOutputStream.close();
                        byteArrayInputStream2.close();
                        ua5.m195158b(byteArrayInputStream2);
                        ua5.m195158b(byteArrayOutputStream);
                    } catch (Exception e) {
                        e = e;
                        Bitmap bitmap3 = bitmapDecodeStream;
                        byteArrayInputStream = byteArrayInputStream2;
                        bitmap2 = bitmap3;
                        CrashHelper.m82479c(e);
                        ua5.m195158b(byteArrayInputStream);
                        ua5.m195158b(byteArrayOutputStream);
                        bitmapDecodeStream = bitmap2;
                    } catch (Throwable th) {
                        th = th;
                        byteArrayInputStream = byteArrayInputStream2;
                        ua5.m195158b(byteArrayInputStream);
                        ua5.m195158b(byteArrayOutputStream);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    bitmap2 = null;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
            bitmap2 = null;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        if (!NullChecker.m82486a(bitmapDecodeStream) || bitmapDecodeStream.isRecycled()) {
            o1j0.m165651y("分享失败");
        } else {
            WXImageObject wXImageObject = new WXImageObject(bitmapDecodeStream);
            WXMediaMessage wXMediaMessage = new WXMediaMessage();
            wXMediaMessage.mediaObject = wXImageObject;
            SendMessageToWX.Req req = new SendMessageToWX.Req();
            req.message = wXMediaMessage;
            req.transaction = "ab_share_profile";
            if (z) {
                req.scene = 1;
            } else {
                req.scene = 0;
            }
            iwxapiCreateWXAPI.sendReq(req);
        }
        return true;
    }
}
