package p153l;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import androidx.annotation.NonNull;
import com.p051p1.mobile.share_sdk.ShareEventActivity;
import com.p051p1.mobile.share_sdk.content.Content;
import com.sina.weibo.sdk.WbSdk;
import com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.WebpageObject;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.share.WbShareHandler;
import com.sina.weibo.sdk.utils.Utility;

/* JADX INFO: loaded from: classes10.dex */
public class owp0 {

    /* JADX INFO: renamed from: a */
    public wc80 f149549a;

    /* JADX INFO: renamed from: b */
    public Activity f149550b;

    /* JADX INFO: renamed from: c */
    public g3f0 f149551c = null;

    /* JADX INFO: renamed from: l.owp0$a */
    public class C19238a implements y20<j5f.C17884e> {
        public C19238a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(j5f.C17884e c17884e) {
            if (owp0.this.f149551c != null) {
                owp0.this.m169608g(Integer.valueOf(c17884e.f118431a), owp0.this.f149551c);
            }
        }
    }

    public owp0(wc80 wc80Var, Activity activity) {
        this.f149549a = wc80Var;
        this.f149550b = activity;
    }

    /* JADX INFO: renamed from: c */
    public static WeiboMultiMessage m169603c(@NonNull Content content) {
        WeiboMultiMessage weiboMultiMessage = new WeiboMultiMessage();
        int type = content.getType();
        if (type == 1) {
            weiboMultiMessage.textObject = m169605e(content);
            return weiboMultiMessage;
        }
        if (type == 2) {
            weiboMultiMessage.imageObject = m169604d(content);
            return weiboMultiMessage;
        }
        if (type != 3) {
            return weiboMultiMessage;
        }
        if (content.getURL() != null) {
            weiboMultiMessage.mediaObject = m169606f(content);
            return weiboMultiMessage;
        }
        weiboMultiMessage.imageObject = m169604d(content);
        weiboMultiMessage.textObject = m169605e(content);
        return weiboMultiMessage;
    }

    /* JADX INFO: renamed from: d */
    public static ImageObject m169604d(Content content) {
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
    public static TextObject m169605e(Content content) {
        TextObject textObject = new TextObject();
        textObject.text = content.getSummary();
        return textObject;
    }

    /* JADX INFO: renamed from: f */
    public static WebpageObject m169606f(Content content) {
        WebpageObject webpageObject = new WebpageObject();
        webpageObject.identify = Utility.generateGUID();
        webpageObject.title = content.getTitle();
        webpageObject.description = content.getSummary();
        webpageObject.thumbData = gmk0.m130799a(BitmapFactory.decodeFile(content.getThumbBmpPath()));
        webpageObject.defaultText = content.getSummary();
        webpageObject.actionUrl = content.getURL();
        return webpageObject;
    }

    /* JADX INFO: renamed from: j */
    public static void m169607j(Activity activity, Content content) {
        try {
            WbSdk.checkInit();
        } catch (RuntimeException unused) {
            WbSdk.install(activity.getApplicationContext(), new AuthInfo(activity.getApplicationContext(), cy5.f84299c, cy5.f84300d, "key_scope"));
        }
        WbShareHandler wbShareHandler = new WbShareHandler(activity);
        wbShareHandler.registerApp();
        wbShareHandler.shareMessage(m169603c(content), true);
    }

    /* JADX INFO: renamed from: g */
    public final void m169608g(Integer num, g3f0 g3f0Var) {
        if (num.intValue() == 0) {
            g3f0Var.mo81180b(this.f149549a);
        } else if (num.intValue() == 2) {
            g3f0Var.mo81179a(this.f149549a, new Exception("ops, something wrong!!"));
        } else if (num.intValue() == 1) {
            g3f0Var.mo81181c(this.f149549a);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m169609h(g3f0 g3f0Var) {
        this.f149551c = g3f0Var;
    }

    /* JADX INFO: renamed from: i */
    public void m169610i(Content content) {
        j5f.m143522b(new C19238a());
        Intent intent = new Intent(this.f149550b, (Class<?>) ShareEventActivity.class);
        intent.putExtra("platform", this.f149549a.getName());
        intent.putExtra(ShareEventActivity.SHARE_DATA, content);
        this.f149550b.startActivity(intent);
    }
}
