package p002l;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.profile.MediaReorderCards;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopEditPicFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopActionLayout;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.a5c0;
import l.e3c0;
import l.g30;
import l.j760;
import l.lqa;
import l.pga0;
import l.pj90;
import l.s7m;
import l.vwb;
import l.xh0;
import l.zvf0;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class oga0 implements s7m<lga0> {

    /* JADX INFO: renamed from: a */
    public TextView f16562a;

    /* JADX INFO: renamed from: b */
    public TextView f16563b;

    /* JADX INFO: renamed from: c */
    public VLinear f16564c;

    /* JADX INFO: renamed from: d */
    public ProfileLoopActionLayout f16565d;

    /* JADX INFO: renamed from: e */
    public lga0 f16566e;

    /* JADX INFO: renamed from: f */
    public Context f16567f;

    /* JADX INFO: renamed from: g */
    public ProfileLoopEditPicFrag f16568g;

    /* JADX INFO: renamed from: h */
    public LoopInputType f16569h;

    /* JADX INFO: renamed from: i */
    public String f16570i;

    /* JADX INFO: renamed from: j */
    public int f16571j;

    /* JADX INFO: renamed from: k */
    public int f16572k = 0;

    /* JADX INFO: renamed from: l */
    public Pair<View, MediaReorderCards> f16573l;

    /* JADX INFO: renamed from: m */
    public MediaReorderCards f16574m;

    /* JADX INFO: renamed from: n */
    public User f16575n;

    /* JADX INFO: renamed from: o */
    public User f16576o;

    public oga0(Context context, ProfileLoopEditPicFrag profileLoopEditPicFrag) {
        this.f16567f = context;
        this.f16568g = profileLoopEditPicFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m19450r() {
        this.f16565d.m3527l(this.f16568g);
        m19461k().m1991a2().m2030W0(this.f16568g);
        Pair<View, MediaReorderCards> pairU = new pj90(act(), (VText) null).u(this.f16564c, true);
        this.f16573l = pairU;
        ((View) pairU.first).findViewById(a5c0.l).setVisibility(0);
        this.f16562a.setTypeface(Typeface.DEFAULT_BOLD);
        MediaReorderCards mediaReorderCards = (MediaReorderCards) this.f16573l.second;
        this.f16574m = mediaReorderCards;
        mediaReorderCards.setCardsCrop(true);
        this.f16574m.setCurPageId("p_upload_photos");
        if (lqa.l()) {
            for (int i = 1; i < 6; i++) {
                this.f16574m.m1257h(i).m1087I0(i);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private void m19451s(List<Media> list) {
        int i = 0;
        while (true) {
            if (i >= 6) {
                break;
            }
            this.f16574m.m1257h(i).m1076C1(i < list.size() ? list.get(i) : null);
            this.f16574m.m1257h(i).setChangeAction(new g30() { // from class: l.nga0
                /* JADX INFO: renamed from: a */
                public final void m18751a(Object obj, Object obj2, Object obj3) {
                    this.f16016a.m19463m((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            this.f16574m.m1257h(i).m1080E1(i, "p_upload_photos");
            if (i == list.size()) {
                this.f16574m.m1257h(i).m1102P1();
            }
            i++;
        }
        int size = list.size();
        if (size < 6) {
            m19452x(size, null, this.f16574m);
        }
        if (TextUtils.equals(this.f16570i, "from_card_upload_photo") || TextUtils.equals(this.f16570i, "from_profile_upload_photo")) {
            m19456e(true);
        } else {
            m19456e(false);
        }
    }

    /* JADX INFO: renamed from: x */
    private void m19452x(int i, String str, MediaReorderCards mediaReorderCards) {
        if (i == 6) {
            mediaReorderCards.m1257h(5).m1108S1(null);
            return;
        }
        mediaReorderCards.m1257h(i).m1108S1(str);
        if (i < 5) {
            mediaReorderCards.m1257h(i + 1).m1108S1(null);
        }
        if (i > 0) {
            mediaReorderCards.m1257h(i - 1).m1108S1(null);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m19453C0() {
        return this.f16567f;
    }

    /* JADX INFO: renamed from: c */
    public View m19454c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pga0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m19459i1(lga0 lga0Var) {
        this.f16566e = lga0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m19456e(boolean z) {
        ProfileLoopActionLayout profileLoopActionLayout = this.f16565d;
        if (z) {
            profileLoopActionLayout.f1985b.setEnabled(true);
            this.f16565d.f1985b.setClickable(true);
            this.f16565d.f1985b.setBackgroundDrawable(act().drawable(e3c0.f));
        } else {
            profileLoopActionLayout.f1985b.setEnabled(false);
            this.f16565d.f1985b.setClickable(false);
            this.f16565d.f1985b.setBackgroundDrawable(act().drawable(e3c0.r1));
        }
    }

    /* JADX INFO: renamed from: f */
    public int m19457f() {
        return this.f16572k;
    }

    /* JADX INFO: renamed from: i */
    public void m19458i(User user) {
        if (NullChecker.a(this.f16574m)) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (int i2 = 0; i2 < 6 && !this.f16574m.m1257h(i2).m1240n(); i2++) {
                if (TEnum.equals(this.f16574m.m1257h(i2).f798N.status, "normal")) {
                    i++;
                    arrayList.add(this.f16574m.m1257h(i2).f798N);
                }
            }
            if (i > 0) {
                user.pictures = arrayList;
            }
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM19454c = m19454c(layoutInflater, viewGroup);
        m19450r();
        return viewM19454c;
    }

    /* JADX INFO: renamed from: j */
    public Bundle m19460j() {
        return this.f16568g.getArguments();
    }

    /* JADX INFO: renamed from: k */
    public ProfileInfoLoopEditAct m19461k() {
        return (ProfileInfoLoopEditAct) this.f16567f;
    }

    /* JADX INFO: renamed from: l */
    public boolean m19462l() {
        if (!TextUtils.equals(this.f16570i, "from_card_upload_photo") && !TextUtils.equals(this.f16570i, "from_profile_upload_photo")) {
            return false;
        }
        if (m19457f() > 0) {
            act().finish();
            return true;
        }
        this.f16566e.m17216n0(this.f16575n, this.f16576o, this.f16569h.pageId);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m19463m(Media media, Boolean bool, Boolean bool2) {
        m19468v();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m19464n(View view) {
        this.f16568g.mo2072H();
    }

    /* JADX INFO: renamed from: p */
    public void m19465p(List<Media> list, int i) {
        Video video = (Media) list.get(0);
        if (video instanceof Video) {
            this.f16574m.m1257h(i).m1150z1(video);
        } else if (video instanceof Picture) {
            this.f16574m.m1257h(i).m1144w1((Picture) video);
        }
        m19468v();
        for (int i2 = 0; i2 < 6; i2++) {
            this.f16574m.m1257h(i2).m1080E1(i2, "p_upload_photos");
        }
    }

    /* JADX INFO: renamed from: q */
    public void m19466q(LoopInputType loopInputType, String str) {
        this.f16569h = loopInputType;
        this.f16570i = str;
        this.f16575n = m19461k().m1991a2().m2043u0();
        User userM2045y0 = m19461k().m1991a2().m2045y0();
        this.f16576o = userM2045y0;
        this.f16571j = userM2045y0.pictures.size();
        m19451s(this.f16575n.pictures);
        this.f16568g.m2093f5();
        if (m19461k().m1991a2().m2035e1()) {
            this.f16568g.mo2091d5();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m19467u() {
        new xh0.a(act()).s(act().getString(R.string.d4)).g(false).i(R.string.c4).q(R.string.b4).o(new View.OnClickListener() { // from class: l.mga0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15379a.m19464n(view);
            }
        }).e(R.string.a).a().g();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: v */
    public int m19468v() {
        int i;
        boolean z = false;
        if (NullChecker.a(this.f16574m)) {
            ArrayList arrayList = new ArrayList();
            i = 0;
            boolean z2 = false;
            for (int i2 = 0; i2 < 6 && !this.f16574m.m1257h(i2).m1240n(); i2++) {
                if (i2 > 0) {
                    z2 = true;
                }
                arrayList.add(this.f16574m.m1257h(i2).f798N);
                if (!TEnum.equals(this.f16574m.m1257h(i2).f798N.status, "normal")) {
                    i++;
                }
            }
            int size = arrayList.size();
            if (size > 0 && (TextUtils.equals(this.f16570i, "from_card_upload_photo") || TextUtils.equals(this.f16570i, "from_profile_upload_photo"))) {
                this.f16575n.pictures = arrayList;
            }
            if (size <= 6) {
                m19452x(size, null, this.f16574m);
            }
            z = z2;
        } else {
            i = 0;
        }
        if (TextUtils.equals(this.f16570i, "from_card_upload_photo") || TextUtils.equals(this.f16570i, "from_profile_upload_photo")) {
            m19456e(true);
        } else {
            m19456e(z);
        }
        this.f16572k = i;
        return i;
    }

    /* JADX INFO: renamed from: w */
    public void m19469w() {
        LoopInputType loopInputType = this.f16569h;
        zvf0.u("e_edit_specific_profile_next", loopInputType.pageId, new j760[]{vwb.Y("specific_edit_page_name", loopInputType.pageName)});
    }

    public void destroy() {
    }
}
