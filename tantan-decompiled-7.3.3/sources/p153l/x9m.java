package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.AudioMedia;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.MediaMeta;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.camera.IVVideoEditFrag;
import com.p051p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes13.dex */
public class x9m extends ar2<IVVideoEditFrag> {

    /* JADX INFO: renamed from: a */
    public Video f192949a;

    /* JADX INFO: renamed from: b */
    public MusicContent f192950b;

    public x9m(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: e0 */
    public void m209803e0(Video video) {
        if (video.isChosenFromLocal) {
            return;
        }
        File file = new File(video.path);
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m209804f0(MusicContent musicContent, Video video) {
        this.f192950b = musicContent;
        this.f192949a = video;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX INFO: renamed from: g0 */
    public void m209805g0(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        com.p051p1.mobile.putong.data.Video video = new com.p051p1.mobile.putong.data.Video();
        video.url = str;
        video.originUrl = this.f192949a.path;
        video.isFromNewCamera = true;
        video.mediaType = "video/*";
        video.status = MediaLocalStatus.get("raw");
        video.hasOriginalSound = false;
        video.hasMusic = this.f192950b != null;
        video.duration = this.f192949a.length;
        video.audio = AudioMedia.new_();
        Video video2 = this.f192949a;
        video.size = new Dimension(video2.width, video2.height);
        if (NullChecker.m82486a(this.f192950b)) {
            MusicContent musicContent = this.f192950b;
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
        mediaMetaNew_.source = "composer";
        mediaMetaNew_.musicId = video.audio.musicId;
        if (video.isLocalMusic) {
            str2 = "android";
        } else if (!NullChecker.m82486a(this.f192950b) || TextUtils.isEmpty(this.f192950b.source)) {
            str2 = null;
        } else {
            String str3 = this.f192950b.source;
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
        FeedModule.m61406H().mo31682Dd();
        cn40.m111414t0(act(), arrayList, "", false, "immersion", true);
        act().m68056e2();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
