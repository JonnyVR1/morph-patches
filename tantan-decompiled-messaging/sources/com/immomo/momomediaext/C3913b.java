package com.immomo.momomediaext;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.momo.mcamera.mask.Sticker;
import com.momo.mcamera.mask.bean.AbsolutePosition;
import com.momo.mcamera.mask.bean.ObjectRegion;
import com.momo.mcamera.mask.delegate.ImageDelegateProvider;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.immomo.momomediaext.b */
/* JADX INFO: loaded from: classes7.dex */
public class C3913b {

    /* JADX INFO: renamed from: c */
    private Timer f13915c;

    /* JADX INFO: renamed from: e */
    private String f13917e;

    /* JADX INFO: renamed from: g */
    private c f13919g;

    /* JADX INFO: renamed from: h */
    private Sticker f13920h;

    /* JADX INFO: renamed from: a */
    private int f13913a = 0;

    /* JADX INFO: renamed from: b */
    private int f13914b = 0;

    /* JADX INFO: renamed from: d */
    private int f13916d = 0;

    /* JADX INFO: renamed from: f */
    private Bitmap f13918f = null;

    /* JADX INFO: renamed from: com.immomo.momomediaext.b$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (C3913b.this.f13920h == null) {
                C3913b.this.m19291e();
            }
            if (C3913b.this.f13920h != null) {
                C3913b.this.f13919g.mo19231a(C3913b.this.f13920h);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.b$b */
    public class b implements ImageDelegateProvider {
        public b() {
        }

        @Override // com.momo.mcamera.mask.delegate.ImageDelegateProvider
        public Bitmap getRealBitmap() {
            return C3913b.this.f13918f;
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.b$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo19231a(Sticker sticker);
    }

    public C3913b(String str) {
        this.f13917e = str;
    }

    /* JADX INFO: renamed from: d */
    private Bitmap m19290d(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        return BitmapFactory.decodeFile(str);
    }

    /* JADX INFO: renamed from: e */
    public boolean m19291e() {
        if (this.f13917e.length() <= 0) {
            Log.e("WaterMarkManager", "initSticker: water image path is empty");
            return false;
        }
        Bitmap bitmapM19290d = m19290d(this.f13917e);
        this.f13918f = bitmapM19290d;
        if (bitmapM19290d == null) {
            Log.e("WaterMarkManager", "initSticker: water image is null");
            return false;
        }
        Sticker sticker = new Sticker();
        this.f13920h = sticker;
        sticker.setDuration(7000L);
        this.f13920h.setAlwaysShow(true);
        this.f13920h.setShowTop(true);
        this.f13920h.setStickerType("0");
        this.f13920h.setFrameNumber(1);
        this.f13920h.setPreMultiAlpha(true);
        this.f13920h.setImageProvider(new b());
        this.f13920h.setType(5);
        int width = (int) ((this.f13918f.getWidth() * 14.0f) / this.f13918f.getHeight());
        AbsolutePosition absolutePosition = new AbsolutePosition();
        ObjectRegion objectRegion = new ObjectRegion();
        objectRegion.f14250h = 14.0f;
        float f = width;
        objectRegion.f14251w = f;
        objectRegion.f14252x = ((412.0f - (f / 2.0f)) - 10.0f) / 540.0f;
        objectRegion.f14253y = 0.059375f;
        absolutePosition.setCenter(objectRegion);
        this.f13920h.setAbsolutePos(absolutePosition);
        this.f13920h.setImageWidth(width);
        this.f13920h.setImageHeight(14);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m19292f() {
        this.f13915c.cancel();
        this.f13920h = null;
    }

    /* JADX INFO: renamed from: g */
    public void m19293g(int i, c cVar) {
        this.f13916d = i;
        this.f13919g = cVar;
        Timer timer = new Timer("momolivemedia-WatermarkTimerManager");
        this.f13915c = timer;
        timer.schedule(new a(), 0L, i);
    }
}
