package p007l;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.ViewersBox;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.cwf0;
import l.d30;
import l.dac0;
import l.e30;
import l.i0e;
import l.j760;
import l.l5j0;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.p4c0;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class bgh extends l5j0 {

    /* JADX INFO: renamed from: f */
    public Act f6291f;

    /* JADX INFO: renamed from: g */
    public String f6292g;

    /* JADX INFO: renamed from: h */
    public String f6293h;

    /* JADX INFO: renamed from: i */
    public List<ViewersBox> f6294i;

    /* JADX INFO: renamed from: j */
    public cwf0 f6295j;

    /* JADX INFO: renamed from: k */
    public final int f6296k;

    /* JADX INFO: renamed from: l */
    public VImage f6297l;

    /* JADX INFO: renamed from: m */
    public VRecyclerView f6298m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f6299n;

    /* JADX INFO: renamed from: o */
    public VText f6300o;

    /* JADX INFO: renamed from: p */
    public boolean f6301p;

    /* JADX INFO: renamed from: q */
    public BottomSheetBehavior f6302q;

    /* JADX INFO: renamed from: r */
    public String f6303r;

    /* JADX INFO: renamed from: s */
    public String f6304s;

    /* JADX INFO: renamed from: t */
    public boolean f6305t;

    /* JADX INFO: renamed from: u */
    public boolean f6306u;

    /* JADX INFO: renamed from: v */
    public String f6307v;

    /* JADX INFO: renamed from: w */
    public C2338c f6308w;

    /* JADX INFO: renamed from: x */
    public BottomSheetBehavior.BottomSheetCallback f6309x;

    /* JADX INFO: renamed from: y */
    public final l80<ViewersBox> f6310y;

    /* JADX INFO: renamed from: l.bgh$b */
    public class C2337b extends l80<ViewersBox> {
        public C2337b() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo4975k(ViewersBox viewersBox, int i, View view) {
            zvf0.A("e_detail_visitor", "p_moment_visitor_popup", new j760[]{new j760("moments_user_id", viewersBox.userId)});
        }
    }

    /* JADX INFO: renamed from: l.bgh$c */
    public class C2338c extends dac0<ViewersBox> {

        /* JADX INFO: renamed from: c */
        public final int f6313c = 2;

        /* JADX INFO: renamed from: d */
        public final int f6314d = 1;

        /* JADX INFO: renamed from: e */
        public List<ViewersBox> f6315e = new ArrayList();

        /* JADX INFO: renamed from: f */
        public final Act f6316f;

        public C2338c(Act act) {
            this.f6316f = act;
        }

        /* JADX INFO: renamed from: H */
        private boolean m8847H(User user) {
            if (user == null) {
                return false;
            }
            return user.isFemale();
        }

        /* JADX INFO: renamed from: C */
        public int m8849C() {
            if (vwb.J(bgh.this.f6294i)) {
                return 0;
            }
            return bgh.this.f6294i.size() + 1;
        }

        /* JADX INFO: renamed from: D */
        public View m8850D(ViewGroup viewGroup, int i) {
            Act act = this.f6316f;
            return i == 2 ? act.inflater().inflate(o6c0.f11320v1, viewGroup, false) : act.inflater().inflate(o6c0.f11327w1, viewGroup, false);
        }

        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void m8848A(View view, final ViewersBox viewersBox, int i, int i2) {
            boolean zIa;
            ViewGroup viewGroup = (ViewGroup) view;
            if (i == 2) {
                VText childAt = viewGroup.getChildAt(1);
                if (TextUtils.isEmpty(bgh.this.f6307v)) {
                    view.setVisibility(8);
                    return;
                } else {
                    childAt.setText(bgh.this.f6307v);
                    return;
                }
            }
            xdl0.X(view, i2 == 0 ? t100.d(4.0f) : 0);
            bgh.this.f6310y.m11594h(view, viewersBox, i2);
            VDraweeView childAt2 = viewGroup.getChildAt(0);
            VLinear childAt3 = viewGroup.getChildAt(1);
            VText childAt4 = childAt3.getChildAt(0);
            VText childAt5 = childAt3.getChildAt(1);
            User userM16628e8 = FeedModule.f316d.m16628e8(viewersBox.userId);
            if (NullChecker.a(userM16628e8)) {
                if (!bgh.this.f6301p && m8853I()) {
                    qib0.G.O(childAt2, userM16628e8.m1042fp().profileSmall().formatted(), 1, 20);
                } else {
                    qib0.G.Q0(childAt2, userM16628e8.m1042fp().profileSmall());
                }
                zIa = FeedModule.m1140H().Ia(userM16628e8);
            } else {
                zIa = false;
            }
            String str = viewersBox.viewCount >= 3 ? "忍不住看了你的动态" : "看了你的动态";
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) (m8847H(userM16628e8) ? "她" : "他")).append((CharSequence) str);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#CC000000")), 0, spannableStringBuilder.length() - 1, 17);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(String.valueOf(viewersBox.viewCount));
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), 0, spannableStringBuilder2.length(), 17);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("次");
            spannableStringBuilder3.setSpan(new ForegroundColorSpan(Color.parseColor("#CC000000")), 0, spannableStringBuilder3.length() - 1, 17);
            if (viewersBox.viewCount >= 2) {
                childAt4.setText(spannableStringBuilder.append((CharSequence) " ").append((CharSequence) spannableStringBuilder2).append((CharSequence) " ").append((CharSequence) spannableStringBuilder3));
            } else {
                childAt4.setText(spannableStringBuilder);
            }
            childAt4.getPaint().setFakeBoldText(true);
            StringBuilder sb = new StringBuilder();
            if (zIa) {
                sb.append("当前在线 · ");
            } else {
                String strM15468B0 = vqg.m15468B0(userM16628e8);
                if (!TextUtils.isEmpty(strM15468B0)) {
                    sb.append(strM15468B0);
                    sb.append(" · ");
                }
            }
            sb.append(mqi0.G(viewersBox.lastViewTime));
            childAt5.setText(sb);
            xdl0.E0(view, new View.OnClickListener() { // from class: l.cgh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f6642a.m8854J(viewersBox, view2);
                }
            });
        }

        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public ViewersBox getItem(int i) {
            if (i >= bgh.this.f6294i.size()) {
                return null;
            }
            return bgh.this.f6294i.get(i);
        }

        /* JADX INFO: renamed from: I */
        public final boolean m8853I() {
            return vqg.m15510d0() ? tih.m14560i() : tih.m14561j();
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ void m8854J(ViewersBox viewersBox, View view) {
            zvf0.u("e_detail_visitor", "p_moment_visitor_popup", new j760[]{new j760("moments_user_id", viewersBox.userId)});
            if (!bgh.this.f6301p) {
                FeedModule.m1140H().sq(this.f6316f, "p_navigation,moment_visitor", (d30) null, (d30) null, (d30) null);
            } else {
                vs0.m15569g(this.f6316f, FeedModule.f316d.m16753w7(bgh.this.f6293h), viewersBox.userId, "photo_album_feed_viewers");
            }
        }

        /* JADX INFO: renamed from: e */
        public void m8855e(int i) {
            if (bgh.this.f6294i.size() <= 0 || bgh.this.f6294i.size() - i >= 6 || TextUtils.isEmpty(bgh.this.f6303r) || bgh.this.f6306u || !bgh.this.f6301p) {
                return;
            }
            bgh.this.m8831M();
        }

        public int getItemViewType(int i) {
            return i >= bgh.this.f6294i.size() ? 2 : 1;
        }

        public void onViewAttachedToWindow(@NonNull RecyclerView.d0 d0Var) {
            super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
            bgh.this.f6310y.m11597o();
        }

        public void onViewDetachedFromWindow(@NonNull RecyclerView.d0 d0Var) {
            super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
            bgh.this.f6310y.m11597o();
        }
    }

    public bgh(Act act, String str, String str2, String str3, boolean z) {
        super(act);
        this.f6294i = vwb.f0(new ViewersBox[0]);
        this.f6296k = (xdl0.w0() * 610) / 812;
        this.f6303r = null;
        this.f6306u = false;
        this.f6307v = null;
        this.f6309x = new C2336a();
        this.f6310y = new C2337b();
        m8832N(act);
        m8840L(str, str2, str3, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public void m8831M() {
        this.f6306u = true;
        User userMe_ = FeedModule.m1140H().me_();
        if (userMe_ != null && !TextUtils.isEmpty(this.f6293h)) {
            duringCreated(FeedModule.f316d.m16649h8(((DbObject) userMe_).id, this.f6293h, this.f6303r)).subscribe(mkd0.H(new e30() { // from class: l.vfh
                public final void call(Object obj) {
                    this.f14162a.m8841Q((j760) obj);
                }
            }, new e30() { // from class: l.wfh
                public final void call(Object obj) {
                    this.f14534a.m8835R((Throwable) obj);
                }
            }));
        } else {
            this.f6303r = null;
            this.f6306u = false;
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: N */
    private void m8832N(final Act act) {
        this.f6291f = act;
        this.f6301p = FeedModule.m1140H().ck();
        this.f6295j = i0e.c("p_moment_visitor_popup", bgh.class.getName());
        setContentView(o6c0.f11334x1);
        this.f6294i = new ArrayList();
        this.f6297l = findViewById(b5c0.f6099w);
        this.f6298m = findViewById(b5c0.f6104x1);
        this.f6299n = (FrameLayout) findViewById(b5c0.f6054i);
        this.f6300o = findViewById(b5c0.f6075o);
        if (this.f6308w == null) {
            this.f6308w = new C2338c(act);
        }
        if (this.f6298m != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act);
            linearLayoutManager.setOrientation(1);
            this.f6298m.setLayoutManager(linearLayoutManager);
            this.f6298m.setOverScrollMode(2);
            this.f6298m.setAdapter(this.f6308w);
        }
        xdl0.E0(this.f6297l, new View.OnClickListener() { // from class: l.xfh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14891a.m8842S(view);
            }
        });
        xdl0.E0(this.f6299n, new View.OnClickListener() { // from class: l.yfh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15420a.m8843U(act, view);
            }
        });
        duringCreated(act.lifecycle()).subscribe(mkd0.G(new e30() { // from class: l.zfh
            public final void call(Object obj) {
                this.f15728a.m8844V((c) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    private void m8833O() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = this.f6296k;
        attributes.gravity = 80;
        getWindow().setAttributes(attributes);
    }

    /* JADX INFO: renamed from: P */
    private boolean m8834P() {
        return (TextUtils.isEmpty(this.f6292g) || TextUtils.isEmpty(this.f6293h)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m8835R(Throwable th) {
        this.f6303r = null;
    }

    /* JADX INFO: renamed from: L */
    public void m8840L(@NonNull @NotNull String str, @NonNull @NotNull String str2, String str3, boolean z) {
        this.f6292g = str;
        this.f6293h = str2;
        this.f6304s = str3;
        this.f6305t = z;
        m8831M();
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m8841Q(j760 j760Var) {
        if (j760Var == null) {
            this.f6306u = false;
            return;
        }
        List listSubList = (List) j760Var.b;
        if (vwb.J(listSubList)) {
            this.f6303r = null;
            this.f6306u = false;
            return;
        }
        if (this.f6301p) {
            xdl0.M(this.f6299n, false);
            this.f6307v = "只展示部分浏览者\n（停留时间过短不会展示）";
        } else if (listSubList.size() >= 10) {
            if (!xdl0.O0(this.f6299n)) {
                zvf0.x("e_visitor_unlock", "p_moment_visitor_popup");
            }
            xdl0.M(this.f6299n, true);
            this.f6307v = "只展示部分浏览者\n（开通黑金会员一键解锁）";
            listSubList = listSubList.subList(0, 10);
        } else if (this.f6305t) {
            this.f6307v = "";
            xdl0.M(this.f6299n, true);
        } else {
            this.f6307v = "只展示部分浏览者\n（停留时间过短不会展示）";
            xdl0.M(this.f6299n, false);
        }
        int size = this.f6294i.size();
        this.f6294i.addAll(listSubList);
        this.f6308w.notifyItemRangeChanged(size, listSubList.size());
        Object obj = j760Var.a;
        if (obj == null) {
            this.f6306u = false;
        } else {
            this.f6303r = ((Links) obj).next;
            this.f6306u = false;
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m8842S(View view) {
        m8836T();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m8843U(Act act, View view) {
        zvf0.r("e_visitor_unlock", "p_moment_visitor_popup");
        FeedModule.m1140H().sq(act, "p_navigation,moment_visitor", new d30() { // from class: l.agh
            public final void call() {
                this.f5742a.m8836T();
            }
        }, (d30) null, (d30) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m8844V(c cVar) {
        if (cVar == c.m && isShowing()) {
            m8836T();
        }
    }

    /* JADX INFO: renamed from: dismiss, reason: merged with bridge method [inline-methods] */
    public void m8836T() {
        super.dismiss();
        this.f6295j.k();
        this.f6295j.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        if (!m8834P()) {
            lsi0.j("表态参数异常");
            return;
        }
        super/*android.app.Dialog*/.show();
        m8833O();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.E);
        this.f6302q = BottomSheetBehavior.from(frameLayout);
        frameLayout.setBackground(this.f6291f.getResources().getDrawable(f3c0.f7644K0));
        this.f6302q.setState(3);
        this.f6302q.setBottomSheetCallback(this.f6309x);
        this.f6302q.setSkipCollapsed(true);
        this.f6302q.setPeekHeight(this.f6296k);
        this.f6295j.p(new j760[]{vwb.Y("source_page", this.f6292g), vwb.Y("moment_id", this.f6293h)});
        this.f6295j.i();
        this.f6295j.l();
    }

    /* JADX INFO: renamed from: l.bgh$a */
    public class C2336a extends BottomSheetBehavior.BottomSheetCallback {
        public C2336a() {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 5) {
                bgh.this.m8836T();
                bgh.this.f6302q.setState(4);
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
