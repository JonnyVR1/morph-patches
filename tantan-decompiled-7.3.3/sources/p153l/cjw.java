package p153l;

import android.net.Uri;
import android.view.ViewGroup;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0017"}, m88121d2 = {"Ll/cjw;", "", "<init>", "()V", "", "recheck", "Lcom/hellogroup/mk/business/base/ui/MKWebView;", "mkWebView", "", "wantRatio", "Landroid/view/ViewGroup;", "containerView", "", "a", "(Ljava/lang/Boolean;Lcom/hellogroup/mk/business/base/ui/MKWebView;Ljava/lang/Float;Landroid/view/ViewGroup;)V", "", "startUrl", "b", "(Ljava/lang/String;Lcom/hellogroup/mk/business/base/ui/MKWebView;Landroid/view/ViewGroup;Ljava/lang/Boolean;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitedSize", "Companion", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class cjw {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AtomicBoolean isInitedSize = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    private final void m110285a(Boolean recheck, MKWebView mkWebView, Float wantRatio, ViewGroup containerView) {
        int iFloatValue;
        if (mkWebView == null || wantRatio == null || containerView == null) {
            return;
        }
        int i = mkWebView.f12094o;
        int i2 = mkWebView.f12095p;
        if (i <= 0 || i2 <= 0) {
            return;
        }
        double d = (((double) i) * 1.0d) / ((double) i2);
        jzv.m147732e("MKAspectRatio", "deviceRatio=" + d + "    wantRatio=" + wantRatio + "   recheck=" + recheck);
        if (Double.compare(d, wantRatio.floatValue()) > 0 || Intrinsics.m88377d(recheck, Boolean.TRUE)) {
            float f = i2;
            float f2 = i;
            if (wantRatio.floatValue() * f > f2 || f2 / wantRatio.floatValue() <= f) {
                iFloatValue = i;
            } else {
                iFloatValue = (int) (f * wantRatio.floatValue());
                jzv.m147732e("MKAspectRatio", "curWidth=" + i + "  curHeight=" + i2 + "  resultWidth=" + iFloatValue);
            }
            int i3 = i > iFloatValue ? (i - iFloatValue) / 2 : 0;
            if (i3 >= 0) {
                containerView.setPadding(i3, 0, i3, 0);
            }
            this.isInitedSize.set(true);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m110286b(@Nullable String startUrl, @Nullable MKWebView mkWebView, @Nullable ViewGroup containerView, @Nullable Boolean recheck) {
        String queryParameter;
        try {
            if ((!this.isInitedSize.get() || Intrinsics.m88377d(recheck, Boolean.TRUE)) && mkWebView != null && startUrl != null && mkWebView.f12094o > 0 && StringsKt.m94303P(startUrl, "_ui_aspect_ratio", false, 2, null) && mkWebView.m17908N0(startUrl) && glw.m130711h() && (queryParameter = Uri.parse(startUrl).getQueryParameter("_ui_aspect_ratio")) != null) {
                float f = Float.parseFloat(queryParameter);
                if (f <= 0.0f) {
                    return;
                }
                m110285a(recheck, mkWebView, Float.valueOf(f), containerView);
            }
        } catch (Throwable th) {
            jzv.m147730c("MKAspectRatio", "", th);
        }
    }
}
