package com.immomo.momomediaext.filter.beauty;

import android.content.Context;
import android.text.TextUtils;
import com.core.glcore.util.FileUtil;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import p153l.gfj;
import p153l.jt2;
import p153l.omw;
import p153l.suf;

/* JADX INFO: loaded from: classes7.dex */
public class ByteDanceFilter extends jt2 implements suf {
    private ByteDanceHelper byteDanceHelper;
    private ConcurrentHashMap<String, String> resourceMap = new ConcurrentHashMap<>();

    public ByteDanceFilter(Context context, ByteDanceHelper.IBeautyErrorListener iBeautyErrorListener) {
        this.byteDanceHelper = new ByteDanceHelper(context, iBeautyErrorListener);
    }

    private boolean checkResourceValid(String str) {
        if (this.byteDanceHelper == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return FileUtil.exist(this.byteDanceHelper.getResourceRootPath() + File.separator + str);
    }

    private boolean updateComposerNodes(String str, String str2) {
        ByteDanceHelper byteDanceHelper = this.byteDanceHelper;
        if (byteDanceHelper != null) {
            return byteDanceHelper.updateComposerNodes(str, str2);
        }
        return false;
    }

    private boolean updateComposerNodesIntensity(String str, String str2, float f) {
        ByteDanceHelper byteDanceHelper = this.byteDanceHelper;
        if (byteDanceHelper != null) {
            return byteDanceHelper.updateComposerNodesIntensity(str, str2, f);
        }
        return false;
    }

    @Override // p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        release();
    }

    public boolean forbidBeauty(boolean z) {
        ByteDanceHelper byteDanceHelper = this.byteDanceHelper;
        if (byteDanceHelper != null) {
            return byteDanceHelper.forbidBeauty(z);
        }
        return false;
    }

    public boolean isByteDanceBeautyEnable() {
        ByteDanceHelper byteDanceHelper = this.byteDanceHelper;
        if (byteDanceHelper != null) {
            return byteDanceHelper.isEnable();
        }
        return false;
    }

    @Override // p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        ByteDanceHelper byteDanceHelper = this.byteDanceHelper;
        if (byteDanceHelper != null) {
            super.newTextureReady(byteDanceHelper.processTexture(i, gfjVar.getWidth(), gfjVar.getHeight(), EffectsSDKEffectConstants.Rotation.CLOCKWISE_ROTATE_0, System.nanoTime()), gfjVar, z);
        } else {
            super.newTextureReady(i, gfjVar, z);
        }
    }

    public void release() {
        ByteDanceHelper byteDanceHelper = this.byteDanceHelper;
        if (byteDanceHelper != null) {
            byteDanceHelper.release();
        }
        ConcurrentHashMap<String, String> concurrentHashMap = this.resourceMap;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
    }

    public boolean removeBody(String str) {
        String strRemove = this.resourceMap.remove(str);
        if (checkResourceValid(strRemove)) {
            return updateComposerNodes(strRemove, "");
        }
        return true;
    }

    public boolean removeMakeup(String str) {
        String strRemove = this.resourceMap.remove(str);
        if (checkResourceValid(strRemove)) {
            return updateComposerNodes(strRemove, "");
        }
        return true;
    }

    public boolean removeMakeupStyle(String str, String str2) {
        String strRemove = this.resourceMap.remove(str);
        String strRemove2 = this.resourceMap.remove(str2);
        if (checkResourceValid(strRemove) && checkResourceValid(strRemove2)) {
            return updateComposerNodes(strRemove, "") && updateComposerNodes(strRemove2, "");
        }
        return true;
    }

    public boolean setCameraPosition(boolean z) {
        ByteDanceHelper byteDanceHelper = this.byteDanceHelper;
        if (byteDanceHelper != null) {
            return byteDanceHelper.setCameraPosition(z);
        }
        return false;
    }

    @Override // p153l.suf
    public void setMMCVInfo(omw omwVar) {
        ByteDanceHelper byteDanceHelper = this.byteDanceHelper;
        if (byteDanceHelper != null) {
            byteDanceHelper.processFaceFeature(omwVar, this.width, this.height);
        }
    }

    public void setOnDetectCompleteListener(ByteDanceHelper.IFaceDetectCompleteListener iFaceDetectCompleteListener) {
        ByteDanceHelper byteDanceHelper = this.byteDanceHelper;
        if (byteDanceHelper != null) {
            byteDanceHelper.setOnDetectCompleteListener(iFaceDetectCompleteListener);
        }
    }

    public boolean updateBeautyBodyValue(String str, String str2, float f) {
        String strReplace = str.replace("_", File.separator);
        if (!checkResourceValid(strReplace)) {
            return false;
        }
        if (!this.resourceMap.containsKey(str2)) {
            updateComposerNodes("", strReplace);
            this.resourceMap.put(str2, strReplace);
        } else if (!TextUtils.equals(this.resourceMap.get(str2), strReplace)) {
            updateComposerNodes(this.resourceMap.get(str2), strReplace);
            this.resourceMap.put(str2, strReplace);
        }
        return updateComposerNodesIntensity(strReplace, str2, f);
    }

    public boolean updateFaceBeautyValue(String str, String str2, float f) {
        String strReplace = str.replace("_", File.separator);
        if (!checkResourceValid(strReplace)) {
            return false;
        }
        if (!this.resourceMap.containsKey(str)) {
            this.resourceMap.put(str, strReplace);
            updateComposerNodes("", strReplace);
        }
        return updateComposerNodesIntensity(strReplace, str2, f);
    }

    public boolean updateMakeupStyleValue(String str, String str2, float f) {
        String strReplace = str.replace("_", File.separator);
        if (!checkResourceValid(strReplace)) {
            return false;
        }
        if (!this.resourceMap.containsKey(str2)) {
            updateComposerNodes("", strReplace);
            this.resourceMap.put(str2, strReplace);
        } else if (!TextUtils.equals(this.resourceMap.get(str2), strReplace)) {
            updateComposerNodes(this.resourceMap.get(str2), strReplace);
            this.resourceMap.put(str2, strReplace);
        }
        return updateComposerNodesIntensity(strReplace, str2, f);
    }

    public boolean updateMakeupValue(String str, String str2, float f) {
        String strReplace = str.replace("_", File.separator);
        if (!checkResourceValid(strReplace)) {
            return false;
        }
        if (!this.resourceMap.containsKey(str2)) {
            updateComposerNodes("", strReplace);
            this.resourceMap.put(str2, strReplace);
        } else if (!TextUtils.equals(this.resourceMap.get(str2), strReplace)) {
            updateComposerNodes(this.resourceMap.get(str2), strReplace);
            this.resourceMap.put(str2, strReplace);
        }
        return updateComposerNodesIntensity(strReplace, str2, f);
    }
}
