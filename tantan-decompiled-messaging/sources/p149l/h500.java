package p149l;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.UploadSource;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlMlnMedia;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class h500 extends xh5 {
    public static final String CLOUD_API_TAG = "cloud_tag";

    /* JADX INFO: renamed from: A */
    public static C22306c<List<BLiveIntlMlnMedia>> m129347A(Media media, final String str, Map<String, String> map, final String str2, final UploadSource uploadSource) {
        final cm10.C16191a c16191aM107600f = new cm10.C16191a().m107600f(cm10.f81492j);
        if (NullChecker.m81303a(map) && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c16191aM107600f.m107595a(entry.getKey(), entry.getValue());
            }
        }
        if (!TEnum.equals(media.status, MediaLocalStatus.preprocessed)) {
            return C22306c.just(new ArrayList());
        }
        m129351z(c16191aM107600f, media.mediaType, rhi.m179382z(media.url), "image");
        stc0.C20027a c20027aAuth = qib0.f154693H.auth();
        if (qib0.f154714c0.mo97495D5()) {
            c20027aAuth = qib0.f154693H.authBeforeSignUp();
        } else if (!qib0.f154714c0.signedIn_()) {
            c20027aAuth = qib0.f154693H.basic();
        }
        final stc0.C20027a c20027a = c20027aAuth;
        return d7t.m110247a(new v9j() { // from class: l.f500
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return h500.m129350y(c16191aM107600f, str, uploadSource, c20027a, str2);
            }
        }).map(new w9j() { // from class: l.g500
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.media;
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static C22306c<List<BLiveIntlMlnMedia>> m129348B(Media media, UploadSource uploadSource, String str) {
        return m129347A(media, SchemeKey.mln, null, str, uploadSource);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ stc0 m129350y(cm10.C16191a c16191a, String str, UploadSource uploadSource, stc0.C20027a c20027a, String str2) {
        utc0 utc0VarM107599e = c16191a.m107599e();
        avc0 avc0Var = new avc0(str, CLOUD_API_TAG);
        avc0Var.f71931c = "image";
        if (uploadSource != null) {
            c20027a.m185882a("X-Putong-Cloud-Module", uploadSource.toString());
        }
        return c20027a.m185897p(avc0Var).m185898q(str2).m185893l(utc0VarM107599e).m185883b();
    }

    /* JADX INFO: renamed from: z */
    public static void m129351z(cm10.C16191a c16191a, String str, String str2, String str3) {
        c16191a.m107597c(oxk.m166553j(HttpHeaders.CONTENT_DISPOSITION, "form-data; name=\"" + str3 + "\"; filename=\"filename.cache\"", "Content-Transfer-Encoding", "binary"), utc0.create(hyx.m133628d(str), new File(str2)));
    }
}
