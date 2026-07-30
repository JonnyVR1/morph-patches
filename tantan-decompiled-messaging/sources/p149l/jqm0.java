package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import java.util.List;
import p147v.VPager;

/* JADX INFO: loaded from: classes5.dex */
public class jqm0 implements s7m<gqm0> {

    /* JADX INFO: renamed from: a */
    public View f119297a;

    /* JADX INFO: renamed from: b */
    public TabLayout f119298b;

    /* JADX INFO: renamed from: c */
    public VPager f119299c;

    /* JADX INFO: renamed from: d */
    public byr f119300d;

    /* JADX INFO: renamed from: e */
    public gqm0 f119301e;

    /* JADX INFO: renamed from: f */
    public List<View> f119302f;

    /* JADX INFO: renamed from: g */
    public List<String> f119303g;

    public jqm0(List<String> list, List<View> list2) {
        this.f119303g = list;
        this.f119302f = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m142817j(String str) {
        TabLayout tabLayout = this.f119298b;
        tabLayout.addTab(tabLayout.newTab());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m142818k(View view) {
        this.f119300d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m142819l(int i) {
        this.f119301e.m127619S3(i);
    }

    /* JADX INFO: renamed from: r */
    private void m142820r() {
        vwb.m200354z(this.f119303g, new e30() { // from class: l.iqm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114528a.m142817j((String) obj);
            }
        });
        this.f119299c.setAdapter(new o6o0(this.f119302f));
        this.f119298b.addOnTabSelectedListener(new C17846a());
        this.f119298b.setupWithViewPager(this.f119299c);
        for (int i = 0; i < this.f119303g.size(); i++) {
            this.f119298b.getTabAt(i).setText(this.f119303g.get(i));
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f119301e.act();
    }

    /* JADX INFO: renamed from: d */
    public View m142821d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kqm0.m146952b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(gqm0 gqm0Var) {
        this.f119301e = gqm0Var;
    }

    /* JADX INFO: renamed from: f */
    public boolean m142823f() {
        return this.f119300d != null;
    }

    /* JADX INFO: renamed from: i */
    public int m142824i() {
        return this.f119298b.getSelectedTabPosition();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public void m142825m(int i) {
        if (i >= this.f119298b.getTabCount() || i < 0) {
            return;
        }
        this.f119298b.getTabAt(i).select();
    }

    /* JADX INFO: renamed from: n */
    public void m142826n(int i, String str) {
        this.f119298b.getTabAt(i).setText(str);
    }

    /* JADX INFO: renamed from: p */
    public void m142827p() {
        if (this.f119300d == null) {
            byr byrVar = new byr(this.f119301e, m142821d(act().inflater(), null));
            this.f119300d = byrVar;
            byrVar.m71778j0(LiveDialogEnum.VOICE_CALL_ALL_LIST_DIALOG);
            this.f119297a.setOnClickListener(new View.OnClickListener() { // from class: l.hqm0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f109070a.m142818k(view);
                }
            });
            m142820r();
        }
        this.f119300d.show();
    }

    /* JADX INFO: renamed from: l.jqm0$a */
    public class C17846a implements TabLayout.BaseOnTabSelectedListener {
        public C17846a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            jqm0.this.m142819l(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
