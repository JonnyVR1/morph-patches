package p153l;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.UploadSource;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlMlnMedia;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class wd00 extends xi5 {
    public static final String CLOUD_API_TAG = "cloud_tag";

    /* JADX INFO: renamed from: A */
    public static C22421c<List<BLiveIntlMlnMedia>> m205832A(Media media, final String str, Map<String, String> map, final String str2, final UploadSource uploadSource) {
        final ku10.C18260a c18260aM151432f = new ku10.C18260a().m151432f(ku10.f128786j);
        if (NullChecker.m82486a(map) && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c18260aM151432f.m151427a(entry.getKey(), entry.getValue());
            }
        }
        if (!TEnum.equals(media.status, MediaLocalStatus.preprocessed)) {
            return C22421c.just(new ArrayList());
        }
        m205836z(c18260aM151432f, media.mediaType, oki.m168038z(media.url), "image");
        x1d0.C21228a c21228aAuth = uqb0.f180376H.auth();
        if (uqb0.f180397c0.mo105284D5()) {
            c21228aAuth = uqb0.f180376H.authBeforeSignUp();
        } else if (!uqb0.f180397c0.signedIn_()) {
            c21228aAuth = uqb0.f180376H.basic();
        }
        final x1d0.C21228a c21228a = c21228aAuth;
        return e9t.m119951a(new pcj() { // from class: l.ud00
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return wd00.m205835y(c18260aM151432f, str, uploadSource, c21228a, str2);
            }
        }).map(new qcj() { // from class: l.vd00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.media;
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static C22421c<List<BLiveIntlMlnMedia>> m205833B(Media media, UploadSource uploadSource, String str) {
        return m205832A(media, SchemeKey.mln, null, str, uploadSource);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ x1d0 m205835y(ku10.C18260a c18260a, String str, UploadSource uploadSource, x1d0.C21228a c21228a, String str2) {
        z1d0 z1d0VarM151431e = c18260a.m151431e();
        d3d0 d3d0Var = new d3d0(str, CLOUD_API_TAG);
        d3d0Var.f84889c = "image";
        if (uploadSource != null) {
            c21228a.m209027a("X-Putong-Cloud-Module", uploadSource.toString());
        }
        return c21228a.m209042p(d3d0Var).m209043q(str2).m209038l(z1d0VarM151431e).m209028b();
    }

    /* JADX INFO: renamed from: z */
    public static void m205836z(ku10.C18260a c18260a, String str, String str2, String str3) {
        c18260a.m151429c(e0l.m118872j(HttpHeaders.CONTENT_DISPOSITION, "form-data; name=\"" + str3 + "\"; filename=\"filename.cache\"", "Content-Transfer-Encoding", "binary"), z1d0.create(e7y.m119773d(str), new File(str2)));
    }
}
