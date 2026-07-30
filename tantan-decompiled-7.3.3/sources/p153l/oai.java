package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class oai extends yel0 {

    /* JADX INFO: renamed from: e */
    public static int f145734e = 12;

    /* JADX INFO: renamed from: b */
    public String f145735b;

    /* JADX INFO: renamed from: c */
    public String f145736c;

    /* JADX INFO: renamed from: d */
    public String f145737d;

    public oai(String str, String str2) {
        this.f145736c = str;
        this.f145737d = str2;
    }

    @Override // p153l.yel0
    /* JADX INFO: renamed from: d */
    public C22421c<pf60<List<Moment>, List<Live>>> mo157784d() {
        return FeedModule.f39703d.m145672bd(this.f145735b, f145734e, this.f145736c, this.f145737d).map(new qcj() { // from class: l.nai
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f141015a.m166847g((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ pf60 m166847g(Envelope envelope) {
        String strM215418c = yel0.m215418c(envelope);
        this.f145735b = strM215418c;
        if (TextUtils.isEmpty(strM215418c)) {
            m215420e(true);
        } else {
            m215420e(false);
        }
        return jyb.m147494Y(yel0.m215417a(envelope), null);
    }
}
