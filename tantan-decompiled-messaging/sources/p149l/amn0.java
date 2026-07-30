package p149l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletType;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveDefaultBulletView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveSpecialSystemBulletView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class amn0 {

    /* JADX INFO: renamed from: a */
    public Map<VoiceLiveBulletType, VoiceLiveDefaultBulletView> f70634a = new HashMap();

    /* JADX INFO: renamed from: a */
    public VoiceLiveDefaultBulletView m97562a(VoiceLiveBulletType voiceLiveBulletType, ViewGroup viewGroup) {
        VoiceLiveDefaultBulletView voiceLiveDefaultBulletView = this.f70634a.get(voiceLiveBulletType);
        if (voiceLiveDefaultBulletView != null) {
            return voiceLiveDefaultBulletView;
        }
        VoiceLiveDefaultBulletView voiceLiveDefaultBulletView2 = (VoiceLiveDefaultBulletView) LayoutInflater.from(viewGroup.getContext()).inflate(voiceLiveBulletType.getLayoutId(), viewGroup, false);
        this.f70634a.put(voiceLiveBulletType, voiceLiveDefaultBulletView2);
        return voiceLiveDefaultBulletView2;
    }

    /* JADX INFO: renamed from: b */
    public VoiceLiveSpecialSystemBulletView m97563b(ViewGroup viewGroup) {
        return (VoiceLiveSpecialSystemBulletView) LayoutInflater.from(viewGroup.getContext()).inflate(VoiceLiveBulletType.SPECIAL_BULLET_STYLE.getLayoutId(), viewGroup, false);
    }
}
