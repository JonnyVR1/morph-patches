package p153l;

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
import androidx.recyclerview.widget.AbstractC0618v;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.data.StickerInfo;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VEditText;
import p151v.VHandleBar;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class omm implements iam<fmm> {

    /* JADX INFO: renamed from: a */
    public VLinear f147953a;

    /* JADX INFO: renamed from: b */
    public CoordinatorLayout f147954b;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f147955c;

    /* JADX INFO: renamed from: d */
    public VHandleBar f147956d;

    /* JADX INFO: renamed from: e */
    public VText f147957e;

    /* JADX INFO: renamed from: f */
    public VRecyclerView f147958f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f147959g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f147960h;

    /* JADX INFO: renamed from: i */
    public View f147961i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f147962j;

    /* JADX INFO: renamed from: k */
    public VEditText f147963k;

    /* JADX INFO: renamed from: l */
    public TextView f147964l;

    /* JADX INFO: renamed from: m */
    public VLinear f147965m;

    /* JADX INFO: renamed from: n */
    public CommonEmptyView f147966n;

    /* JADX INFO: renamed from: o */
    public View f147967o;

    /* JADX INFO: renamed from: p */
    public fmm f147968p;

    /* JADX INFO: renamed from: q */
    public rlm f147969q;

    /* JADX INFO: renamed from: r */
    public ViewTreeObserver.OnGlobalLayoutListener f147970r;

    /* JADX INFO: renamed from: s */
    public Act f147971s;

    /* JADX INFO: renamed from: t */
    public String f147972t;

    /* JADX INFO: renamed from: u */
    public String f147973u;

    /* JADX INFO: renamed from: v */
    public BottomSheetBehavior<View> f147974v;

    /* JADX INFO: renamed from: l.omm$b */
    public class ViewTreeObserverOnPreDrawListenerC19166b implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f147976a;

        public ViewTreeObserverOnPreDrawListenerC19166b(View view) {
            this.f147976a = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (omm.this.f147974v == null || omm.this.f147974v.getState() != 5) {
                return true;
            }
            omm.this.f147974v.setState(4);
            this.f147976a.getViewTreeObserver().removeOnPreDrawListener(this);
            return false;
        }
    }

    public omm(Act act) {
        this.f147971s = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m168236E(View view) {
        this.f147971s.alwaysHideInput();
        this.f147971s.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m168238b(View view) {
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m168246A(CharSequence charSequence) {
        Editable text = this.f147963k.getText();
        this.f147964l.setEnabled((text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ boolean m168248C(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            fmm fmmVar = this.f147968p;
            if (fmmVar.f99808l) {
                o1j0.m165634h(R$string.f39890d3);
                return false;
            }
            if (!fmmVar.f99809m && TextUtils.isEmpty(this.f147963k.getText())) {
                m168266n();
            }
        }
        return false;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getAct();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m168249F() {
        this.f147958f.scrollToPosition(this.f147969q.m182020k0(this.f147968p.f99803g));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m168250G(View view) {
        this.f147968p.m126306W0(this.f147963k.getText().toString(), this.f147963k.getText().toString().trim(), new x20() { // from class: l.nmm
            @Override // p153l.x20
            public final void call() {
                this.f142728a.m168249F();
            }
        });
        this.f147971s.hideInput();
        this.f147963k.setText((CharSequence) null);
    }

    /* JADX INFO: renamed from: H */
    public void m168251H(boolean z, int i) {
        ConstraintLayout constraintLayout = this.f147955c;
        if (z) {
            constraintLayout.setPadding(0, 0, 0, i);
        } else {
            constraintLayout.setPadding(0, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m168252I(List<MomentMessage> list) {
        fmm fmmVar = this.f147968p;
        if (fmmVar.f99808l) {
            this.f147969q.mo115865d0(new ArrayList());
            this.f147957e.setText("评论 0");
            return;
        }
        boolean zM82486a = NullChecker.m82486a(fmmVar.f99799c);
        VText vText = this.f147957e;
        if (zM82486a) {
            vText.setText("评论 " + this.f147968p.f99799c.messages.count);
        } else {
            vText.setText("评论 0");
        }
        this.f147969q.mo115865d0(list);
    }

    /* JADX INFO: renamed from: J */
    public void m168253J(List<MomentMessage> list, List<StickerInfo> list2) {
        if (!jyb.m147479J(list2)) {
            this.f147969q.f88579d.clear();
            this.f147969q.f88579d.addAll(list2);
        }
        m168252I(list);
    }

    /* JADX INFO: renamed from: K */
    public void m168254K(Links links) {
        this.f147969q.f163767m = links;
    }

    /* JADX INFO: renamed from: L */
    public void m168255L(Moment moment) {
        this.f147969q.f163770p = moment;
    }

    /* JADX INFO: renamed from: M */
    public void m168256M(MomentMessage momentMessage) {
        this.f147969q.mo115866e0(momentMessage);
    }

    /* JADX INFO: renamed from: N */
    public void m168257N() {
        this.f147969q.f163770p = this.f147968p.m126315u0();
        this.f147969q.notifyItemChanged(0);
    }

    /* JADX INFO: renamed from: O */
    public boolean m168258O(bkj0<Moment, pf60<List<StickerInfo>, List<MomentMessage>>, pf60<Music, RawFeed>> bkj0Var) {
        if (bkj0Var.f77081a == null) {
            this.f147971s.lambda$debugItems$19();
            return false;
        }
        bnl0.m105525M0(this.f147959g, true);
        bnl0.m105525M0(this.f147958f, true);
        bnl0.m105525M0(this.f147966n, false);
        return true;
    }

    /* JADX INFO: renamed from: P */
    public void m168259P(Throwable th) {
        if (bnl0.m105529O0(this.f147966n)) {
            return;
        }
        bnl0.m105525M0(this.f147959g, false);
        if (((th instanceof ApiExcep.Client.Forbidden) || (th instanceof ApiExcep.Client.NotFound)) && !ksg.m151195b0(FeedModule.f39703d.m145688e8(this.f147968p.m126315u0().owner))) {
            bnl0.m105525M0(this.f147966n, true);
            bnl0.m105525M0(this.f147958f, false);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m168260Q(boolean z) {
        bnl0.m105525M0(this.f147967o, z);
    }

    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final void m168247B() {
        fmm fmmVar = this.f147968p;
        if (fmmVar.f99799c == null) {
            return;
        }
        if (fmmVar.f99809m) {
            this.f147959g.setVisibility(0);
            return;
        }
        if (this.f147966n.getVisibility() == 0) {
            this.f147959g.setVisibility(4);
            return;
        }
        if (ksg.m151195b0(FeedModule.m61406H().getUserById(this.f147968p.m126315u0().owner))) {
            this.f147959g.setVisibility(4);
            return;
        }
        boolean globalVisibleRect = this.f147958f.getGlobalVisibleRect(new Rect());
        LinearLayout linearLayout = this.f147959g;
        if (globalVisibleRect) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m168262S(MomentMessage momentMessage, String str) {
        m168263T(momentMessage, str);
    }

    /* JADX INFO: renamed from: T */
    public final void m168263T(MomentMessage momentMessage, String str) {
        bnl0.m105500A(this.f147963k);
        this.f147971s.showInput(this.f147963k, 0);
        this.f147963k.setHint(this.f147968p.m126307Y0(momentMessage, str));
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f147971s;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM168264l = m168264l(layoutInflater, viewGroup);
        if (TextUtils.isEmpty(this.f147973u)) {
            boolean zEquals = "feed".equals(this.f147972t);
            VEditText vEditText = this.f147963k;
            if (zEquals) {
                vEditText.setHint("友善评论，说点好听的...");
            } else {
                vEditText.setHint(this.f147971s.getString(R$string.f39727D));
            }
        } else {
            this.f147963k.setHint(this.f147973u);
        }
        this.f147963k.setOnTouchListener(new View.OnTouchListener() { // from class: l.gmm
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f105016a.m168248C(view, motionEvent);
            }
        });
        this.f147974v = BottomSheetBehavior.from(this.f147955c);
        if (cmg.m111188P()) {
            m168272w(viewM168264l);
        }
        this.f147974v.addBottomSheetCallback(new C19165a());
        int i = (int) (qa00.m175858c().heightPixels * 0.8f);
        this.f147974v.setPeekHeight(i);
        ViewGroup.LayoutParams layoutParams = this.f147955c.getLayoutParams();
        layoutParams.height = i;
        this.f147955c.setLayoutParams(layoutParams);
        bnl0.m105509E0(this.f147954b, new View.OnClickListener() { // from class: l.hmm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110644a.m168236E(view);
            }
        });
        this.f147960h.setOnClickListener(new View.OnClickListener() { // from class: l.imm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                omm.m168238b(view);
            }
        });
        m168271v();
        return getAct().setUpKeyboardDetectorLayout(viewM168264l, new View(getAct()), new z20() { // from class: l.jmm
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f121688a.m168251H(((Boolean) obj).booleanValue(), ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public View m168264l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pmm.m172957b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(fmm fmmVar) {
        this.f147968p = fmmVar;
    }

    /* JADX INFO: renamed from: n */
    public final void m168266n() {
        fmm fmmVar = this.f147968p;
        fmmVar.f99805i = "";
        fmmVar.f99804h = null;
        fmmVar.f99803g = null;
    }

    /* JADX INFO: renamed from: p */
    public void m168267p() {
        this.f147959g.setVisibility(4);
        if (NullChecker.m82487b(this.f147963k)) {
            this.f147971s.duringCreated(this.f147963k.mo29617i(true)).subscribe(psd0.m173596G(new y20() { // from class: l.kmm
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f127521a.m168246A((CharSequence) obj);
                }
            }));
        }
        this.f147966n.f41669b.setText(this.f147971s.getString(R$string.f39898e4));
        this.f147966n.f41668a.setImageResource(lbc0.f131053h6);
        if (this.f147970r == null) {
            this.f147970r = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.lmm
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    this.f132701a.m168247B();
                }
            };
            this.f147959g.getViewTreeObserver().addOnGlobalLayoutListener(this.f147970r);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m168268q() {
        this.f147964l.setOnClickListener(null);
        this.f147963k.setOnTouchListener(null);
        this.f147959g.getViewTreeObserver().removeOnGlobalLayoutListener(this.f147970r);
        this.f147970r = null;
    }

    /* JADX INFO: renamed from: s */
    public void m168269s(MomentMessage momentMessage) {
        List<MomentMessage> list = this.f147969q.f88580e.get(momentMessage.commentInfo.parentMessageId);
        if (NullChecker.m82486a(list) && list.contains(momentMessage)) {
            list.remove(momentMessage);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m168270u(n570 n570Var) {
        fmm fmmVar = this.f147968p;
        rlm rlmVar = new rlm(fmmVar.f99808l, this.f147971s, n570Var, fmmVar.f99799c, fmmVar.f99807k, fmmVar, this.f147972t);
        this.f147969q = rlmVar;
        this.f147958f.setAdapter(rlmVar);
        if (this.f147968p.f99808l) {
            this.f147969q.mo115865d0(new ArrayList());
        }
    }

    /* JADX INFO: renamed from: v */
    public void m168271v() {
        this.f147958f.getItemAnimator().setAddDuration(0L);
        this.f147958f.getItemAnimator().setChangeDuration(0L);
        this.f147958f.getItemAnimator().setMoveDuration(0L);
        this.f147958f.getItemAnimator().setRemoveDuration(0L);
        ((AbstractC0618v) this.f147958f.getItemAnimator()).setSupportsChangeAnimations(false);
    }

    /* JADX INFO: renamed from: w */
    public final void m168272w(View view) {
        this.f147974v.setState(5);
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC19166b(view));
    }

    /* JADX INFO: renamed from: x */
    public void m168273x() {
        this.f147964l.setOnClickListener(new View.OnClickListener() { // from class: l.mmm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137620a.m168250G(view);
            }
        });
        this.f147968p.m126317z0();
    }

    /* JADX INFO: renamed from: y */
    public void m168274y() {
        m168275z();
    }

    /* JADX INFO: renamed from: z */
    public final void m168275z() {
        this.f147963k.requestFocus();
        this.f147971s.showInput(this.f147963k, 0);
        if (TextUtils.isEmpty(this.f147963k.getText().toString().trim())) {
            fmm fmmVar = this.f147968p;
            fmmVar.f99805i = "";
            fmmVar.f99804h = null;
            fmmVar.f99803g = null;
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.omm$a */
    public class C19165a extends BottomSheetBehavior.BottomSheetCallback {
        public C19165a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull @NotNull View view, int i) {
            if (i == 5) {
                omm.this.f147971s.alwaysHideInput();
                omm.this.f147971s.lambda$debugItems$19();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull @NotNull View view, float f) {
        }
    }
}
