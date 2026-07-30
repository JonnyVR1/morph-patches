package p149l;

import android.app.Activity;
import android.content.Context;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m87232d2 = {"Ll/dtd;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Companion", "a", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public class dtd implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    private static final Field f87830a;

    static {
        Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
        declaredField.getClass();
        f87830a = declaredField;
        declaredField.setAccessible(true);
    }

    /* JADX INFO: renamed from: l.dtd$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Ll/dtd$a;", "", "<init>", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "", "b", "(Landroid/view/View;)J", "Ljava/lang/reflect/Field;", "choreographerLastFrameTimeField", "Ljava/lang/reflect/Field;", "a", "()Ljava/lang/reflect/Field;", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Field m113542a() {
            return dtd.f87830a;
        }

        /* JADX INFO: renamed from: b */
        public final long m113543b(@Nullable View view) {
            float refreshRate;
            wjq.Companion companion = wjq.INSTANCE;
            if (companion.m203485a() < 0) {
                Window window = null;
                if ((view != null ? view.getContext() : null) instanceof Activity) {
                    Context context = view.getContext();
                    if (context == null) {
                        ox50.m166495a("null cannot be cast to non-null type android.app.Activity");
                        return 0L;
                    }
                    window = ((Activity) context).getWindow();
                }
                float f = 60.0f;
                if (window != null) {
                    WindowManager windowManager = window.getWindowManager();
                    windowManager.getClass();
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    defaultDisplay.getClass();
                    refreshRate = defaultDisplay.getRefreshRate();
                } else {
                    refreshRate = 60.0f;
                }
                if (refreshRate >= 30.0f && refreshRate <= 200.0f) {
                    f = refreshRate;
                }
                companion.m203486b((long) ((1000.0f / f) * 1000000.0f));
            }
            return companion.m203485a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
