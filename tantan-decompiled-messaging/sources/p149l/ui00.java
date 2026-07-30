package p149l;

import com.immomo.moment.mediautils.cmds.AudioBackground;
import com.immomo.moment.mediautils.cmds.AudioEffects;
import com.immomo.moment.mediautils.cmds.EffectModel;
import com.immomo.moment.mediautils.cmds.VideoCut;
import com.immomo.moment.mediautils.cmds.VideoEffects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ui00 {

    /* JADX INFO: renamed from: l.ui00$a */
    public static final class C20435a {

        /* JADX INFO: renamed from: a */
        private String f176612a;

        /* JADX INFO: renamed from: b */
        private VideoEffects f176613b;

        /* JADX INFO: renamed from: c */
        private List<VideoCut> f176614c;

        /* JADX INFO: renamed from: d */
        private AudioEffects f176615d;

        /* JADX INFO: renamed from: e */
        private AudioEffects.C3846a f176616e;

        /* JADX INFO: renamed from: f */
        private List<AudioBackground> f176617f;

        public C20435a(String str) {
            this.f176612a = str;
        }

        /* JADX INFO: renamed from: a */
        public C20435a m193837a(AudioBackground audioBackground) {
            if (this.f176617f == null) {
                this.f176617f = new ArrayList();
                if (this.f176615d == null) {
                    this.f176615d = new AudioEffects();
                }
                this.f176615d.setAudioBackgrounds(this.f176617f);
            }
            this.f176617f.add(audioBackground);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C20435a m193838b(String str, float f, int i, int i2, boolean z) {
            AudioBackground audioBackground = new AudioBackground();
            audioBackground.setBgPath(str);
            audioBackground.setRatio(f);
            audioBackground.setStart(i);
            audioBackground.setEnd(i2);
            audioBackground.setCycle(z);
            return m193837a(audioBackground);
        }

        /* JADX INFO: renamed from: c */
        public C20435a m193839c(Collection<VideoCut> collection) {
            if (collection != null) {
                if (this.f176614c == null) {
                    this.f176614c = new ArrayList();
                    if (this.f176613b == null) {
                        this.f176613b = new VideoEffects();
                    }
                    this.f176613b.setVideoCuts(this.f176614c);
                }
                this.f176614c.addAll(collection);
            }
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final EffectModel m193840d() {
            EffectModel effectModel = new EffectModel();
            effectModel.setMediaPath(this.f176612a);
            if (this.f176613b == null) {
                this.f176613b = new VideoEffects();
            }
            effectModel.setVideoEffects(this.f176613b);
            if (this.f176615d == null) {
                this.f176615d = new AudioEffects();
            }
            effectModel.setAudioEffects(this.f176615d);
            return effectModel;
        }

        /* JADX INFO: renamed from: e */
        public C20435a m193841e(float f, boolean z) {
            if (this.f176616e == null) {
                this.f176616e = new AudioEffects.C3846a();
                if (this.f176615d == null) {
                    this.f176615d = new AudioEffects();
                }
                this.f176615d.setAudioSource(this.f176616e);
            }
            this.f176616e.m18714b(z);
            this.f176616e.m18715c(f);
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C20435a m193834a(String str) {
        return new C20435a(str);
    }

    /* JADX INFO: renamed from: b */
    public static final EffectModel m193835b(String str, float f, List<VideoCut> list) {
        return m193834a(str).m193839c(list).m193841e(f, true).m193840d();
    }

    /* JADX INFO: renamed from: c */
    public static final EffectModel m193836c(String str, float f, String str2, float f2, int i, int i2, List<VideoCut> list) {
        return m193834a(str).m193841e(f, true).m193839c(list).m193838b(str2, f2, i, i2, true).m193840d();
    }
}
