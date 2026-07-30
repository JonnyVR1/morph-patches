package p002l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.profile.MediaReorderCard;
import com.p000p1.mobile.putong.core.p001ui.profile.MediaReorderCards;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopMyLifeFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopActionLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.newui.mediaoperation.cropper.NewAlbumCropperAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import l.e30;
import l.e3c0;
import l.eqh0;
import l.fwl;
import l.lqa;
import l.lsi0;
import l.mkd0;
import l.o6j0;
import l.pj90;
import l.roj0;
import l.s7m;
import l.sth0;
import l.t100;
import l.tzb0;
import l.ura;
import l.vwb;
import l.xdl0;
import l.xh0;
import l.yia0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xia0 implements fwl, s7m<ria0> {

    /* JADX INFO: renamed from: a */
    public TextView f22293a;

    /* JADX INFO: renamed from: b */
    public TextView f22294b;

    /* JADX INFO: renamed from: c */
    public MediaReorderCards f22295c;

    /* JADX INFO: renamed from: d */
    public ProfileLoopActionLayout f22296d;

    /* JADX INFO: renamed from: e */
    public ria0 f22297e;

    /* JADX INFO: renamed from: f */
    public Act f22298f;

    /* JADX INFO: renamed from: g */
    public ProfileLoopMyLifeFrag f22299g;

    /* JADX INFO: renamed from: h */
    public int f22300h = -1;

    /* JADX INFO: renamed from: i */
    public User f22301i;

    /* JADX INFO: renamed from: j */
    public String f22302j;

    /* JADX INFO: renamed from: l.xia0$a */
    public class C0897a implements a2m {
        public C0897a() {
        }

        @Override // p002l.a2m
        /* JADX INFO: renamed from: b */
        public void mo1668b() {
            xia0.this.m25956E();
        }

        @Override // p002l.a2m
        /* JADX INFO: renamed from: c */
        public void mo1669c() {
            xia0.this.m25956E();
        }

        @Override // p002l.a2m
        /* JADX INFO: renamed from: d */
        public void mo1670d() {
            xia0.this.m25956E();
        }
    }

    public xia0(Act act, ProfileLoopMyLifeFrag profileLoopMyLifeFrag) {
        this.f22298f = act;
        this.f22299g = profileLoopMyLifeFrag;
    }

    /* JADX INFO: renamed from: q */
    private List<Media> m25950q() {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(this.f22295c)) {
            int i = 0;
            while (true) {
                MediaReorderCards mediaReorderCards = this.f22295c;
                if (i >= mediaReorderCards.f893d || mediaReorderCards.m1257h(i).m1240n()) {
                    break;
                }
                if (TEnum.equals(this.f22295c.m1257h(i).f798N.status, "normal")) {
                    arrayList.add(this.f22295c.m1257h(i).f798N);
                }
                i++;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m25951z(View view) {
        m25954C();
    }

    /* JADX INFO: renamed from: A */
    public void m25952A() {
        o6j0.c("e_edit_lifestyle_save", this.f22299g.pageId(), new o6j0.a[0]);
    }

    /* JADX INFO: renamed from: B */
    public void m25953B(List<Media> list, int i) {
        if (this.f22300h < 0) {
            return;
        }
        Video video = (Media) list.get(0);
        if (video instanceof Video) {
            this.f22295c.m1257h(this.f22300h).m1150z1(video);
        } else if (video instanceof Picture) {
            this.f22295c.m1257h(this.f22300h).m1144w1((Picture) video);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m25954C() {
        int i = 0;
        while (true) {
            MediaReorderCards mediaReorderCards = this.f22295c;
            if (i >= mediaReorderCards.f893d) {
                return;
            }
            MediaReorderCard mediaReorderCardM1257h = mediaReorderCards.m1257h(i);
            Media media = this.f22295c.m1257h(i).f798N;
            if (NullChecker.a(media) && !TEnum.equals(media.status, "normal")) {
                mediaReorderCardM1257h.mo1136r(media, new uia0(this));
            }
            i++;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m25955C0() {
        return this.f22298f;
    }

    /* JADX INFO: renamed from: E */
    public final void m25956E() {
        int i = 0;
        while (true) {
            MediaReorderCards mediaReorderCards = this.f22295c;
            if (i >= mediaReorderCards.f893d) {
                return;
            }
            MediaReorderCard mediaReorderCardM1257h = mediaReorderCards.m1257h(i);
            if (NullChecker.a(mediaReorderCardM1257h.f798N)) {
                VImage vImage = mediaReorderCardM1257h.f816u;
                if (i == 0) {
                    vImage.setImageResource(ura.e().d().I4() ? e3c0.z : e3c0.s1);
                } else {
                    vImage.setImageResource(ura.e().d().I4() ? e3c0.x : e3c0.q1);
                }
            } else {
                mediaReorderCardM1257h.setCropPicStateVisibility(false);
            }
            if (m25975u()) {
                mediaReorderCardM1257h.m1088I1(false, false);
            } else {
                if (lqa.m()) {
                    mediaReorderCardM1257h.m1088I1(i == 0, m25967k());
                } else {
                    mediaReorderCardM1257h.m1088I1(true, m25967k());
                }
            }
            mediaReorderCardM1257h.m1082F1();
            mediaReorderCardM1257h.m1106R1(i);
            i++;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m25957F() {
        User userM25974s = m25974s();
        boolean zM = lqa.m();
        MediaReorderCards mediaReorderCards = this.f22295c;
        if (zM) {
            mediaReorderCards.setViewCount(6);
        } else {
            mediaReorderCards.setViewCount(9);
        }
        boolean z = true;
        this.f22295c.setCardsCrop(true);
        this.f22295c.f894e = !m25967k();
        List list = userM25974s.pictures;
        this.f22295c.m1265q(new uia0(this));
        this.f22295c.setSlideWithoutPress(false);
        int i = 0;
        while (true) {
            MediaReorderCards mediaReorderCards2 = this.f22295c;
            if (i >= mediaReorderCards2.f893d) {
                break;
            }
            MediaReorderCard mediaReorderCardM1257h = mediaReorderCards2.m1257h(i);
            Media media = i < list.size() ? (Media) list.get(i) : null;
            mediaReorderCardM1257h.setMediaOperation(this);
            VImage vImage = mediaReorderCardM1257h.f816u;
            if (i == 0) {
                vImage.setImageResource(ura.e().d().I4() ? e3c0.z : e3c0.s1);
            } else {
                vImage.setImageResource(ura.e().d().I4() ? e3c0.x : e3c0.q1);
            }
            mediaReorderCardM1257h.f880o = m25967k();
            if (lqa.m()) {
                mediaReorderCardM1257h.m1088I1(i == 0, m25967k());
                mediaReorderCardM1257h.setCardDataType(MediaReorderCard.CardDataType.LIFE);
                mediaReorderCardM1257h.f879n = m25967k();
            } else {
                mediaReorderCardM1257h.m1088I1(true, m25967k());
                mediaReorderCardM1257h.f879n = i > 0 && m25967k();
                mediaReorderCardM1257h.f881p = i == 0 && m25967k();
            }
            if (m25975u()) {
                mediaReorderCardM1257h.m1088I1(false, false);
            }
            LoopInputType loopInputType = this.f22299g.f1277z;
            mediaReorderCardM1257h.setDataFrom((loopInputType == LoopInputType.MY_LIFT || loopInputType == LoopInputType.MY_LIFE_SEE_MYSELF) ? pj90.h : pj90.i);
            mediaReorderCardM1257h.m1076C1(media);
            mediaReorderCardM1257h.m1089J0(i, MediaReorderCard.CardType.MY_LIFT);
            xdl0.M0(mediaReorderCardM1257h, (m25976v() && mediaReorderCardM1257h.m1240n()) ? false : true);
            if (NullChecker.a(media) && !TEnum.equals(media.status, "normal")) {
                mediaReorderCardM1257h.m1146x1(media);
            }
            if (m25976v()) {
                mediaReorderCardM1257h.setCropPicStateVisibility(false);
            }
            i++;
        }
        Object objE = CoreModule.c.e0.G1.e();
        ProfileLoopMyLifeFrag profileLoopMyLifeFrag = this.f22299g;
        if (objE != null) {
            profileLoopMyLifeFrag.duringCreated(CoreModule.c.e0.G1).skip(1).subscribe(mkd0.G(new e30() { // from class: l.via0
                public final void call(Object obj) {
                    this.f21167a.m25977w((roj0) obj);
                }
            }));
        } else {
            profileLoopMyLifeFrag.duringCreated(CoreModule.c.e0.G1).subscribe(mkd0.G(new e30() { // from class: l.wia0
                public final void call(Object obj) {
                    this.f21788a.m25978x((roj0) obj);
                }
            }));
        }
        ProfileLoopActionLayout profileLoopActionLayout = this.f22296d;
        LoopInputType loopInputType2 = this.f22299g.f1277z;
        if (loopInputType2 != LoopInputType.MY_LIFT && loopInputType2 != LoopInputType.MY_LIFE_SEE_MYSELF) {
            z = false;
        }
        xdl0.M(profileLoopActionLayout, z);
        if (this.f22299g.m2083W4()) {
            this.f22296d.m3528m();
        }
        this.f22296d.m3527l(this.f22299g);
    }

    /* JADX INFO: renamed from: G */
    public void m25958G() {
        new xh0.a(act()).s("照片未完成上传").g(false).j("未完成上传的照片将被移除").r("继续退出").o(new View.OnClickListener() { // from class: l.sia0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19041a.m25979y(view);
            }
        }).f("重新上传").c(new View.OnClickListener() { // from class: l.tia0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20241a.m25951z(view);
            }
        }).a().g();
    }

    /* JADX INFO: renamed from: H */
    public void m25959H() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            MediaReorderCards mediaReorderCards = this.f22295c;
            if (i >= mediaReorderCards.f893d) {
                m25974s().pictures = arrayList;
                this.f22296d.m3526k();
                return;
            } else {
                Media media = mediaReorderCards.m1257h(i).f798N;
                if (NullChecker.a(media)) {
                    arrayList.add(media);
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public void m25960I() {
        int size = m25974s().pictures.size() - 1;
        Media media = m25974s().media(size);
        if (NullChecker.a(media)) {
            MediaReorderCard mediaReorderCardM1257h = this.f22295c.m1257h(size);
            xdl0.M0(mediaReorderCardM1257h, true);
            mediaReorderCardM1257h.mo1136r(media, new uia0(this));
        }
    }

    /* JADX INFO: renamed from: P3 */
    public boolean m25961P3(int i) {
        if (i <= m25950q().size() - 1 || m25950q().size() < this.f22295c.f893d) {
            return super.P3(i);
        }
        lsi0.y("最多可以上传" + this.f22295c.f893d + "照片");
        return false;
    }

    /* JADX INFO: renamed from: f */
    public View m25962f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yia0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f2 */
    public void m25963f2(int i, String str) {
        this.f22300h = i;
        Act act = this.f22298f;
        act.startActivityForResult(NewAlbumCropperAct.m2(act, str, 0.8f, xdl0.y0() - t100.d(40.0f), true), 24576);
    }

    public List<String> getSelfActions() {
        return vwb.f0(new String[]{act().getString(R.string.b), act().getString(R.string.c)});
    }

    /* JADX INFO: renamed from: i */
    public void m25964i() {
        MediaReorderCard mediaReorderCardM1257h = this.f22295c.m1257h(1);
        MediaReorderCard mediaReorderCardM1257h2 = this.f22295c.m1257h(2);
        mediaReorderCardM1257h.m1149z0();
        mediaReorderCardM1257h2.m1149z0();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m25962f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m25965i1(ria0 ria0Var) {
        this.f22297e = ria0Var;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m25967k() {
        return !m25976v();
    }

    /* JADX INFO: renamed from: l */
    public boolean m25968l() {
        User user = this.f22301i;
        if (user == null) {
            return false;
        }
        return NullChecker.a(user.subtract(m25974s()));
    }

    /* JADX INFO: renamed from: m */
    public int m25969m() {
        int i = 0;
        if (!NullChecker.a(this.f22295c)) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            MediaReorderCards mediaReorderCards = this.f22295c;
            if (i >= mediaReorderCards.f893d || mediaReorderCards.m1257h(i).m1240n()) {
                break;
            }
            if (!TEnum.equals(this.f22295c.m1257h(i).f798N.status, "normal")) {
                i2++;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: n */
    public void m25970n() {
        m25974s().pictures = m25950q();
    }

    /* JADX INFO: renamed from: n0 */
    public void m25971n0(int i, boolean z, boolean z2, boolean z3) {
        this.f22300h = i;
        Act act = act();
        if (z2) {
            act.startActivityForResult(MediaPickerAct.X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(1).build()), 786);
            act.overridePendingTransition(tzb0.h, 0);
        } else if (z3) {
            act.startActivityForResult(MediaPickerAct.X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withFromType(1).build()), 786);
            act.overridePendingTransition(tzb0.h, 0);
        } else {
            act.startActivityForResult(MediaPickerAct.X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withFromType(1).build()), 786);
            act.overridePendingTransition(tzb0.h, 0);
        }
    }

    /* JADX INFO: renamed from: p */
    public Act m25972p() {
        return this.f22298f;
    }

    /* JADX INFO: renamed from: r */
    public void m25973r() {
        if (m25972p() instanceof ProfileInfoLoopEditAct) {
            m25972p().m1991a2().m2030W0(this.f22299g);
        }
        this.f22293a.setTypeface(eqh0.c(3), 1);
        this.f22301i = m25974s().clone();
        m25957F();
        ProfileLoopMyLifeFrag profileLoopMyLifeFrag = this.f22299g;
        if (profileLoopMyLifeFrag.f1277z == LoopInputType.MY_LIFE_SEE_MYSELF && profileLoopMyLifeFrag.m2083W4()) {
            int size = 3 - CoreModule.c.e0.na().pictures.size();
            TextView textView = this.f22293a;
            if (size > 0) {
                textView.setText(String.format(Locale.getDefault(), "再上传%d张照片", Integer.valueOf(size)));
            } else {
                textView.setText("我的生活");
            }
            this.f22294b.setText("更多真实照片，如户外照、全身照，为你推荐更多真实的人");
            xdl0.X(this.f22293a, t100.d(9.0f));
            xdl0.X(this.f22294b, t100.d(12.0f));
            this.f22294b.setTextSize(15.0f);
            this.f22294b.setTextColor(Color.parseColor("#a9a9a9"));
        } else {
            ProfileLoopMyLifeFrag profileLoopMyLifeFrag2 = this.f22299g;
            if (profileLoopMyLifeFrag2.f1277z == LoopInputType.MY_LIFT && profileLoopMyLifeFrag2.m2082V4()) {
                this.f22294b.setText("展示兴趣爱好、生活日常，收获更多称赞");
            } else if ((lqa.k() || lqa.m()) && this.f22299g.m2164i5()) {
                this.f22293a.setText(String.format(Locale.getDefault(), "再上传%d张照片，即可查看全部照片", Integer.valueOf(3 - CoreModule.c.e0.na().pictures.size())));
                this.f22294b.setText("更多真实照片，如户外照、全身照，为你推荐更多真实的人");
                xdl0.X(this.f22293a, t100.d(41.0f));
                xdl0.X(this.f22294b, t100.d(12.0f));
                this.f22294b.setTextSize(15.0f);
                this.f22294b.setTextColor(Color.parseColor("#a9a9a9"));
            } else if (lqa.f() && this.f22299g.m2081U4()) {
                String strM = pj90.m(this.f22299g.f1277z);
                xdl0.X(this.f22293a, 0);
                xdl0.X(this.f22294b, t100.d(12.0f));
                this.f22294b.setTextSize(15.0f);
                this.f22294b.setTextColor(Color.parseColor("#a9a9a9"));
                if (!TextUtils.isEmpty(strM)) {
                    xdl0.M(this.f22294b, true);
                    this.f22294b.setText(String.format("预计符合%s人的理想型", strM));
                }
            }
        }
        this.f22295c.setReorderCardsCallback(new C0897a());
    }

    /* JADX INFO: renamed from: s */
    public User m25974s() {
        if (m25976v() || this.f22299g.m2164i5() || this.f22299g.f1277z == LoopInputType.GUIDE_UPLOAD_PIC_AND_TAG) {
            if (sth0.b().c() == null) {
                sth0.b().e(CoreModule.c.e0.na().clone());
            }
            return sth0.b().c();
        }
        if (ura.e().d().Uc() == null) {
            User userClone = CoreModule.c.e0.na().clone();
            if (ura.e().d().qe()) {
                userClone = userClone.riskAuditUser(CoreModule.c.e0.Pa("fake_risk_audit_default_" + ((DbObject) userClone).id));
            }
            ura.e().d().xc(userClone);
        }
        return ura.e().d().Uc();
    }

    /* JADX INFO: renamed from: u */
    public boolean m25975u() {
        return ura.e().d().X5() && ((String) CoreModule.c.e0.Z3.get()).equals("marryMode") && TextUtils.equals(this.f22299g.f1273E, "from_complete_equity_guide");
    }

    /* JADX INFO: renamed from: v */
    public final boolean m25976v() {
        LoopInputType loopInputType;
        ProfileLoopMyLifeFrag profileLoopMyLifeFrag = this.f22299g;
        if (profileLoopMyLifeFrag == null || (loopInputType = profileLoopMyLifeFrag.f1277z) == null) {
            return false;
        }
        return loopInputType == LoopInputType.TAG_MATCH_PIC || loopInputType == LoopInputType.PIC_MATCH_TAG;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m25977w(roj0 roj0Var) {
        m25959H();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m25978x(roj0 roj0Var) {
        m25959H();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m25979y(View view) {
        this.f22299g.mo2072H();
    }

    public void destroy() {
    }
}
