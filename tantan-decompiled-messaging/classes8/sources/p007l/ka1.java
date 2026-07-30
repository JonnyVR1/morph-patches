package p007l;

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
import l.rb1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ka1 implements AudioFileDecodeListener {

    /* JADX INFO: renamed from: b */
    private boolean f3047b;

    /* JADX INFO: renamed from: c */
    AudioParameter f3048c;

    /* JADX INFO: renamed from: f */
    private AudioProcess f3051f;

    /* JADX INFO: renamed from: a */
    private List f3046a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: d */
    private rb1 f3049d = null;

    /* JADX INFO: renamed from: e */
    private final int f3050e = 2048;

    /* JADX INFO: renamed from: l.ka1$a */
    public interface InterfaceC0584a {
        /* JADX INFO: renamed from: a */
        void mo9586a(ByteBuffer byteBuffer);

        /* JADX INFO: renamed from: b */
        void mo9587b(ByteBuffer byteBuffer);
    }

    /* JADX INFO: renamed from: a */
    public boolean m9577a(int i, String str, long j, long j2, boolean z, boolean z2) {
        AudioFileDecode audioFileDecode = new AudioFileDecode(this.f3048c);
        if (m9578b(i)) {
            return false;
        }
        boolean zAdd = this.f3046a.add(audioFileDecode);
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
    public boolean m9578b(int i) {
        return m9581e(i) != null;
    }

    /* JADX INFO: renamed from: c */
    public void m9579c(InterfaceC0584a interfaceC0584a) {
        ByteBuffer byteBufferAllocate;
        ByteBuffer byteBuffer;
        ByteBuffer sampleFrame;
        if (interfaceC0584a == null) {
            return;
        }
        synchronized (this.f3046a) {
            try {
                byteBufferAllocate = null;
                byteBuffer = null;
                for (AudioFileDecode audioFileDecode : this.f3046a) {
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
            interfaceC0584a.mo9586a(byteBufferAllocate);
        }
        if (byteBuffer != null) {
            interfaceC0584a.mo9587b(byteBuffer);
        }
    }

    /* JADX INFO: renamed from: d */
    public int m9580d() {
        return this.f3046a.size();
    }

    /* JADX INFO: renamed from: e */
    public AudioFileDecode m9581e(int i) {
        synchronized (this.f3046a) {
            try {
                for (AudioFileDecode audioFileDecode : this.f3046a) {
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
    public void m9582f() {
        synchronized (this.f3046a) {
            try {
                for (AudioFileDecode audioFileDecode : this.f3046a) {
                    audioFileDecode.stopDecode();
                    audioFileDecode.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3046a.clear();
    }

    /* JADX INFO: renamed from: g */
    public void m9583g(int i) {
        AudioFileDecode audioFileDecodeM9581e = m9581e(i);
        if (audioFileDecodeM9581e != null) {
            this.f3046a.remove(audioFileDecodeM9581e);
            audioFileDecodeM9581e.stopDecode();
            audioFileDecodeM9581e.release();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m9584h(rb1 rb1Var) {
        this.f3049d = rb1Var;
    }

    /* JADX INFO: renamed from: i */
    public void m9585i(boolean z, AudioParameter audioParameter) {
        this.f3047b = z;
        this.f3048c = audioParameter;
        synchronized (this.f3046a) {
            try {
                for (AudioFileDecode audioFileDecode : this.f3046a) {
                    if (audioFileDecode != null) {
                        audioFileDecode.setEnableResample(z, audioParameter);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onDecodeFinished(AudioFileDecode audioFileDecode) {
        rb1 rb1Var;
        if (audioFileDecode == null || (rb1Var = this.f3049d) == null) {
            return;
        }
        rb1Var.c(audioFileDecode.getId(), audioFileDecode.getUrl());
    }

    public void onDecoderError(int i, AudioFileDecode audioFileDecode) {
        rb1 rb1Var;
        if (audioFileDecode == null || (rb1Var = this.f3049d) == null) {
            return;
        }
        rb1Var.b(audioFileDecode.getId(), audioFileDecode.getUrl(), i, "解码失败");
    }

    public void onForamtChange(MediaFormat mediaFormat, AudioFileDecode audioFileDecode) {
        rb1 rb1Var;
        if (audioFileDecode == null || (rb1Var = this.f3049d) == null) {
            return;
        }
        rb1Var.e(audioFileDecode.getId(), audioFileDecode.getUrl(), mediaFormat);
    }

    public void onPlayFinished(AudioFileDecode audioFileDecode) {
        rb1 rb1Var;
        if (audioFileDecode == null || (rb1Var = this.f3049d) == null) {
            return;
        }
        rb1Var.g(audioFileDecode.getId());
    }

    public void onPlayStart(AudioFileDecode audioFileDecode) {
        rb1 rb1Var;
        if (audioFileDecode == null || (rb1Var = this.f3049d) == null) {
            return;
        }
        rb1Var.i(audioFileDecode.getId());
    }

    public void onProcessFrame(ByteBuffer byteBuffer, long j, AudioFileDecode audioFileDecode) {
        synchronized (this) {
            if (audioFileDecode != null) {
                try {
                    if (audioFileDecode.getPitch() != 0) {
                        if (this.f3051f == null) {
                            AudioProcess audioProcess = new AudioProcess();
                            this.f3051f = audioProcess;
                            audioProcess.openSabineEf(this.f3048c.getSamplingRate(), this.f3048c.getNumChannels(), 1024);
                        }
                        this.f3051f.processAudioPitch(byteBuffer.array(), 2048, audioFileDecode.getPitch());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void onResampleOpen(AudioParameter audioParameter, AudioParameter audioParameter2, AudioFileDecode audioFileDecode) {
        rb1 rb1Var;
        if (audioFileDecode == null || (rb1Var = this.f3049d) == null) {
            return;
        }
        rb1Var.d(audioFileDecode.getId(), audioFileDecode.getUrl(), audioParameter.getSamplingRate(), audioParameter.getNumChannels(), audioParameter2.getSamplingRate(), audioParameter2.getNumChannels());
    }
}
