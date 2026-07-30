package p007l;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p000p1.mobile.putong.data.AudioMedia;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.GifMedia;
import com.p000p1.mobile.putong.data.KanKanStatus;
import com.p000p1.mobile.putong.data.KanPostData;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import l.e30;
import l.e51;
import l.jo0;
import l.la20;
import l.lsx;
import l.mkd0;
import l.osi0;
import l.pgm;
import l.qib0;
import l.r5l0;
import l.rhi;
import l.roj0;
import l.s5l0;
import l.utc0;
import l.v9j;
import l.w9j;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class hr8 extends omg {

    /* JADX INFO: renamed from: H */
    public a<KanPostData> f8795H = a.b();

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ BubbleInfo m10686C0(List list, BubbleInfo bubbleInfo, List list2) {
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.p1.mobile.putong.util.TrackMediaUploadUtil$GetVideoFrameException */
    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ BubbleInfo m10691H0(BubbleInfo bubbleInfo) throws TrackMediaUploadUtil.GetVideoFrameException {
        Picture picture;
        if (NullChecker.a(bubbleInfo.media)) {
            for (Media media : bubbleInfo.media) {
                if (TEnum.equals(media.status, MediaLocalStatus.raw)) {
                    if (media instanceof Picture) {
                        pgm pgmVar = new pgm(rhi.z(media.url));
                        ((Picture) media).size = new Dimension(pgmVar.d);
                        media.mediaType = pgmVar.c;
                    } else if (media instanceof Video) {
                        Video video = (Video) media;
                        r5l0 r5l0Var = new r5l0(rhi.z(video.url));
                        if (!r5l0Var.g && video.isFromNewCamera) {
                            video.hasOriginalSound = false;
                        }
                        if (video.size == null || (picture = video.cover) == null || picture.size == null || video.mediaType == null || picture.mediaType == null) {
                            s5l0 s5l0Var = new s5l0(r5l0Var, false, false);
                            video.mediaType = "video/mp4";
                            video.size = new Dimension(s5l0Var.m());
                            video.duration = s5l0Var.b;
                            Picture picture2 = video.cover;
                            if (picture2 == null || picture2.url == null) {
                                video.processStartTime = SystemClock.uptimeMillis();
                                video.cover = new Picture();
                                try {
                                    if (NullChecker.a(video.cutting)) {
                                        video.cover.url = rhi.B(s5l0Var.e((int) video.cutting.start));
                                    } else {
                                        video.cover.url = rhi.B(s5l0.d(Build.VERSION.SDK_INT >= 30 ? new File(qib0.t0(), System.currentTimeMillis() + ".jpg").getAbsolutePath() : new File(video.url).getParentFile().getAbsolutePath() + File.separator + System.currentTimeMillis() + ".jpg", video.url, 0));
                                    }
                                    video.cover.size = new Dimension(s5l0Var.k());
                                    video.cover.mediaType = "image/jpeg";
                                    qib0.G.x0(video.url);
                                } catch (Exception e) {
                                    CrashHelper.c(e);
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
    private boolean m10694U0(String str) {
        return FeedModule.m1139F().signedIn_() && TextUtils.equals(str, FeedModule.m1139F().userId());
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ c m10696u0(w9j w9jVar, BubbleInfo bubbleInfo) {
        return (c) w9jVar.call(bubbleInfo);
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ c m10700y0(w9j w9jVar, BubbleInfo bubbleInfo) {
        return (c) w9jVar.call(bubbleInfo);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ c m10702K0(final BubbleInfo bubbleInfo, final String str, e30 e30Var) {
        return new la20(new v9j() { // from class: l.jq8
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12670N()).l(utc0.create(Network.JSON, bubbleInfo.toJson())).b();
            }
        }, omg.f11507E).compose(omg.m12710n0()).map(new w9j() { // from class: l.lq8
            public final Object call(Object obj) {
                return this.f10102a.m10711T0(str, (Envelope) obj);
            }
        }).doOnError(e30Var);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ c m10703L0(final String str, final e30 e30Var, final BubbleInfo bubbleInfo) {
        return scheduled("postMyState", -1, new v9j() { // from class: l.fq8
            public final Object call() {
                return this.f8187a.m10702K0(bubbleInfo, str, e30Var);
            }
        });
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ Boolean m10704M0(String str, BubbleInfo bubbleInfo) {
        return Boolean.valueOf(m10694U0(str));
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ Boolean m10705N0(String str, BubbleInfo bubbleInfo) {
        return Boolean.valueOf(m10694U0(str));
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ Boolean m10706O0(String str, BubbleInfo bubbleInfo) {
        return Boolean.valueOf(m10694U0(str));
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ Boolean m10707P0(String str, List list) {
        return Boolean.valueOf(m10694U0(str));
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ c m10708Q0(final List list, final String str, final BubbleInfo bubbleInfo) {
        if (!NullChecker.a(bubbleInfo.media) || bubbleInfo.media.size() <= 0) {
            return c.just(bubbleInfo);
        }
        list.clear();
        for (int i = 0; i < bubbleInfo.media.size(); i++) {
            list.add(bubbleInfo.media.get(i));
        }
        return new lsx(new ArrayList(list), false, str).observeOn(jo0.a()).last().compose(mkd0.Q()).filter(new w9j() { // from class: l.zp8
            public final Object call(Object obj) {
                return this.f15824a.m10707P0(str, (List) obj);
            }
        }).flatMap(new w9j() { // from class: l.bq8
            public final Object call(Object obj) {
                return ijb0.m10900K((List) obj, "myState", null);
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.dq8
            public final Object call(Object obj) {
                return hr8.m10686C0(list, bubbleInfo, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m10709R0(Throwable th, String str) {
        KanPostData kanPostData = new KanPostData();
        kanPostData.status = KanKanStatus.get(KanKanStatus.postError);
        this.f8795H.onNext(kanPostData);
        Objects.toString(th);
        zi60.m17436w().m17443I(false, str);
        if (lph.f10090Q.equals(str)) {
            return;
        }
        if (!(th instanceof TantanException.Client.TantanForbidden)) {
            osi0.b("发布失败");
        } else if (((TantanException.Client.TantanForbidden) th).code == 40353) {
            osi0.g("已达到每日设置上限次数");
        } else {
            osi0.b("发布失败");
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m10710S0(final String str, final Throwable th) {
        e51.M(new Runnable() { // from class: l.hq8
            @Override // java.lang.Runnable
            public final void run() {
                this.f8790a.m10709R0(th, str);
            }
        });
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ roj0 m10711T0(String str, Envelope envelope) {
        KanPostData kanPostData = new KanPostData();
        kanPostData.status = KanKanStatus.get("success");
        this.f8795H.onNext(kanPostData);
        FeedData feedData = (FeedData) envelope.data.getModuleData(FeedData.class);
        List<BubbleInfo> list = feedData != null ? feedData.states : null;
        if (NullChecker.a(list) && list.size() > 0) {
            FeedModule.f316d.m16681lc(list.get(0));
        }
        if (TextUtils.equals(str, "p_meet_greet")) {
            osi0.g("今日偶遇机会+1");
        } else if (TextUtils.equals(str, "follow_top_state")) {
            osi0.g("状态发布成功，戳戳好友分享你的心情");
        } else if (!lph.f10090Q.equals(str) && !"p_moment_post".equals(str)) {
            osi0.f(R$string.f384K1);
        }
        zi60.m17436w().m17443I(true, str);
        return roj0.a;
    }

    /* JADX INFO: renamed from: V0 */
    public c<roj0> m10712V0(final BubbleInfo bubbleInfo, final String str) {
        KanPostData kanPostData = new KanPostData();
        kanPostData.status = KanKanStatus.get(KanKanStatus.start);
        this.f8795H.onNext(kanPostData);
        final String strUserId = FeedModule.m1139F().userId();
        v9j v9jVar = new v9j() { // from class: l.xp8
            public final Object call() {
                return c.fromCallable(new Callable() { // from class: l.fr8
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return hr8.m10691H0(bubbleInfo);
                    }
                });
            }
        };
        final ArrayList arrayList = new ArrayList();
        final w9j w9jVar = new w9j() { // from class: l.pq8
            public final Object call(Object obj) {
                return this.f11943a.m10708Q0(arrayList, strUserId, (BubbleInfo) obj);
            }
        };
        final e30 e30Var = new e30() { // from class: l.rq8
            public final void call(Object obj) {
                this.f12716a.m10710S0(str, (Throwable) obj);
            }
        };
        final w9j w9jVar2 = new w9j() { // from class: l.tq8
            public final Object call(Object obj) {
                return this.f13377a.m10703L0(str, e30Var, (BubbleInfo) obj);
            }
        };
        return now(((c) v9jVar.call()).compose(mkd0.Q()).filter(new w9j() { // from class: l.vq8
            public final Object call(Object obj) {
                return this.f14265a.m10704M0(strUserId, (BubbleInfo) obj);
            }
        }).flatMap(new w9j() { // from class: l.xq8
            public final Object call(Object obj) {
                return hr8.m10696u0(w9jVar, (BubbleInfo) obj);
            }
        }).filter(new w9j() { // from class: l.zq8
            public final Object call(Object obj) {
                return this.f15830a.m10705N0(strUserId, (BubbleInfo) obj);
            }
        }).compose(TrackMediaUploadUtil.f0("myState", arrayList, (w9j) null)).doOnError(e30Var).filter(new w9j() { // from class: l.br8
            public final Object call(Object obj) {
                return this.f6416a.m10706O0(strUserId, (BubbleInfo) obj);
            }
        }).flatMap(new w9j() { // from class: l.dr8
            public final Object call(Object obj) {
                return hr8.m10700y0(w9jVar2, (BubbleInfo) obj);
            }
        }));
    }
}
