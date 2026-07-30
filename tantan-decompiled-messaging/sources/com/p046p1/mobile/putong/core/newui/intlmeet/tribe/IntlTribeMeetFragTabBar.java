package com.p046p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p147v.VText_NoTopPadding;
import p149l.d90;
import p149l.e30;
import p149l.f30;
import p149l.kr9;
import p149l.mb90;
import p149l.mjj;
import p149l.t100;
import p149l.vep;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class IntlTribeMeetFragTabBar extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FrameLayout f24291d;

    /* JADX INFO: renamed from: e */
    public VText f24292e;

    /* JADX INFO: renamed from: f */
    public VLinear f24293f;

    /* JADX INFO: renamed from: g */
    public VText f24294g;

    /* JADX INFO: renamed from: h */
    public VLinear f24295h;

    /* JADX INFO: renamed from: i */
    public VImage f24296i;

    /* JADX INFO: renamed from: j */
    public VText_NoTopPadding f24297j;

    /* JADX INFO: renamed from: k */
    public int f24298k;

    /* JADX INFO: renamed from: l */
    public final int f24299l;

    /* JADX INFO: renamed from: m */
    public final int f24300m;

    /* JADX INFO: renamed from: n */
    public int f24301n;

    public IntlTribeMeetFragTabBar(Context context) {
        super(context);
        this.f24298k = 0;
        this.f24299l = 0;
        this.f24300m = 1;
        this.f24301n = t100.m186890d(44.0f);
        m39482p0(context);
    }

    /* JADX INFO: renamed from: o0 */
    private boolean m39481o0(DoublePair doublePair, DoublePair doublePair2) {
        if (doublePair == null && doublePair2 == null) {
            return true;
        }
        return doublePair != null && doublePair2 != null && Math.abs(doublePair.first - doublePair2.first) < 1.0E-4d && Math.abs(doublePair.second - doublePair2.second) < 1.0E-4d;
    }

    /* JADX INFO: renamed from: p0 */
    private void m39482p0(Context context) {
        addView(m39487n0(LayoutInflater.from(context), this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m39483r0(f30 f30Var, View view) {
        if (this.f24298k == 0) {
            return;
        }
        f30Var.call(0, Boolean.FALSE);
        m39486B0(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m39484s0(f30 f30Var, View view) {
        if (this.f24298k == 1) {
            return;
        }
        f30Var.call(1, Boolean.FALSE);
        m39486B0(1);
    }

    private void setBarStyle(int i) {
        int color = Color.parseColor("#CC000000");
        int color2 = Color.parseColor("#66000000");
        if (i == 0) {
            this.f24292e.setTextColor(color);
            if (IntlCountryCodeController.m28115k()) {
                VText vText = this.f24292e;
                vText.setText(kr9.m146969N(vText.getText().toString(), Color.parseColor("#FE7E1D"), Typeface.DEFAULT_BOLD));
            }
            this.f24292e.setTypeface(Typeface.defaultFromStyle(1));
            this.f24294g.setTypeface(Typeface.defaultFromStyle(0));
            this.f24294g.setTextColor(color2);
            return;
        }
        if (i == 1) {
            String string = this.f24292e.getText().toString();
            this.f24292e.setTypeface(Typeface.defaultFromStyle(0));
            this.f24292e.setText(string);
            this.f24292e.setTextColor(color2);
            this.f24294g.setTypeface(Typeface.defaultFromStyle(1));
            this.f24294g.setTextColor(color);
        }
    }

    private void setLocation(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        xdl0.m208327D0(zIsEmpty ? t100.m186890d(32.0f) : t100.m186890d(24.0f), this.f24296i);
        xdl0.m208325C0(this.f24296i, zIsEmpty ? t100.m186890d(32.0f) : t100.m186890d(24.0f));
        xdl0.m208344M(this.f24297j, !zIsEmpty);
        this.f24297j.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m39485t0(View view) {
        if (mb90.m153866b(PurchaseType.TYPE_ROAMING_PKG)) {
            act().startActivity(CoreModule.m29935P().m94651a().mo33464aj(act(), "p_intl_tribe_view"));
        } else {
            CoreModule.m29935P().m94651a().mo33521i6(act(), "p_intl_tribe_view,e_intl_tribe_passport_btn_click,click", Privilege.vip_location);
        }
        zvf0.m220396r("e_intl_tribe_passport_btn_click", "p_intl_tribe_view");
    }

    /* JADX INFO: renamed from: B0 */
    public void m39486B0(int i) {
        if (i < 0) {
            return;
        }
        setBarStyle(i);
        if (i != this.f24298k) {
            this.f24298k = i;
        }
    }

    public Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: n0 */
    public View m39487n0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vep.m198213b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q0 */
    public void m39488q0(Frag frag, @NonNull final f30<Integer, Boolean> f30Var) {
        setBarStyle(0);
        xdl0.m208329E0(this.f24292e, new View.OnClickListener() { // from class: l.sep
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164028a.m39483r0(f30Var, view);
            }
        });
        xdl0.m208329E0(this.f24294g, new View.OnClickListener() { // from class: l.tep
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f169872a.m39484s0(f30Var, view);
            }
        });
        xdl0.m208329E0(this.f24295h, new View.OnClickListener() { // from class: l.uep
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176058a.m39485t0(view);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ Boolean m39489u0(DoublePair doublePair, MessageLocation messageLocation) {
        return Boolean.valueOf(m39481o0(messageLocation.coordinates, doublePair));
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m39490v0(d90 d90Var) {
        setLocation((TextUtils.isEmpty(d90Var.mo110405b()) || TextUtils.isEmpty(d90Var.mo110404a())) ? null : d90Var.mo110405b());
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m39491w0(Throwable th) {
        setLocation(null);
    }

    /* JADX INFO: renamed from: y0 */
    public void m39492y0(final DoublePair doublePair, List<MessageLocation> list) {
        if (doublePair == null || (doublePair.first == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && doublePair.second == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)) {
            setLocation(null);
            return;
        }
        MessageLocation messageLocation = list != null ? (MessageLocation) vwb.m200346r(list, new w9j() { // from class: l.pep
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f148463a.m39489u0(doublePair, (MessageLocation) obj);
            }
        }) : null;
        if (NullChecker.m81303a(messageLocation)) {
            setLocation(TextUtils.isEmpty(messageLocation.name) ? act().string(R$string.f20650h1) : messageLocation.name);
        } else if (!NullChecker.m81303a(list) || list.size() >= 5) {
            setLocation(null);
        } else {
            mjj.m154842c(act(), true).m154844e(act(), doublePair.first, doublePair.second, new e30() { // from class: l.qep
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f154048a.m39490v0((d90) obj);
                }
            }, new e30() { // from class: l.rep
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f159076a.m39491w0((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m39493z0(String str) {
        this.f24292e.setText(str);
        setBarStyle(this.f24298k);
    }

    public IntlTribeMeetFragTabBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24298k = 0;
        this.f24299l = 0;
        this.f24300m = 1;
        this.f24301n = t100.m186890d(44.0f);
        m39482p0(context);
    }

    public IntlTribeMeetFragTabBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24298k = 0;
        this.f24299l = 0;
        this.f24300m = 1;
        this.f24301n = t100.m186890d(44.0f);
        m39482p0(context);
    }
}
