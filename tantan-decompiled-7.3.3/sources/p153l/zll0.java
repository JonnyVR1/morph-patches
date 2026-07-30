package p153l;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class zll0 {

    /* JADX INFO: renamed from: a */
    public static final ViewOutlineProvider f204978a = new C21837a();

    /* JADX INFO: renamed from: l.zll0$a */
    public class C21837a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (view.getTag() instanceof Integer) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((Integer) view.getTag()).intValue());
            }
        }
    }

    /* JADX INFO: renamed from: l.zll0$b */
    public class C21838b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f204979a;

        public C21838b(int i) {
            this.f204979a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f204979a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m220292a(View view, int i) {
        view.setOutlineProvider(new C21838b(i));
        view.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: b */
    public static void m220293b(View view, int i) {
        view.setTag(Integer.valueOf(i));
        if (NullChecker.m82486a(view.getOutlineProvider()) && view.getOutlineProvider().equals(f204978a)) {
            view.invalidateOutline();
        } else {
            view.setOutlineProvider(f204978a);
            view.setClipToOutline(true);
        }
    }
}
