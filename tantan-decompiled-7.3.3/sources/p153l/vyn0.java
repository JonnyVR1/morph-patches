package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBookInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBrief;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.giftwall.bean.VoiceGiftWallData;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.giftwall.view.VoiceGiftWallListView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class vyn0 implements iam<pyn0> {

    /* JADX INFO: renamed from: a */
    public View f186391a;

    /* JADX INFO: renamed from: b */
    public ImageView f186392b;

    /* JADX INFO: renamed from: c */
    public ImageView f186393c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f186394d;

    /* JADX INFO: renamed from: e */
    public VText f186395e;

    /* JADX INFO: renamed from: f */
    public VText f186396f;

    /* JADX INFO: renamed from: g */
    public VText f186397g;

    /* JADX INFO: renamed from: h */
    public TabLayout f186398h;

    /* JADX INFO: renamed from: i */
    public View f186399i;

    /* JADX INFO: renamed from: j */
    public ViewPager f186400j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f186401k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f186402l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f186403m;

    /* JADX INFO: renamed from: n */
    public pyn0 f186404n;

    /* JADX INFO: renamed from: o */
    public c0s f186405o;

    /* JADX INFO: renamed from: p */
    public List<String> f186406p = new ArrayList();

    /* JADX INFO: renamed from: q */
    public final List<View> f186407q = new ArrayList();

    /* JADX INFO: renamed from: r */
    public final List<VoiceGiftWallListView> f186408r = new ArrayList();

    /* JADX INFO: renamed from: s */
    public String f186409s = "";

    /* JADX INFO: renamed from: t */
    public y20<BLiveVoiceGiftWallBookInfo> f186410t = new C20958a();

    /* JADX INFO: renamed from: l.vyn0$a */
    public class C20958a implements y20<BLiveVoiceGiftWallBookInfo> {
        public C20958a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo) {
            if (vyn0.this.f186404n != null) {
                vyn0.this.f186404n.m174305O3(bLiveVoiceGiftWallBookInfo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m204000A(View view) {
        m204027u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m204001B(View view) {
        this.f186404n.m174311V3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m204002C(View view) {
        this.f186404n.m174309T3();
    }

    /* JADX INFO: renamed from: G */
    private void m204003G() {
        for (int i = 0; i < this.f186398h.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f186398h.getTabAt(i);
            if (tabAt != null) {
                tabAt.setCustomView(this.f186407q.get(i));
                m204022m(tabAt);
            }
            if (i == 0) {
                bnl0.m105538V(tabAt.view, qa00.f156323j);
            } else if (i == this.f186398h.getTabCount() - 1) {
                bnl0.m105539W(tabAt.view, qa00.f156323j);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    private void m204004K() {
        bnl0.m105509E0(this.f186391a, new View.OnClickListener() { // from class: l.ryn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165448a.m204013z(view);
            }
        });
        bnl0.m105509E0(this.f186392b, new View.OnClickListener() { // from class: l.syn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171279a.m204000A(view);
            }
        });
        bnl0.m105509E0(this.f186402l, new View.OnClickListener() { // from class: l.tyn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176690a.m204001B(view);
            }
        });
        bnl0.m105509E0(this.f186393c, new View.OnClickListener() { // from class: l.uyn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181648a.m204002C(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m204013z(View view) {
        m204027u();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m204014E(User user) {
        bnl0.m105524M(this.f186402l, true);
        izs.m142868s("context_single_room", this.f186403m, user.m61308fp().profileMiddle().formatted());
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: F */
    public final void m204015F(BLiveVoiceGiftWallBrief bLiveVoiceGiftWallBrief) {
        if (NullChecker.m82486a(bLiveVoiceGiftWallBrief)) {
            this.f186396f.setText(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + bLiveVoiceGiftWallBrief.lightGiftCount);
            this.f186397g.setText("/" + bLiveVoiceGiftWallBrief.totalGiftCount);
            String str = bLiveVoiceGiftWallBrief.userAvatar;
            if (TextUtils.isEmpty(str) || this.f186409s.equals(str)) {
                return;
            }
            izs.m142868s("context_single_room", this.f186401k, str);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m204016H(List<BLiveVoiceGiftWallBookInfo> list, int i) {
        if (this.f186398h.getSelectedTabPosition() == i) {
            this.f186408r.get(this.f186398h.getSelectedTabPosition()).m79357e(list, i);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m204017I(VoiceGiftWallData voiceGiftWallData, int i) {
        m204015F(voiceGiftWallData.getVoiceGiftWallBrief());
        m204016H(voiceGiftWallData.getVoiceGiftWallList(), i);
    }

    /* JADX INFO: renamed from: J */
    public void m204018J(int i) {
        this.f186400j.setCurrentItem(i);
        TabLayout.Tab tabAt = this.f186398h.getTabAt(i);
        if (NullChecker.m82486a(tabAt)) {
            m204028v(tabAt);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m204019L(int i) {
        m204030x(i);
        c0s c0sVar = this.f186405o;
        if (c0sVar == null || c0sVar.isShowing()) {
            return;
        }
        this.f186405o.show();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f186404n.act();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public View m204020k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wyn0.m208620b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(pyn0 pyn0Var) {
        this.f186404n = pyn0Var;
    }

    /* JADX INFO: renamed from: m */
    public void m204022m(TabLayout.Tab tab) {
        if (tab.getCustomView() == null) {
            return;
        }
        ((TextView) tab.getCustomView()).setTextColor(tab.isSelected() ? j26.m143190c(zrv.f205803e, n9c0.f140839k) : j26.m143190c(zrv.f205803e, n9c0.f140844l1));
    }

    /* JADX INFO: renamed from: n */
    public void m204023n(int i) {
        c0s c0sVar = this.f186405o;
        if (c0sVar != null && c0sVar.isShowing() && i == 0) {
            m204018J(0);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m204024p(String str) {
        VoiceGiftWallListView voiceGiftWallListView = new VoiceGiftWallListView(this.f186404n.act(), !xau.m209910t(R$string.f48067eh).equals(str) ? 1 : 0);
        voiceGiftWallListView.setItemClickAction(this.f186410t);
        int i = bnl0.f77544e;
        voiceGiftWallListView.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        this.f186408r.add(voiceGiftWallListView);
    }

    /* JADX INFO: renamed from: q */
    public final void m204025q(String str) {
        TextView textView = new TextView(getAct());
        textView.setText(str);
        textView.setLayoutParams(new LinearLayout.LayoutParams(bnl0.f77545f, qa00.m175859d(36.0f)));
        bnl0.m105569n(textView, qa00.m175859d(12.0f), 0, qa00.m175859d(12.0f), 0);
        textView.setGravity(17);
        textView.setTextSize(14.0f);
        this.f186407q.add(textView);
    }

    /* JADX INFO: renamed from: s */
    public final void m204026s() {
        this.f186407q.clear();
        this.f186408r.clear();
        this.f186398h.removeAllTabs();
        this.f186406p.clear();
        this.f186406p.add(xau.m209910t(R$string.f48067eh));
        this.f186406p.add(xau.m209910t(R$string.f48220lh));
        jyb.m147537z(this.f186406p, new y20() { // from class: l.qyn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160171a.m204031y((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m204027u() {
        c0s c0sVar = this.f186405o;
        if (c0sVar == null || !c0sVar.isShowing()) {
            return;
        }
        this.f186405o.dismiss();
    }

    /* JADX INFO: renamed from: v */
    public final void m204028v(TabLayout.Tab tab) {
        if (tab.getPosition() >= 0 && tab.getPosition() < this.f186408r.size()) {
            m204022m(tab);
        }
        this.f186404n.m174310U3(tab.getPosition() == 0 ? 0 : 1);
    }

    /* JADX INFO: renamed from: w */
    public final void m204029w(TabLayout.Tab tab) {
        if (tab.getPosition() < 0 || tab.getPosition() >= this.f186408r.size()) {
            return;
        }
        m204022m(tab);
    }

    /* JADX INFO: renamed from: x */
    public final void m204030x(int i) {
        if (this.f186405o == null) {
            this.f186405o = new c0s(this.f186404n, m204020k(LayoutInflater.from(this.f186404n.act()), null));
            m204004K();
            m204026s();
            this.f186400j.setAdapter(new lyn0(this.f186406p, this.f186408r));
            this.f186398h.clearOnTabSelectedListeners();
            this.f186398h.setupWithViewPager(this.f186400j);
            this.f186398h.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C20959b());
            m204003G();
        }
        bnl0.m105524M(this.f186402l, false);
        m204018J(i);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m204031y(String str) {
        m204025q(str);
        m204024p(str);
    }

    /* JADX INFO: renamed from: l.vyn0$b */
    public class C20959b implements TabLayout.OnTabSelectedListener {
        public C20959b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            vyn0.this.m204028v(tab);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            vyn0.this.m204029w(tab);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
