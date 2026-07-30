package com.p000p1.mobile.putong.core.p001ui.growth.fakeexperience.view;

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
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Media;
import java.util.List;
import l.f6c0;
import l.jo0;
import l.mkd0;
import l.o7r;
import l.qib0;
import l.t100;
import l.u4c0;
import l.vwb;
import l.z3g0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class FakeTwoCardView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f1925a;

    /* JADX INFO: renamed from: b */
    public VImage f1926b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.growth.fakeexperience.view.FakeTwoCardView$a */
    public class C3137a extends z3g0<Bitmap> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ VImage f1927e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f1928f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f1929g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ int f1930h;

        public C3137a(VImage vImage, int i, int i2, int i3) {
            this.f1927e = vImage;
            this.f1928f = i;
            this.f1929g = i2;
            this.f1930h = i3;
        }

        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onNext(Bitmap bitmap) {
            try {
                FakeTwoCardView fakeTwoCardView = FakeTwoCardView.this;
                fakeTwoCardView.m3337g(this.f1927e, this.f1928f, this.f1929g, this.f1930h, fakeTwoCardView.m3333c(bitmap, t100.t));
            } catch (Exception unused) {
            }
        }

        public void onCompleted() {
        }

        public void onError(Throwable th) {
        }
    }

    public FakeTwoCardView(@NonNull Context context) {
        super(context);
        m3334d();
    }

    /* JADX INFO: renamed from: c */
    public final Bitmap m3333c(Bitmap bitmap, int i) {
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(-16777216);
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
    public final void m3334d() {
        o7r.a(getContext()).inflate(f6c0.i3, this);
        this.f1925a = findViewById(u4c0.b0);
        this.f1926b = findViewById(u4c0.f0);
        this.f1925a.post(new Runnable() { // from class: l.x2g
            @Override // java.lang.Runnable
            public final void run() {
                this.f8295a.m3335e();
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m3335e() {
        int[] iArr = new int[2];
        this.f1926b.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = t100.O;
        int i3 = i + i2;
        int i4 = iArr[1];
        int[] iArr2 = new int[2];
        this.f1926b.getLocationOnScreen(iArr2);
        int i5 = iArr2[0] + i2;
        int i6 = iArr2[1];
        List list = CoreModule.c.e0.p9().pictures;
        if (vwb.J(list) || list.size() <= 1) {
            return;
        }
        String str = ((Media) list.get(0)).url;
        m3336f(this.f1925a, 8, i3, i4, ((Media) list.get(1)).url);
        m3336f(this.f1926b, -4, i5, i6, str);
    }

    /* JADX INFO: renamed from: f */
    public final void m3336f(VImage vImage, int i, int i2, int i3, String str) {
        qib0.G.E(str).observeOn(jo0.a()).subscribe(mkd0.L(new C3137a(vImage, i, i2, i3)));
    }

    /* JADX INFO: renamed from: g */
    public void m3337g(VImage vImage, int i, int i2, int i3, Bitmap bitmap) {
        vImage.setImageBitmap(bitmap);
        Matrix matrix = new Matrix();
        matrix.postRotate(i, i2, i3);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true));
        vImage.setAdjustViewBounds(true);
        vImage.setImageDrawable(bitmapDrawable);
    }

    public FakeTwoCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m3334d();
    }

    public FakeTwoCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3334d();
    }
}
