package p003l;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vcl0 {

    /* JADX INFO: renamed from: a */
    public static final ViewOutlineProvider f7969a = new C3452a();

    /* JADX INFO: renamed from: l.vcl0$a */
    public class C3452a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (view.getTag() instanceof Integer) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((Integer) view.getTag()).intValue());
            }
        }
    }

    /* JADX INFO: renamed from: l.vcl0$b */
    public class C3453b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f7970a;

        public C3453b(int i) {
            this.f7970a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f7970a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m10212a(View view, int i) {
        view.setOutlineProvider(new C3453b(i));
        view.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: b */
    public static void m10213b(View view, int i) {
        view.setTag(Integer.valueOf(i));
        if (NullChecker.a(view.getOutlineProvider()) && view.getOutlineProvider().equals(f7969a)) {
            view.invalidateOutline();
        } else {
            view.setOutlineProvider(f7969a);
            view.setClipToOutline(true);
        }
    }
}
