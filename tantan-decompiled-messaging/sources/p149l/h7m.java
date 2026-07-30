package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.AudioMedia;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.MediaMeta;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.camera.IVVideoEditFrag;
import com.p046p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes12.dex */
public class h7m extends jq2<IVVideoEditFrag> {

    /* JADX INFO: renamed from: a */
    public Video f106314a;

    /* JADX INFO: renamed from: b */
    public MusicContent f106315b;

    public h7m(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: e0 */
    public void m129751e0(Video video) {
        if (video.isChosenFromLocal) {
            return;
        }
        File file = new File(video.path);
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m129752f0(MusicContent musicContent, Video video) {
        this.f106315b = musicContent;
        this.f106314a = video;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX INFO: renamed from: g0 */
    public void m129753g0(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        com.p046p1.mobile.putong.data.Video video = new com.p046p1.mobile.putong.data.Video();
        video.url = str;
        video.originUrl = this.f106314a.path;
        video.isFromNewCamera = true;
        video.mediaType = "video/*";
        video.status = MediaLocalStatus.get("raw");
        video.hasOriginalSound = false;
        video.hasMusic = this.f106315b != null;
        video.duration = this.f106314a.length;
        video.audio = AudioMedia.new_();
        Video video2 = this.f106314a;
        video.size = new Dimension(video2.width, video2.height);
        if (NullChecker.m81303a(this.f106315b)) {
            MusicContent musicContent = this.f106315b;
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
        mediaMetaNew_.source = "composer";
        mediaMetaNew_.musicId = video.audio.musicId;
        if (video.isLocalMusic) {
            str2 = "android";
        } else if (!NullChecker.m81303a(this.f106315b) || TextUtils.isEmpty(this.f106315b.source)) {
            str2 = null;
        } else {
            String str3 = this.f106315b.source;
            str3.getClass();
            if (str3.equals("brand")) {
                str2 = "official";
            } else if (str3.equals("default")) {
                str2 = "user";
            } else {
                str2 = null;
            }
        }
        MediaMeta mediaMeta = video.meta;
        mediaMeta.musicReference = str2;
        mediaMeta.hasAudio = true;
        mediaMeta.isSameMusic = false;
        arrayList.add(video);
        FeedModule.m60222H().mo30679Dd();
        oe40.m163864t0(act(), arrayList, "", false, "immersion", true);
        act().m66873d2();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
