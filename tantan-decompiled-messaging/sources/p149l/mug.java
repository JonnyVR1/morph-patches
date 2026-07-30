package p149l;

import android.graphics.Point;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.material.badge.BadgeDrawable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedClipBoardTipsView;

/* JADX INFO: loaded from: classes12.dex */
public class mug {

    /* JADX INFO: renamed from: b */
    public static volatile mug f135783b;

    /* JADX INFO: renamed from: a */
    public PopupWindow f135784a;

    /* JADX INFO: renamed from: a */
    public static mug m156390a() {
        if (f135783b == null) {
            synchronized (mug.class) {
                try {
                    if (f135783b == null) {
                        f135783b = new mug();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f135783b;
    }

    /* JADX INFO: renamed from: b */
    public void m156391b(Act act, Point point, View view, String str, boolean z) {
        if (act.isFinishing()) {
            return;
        }
        m156392c();
        FeedClipBoardTipsView feedClipBoardTipsView = new FeedClipBoardTipsView(act);
        feedClipBoardTipsView.m65096f(str, z, new d30() { // from class: l.lug
            @Override // p149l.d30
            public final void call() {
                this.f130057a.m156392c();
            }
        });
        PopupWindow popupWindow = new PopupWindow(feedClipBoardTipsView, -2, -2);
        this.f135784a = popupWindow;
        popupWindow.setOutsideTouchable(true);
        this.f135784a.setAnimationStyle(a8c0.f68023l);
        if (act.isFinishing() || act.isDestroyed()) {
            return;
        }
        view.getLocationOnScreen(new int[2]);
        this.f135784a.showAtLocation(view, BadgeDrawable.TOP_START, point.x, point.y);
    }

    /* JADX INFO: renamed from: c */
    public void m156392c() {
        PopupWindow popupWindow = this.f135784a;
        if (popupWindow != null) {
            if (popupWindow.isShowing()) {
                this.f135784a.dismiss();
            }
            this.f135784a = null;
        }
    }
}
