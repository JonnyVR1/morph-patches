package p153l;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class j94 {

    /* JADX INFO: renamed from: l.j94$a */
    public class C17898a implements Comparator<Range<Integer>> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f118845a;

        public C17898a(int i) {
            this.f118845a = i;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Range<Integer> range, Range<Integer> range2) {
            int iAbs = Math.abs(((Integer) range.getLower()).intValue() - this.f118845a) + Math.abs(((Integer) range.getUpper()).intValue() - this.f118845a);
            int iAbs2 = Math.abs(((Integer) range2.getLower()).intValue() - this.f118845a) + Math.abs(((Integer) range2.getUpper()).intValue() - this.f118845a);
            if (iAbs > iAbs2) {
                return 1;
            }
            return iAbs < iAbs2 ? -1 : 0;
        }
    }

    /* JADX INFO: renamed from: l.j94$b */
    public class C17899b implements Comparator<Size> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Size size, Size size2) {
            return size.getWidth() * size.getHeight() > size2.getWidth() * size2.getHeight() ? 1 : -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0061 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    private static Size m143928a(List<Size> list, Size size, int i, float f) {
        Collections.sort(list, new C17899b());
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
        lyv.m156390d("Camera2 Size: " + size3.getWidth() + ", " + size3.getHeight());
        return size3;
    }

    /* JADX INFO: renamed from: b */
    public static int m143929b() {
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static void m143930c(CameraCharacteristics cameraCharacteristics, sow sowVar) {
        List<Range> listAsList = Arrays.asList((Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
        int i = sowVar.f169979s;
        if (sowVar.f169950X.size() > 0) {
            sowVar.f169950X.clear();
        }
        Collections.sort(listAsList, new C17898a(i));
        sowVar.f169934H = ((Integer) ((Range) listAsList.get(0)).getLower()).intValue();
        sowVar.f169933G = ((Integer) ((Range) listAsList.get(0)).getUpper()).intValue();
        for (Range range : listAsList) {
            sowVar.f169950X.add(new int[]{((Integer) range.getLower()).intValue() * 1000, ((Integer) range.getUpper()).intValue() * 1000});
        }
        lyv.m156388b("Camera2 select fps Range: " + sowVar.f169934H + "-" + sowVar.f169933G);
    }

    /* JADX INFO: renamed from: d */
    public static Size m143931d(CameraCharacteristics cameraCharacteristics, sow sowVar, Size size) {
        Size[] outputSizes = ((StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        return m143928a(Arrays.asList(outputSizes), size, sowVar.f169937K, sowVar.f169938L);
    }
}
