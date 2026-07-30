package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceLiveRoomBgSettingItemView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class p4o0 extends d3q<VoiceLiveRoomBgSettingItemView> {

    /* JADX INFO: renamed from: a */
    public BLiveVoiceBackGroundPics f150552a;

    /* JADX INFO: renamed from: b */
    public String f150553b;

    /* JADX INFO: renamed from: c */
    public Runnable f150554c;

    public p4o0(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, String str) {
        this.f150552a = bLiveVoiceBackGroundPics;
        this.f150553b = str;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceLiveRoomBgSettingItemView voiceLiveRoomBgSettingItemView) {
        super.mo71749u(voiceLiveRoomBgSettingItemView);
        BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics = this.f150552a;
        bLiveVoiceBackGroundPics.check = bLiveVoiceBackGroundPics.check && "me".equals(this.f150553b);
        voiceLiveRoomBgSettingItemView.m79603g(this.f150552a, "me".equals(this.f150553b), this.f150554c);
    }

    /* JADX INFO: renamed from: I */
    public void m170575I(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        if (!NullChecker.m82486a(bLiveVoiceBackGroundPics) || TextUtils.isEmpty(bLiveVoiceBackGroundPics.f45331id)) {
            return;
        }
        boolean zEquals = bLiveVoiceBackGroundPics.f45331id.equals(this.f150552a.f45331id);
        BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics2 = this.f150552a;
        if (zEquals) {
            bLiveVoiceBackGroundPics2.check = true;
        } else {
            bLiveVoiceBackGroundPics2.check = false;
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199040ca;
    }

    public p4o0(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, String str, Runnable runnable) {
        this(bLiveVoiceBackGroundPics, str);
        this.f150554c = runnable;
    }
}
