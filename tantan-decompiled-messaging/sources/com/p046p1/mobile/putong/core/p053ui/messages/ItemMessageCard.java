package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.GaussianBlurParameters;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bkb0;
import p149l.knb0;
import p149l.qib0;
import p149l.vwb;
import p149l.xdl0;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMessageCard extends LinearLayout implements InterfaceC8519a, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VDraweeView f31154a;

    /* JADX INFO: renamed from: b */
    public VText f31155b;

    /* JADX INFO: renamed from: c */
    public Message f31156c;

    public ItemMessageCard(Context context) {
        super(context);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        Picture picture;
        this.f31156c = message;
        if (vwb.m200296J(message.media)) {
            picture = null;
        } else {
            Media media = message.media.get(0);
            if (media instanceof Picture) {
                picture = (Picture) media;
            } else {
                picture = null;
            }
        }
        boolean zM81303a = NullChecker.m81303a(picture);
        VDraweeView vDraweeView = this.f31154a;
        if (zM81303a) {
            xdl0.m208344M(vDraweeView, true);
            if (NullChecker.m81303a(picture.gaussianBlurParameters)) {
                GaussianBlurParameters gaussianBlurParameters = picture.gaussianBlurParameters;
                if (gaussianBlurParameters.iterations <= 0 || gaussianBlurParameters.blurRadius <= 0) {
                    qib0.f154691G.m102331L0(this.f31154a, picture.profileBig().formatted());
                } else {
                    bkb0 bkb0Var = qib0.f154691G;
                    VDraweeView vDraweeView2 = this.f31154a;
                    String str = picture.profileBig().formatted();
                    GaussianBlurParameters gaussianBlurParameters2 = picture.gaussianBlurParameters;
                    bkb0Var.m102336O(vDraweeView2, str, gaussianBlurParameters2.iterations, gaussianBlurParameters2.blurRadius);
                }
            } else {
                qib0.f154691G.m102331L0(this.f31154a, picture.profileBig().formatted());
            }
        } else {
            xdl0.m208344M(vDraweeView, false);
        }
        this.f31155b.setText(message.value);
        setOnClickListener(this);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m48394a(View view) {
        if (!NullChecker.m81303a(this.f31156c.additionalData) || vwb.m200298L(this.f31156c.additionalData.href)) {
            return;
        }
        Uri uri = Uri.parse(this.f31156c.additionalData.href);
        if (NullChecker.m81303a(uri) && NullChecker.m81303a(uri.getScheme()) && uri.getScheme().startsWith("tantan")) {
            CoreModule.m29935P().m94658i().mo158334Y(xdl0.m208326D(view.getContext()), uri);
        }
        m48395b(this.f31156c.additionalData.href);
    }

    /* JADX INFO: renamed from: b */
    public final void m48395b(String str) {
        str.getClass();
        if (str.equals("tantan://likers")) {
            if (CoreModule.m29935P().m94658i().mo33489e2()) {
                zvf0.m220399u("e_assistant_suggest_user_card", OMSDialogPositon.p_chat_view, vwb.m200311Y("lead_to", FirebaseAnalytics.Event.PURCHASE));
            } else {
                zvf0.m220399u("e_assistant_suggest_user_card", OMSDialogPositon.p_chat_view, vwb.m200311Y("lead_to", "see"));
            }
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m48394a(view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31154a = (VDraweeView) findViewById(y4c0.f196217s3);
        this.f31155b = (VText) findViewById(y4c0.f196078Y2);
    }

    public ItemMessageCard(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMessageCard(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
