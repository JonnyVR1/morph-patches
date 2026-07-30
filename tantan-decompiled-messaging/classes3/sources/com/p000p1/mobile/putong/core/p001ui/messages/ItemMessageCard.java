package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.GaussianBlurParameters;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.bkb0;
import l.j760;
import l.knb0;
import l.qib0;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemMessageCard extends LinearLayout implements InterfaceC0102a, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VDraweeView f1045a;

    /* JADX INFO: renamed from: b */
    public VText f1046b;

    /* JADX INFO: renamed from: c */
    public Message f1047c;

    public ItemMessageCard(Context context) {
        super(context);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        Picture picture;
        this.f1047c = message;
        if (vwb.J(message.media)) {
            picture = null;
        } else {
            Media media = (Media) message.media.get(0);
            if (media instanceof Picture) {
                picture = (Picture) media;
            } else {
                picture = null;
            }
        }
        boolean zA = NullChecker.a(picture);
        SimpleDraweeView simpleDraweeView = this.f1045a;
        if (zA) {
            xdl0.M(simpleDraweeView, true);
            if (NullChecker.a(picture.gaussianBlurParameters)) {
                GaussianBlurParameters gaussianBlurParameters = picture.gaussianBlurParameters;
                if (gaussianBlurParameters.iterations <= 0 || gaussianBlurParameters.blurRadius <= 0) {
                    qib0.G.L0(this.f1045a, picture.profileBig().formatted());
                } else {
                    bkb0 bkb0Var = qib0.G;
                    VDraweeView vDraweeView = this.f1045a;
                    String str = picture.profileBig().formatted();
                    GaussianBlurParameters gaussianBlurParameters2 = picture.gaussianBlurParameters;
                    bkb0Var.O(vDraweeView, str, gaussianBlurParameters2.iterations, gaussianBlurParameters2.blurRadius);
                }
            } else {
                qib0.G.L0(this.f1045a, picture.profileBig().formatted());
            }
        } else {
            xdl0.M(simpleDraweeView, false);
        }
        this.f1046b.setText(message.value);
        setOnClickListener(this);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m1478a(View view) {
        if (!NullChecker.a(this.f1047c.additionalData) || vwb.L(this.f1047c.additionalData.href)) {
            return;
        }
        Uri uri = Uri.parse(this.f1047c.additionalData.href);
        if (NullChecker.a(uri) && NullChecker.a(uri.getScheme()) && uri.getScheme().startsWith("tantan")) {
            CoreModule.P().i().Y(xdl0.D(view.getContext()), uri);
        }
        m1479b(this.f1047c.additionalData.href);
    }

    /* JADX INFO: renamed from: b */
    public final void m1479b(String str) {
        str.getClass();
        if (str.equals("tantan://likers")) {
            if (CoreModule.P().i().e2()) {
                zvf0.u("e_assistant_suggest_user_card", "p_chat_view", new j760[]{vwb.Y("lead_to", "purchase")});
            } else {
                zvf0.u("e_assistant_suggest_user_card", "p_chat_view", new j760[]{vwb.Y("lead_to", "see")});
            }
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m1478a(view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1045a = (VDraweeView) findViewById(y4c0.s3);
        this.f1046b = (VText) findViewById(y4c0.Y2);
    }

    public ItemMessageCard(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMessageCard(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
