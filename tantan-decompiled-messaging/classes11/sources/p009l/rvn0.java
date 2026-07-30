package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.increment.gift.view.UnScrollVPager;
import l.byr;
import l.fce;
import l.h1c0;
import l.s7m;
import l.svn0;
import l.t100;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rvn0 implements s7m<pvn0> {

    /* JADX INFO: renamed from: a */
    public View f19994a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f19995b;

    /* JADX INFO: renamed from: c */
    public VText f19996c;

    /* JADX INFO: renamed from: d */
    public View f19997d;

    /* JADX INFO: renamed from: e */
    public TabLayout f19998e;

    /* JADX INFO: renamed from: f */
    public UnScrollVPager f19999f;

    /* JADX INFO: renamed from: g */
    public pvn0 f20000g;

    /* JADX INFO: renamed from: h */
    public byr f20001h;

    /* JADX INFO: renamed from: i */
    public final TextView[] f20002i = new TextView[2];

    /* JADX INFO: renamed from: j */
    public boolean f20003j;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m21833n(View view) {
        m21842k();
    }

    /* JADX INFO: renamed from: p */
    private void m21834p() {
        xdl0.E0(this.f19994a, new View.OnClickListener() { // from class: l.qvn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19560a.m21833n(view);
            }
        });
        this.f19999f.setCurrentItem(0);
        this.f20000g.mo12293M3(0);
    }

    /* JADX INFO: renamed from: r */
    private void m21835r() {
        if (this.f20001h == null) {
            View viewM21837e = m21837e(LayoutInflater.from(this.f20000g.act()), null);
            xdl0.C0(this.f19995b, (xdl0.w0() / 3) * 2);
            this.f20001h = new byr(this.f20000g, viewM21837e);
            m21843l();
            m21844m();
            m21834p();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m21836C0() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public View m21837e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return svn0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m21840i1(pvn0 pvn0Var) {
        this.f20000g = pvn0Var;
    }

    /* JADX INFO: renamed from: i */
    public void m21839i() {
        this.f19999f.setCurrentItem(1);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m21841j(TextView textView, boolean z) {
        if (z) {
            textView.setBackground(fce.b(textView.getResources().getColor(h1c0.h1), t100.d(16.0f)));
            textView.setTextColor(textView.getResources().getColor(h1c0.p1));
        } else {
            textView.setBackground(null);
            textView.setTextColor(textView.getResources().getColor(h1c0.m1));
        }
        textView.setAllCaps(false);
    }

    /* JADX INFO: renamed from: k */
    public void m21842k() {
        byr byrVar = this.f20001h;
        if (byrVar == null || !byrVar.isShowing()) {
            return;
        }
        this.f20001h.dismiss();
        this.f20001h = null;
    }

    /* JADX INFO: renamed from: l */
    public final void m21843l() {
        this.f19999f.setAdapter(new vpp(this.f20000g.act(), this.f20000g.mo12292K3()));
        this.f19998e.setupWithViewPager(this.f19999f);
        this.f19998e.addOnTabSelectedListener(new C1185a());
    }

    /* JADX INFO: renamed from: m */
    public final void m21844m() {
        String[] strArr = {this.f20000g.act().getString(R.string.Yi), this.f20000g.act().getString(R.string.Xi)};
        int i = 0;
        while (i < this.f19998e.getTabCount()) {
            TabLayout.Tab tabAt = this.f19998e.getTabAt(i);
            if (tabAt == null) {
                tabAt = this.f19998e.newTab();
                this.f19998e.addTab(tabAt);
            }
            String str = strArr[i];
            TextView textView = new TextView(this.f20000g.act());
            textView.setTextSize(14.0f);
            textView.setHeight(t100.d(32.0f));
            textView.setWidth(-2);
            textView.setGravity(17);
            textView.setPadding(t100.d(12.0f), 0, t100.d(12.0f), 0);
            textView.setText(str);
            tabAt.setCustomView(textView);
            Object parent = textView.getParent();
            if (parent instanceof View) {
                View view = (View) parent;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                layoutParams.width = (int) (textView.getPaint().measureText(str) + t100.d(24.0f));
                view.setLayoutParams(layoutParams);
            }
            this.f20002i[i] = textView;
            m21841j(textView, i == 0);
            i++;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m21845q() {
        m21835r();
        byr byrVar = this.f20001h;
        if (byrVar == null || byrVar.isShowing()) {
            return;
        }
        this.f20001h.show();
        if (this.f20003j) {
            return;
        }
        this.f20003j = true;
    }

    /* JADX INFO: renamed from: l.rvn0$a */
    public class C1185a implements TabLayout.OnTabSelectedListener {
        public C1185a() {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            rvn0.this.f20000g.mo12293M3(tab.getPosition());
            rvn0 rvn0Var = rvn0.this;
            rvn0Var.m21841j(rvn0Var.f20002i[tab.getPosition()], true);
        }

        public void onTabUnselected(TabLayout.Tab tab) {
            rvn0 rvn0Var = rvn0.this;
            rvn0Var.m21841j(rvn0Var.f20002i[tab.getPosition()], false);
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }
    }

    public void destroy() {
    }
}
