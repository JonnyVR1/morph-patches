package com.tencent.youtu.sdkkitframework.liveness;

import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.immomo.momomediaext.sei.BaseSei;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.youtu.liveness.YTFaceTracker;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ColorImgData;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectColorData;
import com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class YtLivenessNetProtoHelper {
    public static final String TAG = "YtLivenessNetProtoHelper";
    public static String sBuild_brand = Build.BRAND;
    public static String sBuild_model = Build.MODEL;
    public static String sBuild_hardware = Build.HARDWARE;
    public static String sBuild_display = Build.DISPLAY;
    public static String sBuild_product = Build.PRODUCT;
    public static String sBuild_device = Build.DEVICE;
    public static String sAndroid_apilevel = "" + Build.VERSION.SDK_INT;
    public static String sAndroid_version = Build.VERSION.RELEASE;

    public static class ActionLiveReq {
        public String action_str;
        public String action_video;
        public String app_id;
        public String best_image;
        public String business_id;
        public String compare_image;
        public int compare_image_type;
        public String config;
        public boolean do_eye_detect;
        public boolean do_live;
        public boolean do_mouth_detect;
        public boolean get_more_image;
        public String reservedfield;
        public LiveStyleRequester.SeleceData select_data;
        public String session_id;
    }

    public static class ActionLiveReqData {
        public String actionStr;
        public String actionVideo;
        public NetBaseInfoData baseInfo;
        public String bestImage;
        public int colorNum;
        public String config;
        public String controlConfig;
        public boolean needEyeDetect;
        public boolean needMoreImage;
        public boolean needMouthDetect;
        public String reflectConfig;
        public String reservedfield;
        public ArrayList<SensorData> sensorData;
    }

    public static class ActionReflectLiveReq {
        public String action_str;
        public String action_video;
        public String app_id;
        public String business_id;
        public String color_data;
        public ImageInfo compare_image;
        public int compare_image_type;
        public String config;
        public ImageInfo eye_image;
        public ImageInfo live_image;
        public int mode;
        public ImageInfo mouth_image;
        public int platform;
        public JSONObject reflect_data;
        public LiveStyleRequester.SeleceData select_data;
        public String session_id;
    }

    public static class ActionReflectLiveReqData {
        public String actionStr;
        public String actionVideo;
        public NetBaseInfoData baseInfo;
        public String colorData;
        public int colorNum;
        public String config;
        public String controlConfig;
        public ImageInfo eyeImage;
        public ImageInfo liveImage;
        public int mode;
        public ImageInfo mouthImage;
        public String reflectConfig;
        public ReflectColorData reflectData;
        public ArrayList<SensorData> sensorData;
    }

    public static class FaceFrame {
        public String image;
        public ArrayList<Float> x_coordinates;
        public ArrayList<Float> y_coordinates;
    }

    public static class FourLiveReq {
        public String app_id;
        public String compare_image;
        public String validate_data;
        public String video;
    }

    public static class FourLiveReqData {
        public NetBaseInfoData baseInfoData;
        public String validateData;
        public String video;
    }

    public static class GetFourLiveTypeReq {
        public String app_id;
        public String seq;
    }

    public static class GetFourLiveTypeReqData {
        public NetBaseInfoData baseInfo;
    }

    public static class GetLiveTypeReq {
        public String app_id;
        public String business_name;
        public String person_id;
        public int platform;
        public LiveStyleRequester.SeleceData select_data;
        public String session_id;
    }

    public static class GetLiveTypeReqData {
        public NetBaseInfoData baseInfo;
        public int colorNum;
        public String controlConfig;
        public String reflectConfig;
    }

    public static class LipReadReqData {
        public NetBaseInfoData baseInfo;
        public ImageInfo bestImage;
        public String faceExtraInfo;
        public float[] liveFivePoint;
        public String liveImage;
        public String mouth_lip_reading;
        public String mouth_move;
        public String validate_data;
        public String voice;
    }

    public static class LiveStyleRequester {

        public static class LiveStyleAndroidData {
            public float lux = 0.0f;
            public String build_brand = YtLivenessNetProtoHelper.sBuild_brand;
            public String build_model = YtLivenessNetProtoHelper.sBuild_model;
            public String build_hardware = YtLivenessNetProtoHelper.sBuild_hardware;
            public String build_display = YtLivenessNetProtoHelper.sBuild_display;
            public String build_product = YtLivenessNetProtoHelper.sBuild_product;
            public String build_device = YtLivenessNetProtoHelper.sBuild_device;
            public String android_apilevel = YtLivenessNetProtoHelper.sAndroid_apilevel;
            public String android_version = YtLivenessNetProtoHelper.sAndroid_version;

            public String toString() {
                return "".concat(this.build_brand).concat(this.build_model).concat(this.build_hardware).concat(this.build_display).concat(this.build_product).concat(this.build_device);
            }
        }

        public static class SeleceData {
            public LiveStyleAndroidData android_data;
            public int change_point_num;
            public String client_version;
            public String config;
            public String reflect_param;
            public ArrayList<SensorData> sensor_data;
            public int platform = 2;
            public int protocal = 1;
            public String version = YTAGReflectLiveCheckInterface.VERSION;

            public SeleceData(float f, int i, String str, String str2, String str3) {
                this.change_point_num = 2;
                LiveStyleAndroidData liveStyleAndroidData = new LiveStyleAndroidData();
                this.android_data = liveStyleAndroidData;
                liveStyleAndroidData.lux = f;
                this.change_point_num = i;
                if (str != null && str.length() > 0) {
                    this.reflect_param = str;
                }
                if (str3 != null && str3.length() > 0) {
                    this.config = str3;
                }
                this.client_version = str2;
            }

            public String getConfig() {
                return this.config;
            }

            public void setConfig(String str) {
                this.config = str;
            }

            public String toString() {
                String strConcat = "".concat(Integer.toString(this.platform)).concat(Integer.toString(this.protocal)).concat(this.client_version).concat(this.android_data.toString());
                YtLogger.m84637d(YtLivenessNetProtoHelper.TAG, "select_data_str: ".concat(strConcat));
                return strConcat;
            }
        }

        public static class YTLiveStyleReq {
            public String app_id;
            public SeleceData select_data;
        }
    }

    public static class NetBaseInfoData {
        public String appId;
        public String businessId;
        public int liveType;
        public float lux;
        public String personId;
        public String personType;
        public String reqType;
        public String sessionId;
    }

    public static class PersonLive {
        public String color_data;
        public ArrayList<FaceFrame> frames;
        public String mouth_lip_reading;
        public String mouth_move;
        public int platform;
        public ReflectColorData reflect_data;
        public LiveStyleRequester.SeleceData select_data;
        public ArrayList<SensorData> sensor_data;
        public String validate_data;
        public String voice;
    }

    public static class PersonLiveReq {
        public String app_id;
        public ImageInfo best_image;
        public String business_name;
        public int live_type;
        public PersonLive livedata;
        public String mp_business_buffer;
        public String person_id;
        public String person_type;
        public String req_type;
        public String request_id;
        public int scene;
    }

    public static class PictureLiveDetectReq {
        public String app_id;
        public ArrayList<Float> five_point;
        public String image;
        public LiveStyleRequester.SeleceData select_data;
        public String session_id;
    }

    public static class PictureLiveReqData {
        public NetBaseInfoData baseInfo;
        public ImageInfo imageInfo;
        public ArrayList<SensorData> sensorData;
    }

    public static class ReflectLiveReq {
        public String app_id;
        public String business_id;
        public String color_data;
        public String compare_image;
        public int compare_image_type;
        public String live_image;
        public int platform;
        public ReflectColorData reflect_data;
        public LiveStyleRequester.SeleceData select_data;
        public String session_id;
    }

    public static class ReflectLiveReqData {
        public NetBaseInfoData baseInfo;
        public ImageInfo bestImage;
        public ImageInfo closeEyeImage;
        public String colorData;
        public int colorNum;
        public String config;
        public String liveImage;
        public ImageInfo openMouthImage;
        public ReflectColorData reflectData;
        public ArrayList<SensorData> sensorData;
    }

    public static class SensorData {
        public long capture_time;
        public ArrayList<Float> sensor_data;
        public int type;
    }

    public static class Version {
        public String sdk_version = "";
        public String ftrack_sdk_version = "";
        public String freflect_sdk_version = "";
        public String faction_sdk_version = "";

        public String makeVersion() {
            StringBuffer stringBuffer = new StringBuffer("sdk_version:");
            stringBuffer.append(this.sdk_version);
            stringBuffer.append(";ftrack_sdk_version:");
            stringBuffer.append(this.ftrack_sdk_version);
            if (this.freflect_sdk_version != "") {
                stringBuffer.append(";freflect_sdk_version:");
                stringBuffer.append(this.freflect_sdk_version);
            }
            if (this.faction_sdk_version != "") {
                stringBuffer.append(";faction_sdk_version:");
                stringBuffer.append(this.faction_sdk_version);
            }
            return stringBuffer.toString();
        }
    }

    public static String makeActionLiveReq(ActionLiveReqData actionLiveReqData) {
        ActionLiveReq actionLiveReq = new ActionLiveReq();
        NetBaseInfoData netBaseInfoData = actionLiveReqData.baseInfo;
        actionLiveReq.app_id = netBaseInfoData.appId;
        actionLiveReq.session_id = netBaseInfoData.sessionId;
        actionLiveReq.business_id = netBaseInfoData.businessId;
        Version version = new Version();
        version.sdk_version = YtSDKKitFramework.getInstance().version();
        version.ftrack_sdk_version = YTFaceTracker.getVersion();
        version.faction_sdk_version = YTPoseDetectJNIInterface.getVersion();
        actionLiveReq.select_data = new LiveStyleRequester.SeleceData(actionLiveReqData.baseInfo.lux, actionLiveReqData.colorNum, actionLiveReqData.reflectConfig, version.makeVersion(), actionLiveReqData.controlConfig);
        actionLiveReq.action_str = actionLiveReqData.actionStr;
        actionLiveReq.action_video = actionLiveReqData.actionVideo;
        actionLiveReq.best_image = actionLiveReqData.bestImage;
        actionLiveReq.do_eye_detect = actionLiveReqData.needEyeDetect;
        actionLiveReq.do_mouth_detect = actionLiveReqData.needMouthDetect;
        actionLiveReq.do_live = true;
        actionLiveReq.config = actionLiveReqData.config;
        actionLiveReq.reservedfield = actionLiveReqData.reservedfield;
        Bitmap bitmap = YtFSM.getInstance().getContext().imageToCompare;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream);
            actionLiveReq.compare_image = new String(Base64.encode(byteArrayOutputStream.toByteArray(), 2));
            actionLiveReq.compare_image_type = YtFSM.getInstance().getContext().imageToComapreType;
        }
        return new WeJson().toJson(actionLiveReq);
    }

    public static String makeActionReflectLiveReq(ActionReflectLiveReqData actionReflectLiveReqData, String str, String str2) {
        YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
        String json = "";
        ActionReflectLiveReq actionReflectLiveReq = new ActionReflectLiveReq();
        NetBaseInfoData netBaseInfoData = actionReflectLiveReqData.baseInfo;
        actionReflectLiveReq.app_id = netBaseInfoData.appId;
        actionReflectLiveReq.session_id = netBaseInfoData.sessionId;
        actionReflectLiveReq.business_id = netBaseInfoData.businessId;
        actionReflectLiveReq.platform = 2;
        Version version = new Version();
        version.sdk_version = YtSDKKitFramework.getInstance().version();
        version.ftrack_sdk_version = YTFaceTracker.getVersion();
        version.faction_sdk_version = YTPoseDetectJNIInterface.getVersion();
        version.freflect_sdk_version = YTAGReflectLiveCheckInterface.VERSION;
        actionReflectLiveReq.select_data = new LiveStyleRequester.SeleceData(actionReflectLiveReqData.baseInfo.lux, actionReflectLiveReqData.colorNum, actionReflectLiveReqData.reflectConfig, version.makeVersion(), actionReflectLiveReqData.controlConfig);
        actionReflectLiveReq.action_video = actionReflectLiveReqData.actionVideo;
        String str3 = actionReflectLiveReqData.controlConfig;
        actionReflectLiveReq.select_data.setConfig(TextUtils.isEmpty(str) ? removeKey(str3, "sdcs") : removeKey(str3, "sdcs").concat("&sdcs=" + str2).concat("&avcs=" + str));
        actionReflectLiveReq.color_data = actionReflectLiveReqData.colorData;
        actionReflectLiveReq.action_str = actionReflectLiveReqData.actionStr;
        Bitmap bitmap = YtFSM.getInstance().getContext().imageToCompare;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream);
            actionReflectLiveReq.compare_image = new ImageInfo(byteArrayOutputStream.toByteArray(), (float[]) null, (String) null);
            actionReflectLiveReq.compare_image_type = YtFSM.getInstance().getContext().imageToComapreType;
        }
        actionReflectLiveReq.live_image = actionReflectLiveReqData.liveImage;
        actionReflectLiveReq.mouth_image = actionReflectLiveReqData.mouthImage;
        actionReflectLiveReq.eye_image = actionReflectLiveReqData.eyeImage;
        actionReflectLiveReq.mode = actionReflectLiveReqData.mode;
        actionReflectLiveReq.config = actionReflectLiveReqData.config;
        if (actionReflectLiveReqData.reflectData == null) {
            return new WeJson().toJson(actionReflectLiveReq);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("begin_time", actionReflectLiveReqData.reflectData.begin_time);
            jSONObject.put("changepoint_time", actionReflectLiveReqData.reflectData.changepoint_time);
            jSONObject.put("offset_sys", actionReflectLiveReqData.reflectData.offset_sys);
            jSONObject.put("frame_num", actionReflectLiveReqData.reflectData.frame_num);
            jSONObject.put("landmark_num", actionReflectLiveReqData.reflectData.landmark_num);
            jSONObject.put("width", actionReflectLiveReqData.reflectData.width);
            jSONObject.put("height", actionReflectLiveReqData.reflectData.height);
            jSONObject.put("log", actionReflectLiveReqData.reflectData.log);
            jSONObject.put("config_begin", actionReflectLiveReqData.reflectData.config_begin);
            jSONObject.put(WBConstants.AUTH_PARAMS_VERSION, actionReflectLiveReqData.reflectData.version);
            jSONObject.put("reflect_video", actionReflectLiveReqData.reflectData.reflect_video);
            JSONArray jSONArray = new JSONArray();
            Iterator<Long> it = actionReflectLiveReqData.reflectData.changepoint_time_list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("changepoint_time_list", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (ColorImgData colorImgData : actionReflectLiveReqData.reflectData.images_data) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("image", colorImgData.image);
                jSONObject2.put("capture_time", colorImgData.capture_time);
                jSONObject2.put("checksum", colorImgData.checksum);
                jSONObject2.put(BaseSei.f13930X, colorImgData.f60838x);
                jSONObject2.put(BaseSei.f13931Y, colorImgData.f60839y);
                jSONArray2.put(jSONObject2);
            }
            jSONObject.put("images_data", jSONArray2);
            actionReflectLiveReq.reflect_data = jSONObject;
            json = new WeJson().toJson(actionReflectLiveReq);
            JSONObject jSONObject3 = new JSONObject(json);
            jSONObject3.put("reflect_data", jSONObject);
            return jSONObject3.toString();
        } catch (JSONException e) {
            YtLogger.m84638e(TAG, "make ref json error", e);
            return json;
        }
    }

    public static String makeFourLiveReq(FourLiveReqData fourLiveReqData) {
        FourLiveReq fourLiveReq = new FourLiveReq();
        fourLiveReq.app_id = fourLiveReqData.baseInfoData.appId;
        fourLiveReq.validate_data = fourLiveReqData.validateData;
        fourLiveReq.video = fourLiveReqData.video;
        Bitmap bitmap = YtFSM.getInstance().getContext().imageToCompare;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream);
            fourLiveReq.compare_image = new String(Base64.encode(byteArrayOutputStream.toByteArray(), 2));
        }
        return new WeJson().toJson(fourLiveReq);
    }

    public static String makeGetFourLiveReq(GetFourLiveTypeReqData getFourLiveTypeReqData) {
        GetFourLiveTypeReq getFourLiveTypeReq = new GetFourLiveTypeReq();
        getFourLiveTypeReq.app_id = getFourLiveTypeReqData.baseInfo.appId;
        return new WeJson().toJson(getFourLiveTypeReq);
    }

    public static String makeGetLiveTypeReq(GetLiveTypeReqData getLiveTypeReqData) {
        GetLiveTypeReq getLiveTypeReq = new GetLiveTypeReq();
        NetBaseInfoData netBaseInfoData = getLiveTypeReqData.baseInfo;
        getLiveTypeReq.app_id = netBaseInfoData.appId;
        getLiveTypeReq.business_name = netBaseInfoData.businessId;
        getLiveTypeReq.person_id = netBaseInfoData.personId;
        getLiveTypeReq.platform = 2;
        getLiveTypeReq.session_id = netBaseInfoData.sessionId;
        Version version = new Version();
        version.sdk_version = YtSDKKitFramework.getInstance().version();
        version.ftrack_sdk_version = YTFaceTracker.getVersion();
        if (YtFSM.getInstance().getWorkMode() == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE) {
            version.faction_sdk_version = YTPoseDetectJNIInterface.getVersion();
        }
        version.freflect_sdk_version = YTAGReflectLiveCheckInterface.VERSION;
        LiveStyleRequester.SeleceData seleceData = new LiveStyleRequester.SeleceData(getLiveTypeReqData.baseInfo.lux, getLiveTypeReqData.colorNum, getLiveTypeReqData.reflectConfig, version.makeVersion(), getLiveTypeReqData.controlConfig);
        getLiveTypeReq.select_data = seleceData;
        seleceData.setConfig(getLiveTypeReqData.controlConfig);
        return new WeJson().toJson(getLiveTypeReq);
    }

    public static String makeLipReadReq(LipReadReqData lipReadReqData) {
        PersonLiveReq personLiveReq = new PersonLiveReq();
        NetBaseInfoData netBaseInfoData = lipReadReqData.baseInfo;
        personLiveReq.app_id = netBaseInfoData.appId;
        personLiveReq.business_name = netBaseInfoData.businessId;
        personLiveReq.person_id = netBaseInfoData.personId;
        personLiveReq.livedata = new PersonLive();
        Version version = new Version();
        version.sdk_version = YtSDKKitFramework.getInstance().version();
        version.ftrack_sdk_version = YTFaceTracker.getVersion();
        version.freflect_sdk_version = YTAGReflectLiveCheckInterface.VERSION;
        personLiveReq.livedata.select_data = new LiveStyleRequester.SeleceData(lipReadReqData.baseInfo.lux, 0, "", version.makeVersion(), "");
        personLiveReq.livedata.frames = new ArrayList<>();
        FaceFrame faceFrame = new FaceFrame();
        faceFrame.image = lipReadReqData.liveImage;
        faceFrame.x_coordinates = new ArrayList<>();
        faceFrame.y_coordinates = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int i2 = i * 2;
            faceFrame.x_coordinates.add(Float.valueOf(lipReadReqData.liveFivePoint[i2]));
            faceFrame.y_coordinates.add(Float.valueOf(lipReadReqData.liveFivePoint[i2 + 1]));
        }
        personLiveReq.livedata.frames.add(faceFrame);
        try {
            JSONObject jSONObject = new JSONObject(lipReadReqData.faceExtraInfo);
            FaceFrame faceFrame2 = new FaceFrame();
            faceFrame2.image = jSONObject.getString("openmouth_img");
            faceFrame2.x_coordinates = new ArrayList<>();
            faceFrame2.y_coordinates = new ArrayList<>();
            JSONArray jSONArray = jSONObject.getJSONArray("openmouth_5pts");
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                faceFrame2.x_coordinates.add(Float.valueOf((float) jSONArray.optDouble(i4)));
                faceFrame2.y_coordinates.add(Float.valueOf((float) jSONArray.optDouble(i4 + 1)));
            }
            personLiveReq.livedata.frames.add(faceFrame2);
            FaceFrame faceFrame3 = new FaceFrame();
            faceFrame3.image = jSONObject.getString("closeeye_img");
            faceFrame3.x_coordinates = new ArrayList<>();
            faceFrame3.y_coordinates = new ArrayList<>();
            JSONArray jSONArray2 = jSONObject.getJSONArray("closeeye_5pts");
            for (int i5 = 0; i5 < 5; i5++) {
                int i6 = i5 * 2;
                faceFrame3.x_coordinates.add(Float.valueOf((float) jSONArray2.optDouble(i6)));
                faceFrame3.y_coordinates.add(Float.valueOf((float) jSONArray2.optDouble(i6 + 1)));
            }
            personLiveReq.livedata.frames.add(faceFrame3);
        } catch (Exception e) {
            YtLogger.m84638e(TAG, "Failed parse extra face list ", e);
        }
        PersonLive personLive = personLiveReq.livedata;
        personLive.validate_data = lipReadReqData.validate_data;
        personLive.voice = lipReadReqData.voice;
        personLive.mouth_move = lipReadReqData.mouth_move;
        personLive.mouth_lip_reading = lipReadReqData.mouth_lip_reading;
        personLive.platform = 2;
        NetBaseInfoData netBaseInfoData2 = lipReadReqData.baseInfo;
        personLiveReq.person_type = netBaseInfoData2.personType;
        personLiveReq.live_type = netBaseInfoData2.liveType;
        personLiveReq.req_type = netBaseInfoData2.reqType;
        return new WeJson().toJson(personLiveReq);
    }

    public static String makePersonLiveReq(ReflectLiveReqData reflectLiveReqData) {
        PersonLiveReq personLiveReq = new PersonLiveReq();
        NetBaseInfoData netBaseInfoData = reflectLiveReqData.baseInfo;
        personLiveReq.app_id = netBaseInfoData.appId;
        personLiveReq.business_name = netBaseInfoData.businessId;
        personLiveReq.person_id = netBaseInfoData.personId;
        personLiveReq.live_type = netBaseInfoData.liveType;
        personLiveReq.req_type = netBaseInfoData.reqType;
        personLiveReq.request_id = netBaseInfoData.sessionId;
        personLiveReq.person_type = netBaseInfoData.personType;
        personLiveReq.livedata = new PersonLive();
        Version version = new Version();
        version.sdk_version = YtSDKKitFramework.getInstance().version();
        version.ftrack_sdk_version = YTFaceTracker.getVersion();
        version.freflect_sdk_version = YTAGReflectLiveCheckInterface.VERSION;
        String strMakeVersion = version.makeVersion();
        personLiveReq.livedata.select_data = new LiveStyleRequester.SeleceData(reflectLiveReqData.baseInfo.lux, reflectLiveReqData.colorNum, reflectLiveReqData.config, strMakeVersion, "");
        PersonLive personLive = personLiveReq.livedata;
        personLive.reflect_data = reflectLiveReqData.reflectData;
        personLive.color_data = reflectLiveReqData.colorData;
        personLive.platform = 2;
        personLive.frames = new ArrayList<>();
        FaceFrame faceFrame = new FaceFrame();
        faceFrame.image = reflectLiveReqData.bestImage.image;
        personLiveReq.livedata.frames.add(faceFrame);
        FaceFrame faceFrame2 = new FaceFrame();
        faceFrame2.image = reflectLiveReqData.openMouthImage.image;
        personLiveReq.livedata.frames.add(faceFrame2);
        FaceFrame faceFrame3 = new FaceFrame();
        faceFrame3.image = reflectLiveReqData.openMouthImage.image;
        personLiveReq.livedata.frames.add(faceFrame3);
        return new WeJson().toJson(personLiveReq);
    }

    public static String makePictureLiveReq(PictureLiveReqData pictureLiveReqData) {
        PictureLiveDetectReq pictureLiveDetectReq = new PictureLiveDetectReq();
        NetBaseInfoData netBaseInfoData = pictureLiveReqData.baseInfo;
        pictureLiveDetectReq.app_id = netBaseInfoData.appId;
        pictureLiveDetectReq.session_id = netBaseInfoData.sessionId;
        ImageInfo imageInfo = pictureLiveReqData.imageInfo;
        pictureLiveDetectReq.five_point = imageInfo.five_points;
        pictureLiveDetectReq.image = imageInfo.image;
        Version version = new Version();
        version.sdk_version = YtSDKKitFramework.getInstance().version();
        version.ftrack_sdk_version = YTFaceTracker.getVersion();
        version.freflect_sdk_version = YTAGReflectLiveCheckInterface.VERSION;
        pictureLiveDetectReq.select_data = new LiveStyleRequester.SeleceData(pictureLiveReqData.baseInfo.lux, 0, "", version.makeVersion(), "");
        return new WeJson().toJson(pictureLiveDetectReq);
    }

    public static String makeReflectLiveReq(ReflectLiveReqData reflectLiveReqData) {
        ReflectLiveReq reflectLiveReq = new ReflectLiveReq();
        NetBaseInfoData netBaseInfoData = reflectLiveReqData.baseInfo;
        reflectLiveReq.app_id = netBaseInfoData.appId;
        reflectLiveReq.session_id = netBaseInfoData.sessionId;
        reflectLiveReq.business_id = netBaseInfoData.businessId;
        reflectLiveReq.platform = 2;
        reflectLiveReq.color_data = reflectLiveReqData.colorData;
        reflectLiveReq.live_image = reflectLiveReqData.liveImage;
        reflectLiveReq.reflect_data = reflectLiveReqData.reflectData;
        Version version = new Version();
        version.sdk_version = YtSDKKitFramework.getInstance().version();
        version.ftrack_sdk_version = YTFaceTracker.getVersion();
        version.freflect_sdk_version = YTAGReflectLiveCheckInterface.VERSION;
        reflectLiveReq.select_data = new LiveStyleRequester.SeleceData(reflectLiveReqData.baseInfo.lux, reflectLiveReqData.colorNum, reflectLiveReqData.config, version.makeVersion(), "");
        Bitmap bitmap = YtFSM.getInstance().getContext().imageToCompare;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream);
            reflectLiveReq.compare_image = new String(Base64.encode(byteArrayOutputStream.toByteArray(), 2));
            reflectLiveReq.compare_image_type = YtFSM.getInstance().getContext().imageToComapreType;
        }
        return new WeJson().toJson(reflectLiveReq);
    }

    public static String removeKey(String str, String str2) {
        String[] strArrSplit = str.split("&");
        String strConcat = "";
        for (int i = 0; i < strArrSplit.length; i++) {
            if (!strArrSplit[i].split("=")[0].equals(str2)) {
                strConcat = strConcat.length() == 0 ? strConcat.concat(strArrSplit[i]) : strConcat.concat("&").concat(strArrSplit[i]);
                YtLogger.m84637d(TAG, "result: ".concat(strConcat));
            }
        }
        return strConcat;
    }

    public static class ImageInfo {
        public String checksum;
        public ArrayList<Float> five_points;
        public String image;

        public ImageInfo(byte[] bArr, float[] fArr, String str) {
            this.image = new String(Base64.encode(bArr, 2));
            ArrayList<Float> arrayList = new ArrayList<>();
            this.five_points = arrayList;
            this.checksum = str;
            if (fArr != null) {
                arrayList.add(Float.valueOf(fArr[176]));
                this.five_points.add(Float.valueOf(fArr[177]));
                this.five_points.add(Float.valueOf(fArr[178]));
                this.five_points.add(Float.valueOf(fArr[179]));
                this.five_points.add(Float.valueOf(fArr[64]));
                this.five_points.add(Float.valueOf(fArr[65]));
                this.five_points.add(Float.valueOf(fArr[90]));
                this.five_points.add(Float.valueOf(fArr[91]));
                this.five_points.add(Float.valueOf(fArr[102]));
                this.five_points.add(Float.valueOf(fArr[103]));
            }
        }

        public ImageInfo(String str, ArrayList<Float> arrayList, String str2) {
            this.image = str;
            this.five_points = arrayList;
            this.checksum = str2;
        }
    }
}
