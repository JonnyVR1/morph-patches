package com.p046p1.mobile.putong.core.p053ui.messages;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p149l.c3c0;
import p149l.djj;
import p149l.ftd0;
import p149l.j760;
import p149l.knb0;
import p149l.n000;
import p149l.qib0;
import p149l.t100;
import p149l.ura;
import p149l.vsd0;
import p149l.xdl0;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemImages extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public VDraweeView f31033a;

    /* JADX INFO: renamed from: b */
    public Message f31034b;

    /* JADX INFO: renamed from: c */
    public ProgressBar f31035c;

    /* JADX INFO: renamed from: d */
    public AnimationDrawable f31036d;

    /* JADX INFO: renamed from: e */
    public TextView f31037e;

    public ItemImages(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m48211e(Message message, View view) {
        List<Media> list;
        if (message == null || (list = message.media) == null) {
            return;
        }
        Media media = list.get(0);
        if (NullChecker.m81303a(media) && NullChecker.m81303a(media.url) && (User.ID_TEAM_ACCOUNT.equals(message.owner) || User.ID_LIVE_SERVICE.equals(message.owner))) {
            zvf0.m220371D("e_official_pic_video_handle", OMSDialogPositon.p_chat_view, new j760("ext_data", NullChecker.m81303a(message.extData) ? message.extData.extra : ""));
        }
        if (NullChecker.m81303a(media) && NullChecker.m81303a(media.url)) {
            CoreModule.m29935P().m94651a().mo158252J4((Act) getContext(), message, media);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ boolean m48212f(View view) {
        ItemMessageBase.m48311R(this).onLongClick(this.f31033a);
        return true;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(final Message message) {
        this.f31034b = message;
        if (message.chatTyping) {
            this.f31033a.setLayoutParams(new FrameLayout.LayoutParams(t100.m186890d(65.0f), t100.m186890d(38.0f)));
            this.f31033a.setBackgroundResource(c3c0.f78862s7);
            this.f31033a.setScaleType(ImageView.ScaleType.CENTER);
            AnimationDrawable animationDrawable = this.f31036d;
            if (animationDrawable != null) {
                if (animationDrawable.isRunning()) {
                    return;
                }
                this.f31036d.start();
                return;
            } else {
                this.f31033a.setImageResource(c3c0.f78907x7);
                AnimationDrawable animationDrawable2 = (AnimationDrawable) this.f31033a.getDrawable();
                this.f31036d = animationDrawable2;
                animationDrawable2.start();
                return;
            }
        }
        m48216h();
        Dimension dimension = message.media.get(0).cover().size;
        if (dimension == null || dimension.width == 0 || dimension.height == 0) {
            dimension = new Dimension(180, 180);
        }
        int i = dimension.width;
        int i2 = dimension.height;
        xdl0.m208344M(this.f31037e, m48214d(i, i2, message.media.get(0) instanceof Video));
        this.f31037e.setText(getResources().getText(R$string.f20808M3));
        Point pointM48215g = m48215g(i, i2);
        Media media = message.media.get(0);
        this.f31033a.setLayoutParams(new FrameLayout.LayoutParams(pointM48215g.x, pointM48215g.y));
        if (!TEnum.equals(media.status, "raw") || ((media instanceof Video) && NullChecker.m81303a(((Video) media).cover.url))) {
            qib0.f154691G.m102343R0(this.f31033a, media.cover().calculatedWidth(pointM48215g.x), "chat");
            this.f31033a.setZoomAnimationKey(n000.m157189h(message, media.cover()));
        } else {
            qib0.f154691G.m184725o(this.f31033a);
        }
        xdl0.m208329E0(this.f31033a, new View.OnClickListener() { // from class: l.s4q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162460a.m48211e(message, view);
            }
        });
        this.f31033a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.t4q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f167743a.m48212f(view);
            }
        });
        if (message.isMe()) {
            return;
        }
        m48217i();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return CoreModule.m29935P().m94658i().mo158271M5((Act) getContext(), this.f31034b.media.get(0), this.f31034b);
    }

    /* JADX INFO: renamed from: c */
    public void m48213c() {
        this.f31035c.setIndeterminate(false);
        xdl0.m208344M(this.f31035c, false);
    }

    /* JADX INFO: renamed from: d */
    public boolean m48214d(int i, int i2, boolean z) {
        if (z || i <= 1 || i2 <= 1) {
            return false;
        }
        float f = i2;
        float f2 = i;
        float fM208408w0 = ((xdl0.m208408w0() * 0.1f) / xdl0.m208412y0()) * 2.0f;
        return (f * 0.1f) / f2 > fM208408w0 || (f2 * 0.1f) / f > fM208408w0;
    }

    /* JADX INFO: renamed from: g */
    public final Point m48215g(int i, int i2) {
        int iM186890d = t100.m186890d(140.0f);
        int iM186890d2 = t100.m186890d(79.0f);
        int iM186890d3 = t100.m186890d(249.0f);
        int i3 = (int) (iM186890d / ((i * 1.0f) / i2));
        if (i3 >= iM186890d2 && i3 <= iM186890d3) {
            iM186890d2 = i3;
        } else if (i3 >= iM186890d2) {
            iM186890d2 = iM186890d3;
        }
        return new Point(iM186890d, iM186890d2);
    }

    /* JADX INFO: renamed from: h */
    public void m48216h() {
        int i = t100.f167259h;
        RoundingParams roundingParamsM8248b = RoundingParams.m8248b(i, i, i, i);
        if (this.f31033a.getHierarchy() == null) {
            this.f31033a.setHierarchy(qib0.f154691G.m184722l().m116872a());
        }
        this.f31033a.getHierarchy().m112053H(roundingParamsM8248b);
        this.f31033a.getHierarchy().m112078y(0);
    }

    /* JADX INFO: renamed from: i */
    public void m48217i() {
        vsd0 vsd0Var;
        djj hierarchy = this.f31033a.getHierarchy();
        if (this.f31034b.media.get(0) instanceof Video) {
            vsd0Var = new vsd0(getResources().getDrawable(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78851r5 : c3c0.f78842q5), ftd0.f99183g);
        } else {
            vsd0Var = null;
        }
        hierarchy.mo112056c(vsd0Var);
    }

    /* JADX INFO: renamed from: j */
    public void m48218j() {
        this.f31035c.setIndeterminate(true);
        xdl0.m208344M(this.f31035c, true);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31033a = (VDraweeView) findViewById(y4c0.f196154j3);
        this.f31035c = (ProgressBar) findViewById(y4c0.f196113d4);
        this.f31037e = (TextView) findViewById(y4c0.f196083Z1);
    }

    public ItemImages(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemImages(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
