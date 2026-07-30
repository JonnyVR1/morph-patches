package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveDefaultBulletView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class onn0 {
    /* JADX INFO: renamed from: a */
    public static void m19643a(VoiceLiveDefaultBulletView voiceLiveDefaultBulletView, View view) {
        voiceLiveDefaultBulletView.d = (VoiceLiveDefaultBulletView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveDefaultBulletView.e = (RelativeLayout) viewGroup.getChildAt(0);
        voiceLiveDefaultBulletView.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceLiveDefaultBulletView.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceLiveDefaultBulletView.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceLiveDefaultBulletView.i = viewGroup.getChildAt(1);
    }
}
