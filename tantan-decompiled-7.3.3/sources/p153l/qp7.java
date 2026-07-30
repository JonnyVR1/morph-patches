package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.emoji.CoreMomentEmojiView;
import com.p051p1.mobile.putong.newui.view.MessageInputEditView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class qp7 extends pej0 {

    /* JADX INFO: renamed from: f */
    public Act f158824f;

    /* JADX INFO: renamed from: g */
    public boolean f158825g;

    /* JADX INFO: renamed from: h */
    public Interpolator f158826h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f158827i;

    /* JADX INFO: renamed from: j */
    public BottomSheetBehavior f158828j;

    /* JADX INFO: renamed from: k */
    public MessageInputEditView f158829k;

    /* JADX INFO: renamed from: l */
    public VImage f158830l;

    /* JADX INFO: renamed from: m */
    public VLinear f158831m;

    /* JADX INFO: renamed from: n */
    public boolean f158832n;

    /* JADX INFO: renamed from: o */
    public a30<String, List<String>, Boolean> f158833o;

    /* JADX INFO: renamed from: p */
    public boolean f158834p;

    /* JADX INFO: renamed from: q */
    public boolean f158835q;

    /* JADX INFO: renamed from: r */
    public VLinear f158836r;

    /* JADX INFO: renamed from: s */
    public VImage f158837s;

    /* JADX INFO: renamed from: t */
    public VText f158838t;

    /* JADX INFO: renamed from: u */
    public String f158839u;

    /* JADX INFO: renamed from: v */
    public String f158840v;

    /* JADX INFO: renamed from: w */
    public List<String> f158841w;

    /* JADX INFO: renamed from: x */
    public Runnable f158842x;

    /* JADX INFO: renamed from: y */
    public boolean f158843y;

    /* JADX INFO: renamed from: z */
    public BottomSheetBehavior.BottomSheetCallback f158844z;

    /* JADX INFO: renamed from: l.qp7$a */
    public class RunnableC19620a implements Runnable {
        public RunnableC19620a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            qp7.this.f158831m.setVisibility(4);
        }
    }

    public qp7(String str, String str2, boolean z, @LayoutRes int i, @NonNull Context context, int i2, boolean z2, a30<String, List<String>, Boolean> a30Var) {
        super(context, i2);
        this.f158825g = false;
        this.f158826h = new xjg();
        this.f158827i = null;
        this.f158841w = new ArrayList();
        this.f158842x = new RunnableC19620a();
        this.f158843y = false;
        this.f158844z = new C19621b();
        this.f158840v = str;
        this.f158839u = str2;
        this.f158835q = z;
        this.f158832n = z2;
        this.f158833o = a30Var;
        m177431Q(i, context, z2);
    }

    /* JADX INFO: renamed from: O */
    private void m177423O() {
        if (!this.f158825g && NullChecker.m82486a(this.f158827i)) {
            this.f158827i.cancel();
        }
        this.f158825g = false;
        m177427g0(0);
    }

    /* JADX INFO: renamed from: P */
    public static void m177424P(Act act, View view) {
        ((InputMethodManager) act.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m177425S(DialogInterface dialogInterface) {
        l51.m152890J(this.f158842x);
        this.f158824f.alwaysHideInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m177426T(View view) {
        VImage vImage = this.f158837s;
        vImage.setSelected(!vImage.isSelected());
        m177447j0();
    }

    /* JADX INFO: renamed from: g0 */
    private void m177427g0(int i) {
        if (i == 0) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f158831m.getLayoutParams().height, 0);
            this.f158827i = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(150L);
        } else {
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, i);
            this.f158827i = valueAnimatorOfInt2;
            valueAnimatorOfInt2.setDuration(100L);
        }
        this.f158827i.setInterpolator(this.f158826h);
        this.f158827i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.gp7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f105438a.m177443e0(valueAnimator);
            }
        });
        this.f158827i.start();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: Q */
    public final void m177431Q(@LayoutRes int i, Context context, boolean z) {
        this.f158824f = (Act) context;
        View viewInflate = p9r.m171370a(context).inflate(kec0.f126077u1, (ViewGroup) null);
        setContentView(viewInflate);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.hp7
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f110984a.m177425S(dialogInterface);
            }
        });
        this.f158829k = (MessageInputEditView) viewInflate.findViewById(adc0.f70124Sd);
        final TextView textView = (TextView) viewInflate.findViewById(adc0.f70238Zb);
        this.f158829k.setHint(R$string.f18868T1);
        this.f158831m = (VLinear) viewInflate.findViewById(adc0.f70585u3);
        this.f158836r = (VLinear) viewInflate.findViewById(adc0.f70108Re);
        this.f158837s = (VImage) viewInflate.findViewById(adc0.f70081Q4);
        this.f158838t = (VText) viewInflate.findViewById(adc0.f70115S4);
        if (CoreModule.m30932N().mo61579ua()) {
            this.f158837s.setSelected(!m177445h0());
            m177447j0();
            bnl0.m105509E0(this.f158837s, new View.OnClickListener() { // from class: l.ip7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f116259a.m177426T(view);
                }
            });
        }
        CoreMomentEmojiView coreMomentEmojiView = (CoreMomentEmojiView) View.inflate(this.f158824f, kec0.f125440H7, null);
        coreMomentEmojiView.m46558s(this.f158824f, new y20() { // from class: l.jp7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122079a.m177433U((String) obj);
            }
        }, new x20() { // from class: l.kp7
            @Override // p153l.x20
            public final void call() {
                this.f127835a.m177434V();
            }
        }, this.f158829k);
        this.f158831m.addView(coreMomentEmojiView);
        this.f158830l = (VImage) viewInflate.findViewById(adc0.f70568t3);
        if (gra.m131778z()) {
            wpe.m207454a(this.f158829k);
            this.f158829k.setTextColor(getContext().getResources().getColor(c9c0.f80469x));
            this.f158829k.setHintTextColor(getContext().getResources().getColor(c9c0.f80475z));
            this.f158838t.setTextColor(getContext().getResources().getColor(c9c0.f80475z));
            this.f158830l.setImageResource(dbc0.f86303K6);
            textView.setBackgroundResource(dbc0.f86046C5);
        }
        if (z) {
            m177446i0(true);
            bnl0.m105524M(this.f158831m, true);
            bnl0.m105505C0(this.f158831m, Math.max(Act.savedKeyboardHeight.get().intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue()));
            if (this.f158835q) {
                i4g0.m138492A("e_greet_together", this.f158840v, jyb.m147494Y("moments_user_id", this.f158839u));
                bnl0.m105524M(this.f158836r, true);
            }
        }
        this.f158829k.setFilters(new InputFilter[]{new yp8(180)});
        duringCreated(this.f158829k.mo29617i(true)).subscribe(psd0.m173596G(new y20() { // from class: l.lp7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133017a.m177435W(textView, (CharSequence) obj);
            }
        }));
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.mp7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137882a.m177436X(view);
            }
        });
        bnl0.m105509E0(this.f158829k, new View.OnClickListener() { // from class: l.np7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143075a.m177437Y(view);
            }
        });
        bnl0.m105509E0(this.f158830l, new View.OnClickListener() { // from class: l.op7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148421a.m177438Z(view);
            }
        });
        duringCreated(CoreModule.m30930K().mo31826u7()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.pp7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153488a.m177439a0((pf60) obj);
            }
        }));
        viewInflate.findViewById(adc0.f70391ic).setOnClickListener(new View.OnClickListener() { // from class: l.dp7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90029a.m177440b0(view);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m177432R() {
        super.m176562T();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m177433U(String str) {
        if (this.f158829k.getText().toString().length() + str.length() > 180) {
            o1j0.m165636j("最多可输入180字");
            return;
        }
        if (!this.f158841w.contains(str)) {
            this.f158841w.add(str);
        }
        this.f158829k.getText().insert(this.f158829k.getSelectionStart(), str);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m177434V() {
        if (this.f158835q && !this.f158837s.isSelected()) {
            CoreModule.m30932N().mo61499S6().put(Long.valueOf(pzi0.m174454o()));
        }
        if (CoreModule.m30932N().mo61579ua() && this.f158835q) {
            i4g0.m138523u("e_greet_together", this.f158840v, jyb.m147494Y("moments_user_id", this.f158839u), jyb.m147494Y("selection_situation", this.f158837s.isSelected() ? "1" : "0"));
        }
        m177424P(this.f158824f, this.f158829k);
        this.f158833o.mo37058a(this.f158829k.getText().toString(), this.f158841w, Boolean.valueOf(CoreModule.m30932N().mo61579ua() && this.f158835q && this.f158837s.isSelected()));
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m177435W(TextView textView, CharSequence charSequence) {
        Editable text = this.f158829k.getText();
        bnl0.m105524M(textView, (text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m177436X(View view) {
        if (this.f158835q && !this.f158837s.isSelected()) {
            CoreModule.m30932N().mo61499S6().put(Long.valueOf(pzi0.m174454o()));
        }
        if (CoreModule.m30932N().mo61579ua() && this.f158835q) {
            i4g0.m138523u("e_greet_together", this.f158840v, jyb.m147494Y("moments_user_id", this.f158839u), jyb.m147494Y("selection_situation", this.f158837s.isSelected() ? "1" : "0"));
        }
        m177424P(this.f158824f, this.f158829k);
        this.f158833o.mo37058a(this.f158829k.getText().toString(), this.f158841w, Boolean.valueOf(CoreModule.m30932N().mo61579ua() && this.f158835q && this.f158837s.isSelected()));
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m177437Y(View view) {
        this.f158829k.setCursorVisible(true);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m177438Z(View view) {
        if (this.f158831m.getLayoutParams().height == 0) {
            m177427g0(Math.max(Act.savedKeyboardHeight.get().intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue()));
            if (this.f158835q) {
                i4g0.m138492A("e_greet_together", this.f158840v, jyb.m147494Y("moments_user_id", this.f158839u));
                bnl0.m105524M(this.f158836r, true);
            }
        }
        l51.m152890J(this.f158842x);
        this.f158829k.setCursorVisible(false);
        m177446i0(true);
        this.f158843y = true;
        bnl0.m105524M(this.f158831m, true);
        m177424P(this.f158824f, this.f158829k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m177439a0(pf60 pf60Var) {
        if (((Boolean) pf60Var.f152156a).booleanValue()) {
            if (this.f158835q) {
                i4g0.m138492A("e_greet_together", this.f158840v, jyb.m147494Y("moments_user_id", this.f158839u));
                bnl0.m105524M(this.f158836r, true);
            }
            this.f158834p = true;
            m177446i0(false);
            l51.m152888H(this.f158824f, this.f158842x, 400L);
            if (this.f158831m.getLayoutParams().height == ((Integer) pf60Var.f152157b).intValue()) {
                return;
            }
            this.f158825g = true;
            m177427g0(((Integer) pf60Var.f152157b).intValue());
            return;
        }
        if (this.f158834p) {
            if (this.f158831m.getLayoutParams().height == 0) {
                m177446i0(false);
            }
            if (this.f158843y) {
                this.f158843y = false;
                return;
            }
            if (this.f158836r.getVisibility() == 0) {
                bnl0.m105524M(this.f158836r, false);
            }
            this.f158831m.setVisibility(4);
            m177423O();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m177440b0(View view) {
        m177424P(this.f158824f, this.f158829k);
        m176562T();
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m177441c0() {
        this.f158829k.requestFocus();
        this.f158824f.showInput(this.f158829k, 2);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m177442d0(DialogInterface dialogInterface) {
        if (this.f158832n) {
            return;
        }
        l51.m152888H(this.f158824f, new Runnable() { // from class: l.fp7
            @Override // java.lang.Runnable
            public final void run() {
                this.f100113a.m177441c0();
            }
        }, 100L);
    }

    @Override // p153l.pej0, android.app.Dialog, android.content.DialogInterface
    /* JADX INFO: renamed from: dismiss */
    public void m176562T() {
        l51.m152888H(this.f158824f, new Runnable() { // from class: l.ep7
            @Override // java.lang.Runnable
            public final void run() {
                this.f95208a.m177432R();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m177443e0(ValueAnimator valueAnimator) {
        bnl0.m105505C0(this.f158831m, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: f0 */
    public void m177444f0() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.cp7
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f82963a.m177442d0(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m177445h0() {
        return CoreModule.m30932N().mo61499S6().get().longValue() != 0 && pzi0.m174438C(CoreModule.m30932N().mo61499S6().get().longValue(), pzi0.m174454o());
    }

    /* JADX INFO: renamed from: i0 */
    public final void m177446i0(boolean z) {
        boolean zM131778z = gra.m131778z();
        VImage vImage = this.f158830l;
        if (zM131778z) {
            vImage.setImageResource(z ? dbc0.f86239I6 : dbc0.f86303K6);
        } else {
            vImage.setImageResource(z ? dbc0.f86207H6 : dbc0.f86271J6);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m177447j0() {
        boolean zM131778z = gra.m131778z();
        VText vText = this.f158838t;
        if (!zM131778z) {
            vText.setTextColor(Color.parseColor(this.f158837s.isSelected() ? "#cc000000" : "#33000000"));
            return;
        }
        boolean zIsSelected = this.f158837s.isSelected();
        Act act = this.f158824f;
        vText.setTextColor(zIsSelected ? act.getResources().getColor(c9c0.f80472y) : act.getResources().getColor(c9c0.f80475z));
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
        this.f158828j = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f158828j.setBottomSheetCallback(this.f158844z);
    }

    /* JADX INFO: renamed from: l.qp7$b */
    public class C19621b extends BottomSheetBehavior.BottomSheetCallback {
        public C19621b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                qp7.this.f158828j.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
