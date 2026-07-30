package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.photoalbum.FeedMomentDetailToolBarView;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class ofh implements jfh {
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Boolean m167451o(Act act) {
        Iterator it = jyb.m147522n(bnl0.m105579s(act.toolbar()), new qcj() { // from class: l.nfh
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) instanceof ActionMenuItemView);
            }
        }).iterator();
        while (it.hasNext()) {
            act.getAppTheme().mo134830j((TextView) ((View) it.next()));
        }
        return Boolean.TRUE;
    }

    @Override // p153l.jfh
    /* JADX INFO: renamed from: a */
    public void mo144666a(Act act, TextView textView, boolean z) {
        textView.setTextColor(-1);
    }

    @Override // p153l.jfh
    /* JADX INFO: renamed from: b */
    public Drawable mo144667b(Act act) {
        return act.getAppTheme().mo134823c();
    }

    @Override // p153l.jfh
    /* JADX INFO: renamed from: c */
    public void mo144668c(Act act, TextView textView) {
        msi0.m159817o(textView, fgc0.f98918u);
    }

    @Override // p153l.jfh
    /* JADX INFO: renamed from: d */
    public void mo144669d(TextView textView, boolean z) {
        int i;
        if (z) {
            i = j4h.m143424h() ? lbc0.f130924Q3 : lbc0.f130917P3;
        } else {
            i = lbc0.f130931R3;
        }
        textView.setBackgroundResource(i);
    }

    @Override // p153l.jfh
    /* JADX INFO: renamed from: e */
    public TextView mo144670e(Act act, MenuItem menuItem, y20<TextView> y20Var) {
        return (TextView) menuItem.getActionView().findViewById(hdc0.f108830E1);
    }

    @Override // p153l.jfh
    /* JADX INFO: renamed from: f */
    public MenuItem mo144671f(Act act, Menu menu) {
        MenuItem menuItemAdd = menu.add(act.getString(R$string.f39843W1));
        menuItemAdd.setActionView(tec0.f173707m1);
        menuItemAdd.setShowAsAction(2);
        return menuItemAdd;
    }

    @Override // p153l.jfh
    /* JADX INFO: renamed from: g */
    public void mo144672g(FeedMomentDetailToolBarView feedMomentDetailToolBarView) {
        feedMomentDetailToolBarView.f41736g.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        feedMomentDetailToolBarView.f41736g.setImageResource(lbc0.f131040g1);
        feedMomentDetailToolBarView.f41731b.setTextColor(feedMomentDetailToolBarView.m64309b().getAppTheme().mo134826f());
        feedMomentDetailToolBarView.f41734e.setTextColor(feedMomentDetailToolBarView.m64309b().getAppTheme().mo134826f());
        feedMomentDetailToolBarView.f41733d.getHierarchy().m207055p().m8317q(0.0f);
    }

    @Override // p153l.jfh
    /* JADX INFO: renamed from: i */
    public boolean mo144674i() {
        return false;
    }

    @Override // p153l.jfh
    /* JADX INFO: renamed from: j */
    public Drawable mo144675j(Act act) {
        return act.getAppTheme().mo134823c();
    }

    @Override // p153l.jfh
    /* JADX INFO: renamed from: k */
    public void mo144676k(Act act, MenuItem menuItem, TextView textView, final x20 x20Var) {
        bnl0.m105509E0(textView, new View.OnClickListener() { // from class: l.lfh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
    }

    @Override // p153l.jfh
    /* JADX INFO: renamed from: l */
    public void mo144677l(final Act act) {
        bnl0.m105546b0(act.findViewById(R.id.content), new pcj() { // from class: l.mfh
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return ofh.m167451o(act);
            }
        });
        act.pendChangeActionButtonTypeface();
    }

    @Override // p153l.jfh
    /* JADX INFO: renamed from: m */
    public void mo144678m(Act act, TextView textView) {
        msi0.m159817o(textView, fgc0.f98919v);
    }

    @Override // p153l.jfh
    /* JADX INFO: renamed from: n */
    public int mo144679n(Act act) {
        return lbc0.f130999b0;
    }

    @Override // p153l.jfh
    /* JADX INFO: renamed from: h */
    public void mo144673h(Context context, Toolbar toolbar) {
    }
}
