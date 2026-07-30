package p149l;

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
public class e0t extends PopupWindow {

    /* JADX INFO: renamed from: a */
    public dyq f88671a;

    /* JADX INFO: renamed from: b */
    public int f88672b;

    /* JADX INFO: renamed from: c */
    public int f88673c;

    /* JADX INFO: renamed from: d */
    public View f88674d;

    /* JADX INFO: renamed from: e */
    public View f88675e;

    /* JADX INFO: renamed from: f */
    public Context f88676f;

    /* JADX INFO: renamed from: g */
    public Window f88677g;

    public e0t(Context context, Window window) {
        super(context);
        this.f88676f = context;
        this.f88677g = window;
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(e6c0.f89562u, (ViewGroup) null, false);
        this.f88674d = viewInflate;
        viewInflate.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        setContentView(this.f88674d);
        setSoftInputMode(21);
        setInputMethodMode(1);
        this.f88675e = window.findViewById(R.id.content);
        setWidth(0);
        setHeight(-1);
        this.f88674d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.d0t
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f83213a.m114338e();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m114335b() {
        this.f88671a = null;
        dismiss();
    }

    /* JADX INFO: renamed from: c */
    public final int m114336c() {
        return this.f88676f.getResources().getConfiguration().orientation;
    }

    /* JADX INFO: renamed from: d */
    public final void m114337d() {
        Rect rect = new Rect();
        this.f88677g.getDecorView().getWindowVisibleDisplayFrame(rect);
        Rect rect2 = new Rect();
        this.f88674d.getWindowVisibleDisplayFrame(rect2);
        int iM114336c = m114336c();
        int i = rect.bottom - rect2.bottom;
        if (i == 0) {
            m114339f(0, iM114336c);
        } else if (iM114336c == 1) {
            this.f88673c = i;
            m114339f(i, iM114336c);
        } else {
            this.f88672b = i;
            m114339f(i, iM114336c);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m114338e() {
        if (this.f88674d != null) {
            m114337d();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m114339f(int i, int i2) {
        dyq dyqVar = this.f88671a;
        if (dyqVar != null) {
            dyqVar.mo42557h(i, i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m114340g(dyq dyqVar) {
        this.f88671a = dyqVar;
    }

    /* JADX INFO: renamed from: h */
    public void m114341h() {
        if (isShowing() || this.f88675e.getWindowToken() == null) {
            return;
        }
        setBackgroundDrawable(new ColorDrawable(0));
        showAtLocation(this.f88675e, 0, 0, 0);
    }
}
