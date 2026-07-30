package com.p046p1.mobile.putong.core.p053ui.growth.fakeexperience.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.Media;
import java.util.List;
import p147v.VImage;
import p149l.f6c0;
import p149l.jo0;
import p149l.mkd0;
import p149l.o7r;
import p149l.qib0;
import p149l.t100;
import p149l.u4c0;
import p149l.vwb;
import p149l.z3g0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes10.dex */
public class FakeTwoCardView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f29531a;

    /* JADX INFO: renamed from: b */
    public VImage f29532b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.growth.fakeexperience.view.FakeTwoCardView$a */
    public class C8362a extends z3g0<Bitmap> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ VImage f29533e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f29534f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f29535g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ int f29536h;

        public C8362a(VImage vImage, int i, int i2, int i3) {
            this.f29533e = vImage;
            this.f29534f = i;
            this.f29535g = i2;
            this.f29536h = i3;
        }

        @Override // p149l.m250
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onNext(Bitmap bitmap) {
            try {
                FakeTwoCardView fakeTwoCardView = FakeTwoCardView.this;
                fakeTwoCardView.m45982g(this.f29533e, this.f29534f, this.f29535g, this.f29536h, fakeTwoCardView.m45978c(bitmap, t100.f167271t));
            } catch (Exception unused) {
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
        }
    }

    public FakeTwoCardView(@NonNull Context context) {
        super(context);
        m45979d();
    }

    /* JADX INFO: renamed from: c */
    public final Bitmap m45978c(Bitmap bitmap, int i) {
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            float f = i;
            canvas.drawRoundRect(new RectF(0.0f, 0.0f, width, height), f, f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            Rect rect = new Rect(0, 0, width, height);
            canvas.drawBitmap(bitmap, rect, rect, paint);
            return bitmapCreateBitmap;
        } catch (Exception unused) {
            return bitmap;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m45979d() {
        o7r.m163037a(getContext()).inflate(f6c0.f95822i3, this);
        this.f29531a = (VImage) findViewById(u4c0.f174169b0);
        this.f29532b = (VImage) findViewById(u4c0.f174237f0);
        this.f29531a.post(new Runnable() { // from class: l.x2g
            @Override // java.lang.Runnable
            public final void run() {
                this.f190801a.m45980e();
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m45980e() {
        int[] iArr = new int[2];
        this.f29532b.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = t100.f167240O;
        int i3 = i + i2;
        int i4 = iArr[1];
        int[] iArr2 = new int[2];
        this.f29532b.getLocationOnScreen(iArr2);
        int i5 = iArr2[0] + i2;
        int i6 = iArr2[1];
        List<Media> list = CoreModule.f17545c.f19639e0.m169527p9().pictures;
        if (vwb.m200296J(list) || list.size() <= 1) {
            return;
        }
        String str = list.get(0).url;
        m45981f(this.f29531a, 8, i3, i4, list.get(1).url);
        m45981f(this.f29532b, -4, i5, i6, str);
    }

    /* JADX INFO: renamed from: f */
    public final void m45981f(VImage vImage, int i, int i2, int i3, String str) {
        qib0.f154691G.m102316E(str).observeOn(jo0.m142408a()).subscribe(mkd0.m154960L(new C8362a(vImage, i, i2, i3)));
    }

    /* JADX INFO: renamed from: g */
    public void m45982g(VImage vImage, int i, int i2, int i3, Bitmap bitmap) {
        vImage.setImageBitmap(bitmap);
        Matrix matrix = new Matrix();
        matrix.postRotate(i, i2, i3);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true));
        vImage.setAdjustViewBounds(true);
        vImage.setImageDrawable(bitmapDrawable);
    }

    public FakeTwoCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m45979d();
    }

    public FakeTwoCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m45979d();
    }
}
