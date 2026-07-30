package com.p046p1.mobile.putong.feed.newui.mediapicker;

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
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView;
import com.p046p1.mobile.putong.feed.p060ui.PictureView;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VPager;
import p147v.navigationbar.VNavigationBar;
import p149l.dg20;
import p149l.e1c0;
import p149l.e30;
import p149l.eb2;
import p149l.f3c0;
import p149l.rhi;
import p149l.vwb;

/* JADX INFO: loaded from: classes12.dex */
public class NewAlbumPreviewNoEditAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VPager f40366c;

    /* JADX INFO: renamed from: d */
    public VNavigationBar f40367d;

    /* JADX INFO: renamed from: h */
    public Media f40371h;

    /* JADX INFO: renamed from: k */
    public C11224c f40374k;

    /* JADX INFO: renamed from: e */
    public ArrayList<Media> f40368e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public MediaWrapper f40369f = new MediaWrapper();

    /* JADX INFO: renamed from: g */
    public ArrayList<Media> f40370g = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    public int f40372i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f40373j = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumPreviewNoEditAct$a */
    public class C11222a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f40375a;

        public C11222a(View view) {
            this.f40375a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f40375a.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumPreviewNoEditAct$b */
    public class C11223b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f40377a;

        public C11223b(View view) {
            this.f40377a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f40377a.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumPreviewNoEditAct$c */
    public class C11224c extends eb2 {

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumPreviewNoEditAct$c$a */
        public class a implements PhotoAlbumPhotoPreviewView.InterfaceC11322c {
            public a() {
            }

            @Override // com.p046p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView.InterfaceC11322c
            /* JADX INFO: renamed from: a */
            public void mo62336a() {
                boolean z = NewAlbumPreviewNoEditAct.this.f40373j;
                C11224c c11224c = C11224c.this;
                if (z) {
                    NewAlbumPreviewNoEditAct newAlbumPreviewNoEditAct = NewAlbumPreviewNoEditAct.this;
                    newAlbumPreviewNoEditAct.m62334l2(newAlbumPreviewNoEditAct.f40367d, true);
                    NewAlbumPreviewNoEditAct.this.f40373j = false;
                } else {
                    NewAlbumPreviewNoEditAct newAlbumPreviewNoEditAct2 = NewAlbumPreviewNoEditAct.this;
                    newAlbumPreviewNoEditAct2.m62332h2(newAlbumPreviewNoEditAct2.f40367d, true);
                    NewAlbumPreviewNoEditAct.this.f40373j = true;
                }
            }
        }

        public C11224c() {
        }

        @Override // p149l.w660
        public int getCount() {
            return NewAlbumPreviewNoEditAct.this.f40368e.size();
        }

        @Override // p149l.w660
        public int getItemPosition(Object obj) {
            return NewAlbumPreviewNoEditAct.this.f40368e.indexOf(obj);
        }

        @Override // p149l.w660
        public boolean isViewFromObject(View view, Object obj) {
            return view.getTag().equals(obj);
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: o */
        public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
            View viewFindViewWithTag = viewGroup.findViewWithTag(obj);
            if (viewFindViewWithTag instanceof PictureView) {
                ((PictureView) viewFindViewWithTag).m66536r(true);
            }
            if (NullChecker.m81304b(viewFindViewWithTag)) {
                viewFindViewWithTag.setTag(null);
                viewGroup.removeView(viewFindViewWithTag);
            }
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo39043p(ViewGroup viewGroup, int i) {
            Media media = (Media) NewAlbumPreviewNoEditAct.this.f40368e.get(i);
            m62335q(viewGroup, media);
            return media;
        }

        /* JADX INFO: renamed from: q */
        public final PhotoAlbumPhotoPreviewView m62335q(ViewGroup viewGroup, Media media) {
            String strM179382z = rhi.m179382z(media.url);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(strM179382z, options);
            int[] iArr = {options.outWidth, options.outHeight};
            PhotoAlbumPhotoPreviewView photoAlbumPhotoPreviewView = new PhotoAlbumPhotoPreviewView(NewAlbumPreviewNoEditAct.this.act);
            Picture picture = (Picture) media;
            picture.size = new Dimension(iArr);
            photoAlbumPhotoPreviewView.m65394V(picture, false);
            photoAlbumPhotoPreviewView.setOnTapListener(new a());
            viewGroup.addView(photoAlbumPhotoPreviewView);
            photoAlbumPhotoPreviewView.setTag(media);
            return photoAlbumPhotoPreviewView;
        }
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m62327g2(Context context, Media media, ArrayList<Media> arrayList) {
        Intent intent = new Intent(context, (Class<?>) NewAlbumPreviewNoEditAct.class);
        intent.putExtra("selectedMedia", media);
        intent.putExtra("selectedImages", arrayList);
        return intent;
    }

    /* JADX INFO: renamed from: k2 */
    private void m62328k2() {
        if (vwb.m200296J(this.f40370g)) {
            m66873d2();
            return;
        }
        this.f40368e = new ArrayList<>();
        this.f40369f.clearAllSelectedMedia();
        this.f40369f.addAllSelectedMedia(this.f40370g);
        vwb.m200354z(this.f40370g, new e30() { // from class: l.cg20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80692a.m62331e2((Media) obj);
            }
        });
        this.f40372i = m62333i2(this.f40368e, this.f40371h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        if (NullChecker.m81303a(getSupportActionBar())) {
            getSupportActionBar().mo134126m();
        }
        m62328k2();
        m62329r();
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    private void m62329r() {
        C11224c c11224c = new C11224c();
        this.f40374k = c11224c;
        this.f40366c.setAdapter(c11224c);
        this.f40374k.notifyDataSetChanged();
        int i = this.f40372i;
        if (i > 0) {
            this.f40366c.setCurrentItem(i);
        }
        this.f40367d.setLeftIconAsBack(this);
        ((View) this.f40367d.getLeftIconContainer().getParent()).setBackgroundColor(getResources().getColor(e1c0.f88778d));
        this.f40367d.setLeftIconDrawable(getResources().getDrawable(f3c0.f94575m6));
    }

    /* JADX INFO: renamed from: d2 */
    public View m62330d2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dg20.m111606b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e2 */
    public final void m62331e2(Media media) {
        if (media instanceof Video) {
            return;
        }
        this.f40368e.add(media);
    }

    /* JADX INFO: renamed from: h2 */
    public final void m62332h2(View view, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = z ? ObjectAnimator.ofFloat(view, "translationY", 0.0f, -view.getHeight()) : ObjectAnimator.ofFloat(view, "translationY", 0.0f, view.getHeight());
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.addListener(new C11223b(view));
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: i2 */
    public int m62333i2(ArrayList<Media> arrayList, Media media) {
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

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m62330d2(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.bg20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75395a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public final void m62334l2(View view, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = z ? ObjectAnimator.ofFloat(view, "translationY", -view.getHeight(), 0.0f) : ObjectAnimator.ofFloat(view, "translationY", view.getHeight(), 0.0f);
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.addListener(new C11222a(view));
        objectAnimatorOfFloat.start();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m66873d2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        if (NullChecker.m81304b(getIntent())) {
            this.f40371h = (Media) getIntent().getSerializableExtra("selectedMedia");
            this.f40370g = (ArrayList) getIntent().getSerializableExtra("selectedImages");
        }
        super.preCreateView(bundle);
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
}
