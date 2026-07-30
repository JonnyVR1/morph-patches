package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentDetailAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VEditText;
import p151v.VList;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class jn00 implements iam<zm00> {

    /* JADX INFO: renamed from: a */
    public VList f121723a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f121724b;

    /* JADX INFO: renamed from: c */
    public VEditText f121725c;

    /* JADX INFO: renamed from: d */
    public VText f121726d;

    /* JADX INFO: renamed from: e */
    public View f121727e;

    /* JADX INFO: renamed from: f */
    public zm00 f121728f;

    /* JADX INFO: renamed from: g */
    public MomentDetailAct f121729g;

    /* JADX INFO: renamed from: h */
    public View f121730h;

    /* JADX INFO: renamed from: i */
    public pk00 f121731i;

    /* JADX INFO: renamed from: j */
    public vh00 f121732j;

    /* JADX INFO: renamed from: k */
    public List<MomentMessage> f121733k = new ArrayList(0);

    /* JADX INFO: renamed from: l */
    public y20<Boolean> f121734l = new y20() { // from class: l.an00
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f72301a.m146189x((Boolean) obj);
        }
    };

    public jn00(MomentDetailAct momentDetailAct) {
        this.f121729g = momentDetailAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m146188s(View view) {
        bnl0.m105500A(this.f121725c);
        this.f121729g.showInput(this.f121725c, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m146189x(Boolean bool) {
        this.f121723a.setOnTouchListener(bool.booleanValue() ? new View.OnTouchListener() { // from class: l.bn00
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f77428a.m146203w(view, motionEvent);
            }
        } : null);
        if (bool.booleanValue()) {
            this.f121723a.setSelectionFromTop(this.f121733k.size() + 1, this.f121723a.getMeasuredHeight());
        } else {
            this.f121725c.clearFocus();
        }
    }

    /* JADX INFO: renamed from: A */
    public void m146190A() {
        final String string = this.f121725c.getText().toString();
        if (TextUtils.isEmpty(string.trim())) {
            return;
        }
        if (uqb0.f180394Z.m95954K(string)) {
            k3h.m148113z0(this.f121729g, new x20() { // from class: l.gn00
                @Override // p153l.x20
                public final void call() {
                    this.f105051a.m146204y(string);
                }
            });
        } else {
            this.f121728f.m220344V0(string);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m146191B(vg60<MomentMessage> vg60Var) {
        this.f121733k = Lists.m15984q(vg60Var.f184001a);
        this.f121731i.mo67854d(vg60Var);
        this.f121732j.m201248t(this.f121733k);
    }

    /* JADX INFO: renamed from: C */
    public void m146192C(Moment moment) {
        this.f121731i.mo67853c(moment);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f121729g;
    }

    /* JADX INFO: renamed from: E */
    public void m146193E(User user) {
        this.f121731i.mo67856f(user);
    }

    /* JADX INFO: renamed from: F */
    public void m146194F(User user, int i) {
        this.f121731i.mo67851a(user, i);
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f121729g;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m146195k(layoutInflater, viewGroup);
    }

    public void init() {
        this.f121729g.setTitle(R$string.f39779L3);
        pk00 pk00Var = this.f121731i;
        zm00 zm00Var = this.f121728f;
        pk00Var.mo67855e(zm00Var.f205023c, zm00Var.f205022b, zm00Var.f205024d, zm00Var.f205025e);
        this.f121723a.addHeaderView(this.f121730h, null, false);
        this.f121723a.addFooterView(this.f121729g.inflater().inflate(tec0.f173601W3, (ViewGroup) this.f121723a, false));
        View view = new View(this.f121729g);
        view.setMinimumHeight(qa00.m175859d(48.0f));
        bnl0.m105591y(view, false);
        this.f121723a.addFooterView(view);
        vh00 vh00Var = new vh00(this.f121729g);
        this.f121732j = vh00Var;
        this.f121723a.setAdapter((ListAdapter) vh00Var);
        this.f121723a.setRecyclerListener(this.f121732j);
        boolean zShouldLockComment = uqb0.f180396b0.f170325b.shouldLockComment(this.f121728f.f205023c);
        View view2 = this.f121727e;
        if (zShouldLockComment) {
            bnl0.m105524M(view2, true);
            this.f121727e.setOnClickListener(new View.OnClickListener() { // from class: l.cn00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f82677a.m146200q(view3);
                }
            });
        } else {
            bnl0.m105524M(view2, false);
        }
        this.f121725c.setOnClickListener(new View.OnClickListener() { // from class: l.dn00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.f89748a.m146188s(view3);
            }
        });
        this.f121725c.mo29617i(true).subscribe(psd0.m173596G(new y20() { // from class: l.en00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94716a.m146201u((CharSequence) obj);
            }
        }));
        this.f121726d.setOnClickListener(new View.OnClickListener() { // from class: l.fn00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.f99863a.m146202v(view3);
            }
        });
        boolean zIsCurrentMessageBlock = uqb0.f180396b0.f170325b.isCurrentMessageBlock(this.f121728f.f205023c);
        LinearLayout linearLayout = this.f121724b;
        if (zIsCurrentMessageBlock) {
            bnl0.m105524M(linearLayout, false);
        } else {
            bnl0.m105524M(linearLayout, !this.f121728f.f205025e);
        }
    }

    /* JADX INFO: renamed from: k */
    public View m146195k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kn00.m150499b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m146196l() {
        this.f121725c.setText((CharSequence) null);
        this.f121729g.postDelayed(new Runnable() { // from class: l.hn00
            @Override // java.lang.Runnable
            public final void run() {
                this.f110688a.m146199p();
            }
        }, 200L);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(zm00 zm00Var) {
        this.f121728f = zm00Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public void m146198n(View view, ViewGroup viewGroup) {
        View viewInflate = this.f121729g.inflater().inflate(tec0.f173745r4, viewGroup, false);
        this.f121730h = viewInflate;
        this.f121731i = (pk00) viewInflate;
        this.f121729g.setKeyboardListener(view, this.f121734l);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m146199p() {
        this.f121723a.setSelectionFromTop(this.f121733k.size() + 1, 0);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m146200q(View view) {
        uqb0.f180396b0.f170325b.showProofAgeDlg(act(), "moment_detail");
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m146201u(CharSequence charSequence) {
        Editable text = this.f121725c.getText();
        if (text == null || text.toString().trim().isEmpty()) {
            this.f121726d.setEnabled(false);
            this.f121726d.setTextColor(this.f121729g.getResources().getColor(k9c0.f124520m0));
        } else {
            this.f121726d.setEnabled(true);
            this.f121726d.setTextColor(this.f121729g.getResources().getColor(k9c0.f124516k0));
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m146202v(View view) {
        this.f121729g.hideInput(this.f121725c);
        this.f121725c.clearFocus();
        if (mrb0.m159646X(this.f121728f.f205023c).unilateralBlock()) {
            this.f121725c.setText("");
        } else {
            m146190A();
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean m146203w(View view, MotionEvent motionEvent) {
        return this.f121729g.hideInput(this.f121725c);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m146204y(String str) {
        this.f121728f.m220344V0(str);
    }

    /* JADX INFO: renamed from: z */
    public void m146205z() {
        if (NullChecker.m82486a(this.f121731i)) {
            this.f121731i.mo67852b();
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
