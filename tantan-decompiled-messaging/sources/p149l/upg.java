package p149l;

import android.graphics.Point;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.material.badge.BadgeDrawable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedAttitudeTipsView;

/* JADX INFO: loaded from: classes12.dex */
public class upg {

    /* JADX INFO: renamed from: a */
    public final Act f177616a;

    /* JADX INFO: renamed from: b */
    public Point f177617b;

    /* JADX INFO: renamed from: c */
    public PopupWindow f177618c;

    /* JADX INFO: renamed from: d */
    public Moment f177619d;

    /* JADX INFO: renamed from: e */
    public String f177620e;

    public upg(Act act, Point point, Moment moment, String str) {
        this.f177616a = act;
        this.f177617b = point;
        this.f177619d = moment;
        this.f177620e = str;
    }

    /* JADX INFO: renamed from: a */
    public void m194876a(View view) {
        if (this.f177616a.isFinishing()) {
            return;
        }
        m194877b();
        FeedAttitudeTipsView feedAttitudeTipsView = new FeedAttitudeTipsView(this.f177616a);
        feedAttitudeTipsView.m64549k(this.f177619d, this.f177620e, new d30() { // from class: l.tpg
            @Override // p149l.d30
            public final void call() {
                this.f171472a.m194877b();
            }
        });
        PopupWindow popupWindow = new PopupWindow(feedAttitudeTipsView, -2, -2);
        this.f177618c = popupWindow;
        popupWindow.setOutsideTouchable(true);
        this.f177618c.setAnimationStyle(a8c0.f68023l);
        if (this.f177616a.isFinishing() || this.f177616a.isDestroyed()) {
            return;
        }
        view.getLocationOnScreen(new int[2]);
        feedAttitudeTipsView.m64550l();
        PopupWindow popupWindow2 = this.f177618c;
        Point point = this.f177617b;
        popupWindow2.showAtLocation(view, BadgeDrawable.TOP_START, point.x, point.y);
    }

    /* JADX INFO: renamed from: b */
    public void m194877b() {
        PopupWindow popupWindow = this.f177618c;
        if (popupWindow != null) {
            if (popupWindow.isShowing()) {
                this.f177618c.dismiss();
            }
            this.f177618c = null;
        }
    }
}
