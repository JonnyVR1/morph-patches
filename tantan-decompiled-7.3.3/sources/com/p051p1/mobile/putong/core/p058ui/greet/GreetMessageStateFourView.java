package com.p051p1.mobile.putong.core.p058ui.greet;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.greet.GreetMessageStateFourView;
import com.p051p1.mobile.putong.core.p058ui.view.ImFlowView;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.Purpose;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserWealth;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.Work;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bkj0;
import p153l.bnl0;
import p153l.edc0;
import p153l.g9c0;
import p153l.ibc0;
import p153l.jyb;
import p153l.kck;
import p153l.p9r;
import p153l.q8g0;
import p153l.qa00;
import p153l.qec0;
import p153l.sfj0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class GreetMessageStateFourView extends FrameLayout {

    /* JADX INFO: renamed from: A */
    public String f30218A;

    /* JADX INFO: renamed from: B */
    public List<String> f30219B;

    /* JADX INFO: renamed from: a */
    public VLinear f30220a;

    /* JADX INFO: renamed from: b */
    public VText f30221b;

    /* JADX INFO: renamed from: c */
    public View f30222c;

    /* JADX INFO: renamed from: d */
    public VText f30223d;

    /* JADX INFO: renamed from: e */
    public View f30224e;

    /* JADX INFO: renamed from: f */
    public VText f30225f;

    /* JADX INFO: renamed from: g */
    public View f30226g;

    /* JADX INFO: renamed from: h */
    public VText f30227h;

    /* JADX INFO: renamed from: i */
    public VLinear f30228i;

    /* JADX INFO: renamed from: j */
    public ImFlowView f30229j;

    /* JADX INFO: renamed from: k */
    public VLinear f30230k;

    /* JADX INFO: renamed from: l */
    public VFrame f30231l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f30232m;

    /* JADX INFO: renamed from: n */
    public VImage f30233n;

    /* JADX INFO: renamed from: o */
    public VFrame f30234o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f30235p;

    /* JADX INFO: renamed from: q */
    public VImage f30236q;

    /* JADX INFO: renamed from: r */
    public VFrame f30237r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f30238s;

    /* JADX INFO: renamed from: t */
    public VImage f30239t;

    /* JADX INFO: renamed from: u */
    public VText f30240u;

    /* JADX INFO: renamed from: v */
    public VLinear f30241v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f30242w;

    /* JADX INFO: renamed from: x */
    public VText f30243x;

    /* JADX INFO: renamed from: y */
    public Act f30244y;

    /* JADX INFO: renamed from: z */
    public C8520a f30245z;

    public GreetMessageStateFourView(@NonNull Context context) {
        super(context);
        this.f30219B = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m46902a(C8520a c8520a, User user, View view) {
        sfj0.m185596c("e_user_photo", "p_kankan_chat_popup", new sfj0.C20032a[0]);
        c8520a.m47029B1("from_greet_act", user.f56859id);
    }

    /* JADX INFO: renamed from: b */
    public View m46903b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kck.m149115b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public final String m46904c(int i) {
        if (i < 1000) {
            return i + "m";
        }
        if (i > 10000) {
            return "";
        }
        return (i / 1000) + "km";
    }

    /* JADX INFO: renamed from: d */
    public View m46905d(String str) {
        View viewInflate = this.f30244y.inflater().inflate(qec0.f156889L0, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(edc0.f93267Q4);
        viewInflate.setBackgroundResource(ibc0.f113904S0);
        vText.setCompoundDrawablePadding(qa00.m175859d(4.0f));
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setGravity(17);
        vText.setSingleLine(true);
        vText.setMaxLines(1);
        vText.setPadding(qa00.m175859d(12.0f), qa00.m175859d(7.0f), qa00.m175859d(12.0f), qa00.m175859d(7.0f));
        vText.setTextSize(12.0f);
        vText.setTextColor(CoreModule.f18263b.getResources().getColor(g9c0.f102814d));
        vText.setText(str);
        return viewInflate;
    }

    /* JADX INFO: renamed from: e */
    public final void m46906e(List<View> list, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(m46905d(str));
    }

    /* JADX INFO: renamed from: f */
    public final void m46907f(User user) {
        if (NullChecker.m82486a(user)) {
            this.f30221b.setText(user.age + "岁");
            bnl0.m105524M(this.f30222c, TextUtils.isEmpty(q8g0.m175804j0(user.profile.zodiac)) ^ true);
            this.f30223d.setText(q8g0.m175804j0(user.profile.zodiac));
            bnl0.m105524M(this.f30224e, TextUtils.isEmpty(m46904c(user.location.distance)) ^ true);
            bnl0.m105524M(this.f30225f, !TextUtils.isEmpty(m46904c(user.location.distance)));
            this.f30225f.setText("距你" + m46904c(user.location.distance));
            bnl0.m105524M(this.f30226g, TextUtils.isEmpty(this.f30218A) ^ true);
            this.f30227h.setText(this.f30218A);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0040  */
    /* JADX INFO: renamed from: g */
    public final boolean m46908g(User user) {
        String str;
        String str2;
        List<String> list;
        List<String> list2;
        Profile profile = user.profile;
        Work work = profile.work;
        String str3 = work.industry;
        String str4 = work.company;
        String str5 = profile.studies.school;
        List<Purpose> list3 = profile.extensions.basic.friendPurpose;
        String str6 = "";
        if (jyb.m147479J(list3)) {
            str = "";
        } else {
            bkj0<String, String, String> bkj0VarMo180317E2 = CoreModule.m30933P().m143412i().mo180317E2(list3.get(0).toString());
            if (TextUtils.isEmpty(bkj0VarMo180317E2.f77081a)) {
                str = "";
            } else {
                str = bkj0VarMo180317E2.f77081a;
            }
        }
        List<String> list4 = user.profile.extensions.physical.height;
        if (jyb.m147479J(list4)) {
            str2 = "";
        } else {
            String str7 = list4.get(0);
            if (TextUtils.isEmpty(str7) || TextUtils.equals(str7, CoreModule.f18263b.getString(R$string.f21808q5))) {
                str2 = "";
            } else {
                str2 = str7 + CoreModule.m30933P().m143412i().mo180501m1();
            }
        }
        if (NullChecker.m82486a(user.profile.extensions.wealth)) {
            UserWealth userWealth = user.profile.extensions.wealth;
            list = userWealth.upperIncome;
            list2 = userWealth.lowIncome;
        } else {
            list = null;
            list2 = null;
        }
        if (!jyb.m147479J(list2) || !jyb.m147479J(list)) {
            String strMo180499m = CoreModule.m30933P().m143412i().mo180499m(list, list2);
            if (!TextUtils.isEmpty(strMo180499m) && !TextUtils.equals(strMo180499m, CoreModule.f18263b.getString(R$string.f21808q5))) {
                str6 = strMo180499m;
            }
        }
        this.f30219B.clear();
        if (!TextUtils.isEmpty(str3)) {
            this.f30219B.add(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            this.f30219B.add(str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            this.f30219B.add(str5);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f30219B.add(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f30219B.add(str2);
        }
        if (!TextUtils.isEmpty(str6)) {
            this.f30219B.add(str6);
        }
        return !jyb.m147479J(this.f30219B);
    }

    /* JADX INFO: renamed from: h */
    public void m46909h(final C8520a c8520a, final User user, String str) {
        GreetMessageStateFourView greetMessageStateFourView;
        this.f30245z = c8520a;
        this.f30244y = c8520a.act();
        this.f30218A = str;
        m46907f(user);
        bnl0.m105524M(this.f30228i, m46908g(user));
        this.f30229j.setTags(m46911j());
        this.f30229j.m57300c();
        this.f30229j.setHeightLineSpace(qa00.m175859d(0.0f));
        this.f30229j.setWidthSpace(qa00.m175859d(6.0f));
        List<Media> list = user.pictures;
        int size = list.size();
        if (size > 2) {
            sfj0.m185601h("e_user_photo", "p_kankan_chat_popup", new sfj0.C20032a[0]);
            greetMessageStateFourView = this;
            greetMessageStateFourView.m46910i(this.f30231l, this.f30232m, this.f30233n, list, 1);
            greetMessageStateFourView.m46910i(greetMessageStateFourView.f30234o, greetMessageStateFourView.f30235p, greetMessageStateFourView.f30236q, list, 2);
        } else {
            greetMessageStateFourView = this;
        }
        if (size > 3) {
            greetMessageStateFourView.m46910i(greetMessageStateFourView.f30237r, greetMessageStateFourView.f30238s, greetMessageStateFourView.f30239t, list, 3);
        }
        bnl0.m105524M(greetMessageStateFourView.f30230k, list.size() > 2);
        greetMessageStateFourView.f30230k.setOnClickListener(new View.OnClickListener() { // from class: l.jck
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GreetMessageStateFourView.m46902a(c8520a, user, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m46910i(VFrame vFrame, VDraweeView vDraweeView, VImage vImage, List<Media> list, int i) {
        if (list.size() <= i) {
            bnl0.m105524M(vFrame, false);
            return;
        }
        bnl0.m105524M(vFrame, true);
        Media media = list.get(i);
        uqb0.f180374G.m127111J0(vDraweeView, media.cover().profileSize(80), false);
        if (i != 3 || list.size() <= 4) {
            bnl0.m105524M(vImage, media instanceof Video);
            bnl0.m105524M(this.f30240u, false);
        } else {
            bnl0.m105524M(vImage, false);
            bnl0.m105524M(this.f30240u, true);
            this.f30240u.setText(String.format("+%s", Integer.valueOf(list.size() - 4)));
        }
    }

    /* JADX INFO: renamed from: j */
    public final List<View> m46911j() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f30219B.iterator();
        while (it.hasNext()) {
            m46906e(arrayList, it.next());
        }
        return arrayList;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        addView(m46903b(p9r.m171370a(getContext()), this));
    }

    public GreetMessageStateFourView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30219B = new ArrayList();
    }

    public GreetMessageStateFourView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30219B = new ArrayList();
    }
}
