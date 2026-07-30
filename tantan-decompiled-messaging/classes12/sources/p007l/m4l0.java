package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.AudioMedia;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.MediaMeta;
import com.p000p1.mobile.putong.feed.newui.camera.VideoEditFrag;
import com.p000p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p000p1.mobile.putong.feed.newui.camera.momosdk.VideoInfo;
import com.p000p1.mobile.putong.feed.newui.status.post.FeedPostStatusAct;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import l.jq2;
import l.mcr;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class m4l0 extends jq2<VideoEditFrag> {

    /* JADX INFO: renamed from: a */
    public ArrayList<MediaMeta> f10224a;

    /* JADX INFO: renamed from: b */
    public boolean f10225b;

    /* JADX INFO: renamed from: c */
    public VideoInfo f10226c;

    /* JADX INFO: renamed from: d */
    public Video f10227d;

    /* JADX INFO: renamed from: e */
    public MusicContent f10228e;

    /* JADX INFO: renamed from: f */
    public VideoEditFrag f10229f;

    /* JADX INFO: renamed from: g */
    public String f10230g;

    public m4l0(mcr mcrVar) {
        super(mcrVar);
        this.f10229f = (VideoEditFrag) mcrVar;
    }

    /* JADX INFO: renamed from: j0 */
    private String m11809j0() {
        ArrayList<MediaMeta> arrayList = this.f10224a;
        return (arrayList == null || arrayList.isEmpty()) ? "" : this.f10224a.get(0).proportion;
    }

    /* JADX INFO: renamed from: i0 */
    public void m11810i0(Video video) {
        if (video.isChosenFromLocal) {
            return;
        }
        File file = new File(video.path);
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m11811k0(ArrayList<MediaMeta> arrayList, boolean z, VideoInfo videoInfo, Video video, String str) {
        this.f10224a = arrayList;
        this.f10225b = z;
        this.f10226c = videoInfo;
        this.f10227d = video;
        this.f10230g = str;
    }

    /* JADX INFO: renamed from: l0 */
    public final String m11812l0(final w9j<MediaMeta, String> w9jVar) {
        ArrayList<MediaMeta> arrayList = this.f10224a;
        Objects.requireNonNull(w9jVar);
        return TextUtils.join(",", vwb.n0(vwb.n(vwb.Q(arrayList, new w9j() { // from class: l.k4l0
            public final Object call(Object obj) {
                return (String) w9jVar.call((MediaMeta) obj);
            }
        }), new w9j() { // from class: l.l4l0
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        })));
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
    /* JADX INFO: renamed from: m0 */
    public void m11813m0(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        com.p000p1.mobile.putong.data.Video video = new com.p000p1.mobile.putong.data.Video();
        video.url = str;
        video.originUrl = this.f10227d.path;
        video.isFromNewCamera = true;
        video.mediaType = "video/*";
        video.status = MediaLocalStatus.get(MediaLocalStatus.raw);
        video.hasOriginalSound = this.f10225b ? true : this.f10226c.hasOriginalSound;
        video.hasMusic = this.f10228e != null;
        video.duration = this.f10227d.length;
        video.audio = AudioMedia.new_();
        Video video2 = this.f10227d;
        video.size = new Dimension(video2.width, video2.height);
        if (NullChecker.a(this.f10228e)) {
            MusicContent musicContent = this.f10228e;
            int i = musicContent.type;
            video.isLocalMusic = i == 3;
            AudioMedia audioMedia = video.audio;
            audioMedia.url = i != 3 ? musicContent.uri : "";
            audioMedia.type = "audio/mp4";
            audioMedia.musicId = i != 3 ? musicContent.id : "";
        } else {
            video.isLocalMusic = false;
        }
        MediaMeta mediaMetaNew_ = MediaMeta.new_();
        video.meta = mediaMetaNew_;
        mediaMetaNew_.type = "video";
        mediaMetaNew_.proportion = m11809j0();
        MediaMeta mediaMeta = video.meta;
        mediaMeta.source = this.f10225b ? "upload" : "shoot";
        mediaMeta.musicId = video.audio.musicId;
        mediaMeta.camera = m11812l0(new w9j() { // from class: l.h4l0
            public final Object call(Object obj) {
                return ((MediaMeta) obj).camera;
            }
        });
        video.meta.sticker = m11812l0(new w9j() { // from class: l.i4l0
            public final Object call(Object obj) {
                return ((MediaMeta) obj).sticker;
            }
        });
        video.meta.filter = m11812l0(new w9j() { // from class: l.j4l0
            public final Object call(Object obj) {
                return ((MediaMeta) obj).filter;
            }
        });
        if (video.isLocalMusic) {
            str2 = "android";
        } else if (!NullChecker.a(this.f10228e) || TextUtils.isEmpty(this.f10228e.source)) {
            str2 = null;
        } else {
            String str3 = this.f10228e.source;
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
        mediaMeta2.isSameMusic = this.f10226c.isSameMusic;
        arrayList.add(video);
        if (TextUtils.equals(this.f10229f.f911Y, "my_states")) {
            act().startActivity(FeedPostStatusAct.m6954u2(act(), arrayList));
            act().overridePendingTransition(0, 0);
        } else {
            oe40.m12599s0(act(), arrayList, "", false, this.f10230g);
        }
        act().finish();
    }

    public void destroy() {
    }
}
