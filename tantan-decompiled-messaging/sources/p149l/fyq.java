package p149l;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes11.dex */
public class fyq extends PopupWindow {

    /* JADX INFO: renamed from: a */
    public dyq f99889a;

    /* JADX INFO: renamed from: b */
    public int f99890b;

    /* JADX INFO: renamed from: c */
    public int f99891c;

    /* JADX INFO: renamed from: d */
    public View f99892d;

    /* JADX INFO: renamed from: e */
    public View f99893e;

    /* JADX INFO: renamed from: f */
    public Activity f99894f;

    public fyq(Activity activity) {
        super(activity);
        this.f99894f = activity;
        View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(e6c0.f89562u, (ViewGroup) null, false);
        this.f99892d = viewInflate;
        setContentView(viewInflate);
        setSoftInputMode(21);
        setInputMethodMode(1);
        this.f99893e = activity.findViewById(R.id.content);
        setWidth(0);
        setHeight(-1);
        this.f99892d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.eyq
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f93785a.m123792e();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m123789b() {
        this.f99889a = null;
        dismiss();
    }

    /* JADX INFO: renamed from: c */
    public final int m123790c() {
        return this.f99894f.getResources().getConfiguration().orientation;
    }

    /* JADX INFO: renamed from: d */
    public final void m123791d() {
        Rect rect = new Rect();
        this.f99894f.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        Rect rect2 = new Rect();
        this.f99892d.getWindowVisibleDisplayFrame(rect2);
        int iM123790c = m123790c();
        int i = rect.bottom - rect2.bottom;
        if (i == 0) {
            m123793f(0, iM123790c);
        } else if (iM123790c == 1) {
            this.f99891c = i;
            m123793f(i, iM123790c);
        } else {
            this.f99890b = i;
            m123793f(i, iM123790c);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m123792e() {
        if (this.f99892d != null) {
            m123791d();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m123793f(int i, int i2) {
        dyq dyqVar = this.f99889a;
        if (dyqVar != null) {
            dyqVar.mo42557h(i, i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m123794g(dyq dyqVar) {
        this.f99889a = dyqVar;
    }

    /* JADX INFO: renamed from: h */
    public void m123795h() {
        if (isShowing() || this.f99893e.getWindowToken() == null) {
            return;
        }
        setBackgroundDrawable(new ColorDrawable(0));
        showAtLocation(this.f99893e, 0, 0, 0);
    }
}
