package com.p046p1.mobile.putong.core.p053ui.dlg.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.main.view.LinearLayoutFixedLayout;
import com.p046p1.mobile.putong.core.view.diamond.BlackDiamondTagView;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.Region;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p046p1.mobile.putong.newui.view.VIPShimmerTag;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.b43;
import p149l.eqh0;
import p149l.i0g0;
import p149l.n45;
import p149l.qib0;
import p149l.r65;
import p149l.vwb;
import p149l.xdl0;
import p149l.zub;

/* JADX INFO: loaded from: classes10.dex */
public class CityCoverMiddleCardView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CityCoverMiddleCardView f29010a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f29011b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f29012c;

    /* JADX INFO: renamed from: d */
    public VText f29013d;

    /* JADX INFO: renamed from: e */
    public VText f29014e;

    /* JADX INFO: renamed from: f */
    public VText f29015f;

    /* JADX INFO: renamed from: g */
    public VText f29016g;

    /* JADX INFO: renamed from: h */
    public LinearLayoutFixedLayout f29017h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f29018i;

    /* JADX INFO: renamed from: j */
    public ODiamondTagLabel f29019j;

    /* JADX INFO: renamed from: k */
    public VIPShimmerTag f29020k;

    /* JADX INFO: renamed from: l */
    public VImage f29021l;

    /* JADX INFO: renamed from: m */
    public BlackDiamondTagView f29022m;

    /* JADX INFO: renamed from: n */
    public VText f29023n;

    /* JADX INFO: renamed from: o */
    public SVGAnimationView f29024o;

    public CityCoverMiddleCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m45212a(View view) {
        n45.m157798a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public String m45213b(User user) {
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
    public final void m45214c() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        qib0.f154691G.m102331L0(this.f29012c, zub.m220207f(userM169527p9.m60124fp()).formatted());
        this.f29015f.setText(userM169527p9.name);
        this.f29015f.setTypeface(eqh0.m117752c(3), 1);
        String strM45213b = m45213b(userM169527p9);
        boolean zIsEmpty = TextUtils.isEmpty(strM45213b);
        VText vText = this.f29016g;
        if (zIsEmpty) {
            xdl0.m208344M(vText, false);
        } else {
            vText.setText(strM45213b);
            xdl0.m208344M(this.f29016g, true);
        }
        this.f29018i.removeAllViews();
        this.f29018i.addView(CoreModule.m29934N().mo60358ia(getContext(), userM169527p9, 1));
        xdl0.m208344M(this.f29018i, true);
        m45215d(userM169527p9);
        m45216e(userM169527p9);
        this.f29023n.setText(m45218g(userM169527p9));
        VText vText2 = this.f29023n;
        xdl0.m208344M(vText2, !TextUtils.isEmpty(vText2.getText()));
        int iM178033i = r65.m178033i();
        if (iM178033i <= 0) {
            iM178033i = 50000;
        }
        this.f29014e.setText(String.format("豪掷%s探币占领封面", Integer.valueOf(iM178033i)));
        this.f29013d.setTypeface(eqh0.m117752c(3), 1);
    }

    /* JADX INFO: renamed from: d */
    public final void m45215d(User user) {
        if (!user.isBlackDiamondVIP() || user.hideBlackDiamondTag()) {
            xdl0.m208344M(this.f29022m, false);
        } else {
            xdl0.m208344M(this.f29022m, true);
            this.f29022m.m59640k0();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m45216e(User user) {
        xdl0.m208344M(this.f29021l, false);
        xdl0.m208344M(this.f29020k, false);
        xdl0.m208344M(this.f29019j, false);
        if (user.isMe() && user.isHideIconFromSVipWithMe()) {
            xdl0.m208344M(this.f29021l, false);
        } else {
            xdl0.m208344M(this.f29021l, true);
            CoreModule.m29935P().m94654e().mo34987ro(user, this.f29021l);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m45217f() {
    }

    /* JADX INFO: renamed from: g */
    public final String m45218g(User user) {
        return (!b43.m100168b() || vwb.m200296J(user.profile.extensions.physical.bloodType) || TEnum.equals(user.profile.extensions.physical.bloodType.get(0), "UNKNOWN")) ? i0g0.m133869j0(user.profile.zodiac) : b43.m100167a(user.profile.extensions.physical.bloodType.get(0));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45212a(this);
        m45214c();
    }

    public CityCoverMiddleCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CityCoverMiddleCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
