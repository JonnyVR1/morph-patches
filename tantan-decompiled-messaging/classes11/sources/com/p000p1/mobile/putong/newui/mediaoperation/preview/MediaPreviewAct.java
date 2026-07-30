package com.p000p1.mobile.putong.newui.mediaoperation.preview;

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
import com.p000p1.mobile.putong.newui.mediaoperation.cropper.NewAlbumCropperAct;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.util.C0469a;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.p000p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import com.p000p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView;
import com.p000p1.mobile.putong.p004ui.mediapicker.MediaPickerBaseAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.common.R;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.nuh0;
import l.qib0;
import l.rhi;
import l.utx;
import l.v0c0;
import l.vwb;
import l.w2c0;
import l.w9j;
import l.xdl0;
import p009l.aee0;
import p009l.ag20;
import p009l.emx;
import p009l.iti;
import p009l.mgh0;
import p009l.q860;
import p009l.vrx;
import rx.schedulers.Schedulers;
import v.VButton;
import v.VFrame;
import v.VPager;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MediaPreviewAct extends PutongAct {

    /* JADX INFO: renamed from: A */
    public boolean f7659A;

    /* JADX INFO: renamed from: B */
    public boolean f7660B;

    /* JADX INFO: renamed from: C */
    public boolean f7661C;

    /* JADX INFO: renamed from: D */
    public Media f7662D;

    /* JADX INFO: renamed from: E */
    public boolean f7663E;

    /* JADX INFO: renamed from: c */
    public VPager f7664c;

    /* JADX INFO: renamed from: d */
    public VFrame f7665d;

    /* JADX INFO: renamed from: e */
    public ImageView f7666e;

    /* JADX INFO: renamed from: f */
    public VText f7667f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f7668g;

    /* JADX INFO: renamed from: h */
    public VRecyclerView f7669h;

    /* JADX INFO: renamed from: i */
    public VText f7670i;

    /* JADX INFO: renamed from: j */
    public TextView f7671j;

    /* JADX INFO: renamed from: k */
    public VButton f7672k;

    /* JADX INFO: renamed from: l */
    public vrx f7673l;

    /* JADX INFO: renamed from: m */
    public String f7674m;

    /* JADX INFO: renamed from: n */
    public MediaPickerParamsObject f7675n;

    /* JADX INFO: renamed from: o */
    public boolean f7676o;

    /* JADX INFO: renamed from: q */
    public Media f7678q;

    /* JADX INFO: renamed from: t */
    public ag20 f7681t;

    /* JADX INFO: renamed from: u */
    public aee0 f7682u;

    /* JADX INFO: renamed from: v */
    public String f7683v;

    /* JADX INFO: renamed from: w */
    public int f7684w;

    /* JADX INFO: renamed from: y */
    public boolean f7686y;

    /* JADX INFO: renamed from: z */
    public boolean f7687z;

    /* JADX INFO: renamed from: p */
    public MediaWrapper f7677p = new MediaWrapper();

    /* JADX INFO: renamed from: r */
    public int f7679r = 1;

    /* JADX INFO: renamed from: s */
    public int f7680s = -1;

    /* JADX INFO: renamed from: x */
    public List<Media> f7685x = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct$a */
    public class C0470a implements ViewPager.j {
        public C0470a() {
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            Media media = MediaPreviewAct.this.f7685x.get(i);
            MediaPreviewAct.this.f7662D = media;
            if (NullChecker.a(MediaPreviewAct.this.m9385z2())) {
                MediaPreviewAct.this.m9377e3(media);
            }
            MediaPreviewAct.this.f7682u.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct$b */
    public static final class C0471b {

        /* JADX INFO: renamed from: a */
        public int f7689a;

        /* JADX INFO: renamed from: b */
        public int f7690b;

        /* JADX INFO: renamed from: c */
        public ArrayList<Media> f7691c;

        /* JADX INFO: renamed from: d */
        public Context f7692d;

        /* JADX INFO: renamed from: e */
        public MediaPickerParamsObject f7693e;

        /* JADX INFO: renamed from: f */
        public boolean f7694f;

        /* JADX INFO: renamed from: g */
        public Media f7695g;

        /* JADX INFO: renamed from: h */
        public boolean f7696h;

        /* JADX INFO: renamed from: i */
        public boolean f7697i;

        /* JADX INFO: renamed from: j */
        public boolean f7698j;

        /* JADX INFO: renamed from: k */
        public String f7699k;

        /* JADX INFO: renamed from: l */
        public boolean f7700l;

        public C0471b(Context context) {
            this.f7692d = context;
        }

        /* JADX INFO: renamed from: a */
        public Intent m9386a() {
            Intent intent = new Intent(this.f7692d, (Class<?>) MediaPreviewAct.class);
            intent.putExtra("selectedMedias", this.f7691c);
            intent.putExtra("initialShowIndex", this.f7690b);
            intent.putExtra("maxCount", this.f7689a);
            intent.putExtra("MediaPickerParamsObject", this.f7693e);
            intent.putExtra("showAllPhotoInPhone", this.f7694f);
            intent.putExtra("selectedMedia", (Serializable) this.f7695g);
            intent.putExtra("filterPhoto", this.f7696h);
            intent.putExtra("disableScroll", this.f7697i);
            intent.putExtra("filterVideo", this.f7698j);
            intent.putExtra("selectFolder", this.f7699k);
            intent.putExtra("needPassThrough", this.f7700l);
            return intent;
        }

        /* JADX INFO: renamed from: b */
        public C0471b m9387b() {
            this.f7697i = true;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C0471b m9388c() {
            this.f7696h = true;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C0471b m9389d() {
            this.f7698j = true;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C0471b m9390e() {
            this.f7694f = true;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C0471b m9391f(int i) {
            this.f7689a = i;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C0471b m9392g(MediaPickerParamsObject mediaPickerParamsObject) {
            this.f7693e = mediaPickerParamsObject;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C0471b m9393h(String str) {
            this.f7699k = str;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C0471b m9394i(Media media) {
            this.f7695g = media;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C0471b m9395j(ArrayList<Media> arrayList) {
            this.f7691c = arrayList;
            return this;
        }
    }

    /* JADX INFO: renamed from: B2 */
    private void m9331B2() {
        xdl0.E0(this.f7672k, new View.OnClickListener() { // from class: l.msx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17076a.m9333K2(view);
            }
        });
        this.f7666e.setOnClickListener(new View.OnClickListener() { // from class: l.vsx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21771a.m9334L2(view);
            }
        });
        this.f7667f.setOnClickListener(new View.OnClickListener() { // from class: l.xsx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22713a.m9335M2(view);
            }
        });
    }

    /* JADX INFO: renamed from: F2 */
    public static C0471b m9332F2(Context context) {
        return new C0471b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K2 */
    public /* synthetic */ void m9333K2(View view) {
        m9357v2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L2 */
    public /* synthetic */ void m9334L2(View view) {
        m9384y2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public /* synthetic */ void m9335M2(View view) {
        Media media = this.f7685x.get(this.f7664c.getCurrentItem());
        if (m9362H2()) {
            if (m9376d3(media, false, m9385z2(), this.f7679r)) {
                m9372Y2(false);
            }
        } else if (m9376d3(media, true, m9385z2(), this.f7679r)) {
            m9372Y2(true);
        }
        m9369V2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public /* synthetic */ void m9336N2(Bundle bundle) {
        if (NullChecker.a(getSupportActionBar())) {
            getSupportActionBar().m();
        }
    }

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ Media m9338X1(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ q860 m9339Y1(List list) {
        return new q860(vwb.Q(list, new w9j() { // from class: l.ssx
            public final Object call(Object obj) {
                return iti.m16697b((nuh0) obj);
            }
        }), null);
    }

    /* JADX INFO: renamed from: Z2 */
    private void m9341Z2(List<Media> list) {
        boolean zJ = vwb.J(this.f7677p.allMediasInPhoto.f19068a);
        MediaWrapper mediaWrapper = this.f7677p;
        if (zJ) {
            mediaWrapper.allMediasInPhoto = new q860<>(vwb.Q(list, new w9j() { // from class: l.tsx
                public final Object call(Object obj) {
                    return MediaPreviewAct.m9338X1((Media) obj);
                }
            }), null);
        } else {
            mediaWrapper.allMediasInPhoto.f19068a.clear();
            this.f7677p.allMediasInPhoto.f19068a.addAll(vwb.Q(list, new w9j() { // from class: l.usx
                public final Object call(Object obj) {
                    return MediaPreviewAct.m9350k2((Media) obj);
                }
            }));
        }
        m9382u2(this.f7677p.allMediasInPhoto.f19068a);
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ Media m9342a2(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: k2 */
    public static /* synthetic */ Media m9350k2(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: m2 */
    public static /* synthetic */ Media m9352m2(Media media) {
        return media;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    private void m9356r() {
        m9331B2();
        xdl0.M(this.f7669h, m9385z2().size() != 0);
        this.f7668g.setVisibility(0);
        m9377e3(this.f7678q);
        this.f7681t.notifyDataSetChanged();
        int i = this.f7680s;
        if (i > 0) {
            this.f7664c.T(i, false);
        } else if (this.f7678q != null) {
            for (int i2 = 0; i2 < this.f7685x.size(); i2++) {
                Media media = this.f7685x.get(i2);
                if (media.url.equals(this.f7678q.url)) {
                    this.f7664c.T(i2, false);
                    this.f7662D = media;
                    break;
                }
            }
        }
        if (this.f7659A) {
            this.f7664c.setScrollble(false);
        }
        m9374b3();
        m9371X2();
        m9381s2();
        int i3 = this.f7684w;
        if (i3 == 10 || i3 == 11) {
            xdl0.M(this.f7671j, true);
            this.f7671j.setText("图片将使用以图换图模式发送");
        } else if (i3 == 13) {
            xdl0.M(this.f7671j, true);
            this.f7671j.setText("图片将使用限时快拍模式发送");
        }
    }

    /* JADX INFO: renamed from: v2 */
    private void m9357v2() {
        boolean z;
        if (NullChecker.a(this.f7673l)) {
            this.f7673l.m23707e(this.f7684w, pageId(), this.f7675n.reportMap);
        }
        if (this.f7677p.allSelectedMedias.isEmpty() && m9380r2()) {
            this.f7677p.addSelectedMedia(this.f7662D);
            z = true;
        } else {
            z = false;
        }
        vrx vrxVar = this.f7673l;
        if (!(vrxVar != null ? vrxVar.m23703a(((Act) this).act, this.f7677p, this.f7675n) : false)) {
            m9384y2();
        }
        if (z) {
            this.f7677p.clearAllSelectedMedia();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A2 */
    public void m9358A2() {
        Intent intent = getIntent();
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("selectedMedias");
        this.f7680s = intent.getIntExtra("initialShowIndex", 0);
        this.f7679r = intent.getIntExtra("maxCount", 0);
        this.f7675n = (MediaPickerParamsObject) intent.getSerializableExtra("MediaPickerParamsObject");
        this.f7678q = intent.getSerializableExtra("selectedMedia");
        this.f7676o = intent.getBooleanExtra("showAllPhotoInPhone", false);
        this.f7686y = intent.getBooleanExtra("filterPhoto", false);
        this.f7659A = intent.getBooleanExtra("disableScroll", false);
        this.f7687z = intent.getBooleanExtra("filterVideo", false);
        this.f7674m = intent.getStringExtra("selectFolder");
        this.f7663E = intent.getBooleanExtra("needPassThrough", false);
        MediaPickerParamsObject mediaPickerParamsObject = this.f7675n;
        this.f7684w = mediaPickerParamsObject.fromType;
        this.f7683v = mediaPickerParamsObject.submitButtonTitle;
        this.f7677p.allMediasInPhoto = new q860<>(this.f7685x, null);
        this.f7677p.clearAllSelectedMedia();
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (m9363I2()) {
            arrayList.clear();
        }
        this.f7677p.addAllSelectedMedia(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C2 */
    public final void m9359C2() {
        this.f7682u = new aee0(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(0);
        this.f7669h.setLayoutManager(linearLayoutManager);
        this.f7669h.setAdapter(this.f7682u);
        this.f7664c.d(new C0470a());
        ag20 ag20Var = new ag20(this);
        this.f7681t = ag20Var;
        this.f7664c.setAdapter(ag20Var);
        this.f7681t.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: D2 */
    public final void m9360D2(int i) {
        if (this.f7673l == null) {
            if (i == 1) {
                this.f7673l = qib0.c0.j0();
                return;
            }
            if (i == 2) {
                this.f7673l = qib0.c0.R0();
                return;
            }
            if (i != 4) {
                if (i == 7) {
                    this.f7673l = qib0.c0.d();
                    return;
                } else if (i != 10 && i != 11 && i != 13 && i != 14) {
                    return;
                }
            }
            this.f7673l = qib0.c0.P4();
        }
    }

    /* JADX INFO: renamed from: E2 */
    public void m9361E2() {
        m9358A2();
        m9360D2(this.f7684w);
    }

    /* JADX INFO: renamed from: H2 */
    public final boolean m9362H2() {
        return this.f7667f.getTag() != null && ((Boolean) this.f7667f.getTag()).booleanValue();
    }

    /* JADX INFO: renamed from: I2 */
    public final boolean m9363I2() {
        return ((this.f7678q instanceof Video) && this.f7675n.getMaxVideoSelectCount() == 1) || ((this.f7678q instanceof Picture) && this.f7675n.getMaxImageSelectCount() == 1);
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m9364Q2(List list) {
        if (this.f7660B) {
            return;
        }
        m9341Z2(list);
        this.f7660B = true;
    }

    /* JADX INFO: renamed from: R2 */
    public final /* synthetic */ void m9365R2(View view) {
        finish();
    }

    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ void m9366S2(View view) {
        if (m9385z2().size() >= this.f7679r && !m9362H2()) {
            lsi0.j(String.format(act().getString(R.string.T), Integer.valueOf(this.f7679r)));
            return;
        }
        String strU = rhi.u(C0469a.m9325c(this.f7677p.croppedMap, this.f7685x.get(this.f7664c.getCurrentItem()).url));
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(strU, options);
        MediaPickerParamsObject mediaPickerParamsObject = this.f7675n;
        boolean z = mediaPickerParamsObject != null ? mediaPickerParamsObject.croppingNewStyle : false;
        MediaWrapper mediaWrapper = this.f7677p;
        startActivityForResult(NewAlbumCropperAct.m9198m2(this, strU, mediaWrapper.imageCropProportion, mediaWrapper.imageCropWidth, z), 24576);
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ Boolean m9367T2(iti itiVar) {
        return Boolean.valueOf(itiVar.f14798b.equals(this.f7674m));
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m9368U2(q860 q860Var) {
        if (this.f7660B) {
            return;
        }
        iti itiVar = (iti) vwb.r(q860Var.f19068a, new w9j() { // from class: l.osx
            public final Object call(Object obj) {
                return this.f18239a.m9367T2((iti) obj);
            }
        });
        if (itiVar == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f7678q);
            boolean zJ = vwb.J(this.f7677p.allMediasInPhoto.f19068a);
            MediaWrapper mediaWrapper = this.f7677p;
            if (zJ) {
                mediaWrapper.allMediasInPhoto = new q860<>(arrayList, null);
            } else {
                mediaWrapper.allMediasInPhoto.f19068a.addAll(arrayList);
            }
        } else {
            boolean zJ2 = vwb.J(this.f7677p.allMediasInPhoto.f19068a);
            MediaWrapper mediaWrapper2 = this.f7677p;
            if (zJ2) {
                mediaWrapper2.allMediasInPhoto = new q860<>(vwb.Q(itiVar.f14799c.f19068a, new w9j() { // from class: l.qsx
                    public final Object call(Object obj) {
                        return MediaPreviewAct.m9352m2((Media) obj);
                    }
                }), null);
            } else {
                mediaWrapper2.allMediasInPhoto.f19068a.addAll(vwb.Q(itiVar.f14799c.f19068a, new w9j() { // from class: l.rsx
                    public final Object call(Object obj) {
                        return MediaPreviewAct.m9342a2((Media) obj);
                    }
                }));
            }
        }
        m9382u2(this.f7677p.allMediasInPhoto.f19068a);
        this.f7660B = true;
    }

    /* JADX INFO: renamed from: V2 */
    public final void m9369V2() {
        m9373a3((m9385z2().size() > 0 && this.f7677p.allSelectedMedias.size() >= this.f7675n.getMinImageSelectCount()) || m9380r2());
        this.f7682u.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: W2 */
    public final void m9370W2() {
        m9341Z2(vwb.M(this.f7678q));
        emx emxVar = new emx(act(), true, true);
        act().getSupportLoaderManager().c(0, (Bundle) null, emxVar);
        emxVar.m13997r().distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.zsx
            public final void call(Object obj) {
                this.f23872a.m9364Q2((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X2 */
    public final void m9371X2() {
        if (this.f7678q instanceof Video) {
            this.f7670i.setText(R.string.a);
            this.f7670i.setOnClickListener(new View.OnClickListener() { // from class: l.dtx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11998a.m9365R2(view);
                }
            });
        } else if (NullChecker.a(this.f7675n) && NullChecker.a(this.f7675n.imagePickConfig) && !this.f7675n.imagePickConfig.showPreviewEditBtn()) {
            xdl0.M(this.f7670i, false);
        } else {
            this.f7670i.setText(R.string.x);
            xdl0.E0(this.f7670i, new View.OnClickListener() { // from class: l.ftx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13165a.m9366S2(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m9372Y2(boolean z) {
        VText vText = this.f7667f;
        if (z) {
            vText.setBackgroundResource(w2c0.D0);
            this.f7667f.setTag(Boolean.TRUE);
        } else {
            vText.setBackgroundResource(w2c0.B0);
            this.f7667f.setTag(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: a3 */
    public final void m9373a3(boolean z) {
        this.f7672k.setSelected(z);
        this.f7672k.setClickable(z);
        this.f7672k.setTextColor(z ? getResources().getColor(v0c0.i) : getResources().getColor(v0c0.g));
        m9374b3();
    }

    /* JADX INFO: renamed from: b3 */
    public final void m9374b3() {
        if (this.f7683v != null) {
            boolean zIsEmpty = this.f7677p.selectedImageMedias.isEmpty();
            VButton vButton = this.f7672k;
            if (zIsEmpty) {
                vButton.setText(this.f7683v);
            } else {
                vButton.setText(String.format("%s %d", this.f7683v, Integer.valueOf(this.f7677p.selectedImageMedias.size())));
            }
        }
    }

    /* JADX INFO: renamed from: c3 */
    public final void m9375c3() {
        emx emxVar = new emx(act(), true, true);
        act().getSupportLoaderManager().c(0, (Bundle) null, emxVar);
        emxVar.m13997r().distinctUntilChanged().observeOn(Schedulers.io()).compose(emx.m13990n(MediaPickerBaseAct.f8212k)).map(new w9j() { // from class: l.jtx
            public final Object call(Object obj) {
                return MediaPreviewAct.m9339Y1((List) obj);
            }
        }).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.ltx
            public final void call(Object obj) {
                this.f16413a.m9368U2((q860) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean checkRunningCondition() {
        if (ensurePlugin()) {
            return false;
        }
        startActivity(mgh0.m18466t(getIntent()));
        return true;
    }

    /* JADX INFO: renamed from: d3 */
    public final boolean m9376d3(Media media, boolean z, List<Media> list, int i) {
        boolean z2;
        boolean z3 = false;
        if (z) {
            if (i == list.size()) {
                if (media instanceof Video) {
                    lsi0.h(R.string.H0);
                } else {
                    lsi0.j(String.format(act().getString(R.string.T), Integer.valueOf(i)));
                }
                z2 = false;
            } else if (!list.contains(media)) {
                this.f7677p.addSelectedMedia(media);
            }
            VRecyclerView vRecyclerView = this.f7669h;
            if (m9385z2().size() != 0 && !this.f7661C) {
                z3 = true;
            }
            xdl0.M(vRecyclerView, z3);
            return z2;
        }
        this.f7677p.unCheckMedia(media);
        z2 = true;
        VRecyclerView vRecyclerView2 = this.f7669h;
        if (m9385z2().size() != 0) {
            z3 = true;
        }
        xdl0.M(vRecyclerView2, z3);
        return z2;
    }

    /* JADX INFO: renamed from: e3 */
    public final void m9377e3(final Media media) {
        if (media != null) {
            if (vwb.G(m9385z2(), new w9j() { // from class: l.btx
                public final Object call(Object obj) {
                    return Boolean.valueOf(media.isSameOrigin((Media) obj));
                }
            }) >= 0) {
                m9372Y2(true);
            } else {
                m9372Y2(false);
            }
        }
    }

    public boolean ensurePlugin() {
        return !qib0.c0.signedIn_() ? qib0.j0.z("account") : qib0.J0();
    }

    /* JADX INFO: renamed from: f3 */
    public void m9378f3() {
        if (!TextUtils.isEmpty(this.f7674m)) {
            m9375c3();
        } else if (this.f7676o || m9385z2().isEmpty()) {
            m9370W2();
        } else {
            m9382u2(m9385z2());
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM9379q2 = m9379q2(layoutInflater, viewGroup);
        m9361E2();
        m9378f3();
        return viewM9379q2;
    }

    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.htx
            public final void call(Object obj) {
                this.f14251a.m9336N2((Bundle) obj);
            }
        });
    }

    public void onBackPressed() {
        m9384y2();
    }

    public void onCropImageResult(String str) {
        if (vwb.J(this.f7685x)) {
            finish();
            return;
        }
        Picture picture = (Media) this.f7685x.get(this.f7664c.getCurrentItem());
        if (!this.f7677p.containsInMedias(picture, m9385z2())) {
            m9376d3(picture, true, m9385z2(), this.f7679r);
        }
        m9372Y2(true);
        this.f7677p.croppedMap.put(((Media) picture).url, new MediaWrapper.C0468a(rhi.B(str), m9385z2().size() != 1));
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int[] iArr = {options.outWidth, options.outHeight};
        Picture picture2 = picture;
        picture2.size = new Dimension(iArr);
        ((Media) picture2).url = C0469a.m9325c(this.f7677p.croppedMap, ((Media) picture).url);
        PhotoPreviewView photoPreviewView = (PhotoPreviewView) this.f7664c.findViewWithTag(picture);
        if (NullChecker.a(photoPreviewView)) {
            photoPreviewView.setPicture(picture2);
        }
        m9369V2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String pageId() {
        Media serializableExtra = getIntent().getSerializableExtra("selectedMedia");
        MediaPickerParamsObject mediaPickerParamsObject = (MediaPickerParamsObject) getIntent().getSerializableExtra("MediaPickerParamsObject");
        if (TextUtils.isEmpty(mediaPickerParamsObject.mediaPreviewPageId)) {
            return serializableExtra instanceof Video ? "p_video_moment_preview_view" : "p_picture_moment_preview_view";
        }
        return mediaPickerParamsObject.mediaPreviewPageId;
    }

    /* JADX INFO: renamed from: q2 */
    public View m9379q2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return utx.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r2 */
    public final boolean m9380r2() {
        return this.f7675n.canClickSubmitInPreviewWhenNoSelectedMedia(this.f7678q) || m9363I2();
    }

    /* JADX INFO: renamed from: s2 */
    public final void m9381s2() {
        if (m9363I2()) {
            this.f7669h.setVisibility(8);
            this.f7661C = true;
            this.f7667f.setVisibility(8);
        }
    }

    public boolean shouldSwitchToGradientColoredStatusBar() {
        return false;
    }

    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }

    public boolean shouldWrapContentViewWithTransparentHeader() {
        return false;
    }

    /* JADX INFO: renamed from: u2 */
    public final void m9382u2(List<Media> list) {
        this.f7685x = new ArrayList(list);
        if (this.f7681t == null) {
            m9359C2();
        }
        m9383w2();
        m9356r();
        m9369V2();
    }

    /* JADX INFO: renamed from: w2 */
    public final void m9383w2() {
        for (Media media : new ArrayList(this.f7685x)) {
            if ((media instanceof Video) && this.f7687z) {
                this.f7685x.remove(media);
            } else if ((media instanceof Picture) && this.f7686y) {
                this.f7685x.remove(media);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y2 */
    public void m9384y2() {
        Intent intent = new Intent();
        intent.putExtra("extra_images", m9385z2());
        setResult(this.f7663E ? 555 : -1, intent);
        finish();
    }

    /* JADX INFO: renamed from: z2 */
    public ArrayList<Media> m9385z2() {
        return this.f7677p.allSelectedMedias;
    }
}
