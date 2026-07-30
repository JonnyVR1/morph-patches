package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.GaussianBlurParameters;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.edc0;
import p153l.fsb0;
import p153l.i4g0;
import p153l.jyb;
import p153l.ovb0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMessageCard extends LinearLayout implements InterfaceC8682a, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VDraweeView f32002a;

    /* JADX INFO: renamed from: b */
    public VText f32003b;

    /* JADX INFO: renamed from: c */
    public Message f32004c;

    public ItemMessageCard(Context context) {
        super(context);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        Picture picture;
        this.f32004c = message;
        if (jyb.m147479J(message.media)) {
            picture = null;
        } else {
            Media media = message.media.get(0);
            if (media instanceof Picture) {
                picture = (Picture) media;
            } else {
                picture = null;
            }
        }
        boolean zM82486a = NullChecker.m82486a(picture);
        VDraweeView vDraweeView = this.f32002a;
        if (zM82486a) {
            bnl0.m105524M(vDraweeView, true);
            if (NullChecker.m82486a(picture.gaussianBlurParameters)) {
                GaussianBlurParameters gaussianBlurParameters = picture.gaussianBlurParameters;
                if (gaussianBlurParameters.iterations <= 0 || gaussianBlurParameters.blurRadius <= 0) {
                    uqb0.f180374G.m127115L0(this.f32002a, picture.profileBig().formatted());
                } else {
                    fsb0 fsb0Var = uqb0.f180374G;
                    VDraweeView vDraweeView2 = this.f32002a;
                    String str = picture.profileBig().formatted();
                    GaussianBlurParameters gaussianBlurParameters2 = picture.gaussianBlurParameters;
                    fsb0Var.m127120O(vDraweeView2, str, gaussianBlurParameters2.iterations, gaussianBlurParameters2.blurRadius);
                }
            } else {
                uqb0.f180374G.m127115L0(this.f32002a, picture.profileBig().formatted());
            }
        } else {
            bnl0.m105524M(vDraweeView, false);
        }
        this.f32003b.setText(message.value);
        setOnClickListener(this);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m49577a(View view) {
        if (!NullChecker.m82486a(this.f32004c.additionalData) || jyb.m147481L(this.f32004c.additionalData.href)) {
            return;
        }
        Uri uri = Uri.parse(this.f32004c.additionalData.href);
        if (NullChecker.m82486a(uri) && NullChecker.m82486a(uri.getScheme()) && uri.getScheme().startsWith("tantan")) {
            CoreModule.m30933P().m143412i().mo180426Y(bnl0.m105506D(view.getContext()), uri);
        }
        m49578b(this.f32004c.additionalData.href);
    }

    /* JADX INFO: renamed from: b */
    public final void m49578b(String str) {
        str.getClass();
        if (str.equals("tantan://likers")) {
            if (CoreModule.m30933P().m143412i().mo34492e2()) {
                i4g0.m138523u("e_assistant_suggest_user_card", OMSDialogPositon.p_chat_view, jyb.m147494Y("lead_to", FirebaseAnalytics.Event.PURCHASE));
            } else {
                i4g0.m138523u("e_assistant_suggest_user_card", OMSDialogPositon.p_chat_view, jyb.m147494Y("lead_to", "see"));
            }
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m49577a(view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32002a = (VDraweeView) findViewById(edc0.f93452s3);
        this.f32003b = (VText) findViewById(edc0.f93313Y2);
    }

    public ItemMessageCard(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMessageCard(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
