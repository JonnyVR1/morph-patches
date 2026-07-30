package p153l;

import com.immomo.moment.mediautils.cmds.AudioBackground;
import com.immomo.moment.mediautils.cmds.AudioEffects;
import com.immomo.moment.mediautils.cmds.EffectModel;
import com.immomo.moment.mediautils.cmds.VideoCut;
import com.immomo.moment.mediautils.cmds.VideoEffects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class dr00 {

    /* JADX INFO: renamed from: l.dr00$a */
    public static final class C16607a {

        /* JADX INFO: renamed from: a */
        private String f90331a;

        /* JADX INFO: renamed from: b */
        private VideoEffects f90332b;

        /* JADX INFO: renamed from: c */
        private List<VideoCut> f90333c;

        /* JADX INFO: renamed from: d */
        private AudioEffects f90334d;

        /* JADX INFO: renamed from: e */
        private AudioEffects.C3989a f90335e;

        /* JADX INFO: renamed from: f */
        private List<AudioBackground> f90336f;

        public C16607a(String str) {
            this.f90331a = str;
        }

        /* JADX INFO: renamed from: a */
        public C16607a m117655a(AudioBackground audioBackground) {
            if (this.f90336f == null) {
                this.f90336f = new ArrayList();
                if (this.f90334d == null) {
                    this.f90334d = new AudioEffects();
                }
                this.f90334d.setAudioBackgrounds(this.f90336f);
            }
            this.f90336f.add(audioBackground);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C16607a m117656b(String str, float f, int i, int i2, boolean z) {
            AudioBackground audioBackground = new AudioBackground();
            audioBackground.setBgPath(str);
            audioBackground.setRatio(f);
            audioBackground.setStart(i);
            audioBackground.setEnd(i2);
            audioBackground.setCycle(z);
            return m117655a(audioBackground);
        }

        /* JADX INFO: renamed from: c */
        public C16607a m117657c(Collection<VideoCut> collection) {
            if (collection != null) {
                if (this.f90333c == null) {
                    this.f90333c = new ArrayList();
                    if (this.f90332b == null) {
                        this.f90332b = new VideoEffects();
                    }
                    this.f90332b.setVideoCuts(this.f90333c);
                }
                this.f90333c.addAll(collection);
            }
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final EffectModel m117658d() {
            EffectModel effectModel = new EffectModel();
            effectModel.setMediaPath(this.f90331a);
            if (this.f90332b == null) {
                this.f90332b = new VideoEffects();
            }
            effectModel.setVideoEffects(this.f90332b);
            if (this.f90334d == null) {
                this.f90334d = new AudioEffects();
            }
            effectModel.setAudioEffects(this.f90334d);
            return effectModel;
        }

        /* JADX INFO: renamed from: e */
        public C16607a m117659e(float f, boolean z) {
            if (this.f90335e == null) {
                this.f90335e = new AudioEffects.C3989a();
                if (this.f90334d == null) {
                    this.f90334d = new AudioEffects();
                }
                this.f90334d.setAudioSource(this.f90335e);
            }
            this.f90335e.m19694b(z);
            this.f90335e.m19695c(f);
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C16607a m117652a(String str) {
        return new C16607a(str);
    }

    /* JADX INFO: renamed from: b */
    public static final EffectModel m117653b(String str, float f, List<VideoCut> list) {
        return m117652a(str).m117657c(list).m117659e(f, true).m117658d();
    }

    /* JADX INFO: renamed from: c */
    public static final EffectModel m117654c(String str, float f, String str2, float f2, int i, int i2, List<VideoCut> list) {
        return m117652a(str).m117659e(f, true).m117657c(list).m117656b(str2, f2, i, i2, true).m117658d();
    }
}
