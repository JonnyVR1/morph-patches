package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceLiveRoomBgSettingItemView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class lvn0 extends d1q<VoiceLiveRoomBgSettingItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveVoiceBackGroundPics f130177a;

    /* JADX INFO: renamed from: b */
    public String f130178b;

    /* JADX INFO: renamed from: c */
    public Runnable f130179c;

    public lvn0(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, String str) {
        this.f130177a = bLiveVoiceBackGroundPics;
        this.f130178b = str;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceLiveRoomBgSettingItemView voiceLiveRoomBgSettingItemView) {
        super.mo70566u(voiceLiveRoomBgSettingItemView);
        BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics = this.f130177a;
        bLiveVoiceBackGroundPics.check = bLiveVoiceBackGroundPics.check && "me".equals(this.f130178b);
        voiceLiveRoomBgSettingItemView.m78420g(this.f130177a, "me".equals(this.f130178b), this.f130179c);
    }

    /* JADX INFO: renamed from: I */
    public void m151902I(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        if (!NullChecker.m81303a(bLiveVoiceBackGroundPics) || TextUtils.isEmpty(bLiveVoiceBackGroundPics.f44483id)) {
            return;
        }
        boolean zEquals = bLiveVoiceBackGroundPics.f44483id.equals(this.f130177a.f44483id);
        BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics2 = this.f130177a;
        if (zEquals) {
            bLiveVoiceBackGroundPics2.check = true;
        } else {
            bLiveVoiceBackGroundPics2.check = false;
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168308ca;
    }

    public lvn0(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, String str, Runnable runnable) {
        this(bLiveVoiceBackGroundPics, str);
        this.f130179c = runnable;
    }
}
