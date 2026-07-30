package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.c3c0;
import l.knb0;
import l.mkd0;
import l.pii0;
import l.qib0;
import l.t100;
import l.y4c0;
import org.jetbrains.annotations.NotNull;
import p003l.c4g0;
import p003l.eqh0;
import p028v.VDraweeView;
import p028v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemLike extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public VDraweeView f944a;

    /* JADX INFO: renamed from: b */
    public View f945b;

    /* JADX INFO: renamed from: c */
    public TextView f946c;

    /* JADX INFO: renamed from: d */
    public VImage f947d;

    /* JADX INFO: renamed from: e */
    public boolean f948e;

    /* JADX INFO: renamed from: f */
    public c4g0 f949f;

    public ItemLike(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        Picture picture = null;
        CoreMomentInfo coreMomentInfo = CoreMomentInfo.LOCAL_ID_INVALID.equals(message.likeOfMoment) ? null : (CoreMomentInfo) CoreModule.N().Mh(message.likeOfMoment, CoreMomentInfo.JSON_ADAPTER);
        if (!NullChecker.a(coreMomentInfo)) {
            this.f944a.getHierarchy().E(new pii0(" ", t100.d(28.0f), t100.d(14.0f), eqh0.m3924c(2), 0, pii0.j, this.f948e ? Color.argb(31, 0, 0, 0) : Color.rgb(250, 250, 250)));
            this.f944a.getHierarchy().c((Drawable) null);
            qib0.G.o(this.f944a);
            this.f944a.setOnClickListener(null);
            this.f946c.setText(R.string.s4);
            return;
        }
        this.f944a.getHierarchy().E(new pii0(" ", t100.d(28.0f), t100.d(14.0f), eqh0.m3924c(2), 0, pii0.j, this.f948e ? Color.argb(31, 0, 0, 0) : Color.rgb(250, 250, 250)));
        int size = coreMomentInfo.media.size();
        VDraweeView vDraweeView = this.f944a;
        if (size == 0) {
            vDraweeView.getHierarchy().c(getResources().getDrawable(c3c0.h5));
            qib0.G.o(this.f944a);
        } else {
            vDraweeView.getHierarchy().c((Drawable) null);
            Video video = (Media) coreMomentInfo.media.get(0);
            boolean z = video instanceof Video;
            View view = this.f945b;
            if (z) {
                view.setVisibility(0);
                picture = video.cover;
            } else {
                view.setVisibility(8);
                if (video instanceof Picture) {
                    picture = (Picture) video;
                }
            }
            if (NullChecker.a(picture)) {
                qib0.G.Q0(this.f944a, picture.momentPictureSmall());
            } else {
                qib0.G.o(this.f944a);
            }
        }
        this.f944a.setVisibility(0);
        this.f944a.setOnClickListener(m1324c(coreMomentInfo, message));
        this.f946c.setText(this.f948e ? R.string.L4 : R.string.M4);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m1323b(CoreMomentInfo coreMomentInfo, Message message, View view) {
        if (coreMomentInfo.media.size() == 0) {
            getContext().startActivity(CoreModule.N().argsToMomentsSimpleTextAct(getContext(), ((CopyObject) coreMomentInfo).id, coreMomentInfo.owner));
        } else {
            getContext().startActivity(CoreModule.N().argsToMomentsFeedPreviewAct(getContext(), ((CopyObject) coreMomentInfo).id, 0, false, "ItemLike", ((DbObject) message).id));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public View.OnClickListener m1324c(final CoreMomentInfo coreMomentInfo, final Message message) {
        return new View.OnClickListener() { // from class: l.f5q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3454a.m1323b(coreMomentInfo, message, view);
            }
        };
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f948e = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.z(this.f949f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f944a = (VDraweeView) findViewById(y4c0.o1);
        this.f945b = findViewById(y4c0.k3);
        this.f947d = (VImage) findViewById(y4c0.h1);
        this.f946c = (TextView) findViewById(y4c0.A4);
    }

    public ItemLike(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemLike(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
