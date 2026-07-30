package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class z8i extends u5l0 {

    /* JADX INFO: renamed from: e */
    public static int f202167e = 12;

    /* JADX INFO: renamed from: b */
    public String f202168b;

    /* JADX INFO: renamed from: c */
    public String f202169c;

    /* JADX INFO: renamed from: d */
    public String f202170d;

    public z8i(String str, String str2) {
        this.f202169c = str;
        this.f202170d = str2;
    }

    @Override // p149l.u5l0
    /* JADX INFO: renamed from: d */
    public C22306c<j760<List<Moment>, List<Live>>> mo175962d() {
        return FeedModule.f38855d.m209431bd(this.f202168b, f202167e, this.f202169c, this.f202170d).map(new w9j() { // from class: l.y8i
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f196832a.m217601g((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ j760 m217601g(Envelope envelope) {
        String strM191868c = u5l0.m191868c(envelope);
        this.f202168b = strM191868c;
        if (TextUtils.isEmpty(strM191868c)) {
            m191870e(true);
        } else {
            m191870e(false);
        }
        return vwb.m200311Y(u5l0.m191867a(envelope), null);
    }
}
