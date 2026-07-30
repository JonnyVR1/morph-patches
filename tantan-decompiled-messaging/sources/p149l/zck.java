package p149l;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.core.newui.group.GroupCreateNameAct;
import com.p046p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VImage;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class zck implements s7m<pck>, TextWatcher {

    /* JADX INFO: renamed from: a */
    public VScroll f202544a;

    /* JADX INFO: renamed from: b */
    public VText f202545b;

    /* JADX INFO: renamed from: c */
    public CardView f202546c;

    /* JADX INFO: renamed from: d */
    public VImage f202547d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f202548e;

    /* JADX INFO: renamed from: f */
    public VEditText f202549f;

    /* JADX INFO: renamed from: g */
    public VImage f202550g;

    /* JADX INFO: renamed from: h */
    public VButton f202551h;

    /* JADX INFO: renamed from: i */
    public VImage f202552i;

    /* JADX INFO: renamed from: j */
    public final GroupCreateNameAct f202553j;

    /* JADX INFO: renamed from: k */
    public pck f202554k;

    /* JADX INFO: renamed from: l */
    public int f202555l;

    /* JADX INFO: renamed from: l.zck$a */
    public static class C21658a {
        /* JADX INFO: renamed from: b */
        public static void m218063b(zck zckVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            zckVar.f202544a = (VScroll) viewGroup.getChildAt(0);
            zckVar.f202545b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            zckVar.f202546c = (CardView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
            zckVar.f202547d = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
            zckVar.f202548e = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
            zckVar.f202549f = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
            zckVar.f202550g = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
            zckVar.f202551h = (VButton) viewGroup.getChildAt(1);
            zckVar.f202552i = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        }

        /* JADX INFO: renamed from: c */
        public static View m218064c(zck zckVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.f126495j0, viewGroup, false);
            m218063b(zckVar, viewInflate);
            return viewInflate;
        }
    }

    public zck(GroupCreateNameAct groupCreateNameAct) {
        this.f202553j = groupCreateNameAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m218050w(View view) {
        this.f202553j.m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m218051x(View view) {
        this.f202549f.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m218052y() {
        this.f202549f.setFocusable(true);
        this.f202549f.setFocusableInTouchMode(true);
        this.f202549f.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m218053z() {
        int i = this.f202555l;
        int height = this.f202544a.getHeight();
        if (i > 0 && height < i) {
            m218057E();
        }
        this.f202555l = height;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m218054A() {
        this.f202544a.fullScroll(130);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m218055B(Picture picture, int[] iArr) {
        qib0.f154691G.m102327J0(this.f202548e, picture.cover().jpgSquare640(), false);
    }

    /* JADX INFO: renamed from: C */
    public final void m218056C() {
        this.f202550g.setVisibility(this.f202549f.length() > 0 ? 0 : 4);
        this.f202554k.m168353p0(this.f202549f.getText().toString());
        this.f202551h.setEnabled(this.f202554k.m168347i0());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f202553j;
    }

    /* JADX INFO: renamed from: E */
    public void m218057E() {
        this.f202544a.post(new Runnable() { // from class: l.yck
            @Override // java.lang.Runnable
            public final void run() {
                this.f197456a.m218054A();
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public void m218058F(@Nullable final Picture picture) {
        boolean zM81303a = NullChecker.m81303a(picture);
        VImage vImage = this.f202547d;
        if (zM81303a) {
            vImage.setVisibility(8);
            this.f202548e.setVisibility(0);
            xdl0.m208353Q0(this.f202548e, new e30() { // from class: l.qck
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f153760a.m218055B(picture, (int[]) obj);
                }
            });
        } else {
            vImage.setVisibility(0);
            this.f202548e.setVisibility(8);
        }
        this.f202551h.setEnabled(this.f202554k.m168347i0());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        m218056C();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m218060u(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m218059r() {
        if (NullChecker.m81303a(this.f202553j.getSupportActionBar())) {
            this.f202553j.getSupportActionBar().mo134126m();
        }
        xdl0.m208329E0(this.f202552i, new View.OnClickListener() { // from class: l.rck
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158777a.m218050w(view);
            }
        });
        CardView cardView = this.f202546c;
        final pck pckVar = this.f202554k;
        Objects.requireNonNull(pckVar);
        xdl0.m208329E0(cardView, new View.OnClickListener() { // from class: l.sck
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pckVar.m168346h0(view);
            }
        });
        m218058F(null);
        this.f202549f.removeTextChangedListener(this);
        this.f202549f.addTextChangedListener(this);
        m218056C();
        xdl0.m208329E0(this.f202550g, new View.OnClickListener() { // from class: l.tck
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f169449a.m218051x(view);
            }
        });
        VButton vButton = this.f202551h;
        final pck pckVar2 = this.f202554k;
        Objects.requireNonNull(pckVar2);
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.uck
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pckVar2.m168351n0(view);
            }
        });
        VEditText vEditText = this.f202549f;
        final pck pckVar3 = this.f202554k;
        Objects.requireNonNull(pckVar3);
        xdl0.m208329E0(vEditText, new View.OnClickListener() { // from class: l.vck
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pckVar3.m168350m0(view);
            }
        });
        this.f202549f.post(new Runnable() { // from class: l.wck
            @Override // java.lang.Runnable
            public final void run() {
                this.f185695a.m218052y();
            }
        });
        this.f202544a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.xck
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f192238a.m218053z();
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public View m218060u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C21658a.m218064c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(pck pckVar) {
        this.f202554k = pckVar;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
