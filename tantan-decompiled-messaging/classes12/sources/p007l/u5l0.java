package p007l;

import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.Live;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.data.Pagination;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.j760;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class u5l0 {

    /* JADX INFO: renamed from: a */
    public boolean f13554a;

    /* JADX INFO: renamed from: a */
    public static List<Moment> m14769a(Envelope envelope) {
        List<Moment> listM16529Q6 = FeedModule.f316d.m16529Q6(envelope, true);
        List<Music> list = ((FeedData) envelope.getModuleData(FeedData.class)).musics;
        if (NullChecker.a(listM16529Q6)) {
            for (Moment moment : listM16529Q6) {
                for (Music music : list) {
                    if (music.f242id.equals(moment.musicId) && moment.media.size() > 0 && (moment.media.get(0) instanceof Video)) {
                        ((Video) moment.media.get(0)).music = music;
                    }
                }
            }
        }
        return listM16529Q6;
    }

    /* JADX INFO: renamed from: c */
    public static String m14770c(Envelope envelope) {
        Links links;
        Pagination pagination = envelope.pagination;
        if (pagination == null || (links = pagination.links) == null) {
            return null;
        }
        return links.next;
    }

    /* JADX INFO: renamed from: b */
    public boolean m14771b() {
        return this.f13554a;
    }

    /* JADX INFO: renamed from: d */
    public abstract c<j760<List<Moment>, List<Live>>> mo13696d();

    /* JADX INFO: renamed from: e */
    public void m14772e(boolean z) {
        this.f13554a = z;
    }
}
