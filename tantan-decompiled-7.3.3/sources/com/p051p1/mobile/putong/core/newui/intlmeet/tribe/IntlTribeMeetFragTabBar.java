package com.p051p1.mobile.putong.core.newui.intlmeet.tribe;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p151v.VText_NoTopPadding;
import p153l.bnl0;
import p153l.fmj;
import p153l.i4g0;
import p153l.jyb;
import p153l.qa00;
import p153l.qcj;
import p153l.qj90;
import p153l.vgp;
import p153l.vs9;
import p153l.y20;
import p153l.z20;
import p153l.z80;

/* JADX INFO: loaded from: classes11.dex */
public class IntlTribeMeetFragTabBar extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FrameLayout f25033d;

    /* JADX INFO: renamed from: e */
    public VText f25034e;

    /* JADX INFO: renamed from: f */
    public VLinear f25035f;

    /* JADX INFO: renamed from: g */
    public VText f25036g;

    /* JADX INFO: renamed from: h */
    public VLinear f25037h;

    /* JADX INFO: renamed from: i */
    public VImage f25038i;

    /* JADX INFO: renamed from: j */
    public VText_NoTopPadding f25039j;

    /* JADX INFO: renamed from: k */
    public int f25040k;

    /* JADX INFO: renamed from: l */
    public final int f25041l;

    /* JADX INFO: renamed from: m */
    public final int f25042m;

    /* JADX INFO: renamed from: n */
    public int f25043n;

    public IntlTribeMeetFragTabBar(Context context) {
        super(context);
        this.f25040k = 0;
        this.f25041l = 0;
        this.f25042m = 1;
        this.f25043n = qa00.m175859d(44.0f);
        m40485p0(context);
    }

    /* JADX INFO: renamed from: o0 */
    private boolean m40484o0(DoublePair doublePair, DoublePair doublePair2) {
        if (doublePair == null && doublePair2 == null) {
            return true;
        }
        return doublePair != null && doublePair2 != null && Math.abs(doublePair.first - doublePair2.first) < 1.0E-4d && Math.abs(doublePair.second - doublePair2.second) < 1.0E-4d;
    }

    /* JADX INFO: renamed from: p0 */
    private void m40485p0(Context context) {
        addView(m40490n0(LayoutInflater.from(context), this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m40486r0(z20 z20Var, View view) {
        if (this.f25040k == 0) {
            return;
        }
        z20Var.call(0, Boolean.FALSE);
        m40489B0(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m40487s0(z20 z20Var, View view) {
        if (this.f25040k == 1) {
            return;
        }
        z20Var.call(1, Boolean.FALSE);
        m40489B0(1);
    }

    private void setBarStyle(int i) {
        int color = Color.parseColor("#CC000000");
        int color2 = Color.parseColor("#66000000");
        if (i == 0) {
            this.f25034e.setTextColor(color);
            if (IntlCountryCodeController.m29114k()) {
                VText vText = this.f25034e;
                vText.setText(vs9.m202574N(vText.getText().toString(), Color.parseColor("#FE7E1D"), Typeface.DEFAULT_BOLD));
            }
            this.f25034e.setTypeface(Typeface.defaultFromStyle(1));
            this.f25036g.setTypeface(Typeface.defaultFromStyle(0));
            this.f25036g.setTextColor(color2);
            return;
        }
        if (i == 1) {
            String string = this.f25034e.getText().toString();
            this.f25034e.setTypeface(Typeface.defaultFromStyle(0));
            this.f25034e.setText(string);
            this.f25034e.setTextColor(color2);
            this.f25036g.setTypeface(Typeface.defaultFromStyle(1));
            this.f25036g.setTextColor(color);
        }
    }

    private void setLocation(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        bnl0.m105507D0(zIsEmpty ? qa00.m175859d(32.0f) : qa00.m175859d(24.0f), this.f25038i);
        bnl0.m105505C0(this.f25038i, zIsEmpty ? qa00.m175859d(32.0f) : qa00.m175859d(24.0f));
        bnl0.m105524M(this.f25039j, !zIsEmpty);
        this.f25039j.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m40488t0(View view) {
        if (qj90.m176830b(PurchaseType.TYPE_ROAMING_PKG)) {
            act().startActivity(CoreModule.m30933P().m143405a().mo34467aj(act(), "p_intl_tribe_view"));
        } else {
            CoreModule.m30933P().m143405a().mo34524i6(act(), "p_intl_tribe_view,e_intl_tribe_passport_btn_click,click", Privilege.vip_location);
        }
        i4g0.m138520r("e_intl_tribe_passport_btn_click", "p_intl_tribe_view");
    }

    /* JADX INFO: renamed from: B0 */
    public void m40489B0(int i) {
        if (i < 0) {
            return;
        }
        setBarStyle(i);
        if (i != this.f25040k) {
            this.f25040k = i;
        }
    }

    public Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: n0 */
    public View m40490n0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vgp.m201237b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q0 */
    public void m40491q0(Frag frag, @NonNull final z20<Integer, Boolean> z20Var) {
        setBarStyle(0);
        bnl0.m105509E0(this.f25034e, new View.OnClickListener() { // from class: l.sgp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167909a.m40486r0(z20Var, view);
            }
        });
        bnl0.m105509E0(this.f25036g, new View.OnClickListener() { // from class: l.tgp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174118a.m40487s0(z20Var, view);
            }
        });
        bnl0.m105509E0(this.f25037h, new View.OnClickListener() { // from class: l.ugp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178922a.m40488t0(view);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ Boolean m40492u0(DoublePair doublePair, MessageLocation messageLocation) {
        return Boolean.valueOf(m40484o0(messageLocation.coordinates, doublePair));
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m40493v0(z80 z80Var) {
        setLocation((TextUtils.isEmpty(z80Var.mo143670b()) || TextUtils.isEmpty(z80Var.mo143669a())) ? null : z80Var.mo143670b());
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m40494w0(Throwable th) {
        setLocation(null);
    }

    /* JADX INFO: renamed from: y0 */
    public void m40495y0(final DoublePair doublePair, List<MessageLocation> list) {
        if (doublePair == null || (doublePair.first == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && doublePair.second == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)) {
            setLocation(null);
            return;
        }
        MessageLocation messageLocation = list != null ? (MessageLocation) jyb.m147529r(list, new qcj() { // from class: l.pgp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f152319a.m40492u0(doublePair, (MessageLocation) obj);
            }
        }) : null;
        if (NullChecker.m82486a(messageLocation)) {
            setLocation(TextUtils.isEmpty(messageLocation.name) ? act().string(R$string.f21392h1) : messageLocation.name);
        } else if (!NullChecker.m82486a(list) || list.size() >= 5) {
            setLocation(null);
        } else {
            fmj.m126236c(act(), true).m126239e(act(), doublePair.first, doublePair.second, new y20() { // from class: l.qgp
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f157447a.m40493v0((z80) obj);
                }
            }, new y20() { // from class: l.rgp
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f163029a.m40494w0((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m40496z0(String str) {
        this.f25034e.setText(str);
        setBarStyle(this.f25040k);
    }

    public IntlTribeMeetFragTabBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25040k = 0;
        this.f25041l = 0;
        this.f25042m = 1;
        this.f25043n = qa00.m175859d(44.0f);
        m40485p0(context);
    }

    public IntlTribeMeetFragTabBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25040k = 0;
        this.f25041l = 0;
        this.f25042m = 1;
        this.f25043n = qa00.m175859d(44.0f);
        m40485p0(context);
    }
}
