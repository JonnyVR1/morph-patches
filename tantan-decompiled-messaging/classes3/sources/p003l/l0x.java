package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.core.ui.profile.MediaReorderCard;
import com.p1.mobile.putong.core.ui.profile.MediaReorderCards;
import com.p1.mobile.putong.core.ui.profile.ProfileMediaAct;
import com.p1.mobile.putong.core.ui.profile.VReorderCard;
import com.p1.mobile.putong.core.ui.profile.VReorderCards;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.a2m;
import l.a5c0;
import l.e3c0;
import l.fwl;
import l.j760;
import l.lqa;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.n0x;
import l.n6c0;
import l.osi0;
import l.pgm;
import l.pj90;
import l.q860;
import l.qib0;
import l.rhi;
import l.roj0;
import l.t100;
import l.tzb0;
import l.ura;
import l.vwb;
import l.xdl0;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p028v.VDraweeView;
import p028v.VFrame;
import p028v.VImage;
import p028v.VRecyclerView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class l0x extends iww<g0x> implements fwl {

    /* JADX INFO: renamed from: l */
    public static User f5149l;

    /* JADX INFO: renamed from: c */
    public VText f5150c;

    /* JADX INFO: renamed from: d */
    public VText f5151d;

    /* JADX INFO: renamed from: e */
    public MediaReorderCards f5152e;

    /* JADX INFO: renamed from: f */
    public VText f5153f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f5154g;

    /* JADX INFO: renamed from: h */
    public g0x f5155h;

    /* JADX INFO: renamed from: i */
    public C0397b f5156i;

    /* JADX INFO: renamed from: j */
    public int f5157j;

    /* JADX INFO: renamed from: k */
    public MarrySeriesType f5158k;

    /* JADX INFO: renamed from: l.l0x$b */
    public class C0397b extends RecyclerView.Adapter<C0398c> {

        /* JADX INFO: renamed from: a */
        public List<Media> f5160a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public int[] f5161b;

        /* JADX INFO: renamed from: c */
        public int f5162c;

        /* JADX INFO: renamed from: d */
        public List<Media> f5163d;

        public C0397b() {
            int iY0 = (xdl0.y0() - t100.d(80.0f)) / 3;
            this.f5162c = (xdl0.y0() - t100.d(100.0f)) / 3;
            int iD = t100.d(10.0f);
            int i = this.f5162c;
            this.f5161b = new int[]{0, iD - (iY0 - i), iY0 - i};
            this.f5163d = new ArrayList();
        }

        /* JADX INFO: renamed from: A */
        public final void m5950A(Media media, C0398c c0398c) {
            boolean z;
            Iterator<Media> it = this.f5163d.iterator();
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
                if (l0x.this.m5942x()) {
                    lsi0.y("有正在上传的图片");
                    return;
                }
                l0x l0xVar = l0x.this;
                if (l0xVar.f5158k == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS) {
                    if (l0xVar.m5940v().size() >= 6) {
                        lsi0.y("最多可以上传6张照片");
                        return;
                    }
                } else if (l0xVar.m5939u().size() >= 6) {
                    lsi0.y("最多可以上传6张生活瞬间");
                    return;
                }
            }
            List<Media> list = this.f5163d;
            if (z) {
                list.remove(media);
            } else {
                list.add(media);
            }
            c0398c.f5166b.setImageResource(!z ? e3c0.w0 : e3c0.x0);
        }

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ void m5951C(int i, C0398c c0398c, View view) {
            m5950A(this.f5160a.get(i), c0398c);
        }

        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull final C0398c c0398c, final int i) {
            qib0.G.L0(c0398c.f5165a, this.f5160a.get(i).cover().profileMiddle().formatted());
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c0398c.f5167c.getLayoutParams();
            layoutParams.leftMargin = this.f5161b[i % 3];
            int i2 = this.f5162c;
            layoutParams.width = i2;
            layoutParams.height = i2;
            c0398c.f5167c.setLayoutParams(layoutParams);
            xdl0.E0(((RecyclerView.d0) c0398c).itemView, new View.OnClickListener() { // from class: l.m0x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f5489a.m5951C(i, c0398c, view);
                }
            });
        }

        @NonNull
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public C0398c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View viewInflate = LayoutInflater.from(l0x.this.act()).inflate(n6c0.f0, viewGroup, false);
            C0398c c0398c = l0x.this.new C0398c(viewInflate);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            int iY0 = (xdl0.y0() - t100.d(80.0f)) / 3;
            int iY1 = (xdl0.y0() - t100.d(100.0f)) / 3;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iY0, iY1 + t100.d(10.0f));
            } else {
                layoutParams.height = iY1 + t100.d(10.0f);
                layoutParams.width = iY0;
            }
            viewInflate.setLayoutParams(layoutParams);
            return c0398c;
        }

        /* JADX INFO: renamed from: F */
        public void m5954F(List<Media> list) {
            this.f5160a.clear();
            this.f5160a.addAll(list);
            notifyDataSetChanged();
        }

        public int getItemCount() {
            return this.f5160a.size();
        }
    }

    /* JADX INFO: renamed from: l.l0x$c */
    public class C0398c extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public VDraweeView f5165a;

        /* JADX INFO: renamed from: b */
        public VImage f5166b;

        /* JADX INFO: renamed from: c */
        public VFrame f5167c;

        public C0398c(View view) {
            super(view);
            this.f5165a = (VDraweeView) view.findViewById(a5c0.p);
            this.f5166b = (VImage) view.findViewById(a5c0.q);
            this.f5167c = (VFrame) view.findViewById(a5c0.w);
        }
    }

    public l0x(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
        this.f5157j = -1;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m5921k(Media media, Boolean bool, Boolean bool2) {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m5923m(Media media, Boolean bool, Boolean bool2) {
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m5925A(User user, roj0 roj0Var) {
        m5944z(user);
    }

    /* JADX INFO: renamed from: B */
    public void m5926B(String str) {
        Picture pictureNew_ = Picture.new_();
        ((Media) pictureNew_).status = MediaLocalStatus.get("preprocessed");
        ((Media) pictureNew_).url = rhi.B(str);
        pictureNew_.size = new Dimension(new pgm(rhi.z(((Media) pictureNew_).url)).d);
        ((Media) pictureNew_).mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        int i = this.f5157j;
        if (i < 0) {
            return;
        }
        this.f5152e.h(i).w1(pictureNew_);
    }

    /* JADX INFO: renamed from: C */
    public void m5927C(List<Media> list) {
        Video video = (Media) list.get(0);
        int i = this.f5157j;
        if (i < 0) {
            return;
        }
        if (video instanceof Video) {
            this.f5152e.h(i).z1(video);
        } else if (video instanceof Picture) {
            this.f5152e.h(i).w1((Picture) video);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m5928E(q860<CoreMomentInfo> q860Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = q860Var.a.iterator();
        while (it.hasNext()) {
            for (Media media : ((CoreMomentInfo) it.next()).media) {
                if (media instanceof Picture) {
                    arrayList.add(media);
                }
            }
        }
        q860Var.a.size();
        arrayList.size();
        xdl0.M(this.f5153f, !vwb.J(arrayList));
        this.f5156i.m5954F(arrayList);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m5944z(User user) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            MediaReorderCards mediaReorderCards = this.f5152e;
            if (i >= ((VReorderCards) mediaReorderCards).d) {
                user.pictures = arrayList;
                return;
            }
            Media media = mediaReorderCards.h(i).N;
            if (NullChecker.a(media)) {
                arrayList.add(media);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: P3 */
    public boolean m5930P3(int i) {
        if (this.f5158k == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS) {
            if (i > m5941w().size() - 1 && m5940v().size() >= ((VReorderCards) this.f5152e).d) {
                lsi0.y("最多可以上传" + ((VReorderCards) this.f5152e).d + "张照片");
                return false;
            }
        } else if (i > m5941w().size() - 1 && m5939u().size() >= ((VReorderCards) this.f5152e).d) {
            lsi0.y("最多可以上传" + ((VReorderCards) this.f5152e).d + "张生活瞬间");
            return false;
        }
        return super.P3(i);
    }

    /* JADX INFO: renamed from: Q1 */
    public j760<Boolean, Boolean> m5931Q1() {
        boolean z = this.f5158k == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS;
        boolean zC = mqi0.C(((Long) CoreModule.c.q2.W.get()).longValue(), mqi0.o());
        boolean z2 = !zC;
        if (z && !zC) {
            CoreModule.c.q2.W.put(Long.valueOf(mqi0.o()));
        }
        return j760.a(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: b */
    public boolean mo3207b(MarrySeriesType marrySeriesType, User user) {
        if (m5942x()) {
            lsi0.y("有正在上传的图片");
            return false;
        }
        if (marrySeriesType == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS) {
            if (m5940v().size() >= 3) {
                return true;
            }
            osi0.g("请至少上传三张照片");
            return false;
        }
        if (!vwb.J(m5939u())) {
            return true;
        }
        osi0.g("请至少上传一张照片，希望每个加入的人都能展示真实的自我");
        return false;
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: c */
    public boolean mo3208c(MarrySeriesType marrySeriesType) {
        if (marrySeriesType == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS) {
            return m5940v().size() >= 3;
        }
        return !vwb.J(m5939u());
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: e */
    public void mo3209e(MarrySeriesType marrySeriesType, User user) {
        if (marrySeriesType == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS) {
            user.pictures = m5940v();
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
        user.profile.extensions.marriage.lifeMoment = m5939u();
    }

    /* JADX INFO: renamed from: e1 */
    public void m5932e1() {
        for (int i = 0; i < 6; i++) {
            this.f5152e.h(i).J0(i, MediaReorderCard.CardType.LIFE_MOMENT);
        }
    }

    /* JADX INFO: renamed from: f2 */
    public void m5933f2(int i, String str) {
        super.f2(i, str);
        this.f5157j = i;
        act().startActivityForResult(ura.e().d().j6(act(), str), 24576);
    }

    public List<String> getSelfActions() {
        return this.f5158k == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS ? vwb.f0(new String[]{act().getString(R.string.b), act().getString(R.string.c)}) : vwb.f0(new String[]{act().getString(R.string.b)});
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: i */
    public void mo3210i(MarrySeriesType marrySeriesType, User user) {
        this.f5158k = marrySeriesType;
        this.f5150c.setTypeface(eqh0.m3924c(3), 1);
        this.f5152e.setCardsCrop(true);
        this.f5152e.setSlideWithoutPress(false);
        List<Media> arrayList = new ArrayList<>();
        final User userClone = user.clone();
        f5149l = userClone;
        if (marrySeriesType == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS) {
            this.f5152e.setEnableLowPhotoValid(true);
            this.f5150c.setText("请上传至少3张照片");
            xdl0.M(this.f5151d, true);
            xdl0.X(this.f5152e, t100.o);
            if (!vwb.J(userClone.pictures)) {
                arrayList = userClone.pictures;
            }
        } else {
            xdl0.M(this.f5151d, false);
            xdl0.X(this.f5152e, t100.y);
            if (NullChecker.a(userClone.profile) && NullChecker.a(userClone.profile.extensions) && NullChecker.a(userClone.profile.extensions.marriage)) {
                List<String> list = userClone.profile.extensions.marriage.lifeMoment;
                if (!vwb.J(list)) {
                    for (String str : list) {
                        Picture pictureNew_ = Picture.new_();
                        ((Media) pictureNew_).status = MediaLocalStatus.get("normal");
                        ((Media) pictureNew_).url = str;
                        arrayList.add(pictureNew_);
                    }
                }
            }
        }
        m5943y(userClone, arrayList, marrySeriesType);
        this.f5156i = new C0397b();
        this.f5153f.setTypeface(eqh0.m3924c(3), 0);
        this.f5154g.setLayoutManager(new GridLayoutManager(act(), 3));
        this.f5154g.setAdapter(this.f5156i);
        act().duringCreated(CoreModule.c.e0.G1).subscribe((m250) mkd0.G(new e30() { // from class: l.h0x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4096a.m5925A(userClone, (roj0) obj);
            }
        }));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m5936p(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n0 */
    public void m5935n0(int i, boolean z, boolean z2, boolean z3) {
        super.n0(i, z, z2, z3);
        this.f5157j = i;
        ProfileMediaAct profileMediaActAct = act();
        if (z2) {
            profileMediaActAct.startActivityForResult(MediaPickerAct.X1(profileMediaActAct, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(1).build()), 786);
            profileMediaActAct.overridePendingTransition(tzb0.h, 0);
        } else if (z3) {
            profileMediaActAct.startActivityForResult(MediaPickerAct.X1(profileMediaActAct, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withFromType(1).setCroppingNewStyle(true).build()), 786);
            profileMediaActAct.overridePendingTransition(tzb0.h, 0);
        } else {
            profileMediaActAct.startActivityForResult(MediaPickerAct.X1(profileMediaActAct, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withFromType(1).build()), 786);
            profileMediaActAct.overridePendingTransition(tzb0.h, 0);
        }
    }

    /* JADX INFO: renamed from: p */
    public View m5936p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return n0x.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public void m5937q() {
        MediaReorderCard mediaReorderCardH = this.f5152e.h(1);
        MediaReorderCard mediaReorderCardH2 = this.f5152e.h(2);
        mediaReorderCardH.z0();
        mediaReorderCardH2.z0();
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m5934i1(g0x g0xVar) {
        this.f5155h = g0xVar;
    }

    /* JADX INFO: renamed from: u */
    public List<String> m5939u() {
        List<String> listM5941w = m5941w();
        if (!vwb.J(listM5941w)) {
            Iterator<String> it = listM5941w.iterator();
            while (it.hasNext()) {
                if (!it.next().startsWith("http")) {
                    CrashHelper.c(new RuntimeException("AbnormalURL_GetReordersList_RuntimeException:" + listM5941w));
                    break;
                }
            }
        }
        List<Media> list = this.f5156i.f5163d;
        if (!vwb.J(list)) {
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
            listM5941w.add(str2);
        }
        if (z) {
            CrashHelper.c(new RuntimeException("AbnormalURL_SelectedList_RuntimeException:" + str));
        }
        return listM5941w;
    }

    /* JADX INFO: renamed from: v */
    public final List<Media> m5940v() {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(this.f5152e)) {
            for (int i = 0; i < 6 && !this.f5152e.h(i).n(); i++) {
                if (TEnum.equals(this.f5152e.h(i).N.status, "normal")) {
                    arrayList.add(this.f5152e.h(i).N);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w */
    public List<String> m5941w() {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(this.f5152e)) {
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < 6 && !this.f5152e.h(i).n(); i++) {
                arrayList2.add(this.f5152e.h(i).N);
                if (TEnum.equals(this.f5152e.h(i).N.status, "normal")) {
                    arrayList.add(this.f5152e.h(i).N.url);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public boolean m5942x() {
        int i;
        if (NullChecker.a(this.f5152e)) {
            ArrayList arrayList = new ArrayList();
            i = 0;
            for (int i2 = 0; i2 < 6 && !this.f5152e.h(i2).n(); i2++) {
                arrayList.add(this.f5152e.h(i2).N);
                if (!TEnum.equals(this.f5152e.h(i2).N.status, "normal")) {
                    i++;
                }
            }
        } else {
            i = 0;
        }
        return i > 0;
    }

    /* JADX INFO: renamed from: y */
    public final void m5943y(final User user, List<Media> list, MarrySeriesType marrySeriesType) {
        int i = 0;
        if (!lqa.w() && !lqa.n()) {
            while (i < 6) {
                this.f5152e.h(i).C1(i < list.size() ? list.get(i) : null);
                this.f5152e.h(i).setMediaOperation(this);
                this.f5152e.h(i).setChangeAction(new g30() { // from class: l.k0x
                    @Override // p003l.g30
                    /* JADX INFO: renamed from: a */
                    public final void mo4389a(Object obj, Object obj2, Object obj3) {
                        l0x.m5923m((Media) obj, (Boolean) obj2, (Boolean) obj3);
                    }
                });
                if (lqa.j()) {
                    this.f5152e.h(i).E1(i, "p_edit_profile_view");
                }
                this.f5152e.h(i).J0(i, MediaReorderCard.CardType.LIFE_MOMENT);
                if (i == list.size()) {
                    this.f5152e.h(i).P1();
                }
                i++;
            }
            return;
        }
        if (lqa.q() && marrySeriesType == MarrySeriesType.LIFE_MOMENT) {
            this.f5152e.setViewCount(6);
        } else {
            this.f5152e.setViewCount(lqa.n() ? 6 : 9);
        }
        this.f5152e.q(new Runnable() { // from class: l.i0x
            @Override // java.lang.Runnable
            public final void run() {
                this.f4315a.m5944z(user);
            }
        });
        this.f5152e.setEnableLowPhotoValid(true);
        if (lqa.n()) {
            this.f5152e.setReorderCardsCallback(new C0396a());
        }
        int i2 = 0;
        while (true) {
            MediaReorderCards mediaReorderCards = this.f5152e;
            if (i2 >= ((VReorderCards) mediaReorderCards).d) {
                return;
            }
            MediaReorderCard mediaReorderCardH = mediaReorderCards.h(i2);
            Media media = i2 < list.size() ? list.get(i2) : null;
            mediaReorderCardH.setMediaOperation(this);
            VImage vImage = mediaReorderCardH.u;
            if (i2 == 0) {
                vImage.setImageResource(e3c0.s1);
            } else {
                vImage.setImageResource(e3c0.q1);
            }
            ((VReorderCard) mediaReorderCardH).n = i2 > 0;
            ((VReorderCard) mediaReorderCardH).p = i2 == 0;
            if (lqa.q() && marrySeriesType == MarrySeriesType.LIFE_MOMENT) {
                mediaReorderCardH.I1(false, false);
            } else {
                mediaReorderCardH.I1(!lqa.n(), true);
            }
            mediaReorderCardH.setDataFrom(this.f5155h.m5005f0().m503c2() ? pj90.k : pj90.j);
            mediaReorderCardH.C1(media);
            mediaReorderCardH.setMediaOperation(this);
            mediaReorderCardH.setChangeAction(new g30() { // from class: l.j0x
                @Override // p003l.g30
                /* JADX INFO: renamed from: a */
                public final void mo4389a(Object obj, Object obj2, Object obj3) {
                    l0x.m5921k((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            this.f5152e.h(i2).J0(i2, MediaReorderCard.CardType.LIFE_MOMENT);
            if (i2 == list.size()) {
                mediaReorderCardH.P1();
            }
            if (NullChecker.a(media) && !TEnum.equals(media.status, "normal")) {
                mediaReorderCardH.x1(media);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: l.l0x$a */
    public class C0396a implements a2m {
        public C0396a() {
        }

        /* JADX INFO: renamed from: b */
        public void m5945b() {
            for (int i = 0; i < l0x.this.f5152e.getChildCount(); i++) {
                l0x.this.f5152e.h(i).R1(i);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m5946c() {
            for (int i = 0; i < l0x.this.f5152e.getChildCount(); i++) {
                l0x.this.f5152e.h(i).R1(i);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m5947d() {
        }
    }
}
