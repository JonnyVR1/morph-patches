package p009l;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import l.e6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class fyq extends PopupWindow {

    /* JADX INFO: renamed from: a */
    public dyq f13226a;

    /* JADX INFO: renamed from: b */
    public int f13227b;

    /* JADX INFO: renamed from: c */
    public int f13228c;

    /* JADX INFO: renamed from: d */
    public View f13229d;

    /* JADX INFO: renamed from: e */
    public View f13230e;

    /* JADX INFO: renamed from: f */
    public Activity f13231f;

    public fyq(Activity activity) {
        super(activity);
        this.f13231f = activity;
        View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(e6c0.u, (ViewGroup) null, false);
        this.f13229d = viewInflate;
        setContentView(viewInflate);
        setSoftInputMode(21);
        setInputMethodMode(1);
        this.f13230e = activity.findViewById(R.id.content);
        setWidth(0);
        setHeight(-1);
        this.f13229d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.eyq
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f12728a.m14665e();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m14662b() {
        this.f13226a = null;
        dismiss();
    }

    /* JADX INFO: renamed from: c */
    public final int m14663c() {
        return this.f13231f.getResources().getConfiguration().orientation;
    }

    /* JADX INFO: renamed from: d */
    public final void m14664d() {
        Rect rect = new Rect();
        this.f13231f.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        Rect rect2 = new Rect();
        this.f13229d.getWindowVisibleDisplayFrame(rect2);
        int iM14663c = m14663c();
        int i = rect.bottom - rect2.bottom;
        if (i == 0) {
            m14666f(0, iM14663c);
        } else if (iM14663c == 1) {
            this.f13228c = i;
            m14666f(i, iM14663c);
        } else {
            this.f13227b = i;
            m14666f(i, iM14663c);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m14665e() {
        if (this.f13229d != null) {
            m14664d();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m14666f(int i, int i2) {
        dyq dyqVar = this.f13226a;
        if (dyqVar != null) {
            dyqVar.mo6718h(i, i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m14667g(dyq dyqVar) {
        this.f13226a = dyqVar;
    }

    /* JADX INFO: renamed from: h */
    public void m14668h() {
        if (isShowing() || this.f13230e.getWindowToken() == null) {
            return;
        }
        setBackgroundDrawable(new ColorDrawable(0));
        showAtLocation(this.f13230e, 0, 0, 0);
    }
}
