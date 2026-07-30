package p153l;

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
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/k5g;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "Landroid/graphics/Bitmap;", "bitmap", "", "c", "(Landroid/view/ViewGroup;Landroid/graphics/Bitmap;)V", "Ll/l5g;", SocialConstants.TYPE_REQUEST, Constants.INAPP_DATA_TAG, "(Ll/l5g;)V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class k5g {

    @NotNull
    public static final k5g INSTANCE = new k5g();

    private k5g() {
    }

    /* JADX INFO: renamed from: a */
    public static void m148359a(final l5g l5gVar, String str) {
        l5gVar.getClass();
        final Bitmap bitmapM6554p = l5gVar.getResourceProvider().m6554p(str);
        l5gVar.getContainer().post(new Runnable() { // from class: l.j5g
            @Override // java.lang.Runnable
            public final void run() {
                k5g.m148360b(l5gVar, bitmapM6554p);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static void m148360b(l5g l5gVar, Bitmap bitmap) {
        l5gVar.getClass();
        if (l5gVar.m152954k().invoke().booleanValue()) {
            return;
        }
        if (bitmap != null) {
            Function1<Bitmap, Boolean> function1M152949f = l5gVar.m152949f();
            if (function1M152949f == null || !function1M152949f.invoke(bitmap).booleanValue()) {
                INSTANCE.m148361c(l5gVar.getContainer(), bitmap);
            }
            Function0<Unit> function0M152950g = l5gVar.m152950g();
            if (function0M152950g != null) {
                function0M152950g.invoke();
                return;
            }
            return;
        }
        m960 callbacks = l5gVar.getCallbacks();
        if (callbacks != null) {
            callbacks.mo6371f(l5gVar.getPrimaryUrl(), l5gVar.getErrorContext() + " and fallback failed");
        }
        Function0<Unit> function0M152951h = l5gVar.m152951h();
        if (function0M152951h != null) {
            function0M152951h.invoke();
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m148361c(ViewGroup container, Bitmap bitmap) {
        ImageView imageView = new ImageView(container.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageBitmap(bitmap);
        container.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: d */
    public final void m148362d(@NotNull final l5g request) {
        request.getClass();
        String fallbackUrl = request.getFallbackUrl();
        if (fallbackUrl == null || StringsKt.m94329e0(fallbackUrl)) {
            m960 callbacks = request.getCallbacks();
            if (callbacks != null) {
                callbacks.mo6371f(request.getPrimaryUrl(), request.getErrorContext() + " and no fallback URL");
            }
            Function0<Unit> function0M152951h = request.m152951h();
            if (function0M152951h != null) {
                function0M152951h.invoke();
                return;
            }
            return;
        }
        final String fallbackUrl2 = request.getFallbackUrl();
        Bitmap bitmapM6550i = request.getResourceProvider().m6550i(fallbackUrl2);
        if (bitmapM6550i == null) {
            request.getMediaExecutor().execute(new Runnable() { // from class: l.i5g
                @Override // java.lang.Runnable
                public final void run() {
                    k5g.m148359a(request, fallbackUrl2);
                }
            });
            return;
        }
        Function1<Bitmap, Boolean> function1M152949f = request.m152949f();
        if (function1M152949f == null || !function1M152949f.invoke(bitmapM6550i).booleanValue()) {
            m148361c(request.getContainer(), bitmapM6550i);
        }
        Function0<Unit> function0M152950g = request.m152950g();
        if (function0M152950g != null) {
            function0M152950g.invoke();
        }
    }
}
