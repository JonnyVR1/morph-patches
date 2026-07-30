package p149l;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.AudioMedia;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.GifMedia;
import com.p046p1.mobile.putong.data.KanKanStatus;
import com.p046p1.mobile.putong.data.KanPostData;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes12.dex */
public class hr8 extends omg {

    /* JADX INFO: renamed from: H */
    public C22392a<KanPostData> f109186H = C22392a.m221512b();

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ BubbleInfo m132623C0(List list, BubbleInfo bubbleInfo, List list2) {
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
    public static /* synthetic */ BubbleInfo m132628H0(BubbleInfo bubbleInfo) {
        Picture picture;
        if (NullChecker.m81303a(bubbleInfo.media)) {
            for (Media media : bubbleInfo.media) {
                if (TEnum.equals(media.status, "raw")) {
                    if (media instanceof Picture) {
                        pgm pgmVar = new pgm(rhi.m179382z(media.url));
                        ((Picture) media).size = new Dimension(pgmVar.f148730d);
                        media.mediaType = pgmVar.f148729c;
                    } else if (media instanceof Video) {
                        Video video = (Video) media;
                        r5l0 r5l0Var = new r5l0(rhi.m179382z(video.url));
                        if (!r5l0Var.f157836g && video.isFromNewCamera) {
                            video.hasOriginalSound = false;
                        }
                        if (video.size == null || (picture = video.cover) == null || picture.size == null || video.mediaType == null || picture.mediaType == null) {
                            s5l0 s5l0Var = new s5l0(r5l0Var, false, false);
                            video.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
                            video.size = new Dimension(s5l0Var.m182364m());
                            video.duration = s5l0Var.f162561b;
                            Picture picture2 = video.cover;
                            if (picture2 == null || picture2.url == null) {
                                video.processStartTime = SystemClock.uptimeMillis();
                                video.cover = new Picture();
                                try {
                                    if (NullChecker.m81303a(video.cutting)) {
                                        video.cover.url = rhi.m179355B(s5l0Var.m182357e((int) video.cutting.start));
                                    } else {
                                        video.cover.url = rhi.m179355B(s5l0.m182352d(Build.VERSION.SDK_INT >= 30 ? new File(qib0.m174833t0(), System.currentTimeMillis() + ".jpg").getAbsolutePath() : new File(video.url).getParentFile().getAbsolutePath() + File.separator + System.currentTimeMillis() + ".jpg", video.url, 0));
                                    }
                                    video.cover.size = new Dimension(s5l0Var.m182362k());
                                    video.cover.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
                                    qib0.f154691G.m102377x0(video.url);
                                } catch (Exception e) {
                                    CrashHelper.m81296c(e);
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
    private boolean m132631U0(String str) {
        return FeedModule.m60221F().signedIn_() && TextUtils.equals(str, FeedModule.m60221F().userId());
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ C22306c m132633u0(w9j w9jVar, BubbleInfo bubbleInfo) {
        return (C22306c) w9jVar.call(bubbleInfo);
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ C22306c m132637y0(w9j w9jVar, BubbleInfo bubbleInfo) {
        return (C22306c) w9jVar.call(bubbleInfo);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ C22306c m132639K0(final BubbleInfo bubbleInfo, final String str, e30 e30Var) {
        return new la20((v9j<stc0>) new v9j() { // from class: l.jq8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165052N()).m185893l(utc0.create(Network.JSON, bubbleInfo.toJson())).m185883b();
            }
        }, omg.f144620E).compose(omg.m165092n0()).map(new w9j() { // from class: l.lq8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f129306a.m132648T0(str, (Envelope) obj);
            }
        }).doOnError(e30Var);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ C22306c m132640L0(final String str, final e30 e30Var, final BubbleInfo bubbleInfo) {
        return scheduled("postMyState", -1, new v9j() { // from class: l.fq8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f98770a.m132639K0(bubbleInfo, str, e30Var);
            }
        });
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ Boolean m132641M0(String str, BubbleInfo bubbleInfo) {
        return Boolean.valueOf(m132631U0(str));
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ Boolean m132642N0(String str, BubbleInfo bubbleInfo) {
        return Boolean.valueOf(m132631U0(str));
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ Boolean m132643O0(String str, BubbleInfo bubbleInfo) {
        return Boolean.valueOf(m132631U0(str));
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ Boolean m132644P0(String str, List list) {
        return Boolean.valueOf(m132631U0(str));
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ C22306c m132645Q0(final List list, final String str, final BubbleInfo bubbleInfo) {
        if (!NullChecker.m81303a(bubbleInfo.media) || bubbleInfo.media.size() <= 0) {
            return C22306c.just(bubbleInfo);
        }
        list.clear();
        for (int i = 0; i < bubbleInfo.media.size(); i++) {
            list.add(bubbleInfo.media.get(i));
        }
        return new lsx((List<Media>) new ArrayList(list), false, str).observeOn(jo0.m142408a()).last().compose(mkd0.m154965Q()).filter(new w9j() { // from class: l.zp8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f204183a.m132644P0(str, (List) obj);
            }
        }).flatMap(new w9j() { // from class: l.bq8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ijb0.m136547K((List) obj, "myState", null);
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.dq8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return hr8.m132623C0(list, bubbleInfo, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m132646R0(Throwable th, String str) {
        KanPostData kanPostData = new KanPostData();
        kanPostData.status = KanKanStatus.get(KanKanStatus.postError);
        this.f109186H.m132487l(kanPostData);
        Objects.toString(th);
        zi60.m218961w().m218968I(false, str);
        if (lph.f129206Q.equals(str)) {
            return;
        }
        if (!(th instanceof TantanException.Client.TantanForbidden)) {
            osi0.m165778b("发布失败");
        } else if (((TantanException.Client.TantanForbidden) th).code == 40353) {
            osi0.m165783g("已达到每日设置上限次数");
        } else {
            osi0.m165778b("发布失败");
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m132647S0(final String str, final Throwable th) {
        e51.m114748M(new Runnable() { // from class: l.hq8
            @Override // java.lang.Runnable
            public final void run() {
                this.f109037a.m132646R0(th, str);
            }
        });
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ roj0 m132648T0(String str, Envelope envelope) {
        KanPostData kanPostData = new KanPostData();
        kanPostData.status = KanKanStatus.get("success");
        this.f109186H.m132487l(kanPostData);
        FeedData feedData = (FeedData) envelope.data.getModuleData(FeedData.class);
        List<BubbleInfo> list = feedData != null ? feedData.states : null;
        if (NullChecker.m81303a(list) && list.size() > 0) {
            FeedModule.f38855d.m209500lc(list.get(0));
        }
        if (TextUtils.equals(str, "p_meet_greet")) {
            osi0.m165783g("今日偶遇机会+1");
        } else if (TextUtils.equals(str, "follow_top_state")) {
            osi0.m165783g("状态发布成功，戳戳好友分享你的心情");
        } else if (!lph.f129206Q.equals(str) && !"p_moment_post".equals(str)) {
            osi0.m165782f(R$string.f38923K1);
        }
        zi60.m218961w().m218968I(true, str);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: V0 */
    public C22306c<roj0> m132649V0(final BubbleInfo bubbleInfo, final String str) {
        KanPostData kanPostData = new KanPostData();
        kanPostData.status = KanKanStatus.get("start");
        this.f109186H.m132487l(kanPostData);
        final String strUserId = FeedModule.m60221F().userId();
        v9j v9jVar = new v9j() { // from class: l.xp8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C22306c.fromCallable(new Callable() { // from class: l.fr8
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return hr8.m132628H0(bubbleInfo);
                    }
                });
            }
        };
        final ArrayList arrayList = new ArrayList();
        final w9j w9jVar = new w9j() { // from class: l.pq8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f150765a.m132645Q0(arrayList, strUserId, (BubbleInfo) obj);
            }
        };
        final e30<Throwable> e30Var = new e30() { // from class: l.rq8
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160592a.m132647S0(str, (Throwable) obj);
            }
        };
        final w9j w9jVar2 = new w9j() { // from class: l.tq8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f171553a.m132640L0(str, e30Var, (BubbleInfo) obj);
            }
        };
        return now(((C22306c) v9jVar.call()).compose(mkd0.m154965Q()).filter(new w9j() { // from class: l.vq8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f182612a.m132641M0(strUserId, (BubbleInfo) obj);
            }
        }).flatMap(new w9j() { // from class: l.xq8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return hr8.m132633u0(w9jVar, (BubbleInfo) obj);
            }
        }).filter(new w9j() { // from class: l.zq8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f204349a.m132642N0(strUserId, (BubbleInfo) obj);
            }
        }).compose(TrackMediaUploadUtil.m80306f0("myState", arrayList, null)).doOnError(e30Var).filter(new w9j() { // from class: l.br8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f76880a.m132643O0(strUserId, (BubbleInfo) obj);
            }
        }).flatMap(new w9j() { // from class: l.dr8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return hr8.m132637y0(w9jVar2, (BubbleInfo) obj);
            }
        }));
    }
}
