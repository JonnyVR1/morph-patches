package p153l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes12.dex */
public class ltf0 {

    /* JADX INFO: renamed from: a */
    public final View f133542a;

    /* JADX INFO: renamed from: b */
    public int f133543b;

    /* JADX INFO: renamed from: c */
    public InterfaceC18459a f133544c;

    /* JADX INFO: renamed from: l.ltf0$a */
    public interface InterfaceC18459a {
        /* JADX INFO: renamed from: a */
        void mo95584a(int i);

        /* JADX INFO: renamed from: b */
        void mo95585b(int i);
    }

    public ltf0(View view) {
        this.f133542a = view;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.htf0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f111534a.m155774b();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static void m155773c(View view, InterfaceC18459a interfaceC18459a) {
        new ltf0(view).m155775d(interfaceC18459a);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m155774b() {
        Rect rect = new Rect();
        this.f133542a.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int i = this.f133543b;
        if (i == 0) {
            this.f133543b = iHeight;
            return;
        }
        if (i == iHeight) {
            return;
        }
        if (i - iHeight > 200) {
            InterfaceC18459a interfaceC18459a = this.f133544c;
            if (interfaceC18459a != null) {
                interfaceC18459a.mo95585b(i - iHeight);
            }
            this.f133543b = iHeight;
            return;
        }
        if (iHeight - i > 200) {
            InterfaceC18459a interfaceC18459a2 = this.f133544c;
            if (interfaceC18459a2 != null) {
                interfaceC18459a2.mo95584a(iHeight - i);
            }
            this.f133543b = iHeight;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m155775d(InterfaceC18459a interfaceC18459a) {
        this.f133544c = interfaceC18459a;
    }
}
