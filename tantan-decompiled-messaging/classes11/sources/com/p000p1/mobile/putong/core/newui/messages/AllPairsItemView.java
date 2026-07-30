package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.dac0;
import l.e30;
import l.kj0;
import l.mkd0;
import l.qib0;
import l.sw6;
import l.t100;
import l.upa;
import l.x2c0;
import l.xdl0;
import p009l.gj0;
import p009l.hj0;
import p009l.lz4;
import p009l.wf6;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class AllPairsItemView extends FrameLayout implements View.OnClickListener, gj0 {

    /* JADX INFO: renamed from: a */
    public AllPairsItemView f3362a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f3363b;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f3364c;

    /* JADX INFO: renamed from: d */
    public VText f3365d;

    /* JADX INFO: renamed from: e */
    public VText f3366e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f3367f;

    /* JADX INFO: renamed from: g */
    public VText f3368g;

    /* JADX INFO: renamed from: h */
    public VText f3369h;

    /* JADX INFO: renamed from: i */
    public VText f3370i;

    /* JADX INFO: renamed from: j */
    public VText f3371j;

    /* JADX INFO: renamed from: k */
    public VText f3372k;

    /* JADX INFO: renamed from: l */
    public Conversation f3373l;

    /* JADX INFO: renamed from: m */
    public User f3374m;

    /* JADX INFO: renamed from: n */
    public int f3375n;

    /* JADX INFO: renamed from: o */
    public boolean f3376o;

    /* JADX INFO: renamed from: p */
    public View.OnClickListener f3377p;

    /* JADX INFO: renamed from: q */
    public d30 f3378q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.AllPairsItemView$a */
    public class C0265a implements d30 {
        public C0265a() {
        }

        public void call() {
            if (NullChecker.a(AllPairsItemView.this.f3377p)) {
                AllPairsItemView.this.f3377p.onClick(AllPairsItemView.this);
            }
        }
    }

    public AllPairsItemView(@NonNull Context context) {
        super(context);
        this.f3376o = false;
        this.f3378q = new C0265a();
    }

    @Override // p009l.gj0
    /* JADX INFO: renamed from: a */
    public void mo4632a(dac0<Conversation> dac0Var, Conversation conversation, int i, boolean z) {
        this.f3375n = i;
        this.f3373l = conversation;
        this.f3376o = z;
        dac0Var.c(m4635f(), CoreModule.c.e0.Ka(conversation.otherUser)).subscribe(mkd0.G(new e30() { // from class: l.jj0
            public final void call(Object obj) {
                this.f15189a.m4637h((User) obj);
            }
        }));
        if (m4635f().lifecycle_() != c.j) {
            m4639j();
        }
    }

    @Override // p009l.gj0
    /* JADX INFO: renamed from: b */
    public void mo4633b() {
        if (NullChecker.a(this.f3378q)) {
            this.f3378q.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4634e(View view) {
        kj0.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public PutongAct m4635f() {
        return getContext();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m4636g(User user) {
        return (CoreModule.c.E0.w3(user) || user.isHideActiveFromSVip()) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m4637h(User user) {
        this.f3374m = user;
        qib0.G.N0(this.f3363b, sw6.a(user).profileMiddle().formatted(), false);
        xdl0.M(this.f3371j, !this.f3373l.read.booleanValue());
        if (TextUtils.equals(m4635f().getIntent().getStringExtra(AllPairsAct.f3360f), AllPairsAct.f3361g)) {
            this.f3371j.setText("");
            int i = t100.j;
            xdl0.D0(i, new View[]{this.f3371j});
            xdl0.C0(this.f3371j, i);
            this.f3371j.setBackgroundResource(x2c0.Vd);
        }
        xdl0.M(this.f3364c, true);
        this.f3364c.setBackground(getResources().getDrawable(x2c0.Ad));
        xdl0.M(this.f3365d, CoreModule.c.N0.j3(user) && m4636g(user));
        boolean zIsEmpty = TextUtils.isEmpty(hj0.m15854a(user));
        LinearLayout linearLayout = this.f3367f;
        if (zIsEmpty) {
            xdl0.M(linearLayout, false);
            xdl0.M(this.f3366e, false);
            xdl0.U(this.f3365d, t100.d(14.0f));
        } else {
            xdl0.M(linearLayout, false);
            xdl0.M(this.f3366e, true);
            xdl0.U(this.f3365d, t100.d(28.0f));
            this.f3366e.setText(hj0.m15854a(user));
        }
    }

    /* JADX INFO: renamed from: i */
    public final String m4638i() {
        return this.f3376o ? "p_contacts_matches" : m4635f().pageId();
    }

    /* JADX INFO: renamed from: j */
    public final void m4639j() {
        hj0.m15858e(this.f3373l, this.f3374m, this.f3375n, m4638i(), TextUtils.equals(m4635f().getIntent().getStringExtra(AllPairsAct.f3360f), AllPairsAct.f3361g));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (NullChecker.a(this.f3373l) && NullChecker.a(this.f3374m)) {
            Intent intentK2 = MessagesAct.k2(m4635f(), this.f3373l.otherUser, false, false, 28);
            if (upa.C1()) {
                lz4.m18100h().m18103d(this.f3373l.otherUser);
                MessagesAct.s2(intentK2, "all_match_new_match");
            }
            m4635f().startActivity(intentK2);
            hj0.m15856c(this.f3373l, this.f3374m, this.f3375n, m4638i(), TextUtils.equals(m4635f().getIntent().getStringExtra(AllPairsAct.f3360f), AllPairsAct.f3361g));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4634e(this);
        setOnClickListener(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(i)) * 1.333d), View.MeasureSpec.getMode(i2)));
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        if (wf6.m24193e()) {
            this.f3377p = onClickListener;
        } else {
            super.setOnClickListener(onClickListener);
        }
    }

    public AllPairsItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3376o = false;
        this.f3378q = new C0265a();
    }

    public AllPairsItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3376o = false;
        this.f3378q = new C0265a();
    }
}
