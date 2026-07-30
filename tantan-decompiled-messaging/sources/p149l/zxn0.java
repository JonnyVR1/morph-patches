package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveIntlMedalWallItem;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.medalwall.view.VoiceMedalWallItemView;

/* JADX INFO: loaded from: classes11.dex */
public class zxn0 extends d1q<VoiceMedalWallItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveIntlMedalWallItem f205474a;

    /* JADX INFO: renamed from: b */
    public boolean f205475b;

    public zxn0(BLiveIntlMedalWallItem bLiveIntlMedalWallItem, int i) {
        this.f205474a = bLiveIntlMedalWallItem;
        this.f205475b = i == 1;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceMedalWallItemView voiceMedalWallItemView) {
        super.mo70566u(voiceMedalWallItemView);
        voiceMedalWallItemView.m78277Q(this.f205474a, this.f205475b);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168017E9;
    }
}
