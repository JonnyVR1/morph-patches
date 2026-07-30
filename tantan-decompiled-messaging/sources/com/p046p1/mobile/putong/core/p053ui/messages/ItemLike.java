package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.c3c0;
import p149l.c4g0;
import p149l.eqh0;
import p149l.knb0;
import p149l.mkd0;
import p149l.pii0;
import p149l.qib0;
import p149l.t100;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemLike extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public VDraweeView f31053a;

    /* JADX INFO: renamed from: b */
    public View f31054b;

    /* JADX INFO: renamed from: c */
    public TextView f31055c;

    /* JADX INFO: renamed from: d */
    public VImage f31056d;

    /* JADX INFO: renamed from: e */
    public boolean f31057e;

    /* JADX INFO: renamed from: f */
    public c4g0 f31058f;

    public ItemLike(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        Picture picture = null;
        CoreMomentInfo coreMomentInfo = CoreMomentInfo.LOCAL_ID_INVALID.equals(message.likeOfMoment) ? null : (CoreMomentInfo) CoreModule.m29934N().mo60295Mh(message.likeOfMoment, CoreMomentInfo.JSON_ADAPTER);
        if (!NullChecker.m81303a(coreMomentInfo)) {
            this.f31053a.getHierarchy().m112050E(new pii0(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, t100.m186890d(28.0f), t100.m186890d(14.0f), eqh0.m117752c(2), 0, pii0.f149562j, this.f31057e ? Color.argb(31, 0, 0, 0) : Color.rgb(250, 250, 250)));
            this.f31053a.getHierarchy().mo112056c(null);
            qib0.f154691G.m184725o(this.f31053a);
            this.f31053a.setOnClickListener(null);
            this.f31055c.setText(R$string.f21081s4);
            return;
        }
        this.f31053a.getHierarchy().m112050E(new pii0(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, t100.m186890d(28.0f), t100.m186890d(14.0f), eqh0.m117752c(2), 0, pii0.f149562j, this.f31057e ? Color.argb(31, 0, 0, 0) : Color.rgb(250, 250, 250)));
        int size = coreMomentInfo.media.size();
        VDraweeView vDraweeView = this.f31053a;
        if (size == 0) {
            vDraweeView.getHierarchy().mo112056c(getResources().getDrawable(c3c0.f78761h5));
            qib0.f154691G.m184725o(this.f31053a);
        } else {
            vDraweeView.getHierarchy().mo112056c(null);
            Media media = coreMomentInfo.media.get(0);
            boolean z = media instanceof Video;
            View view = this.f31054b;
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
                qib0.f154691G.m102341Q0(this.f31053a, picture.momentPictureSmall());
            } else {
                qib0.f154691G.m184725o(this.f31053a);
            }
        }
        this.f31053a.setVisibility(0);
        this.f31053a.setOnClickListener(m48242c(coreMomentInfo, message));
        this.f31055c.setText(this.f31057e ? R$string.f20801L4 : R$string.f20809M4);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m48241b(CoreMomentInfo coreMomentInfo, Message message, View view) {
        if (coreMomentInfo.media.size() == 0) {
            getContext().startActivity(CoreModule.m29934N().argsToMomentsSimpleTextAct(getContext(), coreMomentInfo.f56008id, coreMomentInfo.owner));
        } else {
            getContext().startActivity(CoreModule.m29934N().argsToMomentsFeedPreviewAct(getContext(), coreMomentInfo.f56008id, 0, false, "ItemLike", message.f56011id));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public View.OnClickListener m48242c(final CoreMomentInfo coreMomentInfo, final Message message) {
        return new View.OnClickListener() { // from class: l.f5q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f95195a.m48241b(coreMomentInfo, message, view);
            }
        };
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f31057e = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.m154992z(this.f31058f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31053a = (VDraweeView) findViewById(y4c0.f196187o1);
        this.f31054b = findViewById(y4c0.f196161k3);
        this.f31056d = (VImage) findViewById(y4c0.f196138h1);
        this.f31055c = (TextView) findViewById(y4c0.f195933A4);
    }

    public ItemLike(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemLike(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
