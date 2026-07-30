package p153l;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlMedalWall;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlMedalWallItem;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.medalwall.view.VoiceMedalWallListView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class k3o0 implements iam<f3o0> {

    /* JADX INFO: renamed from: a */
    public View f123730a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f123731b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f123732c;

    /* JADX INFO: renamed from: d */
    public ImageView f123733d;

    /* JADX INFO: renamed from: e */
    public VLinear f123734e;

    /* JADX INFO: renamed from: f */
    public VText f123735f;

    /* JADX INFO: renamed from: g */
    public VText f123736g;

    /* JADX INFO: renamed from: h */
    public VText f123737h;

    /* JADX INFO: renamed from: i */
    public TabLayout f123738i;

    /* JADX INFO: renamed from: j */
    public View f123739j;

    /* JADX INFO: renamed from: k */
    public ViewPager f123740k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f123741l;

    /* JADX INFO: renamed from: m */
    public f3o0 f123742m;

    /* JADX INFO: renamed from: n */
    public Dialog f123743n;

    /* JADX INFO: renamed from: o */
    public final List<String> f123744o = new ArrayList();

    /* JADX INFO: renamed from: p */
    public final List<View> f123745p = new ArrayList();

    /* JADX INFO: renamed from: q */
    public final List<VoiceMedalWallListView> f123746q = new ArrayList();

    /* JADX INFO: renamed from: r */
    public BLiveIntlMedalWall f123747r;

    /* JADX INFO: renamed from: B */
    private void m148117B() {
        bnl0.m105509E0(this.f123730a, new View.OnClickListener() { // from class: l.h3o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107679a.m148130x(view);
            }
        });
        bnl0.m105509E0(this.f123733d, new View.OnClickListener() { // from class: l.i3o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112771a.m148131y(view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    private void m148124l(String str) {
        VoiceMedalWallListView voiceMedalWallListView = new VoiceMedalWallListView(this.f123742m.act(), !xau.m209910t(R$string.f48067eh).equals(str) ? 1 : 0);
        int i = bnl0.f77544e;
        voiceMedalWallListView.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        voiceMedalWallListView.setItemClickAction(new y20() { // from class: l.j3o0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118203a.m148139v((BLiveIntlMedalWallItem) obj);
            }
        });
        this.f123746q.add(voiceMedalWallListView);
    }

    /* JADX INFO: renamed from: m */
    private void m148125m(String str) {
        TextView textView = new TextView(this.f123742m.act());
        textView.setText(str);
        textView.setLayoutParams(new LinearLayout.LayoutParams(bnl0.f77545f, qa00.m175859d(36.0f)));
        bnl0.m105569n(textView, qa00.m175859d(12.0f), 0, qa00.m175859d(12.0f), 0);
        textView.setGravity(17);
        textView.setTextSize(14.0f);
        this.f123745p.add(textView);
    }

    /* JADX INFO: renamed from: n */
    private void m148126n() {
        this.f123745p.clear();
        this.f123746q.clear();
        this.f123738i.removeAllTabs();
        this.f123744o.clear();
        this.f123744o.add(xau.m209910t(R$string.f48067eh));
        this.f123744o.add(xau.m209910t(R$string.f48220lh));
        jyb.m147537z(this.f123744o, new y20() { // from class: l.g3o0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102013a.m148140w((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public void m148127q(TabLayout.Tab tab) {
        int position = tab.getPosition();
        if (position >= 0 && position < this.f123746q.size()) {
            m148137k(tab);
        }
        List<VoiceMedalWallListView> list = this.f123746q;
        if (position == 0) {
            list.get(position).m79466w(this.f123747r.haveMedals);
        } else {
            list.get(position).m79466w(this.f123747r.haveNotMedals);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m148128s(TabLayout.Tab tab) {
        if (tab.getPosition() < 0 || tab.getPosition() >= this.f123746q.size()) {
            return;
        }
        m148137k(tab);
    }

    /* JADX INFO: renamed from: u */
    private void m148129u(int i) {
        if (this.f123743n == null) {
            this.f123743n = new c0s(this.f123742m, m148135i(LayoutInflater.from(this.f123742m.act()), null));
            qnp0.m177260c1(this.f123731b, 0, 0, 0, -qa00.m175859d(24.0f), qa00.m175859d(24.0f));
            m148117B();
            m148126n();
            bnl0.m105505C0(this.f123731b, (int) (bnl0.m105588w0() * 0.7f));
            this.f123740k.setAdapter(new b3o0(this.f123744o, this.f123746q));
            this.f123738i.clearOnTabSelectedListeners();
            this.f123738i.setupWithViewPager(this.f123740k);
            this.f123738i.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C18083a());
            m148132z();
        }
        m148133A(i);
        izs.m142868s("context_single_room", this.f123741l, this.f123747r.userAvatar);
        izs.m142868s("context_single_room", this.f123732c, zft.f204204L);
        this.f123736g.setText(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f123747r.haveMedalNum);
        this.f123737h.setText("/" + this.f123747r.medalSum);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m148130x(View view) {
        m148138p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m148131y(View view) {
        m148138p();
    }

    /* JADX INFO: renamed from: z */
    private void m148132z() {
        for (int i = 0; i < this.f123738i.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f123738i.getTabAt(i);
            if (tabAt != null) {
                tabAt.setCustomView(this.f123745p.get(i));
                m148137k(tabAt);
            }
            if (i == 0) {
                bnl0.m105538V(tabAt.view, qa00.f156323j);
            } else if (i == this.f123738i.getTabCount() - 1) {
                bnl0.m105539W(tabAt.view, qa00.f156323j);
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public void m148133A(int i) {
        this.f123740k.setCurrentItem(i);
        TabLayout.Tab tabAt = this.f123738i.getTabAt(i);
        if (NullChecker.m82486a(tabAt)) {
            m148127q(tabAt);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m148134C(BLiveIntlMedalWall bLiveIntlMedalWall) {
        this.f123747r = bLiveIntlMedalWall;
        m148129u(bLiveIntlMedalWall.haveMedalNum > 0 ? 0 : 1);
        Dialog dialog = this.f123743n;
        if (dialog == null || dialog.isShowing()) {
            return;
        }
        this.f123743n.show();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public View m148135i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l3o0.m152731b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(f3o0 f3o0Var) {
        this.f123742m = f3o0Var;
    }

    /* JADX INFO: renamed from: k */
    public void m148137k(TabLayout.Tab tab) {
        if (tab.getCustomView() == null) {
            return;
        }
        ((TextView) tab.getCustomView()).setTextColor(j26.m143190c(zrv.f205803e, tab.isSelected() ? n9c0.f140782M0 : n9c0.f140847m1));
    }

    /* JADX INFO: renamed from: p */
    public void m148138p() {
        Dialog dialog = this.f123743n;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f123743n.dismiss();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m148139v(BLiveIntlMedalWallItem bLiveIntlMedalWallItem) {
        this.f123742m.m123770O3(bLiveIntlMedalWallItem);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m148140w(String str) {
        m148125m(str);
        m148124l(str);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.k3o0$a */
    public class C18083a implements TabLayout.OnTabSelectedListener {
        public C18083a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            k3o0.this.m148127q(tab);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            k3o0.this.m148128s(tab);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }
}
