package com.p000p1.mobile.putong.core.p001ui.messages.media.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import com.core.glcore.util.BitmapPrivateProtocolUtil;
import com.facebook.drawee.generic.RoundingParams;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.PlayerView;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.CrashHelper;
import l.c3c0;
import l.cfd0;
import l.d43;
import l.l680;
import l.qib0;
import l.r5l0;
import l.rhi;
import l.s5l0;
import l.t100;
import l.xdl0;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p028v.VDraweeView;
import p028v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ShootingResultView extends CardView {

    /* JADX INFO: renamed from: a */
    public PlayerView f1723a;

    /* JADX INFO: renamed from: b */
    public ImageView f1724b;

    /* JADX INFO: renamed from: c */
    public TextView f1725c;

    /* JADX INFO: renamed from: d */
    public Bitmap f1726d;

    /* JADX INFO: renamed from: e */
    public String f1727e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f1728f;

    /* JADX INFO: renamed from: g */
    public boolean f1729g;

    /* JADX INFO: renamed from: h */
    public final Context f1730h;

    /* JADX INFO: renamed from: i */
    public Video f1731i;

    /* JADX INFO: renamed from: j */
    public View f1732j;

    /* JADX INFO: renamed from: k */
    public InterfaceC0120b f1733k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.ShootingResultView$a */
    public class ViewOnTouchListenerC0119a implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public float f1734a;

        /* JADX INFO: renamed from: b */
        public float f1735b;

        /* JADX INFO: renamed from: c */
        public float f1736c;

        /* JADX INFO: renamed from: d */
        public float f1737d;

        public ViewOnTouchListenerC0119a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.f1734a = motionEvent.getX();
                this.f1735b = motionEvent.getY();
            }
            if (motionEvent.getAction() == 1) {
                this.f1736c = motionEvent.getX();
                float y = motionEvent.getY();
                this.f1737d = y;
                if (y - this.f1735b <= t100.d(80.0f) || this.f1734a - this.f1736c >= t100.d(20.0f)) {
                    if (ShootingResultView.this.f1723a != null && ShootingResultView.this.f1723a.getVisibility() == 0) {
                        ShootingResultView.this.f1723a.z();
                    }
                } else if (ShootingResultView.this.f1733k != null) {
                    ShootingResultView.this.f1733k.mo2344a();
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.ShootingResultView$b */
    public interface InterfaceC0120b {
        /* JADX INFO: renamed from: a */
        void mo2344a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootingResultView(@NonNull Context context) {
        super(context);
        this.f1730h = context;
        setBackgroundResource(c3c0.c4);
        setCardElevation(0.0f);
        setRadius(t100.d(16.0f));
        setClickable(true);
        m2337j();
        m2336i();
        m2339l();
        m2335h();
        m2338k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public void m2334f(boolean z) {
        if (getVisibility() != 0) {
            return;
        }
        TextView textView = this.f1725c;
        if (!z) {
            textView.setVisibility(0);
            this.f1725c.setClickable(true);
            this.f1732j.setVisibility(0);
            this.f1728f.setVisibility(8);
            if (this.f1729g) {
                this.f1724b.setVisibility(0);
                return;
            } else {
                this.f1723a.setVisibility(0);
                return;
            }
        }
        textView.setVisibility(8);
        this.f1725c.setClickable(false);
        this.f1732j.setVisibility(8);
        if (this.f1729g) {
            this.f1728f.setImageBitmap(this.f1726d);
        } else if (!TextUtils.isEmpty(this.f1727e)) {
            qib0.G.i0(this.f1728f, this.f1727e);
        }
        this.f1728f.setVisibility(0);
        this.f1724b.setVisibility(8);
        this.f1723a.setVisibility(8);
    }

    public View getCancelView() {
        return this.f1725c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final void m2335h() {
        this.f1725c = new TextView(this.f1730h);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(xdl0.w(60.0f), xdl0.w(40.0f));
        int iW = xdl0.w(16.0f);
        layoutParams.topMargin = iW;
        layoutParams.rightMargin = iW;
        layoutParams.gravity = 5;
        this.f1725c.setText(R.string.y5);
        this.f1725c.setTextSize(14.0f);
        this.f1725c.setGravity(17);
        this.f1725c.setTextColor(-1);
        this.f1725c.setBackground(this.f1730h.getResources().getDrawable(c3c0.n4));
        this.f1725c.setLayoutParams(layoutParams);
        addView(this.f1725c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final void m2336i() {
        this.f1724b = new VImage(this.f1730h);
        this.f1724b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f1724b.setScaleType(ImageView.ScaleType.CENTER);
        this.f1724b.setVisibility(8);
        addView(this.f1724b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final void m2337j() {
        this.f1723a = new PlayerView(this.f1730h);
        this.f1723a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f1723a.setRadius(xdl0.w(8.0f));
        this.f1723a.setProgressBarsEnabled(false);
        l680 l680Var = new l680();
        l680Var.a("chat");
        this.f1723a.setPlayer(l680Var);
        this.f1731i = new Video();
        this.f1723a.setVisibility(8);
        addView(this.f1723a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.ImageView, v.VDraweeView] */
    /* JADX INFO: renamed from: k */
    public final void m2338k() {
        ?? vDraweeView = new VDraweeView(this.f1730h);
        this.f1728f = vDraweeView;
        vDraweeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, xdl0.F(this.f1730h.getApplicationContext()).x / 3);
        layoutParams.gravity = 80;
        this.f1728f.getHierarchy().H(RoundingParams.c(8.0f));
        this.f1728f.setLayoutParams(layoutParams);
        addView(this.f1728f);
        this.f1728f.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final void m2339l() {
        this.f1732j = new View(this.f1730h);
        this.f1732j.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f1732j.setOnTouchListener(new ViewOnTouchListenerC0119a());
        addView(this.f1732j);
    }

    /* JADX INFO: renamed from: m */
    public void m2340m(String str, boolean z, float f) {
        this.f1729g = z;
        ImageView imageView = this.f1724b;
        if (z) {
            imageView.setVisibility(0);
            this.f1723a.setVisibility(8);
            Bitmap bitmap = BitmapPrivateProtocolUtil.getBitmap(str);
            Drawable drawableA = cfd0.a(this.f1730h.getResources(), bitmap);
            drawableA.e(f);
            this.f1724b.setImageDrawable(drawableA);
            this.f1726d = bitmap;
            return;
        }
        imageView.setVisibility(8);
        this.f1723a.setVisibility(0);
        this.f1723a.h.setVisibility(8);
        Video video = this.f1731i;
        ((Media) video).url = str;
        video.cover = new Picture();
        s5l0 s5l0Var = new s5l0(new r5l0(rhi.z(str)), false, false);
        try {
            ((Media) this.f1731i.cover).url = rhi.B(s5l0Var.c(0));
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        this.f1731i.cover.size = new Dimension(s5l0Var.k());
        Video video2 = this.f1731i;
        ((Media) video2.cover).mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        this.f1723a.setVideo(video2);
        this.f1723a.setLoopMode(true);
        this.f1723a.L(true);
        this.f1727e = ((Media) this.f1731i.cover).url;
    }

    /* JADX INFO: renamed from: n */
    public void m2341n(String str, int i) {
        int i2;
        Bitmap bitmapCreateScaledBitmap;
        Bitmap bitmapA;
        Bitmap bitmapCreateScaledBitmap2;
        this.f1724b.setVisibility(0);
        this.f1723a.setVisibility(8);
        Bitmap bitmap = BitmapPrivateProtocolUtil.getBitmap(str);
        if (bitmap == null || (bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (i2 = t100.R), i2, true)) == null || (bitmapA = d43.a(bitmapCreateScaledBitmap, t100.d(4.0f), false)) == null || (bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapA, i, i, true)) == null) {
            return;
        }
        Drawable drawableA = cfd0.a(this.f1730h.getResources(), d43.a(bitmapCreateScaledBitmap2, t100.d(4.0f), false));
        if (drawableA == null) {
            return;
        }
        drawableA.e(xdl0.w(24.0f));
        this.f1724b.setImageDrawable(drawableA);
    }

    /* JADX INFO: renamed from: o */
    public void m2342o(Drawable drawable) {
        this.f1729g = true;
        this.f1724b.setVisibility(0);
        this.f1723a.setVisibility(8);
        this.f1724b.setImageDrawable(drawable);
    }

    /* JADX INFO: renamed from: p */
    public void m2343p() {
        this.f1723a.N();
    }

    public void setCancelClickListener(@NonNull View.OnClickListener onClickListener) {
        this.f1725c.setOnClickListener(onClickListener);
    }

    public void setResultViewListener(InterfaceC0120b interfaceC0120b) {
        this.f1733k = interfaceC0120b;
    }
}
