package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.p053ui.messages.newpic.PicExchangeEditAct;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VPager;
import p147v.VPagerCircleIndicator;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class uxz extends e4z {

    /* JADX INFO: renamed from: i */
    public static String f178790i = "";

    /* JADX INFO: renamed from: j */
    public static String f178791j = "";

    /* JADX INFO: renamed from: c */
    public String f178792c;

    /* JADX INFO: renamed from: d */
    public VImage f178793d;

    /* JADX INFO: renamed from: e */
    public VPager f178794e;

    /* JADX INFO: renamed from: f */
    public VPagerCircleIndicator f178795f;

    /* JADX INFO: renamed from: g */
    public C20536c f178796g;

    /* JADX INFO: renamed from: h */
    public Runnable f178797h;

    /* JADX INFO: renamed from: l.uxz$a */
    public class RunnableC20534a implements Runnable {
        public RunnableC20534a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NullChecker.m81303a(uxz.this.f178794e) && NullChecker.m81303a(uxz.this.f178796g) && uxz.this.f178796g.getCount() > 0) {
                VPager vPager = uxz.this.f178794e;
                vPager.setCurrentItem(vPager.getCurrentItem() >= uxz.this.f178796g.getCount() + (-1) ? 0 : uxz.this.f178794e.getCurrentItem() + 1);
                uxz.this.m196236s();
            }
        }
    }

    /* JADX INFO: renamed from: l.uxz$b */
    public class C20535b {

        /* JADX INFO: renamed from: a */
        public String f178799a;

        /* JADX INFO: renamed from: b */
        public String f178800b;

        /* JADX INFO: renamed from: c */
        @DrawableRes
        public int f178801c;

        public C20535b(String str, @DrawableRes String str2, int i) {
            this.f178799a = str;
            this.f178800b = str2;
            this.f178801c = i;
        }
    }

    /* JADX INFO: renamed from: l.uxz$c */
    public class C20536c extends w660 {

        /* JADX INFO: renamed from: a */
        public List<C20535b> f178803a;

        /* JADX INFO: renamed from: b */
        public Context f178804b;

        public C20536c(Context context, List<C20535b> list) {
            this.f178804b = context;
            this.f178803a = list;
        }

        @Override // p149l.w660
        public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            super.destroyItem(viewGroup, i, obj);
        }

        @Override // p149l.w660
        public int getCount() {
            if (vwb.m200296J(this.f178803a)) {
                return 0;
            }
            return this.f178803a.size();
        }

        @Override // p149l.w660
        @NonNull
        public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
            View viewInflate = o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126576u4, viewGroup, false);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(y4c0.f196187o1);
            VText vText = (VText) viewInflate.findViewById(y4c0.f196032Q4);
            VText vText2 = (VText) viewInflate.findViewById(y4c0.f196190o4);
            C20535b c20535b = this.f178803a.get(i);
            int i2 = c20535b.f178801c;
            if (i2 != -1) {
                vDraweeView.setImageResource(i2);
            }
            if (!TextUtils.isEmpty(c20535b.f178799a)) {
                vText.setTypeface(eqh0.m117752c(3), 1);
                vText.setText(c20535b.f178799a);
            }
            if (!TextUtils.isEmpty(c20535b.f178800b)) {
                vText2.setText(c20535b.f178800b);
            }
            viewGroup.addView(viewInflate);
            return viewInflate;
        }

        @Override // p149l.w660
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }
    }

    public uxz(@NonNull Act act, String str) {
        super(act);
        this.f178792c = "";
        this.f178797h = new RunnableC20534a();
        this.f178792c = str;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m196227l(Act act, String str, String str2) {
        act.startActivityForResult(PicExchangeEditAct.m49521Z1(act, str, str2), PutongAct.REQUEST_CODE_PICKER);
        act.overridePendingTransition(szb0.f167030e, szb0.f167026a);
    }

    /* JADX INFO: renamed from: t */
    public static void m196230t(PutongAct putongAct, String str, String str2, String str3) {
        f178791j = str2;
        f178790i = str3;
        Conversation conversationM33216zp = CoreModule.f17545c.f19642f0.m33216zp(str);
        if (conversationM33216zp == null || TEnum.equals(conversationM33216zp.status, "dismissed")) {
            osi0.m165783g("已解除配对，无法查看");
        } else {
            if (CoreModule.f17545c.f19642f0.f19983v1.get().booleanValue()) {
                m196231u(putongAct, str, str3);
                return;
            }
            uxz uxzVar = new uxz(putongAct, str);
            CoreModule.f17545c.f19642f0.f19983v1.put(Boolean.TRUE);
            uxzVar.show();
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m196231u(final Act act, final String str, final String str2) {
        dqy.m113154V(act, new d30() { // from class: l.qxz
            @Override // p149l.d30
            public final void call() {
                uxz.m196227l(act, str, str2);
            }
        });
    }

    @Override // p149l.e4z
    /* JADX INFO: renamed from: c */
    public int mo114727c() {
        return 80;
    }

    @Override // p149l.e4z
    /* JADX INFO: renamed from: f */
    public void mo114730f() {
        findViewById(y4c0.f196076Y0).setOnClickListener(new View.OnClickListener() { // from class: l.rxz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161528a.m196233p(view);
            }
        });
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.height = -2;
        attributes.gravity = 80;
        getWindow().setAttributes(attributes);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        VImage vImage = (VImage) findViewById(y4c0.f196015O);
        this.f178793d = vImage;
        xdl0.m208329E0(vImage, new View.OnClickListener() { // from class: l.sxz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166844a.m196234q(view);
            }
        });
        this.f178794e = (VPager) findViewById(y4c0.f196203q3);
        this.f178795f = (VPagerCircleIndicator) findViewById(y4c0.f196196p3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C20535b("以图换图", "发出或收到该模式下的图片,另一方必须也回复一张图片才能进行查看", c3c0.f78868t4));
        arrayList.add(new C20535b("限时快拍", "快拍必须在限时内查看,超时将无法查看高清大图;已查看的快拍,可随时回看", c3c0.f78768i3));
        C20536c c20536c = new C20536c(getContext(), arrayList);
        this.f178796g = c20536c;
        this.f178794e.setAdapter(c20536c);
        this.f178795f.setViewPager(this.f178794e);
        this.f178794e.setOnTouchListener(new View.OnTouchListener() { // from class: l.txz
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f172547a.m196235r(view, motionEvent);
            }
        });
        m196236s();
    }

    @Override // p149l.e4z
    /* JADX INFO: renamed from: h */
    public int mo114732h() {
        return l6c0.f126569t4;
    }

    /* JADX INFO: renamed from: o */
    public String m196232o() {
        return "p_newphoto_info";
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m196236s();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m196237v();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m196233p(View view) {
        dismiss();
        VPager vPager = this.f178794e;
        zvf0.m220399u("e_newphoto_known", m196232o(), vwb.m200311Y("new_photo_type", (vPager == null || vPager.getCurrentItem() != 1) ? "switch" : "time"));
        m196231u(this.f89333a, this.f178792c, f178790i);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m196234q(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ boolean m196235r(View view, MotionEvent motionEvent) {
        m196237v();
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final void m196236s() {
        if (NullChecker.m81303a(this.f178794e) && NullChecker.m81303a(this.f178796g) && this.f178796g.getCount() > 0 && NullChecker.m81303a(this.f178797h)) {
            e51.m114745J(this.f178797h);
            e51.m114743H(getContext(), this.f178797h, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        }
    }

    @Override // p149l.e4z, android.app.Dialog
    public void show() {
        cwf0 cwf0VarM133794c = i0e.m133794c(m196232o(), uxz.class.getName());
        this.f89334b = cwf0VarM133794c;
        cwf0VarM133794c.m109040p(vwb.m200311Y("receiver_user_id", this.f178792c));
        super.show();
    }

    /* JADX INFO: renamed from: v */
    public final void m196237v() {
        e51.m114745J(this.f178797h);
    }
}
