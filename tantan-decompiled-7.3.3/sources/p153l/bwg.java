package p153l;

import android.graphics.Point;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.material.badge.BadgeDrawable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedClipBoardTipsView;

/* JADX INFO: loaded from: classes13.dex */
public class bwg {

    /* JADX INFO: renamed from: b */
    public static volatile bwg f78727b;

    /* JADX INFO: renamed from: a */
    public PopupWindow f78728a;

    /* JADX INFO: renamed from: a */
    public static bwg m106691a() {
        if (f78727b == null) {
            synchronized (bwg.class) {
                try {
                    if (f78727b == null) {
                        f78727b = new bwg();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f78727b;
    }

    /* JADX INFO: renamed from: b */
    public void m106692b(Act act, Point point, View view, String str, boolean z) {
        if (act.isFinishing()) {
            return;
        }
        m106693c();
        FeedClipBoardTipsView feedClipBoardTipsView = new FeedClipBoardTipsView(act);
        feedClipBoardTipsView.m66279f(str, z, new x20() { // from class: l.awg
            @Override // p153l.x20
            public final void call() {
                this.f73728a.m106693c();
            }
        });
        PopupWindow popupWindow = new PopupWindow(feedClipBoardTipsView, -2, -2);
        this.f78728a = popupWindow;
        popupWindow.setOutsideTouchable(true);
        this.f78728a.setAnimationStyle(fgc0.f98909l);
        if (act.isFinishing() || act.isDestroyed()) {
            return;
        }
        view.getLocationOnScreen(new int[2]);
        this.f78728a.showAtLocation(view, BadgeDrawable.TOP_START, point.x, point.y);
    }

    /* JADX INFO: renamed from: c */
    public void m106693c() {
        PopupWindow popupWindow = this.f78728a;
        if (popupWindow != null) {
            if (popupWindow.isShowing()) {
                this.f78728a.dismiss();
            }
            this.f78728a = null;
        }
    }
}
