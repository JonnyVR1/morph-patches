package p009l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.p000p1.mobile.share_sdk.ShareEventActivity;
import com.p000p1.mobile.share_sdk.content.Content;
import com.tencent.tauth.Tencent;
import java.util.ArrayList;
import java.util.Collections;
import l.e30;
import l.qkq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bnb0 {

    /* JADX INFO: renamed from: a */
    public q480 f10198a;

    /* JADX INFO: renamed from: b */
    public Activity f10199b;

    /* JADX INFO: renamed from: c */
    public zue0 f10200c = null;

    /* JADX INFO: renamed from: l.bnb0$a */
    public class C0789a implements e30<f4f.C0883e> {
        public C0789a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(f4f.C0883e c0883e) {
            if (bnb0.this.f10200c != null) {
                bnb0 bnb0Var = bnb0.this;
                bnb0Var.m12150g(c0883e, bnb0Var.f10200c);
            }
        }
    }

    public bnb0(q480 q480Var, Activity activity) {
        this.f10198a = q480Var;
        this.f10199b = activity;
    }

    /* JADX INFO: renamed from: c */
    public static Intent m12142c(@Nullable Intent intent, Content content) {
        return intent.putExtra("title", content.getTitle()).putExtra("summary", content.getSummary()).putExtra("appName", yue0.f23233a);
    }

    /* JADX INFO: renamed from: d */
    public static Intent m12143d(Content content) {
        Intent intent = new Intent();
        intent.putExtra("req_type", 5);
        if (content.getFile() != null) {
            intent.putExtra("imageLocalUrl", content.getFile().toString());
            return intent;
        }
        String largeBmpPath = content.getLargeBmpPath();
        if (largeBmpPath != null) {
            if (largeBmpPath.startsWith("http")) {
                intent.putExtra("imageUrl", largeBmpPath);
                return intent;
            }
            intent.putExtra("imageLocalUrl", largeBmpPath);
        }
        return intent;
    }

    /* JADX INFO: renamed from: e */
    public static Tencent m12144e(Context context) {
        Tencent.setIsPermissionGranted(true);
        return Tencent.createInstance(xw5.f22742b, context);
    }

    /* JADX INFO: renamed from: f */
    public static Intent m12145f(Content content) {
        return new Intent().putExtra("req_type", 1).putExtra("targetUrl", content.getURL()).putExtra("imageUrl", content.getThumbBmpPath());
    }

    /* JADX INFO: renamed from: h */
    public static Bundle m12146h(Content content) {
        ArrayList arrayList = new ArrayList();
        if (content.getFile() != null) {
            arrayList.add(content.getFile().getPath());
        } else if (content.getLargeBmpPath() != null) {
            arrayList.add(content.getLargeBmpPath());
        }
        return new Intent().putExtra("req_type", 3).putExtra("summary", content.getSummary()).putExtra("imageUrl", arrayList).getExtras();
    }

    /* JADX INFO: renamed from: i */
    public static Bundle m12147i(Content content) {
        Intent intentM12145f;
        if (content.getType() == 2) {
            intentM12145f = m12143d(content);
        } else if (content.getType() == 3) {
            intentM12145f = m12145f(content);
        } else {
            if (content.getType() == 1) {
                qkq0.a("Can not share text to qq friend!");
                return null;
            }
            intentM12145f = null;
        }
        return m12142c(intentM12145f, content).getExtras();
    }

    /* JADX INFO: renamed from: l */
    public static void m12148l(String str, Activity activity, Content content) {
        Tencent tencentM12144e = m12144e(activity);
        if (!cnb0.f10700b.equals(str)) {
            if (dnb0.f11916b.equals(str)) {
                tencentM12144e.shareToQQ(activity, m12147i(content), f4f.f12777e);
            }
        } else if (content.getType() == 1 || content.getType() == 2) {
            tencentM12144e.publishToQzone(activity, m12146h(content), f4f.f12777e);
        } else {
            tencentM12144e.shareToQzone(activity, m12149m(content), f4f.f12777e);
        }
    }

    /* JADX INFO: renamed from: m */
    public static Bundle m12149m(Content content) {
        return new Intent().putExtra("req_type", 1).putExtra("title", content.getTitle()).putExtra("summary", content.getSummary()).putExtra("targetUrl", content.getURL()).putExtra("imageUrl", new ArrayList(Collections.singletonList(content.getThumbBmpPath()))).getExtras();
    }

    /* JADX INFO: renamed from: g */
    public final void m12150g(f4f.C0883e c0883e, zue0 zue0Var) {
        int i = c0883e.f12779a;
        if (i == 0) {
            zue0Var.mo10326b(this.f10198a);
        } else if (i == 2) {
            zue0Var.mo10325a(this.f10198a, new Exception(c0883e.f12780b));
        } else if (i == 1) {
            zue0Var.mo10327c(this.f10198a);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m12151j(zue0 zue0Var) {
        this.f10200c = zue0Var;
    }

    /* JADX INFO: renamed from: k */
    public void m12152k(Content content, q480 q480Var) {
        f4f.m14205b(new C0789a());
        Intent intent = new Intent(this.f10199b, (Class<?>) ShareEventActivity.class);
        intent.putExtra(ShareEventActivity.PLATFORM, q480Var.getName());
        intent.putExtra(ShareEventActivity.SHARE_DATA, content);
        this.f10199b.startActivity(intent);
    }
}
