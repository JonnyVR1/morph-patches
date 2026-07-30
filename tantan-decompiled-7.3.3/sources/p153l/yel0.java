package p153l;

import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yel0 {

    /* JADX INFO: renamed from: a */
    public boolean f199379a;

    /* JADX INFO: renamed from: a */
    public static List<Moment> m215417a(Envelope envelope) {
        List<Moment> listM145589Q6 = FeedModule.f39703d.m145589Q6(envelope, true);
        List<Music> list = ((FeedData) envelope.getModuleData(FeedData.class)).musics;
        if (NullChecker.m82486a(listM145589Q6)) {
            for (Moment moment : listM145589Q6) {
                for (Music music : list) {
                    if (music.f39629id.equals(moment.musicId) && moment.media.size() > 0 && (moment.media.get(0) instanceof Video)) {
                        ((Video) moment.media.get(0)).music = music;
                    }
                }
            }
        }
        return listM145589Q6;
    }

    /* JADX INFO: renamed from: c */
    public static String m215418c(Envelope envelope) {
        Links links;
        Pagination pagination = envelope.pagination;
        if (pagination == null || (links = pagination.links) == null) {
            return null;
        }
        return links.next;
    }

    /* JADX INFO: renamed from: b */
    public boolean m215419b() {
        return this.f199379a;
    }

    /* JADX INFO: renamed from: d */
    public abstract C22421c<pf60<List<Moment>, List<Live>>> mo157784d();

    /* JADX INFO: renamed from: e */
    public void m215420e(boolean z) {
        this.f199379a = z;
    }
}
