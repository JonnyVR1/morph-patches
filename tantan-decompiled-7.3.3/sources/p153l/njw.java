package p153l;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f¨\u0006\u001c"}, m88121d2 = {"Ll/njw;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Lcom/hellogroup/mk/business/base/ui/MKWebView;", "mkWebView", "", "f", "(Landroid/app/Activity;Lcom/hellogroup/mk/business/base/ui/MKWebView;)V", "g", "(Landroid/app/Activity;)V", "", "a", "Z", "isKeyboardOpened", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "b", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "c", "I", "rootViewVisibleHeight", Constants.INAPP_DATA_TAG, "listeningCall", "Companion", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class njw {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isKeyboardOpened;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ViewTreeObserver.OnGlobalLayoutListener listener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int rootViewVisibleHeight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean listeningCall = true;

    /* JADX INFO: renamed from: l.njw$b */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "onGlobalLayout"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class ViewTreeObserverOnGlobalLayoutListenerC18888b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Window f142359b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ MKWebView f142360c;

        public ViewTreeObserverOnGlobalLayoutListenerC18888b(Window window, MKWebView mKWebView) {
            this.f142359b = window;
            this.f142360c = mKWebView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            int i;
            try {
                if (njw.this.listeningCall) {
                    jzv.m147728a("initKeyboardState", "visibleHeight=" + njw.this.rootViewVisibleHeight);
                    Rect rect = new Rect();
                    this.f142359b.getDecorView().getWindowVisibleDisplayFrame(rect);
                    int iHeight = rect.height();
                    int i2 = njw.this.rootViewVisibleHeight;
                    njw njwVar = njw.this;
                    if (i2 == 0) {
                        njwVar.rootViewVisibleHeight = iHeight;
                        return;
                    }
                    if (njwVar.rootViewVisibleHeight == iHeight) {
                        return;
                    }
                    if (njw.this.rootViewVisibleHeight - iHeight > 200) {
                        njw.this.isKeyboardOpened = true;
                        int unused = njw.this.rootViewVisibleHeight;
                        i = njw.this.rootViewVisibleHeight - iHeight;
                        njw.this.rootViewVisibleHeight = iHeight;
                    } else {
                        i = 0;
                    }
                    if (iHeight - njw.this.rootViewVisibleHeight > 200) {
                        njw.this.isKeyboardOpened = false;
                        i = iHeight - njw.this.rootViewVisibleHeight;
                        njw.this.rootViewVisibleHeight = iHeight;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("type", njw.this.isKeyboardOpened ? "show" : "hide");
                        jSONObject.put("height", lpj0.m155245a(Math.abs(i)));
                    } catch (Exception e) {
                        jzv.m147730c("initKeyboardState", "", e);
                    }
                    MKWebView mKWebView = this.f142360c;
                    if (mKWebView != null) {
                        jzv.m147728a("initKeyboardState", "键盘" + njw.this.isKeyboardOpened + "   keyboardSize=" + i);
                        mKWebView.m17935x0("keyboard", jSONObject.toString(), mKWebView.getUrl());
                    }
                }
            } catch (Throwable th) {
                jzv.m147730c("initKeyboardState", "", th);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m163474f(@Nullable Activity activity, @Nullable MKWebView mkWebView) {
        if (activity != null) {
            try {
                Window window = activity.getWindow();
                if (window != null) {
                    this.listener = new ViewTreeObserverOnGlobalLayoutListenerC18888b(window, mkWebView);
                    View decorView = window.getDecorView();
                    decorView.getClass();
                    decorView.getViewTreeObserver().addOnGlobalLayoutListener(this.listener);
                }
            } catch (Throwable th) {
                jzv.m147730c("initKeyboardState", "", th);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m163475g(@Nullable Activity activity) {
        Window window;
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        try {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.listener;
            if (onGlobalLayoutListener != null) {
                View decorView = window.getDecorView();
                decorView.getClass();
                ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                }
            }
        } catch (Throwable th) {
            jzv.m147730c("initKeyboardState", "", th);
        }
    }
}
