package p149l;

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
public class k84 {

    /* JADX INFO: renamed from: l.k84$a */
    public class C17951a implements Comparator<Range<Integer>> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f121716a;

        public C17951a(int i) {
            this.f121716a = i;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Range<Integer> range, Range<Integer> range2) {
            int iAbs = Math.abs(((Integer) range.getLower()).intValue() - this.f121716a) + Math.abs(((Integer) range.getUpper()).intValue() - this.f121716a);
            int iAbs2 = Math.abs(((Integer) range2.getLower()).intValue() - this.f121716a) + Math.abs(((Integer) range2.getUpper()).intValue() - this.f121716a);
            if (iAbs > iAbs2) {
                return 1;
            }
            return iAbs < iAbs2 ? -1 : 0;
        }
    }

    /* JADX INFO: renamed from: l.k84$b */
    public class C17952b implements Comparator<Size> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Size size, Size size2) {
            return size.getWidth() * size.getHeight() > size2.getWidth() * size2.getHeight() ? 1 : -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0061 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    private static Size m144834a(List<Size> list, Size size, int i, float f) {
        Collections.sort(list, new C17952b());
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
        kwv.m147654d("Camera2 Size: " + size3.getWidth() + ", " + size3.getHeight());
        return size3;
    }

    /* JADX INFO: renamed from: b */
    public static int m144835b() {
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static void m144836c(CameraCharacteristics cameraCharacteristics, tlw tlwVar) {
        List<Range> listAsList = Arrays.asList((Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
        int i = tlwVar.f171109s;
        if (tlwVar.f171080X.size() > 0) {
            tlwVar.f171080X.clear();
        }
        Collections.sort(listAsList, new C17951a(i));
        tlwVar.f171064H = ((Integer) ((Range) listAsList.get(0)).getLower()).intValue();
        tlwVar.f171063G = ((Integer) ((Range) listAsList.get(0)).getUpper()).intValue();
        for (Range range : listAsList) {
            tlwVar.f171080X.add(new int[]{((Integer) range.getLower()).intValue() * 1000, ((Integer) range.getUpper()).intValue() * 1000});
        }
        kwv.m147652b("Camera2 select fps Range: " + tlwVar.f171064H + "-" + tlwVar.f171063G);
    }

    /* JADX INFO: renamed from: d */
    public static Size m144837d(CameraCharacteristics cameraCharacteristics, tlw tlwVar, Size size) {
        Size[] outputSizes = ((StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        return m144834a(Arrays.asList(outputSizes), size, tlwVar.f171067K, tlwVar.f171068L);
    }
}
