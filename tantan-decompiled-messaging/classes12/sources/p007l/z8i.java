package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Live;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import java.util.List;
import l.j760;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class z8i extends u5l0 {

    /* JADX INFO: renamed from: e */
    public static int f15657e = 12;

    /* JADX INFO: renamed from: b */
    public String f15658b;

    /* JADX INFO: renamed from: c */
    public String f15659c;

    /* JADX INFO: renamed from: d */
    public String f15660d;

    public z8i(String str, String str2) {
        this.f15659c = str;
        this.f15660d = str2;
    }

    @Override // p007l.u5l0
    /* JADX INFO: renamed from: d */
    public c<j760<List<Moment>, List<Live>>> mo13696d() {
        return FeedModule.f316d.m16612bd(this.f15658b, f15657e, this.f15659c, this.f15660d).map(new w9j() { // from class: l.y8i
            public final Object call(Object obj) {
                return this.f15300a.m17275g((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ j760 m17275g(Envelope envelope) {
        String strM14770c = u5l0.m14770c(envelope);
        this.f15658b = strM14770c;
        if (TextUtils.isEmpty(strM14770c)) {
            m14772e(true);
        } else {
            m14772e(false);
        }
        return vwb.Y(u5l0.m14769a(envelope), (Object) null);
    }
}
