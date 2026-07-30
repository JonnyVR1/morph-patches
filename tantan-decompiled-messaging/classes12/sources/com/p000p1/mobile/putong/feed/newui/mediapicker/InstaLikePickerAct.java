package com.p000p1.mobile.putong.feed.newui.mediapicker;

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
import com.p000p1.mobile.putong.data.DbLinks;
import com.p000p1.mobile.putong.data.GivenGiftBrief;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.mediapicker.InstaLikePickerAct;
import com.p000p1.mobile.putong.feed.newui.mediapicker.picker.FeedFolderItemView;
import com.p000p1.mobile.putong.feed.p005ui.PictureView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
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
import l.d30;
import l.dac0;
import l.e01;
import l.e30;
import l.e51;
import l.eqh0;
import l.fub;
import l.iti;
import l.jo0;
import l.k9j;
import l.lsi0;
import l.mkd0;
import l.n6f;
import l.nqh0;
import l.nuh0;
import l.q860;
import l.rhi;
import l.t100;
import l.t95;
import l.v4e;
import l.v9j;
import l.vwb;
import l.w4e;
import l.w9j;
import l.x4e;
import l.xdl0;
import l.ya5;
import l.zqx;
import p007l.b5c0;
import p007l.dmx;
import p007l.emf0;
import p007l.f3c0;
import p007l.o6c0;
import p007l.uum;
import rx.schedulers.Schedulers;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class InstaLikePickerAct extends MediaPickerBaseAct implements MediaPickerBaseAct.a {

    /* JADX INFO: renamed from: A */
    public C2064c f1781A;

    /* JADX INFO: renamed from: C */
    public String f1783C;

    /* JADX INFO: renamed from: D */
    public Media f1784D;

    /* JADX INFO: renamed from: G */
    public C2065d f1787G;

    /* JADX INFO: renamed from: H */
    public C2084a f1788H;

    /* JADX INFO: renamed from: I */
    public PictureView f1789I;

    /* JADX INFO: renamed from: l */
    public CoordinatorLinearLayout f1791l;

    /* JADX INFO: renamed from: m */
    public Toolbar f1792m;

    /* JADX INFO: renamed from: n */
    public TextView f1793n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f1794o;

    /* JADX INFO: renamed from: p */
    public InstaCropperView f1795p;

    /* JADX INFO: renamed from: q */
    public VText f1796q;

    /* JADX INFO: renamed from: r */
    public CoordinatorRecyclerView f1797r;

    /* JADX INFO: renamed from: s */
    public LinearLayout f1798s;

    /* JADX INFO: renamed from: t */
    public BottomLineTextView f1799t;

    /* JADX INFO: renamed from: u */
    public BottomLineTextView f1800u;

    /* JADX INFO: renamed from: y */
    public GridLayoutManager f1804y;

    /* JADX INFO: renamed from: z */
    public RecyclerView f1805z;

    /* JADX INFO: renamed from: v */
    public int f1801v = 9;

    /* JADX INFO: renamed from: w */
    public boolean f1802w = true;

    /* JADX INFO: renamed from: x */
    public TYPE f1803x = TYPE.IMAGES;

    /* JADX INFO: renamed from: B */
    public Map<String, InstaCropperView.C2061f> f1782B = new e01();

    /* JADX INFO: renamed from: E */
    public boolean f1785E = false;

    /* JADX INFO: renamed from: F */
    public boolean f1786F = false;

    /* JADX INFO: renamed from: J */
    public Runnable f1790J = new RunnableC2063b();

    public enum TYPE {
        IMAGES,
        VIDEOS
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaLikePickerAct$a */
    public class C2062a extends RecyclerView.t {

        /* JADX INFO: renamed from: a */
        public int f1806a = 0;

        public C2062a() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (this.f1806a == 0) {
                return;
            }
            this.f1806a = 0;
            if (i == 0 && InstaLikePickerAct.this.f1797r.getLayoutManager().findFirstCompletelyVisibleItemPosition() == 0) {
                InstaLikePickerAct.this.f1791l.m3184g();
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            this.f1806a = i2;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaLikePickerAct$b */
    public class RunnableC2063b implements Runnable {
        public RunnableC2063b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (InstaLikePickerAct.this.act().hasWindowFocus() && NullChecker.b(InstaLikePickerAct.this.f1789I) && InstaLikePickerAct.this.f1789I.getVisibility() == 0) {
                InstaLikePickerAct.this.f1789I.m7707E();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaLikePickerAct$c */
    public class C2064c extends dac0<iti> {

        /* JADX INFO: renamed from: c */
        public q860<iti> f1809c;

        public C2064c() {
            this.f1809c = q860.a();
        }

        /* JADX INFO: renamed from: C */
        public int m3298C() {
            return this.f1809c.a.size() + 1;
        }

        /* JADX INFO: renamed from: D */
        public View m3299D(ViewGroup viewGroup, int i) {
            return InstaLikePickerAct.this.inflater().inflate(o6c0.f11236j1, viewGroup, false);
        }

        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void m3297A(View view, iti itiVar, int i, int i2) {
            ((FeedFolderItemView) view).m3675c(itiVar, i2 == 0, ((MediaPickerBaseAct) InstaLikePickerAct.this).e.a.a.size(), ((MediaPickerBaseAct) InstaLikePickerAct.this).e.a.a.size() > 0 ? (Media) ((MediaPickerBaseAct) InstaLikePickerAct.this).e.a.a.get(0) : null, InstaLikePickerAct.this);
        }

        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public iti getItem(int i) {
            if (i == 0) {
                return null;
            }
            return (iti) this.f1809c.a.get(i - 1);
        }

        /* JADX INFO: renamed from: G */
        public void m3302G(q860<iti> q860Var) {
            this.f1809c = q860Var;
            notifyDataSetChanged();
        }

        public long getItemId(int i) {
            return i;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.InstaLikePickerAct$d */
    public class C2065d extends dac0<Media> {

        /* JADX INFO: renamed from: c */
        public q860<Media> f1811c;

        public C2065d() {
            this.f1811c = q860.a();
        }

        /* JADX INFO: renamed from: C */
        public int m3304C() {
            return this.f1811c.a.size();
        }

        /* JADX INFO: renamed from: D */
        public View m3305D(ViewGroup viewGroup, int i) {
            return InstaLikePickerAct.this.inflater().inflate(o6c0.f11163Y3, viewGroup, false);
        }

        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void m3303A(View view, Media media, int i, int i2) {
            InstaLikePickerAct instaLikePickerAct = InstaLikePickerAct.this;
            ((InstaMediaItemView) view).m3311c(media, i2, instaLikePickerAct.f1785E, instaLikePickerAct);
        }

        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public Media getItem(int i) {
            return (Media) this.f1811c.a.get(i);
        }

        /* JADX INFO: renamed from: G */
        public void m3308G(q860<Media> q860Var) {
            this.f1811c = q860Var;
            notifyDataSetChanged();
        }

        public long getItemId(int i) {
            return i;
        }
    }

    /* JADX INFO: renamed from: B2 */
    public static /* synthetic */ q860 m3236B2(List list) {
        return new q860(vwb.Q(list, new w9j() { // from class: l.jum
            public final Object call(Object obj) {
                return iti.b((nuh0) obj);
            }
        }), (DbLinks) null);
    }

    /* JADX INFO: renamed from: E2 */
    public static Intent m3238E2(Context context, int i, boolean z, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) InstaLikePickerAct.class);
        intent.putExtra("imageCount", i);
        intent.putExtra("hasVideo", z);
        intent.putExtra("isInCameraGroup", z2);
        return intent;
    }

    /* JADX INFO: renamed from: I2 */
    public static Bitmap m3239I2(Context context, InstaCropperView.C2061f c2061f, Uri uri) {
        BitmapFactory.Options options;
        int i;
        int i2;
        if (NullChecker.a(c2061f)) {
            options = new BitmapFactory.Options();
            options.inSampleSize = 1;
            int i3 = (c2061f.f1777g - c2061f.f1775e) * (c2061f.f1778h - c2061f.f1776f);
            int i4 = c2061f.f1779i * c2061f.f1780j * 4;
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
            Bitmap bitmapH = ya5.H(context, uri, options);
            if (bitmapH == null) {
                return null;
            }
            Bitmap bitmapC = fub.c(context, uri, bitmapH);
            if (!NullChecker.a(c2061f)) {
                int width = bitmapC.getWidth();
                int height = bitmapC.getHeight();
                int i7 = 0;
                if (width >= height) {
                    i7 = (width - height) / 2;
                    width = height;
                    i = 0;
                } else {
                    i = (height - width) / 2;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapC, i7, i, width, width);
                if (bitmapC != bitmapCreateBitmap) {
                    bitmapC.recycle();
                }
                return bitmapCreateBitmap;
            }
            int i8 = c2061f.f1775e;
            int i9 = options.inSampleSize;
            int i10 = i8 / i9;
            c2061f.f1775e = i10;
            int i11 = c2061f.f1776f / i9;
            c2061f.f1776f = i11;
            int i12 = c2061f.f1777g / i9;
            c2061f.f1777g = i12;
            int i13 = c2061f.f1778h / i9;
            c2061f.f1778h = i13;
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapC, i10, i11, i14, i15);
            if (bitmapC != bitmapCreateBitmap2) {
                bitmapC.recycle();
            }
            int i16 = c2061f.f1779i;
            if (i14 <= i16 && i15 <= c2061f.f1780j) {
                return bitmapCreateBitmap2;
            }
            Bitmap bitmapP = ya5.P(bitmapCreateBitmap2, i16, c2061f.f1780j);
            bitmapCreateBitmap2.recycle();
            return bitmapP;
        } catch (Throwable th) {
            CrashHelper.c(new Throwable("MakeDrawableTask cropImageAndResize: " + th.getMessage(), th));
            return null;
        }
    }

    /* JADX INFO: renamed from: L2 */
    private void m3240L2() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), 4);
        this.f1804y = gridLayoutManager;
        gridLayoutManager.setSmoothScrollbarEnabled(true);
        this.f1797r.setLayoutManager(this.f1804y);
        this.f1797r.addItemDecoration(new emf0(t100.d(2.0f), 4));
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ Media m3242a2(Picture picture) {
        return picture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e3 */
    public /* synthetic */ boolean m3247e3(MenuItem menuItem) {
        m3271K2();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public void m3276S2() {
        dmx dmxVar = new dmx(act(), true, true);
        dmxVar.m9518v().distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.aum
            public final void call(Object obj) {
                this.f5857a.m3288d3((List) obj);
            }
        }));
        dmxVar.m9518v().distinctUntilChanged().observeOn(Schedulers.io()).compose(dmx.m9509p(MediaPickerBaseAct.i)).map(new w9j() { // from class: l.bum
            public final Object call(Object obj) {
                return InstaLikePickerAct.m3262u2((List) obj);
            }
        }).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.cum
            public final void call(Object obj) {
                this.f6732a.m3284a3((q860) obj);
            }
        }));
        dmxVar.m9519w().subscribe(mkd0.G(new e30() { // from class: l.dum
            public final void call(Object obj) {
                this.f7066a.m3286b3((List) obj);
            }
        }));
        dmxVar.m9519w().observeOn(Schedulers.io()).compose(dmx.m9509p(MediaPickerBaseAct.j)).map(new w9j() { // from class: l.fum
            public final Object call(Object obj) {
                return InstaLikePickerAct.m3236B2((List) obj);
            }
        }).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.gum
            public final void call(Object obj) {
                this.f8521a.m3287c3((q860) obj);
            }
        }));
        act().getSupportLoaderManager().e(0, (Bundle) null, dmxVar);
    }

    /* JADX INFO: renamed from: r */
    private void m3259r() {
        if (!this.f1802w) {
            this.f1798s.setVisibility(8);
        }
        m3292j3();
        m3272M2();
        m3240L2();
        int i = this.f1801v;
        VText vText = this.f1796q;
        if (i == 1) {
            vText.setVisibility(8);
        } else {
            vText.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: u2 */
    public static /* synthetic */ q860 m3262u2(List list) {
        return new q860(vwb.Q(list, new w9j() { // from class: l.hum
            public final Object call(Object obj) {
                return iti.b((nuh0) obj);
            }
        }), (DbLinks) null);
    }

    /* JADX INFO: renamed from: y2 */
    public static /* synthetic */ Media m3265y2(Video video) {
        return video;
    }

    /* JADX INFO: renamed from: D2 */
    public View m3267D2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uum.m15140b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F2 */
    public void m3268F2(Media media, int i) {
        if (this.f1785E) {
            if (!((MediaPickerBaseAct) this).g.containsKey(media.url) || ((MediaPickerBaseAct) this).f == ((Integer) ((MediaPickerBaseAct) this).g.get(media.url)).intValue()) {
                boolean zContainsKey = ((MediaPickerBaseAct) this).g.containsKey(media.url);
                Map map = ((MediaPickerBaseAct) this).g;
                if (zContainsKey) {
                    if (map.size() == 1) {
                        return;
                    }
                    this.f1782B.remove(media.url);
                    ArrayList arrayList = new ArrayList(((MediaPickerBaseAct) this).g.keySet());
                    int iIndexOf = arrayList.indexOf(media.url);
                    if (arrayList.size() == 1) {
                        this.f1783C = media.url;
                        this.f1787G.notifyItemChanged(i);
                    } else {
                        int i2 = iIndexOf + 1;
                        if (arrayList.size() == i2) {
                            String str = (String) arrayList.get(iIndexOf - 1);
                            this.f1783C = str;
                            ((MediaPickerBaseAct) this).f = ((Integer) ((MediaPickerBaseAct) this).g.get(str)).intValue();
                            this.f1787G.notifyItemChanged(i);
                            this.f1787G.notifyItemChanged(((MediaPickerBaseAct) this).f);
                        } else {
                            this.f1783C = (String) arrayList.get(i2);
                            this.f1787G.notifyItemChanged(i);
                            while (iIndexOf < arrayList.size()) {
                                this.f1787G.notifyItemChanged(((Integer) ((MediaPickerBaseAct) this).g.get(arrayList.get(iIndexOf))).intValue());
                                iIndexOf++;
                            }
                        }
                    }
                    ((MediaPickerBaseAct) this).f = ((Integer) ((MediaPickerBaseAct) this).g.get(this.f1783C)).intValue();
                    this.f1795p.m3227S(Uri.fromFile(new File(rhi.z(this.f1783C))), this.f1782B.get(this.f1783C));
                    ((MediaPickerBaseAct) this).g.remove(media.url);
                } else {
                    if (map.size() == this.f1801v) {
                        lsi0.h(R$string.f559l3);
                        return;
                    }
                    this.f1782B.put(this.f1783C, this.f1795p.f1762w);
                    this.f1787G.notifyItemChanged(((MediaPickerBaseAct) this).f);
                    ((MediaPickerBaseAct) this).f = i;
                    this.f1783C = media.url;
                    this.f1795p.setImageUri(Uri.fromFile(new File(rhi.z(media.url))));
                    ((MediaPickerBaseAct) this).g.put(media.url, Integer.valueOf(i));
                    this.f1787G.notifyItemChanged(((MediaPickerBaseAct) this).f);
                }
            } else {
                this.f1782B.put(this.f1783C, this.f1795p.f1762w);
                this.f1795p.m3227S(Uri.fromFile(new File(rhi.z(media.url))), this.f1782B.get(media.url));
                this.f1787G.notifyItemChanged(((MediaPickerBaseAct) this).f);
                this.f1787G.notifyItemChanged(i);
                ((MediaPickerBaseAct) this).f = i;
                this.f1783C = media.url;
            }
        } else {
            if (((MediaPickerBaseAct) this).f == i) {
                return;
            }
            this.f1795p.setImageUri(Uri.fromFile(new File(rhi.z(media.url))));
            this.f1787G.notifyItemChanged(i);
            this.f1787G.notifyItemChanged(((MediaPickerBaseAct) this).f);
            ((MediaPickerBaseAct) this).f = i;
            this.f1783C = media.url;
        }
        this.f1791l.m3184g();
        e51.H(this, new Runnable() { // from class: l.oum
            @Override // java.lang.Runnable
            public final void run() {
                this.f11621a.m3273N2();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: G */
    public int m3269G() {
        return ((MediaPickerBaseAct) this).f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H2 */
    public void m3270H2(Media media, int i) {
        if (((MediaPickerBaseAct) this).f == i) {
            return;
        }
        if ((media instanceof Video) && ((Video) media).duration > 16000.0f) {
            lsi0.j(String.format(getString(R$string.f469Y2), String.valueOf(15)));
            return;
        }
        this.f1789I.m7713r(true);
        this.f1789I.m7708F(media);
        this.f1789I.m7707E();
        this.f1787G.notifyItemChanged(i);
        this.f1787G.notifyItemChanged(((MediaPickerBaseAct) this).f);
        ((MediaPickerBaseAct) this).f = i;
        this.f1783C = media.url;
        this.f1784D = media;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K2 */
    public final void m3271K2() {
        final ArrayList arrayList = new ArrayList();
        nqh0 nqh0Var = ((MediaPickerBaseAct) this).e;
        nqh0 nqh0Var2 = ((MediaPickerBaseAct) this).c;
        if (nqh0Var == nqh0Var2) {
            if (nqh0Var2.a.a.size() <= 0) {
                lsi0.j("目前没有图片，可以先去拍照");
                return;
            }
            final e01 e01Var = new e01();
            e01Var.putAll(this.f1782B);
            e01Var.put(this.f1783C, this.f1795p.f1762w);
            progress(R$string.f445U2);
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(((MediaPickerBaseAct) this).g);
            linkedHashMap.put(this.f1783C, Integer.valueOf(((MediaPickerBaseAct) this).f));
            e51.y(new Runnable() { // from class: l.pum
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f11985a.m3275R2(linkedHashMap, e01Var, arrayList);
                }
            });
            return;
        }
        Media media = this.f1784D;
        if (media instanceof Video) {
            if (((Video) media).duration > 16000.0f) {
                lsi0.j(String.format(getString(R$string.f469Y2), String.valueOf(15)));
                return;
            }
            Video video = (Video) media;
            boolean z = this.f1786F;
            video.isFromNewCamera = z;
            video.hasOriginalSound = z;
            arrayList.add(media);
            if (arrayList.size() > 0) {
                Intent intent = new Intent();
                intent.putExtra(MediaPickerBaseAct.h, arrayList);
                setResult(-1, intent);
                finish();
            }
        }
    }

    /* JADX INFO: renamed from: M2 */
    public final void m3272M2() {
        act().setSupportActionBar(this.f1792m);
        act().getSupportActionBar().w(true);
        act().getSupportActionBar().z(false);
        this.f1792m.setNavigationOnClickListener(new View.OnClickListener() { // from class: l.ytm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15501a.m3283Z2(view);
            }
        });
        Drawable drawable = act().getResources().getDrawable(f3c0.f7755a);
        drawable.setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
        this.f1793n.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        getSupportActionBar().B(f3c0.f7642J6);
    }

    /* JADX INFO: renamed from: N2 */
    public final /* synthetic */ void m3273N2() {
        this.f1804y.scrollToPositionWithOffset(((MediaPickerBaseAct) this).f, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m3274Q2(ArrayList arrayList) {
        if (isFinishing()) {
            return;
        }
        act().progressDismiss();
        if (arrayList.size() <= 0) {
            lsi0.h(R$string.f500d0);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(MediaPickerBaseAct.h, arrayList);
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: renamed from: R2 */
    public final /* synthetic */ void m3275R2(Map map, Map map2, final ArrayList arrayList) throws Throwable {
        for (String str : map.keySet()) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    Bitmap bitmapM3239I2 = m3239I2(act(), (InstaCropperView.C2061f) map2.get(str), Uri.fromFile(new File(rhi.z(str))));
                    File fileO = k9j.O("jpg");
                    FileOutputStream fileOutputStream2 = new FileOutputStream(fileO);
                    try {
                        bitmapM3239I2.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream2);
                        n6f.b(Uri.parse(str).getPath(), fileO.getAbsolutePath(), false);
                        fileOutputStream2.flush();
                        Picture picture = new Picture();
                        picture.mediaType = "image/*";
                        picture.url = rhi.B(fileO.getPath());
                        picture.status = MediaLocalStatus.get(MediaLocalStatus.raw);
                        arrayList.add(picture);
                        t95.b(fileOutputStream2);
                    } catch (FileNotFoundException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        CrashHelper.c(e);
                        lsi0.h(R$string.f400N);
                        t95.b(fileOutputStream);
                    } catch (IOException e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        CrashHelper.c(e);
                        lsi0.h(R$string.f400N);
                        t95.b(fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        t95.b(fileOutputStream);
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
        e51.G(new Runnable() { // from class: l.ztm
            @Override // java.lang.Runnable
            public final void run() {
                this.f15857a.m3274Q2(arrayList);
            }
        });
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ void m3277T2(View view) {
        if (((MediaPickerBaseAct) this).e == ((MediaPickerBaseAct) this).c) {
            return;
        }
        m3293k3();
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m3278U2(View view) {
        if (((MediaPickerBaseAct) this).e == ((MediaPickerBaseAct) this).d) {
            return;
        }
        m3294m3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m3279V2(View view) {
        if (this.f1805z == null) {
            RecyclerView recyclerView = new RecyclerView(act());
            this.f1805z = recyclerView;
            recyclerView.setMinimumHeight(t100.d(300.0f));
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
            linearLayoutManager.setReverseLayout(true);
            this.f1805z.setLayoutManager(linearLayoutManager);
            this.f1805z.setBackgroundColor(-1);
        }
        C2064c c2064c = new C2064c();
        this.f1781A = c2064c;
        this.f1805z.setAdapter(c2064c);
        this.f1781A.m3302G(((MediaPickerBaseAct) this).e.b);
        if (NullChecker.a(this.f1788H)) {
            this.f1788H.dismiss();
        }
        C2084a c2084a = new C2084a(this);
        this.f1788H = c2084a;
        c2084a.setContentView((View) this.f1805z);
        this.f1788H.show();
        this.f1805z.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: W2 */
    public final /* synthetic */ void m3280W2(View view) {
        m3291i3(!this.f1785E);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m3281X2(Bundle bundle) {
        m3259r();
        if (zqx.k()) {
            new zqx().d(act(), act().findViewById(b5c0.f6060j1), new d30() { // from class: l.rum
                public final void call() {
                    this.f12737a.m3276S2();
                }
            }, (e30) null, (x4e) null, (w4e) null, (v4e) null);
        } else {
            PermissionHelper.c().r(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}).w(false).u(true).o(new d30() { // from class: l.sum
                public final void call() {
                    this.f13092a.m3276S2();
                }
            }).i(this);
        }
        this.f1799t.setOnClickListener(new View.OnClickListener() { // from class: l.utm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13927a.m3277T2(view);
            }
        });
        this.f1800u.setOnClickListener(new View.OnClickListener() { // from class: l.vtm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14297a.m3278U2(view);
            }
        });
        this.f1793n.setOnClickListener(new View.OnClickListener() { // from class: l.wtm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14676a.m3279V2(view);
            }
        });
        this.f1796q.setOnClickListener(new View.OnClickListener() { // from class: l.xtm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15152a.m3280W2(view);
            }
        });
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ void m3282Y2() {
        removeCallbacks(this.f1790J);
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m3283Z2(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: renamed from: a3 */
    public final /* synthetic */ void m3284a3(q860 q860Var) {
        ((MediaPickerBaseAct) this).c.b = q860Var;
    }

    /* JADX INFO: renamed from: b */
    public void m3285b(iti itiVar) {
        nqh0 nqh0Var = ((MediaPickerBaseAct) this).e;
        nqh0Var.c = itiVar;
        q860<Media> q860Var = itiVar == null ? nqh0Var.a : itiVar.c;
        this.f1787G.m3308G(q860Var);
        ((MediaPickerBaseAct) this).e.e.scrollToPosition(0);
        post(new Runnable() { // from class: l.ttm
            @Override // java.lang.Runnable
            public final void run() {
                this.f13418a.m3290g3();
            }
        });
        if (NullChecker.a(this.f1788H)) {
            this.f1788H.dismiss();
            this.f1788H = null;
        }
        if (!this.f1803x.equals(TYPE.IMAGES)) {
            if (!this.f1803x.equals(TYPE.VIDEOS) || q860Var.a.size() <= 0) {
                return;
            }
            this.f1789I.m7713r(true);
            ((MediaPickerBaseAct) this).f = 0;
            this.f1783C = ((Media) q860Var.a.get(0)).url;
            this.f1784D = (Media) q860Var.a.get(0);
            this.f1789I.m7708F((Media) q860Var.a.get(0));
            this.f1789I.m7707E();
            return;
        }
        if (q860Var.a.size() > 0) {
            ((MediaPickerBaseAct) this).f = 0;
            this.f1783C = ((Media) q860Var.a.get(0)).url;
            this.f1795p.setImageUri(Uri.fromFile(new File(rhi.z(this.f1783C))));
            for (int i = 0; i < q860Var.a.size(); i++) {
                Media media = (Media) q860Var.a.get(i);
                if (((MediaPickerBaseAct) this).g.containsKey(media.url)) {
                    ((MediaPickerBaseAct) this).g.put(media.url, Integer.valueOf(i));
                }
            }
        }
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ void m3286b3(List list) {
        ((MediaPickerBaseAct) this).d.a = new q860(vwb.Q(list, new w9j() { // from class: l.ium
            public final Object call(Object obj) {
                return InstaLikePickerAct.m3265y2((Video) obj);
            }
        }), (DbLinks) null);
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m3287c3(q860 q860Var) {
        ((MediaPickerBaseAct) this).d.b = q860Var;
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m3288d3(List list) {
        ((MediaPickerBaseAct) this).c.a = new q860(vwb.Q(list, new w9j() { // from class: l.kum
            public final Object call(Object obj) {
                return InstaLikePickerAct.m3242a2((Picture) obj);
            }
        }), (DbLinks) null);
        m3293k3();
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ Boolean m3289f3() {
        Iterator it = vwb.n(xdl0.s(this.f1792m), new w9j() { // from class: l.qum
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) instanceof ActionMenuItemView);
            }
        }).iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) ((View) it.next());
            if (!TextUtils.isEmpty(textView.getText())) {
                textView.setTypeface(eqh0.c(3));
                textView.setTextColor(Color.parseColor("#f55a43"));
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ void m3290g3() {
        ((MediaPickerBaseAct) this).e.e.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: i3 */
    public final void m3291i3(boolean z) {
        if (((MediaPickerBaseAct) this).c.a.a.size() < 2) {
            return;
        }
        if (z) {
            this.f1796q.setBackgroundDrawable(getResources().getDrawable(f3c0.f7906s6));
            this.f1785E = true;
            if (NullChecker.a(this.f1783C)) {
                ((MediaPickerBaseAct) this).g.put(this.f1783C, Integer.valueOf(((MediaPickerBaseAct) this).f));
            }
            ((MediaPickerBaseAct) this).c.d.notifyDataSetChanged();
            this.f1795p.setFitView(true);
            return;
        }
        ((MediaPickerBaseAct) this).g.clear();
        this.f1782B.clear();
        this.f1796q.setBackgroundDrawable(getResources().getDrawable(f3c0.f7898r6));
        this.f1785E = false;
        ((MediaPickerBaseAct) this).c.d.notifyDataSetChanged();
        this.f1795p.setFitView(false);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m3267D2(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initDataOnCreate();
        creates(new e30() { // from class: l.eum
            public final void call(Object obj) {
                this.f7480a.m3281X2((Bundle) obj);
            }
        }, new d30() { // from class: l.lum
            public final void call() {
                this.f10137a.m3282Y2();
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
    public final void m3292j3() {
        int iD = t100.d(48.0f) + xdl0.y0();
        int iD2 = t100.d(48.0f);
        this.f1791l.m3182e(iD, iD2);
        this.f1794o.getLayoutParams().height = xdl0.y0();
        PictureView pictureView = (PictureView) LayoutInflater.from(((Act) this).act).inflate(o6c0.f11243k1, (ViewGroup) this.f1794o, false);
        this.f1789I = pictureView;
        pictureView.f5030e.setAlpha(0.0f);
        PictureView pictureView2 = this.f1789I;
        pictureView2.f5024A = GivenGiftBrief.ADVANCED_GIFT_LEVEL;
        pictureView2.f5051z = 0.0f;
        pictureView2.setOnClickListener(pictureView2);
        this.f1789I.m7714u(false);
        this.f1794o.addView(this.f1789I);
        this.f1789I.setVisibility(8);
        this.f1797r.getLayoutParams().height = xdl0.w0() - iD2;
        C2065d c2065d = new C2065d();
        this.f1787G = c2065d;
        this.f1797r.setAdapter(c2065d);
        nqh0 nqh0Var = ((MediaPickerBaseAct) this).c;
        nqh0 nqh0Var2 = ((MediaPickerBaseAct) this).d;
        C2065d c2065d2 = this.f1787G;
        nqh0Var2.d = c2065d2;
        nqh0Var.d = c2065d2;
        CoordinatorRecyclerView coordinatorRecyclerView = this.f1797r;
        nqh0Var2.e = coordinatorRecyclerView;
        nqh0Var.e = coordinatorRecyclerView;
        this.f1791l.getLayoutParams().height = (iD + xdl0.w0()) - iD2;
        this.f1797r.setCoordinatorListener(this.f1791l);
        this.f1797r.addOnScrollListener(new C2062a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k3 */
    public final void m3293k3() {
        this.f1803x = TYPE.IMAGES;
        this.f1793n.setText(getString(R$string.f545j3));
        this.f1799t.m3168l(true);
        this.f1800u.m3168l(false);
        this.f1795p.setVisibility(0);
        int i = this.f1801v;
        VText vText = this.f1796q;
        if (i == 1) {
            vText.setVisibility(8);
        } else {
            vText.setVisibility(0);
        }
        this.f1789I.m7706D();
        this.f1789I.setVisibility(8);
        nqh0 nqh0Var = ((MediaPickerBaseAct) this).c;
        ((MediaPickerBaseAct) this).e = nqh0Var;
        this.f1787G.m3308G(nqh0Var.a);
        if (((MediaPickerBaseAct) this).c.a.a.size() > 0) {
            ((MediaPickerBaseAct) this).f = 0;
            this.f1783C = ((Media) ((MediaPickerBaseAct) this).c.a.a.get(0)).url;
            this.f1795p.setImageUri(Uri.fromFile(new File(rhi.z(this.f1783C))));
        }
        removeCallbacks(this.f1790J);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m3 */
    public final void m3294m3() {
        this.f1803x = TYPE.VIDEOS;
        m3291i3(false);
        this.f1793n.setText(getString(R$string.f552k3));
        this.f1799t.m3168l(false);
        this.f1800u.m3168l(true);
        this.f1789I.setVisibility(0);
        this.f1796q.setVisibility(8);
        this.f1795p.setVisibility(8);
        nqh0 nqh0Var = ((MediaPickerBaseAct) this).d;
        ((MediaPickerBaseAct) this).e = nqh0Var;
        this.f1787G.m3308G(nqh0Var.a);
        if (((MediaPickerBaseAct) this).d.a.a.size() > 0) {
            ((MediaPickerBaseAct) this).f = 0;
            this.f1783C = ((Media) ((MediaPickerBaseAct) this).d.a.a.get(0)).url;
            this.f1784D = (Media) ((MediaPickerBaseAct) this).d.a.a.get(0);
            this.f1789I.m7708F((Media) ((MediaPickerBaseAct) this).d.a.a.get(0));
            postDelayed(this.f1790J, 200L);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, b5c0.f5987O0, 1, actionItemPadding(string(R$string.f562m))).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.mum
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f10582a.m3247e3(menuItem);
            }
        }).setShowAsAction(2);
        xdl0.b0(findViewById(R.id.content), new v9j() { // from class: l.num
            public final Object call() {
                return this.f10889a.m3289f3();
            }
        });
        return true;
    }

    public void onDestroyLifecycle() {
        if (NullChecker.b(this.f1789I)) {
            this.f1789I.m7713r(true);
        }
        super/*com.p1.mobile.putong.app.PutongAct*/.onDestroyLifecycle();
    }

    public void onPauseLifecycle() {
        if (NullChecker.b(this.f1789I)) {
            this.f1789I.m7706D();
        }
        super/*com.p1.mobile.putong.app.PutongAct*/.onPauseLifecycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
        this.f1801v = getIntent().getIntExtra("imageCount", 9);
        this.f1802w = getIntent().getBooleanExtra("hasVideo", true);
        this.f1786F = getIntent().getBooleanExtra("isInCameraGroup", false);
    }

    /* JADX INFO: renamed from: x */
    public Map<String, Integer> m3295x() {
        return ((MediaPickerBaseAct) this).g;
    }

    /* JADX INFO: renamed from: y */
    public void m3296y(Media media, int i) {
        if (((MediaPickerBaseAct) this).e == ((MediaPickerBaseAct) this).c) {
            m3268F2(media, i);
        } else {
            m3270H2(media, i);
        }
    }
}
