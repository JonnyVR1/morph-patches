package p153l;

import android.os.SystemClock;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import com.tencent.open.SocialConstants;
import java.util.UUID;
import okio.ByteString;
import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.gip.asr.base.Sudint;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class oug0 extends ksp0 {

    /* JADX INFO: renamed from: a */
    public final cgg0 f149150a;

    /* JADX INFO: renamed from: b */
    public final nzg0 f149151b;

    /* JADX INFO: renamed from: c */
    public final int f149152c = 16000;

    /* JADX INFO: renamed from: d */
    public final int f149153d = 16;

    /* JADX INFO: renamed from: e */
    public final int f149154e = 1;

    /* JADX INFO: renamed from: f */
    public final int f149155f = 6400;

    /* JADX INFO: renamed from: g */
    public boolean f149156g;

    /* JADX INFO: renamed from: h */
    public boolean f149157h;

    /* JADX INFO: renamed from: i */
    public asg0 f149158i;

    /* JADX INFO: renamed from: j */
    public mog0 f149159j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ uwg0 f149160k;

    public oug0(uwg0 uwg0Var, cgg0 cgg0Var, nzg0 nzg0Var) {
        this.f149160k = uwg0Var;
        this.f149150a = cgg0Var;
        this.f149151b = nzg0Var;
    }

    @Override // p153l.ksp0
    /* JADX INFO: renamed from: a */
    public final void mo151272a(hsp0 hsp0Var, int i, String str) {
        super.mo151272a(hsp0Var, i, str);
        LogUtils.file("DoubaoAsrAsyncClient", "===> onClosed： code:" + i + " reason:" + str);
        SudLogger.m222811d(this.f149160k.f181265a, "===> onClosed： code:" + i + " reason:" + str);
        ThreadUtils.postUITask(new Runnable() { // from class: l.gtg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f106417a.m169297g();
            }
        });
    }

    @Override // p153l.ksp0
    /* JADX INFO: renamed from: b */
    public final void mo151273b(hsp0 hsp0Var, int i, String str) {
        super.mo151273b(hsp0Var, i, str);
        hsp0Var.close(i, str);
        LogUtils.file("DoubaoAsrAsyncClient", "===> onClosing： code:" + i + " reason:" + str);
        SudLogger.m222811d(this.f149160k.f181265a, "===> onClosing： code:" + i + " reason:" + str);
    }

    @Override // p153l.ksp0
    /* JADX INFO: renamed from: c */
    public final void mo151274c(hsp0 hsp0Var, final Throwable th, i5d0 i5d0Var) {
        super.mo151274c(hsp0Var, th, i5d0Var);
        StringBuilder sb = new StringBuilder("===> onFailure： Throwable:");
        sb.append(th.getMessage());
        sb.append(" Response:");
        sb.append(i5d0Var == null ? "null" : i5d0Var.toString());
        LogUtils.file("DoubaoAsrAsyncClient", sb.toString());
        String str = this.f149160k.f181265a;
        StringBuilder sb2 = new StringBuilder("===> onFailure： Throwable:");
        sb2.append(th.getMessage());
        sb2.append(" Response:");
        sb2.append(i5d0Var != null ? i5d0Var.toString() : "null");
        SudLogger.m222811d(str, sb2.toString());
        ThreadUtils.postUITask(new Runnable() { // from class: l.itg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f116832a.m169298h(th);
            }
        });
    }

    @Override // p153l.ksp0
    /* JADX INFO: renamed from: e */
    public final void mo151276e(hsp0 hsp0Var, ByteString byteString) {
        this.f149160k.f181277m.offer(byteString.toByteArray());
    }

    @Override // p153l.ksp0
    /* JADX INFO: renamed from: f */
    public final void mo151277f(hsp0 hsp0Var, i5d0 i5d0Var) {
        String strM138675u = i5d0Var.m138675u("X-Tt-Logid");
        LogUtils.file("DoubaoAsrAsyncClient", "===> onOpen,X-Tt-Logid:" + strM138675u);
        SudLogger.m222811d(this.f149160k.f181265a, "===> onOpen,X-Tt-Logid:" + strM138675u);
        ThreadUtils.postUITask(new Runnable() { // from class: l.htg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f111540a.m169302l();
            }
        });
        if (this.f149158i == null) {
            asg0 asg0Var = new asg0(this, hsp0Var);
            this.f149158i = asg0Var;
            asg0Var.start();
        }
        if (this.f149159j == null) {
            mog0 mog0Var = new mog0(this);
            this.f149159j = mog0Var;
            mog0Var.start();
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m169297g() {
        this.f149160k.m198359k();
        this.f149151b.mo122354b();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m169298h(Throwable th) {
        this.f149151b.mo122355c(th);
        this.f149160k.m198352b();
    }

    /* JADX INFO: renamed from: i */
    public final void m169299i(hsp0 hsp0Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Oauth2AccessToken.KEY_UID, this.f149150a.f81669e);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("format", "pcm");
        jSONObject2.put("codec", "raw");
        jSONObject2.put("rate", this.f149152c);
        jSONObject2.put("bits", this.f149153d);
        jSONObject2.put("channel", this.f149154e);
        jSONObject2.put(IjkMediaMeta.IJKM_KEY_LANGUAGE, this.f149150a.f81671g);
        JSONObject jSONObject3 = this.f149150a.f81675k;
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
            jSONObject3.put("model_name", this.f149150a.f81672h);
            jSONObject3.put("enable_punc", true);
            jSONObject3.put("enable_itn", true);
            jSONObject3.put("enable_nonstream", true);
            jSONObject3.put("end_window_size", 200);
            jSONObject3.put("force_to_speech_time", 1);
            jSONObject3.put("result_type", "single");
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("user", jSONObject);
        jSONObject4.put("audio", jSONObject2);
        jSONObject4.put(SocialConstants.TYPE_REQUEST, jSONObject3);
        String string = jSONObject4.toString();
        SudLogger.m222811d(this.f149160k.f181265a, "发送完整客户端请求: " + string);
        LogUtils.file("DoubaoAsrAsyncClient", "发送完整客户端请求: " + string);
        byte[] bytes = string.getBytes();
        byte[] bArrM198351i = uwg0.m198351i(bytes, bytes.length);
        byte[] bArrM198350h = uwg0.m198350h(bArrM198351i.length);
        byte[] bArrM198350h2 = uwg0.m198350h(1);
        byte[] bArr = new byte[bArrM198351i.length + 12];
        System.arraycopy(new byte[]{17, 17, 17, 0}, 0, bArr, 0, 4);
        System.arraycopy(bArrM198350h2, 0, bArr, 4, 4);
        System.arraycopy(bArrM198350h, 0, bArr, 8, 4);
        System.arraycopy(bArrM198351i, 0, bArr, 12, bArrM198351i.length);
        hsp0Var.mo137027c(ByteString.m222317of(bArr));
        int i = 1;
        while (true) {
            uwg0 uwg0Var = this.f149160k;
            if (!uwg0Var.f181266b) {
                return;
            }
            if (this.f149157h) {
                SudLogger.m222811d(uwg0Var.f181265a, "已经发了最后一个包，不再发送数据包");
                LogUtils.file("DoubaoAsrAsyncClient", "已经发了最后一个包，不再发送数据包");
                ThreadUtils.postUITask(new Runnable() { // from class: l.jtg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f122590a.m169301k();
                    }
                });
                return;
            }
            if (this.f149156g) {
                SudLogger.m222811d(uwg0Var.f181265a, "给后端发送最后一个数据包");
                LogUtils.file("DoubaoAsrAsyncClient", "给后端发送最后一个数据包");
                m169300j(hsp0Var, new byte[this.f149155f], true, -(i + 1));
                this.f149157h = true;
                return;
            }
            pkg0 pkg0Var = this.f149150a.f81670f;
            int i2 = this.f149155f;
            byte[] bArr2 = new byte[i2];
            pkg0Var.getClass();
            int iTakeBuffer = 0;
            while (iTakeBuffer < i2) {
                try {
                    iTakeBuffer += pkg0Var.f152838a.takeBuffer(bArr2, iTakeBuffer);
                } catch (Exception unused) {
                }
            }
            if (iTakeBuffer <= 0) {
                SudLogger.m222811d(this.f149160k.f181265a, "===>read len <= 0,exit");
                LogUtils.file("DoubaoAsrAsyncClient", "===>read len <= 0,exit");
            } else {
                i++;
                m169300j(hsp0Var, bArr2, false, i);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m169300j(hsp0 hsp0Var, byte[] bArr, boolean z, int i) {
        byte[] bArr2 = {17, (byte) ((z ? 3 : 1) | 32), 17, 0};
        byte[] bArrM198350h = uwg0.m198350h(i);
        byte[] bArrM198351i = uwg0.m198351i(bArr, bArr.length);
        byte[] bArrM198350h2 = uwg0.m198350h(bArrM198351i.length);
        byte[] bArr3 = new byte[bArrM198351i.length + 12];
        System.arraycopy(bArr2, 0, bArr3, 0, 4);
        System.arraycopy(bArrM198350h, 0, bArr3, 4, 4);
        System.arraycopy(bArrM198350h2, 0, bArr3, 8, 4);
        System.arraycopy(bArrM198351i, 0, bArr3, 12, bArrM198351i.length);
        hsp0Var.mo137027c(ByteString.m222317of(bArr3));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m169301k() {
        this.f149160k.m198352b();
    }

    /* JADX INFO: renamed from: l */
    public final void m169302l() {
        uwg0 uwg0Var = this.f149160k;
        uwg0Var.m198359k();
        Sudint sudint = new Sudint(uwg0Var.f181273i, uwg0Var.f181275k, uwg0Var.f181274j, uwg0Var.f181271g);
        uwg0Var.f181272h = sudint;
        synchronized (sudint) {
            if (!sudint.Sudcase) {
                sudint.Sudcase = true;
                sudint.f211045Suddo = 0;
                sudint.f211046Sudif = gxg0.m132863b(UUID.randomUUID().toString());
                sudint.f211044Sudchar = SystemClock.elapsedRealtime();
                sudint.Sudgoto.removeCallbacks(sudint.Sudelse);
                sudint.Sudgoto.postDelayed(sudint.Sudelse, 10000L);
            }
        }
        this.f149151b.mo122353a();
    }
}
