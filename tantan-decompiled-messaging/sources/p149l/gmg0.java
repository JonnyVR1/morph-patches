package p149l;

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
public final class gmg0 extends gjp0 {

    /* JADX INFO: renamed from: a */
    public final u7g0 f103465a;

    /* JADX INFO: renamed from: b */
    public final frg0 f103466b;

    /* JADX INFO: renamed from: c */
    public final int f103467c = 16000;

    /* JADX INFO: renamed from: d */
    public final int f103468d = 16;

    /* JADX INFO: renamed from: e */
    public final int f103469e = 1;

    /* JADX INFO: renamed from: f */
    public final int f103470f = 6400;

    /* JADX INFO: renamed from: g */
    public boolean f103471g;

    /* JADX INFO: renamed from: h */
    public boolean f103472h;

    /* JADX INFO: renamed from: i */
    public sjg0 f103473i;

    /* JADX INFO: renamed from: j */
    public egg0 f103474j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ mog0 f103475k;

    public gmg0(mog0 mog0Var, u7g0 u7g0Var, frg0 frg0Var) {
        this.f103475k = mog0Var;
        this.f103465a = u7g0Var;
        this.f103466b = frg0Var;
    }

    @Override // p149l.gjp0
    /* JADX INFO: renamed from: a */
    public final void mo126548a(cjp0 cjp0Var, int i, String str) {
        super.mo126548a(cjp0Var, i, str);
        LogUtils.file("DoubaoAsrAsyncClient", "===> onClosed： code:" + i + " reason:" + str);
        SudLogger.m221565d(this.f103475k.f134892a, "===> onClosed： code:" + i + " reason:" + str);
        ThreadUtils.postUITask(new Runnable() { // from class: l.ykg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f198750a.m126973g();
            }
        });
    }

    @Override // p149l.gjp0
    /* JADX INFO: renamed from: b */
    public final void mo126549b(cjp0 cjp0Var, int i, String str) {
        super.mo126549b(cjp0Var, i, str);
        cjp0Var.close(i, str);
        LogUtils.file("DoubaoAsrAsyncClient", "===> onClosing： code:" + i + " reason:" + str);
        SudLogger.m221565d(this.f103475k.f134892a, "===> onClosing： code:" + i + " reason:" + str);
    }

    @Override // p149l.gjp0
    /* JADX INFO: renamed from: c */
    public final void mo126550c(cjp0 cjp0Var, final Throwable th, exc0 exc0Var) {
        super.mo126550c(cjp0Var, th, exc0Var);
        StringBuilder sb = new StringBuilder("===> onFailure： Throwable:");
        sb.append(th.getMessage());
        sb.append(" Response:");
        sb.append(exc0Var == null ? "null" : exc0Var.toString());
        LogUtils.file("DoubaoAsrAsyncClient", sb.toString());
        String str = this.f103475k.f134892a;
        StringBuilder sb2 = new StringBuilder("===> onFailure： Throwable:");
        sb2.append(th.getMessage());
        sb2.append(" Response:");
        sb2.append(exc0Var != null ? exc0Var.toString() : "null");
        SudLogger.m221565d(str, sb2.toString());
        ThreadUtils.postUITask(new Runnable() { // from class: l.alg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f70432a.m126974h(th);
            }
        });
    }

    @Override // p149l.gjp0
    /* JADX INFO: renamed from: e */
    public final void mo126552e(cjp0 cjp0Var, ByteString byteString) {
        this.f103475k.f134904m.offer(byteString.toByteArray());
    }

    @Override // p149l.gjp0
    /* JADX INFO: renamed from: f */
    public final void mo126553f(cjp0 cjp0Var, exc0 exc0Var) {
        String strM118611u = exc0Var.m118611u("X-Tt-Logid");
        LogUtils.file("DoubaoAsrAsyncClient", "===> onOpen,X-Tt-Logid:" + strM118611u);
        SudLogger.m221565d(this.f103475k.f134892a, "===> onOpen,X-Tt-Logid:" + strM118611u);
        ThreadUtils.postUITask(new Runnable() { // from class: l.zkg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f203539a.m126978l();
            }
        });
        if (this.f103473i == null) {
            sjg0 sjg0Var = new sjg0(this, cjp0Var);
            this.f103473i = sjg0Var;
            sjg0Var.start();
        }
        if (this.f103474j == null) {
            egg0 egg0Var = new egg0(this);
            this.f103474j = egg0Var;
            egg0Var.start();
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m126973g() {
        this.f103475k.m155688k();
        this.f103466b.mo101633b();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m126974h(Throwable th) {
        this.f103466b.mo101634c(th);
        this.f103475k.m155681b();
    }

    /* JADX INFO: renamed from: i */
    public final void m126975i(cjp0 cjp0Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Oauth2AccessToken.KEY_UID, this.f103465a.f175000e);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("format", "pcm");
        jSONObject2.put("codec", "raw");
        jSONObject2.put("rate", this.f103467c);
        jSONObject2.put("bits", this.f103468d);
        jSONObject2.put("channel", this.f103469e);
        jSONObject2.put(IjkMediaMeta.IJKM_KEY_LANGUAGE, this.f103465a.f175002g);
        JSONObject jSONObject3 = this.f103465a.f175006k;
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
            jSONObject3.put("model_name", this.f103465a.f175003h);
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
        SudLogger.m221565d(this.f103475k.f134892a, "发送完整客户端请求: " + string);
        LogUtils.file("DoubaoAsrAsyncClient", "发送完整客户端请求: " + string);
        byte[] bytes = string.getBytes();
        byte[] bArrM155680i = mog0.m155680i(bytes, bytes.length);
        byte[] bArrM155679h = mog0.m155679h(bArrM155680i.length);
        byte[] bArrM155679h2 = mog0.m155679h(1);
        byte[] bArr = new byte[bArrM155680i.length + 12];
        System.arraycopy(new byte[]{17, 17, 17, 0}, 0, bArr, 0, 4);
        System.arraycopy(bArrM155679h2, 0, bArr, 4, 4);
        System.arraycopy(bArrM155679h, 0, bArr, 8, 4);
        System.arraycopy(bArrM155680i, 0, bArr, 12, bArrM155680i.length);
        cjp0Var.mo106492c(ByteString.m221050of(bArr));
        int i = 1;
        while (true) {
            mog0 mog0Var = this.f103475k;
            if (!mog0Var.f134893b) {
                return;
            }
            if (this.f103472h) {
                SudLogger.m221565d(mog0Var.f134892a, "已经发了最后一个包，不再发送数据包");
                LogUtils.file("DoubaoAsrAsyncClient", "已经发了最后一个包，不再发送数据包");
                ThreadUtils.postUITask(new Runnable() { // from class: l.blg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f76185a.m126977k();
                    }
                });
                return;
            }
            if (this.f103471g) {
                SudLogger.m221565d(mog0Var.f134892a, "给后端发送最后一个数据包");
                LogUtils.file("DoubaoAsrAsyncClient", "给后端发送最后一个数据包");
                m126976j(cjp0Var, new byte[this.f103470f], true, -(i + 1));
                this.f103472h = true;
                return;
            }
            hcg0 hcg0Var = this.f103465a.f175001f;
            int i2 = this.f103470f;
            byte[] bArr2 = new byte[i2];
            hcg0Var.getClass();
            int iTakeBuffer = 0;
            while (iTakeBuffer < i2) {
                try {
                    iTakeBuffer += hcg0Var.f107048a.takeBuffer(bArr2, iTakeBuffer);
                } catch (Exception unused) {
                }
            }
            if (iTakeBuffer <= 0) {
                SudLogger.m221565d(this.f103475k.f134892a, "===>read len <= 0,exit");
                LogUtils.file("DoubaoAsrAsyncClient", "===>read len <= 0,exit");
            } else {
                i++;
                m126976j(cjp0Var, bArr2, false, i);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m126976j(cjp0 cjp0Var, byte[] bArr, boolean z, int i) {
        byte[] bArr2 = {17, (byte) ((z ? 3 : 1) | 32), 17, 0};
        byte[] bArrM155679h = mog0.m155679h(i);
        byte[] bArrM155680i = mog0.m155680i(bArr, bArr.length);
        byte[] bArrM155679h2 = mog0.m155679h(bArrM155680i.length);
        byte[] bArr3 = new byte[bArrM155680i.length + 12];
        System.arraycopy(bArr2, 0, bArr3, 0, 4);
        System.arraycopy(bArrM155679h, 0, bArr3, 4, 4);
        System.arraycopy(bArrM155679h2, 0, bArr3, 8, 4);
        System.arraycopy(bArrM155680i, 0, bArr3, 12, bArrM155680i.length);
        cjp0Var.mo106492c(ByteString.m221050of(bArr3));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m126977k() {
        this.f103475k.m155681b();
    }

    /* JADX INFO: renamed from: l */
    public final void m126978l() {
        mog0 mog0Var = this.f103475k;
        mog0Var.m155688k();
        Sudint sudint = new Sudint(mog0Var.f134900i, mog0Var.f134902k, mog0Var.f134901j, mog0Var.f134898g);
        mog0Var.f134899h = sudint;
        synchronized (sudint) {
            if (!sudint.Sudcase) {
                sudint.Sudcase = true;
                sudint.f210124Suddo = 0;
                sudint.f210125Sudif = yog0.m215499b(UUID.randomUUID().toString());
                sudint.f210123Sudchar = SystemClock.elapsedRealtime();
                sudint.Sudgoto.removeCallbacks(sudint.Sudelse);
                sudint.Sudgoto.postDelayed(sudint.Sudelse, 10000L);
            }
        }
        this.f103466b.mo101632a();
    }
}
