package com.momo.mcamera.mask;

import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextUtils;
import com.core.glcore.p023cv.MMCVBoxes;
import com.momocv.MMBox;
import p149l.pjw;
import p149l.zsf;

/* JADX INFO: loaded from: classes7.dex */
public class FilterTriggerManager {
    private static int INDEX_FACE_LEFT = 0;
    private static int INDEX_FACE_RIGHT = 16;
    private static int INDEX_MOUSE_DOWN = 66;
    private static int INDEX_MOUSE_UP = 62;
    public static final int STATE_CLOSE = 1;
    public static final int STATE_OPEN = 0;
    public static final int TRIGER_CLICK = 2048;
    public static final int TRIGER_DUCK_FACE = 1024;
    public static final int TRIGER_EYE_BLINK = 256;
    public static final int TRIGER_LEFT_EYE = 8;
    public static final int TRIGER_LEFT_EYE_BLINK = 16;
    public static final int TRIGER_MOUSE = 1;
    public static final int TRIGER_RIGHT_EYE = 64;
    public static final int TRIGER_RIGHT_EYE_BLINK = 128;
    public static final int TRIGER_SMILE = 512;
    public int mouseOpenState = 1;
    public int leftEyeBlinkState = 1;
    public int leftEyeBlinkCount = 0;
    public int eyeBlinkState = 1;
    public int eyeBlinkCount = 0;
    public int rightEyeBlinkState = 0;
    public int rightEyeBlinkCount = 0;
    public int leftEyeOpenState = 0;
    public int rightEyeOpenState = 0;
    public int expressionState = -1;
    public int smileState = 1;
    public int duckFaceState = 1;
    public float leftEyeOpenAmount = 1.0f;
    public float rightEyeOpenAmount = 1.0f;
    private int flag = -1;
    private int hiddenFlag = -1;
    private int faceIndex = 0;

    private void enable(int i) {
        this.flag = i | this.flag;
    }

    private void hiddenDisable(int i) {
        this.hiddenFlag = (~i) & this.hiddenFlag;
    }

    private void hiddenEnable(int i) {
        this.hiddenFlag = i | this.hiddenFlag;
    }

    private boolean isContain(int i) {
        return (this.flag & i) == i;
    }

    private boolean isHiddenContain(int i) {
        return (this.hiddenFlag & i) == i;
    }

    public static boolean isTriggerRegionMatches(MMCVBoxes mMCVBoxes, String str, MaskModel maskModel, int i, int i2) {
        if (maskModel.getTriggerRegion() == null || maskModel.getTriggerRegion().length != 3) {
            return true;
        }
        if (mMCVBoxes.getDetectResult() == null || mMCVBoxes.getDetectResult().length == 0) {
            return false;
        }
        PointF pointF = null;
        for (MMBox mMBox : mMCVBoxes.getDetectResult()) {
            if (str.equals(mMBox.class_name_)) {
                int i3 = mMBox.f14764x_;
                int i4 = mMBox.f14765y_;
                RectF rectF = new RectF(i3, i4, i3 + mMBox.width_, i4 + mMBox.height_);
                pointF = new PointF(rectF.centerX(), rectF.centerY());
            }
        }
        if (pointF == null) {
            return false;
        }
        int[] triggerRegion = maskModel.getTriggerRegion();
        int i5 = triggerRegion[0];
        int i6 = triggerRegion[1];
        int i7 = triggerRegion[2];
        float f = i / i5;
        float f2 = i2 / i5;
        float f3 = (i7 % i5) * f;
        float f4 = (i7 / i6) * f2;
        return new RectF(f3, f4, f + f3, f2 + f4).contains(pointF.x, pointF.y);
    }

    public void adjustStateBy(pjw pjwVar) {
        if (pjwVar == null) {
            return;
        }
        if (this.faceIndex >= pjwVar.m169950n()) {
            this.faceIndex = 0;
        }
        zsf zsfVarM169946j = pjwVar.m169946j(this.faceIndex);
        if (zsfVarM169946j != null) {
            if (isContain(1) || isHiddenContain(1)) {
                updateMouseState(zsfVarM169946j.m220018l());
            }
            if (isContain(1024) || isContain(512) || isHiddenContain(1024) || isHiddenContain(512)) {
                this.smileState = 1;
                this.duckFaceState = 1;
                if (zsfVarM169946j.m220013d() == 1) {
                    this.duckFaceState = 0;
                } else if (zsfVarM169946j.m220013d() == 2) {
                    this.smileState = 0;
                }
            }
            if (isContain(8) || isContain(64) || isContain(16) || isContain(128) || isHiddenContain(8) || isHiddenContain(64) || isHiddenContain(256) || isHiddenContain(16) || isHiddenContain(128)) {
                updateEyeState(zsfVarM169946j);
            }
            if (isContain(16) || isContain(128) || isContain(256) || isHiddenContain(16) || isHiddenContain(128)) {
                int i = this.rightEyeOpenState;
                if (i == 0 && this.leftEyeOpenState == 1) {
                    int i2 = this.leftEyeBlinkCount + 1;
                    this.leftEyeBlinkCount = i2;
                    if (i2 > 1) {
                        this.leftEyeBlinkState = 0;
                    } else {
                        this.leftEyeBlinkState = 1;
                    }
                } else {
                    this.leftEyeBlinkCount = 0;
                    this.leftEyeBlinkState = 1;
                }
                if (i == 1 && this.leftEyeOpenState == 0) {
                    int i3 = this.rightEyeBlinkCount + 1;
                    this.rightEyeBlinkCount = i3;
                    if (i3 > 1) {
                        this.rightEyeBlinkState = 0;
                    } else {
                        this.rightEyeBlinkState = 1;
                    }
                } else {
                    this.rightEyeBlinkCount = 0;
                    this.rightEyeBlinkState = 1;
                }
                if (i != 1 && this.leftEyeOpenState != 1) {
                    this.eyeBlinkCount = 0;
                    this.eyeBlinkState = 1;
                    return;
                }
                int i4 = this.eyeBlinkCount + 1;
                this.eyeBlinkCount = i4;
                if (i4 > 1) {
                    this.eyeBlinkState = 0;
                } else {
                    this.eyeBlinkState = 1;
                }
            }
        }
    }

    public void disable(int i) {
        this.flag = (~i) & this.flag;
    }

    public int getTriggerStateByTriggerType(int i) {
        int i2 = this.mouseOpenState;
        if (i != 1) {
            if (i == 8) {
                return this.leftEyeOpenState;
            }
            if (i == 16) {
                return this.leftEyeBlinkState;
            }
            if (i == 64) {
                return this.rightEyeOpenState;
            }
            if (i == 128) {
                return this.rightEyeBlinkState;
            }
            if (i == 256) {
                return this.eyeBlinkState;
            }
            if (i == 512) {
                return this.smileState;
            }
            if (i == 1024) {
                return this.duckFaceState;
            }
        }
        return i2;
    }

    public boolean objectTriggerTypeProcess(Sticker sticker, FaceDetectFilter.FaceDetectParam faceDetectParam, boolean z) {
        MMCVBoxes mMCVBoxes;
        String hiddenObjectTriggerType = sticker.getHiddenObjectTriggerType();
        if (!TextUtils.isEmpty(hiddenObjectTriggerType) && (mMCVBoxes = faceDetectParam.mmcvBoxes) != null && mMCVBoxes.getDetectResult() != null) {
            for (MMBox mMBox : faceDetectParam.mmcvBoxes.getDetectResult()) {
                if (hiddenObjectTriggerType.equals(mMBox.class_name_)) {
                    return false;
                }
            }
        }
        String objectTriggerType = sticker.getObjectTriggerType();
        if (!TextUtils.isEmpty(objectTriggerType)) {
            if (objectTriggerType.equals("game_over")) {
                return z;
            }
            MMCVBoxes mMCVBoxes2 = faceDetectParam.mmcvBoxes;
            if (mMCVBoxes2 != null && mMCVBoxes2.getDetectResult() != null && faceDetectParam.mmcvBoxes.getDetectResult().length > 0) {
                for (MMBox mMBox2 : faceDetectParam.mmcvBoxes.getDetectResult()) {
                    if (objectTriggerType.equals(mMBox2.class_name_)) {
                        return true;
                    }
                }
                return false;
            }
            if (faceDetectParam.gestureRect == null) {
                return false;
            }
        }
        return true;
    }

    public void setHiddenTriggerType(int i) {
        if (this.hiddenFlag == -1) {
            this.hiddenFlag = i;
        } else {
            hiddenEnable(i);
        }
    }

    public void setTriggerFaceIndex(int i) {
        this.faceIndex = i;
    }

    public void setTriggerType(int i) {
        if (this.flag == -1) {
            this.flag = i;
        } else {
            enable(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    public boolean triggerTypeProcess(Sticker sticker, StickerBlendFilter.StickerStateChangeListener stickerStateChangeListener) {
        boolean z;
        if (sticker.getTriggerType() > 0) {
            sticker.setTriggerState(getTriggerStateByTriggerType(sticker.getTriggerType()));
            if (stickerStateChangeListener != null) {
                stickerStateChangeListener.stickerStateChanged(sticker.getTriggerType(), getTriggerStateByTriggerType(sticker.getTriggerType()));
            }
            if (sticker.getTriggerState() == 1) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        int hiddenTriggerType = sticker.getHiddenTriggerType();
        if (hiddenTriggerType <= 0) {
            return z;
        }
        sticker.setTriggerState(getTriggerStateByTriggerType(hiddenTriggerType));
        if (stickerStateChangeListener != null) {
            stickerStateChangeListener.stickerStateChanged(sticker.getTriggerType(), getTriggerStateByTriggerType(sticker.getTriggerType()));
        }
        if (hiddenTriggerType == 8 || hiddenTriggerType == 64) {
            return sticker.getTriggerState() == 0;
        }
        return sticker.getTriggerState() != 0;
    }

    public void updateEyeState(zsf zsfVar) {
        this.leftEyeOpenAmount = zsfVar.m220020n();
        float fM220026t = zsfVar.m220026t();
        this.rightEyeOpenAmount = fM220026t;
        if (this.leftEyeOpenAmount >= 0.7d) {
            this.leftEyeOpenState = 1;
        } else {
            this.leftEyeOpenState = 0;
        }
        if (fM220026t >= 0.7d) {
            this.rightEyeOpenState = 1;
        } else {
            this.rightEyeOpenState = 0;
        }
    }

    public void updateMouseState(float[] fArr) {
        if (fArr == null || fArr.length == 0) {
            return;
        }
        int i = INDEX_FACE_LEFT;
        float f = fArr[i];
        float f2 = fArr[i + 68];
        int i2 = INDEX_FACE_RIGHT;
        float f3 = fArr[i2];
        float f4 = fArr[i2 + 68];
        int i3 = INDEX_MOUSE_DOWN;
        float f5 = fArr[i3];
        float f6 = fArr[i3 + 68];
        int i4 = INDEX_MOUSE_UP;
        float f7 = fArr[i4];
        float f8 = fArr[i4 + 68];
        float fHypot = (float) Math.hypot(f - f3, f2 - f4);
        float fHypot2 = (float) Math.hypot(f7 - f5, f8 - f6);
        if (this.mouseOpenState == 0) {
            if (fHypot2 < ((double) (fHypot * 1.0f)) / 14.0d) {
                this.mouseOpenState = 1;
            }
        } else if (fHypot2 > (fHypot * 1.0f) / 10.0f) {
            this.mouseOpenState = 0;
        } else {
            this.mouseOpenState = 1;
        }
    }
}
