package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCard;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCards;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VLinear;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public class y4g implements iam<r4g> {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f197453a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f197454b;

    /* JADX INFO: renamed from: c */
    public VText f197455c;

    /* JADX INFO: renamed from: d */
    public VLinear f197456d;

    /* JADX INFO: renamed from: e */
    public VText f197457e;

    /* JADX INFO: renamed from: f */
    public VText f197458f;

    /* JADX INFO: renamed from: g */
    public Act f197459g;

    /* JADX INFO: renamed from: h */
    public Pair<View, MediaReorderCards> f197460h;

    /* JADX INFO: renamed from: i */
    public MediaReorderCards f197461i;

    /* JADX INFO: renamed from: j */
    public r4g f197462j;

    /* JADX INFO: renamed from: k */
    public User f197463k;

    /* JADX INFO: renamed from: l */
    public final t4m f197464l = new C21514a();

    /* JADX INFO: renamed from: m */
    public ClickableSpan f197465m = new C21515b();

    /* JADX INFO: renamed from: l.y4g$a */
    public class C21514a implements t4m {
        public C21514a() {
        }

        @Override // p153l.t4m
        /* JADX INFO: renamed from: b */
        public void mo48722b() {
            y4g.this.m214234z();
        }

        @Override // p153l.t4m
        /* JADX INFO: renamed from: c */
        public void mo48723c() {
            y4g.this.m214234z();
        }

        @Override // p153l.t4m
        /* JADX INFO: renamed from: d */
        public void mo48724d() {
            y4g.this.m214234z();
        }
    }

    /* JADX INFO: renamed from: l.y4g$b */
    public class C21515b extends ClickableSpan {
        public C21515b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            uyf uyfVar = new uyf(y4g.this.f197459g);
            uyfVar.m198611C(CoreModule.f18264c.f20381e0.m116537Z7(), true, y4g.this.f197459g.pageId());
            uyfVar.show();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.bgColor = y4g.this.act().getResources().getColor(c9c0.f80407c2);
        }
    }

    public y4g(Act act) {
        this.f197459g = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m214215q(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m214216s(View view) {
        m214226n();
        i4g0.m138520r("e_confirm_upload_done", this.f197459g.pageId());
    }

    /* JADX INFO: renamed from: A */
    public void m214217A(List<Media> list) {
        for (int i = 0; i < 6; i++) {
            int size = list.size();
            MediaReorderCards mediaReorderCards = this.f197461i;
            if (i < size) {
                mediaReorderCards.m51994h(i).m51823C1(list.get(i));
            } else {
                mediaReorderCards.m51994h(i).m51823C1(null);
            }
            this.f197461i.m51994h(i).setChangeAction(new a30() { // from class: l.v4g
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    this.f182365a.m214229u((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            if (i == list.size()) {
                this.f197461i.m51994h(i).m51849P1();
            }
        }
        int size2 = list.size();
        if (size2 < 6) {
            m214222G(size2, null, this.f197461i);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m214218B() {
        String strString = this.f197459g.string(R$string.f19411kr);
        int iIndexOf = strString.indexOf(this.f197459g.string(R$string.f18748P1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strString);
        StyleSpan styleSpan = new StyleSpan(1);
        spannableStringBuilder.setSpan(styleSpan, 0, iIndexOf, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(act().getResources().getColor(c9c0.f80367Q0)), iIndexOf, strString.length(), 33);
        spannableStringBuilder.setSpan(styleSpan, iIndexOf, strString.length(), 33);
        spannableStringBuilder.setSpan(this.f197465m, iIndexOf, strString.length(), 33);
        this.f197457e.setText(spannableStringBuilder);
        this.f197457e.setMovementMethod(LinkMovementMethod.getInstance());
        this.f197457e.setTypeface(null, 1);
    }

    /* JADX INFO: renamed from: C */
    public void m214219C() {
        new th0.C20312a(act()).m191160s(this.f197459g.string(R$string.f19129bl)).m191150i(R$string.f19073Zq).m191148g(false).m191158q(R$string.f19043Yq).m191156o(new View.OnClickListener() { // from class: l.t4g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172067a.m214230v(view);
            }
        }).m191146e(R$string.f19013Xq).m191144c(new View.OnClickListener() { // from class: l.u4g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177462a.m214231w(view);
            }
        }).m191142a().m191141g();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f197459g;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m214220E(int i) {
        if (i <= 0) {
            return false;
        }
        new th0.C20312a(act()).m191160s(this.f197459g.string(R$string.f19129bl)).m191148g(false).m191150i(R$string.f18400Dl).m191158q(R$string.f18866T).m191156o(new View.OnClickListener() { // from class: l.s4g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166233a.m214232x(view);
            }
        }).m191146e(R$string.f19138c).m191142a().m191141g();
        return true;
    }

    /* JADX INFO: renamed from: F */
    public int m214221F() {
        if (!NullChecker.m82486a(this.f197461i)) {
            return 0;
        }
        if (this.f197461i.m51994h(0).m51977n()) {
            CrashHelper.m82479c(new NullPointerException("The first pic cannot be empty！"));
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 6 && !this.f197461i.m51994h(i2).m51977n(); i2++) {
            arrayList.add(this.f197461i.m51994h(i2).f33824N);
            if (!TEnum.equals(this.f197461i.m51994h(i2).f33824N.status, "normal")) {
                i++;
            }
        }
        int size = arrayList.size();
        if (size <= 6) {
            m214222G(size, null, this.f197461i);
        }
        return i;
    }

    /* JADX INFO: renamed from: G */
    public final void m214222G(int i, String str, MediaReorderCards mediaReorderCards) {
        if (i == 6) {
            mediaReorderCards.m51994h(5).m51855S1(null);
            return;
        }
        mediaReorderCards.m51994h(i).m51855S1(str);
        if (i < 5) {
            mediaReorderCards.m51994h(i + 1).m51855S1(null);
        }
        if (i > 0) {
            mediaReorderCards.m51994h(i - 1).m51855S1(null);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m214223k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m214223k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return z4g.m218589b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public boolean m214224l() {
        if (m214220E(m214221F())) {
            return true;
        }
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            if (this.f197461i.m51994h(i2).f33824N != null) {
                i++;
            }
            if (this.f197461i.m51994h(i2).m51838K0()) {
                m214219C();
                return true;
            }
        }
        if (this.f197463k.pictures.size() <= i) {
            return false;
        }
        m214219C();
        return true;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(r4g r4gVar) {
        this.f197462j = r4gVar;
    }

    /* JADX INFO: renamed from: n */
    public void m214226n() {
        User user = new User();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 6 && !this.f197461i.m51994h(i2).m51977n(); i2++) {
            if (TEnum.equals(this.f197461i.m51994h(i2).f33824N.status, "normal")) {
                arrayList.add(this.f197461i.m51994h(i2).f33824N);
            }
            if (this.f197461i.m51994h(i2).m51838K0()) {
                i++;
            }
        }
        user.pictures = arrayList;
        this.f197462j.m179759n0(user, i);
    }

    /* JADX INFO: renamed from: p */
    public final void m214227p() {
        tr90 tr90Var = new tr90(act(), null);
        tr90Var.m192440z(this.f197464l);
        Pair<View, MediaReorderCards> pairM192438u = tr90Var.m192438u(this.f197456d, true);
        this.f197460h = pairM192438u;
        MediaReorderCards mediaReorderCards = (MediaReorderCards) pairM192438u.second;
        this.f197461i = mediaReorderCards;
        mediaReorderCards.setCardsCrop(true);
        this.f197461i.setCurPageId("p_upload_photos");
        for (int i = 0; i < 6; i++) {
            if (gra.m131540A2()) {
                this.f197461i.m51994h(i).setCardDataType(MediaReorderCard.CardDataType.DIALOG);
            }
            this.f197461i.m51994h(i).m51834I0(i);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m214228r() {
        this.f197463k = CoreModule.f18264c.f20381e0.m116600p9();
        this.f197455c.setTypeface(null, 1);
        this.f197454b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.w4g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187408a.m214215q(view);
            }
        });
        bnl0.m105509E0(this.f197458f, new View.OnClickListener() { // from class: l.x4g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192409a.m214216s(view);
            }
        });
        m214227p();
        m214218B();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m214229u(Media media, Boolean bool, Boolean bool2) {
        m214221F();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m214230v(View view) {
        m214226n();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m214231w(View view) {
        this.f197459g.m51642n2();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m214232x(View view) {
        m214226n();
    }

    /* JADX INFO: renamed from: y */
    public void m214233y(Media media, int i) {
        if (media instanceof Video) {
            this.f197461i.m51994h(i).m51897z1((Video) media);
        } else if (media instanceof Picture) {
            this.f197461i.m51994h(i).m51891w1((Picture) media);
        }
        m214221F();
    }

    /* JADX INFO: renamed from: z */
    public final void m214234z() {
        for (int i = 0; i < 6; i++) {
            this.f197461i.m51994h(i).m51834I0(i);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
