package p153l;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class rxr0 {

    /* JADX INFO: renamed from: a */
    public final Map f165372a;

    /* JADX INFO: renamed from: b */
    public final Map f165373b;

    /* JADX INFO: renamed from: c */
    public final ObjectEncoder f165374c;

    public rxr0(Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f165372a = map;
        this.f165373b = map2;
        this.f165374c = objectEncoder;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public final byte[] m183565a(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ttr0(byteArrayOutputStream, this.f165372a, this.f165373b, this.f165374c).m192689f(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
