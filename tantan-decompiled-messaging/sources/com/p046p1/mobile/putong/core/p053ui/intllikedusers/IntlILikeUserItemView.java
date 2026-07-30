package com.p046p1.mobile.putong.core.p053ui.intllikedusers;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LikeUser;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.Set;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p147v.VText_NoTopPadding;
import p149l.b3c0;
import p149l.e30;
import p149l.epn;
import p149l.mqi0;
import p149l.qib0;
import p149l.xdl0;
import p149l.xma;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class IntlILikeUserItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f29829a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f29830b;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f29831c;

    /* JADX INFO: renamed from: d */
    public VText_NoTopPadding f29832d;

    /* JADX INFO: renamed from: e */
    public VText_NoTopPadding f29833e;

    /* JADX INFO: renamed from: f */
    public VImage f29834f;

    /* JADX INFO: renamed from: g */
    public VText_NoTopPadding f29835g;

    /* JADX INFO: renamed from: h */
    public VImage f29836h;

    /* JADX INFO: renamed from: i */
    public VImage f29837i;

    /* JADX INFO: renamed from: j */
    public LikeUser f29838j;

    /* JADX INFO: renamed from: k */
    public final Set<String> f29839k;

    public IntlILikeUserItemView(@NonNull Context context) {
        super(context);
        this.f29839k = new HashSet();
    }

    /* JADX INFO: renamed from: d */
    public final void m46231d(View view) {
        epn.m117658a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public Act m46232e() {
        return (Act) xdl0.m208326D(getContext());
    }

    /* JADX INFO: renamed from: f */
    public final void m46233f(int i) {
        int i2;
        boolean zM210098y4 = xma.m210098y4();
        int i3 = b3c0.f72862G;
        if (i != 1) {
            i2 = R.color.transparent;
        } else if (zM210098y4) {
            i2 = b3c0.f73027d0;
            i3 = b3c0.f73035e0;
        } else {
            i2 = b3c0.f72834C;
        }
        this.f29829a.setBackgroundResource(i2);
        this.f29831c.setBackgroundResource(i3);
    }

    /* JADX INFO: renamed from: g */
    public final String m46234g(long j, boolean z) {
        return String.format(App.f15369e.getString(R$string.f20615U), String.valueOf(Math.max(1L, (Math.max(0L, (z ? 259200L : 86400L) - Math.max(0L, (mqi0.m155944o() - j) / 1000)) + 3599) / 3600)));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m46235h(e30 e30Var, View view) {
        if (m46232e().lifecycle_() == C4319c.f15548i && NullChecker.m81303a(e30Var)) {
            e30Var.call(this.f29838j);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m46236i(e30 e30Var, View view) {
        if (m46232e().lifecycle_() != C4319c.f15548i) {
            return;
        }
        e30Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m46237j(e30 e30Var, View view) {
        if (m46232e().lifecycle_() != C4319c.f15548i) {
            return;
        }
        e30Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: k */
    public void m46238k(LikeUser likeUser, User user, final e30<LikeUser> e30Var, final e30<Boolean> e30Var2, final e30<Boolean> e30Var3, int i) {
        int i2;
        this.f29838j = likeUser;
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.bpn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76655a.m46235h(e30Var, view);
            }
        });
        xdl0.m208329E0(this.f29837i, new View.OnClickListener() { // from class: l.cpn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81975a.m46236i(e30Var2, view);
            }
        });
        xdl0.m208329E0(this.f29836h, new View.OnClickListener() { // from class: l.dpn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87294a.m46237j(e30Var3, view);
            }
        });
        this.f29830b.setImageUrl(user.m60124fp().profileMiddle().formatted());
        if (CoreModule.f17557o.m195057d().mo33766Vd()) {
            if (!this.f29839k.contains(user.f56011id)) {
                this.f29839k.add(user.f56011id);
                zvf0.m220402x("e_intl_instantmatch_btn", m46232e().pageId());
            }
            xdl0.m208344M(this.f29836h, true);
        }
        xdl0.m208335H0(this.f29832d, user.name);
        xdl0.m208335H0(this.f29833e, String.valueOf(user.age));
        if (NullChecker.m81303a(this.f29834f)) {
            qib0.f154713b0.f139231b.showUserVerificationLogo(m46232e(), user, this.f29834f);
        }
        xdl0.m208335H0(this.f29835g, m46234g(likeUser.createTime, !xma.m210071e4()));
        VImage vImage = this.f29837i;
        if (CoreModule.m29935P().m94651a().mo33365Mb()) {
            i2 = b3c0.f73189y;
        } else {
            i2 = IntlCountryCodeController.m28126v() ? b3c0.f73155t0 : b3c0.f73147s0;
        }
        vImage.setImageResource(i2);
        m46233f(i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46231d(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(i)) * 1.33d), View.MeasureSpec.getMode(i2)));
    }

    public IntlILikeUserItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29839k = new HashSet();
    }

    public IntlILikeUserItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29839k = new HashSet();
    }
}
