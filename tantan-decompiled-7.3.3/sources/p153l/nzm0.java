package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import java.util.List;
import p151v.VPager;

/* JADX INFO: loaded from: classes5.dex */
public class nzm0 implements iam<kzm0> {

    /* JADX INFO: renamed from: a */
    public View f144453a;

    /* JADX INFO: renamed from: b */
    public TabLayout f144454b;

    /* JADX INFO: renamed from: c */
    public VPager f144455c;

    /* JADX INFO: renamed from: d */
    public c0s f144456d;

    /* JADX INFO: renamed from: e */
    public kzm0 f144457e;

    /* JADX INFO: renamed from: f */
    public List<View> f144458f;

    /* JADX INFO: renamed from: g */
    public List<String> f144459g;

    public nzm0(List<String> list, List<View> list2) {
        this.f144459g = list;
        this.f144458f = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m165379j(String str) {
        TabLayout tabLayout = this.f144454b;
        tabLayout.addTab(tabLayout.newTab());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m165380k(View view) {
        this.f144456d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m165381l(int i) {
        this.f144457e.m152209S3(i);
    }

    /* JADX INFO: renamed from: r */
    private void m165382r() {
        jyb.m147537z(this.f144459g, new y20() { // from class: l.mzm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139535a.m165379j((String) obj);
            }
        });
        this.f144455c.setAdapter(new sfo0(this.f144458f));
        this.f144454b.addOnTabSelectedListener(new C18997a());
        this.f144454b.setupWithViewPager(this.f144455c);
        for (int i = 0; i < this.f144459g.size(); i++) {
            this.f144454b.getTabAt(i).setText(this.f144459g.get(i));
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f144457e.act();
    }

    /* JADX INFO: renamed from: d */
    public View m165383d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ozm0.m169987b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(kzm0 kzm0Var) {
        this.f144457e = kzm0Var;
    }

    /* JADX INFO: renamed from: f */
    public boolean m165385f() {
        return this.f144456d != null;
    }

    /* JADX INFO: renamed from: i */
    public int m165386i() {
        return this.f144454b.getSelectedTabPosition();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public void m165387m(int i) {
        if (i >= this.f144454b.getTabCount() || i < 0) {
            return;
        }
        this.f144454b.getTabAt(i).select();
    }

    /* JADX INFO: renamed from: n */
    public void m165388n(int i, String str) {
        this.f144454b.getTabAt(i).setText(str);
    }

    /* JADX INFO: renamed from: p */
    public void m165389p() {
        if (this.f144456d == null) {
            c0s c0sVar = new c0s(this.f144457e, m165383d(act().inflater(), null));
            this.f144456d = c0sVar;
            c0sVar.m72961j0(LiveDialogEnum.VOICE_CALL_ALL_LIST_DIALOG);
            this.f144453a.setOnClickListener(new View.OnClickListener() { // from class: l.lzm0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f134237a.m165380k(view);
                }
            });
            m165382r();
        }
        this.f144456d.show();
    }

    /* JADX INFO: renamed from: l.nzm0$a */
    public class C18997a implements TabLayout.BaseOnTabSelectedListener {
        public C18997a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            nzm0.this.m165381l(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
