package com.p046p1.mobile.putong.core.p053ui.dlg.views;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.dlg.views.CityCoverView4;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.Region;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p147v.VText;
import p149l.cwf0;
import p149l.d30;
import p149l.d55;
import p149l.du2;
import p149l.e30;
import p149l.e51;
import p149l.eqh0;
import p149l.i0e;
import p149l.jo0;
import p149l.mkd0;
import p149l.osi0;
import p149l.r65;
import p149l.roj0;
import p149l.xdl0;
import p149l.xh0;
import p149l.xma;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class CityCoverView4 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CityCoverView4 f29062a;

    /* JADX INFO: renamed from: b */
    public CityCoverSmallCardView f29063b;

    /* JADX INFO: renamed from: c */
    public VText f29064c;

    /* JADX INFO: renamed from: d */
    public VText f29065d;

    /* JADX INFO: renamed from: e */
    public VText f29066e;

    /* JADX INFO: renamed from: f */
    public e30<Boolean> f29067f;

    /* JADX INFO: renamed from: g */
    public e30<String> f29068g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView4$a */
    public class C8322a implements d30 {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView4$a$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CityCoverView4.this.m45257s();
            }
        }

        public C8322a() {
        }

        @Override // p149l.d30
        public void call() {
            e51.m114748M(new a());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView4$b */
    public class C8323b implements e30<roj0> {
        public C8323b() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(roj0 roj0Var) {
            if (CityCoverView4.this.m45252n()) {
                CityCoverView4.this.m45251m("coin");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.views.CityCoverView4$c */
    public class C8324c implements e30<Throwable> {
        public C8324c() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }

    public CityCoverView4(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m45239a(Throwable th) {
        int i = th instanceof TantanException.Client.CoreService ? ((TantanException.Client.CoreService) th).subCode : -1;
        osi0.m165783g("购买失败");
        du2.m113670a("[city_top]", "购买失败，error code ：" + i + " error: " + th);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m45240b(d30 d30Var, View view) {
        zvf0.m220396r("e_city_cover_pay_confirm_cancel", "p_city_cover_pay_confirm_alert");
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m45242d(d30 d30Var, View view) {
        zvf0.m220396r("e_city_cover_pay_confirm_yes", "p_city_cover_pay_confirm_alert");
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m45247i() {
    }

    public String getLocationStr() {
        Region region;
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        Location location = userM169527p9.location;
        String str = "";
        if (location != null && (region = location.region) != null && !TextUtils.isEmpty(region.city)) {
            Region region2 = userM169527p9.location.region;
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
    public final void m45250l(View view) {
        d55.m110019a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public final void m45251m(String str) {
        ((Act) xdl0.m208328E(this)).duringCreated(CoreModule.f17545c.f19650h2.m142334A3(str, TextUtils.equals(str, "coin") ? CoreModule.f17545c.f19570H0.m210376s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.suggestTopShow)) : "")).subscribe(mkd0.m154956H(new e30() { // from class: l.b55
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73440a.m45253o((roj0) obj);
            }
        }, new e30() { // from class: l.c55
            @Override // p149l.e30
            public final void call(Object obj) {
                CityCoverView4.m45239a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m45252n() {
        int iM210374r4 = CoreModule.f17545c.f19570H0.m210374r4();
        return iM210374r4 > 0 && CoreModule.f17545c.f19570H0.m210347Y4() >= ((long) iM210374r4);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m45253o(roj0 roj0Var) {
        CoreModule.f17545c.f19663m0.f19327C1.put(Boolean.FALSE);
        if (NullChecker.m81303a(this.f29067f)) {
            this.f29067f.call(Boolean.TRUE);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45250l(this);
        xdl0.m208329E0(this.f29066e, new View.OnClickListener() { // from class: l.u45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f173692a.m45254p(view);
            }
        });
        this.f29066e.setTypeface(eqh0.m117752c(3), 1);
        this.f29064c.setTypeface(eqh0.m117752c(3), 1);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m45254p(View view) {
        m45256r();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m45255q() {
        m45251m("coin");
    }

    /* JADX INFO: renamed from: r */
    public final void m45256r() {
        String str;
        if (xma.m210089p3() > 0) {
            m45251m("privilege");
            str = "chances";
        } else if (m45252n()) {
            m45259u(CoreModule.f17545c.f19570H0.m210374r4(), new d30() { // from class: l.v45
                @Override // p149l.d30
                public final void call() {
                    this.f179880a.m45255q();
                }
            }, new d30() { // from class: l.w45
                @Override // p149l.d30
                public final void call() {
                    CityCoverView4.m45247i();
                }
            });
            str = "enough_coins";
        } else {
            CoreModule.m29936Q().mo67248Y8((Act) xdl0.m208328E(this), true, CoreModule.f17545c.f19570H0.m210374r4(), new C8322a());
            str = "not_enough_coins";
        }
        e30<String> e30Var = this.f29068g;
        if (e30Var != null) {
            e30Var.call(str);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m45257s() {
        Activity activityM208328E = xdl0.m208328E(this);
        if (activityM208328E instanceof Act) {
            ((Act) activityM208328E).duringCreated(CoreModule.f17545c.f19570H0.m210361k5()).take(1).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new C8323b(), new C8324c()));
        }
    }

    /* JADX INFO: renamed from: t */
    public void m45258t(e30<String> e30Var, e30<Boolean> e30Var2) {
        this.f29067f = e30Var2;
        this.f29068g = e30Var;
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        int iM210374r4 = CoreModule.f17545c.f19570H0.m210374r4();
        this.f29063b.m45220b(userM169527p9.m60124fp().url, userM169527p9.name, getLocationStr());
        this.f29064c.setText(String.format("花费%s探币，登顶城市封面", iM210374r4 == 0 ? "-" : Integer.valueOf(iM210374r4)));
        int iM178033i = r65.m178033i() - iM210374r4;
        if (iM178033i < 0) {
            iM178033i = 0;
        }
        this.f29065d.setText(String.format("*换算为人民币原价¥%s，专属折扣立减¥%s", Integer.valueOf(r65.m178033i() / 10), Integer.valueOf(iM178033i / 10)));
    }

    /* JADX INFO: renamed from: u */
    public final void m45259u(int i, final d30 d30Var, final d30 d30Var2) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_city_cover_pay_confirm_alert", "CoinConsumeConfirmDialog");
        new xh0.C21150a(xdl0.m208328E(this)).m208731j(String.format(Locale.getDefault(), "本次上城市封面将花费%d探币，确认花费", Integer.valueOf(i))).m208739r("确认").m208736o(new View.OnClickListener() { // from class: l.x45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CityCoverView4.m45242d(d30Var, view);
            }
        }).m208724c(new View.OnClickListener() { // from class: l.y45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CityCoverView4.m45240b(d30Var2, view);
            }
        }).m208726e(R$string.f27376a).m208735n(new DialogInterface.OnShowListener() { // from class: l.z45
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.m133797f(cwf0VarM133794c);
            }
        }).m208734m(new DialogInterface.OnDismissListener() { // from class: l.a55
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m208722a().m208721g();
    }

    public CityCoverView4(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CityCoverView4(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
