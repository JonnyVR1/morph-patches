package p153l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes4.dex */
public class ktf0 {

    /* JADX INFO: renamed from: a */
    public final View f128686a;

    /* JADX INFO: renamed from: b */
    public int f128687b;

    /* JADX INFO: renamed from: c */
    public InterfaceC18258a f128688c;

    /* JADX INFO: renamed from: l.ktf0$a */
    public interface InterfaceC18258a {
        /* JADX INFO: renamed from: a */
        void mo121044a(int i);

        /* JADX INFO: renamed from: b */
        void mo121045b(int i);
    }

    public ktf0(View view) {
        this.f128686a = view;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.jtf0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f122586a.m151350b();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static void m151349c(View view, InterfaceC18258a interfaceC18258a) {
        new ktf0(view).m151351d(interfaceC18258a);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m151350b() {
        Rect rect = new Rect();
        this.f128686a.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int i = this.f128687b;
        if (i == 0) {
            this.f128687b = iHeight;
            return;
        }
        if (i == iHeight) {
            return;
        }
        if (i - iHeight > 200) {
            InterfaceC18258a interfaceC18258a = this.f128688c;
            if (interfaceC18258a != null) {
                interfaceC18258a.mo121045b(i - iHeight);
            }
            this.f128687b = iHeight;
            return;
        }
        if (iHeight - i > 200) {
            InterfaceC18258a interfaceC18258a2 = this.f128688c;
            if (interfaceC18258a2 != null) {
                interfaceC18258a2.mo121044a(iHeight - i);
            }
            this.f128687b = iHeight;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m151351d(InterfaceC18258a interfaceC18258a) {
        this.f128688c = interfaceC18258a;
    }
}
