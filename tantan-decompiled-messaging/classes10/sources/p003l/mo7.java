package p003l;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.p001ui.emoji.CoreMomentEmojiView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.newui.view.MessageInputEditView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.e30;
import l.e51;
import l.f6c0;
import l.g30;
import l.j760;
import l.jig;
import l.l5j0;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.o7r;
import l.p4c0;
import l.soe;
import l.u4c0;
import l.upa;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mo7 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public Act f6368f;

    /* JADX INFO: renamed from: g */
    public boolean f6369g;

    /* JADX INFO: renamed from: h */
    public Interpolator f6370h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f6371i;

    /* JADX INFO: renamed from: j */
    public BottomSheetBehavior f6372j;

    /* JADX INFO: renamed from: k */
    public MessageInputEditView f6373k;

    /* JADX INFO: renamed from: l */
    public VImage f6374l;

    /* JADX INFO: renamed from: m */
    public VLinear f6375m;

    /* JADX INFO: renamed from: n */
    public boolean f6376n;

    /* JADX INFO: renamed from: o */
    public g30<String, List<String>, Boolean> f6377o;

    /* JADX INFO: renamed from: p */
    public boolean f6378p;

    /* JADX INFO: renamed from: q */
    public boolean f6379q;

    /* JADX INFO: renamed from: r */
    public VLinear f6380r;

    /* JADX INFO: renamed from: s */
    public VImage f6381s;

    /* JADX INFO: renamed from: t */
    public VText f6382t;

    /* JADX INFO: renamed from: u */
    public String f6383u;

    /* JADX INFO: renamed from: v */
    public String f6384v;

    /* JADX INFO: renamed from: w */
    public List<String> f6385w;

    /* JADX INFO: renamed from: x */
    public Runnable f6386x;

    /* JADX INFO: renamed from: y */
    public boolean f6387y;

    /* JADX INFO: renamed from: z */
    public BottomSheetBehavior.BottomSheetCallback f6388z;

    /* JADX INFO: renamed from: l.mo7$a */
    public class RunnableC3380a implements Runnable {
        public RunnableC3380a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            mo7.this.f6375m.setVisibility(4);
        }
    }

    public mo7(String str, String str2, boolean z, @LayoutRes int i, @NonNull Context context, int i2, boolean z2, g30<String, List<String>, Boolean> g30Var) {
        super(context, i2);
        this.f6369g = false;
        this.f6370h = new jig();
        this.f6371i = null;
        this.f6385w = new ArrayList();
        this.f6386x = new RunnableC3380a();
        this.f6387y = false;
        this.f6388z = new C3381b();
        this.f6384v = str;
        this.f6383u = str2;
        this.f6379q = z;
        this.f6376n = z2;
        this.f6377o = g30Var;
        m8196Q(i, context, z2);
    }

    /* JADX INFO: renamed from: O */
    private void m8188O() {
        if (!this.f6369g && NullChecker.a(this.f6371i)) {
            this.f6371i.cancel();
        }
        this.f6369g = false;
        m8192g0(0);
    }

    /* JADX INFO: renamed from: P */
    public static void m8189P(Act act, View view) {
        ((InputMethodManager) act.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m8190S(DialogInterface dialogInterface) {
        e51.J(this.f6386x);
        this.f6368f.alwaysHideInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m8191T(View view) {
        VImage vImage = this.f6381s;
        vImage.setSelected(!vImage.isSelected());
        m8212j0();
    }

    /* JADX INFO: renamed from: g0 */
    private void m8192g0(int i) {
        if (i == 0) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f6375m.getLayoutParams().height, 0);
            this.f6371i = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(150L);
        } else {
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, i);
            this.f6371i = valueAnimatorOfInt2;
            valueAnimatorOfInt2.setDuration(100L);
        }
        this.f6371i.setInterpolator(this.f6370h);
        this.f6371i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.co7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f4055a.m8208e0(valueAnimator);
            }
        });
        this.f6371i.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: Q */
    public final void m8196Q(@LayoutRes int i, Context context, boolean z) {
        this.f6368f = (Act) context;
        View viewInflate = o7r.a(context).inflate(f6c0.u1, (ViewGroup) null);
        setContentView(viewInflate);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.do7
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f4197a.m8190S(dialogInterface);
            }
        });
        this.f6373k = viewInflate.findViewById(u4c0.Pd);
        final TextView textView = (TextView) viewInflate.findViewById(u4c0.Xb);
        this.f6373k.setHint(R.string.T1);
        this.f6375m = viewInflate.findViewById(u4c0.s3);
        this.f6380r = viewInflate.findViewById(u4c0.Oe);
        this.f6381s = viewInflate.findViewById(u4c0.O4);
        this.f6382t = viewInflate.findViewById(u4c0.Q4);
        if (CoreModule.N().ua()) {
            this.f6381s.setSelected(!m8210h0());
            m8212j0();
            xdl0.E0(this.f6381s, new View.OnClickListener() { // from class: l.eo7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4318a.m8191T(view);
                }
            });
        }
        CoreMomentEmojiView coreMomentEmojiView = (CoreMomentEmojiView) View.inflate(this.f6368f, f6c0.A7, null);
        coreMomentEmojiView.m2700s(this.f6368f, new e30() { // from class: l.fo7
            public final void call(Object obj) {
                this.f4472a.m8198U((String) obj);
            }
        }, new d30() { // from class: l.go7
            public final void call() {
                this.f4681a.m8199V();
            }
        }, this.f6373k);
        this.f6375m.addView(coreMomentEmojiView);
        this.f6374l = viewInflate.findViewById(u4c0.r3);
        if (upa.z()) {
            soe.a(this.f6373k);
            this.f6373k.setTextColor(getContext().getResources().getColor(w0c0.x));
            this.f6373k.setHintTextColor(getContext().getResources().getColor(w0c0.z));
            this.f6382t.setTextColor(getContext().getResources().getColor(w0c0.z));
            this.f6374l.setImageResource(x2c0.J6);
            textView.setBackgroundResource(x2c0.B5);
        }
        if (z) {
            m8211i0(true);
            xdl0.M(this.f6375m, true);
            xdl0.C0(this.f6375m, Math.max(((Integer) Act.savedKeyboardHeight.get()).intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue()));
            if (this.f6379q) {
                zvf0.A("e_greet_together", this.f6384v, new j760[]{vwb.Y("moments_user_id", this.f6383u)});
                xdl0.M(this.f6380r, true);
            }
        }
        this.f6373k.setFilters(new InputFilter[]{new to8(180)});
        duringCreated(this.f6373k.i(true)).subscribe(mkd0.G(new e30() { // from class: l.ho7
            public final void call(Object obj) {
                this.f4934a.m8200W(textView, (CharSequence) obj);
            }
        }));
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.io7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5183a.m8201X(view);
            }
        });
        xdl0.E0(this.f6373k, new View.OnClickListener() { // from class: l.jo7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5351a.m8202Y(view);
            }
        });
        xdl0.E0(this.f6374l, new View.OnClickListener() { // from class: l.ko7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5683a.m8203Z(view);
            }
        });
        duringCreated(CoreModule.K().m5221u7()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.lo7
            public final void call(Object obj) {
                this.f6177a.m8204a0((j760) obj);
            }
        }));
        viewInflate.findViewById(u4c0.gc).setOnClickListener(new View.OnClickListener() { // from class: l.zn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9282a.m8205b0(view);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m8197R() {
        super.dismiss();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m8198U(String str) {
        if (this.f6373k.getText().toString().length() + str.length() > 180) {
            lsi0.j("最多可输入180字");
            return;
        }
        if (!this.f6385w.contains(str)) {
            this.f6385w.add(str);
        }
        this.f6373k.getText().insert(this.f6373k.getSelectionStart(), str);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m8199V() {
        if (this.f6379q && !this.f6381s.isSelected()) {
            CoreModule.N().S6().put(Long.valueOf(mqi0.o()));
        }
        if (CoreModule.N().ua() && this.f6379q) {
            zvf0.u("e_greet_together", this.f6384v, new j760[]{vwb.Y("moments_user_id", this.f6383u), vwb.Y("selection_situation", this.f6381s.isSelected() ? "1" : "0")});
        }
        m8189P(this.f6368f, this.f6373k);
        this.f6377o.a(this.f6373k.getText().toString(), this.f6385w, Boolean.valueOf(CoreModule.N().ua() && this.f6379q && this.f6381s.isSelected()));
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m8200W(TextView textView, CharSequence charSequence) {
        Editable text = this.f6373k.getText();
        xdl0.M(textView, (text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m8201X(View view) {
        if (this.f6379q && !this.f6381s.isSelected()) {
            CoreModule.N().S6().put(Long.valueOf(mqi0.o()));
        }
        if (CoreModule.N().ua() && this.f6379q) {
            zvf0.u("e_greet_together", this.f6384v, new j760[]{vwb.Y("moments_user_id", this.f6383u), vwb.Y("selection_situation", this.f6381s.isSelected() ? "1" : "0")});
        }
        m8189P(this.f6368f, this.f6373k);
        this.f6377o.a(this.f6373k.getText().toString(), this.f6385w, Boolean.valueOf(CoreModule.N().ua() && this.f6379q && this.f6381s.isSelected()));
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m8202Y(View view) {
        this.f6373k.setCursorVisible(true);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m8203Z(View view) {
        if (this.f6375m.getLayoutParams().height == 0) {
            m8192g0(Math.max(((Integer) Act.savedKeyboardHeight.get()).intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue()));
            if (this.f6379q) {
                zvf0.A("e_greet_together", this.f6384v, new j760[]{vwb.Y("moments_user_id", this.f6383u)});
                xdl0.M(this.f6380r, true);
            }
        }
        e51.J(this.f6386x);
        this.f6373k.setCursorVisible(false);
        m8211i0(true);
        this.f6387y = true;
        xdl0.M(this.f6375m, true);
        m8189P(this.f6368f, this.f6373k);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m8204a0(j760 j760Var) {
        if (((Boolean) j760Var.a).booleanValue()) {
            if (this.f6379q) {
                zvf0.A("e_greet_together", this.f6384v, new j760[]{vwb.Y("moments_user_id", this.f6383u)});
                xdl0.M(this.f6380r, true);
            }
            this.f6378p = true;
            m8211i0(false);
            e51.H(this.f6368f, this.f6386x, 400L);
            if (this.f6375m.getLayoutParams().height == ((Integer) j760Var.b).intValue()) {
                return;
            }
            this.f6369g = true;
            m8192g0(((Integer) j760Var.b).intValue());
            return;
        }
        if (this.f6378p) {
            if (this.f6375m.getLayoutParams().height == 0) {
                m8211i0(false);
            }
            if (this.f6387y) {
                this.f6387y = false;
                return;
            }
            if (this.f6380r.getVisibility() == 0) {
                xdl0.M(this.f6380r, false);
            }
            this.f6375m.setVisibility(4);
            m8188O();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m8205b0(View view) {
        m8189P(this.f6368f, this.f6373k);
        dismiss();
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m8206c0() {
        this.f6373k.requestFocus();
        this.f6368f.showInput(this.f6373k, 2);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m8207d0(DialogInterface dialogInterface) {
        if (this.f6376n) {
            return;
        }
        e51.H(this.f6368f, new Runnable() { // from class: l.bo7
            @Override // java.lang.Runnable
            public final void run() {
                this.f3412a.m8206c0();
            }
        }, 100L);
    }

    public void dismiss() {
        e51.H(this.f6368f, new Runnable() { // from class: l.ao7
            @Override // java.lang.Runnable
            public final void run() {
                this.f2820a.m8197R();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m8208e0(ValueAnimator valueAnimator) {
        xdl0.C0(this.f6375m, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    public void m8209f0() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.yn7
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f9085a.m8207d0(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m8210h0() {
        return ((Long) CoreModule.N().S6().get()).longValue() != 0 && mqi0.C(((Long) CoreModule.N().S6().get()).longValue(), mqi0.o());
    }

    /* JADX INFO: renamed from: i0 */
    public final void m8211i0(boolean z) {
        boolean z2 = upa.z();
        VImage vImage = this.f6374l;
        if (z2) {
            vImage.setImageResource(z ? x2c0.H6 : x2c0.J6);
        } else {
            vImage.setImageResource(z ? x2c0.G6 : x2c0.I6);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m8212j0() {
        boolean z = upa.z();
        VText vText = this.f6382t;
        if (!z) {
            vText.setTextColor(Color.parseColor(this.f6381s.isSelected() ? "#cc000000" : "#33000000"));
            return;
        }
        boolean zIsSelected = this.f6381s.isSelected();
        Act act = this.f6368f;
        vText.setTextColor(zIsSelected ? act.getResources().getColor(w0c0.y) : act.getResources().getColor(w0c0.z));
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
        this.f6372j = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f6372j.setBottomSheetCallback(this.f6388z);
    }

    /* JADX INFO: renamed from: l.mo7$b */
    public class C3381b extends BottomSheetBehavior.BottomSheetCallback {
        public C3381b() {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                mo7.this.f6372j.setState(3);
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
