package p149l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes4.dex */
public class blf0 {

    /* JADX INFO: renamed from: a */
    public final View f76180a;

    /* JADX INFO: renamed from: b */
    public int f76181b;

    /* JADX INFO: renamed from: c */
    public InterfaceC15903a f76182c;

    /* JADX INFO: renamed from: l.blf0$a */
    public interface InterfaceC15903a {
        /* JADX INFO: renamed from: a */
        void mo102521a(int i);

        /* JADX INFO: renamed from: b */
        void mo102522b(int i);
    }

    public blf0(View view) {
        this.f76180a = view;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.alf0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f70430a.m102519b();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static void m102518c(View view, InterfaceC15903a interfaceC15903a) {
        new blf0(view).m102520d(interfaceC15903a);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m102519b() {
        Rect rect = new Rect();
        this.f76180a.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int i = this.f76181b;
        if (i == 0) {
            this.f76181b = iHeight;
            return;
        }
        if (i == iHeight) {
            return;
        }
        if (i - iHeight > 200) {
            InterfaceC15903a interfaceC15903a = this.f76182c;
            if (interfaceC15903a != null) {
                interfaceC15903a.mo102522b(i - iHeight);
            }
            this.f76181b = iHeight;
            return;
        }
        if (iHeight - i > 200) {
            InterfaceC15903a interfaceC15903a2 = this.f76182c;
            if (interfaceC15903a2 != null) {
                interfaceC15903a2.mo102521a(iHeight - i);
            }
            this.f76181b = iHeight;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m102520d(InterfaceC15903a interfaceC15903a) {
        this.f76182c = interfaceC15903a;
    }
}
