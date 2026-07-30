package p003l;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.StickStatus;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.profile.MediaReorderCard;
import com.p1.mobile.putong.core.ui.profile.MediaReorderCards;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.a2m;
import l.g30;
import l.pj90;
import l.s7m;
import l.upa;
import l.w0c0;
import l.xdl0;
import l.xh0;
import l.zvf0;
import v.VLinear;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class k3g implements s7m<d3g> {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f5417a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f5418b;

    /* JADX INFO: renamed from: c */
    public VText f5419c;

    /* JADX INFO: renamed from: d */
    public VLinear f5420d;

    /* JADX INFO: renamed from: e */
    public VText f5421e;

    /* JADX INFO: renamed from: f */
    public VText f5422f;

    /* JADX INFO: renamed from: g */
    public Act f5423g;

    /* JADX INFO: renamed from: h */
    public Pair<View, MediaReorderCards> f5424h;

    /* JADX INFO: renamed from: i */
    public MediaReorderCards f5425i;

    /* JADX INFO: renamed from: j */
    public d3g f5426j;

    /* JADX INFO: renamed from: k */
    public User f5427k;

    /* JADX INFO: renamed from: l */
    public final a2m f5428l = new C3356a();

    /* JADX INFO: renamed from: m */
    public ClickableSpan f5429m = new C3357b();

    /* JADX INFO: renamed from: l.k3g$a */
    public class C3356a implements a2m {
        public C3356a() {
        }

        /* JADX INFO: renamed from: b */
        public void m7524b() {
            k3g.this.m7523z();
        }

        /* JADX INFO: renamed from: c */
        public void m7525c() {
            k3g.this.m7523z();
        }

        /* JADX INFO: renamed from: d */
        public void m7526d() {
            k3g.this.m7523z();
        }
    }

    /* JADX INFO: renamed from: l.k3g$b */
    public class C3357b extends ClickableSpan {
        public C3357b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            gxf gxfVar = new gxf(k3g.this.f5423g);
            gxfVar.m6854C(CoreModule.c.e0.Z7(), true, k3g.this.f5423g.pageId());
            gxfVar.show();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.bgColor = k3g.this.act().getResources().getColor(w0c0.b2);
        }
    }

    public k3g(Act act) {
        this.f5423g = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m7502q(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m7503s(View view) {
        m7515n();
        zvf0.r("e_confirm_upload_done", this.f5423g.pageId());
    }

    /* JADX INFO: renamed from: A */
    public void m7504A(List<Media> list) {
        for (int i = 0; i < 6; i++) {
            int size = list.size();
            MediaReorderCards mediaReorderCards = this.f5425i;
            if (i < size) {
                mediaReorderCards.h(i).C1(list.get(i));
            } else {
                mediaReorderCards.h(i).C1((Media) null);
            }
            this.f5425i.h(i).setChangeAction(new g30() { // from class: l.h3g
                /* JADX INFO: renamed from: a */
                public final void m6911a(Object obj, Object obj2, Object obj3) {
                    this.f4785a.m7518u((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            if (i == list.size()) {
                this.f5425i.h(i).P1();
            }
        }
        int size2 = list.size();
        if (size2 < 6) {
            m7510G(size2, null, this.f5425i);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m7505B() {
        String strString = this.f5423g.string(R.string.Pq);
        int iIndexOf = strString.indexOf(this.f5423g.string(R.string.P1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strString);
        StyleSpan styleSpan = new StyleSpan(1);
        spannableStringBuilder.setSpan(styleSpan, 0, iIndexOf, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(act().getResources().getColor(w0c0.P0)), iIndexOf, strString.length(), 33);
        spannableStringBuilder.setSpan(styleSpan, iIndexOf, strString.length(), 33);
        spannableStringBuilder.setSpan(this.f5429m, iIndexOf, strString.length(), 33);
        this.f5421e.setText(spannableStringBuilder);
        this.f5421e.setMovementMethod(LinkMovementMethod.getInstance());
        this.f5421e.setTypeface((Typeface) null, 1);
    }

    /* JADX INFO: renamed from: C */
    public void m7506C() {
        new xh0.a(act()).s(this.f5423g.string(R.string.Fk)).i(R.string.Eq).g(false).q(R.string.Dq).o(new View.OnClickListener() { // from class: l.f3g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4380a.m7519v(view);
            }
        }).e(R.string.Cq).c(new View.OnClickListener() { // from class: l.g3g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4539a.m7520w(view);
            }
        }).a().g();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m7507C0() {
        return this.f5423g;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m7508E(int i) {
        if (i <= 0) {
            return false;
        }
        new xh0.a(act()).s(this.f5423g.string(R.string.Fk)).g(false).i(R.string.hl).q(R.string.T).o(new View.OnClickListener() { // from class: l.e3g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4252a.m7521x(view);
            }
        }).e(R.string.c).a().g();
        return true;
    }

    /* JADX INFO: renamed from: F */
    public int m7509F() {
        if (!NullChecker.a(this.f5425i)) {
            return 0;
        }
        if (this.f5425i.h(0).n()) {
            CrashHelper.c(new NullPointerException("The first pic cannot be empty！"));
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 6 && !this.f5425i.h(i2).n(); i2++) {
            arrayList.add(this.f5425i.h(i2).N);
            if (!TEnum.equals(this.f5425i.h(i2).N.status, StickStatus.normal)) {
                i++;
            }
        }
        int size = arrayList.size();
        if (size <= 6) {
            m7510G(size, null, this.f5425i);
        }
        return i;
    }

    /* JADX INFO: renamed from: G */
    public final void m7510G(int i, String str, MediaReorderCards mediaReorderCards) {
        if (i == 6) {
            mediaReorderCards.h(5).S1((String) null);
            return;
        }
        mediaReorderCards.h(i).S1(str);
        if (i < 5) {
            mediaReorderCards.h(i + 1).S1((String) null);
        }
        if (i > 0) {
            mediaReorderCards.h(i - 1).S1((String) null);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m7512k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m7512k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l3g.m7662b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public boolean m7513l() {
        if (m7508E(m7509F())) {
            return true;
        }
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            if (this.f5425i.h(i2).N != null) {
                i++;
            }
            if (this.f5425i.h(i2).K0()) {
                m7506C();
                return true;
            }
        }
        if (this.f5427k.pictures.size() <= i) {
            return false;
        }
        m7506C();
        return true;
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m7511i1(d3g d3gVar) {
        this.f5426j = d3gVar;
    }

    /* JADX INFO: renamed from: n */
    public void m7515n() {
        User user = new User();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 6 && !this.f5425i.h(i2).n(); i2++) {
            if (TEnum.equals(this.f5425i.h(i2).N.status, StickStatus.normal)) {
                arrayList.add(this.f5425i.h(i2).N);
            }
            if (this.f5425i.h(i2).K0()) {
                i++;
            }
        }
        user.pictures = arrayList;
        this.f5426j.m6055n0(user, i);
    }

    /* JADX INFO: renamed from: p */
    public final void m7516p() {
        pj90 pj90Var = new pj90(act(), (VText) null);
        pj90Var.z(this.f5428l);
        Pair<View, MediaReorderCards> pairU = pj90Var.u(this.f5420d, true);
        this.f5424h = pairU;
        MediaReorderCards mediaReorderCards = (MediaReorderCards) pairU.second;
        this.f5425i = mediaReorderCards;
        mediaReorderCards.setCardsCrop(true);
        this.f5425i.setCurPageId("p_upload_photos");
        for (int i = 0; i < 6; i++) {
            if (upa.A2()) {
                this.f5425i.h(i).setCardDataType(MediaReorderCard.CardDataType.DIALOG);
            }
            this.f5425i.h(i).I0(i);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m7517r() {
        this.f5427k = CoreModule.c.e0.p9();
        this.f5419c.setTypeface((Typeface) null, 1);
        this.f5418b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.i3g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4985a.m7502q(view);
            }
        });
        xdl0.E0(this.f5422f, new View.OnClickListener() { // from class: l.j3g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5238a.m7503s(view);
            }
        });
        m7516p();
        m7505B();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m7518u(Media media, Boolean bool, Boolean bool2) {
        m7509F();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m7519v(View view) {
        m7515n();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m7520w(View view) {
        this.f5423g.finish();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m7521x(View view) {
        m7515n();
    }

    /* JADX INFO: renamed from: y */
    public void m7522y(Media media, int i) {
        if (media instanceof Video) {
            this.f5425i.h(i).z1((Video) media);
        } else if (media instanceof Picture) {
            this.f5425i.h(i).w1((Picture) media);
        }
        m7509F();
    }

    /* JADX INFO: renamed from: z */
    public final void m7523z() {
        for (int i = 0; i < 6; i++) {
            this.f5425i.h(i).I0(i);
        }
    }

    public void destroy() {
    }
}
