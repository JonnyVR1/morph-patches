package p149l;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class lor0 {

    /* JADX INFO: renamed from: a */
    public final Map f129134a;

    /* JADX INFO: renamed from: b */
    public final Map f129135b;

    /* JADX INFO: renamed from: c */
    public final ObjectEncoder f129136c;

    public lor0(Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f129134a = map;
        this.f129135b = map2;
        this.f129136c = objectEncoder;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public final byte[] m150812a(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new nkr0(byteArrayOutputStream, this.f129134a, this.f129135b, this.f129136c).m160001f(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
