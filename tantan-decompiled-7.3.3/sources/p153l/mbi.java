package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class mbi extends yel0 {

    /* JADX INFO: renamed from: c */
    public static int f135723c = 12;

    /* JADX INFO: renamed from: b */
    public String f135724b;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ pf60 m157783g(Envelope envelope) {
        String strM215418c = yel0.m215418c(envelope);
        this.f135724b = strM215418c;
        if (TextUtils.isEmpty(strM215418c)) {
            m215420e(true);
        } else {
            m215420e(false);
        }
        return jyb.m147494Y(yel0.m215417a(envelope), null);
    }

    @Override // p153l.yel0
    /* JADX INFO: renamed from: d */
    public C22421c<pf60<List<Moment>, List<Live>>> mo157784d() {
        return FeedModule.f39703d.m145665ad(this.f135724b, f135723c).map(new qcj() { // from class: l.lbi
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f131208a.m157783g((Envelope) obj);
            }
        });
    }
}
