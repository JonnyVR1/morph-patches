package com.p046p1.mobile.putong.feed.newui.mediapicker;

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
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.mediapicker.InstaLikePickerAct;
import com.p046p1.mobile.putong.feed.newui.mediapicker.picker.FeedFolderItemView;
import com.p046p1.mobile.putong.feed.p060ui.PictureView;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
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
import p133rx.schedulers.Schedulers;
import p147v.VText;
import p149l.b5c0;
import p149l.d30;
import p149l.dac0;
import p149l.dmx;
import p149l.e01;
import p149l.e30;
import p149l.e51;
import p149l.emf0;
import p149l.eqh0;
import p149l.f3c0;
import p149l.fub;
import p149l.iti;
import p149l.jo0;
import p149l.k9j;
import p149l.lsi0;
import p149l.mkd0;
import p149l.n6f;
import p149l.nqh0;
import p149l.o6c0;
import p149l.q860;
import p149l.rhi;
import p149l.t100;
import p149l.t95;
import p149l.uum;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.ya5;
import p149l.zqx;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes12.dex */
public class InstaLikePickerAct extends MediaPickerBaseAct implements MediaPickerBaseAct.InterfaceC13127a {

    /* JADX INFO: renamed from: A */
    public C11220c f40320A;

    /* JADX INFO: renamed from: C */
    public String f40322C;

    /* JADX INFO: renamed from: D */
    public Media f40323D;

    /* JADX INFO: renamed from: G */
    public C11221d f40326G;

    /* JADX INFO: renamed from: H */
    public DialogC11240a f40327H;

    /* JADX INFO: renamed from: I */
    public PictureView f40328I;

    /* JADX INFO: renamed from: l */
    public CoordinatorLinearLayout f40330l;

    /* JADX INFO: renamed from: m */
    public Toolbar f40331m;

    /* JADX INFO: renamed from: n */
    public TextView f40332n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f40333o;

    /* JADX INFO: renamed from: p */
    public InstaCropperView f40334p;

    /* JADX INFO: renamed from: q */
    public VText f40335q;

    /* JADX INFO: renamed from: r */
    public CoordinatorRecyclerView f40336r;

    /* JADX INFO: renamed from: s */
    public LinearLayout f40337s;

    /* JADX INFO: renamed from: t */
    public BottomLineTextView f40338t;

    /* JADX INFO: renamed from: u */
    public BottomLineTextView f40339u;

    /* JADX INFO: renamed from: y */
    public GridLayoutManager f40343y;

    /* JADX INFO: renamed from: z */
    public RecyclerView f40344z;

    /* JADX INFO: renamed from: v */
    public int f40340v = 9;

    /* JADX INFO: renamed from: w */
    public boolean f40341w = true;

    /* JADX INFO: renamed from: x */
    public TYPE f40342x = TYPE.IMAGES;

    /* JADX INFO: renamed from: B */
    public Map<String, InstaCropperView.C11217f> f40321B = new e01();

    /* JADX INFO: renamed from: E */
    public boolean f40324E = false;

    /* JADX INFO: renamed from: F */
    public boolean f40325F = false;

    /* JADX INFO: renamed from: J */
    public Runnable f40329J = new RunnableC11219b();

    public enum TYPE {
        IMAGES,
        VIDEOS
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaLikePickerAct$a */
    public class C11218a extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a */
        public int f40345a = 0;

        public C11218a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (this.f40345a == 0) {
                return;
            }
            this.f40345a = 0;
            if (i == 0 && ((LinearLayoutManager) InstaLikePickerAct.this.f40336r.getLayoutManager()).findFirstCompletelyVisibleItemPosition() == 0) {
                InstaLikePickerAct.this.f40330l.m62202g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            this.f40345a = i2;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaLikePickerAct$b */
    public class RunnableC11219b implements Runnable {
        public RunnableC11219b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (InstaLikePickerAct.this.act().hasWindowFocus() && NullChecker.m81304b(InstaLikePickerAct.this.f40328I) && InstaLikePickerAct.this.f40328I.getVisibility() == 0) {
                InstaLikePickerAct.this.f40328I.m66532E();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaLikePickerAct$c */
    public class C11220c extends dac0<iti> {

        /* JADX INFO: renamed from: c */
        public q860<iti> f40348c;

        public C11220c() {
            this.f40348c = q860.m173341a();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f40348c.f153135a.size() + 1;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return InstaLikePickerAct.this.inflater().inflate(o6c0.f142217j1, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, iti itiVar, int i, int i2) {
            ((FeedFolderItemView) view).m62670c(itiVar, i2 == 0, InstaLikePickerAct.this.f54609e.f140066a.f153135a.size(), InstaLikePickerAct.this.f54609e.f140066a.f153135a.size() > 0 ? InstaLikePickerAct.this.f54609e.f140066a.f153135a.get(0) : null, InstaLikePickerAct.this);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public iti getItem(int i) {
            if (i == 0) {
                return null;
            }
            return this.f40348c.f153135a.get(i - 1);
        }

        /* JADX INFO: renamed from: G */
        public void m62313G(q860<iti> q860Var) {
            this.f40348c = q860Var;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaLikePickerAct$d */
    public class C11221d extends dac0<Media> {

        /* JADX INFO: renamed from: c */
        public q860<Media> f40350c;

        public C11221d() {
            this.f40350c = q860.m173341a();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f40350c.f153135a.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return InstaLikePickerAct.this.inflater().inflate(o6c0.f142144Y3, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, Media media, int i, int i2) {
            InstaLikePickerAct instaLikePickerAct = InstaLikePickerAct.this;
            ((InstaMediaItemView) view).m62319c(media, i2, instaLikePickerAct.f40324E, instaLikePickerAct);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public Media getItem(int i) {
            return this.f40350c.f153135a.get(i);
        }

        /* JADX INFO: renamed from: G */
        public void m62316G(q860<Media> q860Var) {
            this.f40350c = q860Var;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }
    }

    /* JADX INFO: renamed from: B2 */
    public static /* synthetic */ q860 m62254B2(List list) {
        return new q860(vwb.m200303Q(list, new w9j() { // from class: l.jum
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return iti.m138200b((nuh0) obj);
            }
        }), null);
    }

    /* JADX INFO: renamed from: E2 */
    public static Intent m62256E2(Context context, int i, boolean z, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) InstaLikePickerAct.class);
        intent.putExtra("imageCount", i);
        intent.putExtra("hasVideo", z);
        intent.putExtra("isInCameraGroup", z2);
        return intent;
    }

    /* JADX INFO: renamed from: I2 */
    public static Bitmap m62257I2(Context context, InstaCropperView.C11217f c11217f, Uri uri) {
        BitmapFactory.Options options;
        int i;
        int i2;
        if (NullChecker.m81303a(c11217f)) {
            options = new BitmapFactory.Options();
            options.inSampleSize = 1;
            int i3 = (c11217f.f40316g - c11217f.f40314e) * (c11217f.f40317h - c11217f.f40315f);
            int i4 = c11217f.f40318i * c11217f.f40319j * 4;
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
            Bitmap bitmapM213792H = ya5.m213792H(context, uri, options);
            if (bitmapM213792H == null) {
                return null;
            }
            Bitmap bitmapM123164c = fub.m123164c(context, uri, bitmapM213792H);
            if (!NullChecker.m81303a(c11217f)) {
                int width = bitmapM123164c.getWidth();
                int height = bitmapM123164c.getHeight();
                int i7 = 0;
                if (width >= height) {
                    i7 = (width - height) / 2;
                    width = height;
                    i = 0;
                } else {
                    i = (height - width) / 2;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapM123164c, i7, i, width, width);
                if (bitmapM123164c != bitmapCreateBitmap) {
                    bitmapM123164c.recycle();
                }
                return bitmapCreateBitmap;
            }
            int i8 = c11217f.f40314e;
            int i9 = options.inSampleSize;
            int i10 = i8 / i9;
            c11217f.f40314e = i10;
            int i11 = c11217f.f40315f / i9;
            c11217f.f40315f = i11;
            int i12 = c11217f.f40316g / i9;
            c11217f.f40316g = i12;
            int i13 = c11217f.f40317h / i9;
            c11217f.f40317h = i13;
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapM123164c, i10, i11, i14, i15);
            if (bitmapM123164c != bitmapCreateBitmap2) {
                bitmapM123164c.recycle();
            }
            int i16 = c11217f.f40318i;
            if (i14 <= i16 && i15 <= c11217f.f40319j) {
                return bitmapCreateBitmap2;
            }
            Bitmap bitmapM213800P = ya5.m213800P(bitmapCreateBitmap2, i16, c11217f.f40319j);
            bitmapCreateBitmap2.recycle();
            return bitmapM213800P;
        } catch (Throwable th) {
            CrashHelper.m81296c(new Throwable("MakeDrawableTask cropImageAndResize: " + th.getMessage(), th));
            return null;
        }
    }

    /* JADX INFO: renamed from: L2 */
    private void m62258L2() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), 4);
        this.f40343y = gridLayoutManager;
        gridLayoutManager.setSmoothScrollbarEnabled(true);
        this.f40336r.setLayoutManager(this.f40343y);
        this.f40336r.addItemDecoration(new emf0(t100.m186890d(2.0f), 4));
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ Media m62260a2(Picture picture) {
        return picture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e3 */
    public /* synthetic */ boolean m62265e3(MenuItem menuItem) {
        m62288K2();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public void m62293S2() {
        dmx dmxVar = new dmx(act(), true, true);
        dmxVar.m112548v().distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.aum
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71843a.m62304d3((List) obj);
            }
        }));
        dmxVar.m112548v().distinctUntilChanged().observeOn(Schedulers.m221493io()).compose(dmx.m112542p(MediaPickerBaseAct.f54604i)).map(new w9j() { // from class: l.bum
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return InstaLikePickerAct.m62280u2((List) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.cum
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82585a.m62301a3((q860) obj);
            }
        }));
        dmxVar.m112549w().subscribe(mkd0.m154955G(new e30() { // from class: l.dum
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88000a.m62302b3((List) obj);
            }
        }));
        dmxVar.m112549w().observeOn(Schedulers.m221493io()).compose(dmx.m112542p(MediaPickerBaseAct.f54605j)).map(new w9j() { // from class: l.fum
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return InstaLikePickerAct.m62254B2((List) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.gum
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104419a.m62303c3((q860) obj);
            }
        }));
        act().getSupportLoaderManager().mo3088e(0, null, dmxVar);
    }

    /* JADX INFO: renamed from: r */
    private void m62277r() {
        if (!this.f40341w) {
            this.f40337s.setVisibility(8);
        }
        m62308j3();
        m62289M2();
        m62258L2();
        int i = this.f40340v;
        VText vText = this.f40335q;
        if (i == 1) {
            vText.setVisibility(8);
        } else {
            vText.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: u2 */
    public static /* synthetic */ q860 m62280u2(List list) {
        return new q860(vwb.m200303Q(list, new w9j() { // from class: l.hum
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return iti.m138200b((nuh0) obj);
            }
        }), null);
    }

    /* JADX INFO: renamed from: y2 */
    public static /* synthetic */ Media m62283y2(Video video) {
        return video;
    }

    /* JADX INFO: renamed from: D2 */
    public View m62285D2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uum.m195382b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: F2 */
    public void m62286F2(Media media, int i) {
        if (this.f40324E) {
            if (!this.f54611g.containsKey(media.url) || this.f54610f == this.f54611g.get(media.url).intValue()) {
                boolean zContainsKey = this.f54611g.containsKey(media.url);
                Map<String, Integer> map = this.f54611g;
                if (zContainsKey) {
                    if (map.size() == 1) {
                        return;
                    }
                    this.f40321B.remove(media.url);
                    ArrayList arrayList = new ArrayList(this.f54611g.keySet());
                    int iIndexOf = arrayList.indexOf(media.url);
                    if (arrayList.size() == 1) {
                        this.f40322C = media.url;
                        this.f40326G.notifyItemChanged(i);
                    } else {
                        int i2 = iIndexOf + 1;
                        if (arrayList.size() == i2) {
                            String str = (String) arrayList.get(iIndexOf - 1);
                            this.f40322C = str;
                            this.f54610f = this.f54611g.get(str).intValue();
                            this.f40326G.notifyItemChanged(i);
                            this.f40326G.notifyItemChanged(this.f54610f);
                        } else {
                            this.f40322C = (String) arrayList.get(i2);
                            this.f40326G.notifyItemChanged(i);
                            while (iIndexOf < arrayList.size()) {
                                this.f40326G.notifyItemChanged(this.f54611g.get(arrayList.get(iIndexOf)).intValue());
                                iIndexOf++;
                            }
                        }
                    }
                    this.f54610f = this.f54611g.get(this.f40322C).intValue();
                    this.f40334p.m62245S(Uri.fromFile(new File(rhi.m179382z(this.f40322C))), this.f40321B.get(this.f40322C));
                    this.f54611g.remove(media.url);
                } else {
                    if (map.size() == this.f40340v) {
                        lsi0.m151578h(R$string.f39098l3);
                        return;
                    }
                    this.f40321B.put(this.f40322C, this.f40334p.f40301w);
                    this.f40326G.notifyItemChanged(this.f54610f);
                    this.f54610f = i;
                    this.f40322C = media.url;
                    this.f40334p.setImageUri(Uri.fromFile(new File(rhi.m179382z(media.url))));
                    this.f54611g.put(media.url, Integer.valueOf(i));
                    this.f40326G.notifyItemChanged(this.f54610f);
                }
            } else {
                this.f40321B.put(this.f40322C, this.f40334p.f40301w);
                this.f40334p.m62245S(Uri.fromFile(new File(rhi.m179382z(media.url))), this.f40321B.get(media.url));
                this.f40326G.notifyItemChanged(this.f54610f);
                this.f40326G.notifyItemChanged(i);
                this.f54610f = i;
                this.f40322C = media.url;
            }
        } else {
            if (this.f54610f == i) {
                return;
            }
            this.f40334p.setImageUri(Uri.fromFile(new File(rhi.m179382z(media.url))));
            this.f40326G.notifyItemChanged(i);
            this.f40326G.notifyItemChanged(this.f54610f);
            this.f54610f = i;
            this.f40322C = media.url;
        }
        this.f40330l.m62202g();
        e51.m114743H(this, new Runnable() { // from class: l.oum
            @Override // java.lang.Runnable
            public final void run() {
                this.f145713a.m62290N2();
            }
        }, 300L);
    }

    @Override // com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct.InterfaceC13127a
    /* JADX INFO: renamed from: G */
    public int mo47791G() {
        return this.f54610f;
    }

    /* JADX INFO: renamed from: H2 */
    public void m62287H2(Media media, int i) {
        if (this.f54610f == i) {
            return;
        }
        if ((media instanceof Video) && ((Video) media).duration > 16000.0f) {
            lsi0.m151580j(String.format(getString(R$string.f39008Y2), String.valueOf(15)));
            return;
        }
        this.f40328I.m66536r(true);
        this.f40328I.m66533F(media);
        this.f40328I.m66532E();
        this.f40326G.notifyItemChanged(i);
        this.f40326G.notifyItemChanged(this.f54610f);
        this.f54610f = i;
        this.f40322C = media.url;
        this.f40323D = media;
    }

    /* JADX INFO: renamed from: K2 */
    public final void m62288K2() {
        final ArrayList arrayList = new ArrayList();
        nqh0 nqh0Var = this.f54609e;
        nqh0 nqh0Var2 = this.f54607c;
        if (nqh0Var == nqh0Var2) {
            if (nqh0Var2.f140066a.f153135a.size() <= 0) {
                lsi0.m151580j("目前没有图片，可以先去拍照");
                return;
            }
            final e01 e01Var = new e01();
            e01Var.putAll(this.f40321B);
            e01Var.put(this.f40322C, this.f40334p.f40301w);
            progress(R$string.f38984U2);
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(this.f54611g);
            linkedHashMap.put(this.f40322C, Integer.valueOf(this.f54610f));
            e51.m114774y(new Runnable() { // from class: l.pum
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f151318a.m62292R2(linkedHashMap, e01Var, arrayList);
                }
            });
            return;
        }
        Media media = this.f40323D;
        if (media instanceof Video) {
            if (((Video) media).duration > 16000.0f) {
                lsi0.m151580j(String.format(getString(R$string.f39008Y2), String.valueOf(15)));
                return;
            }
            Video video = (Video) media;
            boolean z = this.f40325F;
            video.isFromNewCamera = z;
            video.hasOriginalSound = z;
            arrayList.add(media);
            if (arrayList.size() > 0) {
                Intent intent = new Intent();
                intent.putExtra(MediaPickerBaseAct.f54603h, arrayList);
                setResult(-1, intent);
                lambda$debugItems$19();
            }
        }
    }

    /* JADX INFO: renamed from: M2 */
    public final void m62289M2() {
        act().setSupportActionBar(this.f40331m);
        act().getSupportActionBar().mo134136w(true);
        act().getSupportActionBar().mo134139z(false);
        this.f40331m.setNavigationOnClickListener(new View.OnClickListener() { // from class: l.ytm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199996a.m62300Z2(view);
            }
        });
        Drawable drawable = act().getResources().getDrawable(f3c0.f94472a);
        drawable.setColorFilter(RoundedDrawable.DEFAULT_BORDER_COLOR, PorterDuff.Mode.SRC_ATOP);
        this.f40332n.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        getSupportActionBar().mo134112B(f3c0.f94359J6);
    }

    /* JADX INFO: renamed from: N2 */
    public final /* synthetic */ void m62290N2() {
        this.f40343y.scrollToPositionWithOffset(this.f54610f, 0);
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m62291Q2(ArrayList arrayList) {
        if (isFinishing()) {
            return;
        }
        act().progressDismiss();
        if (arrayList.size() <= 0) {
            lsi0.m151578h(R$string.f39039d0);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(MediaPickerBaseAct.f54603h, arrayList);
        setResult(-1, intent);
        lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: R2 */
    public final /* synthetic */ void m62292R2(Map map, Map map2, final ArrayList arrayList) throws Throwable {
        for (String str : map.keySet()) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    Bitmap bitmapM62257I2 = m62257I2(act(), (InstaCropperView.C11217f) map2.get(str), Uri.fromFile(new File(rhi.m179382z(str))));
                    File fileM145083O = k9j.m145083O("jpg");
                    FileOutputStream fileOutputStream2 = new FileOutputStream(fileM145083O);
                    try {
                        bitmapM62257I2.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream2);
                        n6f.m158040b(Uri.parse(str).getPath(), fileM145083O.getAbsolutePath(), false);
                        fileOutputStream2.flush();
                        Picture picture = new Picture();
                        picture.mediaType = "image/*";
                        picture.url = rhi.m179355B(fileM145083O.getPath());
                        picture.status = MediaLocalStatus.get("raw");
                        arrayList.add(picture);
                        t95.m187604b(fileOutputStream2);
                    } catch (FileNotFoundException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        CrashHelper.m81296c(e);
                        lsi0.m151578h(R$string.f38939N);
                        t95.m187604b(fileOutputStream);
                    } catch (IOException e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        CrashHelper.m81296c(e);
                        lsi0.m151578h(R$string.f38939N);
                        t95.m187604b(fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        t95.m187604b(fileOutputStream);
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
        e51.m114742G(new Runnable() { // from class: l.ztm
            @Override // java.lang.Runnable
            public final void run() {
                this.f204739a.m62291Q2(arrayList);
            }
        });
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ void m62294T2(View view) {
        if (this.f54609e == this.f54607c) {
            return;
        }
        m62309k3();
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m62295U2(View view) {
        if (this.f54609e == this.f54608d) {
            return;
        }
        m62310m3();
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m62296V2(View view) {
        if (this.f40344z == null) {
            RecyclerView recyclerView = new RecyclerView(act());
            this.f40344z = recyclerView;
            recyclerView.setMinimumHeight(t100.m186890d(300.0f));
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
            linearLayoutManager.setReverseLayout(true);
            this.f40344z.setLayoutManager(linearLayoutManager);
            this.f40344z.setBackgroundColor(-1);
        }
        C11220c c11220c = new C11220c();
        this.f40320A = c11220c;
        this.f40344z.setAdapter(c11220c);
        this.f40320A.m62313G(this.f54609e.f140067b);
        if (NullChecker.m81303a(this.f40327H)) {
            this.f40327H.dismiss();
        }
        DialogC11240a dialogC11240a = new DialogC11240a(this);
        this.f40327H = dialogC11240a;
        dialogC11240a.setContentView(this.f40344z);
        this.f40327H.show();
        this.f40344z.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: W2 */
    public final /* synthetic */ void m62297W2(View view) {
        m62307i3(!this.f40324E);
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m62298X2(Bundle bundle) {
        m62277r();
        if (zqx.m219898k()) {
            new zqx().m219899d(act(), act().findViewById(b5c0.f73579j1), new d30() { // from class: l.rum
                @Override // p149l.d30
                public final void call() {
                    this.f161078a.m62293S2();
                }
            }, null, null, null, null);
        } else {
            PermissionHelper.m79882c().m79900r("android.permission.READ_EXTERNAL_STORAGE").m79905w(false).m79903u(true).m79897o(new d30() { // from class: l.sum
                @Override // p149l.d30
                public final void call() {
                    this.f166486a.m62293S2();
                }
            }).m79891i(this);
        }
        this.f40338t.setOnClickListener(new View.OnClickListener() { // from class: l.utm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178278a.m62294T2(view);
            }
        });
        this.f40339u.setOnClickListener(new View.OnClickListener() { // from class: l.vtm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182988a.m62295U2(view);
            }
        });
        this.f40332n.setOnClickListener(new View.OnClickListener() { // from class: l.wtm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188029a.m62296V2(view);
            }
        });
        this.f40335q.setOnClickListener(new View.OnClickListener() { // from class: l.xtm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194418a.m62297W2(view);
            }
        });
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ void m62299Y2() {
        removeCallbacks(this.f40329J);
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m62300Z2(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: renamed from: a3 */
    public final /* synthetic */ void m62301a3(q860 q860Var) {
        this.f54607c.f140067b = q860Var;
    }

    @Override // com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct.InterfaceC13127a
    /* JADX INFO: renamed from: b */
    public void mo47792b(iti itiVar) {
        nqh0 nqh0Var = this.f54609e;
        nqh0Var.f140068c = itiVar;
        q860<Media> q860Var = itiVar == null ? nqh0Var.f140066a : itiVar.f114886c;
        this.f40326G.m62316G(q860Var);
        this.f54609e.f140070e.scrollToPosition(0);
        post(new Runnable() { // from class: l.ttm
            @Override // java.lang.Runnable
            public final void run() {
                this.f172035a.m62306g3();
            }
        });
        if (NullChecker.m81303a(this.f40327H)) {
            this.f40327H.dismiss();
            this.f40327H = null;
        }
        if (!this.f40342x.equals(TYPE.IMAGES)) {
            if (!this.f40342x.equals(TYPE.VIDEOS) || q860Var.f153135a.size() <= 0) {
                return;
            }
            this.f40328I.m66536r(true);
            this.f54610f = 0;
            this.f40322C = q860Var.f153135a.get(0).url;
            this.f40323D = q860Var.f153135a.get(0);
            this.f40328I.m66533F(q860Var.f153135a.get(0));
            this.f40328I.m66532E();
            return;
        }
        if (q860Var.f153135a.size() > 0) {
            this.f54610f = 0;
            this.f40322C = q860Var.f153135a.get(0).url;
            this.f40334p.setImageUri(Uri.fromFile(new File(rhi.m179382z(this.f40322C))));
            for (int i = 0; i < q860Var.f153135a.size(); i++) {
                Media media = q860Var.f153135a.get(i);
                if (this.f54611g.containsKey(media.url)) {
                    this.f54611g.put(media.url, Integer.valueOf(i));
                }
            }
        }
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ void m62302b3(List list) {
        this.f54608d.f140066a = new q860<>(vwb.m200303Q(list, new w9j() { // from class: l.ium
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return InstaLikePickerAct.m62283y2((Video) obj);
            }
        }), null);
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m62303c3(q860 q860Var) {
        this.f54608d.f140067b = q860Var;
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m62304d3(List list) {
        this.f54607c.f140066a = new q860<>(vwb.m200303Q(list, new w9j() { // from class: l.kum
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return InstaLikePickerAct.m62260a2((Picture) obj);
            }
        }), null);
        m62309k3();
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ Boolean m62305f3() {
        Iterator it = vwb.m200339n(xdl0.m208399s(this.f40331m), new w9j() { // from class: l.qum
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) instanceof ActionMenuItemView);
            }
        }).iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) ((View) it.next());
            if (!TextUtils.isEmpty(textView.getText())) {
                textView.setTypeface(eqh0.m117752c(3));
                textView.setTextColor(Color.parseColor("#f55a43"));
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ void m62306g3() {
        this.f54609e.f140070e.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: i3 */
    public final void m62307i3(boolean z) {
        if (this.f54607c.f140066a.f153135a.size() < 2) {
            return;
        }
        if (z) {
            this.f40335q.setBackgroundDrawable(getResources().getDrawable(f3c0.f94623s6));
            this.f40324E = true;
            if (NullChecker.m81303a(this.f40322C)) {
                this.f54611g.put(this.f40322C, Integer.valueOf(this.f54610f));
            }
            this.f54607c.f140069d.notifyDataSetChanged();
            this.f40334p.setFitView(true);
            return;
        }
        this.f54611g.clear();
        this.f40321B.clear();
        this.f40335q.setBackgroundDrawable(getResources().getDrawable(f3c0.f94615r6));
        this.f40324E = false;
        this.f54607c.f140069d.notifyDataSetChanged();
        this.f40334p.setFitView(false);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m62285D2(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.eum
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93258a.m62298X2((Bundle) obj);
            }
        }, new d30() { // from class: l.lum
            @Override // p149l.d30
            public final void call() {
                this.f130074a.m62299Y2();
            }
        });
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
    /* JADX INFO: renamed from: j3 */
    public final void m62308j3() {
        int iM186890d = t100.m186890d(48.0f) + xdl0.m208412y0();
        int iM186890d2 = t100.m186890d(48.0f);
        this.f40330l.m62200e(iM186890d, iM186890d2);
        this.f40333o.getLayoutParams().height = xdl0.m208412y0();
        PictureView pictureView = (PictureView) LayoutInflater.from(this.act).inflate(o6c0.f142224k1, (ViewGroup) this.f40333o, false);
        this.f40328I = pictureView;
        pictureView.f43569e.setAlpha(0.0f);
        PictureView pictureView2 = this.f40328I;
        pictureView2.f43563A = 200;
        pictureView2.f43590z = 0.0f;
        pictureView2.setOnClickListener(pictureView2);
        this.f40328I.m66537u(false);
        this.f40333o.addView(this.f40328I);
        this.f40328I.setVisibility(8);
        this.f40336r.getLayoutParams().height = xdl0.m208408w0() - iM186890d2;
        C11221d c11221d = new C11221d();
        this.f40326G = c11221d;
        this.f40336r.setAdapter(c11221d);
        nqh0 nqh0Var = this.f54607c;
        nqh0 nqh0Var2 = this.f54608d;
        C11221d c11221d2 = this.f40326G;
        nqh0Var2.f140069d = c11221d2;
        nqh0Var.f140069d = c11221d2;
        CoordinatorRecyclerView coordinatorRecyclerView = this.f40336r;
        nqh0Var2.f140070e = coordinatorRecyclerView;
        nqh0Var.f140070e = coordinatorRecyclerView;
        this.f40330l.getLayoutParams().height = (iM186890d + xdl0.m208408w0()) - iM186890d2;
        this.f40336r.setCoordinatorListener(this.f40330l);
        this.f40336r.addOnScrollListener(new C11218a());
    }

    /* JADX INFO: renamed from: k3 */
    public final void m62309k3() {
        this.f40342x = TYPE.IMAGES;
        this.f40332n.setText(getString(R$string.f39084j3));
        this.f40338t.m62186l(true);
        this.f40339u.m62186l(false);
        this.f40334p.setVisibility(0);
        int i = this.f40340v;
        VText vText = this.f40335q;
        if (i == 1) {
            vText.setVisibility(8);
        } else {
            vText.setVisibility(0);
        }
        this.f40328I.m66531D();
        this.f40328I.setVisibility(8);
        nqh0 nqh0Var = this.f54607c;
        this.f54609e = nqh0Var;
        this.f40326G.m62316G(nqh0Var.f140066a);
        if (this.f54607c.f140066a.f153135a.size() > 0) {
            this.f54610f = 0;
            this.f40322C = this.f54607c.f140066a.f153135a.get(0).url;
            this.f40334p.setImageUri(Uri.fromFile(new File(rhi.m179382z(this.f40322C))));
        }
        removeCallbacks(this.f40329J);
    }

    /* JADX INFO: renamed from: m3 */
    public final void m62310m3() {
        this.f40342x = TYPE.VIDEOS;
        m62307i3(false);
        this.f40332n.setText(getString(R$string.f39091k3));
        this.f40338t.m62186l(false);
        this.f40339u.m62186l(true);
        this.f40328I.setVisibility(0);
        this.f40335q.setVisibility(8);
        this.f40334p.setVisibility(8);
        nqh0 nqh0Var = this.f54608d;
        this.f54609e = nqh0Var;
        this.f40326G.m62316G(nqh0Var.f140066a);
        if (this.f54608d.f140066a.f153135a.size() > 0) {
            this.f54610f = 0;
            this.f40322C = this.f54608d.f140066a.f153135a.get(0).url;
            this.f40323D = this.f54608d.f140066a.f153135a.get(0);
            this.f40328I.m66533F(this.f54608d.f140066a.f153135a.get(0));
            postDelayed(this.f40329J, 200L);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, b5c0.f73506O0, 1, actionItemPadding(string(R$string.f39101m))).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.mum
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f135802a.m62265e3(menuItem);
            }
        }).setShowAsAction(2);
        xdl0.m208366b0(findViewById(R.id.content), new v9j() { // from class: l.num
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f140641a.m62305f3();
            }
        });
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        if (NullChecker.m81304b(this.f40328I)) {
            this.f40328I.m66536r(true);
        }
        super.onDestroyLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        if (NullChecker.m81304b(this.f40328I)) {
            this.f40328I.m66531D();
        }
        super.onPauseLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f40340v = getIntent().getIntExtra("imageCount", 9);
        this.f40341w = getIntent().getBooleanExtra("hasVideo", true);
        this.f40325F = getIntent().getBooleanExtra("isInCameraGroup", false);
    }

    @Override // com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct.InterfaceC13127a
    /* JADX INFO: renamed from: x */
    public Map<String, Integer> mo47800x() {
        return this.f54611g;
    }

    @Override // com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct.InterfaceC13127a
    /* JADX INFO: renamed from: y */
    public void mo47801y(Media media, int i) {
        if (this.f54609e == this.f54607c) {
            m62286F2(media, i);
        } else {
            m62287H2(media, i);
        }
    }
}
