package p149l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes5.dex */
public class dlf0 {

    /* JADX INFO: renamed from: a */
    public final View f86801a;

    /* JADX INFO: renamed from: b */
    public int f86802b;

    /* JADX INFO: renamed from: c */
    public InterfaceC16404a f86803c;

    /* JADX INFO: renamed from: l.dlf0$a */
    public interface InterfaceC16404a {
        /* JADX INFO: renamed from: a */
        void mo112353a(int i);

        /* JADX INFO: renamed from: b */
        void mo112354b(int i);
    }

    public dlf0(View view) {
        this.f86801a = view;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.zkf0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f203538a.m112351b();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static void m112350c(View view, InterfaceC16404a interfaceC16404a) {
        new dlf0(view).m112352d(interfaceC16404a);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m112351b() {
        Rect rect = new Rect();
        this.f86801a.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int i = this.f86802b;
        if (i == 0) {
            this.f86802b = iHeight;
            return;
        }
        if (i == iHeight) {
            return;
        }
        if (i - iHeight > 200) {
            InterfaceC16404a interfaceC16404a = this.f86803c;
            if (interfaceC16404a != null) {
                interfaceC16404a.mo112354b(i - iHeight);
            }
            this.f86802b = iHeight;
            return;
        }
        if (iHeight - i > 200) {
            InterfaceC16404a interfaceC16404a2 = this.f86803c;
            if (interfaceC16404a2 != null) {
                interfaceC16404a2.mo112353a(iHeight - i);
            }
            this.f86802b = iHeight;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m112352d(InterfaceC16404a interfaceC16404a) {
        this.f86803c = interfaceC16404a;
    }
}
