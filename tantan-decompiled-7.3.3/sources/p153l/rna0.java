package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCards;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileMediaAct;
import com.p051p1.mobile.putong.core.p058ui.profile.VReorderCards;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopEditPetPicFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class rna0 implements iam<mna0> {

    /* JADX INFO: renamed from: a */
    public VLinear f163961a;

    /* JADX INFO: renamed from: b */
    public VText f163962b;

    /* JADX INFO: renamed from: c */
    public VText f163963c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f163964d;

    /* JADX INFO: renamed from: e */
    public VText f163965e;

    /* JADX INFO: renamed from: f */
    public ProfileLoopActionLayout f163966f;

    /* JADX INFO: renamed from: g */
    public mna0 f163967g;

    /* JADX INFO: renamed from: h */
    public Context f163968h;

    /* JADX INFO: renamed from: i */
    public ProfileLoopEditPetPicFrag f163969i;

    /* JADX INFO: renamed from: j */
    public LoopInputType f163970j;

    /* JADX INFO: renamed from: k */
    public String f163971k;

    /* JADX INFO: renamed from: m */
    public MediaReorderCards f163973m;

    /* JADX INFO: renamed from: n */
    public User f163974n;

    /* JADX INFO: renamed from: o */
    public User f163975o;

    /* JADX INFO: renamed from: q */
    public Picture f163977q;

    /* JADX INFO: renamed from: r */
    public cya0 f163978r;

    /* JADX INFO: renamed from: s */
    public int f163979s;

    /* JADX INFO: renamed from: t */
    public int f163980t;

    /* JADX INFO: renamed from: u */
    public final int f163981u;

    /* JADX INFO: renamed from: v */
    public String f163982v;

    /* JADX INFO: renamed from: w */
    public String f163983w;

    /* JADX INFO: renamed from: l */
    public int f163972l = 0;

    /* JADX INFO: renamed from: p */
    public List<Media> f163976p = new ArrayList();

    public rna0(Context context, ProfileLoopEditPetPicFrag profileLoopEditPetPicFrag) {
        this.f163981u = xra.m212804w() ? 9 : 6;
        this.f163968h = context;
        this.f163969i = profileLoopEditPetPicFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m182126r() {
        this.f163966f.m54152l(this.f163969i);
        m182141n().m52692b2().m52731W0(this.f163969i);
        Pair<View, MediaReorderCards> pairM192438u = new tr90(getAct(), null).m192438u(this.f163961a, true);
        ((View) pairM192438u.first).findViewById(gdc0.f103684l).setVisibility(8);
        MediaReorderCards mediaReorderCards = (MediaReorderCards) pairM192438u.second;
        this.f163973m = mediaReorderCards;
        mediaReorderCards.setCardsCrop(true);
        this.f163973m.setEnableDrag(false);
        this.f163973m.setClickEnable(false);
        this.f163973m.setCurPageId("p_tantanx_pet_photo_normalguide");
        this.f163973m.setViewCount(this.f163981u);
        this.f163962b.setTypeface(Typeface.DEFAULT_BOLD);
        this.f163973m.setVisibility(0);
        this.f163961a.setVisibility(4);
        this.f163973m.setUploadListener(new VReorderCards.InterfaceC8789b() { // from class: l.ona0
            @Override // com.p051p1.mobile.putong.core.p058ui.profile.VReorderCards.InterfaceC8789b
            /* JADX INFO: renamed from: a */
            public final void mo52004a(int i, boolean z) {
                this.f148073a.m182144s(i, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m182127w(View view) {
        this.f163969i.mo52769H();
    }

    /* JADX INFO: renamed from: A */
    public final void m182128A(List<Media> list) {
        if (list != null && !list.isEmpty()) {
            this.f163976p.addAll(list);
        }
        int size = this.f163976p.size();
        if (size < this.f163981u) {
            this.f163976p.add(new Picture());
        }
        this.f163964d.setLayoutManager(new GridLayoutManager(getAct(), 3));
        Act act = getAct();
        List<Media> list2 = this.f163976p;
        int i = this.f163981u;
        cya0 cya0Var = new cya0(act, list2, size >= i, i, this.f163983w);
        this.f163978r = cya0Var;
        cya0Var.m113106H(new cya0.InterfaceC16392a() { // from class: l.pna0
            @Override // p153l.cya0.InterfaceC16392a
            /* JADX INFO: renamed from: a */
            public final void mo113108a(int i2, int i3) {
                this.f153280a.m182145u(i2, i3);
            }
        });
        this.f163964d.setAdapter(this.f163978r);
        this.f163965e.setVisibility(list.size() < this.f163981u ? 8 : 0);
        int i2 = 0;
        while (i2 < this.f163981u) {
            this.f163973m.m51994h(i2).m51823C1(i2 < list.size() ? list.get(i2) : null);
            this.f163973m.m51994h(i2).setChangeAction(new a30() { // from class: l.qna0
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    this.f158476a.m182146v((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            this.f163973m.m51994h(i2).m51827E1(i2, "p_upload_photos");
            if (i2 == list.size()) {
                this.f163973m.m51994h(i2).m51849P1();
            }
            this.f163973m.m51994h(i2).setFrom(this.f163971k);
            i2++;
        }
        m182137j(false);
    }

    /* JADX INFO: renamed from: B */
    public void m182129B() {
        new th0.C20312a(getAct()).m191160s("照片未完成上传").m191148g(false).m191151j("未完成上传的照片将会被删除").m191159r("放弃保存并继续").m191156o(new View.OnClickListener() { // from class: l.nna0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142772a.m182127w(view);
            }
        }).m191147f("取消").m191142a().m191141g();
    }

    /* JADX INFO: renamed from: C */
    public int m182130C() {
        if (!NullChecker.m82486a(this.f163973m)) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < this.f163981u && !this.f163973m.m51994h(i2).m51977n(); i2++) {
            arrayList.add(this.f163973m.m51994h(i2).f33824N);
            if (!TEnum.equals(this.f163973m.m51994h(i2).f33824N.status, "normal")) {
                i++;
            }
        }
        if (!arrayList.isEmpty()) {
            this.f163974n.pictures = arrayList;
        }
        return i;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f163968h;
    }

    /* JADX INFO: renamed from: E */
    public final void m182131E() {
        Picture picture;
        int i;
        int size = this.f163976p.size();
        if (size <= 0 || (picture = this.f163977q) == null || TextUtils.isEmpty(picture.url)) {
            return;
        }
        int i2 = this.f163979s;
        if (i2 == 257) {
            Media media = this.f163976p.get(size - 1);
            if (TextUtils.isEmpty(media.url)) {
                this.f163976p.remove(media);
                this.f163976p.add(this.f163977q);
                this.f163978r.m113105G(this.f163976p);
            }
        } else if (i2 == 258 && (i = this.f163980t) > 0 && i < this.f163981u && i < size) {
            this.f163976p.remove(i);
            this.f163976p.add(this.f163980t, this.f163977q);
            this.f163978r.m113105G(this.f163976p);
        }
        m182137j(true);
    }

    /* JADX INFO: renamed from: F */
    public void m182132F() {
        i4g0.m138520r("e_tantanx_pet_upload_normalguide_confirm", this.f163970j.pageId);
    }

    /* JADX INFO: renamed from: G */
    public void m182133G(Media media) {
        int i;
        if (!(media instanceof Picture) || (i = this.f163980t) <= 0 || i >= this.f163981u || i >= this.f163976p.size()) {
            return;
        }
        this.f163973m.m51994h(this.f163980t).m51895y1(media);
        this.f163977q = (Picture) media;
        m182130C();
        for (int i2 = 0; i2 < this.f163981u; i2++) {
            this.f163973m.m51994h(i2).m51827E1(i2, "p_upload_photos");
        }
        m182131E();
    }

    /* JADX INFO: renamed from: e */
    public View m182134e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sna0.m186886b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(mna0 mna0Var) {
        this.f163967g = mna0Var;
    }

    /* JADX INFO: renamed from: i */
    public final void m182136i(int i) {
        if (xra.m212804w()) {
            gta.m132210e().m132214d().mo34655A8(getAct(), tr90.f175818l, "from_explore_upload_pic", this.f163982v);
        } else {
            m182142p().mo44257n0(i, false, false, true);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM182134e = m182134e(layoutInflater, viewGroup);
        m182126r();
        return viewM182134e;
    }

    /* JADX INFO: renamed from: j */
    public void m182137j(boolean z) {
        ProfileLoopActionLayout profileLoopActionLayout = this.f163966f;
        if (z) {
            profileLoopActionLayout.f35011b.setEnabled(true);
            this.f163966f.f35011b.setClickable(true);
            this.f163966f.f35011b.setBackgroundDrawable(getAct().drawable(kbc0.f124866f));
        } else {
            profileLoopActionLayout.f35011b.setEnabled(false);
            this.f163966f.f35011b.setClickable(false);
            this.f163966f.f35011b.setBackgroundDrawable(getAct().drawable(kbc0.f124906r1));
        }
    }

    /* JADX INFO: renamed from: k */
    public int m182138k() {
        return this.f163972l;
    }

    /* JADX INFO: renamed from: l */
    public void m182139l(User user) {
        if (NullChecker.m82486a(this.f163973m)) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (int i2 = 0; i2 < this.f163981u && !this.f163973m.m51994h(i2).m51977n(); i2++) {
                if (TEnum.equals(this.f163973m.m51994h(i2).f33824N.status, "normal")) {
                    i++;
                    arrayList.add(this.f163973m.m51994h(i2).f33824N);
                }
            }
            if (i > 0) {
                user.pictures = arrayList;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public Bundle m182140m() {
        return this.f163969i.getArguments();
    }

    /* JADX INFO: renamed from: n */
    public ProfileInfoLoopEditAct m182141n() {
        return (ProfileInfoLoopEditAct) this.f163968h;
    }

    /* JADX INFO: renamed from: p */
    public xyl m182142p() {
        return getAct() instanceof xyl ? (xyl) getAct() : (ProfileMediaAct) getAct();
    }

    /* JADX INFO: renamed from: q */
    public boolean m182143q() {
        this.f163967g.m159127o0(this.f163974n, this.f163975o);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m182144s(int i, boolean z) {
        i4g0.m138495D("e_editpage_upload", "p_tantanx_pet_photo_normalguide", jyb.m147494Y("tantanx_pet_photo_uploadstatus", z ? "success" : "fail"));
        if (z) {
            this.f163972l = 0;
            m182131E();
        } else {
            this.f163972l = 1;
            r1j0.m179420g("上传失败，请重新尝试");
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m182145u(int i, int i2) {
        String str = "e_tantanx_pet_upload_normalguide_upload";
        if (i2 != 257 && i2 == 258) {
            str = "e_tantanx_pet_upload_normalguide_change";
        }
        i4g0.m138520r(str, this.f163970j.pageId);
        this.f163979s = i2;
        this.f163980t = i;
        m182136i(i);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m182146v(Media media, Boolean bool, Boolean bool2) {
        m182130C();
    }

    /* JADX INFO: renamed from: x */
    public void m182147x(List<Media> list, int i) {
        Media media = list.get(0);
        if (media instanceof Picture) {
            Picture picture = (Picture) media;
            this.f163973m.m51994h(i).m51891w1(picture);
            this.f163977q = picture;
        }
        m182130C();
        for (int i2 = 0; i2 < this.f163981u; i2++) {
            this.f163973m.m51994h(i2).m51827E1(i2, "p_upload_photos");
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m182148y() {
        String strM159125i0 = this.f163967g.m159125i0();
        if (TextUtils.isEmpty(strM159125i0)) {
            this.f163965e.setText("你的照片已经上传" + this.f163981u + "张，请替换一张照片");
            return;
        }
        String strOptString = null;
        try {
            JSONObject jSONObject = new JSONObject(strM159125i0);
            this.f163982v = jSONObject.optString("type");
            String strOptString2 = jSONObject.optString("new_pop_up_title");
            String strOptString3 = jSONObject.optString("new_pop_up_sub_title");
            this.f163983w = jSONObject.optString("new_pop_up_box_title");
            strOptString = jSONObject.optString("new_pop_up_warning");
            this.f163962b.setText(strOptString2);
            this.f163963c.setText(strOptString3);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        if (!TextUtils.isEmpty(strOptString) && xra.m212804w()) {
            this.f163965e.setText(strOptString);
            return;
        }
        this.f163965e.setText("你的照片已经上传" + this.f163981u + "张，请替换一张照片");
    }

    /* JADX INFO: renamed from: z */
    public void m182149z(LoopInputType loopInputType, String str) {
        this.f163970j = loopInputType;
        this.f163971k = str;
        this.f163974n = m182141n().m52692b2().m52742u0();
        this.f163975o = m182141n().m52692b2().m52744y0();
        m182148y();
        m182128A(this.f163974n.pictures);
        this.f163969i.m52790f5();
        if (m182141n().m52692b2().m52734e1()) {
            this.f163969i.mo52788d5();
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
