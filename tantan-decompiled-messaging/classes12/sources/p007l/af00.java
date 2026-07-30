package p007l;

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
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentDetailAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.e30;
import l.mkd0;
import l.q860;
import l.qib0;
import l.s7m;
import l.t100;
import l.xdl0;
import v.VEditText;
import v.VList;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class af00 implements s7m<qe00> {

    /* JADX INFO: renamed from: a */
    public VList f5718a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f5719b;

    /* JADX INFO: renamed from: c */
    public VEditText f5720c;

    /* JADX INFO: renamed from: d */
    public VText f5721d;

    /* JADX INFO: renamed from: e */
    public View f5722e;

    /* JADX INFO: renamed from: f */
    public qe00 f5723f;

    /* JADX INFO: renamed from: g */
    public MomentDetailAct f5724g;

    /* JADX INFO: renamed from: h */
    public View f5725h;

    /* JADX INFO: renamed from: i */
    public gc00 f5726i;

    /* JADX INFO: renamed from: j */
    public m900 f5727j;

    /* JADX INFO: renamed from: k */
    public List<MomentMessage> f5728k = new ArrayList(0);

    /* JADX INFO: renamed from: l */
    public e30<Boolean> f5729l = new e30() { // from class: l.re00
        public final void call(Object obj) {
            this.f12623a.m8518x((Boolean) obj);
        }
    };

    public af00(MomentDetailAct momentDetailAct) {
        this.f5724g = momentDetailAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m8517s(View view) {
        xdl0.A(this.f5720c);
        this.f5724g.showInput(this.f5720c, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m8518x(Boolean bool) {
        this.f5718a.setOnTouchListener(bool.booleanValue() ? new View.OnTouchListener() { // from class: l.se00
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f12893a.m8534w(view, motionEvent);
            }
        } : null);
        if (bool.booleanValue()) {
            this.f5718a.setSelectionFromTop(this.f5728k.size() + 1, this.f5718a.getMeasuredHeight());
        } else {
            this.f5720c.clearFocus();
        }
    }

    /* JADX INFO: renamed from: A */
    public void m8519A() {
        final String string = this.f5720c.getText().toString();
        if (TextUtils.isEmpty(string.trim())) {
            return;
        }
        if (qib0.Z.K(string)) {
            v1h.m15275z0(this.f5724g, new d30() { // from class: l.xe00
                public final void call() {
                    this.f14873a.m8535y(string);
                }
            });
        } else {
            this.f5723f.m13543V0(string);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m8520B(q860<MomentMessage> q860Var) {
        this.f5728k = Lists.q(q860Var.a);
        this.f5726i.mo7862d(q860Var);
        this.f5727j.m11868t(this.f5728k);
    }

    /* JADX INFO: renamed from: C */
    public void m8521C(Moment moment) {
        this.f5726i.mo7861c(moment);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8522C0() {
        return this.f5724g;
    }

    /* JADX INFO: renamed from: E */
    public void m8523E(User user) {
        this.f5726i.mo7864f(user);
    }

    /* JADX INFO: renamed from: F */
    public void m8524F(User user, int i) {
        this.f5726i.mo7859a(user, i);
    }

    @Nullable
    public Act act() {
        return this.f5724g;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m8526k(layoutInflater, viewGroup);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.widget.ListAdapter, l.m900] */
    public void init() {
        this.f5724g.setTitle(R$string.f392L3);
        gc00 gc00Var = this.f5726i;
        qe00 qe00Var = this.f5723f;
        gc00Var.mo7863e(qe00Var.f12212c, qe00Var.f12211b, qe00Var.f12213d, qe00Var.f12214e);
        this.f5718a.addHeaderView(this.f5725h, null, false);
        this.f5718a.addFooterView(this.f5724g.inflater().inflate(o6c0.f11151W3, (ViewGroup) this.f5718a, false));
        View view = new View(this.f5724g);
        view.setMinimumHeight(t100.d(48.0f));
        xdl0.y(view, false);
        this.f5718a.addFooterView(view);
        ?? m900Var = new m900(this.f5724g);
        this.f5727j = m900Var;
        this.f5718a.setAdapter((ListAdapter) m900Var);
        this.f5718a.setRecyclerListener(this.f5727j);
        boolean zShouldLockComment = qib0.b0.b.shouldLockComment(this.f5723f.f12212c);
        View view2 = this.f5722e;
        if (zShouldLockComment) {
            xdl0.M(view2, true);
            this.f5722e.setOnClickListener(new View.OnClickListener() { // from class: l.te00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f13268a.m8531q(view3);
                }
            });
        } else {
            xdl0.M(view2, false);
        }
        this.f5720c.setOnClickListener(new View.OnClickListener() { // from class: l.ue00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.f13815a.m8517s(view3);
            }
        });
        this.f5720c.i(true).subscribe(mkd0.G(new e30() { // from class: l.ve00
            public final void call(Object obj) {
                this.f14152a.m8532u((CharSequence) obj);
            }
        }));
        this.f5721d.setOnClickListener(new View.OnClickListener() { // from class: l.we00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.f14513a.m8533v(view3);
            }
        });
        boolean zIsCurrentMessageBlock = qib0.b0.b.isCurrentMessageBlock(this.f5723f.f12212c);
        LinearLayout linearLayout = this.f5719b;
        if (zIsCurrentMessageBlock) {
            xdl0.M(linearLayout, false);
        } else {
            xdl0.M(linearLayout, !this.f5723f.f12214e);
        }
    }

    /* JADX INFO: renamed from: k */
    public View m8526k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bf00.m8812b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m8527l() {
        this.f5720c.setText(null);
        this.f5724g.postDelayed(new Runnable() { // from class: l.ye00
            @Override // java.lang.Runnable
            public final void run() {
                this.f15406a.m8530p();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m8525i1(qe00 qe00Var) {
        this.f5723f = qe00Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public void m8529n(View view, ViewGroup viewGroup) {
        View viewInflate = this.f5724g.inflater().inflate(o6c0.f11295r4, viewGroup, false);
        this.f5725h = viewInflate;
        this.f5726i = (gc00) viewInflate;
        this.f5724g.setKeyboardListener(view, this.f5729l);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m8530p() {
        this.f5718a.setSelectionFromTop(this.f5728k.size() + 1, 0);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m8531q(View view) {
        qib0.b0.b.showProofAgeDlg(act(), "moment_detail");
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m8532u(CharSequence charSequence) {
        Editable text = this.f5720c.getText();
        if (text == null || text.toString().trim().isEmpty()) {
            this.f5721d.setEnabled(false);
            this.f5721d.setTextColor(this.f5724g.getResources().getColor(e1c0.f7153m0));
        } else {
            this.f5721d.setEnabled(true);
            this.f5721d.setTextColor(this.f5724g.getResources().getColor(e1c0.f7149k0));
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m8533v(View view) {
        this.f5724g.hideInput(this.f5720c);
        this.f5720c.clearFocus();
        if (ijb0.m10913X(this.f5723f.f12212c).unilateralBlock()) {
            this.f5720c.setText("");
        } else {
            m8519A();
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean m8534w(View view, MotionEvent motionEvent) {
        return this.f5724g.hideInput(this.f5720c);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m8535y(String str) {
        this.f5723f.m13543V0(str);
    }

    /* JADX INFO: renamed from: z */
    public void m8536z() {
        if (NullChecker.a(this.f5726i)) {
            this.f5726i.mo7860b();
        }
    }

    public void destroy() {
    }
}
