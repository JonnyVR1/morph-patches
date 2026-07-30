package p153l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.UserHomeMode;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCard;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCards;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopMyLifeFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.mediaoperation.cropper.NewAlbumCropperAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class bra0 implements xyl, iam<vqa0> {

    /* JADX INFO: renamed from: a */
    public TextView f77993a;

    /* JADX INFO: renamed from: b */
    public TextView f77994b;

    /* JADX INFO: renamed from: c */
    public MediaReorderCards f77995c;

    /* JADX INFO: renamed from: d */
    public ProfileLoopActionLayout f77996d;

    /* JADX INFO: renamed from: e */
    public vqa0 f77997e;

    /* JADX INFO: renamed from: f */
    public Act f77998f;

    /* JADX INFO: renamed from: g */
    public ProfileLoopMyLifeFrag f77999g;

    /* JADX INFO: renamed from: h */
    public int f78000h = -1;

    /* JADX INFO: renamed from: i */
    public User f78001i;

    /* JADX INFO: renamed from: j */
    public String f78002j;

    /* JADX INFO: renamed from: l.bra0$a */
    public class C16092a implements t4m {
        public C16092a() {
        }

        @Override // p153l.t4m
        /* JADX INFO: renamed from: b */
        public void mo48722b() {
            bra0.this.m106100E();
        }

        @Override // p153l.t4m
        /* JADX INFO: renamed from: c */
        public void mo48723c() {
            bra0.this.m106100E();
        }

        @Override // p153l.t4m
        /* JADX INFO: renamed from: d */
        public void mo48724d() {
            bra0.this.m106100E();
        }
    }

    public bra0(Act act, ProfileLoopMyLifeFrag profileLoopMyLifeFrag) {
        this.f77998f = act;
        this.f77999g = profileLoopMyLifeFrag;
    }

    /* JADX INFO: renamed from: q */
    private List<Media> m106095q() {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(this.f77995c)) {
            int i = 0;
            while (true) {
                MediaReorderCards mediaReorderCards = this.f77995c;
                if (i >= mediaReorderCards.f33919d || mediaReorderCards.m51994h(i).m51977n()) {
                    break;
                }
                if (TEnum.equals(this.f77995c.m51994h(i).f33824N.status, "normal")) {
                    arrayList.add(this.f77995c.m51994h(i).f33824N);
                }
                i++;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m106096z(View view) {
        m106099C();
    }

    /* JADX INFO: renamed from: A */
    public void m106097A() {
        sfj0.m185596c("e_edit_lifestyle_save", this.f77999g.pageId(), new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: B */
    public void m106098B(List<Media> list, int i) {
        if (this.f78000h < 0) {
            return;
        }
        Media media = list.get(0);
        if (media instanceof Video) {
            this.f77995c.m51994h(this.f78000h).m51897z1((Video) media);
        } else if (media instanceof Picture) {
            this.f77995c.m51994h(this.f78000h).m51891w1((Picture) media);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m106099C() {
        int i = 0;
        while (true) {
            MediaReorderCards mediaReorderCards = this.f77995c;
            if (i >= mediaReorderCards.f33919d) {
                return;
            }
            MediaReorderCard mediaReorderCardM51994h = mediaReorderCards.m51994h(i);
            Media media = this.f77995c.m51994h(i).f33824N;
            if (NullChecker.m82486a(media) && !TEnum.equals(media.status, "normal")) {
                mediaReorderCardM51994h.mo51883r(media, new yqa0(this));
            }
            i++;
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f77998f;
    }

    /* JADX INFO: renamed from: E */
    public final void m106100E() {
        int i = 0;
        while (true) {
            MediaReorderCards mediaReorderCards = this.f77995c;
            if (i >= mediaReorderCards.f33919d) {
                return;
            }
            MediaReorderCard mediaReorderCardM51994h = mediaReorderCards.m51994h(i);
            if (NullChecker.m82486a(mediaReorderCardM51994h.f33824N)) {
                VImage vImage = mediaReorderCardM51994h.f33842u;
                if (i == 0) {
                    vImage.setImageResource(gta.m132210e().m132214d().mo34702I4() ? kbc0.f124928z : kbc0.f124909s1);
                } else {
                    vImage.setImageResource(gta.m132210e().m132214d().mo34702I4() ? kbc0.f124922x : kbc0.f124903q1);
                }
            } else {
                mediaReorderCardM51994h.setCropPicStateVisibility(false);
            }
            if (m106116u()) {
                mediaReorderCardM51994h.m51835I1(false, false);
            } else {
                if (xra.m212794m()) {
                    mediaReorderCardM51994h.m51835I1(i == 0, m106109k());
                } else {
                    mediaReorderCardM51994h.m51835I1(true, m106109k());
                }
            }
            mediaReorderCardM51994h.m51829F1();
            mediaReorderCardM51994h.m51853R1(i);
            i++;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m106101F() {
        User userM106115s = m106115s();
        boolean zM212794m = xra.m212794m();
        MediaReorderCards mediaReorderCards = this.f77995c;
        if (zM212794m) {
            mediaReorderCards.setViewCount(6);
        } else {
            mediaReorderCards.setViewCount(9);
        }
        boolean z = true;
        this.f77995c.setCardsCrop(true);
        this.f77995c.f33920e = !m106109k();
        List<Media> list = userM106115s.pictures;
        this.f77995c.m52002q(new yqa0(this));
        this.f77995c.setSlideWithoutPress(false);
        int i = 0;
        while (true) {
            MediaReorderCards mediaReorderCards2 = this.f77995c;
            if (i >= mediaReorderCards2.f33919d) {
                break;
            }
            MediaReorderCard mediaReorderCardM51994h = mediaReorderCards2.m51994h(i);
            Media media = i < list.size() ? list.get(i) : null;
            mediaReorderCardM51994h.setMediaOperation(this);
            VImage vImage = mediaReorderCardM51994h.f33842u;
            if (i == 0) {
                vImage.setImageResource(gta.m132210e().m132214d().mo34702I4() ? kbc0.f124928z : kbc0.f124909s1);
            } else {
                vImage.setImageResource(gta.m132210e().m132214d().mo34702I4() ? kbc0.f124922x : kbc0.f124903q1);
            }
            mediaReorderCardM51994h.f33906o = m106109k();
            if (xra.m212794m()) {
                mediaReorderCardM51994h.m51835I1(i == 0, m106109k());
                mediaReorderCardM51994h.setCardDataType(MediaReorderCard.CardDataType.LIFE);
                mediaReorderCardM51994h.f33905n = m106109k();
            } else {
                mediaReorderCardM51994h.m51835I1(true, m106109k());
                mediaReorderCardM51994h.f33905n = i > 0 && m106109k();
                mediaReorderCardM51994h.f33907p = i == 0 && m106109k();
            }
            if (m106116u()) {
                mediaReorderCardM51994h.m51835I1(false, false);
            }
            LoopInputType loopInputType = this.f77999g.f34303z;
            mediaReorderCardM51994h.setDataFrom((loopInputType == LoopInputType.MY_LIFT || loopInputType == LoopInputType.MY_LIFE_SEE_MYSELF) ? tr90.f175814h : tr90.f175815i);
            mediaReorderCardM51994h.m51823C1(media);
            mediaReorderCardM51994h.m51836J0(i, MediaReorderCard.CardType.MY_LIFT);
            bnl0.m105525M0(mediaReorderCardM51994h, (m106117v() && mediaReorderCardM51994h.m51977n()) ? false : true);
            if (NullChecker.m82486a(media) && !TEnum.equals(media.status, "normal")) {
                mediaReorderCardM51994h.m51893x1(media);
            }
            if (m106117v()) {
                mediaReorderCardM51994h.setCropPicStateVisibility(false);
            }
            i++;
        }
        uxj0 uxj0VarM222761e = CoreModule.f18264c.f20381e0.f89034G1.m222761e();
        ProfileLoopMyLifeFrag profileLoopMyLifeFrag = this.f77999g;
        if (uxj0VarM222761e != null) {
            profileLoopMyLifeFrag.duringCreated(CoreModule.f18264c.f20381e0.f89034G1).skip(1).subscribe(psd0.m173596G(new y20() { // from class: l.zqa0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f205606a.m106118w((uxj0) obj);
                }
            }));
        } else {
            profileLoopMyLifeFrag.duringCreated(CoreModule.f18264c.f20381e0.f89034G1).subscribe(psd0.m173596G(new y20() { // from class: l.ara0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f72923a.m106119x((uxj0) obj);
                }
            }));
        }
        ProfileLoopActionLayout profileLoopActionLayout = this.f77996d;
        LoopInputType loopInputType2 = this.f77999g.f34303z;
        if (loopInputType2 != LoopInputType.MY_LIFT && loopInputType2 != LoopInputType.MY_LIFE_SEE_MYSELF) {
            z = false;
        }
        bnl0.m105524M(profileLoopActionLayout, z);
        if (this.f77999g.m52780W4()) {
            this.f77996d.m54153m();
        }
        this.f77996d.m54152l(this.f77999g);
    }

    /* JADX INFO: renamed from: G */
    public void m106102G() {
        new th0.C20312a(act()).m191160s("照片未完成上传").m191148g(false).m191151j("未完成上传的照片将被移除").m191159r("继续退出").m191156o(new View.OnClickListener() { // from class: l.wqa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190391a.m106120y(view);
            }
        }).m191147f("重新上传").m191144c(new View.OnClickListener() { // from class: l.xqa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195795a.m106096z(view);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: H */
    public void m106103H() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            MediaReorderCards mediaReorderCards = this.f77995c;
            if (i >= mediaReorderCards.f33919d) {
                m106115s().pictures = arrayList;
                this.f77996d.m54151k();
                return;
            } else {
                Media media = mediaReorderCards.m51994h(i).f33824N;
                if (NullChecker.m82486a(media)) {
                    arrayList.add(media);
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public void m106104I() {
        int size = m106115s().pictures.size() - 1;
        Media media = m106115s().media(size);
        if (NullChecker.m82486a(media)) {
            MediaReorderCard mediaReorderCardM51994h = this.f77995c.m51994h(size);
            bnl0.m105525M0(mediaReorderCardM51994h, true);
            mediaReorderCardM51994h.mo51883r(media, new yqa0(this));
        }
    }

    @Override // p153l.xyl
    /* JADX INFO: renamed from: P3 */
    public boolean mo106105P3(int i) {
        if (i <= m106095q().size() - 1 || m106095q().size() < this.f77995c.f33919d) {
            return super.mo106105P3(i);
        }
        o1j0.m165651y("最多可以上传" + this.f77995c.f33919d + "照片");
        return false;
    }

    /* JADX INFO: renamed from: f */
    public View m106106f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cra0.m112043b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.xyl
    /* JADX INFO: renamed from: f2 */
    public void mo44250f2(int i, String str) {
        this.f78000h = i;
        Act act = this.f77998f;
        act.startActivityForResult(NewAlbumCropperAct.m80086n2(act, str, 0.8f, bnl0.m105592y0() - qa00.m175859d(40.0f), true), Act.CROP_IMAGE);
    }

    @Override // p153l.xyl
    public List<String> getSelfActions() {
        return jyb.m147507f0(act().getString(R$string.f28669b), act().getString(R$string.f28675c));
    }

    /* JADX INFO: renamed from: i */
    public void m106107i() {
        MediaReorderCard mediaReorderCardM51994h = this.f77995c.m51994h(1);
        MediaReorderCard mediaReorderCardM51994h2 = this.f77995c.m51994h(2);
        mediaReorderCardM51994h.m51896z0();
        mediaReorderCardM51994h2.m51896z0();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m106106f(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(vqa0 vqa0Var) {
        this.f77997e = vqa0Var;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m106109k() {
        return !m106117v();
    }

    /* JADX INFO: renamed from: l */
    public boolean m106110l() {
        User user = this.f78001i;
        if (user == null) {
            return false;
        }
        return NullChecker.m82486a(user.subtract(m106115s()));
    }

    /* JADX INFO: renamed from: m */
    public int m106111m() {
        int i = 0;
        if (!NullChecker.m82486a(this.f77995c)) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            MediaReorderCards mediaReorderCards = this.f77995c;
            if (i >= mediaReorderCards.f33919d || mediaReorderCards.m51994h(i).m51977n()) {
                break;
            }
            if (!TEnum.equals(this.f77995c.m51994h(i).f33824N.status, "normal")) {
                i2++;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: n */
    public void m106112n() {
        m106115s().pictures = m106095q();
    }

    @Override // p153l.xyl
    /* JADX INFO: renamed from: n0 */
    public void mo44257n0(int i, boolean z, boolean z2, boolean z3) {
        this.f78000h = i;
        Act act = act();
        if (z2) {
            act.startActivityForResult(MediaPickerAct.m80102Y1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
            act.overridePendingTransition(z7c0.f203239h, 0);
        } else if (z3) {
            act.startActivityForResult(MediaPickerAct.m80102Y1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
            act.overridePendingTransition(z7c0.f203239h, 0);
        } else {
            act.startActivityForResult(MediaPickerAct.m80102Y1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
            act.overridePendingTransition(z7c0.f203239h, 0);
        }
    }

    /* JADX INFO: renamed from: p */
    public Act m106113p() {
        return this.f77998f;
    }

    /* JADX INFO: renamed from: r */
    public void m106114r() {
        if (m106113p() instanceof ProfileInfoLoopEditAct) {
            ((ProfileInfoLoopEditAct) m106113p()).m52692b2().m52731W0(this.f77999g);
        }
        this.f77993a.setTypeface(lyh0.m156283c(3), 1);
        this.f78001i = m106115s().mo225055clone();
        m106101F();
        ProfileLoopMyLifeFrag profileLoopMyLifeFrag = this.f77999g;
        if (profileLoopMyLifeFrag.f34303z == LoopInputType.MY_LIFE_SEE_MYSELF && profileLoopMyLifeFrag.m52780W4()) {
            int size = 3 - CoreModule.f18264c.f20381e0.m116593na().pictures.size();
            TextView textView = this.f77993a;
            if (size > 0) {
                textView.setText(String.format(Locale.getDefault(), "再上传%d张照片", Integer.valueOf(size)));
            } else {
                textView.setText("我的生活");
            }
            this.f77994b.setText("更多真实照片，如户外照、全身照，为你推荐更多真实的人");
            bnl0.m105540X(this.f77993a, qa00.m175859d(9.0f));
            bnl0.m105540X(this.f77994b, qa00.m175859d(12.0f));
            this.f77994b.setTextSize(15.0f);
            this.f77994b.setTextColor(Color.parseColor("#a9a9a9"));
        } else {
            ProfileLoopMyLifeFrag profileLoopMyLifeFrag2 = this.f77999g;
            if (profileLoopMyLifeFrag2.f34303z == LoopInputType.MY_LIFT && profileLoopMyLifeFrag2.m52779V4()) {
                this.f77994b.setText("展示兴趣爱好、生活日常，收获更多称赞");
            } else if ((xra.m212792k() || xra.m212794m()) && this.f77999g.m52840i5()) {
                this.f77993a.setText(String.format(Locale.getDefault(), "再上传%d张照片，即可查看全部照片", Integer.valueOf(3 - CoreModule.f18264c.f20381e0.m116593na().pictures.size())));
                this.f77994b.setText("更多真实照片，如户外照、全身照，为你推荐更多真实的人");
                bnl0.m105540X(this.f77993a, qa00.m175859d(41.0f));
                bnl0.m105540X(this.f77994b, qa00.m175859d(12.0f));
                this.f77994b.setTextSize(15.0f);
                this.f77994b.setTextColor(Color.parseColor("#a9a9a9"));
            } else if (xra.m212787f() && this.f77999g.m52778U4()) {
                String strM192426m = tr90.m192426m(this.f77999g.f34303z);
                bnl0.m105540X(this.f77993a, 0);
                bnl0.m105540X(this.f77994b, qa00.m175859d(12.0f));
                this.f77994b.setTextSize(15.0f);
                this.f77994b.setTextColor(Color.parseColor("#a9a9a9"));
                if (!TextUtils.isEmpty(strM192426m)) {
                    bnl0.m105524M(this.f77994b, true);
                    this.f77994b.setText(String.format("预计符合%s人的理想型", strM192426m));
                }
            }
        }
        this.f77995c.setReorderCardsCallback(new C16092a());
    }

    /* JADX INFO: renamed from: s */
    public User m106115s() {
        if (m106117v() || this.f77999g.m52840i5() || this.f77999g.f34303z == LoopInputType.GUIDE_UPLOAD_PIC_AND_TAG) {
            if (a2i0.m95674b().m95676c() == null) {
                a2i0.m95674b().m95678e(CoreModule.f18264c.f20381e0.m116593na().mo225055clone());
            }
            return a2i0.m95674b().m95676c();
        }
        if (gta.m132210e().m132214d().mo34760Uc() == null) {
            User userMo225055clone = CoreModule.f18264c.f20381e0.m116593na().mo225055clone();
            if (gta.m132210e().m132214d().mo34910qe()) {
                userMo225055clone = userMo225055clone.riskAuditUser(CoreModule.f18264c.f20381e0.m116503Pa("fake_risk_audit_default_" + userMo225055clone.f56859id));
            }
            gta.m132210e().m132214d().mo34947xc(userMo225055clone);
        }
        return gta.m132210e().m132214d().mo34760Uc();
    }

    /* JADX INFO: renamed from: u */
    public boolean m106116u() {
        return gta.m132210e().m132214d().mo34782X5() && CoreModule.f18264c.f20381e0.f89178Z3.get().equals(UserHomeMode.marryMode) && TextUtils.equals(this.f77999g.f34299E, "from_complete_equity_guide");
    }

    /* JADX INFO: renamed from: v */
    public final boolean m106117v() {
        LoopInputType loopInputType;
        ProfileLoopMyLifeFrag profileLoopMyLifeFrag = this.f77999g;
        if (profileLoopMyLifeFrag == null || (loopInputType = profileLoopMyLifeFrag.f34303z) == null) {
            return false;
        }
        return loopInputType == LoopInputType.TAG_MATCH_PIC || loopInputType == LoopInputType.PIC_MATCH_TAG;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m106118w(uxj0 uxj0Var) {
        m106103H();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m106119x(uxj0 uxj0Var) {
        m106103H();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m106120y(View view) {
        this.f77999g.mo52769H();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
