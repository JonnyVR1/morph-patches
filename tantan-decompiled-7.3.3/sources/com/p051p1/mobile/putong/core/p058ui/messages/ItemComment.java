package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import p151v.VDraweeView;
import p151v.VText;
import p153l.edc0;
import p153l.ibc0;
import p153l.jyb;
import p153l.l51;
import p153l.lyh0;
import p153l.ovb0;
import p153l.pri0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemComment extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public VText f31736a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f31737b;

    /* JADX INFO: renamed from: c */
    public View f31738c;

    /* JADX INFO: renamed from: d */
    public boolean f31739d;

    /* JADX INFO: renamed from: e */
    public ImageView f31740e;

    /* JADX INFO: renamed from: f */
    public View f31741f;

    public ItemComment(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m49283c() {
        l51.m152911q(this.f31736a.getText().toString());
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(final Message message) {
        this.f31736a.setText(CoreModule.f18263b.getString(R$string.f21753k4) + message.value + CoreModule.f18263b.getString(R$string.f21762l4));
        Picture picture = null;
        final CoreMomentInfo coreMomentInfo = CoreMomentInfo.LOCAL_ID_INVALID.equals(message.moment) ? null : (CoreMomentInfo) CoreModule.m30932N().mo61479Mh(message.moment, CoreMomentInfo.JSON_ADAPTER);
        if (!NullChecker.m82486a(coreMomentInfo)) {
            this.f31737b.getHierarchy().m207042E(new pri0(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, qa00.m175859d(28.0f), qa00.m175859d(14.0f), lyh0.m156283c(2), 0, pri0.f153791j, this.f31739d ? Color.argb(31, 0, 0, 0) : Color.rgb(250, 250, 250)));
            this.f31737b.getHierarchy().mo118277c(null);
            this.f31737b.setOnClickListener(null);
            uqb0.f180374G.m98798o(this.f31737b);
            this.f31736a.setText(R$string.f21823s4);
            return;
        }
        this.f31737b.getHierarchy().m207042E(new pri0(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, qa00.m175859d(28.0f), qa00.m175859d(14.0f), lyh0.m156283c(2), 0, pri0.f153791j, this.f31739d ? Color.argb(31, 0, 0, 0) : Color.rgb(250, 250, 250)));
        int size = coreMomentInfo.media.size();
        VDraweeView vDraweeView = this.f31737b;
        if (size == 0) {
            vDraweeView.getHierarchy().mo118277c(getResources().getDrawable(ibc0.f114036h5));
            this.f31738c.setVisibility(8);
            uqb0.f180374G.m98798o(this.f31737b);
        } else {
            vDraweeView.getHierarchy().mo118277c(null);
            Media media = coreMomentInfo.media.get(0);
            boolean z = media instanceof Video;
            View view = this.f31738c;
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
                uqb0.f180374G.m127125Q0(this.f31737b, picture.momentPictureSmall());
            } else {
                uqb0.f180374G.m98798o(this.f31737b);
            }
        }
        this.f31737b.setVisibility(0);
        this.f31737b.setOnClickListener(new View.OnClickListener() { // from class: l.g4q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f102187a.m49284d(coreMomentInfo, message, view2);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return jyb.m147507f0(jyb.m147495Z(getContext().getString(R$string.f21676c), new Runnable() { // from class: l.f4q
            @Override // java.lang.Runnable
            public final void run() {
                this.f97127a.m49283c();
            }
        }, Integer.valueOf(ibc0.f114176x1), null));
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m49284d(CoreMomentInfo coreMomentInfo, Message message, View view) {
        if (coreMomentInfo.media.size() == 0) {
            getContext().startActivity(CoreModule.m30932N().argsToMomentsSimpleTextAct(getContext(), coreMomentInfo.f56856id, coreMomentInfo.owner));
        } else {
            getContext().startActivity(CoreModule.m30932N().argsToMomentsFeedPreviewAct(getContext(), coreMomentInfo.f56856id, 0, false, "ItemComment", message.f56859id));
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f31739d = z;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31737b = (VDraweeView) findViewById(edc0.f93422o1);
        this.f31738c = findViewById(edc0.f93396k3);
        VText vText = (VText) findViewById(edc0.f93168A4);
        this.f31736a = vText;
        vText.setBackgroundDrawable(null);
        this.f31740e = (ImageView) findViewById(edc0.f93394k1);
        this.f31741f = findViewById(edc0.f93316Z);
    }

    public ItemComment(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemComment(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
