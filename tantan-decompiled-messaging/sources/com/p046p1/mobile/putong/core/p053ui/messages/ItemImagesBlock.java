package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Locale;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.c3c0;
import p149l.ftd0;
import p149l.knb0;
import p149l.n000;
import p149l.qib0;
import p149l.ruy;
import p149l.t100;
import p149l.x1c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemImagesBlock extends FrameLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public VDraweeView[] f31038a;

    /* JADX INFO: renamed from: b */
    public VText[] f31039b;

    /* JADX INFO: renamed from: c */
    public Message f31040c;

    /* JADX INFO: renamed from: d */
    public AnimationDrawable f31041d;

    /* JADX INFO: renamed from: e */
    public Shape[] f31042e;

    /* JADX INFO: renamed from: f */
    public VImage f31043f;

    /* JADX INFO: renamed from: g */
    public int f31044g;

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
    public static /* synthetic */ class C8490a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31045a;

        static {
            int[] iArr = new int[Shape.values().length];
            f31045a = iArr;
            try {
                iArr[Shape.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31045a[Shape.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ItemImagesBlock(Context context) {
        super(context);
        this.f31044g = -1;
    }

    /* JADX INFO: renamed from: d */
    public static Point m48221d(int i, int i2, boolean z) {
        int iM186890d = t100.m186890d(140.0f);
        int iM186890d2 = z ? t100.m186890d(78.0f) : t100.f167231F;
        float f = (i * 1.0f) / i2;
        float f2 = iM186890d2;
        float f3 = iM186890d;
        if (f > (f2 * 1.0f) / f3) {
            if (f < (1.0f * f3) / f2) {
                if (i >= i2) {
                    if (i > iM186890d) {
                        i2 = (int) (f3 / f);
                    } else if (i2 < iM186890d2) {
                        i = (int) (f2 * f);
                        i2 = iM186890d2;
                    }
                } else if (i2 > iM186890d) {
                    i = (int) (f3 * f);
                } else if (i < iM186890d2) {
                    i2 = (int) (f2 / f);
                    i = iM186890d2;
                }
                return new Point(i, i2);
            }
            i2 = iM186890d2;
            i = iM186890d;
            return new Point(i, i2);
        }
        i = iM186890d2;
        i2 = iM186890d;
        return new Point(i, i2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        char c;
        this.f31040c = message;
        boolean zMo158478z = CoreModule.f17554l.m94658i().mo158478z(message.owner);
        removeAllViews();
        if (NullChecker.m81303a(message.media)) {
            m48223e(message.media.size());
        }
        char c2 = 0;
        if (message.chatTyping) {
            VDraweeView vDraweeView = this.f31038a[0];
            vDraweeView.setLayoutParams(new FrameLayout.LayoutParams(t100.m186890d(65.0f), t100.m186890d(38.0f)));
            vDraweeView.setBackgroundResource(c3c0.f78862s7);
            vDraweeView.setScaleType(ImageView.ScaleType.CENTER);
            AnimationDrawable animationDrawable = this.f31041d;
            if (animationDrawable != null) {
                if (animationDrawable.isRunning()) {
                    return;
                }
                this.f31041d.start();
                return;
            } else {
                vDraweeView.setImageResource(c3c0.f78907x7);
                AnimationDrawable animationDrawable2 = (AnimationDrawable) vDraweeView.getDrawable();
                this.f31041d = animationDrawable2;
                animationDrawable2.start();
                return;
            }
        }
        int i = 0;
        while (true) {
            VDraweeView[] vDraweeViewArr = this.f31038a;
            if (i >= vDraweeViewArr.length) {
                break;
            }
            m48226h(this.f31042e[i], vDraweeViewArr[i]);
            i++;
        }
        Point[] pointArr = new Point[message.media.size()];
        int i2 = 0;
        for (int i3 = 0; i3 < message.media.size(); i3++) {
            Dimension dimension = message.media.get(i3).cover().size;
            if (dimension == null || dimension.width == 0 || dimension.height == 0) {
                dimension = new Dimension(180, 180);
            }
            Point pointM48221d = m48221d(dimension.width - t100.m186890d(12.0f), dimension.height, message.media.get(i3) instanceof Video);
            pointArr[i3] = pointM48221d;
            i2 += pointM48221d.x;
        }
        int length = i2 / this.f31038a.length;
        int i4 = 0;
        int iM186890d = 0;
        while (true) {
            VDraweeView[] vDraweeViewArr2 = this.f31038a;
            if (i4 >= vDraweeViewArr2.length) {
                break;
            }
            Point point = pointArr[i4];
            point.y = (point.y * length) / point.x;
            point.x = length;
            VDraweeView vDraweeView2 = vDraweeViewArr2[i4];
            VText vText = this.f31039b[i4];
            Point point2 = pointArr[i4];
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(point2.x, point2.y);
            if (i4 == 0) {
                iM186890d += t100.m186890d(6.0f);
            }
            layoutParams.topMargin = iM186890d;
            layoutParams.leftMargin = t100.m186890d(6.0f);
            layoutParams.rightMargin = t100.m186890d(6.0f);
            layoutParams.bottomMargin = t100.m186890d(6.0f);
            iM186890d += pointArr[i4].y + t100.m186890d(6.0f);
            vDraweeView2.setLayoutParams(layoutParams);
            int i5 = pointArr[c2].x;
            Media media = message.media.get(i4);
            if (!TEnum.equals(media.status, "raw") || ((media instanceof Video) && NullChecker.m81303a(((Video) media).cover.url))) {
                qib0.f154691G.m102336O(vDraweeView2, media.cover().calculatedWidth(i5).formatted(), 7, 20);
                vDraweeView2.setZoomAnimationKey(n000.m157189h(message, media.cover()));
            } else {
                qib0.f154691G.m184725o(vDraweeView2);
            }
            if (media instanceof Video) {
                vText.setLayoutParams(layoutParams);
                vText.setTextColor(Color.parseColor("#ffffff"));
                vText.setTextSize(12.0f);
                vText.setGravity(85);
                c = 0;
                vText.setPadding(0, 0, t100.m186890d(5.0f), t100.m186890d(5.0f));
                int i6 = (int) ((Video) media).duration;
                vText.setText(String.format(Locale.getDefault(), "%02d:%02d", Integer.valueOf(i6 / 60), Integer.valueOf(i6 % 60)));
            } else {
                c = 0;
                vText.setText("");
            }
            i4++;
            c2 = c;
        }
        VImage vImage = this.f31043f;
        if (zMo158478z) {
            vImage.setImageResource(c3c0.f78790k7);
        } else {
            vImage.setImageResource(c3c0.f78799l7);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public MessagesAct m48222c() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: e */
    public void m48223e(int i) {
        VDraweeView[] vDraweeViewArr = new VDraweeView[i];
        VText[] vTextArr = new VText[i];
        this.f31042e = new Shape[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            vDraweeViewArr[i3] = new VDraweeView(getContext());
            vTextArr[i3] = new VText(getContext());
            this.f31042e[i3] = Shape.LEFT;
        }
        this.f31038a = vDraweeViewArr;
        this.f31039b = vTextArr;
        while (true) {
            View[] viewArr = this.f31038a;
            if (i2 >= viewArr.length) {
                this.f31043f = new VImage(getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.m186890d(62.0f), t100.m186890d(40.0f));
                layoutParams.gravity = 17;
                addViewInLayout(this.f31043f, getChildCount(), layoutParams, true);
                return;
            }
            View view = viewArr[i2];
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.u4q
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return this.f174614a.m48224f(i2, view2);
                }
            });
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.v4q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f179968a.m48225g(view2);
                }
            });
            addViewInLayout(view, getChildCount(), generateDefaultLayoutParams(), true);
            addViewInLayout(this.f31039b[i2], getChildCount(), generateDefaultLayoutParams(), true);
            i2++;
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean m48224f(int i, View view) {
        this.f31044g = i;
        ItemMessageBase.m48311R(this).onLongClick(null);
        this.f31044g = -1;
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m48225g(View view) {
        if (!ruy.m181215g().m181218e(this.f31040c.cid)) {
            CoreModule.m29935P().m94658i().showProofAgeDlg(m48222c(), "chat_page_hidden_message");
        } else if (this.f31040c.media.isEmpty() || !(this.f31040c.media.get(0) instanceof Video)) {
            m48222c().m48968R2("picture", this.f31040c.owner);
        } else {
            m48222c().m48968R2("video", this.f31040c.owner);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m48226h(Shape shape, VDraweeView vDraweeView) {
        float dimension = CoreModule.f17544b.getResources().getDimension(x1c0.f189055j);
        int i = C8490a.f31045a[shape.ordinal()];
        RoundingParams roundingParamsM8248b = (i == 1 || i == 2) ? RoundingParams.m8248b(dimension, dimension, dimension, dimension) : null;
        if (vDraweeView.getHierarchy() == null) {
            vDraweeView.setHierarchy(qib0.f154691G.m184722l().m116872a());
        }
        vDraweeView.getHierarchy().m112053H(roundingParamsM8248b);
        vDraweeView.getHierarchy().m112078y(0);
        vDraweeView.getHierarchy().m112051F(getContext().getResources().getDrawable(c3c0.f78601O7), ftd0.f99183g);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public ItemImagesBlock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31044g = -1;
    }

    public ItemImagesBlock(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31044g = -1;
    }
}
