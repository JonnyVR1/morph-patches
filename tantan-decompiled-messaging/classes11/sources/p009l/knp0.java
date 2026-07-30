package p009l;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import androidx.annotation.NonNull;
import com.p000p1.mobile.share_sdk.ShareEventActivity;
import com.p000p1.mobile.share_sdk.content.Content;
import com.sina.weibo.sdk.WbSdk;
import com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.WebpageObject;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.share.WbShareHandler;
import com.sina.weibo.sdk.utils.Utility;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class knp0 {

    /* JADX INFO: renamed from: a */
    public q480 f15778a;

    /* JADX INFO: renamed from: b */
    public Activity f15779b;

    /* JADX INFO: renamed from: c */
    public zue0 f15780c = null;

    /* JADX INFO: renamed from: l.knp0$a */
    public class C1001a implements e30<f4f.C0883e> {
        public C1001a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(f4f.C0883e c0883e) {
            if (knp0.this.f15780c != null) {
                knp0.this.m17561g(Integer.valueOf(c0883e.f12779a), knp0.this.f15780c);
            }
        }
    }

    public knp0(q480 q480Var, Activity activity) {
        this.f15778a = q480Var;
        this.f15779b = activity;
    }

    /* JADX INFO: renamed from: c */
    public static WeiboMultiMessage m17556c(@NonNull Content content) {
        WeiboMultiMessage weiboMultiMessage = new WeiboMultiMessage();
        int type = content.getType();
        if (type == 1) {
            weiboMultiMessage.textObject = m17558e(content);
            return weiboMultiMessage;
        }
        if (type == 2) {
            weiboMultiMessage.imageObject = m17557d(content);
            return weiboMultiMessage;
        }
        if (type != 3) {
            return weiboMultiMessage;
        }
        if (content.getURL() != null) {
            weiboMultiMessage.mediaObject = m17559f(content);
            return weiboMultiMessage;
        }
        weiboMultiMessage.imageObject = m17557d(content);
        weiboMultiMessage.textObject = m17558e(content);
        return weiboMultiMessage;
    }

    /* JADX INFO: renamed from: d */
    public static ImageObject m17557d(Content content) {
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
    public static TextObject m17558e(Content content) {
        TextObject textObject = new TextObject();
        textObject.text = content.getSummary();
        return textObject;
    }

    /* JADX INFO: renamed from: f */
    public static WebpageObject m17559f(Content content) {
        WebpageObject webpageObject = new WebpageObject();
        webpageObject.identify = Utility.generateGUID();
        webpageObject.title = content.getTitle();
        webpageObject.description = content.getSummary();
        webpageObject.thumbData = adk0.m11342a(BitmapFactory.decodeFile(content.getThumbBmpPath()));
        webpageObject.defaultText = content.getSummary();
        webpageObject.actionUrl = content.getURL();
        return webpageObject;
    }

    /* JADX INFO: renamed from: j */
    public static void m17560j(Activity activity, Content content) {
        try {
            WbSdk.checkInit();
        } catch (RuntimeException unused) {
            WbSdk.install(activity.getApplicationContext(), new AuthInfo(activity.getApplicationContext(), xw5.f22743c, xw5.f22744d, "key_scope"));
        }
        WbShareHandler wbShareHandler = new WbShareHandler(activity);
        wbShareHandler.registerApp();
        wbShareHandler.shareMessage(m17556c(content), true);
    }

    /* JADX INFO: renamed from: g */
    public final void m17561g(Integer num, zue0 zue0Var) {
        if (num.intValue() == 0) {
            zue0Var.mo10326b(this.f15778a);
        } else if (num.intValue() == 2) {
            zue0Var.mo10325a(this.f15778a, new Exception("ops, something wrong!!"));
        } else if (num.intValue() == 1) {
            zue0Var.mo10327c(this.f15778a);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m17562h(zue0 zue0Var) {
        this.f15780c = zue0Var;
    }

    /* JADX INFO: renamed from: i */
    public void m17563i(Content content) {
        f4f.m14205b(new C1001a());
        Intent intent = new Intent(this.f15779b, (Class<?>) ShareEventActivity.class);
        intent.putExtra(ShareEventActivity.PLATFORM, this.f15778a.getName());
        intent.putExtra(ShareEventActivity.SHARE_DATA, content);
        this.f15779b.startActivity(intent);
    }
}
