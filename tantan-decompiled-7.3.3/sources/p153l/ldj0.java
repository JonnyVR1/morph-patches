package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationFeedFrag;
import com.p051p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationHeaderView;
import java.util.List;
import p151v.VEditText;
import p151v.VLinear;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class ldj0 implements iam<cdj0> {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f131636a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f131637b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f131638c;

    /* JADX INFO: renamed from: d */
    public View f131639d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f131640e;

    /* JADX INFO: renamed from: f */
    public VEditText f131641f;

    /* JADX INFO: renamed from: g */
    public TextView f131642g;

    /* JADX INFO: renamed from: h */
    public VLinear f131643h;

    /* JADX INFO: renamed from: i */
    public pcj0 f131644i;

    /* JADX INFO: renamed from: j */
    public TopicVoteAggregationHeaderView f131645j;

    /* JADX INFO: renamed from: k */
    public Act f131646k;

    /* JADX INFO: renamed from: l */
    public TopicVoteAggregationFeedFrag f131647l;

    /* JADX INFO: renamed from: m */
    public cdj0 f131648m;

    /* JADX INFO: renamed from: n */
    public boolean f131649n;

    /* JADX INFO: renamed from: o */
    public int f131650o;

    /* JADX INFO: renamed from: p */
    public y20<Boolean> f131651p = new y20() { // from class: l.gdj0
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f103714a.m153761z((Boolean) obj);
        }
    };

    public ldj0(TopicVoteAggregationFeedFrag topicVoteAggregationFeedFrag) {
        this.f131647l = topicVoteAggregationFeedFrag;
        this.f131646k = topicVoteAggregationFeedFrag.act();
    }

    /* JADX INFO: renamed from: l */
    private void m153758l(x20 x20Var) {
        k3h.m148057P0(this.f131646k, new x20() { // from class: l.kdj0
            @Override // p153l.x20
            public final void call() {
                o1j0.m165649w(R$string.f39761I3);
            }
        }, false, x20Var, l3h.f129877c);
    }

    /* JADX INFO: renamed from: n */
    private void m153759n() {
        cdj0 cdj0Var = this.f131648m;
        cdj0Var.f81231h = "";
        cdj0Var.f81230g = null;
    }

    /* JADX INFO: renamed from: s */
    private void m153760s() {
        this.f131641f.setHint(this.f131646k.getString(R$string.f39727D));
        if (owi.m169565a()) {
            this.f131650o = this.f131641f.getInputType();
            this.f131641f.setInputType(0);
        }
        this.f131641f.setOnTouchListener(new View.OnTouchListener() { // from class: l.ddj0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f87940a.m153777v(view, motionEvent);
            }
        });
        this.f131646k.duringCreated(this.f131641f.mo29617i(true)).subscribe(psd0.m173596G(new y20() { // from class: l.edj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93528a.m153778w((CharSequence) obj);
            }
        }));
        this.f131642g.setOnClickListener(new View.OnClickListener() { // from class: l.fdj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98480a.m153780y(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m153761z(Boolean bool) {
        this.f131649n = bool.booleanValue();
        if (bool.booleanValue()) {
            return;
        }
        this.f131641f.setHint(this.f131646k.getString(R$string.f39727D));
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m153762A(String str, String str2) {
        this.f131641f.setInputType(this.f131650o);
        m153770J(str, str2);
    }

    /* JADX INFO: renamed from: B */
    public void m153763B(Throwable th) {
        this.f131648m.f81234k = true;
        bnl0.m105524M(this.f131637b, false);
    }

    /* JADX INFO: renamed from: C */
    public void m153764C(MomentMessage momentMessage) {
        this.f131644i.mo115866e0(momentMessage);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m153765E(List<MomentMessage> list) {
        this.f131644i.mo115865d0(list);
    }

    /* JADX INFO: renamed from: F */
    public void m153766F() {
        this.f131636a.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: G */
    public void m153767G(ucj0 ucj0Var, TopicMoment topicMoment, int i) {
        this.f131645j.m67366d(ucj0Var, topicMoment, i, this.f131648m.f81228e);
    }

    /* JADX INFO: renamed from: H */
    public void m153768H(boolean z) {
        bnl0.m105524M(this.f131637b, z);
    }

    /* JADX INFO: renamed from: I */
    public void m153769I(final String str, final String str2) {
        bnl0.m105500A(this.f131641f);
        if (owi.m169565a()) {
            m153758l(new x20() { // from class: l.idj0
                @Override // p153l.x20
                public final void call() {
                    this.f114506a.m153762A(str, str2);
                }
            });
        } else {
            m153770J(str, str2);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m153770J(String str, String str2) {
        this.f131646k.showInput(this.f131641f, 0);
        this.f131641f.setHint(this.f131648m.m109211D0(str, str2));
    }

    /* JADX INFO: renamed from: K */
    public void m153771K() {
        this.f131646k.hideInput();
        this.f131641f.setHint(this.f131646k.getString(R$string.f39727D));
        this.f131641f.setText((CharSequence) null);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM153772k = m153772k(layoutInflater, viewGroup);
        this.f131645j = new TopicVoteAggregationHeaderView(this.f131646k);
        this.f131645j.setLayoutParams(new RecyclerView.C0580p(-1, -2));
        this.f131647l.duringCreated(Act.keyboardListenerObservable(viewM153772k)).subscribe(this.f131651p);
        return viewM153772k;
    }

    /* JADX INFO: renamed from: k */
    public View m153772k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mdj0.m157978b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(cdj0 cdj0Var) {
        this.f131648m = cdj0Var;
    }

    /* JADX INFO: renamed from: p */
    public void m153774p(String str) {
        this.f131646k.setTitle(str);
    }

    /* JADX INFO: renamed from: q */
    public void m153775q(Bundle bundle) {
        this.f131636a.getItemAnimator().setAddDuration(0L);
        this.f131636a.getItemAnimator().setChangeDuration(0L);
        this.f131636a.getItemAnimator().setMoveDuration(0L);
        this.f131636a.getItemAnimator().setRemoveDuration(0L);
        m153760s();
        pcj0 pcj0Var = new pcj0(this.f131646k, this.f131648m);
        this.f131644i = pcj0Var;
        zzk zzkVar = new zzk(pcj0Var);
        zzkVar.m222265H(this.f131645j);
        this.f131636a.setAdapter(zzkVar);
        this.f131648m.m109214m0();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m153776u() {
        this.f131641f.setInputType(this.f131650o);
        m153759n();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ boolean m153777v(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && !this.f131649n && TextUtils.isEmpty(this.f131641f.getText())) {
            if (owi.m169565a()) {
                m153758l(new x20() { // from class: l.jdj0
                    @Override // p153l.x20
                    public final void call() {
                        this.f120270a.m153776u();
                    }
                });
                return false;
            }
            m153759n();
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m153778w(CharSequence charSequence) {
        Editable text = this.f131641f.getText();
        this.f131642g.setEnabled((text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m153779x(MomentMessage momentMessage) {
        this.f131648m.m109210C0(momentMessage);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m153780y(View view) {
        final MomentMessage momentMessage = new MomentMessage();
        momentMessage.value = this.f131641f.getText().toString();
        if (uqb0.f180394Z.m95954K(this.f131641f.getText().toString().trim())) {
            k3h.m148027A0(this.f131646k, new x20() { // from class: l.hdj0
                @Override // p153l.x20
                public final void call() {
                    this.f109005a.m153779x(momentMessage);
                }
            }, false);
        } else {
            this.f131648m.m109210C0(momentMessage);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
