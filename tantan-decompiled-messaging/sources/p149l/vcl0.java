package p149l;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class vcl0 {

    /* JADX INFO: renamed from: a */
    public static final ViewOutlineProvider f180964a = new C20615a();

    /* JADX INFO: renamed from: l.vcl0$a */
    public class C20615a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (view.getTag() instanceof Integer) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((Integer) view.getTag()).intValue());
            }
        }
    }

    /* JADX INFO: renamed from: l.vcl0$b */
    public class C20616b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f180965a;

        public C20616b(int i) {
            this.f180965a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f180965a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m197905a(View view, int i) {
        view.setOutlineProvider(new C20616b(i));
        view.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: b */
    public static void m197906b(View view, int i) {
        view.setTag(Integer.valueOf(i));
        if (NullChecker.m81303a(view.getOutlineProvider()) && view.getOutlineProvider().equals(f180964a)) {
            view.invalidateOutline();
        } else {
            view.setOutlineProvider(f180964a);
            view.setClipToOutline(true);
        }
    }
}
