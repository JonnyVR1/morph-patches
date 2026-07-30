package p149l;

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
import com.p046p1.mobile.putong.live.base.data.BLiveIntlMedalWall;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlMedalWallItem;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.medalwall.view.VoiceMedalWallListView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class gun0 implements s7m<bun0> {

    /* JADX INFO: renamed from: a */
    public View f104421a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f104422b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f104423c;

    /* JADX INFO: renamed from: d */
    public ImageView f104424d;

    /* JADX INFO: renamed from: e */
    public VLinear f104425e;

    /* JADX INFO: renamed from: f */
    public VText f104426f;

    /* JADX INFO: renamed from: g */
    public VText f104427g;

    /* JADX INFO: renamed from: h */
    public VText f104428h;

    /* JADX INFO: renamed from: i */
    public TabLayout f104429i;

    /* JADX INFO: renamed from: j */
    public View f104430j;

    /* JADX INFO: renamed from: k */
    public ViewPager f104431k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f104432l;

    /* JADX INFO: renamed from: m */
    public bun0 f104433m;

    /* JADX INFO: renamed from: n */
    public Dialog f104434n;

    /* JADX INFO: renamed from: o */
    public final List<String> f104435o = new ArrayList();

    /* JADX INFO: renamed from: p */
    public final List<View> f104436p = new ArrayList();

    /* JADX INFO: renamed from: q */
    public final List<VoiceMedalWallListView> f104437q = new ArrayList();

    /* JADX INFO: renamed from: r */
    public BLiveIntlMedalWall f104438r;

    /* JADX INFO: renamed from: B */
    private void m128046B() {
        xdl0.m208329E0(this.f104421a, new View.OnClickListener() { // from class: l.dun0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88002a.m128059x(view);
            }
        });
        xdl0.m208329E0(this.f104424d, new View.OnClickListener() { // from class: l.eun0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93265a.m128060y(view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    private void m128053l(String str) {
        VoiceMedalWallListView voiceMedalWallListView = new VoiceMedalWallListView(this.f104433m.act(), !w8u.m202217t(R$string.f47219eh).equals(str) ? 1 : 0);
        int i = xdl0.f192403e;
        voiceMedalWallListView.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        voiceMedalWallListView.setItemClickAction(new e30() { // from class: l.fun0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99353a.m128068v((BLiveIntlMedalWallItem) obj);
            }
        });
        this.f104437q.add(voiceMedalWallListView);
    }

    /* JADX INFO: renamed from: m */
    private void m128054m(String str) {
        TextView textView = new TextView(this.f104433m.act());
        textView.setText(str);
        textView.setLayoutParams(new LinearLayout.LayoutParams(xdl0.f192404f, t100.m186890d(36.0f)));
        xdl0.m208389n(textView, t100.m186890d(12.0f), 0, t100.m186890d(12.0f), 0);
        textView.setGravity(17);
        textView.setTextSize(14.0f);
        this.f104436p.add(textView);
    }

    /* JADX INFO: renamed from: n */
    private void m128055n() {
        this.f104436p.clear();
        this.f104437q.clear();
        this.f104429i.removeAllTabs();
        this.f104435o.clear();
        this.f104435o.add(w8u.m202217t(R$string.f47219eh));
        this.f104435o.add(w8u.m202217t(R$string.f47372lh));
        vwb.m200354z(this.f104435o, new e30() { // from class: l.cun0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82587a.m128069w((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public void m128056q(TabLayout.Tab tab) {
        int position = tab.getPosition();
        if (position >= 0 && position < this.f104437q.size()) {
            m128066k(tab);
        }
        List<VoiceMedalWallListView> list = this.f104437q;
        if (position == 0) {
            list.get(position).m78283w(this.f104438r.haveMedals);
        } else {
            list.get(position).m78283w(this.f104438r.haveNotMedals);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m128057s(TabLayout.Tab tab) {
        if (tab.getPosition() < 0 || tab.getPosition() >= this.f104437q.size()) {
            return;
        }
        m128066k(tab);
    }

    /* JADX INFO: renamed from: u */
    private void m128058u(int i) {
        if (this.f104434n == null) {
            this.f104434n = new byr(this.f104433m, m128064i(LayoutInflater.from(this.f104433m.act()), null));
            mep0.m154301c1(this.f104422b, 0, 0, 0, -t100.m186890d(24.0f), t100.m186890d(24.0f));
            m128046B();
            m128055n();
            xdl0.m208325C0(this.f104422b, (int) (xdl0.m208408w0() * 0.7f));
            this.f104431k.setAdapter(new xtn0(this.f104435o, this.f104437q));
            this.f104429i.clearOnTabSelectedListeners();
            this.f104429i.setupWithViewPager(this.f104431k);
            this.f104429i.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C17156a());
            m128061z();
        }
        m128062A(i);
        hxs.m133406s("context_single_room", this.f104432l, this.f104438r.userAvatar);
        hxs.m133406s("context_single_room", this.f104423c, ydt.f197609L);
        this.f104427g.setText(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f104438r.haveMedalNum);
        this.f104428h.setText("/" + this.f104438r.medalSum);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m128059x(View view) {
        m128067p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m128060y(View view) {
        m128067p();
    }

    /* JADX INFO: renamed from: z */
    private void m128061z() {
        for (int i = 0; i < this.f104429i.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f104429i.getTabAt(i);
            if (tabAt != null) {
                tabAt.setCustomView(this.f104436p.get(i));
                m128066k(tabAt);
            }
            if (i == 0) {
                xdl0.m208358V(tabAt.view, t100.f167261j);
            } else if (i == this.f104429i.getTabCount() - 1) {
                xdl0.m208359W(tabAt.view, t100.f167261j);
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public void m128062A(int i) {
        this.f104431k.setCurrentItem(i);
        TabLayout.Tab tabAt = this.f104429i.getTabAt(i);
        if (NullChecker.m81303a(tabAt)) {
            m128056q(tabAt);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m128063C(BLiveIntlMedalWall bLiveIntlMedalWall) {
        this.f104438r = bLiveIntlMedalWall;
        m128058u(bLiveIntlMedalWall.haveMedalNum > 0 ? 0 : 1);
        Dialog dialog = this.f104434n;
        if (dialog == null || dialog.isShowing()) {
            return;
        }
        this.f104434n.show();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public View m128064i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hun0.m133139b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(bun0 bun0Var) {
        this.f104433m = bun0Var;
    }

    /* JADX INFO: renamed from: k */
    public void m128066k(TabLayout.Tab tab) {
        if (tab.getCustomView() == null) {
            return;
        }
        ((TextView) tab.getCustomView()).setTextColor(e16.m114375c(ypv.f199497e, tab.isSelected() ? h1c0.f105321M0 : h1c0.f105386m1));
    }

    /* JADX INFO: renamed from: p */
    public void m128067p() {
        Dialog dialog = this.f104434n;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f104434n.dismiss();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m128068v(BLiveIntlMedalWallItem bLiveIntlMedalWallItem) {
        this.f104433m.m103974O3(bLiveIntlMedalWallItem);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m128069w(String str) {
        m128054m(str);
        m128053l(str);
    }

    /* JADX INFO: renamed from: l.gun0$a */
    public class C17156a implements TabLayout.OnTabSelectedListener {
        public C17156a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            gun0.this.m128056q(tab);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            gun0.this.m128057s(tab);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
