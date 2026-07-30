package com.p051p1.mobile.putong.core.p058ui.dlg.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.main.view.LinearLayoutFixedLayout;
import com.p051p1.mobile.putong.core.view.diamond.BlackDiamondTagView;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.Region;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p051p1.mobile.putong.newui.view.VIPShimmerTag;
import com.tantan.library.svga.SVGAnimationView;
import io.requery.android.database.sqlite.SQLiteDatabase;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.jyb;
import p153l.lyh0;
import p153l.nwb;
import p153l.o55;
import p153l.q8g0;
import p153l.r43;
import p153l.s75;
import p153l.uqb0;

/* JADX INFO: loaded from: classes2.dex */
public class CityCoverMiddleCardView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CityCoverMiddleCardView f29858a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f29859b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f29860c;

    /* JADX INFO: renamed from: d */
    public VText f29861d;

    /* JADX INFO: renamed from: e */
    public VText f29862e;

    /* JADX INFO: renamed from: f */
    public VText f29863f;

    /* JADX INFO: renamed from: g */
    public VText f29864g;

    /* JADX INFO: renamed from: h */
    public LinearLayoutFixedLayout f29865h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f29866i;

    /* JADX INFO: renamed from: j */
    public ODiamondTagLabel f29867j;

    /* JADX INFO: renamed from: k */
    public VIPShimmerTag f29868k;

    /* JADX INFO: renamed from: l */
    public VImage f29869l;

    /* JADX INFO: renamed from: m */
    public BlackDiamondTagView f29870m;

    /* JADX INFO: renamed from: n */
    public VText f29871n;

    /* JADX INFO: renamed from: o */
    public SVGAnimationView f29872o;

    public CityCoverMiddleCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m46395a(View view) {
        o55.m166090a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public String m46396b(User user) {
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
    public final void m46397c() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        uqb0.f180374G.m127115L0(this.f29860c, nwb.m164968f(userM116600p9.m61308fp()).formatted());
        this.f29863f.setText(userM116600p9.name);
        this.f29863f.setTypeface(lyh0.m156283c(3), 1);
        String strM46396b = m46396b(userM116600p9);
        boolean zIsEmpty = TextUtils.isEmpty(strM46396b);
        VText vText = this.f29864g;
        if (zIsEmpty) {
            bnl0.m105524M(vText, false);
        } else {
            vText.setText(strM46396b);
            bnl0.m105524M(this.f29864g, true);
        }
        this.f29866i.removeAllViews();
        this.f29866i.addView(CoreModule.m30932N().mo61542ia(getContext(), userM116600p9, 1));
        bnl0.m105524M(this.f29866i, true);
        m46398d(userM116600p9);
        m46399e(userM116600p9);
        this.f29871n.setText(m46401g(userM116600p9));
        VText vText2 = this.f29871n;
        bnl0.m105524M(vText2, !TextUtils.isEmpty(vText2.getText()));
        int iM184963i = s75.m184963i();
        if (iM184963i <= 0) {
            iM184963i = SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH;
        }
        this.f29862e.setText(String.format("豪掷%s探币占领封面", Integer.valueOf(iM184963i)));
        this.f29861d.setTypeface(lyh0.m156283c(3), 1);
    }

    /* JADX INFO: renamed from: d */
    public final void m46398d(User user) {
        if (!user.isBlackDiamondVIP() || user.hideBlackDiamondTag()) {
            bnl0.m105524M(this.f29870m, false);
        } else {
            bnl0.m105524M(this.f29870m, true);
            this.f29870m.m60824k0();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m46399e(User user) {
        bnl0.m105524M(this.f29869l, false);
        bnl0.m105524M(this.f29868k, false);
        bnl0.m105524M(this.f29867j, false);
        if (user.isMe() && user.isHideIconFromSVipWithMe()) {
            bnl0.m105524M(this.f29869l, false);
        } else {
            bnl0.m105524M(this.f29869l, true);
            CoreModule.m30933P().m143408e().mo35990ro(user, this.f29869l);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m46400f() {
    }

    /* JADX INFO: renamed from: g */
    public final String m46401g(User user) {
        return (!r43.m179739b() || jyb.m147479J(user.profile.extensions.physical.bloodType) || TEnum.equals(user.profile.extensions.physical.bloodType.get(0), "UNKNOWN")) ? q8g0.m175804j0(user.profile.zodiac) : r43.m179738a(user.profile.extensions.physical.bloodType.get(0));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46395a(this);
        m46397c();
    }

    public CityCoverMiddleCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CityCoverMiddleCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
