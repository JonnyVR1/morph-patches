package p149l;

import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.AbstractC0616v;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.data.StickerInfo;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VEditText;
import p147v.VHandleBar;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class mkm implements s7m<dkm> {

    /* JADX INFO: renamed from: a */
    public VLinear f134336a;

    /* JADX INFO: renamed from: b */
    public CoordinatorLayout f134337b;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f134338c;

    /* JADX INFO: renamed from: d */
    public VHandleBar f134339d;

    /* JADX INFO: renamed from: e */
    public VText f134340e;

    /* JADX INFO: renamed from: f */
    public VRecyclerView f134341f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f134342g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f134343h;

    /* JADX INFO: renamed from: i */
    public View f134344i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f134345j;

    /* JADX INFO: renamed from: k */
    public VEditText f134346k;

    /* JADX INFO: renamed from: l */
    public TextView f134347l;

    /* JADX INFO: renamed from: m */
    public VLinear f134348m;

    /* JADX INFO: renamed from: n */
    public CommonEmptyView f134349n;

    /* JADX INFO: renamed from: o */
    public View f134350o;

    /* JADX INFO: renamed from: p */
    public dkm f134351p;

    /* JADX INFO: renamed from: q */
    public pjm f134352q;

    /* JADX INFO: renamed from: r */
    public ViewTreeObserver.OnGlobalLayoutListener f134353r;

    /* JADX INFO: renamed from: s */
    public Act f134354s;

    /* JADX INFO: renamed from: t */
    public String f134355t;

    /* JADX INFO: renamed from: u */
    public String f134356u;

    /* JADX INFO: renamed from: v */
    public BottomSheetBehavior<View> f134357v;

    /* JADX INFO: renamed from: l.mkm$b */
    public class ViewTreeObserverOnPreDrawListenerC18492b implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f134359a;

        public ViewTreeObserverOnPreDrawListenerC18492b(View view) {
            this.f134359a = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (mkm.this.f134357v == null || mkm.this.f134357v.getState() != 5) {
                return true;
            }
            mkm.this.f134357v.setState(4);
            this.f134359a.getViewTreeObserver().removeOnPreDrawListener(this);
            return false;
        }
    }

    public mkm(Act act) {
        this.f134354s = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m155019E(View view) {
        this.f134354s.alwaysHideInput();
        this.f134354s.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m155021b(View view) {
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m155029A(CharSequence charSequence) {
        Editable text = this.f134346k.getText();
        this.f134347l.setEnabled((text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ boolean m155031C(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            dkm dkmVar = this.f134351p;
            if (dkmVar.f86679l) {
                lsi0.m151578h(R$string.f39042d3);
                return false;
            }
            if (!dkmVar.f86680m && TextUtils.isEmpty(this.f134346k.getText())) {
                m155049n();
            }
        }
        return false;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getAct();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m155032F() {
        this.f134341f.scrollToPosition(this.f134352q.m169911k0(this.f134351p.f86674g));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m155033G(View view) {
        this.f134351p.m112258W0(this.f134346k.getText().toString(), this.f134346k.getText().toString().trim(), new d30() { // from class: l.lkm
            @Override // p149l.d30
            public final void call() {
                this.f128592a.m155032F();
            }
        });
        this.f134354s.hideInput();
        this.f134346k.setText((CharSequence) null);
    }

    /* JADX INFO: renamed from: H */
    public void m155034H(boolean z, int i) {
        ConstraintLayout constraintLayout = this.f134338c;
        if (z) {
            constraintLayout.setPadding(0, 0, 0, i);
        } else {
            constraintLayout.setPadding(0, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m155035I(List<MomentMessage> list) {
        dkm dkmVar = this.f134351p;
        if (dkmVar.f86679l) {
            this.f134352q.mo111805d0(new ArrayList());
            this.f134340e.setText("评论 0");
            return;
        }
        boolean zM81303a = NullChecker.m81303a(dkmVar.f86670c);
        VText vText = this.f134340e;
        if (zM81303a) {
            vText.setText("评论 " + this.f134351p.f86670c.messages.count);
        } else {
            vText.setText("评论 0");
        }
        this.f134352q.mo111805d0(list);
    }

    /* JADX INFO: renamed from: J */
    public void m155036J(List<MomentMessage> list, List<StickerInfo> list2) {
        if (!vwb.m200296J(list2)) {
            this.f134352q.f86235d.clear();
            this.f134352q.f86235d.addAll(list2);
        }
        m155035I(list);
    }

    /* JADX INFO: renamed from: K */
    public void m155037K(Links links) {
        this.f134352q.f149837m = links;
    }

    /* JADX INFO: renamed from: L */
    public void m155038L(Moment moment) {
        this.f134352q.f149840p = moment;
    }

    /* JADX INFO: renamed from: M */
    public void m155039M(MomentMessage momentMessage) {
        this.f134352q.mo111806e0(momentMessage);
    }

    /* JADX INFO: renamed from: N */
    public void m155040N() {
        this.f134352q.f149840p = this.f134351p.m112267u0();
        this.f134352q.notifyItemChanged(0);
    }

    /* JADX INFO: renamed from: O */
    public boolean m155041O(xaj0<Moment, j760<List<StickerInfo>, List<MomentMessage>>, j760<Music, RawFeed>> xaj0Var) {
        if (xaj0Var.f191751a == null) {
            this.f134354s.lambda$debugItems$19();
            return false;
        }
        xdl0.m208345M0(this.f134342g, true);
        xdl0.m208345M0(this.f134341f, true);
        xdl0.m208345M0(this.f134349n, false);
        return true;
    }

    /* JADX INFO: renamed from: P */
    public void m155042P(Throwable th) {
        if (xdl0.m208349O0(this.f134349n)) {
            return;
        }
        xdl0.m208345M0(this.f134342g, false);
        if (((th instanceof ApiExcep.Client.Forbidden) || (th instanceof ApiExcep.Client.NotFound)) && !vqg.m199536b0(FeedModule.f38855d.m209447e8(this.f134351p.m112267u0().owner))) {
            xdl0.m208345M0(this.f134349n, true);
            xdl0.m208345M0(this.f134341f, false);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m155043Q(boolean z) {
        xdl0.m208345M0(this.f134350o, z);
    }

    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final void m155030B() {
        dkm dkmVar = this.f134351p;
        if (dkmVar.f86670c == null) {
            return;
        }
        if (dkmVar.f86680m) {
            this.f134342g.setVisibility(0);
            return;
        }
        if (this.f134349n.getVisibility() == 0) {
            this.f134342g.setVisibility(4);
            return;
        }
        if (vqg.m199536b0(FeedModule.m60222H().getUserById(this.f134351p.m112267u0().owner))) {
            this.f134342g.setVisibility(4);
            return;
        }
        boolean globalVisibleRect = this.f134341f.getGlobalVisibleRect(new Rect());
        LinearLayout linearLayout = this.f134342g;
        if (globalVisibleRect) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m155045S(MomentMessage momentMessage, String str) {
        m155046T(momentMessage, str);
    }

    /* JADX INFO: renamed from: T */
    public final void m155046T(MomentMessage momentMessage, String str) {
        xdl0.m208320A(this.f134346k);
        this.f134354s.showInput(this.f134346k, 0);
        this.f134346k.setHint(this.f134351p.m112259Y0(momentMessage, str));
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f134354s;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM155047l = m155047l(layoutInflater, viewGroup);
        if (TextUtils.isEmpty(this.f134356u)) {
            boolean zEquals = "feed".equals(this.f134355t);
            VEditText vEditText = this.f134346k;
            if (zEquals) {
                vEditText.setHint("友善评论，说点好听的...");
            } else {
                vEditText.setHint(this.f134354s.getString(R$string.f38879D));
            }
        } else {
            this.f134346k.setHint(this.f134356u);
        }
        this.f134346k.setOnTouchListener(new View.OnTouchListener() { // from class: l.ekm
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f91995a.m155031C(view, motionEvent);
            }
        });
        this.f134357v = BottomSheetBehavior.from(this.f134338c);
        if (nkg.m159859P()) {
            m155055w(viewM155047l);
        }
        this.f134357v.addBottomSheetCallback(new C18491a());
        int i = (int) (t100.m186889c().heightPixels * 0.8f);
        this.f134357v.setPeekHeight(i);
        ViewGroup.LayoutParams layoutParams = this.f134338c.getLayoutParams();
        layoutParams.height = i;
        this.f134338c.setLayoutParams(layoutParams);
        xdl0.m208329E0(this.f134337b, new View.OnClickListener() { // from class: l.fkm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98082a.m155019E(view);
            }
        });
        this.f134343h.setOnClickListener(new View.OnClickListener() { // from class: l.gkm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mkm.m155021b(view);
            }
        });
        m155054v();
        return getAct().setUpKeyboardDetectorLayout(viewM155047l, new View(getAct()), new f30() { // from class: l.hkm
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f108256a.m155034H(((Boolean) obj).booleanValue(), ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public View m155047l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nkm.m159981b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(dkm dkmVar) {
        this.f134351p = dkmVar;
    }

    /* JADX INFO: renamed from: n */
    public final void m155049n() {
        dkm dkmVar = this.f134351p;
        dkmVar.f86676i = "";
        dkmVar.f86675h = null;
        dkmVar.f86674g = null;
    }

    /* JADX INFO: renamed from: p */
    public void m155050p() {
        this.f134342g.setVisibility(4);
        if (NullChecker.m81304b(this.f134346k)) {
            this.f134354s.duringCreated(this.f134346k.mo28618i(true)).subscribe(mkd0.m154955G(new e30() { // from class: l.ikm
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f113690a.m155029A((CharSequence) obj);
                }
            }));
        }
        this.f134349n.f40821b.setText(this.f134354s.getString(R$string.f39050e4));
        this.f134349n.f40820a.setImageResource(f3c0.f94535h6);
        if (this.f134353r == null) {
            this.f134353r = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.jkm
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    this.f118397a.m155030B();
                }
            };
            this.f134342g.getViewTreeObserver().addOnGlobalLayoutListener(this.f134353r);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m155051q() {
        this.f134347l.setOnClickListener(null);
        this.f134346k.setOnTouchListener(null);
        this.f134342g.getViewTreeObserver().removeOnGlobalLayoutListener(this.f134353r);
        this.f134353r = null;
    }

    /* JADX INFO: renamed from: s */
    public void m155052s(MomentMessage momentMessage) {
        List<MomentMessage> list = this.f134352q.f86236e.get(momentMessage.commentInfo.parentMessageId);
        if (NullChecker.m81303a(list) && list.contains(momentMessage)) {
            list.remove(momentMessage);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m155053u(hx60 hx60Var) {
        dkm dkmVar = this.f134351p;
        pjm pjmVar = new pjm(dkmVar.f86679l, this.f134354s, hx60Var, dkmVar.f86670c, dkmVar.f86678k, dkmVar, this.f134355t);
        this.f134352q = pjmVar;
        this.f134341f.setAdapter(pjmVar);
        if (this.f134351p.f86679l) {
            this.f134352q.mo111805d0(new ArrayList());
        }
    }

    /* JADX INFO: renamed from: v */
    public void m155054v() {
        this.f134341f.getItemAnimator().setAddDuration(0L);
        this.f134341f.getItemAnimator().setChangeDuration(0L);
        this.f134341f.getItemAnimator().setMoveDuration(0L);
        this.f134341f.getItemAnimator().setRemoveDuration(0L);
        ((AbstractC0616v) this.f134341f.getItemAnimator()).setSupportsChangeAnimations(false);
    }

    /* JADX INFO: renamed from: w */
    public final void m155055w(View view) {
        this.f134357v.setState(5);
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC18492b(view));
    }

    /* JADX INFO: renamed from: x */
    public void m155056x() {
        this.f134347l.setOnClickListener(new View.OnClickListener() { // from class: l.kkm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123572a.m155033G(view);
            }
        });
        this.f134351p.m112269z0();
    }

    /* JADX INFO: renamed from: y */
    public void m155057y() {
        m155058z();
    }

    /* JADX INFO: renamed from: z */
    public final void m155058z() {
        this.f134346k.requestFocus();
        this.f134354s.showInput(this.f134346k, 0);
        if (TextUtils.isEmpty(this.f134346k.getText().toString().trim())) {
            dkm dkmVar = this.f134351p;
            dkmVar.f86676i = "";
            dkmVar.f86675h = null;
            dkmVar.f86674g = null;
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.mkm$a */
    public class C18491a extends BottomSheetBehavior.BottomSheetCallback {
        public C18491a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull @NotNull View view, int i) {
            if (i == 5) {
                mkm.this.f134354s.alwaysHideInput();
                mkm.this.f134354s.lambda$debugItems$19();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull @NotNull View view, float f) {
        }
    }
}
