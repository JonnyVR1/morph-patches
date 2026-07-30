package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveDefaultBulletView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VMarqueeText;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class swn0 {
    /* JADX INFO: renamed from: a */
    public static void m188332a(VoiceLiveDefaultBulletView voiceLiveDefaultBulletView, View view) {
        voiceLiveDefaultBulletView.f54062d = (VoiceLiveDefaultBulletView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveDefaultBulletView.f54063e = (RelativeLayout) viewGroup.getChildAt(0);
        voiceLiveDefaultBulletView.f54064f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceLiveDefaultBulletView.f54065g = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceLiveDefaultBulletView.f54066h = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceLiveDefaultBulletView.f54067i = (VDraweeView) viewGroup.getChildAt(1);
    }
}
