package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.c3c0;
import l.djj;
import l.ftd0;
import l.j760;
import l.knb0;
import l.qib0;
import l.t100;
import l.ura;
import l.vsd0;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import org.spongycastle.crypto.tls.CipherSuite;
import p003l.n000;
import p028v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemImages extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public VDraweeView f924a;

    /* JADX INFO: renamed from: b */
    public Message f925b;

    /* JADX INFO: renamed from: c */
    public ProgressBar f926c;

    /* JADX INFO: renamed from: d */
    public AnimationDrawable f927d;

    /* JADX INFO: renamed from: e */
    public TextView f928e;

    public ItemImages(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m1293e(Message message, View view) {
        List list;
        if (message == null || (list = message.media) == null) {
            return;
        }
        Media media = (Media) list.get(0);
        if (NullChecker.a(media) && NullChecker.a(media.url) && ("-1".equals(message.owner) || "-11001".equals(message.owner))) {
            zvf0.D("e_official_pic_video_handle", "p_chat_view", new j760[]{new j760("ext_data", NullChecker.a(message.extData) ? message.extData.extra : "")});
        }
        if (NullChecker.a(media) && NullChecker.a(media.url)) {
            CoreModule.P().a().J4(getContext(), message, media);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ boolean m1294f(View view) {
        ItemMessageBase.m1395R(this).onLongClick(this.f924a);
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(final Message message) {
        this.f925b = message;
        if (message.chatTyping) {
            this.f924a.setLayoutParams(new FrameLayout.LayoutParams(t100.d(65.0f), t100.d(38.0f)));
            this.f924a.setBackgroundResource(c3c0.s7);
            this.f924a.setScaleType(ImageView.ScaleType.CENTER);
            AnimationDrawable animationDrawable = this.f927d;
            if (animationDrawable != null) {
                if (animationDrawable.isRunning()) {
                    return;
                }
                this.f927d.start();
                return;
            } else {
                this.f924a.setImageResource(c3c0.x7);
                AnimationDrawable animationDrawable2 = (AnimationDrawable) this.f924a.getDrawable();
                this.f927d = animationDrawable2;
                animationDrawable2.start();
                return;
            }
        }
        m1298h();
        Dimension dimension = ((Media) message.media.get(0)).cover().size;
        if (dimension == null || dimension.width == 0 || dimension.height == 0) {
            dimension = new Dimension(CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256);
        }
        int i = dimension.width;
        int i2 = dimension.height;
        xdl0.M(this.f928e, m1296d(i, i2, message.media.get(0) instanceof Video));
        this.f928e.setText(getResources().getText(R.string.M3));
        Point pointM1297g = m1297g(i, i2);
        Video video = (Media) message.media.get(0);
        this.f924a.setLayoutParams(new FrameLayout.LayoutParams(pointM1297g.x, pointM1297g.y));
        if (!TEnum.equals(((Media) video).status, "raw") || ((video instanceof Video) && NullChecker.a(((Media) video.cover).url))) {
            qib0.G.R0(this.f924a, video.cover().calculatedWidth(pointM1297g.x), "chat");
            this.f924a.setZoomAnimationKey(n000.m6523h(message, video.cover()));
        } else {
            qib0.G.o(this.f924a);
        }
        xdl0.E0(this.f924a, new View.OnClickListener() { // from class: l.s4q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7142a.m1293e(message, view);
            }
        });
        this.f924a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.t4q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f7407a.m1294f(view);
            }
        });
        if (message.isMe()) {
            return;
        }
        m1299i();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return CoreModule.P().i().M5(getContext(), (Media) this.f925b.media.get(0), this.f925b);
    }

    /* JADX INFO: renamed from: c */
    public void m1295c() {
        this.f926c.setIndeterminate(false);
        xdl0.M(this.f926c, false);
    }

    /* JADX INFO: renamed from: d */
    public boolean m1296d(int i, int i2, boolean z) {
        if (z || i <= 1 || i2 <= 1) {
            return false;
        }
        float f = i2;
        float f2 = i;
        float fW0 = ((xdl0.w0() * 0.1f) / xdl0.y0()) * 2.0f;
        return (f * 0.1f) / f2 > fW0 || (f2 * 0.1f) / f > fW0;
    }

    /* JADX INFO: renamed from: g */
    public final Point m1297g(int i, int i2) {
        int iD = t100.d(140.0f);
        int iD2 = t100.d(79.0f);
        int iD3 = t100.d(249.0f);
        int i3 = (int) (iD / ((i * 1.0f) / i2));
        if (i3 >= iD2 && i3 <= iD3) {
            iD2 = i3;
        } else if (i3 >= iD2) {
            iD2 = iD3;
        }
        return new Point(iD, iD2);
    }

    /* JADX INFO: renamed from: h */
    public void m1298h() {
        int i = t100.h;
        RoundingParams roundingParamsB = RoundingParams.b(i, i, i, i);
        if (this.f924a.getHierarchy() == null) {
            this.f924a.setHierarchy(qib0.G.l().a());
        }
        this.f924a.getHierarchy().H(roundingParamsB);
        this.f924a.getHierarchy().y(0);
    }

    /* JADX INFO: renamed from: i */
    public void m1299i() {
        vsd0 vsd0Var;
        djj hierarchy = this.f924a.getHierarchy();
        if (this.f925b.media.get(0) instanceof Video) {
            vsd0Var = new vsd0(getResources().getDrawable(ura.e().d().I4() ? c3c0.r5 : c3c0.q5), ftd0.g);
        } else {
            vsd0Var = null;
        }
        hierarchy.c(vsd0Var);
    }

    /* JADX INFO: renamed from: j */
    public void m1300j() {
        this.f926c.setIndeterminate(true);
        xdl0.M(this.f926c, true);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f924a = (VDraweeView) findViewById(y4c0.j3);
        this.f926c = (ProgressBar) findViewById(y4c0.d4);
        this.f928e = (TextView) findViewById(y4c0.Z1);
    }

    public ItemImages(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemImages(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
