package p002l;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.profile.MediaReorderCards;
import com.p000p1.mobile.putong.core.p001ui.profile.VReorderCards;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopEditPetPicFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopActionLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.a5c0;
import l.e3c0;
import l.fwl;
import l.g30;
import l.j760;
import l.lqa;
import l.ofa0;
import l.osi0;
import l.pj90;
import l.s7m;
import l.ura;
import l.vwb;
import l.xh0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nfa0 implements s7m<ifa0> {

    /* JADX INFO: renamed from: a */
    public VLinear f15977a;

    /* JADX INFO: renamed from: b */
    public VText f15978b;

    /* JADX INFO: renamed from: c */
    public VText f15979c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f15980d;

    /* JADX INFO: renamed from: e */
    public VText f15981e;

    /* JADX INFO: renamed from: f */
    public ProfileLoopActionLayout f15982f;

    /* JADX INFO: renamed from: g */
    public ifa0 f15983g;

    /* JADX INFO: renamed from: h */
    public Context f15984h;

    /* JADX INFO: renamed from: i */
    public ProfileLoopEditPetPicFrag f15985i;

    /* JADX INFO: renamed from: j */
    public LoopInputType f15986j;

    /* JADX INFO: renamed from: k */
    public String f15987k;

    /* JADX INFO: renamed from: m */
    public MediaReorderCards f15989m;

    /* JADX INFO: renamed from: n */
    public User f15990n;

    /* JADX INFO: renamed from: o */
    public User f15991o;

    /* JADX INFO: renamed from: q */
    public Picture f15993q;

    /* JADX INFO: renamed from: r */
    public ypa0 f15994r;

    /* JADX INFO: renamed from: s */
    public int f15995s;

    /* JADX INFO: renamed from: t */
    public int f15996t;

    /* JADX INFO: renamed from: u */
    public final int f15997u;

    /* JADX INFO: renamed from: v */
    public String f15998v;

    /* JADX INFO: renamed from: w */
    public String f15999w;

    /* JADX INFO: renamed from: l */
    public int f15988l = 0;

    /* JADX INFO: renamed from: p */
    public List<Media> f15992p = new ArrayList();

    public nfa0(Context context, ProfileLoopEditPetPicFrag profileLoopEditPetPicFrag) {
        this.f15997u = lqa.w() ? 9 : 6;
        this.f15984h = context;
        this.f15985i = profileLoopEditPetPicFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m18706r() {
        this.f15982f.m3527l(this.f15985i);
        m18723n().m1991a2().m2030W0(this.f15985i);
        Pair pairU = new pj90(act(), (VText) null).u(this.f15977a, true);
        ((View) pairU.first).findViewById(a5c0.l).setVisibility(8);
        MediaReorderCards mediaReorderCards = (MediaReorderCards) pairU.second;
        this.f15989m = mediaReorderCards;
        mediaReorderCards.setCardsCrop(true);
        this.f15989m.setEnableDrag(false);
        this.f15989m.setClickEnable(false);
        this.f15989m.setCurPageId("p_tantanx_pet_photo_normalguide");
        this.f15989m.setViewCount(this.f15997u);
        this.f15978b.setTypeface(Typeface.DEFAULT_BOLD);
        this.f15989m.setVisibility(0);
        this.f15977a.setVisibility(4);
        this.f15989m.setUploadListener(new VReorderCards.InterfaceC0051b() { // from class: l.kfa0
            @Override // com.p000p1.mobile.putong.core.p001ui.profile.VReorderCards.InterfaceC0051b
            /* JADX INFO: renamed from: a */
            public final void mo1267a(int i, boolean z) {
                this.f14307a.m18726s(i, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m18707w(View view) {
        this.f15985i.mo2072H();
    }

    /* JADX INFO: renamed from: A */
    public final void m18708A(List<Media> list) {
        if (list != null && !list.isEmpty()) {
            this.f15992p.addAll(list);
        }
        int size = this.f15992p.size();
        if (size < this.f15997u) {
            this.f15992p.add(new Picture());
        }
        this.f15980d.setLayoutManager(new GridLayoutManager(act(), 3));
        Act act = act();
        List<Media> list2 = this.f15992p;
        int i = this.f15997u;
        ypa0 ypa0Var = new ypa0(act, list2, size >= i, i, this.f15999w);
        this.f15994r = ypa0Var;
        ypa0Var.m26868H(new ypa0.InterfaceC0924a() { // from class: l.lfa0
            @Override // p002l.ypa0.InterfaceC0924a
            /* JADX INFO: renamed from: a */
            public final void mo17201a(int i2, int i3) {
                this.f14835a.m18727u(i2, i3);
            }
        });
        this.f15980d.setAdapter(this.f15994r);
        this.f15981e.setVisibility(list.size() < this.f15997u ? 8 : 0);
        int i2 = 0;
        while (i2 < this.f15997u) {
            this.f15989m.m1257h(i2).m1076C1(i2 < list.size() ? list.get(i2) : null);
            this.f15989m.m1257h(i2).setChangeAction(new g30() { // from class: l.mfa0
                /* JADX INFO: renamed from: a */
                public final void m17841a(Object obj, Object obj2, Object obj3) {
                    this.f15362a.m18728v((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            this.f15989m.m1257h(i2).m1080E1(i2, "p_upload_photos");
            if (i2 == list.size()) {
                this.f15989m.m1257h(i2).m1102P1();
            }
            this.f15989m.m1257h(i2).setFrom(this.f15987k);
            i2++;
        }
        m18719j(false);
    }

    /* JADX INFO: renamed from: B */
    public void m18709B() {
        new xh0.a(act()).s("照片未完成上传").g(false).j("未完成上传的照片将会被删除").r("放弃保存并继续").o(new View.OnClickListener() { // from class: l.jfa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13724a.m18707w(view);
            }
        }).f("取消").a().g();
    }

    /* JADX INFO: renamed from: C */
    public int m18710C() {
        if (!NullChecker.a(this.f15989m)) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < this.f15997u && !this.f15989m.m1257h(i2).m1240n(); i2++) {
            arrayList.add(this.f15989m.m1257h(i2).f798N);
            if (!TEnum.equals(this.f15989m.m1257h(i2).f798N.status, "normal")) {
                i++;
            }
        }
        if (!arrayList.isEmpty()) {
            this.f15990n.pictures = arrayList;
        }
        return i;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m18711C0() {
        return this.f15984h;
    }

    /* JADX INFO: renamed from: E */
    public final void m18712E() {
        Picture picture;
        int i;
        int size = this.f15992p.size();
        if (size <= 0 || (picture = this.f15993q) == null || TextUtils.isEmpty(((Media) picture).url)) {
            return;
        }
        int i2 = this.f15995s;
        if (i2 == 257) {
            Media media = this.f15992p.get(size - 1);
            if (TextUtils.isEmpty(media.url)) {
                this.f15992p.remove(media);
                this.f15992p.add(this.f15993q);
                this.f15994r.m26867G(this.f15992p);
            }
        } else if (i2 == 258 && (i = this.f15996t) > 0 && i < this.f15997u && i < size) {
            this.f15992p.remove(i);
            this.f15992p.add(this.f15996t, this.f15993q);
            this.f15994r.m26867G(this.f15992p);
        }
        m18719j(true);
    }

    /* JADX INFO: renamed from: F */
    public void m18713F() {
        zvf0.r("e_tantanx_pet_upload_normalguide_confirm", this.f15986j.pageId);
    }

    /* JADX INFO: renamed from: G */
    public void m18714G(Media media) {
        int i;
        if (!(media instanceof Picture) || (i = this.f15996t) <= 0 || i >= this.f15997u || i >= this.f15992p.size()) {
            return;
        }
        this.f15989m.m1257h(this.f15996t).m1148y1(media);
        this.f15993q = (Picture) media;
        m18710C();
        for (int i2 = 0; i2 < this.f15997u; i2++) {
            this.f15989m.m1257h(i2).m1080E1(i2, "p_upload_photos");
        }
        m18712E();
    }

    /* JADX INFO: renamed from: e */
    public View m18715e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ofa0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m18718i1(ifa0 ifa0Var) {
        this.f15983g = ifa0Var;
    }

    /* JADX INFO: renamed from: i */
    public final void m18717i(int i) {
        if (lqa.w()) {
            ura.e().d().A8(act(), pj90.l, "from_explore_upload_pic", this.f15998v);
        } else {
            m18724p().n0(i, false, false, true);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM18715e = m18715e(layoutInflater, viewGroup);
        m18706r();
        return viewM18715e;
    }

    /* JADX INFO: renamed from: j */
    public void m18719j(boolean z) {
        ProfileLoopActionLayout profileLoopActionLayout = this.f15982f;
        if (z) {
            profileLoopActionLayout.f1985b.setEnabled(true);
            this.f15982f.f1985b.setClickable(true);
            this.f15982f.f1985b.setBackgroundDrawable(act().drawable(e3c0.f));
        } else {
            profileLoopActionLayout.f1985b.setEnabled(false);
            this.f15982f.f1985b.setClickable(false);
            this.f15982f.f1985b.setBackgroundDrawable(act().drawable(e3c0.r1));
        }
    }

    /* JADX INFO: renamed from: k */
    public int m18720k() {
        return this.f15988l;
    }

    /* JADX INFO: renamed from: l */
    public void m18721l(User user) {
        if (NullChecker.a(this.f15989m)) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (int i2 = 0; i2 < this.f15997u && !this.f15989m.m1257h(i2).m1240n(); i2++) {
                if (TEnum.equals(this.f15989m.m1257h(i2).f798N.status, "normal")) {
                    i++;
                    arrayList.add(this.f15989m.m1257h(i2).f798N);
                }
            }
            if (i > 0) {
                user.pictures = arrayList;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public Bundle m18722m() {
        return this.f15985i.getArguments();
    }

    /* JADX INFO: renamed from: n */
    public ProfileInfoLoopEditAct m18723n() {
        return (ProfileInfoLoopEditAct) this.f15984h;
    }

    /* JADX INFO: renamed from: p */
    public fwl m18724p() {
        return act() instanceof fwl ? act() : act();
    }

    /* JADX INFO: renamed from: q */
    public boolean m18725q() {
        this.f15983g.m15141o0(this.f15990n, this.f15991o);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m18726s(int i, boolean z) {
        zvf0.D("e_editpage_upload", "p_tantanx_pet_photo_normalguide", new j760[]{vwb.Y("tantanx_pet_photo_uploadstatus", z ? "success" : "fail")});
        if (z) {
            this.f15988l = 0;
            m18712E();
        } else {
            this.f15988l = 1;
            osi0.g("上传失败，请重新尝试");
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m18727u(int i, int i2) {
        String str = "e_tantanx_pet_upload_normalguide_upload";
        if (i2 != 257 && i2 == 258) {
            str = "e_tantanx_pet_upload_normalguide_change";
        }
        zvf0.r(str, this.f15986j.pageId);
        this.f15995s = i2;
        this.f15996t = i;
        m18717i(i);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m18728v(Media media, Boolean bool, Boolean bool2) {
        m18710C();
    }

    /* JADX INFO: renamed from: x */
    public void m18729x(List<Media> list, int i) {
        Picture picture = (Media) list.get(0);
        if (picture instanceof Picture) {
            Picture picture2 = picture;
            this.f15989m.m1257h(i).m1144w1(picture2);
            this.f15993q = picture2;
        }
        m18710C();
        for (int i2 = 0; i2 < this.f15997u; i2++) {
            this.f15989m.m1257h(i2).m1080E1(i2, "p_upload_photos");
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m18730y() {
        String strM15139i0 = this.f15983g.m15139i0();
        if (TextUtils.isEmpty(strM15139i0)) {
            this.f15981e.setText("你的照片已经上传" + this.f15997u + "张，请替换一张照片");
            return;
        }
        String strOptString = null;
        try {
            JSONObject jSONObject = new JSONObject(strM15139i0);
            this.f15998v = jSONObject.optString("type");
            String strOptString2 = jSONObject.optString("new_pop_up_title");
            String strOptString3 = jSONObject.optString("new_pop_up_sub_title");
            this.f15999w = jSONObject.optString("new_pop_up_box_title");
            strOptString = jSONObject.optString("new_pop_up_warning");
            this.f15978b.setText(strOptString2);
            this.f15979c.setText(strOptString3);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        if (!TextUtils.isEmpty(strOptString) && lqa.w()) {
            this.f15981e.setText(strOptString);
            return;
        }
        this.f15981e.setText("你的照片已经上传" + this.f15997u + "张，请替换一张照片");
    }

    /* JADX INFO: renamed from: z */
    public void m18731z(LoopInputType loopInputType, String str) {
        this.f15986j = loopInputType;
        this.f15987k = str;
        this.f15990n = m18723n().m1991a2().m2043u0();
        this.f15991o = m18723n().m1991a2().m2045y0();
        m18730y();
        m18708A(this.f15990n.pictures);
        this.f15985i.m2093f5();
        if (m18723n().m1991a2().m2035e1()) {
            this.f15985i.mo2091d5();
        }
    }

    public void destroy() {
    }
}
