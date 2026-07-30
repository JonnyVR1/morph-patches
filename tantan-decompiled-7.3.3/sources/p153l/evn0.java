package p153l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletType;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveDefaultBulletView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveSpecialSystemBulletView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class evn0 {

    /* JADX INFO: renamed from: a */
    public Map<VoiceLiveBulletType, VoiceLiveDefaultBulletView> f96015a = new HashMap();

    /* JADX INFO: renamed from: a */
    public VoiceLiveDefaultBulletView m122801a(VoiceLiveBulletType voiceLiveBulletType, ViewGroup viewGroup) {
        VoiceLiveDefaultBulletView voiceLiveDefaultBulletView = this.f96015a.get(voiceLiveBulletType);
        if (voiceLiveDefaultBulletView != null) {
            return voiceLiveDefaultBulletView;
        }
        VoiceLiveDefaultBulletView voiceLiveDefaultBulletView2 = (VoiceLiveDefaultBulletView) LayoutInflater.from(viewGroup.getContext()).inflate(voiceLiveBulletType.getLayoutId(), viewGroup, false);
        this.f96015a.put(voiceLiveBulletType, voiceLiveDefaultBulletView2);
        return voiceLiveDefaultBulletView2;
    }

    /* JADX INFO: renamed from: b */
    public VoiceLiveSpecialSystemBulletView m122802b(ViewGroup viewGroup) {
        return (VoiceLiveSpecialSystemBulletView) LayoutInflater.from(viewGroup.getContext()).inflate(VoiceLiveBulletType.SPECIAL_BULLET_STYLE.getLayoutId(), viewGroup, false);
    }
}
