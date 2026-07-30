package p007l;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationFeedFrag;
import com.p000p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationHeaderView;
import com.p1.mobile.android.app.Act;
import java.util.List;
import l.d30;
import l.e30;
import l.jxk;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.s7m;
import l.xdl0;
import v.VEditText;
import v.VLinear;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class h4j0 implements s7m<y3j0> {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f8579a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f8580b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f8581c;

    /* JADX INFO: renamed from: d */
    public View f8582d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f8583e;

    /* JADX INFO: renamed from: f */
    public VEditText f8584f;

    /* JADX INFO: renamed from: g */
    public TextView f8585g;

    /* JADX INFO: renamed from: h */
    public VLinear f8586h;

    /* JADX INFO: renamed from: i */
    public l3j0 f8587i;

    /* JADX INFO: renamed from: j */
    public TopicVoteAggregationHeaderView f8588j;

    /* JADX INFO: renamed from: k */
    public Act f8589k;

    /* JADX INFO: renamed from: l */
    public TopicVoteAggregationFeedFrag f8590l;

    /* JADX INFO: renamed from: m */
    public y3j0 f8591m;

    /* JADX INFO: renamed from: n */
    public boolean f8592n;

    /* JADX INFO: renamed from: o */
    public int f8593o;

    /* JADX INFO: renamed from: p */
    public e30<Boolean> f8594p = new e30() { // from class: l.c4j0
        public final void call(Object obj) {
            this.f6533a.m10529z((Boolean) obj);
        }
    };

    public h4j0(TopicVoteAggregationFeedFrag topicVoteAggregationFeedFrag) {
        this.f8590l = topicVoteAggregationFeedFrag;
        this.f8589k = topicVoteAggregationFeedFrag.act();
    }

    /* JADX INFO: renamed from: l */
    private void m10526l(d30 d30Var) {
        v1h.m15219P0(this.f8589k, new d30() { // from class: l.g4j0
            public final void call() {
                lsi0.w(R$string.f374I3);
            }
        }, false, d30Var, w1h.f14363c);
    }

    /* JADX INFO: renamed from: n */
    private void m10527n() {
        y3j0 y3j0Var = this.f8591m;
        y3j0Var.f15240h = "";
        y3j0Var.f15239g = null;
    }

    /* JADX INFO: renamed from: s */
    private void m10528s() {
        this.f8584f.setHint(this.f8589k.getString(R$string.f340D));
        if (sti.m14315a()) {
            this.f8593o = this.f8584f.getInputType();
            this.f8584f.setInputType(0);
        }
        this.f8584f.setOnTouchListener(new View.OnTouchListener() { // from class: l.z3j0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f15576a.m10547v(view, motionEvent);
            }
        });
        this.f8589k.duringCreated(this.f8584f.i(true)).subscribe(mkd0.G(new e30() { // from class: l.a4j0
            public final void call(Object obj) {
                this.f5580a.m10548w((CharSequence) obj);
            }
        }));
        this.f8585g.setOnClickListener(new View.OnClickListener() { // from class: l.b4j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5927a.m10550y(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m10529z(Boolean bool) {
        this.f8592n = bool.booleanValue();
        if (bool.booleanValue()) {
            return;
        }
        this.f8584f.setHint(this.f8589k.getString(R$string.f340D));
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m10530A(String str, String str2) {
        this.f8584f.setInputType(this.f8593o);
        m10539J(str, str2);
    }

    /* JADX INFO: renamed from: B */
    public void m10531B(Throwable th) {
        this.f8591m.f15243k = true;
        xdl0.M(this.f8580b, false);
    }

    /* JADX INFO: renamed from: C */
    public void m10532C(MomentMessage momentMessage) {
        this.f8587i.mo9401e0(momentMessage);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m10533C0() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m10534E(List<MomentMessage> list) {
        this.f8587i.mo9400d0(list);
    }

    /* JADX INFO: renamed from: F */
    public void m10535F() {
        this.f8579a.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: G */
    public void m10536G(q3j0 q3j0Var, TopicMoment topicMoment, int i) {
        this.f8588j.m7341d(q3j0Var, topicMoment, i, this.f8591m.f15237e);
    }

    /* JADX INFO: renamed from: H */
    public void m10537H(boolean z) {
        xdl0.M(this.f8580b, z);
    }

    /* JADX INFO: renamed from: I */
    public void m10538I(final String str, final String str2) {
        xdl0.A(this.f8584f);
        if (sti.m14315a()) {
            m10526l(new d30() { // from class: l.e4j0
                public final void call() {
                    this.f7209a.m10530A(str, str2);
                }
            });
        } else {
            m10539J(str, str2);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m10539J(String str, String str2) {
        this.f8589k.showInput(this.f8584f, 0);
        this.f8584f.setHint(this.f8591m.m16907D0(str, str2));
    }

    /* JADX INFO: renamed from: K */
    public void m10540K() {
        this.f8589k.hideInput();
        this.f8584f.setHint(this.f8589k.getString(R$string.f340D));
        this.f8584f.setText(null);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM10542k = m10542k(layoutInflater, viewGroup);
        this.f8588j = new TopicVoteAggregationHeaderView(this.f8589k);
        this.f8588j.setLayoutParams(new RecyclerView.p(-1, -2));
        this.f8590l.duringCreated(Act.keyboardListenerObservable(viewM10542k)).subscribe(this.f8594p);
        return viewM10542k;
    }

    /* JADX INFO: renamed from: k */
    public View m10542k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return i4j0.m10775b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m10541i1(y3j0 y3j0Var) {
        this.f8591m = y3j0Var;
    }

    /* JADX INFO: renamed from: p */
    public void m10544p(String str) {
        this.f8589k.setTitle(str);
    }

    /* JADX INFO: renamed from: q */
    public void m10545q(Bundle bundle) {
        this.f8579a.getItemAnimator().setAddDuration(0L);
        this.f8579a.getItemAnimator().setChangeDuration(0L);
        this.f8579a.getItemAnimator().setMoveDuration(0L);
        this.f8579a.getItemAnimator().setRemoveDuration(0L);
        m10528s();
        l3j0 l3j0Var = new l3j0(this.f8589k, this.f8591m);
        this.f8587i = l3j0Var;
        jxk jxkVar = new jxk(l3j0Var);
        jxkVar.H(this.f8588j);
        this.f8579a.setAdapter(jxkVar);
        this.f8591m.m16910m0();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m10546u() {
        this.f8584f.setInputType(this.f8593o);
        m10527n();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ boolean m10547v(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && !this.f8592n && TextUtils.isEmpty(this.f8584f.getText())) {
            if (sti.m14315a()) {
                m10526l(new d30() { // from class: l.f4j0
                    public final void call() {
                        this.f7981a.m10546u();
                    }
                });
                return false;
            }
            m10527n();
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m10548w(CharSequence charSequence) {
        Editable text = this.f8584f.getText();
        this.f8585g.setEnabled((text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m10549x(MomentMessage momentMessage) {
        this.f8591m.m16906C0(momentMessage);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m10550y(View view) {
        final MomentMessage momentMessage = new MomentMessage();
        momentMessage.value = this.f8584f.getText().toString();
        if (qib0.Z.K(this.f8584f.getText().toString().trim())) {
            v1h.m15189A0(this.f8589k, new d30() { // from class: l.d4j0
                public final void call() {
                    this.f6816a.m10549x(momentMessage);
                }
            }, false);
        } else {
            this.f8591m.m16906C0(momentMessage);
        }
    }

    public void destroy() {
    }
}
