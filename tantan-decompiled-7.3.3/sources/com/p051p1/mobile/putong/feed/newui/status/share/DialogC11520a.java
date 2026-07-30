package com.p051p1.mobile.putong.feed.newui.status.share;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Detect;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.TextTheme;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.StateEmotion;
import com.p051p1.mobile.putong.feed.newui.status.display.view.FeedSmoothSpeedRecycle;
import com.p051p1.mobile.putong.feed.newui.status.post.FeedPostStatusAct;
import com.p051p1.mobile.putong.feed.newui.status.share.DialogC11520a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VLinear;
import p151v.VText;
import p153l.b4h;
import p153l.bnl0;
import p153l.cmg;
import p153l.e1i;
import p153l.gt0;
import p153l.hdc0;
import p153l.i4g0;
import p153l.jec0;
import p153l.jyb;
import p153l.ksg;
import p153l.l4g0;
import p153l.l51;
import p153l.o1j0;
import p153l.owi;
import p153l.pf60;
import p153l.pzi0;
import p153l.tec0;
import p153l.uul;
import p153l.uzh;
import p153l.vcc0;
import p153l.vxd0;
import p153l.w1e;
import p153l.xjg;
import p153l.y20;
import p153l.z20;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.a */
/* JADX INFO: loaded from: classes13.dex */
public class DialogC11520a extends BottomSheetDialog {

    /* JADX INFO: renamed from: w */
    public static uzh f43869w = null;

    /* JADX INFO: renamed from: x */
    public static boolean f43870x = false;

    /* JADX INFO: renamed from: a */
    public View f43871a;

    /* JADX INFO: renamed from: b */
    public View f43872b;

    /* JADX INFO: renamed from: c */
    public Act f43873c;

    /* JADX INFO: renamed from: d */
    public PopupWindow f43874d;

    /* JADX INFO: renamed from: e */
    public boolean f43875e;

    /* JADX INFO: renamed from: f */
    public Interpolator f43876f;

    /* JADX INFO: renamed from: g */
    public Animator f43877g;

    /* JADX INFO: renamed from: h */
    public int f43878h;

    /* JADX INFO: renamed from: i */
    public int f43879i;

    /* JADX INFO: renamed from: j */
    public BottomSheetBehavior f43880j;

    /* JADX INFO: renamed from: k */
    public uul f43881k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f43882l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f43883m;

    /* JADX INFO: renamed from: n */
    public VEditText f43884n;

    /* JADX INFO: renamed from: o */
    public FeedSmoothSpeedRecycle f43885o;

    /* JADX INFO: renamed from: p */
    public TextView f43886p;

    /* JADX INFO: renamed from: q */
    public TextView f43887q;

    /* JADX INFO: renamed from: r */
    public VText f43888r;

    /* JADX INFO: renamed from: s */
    public FrameLayout f43889s;

    /* JADX INFO: renamed from: t */
    public VLinear f43890t;

    /* JADX INFO: renamed from: u */
    public String f43891u;

    /* JADX INFO: renamed from: v */
    public BottomSheetBehavior.BottomSheetCallback f43892v;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.a$a */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (DialogC11520a.this.f43884n.getLineCount() > 3) {
                String string = editable.toString();
                int selectionStart = DialogC11520a.this.f43884n.getSelectionStart();
                DialogC11520a.this.f43884n.setText((selectionStart != DialogC11520a.this.f43884n.getSelectionEnd() || selectionStart >= string.length() || selectionStart < 1) ? string.substring(0, editable.length() - 1) : string.substring(0, selectionStart - 1).concat(string.substring(selectionStart)));
                DialogC11520a.this.f43884n.setSelection(DialogC11520a.this.f43884n.getText().length());
                l51.m152887G(new Runnable() { // from class: l.gwh
                    @Override // java.lang.Runnable
                    public final void run() {
                        o1j0.m165636j("最多输入3行");
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

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                DialogC11520a.this.f43880j.setState(3);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.a$c */
    public static class c extends RecyclerView.AbstractC0578n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
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

    public DialogC11520a(@NonNull Context context, int i) {
        super(context, i);
        this.f43875e = false;
        this.f43876f = new xjg();
        this.f43877g = null;
        this.f43892v = new b();
        m67058L(context);
    }

    /* JADX INFO: renamed from: E */
    public static List<uzh> m67054E() {
        ArrayList arrayList = new ArrayList();
        for (StateEmotion stateEmotion : JSON.parseArray(owi.f149488g.get(), StateEmotion.class)) {
            Iterator<Emotion> it = stateEmotion.emotions.iterator();
            while (it.hasNext()) {
                arrayList.add(new uzh(false, it.next(), stateEmotion.categoryName));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: G */
    private void m67055G() {
        Rect rect = new Rect();
        this.f43871a.getWindowVisibleDisplayFrame(rect);
        if (this.f43878h == 0) {
            this.f43878h = rect.bottom;
        }
        if (this.f43879i == 0) {
            this.f43879i = rect.bottom;
        }
        int i = rect.bottom;
        if (i > this.f43879i && i != this.f43878h) {
            m67056H();
            this.f43879i = this.f43878h;
        }
        int i2 = this.f43879i - rect.bottom;
        if (i2 <= 0) {
            if (i2 < 0) {
                m67056H();
                this.f43879i = rect.bottom;
                return;
            }
            return;
        }
        if (this.f43875e && NullChecker.m82486a(this.f43877g)) {
            this.f43877g.cancel();
        }
        this.f43875e = true;
        m67063a0(i2);
        this.f43879i = rect.bottom;
    }

    /* JADX INFO: renamed from: H */
    private void m67056H() {
        if (!this.f43875e && NullChecker.m82486a(this.f43877g)) {
            this.f43877g.cancel();
        }
        this.f43875e = false;
        m67063a0(0);
    }

    /* JADX INFO: renamed from: I */
    public static void m67057I(Act act, View view) {
        ((InputMethodManager) act.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: L */
    private void m67058L(Context context) {
        this.f43873c = (Act) context;
        View viewInflate = LayoutInflater.from(context).inflate(tec0.f173702l3, (ViewGroup) null);
        if (cmg.m111169A()) {
            viewInflate = LayoutInflater.from(context).inflate(tec0.f173709m3, (ViewGroup) null);
        }
        setContentView(viewInflate);
        this.f43882l = (LinearLayout) viewInflate.findViewById(hdc0.f108975x0);
        if (!cmg.m111169A()) {
            this.f43883m = (VDraweeView) viewInflate.findViewById(hdc0.f108882W);
        }
        this.f43884n = (VEditText) viewInflate.findViewById(hdc0.f108969v0);
        this.f43889s = (FrameLayout) viewInflate.findViewById(hdc0.f108824C1);
        this.f43885o = (FeedSmoothSpeedRecycle) viewInflate.findViewById(hdc0.f108845J1);
        this.f43886p = (TextView) viewInflate.findViewById(hdc0.f108904c1);
        this.f43887q = (TextView) viewInflate.findViewById(hdc0.f108970v1);
        this.f43888r = (VText) viewInflate.findViewById(hdc0.f108878U1);
        this.f43890t = (VLinear) viewInflate.findViewById(hdc0.f108849L);
        bnl0.m105524M(this.f43882l, cmg.m111177E());
        TextPaint paint = this.f43888r.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        viewInflate.findViewById(hdc0.f108839H1).setOnClickListener(new View.OnClickListener() { // from class: l.ewh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96158a.m67060V(view);
            }
        });
        m67059M();
    }

    /* JADX INFO: renamed from: M */
    private void m67059M() {
        this.f43874d = new PopupWindow(this.f43873c);
        View viewInflate = ((LayoutInflater) this.f43873c.getSystemService("layout_inflater")).inflate(jec0.f120475u, (ViewGroup) null, false);
        this.f43871a = viewInflate;
        this.f43874d.setContentView(viewInflate);
        this.f43874d.setSoftInputMode(21);
        this.f43874d.setInputMethodMode(1);
        this.f43872b = this.f43873c.findViewById(R.id.content);
        this.f43874d.setWidth(0);
        this.f43874d.setHeight(-1);
        this.f43871a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.wvh
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f190967a.m67085W();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m67060V(View view) {
        m67056H();
        m67057I(this.f43873c, this.f43884n);
        dismiss();
    }

    /* JADX INFO: renamed from: Y */
    private void m67061Y() {
        if (NullChecker.m82486a(this.f43881k)) {
            this.f43881k.mo156949b();
        }
    }

    /* JADX INFO: renamed from: Z */
    public static void m67062Z(Act act, Emotion emotion, String str) {
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
            FeedModule.f39704e.m159782V0(bubbleInfo, "");
        } else {
            ksg.m151222p(act, str, new y20() { // from class: l.fwh
                @Override // p153l.y20
                public final void call(Object obj) {
                    DialogC11520a.m67072y(bubbleInfo, (Detect) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a0 */
    private void m67063a0(int i) {
        if (!cmg.m111169A()) {
            VEditText vEditText = this.f43884n;
            if (i == 0) {
                if (TextUtils.isEmpty(vEditText.getText().toString())) {
                    if (NullChecker.m82486a(this.f43883m)) {
                        bnl0.m105524M(this.f43883m, true);
                    }
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f43884n.getLayoutParams();
                    layoutParams.width = -2;
                    this.f43884n.setLayoutParams(layoutParams);
                }
                this.f43884n.setMaxLines(4);
                this.f43882l.setGravity(1);
            } else {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) vEditText.getLayoutParams();
                layoutParams2.width = -1;
                this.f43884n.setLayoutParams(layoutParams2);
                if (NullChecker.m82486a(this.f43883m)) {
                    bnl0.m105524M(this.f43883m, false);
                }
                this.f43882l.setGravity(51);
                this.f43884n.setMaxLines(2);
            }
        }
        Animator animatorM132170p = gt0.m132170p(this.f43889s, "translationY", 0L, 150L, this.f43876f, -i);
        this.f43877g = animatorM132170p;
        animatorM132170p.start();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m67072y(BubbleInfo bubbleInfo, Detect detect) {
        if (detect == null) {
            FeedModule.f39704e.m159782V0(bubbleInfo, "");
        } else if (ksg.m151214l(detect, "p_state_post_guide")) {
            o1j0.m165649w(R$string.f39989s);
        } else {
            o1j0.m165649w(R$string.f39844W2);
        }
    }

    /* JADX INFO: renamed from: F */
    public final String m67074F() {
        if (TextUtils.equals("from_nearby_focus", this.f43891u)) {
            return "p_follow";
        }
        if (TextUtils.equals("from_nearby_falls_feed", this.f43891u)) {
            return OMSDialogPositon.p_nearby;
        }
        if (TextUtils.equals("from_like", this.f43891u)) {
            return "p_like";
        }
        if (TextUtils.equals("state_explore", this.f43891u)) {
            return "p_state_explore";
        }
        if (TextUtils.equals("from_discover_dating", this.f43891u)) {
            return "p_discover_dating";
        }
        return TextUtils.equals("from_discover_discussion", this.f43891u) ? "p_discover_discussion" : "";
    }

    /* JADX INFO: renamed from: J */
    public void m67075J(String str, final String str2, int i, y20<String> y20Var, final y20<String> y20Var2) {
        this.f43891u = str2;
        if ("from_nearby_focus".equals(str2)) {
            str2 = "follow";
        } else if ("from_nearby_falls_feed".equals(str2)) {
            str2 = "nearby";
        } else if ("from_like".equals(str2)) {
            str2 = "like";
        } else if ("state_explore".equals(str2)) {
            str2 = "state_explore";
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_state_post_guide", Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("state_post_guide_showfrom", str2));
        w1e.m204402f(l4g0VarM204399c);
        this.f43888r.setText(str);
        TextPaint paint = this.f43888r.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        this.f43890t.setOnTouchListener(new View.OnTouchListener() { // from class: l.vvh
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f185931a.m67078O(view, motionEvent);
            }
        });
        this.f43884n.setOnTouchListener(new View.OnTouchListener() { // from class: l.xvh
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f196400a.m67079P(view, motionEvent);
            }
        });
        this.f43884n.setFilters(new InputFilter[]{new b4h(30)});
        this.f43884n.addTextChangedListener(new a());
        this.f43885o.addItemDecoration(new c());
        final List<uzh> listM67054E = m67054E();
        FeedGalleryLayoutManager feedGalleryLayoutManager = new FeedGalleryLayoutManager(0);
        int iNextInt = new Random().nextInt(18) + TantanException.Client.AccountService.GENERAL_BAD_REQUEST;
        if (i != 0 && listM67054E.size() > 0) {
            iNextInt = ((listM67054E.size() * 3000) + i) - 1;
        }
        feedGalleryLayoutManager.m67027f(this.f43885o, iNextInt);
        feedGalleryLayoutManager.m67046z(new C11521b());
        final e1i e1iVar = new e1i(listM67054E, this.f43873c);
        this.f43885o.setAdapter(e1iVar);
        e1iVar.m118978G(new z20() { // from class: l.yvh
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f201720a.m67080Q((Integer) obj, (uzh) obj2);
            }
        });
        feedGalleryLayoutManager.m67045y(true);
        feedGalleryLayoutManager.m67026A(new FeedGalleryLayoutManager.InterfaceC11518e() { // from class: l.zvh
            @Override // com.p051p1.mobile.putong.feed.newui.status.share.FeedGalleryLayoutManager.InterfaceC11518e
            /* JADX INFO: renamed from: a */
            public final void mo67050a(RecyclerView recyclerView, View view, int i2) {
                this.f206218a.m67081R(e1iVar, listM67054E, recyclerView, view, i2);
            }
        });
        bnl0.m105509E0(this.f43887q, new View.OnClickListener() { // from class: l.awh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73734a.m67082S(view);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.bwh
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f78737a.m67083T(y20Var2, l4g0VarM204399c, str2, dialogInterface);
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.cwh
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f84123a.m67084U(dialogInterface);
            }
        });
        setCanceledOnTouchOutside(true);
        f43870x = false;
        i4g0.m138492A("e_set_my_state_post", "p_state_post_guide", pf60.m172085a("source_page", m67074F()));
        if (!TextUtils.equals(str2, "state_explore")) {
            owi.f149490i.put(Long.valueOf(pzi0.m174454o()));
        }
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call("");
        }
    }

    /* JADX INFO: renamed from: K */
    public void m67076K(String str, String str2, int i, y20<String> y20Var, y20<String> y20Var2, uul uulVar) {
        this.f43881k = uulVar;
        m67075J(str, str2, i, y20Var, y20Var2);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m67077N() {
        super.dismiss();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ boolean m67078O(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f43884n.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ boolean m67079P(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.f43884n.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m67080Q(Integer num, uzh uzhVar) {
        i4g0.m138523u("e_set_my_state_type", "p_state_post_guide", jyb.m147494Y("state_type_id", uzhVar.m198834b().f39596id));
        this.f43885o.smoothScrollToPosition(num.intValue());
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m67081R(e1i e1iVar, List list, RecyclerView recyclerView, View view, int i) {
        int iM118979z = i % e1iVar.m118979z();
        if (iM118979z < 0 || iM118979z >= list.size()) {
            return;
        }
        uzh uzhVar = (uzh) list.get(iM118979z);
        f43869w = uzhVar;
        this.f43886p.setText(uzhVar.m198836d());
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m67082S(View view) {
        i4g0.m138523u("e_set_my_state_post", "p_state_post_guide", pf60.m172085a("source_page", m67074F()));
        if (cmg.m111177E()) {
            uzh uzhVar = f43869w;
            if (uzhVar == null) {
                return;
            }
            m67062Z(this.f43873c, uzhVar.m198834b(), this.f43884n.getText().toString());
            m67057I(this.f43873c, this.f43884n);
            dismiss();
            return;
        }
        uzh uzhVar2 = f43869w;
        if (uzhVar2 == null) {
            return;
        }
        f43870x = true;
        Act act = this.f43873c;
        act.startActivity(FeedPostStatusAct.m66989s2(act, uzhVar2.m198834b()));
        this.f43873c.overridePendingTransition(0, 0);
        m67057I(this.f43873c, this.f43884n);
        dismiss();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m67083T(y20 y20Var, l4g0 l4g0Var, String str, DialogInterface dialogInterface) {
        FeedModule.m61406H().mo31748as(false);
        m67086X();
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call("");
        }
        w1e.m204401e(l4g0Var);
        if (f43870x) {
            if (TextUtils.equals(str, "state_explore")) {
                return;
            }
            owi.f149491j.put(0);
        } else {
            if (TextUtils.equals(str, "state_explore")) {
                return;
            }
            vxd0 vxd0Var = owi.f149491j;
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
            owi.f149492k.put(Long.valueOf(pzi0.m174454o()));
        }
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m67084U(DialogInterface dialogInterface) {
        FeedModule.m61406H().mo31748as(true);
        m67061Y();
        if (this.f43874d.isShowing() || this.f43872b.getWindowToken() == null) {
            return;
        }
        this.f43874d.setBackgroundDrawable(new ColorDrawable(0));
        this.f43874d.showAtLocation(this.f43872b, 0, 0, 0);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m67085W() {
        if (this.f43871a != null) {
            m67055G();
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m67086X() {
        if (NullChecker.m82486a(this.f43881k)) {
            this.f43881k.mo156950c();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        l51.m152888H(this.f43873c, new Runnable() { // from class: l.dwh
            @Override // java.lang.Runnable
            public final void run() {
                this.f91020a.m67077N();
            }
        }, 200L);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(vcc0.f183363E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f43880j = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f43880j.setBottomSheetCallback(this.f43892v);
    }
}
