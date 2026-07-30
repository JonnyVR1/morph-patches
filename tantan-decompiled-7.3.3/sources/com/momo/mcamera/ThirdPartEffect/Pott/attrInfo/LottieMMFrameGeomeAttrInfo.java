package com.momo.mcamera.ThirdPartEffect.Pott.attrInfo;

import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.KeyFrameInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.KeyStatus;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.KeyValue;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.Layers;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.LottieConfig;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class LottieMMFrameGeomeAttrInfo extends MMFrameGeomeAttrInfo {
    int additionalOffset;
    List<KeyValue> alpha;
    private int alphaIndex;
    float alphaStep;
    Layers curLayer;
    long curTime;
    long firstTime;
    int[] indexArray;
    boolean loopLastFrame;
    LottieConfig lottieConfig;
    private int posIndex;
    List<KeyValue> position;
    private int rotateIndex;
    List<KeyValue> rotation;
    List<KeyValue> scale;

    public LottieMMFrameGeomeAttrInfo(String str) {
        super(str);
        this.curTime = 0L;
        this.firstTime = -1L;
        this.alphaStep = 0.0f;
        this.additionalOffset = 0;
        this.loopLastFrame = false;
        this.posIndex = 0;
        this.rotateIndex = 0;
        this.alphaIndex = 0;
        this.indexArray = new int[4];
    }

    private KeyValue getValue(List<KeyValue> list, long j, int i) {
        if (list == null || list.size() <= 0 || this.indexArray[i] >= list.size()) {
            return null;
        }
        int i2 = this.indexArray[i];
        if (j >= list.get(i2).frameNo * 40 || (i2 == 0 && list == this.position)) {
            return list.get(i2);
        }
        return null;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo, com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.ImageDelegate
    public int[] getFrameTexture() {
        long j = this.curTime - this.firstTime;
        KeyValue value = getValue(this.position, j, 0);
        if (value != null) {
            setTraslate((((value.valueArray.get(0).floatValue() + this.additionalOffset) / this.baseRenderWidth) * 2.0f) - 1.0f, -(((value.valueArray.get(1).floatValue() * 2.0f) / this.baseRenderHeight) - 1.0f));
            int[] iArr = this.indexArray;
            iArr[0] = iArr[0] + 1;
        }
        KeyValue value2 = getValue(this.rotation, j, 1);
        if (value2 != null) {
            float fFloatValue = value2.valueArray.get(0).floatValue();
            if (fFloatValue < 0.0f) {
                fFloatValue += 360.0f;
            }
            setRotate(0.0f, 0.0f, fFloatValue);
            int[] iArr2 = this.indexArray;
            iArr2[1] = iArr2[1] + 1;
        }
        KeyValue value3 = getValue(this.scale, j, 2);
        if (value3 != null) {
            setScale(value3.valueArray.get(0).floatValue() / 100.0f, value3.valueArray.get(1).floatValue() / 100.0f);
            int[] iArr3 = this.indexArray;
            iArr3[2] = iArr3[2] + 1;
        }
        KeyValue value4 = getValue(this.alpha, j, 3);
        if (value4 != null) {
            this.alphaValue = value4.valueArray.get(0).floatValue() / 100.0f;
            int i = this.indexArray[3];
            if (i < this.alpha.size() - 1) {
                int i2 = i + 1;
                this.alphaStep = ((this.alpha.get(i2).valueArray.get(0).floatValue() - this.alphaValue) / 100.0f) / (this.alpha.get(i2).frameNo - this.alpha.get(i).frameNo);
            }
            int[] iArr4 = this.indexArray;
            iArr4[3] = iArr4[3] + 1;
        } else {
            float f = this.alphaValue + this.alphaStep;
            this.alphaValue = f;
            if (f > 1.0f) {
                this.alphaValue = 1.0f;
            }
        }
        if (getAlphaValue() > 0.0f || this.loopLastFrame) {
            return super.getFrameTexture();
        }
        return null;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo, p153l.lim
    public void recycleResourceInGlThread() {
        super.recycleResourceInGlThread();
        this.lottieConfig = null;
        this.position = null;
        this.rotation = null;
        this.scale = null;
        this.alpha = null;
        this.curLayer = null;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo
    public void resetStatus() {
        super.resetStatus();
        this.curTime = 0L;
        this.firstTime = -1L;
        this.alphaStep = 0.0f;
        this.alphaValue = 1.0f;
        int[] iArr = this.indexArray;
        iArr[0] = 0;
        iArr[2] = 0;
        iArr[1] = 0;
        iArr[3] = 0;
    }

    public void setAdditionalOffset(int i) {
        this.additionalOffset = i;
    }

    public void setLoopLastFrame(boolean z) {
        this.loopLastFrame = z;
    }

    public void setLottieConfig(Layers layers) {
        this.curLayer = layers;
        if (layers == null || layers.getKeyStatus() == null) {
            return;
        }
        KeyStatus keyStatus = this.curLayer.getKeyStatus();
        KeyFrameInfo position = keyStatus.getPosition();
        if (position != null) {
            this.position = position.getKeyValues();
        }
        KeyFrameInfo rotation = keyStatus.getRotation();
        if (rotation != null) {
            this.rotation = rotation.getKeyValues();
        }
        KeyFrameInfo alpha = keyStatus.getAlpha();
        if (alpha != null) {
            this.alpha = alpha.getKeyValues();
        }
        KeyFrameInfo scale = keyStatus.getScale();
        if (scale != null) {
            this.scale = scale.getKeyValues();
        }
    }

    public void setLottieParse(LottieConfig lottieConfig, String str) {
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo, p153l.gam
    public void setTimeStamp(long j) {
        if (this.firstTime < 0) {
            this.firstTime = j;
        }
        this.curTime = j;
    }
}
