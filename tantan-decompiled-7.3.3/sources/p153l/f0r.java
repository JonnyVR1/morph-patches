package p153l;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes10.dex */
public class f0r extends PopupWindow {

    /* JADX INFO: renamed from: a */
    public d0r f96711a;

    /* JADX INFO: renamed from: b */
    public int f96712b;

    /* JADX INFO: renamed from: c */
    public int f96713c;

    /* JADX INFO: renamed from: d */
    public View f96714d;

    /* JADX INFO: renamed from: e */
    public View f96715e;

    /* JADX INFO: renamed from: f */
    public Activity f96716f;

    public f0r(Activity activity) {
        super(activity);
        this.f96716f = activity;
        View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(jec0.f120475u, (ViewGroup) null, false);
        this.f96714d = viewInflate;
        setContentView(viewInflate);
        setSoftInputMode(21);
        setInputMethodMode(1);
        this.f96715e = activity.findViewById(R.id.content);
        setWidth(0);
        setHeight(-1);
        this.f96714d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.e0r
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f91547a.m123507e();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m123504b() {
        this.f96711a = null;
        dismiss();
    }

    /* JADX INFO: renamed from: c */
    public final int m123505c() {
        return this.f96716f.getResources().getConfiguration().orientation;
    }

    /* JADX INFO: renamed from: d */
    public final void m123506d() {
        Rect rect = new Rect();
        this.f96716f.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        Rect rect2 = new Rect();
        this.f96714d.getWindowVisibleDisplayFrame(rect2);
        int iM123505c = m123505c();
        int i = rect.bottom - rect2.bottom;
        if (i == 0) {
            m123508f(0, iM123505c);
        } else if (iM123505c == 1) {
            this.f96713c = i;
            m123508f(i, iM123505c);
        } else {
            this.f96712b = i;
            m123508f(i, iM123505c);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m123507e() {
        if (this.f96714d != null) {
            m123506d();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m123508f(int i, int i2) {
        d0r d0rVar = this.f96711a;
        if (d0rVar != null) {
            d0rVar.mo43567h(i, i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m123509g(d0r d0rVar) {
        this.f96711a = d0rVar;
    }

    /* JADX INFO: renamed from: h */
    public void m123510h() {
        if (isShowing() || this.f96715e.getWindowToken() == null) {
            return;
        }
        setBackgroundDrawable(new ColorDrawable(0));
        showAtLocation(this.f96715e, 0, 0, 0);
    }
}
