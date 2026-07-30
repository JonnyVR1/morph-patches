package com.p000p1.mobile.putong.core.p001ui.dlg.views;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.ConsumeType;
import com.p000p1.mobile.putong.core.data.CoreStaticData;
import com.p000p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p000p1.mobile.putong.core.p001ui.dlg.views.CityCoverView4;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Region;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import l.cwf0;
import l.d30;
import l.du2;
import l.e30;
import l.e51;
import l.eqh0;
import l.i0e;
import l.jo0;
import l.mkd0;
import l.osi0;
import l.r65;
import l.roj0;
import l.xdl0;
import l.xh0;
import l.xma;
import l.zvf0;
import p003l.d55;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CityCoverView4 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CityCoverView4 f1456a;

    /* JADX INFO: renamed from: b */
    public CityCoverSmallCardView f1457b;

    /* JADX INFO: renamed from: c */
    public VText f1458c;

    /* JADX INFO: renamed from: d */
    public VText f1459d;

    /* JADX INFO: renamed from: e */
    public VText f1460e;

    /* JADX INFO: renamed from: f */
    public e30<Boolean> f1461f;

    /* JADX INFO: renamed from: g */
    public e30<String> f1462g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView4$a */
    public class C3097a implements d30 {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView4$a$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CityCoverView4.this.m2576s();
            }
        }

        public C3097a() {
        }

        public void call() {
            e51.M(new a());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView4$b */
    public class C3098b implements e30<roj0> {
        public C3098b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(roj0 roj0Var) {
            if (CityCoverView4.this.m2571n()) {
                CityCoverView4.this.m2570m("coin");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView4$c */
    public class C3099c implements e30<Throwable> {
        public C3099c() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }

    public CityCoverView4(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2558a(Throwable th) {
        int i = th instanceof TantanException.Client.CoreService ? ((TantanException.Client.CoreService) th).subCode : -1;
        osi0.g("购买失败");
        du2.a("[city_top]", "购买失败，error code ：" + i + " error: " + th);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2559b(d30 d30Var, View view) {
        zvf0.r("e_city_cover_pay_confirm_cancel", "p_city_cover_pay_confirm_alert");
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m2561d(d30 d30Var, View view) {
        zvf0.r("e_city_cover_pay_confirm_yes", "p_city_cover_pay_confirm_alert");
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m2566i() {
    }

    public String getLocationStr() {
        Region region;
        User userP9 = CoreModule.c.e0.p9();
        Location location = userP9.location;
        String str = "";
        if (location != null && (region = location.region) != null && !TextUtils.isEmpty(region.city)) {
            Region region2 = userP9.location.region;
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
    public final void m2569l(View view) {
        d55.m6060a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public final void m2570m(String str) {
        xdl0.E(this).duringCreated(CoreModule.c.h2.A3(str, TextUtils.equals(str, "coin") ? CoreModule.c.H0.s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.suggestTopShow)) : "")).subscribe(mkd0.H(new e30() { // from class: l.b55
            public final void call(Object obj) {
                this.f3330a.m2572o((roj0) obj);
            }
        }, new e30() { // from class: l.c55
            public final void call(Object obj) {
                CityCoverView4.m2558a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m2571n() {
        int iR4 = CoreModule.c.H0.r4();
        return iR4 > 0 && CoreModule.c.H0.Y4() >= ((long) iR4);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m2572o(roj0 roj0Var) {
        CoreModule.c.m0.C1.put(Boolean.FALSE);
        if (NullChecker.a(this.f1461f)) {
            this.f1461f.call(Boolean.TRUE);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2569l(this);
        xdl0.E0(this.f1460e, new View.OnClickListener() { // from class: l.u45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7665a.m2573p(view);
            }
        });
        this.f1460e.setTypeface(eqh0.c(3), 1);
        this.f1458c.setTypeface(eqh0.c(3), 1);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m2573p(View view) {
        m2575r();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m2574q() {
        m2570m("coin");
    }

    /* JADX INFO: renamed from: r */
    public final void m2575r() {
        String str;
        if (xma.p3() > 0) {
            m2570m(ConsumeType.privilege);
            str = "chances";
        } else if (m2571n()) {
            m2578u(CoreModule.c.H0.r4(), new d30() { // from class: l.v45
                public final void call() {
                    this.f7862a.m2574q();
                }
            }, new d30() { // from class: l.w45
                public final void call() {
                    CityCoverView4.m2566i();
                }
            });
            str = "enough_coins";
        } else {
            CoreModule.Q().Y8(xdl0.E(this), true, CoreModule.c.H0.r4(), new C3097a());
            str = "not_enough_coins";
        }
        e30<String> e30Var = this.f1462g;
        if (e30Var != null) {
            e30Var.call(str);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m2576s() {
        Act actE = xdl0.E(this);
        if (actE instanceof Act) {
            actE.duringCreated(CoreModule.c.H0.k5()).take(1).observeOn(jo0.a()).subscribe(mkd0.H(new C3098b(), new C3099c()));
        }
    }

    /* JADX INFO: renamed from: t */
    public void m2577t(e30<String> e30Var, e30<Boolean> e30Var2) {
        this.f1461f = e30Var2;
        this.f1462g = e30Var;
        User userP9 = CoreModule.c.e0.p9();
        int iR4 = CoreModule.c.H0.r4();
        this.f1457b.m2537b(((Media) userP9.fp()).url, userP9.name, getLocationStr());
        this.f1458c.setText(String.format("花费%s探币，登顶城市封面", iR4 == 0 ? CoreStaticData.FriendPurposeDataType.HOUSE_RIEGION_NONE_STR : Integer.valueOf(iR4)));
        int i = r65.i() - iR4;
        if (i < 0) {
            i = 0;
        }
        this.f1459d.setText(String.format("*换算为人民币原价¥%s，专属折扣立减¥%s", Integer.valueOf(r65.i() / 10), Integer.valueOf(i / 10)));
    }

    /* JADX INFO: renamed from: u */
    public final void m2578u(int i, final d30 d30Var, final d30 d30Var2) {
        final cwf0 cwf0VarC = i0e.c("p_city_cover_pay_confirm_alert", "CoinConsumeConfirmDialog");
        new xh0.a(xdl0.E(this)).j(String.format(Locale.getDefault(), "本次上城市封面将花费%d探币，确认花费", Integer.valueOf(i))).r("确认").o(new View.OnClickListener() { // from class: l.x45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CityCoverView4.m2561d(d30Var, view);
            }
        }).c(new View.OnClickListener() { // from class: l.y45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CityCoverView4.m2559b(d30Var2, view);
            }
        }).e(R.string.a).n(new DialogInterface.OnShowListener() { // from class: l.z45
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.f(cwf0VarC);
            }
        }).m(new DialogInterface.OnDismissListener() { // from class: l.a55
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).a().g();
    }

    public CityCoverView4(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CityCoverView4(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
