package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.AnimationDrawable;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.DraweeView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Locale;
import l.c3c0;
import l.ftd0;
import l.knb0;
import l.qib0;
import l.t100;
import l.x1c0;
import l.xdl0;
import org.spongycastle.crypto.tls.CipherSuite;
import p003l.n000;
import p003l.ruy;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemImagesBlock extends FrameLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public VDraweeView[] f929a;

    /* JADX INFO: renamed from: b */
    public VText[] f930b;

    /* JADX INFO: renamed from: c */
    public Message f931c;

    /* JADX INFO: renamed from: d */
    public AnimationDrawable f932d;

    /* JADX INFO: renamed from: e */
    public Shape[] f933e;

    /* JADX INFO: renamed from: f */
    public VImage f934f;

    /* JADX INFO: renamed from: g */
    public int f935g;

    public enum Shape {
        LEFT,
        RIGHT,
        LEFT_TOP,
        RIGHT_TOP,
        LEFT_CENTER,
        RIGHT_CENTER,
        LEFT_BOTTOM,
        RIGHT_BOTTOM
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemImagesBlock$a */
    public static /* synthetic */ class C0073a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f936a;

        static {
            int[] iArr = new int[Shape.values().length];
            f936a = iArr;
            try {
                iArr[Shape.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f936a[Shape.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ItemImagesBlock(Context context) {
        super(context);
        this.f935g = -1;
    }

    /* JADX INFO: renamed from: d */
    public static Point m1303d(int i, int i2, boolean z) {
        int iD = t100.d(140.0f);
        int iD2 = z ? t100.d(78.0f) : t100.F;
        float f = (i * 1.0f) / i2;
        float f2 = iD2;
        float f3 = iD;
        if (f > (f2 * 1.0f) / f3) {
            if (f < (1.0f * f3) / f2) {
                if (i >= i2) {
                    if (i > iD) {
                        i2 = (int) (f3 / f);
                    } else if (i2 < iD2) {
                        i = (int) (f2 * f);
                        i2 = iD2;
                    }
                } else if (i2 > iD) {
                    i = (int) (f3 * f);
                } else if (i < iD2) {
                    i2 = (int) (f2 / f);
                    i = iD2;
                }
                return new Point(i, i2);
            }
            i2 = iD2;
            i = iD;
            return new Point(i, i2);
        }
        i = iD2;
        i2 = iD;
        return new Point(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        char c;
        this.f931c = message;
        boolean z = CoreModule.l.i().z(message.owner);
        removeAllViews();
        if (NullChecker.a(message.media)) {
            m1305e(message.media.size());
        }
        char c2 = 0;
        if (message.chatTyping) {
            ImageView imageView = this.f929a[0];
            imageView.setLayoutParams(new FrameLayout.LayoutParams(t100.d(65.0f), t100.d(38.0f)));
            imageView.setBackgroundResource(c3c0.s7);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            AnimationDrawable animationDrawable = this.f932d;
            if (animationDrawable != null) {
                if (animationDrawable.isRunning()) {
                    return;
                }
                this.f932d.start();
                return;
            } else {
                imageView.setImageResource(c3c0.x7);
                AnimationDrawable animationDrawable2 = (AnimationDrawable) imageView.getDrawable();
                this.f932d = animationDrawable2;
                animationDrawable2.start();
                return;
            }
        }
        int i = 0;
        while (true) {
            VDraweeView[] vDraweeViewArr = this.f929a;
            if (i >= vDraweeViewArr.length) {
                break;
            }
            m1308h(this.f933e[i], vDraweeViewArr[i]);
            i++;
        }
        Point[] pointArr = new Point[message.media.size()];
        int i2 = 0;
        for (int i3 = 0; i3 < message.media.size(); i3++) {
            Dimension dimension = ((Media) message.media.get(i3)).cover().size;
            if (dimension == null || dimension.width == 0 || dimension.height == 0) {
                dimension = new Dimension(CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256);
            }
            Point pointM1303d = m1303d(dimension.width - t100.d(12.0f), dimension.height, message.media.get(i3) instanceof Video);
            pointArr[i3] = pointM1303d;
            i2 += pointM1303d.x;
        }
        int length = i2 / this.f929a.length;
        int i4 = 0;
        int iD = 0;
        while (true) {
            DraweeView[] draweeViewArr = this.f929a;
            if (i4 >= draweeViewArr.length) {
                break;
            }
            Point point = pointArr[i4];
            point.y = (point.y * length) / point.x;
            point.x = length;
            DraweeView draweeView = draweeViewArr[i4];
            MultiAutoCompleteTextView multiAutoCompleteTextView = this.f930b[i4];
            Point point2 = pointArr[i4];
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(point2.x, point2.y);
            if (i4 == 0) {
                iD += t100.d(6.0f);
            }
            layoutParams.topMargin = iD;
            layoutParams.leftMargin = t100.d(6.0f);
            layoutParams.rightMargin = t100.d(6.0f);
            layoutParams.bottomMargin = t100.d(6.0f);
            iD += pointArr[i4].y + t100.d(6.0f);
            draweeView.setLayoutParams(layoutParams);
            int i5 = pointArr[c2].x;
            Video video = (Media) message.media.get(i4);
            if (!TEnum.equals(((Media) video).status, "raw") || ((video instanceof Video) && NullChecker.a(((Media) video.cover).url))) {
                qib0.G.O(draweeView, video.cover().calculatedWidth(i5).formatted(), 7, 20);
                draweeView.setZoomAnimationKey(n000.m6523h(message, video.cover()));
            } else {
                qib0.G.o(draweeView);
            }
            if (video instanceof Video) {
                multiAutoCompleteTextView.setLayoutParams(layoutParams);
                multiAutoCompleteTextView.setTextColor(Color.parseColor("#ffffff"));
                multiAutoCompleteTextView.setTextSize(12.0f);
                multiAutoCompleteTextView.setGravity(85);
                c = 0;
                multiAutoCompleteTextView.setPadding(0, 0, t100.d(5.0f), t100.d(5.0f));
                int i6 = (int) video.duration;
                multiAutoCompleteTextView.setText(String.format(Locale.getDefault(), "%02d:%02d", Integer.valueOf(i6 / 60), Integer.valueOf(i6 % 60)));
            } else {
                c = 0;
                multiAutoCompleteTextView.setText("");
            }
            i4++;
            c2 = c;
        }
        VImage vImage = this.f934f;
        if (z) {
            vImage.setImageResource(c3c0.k7);
        } else {
            vImage.setImageResource(c3c0.l7);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public MessagesAct m1304c() {
        return (MessagesAct) getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public void m1305e(int i) {
        VDraweeView[] vDraweeViewArr = new VDraweeView[i];
        VText[] vTextArr = new VText[i];
        this.f933e = new Shape[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            vDraweeViewArr[i3] = new VDraweeView(getContext());
            vTextArr[i3] = new VText(getContext());
            this.f933e[i3] = Shape.LEFT;
        }
        this.f929a = vDraweeViewArr;
        this.f930b = vTextArr;
        while (true) {
            VDraweeView[] vDraweeViewArr2 = this.f929a;
            if (i2 >= vDraweeViewArr2.length) {
                this.f934f = new VImage(getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.d(62.0f), t100.d(40.0f));
                layoutParams.gravity = 17;
                addViewInLayout(this.f934f, getChildCount(), layoutParams, true);
                return;
            }
            GLSurfaceView gLSurfaceView = vDraweeViewArr2[i2];
            gLSurfaceView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.u4q
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f7922a.m1306f(i2, view);
                }
            });
            xdl0.E0(gLSurfaceView, new View.OnClickListener() { // from class: l.v4q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8206a.m1307g(view);
                }
            });
            addViewInLayout(gLSurfaceView, getChildCount(), generateDefaultLayoutParams(), true);
            addViewInLayout(this.f930b[i2], getChildCount(), generateDefaultLayoutParams(), true);
            i2++;
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean m1306f(int i, View view) {
        this.f935g = i;
        ItemMessageBase.m1395R(this).onLongClick(null);
        this.f935g = -1;
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m1307g(View view) {
        if (!ruy.m7381g().m7384e(this.f931c.cid)) {
            CoreModule.P().i().showProofAgeDlg(m1304c(), "chat_page_hidden_message");
        } else if (this.f931c.media.isEmpty() || !(this.f931c.media.get(0) instanceof Video)) {
            m1304c().m2060R2("picture", this.f931c.owner);
        } else {
            m1304c().m2060R2("video", this.f931c.owner);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m1308h(Shape shape, VDraweeView vDraweeView) {
        float dimension = CoreModule.b.getResources().getDimension(x1c0.j);
        int i = C0073a.f936a[shape.ordinal()];
        RoundingParams roundingParamsB = (i == 1 || i == 2) ? RoundingParams.b(dimension, dimension, dimension, dimension) : null;
        if (vDraweeView.getHierarchy() == null) {
            vDraweeView.setHierarchy(qib0.G.l().a());
        }
        vDraweeView.getHierarchy().H(roundingParamsB);
        vDraweeView.getHierarchy().y(0);
        vDraweeView.getHierarchy().F(getContext().getResources().getDrawable(c3c0.O7), ftd0.g);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public ItemImagesBlock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f935g = -1;
    }

    public ItemImagesBlock(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f935g = -1;
    }
}
