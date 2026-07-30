package com.tencent.liteav.p084a;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.tencent.liteav.audio.InterfaceC13985f;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.audio.impl.Record.C13989b;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.C14052f;
import com.tencent.liteav.muxer.C14119c;
import com.tencent.liteav.videoencoder.C14324a;
import com.tencent.liteav.videoencoder.InterfaceC14327d;
import com.tencent.liteav.videoencoder.TXSVideoEncoderParam;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: renamed from: com.tencent.liteav.a.a */
/* JADX INFO: loaded from: classes2.dex */
public class C13966a implements InterfaceC13985f, InterfaceC14327d {

    /* JADX INFO: renamed from: c */
    private C14119c f57954c;

    /* JADX INFO: renamed from: d */
    private a f57955d;

    /* JADX INFO: renamed from: e */
    private b f57956e;

    /* JADX INFO: renamed from: f */
    private long f57957f = 0;

    /* JADX INFO: renamed from: g */
    private long f57958g = -1;

    /* JADX INFO: renamed from: h */
    private boolean f57959h = false;

    /* JADX INFO: renamed from: i */
    private Handler f57960i = new Handler(Looper.getMainLooper()) { // from class: com.tencent.liteav.a.a.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (C13966a.this.f57956e != null) {
                int i = message.what;
                if (i == 1) {
                    C13966a.this.f57956e.mo82661a(((Long) message.obj).longValue());
                    return;
                }
                if (i != 2) {
                    return;
                }
                TXCLog.m82964d("TXCStreamRecord", "record complete. errcode = " + message.arg1 + ", errmsg = " + ((String) message.obj) + ", outputPath = " + C13966a.this.f57955d.f57967f + ", coverImage = " + C13966a.this.f57955d.f57968g);
                if (message.arg1 == 0 && C13966a.this.f57955d.f57968g != null && !C13966a.this.f57955d.f57968g.isEmpty() && !C14052f.m83041a(C13966a.this.f57955d.f57967f, C13966a.this.f57955d.f57968g)) {
                    TXCLog.m82966e("TXCStreamRecord", "saveVideoThumb error. sourcePath = " + C13966a.this.f57955d.f57967f + ", coverImagePath = " + C13966a.this.f57955d.f57968g);
                }
                if (message.arg1 != 0) {
                    try {
                        File file = new File(C13966a.this.f57955d.f57967f);
                        if (file.exists()) {
                            file.delete();
                        }
                    } catch (Exception e) {
                        TXCLog.m82967e("TXCStreamRecord", "delete file failed.", e);
                    }
                }
                C13966a.this.f57956e.mo82660a(message.arg1, (String) message.obj, C13966a.this.f57955d.f57967f, C13966a.this.f57955d.f57968g);
            }
        }
    };

    /* JADX INFO: renamed from: a */
    private C13989b f57952a = new C13989b();

    /* JADX INFO: renamed from: b */
    private C14324a f57953b = new C14324a();

    /* JADX INFO: renamed from: com.tencent.liteav.a.a$a */
    public static class a {

        /* JADX INFO: renamed from: e */
        public Object f57966e;

        /* JADX INFO: renamed from: f */
        public String f57967f;

        /* JADX INFO: renamed from: g */
        public String f57968g;

        /* JADX INFO: renamed from: a */
        public int f57962a = 544;

        /* JADX INFO: renamed from: b */
        public int f57963b = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;

        /* JADX INFO: renamed from: c */
        public int f57964c = 20;

        /* JADX INFO: renamed from: d */
        public int f57965d = 1000;

        /* JADX INFO: renamed from: h */
        public int f57969h = 0;

        /* JADX INFO: renamed from: i */
        public int f57970i = 0;

        /* JADX INFO: renamed from: j */
        public int f57971j = 16;

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TXCStreamRecordParams: [width=" + this.f57962a);
            sb.append("; height=" + this.f57963b);
            sb.append("; fps=" + this.f57964c);
            sb.append("; bitrate=" + this.f57965d);
            sb.append("; channels=" + this.f57969h);
            sb.append("; samplerate=" + this.f57970i);
            sb.append("; bits=" + this.f57971j);
            sb.append("; EGLContext=" + this.f57966e);
            sb.append("; coveriamge=" + this.f57968g);
            sb.append("; outputpath=" + this.f57967f + Constants.AES_SUFFIX);
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.a.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo82660a(int i, String str, String str2, String str3);

        /* JADX INFO: renamed from: a */
        void mo82661a(long j);
    }

    public C13966a(Context context) {
        this.f57954c = new C14119c(context, 2);
    }

    /* JADX INFO: renamed from: a */
    public static String m82648a(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
            String str2 = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date(Long.valueOf(strValueOf + "000").longValue()));
            String strM82647a = m82647a(context);
            if (TextUtils.isEmpty(strM82647a)) {
                return null;
            }
            return new File(strM82647a, String.format("TXUGC_%s" + str, str2)).getAbsolutePath();
        } catch (Exception e) {
            TXCLog.m82967e("TXCStreamRecord", "create file path failed.", e);
            return null;
        }
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC14327d
    /* JADX INFO: renamed from: k */
    public void mo82658k(int i) {
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC14327d
    /* JADX INFO: renamed from: l */
    public void mo82659l(int i) {
    }

    @Override // com.tencent.liteav.audio.InterfaceC13985f
    public void onRecordEncData(byte[] bArr, long j, int i, int i2, int i3) {
        this.f57954c.mo83625a(bArr, 0, bArr.length, j * 1000, 1);
    }

    @Override // com.tencent.liteav.audio.InterfaceC13985f
    public void onRecordError(int i, String str) {
    }

    @Override // com.tencent.liteav.audio.InterfaceC13985f
    public void onRecordPcmData(byte[] bArr, long j, int i, int i2, int i3) {
    }

    @Override // com.tencent.liteav.audio.InterfaceC13985f
    public void onRecordRawPcmData(byte[] bArr, long j, int i, int i2, int i3, boolean z) {
    }

    /* JADX INFO: renamed from: a */
    public void m82655a(b bVar) {
        this.f57956e = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m82654a(a aVar) {
        int i;
        int i2;
        this.f57955d = aVar;
        this.f57957f = 0L;
        this.f57958g = -1L;
        this.f57954c.mo83624a(aVar.f57967f);
        int i3 = aVar.f57969h;
        if (i3 > 0 && (i = aVar.f57970i) > 0 && (i2 = aVar.f57971j) > 0) {
            this.f57952a.m82689a(10, i, i3, i2, new WeakReference<>(this));
            a aVar2 = this.f57955d;
            this.f57954c.mo83627b(C14052f.m83033a(aVar2.f57970i, aVar2.f57969h, 2));
            this.f57959h = true;
        }
        this.f57953b.setListener(this);
        TXSVideoEncoderParam tXSVideoEncoderParam = new TXSVideoEncoderParam();
        a aVar3 = this.f57955d;
        tXSVideoEncoderParam.width = aVar3.f57962a;
        tXSVideoEncoderParam.height = aVar3.f57963b;
        tXSVideoEncoderParam.fps = aVar3.f57964c;
        tXSVideoEncoderParam.glContext = aVar3.f57966e;
        tXSVideoEncoderParam.annexb = true;
        tXSVideoEncoderParam.appendSpsPps = false;
        this.f57953b.setBitrate(aVar3.f57965d);
        this.f57953b.start(tXSVideoEncoderParam);
    }

    /* JADX INFO: renamed from: a */
    public void m82650a() {
        this.f57959h = false;
        this.f57952a.m82688a();
        this.f57953b.stop();
        int iMo83626b = this.f57954c.mo83626b();
        Handler handler = this.f57960i;
        if (iMo83626b < 0) {
            handler.sendMessage(Message.obtain(handler, 2, 1, 0, "mp4合成失败"));
        } else {
            handler.sendMessage(Message.obtain(handler, 2, 0, 0, ""));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82651a(int i, long j) {
        C14324a c14324a = this.f57953b;
        a aVar = this.f57955d;
        c14324a.pushVideoFrame(i, aVar.f57962a, aVar.f57963b, j);
    }

    /* JADX INFO: renamed from: a */
    public void m82657a(byte[] bArr, long j) {
        if (this.f57959h) {
            this.f57952a.m82690a(bArr, j);
        } else {
            TXCLog.m82966e("TXCStreamRecord", "drainAudio fail because of not init yet!");
        }
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC14327d
    /* JADX INFO: renamed from: a */
    public void mo82652a(int i, long j, long j2) {
    }

    /* JADX INFO: renamed from: a */
    private static String m82647a(Context context) {
        if (context == null) {
            return null;
        }
        if (!"mounted".equals(Environment.getExternalStorageState()) && Environment.isExternalStorageRemovable()) {
            return context.getFilesDir().getPath();
        }
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_MOVIES);
        if (externalFilesDir != null) {
            return externalFilesDir.getPath();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private String m82646a(int i) {
        String str;
        switch (i) {
            case 10000002:
                str = "Video encoder is not activated";
                break;
            case 10000003:
                str = "Illegal video input parameters";
                break;
            case 10000004:
                str = "Video encoding failed to initialize";
                break;
            case 10000005:
                str = "Video encoding failed";
                break;
            default:
                str = "";
                break;
        }
        Handler handler = this.f57960i;
        handler.sendMessage(Message.obtain(handler, 2, 1, 0, str));
        return str;
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC14327d
    /* JADX INFO: renamed from: a */
    public void mo82656a(TXSNALPacket tXSNALPacket, int i) {
        if (i == 0) {
            C14119c c14119c = this.f57954c;
            byte[] bArr = tXSNALPacket.nalData;
            c14119c.mo83628b(bArr, 0, bArr.length, tXSNALPacket.pts * 1000, tXSNALPacket.info.flags);
            if (this.f57958g < 0) {
                this.f57958g = tXSNALPacket.pts;
            }
            long j = tXSNALPacket.pts;
            if (j > this.f57957f + 500) {
                Handler handler = this.f57960i;
                handler.sendMessage(Message.obtain(handler, 1, new Long(j - this.f57958g)));
                this.f57957f = tXSNALPacket.pts;
                return;
            }
            return;
        }
        TXCLog.m82966e("TXCStreamRecord", "video encode error! errmsg: " + m82646a(i));
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC14327d
    /* JADX INFO: renamed from: a */
    public void mo82653a(MediaFormat mediaFormat) {
        this.f57954c.mo83623a(mediaFormat);
        if (!this.f57954c.mo83629c() || this.f57954c.mo83622a() >= 0) {
            return;
        }
        Handler handler = this.f57960i;
        handler.sendMessage(Message.obtain(handler, 2, 1, 0, "mp4 wrapper failed to start"));
    }
}
