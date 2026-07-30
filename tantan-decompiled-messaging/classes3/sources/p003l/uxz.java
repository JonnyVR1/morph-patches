package p003l;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.messages.newpic.PicExchangeEditAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.c3c0;
import l.cwf0;
import l.e51;
import l.i0e;
import l.j760;
import l.l6c0;
import l.o7r;
import l.osi0;
import l.szb0;
import l.vwb;
import l.w660;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VPager;
import p028v.VPagerCircleIndicator;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class uxz extends e4z {

    /* JADX INFO: renamed from: i */
    public static String f8123i = "";

    /* JADX INFO: renamed from: j */
    public static String f8124j = "";

    /* JADX INFO: renamed from: c */
    public String f8125c;

    /* JADX INFO: renamed from: d */
    public VImage f8126d;

    /* JADX INFO: renamed from: e */
    public VPager f8127e;

    /* JADX INFO: renamed from: f */
    public VPagerCircleIndicator f8128f;

    /* JADX INFO: renamed from: g */
    public C0589c f8129g;

    /* JADX INFO: renamed from: h */
    public Runnable f8130h;

    /* JADX INFO: renamed from: l.uxz$a */
    public class RunnableC0587a implements Runnable {
        public RunnableC0587a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NullChecker.a(uxz.this.f8127e) && NullChecker.a(uxz.this.f8129g) && uxz.this.f8129g.getCount() > 0) {
                VPager vPager = uxz.this.f8127e;
                vPager.setCurrentItem(vPager.getCurrentItem() >= uxz.this.f8129g.getCount() + (-1) ? 0 : uxz.this.f8127e.getCurrentItem() + 1);
                uxz.this.m8266s();
            }
        }
    }

    /* JADX INFO: renamed from: l.uxz$b */
    public class C0588b {

        /* JADX INFO: renamed from: a */
        public String f8132a;

        /* JADX INFO: renamed from: b */
        public String f8133b;

        /* JADX INFO: renamed from: c */
        @DrawableRes
        public int f8134c;

        public C0588b(String str, @DrawableRes String str2, int i) {
            this.f8132a = str;
            this.f8133b = str2;
            this.f8134c = i;
        }
    }

    /* JADX INFO: renamed from: l.uxz$c */
    public class C0589c extends w660 {

        /* JADX INFO: renamed from: a */
        public List<C0588b> f8136a;

        /* JADX INFO: renamed from: b */
        public Context f8137b;

        public C0589c(Context context, List<C0588b> list) {
            this.f8137b = context;
            this.f8136a = list;
        }

        public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            super.destroyItem(viewGroup, i, obj);
        }

        public int getCount() {
            if (vwb.J(this.f8136a)) {
                return 0;
            }
            return this.f8136a.size();
        }

        @NonNull
        public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
            View viewInflate = o7r.a(viewGroup.getContext()).inflate(l6c0.u4, viewGroup, false);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(y4c0.o1);
            AppCompatTextView appCompatTextView = (VText) viewInflate.findViewById(y4c0.Q4);
            AppCompatTextView appCompatTextView2 = (VText) viewInflate.findViewById(y4c0.o4);
            C0588b c0588b = this.f8136a.get(i);
            int i2 = c0588b.f8134c;
            if (i2 != -1) {
                vDraweeView.setImageResource(i2);
            }
            if (!TextUtils.isEmpty(c0588b.f8132a)) {
                appCompatTextView.setTypeface(eqh0.m3924c(3), 1);
                appCompatTextView.setText(c0588b.f8132a);
            }
            if (!TextUtils.isEmpty(c0588b.f8133b)) {
                appCompatTextView2.setText(c0588b.f8133b);
            }
            viewGroup.addView(viewInflate);
            return viewInflate;
        }

        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }
    }

    public uxz(@NonNull Act act, String str) {
        super(act);
        this.f8125c = "";
        this.f8130h = new RunnableC0587a();
        this.f8125c = str;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m8257l(Act act, String str, String str2) {
        act.startActivityForResult(PicExchangeEditAct.m2668Z1(act, str, str2), 786);
        act.overridePendingTransition(szb0.e, szb0.a);
    }

    /* JADX INFO: renamed from: t */
    public static void m8260t(PutongAct putongAct, String str, String str2, String str3) {
        f8124j = str2;
        f8123i = str3;
        Conversation conversationZp = CoreModule.c.f0.zp(str);
        if (conversationZp == null || TEnum.equals(conversationZp.status, "dismissed")) {
            osi0.g("已解除配对，无法查看");
        } else {
            if (((Boolean) CoreModule.c.f0.v1.get()).booleanValue()) {
                m8261u(putongAct, str, str3);
                return;
            }
            uxz uxzVar = new uxz(putongAct, str);
            CoreModule.c.f0.v1.put(Boolean.TRUE);
            uxzVar.show();
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m8261u(final Act act, final String str, final String str2) {
        dqy.m3637V(act, new d30() { // from class: l.qxz
            @Override // p003l.d30
            public final void call() {
                uxz.m8257l(act, str, str2);
            }
        });
    }

    @Override // p003l.e4z
    /* JADX INFO: renamed from: c */
    public int mo3790c() {
        return 80;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View, v.VImage] */
    @Override // p003l.e4z
    /* JADX INFO: renamed from: f */
    public void mo3793f() {
        findViewById(y4c0.Y0).setOnClickListener(new View.OnClickListener() { // from class: l.rxz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7114a.m8263p(view);
            }
        });
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.height = -2;
        attributes.gravity = 80;
        getWindow().setAttributes(attributes);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        ?? r0 = (VImage) findViewById(y4c0.O);
        this.f8126d = r0;
        xdl0.E0((View) r0, new View.OnClickListener() { // from class: l.sxz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7368a.m8264q(view);
            }
        });
        this.f8127e = (VPager) findViewById(y4c0.q3);
        this.f8128f = (VPagerCircleIndicator) findViewById(y4c0.p3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0588b("以图换图", "发出或收到该模式下的图片,另一方必须也回复一张图片才能进行查看", c3c0.t4));
        arrayList.add(new C0588b("限时快拍", "快拍必须在限时内查看,超时将无法查看高清大图;已查看的快拍,可随时回看", c3c0.i3));
        C0589c c0589c = new C0589c(getContext(), arrayList);
        this.f8129g = c0589c;
        this.f8127e.setAdapter(c0589c);
        this.f8128f.setViewPager(this.f8127e);
        this.f8127e.setOnTouchListener(new View.OnTouchListener() { // from class: l.txz
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f7823a.m8265r(view, motionEvent);
            }
        });
        m8266s();
    }

    @Override // p003l.e4z
    /* JADX INFO: renamed from: h */
    public int mo3795h() {
        return l6c0.t4;
    }

    /* JADX INFO: renamed from: o */
    public String m8262o() {
        return "p_newphoto_info";
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m8266s();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m8267v();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m8263p(View view) {
        dismiss();
        VPager vPager = this.f8127e;
        zvf0.u("e_newphoto_known", m8262o(), new j760[]{vwb.Y("new_photo_type", (vPager == null || vPager.getCurrentItem() != 1) ? "switch" : "time")});
        m8261u(this.f3203a, this.f8125c, f8123i);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m8264q(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ boolean m8265r(View view, MotionEvent motionEvent) {
        m8267v();
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final void m8266s() {
        if (NullChecker.a(this.f8127e) && NullChecker.a(this.f8129g) && this.f8129g.getCount() > 0 && NullChecker.a(this.f8130h)) {
            e51.J(this.f8130h);
            e51.H(getContext(), this.f8130h, 5000L);
        }
    }

    @Override // p003l.e4z, android.app.Dialog
    public void show() {
        cwf0 cwf0VarC = i0e.c(m8262o(), uxz.class.getName());
        this.f3204b = cwf0VarC;
        cwf0VarC.p(new j760[]{vwb.Y("receiver_user_id", this.f8125c)});
        super.show();
    }

    /* JADX INFO: renamed from: v */
    public final void m8267v() {
        e51.J(this.f8130h);
    }
}
