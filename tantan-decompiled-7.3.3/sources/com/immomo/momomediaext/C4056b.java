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
public class C4056b {

    /* JADX INFO: renamed from: c */
    private Timer f14609c;

    /* JADX INFO: renamed from: e */
    private String f14611e;

    /* JADX INFO: renamed from: g */
    private c f14613g;

    /* JADX INFO: renamed from: h */
    private Sticker f14614h;

    /* JADX INFO: renamed from: a */
    private int f14607a = 0;

    /* JADX INFO: renamed from: b */
    private int f14608b = 0;

    /* JADX INFO: renamed from: d */
    private int f14610d = 0;

    /* JADX INFO: renamed from: f */
    private Bitmap f14612f = null;

    /* JADX INFO: renamed from: com.immomo.momomediaext.b$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (C4056b.this.f14614h == null) {
                C4056b.this.m20271e();
            }
            if (C4056b.this.f14614h != null) {
                C4056b.this.f14613g.mo20211a(C4056b.this.f14614h);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.b$b */
    public class b implements ImageDelegateProvider {
        public b() {
        }

        @Override // com.momo.mcamera.mask.delegate.ImageDelegateProvider
        public Bitmap getRealBitmap() {
            return C4056b.this.f14612f;
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.b$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo20211a(Sticker sticker);
    }

    public C4056b(String str) {
        this.f14611e = str;
    }

    /* JADX INFO: renamed from: d */
    private Bitmap m20270d(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        return BitmapFactory.decodeFile(str);
    }

    /* JADX INFO: renamed from: e */
    public boolean m20271e() {
        if (this.f14611e.length() <= 0) {
            Log.e("WaterMarkManager", "initSticker: water image path is empty");
            return false;
        }
        Bitmap bitmapM20270d = m20270d(this.f14611e);
        this.f14612f = bitmapM20270d;
        if (bitmapM20270d == null) {
            Log.e("WaterMarkManager", "initSticker: water image is null");
            return false;
        }
        Sticker sticker = new Sticker();
        this.f14614h = sticker;
        sticker.setDuration(7000L);
        this.f14614h.setAlwaysShow(true);
        this.f14614h.setShowTop(true);
        this.f14614h.setStickerType("0");
        this.f14614h.setFrameNumber(1);
        this.f14614h.setPreMultiAlpha(true);
        this.f14614h.setImageProvider(new b());
        this.f14614h.setType(5);
        int width = (int) ((this.f14612f.getWidth() * 14.0f) / this.f14612f.getHeight());
        AbsolutePosition absolutePosition = new AbsolutePosition();
        ObjectRegion objectRegion = new ObjectRegion();
        objectRegion.f14969h = 14.0f;
        float f = width;
        objectRegion.f14970w = f;
        objectRegion.f14971x = ((412.0f - (f / 2.0f)) - 10.0f) / 540.0f;
        objectRegion.f14972y = 0.059375f;
        absolutePosition.setCenter(objectRegion);
        this.f14614h.setAbsolutePos(absolutePosition);
        this.f14614h.setImageWidth(width);
        this.f14614h.setImageHeight(14);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m20272f() {
        this.f14609c.cancel();
        this.f14614h = null;
    }

    /* JADX INFO: renamed from: g */
    public void m20273g(int i, c cVar) {
        this.f14610d = i;
        this.f14613g = cVar;
        Timer timer = new Timer("momolivemedia-WatermarkTimerManager");
        this.f14609c = timer;
        timer.schedule(new a(), 0L, i);
    }
}
