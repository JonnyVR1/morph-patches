package com.p000p1.mobile.putong.feed.newui.status.share;

import android.R;
import android.animation.Animator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Detect;
import com.p000p1.mobile.putong.data.Emotion;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.TextTheme;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.StateEmotion;
import com.p000p1.mobile.putong.feed.newui.status.display.view.FeedSmoothSpeedRecycle;
import com.p000p1.mobile.putong.feed.newui.status.post.FeedPostStatusAct;
import com.p000p1.mobile.putong.feed.newui.status.share.C2201a;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import l.bt0;
import l.cwf0;
import l.e30;
import l.e51;
import l.e6c0;
import l.f30;
import l.i0e;
import l.j760;
import l.jig;
import l.lsi0;
import l.mqi0;
import l.p4c0;
import l.tpd0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p007l.b5c0;
import p007l.fyh;
import p007l.gsl;
import p007l.m2h;
import p007l.nkg;
import p007l.o6c0;
import p007l.pzh;
import p007l.sti;
import p007l.vqg;
import v.VDraweeView;
import v.VEditText;
import v.VLinear;
import v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2201a extends BottomSheetDialog {

    /* JADX INFO: renamed from: w */
    public static fyh f4482w = null;

    /* JADX INFO: renamed from: x */
    public static boolean f4483x = false;

    /* JADX INFO: renamed from: a */
    public View f4484a;

    /* JADX INFO: renamed from: b */
    public View f4485b;

    /* JADX INFO: renamed from: c */
    public Act f4486c;

    /* JADX INFO: renamed from: d */
    public PopupWindow f4487d;

    /* JADX INFO: renamed from: e */
    public boolean f4488e;

    /* JADX INFO: renamed from: f */
    public Interpolator f4489f;

    /* JADX INFO: renamed from: g */
    public Animator f4490g;

    /* JADX INFO: renamed from: h */
    public int f4491h;

    /* JADX INFO: renamed from: i */
    public int f4492i;

    /* JADX INFO: renamed from: j */
    public BottomSheetBehavior f4493j;

    /* JADX INFO: renamed from: k */
    public gsl f4494k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f4495l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f4496m;

    /* JADX INFO: renamed from: n */
    public VEditText f4497n;

    /* JADX INFO: renamed from: o */
    public FeedSmoothSpeedRecycle f4498o;

    /* JADX INFO: renamed from: p */
    public TextView f4499p;

    /* JADX INFO: renamed from: q */
    public TextView f4500q;

    /* JADX INFO: renamed from: r */
    public VText f4501r;

    /* JADX INFO: renamed from: s */
    public FrameLayout f4502s;

    /* JADX INFO: renamed from: t */
    public VLinear f4503t;

    /* JADX INFO: renamed from: u */
    public String f4504u;

    /* JADX INFO: renamed from: v */
    public BottomSheetBehavior.BottomSheetCallback f4505v;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.a$a */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (C2201a.this.f4497n.getLineCount() > 3) {
                String string = editable.toString();
                int selectionStart = C2201a.this.f4497n.getSelectionStart();
                C2201a.this.f4497n.setText((selectionStart != C2201a.this.f4497n.getSelectionEnd() || selectionStart >= string.length() || selectionStart < 1) ? string.substring(0, editable.length() - 1) : string.substring(0, selectionStart - 1).concat(string.substring(selectionStart)));
                C2201a.this.f4497n.setSelection(C2201a.this.f4497n.getText().length());
                e51.G(new Runnable() { // from class: l.ruh
                    @Override // java.lang.Runnable
                    public final void run() {
                        lsi0.j("最多输入3行");
                    }
                });
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.a$b */
    public class b extends BottomSheetBehavior.BottomSheetCallback {
        public b() {
        }

        public void onSlide(@NonNull View view, float f) {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                C2201a.this.f4493j.setState(3);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.a$c */
    public static class c extends RecyclerView.n {
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.top = 0;
                rect.bottom = 0;
                rect.left = 0;
                rect.right = 0;
            }
        }

        public c() {
        }
    }

    public C2201a(@NonNull Context context, int i) {
        super(context, i);
        this.f4488e = false;
        this.f4489f = new jig();
        this.f4490g = null;
        this.f4505v = new b();
        m7022L(context);
    }

    /* JADX INFO: renamed from: E */
    public static List<fyh> m7018E() {
        ArrayList arrayList = new ArrayList();
        for (StateEmotion stateEmotion : JSON.parseArray((String) sti.f13081g.get(), StateEmotion.class)) {
            Iterator<Emotion> it = stateEmotion.emotions.iterator();
            while (it.hasNext()) {
                arrayList.add(new fyh(false, it.next(), stateEmotion.categoryName));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: G */
    private void m7019G() {
        Rect rect = new Rect();
        this.f4484a.getWindowVisibleDisplayFrame(rect);
        if (this.f4491h == 0) {
            this.f4491h = rect.bottom;
        }
        if (this.f4492i == 0) {
            this.f4492i = rect.bottom;
        }
        int i = rect.bottom;
        if (i > this.f4492i && i != this.f4491h) {
            m7020H();
            this.f4492i = this.f4491h;
        }
        int i2 = this.f4492i - rect.bottom;
        if (i2 <= 0) {
            if (i2 < 0) {
                m7020H();
                this.f4492i = rect.bottom;
                return;
            }
            return;
        }
        if (this.f4488e && NullChecker.a(this.f4490g)) {
            this.f4490g.cancel();
        }
        this.f4488e = true;
        m7027a0(i2);
        this.f4492i = rect.bottom;
    }

    /* JADX INFO: renamed from: H */
    private void m7020H() {
        if (!this.f4488e && NullChecker.a(this.f4490g)) {
            this.f4490g.cancel();
        }
        this.f4488e = false;
        m7027a0(0);
    }

    /* JADX INFO: renamed from: I */
    public static void m7021I(Act act, View view) {
        ((InputMethodManager) act.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: L */
    private void m7022L(Context context) {
        this.f4486c = (Act) context;
        View viewInflate = LayoutInflater.from(context).inflate(o6c0.f11252l3, (ViewGroup) null);
        if (nkg.m12199A()) {
            viewInflate = LayoutInflater.from(context).inflate(o6c0.f11259m3, (ViewGroup) null);
        }
        setContentView(viewInflate);
        this.f4495l = (LinearLayout) viewInflate.findViewById(b5c0.f6103x0);
        if (!nkg.m12199A()) {
            this.f4496m = viewInflate.findViewById(b5c0.f6010W);
        }
        this.f4497n = viewInflate.findViewById(b5c0.f6097v0);
        this.f4502s = (FrameLayout) viewInflate.findViewById(b5c0.f5952C1);
        this.f4498o = (FeedSmoothSpeedRecycle) viewInflate.findViewById(b5c0.f5973J1);
        this.f4499p = (TextView) viewInflate.findViewById(b5c0.f6032c1);
        this.f4500q = (TextView) viewInflate.findViewById(b5c0.f6098v1);
        this.f4501r = viewInflate.findViewById(b5c0.f6006U1);
        this.f4503t = viewInflate.findViewById(b5c0.f5977L);
        xdl0.M(this.f4495l, nkg.m12207E());
        TextPaint paint = this.f4501r.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        viewInflate.findViewById(b5c0.f5967H1).setOnClickListener(new View.OnClickListener() { // from class: l.puh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11984a.m7024V(view);
            }
        });
        m7023M();
    }

    /* JADX INFO: renamed from: M */
    private void m7023M() {
        this.f4487d = new PopupWindow((Context) this.f4486c);
        View viewInflate = ((LayoutInflater) this.f4486c.getSystemService("layout_inflater")).inflate(e6c0.u, (ViewGroup) null, false);
        this.f4484a = viewInflate;
        this.f4487d.setContentView(viewInflate);
        this.f4487d.setSoftInputMode(21);
        this.f4487d.setInputMethodMode(1);
        this.f4485b = this.f4486c.findViewById(R.id.content);
        this.f4487d.setWidth(0);
        this.f4487d.setHeight(-1);
        this.f4484a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.huh
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f8822a.m7049W();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m7024V(View view) {
        m7020H();
        m7021I(this.f4486c, this.f4497n);
        dismiss();
    }

    /* JADX INFO: renamed from: Y */
    private void m7025Y() {
        if (NullChecker.a(this.f4494k)) {
            this.f4494k.mo10496b();
        }
    }

    /* JADX INFO: renamed from: Z */
    public static void m7026Z(Act act, Emotion emotion, String str) {
        final BubbleInfo bubbleInfo = new BubbleInfo();
        if (!TextUtils.isEmpty(str)) {
            bubbleInfo.value = str;
        }
        bubbleInfo.emotion = emotion;
        TextTheme textTheme = new TextTheme();
        textTheme.backgroundColor = emotion.backgroundColor;
        textTheme.iconColor = emotion.iconColor;
        bubbleInfo.textTheme = textTheme;
        if (TextUtils.isEmpty(str)) {
            FeedModule.f317e.m10712V0(bubbleInfo, "");
        } else {
            vqg.m15533p(act, str, new e30() { // from class: l.quh
                public final void call(Object obj) {
                    C2201a.m7036y(bubbleInfo, (Detect) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a0 */
    private void m7027a0(int i) {
        if (!nkg.m12199A()) {
            VEditText vEditText = this.f4497n;
            if (i == 0) {
                if (TextUtils.isEmpty(vEditText.getText().toString())) {
                    if (NullChecker.a(this.f4496m)) {
                        xdl0.M(this.f4496m, true);
                    }
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4497n.getLayoutParams();
                    layoutParams.width = -2;
                    this.f4497n.setLayoutParams(layoutParams);
                }
                this.f4497n.setMaxLines(4);
                this.f4495l.setGravity(1);
            } else {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) vEditText.getLayoutParams();
                layoutParams2.width = -1;
                this.f4497n.setLayoutParams(layoutParams2);
                if (NullChecker.a(this.f4496m)) {
                    xdl0.M(this.f4496m, false);
                }
                this.f4495l.setGravity(51);
                this.f4497n.setMaxLines(2);
            }
        }
        Animator animatorP = bt0.p(this.f4502s, "translationY", 0L, 150L, this.f4489f, new float[]{-i});
        this.f4490g = animatorP;
        animatorP.start();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m7036y(BubbleInfo bubbleInfo, Detect detect) {
        if (detect == null) {
            FeedModule.f317e.m10712V0(bubbleInfo, "");
        } else if (vqg.m15525l(detect, "p_state_post_guide")) {
            lsi0.w(R$string.f602s);
        } else {
            lsi0.w(R$string.f457W2);
        }
    }

    /* JADX INFO: renamed from: F */
    public final String m7038F() {
        if (TextUtils.equals("from_nearby_focus", this.f4504u)) {
            return "p_follow";
        }
        if (TextUtils.equals("from_nearby_falls_feed", this.f4504u)) {
            return OMSDialogPositon.p_nearby;
        }
        if (TextUtils.equals("from_like", this.f4504u)) {
            return "p_like";
        }
        if (TextUtils.equals("state_explore", this.f4504u)) {
            return "p_state_explore";
        }
        if (TextUtils.equals("from_discover_dating", this.f4504u)) {
            return "p_discover_dating";
        }
        return TextUtils.equals("from_discover_discussion", this.f4504u) ? "p_discover_discussion" : "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J */
    public void m7039J(String str, final String str2, int i, e30<String> e30Var, final e30<String> e30Var2) {
        this.f4504u = str2;
        if ("from_nearby_focus".equals(str2)) {
            str2 = "follow";
        } else if ("from_nearby_falls_feed".equals(str2)) {
            str2 = "nearby";
        } else if ("from_like".equals(str2)) {
            str2 = "like";
        } else if ("state_explore".equals(str2)) {
            str2 = "state_explore";
        }
        final cwf0 cwf0VarC = i0e.c("p_state_post_guide", Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("state_post_guide_showfrom", str2)});
        i0e.f(cwf0VarC);
        this.f4501r.setText(str);
        TextPaint paint = this.f4501r.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        this.f4503t.setOnTouchListener(new View.OnTouchListener() { // from class: l.guh
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f8520a.m7042O(view, motionEvent);
            }
        });
        this.f4497n.setOnTouchListener(new View.OnTouchListener() { // from class: l.iuh
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f9138a.m7043P(view, motionEvent);
            }
        });
        this.f4497n.setFilters(new InputFilter[]{new m2h(30)});
        this.f4497n.addTextChangedListener(new a());
        this.f4498o.addItemDecoration(new c());
        final List<fyh> listM7018E = m7018E();
        FeedGalleryLayoutManager feedGalleryLayoutManager = new FeedGalleryLayoutManager(0);
        int iNextInt = new Random().nextInt(18) + 40000;
        if (i != 0 && listM7018E.size() > 0) {
            iNextInt = ((listM7018E.size() * 3000) + i) - 1;
        }
        feedGalleryLayoutManager.m6991f(this.f4498o, iNextInt);
        feedGalleryLayoutManager.m7010z(new C2202b());
        final pzh pzhVar = new pzh(listM7018E, this.f4486c);
        this.f4498o.setAdapter(pzhVar);
        pzhVar.m13368G(new f30() { // from class: l.juh
            public final void call(Object obj, Object obj2) {
                this.f9527a.m7044Q((Integer) obj, (fyh) obj2);
            }
        });
        feedGalleryLayoutManager.m7009y(true);
        feedGalleryLayoutManager.m6990A(new FeedGalleryLayoutManager.InterfaceC2199e() { // from class: l.kuh
            @Override // com.p000p1.mobile.putong.feed.newui.status.share.FeedGalleryLayoutManager.InterfaceC2199e
            /* JADX INFO: renamed from: a */
            public final void mo7014a(RecyclerView recyclerView, View view, int i2) {
                this.f9799a.m7045R(pzhVar, listM7018E, recyclerView, view, i2);
            }
        });
        xdl0.E0(this.f4500q, new View.OnClickListener() { // from class: l.luh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10136a.m7046S(view);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.muh
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f10578a.m7047T(e30Var2, cwf0VarC, str2, dialogInterface);
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.nuh
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f10888a.m7048U(dialogInterface);
            }
        });
        setCanceledOnTouchOutside(true);
        f4483x = false;
        zvf0.A("e_set_my_state_post", "p_state_post_guide", new j760[]{j760.a("source_page", m7038F())});
        if (!TextUtils.equals(str2, "state_explore")) {
            sti.f13083i.put(Long.valueOf(mqi0.o()));
        }
        if (NullChecker.a(e30Var)) {
            e30Var.call("");
        }
    }

    /* JADX INFO: renamed from: K */
    public void m7040K(String str, String str2, int i, e30<String> e30Var, e30<String> e30Var2, gsl gslVar) {
        this.f4494k = gslVar;
        m7039J(str, str2, i, e30Var, e30Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m7041N() {
        super/*android.app.Dialog*/.dismiss();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ boolean m7042O(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f4497n.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ boolean m7043P(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.f4497n.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m7044Q(Integer num, fyh fyhVar) {
        zvf0.u("e_set_my_state_type", "p_state_post_guide", new j760[]{vwb.Y("state_type_id", fyhVar.m10328b().f209id)});
        this.f4498o.smoothScrollToPosition(num.intValue());
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m7045R(pzh pzhVar, List list, RecyclerView recyclerView, View view, int i) {
        int iM13369z = i % pzhVar.m13369z();
        if (iM13369z < 0 || iM13369z >= list.size()) {
            return;
        }
        fyh fyhVar = (fyh) list.get(iM13369z);
        f4482w = fyhVar;
        this.f4499p.setText(fyhVar.m10330d());
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m7046S(View view) {
        zvf0.u("e_set_my_state_post", "p_state_post_guide", new j760[]{j760.a("source_page", m7038F())});
        if (nkg.m12207E()) {
            fyh fyhVar = f4482w;
            if (fyhVar == null) {
                return;
            }
            m7026Z(this.f4486c, fyhVar.m10328b(), this.f4497n.getText().toString());
            m7021I(this.f4486c, this.f4497n);
            dismiss();
            return;
        }
        fyh fyhVar2 = f4482w;
        if (fyhVar2 == null) {
            return;
        }
        f4483x = true;
        Act act = this.f4486c;
        act.startActivity(FeedPostStatusAct.m6952r2(act, fyhVar2.m10328b()));
        this.f4486c.overridePendingTransition(0, 0);
        m7021I(this.f4486c, this.f4497n);
        dismiss();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m7047T(e30 e30Var, cwf0 cwf0Var, String str, DialogInterface dialogInterface) {
        FeedModule.m1140H().as(false);
        m7050X();
        if (NullChecker.a(e30Var)) {
            e30Var.call("");
        }
        i0e.e(cwf0Var);
        if (f4483x) {
            if (TextUtils.equals(str, "state_explore")) {
                return;
            }
            sti.f13084j.put(0);
        } else {
            if (TextUtils.equals(str, "state_explore")) {
                return;
            }
            tpd0 tpd0Var = sti.f13084j;
            tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
            sti.f13085k.put(Long.valueOf(mqi0.o()));
        }
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m7048U(DialogInterface dialogInterface) {
        FeedModule.m1140H().as(true);
        m7025Y();
        if (this.f4487d.isShowing() || this.f4485b.getWindowToken() == null) {
            return;
        }
        this.f4487d.setBackgroundDrawable(new ColorDrawable(0));
        this.f4487d.showAtLocation(this.f4485b, 0, 0, 0);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m7049W() {
        if (this.f4484a != null) {
            m7019G();
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m7050X() {
        if (NullChecker.a(this.f4494k)) {
            this.f4494k.mo10497c();
        }
    }

    public void dismiss() {
        e51.H(this.f4486c, new Runnable() { // from class: l.ouh
            @Override // java.lang.Runnable
            public final void run() {
                this.f11620a.m7041N();
            }
        }, 200L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f4493j = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f4493j.setBottomSheetCallback(this.f4505v);
    }
}
