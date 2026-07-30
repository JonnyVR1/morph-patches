package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.CustomEnvelope;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import java.io.File;
import java.util.Collections;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class smh0 {

    /* JADX INFO: renamed from: a */
    public static final String f165345a = mu5.f135739g + "/v2/live-private-cloud/upload";

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Media m184952c(List list) {
        return (Media) list.get(0);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ String m184960k(f30 f30Var, Media media, CustomEnvelope customEnvelope) {
        String str = customEnvelope.data.media.get(0).url;
        if (f30Var != null) {
            f30Var.call(media.url, str);
        }
        return str;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m184961l(z3g0 z3g0Var, String str, DownloadTask downloadTask, File file) {
        if (file == null) {
            z3g0Var.onCompleted();
        } else {
            z3g0Var.m132487l(str);
            z3g0Var.onCompleted();
        }
    }

    /* JADX INFO: renamed from: q */
    public static C22306c<CustomEnvelope> m184963q(String str) {
        File file = new File(str);
        final cm10.C16191a c16191aM107596b = new cm10.C16191a().m107600f(cm10.f81492j).m107596b("file", file.getName(), utc0.create(hyx.m133628d("multipart/form-data"), file));
        return ia20.m135122f(new v9j() { // from class: l.hmh0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(smh0.f165345a).m185893l(c16191aM107596b.m107599e()).m185883b();
            }
        }, CustomEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: n */
    public C22306c<String> m184964n(final String str, final String str2) {
        return C22306c.create(new C22306c.a() { // from class: l.pmh0
            @Override // p149l.e30
            public final void call(Object obj) {
                String str3 = str;
                String str4 = str2;
                z3g0 z3g0Var = (z3g0) obj;
                C13111a.m79654u().m79665o(new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(str3).m79640o(str4).m79635j(new f30() { // from class: l.qmh0
                    @Override // p149l.f30
                    public final void call(Object obj2, Object obj3) {
                        smh0.m184961l(z3g0Var, str4, (DownloadTask) obj2, (File) obj3);
                    }
                }).m79629d(new e30() { // from class: l.rmh0
                    @Override // p149l.e30
                    public final void call(Object obj2) {
                        z3g0Var.onCompleted();
                    }
                }).m79638m(Collections.singletonMap("Authorization", ipq.m137568d(str3, ""))).m79631f(new f30() { // from class: l.gmh0
                    @Override // p149l.f30
                    public final void call(Object obj2, Object obj3) {
                        z3g0Var.onError((Throwable) obj3);
                    }
                }).m79626a());
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public C22306c<String> m184965o(String str) {
        if (TextUtils.isEmpty(str)) {
            return C22306c.error(new RuntimeException("cannot upload empty file path!"));
        }
        Picture picture = new Picture();
        picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        picture.url = rhi.m179355B(str);
        picture.mediaType = "image/*";
        return new lsx(vwb.m200324f0(picture), false).flatMap(new w9j() { // from class: l.nmh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ya5.m213793I((List) obj, "camera");
            }
        }).map(new w9j() { // from class: l.omh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Media) ((List) obj).get(0)).url;
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: p */
    public C22306c<String> m184966p(String str) {
        if (TextUtils.isEmpty(str)) {
            return C22306c.error(new RuntimeException("cannot upload empty file path!"));
        }
        Video video = new Video();
        video.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
        video.url = rhi.m179355B(str);
        video.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        video.size = new Dimension(new s5l0(new r5l0(rhi.m179382z(video.url)), false, true).m182365n());
        return new lsx(vwb.m200324f0(video), false).flatMap(new w9j() { // from class: l.fmh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ya5.m213793I((List) obj, "camera");
            }
        }).map(new w9j() { // from class: l.jmh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Media) ((List) obj).get(0)).url;
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: r */
    public C22306c<String> m184967r(String str) {
        return TextUtils.isEmpty(str) ? C22306c.error(new RuntimeException("cannot upload empty file absoluteFilePath!")) : m184963q(str).compose(mkd0.m154965Q()).map(new w9j() { // from class: l.kmh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((CustomEnvelope) obj).data.media.get(0).url;
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public C22306c<String> m184968s(String str, final f30<String, String> f30Var) {
        if (TextUtils.isEmpty(str)) {
            return C22306c.error(new RuntimeException("cannot upload empty file absoluteFilePath!"));
        }
        Video video = new Video();
        video.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
        video.url = rhi.m179355B(str);
        video.status = MediaLocalStatus.get("raw");
        video.size = new Dimension(new s5l0(new r5l0(rhi.m179382z(video.url)), false, true).m182365n());
        return new lsx(vwb.m200324f0(video), false).last().map(new w9j() { // from class: l.lmh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return smh0.m184952c((List) obj);
            }
        }).compose(mkd0.m154965Q()).flatMap(new w9j() { // from class: l.mmh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Media media = (Media) obj;
                return smh0.m184963q(rhi.m179382z(media.url)).map(new w9j() { // from class: l.imh0
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return smh0.m184960k(f30Var, media, (CustomEnvelope) obj2);
                    }
                });
            }
        });
    }
}
