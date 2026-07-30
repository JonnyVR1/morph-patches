package com.immomo.momomediaext.filter.beauty;

import android.content.Context;
import android.text.TextUtils;
import com.effectsar.labcv.effectsdk.BefFaceInfo;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.effectsar.labcv.effectsdk.RenderManager;
import com.immomo.medialog.LogLevel;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p149l.eyx;
import p149l.pjw;

/* JADX INFO: loaded from: classes7.dex */
public class ByteDanceHelper {
    private static boolean closeCheckResource = false;
    private static String licensePath = "";
    private static String modelPath = "";
    private static boolean openFaceDetectInterval = false;
    private static boolean removeMakeupFloat = false;
    private static String resourceRootPath = "";
    private static boolean usePipeline = false;
    private Context context;
    private IBeautyErrorListener errorListener;
    private FrameBufferCreator glFrameBuffer;
    private IFaceDetectCompleteListener listener;
    private pjw mmcvInfo;
    private int textureHeight;
    private int textureWidth;
    private boolean checkLicenseSuccess = false;
    private boolean isInit = false;
    private List<String> composerNodes = new CopyOnWriteArrayList();
    private Map<String, ByteDanceNode> composerNodesIntensity = new ConcurrentHashMap();
    private boolean isResourceComplete = false;
    private HashMap<Integer, String> errorCode = new HashMap<>();
    private boolean isForbidBeauty = false;
    private RenderManager renderManager = new RenderManager();
    private FaceFeatureHelper faceFeatureHelper = new FaceFeatureHelper();

    public interface IBeautyErrorListener {
        void onBeautyError(int i, String str);
    }

    public interface IFaceDetectCompleteListener {
        void onFaceDetectComplete(pjw pjwVar);
    }

    public ByteDanceHelper(Context context, IBeautyErrorListener iBeautyErrorListener) {
        this.context = context;
        this.errorListener = iBeautyErrorListener;
        initErrorCode();
        checkLicense();
    }

    private boolean canUse() {
        if (!this.checkLicenseSuccess) {
            checkLicense();
        }
        if (!this.isResourceComplete) {
            checkResource();
        }
        return this.checkLicenseSuccess && this.isResourceComplete;
    }

    private synchronized boolean checkLicense() {
        try {
            boolean z = true;
            if (this.checkLicenseSuccess) {
                return true;
            }
            if (!TextUtils.isEmpty(modelPath) && !TextUtils.isEmpty(licensePath)) {
                if (this.renderManager == null) {
                    this.renderManager = new RenderManager();
                }
                if (!this.isInit) {
                    this.isInit = true;
                    int iInit = this.renderManager.init(this.context, modelPath, licensePath);
                    if (iInit != 0) {
                        z = false;
                    }
                    this.checkLicenseSuccess = z;
                    eyx.m118802c().m118808g("ByteDanceHelper", "byte dance beauty init modelPath === " + modelPath + " licensePath === " + licensePath + " code === " + iInit);
                    this.renderManager.setPipeline(usePipeline);
                    this.renderManager.set3Buffer(false);
                    if (openFaceDetectInterval) {
                        this.renderManager.SetFaceDetectInterval(3);
                    }
                    if (!this.checkLicenseSuccess && this.errorListener != null) {
                        String str = this.errorCode.containsKey(Integer.valueOf(iInit)) ? this.errorCode.get(Integer.valueOf(iInit)) : "";
                        this.errorListener.onBeautyError(iInit, str);
                        eyx.m118802c().m118806e("beauty", "bytedance_beauty", iInit, str, LogLevel.FATAL.value());
                    }
                }
                return this.checkLicenseSuccess;
            }
            if (this.errorListener != null) {
                eyx.m118802c().m118808g("ByteDanceHelper", "byte dance beauty modelPath === " + modelPath + " licensePath === " + licensePath);
                this.errorListener.onBeautyError(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_IS_NULL, this.errorCode.get(Integer.valueOf(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_IS_NULL)));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized boolean checkResource() {
        try {
            if (!this.isResourceComplete) {
                boolean z = true;
                if (closeCheckResource) {
                    this.isResourceComplete = true;
                } else {
                    String strAvailableBeautyPath = ByteDanceConfig.availableBeautyPath();
                    String strAvailableReshapePath = ByteDanceConfig.availableReshapePath();
                    eyx.m118802c().m118808g("ByteDanceHelper", "byte dance beauty beautyPath === " + strAvailableBeautyPath + " reshapePath === " + strAvailableReshapePath);
                    if (!TextUtils.isEmpty(strAvailableBeautyPath) && !TextUtils.isEmpty(strAvailableReshapePath)) {
                        if (!this.composerNodes.contains(strAvailableBeautyPath)) {
                            this.composerNodes.add(strAvailableBeautyPath);
                        }
                        if (!this.composerNodes.contains(strAvailableReshapePath)) {
                            this.composerNodes.add(strAvailableReshapePath);
                        }
                        RenderManager renderManager = this.renderManager;
                        if (renderManager != null) {
                            int composerNodes = renderManager.setComposerNodes((String[]) this.composerNodes.toArray(new String[0]));
                            eyx.m118802c().m118808g("ByteDanceHelper", "byte dance beauty isResourceComplete === " + this.isResourceComplete + " ret === " + composerNodes);
                            if (composerNodes != 0) {
                                z = false;
                            }
                            this.isResourceComplete = z;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.isResourceComplete;
    }

    public static void closeCheckResource(boolean z) {
        closeCheckResource = z;
    }

    private void forbidComposerNodes() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        String strAvailableBeautyPath = ByteDanceConfig.availableBeautyPath();
        String strAvailableReshapePath = ByteDanceConfig.availableReshapePath();
        copyOnWriteArrayList.add(strAvailableBeautyPath);
        copyOnWriteArrayList.add(strAvailableReshapePath);
        this.renderManager.setComposerNodes((String[]) copyOnWriteArrayList.toArray(new String[0]));
    }

    private void forbidComposerNodesIntensity() {
        for (Map.Entry<String, ByteDanceNode> entry : this.composerNodesIntensity.entrySet()) {
            if (isComposerNodesContainsPath(entry.getValue().path)) {
                ByteDanceNode value = entry.getValue();
                this.renderManager.updateComposerNodes(resourceRootPath + File.separator + value.path, value.key, 0.0f);
            }
        }
    }

    private void initErrorCode() {
        this.errorCode.put(Integer.valueOf(EffectsSDKEffectConstants.EffectsSDKResultCode.BEF_RESULT_INVALID_LICENSE), "无效的license，请检查授权文件路径是否正确，模型文件是否受损");
        this.errorCode.put(-116, "非法授权文件，请检查授权文件是否正确");
        this.errorCode.put(-117, "授权文件过期，请检查授权文件是否正确，是否需要更新");
        this.errorCode.put(-119, "Application/BundleID不匹配，请检查申请授权文件和应用的Application/BundleId是否一致");
        this.errorCode.put(-120, "授权包路径为空，请检查授权文件路径是否正确");
        this.errorCode.put(-121, "错误的授权包路径，请检查传入sdk的路径是否正确");
        this.errorCode.put(-122, "授权包类型不匹配，请检查授权文件是否正确，是否损坏");
        this.errorCode.put(-123, "无效的版本，请检查是否用了旧版本的授权文件");
        this.errorCode.put(-124, "无效的数据块，请检查授权文件是否正确，是否损坏");
        this.errorCode.put(-125, "无效的数据块长度，请检查授权文件是否正确，是否损坏");
        this.errorCode.put(-126, "数据块不完整，请检查授权文件是否正确，是否损坏");
        this.errorCode.put(-127, "未授权的功能，请检查是否购买对应功能");
        this.errorCode.put(Integer.valueOf(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_IS_NULL), "授权文件路径或者模型路径为空");
    }

    private boolean isComposerNodesContainsPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int size = this.composerNodes.size();
        for (int i = 0; i < size; i++) {
            if (!TextUtils.isEmpty(this.composerNodes.get(i)) && this.composerNodes.get(i).contains(str)) {
                return true;
            }
        }
        return false;
    }

    public static void openFaceDetectInterval(boolean z) {
        openFaceDetectInterval = z;
    }

    public static void removeMakeupFloat(boolean z) {
        removeMakeupFloat = z;
    }

    private void restoreComposerNodes() {
        if (!removeMakeupFloat) {
            this.renderManager.setComposerNodes((String[]) this.composerNodes.toArray(new String[0]));
            return;
        }
        int size = this.composerNodes.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            if (TextUtils.isEmpty(this.composerNodes.get(i)) || !this.composerNodes.get(i).contains("MakeupStyle")) {
                strArr[i] = "{\"effectsdk_config\":\"{\\\"minV\\\":\\\"6.9.0\\\",\\\"FaceMakeupV2AMG\\\":false}\"}";
            } else {
                strArr[i] = "{\"effectsdk_config\":\"{\\\"minV\\\":\\\"6.9.0\\\",\\\"FaceMakeupV2AMG\\\":true}\"}";
            }
        }
        this.renderManager.setComposerNodesWithTags((String[]) this.composerNodes.toArray(new String[0]), strArr);
    }

    private void restoreComposerNodesIntensity() {
        for (Map.Entry<String, ByteDanceNode> entry : this.composerNodesIntensity.entrySet()) {
            if (isComposerNodesContainsPath(entry.getValue().path)) {
                ByteDanceNode value = entry.getValue();
                this.renderManager.updateComposerNodes(resourceRootPath + File.separator + value.path, value.key, value.value);
            }
        }
    }

    public static void setLicensePath(String str) {
        licensePath = str;
    }

    public static void setModelPath(String str) {
        modelPath = str;
    }

    public static void setResourceRootPath(String str) {
        resourceRootPath = str;
    }

    public static void usePipeline(boolean z) {
        usePipeline = z;
    }

    public boolean forbidBeauty(boolean z) {
        if (!canUse() || this.renderManager == null) {
            return false;
        }
        if (z) {
            forbidComposerNodes();
            forbidComposerNodesIntensity();
        } else {
            restoreComposerNodes();
            restoreComposerNodesIntensity();
        }
        this.isForbidBeauty = z;
        return true;
    }

    public String getResourceRootPath() {
        return resourceRootPath;
    }

    public boolean isEnable() {
        return checkLicense() && checkResource();
    }

    public void processFaceFeature(pjw pjwVar, int i, int i2) {
        this.mmcvInfo = pjwVar;
        this.textureWidth = i;
        this.textureHeight = i2;
    }

    public int processTexture(int i, int i2, int i3, EffectsSDKEffectConstants.Rotation rotation, long j) {
        if (!checkLicense()) {
            IFaceDetectCompleteListener iFaceDetectCompleteListener = this.listener;
            if (iFaceDetectCompleteListener != null) {
                iFaceDetectCompleteListener.onFaceDetectComplete(this.mmcvInfo);
                return i;
            }
        } else if (checkResource()) {
            if (this.glFrameBuffer == null) {
                this.glFrameBuffer = new FrameBufferCreator(i2, i3);
            }
            if (this.glFrameBuffer.getBufferWidth() != i2 || this.glFrameBuffer.getBufferHigh() != i3) {
                this.glFrameBuffer.destoryBuffer();
                this.glFrameBuffer.activityDepthFrameBuffer(i2, i3);
            }
            if (this.renderManager.processTexture(i, this.glFrameBuffer.getTexture_out()[0], i2, i3, rotation, j)) {
                BefFaceInfo faceDetectResult = this.renderManager.getFaceDetectResult();
                FaceFeatureHelper faceFeatureHelper = this.faceFeatureHelper;
                if (faceFeatureHelper != null && faceDetectResult != null) {
                    faceFeatureHelper.transformFaceFeature(faceDetectResult, this.mmcvInfo, this.textureWidth, this.textureHeight);
                }
                IFaceDetectCompleteListener iFaceDetectCompleteListener2 = this.listener;
                if (iFaceDetectCompleteListener2 != null) {
                    iFaceDetectCompleteListener2.onFaceDetectComplete(this.mmcvInfo);
                }
                return this.glFrameBuffer.getTexture_out()[0];
            }
            IFaceDetectCompleteListener iFaceDetectCompleteListener3 = this.listener;
            if (iFaceDetectCompleteListener3 != null) {
                iFaceDetectCompleteListener3.onFaceDetectComplete(this.mmcvInfo);
            }
        } else {
            IFaceDetectCompleteListener iFaceDetectCompleteListener4 = this.listener;
            if (iFaceDetectCompleteListener4 != null) {
                iFaceDetectCompleteListener4.onFaceDetectComplete(this.mmcvInfo);
                return i;
            }
        }
        return i;
    }

    public void release() {
        RenderManager renderManager = this.renderManager;
        if (renderManager != null) {
            renderManager.release();
            this.renderManager = null;
        }
        List<String> list = this.composerNodes;
        if (list != null) {
            list.clear();
        }
        FrameBufferCreator frameBufferCreator = this.glFrameBuffer;
        if (frameBufferCreator != null) {
            frameBufferCreator.destoryBuffer();
            this.glFrameBuffer = null;
        }
        this.composerNodesIntensity.clear();
        this.checkLicenseSuccess = false;
        this.isInit = false;
        this.isResourceComplete = false;
    }

    public boolean setCameraPosition(boolean z) {
        RenderManager renderManager;
        if (!canUse() || (renderManager = this.renderManager) == null) {
            return false;
        }
        return renderManager.setCameraPostion(z);
    }

    public void setOnDetectCompleteListener(IFaceDetectCompleteListener iFaceDetectCompleteListener) {
        this.listener = iFaceDetectCompleteListener;
    }

    public boolean updateComposerNodes(String str, String str2) {
        RenderManager renderManager;
        StringBuilder sb = new StringBuilder();
        sb.append(resourceRootPath);
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str);
        this.composerNodes.remove(sb.toString());
        if (!TextUtils.isEmpty(str2)) {
            String str4 = resourceRootPath + str3 + str2;
            if (!this.composerNodes.contains(str4)) {
                this.composerNodes.add(str4);
            }
        }
        if (this.isForbidBeauty) {
            return true;
        }
        if (canUse() && (renderManager = this.renderManager) != null) {
            boolean z = removeMakeupFloat;
            List<String> list = this.composerNodes;
            if (z) {
                int size = list.size();
                String[] strArr = new String[size];
                for (int i = 0; i < size; i++) {
                    if (TextUtils.isEmpty(this.composerNodes.get(i)) || !this.composerNodes.get(i).contains("MakeupStyle")) {
                        strArr[i] = "{\"effectsdk_config\":\"{\\\"minV\\\":\\\"6.9.0\\\",\\\"FaceMakeupV2AMG\\\":false}\"}";
                    } else {
                        strArr[i] = "{\"effectsdk_config\":\"{\\\"minV\\\":\\\"6.9.0\\\",\\\"FaceMakeupV2AMG\\\":true}\"}";
                    }
                }
                return this.renderManager.setComposerNodesWithTags((String[]) this.composerNodes.toArray(new String[0]), strArr) == 0;
            }
            if (renderManager.setComposerNodes((String[]) list.toArray(new String[0])) == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean updateComposerNodesIntensity(String str, String str2, float f) {
        if (canUse() && this.renderManager != null) {
            boolean zContainsKey = this.composerNodesIntensity.containsKey(str2);
            Map<String, ByteDanceNode> map = this.composerNodesIntensity;
            if (zContainsKey) {
                ByteDanceNode byteDanceNode = map.get(str2);
                byteDanceNode.path = str;
                byteDanceNode.key = str2;
                byteDanceNode.value = f;
            } else {
                map.put(str2, new ByteDanceNode(str, str2, f));
            }
            if (this.isForbidBeauty) {
                return true;
            }
            if (this.renderManager.updateComposerNodes(resourceRootPath + File.separator + str, str2, f) == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean updateFilter(String str) {
        RenderManager renderManager;
        if (!canUse() || (renderManager = this.renderManager) == null) {
            return false;
        }
        return renderManager.setFilter(str);
    }

    public boolean updateFilterIntensity(float f) {
        RenderManager renderManager;
        if (!canUse() || (renderManager = this.renderManager) == null) {
            return false;
        }
        return renderManager.updateIntensity(12, f);
    }
}
