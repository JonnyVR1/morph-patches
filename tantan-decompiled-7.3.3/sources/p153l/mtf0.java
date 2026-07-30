package p153l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes5.dex */
public class mtf0 {

    /* JADX INFO: renamed from: a */
    public final View f138604a;

    /* JADX INFO: renamed from: b */
    public int f138605b;

    /* JADX INFO: renamed from: c */
    public InterfaceC18702a f138606c;

    /* JADX INFO: renamed from: l.mtf0$a */
    public interface InterfaceC18702a {
        /* JADX INFO: renamed from: a */
        void mo159991a(int i);

        /* JADX INFO: renamed from: b */
        void mo159992b(int i);
    }

    public mtf0(View view) {
        this.f138604a = view;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.itf0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f116831a.m159989b();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static void m159988c(View view, InterfaceC18702a interfaceC18702a) {
        new mtf0(view).m159990d(interfaceC18702a);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m159989b() {
        Rect rect = new Rect();
        this.f138604a.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int i = this.f138605b;
        if (i == 0) {
            this.f138605b = iHeight;
            return;
        }
        if (i == iHeight) {
            return;
        }
        if (i - iHeight > 200) {
            InterfaceC18702a interfaceC18702a = this.f138606c;
            if (interfaceC18702a != null) {
                interfaceC18702a.mo159992b(i - iHeight);
            }
            this.f138605b = iHeight;
            return;
        }
        if (iHeight - i > 200) {
            InterfaceC18702a interfaceC18702a2 = this.f138606c;
            if (interfaceC18702a2 != null) {
                interfaceC18702a2.mo159991a(iHeight - i);
            }
            this.f138605b = iHeight;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m159990d(InterfaceC18702a interfaceC18702a) {
        this.f138606c = interfaceC18702a;
    }
}
