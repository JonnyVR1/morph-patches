package p007l;

import android.graphics.Point;
import android.view.View;
import android.widget.PopupWindow;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedClipBoardTipsView;
import com.p1.mobile.android.app.Act;
import l.d30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class mug {

    /* JADX INFO: renamed from: b */
    public static volatile mug f10576b;

    /* JADX INFO: renamed from: a */
    public PopupWindow f10577a;

    /* JADX INFO: renamed from: a */
    public static mug m12035a() {
        if (f10576b == null) {
            synchronized (mug.class) {
                try {
                    if (f10576b == null) {
                        f10576b = new mug();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10576b;
    }

    /* JADX INFO: renamed from: b */
    public void m12036b(Act act, Point point, View view, String str, boolean z) {
        if (act.isFinishing()) {
            return;
        }
        m12037c();
        FeedClipBoardTipsView feedClipBoardTipsView = new FeedClipBoardTipsView(act);
        feedClipBoardTipsView.m6197f(str, z, new d30() { // from class: l.lug
            public final void call() {
                this.f10135a.m12037c();
            }
        });
        PopupWindow popupWindow = new PopupWindow(feedClipBoardTipsView, -2, -2);
        this.f10577a = popupWindow;
        popupWindow.setOutsideTouchable(true);
        this.f10577a.setAnimationStyle(a8c0.f5643l);
        if (act.isFinishing() || act.isDestroyed()) {
            return;
        }
        view.getLocationOnScreen(new int[2]);
        this.f10577a.showAtLocation(view, 8388659, point.x, point.y);
    }

    /* JADX INFO: renamed from: c */
    public void m12037c() {
        PopupWindow popupWindow = this.f10577a;
        if (popupWindow != null) {
            if (popupWindow.isShowing()) {
                this.f10577a.dismiss();
            }
            this.f10577a = null;
        }
    }
}
