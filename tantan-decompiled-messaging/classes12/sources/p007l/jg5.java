package p007l;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p000p1.mobile.putong.data.DetectCategoryType;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.CommentInfo;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.d30;
import l.e30;
import l.e51;
import l.e6c0;
import l.jig;
import l.lsi0;
import l.mkd0;
import l.p4c0;
import l.qib0;
import l.t100;
import l.xdl0;
import v.VEditText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class jg5 extends BottomSheetDialog {

    /* JADX INFO: renamed from: a */
    public View f9344a;

    /* JADX INFO: renamed from: b */
    public View f9345b;

    /* JADX INFO: renamed from: c */
    public Act f9346c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f9347d;

    /* JADX INFO: renamed from: e */
    public VEditText f9348e;

    /* JADX INFO: renamed from: f */
    public TextView f9349f;

    /* JADX INFO: renamed from: g */
    public PopupWindow f9350g;

    /* JADX INFO: renamed from: h */
    public boolean f9351h;

    /* JADX INFO: renamed from: i */
    public Interpolator f9352i;

    /* JADX INFO: renamed from: j */
    public Animator f9353j;

    /* JADX INFO: renamed from: k */
    public int f9354k;

    /* JADX INFO: renamed from: l */
    public int f9355l;

    /* JADX INFO: renamed from: m */
    public BottomSheetBehavior f9356m;

    /* JADX INFO: renamed from: n */
    public BottomSheetBehavior.BottomSheetCallback f9357n;

    public jg5(@NonNull Context context, int i) {
        super(context, i);
        this.f9351h = false;
        this.f9352i = new jig();
        this.f9353j = null;
        this.f9357n = new C2403a();
        m11160K(context);
    }

    /* JADX INFO: renamed from: H */
    private void m11142H(final String str) {
        qib0.Z.Q(str, "p_user_passive_show_nearby").subscribe(mkd0.H(new e30() { // from class: l.hg5
            public final void call(Object obj) {
                this.f8711a.m11162N(str, (Boolean) obj);
            }
        }, new e30() { // from class: l.ig5
            public final void call(Object obj) {
                jg5.m11153w((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    private void m11143J() {
        if (!this.f9351h && NullChecker.a(this.f9353j)) {
            this.f9353j.cancel();
        }
        this.f9351h = false;
        m11146c0(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m11144M() {
        super/*android.app.Dialog*/.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m11145P(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: c0 */
    private void m11146c0(int i) {
        Animator animatorP = bt0.p(this.f9347d, "translationY", 0L, 250L, this.f9352i, new float[]{-i});
        this.f9353j = animatorP;
        animatorP.start();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m11153w(Throwable th) {
    }

    /* JADX INFO: renamed from: F */
    public final void m11157F(Paint paint, String str) {
        String str2 = this.f9346c.getString(R$string.f482a3) + " ";
        float fY0 = (xdl0.y0() - m11158G()) - paint.measureText(str2);
        if (paint.measureText(str) < fY0) {
            this.f9348e.setHint(str2 + str);
            return;
        }
        for (int length = str.length() - 2; length > 1; length--) {
            String strConcat = str.substring(0, length).concat("...");
            if (paint.measureText(strConcat) < fY0) {
                this.f9348e.setHint(str2.concat(strConcat));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public float m11158G() {
        float fMeasureText;
        if (this.f9349f.getMeasuredWidth() > 0) {
            fMeasureText = this.f9349f.getMeasuredWidth();
        } else {
            fMeasureText = this.f9349f.getPaint().measureText(this.f9346c.getString(R$string.f612t3)) + t100.d(32.0f);
        }
        return t100.d(24.0f) + fMeasureText;
    }

    /* JADX INFO: renamed from: I */
    public final void m11159I() {
        Rect rect = new Rect();
        this.f9344a.getWindowVisibleDisplayFrame(rect);
        if (this.f9354k == 0) {
            this.f9354k = rect.bottom;
        }
        if (this.f9355l == 0) {
            this.f9355l = rect.bottom;
        }
        int i = rect.bottom;
        if (i > this.f9355l && i != this.f9354k) {
            m11143J();
            this.f9355l = this.f9354k;
        }
        int i2 = this.f9355l - rect.bottom;
        if (i2 <= 0) {
            if (i2 < 0) {
                m11143J();
                this.f9355l = rect.bottom;
                return;
            }
            return;
        }
        if (this.f9351h && NullChecker.a(this.f9353j)) {
            this.f9353j.cancel();
        }
        this.f9351h = true;
        m11146c0(i2);
        this.f9355l = rect.bottom;
    }

    /* JADX INFO: renamed from: K */
    public final void m11160K(Context context) {
        this.f9346c = (Act) context;
        View viewInflate = LayoutInflater.from(context).inflate(o6c0.f11248l, (ViewGroup) null);
        setContentView(viewInflate);
        View viewFindViewById = viewInflate.findViewById(b5c0.f5967H1);
        this.f9347d = (LinearLayout) viewInflate.findViewById(b5c0.f6097v0);
        this.f9348e = viewInflate.findViewById(b5c0.f5994Q1);
        this.f9349f = (TextView) viewInflate.findViewById(b5c0.f5958E1);
        this.f9348e.setHint(R$string.f340D);
        this.f9346c.duringCreated(this.f9348e.i(true)).subscribe(mkd0.G(new e30() { // from class: l.bg5
            public final void call(Object obj) {
                this.f6289a.m11163O((CharSequence) obj);
            }
        }));
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.cg5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6639a.m11145P(view);
            }
        });
        m11161L();
    }

    /* JADX INFO: renamed from: L */
    public final void m11161L() {
        this.f9350g = new PopupWindow((Context) this.f9346c);
        View viewInflate = ((LayoutInflater) this.f9346c.getSystemService("layout_inflater")).inflate(e6c0.u, (ViewGroup) null, false);
        this.f9344a = viewInflate;
        this.f9350g.setContentView(viewInflate);
        this.f9350g.setSoftInputMode(21);
        this.f9350g.setInputMethodMode(1);
        this.f9345b = this.f9346c.findViewById(R.id.content);
        this.f9350g.setWidth(0);
        this.f9350g.setHeight(-1);
        this.f9344a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.eg5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f7350a.m11164Q();
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m11162N(String str, Boolean bool) {
        if (bool.booleanValue()) {
            v1h.m15207J0(this.f9346c, str);
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m11163O(CharSequence charSequence) {
        Editable text = this.f9348e.getText();
        this.f9349f.setEnabled((text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m11164Q() {
        if (this.f9344a != null) {
            m11159I();
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m11165R(final Moment moment, final MomentMessage momentMessage, final d30 d30Var, final String str) {
        this.f9346c.duringCreated(FeedModule.f316d.m16508N6(moment.owner, momentMessage)).subscribe(mkd0.H(new e30() { // from class: l.yf5
            public final void call(Object obj) {
                this.f15414a.m11166S(d30Var, moment, momentMessage, str, (MomentMessage) obj);
            }
        }, new e30() { // from class: l.zf5
            public final void call(Object obj) {
                this.f15723a.m11167T(moment, momentMessage, str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m11166S(d30 d30Var, Moment moment, MomentMessage momentMessage, String str, MomentMessage momentMessage2) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        lsi0.w(R$string.f380J3);
        if (NullChecker.b(moment)) {
            m11173Z(momentMessage, true, str, moment, null);
        }
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m11167T(Moment moment, MomentMessage momentMessage, String str, Throwable th) {
        Throwable th2;
        if (NullChecker.b(moment)) {
            th2 = th;
            m11173Z(momentMessage, false, str, moment, th2);
        } else {
            th2 = th;
        }
        App.d.k(th2);
        t2h.m14425e(th2);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m11168U() {
        this.f9348e.requestFocus();
        this.f9346c.showInput(this.f9348e, 0);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m11169V(DialogInterface dialogInterface) {
        if (!this.f9350g.isShowing() && this.f9345b.getWindowToken() != null) {
            this.f9350g.setBackgroundDrawable(new ColorDrawable(0));
            this.f9350g.showAtLocation(this.f9345b, 0, 0, 0);
        }
        e51.H(this.f9346c, new Runnable() { // from class: l.gg5
            @Override // java.lang.Runnable
            public final void run() {
                this.f8443a.m11168U();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m11171X(final Moment moment, String str, final String str2, String str3, String str4, final d30 d30Var, View view) {
        final jg5 jg5Var;
        final MomentMessage momentMessage = new MomentMessage();
        momentMessage.value = this.f9348e.getText().toString();
        momentMessage.moment = ((DbObject) moment).id;
        momentMessage.owner = FeedModule.m1139F().userId();
        momentMessage.api_only_otherUser = str;
        zi60.m17436w();
        momentMessage.momentShowFromType = zi60.m17435D(str2);
        CommentInfo commentInfoNew_ = CommentInfo.new_();
        commentInfoNew_.parentMessageId = str3;
        commentInfoNew_.replyMessageId = str4;
        momentMessage.commentInfo = commentInfoNew_;
        String strTrim = this.f9348e.getText().toString().trim();
        if (qib0.Z.K(strTrim)) {
            jg5Var = this;
            v1h.m15189A0(this.f9346c, new d30() { // from class: l.fg5
                public final void call() {
                    this.f8090a.m11170W(moment, momentMessage, str2, d30Var);
                }
            }, false);
        } else {
            jg5Var = this;
            jg5Var.m11170W(moment, momentMessage, str2, d30Var);
            jg5Var.m11142H(strTrim);
        }
        jg5Var.dismiss();
    }

    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final void m11170W(final Moment moment, final MomentMessage momentMessage, final String str, final d30 d30Var) {
        vqg.m15531o(this.f9346c, momentMessage.value, DetectCategoryType.get("comment"), "comment", vqg.m15485K(str, false), new d30() { // from class: l.xf5
            public final void call() {
                this.f14884a.m11165R(moment, momentMessage, d30Var, str);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public final void m11173Z(MomentMessage momentMessage, boolean z, String str, Moment moment, Throwable th) {
        p6j0.m12916f("e_comment_send", vqg.m15485K(str, false), p6j0.C2456a.m12922g("moment_id", ((DbObject) moment).id), p6j0.C2456a.m12922g("owner_id", moment.owner), p6j0.C2456a.m12922g("comment_user_id", FeedModule.m1139F().userId()), p6j0.C2456a.m12922g("comment_state", z ? "success" : "fail"), p6j0.C2456a.m12922g("comment_detail", momentMessage.isChildComment() ? "reply" : "comment"), th == null ? null : p6j0.C2456a.m12922g("error", th.toString()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    public void m11174a0() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.wf5
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f14531a.m11169V(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public void m11175b0(final Moment moment, final String str, final String str2, final String str3, final String str4, final d30 d30Var) {
        this.f9349f.setOnClickListener(new View.OnClickListener() { // from class: l.ag5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5733a.m11171X(moment, str3, str, str2, str4, d30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public void m11176d0(String str) {
        m11157F(this.f9348e.getPaint(), str);
    }

    public void dismiss() {
        this.f9348e.setText("");
        this.f9346c.hideInput(this.f9348e);
        e51.H(this.f9346c, new Runnable() { // from class: l.dg5
            @Override // java.lang.Runnable
            public final void run() {
                this.f6924a.m11144M();
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
        this.f9356m = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f9356m.setBottomSheetCallback(this.f9357n);
    }

    /* JADX INFO: renamed from: l.jg5$a */
    public class C2403a extends BottomSheetBehavior.BottomSheetCallback {
        public C2403a() {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                jg5.this.f9356m.setState(3);
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
