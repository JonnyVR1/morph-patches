package p153l;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tantanapp.media.ttagc.TTAgcProcessor;
import com.tantanapp.media.ttns.TTNsProcessor;
import com.tencent.ugc.TXRecordCommon;
import com.uraroji.garage.android.lame.SimpleLame;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class mnc0 {

    /* JADX INFO: renamed from: t */
    private static int[] f137671t = {44100, 22050, 16000, 11025, TXRecordCommon.AUDIO_SAMPLERATE_8000};

    /* JADX INFO: renamed from: u */
    private static int[] f137672u = {48000, 32000, 16000, TXRecordCommon.AUDIO_SAMPLERATE_8000};

    /* JADX INFO: renamed from: a */
    private String f137673a;

    /* JADX INFO: renamed from: b */
    private int f137674b;

    /* JADX INFO: renamed from: d */
    private Handler f137676d;

    /* JADX INFO: renamed from: e */
    private int f137677e;

    /* JADX INFO: renamed from: f */
    private boolean f137678f;

    /* JADX INFO: renamed from: g */
    private boolean f137679g;

    /* JADX INFO: renamed from: h */
    private int f137680h;

    /* JADX INFO: renamed from: i */
    private boolean f137681i;

    /* JADX INFO: renamed from: j */
    private boolean f137682j;

    /* JADX INFO: renamed from: k */
    private int f137683k;

    /* JADX INFO: renamed from: c */
    private boolean f137675c = false;

    /* JADX INFO: renamed from: l */
    private int f137684l = -1;

    /* JADX INFO: renamed from: m */
    private int f137685m = -1;

    /* JADX INFO: renamed from: n */
    private int f137686n = -1;

    /* JADX INFO: renamed from: o */
    private boolean f137687o = true;

    /* JADX INFO: renamed from: p */
    private short f137688p = -1;

    /* JADX INFO: renamed from: q */
    private short f137689q = -1;

    /* JADX INFO: renamed from: r */
    private int f137690r = -1;

    /* JADX INFO: renamed from: s */
    private int f137691s = -1;

    /* JADX INFO: renamed from: l.mnc0$a */
    public class C18659a extends Thread {

        /* JADX INFO: renamed from: a */
        private final int f137692a;

        public C18659a(int i) {
            this.f137692a = i;
        }

        /* JADX INFO: renamed from: a */
        private void m159156a(int i) {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = this.f137692a;
            mnc0.this.f137676d.sendMessage(messageObtain);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x01c7  */
        /* JADX WARN: Code duplicated, block: B:104:0x01d3 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:105:0x01d5 A[Catch: all -> 0x019a, TryCatch #6 {all -> 0x019a, blocks: (B:11:0x0069, B:84:0x018c, B:87:0x0196, B:91:0x019e, B:92:0x01a1, B:94:0x01a7, B:102:0x01cb, B:105:0x01d5, B:107:0x01da, B:108:0x01dd, B:110:0x01e3, B:111:0x01e9, B:112:0x01ea, B:114:0x01f2), top: B:142:0x0069, inners: #7 }] */
        /* JADX WARN: Code duplicated, block: B:107:0x01da A[Catch: all -> 0x019a, TryCatch #6 {all -> 0x019a, blocks: (B:11:0x0069, B:84:0x018c, B:87:0x0196, B:91:0x019e, B:92:0x01a1, B:94:0x01a7, B:102:0x01cb, B:105:0x01d5, B:107:0x01da, B:108:0x01dd, B:110:0x01e3, B:111:0x01e9, B:112:0x01ea, B:114:0x01f2), top: B:142:0x0069, inners: #7 }] */
        /* JADX WARN: Code duplicated, block: B:110:0x01e3 A[Catch: all -> 0x019a, TryCatch #6 {all -> 0x019a, blocks: (B:11:0x0069, B:84:0x018c, B:87:0x0196, B:91:0x019e, B:92:0x01a1, B:94:0x01a7, B:102:0x01cb, B:105:0x01d5, B:107:0x01da, B:108:0x01dd, B:110:0x01e3, B:111:0x01e9, B:112:0x01ea, B:114:0x01f2), top: B:142:0x0069, inners: #7 }] */
        /* JADX WARN: Code duplicated, block: B:133:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:86:0x0194 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:87:0x0196 A[Catch: all -> 0x019a, TryCatch #6 {all -> 0x019a, blocks: (B:11:0x0069, B:84:0x018c, B:87:0x0196, B:91:0x019e, B:92:0x01a1, B:94:0x01a7, B:102:0x01cb, B:105:0x01d5, B:107:0x01da, B:108:0x01dd, B:110:0x01e3, B:111:0x01e9, B:112:0x01ea, B:114:0x01f2), top: B:142:0x0069, inners: #7 }] */
        /* JADX WARN: Code duplicated, block: B:91:0x019e A[Catch: all -> 0x019a, TryCatch #6 {all -> 0x019a, blocks: (B:11:0x0069, B:84:0x018c, B:87:0x0196, B:91:0x019e, B:92:0x01a1, B:94:0x01a7, B:102:0x01cb, B:105:0x01d5, B:107:0x01da, B:108:0x01dd, B:110:0x01e3, B:111:0x01e9, B:112:0x01ea, B:114:0x01f2), top: B:142:0x0069, inners: #7 }] */
        /* JADX WARN: Code duplicated, block: B:94:0x01a7 A[Catch: all -> 0x019a, TRY_LEAVE, TryCatch #6 {all -> 0x019a, blocks: (B:11:0x0069, B:84:0x018c, B:87:0x0196, B:91:0x019e, B:92:0x01a1, B:94:0x01a7, B:102:0x01cb, B:105:0x01d5, B:107:0x01da, B:108:0x01dd, B:110:0x01e3, B:111:0x01e9, B:112:0x01ea, B:114:0x01f2), top: B:142:0x0069, inners: #7 }] */
        /* JADX WARN: Code duplicated, block: B:97:0x01bd A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:98:0x01bf A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:99:0x01c1  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            TTNsProcessor tTNsProcessor;
            Object[] objArr;
            int iFlush;
            Process.setThreadPriority(-19);
            AudioRecord audioRecordM159150t = mnc0.this.m159150t();
            mnc0 mnc0Var = mnc0.this;
            boolean z = false;
            if (audioRecordM159150t == null) {
                if (mnc0Var.f137676d != null) {
                    mnc0.this.f137675c = false;
                    m159156a(2);
                    return;
                }
                return;
            }
            SimpleLame.m85859a(mnc0Var.f137674b, 1, mnc0.this.f137674b, 32);
            short[] sArrM159128A = new short[mnc0.this.f137680h];
            byte[] bArr = new byte[(int) ((((double) (mnc0.this.f137680h * 2)) * 1.25d) + 7200.0d)];
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(rki.m181862b(mnc0.this.f137673a), mnc0.this.f137681i);
                    mnc0.this.f137675c = false;
                    try {
                        try {
                            audioRecordM159150t.startRecording();
                            TTAgcProcessor tTAgcProcessor = null;
                            TTNsProcessor tTNsProcessorNewInstance = null;
                            tTAgcProcessor = null;
                            try {
                                if (mnc0.this.f137676d != null) {
                                    m159156a(0);
                                }
                                if (mnc0.this.f137682j) {
                                    TTAgcProcessor tTAgcProcessorNewInstance = TTAgcProcessor.newInstance(mnc0.this.f137674b);
                                    try {
                                        mnc0.this.m159146r(tTAgcProcessorNewInstance);
                                        tTAgcProcessorNewInstance.init();
                                        tTNsProcessorNewInstance = TTNsProcessor.newInstance(mnc0.this.f137674b);
                                        mnc0.this.m159147s(tTNsProcessorNewInstance);
                                        tTNsProcessorNewInstance.init();
                                        tTNsProcessor = tTNsProcessorNewInstance;
                                        tTAgcProcessor = tTAgcProcessorNewInstance;
                                    } catch (Throwable th) {
                                        th = th;
                                        tTNsProcessor = tTNsProcessorNewInstance;
                                        tTAgcProcessor = tTAgcProcessorNewInstance;
                                        if (mnc0.this.f137682j) {
                                            if (tTAgcProcessor != null) {
                                                tTAgcProcessor.free();
                                            }
                                            if (tTNsProcessor != null) {
                                                tTNsProcessor.free();
                                            }
                                        }
                                        if (audioRecordM159150t.getState() == 1) {
                                            audioRecordM159150t.stop();
                                            audioRecordM159150t.release();
                                        }
                                        throw th;
                                    }
                                } else {
                                    tTNsProcessor = null;
                                }
                                z = true;
                                while (true) {
                                    try {
                                        if (mnc0.this.f137679g) {
                                            objArr = false;
                                        } else {
                                            int i = audioRecordM159150t.read(sArrM159128A, 0, mnc0.this.f137680h);
                                            mnc0 mnc0Var2 = mnc0.this;
                                            if (i > 0) {
                                                if (mnc0Var2.f137682j) {
                                                    sArrM159128A = mnc0.this.m159128A(mnc0.this.m159148z(sArrM159128A, tTAgcProcessor), tTNsProcessor);
                                                }
                                                if (z) {
                                                    mnc0 mnc0Var3 = mnc0.this;
                                                    mnc0Var3.f137677e = (int) mnc0Var3.m159145q(sArrM159128A);
                                                    if (mnc0.this.f137677e <= 0 || mnc0.this.f137677e >= 25000) {
                                                        mnc0.this.f137678f = false;
                                                    } else {
                                                        mnc0.this.f137678f = true;
                                                    }
                                                    if (i >= 0) {
                                                        int iEncode = SimpleLame.encode(sArrM159128A, sArrM159128A, i, bArr);
                                                        if (iEncode < 0) {
                                                            if (mnc0.this.f137676d != null) {
                                                                m159156a(6);
                                                            }
                                                        } else if (iEncode != 0) {
                                                            try {
                                                                fileOutputStream.write(bArr, 0, iEncode);
                                                            } catch (IOException unused) {
                                                                if (mnc0.this.f137676d != null) {
                                                                    m159156a(7);
                                                                }
                                                                z = false;
                                                                objArr = true;
                                                                iFlush = SimpleLame.flush(bArr);
                                                                if (iFlush < 0) {
                                                                    m159156a(6);
                                                                }
                                                                if (iFlush != 0) {
                                                                    try {
                                                                        fileOutputStream.write(bArr, 0, iFlush);
                                                                    } catch (Exception unused2) {
                                                                        if (mnc0.this.f137676d != null) {
                                                                            m159156a(7);
                                                                        }
                                                                    }
                                                                }
                                                                fileOutputStream.close();
                                                                if (mnc0.this.f137682j) {
                                                                    if (tTAgcProcessor != null) {
                                                                        tTAgcProcessor.free();
                                                                    }
                                                                    if (tTNsProcessor != null) {
                                                                        tTNsProcessor.free();
                                                                    }
                                                                }
                                                                if (audioRecordM159150t.getState() == 1) {
                                                                    audioRecordM159150t.stop();
                                                                    audioRecordM159150t.release();
                                                                }
                                                                SimpleLame.close();
                                                                mnc0.this.f137675c = false;
                                                                if (mnc0.this.f137676d != null) {
                                                                    if (z) {
                                                                        m159156a(1);
                                                                        return;
                                                                    } else {
                                                                        if (objArr == true) {
                                                                            return;
                                                                        }
                                                                        m159156a(9);
                                                                        return;
                                                                    }
                                                                }
                                                                return;
                                                            }
                                                        }
                                                    } else if (mnc0.this.f137676d != null) {
                                                        m159156a(5);
                                                    }
                                                    z = false;
                                                } else {
                                                    z = true;
                                                }
                                            } else if (mnc0Var2.f137676d != null) {
                                                m159156a(5);
                                            }
                                            objArr = true;
                                        }
                                        iFlush = SimpleLame.flush(bArr);
                                        if (iFlush < 0 && mnc0.this.f137676d != null) {
                                            m159156a(6);
                                        }
                                        if (iFlush != 0) {
                                            fileOutputStream.write(bArr, 0, iFlush);
                                        }
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException unused3) {
                                            if (mnc0.this.f137676d != null) {
                                                m159156a(8);
                                            }
                                        }
                                        if (mnc0.this.f137682j) {
                                            if (tTAgcProcessor != null) {
                                                tTAgcProcessor.free();
                                            }
                                            if (tTNsProcessor != null) {
                                                tTNsProcessor.free();
                                            }
                                        }
                                        if (audioRecordM159150t.getState() == 1) {
                                            audioRecordM159150t.stop();
                                            audioRecordM159150t.release();
                                        }
                                        SimpleLame.close();
                                        mnc0.this.f137675c = false;
                                        if (mnc0.this.f137676d != null) {
                                            if (z) {
                                                m159156a(1);
                                                return;
                                            } else {
                                                if (objArr == true) {
                                                    m159156a(9);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        return;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (mnc0.this.f137682j) {
                                            if (tTAgcProcessor != null) {
                                                tTAgcProcessor.free();
                                            }
                                            if (tTNsProcessor != null) {
                                                tTNsProcessor.free();
                                            }
                                        }
                                        if (audioRecordM159150t.getState() == 1) {
                                            audioRecordM159150t.stop();
                                            audioRecordM159150t.release();
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                tTNsProcessor = null;
                            }
                        } catch (IllegalStateException unused4) {
                            if (mnc0.this.f137676d != null) {
                                m159156a(4);
                            }
                            SimpleLame.close();
                            mnc0.this.f137675c = false;
                        }
                    } catch (Throwable th4) {
                        SimpleLame.close();
                        mnc0.this.f137675c = false;
                        throw th4;
                    }
                } catch (Throwable th5) {
                    mnc0.this.f137675c = false;
                    throw th5;
                }
            } catch (FileNotFoundException unused5) {
                if (mnc0.this.f137676d != null) {
                    m159156a(3);
                }
                mnc0.this.f137675c = false;
            } catch (IOException unused6) {
                if (mnc0.this.f137676d != null) {
                    m159156a(3);
                }
                mnc0.this.f137675c = false;
            }
        }
    }

    public mnc0(String str, boolean z) {
        this.f137681i = z;
        this.f137673a = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public short[] m159128A(short[] sArr, TTNsProcessor tTNsProcessor) {
        try {
            short[] sArr2 = new short[sArr.length];
            int i = this.f137690r;
            if (i <= 0) {
                i = 1;
            }
            return tTNsProcessor.process(sArr, i, sArr2) < 0 ? sArr : sArr2;
        } catch (Exception unused) {
            return sArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public double m159145q(short[] sArr) {
        double dAbs = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        for (short s : sArr) {
            if (s >= 32768) {
                s = p7f.COLOR_SPACE_UNCALIBRATED - s;
            }
            dAbs += (double) Math.abs(s);
        }
        return dAbs / ((double) sArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public void m159146r(TTAgcProcessor tTAgcProcessor) {
        short s = this.f137689q;
        if (s >= 0) {
            tTAgcProcessor.setCompressionGaindB(s);
        }
        tTAgcProcessor.setLimiterEnable(this.f137687o);
        int i = this.f137685m;
        if (i >= 0) {
            tTAgcProcessor.setMaxLevel(i);
        }
        int i2 = this.f137684l;
        if (i2 >= 0) {
            tTAgcProcessor.setMinLevel(i2);
        }
        int i3 = this.f137686n;
        if (i3 >= 0) {
            tTAgcProcessor.setAgcMode(i3);
        }
        int i4 = this.f137690r;
        if (i4 >= 0) {
            tTAgcProcessor.setNumBands(i4);
        }
        short s2 = this.f137688p;
        if (s2 >= 0) {
            tTAgcProcessor.setTargetLevelDbfs(s2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m159147s(TTNsProcessor tTNsProcessor) {
        int i = this.f137691s;
        if (i >= 0) {
            tTNsProcessor.setNsMode(i);
        } else {
            tTNsProcessor.setNsMode(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public short[] m159148z(short[] sArr, TTAgcProcessor tTAgcProcessor) {
        try {
            short[] sArr2 = new short[sArr.length];
            return tTAgcProcessor.process(sArr, this.f137683k, sArr2, 0) < 0 ? sArr : sArr2;
        } catch (Exception unused) {
            return sArr;
        }
    }

    /* JADX INFO: renamed from: B */
    public void m159149B() {
        this.f137679g = true;
    }

    /* JADX INFO: renamed from: t */
    public AudioRecord m159150t() {
        for (int i : this.f137682j ? f137672u : f137671t) {
            try {
                int minBufferSize = AudioRecord.getMinBufferSize(i, 16, 2);
                if (minBufferSize != -2) {
                    AudioRecord audioRecord = new AudioRecord(1, i, 16, 2, minBufferSize * 2);
                    if (audioRecord.getState() == 1) {
                        this.f137674b = i;
                        if (!this.f137682j) {
                            this.f137680h = minBufferSize;
                        } else if (i < 16000) {
                            this.f137680h = 80;
                            this.f137683k = 80;
                        } else {
                            this.f137680h = 160;
                            this.f137683k = 160;
                        }
                        return audioRecord;
                    }
                } else {
                    continue;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public int m159151u() {
        return this.f137677e;
    }

    /* JADX INFO: renamed from: v */
    public void m159152v(Handler handler) {
        this.f137676d = handler;
    }

    /* JADX INFO: renamed from: w */
    public void m159153w(boolean z) {
        this.f137682j = z;
    }

    /* JADX INFO: renamed from: x */
    public void m159154x(int i) {
        this.f137691s = i;
    }

    /* JADX INFO: renamed from: y */
    public void m159155y(int i) {
        if (this.f137675c) {
            return;
        }
        this.f137679g = false;
        this.f137675c = true;
        new C18659a(i).start();
    }
}
