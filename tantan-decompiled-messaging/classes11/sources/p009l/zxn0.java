package p009l;

import com.p000p1.mobile.putong.live.livingroom.voice.intl.medalwall.view.VoiceMedalWallItemView;
import com.p1.mobile.putong.live.base.data.BLiveIntlMedalWallItem;
import l.d1q;
import l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zxn0 extends d1q<VoiceMedalWallItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveIntlMedalWallItem f24030a;

    /* JADX INFO: renamed from: b */
    public boolean f24031b;

    public zxn0(BLiveIntlMedalWallItem bLiveIntlMedalWallItem, int i) {
        this.f24030a = bLiveIntlMedalWallItem;
        this.f24031b = i == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m26125u(VoiceMedalWallItemView voiceMedalWallItemView) {
        super.u(voiceMedalWallItemView);
        voiceMedalWallItemView.m8466Q(this.f24030a, this.f24031b);
    }

    /* JADX INFO: renamed from: o */
    public int m26124o() {
        return t6c0.E9;
    }
}
