package p153l;

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
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCards;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopEditPicFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class soa0 implements iam<poa0> {

    /* JADX INFO: renamed from: a */
    public TextView f169862a;

    /* JADX INFO: renamed from: b */
    public TextView f169863b;

    /* JADX INFO: renamed from: c */
    public VLinear f169864c;

    /* JADX INFO: renamed from: d */
    public ProfileLoopActionLayout f169865d;

    /* JADX INFO: renamed from: e */
    public poa0 f169866e;

    /* JADX INFO: renamed from: f */
    public Context f169867f;

    /* JADX INFO: renamed from: g */
    public ProfileLoopEditPicFrag f169868g;

    /* JADX INFO: renamed from: h */
    public LoopInputType f169869h;

    /* JADX INFO: renamed from: i */
    public String f169870i;

    /* JADX INFO: renamed from: j */
    public int f169871j;

    /* JADX INFO: renamed from: k */
    public int f169872k = 0;

    /* JADX INFO: renamed from: l */
    public Pair<View, MediaReorderCards> f169873l;

    /* JADX INFO: renamed from: m */
    public MediaReorderCards f169874m;

    /* JADX INFO: renamed from: n */
    public User f169875n;

    /* JADX INFO: renamed from: o */
    public User f169876o;

    public soa0(Context context, ProfileLoopEditPicFrag profileLoopEditPicFrag) {
        this.f169867f = context;
        this.f169868g = profileLoopEditPicFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m187161r() {
        this.f169865d.m54152l(this.f169868g);
        m187170k().m52692b2().m52731W0(this.f169868g);
        Pair<View, MediaReorderCards> pairM192438u = new tr90(act(), null).m192438u(this.f169864c, true);
        this.f169873l = pairM192438u;
        ((View) pairM192438u.first).findViewById(gdc0.f103684l).setVisibility(0);
        this.f169862a.setTypeface(Typeface.DEFAULT_BOLD);
        MediaReorderCards mediaReorderCards = (MediaReorderCards) this.f169873l.second;
        this.f169874m = mediaReorderCards;
        mediaReorderCards.setCardsCrop(true);
        this.f169874m.setCurPageId("p_upload_photos");
        if (xra.m212793l()) {
            for (int i = 1; i < 6; i++) {
                this.f169874m.m51994h(i).m51834I0(i);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private void m187162s(List<Media> list) {
        int i = 0;
        while (true) {
            if (i >= 6) {
                break;
            }
            this.f169874m.m51994h(i).m51823C1(i < list.size() ? list.get(i) : null);
            this.f169874m.m51994h(i).setChangeAction(new a30() { // from class: l.roa0
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    this.f164168a.m187172m((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            this.f169874m.m51994h(i).m51827E1(i, "p_upload_photos");
            if (i == list.size()) {
                this.f169874m.m51994h(i).m51849P1();
            }
            i++;
        }
        int size = list.size();
        if (size < 6) {
            m187163x(size, null, this.f169874m);
        }
        if (TextUtils.equals(this.f169870i, CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO) || TextUtils.equals(this.f169870i, CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO)) {
            m187166e(true);
        } else {
            m187166e(false);
        }
    }

    /* JADX INFO: renamed from: x */
    private void m187163x(int i, String str, MediaReorderCards mediaReorderCards) {
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
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f169867f;
    }

    /* JADX INFO: renamed from: c */
    public View m187164c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return toa0.m192012b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(poa0 poa0Var) {
        this.f169866e = poa0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m187166e(boolean z) {
        ProfileLoopActionLayout profileLoopActionLayout = this.f169865d;
        if (z) {
            profileLoopActionLayout.f35011b.setEnabled(true);
            this.f169865d.f35011b.setClickable(true);
            this.f169865d.f35011b.setBackgroundDrawable(act().drawable(kbc0.f124866f));
        } else {
            profileLoopActionLayout.f35011b.setEnabled(false);
            this.f169865d.f35011b.setClickable(false);
            this.f169865d.f35011b.setBackgroundDrawable(act().drawable(kbc0.f124906r1));
        }
    }

    /* JADX INFO: renamed from: f */
    public int m187167f() {
        return this.f169872k;
    }

    /* JADX INFO: renamed from: i */
    public void m187168i(User user) {
        if (NullChecker.m82486a(this.f169874m)) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (int i2 = 0; i2 < 6 && !this.f169874m.m51994h(i2).m51977n(); i2++) {
                if (TEnum.equals(this.f169874m.m51994h(i2).f33824N.status, "normal")) {
                    i++;
                    arrayList.add(this.f169874m.m51994h(i2).f33824N);
                }
            }
            if (i > 0) {
                user.pictures = arrayList;
            }
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM187164c = m187164c(layoutInflater, viewGroup);
        m187161r();
        return viewM187164c;
    }

    /* JADX INFO: renamed from: j */
    public Bundle m187169j() {
        return this.f169868g.getArguments();
    }

    /* JADX INFO: renamed from: k */
    public ProfileInfoLoopEditAct m187170k() {
        return (ProfileInfoLoopEditAct) this.f169867f;
    }

    /* JADX INFO: renamed from: l */
    public boolean m187171l() {
        if (!TextUtils.equals(this.f169870i, CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO) && !TextUtils.equals(this.f169870i, CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO)) {
            return false;
        }
        if (m187167f() > 0) {
            act().m68056e2();
            return true;
        }
        this.f169866e.m173105n0(this.f169875n, this.f169876o, this.f169869h.pageId);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m187172m(Media media, Boolean bool, Boolean bool2) {
        m187177v();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m187173n(View view) {
        this.f169868g.mo52769H();
    }

    /* JADX INFO: renamed from: p */
    public void m187174p(List<Media> list, int i) {
        Media media = list.get(0);
        if (media instanceof Video) {
            this.f169874m.m51994h(i).m51897z1((Video) media);
        } else if (media instanceof Picture) {
            this.f169874m.m51994h(i).m51891w1((Picture) media);
        }
        m187177v();
        for (int i2 = 0; i2 < 6; i2++) {
            this.f169874m.m51994h(i2).m51827E1(i2, "p_upload_photos");
        }
    }

    /* JADX INFO: renamed from: q */
    public void m187175q(LoopInputType loopInputType, String str) {
        this.f169869h = loopInputType;
        this.f169870i = str;
        this.f169875n = m187170k().m52692b2().m52742u0();
        User userM52744y0 = m187170k().m52692b2().m52744y0();
        this.f169876o = userM52744y0;
        this.f169871j = userM52744y0.pictures.size();
        m187162s(this.f169875n.pictures);
        this.f169868g.m52790f5();
        if (m187170k().m52692b2().m52734e1()) {
            this.f169868g.mo52788d5();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m187176u() {
        new th0.C20312a(act()).m191160s(act().getString(R$string.f28686d4)).m191148g(false).m191150i(R$string.f28680c4).m191158q(R$string.f28674b4).m191156o(new View.OnClickListener() { // from class: l.qoa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158716a.m187173n(view);
            }
        }).m191146e(R$string.f28663a).m191142a().m191141g();
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
    public int m187177v() {
        int i;
        boolean z = false;
        if (NullChecker.m82486a(this.f169874m)) {
            ArrayList arrayList = new ArrayList();
            i = 0;
            boolean z2 = false;
            for (int i2 = 0; i2 < 6 && !this.f169874m.m51994h(i2).m51977n(); i2++) {
                if (i2 > 0) {
                    z2 = true;
                }
                arrayList.add(this.f169874m.m51994h(i2).f33824N);
                if (!TEnum.equals(this.f169874m.m51994h(i2).f33824N.status, "normal")) {
                    i++;
                }
            }
            int size = arrayList.size();
            if (size > 0 && (TextUtils.equals(this.f169870i, CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO) || TextUtils.equals(this.f169870i, CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO))) {
                this.f169875n.pictures = arrayList;
            }
            if (size <= 6) {
                m187163x(size, null, this.f169874m);
            }
            z = z2;
        } else {
            i = 0;
        }
        if (TextUtils.equals(this.f169870i, CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO) || TextUtils.equals(this.f169870i, CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO)) {
            m187166e(true);
        } else {
            m187166e(z);
        }
        this.f169872k = i;
        return i;
    }

    /* JADX INFO: renamed from: w */
    public void m187178w() {
        LoopInputType loopInputType = this.f169869h;
        i4g0.m138523u("e_edit_specific_profile_next", loopInputType.pageId, jyb.m147494Y("specific_edit_page_name", loopInputType.pageName));
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
