package p149l;

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
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.CommentInfo;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.tantanapp.common.utils.NullChecker;
import p147v.VEditText;

/* JADX INFO: loaded from: classes12.dex */
public class jg5 extends BottomSheetDialog {

    /* JADX INFO: renamed from: a */
    public View f117710a;

    /* JADX INFO: renamed from: b */
    public View f117711b;

    /* JADX INFO: renamed from: c */
    public Act f117712c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f117713d;

    /* JADX INFO: renamed from: e */
    public VEditText f117714e;

    /* JADX INFO: renamed from: f */
    public TextView f117715f;

    /* JADX INFO: renamed from: g */
    public PopupWindow f117716g;

    /* JADX INFO: renamed from: h */
    public boolean f117717h;

    /* JADX INFO: renamed from: i */
    public Interpolator f117718i;

    /* JADX INFO: renamed from: j */
    public Animator f117719j;

    /* JADX INFO: renamed from: k */
    public int f117720k;

    /* JADX INFO: renamed from: l */
    public int f117721l;

    /* JADX INFO: renamed from: m */
    public BottomSheetBehavior f117722m;

    /* JADX INFO: renamed from: n */
    public BottomSheetBehavior.BottomSheetCallback f117723n;

    public jg5(@NonNull Context context, int i) {
        super(context, i);
        this.f117717h = false;
        this.f117718i = new jig();
        this.f117719j = null;
        this.f117723n = new C17762a();
        m141241K(context);
    }

    /* JADX INFO: renamed from: H */
    private void m141223H(final String str) {
        qib0.f154711Z.m119131Q(str, "p_user_passive_show_nearby").subscribe(mkd0.m154956H(new e30() { // from class: l.hg5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107562a.m141243N(str, (Boolean) obj);
            }
        }, new e30() { // from class: l.ig5
            @Override // p149l.e30
            public final void call(Object obj) {
                jg5.m141234w((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    private void m141224J() {
        if (!this.f117717h && NullChecker.m81303a(this.f117719j)) {
            this.f117719j.cancel();
        }
        this.f117717h = false;
        m141227c0(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m141225M() {
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m141226P(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: c0 */
    private void m141227c0(int i) {
        Animator animatorM103743p = bt0.m103743p(this.f117713d, "translationY", 0L, 250L, this.f117718i, -i);
        this.f117719j = animatorM103743p;
        animatorM103743p.start();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m141234w(Throwable th) {
    }

    /* JADX INFO: renamed from: F */
    public final void m141238F(Paint paint, String str) {
        String str2 = this.f117712c.getString(R$string.f39021a3) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        float fM208412y0 = (xdl0.m208412y0() - m141239G()) - paint.measureText(str2);
        if (paint.measureText(str) < fM208412y0) {
            this.f117714e.setHint(str2 + str);
            return;
        }
        for (int length = str.length() - 2; length > 1; length--) {
            String strConcat = str.substring(0, length).concat("...");
            if (paint.measureText(strConcat) < fM208412y0) {
                this.f117714e.setHint(str2.concat(strConcat));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public float m141239G() {
        float fMeasureText;
        if (this.f117715f.getMeasuredWidth() > 0) {
            fMeasureText = this.f117715f.getMeasuredWidth();
        } else {
            fMeasureText = this.f117715f.getPaint().measureText(this.f117712c.getString(R$string.f39151t3)) + t100.m186890d(32.0f);
        }
        return t100.m186890d(24.0f) + fMeasureText;
    }

    /* JADX INFO: renamed from: I */
    public final void m141240I() {
        Rect rect = new Rect();
        this.f117710a.getWindowVisibleDisplayFrame(rect);
        if (this.f117720k == 0) {
            this.f117720k = rect.bottom;
        }
        if (this.f117721l == 0) {
            this.f117721l = rect.bottom;
        }
        int i = rect.bottom;
        if (i > this.f117721l && i != this.f117720k) {
            m141224J();
            this.f117721l = this.f117720k;
        }
        int i2 = this.f117721l - rect.bottom;
        if (i2 <= 0) {
            if (i2 < 0) {
                m141224J();
                this.f117721l = rect.bottom;
                return;
            }
            return;
        }
        if (this.f117717h && NullChecker.m81303a(this.f117719j)) {
            this.f117719j.cancel();
        }
        this.f117717h = true;
        m141227c0(i2);
        this.f117721l = rect.bottom;
    }

    /* JADX INFO: renamed from: K */
    public final void m141241K(Context context) {
        this.f117712c = (Act) context;
        View viewInflate = LayoutInflater.from(context).inflate(o6c0.f142229l, (ViewGroup) null);
        setContentView(viewInflate);
        View viewFindViewById = viewInflate.findViewById(b5c0.f73486H1);
        this.f117713d = (LinearLayout) viewInflate.findViewById(b5c0.f73616v0);
        this.f117714e = (VEditText) viewInflate.findViewById(b5c0.f73513Q1);
        this.f117715f = (TextView) viewInflate.findViewById(b5c0.f73477E1);
        this.f117714e.setHint(R$string.f38879D);
        this.f117712c.duringCreated(this.f117714e.mo28618i(true)).subscribe(mkd0.m154955G(new e30() { // from class: l.bg5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75405a.m141244O((CharSequence) obj);
            }
        }));
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.cg5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80717a.m141226P(view);
            }
        });
        m141242L();
    }

    /* JADX INFO: renamed from: L */
    public final void m141242L() {
        this.f117716g = new PopupWindow(this.f117712c);
        View viewInflate = ((LayoutInflater) this.f117712c.getSystemService("layout_inflater")).inflate(e6c0.f89562u, (ViewGroup) null, false);
        this.f117710a = viewInflate;
        this.f117716g.setContentView(viewInflate);
        this.f117716g.setSoftInputMode(21);
        this.f117716g.setInputMethodMode(1);
        this.f117711b = this.f117712c.findViewById(R.id.content);
        this.f117716g.setWidth(0);
        this.f117716g.setHeight(-1);
        this.f117710a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.eg5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f90892a.m141245Q();
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m141243N(String str, Boolean bool) {
        if (bool.booleanValue()) {
            v1h.m196568J0(this.f117712c, str);
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m141244O(CharSequence charSequence) {
        Editable text = this.f117714e.getText();
        this.f117715f.setEnabled((text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m141245Q() {
        if (this.f117710a != null) {
            m141240I();
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m141246R(final Moment moment, final MomentMessage momentMessage, final d30 d30Var, final String str) {
        this.f117712c.duringCreated(FeedModule.f38855d.m209327N6(moment.owner, momentMessage)).subscribe(mkd0.m154956H(new e30() { // from class: l.yf5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197981a.m141247S(d30Var, moment, momentMessage, str, (MomentMessage) obj);
            }
        }, new e30() { // from class: l.zf5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202879a.m141248T(moment, momentMessage, str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m141247S(d30 d30Var, Moment moment, MomentMessage momentMessage, String str, MomentMessage momentMessage2) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        lsi0.m151593w(R$string.f38919J3);
        if (NullChecker.m81304b(moment)) {
            m141254Z(momentMessage, true, str, moment, null);
        }
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m141248T(Moment moment, MomentMessage momentMessage, String str, Throwable th) {
        Throwable th2;
        if (NullChecker.m81304b(moment)) {
            th2 = th;
            m141254Z(momentMessage, false, str, moment, th2);
        } else {
            th2 = th;
        }
        App.f15368d.m20433k(th2);
        t2h.m186974e(th2);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m141249U() {
        this.f117714e.requestFocus();
        this.f117712c.showInput(this.f117714e, 0);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m141250V(DialogInterface dialogInterface) {
        if (!this.f117716g.isShowing() && this.f117711b.getWindowToken() != null) {
            this.f117716g.setBackgroundDrawable(new ColorDrawable(0));
            this.f117716g.showAtLocation(this.f117711b, 0, 0, 0);
        }
        e51.m114743H(this.f117712c, new Runnable() { // from class: l.gg5
            @Override // java.lang.Runnable
            public final void run() {
                this.f102450a.m141249U();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m141252X(final Moment moment, String str, final String str2, String str3, String str4, final d30 d30Var, View view) {
        final jg5 jg5Var;
        final MomentMessage momentMessage = new MomentMessage();
        momentMessage.value = this.f117714e.getText().toString();
        momentMessage.moment = moment.f56011id;
        momentMessage.owner = FeedModule.m60221F().userId();
        momentMessage.api_only_otherUser = str;
        zi60.m218961w();
        momentMessage.momentShowFromType = zi60.m218960D(str2);
        CommentInfo commentInfoNew_ = CommentInfo.new_();
        commentInfoNew_.parentMessageId = str3;
        commentInfoNew_.replyMessageId = str4;
        momentMessage.commentInfo = commentInfoNew_;
        String strTrim = this.f117714e.getText().toString().trim();
        if (qib0.f154711Z.m119125K(strTrim)) {
            jg5Var = this;
            v1h.m196550A0(this.f117712c, new d30() { // from class: l.fg5
                @Override // p149l.d30
                public final void call() {
                    this.f97330a.m141251W(moment, momentMessage, str2, d30Var);
                }
            }, false);
        } else {
            jg5Var = this;
            jg5Var.m141251W(moment, momentMessage, str2, d30Var);
            jg5Var.m141223H(strTrim);
        }
        jg5Var.dismiss();
    }

    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final void m141251W(final Moment moment, final MomentMessage momentMessage, final String str, final d30 d30Var) {
        vqg.m199561o(this.f117712c, momentMessage.value, DetectCategoryType.get("comment"), "comment", vqg.m199515K(str, false), new d30() { // from class: l.xf5
            @Override // p149l.d30
            public final void call() {
                this.f192652a.m141246R(moment, momentMessage, d30Var, str);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public final void m141254Z(MomentMessage momentMessage, boolean z, String str, Moment moment, Throwable th) {
        p6j0.m167672f("e_comment_send", vqg.m199515K(str, false), p6j0.C19147a.m167678g("moment_id", moment.f56011id), p6j0.C19147a.m167678g("owner_id", moment.owner), p6j0.C19147a.m167678g("comment_user_id", FeedModule.m60221F().userId()), p6j0.C19147a.m167678g("comment_state", z ? "success" : "fail"), p6j0.C19147a.m167678g("comment_detail", momentMessage.isChildComment() ? SysnotifListener.ACTION_REPLY : "comment"), th == null ? null : p6j0.C19147a.m167678g("error", th.toString()));
    }

    /* JADX INFO: renamed from: a0 */
    public void m141255a0() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.wf5
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f186012a.m141250V(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public void m141256b0(final Moment moment, final String str, final String str2, final String str3, final String str4, final d30 d30Var) {
        this.f117715f.setOnClickListener(new View.OnClickListener() { // from class: l.ag5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69260a.m141252X(moment, str3, str, str2, str4, d30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public void m141257d0(String str) {
        m141238F(this.f117714e.getPaint(), str);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f117714e.setText("");
        this.f117712c.hideInput(this.f117714e);
        e51.m114743H(this.f117712c, new Runnable() { // from class: l.dg5
            @Override // java.lang.Runnable
            public final void run() {
                this.f86022a.m141225M();
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
        this.f117722m = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f117722m.setBottomSheetCallback(this.f117723n);
    }

    /* JADX INFO: renamed from: l.jg5$a */
    public class C17762a extends BottomSheetBehavior.BottomSheetCallback {
        public C17762a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                jg5.this.f117722m.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
