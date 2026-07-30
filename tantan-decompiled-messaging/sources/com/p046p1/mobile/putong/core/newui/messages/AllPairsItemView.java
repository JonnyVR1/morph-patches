package com.p046p1.mobile.putong.core.newui.messages;

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
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;
import p149l.d30;
import p149l.dac0;
import p149l.e30;
import p149l.gj0;
import p149l.hj0;
import p149l.kj0;
import p149l.lz4;
import p149l.mkd0;
import p149l.qib0;
import p149l.sw6;
import p149l.t100;
import p149l.upa;
import p149l.wf6;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class AllPairsItemView extends FrameLayout implements View.OnClickListener, gj0 {

    /* JADX INFO: renamed from: a */
    public AllPairsItemView f24584a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f24585b;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f24586c;

    /* JADX INFO: renamed from: d */
    public VText f24587d;

    /* JADX INFO: renamed from: e */
    public VText f24588e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f24589f;

    /* JADX INFO: renamed from: g */
    public VText f24590g;

    /* JADX INFO: renamed from: h */
    public VText f24591h;

    /* JADX INFO: renamed from: i */
    public VText f24592i;

    /* JADX INFO: renamed from: j */
    public VText f24593j;

    /* JADX INFO: renamed from: k */
    public VText f24594k;

    /* JADX INFO: renamed from: l */
    public Conversation f24595l;

    /* JADX INFO: renamed from: m */
    public User f24596m;

    /* JADX INFO: renamed from: n */
    public int f24597n;

    /* JADX INFO: renamed from: o */
    public boolean f24598o;

    /* JADX INFO: renamed from: p */
    public View.OnClickListener f24599p;

    /* JADX INFO: renamed from: q */
    public d30 f24600q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.AllPairsItemView$a */
    public class C8101a implements d30 {
        public C8101a() {
        }

        @Override // p149l.d30
        public void call() {
            if (NullChecker.m81303a(AllPairsItemView.this.f24599p)) {
                AllPairsItemView.this.f24599p.onClick(AllPairsItemView.this);
            }
        }
    }

    public AllPairsItemView(@NonNull Context context) {
        super(context);
        this.f24598o = false;
        this.f24600q = new C8101a();
    }

    @Override // p149l.gj0
    /* JADX INFO: renamed from: a */
    public void mo40539a(dac0<Conversation> dac0Var, Conversation conversation, int i, boolean z) {
        this.f24597n = i;
        this.f24595l = conversation;
        this.f24598o = z;
        dac0Var.mo67374c(m40542f(), CoreModule.f17545c.f19639e0.m169410Ka(conversation.otherUser)).subscribe(mkd0.m154955G(new e30() { // from class: l.jj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118212a.m40544h((User) obj);
            }
        }));
        if (m40542f().lifecycle_() != C4319c.f15549j) {
            m40546j();
        }
    }

    @Override // p149l.gj0
    /* JADX INFO: renamed from: b */
    public void mo40540b() {
        if (NullChecker.m81303a(this.f24600q)) {
            this.f24600q.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m40541e(View view) {
        kj0.m146166a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public PutongAct m40542f() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m40543g(User user) {
        return (CoreModule.f17545c.f19561E0.m203800w3(user) || user.isHideActiveFromSVip()) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m40544h(User user) {
        this.f24596m = user;
        qib0.f154691G.m102335N0(this.f24585b, sw6.m186126a(user).profileMiddle().formatted(), false);
        xdl0.m208344M(this.f24593j, !this.f24595l.read.booleanValue());
        if (TextUtils.equals(m40542f().getIntent().getStringExtra(AllPairsAct.f24582f), AllPairsAct.f24583g)) {
            this.f24593j.setText("");
            int i = t100.f167261j;
            xdl0.m208327D0(i, this.f24593j);
            xdl0.m208325C0(this.f24593j, i);
            this.f24593j.setBackgroundResource(x2c0.f189824Vd);
        }
        xdl0.m208344M(this.f24586c, true);
        this.f24586c.setBackground(getResources().getDrawable(x2c0.f189167Ad));
        xdl0.m208344M(this.f24587d, CoreModule.f17545c.f19588N0.m31966j3(user) && m40543g(user));
        boolean zIsEmpty = TextUtils.isEmpty(hj0.m131314a(user));
        LinearLayout linearLayout = this.f24589f;
        if (zIsEmpty) {
            xdl0.m208344M(linearLayout, false);
            xdl0.m208344M(this.f24588e, false);
            xdl0.m208357U(this.f24587d, t100.m186890d(14.0f));
        } else {
            xdl0.m208344M(linearLayout, false);
            xdl0.m208344M(this.f24588e, true);
            xdl0.m208357U(this.f24587d, t100.m186890d(28.0f));
            this.f24588e.setText(hj0.m131314a(user));
        }
    }

    /* JADX INFO: renamed from: i */
    public final String m40545i() {
        return this.f24598o ? "p_contacts_matches" : m40542f().pageId();
    }

    /* JADX INFO: renamed from: j */
    public final void m40546j() {
        hj0.m131318e(this.f24595l, this.f24596m, this.f24597n, m40545i(), TextUtils.equals(m40542f().getIntent().getStringExtra(AllPairsAct.f24582f), AllPairsAct.f24583g));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (NullChecker.m81303a(this.f24595l) && NullChecker.m81303a(this.f24596m)) {
            Intent intentM48944k2 = MessagesAct.m48944k2(m40542f(), this.f24595l.otherUser, false, false, 28);
            if (upa.m194618C1()) {
                lz4.m152319h().m152322d(this.f24595l.otherUser);
                MessagesAct.m48952s2(intentM48944k2, "all_match_new_match");
            }
            m40542f().startActivity(intentM48944k2);
            hj0.m131316c(this.f24595l, this.f24596m, this.f24597n, m40545i(), TextUtils.equals(m40542f().getIntent().getStringExtra(AllPairsAct.f24582f), AllPairsAct.f24583g));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40541e(this);
        setOnClickListener(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(i)) * 1.333d), View.MeasureSpec.getMode(i2)));
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        if (wf6.m202950e()) {
            this.f24599p = onClickListener;
        } else {
            super.setOnClickListener(onClickListener);
        }
    }

    public AllPairsItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24598o = false;
        this.f24600q = new C8101a();
    }

    public AllPairsItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24598o = false;
        this.f24600q = new C8101a();
    }
}
