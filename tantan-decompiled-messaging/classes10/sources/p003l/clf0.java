package p003l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class clf0 {

    /* JADX INFO: renamed from: a */
    public final View f4045a;

    /* JADX INFO: renamed from: b */
    public int f4046b;

    /* JADX INFO: renamed from: c */
    public InterfaceC3312a f4047c;

    /* JADX INFO: renamed from: l.clf0$a */
    public interface InterfaceC3312a {
        /* JADX INFO: renamed from: a */
        void m5963a(int i);

        /* JADX INFO: renamed from: b */
        void m5964b(int i);
    }

    public clf0(View view) {
        this.f4045a = view;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.ykf0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f9080a.m5961b();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static void m5960c(View view, InterfaceC3312a interfaceC3312a) {
        new clf0(view).m5962d(interfaceC3312a);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m5961b() {
        Rect rect = new Rect();
        this.f4045a.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int i = this.f4046b;
        if (i == 0) {
            this.f4046b = iHeight;
            return;
        }
        if (i == iHeight) {
            return;
        }
        if (i - iHeight > 200) {
            InterfaceC3312a interfaceC3312a = this.f4047c;
            if (interfaceC3312a != null) {
                interfaceC3312a.m5964b(i - iHeight);
            }
            this.f4046b = iHeight;
            return;
        }
        if (iHeight - i > 200) {
            InterfaceC3312a interfaceC3312a2 = this.f4047c;
            if (interfaceC3312a2 != null) {
                interfaceC3312a2.m5963a(iHeight - i);
            }
            this.f4046b = iHeight;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5962d(InterfaceC3312a interfaceC3312a) {
        this.f4047c = interfaceC3312a;
    }
}
