package p153l;

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
public class ra1 implements AudioFileDecodeListener {

    /* JADX INFO: renamed from: b */
    private boolean f161886b;

    /* JADX INFO: renamed from: c */
    AudioParameter f161887c;

    /* JADX INFO: renamed from: f */
    private AudioProcess f161890f;

    /* JADX INFO: renamed from: a */
    private List f161885a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: d */
    private yb1 f161888d = null;

    /* JADX INFO: renamed from: e */
    private final int f161889e = 2048;

    /* JADX INFO: renamed from: l.ra1$a */
    public interface InterfaceC19802a {
        /* JADX INFO: renamed from: a */
        void mo180704a(ByteBuffer byteBuffer);

        /* JADX INFO: renamed from: b */
        void mo180705b(ByteBuffer byteBuffer);
    }

    /* JADX INFO: renamed from: a */
    public boolean m180695a(int i, String str, long j, long j2, boolean z, boolean z2) {
        AudioFileDecode audioFileDecode = new AudioFileDecode(this.f161887c);
        if (m180696b(i)) {
            return false;
        }
        boolean zAdd = this.f161885a.add(audioFileDecode);
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
    public boolean m180696b(int i) {
        return m180699e(i) != null;
    }

    /* JADX INFO: renamed from: c */
    public void m180697c(InterfaceC19802a interfaceC19802a) {
        ByteBuffer byteBufferAllocate;
        ByteBuffer byteBuffer;
        ByteBuffer sampleFrame;
        if (interfaceC19802a == null) {
            return;
        }
        synchronized (this.f161885a) {
            try {
                byteBufferAllocate = null;
                byteBuffer = null;
                for (AudioFileDecode audioFileDecode : this.f161885a) {
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
            interfaceC19802a.mo180704a(byteBufferAllocate);
        }
        if (byteBuffer != null) {
            interfaceC19802a.mo180705b(byteBuffer);
        }
    }

    /* JADX INFO: renamed from: d */
    public int m180698d() {
        return this.f161885a.size();
    }

    /* JADX INFO: renamed from: e */
    public AudioFileDecode m180699e(int i) {
        synchronized (this.f161885a) {
            try {
                for (AudioFileDecode audioFileDecode : this.f161885a) {
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
    public void m180700f() {
        synchronized (this.f161885a) {
            try {
                for (AudioFileDecode audioFileDecode : this.f161885a) {
                    audioFileDecode.stopDecode();
                    audioFileDecode.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f161885a.clear();
    }

    /* JADX INFO: renamed from: g */
    public void m180701g(int i) {
        AudioFileDecode audioFileDecodeM180699e = m180699e(i);
        if (audioFileDecodeM180699e != null) {
            this.f161885a.remove(audioFileDecodeM180699e);
            audioFileDecodeM180699e.stopDecode();
            audioFileDecodeM180699e.release();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m180702h(yb1 yb1Var) {
        this.f161888d = yb1Var;
    }

    /* JADX INFO: renamed from: i */
    public void m180703i(boolean z, AudioParameter audioParameter) {
        this.f161886b = z;
        this.f161887c = audioParameter;
        synchronized (this.f161885a) {
            try {
                for (AudioFileDecode audioFileDecode : this.f161885a) {
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
        yb1 yb1Var;
        if (audioFileDecode == null || (yb1Var = this.f161888d) == null) {
            return;
        }
        yb1Var.m214964c(audioFileDecode.getId(), audioFileDecode.getUrl());
    }

    @Override // com.immomo.mediabase.MultiAudioPlayer.AudioFileDecodeListener
    public void onDecoderError(int i, AudioFileDecode audioFileDecode) {
        yb1 yb1Var;
        if (audioFileDecode == null || (yb1Var = this.f161888d) == null) {
            return;
        }
        yb1Var.m214963b(audioFileDecode.getId(), audioFileDecode.getUrl(), i, "解码失败");
    }

    @Override // com.immomo.mediabase.MultiAudioPlayer.AudioFileDecodeListener
    public void onForamtChange(MediaFormat mediaFormat, AudioFileDecode audioFileDecode) {
        yb1 yb1Var;
        if (audioFileDecode == null || (yb1Var = this.f161888d) == null) {
            return;
        }
        yb1Var.m214966e(audioFileDecode.getId(), audioFileDecode.getUrl(), mediaFormat);
    }

    @Override // com.immomo.mediabase.MultiAudioPlayer.AudioFileDecodeListener
    public void onPlayFinished(AudioFileDecode audioFileDecode) {
        yb1 yb1Var;
        if (audioFileDecode == null || (yb1Var = this.f161888d) == null) {
            return;
        }
        yb1Var.m214968g(audioFileDecode.getId());
    }

    @Override // com.immomo.mediabase.MultiAudioPlayer.AudioFileDecodeListener
    public void onPlayStart(AudioFileDecode audioFileDecode) {
        yb1 yb1Var;
        if (audioFileDecode == null || (yb1Var = this.f161888d) == null) {
            return;
        }
        yb1Var.m214970i(audioFileDecode.getId());
    }

    @Override // com.immomo.mediabase.MultiAudioPlayer.AudioFileDecodeListener
    public void onProcessFrame(ByteBuffer byteBuffer, long j, AudioFileDecode audioFileDecode) {
        synchronized (this) {
            if (audioFileDecode != null) {
                try {
                    if (audioFileDecode.getPitch() != 0) {
                        if (this.f161890f == null) {
                            AudioProcess audioProcess = new AudioProcess();
                            this.f161890f = audioProcess;
                            audioProcess.openSabineEf(this.f161887c.getSamplingRate(), this.f161887c.getNumChannels(), 1024);
                        }
                        this.f161890f.processAudioPitch(byteBuffer.array(), 2048, audioFileDecode.getPitch());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.immomo.mediabase.MultiAudioPlayer.AudioFileDecodeListener
    public void onResampleOpen(AudioParameter audioParameter, AudioParameter audioParameter2, AudioFileDecode audioFileDecode) {
        yb1 yb1Var;
        if (audioFileDecode == null || (yb1Var = this.f161888d) == null) {
            return;
        }
        yb1Var.m214965d(audioFileDecode.getId(), audioFileDecode.getUrl(), audioParameter.getSamplingRate(), audioParameter.getNumChannels(), audioParameter2.getSamplingRate(), audioParameter2.getNumChannels());
    }
}
