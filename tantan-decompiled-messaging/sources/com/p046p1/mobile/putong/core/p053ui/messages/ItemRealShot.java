package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.google.firebase.messaging.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.c3c0;
import p149l.ftd0;
import p149l.j760;
import p149l.knb0;
import p149l.qib0;
import p149l.t100;
import p149l.ura;
import p149l.xdl0;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemRealShot extends ConstraintLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: d */
    public VDraweeView f31440d;

    /* JADX INFO: renamed from: e */
    public Message f31441e;

    /* JADX INFO: renamed from: f */
    public Shape f31442f;

    /* JADX INFO: renamed from: g */
    public VText f31443g;

    /* JADX INFO: renamed from: h */
    public ImageView f31444h;

    /* JADX INFO: renamed from: i */
    public int f31445i;

    public enum Shape {
        LEFT,
        RIGHT
    }

    public ItemRealShot(Context context) {
        super(context);
        this.f31445i = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m48623l0(View view) {
        List<Media> list;
        Message message = this.f31441e;
        if (message == null || (list = message.media) == null) {
            return;
        }
        Media media = list.get(0);
        if (NullChecker.m81303a(media) && NullChecker.m81303a(media.url)) {
            CoreModule.m29935P().m94658i().mo158252J4((Act) getContext(), this.f31441e, media);
            zvf0.m220399u("e_camera_chat_message", OMSDialogPositon.p_chat_view, new j760("sender_user_id", this.f31441e.owner), new j760(Constants.MessagePayloadKeys.MSGID_SERVER, this.f31441e.f56011id));
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        this.f31441e = message;
        if (message.media == null) {
            return;
        }
        zvf0.m220368A("e_camera_chat_message", OMSDialogPositon.p_chat_view, new j760("sender_user_id", message.owner), new j760(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56011id));
        this.f31443g.setText(TextUtils.isEmpty(message.value.trim()) ? getResources().getString(R$string.f20841Q4) : message.value.trim());
        m48626m0(this.f31442f, this.f31440d);
        Media media = message.media.get(0);
        if (!TEnum.equals(media.status, "raw") || ((media instanceof Video) && NullChecker.m81303a(((Video) media).cover.url))) {
            qib0.f154691G.m102343R0(this.f31440d, media.cover().calculatedWidth(getWidth()), "chat");
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public void m48624j0(int i, boolean z) {
        this.f31442f = z ? Shape.RIGHT : Shape.LEFT;
        this.f31440d = (VDraweeView) findViewById(y4c0.f196084Z2);
        this.f31443g = (VText) findViewById(y4c0.f195971G3);
        this.f31444h = (ImageView) findViewById(y4c0.f195967G);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31444h.setImageResource(c3c0.f78623R2);
        }
        this.f31440d.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.cdq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f80400a.m48625k0(view);
            }
        });
        xdl0.m208329E0(this.f31440d, new View.OnClickListener() { // from class: l.ddq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85623a.m48623l0(view);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ boolean m48625k0(View view) {
        this.f31445i = 0;
        ItemMessageBase.m48311R(this).onLongClick(this.f31440d);
        this.f31445i = -1;
        return true;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
        m48624j0(i + 1, z);
    }

    /* JADX INFO: renamed from: m0 */
    public void m48626m0(Shape shape, VDraweeView vDraweeView) {
        int i = t100.f167260i;
        RoundingParams roundingParamsM8248b = RoundingParams.m8248b(i, i, i, i);
        if (vDraweeView.getHierarchy() == null) {
            vDraweeView.setHierarchy(qib0.f154691G.m184722l().m116872a());
        }
        vDraweeView.getHierarchy().m112053H(roundingParamsM8248b);
        vDraweeView.getHierarchy().m112078y(0);
        vDraweeView.getHierarchy().m112051F(getContext().getResources().getDrawable(this.f31441e.isMe() ? c3c0.f78891w0 : c3c0.f78882v0), ftd0.f99183g);
    }

    public ItemRealShot(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31445i = -1;
    }

    public ItemRealShot(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31445i = -1;
    }
}
