package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.UnScrollVPager;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class v4o0 implements iam<t4o0> {

    /* JADX INFO: renamed from: a */
    public View f182403a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f182404b;

    /* JADX INFO: renamed from: c */
    public VText f182405c;

    /* JADX INFO: renamed from: d */
    public View f182406d;

    /* JADX INFO: renamed from: e */
    public TabLayout f182407e;

    /* JADX INFO: renamed from: f */
    public UnScrollVPager f182408f;

    /* JADX INFO: renamed from: g */
    public t4o0 f182409g;

    /* JADX INFO: renamed from: h */
    public c0s f182410h;

    /* JADX INFO: renamed from: i */
    public final TextView[] f182411i = new TextView[2];

    /* JADX INFO: renamed from: j */
    public boolean f182412j;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m199723n(View view) {
        m199730k();
    }

    /* JADX INFO: renamed from: p */
    private void m199724p() {
        bnl0.m105509E0(this.f182403a, new View.OnClickListener() { // from class: l.u4o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177479a.m199723n(view);
            }
        });
        this.f182408f.setCurrentItem(0);
        this.f182409g.mo124021M3(0);
    }

    /* JADX INFO: renamed from: r */
    private void m199725r() {
        if (this.f182410h == null) {
            View viewM199726e = m199726e(LayoutInflater.from(this.f182409g.act()), null);
            bnl0.m105505C0(this.f182404b, (bnl0.m105588w0() / 3) * 2);
            this.f182410h = new c0s(this.f182409g, viewM199726e);
            m199731l();
            m199732m();
            m199724p();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public View m199726e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return w4o0.m204902b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(t4o0 t4o0Var) {
        this.f182409g = t4o0Var;
    }

    /* JADX INFO: renamed from: i */
    public void m199728i() {
        this.f182408f.setCurrentItem(1);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m199729j(TextView textView, boolean z) {
        if (z) {
            textView.setBackground(jde.m144406b(textView.getResources().getColor(n9c0.f140832h1), qa00.m175859d(16.0f)));
            textView.setTextColor(textView.getResources().getColor(n9c0.f140856p1));
        } else {
            textView.setBackground(null);
            textView.setTextColor(textView.getResources().getColor(n9c0.f140847m1));
        }
        textView.setAllCaps(false);
    }

    /* JADX INFO: renamed from: k */
    public void m199730k() {
        c0s c0sVar = this.f182410h;
        if (c0sVar == null || !c0sVar.isShowing()) {
            return;
        }
        this.f182410h.dismiss();
        this.f182410h = null;
    }

    /* JADX INFO: renamed from: l */
    public final void m199731l() {
        this.f182408f.setAdapter(new vrp(this.f182409g.act(), this.f182409g.mo124020K3()));
        this.f182407e.setupWithViewPager(this.f182408f);
        this.f182407e.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C20757a());
    }

    /* JADX INFO: renamed from: m */
    public final void m199732m() {
        String[] strArr = {this.f182409g.act().getString(R$string.f47938Yi), this.f182409g.act().getString(R$string.f47917Xi)};
        int i = 0;
        while (i < this.f182407e.getTabCount()) {
            TabLayout.Tab tabAt = this.f182407e.getTabAt(i);
            if (tabAt == null) {
                tabAt = this.f182407e.newTab();
                this.f182407e.addTab(tabAt);
            }
            String str = strArr[i];
            TextView textView = new TextView(this.f182409g.act());
            textView.setTextSize(14.0f);
            textView.setHeight(qa00.m175859d(32.0f));
            textView.setWidth(-2);
            textView.setGravity(17);
            textView.setPadding(qa00.m175859d(12.0f), 0, qa00.m175859d(12.0f), 0);
            textView.setText(str);
            tabAt.setCustomView(textView);
            Object parent = textView.getParent();
            if (parent instanceof View) {
                View view = (View) parent;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                layoutParams.width = (int) (textView.getPaint().measureText(str) + qa00.m175859d(24.0f));
                view.setLayoutParams(layoutParams);
            }
            this.f182411i[i] = textView;
            m199729j(textView, i == 0);
            i++;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m199733q() {
        m199725r();
        c0s c0sVar = this.f182410h;
        if (c0sVar == null || c0sVar.isShowing()) {
            return;
        }
        this.f182410h.show();
        if (this.f182412j) {
            return;
        }
        this.f182412j = true;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.v4o0$a */
    public class C20757a implements TabLayout.OnTabSelectedListener {
        public C20757a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            v4o0.this.f182409g.mo124021M3(tab.getPosition());
            v4o0 v4o0Var = v4o0.this;
            v4o0Var.m199729j(v4o0Var.f182411i[tab.getPosition()], true);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            v4o0 v4o0Var = v4o0.this;
            v4o0Var.m199729j(v4o0Var.f182411i[tab.getPosition()], false);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }
}
