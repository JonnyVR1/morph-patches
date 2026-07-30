package p153l;

import android.content.Context;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.p036mk.business.widget.enhance.MKEnhanceView;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0005J\u0017\u0010\u0019\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u0005J\u0017\u0010\u001a\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u0005J\u0017\u0010\u001b\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u0017\u0010\u001c\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u0005R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m88121d2 = {"Ll/d2f;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "rootView", "", "url", "loadingFlag", "Lcom/hellogroup/mk/business/widget/enhance/MKEnhanceView;", "mkEnhanceView", "", "a", "(Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;Lcom/hellogroup/mk/business/widget/enhance/MKEnhanceView;)V", "", "isShow", "g", "(Z)V", "failingUrl", "errorStr", "h", "(ZLjava/lang/String;Ljava/lang/String;)V", "e", Constants.INAPP_DATA_TAG, "c", "f", "b", "Lcom/hellogroup/mk/business/widget/enhance/MKEnhanceView;", "enhanceView", "Ljava/lang/String;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class d2f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private MKEnhanceView enhanceView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String url;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    public d2f(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m113690a(@Nullable ViewGroup rootView, @Nullable String url, @Nullable String loadingFlag, @Nullable MKEnhanceView mkEnhanceView) {
        if (rootView == null || url == null || loadingFlag == null || mkEnhanceView == null) {
            return;
        }
        this.url = url;
        this.enhanceView = mkEnhanceView;
        rootView.addView(mkEnhanceView, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: b */
    public final void m113691b(@Nullable Context context) {
        MKEnhanceView mKEnhanceView = this.enhanceView;
        if (mKEnhanceView != null) {
            mKEnhanceView.mo18370c(context);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m113692c(@Nullable Context context) {
        MKEnhanceView mKEnhanceView = this.enhanceView;
        if (mKEnhanceView != null) {
            mKEnhanceView.mo18371d(context);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m113693d(@Nullable Context context) {
        MKEnhanceView mKEnhanceView = this.enhanceView;
        if (mKEnhanceView != null) {
            mKEnhanceView.mo18372e(context);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m113694e(@Nullable Context context) {
        MKEnhanceView mKEnhanceView = this.enhanceView;
        if (mKEnhanceView != null) {
            mKEnhanceView.mo18373f(context);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m113695f(@Nullable Context context) {
        MKEnhanceView mKEnhanceView = this.enhanceView;
        if (mKEnhanceView != null) {
            mKEnhanceView.mo18374g(context);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m113696g(boolean isShow) {
        MKEnhanceView mKEnhanceView = this.enhanceView;
        if (isShow) {
            if (mKEnhanceView != null) {
                mKEnhanceView.mo18375h();
            }
        } else if (mKEnhanceView != null) {
            mKEnhanceView.mo18368a();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m113697h(boolean isShow, @Nullable String failingUrl, @Nullable String errorStr) {
        MKEnhanceView mKEnhanceView;
        if (!isShow) {
            MKEnhanceView mKEnhanceView2 = this.enhanceView;
            if (mKEnhanceView2 != null) {
                mKEnhanceView2.mo18369b();
                return;
            }
            return;
        }
        if ((failingUrl == null || StringsKt.m94303P(failingUrl, ".html", false, 2, null) || StringsKt.m94303P(failingUrl, ".js", false, 2, null)) && (mKEnhanceView = this.enhanceView) != null) {
            mKEnhanceView.mo18376i(errorStr);
        }
    }
}
