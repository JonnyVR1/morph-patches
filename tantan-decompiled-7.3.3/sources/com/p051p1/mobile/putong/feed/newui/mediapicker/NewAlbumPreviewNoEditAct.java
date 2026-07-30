package com.p051p1.mobile.putong.feed.newui.mediapicker;

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
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView;
import com.p051p1.mobile.putong.feed.p065ui.PictureView;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VPager;
import p151v.navigationbar.VNavigationBar;
import p153l.jyb;
import p153l.k9c0;
import p153l.lb2;
import p153l.lbc0;
import p153l.no20;
import p153l.oki;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class NewAlbumPreviewNoEditAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VPager f41214c;

    /* JADX INFO: renamed from: d */
    public VNavigationBar f41215d;

    /* JADX INFO: renamed from: h */
    public Media f41219h;

    /* JADX INFO: renamed from: k */
    public C11387c f41222k;

    /* JADX INFO: renamed from: e */
    public ArrayList<Media> f41216e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public MediaWrapper f41217f = new MediaWrapper();

    /* JADX INFO: renamed from: g */
    public ArrayList<Media> f41218g = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    public int f41220i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f41221j = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumPreviewNoEditAct$a */
    public class C11385a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f41223a;

        public C11385a(View view) {
            this.f41223a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f41223a.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumPreviewNoEditAct$b */
    public class C11386b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f41225a;

        public C11386b(View view) {
            this.f41225a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f41225a.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumPreviewNoEditAct$c */
    public class C11387c extends lb2 {

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.NewAlbumPreviewNoEditAct$c$a */
        public class a implements PhotoAlbumPhotoPreviewView.InterfaceC11485c {
            public a() {
            }

            @Override // com.p051p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView.InterfaceC11485c
            /* JADX INFO: renamed from: a */
            public void mo63519a() {
                boolean z = NewAlbumPreviewNoEditAct.this.f41221j;
                C11387c c11387c = C11387c.this;
                if (z) {
                    NewAlbumPreviewNoEditAct newAlbumPreviewNoEditAct = NewAlbumPreviewNoEditAct.this;
                    newAlbumPreviewNoEditAct.m63517m2(newAlbumPreviewNoEditAct.f41215d, true);
                    NewAlbumPreviewNoEditAct.this.f41221j = false;
                } else {
                    NewAlbumPreviewNoEditAct newAlbumPreviewNoEditAct2 = NewAlbumPreviewNoEditAct.this;
                    newAlbumPreviewNoEditAct2.m63515i2(newAlbumPreviewNoEditAct2.f41215d, true);
                    NewAlbumPreviewNoEditAct.this.f41221j = true;
                }
            }
        }

        public C11387c() {
        }

        @Override // p153l.cf60
        public int getCount() {
            return NewAlbumPreviewNoEditAct.this.f41216e.size();
        }

        @Override // p153l.cf60
        public int getItemPosition(Object obj) {
            return NewAlbumPreviewNoEditAct.this.f41216e.indexOf(obj);
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(View view, Object obj) {
            return view.getTag().equals(obj);
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: o */
        public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
            View viewFindViewWithTag = viewGroup.findViewWithTag(obj);
            if (viewFindViewWithTag instanceof PictureView) {
                ((PictureView) viewFindViewWithTag).m67719r(true);
            }
            if (NullChecker.m82487b(viewFindViewWithTag)) {
                viewFindViewWithTag.setTag(null);
                viewGroup.removeView(viewFindViewWithTag);
            }
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: p */
        public Object mo40046p(ViewGroup viewGroup, int i) {
            Media media = (Media) NewAlbumPreviewNoEditAct.this.f41216e.get(i);
            m63518q(viewGroup, media);
            return media;
        }

        /* JADX INFO: renamed from: q */
        public final PhotoAlbumPhotoPreviewView m63518q(ViewGroup viewGroup, Media media) {
            String strM168038z = oki.m168038z(media.url);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(strM168038z, options);
            int[] iArr = {options.outWidth, options.outHeight};
            PhotoAlbumPhotoPreviewView photoAlbumPhotoPreviewView = new PhotoAlbumPhotoPreviewView(NewAlbumPreviewNoEditAct.this.act);
            Picture picture = (Picture) media;
            picture.size = new Dimension(iArr);
            photoAlbumPhotoPreviewView.m66577V(picture, false);
            photoAlbumPhotoPreviewView.setOnTapListener(new a());
            viewGroup.addView(photoAlbumPhotoPreviewView);
            photoAlbumPhotoPreviewView.setTag(media);
            return photoAlbumPhotoPreviewView;
        }
    }

    /* JADX INFO: renamed from: h2 */
    public static Intent m63510h2(Context context, Media media, ArrayList<Media> arrayList) {
        Intent intent = new Intent(context, (Class<?>) NewAlbumPreviewNoEditAct.class);
        intent.putExtra("selectedMedia", media);
        intent.putExtra("selectedImages", arrayList);
        return intent;
    }

    /* JADX INFO: renamed from: l2 */
    private void m63511l2() {
        if (jyb.m147479J(this.f41218g)) {
            m68056e2();
            return;
        }
        this.f41216e = new ArrayList<>();
        this.f41217f.clearAllSelectedMedia();
        this.f41217f.addAllSelectedMedia(this.f41218g);
        jyb.m147537z(this.f41218g, new y20() { // from class: l.mo20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137770a.m63514g2((Media) obj);
            }
        });
        this.f41220i = m63516k2(this.f41216e, this.f41219h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        if (NullChecker.m82486a(getSupportActionBar())) {
            getSupportActionBar().mo102186m();
        }
        m63511l2();
        m63512r();
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    private void m63512r() {
        C11387c c11387c = new C11387c();
        this.f41222k = c11387c;
        this.f41214c.setAdapter(c11387c);
        this.f41222k.notifyDataSetChanged();
        int i = this.f41220i;
        if (i > 0) {
            this.f41214c.setCurrentItem(i);
        }
        this.f41215d.setLeftIconAsBack(this);
        ((View) this.f41215d.getLeftIconContainer().getParent()).setBackgroundColor(getResources().getColor(k9c0.f124501d));
        this.f41215d.setLeftIconDrawable(getResources().getDrawable(lbc0.f131093m6));
    }

    /* JADX INFO: renamed from: e2 */
    public View m63513e2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return no20.m164023b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: g2 */
    public final void m63514g2(Media media) {
        if (media instanceof Video) {
            return;
        }
        this.f41216e.add(media);
    }

    /* JADX INFO: renamed from: i2 */
    public final void m63515i2(View view, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = z ? ObjectAnimator.ofFloat(view, "translationY", 0.0f, -view.getHeight()) : ObjectAnimator.ofFloat(view, "translationY", 0.0f, view.getHeight());
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.addListener(new C11386b(view));
        objectAnimatorOfFloat.start();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m63513e2(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.lo20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132872a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public int m63516k2(ArrayList<Media> arrayList, Media media) {
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

    /* JADX INFO: renamed from: m2 */
    public final void m63517m2(View view, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = z ? ObjectAnimator.ofFloat(view, "translationY", -view.getHeight(), 0.0f) : ObjectAnimator.ofFloat(view, "translationY", view.getHeight(), 0.0f);
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.addListener(new C11385a(view));
        objectAnimatorOfFloat.start();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m68056e2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        if (NullChecker.m82487b(getIntent())) {
            this.f41219h = (Media) getIntent().getSerializableExtra("selectedMedia");
            this.f41218g = (ArrayList) getIntent().getSerializableExtra("selectedImages");
        }
        super.preCreateView(bundle);
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
}
