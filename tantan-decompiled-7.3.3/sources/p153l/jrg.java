package p153l;

import android.graphics.Point;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.material.badge.BadgeDrawable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedAttitudeTipsView;

/* JADX INFO: loaded from: classes13.dex */
public class jrg {

    /* JADX INFO: renamed from: a */
    public final Act f122345a;

    /* JADX INFO: renamed from: b */
    public Point f122346b;

    /* JADX INFO: renamed from: c */
    public PopupWindow f122347c;

    /* JADX INFO: renamed from: d */
    public Moment f122348d;

    /* JADX INFO: renamed from: e */
    public String f122349e;

    public jrg(Act act, Point point, Moment moment, String str) {
        this.f122345a = act;
        this.f122346b = point;
        this.f122348d = moment;
        this.f122349e = str;
    }

    /* JADX INFO: renamed from: a */
    public void m146735a(View view) {
        if (this.f122345a.isFinishing()) {
            return;
        }
        m146736b();
        FeedAttitudeTipsView feedAttitudeTipsView = new FeedAttitudeTipsView(this.f122345a);
        feedAttitudeTipsView.m65732k(this.f122348d, this.f122349e, new x20() { // from class: l.irg
            @Override // p153l.x20
            public final void call() {
                this.f116558a.m146736b();
            }
        });
        PopupWindow popupWindow = new PopupWindow(feedAttitudeTipsView, -2, -2);
        this.f122347c = popupWindow;
        popupWindow.setOutsideTouchable(true);
        this.f122347c.setAnimationStyle(fgc0.f98909l);
        if (this.f122345a.isFinishing() || this.f122345a.isDestroyed()) {
            return;
        }
        view.getLocationOnScreen(new int[2]);
        feedAttitudeTipsView.m65733l();
        PopupWindow popupWindow2 = this.f122347c;
        Point point = this.f122346b;
        popupWindow2.showAtLocation(view, BadgeDrawable.TOP_START, point.x, point.y);
    }

    /* JADX INFO: renamed from: b */
    public void m146736b() {
        PopupWindow popupWindow = this.f122347c;
        if (popupWindow != null) {
            if (popupWindow.isShowing()) {
                this.f122347c.dismiss();
            }
            this.f122347c = null;
        }
    }
}
