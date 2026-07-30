package p149l;

import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public abstract class u5l0 {

    /* JADX INFO: renamed from: a */
    public boolean f174732a;

    /* JADX INFO: renamed from: a */
    public static List<Moment> m191867a(Envelope envelope) {
        List<Moment> listM209348Q6 = FeedModule.f38855d.m209348Q6(envelope, true);
        List<Music> list = ((FeedData) envelope.getModuleData(FeedData.class)).musics;
        if (NullChecker.m81303a(listM209348Q6)) {
            for (Moment moment : listM209348Q6) {
                for (Music music : list) {
                    if (music.f38781id.equals(moment.musicId) && moment.media.size() > 0 && (moment.media.get(0) instanceof Video)) {
                        ((Video) moment.media.get(0)).music = music;
                    }
                }
            }
        }
        return listM209348Q6;
    }

    /* JADX INFO: renamed from: c */
    public static String m191868c(Envelope envelope) {
        Links links;
        Pagination pagination = envelope.pagination;
        if (pagination == null || (links = pagination.links) == null) {
            return null;
        }
        return links.next;
    }

    /* JADX INFO: renamed from: b */
    public boolean m191869b() {
        return this.f174732a;
    }

    /* JADX INFO: renamed from: d */
    public abstract C22306c<j760<List<Moment>, List<Live>>> mo175962d();

    /* JADX INFO: renamed from: e */
    public void m191870e(boolean z) {
        this.f174732a = z;
    }
}
