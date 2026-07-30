package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.p058ui.messages.newpic.PicExchangeEditAct;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VPager;
import p151v.VPagerCircleIndicator;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class r600 extends bdz {

    /* JADX INFO: renamed from: i */
    public static String f161421i = "";

    /* JADX INFO: renamed from: j */
    public static String f161422j = "";

    /* JADX INFO: renamed from: c */
    public String f161423c;

    /* JADX INFO: renamed from: d */
    public VImage f161424d;

    /* JADX INFO: renamed from: e */
    public VPager f161425e;

    /* JADX INFO: renamed from: f */
    public VPagerCircleIndicator f161426f;

    /* JADX INFO: renamed from: g */
    public C19778c f161427g;

    /* JADX INFO: renamed from: h */
    public Runnable f161428h;

    /* JADX INFO: renamed from: l.r600$a */
    public class RunnableC19776a implements Runnable {
        public RunnableC19776a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NullChecker.m82486a(r600.this.f161425e) && NullChecker.m82486a(r600.this.f161427g) && r600.this.f161427g.getCount() > 0) {
                VPager vPager = r600.this.f161425e;
                vPager.setCurrentItem(vPager.getCurrentItem() >= r600.this.f161427g.getCount() + (-1) ? 0 : r600.this.f161425e.getCurrentItem() + 1);
                r600.this.m179979s();
            }
        }
    }

    /* JADX INFO: renamed from: l.r600$b */
    public class C19777b {

        /* JADX INFO: renamed from: a */
        public String f161430a;

        /* JADX INFO: renamed from: b */
        public String f161431b;

        /* JADX INFO: renamed from: c */
        @DrawableRes
        public int f161432c;

        public C19777b(String str, @DrawableRes String str2, int i) {
            this.f161430a = str;
            this.f161431b = str2;
            this.f161432c = i;
        }
    }

    /* JADX INFO: renamed from: l.r600$c */
    public class C19778c extends cf60 {

        /* JADX INFO: renamed from: a */
        public List<C19777b> f161434a;

        /* JADX INFO: renamed from: b */
        public Context f161435b;

        public C19778c(Context context, List<C19777b> list) {
            this.f161435b = context;
            this.f161434a = list;
        }

        @Override // p153l.cf60
        public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            super.destroyItem(viewGroup, i, obj);
        }

        @Override // p153l.cf60
        public int getCount() {
            if (jyb.m147479J(this.f161434a)) {
                return 0;
            }
            return this.f161434a.size();
        }

        @Override // p153l.cf60
        @NonNull
        public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
            View viewInflate = p9r.m171370a(viewGroup.getContext()).inflate(qec0.f157132u4, viewGroup, false);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(edc0.f93422o1);
            VText vText = (VText) viewInflate.findViewById(edc0.f93267Q4);
            VText vText2 = (VText) viewInflate.findViewById(edc0.f93425o4);
            C19777b c19777b = this.f161434a.get(i);
            int i2 = c19777b.f161432c;
            if (i2 != -1) {
                vDraweeView.setImageResource(i2);
            }
            if (!TextUtils.isEmpty(c19777b.f161430a)) {
                vText.setTypeface(lyh0.m156283c(3), 1);
                vText.setText(c19777b.f161430a);
            }
            if (!TextUtils.isEmpty(c19777b.f161431b)) {
                vText2.setText(c19777b.f161431b);
            }
            viewGroup.addView(viewInflate);
            return viewInflate;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }
    }

    public r600(@NonNull Act act, String str) {
        super(act);
        this.f161423c = "";
        this.f161428h = new RunnableC19776a();
        this.f161423c = str;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m179970l(Act act, String str, String str2) {
        act.startActivityForResult(PicExchangeEditAct.m50704a2(act, str, str2), PutongAct.REQUEST_CODE_PICKER);
        act.overridePendingTransition(y7c0.f197767e, y7c0.f197763a);
    }

    /* JADX INFO: renamed from: t */
    public static void m179973t(PutongAct putongAct, String str, String str2, String str3) {
        f161422j = str2;
        f161421i = str3;
        Conversation conversationM34219zp = CoreModule.f18264c.f20384f0.m34219zp(str);
        if (conversationM34219zp == null || TEnum.equals(conversationM34219zp.status, "dismissed")) {
            r1j0.m179420g("已解除配对，无法查看");
        } else {
            if (CoreModule.f18264c.f20384f0.f20725v1.get().booleanValue()) {
                m179974u(putongAct, str, str3);
                return;
            }
            r600 r600Var = new r600(putongAct, str);
            CoreModule.f18264c.f20384f0.f20725v1.put(Boolean.TRUE);
            r600Var.show();
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m179974u(final Act act, final String str, final String str2) {
        azy.m101133V(act, new x20() { // from class: l.n600
            @Override // p153l.x20
            public final void call() {
                r600.m179970l(act, str, str2);
            }
        });
    }

    @Override // p153l.bdz
    /* JADX INFO: renamed from: c */
    public int mo103667c() {
        return 80;
    }

    @Override // p153l.bdz
    /* JADX INFO: renamed from: f */
    public void mo103670f() {
        findViewById(edc0.f93311Y0).setOnClickListener(new View.OnClickListener() { // from class: l.o600
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145129a.m179976p(view);
            }
        });
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.height = -2;
        attributes.gravity = 80;
        getWindow().setAttributes(attributes);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        VImage vImage = (VImage) findViewById(edc0.f93250O);
        this.f161424d = vImage;
        bnl0.m105509E0(vImage, new View.OnClickListener() { // from class: l.p600
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150718a.m179977q(view);
            }
        });
        this.f161425e = (VPager) findViewById(edc0.f93438q3);
        this.f161426f = (VPagerCircleIndicator) findViewById(edc0.f93431p3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C19777b("以图换图", "发出或收到该模式下的图片,另一方必须也回复一张图片才能进行查看", ibc0.f114143t4));
        arrayList.add(new C19777b("限时快拍", "快拍必须在限时内查看,超时将无法查看高清大图;已查看的快拍,可随时回看", ibc0.f114043i3));
        C19778c c19778c = new C19778c(getContext(), arrayList);
        this.f161427g = c19778c;
        this.f161425e.setAdapter(c19778c);
        this.f161426f.setViewPager(this.f161425e);
        this.f161425e.setOnTouchListener(new View.OnTouchListener() { // from class: l.q600
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f155777a.m179978r(view, motionEvent);
            }
        });
        m179979s();
    }

    @Override // p153l.bdz
    /* JADX INFO: renamed from: h */
    public int mo103672h() {
        return qec0.f157125t4;
    }

    /* JADX INFO: renamed from: o */
    public String m179975o() {
        return "p_newphoto_info";
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m179979s();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m179980v();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m179976p(View view) {
        dismiss();
        VPager vPager = this.f161425e;
        i4g0.m138523u("e_newphoto_known", m179975o(), jyb.m147494Y("new_photo_type", (vPager == null || vPager.getCurrentItem() != 1) ? "switch" : "time"));
        m179974u(this.f76320a, this.f161423c, f161421i);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m179977q(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ boolean m179978r(View view, MotionEvent motionEvent) {
        m179980v();
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final void m179979s() {
        if (NullChecker.m82486a(this.f161425e) && NullChecker.m82486a(this.f161427g) && this.f161427g.getCount() > 0 && NullChecker.m82486a(this.f161428h)) {
            l51.m152890J(this.f161428h);
            l51.m152888H(getContext(), this.f161428h, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        }
    }

    @Override // p153l.bdz, android.app.Dialog
    public void show() {
        l4g0 l4g0VarM204399c = w1e.m204399c(m179975o(), r600.class.getName());
        this.f76321b = l4g0VarM204399c;
        l4g0VarM204399c.m152781p(jyb.m147494Y("receiver_user_id", this.f161423c));
        super.show();
    }

    /* JADX INFO: renamed from: v */
    public final void m179980v() {
        l51.m152890J(this.f161428h);
    }
}
