package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.UnScrollVPager;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class rvn0 implements s7m<pvn0> {

    /* JADX INFO: renamed from: a */
    public View f161235a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f161236b;

    /* JADX INFO: renamed from: c */
    public VText f161237c;

    /* JADX INFO: renamed from: d */
    public View f161238d;

    /* JADX INFO: renamed from: e */
    public TabLayout f161239e;

    /* JADX INFO: renamed from: f */
    public UnScrollVPager f161240f;

    /* JADX INFO: renamed from: g */
    public pvn0 f161241g;

    /* JADX INFO: renamed from: h */
    public byr f161242h;

    /* JADX INFO: renamed from: i */
    public final TextView[] f161243i = new TextView[2];

    /* JADX INFO: renamed from: j */
    public boolean f161244j;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m181315n(View view) {
        m181322k();
    }

    /* JADX INFO: renamed from: p */
    private void m181316p() {
        xdl0.m208329E0(this.f161235a, new View.OnClickListener() { // from class: l.qvn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156614a.m181315n(view);
            }
        });
        this.f161240f.setCurrentItem(0);
        this.f161241g.mo104069M3(0);
    }

    /* JADX INFO: renamed from: r */
    private void m181317r() {
        if (this.f161242h == null) {
            View viewM181318e = m181318e(LayoutInflater.from(this.f161241g.act()), null);
            xdl0.m208325C0(this.f161236b, (xdl0.m208408w0() / 3) * 2);
            this.f161242h = new byr(this.f161241g, viewM181318e);
            m181323l();
            m181324m();
            m181316p();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public View m181318e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return svn0.m186100b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(pvn0 pvn0Var) {
        this.f161241g = pvn0Var;
    }

    /* JADX INFO: renamed from: i */
    public void m181320i() {
        this.f161240f.setCurrentItem(1);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m181321j(TextView textView, boolean z) {
        if (z) {
            textView.setBackground(fce.m120425b(textView.getResources().getColor(h1c0.f105371h1), t100.m186890d(16.0f)));
            textView.setTextColor(textView.getResources().getColor(h1c0.f105395p1));
        } else {
            textView.setBackground(null);
            textView.setTextColor(textView.getResources().getColor(h1c0.f105386m1));
        }
        textView.setAllCaps(false);
    }

    /* JADX INFO: renamed from: k */
    public void m181322k() {
        byr byrVar = this.f161242h;
        if (byrVar == null || !byrVar.isShowing()) {
            return;
        }
        this.f161242h.dismiss();
        this.f161242h = null;
    }

    /* JADX INFO: renamed from: l */
    public final void m181323l() {
        this.f161240f.setAdapter(new vpp(this.f161241g.act(), this.f161241g.mo104068K3()));
        this.f161239e.setupWithViewPager(this.f161240f);
        this.f161239e.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C19799a());
    }

    /* JADX INFO: renamed from: m */
    public final void m181324m() {
        String[] strArr = {this.f161241g.act().getString(R$string.f47090Yi), this.f161241g.act().getString(R$string.f47069Xi)};
        int i = 0;
        while (i < this.f161239e.getTabCount()) {
            TabLayout.Tab tabAt = this.f161239e.getTabAt(i);
            if (tabAt == null) {
                tabAt = this.f161239e.newTab();
                this.f161239e.addTab(tabAt);
            }
            String str = strArr[i];
            TextView textView = new TextView(this.f161241g.act());
            textView.setTextSize(14.0f);
            textView.setHeight(t100.m186890d(32.0f));
            textView.setWidth(-2);
            textView.setGravity(17);
            textView.setPadding(t100.m186890d(12.0f), 0, t100.m186890d(12.0f), 0);
            textView.setText(str);
            tabAt.setCustomView(textView);
            Object parent = textView.getParent();
            if (parent instanceof View) {
                View view = (View) parent;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                layoutParams.width = (int) (textView.getPaint().measureText(str) + t100.m186890d(24.0f));
                view.setLayoutParams(layoutParams);
            }
            this.f161243i[i] = textView;
            m181321j(textView, i == 0);
            i++;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m181325q() {
        m181317r();
        byr byrVar = this.f161242h;
        if (byrVar == null || byrVar.isShowing()) {
            return;
        }
        this.f161242h.show();
        if (this.f161244j) {
            return;
        }
        this.f161244j = true;
    }

    /* JADX INFO: renamed from: l.rvn0$a */
    public class C19799a implements TabLayout.OnTabSelectedListener {
        public C19799a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            rvn0.this.f161241g.mo104069M3(tab.getPosition());
            rvn0 rvn0Var = rvn0.this;
            rvn0Var.m181321j(rvn0Var.f161243i[tab.getPosition()], true);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            rvn0 rvn0Var = rvn0.this;
            rvn0Var.m181321j(rvn0Var.f161243i[tab.getPosition()], false);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
