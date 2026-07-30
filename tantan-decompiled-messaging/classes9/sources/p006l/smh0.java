package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.data.CustomEnvelope;
import com.p1.mobile.putong.data.CustomMedia;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.ui.download.DownloadTask;
import com.p1.mobile.putong.ui.download.a;
import java.io.File;
import java.util.Collections;
import java.util.List;
import l.cm10;
import l.e30;
import l.f30;
import l.hyx;
import l.ipq;
import l.mkd0;
import l.r5l0;
import l.rhi;
import l.s5l0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.z3g0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class smh0 {

    /* JADX INFO: renamed from: a */
    public static final String f21429a = mu5.f17258g + "/v2/live-private-cloud/upload";

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Media m23895c(List list) {
        return (Media) list.get(0);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ String m23903k(f30 f30Var, Media media, CustomEnvelope customEnvelope) {
        String str = ((CustomMedia) customEnvelope.data.media.get(0)).url;
        if (f30Var != null) {
            f30Var.call(media.url, str);
        }
        return str;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m23904l(z3g0 z3g0Var, String str, DownloadTask downloadTask, File file) {
        if (file == null) {
            z3g0Var.onCompleted();
        } else {
            z3g0Var.onNext(str);
            z3g0Var.onCompleted();
        }
    }

    /* JADX INFO: renamed from: q */
    public static c<CustomEnvelope> m23906q(String str) {
        File file = new File(str);
        final cm10.a aVarB = new cm10.a().f(cm10.j).b("file", file.getName(), utc0.create(hyx.d("multipart/form-data"), file));
        return ia20.m16572f(new v9j() { // from class: l.hmh0
            public final Object call() {
                return qib0.f19784H.auth().q(smh0.f21429a).l(aVarB.e()).b();
            }
        }, CustomEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: n */
    public c<String> m23907n(final String str, final String str2) {
        return c.create(new c.a() { // from class: l.pmh0
            public final void call(Object obj) {
                String str3 = str;
                String str4 = str2;
                z3g0 z3g0Var = (z3g0) obj;
                a.u().o(new DownloadTask.b(qib0.f19784H.getDownloadHttp()).q(str3).o(str4).j(new f30() { // from class: l.qmh0
                    public final void call(Object obj2, Object obj3) {
                        smh0.m23904l(z3g0Var, str4, (DownloadTask) obj2, (File) obj3);
                    }
                }).d(new e30() { // from class: l.rmh0
                    public final void call(Object obj2) {
                        z3g0Var.onCompleted();
                    }
                }).m(Collections.singletonMap(Network.AUTH, ipq.d(str3, ""))).f(new f30() { // from class: l.gmh0
                    public final void call(Object obj2, Object obj3) {
                        z3g0Var.onError((Throwable) obj3);
                    }
                }).a());
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public c<String> m23908o(String str) {
        if (TextUtils.isEmpty(str)) {
            return c.error(new RuntimeException("cannot upload empty file path!"));
        }
        Media picture = new Picture();
        picture.status = MediaLocalStatus.get("preprocessed");
        picture.url = rhi.B(str);
        picture.mediaType = "image/*";
        return new lsx(vwb.f0(new Media[]{picture}), false).flatMap(new w9j() { // from class: l.nmh0
            public final Object call(Object obj) {
                return ya5.m28127I((List) obj, "camera");
            }
        }).map(new w9j() { // from class: l.omh0
            public final Object call(Object obj) {
                return ((Media) ((List) obj).get(0)).url;
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: p */
    public c<String> m23909p(String str) {
        if (TextUtils.isEmpty(str)) {
            return c.error(new RuntimeException("cannot upload empty file path!"));
        }
        Media video = new Video();
        video.mediaType = "video/mp4";
        video.url = rhi.B(str);
        video.status = MediaLocalStatus.get("preprocessed");
        ((Video) video).size = new Dimension(new s5l0(new r5l0(rhi.z(video.url)), false, true).n());
        return new lsx(vwb.f0(new Media[]{video}), false).flatMap(new w9j() { // from class: l.fmh0
            public final Object call(Object obj) {
                return ya5.m28127I((List) obj, "camera");
            }
        }).map(new w9j() { // from class: l.jmh0
            public final Object call(Object obj) {
                return ((Media) ((List) obj).get(0)).url;
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: r */
    public c<String> m23910r(String str) {
        return TextUtils.isEmpty(str) ? c.error(new RuntimeException("cannot upload empty file absoluteFilePath!")) : m23906q(str).compose(mkd0.Q()).map(new w9j() { // from class: l.kmh0
            public final Object call(Object obj) {
                return ((CustomMedia) ((CustomEnvelope) obj).data.media.get(0)).url;
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public c<String> m23911s(String str, final f30<String, String> f30Var) {
        if (TextUtils.isEmpty(str)) {
            return c.error(new RuntimeException("cannot upload empty file absoluteFilePath!"));
        }
        Media video = new Video();
        video.mediaType = "video/mp4";
        video.url = rhi.B(str);
        video.status = MediaLocalStatus.get("raw");
        ((Video) video).size = new Dimension(new s5l0(new r5l0(rhi.z(video.url)), false, true).n());
        return new lsx(vwb.f0(new Media[]{video}), false).last().map(new w9j() { // from class: l.lmh0
            public final Object call(Object obj) {
                return smh0.m23895c((List) obj);
            }
        }).compose(mkd0.Q()).flatMap(new w9j() { // from class: l.mmh0
            public final Object call(Object obj) {
                Media media = (Media) obj;
                return smh0.m23906q(rhi.z(media.url)).map(new w9j() { // from class: l.imh0
                    public final Object call(Object obj2) {
                        return smh0.m23903k(f30Var, media, (CustomEnvelope) obj2);
                    }
                });
            }
        });
    }
}
