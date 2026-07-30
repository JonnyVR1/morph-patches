package p007l;

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
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.data.StickerInfo;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.e30;
import l.f30;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.s7m;
import l.t100;
import l.vwb;
import l.xaj0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VEditText;
import v.VHandleBar;
import v.VLinear;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class mkm implements s7m<dkm> {

    /* JADX INFO: renamed from: a */
    public VLinear f10485a;

    /* JADX INFO: renamed from: b */
    public CoordinatorLayout f10486b;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f10487c;

    /* JADX INFO: renamed from: d */
    public VHandleBar f10488d;

    /* JADX INFO: renamed from: e */
    public VText f10489e;

    /* JADX INFO: renamed from: f */
    public VRecyclerView f10490f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f10491g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f10492h;

    /* JADX INFO: renamed from: i */
    public View f10493i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f10494j;

    /* JADX INFO: renamed from: k */
    public VEditText f10495k;

    /* JADX INFO: renamed from: l */
    public TextView f10496l;

    /* JADX INFO: renamed from: m */
    public VLinear f10497m;

    /* JADX INFO: renamed from: n */
    public CommonEmptyView f10498n;

    /* JADX INFO: renamed from: o */
    public View f10499o;

    /* JADX INFO: renamed from: p */
    public dkm f10500p;

    /* JADX INFO: renamed from: q */
    public pjm f10501q;

    /* JADX INFO: renamed from: r */
    public ViewTreeObserver.OnGlobalLayoutListener f10502r;

    /* JADX INFO: renamed from: s */
    public Act f10503s;

    /* JADX INFO: renamed from: t */
    public String f10504t;

    /* JADX INFO: renamed from: u */
    public String f10505u;

    /* JADX INFO: renamed from: v */
    public BottomSheetBehavior<View> f10506v;

    /* JADX INFO: renamed from: l.mkm$b */
    public class ViewTreeObserverOnPreDrawListenerC2429b implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f10508a;

        public ViewTreeObserverOnPreDrawListenerC2429b(View view) {
            this.f10508a = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (mkm.this.f10506v == null || mkm.this.f10506v.getState() != 5) {
                return true;
            }
            mkm.this.f10506v.setState(4);
            this.f10508a.getViewTreeObserver().removeOnPreDrawListener(this);
            return false;
        }
    }

    public mkm(Act act) {
        this.f10503s = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m11932E(View view) {
        this.f10503s.alwaysHideInput();
        this.f10503s.finish();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m11934b(View view) {
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m11942A(CharSequence charSequence) {
        Editable text = this.f10495k.getText();
        this.f10496l.setEnabled((text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ boolean m11944C(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            dkm dkmVar = this.f10500p;
            if (dkmVar.f6981l) {
                lsi0.h(R$string.f503d3);
                return false;
            }
            if (!dkmVar.f6982m && TextUtils.isEmpty(this.f10495k.getText())) {
                m11964n();
            }
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m11945C0() {
        return act();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m11946F() {
        this.f10490f.scrollToPosition(this.f10501q.m13065k0(this.f10500p.f6976g));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m11947G(View view) {
        this.f10500p.m9455W0(this.f10495k.getText().toString(), this.f10495k.getText().toString().trim(), new d30() { // from class: l.lkm
            public final void call() {
                this.f10060a.m11946F();
            }
        });
        this.f10503s.hideInput();
        this.f10495k.setText(null);
    }

    /* JADX INFO: renamed from: H */
    public void m11948H(boolean z, int i) {
        ConstraintLayout constraintLayout = this.f10487c;
        if (z) {
            constraintLayout.setPadding(0, 0, 0, i);
        } else {
            constraintLayout.setPadding(0, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m11949I(List<MomentMessage> list) {
        dkm dkmVar = this.f10500p;
        if (dkmVar.f6981l) {
            this.f10501q.mo9400d0(new ArrayList());
            this.f10489e.setText("评论 0");
            return;
        }
        boolean zA = NullChecker.a(dkmVar.f6972c);
        VText vText = this.f10489e;
        if (zA) {
            vText.setText("评论 " + this.f10500p.f6972c.messages.count);
        } else {
            vText.setText("评论 0");
        }
        this.f10501q.mo9400d0(list);
    }

    /* JADX INFO: renamed from: J */
    public void m11950J(List<MomentMessage> list, List<StickerInfo> list2) {
        if (!vwb.J(list2)) {
            this.f10501q.f6932d.clear();
            this.f10501q.f6932d.addAll(list2);
        }
        m11949I(list);
    }

    /* JADX INFO: renamed from: K */
    public void m11951K(Links links) {
        this.f10501q.f11869m = links;
    }

    /* JADX INFO: renamed from: L */
    public void m11952L(Moment moment) {
        this.f10501q.f11872p = moment;
    }

    /* JADX INFO: renamed from: M */
    public void m11953M(MomentMessage momentMessage) {
        this.f10501q.mo9401e0(momentMessage);
    }

    /* JADX INFO: renamed from: N */
    public void m11954N() {
        this.f10501q.f11872p = this.f10500p.m9465u0();
        this.f10501q.notifyItemChanged(0);
    }

    /* JADX INFO: renamed from: O */
    public boolean m11955O(xaj0<Moment, j760<List<StickerInfo>, List<MomentMessage>>, j760<Music, RawFeed>> xaj0Var) {
        if (xaj0Var.a == null) {
            this.f10503s.finish();
            return false;
        }
        xdl0.M0(this.f10491g, true);
        xdl0.M0(this.f10490f, true);
        xdl0.M0(this.f10498n, false);
        return true;
    }

    /* JADX INFO: renamed from: P */
    public void m11956P(Throwable th) {
        if (xdl0.O0(this.f10498n)) {
            return;
        }
        xdl0.M0(this.f10491g, false);
        if (((th instanceof ApiExcep.Client.Forbidden) || (th instanceof ApiExcep.Client.NotFound)) && !vqg.m15506b0(FeedModule.f316d.m16628e8(this.f10500p.m9465u0().owner))) {
            xdl0.M0(this.f10498n, true);
            xdl0.M0(this.f10490f, false);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m11957Q(boolean z) {
        xdl0.M0(this.f10499o, z);
    }

    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final void m11943B() {
        dkm dkmVar = this.f10500p;
        if (dkmVar.f6972c == null) {
            return;
        }
        if (dkmVar.f6982m) {
            this.f10491g.setVisibility(0);
            return;
        }
        if (this.f10498n.getVisibility() == 0) {
            this.f10491g.setVisibility(4);
            return;
        }
        if (vqg.m15506b0(FeedModule.m1140H().getUserById(this.f10500p.m9465u0().owner))) {
            this.f10491g.setVisibility(4);
            return;
        }
        boolean globalVisibleRect = this.f10490f.getGlobalVisibleRect(new Rect());
        LinearLayout linearLayout = this.f10491g;
        if (globalVisibleRect) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m11959S(MomentMessage momentMessage, String str) {
        m11960T(momentMessage, str);
    }

    /* JADX INFO: renamed from: T */
    public final void m11960T(MomentMessage momentMessage, String str) {
        xdl0.A(this.f10495k);
        this.f10503s.showInput(this.f10495k, 0);
        this.f10495k.setHint(this.f10500p.m9456Y0(momentMessage, str));
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    public Act act() {
        return this.f10503s;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM11962l = m11962l(layoutInflater, viewGroup);
        if (TextUtils.isEmpty(this.f10505u)) {
            boolean zEquals = "feed".equals(this.f10504t);
            VEditText vEditText = this.f10495k;
            if (zEquals) {
                vEditText.setHint("友善评论，说点好听的...");
            } else {
                vEditText.setHint(this.f10503s.getString(R$string.f340D));
            }
        } else {
            this.f10495k.setHint(this.f10505u);
        }
        this.f10495k.setOnTouchListener(new View.OnTouchListener() { // from class: l.ekm
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f7408a.m11944C(view, motionEvent);
            }
        });
        this.f10506v = BottomSheetBehavior.from(this.f10487c);
        if (nkg.m12218P()) {
            m11970w(viewM11962l);
        }
        this.f10506v.addBottomSheetCallback(new C2428a());
        int i = (int) (t100.c().heightPixels * 0.8f);
        this.f10506v.setPeekHeight(i);
        ViewGroup.LayoutParams layoutParams = this.f10487c.getLayoutParams();
        layoutParams.height = i;
        this.f10487c.setLayoutParams(layoutParams);
        xdl0.E0(this.f10486b, new View.OnClickListener() { // from class: l.fkm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8125a.m11932E(view);
            }
        });
        this.f10492h.setOnClickListener(new View.OnClickListener() { // from class: l.gkm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mkm.m11934b(view);
            }
        });
        m11969v();
        return act().setUpKeyboardDetectorLayout(viewM11962l, new View(act()), new f30() { // from class: l.hkm
            public final void call(Object obj, Object obj2) {
                this.f8760a.m11948H(((Boolean) obj).booleanValue(), ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public View m11962l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nkm.m12282b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m11961i1(dkm dkmVar) {
        this.f10500p = dkmVar;
    }

    /* JADX INFO: renamed from: n */
    public final void m11964n() {
        dkm dkmVar = this.f10500p;
        dkmVar.f6978i = "";
        dkmVar.f6977h = null;
        dkmVar.f6976g = null;
    }

    /* JADX INFO: renamed from: p */
    public void m11965p() {
        this.f10491g.setVisibility(4);
        if (NullChecker.b(this.f10495k)) {
            this.f10503s.duringCreated(this.f10495k.i(true)).subscribe(mkd0.G(new e30() { // from class: l.ikm
                public final void call(Object obj) {
                    this.f9050a.m11942A((CharSequence) obj);
                }
            }));
        }
        this.f10498n.f2282b.setText(this.f10503s.getString(R$string.f511e4));
        this.f10498n.f2281a.setImageResource(f3c0.f7818h6);
        if (this.f10502r == null) {
            this.f10502r = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.jkm
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    this.f9382a.m11943B();
                }
            };
            this.f10491g.getViewTreeObserver().addOnGlobalLayoutListener(this.f10502r);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m11966q() {
        this.f10496l.setOnClickListener(null);
        this.f10495k.setOnTouchListener(null);
        this.f10491g.getViewTreeObserver().removeOnGlobalLayoutListener(this.f10502r);
        this.f10502r = null;
    }

    /* JADX INFO: renamed from: s */
    public void m11967s(MomentMessage momentMessage) {
        List<MomentMessage> list = this.f10501q.f6933e.get(momentMessage.commentInfo.parentMessageId);
        if (NullChecker.a(list) && list.contains(momentMessage)) {
            list.remove(momentMessage);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m11968u(hx60 hx60Var) {
        dkm dkmVar = this.f10500p;
        pjm pjmVar = new pjm(dkmVar.f6981l, this.f10503s, hx60Var, dkmVar.f6972c, dkmVar.f6980k, dkmVar, this.f10504t);
        this.f10501q = pjmVar;
        this.f10490f.setAdapter(pjmVar);
        if (this.f10500p.f6981l) {
            this.f10501q.mo9400d0(new ArrayList());
        }
    }

    /* JADX INFO: renamed from: v */
    public void m11969v() {
        this.f10490f.getItemAnimator().setAddDuration(0L);
        this.f10490f.getItemAnimator().setChangeDuration(0L);
        this.f10490f.getItemAnimator().setMoveDuration(0L);
        this.f10490f.getItemAnimator().setRemoveDuration(0L);
        this.f10490f.getItemAnimator().setSupportsChangeAnimations(false);
    }

    /* JADX INFO: renamed from: w */
    public final void m11970w(View view) {
        this.f10506v.setState(5);
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC2429b(view));
    }

    /* JADX INFO: renamed from: x */
    public void m11971x() {
        this.f10496l.setOnClickListener(new View.OnClickListener() { // from class: l.kkm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9742a.m11947G(view);
            }
        });
        this.f10500p.m9467z0();
    }

    /* JADX INFO: renamed from: y */
    public void m11972y() {
        m11973z();
    }

    /* JADX INFO: renamed from: z */
    public final void m11973z() {
        this.f10495k.requestFocus();
        this.f10503s.showInput(this.f10495k, 0);
        if (TextUtils.isEmpty(this.f10495k.getText().toString().trim())) {
            dkm dkmVar = this.f10500p;
            dkmVar.f6978i = "";
            dkmVar.f6977h = null;
            dkmVar.f6976g = null;
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.mkm$a */
    public class C2428a extends BottomSheetBehavior.BottomSheetCallback {
        public C2428a() {
        }

        public void onStateChanged(@NonNull @NotNull View view, int i) {
            if (i == 5) {
                mkm.this.f10503s.alwaysHideInput();
                mkm.this.f10503s.finish();
            }
        }

        public void onSlide(@NonNull @NotNull View view, float f) {
        }
    }
}
