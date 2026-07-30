package com.p051p1.mobile.putong.newui.mediaoperation.preview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.newui.mediaoperation.cropper.NewAlbumCropperAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.C13230a;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.p051p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import com.p051p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.schedulers.Schedulers;
import p151v.VButton;
import p151v.VFrame;
import p151v.VPager;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.b9c0;
import p153l.bnl0;
import p153l.bvx;
import p153l.cbc0;
import p153l.ewi;
import p153l.fme0;
import p153l.fo0;
import p153l.jyb;
import p153l.ko20;
import p153l.o1j0;
import p153l.oki;
import p153l.psd0;
import p153l.qcj;
import p153l.r2y;
import p153l.s0y;
import p153l.toh0;
import p153l.uqb0;
import p153l.vg60;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
public class MediaPreviewAct extends PutongAct {

    /* JADX INFO: renamed from: A */
    public boolean f54901A;

    /* JADX INFO: renamed from: B */
    public boolean f54902B;

    /* JADX INFO: renamed from: C */
    public boolean f54903C;

    /* JADX INFO: renamed from: D */
    public Media f54904D;

    /* JADX INFO: renamed from: E */
    public boolean f54905E;

    /* JADX INFO: renamed from: c */
    public VPager f54906c;

    /* JADX INFO: renamed from: d */
    public VFrame f54907d;

    /* JADX INFO: renamed from: e */
    public ImageView f54908e;

    /* JADX INFO: renamed from: f */
    public VText f54909f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f54910g;

    /* JADX INFO: renamed from: h */
    public VRecyclerView f54911h;

    /* JADX INFO: renamed from: i */
    public VText f54912i;

    /* JADX INFO: renamed from: j */
    public TextView f54913j;

    /* JADX INFO: renamed from: k */
    public VButton f54914k;

    /* JADX INFO: renamed from: l */
    public s0y f54915l;

    /* JADX INFO: renamed from: m */
    public String f54916m;

    /* JADX INFO: renamed from: n */
    public MediaPickerParamsObject f54917n;

    /* JADX INFO: renamed from: o */
    public boolean f54918o;

    /* JADX INFO: renamed from: q */
    public Media f54920q;

    /* JADX INFO: renamed from: t */
    public ko20 f54923t;

    /* JADX INFO: renamed from: u */
    public fme0 f54924u;

    /* JADX INFO: renamed from: v */
    public String f54925v;

    /* JADX INFO: renamed from: w */
    public int f54926w;

    /* JADX INFO: renamed from: y */
    public boolean f54928y;

    /* JADX INFO: renamed from: z */
    public boolean f54929z;

    /* JADX INFO: renamed from: p */
    public MediaWrapper f54919p = new MediaWrapper();

    /* JADX INFO: renamed from: r */
    public int f54921r = 1;

    /* JADX INFO: renamed from: s */
    public int f54922s = -1;

    /* JADX INFO: renamed from: x */
    public List<Media> f54927x = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct$a */
    public class C13231a implements ViewPager.InterfaceC0718j {
        public C13231a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            Media media = MediaPreviewAct.this.f54927x.get(i);
            MediaPreviewAct.this.f54904D = media;
            if (NullChecker.m82486a(MediaPreviewAct.this.m80233A2())) {
                MediaPreviewAct.this.m80253g3(media);
            }
            MediaPreviewAct.this.f54924u.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct$b */
    public static final class C13232b {

        /* JADX INFO: renamed from: a */
        public int f54931a;

        /* JADX INFO: renamed from: b */
        public int f54932b;

        /* JADX INFO: renamed from: c */
        public ArrayList<Media> f54933c;

        /* JADX INFO: renamed from: d */
        public Context f54934d;

        /* JADX INFO: renamed from: e */
        public MediaPickerParamsObject f54935e;

        /* JADX INFO: renamed from: f */
        public boolean f54936f;

        /* JADX INFO: renamed from: g */
        public Media f54937g;

        /* JADX INFO: renamed from: h */
        public boolean f54938h;

        /* JADX INFO: renamed from: i */
        public boolean f54939i;

        /* JADX INFO: renamed from: j */
        public boolean f54940j;

        /* JADX INFO: renamed from: k */
        public String f54941k;

        /* JADX INFO: renamed from: l */
        public boolean f54942l;

        public C13232b(Context context) {
            this.f54934d = context;
        }

        /* JADX INFO: renamed from: a */
        public Intent m80261a() {
            Intent intent = new Intent(this.f54934d, (Class<?>) MediaPreviewAct.class);
            intent.putExtra("selectedMedias", this.f54933c);
            intent.putExtra("initialShowIndex", this.f54932b);
            intent.putExtra("maxCount", this.f54931a);
            intent.putExtra("MediaPickerParamsObject", this.f54935e);
            intent.putExtra("showAllPhotoInPhone", this.f54936f);
            intent.putExtra("selectedMedia", this.f54937g);
            intent.putExtra("filterPhoto", this.f54938h);
            intent.putExtra("disableScroll", this.f54939i);
            intent.putExtra("filterVideo", this.f54940j);
            intent.putExtra("selectFolder", this.f54941k);
            intent.putExtra("needPassThrough", this.f54942l);
            return intent;
        }

        /* JADX INFO: renamed from: b */
        public C13232b m80262b() {
            this.f54939i = true;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C13232b m80263c() {
            this.f54938h = true;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C13232b m80264d() {
            this.f54940j = true;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C13232b m80265e() {
            this.f54936f = true;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C13232b m80266f(int i) {
            this.f54931a = i;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C13232b m80267g(MediaPickerParamsObject mediaPickerParamsObject) {
            this.f54935e = mediaPickerParamsObject;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C13232b m80268h(String str) {
            this.f54941k = str;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C13232b m80269i(Media media) {
            this.f54937g = media;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C13232b m80270j(ArrayList<Media> arrayList) {
            this.f54933c = arrayList;
            return this;
        }
    }

    /* JADX INFO: renamed from: C2 */
    private void m80206C2() {
        bnl0.m105509E0(this.f54914k, new View.OnClickListener() { // from class: l.j1y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118000a.m80208L2(view);
            }
        });
        this.f54908e.setOnClickListener(new View.OnClickListener() { // from class: l.s1y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165815a.m80209M2(view);
            }
        });
        this.f54909f.setOnClickListener(new View.OnClickListener() { // from class: l.u1y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177141a.m80210N2(view);
            }
        });
    }

    /* JADX INFO: renamed from: H2 */
    public static C13232b m80207H2(Context context) {
        return new C13232b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L2 */
    public /* synthetic */ void m80208L2(View view) {
        m80232w2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public /* synthetic */ void m80209M2(View view) {
        m80260z2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public /* synthetic */ void m80210N2(View view) {
        Media media = this.f54927x.get(this.f54906c.getCurrentItem());
        if (m80238I2()) {
            if (m80252f3(media, false, m80233A2(), this.f54921r)) {
                m80248a3(false);
            }
        } else if (m80252f3(media, true, m80233A2(), this.f54921r)) {
            m80248a3(true);
        }
        m80245W2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q2 */
    public /* synthetic */ void m80211Q2(Bundle bundle) {
        if (NullChecker.m82486a(getSupportActionBar())) {
            getSupportActionBar().mo102186m();
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ Media m80213Y1(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ vg60 m80214Z1(List list) {
        return new vg60(jyb.m147486Q(list, new qcj() { // from class: l.p1y
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ewi.m122953b((v2i0) obj);
            }
        }), null);
    }

    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ Media m80216b2(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: b3 */
    private void m80217b3(List<Media> list) {
        boolean zM147479J = jyb.m147479J(this.f54919p.allMediasInPhoto.f184001a);
        MediaWrapper mediaWrapper = this.f54919p;
        if (zM147479J) {
            mediaWrapper.allMediasInPhoto = new vg60<>(jyb.m147486Q(list, new qcj() { // from class: l.q1y
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return MediaPreviewAct.m80213Y1((Media) obj);
                }
            }), null);
        } else {
            mediaWrapper.allMediasInPhoto.f184001a.clear();
            this.f54919p.allMediasInPhoto.f184001a.addAll(jyb.m147486Q(list, new qcj() { // from class: l.r1y
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return MediaPreviewAct.m80225l2((Media) obj);
                }
            }));
        }
        m80258v2(this.f54919p.allMediasInPhoto.f184001a);
    }

    /* JADX INFO: renamed from: l2 */
    public static /* synthetic */ Media m80225l2(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: n2 */
    public static /* synthetic */ Media m80227n2(Media media) {
        return media;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    private void m80231r() {
        m80206C2();
        bnl0.m105524M(this.f54911h, m80233A2().size() != 0);
        this.f54910g.setVisibility(0);
        m80253g3(this.f54920q);
        this.f54923t.notifyDataSetChanged();
        int i = this.f54922s;
        if (i > 0) {
            this.f54906c.m4178T(i, false);
        } else if (this.f54920q != null) {
            for (int i2 = 0; i2 < this.f54927x.size(); i2++) {
                Media media = this.f54927x.get(i2);
                if (media.url.equals(this.f54920q.url)) {
                    this.f54906c.m4178T(i2, false);
                    this.f54904D = media;
                    break;
                }
            }
        }
        if (this.f54901A) {
            this.f54906c.setScrollble(false);
        }
        m80250d3();
        m80247Z2();
        m80257u2();
        int i3 = this.f54926w;
        if (i3 == 10 || i3 == 11) {
            bnl0.m105524M(this.f54913j, true);
            this.f54913j.setText("图片将使用以图换图模式发送");
        } else if (i3 == 13) {
            bnl0.m105524M(this.f54913j, true);
            this.f54913j.setText("图片将使用限时快拍模式发送");
        }
    }

    /* JADX INFO: renamed from: w2 */
    private void m80232w2() {
        boolean z;
        if (NullChecker.m82486a(this.f54915l)) {
            this.f54915l.mo174342e(this.f54926w, pageId(), this.f54917n.reportMap);
        }
        if (this.f54919p.allSelectedMedias.isEmpty() && m80256s2()) {
            this.f54919p.addSelectedMedia(this.f54904D);
            z = true;
        } else {
            z = false;
        }
        s0y s0yVar = this.f54915l;
        if (!(s0yVar != null ? s0yVar.mo99892a(this.act, this.f54919p, this.f54917n) : false)) {
            m80260z2();
        }
        if (z) {
            this.f54919p.clearAllSelectedMedia();
        }
    }

    /* JADX INFO: renamed from: A2 */
    public ArrayList<Media> m80233A2() {
        return this.f54919p.allSelectedMedias;
    }

    /* JADX INFO: renamed from: B2 */
    public void m80234B2() {
        Intent intent = getIntent();
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("selectedMedias");
        this.f54922s = intent.getIntExtra("initialShowIndex", 0);
        this.f54921r = intent.getIntExtra("maxCount", 0);
        this.f54917n = (MediaPickerParamsObject) intent.getSerializableExtra("MediaPickerParamsObject");
        this.f54920q = (Media) intent.getSerializableExtra("selectedMedia");
        this.f54918o = intent.getBooleanExtra("showAllPhotoInPhone", false);
        this.f54928y = intent.getBooleanExtra("filterPhoto", false);
        this.f54901A = intent.getBooleanExtra("disableScroll", false);
        this.f54929z = intent.getBooleanExtra("filterVideo", false);
        this.f54916m = intent.getStringExtra("selectFolder");
        this.f54905E = intent.getBooleanExtra("needPassThrough", false);
        MediaPickerParamsObject mediaPickerParamsObject = this.f54917n;
        this.f54926w = mediaPickerParamsObject.fromType;
        this.f54925v = mediaPickerParamsObject.submitButtonTitle;
        this.f54919p.allMediasInPhoto = new vg60<>(this.f54927x, null);
        this.f54919p.clearAllSelectedMedia();
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (m80239K2()) {
            arrayList.clear();
        }
        this.f54919p.addAllSelectedMedia(arrayList);
    }

    /* JADX INFO: renamed from: D2 */
    public final void m80235D2() {
        this.f54924u = new fme0(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(0);
        this.f54911h.setLayoutManager(linearLayoutManager);
        this.f54911h.setAdapter(this.f54924u);
        this.f54906c.m4187d(new C13231a());
        ko20 ko20Var = new ko20(this);
        this.f54923t = ko20Var;
        this.f54906c.setAdapter(ko20Var);
        this.f54923t.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: E2 */
    public final void m80236E2(int i) {
        if (this.f54915l == null) {
            if (i == 1) {
                this.f54915l = uqb0.f180397c0.mo105308j0();
                return;
            }
            if (i == 2) {
                this.f54915l = uqb0.f180397c0.mo105293R0();
                return;
            }
            if (i != 4) {
                if (i == 7) {
                    this.f54915l = uqb0.f180397c0.mo105304d();
                    return;
                } else if (i != 10 && i != 11 && i != 13 && i != 14) {
                    return;
                }
            }
            this.f54915l = uqb0.f180397c0.mo105292P4();
        }
    }

    /* JADX INFO: renamed from: F2 */
    public void m80237F2() {
        m80234B2();
        m80236E2(this.f54926w);
    }

    /* JADX INFO: renamed from: I2 */
    public final boolean m80238I2() {
        return this.f54909f.getTag() != null && ((Boolean) this.f54909f.getTag()).booleanValue();
    }

    /* JADX INFO: renamed from: K2 */
    public final boolean m80239K2() {
        return ((this.f54920q instanceof Video) && this.f54917n.getMaxVideoSelectCount() == 1) || ((this.f54920q instanceof Picture) && this.f54917n.getMaxImageSelectCount() == 1);
    }

    /* JADX INFO: renamed from: R2 */
    public final /* synthetic */ void m80240R2(List list) {
        if (this.f54902B) {
            return;
        }
        m80217b3(list);
        this.f54902B = true;
    }

    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ void m80241S2(View view) {
        m48999H2();
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ void m80242T2(View view) {
        if (m80233A2().size() >= this.f54921r && !m80238I2()) {
            o1j0.m165636j(String.format(act().getString(R$string.f18096T), Integer.valueOf(this.f54921r)));
            return;
        }
        String strM168033u = oki.m168033u(C13230a.m80200c(this.f54919p.croppedMap, this.f54927x.get(this.f54906c.getCurrentItem()).url));
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(strM168033u, options);
        MediaPickerParamsObject mediaPickerParamsObject = this.f54917n;
        boolean z = mediaPickerParamsObject != null ? mediaPickerParamsObject.croppingNewStyle : false;
        MediaWrapper mediaWrapper = this.f54919p;
        startActivityForResult(NewAlbumCropperAct.m80086n2(this, strM168033u, mediaWrapper.imageCropProportion, mediaWrapper.imageCropWidth, z), Act.CROP_IMAGE);
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ Boolean m80243U2(ewi ewiVar) {
        return Boolean.valueOf(ewiVar.f96162b.equals(this.f54916m));
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m80244V2(vg60 vg60Var) {
        if (this.f54902B) {
            return;
        }
        ewi ewiVar = (ewi) jyb.m147529r(vg60Var.f184001a, new qcj() { // from class: l.l1y
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f129729a.m80243U2((ewi) obj);
            }
        });
        if (ewiVar == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f54920q);
            boolean zM147479J = jyb.m147479J(this.f54919p.allMediasInPhoto.f184001a);
            MediaWrapper mediaWrapper = this.f54919p;
            if (zM147479J) {
                mediaWrapper.allMediasInPhoto = new vg60<>(arrayList, null);
            } else {
                mediaWrapper.allMediasInPhoto.f184001a.addAll(arrayList);
            }
        } else {
            boolean zM147479J2 = jyb.m147479J(this.f54919p.allMediasInPhoto.f184001a);
            MediaWrapper mediaWrapper2 = this.f54919p;
            if (zM147479J2) {
                mediaWrapper2.allMediasInPhoto = new vg60<>(jyb.m147486Q(ewiVar.f96163c.f184001a, new qcj() { // from class: l.n1y
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return MediaPreviewAct.m80227n2((Media) obj);
                    }
                }), null);
            } else {
                mediaWrapper2.allMediasInPhoto.f184001a.addAll(jyb.m147486Q(ewiVar.f96163c.f184001a, new qcj() { // from class: l.o1y
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return MediaPreviewAct.m80216b2((Media) obj);
                    }
                }));
            }
        }
        m80258v2(this.f54919p.allMediasInPhoto.f184001a);
        this.f54902B = true;
    }

    /* JADX INFO: renamed from: W2 */
    public final void m80245W2() {
        m80249c3((m80233A2().size() > 0 && this.f54919p.allSelectedMedias.size() >= this.f54917n.getMinImageSelectCount()) || m80256s2());
        this.f54924u.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: X2 */
    public final void m80246X2() {
        m80217b3(jyb.m147482M(this.f54920q));
        bvx bvxVar = new bvx(act(), true, true);
        act().getSupportLoaderManager().mo3087c(0, null, bvxVar);
        bvxVar.m106626r().distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.w1y
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186851a.m80240R2((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m80247Z2() {
        if (this.f54920q instanceof Video) {
            this.f54912i.setText(R$string.f18124a);
            this.f54912i.setOnClickListener(new View.OnClickListener() { // from class: l.a2y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f68229a.m80241S2(view);
                }
            });
        } else if (NullChecker.m82486a(this.f54917n) && NullChecker.m82486a(this.f54917n.imagePickConfig) && !this.f54917n.imagePickConfig.showPreviewEditBtn()) {
            bnl0.m105524M(this.f54912i, false);
        } else {
            this.f54912i.setText(R$string.f18239x);
            bnl0.m105509E0(this.f54912i, new View.OnClickListener() { // from class: l.c2y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f79529a.m80242T2(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a3 */
    public final void m80248a3(boolean z) {
        VText vText = this.f54909f;
        if (z) {
            vText.setBackgroundResource(cbc0.f80727D0);
            this.f54909f.setTag(Boolean.TRUE);
        } else {
            vText.setBackgroundResource(cbc0.f80723B0);
            this.f54909f.setTag(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: c3 */
    public final void m80249c3(boolean z) {
        this.f54914k.setSelected(z);
        this.f54914k.setClickable(z);
        this.f54914k.setTextColor(z ? getResources().getColor(b9c0.f75563i) : getResources().getColor(b9c0.f75561g));
        m80250d3();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean checkRunningCondition() {
        if (ensurePlugin()) {
            return false;
        }
        startActivity(toh0.m192060t(getIntent()));
        return true;
    }

    /* JADX INFO: renamed from: d3 */
    public final void m80250d3() {
        if (this.f54925v != null) {
            boolean zIsEmpty = this.f54919p.selectedImageMedias.isEmpty();
            VButton vButton = this.f54914k;
            if (zIsEmpty) {
                vButton.setText(this.f54925v);
            } else {
                vButton.setText(String.format("%s %d", this.f54925v, Integer.valueOf(this.f54919p.selectedImageMedias.size())));
            }
        }
    }

    /* JADX INFO: renamed from: e3 */
    public final void m80251e3() {
        bvx bvxVar = new bvx(act(), true, true);
        act().getSupportLoaderManager().mo3087c(0, null, bvxVar);
        bvxVar.m106626r().distinctUntilChanged().observeOn(Schedulers.m222739io()).compose(bvx.m106622n(MediaPickerBaseAct.f55454k)).map(new qcj() { // from class: l.g2y
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return MediaPreviewAct.m80214Z1((List) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.i2y
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112677a.m80244V2((vg60) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean ensurePlugin() {
        return !uqb0.f180397c0.signedIn_() ? uqb0.f180404j0.m115602z(SchemeKey.account) : uqb0.m197233J0();
    }

    /* JADX INFO: renamed from: f3 */
    public final boolean m80252f3(Media media, boolean z, List<Media> list, int i) {
        boolean z2;
        boolean z3 = false;
        if (z) {
            if (i == list.size()) {
                if (media instanceof Video) {
                    o1j0.m165634h(R$string.f18049H0);
                } else {
                    o1j0.m165636j(String.format(act().getString(R$string.f18096T), Integer.valueOf(i)));
                }
                z2 = false;
            } else if (!list.contains(media)) {
                this.f54919p.addSelectedMedia(media);
            }
            VRecyclerView vRecyclerView = this.f54911h;
            if (m80233A2().size() != 0 && !this.f54903C) {
                z3 = true;
            }
            bnl0.m105524M(vRecyclerView, z3);
            return z2;
        }
        this.f54919p.unCheckMedia(media);
        z2 = true;
        VRecyclerView vRecyclerView2 = this.f54911h;
        if (m80233A2().size() != 0) {
            z3 = true;
        }
        bnl0.m105524M(vRecyclerView2, z3);
        return z2;
    }

    /* JADX INFO: renamed from: g3 */
    public final void m80253g3(final Media media) {
        if (media != null) {
            if (jyb.m147476G(m80233A2(), new qcj() { // from class: l.y1y
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(media.isSameOrigin((Media) obj));
                }
            }) >= 0) {
                m80248a3(true);
            } else {
                m80248a3(false);
            }
        }
    }

    /* JADX INFO: renamed from: h3 */
    public void m80254h3() {
        if (!TextUtils.isEmpty(this.f54916m)) {
            m80251e3();
        } else if (this.f54918o || m80233A2().isEmpty()) {
            m80246X2();
        } else {
            m80258v2(m80233A2());
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM80255r2 = m80255r2(layoutInflater, viewGroup);
        m80237F2();
        m80254h3();
        return viewM80255r2;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.e2y
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91876a.m80211Q2((Bundle) obj);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m80260z2();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onCropImageResult(String str) {
        if (jyb.m147479J(this.f54927x)) {
            m48999H2();
            return;
        }
        Media media = this.f54927x.get(this.f54906c.getCurrentItem());
        if (!this.f54919p.containsInMedias(media, m80233A2())) {
            m80252f3(media, true, m80233A2(), this.f54921r);
        }
        m80248a3(true);
        this.f54919p.croppedMap.put(media.url, new MediaWrapper.C13229a(oki.m168011B(str), m80233A2().size() != 1));
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int[] iArr = {options.outWidth, options.outHeight};
        Picture picture = (Picture) media;
        picture.size = new Dimension(iArr);
        picture.url = C13230a.m80200c(this.f54919p.croppedMap, media.url);
        PhotoPreviewView photoPreviewView = (PhotoPreviewView) this.f54906c.findViewWithTag(media);
        if (NullChecker.m82486a(photoPreviewView)) {
            photoPreviewView.setPicture(picture);
        }
        m80245W2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        Media media = (Media) getIntent().getSerializableExtra("selectedMedia");
        MediaPickerParamsObject mediaPickerParamsObject = (MediaPickerParamsObject) getIntent().getSerializableExtra("MediaPickerParamsObject");
        if (TextUtils.isEmpty(mediaPickerParamsObject.mediaPreviewPageId)) {
            return media instanceof Video ? "p_video_moment_preview_view" : "p_picture_moment_preview_view";
        }
        return mediaPickerParamsObject.mediaPreviewPageId;
    }

    /* JADX INFO: renamed from: r2 */
    public View m80255r2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return r2y.m179572b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: s2 */
    public final boolean m80256s2() {
        return this.f54917n.canClickSubmitInPreviewWhenNoSelectedMedia(this.f54920q) || m80239K2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToGradientColoredStatusBar() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldWrapContentViewWithTransparentHeader() {
        return false;
    }

    /* JADX INFO: renamed from: u2 */
    public final void m80257u2() {
        if (m80239K2()) {
            this.f54911h.setVisibility(8);
            this.f54903C = true;
            this.f54909f.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: v2 */
    public final void m80258v2(List<Media> list) {
        this.f54927x = new ArrayList(list);
        if (this.f54923t == null) {
            m80235D2();
        }
        m80259y2();
        m80231r();
        m80245W2();
    }

    /* JADX INFO: renamed from: y2 */
    public final void m80259y2() {
        for (Media media : new ArrayList(this.f54927x)) {
            if ((media instanceof Video) && this.f54929z) {
                this.f54927x.remove(media);
            } else if ((media instanceof Picture) && this.f54928y) {
                this.f54927x.remove(media);
            }
        }
    }

    /* JADX INFO: renamed from: z2 */
    public void m80260z2() {
        Intent intent = new Intent();
        intent.putExtra("extra_images", m80233A2());
        setResult(this.f54905E ? 555 : -1, intent);
        m48999H2();
    }
}
