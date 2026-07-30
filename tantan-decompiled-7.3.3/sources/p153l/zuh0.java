package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.CustomEnvelope;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import java.io.File;
import java.util.Collections;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class zuh0 {

    /* JADX INFO: renamed from: a */
    public static final String f206128a = qv5.f159703g + "/v2/live-private-cloud/upload";

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Media m221648c(List list) {
        return (Media) list.get(0);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ String m221656k(z20 z20Var, Media media, CustomEnvelope customEnvelope) {
        String str = customEnvelope.data.media.get(0).url;
        if (z20Var != null) {
            z20Var.call(media.url, str);
        }
        return str;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m221657l(gcg0 gcg0Var, String str, DownloadTask downloadTask, File file) {
        if (file == null) {
            gcg0Var.onCompleted();
        } else {
            gcg0Var.m137019l(str);
            gcg0Var.onCompleted();
        }
    }

    /* JADX INFO: renamed from: q */
    public static C22421c<CustomEnvelope> m221659q(String str) {
        File file = new File(str);
        final ku10.C18260a c18260aM151428b = new ku10.C18260a().m151432f(ku10.f128786j).m151428b("file", file.getName(), z1d0.create(e7y.m119773d("multipart/form-data"), file));
        return qi20.m176659f(new pcj() { // from class: l.ouh0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(zuh0.f206128a).m209038l(c18260aM151428b.m151431e()).m209028b();
            }
        }, CustomEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: n */
    public C22421c<String> m221660n(final String str, final String str2) {
        return C22421c.create(new C22421c.a() { // from class: l.wuh0
            @Override // p153l.y20
            public final void call(Object obj) {
                String str3 = str;
                String str4 = str2;
                gcg0 gcg0Var = (gcg0) obj;
                C13274a.m80837u().m80848o(new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(str3).m80823o(str4).m80818j(new z20() { // from class: l.xuh0
                    @Override // p153l.z20
                    public final void call(Object obj2, Object obj3) {
                        zuh0.m221657l(gcg0Var, str4, (DownloadTask) obj2, (File) obj3);
                    }
                }).m80812d(new y20() { // from class: l.yuh0
                    @Override // p153l.y20
                    public final void call(Object obj2) {
                        gcg0Var.onCompleted();
                    }
                }).m80821m(Collections.singletonMap("Authorization", irq.m141843d(str3, ""))).m80814f(new z20() { // from class: l.nuh0
                    @Override // p153l.z20
                    public final void call(Object obj2, Object obj3) {
                        gcg0Var.onError((Throwable) obj3);
                    }
                }).m80809a());
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public C22421c<String> m221661o(String str) {
        if (TextUtils.isEmpty(str)) {
            return C22421c.error(new RuntimeException("cannot upload empty file path!"));
        }
        Picture picture = new Picture();
        picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        picture.url = oki.m168011B(str);
        picture.mediaType = "image/*";
        return new i1y(jyb.m147507f0(picture), false).flatMap(new qcj() { // from class: l.uuh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yb5.m214980I((List) obj, "camera");
            }
        }).map(new qcj() { // from class: l.vuh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Media) ((List) obj).get(0)).url;
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: p */
    public C22421c<String> m221662p(String str) {
        if (TextUtils.isEmpty(str)) {
            return C22421c.error(new RuntimeException("cannot upload empty file path!"));
        }
        Video video = new Video();
        video.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
        video.url = oki.m168011B(str);
        video.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        video.size = new Dimension(new wel0(new vel0(oki.m168038z(video.url)), false, true).m206022n());
        return new i1y(jyb.m147507f0(video), false).flatMap(new qcj() { // from class: l.muh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yb5.m214980I((List) obj, "camera");
            }
        }).map(new qcj() { // from class: l.quh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Media) ((List) obj).get(0)).url;
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: r */
    public C22421c<String> m221663r(String str) {
        return TextUtils.isEmpty(str) ? C22421c.error(new RuntimeException("cannot upload empty file absoluteFilePath!")) : m221659q(str).compose(psd0.m173606Q()).map(new qcj() { // from class: l.ruh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((CustomEnvelope) obj).data.media.get(0).url;
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public C22421c<String> m221664s(String str, final z20<String, String> z20Var) {
        if (TextUtils.isEmpty(str)) {
            return C22421c.error(new RuntimeException("cannot upload empty file absoluteFilePath!"));
        }
        Video video = new Video();
        video.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
        video.url = oki.m168011B(str);
        video.status = MediaLocalStatus.get("raw");
        video.size = new Dimension(new wel0(new vel0(oki.m168038z(video.url)), false, true).m206022n());
        return new i1y(jyb.m147507f0(video), false).last().map(new qcj() { // from class: l.suh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return zuh0.m221648c((List) obj);
            }
        }).compose(psd0.m173606Q()).flatMap(new qcj() { // from class: l.tuh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Media media = (Media) obj;
                return zuh0.m221659q(oki.m168038z(media.url)).map(new qcj() { // from class: l.puh0
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return zuh0.m221656k(z20Var, media, (CustomEnvelope) obj2);
                    }
                });
            }
        });
    }
}
