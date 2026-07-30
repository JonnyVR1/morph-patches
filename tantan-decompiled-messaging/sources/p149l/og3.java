package p149l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class og3 {
    /* JADX INFO: renamed from: a */
    public static FloatBuffer m164159a(FloatBuffer floatBuffer, float[] fArr) {
        if (floatBuffer == null) {
            floatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        floatBuffer.clear();
        floatBuffer.put(fArr).position(0);
        return floatBuffer;
    }
}
