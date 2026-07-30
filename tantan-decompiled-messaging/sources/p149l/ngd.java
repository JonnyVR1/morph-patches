package p149l;

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
public class ngd implements DecodeAudioFileListener {

    /* JADX INFO: renamed from: d */
    private DecodeAudioFile f138859d;

    /* JADX INFO: renamed from: e */
    private AudioParameter f138860e;

    /* JADX INFO: renamed from: f */
    private AudioParameter f138861f;

    /* JADX INFO: renamed from: a */
    private boolean f138856a = false;

    /* JADX INFO: renamed from: b */
    private String f138857b = "";

    /* JADX INFO: renamed from: c */
    private String f138858c = "";

    /* JADX INFO: renamed from: g */
    private boolean f138862g = false;

    /* JADX INFO: renamed from: h */
    private AudioResampleUtils f138863h = null;

    /* JADX INFO: renamed from: i */
    FileOutputStream f138864i = null;

    /* JADX INFO: renamed from: j */
    InterfaceC18692a f138865j = null;

    /* JADX INFO: renamed from: k */
    private boolean f138866k = false;

    /* JADX INFO: renamed from: l.ngd$a */
    public interface InterfaceC18692a {
        /* JADX INFO: renamed from: a */
        void mo159298a();

        /* JADX INFO: renamed from: b */
        void mo159299b();

        /* JADX INFO: renamed from: c */
        void mo159300c(long j);

        /* JADX INFO: renamed from: d */
        void mo159301d(int i, String str);
    }

    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: a */
    public boolean m159295a(String str, String str2, int i, int i2, int i3) {
        AudioParameter audioParameter;
        Log.e("HUOHL_DecodePcmFromFile", "decodeUrl: Start");
        this.f138857b = str;
        this.f138858c = str2;
        File file = new File(this.f138858c);
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            this.f138864i = new FileOutputStream(file);
            if (this.f138861f == null) {
                AudioParameter audioParameter2 = new AudioParameter();
                this.f138861f = audioParameter2;
                audioParameter2.setSamplingRate(i);
                this.f138861f.setNumChannels(i2);
                this.f138861f.setSampleBits(i3);
            }
            DecodeAudioFile decodeAudioFile = new DecodeAudioFile();
            this.f138859d = decodeAudioFile;
            decodeAudioFile.setDecoderListener(this);
            if (!this.f138859d.setDecodeSource(this.f138857b, 0L, 0L)) {
                InterfaceC18692a interfaceC18692a = this.f138865j;
                if (interfaceC18692a != null) {
                    interfaceC18692a.mo159301d(0, "");
                }
                return false;
            }
            long duration = this.f138859d.getDuration();
            InterfaceC18692a interfaceC18692a2 = this.f138865j;
            if (duration <= 0) {
                if (interfaceC18692a2 != null) {
                    interfaceC18692a2.mo159301d(0, "");
                }
                return false;
            }
            if (interfaceC18692a2 != null) {
                interfaceC18692a2.mo159300c(duration / 1000);
            }
            AudioParameter srcAudioParam = this.f138859d.getSrcAudioParam();
            this.f138860e = srcAudioParam;
            if (srcAudioParam != null && (audioParameter = this.f138861f) != null) {
                this.f138862g = !srcAudioParam.isEqual(audioParameter);
            }
            if (this.f138862g && this.f138863h == null) {
                AudioResampleUtils audioResampleUtils = new AudioResampleUtils();
                this.f138863h = audioResampleUtils;
                if (audioResampleUtils.initResampleInfo(this.f138860e.getSamplingRate(), this.f138860e.getNumChannels(), this.f138860e.getSampleBits(), this.f138861f.getSamplingRate(), this.f138861f.getNumChannels(), this.f138861f.getSampleBits()) < 0) {
                    InterfaceC18692a interfaceC18692a3 = this.f138865j;
                    if (interfaceC18692a3 != null) {
                        interfaceC18692a3.mo159301d(-1, "");
                    }
                    return false;
                }
            }
            this.f138859d.startDecode();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m159296b(InterfaceC18692a interfaceC18692a) {
        this.f138865j = interfaceC18692a;
    }

    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: c */
    public void m159297c() {
        DecodeAudioFile decodeAudioFile = this.f138859d;
        if (decodeAudioFile != null) {
            decodeAudioFile.release();
            this.f138859d = null;
        }
    }

    @Override // com.immomo.mediabase.DecodeAudioFileListener
    public void onDecoderError(int i) {
        if (this.f138865j != null) {
            this.f138865j.mo159301d(i, String.format("AudioExtract Load Url:%s error, errorcode:%d ", this.f138857b, Integer.valueOf(i)));
        }
    }

    @Override // com.immomo.mediabase.DecodeAudioFileListener
    public void onFinished() {
        this.f138856a = true;
        try {
            this.f138864i.close();
        } catch (IOException unused) {
        }
        InterfaceC18692a interfaceC18692a = this.f138865j;
        if (interfaceC18692a != null) {
            interfaceC18692a.mo159298a();
        }
        Log.e("HUOHL_DecodePcmFromFile", "onFinished: OK");
    }

    @Override // com.immomo.mediabase.DecodeAudioFileListener
    public void onFrameAvailable(ByteBuffer byteBuffer, long j) {
        InterfaceC18692a interfaceC18692a = this.f138865j;
        if (interfaceC18692a != null && !this.f138866k) {
            interfaceC18692a.mo159299b();
            this.f138866k = true;
        }
        if (this.f138864i == null) {
            return;
        }
        if (this.f138859d.getSrcAudioParam() != null && this.f138861f != null) {
            this.f138859d.getSrcAudioParam().isEqual(this.f138861f);
        }
        try {
            if (!this.f138862g || this.f138863h == null) {
                this.f138864i.write(byteBuffer.array(), 0, byteBuffer.limit());
                return;
            }
            ByteBuffer byteBufferResamplePcmData = this.f138863h.resamplePcmData(byteBuffer.array(), ((byteBuffer.limit() * 8) / this.f138860e.getSampleBits()) / this.f138860e.getNumChannels());
            if (byteBufferResamplePcmData != null) {
                this.f138864i.write(byteBufferResamplePcmData.array(), 0, byteBufferResamplePcmData.limit());
            }
        } catch (Exception e) {
            Log.e("HUOHL_DecodePcmFromFile", "onFrameAvailable: " + e.toString());
        }
    }

    @Override // com.immomo.mediabase.DecodeAudioFileListener
    public void onForamtChange(MediaFormat mediaFormat) {
    }
}
