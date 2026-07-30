package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.edc0;
import p153l.ibc0;
import p153l.kcg0;
import p153l.lyh0;
import p153l.ovb0;
import p153l.pri0;
import p153l.psd0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemLike extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public VDraweeView f31901a;

    /* JADX INFO: renamed from: b */
    public View f31902b;

    /* JADX INFO: renamed from: c */
    public TextView f31903c;

    /* JADX INFO: renamed from: d */
    public VImage f31904d;

    /* JADX INFO: renamed from: e */
    public boolean f31905e;

    /* JADX INFO: renamed from: f */
    public kcg0 f31906f;

    public ItemLike(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        Picture picture = null;
        CoreMomentInfo coreMomentInfo = CoreMomentInfo.LOCAL_ID_INVALID.equals(message.likeOfMoment) ? null : (CoreMomentInfo) CoreModule.m30932N().mo61479Mh(message.likeOfMoment, CoreMomentInfo.JSON_ADAPTER);
        if (!NullChecker.m82486a(coreMomentInfo)) {
            this.f31901a.getHierarchy().m207042E(new pri0(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, qa00.m175859d(28.0f), qa00.m175859d(14.0f), lyh0.m156283c(2), 0, pri0.f153791j, this.f31905e ? Color.argb(31, 0, 0, 0) : Color.rgb(250, 250, 250)));
            this.f31901a.getHierarchy().mo118277c(null);
            uqb0.f180374G.m98798o(this.f31901a);
            this.f31901a.setOnClickListener(null);
            this.f31903c.setText(R$string.f21823s4);
            return;
        }
        this.f31901a.getHierarchy().m207042E(new pri0(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, qa00.m175859d(28.0f), qa00.m175859d(14.0f), lyh0.m156283c(2), 0, pri0.f153791j, this.f31905e ? Color.argb(31, 0, 0, 0) : Color.rgb(250, 250, 250)));
        int size = coreMomentInfo.media.size();
        VDraweeView vDraweeView = this.f31901a;
        if (size == 0) {
            vDraweeView.getHierarchy().mo118277c(getResources().getDrawable(ibc0.f114036h5));
            uqb0.f180374G.m98798o(this.f31901a);
        } else {
            vDraweeView.getHierarchy().mo118277c(null);
            Media media = coreMomentInfo.media.get(0);
            boolean z = media instanceof Video;
            View view = this.f31902b;
            if (z) {
                view.setVisibility(0);
                picture = ((Video) media).cover;
            } else {
                view.setVisibility(8);
                if (media instanceof Picture) {
                    picture = (Picture) media;
                }
            }
            if (NullChecker.m82486a(picture)) {
                uqb0.f180374G.m127125Q0(this.f31901a, picture.momentPictureSmall());
            } else {
                uqb0.f180374G.m98798o(this.f31901a);
            }
        }
        this.f31901a.setVisibility(0);
        this.f31901a.setOnClickListener(m49425c(coreMomentInfo, message));
        this.f31903c.setText(this.f31905e ? R$string.f21543L4 : R$string.f21551M4);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m49424b(CoreMomentInfo coreMomentInfo, Message message, View view) {
        if (coreMomentInfo.media.size() == 0) {
            getContext().startActivity(CoreModule.m30932N().argsToMomentsSimpleTextAct(getContext(), coreMomentInfo.f56856id, coreMomentInfo.owner));
        } else {
            getContext().startActivity(CoreModule.m30932N().argsToMomentsFeedPreviewAct(getContext(), coreMomentInfo.f56856id, 0, false, "ItemLike", message.f56859id));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public View.OnClickListener m49425c(final CoreMomentInfo coreMomentInfo, final Message message) {
        return new View.OnClickListener() { // from class: l.f7q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97583a.m49424b(coreMomentInfo, message, view);
            }
        };
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f31905e = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        psd0.m173633z(this.f31906f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31901a = (VDraweeView) findViewById(edc0.f93422o1);
        this.f31902b = findViewById(edc0.f93396k3);
        this.f31904d = (VImage) findViewById(edc0.f93373h1);
        this.f31903c = (TextView) findViewById(edc0.f93168A4);
    }

    public ItemLike(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemLike(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
