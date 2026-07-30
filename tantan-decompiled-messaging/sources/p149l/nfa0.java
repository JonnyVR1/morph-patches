package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCards;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileMediaAct;
import com.p046p1.mobile.putong.core.p053ui.profile.VReorderCards;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopEditPetPicFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class nfa0 implements s7m<ifa0> {

    /* JADX INFO: renamed from: a */
    public VLinear f138706a;

    /* JADX INFO: renamed from: b */
    public VText f138707b;

    /* JADX INFO: renamed from: c */
    public VText f138708c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f138709d;

    /* JADX INFO: renamed from: e */
    public VText f138710e;

    /* JADX INFO: renamed from: f */
    public ProfileLoopActionLayout f138711f;

    /* JADX INFO: renamed from: g */
    public ifa0 f138712g;

    /* JADX INFO: renamed from: h */
    public Context f138713h;

    /* JADX INFO: renamed from: i */
    public ProfileLoopEditPetPicFrag f138714i;

    /* JADX INFO: renamed from: j */
    public LoopInputType f138715j;

    /* JADX INFO: renamed from: k */
    public String f138716k;

    /* JADX INFO: renamed from: m */
    public MediaReorderCards f138718m;

    /* JADX INFO: renamed from: n */
    public User f138719n;

    /* JADX INFO: renamed from: o */
    public User f138720o;

    /* JADX INFO: renamed from: q */
    public Picture f138722q;

    /* JADX INFO: renamed from: r */
    public ypa0 f138723r;

    /* JADX INFO: renamed from: s */
    public int f138724s;

    /* JADX INFO: renamed from: t */
    public int f138725t;

    /* JADX INFO: renamed from: u */
    public final int f138726u;

    /* JADX INFO: renamed from: v */
    public String f138727v;

    /* JADX INFO: renamed from: w */
    public String f138728w;

    /* JADX INFO: renamed from: l */
    public int f138717l = 0;

    /* JADX INFO: renamed from: p */
    public List<Media> f138721p = new ArrayList();

    public nfa0(Context context, ProfileLoopEditPetPicFrag profileLoopEditPetPicFrag) {
        this.f138726u = lqa.m150985w() ? 9 : 6;
        this.f138713h = context;
        this.f138714i = profileLoopEditPetPicFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m159154r() {
        this.f138711f.m52969l(this.f138714i);
        m159169n().m51509a2().m51548W0(this.f138714i);
        Pair<View, MediaReorderCards> pairM169813u = new pj90(getAct(), null).m169813u(this.f138706a, true);
        ((View) pairM169813u.first).findViewById(a5c0.f67689l).setVisibility(8);
        MediaReorderCards mediaReorderCards = (MediaReorderCards) pairM169813u.second;
        this.f138718m = mediaReorderCards;
        mediaReorderCards.setCardsCrop(true);
        this.f138718m.setEnableDrag(false);
        this.f138718m.setClickEnable(false);
        this.f138718m.setCurPageId("p_tantanx_pet_photo_normalguide");
        this.f138718m.setViewCount(this.f138726u);
        this.f138707b.setTypeface(Typeface.DEFAULT_BOLD);
        this.f138718m.setVisibility(0);
        this.f138706a.setVisibility(4);
        this.f138718m.setUploadListener(new VReorderCards.InterfaceC8626b() { // from class: l.kfa0
            @Override // com.p046p1.mobile.putong.core.p053ui.profile.VReorderCards.InterfaceC8626b
            /* JADX INFO: renamed from: a */
            public final void mo50821a(int i, boolean z) {
                this.f122911a.m159172s(i, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m159155w(View view) {
        this.f138714i.mo51586H();
    }

    /* JADX INFO: renamed from: A */
    public final void m159156A(List<Media> list) {
        if (list != null && !list.isEmpty()) {
            this.f138721p.addAll(list);
        }
        int size = this.f138721p.size();
        if (size < this.f138726u) {
            this.f138721p.add(new Picture());
        }
        this.f138709d.setLayoutManager(new GridLayoutManager(getAct(), 3));
        Act act = getAct();
        List<Media> list2 = this.f138721p;
        int i = this.f138726u;
        ypa0 ypa0Var = new ypa0(act, list2, size >= i, i, this.f138728w);
        this.f138723r = ypa0Var;
        ypa0Var.m215586H(new ypa0.InterfaceC21460a() { // from class: l.lfa0
            @Override // p149l.ypa0.InterfaceC21460a
            /* JADX INFO: renamed from: a */
            public final void mo149662a(int i2, int i3) {
                this.f127859a.m159173u(i2, i3);
            }
        });
        this.f138709d.setAdapter(this.f138723r);
        this.f138710e.setVisibility(list.size() < this.f138726u ? 8 : 0);
        int i2 = 0;
        while (i2 < this.f138726u) {
            this.f138718m.m50811h(i2).m50640C1(i2 < list.size() ? list.get(i2) : null);
            this.f138718m.m50811h(i2).setChangeAction(new g30() { // from class: l.mfa0
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    this.f133574a.m159174v((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            this.f138718m.m50811h(i2).m50644E1(i2, "p_upload_photos");
            if (i2 == list.size()) {
                this.f138718m.m50811h(i2).m50666P1();
            }
            this.f138718m.m50811h(i2).setFrom(this.f138716k);
            i2++;
        }
        m159165j(false);
    }

    /* JADX INFO: renamed from: B */
    public void m159157B() {
        new xh0.C21150a(getAct()).m208740s("照片未完成上传").m208728g(false).m208731j("未完成上传的照片将会被删除").m208739r("放弃保存并继续").m208736o(new View.OnClickListener() { // from class: l.jfa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117648a.m159155w(view);
            }
        }).m208727f("取消").m208722a().m208721g();
    }

    /* JADX INFO: renamed from: C */
    public int m159158C() {
        if (!NullChecker.m81303a(this.f138718m)) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < this.f138726u && !this.f138718m.m50811h(i2).m50794n(); i2++) {
            arrayList.add(this.f138718m.m50811h(i2).f32976N);
            if (!TEnum.equals(this.f138718m.m50811h(i2).f32976N.status, "normal")) {
                i++;
            }
        }
        if (!arrayList.isEmpty()) {
            this.f138719n.pictures = arrayList;
        }
        return i;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f138713h;
    }

    /* JADX INFO: renamed from: E */
    public final void m159159E() {
        Picture picture;
        int i;
        int size = this.f138721p.size();
        if (size <= 0 || (picture = this.f138722q) == null || TextUtils.isEmpty(picture.url)) {
            return;
        }
        int i2 = this.f138724s;
        if (i2 == 257) {
            Media media = this.f138721p.get(size - 1);
            if (TextUtils.isEmpty(media.url)) {
                this.f138721p.remove(media);
                this.f138721p.add(this.f138722q);
                this.f138723r.m215585G(this.f138721p);
            }
        } else if (i2 == 258 && (i = this.f138725t) > 0 && i < this.f138726u && i < size) {
            this.f138721p.remove(i);
            this.f138721p.add(this.f138725t, this.f138722q);
            this.f138723r.m215585G(this.f138721p);
        }
        m159165j(true);
    }

    /* JADX INFO: renamed from: F */
    public void m159160F() {
        zvf0.m220396r("e_tantanx_pet_upload_normalguide_confirm", this.f138715j.pageId);
    }

    /* JADX INFO: renamed from: G */
    public void m159161G(Media media) {
        int i;
        if (!(media instanceof Picture) || (i = this.f138725t) <= 0 || i >= this.f138726u || i >= this.f138721p.size()) {
            return;
        }
        this.f138718m.m50811h(this.f138725t).m50712y1(media);
        this.f138722q = (Picture) media;
        m159158C();
        for (int i2 = 0; i2 < this.f138726u; i2++) {
            this.f138718m.m50811h(i2).m50644E1(i2, "p_upload_photos");
        }
        m159159E();
    }

    /* JADX INFO: renamed from: e */
    public View m159162e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ofa0.m164060b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ifa0 ifa0Var) {
        this.f138712g = ifa0Var;
    }

    /* JADX INFO: renamed from: i */
    public final void m159164i(int i) {
        if (lqa.m150985w()) {
            ura.m195053e().m195057d().mo33652A8(getAct(), pj90.f149724l, "from_explore_upload_pic", this.f138727v);
        } else {
            m159170p().mo43246n0(i, false, false, true);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM159162e = m159162e(layoutInflater, viewGroup);
        m159154r();
        return viewM159162e;
    }

    /* JADX INFO: renamed from: j */
    public void m159165j(boolean z) {
        ProfileLoopActionLayout profileLoopActionLayout = this.f138711f;
        if (z) {
            profileLoopActionLayout.f34163b.setEnabled(true);
            this.f138711f.f34163b.setClickable(true);
            this.f138711f.f34163b.setBackgroundDrawable(getAct().drawable(e3c0.f89103f));
        } else {
            profileLoopActionLayout.f34163b.setEnabled(false);
            this.f138711f.f34163b.setClickable(false);
            this.f138711f.f34163b.setBackgroundDrawable(getAct().drawable(e3c0.f89143r1));
        }
    }

    /* JADX INFO: renamed from: k */
    public int m159166k() {
        return this.f138717l;
    }

    /* JADX INFO: renamed from: l */
    public void m159167l(User user) {
        if (NullChecker.m81303a(this.f138718m)) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (int i2 = 0; i2 < this.f138726u && !this.f138718m.m50811h(i2).m50794n(); i2++) {
                if (TEnum.equals(this.f138718m.m50811h(i2).f32976N.status, "normal")) {
                    i++;
                    arrayList.add(this.f138718m.m50811h(i2).f32976N);
                }
            }
            if (i > 0) {
                user.pictures = arrayList;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public Bundle m159168m() {
        return this.f138714i.getArguments();
    }

    /* JADX INFO: renamed from: n */
    public ProfileInfoLoopEditAct m159169n() {
        return (ProfileInfoLoopEditAct) this.f138713h;
    }

    /* JADX INFO: renamed from: p */
    public fwl m159170p() {
        return getAct() instanceof fwl ? (fwl) getAct() : (ProfileMediaAct) getAct();
    }

    /* JADX INFO: renamed from: q */
    public boolean m159171q() {
        this.f138712g.m135894o0(this.f138719n, this.f138720o);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m159172s(int i, boolean z) {
        zvf0.m220371D("e_editpage_upload", "p_tantanx_pet_photo_normalguide", vwb.m200311Y("tantanx_pet_photo_uploadstatus", z ? "success" : "fail"));
        if (z) {
            this.f138717l = 0;
            m159159E();
        } else {
            this.f138717l = 1;
            osi0.m165783g("上传失败，请重新尝试");
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m159173u(int i, int i2) {
        String str = "e_tantanx_pet_upload_normalguide_upload";
        if (i2 != 257 && i2 == 258) {
            str = "e_tantanx_pet_upload_normalguide_change";
        }
        zvf0.m220396r(str, this.f138715j.pageId);
        this.f138724s = i2;
        this.f138725t = i;
        m159164i(i);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m159174v(Media media, Boolean bool, Boolean bool2) {
        m159158C();
    }

    /* JADX INFO: renamed from: x */
    public void m159175x(List<Media> list, int i) {
        Media media = list.get(0);
        if (media instanceof Picture) {
            Picture picture = (Picture) media;
            this.f138718m.m50811h(i).m50708w1(picture);
            this.f138722q = picture;
        }
        m159158C();
        for (int i2 = 0; i2 < this.f138726u; i2++) {
            this.f138718m.m50811h(i2).m50644E1(i2, "p_upload_photos");
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m159176y() {
        String strM135892i0 = this.f138712g.m135892i0();
        if (TextUtils.isEmpty(strM135892i0)) {
            this.f138710e.setText("你的照片已经上传" + this.f138726u + "张，请替换一张照片");
            return;
        }
        String strOptString = null;
        try {
            JSONObject jSONObject = new JSONObject(strM135892i0);
            this.f138727v = jSONObject.optString("type");
            String strOptString2 = jSONObject.optString("new_pop_up_title");
            String strOptString3 = jSONObject.optString("new_pop_up_sub_title");
            this.f138728w = jSONObject.optString("new_pop_up_box_title");
            strOptString = jSONObject.optString("new_pop_up_warning");
            this.f138707b.setText(strOptString2);
            this.f138708c.setText(strOptString3);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        if (!TextUtils.isEmpty(strOptString) && lqa.m150985w()) {
            this.f138710e.setText(strOptString);
            return;
        }
        this.f138710e.setText("你的照片已经上传" + this.f138726u + "张，请替换一张照片");
    }

    /* JADX INFO: renamed from: z */
    public void m159177z(LoopInputType loopInputType, String str) {
        this.f138715j = loopInputType;
        this.f138716k = str;
        this.f138719n = m159169n().m51509a2().m51559u0();
        this.f138720o = m159169n().m51509a2().m51561y0();
        m159176y();
        m159156A(this.f138719n.pictures);
        this.f138714i.m51607f5();
        if (m159169n().m51509a2().m51551e1()) {
            this.f138714i.mo51605d5();
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
