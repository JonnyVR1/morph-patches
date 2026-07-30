package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.a1q;
import p149l.eqh0;
import p149l.knb0;
import p149l.qib0;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemAiPictureRight extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemAiPictureRight f30785a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f30786b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f30787c;

    /* JADX INFO: renamed from: d */
    public ProgressBar f30788d;

    /* JADX INFO: renamed from: e */
    public VText f30789e;

    /* JADX INFO: renamed from: f */
    public Message f30790f;

    public ItemAiPictureRight(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m48011e(Message message, Media media, View view) {
        CoreModule.m29935P().m94651a().mo158252J4((Act) getContext(), message, media);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(final Message message) {
        if (message == null) {
            return;
        }
        this.f30789e.setTypeface(eqh0.m117752c(3), 1);
        this.f30790f = message;
        if (vwb.m200296J(message.media)) {
            return;
        }
        final Media media = message.media.get(0);
        if (TEnum.equals(media.status, "raw")) {
            qib0.f154691G.m184725o(this.f30787c);
        } else {
            qib0.f154691G.m102331L0(this.f30787c, media.cover().url);
        }
        xdl0.m208329E0(this.f30787c, new View.OnClickListener() { // from class: l.y0q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195320a.m48011e(message, media, view);
            }
        });
        this.f30787c.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.z0q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f201008a.m48014f(view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        Message message = this.f30790f;
        return (message == null || vwb.m200296J(message.media)) ? new ArrayList() : CoreModule.m29935P().m94658i().mo158271M5((Act) getContext(), this.f30790f.media.get(0), this.f30790f);
    }

    /* JADX INFO: renamed from: c */
    public final void m48012c(View view) {
        a1q.m94573a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m48013d() {
        this.f30788d.setIndeterminate(false);
        xdl0.m208344M(this.f30788d, false);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean m48014f(View view) {
        ItemMessageBase.m48311R(this).onLongClick(this.f30787c);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void m48015g() {
        this.f30788d.setIndeterminate(true);
        xdl0.m208344M(this.f30788d, true);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48012c(this);
    }

    public ItemAiPictureRight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemAiPictureRight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
