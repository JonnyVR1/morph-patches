package com.p051p1.mobile.putong.feed.newui.mediapicker;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.mediapicker.InstaLikePickerAct;
import com.p051p1.mobile.putong.feed.newui.mediapicker.picker.FeedFolderItemView;
import com.p051p1.mobile.putong.feed.p065ui.PictureView;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p137rx.schedulers.Schedulers;
import p151v.VText;
import p153l.avx;
import p153l.bnl0;
import p153l.ecj;
import p153l.ewi;
import p153l.fo0;
import p153l.hdc0;
import p153l.jic0;
import p153l.jyb;
import p153l.l01;
import p153l.l51;
import p153l.lbc0;
import p153l.lyh0;
import p153l.nuf0;
import p153l.o1j0;
import p153l.oki;
import p153l.pcj;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.t7f;
import p153l.tec0;
import p153l.tvb;
import p153l.ua5;
import p153l.uyh0;
import p153l.vg60;
import p153l.vwm;
import p153l.wzx;
import p153l.x20;
import p153l.y20;
import p153l.yb5;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes13.dex */
public class InstaLikePickerAct extends MediaPickerBaseAct implements MediaPickerBaseAct.InterfaceC13290a {

    /* JADX INFO: renamed from: A */
    public C11383c f41168A;

    /* JADX INFO: renamed from: C */
    public String f41170C;

    /* JADX INFO: renamed from: D */
    public Media f41171D;

    /* JADX INFO: renamed from: G */
    public C11384d f41174G;

    /* JADX INFO: renamed from: H */
    public DialogC11403a f41175H;

    /* JADX INFO: renamed from: I */
    public PictureView f41176I;

    /* JADX INFO: renamed from: l */
    public CoordinatorLinearLayout f41178l;

    /* JADX INFO: renamed from: m */
    public Toolbar f41179m;

    /* JADX INFO: renamed from: n */
    public TextView f41180n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f41181o;

    /* JADX INFO: renamed from: p */
    public InstaCropperView f41182p;

    /* JADX INFO: renamed from: q */
    public VText f41183q;

    /* JADX INFO: renamed from: r */
    public CoordinatorRecyclerView f41184r;

    /* JADX INFO: renamed from: s */
    public LinearLayout f41185s;

    /* JADX INFO: renamed from: t */
    public BottomLineTextView f41186t;

    /* JADX INFO: renamed from: u */
    public BottomLineTextView f41187u;

    /* JADX INFO: renamed from: y */
    public GridLayoutManager f41191y;

    /* JADX INFO: renamed from: z */
    public RecyclerView f41192z;

    /* JADX INFO: renamed from: v */
    public int f41188v = 9;

    /* JADX INFO: renamed from: w */
    public boolean f41189w = true;

    /* JADX INFO: renamed from: x */
    public TYPE f41190x = TYPE.IMAGES;

    /* JADX INFO: renamed from: B */
    public Map<String, InstaCropperView.C11380f> f41169B = new l01();

    /* JADX INFO: renamed from: E */
    public boolean f41172E = false;

    /* JADX INFO: renamed from: F */
    public boolean f41173F = false;

    /* JADX INFO: renamed from: J */
    public Runnable f41177J = new RunnableC11382b();

    public enum TYPE {
        IMAGES,
        VIDEOS
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaLikePickerAct$a */
    public class C11381a extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a */
        public int f41193a = 0;

        public C11381a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (this.f41193a == 0) {
                return;
            }
            this.f41193a = 0;
            if (i == 0 && ((LinearLayoutManager) InstaLikePickerAct.this.f41184r.getLayoutManager()).findFirstCompletelyVisibleItemPosition() == 0) {
                InstaLikePickerAct.this.f41178l.m63385g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            this.f41193a = i2;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaLikePickerAct$b */
    public class RunnableC11382b implements Runnable {
        public RunnableC11382b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (InstaLikePickerAct.this.act().hasWindowFocus() && NullChecker.m82487b(InstaLikePickerAct.this.f41176I) && InstaLikePickerAct.this.f41176I.getVisibility() == 0) {
                InstaLikePickerAct.this.f41176I.m67715E();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaLikePickerAct$c */
    public class C11383c extends jic0<ewi> {

        /* JADX INFO: renamed from: c */
        public vg60<ewi> f41196c;

        public C11383c() {
            this.f41196c = vg60.m201219a();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f41196c.f184001a.size() + 1;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return InstaLikePickerAct.this.inflater().inflate(tec0.f173686j1, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, ewi ewiVar, int i, int i2) {
            ((FeedFolderItemView) view).m63853c(ewiVar, i2 == 0, InstaLikePickerAct.this.f55457e.f181617a.f184001a.size(), InstaLikePickerAct.this.f55457e.f181617a.f184001a.size() > 0 ? InstaLikePickerAct.this.f55457e.f181617a.f184001a.get(0) : null, InstaLikePickerAct.this);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public ewi getItem(int i) {
            if (i == 0) {
                return null;
            }
            return this.f41196c.f184001a.get(i - 1);
        }

        /* JADX INFO: renamed from: G */
        public void m63496G(vg60<ewi> vg60Var) {
            this.f41196c = vg60Var;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaLikePickerAct$d */
    public class C11384d extends jic0<Media> {

        /* JADX INFO: renamed from: c */
        public vg60<Media> f41198c;

        public C11384d() {
            this.f41198c = vg60.m201219a();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f41198c.f184001a.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return InstaLikePickerAct.this.inflater().inflate(tec0.f173613Y3, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, Media media, int i, int i2) {
            InstaLikePickerAct instaLikePickerAct = InstaLikePickerAct.this;
            ((InstaMediaItemView) view).m63502c(media, i2, instaLikePickerAct.f41172E, instaLikePickerAct);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public Media getItem(int i) {
            return this.f41198c.f184001a.get(i);
        }

        /* JADX INFO: renamed from: G */
        public void m63499G(vg60<Media> vg60Var) {
            this.f41198c = vg60Var;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }
    }

    /* JADX INFO: renamed from: C2 */
    public static /* synthetic */ vg60 m63438C2(List list) {
        return new vg60(jyb.m147486Q(list, new qcj() { // from class: l.kwm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ewi.m122953b((v2i0) obj);
            }
        }), null);
    }

    /* JADX INFO: renamed from: F2 */
    public static Intent m63440F2(Context context, int i, boolean z, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) InstaLikePickerAct.class);
        intent.putExtra("imageCount", i);
        intent.putExtra("hasVideo", z);
        intent.putExtra("isInCameraGroup", z2);
        return intent;
    }

    /* JADX INFO: renamed from: K2 */
    public static Bitmap m63441K2(Context context, InstaCropperView.C11380f c11380f, Uri uri) {
        BitmapFactory.Options options;
        int i;
        int i2;
        if (NullChecker.m82486a(c11380f)) {
            options = new BitmapFactory.Options();
            options.inSampleSize = 1;
            int i3 = (c11380f.f41164g - c11380f.f41162e) * (c11380f.f41165h - c11380f.f41163f);
            int i4 = c11380f.f41166i * c11380f.f41167j * 4;
            int i5 = i3;
            while (true) {
                i2 = options.inSampleSize;
                if (i5 <= i4) {
                    break;
                }
                int i6 = i2 * 2;
                options.inSampleSize = i6;
                i5 = i3 / (i6 * i6);
            }
            if (i2 > 1) {
                options.inSampleSize = i2 / 2;
            }
        } else {
            options = new BitmapFactory.Options();
            options.inSampleSize = 1;
        }
        try {
            Bitmap bitmapM214979H = yb5.m214979H(context, uri, options);
            if (bitmapM214979H == null) {
                return null;
            }
            Bitmap bitmapM192783c = tvb.m192783c(context, uri, bitmapM214979H);
            if (!NullChecker.m82486a(c11380f)) {
                int width = bitmapM192783c.getWidth();
                int height = bitmapM192783c.getHeight();
                int i7 = 0;
                if (width >= height) {
                    i7 = (width - height) / 2;
                    width = height;
                    i = 0;
                } else {
                    i = (height - width) / 2;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapM192783c, i7, i, width, width);
                if (bitmapM192783c != bitmapCreateBitmap) {
                    bitmapM192783c.recycle();
                }
                return bitmapCreateBitmap;
            }
            int i8 = c11380f.f41162e;
            int i9 = options.inSampleSize;
            int i10 = i8 / i9;
            c11380f.f41162e = i10;
            int i11 = c11380f.f41163f / i9;
            c11380f.f41163f = i11;
            int i12 = c11380f.f41164g / i9;
            c11380f.f41164g = i12;
            int i13 = c11380f.f41165h / i9;
            c11380f.f41165h = i13;
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapM192783c, i10, i11, i14, i15);
            if (bitmapM192783c != bitmapCreateBitmap2) {
                bitmapM192783c.recycle();
            }
            int i16 = c11380f.f41166i;
            if (i14 <= i16 && i15 <= c11380f.f41167j) {
                return bitmapCreateBitmap2;
            }
            Bitmap bitmapM214987P = yb5.m214987P(bitmapCreateBitmap2, i16, c11380f.f41167j);
            bitmapCreateBitmap2.recycle();
            return bitmapM214987P;
        } catch (Throwable th) {
            CrashHelper.m82479c(new Throwable("MakeDrawableTask cropImageAndResize: " + th.getMessage(), th));
            return null;
        }
    }

    /* JADX INFO: renamed from: M2 */
    private void m63442M2() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), 4);
        this.f41191y = gridLayoutManager;
        gridLayoutManager.setSmoothScrollbarEnabled(true);
        this.f41184r.setLayoutManager(this.f41191y);
        this.f41184r.addItemDecoration(new nuf0(qa00.m175859d(2.0f), 4));
    }

    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ Media m63444b2(Picture picture) {
        return picture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g3 */
    public /* synthetic */ boolean m63449g3(MenuItem menuItem) {
        m63471L2();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j3, reason: merged with bridge method [inline-methods] */
    public void m63476T2() {
        avx avxVar = new avx(act(), true, true);
        avxVar.m100544v().distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.bwm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78763a.m63487f3((List) obj);
            }
        }));
        avxVar.m100544v().distinctUntilChanged().observeOn(Schedulers.m222739io()).compose(avx.m100538p(MediaPickerBaseAct.f55452i)).map(new qcj() { // from class: l.cwm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return InstaLikePickerAct.m63464v2((List) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.dwm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91033a.m63484c3((vg60) obj);
            }
        }));
        avxVar.m100545w().subscribe(psd0.m173596G(new y20() { // from class: l.ewm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96174a.m63485d3((List) obj);
            }
        }));
        avxVar.m100545w().observeOn(Schedulers.m222739io()).compose(avx.m100538p(MediaPickerBaseAct.f55453j)).map(new qcj() { // from class: l.gwm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return InstaLikePickerAct.m63438C2((List) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.hwm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111900a.m63486e3((vg60) obj);
            }
        }));
        act().getSupportLoaderManager().mo3089e(0, null, avxVar);
    }

    /* JADX INFO: renamed from: r */
    private void m63460r() {
        if (!this.f41189w) {
            this.f41185s.setVisibility(8);
        }
        m63491m3();
        m63472N2();
        m63442M2();
        int i = this.f41188v;
        VText vText = this.f41183q;
        if (i == 1) {
            vText.setVisibility(8);
        } else {
            vText.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: v2 */
    public static /* synthetic */ vg60 m63464v2(List list) {
        return new vg60(jyb.m147486Q(list, new qcj() { // from class: l.iwm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ewi.m122953b((v2i0) obj);
            }
        }), null);
    }

    /* JADX INFO: renamed from: z2 */
    public static /* synthetic */ Media m63467z2(Video video) {
        return video;
    }

    /* JADX INFO: renamed from: E2 */
    public View m63468E2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vwm.m203169b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct.InterfaceC13290a
    /* JADX INFO: renamed from: H */
    public int mo48974H() {
        return this.f55458f;
    }

    /* JADX INFO: renamed from: H2 */
    public void m63469H2(Media media, int i) {
        if (this.f41172E) {
            if (!this.f55459g.containsKey(media.url) || this.f55458f == this.f55459g.get(media.url).intValue()) {
                boolean zContainsKey = this.f55459g.containsKey(media.url);
                Map<String, Integer> map = this.f55459g;
                if (zContainsKey) {
                    if (map.size() == 1) {
                        return;
                    }
                    this.f41169B.remove(media.url);
                    ArrayList arrayList = new ArrayList(this.f55459g.keySet());
                    int iIndexOf = arrayList.indexOf(media.url);
                    if (arrayList.size() == 1) {
                        this.f41170C = media.url;
                        this.f41174G.notifyItemChanged(i);
                    } else {
                        int i2 = iIndexOf + 1;
                        if (arrayList.size() == i2) {
                            String str = (String) arrayList.get(iIndexOf - 1);
                            this.f41170C = str;
                            this.f55458f = this.f55459g.get(str).intValue();
                            this.f41174G.notifyItemChanged(i);
                            this.f41174G.notifyItemChanged(this.f55458f);
                        } else {
                            this.f41170C = (String) arrayList.get(i2);
                            this.f41174G.notifyItemChanged(i);
                            while (iIndexOf < arrayList.size()) {
                                this.f41174G.notifyItemChanged(this.f55459g.get(arrayList.get(iIndexOf)).intValue());
                                iIndexOf++;
                            }
                        }
                    }
                    this.f55458f = this.f55459g.get(this.f41170C).intValue();
                    this.f41182p.m63428S(Uri.fromFile(new File(oki.m168038z(this.f41170C))), this.f41169B.get(this.f41170C));
                    this.f55459g.remove(media.url);
                } else {
                    if (map.size() == this.f41188v) {
                        o1j0.m165634h(R$string.f39946l3);
                        return;
                    }
                    this.f41169B.put(this.f41170C, this.f41182p.f41149w);
                    this.f41174G.notifyItemChanged(this.f55458f);
                    this.f55458f = i;
                    this.f41170C = media.url;
                    this.f41182p.setImageUri(Uri.fromFile(new File(oki.m168038z(media.url))));
                    this.f55459g.put(media.url, Integer.valueOf(i));
                    this.f41174G.notifyItemChanged(this.f55458f);
                }
            } else {
                this.f41169B.put(this.f41170C, this.f41182p.f41149w);
                this.f41182p.m63428S(Uri.fromFile(new File(oki.m168038z(media.url))), this.f41169B.get(media.url));
                this.f41174G.notifyItemChanged(this.f55458f);
                this.f41174G.notifyItemChanged(i);
                this.f55458f = i;
                this.f41170C = media.url;
            }
        } else {
            if (this.f55458f == i) {
                return;
            }
            this.f41182p.setImageUri(Uri.fromFile(new File(oki.m168038z(media.url))));
            this.f41174G.notifyItemChanged(i);
            this.f41174G.notifyItemChanged(this.f55458f);
            this.f55458f = i;
            this.f41170C = media.url;
        }
        this.f41178l.m63385g();
        l51.m152888H(this, new Runnable() { // from class: l.pwm
            @Override // java.lang.Runnable
            public final void run() {
                this.f154416a.m63473Q2();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: I2 */
    public void m63470I2(Media media, int i) {
        if (this.f55458f == i) {
            return;
        }
        if ((media instanceof Video) && ((Video) media).duration > 16000.0f) {
            o1j0.m165636j(String.format(getString(R$string.f39856Y2), String.valueOf(15)));
            return;
        }
        this.f41176I.m67719r(true);
        this.f41176I.m67716F(media);
        this.f41176I.m67715E();
        this.f41174G.notifyItemChanged(i);
        this.f41174G.notifyItemChanged(this.f55458f);
        this.f55458f = i;
        this.f41170C = media.url;
        this.f41171D = media;
    }

    /* JADX INFO: renamed from: L2 */
    public final void m63471L2() {
        final ArrayList arrayList = new ArrayList();
        uyh0 uyh0Var = this.f55457e;
        uyh0 uyh0Var2 = this.f55455c;
        if (uyh0Var == uyh0Var2) {
            if (uyh0Var2.f181617a.f184001a.size() <= 0) {
                o1j0.m165636j("目前没有图片，可以先去拍照");
                return;
            }
            final l01 l01Var = new l01();
            l01Var.putAll(this.f41169B);
            l01Var.put(this.f41170C, this.f41182p.f41149w);
            progress(R$string.f39832U2);
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(this.f55459g);
            linkedHashMap.put(this.f41170C, Integer.valueOf(this.f55458f));
            l51.m152919y(new Runnable() { // from class: l.qwm
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f159947a.m63475S2(linkedHashMap, l01Var, arrayList);
                }
            });
            return;
        }
        Media media = this.f41171D;
        if (media instanceof Video) {
            if (((Video) media).duration > 16000.0f) {
                o1j0.m165636j(String.format(getString(R$string.f39856Y2), String.valueOf(15)));
                return;
            }
            Video video = (Video) media;
            boolean z = this.f41173F;
            video.isFromNewCamera = z;
            video.hasOriginalSound = z;
            arrayList.add(media);
            if (arrayList.size() > 0) {
                Intent intent = new Intent();
                intent.putExtra(MediaPickerBaseAct.f55451h, arrayList);
                setResult(-1, intent);
                lambda$debugItems$19();
            }
        }
    }

    /* JADX INFO: renamed from: N2 */
    public final void m63472N2() {
        act().setSupportActionBar(this.f41179m);
        act().getSupportActionBar().mo102196w(true);
        act().getSupportActionBar().mo102199z(false);
        this.f41179m.setNavigationOnClickListener(new View.OnClickListener() { // from class: l.zvm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f206255a.m63483b3(view);
            }
        });
        Drawable drawable = act().getResources().getDrawable(lbc0.f130990a);
        drawable.setColorFilter(RoundedDrawable.DEFAULT_BORDER_COLOR, PorterDuff.Mode.SRC_ATOP);
        this.f41180n.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        getSupportActionBar().mo102169B(lbc0.f130877J6);
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m63473Q2() {
        this.f41191y.scrollToPositionWithOffset(this.f55458f, 0);
    }

    /* JADX INFO: renamed from: R2 */
    public final /* synthetic */ void m63474R2(ArrayList arrayList) {
        if (isFinishing()) {
            return;
        }
        act().progressDismiss();
        if (arrayList.size() <= 0) {
            o1j0.m165634h(R$string.f39887d0);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(MediaPickerBaseAct.f55451h, arrayList);
        setResult(-1, intent);
        lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ void m63475S2(Map map, Map map2, final ArrayList arrayList) throws Throwable {
        for (String str : map.keySet()) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    Bitmap bitmapM63441K2 = m63441K2(act(), (InstaCropperView.C11380f) map2.get(str), Uri.fromFile(new File(oki.m168038z(str))));
                    File fileM120381O = ecj.m120381O("jpg");
                    FileOutputStream fileOutputStream2 = new FileOutputStream(fileM120381O);
                    try {
                        bitmapM63441K2.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream2);
                        t7f.m189565b(Uri.parse(str).getPath(), fileM120381O.getAbsolutePath(), false);
                        fileOutputStream2.flush();
                        Picture picture = new Picture();
                        picture.mediaType = "image/*";
                        picture.url = oki.m168011B(fileM120381O.getPath());
                        picture.status = MediaLocalStatus.get("raw");
                        arrayList.add(picture);
                        ua5.m195158b(fileOutputStream2);
                    } catch (FileNotFoundException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        CrashHelper.m82479c(e);
                        o1j0.m165634h(R$string.f39787N);
                        ua5.m195158b(fileOutputStream);
                    } catch (IOException e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        CrashHelper.m82479c(e);
                        o1j0.m165634h(R$string.f39787N);
                        ua5.m195158b(fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        ua5.m195158b(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (FileNotFoundException e3) {
                e = e3;
            } catch (IOException e4) {
                e = e4;
            }
        }
        l51.m152887G(new Runnable() { // from class: l.awm
            @Override // java.lang.Runnable
            public final void run() {
                this.f73772a.m63474R2(arrayList);
            }
        });
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m63477U2(View view) {
        if (this.f55457e == this.f55455c) {
            return;
        }
        m63492n3();
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m63478V2(View view) {
        if (this.f55457e == this.f55456d) {
            return;
        }
        m63493o3();
    }

    /* JADX INFO: renamed from: W2 */
    public final /* synthetic */ void m63479W2(View view) {
        if (this.f41192z == null) {
            RecyclerView recyclerView = new RecyclerView(act());
            this.f41192z = recyclerView;
            recyclerView.setMinimumHeight(qa00.m175859d(300.0f));
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
            linearLayoutManager.setReverseLayout(true);
            this.f41192z.setLayoutManager(linearLayoutManager);
            this.f41192z.setBackgroundColor(-1);
        }
        C11383c c11383c = new C11383c();
        this.f41168A = c11383c;
        this.f41192z.setAdapter(c11383c);
        this.f41168A.m63496G(this.f55457e.f181618b);
        if (NullChecker.m82486a(this.f41175H)) {
            this.f41175H.dismiss();
        }
        DialogC11403a dialogC11403a = new DialogC11403a(this);
        this.f41175H = dialogC11403a;
        dialogC11403a.setContentView(this.f41192z);
        this.f41175H.show();
        this.f41192z.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m63480X2(View view) {
        m63490k3(!this.f41172E);
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m63481Z2(Bundle bundle) {
        m63460r();
        if (wzx.m208784k()) {
            new wzx().m208785d(act(), act().findViewById(hdc0.f108932j1), new x20() { // from class: l.swm
                @Override // p153l.x20
                public final void call() {
                    this.f170982a.m63476T2();
                }
            }, null, null, null, null);
        } else {
            PermissionHelper.m81065c().m81083r("android.permission.READ_EXTERNAL_STORAGE").m81088w(false).m81086u(true).m81080o(new x20() { // from class: l.twm
                @Override // p153l.x20
                public final void call() {
                    this.f176406a.m63476T2();
                }
            }).m81074i(this);
        }
        this.f41186t.setOnClickListener(new View.OnClickListener() { // from class: l.vvm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185944a.m63477U2(view);
            }
        });
        this.f41187u.setOnClickListener(new View.OnClickListener() { // from class: l.wvm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190972a.m63478V2(view);
            }
        });
        this.f41180n.setOnClickListener(new View.OnClickListener() { // from class: l.xvm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196409a.m63479W2(view);
            }
        });
        this.f41183q.setOnClickListener(new View.OnClickListener() { // from class: l.yvm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201745a.m63480X2(view);
            }
        });
    }

    /* JADX INFO: renamed from: a3 */
    public final /* synthetic */ void m63482a3() {
        removeCallbacks(this.f41177J);
    }

    @Override // com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct.InterfaceC13290a
    /* JADX INFO: renamed from: b */
    public void mo48975b(ewi ewiVar) {
        uyh0 uyh0Var = this.f55457e;
        uyh0Var.f181619c = ewiVar;
        vg60<Media> vg60Var = ewiVar == null ? uyh0Var.f181617a : ewiVar.f96163c;
        this.f41174G.m63499G(vg60Var);
        this.f55457e.f181621e.scrollToPosition(0);
        post(new Runnable() { // from class: l.uvm
            @Override // java.lang.Runnable
            public final void run() {
                this.f181157a.m63489i3();
            }
        });
        if (NullChecker.m82486a(this.f41175H)) {
            this.f41175H.dismiss();
            this.f41175H = null;
        }
        if (!this.f41190x.equals(TYPE.IMAGES)) {
            if (!this.f41190x.equals(TYPE.VIDEOS) || vg60Var.f184001a.size() <= 0) {
                return;
            }
            this.f41176I.m67719r(true);
            this.f55458f = 0;
            this.f41170C = vg60Var.f184001a.get(0).url;
            this.f41171D = vg60Var.f184001a.get(0);
            this.f41176I.m67716F(vg60Var.f184001a.get(0));
            this.f41176I.m67715E();
            return;
        }
        if (vg60Var.f184001a.size() > 0) {
            this.f55458f = 0;
            this.f41170C = vg60Var.f184001a.get(0).url;
            this.f41182p.setImageUri(Uri.fromFile(new File(oki.m168038z(this.f41170C))));
            for (int i = 0; i < vg60Var.f184001a.size(); i++) {
                Media media = vg60Var.f184001a.get(i);
                if (this.f55459g.containsKey(media.url)) {
                    this.f55459g.put(media.url, Integer.valueOf(i));
                }
            }
        }
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ void m63483b3(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m63484c3(vg60 vg60Var) {
        this.f55455c.f181618b = vg60Var;
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m63485d3(List list) {
        this.f55456d.f181617a = new vg60<>(jyb.m147486Q(list, new qcj() { // from class: l.jwm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return InstaLikePickerAct.m63467z2((Video) obj);
            }
        }), null);
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ void m63486e3(vg60 vg60Var) {
        this.f55456d.f181618b = vg60Var;
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m63487f3(List list) {
        this.f55455c.f181617a = new vg60<>(jyb.m147486Q(list, new qcj() { // from class: l.lwm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return InstaLikePickerAct.m63444b2((Picture) obj);
            }
        }), null);
        m63492n3();
    }

    /* JADX INFO: renamed from: h3 */
    public final /* synthetic */ Boolean m63488h3() {
        Iterator it = jyb.m147522n(bnl0.m105579s(this.f41179m), new qcj() { // from class: l.rwm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) instanceof ActionMenuItemView);
            }
        }).iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) ((View) it.next());
            if (!TextUtils.isEmpty(textView.getText())) {
                textView.setTypeface(lyh0.m156283c(3));
                textView.setTextColor(Color.parseColor("#f55a43"));
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m63489i3() {
        this.f55457e.f181621e.scrollToPosition(0);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m63468E2(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new y20() { // from class: l.fwm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101184a.m63481Z2((Bundle) obj);
            }
        }, new x20() { // from class: l.mwm
            @Override // p153l.x20
            public final void call() {
                this.f139113a.m63482a3();
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public final void m63490k3(boolean z) {
        if (this.f55455c.f181617a.f184001a.size() < 2) {
            return;
        }
        if (z) {
            this.f41183q.setBackgroundDrawable(getResources().getDrawable(lbc0.f131141s6));
            this.f41172E = true;
            if (NullChecker.m82486a(this.f41170C)) {
                this.f55459g.put(this.f41170C, Integer.valueOf(this.f55458f));
            }
            this.f55455c.f181620d.notifyDataSetChanged();
            this.f41182p.setFitView(true);
            return;
        }
        this.f55459g.clear();
        this.f41169B.clear();
        this.f41183q.setBackgroundDrawable(getResources().getDrawable(lbc0.f131133r6));
        this.f41172E = false;
        this.f55455c.f181620d.notifyDataSetChanged();
        this.f41182p.setFitView(false);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: m3 */
    public final void m63491m3() {
        int iM175859d = qa00.m175859d(48.0f) + bnl0.m105592y0();
        int iM175859d2 = qa00.m175859d(48.0f);
        this.f41178l.m63383e(iM175859d, iM175859d2);
        this.f41181o.getLayoutParams().height = bnl0.m105592y0();
        PictureView pictureView = (PictureView) LayoutInflater.from(this.act).inflate(tec0.f173693k1, (ViewGroup) this.f41181o, false);
        this.f41176I = pictureView;
        pictureView.f44417e.setAlpha(0.0f);
        PictureView pictureView2 = this.f41176I;
        pictureView2.f44411A = 200;
        pictureView2.f44438z = 0.0f;
        pictureView2.setOnClickListener(pictureView2);
        this.f41176I.m67720u(false);
        this.f41181o.addView(this.f41176I);
        this.f41176I.setVisibility(8);
        this.f41184r.getLayoutParams().height = bnl0.m105588w0() - iM175859d2;
        C11384d c11384d = new C11384d();
        this.f41174G = c11384d;
        this.f41184r.setAdapter(c11384d);
        uyh0 uyh0Var = this.f55455c;
        uyh0 uyh0Var2 = this.f55456d;
        C11384d c11384d2 = this.f41174G;
        uyh0Var2.f181620d = c11384d2;
        uyh0Var.f181620d = c11384d2;
        CoordinatorRecyclerView coordinatorRecyclerView = this.f41184r;
        uyh0Var2.f181621e = coordinatorRecyclerView;
        uyh0Var.f181621e = coordinatorRecyclerView;
        this.f41178l.getLayoutParams().height = (iM175859d + bnl0.m105588w0()) - iM175859d2;
        this.f41184r.setCoordinatorListener(this.f41178l);
        this.f41184r.addOnScrollListener(new C11381a());
    }

    /* JADX INFO: renamed from: n3 */
    public final void m63492n3() {
        this.f41190x = TYPE.IMAGES;
        this.f41180n.setText(getString(R$string.f39932j3));
        this.f41186t.m63369l(true);
        this.f41187u.m63369l(false);
        this.f41182p.setVisibility(0);
        int i = this.f41188v;
        VText vText = this.f41183q;
        if (i == 1) {
            vText.setVisibility(8);
        } else {
            vText.setVisibility(0);
        }
        this.f41176I.m67714D();
        this.f41176I.setVisibility(8);
        uyh0 uyh0Var = this.f55455c;
        this.f55457e = uyh0Var;
        this.f41174G.m63499G(uyh0Var.f181617a);
        if (this.f55455c.f181617a.f184001a.size() > 0) {
            this.f55458f = 0;
            this.f41170C = this.f55455c.f181617a.f184001a.get(0).url;
            this.f41182p.setImageUri(Uri.fromFile(new File(oki.m168038z(this.f41170C))));
        }
        removeCallbacks(this.f41177J);
    }

    /* JADX INFO: renamed from: o3 */
    public final void m63493o3() {
        this.f41190x = TYPE.VIDEOS;
        m63490k3(false);
        this.f41180n.setText(getString(R$string.f39939k3));
        this.f41186t.m63369l(false);
        this.f41187u.m63369l(true);
        this.f41176I.setVisibility(0);
        this.f41183q.setVisibility(8);
        this.f41182p.setVisibility(8);
        uyh0 uyh0Var = this.f55456d;
        this.f55457e = uyh0Var;
        this.f41174G.m63499G(uyh0Var.f181617a);
        if (this.f55456d.f181617a.f184001a.size() > 0) {
            this.f55458f = 0;
            this.f41170C = this.f55456d.f181617a.f184001a.get(0).url;
            this.f41171D = this.f55456d.f181617a.f184001a.get(0);
            this.f41176I.m67716F(this.f55456d.f181617a.f184001a.get(0));
            postDelayed(this.f41177J, 200L);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, hdc0.f108859O0, 1, actionItemPadding(string(R$string.f39949m))).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.nwm
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f143984a.m63449g3(menuItem);
            }
        }).setShowAsAction(2);
        bnl0.m105546b0(findViewById(R.id.content), new pcj() { // from class: l.owm
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f149544a.m63488h3();
            }
        });
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        if (NullChecker.m82487b(this.f41176I)) {
            this.f41176I.m67719r(true);
        }
        super.onDestroyLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        if (NullChecker.m82487b(this.f41176I)) {
            this.f41176I.m67714D();
        }
        super.onPauseLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f41188v = getIntent().getIntExtra("imageCount", 9);
        this.f41189w = getIntent().getBooleanExtra("hasVideo", true);
        this.f41173F = getIntent().getBooleanExtra("isInCameraGroup", false);
    }

    @Override // com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct.InterfaceC13290a
    /* JADX INFO: renamed from: x */
    public Map<String, Integer> mo48983x() {
        return this.f55459g;
    }

    @Override // com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct.InterfaceC13290a
    /* JADX INFO: renamed from: y */
    public void mo48984y(Media media, int i) {
        if (this.f55457e == this.f55455c) {
            m63469H2(media, i);
        } else {
            m63470I2(media, i);
        }
    }
}
