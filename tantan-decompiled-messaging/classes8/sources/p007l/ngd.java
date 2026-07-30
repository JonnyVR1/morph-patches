package p007l;

import android.media.MediaFormat;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.immomo.mediabase.AudioParameter;
import com.immomo.mediabase.AudioResampleUtils;
import com.immomo.mediabase.DecodeAudioFile;
import com.immomo.mediabase.DecodeAudioFileListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ngd implements DecodeAudioFileListener {

    /* JADX INFO: renamed from: d */
    private DecodeAudioFile f3402d;

    /* JADX INFO: renamed from: e */
    private AudioParameter f3403e;

    /* JADX INFO: renamed from: f */
    private AudioParameter f3404f;

    /* JADX INFO: renamed from: a */
    private boolean f3399a = false;

    /* JADX INFO: renamed from: b */
    private String f3400b = "";

    /* JADX INFO: renamed from: c */
    private String f3401c = "";

    /* JADX INFO: renamed from: g */
    private boolean f3405g = false;

    /* JADX INFO: renamed from: h */
    private AudioResampleUtils f3406h = null;

    /* JADX INFO: renamed from: i */
    FileOutputStream f3407i = null;

    /* JADX INFO: renamed from: j */
    InterfaceC0623a f3408j = null;

    /* JADX INFO: renamed from: k */
    private boolean f3409k = false;

    /* JADX INFO: renamed from: l.ngd$a */
    public interface InterfaceC0623a {
        /* JADX INFO: renamed from: a */
        void mo9989a();

        /* JADX INFO: renamed from: b */
        void mo9990b();

        /* JADX INFO: renamed from: c */
        void mo9991c(long j);

        /* JADX INFO: renamed from: d */
        void mo9992d(int i, String str);
    }

    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: a */
    public boolean m9986a(String str, String str2, int i, int i2, int i3) {
        AudioParameter audioParameter;
        Log.e("HUOHL_DecodePcmFromFile", "decodeUrl: Start");
        this.f3400b = str;
        this.f3401c = str2;
        File file = new File(this.f3401c);
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            this.f3407i = new FileOutputStream(file);
            if (this.f3404f == null) {
                AudioParameter audioParameter2 = new AudioParameter();
                this.f3404f = audioParameter2;
                audioParameter2.setSamplingRate(i);
                this.f3404f.setNumChannels(i2);
                this.f3404f.setSampleBits(i3);
            }
            DecodeAudioFile decodeAudioFile = new DecodeAudioFile();
            this.f3402d = decodeAudioFile;
            decodeAudioFile.setDecoderListener(this);
            if (!this.f3402d.setDecodeSource(this.f3400b, 0L, 0L)) {
                InterfaceC0623a interfaceC0623a = this.f3408j;
                if (interfaceC0623a != null) {
                    interfaceC0623a.mo9992d(0, "");
                }
                return false;
            }
            long duration = this.f3402d.getDuration();
            InterfaceC0623a interfaceC0623a2 = this.f3408j;
            if (duration <= 0) {
                if (interfaceC0623a2 != null) {
                    interfaceC0623a2.mo9992d(0, "");
                }
                return false;
            }
            if (interfaceC0623a2 != null) {
                interfaceC0623a2.mo9991c(duration / 1000);
            }
            AudioParameter srcAudioParam = this.f3402d.getSrcAudioParam();
            this.f3403e = srcAudioParam;
            if (srcAudioParam != null && (audioParameter = this.f3404f) != null) {
                this.f3405g = !srcAudioParam.isEqual(audioParameter);
            }
            if (this.f3405g && this.f3406h == null) {
                AudioResampleUtils audioResampleUtils = new AudioResampleUtils();
                this.f3406h = audioResampleUtils;
                if (audioResampleUtils.initResampleInfo(this.f3403e.getSamplingRate(), this.f3403e.getNumChannels(), this.f3403e.getSampleBits(), this.f3404f.getSamplingRate(), this.f3404f.getNumChannels(), this.f3404f.getSampleBits()) < 0) {
                    InterfaceC0623a interfaceC0623a3 = this.f3408j;
                    if (interfaceC0623a3 != null) {
                        interfaceC0623a3.mo9992d(-1, "");
                    }
                    return false;
                }
            }
            this.f3402d.startDecode();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m9987b(InterfaceC0623a interfaceC0623a) {
        this.f3408j = interfaceC0623a;
    }

    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: c */
    public void m9988c() {
        DecodeAudioFile decodeAudioFile = this.f3402d;
        if (decodeAudioFile != null) {
            decodeAudioFile.release();
            this.f3402d = null;
        }
    }

    public void onDecoderError(int i) {
        if (this.f3408j != null) {
            this.f3408j.mo9992d(i, String.format("AudioExtract Load Url:%s error, errorcode:%d ", this.f3400b, Integer.valueOf(i)));
        }
    }

    public void onFinished() {
        this.f3399a = true;
        try {
            this.f3407i.close();
        } catch (IOException unused) {
        }
        InterfaceC0623a interfaceC0623a = this.f3408j;
        if (interfaceC0623a != null) {
            interfaceC0623a.mo9989a();
        }
        Log.e("HUOHL_DecodePcmFromFile", "onFinished: OK");
    }

    public void onFrameAvailable(ByteBuffer byteBuffer, long j) {
        InterfaceC0623a interfaceC0623a = this.f3408j;
        if (interfaceC0623a != null && !this.f3409k) {
            interfaceC0623a.mo9990b();
            this.f3409k = true;
        }
        if (this.f3407i == null) {
            return;
        }
        if (this.f3402d.getSrcAudioParam() != null && this.f3404f != null) {
            this.f3402d.getSrcAudioParam().isEqual(this.f3404f);
        }
        try {
            if (!this.f3405g || this.f3406h == null) {
                this.f3407i.write(byteBuffer.array(), 0, byteBuffer.limit());
                return;
            }
            ByteBuffer byteBufferResamplePcmData = this.f3406h.resamplePcmData(byteBuffer.array(), ((byteBuffer.limit() * 8) / this.f3403e.getSampleBits()) / this.f3403e.getNumChannels());
            if (byteBufferResamplePcmData != null) {
                this.f3407i.write(byteBufferResamplePcmData.array(), 0, byteBufferResamplePcmData.limit());
            }
        } catch (Exception e) {
            Log.e("HUOHL_DecodePcmFromFile", "onFrameAvailable: " + e.toString());
        }
    }

    public void onForamtChange(MediaFormat mediaFormat) {
    }
}
