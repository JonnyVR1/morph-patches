package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCard;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCards;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class k3x extends hzw<f3x> implements xyl {

    /* JADX INFO: renamed from: l */
    public static User f123778l;

    /* JADX INFO: renamed from: c */
    public VText f123779c;

    /* JADX INFO: renamed from: d */
    public VText f123780d;

    /* JADX INFO: renamed from: e */
    public MediaReorderCards f123781e;

    /* JADX INFO: renamed from: f */
    public VText f123782f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f123783g;

    /* JADX INFO: renamed from: h */
    public f3x f123784h;

    /* JADX INFO: renamed from: i */
    public C18087b f123785i;

    /* JADX INFO: renamed from: j */
    public int f123786j;

    /* JADX INFO: renamed from: k */
    public MarrySeriesType f123787k;

    /* JADX INFO: renamed from: l.k3x$b */
    public class C18087b extends RecyclerView.Adapter<C18088c> {

        /* JADX INFO: renamed from: a */
        public List<Media> f123789a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public int[] f123790b;

        /* JADX INFO: renamed from: c */
        public int f123791c;

        /* JADX INFO: renamed from: d */
        public List<Media> f123792d;

        public C18087b() {
            int iM105592y0 = (bnl0.m105592y0() - qa00.m175859d(80.0f)) / 3;
            this.f123791c = (bnl0.m105592y0() - qa00.m175859d(100.0f)) / 3;
            int iM175859d = qa00.m175859d(10.0f);
            int i = this.f123791c;
            this.f123790b = new int[]{0, iM175859d - (iM105592y0 - i), iM105592y0 - i};
            this.f123792d = new ArrayList();
        }

        /* JADX INFO: renamed from: A */
        public final void m148193A(Media media, C18088c c18088c) {
            boolean z;
            Iterator<Media> it = this.f123792d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (it.next().equals(media)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                if (k3x.this.m148188x()) {
                    o1j0.m165651y("有正在上传的图片");
                    return;
                }
                k3x k3xVar = k3x.this;
                if (k3xVar.f123787k == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS) {
                    if (k3xVar.m148186v().size() >= 6) {
                        o1j0.m165651y("最多可以上传6张照片");
                        return;
                    }
                } else if (k3xVar.m148185u().size() >= 6) {
                    o1j0.m165651y("最多可以上传6张生活瞬间");
                    return;
                }
            }
            List<Media> list = this.f123792d;
            if (z) {
                list.remove(media);
            } else {
                list.add(media);
            }
            c18088c.f123795b.setImageResource(!z ? kbc0.f124920w0 : kbc0.f124923x0);
        }

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ void m148194C(int i, C18088c c18088c, View view) {
            m148193A(this.f123789a.get(i), c18088c);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull final C18088c c18088c, final int i) {
            uqb0.f180374G.m127115L0(c18088c.f123794a, this.f123789a.get(i).cover().profileMiddle().formatted());
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c18088c.f123796c.getLayoutParams();
            layoutParams.leftMargin = this.f123790b[i % 3];
            int i2 = this.f123791c;
            layoutParams.width = i2;
            layoutParams.height = i2;
            c18088c.f123796c.setLayoutParams(layoutParams);
            bnl0.m105509E0(c18088c.itemView, new View.OnClickListener() { // from class: l.l3x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f129912a.m148194C(i, c18088c, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public C18088c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View viewInflate = LayoutInflater.from(k3x.this.act()).inflate(sec0.f167565f0, viewGroup, false);
            C18088c c18088c = k3x.this.new C18088c(viewInflate);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            int iM105592y0 = (bnl0.m105592y0() - qa00.m175859d(80.0f)) / 3;
            int iM105592y1 = (bnl0.m105592y0() - qa00.m175859d(100.0f)) / 3;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iM105592y0, iM105592y1 + qa00.m175859d(10.0f));
            } else {
                layoutParams.height = iM105592y1 + qa00.m175859d(10.0f);
                layoutParams.width = iM105592y0;
            }
            viewInflate.setLayoutParams(layoutParams);
            return c18088c;
        }

        /* JADX INFO: renamed from: F */
        public void m148197F(List<Media> list) {
            this.f123789a.clear();
            this.f123789a.addAll(list);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f123789a.size();
        }
    }

    /* JADX INFO: renamed from: l.k3x$c */
    public class C18088c extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public VDraweeView f123794a;

        /* JADX INFO: renamed from: b */
        public VImage f123795b;

        /* JADX INFO: renamed from: c */
        public VFrame f123796c;

        public C18088c(View view) {
            super(view);
            this.f123794a = (VDraweeView) view.findViewById(gdc0.f103688p);
            this.f123795b = (VImage) view.findViewById(gdc0.f103689q);
            this.f123796c = (VFrame) view.findViewById(gdc0.f103695w);
        }
    }

    public k3x(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
        this.f123786j = -1;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m148171k(Media media, Boolean bool, Boolean bool2) {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m148173m(Media media, Boolean bool, Boolean bool2) {
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m148175A(User user, uxj0 uxj0Var) {
        m148190z(user);
    }

    /* JADX INFO: renamed from: B */
    public void m148176B(String str) {
        Picture pictureNew_ = Picture.new_();
        pictureNew_.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        pictureNew_.url = oki.m168011B(str);
        pictureNew_.size = new Dimension(new sim(oki.m168038z(pictureNew_.url)).f168843d);
        pictureNew_.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        int i = this.f123786j;
        if (i < 0) {
            return;
        }
        this.f123781e.m51994h(i).m51891w1(pictureNew_);
    }

    /* JADX INFO: renamed from: C */
    public void m148177C(List<Media> list) {
        Media media = list.get(0);
        int i = this.f123786j;
        if (i < 0) {
            return;
        }
        if (media instanceof Video) {
            this.f123781e.m51994h(i).m51897z1((Video) media);
        } else if (media instanceof Picture) {
            this.f123781e.m51994h(i).m51891w1((Picture) media);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m148178E(vg60<CoreMomentInfo> vg60Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<CoreMomentInfo> it = vg60Var.f184001a.iterator();
        while (it.hasNext()) {
            for (Media media : it.next().media) {
                if (media instanceof Picture) {
                    arrayList.add(media);
                }
            }
        }
        vg60Var.f184001a.size();
        arrayList.size();
        bnl0.m105524M(this.f123782f, !jyb.m147479J(arrayList));
        this.f123785i.m148197F(arrayList);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m148190z(User user) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            MediaReorderCards mediaReorderCards = this.f123781e;
            if (i >= mediaReorderCards.f33919d) {
                user.pictures = arrayList;
                return;
            }
            Media media = mediaReorderCards.m51994h(i).f33824N;
            if (NullChecker.m82486a(media)) {
                arrayList.add(media);
            }
            i++;
        }
    }

    @Override // p153l.xyl
    /* JADX INFO: renamed from: P3 */
    public boolean mo106105P3(int i) {
        if (this.f123787k == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS) {
            if (i > m148187w().size() - 1 && m148186v().size() >= this.f123781e.f33919d) {
                o1j0.m165651y("最多可以上传" + this.f123781e.f33919d + "张照片");
                return false;
            }
        } else if (i > m148187w().size() - 1 && m148185u().size() >= this.f123781e.f33919d) {
            o1j0.m165651y("最多可以上传" + this.f123781e.f33919d + "张生活瞬间");
            return false;
        }
        return super.mo106105P3(i);
    }

    @Override // p153l.xyl
    /* JADX INFO: renamed from: Q1 */
    public pf60<Boolean, Boolean> mo148180Q1() {
        boolean z = this.f123787k == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS;
        boolean zM174438C = pzi0.m174438C(CoreModule.f18264c.f20419q2.f180583W.get().longValue(), pzi0.m174454o());
        boolean z2 = !zM174438C;
        if (z && !zM174438C) {
            CoreModule.f18264c.f20419q2.f180583W.put(Long.valueOf(pzi0.m174454o()));
        }
        return pf60.m172085a(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: b */
    public boolean mo95575b(MarrySeriesType marrySeriesType, User user) {
        if (m148188x()) {
            o1j0.m165651y("有正在上传的图片");
            return false;
        }
        if (marrySeriesType == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS) {
            if (m148186v().size() >= 3) {
                return true;
            }
            r1j0.m179420g("请至少上传三张照片");
            return false;
        }
        if (!jyb.m147479J(m148185u())) {
            return true;
        }
        r1j0.m179420g("请至少上传一张照片，希望每个加入的人都能展示真实的自我");
        return false;
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: c */
    public boolean mo95576c(MarrySeriesType marrySeriesType) {
        if (marrySeriesType == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS) {
            return m148186v().size() >= 3;
        }
        return !jyb.m147479J(m148185u());
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: e */
    public void mo95577e(MarrySeriesType marrySeriesType, User user) {
        if (marrySeriesType == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS) {
            user.pictures = m148186v();
            return;
        }
        Profile profile = user.profile;
        if (profile.extensions == null) {
            profile.extensions = new Extensions();
        }
        Extensions extensions = user.profile.extensions;
        if (extensions.marriage == null) {
            extensions.marriage = new ProfileExtensionMarriage();
        }
        user.profile.extensions.marriage.lifeMoment = m148185u();
    }

    @Override // p153l.xyl
    /* JADX INFO: renamed from: e1 */
    public void mo148181e1() {
        for (int i = 0; i < 6; i++) {
            this.f123781e.m51994h(i).m51836J0(i, MediaReorderCard.CardType.LIFE_MOMENT);
        }
    }

    @Override // p153l.xyl
    /* JADX INFO: renamed from: f2 */
    public void mo44250f2(int i, String str) {
        super.mo44250f2(i, str);
        this.f123786j = i;
        act().startActivityForResult(gta.m132210e().m132214d().mo34861j6(act(), str), Act.CROP_IMAGE);
    }

    @Override // p153l.xyl
    public List<String> getSelfActions() {
        return this.f123787k == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS ? jyb.m147507f0(act().getString(R$string.f28669b), act().getString(R$string.f28675c)) : jyb.m147507f0(act().getString(R$string.f28669b));
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: i */
    public void mo95578i(MarrySeriesType marrySeriesType, User user) {
        this.f123787k = marrySeriesType;
        this.f123779c.setTypeface(lyh0.m156283c(3), 1);
        this.f123781e.setCardsCrop(true);
        this.f123781e.setSlideWithoutPress(false);
        List<Media> arrayList = new ArrayList<>();
        final User userMo225055clone = user.mo225055clone();
        f123778l = userMo225055clone;
        if (marrySeriesType == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS) {
            this.f123781e.setEnableLowPhotoValid(true);
            this.f123779c.setText("请上传至少3张照片");
            bnl0.m105524M(this.f123780d, true);
            bnl0.m105540X(this.f123781e, qa00.f156328o);
            if (!jyb.m147479J(userMo225055clone.pictures)) {
                arrayList = userMo225055clone.pictures;
            }
        } else {
            bnl0.m105524M(this.f123780d, false);
            bnl0.m105540X(this.f123781e, qa00.f156338y);
            if (NullChecker.m82486a(userMo225055clone.profile) && NullChecker.m82486a(userMo225055clone.profile.extensions) && NullChecker.m82486a(userMo225055clone.profile.extensions.marriage)) {
                List<String> list = userMo225055clone.profile.extensions.marriage.lifeMoment;
                if (!jyb.m147479J(list)) {
                    for (String str : list) {
                        Picture pictureNew_ = Picture.new_();
                        pictureNew_.status = MediaLocalStatus.get("normal");
                        pictureNew_.url = str;
                        arrayList.add(pictureNew_);
                    }
                }
            }
        }
        m148189y(userMo225055clone, arrayList, marrySeriesType);
        this.f123785i = new C18087b();
        this.f123782f.setTypeface(lyh0.m156283c(3), 0);
        this.f123783g.setLayoutManager(new GridLayoutManager(act(), 3));
        this.f123783g.setAdapter(this.f123785i);
        act().duringCreated(CoreModule.f18264c.f20381e0.f89034G1).subscribe(psd0.m173596G(new y20() { // from class: l.g3x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102028a.m148175A(userMo225055clone, (uxj0) obj);
            }
        }));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m148182p(layoutInflater, viewGroup);
    }

    @Override // p153l.xyl
    /* JADX INFO: renamed from: n0 */
    public void mo44257n0(int i, boolean z, boolean z2, boolean z3) {
        super.mo44257n0(i, z, z2, z3);
        this.f123786j = i;
        MarryEditProfileSeriesAct marryEditProfileSeriesActAct = act();
        if (z2) {
            marryEditProfileSeriesActAct.startActivityForResult(MediaPickerAct.m80102Y1(marryEditProfileSeriesActAct, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
            marryEditProfileSeriesActAct.overridePendingTransition(z7c0.f203239h, 0);
        } else if (z3) {
            marryEditProfileSeriesActAct.startActivityForResult(MediaPickerAct.m80102Y1(marryEditProfileSeriesActAct, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withFromType(1).setCroppingNewStyle(true).build()), PutongAct.REQUEST_CODE_PICKER);
            marryEditProfileSeriesActAct.overridePendingTransition(z7c0.f203239h, 0);
        } else {
            marryEditProfileSeriesActAct.startActivityForResult(MediaPickerAct.m80102Y1(marryEditProfileSeriesActAct, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
            marryEditProfileSeriesActAct.overridePendingTransition(z7c0.f203239h, 0);
        }
    }

    /* JADX INFO: renamed from: p */
    public View m148182p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m3x.m156947b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public void m148183q() {
        MediaReorderCard mediaReorderCardM51994h = this.f123781e.m51994h(1);
        MediaReorderCard mediaReorderCardM51994h2 = this.f123781e.m51994h(2);
        mediaReorderCardM51994h.m51896z0();
        mediaReorderCardM51994h2.m51896z0();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(f3x f3xVar) {
        this.f123784h = f3xVar;
    }

    /* JADX INFO: renamed from: u */
    public List<String> m148185u() {
        List<String> listM148187w = m148187w();
        if (!jyb.m147479J(listM148187w)) {
            Iterator<String> it = listM148187w.iterator();
            while (it.hasNext()) {
                if (!it.next().startsWith("http")) {
                    CrashHelper.m82479c(new RuntimeException("AbnormalURL_GetReordersList_RuntimeException:" + listM148187w));
                    break;
                }
            }
        }
        List<Media> list = this.f123785i.f123792d;
        if (!jyb.m147479J(list)) {
            ArrayList arrayList = new ArrayList();
            for (Media media : list) {
                if (media.url.startsWith("http")) {
                    arrayList.add(media);
                }
            }
            list = arrayList;
        }
        Iterator it2 = list.iterator();
        String str = "";
        boolean z = false;
        while (it2.hasNext()) {
            String str2 = ((Media) it2.next()).url;
            if (!str2.startsWith("http")) {
                str = str + str2;
                z = true;
            }
            listM148187w.add(str2);
        }
        if (z) {
            CrashHelper.m82479c(new RuntimeException("AbnormalURL_SelectedList_RuntimeException:" + str));
        }
        return listM148187w;
    }

    /* JADX INFO: renamed from: v */
    public final List<Media> m148186v() {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(this.f123781e)) {
            for (int i = 0; i < 6 && !this.f123781e.m51994h(i).m51977n(); i++) {
                if (TEnum.equals(this.f123781e.m51994h(i).f33824N.status, "normal")) {
                    arrayList.add(this.f123781e.m51994h(i).f33824N);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w */
    public List<String> m148187w() {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(this.f123781e)) {
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < 6 && !this.f123781e.m51994h(i).m51977n(); i++) {
                arrayList2.add(this.f123781e.m51994h(i).f33824N);
                if (TEnum.equals(this.f123781e.m51994h(i).f33824N.status, "normal")) {
                    arrayList.add(this.f123781e.m51994h(i).f33824N.url);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public boolean m148188x() {
        int i;
        if (NullChecker.m82486a(this.f123781e)) {
            ArrayList arrayList = new ArrayList();
            i = 0;
            for (int i2 = 0; i2 < 6 && !this.f123781e.m51994h(i2).m51977n(); i2++) {
                arrayList.add(this.f123781e.m51994h(i2).f33824N);
                if (!TEnum.equals(this.f123781e.m51994h(i2).f33824N.status, "normal")) {
                    i++;
                }
            }
        } else {
            i = 0;
        }
        return i > 0;
    }

    /* JADX INFO: renamed from: y */
    public final void m148189y(final User user, List<Media> list, MarrySeriesType marrySeriesType) {
        int i = 0;
        if (!xra.m212804w() && !xra.m212795n()) {
            while (i < 6) {
                this.f123781e.m51994h(i).m51823C1(i < list.size() ? list.get(i) : null);
                this.f123781e.m51994h(i).setMediaOperation(this);
                this.f123781e.m51994h(i).setChangeAction(new a30() { // from class: l.j3x
                    @Override // p153l.a30
                    /* JADX INFO: renamed from: a */
                    public final void mo37058a(Object obj, Object obj2, Object obj3) {
                        k3x.m148173m((Media) obj, (Boolean) obj2, (Boolean) obj3);
                    }
                });
                if (xra.m212791j()) {
                    this.f123781e.m51994h(i).m51827E1(i, "p_edit_profile_view");
                }
                this.f123781e.m51994h(i).m51836J0(i, MediaReorderCard.CardType.LIFE_MOMENT);
                if (i == list.size()) {
                    this.f123781e.m51994h(i).m51849P1();
                }
                i++;
            }
            return;
        }
        if (xra.m212798q() && marrySeriesType == MarrySeriesType.LIFE_MOMENT) {
            this.f123781e.setViewCount(6);
        } else {
            this.f123781e.setViewCount(xra.m212795n() ? 6 : 9);
        }
        this.f123781e.m52002q(new Runnable() { // from class: l.h3x
            @Override // java.lang.Runnable
            public final void run() {
                this.f107700a.m148190z(user);
            }
        });
        this.f123781e.setEnableLowPhotoValid(true);
        if (xra.m212795n()) {
            this.f123781e.setReorderCardsCallback(new C18086a());
        }
        int i2 = 0;
        while (true) {
            MediaReorderCards mediaReorderCards = this.f123781e;
            if (i2 >= mediaReorderCards.f33919d) {
                return;
            }
            MediaReorderCard mediaReorderCardM51994h = mediaReorderCards.m51994h(i2);
            Media media = i2 < list.size() ? list.get(i2) : null;
            mediaReorderCardM51994h.setMediaOperation(this);
            VImage vImage = mediaReorderCardM51994h.f33842u;
            if (i2 == 0) {
                vImage.setImageResource(kbc0.f124909s1);
            } else {
                vImage.setImageResource(kbc0.f124903q1);
            }
            mediaReorderCardM51994h.f33905n = i2 > 0;
            mediaReorderCardM51994h.f33907p = i2 == 0;
            if (xra.m212798q() && marrySeriesType == MarrySeriesType.LIFE_MOMENT) {
                mediaReorderCardM51994h.m51835I1(false, false);
            } else {
                mediaReorderCardM51994h.m51835I1(!xra.m212795n(), true);
            }
            mediaReorderCardM51994h.setDataFrom(this.f123784h.m133134f0().m48639d2() ? tr90.f175817k : tr90.f175816j);
            mediaReorderCardM51994h.m51823C1(media);
            mediaReorderCardM51994h.setMediaOperation(this);
            mediaReorderCardM51994h.setChangeAction(new a30() { // from class: l.i3x
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    k3x.m148171k((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            this.f123781e.m51994h(i2).m51836J0(i2, MediaReorderCard.CardType.LIFE_MOMENT);
            if (i2 == list.size()) {
                mediaReorderCardM51994h.m51849P1();
            }
            if (NullChecker.m82486a(media) && !TEnum.equals(media.status, "normal")) {
                mediaReorderCardM51994h.m51893x1(media);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: l.k3x$a */
    public class C18086a implements t4m {
        public C18086a() {
        }

        @Override // p153l.t4m
        /* JADX INFO: renamed from: b */
        public void mo48722b() {
            for (int i = 0; i < k3x.this.f123781e.getChildCount(); i++) {
                k3x.this.f123781e.m51994h(i).m51853R1(i);
            }
        }

        @Override // p153l.t4m
        /* JADX INFO: renamed from: c */
        public void mo48723c() {
            for (int i = 0; i < k3x.this.f123781e.getChildCount(); i++) {
                k3x.this.f123781e.m51994h(i).m51853R1(i);
            }
        }

        @Override // p153l.t4m
        /* JADX INFO: renamed from: d */
        public void mo48724d() {
        }
    }
}
