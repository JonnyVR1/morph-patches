package p149l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.UserHomeMode;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCard;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCards;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopMyLifeFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.mediaoperation.cropper.NewAlbumCropperAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class xia0 implements fwl, s7m<ria0> {

    /* JADX INFO: renamed from: a */
    public TextView f193083a;

    /* JADX INFO: renamed from: b */
    public TextView f193084b;

    /* JADX INFO: renamed from: c */
    public MediaReorderCards f193085c;

    /* JADX INFO: renamed from: d */
    public ProfileLoopActionLayout f193086d;

    /* JADX INFO: renamed from: e */
    public ria0 f193087e;

    /* JADX INFO: renamed from: f */
    public Act f193088f;

    /* JADX INFO: renamed from: g */
    public ProfileLoopMyLifeFrag f193089g;

    /* JADX INFO: renamed from: h */
    public int f193090h = -1;

    /* JADX INFO: renamed from: i */
    public User f193091i;

    /* JADX INFO: renamed from: j */
    public String f193092j;

    /* JADX INFO: renamed from: l.xia0$a */
    public class C21155a implements a2m {
        public C21155a() {
        }

        @Override // p149l.a2m
        /* JADX INFO: renamed from: b */
        public void mo47539b() {
            xia0.this.m209613E();
        }

        @Override // p149l.a2m
        /* JADX INFO: renamed from: c */
        public void mo47540c() {
            xia0.this.m209613E();
        }

        @Override // p149l.a2m
        /* JADX INFO: renamed from: d */
        public void mo47541d() {
            xia0.this.m209613E();
        }
    }

    public xia0(Act act, ProfileLoopMyLifeFrag profileLoopMyLifeFrag) {
        this.f193088f = act;
        this.f193089g = profileLoopMyLifeFrag;
    }

    /* JADX INFO: renamed from: q */
    private List<Media> m209608q() {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(this.f193085c)) {
            int i = 0;
            while (true) {
                MediaReorderCards mediaReorderCards = this.f193085c;
                if (i >= mediaReorderCards.f33071d || mediaReorderCards.m50811h(i).m50794n()) {
                    break;
                }
                if (TEnum.equals(this.f193085c.m50811h(i).f32976N.status, "normal")) {
                    arrayList.add(this.f193085c.m50811h(i).f32976N);
                }
                i++;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m209609z(View view) {
        m209612C();
    }

    /* JADX INFO: renamed from: A */
    public void m209610A() {
        o6j0.m162859c("e_edit_lifestyle_save", this.f193089g.pageId(), new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: B */
    public void m209611B(List<Media> list, int i) {
        if (this.f193090h < 0) {
            return;
        }
        Media media = list.get(0);
        if (media instanceof Video) {
            this.f193085c.m50811h(this.f193090h).m50714z1((Video) media);
        } else if (media instanceof Picture) {
            this.f193085c.m50811h(this.f193090h).m50708w1((Picture) media);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m209612C() {
        int i = 0;
        while (true) {
            MediaReorderCards mediaReorderCards = this.f193085c;
            if (i >= mediaReorderCards.f33071d) {
                return;
            }
            MediaReorderCard mediaReorderCardM50811h = mediaReorderCards.m50811h(i);
            Media media = this.f193085c.m50811h(i).f32976N;
            if (NullChecker.m81303a(media) && !TEnum.equals(media.status, "normal")) {
                mediaReorderCardM50811h.mo50700r(media, new uia0(this));
            }
            i++;
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f193088f;
    }

    /* JADX INFO: renamed from: E */
    public final void m209613E() {
        int i = 0;
        while (true) {
            MediaReorderCards mediaReorderCards = this.f193085c;
            if (i >= mediaReorderCards.f33071d) {
                return;
            }
            MediaReorderCard mediaReorderCardM50811h = mediaReorderCards.m50811h(i);
            if (NullChecker.m81303a(mediaReorderCardM50811h.f32976N)) {
                VImage vImage = mediaReorderCardM50811h.f32994u;
                if (i == 0) {
                    vImage.setImageResource(ura.m195053e().m195057d().mo33699I4() ? e3c0.f89165z : e3c0.f89146s1);
                } else {
                    vImage.setImageResource(ura.m195053e().m195057d().mo33699I4() ? e3c0.f89159x : e3c0.f89140q1);
                }
            } else {
                mediaReorderCardM50811h.setCropPicStateVisibility(false);
            }
            if (m209628u()) {
                mediaReorderCardM50811h.m50652I1(false, false);
            } else {
                if (lqa.m150975m()) {
                    mediaReorderCardM50811h.m50652I1(i == 0, m209621k());
                } else {
                    mediaReorderCardM50811h.m50652I1(true, m209621k());
                }
            }
            mediaReorderCardM50811h.m50646F1();
            mediaReorderCardM50811h.m50670R1(i);
            i++;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m209614F() {
        User userM209627s = m209627s();
        boolean zM150975m = lqa.m150975m();
        MediaReorderCards mediaReorderCards = this.f193085c;
        if (zM150975m) {
            mediaReorderCards.setViewCount(6);
        } else {
            mediaReorderCards.setViewCount(9);
        }
        boolean z = true;
        this.f193085c.setCardsCrop(true);
        this.f193085c.f33072e = !m209621k();
        List<Media> list = userM209627s.pictures;
        this.f193085c.m50819q(new uia0(this));
        this.f193085c.setSlideWithoutPress(false);
        int i = 0;
        while (true) {
            MediaReorderCards mediaReorderCards2 = this.f193085c;
            if (i >= mediaReorderCards2.f33071d) {
                break;
            }
            MediaReorderCard mediaReorderCardM50811h = mediaReorderCards2.m50811h(i);
            Media media = i < list.size() ? list.get(i) : null;
            mediaReorderCardM50811h.setMediaOperation(this);
            VImage vImage = mediaReorderCardM50811h.f32994u;
            if (i == 0) {
                vImage.setImageResource(ura.m195053e().m195057d().mo33699I4() ? e3c0.f89165z : e3c0.f89146s1);
            } else {
                vImage.setImageResource(ura.m195053e().m195057d().mo33699I4() ? e3c0.f89159x : e3c0.f89140q1);
            }
            mediaReorderCardM50811h.f33058o = m209621k();
            if (lqa.m150975m()) {
                mediaReorderCardM50811h.m50652I1(i == 0, m209621k());
                mediaReorderCardM50811h.setCardDataType(MediaReorderCard.CardDataType.LIFE);
                mediaReorderCardM50811h.f33057n = m209621k();
            } else {
                mediaReorderCardM50811h.m50652I1(true, m209621k());
                mediaReorderCardM50811h.f33057n = i > 0 && m209621k();
                mediaReorderCardM50811h.f33059p = i == 0 && m209621k();
            }
            if (m209628u()) {
                mediaReorderCardM50811h.m50652I1(false, false);
            }
            LoopInputType loopInputType = this.f193089g.f33455z;
            mediaReorderCardM50811h.setDataFrom((loopInputType == LoopInputType.MY_LIFT || loopInputType == LoopInputType.MY_LIFE_SEE_MYSELF) ? pj90.f149720h : pj90.f149721i);
            mediaReorderCardM50811h.m50640C1(media);
            mediaReorderCardM50811h.m50653J0(i, MediaReorderCard.CardType.MY_LIFT);
            xdl0.m208345M0(mediaReorderCardM50811h, (m209629v() && mediaReorderCardM50811h.m50794n()) ? false : true);
            if (NullChecker.m81303a(media) && !TEnum.equals(media.status, "normal")) {
                mediaReorderCardM50811h.m50710x1(media);
            }
            if (m209629v()) {
                mediaReorderCardM50811h.setCropPicStateVisibility(false);
            }
            i++;
        }
        roj0 roj0VarM221515e = CoreModule.f17545c.f19639e0.f149177G1.m221515e();
        ProfileLoopMyLifeFrag profileLoopMyLifeFrag = this.f193089g;
        if (roj0VarM221515e != null) {
            profileLoopMyLifeFrag.duringCreated(CoreModule.f17545c.f19639e0.f149177G1).skip(1).subscribe(mkd0.m154955G(new e30() { // from class: l.via0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f181593a.m209630w((roj0) obj);
                }
            }));
        } else {
            profileLoopMyLifeFrag.duringCreated(CoreModule.f17545c.f19639e0.f149177G1).subscribe(mkd0.m154955G(new e30() { // from class: l.wia0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f186516a.m209631x((roj0) obj);
                }
            }));
        }
        ProfileLoopActionLayout profileLoopActionLayout = this.f193086d;
        LoopInputType loopInputType2 = this.f193089g.f33455z;
        if (loopInputType2 != LoopInputType.MY_LIFT && loopInputType2 != LoopInputType.MY_LIFE_SEE_MYSELF) {
            z = false;
        }
        xdl0.m208344M(profileLoopActionLayout, z);
        if (this.f193089g.m51597W4()) {
            this.f193086d.m52970m();
        }
        this.f193086d.m52969l(this.f193089g);
    }

    /* JADX INFO: renamed from: G */
    public void m209615G() {
        new xh0.C21150a(act()).m208740s("照片未完成上传").m208728g(false).m208731j("未完成上传的照片将被移除").m208739r("继续退出").m208736o(new View.OnClickListener() { // from class: l.sia0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164698a.m209632y(view);
            }
        }).m208727f("重新上传").m208724c(new View.OnClickListener() { // from class: l.tia0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170549a.m209609z(view);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: H */
    public void m209616H() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            MediaReorderCards mediaReorderCards = this.f193085c;
            if (i >= mediaReorderCards.f33071d) {
                m209627s().pictures = arrayList;
                this.f193086d.m52968k();
                return;
            } else {
                Media media = mediaReorderCards.m50811h(i).f32976N;
                if (NullChecker.m81303a(media)) {
                    arrayList.add(media);
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public void m209617I() {
        int size = m209627s().pictures.size() - 1;
        Media media = m209627s().media(size);
        if (NullChecker.m81303a(media)) {
            MediaReorderCard mediaReorderCardM50811h = this.f193085c.m50811h(size);
            xdl0.m208345M0(mediaReorderCardM50811h, true);
            mediaReorderCardM50811h.mo50700r(media, new uia0(this));
        }
    }

    @Override // p149l.fwl
    /* JADX INFO: renamed from: P3 */
    public boolean mo123526P3(int i) {
        if (i <= m209608q().size() - 1 || m209608q().size() < this.f193085c.f33071d) {
            return super.mo123526P3(i);
        }
        lsi0.m151595y("最多可以上传" + this.f193085c.f33071d + "照片");
        return false;
    }

    /* JADX INFO: renamed from: f */
    public View m209618f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yia0.m214886b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.fwl
    /* JADX INFO: renamed from: f2 */
    public void mo43239f2(int i, String str) {
        this.f193090h = i;
        Act act = this.f193088f;
        act.startActivityForResult(NewAlbumCropperAct.m78903m2(act, str, 0.8f, xdl0.m208412y0() - t100.m186890d(40.0f), true), Act.CROP_IMAGE);
    }

    @Override // p149l.fwl
    public List<String> getSelfActions() {
        return vwb.m200324f0(act().getString(R$string.f27821b), act().getString(R$string.f27827c));
    }

    /* JADX INFO: renamed from: i */
    public void m209619i() {
        MediaReorderCard mediaReorderCardM50811h = this.f193085c.m50811h(1);
        MediaReorderCard mediaReorderCardM50811h2 = this.f193085c.m50811h(2);
        mediaReorderCardM50811h.m50713z0();
        mediaReorderCardM50811h2.m50713z0();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m209618f(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ria0 ria0Var) {
        this.f193087e = ria0Var;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m209621k() {
        return !m209629v();
    }

    /* JADX INFO: renamed from: l */
    public boolean m209622l() {
        User user = this.f193091i;
        if (user == null) {
            return false;
        }
        return NullChecker.m81303a(user.subtract(m209627s()));
    }

    /* JADX INFO: renamed from: m */
    public int m209623m() {
        int i = 0;
        if (!NullChecker.m81303a(this.f193085c)) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            MediaReorderCards mediaReorderCards = this.f193085c;
            if (i >= mediaReorderCards.f33071d || mediaReorderCards.m50811h(i).m50794n()) {
                break;
            }
            if (!TEnum.equals(this.f193085c.m50811h(i).f32976N.status, "normal")) {
                i2++;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: n */
    public void m209624n() {
        m209627s().pictures = m209608q();
    }

    @Override // p149l.fwl
    /* JADX INFO: renamed from: n0 */
    public void mo43246n0(int i, boolean z, boolean z2, boolean z3) {
        this.f193090h = i;
        Act act = act();
        if (z2) {
            act.startActivityForResult(MediaPickerAct.m78919X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
            act.overridePendingTransition(tzb0.f172721h, 0);
        } else if (z3) {
            act.startActivityForResult(MediaPickerAct.m78919X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
            act.overridePendingTransition(tzb0.f172721h, 0);
        } else {
            act.startActivityForResult(MediaPickerAct.m78919X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
            act.overridePendingTransition(tzb0.f172721h, 0);
        }
    }

    /* JADX INFO: renamed from: p */
    public Act m209625p() {
        return this.f193088f;
    }

    /* JADX INFO: renamed from: r */
    public void m209626r() {
        if (m209625p() instanceof ProfileInfoLoopEditAct) {
            ((ProfileInfoLoopEditAct) m209625p()).m51509a2().m51548W0(this.f193089g);
        }
        this.f193083a.setTypeface(eqh0.m117752c(3), 1);
        this.f193091i = m209627s().mo223809clone();
        m209614F();
        ProfileLoopMyLifeFrag profileLoopMyLifeFrag = this.f193089g;
        if (profileLoopMyLifeFrag.f33455z == LoopInputType.MY_LIFE_SEE_MYSELF && profileLoopMyLifeFrag.m51597W4()) {
            int size = 3 - CoreModule.f17545c.f19639e0.m169520na().pictures.size();
            TextView textView = this.f193083a;
            if (size > 0) {
                textView.setText(String.format(Locale.getDefault(), "再上传%d张照片", Integer.valueOf(size)));
            } else {
                textView.setText("我的生活");
            }
            this.f193084b.setText("更多真实照片，如户外照、全身照，为你推荐更多真实的人");
            xdl0.m208360X(this.f193083a, t100.m186890d(9.0f));
            xdl0.m208360X(this.f193084b, t100.m186890d(12.0f));
            this.f193084b.setTextSize(15.0f);
            this.f193084b.setTextColor(Color.parseColor("#a9a9a9"));
        } else {
            ProfileLoopMyLifeFrag profileLoopMyLifeFrag2 = this.f193089g;
            if (profileLoopMyLifeFrag2.f33455z == LoopInputType.MY_LIFT && profileLoopMyLifeFrag2.m51596V4()) {
                this.f193084b.setText("展示兴趣爱好、生活日常，收获更多称赞");
            } else if ((lqa.m150973k() || lqa.m150975m()) && this.f193089g.m51657i5()) {
                this.f193083a.setText(String.format(Locale.getDefault(), "再上传%d张照片，即可查看全部照片", Integer.valueOf(3 - CoreModule.f17545c.f19639e0.m169520na().pictures.size())));
                this.f193084b.setText("更多真实照片，如户外照、全身照，为你推荐更多真实的人");
                xdl0.m208360X(this.f193083a, t100.m186890d(41.0f));
                xdl0.m208360X(this.f193084b, t100.m186890d(12.0f));
                this.f193084b.setTextSize(15.0f);
                this.f193084b.setTextColor(Color.parseColor("#a9a9a9"));
            } else if (lqa.m150968f() && this.f193089g.m51595U4()) {
                String strM169801m = pj90.m169801m(this.f193089g.f33455z);
                xdl0.m208360X(this.f193083a, 0);
                xdl0.m208360X(this.f193084b, t100.m186890d(12.0f));
                this.f193084b.setTextSize(15.0f);
                this.f193084b.setTextColor(Color.parseColor("#a9a9a9"));
                if (!TextUtils.isEmpty(strM169801m)) {
                    xdl0.m208344M(this.f193084b, true);
                    this.f193084b.setText(String.format("预计符合%s人的理想型", strM169801m));
                }
            }
        }
        this.f193085c.setReorderCardsCallback(new C21155a());
    }

    /* JADX INFO: renamed from: s */
    public User m209627s() {
        if (m209629v() || this.f193089g.m51657i5() || this.f193089g.f33455z == LoopInputType.GUIDE_UPLOAD_PIC_AND_TAG) {
            if (sth0.m185950b().m185952c() == null) {
                sth0.m185950b().m185954e(CoreModule.f17545c.f19639e0.m169520na().mo223809clone());
            }
            return sth0.m185950b().m185952c();
        }
        if (ura.m195053e().m195057d().mo33757Uc() == null) {
            User userMo223809clone = CoreModule.f17545c.f19639e0.m169520na().mo223809clone();
            if (ura.m195053e().m195057d().mo33907qe()) {
                userMo223809clone = userMo223809clone.riskAuditUser(CoreModule.f17545c.f19639e0.m169430Pa("fake_risk_audit_default_" + userMo223809clone.f56011id));
            }
            ura.m195053e().m195057d().mo33944xc(userMo223809clone);
        }
        return ura.m195053e().m195057d().mo33757Uc();
    }

    /* JADX INFO: renamed from: u */
    public boolean m209628u() {
        return ura.m195053e().m195057d().mo33779X5() && CoreModule.f17545c.f19639e0.f149321Z3.get().equals(UserHomeMode.marryMode) && TextUtils.equals(this.f193089g.f33451E, "from_complete_equity_guide");
    }

    /* JADX INFO: renamed from: v */
    public final boolean m209629v() {
        LoopInputType loopInputType;
        ProfileLoopMyLifeFrag profileLoopMyLifeFrag = this.f193089g;
        if (profileLoopMyLifeFrag == null || (loopInputType = profileLoopMyLifeFrag.f33455z) == null) {
            return false;
        }
        return loopInputType == LoopInputType.TAG_MATCH_PIC || loopInputType == LoopInputType.PIC_MATCH_TAG;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m209630w(roj0 roj0Var) {
        m209616H();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m209631x(roj0 roj0Var) {
        m209616H();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m209632y(View view) {
        this.f193089g.mo51586H();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
