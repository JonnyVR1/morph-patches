package com.p046p1.mobile.putong.newui.mediaoperation.preview;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.newui.mediaoperation.cropper.NewAlbumCropperAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.C13067a;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.p046p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import com.p046p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.schedulers.Schedulers;
import p147v.VButton;
import p147v.VFrame;
import p147v.VPager;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.aee0;
import p149l.ag20;
import p149l.e30;
import p149l.emx;
import p149l.iti;
import p149l.jo0;
import p149l.lsi0;
import p149l.mgh0;
import p149l.mkd0;
import p149l.q860;
import p149l.qib0;
import p149l.rhi;
import p149l.utx;
import p149l.v0c0;
import p149l.vrx;
import p149l.vwb;
import p149l.w2c0;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class MediaPreviewAct extends PutongAct {

    /* JADX INFO: renamed from: A */
    public boolean f54053A;

    /* JADX INFO: renamed from: B */
    public boolean f54054B;

    /* JADX INFO: renamed from: C */
    public boolean f54055C;

    /* JADX INFO: renamed from: D */
    public Media f54056D;

    /* JADX INFO: renamed from: E */
    public boolean f54057E;

    /* JADX INFO: renamed from: c */
    public VPager f54058c;

    /* JADX INFO: renamed from: d */
    public VFrame f54059d;

    /* JADX INFO: renamed from: e */
    public ImageView f54060e;

    /* JADX INFO: renamed from: f */
    public VText f54061f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f54062g;

    /* JADX INFO: renamed from: h */
    public VRecyclerView f54063h;

    /* JADX INFO: renamed from: i */
    public VText f54064i;

    /* JADX INFO: renamed from: j */
    public TextView f54065j;

    /* JADX INFO: renamed from: k */
    public VButton f54066k;

    /* JADX INFO: renamed from: l */
    public vrx f54067l;

    /* JADX INFO: renamed from: m */
    public String f54068m;

    /* JADX INFO: renamed from: n */
    public MediaPickerParamsObject f54069n;

    /* JADX INFO: renamed from: o */
    public boolean f54070o;

    /* JADX INFO: renamed from: q */
    public Media f54072q;

    /* JADX INFO: renamed from: t */
    public ag20 f54075t;

    /* JADX INFO: renamed from: u */
    public aee0 f54076u;

    /* JADX INFO: renamed from: v */
    public String f54077v;

    /* JADX INFO: renamed from: w */
    public int f54078w;

    /* JADX INFO: renamed from: y */
    public boolean f54080y;

    /* JADX INFO: renamed from: z */
    public boolean f54081z;

    /* JADX INFO: renamed from: p */
    public MediaWrapper f54071p = new MediaWrapper();

    /* JADX INFO: renamed from: r */
    public int f54073r = 1;

    /* JADX INFO: renamed from: s */
    public int f54074s = -1;

    /* JADX INFO: renamed from: x */
    public List<Media> f54079x = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct$a */
    public class C13068a implements ViewPager.InterfaceC0716j {
        public C13068a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            Media media = MediaPreviewAct.this.f54079x.get(i);
            MediaPreviewAct.this.f54056D = media;
            if (NullChecker.m81303a(MediaPreviewAct.this.m79077z2())) {
                MediaPreviewAct.this.m79069e3(media);
            }
            MediaPreviewAct.this.f54076u.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct$b */
    public static final class C13069b {

        /* JADX INFO: renamed from: a */
        public int f54083a;

        /* JADX INFO: renamed from: b */
        public int f54084b;

        /* JADX INFO: renamed from: c */
        public ArrayList<Media> f54085c;

        /* JADX INFO: renamed from: d */
        public Context f54086d;

        /* JADX INFO: renamed from: e */
        public MediaPickerParamsObject f54087e;

        /* JADX INFO: renamed from: f */
        public boolean f54088f;

        /* JADX INFO: renamed from: g */
        public Media f54089g;

        /* JADX INFO: renamed from: h */
        public boolean f54090h;

        /* JADX INFO: renamed from: i */
        public boolean f54091i;

        /* JADX INFO: renamed from: j */
        public boolean f54092j;

        /* JADX INFO: renamed from: k */
        public String f54093k;

        /* JADX INFO: renamed from: l */
        public boolean f54094l;

        public C13069b(Context context) {
            this.f54086d = context;
        }

        /* JADX INFO: renamed from: a */
        public Intent m79078a() {
            Intent intent = new Intent(this.f54086d, (Class<?>) MediaPreviewAct.class);
            intent.putExtra("selectedMedias", this.f54085c);
            intent.putExtra("initialShowIndex", this.f54084b);
            intent.putExtra("maxCount", this.f54083a);
            intent.putExtra("MediaPickerParamsObject", this.f54087e);
            intent.putExtra("showAllPhotoInPhone", this.f54088f);
            intent.putExtra("selectedMedia", this.f54089g);
            intent.putExtra("filterPhoto", this.f54090h);
            intent.putExtra("disableScroll", this.f54091i);
            intent.putExtra("filterVideo", this.f54092j);
            intent.putExtra("selectFolder", this.f54093k);
            intent.putExtra("needPassThrough", this.f54094l);
            return intent;
        }

        /* JADX INFO: renamed from: b */
        public C13069b m79079b() {
            this.f54091i = true;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C13069b m79080c() {
            this.f54090h = true;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C13069b m79081d() {
            this.f54092j = true;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C13069b m79082e() {
            this.f54088f = true;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C13069b m79083f(int i) {
            this.f54083a = i;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C13069b m79084g(MediaPickerParamsObject mediaPickerParamsObject) {
            this.f54087e = mediaPickerParamsObject;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C13069b m79085h(String str) {
            this.f54093k = str;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C13069b m79086i(Media media) {
            this.f54089g = media;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C13069b m79087j(ArrayList<Media> arrayList) {
            this.f54085c = arrayList;
            return this;
        }
    }

    /* JADX INFO: renamed from: B2 */
    private void m79023B2() {
        xdl0.m208329E0(this.f54066k, new View.OnClickListener() { // from class: l.msx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135539a.m79025K2(view);
            }
        });
        this.f54060e.setOnClickListener(new View.OnClickListener() { // from class: l.vsx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182892a.m79026L2(view);
            }
        });
        this.f54061f.setOnClickListener(new View.OnClickListener() { // from class: l.xsx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194322a.m79027M2(view);
            }
        });
    }

    /* JADX INFO: renamed from: F2 */
    public static C13069b m79024F2(Context context) {
        return new C13069b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K2 */
    public /* synthetic */ void m79025K2(View view) {
        m79049v2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L2 */
    public /* synthetic */ void m79026L2(View view) {
        m79076y2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public /* synthetic */ void m79027M2(View view) {
        Media media = this.f54079x.get(this.f54058c.getCurrentItem());
        if (m79054H2()) {
            if (m79068d3(media, false, m79077z2(), this.f54073r)) {
                m79064Y2(false);
            }
        } else if (m79068d3(media, true, m79077z2(), this.f54073r)) {
            m79064Y2(true);
        }
        m79061V2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public /* synthetic */ void m79028N2(Bundle bundle) {
        if (NullChecker.m81303a(getSupportActionBar())) {
            getSupportActionBar().mo134126m();
        }
    }

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ Media m79030X1(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ q860 m79031Y1(List list) {
        return new q860(vwb.m200303Q(list, new w9j() { // from class: l.ssx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return iti.m138200b((nuh0) obj);
            }
        }), null);
    }

    /* JADX INFO: renamed from: Z2 */
    private void m79033Z2(List<Media> list) {
        boolean zM200296J = vwb.m200296J(this.f54071p.allMediasInPhoto.f153135a);
        MediaWrapper mediaWrapper = this.f54071p;
        if (zM200296J) {
            mediaWrapper.allMediasInPhoto = new q860<>(vwb.m200303Q(list, new w9j() { // from class: l.tsx
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return MediaPreviewAct.m79030X1((Media) obj);
                }
            }), null);
        } else {
            mediaWrapper.allMediasInPhoto.f153135a.clear();
            this.f54071p.allMediasInPhoto.f153135a.addAll(vwb.m200303Q(list, new w9j() { // from class: l.usx
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return MediaPreviewAct.m79042k2((Media) obj);
                }
            }));
        }
        m79074u2(this.f54071p.allMediasInPhoto.f153135a);
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ Media m79034a2(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: k2 */
    public static /* synthetic */ Media m79042k2(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: m2 */
    public static /* synthetic */ Media m79044m2(Media media) {
        return media;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    private void m79048r() {
        m79023B2();
        xdl0.m208344M(this.f54063h, m79077z2().size() != 0);
        this.f54062g.setVisibility(0);
        m79069e3(this.f54072q);
        this.f54075t.notifyDataSetChanged();
        int i = this.f54074s;
        if (i > 0) {
            this.f54058c.m4176T(i, false);
        } else if (this.f54072q != null) {
            for (int i2 = 0; i2 < this.f54079x.size(); i2++) {
                Media media = this.f54079x.get(i2);
                if (media.url.equals(this.f54072q.url)) {
                    this.f54058c.m4176T(i2, false);
                    this.f54056D = media;
                    break;
                }
            }
        }
        if (this.f54053A) {
            this.f54058c.setScrollble(false);
        }
        m79066b3();
        m79063X2();
        m79073s2();
        int i3 = this.f54078w;
        if (i3 == 10 || i3 == 11) {
            xdl0.m208344M(this.f54065j, true);
            this.f54065j.setText("图片将使用以图换图模式发送");
        } else if (i3 == 13) {
            xdl0.m208344M(this.f54065j, true);
            this.f54065j.setText("图片将使用限时快拍模式发送");
        }
    }

    /* JADX INFO: renamed from: v2 */
    private void m79049v2() {
        boolean z;
        if (NullChecker.m81303a(this.f54067l)) {
            this.f54067l.mo177022e(this.f54078w, pageId(), this.f54069n.reportMap);
        }
        if (this.f54071p.allSelectedMedias.isEmpty() && m79072r2()) {
            this.f54071p.addSelectedMedia(this.f54056D);
            z = true;
        } else {
            z = false;
        }
        vrx vrxVar = this.f54067l;
        if (!(vrxVar != null ? vrxVar.mo95873a(this.act, this.f54071p, this.f54069n) : false)) {
            m79076y2();
        }
        if (z) {
            this.f54071p.clearAllSelectedMedia();
        }
    }

    /* JADX INFO: renamed from: A2 */
    public void m79050A2() {
        Intent intent = getIntent();
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("selectedMedias");
        this.f54074s = intent.getIntExtra("initialShowIndex", 0);
        this.f54073r = intent.getIntExtra("maxCount", 0);
        this.f54069n = (MediaPickerParamsObject) intent.getSerializableExtra("MediaPickerParamsObject");
        this.f54072q = (Media) intent.getSerializableExtra("selectedMedia");
        this.f54070o = intent.getBooleanExtra("showAllPhotoInPhone", false);
        this.f54080y = intent.getBooleanExtra("filterPhoto", false);
        this.f54053A = intent.getBooleanExtra("disableScroll", false);
        this.f54081z = intent.getBooleanExtra("filterVideo", false);
        this.f54068m = intent.getStringExtra("selectFolder");
        this.f54057E = intent.getBooleanExtra("needPassThrough", false);
        MediaPickerParamsObject mediaPickerParamsObject = this.f54069n;
        this.f54078w = mediaPickerParamsObject.fromType;
        this.f54077v = mediaPickerParamsObject.submitButtonTitle;
        this.f54071p.allMediasInPhoto = new q860<>(this.f54079x, null);
        this.f54071p.clearAllSelectedMedia();
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (m79055I2()) {
            arrayList.clear();
        }
        this.f54071p.addAllSelectedMedia(arrayList);
    }

    /* JADX INFO: renamed from: C2 */
    public final void m79051C2() {
        this.f54076u = new aee0(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(0);
        this.f54063h.setLayoutManager(linearLayoutManager);
        this.f54063h.setAdapter(this.f54076u);
        this.f54058c.m4185d(new C13068a());
        ag20 ag20Var = new ag20(this);
        this.f54075t = ag20Var;
        this.f54058c.setAdapter(ag20Var);
        this.f54075t.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: D2 */
    public final void m79052D2(int i) {
        if (this.f54067l == null) {
            if (i == 1) {
                this.f54067l = qib0.f154714c0.mo97519j0();
                return;
            }
            if (i == 2) {
                this.f54067l = qib0.f154714c0.mo97504R0();
                return;
            }
            if (i != 4) {
                if (i == 7) {
                    this.f54067l = qib0.f154714c0.mo97515d();
                    return;
                } else if (i != 10 && i != 11 && i != 13 && i != 14) {
                    return;
                }
            }
            this.f54067l = qib0.f154714c0.mo97503P4();
        }
    }

    /* JADX INFO: renamed from: E2 */
    public void m79053E2() {
        m79050A2();
        m79052D2(this.f54078w);
    }

    /* JADX INFO: renamed from: H2 */
    public final boolean m79054H2() {
        return this.f54061f.getTag() != null && ((Boolean) this.f54061f.getTag()).booleanValue();
    }

    /* JADX INFO: renamed from: I2 */
    public final boolean m79055I2() {
        return ((this.f54072q instanceof Video) && this.f54069n.getMaxVideoSelectCount() == 1) || ((this.f54072q instanceof Picture) && this.f54069n.getMaxImageSelectCount() == 1);
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m79056Q2(List list) {
        if (this.f54054B) {
            return;
        }
        m79033Z2(list);
        this.f54054B = true;
    }

    /* JADX INFO: renamed from: R2 */
    public final /* synthetic */ void m79057R2(View view) {
        m47815F2();
    }

    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ void m79058S2(View view) {
        if (m79077z2().size() >= this.f54073r && !m79054H2()) {
            lsi0.m151580j(String.format(act().getString(R$string.f17377T), Integer.valueOf(this.f54073r)));
            return;
        }
        String strM179377u = rhi.m179377u(C13067a.m79017c(this.f54071p.croppedMap, this.f54079x.get(this.f54058c.getCurrentItem()).url));
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(strM179377u, options);
        MediaPickerParamsObject mediaPickerParamsObject = this.f54069n;
        boolean z = mediaPickerParamsObject != null ? mediaPickerParamsObject.croppingNewStyle : false;
        MediaWrapper mediaWrapper = this.f54071p;
        startActivityForResult(NewAlbumCropperAct.m78903m2(this, strM179377u, mediaWrapper.imageCropProportion, mediaWrapper.imageCropWidth, z), Act.CROP_IMAGE);
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ Boolean m79059T2(iti itiVar) {
        return Boolean.valueOf(itiVar.f114885b.equals(this.f54068m));
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m79060U2(q860 q860Var) {
        if (this.f54054B) {
            return;
        }
        iti itiVar = (iti) vwb.m200346r(q860Var.f153135a, new w9j() { // from class: l.osx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f145518a.m79059T2((iti) obj);
            }
        });
        if (itiVar == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f54072q);
            boolean zM200296J = vwb.m200296J(this.f54071p.allMediasInPhoto.f153135a);
            MediaWrapper mediaWrapper = this.f54071p;
            if (zM200296J) {
                mediaWrapper.allMediasInPhoto = new q860<>(arrayList, null);
            } else {
                mediaWrapper.allMediasInPhoto.f153135a.addAll(arrayList);
            }
        } else {
            boolean zM200296J2 = vwb.m200296J(this.f54071p.allMediasInPhoto.f153135a);
            MediaWrapper mediaWrapper2 = this.f54071p;
            if (zM200296J2) {
                mediaWrapper2.allMediasInPhoto = new q860<>(vwb.m200303Q(itiVar.f114886c.f153135a, new w9j() { // from class: l.qsx
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return MediaPreviewAct.m79044m2((Media) obj);
                    }
                }), null);
            } else {
                mediaWrapper2.allMediasInPhoto.f153135a.addAll(vwb.m200303Q(itiVar.f114886c.f153135a, new w9j() { // from class: l.rsx
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return MediaPreviewAct.m79034a2((Media) obj);
                    }
                }));
            }
        }
        m79074u2(this.f54071p.allMediasInPhoto.f153135a);
        this.f54054B = true;
    }

    /* JADX INFO: renamed from: V2 */
    public final void m79061V2() {
        m79065a3((m79077z2().size() > 0 && this.f54071p.allSelectedMedias.size() >= this.f54069n.getMinImageSelectCount()) || m79072r2());
        this.f54076u.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: W2 */
    public final void m79062W2() {
        m79033Z2(vwb.m200299M(this.f54072q));
        emx emxVar = new emx(act(), true, true);
        act().getSupportLoaderManager().mo3086c(0, null, emxVar);
        emxVar.m117240r().distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.zsx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204651a.m79056Q2((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X2 */
    public final void m79063X2() {
        if (this.f54072q instanceof Video) {
            this.f54064i.setText(R$string.f17405a);
            this.f54064i.setOnClickListener(new View.OnClickListener() { // from class: l.dtx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f87911a.m79057R2(view);
                }
            });
        } else if (NullChecker.m81303a(this.f54069n) && NullChecker.m81303a(this.f54069n.imagePickConfig) && !this.f54069n.imagePickConfig.showPreviewEditBtn()) {
            xdl0.m208344M(this.f54064i, false);
        } else {
            this.f54064i.setText(R$string.f17520x);
            xdl0.m208329E0(this.f54064i, new View.OnClickListener() { // from class: l.ftx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f99289a.m79058S2(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m79064Y2(boolean z) {
        VText vText = this.f54061f;
        if (z) {
            vText.setBackgroundResource(w2c0.f184131D0);
            this.f54061f.setTag(Boolean.TRUE);
        } else {
            vText.setBackgroundResource(w2c0.f184127B0);
            this.f54061f.setTag(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: a3 */
    public final void m79065a3(boolean z) {
        this.f54066k.setSelected(z);
        this.f54066k.setClickable(z);
        this.f54066k.setTextColor(z ? getResources().getColor(v0c0.f179102i) : getResources().getColor(v0c0.f179100g));
        m79066b3();
    }

    /* JADX INFO: renamed from: b3 */
    public final void m79066b3() {
        if (this.f54077v != null) {
            boolean zIsEmpty = this.f54071p.selectedImageMedias.isEmpty();
            VButton vButton = this.f54066k;
            if (zIsEmpty) {
                vButton.setText(this.f54077v);
            } else {
                vButton.setText(String.format("%s %d", this.f54077v, Integer.valueOf(this.f54071p.selectedImageMedias.size())));
            }
        }
    }

    /* JADX INFO: renamed from: c3 */
    public final void m79067c3() {
        emx emxVar = new emx(act(), true, true);
        act().getSupportLoaderManager().mo3086c(0, null, emxVar);
        emxVar.m117240r().distinctUntilChanged().observeOn(Schedulers.m221493io()).compose(emx.m117236n(MediaPickerBaseAct.f54606k)).map(new w9j() { // from class: l.jtx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return MediaPreviewAct.m79031Y1((List) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.ltx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130020a.m79060U2((q860) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean checkRunningCondition() {
        if (ensurePlugin()) {
            return false;
        }
        startActivity(mgh0.m154564t(getIntent()));
        return true;
    }

    /* JADX INFO: renamed from: d3 */
    public final boolean m79068d3(Media media, boolean z, List<Media> list, int i) {
        boolean z2;
        boolean z3 = false;
        if (z) {
            if (i == list.size()) {
                if (media instanceof Video) {
                    lsi0.m151578h(R$string.f17330H0);
                } else {
                    lsi0.m151580j(String.format(act().getString(R$string.f17377T), Integer.valueOf(i)));
                }
                z2 = false;
            } else if (!list.contains(media)) {
                this.f54071p.addSelectedMedia(media);
            }
            VRecyclerView vRecyclerView = this.f54063h;
            if (m79077z2().size() != 0 && !this.f54055C) {
                z3 = true;
            }
            xdl0.m208344M(vRecyclerView, z3);
            return z2;
        }
        this.f54071p.unCheckMedia(media);
        z2 = true;
        VRecyclerView vRecyclerView2 = this.f54063h;
        if (m79077z2().size() != 0) {
            z3 = true;
        }
        xdl0.m208344M(vRecyclerView2, z3);
        return z2;
    }

    /* JADX INFO: renamed from: e3 */
    public final void m79069e3(final Media media) {
        if (media != null) {
            if (vwb.m200293G(m79077z2(), new w9j() { // from class: l.btx
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(media.isSameOrigin((Media) obj));
                }
            }) >= 0) {
                m79064Y2(true);
            } else {
                m79064Y2(false);
            }
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean ensurePlugin() {
        return !qib0.f154714c0.signedIn_() ? qib0.f154721j0.m192072z(SchemeKey.account) : qib0.m174779J0();
    }

    /* JADX INFO: renamed from: f3 */
    public void m79070f3() {
        if (!TextUtils.isEmpty(this.f54068m)) {
            m79067c3();
        } else if (this.f54070o || m79077z2().isEmpty()) {
            m79062W2();
        } else {
            m79074u2(m79077z2());
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM79071q2 = m79071q2(layoutInflater, viewGroup);
        m79053E2();
        m79070f3();
        return viewM79071q2;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.htx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109453a.m79028N2((Bundle) obj);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m79076y2();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onCropImageResult(String str) {
        if (vwb.m200296J(this.f54079x)) {
            m47815F2();
            return;
        }
        Media media = this.f54079x.get(this.f54058c.getCurrentItem());
        if (!this.f54071p.containsInMedias(media, m79077z2())) {
            m79068d3(media, true, m79077z2(), this.f54073r);
        }
        m79064Y2(true);
        this.f54071p.croppedMap.put(media.url, new MediaWrapper.C13066a(rhi.m179355B(str), m79077z2().size() != 1));
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int[] iArr = {options.outWidth, options.outHeight};
        Picture picture = (Picture) media;
        picture.size = new Dimension(iArr);
        picture.url = C13067a.m79017c(this.f54071p.croppedMap, media.url);
        PhotoPreviewView photoPreviewView = (PhotoPreviewView) this.f54058c.findViewWithTag(media);
        if (NullChecker.m81303a(photoPreviewView)) {
            photoPreviewView.setPicture(picture);
        }
        m79061V2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        Media media = (Media) getIntent().getSerializableExtra("selectedMedia");
        MediaPickerParamsObject mediaPickerParamsObject = (MediaPickerParamsObject) getIntent().getSerializableExtra("MediaPickerParamsObject");
        if (TextUtils.isEmpty(mediaPickerParamsObject.mediaPreviewPageId)) {
            return media instanceof Video ? "p_video_moment_preview_view" : "p_picture_moment_preview_view";
        }
        return mediaPickerParamsObject.mediaPreviewPageId;
    }

    /* JADX INFO: renamed from: q2 */
    public View m79071q2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return utx.m195319b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r2 */
    public final boolean m79072r2() {
        return this.f54069n.canClickSubmitInPreviewWhenNoSelectedMedia(this.f54072q) || m79055I2();
    }

    /* JADX INFO: renamed from: s2 */
    public final void m79073s2() {
        if (m79055I2()) {
            this.f54063h.setVisibility(8);
            this.f54055C = true;
            this.f54061f.setVisibility(8);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToGradientColoredStatusBar() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldWrapContentViewWithTransparentHeader() {
        return false;
    }

    /* JADX INFO: renamed from: u2 */
    public final void m79074u2(List<Media> list) {
        this.f54079x = new ArrayList(list);
        if (this.f54075t == null) {
            m79051C2();
        }
        m79075w2();
        m79048r();
        m79061V2();
    }

    /* JADX INFO: renamed from: w2 */
    public final void m79075w2() {
        for (Media media : new ArrayList(this.f54079x)) {
            if ((media instanceof Video) && this.f54081z) {
                this.f54079x.remove(media);
            } else if ((media instanceof Picture) && this.f54080y) {
                this.f54079x.remove(media);
            }
        }
    }

    /* JADX INFO: renamed from: y2 */
    public void m79076y2() {
        Intent intent = new Intent();
        intent.putExtra("extra_images", m79077z2());
        setResult(this.f54057E ? 555 : -1, intent);
        m47815F2();
    }

    /* JADX INFO: renamed from: z2 */
    public ArrayList<Media> m79077z2() {
        return this.f54071p.allSelectedMedias;
    }
}
