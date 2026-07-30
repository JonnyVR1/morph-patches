package com.immomo.mediabase;

import android.media.AudioRecord;
import android.os.Process;
import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public class AudioRecordEx {
    private final String TAG;
    private AudioRecord mAudioRecord;
    private int mAudioSource;
    private int mAudiobufferSize;
    private boolean mIsHaveAudioData;
    private boolean mIsRecording;
    private OnAudioFrameAvailabel mOnFrameAvailabelCallback;
    private Runnable mRecordRunable;
    private Thread mRecordThread;
    private int mSampleBits;
    private int mSampleChannels;
    private int mSampleRate;
    private Object mSyncObj;

    public interface OnAudioFrameAvailabel {
        void onAudioFrameAvailable(PacketData packetData);
    }

    public AudioRecordEx(int i) {
        this.TAG = "AudioRecordEx";
        this.mSampleRate = 44100;
        this.mSampleBits = 16;
        this.mSampleChannels = 1;
        this.mAudioRecord = null;
        this.mAudiobufferSize = 0;
        this.mIsRecording = false;
        this.mRecordThread = null;
        this.mOnFrameAvailabelCallback = null;
        this.mIsHaveAudioData = false;
        this.mSyncObj = new Object();
        this.mAudioSource = 1;
        this.mRecordRunable = new Runnable() { // from class: com.immomo.mediabase.AudioRecordEx.1

            /* JADX INFO: renamed from: i */
            private int f13659i = 0;
            private byte[] mAudioFrame = null;
            private int bufferReadResult = 0;

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(-19);
                if (AudioRecordEx.this.mAudioRecord != null) {
                    while (AudioRecordEx.this.mAudioRecord.getState() == 0 && this.f13659i < 5) {
                        try {
                            Thread.sleep(100L);
                            this.f13659i++;
                            Log.e("AudioRecordEx", "mAudioRecord.getState " + AudioRecordEx.this.mAudioRecord.getState());
                        } catch (InterruptedException unused) {
                        }
                    }
                    try {
                        AudioRecordEx.this.mAudioRecord.startRecording();
                        this.f13659i = 0;
                        while (AudioRecordEx.this.mAudioRecord.getRecordingState() != 3 && this.f13659i < 10) {
                            try {
                                Thread.sleep(100L);
                                this.f13659i++;
                                AudioRecordEx.this.mAudioRecord.startRecording();
                            } catch (InterruptedException unused2) {
                            }
                        }
                        if (AudioRecordEx.this.mAudioRecord.getRecordingState() != 3) {
                            Log.e("AudioRecordEx", "Error: mAudioRecord.getRecordingState : " + AudioRecordEx.this.mAudioRecord.getRecordingState());
                            return;
                        }
                        while (!Thread.interrupted() && AudioRecordEx.this.mIsRecording) {
                            if (this.mAudioFrame == null) {
                                this.mAudioFrame = new byte[AudioRecordEx.this.mAudiobufferSize];
                            }
                            int i2 = AudioRecordEx.this.mAudioRecord.read(this.mAudioFrame, 0, AudioRecordEx.this.mAudiobufferSize);
                            this.bufferReadResult = i2;
                            AudioRecordEx audioRecordEx = AudioRecordEx.this;
                            if (i2 <= 0) {
                                audioRecordEx.mIsHaveAudioData = false;
                                break;
                            }
                            audioRecordEx.mIsHaveAudioData = true;
                            synchronized (AudioRecordEx.this.mSyncObj) {
                                try {
                                    if (AudioRecordEx.this.mOnFrameAvailabelCallback != null) {
                                        PacketData packetData = new PacketData(AudioRecordEx.this.mAudiobufferSize);
                                        packetData.getFrameBuffer().put(this.mAudioFrame);
                                        packetData.getFrameBuffer().rewind();
                                        packetData.setBuffInfo(AudioRecordEx.this.mAudiobufferSize, 0, 0, System.nanoTime() / 1000, 0);
                                        AudioRecordEx.this.mOnFrameAvailabelCallback.onAudioFrameAvailable(packetData);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        Log.e("AudioRecordEx", " mAudioRecord.stop() and release");
                    } catch (Exception e) {
                        Log.e("AudioRecordEx", "mAudioRecord.startRecording() Error : " + e.toString());
                    }
                }
            }
        };
        this.mAudioSource = i;
    }

    public boolean checkAudioCaptureStatus() {
        return this.mIsHaveAudioData;
    }

    public int getAudioSession() {
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord != null) {
            return audioRecord.getAudioSessionId();
        }
        return -1;
    }

    public boolean openRecorderDevice(int i, int i2, int i3, int i4) {
        this.mSampleBits = i2;
        this.mSampleRate = i;
        this.mSampleChannels = i3;
        this.mAudiobufferSize = i4;
        int i5 = (((i * 120) / 1000) * 32) >> 3;
        int i6 = i3 == 2 ? 12 : 16;
        int minBufferSize = AudioRecord.getMinBufferSize(i, i6, 2) * 16;
        try {
            this.mAudioRecord = new AudioRecord(this.mAudioSource, this.mSampleRate, i6, 2, i5 < minBufferSize ? minBufferSize : i5);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void releaseRecoding() {
        if (this.mIsRecording) {
            stopRecording();
            this.mRecordThread = null;
        }
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.mAudioRecord = null;
        }
        synchronized (this.mSyncObj) {
            this.mOnFrameAvailabelCallback = null;
        }
    }

    public void setOnFrameAvailabelCallback(OnAudioFrameAvailabel onAudioFrameAvailabel) {
        synchronized (this.mSyncObj) {
            this.mOnFrameAvailabelCallback = onAudioFrameAvailabel;
        }
    }

    public void startRecording() {
        this.mIsRecording = true;
        if (this.mRecordThread == null) {
            Thread thread = new Thread(this.mRecordRunable, "AudioRecorderThread");
            this.mRecordThread = thread;
            thread.start();
        }
    }

    public void stopRecording() {
        if (this.mIsRecording) {
            this.mIsRecording = false;
            Thread thread = this.mRecordThread;
            if (thread != null) {
                try {
                    thread.join();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.mRecordThread = null;
            }
        }
    }

    public AudioRecordEx() {
        this.TAG = "AudioRecordEx";
        this.mSampleRate = 44100;
        this.mSampleBits = 16;
        this.mSampleChannels = 1;
        this.mAudioRecord = null;
        this.mAudiobufferSize = 0;
        this.mIsRecording = false;
        this.mRecordThread = null;
        this.mOnFrameAvailabelCallback = null;
        this.mIsHaveAudioData = false;
        this.mSyncObj = new Object();
        this.mAudioSource = 1;
        this.mRecordRunable = new Runnable() { // from class: com.immomo.mediabase.AudioRecordEx.1

            /* JADX INFO: renamed from: i */
            private int f13659i = 0;
            private byte[] mAudioFrame = null;
            private int bufferReadResult = 0;

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(-19);
                if (AudioRecordEx.this.mAudioRecord != null) {
                    while (AudioRecordEx.this.mAudioRecord.getState() == 0 && this.f13659i < 5) {
                        try {
                            Thread.sleep(100L);
                            this.f13659i++;
                            Log.e("AudioRecordEx", "mAudioRecord.getState " + AudioRecordEx.this.mAudioRecord.getState());
                        } catch (InterruptedException unused) {
                        }
                    }
                    try {
                        AudioRecordEx.this.mAudioRecord.startRecording();
                        this.f13659i = 0;
                        while (AudioRecordEx.this.mAudioRecord.getRecordingState() != 3 && this.f13659i < 10) {
                            try {
                                Thread.sleep(100L);
                                this.f13659i++;
                                AudioRecordEx.this.mAudioRecord.startRecording();
                            } catch (InterruptedException unused2) {
                            }
                        }
                        if (AudioRecordEx.this.mAudioRecord.getRecordingState() != 3) {
                            Log.e("AudioRecordEx", "Error: mAudioRecord.getRecordingState : " + AudioRecordEx.this.mAudioRecord.getRecordingState());
                            return;
                        }
                        while (!Thread.interrupted() && AudioRecordEx.this.mIsRecording) {
                            if (this.mAudioFrame == null) {
                                this.mAudioFrame = new byte[AudioRecordEx.this.mAudiobufferSize];
                            }
                            int i2 = AudioRecordEx.this.mAudioRecord.read(this.mAudioFrame, 0, AudioRecordEx.this.mAudiobufferSize);
                            this.bufferReadResult = i2;
                            AudioRecordEx audioRecordEx = AudioRecordEx.this;
                            if (i2 <= 0) {
                                audioRecordEx.mIsHaveAudioData = false;
                                break;
                            }
                            audioRecordEx.mIsHaveAudioData = true;
                            synchronized (AudioRecordEx.this.mSyncObj) {
                                try {
                                    if (AudioRecordEx.this.mOnFrameAvailabelCallback != null) {
                                        PacketData packetData = new PacketData(AudioRecordEx.this.mAudiobufferSize);
                                        packetData.getFrameBuffer().put(this.mAudioFrame);
                                        packetData.getFrameBuffer().rewind();
                                        packetData.setBuffInfo(AudioRecordEx.this.mAudiobufferSize, 0, 0, System.nanoTime() / 1000, 0);
                                        AudioRecordEx.this.mOnFrameAvailabelCallback.onAudioFrameAvailable(packetData);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        Log.e("AudioRecordEx", " mAudioRecord.stop() and release");
                    } catch (Exception e) {
                        Log.e("AudioRecordEx", "mAudioRecord.startRecording() Error : " + e.toString());
                    }
                }
            }
        };
    }
}
