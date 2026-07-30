package com.tencent.liteav.p089a;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.tencent.liteav.audio.InterfaceC14148f;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.audio.impl.Record.C14152b;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.C14215f;
import com.tencent.liteav.muxer.C14282c;
import com.tencent.liteav.videoencoder.C14487a;
import com.tencent.liteav.videoencoder.InterfaceC14490d;
import com.tencent.liteav.videoencoder.TXSVideoEncoderParam;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: renamed from: com.tencent.liteav.a.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14129a implements InterfaceC14148f, InterfaceC14490d {

    /* JADX INFO: renamed from: c */
    private C14282c f58802c;

    /* JADX INFO: renamed from: d */
    private a f58803d;

    /* JADX INFO: renamed from: e */
    private b f58804e;

    /* JADX INFO: renamed from: f */
    private long f58805f = 0;

    /* JADX INFO: renamed from: g */
    private long f58806g = -1;

    /* JADX INFO: renamed from: h */
    private boolean f58807h = false;

    /* JADX INFO: renamed from: i */
    private Handler f58808i = new Handler(Looper.getMainLooper()) { // from class: com.tencent.liteav.a.a.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (C14129a.this.f58804e != null) {
                int i = message.what;
                if (i == 1) {
                    C14129a.this.f58804e.mo83844a(((Long) message.obj).longValue());
                    return;
                }
                if (i != 2) {
                    return;
                }
                TXCLog.m84147d("TXCStreamRecord", "record complete. errcode = " + message.arg1 + ", errmsg = " + ((String) message.obj) + ", outputPath = " + C14129a.this.f58803d.f58815f + ", coverImage = " + C14129a.this.f58803d.f58816g);
                if (message.arg1 == 0 && C14129a.this.f58803d.f58816g != null && !C14129a.this.f58803d.f58816g.isEmpty() && !C14215f.m84224a(C14129a.this.f58803d.f58815f, C14129a.this.f58803d.f58816g)) {
                    TXCLog.m84149e("TXCStreamRecord", "saveVideoThumb error. sourcePath = " + C14129a.this.f58803d.f58815f + ", coverImagePath = " + C14129a.this.f58803d.f58816g);
                }
                if (message.arg1 != 0) {
                    try {
                        File file = new File(C14129a.this.f58803d.f58815f);
                        if (file.exists()) {
                            file.delete();
                        }
                    } catch (Exception e) {
                        TXCLog.m84150e("TXCStreamRecord", "delete file failed.", e);
                    }
                }
                C14129a.this.f58804e.mo83843a(message.arg1, (String) message.obj, C14129a.this.f58803d.f58815f, C14129a.this.f58803d.f58816g);
            }
        }
    };

    /* JADX INFO: renamed from: a */
    private C14152b f58800a = new C14152b();

    /* JADX INFO: renamed from: b */
    private C14487a f58801b = new C14487a();

    /* JADX INFO: renamed from: com.tencent.liteav.a.a$a */
    public static class a {

        /* JADX INFO: renamed from: e */
        public Object f58814e;

        /* JADX INFO: renamed from: f */
        public String f58815f;

        /* JADX INFO: renamed from: g */
        public String f58816g;

        /* JADX INFO: renamed from: a */
        public int f58810a = 544;

        /* JADX INFO: renamed from: b */
        public int f58811b = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;

        /* JADX INFO: renamed from: c */
        public int f58812c = 20;

        /* JADX INFO: renamed from: d */
        public int f58813d = 1000;

        /* JADX INFO: renamed from: h */
        public int f58817h = 0;

        /* JADX INFO: renamed from: i */
        public int f58818i = 0;

        /* JADX INFO: renamed from: j */
        public int f58819j = 16;

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TXCStreamRecordParams: [width=" + this.f58810a);
            sb.append("; height=" + this.f58811b);
            sb.append("; fps=" + this.f58812c);
            sb.append("; bitrate=" + this.f58813d);
            sb.append("; channels=" + this.f58817h);
            sb.append("; samplerate=" + this.f58818i);
            sb.append("; bits=" + this.f58819j);
            sb.append("; EGLContext=" + this.f58814e);
            sb.append("; coveriamge=" + this.f58816g);
            sb.append("; outputpath=" + this.f58815f + Constants.AES_SUFFIX);
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.a.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo83843a(int i, String str, String str2, String str3);

        /* JADX INFO: renamed from: a */
        void mo83844a(long j);
    }

    public C14129a(Context context) {
        this.f58802c = new C14282c(context, 2);
    }

    /* JADX INFO: renamed from: a */
    public static String m83831a(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
            String str2 = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date(Long.valueOf(strValueOf + "000").longValue()));
            String strM83830a = m83830a(context);
            if (TextUtils.isEmpty(strM83830a)) {
                return null;
            }
            return new File(strM83830a, String.format("TXUGC_%s" + str, str2)).getAbsolutePath();
        } catch (Exception e) {
            TXCLog.m84150e("TXCStreamRecord", "create file path failed.", e);
            return null;
        }
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC14490d
    /* JADX INFO: renamed from: k */
    public void mo83841k(int i) {
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC14490d
    /* JADX INFO: renamed from: l */
    public void mo83842l(int i) {
    }

    @Override // com.tencent.liteav.audio.InterfaceC14148f
    public void onRecordEncData(byte[] bArr, long j, int i, int i2, int i3) {
        this.f58802c.mo84808a(bArr, 0, bArr.length, j * 1000, 1);
    }

    @Override // com.tencent.liteav.audio.InterfaceC14148f
    public void onRecordError(int i, String str) {
    }

    @Override // com.tencent.liteav.audio.InterfaceC14148f
    public void onRecordPcmData(byte[] bArr, long j, int i, int i2, int i3) {
    }

    @Override // com.tencent.liteav.audio.InterfaceC14148f
    public void onRecordRawPcmData(byte[] bArr, long j, int i, int i2, int i3, boolean z) {
    }

    /* JADX INFO: renamed from: a */
    public void m83838a(b bVar) {
        this.f58804e = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m83837a(a aVar) {
        int i;
        int i2;
        this.f58803d = aVar;
        this.f58805f = 0L;
        this.f58806g = -1L;
        this.f58802c.mo84807a(aVar.f58815f);
        int i3 = aVar.f58817h;
        if (i3 > 0 && (i = aVar.f58818i) > 0 && (i2 = aVar.f58819j) > 0) {
            this.f58800a.m83872a(10, i, i3, i2, new WeakReference<>(this));
            a aVar2 = this.f58803d;
            this.f58802c.mo84810b(C14215f.m84216a(aVar2.f58818i, aVar2.f58817h, 2));
            this.f58807h = true;
        }
        this.f58801b.setListener(this);
        TXSVideoEncoderParam tXSVideoEncoderParam = new TXSVideoEncoderParam();
        a aVar3 = this.f58803d;
        tXSVideoEncoderParam.width = aVar3.f58810a;
        tXSVideoEncoderParam.height = aVar3.f58811b;
        tXSVideoEncoderParam.fps = aVar3.f58812c;
        tXSVideoEncoderParam.glContext = aVar3.f58814e;
        tXSVideoEncoderParam.annexb = true;
        tXSVideoEncoderParam.appendSpsPps = false;
        this.f58801b.setBitrate(aVar3.f58813d);
        this.f58801b.start(tXSVideoEncoderParam);
    }

    /* JADX INFO: renamed from: a */
    public void m83833a() {
        this.f58807h = false;
        this.f58800a.m83871a();
        this.f58801b.stop();
        int iMo84809b = this.f58802c.mo84809b();
        Handler handler = this.f58808i;
        if (iMo84809b < 0) {
            handler.sendMessage(Message.obtain(handler, 2, 1, 0, "mp4合成失败"));
        } else {
            handler.sendMessage(Message.obtain(handler, 2, 0, 0, ""));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83834a(int i, long j) {
        C14487a c14487a = this.f58801b;
        a aVar = this.f58803d;
        c14487a.pushVideoFrame(i, aVar.f58810a, aVar.f58811b, j);
    }

    /* JADX INFO: renamed from: a */
    public void m83840a(byte[] bArr, long j) {
        if (this.f58807h) {
            this.f58800a.m83873a(bArr, j);
        } else {
            TXCLog.m84149e("TXCStreamRecord", "drainAudio fail because of not init yet!");
        }
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC14490d
    /* JADX INFO: renamed from: a */
    public void mo83835a(int i, long j, long j2) {
    }

    /* JADX INFO: renamed from: a */
    private static String m83830a(Context context) {
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
    private String m83829a(int i) {
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
        Handler handler = this.f58808i;
        handler.sendMessage(Message.obtain(handler, 2, 1, 0, str));
        return str;
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC14490d
    /* JADX INFO: renamed from: a */
    public void mo83839a(TXSNALPacket tXSNALPacket, int i) {
        if (i == 0) {
            C14282c c14282c = this.f58802c;
            byte[] bArr = tXSNALPacket.nalData;
            c14282c.mo84811b(bArr, 0, bArr.length, tXSNALPacket.pts * 1000, tXSNALPacket.info.flags);
            if (this.f58806g < 0) {
                this.f58806g = tXSNALPacket.pts;
            }
            long j = tXSNALPacket.pts;
            if (j > this.f58805f + 500) {
                Handler handler = this.f58808i;
                handler.sendMessage(Message.obtain(handler, 1, new Long(j - this.f58806g)));
                this.f58805f = tXSNALPacket.pts;
                return;
            }
            return;
        }
        TXCLog.m84149e("TXCStreamRecord", "video encode error! errmsg: " + m83829a(i));
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC14490d
    /* JADX INFO: renamed from: a */
    public void mo83836a(MediaFormat mediaFormat) {
        this.f58802c.mo84806a(mediaFormat);
        if (!this.f58802c.mo84812c() || this.f58802c.mo84805a() >= 0) {
            return;
        }
        Handler handler = this.f58808i;
        handler.sendMessage(Message.obtain(handler, 2, 1, 0, "mp4 wrapper failed to start"));
    }
}
