package p149l;

import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;

/* JADX INFO: loaded from: classes12.dex */
public class up10 {
    /* JADX INFO: renamed from: a */
    public static MusicContent m194583a(String str, Music music) throws Throwable {
        int iM113513e = dt10.m113513e(str);
        MusicContent musicContent = new MusicContent();
        musicContent.artist = music.describe;
        musicContent.f53979id = music.f38781id;
        musicContent.name = music.name;
        musicContent.path = str;
        musicContent.length = iM113513e;
        musicContent.startMillTime = 0;
        musicContent.endMillTime = iM113513e;
        musicContent.uri = music.audio.url;
        musicContent.type = 2;
        musicContent.source = music.source;
        return musicContent;
    }
}
