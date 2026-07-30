package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBookInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBrief;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.giftwall.bean.VoiceGiftWallData;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.giftwall.view.VoiceGiftWallListView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class rpn0 implements s7m<lpn0> {

    /* JADX INFO: renamed from: a */
    public View f160525a;

    /* JADX INFO: renamed from: b */
    public ImageView f160526b;

    /* JADX INFO: renamed from: c */
    public ImageView f160527c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f160528d;

    /* JADX INFO: renamed from: e */
    public VText f160529e;

    /* JADX INFO: renamed from: f */
    public VText f160530f;

    /* JADX INFO: renamed from: g */
    public VText f160531g;

    /* JADX INFO: renamed from: h */
    public TabLayout f160532h;

    /* JADX INFO: renamed from: i */
    public View f160533i;

    /* JADX INFO: renamed from: j */
    public ViewPager f160534j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f160535k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f160536l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f160537m;

    /* JADX INFO: renamed from: n */
    public lpn0 f160538n;

    /* JADX INFO: renamed from: o */
    public byr f160539o;

    /* JADX INFO: renamed from: p */
    public List<String> f160540p = new ArrayList();

    /* JADX INFO: renamed from: q */
    public final List<View> f160541q = new ArrayList();

    /* JADX INFO: renamed from: r */
    public final List<VoiceGiftWallListView> f160542r = new ArrayList();

    /* JADX INFO: renamed from: s */
    public String f160543s = "";

    /* JADX INFO: renamed from: t */
    public e30<BLiveVoiceGiftWallBookInfo> f160544t = new C19748a();

    /* JADX INFO: renamed from: l.rpn0$a */
    public class C19748a implements e30<BLiveVoiceGiftWallBookInfo> {
        public C19748a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo) {
            if (rpn0.this.f160538n != null) {
                rpn0.this.f160538n.m150881O3(bLiveVoiceGiftWallBookInfo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m180339A(View view) {
        m180366u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m180340B(View view) {
        this.f160538n.m150887V3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m180341C(View view) {
        this.f160538n.m150885T3();
    }

    /* JADX INFO: renamed from: G */
    private void m180342G() {
        for (int i = 0; i < this.f160532h.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f160532h.getTabAt(i);
            if (tabAt != null) {
                tabAt.setCustomView(this.f160541q.get(i));
                m180361m(tabAt);
            }
            if (i == 0) {
                xdl0.m208358V(tabAt.view, t100.f167261j);
            } else if (i == this.f160532h.getTabCount() - 1) {
                xdl0.m208359W(tabAt.view, t100.f167261j);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    private void m180343K() {
        xdl0.m208329E0(this.f160525a, new View.OnClickListener() { // from class: l.npn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139988a.m180352z(view);
            }
        });
        xdl0.m208329E0(this.f160526b, new View.OnClickListener() { // from class: l.opn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145019a.m180339A(view);
            }
        });
        xdl0.m208329E0(this.f160536l, new View.OnClickListener() { // from class: l.ppn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150671a.m180340B(view);
            }
        });
        xdl0.m208329E0(this.f160527c, new View.OnClickListener() { // from class: l.qpn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155783a.m180341C(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m180352z(View view) {
        m180366u();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m180353E(User user) {
        xdl0.m208344M(this.f160536l, true);
        hxs.m133406s("context_single_room", this.f160537m, user.m60124fp().profileMiddle().formatted());
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: F */
    public final void m180354F(BLiveVoiceGiftWallBrief bLiveVoiceGiftWallBrief) {
        if (NullChecker.m81303a(bLiveVoiceGiftWallBrief)) {
            this.f160530f.setText(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + bLiveVoiceGiftWallBrief.lightGiftCount);
            this.f160531g.setText("/" + bLiveVoiceGiftWallBrief.totalGiftCount);
            String str = bLiveVoiceGiftWallBrief.userAvatar;
            if (TextUtils.isEmpty(str) || this.f160543s.equals(str)) {
                return;
            }
            hxs.m133406s("context_single_room", this.f160535k, str);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m180355H(List<BLiveVoiceGiftWallBookInfo> list, int i) {
        if (this.f160532h.getSelectedTabPosition() == i) {
            this.f160542r.get(this.f160532h.getSelectedTabPosition()).m78174e(list, i);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m180356I(VoiceGiftWallData voiceGiftWallData, int i) {
        m180354F(voiceGiftWallData.getVoiceGiftWallBrief());
        m180355H(voiceGiftWallData.getVoiceGiftWallList(), i);
    }

    /* JADX INFO: renamed from: J */
    public void m180357J(int i) {
        this.f160534j.setCurrentItem(i);
        TabLayout.Tab tabAt = this.f160532h.getTabAt(i);
        if (NullChecker.m81303a(tabAt)) {
            m180367v(tabAt);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m180358L(int i) {
        m180369x(i);
        byr byrVar = this.f160539o;
        if (byrVar == null || byrVar.isShowing()) {
            return;
        }
        this.f160539o.show();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f160538n.act();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public View m180359k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return spn0.m185382b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(lpn0 lpn0Var) {
        this.f160538n = lpn0Var;
    }

    /* JADX INFO: renamed from: m */
    public void m180361m(TabLayout.Tab tab) {
        if (tab.getCustomView() == null) {
            return;
        }
        ((TextView) tab.getCustomView()).setTextColor(tab.isSelected() ? e16.m114375c(ypv.f199497e, h1c0.f105378k) : e16.m114375c(ypv.f199497e, h1c0.f105383l1));
    }

    /* JADX INFO: renamed from: n */
    public void m180362n(int i) {
        byr byrVar = this.f160539o;
        if (byrVar != null && byrVar.isShowing() && i == 0) {
            m180357J(0);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m180363p(String str) {
        VoiceGiftWallListView voiceGiftWallListView = new VoiceGiftWallListView(this.f160538n.act(), !w8u.m202217t(R$string.f47219eh).equals(str) ? 1 : 0);
        voiceGiftWallListView.setItemClickAction(this.f160544t);
        int i = xdl0.f192403e;
        voiceGiftWallListView.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        this.f160542r.add(voiceGiftWallListView);
    }

    /* JADX INFO: renamed from: q */
    public final void m180364q(String str) {
        TextView textView = new TextView(getAct());
        textView.setText(str);
        textView.setLayoutParams(new LinearLayout.LayoutParams(xdl0.f192404f, t100.m186890d(36.0f)));
        xdl0.m208389n(textView, t100.m186890d(12.0f), 0, t100.m186890d(12.0f), 0);
        textView.setGravity(17);
        textView.setTextSize(14.0f);
        this.f160541q.add(textView);
    }

    /* JADX INFO: renamed from: s */
    public final void m180365s() {
        this.f160541q.clear();
        this.f160542r.clear();
        this.f160532h.removeAllTabs();
        this.f160540p.clear();
        this.f160540p.add(w8u.m202217t(R$string.f47219eh));
        this.f160540p.add(w8u.m202217t(R$string.f47372lh));
        vwb.m200354z(this.f160540p, new e30() { // from class: l.mpn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135074a.m180370y((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m180366u() {
        byr byrVar = this.f160539o;
        if (byrVar == null || !byrVar.isShowing()) {
            return;
        }
        this.f160539o.dismiss();
    }

    /* JADX INFO: renamed from: v */
    public final void m180367v(TabLayout.Tab tab) {
        if (tab.getPosition() >= 0 && tab.getPosition() < this.f160542r.size()) {
            m180361m(tab);
        }
        this.f160538n.m150886U3(tab.getPosition() == 0 ? 0 : 1);
    }

    /* JADX INFO: renamed from: w */
    public final void m180368w(TabLayout.Tab tab) {
        if (tab.getPosition() < 0 || tab.getPosition() >= this.f160542r.size()) {
            return;
        }
        m180361m(tab);
    }

    /* JADX INFO: renamed from: x */
    public final void m180369x(int i) {
        if (this.f160539o == null) {
            this.f160539o = new byr(this.f160538n, m180359k(LayoutInflater.from(this.f160538n.act()), null));
            m180343K();
            m180365s();
            this.f160534j.setAdapter(new hpn0(this.f160540p, this.f160542r));
            this.f160532h.clearOnTabSelectedListeners();
            this.f160532h.setupWithViewPager(this.f160534j);
            this.f160532h.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C19749b());
            m180342G();
        }
        xdl0.m208344M(this.f160536l, false);
        m180357J(i);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m180370y(String str) {
        m180364q(str);
        m180363p(str);
    }

    /* JADX INFO: renamed from: l.rpn0$b */
    public class C19749b implements TabLayout.OnTabSelectedListener {
        public C19749b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            rpn0.this.m180367v(tab);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            rpn0.this.m180368w(tab);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
