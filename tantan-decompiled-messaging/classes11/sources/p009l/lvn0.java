package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceLiveRoomBgSettingItemView;
import com.p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.tantanapp.common.utils.NullChecker;
import l.d1q;
import l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lvn0 extends d1q<VoiceLiveRoomBgSettingItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveVoiceBackGroundPics f16425a;

    /* JADX INFO: renamed from: b */
    public String f16426b;

    /* JADX INFO: renamed from: c */
    public Runnable f16427c;

    public lvn0(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, String str) {
        this.f16425a = bLiveVoiceBackGroundPics;
        this.f16426b = str;
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m18062u(VoiceLiveRoomBgSettingItemView voiceLiveRoomBgSettingItemView) {
        super.u(voiceLiveRoomBgSettingItemView);
        BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics = this.f16425a;
        bLiveVoiceBackGroundPics.check = bLiveVoiceBackGroundPics.check && "me".equals(this.f16426b);
        voiceLiveRoomBgSettingItemView.m8623g(this.f16425a, "me".equals(this.f16426b), this.f16427c);
    }

    /* JADX INFO: renamed from: I */
    public void m18060I(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        if (!NullChecker.a(bLiveVoiceBackGroundPics) || TextUtils.isEmpty(bLiveVoiceBackGroundPics.id)) {
            return;
        }
        boolean zEquals = bLiveVoiceBackGroundPics.id.equals(this.f16425a.id);
        BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics2 = this.f16425a;
        if (zEquals) {
            bLiveVoiceBackGroundPics2.check = true;
        } else {
            bLiveVoiceBackGroundPics2.check = false;
        }
    }

    /* JADX INFO: renamed from: o */
    public int m18061o() {
        return t6c0.ca;
    }

    public lvn0(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, String str, Runnable runnable) {
        this(bLiveVoiceBackGroundPics, str);
        this.f16427c = runnable;
    }
}
