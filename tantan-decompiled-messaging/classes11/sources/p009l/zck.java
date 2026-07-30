package p009l;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p000p1.mobile.putong.core.newui.group.GroupCreateNameAct;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import l.e30;
import l.l6c0;
import l.qib0;
import l.s7m;
import l.xdl0;
import v.VButton;
import v.VDraweeView;
import v.VEditText;
import v.VImage;
import v.VScroll;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zck implements s7m<pck>, TextWatcher {

    /* JADX INFO: renamed from: a */
    public VScroll f23566a;

    /* JADX INFO: renamed from: b */
    public VText f23567b;

    /* JADX INFO: renamed from: c */
    public CardView f23568c;

    /* JADX INFO: renamed from: d */
    public VImage f23569d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f23570e;

    /* JADX INFO: renamed from: f */
    public VEditText f23571f;

    /* JADX INFO: renamed from: g */
    public VImage f23572g;

    /* JADX INFO: renamed from: h */
    public VButton f23573h;

    /* JADX INFO: renamed from: i */
    public VImage f23574i;

    /* JADX INFO: renamed from: j */
    public final GroupCreateNameAct f23575j;

    /* JADX INFO: renamed from: k */
    public pck f23576k;

    /* JADX INFO: renamed from: l */
    public int f23577l;

    /* JADX INFO: renamed from: l.zck$a */
    public static class C1349a {
        /* JADX INFO: renamed from: b */
        public static void m25695b(zck zckVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            zckVar.f23566a = viewGroup.getChildAt(0);
            zckVar.f23567b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            zckVar.f23568c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
            zckVar.f23569d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
            zckVar.f23570e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
            zckVar.f23571f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
            zckVar.f23572g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
            zckVar.f23573h = viewGroup.getChildAt(1);
            zckVar.f23574i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        }

        /* JADX INFO: renamed from: c */
        public static View m25696c(zck zckVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.j0, viewGroup, false);
            m25695b(zckVar, viewInflate);
            return viewInflate;
        }
    }

    public zck(GroupCreateNameAct groupCreateNameAct) {
        this.f23575j = groupCreateNameAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m25680w(View view) {
        this.f23575j.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m25681x(View view) {
        this.f23571f.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m25682y() {
        this.f23571f.setFocusable(true);
        this.f23571f.setFocusableInTouchMode(true);
        this.f23571f.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m25683z() {
        int i = this.f23577l;
        int height = this.f23566a.getHeight();
        if (i > 0 && height < i) {
            m25688E();
        }
        this.f23577l = height;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m25684A() {
        this.f23566a.fullScroll(130);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m25685B(Picture picture, int[] iArr) {
        qib0.G.J0(this.f23570e, picture.cover().jpgSquare640(), false);
    }

    /* JADX INFO: renamed from: C */
    public final void m25686C() {
        this.f23572g.setVisibility(this.f23571f.length() > 0 ? 0 : 4);
        this.f23576k.m20138p0(this.f23571f.getText().toString());
        this.f23573h.setEnabled(this.f23576k.m20132i0());
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m25687C0() {
        return this.f23575j;
    }

    /* JADX INFO: renamed from: E */
    public void m25688E() {
        this.f23566a.post(new Runnable() { // from class: l.yck
            @Override // java.lang.Runnable
            public final void run() {
                this.f22995a.m25684A();
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public void m25689F(@Nullable final Picture picture) {
        boolean zA = NullChecker.a(picture);
        VImage vImage = this.f23569d;
        if (zA) {
            vImage.setVisibility(8);
            this.f23570e.setVisibility(0);
            xdl0.Q0(this.f23570e, new e30() { // from class: l.qck
                public final void call(Object obj) {
                    this.f19135a.m25685B(picture, (int[]) obj);
                }
            });
        } else {
            vImage.setVisibility(0);
            this.f23570e.setVisibility(8);
        }
        this.f23573h.setEnabled(this.f23576k.m20132i0());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        m25686C();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m25692u(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m25691r() {
        if (NullChecker.a(this.f23575j.getSupportActionBar())) {
            this.f23575j.getSupportActionBar().m();
        }
        xdl0.E0(this.f23574i, new View.OnClickListener() { // from class: l.rck
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19734a.m25680w(view);
            }
        });
        CardView cardView = this.f23568c;
        final pck pckVar = this.f23576k;
        Objects.requireNonNull(pckVar);
        xdl0.E0(cardView, new View.OnClickListener() { // from class: l.sck
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pckVar.m20131h0(view);
            }
        });
        m25689F(null);
        this.f23571f.removeTextChangedListener(this);
        this.f23571f.addTextChangedListener(this);
        m25686C();
        xdl0.E0(this.f23572g, new View.OnClickListener() { // from class: l.tck
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20612a.m25681x(view);
            }
        });
        VButton vButton = this.f23573h;
        final pck pckVar2 = this.f23576k;
        Objects.requireNonNull(pckVar2);
        xdl0.E0(vButton, new View.OnClickListener() { // from class: l.uck
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pckVar2.m20136n0(view);
            }
        });
        VEditText vEditText = this.f23571f;
        final pck pckVar3 = this.f23576k;
        Objects.requireNonNull(pckVar3);
        xdl0.E0(vEditText, new View.OnClickListener() { // from class: l.vck
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pckVar3.m20135m0(view);
            }
        });
        this.f23571f.post(new Runnable() { // from class: l.wck
            @Override // java.lang.Runnable
            public final void run() {
                this.f22001a.m25682y();
            }
        });
        this.f23566a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.xck
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f22508a.m25683z();
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public View m25692u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C1349a.m25696c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m25690i1(pck pckVar) {
        this.f23576k = pckVar;
    }

    public void destroy() {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
