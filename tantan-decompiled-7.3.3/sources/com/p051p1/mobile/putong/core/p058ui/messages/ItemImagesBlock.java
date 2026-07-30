package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Locale;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.eac0;
import p153l.h1e0;
import p153l.ibc0;
import p153l.k900;
import p153l.o3z;
import p153l.ovb0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemImagesBlock extends FrameLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public VDraweeView[] f31886a;

    /* JADX INFO: renamed from: b */
    public VText[] f31887b;

    /* JADX INFO: renamed from: c */
    public Message f31888c;

    /* JADX INFO: renamed from: d */
    public AnimationDrawable f31889d;

    /* JADX INFO: renamed from: e */
    public Shape[] f31890e;

    /* JADX INFO: renamed from: f */
    public VImage f31891f;

    /* JADX INFO: renamed from: g */
    public int f31892g;

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
    public static /* synthetic */ class C8653a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31893a;

        static {
            int[] iArr = new int[Shape.values().length];
            f31893a = iArr;
            try {
                iArr[Shape.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31893a[Shape.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ItemImagesBlock(Context context) {
        super(context);
        this.f31892g = -1;
    }

    /* JADX INFO: renamed from: d */
    public static Point m49404d(int i, int i2, boolean z) {
        int iM175859d = qa00.m175859d(140.0f);
        int iM175859d2 = z ? qa00.m175859d(78.0f) : qa00.f156293F;
        float f = (i * 1.0f) / i2;
        float f2 = iM175859d2;
        float f3 = iM175859d;
        if (f > (f2 * 1.0f) / f3) {
            if (f < (1.0f * f3) / f2) {
                if (i >= i2) {
                    if (i > iM175859d) {
                        i2 = (int) (f3 / f);
                    } else if (i2 < iM175859d2) {
                        i = (int) (f2 * f);
                        i2 = iM175859d2;
                    }
                } else if (i2 > iM175859d) {
                    i = (int) (f3 * f);
                } else if (i < iM175859d2) {
                    i2 = (int) (f2 / f);
                    i = iM175859d2;
                }
                return new Point(i, i2);
            }
            i2 = iM175859d2;
            i = iM175859d;
            return new Point(i, i2);
        }
        i = iM175859d2;
        i2 = iM175859d;
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
    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        char c;
        this.f31888c = message;
        boolean zMo180570z = CoreModule.f18273l.m143412i().mo180570z(message.owner);
        removeAllViews();
        if (NullChecker.m82486a(message.media)) {
            m49406e(message.media.size());
        }
        char c2 = 0;
        if (message.chatTyping) {
            VDraweeView vDraweeView = this.f31886a[0];
            vDraweeView.setLayoutParams(new FrameLayout.LayoutParams(qa00.m175859d(65.0f), qa00.m175859d(38.0f)));
            vDraweeView.setBackgroundResource(ibc0.f114137s7);
            vDraweeView.setScaleType(ImageView.ScaleType.CENTER);
            AnimationDrawable animationDrawable = this.f31889d;
            if (animationDrawable != null) {
                if (animationDrawable.isRunning()) {
                    return;
                }
                this.f31889d.start();
                return;
            } else {
                vDraweeView.setImageResource(ibc0.f114182x7);
                AnimationDrawable animationDrawable2 = (AnimationDrawable) vDraweeView.getDrawable();
                this.f31889d = animationDrawable2;
                animationDrawable2.start();
                return;
            }
        }
        int i = 0;
        while (true) {
            VDraweeView[] vDraweeViewArr = this.f31886a;
            if (i >= vDraweeViewArr.length) {
                break;
            }
            m49409h(this.f31890e[i], vDraweeViewArr[i]);
            i++;
        }
        Point[] pointArr = new Point[message.media.size()];
        int i2 = 0;
        for (int i3 = 0; i3 < message.media.size(); i3++) {
            Dimension dimension = message.media.get(i3).cover().size;
            if (dimension == null || dimension.width == 0 || dimension.height == 0) {
                dimension = new Dimension(180, 180);
            }
            Point pointM49404d = m49404d(dimension.width - qa00.m175859d(12.0f), dimension.height, message.media.get(i3) instanceof Video);
            pointArr[i3] = pointM49404d;
            i2 += pointM49404d.x;
        }
        int length = i2 / this.f31886a.length;
        int i4 = 0;
        int iM175859d = 0;
        while (true) {
            VDraweeView[] vDraweeViewArr2 = this.f31886a;
            if (i4 >= vDraweeViewArr2.length) {
                break;
            }
            Point point = pointArr[i4];
            point.y = (point.y * length) / point.x;
            point.x = length;
            VDraweeView vDraweeView2 = vDraweeViewArr2[i4];
            VText vText = this.f31887b[i4];
            Point point2 = pointArr[i4];
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(point2.x, point2.y);
            if (i4 == 0) {
                iM175859d += qa00.m175859d(6.0f);
            }
            layoutParams.topMargin = iM175859d;
            layoutParams.leftMargin = qa00.m175859d(6.0f);
            layoutParams.rightMargin = qa00.m175859d(6.0f);
            layoutParams.bottomMargin = qa00.m175859d(6.0f);
            iM175859d += pointArr[i4].y + qa00.m175859d(6.0f);
            vDraweeView2.setLayoutParams(layoutParams);
            int i5 = pointArr[c2].x;
            Media media = message.media.get(i4);
            if (!TEnum.equals(media.status, "raw") || ((media instanceof Video) && NullChecker.m82486a(((Video) media).cover.url))) {
                uqb0.f180374G.m127120O(vDraweeView2, media.cover().calculatedWidth(i5).formatted(), 7, 20);
                vDraweeView2.setZoomAnimationKey(k900.m148796h(message, media.cover()));
            } else {
                uqb0.f180374G.m98798o(vDraweeView2);
            }
            if (media instanceof Video) {
                vText.setLayoutParams(layoutParams);
                vText.setTextColor(Color.parseColor("#ffffff"));
                vText.setTextSize(12.0f);
                vText.setGravity(85);
                c = 0;
                vText.setPadding(0, 0, qa00.m175859d(5.0f), qa00.m175859d(5.0f));
                int i6 = (int) ((Video) media).duration;
                vText.setText(String.format(Locale.getDefault(), "%02d:%02d", Integer.valueOf(i6 / 60), Integer.valueOf(i6 % 60)));
            } else {
                c = 0;
                vText.setText("");
            }
            i4++;
            c2 = c;
        }
        VImage vImage = this.f31891f;
        if (zMo180570z) {
            vImage.setImageResource(ibc0.f114065k7);
        } else {
            vImage.setImageResource(ibc0.f114074l7);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public MessagesAct m49405c() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: e */
    public void m49406e(int i) {
        VDraweeView[] vDraweeViewArr = new VDraweeView[i];
        VText[] vTextArr = new VText[i];
        this.f31890e = new Shape[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            vDraweeViewArr[i3] = new VDraweeView(getContext());
            vTextArr[i3] = new VText(getContext());
            this.f31890e[i3] = Shape.LEFT;
        }
        this.f31886a = vDraweeViewArr;
        this.f31887b = vTextArr;
        while (true) {
            View[] viewArr = this.f31886a;
            if (i2 >= viewArr.length) {
                this.f31891f = new VImage(getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qa00.m175859d(62.0f), qa00.m175859d(40.0f));
                layoutParams.gravity = 17;
                addViewInLayout(this.f31891f, getChildCount(), layoutParams, true);
                return;
            }
            View view = viewArr[i2];
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.u6q
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return this.f177801a.m49407f(i2, view2);
                }
            });
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.v6q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f182678a.m49408g(view2);
                }
            });
            addViewInLayout(view, getChildCount(), generateDefaultLayoutParams(), true);
            addViewInLayout(this.f31887b[i2], getChildCount(), generateDefaultLayoutParams(), true);
            i2++;
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean m49407f(int i, View view) {
        this.f31892g = i;
        ItemMessageBase.m49494R(this).onLongClick(null);
        this.f31892g = -1;
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m49408g(View view) {
        if (!o3z.m165898g().m165901e(this.f31888c.cid)) {
            CoreModule.m30933P().m143412i().showProofAgeDlg(m49405c(), "chat_page_hidden_message");
        } else if (this.f31888c.media.isEmpty() || !(this.f31888c.media.get(0) instanceof Video)) {
            m49405c().m50152S2("picture", this.f31888c.owner);
        } else {
            m49405c().m50152S2("video", this.f31888c.owner);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m49409h(Shape shape, VDraweeView vDraweeView) {
        float dimension = CoreModule.f18263b.getResources().getDimension(eac0.f92762j);
        int i = C8653a.f31893a[shape.ordinal()];
        RoundingParams roundingParamsM8302b = (i == 1 || i == 2) ? RoundingParams.m8302b(dimension, dimension, dimension, dimension) : null;
        if (vDraweeView.getHierarchy() == null) {
            vDraweeView.setHierarchy(uqb0.f180374G.m98795l().m211638a());
        }
        vDraweeView.getHierarchy().m207045H(roundingParamsM8302b);
        vDraweeView.getHierarchy().m207064y(0);
        vDraweeView.getHierarchy().m207043F(getContext().getResources().getDrawable(ibc0.f113876O7), h1e0.f107450g);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public ItemImagesBlock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31892g = -1;
    }

    public ItemImagesBlock(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31892g = -1;
    }
}
