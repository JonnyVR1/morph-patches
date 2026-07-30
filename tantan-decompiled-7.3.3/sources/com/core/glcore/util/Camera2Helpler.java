package com.core.glcore.util;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p153l.tow;

/* JADX INFO: loaded from: classes.dex */
public class Camera2Helpler {
    /* JADX WARN: Code duplicated, block: B:36:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0061 A[SYNTHETIC] */
    private static Size chooseOptimalSize(List<Size> list, Size size, int i, float f) {
        Collections.sort(list, new Comparator<Size>() { // from class: com.core.glcore.util.Camera2Helpler.2
            @Override // java.util.Comparator
            public int compare(Size size2, Size size3) {
                return size2.getWidth() * size2.getHeight() > size3.getWidth() * size3.getHeight() ? 1 : -1;
            }
        });
        int width = size.getWidth() * size.getHeight();
        int width2 = 0;
        int height = 0;
        for (Size size2 : list) {
            int width3 = (size2.getWidth() * size2.getHeight()) - (size.getWidth() * size.getHeight());
            if (i == 0) {
                if (size2.getWidth() / f > size2.getHeight()) {
                    continue;
                } else if (Math.abs(width3) < width) {
                    if (size2.getWidth() > size.getWidth() || size2.getHeight() <= size.getHeight()) {
                        width = Math.abs(width3);
                        width2 = size2.getWidth();
                        height = size2.getHeight();
                        if (height == size.getHeight() && width2 == size.getWidth()) {
                            break;
                        }
                    }
                } else if (Math.abs(width3) != width && width2 < size2.getWidth()) {
                    width2 = size2.getWidth();
                    height = size2.getHeight();
                }
            } else if (i != 1 || size2.getHeight() * f <= size2.getWidth()) {
                if (Math.abs(width3) < width) {
                    if (size2.getWidth() > size.getWidth()) {
                    }
                    width = Math.abs(width3);
                    width2 = size2.getWidth();
                    height = size2.getHeight();
                    if (height == size.getHeight()) {
                        continue;
                    }
                } else if (Math.abs(width3) != width) {
                }
            }
        }
        Size size3 = new Size(width2, height);
        Log4Cam.m7379i("Camera2 Size: " + size3.getWidth() + ", " + size3.getHeight());
        return size3;
    }

    public static int getCameraCnt() {
        return 0;
    }

    public static void selectCameraFpsRange(CameraCharacteristics cameraCharacteristics, tow towVar) {
        List<Range> listAsList = Arrays.asList((Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
        final int i = towVar.f175449F;
        if (towVar.f175491k0.size() > 0) {
            towVar.f175491k0.clear();
        }
        Collections.sort(listAsList, new Comparator<Range<Integer>>() { // from class: com.core.glcore.util.Camera2Helpler.1
            @Override // java.util.Comparator
            public int compare(Range<Integer> range, Range<Integer> range2) {
                int iAbs = Math.abs(((Integer) range.getLower()).intValue() - i) + Math.abs(((Integer) range.getUpper()).intValue() - i);
                int iAbs2 = Math.abs(((Integer) range2.getLower()).intValue() - i) + Math.abs(((Integer) range2.getUpper()).intValue() - i);
                if (iAbs > iAbs2) {
                    return 1;
                }
                return iAbs < iAbs2 ? -1 : 0;
            }
        });
        towVar.f175464U = ((Integer) ((Range) listAsList.get(0)).getLower()).intValue();
        towVar.f175463T = ((Integer) ((Range) listAsList.get(0)).getUpper()).intValue();
        for (Range range : listAsList) {
            towVar.f175491k0.add(new int[]{((Integer) range.getLower()).intValue() * 1000, ((Integer) range.getUpper()).intValue() * 1000});
        }
        Log4Cam.m7376e("Camera2 select fps Range: " + towVar.f175464U + "-" + towVar.f175463T);
    }

    public static Size selectCameraPreviewWH(CameraCharacteristics cameraCharacteristics, tow towVar, Size size) {
        Size[] outputSizes = ((StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        return chooseOptimalSize(Arrays.asList(outputSizes), size, towVar.f175467X, towVar.f175468Y);
    }
}
