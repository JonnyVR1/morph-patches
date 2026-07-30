package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationFeedFrag;
import com.p046p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationHeaderView;
import java.util.List;
import p147v.VEditText;
import p147v.VLinear;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public class h4j0 implements s7m<y3j0> {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f105842a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f105843b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f105844c;

    /* JADX INFO: renamed from: d */
    public View f105845d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f105846e;

    /* JADX INFO: renamed from: f */
    public VEditText f105847f;

    /* JADX INFO: renamed from: g */
    public TextView f105848g;

    /* JADX INFO: renamed from: h */
    public VLinear f105849h;

    /* JADX INFO: renamed from: i */
    public l3j0 f105850i;

    /* JADX INFO: renamed from: j */
    public TopicVoteAggregationHeaderView f105851j;

    /* JADX INFO: renamed from: k */
    public Act f105852k;

    /* JADX INFO: renamed from: l */
    public TopicVoteAggregationFeedFrag f105853l;

    /* JADX INFO: renamed from: m */
    public y3j0 f105854m;

    /* JADX INFO: renamed from: n */
    public boolean f105855n;

    /* JADX INFO: renamed from: o */
    public int f105856o;

    /* JADX INFO: renamed from: p */
    public e30<Boolean> f105857p = new e30() { // from class: l.c4j0
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f79276a.m129255z((Boolean) obj);
        }
    };

    public h4j0(TopicVoteAggregationFeedFrag topicVoteAggregationFeedFrag) {
        this.f105853l = topicVoteAggregationFeedFrag;
        this.f105852k = topicVoteAggregationFeedFrag.act();
    }

    /* JADX INFO: renamed from: l */
    private void m129252l(d30 d30Var) {
        v1h.m196580P0(this.f105852k, new d30() { // from class: l.g4j0
            @Override // p149l.d30
            public final void call() {
                lsi0.m151593w(R$string.f38913I3);
            }
        }, false, d30Var, w1h.f184005c);
    }

    /* JADX INFO: renamed from: n */
    private void m129253n() {
        y3j0 y3j0Var = this.f105854m;
        y3j0Var.f195824h = "";
        y3j0Var.f195823g = null;
    }

    /* JADX INFO: renamed from: s */
    private void m129254s() {
        this.f105847f.setHint(this.f105852k.getString(R$string.f38879D));
        if (sti.m185955a()) {
            this.f105856o = this.f105847f.getInputType();
            this.f105847f.setInputType(0);
        }
        this.f105847f.setOnTouchListener(new View.OnTouchListener() { // from class: l.z3j0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f201377a.m129271v(view, motionEvent);
            }
        });
        this.f105852k.duringCreated(this.f105847f.mo28618i(true)).subscribe(mkd0.m154955G(new e30() { // from class: l.a4j0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67537a.m129272w((CharSequence) obj);
            }
        }));
        this.f105848g.setOnClickListener(new View.OnClickListener() { // from class: l.b4j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73380a.m129274y(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m129255z(Boolean bool) {
        this.f105855n = bool.booleanValue();
        if (bool.booleanValue()) {
            return;
        }
        this.f105847f.setHint(this.f105852k.getString(R$string.f38879D));
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m129256A(String str, String str2) {
        this.f105847f.setInputType(this.f105856o);
        m129264J(str, str2);
    }

    /* JADX INFO: renamed from: B */
    public void m129257B(Throwable th) {
        this.f105854m.f195827k = true;
        xdl0.m208344M(this.f105843b, false);
    }

    /* JADX INFO: renamed from: C */
    public void m129258C(MomentMessage momentMessage) {
        this.f105850i.mo111806e0(momentMessage);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m129259E(List<MomentMessage> list) {
        this.f105850i.mo111805d0(list);
    }

    /* JADX INFO: renamed from: F */
    public void m129260F() {
        this.f105842a.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: G */
    public void m129261G(q3j0 q3j0Var, TopicMoment topicMoment, int i) {
        this.f105851j.m66183d(q3j0Var, topicMoment, i, this.f105854m.f195821e);
    }

    /* JADX INFO: renamed from: H */
    public void m129262H(boolean z) {
        xdl0.m208344M(this.f105843b, z);
    }

    /* JADX INFO: renamed from: I */
    public void m129263I(final String str, final String str2) {
        xdl0.m208320A(this.f105847f);
        if (sti.m185955a()) {
            m129252l(new d30() { // from class: l.e4j0
                @Override // p149l.d30
                public final void call() {
                    this.f89289a.m129256A(str, str2);
                }
            });
        } else {
            m129264J(str, str2);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m129264J(String str, String str2) {
        this.f105852k.showInput(this.f105847f, 0);
        this.f105847f.setHint(this.f105854m.m212831D0(str, str2));
    }

    /* JADX INFO: renamed from: K */
    public void m129265K() {
        this.f105852k.hideInput();
        this.f105847f.setHint(this.f105852k.getString(R$string.f38879D));
        this.f105847f.setText((CharSequence) null);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM129266k = m129266k(layoutInflater, viewGroup);
        this.f105851j = new TopicVoteAggregationHeaderView(this.f105852k);
        this.f105851j.setLayoutParams(new RecyclerView.C0578p(-1, -2));
        this.f105853l.duringCreated(Act.keyboardListenerObservable(viewM129266k)).subscribe(this.f105857p);
        return viewM129266k;
    }

    /* JADX INFO: renamed from: k */
    public View m129266k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return i4j0.m134366b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(y3j0 y3j0Var) {
        this.f105854m = y3j0Var;
    }

    /* JADX INFO: renamed from: p */
    public void m129268p(String str) {
        this.f105852k.setTitle(str);
    }

    /* JADX INFO: renamed from: q */
    public void m129269q(Bundle bundle) {
        this.f105842a.getItemAnimator().setAddDuration(0L);
        this.f105842a.getItemAnimator().setChangeDuration(0L);
        this.f105842a.getItemAnimator().setMoveDuration(0L);
        this.f105842a.getItemAnimator().setRemoveDuration(0L);
        m129254s();
        l3j0 l3j0Var = new l3j0(this.f105852k, this.f105854m);
        this.f105850i = l3j0Var;
        jxk jxkVar = new jxk(l3j0Var);
        jxkVar.m143815H(this.f105851j);
        this.f105842a.setAdapter(jxkVar);
        this.f105854m.m212834m0();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m129270u() {
        this.f105847f.setInputType(this.f105856o);
        m129253n();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ boolean m129271v(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && !this.f105855n && TextUtils.isEmpty(this.f105847f.getText())) {
            if (sti.m185955a()) {
                m129252l(new d30() { // from class: l.f4j0
                    @Override // p149l.d30
                    public final void call() {
                        this.f94829a.m129270u();
                    }
                });
                return false;
            }
            m129253n();
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m129272w(CharSequence charSequence) {
        Editable text = this.f105847f.getText();
        this.f105848g.setEnabled((text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m129273x(MomentMessage momentMessage) {
        this.f105854m.m212830C0(momentMessage);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m129274y(View view) {
        final MomentMessage momentMessage = new MomentMessage();
        momentMessage.value = this.f105847f.getText().toString();
        if (qib0.f154711Z.m119125K(this.f105847f.getText().toString().trim())) {
            v1h.m196550A0(this.f105852k, new d30() { // from class: l.d4j0
                @Override // p149l.d30
                public final void call() {
                    this.f84311a.m129273x(momentMessage);
                }
            }, false);
        } else {
            this.f105854m.m212830C0(momentMessage);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
