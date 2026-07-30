package com.p051p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowView;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserWealth;
import com.p051p1.mobile.putong.data.Work;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VText;
import p153l.adc0;
import p153l.baj;
import p153l.c9c0;
import p153l.dbc0;
import p153l.iph;
import p153l.ji80;
import p153l.jyb;
import p153l.kec0;
import p153l.pf60;
import p153l.q8g0;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class FeedPoiCardItemAboutMeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FeedPoiCardItemAboutMeView f27118a;

    /* JADX INFO: renamed from: b */
    public VText f27119b;

    /* JADX INFO: renamed from: c */
    public VText f27120c;

    /* JADX INFO: renamed from: d */
    public FlowView f27121d;

    /* JADX INFO: renamed from: e */
    public String f27122e;

    /* JADX INFO: renamed from: f */
    public pf60<Integer, String> f27123f;

    /* JADX INFO: renamed from: g */
    public pf60<Integer, String> f27124g;

    /* JADX INFO: renamed from: h */
    public pf60<Integer, String> f27125h;

    /* JADX INFO: renamed from: i */
    public pf60<Integer, String> f27126i;

    /* JADX INFO: renamed from: j */
    public pf60<Integer, String> f27127j;

    /* JADX INFO: renamed from: k */
    public pf60<Integer, String> f27128k;

    /* JADX INFO: renamed from: l */
    public pf60<Integer, String> f27129l;

    /* JADX INFO: renamed from: m */
    public pf60<Integer, String> f27130m;

    /* JADX INFO: renamed from: n */
    public pf60<Integer, String> f27131n;

    /* JADX INFO: renamed from: o */
    public pf60<Integer, String> f27132o;

    /* JADX INFO: renamed from: p */
    public pf60<Integer, String> f27133p;

    /* JADX INFO: renamed from: q */
    public pf60<Integer, String> f27134q;

    /* JADX INFO: renamed from: r */
    public List<Integer> f27135r;

    public FeedPoiCardItemAboutMeView(Context context) {
        super(context);
        this.f27135r = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m44154a(View view) {
        iph.m141462a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final String m44155b(Profile profile) {
        return profile.hometown;
    }

    /* JADX INFO: renamed from: c */
    public View m44156c(int i, String str) {
        View viewInflate = getAct().inflater().inflate(kec0.f125555Oa, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(adc0.f70409je);
        viewInflate.setBackgroundResource(dbc0.f86898cn);
        try {
            Drawable drawable = getContext().getDrawable(i);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            vText.setCompoundDrawables(drawable, null, null, null);
        } catch (Exception unused) {
        }
        vText.setCompoundDrawablePadding(qa00.f156318e);
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setGravity(17);
        vText.setSingleLine(true);
        vText.setMaxLines(1);
        vText.setPadding(qa00.m175859d(9.0f), qa00.m175859d(10.0f), qa00.m175859d(13.0f), qa00.m175859d(10.0f));
        vText.setTextSize(14.0f);
        vText.setTextColor(CoreModule.f18263b.getResources().getColor(c9c0.f80439n));
        vText.setText(str);
        return viewInflate;
    }

    /* JADX INFO: renamed from: d */
    public final List<pf60<Integer, String>> m44157d(User user) {
        return new ArrayList(jyb.m147507f0(this.f27123f, this.f27124g, this.f27125h, this.f27126i, this.f27127j, this.f27128k));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0100  */
    /* JADX WARN: Code duplicated, block: B:34:0x0151  */
    /* JADX INFO: renamed from: e */
    public final void m44158e(User user) {
        String str;
        List<String> list;
        List<String> list2;
        boolean z;
        List<String> list3;
        List<String> list4;
        List<String> list5;
        String str2;
        this.f27122e = user.description;
        Profile profile = user.profile;
        String string = profile.work.industry;
        if (profile.studies.active) {
            string = CoreModule.f18263b.getString(R$string.f19684tl);
        }
        this.f27123f = pf60.m172085a(Integer.valueOf(dbc0.f86689W8), string);
        if (!user.profile.studies.active) {
            this.f27124g = pf60.m172085a(Integer.valueOf(dbc0.f86497Q8), user.profile.work.company);
        }
        this.f27125h = pf60.m172085a(Integer.valueOf(dbc0.f86753Y8), user.profile.studies.school);
        String strM44155b = m44155b(user.profile);
        if (!TextUtils.isEmpty(strM44155b)) {
            this.f27126i = pf60.m172085a(Integer.valueOf(dbc0.f86593T8), String.format(CoreModule.f18263b.getString(R$string.f19374jl), strM44155b));
        }
        if (!TextUtils.isEmpty(user.profile.hangouts)) {
            this.f27127j = pf60.m172085a(Integer.valueOf(dbc0.f86529R8), String.format(CoreModule.f18263b.getString(R$string.f19560pl), user.profile.hangouts));
        }
        this.f27128k = q8g0.m175808m0(user.profile.zodiac);
        List<String> list6 = user.profile.extensions.basic.qualification;
        String strM103170K = null;
        this.f27129l = pf60.m172085a(Integer.valueOf(dbc0.f86721X8), !jyb.m147479J(list6) ? baj.m103182W(list6.get(0)) : null);
        List<String> list7 = user.profile.extensions.physical.height;
        if (jyb.m147479J(list7)) {
            str = null;
        } else {
            String str3 = list7.get(0);
            if (TextUtils.isEmpty(str3)) {
                str = null;
            } else {
                str = str3 + CoreStaticData.FriendPurposeDataType.HEIGHT_UNIT_STR;
            }
        }
        this.f27130m = pf60.m172085a(Integer.valueOf(dbc0.f86561S8), str);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(user.profile.extensions.wealth)) {
            UserWealth userWealth = user.profile.extensions.wealth;
            list2 = userWealth.upperIncome;
            list = userWealth.lowIncome;
        } else {
            list = null;
            list2 = null;
        }
        if (NullChecker.m82486a(userM116600p9.profile.extensions.wealth)) {
            UserWealth userWealth2 = userM116600p9.profile.extensions.wealth;
            if (TextUtils.isEmpty(baj.m103172M(userWealth2.upperIncome, userWealth2.lowIncome))) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        String strM103172M = (!(jyb.m147479J(list) && jyb.m147479J(list2)) && (user.isMe() || !z)) ? baj.m103172M(list2, list) : null;
        String strM103172M2 = (!(jyb.m147479J(list) && jyb.m147479J(list2)) && user.isMe()) ? baj.m103172M(list2, list) : null;
        this.f27131n = pf60.m172085a(Integer.valueOf(dbc0.f86657V8), strM103172M);
        this.f27132o = pf60.m172085a(Integer.valueOf(dbc0.f86657V8), strM103172M2);
        if (NullChecker.m82486a(userM116600p9.profile.extensions.wealth) && !jyb.m147479J(userM116600p9.profile.extensions.wealth.car)) {
            TextUtils.isEmpty(baj.m103201n(userM116600p9.profile.extensions.wealth.car.get(0)));
        }
        List<String> list8 = (NullChecker.m82486a(user.profile.extensions.wealth) && user.isMe()) ? user.profile.extensions.wealth.car : null;
        this.f27133p = pf60.m172085a(Integer.valueOf(dbc0.f86465P8), !jyb.m147479J(list8) ? baj.m103201n(list8.get(0)) : null);
        if (NullChecker.m82486a(user.profile.extensions.wealth)) {
            UserWealth userWealth3 = user.profile.extensions.wealth;
            list4 = userWealth3.house;
            list5 = userWealth3.houseRegion;
            list3 = userWealth3.houseSubRegion;
        } else {
            list3 = null;
            list4 = null;
            list5 = null;
        }
        if (!jyb.m147479J(list4) && user.isMe()) {
            if (jyb.m147479J(list3) || TextUtils.isEmpty(list3.get(0))) {
                str2 = (jyb.m147479J(list5) || TextUtils.isEmpty(list5.get(0))) ? "" : list5.get(0);
            } else {
                str2 = list3.get(0);
            }
            strM103170K = baj.m103170K(list4.get(0), str2);
        }
        this.f27134q = pf60.m172085a(Integer.valueOf(dbc0.f86625U8), strM103170K);
    }

    /* JADX INFO: renamed from: f */
    public final void m44159f(List<View> list, int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(m44156c(i, str));
        this.f27135r.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: g */
    public final boolean m44160g(User user) {
        Profile profile = user.profile;
        Work work = profile.work;
        return (TextUtils.isEmpty(work.industry) && TextUtils.isEmpty(work.company) && TextUtils.isEmpty(profile.studies.school) && TextUtils.isEmpty(profile.hometown) && TextUtils.isEmpty(profile.hangouts) && TextUtils.isEmpty(q8g0.m175808m0(profile.zodiac).f152157b)) ? false : true;
    }

    public Act getAct() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: h */
    public void m44161h(ji80 ji80Var) {
        m44158e(ji80Var.f121050b);
        boolean zIsEmpty = TextUtils.isEmpty(this.f27122e);
        VText vText = this.f27120c;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setText(this.f27122e);
            this.f27120c.setVisibility(0);
        }
        if (!m44160g(ji80Var.f121050b)) {
            this.f27121d.setVisibility(8);
            return;
        }
        List<pf60<Integer, String>> listM44157d = m44157d(ji80Var.f121050b);
        FlowView flowView = this.f27121d;
        flowView.f34968f = true;
        flowView.setTags(m44162i(listM44157d));
        this.f27121d.setVisibility(0);
    }

    /* JADX INFO: renamed from: i */
    public final List<View> m44162i(List<pf60<Integer, String>> list) {
        ArrayList arrayList = new ArrayList();
        this.f27135r.clear();
        for (pf60<Integer, String> pf60Var : list) {
            if (pf60Var != null) {
                m44159f(arrayList, pf60Var.f152156a.intValue(), pf60Var.f152157b);
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44154a(this);
        this.f27119b.setTypeface(Typeface.DEFAULT_BOLD);
    }

    public FeedPoiCardItemAboutMeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27135r = new ArrayList();
    }

    public FeedPoiCardItemAboutMeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27135r = new ArrayList();
    }
}
