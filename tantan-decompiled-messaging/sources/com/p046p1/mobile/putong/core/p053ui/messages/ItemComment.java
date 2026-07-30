package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.c3c0;
import p149l.e51;
import p149l.eqh0;
import p149l.knb0;
import p149l.pii0;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemComment extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public VText f30888a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f30889b;

    /* JADX INFO: renamed from: c */
    public View f30890c;

    /* JADX INFO: renamed from: d */
    public boolean f30891d;

    /* JADX INFO: renamed from: e */
    public ImageView f30892e;

    /* JADX INFO: renamed from: f */
    public View f30893f;

    public ItemComment(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m48100c() {
        e51.m114766q(this.f30888a.getText().toString());
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(final Message message) {
        this.f30888a.setText(CoreModule.f17544b.getString(R$string.f21011k4) + message.value + CoreModule.f17544b.getString(R$string.f21020l4));
        Picture picture = null;
        final CoreMomentInfo coreMomentInfo = CoreMomentInfo.LOCAL_ID_INVALID.equals(message.moment) ? null : (CoreMomentInfo) CoreModule.m29934N().mo60295Mh(message.moment, CoreMomentInfo.JSON_ADAPTER);
        if (!NullChecker.m81303a(coreMomentInfo)) {
            this.f30889b.getHierarchy().m112050E(new pii0(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, t100.m186890d(28.0f), t100.m186890d(14.0f), eqh0.m117752c(2), 0, pii0.f149562j, this.f30891d ? Color.argb(31, 0, 0, 0) : Color.rgb(250, 250, 250)));
            this.f30889b.getHierarchy().mo112056c(null);
            this.f30889b.setOnClickListener(null);
            qib0.f154691G.m184725o(this.f30889b);
            this.f30888a.setText(R$string.f21081s4);
            return;
        }
        this.f30889b.getHierarchy().m112050E(new pii0(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, t100.m186890d(28.0f), t100.m186890d(14.0f), eqh0.m117752c(2), 0, pii0.f149562j, this.f30891d ? Color.argb(31, 0, 0, 0) : Color.rgb(250, 250, 250)));
        int size = coreMomentInfo.media.size();
        VDraweeView vDraweeView = this.f30889b;
        if (size == 0) {
            vDraweeView.getHierarchy().mo112056c(getResources().getDrawable(c3c0.f78761h5));
            this.f30890c.setVisibility(8);
            qib0.f154691G.m184725o(this.f30889b);
        } else {
            vDraweeView.getHierarchy().mo112056c(null);
            Media media = coreMomentInfo.media.get(0);
            boolean z = media instanceof Video;
            View view = this.f30890c;
            if (z) {
                view.setVisibility(0);
                picture = ((Video) media).cover;
            } else {
                view.setVisibility(8);
                if (media instanceof Picture) {
                    picture = (Picture) media;
                }
            }
            if (NullChecker.m81303a(picture)) {
                qib0.f154691G.m102341Q0(this.f30889b, picture.momentPictureSmall());
            } else {
                qib0.f154691G.m184725o(this.f30889b);
            }
        }
        this.f30889b.setVisibility(0);
        this.f30889b.setOnClickListener(new View.OnClickListener() { // from class: l.g2q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f100278a.m48101d(coreMomentInfo, message, view2);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return vwb.m200324f0(vwb.m200312Z(getContext().getString(R$string.f20934c), new Runnable() { // from class: l.f2q
            @Override // java.lang.Runnable
            public final void run() {
                this.f94228a.m48100c();
            }
        }, Integer.valueOf(c3c0.f78901x1), null));
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m48101d(CoreMomentInfo coreMomentInfo, Message message, View view) {
        if (coreMomentInfo.media.size() == 0) {
            getContext().startActivity(CoreModule.m29934N().argsToMomentsSimpleTextAct(getContext(), coreMomentInfo.f56008id, coreMomentInfo.owner));
        } else {
            getContext().startActivity(CoreModule.m29934N().argsToMomentsFeedPreviewAct(getContext(), coreMomentInfo.f56008id, 0, false, "ItemComment", message.f56011id));
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f30891d = z;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f30889b = (VDraweeView) findViewById(y4c0.f196187o1);
        this.f30890c = findViewById(y4c0.f196161k3);
        VText vText = (VText) findViewById(y4c0.f195933A4);
        this.f30888a = vText;
        vText.setBackgroundDrawable(null);
        this.f30892e = (ImageView) findViewById(y4c0.f196159k1);
        this.f30893f = findViewById(y4c0.f196081Z);
    }

    public ItemComment(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemComment(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
