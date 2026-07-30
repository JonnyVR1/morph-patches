package com.p000p1.mobile.putong.core.p001ui.dlg.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.H5PaymentOrderStatus;
import com.p000p1.mobile.putong.core.view.diamond.BlackDiamondTagView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.newui.main.view.LinearLayoutFixedLayout;
import com.p1.mobile.putong.data.BloodType;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.Region;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p1.mobile.putong.newui.view.VIPShimmerTag;
import com.tantan.library.svga.SVGAnimationView;
import l.b43;
import l.eqh0;
import l.i0g0;
import l.qib0;
import l.r65;
import l.vwb;
import l.xdl0;
import l.zub;
import p003l.n45;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CityCoverMiddleCardView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CityCoverMiddleCardView f1404a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f1405b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f1406c;

    /* JADX INFO: renamed from: d */
    public VText f1407d;

    /* JADX INFO: renamed from: e */
    public VText f1408e;

    /* JADX INFO: renamed from: f */
    public VText f1409f;

    /* JADX INFO: renamed from: g */
    public VText f1410g;

    /* JADX INFO: renamed from: h */
    public LinearLayoutFixedLayout f1411h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f1412i;

    /* JADX INFO: renamed from: j */
    public ODiamondTagLabel f1413j;

    /* JADX INFO: renamed from: k */
    public VIPShimmerTag f1414k;

    /* JADX INFO: renamed from: l */
    public VImage f1415l;

    /* JADX INFO: renamed from: m */
    public BlackDiamondTagView f1416m;

    /* JADX INFO: renamed from: n */
    public VText f1417n;

    /* JADX INFO: renamed from: o */
    public SVGAnimationView f1418o;

    public CityCoverMiddleCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m2529a(View view) {
        n45.m8307a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public String m2530b(User user) {
        String str;
        Region region;
        Location location = user.location;
        if (location == null || (region = location.region) == null || TextUtils.isEmpty(region.city)) {
            str = "";
        } else {
            Region region2 = user.location.region;
            str = region2.city + region2.district + "(1km)";
        }
        return !TextUtils.isEmpty(str) ? str.concat(".刚刚活跃") : "刚刚活跃";
    }

    /* JADX INFO: renamed from: c */
    public final void m2531c() {
        User userP9 = CoreModule.c.e0.p9();
        qib0.G.L0(this.f1406c, zub.f(userP9.fp()).formatted());
        this.f1409f.setText(userP9.name);
        this.f1409f.setTypeface(eqh0.c(3), 1);
        String strM2530b = m2530b(userP9);
        boolean zIsEmpty = TextUtils.isEmpty(strM2530b);
        VText vText = this.f1410g;
        if (zIsEmpty) {
            xdl0.M(vText, false);
        } else {
            vText.setText(strM2530b);
            xdl0.M(this.f1410g, true);
        }
        this.f1412i.removeAllViews();
        this.f1412i.addView(CoreModule.N().ia(getContext(), userP9, 1));
        xdl0.M(this.f1412i, true);
        m2532d(userP9);
        m2533e(userP9);
        this.f1417n.setText(m2535g(userP9));
        VText vText2 = this.f1417n;
        xdl0.M(vText2, !TextUtils.isEmpty(vText2.getText()));
        int i = r65.i();
        if (i <= 0) {
            i = 50000;
        }
        this.f1408e.setText(String.format("豪掷%s探币占领封面", Integer.valueOf(i)));
        this.f1407d.setTypeface(eqh0.c(3), 1);
    }

    /* JADX INFO: renamed from: d */
    public final void m2532d(User user) {
        if (!user.isBlackDiamondVIP() || user.hideBlackDiamondTag()) {
            xdl0.M(this.f1416m, false);
        } else {
            xdl0.M(this.f1416m, true);
            this.f1416m.m5049k0();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2533e(User user) {
        xdl0.M(this.f1415l, false);
        xdl0.M(this.f1414k, false);
        xdl0.M(this.f1413j, false);
        if (user.isMe() && user.isHideIconFromSVipWithMe()) {
            xdl0.M(this.f1415l, false);
        } else {
            xdl0.M(this.f1415l, true);
            CoreModule.P().e().ro(user, this.f1415l);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m2534f() {
    }

    /* JADX INFO: renamed from: g */
    public final String m2535g(User user) {
        return (!b43.b() || vwb.J(user.profile.extensions.physical.bloodType) || TEnum.equals((BloodType) user.profile.extensions.physical.bloodType.get(0), H5PaymentOrderStatus.UNKNOWN)) ? i0g0.j0(user.profile.zodiac) : b43.a((BloodType) user.profile.extensions.physical.bloodType.get(0));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2529a(this);
        m2531c();
    }

    public CityCoverMiddleCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CityCoverMiddleCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
