package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveSpecialSystemBulletView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VMarqueeText;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class b5o0 {
    /* JADX INFO: renamed from: a */
    public static void m102620a(VoiceLiveSpecialSystemBulletView voiceLiveSpecialSystemBulletView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveSpecialSystemBulletView.f54068a = (ConstraintLayout) viewGroup.getChildAt(0);
        voiceLiveSpecialSystemBulletView.f54069b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceLiveSpecialSystemBulletView.f54070c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceLiveSpecialSystemBulletView.f54071d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceLiveSpecialSystemBulletView.f54072e = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        voiceLiveSpecialSystemBulletView.f54073f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        voiceLiveSpecialSystemBulletView.f54074g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        voiceLiveSpecialSystemBulletView.f54075h = (VDraweeView) viewGroup.getChildAt(1);
    }
}
