package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.p046p1.mobile.share_sdk.ShareEventActivity;
import com.p046p1.mobile.share_sdk.content.Content;
import com.tencent.tauth.Tencent;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes11.dex */
public class bnb0 {

    /* JADX INFO: renamed from: a */
    public q480 f76385a;

    /* JADX INFO: renamed from: b */
    public Activity f76386b;

    /* JADX INFO: renamed from: c */
    public zue0 f76387c = null;

    /* JADX INFO: renamed from: l.bnb0$a */
    public class C15913a implements e30<f4f.C16752e> {
        public C15913a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(f4f.C16752e c16752e) {
            if (bnb0.this.f76387c != null) {
                bnb0 bnb0Var = bnb0.this;
                bnb0Var.m102761g(c16752e, bnb0Var.f76387c);
            }
        }
    }

    public bnb0(q480 q480Var, Activity activity) {
        this.f76385a = q480Var;
        this.f76386b = activity;
    }

    /* JADX INFO: renamed from: c */
    public static Intent m102753c(@Nullable Intent intent, Content content) {
        return intent.putExtra("title", content.getTitle()).putExtra("summary", content.getSummary()).putExtra("appName", yue0.f200074a);
    }

    /* JADX INFO: renamed from: d */
    public static Intent m102754d(Content content) {
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
    public static Tencent m102755e(Context context) {
        Tencent.setIsPermissionGranted(true);
        return Tencent.createInstance(xw5.f194697b, context);
    }

    /* JADX INFO: renamed from: f */
    public static Intent m102756f(Content content) {
        return new Intent().putExtra("req_type", 1).putExtra("targetUrl", content.getURL()).putExtra("imageUrl", content.getThumbBmpPath());
    }

    /* JADX INFO: renamed from: h */
    public static Bundle m102757h(Content content) {
        ArrayList arrayList = new ArrayList();
        if (content.getFile() != null) {
            arrayList.add(content.getFile().getPath());
        } else if (content.getLargeBmpPath() != null) {
            arrayList.add(content.getLargeBmpPath());
        }
        return new Intent().putExtra("req_type", 3).putExtra("summary", content.getSummary()).putExtra("imageUrl", arrayList).getExtras();
    }

    /* JADX INFO: renamed from: i */
    public static Bundle m102758i(Content content) {
        Intent intentM102756f;
        if (content.getType() == 2) {
            intentM102756f = m102754d(content);
        } else if (content.getType() == 3) {
            intentM102756f = m102756f(content);
        } else {
            if (content.getType() == 1) {
                qkq0.m175383a("Can not share text to qq friend!");
                return null;
            }
            intentM102756f = null;
        }
        return m102753c(intentM102756f, content).getExtras();
    }

    /* JADX INFO: renamed from: l */
    public static void m102759l(String str, Activity activity, Content content) {
        Tencent tencentM102755e = m102755e(activity);
        if (!cnb0.f81658b.equals(str)) {
            if (dnb0.f87044b.equals(str)) {
                tencentM102755e.shareToQQ(activity, m102758i(content), f4f.f94813e);
            }
        } else if (content.getType() == 1 || content.getType() == 2) {
            tencentM102755e.publishToQzone(activity, m102757h(content), f4f.f94813e);
        } else {
            tencentM102755e.shareToQzone(activity, m102760m(content), f4f.f94813e);
        }
    }

    /* JADX INFO: renamed from: m */
    public static Bundle m102760m(Content content) {
        return new Intent().putExtra("req_type", 1).putExtra("title", content.getTitle()).putExtra("summary", content.getSummary()).putExtra("targetUrl", content.getURL()).putExtra("imageUrl", new ArrayList(Collections.singletonList(content.getThumbBmpPath()))).getExtras();
    }

    /* JADX INFO: renamed from: g */
    public final void m102761g(f4f.C16752e c16752e, zue0 zue0Var) {
        int i = c16752e.f94815a;
        if (i == 0) {
            zue0Var.mo79997b(this.f76385a);
        } else if (i == 2) {
            zue0Var.mo79996a(this.f76385a, new Exception(c16752e.f94816b));
        } else if (i == 1) {
            zue0Var.mo79998c(this.f76385a);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m102762j(zue0 zue0Var) {
        this.f76387c = zue0Var;
    }

    /* JADX INFO: renamed from: k */
    public void m102763k(Content content, q480 q480Var) {
        f4f.m119309b(new C15913a());
        Intent intent = new Intent(this.f76386b, (Class<?>) ShareEventActivity.class);
        intent.putExtra("platform", q480Var.getName());
        intent.putExtra(ShareEventActivity.SHARE_DATA, content);
        this.f76386b.startActivity(intent);
    }
}
