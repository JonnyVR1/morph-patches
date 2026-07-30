package com.p046p1.mobile.putong.core.p053ui.messages.media.widget;

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
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.PlayerView;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.CrashHelper;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.bfd0;
import p149l.c3c0;
import p149l.cfd0;
import p149l.d43;
import p149l.l680;
import p149l.qib0;
import p149l.r5l0;
import p149l.rhi;
import p149l.s5l0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class ShootingResultView extends CardView {

    /* JADX INFO: renamed from: a */
    public PlayerView f31832a;

    /* JADX INFO: renamed from: b */
    public ImageView f31833b;

    /* JADX INFO: renamed from: c */
    public TextView f31834c;

    /* JADX INFO: renamed from: d */
    public Bitmap f31835d;

    /* JADX INFO: renamed from: e */
    public String f31836e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f31837f;

    /* JADX INFO: renamed from: g */
    public boolean f31838g;

    /* JADX INFO: renamed from: h */
    public final Context f31839h;

    /* JADX INFO: renamed from: i */
    public Video f31840i;

    /* JADX INFO: renamed from: j */
    public View f31841j;

    /* JADX INFO: renamed from: k */
    public InterfaceC8537b f31842k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.ShootingResultView$a */
    public class ViewOnTouchListenerC8536a implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public float f31843a;

        /* JADX INFO: renamed from: b */
        public float f31844b;

        /* JADX INFO: renamed from: c */
        public float f31845c;

        /* JADX INFO: renamed from: d */
        public float f31846d;

        public ViewOnTouchListenerC8536a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.f31843a = motionEvent.getX();
                this.f31844b = motionEvent.getY();
            }
            if (motionEvent.getAction() == 1) {
                this.f31845c = motionEvent.getX();
                float y = motionEvent.getY();
                this.f31846d = y;
                if (y - this.f31844b <= t100.m186890d(80.0f) || this.f31843a - this.f31845c >= t100.m186890d(20.0f)) {
                    if (ShootingResultView.this.f31832a != null && ShootingResultView.this.f31832a.getVisibility() == 0) {
                        ShootingResultView.this.f31832a.m44049z();
                    }
                } else if (ShootingResultView.this.f31842k != null) {
                    ShootingResultView.this.f31842k.mo49225a();
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.ShootingResultView$b */
    public interface InterfaceC8537b {
        /* JADX INFO: renamed from: a */
        void mo49225a();
    }

    public ShootingResultView(@NonNull Context context) {
        super(context);
        this.f31839h = context;
        setBackgroundResource(c3c0.f78715c4);
        setCardElevation(0.0f);
        setRadius(t100.m186890d(16.0f));
        setClickable(true);
        m49218j();
        m49217i();
        m49220l();
        m49216h();
        m49219k();
    }

    /* JADX INFO: renamed from: f */
    public void m49215f(boolean z) {
        if (getVisibility() != 0) {
            return;
        }
        TextView textView = this.f31834c;
        if (!z) {
            textView.setVisibility(0);
            this.f31834c.setClickable(true);
            this.f31841j.setVisibility(0);
            this.f31837f.setVisibility(8);
            if (this.f31838g) {
                this.f31833b.setVisibility(0);
                return;
            } else {
                this.f31832a.setVisibility(0);
                return;
            }
        }
        textView.setVisibility(8);
        this.f31834c.setClickable(false);
        this.f31841j.setVisibility(8);
        if (this.f31838g) {
            this.f31837f.setImageBitmap(this.f31835d);
        } else if (!TextUtils.isEmpty(this.f31836e)) {
            qib0.f154691G.m102363i0(this.f31837f, this.f31836e);
        }
        this.f31837f.setVisibility(0);
        this.f31833b.setVisibility(8);
        this.f31832a.setVisibility(8);
    }

    public View getCancelView() {
        return this.f31834c;
    }

    /* JADX INFO: renamed from: h */
    public final void m49216h() {
        this.f31834c = new TextView(this.f31839h);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(xdl0.m208407w(60.0f), xdl0.m208407w(40.0f));
        int iM208407w = xdl0.m208407w(16.0f);
        layoutParams.topMargin = iM208407w;
        layoutParams.rightMargin = iM208407w;
        layoutParams.gravity = 5;
        this.f31834c.setText(R$string.f21130y5);
        this.f31834c.setTextSize(14.0f);
        this.f31834c.setGravity(17);
        this.f31834c.setTextColor(-1);
        this.f31834c.setBackground(this.f31839h.getResources().getDrawable(c3c0.f78814n4));
        this.f31834c.setLayoutParams(layoutParams);
        addView(this.f31834c);
    }

    /* JADX INFO: renamed from: i */
    public final void m49217i() {
        this.f31833b = new VImage(this.f31839h);
        this.f31833b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f31833b.setScaleType(ImageView.ScaleType.CENTER);
        this.f31833b.setVisibility(8);
        addView(this.f31833b);
    }

    /* JADX INFO: renamed from: j */
    public final void m49218j() {
        this.f31832a = new PlayerView(this.f31839h);
        this.f31832a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f31832a.setRadius(xdl0.m208407w(8.0f));
        this.f31832a.setProgressBarsEnabled(false);
        l680 l680Var = new l680();
        l680Var.mo105366a("chat");
        this.f31832a.setPlayer(l680Var);
        this.f31840i = new Video();
        this.f31832a.setVisibility(8);
        addView(this.f31832a);
    }

    /* JADX INFO: renamed from: k */
    public final void m49219k() {
        VDraweeView vDraweeView = new VDraweeView(this.f31839h);
        this.f31837f = vDraweeView;
        vDraweeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, xdl0.m208330F(this.f31839h.getApplicationContext()).x / 3);
        layoutParams.gravity = 80;
        this.f31837f.getHierarchy().m112053H(RoundingParams.m8249c(8.0f));
        this.f31837f.setLayoutParams(layoutParams);
        addView(this.f31837f);
        this.f31837f.setVisibility(8);
    }

    /* JADX INFO: renamed from: l */
    public final void m49220l() {
        this.f31841j = new View(this.f31839h);
        this.f31841j.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f31841j.setOnTouchListener(new ViewOnTouchListenerC8536a());
        addView(this.f31841j);
    }

    /* JADX INFO: renamed from: m */
    public void m49221m(String str, boolean z, float f) {
        this.f31838g = z;
        ImageView imageView = this.f31833b;
        if (z) {
            imageView.setVisibility(0);
            this.f31832a.setVisibility(8);
            Bitmap bitmap = BitmapPrivateProtocolUtil.getBitmap(str);
            bfd0 bfd0VarM106505a = cfd0.m106505a(this.f31839h.getResources(), bitmap);
            bfd0VarM106505a.m101528e(f);
            this.f31833b.setImageDrawable(bfd0VarM106505a);
            this.f31835d = bitmap;
            return;
        }
        imageView.setVisibility(8);
        this.f31832a.setVisibility(0);
        this.f31832a.f28115h.setVisibility(8);
        Video video = this.f31840i;
        video.url = str;
        video.cover = new Picture();
        s5l0 s5l0Var = new s5l0(new r5l0(rhi.m179382z(str)), false, false);
        try {
            this.f31840i.cover.url = rhi.m179355B(s5l0Var.m182356c(0));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        this.f31840i.cover.size = new Dimension(s5l0Var.m182362k());
        Video video2 = this.f31840i;
        video2.cover.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        this.f31832a.setVideo(video2);
        this.f31832a.setLoopMode(true);
        this.f31832a.m44043L(true);
        this.f31836e = this.f31840i.cover.url;
    }

    /* JADX INFO: renamed from: n */
    public void m49222n(String str, int i) {
        int i2;
        Bitmap bitmapCreateScaledBitmap;
        Bitmap bitmapM109969a;
        Bitmap bitmapCreateScaledBitmap2;
        this.f31833b.setVisibility(0);
        this.f31832a.setVisibility(8);
        Bitmap bitmap = BitmapPrivateProtocolUtil.getBitmap(str);
        if (bitmap == null || (bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (i2 = t100.f167243R), i2, true)) == null || (bitmapM109969a = d43.m109969a(bitmapCreateScaledBitmap, t100.m186890d(4.0f), false)) == null || (bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapM109969a, i, i, true)) == null) {
            return;
        }
        bfd0 bfd0VarM106505a = cfd0.m106505a(this.f31839h.getResources(), d43.m109969a(bitmapCreateScaledBitmap2, t100.m186890d(4.0f), false));
        if (bfd0VarM106505a == null) {
            return;
        }
        bfd0VarM106505a.m101528e(xdl0.m208407w(24.0f));
        this.f31833b.setImageDrawable(bfd0VarM106505a);
    }

    /* JADX INFO: renamed from: o */
    public void m49223o(Drawable drawable) {
        this.f31838g = true;
        this.f31833b.setVisibility(0);
        this.f31832a.setVisibility(8);
        this.f31833b.setImageDrawable(drawable);
    }

    /* JADX INFO: renamed from: p */
    public void m49224p() {
        this.f31832a.m44045N();
    }

    public void setCancelClickListener(@NonNull View.OnClickListener onClickListener) {
        this.f31834c.setOnClickListener(onClickListener);
    }

    public void setResultViewListener(InterfaceC8537b interfaceC8537b) {
        this.f31842k = interfaceC8537b;
    }
}
