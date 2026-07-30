package p149l;

import com.p069ss.bytertc.engine.type.VoiceChangerType;
import com.p069ss.bytertc.engine.type.VoiceReverbType;
import io.agora.rtc2.Constants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class fa1 {

    /* JADX INFO: renamed from: d */
    private static volatile fa1 f96551d;

    /* JADX INFO: renamed from: a */
    private HashMap<Integer, Integer> f96552a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private HashMap<Integer, VoiceReverbType> f96553b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private HashMap<Integer, VoiceChangerType> f96554c = new HashMap<>();

    private fa1() {
        this.f96552a.put(0, 0);
        this.f96552a.put(1, Integer.valueOf(Constants.ROOM_ACOUSTICS_KTV));
        this.f96552a.put(2, Integer.valueOf(Constants.ROOM_ACOUSTICS_VOCAL_CONCERT));
        this.f96552a.put(3, Integer.valueOf(Constants.ROOM_ACOUSTICS_STUDIO));
        this.f96552a.put(4, Integer.valueOf(Constants.ROOM_ACOUSTICS_PHONOGRAPH));
        this.f96552a.put(5, Integer.valueOf(Constants.ROOM_ACOUSTICS_VIRTUAL_STEREO));
        this.f96552a.put(6, Integer.valueOf(Constants.ROOM_ACOUSTICS_SPACIAL));
        this.f96552a.put(7, Integer.valueOf(Constants.ROOM_ACOUSTICS_ETHEREAL));
        this.f96552a.put(8, Integer.valueOf(Constants.ROOM_ACOUSTICS_3D_VOICE));
        this.f96552a.put(9, Integer.valueOf(Constants.ROOM_ACOUSTICS_VIRTUAL_SURROUND_SOUND));
        this.f96552a.put(11, Integer.valueOf(Constants.VOICE_CHANGER_EFFECT_UNCLE));
        this.f96552a.put(12, Integer.valueOf(Constants.VOICE_CHANGER_EFFECT_OLDMAN));
        this.f96552a.put(13, Integer.valueOf(Constants.VOICE_CHANGER_EFFECT_BOY));
        this.f96552a.put(14, Integer.valueOf(Constants.VOICE_CHANGER_EFFECT_SISTER));
        this.f96552a.put(15, Integer.valueOf(Constants.VOICE_CHANGER_EFFECT_GIRL));
        this.f96552a.put(16, Integer.valueOf(Constants.VOICE_CHANGER_EFFECT_PIGKING));
        this.f96552a.put(17, Integer.valueOf(Constants.VOICE_CHANGER_EFFECT_HULK));
        this.f96552a.put(18, Integer.valueOf(Constants.STYLE_TRANSFORMATION_RNB));
        this.f96552a.put(19, Integer.valueOf(Constants.STYLE_TRANSFORMATION_POPULAR));
        this.f96552a.put(20, Integer.valueOf(Constants.PITCH_CORRECTION));
        this.f96553b.put(0, VoiceReverbType.VOICE_REVERB_ORIGINAL);
        this.f96553b.put(1, VoiceReverbType.VOICE_REVERB_KTV);
        this.f96553b.put(2, VoiceReverbType.VOICE_REVERB_CONCERT);
        this.f96553b.put(3, VoiceReverbType.VOICE_REVERB_STUDIO);
        this.f96553b.put(4, VoiceReverbType.VOICE_REVERB_OLDRECORD);
        this.f96553b.put(5, VoiceReverbType.VOICE_REVERB_VIRTUAL_STEREO);
        this.f96553b.put(6, VoiceReverbType.VOICE_REVERB_SPACIOUS);
        this.f96553b.put(7, VoiceReverbType.VOICE_REVERB_ETHEREAL);
        this.f96553b.put(8, VoiceReverbType.VOICE_REVERB_3D);
        this.f96553b.put(10, VoiceReverbType.VOICE_REVERB_ECHO);
        this.f96553b.put(18, VoiceReverbType.VOICE_REVERB_BLUES);
        this.f96553b.put(19, VoiceReverbType.VOICE_REVERB_POP);
        this.f96554c.put(16, VoiceChangerType.VOICE_CHANGER_GIANT);
        this.f96554c.put(13, VoiceChangerType.VOICE_CHANGER_BARITONE);
        this.f96554c.put(15, VoiceChangerType.VOICE_CHANGER_SWEET_GIRL);
    }

    /* JADX INFO: renamed from: b */
    public static fa1 m120138b() {
        if (f96551d == null) {
            synchronized (fa1.class) {
                try {
                    if (f96551d == null) {
                        f96551d = new fa1();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f96551d;
    }

    /* JADX INFO: renamed from: a */
    public int m120139a(int i) {
        Integer num;
        if (!this.f96552a.containsKey(Integer.valueOf(i)) || (num = this.f96552a.get(Integer.valueOf(i))) == null) {
            return -1;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: c */
    public VoiceReverbType m120140c(int i) {
        if (this.f96553b.containsKey(Integer.valueOf(i))) {
            return this.f96553b.get(Integer.valueOf(i));
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public VoiceChangerType m120141d(int i) {
        if (this.f96554c.containsKey(Integer.valueOf(i))) {
            return this.f96554c.get(Integer.valueOf(i));
        }
        return null;
    }
}
