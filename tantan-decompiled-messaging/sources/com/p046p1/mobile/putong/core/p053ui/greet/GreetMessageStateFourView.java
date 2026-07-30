package com.p046p1.mobile.putong.core.p053ui.greet;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.greet.GreetMessageStateFourView;
import com.p046p1.mobile.putong.core.p053ui.view.ImFlowView;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.Purpose;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealth;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.Work;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.i0g0;
import p149l.l6c0;
import p149l.o6j0;
import p149l.o7r;
import p149l.qib0;
import p149l.t100;
import p149l.t9k;
import p149l.vwb;
import p149l.xaj0;
import p149l.xdl0;
import p149l.y4c0;

/* JADX INFO: loaded from: classes10.dex */
public class GreetMessageStateFourView extends FrameLayout {

    /* JADX INFO: renamed from: A */
    public String f29370A;

    /* JADX INFO: renamed from: B */
    public List<String> f29371B;

    /* JADX INFO: renamed from: a */
    public VLinear f29372a;

    /* JADX INFO: renamed from: b */
    public VText f29373b;

    /* JADX INFO: renamed from: c */
    public View f29374c;

    /* JADX INFO: renamed from: d */
    public VText f29375d;

    /* JADX INFO: renamed from: e */
    public View f29376e;

    /* JADX INFO: renamed from: f */
    public VText f29377f;

    /* JADX INFO: renamed from: g */
    public View f29378g;

    /* JADX INFO: renamed from: h */
    public VText f29379h;

    /* JADX INFO: renamed from: i */
    public VLinear f29380i;

    /* JADX INFO: renamed from: j */
    public ImFlowView f29381j;

    /* JADX INFO: renamed from: k */
    public VLinear f29382k;

    /* JADX INFO: renamed from: l */
    public VFrame f29383l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f29384m;

    /* JADX INFO: renamed from: n */
    public VImage f29385n;

    /* JADX INFO: renamed from: o */
    public VFrame f29386o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f29387p;

    /* JADX INFO: renamed from: q */
    public VImage f29388q;

    /* JADX INFO: renamed from: r */
    public VFrame f29389r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f29390s;

    /* JADX INFO: renamed from: t */
    public VImage f29391t;

    /* JADX INFO: renamed from: u */
    public VText f29392u;

    /* JADX INFO: renamed from: v */
    public VLinear f29393v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f29394w;

    /* JADX INFO: renamed from: x */
    public VText f29395x;

    /* JADX INFO: renamed from: y */
    public Act f29396y;

    /* JADX INFO: renamed from: z */
    public C8357a f29397z;

    public GreetMessageStateFourView(@NonNull Context context) {
        super(context);
        this.f29371B = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m45719a(C8357a c8357a, User user, View view) {
        o6j0.m162859c("e_user_photo", "p_kankan_chat_popup", new o6j0.C18854a[0]);
        c8357a.m45846B1("from_greet_act", user.f56011id);
    }

    /* JADX INFO: renamed from: b */
    public View m45720b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t9k.m187635b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public final String m45721c(int i) {
        if (i < 1000) {
            return i + "m";
        }
        if (i > 10000) {
            return "";
        }
        return (i / 1000) + "km";
    }

    /* JADX INFO: renamed from: d */
    public View m45722d(String str) {
        View viewInflate = this.f29396y.inflater().inflate(l6c0.f126333L0, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(y4c0.f196032Q4);
        viewInflate.setBackgroundResource(c3c0.f78629S0);
        vText.setCompoundDrawablePadding(t100.m186890d(4.0f));
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setGravity(17);
        vText.setSingleLine(true);
        vText.setMaxLines(1);
        vText.setPadding(t100.m186890d(12.0f), t100.m186890d(7.0f), t100.m186890d(12.0f), t100.m186890d(7.0f));
        vText.setTextSize(12.0f);
        vText.setTextColor(CoreModule.f17544b.getResources().getColor(a1c0.f67150d));
        vText.setText(str);
        return viewInflate;
    }

    /* JADX INFO: renamed from: e */
    public final void m45723e(List<View> list, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(m45722d(str));
    }

    /* JADX INFO: renamed from: f */
    public final void m45724f(User user) {
        if (NullChecker.m81303a(user)) {
            this.f29373b.setText(user.age + "岁");
            xdl0.m208344M(this.f29374c, TextUtils.isEmpty(i0g0.m133869j0(user.profile.zodiac)) ^ true);
            this.f29375d.setText(i0g0.m133869j0(user.profile.zodiac));
            xdl0.m208344M(this.f29376e, TextUtils.isEmpty(m45721c(user.location.distance)) ^ true);
            xdl0.m208344M(this.f29377f, !TextUtils.isEmpty(m45721c(user.location.distance)));
            this.f29377f.setText("距你" + m45721c(user.location.distance));
            xdl0.m208344M(this.f29378g, TextUtils.isEmpty(this.f29370A) ^ true);
            this.f29379h.setText(this.f29370A);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0040  */
    /* JADX INFO: renamed from: g */
    public final boolean m45725g(User user) {
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
        if (vwb.m200296J(list3)) {
            str = "";
        } else {
            xaj0<String, String, String> xaj0VarMo158225E2 = CoreModule.m29935P().m94658i().mo158225E2(list3.get(0).toString());
            if (TextUtils.isEmpty(xaj0VarMo158225E2.f191751a)) {
                str = "";
            } else {
                str = xaj0VarMo158225E2.f191751a;
            }
        }
        List<String> list4 = user.profile.extensions.physical.height;
        if (vwb.m200296J(list4)) {
            str2 = "";
        } else {
            String str7 = list4.get(0);
            if (TextUtils.isEmpty(str7) || TextUtils.equals(str7, CoreModule.f17544b.getString(R$string.f21066q5))) {
                str2 = "";
            } else {
                str2 = str7 + CoreModule.m29935P().m94658i().mo158409m1();
            }
        }
        if (NullChecker.m81303a(user.profile.extensions.wealth)) {
            UserWealth userWealth = user.profile.extensions.wealth;
            list = userWealth.upperIncome;
            list2 = userWealth.lowIncome;
        } else {
            list = null;
            list2 = null;
        }
        if (!vwb.m200296J(list2) || !vwb.m200296J(list)) {
            String strMo158407m = CoreModule.m29935P().m94658i().mo158407m(list, list2);
            if (!TextUtils.isEmpty(strMo158407m) && !TextUtils.equals(strMo158407m, CoreModule.f17544b.getString(R$string.f21066q5))) {
                str6 = strMo158407m;
            }
        }
        this.f29371B.clear();
        if (!TextUtils.isEmpty(str3)) {
            this.f29371B.add(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            this.f29371B.add(str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            this.f29371B.add(str5);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f29371B.add(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f29371B.add(str2);
        }
        if (!TextUtils.isEmpty(str6)) {
            this.f29371B.add(str6);
        }
        return !vwb.m200296J(this.f29371B);
    }

    /* JADX INFO: renamed from: h */
    public void m45726h(final C8357a c8357a, final User user, String str) {
        GreetMessageStateFourView greetMessageStateFourView;
        this.f29397z = c8357a;
        this.f29396y = c8357a.act();
        this.f29370A = str;
        m45724f(user);
        xdl0.m208344M(this.f29380i, m45725g(user));
        this.f29381j.setTags(m45728j());
        this.f29381j.m56117c();
        this.f29381j.setHeightLineSpace(t100.m186890d(0.0f));
        this.f29381j.setWidthSpace(t100.m186890d(6.0f));
        List<Media> list = user.pictures;
        int size = list.size();
        if (size > 2) {
            o6j0.m162864h("e_user_photo", "p_kankan_chat_popup", new o6j0.C18854a[0]);
            greetMessageStateFourView = this;
            greetMessageStateFourView.m45727i(this.f29383l, this.f29384m, this.f29385n, list, 1);
            greetMessageStateFourView.m45727i(greetMessageStateFourView.f29386o, greetMessageStateFourView.f29387p, greetMessageStateFourView.f29388q, list, 2);
        } else {
            greetMessageStateFourView = this;
        }
        if (size > 3) {
            greetMessageStateFourView.m45727i(greetMessageStateFourView.f29389r, greetMessageStateFourView.f29390s, greetMessageStateFourView.f29391t, list, 3);
        }
        xdl0.m208344M(greetMessageStateFourView.f29382k, list.size() > 2);
        greetMessageStateFourView.f29382k.setOnClickListener(new View.OnClickListener() { // from class: l.s9k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GreetMessageStateFourView.m45719a(c8357a, user, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m45727i(VFrame vFrame, VDraweeView vDraweeView, VImage vImage, List<Media> list, int i) {
        if (list.size() <= i) {
            xdl0.m208344M(vFrame, false);
            return;
        }
        xdl0.m208344M(vFrame, true);
        Media media = list.get(i);
        qib0.f154691G.m102327J0(vDraweeView, media.cover().profileSize(80), false);
        if (i != 3 || list.size() <= 4) {
            xdl0.m208344M(vImage, media instanceof Video);
            xdl0.m208344M(this.f29392u, false);
        } else {
            xdl0.m208344M(vImage, false);
            xdl0.m208344M(this.f29392u, true);
            this.f29392u.setText(String.format("+%s", Integer.valueOf(list.size() - 4)));
        }
    }

    /* JADX INFO: renamed from: j */
    public final List<View> m45728j() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f29371B.iterator();
        while (it.hasNext()) {
            m45723e(arrayList, it.next());
        }
        return arrayList;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        addView(m45720b(o7r.m163037a(getContext()), this));
    }

    public GreetMessageStateFourView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29371B = new ArrayList();
    }

    public GreetMessageStateFourView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29371B = new ArrayList();
    }
}
