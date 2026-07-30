package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.AudioMedia;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.MediaMeta;
import com.p051p1.mobile.putong.feed.newui.camera.VideoEditFrag;
import com.p051p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p051p1.mobile.putong.feed.newui.camera.momosdk.VideoInfo;
import com.p051p1.mobile.putong.feed.newui.status.post.FeedPostStatusAct;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes13.dex */
public class qdl0 extends ar2<VideoEditFrag> {

    /* JADX INFO: renamed from: a */
    public ArrayList<MediaMeta> f156741a;

    /* JADX INFO: renamed from: b */
    public boolean f156742b;

    /* JADX INFO: renamed from: c */
    public VideoInfo f156743c;

    /* JADX INFO: renamed from: d */
    public Video f156744d;

    /* JADX INFO: renamed from: e */
    public MusicContent f156745e;

    /* JADX INFO: renamed from: f */
    public VideoEditFrag f156746f;

    /* JADX INFO: renamed from: g */
    public String f156747g;

    public qdl0(ner nerVar) {
        super(nerVar);
        this.f156746f = (VideoEditFrag) nerVar;
    }

    /* JADX INFO: renamed from: j0 */
    private String m176173j0() {
        ArrayList<MediaMeta> arrayList = this.f156741a;
        return (arrayList == null || arrayList.isEmpty()) ? "" : this.f156741a.get(0).proportion;
    }

    /* JADX INFO: renamed from: i0 */
    public void m176174i0(Video video) {
        if (video.isChosenFromLocal) {
            return;
        }
        File file = new File(video.path);
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m176175k0(ArrayList<MediaMeta> arrayList, boolean z, VideoInfo videoInfo, Video video, String str) {
        this.f156741a = arrayList;
        this.f156742b = z;
        this.f156743c = videoInfo;
        this.f156744d = video;
        this.f156747g = str;
    }

    /* JADX INFO: renamed from: l0 */
    public final String m176176l0(final qcj<MediaMeta, String> qcjVar) {
        ArrayList<MediaMeta> arrayList = this.f156741a;
        Objects.requireNonNull(qcjVar);
        return TextUtils.join(Constants.SEPARATOR_COMMA, jyb.m147523n0(jyb.m147522n(jyb.m147486Q(arrayList, new qcj() { // from class: l.odl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return (String) qcjVar.call((MediaMeta) obj);
            }
        }), new qcj() { // from class: l.pdl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        })));
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
    /* JADX INFO: renamed from: m0 */
    public void m176177m0(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        com.p051p1.mobile.putong.data.Video video = new com.p051p1.mobile.putong.data.Video();
        video.url = str;
        video.originUrl = this.f156744d.path;
        video.isFromNewCamera = true;
        video.mediaType = "video/*";
        video.status = MediaLocalStatus.get("raw");
        video.hasOriginalSound = this.f156742b ? true : this.f156743c.hasOriginalSound;
        video.hasMusic = this.f156745e != null;
        video.duration = this.f156744d.length;
        video.audio = AudioMedia.new_();
        Video video2 = this.f156744d;
        video.size = new Dimension(video2.width, video2.height);
        if (NullChecker.m82486a(this.f156745e)) {
            MusicContent musicContent = this.f156745e;
            int i = musicContent.type;
            video.isLocalMusic = i == 3;
            AudioMedia audioMedia = video.audio;
            audioMedia.url = i != 3 ? musicContent.uri : "";
            audioMedia.type = DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG_4;
            audioMedia.musicId = i != 3 ? musicContent.f54827id : "";
        } else {
            video.isLocalMusic = false;
        }
        MediaMeta mediaMetaNew_ = MediaMeta.new_();
        video.meta = mediaMetaNew_;
        mediaMetaNew_.type = "video";
        mediaMetaNew_.proportion = m176173j0();
        MediaMeta mediaMeta = video.meta;
        mediaMeta.source = this.f156742b ? "upload" : "shoot";
        mediaMeta.musicId = video.audio.musicId;
        mediaMeta.camera = m176176l0(new qcj() { // from class: l.ldl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((MediaMeta) obj).camera;
            }
        });
        video.meta.sticker = m176176l0(new qcj() { // from class: l.mdl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((MediaMeta) obj).sticker;
            }
        });
        video.meta.filter = m176176l0(new qcj() { // from class: l.ndl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((MediaMeta) obj).filter;
            }
        });
        if (video.isLocalMusic) {
            str2 = "android";
        } else if (!NullChecker.m82486a(this.f156745e) || TextUtils.isEmpty(this.f156745e.source)) {
            str2 = null;
        } else {
            String str3 = this.f156745e.source;
            str3.getClass();
            if (str3.equals("brand")) {
                str2 = "official";
            } else if (str3.equals("default")) {
                str2 = "user";
            } else {
                str2 = null;
            }
        }
        MediaMeta mediaMeta2 = video.meta;
        mediaMeta2.musicReference = str2;
        mediaMeta2.hasAudio = true ^ video.hasMusic;
        mediaMeta2.isSameMusic = this.f156743c.isSameMusic;
        arrayList.add(video);
        if (TextUtils.equals(this.f156746f.f40298Y, "my_states")) {
            act().startActivity(FeedPostStatusAct.m66991v2(act(), arrayList));
            act().overridePendingTransition(0, 0);
        } else {
            cn40.m111412s0(act(), arrayList, "", false, this.f156747g);
        }
        act().m68056e2();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
