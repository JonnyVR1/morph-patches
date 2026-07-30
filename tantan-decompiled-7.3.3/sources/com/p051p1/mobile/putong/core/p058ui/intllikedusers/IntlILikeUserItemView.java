package com.p051p1.mobile.putong.core.p058ui.intllikedusers;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LikeUser;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.Set;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VText_NoTopPadding;
import p153l.bnl0;
import p153l.ern;
import p153l.gbc0;
import p153l.i4g0;
import p153l.joa;
import p153l.pzi0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class IntlILikeUserItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f30677a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f30678b;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f30679c;

    /* JADX INFO: renamed from: d */
    public VText_NoTopPadding f30680d;

    /* JADX INFO: renamed from: e */
    public VText_NoTopPadding f30681e;

    /* JADX INFO: renamed from: f */
    public VImage f30682f;

    /* JADX INFO: renamed from: g */
    public VText_NoTopPadding f30683g;

    /* JADX INFO: renamed from: h */
    public VImage f30684h;

    /* JADX INFO: renamed from: i */
    public VImage f30685i;

    /* JADX INFO: renamed from: j */
    public LikeUser f30686j;

    /* JADX INFO: renamed from: k */
    public final Set<String> f30687k;

    public IntlILikeUserItemView(@NonNull Context context) {
        super(context);
        this.f30687k = new HashSet();
    }

    /* JADX INFO: renamed from: d */
    public final void m47414d(View view) {
        ern.m122231a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public Act m47415e() {
        return (Act) bnl0.m105506D(getContext());
    }

    /* JADX INFO: renamed from: f */
    public final void m47416f(int i) {
        int i2;
        boolean zM146413z4 = joa.m146413z4();
        int i3 = gbc0.f103113G;
        if (i != 1) {
            i2 = R.color.transparent;
        } else if (zM146413z4) {
            i2 = gbc0.f103278d0;
            i3 = gbc0.f103286e0;
        } else {
            i2 = gbc0.f103085C;
        }
        this.f30677a.setBackgroundResource(i2);
        this.f30679c.setBackgroundResource(i3);
    }

    /* JADX INFO: renamed from: g */
    public final String m47417g(long j, boolean z) {
        return String.format(App.f16088e.getString(R$string.f21357U), String.valueOf(Math.max(1L, (Math.max(0L, (z ? 259200L : 86400L) - Math.max(0L, (pzi0.m174454o() - j) / 1000)) + 3599) / 3600)));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m47418h(y20 y20Var, View view) {
        if (m47415e().lifecycle_() == C4470c.f16267i && NullChecker.m82486a(y20Var)) {
            y20Var.call(this.f30686j);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m47419i(y20 y20Var, View view) {
        if (m47415e().lifecycle_() != C4470c.f16267i) {
            return;
        }
        y20Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m47420j(y20 y20Var, View view) {
        if (m47415e().lifecycle_() != C4470c.f16267i) {
            return;
        }
        y20Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: k */
    public void m47421k(LikeUser likeUser, User user, final y20<LikeUser> y20Var, final y20<Boolean> y20Var2, final y20<Boolean> y20Var3, int i) {
        int i2;
        this.f30686j = likeUser;
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.brn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78037a.m47418h(y20Var, view);
            }
        });
        bnl0.m105509E0(this.f30685i, new View.OnClickListener() { // from class: l.crn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83342a.m47419i(y20Var2, view);
            }
        });
        bnl0.m105509E0(this.f30684h, new View.OnClickListener() { // from class: l.drn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90401a.m47420j(y20Var3, view);
            }
        });
        this.f30678b.setImageUrl(user.m61308fp().profileMiddle().formatted());
        if (CoreModule.f18276o.m132214d().mo34769Vd()) {
            if (!this.f30687k.contains(user.f56859id)) {
                this.f30687k.add(user.f56859id);
                i4g0.m138526x("e_intl_instantmatch_btn", m47415e().pageId());
            }
            bnl0.m105524M(this.f30684h, true);
        }
        bnl0.m105515H0(this.f30680d, user.name);
        bnl0.m105515H0(this.f30681e, String.valueOf(user.age));
        if (NullChecker.m82486a(this.f30682f)) {
            uqb0.f180396b0.f170325b.showUserVerificationLogo(m47415e(), user, this.f30682f);
        }
        bnl0.m105515H0(this.f30683g, m47417g(likeUser.createTime, !joa.m146386f4()));
        VImage vImage = this.f30685i;
        if (CoreModule.m30933P().m143405a().mo34368Mb()) {
            i2 = gbc0.f103440y;
        } else {
            i2 = IntlCountryCodeController.m29125v() ? gbc0.f103406t0 : gbc0.f103398s0;
        }
        vImage.setImageResource(i2);
        m47416f(i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47414d(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(i)) * 1.33d), View.MeasureSpec.getMode(i2)));
    }

    public IntlILikeUserItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30687k = new HashSet();
    }

    public IntlILikeUserItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30687k = new HashSet();
    }
}
