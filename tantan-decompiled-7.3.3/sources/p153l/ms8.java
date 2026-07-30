package p153l;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.AudioMedia;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.GifMedia;
import com.p051p1.mobile.putong.data.KanKanStatus;
import com.p051p1.mobile.putong.data.KanPostData;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes13.dex */
public class ms8 extends dog {

    /* JADX INFO: renamed from: H */
    public C22507a<KanPostData> f138458H = C22507a.m222758b();

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ BubbleInfo m159756C0(List list, BubbleInfo bubbleInfo, List list2) {
        if (list.size() > 0 && (list.get(0) instanceof Video)) {
            Video video = (Video) list.get(0);
            if (video.isFromNewCamera && list2.size() > 0 && (list2.get(0) instanceof Video)) {
                Video video2 = (Video) list2.get(0);
                GifMedia gifMediaNew_ = GifMedia.new_();
                video2.gif = gifMediaNew_;
                gifMediaNew_.url = video2.url;
                gifMediaNew_.type = "image/gif";
                AudioMedia audioMediaNew_ = AudioMedia.new_();
                video2.audio = audioMediaNew_;
                if (video.hasOriginalSound || video.isLocalMusic) {
                    audioMediaNew_.url = video2.url;
                    audioMediaNew_.type = "audio/mp3";
                }
            }
        }
        bubbleInfo.media = list2;
        return bubbleInfo;
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ BubbleInfo m159761H0(BubbleInfo bubbleInfo) {
        Picture picture;
        if (NullChecker.m82486a(bubbleInfo.media)) {
            for (Media media : bubbleInfo.media) {
                if (TEnum.equals(media.status, "raw")) {
                    if (media instanceof Picture) {
                        sim simVar = new sim(oki.m168038z(media.url));
                        ((Picture) media).size = new Dimension(simVar.f168843d);
                        media.mediaType = simVar.f168842c;
                    } else if (media instanceof Video) {
                        Video video = (Video) media;
                        vel0 vel0Var = new vel0(oki.m168038z(video.url));
                        if (!vel0Var.f183811g && video.isFromNewCamera) {
                            video.hasOriginalSound = false;
                        }
                        if (video.size == null || (picture = video.cover) == null || picture.size == null || video.mediaType == null || picture.mediaType == null) {
                            wel0 wel0Var = new wel0(vel0Var, false, false);
                            video.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
                            video.size = new Dimension(wel0Var.m206021m());
                            video.duration = wel0Var.f188702b;
                            Picture picture2 = video.cover;
                            if (picture2 == null || picture2.url == null) {
                                video.processStartTime = SystemClock.uptimeMillis();
                                video.cover = new Picture();
                                try {
                                    if (NullChecker.m82486a(video.cutting)) {
                                        video.cover.url = oki.m168011B(wel0Var.m206014e((int) video.cutting.start));
                                    } else {
                                        video.cover.url = oki.m168011B(wel0.m206009d(Build.VERSION.SDK_INT >= 30 ? new File(uqb0.m197287t0(), System.currentTimeMillis() + ".jpg").getAbsolutePath() : new File(video.url).getParentFile().getAbsolutePath() + File.separator + System.currentTimeMillis() + ".jpg", video.url, 0));
                                    }
                                    video.cover.size = new Dimension(wel0Var.m206019k());
                                    video.cover.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
                                    uqb0.f180374G.m127160x0(video.url);
                                } catch (Exception e) {
                                    CrashHelper.m82479c(e);
                                    throw new TrackMediaUploadUtil.GetVideoFrameException(e.getMessage(), e.getCause());
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return bubbleInfo;
    }

    /* JADX INFO: renamed from: U0 */
    private boolean m159764U0(String str) {
        return FeedModule.m61405F().signedIn_() && TextUtils.equals(str, FeedModule.m61405F().userId());
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ C22421c m159766u0(qcj qcjVar, BubbleInfo bubbleInfo) {
        return (C22421c) qcjVar.call(bubbleInfo);
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ C22421c m159770y0(qcj qcjVar, BubbleInfo bubbleInfo) {
        return (C22421c) qcjVar.call(bubbleInfo);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ C22421c m159772K0(final BubbleInfo bubbleInfo, final String str, y20 y20Var) {
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.or8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117213N()).m209038l(z1d0.create(Network.JSON, bubbleInfo.toJson())).m209028b();
            }
        }, dog.f89927E).compose(dog.m117253n0()).map(new qcj() { // from class: l.qr8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f159074a.m159781T0(str, (Envelope) obj);
            }
        }).doOnError(y20Var);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ C22421c m159773L0(final String str, final y20 y20Var, final BubbleInfo bubbleInfo) {
        return scheduled("postMyState", -1, new pcj() { // from class: l.kr8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f128428a.m159772K0(bubbleInfo, str, y20Var);
            }
        });
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ Boolean m159774M0(String str, BubbleInfo bubbleInfo) {
        return Boolean.valueOf(m159764U0(str));
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ Boolean m159775N0(String str, BubbleInfo bubbleInfo) {
        return Boolean.valueOf(m159764U0(str));
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ Boolean m159776O0(String str, BubbleInfo bubbleInfo) {
        return Boolean.valueOf(m159764U0(str));
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ Boolean m159777P0(String str, List list) {
        return Boolean.valueOf(m159764U0(str));
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ C22421c m159778Q0(final List list, final String str, final BubbleInfo bubbleInfo) {
        if (!NullChecker.m82486a(bubbleInfo.media) || bubbleInfo.media.size() <= 0) {
            return C22421c.just(bubbleInfo);
        }
        list.clear();
        for (int i = 0; i < bubbleInfo.media.size(); i++) {
            list.add(bubbleInfo.media.get(i));
        }
        return new i1y((List<Media>) new ArrayList(list), false, str).observeOn(fo0.m126432a()).last().compose(psd0.m173606Q()).filter(new qcj() { // from class: l.er8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f95453a.m159777P0(str, (List) obj);
            }
        }).flatMap(new qcj() { // from class: l.gr8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return mrb0.m159633K((List) obj, "myState", null);
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.ir8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ms8.m159756C0(list, bubbleInfo, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m159779R0(Throwable th, String str) {
        KanPostData kanPostData = new KanPostData();
        kanPostData.status = KanKanStatus.get(KanKanStatus.postError);
        this.f138458H.m137019l(kanPostData);
        Objects.toString(th);
        er60.m122104w().m122111I(false, str);
        if (arh.f72935Q.equals(str)) {
            return;
        }
        if (!(th instanceof TantanException.Client.TantanForbidden)) {
            r1j0.m179415b("发布失败");
        } else if (((TantanException.Client.TantanForbidden) th).code == 40353) {
            r1j0.m179420g("已达到每日设置上限次数");
        } else {
            r1j0.m179415b("发布失败");
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m159780S0(final String str, final Throwable th) {
        l51.m152893M(new Runnable() { // from class: l.mr8
            @Override // java.lang.Runnable
            public final void run() {
                this.f138306a.m159779R0(th, str);
            }
        });
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ uxj0 m159781T0(String str, Envelope envelope) {
        KanPostData kanPostData = new KanPostData();
        kanPostData.status = KanKanStatus.get("success");
        this.f138458H.m137019l(kanPostData);
        FeedData feedData = (FeedData) envelope.data.getModuleData(FeedData.class);
        List<BubbleInfo> list = feedData != null ? feedData.states : null;
        if (NullChecker.m82486a(list) && list.size() > 0) {
            FeedModule.f39703d.m145741lc(list.get(0));
        }
        if (TextUtils.equals(str, "p_meet_greet")) {
            r1j0.m179420g("今日偶遇机会+1");
        } else if (TextUtils.equals(str, "follow_top_state")) {
            r1j0.m179420g("状态发布成功，戳戳好友分享你的心情");
        } else if (!arh.f72935Q.equals(str) && !"p_moment_post".equals(str)) {
            r1j0.m179419f(R$string.f39771K1);
        }
        er60.m122104w().m122111I(true, str);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: V0 */
    public C22421c<uxj0> m159782V0(final BubbleInfo bubbleInfo, final String str) {
        KanPostData kanPostData = new KanPostData();
        kanPostData.status = KanKanStatus.get("start");
        this.f138458H.m137019l(kanPostData);
        final String strUserId = FeedModule.m61405F().userId();
        pcj pcjVar = new pcj() { // from class: l.cr8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C22421c.fromCallable(new Callable() { // from class: l.ks8
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return ms8.m159761H0(bubbleInfo);
                    }
                });
            }
        };
        final ArrayList arrayList = new ArrayList();
        final qcj qcjVar = new qcj() { // from class: l.ur8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f180574a.m159778Q0(arrayList, strUserId, (BubbleInfo) obj);
            }
        };
        final y20<Throwable> y20Var = new y20() { // from class: l.wr8
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190488a.m159780S0(str, (Throwable) obj);
            }
        };
        final qcj qcjVar2 = new qcj() { // from class: l.yr8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f201288a.m159773L0(str, y20Var, (BubbleInfo) obj);
            }
        };
        return now(((C22421c) pcjVar.call()).compose(psd0.m173606Q()).filter(new qcj() { // from class: l.as8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f73092a.m159774M0(strUserId, (BubbleInfo) obj);
            }
        }).flatMap(new qcj() { // from class: l.cs8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ms8.m159766u0(qcjVar, (BubbleInfo) obj);
            }
        }).filter(new qcj() { // from class: l.es8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f95574a.m159775N0(strUserId, (BubbleInfo) obj);
            }
        }).compose(TrackMediaUploadUtil.m81489f0("myState", arrayList, null)).doOnError(y20Var).filter(new qcj() { // from class: l.gs8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f106241a.m159776O0(strUserId, (BubbleInfo) obj);
            }
        }).flatMap(new qcj() { // from class: l.is8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ms8.m159770y0(qcjVar2, (BubbleInfo) obj);
            }
        }));
    }
}
