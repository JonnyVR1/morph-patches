package p149l;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.photoalbum.FeedMomentDetailToolBarView;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public class zdh implements udh {
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Boolean m218162o(Act act) {
        Iterator it = vwb.m200339n(xdl0.m208399s(act.toolbar()), new w9j() { // from class: l.ydh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) instanceof ActionMenuItemView);
            }
        }).iterator();
        while (it.hasNext()) {
            act.getAppTheme().mo103048j((TextView) ((View) it.next()));
        }
        return Boolean.TRUE;
    }

    @Override // p149l.udh
    /* JADX INFO: renamed from: a */
    public void mo193129a(Act act, TextView textView, boolean z) {
        textView.setTextColor(-1);
    }

    @Override // p149l.udh
    /* JADX INFO: renamed from: b */
    public Drawable mo193130b(Act act) {
        return act.getAppTheme().mo103044c();
    }

    @Override // p149l.udh
    /* JADX INFO: renamed from: c */
    public void mo193131c(Act act, TextView textView) {
        mji0.m154821o(textView, a8c0.f68032u);
    }

    @Override // p149l.udh
    /* JADX INFO: renamed from: d */
    public void mo193132d(TextView textView, boolean z) {
        int i;
        if (z) {
            i = u2h.m191499h() ? f3c0.f94406Q3 : f3c0.f94399P3;
        } else {
            i = f3c0.f94413R3;
        }
        textView.setBackgroundResource(i);
    }

    @Override // p149l.udh
    /* JADX INFO: renamed from: e */
    public TextView mo193133e(Act act, MenuItem menuItem, e30<TextView> e30Var) {
        return (TextView) menuItem.getActionView().findViewById(b5c0.f73477E1);
    }

    @Override // p149l.udh
    /* JADX INFO: renamed from: f */
    public MenuItem mo193134f(Act act, Menu menu) {
        MenuItem menuItemAdd = menu.add(act.getString(R$string.f38995W1));
        menuItemAdd.setActionView(o6c0.f142238m1);
        menuItemAdd.setShowAsAction(2);
        return menuItemAdd;
    }

    @Override // p149l.udh
    /* JADX INFO: renamed from: g */
    public void mo193135g(FeedMomentDetailToolBarView feedMomentDetailToolBarView) {
        feedMomentDetailToolBarView.f40888g.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        feedMomentDetailToolBarView.f40888g.setImageResource(f3c0.f94522g1);
        feedMomentDetailToolBarView.f40883b.setTextColor(feedMomentDetailToolBarView.m63126b().getAppTheme().mo103046f());
        feedMomentDetailToolBarView.f40886e.setTextColor(feedMomentDetailToolBarView.m63126b().getAppTheme().mo103046f());
        feedMomentDetailToolBarView.f40885d.getHierarchy().m112069p().m8263q(0.0f);
    }

    @Override // p149l.udh
    /* JADX INFO: renamed from: i */
    public boolean mo193137i() {
        return false;
    }

    @Override // p149l.udh
    /* JADX INFO: renamed from: j */
    public Drawable mo193138j(Act act) {
        return act.getAppTheme().mo103044c();
    }

    @Override // p149l.udh
    /* JADX INFO: renamed from: k */
    public void mo193139k(Act act, MenuItem menuItem, TextView textView, final d30 d30Var) {
        xdl0.m208329E0(textView, new View.OnClickListener() { // from class: l.wdh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    @Override // p149l.udh
    /* JADX INFO: renamed from: l */
    public void mo193140l(final Act act) {
        xdl0.m208366b0(act.findViewById(R.id.content), new v9j() { // from class: l.xdh
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return zdh.m218162o(act);
            }
        });
        act.pendChangeActionButtonTypeface();
    }

    @Override // p149l.udh
    /* JADX INFO: renamed from: m */
    public void mo193141m(Act act, TextView textView) {
        mji0.m154821o(textView, a8c0.f68033v);
    }

    @Override // p149l.udh
    /* JADX INFO: renamed from: n */
    public int mo193142n(Act act) {
        return f3c0.f94481b0;
    }

    @Override // p149l.udh
    /* JADX INFO: renamed from: h */
    public void mo193136h(Context context, Toolbar toolbar) {
    }
}
