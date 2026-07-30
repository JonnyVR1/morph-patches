package com.p051p1.mobile.putong.core.newui.messages;

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
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.cj0;
import p153l.dbc0;
import p153l.dj0;
import p153l.gj0;
import p153l.gra;
import p153l.jic0;
import p153l.k05;
import p153l.psd0;
import p153l.qa00;
import p153l.uqb0;
import p153l.vx6;
import p153l.x20;
import p153l.y20;
import p153l.zg6;

/* JADX INFO: loaded from: classes11.dex */
public class AllPairsItemView extends FrameLayout implements View.OnClickListener, cj0 {

    /* JADX INFO: renamed from: a */
    public AllPairsItemView f25326a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f25327b;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f25328c;

    /* JADX INFO: renamed from: d */
    public VText f25329d;

    /* JADX INFO: renamed from: e */
    public VText f25330e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f25331f;

    /* JADX INFO: renamed from: g */
    public VText f25332g;

    /* JADX INFO: renamed from: h */
    public VText f25333h;

    /* JADX INFO: renamed from: i */
    public VText f25334i;

    /* JADX INFO: renamed from: j */
    public VText f25335j;

    /* JADX INFO: renamed from: k */
    public VText f25336k;

    /* JADX INFO: renamed from: l */
    public Conversation f25337l;

    /* JADX INFO: renamed from: m */
    public User f25338m;

    /* JADX INFO: renamed from: n */
    public int f25339n;

    /* JADX INFO: renamed from: o */
    public boolean f25340o;

    /* JADX INFO: renamed from: p */
    public View.OnClickListener f25341p;

    /* JADX INFO: renamed from: q */
    public x20 f25342q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.AllPairsItemView$a */
    public class C8252a implements x20 {
        public C8252a() {
        }

        @Override // p153l.x20
        public void call() {
            if (NullChecker.m82486a(AllPairsItemView.this.f25341p)) {
                AllPairsItemView.this.f25341p.onClick(AllPairsItemView.this);
            }
        }
    }

    public AllPairsItemView(@NonNull Context context) {
        super(context);
        this.f25340o = false;
        this.f25342q = new C8252a();
    }

    @Override // p153l.cj0
    /* JADX INFO: renamed from: a */
    public void mo41550a(jic0<Conversation> jic0Var, Conversation conversation, int i, boolean z) {
        this.f25339n = i;
        this.f25337l = conversation;
        this.f25340o = z;
        jic0Var.mo68557c(m41553f(), CoreModule.f18264c.f20381e0.m116483Ka(conversation.otherUser)).subscribe(psd0.m173596G(new y20() { // from class: l.fj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99284a.m41555h((User) obj);
            }
        }));
        if (m41553f().lifecycle_() != C4470c.f16268j) {
            m41557j();
        }
    }

    @Override // p153l.cj0
    /* JADX INFO: renamed from: b */
    public void mo41551b() {
        if (NullChecker.m82486a(this.f25342q)) {
            this.f25342q.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m41552e(View view) {
        gj0.m130401a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public PutongAct m41553f() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m41554g(User user) {
        return (CoreModule.f18264c.f20303E0.m141088w3(user) || user.isHideActiveFromSVip()) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m41555h(User user) {
        this.f25338m = user;
        uqb0.f180374G.m127119N0(this.f25327b, vx6.m203837a(user).profileMiddle().formatted(), false);
        bnl0.m105524M(this.f25335j, !this.f25337l.read.booleanValue());
        if (TextUtils.equals(m41553f().getIntent().getStringExtra(AllPairsAct.f25324f), AllPairsAct.f25325g)) {
            this.f25335j.setText("");
            int i = qa00.f156323j;
            bnl0.m105507D0(i, this.f25335j);
            bnl0.m105505C0(this.f25335j, i);
            this.f25335j.setBackgroundResource(dbc0.f86694Wd);
        }
        bnl0.m105524M(this.f25328c, true);
        this.f25328c.setBackground(getResources().getDrawable(dbc0.f86022Bd));
        bnl0.m105524M(this.f25329d, CoreModule.f18264c.f20330N0.m32969j3(user) && m41554g(user));
        boolean zIsEmpty = TextUtils.isEmpty(dj0.m116007a(user));
        LinearLayout linearLayout = this.f25331f;
        if (zIsEmpty) {
            bnl0.m105524M(linearLayout, false);
            bnl0.m105524M(this.f25330e, false);
            bnl0.m105537U(this.f25329d, qa00.m175859d(14.0f));
        } else {
            bnl0.m105524M(linearLayout, false);
            bnl0.m105524M(this.f25330e, true);
            bnl0.m105537U(this.f25329d, qa00.m175859d(28.0f));
            this.f25330e.setText(dj0.m116007a(user));
        }
    }

    /* JADX INFO: renamed from: i */
    public final String m41556i() {
        return this.f25340o ? "p_contacts_matches" : m41553f().pageId();
    }

    /* JADX INFO: renamed from: j */
    public final void m41557j() {
        dj0.m116011e(this.f25337l, this.f25338m, this.f25339n, m41556i(), TextUtils.equals(m41553f().getIntent().getStringExtra(AllPairsAct.f25324f), AllPairsAct.f25325g));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (NullChecker.m82486a(this.f25337l) && NullChecker.m82486a(this.f25338m)) {
            Intent intentM50127l2 = MessagesAct.m50127l2(m41553f(), this.f25337l.otherUser, false, false, 28);
            if (gra.m131549C1()) {
                k05.m147755h().m147758d(this.f25337l.otherUser);
                MessagesAct.m50135u2(intentM50127l2, "all_match_new_match");
            }
            m41553f().startActivity(intentM50127l2);
            dj0.m116009c(this.f25337l, this.f25338m, this.f25339n, m41556i(), TextUtils.equals(m41553f().getIntent().getStringExtra(AllPairsAct.f25324f), AllPairsAct.f25325g));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41552e(this);
        setOnClickListener(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(i)) * 1.333d), View.MeasureSpec.getMode(i2)));
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        if (zg6.m219594e()) {
            this.f25341p = onClickListener;
        } else {
            super.setOnClickListener(onClickListener);
        }
    }

    public AllPairsItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25340o = false;
        this.f25342q = new C8252a();
    }

    public AllPairsItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25340o = false;
        this.f25342q = new C8252a();
    }
}
