package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.AudioMedia;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.MediaMeta;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.camera.IVVideoEditFrag;
import com.p000p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import l.jq2;
import l.mcr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class h7m extends jq2<IVVideoEditFrag> {

    /* JADX INFO: renamed from: a */
    public Video f8620a;

    /* JADX INFO: renamed from: b */
    public MusicContent f8621b;

    public h7m(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: e0 */
    public void m10554e0(Video video) {
        if (video.isChosenFromLocal) {
            return;
        }
        File file = new File(video.path);
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m10555f0(MusicContent musicContent, Video video) {
        this.f8621b = musicContent;
        this.f8620a = video;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX INFO: renamed from: g0 */
    public void m10556g0(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        com.p000p1.mobile.putong.data.Video video = new com.p000p1.mobile.putong.data.Video();
        video.url = str;
        video.originUrl = this.f8620a.path;
        video.isFromNewCamera = true;
        video.mediaType = "video/*";
        video.status = MediaLocalStatus.get(MediaLocalStatus.raw);
        video.hasOriginalSound = false;
        video.hasMusic = this.f8621b != null;
        video.duration = this.f8620a.length;
        video.audio = AudioMedia.new_();
        Video video2 = this.f8620a;
        video.size = new Dimension(video2.width, video2.height);
        if (NullChecker.a(this.f8621b)) {
            MusicContent musicContent = this.f8621b;
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
        mediaMetaNew_.source = "composer";
        mediaMetaNew_.musicId = video.audio.musicId;
        if (video.isLocalMusic) {
            str2 = "android";
        } else if (!NullChecker.a(this.f8621b) || TextUtils.isEmpty(this.f8621b.source)) {
            str2 = null;
        } else {
            String str3 = this.f8621b.source;
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
        FeedModule.m1140H().Dd();
        oe40.m12601t0(act(), arrayList, "", false, "immersion", true);
        act().finish();
    }

    public void destroy() {
    }
}
