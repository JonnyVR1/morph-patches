package p009l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.newui.partner.ChatPartnerHistoryAct;
import com.p000p1.mobile.putong.core.newui.partner.ChatPartnerSelectFriendAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatPartnerText;
import com.p1.mobile.putong.core.data.ChatPartners;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.c30;
import l.d15;
import l.dac0;
import l.f6c0;
import l.hmb;
import l.j760;
import l.lsi0;
import l.qib0;
import l.s7m;
import l.t100;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class c15 implements s7m<x05> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f10376a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f10377b;

    /* JADX INFO: renamed from: c */
    public VImage f10378c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f10379d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f10380e;

    /* JADX INFO: renamed from: f */
    public VText f10381f;

    /* JADX INFO: renamed from: g */
    public VLinear f10382g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f10383h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f10384i;

    /* JADX INFO: renamed from: j */
    public VText f10385j;

    /* JADX INFO: renamed from: k */
    public VText_Bold f10386k;

    /* JADX INFO: renamed from: l */
    public VRecyclerView f10387l;

    /* JADX INFO: renamed from: m */
    public View f10388m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f10389n;

    /* JADX INFO: renamed from: o */
    public VText_Bold f10390o;

    /* JADX INFO: renamed from: p */
    public TextView f10391p;

    /* JADX INFO: renamed from: q */
    public Act f10392q;

    /* JADX INFO: renamed from: r */
    public x05 f10393r;

    /* JADX INFO: renamed from: l.c15$a */
    public class C0798a extends dac0<ChatPartnerText> {

        /* JADX INFO: renamed from: c */
        public final List<ChatPartnerText> f10394c;

        public C0798a(List<ChatPartnerText> list) {
            ArrayList arrayList = new ArrayList();
            this.f10394c = arrayList;
            arrayList.addAll(list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m12346H(ChatPartnerText chatPartnerText, View view) {
            c15.this.f10385j.setText(chatPartnerText.value);
            c15.this.f10393r.m24644m0(chatPartnerText);
            notifyDataSetChanged();
            zvf0.u("e_preset_word", c15.this.act().pageId(), new j760[]{j760.a("word_content", c15.this.f10393r.m24641i0().value)});
            zvf0.A("e_preset_word", c15.this.act().pageId(), new j760[]{j760.a("word_content", c15.this.f10393r.m24641i0().value)});
        }

        /* JADX INFO: renamed from: C */
        public int m12348C() {
            return this.f10394c.size();
        }

        /* JADX INFO: renamed from: D */
        public View m12349D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(c15.this.m12338C0()).inflate(f6c0.m1, viewGroup, false);
        }

        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void m12347A(View view, final ChatPartnerText chatPartnerText, int i, int i2) {
            VText vText = (VText) view;
            vText.setText(chatPartnerText.value);
            vText.setBackgroundResource((NullChecker.a(c15.this.f10393r.m24641i0()) && TextUtils.equals(c15.this.f10393r.m24641i0().value, chatPartnerText.value)) ? x2c0.k5 : x2c0.j5);
            xdl0.E0(view, new View.OnClickListener() { // from class: l.b15
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f9789a.m12346H(chatPartnerText, view2);
                }
            });
        }

        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public ChatPartnerText getItem(int i) {
            return this.f10394c.get(i);
        }
    }

    public c15(@NonNull Act act) {
        this.f10392q = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m12336j(View view) {
        if (c30.f(act())) {
            act().finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m12337k(View view) {
        act().startActivity(ChatPartnerHistoryAct.m7308Y1(act()));
        zvf0.r("e_chatting_partner_signal_list", act().pageId());
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m12338C0() {
        return this.f10392q;
    }

    @Nullable
    public Act act() {
        return this.f10392q;
    }

    /* JADX INFO: renamed from: e */
    public View m12339e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d15.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m12342i1(x05 x05Var) {
        this.f10393r = x05Var;
    }

    /* JADX INFO: renamed from: i */
    public void m12341i() {
        qib0.G.L0(this.f10377b, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlNLTjI1V0czRlZIVUZQNlNNQ1pUTVpVUVFEWDQ3VTE0IiwidyI6MTM1MCwiaCI6MTA4MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjkxNDY1Mjg2MDk4Njh9.webp");
        xdl0.X(this.f10378c, hmb.n1(act()) + t100.d(6.0f));
        qib0.G.L0(this.f10383h, CoreModule.c.e0.p9().fp().profileSmall().formatted());
        if (CoreModule.N().Gc() == null) {
            this.f10384i.setImageResource(x2c0.n5);
        } else {
            qib0.G.L0(this.f10384i, CoreModule.N().Gc().emotion.emojiUrl);
        }
        xdl0.E0(this.f10378c, new View.OnClickListener() { // from class: l.z05
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23311a.m12336j(view);
            }
        });
        xdl0.E0(this.f10379d, new View.OnClickListener() { // from class: l.a15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9183a.m12337k(view);
            }
        });
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m12339e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m12343l(View view) {
        boolean zIsEmpty = TextUtils.isEmpty(this.f10393r.m24642j0());
        x05 x05Var = this.f10393r;
        if (!zIsEmpty) {
            lsi0.y(x05Var.m24642j0());
            return;
        }
        if (NullChecker.a(x05Var.m24641i0())) {
            if (c30.f(act())) {
                act().startActivity(ChatPartnerSelectFriendAct.m7314Z1(act(), this.f10393r.m24640h0(), this.f10393r.m24641i0().id, "fixtion"));
                act().finish();
            }
            zvf0.u("e_sent_chatting_partner_signal", act().pageId(), new j760[]{j760.a("word_content", this.f10393r.m24641i0().value)});
        }
    }

    /* JADX INFO: renamed from: m */
    public void m12344m(@NonNull ChatPartners chatPartners) {
        List list = chatPartners.texts;
        if (!vwb.J(list)) {
            this.f10393r.m24644m0((ChatPartnerText) list.get(0));
            this.f10385j.setText(((ChatPartnerText) list.get(0)).value);
            list.remove(0);
        }
        this.f10387l.setAdapter(new C0798a(list));
        if (NullChecker.a(this.f10393r.m24641i0())) {
            zvf0.A("e_preset_word", act().pageId(), new j760[]{j760.a("word_content", this.f10393r.m24641i0().value)});
        }
        this.f10391p.setText("我的信号次数：" + this.f10393r.m24640h0().remainSignalCount);
        int i = this.f10393r.m24640h0().remainSignalCount;
        FrameLayout frameLayout = this.f10389n;
        if (i <= 0) {
            frameLayout.setBackgroundResource(x2c0.Q4);
        } else {
            frameLayout.setBackgroundResource(x2c0.P4);
            xdl0.E0(this.f10389n, new View.OnClickListener() { // from class: l.y05
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22840a.m12343l(view);
                }
            });
        }
    }

    public void destroy() {
    }
}
