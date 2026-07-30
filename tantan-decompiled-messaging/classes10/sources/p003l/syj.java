package p003l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Outline;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.p000p1.mobile.putong.core.data.CoreGiftInfo;
import com.p000p1.mobile.putong.core.data.GiftWallRankInfo;
import com.p000p1.mobile.putong.core.data.RankLevel;
import com.p000p1.mobile.putong.core.message.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import l.d30;
import l.e30;
import l.lsi0;
import l.t95;
import l.xaj0;
import l.zqx;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class syj {

    /* JADX INFO: renamed from: l.syj$a */
    public class C3430a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f7489a;

        public C3430a(int i) {
            this.f7489a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f7489a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9505a(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m9506b(d30 d30Var) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m9507c(CoreGiftInfo coreGiftInfo) {
        if (!coreGiftInfo.dynamicGift || TextUtils.isEmpty(coreGiftInfo.dynamicURL)) {
            return true;
        }
        CoreGiftInfo coreGiftInfoM8997a = qhe.m8996b().m8997a(((DbObject) coreGiftInfo).id);
        if (coreGiftInfoM8997a != null) {
            return wfe.m10496b("video").mo5737c(((DbObject) coreGiftInfoM8997a).id, true, new dwc0());
        }
        qhe.m8996b().m9001f(coreGiftInfo);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static void m9508d(Act act, final d30 d30Var) {
        if (zqx.k()) {
            d30Var.call();
        } else {
            PermissionHelper.c().r(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).w(false).u(true).m(new d30() { // from class: l.qyj
                public final void call() {
                    syj.m9506b(d30Var);
                }
            }, new e30() { // from class: l.ryj
                public final void call(Object obj) {
                    syj.m9505a((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).i(act);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m9509e(View view, int i) {
        view.setOutlineProvider(new C3430a(i));
        view.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: f */
    public static Bitmap m9510f(View view) {
        view.setDrawingCacheEnabled(true);
        view.setDrawingCacheQuality(1048576);
        return view.getDrawingCache(true);
    }

    /* JADX INFO: renamed from: g */
    public static String m9511g(int i) {
        return String.valueOf(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: h */
    public static xaj0<String, String, String> m9512h(GiftWallRankInfo giftWallRankInfo) {
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
                CrashHelper.c(e);
                str = "排名100+";
            }
        }
        String string = giftWallRankInfo.rankLevel.toString();
        switch (string.hashCode()) {
            case -987485392:
                if (string.equals(RankLevel.province)) {
                    return xaj0.a(giftWallRankInfo.province, "", str);
                }
                return xaj0.a(giftWallRankInfo.city, giftWallRankInfo.district, str);
            case -240132779:
                str2 = "unknown_";
                string.equals(str2);
                return xaj0.a(giftWallRankInfo.city, giftWallRankInfo.district, str);
            case 3053931:
                if (string.equals(RankLevel.city)) {
                    return xaj0.a(giftWallRankInfo.city, "", str);
                }
                return xaj0.a(giftWallRankInfo.city, giftWallRankInfo.district, str);
            case 288961422:
                str2 = RankLevel.district;
                string.equals(str2);
                return xaj0.a(giftWallRankInfo.city, giftWallRankInfo.district, str);
            case 957831062:
                if (string.equals(RankLevel.country)) {
                    return xaj0.a(giftWallRankInfo.country, "", str);
                }
                return xaj0.a(giftWallRankInfo.city, giftWallRankInfo.district, str);
            case 1216050065:
                string.equals(str2);
                return xaj0.a(giftWallRankInfo.city, giftWallRankInfo.district, str);
            default:
                return xaj0.a(giftWallRankInfo.city, giftWallRankInfo.district, str);
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m9513i(Act act, String str, Bitmap bitmap) {
        if (NullChecker.a(act)) {
            return !TextUtils.isEmpty(MediaStore.Images.Media.insertImage(act.getContentResolver(), bitmap, str, ""));
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m9514j(Bitmap bitmap, boolean z) {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(CoreModule.b, (String) null);
        iwxapiCreateWXAPI.registerApp("wx67f59443a9c801bb");
        if (!iwxapiCreateWXAPI.isWXAppInstalled()) {
            lsi0.y(CoreModule.b.getString(R$string.f401D6));
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
    public static boolean m9515k(Bitmap bitmap, boolean z) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Bitmap bitmap2;
        ByteArrayInputStream byteArrayInputStream = null;
        Bitmap bitmapDecodeStream = null;
        byteArrayInputStream = null;
        byteArrayInputStream = null;
        byteArrayInputStream = null;
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(CoreModule.b, (String) null);
        iwxapiCreateWXAPI.registerApp("wx67f59443a9c801bb");
        if (!iwxapiCreateWXAPI.isWXAppInstalled()) {
            lsi0.y("未检测到可分享平台");
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
                        t95.b(byteArrayInputStream2);
                        t95.b(byteArrayOutputStream);
                    } catch (Exception e) {
                        e = e;
                        Bitmap bitmap3 = bitmapDecodeStream;
                        byteArrayInputStream = byteArrayInputStream2;
                        bitmap2 = bitmap3;
                        CrashHelper.c(e);
                        t95.b(byteArrayInputStream);
                        t95.b(byteArrayOutputStream);
                        bitmapDecodeStream = bitmap2;
                    } catch (Throwable th) {
                        th = th;
                        byteArrayInputStream = byteArrayInputStream2;
                        t95.b(byteArrayInputStream);
                        t95.b(byteArrayOutputStream);
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
        if (!NullChecker.a(bitmapDecodeStream) || bitmapDecodeStream.isRecycled()) {
            lsi0.y("分享失败");
        } else {
            WXImageObject wXImageObject = new WXImageObject(bitmapDecodeStream);
            WXMediaMessage wXMediaMessage = new WXMediaMessage();
            wXMediaMessage.mediaObject = wXImageObject;
            SendMessageToWX.Req req = new SendMessageToWX.Req();
            req.message = wXMediaMessage;
            ((BaseReq) req).transaction = "ab_share_profile";
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
