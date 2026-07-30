package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.CommentInfo;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.tantanapp.common.utils.NullChecker;
import p151v.VEditText;

/* JADX INFO: loaded from: classes13.dex */
public class jh5 extends BottomSheetDialog {

    /* JADX INFO: renamed from: a */
    public View f120807a;

    /* JADX INFO: renamed from: b */
    public View f120808b;

    /* JADX INFO: renamed from: c */
    public Act f120809c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f120810d;

    /* JADX INFO: renamed from: e */
    public VEditText f120811e;

    /* JADX INFO: renamed from: f */
    public TextView f120812f;

    /* JADX INFO: renamed from: g */
    public PopupWindow f120813g;

    /* JADX INFO: renamed from: h */
    public boolean f120814h;

    /* JADX INFO: renamed from: i */
    public Interpolator f120815i;

    /* JADX INFO: renamed from: j */
    public Animator f120816j;

    /* JADX INFO: renamed from: k */
    public int f120817k;

    /* JADX INFO: renamed from: l */
    public int f120818l;

    /* JADX INFO: renamed from: m */
    public BottomSheetBehavior f120819m;

    /* JADX INFO: renamed from: n */
    public BottomSheetBehavior.BottomSheetCallback f120820n;

    public jh5(@NonNull Context context, int i) {
        super(context, i);
        this.f120814h = false;
        this.f120815i = new xjg();
        this.f120816j = null;
        this.f120820n = new C17952a();
        m144873K(context);
    }

    /* JADX INFO: renamed from: H */
    private void m144855H(final String str) {
        uqb0.f180394Z.m95960Q(str, "p_user_passive_show_nearby").subscribe(psd0.m173597H(new y20() { // from class: l.hh5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109479a.m144875N(str, (Boolean) obj);
            }
        }, new y20() { // from class: l.ih5
            @Override // p153l.y20
            public final void call(Object obj) {
                jh5.m144866w((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    private void m144856J() {
        if (!this.f120814h && NullChecker.m82486a(this.f120816j)) {
            this.f120816j.cancel();
        }
        this.f120814h = false;
        m144859c0(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m144857M() {
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m144858P(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: c0 */
    private void m144859c0(int i) {
        Animator animatorM132170p = gt0.m132170p(this.f120810d, "translationY", 0L, 250L, this.f120815i, -i);
        this.f120816j = animatorM132170p;
        animatorM132170p.start();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m144866w(Throwable th) {
    }

    /* JADX INFO: renamed from: F */
    public final void m144870F(Paint paint, String str) {
        String str2 = this.f120809c.getString(R$string.f39869a3) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        float fM105592y0 = (bnl0.m105592y0() - m144871G()) - paint.measureText(str2);
        if (paint.measureText(str) < fM105592y0) {
            this.f120811e.setHint(str2 + str);
            return;
        }
        for (int length = str.length() - 2; length > 1; length--) {
            String strConcat = str.substring(0, length).concat("...");
            if (paint.measureText(strConcat) < fM105592y0) {
                this.f120811e.setHint(str2.concat(strConcat));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public float m144871G() {
        float fMeasureText;
        if (this.f120812f.getMeasuredWidth() > 0) {
            fMeasureText = this.f120812f.getMeasuredWidth();
        } else {
            fMeasureText = this.f120812f.getPaint().measureText(this.f120809c.getString(R$string.f39999t3)) + qa00.m175859d(32.0f);
        }
        return qa00.m175859d(24.0f) + fMeasureText;
    }

    /* JADX INFO: renamed from: I */
    public final void m144872I() {
        Rect rect = new Rect();
        this.f120807a.getWindowVisibleDisplayFrame(rect);
        if (this.f120817k == 0) {
            this.f120817k = rect.bottom;
        }
        if (this.f120818l == 0) {
            this.f120818l = rect.bottom;
        }
        int i = rect.bottom;
        if (i > this.f120818l && i != this.f120817k) {
            m144856J();
            this.f120818l = this.f120817k;
        }
        int i2 = this.f120818l - rect.bottom;
        if (i2 <= 0) {
            if (i2 < 0) {
                m144856J();
                this.f120818l = rect.bottom;
                return;
            }
            return;
        }
        if (this.f120814h && NullChecker.m82486a(this.f120816j)) {
            this.f120816j.cancel();
        }
        this.f120814h = true;
        m144859c0(i2);
        this.f120818l = rect.bottom;
    }

    /* JADX INFO: renamed from: K */
    public final void m144873K(Context context) {
        this.f120809c = (Act) context;
        View viewInflate = LayoutInflater.from(context).inflate(tec0.f173698l, (ViewGroup) null);
        setContentView(viewInflate);
        View viewFindViewById = viewInflate.findViewById(hdc0.f108839H1);
        this.f120810d = (LinearLayout) viewInflate.findViewById(hdc0.f108969v0);
        this.f120811e = (VEditText) viewInflate.findViewById(hdc0.f108866Q1);
        this.f120812f = (TextView) viewInflate.findViewById(hdc0.f108830E1);
        this.f120811e.setHint(R$string.f39727D);
        this.f120809c.duringCreated(this.f120811e.mo29617i(true)).subscribe(psd0.m173596G(new y20() { // from class: l.bh5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76731a.m144876O((CharSequence) obj);
            }
        }));
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.ch5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81758a.m144858P(view);
            }
        });
        m144874L();
    }

    /* JADX INFO: renamed from: L */
    public final void m144874L() {
        this.f120813g = new PopupWindow(this.f120809c);
        View viewInflate = ((LayoutInflater) this.f120809c.getSystemService("layout_inflater")).inflate(jec0.f120475u, (ViewGroup) null, false);
        this.f120807a = viewInflate;
        this.f120813g.setContentView(viewInflate);
        this.f120813g.setSoftInputMode(21);
        this.f120813g.setInputMethodMode(1);
        this.f120808b = this.f120809c.findViewById(R.id.content);
        this.f120813g.setWidth(0);
        this.f120813g.setHeight(-1);
        this.f120807a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.eh5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f94001a.m144877Q();
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m144875N(String str, Boolean bool) {
        if (bool.booleanValue()) {
            k3h.m148045J0(this.f120809c, str);
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m144876O(CharSequence charSequence) {
        Editable text = this.f120811e.getText();
        this.f120812f.setEnabled((text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m144877Q() {
        if (this.f120807a != null) {
            m144872I();
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m144878R(final Moment moment, final MomentMessage momentMessage, final x20 x20Var, final String str) {
        this.f120809c.duringCreated(FeedModule.f39703d.m145568N6(moment.owner, momentMessage)).subscribe(psd0.m173597H(new y20() { // from class: l.yg5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f199702a.m144879S(x20Var, moment, momentMessage, str, (MomentMessage) obj);
            }
        }, new y20() { // from class: l.zg5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204257a.m144880T(moment, momentMessage, str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m144879S(x20 x20Var, Moment moment, MomentMessage momentMessage, String str, MomentMessage momentMessage2) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        o1j0.m165649w(R$string.f39767J3);
        if (NullChecker.m82487b(moment)) {
            m144886Z(momentMessage, true, str, moment, null);
        }
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m144880T(Moment moment, MomentMessage momentMessage, String str, Throwable th) {
        Throwable th2;
        if (NullChecker.m82487b(moment)) {
            th2 = th;
            m144886Z(momentMessage, false, str, moment, th2);
        } else {
            th2 = th;
        }
        App.f16087d.m21432k(th2);
        i4h.m138536e(th2);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m144881U() {
        this.f120811e.requestFocus();
        this.f120809c.showInput(this.f120811e, 0);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m144882V(DialogInterface dialogInterface) {
        if (!this.f120813g.isShowing() && this.f120808b.getWindowToken() != null) {
            this.f120813g.setBackgroundDrawable(new ColorDrawable(0));
            this.f120813g.showAtLocation(this.f120808b, 0, 0, 0);
        }
        l51.m152888H(this.f120809c, new Runnable() { // from class: l.gh5
            @Override // java.lang.Runnable
            public final void run() {
                this.f104069a.m144881U();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m144884X(final Moment moment, String str, final String str2, String str3, String str4, final x20 x20Var, View view) {
        final jh5 jh5Var;
        final MomentMessage momentMessage = new MomentMessage();
        momentMessage.value = this.f120811e.getText().toString();
        momentMessage.moment = moment.f56859id;
        momentMessage.owner = FeedModule.m61405F().userId();
        momentMessage.api_only_otherUser = str;
        er60.m122104w();
        momentMessage.momentShowFromType = er60.m122103D(str2);
        CommentInfo commentInfoNew_ = CommentInfo.new_();
        commentInfoNew_.parentMessageId = str3;
        commentInfoNew_.replyMessageId = str4;
        momentMessage.commentInfo = commentInfoNew_;
        String strTrim = this.f120811e.getText().toString().trim();
        if (uqb0.f180394Z.m95954K(strTrim)) {
            jh5Var = this;
            k3h.m148027A0(this.f120809c, new x20() { // from class: l.fh5
                @Override // p153l.x20
                public final void call() {
                    this.f99009a.m144883W(moment, momentMessage, str2, x20Var);
                }
            }, false);
        } else {
            jh5Var = this;
            jh5Var.m144883W(moment, momentMessage, str2, x20Var);
            jh5Var.m144855H(strTrim);
        }
        jh5Var.dismiss();
    }

    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final void m144883W(final Moment moment, final MomentMessage momentMessage, final String str, final x20 x20Var) {
        ksg.m151220o(this.f120809c, momentMessage.value, DetectCategoryType.get("comment"), "comment", ksg.m151174K(str, false), new x20() { // from class: l.xg5
            @Override // p153l.x20
            public final void call() {
                this.f194133a.m144878R(moment, momentMessage, x20Var, str);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public final void m144886Z(MomentMessage momentMessage, boolean z, String str, Moment moment, Throwable th) {
        tfj0.m190943f("e_comment_send", ksg.m151174K(str, false), tfj0.C20302a.m190949g("moment_id", moment.f56859id), tfj0.C20302a.m190949g("owner_id", moment.owner), tfj0.C20302a.m190949g("comment_user_id", FeedModule.m61405F().userId()), tfj0.C20302a.m190949g("comment_state", z ? "success" : "fail"), tfj0.C20302a.m190949g("comment_detail", momentMessage.isChildComment() ? SysnotifListener.ACTION_REPLY : "comment"), th == null ? null : tfj0.C20302a.m190949g("error", th.toString()));
    }

    /* JADX INFO: renamed from: a0 */
    public void m144887a0() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.wg5
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f188911a.m144882V(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public void m144888b0(final Moment moment, final String str, final String str2, final String str3, final String str4, final x20 x20Var) {
        this.f120812f.setOnClickListener(new View.OnClickListener() { // from class: l.ah5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71316a.m144884X(moment, str3, str, str2, str4, x20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public void m144889d0(String str) {
        m144870F(this.f120811e.getPaint(), str);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f120811e.setText("");
        this.f120809c.hideInput(this.f120811e);
        l51.m152888H(this.f120809c, new Runnable() { // from class: l.dh5
            @Override // java.lang.Runnable
            public final void run() {
                this.f88418a.m144857M();
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
        this.f120819m = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f120819m.setBottomSheetCallback(this.f120820n);
    }

    /* JADX INFO: renamed from: l.jh5$a */
    public class C17952a extends BottomSheetBehavior.BottomSheetCallback {
        public C17952a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                jh5.this.f120819m.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
