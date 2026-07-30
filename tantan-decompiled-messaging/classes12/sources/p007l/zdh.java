package p007l;

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
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.photoalbum.FeedMomentDetailToolBarView;
import com.p1.mobile.android.app.Act;
import java.util.Iterator;
import l.d30;
import l.e30;
import l.mji0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class zdh implements udh {
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Boolean m17302o(Act act) {
        Iterator it = vwb.n(xdl0.s(act.toolbar()), new w9j() { // from class: l.ydh
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) instanceof ActionMenuItemView);
            }
        }).iterator();
        while (it.hasNext()) {
            act.getAppTheme().j((TextView) ((View) it.next()));
        }
        return Boolean.TRUE;
    }

    @Override // p007l.udh
    /* JADX INFO: renamed from: a */
    public void mo15074a(Act act, TextView textView, boolean z) {
        textView.setTextColor(-1);
    }

    @Override // p007l.udh
    /* JADX INFO: renamed from: b */
    public Drawable mo15075b(Act act) {
        return act.getAppTheme().c();
    }

    @Override // p007l.udh
    /* JADX INFO: renamed from: c */
    public void mo15076c(Act act, TextView textView) {
        mji0.o(textView, a8c0.f5652u);
    }

    @Override // p007l.udh
    /* JADX INFO: renamed from: d */
    public void mo15077d(TextView textView, boolean z) {
        int i;
        if (z) {
            i = u2h.m14723h() ? f3c0.f7689Q3 : f3c0.f7682P3;
        } else {
            i = f3c0.f7696R3;
        }
        textView.setBackgroundResource(i);
    }

    @Override // p007l.udh
    /* JADX INFO: renamed from: e */
    public TextView mo15078e(Act act, MenuItem menuItem, e30<TextView> e30Var) {
        return (TextView) menuItem.getActionView().findViewById(b5c0.f5958E1);
    }

    @Override // p007l.udh
    /* JADX INFO: renamed from: f */
    public MenuItem mo15079f(Act act, Menu menu) {
        MenuItem menuItemAdd = menu.add(act.getString(R$string.f456W1));
        menuItemAdd.setActionView(o6c0.f11257m1);
        menuItemAdd.setShowAsAction(2);
        return menuItemAdd;
    }

    @Override // p007l.udh
    /* JADX INFO: renamed from: g */
    public void mo15080g(FeedMomentDetailToolBarView feedMomentDetailToolBarView) {
        feedMomentDetailToolBarView.f2349g.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        feedMomentDetailToolBarView.f2349g.setImageResource(f3c0.f7805g1);
        feedMomentDetailToolBarView.f2344b.setTextColor(feedMomentDetailToolBarView.m4142b().getAppTheme().f());
        feedMomentDetailToolBarView.f2347e.setTextColor(feedMomentDetailToolBarView.m4142b().getAppTheme().f());
        feedMomentDetailToolBarView.f2346d.getHierarchy().p().q(0.0f);
    }

    @Override // p007l.udh
    /* JADX INFO: renamed from: i */
    public boolean mo15082i() {
        return false;
    }

    @Override // p007l.udh
    /* JADX INFO: renamed from: j */
    public Drawable mo15083j(Act act) {
        return act.getAppTheme().c();
    }

    @Override // p007l.udh
    /* JADX INFO: renamed from: k */
    public void mo15084k(Act act, MenuItem menuItem, TextView textView, final d30 d30Var) {
        xdl0.E0(textView, new View.OnClickListener() { // from class: l.wdh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    @Override // p007l.udh
    /* JADX INFO: renamed from: l */
    public void mo15085l(final Act act) {
        xdl0.b0(act.findViewById(R.id.content), new v9j() { // from class: l.xdh
            public final Object call() {
                return zdh.m17302o(act);
            }
        });
        act.pendChangeActionButtonTypeface();
    }

    @Override // p007l.udh
    /* JADX INFO: renamed from: m */
    public void mo15086m(Act act, TextView textView) {
        mji0.o(textView, a8c0.f5653v);
    }

    @Override // p007l.udh
    /* JADX INFO: renamed from: n */
    public int mo15087n(Act act) {
        return f3c0.f7764b0;
    }

    @Override // p007l.udh
    /* JADX INFO: renamed from: h */
    public void mo15081h(Context context, Toolbar toolbar) {
    }
}
