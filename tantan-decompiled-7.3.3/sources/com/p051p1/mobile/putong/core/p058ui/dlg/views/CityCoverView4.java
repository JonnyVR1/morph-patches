package com.p051p1.mobile.putong.core.p058ui.dlg.views;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.dlg.views.CityCoverView4;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.Region;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p151v.VText;
import p153l.bnl0;
import p153l.e65;
import p153l.fo0;
import p153l.i4g0;
import p153l.joa;
import p153l.l4g0;
import p153l.l51;
import p153l.lyh0;
import p153l.psd0;
import p153l.r1j0;
import p153l.s75;
import p153l.th0;
import p153l.tu2;
import p153l.uxj0;
import p153l.w1e;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes2.dex */
public class CityCoverView4 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CityCoverView4 f29910a;

    /* JADX INFO: renamed from: b */
    public CityCoverSmallCardView f29911b;

    /* JADX INFO: renamed from: c */
    public VText f29912c;

    /* JADX INFO: renamed from: d */
    public VText f29913d;

    /* JADX INFO: renamed from: e */
    public VText f29914e;

    /* JADX INFO: renamed from: f */
    public y20<Boolean> f29915f;

    /* JADX INFO: renamed from: g */
    public y20<String> f29916g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView4$a */
    public class C8485a implements x20 {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView4$a$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CityCoverView4.this.m46440s();
            }
        }

        public C8485a() {
        }

        @Override // p153l.x20
        public void call() {
            l51.m152893M(new a());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView4$b */
    public class C8486b implements y20<uxj0> {
        public C8486b() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(uxj0 uxj0Var) {
            if (CityCoverView4.this.m46435n()) {
                CityCoverView4.this.m46434m("coin");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView4$c */
    public class C8487c implements y20<Throwable> {
        public C8487c() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }

    public CityCoverView4(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m46422a(Throwable th) {
        int i = th instanceof TantanException.Client.CoreService ? ((TantanException.Client.CoreService) th).subCode : -1;
        r1j0.m179420g("购买失败");
        tu2.m192703a("[city_top]", "购买失败，error code ：" + i + " error: " + th);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m46423b(x20 x20Var, View view) {
        i4g0.m138520r("e_city_cover_pay_confirm_cancel", "p_city_cover_pay_confirm_alert");
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m46425d(x20 x20Var, View view) {
        i4g0.m138520r("e_city_cover_pay_confirm_yes", "p_city_cover_pay_confirm_alert");
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m46430i() {
    }

    public String getLocationStr() {
        Region region;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        Location location = userM116600p9.location;
        String str = "";
        if (location != null && (region = location.region) != null && !TextUtils.isEmpty(region.city)) {
            Region region2 = userM116600p9.location.region;
            String str2 = region2.city;
            String str3 = region2.district;
            str = TextUtils.isEmpty(str2) ? "" : str2;
            if (!TextUtils.isEmpty(str3) && !TextUtils.equals(str3, "null")) {
                str = str + str3;
            }
            str = str + "(1km)";
        }
        return !TextUtils.isEmpty(str) ? str.concat(".刚刚活跃") : "刚刚活跃";
    }

    /* JADX INFO: renamed from: l */
    public final void m46433l(View view) {
        e65.m119573a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public final void m46434m(String str) {
        ((Act) bnl0.m105508E(this)).duringCreated(CoreModule.f18264c.f20392h2.m164070A3(str, TextUtils.equals(str, "coin") ? CoreModule.f18264c.f20312H0.m155464s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.suggestTopShow)) : "")).subscribe(psd0.m173597H(new y20() { // from class: l.c65
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79938a.m46436o((uxj0) obj);
            }
        }, new y20() { // from class: l.d65
            @Override // p153l.y20
            public final void call(Object obj) {
                CityCoverView4.m46422a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m46435n() {
        int iM155462r4 = CoreModule.f18264c.f20312H0.m155462r4();
        return iM155462r4 > 0 && CoreModule.f18264c.f20312H0.m155435Y4() >= ((long) iM155462r4);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m46436o(uxj0 uxj0Var) {
        CoreModule.f18264c.f20405m0.f20069C1.put(Boolean.FALSE);
        if (NullChecker.m82486a(this.f29915f)) {
            this.f29915f.call(Boolean.TRUE);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46433l(this);
        bnl0.m105509E0(this.f29914e, new View.OnClickListener() { // from class: l.v55
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182477a.m46437p(view);
            }
        });
        this.f29914e.setTypeface(lyh0.m156283c(3), 1);
        this.f29912c.setTypeface(lyh0.m156283c(3), 1);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m46437p(View view) {
        m46439r();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m46438q() {
        m46434m("coin");
    }

    /* JADX INFO: renamed from: r */
    public final void m46439r() {
        String str;
        if (joa.m146403p3() > 0) {
            m46434m("privilege");
            str = "chances";
        } else if (m46435n()) {
            m46442u(CoreModule.f18264c.f20312H0.m155462r4(), new x20() { // from class: l.w55
                @Override // p153l.x20
                public final void call() {
                    this.f187480a.m46438q();
                }
            }, new x20() { // from class: l.x55
                @Override // p153l.x20
                public final void call() {
                    CityCoverView4.m46430i();
                }
            });
            str = "enough_coins";
        } else {
            CoreModule.m30934Q().mo68431Y8((Act) bnl0.m105508E(this), true, CoreModule.f18264c.f20312H0.m155462r4(), new C8485a());
            str = "not_enough_coins";
        }
        y20<String> y20Var = this.f29916g;
        if (y20Var != null) {
            y20Var.call(str);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m46440s() {
        Activity activityM105508E = bnl0.m105508E(this);
        if (activityM105508E instanceof Act) {
            ((Act) activityM105508E).duringCreated(CoreModule.f18264c.f20312H0.m155449k5()).take(1).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new C8486b(), new C8487c()));
        }
    }

    /* JADX INFO: renamed from: t */
    public void m46441t(y20<String> y20Var, y20<Boolean> y20Var2) {
        this.f29915f = y20Var2;
        this.f29916g = y20Var;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        int iM155462r4 = CoreModule.f18264c.f20312H0.m155462r4();
        this.f29911b.m46403b(userM116600p9.m61308fp().url, userM116600p9.name, getLocationStr());
        this.f29912c.setText(String.format("花费%s探币，登顶城市封面", iM155462r4 == 0 ? "-" : Integer.valueOf(iM155462r4)));
        int iM184963i = s75.m184963i() - iM155462r4;
        if (iM184963i < 0) {
            iM184963i = 0;
        }
        this.f29913d.setText(String.format("*换算为人民币原价¥%s，专属折扣立减¥%s", Integer.valueOf(s75.m184963i() / 10), Integer.valueOf(iM184963i / 10)));
    }

    /* JADX INFO: renamed from: u */
    public final void m46442u(int i, final x20 x20Var, final x20 x20Var2) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_city_cover_pay_confirm_alert", "CoinConsumeConfirmDialog");
        new th0.C20312a(bnl0.m105508E(this)).m191151j(String.format(Locale.getDefault(), "本次上城市封面将花费%d探币，确认花费", Integer.valueOf(i))).m191159r("确认").m191156o(new View.OnClickListener() { // from class: l.y55
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CityCoverView4.m46425d(x20Var, view);
            }
        }).m191144c(new View.OnClickListener() { // from class: l.z55
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CityCoverView4.m46423b(x20Var2, view);
            }
        }).m191146e(R$string.f28224a).m191155n(new DialogInterface.OnShowListener() { // from class: l.a65
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                w1e.m204402f(l4g0VarM204399c);
            }
        }).m191154m(new DialogInterface.OnDismissListener() { // from class: l.b65
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m191142a().m191141g();
    }

    public CityCoverView4(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CityCoverView4(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
