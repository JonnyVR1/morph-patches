package p153l;

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
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.ViewersBox;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.Constants;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class qhh extends pej0 {

    /* JADX INFO: renamed from: f */
    public Act f157681f;

    /* JADX INFO: renamed from: g */
    public String f157682g;

    /* JADX INFO: renamed from: h */
    public String f157683h;

    /* JADX INFO: renamed from: i */
    public List<ViewersBox> f157684i;

    /* JADX INFO: renamed from: j */
    public l4g0 f157685j;

    /* JADX INFO: renamed from: k */
    public final int f157686k;

    /* JADX INFO: renamed from: l */
    public VImage f157687l;

    /* JADX INFO: renamed from: m */
    public VRecyclerView f157688m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f157689n;

    /* JADX INFO: renamed from: o */
    public VText f157690o;

    /* JADX INFO: renamed from: p */
    public boolean f157691p;

    /* JADX INFO: renamed from: q */
    public BottomSheetBehavior f157692q;

    /* JADX INFO: renamed from: r */
    public String f157693r;

    /* JADX INFO: renamed from: s */
    public String f157694s;

    /* JADX INFO: renamed from: t */
    public boolean f157695t;

    /* JADX INFO: renamed from: u */
    public boolean f157696u;

    /* JADX INFO: renamed from: v */
    public String f157697v;

    /* JADX INFO: renamed from: w */
    public C19576c f157698w;

    /* JADX INFO: renamed from: x */
    public BottomSheetBehavior.BottomSheetCallback f157699x;

    /* JADX INFO: renamed from: y */
    public final h80<ViewersBox> f157700y;

    /* JADX INFO: renamed from: l.qhh$b */
    public class C19575b extends h80<ViewersBox> {
        public C19575b() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo65120k(ViewersBox viewersBox, int i, View view) {
            i4g0.m138492A("e_detail_visitor", "p_moment_visitor_popup", new pf60("moments_user_id", viewersBox.userId));
        }
    }

    /* JADX INFO: renamed from: l.qhh$c */
    public class C19576c extends jic0<ViewersBox> {

        /* JADX INFO: renamed from: c */
        public final int f157703c = 2;

        /* JADX INFO: renamed from: d */
        public final int f157704d = 1;

        /* JADX INFO: renamed from: e */
        public List<ViewersBox> f157705e = new ArrayList();

        /* JADX INFO: renamed from: f */
        public final Act f157706f;

        public C19576c(Act act) {
            this.f157706f = act;
        }

        /* JADX INFO: renamed from: H */
        private boolean m176573H(User user) {
            if (user == null) {
                return false;
            }
            return user.isFemale();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            if (jyb.m147479J(qhh.this.f157684i)) {
                return 0;
            }
            return qhh.this.f157684i.size() + 1;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            Act act = this.f157706f;
            return i == 2 ? act.inflater().inflate(tec0.f173770v1, viewGroup, false) : act.inflater().inflate(tec0.f173777w1, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, final ViewersBox viewersBox, int i, int i2) {
            boolean zMo31696Ia;
            ViewGroup viewGroup = (ViewGroup) view;
            if (i == 2) {
                VText vText = (VText) viewGroup.getChildAt(1);
                if (TextUtils.isEmpty(qhh.this.f157697v)) {
                    view.setVisibility(8);
                    return;
                } else {
                    vText.setText(qhh.this.f157697v);
                    return;
                }
            }
            bnl0.m105540X(view, i2 == 0 ? qa00.m175859d(4.0f) : 0);
            qhh.this.f157700y.m133881h(view, viewersBox, i2);
            VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
            VLinear vLinear = (VLinear) viewGroup.getChildAt(1);
            VText vText2 = (VText) vLinear.getChildAt(0);
            VText vText3 = (VText) vLinear.getChildAt(1);
            User userM145688e8 = FeedModule.f39703d.m145688e8(viewersBox.userId);
            if (NullChecker.m82486a(userM145688e8)) {
                if (!qhh.this.f157691p && m176576I()) {
                    uqb0.f180374G.m127120O(vDraweeView, userM145688e8.m61308fp().profileSmall().formatted(), 1, 20);
                } else {
                    uqb0.f180374G.m127125Q0(vDraweeView, userM145688e8.m61308fp().profileSmall());
                }
                zMo31696Ia = FeedModule.m61406H().mo31696Ia(userM145688e8);
            } else {
                zMo31696Ia = false;
            }
            String str = viewersBox.viewCount >= 3 ? "忍不住看了你的动态" : "看了你的动态";
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) (m176573H(userM145688e8) ? "她" : "他")).append((CharSequence) str);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#CC000000")), 0, spannableStringBuilder.length() - 1, 17);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(String.valueOf(viewersBox.viewCount));
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), 0, spannableStringBuilder2.length(), 17);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("次");
            spannableStringBuilder3.setSpan(new ForegroundColorSpan(Color.parseColor("#CC000000")), 0, spannableStringBuilder3.length() - 1, 17);
            if (viewersBox.viewCount >= 2) {
                vText2.setText(spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).append((CharSequence) spannableStringBuilder2).append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).append((CharSequence) spannableStringBuilder3));
            } else {
                vText2.setText(spannableStringBuilder);
            }
            vText2.getPaint().setFakeBoldText(true);
            StringBuilder sb = new StringBuilder();
            if (zMo31696Ia) {
                sb.append("当前在线 · ");
            } else {
                String strM151157B0 = ksg.m151157B0(userM145688e8);
                if (!TextUtils.isEmpty(strM151157B0)) {
                    sb.append(strM151157B0);
                    sb.append(" · ");
                }
            }
            sb.append(pzi0.m174442G(viewersBox.lastViewTime));
            vText3.setText(sb);
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.rhh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f163169a.m176577J(viewersBox, view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public ViewersBox getItem(int i) {
            if (i >= qhh.this.f157684i.size()) {
                return null;
            }
            return qhh.this.f157684i.get(i);
        }

        /* JADX INFO: renamed from: I */
        public final boolean m176576I() {
            return ksg.m151199d0() ? ikh.m140301i() : ikh.m140302j();
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ void m176577J(ViewersBox viewersBox, View view) {
            i4g0.m138523u("e_detail_visitor", "p_moment_visitor_popup", new pf60("moments_user_id", viewersBox.userId));
            if (!qhh.this.f157691p) {
                FeedModule.m61406H().mo31823sq(this.f157706f, "p_navigation,moment_visitor", null, null, null);
            } else {
                at0.m100013g(this.f157706f, FeedModule.f39703d.m145813w7(qhh.this.f157683h), viewersBox.userId, "photo_album_feed_viewers");
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: e */
        public void mo48510e(int i) {
            if (qhh.this.f157684i.size() <= 0 || qhh.this.f157684i.size() - i >= 6 || TextUtils.isEmpty(qhh.this.f157693r) || qhh.this.f157696u || !qhh.this.f157691p) {
                return;
            }
            qhh.this.m176557M();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i >= qhh.this.f157684i.size() ? 2 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
            super.onViewAttachedToWindow(abstractC0569e0);
            qhh.this.f157700y.m133884o();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
            super.onViewDetachedFromWindow(abstractC0569e0);
            qhh.this.f157700y.m133884o();
        }
    }

    public qhh(Act act, String str, String str2, String str3, boolean z) {
        super(act);
        this.f157684i = jyb.m147507f0(new ViewersBox[0]);
        this.f157686k = (bnl0.m105588w0() * 610) / Constants.RHYTHM_PLAYER_STATE_DECODING;
        this.f157693r = null;
        this.f157696u = false;
        this.f157697v = null;
        this.f157699x = new C19574a();
        this.f157700y = new C19575b();
        m176558N(act);
        m176566L(str, str2, str3, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public void m176557M() {
        this.f157696u = true;
        User userMe_ = FeedModule.m61406H().me_();
        if (userMe_ != null && !TextUtils.isEmpty(this.f157683h)) {
            duringCreated(FeedModule.f39703d.m145709h8(userMe_.f56859id, this.f157683h, this.f157693r)).subscribe(psd0.m173597H(new y20() { // from class: l.khh
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f126871a.m176567Q((pf60) obj);
                }
            }, new y20() { // from class: l.lhh
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f132097a.m176561R((Throwable) obj);
                }
            }));
        } else {
            this.f157693r = null;
            this.f157696u = false;
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: N */
    private void m176558N(final Act act) {
        this.f157681f = act;
        this.f157691p = FeedModule.m61406H().mo31754ck();
        this.f157685j = w1e.m204399c("p_moment_visitor_popup", qhh.class.getName());
        setContentView(tec0.f173784x1);
        this.f157684i = new ArrayList();
        this.f157687l = (VImage) findViewById(hdc0.f108971w);
        this.f157688m = (VRecyclerView) findViewById(hdc0.f108976x1);
        this.f157689n = (FrameLayout) findViewById(hdc0.f108926i);
        this.f157690o = (VText) findViewById(hdc0.f108947o);
        if (this.f157698w == null) {
            this.f157698w = new C19576c(act);
        }
        if (this.f157688m != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act);
            linearLayoutManager.setOrientation(1);
            this.f157688m.setLayoutManager(linearLayoutManager);
            this.f157688m.setOverScrollMode(2);
            this.f157688m.setAdapter(this.f157698w);
        }
        bnl0.m105509E0(this.f157687l, new View.OnClickListener() { // from class: l.mhh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136849a.m176568S(view);
            }
        });
        bnl0.m105509E0(this.f157689n, new View.OnClickListener() { // from class: l.nhh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141993a.m176569U(act, view);
            }
        });
        duringCreated(act.lifecycle()).subscribe(psd0.m173596G(new y20() { // from class: l.ohh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147448a.m176570V((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    private void m176559O() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = this.f157686k;
        attributes.gravity = 80;
        getWindow().setAttributes(attributes);
    }

    /* JADX INFO: renamed from: P */
    private boolean m176560P() {
        return (TextUtils.isEmpty(this.f157682g) || TextUtils.isEmpty(this.f157683h)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m176561R(Throwable th) {
        this.f157693r = null;
    }

    /* JADX INFO: renamed from: L */
    public void m176566L(@NonNull @NotNull String str, @NonNull @NotNull String str2, String str3, boolean z) {
        this.f157682g = str;
        this.f157683h = str2;
        this.f157694s = str3;
        this.f157695t = z;
        m176557M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m176567Q(pf60 pf60Var) {
        if (pf60Var == null) {
            this.f157696u = false;
            return;
        }
        List listSubList = (List) pf60Var.f152157b;
        if (jyb.m147479J(listSubList)) {
            this.f157693r = null;
            this.f157696u = false;
            return;
        }
        if (this.f157691p) {
            bnl0.m105524M(this.f157689n, false);
            this.f157697v = "只展示部分浏览者\n（停留时间过短不会展示）";
        } else if (listSubList.size() >= 10) {
            if (!bnl0.m105529O0(this.f157689n)) {
                i4g0.m138526x("e_visitor_unlock", "p_moment_visitor_popup");
            }
            bnl0.m105524M(this.f157689n, true);
            this.f157697v = "只展示部分浏览者\n（开通黑金会员一键解锁）";
            listSubList = listSubList.subList(0, 10);
        } else if (this.f157695t) {
            this.f157697v = "";
            bnl0.m105524M(this.f157689n, true);
        } else {
            this.f157697v = "只展示部分浏览者\n（停留时间过短不会展示）";
            bnl0.m105524M(this.f157689n, false);
        }
        int size = this.f157684i.size();
        this.f157684i.addAll(listSubList);
        this.f157698w.notifyItemRangeChanged(size, listSubList.size());
        F f = pf60Var.f152156a;
        if (f == 0) {
            this.f157696u = false;
        } else {
            this.f157693r = ((Links) f).next;
            this.f157696u = false;
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m176568S(View view) {
        m176562T();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m176569U(Act act, View view) {
        i4g0.m138520r("e_visitor_unlock", "p_moment_visitor_popup");
        FeedModule.m61406H().mo31823sq(act, "p_navigation,moment_visitor", new x20() { // from class: l.phh
            @Override // p153l.x20
            public final void call() {
                this.f152439a.m176562T();
            }
        }, null, null);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m176570V(C4470c c4470c) {
        if (c4470c == C4470c.f16271m && isShowing()) {
            m176562T();
        }
    }

    @Override // p153l.pej0, android.app.Dialog, android.content.DialogInterface
    /* JADX INFO: renamed from: dismiss, reason: merged with bridge method [inline-methods] */
    public void m176562T() {
        super.m176562T();
        this.f157685j.m152776k();
        this.f157685j.m152775j();
    }

    @Override // android.app.Dialog
    public void show() {
        if (!m176560P()) {
            o1j0.m165636j("表态参数异常");
            return;
        }
        super.show();
        m176559O();
        FrameLayout frameLayout = (FrameLayout) findViewById(vcc0.f183363E);
        this.f157692q = BottomSheetBehavior.from(frameLayout);
        frameLayout.setBackground(this.f157681f.getResources().getDrawable(lbc0.f130879K0));
        this.f157692q.setState(3);
        this.f157692q.setBottomSheetCallback(this.f157699x);
        this.f157692q.setSkipCollapsed(true);
        this.f157692q.setPeekHeight(this.f157686k);
        this.f157685j.m152781p(jyb.m147494Y("source_page", this.f157682g), jyb.m147494Y("moment_id", this.f157683h));
        this.f157685j.m152774i();
        this.f157685j.m152777l();
    }

    /* JADX INFO: renamed from: l.qhh$a */
    public class C19574a extends BottomSheetBehavior.BottomSheetCallback {
        public C19574a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 5) {
                qhh.this.m176562T();
                qhh.this.f157692q.setState(4);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
