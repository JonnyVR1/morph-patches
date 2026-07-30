package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatPartnerText;
import com.p046p1.mobile.putong.core.data.ChatPartners;
import com.p046p1.mobile.putong.core.newui.partner.ChatPartnerHistoryAct;
import com.p046p1.mobile.putong.core.newui.partner.ChatPartnerSelectFriendAct;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class c15 implements s7m<x05> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f78208a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f78209b;

    /* JADX INFO: renamed from: c */
    public VImage f78210c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f78211d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f78212e;

    /* JADX INFO: renamed from: f */
    public VText f78213f;

    /* JADX INFO: renamed from: g */
    public VLinear f78214g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f78215h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f78216i;

    /* JADX INFO: renamed from: j */
    public VText f78217j;

    /* JADX INFO: renamed from: k */
    public VText_Bold f78218k;

    /* JADX INFO: renamed from: l */
    public VRecyclerView f78219l;

    /* JADX INFO: renamed from: m */
    public View f78220m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f78221n;

    /* JADX INFO: renamed from: o */
    public VText_Bold f78222o;

    /* JADX INFO: renamed from: p */
    public TextView f78223p;

    /* JADX INFO: renamed from: q */
    public Act f78224q;

    /* JADX INFO: renamed from: r */
    public x05 f78225r;

    /* JADX INFO: renamed from: l.c15$a */
    public class C16037a extends dac0<ChatPartnerText> {

        /* JADX INFO: renamed from: c */
        public final List<ChatPartnerText> f78226c;

        public C16037a(List<ChatPartnerText> list) {
            ArrayList arrayList = new ArrayList();
            this.f78226c = arrayList;
            arrayList.addAll(list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m104821H(ChatPartnerText chatPartnerText, View view) {
            c15.this.f78217j.setText(chatPartnerText.value);
            c15.this.f78225r.m206579m0(chatPartnerText);
            notifyDataSetChanged();
            zvf0.m220399u("e_preset_word", c15.this.getAct().pageId(), j760.m140076a("word_content", c15.this.f78225r.m206576i0().value));
            zvf0.m220368A("e_preset_word", c15.this.getAct().pageId(), j760.m140076a("word_content", c15.this.f78225r.m206576i0().value));
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f78226c.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(c15.this.getContext()).inflate(f6c0.f95887m1, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, final ChatPartnerText chatPartnerText, int i, int i2) {
            VText vText = (VText) view;
            vText.setText(chatPartnerText.value);
            vText.setBackgroundResource((NullChecker.m81303a(c15.this.f78225r.m206576i0()) && TextUtils.equals(c15.this.f78225r.m206576i0().value, chatPartnerText.value)) ? x2c0.f190288k5 : x2c0.f190256j5);
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.b15
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f72490a.m104821H(chatPartnerText, view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public ChatPartnerText getItem(int i) {
            return this.f78226c.get(i);
        }
    }

    public c15(@NonNull Act act) {
        this.f78224q = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m104813j(View view) {
        if (c30.m104964f(getAct())) {
            getAct().m47815F2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m104814k(View view) {
        getAct().startActivity(ChatPartnerHistoryAct.m43102Y1(getAct()));
        zvf0.m220396r("e_chatting_partner_signal_list", getAct().pageId());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f78224q;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f78224q;
    }

    /* JADX INFO: renamed from: e */
    public View m104815e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d15.m109570b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(x05 x05Var) {
        this.f78225r = x05Var;
    }

    /* JADX INFO: renamed from: i */
    public void m104817i() {
        qib0.f154691G.m102331L0(this.f78209b, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlNLTjI1V0czRlZIVUZQNlNNQ1pUTVpVUVFEWDQ3VTE0IiwidyI6MTM1MCwiaCI6MTA4MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjkxNDY1Mjg2MDk4Njh9.webp");
        xdl0.m208360X(this.f78210c, hmb.m131709n1(getAct()) + t100.m186890d(6.0f));
        qib0.f154691G.m102331L0(this.f78215h, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted());
        if (CoreModule.m29934N().mo60276Gc() == null) {
            this.f78216i.setImageResource(x2c0.f190384n5);
        } else {
            qib0.f154691G.m102331L0(this.f78216i, CoreModule.m29934N().mo60276Gc().emotion.emojiUrl);
        }
        xdl0.m208329E0(this.f78210c, new View.OnClickListener() { // from class: l.z05
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200933a.m104813j(view);
            }
        });
        xdl0.m208329E0(this.f78211d, new View.OnClickListener() { // from class: l.a15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67095a.m104814k(view);
            }
        });
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m104815e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m104818l(View view) {
        boolean zIsEmpty = TextUtils.isEmpty(this.f78225r.m206577j0());
        x05 x05Var = this.f78225r;
        if (!zIsEmpty) {
            lsi0.m151595y(x05Var.m206577j0());
            return;
        }
        if (NullChecker.m81303a(x05Var.m206576i0())) {
            if (c30.m104964f(getAct())) {
                getAct().startActivity(ChatPartnerSelectFriendAct.m43106Z1(getAct(), this.f78225r.m206575h0(), this.f78225r.m206576i0().f20369id, "fixtion"));
                getAct().m47815F2();
            }
            zvf0.m220399u("e_sent_chatting_partner_signal", getAct().pageId(), j760.m140076a("word_content", this.f78225r.m206576i0().value));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m104819m(@NonNull ChatPartners chatPartners) {
        List<ChatPartnerText> list = chatPartners.texts;
        if (!vwb.m200296J(list)) {
            this.f78225r.m206579m0(list.get(0));
            this.f78217j.setText(list.get(0).value);
            list.remove(0);
        }
        this.f78219l.setAdapter(new C16037a(list));
        if (NullChecker.m81303a(this.f78225r.m206576i0())) {
            zvf0.m220368A("e_preset_word", getAct().pageId(), j760.m140076a("word_content", this.f78225r.m206576i0().value));
        }
        this.f78223p.setText("我的信号次数：" + this.f78225r.m206575h0().remainSignalCount);
        int i = this.f78225r.m206575h0().remainSignalCount;
        FrameLayout frameLayout = this.f78221n;
        if (i <= 0) {
            frameLayout.setBackgroundResource(x2c0.f189660Q4);
        } else {
            frameLayout.setBackgroundResource(x2c0.f189629P4);
            xdl0.m208329E0(this.f78221n, new View.OnClickListener() { // from class: l.y05
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f195276a.m104818l(view);
                }
            });
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
