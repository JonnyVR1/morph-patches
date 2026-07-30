package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.p051p1.mobile.share_sdk.ShareEventActivity;
import com.p051p1.mobile.share_sdk.content.Content;
import com.tencent.tauth.Tencent;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public class fvb0 {

    /* JADX INFO: renamed from: a */
    public wc80 f100998a;

    /* JADX INFO: renamed from: b */
    public Activity f100999b;

    /* JADX INFO: renamed from: c */
    public g3f0 f101000c = null;

    /* JADX INFO: renamed from: l.fvb0$a */
    public class C17083a implements y20<j5f.C17884e> {
        public C17083a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(j5f.C17884e c17884e) {
            if (fvb0.this.f101000c != null) {
                fvb0 fvb0Var = fvb0.this;
                fvb0Var.m127600g(c17884e, fvb0Var.f101000c);
            }
        }
    }

    public fvb0(wc80 wc80Var, Activity activity) {
        this.f100998a = wc80Var;
        this.f100999b = activity;
    }

    /* JADX INFO: renamed from: c */
    public static Intent m127592c(@Nullable Intent intent, Content content) {
        return intent.putExtra("title", content.getTitle()).putExtra("summary", content.getSummary()).putExtra("appName", f3f0.f96988a);
    }

    /* JADX INFO: renamed from: d */
    public static Intent m127593d(Content content) {
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
    public static Tencent m127594e(Context context) {
        Tencent.setIsPermissionGranted(true);
        return Tencent.createInstance(cy5.f84298b, context);
    }

    /* JADX INFO: renamed from: f */
    public static Intent m127595f(Content content) {
        return new Intent().putExtra("req_type", 1).putExtra("targetUrl", content.getURL()).putExtra("imageUrl", content.getThumbBmpPath());
    }

    /* JADX INFO: renamed from: h */
    public static Bundle m127596h(Content content) {
        ArrayList arrayList = new ArrayList();
        if (content.getFile() != null) {
            arrayList.add(content.getFile().getPath());
        } else if (content.getLargeBmpPath() != null) {
            arrayList.add(content.getLargeBmpPath());
        }
        return new Intent().putExtra("req_type", 3).putExtra("summary", content.getSummary()).putExtra("imageUrl", arrayList).getExtras();
    }

    /* JADX INFO: renamed from: i */
    public static Bundle m127597i(Content content) {
        Intent intentM127595f;
        if (content.getType() == 2) {
            intentM127595f = m127593d(content);
        } else if (content.getType() == 3) {
            intentM127595f = m127595f(content);
        } else {
            if (content.getType() == 1) {
                wtq0.m207906a("Can not share text to qq friend!");
                return null;
            }
            intentM127595f = null;
        }
        return m127592c(intentM127595f, content).getExtras();
    }

    /* JADX INFO: renamed from: l */
    public static void m127598l(String str, Activity activity, Content content) {
        Tencent tencentM127594e = m127594e(activity);
        if (!gvb0.f106619b.equals(str)) {
            if (hvb0.f111748b.equals(str)) {
                tencentM127594e.shareToQQ(activity, m127597i(content), j5f.f118429e);
            }
        } else if (content.getType() == 1 || content.getType() == 2) {
            tencentM127594e.publishToQzone(activity, m127596h(content), j5f.f118429e);
        } else {
            tencentM127594e.shareToQzone(activity, m127599m(content), j5f.f118429e);
        }
    }

    /* JADX INFO: renamed from: m */
    public static Bundle m127599m(Content content) {
        return new Intent().putExtra("req_type", 1).putExtra("title", content.getTitle()).putExtra("summary", content.getSummary()).putExtra("targetUrl", content.getURL()).putExtra("imageUrl", new ArrayList(Collections.singletonList(content.getThumbBmpPath()))).getExtras();
    }

    /* JADX INFO: renamed from: g */
    public final void m127600g(j5f.C17884e c17884e, g3f0 g3f0Var) {
        int i = c17884e.f118431a;
        if (i == 0) {
            g3f0Var.mo81180b(this.f100998a);
        } else if (i == 2) {
            g3f0Var.mo81179a(this.f100998a, new Exception(c17884e.f118432b));
        } else if (i == 1) {
            g3f0Var.mo81181c(this.f100998a);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m127601j(g3f0 g3f0Var) {
        this.f101000c = g3f0Var;
    }

    /* JADX INFO: renamed from: k */
    public void m127602k(Content content, wc80 wc80Var) {
        j5f.m143522b(new C17083a());
        Intent intent = new Intent(this.f100999b, (Class<?>) ShareEventActivity.class);
        intent.putExtra("platform", wc80Var.getName());
        intent.putExtra(ShareEventActivity.SHARE_DATA, content);
        this.f100999b.startActivity(intent);
    }
}
