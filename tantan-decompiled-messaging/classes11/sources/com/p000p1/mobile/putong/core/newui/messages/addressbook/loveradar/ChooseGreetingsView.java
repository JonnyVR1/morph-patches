package com.p000p1.mobile.putong.core.newui.messages.addressbook.loveradar;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.data.FateRadar;
import com.p1.mobile.putong.core.data.FateRadarGreeting;
import com.p1.mobile.putong.core.data.GreetingItem;
import com.p1.mobile.putong.core.ui.VText_Bold;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.c40;
import l.e30;
import l.eqh0;
import l.h35;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.xh0;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VListCell;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ChooseGreetingsView extends LinearLayout {

    /* JADX INFO: renamed from: A */
    public VText_Bold f4107A;

    /* JADX INFO: renamed from: B */
    public VFrame f4108B;

    /* JADX INFO: renamed from: C */
    public VText_Bold f4109C;

    /* JADX INFO: renamed from: D */
    public VFrame f4110D;

    /* JADX INFO: renamed from: E */
    public e30<String> f4111E;

    /* JADX INFO: renamed from: F */
    public e30<Integer> f4112F;

    /* JADX INFO: renamed from: G */
    public c40 f4113G;

    /* JADX INFO: renamed from: H */
    public FateRadar f4114H;

    /* JADX INFO: renamed from: I */
    public List<View> f4115I;

    /* JADX INFO: renamed from: J */
    public List<VText_Bold> f4116J;

    /* JADX INFO: renamed from: a */
    public VLinear f4117a;

    /* JADX INFO: renamed from: b */
    public VImage f4118b;

    /* JADX INFO: renamed from: c */
    public VFrame f4119c;

    /* JADX INFO: renamed from: d */
    public VImage f4120d;

    /* JADX INFO: renamed from: e */
    public VLinear f4121e;

    /* JADX INFO: renamed from: f */
    public VImage f4122f;

    /* JADX INFO: renamed from: g */
    public VFrame f4123g;

    /* JADX INFO: renamed from: h */
    public VImage f4124h;

    /* JADX INFO: renamed from: i */
    public VLinear f4125i;

    /* JADX INFO: renamed from: j */
    public VFrame f4126j;

    /* JADX INFO: renamed from: k */
    public VText_Bold f4127k;

    /* JADX INFO: renamed from: l */
    public VFrame f4128l;

    /* JADX INFO: renamed from: m */
    public VText_Bold f4129m;

    /* JADX INFO: renamed from: n */
    public VFrame f4130n;

    /* JADX INFO: renamed from: o */
    public VText_Bold f4131o;

    /* JADX INFO: renamed from: p */
    public VFrame f4132p;

    /* JADX INFO: renamed from: q */
    public VText_Bold f4133q;

    /* JADX INFO: renamed from: r */
    public VFrame f4134r;

    /* JADX INFO: renamed from: s */
    public VText_Bold f4135s;

    /* JADX INFO: renamed from: t */
    public VFrame f4136t;

    /* JADX INFO: renamed from: u */
    public VText_Bold f4137u;

    /* JADX INFO: renamed from: v */
    public VFrame f4138v;

    /* JADX INFO: renamed from: w */
    public VText_Bold f4139w;

    /* JADX INFO: renamed from: x */
    public VFrame f4140x;

    /* JADX INFO: renamed from: y */
    public VText_Bold f4141y;

    /* JADX INFO: renamed from: z */
    public VFrame f4142z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$a */
    public class ViewOnClickListenerC0308a implements View.OnClickListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$a$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public ViewOnClickListenerC0308a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new xh0.a(ChooseGreetingsView.this.getContext()).s("系统招呼语").g(false).j("配对成功后系统将为您给对方发送日常招呼语").r("我知道了").o(new a()).a().g();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$b */
    public class ViewOnClickListenerC0309b implements View.OnClickListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$b$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public ViewOnClickListenerC0309b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new xh0.a(ChooseGreetingsView.this.getContext()).s("自定义招呼语").g(false).j("配对成功后将为您随机发送您自定义的招呼语").r("我知道了").o(new a()).a().g();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$c */
    public class ViewOnClickListenerC0310c implements View.OnClickListener {
        public ViewOnClickListenerC0310c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChooseGreetingsView.this.getContext().startActivity(LoveRadarCustomGreetAct.m6040Z1(ChooseGreetingsView.this.getContext(), null));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$d */
    public class ViewOnClickListenerC0311d implements View.OnClickListener {
        public ViewOnClickListenerC0311d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChooseGreetingsView.this.m6031j();
            if (ChooseGreetingsView.this.f4111E != null) {
                ChooseGreetingsView.this.f4111E.call("system");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$e */
    public class ViewOnClickListenerC0312e implements View.OnClickListener {
        public ViewOnClickListenerC0312e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChooseGreetingsView.this.m6030i();
            if (ChooseGreetingsView.this.f4111E != null) {
                ChooseGreetingsView.this.f4111E.call("custom");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$f */
    public class ViewOnClickListenerC0313f implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f4150a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f4151b;

        public ViewOnClickListenerC0313f(List list, int i) {
            this.f4150a = list;
            this.f4151b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChooseGreetingsView.this.m6028g(this.f4150a, this.f4151b);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$g */
    public class C0314g implements c40.d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f4153a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f4154b;

        public C0314g(List list, int i) {
            this.f4153a = list;
            this.f4154b = i;
        }

        /* JADX INFO: renamed from: a */
        public void m6032a(VListCell vListCell, VListCell.a aVar, int i) {
            ChooseGreetingsView.this.f4113G.b();
            if (i == 0) {
                ChooseGreetingsView.this.getContext().startActivity(LoveRadarCustomGreetAct.m6040Z1(ChooseGreetingsView.this.getContext(), (GreetingItem) this.f4153a.get(this.f4154b)));
            } else {
                if (i != 1 || ChooseGreetingsView.this.f4112F == null) {
                    return;
                }
                ChooseGreetingsView.this.f4112F.call(Integer.valueOf(((GreetingItem) this.f4153a.get(this.f4154b)).id));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$h */
    public class ViewOnClickListenerC0315h implements View.OnClickListener {
        public ViewOnClickListenerC0315h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChooseGreetingsView.this.f4113G.b();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$i */
    public class C0316i implements w9j<GreetingItem, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f4157a;

        public C0316i(int i) {
            this.f4157a = i;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(GreetingItem greetingItem) {
            return Boolean.valueOf(greetingItem.id != this.f4157a);
        }
    }

    public ChooseGreetingsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m6026e(View view) {
        h35.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m6027f(FateRadar fateRadar) {
        this.f4114H = fateRadar;
        if (fateRadar == null) {
            return;
        }
        List list = fateRadar.greetings.items;
        if (vwb.J(list)) {
            Iterator<View> it = this.f4115I.iterator();
            while (it.hasNext()) {
                xdl0.M(it.next(), false);
            }
            return;
        }
        int size = list.size();
        VFrame vFrame = this.f4110D;
        if (size == 10) {
            xdl0.M(vFrame, false);
        } else {
            xdl0.M(vFrame, true);
        }
        for (int i = 0; i < this.f4115I.size(); i++) {
            int size2 = list.size();
            List<View> list2 = this.f4115I;
            if (i < size2) {
                xdl0.M(list2.get(i), true);
                this.f4116J.get(i).setText(((GreetingItem) list.get(i)).value);
            } else {
                xdl0.M(list2.get(i), false);
            }
            xdl0.E0(this.f4115I.get(i), new ViewOnClickListenerC0313f(list, i));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m6028g(List<GreetingItem> list, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("编辑");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "删除");
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FF6464")), 0, 2, 17);
        arrayList.add(spannableStringBuilder);
        c40 c40VarF = new c40.b(getContext()).I("取消").U(new ViewOnClickListenerC0315h()).P(eqh0.c(3)).Q(arrayList).V(new C0314g(list, i)).F();
        this.f4113G = c40VarF;
        c40VarF.f();
    }

    /* JADX INFO: renamed from: h */
    public void m6029h(int i) {
        FateRadar fateRadar = this.f4114H;
        if (fateRadar != null) {
            FateRadarGreeting fateRadarGreeting = fateRadar.greetings;
            fateRadarGreeting.items = vwb.n(fateRadarGreeting.items, new C0316i(i));
            m6027f(this.f4114H);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m6030i() {
        xdl0.M(this.f4120d, false);
        xdl0.M(this.f4124h, true);
        xdl0.M(this.f4125i, true);
    }

    /* JADX INFO: renamed from: j */
    public void m6031j() {
        xdl0.M(this.f4120d, true);
        xdl0.M(this.f4124h, false);
        xdl0.M(this.f4125i, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6026e(this);
        ArrayList arrayList = new ArrayList();
        this.f4115I = arrayList;
        arrayList.add(this.f4126j);
        this.f4115I.add(this.f4128l);
        this.f4115I.add(this.f4130n);
        this.f4115I.add(this.f4132p);
        this.f4115I.add(this.f4134r);
        this.f4115I.add(this.f4136t);
        this.f4115I.add(this.f4138v);
        this.f4115I.add(this.f4140x);
        this.f4115I.add(this.f4142z);
        this.f4115I.add(this.f4108B);
        ArrayList arrayList2 = new ArrayList();
        this.f4116J = arrayList2;
        arrayList2.add(this.f4127k);
        this.f4116J.add(this.f4129m);
        this.f4116J.add(this.f4131o);
        this.f4116J.add(this.f4133q);
        this.f4116J.add(this.f4135s);
        this.f4116J.add(this.f4137u);
        this.f4116J.add(this.f4139w);
        this.f4116J.add(this.f4141y);
        this.f4116J.add(this.f4107A);
        this.f4116J.add(this.f4109C);
        xdl0.E0(this.f4118b, new ViewOnClickListenerC0308a());
        xdl0.E0(this.f4122f, new ViewOnClickListenerC0309b());
        xdl0.E0(this.f4110D, new ViewOnClickListenerC0310c());
        xdl0.E0(this.f4119c, new ViewOnClickListenerC0311d());
        xdl0.E0(this.f4123g, new ViewOnClickListenerC0312e());
    }

    public void setAfterChangeStateListener(e30<String> e30Var) {
        this.f4111E = e30Var;
    }

    public void setDelGreetingListener(e30<Integer> e30Var) {
        this.f4112F = e30Var;
    }

    public ChooseGreetingsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChooseGreetingsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
