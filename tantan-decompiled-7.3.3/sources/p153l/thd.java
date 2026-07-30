package p153l;

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

/* JADX INFO: loaded from: classes8.dex */
public class thd implements DecodeAudioFileListener {

    /* JADX INFO: renamed from: d */
    private DecodeAudioFile f174348d;

    /* JADX INFO: renamed from: e */
    private AudioParameter f174349e;

    /* JADX INFO: renamed from: f */
    private AudioParameter f174350f;

    /* JADX INFO: renamed from: a */
    private boolean f174345a = false;

    /* JADX INFO: renamed from: b */
    private String f174346b = "";

    /* JADX INFO: renamed from: c */
    private String f174347c = "";

    /* JADX INFO: renamed from: g */
    private boolean f174351g = false;

    /* JADX INFO: renamed from: h */
    private AudioResampleUtils f174352h = null;

    /* JADX INFO: renamed from: i */
    FileOutputStream f174353i = null;

    /* JADX INFO: renamed from: j */
    InterfaceC20318a f174354j = null;

    /* JADX INFO: renamed from: k */
    private boolean f174355k = false;

    /* JADX INFO: renamed from: l.thd$a */
    public interface InterfaceC20318a {
        /* JADX INFO: renamed from: a */
        void mo184792a();

        /* JADX INFO: renamed from: b */
        void mo184793b();

        /* JADX INFO: renamed from: c */
        void mo184795c(long j);

        /* JADX INFO: renamed from: d */
        void mo184797d(int i, String str);
    }

    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: a */
    public boolean m191236a(String str, String str2, int i, int i2, int i3) {
        AudioParameter audioParameter;
        Log.e("HUOHL_DecodePcmFromFile", "decodeUrl: Start");
        this.f174346b = str;
        this.f174347c = str2;
        File file = new File(this.f174347c);
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            this.f174353i = new FileOutputStream(file);
            if (this.f174350f == null) {
                AudioParameter audioParameter2 = new AudioParameter();
                this.f174350f = audioParameter2;
                audioParameter2.setSamplingRate(i);
                this.f174350f.setNumChannels(i2);
                this.f174350f.setSampleBits(i3);
            }
            DecodeAudioFile decodeAudioFile = new DecodeAudioFile();
            this.f174348d = decodeAudioFile;
            decodeAudioFile.setDecoderListener(this);
            if (!this.f174348d.setDecodeSource(this.f174346b, 0L, 0L)) {
                InterfaceC20318a interfaceC20318a = this.f174354j;
                if (interfaceC20318a != null) {
                    interfaceC20318a.mo184797d(0, "");
                }
                return false;
            }
            long duration = this.f174348d.getDuration();
            InterfaceC20318a interfaceC20318a2 = this.f174354j;
            if (duration <= 0) {
                if (interfaceC20318a2 != null) {
                    interfaceC20318a2.mo184797d(0, "");
                }
                return false;
            }
            if (interfaceC20318a2 != null) {
                interfaceC20318a2.mo184795c(duration / 1000);
            }
            AudioParameter srcAudioParam = this.f174348d.getSrcAudioParam();
            this.f174349e = srcAudioParam;
            if (srcAudioParam != null && (audioParameter = this.f174350f) != null) {
                this.f174351g = !srcAudioParam.isEqual(audioParameter);
            }
            if (this.f174351g && this.f174352h == null) {
                AudioResampleUtils audioResampleUtils = new AudioResampleUtils();
                this.f174352h = audioResampleUtils;
                if (audioResampleUtils.initResampleInfo(this.f174349e.getSamplingRate(), this.f174349e.getNumChannels(), this.f174349e.getSampleBits(), this.f174350f.getSamplingRate(), this.f174350f.getNumChannels(), this.f174350f.getSampleBits()) < 0) {
                    InterfaceC20318a interfaceC20318a3 = this.f174354j;
                    if (interfaceC20318a3 != null) {
                        interfaceC20318a3.mo184797d(-1, "");
                    }
                    return false;
                }
            }
            this.f174348d.startDecode();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m191237b(InterfaceC20318a interfaceC20318a) {
        this.f174354j = interfaceC20318a;
    }

    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: c */
    public void m191238c() {
        DecodeAudioFile decodeAudioFile = this.f174348d;
        if (decodeAudioFile != null) {
            decodeAudioFile.release();
            this.f174348d = null;
        }
    }

    @Override // com.immomo.mediabase.DecodeAudioFileListener
    public void onDecoderError(int i) {
        if (this.f174354j != null) {
            this.f174354j.mo184797d(i, String.format("AudioExtract Load Url:%s error, errorcode:%d ", this.f174346b, Integer.valueOf(i)));
        }
    }

    @Override // com.immomo.mediabase.DecodeAudioFileListener
    public void onFinished() {
        this.f174345a = true;
        try {
            this.f174353i.close();
        } catch (IOException unused) {
        }
        InterfaceC20318a interfaceC20318a = this.f174354j;
        if (interfaceC20318a != null) {
            interfaceC20318a.mo184792a();
        }
        Log.e("HUOHL_DecodePcmFromFile", "onFinished: OK");
    }

    @Override // com.immomo.mediabase.DecodeAudioFileListener
    public void onFrameAvailable(ByteBuffer byteBuffer, long j) {
        InterfaceC20318a interfaceC20318a = this.f174354j;
        if (interfaceC20318a != null && !this.f174355k) {
            interfaceC20318a.mo184793b();
            this.f174355k = true;
        }
        if (this.f174353i == null) {
            return;
        }
        if (this.f174348d.getSrcAudioParam() != null && this.f174350f != null) {
            this.f174348d.getSrcAudioParam().isEqual(this.f174350f);
        }
        try {
            if (!this.f174351g || this.f174352h == null) {
                this.f174353i.write(byteBuffer.array(), 0, byteBuffer.limit());
                return;
            }
            ByteBuffer byteBufferResamplePcmData = this.f174352h.resamplePcmData(byteBuffer.array(), ((byteBuffer.limit() * 8) / this.f174349e.getSampleBits()) / this.f174349e.getNumChannels());
            if (byteBufferResamplePcmData != null) {
                this.f174353i.write(byteBufferResamplePcmData.array(), 0, byteBufferResamplePcmData.limit());
            }
        } catch (Exception e) {
            Log.e("HUOHL_DecodePcmFromFile", "onFrameAvailable: " + e.toString());
        }
    }

    @Override // com.immomo.mediabase.DecodeAudioFileListener
    public void onForamtChange(MediaFormat mediaFormat) {
    }
}
