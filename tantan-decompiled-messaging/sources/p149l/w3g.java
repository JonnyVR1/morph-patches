package p149l;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.clevertap.android.sdk.Constants;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/w3g;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "Landroid/graphics/Bitmap;", "bitmap", "", "c", "(Landroid/view/ViewGroup;Landroid/graphics/Bitmap;)V", "Ll/x3g;", SocialConstants.TYPE_REQUEST, Constants.INAPP_DATA_TAG, "(Ll/x3g;)V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class w3g {

    @NotNull
    public static final w3g INSTANCE = new w3g();

    private w3g() {
    }

    /* JADX INFO: renamed from: a */
    public static void m201312a(final x3g x3gVar, String str) {
        x3gVar.getClass();
        final Bitmap bitmapM6500p = x3gVar.getResourceProvider().m6500p(str);
        x3gVar.getContainer().post(new Runnable() { // from class: l.v3g
            @Override // java.lang.Runnable
            public final void run() {
                w3g.m201313b(x3gVar, bitmapM6500p);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static void m201313b(x3g x3gVar, Bitmap bitmap) {
        x3gVar.getClass();
        if (x3gVar.m206926k().invoke().booleanValue()) {
            return;
        }
        if (bitmap != null) {
            Function1<Bitmap, Boolean> function1M206921f = x3gVar.m206921f();
            if (function1M206921f == null || !function1M206921f.invoke(bitmap).booleanValue()) {
                INSTANCE.m201314c(x3gVar.getContainer(), bitmap);
            }
            Function0<Unit> function0M206922g = x3gVar.m206922g();
            if (function0M206922g != null) {
                function0M206922g.invoke();
                return;
            }
            return;
        }
        h160 callbacks = x3gVar.getCallbacks();
        if (callbacks != null) {
            callbacks.mo6317f(x3gVar.getPrimaryUrl(), x3gVar.getErrorContext() + " and fallback failed");
        }
        Function0<Unit> function0M206923h = x3gVar.m206923h();
        if (function0M206923h != null) {
            function0M206923h.invoke();
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m201314c(ViewGroup container, Bitmap bitmap) {
        ImageView imageView = new ImageView(container.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageBitmap(bitmap);
        container.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: d */
    public final void m201315d(@NotNull final x3g request) {
        request.getClass();
        String fallbackUrl = request.getFallbackUrl();
        if (fallbackUrl == null || StringsKt.m93438e0(fallbackUrl)) {
            h160 callbacks = request.getCallbacks();
            if (callbacks != null) {
                callbacks.mo6317f(request.getPrimaryUrl(), request.getErrorContext() + " and no fallback URL");
            }
            Function0<Unit> function0M206923h = request.m206923h();
            if (function0M206923h != null) {
                function0M206923h.invoke();
                return;
            }
            return;
        }
        final String fallbackUrl2 = request.getFallbackUrl();
        Bitmap bitmapM6496i = request.getResourceProvider().m6496i(fallbackUrl2);
        if (bitmapM6496i == null) {
            request.getMediaExecutor().execute(new Runnable() { // from class: l.u3g
                @Override // java.lang.Runnable
                public final void run() {
                    w3g.m201312a(request, fallbackUrl2);
                }
            });
            return;
        }
        Function1<Bitmap, Boolean> function1M206921f = request.m206921f();
        if (function1M206921f == null || !function1M206921f.invoke(bitmapM6496i).booleanValue()) {
            m201314c(request.getContainer(), bitmapM6496i);
        }
        Function0<Unit> function0M206922g = request.m206922g();
        if (function0M206922g != null) {
            function0M206922g.invoke();
        }
    }
}
