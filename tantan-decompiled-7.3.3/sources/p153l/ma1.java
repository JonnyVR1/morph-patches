package p153l;

import com.p074ss.bytertc.engine.type.VoiceChangerType;
import com.p074ss.bytertc.engine.type.VoiceReverbType;
import io.agora.rtc2.Constants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public class ma1 {

    /* JADX INFO: renamed from: d */
    private static volatile ma1 f135459d;

    /* JADX INFO: renamed from: a */
    private HashMap<Integer, Integer> f135460a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private HashMap<Integer, VoiceReverbType> f135461b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private HashMap<Integer, VoiceChangerType> f135462c = new HashMap<>();

    private ma1() {
        this.f135460a.put(0, 0);
        this.f135460a.put(1, Integer.valueOf(Constants.ROOM_ACOUSTICS_KTV));
        this.f135460a.put(2, Integer.valueOf(Constants.ROOM_ACOUSTICS_VOCAL_CONCERT));
        this.f135460a.put(3, Integer.valueOf(Constants.ROOM_ACOUSTICS_STUDIO));
        this.f135460a.put(4, Integer.valueOf(Constants.ROOM_ACOUSTICS_PHONOGRAPH));
        this.f135460a.put(5, Integer.valueOf(Constants.ROOM_ACOUSTICS_VIRTUAL_STEREO));
        this.f135460a.put(6, Integer.valueOf(Constants.ROOM_ACOUSTICS_SPACIAL));
        this.f135460a.put(7, Integer.valueOf(Constants.ROOM_ACOUSTICS_ETHEREAL));
        this.f135460a.put(8, Integer.valueOf(Constants.ROOM_ACOUSTICS_3D_VOICE));
        this.f135460a.put(9, Integer.valueOf(Constants.ROOM_ACOUSTICS_VIRTUAL_SURROUND_SOUND));
        this.f135460a.put(11, Integer.valueOf(Constants.VOICE_CHANGER_EFFECT_UNCLE));
        this.f135460a.put(12, Integer.valueOf(Constants.VOICE_CHANGER_EFFECT_OLDMAN));
        this.f135460a.put(13, Integer.valueOf(Constants.VOICE_CHANGER_EFFECT_BOY));
        this.f135460a.put(14, Integer.valueOf(Constants.VOICE_CHANGER_EFFECT_SISTER));
        this.f135460a.put(15, Integer.valueOf(Constants.VOICE_CHANGER_EFFECT_GIRL));
        this.f135460a.put(16, Integer.valueOf(Constants.VOICE_CHANGER_EFFECT_PIGKING));
        this.f135460a.put(17, Integer.valueOf(Constants.VOICE_CHANGER_EFFECT_HULK));
        this.f135460a.put(18, Integer.valueOf(Constants.STYLE_TRANSFORMATION_RNB));
        this.f135460a.put(19, Integer.valueOf(Constants.STYLE_TRANSFORMATION_POPULAR));
        this.f135460a.put(20, Integer.valueOf(Constants.PITCH_CORRECTION));
        this.f135461b.put(0, VoiceReverbType.VOICE_REVERB_ORIGINAL);
        this.f135461b.put(1, VoiceReverbType.VOICE_REVERB_KTV);
        this.f135461b.put(2, VoiceReverbType.VOICE_REVERB_CONCERT);
        this.f135461b.put(3, VoiceReverbType.VOICE_REVERB_STUDIO);
        this.f135461b.put(4, VoiceReverbType.VOICE_REVERB_OLDRECORD);
        this.f135461b.put(5, VoiceReverbType.VOICE_REVERB_VIRTUAL_STEREO);
        this.f135461b.put(6, VoiceReverbType.VOICE_REVERB_SPACIOUS);
        this.f135461b.put(7, VoiceReverbType.VOICE_REVERB_ETHEREAL);
        this.f135461b.put(8, VoiceReverbType.VOICE_REVERB_3D);
        this.f135461b.put(10, VoiceReverbType.VOICE_REVERB_ECHO);
        this.f135461b.put(18, VoiceReverbType.VOICE_REVERB_BLUES);
        this.f135461b.put(19, VoiceReverbType.VOICE_REVERB_POP);
        this.f135462c.put(16, VoiceChangerType.VOICE_CHANGER_GIANT);
        this.f135462c.put(13, VoiceChangerType.VOICE_CHANGER_BARITONE);
        this.f135462c.put(15, VoiceChangerType.VOICE_CHANGER_SWEET_GIRL);
    }

    /* JADX INFO: renamed from: b */
    public static ma1 m157614b() {
        if (f135459d == null) {
            synchronized (ma1.class) {
                try {
                    if (f135459d == null) {
                        f135459d = new ma1();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f135459d;
    }

    /* JADX INFO: renamed from: a */
    public int m157615a(int i) {
        Integer num;
        if (!this.f135460a.containsKey(Integer.valueOf(i)) || (num = this.f135460a.get(Integer.valueOf(i))) == null) {
            return -1;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: c */
    public VoiceReverbType m157616c(int i) {
        if (this.f135461b.containsKey(Integer.valueOf(i))) {
            return this.f135461b.get(Integer.valueOf(i));
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public VoiceChangerType m157617d(int i) {
        if (this.f135462c.containsKey(Integer.valueOf(i))) {
            return this.f135462c.get(Integer.valueOf(i));
        }
        return null;
    }
}
