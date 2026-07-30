package com.p051p1.mobile.putong.core.p058ui.messages;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.edc0;
import p153l.gta;
import p153l.h1e0;
import p153l.i4g0;
import p153l.ibc0;
import p153l.k900;
import p153l.ovb0;
import p153l.pf60;
import p153l.qa00;
import p153l.uqb0;
import p153l.wlj;
import p153l.x0e0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemImages extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public VDraweeView f31881a;

    /* JADX INFO: renamed from: b */
    public Message f31882b;

    /* JADX INFO: renamed from: c */
    public ProgressBar f31883c;

    /* JADX INFO: renamed from: d */
    public AnimationDrawable f31884d;

    /* JADX INFO: renamed from: e */
    public TextView f31885e;

    public ItemImages(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m49394e(Message message, View view) {
        List<Media> list;
        if (message == null || (list = message.media) == null) {
            return;
        }
        Media media = list.get(0);
        if (NullChecker.m82486a(media) && NullChecker.m82486a(media.url) && (User.ID_TEAM_ACCOUNT.equals(message.owner) || User.ID_LIVE_SERVICE.equals(message.owner))) {
            i4g0.m138495D("e_official_pic_video_handle", OMSDialogPositon.p_chat_view, new pf60("ext_data", NullChecker.m82486a(message.extData) ? message.extData.extra : ""));
        }
        if (NullChecker.m82486a(media) && NullChecker.m82486a(media.url)) {
            CoreModule.m30933P().m143405a().mo180344J4((Act) getContext(), message, media);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ boolean m49395f(View view) {
        ItemMessageBase.m49494R(this).onLongClick(this.f31881a);
        return true;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(final Message message) {
        this.f31882b = message;
        if (message.chatTyping) {
            this.f31881a.setLayoutParams(new FrameLayout.LayoutParams(qa00.m175859d(65.0f), qa00.m175859d(38.0f)));
            this.f31881a.setBackgroundResource(ibc0.f114137s7);
            this.f31881a.setScaleType(ImageView.ScaleType.CENTER);
            AnimationDrawable animationDrawable = this.f31884d;
            if (animationDrawable != null) {
                if (animationDrawable.isRunning()) {
                    return;
                }
                this.f31884d.start();
                return;
            } else {
                this.f31881a.setImageResource(ibc0.f114182x7);
                AnimationDrawable animationDrawable2 = (AnimationDrawable) this.f31881a.getDrawable();
                this.f31884d = animationDrawable2;
                animationDrawable2.start();
                return;
            }
        }
        m49399h();
        Dimension dimension = message.media.get(0).cover().size;
        if (dimension == null || dimension.width == 0 || dimension.height == 0) {
            dimension = new Dimension(180, 180);
        }
        int i = dimension.width;
        int i2 = dimension.height;
        bnl0.m105524M(this.f31885e, m49397d(i, i2, message.media.get(0) instanceof Video));
        this.f31885e.setText(getResources().getText(R$string.f21550M3));
        Point pointM49398g = m49398g(i, i2);
        Media media = message.media.get(0);
        this.f31881a.setLayoutParams(new FrameLayout.LayoutParams(pointM49398g.x, pointM49398g.y));
        if (!TEnum.equals(media.status, "raw") || ((media instanceof Video) && NullChecker.m82486a(((Video) media).cover.url))) {
            uqb0.f180374G.m127127R0(this.f31881a, media.cover().calculatedWidth(pointM49398g.x), "chat");
            this.f31881a.setZoomAnimationKey(k900.m148796h(message, media.cover()));
        } else {
            uqb0.f180374G.m98798o(this.f31881a);
        }
        bnl0.m105509E0(this.f31881a, new View.OnClickListener() { // from class: l.s6q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166599a.m49394e(message, view);
            }
        });
        this.f31881a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.t6q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f172356a.m49395f(view);
            }
        });
        if (message.isMe()) {
            return;
        }
        m49400i();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return CoreModule.m30933P().m143412i().mo180363M5((Act) getContext(), this.f31882b.media.get(0), this.f31882b);
    }

    /* JADX INFO: renamed from: c */
    public void m49396c() {
        this.f31883c.setIndeterminate(false);
        bnl0.m105524M(this.f31883c, false);
    }

    /* JADX INFO: renamed from: d */
    public boolean m49397d(int i, int i2, boolean z) {
        if (z || i <= 1 || i2 <= 1) {
            return false;
        }
        float f = i2;
        float f2 = i;
        float fM105588w0 = ((bnl0.m105588w0() * 0.1f) / bnl0.m105592y0()) * 2.0f;
        return (f * 0.1f) / f2 > fM105588w0 || (f2 * 0.1f) / f > fM105588w0;
    }

    /* JADX INFO: renamed from: g */
    public final Point m49398g(int i, int i2) {
        int iM175859d = qa00.m175859d(140.0f);
        int iM175859d2 = qa00.m175859d(79.0f);
        int iM175859d3 = qa00.m175859d(249.0f);
        int i3 = (int) (iM175859d / ((i * 1.0f) / i2));
        if (i3 >= iM175859d2 && i3 <= iM175859d3) {
            iM175859d2 = i3;
        } else if (i3 >= iM175859d2) {
            iM175859d2 = iM175859d3;
        }
        return new Point(iM175859d, iM175859d2);
    }

    /* JADX INFO: renamed from: h */
    public void m49399h() {
        int i = qa00.f156321h;
        RoundingParams roundingParamsM8302b = RoundingParams.m8302b(i, i, i, i);
        if (this.f31881a.getHierarchy() == null) {
            this.f31881a.setHierarchy(uqb0.f180374G.m98795l().m211638a());
        }
        this.f31881a.getHierarchy().m207045H(roundingParamsM8302b);
        this.f31881a.getHierarchy().m207064y(0);
    }

    /* JADX INFO: renamed from: i */
    public void m49400i() {
        x0e0 x0e0Var;
        wlj hierarchy = this.f31881a.getHierarchy();
        if (this.f31882b.media.get(0) instanceof Video) {
            x0e0Var = new x0e0(getResources().getDrawable(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114126r5 : ibc0.f114117q5), h1e0.f107450g);
        } else {
            x0e0Var = null;
        }
        hierarchy.mo118277c(x0e0Var);
    }

    /* JADX INFO: renamed from: j */
    public void m49401j() {
        this.f31883c.setIndeterminate(true);
        bnl0.m105524M(this.f31883c, true);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31881a = (VDraweeView) findViewById(edc0.f93389j3);
        this.f31883c = (ProgressBar) findViewById(edc0.f93348d4);
        this.f31885e = (TextView) findViewById(edc0.f93318Z1);
    }

    public ItemImages(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemImages(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
