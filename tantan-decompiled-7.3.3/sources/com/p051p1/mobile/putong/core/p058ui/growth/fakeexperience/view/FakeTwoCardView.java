package com.p051p1.mobile.putong.core.p058ui.growth.fakeexperience.view;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.Media;
import java.util.List;
import p151v.VImage;
import p153l.adc0;
import p153l.fo0;
import p153l.gcg0;
import p153l.jyb;
import p153l.kec0;
import p153l.p9r;
import p153l.psd0;
import p153l.qa00;
import p153l.uqb0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class FakeTwoCardView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f30379a;

    /* JADX INFO: renamed from: b */
    public VImage f30380b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.growth.fakeexperience.view.FakeTwoCardView$a */
    public class C8525a extends gcg0<Bitmap> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ VImage f30381e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f30382f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f30383g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ int f30384h;

        public C8525a(VImage vImage, int i, int i2, int i3) {
            this.f30381e = vImage;
            this.f30382f = i;
            this.f30383g = i2;
            this.f30384h = i3;
        }

        @Override // p153l.bb50
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onNext(Bitmap bitmap) {
            try {
                FakeTwoCardView fakeTwoCardView = FakeTwoCardView.this;
                fakeTwoCardView.m47165g(this.f30381e, this.f30382f, this.f30383g, this.f30384h, fakeTwoCardView.m47161c(bitmap, qa00.f156333t));
            } catch (Exception unused) {
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
        }
    }

    public FakeTwoCardView(@NonNull Context context) {
        super(context);
        m47162d();
    }

    /* JADX INFO: renamed from: c */
    public final Bitmap m47161c(Bitmap bitmap, int i) {
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
    public final void m47162d() {
        p9r.m171370a(getContext()).inflate(kec0.f125876i3, this);
        this.f30379a = (VImage) findViewById(adc0.f70260b0);
        this.f30380b = (VImage) findViewById(adc0.f70328f0);
        this.f30379a.post(new Runnable() { // from class: l.l4g
            @Override // java.lang.Runnable
            public final void run() {
                this.f129971a.m47163e();
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m47163e() {
        int[] iArr = new int[2];
        this.f30380b.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = qa00.f156302O;
        int i3 = i + i2;
        int i4 = iArr[1];
        int[] iArr2 = new int[2];
        this.f30380b.getLocationOnScreen(iArr2);
        int i5 = iArr2[0] + i2;
        int i6 = iArr2[1];
        List<Media> list = CoreModule.f18264c.f20381e0.m116600p9().pictures;
        if (jyb.m147479J(list) || list.size() <= 1) {
            return;
        }
        String str = list.get(0).url;
        m47164f(this.f30379a, 8, i3, i4, list.get(1).url);
        m47164f(this.f30380b, -4, i5, i6, str);
    }

    /* JADX INFO: renamed from: f */
    public final void m47164f(VImage vImage, int i, int i2, int i3, String str) {
        uqb0.f180374G.m127100E(str).observeOn(fo0.m126432a()).subscribe(psd0.m173601L(new C8525a(vImage, i, i2, i3)));
    }

    /* JADX INFO: renamed from: g */
    public void m47165g(VImage vImage, int i, int i2, int i3, Bitmap bitmap) {
        vImage.setImageBitmap(bitmap);
        Matrix matrix = new Matrix();
        matrix.postRotate(i, i2, i3);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true));
        vImage.setAdjustViewBounds(true);
        vImage.setImageDrawable(bitmapDrawable);
    }

    public FakeTwoCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m47162d();
    }

    public FakeTwoCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m47162d();
    }
}
