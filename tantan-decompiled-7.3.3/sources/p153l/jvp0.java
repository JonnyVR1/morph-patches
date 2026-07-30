package p153l;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;
import com.p051p1.mobile.share_sdk.content.Content;
import com.tencent.p106mm.opensdk.modelbase.BaseReq;
import com.tencent.p106mm.opensdk.modelbase.BaseResp;
import com.tencent.p106mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p106mm.opensdk.modelmsg.WXImageObject;
import com.tencent.p106mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p106mm.opensdk.modelmsg.WXTextObject;
import com.tencent.p106mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.p106mm.opensdk.openapi.IWXAPI;
import com.tencent.p106mm.opensdk.openapi.WXAPIFactory;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public class jvp0 {

    /* JADX INFO: renamed from: e */
    public static IWXAPI f122827e;

    /* JADX INFO: renamed from: a */
    public wc80 f122828a;

    /* JADX INFO: renamed from: b */
    public int f122829b;

    /* JADX INFO: renamed from: c */
    public Activity f122830c;

    /* JADX INFO: renamed from: d */
    public g3f0 f122831d = null;

    /* JADX INFO: renamed from: l.jvp0$a */
    public class C18043a implements y20<j5f.C17884e> {
        public C18043a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(j5f.C17884e c17884e) {
            if (jvp0.this.f122831d != null) {
                jvp0 jvp0Var = jvp0.this;
                jvp0Var.m147091m(c17884e.f118433c, jvp0Var.f122831d);
            }
        }
    }

    public jvp0(wc80 wc80Var, Activity activity) {
        this.f122828a = wc80Var;
        this.f122830c = activity;
        if (wc80Var instanceof kvp0) {
            this.f122829b = 1;
        } else if (wc80Var instanceof vvp0) {
            this.f122829b = 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public static synchronized IWXAPI m147081g(Context context) {
        try {
            if (f122827e == null) {
                f122827e = WXAPIFactory.createWXAPI(context, cy5.f84297a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f122827e;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m147082c() {
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m147083d() {
        return m147081g(this.f122830c).getWXAppSupportAPI() >= 654314752;
    }

    /* JADX INFO: renamed from: e */
    public final WXMediaMessage.IMediaObject m147084e(@NonNull Content content) {
        if (content.getType() == 1) {
            return m147088j(content);
        }
        if (content.getType() == 2) {
            return m147087i(content);
        }
        if (content.getType() == 3) {
            return m147089k(content);
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public final SendMessageToWX.Req m147085f(@NonNull Content content) {
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = content.getTitle();
        wXMediaMessage.description = content.getSummary();
        wXMediaMessage.thumbData = gmk0.m130799a(BitmapFactory.decodeFile(content.getThumbBmpPath()));
        wXMediaMessage.mediaObject = m147084e(content);
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = String.valueOf(System.currentTimeMillis());
        req.message = wXMediaMessage;
        req.scene = this.f122829b;
        return req;
    }

    /* JADX INFO: renamed from: h */
    public String m147086h(Context context, File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        Uri uriForFile = FileProvider.getUriForFile(context, "files." + context.getPackageName(), file);
        context.grantUriPermission("com.tencent.mm", uriForFile, 1);
        return uriForFile.toString();
    }

    /* JADX INFO: renamed from: i */
    public final WXMediaMessage.IMediaObject m147087i(Content content) {
        WXImageObject wXImageObject = new WXImageObject();
        if (content.getFile() == null) {
            if (content.getLargeBmpPath() != null) {
                wXImageObject.imagePath = content.getLargeBmpPath();
            }
            return wXImageObject;
        }
        if (m147090l()) {
            wXImageObject.setImagePath(m147086h(this.f122830c, content.getFile()));
            return wXImageObject;
        }
        wXImageObject.setImagePath(content.getFile().getPath());
        return wXImageObject;
    }

    /* JADX INFO: renamed from: j */
    public final WXMediaMessage.IMediaObject m147088j(Content content) {
        WXTextObject wXTextObject = new WXTextObject();
        wXTextObject.text = content.getSummary();
        return wXTextObject;
    }

    /* JADX INFO: renamed from: k */
    public final WXMediaMessage.IMediaObject m147089k(Content content) {
        WXWebpageObject wXWebpageObject = new WXWebpageObject();
        wXWebpageObject.webpageUrl = content.getURL();
        return wXWebpageObject;
    }

    /* JADX INFO: renamed from: l */
    public boolean m147090l() {
        return m147083d() && m147082c();
    }

    /* JADX INFO: renamed from: m */
    public final void m147091m(BaseResp baseResp, @NonNull g3f0 g3f0Var) {
        int i = baseResp.errCode;
        if (i == -4) {
            g3f0Var.mo81179a(this.f122828a, new Exception("用户拒绝授权"));
            return;
        }
        if (i == -3) {
            g3f0Var.mo81179a(this.f122828a, new Exception("发送失败"));
            return;
        }
        if (i == -2) {
            g3f0Var.mo81181c(this.f122828a);
            return;
        }
        wc80 wc80Var = this.f122828a;
        if (i == 0) {
            g3f0Var.mo81180b(wc80Var);
            return;
        }
        g3f0Var.mo81179a(wc80Var, new Exception("未知错误，code：" + baseResp.errCode + ", message：" + baseResp.errStr));
    }

    /* JADX INFO: renamed from: n */
    public final void m147092n(BaseReq baseReq, Context context) {
        m147081g(context).sendReq(baseReq);
    }

    /* JADX INFO: renamed from: o */
    public void m147093o(g3f0 g3f0Var) {
        this.f122831d = g3f0Var;
    }

    /* JADX INFO: renamed from: p */
    public void m147094p(Content content) {
        j5f.m143522b(new C18043a());
        m147092n(m147085f(content), this.f122830c);
    }
}
