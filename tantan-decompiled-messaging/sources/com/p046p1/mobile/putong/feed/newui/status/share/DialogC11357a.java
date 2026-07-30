package com.p046p1.mobile.putong.feed.newui.status.share;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Detect;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.TextTheme;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.StateEmotion;
import com.p046p1.mobile.putong.feed.newui.status.display.view.FeedSmoothSpeedRecycle;
import com.p046p1.mobile.putong.feed.newui.status.post.FeedPostStatusAct;
import com.p046p1.mobile.putong.feed.newui.status.share.DialogC11357a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VLinear;
import p147v.VText;
import p149l.b5c0;
import p149l.bt0;
import p149l.cwf0;
import p149l.e30;
import p149l.e51;
import p149l.e6c0;
import p149l.f30;
import p149l.fyh;
import p149l.gsl;
import p149l.i0e;
import p149l.j760;
import p149l.jig;
import p149l.lsi0;
import p149l.m2h;
import p149l.mqi0;
import p149l.nkg;
import p149l.o6c0;
import p149l.p4c0;
import p149l.pzh;
import p149l.sti;
import p149l.tpd0;
import p149l.vqg;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.a */
/* JADX INFO: loaded from: classes12.dex */
public class DialogC11357a extends BottomSheetDialog {

    /* JADX INFO: renamed from: w */
    public static fyh f43021w = null;

    /* JADX INFO: renamed from: x */
    public static boolean f43022x = false;

    /* JADX INFO: renamed from: a */
    public View f43023a;

    /* JADX INFO: renamed from: b */
    public View f43024b;

    /* JADX INFO: renamed from: c */
    public Act f43025c;

    /* JADX INFO: renamed from: d */
    public PopupWindow f43026d;

    /* JADX INFO: renamed from: e */
    public boolean f43027e;

    /* JADX INFO: renamed from: f */
    public Interpolator f43028f;

    /* JADX INFO: renamed from: g */
    public Animator f43029g;

    /* JADX INFO: renamed from: h */
    public int f43030h;

    /* JADX INFO: renamed from: i */
    public int f43031i;

    /* JADX INFO: renamed from: j */
    public BottomSheetBehavior f43032j;

    /* JADX INFO: renamed from: k */
    public gsl f43033k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f43034l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f43035m;

    /* JADX INFO: renamed from: n */
    public VEditText f43036n;

    /* JADX INFO: renamed from: o */
    public FeedSmoothSpeedRecycle f43037o;

    /* JADX INFO: renamed from: p */
    public TextView f43038p;

    /* JADX INFO: renamed from: q */
    public TextView f43039q;

    /* JADX INFO: renamed from: r */
    public VText f43040r;

    /* JADX INFO: renamed from: s */
    public FrameLayout f43041s;

    /* JADX INFO: renamed from: t */
    public VLinear f43042t;

    /* JADX INFO: renamed from: u */
    public String f43043u;

    /* JADX INFO: renamed from: v */
    public BottomSheetBehavior.BottomSheetCallback f43044v;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.a$a */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (DialogC11357a.this.f43036n.getLineCount() > 3) {
                String string = editable.toString();
                int selectionStart = DialogC11357a.this.f43036n.getSelectionStart();
                DialogC11357a.this.f43036n.setText((selectionStart != DialogC11357a.this.f43036n.getSelectionEnd() || selectionStart >= string.length() || selectionStart < 1) ? string.substring(0, editable.length() - 1) : string.substring(0, selectionStart - 1).concat(string.substring(selectionStart)));
                DialogC11357a.this.f43036n.setSelection(DialogC11357a.this.f43036n.getText().length());
                e51.m114742G(new Runnable() { // from class: l.ruh
                    @Override // java.lang.Runnable
                    public final void run() {
                        lsi0.m151580j("最多输入3行");
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
                DialogC11357a.this.f43032j.setState(3);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.a$c */
    public static class c extends RecyclerView.AbstractC0576n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
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

    public DialogC11357a(@NonNull Context context, int i) {
        super(context, i);
        this.f43027e = false;
        this.f43028f = new jig();
        this.f43029g = null;
        this.f43044v = new b();
        m65875L(context);
    }

    /* JADX INFO: renamed from: E */
    public static List<fyh> m65871E() {
        ArrayList arrayList = new ArrayList();
        for (StateEmotion stateEmotion : JSON.parseArray(sti.f166363g.get(), StateEmotion.class)) {
            Iterator<Emotion> it = stateEmotion.emotions.iterator();
            while (it.hasNext()) {
                arrayList.add(new fyh(false, it.next(), stateEmotion.categoryName));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: G */
    private void m65872G() {
        Rect rect = new Rect();
        this.f43023a.getWindowVisibleDisplayFrame(rect);
        if (this.f43030h == 0) {
            this.f43030h = rect.bottom;
        }
        if (this.f43031i == 0) {
            this.f43031i = rect.bottom;
        }
        int i = rect.bottom;
        if (i > this.f43031i && i != this.f43030h) {
            m65873H();
            this.f43031i = this.f43030h;
        }
        int i2 = this.f43031i - rect.bottom;
        if (i2 <= 0) {
            if (i2 < 0) {
                m65873H();
                this.f43031i = rect.bottom;
                return;
            }
            return;
        }
        if (this.f43027e && NullChecker.m81303a(this.f43029g)) {
            this.f43029g.cancel();
        }
        this.f43027e = true;
        m65880a0(i2);
        this.f43031i = rect.bottom;
    }

    /* JADX INFO: renamed from: H */
    private void m65873H() {
        if (!this.f43027e && NullChecker.m81303a(this.f43029g)) {
            this.f43029g.cancel();
        }
        this.f43027e = false;
        m65880a0(0);
    }

    /* JADX INFO: renamed from: I */
    public static void m65874I(Act act, View view) {
        ((InputMethodManager) act.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: L */
    private void m65875L(Context context) {
        this.f43025c = (Act) context;
        View viewInflate = LayoutInflater.from(context).inflate(o6c0.f142233l3, (ViewGroup) null);
        if (nkg.m159840A()) {
            viewInflate = LayoutInflater.from(context).inflate(o6c0.f142240m3, (ViewGroup) null);
        }
        setContentView(viewInflate);
        this.f43034l = (LinearLayout) viewInflate.findViewById(b5c0.f73622x0);
        if (!nkg.m159840A()) {
            this.f43035m = (VDraweeView) viewInflate.findViewById(b5c0.f73529W);
        }
        this.f43036n = (VEditText) viewInflate.findViewById(b5c0.f73616v0);
        this.f43041s = (FrameLayout) viewInflate.findViewById(b5c0.f73471C1);
        this.f43037o = (FeedSmoothSpeedRecycle) viewInflate.findViewById(b5c0.f73492J1);
        this.f43038p = (TextView) viewInflate.findViewById(b5c0.f73551c1);
        this.f43039q = (TextView) viewInflate.findViewById(b5c0.f73617v1);
        this.f43040r = (VText) viewInflate.findViewById(b5c0.f73525U1);
        this.f43042t = (VLinear) viewInflate.findViewById(b5c0.f73496L);
        xdl0.m208344M(this.f43034l, nkg.m159848E());
        TextPaint paint = this.f43040r.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        viewInflate.findViewById(b5c0.f73486H1).setOnClickListener(new View.OnClickListener() { // from class: l.puh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151293a.m65877V(view);
            }
        });
        m65876M();
    }

    /* JADX INFO: renamed from: M */
    private void m65876M() {
        this.f43026d = new PopupWindow(this.f43025c);
        View viewInflate = ((LayoutInflater) this.f43025c.getSystemService("layout_inflater")).inflate(e6c0.f89562u, (ViewGroup) null, false);
        this.f43023a = viewInflate;
        this.f43026d.setContentView(viewInflate);
        this.f43026d.setSoftInputMode(21);
        this.f43026d.setInputMethodMode(1);
        this.f43024b = this.f43025c.findViewById(R.id.content);
        this.f43026d.setWidth(0);
        this.f43026d.setHeight(-1);
        this.f43023a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.huh
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f109567a.m65902W();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m65877V(View view) {
        m65873H();
        m65874I(this.f43025c, this.f43036n);
        dismiss();
    }

    /* JADX INFO: renamed from: Y */
    private void m65878Y() {
        if (NullChecker.m81303a(this.f43033k)) {
            this.f43033k.mo127806b();
        }
    }

    /* JADX INFO: renamed from: Z */
    public static void m65879Z(Act act, Emotion emotion, String str) {
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
            FeedModule.f38856e.m132649V0(bubbleInfo, "");
        } else {
            vqg.m199563p(act, str, new e30() { // from class: l.quh
                @Override // p149l.e30
                public final void call(Object obj) {
                    DialogC11357a.m65889y(bubbleInfo, (Detect) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a0 */
    private void m65880a0(int i) {
        if (!nkg.m159840A()) {
            VEditText vEditText = this.f43036n;
            if (i == 0) {
                if (TextUtils.isEmpty(vEditText.getText().toString())) {
                    if (NullChecker.m81303a(this.f43035m)) {
                        xdl0.m208344M(this.f43035m, true);
                    }
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f43036n.getLayoutParams();
                    layoutParams.width = -2;
                    this.f43036n.setLayoutParams(layoutParams);
                }
                this.f43036n.setMaxLines(4);
                this.f43034l.setGravity(1);
            } else {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) vEditText.getLayoutParams();
                layoutParams2.width = -1;
                this.f43036n.setLayoutParams(layoutParams2);
                if (NullChecker.m81303a(this.f43035m)) {
                    xdl0.m208344M(this.f43035m, false);
                }
                this.f43034l.setGravity(51);
                this.f43036n.setMaxLines(2);
            }
        }
        Animator animatorM103743p = bt0.m103743p(this.f43041s, "translationY", 0L, 150L, this.f43028f, -i);
        this.f43029g = animatorM103743p;
        animatorM103743p.start();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m65889y(BubbleInfo bubbleInfo, Detect detect) {
        if (detect == null) {
            FeedModule.f38856e.m132649V0(bubbleInfo, "");
        } else if (vqg.m199555l(detect, "p_state_post_guide")) {
            lsi0.m151593w(R$string.f39141s);
        } else {
            lsi0.m151593w(R$string.f38996W2);
        }
    }

    /* JADX INFO: renamed from: F */
    public final String m65891F() {
        if (TextUtils.equals("from_nearby_focus", this.f43043u)) {
            return "p_follow";
        }
        if (TextUtils.equals("from_nearby_falls_feed", this.f43043u)) {
            return OMSDialogPositon.p_nearby;
        }
        if (TextUtils.equals("from_like", this.f43043u)) {
            return "p_like";
        }
        if (TextUtils.equals("state_explore", this.f43043u)) {
            return "p_state_explore";
        }
        if (TextUtils.equals("from_discover_dating", this.f43043u)) {
            return "p_discover_dating";
        }
        return TextUtils.equals("from_discover_discussion", this.f43043u) ? "p_discover_discussion" : "";
    }

    /* JADX INFO: renamed from: J */
    public void m65892J(String str, final String str2, int i, e30<String> e30Var, final e30<String> e30Var2) {
        this.f43043u = str2;
        if ("from_nearby_focus".equals(str2)) {
            str2 = "follow";
        } else if ("from_nearby_falls_feed".equals(str2)) {
            str2 = "nearby";
        } else if ("from_like".equals(str2)) {
            str2 = "like";
        } else if ("state_explore".equals(str2)) {
            str2 = "state_explore";
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_state_post_guide", Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("state_post_guide_showfrom", str2));
        i0e.m133797f(cwf0VarM133794c);
        this.f43040r.setText(str);
        TextPaint paint = this.f43040r.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        this.f43042t.setOnTouchListener(new View.OnTouchListener() { // from class: l.guh
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f104396a.m65895O(view, motionEvent);
            }
        });
        this.f43036n.setOnTouchListener(new View.OnTouchListener() { // from class: l.iuh
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f115026a.m65896P(view, motionEvent);
            }
        });
        this.f43036n.setFilters(new InputFilter[]{new m2h(30)});
        this.f43036n.addTextChangedListener(new a());
        this.f43037o.addItemDecoration(new c());
        final List<fyh> listM65871E = m65871E();
        FeedGalleryLayoutManager feedGalleryLayoutManager = new FeedGalleryLayoutManager(0);
        int iNextInt = new Random().nextInt(18) + TantanException.Client.AccountService.GENERAL_BAD_REQUEST;
        if (i != 0 && listM65871E.size() > 0) {
            iNextInt = ((listM65871E.size() * 3000) + i) - 1;
        }
        feedGalleryLayoutManager.m65844f(this.f43037o, iNextInt);
        feedGalleryLayoutManager.m65863z(new C11358b());
        final pzh pzhVar = new pzh(listM65871E, this.f43025c);
        this.f43037o.setAdapter(pzhVar);
        pzhVar.m172233G(new f30() { // from class: l.juh
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f119791a.m65897Q((Integer) obj, (fyh) obj2);
            }
        });
        feedGalleryLayoutManager.m65862y(true);
        feedGalleryLayoutManager.m65843A(new FeedGalleryLayoutManager.InterfaceC11355e() { // from class: l.kuh
            @Override // com.p046p1.mobile.putong.feed.newui.status.share.FeedGalleryLayoutManager.InterfaceC11355e
            /* JADX INFO: renamed from: a */
            public final void mo65867a(RecyclerView recyclerView, View view, int i2) {
                this.f124690a.m65898R(pzhVar, listM65871E, recyclerView, view, i2);
            }
        });
        xdl0.m208329E0(this.f43039q, new View.OnClickListener() { // from class: l.luh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130061a.m65899S(view);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.muh
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f135789a.m65900T(e30Var2, cwf0VarM133794c, str2, dialogInterface);
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.nuh
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f140626a.m65901U(dialogInterface);
            }
        });
        setCanceledOnTouchOutside(true);
        f43022x = false;
        zvf0.m220368A("e_set_my_state_post", "p_state_post_guide", j760.m140076a("source_page", m65891F()));
        if (!TextUtils.equals(str2, "state_explore")) {
            sti.f166365i.put(Long.valueOf(mqi0.m155944o()));
        }
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call("");
        }
    }

    /* JADX INFO: renamed from: K */
    public void m65893K(String str, String str2, int i, e30<String> e30Var, e30<String> e30Var2, gsl gslVar) {
        this.f43033k = gslVar;
        m65892J(str, str2, i, e30Var, e30Var2);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m65894N() {
        super.dismiss();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ boolean m65895O(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f43036n.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ boolean m65896P(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.f43036n.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m65897Q(Integer num, fyh fyhVar) {
        zvf0.m220399u("e_set_my_state_type", "p_state_post_guide", vwb.m200311Y("state_type_id", fyhVar.m123767b().f38748id));
        this.f43037o.smoothScrollToPosition(num.intValue());
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m65898R(pzh pzhVar, List list, RecyclerView recyclerView, View view, int i) {
        int iM172234z = i % pzhVar.m172234z();
        if (iM172234z < 0 || iM172234z >= list.size()) {
            return;
        }
        fyh fyhVar = (fyh) list.get(iM172234z);
        f43021w = fyhVar;
        this.f43038p.setText(fyhVar.m123769d());
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m65899S(View view) {
        zvf0.m220399u("e_set_my_state_post", "p_state_post_guide", j760.m140076a("source_page", m65891F()));
        if (nkg.m159848E()) {
            fyh fyhVar = f43021w;
            if (fyhVar == null) {
                return;
            }
            m65879Z(this.f43025c, fyhVar.m123767b(), this.f43036n.getText().toString());
            m65874I(this.f43025c, this.f43036n);
            dismiss();
            return;
        }
        fyh fyhVar2 = f43021w;
        if (fyhVar2 == null) {
            return;
        }
        f43022x = true;
        Act act = this.f43025c;
        act.startActivity(FeedPostStatusAct.m65806r2(act, fyhVar2.m123767b()));
        this.f43025c.overridePendingTransition(0, 0);
        m65874I(this.f43025c, this.f43036n);
        dismiss();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m65900T(e30 e30Var, cwf0 cwf0Var, String str, DialogInterface dialogInterface) {
        FeedModule.m60222H().mo30745as(false);
        m65903X();
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call("");
        }
        i0e.m133796e(cwf0Var);
        if (f43022x) {
            if (TextUtils.equals(str, "state_explore")) {
                return;
            }
            sti.f166366j.put(0);
        } else {
            if (TextUtils.equals(str, "state_explore")) {
                return;
            }
            tpd0 tpd0Var = sti.f166366j;
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
            sti.f166367k.put(Long.valueOf(mqi0.m155944o()));
        }
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m65901U(DialogInterface dialogInterface) {
        FeedModule.m60222H().mo30745as(true);
        m65878Y();
        if (this.f43026d.isShowing() || this.f43024b.getWindowToken() == null) {
            return;
        }
        this.f43026d.setBackgroundDrawable(new ColorDrawable(0));
        this.f43026d.showAtLocation(this.f43024b, 0, 0, 0);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m65902W() {
        if (this.f43023a != null) {
            m65872G();
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m65903X() {
        if (NullChecker.m81303a(this.f43033k)) {
            this.f43033k.mo127807c();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        e51.m114743H(this.f43025c, new Runnable() { // from class: l.ouh
            @Override // java.lang.Runnable
            public final void run() {
                this.f145696a.m65894N();
            }
        }, 200L);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.f147063E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f43032j = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f43032j.setBottomSheetCallback(this.f43044v);
    }
}
