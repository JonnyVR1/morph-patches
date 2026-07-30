package p003l;

import android.text.TextUtils;
import com.p1.mobile.putong.data.Media;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class bpd implements cxx<Media> {

    /* JADX INFO: renamed from: a */
    public final List<Media> f2421a;

    public bpd(List<String> list) {
        this.f2421a = vwb.Q(list, new zod());
    }

    @Override // p003l.cxx
    /* JADX INFO: renamed from: a */
    public int mo2976a(final String str) {
        return vwb.G(this.f2421a, new w9j() { // from class: l.apd
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Media) obj).url, str));
            }
        });
    }

    @Override // p003l.cxx
    public List<Media> source() {
        return this.f2421a;
    }
}
