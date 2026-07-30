package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.AudioMedia;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.MediaMeta;
import com.p046p1.mobile.putong.feed.newui.camera.VideoEditFrag;
import com.p046p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p046p1.mobile.putong.feed.newui.camera.momosdk.VideoInfo;
import com.p046p1.mobile.putong.feed.newui.status.post.FeedPostStatusAct;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes12.dex */
public class m4l0 extends jq2<VideoEditFrag> {

    /* JADX INFO: renamed from: a */
    public ArrayList<MediaMeta> f131301a;

    /* JADX INFO: renamed from: b */
    public boolean f131302b;

    /* JADX INFO: renamed from: c */
    public VideoInfo f131303c;

    /* JADX INFO: renamed from: d */
    public Video f131304d;

    /* JADX INFO: renamed from: e */
    public MusicContent f131305e;

    /* JADX INFO: renamed from: f */
    public VideoEditFrag f131306f;

    /* JADX INFO: renamed from: g */
    public String f131307g;

    public m4l0(mcr mcrVar) {
        super(mcrVar);
        this.f131306f = (VideoEditFrag) mcrVar;
    }

    /* JADX INFO: renamed from: j0 */
    private String m153042j0() {
        ArrayList<MediaMeta> arrayList = this.f131301a;
        return (arrayList == null || arrayList.isEmpty()) ? "" : this.f131301a.get(0).proportion;
    }

    /* JADX INFO: renamed from: i0 */
    public void m153043i0(Video video) {
        if (video.isChosenFromLocal) {
            return;
        }
        File file = new File(video.path);
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m153044k0(ArrayList<MediaMeta> arrayList, boolean z, VideoInfo videoInfo, Video video, String str) {
        this.f131301a = arrayList;
        this.f131302b = z;
        this.f131303c = videoInfo;
        this.f131304d = video;
        this.f131307g = str;
    }

    /* JADX INFO: renamed from: l0 */
    public final String m153045l0(final w9j<MediaMeta, String> w9jVar) {
        ArrayList<MediaMeta> arrayList = this.f131301a;
        Objects.requireNonNull(w9jVar);
        return TextUtils.join(Constants.SEPARATOR_COMMA, vwb.m200340n0(vwb.m200339n(vwb.m200303Q(arrayList, new w9j() { // from class: l.k4l0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return (String) w9jVar.call((MediaMeta) obj);
            }
        }), new w9j() { // from class: l.l4l0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        })));
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
    /* JADX INFO: renamed from: m0 */
    public void m153046m0(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        com.p046p1.mobile.putong.data.Video video = new com.p046p1.mobile.putong.data.Video();
        video.url = str;
        video.originUrl = this.f131304d.path;
        video.isFromNewCamera = true;
        video.mediaType = "video/*";
        video.status = MediaLocalStatus.get("raw");
        video.hasOriginalSound = this.f131302b ? true : this.f131303c.hasOriginalSound;
        video.hasMusic = this.f131305e != null;
        video.duration = this.f131304d.length;
        video.audio = AudioMedia.new_();
        Video video2 = this.f131304d;
        video.size = new Dimension(video2.width, video2.height);
        if (NullChecker.m81303a(this.f131305e)) {
            MusicContent musicContent = this.f131305e;
            int i = musicContent.type;
            video.isLocalMusic = i == 3;
            AudioMedia audioMedia = video.audio;
            audioMedia.url = i != 3 ? musicContent.uri : "";
            audioMedia.type = DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG_4;
            audioMedia.musicId = i != 3 ? musicContent.f53979id : "";
        } else {
            video.isLocalMusic = false;
        }
        MediaMeta mediaMetaNew_ = MediaMeta.new_();
        video.meta = mediaMetaNew_;
        mediaMetaNew_.type = "video";
        mediaMetaNew_.proportion = m153042j0();
        MediaMeta mediaMeta = video.meta;
        mediaMeta.source = this.f131302b ? "upload" : "shoot";
        mediaMeta.musicId = video.audio.musicId;
        mediaMeta.camera = m153045l0(new w9j() { // from class: l.h4l0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((MediaMeta) obj).camera;
            }
        });
        video.meta.sticker = m153045l0(new w9j() { // from class: l.i4l0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((MediaMeta) obj).sticker;
            }
        });
        video.meta.filter = m153045l0(new w9j() { // from class: l.j4l0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((MediaMeta) obj).filter;
            }
        });
        if (video.isLocalMusic) {
            str2 = "android";
        } else if (!NullChecker.m81303a(this.f131305e) || TextUtils.isEmpty(this.f131305e.source)) {
            str2 = null;
        } else {
            String str3 = this.f131305e.source;
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
        mediaMeta2.isSameMusic = this.f131303c.isSameMusic;
        arrayList.add(video);
        if (TextUtils.equals(this.f131306f.f39450Y, "my_states")) {
            act().startActivity(FeedPostStatusAct.m65808u2(act(), arrayList));
            act().overridePendingTransition(0, 0);
        } else {
            oe40.m163862s0(act(), arrayList, "", false, this.f131307g);
        }
        act().m66873d2();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
