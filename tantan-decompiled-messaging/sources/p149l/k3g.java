package p149l;

import android.content.Context;
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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCard;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCards;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VLinear;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class k3g implements s7m<d3g> {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f120821a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f120822b;

    /* JADX INFO: renamed from: c */
    public VText f120823c;

    /* JADX INFO: renamed from: d */
    public VLinear f120824d;

    /* JADX INFO: renamed from: e */
    public VText f120825e;

    /* JADX INFO: renamed from: f */
    public VText f120826f;

    /* JADX INFO: renamed from: g */
    public Act f120827g;

    /* JADX INFO: renamed from: h */
    public Pair<View, MediaReorderCards> f120828h;

    /* JADX INFO: renamed from: i */
    public MediaReorderCards f120829i;

    /* JADX INFO: renamed from: j */
    public d3g f120830j;

    /* JADX INFO: renamed from: k */
    public User f120831k;

    /* JADX INFO: renamed from: l */
    public final a2m f120832l = new C17920a();

    /* JADX INFO: renamed from: m */
    public ClickableSpan f120833m = new C17921b();

    /* JADX INFO: renamed from: l.k3g$a */
    public class C17920a implements a2m {
        public C17920a() {
        }

        @Override // p149l.a2m
        /* JADX INFO: renamed from: b */
        public void mo47539b() {
            k3g.this.m144410z();
        }

        @Override // p149l.a2m
        /* JADX INFO: renamed from: c */
        public void mo47540c() {
            k3g.this.m144410z();
        }

        @Override // p149l.a2m
        /* JADX INFO: renamed from: d */
        public void mo47541d() {
            k3g.this.m144410z();
        }
    }

    /* JADX INFO: renamed from: l.k3g$b */
    public class C17921b extends ClickableSpan {
        public C17921b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            gxf gxfVar = new gxf(k3g.this.f120827g);
            gxfVar.m128575C(CoreModule.f17545c.f19639e0.m169464Z7(), true, k3g.this.f120827g.pageId());
            gxfVar.show();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.bgColor = k3g.this.act().getResources().getColor(w0c0.f183834b2);
        }
    }

    public k3g(Act act) {
        this.f120827g = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m144391q(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m144392s(View view) {
        m144402n();
        zvf0.m220396r("e_confirm_upload_done", this.f120827g.pageId());
    }

    /* JADX INFO: renamed from: A */
    public void m144393A(List<Media> list) {
        for (int i = 0; i < 6; i++) {
            int size = list.size();
            MediaReorderCards mediaReorderCards = this.f120829i;
            if (i < size) {
                mediaReorderCards.m50811h(i).m50640C1(list.get(i));
            } else {
                mediaReorderCards.m50811h(i).m50640C1(null);
            }
            this.f120829i.m50811h(i).setChangeAction(new g30() { // from class: l.h3g
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    this.f105739a.m144405u((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            if (i == list.size()) {
                this.f120829i.m50811h(i).m50666P1();
            }
        }
        int size2 = list.size();
        if (size2 < 6) {
            m144398G(size2, null, this.f120829i);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m144394B() {
        String strString = this.f120827g.string(R$string.f18043Pq);
        int iIndexOf = strString.indexOf(this.f120827g.string(R$string.f18018P1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strString);
        StyleSpan styleSpan = new StyleSpan(1);
        spannableStringBuilder.setSpan(styleSpan, 0, iIndexOf, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(act().getResources().getColor(w0c0.f183795P0)), iIndexOf, strString.length(), 33);
        spannableStringBuilder.setSpan(styleSpan, iIndexOf, strString.length(), 33);
        spannableStringBuilder.setSpan(this.f120833m, iIndexOf, strString.length(), 33);
        this.f120825e.setText(spannableStringBuilder);
        this.f120825e.setMovementMethod(LinkMovementMethod.getInstance());
        this.f120825e.setTypeface(null, 1);
    }

    /* JADX INFO: renamed from: C */
    public void m144395C() {
        new xh0.C21150a(act()).m208740s(this.f120827g.string(R$string.f17737Fk)).m208730i(R$string.f17713Eq).m208728g(false).m208738q(R$string.f17683Dq).m208736o(new View.OnClickListener() { // from class: l.f3g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94682a.m144406v(view);
            }
        }).m208726e(R$string.f17653Cq).m208724c(new View.OnClickListener() { // from class: l.g3g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100461a.m144407w(view);
            }
        }).m208722a().m208721g();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f120827g;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m144396E(int i) {
        if (i <= 0) {
            return false;
        }
        new xh0.C21150a(act()).m208740s(this.f120827g.string(R$string.f17737Fk)).m208728g(false).m208730i(R$string.f18584hl).m208738q(R$string.f18136T).m208736o(new View.OnClickListener() { // from class: l.e3g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89177a.m144408x(view);
            }
        }).m208726e(R$string.f18408c).m208722a().m208721g();
        return true;
    }

    /* JADX INFO: renamed from: F */
    public int m144397F() {
        if (!NullChecker.m81303a(this.f120829i)) {
            return 0;
        }
        if (this.f120829i.m50811h(0).m50794n()) {
            CrashHelper.m81296c(new NullPointerException("The first pic cannot be empty！"));
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 6 && !this.f120829i.m50811h(i2).m50794n(); i2++) {
            arrayList.add(this.f120829i.m50811h(i2).f32976N);
            if (!TEnum.equals(this.f120829i.m50811h(i2).f32976N.status, "normal")) {
                i++;
            }
        }
        int size = arrayList.size();
        if (size <= 6) {
            m144398G(size, null, this.f120829i);
        }
        return i;
    }

    /* JADX INFO: renamed from: G */
    public final void m144398G(int i, String str, MediaReorderCards mediaReorderCards) {
        if (i == 6) {
            mediaReorderCards.m50811h(5).m50672S1(null);
            return;
        }
        mediaReorderCards.m50811h(i).m50672S1(str);
        if (i < 5) {
            mediaReorderCards.m50811h(i + 1).m50672S1(null);
        }
        if (i > 0) {
            mediaReorderCards.m50811h(i - 1).m50672S1(null);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m144399k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m144399k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l3g.m148395b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public boolean m144400l() {
        if (m144396E(m144397F())) {
            return true;
        }
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            if (this.f120829i.m50811h(i2).f32976N != null) {
                i++;
            }
            if (this.f120829i.m50811h(i2).m50655K0()) {
                m144395C();
                return true;
            }
        }
        if (this.f120831k.pictures.size() <= i) {
            return false;
        }
        m144395C();
        return true;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(d3g d3gVar) {
        this.f120830j = d3gVar;
    }

    /* JADX INFO: renamed from: n */
    public void m144402n() {
        User user = new User();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 6 && !this.f120829i.m50811h(i2).m50794n(); i2++) {
            if (TEnum.equals(this.f120829i.m50811h(i2).f32976N.status, "normal")) {
                arrayList.add(this.f120829i.m50811h(i2).f32976N);
            }
            if (this.f120829i.m50811h(i2).m50655K0()) {
                i++;
            }
        }
        user.pictures = arrayList;
        this.f120830j.m109918n0(user, i);
    }

    /* JADX INFO: renamed from: p */
    public final void m144403p() {
        pj90 pj90Var = new pj90(act(), null);
        pj90Var.m169815z(this.f120832l);
        Pair<View, MediaReorderCards> pairM169813u = pj90Var.m169813u(this.f120824d, true);
        this.f120828h = pairM169813u;
        MediaReorderCards mediaReorderCards = (MediaReorderCards) pairM169813u.second;
        this.f120829i = mediaReorderCards;
        mediaReorderCards.setCardsCrop(true);
        this.f120829i.setCurPageId("p_upload_photos");
        for (int i = 0; i < 6; i++) {
            if (upa.m194609A2()) {
                this.f120829i.m50811h(i).setCardDataType(MediaReorderCard.CardDataType.DIALOG);
            }
            this.f120829i.m50811h(i).m50651I0(i);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m144404r() {
        this.f120831k = CoreModule.f17545c.f19639e0.m169527p9();
        this.f120823c.setTypeface(null, 1);
        this.f120822b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.i3g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111283a.m144391q(view);
            }
        });
        xdl0.m208329E0(this.f120826f, new View.OnClickListener() { // from class: l.j3g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116070a.m144392s(view);
            }
        });
        m144403p();
        m144394B();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m144405u(Media media, Boolean bool, Boolean bool2) {
        m144397F();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m144406v(View view) {
        m144402n();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m144407w(View view) {
        this.f120827g.m50458m2();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m144408x(View view) {
        m144402n();
    }

    /* JADX INFO: renamed from: y */
    public void m144409y(Media media, int i) {
        if (media instanceof Video) {
            this.f120829i.m50811h(i).m50714z1((Video) media);
        } else if (media instanceof Picture) {
            this.f120829i.m50811h(i).m50708w1((Picture) media);
        }
        m144397F();
    }

    /* JADX INFO: renamed from: z */
    public final void m144410z() {
        for (int i = 0; i < 6; i++) {
            this.f120829i.m50811h(i).m50651I0(i);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
