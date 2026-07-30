package p153l;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.core.newui.group.GroupCreateNameAct;
import com.p051p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VImage;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class pfk implements iam<ffk>, TextWatcher {

    /* JADX INFO: renamed from: a */
    public VScroll f152182a;

    /* JADX INFO: renamed from: b */
    public VText f152183b;

    /* JADX INFO: renamed from: c */
    public CardView f152184c;

    /* JADX INFO: renamed from: d */
    public VImage f152185d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f152186e;

    /* JADX INFO: renamed from: f */
    public VEditText f152187f;

    /* JADX INFO: renamed from: g */
    public VImage f152188g;

    /* JADX INFO: renamed from: h */
    public VButton f152189h;

    /* JADX INFO: renamed from: i */
    public VImage f152190i;

    /* JADX INFO: renamed from: j */
    public final GroupCreateNameAct f152191j;

    /* JADX INFO: renamed from: k */
    public ffk f152192k;

    /* JADX INFO: renamed from: l */
    public int f152193l;

    /* JADX INFO: renamed from: l.pfk$a */
    public static class C19360a {
        /* JADX INFO: renamed from: b */
        public static void m172131b(pfk pfkVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            pfkVar.f152182a = (VScroll) viewGroup.getChildAt(0);
            pfkVar.f152183b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            pfkVar.f152184c = (CardView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
            pfkVar.f152185d = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
            pfkVar.f152186e = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
            pfkVar.f152187f = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
            pfkVar.f152188g = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
            pfkVar.f152189h = (VButton) viewGroup.getChildAt(1);
            pfkVar.f152190i = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        }

        /* JADX INFO: renamed from: c */
        public static View m172132c(pfk pfkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(qec0.f157051j0, viewGroup, false);
            m172131b(pfkVar, viewInflate);
            return viewInflate;
        }
    }

    public pfk(GroupCreateNameAct groupCreateNameAct) {
        this.f152191j = groupCreateNameAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m172118w(View view) {
        this.f152191j.m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m172119x(View view) {
        this.f152187f.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m172120y() {
        this.f152187f.setFocusable(true);
        this.f152187f.setFocusableInTouchMode(true);
        this.f152187f.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m172121z() {
        int i = this.f152193l;
        int height = this.f152182a.getHeight();
        if (i > 0 && height < i) {
            m172125E();
        }
        this.f152193l = height;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m172122A() {
        this.f152182a.fullScroll(130);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m172123B(Picture picture, int[] iArr) {
        uqb0.f180374G.m127111J0(this.f152186e, picture.cover().jpgSquare640(), false);
    }

    /* JADX INFO: renamed from: C */
    public final void m172124C() {
        this.f152188g.setVisibility(this.f152187f.length() > 0 ? 0 : 4);
        this.f152192k.m125400p0(this.f152187f.getText().toString());
        this.f152189h.setEnabled(this.f152192k.m125394i0());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f152191j;
    }

    /* JADX INFO: renamed from: E */
    public void m172125E() {
        this.f152182a.post(new Runnable() { // from class: l.ofk
            @Override // java.lang.Runnable
            public final void run() {
                this.f147087a.m172122A();
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public void m172126F(@Nullable final Picture picture) {
        boolean zM82486a = NullChecker.m82486a(picture);
        VImage vImage = this.f152185d;
        if (zM82486a) {
            vImage.setVisibility(8);
            this.f152186e.setVisibility(0);
            bnl0.m105533Q0(this.f152186e, new y20() { // from class: l.gfk
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f103938a.m172123B(picture, (int[]) obj);
                }
            });
        } else {
            vImage.setVisibility(0);
            this.f152186e.setVisibility(8);
        }
        this.f152189h.setEnabled(this.f152192k.m125394i0());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        m172124C();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m172128u(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m172127r() {
        if (NullChecker.m82486a(this.f152191j.getSupportActionBar())) {
            this.f152191j.getSupportActionBar().mo102186m();
        }
        bnl0.m105509E0(this.f152190i, new View.OnClickListener() { // from class: l.hfk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109310a.m172118w(view);
            }
        });
        CardView cardView = this.f152184c;
        final ffk ffkVar = this.f152192k;
        Objects.requireNonNull(ffkVar);
        bnl0.m105509E0(cardView, new View.OnClickListener() { // from class: l.ifk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ffkVar.m125393h0(view);
            }
        });
        m172126F(null);
        this.f152187f.removeTextChangedListener(this);
        this.f152187f.addTextChangedListener(this);
        m172124C();
        bnl0.m105509E0(this.f152188g, new View.OnClickListener() { // from class: l.jfk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120597a.m172119x(view);
            }
        });
        VButton vButton = this.f152189h;
        final ffk ffkVar2 = this.f152192k;
        Objects.requireNonNull(ffkVar2);
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.kfk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ffkVar2.m125398n0(view);
            }
        });
        VEditText vEditText = this.f152187f;
        final ffk ffkVar3 = this.f152192k;
        Objects.requireNonNull(ffkVar3);
        bnl0.m105509E0(vEditText, new View.OnClickListener() { // from class: l.lfk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ffkVar3.m125397m0(view);
            }
        });
        this.f152187f.post(new Runnable() { // from class: l.mfk
            @Override // java.lang.Runnable
            public final void run() {
                this.f136654a.m172120y();
            }
        });
        this.f152182a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.nfk
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f141742a.m172121z();
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public View m172128u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C19360a.m172132c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ffk ffkVar) {
        this.f152192k = ffkVar;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
