package p002l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class blf0 {

    /* JADX INFO: renamed from: a */
    public final View f8256a;

    /* JADX INFO: renamed from: b */
    public int f8257b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0505a f8258c;

    /* JADX INFO: renamed from: l.blf0$a */
    public interface InterfaceC0505a {
        /* JADX INFO: renamed from: a */
        void mo10463a(int i);

        /* JADX INFO: renamed from: b */
        void mo10464b(int i);
    }

    public blf0(View view) {
        this.f8256a = view;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.alf0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f7719a.m10461b();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static void m10460c(View view, InterfaceC0505a interfaceC0505a) {
        new blf0(view).m10462d(interfaceC0505a);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m10461b() {
        Rect rect = new Rect();
        this.f8256a.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int i = this.f8257b;
        if (i == 0) {
            this.f8257b = iHeight;
            return;
        }
        if (i == iHeight) {
            return;
        }
        if (i - iHeight > 200) {
            InterfaceC0505a interfaceC0505a = this.f8258c;
            if (interfaceC0505a != null) {
                interfaceC0505a.mo10464b(i - iHeight);
            }
            this.f8257b = iHeight;
            return;
        }
        if (iHeight - i > 200) {
            InterfaceC0505a interfaceC0505a2 = this.f8258c;
            if (interfaceC0505a2 != null) {
                interfaceC0505a2.mo10463a(iHeight - i);
            }
            this.f8257b = iHeight;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m10462d(InterfaceC0505a interfaceC0505a) {
        this.f8258c = interfaceC0505a;
    }
}
