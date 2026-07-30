package p149l;

import android.media.MediaFormat;
import com.immomo.mediabase.AudioMixerNative;
import com.immomo.mediabase.AudioParameter;
import com.immomo.mediabase.MultiAudioPlayer.AudioFileDecode;
import com.immomo.mediabase.MultiAudioPlayer.AudioFileDecodeListener;
import com.immomo.mediacore.audio.AudioProcess;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ka1 implements AudioFileDecodeListener {

    /* JADX INFO: renamed from: b */
    private boolean f122086b;

    /* JADX INFO: renamed from: c */
    AudioParameter f122087c;

    /* JADX INFO: renamed from: f */
    private AudioProcess f122090f;

    /* JADX INFO: renamed from: a */
    private List f122085a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: d */
    private rb1 f122088d = null;

    /* JADX INFO: renamed from: e */
    private final int f122089e = 2048;

    /* JADX INFO: renamed from: l.ka1$a */
    public interface InterfaceC17964a {
        /* JADX INFO: renamed from: a */
        void mo145140a(ByteBuffer byteBuffer);

        /* JADX INFO: renamed from: b */
        void mo145141b(ByteBuffer byteBuffer);
    }

    /* JADX INFO: renamed from: a */
    public boolean m145131a(int i, String str, long j, long j2, boolean z, boolean z2) {
        AudioFileDecode audioFileDecode = new AudioFileDecode(this.f122087c);
        if (m145132b(i)) {
            return false;
        }
        boolean zAdd = this.f122085a.add(audioFileDecode);
        if (!zAdd) {
            audioFileDecode.release();
            return zAdd;
        }
        audioFileDecode.setDecoderListener(this);
        audioFileDecode.setDecodeSource(i, str, j, j2, z, z2);
        audioFileDecode.startDecode();
        return zAdd;
    }

    /* JADX INFO: renamed from: b */
    public boolean m145132b(int i) {
        return m145135e(i) != null;
    }

    /* JADX INFO: renamed from: c */
    public void m145133c(InterfaceC17964a interfaceC17964a) {
        ByteBuffer byteBufferAllocate;
        ByteBuffer byteBuffer;
        ByteBuffer sampleFrame;
        if (interfaceC17964a == null) {
            return;
        }
        synchronized (this.f122085a) {
            try {
                byteBufferAllocate = null;
                byteBuffer = null;
                for (AudioFileDecode audioFileDecode : this.f122085a) {
                    if (audioFileDecode != null && (sampleFrame = audioFileDecode.getSampleFrame()) != null) {
                        if (!audioFileDecode.isMutePlayback()) {
                            if (byteBufferAllocate == null) {
                                byteBufferAllocate = ByteBuffer.allocate(2048);
                                AudioMixerNative.setVolume_Native(sampleFrame.array(), 2048, audioFileDecode.getPlaybackVolume(), byteBufferAllocate.array());
                                byteBufferAllocate.position(0);
                            } else {
                                AudioMixerNative.mixPcmData_Native(byteBufferAllocate.array(), 1.0f, sampleFrame.array(), audioFileDecode.getPlaybackVolume(), 2048, byteBufferAllocate);
                            }
                        }
                        if (audioFileDecode.isPublish() && !audioFileDecode.isMuteSendout()) {
                            if (byteBuffer == null) {
                                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(2048);
                                AudioMixerNative.setVolume_Native(sampleFrame.array(), 2048, audioFileDecode.getSendoutVolume(), byteBufferAllocate2.array());
                                byteBufferAllocate2.position(0);
                                byteBuffer = byteBufferAllocate2;
                            } else {
                                AudioMixerNative.mixPcmData_Native(byteBuffer.array(), 1.0f, sampleFrame.array(), audioFileDecode.getSendoutVolume(), 2048, byteBuffer);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (byteBufferAllocate != null) {
            interfaceC17964a.mo145140a(byteBufferAllocate);
        }
        if (byteBuffer != null) {
            interfaceC17964a.mo145141b(byteBuffer);
        }
    }

    /* JADX INFO: renamed from: d */
    public int m145134d() {
        return this.f122085a.size();
    }

    /* JADX INFO: renamed from: e */
    public AudioFileDecode m145135e(int i) {
        synchronized (this.f122085a) {
            try {
                for (AudioFileDecode audioFileDecode : this.f122085a) {
                    if (audioFileDecode != null && audioFileDecode.getId() == i) {
                        return audioFileDecode;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m145136f() {
        synchronized (this.f122085a) {
            try {
                for (AudioFileDecode audioFileDecode : this.f122085a) {
                    audioFileDecode.stopDecode();
                    audioFileDecode.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f122085a.clear();
    }

    /* JADX INFO: renamed from: g */
    public void m145137g(int i) {
        AudioFileDecode audioFileDecodeM145135e = m145135e(i);
        if (audioFileDecodeM145135e != null) {
            this.f122085a.remove(audioFileDecodeM145135e);
            audioFileDecodeM145135e.stopDecode();
            audioFileDecodeM145135e.release();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m145138h(rb1 rb1Var) {
        this.f122088d = rb1Var;
    }

    /* JADX INFO: renamed from: i */
    public void m145139i(boolean z, AudioParameter audioParameter) {
        this.f122086b = z;
        this.f122087c = audioParameter;
        synchronized (this.f122085a) {
            try {
                for (AudioFileDecode audioFileDecode : this.f122085a) {
                    if (audioFileDecode != null) {
                        audioFileDecode.setEnableResample(z, audioParameter);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.immomo.mediabase.MultiAudioPlayer.AudioFileDecodeListener
    public void onDecodeFinished(AudioFileDecode audioFileDecode) {
        rb1 rb1Var;
        if (audioFileDecode == null || (rb1Var = this.f122088d) == null) {
            return;
        }
        rb1Var.m178544c(audioFileDecode.getId(), audioFileDecode.getUrl());
    }

    @Override // com.immomo.mediabase.MultiAudioPlayer.AudioFileDecodeListener
    public void onDecoderError(int i, AudioFileDecode audioFileDecode) {
        rb1 rb1Var;
        if (audioFileDecode == null || (rb1Var = this.f122088d) == null) {
            return;
        }
        rb1Var.m178543b(audioFileDecode.getId(), audioFileDecode.getUrl(), i, "解码失败");
    }

    @Override // com.immomo.mediabase.MultiAudioPlayer.AudioFileDecodeListener
    public void onForamtChange(MediaFormat mediaFormat, AudioFileDecode audioFileDecode) {
        rb1 rb1Var;
        if (audioFileDecode == null || (rb1Var = this.f122088d) == null) {
            return;
        }
        rb1Var.m178546e(audioFileDecode.getId(), audioFileDecode.getUrl(), mediaFormat);
    }

    @Override // com.immomo.mediabase.MultiAudioPlayer.AudioFileDecodeListener
    public void onPlayFinished(AudioFileDecode audioFileDecode) {
        rb1 rb1Var;
        if (audioFileDecode == null || (rb1Var = this.f122088d) == null) {
            return;
        }
        rb1Var.m178548g(audioFileDecode.getId());
    }

    @Override // com.immomo.mediabase.MultiAudioPlayer.AudioFileDecodeListener
    public void onPlayStart(AudioFileDecode audioFileDecode) {
        rb1 rb1Var;
        if (audioFileDecode == null || (rb1Var = this.f122088d) == null) {
            return;
        }
        rb1Var.m178550i(audioFileDecode.getId());
    }

    @Override // com.immomo.mediabase.MultiAudioPlayer.AudioFileDecodeListener
    public void onProcessFrame(ByteBuffer byteBuffer, long j, AudioFileDecode audioFileDecode) {
        synchronized (this) {
            if (audioFileDecode != null) {
                try {
                    if (audioFileDecode.getPitch() != 0) {
                        if (this.f122090f == null) {
                            AudioProcess audioProcess = new AudioProcess();
                            this.f122090f = audioProcess;
                            audioProcess.openSabineEf(this.f122087c.getSamplingRate(), this.f122087c.getNumChannels(), 1024);
                        }
                        this.f122090f.processAudioPitch(byteBuffer.array(), 2048, audioFileDecode.getPitch());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.immomo.mediabase.MultiAudioPlayer.AudioFileDecodeListener
    public void onResampleOpen(AudioParameter audioParameter, AudioParameter audioParameter2, AudioFileDecode audioFileDecode) {
        rb1 rb1Var;
        if (audioFileDecode == null || (rb1Var = this.f122088d) == null) {
            return;
        }
        rb1Var.m178545d(audioFileDecode.getId(), audioFileDecode.getUrl(), audioParameter.getSamplingRate(), audioParameter.getNumChannels(), audioParameter2.getSamplingRate(), audioParameter2.getNumChannels());
    }
}
