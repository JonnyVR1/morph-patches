package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;
import p153l.a3q;
import p153l.bnl0;
import p153l.jyb;
import p153l.lyh0;
import p153l.ovb0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemAiPictureRight extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemAiPictureRight f31633a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f31634b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f31635c;

    /* JADX INFO: renamed from: d */
    public ProgressBar f31636d;

    /* JADX INFO: renamed from: e */
    public VText f31637e;

    /* JADX INFO: renamed from: f */
    public Message f31638f;

    public ItemAiPictureRight(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m49194e(Message message, Media media, View view) {
        CoreModule.m30933P().m143405a().mo180344J4((Act) getContext(), message, media);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(final Message message) {
        if (message == null) {
            return;
        }
        this.f31637e.setTypeface(lyh0.m156283c(3), 1);
        this.f31638f = message;
        if (jyb.m147479J(message.media)) {
            return;
        }
        final Media media = message.media.get(0);
        if (TEnum.equals(media.status, "raw")) {
            uqb0.f180374G.m98798o(this.f31635c);
        } else {
            uqb0.f180374G.m127115L0(this.f31635c, media.cover().url);
        }
        bnl0.m105509E0(this.f31635c, new View.OnClickListener() { // from class: l.y2q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197272a.m49194e(message, media, view);
            }
        });
        this.f31635c.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.z2q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f202726a.m49197f(view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        Message message = this.f31638f;
        return (message == null || jyb.m147479J(message.media)) ? new ArrayList() : CoreModule.m30933P().m143412i().mo180363M5((Act) getContext(), this.f31638f.media.get(0), this.f31638f);
    }

    /* JADX INFO: renamed from: c */
    public final void m49195c(View view) {
        a3q.m95866a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m49196d() {
        this.f31636d.setIndeterminate(false);
        bnl0.m105524M(this.f31636d, false);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean m49197f(View view) {
        ItemMessageBase.m49494R(this).onLongClick(this.f31635c);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void m49198g() {
        this.f31636d.setIndeterminate(true);
        bnl0.m105524M(this.f31636d, true);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49195c(this);
    }

    public ItemAiPictureRight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemAiPictureRight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
