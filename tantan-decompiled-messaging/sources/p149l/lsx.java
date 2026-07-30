package p149l;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.media.TTFFmpegCommand;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.CuttingData;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.safety.IllegalPictureException;
import com.p046p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class lsx extends C22306c<List<Media>> {

    /* JADX INFO: renamed from: a */
    public static int f129903a = 8294400;

    public lsx(List<Media> list, boolean z, String str, boolean z2) {
        super(new C18315a(list, z, pgm.f148725n, 0, Bitmap.CompressFormat.JPEG, true, str, false, z2));
    }

    public lsx(List<Media> list, boolean z, String str) {
        super(new C18315a(list, z, str));
    }

    public lsx(List<Media> list, boolean z) {
        super(new C18315a(list, z, null));
    }

    public lsx(List<Media> list, boolean z, boolean z2) {
        super(new C18315a(list, z, null, z2));
    }

    public lsx(List<Media> list, int i, int i2, Bitmap.CompressFormat compressFormat, boolean z) {
        super(new C18315a(list, false, i, i2, compressFormat, z, null));
    }

    /* JADX INFO: renamed from: l.lsx$a */
    public static class C18315a implements C22306c.a<List<Media>>, c4g0 {

        /* JADX INFO: renamed from: a */
        public final List<Media> f129904a;

        /* JADX INFO: renamed from: b */
        public final boolean f129905b;

        /* JADX INFO: renamed from: c */
        public final String f129906c;

        /* JADX INFO: renamed from: d */
        public z3g0<? super List<Media>> f129907d;

        /* JADX INFO: renamed from: e */
        public int f129908e;

        /* JADX INFO: renamed from: f */
        public int f129909f;

        /* JADX INFO: renamed from: g */
        public Bitmap.CompressFormat f129910g;

        /* JADX INFO: renamed from: h */
        public boolean f129911h;

        /* JADX INFO: renamed from: i */
        public boolean f129912i;

        /* JADX INFO: renamed from: j */
        public boolean f129913j;

        public C18315a(List<Media> list, boolean z, int i, int i2, Bitmap.CompressFormat compressFormat, boolean z2, String str, boolean z3, boolean z4) {
            this.f129905b = z;
            this.f129908e = i;
            this.f129909f = i2;
            this.f129910g = compressFormat;
            this.f129911h = z2;
            this.f129906c = str;
            this.f129904a = list == null ? new ArrayList<>() : list;
            this.f129912i = z3;
            this.f129913j = z4;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m151652a(Bitmap bitmap) {
            xaj0<Boolean, List<String>, String> xaj0VarM212770b = qib0.f154703R.m94725a(bitmap).toBlocking().m212770b();
            du2.m113670a("[putong-common][media_process]", "图片校验信息: hit tags:" + vwb.m200307U(xaj0VarM212770b.f191752b, Constants.SEPARATOR_COMMA) + "\n 详细信息: " + xaj0VarM212770b.f191753c);
            if (xaj0VarM212770b.f191751a.booleanValue()) {
                throw new IllegalPictureException("图片校验信息不通过: hit tags:" + vwb.m200307U(xaj0VarM212770b.f191752b, Constants.SEPARATOR_COMMA));
            }
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super List<Media>> z3g0Var) {
            if (this.f129907d != null) {
                qkq0.m175383a("only one subscriber supported");
                return;
            }
            this.f129907d = z3g0Var;
            z3g0Var.m217046b(this);
            boolean z = false;
            for (Media media : this.f129904a) {
                if (TEnum.equals(media.status, "raw")) {
                    if (media instanceof Audio) {
                        media.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
                    } else if ((media instanceof Video) || (media instanceof Picture)) {
                        z = true;
                    }
                } else if ((media instanceof Video) || (media instanceof Picture)) {
                    String str = media.url;
                    if (str != null && !str.startsWith("http") && media.mediaFileLength <= 0) {
                        media.mediaFileLength = TrackMediaUploadUtil.m80324u(rhi.m179382z(media.url));
                    }
                }
            }
            List<Media> list = this.f129904a;
            if (!z) {
                z3g0Var.m132487l(list);
                z3g0Var.onCompleted();
                return;
            }
            try {
                for (Media media2 : list) {
                    if (TEnum.equals(media2.status, "raw")) {
                        if (!(media2 instanceof Audio)) {
                            if (media2 instanceof Video) {
                                if (media2.processStartTime <= 0) {
                                    media2.processStartTime = SystemClock.uptimeMillis();
                                }
                                Video video = (Video) media2;
                                video.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
                                r5l0 r5l0Var = new r5l0(rhi.m179382z(video.url));
                                if ((r5l0Var.f157832c * r5l0Var.f157833d) - lsx.f129903a >= 1000000) {
                                    throw new IllegalArgumentException("Not Support Resolution 8k");
                                }
                                s5l0 s5l0Var = new s5l0(r5l0Var, this.f129905b, false);
                                video.duration = s5l0Var.f162561b / 1000;
                                try {
                                    CuttingData cuttingData = video.cutting;
                                    if (cuttingData != null) {
                                        video.url = rhi.m179355B(s5l0Var.m182355b(cuttingData.start, cuttingData.end));
                                    } else {
                                        video.url = rhi.m179355B(s5l0Var.m182354a());
                                    }
                                    Picture picture = video.cover;
                                    if (picture == null || picture.url == null || !new File(rhi.m179382z(video.cover.url)).exists()) {
                                        Picture picture2 = new Picture();
                                        video.cover = picture2;
                                        try {
                                            CuttingData cuttingData2 = video.cutting;
                                            if (cuttingData2 != null) {
                                                picture2.url = rhi.m179355B(s5l0Var.m182357e((int) cuttingData2.start));
                                            } else {
                                                File fileM182353g = s5l0.m182353g(video.url, s5l0Var.m182362k()[0], s5l0Var.m182362k()[1], oyx.m166732f(video));
                                                boolean zM81303a = NullChecker.m81303a(fileM182353g);
                                                Picture picture3 = video.cover;
                                                if (zM81303a) {
                                                    picture3.url = rhi.m179355B(fileM182353g.getAbsolutePath());
                                                } else {
                                                    picture3.url = rhi.m179355B(s5l0Var.m182356c(0));
                                                }
                                            }
                                            video.cover.size = new Dimension(s5l0Var.m182362k());
                                            video.cover.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
                                            qib0.f154691G.m102377x0(media2.url);
                                        } catch (TTFFmpegCommand.FFmpegCommandException e) {
                                            CrashHelper.m81296c(e);
                                            throw new TrackMediaUploadUtil.GetVideoFrameException(e.getMessage(), e.getCause());
                                        }
                                    }
                                    Picture picture4 = video.cover;
                                    picture4.tempUrl = picture4.url;
                                    z3g0<? super List<Media>> z3g0Var2 = this.f129907d;
                                    if (z3g0Var2 != null) {
                                        z3g0Var2.m132487l(this.f129904a);
                                    }
                                    SystemClock.uptimeMillis();
                                    video.mediaFileLength = TrackMediaUploadUtil.m80324u(rhi.m179382z(video.url));
                                    video.processEndTime = SystemClock.uptimeMillis();
                                    video.size = new Dimension(s5l0Var.m182365n());
                                    video.compressType = s5l0Var.m182359h();
                                } catch (TTFFmpegCommand.FFmpegCommandException e2) {
                                    CrashHelper.m81296c(e2);
                                    if (this.f129906c == null || (qib0.f154714c0.signedIn_() && this.f129906c.equals(qib0.f154714c0.userId()))) {
                                        lsi0.m151578h(R$string.f17390W0);
                                    }
                                    throw e2;
                                }
                            } else if (media2 instanceof Picture) {
                                if (media2.processStartTime <= 0) {
                                    media2.processStartTime = SystemClock.uptimeMillis();
                                }
                                pgm pgmVar = new pgm(rhi.m179382z(media2.url), this.f129908e, this.f129909f, this.f129910g, this.f129911h);
                                media2.url = rhi.m179355B(pgmVar.m168765e(this.f129912i, this.f129913j ? new e30() { // from class: l.ksx
                                    @Override // p149l.e30
                                    public final void call(Object obj) {
                                        lsx.C18315a.m151652a((Bitmap) obj);
                                    }
                                } : null));
                                ((Picture) media2).size = new Dimension(pgmVar.f148730d);
                                media2.mediaType = pgmVar.f148735i;
                                media2.mediaFileLength = TrackMediaUploadUtil.m80324u(rhi.m179382z(media2.url));
                                media2.processEndTime = SystemClock.uptimeMillis();
                                qib0.f154691G.m102377x0(media2.url);
                            }
                        }
                        media2.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
                    }
                }
                z3g0<? super List<Media>> z3g0Var3 = this.f129907d;
                if (z3g0Var3 != null) {
                    z3g0Var3.m132487l(this.f129904a);
                    z3g0<? super List<Media>> z3g0Var4 = this.f129907d;
                    if (z3g0Var4 != null) {
                        z3g0Var4.onCompleted();
                    }
                }
            } catch (Exception e3) {
                CrashHelper.m81296c(e3);
                z3g0<? super List<Media>> z3g0Var5 = this.f129907d;
                if (z3g0Var5 != null) {
                    z3g0Var5.onError(e3);
                }
            }
        }

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return this.f129907d == null;
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            this.f129907d = null;
        }

        public C18315a(List<Media> list, boolean z, String str, boolean z2) {
            this(list, z, pgm.f148725n, 0, Bitmap.CompressFormat.JPEG, true, str, z2);
        }

        public C18315a(List<Media> list, boolean z, int i, int i2, Bitmap.CompressFormat compressFormat, boolean z2, String str) {
            this(list, z, i, i2, compressFormat, z2, str, false);
        }

        public C18315a(List<Media> list, boolean z, int i, int i2, Bitmap.CompressFormat compressFormat, boolean z2, String str, boolean z3) {
            this(list, z, i, i2, compressFormat, z2, str, z3, false);
        }

        public C18315a(List<Media> list, boolean z, String str) {
            this(list, z, pgm.f148725n, 0, Bitmap.CompressFormat.JPEG, true, str, false);
        }
    }
}
