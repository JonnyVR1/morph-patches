package com.p000p1.mobile.putong.core.p001ui.greet;

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
import com.p000p1.mobile.putong.core.message.R$string;
import com.p000p1.mobile.putong.core.p001ui.greet.GreetMessageStateFourView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.view.ImFlowView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.Purpose;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserWealth;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.Work;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.i0g0;
import l.o7r;
import l.qib0;
import l.t100;
import l.vwb;
import l.xaj0;
import l.xdl0;
import p003l.a1c0;
import p003l.c3c0;
import p003l.l6c0;
import p003l.o6j0;
import p003l.t9k;
import p003l.y4c0;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GreetMessageStateFourView extends FrameLayout {

    /* JADX INFO: renamed from: A */
    public String f1764A;

    /* JADX INFO: renamed from: B */
    public List<String> f1765B;

    /* JADX INFO: renamed from: a */
    public VLinear f1766a;

    /* JADX INFO: renamed from: b */
    public VText f1767b;

    /* JADX INFO: renamed from: c */
    public View f1768c;

    /* JADX INFO: renamed from: d */
    public VText f1769d;

    /* JADX INFO: renamed from: e */
    public View f1770e;

    /* JADX INFO: renamed from: f */
    public VText f1771f;

    /* JADX INFO: renamed from: g */
    public View f1772g;

    /* JADX INFO: renamed from: h */
    public VText f1773h;

    /* JADX INFO: renamed from: i */
    public VLinear f1774i;

    /* JADX INFO: renamed from: j */
    public ImFlowView f1775j;

    /* JADX INFO: renamed from: k */
    public VLinear f1776k;

    /* JADX INFO: renamed from: l */
    public VFrame f1777l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f1778m;

    /* JADX INFO: renamed from: n */
    public VImage f1779n;

    /* JADX INFO: renamed from: o */
    public VFrame f1780o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f1781p;

    /* JADX INFO: renamed from: q */
    public VImage f1782q;

    /* JADX INFO: renamed from: r */
    public VFrame f1783r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f1784s;

    /* JADX INFO: renamed from: t */
    public VImage f1785t;

    /* JADX INFO: renamed from: u */
    public VText f1786u;

    /* JADX INFO: renamed from: v */
    public VLinear f1787v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f1788w;

    /* JADX INFO: renamed from: x */
    public VText f1789x;

    /* JADX INFO: renamed from: y */
    public Act f1790y;

    /* JADX INFO: renamed from: z */
    public C3132a f1791z;

    public GreetMessageStateFourView(@NonNull Context context) {
        super(context);
        this.f1765B = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3057a(C3132a c3132a, User user, View view) {
        o6j0.m8403c("e_user_photo", "p_kankan_chat_popup", new o6j0.C3390a[0]);
        c3132a.m3190B1("from_greet_act", ((DbObject) user).id);
    }

    /* JADX INFO: renamed from: b */
    public View m3058b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t9k.m9553b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public final String m3059c(int i) {
        if (i < 1000) {
            return i + "m";
        }
        if (i > 10000) {
            return "";
        }
        return (i / 1000) + "km";
    }

    /* JADX INFO: renamed from: d */
    public View m3060d(String str) {
        View viewInflate = this.f1790y.inflater().inflate(l6c0.f5842L0, (ViewGroup) null);
        VText vTextFindViewById = viewInflate.findViewById(y4c0.f8749Q4);
        viewInflate.setBackgroundResource(c3c0.f3666S0);
        vTextFindViewById.setCompoundDrawablePadding(t100.d(4.0f));
        vTextFindViewById.setTypeface(Typeface.DEFAULT_BOLD);
        vTextFindViewById.setEllipsize(TextUtils.TruncateAt.END);
        vTextFindViewById.setGravity(17);
        vTextFindViewById.setSingleLine(true);
        vTextFindViewById.setMaxLines(1);
        vTextFindViewById.setPadding(t100.d(12.0f), t100.d(7.0f), t100.d(12.0f), t100.d(7.0f));
        vTextFindViewById.setTextSize(12.0f);
        vTextFindViewById.setTextColor(CoreModule.b.getResources().getColor(a1c0.f2696d));
        vTextFindViewById.setText(str);
        return viewInflate;
    }

    /* JADX INFO: renamed from: e */
    public final void m3061e(List<View> list, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(m3060d(str));
    }

    /* JADX INFO: renamed from: f */
    public final void m3062f(User user) {
        if (NullChecker.a(user)) {
            this.f1767b.setText(user.age + "岁");
            xdl0.M(this.f1768c, TextUtils.isEmpty(i0g0.j0(user.profile.zodiac)) ^ true);
            this.f1769d.setText(i0g0.j0(user.profile.zodiac));
            xdl0.M(this.f1770e, TextUtils.isEmpty(m3059c(user.location.distance)) ^ true);
            xdl0.M(this.f1771f, !TextUtils.isEmpty(m3059c(user.location.distance)));
            this.f1771f.setText("距你" + m3059c(user.location.distance));
            xdl0.M(this.f1772g, TextUtils.isEmpty(this.f1764A) ^ true);
            this.f1773h.setText(this.f1764A);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0040  */
    /* JADX INFO: renamed from: g */
    public final boolean m3063g(User user) {
        String str;
        String str2;
        List list;
        List list2;
        Profile profile = user.profile;
        Work work = profile.work;
        String str3 = work.industry;
        String str4 = work.company;
        String str5 = profile.studies.school;
        List list3 = profile.extensions.basic.friendPurpose;
        String str6 = "";
        if (vwb.J(list3)) {
            str = "";
        } else {
            xaj0 xaj0VarE2 = CoreModule.P().i().E2(((Purpose) list3.get(0)).toString());
            if (TextUtils.isEmpty((CharSequence) xaj0VarE2.a)) {
                str = "";
            } else {
                str = (String) xaj0VarE2.a;
            }
        }
        List list4 = user.profile.extensions.physical.height;
        if (vwb.J(list4)) {
            str2 = "";
        } else {
            String str7 = (String) list4.get(0);
            if (TextUtils.isEmpty(str7) || TextUtils.equals(str7, CoreModule.b.getString(R$string.f728q5))) {
                str2 = "";
            } else {
                str2 = str7 + CoreModule.P().i().m1();
            }
        }
        if (NullChecker.a(user.profile.extensions.wealth)) {
            UserWealth userWealth = user.profile.extensions.wealth;
            list = userWealth.upperIncome;
            list2 = userWealth.lowIncome;
        } else {
            list = null;
            list2 = null;
        }
        if (!vwb.J(list2) || !vwb.J(list)) {
            String strM = CoreModule.P().i().m(list, list2);
            if (!TextUtils.isEmpty(strM) && !TextUtils.equals(strM, CoreModule.b.getString(R$string.f728q5))) {
                str6 = strM;
            }
        }
        this.f1765B.clear();
        if (!TextUtils.isEmpty(str3)) {
            this.f1765B.add(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            this.f1765B.add(str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            this.f1765B.add(str5);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f1765B.add(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f1765B.add(str2);
        }
        if (!TextUtils.isEmpty(str6)) {
            this.f1765B.add(str6);
        }
        return !vwb.J(this.f1765B);
    }

    /* JADX INFO: renamed from: h */
    public void m3064h(final C3132a c3132a, final User user, String str) {
        GreetMessageStateFourView greetMessageStateFourView;
        this.f1791z = c3132a;
        this.f1790y = c3132a.act();
        this.f1764A = str;
        m3062f(user);
        xdl0.M(this.f1774i, m3063g(user));
        this.f1775j.setTags(m3066j());
        this.f1775j.c();
        this.f1775j.setHeightLineSpace(t100.d(0.0f));
        this.f1775j.setWidthSpace(t100.d(6.0f));
        List<Media> list = user.pictures;
        int size = list.size();
        if (size > 2) {
            o6j0.m8408h("e_user_photo", "p_kankan_chat_popup", new o6j0.C3390a[0]);
            greetMessageStateFourView = this;
            greetMessageStateFourView.m3065i(this.f1777l, this.f1778m, this.f1779n, list, 1);
            greetMessageStateFourView.m3065i(greetMessageStateFourView.f1780o, greetMessageStateFourView.f1781p, greetMessageStateFourView.f1782q, list, 2);
        } else {
            greetMessageStateFourView = this;
        }
        if (size > 3) {
            greetMessageStateFourView.m3065i(greetMessageStateFourView.f1783r, greetMessageStateFourView.f1784s, greetMessageStateFourView.f1785t, list, 3);
        }
        xdl0.M(greetMessageStateFourView.f1776k, list.size() > 2);
        greetMessageStateFourView.f1776k.setOnClickListener(new View.OnClickListener() { // from class: l.s9k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GreetMessageStateFourView.m3057a(c3132a, user, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m3065i(VFrame vFrame, VDraweeView vDraweeView, VImage vImage, List<Media> list, int i) {
        if (list.size() <= i) {
            xdl0.M(vFrame, false);
            return;
        }
        xdl0.M(vFrame, true);
        Media media = list.get(i);
        qib0.G.J0(vDraweeView, media.cover().profileSize(80), false);
        if (i != 3 || list.size() <= 4) {
            xdl0.M(vImage, media instanceof Video);
            xdl0.M(this.f1786u, false);
        } else {
            xdl0.M(vImage, false);
            xdl0.M(this.f1786u, true);
            this.f1786u.setText(String.format("+%s", Integer.valueOf(list.size() - 4)));
        }
    }

    /* JADX INFO: renamed from: j */
    public final List<View> m3066j() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f1765B.iterator();
        while (it.hasNext()) {
            m3061e(arrayList, it.next());
        }
        return arrayList;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        addView(m3058b(o7r.a(getContext()), this));
    }

    public GreetMessageStateFourView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1765B = new ArrayList();
    }

    public GreetMessageStateFourView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1765B = new ArrayList();
    }
}
