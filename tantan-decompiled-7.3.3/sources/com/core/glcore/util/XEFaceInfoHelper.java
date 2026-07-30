package com.core.glcore.util;

import com.momo.xeengine.XE3DEngine;
import com.momo.xeengine.p049cv.bean.XEFaceInfo;
import com.momo.xeengine.xnative.XEEventDispatcher;
import com.momocv.SingleFaceInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p153l.evf;
import p153l.nuf;
import p153l.omw;

/* JADX INFO: loaded from: classes.dex */
public class XEFaceInfoHelper {
    private static final int DUCK_FACE = 1024;
    private static final int EYE_BLINK = 256;
    private static final int FACE_STATE_CLOSE = 1;
    private static final int FACE_STATE_OPEN = 0;
    private static int INDEX_FACE_LEFT = 0;
    private static int INDEX_FACE_RIGHT = 16;
    private static int INDEX_MOUSE_DOWN = 66;
    private static int INDEX_MOUSE_UP = 62;
    private static final int LEFT_EYE_BLINK = 16;
    private static final int LEFT_EYE_CLOSING = 8;
    private static final int LEFT_EYE_OPEN = 4;
    private static final int MOUSE_STATE_CLOSE = 2;
    private static final int MOUSE_STATE_OPEN = 1;
    private static final int NOD = 2048;
    private static final int NOD_STATE_DOWN = 1001;
    private static final int NOD_STATE_POSSIBLE = 1000;
    private static final int NOD_STATE_UP = 1002;
    private static final int POINTS_LENGTH = 68;
    private static final int RIGHT_EYE_BLINK = 128;
    private static final int RIGHT_EYE_CLOSING = 64;
    private static final int RIGHT_EYE_OPEN = 32;
    private static final int SMILE = 512;
    private static int duckFaceState = 1;
    private static int leftEyeBlinkCount = 0;
    private static int leftEyeBlinkState = 1;
    private static int leftEyeOpenState = 0;
    private static int mouseOpenState = 2;
    private static int nodState = 0;
    private static int rightEyeBlinkCount = 0;
    private static int rightEyeBlinkState = 0;
    private static int rightEyeOpenState = 0;
    private static int smileState = 1;
    private static List<Float> pitchValues = new ArrayList();
    private static int nodStartPitch = 0;
    private static int nodFailedCount = 0;
    private static long nodStartTime = 0;
    private static float lastPitch = 0.0f;

    private static int adjustState(omw omwVar, int i) {
        boolean z = false;
        if (omwVar != null) {
            if (i >= omwVar.m168299n()) {
                i = 0;
            }
            nuf nufVarM168295j = omwVar.m168295j(i);
            if (nufVarM168295j != null) {
                int iUpdateMouseState = updateMouseState(nufVarM168295j.m164781l());
                smileState = 2;
                duckFaceState = 2;
                boolean z2 = true;
                if (nufVarM168295j.m164776d() == 1) {
                    duckFaceState = 1;
                    iUpdateMouseState |= 1024;
                } else if (nufVarM168295j.m164776d() == 2) {
                    smileState = 1;
                    iUpdateMouseState |= 512;
                }
                int iUpdateNodState = updateNodState(nufVarM168295j) | iUpdateMouseState | updateEyeState(nufVarM168295j);
                int i2 = rightEyeOpenState;
                if (i2 == 0 && leftEyeOpenState == 1) {
                    int i3 = leftEyeBlinkCount + 1;
                    leftEyeBlinkCount = i3;
                    if (i3 > 1) {
                        leftEyeBlinkState = 0;
                    } else {
                        leftEyeBlinkState = 1;
                    }
                } else {
                    leftEyeBlinkCount = 0;
                    leftEyeBlinkState = 1;
                }
                if (i2 == 1 && leftEyeOpenState == 0) {
                    int i4 = rightEyeBlinkCount + 1;
                    rightEyeBlinkCount = i4;
                    if (i4 > 1) {
                        rightEyeBlinkState = 0;
                    } else {
                        rightEyeBlinkState = 1;
                    }
                } else {
                    rightEyeBlinkCount = 0;
                    rightEyeBlinkState = 1;
                }
                if (leftEyeBlinkState == 0) {
                    iUpdateNodState |= 16;
                    z = true;
                }
                if (rightEyeBlinkState == 0) {
                    iUpdateNodState |= 128;
                } else {
                    z2 = z;
                }
                return z2 ? iUpdateNodState | 256 : iUpdateNodState;
            }
        }
        return 0;
    }

    public static void setFaceInfo(omw omwVar) {
        XE3DEngine xE3DEngine;
        XEEventDispatcher eventDispatcher;
        float[] fArrM122798b;
        if (omwVar == null || (xE3DEngine = XEEngineHelper.get()) == null || !xE3DEngine.isRunning() || (eventDispatcher = xE3DEngine.getEventDispatcher()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        evf evfVarM168302q = omwVar.m168302q();
        FacerigHelper.getUseAnimojiFaceRig();
        if (evfVarM168302q == null || (fArrM122798b = evfVarM168302q.m122798b()) == null || fArrM122798b.length <= 0) {
            int iM168299n = omwVar.m168299n();
            if (iM168299n <= 0) {
                if (xE3DEngine.isRunning()) {
                    eventDispatcher.dispatchFaceInfo(null);
                    return;
                }
                return;
            }
            for (int i = 0; i < iM168299n; i++) {
                nuf nufVarM168295j = omwVar.m168295j(i);
                SingleFaceInfo singleFaceInfo = omwVar.m168304s().facesinfo_[i];
                if (nufVarM168295j != null) {
                    XEFaceInfo xEFaceInfo = new XEFaceInfo();
                    xEFaceInfo.expression = adjustState(omwVar, i);
                    xEFaceInfo.landmarks68 = nufVarM168295j.m164769A() == null ? nufVarM168295j.m164781l() : nufVarM168295j.m164769A();
                    xEFaceInfo.landmarks96 = nufVarM168295j.m164770B() == null ? nufVarM168295j.m164782m() : nufVarM168295j.m164770B();
                    xEFaceInfo.landmarks137 = singleFaceInfo.landmarks_137_;
                    xEFaceInfo.trackId = nufVarM168295j.m164793x();
                    float[] fArrM164775c = nufVarM168295j.m164775c();
                    if (fArrM164775c != null && fArrM164775c.length >= 3) {
                        xEFaceInfo.pitch = fArrM164775c[0];
                        xEFaceInfo.yaw = fArrM164775c[1];
                        xEFaceInfo.roll = fArrM164775c[2];
                    }
                    xEFaceInfo.faceBounds = new float[]{nufVarM168295j.m164777e()[0], nufVarM168295j.m164777e()[1], nufVarM168295j.m164777e()[2] - nufVarM168295j.m164777e()[0], nufVarM168295j.m164777e()[3] - nufVarM168295j.m164777e()[1]};
                    xEFaceInfo.cameraMatrix = nufVarM168295j.m164774b();
                    xEFaceInfo.rotationMatrix = nufVarM168295j.m164790u();
                    xEFaceInfo.rotationVector = nufVarM168295j.m164791v();
                    xEFaceInfo.translationVector = nufVarM168295j.m164794y();
                    xEFaceInfo.projectionMatrix = nufVarM168295j.m164788s();
                    xEFaceInfo.modelViewMatrix = nufVarM168295j.m164784o();
                    if (omwVar.m168302q() != null) {
                        xEFaceInfo.facerigStates = omwVar.m168302q().m122798b();
                    }
                    float[][] fArrM168303r = omwVar.m168303r();
                    float[][] fArrM168294f = omwVar.m168294f();
                    if (fArrM168303r != null && fArrM168303r.length > i && fArrM168294f != null && fArrM168294f.length > i) {
                        xEFaceInfo.src_warp_points = omwVar.m168303r()[i];
                        xEFaceInfo.dst_warp_points = omwVar.m168294f()[i];
                    }
                    xEFaceInfo.meType = xEFaceInfo.facerigStates == null ? 0 : 1;
                    arrayList.add(xEFaceInfo);
                }
            }
            eventDispatcher.dispatchFaceInfo(arrayList);
            return;
        }
        SingleFaceInfo[] singleFaceInfoArr = omwVar.f148023j.f96001b.facesinfo_;
        if (singleFaceInfoArr != null && singleFaceInfoArr.length > 0) {
            for (int i2 = 0; i2 < singleFaceInfoArr.length; i2++) {
                XEFaceInfo xEFaceInfo2 = new XEFaceInfo();
                SingleFaceInfo singleFaceInfo2 = singleFaceInfoArr[i2];
                xEFaceInfo2.trackId = singleFaceInfo2.tracking_id_;
                float[] fArr = singleFaceInfo2.euler_angles_;
                if (fArr != null && fArr.length >= 3) {
                    xEFaceInfo2.pitch = fArr[0];
                    xEFaceInfo2.yaw = fArr[1];
                    xEFaceInfo2.roll = fArr[2];
                }
                xEFaceInfo2.expression = adjustState(omwVar, 0);
                SingleFaceInfo singleFaceInfo3 = singleFaceInfoArr[i2];
                xEFaceInfo2.landmarks68 = singleFaceInfo3.landmarks_68_;
                xEFaceInfo2.faceBounds = singleFaceInfo3.face_rect_;
                xEFaceInfo2.cameraMatrix = singleFaceInfo3.camera_matrix_;
                xEFaceInfo2.rotationMatrix = singleFaceInfo3.rotation_matrix_;
                xEFaceInfo2.rotationVector = singleFaceInfo3.rotation_vector_;
                xEFaceInfo2.translationVector = singleFaceInfo3.translation_vector_;
                xEFaceInfo2.projectionMatrix = singleFaceInfo3.projection_matrix_;
                xEFaceInfo2.modelViewMatrix = singleFaceInfo3.modelview_matrix_;
                xEFaceInfo2.landmarks96 = singleFaceInfo3.landmarks_96_;
                float[] fArr2 = evfVarM168302q.f96000a.facerigV3_eulers_;
                if (fArr2 != null) {
                    xEFaceInfo2.facerigStates = fArr2;
                    float[] fArr3 = new float[54];
                    System.arraycopy(fArr2, 0, fArr3, 0, 3);
                    System.arraycopy(evfVarM168302q.f96000a.facerigV3_scores_, 0, fArr3, 3, 51);
                    xEFaceInfo2.facerigStates = fArr3;
                }
                xEFaceInfo2.meType = 1;
                float[][] fArrM168303r2 = omwVar.m168303r();
                float[][] fArrM168294f2 = omwVar.m168294f();
                if (fArrM168303r2 != null && fArrM168303r2.length > i2 && fArrM168294f2 != null && fArrM168294f2.length > i2) {
                    xEFaceInfo2.src_warp_points = fArrM168303r2[i2];
                    xEFaceInfo2.dst_warp_points = omwVar.m168294f()[i2];
                }
                arrayList.add(xEFaceInfo2);
            }
        }
        eventDispatcher.dispatchFaceInfo(arrayList);
    }

    private static int updateEyeState(nuf nufVar) {
        float fM164783n = nufVar.m164783n();
        float fM164789t = nufVar.m164789t();
        if (fM164783n >= 0.7d) {
            leftEyeOpenState = 1;
        } else {
            leftEyeOpenState = 0;
        }
        if (fM164789t >= 0.7d) {
            rightEyeOpenState = 1;
        } else {
            rightEyeOpenState = 0;
        }
        int i = leftEyeOpenState == 0 ? 4 : 8;
        return rightEyeOpenState == 0 ? i | 32 : i | 64;
    }

    private static int updateMouseState(float[] fArr) {
        if (fArr == null) {
            return 2;
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
        return ((float) Math.hypot((double) (fArr[i4] - f5), (double) (fArr[i4 + 68] - f6))) > (((float) Math.hypot((double) (f - f3), (double) (f2 - f4))) * 1.0f) / 10.0f ? 1 : 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int updateNodState(nuf nufVar) {
        float[] fArrM164775c = nufVar.m164775c();
        if (fArrM164775c != null && fArrM164775c.length >= 3) {
            float f = nufVar.m164775c()[0];
            float f2 = nufVar.m164775c()[1];
            float f3 = nufVar.m164775c()[2];
            if ((f2 > 10.0f && f2 - f > 1.0f) || (f2 < -10.0f && f2 - f < 1.0f)) {
                nodState = 1000;
                return 0;
            }
            if ((f3 > 10.0f && f3 - f > 1.0f) || (f3 < -10.0f && f3 - f < 1.0f)) {
                nodState = 1000;
                return 0;
            }
            if (pitchValues.size() > 4) {
                pitchValues.remove(0);
            }
            pitchValues.add(Float.valueOf(f));
            ArrayList arrayList = new ArrayList(pitchValues);
            Collections.sort(arrayList);
            float fFloatValue = ((Float) arrayList.get(pitchValues.size() >> 1)).floatValue();
            switch (nodState) {
                case 1000:
                    if (fFloatValue - lastPitch >= 2.0f) {
                        nodStartTime = System.currentTimeMillis();
                        nodState = 1001;
                    }
                    lastPitch = fFloatValue;
                    break;
                case 1001:
                    if (fFloatValue - lastPitch >= 1.0f) {
                        nodFailedCount = 0;
                    } else if (fFloatValue > nodStartPitch + 3) {
                        nodState = 1002;
                        nodStartPitch = 0;
                    } else {
                        int i = nodFailedCount + 1;
                        nodFailedCount = i;
                        if (i > 1) {
                            nodState = 1000;
                        }
                    }
                    lastPitch = fFloatValue;
                    break;
                case 1002:
                    if (fFloatValue - lastPitch <= 1.0f) {
                        nodFailedCount = 0;
                        if (fFloatValue - nodStartPitch > 0.0f) {
                            if (System.currentTimeMillis() - nodStartTime < 2000) {
                                nodState = 1000;
                                return 2048;
                            }
                            nodState = 1000;
                        }
                    } else {
                        int i2 = nodFailedCount + 1;
                        nodFailedCount = i2;
                        if (i2 > 1) {
                            nodState = 1000;
                        }
                    }
                    lastPitch = fFloatValue;
                    break;
                default:
                    lastPitch = fFloatValue;
                    break;
            }
        }
        return 0;
    }
}
