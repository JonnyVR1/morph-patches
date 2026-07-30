package p002l;

import com.p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar;
import java.util.HashMap;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class z7n0 extends bk2<VoiceFunnyAvatar.VoiceLivePhotoSticker, VoiceFunnyAvatar.VoiceLivePhotoSticker> {

    /* JADX INFO: renamed from: h */
    public final HashMap<String, Long> f23294h;

    public z7n0(p3g0<VoiceFunnyAvatar.VoiceLivePhotoSticker, VoiceFunnyAvatar.VoiceLivePhotoSticker> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
        this.f23294h = new HashMap<>();
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(VoiceFunnyAvatar.VoiceLivePhotoSticker voiceLivePhotoSticker, String str) {
        String userId = voiceLivePhotoSticker.getUserId();
        boolean zContainsKey = this.f23294h.containsKey(userId);
        HashMap<String, Long> map = this.f23294h;
        if (!zContainsKey) {
            map.put(userId, Long.valueOf(voiceLivePhotoSticker.getServerTimeInSeconds()));
            return true;
        }
        if (map.get(userId).longValue() >= voiceLivePhotoSticker.getServerTimeInSeconds()) {
            return false;
        }
        this.f23294h.put(userId, Long.valueOf(voiceLivePhotoSticker.getServerTimeInSeconds()));
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<VoiceFunnyAvatar.VoiceLivePhotoSticker> mo9244b() {
        return VoiceFunnyAvatar.VoiceLivePhotoSticker.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voice.live.photo.sticker";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceFunnyAvatar.VoiceLivePhotoSticker mo9251z(String str, VoiceFunnyAvatar.VoiceLivePhotoSticker voiceLivePhotoSticker) {
        return voiceLivePhotoSticker;
    }
}
