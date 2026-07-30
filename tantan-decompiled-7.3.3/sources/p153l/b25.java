package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatPartnerText;
import com.p051p1.mobile.putong.core.data.ChatPartners;
import com.p051p1.mobile.putong.core.newui.partner.ChatPartnerHistoryAct;
import com.p051p1.mobile.putong.core.newui.partner.ChatPartnerSelectFriendAct;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class b25 implements iam<w15> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f74567a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f74568b;

    /* JADX INFO: renamed from: c */
    public VImage f74569c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f74570d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f74571e;

    /* JADX INFO: renamed from: f */
    public VText f74572f;

    /* JADX INFO: renamed from: g */
    public VLinear f74573g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f74574h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f74575i;

    /* JADX INFO: renamed from: j */
    public VText f74576j;

    /* JADX INFO: renamed from: k */
    public VText_Bold f74577k;

    /* JADX INFO: renamed from: l */
    public VRecyclerView f74578l;

    /* JADX INFO: renamed from: m */
    public View f74579m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f74580n;

    /* JADX INFO: renamed from: o */
    public VText_Bold f74581o;

    /* JADX INFO: renamed from: p */
    public TextView f74582p;

    /* JADX INFO: renamed from: q */
    public Act f74583q;

    /* JADX INFO: renamed from: r */
    public w15 f74584r;

    /* JADX INFO: renamed from: l.b25$a */
    public class C15899a extends jic0<ChatPartnerText> {

        /* JADX INFO: renamed from: c */
        public final List<ChatPartnerText> f74585c;

        public C15899a(List<ChatPartnerText> list) {
            ArrayList arrayList = new ArrayList();
            this.f74585c = arrayList;
            arrayList.addAll(list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m102111H(ChatPartnerText chatPartnerText, View view) {
            b25.this.f74576j.setText(chatPartnerText.value);
            b25.this.f74584r.m204388m0(chatPartnerText);
            notifyDataSetChanged();
            i4g0.m138523u("e_preset_word", b25.this.getAct().pageId(), pf60.m172085a("word_content", b25.this.f74584r.m204385i0().value));
            i4g0.m138492A("e_preset_word", b25.this.getAct().pageId(), pf60.m172085a("word_content", b25.this.f74584r.m204385i0().value));
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f74585c.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(b25.this.getContext()).inflate(kec0.f125941m1, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, final ChatPartnerText chatPartnerText, int i, int i2) {
            VText vText = (VText) view;
            vText.setText(chatPartnerText.value);
            vText.setBackgroundResource((NullChecker.m82486a(b25.this.f74584r.m204385i0()) && TextUtils.equals(b25.this.f74584r.m204385i0().value, chatPartnerText.value)) ? dbc0.f87174l5 : dbc0.f87141k5);
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.a25
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f67934a.m102111H(chatPartnerText, view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public ChatPartnerText getItem(int i) {
            return this.f74585c.get(i);
        }
    }

    public b25(@NonNull Act act) {
        this.f74583q = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m102103j(View view) {
        if (w20.m204491f(getAct())) {
            getAct().m48999H2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m102104k(View view) {
        getAct().startActivity(ChatPartnerHistoryAct.m44113Z1(getAct()));
        i4g0.m138520r("e_chatting_partner_signal_list", getAct().pageId());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f74583q;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f74583q;
    }

    /* JADX INFO: renamed from: e */
    public View m102105e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return c25.m107675b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(w15 w15Var) {
        this.f74584r = w15Var;
    }

    /* JADX INFO: renamed from: i */
    public void m102107i() {
        uqb0.f180374G.m127115L0(this.f74568b, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlNLTjI1V0czRlZIVUZQNlNNQ1pUTVpVUVFEWDQ3VTE0IiwidyI6MTM1MCwiaCI6MTA4MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjkxNDY1Mjg2MDk4Njh9.webp");
        bnl0.m105540X(this.f74569c, vnb.m201954n1(getAct()) + qa00.m175859d(6.0f));
        uqb0.f180374G.m127115L0(this.f74574h, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall().formatted());
        if (CoreModule.m30932N().mo61460Gc() == null) {
            this.f74575i.setImageResource(dbc0.f87273o5);
        } else {
            uqb0.f180374G.m127115L0(this.f74575i, CoreModule.m30932N().mo61460Gc().emotion.emojiUrl);
        }
        bnl0.m105509E0(this.f74569c, new View.OnClickListener() { // from class: l.y15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197076a.m102103j(view);
            }
        });
        bnl0.m105509E0(this.f74570d, new View.OnClickListener() { // from class: l.z15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202481a.m102104k(view);
            }
        });
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m102105e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m102108l(View view) {
        boolean zIsEmpty = TextUtils.isEmpty(this.f74584r.m204386j0());
        w15 w15Var = this.f74584r;
        if (!zIsEmpty) {
            o1j0.m165651y(w15Var.m204386j0());
            return;
        }
        if (NullChecker.m82486a(w15Var.m204385i0())) {
            if (w20.m204491f(getAct())) {
                getAct().startActivity(ChatPartnerSelectFriendAct.m44117a2(getAct(), this.f74584r.m204384h0(), this.f74584r.m204385i0().f21111id, "fixtion"));
                getAct().m48999H2();
            }
            i4g0.m138523u("e_sent_chatting_partner_signal", getAct().pageId(), pf60.m172085a("word_content", this.f74584r.m204385i0().value));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m102109m(@NonNull ChatPartners chatPartners) {
        List<ChatPartnerText> list = chatPartners.texts;
        if (!jyb.m147479J(list)) {
            this.f74584r.m204388m0(list.get(0));
            this.f74576j.setText(list.get(0).value);
            list.remove(0);
        }
        this.f74578l.setAdapter(new C15899a(list));
        if (NullChecker.m82486a(this.f74584r.m204385i0())) {
            i4g0.m138492A("e_preset_word", getAct().pageId(), pf60.m172085a("word_content", this.f74584r.m204385i0().value));
        }
        this.f74582p.setText("我的信号次数：" + this.f74584r.m204384h0().remainSignalCount);
        int i = this.f74584r.m204384h0().remainSignalCount;
        FrameLayout frameLayout = this.f74580n;
        if (i <= 0) {
            frameLayout.setBackgroundResource(dbc0.f86525R4);
        } else {
            frameLayout.setBackgroundResource(dbc0.f86493Q4);
            bnl0.m105509E0(this.f74580n, new View.OnClickListener() { // from class: l.x15
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f191983a.m102108l(view);
                }
            });
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
