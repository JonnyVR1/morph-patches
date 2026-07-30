package com.p000p1.mobile.putong.core.newui.intlmeet.tribe;

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
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.data.MessageLocation;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.f30;
import l.kr9;
import l.mb90;
import l.t100;
import l.vep;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;
import p009l.d90;
import p009l.mjj;
import v.VImage;
import v.VLinear;
import v.VText;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlTribeMeetFragTabBar extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FrameLayout f3069d;

    /* JADX INFO: renamed from: e */
    public VText f3070e;

    /* JADX INFO: renamed from: f */
    public VLinear f3071f;

    /* JADX INFO: renamed from: g */
    public VText f3072g;

    /* JADX INFO: renamed from: h */
    public VLinear f3073h;

    /* JADX INFO: renamed from: i */
    public VImage f3074i;

    /* JADX INFO: renamed from: j */
    public VText_NoTopPadding f3075j;

    /* JADX INFO: renamed from: k */
    public int f3076k;

    /* JADX INFO: renamed from: l */
    public final int f3077l;

    /* JADX INFO: renamed from: m */
    public final int f3078m;

    /* JADX INFO: renamed from: n */
    public int f3079n;

    public IntlTribeMeetFragTabBar(Context context) {
        super(context);
        this.f3076k = 0;
        this.f3077l = 0;
        this.f3078m = 1;
        this.f3079n = t100.d(44.0f);
        m3540p0(context);
    }

    /* JADX INFO: renamed from: o0 */
    private boolean m3539o0(DoublePair doublePair, DoublePair doublePair2) {
        if (doublePair == null && doublePair2 == null) {
            return true;
        }
        return doublePair != null && doublePair2 != null && Math.abs(doublePair.first - doublePair2.first) < 1.0E-4d && Math.abs(doublePair.second - doublePair2.second) < 1.0E-4d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    private void m3540p0(Context context) {
        addView(m3545n0(LayoutInflater.from(context), this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m3541r0(f30 f30Var, View view) {
        if (this.f3076k == 0) {
            return;
        }
        f30Var.call(0, Boolean.FALSE);
        m3544B0(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m3542s0(f30 f30Var, View view) {
        if (this.f3076k == 1) {
            return;
        }
        f30Var.call(1, Boolean.FALSE);
        m3544B0(1);
    }

    private void setBarStyle(int i) {
        int color = Color.parseColor("#CC000000");
        int color2 = Color.parseColor("#66000000");
        if (i == 0) {
            this.f3070e.setTextColor(color);
            if (IntlCountryCodeController.k()) {
                VText vText = this.f3070e;
                vText.setText(kr9.N(vText.getText().toString(), Color.parseColor("#FE7E1D"), Typeface.DEFAULT_BOLD));
            }
            this.f3070e.setTypeface(Typeface.defaultFromStyle(1));
            this.f3072g.setTypeface(Typeface.defaultFromStyle(0));
            this.f3072g.setTextColor(color2);
            return;
        }
        if (i == 1) {
            String string = this.f3070e.getText().toString();
            this.f3070e.setTypeface(Typeface.defaultFromStyle(0));
            this.f3070e.setText(string);
            this.f3070e.setTextColor(color2);
            this.f3072g.setTypeface(Typeface.defaultFromStyle(1));
            this.f3072g.setTextColor(color);
        }
    }

    private void setLocation(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        xdl0.D0(zIsEmpty ? t100.d(32.0f) : t100.d(24.0f), new View[]{this.f3074i});
        xdl0.C0(this.f3074i, zIsEmpty ? t100.d(32.0f) : t100.d(24.0f));
        xdl0.M(this.f3075j, !zIsEmpty);
        this.f3075j.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m3543t0(View view) {
        if (mb90.b(PurchaseType.TYPE_ROAMING_PKG)) {
            act().startActivity(CoreModule.P().a().aj(act(), "p_intl_tribe_view"));
        } else {
            CoreModule.P().a().i6(act(), "p_intl_tribe_view,e_intl_tribe_passport_btn_click,click", Privilege.vip_location);
        }
        zvf0.r("e_intl_tribe_passport_btn_click", "p_intl_tribe_view");
    }

    /* JADX INFO: renamed from: B0 */
    public void m3544B0(int i) {
        if (i < 0) {
            return;
        }
        setBarStyle(i);
        if (i != this.f3076k) {
            this.f3076k = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Act act() {
        return getContext();
    }

    /* JADX INFO: renamed from: n0 */
    public View m3545n0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vep.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q0 */
    public void m3546q0(Frag frag, @NonNull final f30<Integer, Boolean> f30Var) {
        setBarStyle(0);
        xdl0.E0(this.f3070e, new View.OnClickListener() { // from class: l.sep
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20216a.m3541r0(f30Var, view);
            }
        });
        xdl0.E0(this.f3072g, new View.OnClickListener() { // from class: l.tep
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20650a.m3542s0(f30Var, view);
            }
        });
        xdl0.E0(this.f3073h, new View.OnClickListener() { // from class: l.uep
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21103a.m3543t0(view);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ Boolean m3547u0(DoublePair doublePair, MessageLocation messageLocation) {
        return Boolean.valueOf(m3539o0(messageLocation.coordinates, doublePair));
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m3548v0(d90 d90Var) {
        setLocation((TextUtils.isEmpty(d90Var.mo13016b()) || TextUtils.isEmpty(d90Var.mo13015a())) ? null : d90Var.mo13016b());
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m3549w0(Throwable th) {
        setLocation(null);
    }

    /* JADX INFO: renamed from: y0 */
    public void m3550y0(final DoublePair doublePair, List<MessageLocation> list) {
        if (doublePair == null || (doublePair.first == 0.0d && doublePair.second == 0.0d)) {
            setLocation(null);
            return;
        }
        MessageLocation messageLocation = list != null ? (MessageLocation) vwb.r(list, new w9j() { // from class: l.pep
            public final Object call(Object obj) {
                return this.f18514a.m3547u0(doublePair, (MessageLocation) obj);
            }
        }) : null;
        if (NullChecker.a(messageLocation)) {
            setLocation(TextUtils.isEmpty(messageLocation.name) ? act().string(R.string.h1) : messageLocation.name);
        } else if (!NullChecker.a(list) || list.size() >= 5) {
            setLocation(null);
        } else {
            mjj.m18515c(act(), true).m18517e(act(), doublePair.first, doublePair.second, new e30() { // from class: l.qep
                public final void call(Object obj) {
                    this.f19196a.m3548v0((d90) obj);
                }
            }, new e30() { // from class: l.rep
                public final void call(Object obj) {
                    this.f19790a.m3549w0((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m3551z0(String str) {
        this.f3070e.setText(str);
        setBarStyle(this.f3076k);
    }

    public IntlTribeMeetFragTabBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3076k = 0;
        this.f3077l = 0;
        this.f3078m = 1;
        this.f3079n = t100.d(44.0f);
        m3540p0(context);
    }

    public IntlTribeMeetFragTabBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3076k = 0;
        this.f3077l = 0;
        this.f3078m = 1;
        this.f3079n = t100.d(44.0f);
        m3540p0(context);
    }
}
