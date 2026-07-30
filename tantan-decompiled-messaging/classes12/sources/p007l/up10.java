package p007l;

import com.p000p1.mobile.putong.data.Music;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class up10 {
    /* JADX INFO: renamed from: a */
    public static MusicContent m15127a(String str, Music music) throws Throwable {
        int iM9569e = dt10.m9569e(str);
        MusicContent musicContent = new MusicContent();
        musicContent.artist = music.describe;
        musicContent.id = music.f242id;
        musicContent.name = music.name;
        musicContent.path = str;
        musicContent.length = iM9569e;
        musicContent.startMillTime = 0;
        musicContent.endMillTime = iM9569e;
        musicContent.uri = music.audio.url;
        musicContent.type = 2;
        musicContent.source = music.source;
        return musicContent;
    }
}
