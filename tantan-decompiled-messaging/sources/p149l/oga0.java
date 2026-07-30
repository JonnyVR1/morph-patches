package p149l;

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
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCards;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopEditPicFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class oga0 implements s7m<lga0> {

    /* JADX INFO: renamed from: a */
    public TextView f143836a;

    /* JADX INFO: renamed from: b */
    public TextView f143837b;

    /* JADX INFO: renamed from: c */
    public VLinear f143838c;

    /* JADX INFO: renamed from: d */
    public ProfileLoopActionLayout f143839d;

    /* JADX INFO: renamed from: e */
    public lga0 f143840e;

    /* JADX INFO: renamed from: f */
    public Context f143841f;

    /* JADX INFO: renamed from: g */
    public ProfileLoopEditPicFrag f143842g;

    /* JADX INFO: renamed from: h */
    public LoopInputType f143843h;

    /* JADX INFO: renamed from: i */
    public String f143844i;

    /* JADX INFO: renamed from: j */
    public int f143845j;

    /* JADX INFO: renamed from: k */
    public int f143846k = 0;

    /* JADX INFO: renamed from: l */
    public Pair<View, MediaReorderCards> f143847l;

    /* JADX INFO: renamed from: m */
    public MediaReorderCards f143848m;

    /* JADX INFO: renamed from: n */
    public User f143849n;

    /* JADX INFO: renamed from: o */
    public User f143850o;

    public oga0(Context context, ProfileLoopEditPicFrag profileLoopEditPicFrag) {
        this.f143841f = context;
        this.f143842g = profileLoopEditPicFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m164179r() {
        this.f143839d.m52969l(this.f143842g);
        m164188k().m51509a2().m51548W0(this.f143842g);
        Pair<View, MediaReorderCards> pairM169813u = new pj90(act(), null).m169813u(this.f143838c, true);
        this.f143847l = pairM169813u;
        ((View) pairM169813u.first).findViewById(a5c0.f67689l).setVisibility(0);
        this.f143836a.setTypeface(Typeface.DEFAULT_BOLD);
        MediaReorderCards mediaReorderCards = (MediaReorderCards) this.f143847l.second;
        this.f143848m = mediaReorderCards;
        mediaReorderCards.setCardsCrop(true);
        this.f143848m.setCurPageId("p_upload_photos");
        if (lqa.m150974l()) {
            for (int i = 1; i < 6; i++) {
                this.f143848m.m50811h(i).m50651I0(i);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private void m164180s(List<Media> list) {
        int i = 0;
        while (true) {
            if (i >= 6) {
                break;
            }
            this.f143848m.m50811h(i).m50640C1(i < list.size() ? list.get(i) : null);
            this.f143848m.m50811h(i).setChangeAction(new g30() { // from class: l.nga0
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    this.f138851a.m164190m((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            this.f143848m.m50811h(i).m50644E1(i, "p_upload_photos");
            if (i == list.size()) {
                this.f143848m.m50811h(i).m50666P1();
            }
            i++;
        }
        int size = list.size();
        if (size < 6) {
            m164181x(size, null, this.f143848m);
        }
        if (TextUtils.equals(this.f143844i, CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO) || TextUtils.equals(this.f143844i, CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO)) {
            m164184e(true);
        } else {
            m164184e(false);
        }
    }

    /* JADX INFO: renamed from: x */
    private void m164181x(int i, String str, MediaReorderCards mediaReorderCards) {
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
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f143841f;
    }

    /* JADX INFO: renamed from: c */
    public View m164182c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pga0.m168664b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(lga0 lga0Var) {
        this.f143840e = lga0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m164184e(boolean z) {
        ProfileLoopActionLayout profileLoopActionLayout = this.f143839d;
        if (z) {
            profileLoopActionLayout.f34163b.setEnabled(true);
            this.f143839d.f34163b.setClickable(true);
            this.f143839d.f34163b.setBackgroundDrawable(act().drawable(e3c0.f89103f));
        } else {
            profileLoopActionLayout.f34163b.setEnabled(false);
            this.f143839d.f34163b.setClickable(false);
            this.f143839d.f34163b.setBackgroundDrawable(act().drawable(e3c0.f89143r1));
        }
    }

    /* JADX INFO: renamed from: f */
    public int m164185f() {
        return this.f143846k;
    }

    /* JADX INFO: renamed from: i */
    public void m164186i(User user) {
        if (NullChecker.m81303a(this.f143848m)) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (int i2 = 0; i2 < 6 && !this.f143848m.m50811h(i2).m50794n(); i2++) {
                if (TEnum.equals(this.f143848m.m50811h(i2).f32976N.status, "normal")) {
                    i++;
                    arrayList.add(this.f143848m.m50811h(i2).f32976N);
                }
            }
            if (i > 0) {
                user.pictures = arrayList;
            }
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM164182c = m164182c(layoutInflater, viewGroup);
        m164179r();
        return viewM164182c;
    }

    /* JADX INFO: renamed from: j */
    public Bundle m164187j() {
        return this.f143842g.getArguments();
    }

    /* JADX INFO: renamed from: k */
    public ProfileInfoLoopEditAct m164188k() {
        return (ProfileInfoLoopEditAct) this.f143841f;
    }

    /* JADX INFO: renamed from: l */
    public boolean m164189l() {
        if (!TextUtils.equals(this.f143844i, CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO) && !TextUtils.equals(this.f143844i, CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO)) {
            return false;
        }
        if (m164185f() > 0) {
            act().m66873d2();
            return true;
        }
        this.f143840e.m149762n0(this.f143849n, this.f143850o, this.f143843h.pageId);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m164190m(Media media, Boolean bool, Boolean bool2) {
        m164195v();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m164191n(View view) {
        this.f143842g.mo51586H();
    }

    /* JADX INFO: renamed from: p */
    public void m164192p(List<Media> list, int i) {
        Media media = list.get(0);
        if (media instanceof Video) {
            this.f143848m.m50811h(i).m50714z1((Video) media);
        } else if (media instanceof Picture) {
            this.f143848m.m50811h(i).m50708w1((Picture) media);
        }
        m164195v();
        for (int i2 = 0; i2 < 6; i2++) {
            this.f143848m.m50811h(i2).m50644E1(i2, "p_upload_photos");
        }
    }

    /* JADX INFO: renamed from: q */
    public void m164193q(LoopInputType loopInputType, String str) {
        this.f143843h = loopInputType;
        this.f143844i = str;
        this.f143849n = m164188k().m51509a2().m51559u0();
        User userM51561y0 = m164188k().m51509a2().m51561y0();
        this.f143850o = userM51561y0;
        this.f143845j = userM51561y0.pictures.size();
        m164180s(this.f143849n.pictures);
        this.f143842g.m51607f5();
        if (m164188k().m51509a2().m51551e1()) {
            this.f143842g.mo51605d5();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m164194u() {
        new xh0.C21150a(act()).m208740s(act().getString(R$string.f27838d4)).m208728g(false).m208730i(R$string.f27832c4).m208738q(R$string.f27826b4).m208736o(new View.OnClickListener() { // from class: l.mga0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133664a.m164191n(view);
            }
        }).m208726e(R$string.f27815a).m208722a().m208721g();
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
    public int m164195v() {
        int i;
        boolean z = false;
        if (NullChecker.m81303a(this.f143848m)) {
            ArrayList arrayList = new ArrayList();
            i = 0;
            boolean z2 = false;
            for (int i2 = 0; i2 < 6 && !this.f143848m.m50811h(i2).m50794n(); i2++) {
                if (i2 > 0) {
                    z2 = true;
                }
                arrayList.add(this.f143848m.m50811h(i2).f32976N);
                if (!TEnum.equals(this.f143848m.m50811h(i2).f32976N.status, "normal")) {
                    i++;
                }
            }
            int size = arrayList.size();
            if (size > 0 && (TextUtils.equals(this.f143844i, CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO) || TextUtils.equals(this.f143844i, CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO))) {
                this.f143849n.pictures = arrayList;
            }
            if (size <= 6) {
                m164181x(size, null, this.f143848m);
            }
            z = z2;
        } else {
            i = 0;
        }
        if (TextUtils.equals(this.f143844i, CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO) || TextUtils.equals(this.f143844i, CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO)) {
            m164184e(true);
        } else {
            m164184e(z);
        }
        this.f143846k = i;
        return i;
    }

    /* JADX INFO: renamed from: w */
    public void m164196w() {
        LoopInputType loopInputType = this.f143843h;
        zvf0.m220399u("e_edit_specific_profile_next", loopInputType.pageId, vwb.m200311Y("specific_edit_page_name", loopInputType.pageName));
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
