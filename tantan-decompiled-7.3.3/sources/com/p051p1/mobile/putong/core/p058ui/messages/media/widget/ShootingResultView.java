package com.p051p1.mobile.putong.core.p058ui.messages.media.widget;

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
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.PlayerView;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.CrashHelper;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.dnd0;
import p153l.end0;
import p153l.ibc0;
import p153l.oki;
import p153l.qa00;
import p153l.re80;
import p153l.t43;
import p153l.uqb0;
import p153l.vel0;
import p153l.wel0;

/* JADX INFO: loaded from: classes3.dex */
public class ShootingResultView extends CardView {

    /* JADX INFO: renamed from: a */
    public PlayerView f32680a;

    /* JADX INFO: renamed from: b */
    public ImageView f32681b;

    /* JADX INFO: renamed from: c */
    public TextView f32682c;

    /* JADX INFO: renamed from: d */
    public Bitmap f32683d;

    /* JADX INFO: renamed from: e */
    public String f32684e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f32685f;

    /* JADX INFO: renamed from: g */
    public boolean f32686g;

    /* JADX INFO: renamed from: h */
    public final Context f32687h;

    /* JADX INFO: renamed from: i */
    public Video f32688i;

    /* JADX INFO: renamed from: j */
    public View f32689j;

    /* JADX INFO: renamed from: k */
    public InterfaceC8700b f32690k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.ShootingResultView$a */
    public class ViewOnTouchListenerC8699a implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public float f32691a;

        /* JADX INFO: renamed from: b */
        public float f32692b;

        /* JADX INFO: renamed from: c */
        public float f32693c;

        /* JADX INFO: renamed from: d */
        public float f32694d;

        public ViewOnTouchListenerC8699a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.f32691a = motionEvent.getX();
                this.f32692b = motionEvent.getY();
            }
            if (motionEvent.getAction() == 1) {
                this.f32693c = motionEvent.getX();
                float y = motionEvent.getY();
                this.f32694d = y;
                if (y - this.f32692b <= qa00.m175859d(80.0f) || this.f32691a - this.f32693c >= qa00.m175859d(20.0f)) {
                    if (ShootingResultView.this.f32680a != null && ShootingResultView.this.f32680a.getVisibility() == 0) {
                        ShootingResultView.this.f32680a.m45232z();
                    }
                } else if (ShootingResultView.this.f32690k != null) {
                    ShootingResultView.this.f32690k.mo50408a();
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.ShootingResultView$b */
    public interface InterfaceC8700b {
        /* JADX INFO: renamed from: a */
        void mo50408a();
    }

    public ShootingResultView(@NonNull Context context) {
        super(context);
        this.f32687h = context;
        setBackgroundResource(ibc0.f113990c4);
        setCardElevation(0.0f);
        setRadius(qa00.m175859d(16.0f));
        setClickable(true);
        m50401j();
        m50400i();
        m50403l();
        m50399h();
        m50402k();
    }

    /* JADX INFO: renamed from: f */
    public void m50398f(boolean z) {
        if (getVisibility() != 0) {
            return;
        }
        TextView textView = this.f32682c;
        if (!z) {
            textView.setVisibility(0);
            this.f32682c.setClickable(true);
            this.f32689j.setVisibility(0);
            this.f32685f.setVisibility(8);
            if (this.f32686g) {
                this.f32681b.setVisibility(0);
                return;
            } else {
                this.f32680a.setVisibility(0);
                return;
            }
        }
        textView.setVisibility(8);
        this.f32682c.setClickable(false);
        this.f32689j.setVisibility(8);
        if (this.f32686g) {
            this.f32685f.setImageBitmap(this.f32683d);
        } else if (!TextUtils.isEmpty(this.f32684e)) {
            uqb0.f180374G.m127146i0(this.f32685f, this.f32684e);
        }
        this.f32685f.setVisibility(0);
        this.f32681b.setVisibility(8);
        this.f32680a.setVisibility(8);
    }

    public View getCancelView() {
        return this.f32682c;
    }

    /* JADX INFO: renamed from: h */
    public final void m50399h() {
        this.f32682c = new TextView(this.f32687h);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(bnl0.m105587w(60.0f), bnl0.m105587w(40.0f));
        int iM105587w = bnl0.m105587w(16.0f);
        layoutParams.topMargin = iM105587w;
        layoutParams.rightMargin = iM105587w;
        layoutParams.gravity = 5;
        this.f32682c.setText(R$string.f21872y5);
        this.f32682c.setTextSize(14.0f);
        this.f32682c.setGravity(17);
        this.f32682c.setTextColor(-1);
        this.f32682c.setBackground(this.f32687h.getResources().getDrawable(ibc0.f114089n4));
        this.f32682c.setLayoutParams(layoutParams);
        addView(this.f32682c);
    }

    /* JADX INFO: renamed from: i */
    public final void m50400i() {
        this.f32681b = new VImage(this.f32687h);
        this.f32681b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f32681b.setScaleType(ImageView.ScaleType.CENTER);
        this.f32681b.setVisibility(8);
        addView(this.f32681b);
    }

    /* JADX INFO: renamed from: j */
    public final void m50401j() {
        this.f32680a = new PlayerView(this.f32687h);
        this.f32680a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f32680a.setRadius(bnl0.m105587w(8.0f));
        this.f32680a.setProgressBarsEnabled(false);
        re80 re80Var = new re80();
        re80Var.mo139591a("chat");
        this.f32680a.setPlayer(re80Var);
        this.f32688i = new Video();
        this.f32680a.setVisibility(8);
        addView(this.f32680a);
    }

    /* JADX INFO: renamed from: k */
    public final void m50402k() {
        VDraweeView vDraweeView = new VDraweeView(this.f32687h);
        this.f32685f = vDraweeView;
        vDraweeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, bnl0.m105510F(this.f32687h.getApplicationContext()).x / 3);
        layoutParams.gravity = 80;
        this.f32685f.getHierarchy().m207045H(RoundingParams.m8303c(8.0f));
        this.f32685f.setLayoutParams(layoutParams);
        addView(this.f32685f);
        this.f32685f.setVisibility(8);
    }

    /* JADX INFO: renamed from: l */
    public final void m50403l() {
        this.f32689j = new View(this.f32687h);
        this.f32689j.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f32689j.setOnTouchListener(new ViewOnTouchListenerC8699a());
        addView(this.f32689j);
    }

    /* JADX INFO: renamed from: m */
    public void m50404m(String str, boolean z, float f) {
        this.f32686g = z;
        ImageView imageView = this.f32681b;
        if (z) {
            imageView.setVisibility(0);
            this.f32680a.setVisibility(8);
            Bitmap bitmap = BitmapPrivateProtocolUtil.getBitmap(str);
            dnd0 dnd0VarM121524a = end0.m121524a(this.f32687h.getResources(), bitmap);
            dnd0VarM121524a.m117059e(f);
            this.f32681b.setImageDrawable(dnd0VarM121524a);
            this.f32683d = bitmap;
            return;
        }
        imageView.setVisibility(8);
        this.f32680a.setVisibility(0);
        this.f32680a.f28963h.setVisibility(8);
        Video video = this.f32688i;
        video.url = str;
        video.cover = new Picture();
        wel0 wel0Var = new wel0(new vel0(oki.m168038z(str)), false, false);
        try {
            this.f32688i.cover.url = oki.m168011B(wel0Var.m206013c(0));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        this.f32688i.cover.size = new Dimension(wel0Var.m206019k());
        Video video2 = this.f32688i;
        video2.cover.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        this.f32680a.setVideo(video2);
        this.f32680a.setLoopMode(true);
        this.f32680a.m45226L(true);
        this.f32684e = this.f32688i.cover.url;
    }

    /* JADX INFO: renamed from: n */
    public void m50405n(String str, int i) {
        int i2;
        Bitmap bitmapCreateScaledBitmap;
        Bitmap bitmapM189143a;
        Bitmap bitmapCreateScaledBitmap2;
        this.f32681b.setVisibility(0);
        this.f32680a.setVisibility(8);
        Bitmap bitmap = BitmapPrivateProtocolUtil.getBitmap(str);
        if (bitmap == null || (bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (i2 = qa00.f156305R), i2, true)) == null || (bitmapM189143a = t43.m189143a(bitmapCreateScaledBitmap, qa00.m175859d(4.0f), false)) == null || (bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapM189143a, i, i, true)) == null) {
            return;
        }
        dnd0 dnd0VarM121524a = end0.m121524a(this.f32687h.getResources(), t43.m189143a(bitmapCreateScaledBitmap2, qa00.m175859d(4.0f), false));
        if (dnd0VarM121524a == null) {
            return;
        }
        dnd0VarM121524a.m117059e(bnl0.m105587w(24.0f));
        this.f32681b.setImageDrawable(dnd0VarM121524a);
    }

    /* JADX INFO: renamed from: o */
    public void m50406o(Drawable drawable) {
        this.f32686g = true;
        this.f32681b.setVisibility(0);
        this.f32680a.setVisibility(8);
        this.f32681b.setImageDrawable(drawable);
    }

    /* JADX INFO: renamed from: p */
    public void m50407p() {
        this.f32680a.m45228N();
    }

    public void setCancelClickListener(@NonNull View.OnClickListener onClickListener) {
        this.f32682c.setOnClickListener(onClickListener);
    }

    public void setResultViewListener(InterfaceC8700b interfaceC8700b) {
        this.f32690k = interfaceC8700b;
    }
}
