package com.hellogroup.p036mk.business.fdt.view;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper;
import com.hellogroup.p036mk.fdt.FDTManager;
import com.hellogroup.p036mk.fdt.globalevent.FDTEventManager;
import com.heytap.mcssdk.mode.CommandMessage;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C0799b;
import p153l.ave0;
import p153l.sjw;
import p153l.zue0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\rJ\u0019\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001c¨\u0006\u001e"}, m88121d2 = {"Lcom/hellogroup/mk/business/fdt/view/FDTStatusView;", "Landroid/widget/FrameLayout;", "Lcom/hellogroup/mk/fdt/globalevent/FDTEventManager$a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "b", "()V", Constants.INAPP_DATA_TAG, "c", "", "getURl", "()Ljava/lang/String;", "onDetachedFromWindow", "Lcom/hellogroup/mk/fdt/globalevent/FDTEventManager$Event;", NotificationCompat.CATEGORY_EVENT, "a", "(Lcom/hellogroup/mk/fdt/globalevent/FDTEventManager$Event;)V", "Lcom/hellogroup/mk/business/base/ui/MKWebViewHelper;", "Lcom/hellogroup/mk/business/base/ui/MKWebViewHelper;", "mkWebViewHelper", "Lcom/hellogroup/mk/business/base/ui/MKWebView;", "Lcom/hellogroup/mk/business/base/ui/MKWebView;", "mWebView", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class FDTStatusView extends FrameLayout implements FDTEventManager.InterfaceC3612a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private MKWebViewHelper mkWebViewHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private MKWebView mWebView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FDTStatusView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        FDTEventManager.m18525b().m18526c(this, "native");
    }

    /* JADX INFO: renamed from: b */
    private final void m18034b() {
        setVisibility(0);
        if (getChildCount() == 0) {
            m18036d();
        }
        MKWebView mKWebView = this.mWebView;
        if (mKWebView != null) {
            mKWebView.loadUrl(getURl());
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m18035c() {
        setVisibility(8);
    }

    /* JADX INFO: renamed from: d */
    private final void m18036d() {
        MKWebView mKWebView = new MKWebView(getContext());
        this.mWebView = mKWebView;
        mKWebView.setBackgroundColor(0);
        addView(this.mWebView, new ViewGroup.LayoutParams(-1, -1));
        C3535a c3535a = new C3535a();
        this.mkWebViewHelper = c3535a;
        Context context = getContext();
        if (context == null) {
            C0799b.m4641a("null cannot be cast to non-null type android.app.Activity");
            return;
        }
        c3535a.m17975z((Activity) context, this.mWebView);
        MKWebViewHelper mKWebViewHelper = this.mkWebViewHelper;
        if (mKWebViewHelper != null) {
            mKWebViewHelper.mo17971s(sjw.m186320i(), "");
        }
    }

    private final String getURl() {
        Uri.Builder builderBuildUpon = Uri.parse("https://test-s.immomo.com/fep/momo/m-fes-sdk/fdt-landing-page/monitor.html?_bid=1001009").buildUpon();
        builderBuildUpon.appendQueryParameter(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, FDTManager.INSTANCE.m18518g());
        String string = builderBuildUpon.build().toString();
        string.getClass();
        return string;
    }

    @Override // com.hellogroup.p036mk.fdt.globalevent.FDTEventManager.InterfaceC3612a
    /* JADX INFO: renamed from: a */
    public void mo18037a(@Nullable FDTEventManager.Event event) {
        String strM18534f;
        if (event == null || (strM18534f = event.m18534f()) == null) {
            return;
        }
        int iHashCode = strM18534f.hashCode();
        if (iHashCode == -1273637599) {
            if (strM18534f.equals("fdt_connect")) {
                m18034b();
            }
        } else if (iHashCode == 109542661 && strM18534f.equals("fdt_disconnect")) {
            m18035c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MKWebViewHelper mKWebViewHelper = this.mkWebViewHelper;
        if (mKWebViewHelper != null) {
            mKWebViewHelper.mo17963d();
        }
        FDTEventManager.m18525b().m18528e(this, "native");
    }

    public /* synthetic */ FDTStatusView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @JvmOverloads
    public FDTStatusView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.fdt.view.FDTStatusView$a */
    @Metadata(m88120d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0004¨\u0006\u0017"}, m88121d2 = {"com/hellogroup/mk/business/fdt/view/FDTStatusView$a", "Lcom/hellogroup/mk/business/base/ui/MKWebViewHelper;", "", "p", "()V", "", "title", "g", "(Ljava/lang/String;)V", "", "show", "e", "(Z)V", "Ll/ave0;", "uiParams", "k", "(Ll/ave0;)V", "Ll/zue0;", CommandMessage.PARAMS, "r", "(Ll/zue0;)V", "f", "closePage", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C3535a extends MKWebViewHelper {
        @Override // p153l.ziw
        public void closePage() {
        }

        @Override // p153l.flw
        /* JADX INFO: renamed from: e */
        public void mo18038e(boolean show) {
        }

        @Override // p153l.ziw
        /* JADX INFO: renamed from: f */
        public void mo18039f() {
        }

        @Override // p153l.flw
        /* JADX INFO: renamed from: g */
        public void mo18040g(@Nullable String title) {
        }

        @Override // p153l.flw
        /* JADX INFO: renamed from: p */
        public void mo18042p() {
        }

        @Override // p153l.flw
        /* JADX INFO: renamed from: k */
        public void mo18041k(@Nullable ave0 uiParams) {
        }

        @Override // p153l.flw
        /* JADX INFO: renamed from: r */
        public void mo18043r(@Nullable zue0 params) {
        }
    }
}
