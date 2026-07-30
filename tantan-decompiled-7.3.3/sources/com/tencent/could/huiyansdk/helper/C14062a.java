package com.tencent.could.huiyansdk.helper;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.common.C14050a;
import com.tencent.could.huiyansdk.manager.C14068e;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import com.tencent.youtu.sdkkitframework.liveness.FaceQualityState;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.helper.a */
/* JADX INFO: loaded from: classes12.dex */
public class C14062a implements YtSDKKitFramework.IYtSDKKitFrameworkEventListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C14063b f58249a;

    public C14062a(C14063b c14063b) {
        this.f58249a = c14063b;
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
        C14068e c14068e;
        String str3;
        String strEncodeToString;
        YtLogger.m85808d("YouTuSdkHelper", "hash map: " + map.toString());
        C14063b c14063b = this.f58249a;
        c14063b.getClass();
        if (map.containsKey(StateEvent.Name.OPERATE_CATCH_ERROR)) {
            String str4 = (String) map.get(StateEvent.Name.OPERATE_CATCH_ERROR);
            if (TextUtils.isEmpty(str4)) {
                C14068e.a.f58293a.m83520a(1, "YouTuSdkHelper", "result str is empty.");
            } else {
                c14063b.m83497a(str4);
                if (map.containsKey(StateEvent.Name.OPERATE_PACK_USE_TIME)) {
                    str2 = (String) map.get(StateEvent.Name.OPERATE_PACK_USE_TIME);
                    if (TextUtils.isEmpty(str2)) {
                        C14068e.a.f58293a.m83520a(1, "YouTuSdkHelper", "result str is empty.");
                    } else {
                        c14063b.m83497a(str2);
                        if (map.containsKey(StateEvent.Name.CONSERVATION_VIDEO_MESSAGE)) {
                            str = (String) map.get(StateEvent.Name.CONSERVATION_VIDEO_MESSAGE);
                            if (TextUtils.isEmpty(str)) {
                                C14068e.a.f58293a.m83520a(1, "YouTuSdkHelper", "result str is empty.");
                            } else {
                                c14063b.m83497a(str);
                            }
                        }
                    }
                } else if (map.containsKey(StateEvent.Name.CONSERVATION_VIDEO_MESSAGE)) {
                    str = (String) map.get(StateEvent.Name.CONSERVATION_VIDEO_MESSAGE);
                    if (TextUtils.isEmpty(str)) {
                        C14068e.a.f58293a.m83520a(1, "YouTuSdkHelper", "result str is empty.");
                    } else {
                        c14063b.m83497a(str);
                    }
                }
            }
        } else if (map.containsKey(StateEvent.Name.OPERATE_PACK_USE_TIME)) {
            str2 = (String) map.get(StateEvent.Name.OPERATE_PACK_USE_TIME);
            if (TextUtils.isEmpty(str2)) {
                C14068e.a.f58293a.m83520a(1, "YouTuSdkHelper", "result str is empty.");
            } else {
                c14063b.m83497a(str2);
                if (map.containsKey(StateEvent.Name.CONSERVATION_VIDEO_MESSAGE)) {
                    str = (String) map.get(StateEvent.Name.CONSERVATION_VIDEO_MESSAGE);
                    if (TextUtils.isEmpty(str)) {
                        C14068e.a.f58293a.m83520a(1, "YouTuSdkHelper", "result str is empty.");
                    } else {
                        c14063b.m83497a(str);
                    }
                }
            }
        } else if (map.containsKey(StateEvent.Name.CONSERVATION_VIDEO_MESSAGE)) {
            str = (String) map.get(StateEvent.Name.CONSERVATION_VIDEO_MESSAGE);
            if (TextUtils.isEmpty(str)) {
                C14068e.a.f58293a.m83520a(1, "YouTuSdkHelper", "result str is empty.");
            } else {
                c14063b.m83497a(str);
            }
        }
        if (map.containsKey(StateEvent.Name.PROCESS_RESULT)) {
            this.f58249a.getClass();
            if (!"failed".equals((String) map.get(StateEvent.Name.PROCESS_RESULT))) {
                C14068e.a.f58293a.m83520a(1, "YouTuSdkHelper", "youtu result is not fail!");
                return;
            }
            HuiYanBaseCallBack huiYanBaseCallBack = HuiYanBaseApi.C14044a.f58205a.f58202b;
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
            this.f58249a.getClass();
            HuiYanBaseCallBack huiYanBaseCallBack2 = HuiYanBaseApi.C14044a.f58205a.f58202b;
            if (huiYanBaseCallBack2 != null) {
                huiYanBaseCallBack2.mo83409a(map);
            }
        }
        if (map.containsKey(StateEvent.Name.ACTION_DETECT_TYPE)) {
            this.f58249a.getClass();
            Integer num2 = (Integer) map.get(StateEvent.Name.ACTION_DETECT_TYPE);
            Log.e("YouTuSdkHelper", "actionType: " + num2);
            HuiYanBaseCallBack huiYanBaseCallBack3 = HuiYanBaseApi.C14044a.f58205a.f58202b;
            if (huiYanBaseCallBack3 == null) {
                Log.e("YouTuSdkHelper", "deal with action detect callback is null!");
            } else {
                huiYanBaseCallBack3.mo83407a(num2.intValue(), false, true);
            }
        }
        if (map.containsKey(StateEvent.Name.BEST_FACE_IMAGE)) {
            this.f58249a.getClass();
            FaceQualityState.C14632b c14632b = (FaceQualityState.C14632b) map.get(StateEvent.Name.BEST_FACE_IMAGE);
            if (c14632b == null || (bArr = c14632b.f61505a) == null) {
                Log.e("YouTuSdkHelper", "deal with best face image bestFaceImage is null!");
            } else {
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                C14050a c14050a = C14050a.a.f58212a;
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
                                C14068e.a.f58293a.m83520a(2, "YouTuSdkHelper", "bitmap to base64 fail: " + e.getLocalizedMessage());
                                if (byteArrayOutputStream2 != null) {
                                    try {
                                        byteArrayOutputStream2.flush();
                                        byteArrayOutputStream2.close();
                                    } catch (IOException e2) {
                                        c14068e = C14068e.a.f58293a;
                                        str3 = "close IO stream fail: " + e2.getLocalizedMessage();
                                        c14068e.m83520a(2, "YouTuSdkHelper", str3);
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
                                    C14068e.a.f58293a.m83520a(2, "YouTuSdkHelper", "close IO stream fail: " + e4.getLocalizedMessage());
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
                            C14068e c14068e2 = C14068e.a.f58293a;
                            str6 = strEncodeToString;
                            str3 = "close IO stream fail: " + e5.getLocalizedMessage();
                            c14068e = c14068e2;
                            c14068e.m83520a(2, "YouTuSdkHelper", str3);
                        }
                    }
                    str6 = strEncodeToString;
                    if (str6 != null) {
                        C14068e.a.f58293a.m83520a(2, "YouTuSdkHelper", "best image size: " + str6.length());
                    }
                    c14050a.f58206a = str6;
                    HuiYanBaseCallBack huiYanBaseCallBack4 = HuiYanBaseApi.C14044a.f58205a.f58202b;
                    if (huiYanBaseCallBack4 == null) {
                        Log.e("YouTuSdkHelper", "deal with best face image callback is null!");
                    } else {
                        huiYanBaseCallBack4.mo83406a();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream3 = byteArrayOutputStream;
                }
            }
        }
        if (map.containsValue(StateEvent.ActionValue.RESET_CUSTOM_TIMEOUT)) {
            this.f58249a.getClass();
            C14068e.a.f58293a.m83520a(1, "YouTuSdkHelper", "deal with reset custom time out!");
            HuiYanBaseCallBack huiYanBaseCallBack5 = HuiYanBaseApi.C14044a.f58205a.f58202b;
            if (huiYanBaseCallBack5 == null) {
                Log.e("YouTuSdkHelper", "deal with best face reset callback is null!");
            } else {
                C14050a.a.f58212a.f58206a = "";
                huiYanBaseCallBack5.mo83412c();
            }
        }
        if (map.containsKey(StateEvent.Name.ACTION_DETECT_DONE_TYPE)) {
            this.f58249a.getClass();
            Integer num3 = (Integer) map.get(StateEvent.Name.ACTION_DETECT_DONE_TYPE);
            Integer num4 = (Integer) map.get(StateEvent.Name.ACTION_DETECT_DONE_LAST_COUNT);
            Log.e("YouTuSdkHelper", "remain actions num: " + num4);
            HuiYanBaseCallBack huiYanBaseCallBack6 = HuiYanBaseApi.C14044a.f58205a.f58202b;
            if (huiYanBaseCallBack6 == null) {
                Log.e("YouTuSdkHelper", "deal with action detect done callback is null!");
            } else {
                huiYanBaseCallBack6.mo83407a(num3.intValue(), true, num4.intValue() == 0);
            }
        }
        if (map.toString().contains("ActionLivenessState")) {
            this.f58249a.getClass();
            HashMap map2 = (HashMap) map.get(StateEvent.Name.STATE_STATS);
            if (map2 == null || !"exit".equals(map2.get("state_action"))) {
                return;
            }
            HuiYanBaseCallBack huiYanBaseCallBack7 = HuiYanBaseApi.C14044a.f58205a.f58202b;
            if (huiYanBaseCallBack7 == null) {
                Log.e("YouTuSdkHelper", "deal with all action done callback is null!");
            } else {
                huiYanBaseCallBack7.mo83407a(6, true, true);
            }
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitFrameworkEventListener
    public void onNetworkRequestEvent(String str, String str2, HashMap<String, String> map, YtSDKKitFramework.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        if (str.contains("getLiveType")) {
            HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.C14044a.f58205a;
            HuiYanBaseCallBack huiYanBaseCallBack = huiYanBaseApi.f58202b;
            if (huiYanBaseCallBack != null) {
                huiYanBaseCallBack.onOperateTimeEvent("GetConfigUseTime", 2, false, "");
            }
            this.f58249a.f58251b = iYtSDKKitNetResponseParser;
            C14068e c14068e = C14068e.a.f58293a;
            c14068e.m83520a(2, "YouTuSdkHelper", "send call back get live");
            HuiYanBaseCallBack huiYanBaseCallBack2 = huiYanBaseApi.f58202b;
            if (huiYanBaseCallBack2 == null) {
                c14068e.m83520a(2, "YouTuSdkHelper", "send get live error, base call back is null");
            } else {
                huiYanBaseCallBack2.mo83408a(str2);
            }
        }
        if (str.contains("compare")) {
            this.f58249a.getClass();
            C14068e c14068e2 = C14068e.a.f58293a;
            c14068e2.m83520a(2, "YouTuSdkHelper", "send live compare result.");
            HuiYanBaseCallBack huiYanBaseCallBack3 = HuiYanBaseApi.C14044a.f58205a.f58202b;
            if (huiYanBaseCallBack3 == null) {
                c14068e2.m83520a(2, "YouTuSdkHelper", "send get live error, base call back is null.");
            } else {
                huiYanBaseCallBack3.mo83411b(str2);
            }
        }
    }
}
