package p009l;

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
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.medalwall.view.VoiceMedalWallListView;
import com.p1.mobile.putong.live.base.data.BLiveIntlMedalWall;
import com.p1.mobile.putong.live.base.data.BLiveIntlMedalWallItem;
import com.p1.mobile.putong.live.livingroom.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.byr;
import l.e16;
import l.e30;
import l.h1c0;
import l.hun0;
import l.hxs;
import l.mep0;
import l.s7m;
import l.t100;
import l.vwb;
import l.w8u;
import l.xdl0;
import l.ydt;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class gun0 implements s7m<bun0> {

    /* JADX INFO: renamed from: a */
    public View f13757a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f13758b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f13759c;

    /* JADX INFO: renamed from: d */
    public ImageView f13760d;

    /* JADX INFO: renamed from: e */
    public VLinear f13761e;

    /* JADX INFO: renamed from: f */
    public VText f13762f;

    /* JADX INFO: renamed from: g */
    public VText f13763g;

    /* JADX INFO: renamed from: h */
    public VText f13764h;

    /* JADX INFO: renamed from: i */
    public TabLayout f13765i;

    /* JADX INFO: renamed from: j */
    public View f13766j;

    /* JADX INFO: renamed from: k */
    public ViewPager f13767k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f13768l;

    /* JADX INFO: renamed from: m */
    public bun0 f13769m;

    /* JADX INFO: renamed from: n */
    public Dialog f13770n;

    /* JADX INFO: renamed from: o */
    public final List<String> f13771o = new ArrayList();

    /* JADX INFO: renamed from: p */
    public final List<View> f13772p = new ArrayList();

    /* JADX INFO: renamed from: q */
    public final List<VoiceMedalWallListView> f13773q = new ArrayList();

    /* JADX INFO: renamed from: r */
    public BLiveIntlMedalWall f13774r;

    /* JADX INFO: renamed from: B */
    private void m15289B() {
        xdl0.E0(this.f13757a, new View.OnClickListener() { // from class: l.dun0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12009a.m15302x(view);
            }
        });
        xdl0.E0(this.f13760d, new View.OnClickListener() { // from class: l.eun0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12698a.m15303y(view);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.p1.mobile.putong.live.livingroom.voice.intl.medalwall.view.VoiceMedalWallListView, java.lang.Object] */
    /* JADX INFO: renamed from: l */
    private void m15296l(String str) {
        ?? voiceMedalWallListView = new VoiceMedalWallListView((Context) this.f13769m.act(), !w8u.t(R.string.eh).equals(str) ? 1 : 0);
        int i = xdl0.e;
        voiceMedalWallListView.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        voiceMedalWallListView.setItemClickAction(new e30() { // from class: l.fun0
            public final void call(Object obj) {
                this.f13180a.m15313v((BLiveIntlMedalWallItem) obj);
            }
        });
        this.f13773q.add((VoiceMedalWallListView) voiceMedalWallListView);
    }

    /* JADX INFO: renamed from: m */
    private void m15297m(String str) {
        TextView textView = new TextView(this.f13769m.act());
        textView.setText(str);
        textView.setLayoutParams(new LinearLayout.LayoutParams(xdl0.f, t100.d(36.0f)));
        xdl0.n(textView, t100.d(12.0f), 0, t100.d(12.0f), 0);
        textView.setGravity(17);
        textView.setTextSize(14.0f);
        this.f13772p.add(textView);
    }

    /* JADX INFO: renamed from: n */
    private void m15298n() {
        this.f13772p.clear();
        this.f13773q.clear();
        this.f13765i.removeAllTabs();
        this.f13771o.clear();
        this.f13771o.add(w8u.t(R.string.eh));
        this.f13771o.add(w8u.t(R.string.lh));
        vwb.z(this.f13771o, new e30() { // from class: l.cun0
            public final void call(Object obj) {
                this.f10780a.m15314w((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public void m15299q(TabLayout.Tab tab) {
        int position = tab.getPosition();
        if (position >= 0 && position < this.f13773q.size()) {
            m15311k(tab);
        }
        List<VoiceMedalWallListView> list = this.f13773q;
        if (position == 0) {
            list.get(position).m8472w(this.f13774r.haveMedals);
        } else {
            list.get(position).m8472w(this.f13774r.haveNotMedals);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m15300s(TabLayout.Tab tab) {
        if (tab.getPosition() < 0 || tab.getPosition() >= this.f13773q.size()) {
            return;
        }
        m15311k(tab);
    }

    /* JADX INFO: renamed from: u */
    private void m15301u(int i) {
        if (this.f13770n == null) {
            this.f13770n = new byr(this.f13769m, m15308i(LayoutInflater.from(this.f13769m.act()), null));
            mep0.c1(this.f13758b, 0, 0, 0, -t100.d(24.0f), t100.d(24.0f));
            m15289B();
            m15298n();
            xdl0.C0(this.f13758b, (int) (xdl0.w0() * 0.7f));
            this.f13767k.setAdapter(new xtn0(this.f13771o, this.f13773q));
            this.f13765i.clearOnTabSelectedListeners();
            this.f13765i.setupWithViewPager(this.f13767k);
            this.f13765i.addOnTabSelectedListener(new C0924a());
            m15304z();
        }
        m15305A(i);
        hxs.s("context_single_room", this.f13768l, this.f13774r.userAvatar);
        hxs.s("context_single_room", this.f13759c, ydt.L);
        this.f13763g.setText(" " + this.f13774r.haveMedalNum);
        this.f13764h.setText("/" + this.f13774r.medalSum);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m15302x(View view) {
        m15312p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m15303y(View view) {
        m15312p();
    }

    /* JADX INFO: renamed from: z */
    private void m15304z() {
        for (int i = 0; i < this.f13765i.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f13765i.getTabAt(i);
            if (tabAt != null) {
                tabAt.setCustomView(this.f13772p.get(i));
                m15311k(tabAt);
            }
            if (i == 0) {
                xdl0.V(tabAt.view, t100.j);
            } else if (i == this.f13765i.getTabCount() - 1) {
                xdl0.W(tabAt.view, t100.j);
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public void m15305A(int i) {
        this.f13767k.setCurrentItem(i);
        TabLayout.Tab tabAt = this.f13765i.getTabAt(i);
        if (NullChecker.a(tabAt)) {
            m15299q(tabAt);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m15306C(BLiveIntlMedalWall bLiveIntlMedalWall) {
        this.f13774r = bLiveIntlMedalWall;
        m15301u(bLiveIntlMedalWall.haveMedalNum > 0 ? 0 : 1);
        Dialog dialog = this.f13770n;
        if (dialog == null || dialog.isShowing()) {
            return;
        }
        this.f13770n.show();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m15307C0() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public View m15308i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hun0.b(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m15309i1(bun0 bun0Var) {
        this.f13769m = bun0Var;
    }

    /* JADX INFO: renamed from: k */
    public void m15311k(TabLayout.Tab tab) {
        if (tab.getCustomView() == null) {
            return;
        }
        ((TextView) tab.getCustomView()).setTextColor(e16.c(ypv.f23200e, tab.isSelected() ? h1c0.M0 : h1c0.m1));
    }

    /* JADX INFO: renamed from: p */
    public void m15312p() {
        Dialog dialog = this.f13770n;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f13770n.dismiss();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m15313v(BLiveIntlMedalWallItem bLiveIntlMedalWallItem) {
        this.f13769m.m12273O3(bLiveIntlMedalWallItem);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m15314w(String str) {
        m15297m(str);
        m15296l(str);
    }

    /* JADX INFO: renamed from: l.gun0$a */
    public class C0924a implements TabLayout.OnTabSelectedListener {
        public C0924a() {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            gun0.this.m15299q(tab);
        }

        public void onTabUnselected(TabLayout.Tab tab) {
            gun0.this.m15300s(tab);
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }
    }

    public void destroy() {
    }
}
