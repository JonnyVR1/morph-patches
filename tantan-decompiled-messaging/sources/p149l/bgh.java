package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.ViewersBox;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.Constants;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class bgh extends l5j0 {

    /* JADX INFO: renamed from: f */
    public Act f75432f;

    /* JADX INFO: renamed from: g */
    public String f75433g;

    /* JADX INFO: renamed from: h */
    public String f75434h;

    /* JADX INFO: renamed from: i */
    public List<ViewersBox> f75435i;

    /* JADX INFO: renamed from: j */
    public cwf0 f75436j;

    /* JADX INFO: renamed from: k */
    public final int f75437k;

    /* JADX INFO: renamed from: l */
    public VImage f75438l;

    /* JADX INFO: renamed from: m */
    public VRecyclerView f75439m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f75440n;

    /* JADX INFO: renamed from: o */
    public VText f75441o;

    /* JADX INFO: renamed from: p */
    public boolean f75442p;

    /* JADX INFO: renamed from: q */
    public BottomSheetBehavior f75443q;

    /* JADX INFO: renamed from: r */
    public String f75444r;

    /* JADX INFO: renamed from: s */
    public String f75445s;

    /* JADX INFO: renamed from: t */
    public boolean f75446t;

    /* JADX INFO: renamed from: u */
    public boolean f75447u;

    /* JADX INFO: renamed from: v */
    public String f75448v;

    /* JADX INFO: renamed from: w */
    public C15855c f75449w;

    /* JADX INFO: renamed from: x */
    public BottomSheetBehavior.BottomSheetCallback f75450x;

    /* JADX INFO: renamed from: y */
    public final l80<ViewersBox> f75451y;

    /* JADX INFO: renamed from: l.bgh$b */
    public class C15854b extends l80<ViewersBox> {
        public C15854b() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo63937k(ViewersBox viewersBox, int i, View view) {
            zvf0.m220368A("e_detail_visitor", "p_moment_visitor_popup", new j760("moments_user_id", viewersBox.userId));
        }
    }

    /* JADX INFO: renamed from: l.bgh$c */
    public class C15855c extends dac0<ViewersBox> {

        /* JADX INFO: renamed from: c */
        public final int f75454c = 2;

        /* JADX INFO: renamed from: d */
        public final int f75455d = 1;

        /* JADX INFO: renamed from: e */
        public List<ViewersBox> f75456e = new ArrayList();

        /* JADX INFO: renamed from: f */
        public final Act f75457f;

        public C15855c(Act act) {
            this.f75457f = act;
        }

        /* JADX INFO: renamed from: H */
        private boolean m101662H(User user) {
            if (user == null) {
                return false;
            }
            return user.isFemale();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            if (vwb.m200296J(bgh.this.f75435i)) {
                return 0;
            }
            return bgh.this.f75435i.size() + 1;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            Act act = this.f75457f;
            return i == 2 ? act.inflater().inflate(o6c0.f142301v1, viewGroup, false) : act.inflater().inflate(o6c0.f142308w1, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, final ViewersBox viewersBox, int i, int i2) {
            boolean zMo30693Ia;
            ViewGroup viewGroup = (ViewGroup) view;
            if (i == 2) {
                VText vText = (VText) viewGroup.getChildAt(1);
                if (TextUtils.isEmpty(bgh.this.f75448v)) {
                    view.setVisibility(8);
                    return;
                } else {
                    vText.setText(bgh.this.f75448v);
                    return;
                }
            }
            xdl0.m208360X(view, i2 == 0 ? t100.m186890d(4.0f) : 0);
            bgh.this.f75451y.m148839h(view, viewersBox, i2);
            VDraweeView vDraweeView = (VDraweeView) viewGroup.getChildAt(0);
            VLinear vLinear = (VLinear) viewGroup.getChildAt(1);
            VText vText2 = (VText) vLinear.getChildAt(0);
            VText vText3 = (VText) vLinear.getChildAt(1);
            User userM209447e8 = FeedModule.f38855d.m209447e8(viewersBox.userId);
            if (NullChecker.m81303a(userM209447e8)) {
                if (!bgh.this.f75442p && m101665I()) {
                    qib0.f154691G.m102336O(vDraweeView, userM209447e8.m60124fp().profileSmall().formatted(), 1, 20);
                } else {
                    qib0.f154691G.m102341Q0(vDraweeView, userM209447e8.m60124fp().profileSmall());
                }
                zMo30693Ia = FeedModule.m60222H().mo30693Ia(userM209447e8);
            } else {
                zMo30693Ia = false;
            }
            String str = viewersBox.viewCount >= 3 ? "忍不住看了你的动态" : "看了你的动态";
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) (m101662H(userM209447e8) ? "她" : "他")).append((CharSequence) str);
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
            if (zMo30693Ia) {
                sb.append("当前在线 · ");
            } else {
                String strM199498B0 = vqg.m199498B0(userM209447e8);
                if (!TextUtils.isEmpty(strM199498B0)) {
                    sb.append(strM199498B0);
                    sb.append(" · ");
                }
            }
            sb.append(mqi0.m155932G(viewersBox.lastViewTime));
            vText3.setText(sb);
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.cgh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f80743a.m101666J(viewersBox, view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public ViewersBox getItem(int i) {
            if (i >= bgh.this.f75435i.size()) {
                return null;
            }
            return bgh.this.f75435i.get(i);
        }

        /* JADX INFO: renamed from: I */
        public final boolean m101665I() {
            return vqg.m199540d0() ? tih.m189193i() : tih.m189194j();
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ void m101666J(ViewersBox viewersBox, View view) {
            zvf0.m220399u("e_detail_visitor", "p_moment_visitor_popup", new j760("moments_user_id", viewersBox.userId));
            if (!bgh.this.f75442p) {
                FeedModule.m60222H().mo30820sq(this.f75457f, "p_navigation,moment_visitor", null, null, null);
            } else {
                vs0.m199801g(this.f75457f, FeedModule.f38855d.m209572w7(bgh.this.f75434h), viewersBox.userId, "photo_album_feed_viewers");
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: e */
        public void mo47327e(int i) {
            if (bgh.this.f75435i.size() <= 0 || bgh.this.f75435i.size() - i >= 6 || TextUtils.isEmpty(bgh.this.f75444r) || bgh.this.f75447u || !bgh.this.f75442p) {
                return;
            }
            bgh.this.m101646M();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i >= bgh.this.f75435i.size() ? 2 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
            super.onViewAttachedToWindow(abstractC0566d0);
            bgh.this.f75451y.m148842o();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
            super.onViewDetachedFromWindow(abstractC0566d0);
            bgh.this.f75451y.m148842o();
        }
    }

    public bgh(Act act, String str, String str2, String str3, boolean z) {
        super(act);
        this.f75435i = vwb.m200324f0(new ViewersBox[0]);
        this.f75437k = (xdl0.m208408w0() * 610) / Constants.RHYTHM_PLAYER_STATE_DECODING;
        this.f75444r = null;
        this.f75447u = false;
        this.f75448v = null;
        this.f75450x = new C15853a();
        this.f75451y = new C15854b();
        m101647N(act);
        m101655L(str, str2, str3, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public void m101646M() {
        this.f75447u = true;
        User userMe_ = FeedModule.m60222H().me_();
        if (userMe_ != null && !TextUtils.isEmpty(this.f75434h)) {
            duringCreated(FeedModule.f38855d.m209468h8(userMe_.f56011id, this.f75434h, this.f75444r)).subscribe(mkd0.m154956H(new e30() { // from class: l.vfh
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f181271a.m101656Q((j760) obj);
                }
            }, new e30() { // from class: l.wfh
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f186081a.m101650R((Throwable) obj);
                }
            }));
        } else {
            this.f75444r = null;
            this.f75447u = false;
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: N */
    private void m101647N(final Act act) {
        this.f75432f = act;
        this.f75442p = FeedModule.m60222H().mo30751ck();
        this.f75436j = i0e.m133794c("p_moment_visitor_popup", bgh.class.getName());
        setContentView(o6c0.f142315x1);
        this.f75435i = new ArrayList();
        this.f75438l = (VImage) findViewById(b5c0.f73618w);
        this.f75439m = (VRecyclerView) findViewById(b5c0.f73623x1);
        this.f75440n = (FrameLayout) findViewById(b5c0.f73573i);
        this.f75441o = (VText) findViewById(b5c0.f73594o);
        if (this.f75449w == null) {
            this.f75449w = new C15855c(act);
        }
        if (this.f75439m != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act);
            linearLayoutManager.setOrientation(1);
            this.f75439m.setLayoutManager(linearLayoutManager);
            this.f75439m.setOverScrollMode(2);
            this.f75439m.setAdapter(this.f75449w);
        }
        xdl0.m208329E0(this.f75438l, new View.OnClickListener() { // from class: l.xfh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192688a.m101657S(view);
            }
        });
        xdl0.m208329E0(this.f75440n, new View.OnClickListener() { // from class: l.yfh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198062a.m101658U(act, view);
            }
        });
        duringCreated(act.lifecycle()).subscribe(mkd0.m154955G(new e30() { // from class: l.zfh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202941a.m101659V((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    private void m101648O() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = this.f75437k;
        attributes.gravity = 80;
        getWindow().setAttributes(attributes);
    }

    /* JADX INFO: renamed from: P */
    private boolean m101649P() {
        return (TextUtils.isEmpty(this.f75433g) || TextUtils.isEmpty(this.f75434h)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m101650R(Throwable th) {
        this.f75444r = null;
    }

    /* JADX INFO: renamed from: L */
    public void m101655L(@NonNull @NotNull String str, @NonNull @NotNull String str2, String str3, boolean z) {
        this.f75433g = str;
        this.f75434h = str2;
        this.f75445s = str3;
        this.f75446t = z;
        m101646M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m101656Q(j760 j760Var) {
        if (j760Var == null) {
            this.f75447u = false;
            return;
        }
        List listSubList = (List) j760Var.f116565b;
        if (vwb.m200296J(listSubList)) {
            this.f75444r = null;
            this.f75447u = false;
            return;
        }
        if (this.f75442p) {
            xdl0.m208344M(this.f75440n, false);
            this.f75448v = "只展示部分浏览者\n（停留时间过短不会展示）";
        } else if (listSubList.size() >= 10) {
            if (!xdl0.m208349O0(this.f75440n)) {
                zvf0.m220402x("e_visitor_unlock", "p_moment_visitor_popup");
            }
            xdl0.m208344M(this.f75440n, true);
            this.f75448v = "只展示部分浏览者\n（开通黑金会员一键解锁）";
            listSubList = listSubList.subList(0, 10);
        } else if (this.f75446t) {
            this.f75448v = "";
            xdl0.m208344M(this.f75440n, true);
        } else {
            this.f75448v = "只展示部分浏览者\n（停留时间过短不会展示）";
            xdl0.m208344M(this.f75440n, false);
        }
        int size = this.f75435i.size();
        this.f75435i.addAll(listSubList);
        this.f75449w.notifyItemRangeChanged(size, listSubList.size());
        F f = j760Var.f116564a;
        if (f == 0) {
            this.f75447u = false;
        } else {
            this.f75444r = ((Links) f).next;
            this.f75447u = false;
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m101657S(View view) {
        m101651T();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m101658U(Act act, View view) {
        zvf0.m220396r("e_visitor_unlock", "p_moment_visitor_popup");
        FeedModule.m60222H().mo30820sq(act, "p_navigation,moment_visitor", new d30() { // from class: l.agh
            @Override // p149l.d30
            public final void call() {
                this.f69363a.m101651T();
            }
        }, null, null);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m101659V(C4319c c4319c) {
        if (c4319c == C4319c.f15552m && isShowing()) {
            m101651T();
        }
    }

    @Override // p149l.l5j0, android.app.Dialog, android.content.DialogInterface
    /* JADX INFO: renamed from: dismiss, reason: merged with bridge method [inline-methods] */
    public void m101651T() {
        super.m101651T();
        this.f75436j.m109035k();
        this.f75436j.m109034j();
    }

    @Override // android.app.Dialog
    public void show() {
        if (!m101649P()) {
            lsi0.m151580j("表态参数异常");
            return;
        }
        super.show();
        m101648O();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.f147063E);
        this.f75443q = BottomSheetBehavior.from(frameLayout);
        frameLayout.setBackground(this.f75432f.getResources().getDrawable(f3c0.f94361K0));
        this.f75443q.setState(3);
        this.f75443q.setBottomSheetCallback(this.f75450x);
        this.f75443q.setSkipCollapsed(true);
        this.f75443q.setPeekHeight(this.f75437k);
        this.f75436j.m109040p(vwb.m200311Y("source_page", this.f75433g), vwb.m200311Y("moment_id", this.f75434h));
        this.f75436j.m109033i();
        this.f75436j.m109036l();
    }

    /* JADX INFO: renamed from: l.bgh$a */
    public class C15853a extends BottomSheetBehavior.BottomSheetCallback {
        public C15853a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 5) {
                bgh.this.m101651T();
                bgh.this.f75443q.setState(4);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
