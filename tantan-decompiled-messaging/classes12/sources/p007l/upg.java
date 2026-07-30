package p007l;

import android.graphics.Point;
import android.view.View;
import android.widget.PopupWindow;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedAttitudeTipsView;
import com.p1.mobile.android.app.Act;
import l.d30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class upg {

    /* JADX INFO: renamed from: a */
    public final Act f13906a;

    /* JADX INFO: renamed from: b */
    public Point f13907b;

    /* JADX INFO: renamed from: c */
    public PopupWindow f13908c;

    /* JADX INFO: renamed from: d */
    public Moment f13909d;

    /* JADX INFO: renamed from: e */
    public String f13910e;

    public upg(Act act, Point point, Moment moment, String str) {
        this.f13906a = act;
        this.f13907b = point;
        this.f13909d = moment;
        this.f13910e = str;
    }

    /* JADX INFO: renamed from: a */
    public void m15128a(View view) {
        if (this.f13906a.isFinishing()) {
            return;
        }
        m15129b();
        FeedAttitudeTipsView feedAttitudeTipsView = new FeedAttitudeTipsView(this.f13906a);
        feedAttitudeTipsView.m5643k(this.f13909d, this.f13910e, new d30() { // from class: l.tpg
            public final void call() {
                this.f13373a.m15129b();
            }
        });
        PopupWindow popupWindow = new PopupWindow(feedAttitudeTipsView, -2, -2);
        this.f13908c = popupWindow;
        popupWindow.setOutsideTouchable(true);
        this.f13908c.setAnimationStyle(a8c0.f5643l);
        if (this.f13906a.isFinishing() || this.f13906a.isDestroyed()) {
            return;
        }
        view.getLocationOnScreen(new int[2]);
        feedAttitudeTipsView.m5644l();
        PopupWindow popupWindow2 = this.f13908c;
        Point point = this.f13907b;
        popupWindow2.showAtLocation(view, 8388659, point.x, point.y);
    }

    /* JADX INFO: renamed from: b */
    public void m15129b() {
        PopupWindow popupWindow = this.f13908c;
        if (popupWindow != null) {
            if (popupWindow.isShowing()) {
                this.f13908c.dismiss();
            }
            this.f13908c = null;
        }
    }
}
