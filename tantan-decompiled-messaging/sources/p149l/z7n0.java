package p149l;

import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class z7n0 extends bk2<VoiceFunnyAvatar.VoiceLivePhotoSticker, VoiceFunnyAvatar.VoiceLivePhotoSticker> {

    /* JADX INFO: renamed from: h */
    public final HashMap<String, Long> f202043h;

    public z7n0(p3g0<VoiceFunnyAvatar.VoiceLivePhotoSticker, VoiceFunnyAvatar.VoiceLivePhotoSticker> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
        this.f202043h = new HashMap<>();
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(VoiceFunnyAvatar.VoiceLivePhotoSticker voiceLivePhotoSticker, String str) {
        String userId = voiceLivePhotoSticker.getUserId();
        boolean zContainsKey = this.f202043h.containsKey(userId);
        HashMap<String, Long> map = this.f202043h;
        if (!zContainsKey) {
            map.put(userId, Long.valueOf(voiceLivePhotoSticker.getServerTimeInSeconds()));
            return true;
        }
        if (map.get(userId).longValue() >= voiceLivePhotoSticker.getServerTimeInSeconds()) {
            return false;
        }
        this.f202043h.put(userId, Long.valueOf(voiceLivePhotoSticker.getServerTimeInSeconds()));
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<VoiceFunnyAvatar.VoiceLivePhotoSticker> mo94398b() {
        return VoiceFunnyAvatar.VoiceLivePhotoSticker.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voice.live.photo.sticker";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceFunnyAvatar.VoiceLivePhotoSticker mo94461z(String str, VoiceFunnyAvatar.VoiceLivePhotoSticker voiceLivePhotoSticker) {
        return voiceLivePhotoSticker;
    }
}
