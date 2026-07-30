package p153l;

import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class dhn0 extends jk2<VoiceFunnyAvatar.VoiceLivePhotoSticker, VoiceFunnyAvatar.VoiceLivePhotoSticker> {

    /* JADX INFO: renamed from: h */
    public final HashMap<String, Long> f88545h;

    public dhn0(wbg0<VoiceFunnyAvatar.VoiceLivePhotoSticker, VoiceFunnyAvatar.VoiceLivePhotoSticker> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
        this.f88545h = new HashMap<>();
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(VoiceFunnyAvatar.VoiceLivePhotoSticker voiceLivePhotoSticker, String str) {
        String userId = voiceLivePhotoSticker.getUserId();
        boolean zContainsKey = this.f88545h.containsKey(userId);
        HashMap<String, Long> map = this.f88545h;
        if (!zContainsKey) {
            map.put(userId, Long.valueOf(voiceLivePhotoSticker.getServerTimeInSeconds()));
            return true;
        }
        if (map.get(userId).longValue() >= voiceLivePhotoSticker.getServerTimeInSeconds()) {
            return false;
        }
        this.f88545h.put(userId, Long.valueOf(voiceLivePhotoSticker.getServerTimeInSeconds()));
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<VoiceFunnyAvatar.VoiceLivePhotoSticker> mo95510b() {
        return VoiceFunnyAvatar.VoiceLivePhotoSticker.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voice.live.photo.sticker";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceFunnyAvatar.VoiceLivePhotoSticker mo95993z(String str, VoiceFunnyAvatar.VoiceLivePhotoSticker voiceLivePhotoSticker) {
        return voiceLivePhotoSticker;
    }
}
