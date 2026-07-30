package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Media;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class bpd implements cxx<Media> {

    /* JADX INFO: renamed from: a */
    public final List<Media> f76619a;

    public bpd(List<String> list) {
        this.f76619a = vwb.m200303Q(list, new zod());
    }

    @Override // p149l.cxx
    /* JADX INFO: renamed from: a */
    public int mo103052a(final String str) {
        return vwb.m200293G(this.f76619a, new w9j() { // from class: l.apd
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Media) obj).url, str));
            }
        });
    }

    @Override // p149l.cxx
    public List<Media> source() {
        return this.f76619a;
    }
}
