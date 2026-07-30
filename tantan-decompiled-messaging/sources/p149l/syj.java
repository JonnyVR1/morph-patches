package p149l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Outline;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.GiftWallRankInfo;
import com.p046p1.mobile.putong.core.data.RankLevel;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.wxapi.WXEntryActivity;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p101mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p101mm.opensdk.modelmsg.WXImageObject;
import com.tencent.p101mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p101mm.opensdk.openapi.IWXAPI;
import com.tencent.p101mm.opensdk.openapi.WXAPIFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes10.dex */
public class syj {

    /* JADX INFO: renamed from: l.syj$a */
    public class C20082a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f166963a;

        public C20082a(int i) {
            this.f166963a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f166963a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m186672a(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m186673b(d30 d30Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m186674c(CoreGiftInfo coreGiftInfo) {
        if (!coreGiftInfo.dynamicGift || TextUtils.isEmpty(coreGiftInfo.dynamicURL)) {
            return true;
        }
        CoreGiftInfo coreGiftInfoM174530a = qhe.m174529b().m174530a(coreGiftInfo.f56011id);
        if (coreGiftInfoM174530a != null) {
            return wfe.m202983b("video").mo102510c(coreGiftInfoM174530a.f56011id, true, new dwc0());
        }
        qhe.m174529b().m174534f(coreGiftInfo);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static void m186675d(Act act, final d30 d30Var) {
        if (zqx.m219898k()) {
            d30Var.call();
        } else {
            PermissionHelper.m79882c().m79900r("android.permission.WRITE_EXTERNAL_STORAGE").m79905w(false).m79903u(true).m79895m(new d30() { // from class: l.qyj
                @Override // p149l.d30
                public final void call() {
                    syj.m186673b(d30Var);
                }
            }, new e30() { // from class: l.ryj
                @Override // p149l.e30
                public final void call(Object obj) {
                    syj.m186672a((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m79891i(act);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m186676e(View view, int i) {
        view.setOutlineProvider(new C20082a(i));
        view.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: f */
    public static Bitmap m186677f(View view) {
        view.setDrawingCacheEnabled(true);
        view.setDrawingCacheQuality(1048576);
        return view.getDrawingCache(true);
    }

    /* JADX INFO: renamed from: g */
    public static String m186678g(int i) {
        return String.valueOf(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: h */
    public static xaj0<String, String, String> m186679h(GiftWallRankInfo giftWallRankInfo) {
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
                CrashHelper.m81296c(e);
                str = "排名100+";
            }
        }
        String string = giftWallRankInfo.rankLevel.toString();
        switch (string.hashCode()) {
            case -987485392:
                if (string.equals(RankLevel.province)) {
                    return xaj0.m207578a(giftWallRankInfo.province, "", str);
                }
                return xaj0.m207578a(giftWallRankInfo.city, giftWallRankInfo.district, str);
            case -240132779:
                str2 = "unknown_";
                string.equals(str2);
                return xaj0.m207578a(giftWallRankInfo.city, giftWallRankInfo.district, str);
            case 3053931:
                if (string.equals(RankLevel.city)) {
                    return xaj0.m207578a(giftWallRankInfo.city, "", str);
                }
                return xaj0.m207578a(giftWallRankInfo.city, giftWallRankInfo.district, str);
            case 288961422:
                str2 = RankLevel.district;
                string.equals(str2);
                return xaj0.m207578a(giftWallRankInfo.city, giftWallRankInfo.district, str);
            case 957831062:
                if (string.equals("country")) {
                    return xaj0.m207578a(giftWallRankInfo.country, "", str);
                }
                return xaj0.m207578a(giftWallRankInfo.city, giftWallRankInfo.district, str);
            case 1216050065:
                string.equals(str2);
                return xaj0.m207578a(giftWallRankInfo.city, giftWallRankInfo.district, str);
            default:
                return xaj0.m207578a(giftWallRankInfo.city, giftWallRankInfo.district, str);
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m186680i(Act act, String str, Bitmap bitmap) {
        if (NullChecker.m81303a(act)) {
            return !TextUtils.isEmpty(MediaStore.Images.Media.insertImage(act.getContentResolver(), bitmap, str, ""));
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m186681j(Bitmap bitmap, boolean z) {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(CoreModule.f17544b, null);
        iwxapiCreateWXAPI.registerApp(WXEntryActivity.APPID);
        if (!iwxapiCreateWXAPI.isWXAppInstalled()) {
            lsi0.m151595y(CoreModule.f17544b.getString(R$string.f20739D6));
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
    public static boolean m186682k(Bitmap bitmap, boolean z) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Bitmap bitmap2;
        ByteArrayInputStream byteArrayInputStream = null;
        Bitmap bitmapDecodeStream = null;
        byteArrayInputStream = null;
        byteArrayInputStream = null;
        byteArrayInputStream = null;
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(CoreModule.f17544b, null);
        iwxapiCreateWXAPI.registerApp(WXEntryActivity.APPID);
        if (!iwxapiCreateWXAPI.isWXAppInstalled()) {
            lsi0.m151595y("未检测到可分享平台");
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
                        t95.m187604b(byteArrayInputStream2);
                        t95.m187604b(byteArrayOutputStream);
                    } catch (Exception e) {
                        e = e;
                        Bitmap bitmap3 = bitmapDecodeStream;
                        byteArrayInputStream = byteArrayInputStream2;
                        bitmap2 = bitmap3;
                        CrashHelper.m81296c(e);
                        t95.m187604b(byteArrayInputStream);
                        t95.m187604b(byteArrayOutputStream);
                        bitmapDecodeStream = bitmap2;
                    } catch (Throwable th) {
                        th = th;
                        byteArrayInputStream = byteArrayInputStream2;
                        t95.m187604b(byteArrayInputStream);
                        t95.m187604b(byteArrayOutputStream);
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
        if (!NullChecker.m81303a(bitmapDecodeStream) || bitmapDecodeStream.isRecycled()) {
            lsi0.m151595y("分享失败");
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
