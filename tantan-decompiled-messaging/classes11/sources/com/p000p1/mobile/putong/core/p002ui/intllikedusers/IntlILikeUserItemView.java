package com.p000p1.mobile.putong.core.p002ui.intllikedusers;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LikeUser;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.Set;
import l.b3c0;
import l.e30;
import l.epn;
import l.qib0;
import l.xdl0;
import l.xma;
import l.zvf0;
import p009l.mqi0;
import v.AutoVDraweeView;
import v.VImage;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlILikeUserItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f6780a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f6781b;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f6782c;

    /* JADX INFO: renamed from: d */
    public VText_NoTopPadding f6783d;

    /* JADX INFO: renamed from: e */
    public VText_NoTopPadding f6784e;

    /* JADX INFO: renamed from: f */
    public VImage f6785f;

    /* JADX INFO: renamed from: g */
    public VText_NoTopPadding f6786g;

    /* JADX INFO: renamed from: h */
    public VImage f6787h;

    /* JADX INFO: renamed from: i */
    public VImage f6788i;

    /* JADX INFO: renamed from: j */
    public LikeUser f6789j;

    /* JADX INFO: renamed from: k */
    public final Set<String> f6790k;

    public IntlILikeUserItemView(@NonNull Context context) {
        super(context);
        this.f6790k = new HashSet();
    }

    /* JADX INFO: renamed from: d */
    public final void m8317d(View view) {
        epn.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public Act m8318e() {
        return xdl0.D(getContext());
    }

    /* JADX INFO: renamed from: f */
    public final void m8319f(int i) {
        int i2;
        boolean zY4 = xma.y4();
        int i3 = b3c0.G;
        if (i != 1) {
            i2 = R.color.transparent;
        } else if (zY4) {
            i2 = b3c0.d0;
            i3 = b3c0.e0;
        } else {
            i2 = b3c0.C;
        }
        this.f6780a.setBackgroundResource(i2);
        this.f6782c.setBackgroundResource(i3);
    }

    /* JADX INFO: renamed from: g */
    public final String m8320g(long j, boolean z) {
        return String.format(App.e.getString(com.p1.mobile.putong.core.member.R.string.U), String.valueOf(Math.max(1L, (Math.max(0L, (z ? 259200L : 86400L) - Math.max(0L, (mqi0.m18550o() - j) / 1000)) + 3599) / 3600)));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m8321h(e30 e30Var, View view) {
        if (m8318e().lifecycle_() == c.i && NullChecker.a(e30Var)) {
            e30Var.call(this.f6789j);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m8322i(e30 e30Var, View view) {
        if (m8318e().lifecycle_() != c.i) {
            return;
        }
        e30Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m8323j(e30 e30Var, View view) {
        if (m8318e().lifecycle_() != c.i) {
            return;
        }
        e30Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: k */
    public void m8324k(LikeUser likeUser, User user, final e30<LikeUser> e30Var, final e30<Boolean> e30Var2, final e30<Boolean> e30Var3, int i) {
        int i2;
        this.f6789j = likeUser;
        xdl0.E0(this, new View.OnClickListener() { // from class: l.bpn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10230a.m8321h(e30Var, view);
            }
        });
        xdl0.E0(this.f6788i, new View.OnClickListener() { // from class: l.cpn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10721a.m8322i(e30Var2, view);
            }
        });
        xdl0.E0(this.f6787h, new View.OnClickListener() { // from class: l.dpn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11937a.m8323j(e30Var3, view);
            }
        });
        this.f6781b.setImageUrl(user.fp().profileMiddle().formatted());
        if (CoreModule.o.d().Vd()) {
            if (!this.f6790k.contains(((DbObject) user).id)) {
                this.f6790k.add(((DbObject) user).id);
                zvf0.x("e_intl_instantmatch_btn", m8318e().pageId());
            }
            xdl0.M(this.f6787h, true);
        }
        xdl0.H0(this.f6783d, user.name);
        xdl0.H0(this.f6784e, String.valueOf(user.age));
        if (NullChecker.a(this.f6785f)) {
            qib0.b0.b.showUserVerificationLogo(m8318e(), user, this.f6785f);
        }
        xdl0.H0(this.f6786g, m8320g(likeUser.createTime, !xma.e4()));
        VImage vImage = this.f6788i;
        if (CoreModule.P().a().Mb()) {
            i2 = b3c0.y;
        } else {
            i2 = IntlCountryCodeController.v() ? b3c0.t0 : b3c0.s0;
        }
        vImage.setImageResource(i2);
        m8319f(i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8317d(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(i)) * 1.33d), View.MeasureSpec.getMode(i2)));
    }

    public IntlILikeUserItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6790k = new HashSet();
    }

    public IntlILikeUserItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6790k = new HashSet();
    }
}
