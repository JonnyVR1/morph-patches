package com.tencent.could.huiyansdk.helper;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.common.C13887a;
import com.tencent.could.huiyansdk.manager.C13905e;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import com.tencent.youtu.sdkkitframework.liveness.FaceQualityState;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.helper.a */
/* JADX INFO: loaded from: classes2.dex */
public class C13899a implements YtSDKKitFramework.IYtSDKKitFrameworkEventListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C13900b f57401a;

    public C13899a(C13900b c13900b) {
        this.f57401a = c13900b;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0046  */
    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:13:0x0058  */
    /* JADX WARN: Code duplicated, block: B:14:0x005b  */
    /* JADX WARN: Code duplicated, block: B:16:0x0063  */
    /* JADX WARN: Code duplicated, block: B:18:0x006f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0075  */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x018b: MOVE (r5 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:396), block:B:67:0x018b */
    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitFrameworkEventListener
    public void onFrameworkEvent(HashMap<String, Object> map) throws Throwable {
        String str;
        String str2;
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        C13905e c13905e;
        String str3;
        String strEncodeToString;
        YtLogger.m84637d("YouTuSdkHelper", "hash map: " + map.toString());
        C13900b c13900b = this.f57401a;
        c13900b.getClass();
        if (map.containsKey(StateEvent.Name.OPERATE_CATCH_ERROR)) {
            String str4 = (String) map.get(StateEvent.Name.OPERATE_CATCH_ERROR);
            if (TextUtils.isEmpty(str4)) {
                C13905e.a.f57445a.m82337a(1, "YouTuSdkHelper", "result str is empty.");
            } else {
                c13900b.m82314a(str4);
                if (map.containsKey(StateEvent.Name.OPERATE_PACK_USE_TIME)) {
                    str2 = (String) map.get(StateEvent.Name.OPERATE_PACK_USE_TIME);
                    if (TextUtils.isEmpty(str2)) {
                        C13905e.a.f57445a.m82337a(1, "YouTuSdkHelper", "result str is empty.");
                    } else {
                        c13900b.m82314a(str2);
                        if (map.containsKey(StateEvent.Name.CONSERVATION_VIDEO_MESSAGE)) {
                            str = (String) map.get(StateEvent.Name.CONSERVATION_VIDEO_MESSAGE);
                            if (TextUtils.isEmpty(str)) {
                                C13905e.a.f57445a.m82337a(1, "YouTuSdkHelper", "result str is empty.");
                            } else {
                                c13900b.m82314a(str);
                            }
                        }
                    }
                } else if (map.containsKey(StateEvent.Name.CONSERVATION_VIDEO_MESSAGE)) {
                    str = (String) map.get(StateEvent.Name.CONSERVATION_VIDEO_MESSAGE);
                    if (TextUtils.isEmpty(str)) {
                        C13905e.a.f57445a.m82337a(1, "YouTuSdkHelper", "result str is empty.");
                    } else {
                        c13900b.m82314a(str);
                    }
                }
            }
        } else if (map.containsKey(StateEvent.Name.OPERATE_PACK_USE_TIME)) {
            str2 = (String) map.get(StateEvent.Name.OPERATE_PACK_USE_TIME);
            if (TextUtils.isEmpty(str2)) {
                C13905e.a.f57445a.m82337a(1, "YouTuSdkHelper", "result str is empty.");
            } else {
                c13900b.m82314a(str2);
                if (map.containsKey(StateEvent.Name.CONSERVATION_VIDEO_MESSAGE)) {
                    str = (String) map.get(StateEvent.Name.CONSERVATION_VIDEO_MESSAGE);
                    if (TextUtils.isEmpty(str)) {
                        C13905e.a.f57445a.m82337a(1, "YouTuSdkHelper", "result str is empty.");
                    } else {
                        c13900b.m82314a(str);
                    }
                }
            }
        } else if (map.containsKey(StateEvent.Name.CONSERVATION_VIDEO_MESSAGE)) {
            str = (String) map.get(StateEvent.Name.CONSERVATION_VIDEO_MESSAGE);
            if (TextUtils.isEmpty(str)) {
                C13905e.a.f57445a.m82337a(1, "YouTuSdkHelper", "result str is empty.");
            } else {
                c13900b.m82314a(str);
            }
        }
        if (map.containsKey(StateEvent.Name.PROCESS_RESULT)) {
            this.f57401a.getClass();
            if (!"failed".equals((String) map.get(StateEvent.Name.PROCESS_RESULT))) {
                C13905e.a.f57445a.m82337a(1, "YouTuSdkHelper", "youtu result is not fail!");
                return;
            }
            HuiYanBaseCallBack huiYanBaseCallBack = HuiYanBaseApi.C13881a.f57357a.f57354b;
            if (huiYanBaseCallBack == null) {
                Log.e("YouTuSdkHelper", "deal with action callback is null!");
                return;
            }
            String str5 = (String) map.get("message");
            Integer num = (Integer) map.get(StateEvent.Name.ERROR_CODE);
            if (num != null && num.intValue() == 5242881) {
                huiYanBaseCallBack.onFail(285, str5);
                return;
            }
            if (!TextUtils.isEmpty(str5)) {
                huiYanBaseCallBack.onFail(228, str5);
                return;
            }
            huiYanBaseCallBack.onFail(228, "{\"errorcode\":" + ((Integer) map.get(StateEvent.Name.ERROR_CODE)) + "}");
            return;
        }
        if (map.containsKey(StateEvent.Name.UI_TIPS) || map.containsKey(StateEvent.Name.UI_EXTRA_TIPS)) {
            this.f57401a.getClass();
            HuiYanBaseCallBack huiYanBaseCallBack2 = HuiYanBaseApi.C13881a.f57357a.f57354b;
            if (huiYanBaseCallBack2 != null) {
                huiYanBaseCallBack2.mo82226a(map);
            }
        }
        if (map.containsKey(StateEvent.Name.ACTION_DETECT_TYPE)) {
            this.f57401a.getClass();
            Integer num2 = (Integer) map.get(StateEvent.Name.ACTION_DETECT_TYPE);
            Log.e("YouTuSdkHelper", "actionType: " + num2);
            HuiYanBaseCallBack huiYanBaseCallBack3 = HuiYanBaseApi.C13881a.f57357a.f57354b;
            if (huiYanBaseCallBack3 == null) {
                Log.e("YouTuSdkHelper", "deal with action detect callback is null!");
            } else {
                huiYanBaseCallBack3.mo82224a(num2.intValue(), false, true);
            }
        }
        if (map.containsKey(StateEvent.Name.BEST_FACE_IMAGE)) {
            this.f57401a.getClass();
            FaceQualityState.C14484b c14484b = (FaceQualityState.C14484b) map.get(StateEvent.Name.BEST_FACE_IMAGE);
            if (c14484b == null || (bArr = c14484b.f60658a) == null) {
                Log.e("YouTuSdkHelper", "deal with best face image bestFaceImage is null!");
            } else {
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                C13887a c13887a = C13887a.a.f57364a;
                ByteArrayOutputStream byteArrayOutputStream3 = null;
                str = null;
                str = null;
                String str6 = null;
                ByteArrayOutputStream byteArrayOutputStream4 = null;
                try {
                    if (bitmapDecodeByteArray != null) {
                        try {
                            byteArrayOutputStream2 = new ByteArrayOutputStream();
                            try {
                                bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream2);
                                byteArrayOutputStream2.flush();
                                byteArrayOutputStream2.close();
                                strEncodeToString = Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 2);
                                byteArrayOutputStream4 = byteArrayOutputStream2;
                            } catch (IOException e) {
                                e = e;
                                C13905e.a.f57445a.m82337a(2, "YouTuSdkHelper", "bitmap to base64 fail: " + e.getLocalizedMessage());
                                if (byteArrayOutputStream2 != null) {
                                    try {
                                        byteArrayOutputStream2.flush();
                                        byteArrayOutputStream2.close();
                                    } catch (IOException e2) {
                                        c13905e = C13905e.a.f57445a;
                                        str3 = "close IO stream fail: " + e2.getLocalizedMessage();
                                        c13905e.m82337a(2, "YouTuSdkHelper", str3);
                                    }
                                }
                            }
                        } catch (IOException e3) {
                            e = e3;
                            byteArrayOutputStream2 = null;
                        } catch (Throwable th) {
                            th = th;
                            if (byteArrayOutputStream3 != null) {
                                try {
                                    byteArrayOutputStream3.flush();
                                    byteArrayOutputStream3.close();
                                } catch (IOException e4) {
                                    C13905e.a.f57445a.m82337a(2, "YouTuSdkHelper", "close IO stream fail: " + e4.getLocalizedMessage());
                                }
                            }
                            throw th;
                        }
                    } else {
                        strEncodeToString = null;
                    }
                    if (byteArrayOutputStream4 != null) {
                        try {
                            byteArrayOutputStream4.flush();
                            byteArrayOutputStream4.close();
                        } catch (IOException e5) {
                            C13905e c13905e2 = C13905e.a.f57445a;
                            str6 = strEncodeToString;
                            str3 = "close IO stream fail: " + e5.getLocalizedMessage();
                            c13905e = c13905e2;
                            c13905e.m82337a(2, "YouTuSdkHelper", str3);
                        }
                    }
                    str6 = strEncodeToString;
                    if (str6 != null) {
                        C13905e.a.f57445a.m82337a(2, "YouTuSdkHelper", "best image size: " + str6.length());
                    }
                    c13887a.f57358a = str6;
                    HuiYanBaseCallBack huiYanBaseCallBack4 = HuiYanBaseApi.C13881a.f57357a.f57354b;
                    if (huiYanBaseCallBack4 == null) {
                        Log.e("YouTuSdkHelper", "deal with best face image callback is null!");
                    } else {
                        huiYanBaseCallBack4.mo82223a();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream3 = byteArrayOutputStream;
                }
            }
        }
        if (map.containsValue(StateEvent.ActionValue.RESET_CUSTOM_TIMEOUT)) {
            this.f57401a.getClass();
            C13905e.a.f57445a.m82337a(1, "YouTuSdkHelper", "deal with reset custom time out!");
            HuiYanBaseCallBack huiYanBaseCallBack5 = HuiYanBaseApi.C13881a.f57357a.f57354b;
            if (huiYanBaseCallBack5 == null) {
                Log.e("YouTuSdkHelper", "deal with best face reset callback is null!");
            } else {
                C13887a.a.f57364a.f57358a = "";
                huiYanBaseCallBack5.mo82229c();
            }
        }
        if (map.containsKey(StateEvent.Name.ACTION_DETECT_DONE_TYPE)) {
            this.f57401a.getClass();
            Integer num3 = (Integer) map.get(StateEvent.Name.ACTION_DETECT_DONE_TYPE);
            Integer num4 = (Integer) map.get(StateEvent.Name.ACTION_DETECT_DONE_LAST_COUNT);
            Log.e("YouTuSdkHelper", "remain actions num: " + num4);
            HuiYanBaseCallBack huiYanBaseCallBack6 = HuiYanBaseApi.C13881a.f57357a.f57354b;
            if (huiYanBaseCallBack6 == null) {
                Log.e("YouTuSdkHelper", "deal with action detect done callback is null!");
            } else {
                huiYanBaseCallBack6.mo82224a(num3.intValue(), true, num4.intValue() == 0);
            }
        }
        if (map.toString().contains("ActionLivenessState")) {
            this.f57401a.getClass();
            HashMap map2 = (HashMap) map.get(StateEvent.Name.STATE_STATS);
            if (map2 == null || !"exit".equals(map2.get("state_action"))) {
                return;
            }
            HuiYanBaseCallBack huiYanBaseCallBack7 = HuiYanBaseApi.C13881a.f57357a.f57354b;
            if (huiYanBaseCallBack7 == null) {
                Log.e("YouTuSdkHelper", "deal with all action done callback is null!");
            } else {
                huiYanBaseCallBack7.mo82224a(6, true, true);
            }
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitFrameworkEventListener
    public void onNetworkRequestEvent(String str, String str2, HashMap<String, String> map, YtSDKKitFramework.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        if (str.contains("getLiveType")) {
            HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.C13881a.f57357a;
            HuiYanBaseCallBack huiYanBaseCallBack = huiYanBaseApi.f57354b;
            if (huiYanBaseCallBack != null) {
                huiYanBaseCallBack.onOperateTimeEvent("GetConfigUseTime", 2, false, "");
            }
            this.f57401a.f57403b = iYtSDKKitNetResponseParser;
            C13905e c13905e = C13905e.a.f57445a;
            c13905e.m82337a(2, "YouTuSdkHelper", "send call back get live");
            HuiYanBaseCallBack huiYanBaseCallBack2 = huiYanBaseApi.f57354b;
            if (huiYanBaseCallBack2 == null) {
                c13905e.m82337a(2, "YouTuSdkHelper", "send get live error, base call back is null");
            } else {
                huiYanBaseCallBack2.mo82225a(str2);
            }
        }
        if (str.contains("compare")) {
            this.f57401a.getClass();
            C13905e c13905e2 = C13905e.a.f57445a;
            c13905e2.m82337a(2, "YouTuSdkHelper", "send live compare result.");
            HuiYanBaseCallBack huiYanBaseCallBack3 = HuiYanBaseApi.C13881a.f57357a.f57354b;
            if (huiYanBaseCallBack3 == null) {
                c13905e2.m82337a(2, "YouTuSdkHelper", "send get live error, base call back is null.");
            } else {
                huiYanBaseCallBack3.mo82228b(str2);
            }
        }
    }
}
