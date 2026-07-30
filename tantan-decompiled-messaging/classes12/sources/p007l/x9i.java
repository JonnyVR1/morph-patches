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
public class x9i extends u5l0 {

    /* JADX INFO: renamed from: c */
    public static int f14816c = 12;

    /* JADX INFO: renamed from: b */
    public String f14817b;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ j760 m16061g(Envelope envelope) {
        String strM14770c = u5l0.m14770c(envelope);
        this.f14817b = strM14770c;
        if (TextUtils.isEmpty(strM14770c)) {
            m14772e(true);
        } else {
            m14772e(false);
        }
        return vwb.Y(u5l0.m14769a(envelope), (Object) null);
    }

    @Override // p007l.u5l0
    /* JADX INFO: renamed from: d */
    public c<j760<List<Moment>, List<Live>>> mo13696d() {
        return FeedModule.f316d.m16605ad(this.f14817b, f14816c).map(new w9j() { // from class: l.w9i
            public final Object call(Object obj) {
                return this.f14484a.m16061g((Envelope) obj);
            }
        });
    }
}
