package com.p000p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.profile.views.FlowView;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserWealth;
import com.p1.mobile.putong.data.Work;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.f6c0;
import l.h7j;
import l.j760;
import l.t100;
import l.tnh;
import l.u4c0;
import l.vwb;
import l.w0c0;
import l.x2c0;
import p009l.da80;
import p009l.i0g0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class FeedPoiCardItemAboutMeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FeedPoiCardItemAboutMeView f5154a;

    /* JADX INFO: renamed from: b */
    public VText f5155b;

    /* JADX INFO: renamed from: c */
    public VText f5156c;

    /* JADX INFO: renamed from: d */
    public FlowView f5157d;

    /* JADX INFO: renamed from: e */
    public String f5158e;

    /* JADX INFO: renamed from: f */
    public j760<Integer, String> f5159f;

    /* JADX INFO: renamed from: g */
    public j760<Integer, String> f5160g;

    /* JADX INFO: renamed from: h */
    public j760<Integer, String> f5161h;

    /* JADX INFO: renamed from: i */
    public j760<Integer, String> f5162i;

    /* JADX INFO: renamed from: j */
    public j760<Integer, String> f5163j;

    /* JADX INFO: renamed from: k */
    public j760<Integer, String> f5164k;

    /* JADX INFO: renamed from: l */
    public j760<Integer, String> f5165l;

    /* JADX INFO: renamed from: m */
    public j760<Integer, String> f5166m;

    /* JADX INFO: renamed from: n */
    public j760<Integer, String> f5167n;

    /* JADX INFO: renamed from: o */
    public j760<Integer, String> f5168o;

    /* JADX INFO: renamed from: p */
    public j760<Integer, String> f5169p;

    /* JADX INFO: renamed from: q */
    public j760<Integer, String> f5170q;

    /* JADX INFO: renamed from: r */
    public List<Integer> f5171r;

    public FeedPoiCardItemAboutMeView(Context context) {
        super(context);
        this.f5171r = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m7358a(View view) {
        tnh.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final String m7359b(Profile profile) {
        return profile.hometown;
    }

    /* JADX INFO: renamed from: c */
    public View m7360c(int i, String str) {
        View viewInflate = getAct().inflater().inflate(f6c0.Ha, (ViewGroup) null);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.ge);
        viewInflate.setBackgroundResource(x2c0.om);
        try {
            Drawable drawable = getContext().getDrawable(i);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            vTextFindViewById.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        } catch (Exception unused) {
        }
        vTextFindViewById.setCompoundDrawablePadding(t100.e);
        vTextFindViewById.setTypeface(Typeface.DEFAULT_BOLD);
        vTextFindViewById.setEllipsize(TextUtils.TruncateAt.END);
        vTextFindViewById.setGravity(17);
        vTextFindViewById.setSingleLine(true);
        vTextFindViewById.setMaxLines(1);
        vTextFindViewById.setPadding(t100.d(9.0f), t100.d(10.0f), t100.d(13.0f), t100.d(10.0f));
        vTextFindViewById.setTextSize(14.0f);
        vTextFindViewById.setTextColor(CoreModule.b.getResources().getColor(w0c0.n));
        vTextFindViewById.setText(str);
        return viewInflate;
    }

    /* JADX INFO: renamed from: d */
    public final List<j760<Integer, String>> m7361d(User user) {
        return new ArrayList(vwb.f0(new j760[]{this.f5159f, this.f5160g, this.f5161h, this.f5162i, this.f5163j, this.f5164k}));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0100  */
    /* JADX WARN: Code duplicated, block: B:34:0x0151  */
    /* JADX INFO: renamed from: e */
    public final void m7362e(User user) {
        String str;
        List list;
        List list2;
        boolean z;
        List list3;
        List list4;
        List list5;
        String str2;
        this.f5158e = user.description;
        Profile profile = user.profile;
        String string = profile.work.industry;
        if (profile.studies.active) {
            string = CoreModule.b.getString(R.string.Xk);
        }
        this.f5159f = j760.a(Integer.valueOf(x2c0.V8), string);
        if (!user.profile.studies.active) {
            this.f5160g = j760.a(Integer.valueOf(x2c0.P8), user.profile.work.company);
        }
        this.f5161h = j760.a(Integer.valueOf(x2c0.X8), user.profile.studies.school);
        String strM7359b = m7359b(user.profile);
        if (!TextUtils.isEmpty(strM7359b)) {
            this.f5162i = j760.a(Integer.valueOf(x2c0.S8), String.format(CoreModule.b.getString(R.string.Nk), strM7359b));
        }
        if (!TextUtils.isEmpty(user.profile.hangouts)) {
            this.f5163j = j760.a(Integer.valueOf(x2c0.Q8), String.format(CoreModule.b.getString(R.string.Tk), user.profile.hangouts));
        }
        this.f5164k = i0g0.m16141m0(user.profile.zodiac);
        List list6 = user.profile.extensions.basic.qualification;
        String strK = null;
        this.f5165l = j760.a(Integer.valueOf(x2c0.W8), !vwb.J(list6) ? h7j.W((String) list6.get(0)) : null);
        List list7 = user.profile.extensions.physical.height;
        if (vwb.J(list7)) {
            str = null;
        } else {
            String str3 = (String) list7.get(0);
            if (TextUtils.isEmpty(str3)) {
                str = null;
            } else {
                str = str3 + "cm";
            }
        }
        this.f5166m = j760.a(Integer.valueOf(x2c0.R8), str);
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(user.profile.extensions.wealth)) {
            UserWealth userWealth = user.profile.extensions.wealth;
            list2 = userWealth.upperIncome;
            list = userWealth.lowIncome;
        } else {
            list = null;
            list2 = null;
        }
        if (NullChecker.a(userP9.profile.extensions.wealth)) {
            UserWealth userWealth2 = userP9.profile.extensions.wealth;
            if (TextUtils.isEmpty(h7j.M(userWealth2.upperIncome, userWealth2.lowIncome))) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        String strM = (!(vwb.J(list) && vwb.J(list2)) && (user.isMe() || !z)) ? h7j.M(list2, list) : null;
        String strM2 = (!(vwb.J(list) && vwb.J(list2)) && user.isMe()) ? h7j.M(list2, list) : null;
        this.f5167n = j760.a(Integer.valueOf(x2c0.U8), strM);
        this.f5168o = j760.a(Integer.valueOf(x2c0.U8), strM2);
        if (NullChecker.a(userP9.profile.extensions.wealth) && !vwb.J(userP9.profile.extensions.wealth.car)) {
            TextUtils.isEmpty(h7j.n((String) userP9.profile.extensions.wealth.car.get(0)));
        }
        List list8 = (NullChecker.a(user.profile.extensions.wealth) && user.isMe()) ? user.profile.extensions.wealth.car : null;
        this.f5169p = j760.a(Integer.valueOf(x2c0.O8), !vwb.J(list8) ? h7j.n((String) list8.get(0)) : null);
        if (NullChecker.a(user.profile.extensions.wealth)) {
            UserWealth userWealth3 = user.profile.extensions.wealth;
            list4 = userWealth3.house;
            list5 = userWealth3.houseRegion;
            list3 = userWealth3.houseSubRegion;
        } else {
            list3 = null;
            list4 = null;
            list5 = null;
        }
        if (!vwb.J(list4) && user.isMe()) {
            if (vwb.J(list3) || TextUtils.isEmpty((CharSequence) list3.get(0))) {
                str2 = (vwb.J(list5) || TextUtils.isEmpty((CharSequence) list5.get(0))) ? "" : (String) list5.get(0);
            } else {
                str2 = (String) list3.get(0);
            }
            strK = h7j.K((String) list4.get(0), str2);
        }
        this.f5170q = j760.a(Integer.valueOf(x2c0.T8), strK);
    }

    /* JADX INFO: renamed from: f */
    public final void m7363f(List<View> list, int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(m7360c(i, str));
        this.f5171r.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: g */
    public final boolean m7364g(User user) {
        Profile profile = user.profile;
        Work work = profile.work;
        return (TextUtils.isEmpty(work.industry) && TextUtils.isEmpty(work.company) && TextUtils.isEmpty(profile.studies.school) && TextUtils.isEmpty(profile.hometown) && TextUtils.isEmpty(profile.hangouts) && TextUtils.isEmpty((CharSequence) i0g0.m16141m0(profile.zodiac).b)) ? false : true;
    }

    public Act getAct() {
        return getContext();
    }

    /* JADX INFO: renamed from: h */
    public void m7365h(da80 da80Var) {
        m7362e(da80Var.f11695b);
        boolean zIsEmpty = TextUtils.isEmpty(this.f5158e);
        VText vText = this.f5156c;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setText(this.f5158e);
            this.f5156c.setVisibility(0);
        }
        if (!m7364g(da80Var.f11695b)) {
            this.f5157d.setVisibility(8);
            return;
        }
        List<j760<Integer, String>> listM7361d = m7361d(da80Var.f11695b);
        FlowView flowView = this.f5157d;
        flowView.f = true;
        flowView.setTags(m7366i(listM7361d));
        this.f5157d.setVisibility(0);
    }

    /* JADX INFO: renamed from: i */
    public final List<View> m7366i(List<j760<Integer, String>> list) {
        ArrayList arrayList = new ArrayList();
        this.f5171r.clear();
        for (j760<Integer, String> j760Var : list) {
            if (j760Var != null) {
                m7363f(arrayList, ((Integer) j760Var.a).intValue(), (String) j760Var.b);
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7358a(this);
        this.f5155b.setTypeface(Typeface.DEFAULT_BOLD);
    }

    public FeedPoiCardItemAboutMeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5171r = new ArrayList();
    }

    public FeedPoiCardItemAboutMeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5171r = new ArrayList();
    }
}
