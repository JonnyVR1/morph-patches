package p153l;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.PopupWindow;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes5.dex */
public class f2t extends PopupWindow {

    /* JADX INFO: renamed from: a */
    public d0r f96916a;

    /* JADX INFO: renamed from: b */
    public int f96917b;

    /* JADX INFO: renamed from: c */
    public int f96918c;

    /* JADX INFO: renamed from: d */
    public View f96919d;

    /* JADX INFO: renamed from: e */
    public View f96920e;

    /* JADX INFO: renamed from: f */
    public Context f96921f;

    /* JADX INFO: renamed from: g */
    public Window f96922g;

    public f2t(Context context, Window window) {
        super(context);
        this.f96921f = context;
        this.f96922g = window;
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(jec0.f120475u, (ViewGroup) null, false);
        this.f96919d = viewInflate;
        viewInflate.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        setContentView(this.f96919d);
        setSoftInputMode(21);
        setInputMethodMode(1);
        this.f96920e = window.findViewById(R.id.content);
        setWidth(0);
        setHeight(-1);
        this.f96919d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.e2t
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f91854a.m123675e();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m123672b() {
        this.f96916a = null;
        dismiss();
    }

    /* JADX INFO: renamed from: c */
    public final int m123673c() {
        return this.f96921f.getResources().getConfiguration().orientation;
    }

    /* JADX INFO: renamed from: d */
    public final void m123674d() {
        Rect rect = new Rect();
        this.f96922g.getDecorView().getWindowVisibleDisplayFrame(rect);
        Rect rect2 = new Rect();
        this.f96919d.getWindowVisibleDisplayFrame(rect2);
        int iM123673c = m123673c();
        int i = rect.bottom - rect2.bottom;
        if (i == 0) {
            m123676f(0, iM123673c);
        } else if (iM123673c == 1) {
            this.f96918c = i;
            m123676f(i, iM123673c);
        } else {
            this.f96917b = i;
            m123676f(i, iM123673c);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m123675e() {
        if (this.f96919d != null) {
            m123674d();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m123676f(int i, int i2) {
        d0r d0rVar = this.f96916a;
        if (d0rVar != null) {
            d0rVar.mo43567h(i, i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m123677g(d0r d0rVar) {
        this.f96916a = d0rVar;
    }

    /* JADX INFO: renamed from: h */
    public void m123678h() {
        if (isShowing() || this.f96920e.getWindowToken() == null) {
            return;
        }
        setBackgroundDrawable(new ColorDrawable(0));
        showAtLocation(this.f96920e, 0, 0, 0);
    }
}
