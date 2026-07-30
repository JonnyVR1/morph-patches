package p006l;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.p000p1.mobile.putong.common.R$string;
import com.p1.mobile.android.media.TTFFmpegCommand;
import com.p1.mobile.putong.data.Audio;
import com.p1.mobile.putong.data.CuttingData;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.safety.IllegalPictureException;
import com.p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l.c4g0;
import l.du2;
import l.e30;
import l.lsi0;
import l.oyx;
import l.pgm;
import l.qkq0;
import l.r5l0;
import l.rhi;
import l.s5l0;
import l.vwb;
import l.xaj0;
import l.z3g0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class lsx extends c<List<Media>> {

    /* JADX INFO: renamed from: a */
    public static int f16623a = 8294400;

    public lsx(List<Media> list, boolean z, String str, boolean z2) {
        super(new C0990a(list, z, pgm.n, 0, Bitmap.CompressFormat.JPEG, true, str, false, z2));
    }

    public lsx(List<Media> list, boolean z, String str) {
        super(new C0990a(list, z, str));
    }

    public lsx(List<Media> list, boolean z) {
        super(new C0990a(list, z, null));
    }

    public lsx(List<Media> list, boolean z, boolean z2) {
        super(new C0990a(list, z, null, z2));
    }

    public lsx(List<Media> list, int i, int i2, Bitmap.CompressFormat compressFormat, boolean z) {
        super(new C0990a(list, false, i, i2, compressFormat, z, null));
    }

    /* JADX INFO: renamed from: l.lsx$a */
    public static class C0990a implements c.a<List<Media>>, c4g0 {

        /* JADX INFO: renamed from: a */
        public final List<Media> f16624a;

        /* JADX INFO: renamed from: b */
        public final boolean f16625b;

        /* JADX INFO: renamed from: c */
        public final String f16626c;

        /* JADX INFO: renamed from: d */
        public z3g0<? super List<Media>> f16627d;

        /* JADX INFO: renamed from: e */
        public int f16628e;

        /* JADX INFO: renamed from: f */
        public int f16629f;

        /* JADX INFO: renamed from: g */
        public Bitmap.CompressFormat f16630g;

        /* JADX INFO: renamed from: h */
        public boolean f16631h;

        /* JADX INFO: renamed from: i */
        public boolean f16632i;

        /* JADX INFO: renamed from: j */
        public boolean f16633j;

        public C0990a(List<Media> list, boolean z, int i, int i2, Bitmap.CompressFormat compressFormat, boolean z2, String str, boolean z3, boolean z4) {
            this.f16625b = z;
            this.f16628e = i;
            this.f16629f = i2;
            this.f16630g = compressFormat;
            this.f16631h = z2;
            this.f16626c = str;
            this.f16624a = list == null ? new ArrayList<>() : list;
            this.f16632i = z3;
            this.f16633j = z4;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: com.p1.mobile.putong.safety.IllegalPictureException */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m19013a(Bitmap bitmap) throws IllegalPictureException {
            xaj0 xaj0Var = (xaj0) qib0.f19794R.m11714a(bitmap).toBlocking().b();
            du2.a("[putong-common][media_process]", "图片校验信息: hit tags:" + vwb.U((Collection) xaj0Var.b, ",") + "\n 详细信息: " + ((String) xaj0Var.c));
            if (((Boolean) xaj0Var.a).booleanValue()) {
                throw new IllegalPictureException("图片校验信息不通过: hit tags:" + vwb.U((Collection) xaj0Var.b, ","));
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: com.p1.mobile.android.media.TTFFmpegCommand$FFmpegCommandException */
        /* JADX INFO: Thrown type has an unknown type hierarchy: com.p1.mobile.putong.util.TrackMediaUploadUtil$GetVideoFrameException */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super List<Media>> z3g0Var) throws TrackMediaUploadUtil.GetVideoFrameException, TTFFmpegCommand.FFmpegCommandException {
            if (this.f16627d != null) {
                qkq0.a("only one subscriber supported");
                return;
            }
            this.f16627d = z3g0Var;
            z3g0Var.b(this);
            boolean z = false;
            for (Media media : this.f16624a) {
                if (TEnum.equals(media.status, "raw")) {
                    if (media instanceof Audio) {
                        media.status = MediaLocalStatus.get("preprocessed");
                    } else if ((media instanceof Video) || (media instanceof Picture)) {
                        z = true;
                    }
                } else if ((media instanceof Video) || (media instanceof Picture)) {
                    String str = media.url;
                    if (str != null && !str.startsWith("http") && media.mediaFileLength <= 0) {
                        media.mediaFileLength = TrackMediaUploadUtil.u(rhi.z(media.url));
                    }
                }
            }
            List<Media> list = this.f16624a;
            if (!z) {
                z3g0Var.onNext(list);
                z3g0Var.onCompleted();
                return;
            }
            try {
                Iterator<Media> it = list.iterator();
                while (it.hasNext()) {
                    Video video = (Media) it.next();
                    if (TEnum.equals(((Media) video).status, "raw")) {
                        if (!(video instanceof Audio)) {
                            if (video instanceof Video) {
                                if (((Media) video).processStartTime <= 0) {
                                    ((Media) video).processStartTime = SystemClock.uptimeMillis();
                                }
                                Video video2 = video;
                                ((Media) video2).mediaType = "video/mp4";
                                r5l0 r5l0Var = new r5l0(rhi.z(((Media) video2).url));
                                if ((r5l0Var.c * r5l0Var.d) - lsx.f16623a >= 1000000) {
                                    throw new IllegalArgumentException("Not Support Resolution 8k");
                                }
                                s5l0 s5l0Var = new s5l0(r5l0Var, this.f16625b, false);
                                video2.duration = s5l0Var.b / 1000;
                                try {
                                    CuttingData cuttingData = video2.cutting;
                                    if (cuttingData != null) {
                                        ((Media) video2).url = rhi.B(s5l0Var.b(cuttingData.start, cuttingData.end));
                                    } else {
                                        ((Media) video2).url = rhi.B(s5l0Var.a());
                                    }
                                    Picture picture = video2.cover;
                                    if (picture == null || ((Media) picture).url == null || !new File(rhi.z(((Media) video2.cover).url)).exists()) {
                                        Picture picture2 = new Picture();
                                        video2.cover = picture2;
                                        try {
                                            CuttingData cuttingData2 = video2.cutting;
                                            if (cuttingData2 != null) {
                                                ((Media) picture2).url = rhi.B(s5l0Var.e((int) cuttingData2.start));
                                            } else {
                                                File fileG = s5l0.g(((Media) video2).url, s5l0Var.k()[0], s5l0Var.k()[1], oyx.f(video2));
                                                boolean zA = NullChecker.a(fileG);
                                                Picture picture3 = video2.cover;
                                                if (zA) {
                                                    ((Media) picture3).url = rhi.B(fileG.getAbsolutePath());
                                                } else {
                                                    ((Media) picture3).url = rhi.B(s5l0Var.c(0));
                                                }
                                            }
                                            video2.cover.size = new Dimension(s5l0Var.k());
                                            ((Media) video2.cover).mediaType = "image/jpeg";
                                            qib0.f19782G.m12790x0(((Media) video).url);
                                        } catch (TTFFmpegCommand.FFmpegCommandException e) {
                                            CrashHelper.c(e);
                                            throw new TrackMediaUploadUtil.GetVideoFrameException(e.getMessage(), e.getCause());
                                        }
                                    }
                                    Picture picture4 = video2.cover;
                                    ((Media) picture4).tempUrl = ((Media) picture4).url;
                                    z3g0<? super List<Media>> z3g0Var2 = this.f16627d;
                                    if (z3g0Var2 != null) {
                                        z3g0Var2.onNext(this.f16624a);
                                    }
                                    SystemClock.uptimeMillis();
                                    ((Media) video2).mediaFileLength = TrackMediaUploadUtil.u(rhi.z(((Media) video2).url));
                                    ((Media) video2).processEndTime = SystemClock.uptimeMillis();
                                    video2.size = new Dimension(s5l0Var.n());
                                    ((Media) video2).compressType = s5l0Var.h();
                                } catch (TTFFmpegCommand.FFmpegCommandException e2) {
                                    CrashHelper.c(e2);
                                    if (this.f16626c == null || (qib0.f19805c0.signedIn_() && this.f16626c.equals(qib0.f19805c0.userId()))) {
                                        lsi0.h(R$string.f1379W0);
                                    }
                                    throw e2;
                                }
                            } else if (video instanceof Picture) {
                                if (((Media) video).processStartTime <= 0) {
                                    ((Media) video).processStartTime = SystemClock.uptimeMillis();
                                }
                                pgm pgmVar = new pgm(rhi.z(((Media) video).url), this.f16628e, this.f16629f, this.f16630g, this.f16631h);
                                ((Media) video).url = rhi.B(pgmVar.e(this.f16632i, this.f16633j ? new e30() { // from class: l.ksx
                                    /* JADX INFO: Thrown type has an unknown type hierarchy: com.p1.mobile.putong.safety.IllegalPictureException */
                                    public final void call(Object obj) throws IllegalPictureException {
                                        lsx.C0990a.m19013a((Bitmap) obj);
                                    }
                                } : null));
                                ((Picture) video).size = new Dimension(pgmVar.d);
                                ((Media) video).mediaType = pgmVar.i;
                                ((Media) video).mediaFileLength = TrackMediaUploadUtil.u(rhi.z(((Media) video).url));
                                ((Media) video).processEndTime = SystemClock.uptimeMillis();
                                qib0.f19782G.m12790x0(((Media) video).url);
                            }
                        }
                        ((Media) video).status = MediaLocalStatus.get("preprocessed");
                    }
                }
                z3g0<? super List<Media>> z3g0Var3 = this.f16627d;
                if (z3g0Var3 != null) {
                    z3g0Var3.onNext(this.f16624a);
                    z3g0<? super List<Media>> z3g0Var4 = this.f16627d;
                    if (z3g0Var4 != null) {
                        z3g0Var4.onCompleted();
                    }
                }
            } catch (Exception e3) {
                CrashHelper.c(e3);
                z3g0<? super List<Media>> z3g0Var5 = this.f16627d;
                if (z3g0Var5 != null) {
                    z3g0Var5.onError(e3);
                }
            }
        }

        public boolean isUnsubscribed() {
            return this.f16627d == null;
        }

        public void unsubscribe() {
            this.f16627d = null;
        }

        public C0990a(List<Media> list, boolean z, String str, boolean z2) {
            this(list, z, pgm.n, 0, Bitmap.CompressFormat.JPEG, true, str, z2);
        }

        public C0990a(List<Media> list, boolean z, int i, int i2, Bitmap.CompressFormat compressFormat, boolean z2, String str) {
            this(list, z, i, i2, compressFormat, z2, str, false);
        }

        public C0990a(List<Media> list, boolean z, int i, int i2, Bitmap.CompressFormat compressFormat, boolean z2, String str, boolean z3) {
            this(list, z, i, i2, compressFormat, z2, str, z3, false);
        }

        public C0990a(List<Media> list, boolean z, String str) {
            this(list, z, pgm.n, 0, Bitmap.CompressFormat.JPEG, true, str, false);
        }
    }
}
