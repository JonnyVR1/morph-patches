package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class x9i extends u5l0 {

    /* JADX INFO: renamed from: c */
    public static int f191626c = 12;

    /* JADX INFO: renamed from: b */
    public String f191627b;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ j760 m207499g(Envelope envelope) {
        String strM191868c = u5l0.m191868c(envelope);
        this.f191627b = strM191868c;
        if (TextUtils.isEmpty(strM191868c)) {
            m191870e(true);
        } else {
            m191870e(false);
        }
        return vwb.m200311Y(u5l0.m191867a(envelope), null);
    }

    @Override // p149l.u5l0
    /* JADX INFO: renamed from: d */
    public C22306c<j760<List<Moment>, List<Live>>> mo175962d() {
        return FeedModule.f38855d.m209424ad(this.f191627b, f191626c).map(new w9j() { // from class: l.w9i
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f185358a.m207499g((Envelope) obj);
            }
        });
    }
}
