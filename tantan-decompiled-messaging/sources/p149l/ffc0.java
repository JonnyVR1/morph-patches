package p149l;

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
public class ffc0 {

    /* JADX INFO: renamed from: t */
    private static int[] f97202t = {44100, 22050, 16000, 11025, TXRecordCommon.AUDIO_SAMPLERATE_8000};

    /* JADX INFO: renamed from: u */
    private static int[] f97203u = {48000, 32000, 16000, TXRecordCommon.AUDIO_SAMPLERATE_8000};

    /* JADX INFO: renamed from: a */
    private String f97204a;

    /* JADX INFO: renamed from: b */
    private int f97205b;

    /* JADX INFO: renamed from: d */
    private Handler f97207d;

    /* JADX INFO: renamed from: e */
    private int f97208e;

    /* JADX INFO: renamed from: f */
    private boolean f97209f;

    /* JADX INFO: renamed from: g */
    private boolean f97210g;

    /* JADX INFO: renamed from: h */
    private int f97211h;

    /* JADX INFO: renamed from: i */
    private boolean f97212i;

    /* JADX INFO: renamed from: j */
    private boolean f97213j;

    /* JADX INFO: renamed from: k */
    private int f97214k;

    /* JADX INFO: renamed from: c */
    private boolean f97206c = false;

    /* JADX INFO: renamed from: l */
    private int f97215l = -1;

    /* JADX INFO: renamed from: m */
    private int f97216m = -1;

    /* JADX INFO: renamed from: n */
    private int f97217n = -1;

    /* JADX INFO: renamed from: o */
    private boolean f97218o = true;

    /* JADX INFO: renamed from: p */
    private short f97219p = -1;

    /* JADX INFO: renamed from: q */
    private short f97220q = -1;

    /* JADX INFO: renamed from: r */
    private int f97221r = -1;

    /* JADX INFO: renamed from: s */
    private int f97222s = -1;

    /* JADX INFO: renamed from: l.ffc0$a */
    public class C16815a extends Thread {

        /* JADX INFO: renamed from: a */
        private final int f97223a;

        public C16815a(int i) {
            this.f97223a = i;
        }

        /* JADX INFO: renamed from: a */
        private void m121139a(int i) {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = this.f97223a;
            ffc0.this.f97207d.sendMessage(messageObtain);
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
            AudioRecord audioRecordM121133t = ffc0.this.m121133t();
            ffc0 ffc0Var = ffc0.this;
            boolean z = false;
            if (audioRecordM121133t == null) {
                if (ffc0Var.f97207d != null) {
                    ffc0.this.f97206c = false;
                    m121139a(2);
                    return;
                }
                return;
            }
            SimpleLame.m84688a(ffc0Var.f97205b, 1, ffc0.this.f97205b, 32);
            short[] sArrM121111A = new short[ffc0.this.f97211h];
            byte[] bArr = new byte[(int) ((((double) (ffc0.this.f97211h * 2)) * 1.25d) + 7200.0d)];
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(uhi.m193724b(ffc0.this.f97204a), ffc0.this.f97212i);
                    ffc0.this.f97206c = false;
                    try {
                        try {
                            audioRecordM121133t.startRecording();
                            TTAgcProcessor tTAgcProcessor = null;
                            TTNsProcessor tTNsProcessorNewInstance = null;
                            tTAgcProcessor = null;
                            try {
                                if (ffc0.this.f97207d != null) {
                                    m121139a(0);
                                }
                                if (ffc0.this.f97213j) {
                                    TTAgcProcessor tTAgcProcessorNewInstance = TTAgcProcessor.newInstance(ffc0.this.f97205b);
                                    try {
                                        ffc0.this.m121129r(tTAgcProcessorNewInstance);
                                        tTAgcProcessorNewInstance.init();
                                        tTNsProcessorNewInstance = TTNsProcessor.newInstance(ffc0.this.f97205b);
                                        ffc0.this.m121130s(tTNsProcessorNewInstance);
                                        tTNsProcessorNewInstance.init();
                                        tTNsProcessor = tTNsProcessorNewInstance;
                                        tTAgcProcessor = tTAgcProcessorNewInstance;
                                    } catch (Throwable th) {
                                        th = th;
                                        tTNsProcessor = tTNsProcessorNewInstance;
                                        tTAgcProcessor = tTAgcProcessorNewInstance;
                                        if (ffc0.this.f97213j) {
                                            if (tTAgcProcessor != null) {
                                                tTAgcProcessor.free();
                                            }
                                            if (tTNsProcessor != null) {
                                                tTNsProcessor.free();
                                            }
                                        }
                                        if (audioRecordM121133t.getState() == 1) {
                                            audioRecordM121133t.stop();
                                            audioRecordM121133t.release();
                                        }
                                        throw th;
                                    }
                                } else {
                                    tTNsProcessor = null;
                                }
                                z = true;
                                while (true) {
                                    try {
                                        if (ffc0.this.f97210g) {
                                            objArr = false;
                                        } else {
                                            int i = audioRecordM121133t.read(sArrM121111A, 0, ffc0.this.f97211h);
                                            ffc0 ffc0Var2 = ffc0.this;
                                            if (i > 0) {
                                                if (ffc0Var2.f97213j) {
                                                    sArrM121111A = ffc0.this.m121111A(ffc0.this.m121131z(sArrM121111A, tTAgcProcessor), tTNsProcessor);
                                                }
                                                if (z) {
                                                    ffc0 ffc0Var3 = ffc0.this;
                                                    ffc0Var3.f97208e = (int) ffc0Var3.m121128q(sArrM121111A);
                                                    if (ffc0.this.f97208e <= 0 || ffc0.this.f97208e >= 25000) {
                                                        ffc0.this.f97209f = false;
                                                    } else {
                                                        ffc0.this.f97209f = true;
                                                    }
                                                    if (i >= 0) {
                                                        int iEncode = SimpleLame.encode(sArrM121111A, sArrM121111A, i, bArr);
                                                        if (iEncode < 0) {
                                                            if (ffc0.this.f97207d != null) {
                                                                m121139a(6);
                                                            }
                                                        } else if (iEncode != 0) {
                                                            try {
                                                                fileOutputStream.write(bArr, 0, iEncode);
                                                            } catch (IOException unused) {
                                                                if (ffc0.this.f97207d != null) {
                                                                    m121139a(7);
                                                                }
                                                                z = false;
                                                                objArr = true;
                                                                iFlush = SimpleLame.flush(bArr);
                                                                if (iFlush < 0) {
                                                                    m121139a(6);
                                                                }
                                                                if (iFlush != 0) {
                                                                    try {
                                                                        fileOutputStream.write(bArr, 0, iFlush);
                                                                    } catch (Exception unused2) {
                                                                        if (ffc0.this.f97207d != null) {
                                                                            m121139a(7);
                                                                        }
                                                                    }
                                                                }
                                                                fileOutputStream.close();
                                                                if (ffc0.this.f97213j) {
                                                                    if (tTAgcProcessor != null) {
                                                                        tTAgcProcessor.free();
                                                                    }
                                                                    if (tTNsProcessor != null) {
                                                                        tTNsProcessor.free();
                                                                    }
                                                                }
                                                                if (audioRecordM121133t.getState() == 1) {
                                                                    audioRecordM121133t.stop();
                                                                    audioRecordM121133t.release();
                                                                }
                                                                SimpleLame.close();
                                                                ffc0.this.f97206c = false;
                                                                if (ffc0.this.f97207d != null) {
                                                                    if (z) {
                                                                        m121139a(1);
                                                                        return;
                                                                    } else {
                                                                        if (objArr == true) {
                                                                            return;
                                                                        }
                                                                        m121139a(9);
                                                                        return;
                                                                    }
                                                                }
                                                                return;
                                                            }
                                                        }
                                                    } else if (ffc0.this.f97207d != null) {
                                                        m121139a(5);
                                                    }
                                                    z = false;
                                                } else {
                                                    z = true;
                                                }
                                            } else if (ffc0Var2.f97207d != null) {
                                                m121139a(5);
                                            }
                                            objArr = true;
                                        }
                                        iFlush = SimpleLame.flush(bArr);
                                        if (iFlush < 0 && ffc0.this.f97207d != null) {
                                            m121139a(6);
                                        }
                                        if (iFlush != 0) {
                                            fileOutputStream.write(bArr, 0, iFlush);
                                        }
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException unused3) {
                                            if (ffc0.this.f97207d != null) {
                                                m121139a(8);
                                            }
                                        }
                                        if (ffc0.this.f97213j) {
                                            if (tTAgcProcessor != null) {
                                                tTAgcProcessor.free();
                                            }
                                            if (tTNsProcessor != null) {
                                                tTNsProcessor.free();
                                            }
                                        }
                                        if (audioRecordM121133t.getState() == 1) {
                                            audioRecordM121133t.stop();
                                            audioRecordM121133t.release();
                                        }
                                        SimpleLame.close();
                                        ffc0.this.f97206c = false;
                                        if (ffc0.this.f97207d != null) {
                                            if (z) {
                                                m121139a(1);
                                                return;
                                            } else {
                                                if (objArr == true) {
                                                    m121139a(9);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        return;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (ffc0.this.f97213j) {
                                            if (tTAgcProcessor != null) {
                                                tTAgcProcessor.free();
                                            }
                                            if (tTNsProcessor != null) {
                                                tTNsProcessor.free();
                                            }
                                        }
                                        if (audioRecordM121133t.getState() == 1) {
                                            audioRecordM121133t.stop();
                                            audioRecordM121133t.release();
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                tTNsProcessor = null;
                            }
                        } catch (IllegalStateException unused4) {
                            if (ffc0.this.f97207d != null) {
                                m121139a(4);
                            }
                            SimpleLame.close();
                            ffc0.this.f97206c = false;
                        }
                    } catch (Throwable th4) {
                        SimpleLame.close();
                        ffc0.this.f97206c = false;
                        throw th4;
                    }
                } catch (Throwable th5) {
                    ffc0.this.f97206c = false;
                    throw th5;
                }
            } catch (FileNotFoundException unused5) {
                if (ffc0.this.f97207d != null) {
                    m121139a(3);
                }
                ffc0.this.f97206c = false;
            } catch (IOException unused6) {
                if (ffc0.this.f97207d != null) {
                    m121139a(3);
                }
                ffc0.this.f97206c = false;
            }
        }
    }

    public ffc0(String str, boolean z) {
        this.f97212i = z;
        this.f97204a = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public short[] m121111A(short[] sArr, TTNsProcessor tTNsProcessor) {
        try {
            short[] sArr2 = new short[sArr.length];
            int i = this.f97221r;
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
    public double m121128q(short[] sArr) {
        double dAbs = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        for (short s : sArr) {
            if (s >= 32768) {
                s = j6f.COLOR_SPACE_UNCALIBRATED - s;
            }
            dAbs += (double) Math.abs(s);
        }
        return dAbs / ((double) sArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public void m121129r(TTAgcProcessor tTAgcProcessor) {
        short s = this.f97220q;
        if (s >= 0) {
            tTAgcProcessor.setCompressionGaindB(s);
        }
        tTAgcProcessor.setLimiterEnable(this.f97218o);
        int i = this.f97216m;
        if (i >= 0) {
            tTAgcProcessor.setMaxLevel(i);
        }
        int i2 = this.f97215l;
        if (i2 >= 0) {
            tTAgcProcessor.setMinLevel(i2);
        }
        int i3 = this.f97217n;
        if (i3 >= 0) {
            tTAgcProcessor.setAgcMode(i3);
        }
        int i4 = this.f97221r;
        if (i4 >= 0) {
            tTAgcProcessor.setNumBands(i4);
        }
        short s2 = this.f97219p;
        if (s2 >= 0) {
            tTAgcProcessor.setTargetLevelDbfs(s2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m121130s(TTNsProcessor tTNsProcessor) {
        int i = this.f97222s;
        if (i >= 0) {
            tTNsProcessor.setNsMode(i);
        } else {
            tTNsProcessor.setNsMode(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public short[] m121131z(short[] sArr, TTAgcProcessor tTAgcProcessor) {
        try {
            short[] sArr2 = new short[sArr.length];
            return tTAgcProcessor.process(sArr, this.f97214k, sArr2, 0) < 0 ? sArr : sArr2;
        } catch (Exception unused) {
            return sArr;
        }
    }

    /* JADX INFO: renamed from: B */
    public void m121132B() {
        this.f97210g = true;
    }

    /* JADX INFO: renamed from: t */
    public AudioRecord m121133t() {
        for (int i : this.f97213j ? f97203u : f97202t) {
            try {
                int minBufferSize = AudioRecord.getMinBufferSize(i, 16, 2);
                if (minBufferSize != -2) {
                    AudioRecord audioRecord = new AudioRecord(1, i, 16, 2, minBufferSize * 2);
                    if (audioRecord.getState() == 1) {
                        this.f97205b = i;
                        if (!this.f97213j) {
                            this.f97211h = minBufferSize;
                        } else if (i < 16000) {
                            this.f97211h = 80;
                            this.f97214k = 80;
                        } else {
                            this.f97211h = 160;
                            this.f97214k = 160;
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
    public int m121134u() {
        return this.f97208e;
    }

    /* JADX INFO: renamed from: v */
    public void m121135v(Handler handler) {
        this.f97207d = handler;
    }

    /* JADX INFO: renamed from: w */
    public void m121136w(boolean z) {
        this.f97213j = z;
    }

    /* JADX INFO: renamed from: x */
    public void m121137x(int i) {
        this.f97222s = i;
    }

    /* JADX INFO: renamed from: y */
    public void m121138y(int i) {
        if (this.f97206c) {
            return;
        }
        this.f97210g = false;
        this.f97206c = true;
        new C16815a(i).start();
    }
}
