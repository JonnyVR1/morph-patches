package com.p046p1.mobile.putong.core.newui.messages.addressbook.loveradar;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.FateRadar;
import com.p046p1.mobile.putong.core.data.FateRadarGreeting;
import com.p046p1.mobile.putong.core.data.GreetingItem;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VListCell;
import p149l.c40;
import p149l.e30;
import p149l.eqh0;
import p149l.h35;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.xh0;

/* JADX INFO: loaded from: classes11.dex */
public class ChooseGreetingsView extends LinearLayout {

    /* JADX INFO: renamed from: A */
    public VText_Bold f25329A;

    /* JADX INFO: renamed from: B */
    public VFrame f25330B;

    /* JADX INFO: renamed from: C */
    public VText_Bold f25331C;

    /* JADX INFO: renamed from: D */
    public VFrame f25332D;

    /* JADX INFO: renamed from: E */
    public e30<String> f25333E;

    /* JADX INFO: renamed from: F */
    public e30<Integer> f25334F;

    /* JADX INFO: renamed from: G */
    public c40 f25335G;

    /* JADX INFO: renamed from: H */
    public FateRadar f25336H;

    /* JADX INFO: renamed from: I */
    public List<View> f25337I;

    /* JADX INFO: renamed from: J */
    public List<VText_Bold> f25338J;

    /* JADX INFO: renamed from: a */
    public VLinear f25339a;

    /* JADX INFO: renamed from: b */
    public VImage f25340b;

    /* JADX INFO: renamed from: c */
    public VFrame f25341c;

    /* JADX INFO: renamed from: d */
    public VImage f25342d;

    /* JADX INFO: renamed from: e */
    public VLinear f25343e;

    /* JADX INFO: renamed from: f */
    public VImage f25344f;

    /* JADX INFO: renamed from: g */
    public VFrame f25345g;

    /* JADX INFO: renamed from: h */
    public VImage f25346h;

    /* JADX INFO: renamed from: i */
    public VLinear f25347i;

    /* JADX INFO: renamed from: j */
    public VFrame f25348j;

    /* JADX INFO: renamed from: k */
    public VText_Bold f25349k;

    /* JADX INFO: renamed from: l */
    public VFrame f25350l;

    /* JADX INFO: renamed from: m */
    public VText_Bold f25351m;

    /* JADX INFO: renamed from: n */
    public VFrame f25352n;

    /* JADX INFO: renamed from: o */
    public VText_Bold f25353o;

    /* JADX INFO: renamed from: p */
    public VFrame f25354p;

    /* JADX INFO: renamed from: q */
    public VText_Bold f25355q;

    /* JADX INFO: renamed from: r */
    public VFrame f25356r;

    /* JADX INFO: renamed from: s */
    public VText_Bold f25357s;

    /* JADX INFO: renamed from: t */
    public VFrame f25358t;

    /* JADX INFO: renamed from: u */
    public VText_Bold f25359u;

    /* JADX INFO: renamed from: v */
    public VFrame f25360v;

    /* JADX INFO: renamed from: w */
    public VText_Bold f25361w;

    /* JADX INFO: renamed from: x */
    public VFrame f25362x;

    /* JADX INFO: renamed from: y */
    public VText_Bold f25363y;

    /* JADX INFO: renamed from: z */
    public VFrame f25364z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$a */
    public class ViewOnClickListenerC8144a implements View.OnClickListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$a$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public ViewOnClickListenerC8144a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new xh0.C21150a(ChooseGreetingsView.this.getContext()).m208740s("系统招呼语").m208728g(false).m208731j("配对成功后系统将为您给对方发送日常招呼语").m208739r("我知道了").m208736o(new a()).m208722a().m208721g();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$b */
    public class ViewOnClickListenerC8145b implements View.OnClickListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$b$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public ViewOnClickListenerC8145b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new xh0.C21150a(ChooseGreetingsView.this.getContext()).m208740s("自定义招呼语").m208728g(false).m208731j("配对成功后将为您随机发送您自定义的招呼语").m208739r("我知道了").m208736o(new a()).m208722a().m208721g();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$c */
    public class ViewOnClickListenerC8146c implements View.OnClickListener {
        public ViewOnClickListenerC8146c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChooseGreetingsView.this.getContext().startActivity(LoveRadarCustomGreetAct.m41904Z1(ChooseGreetingsView.this.getContext(), null));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$d */
    public class ViewOnClickListenerC8147d implements View.OnClickListener {
        public ViewOnClickListenerC8147d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChooseGreetingsView.this.m41895j();
            if (ChooseGreetingsView.this.f25333E != null) {
                ChooseGreetingsView.this.f25333E.call("system");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$e */
    public class ViewOnClickListenerC8148e implements View.OnClickListener {
        public ViewOnClickListenerC8148e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChooseGreetingsView.this.m41894i();
            if (ChooseGreetingsView.this.f25333E != null) {
                ChooseGreetingsView.this.f25333E.call("custom");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$f */
    public class ViewOnClickListenerC8149f implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f25372a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f25373b;

        public ViewOnClickListenerC8149f(List list, int i) {
            this.f25372a = list;
            this.f25373b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChooseGreetingsView.this.m41892g(this.f25372a, this.f25373b);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$g */
    public class C8150g implements c40.InterfaceC16059d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f25375a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f25376b;

        public C8150g(List list, int i) {
            this.f25375a = list;
            this.f25376b = i;
        }

        @Override // p149l.c40.InterfaceC16059d
        /* JADX INFO: renamed from: a */
        public void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
            ChooseGreetingsView.this.f25335G.m105113b();
            if (i == 0) {
                ChooseGreetingsView.this.getContext().startActivity(LoveRadarCustomGreetAct.m41904Z1(ChooseGreetingsView.this.getContext(), (GreetingItem) this.f25375a.get(this.f25376b)));
            } else {
                if (i != 1 || ChooseGreetingsView.this.f25334F == null) {
                    return;
                }
                ChooseGreetingsView.this.f25334F.call(Integer.valueOf(((GreetingItem) this.f25375a.get(this.f25376b)).f20403id));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$h */
    public class ViewOnClickListenerC8151h implements View.OnClickListener {
        public ViewOnClickListenerC8151h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChooseGreetingsView.this.f25335G.m105113b();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$i */
    public class C8152i implements w9j<GreetingItem, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f25379a;

        public C8152i(int i) {
            this.f25379a = i;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(GreetingItem greetingItem) {
            return Boolean.valueOf(greetingItem.f20403id != this.f25379a);
        }
    }

    public ChooseGreetingsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m41890e(View view) {
        h35.m129161a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m41891f(FateRadar fateRadar) {
        this.f25336H = fateRadar;
        if (fateRadar == null) {
            return;
        }
        List<GreetingItem> list = fateRadar.greetings.items;
        if (vwb.m200296J(list)) {
            Iterator<View> it = this.f25337I.iterator();
            while (it.hasNext()) {
                xdl0.m208344M(it.next(), false);
            }
            return;
        }
        int size = list.size();
        VFrame vFrame = this.f25332D;
        if (size == 10) {
            xdl0.m208344M(vFrame, false);
        } else {
            xdl0.m208344M(vFrame, true);
        }
        for (int i = 0; i < this.f25337I.size(); i++) {
            int size2 = list.size();
            List<View> list2 = this.f25337I;
            if (i < size2) {
                xdl0.m208344M(list2.get(i), true);
                this.f25338J.get(i).setText(list.get(i).value);
            } else {
                xdl0.m208344M(list2.get(i), false);
            }
            xdl0.m208329E0(this.f25337I.get(i), new ViewOnClickListenerC8149f(list, i));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m41892g(List<GreetingItem> list, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("编辑");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "删除");
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FF6464")), 0, 2, 17);
        arrayList.add(spannableStringBuilder);
        c40 c40VarM105153F = new c40.C16057b(getContext()).m105156I("取消").m105168U(new ViewOnClickListenerC8151h()).m105163P(eqh0.m117752c(3)).m105164Q(arrayList).m105169V(new C8150g(list, i)).m105153F();
        this.f25335G = c40VarM105153F;
        c40VarM105153F.m105117f();
    }

    /* JADX INFO: renamed from: h */
    public void m41893h(int i) {
        FateRadar fateRadar = this.f25336H;
        if (fateRadar != null) {
            FateRadarGreeting fateRadarGreeting = fateRadar.greetings;
            fateRadarGreeting.items = vwb.m200339n(fateRadarGreeting.items, new C8152i(i));
            m41891f(this.f25336H);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m41894i() {
        xdl0.m208344M(this.f25342d, false);
        xdl0.m208344M(this.f25346h, true);
        xdl0.m208344M(this.f25347i, true);
    }

    /* JADX INFO: renamed from: j */
    public void m41895j() {
        xdl0.m208344M(this.f25342d, true);
        xdl0.m208344M(this.f25346h, false);
        xdl0.m208344M(this.f25347i, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41890e(this);
        ArrayList arrayList = new ArrayList();
        this.f25337I = arrayList;
        arrayList.add(this.f25348j);
        this.f25337I.add(this.f25350l);
        this.f25337I.add(this.f25352n);
        this.f25337I.add(this.f25354p);
        this.f25337I.add(this.f25356r);
        this.f25337I.add(this.f25358t);
        this.f25337I.add(this.f25360v);
        this.f25337I.add(this.f25362x);
        this.f25337I.add(this.f25364z);
        this.f25337I.add(this.f25330B);
        ArrayList arrayList2 = new ArrayList();
        this.f25338J = arrayList2;
        arrayList2.add(this.f25349k);
        this.f25338J.add(this.f25351m);
        this.f25338J.add(this.f25353o);
        this.f25338J.add(this.f25355q);
        this.f25338J.add(this.f25357s);
        this.f25338J.add(this.f25359u);
        this.f25338J.add(this.f25361w);
        this.f25338J.add(this.f25363y);
        this.f25338J.add(this.f25329A);
        this.f25338J.add(this.f25331C);
        xdl0.m208329E0(this.f25340b, new ViewOnClickListenerC8144a());
        xdl0.m208329E0(this.f25344f, new ViewOnClickListenerC8145b());
        xdl0.m208329E0(this.f25332D, new ViewOnClickListenerC8146c());
        xdl0.m208329E0(this.f25341c, new ViewOnClickListenerC8147d());
        xdl0.m208329E0(this.f25345g, new ViewOnClickListenerC8148e());
    }

    public void setAfterChangeStateListener(e30<String> e30Var) {
        this.f25333E = e30Var;
    }

    public void setDelGreetingListener(e30<Integer> e30Var) {
        this.f25334F = e30Var;
    }

    public ChooseGreetingsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChooseGreetingsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
