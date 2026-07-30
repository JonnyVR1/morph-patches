package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;
import l.a1q;
import l.knb0;
import l.qib0;
import l.vwb;
import l.xdl0;
import p003l.eqh0;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemAiPictureRight extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public ItemAiPictureRight f676a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f677b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f678c;

    /* JADX INFO: renamed from: d */
    public ProgressBar f679d;

    /* JADX INFO: renamed from: e */
    public VText f680e;

    /* JADX INFO: renamed from: f */
    public Message f681f;

    public ItemAiPictureRight(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m1089e(Message message, Media media, View view) {
        CoreModule.P().a().J4(getContext(), message, media);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(final Message message) {
        if (message == null) {
            return;
        }
        this.f680e.setTypeface(eqh0.m3924c(3), 1);
        this.f681f = message;
        if (vwb.J(message.media)) {
            return;
        }
        final Media media = (Media) message.media.get(0);
        if (TEnum.equals(media.status, "raw")) {
            qib0.G.o(this.f678c);
        } else {
            qib0.G.L0(this.f678c, ((Media) media.cover()).url);
        }
        xdl0.E0(this.f678c, new View.OnClickListener() { // from class: l.y0q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8888a.m1089e(message, media, view);
            }
        });
        this.f678c.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.z0q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f9185a.m1092f(view);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        Message message = this.f681f;
        return (message == null || vwb.J(message.media)) ? new ArrayList() : CoreModule.P().i().M5(getContext(), (Media) this.f681f.media.get(0), this.f681f);
    }

    /* JADX INFO: renamed from: c */
    public final void m1090c(View view) {
        a1q.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m1091d() {
        this.f679d.setIndeterminate(false);
        xdl0.M(this.f679d, false);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean m1092f(View view) {
        ItemMessageBase.m1395R(this).onLongClick(this.f678c);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void m1093g() {
        this.f679d.setIndeterminate(true);
        xdl0.M(this.f679d, true);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1090c(this);
    }

    public ItemAiPictureRight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemAiPictureRight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
