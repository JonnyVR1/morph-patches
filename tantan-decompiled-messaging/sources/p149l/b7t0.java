package p149l;

import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.MovieHeaderBox;

/* JADX INFO: loaded from: classes6.dex */
public final class b7t0 extends vor0 {

    /* JADX INFO: renamed from: c */
    public static final b7t0 f74017c = new b7t0();

    @Override // p149l.vor0
    /* JADX INFO: renamed from: b */
    public final zor0 mo100699b(String str, byte[] bArr, String str2) {
        if (MovieBox.TYPE.equals(str)) {
            return new bpr0();
        }
        return MovieHeaderBox.TYPE.equals(str) ? new cpr0() : new dpr0(str);
    }
}
