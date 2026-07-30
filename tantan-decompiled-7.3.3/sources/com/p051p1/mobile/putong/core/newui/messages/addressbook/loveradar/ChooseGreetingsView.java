package com.p051p1.mobile.putong.core.newui.messages.addressbook.loveradar;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.FateRadar;
import com.p051p1.mobile.putong.core.data.FateRadarGreeting;
import com.p051p1.mobile.putong.core.data.GreetingItem;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VListCell;
import p153l.bnl0;
import p153l.i45;
import p153l.jyb;
import p153l.lyh0;
import p153l.qcj;
import p153l.th0;
import p153l.w30;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ChooseGreetingsView extends LinearLayout {

    /* JADX INFO: renamed from: A */
    public VText_Bold f26071A;

    /* JADX INFO: renamed from: B */
    public VFrame f26072B;

    /* JADX INFO: renamed from: C */
    public VText_Bold f26073C;

    /* JADX INFO: renamed from: D */
    public VFrame f26074D;

    /* JADX INFO: renamed from: E */
    public y20<String> f26075E;

    /* JADX INFO: renamed from: F */
    public y20<Integer> f26076F;

    /* JADX INFO: renamed from: G */
    public w30 f26077G;

    /* JADX INFO: renamed from: H */
    public FateRadar f26078H;

    /* JADX INFO: renamed from: I */
    public List<View> f26079I;

    /* JADX INFO: renamed from: J */
    public List<VText_Bold> f26080J;

    /* JADX INFO: renamed from: a */
    public VLinear f26081a;

    /* JADX INFO: renamed from: b */
    public VImage f26082b;

    /* JADX INFO: renamed from: c */
    public VFrame f26083c;

    /* JADX INFO: renamed from: d */
    public VImage f26084d;

    /* JADX INFO: renamed from: e */
    public VLinear f26085e;

    /* JADX INFO: renamed from: f */
    public VImage f26086f;

    /* JADX INFO: renamed from: g */
    public VFrame f26087g;

    /* JADX INFO: renamed from: h */
    public VImage f26088h;

    /* JADX INFO: renamed from: i */
    public VLinear f26089i;

    /* JADX INFO: renamed from: j */
    public VFrame f26090j;

    /* JADX INFO: renamed from: k */
    public VText_Bold f26091k;

    /* JADX INFO: renamed from: l */
    public VFrame f26092l;

    /* JADX INFO: renamed from: m */
    public VText_Bold f26093m;

    /* JADX INFO: renamed from: n */
    public VFrame f26094n;

    /* JADX INFO: renamed from: o */
    public VText_Bold f26095o;

    /* JADX INFO: renamed from: p */
    public VFrame f26096p;

    /* JADX INFO: renamed from: q */
    public VText_Bold f26097q;

    /* JADX INFO: renamed from: r */
    public VFrame f26098r;

    /* JADX INFO: renamed from: s */
    public VText_Bold f26099s;

    /* JADX INFO: renamed from: t */
    public VFrame f26100t;

    /* JADX INFO: renamed from: u */
    public VText_Bold f26101u;

    /* JADX INFO: renamed from: v */
    public VFrame f26102v;

    /* JADX INFO: renamed from: w */
    public VText_Bold f26103w;

    /* JADX INFO: renamed from: x */
    public VFrame f26104x;

    /* JADX INFO: renamed from: y */
    public VText_Bold f26105y;

    /* JADX INFO: renamed from: z */
    public VFrame f26106z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$a */
    public class ViewOnClickListenerC8295a implements View.OnClickListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$a$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public ViewOnClickListenerC8295a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new th0.C20312a(ChooseGreetingsView.this.getContext()).m191160s("系统招呼语").m191148g(false).m191151j("配对成功后系统将为您给对方发送日常招呼语").m191159r("我知道了").m191156o(new a()).m191142a().m191141g();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$b */
    public class ViewOnClickListenerC8296b implements View.OnClickListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$b$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public ViewOnClickListenerC8296b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new th0.C20312a(ChooseGreetingsView.this.getContext()).m191160s("自定义招呼语").m191148g(false).m191151j("配对成功后将为您随机发送您自定义的招呼语").m191159r("我知道了").m191156o(new a()).m191142a().m191141g();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$c */
    public class ViewOnClickListenerC8297c implements View.OnClickListener {
        public ViewOnClickListenerC8297c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChooseGreetingsView.this.getContext().startActivity(LoveRadarCustomGreetAct.m42915a2(ChooseGreetingsView.this.getContext(), null));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$d */
    public class ViewOnClickListenerC8298d implements View.OnClickListener {
        public ViewOnClickListenerC8298d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChooseGreetingsView.this.m42906j();
            if (ChooseGreetingsView.this.f26075E != null) {
                ChooseGreetingsView.this.f26075E.call("system");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$e */
    public class ViewOnClickListenerC8299e implements View.OnClickListener {
        public ViewOnClickListenerC8299e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChooseGreetingsView.this.m42905i();
            if (ChooseGreetingsView.this.f26075E != null) {
                ChooseGreetingsView.this.f26075E.call("custom");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$f */
    public class ViewOnClickListenerC8300f implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f26114a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f26115b;

        public ViewOnClickListenerC8300f(List list, int i) {
            this.f26114a = list;
            this.f26115b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChooseGreetingsView.this.m42903g(this.f26114a, this.f26115b);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$g */
    public class C8301g implements w30.InterfaceC21003d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f26117a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f26118b;

        public C8301g(List list, int i) {
            this.f26117a = list;
            this.f26118b = i;
        }

        @Override // p153l.w30.InterfaceC21003d
        /* JADX INFO: renamed from: a */
        public void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
            ChooseGreetingsView.this.f26077G.m204614b();
            if (i == 0) {
                ChooseGreetingsView.this.getContext().startActivity(LoveRadarCustomGreetAct.m42915a2(ChooseGreetingsView.this.getContext(), (GreetingItem) this.f26117a.get(this.f26118b)));
            } else {
                if (i != 1 || ChooseGreetingsView.this.f26076F == null) {
                    return;
                }
                ChooseGreetingsView.this.f26076F.call(Integer.valueOf(((GreetingItem) this.f26117a.get(this.f26118b)).f21145id));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$h */
    public class ViewOnClickListenerC8302h implements View.OnClickListener {
        public ViewOnClickListenerC8302h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ChooseGreetingsView.this.f26077G.m204614b();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView$i */
    public class C8303i implements qcj<GreetingItem, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f26121a;

        public C8303i(int i) {
            this.f26121a = i;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(GreetingItem greetingItem) {
            return Boolean.valueOf(greetingItem.f21145id != this.f26121a);
        }
    }

    public ChooseGreetingsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m42901e(View view) {
        i45.m138394a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m42902f(FateRadar fateRadar) {
        this.f26078H = fateRadar;
        if (fateRadar == null) {
            return;
        }
        List<GreetingItem> list = fateRadar.greetings.items;
        if (jyb.m147479J(list)) {
            Iterator<View> it = this.f26079I.iterator();
            while (it.hasNext()) {
                bnl0.m105524M(it.next(), false);
            }
            return;
        }
        int size = list.size();
        VFrame vFrame = this.f26074D;
        if (size == 10) {
            bnl0.m105524M(vFrame, false);
        } else {
            bnl0.m105524M(vFrame, true);
        }
        for (int i = 0; i < this.f26079I.size(); i++) {
            int size2 = list.size();
            List<View> list2 = this.f26079I;
            if (i < size2) {
                bnl0.m105524M(list2.get(i), true);
                this.f26080J.get(i).setText(list.get(i).value);
            } else {
                bnl0.m105524M(list2.get(i), false);
            }
            bnl0.m105509E0(this.f26079I.get(i), new ViewOnClickListenerC8300f(list, i));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m42903g(List<GreetingItem> list, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("编辑");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "删除");
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FF6464")), 0, 2, 17);
        arrayList.add(spannableStringBuilder);
        w30 w30VarM204654F = new w30.C21001b(getContext()).m204657I("取消").m204669U(new ViewOnClickListenerC8302h()).m204664P(lyh0.m156283c(3)).m204665Q(arrayList).m204670V(new C8301g(list, i)).m204654F();
        this.f26077G = w30VarM204654F;
        w30VarM204654F.m204618f();
    }

    /* JADX INFO: renamed from: h */
    public void m42904h(int i) {
        FateRadar fateRadar = this.f26078H;
        if (fateRadar != null) {
            FateRadarGreeting fateRadarGreeting = fateRadar.greetings;
            fateRadarGreeting.items = jyb.m147522n(fateRadarGreeting.items, new C8303i(i));
            m42902f(this.f26078H);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m42905i() {
        bnl0.m105524M(this.f26084d, false);
        bnl0.m105524M(this.f26088h, true);
        bnl0.m105524M(this.f26089i, true);
    }

    /* JADX INFO: renamed from: j */
    public void m42906j() {
        bnl0.m105524M(this.f26084d, true);
        bnl0.m105524M(this.f26088h, false);
        bnl0.m105524M(this.f26089i, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42901e(this);
        ArrayList arrayList = new ArrayList();
        this.f26079I = arrayList;
        arrayList.add(this.f26090j);
        this.f26079I.add(this.f26092l);
        this.f26079I.add(this.f26094n);
        this.f26079I.add(this.f26096p);
        this.f26079I.add(this.f26098r);
        this.f26079I.add(this.f26100t);
        this.f26079I.add(this.f26102v);
        this.f26079I.add(this.f26104x);
        this.f26079I.add(this.f26106z);
        this.f26079I.add(this.f26072B);
        ArrayList arrayList2 = new ArrayList();
        this.f26080J = arrayList2;
        arrayList2.add(this.f26091k);
        this.f26080J.add(this.f26093m);
        this.f26080J.add(this.f26095o);
        this.f26080J.add(this.f26097q);
        this.f26080J.add(this.f26099s);
        this.f26080J.add(this.f26101u);
        this.f26080J.add(this.f26103w);
        this.f26080J.add(this.f26105y);
        this.f26080J.add(this.f26071A);
        this.f26080J.add(this.f26073C);
        bnl0.m105509E0(this.f26082b, new ViewOnClickListenerC8295a());
        bnl0.m105509E0(this.f26086f, new ViewOnClickListenerC8296b());
        bnl0.m105509E0(this.f26074D, new ViewOnClickListenerC8297c());
        bnl0.m105509E0(this.f26083c, new ViewOnClickListenerC8298d());
        bnl0.m105509E0(this.f26087g, new ViewOnClickListenerC8299e());
    }

    public void setAfterChangeStateListener(y20<String> y20Var) {
        this.f26075E = y20Var;
    }

    public void setDelGreetingListener(y20<Integer> y20Var) {
        this.f26076F = y20Var;
    }

    public ChooseGreetingsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChooseGreetingsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
