package p153l;

import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.MovieHeaderBox;

/* JADX INFO: loaded from: classes6.dex */
public final class hgt0 extends byr0 {

    /* JADX INFO: renamed from: c */
    public static final hgt0 f109440c = new hgt0();

    @Override // p153l.byr0
    /* JADX INFO: renamed from: b */
    public final fyr0 mo107033b(String str, byte[] bArr, String str2) {
        if (MovieBox.TYPE.equals(str)) {
            return new hyr0();
        }
        return MovieHeaderBox.TYPE.equals(str) ? new iyr0() : new jyr0(str);
    }
}
