package p153l;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.media.TTFFmpegCommand;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.CuttingData;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.safety.IllegalPictureException;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class i1y extends C22421c<List<Media>> {

    /* JADX INFO: renamed from: a */
    public static int f112561a = 8294400;

    public i1y(List<Media> list, boolean z, String str, boolean z2) {
        super(new C17619a(list, z, sim.f168838n, 0, Bitmap.CompressFormat.JPEG, true, str, false, z2));
    }

    public i1y(List<Media> list, boolean z, String str) {
        super(new C17619a(list, z, str));
    }

    public i1y(List<Media> list, boolean z) {
        super(new C17619a(list, z, null));
    }

    public i1y(List<Media> list, boolean z, boolean z2) {
        super(new C17619a(list, z, null, z2));
    }

    public i1y(List<Media> list, int i, int i2, Bitmap.CompressFormat compressFormat, boolean z) {
        super(new C17619a(list, false, i, i2, compressFormat, z, null));
    }

    /* JADX INFO: renamed from: l.i1y$a */
    public static class C17619a implements C22421c.a<List<Media>>, kcg0 {

        /* JADX INFO: renamed from: a */
        public final List<Media> f112562a;

        /* JADX INFO: renamed from: b */
        public final boolean f112563b;

        /* JADX INFO: renamed from: c */
        public final String f112564c;

        /* JADX INFO: renamed from: d */
        public gcg0<? super List<Media>> f112565d;

        /* JADX INFO: renamed from: e */
        public int f112566e;

        /* JADX INFO: renamed from: f */
        public int f112567f;

        /* JADX INFO: renamed from: g */
        public Bitmap.CompressFormat f112568g;

        /* JADX INFO: renamed from: h */
        public boolean f112569h;

        /* JADX INFO: renamed from: i */
        public boolean f112570i;

        /* JADX INFO: renamed from: j */
        public boolean f112571j;

        public C17619a(List<Media> list, boolean z, int i, int i2, Bitmap.CompressFormat compressFormat, boolean z2, String str, boolean z3, boolean z4) {
            this.f112563b = z;
            this.f112566e = i;
            this.f112567f = i2;
            this.f112568g = compressFormat;
            this.f112569h = z2;
            this.f112564c = str;
            this.f112562a = list == null ? new ArrayList<>() : list;
            this.f112570i = z3;
            this.f112571j = z4;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m138157a(Bitmap bitmap) {
            bkj0<Boolean, List<String>, String> bkj0VarM165963b = uqb0.f180386R.m184738a(bitmap).toBlocking().m165963b();
            tu2.m192703a("[putong-common][media_process]", "图片校验信息: hit tags:" + jyb.m147490U(bkj0VarM165963b.f77082b, Constants.SEPARATOR_COMMA) + "\n 详细信息: " + bkj0VarM165963b.f77083c);
            if (bkj0VarM165963b.f77081a.booleanValue()) {
                throw new IllegalPictureException("图片校验信息不通过: hit tags:" + jyb.m147490U(bkj0VarM165963b.f77082b, Constants.SEPARATOR_COMMA));
            }
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super List<Media>> gcg0Var) {
            if (this.f112565d != null) {
                wtq0.m207906a("only one subscriber supported");
                return;
            }
            this.f112565d = gcg0Var;
            gcg0Var.m129866b(this);
            boolean z = false;
            for (Media media : this.f112562a) {
                if (TEnum.equals(media.status, "raw")) {
                    if (media instanceof Audio) {
                        media.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
                    } else if ((media instanceof Video) || (media instanceof Picture)) {
                        z = true;
                    }
                } else if ((media instanceof Video) || (media instanceof Picture)) {
                    String str = media.url;
                    if (str != null && !str.startsWith("http") && media.mediaFileLength <= 0) {
                        media.mediaFileLength = TrackMediaUploadUtil.m81507u(oki.m168038z(media.url));
                    }
                }
            }
            List<Media> list = this.f112562a;
            if (!z) {
                gcg0Var.m137019l(list);
                gcg0Var.onCompleted();
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
                                vel0 vel0Var = new vel0(oki.m168038z(video.url));
                                if ((vel0Var.f183807c * vel0Var.f183808d) - i1y.f112561a >= 1000000) {
                                    throw new IllegalArgumentException("Not Support Resolution 8k");
                                }
                                wel0 wel0Var = new wel0(vel0Var, this.f112563b, false);
                                video.duration = wel0Var.f188702b / 1000;
                                try {
                                    CuttingData cuttingData = video.cutting;
                                    if (cuttingData != null) {
                                        video.url = oki.m168011B(wel0Var.m206012b(cuttingData.start, cuttingData.end));
                                    } else {
                                        video.url = oki.m168011B(wel0Var.m206011a());
                                    }
                                    Picture picture = video.cover;
                                    if (picture == null || picture.url == null || !new File(oki.m168038z(video.cover.url)).exists()) {
                                        Picture picture2 = new Picture();
                                        video.cover = picture2;
                                        try {
                                            CuttingData cuttingData2 = video.cutting;
                                            if (cuttingData2 != null) {
                                                picture2.url = oki.m168011B(wel0Var.m206014e((int) cuttingData2.start));
                                            } else {
                                                File fileM206010g = wel0.m206010g(video.url, wel0Var.m206019k()[0], wel0Var.m206019k()[1], l7y.m153154f(video));
                                                boolean zM82486a = NullChecker.m82486a(fileM206010g);
                                                Picture picture3 = video.cover;
                                                if (zM82486a) {
                                                    picture3.url = oki.m168011B(fileM206010g.getAbsolutePath());
                                                } else {
                                                    picture3.url = oki.m168011B(wel0Var.m206013c(0));
                                                }
                                            }
                                            video.cover.size = new Dimension(wel0Var.m206019k());
                                            video.cover.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
                                            uqb0.f180374G.m127160x0(media2.url);
                                        } catch (TTFFmpegCommand.FFmpegCommandException e) {
                                            CrashHelper.m82479c(e);
                                            throw new TrackMediaUploadUtil.GetVideoFrameException(e.getMessage(), e.getCause());
                                        }
                                    }
                                    Picture picture4 = video.cover;
                                    picture4.tempUrl = picture4.url;
                                    gcg0<? super List<Media>> gcg0Var2 = this.f112565d;
                                    if (gcg0Var2 != null) {
                                        gcg0Var2.m137019l(this.f112562a);
                                    }
                                    SystemClock.uptimeMillis();
                                    video.mediaFileLength = TrackMediaUploadUtil.m81507u(oki.m168038z(video.url));
                                    video.processEndTime = SystemClock.uptimeMillis();
                                    video.size = new Dimension(wel0Var.m206022n());
                                    video.compressType = wel0Var.m206016h();
                                } catch (TTFFmpegCommand.FFmpegCommandException e2) {
                                    CrashHelper.m82479c(e2);
                                    if (this.f112564c == null || (uqb0.f180397c0.signedIn_() && this.f112564c.equals(uqb0.f180397c0.userId()))) {
                                        o1j0.m165634h(R$string.f18109W0);
                                    }
                                    throw e2;
                                }
                            } else if (media2 instanceof Picture) {
                                if (media2.processStartTime <= 0) {
                                    media2.processStartTime = SystemClock.uptimeMillis();
                                }
                                sim simVar = new sim(oki.m168038z(media2.url), this.f112566e, this.f112567f, this.f112568g, this.f112569h);
                                media2.url = oki.m168011B(simVar.m186026e(this.f112570i, this.f112571j ? new y20() { // from class: l.h1y
                                    @Override // p153l.y20
                                    public final void call(Object obj) {
                                        i1y.C17619a.m138157a((Bitmap) obj);
                                    }
                                } : null));
                                ((Picture) media2).size = new Dimension(simVar.f168843d);
                                media2.mediaType = simVar.f168848i;
                                media2.mediaFileLength = TrackMediaUploadUtil.m81507u(oki.m168038z(media2.url));
                                media2.processEndTime = SystemClock.uptimeMillis();
                                uqb0.f180374G.m127160x0(media2.url);
                            }
                        }
                        media2.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
                    }
                }
                gcg0<? super List<Media>> gcg0Var3 = this.f112565d;
                if (gcg0Var3 != null) {
                    gcg0Var3.m137019l(this.f112562a);
                    gcg0<? super List<Media>> gcg0Var4 = this.f112565d;
                    if (gcg0Var4 != null) {
                        gcg0Var4.onCompleted();
                    }
                }
            } catch (Exception e3) {
                CrashHelper.m82479c(e3);
                gcg0<? super List<Media>> gcg0Var5 = this.f112565d;
                if (gcg0Var5 != null) {
                    gcg0Var5.onError(e3);
                }
            }
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return this.f112565d == null;
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
            this.f112565d = null;
        }

        public C17619a(List<Media> list, boolean z, String str, boolean z2) {
            this(list, z, sim.f168838n, 0, Bitmap.CompressFormat.JPEG, true, str, z2);
        }

        public C17619a(List<Media> list, boolean z, int i, int i2, Bitmap.CompressFormat compressFormat, boolean z2, String str) {
            this(list, z, i, i2, compressFormat, z2, str, false);
        }

        public C17619a(List<Media> list, boolean z, int i, int i2, Bitmap.CompressFormat compressFormat, boolean z2, String str, boolean z3) {
            this(list, z, i, i2, compressFormat, z2, str, z3, false);
        }

        public C17619a(List<Media> list, boolean z, String str) {
            this(list, z, sim.f168838n, 0, Bitmap.CompressFormat.JPEG, true, str, false);
        }
    }
}
