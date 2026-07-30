package p149l;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;
import com.p046p1.mobile.share_sdk.content.Content;
import com.tencent.p101mm.opensdk.modelbase.BaseReq;
import com.tencent.p101mm.opensdk.modelbase.BaseResp;
import com.tencent.p101mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p101mm.opensdk.modelmsg.WXImageObject;
import com.tencent.p101mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p101mm.opensdk.modelmsg.WXTextObject;
import com.tencent.p101mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.p101mm.opensdk.openapi.IWXAPI;
import com.tencent.p101mm.opensdk.openapi.WXAPIFactory;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public class fmp0 {

    /* JADX INFO: renamed from: e */
    public static IWXAPI f98320e;

    /* JADX INFO: renamed from: a */
    public q480 f98321a;

    /* JADX INFO: renamed from: b */
    public int f98322b;

    /* JADX INFO: renamed from: c */
    public Activity f98323c;

    /* JADX INFO: renamed from: d */
    public zue0 f98324d = null;

    /* JADX INFO: renamed from: l.fmp0$a */
    public class C16882a implements e30<f4f.C16752e> {
        public C16882a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(f4f.C16752e c16752e) {
            if (fmp0.this.f98324d != null) {
                fmp0 fmp0Var = fmp0.this;
                fmp0Var.m122185m(c16752e.f94817c, fmp0Var.f98324d);
            }
        }
    }

    public fmp0(q480 q480Var, Activity activity) {
        this.f98321a = q480Var;
        this.f98323c = activity;
        if (q480Var instanceof gmp0) {
            this.f98322b = 1;
        } else if (q480Var instanceof rmp0) {
            this.f98322b = 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public static synchronized IWXAPI m122175g(Context context) {
        try {
            if (f98320e == null) {
                f98320e = WXAPIFactory.createWXAPI(context, xw5.f194696a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f98320e;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m122176c() {
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m122177d() {
        return m122175g(this.f98323c).getWXAppSupportAPI() >= 654314752;
    }

    /* JADX INFO: renamed from: e */
    public final WXMediaMessage.IMediaObject m122178e(@NonNull Content content) {
        if (content.getType() == 1) {
            return m122182j(content);
        }
        if (content.getType() == 2) {
            return m122181i(content);
        }
        if (content.getType() == 3) {
            return m122183k(content);
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public final SendMessageToWX.Req m122179f(@NonNull Content content) {
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = content.getTitle();
        wXMediaMessage.description = content.getSummary();
        wXMediaMessage.thumbData = adk0.m95903a(BitmapFactory.decodeFile(content.getThumbBmpPath()));
        wXMediaMessage.mediaObject = m122178e(content);
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = String.valueOf(System.currentTimeMillis());
        req.message = wXMediaMessage;
        req.scene = this.f98322b;
        return req;
    }

    /* JADX INFO: renamed from: h */
    public String m122180h(Context context, File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        Uri uriForFile = FileProvider.getUriForFile(context, "files." + context.getPackageName(), file);
        context.grantUriPermission("com.tencent.mm", uriForFile, 1);
        return uriForFile.toString();
    }

    /* JADX INFO: renamed from: i */
    public final WXMediaMessage.IMediaObject m122181i(Content content) {
        WXImageObject wXImageObject = new WXImageObject();
        if (content.getFile() == null) {
            if (content.getLargeBmpPath() != null) {
                wXImageObject.imagePath = content.getLargeBmpPath();
            }
            return wXImageObject;
        }
        if (m122184l()) {
            wXImageObject.setImagePath(m122180h(this.f98323c, content.getFile()));
            return wXImageObject;
        }
        wXImageObject.setImagePath(content.getFile().getPath());
        return wXImageObject;
    }

    /* JADX INFO: renamed from: j */
    public final WXMediaMessage.IMediaObject m122182j(Content content) {
        WXTextObject wXTextObject = new WXTextObject();
        wXTextObject.text = content.getSummary();
        return wXTextObject;
    }

    /* JADX INFO: renamed from: k */
    public final WXMediaMessage.IMediaObject m122183k(Content content) {
        WXWebpageObject wXWebpageObject = new WXWebpageObject();
        wXWebpageObject.webpageUrl = content.getURL();
        return wXWebpageObject;
    }

    /* JADX INFO: renamed from: l */
    public boolean m122184l() {
        return m122177d() && m122176c();
    }

    /* JADX INFO: renamed from: m */
    public final void m122185m(BaseResp baseResp, @NonNull zue0 zue0Var) {
        int i = baseResp.errCode;
        if (i == -4) {
            zue0Var.mo79996a(this.f98321a, new Exception("用户拒绝授权"));
            return;
        }
        if (i == -3) {
            zue0Var.mo79996a(this.f98321a, new Exception("发送失败"));
            return;
        }
        if (i == -2) {
            zue0Var.mo79998c(this.f98321a);
            return;
        }
        q480 q480Var = this.f98321a;
        if (i == 0) {
            zue0Var.mo79997b(q480Var);
            return;
        }
        zue0Var.mo79996a(q480Var, new Exception("未知错误，code：" + baseResp.errCode + ", message：" + baseResp.errStr));
    }

    /* JADX INFO: renamed from: n */
    public final void m122186n(BaseReq baseReq, Context context) {
        m122175g(context).sendReq(baseReq);
    }

    /* JADX INFO: renamed from: o */
    public void m122187o(zue0 zue0Var) {
        this.f98324d = zue0Var;
    }

    /* JADX INFO: renamed from: p */
    public void m122188p(Content content) {
        f4f.m119309b(new C16882a());
        m122186n(m122179f(content), this.f98323c);
    }
}
