package p149l;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import androidx.annotation.NonNull;
import com.p046p1.mobile.share_sdk.ShareEventActivity;
import com.p046p1.mobile.share_sdk.content.Content;
import com.sina.weibo.sdk.WbSdk;
import com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.WebpageObject;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.share.WbShareHandler;
import com.sina.weibo.sdk.utils.Utility;

/* JADX INFO: loaded from: classes11.dex */
public class knp0 {

    /* JADX INFO: renamed from: a */
    public q480 f123901a;

    /* JADX INFO: renamed from: b */
    public Activity f123902b;

    /* JADX INFO: renamed from: c */
    public zue0 f123903c = null;

    /* JADX INFO: renamed from: l.knp0$a */
    public class C18049a implements e30<f4f.C16752e> {
        public C18049a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(f4f.C16752e c16752e) {
            if (knp0.this.f123903c != null) {
                knp0.this.m146583g(Integer.valueOf(c16752e.f94815a), knp0.this.f123903c);
            }
        }
    }

    public knp0(q480 q480Var, Activity activity) {
        this.f123901a = q480Var;
        this.f123902b = activity;
    }

    /* JADX INFO: renamed from: c */
    public static WeiboMultiMessage m146578c(@NonNull Content content) {
        WeiboMultiMessage weiboMultiMessage = new WeiboMultiMessage();
        int type = content.getType();
        if (type == 1) {
            weiboMultiMessage.textObject = m146580e(content);
            return weiboMultiMessage;
        }
        if (type == 2) {
            weiboMultiMessage.imageObject = m146579d(content);
            return weiboMultiMessage;
        }
        if (type != 3) {
            return weiboMultiMessage;
        }
        if (content.getURL() != null) {
            weiboMultiMessage.mediaObject = m146581f(content);
            return weiboMultiMessage;
        }
        weiboMultiMessage.imageObject = m146579d(content);
        weiboMultiMessage.textObject = m146580e(content);
        return weiboMultiMessage;
    }

    /* JADX INFO: renamed from: d */
    public static ImageObject m146579d(Content content) {
        ImageObject imageObject = new ImageObject();
        if (content.getFile() != null) {
            imageObject.imagePath = content.getFile().getPath();
            return imageObject;
        }
        if (content.getLargeBmpPath() != null) {
            imageObject.imagePath = content.getLargeBmpPath();
        }
        return imageObject;
    }

    /* JADX INFO: renamed from: e */
    public static TextObject m146580e(Content content) {
        TextObject textObject = new TextObject();
        textObject.text = content.getSummary();
        return textObject;
    }

    /* JADX INFO: renamed from: f */
    public static WebpageObject m146581f(Content content) {
        WebpageObject webpageObject = new WebpageObject();
        webpageObject.identify = Utility.generateGUID();
        webpageObject.title = content.getTitle();
        webpageObject.description = content.getSummary();
        webpageObject.thumbData = adk0.m95903a(BitmapFactory.decodeFile(content.getThumbBmpPath()));
        webpageObject.defaultText = content.getSummary();
        webpageObject.actionUrl = content.getURL();
        return webpageObject;
    }

    /* JADX INFO: renamed from: j */
    public static void m146582j(Activity activity, Content content) {
        try {
            WbSdk.checkInit();
        } catch (RuntimeException unused) {
            WbSdk.install(activity.getApplicationContext(), new AuthInfo(activity.getApplicationContext(), xw5.f194698c, xw5.f194699d, "key_scope"));
        }
        WbShareHandler wbShareHandler = new WbShareHandler(activity);
        wbShareHandler.registerApp();
        wbShareHandler.shareMessage(m146578c(content), true);
    }

    /* JADX INFO: renamed from: g */
    public final void m146583g(Integer num, zue0 zue0Var) {
        if (num.intValue() == 0) {
            zue0Var.mo79997b(this.f123901a);
        } else if (num.intValue() == 2) {
            zue0Var.mo79996a(this.f123901a, new Exception("ops, something wrong!!"));
        } else if (num.intValue() == 1) {
            zue0Var.mo79998c(this.f123901a);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m146584h(zue0 zue0Var) {
        this.f123903c = zue0Var;
    }

    /* JADX INFO: renamed from: i */
    public void m146585i(Content content) {
        f4f.m119309b(new C18049a());
        Intent intent = new Intent(this.f123902b, (Class<?>) ShareEventActivity.class);
        intent.putExtra("platform", this.f123901a.getName());
        intent.putExtra(ShareEventActivity.SHARE_DATA, content);
        this.f123902b.startActivity(intent);
    }
}
