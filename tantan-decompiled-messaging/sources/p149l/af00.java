package p149l;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import com.google.common.collect.Lists;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentDetailAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VEditText;
import p147v.VList;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class af00 implements s7m<qe00> {

    /* JADX INFO: renamed from: a */
    public VList f69134a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f69135b;

    /* JADX INFO: renamed from: c */
    public VEditText f69136c;

    /* JADX INFO: renamed from: d */
    public VText f69137d;

    /* JADX INFO: renamed from: e */
    public View f69138e;

    /* JADX INFO: renamed from: f */
    public qe00 f69139f;

    /* JADX INFO: renamed from: g */
    public MomentDetailAct f69140g;

    /* JADX INFO: renamed from: h */
    public View f69141h;

    /* JADX INFO: renamed from: i */
    public gc00 f69142i;

    /* JADX INFO: renamed from: j */
    public m900 f69143j;

    /* JADX INFO: renamed from: k */
    public List<MomentMessage> f69144k = new ArrayList(0);

    /* JADX INFO: renamed from: l */
    public e30<Boolean> f69145l = new e30() { // from class: l.re00
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f159021a.m96166x((Boolean) obj);
        }
    };

    public af00(MomentDetailAct momentDetailAct) {
        this.f69140g = momentDetailAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m96165s(View view) {
        xdl0.m208320A(this.f69136c);
        this.f69140g.showInput(this.f69136c, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m96166x(Boolean bool) {
        this.f69134a.setOnTouchListener(bool.booleanValue() ? new View.OnTouchListener() { // from class: l.se00
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f163926a.m96180w(view, motionEvent);
            }
        } : null);
        if (bool.booleanValue()) {
            this.f69134a.setSelectionFromTop(this.f69144k.size() + 1, this.f69134a.getMeasuredHeight());
        } else {
            this.f69136c.clearFocus();
        }
    }

    /* JADX INFO: renamed from: A */
    public void m96167A() {
        final String string = this.f69136c.getText().toString();
        if (TextUtils.isEmpty(string.trim())) {
            return;
        }
        if (qib0.f154711Z.m119125K(string)) {
            v1h.m196636z0(this.f69140g, new d30() { // from class: l.xe00
                @Override // p149l.d30
                public final void call() {
                    this.f192514a.m96181y(string);
                }
            });
        } else {
            this.f69139f.m174171V0(string);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m96168B(q860<MomentMessage> q860Var) {
        this.f69144k = Lists.m15930q(q860Var.f153135a);
        this.f69142i.mo66671d(q860Var);
        this.f69143j.m153565t(this.f69144k);
    }

    /* JADX INFO: renamed from: C */
    public void m96169C(Moment moment) {
        this.f69142i.mo66670c(moment);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f69140g;
    }

    /* JADX INFO: renamed from: E */
    public void m96170E(User user) {
        this.f69142i.mo66673f(user);
    }

    /* JADX INFO: renamed from: F */
    public void m96171F(User user, int i) {
        this.f69142i.mo66668a(user, i);
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f69140g;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m96172k(layoutInflater, viewGroup);
    }

    public void init() {
        this.f69140g.setTitle(R$string.f38931L3);
        gc00 gc00Var = this.f69142i;
        qe00 qe00Var = this.f69139f;
        gc00Var.mo66672e(qe00Var.f153985c, qe00Var.f153984b, qe00Var.f153986d, qe00Var.f153987e);
        this.f69134a.addHeaderView(this.f69141h, null, false);
        this.f69134a.addFooterView(this.f69140g.inflater().inflate(o6c0.f142132W3, (ViewGroup) this.f69134a, false));
        View view = new View(this.f69140g);
        view.setMinimumHeight(t100.m186890d(48.0f));
        xdl0.m208411y(view, false);
        this.f69134a.addFooterView(view);
        m900 m900Var = new m900(this.f69140g);
        this.f69143j = m900Var;
        this.f69134a.setAdapter((ListAdapter) m900Var);
        this.f69134a.setRecyclerListener(this.f69143j);
        boolean zShouldLockComment = qib0.f154713b0.f139231b.shouldLockComment(this.f69139f.f153985c);
        View view2 = this.f69138e;
        if (zShouldLockComment) {
            xdl0.m208344M(view2, true);
            this.f69138e.setOnClickListener(new View.OnClickListener() { // from class: l.te00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f169789a.m96177q(view3);
                }
            });
        } else {
            xdl0.m208344M(view2, false);
        }
        this.f69136c.setOnClickListener(new View.OnClickListener() { // from class: l.ue00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.f175982a.m96165s(view3);
            }
        });
        this.f69136c.mo28618i(true).subscribe(mkd0.m154955G(new e30() { // from class: l.ve00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181143a.m96178u((CharSequence) obj);
            }
        }));
        this.f69137d.setOnClickListener(new View.OnClickListener() { // from class: l.we00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.f185899a.m96179v(view3);
            }
        });
        boolean zIsCurrentMessageBlock = qib0.f154713b0.f139231b.isCurrentMessageBlock(this.f69139f.f153985c);
        LinearLayout linearLayout = this.f69135b;
        if (zIsCurrentMessageBlock) {
            xdl0.m208344M(linearLayout, false);
        } else {
            xdl0.m208344M(linearLayout, !this.f69139f.f153987e);
        }
    }

    /* JADX INFO: renamed from: k */
    public View m96172k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bf00.m101509b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m96173l() {
        this.f69136c.setText((CharSequence) null);
        this.f69140g.postDelayed(new Runnable() { // from class: l.ye00
            @Override // java.lang.Runnable
            public final void run() {
                this.f197653a.m96176p();
            }
        }, 200L);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(qe00 qe00Var) {
        this.f69139f = qe00Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public void m96175n(View view, ViewGroup viewGroup) {
        View viewInflate = this.f69140g.inflater().inflate(o6c0.f142276r4, viewGroup, false);
        this.f69141h = viewInflate;
        this.f69142i = (gc00) viewInflate;
        this.f69140g.setKeyboardListener(view, this.f69145l);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m96176p() {
        this.f69134a.setSelectionFromTop(this.f69144k.size() + 1, 0);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m96177q(View view) {
        qib0.f154713b0.f139231b.showProofAgeDlg(act(), "moment_detail");
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m96178u(CharSequence charSequence) {
        Editable text = this.f69136c.getText();
        if (text == null || text.toString().trim().isEmpty()) {
            this.f69137d.setEnabled(false);
            this.f69137d.setTextColor(this.f69140g.getResources().getColor(e1c0.f88797m0));
        } else {
            this.f69137d.setEnabled(true);
            this.f69137d.setTextColor(this.f69140g.getResources().getColor(e1c0.f88793k0));
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m96179v(View view) {
        this.f69140g.hideInput(this.f69136c);
        this.f69136c.clearFocus();
        if (ijb0.m136560X(this.f69139f.f153985c).unilateralBlock()) {
            this.f69136c.setText("");
        } else {
            m96167A();
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean m96180w(View view, MotionEvent motionEvent) {
        return this.f69140g.hideInput(this.f69136c);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m96181y(String str) {
        this.f69139f.m174171V0(str);
    }

    /* JADX INFO: renamed from: z */
    public void m96182z() {
        if (NullChecker.m81303a(this.f69142i)) {
            this.f69142i.mo66669b();
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
