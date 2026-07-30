package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveDefaultBulletView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VMarqueeText;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class onn0 {
    /* JADX INFO: renamed from: a */
    public static void m165215a(VoiceLiveDefaultBulletView voiceLiveDefaultBulletView, View view) {
        voiceLiveDefaultBulletView.f53214d = (VoiceLiveDefaultBulletView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveDefaultBulletView.f53215e = (RelativeLayout) viewGroup.getChildAt(0);
        voiceLiveDefaultBulletView.f53216f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceLiveDefaultBulletView.f53217g = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceLiveDefaultBulletView.f53218h = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceLiveDefaultBulletView.f53219i = (VDraweeView) viewGroup.getChildAt(1);
    }
}
