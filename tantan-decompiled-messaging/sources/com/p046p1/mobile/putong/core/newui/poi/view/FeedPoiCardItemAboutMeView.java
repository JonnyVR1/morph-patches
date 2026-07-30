package com.p046p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowView;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealth;
import com.p046p1.mobile.putong.data.Work;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VText;
import p149l.da80;
import p149l.f6c0;
import p149l.h7j;
import p149l.i0g0;
import p149l.j760;
import p149l.t100;
import p149l.tnh;
import p149l.u4c0;
import p149l.vwb;
import p149l.w0c0;
import p149l.x2c0;

/* JADX INFO: loaded from: classes11.dex */
public class FeedPoiCardItemAboutMeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FeedPoiCardItemAboutMeView f26376a;

    /* JADX INFO: renamed from: b */
    public VText f26377b;

    /* JADX INFO: renamed from: c */
    public VText f26378c;

    /* JADX INFO: renamed from: d */
    public FlowView f26379d;

    /* JADX INFO: renamed from: e */
    public String f26380e;

    /* JADX INFO: renamed from: f */
    public j760<Integer, String> f26381f;

    /* JADX INFO: renamed from: g */
    public j760<Integer, String> f26382g;

    /* JADX INFO: renamed from: h */
    public j760<Integer, String> f26383h;

    /* JADX INFO: renamed from: i */
    public j760<Integer, String> f26384i;

    /* JADX INFO: renamed from: j */
    public j760<Integer, String> f26385j;

    /* JADX INFO: renamed from: k */
    public j760<Integer, String> f26386k;

    /* JADX INFO: renamed from: l */
    public j760<Integer, String> f26387l;

    /* JADX INFO: renamed from: m */
    public j760<Integer, String> f26388m;

    /* JADX INFO: renamed from: n */
    public j760<Integer, String> f26389n;

    /* JADX INFO: renamed from: o */
    public j760<Integer, String> f26390o;

    /* JADX INFO: renamed from: p */
    public j760<Integer, String> f26391p;

    /* JADX INFO: renamed from: q */
    public j760<Integer, String> f26392q;

    /* JADX INFO: renamed from: r */
    public List<Integer> f26393r;

    public FeedPoiCardItemAboutMeView(Context context) {
        super(context);
        this.f26393r = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m43143a(View view) {
        tnh.m189775a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final String m43144b(Profile profile) {
        return profile.hometown;
    }

    /* JADX INFO: renamed from: c */
    public View m43145c(int i, String str) {
        View viewInflate = getAct().inflater().inflate(f6c0.f95389Ha, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174268ge);
        viewInflate.setBackgroundResource(x2c0.f190433om);
        try {
            Drawable drawable = getContext().getDrawable(i);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            vText.setCompoundDrawables(drawable, null, null, null);
        } catch (Exception unused) {
        }
        vText.setCompoundDrawablePadding(t100.f167256e);
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setGravity(17);
        vText.setSingleLine(true);
        vText.setMaxLines(1);
        vText.setPadding(t100.m186890d(9.0f), t100.m186890d(10.0f), t100.m186890d(13.0f), t100.m186890d(10.0f));
        vText.setTextSize(14.0f);
        vText.setTextColor(CoreModule.f17544b.getResources().getColor(w0c0.f183869n));
        vText.setText(str);
        return viewInflate;
    }

    /* JADX INFO: renamed from: d */
    public final List<j760<Integer, String>> m43146d(User user) {
        return new ArrayList(vwb.m200324f0(this.f26381f, this.f26382g, this.f26383h, this.f26384i, this.f26385j, this.f26386k));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0100  */
    /* JADX WARN: Code duplicated, block: B:34:0x0151  */
    /* JADX INFO: renamed from: e */
    public final void m43147e(User user) {
        String str;
        List<String> list;
        List<String> list2;
        boolean z;
        List<String> list3;
        List<String> list4;
        List<String> list5;
        String str2;
        this.f26380e = user.description;
        Profile profile = user.profile;
        String string = profile.work.industry;
        if (profile.studies.active) {
            string = CoreModule.f17544b.getString(R$string.f18277Xk);
        }
        this.f26381f = j760.m140076a(Integer.valueOf(x2c0.f189819V8), string);
        if (!user.profile.studies.active) {
            this.f26382g = j760.m140076a(Integer.valueOf(x2c0.f189633P8), user.profile.work.company);
        }
        this.f26383h = j760.m140076a(Integer.valueOf(x2c0.f189881X8), user.profile.studies.school);
        String strM43144b = m43144b(user.profile);
        if (!TextUtils.isEmpty(strM43144b)) {
            this.f26384i = j760.m140076a(Integer.valueOf(x2c0.f189726S8), String.format(CoreModule.f17544b.getString(R$string.f17977Nk), strM43144b));
        }
        if (!TextUtils.isEmpty(user.profile.hangouts)) {
            this.f26385j = j760.m140076a(Integer.valueOf(x2c0.f189664Q8), String.format(CoreModule.f17544b.getString(R$string.f18157Tk), user.profile.hangouts));
        }
        this.f26386k = i0g0.m133873m0(user.profile.zodiac);
        List<String> list6 = user.profile.extensions.basic.qualification;
        String strM129699K = null;
        this.f26387l = j760.m140076a(Integer.valueOf(x2c0.f189850W8), !vwb.m200296J(list6) ? h7j.m129711W(list6.get(0)) : null);
        List<String> list7 = user.profile.extensions.physical.height;
        if (vwb.m200296J(list7)) {
            str = null;
        } else {
            String str3 = list7.get(0);
            if (TextUtils.isEmpty(str3)) {
                str = null;
            } else {
                str = str3 + CoreStaticData.FriendPurposeDataType.HEIGHT_UNIT_STR;
            }
        }
        this.f26388m = j760.m140076a(Integer.valueOf(x2c0.f189695R8), str);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(user.profile.extensions.wealth)) {
            UserWealth userWealth = user.profile.extensions.wealth;
            list2 = userWealth.upperIncome;
            list = userWealth.lowIncome;
        } else {
            list = null;
            list2 = null;
        }
        if (NullChecker.m81303a(userM169527p9.profile.extensions.wealth)) {
            UserWealth userWealth2 = userM169527p9.profile.extensions.wealth;
            if (TextUtils.isEmpty(h7j.m129701M(userWealth2.upperIncome, userWealth2.lowIncome))) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        String strM129701M = (!(vwb.m200296J(list) && vwb.m200296J(list2)) && (user.isMe() || !z)) ? h7j.m129701M(list2, list) : null;
        String strM129701M2 = (!(vwb.m200296J(list) && vwb.m200296J(list2)) && user.isMe()) ? h7j.m129701M(list2, list) : null;
        this.f26389n = j760.m140076a(Integer.valueOf(x2c0.f189788U8), strM129701M);
        this.f26390o = j760.m140076a(Integer.valueOf(x2c0.f189788U8), strM129701M2);
        if (NullChecker.m81303a(userM169527p9.profile.extensions.wealth) && !vwb.m200296J(userM169527p9.profile.extensions.wealth.car)) {
            TextUtils.isEmpty(h7j.m129730n(userM169527p9.profile.extensions.wealth.car.get(0)));
        }
        List<String> list8 = (NullChecker.m81303a(user.profile.extensions.wealth) && user.isMe()) ? user.profile.extensions.wealth.car : null;
        this.f26391p = j760.m140076a(Integer.valueOf(x2c0.f189602O8), !vwb.m200296J(list8) ? h7j.m129730n(list8.get(0)) : null);
        if (NullChecker.m81303a(user.profile.extensions.wealth)) {
            UserWealth userWealth3 = user.profile.extensions.wealth;
            list4 = userWealth3.house;
            list5 = userWealth3.houseRegion;
            list3 = userWealth3.houseSubRegion;
        } else {
            list3 = null;
            list4 = null;
            list5 = null;
        }
        if (!vwb.m200296J(list4) && user.isMe()) {
            if (vwb.m200296J(list3) || TextUtils.isEmpty(list3.get(0))) {
                str2 = (vwb.m200296J(list5) || TextUtils.isEmpty(list5.get(0))) ? "" : list5.get(0);
            } else {
                str2 = list3.get(0);
            }
            strM129699K = h7j.m129699K(list4.get(0), str2);
        }
        this.f26392q = j760.m140076a(Integer.valueOf(x2c0.f189757T8), strM129699K);
    }

    /* JADX INFO: renamed from: f */
    public final void m43148f(List<View> list, int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(m43145c(i, str));
        this.f26393r.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: g */
    public final boolean m43149g(User user) {
        Profile profile = user.profile;
        Work work = profile.work;
        return (TextUtils.isEmpty(work.industry) && TextUtils.isEmpty(work.company) && TextUtils.isEmpty(profile.studies.school) && TextUtils.isEmpty(profile.hometown) && TextUtils.isEmpty(profile.hangouts) && TextUtils.isEmpty(i0g0.m133873m0(profile.zodiac).f116565b)) ? false : true;
    }

    public Act getAct() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: h */
    public void m43150h(da80 da80Var) {
        m43147e(da80Var.f85198b);
        boolean zIsEmpty = TextUtils.isEmpty(this.f26380e);
        VText vText = this.f26378c;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setText(this.f26380e);
            this.f26378c.setVisibility(0);
        }
        if (!m43149g(da80Var.f85198b)) {
            this.f26379d.setVisibility(8);
            return;
        }
        List<j760<Integer, String>> listM43146d = m43146d(da80Var.f85198b);
        FlowView flowView = this.f26379d;
        flowView.f34120f = true;
        flowView.setTags(m43151i(listM43146d));
        this.f26379d.setVisibility(0);
    }

    /* JADX INFO: renamed from: i */
    public final List<View> m43151i(List<j760<Integer, String>> list) {
        ArrayList arrayList = new ArrayList();
        this.f26393r.clear();
        for (j760<Integer, String> j760Var : list) {
            if (j760Var != null) {
                m43148f(arrayList, j760Var.f116564a.intValue(), j760Var.f116565b);
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43143a(this);
        this.f26377b.setTypeface(Typeface.DEFAULT_BOLD);
    }

    public FeedPoiCardItemAboutMeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26393r = new ArrayList();
    }

    public FeedPoiCardItemAboutMeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26393r = new ArrayList();
    }
}
