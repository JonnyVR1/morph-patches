package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCard;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCards;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class l0x extends iww<g0x> implements fwl {

    /* JADX INFO: renamed from: l */
    public static User f125581l;

    /* JADX INFO: renamed from: c */
    public VText f125582c;

    /* JADX INFO: renamed from: d */
    public VText f125583d;

    /* JADX INFO: renamed from: e */
    public MediaReorderCards f125584e;

    /* JADX INFO: renamed from: f */
    public VText f125585f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f125586g;

    /* JADX INFO: renamed from: h */
    public g0x f125587h;

    /* JADX INFO: renamed from: i */
    public C18130b f125588i;

    /* JADX INFO: renamed from: j */
    public int f125589j;

    /* JADX INFO: renamed from: k */
    public MarrySeriesType f125590k;

    /* JADX INFO: renamed from: l.l0x$b */
    public class C18130b extends RecyclerView.Adapter<C18131c> {

        /* JADX INFO: renamed from: a */
        public List<Media> f125592a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public int[] f125593b;

        /* JADX INFO: renamed from: c */
        public int f125594c;

        /* JADX INFO: renamed from: d */
        public List<Media> f125595d;

        public C18130b() {
            int iM208412y0 = (xdl0.m208412y0() - t100.m186890d(80.0f)) / 3;
            this.f125594c = (xdl0.m208412y0() - t100.m186890d(100.0f)) / 3;
            int iM186890d = t100.m186890d(10.0f);
            int i = this.f125594c;
            this.f125593b = new int[]{0, iM186890d - (iM208412y0 - i), iM208412y0 - i};
            this.f125595d = new ArrayList();
        }

        /* JADX INFO: renamed from: A */
        public final void m148146A(Media media, C18131c c18131c) {
            boolean z;
            Iterator<Media> it = this.f125595d.iterator();
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
                if (l0x.this.m148141x()) {
                    lsi0.m151595y("有正在上传的图片");
                    return;
                }
                l0x l0xVar = l0x.this;
                if (l0xVar.f125590k == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS) {
                    if (l0xVar.m148139v().size() >= 6) {
                        lsi0.m151595y("最多可以上传6张照片");
                        return;
                    }
                } else if (l0xVar.m148138u().size() >= 6) {
                    lsi0.m151595y("最多可以上传6张生活瞬间");
                    return;
                }
            }
            List<Media> list = this.f125595d;
            if (z) {
                list.remove(media);
            } else {
                list.add(media);
            }
            c18131c.f125598b.setImageResource(!z ? e3c0.f89157w0 : e3c0.f89160x0);
        }

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ void m148147C(int i, C18131c c18131c, View view) {
            m148146A(this.f125592a.get(i), c18131c);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull final C18131c c18131c, final int i) {
            qib0.f154691G.m102331L0(c18131c.f125597a, this.f125592a.get(i).cover().profileMiddle().formatted());
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c18131c.f125599c.getLayoutParams();
            layoutParams.leftMargin = this.f125593b[i % 3];
            int i2 = this.f125594c;
            layoutParams.width = i2;
            layoutParams.height = i2;
            c18131c.f125599c.setLayoutParams(layoutParams);
            xdl0.m208329E0(c18131c.itemView, new View.OnClickListener() { // from class: l.m0x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f130778a.m148147C(i, c18131c, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public C18131c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View viewInflate = LayoutInflater.from(l0x.this.act()).inflate(n6c0.f137351f0, viewGroup, false);
            C18131c c18131c = l0x.this.new C18131c(viewInflate);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            int iM208412y0 = (xdl0.m208412y0() - t100.m186890d(80.0f)) / 3;
            int iM208412y1 = (xdl0.m208412y0() - t100.m186890d(100.0f)) / 3;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iM208412y0, iM208412y1 + t100.m186890d(10.0f));
            } else {
                layoutParams.height = iM208412y1 + t100.m186890d(10.0f);
                layoutParams.width = iM208412y0;
            }
            viewInflate.setLayoutParams(layoutParams);
            return c18131c;
        }

        /* JADX INFO: renamed from: F */
        public void m148150F(List<Media> list) {
            this.f125592a.clear();
            this.f125592a.addAll(list);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f125592a.size();
        }
    }

    /* JADX INFO: renamed from: l.l0x$c */
    public class C18131c extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public VDraweeView f125597a;

        /* JADX INFO: renamed from: b */
        public VImage f125598b;

        /* JADX INFO: renamed from: c */
        public VFrame f125599c;

        public C18131c(View view) {
            super(view);
            this.f125597a = (VDraweeView) view.findViewById(a5c0.f67693p);
            this.f125598b = (VImage) view.findViewById(a5c0.f67694q);
            this.f125599c = (VFrame) view.findViewById(a5c0.f67700w);
        }
    }

    public l0x(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
        this.f125589j = -1;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m148126k(Media media, Boolean bool, Boolean bool2) {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m148128m(Media media, Boolean bool, Boolean bool2) {
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m148130A(User user, roj0 roj0Var) {
        m148143z(user);
    }

    /* JADX INFO: renamed from: B */
    public void m148131B(String str) {
        Picture pictureNew_ = Picture.new_();
        pictureNew_.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        pictureNew_.url = rhi.m179355B(str);
        pictureNew_.size = new Dimension(new pgm(rhi.m179382z(pictureNew_.url)).f148730d);
        pictureNew_.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        int i = this.f125589j;
        if (i < 0) {
            return;
        }
        this.f125584e.m50811h(i).m50708w1(pictureNew_);
    }

    /* JADX INFO: renamed from: C */
    public void m148132C(List<Media> list) {
        Media media = list.get(0);
        int i = this.f125589j;
        if (i < 0) {
            return;
        }
        if (media instanceof Video) {
            this.f125584e.m50811h(i).m50714z1((Video) media);
        } else if (media instanceof Picture) {
            this.f125584e.m50811h(i).m50708w1((Picture) media);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m148133E(q860<CoreMomentInfo> q860Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<CoreMomentInfo> it = q860Var.f153135a.iterator();
        while (it.hasNext()) {
            for (Media media : it.next().media) {
                if (media instanceof Picture) {
                    arrayList.add(media);
                }
            }
        }
        q860Var.f153135a.size();
        arrayList.size();
        xdl0.m208344M(this.f125585f, !vwb.m200296J(arrayList));
        this.f125588i.m148150F(arrayList);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m148143z(User user) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            MediaReorderCards mediaReorderCards = this.f125584e;
            if (i >= mediaReorderCards.f33071d) {
                user.pictures = arrayList;
                return;
            }
            Media media = mediaReorderCards.m50811h(i).f32976N;
            if (NullChecker.m81303a(media)) {
                arrayList.add(media);
            }
            i++;
        }
    }

    @Override // p149l.fwl
    /* JADX INFO: renamed from: P3 */
    public boolean mo123526P3(int i) {
        if (this.f125590k == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS) {
            if (i > m148140w().size() - 1 && m148139v().size() >= this.f125584e.f33071d) {
                lsi0.m151595y("最多可以上传" + this.f125584e.f33071d + "张照片");
                return false;
            }
        } else if (i > m148140w().size() - 1 && m148138u().size() >= this.f125584e.f33071d) {
            lsi0.m151595y("最多可以上传" + this.f125584e.f33071d + "张生活瞬间");
            return false;
        }
        return super.mo123526P3(i);
    }

    @Override // p149l.fwl
    /* JADX INFO: renamed from: Q1 */
    public j760<Boolean, Boolean> mo123527Q1() {
        boolean z = this.f125590k == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS;
        boolean zM155928C = mqi0.m155928C(CoreModule.f17545c.f19677q2.f114442W.get().longValue(), mqi0.m155944o());
        boolean z2 = !zM155928C;
        if (z && !zM155928C) {
            CoreModule.f17545c.f19677q2.f114442W.put(Long.valueOf(mqi0.m155944o()));
        }
        return j760.m140076a(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: b */
    public boolean mo104515b(MarrySeriesType marrySeriesType, User user) {
        if (m148141x()) {
            lsi0.m151595y("有正在上传的图片");
            return false;
        }
        if (marrySeriesType == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS) {
            if (m148139v().size() >= 3) {
                return true;
            }
            osi0.m165783g("请至少上传三张照片");
            return false;
        }
        if (!vwb.m200296J(m148138u())) {
            return true;
        }
        osi0.m165783g("请至少上传一张照片，希望每个加入的人都能展示真实的自我");
        return false;
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: c */
    public boolean mo104516c(MarrySeriesType marrySeriesType) {
        if (marrySeriesType == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS) {
            return m148139v().size() >= 3;
        }
        return !vwb.m200296J(m148138u());
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: e */
    public void mo104517e(MarrySeriesType marrySeriesType, User user) {
        if (marrySeriesType == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS) {
            user.pictures = m148139v();
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
        user.profile.extensions.marriage.lifeMoment = m148138u();
    }

    @Override // p149l.fwl
    /* JADX INFO: renamed from: e1 */
    public void mo123528e1() {
        for (int i = 0; i < 6; i++) {
            this.f125584e.m50811h(i).m50653J0(i, MediaReorderCard.CardType.LIFE_MOMENT);
        }
    }

    @Override // p149l.fwl
    /* JADX INFO: renamed from: f2 */
    public void mo43239f2(int i, String str) {
        super.mo43239f2(i, str);
        this.f125589j = i;
        act().startActivityForResult(ura.m195053e().m195057d().mo33858j6(act(), str), Act.CROP_IMAGE);
    }

    @Override // p149l.fwl
    public List<String> getSelfActions() {
        return this.f125590k == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS ? vwb.m200324f0(act().getString(R$string.f27821b), act().getString(R$string.f27827c)) : vwb.m200324f0(act().getString(R$string.f27821b));
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: i */
    public void mo104518i(MarrySeriesType marrySeriesType, User user) {
        this.f125590k = marrySeriesType;
        this.f125582c.setTypeface(eqh0.m117752c(3), 1);
        this.f125584e.setCardsCrop(true);
        this.f125584e.setSlideWithoutPress(false);
        List<Media> arrayList = new ArrayList<>();
        final User userMo223809clone = user.mo223809clone();
        f125581l = userMo223809clone;
        if (marrySeriesType == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS) {
            this.f125584e.setEnableLowPhotoValid(true);
            this.f125582c.setText("请上传至少3张照片");
            xdl0.m208344M(this.f125583d, true);
            xdl0.m208360X(this.f125584e, t100.f167266o);
            if (!vwb.m200296J(userMo223809clone.pictures)) {
                arrayList = userMo223809clone.pictures;
            }
        } else {
            xdl0.m208344M(this.f125583d, false);
            xdl0.m208360X(this.f125584e, t100.f167276y);
            if (NullChecker.m81303a(userMo223809clone.profile) && NullChecker.m81303a(userMo223809clone.profile.extensions) && NullChecker.m81303a(userMo223809clone.profile.extensions.marriage)) {
                List<String> list = userMo223809clone.profile.extensions.marriage.lifeMoment;
                if (!vwb.m200296J(list)) {
                    for (String str : list) {
                        Picture pictureNew_ = Picture.new_();
                        pictureNew_.status = MediaLocalStatus.get("normal");
                        pictureNew_.url = str;
                        arrayList.add(pictureNew_);
                    }
                }
            }
        }
        m148142y(userMo223809clone, arrayList, marrySeriesType);
        this.f125588i = new C18130b();
        this.f125585f.setTypeface(eqh0.m117752c(3), 0);
        this.f125586g.setLayoutManager(new GridLayoutManager(act(), 3));
        this.f125586g.setAdapter(this.f125588i);
        act().duringCreated(CoreModule.f17545c.f19639e0.f149177G1).subscribe(mkd0.m154955G(new e30() { // from class: l.h0x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105261a.m148130A(userMo223809clone, (roj0) obj);
            }
        }));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m148135p(layoutInflater, viewGroup);
    }

    @Override // p149l.fwl
    /* JADX INFO: renamed from: n0 */
    public void mo43246n0(int i, boolean z, boolean z2, boolean z3) {
        super.mo43246n0(i, z, z2, z3);
        this.f125589j = i;
        MarryEditProfileSeriesAct marryEditProfileSeriesActAct = act();
        if (z2) {
            marryEditProfileSeriesActAct.startActivityForResult(MediaPickerAct.m78919X1(marryEditProfileSeriesActAct, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
            marryEditProfileSeriesActAct.overridePendingTransition(tzb0.f172721h, 0);
        } else if (z3) {
            marryEditProfileSeriesActAct.startActivityForResult(MediaPickerAct.m78919X1(marryEditProfileSeriesActAct, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withFromType(1).setCroppingNewStyle(true).build()), PutongAct.REQUEST_CODE_PICKER);
            marryEditProfileSeriesActAct.overridePendingTransition(tzb0.f172721h, 0);
        } else {
            marryEditProfileSeriesActAct.startActivityForResult(MediaPickerAct.m78919X1(marryEditProfileSeriesActAct, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
            marryEditProfileSeriesActAct.overridePendingTransition(tzb0.f172721h, 0);
        }
    }

    /* JADX INFO: renamed from: p */
    public View m148135p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return n0x.m157301b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public void m148136q() {
        MediaReorderCard mediaReorderCardM50811h = this.f125584e.m50811h(1);
        MediaReorderCard mediaReorderCardM50811h2 = this.f125584e.m50811h(2);
        mediaReorderCardM50811h.m50713z0();
        mediaReorderCardM50811h2.m50713z0();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(g0x g0xVar) {
        this.f125587h = g0xVar;
    }

    /* JADX INFO: renamed from: u */
    public List<String> m148138u() {
        List<String> listM148140w = m148140w();
        if (!vwb.m200296J(listM148140w)) {
            Iterator<String> it = listM148140w.iterator();
            while (it.hasNext()) {
                if (!it.next().startsWith("http")) {
                    CrashHelper.m81296c(new RuntimeException("AbnormalURL_GetReordersList_RuntimeException:" + listM148140w));
                    break;
                }
            }
        }
        List<Media> list = this.f125588i.f125595d;
        if (!vwb.m200296J(list)) {
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
            listM148140w.add(str2);
        }
        if (z) {
            CrashHelper.m81296c(new RuntimeException("AbnormalURL_SelectedList_RuntimeException:" + str));
        }
        return listM148140w;
    }

    /* JADX INFO: renamed from: v */
    public final List<Media> m148139v() {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(this.f125584e)) {
            for (int i = 0; i < 6 && !this.f125584e.m50811h(i).m50794n(); i++) {
                if (TEnum.equals(this.f125584e.m50811h(i).f32976N.status, "normal")) {
                    arrayList.add(this.f125584e.m50811h(i).f32976N);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w */
    public List<String> m148140w() {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(this.f125584e)) {
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < 6 && !this.f125584e.m50811h(i).m50794n(); i++) {
                arrayList2.add(this.f125584e.m50811h(i).f32976N);
                if (TEnum.equals(this.f125584e.m50811h(i).f32976N.status, "normal")) {
                    arrayList.add(this.f125584e.m50811h(i).f32976N.url);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public boolean m148141x() {
        int i;
        if (NullChecker.m81303a(this.f125584e)) {
            ArrayList arrayList = new ArrayList();
            i = 0;
            for (int i2 = 0; i2 < 6 && !this.f125584e.m50811h(i2).m50794n(); i2++) {
                arrayList.add(this.f125584e.m50811h(i2).f32976N);
                if (!TEnum.equals(this.f125584e.m50811h(i2).f32976N.status, "normal")) {
                    i++;
                }
            }
        } else {
            i = 0;
        }
        return i > 0;
    }

    /* JADX INFO: renamed from: y */
    public final void m148142y(final User user, List<Media> list, MarrySeriesType marrySeriesType) {
        int i = 0;
        if (!lqa.m150985w() && !lqa.m150976n()) {
            while (i < 6) {
                this.f125584e.m50811h(i).m50640C1(i < list.size() ? list.get(i) : null);
                this.f125584e.m50811h(i).setMediaOperation(this);
                this.f125584e.m50811h(i).setChangeAction(new g30() { // from class: l.k0x
                    @Override // p149l.g30
                    /* JADX INFO: renamed from: a */
                    public final void mo36055a(Object obj, Object obj2, Object obj3) {
                        l0x.m148128m((Media) obj, (Boolean) obj2, (Boolean) obj3);
                    }
                });
                if (lqa.m150972j()) {
                    this.f125584e.m50811h(i).m50644E1(i, "p_edit_profile_view");
                }
                this.f125584e.m50811h(i).m50653J0(i, MediaReorderCard.CardType.LIFE_MOMENT);
                if (i == list.size()) {
                    this.f125584e.m50811h(i).m50666P1();
                }
                i++;
            }
            return;
        }
        if (lqa.m150979q() && marrySeriesType == MarrySeriesType.LIFE_MOMENT) {
            this.f125584e.setViewCount(6);
        } else {
            this.f125584e.setViewCount(lqa.m150976n() ? 6 : 9);
        }
        this.f125584e.m50819q(new Runnable() { // from class: l.i0x
            @Override // java.lang.Runnable
            public final void run() {
                this.f110395a.m148143z(user);
            }
        });
        this.f125584e.setEnableLowPhotoValid(true);
        if (lqa.m150976n()) {
            this.f125584e.setReorderCardsCallback(new C18129a());
        }
        int i2 = 0;
        while (true) {
            MediaReorderCards mediaReorderCards = this.f125584e;
            if (i2 >= mediaReorderCards.f33071d) {
                return;
            }
            MediaReorderCard mediaReorderCardM50811h = mediaReorderCards.m50811h(i2);
            Media media = i2 < list.size() ? list.get(i2) : null;
            mediaReorderCardM50811h.setMediaOperation(this);
            VImage vImage = mediaReorderCardM50811h.f32994u;
            if (i2 == 0) {
                vImage.setImageResource(e3c0.f89146s1);
            } else {
                vImage.setImageResource(e3c0.f89140q1);
            }
            mediaReorderCardM50811h.f33057n = i2 > 0;
            mediaReorderCardM50811h.f33059p = i2 == 0;
            if (lqa.m150979q() && marrySeriesType == MarrySeriesType.LIFE_MOMENT) {
                mediaReorderCardM50811h.m50652I1(false, false);
            } else {
                mediaReorderCardM50811h.m50652I1(!lqa.m150976n(), true);
            }
            mediaReorderCardM50811h.setDataFrom(this.f125587h.m133274f0().m47456c2() ? pj90.f149723k : pj90.f149722j);
            mediaReorderCardM50811h.m50640C1(media);
            mediaReorderCardM50811h.setMediaOperation(this);
            mediaReorderCardM50811h.setChangeAction(new g30() { // from class: l.j0x
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    l0x.m148126k((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            this.f125584e.m50811h(i2).m50653J0(i2, MediaReorderCard.CardType.LIFE_MOMENT);
            if (i2 == list.size()) {
                mediaReorderCardM50811h.m50666P1();
            }
            if (NullChecker.m81303a(media) && !TEnum.equals(media.status, "normal")) {
                mediaReorderCardM50811h.m50710x1(media);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: l.l0x$a */
    public class C18129a implements a2m {
        public C18129a() {
        }

        @Override // p149l.a2m
        /* JADX INFO: renamed from: b */
        public void mo47539b() {
            for (int i = 0; i < l0x.this.f125584e.getChildCount(); i++) {
                l0x.this.f125584e.m50811h(i).m50670R1(i);
            }
        }

        @Override // p149l.a2m
        /* JADX INFO: renamed from: c */
        public void mo47540c() {
            for (int i = 0; i < l0x.this.f125584e.getChildCount(); i++) {
                l0x.this.f125584e.m50811h(i).m50670R1(i);
            }
        }

        @Override // p149l.a2m
        /* JADX INFO: renamed from: d */
        public void mo47541d() {
        }
    }
}
