package p153l;

import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;

/* JADX INFO: loaded from: classes13.dex */
public class cy10 {
    /* JADX INFO: renamed from: a */
    public static MusicContent m113085a(String str, Music music) throws Throwable {
        int iM152422e = l120.m152422e(str);
        MusicContent musicContent = new MusicContent();
        musicContent.artist = music.describe;
        musicContent.f54827id = music.f39629id;
        musicContent.name = music.name;
        musicContent.path = str;
        musicContent.length = iM152422e;
        musicContent.startMillTime = 0;
        musicContent.endMillTime = iM152422e;
        musicContent.uri = music.audio.url;
        musicContent.type = 2;
        musicContent.source = music.source;
        return musicContent;
    }
}
