package com.p000p1.mobile.putong.feed.newui.mediapicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView;
import com.p000p1.mobile.putong.feed.p005ui.PictureView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.e30;
import l.eb2;
import l.rhi;
import l.vwb;
import p007l.dg20;
import p007l.e1c0;
import p007l.f3c0;
import v.VPager;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class NewAlbumPreviewNoEditAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VPager f1827c;

    /* JADX INFO: renamed from: d */
    public VNavigationBar f1828d;

    /* JADX INFO: renamed from: h */
    public Media f1832h;

    /* JADX INFO: renamed from: k */
    public C2068c f1835k;

    /* JADX INFO: renamed from: e */
    public ArrayList<Media> f1829e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public MediaWrapper f1830f = new MediaWrapper();

    /* JADX INFO: renamed from: g */
    public ArrayList<Media> f1831g = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    public int f1833i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f1834j = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumPreviewNoEditAct$a */
    public class C2066a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f1836a;

        public C2066a(View view) {
            this.f1836a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f1836a.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumPreviewNoEditAct$b */
    public class C2067b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f1838a;

        public C2067b(View view) {
            this.f1838a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1838a.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumPreviewNoEditAct$c */
    public class C2068c extends eb2 {

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumPreviewNoEditAct$c$a */
        public class a implements PhotoAlbumPhotoPreviewView.InterfaceC2166c {
            public a() {
            }

            @Override // com.p000p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView.InterfaceC2166c
            /* JADX INFO: renamed from: a */
            public void mo3330a() {
                boolean z = NewAlbumPreviewNoEditAct.this.f1834j;
                C2068c c2068c = C2068c.this;
                if (z) {
                    NewAlbumPreviewNoEditAct newAlbumPreviewNoEditAct = NewAlbumPreviewNoEditAct.this;
                    newAlbumPreviewNoEditAct.m3326l2(newAlbumPreviewNoEditAct.f1828d, true);
                    NewAlbumPreviewNoEditAct.this.f1834j = false;
                } else {
                    NewAlbumPreviewNoEditAct newAlbumPreviewNoEditAct2 = NewAlbumPreviewNoEditAct.this;
                    newAlbumPreviewNoEditAct2.m3324h2(newAlbumPreviewNoEditAct2.f1828d, true);
                    NewAlbumPreviewNoEditAct.this.f1834j = true;
                }
            }
        }

        public C2068c() {
        }

        public int getCount() {
            return NewAlbumPreviewNoEditAct.this.f1829e.size();
        }

        public int getItemPosition(Object obj) {
            return NewAlbumPreviewNoEditAct.this.f1829e.indexOf(obj);
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view.getTag().equals(obj);
        }

        /* JADX INFO: renamed from: o */
        public void m3327o(ViewGroup viewGroup, int i, Object obj) {
            View viewFindViewWithTag = viewGroup.findViewWithTag(obj);
            if (viewFindViewWithTag instanceof PictureView) {
                ((PictureView) viewFindViewWithTag).m7713r(true);
            }
            if (NullChecker.b(viewFindViewWithTag)) {
                viewFindViewWithTag.setTag(null);
                viewGroup.removeView(viewFindViewWithTag);
            }
        }

        /* JADX INFO: renamed from: p */
        public Object m3328p(ViewGroup viewGroup, int i) {
            Media media = (Media) NewAlbumPreviewNoEditAct.this.f1829e.get(i);
            m3329q(viewGroup, media);
            return media;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView] */
        /* JADX INFO: renamed from: q */
        public final PhotoAlbumPhotoPreviewView m3329q(ViewGroup viewGroup, Media media) {
            String strZ = rhi.z(media.url);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(strZ, options);
            int[] iArr = {options.outWidth, options.outHeight};
            ?? photoAlbumPhotoPreviewView = new PhotoAlbumPhotoPreviewView(((Act) NewAlbumPreviewNoEditAct.this).act);
            Picture picture = (Picture) media;
            picture.size = new Dimension(iArr);
            photoAlbumPhotoPreviewView.m6509V(picture, false);
            photoAlbumPhotoPreviewView.setOnTapListener(new a());
            viewGroup.addView(photoAlbumPhotoPreviewView);
            photoAlbumPhotoPreviewView.setTag(media);
            return photoAlbumPhotoPreviewView;
        }
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m3319g2(Context context, Media media, ArrayList<Media> arrayList) {
        Intent intent = new Intent(context, (Class<?>) NewAlbumPreviewNoEditAct.class);
        intent.putExtra("selectedMedia", media);
        intent.putExtra("selectedImages", arrayList);
        return intent;
    }

    /* JADX INFO: renamed from: k2 */
    private void m3320k2() {
        if (vwb.J(this.f1831g)) {
            finish();
            return;
        }
        this.f1829e = new ArrayList<>();
        this.f1830f.clearAllSelectedMedia();
        this.f1830f.addAllSelectedMedia(this.f1831g);
        vwb.z(this.f1831g, new e30() { // from class: l.cg20
            public final void call(Object obj) {
                this.f6621a.m3323e2((Media) obj);
            }
        });
        this.f1833i = m3325i2(this.f1829e, this.f1832h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        if (NullChecker.a(getSupportActionBar())) {
            getSupportActionBar().m();
        }
        m3320k2();
        m3321r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    private void m3321r() {
        C2068c c2068c = new C2068c();
        this.f1835k = c2068c;
        this.f1827c.setAdapter(c2068c);
        this.f1835k.notifyDataSetChanged();
        int i = this.f1833i;
        if (i > 0) {
            this.f1827c.setCurrentItem(i);
        }
        this.f1828d.setLeftIconAsBack(this);
        ((View) this.f1828d.getLeftIconContainer().getParent()).setBackgroundColor(getResources().getColor(e1c0.f7134d));
        this.f1828d.setLeftIconDrawable(getResources().getDrawable(f3c0.f7858m6));
    }

    /* JADX INFO: renamed from: d2 */
    public View m3322d2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dg20.m9369b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e2 */
    public final void m3323e2(Media media) {
        if (media instanceof Video) {
            return;
        }
        this.f1829e.add(media);
    }

    /* JADX INFO: renamed from: h2 */
    public final void m3324h2(View view, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = z ? ObjectAnimator.ofFloat(view, "translationY", 0.0f, -view.getHeight()) : ObjectAnimator.ofFloat(view, "translationY", 0.0f, view.getHeight());
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.addListener(new C2067b(view));
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: i2 */
    public int m3325i2(ArrayList<Media> arrayList, Media media) {
        int i = 0;
        if (media == null) {
            while (i < arrayList.size()) {
                if (arrayList.get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < arrayList.size()) {
            if (TextUtils.equals(media.url, arrayList.get(i).url)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m3322d2(layoutInflater, viewGroup);
    }

    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.bg20
            public final void call(Object obj) {
                this.f6287a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public final void m3326l2(View view, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = z ? ObjectAnimator.ofFloat(view, "translationY", -view.getHeight(), 0.0f) : ObjectAnimator.ofFloat(view, "translationY", view.getHeight(), 0.0f);
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.addListener(new C2066a(view));
        objectAnimatorOfFloat.start();
    }

    public void onBackPressed() {
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        if (NullChecker.b(getIntent())) {
            this.f1832h = (Media) getIntent().getSerializableExtra("selectedMedia");
            this.f1831g = (ArrayList) getIntent().getSerializableExtra("selectedImages");
        }
        super.preCreateView(bundle);
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
}
