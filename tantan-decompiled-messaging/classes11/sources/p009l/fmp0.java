package p009l;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;
import com.p000p1.mobile.share_sdk.content.Content;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.io.File;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class fmp0 {

    /* JADX INFO: renamed from: e */
    public static IWXAPI f13095e;

    /* JADX INFO: renamed from: a */
    public q480 f13096a;

    /* JADX INFO: renamed from: b */
    public int f13097b;

    /* JADX INFO: renamed from: c */
    public Activity f13098c;

    /* JADX INFO: renamed from: d */
    public zue0 f13099d = null;

    /* JADX INFO: renamed from: l.fmp0$a */
    public class C0902a implements e30<f4f.C0883e> {
        public C0902a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(f4f.C0883e c0883e) {
            if (fmp0.this.f13099d != null) {
                fmp0 fmp0Var = fmp0.this;
                fmp0Var.m14524m(c0883e.f12781c, fmp0Var.f13099d);
            }
        }
    }

    public fmp0(q480 q480Var, Activity activity) {
        this.f13096a = q480Var;
        this.f13098c = activity;
        if (q480Var instanceof gmp0) {
            this.f13097b = 1;
        } else if (q480Var instanceof rmp0) {
            this.f13097b = 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public static synchronized IWXAPI m14514g(Context context) {
        try {
            if (f13095e == null) {
                f13095e = WXAPIFactory.createWXAPI(context, xw5.f22741a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13095e;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m14515c() {
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m14516d() {
        return m14514g(this.f13098c).getWXAppSupportAPI() >= 654314752;
    }

    /* JADX INFO: renamed from: e */
    public final WXMediaMessage.IMediaObject m14517e(@NonNull Content content) {
        if (content.getType() == 1) {
            return m14521j(content);
        }
        if (content.getType() == 2) {
            return m14520i(content);
        }
        if (content.getType() == 3) {
            return m14522k(content);
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public final SendMessageToWX.Req m14518f(@NonNull Content content) {
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = content.getTitle();
        wXMediaMessage.description = content.getSummary();
        wXMediaMessage.thumbData = adk0.m11342a(BitmapFactory.decodeFile(content.getThumbBmpPath()));
        wXMediaMessage.mediaObject = m14517e(content);
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        ((BaseReq) req).transaction = String.valueOf(System.currentTimeMillis());
        req.message = wXMediaMessage;
        req.scene = this.f13097b;
        return req;
    }

    /* JADX INFO: renamed from: h */
    public String m14519h(Context context, File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        Uri uriForFile = FileProvider.getUriForFile(context, "files." + context.getPackageName(), file);
        context.grantUriPermission("com.tencent.mm", uriForFile, 1);
        return uriForFile.toString();
    }

    /* JADX INFO: renamed from: i */
    public final WXMediaMessage.IMediaObject m14520i(Content content) {
        WXImageObject wXImageObject = new WXImageObject();
        if (content.getFile() == null) {
            if (content.getLargeBmpPath() != null) {
                wXImageObject.imagePath = content.getLargeBmpPath();
            }
            return wXImageObject;
        }
        if (m14523l()) {
            wXImageObject.setImagePath(m14519h(this.f13098c, content.getFile()));
            return wXImageObject;
        }
        wXImageObject.setImagePath(content.getFile().getPath());
        return wXImageObject;
    }

    /* JADX INFO: renamed from: j */
    public final WXMediaMessage.IMediaObject m14521j(Content content) {
        WXTextObject wXTextObject = new WXTextObject();
        wXTextObject.text = content.getSummary();
        return wXTextObject;
    }

    /* JADX INFO: renamed from: k */
    public final WXMediaMessage.IMediaObject m14522k(Content content) {
        WXWebpageObject wXWebpageObject = new WXWebpageObject();
        wXWebpageObject.webpageUrl = content.getURL();
        return wXWebpageObject;
    }

    /* JADX INFO: renamed from: l */
    public boolean m14523l() {
        return m14516d() && m14515c();
    }

    /* JADX INFO: renamed from: m */
    public final void m14524m(BaseResp baseResp, @NonNull zue0 zue0Var) {
        int i = baseResp.errCode;
        if (i == -4) {
            zue0Var.mo10325a(this.f13096a, new Exception("用户拒绝授权"));
            return;
        }
        if (i == -3) {
            zue0Var.mo10325a(this.f13096a, new Exception("发送失败"));
            return;
        }
        if (i == -2) {
            zue0Var.mo10327c(this.f13096a);
            return;
        }
        q480 q480Var = this.f13096a;
        if (i == 0) {
            zue0Var.mo10326b(q480Var);
            return;
        }
        zue0Var.mo10325a(q480Var, new Exception("未知错误，code：" + baseResp.errCode + ", message：" + baseResp.errStr));
    }

    /* JADX INFO: renamed from: n */
    public final void m14525n(BaseReq baseReq, Context context) {
        m14514g(context).sendReq(baseReq);
    }

    /* JADX INFO: renamed from: o */
    public void m14526o(zue0 zue0Var) {
        this.f13099d = zue0Var;
    }

    /* JADX INFO: renamed from: p */
    public void m14527p(Content content) {
        f4f.m14205b(new C0902a());
        m14525n(m14518f(content), this.f13098c);
    }
}
