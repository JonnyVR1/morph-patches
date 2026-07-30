package p149l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes10.dex */
public class clf0 {

    /* JADX INFO: renamed from: a */
    public final View f81390a;

    /* JADX INFO: renamed from: b */
    public int f81391b;

    /* JADX INFO: renamed from: c */
    public InterfaceC16186a f81392c;

    /* JADX INFO: renamed from: l.clf0$a */
    public interface InterfaceC16186a {
        /* JADX INFO: renamed from: a */
        void mo104524a(int i);

        /* JADX INFO: renamed from: b */
        void mo104525b(int i);
    }

    public clf0(View view) {
        this.f81390a = view;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.ykf0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f198747a.m107460b();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static void m107459c(View view, InterfaceC16186a interfaceC16186a) {
        new clf0(view).m107461d(interfaceC16186a);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m107460b() {
        Rect rect = new Rect();
        this.f81390a.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int i = this.f81391b;
        if (i == 0) {
            this.f81391b = iHeight;
            return;
        }
        if (i == iHeight) {
            return;
        }
        if (i - iHeight > 200) {
            InterfaceC16186a interfaceC16186a = this.f81392c;
            if (interfaceC16186a != null) {
                interfaceC16186a.mo104525b(i - iHeight);
            }
            this.f81391b = iHeight;
            return;
        }
        if (iHeight - i > 200) {
            InterfaceC16186a interfaceC16186a2 = this.f81392c;
            if (interfaceC16186a2 != null) {
                interfaceC16186a2.mo104524a(iHeight - i);
            }
            this.f81391b = iHeight;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m107461d(InterfaceC16186a interfaceC16186a) {
        this.f81392c = interfaceC16186a;
    }
}
