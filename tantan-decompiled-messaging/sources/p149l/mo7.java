package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.emoji.CoreMomentEmojiView;
import com.p046p1.mobile.putong.newui.view.MessageInputEditView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class mo7 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public Act f134846f;

    /* JADX INFO: renamed from: g */
    public boolean f134847g;

    /* JADX INFO: renamed from: h */
    public Interpolator f134848h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f134849i;

    /* JADX INFO: renamed from: j */
    public BottomSheetBehavior f134850j;

    /* JADX INFO: renamed from: k */
    public MessageInputEditView f134851k;

    /* JADX INFO: renamed from: l */
    public VImage f134852l;

    /* JADX INFO: renamed from: m */
    public VLinear f134853m;

    /* JADX INFO: renamed from: n */
    public boolean f134854n;

    /* JADX INFO: renamed from: o */
    public g30<String, List<String>, Boolean> f134855o;

    /* JADX INFO: renamed from: p */
    public boolean f134856p;

    /* JADX INFO: renamed from: q */
    public boolean f134857q;

    /* JADX INFO: renamed from: r */
    public VLinear f134858r;

    /* JADX INFO: renamed from: s */
    public VImage f134859s;

    /* JADX INFO: renamed from: t */
    public VText f134860t;

    /* JADX INFO: renamed from: u */
    public String f134861u;

    /* JADX INFO: renamed from: v */
    public String f134862v;

    /* JADX INFO: renamed from: w */
    public List<String> f134863w;

    /* JADX INFO: renamed from: x */
    public Runnable f134864x;

    /* JADX INFO: renamed from: y */
    public boolean f134865y;

    /* JADX INFO: renamed from: z */
    public BottomSheetBehavior.BottomSheetCallback f134866z;

    /* JADX INFO: renamed from: l.mo7$a */
    public class RunnableC18517a implements Runnable {
        public RunnableC18517a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            mo7.this.f134853m.setVisibility(4);
        }
    }

    public mo7(String str, String str2, boolean z, @LayoutRes int i, @NonNull Context context, int i2, boolean z2, g30<String, List<String>, Boolean> g30Var) {
        super(context, i2);
        this.f134847g = false;
        this.f134848h = new jig();
        this.f134849i = null;
        this.f134863w = new ArrayList();
        this.f134864x = new RunnableC18517a();
        this.f134865y = false;
        this.f134866z = new C18518b();
        this.f134862v = str;
        this.f134861u = str2;
        this.f134857q = z;
        this.f134854n = z2;
        this.f134855o = g30Var;
        m155642Q(i, context, z2);
    }

    /* JADX INFO: renamed from: O */
    private void m155634O() {
        if (!this.f134847g && NullChecker.m81303a(this.f134849i)) {
            this.f134849i.cancel();
        }
        this.f134847g = false;
        m155638g0(0);
    }

    /* JADX INFO: renamed from: P */
    public static void m155635P(Act act, View view) {
        ((InputMethodManager) act.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m155636S(DialogInterface dialogInterface) {
        e51.m114745J(this.f134864x);
        this.f134846f.alwaysHideInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m155637T(View view) {
        VImage vImage = this.f134859s;
        vImage.setSelected(!vImage.isSelected());
        m155658j0();
    }

    /* JADX INFO: renamed from: g0 */
    private void m155638g0(int i) {
        if (i == 0) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f134853m.getLayoutParams().height, 0);
            this.f134849i = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(150L);
        } else {
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, i);
            this.f134849i = valueAnimatorOfInt2;
            valueAnimatorOfInt2.setDuration(100L);
        }
        this.f134849i.setInterpolator(this.f134848h);
        this.f134849i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.co7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f81752a.m155654e0(valueAnimator);
            }
        });
        this.f134849i.start();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: Q */
    public final void m155642Q(@LayoutRes int i, Context context, boolean z) {
        this.f134846f = (Act) context;
        View viewInflate = o7r.m163037a(context).inflate(f6c0.f96023u1, (ViewGroup) null);
        setContentView(viewInflate);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.do7
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f87135a.m155636S(dialogInterface);
            }
        });
        this.f134851k = (MessageInputEditView) viewInflate.findViewById(u4c0.f173985Pd);
        final TextView textView = (TextView) viewInflate.findViewById(u4c0.f174115Xb);
        this.f134851k.setHint(R$string.f18138T1);
        this.f134853m = (VLinear) viewInflate.findViewById(u4c0.f174460s3);
        this.f134858r = (VLinear) viewInflate.findViewById(u4c0.f173969Oe);
        this.f134859s = (VImage) viewInflate.findViewById(u4c0.f173959O4);
        this.f134860t = (VText) viewInflate.findViewById(u4c0.f173993Q4);
        if (CoreModule.m29934N().mo60395ua()) {
            this.f134859s.setSelected(!m155656h0());
            m155658j0();
            xdl0.m208329E0(this.f134859s, new View.OnClickListener() { // from class: l.eo7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f92425a.m155637T(view);
                }
            });
        }
        CoreMomentEmojiView coreMomentEmojiView = (CoreMomentEmojiView) View.inflate(this.f134846f, f6c0.f95274A7, null);
        coreMomentEmojiView.m45375s(this.f134846f, new e30() { // from class: l.fo7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98513a.m155644U((String) obj);
            }
        }, new d30() { // from class: l.go7
            @Override // p149l.d30
            public final void call() {
                this.f103657a.m155645V();
            }
        }, this.f134851k);
        this.f134853m.addView(coreMomentEmojiView);
        this.f134852l = (VImage) viewInflate.findViewById(u4c0.f174443r3);
        if (upa.m194847z()) {
            soe.m185291a(this.f134851k);
            this.f134851k.setTextColor(getContext().getResources().getColor(w0c0.f183899x));
            this.f134851k.setHintTextColor(getContext().getResources().getColor(w0c0.f183905z));
            this.f134860t.setTextColor(getContext().getResources().getColor(w0c0.f183905z));
            this.f134852l.setImageResource(x2c0.f189445J6);
            textView.setBackgroundResource(x2c0.f189191B5);
        }
        if (z) {
            m155657i0(true);
            xdl0.m208344M(this.f134853m, true);
            xdl0.m208325C0(this.f134853m, Math.max(Act.savedKeyboardHeight.get().intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue()));
            if (this.f134857q) {
                zvf0.m220368A("e_greet_together", this.f134862v, vwb.m200311Y("moments_user_id", this.f134861u));
                xdl0.m208344M(this.f134858r, true);
            }
        }
        this.f134851k.setFilters(new InputFilter[]{new to8(180)});
        duringCreated(this.f134851k.mo28618i(true)).subscribe(mkd0.m154955G(new e30() { // from class: l.ho7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108796a.m155646W(textView, (CharSequence) obj);
            }
        }));
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.io7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114108a.m155647X(view);
            }
        });
        xdl0.m208329E0(this.f134851k, new View.OnClickListener() { // from class: l.jo7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118918a.m155648Y(view);
            }
        });
        xdl0.m208329E0(this.f134852l, new View.OnClickListener() { // from class: l.ko7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123967a.m155649Z(view);
            }
        });
        duringCreated(CoreModule.m29932K().mo30823u7()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.lo7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129076a.m155650a0((j760) obj);
            }
        }));
        viewInflate.findViewById(u4c0.f174266gc).setOnClickListener(new View.OnClickListener() { // from class: l.zn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203968a.m155651b0(view);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m155643R() {
        super.m101651T();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m155644U(String str) {
        if (this.f134851k.getText().toString().length() + str.length() > 180) {
            lsi0.m151580j("最多可输入180字");
            return;
        }
        if (!this.f134863w.contains(str)) {
            this.f134863w.add(str);
        }
        this.f134851k.getText().insert(this.f134851k.getSelectionStart(), str);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m155645V() {
        if (this.f134857q && !this.f134859s.isSelected()) {
            CoreModule.m29934N().mo60315S6().put(Long.valueOf(mqi0.m155944o()));
        }
        if (CoreModule.m29934N().mo60395ua() && this.f134857q) {
            zvf0.m220399u("e_greet_together", this.f134862v, vwb.m200311Y("moments_user_id", this.f134861u), vwb.m200311Y("selection_situation", this.f134859s.isSelected() ? "1" : "0"));
        }
        m155635P(this.f134846f, this.f134851k);
        this.f134855o.mo36055a(this.f134851k.getText().toString(), this.f134863w, Boolean.valueOf(CoreModule.m29934N().mo60395ua() && this.f134857q && this.f134859s.isSelected()));
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m155646W(TextView textView, CharSequence charSequence) {
        Editable text = this.f134851k.getText();
        xdl0.m208344M(textView, (text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m155647X(View view) {
        if (this.f134857q && !this.f134859s.isSelected()) {
            CoreModule.m29934N().mo60315S6().put(Long.valueOf(mqi0.m155944o()));
        }
        if (CoreModule.m29934N().mo60395ua() && this.f134857q) {
            zvf0.m220399u("e_greet_together", this.f134862v, vwb.m200311Y("moments_user_id", this.f134861u), vwb.m200311Y("selection_situation", this.f134859s.isSelected() ? "1" : "0"));
        }
        m155635P(this.f134846f, this.f134851k);
        this.f134855o.mo36055a(this.f134851k.getText().toString(), this.f134863w, Boolean.valueOf(CoreModule.m29934N().mo60395ua() && this.f134857q && this.f134859s.isSelected()));
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m155648Y(View view) {
        this.f134851k.setCursorVisible(true);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m155649Z(View view) {
        if (this.f134853m.getLayoutParams().height == 0) {
            m155638g0(Math.max(Act.savedKeyboardHeight.get().intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue()));
            if (this.f134857q) {
                zvf0.m220368A("e_greet_together", this.f134862v, vwb.m200311Y("moments_user_id", this.f134861u));
                xdl0.m208344M(this.f134858r, true);
            }
        }
        e51.m114745J(this.f134864x);
        this.f134851k.setCursorVisible(false);
        m155657i0(true);
        this.f134865y = true;
        xdl0.m208344M(this.f134853m, true);
        m155635P(this.f134846f, this.f134851k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m155650a0(j760 j760Var) {
        if (((Boolean) j760Var.f116564a).booleanValue()) {
            if (this.f134857q) {
                zvf0.m220368A("e_greet_together", this.f134862v, vwb.m200311Y("moments_user_id", this.f134861u));
                xdl0.m208344M(this.f134858r, true);
            }
            this.f134856p = true;
            m155657i0(false);
            e51.m114743H(this.f134846f, this.f134864x, 400L);
            if (this.f134853m.getLayoutParams().height == ((Integer) j760Var.f116565b).intValue()) {
                return;
            }
            this.f134847g = true;
            m155638g0(((Integer) j760Var.f116565b).intValue());
            return;
        }
        if (this.f134856p) {
            if (this.f134853m.getLayoutParams().height == 0) {
                m155657i0(false);
            }
            if (this.f134865y) {
                this.f134865y = false;
                return;
            }
            if (this.f134858r.getVisibility() == 0) {
                xdl0.m208344M(this.f134858r, false);
            }
            this.f134853m.setVisibility(4);
            m155634O();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m155651b0(View view) {
        m155635P(this.f134846f, this.f134851k);
        m101651T();
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m155652c0() {
        this.f134851k.requestFocus();
        this.f134846f.showInput(this.f134851k, 2);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m155653d0(DialogInterface dialogInterface) {
        if (this.f134854n) {
            return;
        }
        e51.m114743H(this.f134846f, new Runnable() { // from class: l.bo7
            @Override // java.lang.Runnable
            public final void run() {
                this.f76482a.m155652c0();
            }
        }, 100L);
    }

    @Override // p149l.l5j0, android.app.Dialog, android.content.DialogInterface
    /* JADX INFO: renamed from: dismiss */
    public void m101651T() {
        e51.m114743H(this.f134846f, new Runnable() { // from class: l.ao7
            @Override // java.lang.Runnable
            public final void run() {
                this.f70790a.m155643R();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m155654e0(ValueAnimator valueAnimator) {
        xdl0.m208325C0(this.f134853m, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: f0 */
    public void m155655f0() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.yn7
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f199147a.m155653d0(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m155656h0() {
        return CoreModule.m29934N().mo60315S6().get().longValue() != 0 && mqi0.m155928C(CoreModule.m29934N().mo60315S6().get().longValue(), mqi0.m155944o());
    }

    /* JADX INFO: renamed from: i0 */
    public final void m155657i0(boolean z) {
        boolean zM194847z = upa.m194847z();
        VImage vImage = this.f134852l;
        if (zM194847z) {
            vImage.setImageResource(z ? x2c0.f189383H6 : x2c0.f189445J6);
        } else {
            vImage.setImageResource(z ? x2c0.f189352G6 : x2c0.f189414I6);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m155658j0() {
        boolean zM194847z = upa.m194847z();
        VText vText = this.f134860t;
        if (!zM194847z) {
            vText.setTextColor(Color.parseColor(this.f134859s.isSelected() ? "#cc000000" : "#33000000"));
            return;
        }
        boolean zIsSelected = this.f134859s.isSelected();
        Act act = this.f134846f;
        vText.setTextColor(zIsSelected ? act.getResources().getColor(w0c0.f183902y) : act.getResources().getColor(w0c0.f183905z));
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
        this.f134850j = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f134850j.setBottomSheetCallback(this.f134866z);
    }

    /* JADX INFO: renamed from: l.mo7$b */
    public class C18518b extends BottomSheetBehavior.BottomSheetCallback {
        public C18518b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                mo7.this.f134850j.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
